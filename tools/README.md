# Advanced Reverse Engineering Tools Used

| Tool | Version | Purpose |
|------|---------|---------|
| JADX | 1.5.1 | Primary DEX decompiler (best variable naming) |
| CFR | 0.152 | Secondary decompiler (cross-reference) |
| Procyon | 0.6.0 | Decompiler with type inference |
| Vineflower | 1.10.1 | Improved Fernflower decompiler |
| JPhantom | 1.3 | Missing class stub generation (957 stubs) |
| Enjarify | latest | DEX to JAR conversion |
| Recaf | 2.21.14 | Bytecode editor/refactor |
| Soot | 4.7.1 | Optimization/deobfuscation framework |
| Apktool | 2.10.0 | APK resource decoding |
| Androguard | 3.4.0 | Python analysis framework |
| Quark-Engine | 26.5 | Malware analysis |
| LIEF | 0.17.6 | Binary analysis |

## Tool JARs Not Included

Tool JARs are too large for Git (total ~45 MB). They are available in the
build environment at `/home/z/my-project/nurmontage-re/tools/`.

To download independently:
- JADX: https://github.com/skylot/jadx/releases
- CFR: https://github.com/leibnitz27/cfr/releases
- Procyon: https://github.com/mstrobel/procyon/releases
- Vineflower: https://github.com/Vineflower/vineflower/releases
- JPhantom: https://github.com/NickAc/jphantom (or gbalats/jphantom fork)
- Recaf: https://github.com/Col-E/Recaf/releases
- Soot: https://soot-oss.github.io/soot/
