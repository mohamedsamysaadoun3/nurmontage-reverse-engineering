# PairIP License Check Analysis

## Overview
The app integrates **PairIP License Check** (`com.pairip.licensecheck`), a Google Play licensing verification system that ensures the app was installed from Google Play Store.

## Components

### 1. LicenseContentProvider
- **File**: `com/pairip/licensecheck/LicenseContentProvider.java`
- **Purpose**: Entry point - registered as a ContentProvider in AndroidManifest.xml
- **Authority**: `hazem.nurmontage.videoquran.com.pairip.licensecheck.LicenseContentProvider`
- **Exported**: `false` (not accessible to other apps)
- **Behavior**: On `onCreate()`, instantiates `LicenseClient` and calls `initializeLicenseCheck()`

### 2. LicenseClient
- **File**: `com/pairip/licensecheck/LicenseClient.java`
- **Key Constants**:
  - `LICENSED = 0` (response code for licensed)
  - `NOT_LICENSED = 2` (response code for not licensed)
  - `ERROR_INVALID_PACKAGE_NAME = 3`
  - `MAX_RETRIES = 3`
  - `RETRY_DELAY_MILLIS = 1000`
  - `REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000` (5 minutes)

- **Hardcoded Values**:
  - `licensePubKey`: RSA-2048 public key for signature verification:
    ```
    MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmtXnKGL2+e5plvomGzHDXkg4eG5T4zJJUtYuaVSG3/zc+DdzXyoCCAVu2zWSflhSPX9nAXXEFlxEbmr+o6wgo9AnqPrXjQnakWPQEg4zMGSuFGpzOtEICygTvZUHj9pnRsnZCDpvqbF4F6iOjKTr2ZBW+7G+/UJ2hFs72vZ3G39aVUUyG9RyKMrlZOaaHzd8YWHnj969pVLVXgfUbie7AHr8BlS3vdoaaSPcTHq1u9UNJLcu/DWuujqU0XbQDsIR3ah+WhUDpVGJi3A7Kv2bSp6bnmn9uoh7J+zBtTgVZmZ08INflhOp7iaoCuYns5aZe6V13foB8QEM3eBly9SdJQIDAQAB
    ```
  - `packageName = "hazem.nurmontage.videoquran"`
  - `localCheckEnabled = true`
  - `repeatedCheckEnabled = true`
  - `gracefulShutdownEnabled = true`
  - `eventualShutdownEnabled = false`

### 3. License Flow

#### Step 1: Local Installer Check
- Checks if the app was installed from Google Play (`com.android.vending`)
- Only runs on API 30+ (Android 11+)
- Uses `PackageManager.getInstallSourceInfo()` to verify installer
- System apps automatically pass
- If local check passes → state = `LOCAL_CHECK_OK`

#### Step 2: Remote License Verification
- Connects to `com.android.vending.licensing.ILicensingService` via IPC
- Sends V2 license check request (transaction code 2)
- Uses `ILicenseV2ResultListener` callback for async response

#### Step 3: Response Validation (LicenseResponseHelper)
- Parses JWS (JSON Web Signature) response: 3 parts (header.payload.signature)
- Verifies algorithm is RS256
- Verifies RSA-SHA256 signature against hardcoded public key
- Validates package name matches `hazem.nurmontage.videoquran`

#### Step 4: Repeated Check
- If `repeatedCheckEnabled`, schedules periodic re-checks
- Uses `RepeatedCheckMetadata` (durationToRetryMillis, timeToRetryMillis)
- Maximum retry interval capped at 300000ms (5 minutes)

### 4. Failure Handling
- **NOT_LICENSED (responseCode 2)**: Shows Paywall activity → closes app
- **Error**: Shows error dialog → closes app  
- **App in background on failure**: Calls `System.exit(0)` immediately
- **Graceful shutdown**: Closes all tasks then exits
- **Eventual shutdown**: 30-second delayed `System.exit(0)` as failsafe

### 5. LicenseActivity
- Shows either a **Paywall** (if not licensed) or **Error Dialog**
- Error message: "Check that Google Play is enabled on your device..."
- Forces app closure after user acknowledges

### 6. Obfuscated Component
- `jqvwamawqmuplwsjlwvmampbbvyll.java` - contains 5 integer constants (likely integrity check values)
- Package name is obfuscated: `p005mp.gixxnnkododkkotnxgeiezc`

## Bypass Analysis

### Potential Bypass Vectors:
1. **SharedPreferences modification**: The license check state is maintained in memory only (static field), not in SharedPreferences, making it harder to tamper with persistently.

2. **Smali patching**: The `localCheckEnabled` and `repeatedCheckEnabled` static booleans could be patched in the smali to `false`, and `licenseCheckState` could be forced to `FULL_CHECK_OK`.

3. **Removing ContentProvider**: The `LicenseContentProvider` declaration in AndroidManifest.xml could be removed to prevent the check from ever starting.

4. **Patching processResponse**: The `processResponse()` method could be patched to always treat the response as `LICENSED` (responseCode 0).

5. **The local installer check** only works on API 30+ and only checks if installed from Play Store - sideloaded APKs on older devices bypass it.

### Difficulty: **MODERATE**
The license check uses proper cryptographic verification (RSA-SHA256 signatures from Google Play servers), but the enforcement is entirely client-side. A determined attacker with smali patching knowledge can bypass it.
