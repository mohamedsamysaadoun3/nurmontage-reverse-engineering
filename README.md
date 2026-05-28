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
├── advanced-analysis/                          # Cross-Reference Decompilation
│   ├── cfr-output/                             # CFR 0.152 decompiled sources (917 files)
│   ├── procyon-output/                         # Procyon 0.6.0 decompiled sources (936 files)
│   ├── jphantom-stubs/                         # JPhantom 1.3 class stubs (957 stubs)
│   └── renaming-report.md                      # Variable renaming audit log
├── tools/                                      # Tool references (JARs not included)
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

### Primary Analysis Pipeline

| Tool | Version | Purpose |
|------|---------|---------|
| **JADX** | 1.5.1 | Primary DEX decompiler (best variable naming) |
| **Apktool** | 2.10.0 | Resource & Smali Decompilation |
| **Androguard** | 3.4.0a1 | APK Security Analysis |
| **Quark-Engine** | 26.5.1 | Malware Behavior Detection |
| **LIEF** | 0.17.6 | Binary Analysis Framework |

### Advanced Reverse Engineering Pipeline

| Tool | Version | Purpose |
|------|---------|---------|
| **CFR** | 0.152 | Secondary decompiler (cross-reference validation) |
| **Procyon** | 0.6.0 | Decompiler with type inference |
| **Vineflower** | 1.10.1 | Improved Fernflower decompiler |
| **JPhantom** | 1.3 | Missing class stub generation (957 stubs) |
| **Enjarify** | latest | DEX-to-JAR conversion (16,617 classes) |
| **Recaf** | 2.21.14 | Bytecode editor/refactoring |
| **Soot** | 4.7.1 | Optimization/deobfuscation framework |

### Decompiler Comparison for This Codebase

| Metric | JADX | Procyon | CFR |
|--------|------|---------|-----|
| Java files produced | 325 | 936 | 917 |
| Generic variable names (int n/str/bl) | 19 | ~1,200 | 3,926 |
| Field/member names preserved | ✅ Full | ✅ Full | ✅ Full |
| Parameter name inference | ✅ Contextual | ❌ Fallback | ❌ Type-based |
| Inner class handling | Merged | Separate files | Separate + cfr_renamed |
| **Variable naming quality** | **Best** | Moderate | Lowest |

> **Conclusion**: JADX reads DEX debug info directly and infers contextual parameter names.
> CFR and Procyon work from JAR bytecode which lacks parameter names, producing
> generic names (n, n2, bl, string2). JADX is the clear winner for this DEX-based codebase.

## 🧠 Smart Variable Renaming

**2,621 generic variables** have been renamed with meaningful, context-aware names
using a combination of rule-based context analysis and manual domain-specific renaming.

### Renaming Approach

| Method | Count | Description |
|--------|-------|-------------|
| Rule-based context analysis | 1,346 | Automatic inference from usage patterns, type context, and method calls |
| Manual domain-specific renaming | 1,275 | Human review with domain knowledge (Quran, video editing, audio processing) |
| **Total** | **2,621** | |

### Naming Conventions Applied

| Type | Convention | Examples |
|------|-----------|---------|
| `boolean` | is/has/can/should prefix | `isPlaying`, `hasAudio`, `isEnabled`, `shouldRender` |
| `int` | Descriptive noun | `trackIndex`, `frameNumber`, `surahNumber`, `channelCount` |
| `float` | Measurement descriptor | `scaleFactor`, `volumeLevel`, `audioPosition`, `zoomLevel` |
| `String` | Content descriptor | `filePath`, `audioUrl`, `surahName`, `readerName` |
| `long` | Time descriptor (Ms suffix) | `durationMs`, `positionMs`, `startTimeMs` |

### Top Renamed Files

| File | Renames | Key Improvements |
|------|---------|------------------|
| `TrackEntityView.java` | 287 | `floatValue`→`zoomLevel`, `isPlaying`, `isEnabled` |
| `EngineActivity.java` | 219 | `audioPosition`, `roundedMs`, `scaleFactor`, `trackIndex` |
| `BlurredImageView.java` | 182 | `blurRadius`, `pixelCount`, `colorChannel` |
| `ProgressViewActivity.java` | 139 | `renderProgress`, `frameNumber` |
| `TranslationQuranEntity.java` | 143 | `textSize`, `verseNumber` |
| `QuranEntity.java` | 139 | `textSize`, `lineSpacing`, `ayaNumber` |
| `BismilahEntity.java` | 88 | `textSize`, `positionRatio`, `styleIndex` |
| `WaveformRendererPro.java` | 55 | `waveAmplitude`, `sampleIndex` |
| `CustomDiscreteSeekBar.java` | 37 | `progressValue`, `tickCount` |
| `CropView.java` | 38 | `cropScale`, `handleIndex` |

Full details: [`advanced-analysis/renaming-report.md`](advanced-analysis/renaming-report.md)

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
