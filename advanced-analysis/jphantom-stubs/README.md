# JPhantom Stub Classes

JPhantom 1.3 generated **957 missing class stubs** for the NurMontage JAR.

These stubs fill in references to Android framework classes, third-party SDKs,
and other classes that were not present in the DEX-to-JAR conversion.

## Distribution

| Package | Count | Examples |
|---------|-------|---------|
| android.* | 902 | Activity, View, IBinder, SharedPreferences |
| androidx.* | 24 | Jetpack library stubs |
| jp.co.* | 12 | Japanese mobile SDK stubs |
| org.* | 9 | JSON, XML pull parser stubs |
| java/javax/dalvik | 8 | Platform stubs |
| com/libcore | 2 | Misc stubs |

## Source

The stub `.class` files are located in the build artifacts at:
`/home/z/my-project/nurmontage-re/dex_jar/phantom_output/` (2,504 class files)

The extended JAR with stubs: `nurmontage_phantom.jar` (29.6 MB, 17,574 entries)

Binary class files are not committed to this repository due to size.
To regenerate: `java -jar tools/jphantom.jar nurmontage.jar -o nurmontage_phantom.jar`
