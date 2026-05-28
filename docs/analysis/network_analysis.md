# Network Communication Analysis

## Network Security Configuration
**File**: `res/xml/network_security_config.xml`

```xml
<network-security-config>
    <domain-config cleartextTrafficPermitted="true">
        <domain includeSubdomains="true">commondatastorage.googleapis.com</domain>
    </domain-config>
    <base-config cleartextTrafficPermitted="false">
        <trust-anchors>
            <certificates src="system" />
        </trust-anchors>
    </base-config>
</network-security-config>
```

### Analysis:
- **Base config**: Cleartext traffic is **NOT** permitted (good)
- **Exception**: `commondatastorage.googleapis.com` allows cleartext (HTTP) traffic
- **Trust anchors**: Only system certificates are trusted (no custom CA injection)
- **Manifest**: `android:usesCleartextTraffic="true"` overrides the base-config in some API levels

## API Endpoints & URLs

### App-Specific Endpoints

| URL | File | Purpose |
|-----|------|---------|
| `https://audio-cdn.tarteel.ai/quran/{reciter}/{surah}{aya}.mp3` | EngineActivity.java:4556 | Quran audio from Tarteel AI CDN |
| `https://everyayah.com/data/{reciter}/{surah}{aya}.mp3` | EngineActivity.java:4558 | Quran audio from EveryAyah |
| `https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ` | SeettingActivity.java:221 | WhatsApp support group |
| `https://chat.whatsapp.com/DDdUegENpg83easzYDba2K?mode=wwt` | AboutActivity.java:78 | WhatsApp community group |
| `https://play.google.com/store/apps/dev?id=8943620497392395895` | SeettingActivity.java:257 | Developer page on Play Store |
| `https://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran` | SeettingActivity.java:301 | App Play Store listing |
| `https://www.instagram.com/nurmontage.app/` | SeettingActivity.java:314 | Instagram page |
| `https://www.youtube.com/@NurMontageApp/` | SeettingActivity.java:329 | YouTube channel |
| `https://www.tiktok.com/@nurmontagesupport` | SeettingActivity.java:340 | TikTok account |
| `https://youtu.be/3xtsWfMQ5KM` | ProVersionActivityLast.java:345 | YouTube tutorial video |
| `http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio` | AdsTuffahActivity.java:244 | Cross-promotion (sister app) |

### Google Play Licensing (PairIP)
| URL/Service | Purpose |
|-------------|---------|
| `com.android.vending.licensing.ILicensingService` | Google Play license verification via IPC |
| `com.android.vending` | Package binding for license check |

### Google Services (Library-level)
| URL | Purpose |
|-----|---------|
| `https://www.googleapis.com/auth/appstate` | Google API scope |
| `https://www.googleapis.com/auth/datastoremobile` | Google API scope |
| `https://www.googleapis.com/auth/drive.appdata` | Google Drive scope |
| `https://www.googleapis.com/auth/drive.apps` | Google Drive scope |
| `https://www.googleapis.com/auth/drive.file` | Google Drive scope |
| `https://www.googleapis.com/auth/drive` | Google Drive scope |
| `https://www.googleapis.com/auth/games` | Google Games scope |
| `https://www.googleapis.com/auth/games_lite` | Google Games scope |
| `https://www.googleapis.com/auth/userinfo.email` | User info scope |
| `https://www.googleapis.com/auth/userinfo.profile` | User info scope |
| `https://plus.google.com/` | Google Plus (deprecated) |
| `https://www.youtube.com` | YouTube player embed |

### DRM/Licensing
| URL | Purpose |
|-----|---------|
| `http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense` | Widevine DRM license acquisition |
| `https://default.url` | Default DRM license URL placeholder |
| `https://x` | DRM placeholder URL |

### Cleartext Traffic Domains
| Domain | Reason |
|--------|--------|
| `commondatastorage.googleapis.com` | Firebase/Google Cloud Storage - audio file downloads |

## WebSocket Connections
- **None found** in the decompiled source code

## Network Observations
1. The app has **no backend API server** of its own
2. Audio content is fetched from third-party CDNs (Tarteel AI, EveryAyah)
3. No user data is transmitted to any server (beyond Google Play billing and Firebase transport)
4. The `commondatastorage.googleapis.com` cleartext exception suggests audio downloads might occur over HTTP
5. Google Data Transport (CCT backend) is included for analytics/crash reporting
