# Asset Analysis

## Overview
Total asset size: ~29MB across 3 main directories.

## Directory Structure

### 1. `/assets/fonts/` (15MB, 73 files)

#### Latin/General Fonts:
| Font | Size | Purpose |
|------|------|---------|
| `ReadexPro-Regular.ttf` | - | Primary UI font (regular) |
| `ReadexPro_Medium.ttf` | - | Primary UI font (medium) |
| `ReadexPro_Bold.ttf` | - | Primary UI font (bold) |
| `Poppins-Regular.ttf` | - | Secondary UI font |
| `Poppins-SemiBold.ttf` | - | Secondary UI font (semibold) |
| `Rubik-SemiBold.ttf` | - | Tertiary UI font |
| `NotoSans.ttf` | 2.0MB | CJK/fallback font |
| `Alegreya-Regular.ttf` | 256KB | Display font |
| `surah_name.otf` | 300KB | Surah name decorative font |
| `خط الاستعاذه.ttf` | - | Basmalah font |
| `خط البسملة.ttf` | 548KB | Basmalah decorative font |

#### Arabic Fonts (11MB, 52 files in `arabic/` subdirectory):
The app includes an extensive collection of Arabic calligraphy fonts for Quran text rendering:
- Quran-specific fonts: `خط المصحف.ttf`, `المصحف.ttf`, `خط القران-القلم.ttf`, `خط القران-اميري.ttf`, `خط القرآن طه.ttf`, `خط القرآن - سليم.otf`, `خط مهدي القرآن.ttf`
- Calligraphy styles: `الثلث.ttf`, `الثلث مزخرف.ttf`, `كوفي.ttf`, `خط فارس الكوفي.otf`, `نسخ.ttf`
- Recitation styles: `قالون.ttf`, `خط ورش.ttf`, `خط حفص.ttf`, `خط نسخ عثماني.otf`
- Decorative: `جنة.ttf`, `نور الهدى.ttf`, `الأقصى.ttf`, `المجد.ttf`, `هيفن.ttf`
- Naskh styles: `خط النسخ.ttf`, `باك تايب نسخ.ttf`
- Thuluth styles: `تجمع كوفي.ttf`, `تجمع مصممين.ttf`
- Support fonts: `NotoNaskhArabic.ttf`, `Rubik-Regular.ttf`

### 2. `/assets/quran/` (14MB, 10 files)

Multi-language Quran translation files:

| File | Size | Language |
|------|------|----------|
| `quran-simple.txt` | 1.3MB | Arabic (original) |
| `ar.muyassar.txt` | 2.5MB | Arabic (simplified explanation) |
| `en.hilali.txt` | 1.1MB | English (Hilali-Khan) |
| `fr.hamidullah.txt` | 928KB | French (Hamidullah) |
| `de.bubenheim.txt` | 960KB | German (Bubenheim) |
| `tr.ozturk.txt` | 912KB | Turkish (Öztürk) |
| `ur.maududi.txt` | 1.5MB | Urdu (Maududi) |
| `fa.fooladvand.txt` | 1.3MB | Persian (Fooladvand) |
| `id.indonesian.txt` | 1.2MB | Indonesian |
| `bn.bengali.txt` | 2.1MB | Bengali |

### 3. `/assets/dexopt/` (small)
| File | Purpose |
|------|---------|
| `baseline.prof` | Baseline profile for ART optimization |
| `baseline.profm` | Baseline profile metadata |

## Security Observations

1. **No encrypted databases**: All Quran text is stored as plain text files
2. **No config files with secrets**: Assets contain only fonts, text, and optimization data
3. **Large attack surface via fonts**: 73 font files could potentially be replaced with malicious fonts (though exploiting font parsers is non-trivial)
4. **Quran text integrity**: No hash/signature verification on the Quran text files - they could be tampered with in a repackaged APK
5. **No SQLite databases** in assets (database likely created at runtime)
6. **No API keys or configuration** files in assets
