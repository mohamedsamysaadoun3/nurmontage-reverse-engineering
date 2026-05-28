# Subscription/Billing Deep Analysis

## Overview
NurMontage uses Google Play Billing Library (v7.1.1) for in-app purchases and subscriptions. The billing state is stored locally in SharedPreferences with **no server-side validation**.

## Product SKUs

### Subscription Products (recurring):
| SKU ID | Type | Description |
|--------|------|-------------|
| `sku.nurmontage.month` | subs | Monthly subscription |
| `sku.nurmontage.year` | subs | Yearly subscription |

### One-Time Purchase Products (inapp):
| SKU ID | Type | Description |
|--------|------|-------------|
| `sku.nurmontage.foreiver` | inapp | Lifetime/forever purchase |
| `sku.nurmontage.min` | inapp | Support donation ($10 tier) |
| `sku.nurmontage.medium` | inapp | Support donation ($50 tier) |
| `sku.nurmontage.mmedium` | inapp | Support donation ($100 tier) |
| `sku.nurmontage.max` | inapp | Support donation ($1000 tier) |

## Billing Architecture

### BillingPreferences (CRITICAL - Local Storage)
- **File**: `hazem/nurmontage/videoquran/Utils/BillingPreferences.java`
- **SharedPreferences name**: `"BillingPrefs"`
- **Key**: `"isSubscribed"` (boolean)
- **Default value**: `false`

```java
public static void saveSubscriptionStatus(Context context, boolean z) {
    SharedPreferences.Editor edit = context.getSharedPreferences(PREF_NAME, 0).edit();
    edit.putBoolean(KEY_IS_SUBSCRIBED, z);
    edit.apply();
}

public static boolean isSubscribed(Context context) {
    return context.getSharedPreferences(PREF_NAME, 0).getBoolean(KEY_IS_SUBSCRIBED, false);
}
```

### Subscription Check Flow

1. **ProVersionActivity** (and ProVersionActivityLast):
   - On create: checks `BillingPreferences.isSubscribed()` → if true, shows "thanks" screen
   - If not subscribed: connects to BillingClient and checks real Google Play purchases
   - `checkUserSubscriptionStatus()` queries subs → if active, saves `isSubscribed = true`
   - Then checks inapp purchases for `sku.nurmontage.foreiver` → if owned, saves `isSubscribed = true`

2. **Feature gating across the app** (18+ locations):
   - `EngineActivity`: BlurredImageView watermark based on subscription
   - `ChangeBgFragment`: Background selection locked
   - `EffectAyaFragment`: Transition effects locked
   - `GradientFragment`: Gradient colors locked
   - `EditIpadFragment`: iPad frames locked
   - `CropBitmapActivity`: Crop feature locked
   - `SeettingActivity`: Settings locked
   - `WorkUserActivity`: Work features locked

## Bypass Analysis

### CRITICAL VULNERABILITY: Local-Only Subscription Validation

The subscription status is **entirely stored in SharedPreferences** with no server-side verification. This is the weakest point.

### Bypass Methods:

#### Method 1: SharedPreferences Modification (EASIEST)
- Root the device or use a SharedPreferences editor
- Set `BillingPrefs` → `isSubscribed = true`
- **Effect**: All 18+ feature checks will return `true`
- **Persistence**: Survives app restarts
- **Detection**: None - no server-side revalidation

#### Method 2: Smali Patching (MODERATE)
- Patch `BillingPreferences.isSubscribed()` to always return `true`
- In smali, change the method to:
  ```smali
  .method public static isSubscribed(Landroid/content/Context;)Z
      .registers 2
      const/4 v0, 0x1
      return v0
  .end method
  ```
- **Effect**: All subscription checks bypassed
- **Persistence**: Survives app restarts

#### Method 3: BillingClient Interception (HARDER)
- Patch the `handlePurchase` methods in ProVersionActivity/ProVersionActivityLast
- Force `BillingPreferences.saveSubscriptionStatus(context, true)` to always be called
- Would require more targeted smali edits

#### Method 4: Billing Test Companion (EASY)
- The app declares `<intent>` for `com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND` in queries
- Using Google Play's Billing Test Companion, test purchases can be simulated

### Why This Is Weak:
1. **No server-side receipt validation**: The app never sends purchase tokens to a backend server
2. **No signature verification on local state**: SharedPreferences can be freely modified
3. **Single boolean check**: One `isSubscribed` flag controls everything
4. **No periodic revalidation**: Once `isSubscribed = true`, it stays true even if the subscription lapses
5. **No obfuscation of billing logic**: Class and method names are clear (not ProGuard'd for the app's own code)

### SupportBillingActivity (Donation)
- Uses consumable in-app products (sku.nurmontage.min/medium/mmedium/max)
- Purchases are consumed after acknowledgment (no persistent ownership check)
- This is a separate flow from the subscription system and does NOT affect `isSubscribed`
