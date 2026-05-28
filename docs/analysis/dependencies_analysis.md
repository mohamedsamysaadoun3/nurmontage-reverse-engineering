# Library/Dependency Analysis

## App Metadata
- **Package**: `hazem.nurmontage.videoquran`
- **Version**: 6.7.1-nurmontage4kb (versionCode: 21000106)
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 15)
- **Billing Library**: 7.1.1

## Third-Party Libraries

### Media & Video
| Library | Package | Purpose |
|---------|---------|---------|
| **FFmpeg Kit** | `com.arthenica.ffmpegkit` | Video/audio processing, encoding, and manipulation |
| **Arthenica Smart Exception** | `com.arthenica.smartexception` | Exception handling for FFmpeg Kit |
| **ExoPlayer (Media3)** | `androidx.media3.*` | Video playback (exoplayer, extractor, datasource, decoder, ui, drm) |
| **YouTube Player** | `com.pierfrancescosoffritti.androidyoutubeplayer` | YouTube video embedding/playback |

### Image Loading & Processing
| Library | Package | Purpose |
|---------|---------|---------|
| **Glide** | `com.bumptech.glide` | Image loading, caching, and transformation |
| **Glide Transformations** | `jp.wasabeef.glide` | Custom image transformations for Glide |

### UI & Animation
| Library | Package | Purpose |
|---------|---------|---------|
| **Konfetti** | `nl.dionsegijn.konfetti` | Confetti animation effects |
| **Material Components** | `com.google.android.material` | Material Design UI components |
| **ConstraintLayout** | `androidx.constraintlayout` | Layout system |
| **RecyclerView** | `androidx.recyclerview` | Efficient list display |
| **CardView** | `androidx.cardview` | Card-style containers |
| **ViewPager2** | `androidx.viewpager2` | Swipeable page views |
| **Navigation** | `androidx.navigation` | Fragment navigation |
| **DynamicAnimation** | `androidx.dynamicanimation` | Physics-based animations |
| **SplashScreen** | `androidx.core.splashscreen` | Splash screen API |
| **Emoji2** | `androidx.emoji2` | Emoji compatibility |

### Google Services
| Library | Package | Purpose |
|---------|---------|---------|
| **Play Services Base** | `com.google.android.gms.common` | Google Play Services foundation |
| **Play Services Billing** | `com.android.billingclient` | In-app purchases and subscriptions |
| **Play Services Tasks** | `com.google.android.gms.tasks` | Async task handling |
| **Play Core** | `com.google.android.play.core` | In-app review, updates |
| **Firebase Encoders** | `com.google.firebase.encoders` | Firebase data encoding |
| **Data Transport** | `com.google.android.datatransport` | Analytics data transport (CCT backend) |

### License & Security
| Library | Package | Purpose |
|---------|---------|---------|
| **PairIP License Check** | `com.pairip.licensecheck` | Google Play licensing verification |

### Data & Serialization
| Library | Package | Purpose |
|---------|---------|---------|
| **Gson** | `com.google.gson` | JSON serialization/deserialization |
| **Guava** | `com.google.common` | Google utility collections |
| **Error Prone** | `com.google.errorprone` | Compile-time error checking annotations |
| **Apache Commons** | `org.apache.commons` | Common utilities |
| **Dagger (javax.inject)** | `javax.inject` | Dependency injection annotations |

### Kotlin & Coroutines
| Library | Package | Purpose |
|---------|---------|---------|
| **Kotlin stdlib** | `kotlin.*` | Kotlin standard library |
| **Kotlin Coroutines** | `kotlinx.coroutines` | Async programming (core + android) |

### AndroidX Core
| Library | Package | Purpose |
|---------|---------|---------|
| **AppCompat** | `androidx.appcompat` | Backward compatibility |
| **Core KTX** | `androidx.core.ktx` | Kotlin extensions |
| **Activity KTX** | `androidx.activity.ktx` | Activity Kotlin extensions |
| **Fragment KTX** | `androidx.fragment.ktx` | Fragment Kotlin extensions |
| **Lifecycle** | `androidx.lifecycle` | Lifecycle-aware components |
| **ViewModel** | `androidx.lifecycle.viewmodel` | ViewModel architecture |
| **LiveData** | `androidx.lifecycle.livedata` | Observable data holder |
| **SavedState** | `androidx.savedstate` | State preservation |
| **Window Manager** | `androidx.window` | Window size classes |
| **ExifInterface** | `androidx.exifinterface` | EXIF metadata reading |
| **ProfileInstaller** | `androidx.profileinstaller` | Baseline profile installation |

### Annotations
| Library | Package | Purpose |
|---------|---------|---------|
| **JetBrains Annotations** | `org.jetbrains.annotations` | Kotlin/Java annotations |
| **IntelliJ Annotations** | `org.intellij.lang` | IDE annotations |

## Library Count Summary
- **Total distinct libraries**: ~35+
- **Largest by code size**: FFmpeg Kit, Media3/ExoPlayer, Glide
- **Most security-relevant**: PairIP License Check, Play Services Billing
