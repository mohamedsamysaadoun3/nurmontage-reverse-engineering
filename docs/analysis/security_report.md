# Security Vulnerabilities Report

## App Information
- **Package**: `hazem.nurmontage.videoquran`
- **Version**: 6.7.1-nurmontage4kb
- **Target SDK**: 35 (Android 15)
- **Min SDK**: 24 (Android 7.0)

---

## CRITICAL Findings

### 1. Local-Only Subscription Validation (CRITICAL)
- **Severity**: CRITICAL
- **File**: `hazem/nurmontage/videoquran/Utils/BillingPreferences.java`
- **Description**: The subscription status (`isSubscribed`) is stored solely in SharedPreferences (`BillingPrefs`) with no server-side verification. The app never sends purchase tokens to a backend for validation.
- **Impact**: Subscription can be bypassed by:
  - Modifying SharedPreferences (root access or editor app)
  - Patching `isSubscribed()` to return `true` in smali
  - Using a Frida/Xposed hook to override the return value
- **CVSS Estimate**: 8.1 (High)
- **Evidence**:
  ```java
  public static boolean isSubscribed(Context context) {
      return context.getSharedPreferences("BillingPrefs", 0)
          .getBoolean("isSubscribed", false);
  }
  ```
- **Remediation**: Implement server-side receipt validation using Google Play Developer API. Send purchase tokens to a backend server and verify subscription status from the server.

### 2. usesCleartextTraffic Enabled (HIGH)
- **Severity**: HIGH
- **File**: `AndroidManifest.xml` line 35
- **Description**: `android:usesCleartextTraffic="true"` is set in the manifest, allowing HTTP (non-HTTPS) network traffic globally.
- **Impact**: Enables man-in-the-middle attacks on network communications, potentially exposing user data or allowing content injection.
- **CVSS Estimate**: 7.5 (High)
- **Evidence**:
  ```xml
  android:usesCleartextTraffic="true"
  ```
- **Mitigating Factor**: The `network_security_config.xml` sets `cleartextTrafficPermitted="false"` as base config, with an exception only for `commondatastorage.googleapis.com`. However, the manifest-level flag may override this on some API levels.
- **Remediation**: Remove `android:usesCleartextTraffic="true"` and rely on the more granular `network_security_config.xml`.

### 3. Cleartext Traffic Allowed for Google Storage (MEDIUM)
- **Severity**: MEDIUM
- **File**: `res/xml/network_security_config.xml`
- **Description**: `commondatastorage.googleapis.com` is explicitly allowed to use cleartext (HTTP) traffic with subdomain inclusion.
- **Impact**: Audio file downloads from this domain could be intercepted and replaced in a MITM attack.
- **CVSS Estimate**: 5.3 (Medium)
- **Remediation**: Use HTTPS for all Google Cloud Storage URLs.

---

## HIGH Findings

### 4. Backup Enabled (HIGH)
- **Severity**: HIGH
- **File**: `AndroidManifest.xml` line 35
- **Description**: `android:allowBackup="true"` is set, allowing app data to be backed up via ADB or Google Backup.
- **Impact**: The `BillingPrefs` SharedPreferences containing `isSubscribed` can be extracted via `adb backup`, modified, and restored. This provides a non-root method to bypass subscription checks.
- **CVSS Estimate**: 6.5 (Medium-High)
- **Evidence**:
  ```xml
  android:allowBackup="true"
  android:fullBackupContent="@xml/backup_rules"
  ```
- **Mitigating Factor**: `backup_rules.xml` is empty (`<full-backup-content />`) which should exclude everything. However, `data_extraction_rules.xml` includes `<cloud-backup />` which may still allow Google cloud backup.
- **Remediation**: Set `android:allowBackup="false"` and explicitly exclude `BillingPrefs` from any backup.

### 5. No Obfuscation for App Code (HIGH)
- **Severity**: HIGH
- **Description**: The app's own code (`hazem.nurmontage.videoquran.*`) is NOT obfuscated. Class names, method names, and field names are fully readable.
- **Impact**: Makes reverse engineering, patching, and bypassing trivially easy. An attacker can locate `BillingPreferences.isSubscribed()` and patch it in minutes.
- **Evidence**: Class names like `BillingPreferences`, `ProVersionActivity`, `isSubscribed`, `saveSubscriptionStatus` are all human-readable.
- **Remediation**: Enable ProGuard/R8 with aggressive obfuscation rules for app code.

---

## MEDIUM Findings

### 6. PairIP License Check is Client-Side Only (MEDIUM)
- **Severity**: MEDIUM
- **Files**: `com/pairip/licensecheck/LicenseClient.java`, `LicenseResponseHelper.java`
- **Description**: While the license check does verify RSA-SHA256 signatures from Google Play, the enforcement is entirely client-side. The check can be bypassed by:
  - Removing the `LicenseContentProvider` from AndroidManifest.xml
  - Patching `licenseCheckState` to `FULL_CHECK_OK` in smali
  - Patching `localCheckEnabled` to `false`
- **Mitigating Factor**: The RSA signature verification means you can't just feed it fake data; you have to bypass the entire check.
- **Remediation**: Add integrity checks that are harder to patch, such as multiple redundant checks spread across the codebase.

### 7. No Certificate Pinning (MEDIUM)
- **Severity**: MEDIUM
- **Description**: The app does not implement SSL/TLS certificate pinning for any of its network connections.
- **Impact**: MITM attacks on HTTPS connections are possible if a trusted CA is compromised or the device has a malicious CA installed.
- **Remediation**: Implement certificate pinning for critical endpoints (especially Tarteel AI and EveryAyah).

### 8. Hardcoded RSA Public Key (LOW-MEDIUM)
- **Severity**: LOW-MEDIUM
- **File**: `com/pairip/licensecheck/LicenseClient.java` line 51
- **Description**: The license verification RSA public key is hardcoded as a string constant.
- **Impact**: While not directly exploitable (you can't forge signatures without the private key), it makes it easier to locate and patch the license verification code.
- **Remediation**: Obfuscate the key or derive it at runtime.

---

## LOW Findings

### 9. AD_ID Permission (LOW)
- **Severity**: LOW
- **File**: `AndroidManifest.xml` line 12
- **Description**: `com.google.android.gms.permission.AD_ID` is declared, allowing advertising ID access.
- **Impact**: Minor privacy concern; the app can access the user's advertising ID for tracking.

### 10. Legacy External Storage Access (LOW)
- **Severity**: LOW
- **File**: `AndroidManifest.xml`
- **Description**: The app requests `READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE` (maxSdkVersion=32), `READ_MEDIA_VIDEO`, `READ_MEDIA_IMAGES`, `READ_MEDIA_AUDIO`, and `READ_MEDIA_VISUAL_USER_SELECTED`.
- **Impact**: Broad media access permissions; `requestLegacyExternalStorage="true"` and `preserveLegacyExternalStorage="true"` suggest old storage patterns.
- **Remediation**: Migrate to scoped storage APIs and remove legacy flags.

### 11. TikTok App Package in Queries (INFO)
- **Severity**: INFO
- **File**: `AndroidManifest.xml` line 22
- **Description**: `com.zhiliaoapp.musically` (TikTok's internal package name) is in the queries section.
- **Impact**: The app can detect if TikTok is installed; likely for sharing functionality.

### 12. Cross-Promotion to Sister App (INFO)
- **Severity**: INFO
- **Description**: The app promotes `hazem.tuffah.quranaudio` (another app by the same developer).
- **Evidence**: `http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio`

---

## Summary Table

| # | Finding | Severity | Exploitability |
|---|---------|----------|---------------|
| 1 | Local-only subscription validation | CRITICAL | Easy (SharedPreferences edit) |
| 2 | usesCleartextTraffic enabled | HIGH | Network-dependent |
| 3 | Cleartext for Google Storage | MEDIUM | Network-dependent |
| 4 | Backup enabled (BillingPrefs extractable) | HIGH | Easy (ADB backup) |
| 5 | No code obfuscation | HIGH | Trivial |
| 6 | Client-side license enforcement | MEDIUM | Moderate (smali patching) |
| 7 | No certificate pinning | MEDIUM | Network-dependent |
| 8 | Hardcoded RSA public key | LOW-MEDIUM | Not directly exploitable |
| 9 | AD_ID permission | LOW | Privacy concern only |
| 10 | Legacy storage access | LOW | Standard Android migration |
| 11 | TikTok package in queries | INFO | No impact |
| 12 | Cross-promotion | INFO | No impact |

## Overall Security Rating: **POOR**

The app has significant security weaknesses, primarily around subscription validation being entirely local with no server-side verification. Combined with no code obfuscation, backup being enabled, and cleartext traffic being permitted, the app is highly vulnerable to subscription bypass attacks.
