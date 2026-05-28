# 🔬 NurMontage - Reverse Engineering Project

[![License](https://img.shields.io/badge/License-Research%20Only-red.svg)]()
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)]()
[![Language](https://img.shields.io/badge/Language-Java%20%2B%20Kotlin-orange.svg)]()

> **⚠️ Disclaimer**: This project is for educational and security research purposes only. All rights to the original app belong to the developer (Hazem Ourari). This repository does not distribute the original APK or any paid features.

## 📱 App Information

| Property | Value |
|----------|-------|
| **App Name** | NurMontage: Quran Video Maker |
| **Package** | `hazem.nurmontage.videoquran` |
| **Version** | 6.7.1-nurmontage4kb (21000106) |
| **Target SDK** | 35 (Android 15) |
| **Min SDK** | 21 (Android 5.0) |
| **APK Size** | 43 MB |
| **Developer** | Hazem Ourari |
| **Category** | Video Players & Editors |
| **Description** | Islamic video editor for creating Quran reels, shorts & full HD videos |

## 🏗️ Project Structure

```
project-source/
├── app/
│   └── src/main/
│       ├── java/hazem/nurmontage/videoquran/
│       │   ├── *.java                          # Main Activities (22)
│       │   ├── Utils/                          # Utility Classes (57)
│       │   ├── adabter/                        # RecyclerView Adapters (24)
│       │   ├── model/                          # Data Models (33)
│       │   ├── fragment/                       # UI Fragments (28)
│       │   │   └── audio_effect/              # Audio Effect Fragments
│       │   ├── entity_timeline/               # Timeline Entities (5)
│       │   ├── views/                          # Custom Views (28)
│       │   ├── constant/                       # Constants & Enums (7)
│       │   ├── common/                         # Common Utilities (3)
│       │   ├── multitouch/                     # Multi-touch Handlers
│       │   └── databinding/                    # View Binding Classes (80+)
│       ├── res/                                # Android Resources (1172 files)
│       ├── assets/                             # App Assets (Fonts, Quran Data)
│       └── AndroidManifest.xml
├── smali-reference/                            # Original Smali Bytecode
│   ├── smali/                                  # DEX classes.dex
│   ├── smali_classes2/                         # DEX classes2.dex
│   └── smali_classes3/                         # DEX classes3.dex
├── third-party-libs/                           # Decompiled Library Sources
├── docs/
│   └── analysis/                               # Security Analysis Reports
│       ├── secrets_scan.json                   # API Keys & Secrets
│       ├── pairip_analysis.md                  # License Check Analysis
│       ├── billing_analysis.md                 # Subscription System
│       ├── network_analysis.md                 # Network Communication
│       ├── assets_analysis.md                  # Asset Files
│       ├── dependencies_analysis.md            # Third-party Libraries
│       └── security_report.md                  # Vulnerability Report
└── README.md
```

## 🛠️ Tools Used

| Tool | Version | Purpose |
|------|---------|---------|
| **Apktool** | 2.10.0 | Resource & Smali Decompilation |
| **JADX** | 1.5.1 | Java Source Code Recovery |
| **Androguard** | 3.4.0a1 | APK Security Analysis |
| **Quark-Engine** | 26.5.1 | Malware Behavior Detection |
| **LIEF** | 0.17.6 | Binary Analysis Framework |
| **ripgrep** | Latest | Pattern/Secret Scanning |

## 📋 Key Activities (22)

| Activity | Purpose |
|----------|---------|
| `FullscreenActivity` | App Launcher / Splash |
| `EngineActivity` | Main Video Editor Engine |
| `ProVersionActivityDone` | Subscription Purchase |
| `SupportBillingActivity` | Donation Support |
| `VideoViewActivity` | Video Playback & Sharing |
| `VideoPlayerActivity` | Full Video Player |
| `ProgressViewActivity` | Export Progress |
| `WorkUserActivity` | User Projects Gallery |
| `QuranSearchActivity` | Quran Verse Search |
| `SeettingActivity` | App Settings |
| `ShareWithMeActivity` | Import Media (Intent Filter) |
| `AboutActivity` | App Info & Help |
| `GalleryPickerVideo` | Video Gallery Picker |
| `GalleryPickerOneImage` | Image Gallery Picker |
| `CropBitmapActivity` | Image Cropping |
| `TextEditActivity` | Text Editing |
| `AddReaderNameActivity` | Quran Reader Selection |
| `ChoiceBgFromVideoActivity` | Background Selection |
| `ChoiceLangActivity` | Language Selection |
| `YoutuberActivity` | YouTube Integration |
| `AdsTuffahActivity` | Cross-promotion |
| `ProVersionActivity` | Premium Features |

## 🔐 Subscription System (Billing SKUs)

| SKU ID | Type | Description |
|--------|------|-------------|
| `sku.nurmontage.foreiver` | inapp | Lifetime Premium |
| `sku.nurmontage.year` | subs | Yearly Subscription |
| `sku.nurmontage.month` | subs | Monthly Subscription |
| `sku.nurmontage.min` | inapp | Support $10 |
| `sku.nurmontage.medium` | inapp | Support $50 |
| `sku.nurmontage.mmedium` | inapp | Support $100 |
| `sku.nurmontage.max` | inapp | Support $1000 |

## 📦 Key Dependencies (35+)

- **FFmpeg Kit** — Video/Audio encoding & processing
- **ExoPlayer (Media3)** — Video playback with DRM
- **Glide** — Image loading & caching
- **YouTube Player** — YouTube video embedding
- **Konfetti** — Confetti celebration animations
- **Google Play Billing 7.1.1** — In-app purchases
- **PairIP License Check** — Google Play licensing
- **Gson** — JSON serialization
- **Guava** — Google utilities
- **Kotlin Coroutines** — Async operations
- **AndroidX** — Modern Android libraries

## 🔒 Security Findings Summary

| # | Finding | Severity |
|---|---------|----------|
| 1 | Local-only subscription validation (SharedPreferences) | CRITICAL |
| 2 | `usesCleartextTraffic="true"` in manifest | HIGH |
| 3 | Backup enabled — BillingPrefs extractable via ADB | HIGH |
| 4 | No code obfuscation for app classes | HIGH |
| 5 | Client-side-only license enforcement | MEDIUM |
| 6 | No certificate pinning | MEDIUM |
| 7 | Cleartext HTTP for Google Storage | MEDIUM |
| 8 | Hardcoded RSA public key | LOW-MEDIUM |
| 9 | AD_ID permission declared | LOW |

## 🌐 Network Endpoints

- `https://audio-cdn.tarteel.ai/quran/` — Quran audio CDN
- `https://everyayah.com/data/` — Quran audio fallback
- `https://commondatastorage.googleapis.com` — Google Cloud Storage (HTTP allowed)
- `https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ` — Developer WhatsApp support

## 📧 Contact Points

- `nurmontage.contact@gmail.com` — App support
- `hazemourari08@gmail.com` — Developer personal

## 📊 Statistics

- **325** Java source files recovered
- **57** Utility classes
- **28** Custom Views
- **24** RecyclerView Adapters
- **33** Data Models
- **28** Fragments
- **7** Billing SKU products
- **14** Android permissions
- **73** Fonts (52 Arabic calligraphy)
- **10** Quran translation files (10 languages)
- **1172** Resource files
- **3** DEX files

## 📝 App Architecture

The app follows a standard Android architecture:
- **Activities** → Screen controllers with ViewBinding
- **Fragments** → Reusable UI components (BottomSheet dialogs)
- **Adapters** → RecyclerView data binding
- **Models** → Plain data classes for entities
- **Utils** → Static helper methods (FFmpeg, Billing, File I/O, Waveform)
- **Views** → Custom UI components (WaveformView, CassetteView, CropView)
- **Entity Timeline** → Video editing timeline data structures
- **Common** → Shared state (Common singleton, StackEntity)

Video rendering pipeline:
1. User creates timeline with entities (Quran text, audio, images, video)
2. `EngineActivity` manages the timeline editing
3. `ProgressViewActivity` handles FFmpeg export
4. Output saved to device storage with optional watermark

---
*Generated for security research purposes only.*
