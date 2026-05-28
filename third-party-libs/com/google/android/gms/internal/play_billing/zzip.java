package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import androidx.media3.common.C0366C;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes2.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzjq.zzq(obj, j, (1 << (zzp >>> 20)) | zzjq.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzjq.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzjq.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
            case 2:
                return zzjq.zzd(obj, j2) != 0;
            case 3:
                return zzjq.zzd(obj, j2) != 0;
            case 4:
                return zzjq.zzc(obj, j2) != 0;
            case 5:
                return zzjq.zzd(obj, j2) != 0;
            case 6:
                return zzjq.zzc(obj, j2) != 0;
            case 7:
                return zzjq.zzw(obj, j2);
            case 8:
                Object zzf = zzjq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgk) {
                    return !zzgk.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
            case 11:
                return zzjq.zzc(obj, j2) != 0;
            case 12:
                return zzjq.zzc(obj, j2) != 0;
            case 13:
                return zzjq.zzc(obj, j2) != 0;
            case 14:
                return zzjq.zzd(obj, j2) != 0;
            case 15:
                return zzjq.zzc(obj, j2) != 0;
            case 16:
                return zzjq.zzd(obj, j2) != 0;
            case 17:
                return zzjq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i, (String) obj);
        } else {
            zzjwVar.zzd(i, (zzgk) obj);
        }
    }

    static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzf = zzjk.zzf();
        zzhkVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zziw zziwVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzz;
        int i25;
        char charAt11;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar2 = (zziw) zzijVar;
        String zzd = zziwVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i36 = charAt16 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt15 = zzd.charAt(i35);
                if (charAt15 < 55296) {
                    break;
                }
                i36 |= (charAt15 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt16 = i36 | (charAt15 << i37);
            i35 = i33;
        }
        if (charAt16 == 0) {
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt10 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt9 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt8 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int charAt20 = zzd.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt20 = i48 | (charAt7 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt = i51 | (charAt6 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt2 = i54 | (charAt5 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt21 = i57 | (charAt4 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt3 = zzd.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i7;
                }
                charAt22 = i60 | (charAt3 << i61);
                i59 = i7;
            }
            int i62 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i62;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zziwVar2.zze();
        Class<?> cls2 = zziwVar2.zza().getClass();
        int i63 = i3 + charAt2;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    if (charAt14 < c) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                }
                charAt23 = i70 | (charAt14 << i72);
                i15 = i32;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    charAt13 = zzd.charAt(i75);
                    if (charAt13 < c) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                }
                charAt24 = i74 | (charAt13 << i76);
                i16 = i31;
            } else {
                i16 = i73;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt24 & 255;
            int i78 = length;
            int i79 = charAt24 & 2048;
            int i80 = i5;
            if (i77 >= 51) {
                int i81 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt12 = zzd.charAt(i83);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i82 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i83 = i30;
                        i2 = i17;
                    }
                    charAt25 = i82 | (charAt12 << i84);
                    i28 = i30;
                } else {
                    i17 = i2;
                    i28 = i81;
                }
                int i85 = i77 - 51;
                int i86 = i28;
                if (i85 == 9 || i85 == 17) {
                    i29 = i4 + 1;
                    int i87 = i68 / 3;
                    objArr[i87 + i87 + 1] = zze[i4];
                } else {
                    if (i85 == 12) {
                        if (zziwVar2.zzc() == 1 || i79 != 0) {
                            i29 = i4 + 1;
                            int i88 = i68 / 3;
                            objArr[i88 + i88 + 1] = zze[i4];
                        } else {
                            i79 = 0;
                        }
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzz2 = zzz(cls2, (String) obj);
                        zze[i89] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    int i91 = i79;
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls2, (String) obj2);
                        zze[i90] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    i18 = i4;
                    i22 = i86;
                    i19 = charAt23;
                    i20 = (int) unsafe.objectFieldOffset(zzz3);
                    i23 = 0;
                    str = zzd;
                    zziwVar = zziwVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i91;
                }
                i4 = i29;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                int i912 = i79;
                if (obj2 instanceof Field) {
                }
                i18 = i4;
                i22 = i86;
                i19 = charAt23;
                i20 = (int) unsafe.objectFieldOffset(zzz3);
                i23 = 0;
                str = zzd;
                zziwVar = zziwVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zziwVar = zziwVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzz4.getType();
                } else {
                    if (i77 == 27) {
                        zziwVar = zziwVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zziwVar = zziwVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zziwVar = zziwVar2;
                            if (zziwVar2.zzc() == 1 || i79 != 0) {
                                i27 = i4 + 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = zze[i18];
                                str = zzd;
                                i18 = i27;
                            } else {
                                str = zzd;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i4 + 2;
                            int i95 = i65 + 1;
                            iArr[i65] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = zze[i18];
                            if (i79 != 0) {
                                i18 = i4 + 3;
                                objArr[i97 + 1] = zze[i94];
                                str = zzd;
                                i65 = i95;
                                zziwVar = zziwVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zziwVar = zziwVar2;
                            }
                        } else {
                            zziwVar = zziwVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i21 = i79;
                            i22 = i16;
                            i23 = 0;
                        } else {
                            int i98 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i25 = i98 + 1;
                                    charAt11 = str.charAt(i98);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt11 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i25;
                                }
                                charAt26 = i99 | (charAt11 << i100);
                                i98 = i25;
                            }
                            int i101 = i6 + i6 + (charAt26 / 32);
                            Object obj3 = zze[i101];
                            i22 = i98;
                            if (obj3 instanceof Field) {
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls2, (String) obj3);
                                zze[i101] = zzz;
                            }
                            i21 = i79;
                            i23 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzz);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i24 = i21;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i26] = zze[i18];
                    str = zzd;
                    i18 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = i79;
                    i22 = i16;
                    i23 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i24 = i21;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i21 = i79;
                i22 = i16;
                i23 = 0;
                if (i77 >= 18) {
                }
                i24 = i21;
            }
            int i103 = i68 + 1;
            iArr3[i68] = i19;
            int i104 = i68 + 2;
            Class<?> cls3 = cls2;
            iArr3[i103] = objectFieldOffset | (i24 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? C0366C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i77 << 20);
            i68 += 3;
            iArr3[i104] = (i23 << 20) | i20;
            zzd = str;
            i4 = i18;
            length = i78;
            i5 = i80;
            cls2 = cls3;
            zziwVar2 = zziwVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zzip(iArr3, objArr, i2, i5, zziwVar2.zza(), false, iArr, i3, i63, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzjq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzjq.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzjq.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzjq.zzf(obj, j)).longValue();
    }

    private final zzhm zzu(int i) {
        int i2 = i / 3;
        return (zzhm) this.zzd[i2 + i2 + 1];
    }

    private final zzix zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzix zzixVar = (zzix) objArr[i3];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzb2 = zziu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzix zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzix zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r0v281 */
    /* JADX WARN: Type inference failed for: r0v282 */
    /* JADX WARN: Type inference failed for: r0v283 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        ?? zzg;
        int size;
        int zzz7;
        int zzy;
        int zzy2;
        ?? r3;
        int zzx;
        ?? r1;
        ?? r0;
        int zze;
        int zzz8;
        int zzz9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int zzs = zzs(i4);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (zzr <= 17) {
                if (i9 != i6) {
                    r12 = i9 == i3 ? z : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i8 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i10 = zzs & i3;
            if (zzr >= zzhc.DOUBLE_LIST_PACKED.zza()) {
                zzhc.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(j2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(j3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(j4);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz4 = zzgr.zzz(i7 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            zzz5 = zzgr.zzz(i11);
                            zzd = ((zzgk) object).zzd();
                            zzz6 = zzgr.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzz3 = zzgr.zzz(i11);
                            zzA = zzgr.zzy((String) object);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zziz.zzh(i7, unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        zzz5 = zzgr.zzz(i7 << 3);
                        zzd = zzgkVar.zzd();
                        zzz6 = zzgr.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzz(i12);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(j5);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzz((i13 >> 31) ^ (i13 + i13));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 16:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zzgr.zzw(i7, (zzim) unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 18:
                    r0 = zziz.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    r0 = zziz.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zziz.zza;
                    if (list.size() != 0) {
                        zzg = zziz.zzg(list) + (list.size() * zzgr.zzz(i7 << 3));
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zziz.zzl(list2);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zziz.zzf(list3);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    r0 = zziz.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    r0 = zziz.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zziz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzgr.zzz(i7 << 3) + 1);
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i18 = zziz.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzz10 = zzgr.zzz(i7 << 3) * size3;
                        if (r02 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) r02;
                            zzg = zzz10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd2 = ((zzgk) zzc).zzd();
                                    zzy2 = zzg + zzgr.zzz(zzd2) + zzd2;
                                } else {
                                    zzy2 = zzg + zzgr.zzy((String) zzc);
                                }
                                zzg = zzy2;
                            }
                        } else {
                            zzg = zzz10;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzgk) {
                                    int zzd3 = ((zzgk) obj2).zzd();
                                    zzy = zzg + zzgr.zzz(zzd3) + zzd3;
                                } else {
                                    zzy = zzg + zzgr.zzy((String) obj2);
                                }
                                zzg = zzy;
                            }
                        }
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzix zzv = zzv(i4);
                    int i19 = zziz.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzgr.zzz(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzhx) {
                                int zza2 = ((zzhx) obj3).zza();
                                zzx = (r3 == true ? 1 : 0) + zzgr.zzz(zza2) + zza2;
                            } else {
                                zzx = (r3 == true ? 1 : 0) + zzgr.zzx((zzim) obj3, zzv);
                            }
                            r3 = zzx;
                        }
                    }
                    i5 += r3;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i20 = zziz.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzgr.zzz(i7 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzd4 = ((zzgk) r04.get(r2)).zzd();
                            r1 += zzgr.zzz(zzd4) + zzd4;
                        }
                    }
                    i5 += r1;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zziz.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zziz.zzk(list5);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i22 = zziz.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zziz.zza(list6);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 31:
                    r0 = zziz.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    r0 = zziz.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zziz.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zziz.zzi(list7);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zziz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zziz.zzj(list8);
                        zzz7 = zzgr.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 36:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 37:
                    zze = zziz.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 38:
                    zze = zziz.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 39:
                    zze = zziz.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 40:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 41:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zziz.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 43:
                    zze = zziz.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 44:
                    zze = zziz.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 45:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 46:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 47:
                    zze = zziz.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 48:
                    zze = zziz.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i7 << 3);
                        zzz9 = zzgr.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzix zzv2 = zzv(i4);
                    int i26 = zziz.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzw = zzgr.zzw(i7, (zzim) r05.get(r34), zzv2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzw;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj, j);
                    if (zzigVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i7, i4)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i7, i4)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i7, i4)) {
                        long zzt = zzt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(zzt);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i7, i4)) {
                        long zzt2 = zzt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(zzt2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i7, i4)) {
                        long zzo = zzo(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(zzo);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzM(obj, i7, i4)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzM(obj, i7, i4)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzM(obj, i7, i4)) {
                        zzz4 = zzgr.zzz(i7 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzM(obj, i7, i4)) {
                        int i27 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            zzz5 = zzgr.zzz(i27);
                            zzd = ((zzgk) object2).zzd();
                            zzz6 = zzgr.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzz3 = zzgr.zzz(i27);
                            zzA = zzgr.zzy((String) object2);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i7, i4)) {
                        r0 = zziz.zzh(i7, unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i7, i4)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        zzz5 = zzgr.zzz(i7 << 3);
                        zzd = zzgkVar2.zzd();
                        zzz6 = zzgr.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzM(obj, i7, i4)) {
                        int zzo2 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzz(zzo2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i4)) {
                        long zzo3 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA(zzo3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzM(obj, i7, i4)) {
                        zzz2 = zzgr.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i7, i4)) {
                        zzz = zzgr.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i7, i4)) {
                        int zzo4 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 67:
                    if (zzM(obj, i7, i4)) {
                        long zzt3 = zzt(obj, j);
                        zzz3 = zzgr.zzz(i7 << 3);
                        zzA = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzM(obj, i7, i4)) {
                        r0 = zzgr.zzw(i7, (zzim) unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
            }
        }
        int zza3 = i5 + ((zzhk) obj).zzc.zza();
        if (!this.zzh) {
            return zza3;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int zzc2 = zzhbVar.zza.zzc();
        int i28 = 0;
        for (int i29 = 0; i29 < zzc2; i29++) {
            Map.Entry zzg2 = zzhbVar.zza.zzg(i29);
            i28 += zzhb.zzb((zzha) ((zzjb) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            i28 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i28;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzr) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
                    byte[] bArr = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr2 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr3 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr4 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzjq.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr5 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr6 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzjq.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhp.zza(zzN(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + ((zzhk) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ddf, code lost:
    
        if (r6 == 1048575) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0de1, code lost:
    
        r29.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0de7, code lost:
    
        r2 = r36.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0deb, code lost:
    
        if (r2 >= r36.zzk) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ded, code lost:
    
        r3 = r36.zzi;
        r5 = r36.zzc;
        r3 = r3[r2];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.play_billing.zzjq.zzf(r7, zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e02, code lost:
    
        if (r5 != null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0e09, code lost:
    
        if (zzu(r3) != null) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e12, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.zzig) r5;
        r1 = (com.google.android.gms.internal.play_billing.zzif) zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e1a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e0b, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzjk) null;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e1d, code lost:
    
        if (r8 != 0) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e21, code lost:
    
        if (r1 != r40) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e29, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e30, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e2c, code lost:
    
        if (r1 > r40) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0e2e, code lost:
    
        if (r4 != r8) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0e36, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0ade A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0af1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0d5e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0d71 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzq;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzfz zzfzVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzfz zzfzVar3;
        int i26;
        Unsafe unsafe3;
        zzfz zzfzVar4;
        int i27;
        int i28;
        int i29;
        zzfz zzfzVar5;
        int i30;
        int i31;
        int i32;
        Unsafe unsafe4;
        int i33;
        int zzh;
        int i34;
        int i35;
        int i36;
        Unsafe unsafe5;
        int i37;
        Object obj2;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int zzj;
        int i43;
        int i44;
        int i45;
        int i46;
        int zzk;
        int i47;
        Object obj3 = obj;
        int i48 = i2;
        int i49 = i3;
        zzfz zzfzVar6 = zzfzVar;
        zzA(obj);
        Unsafe unsafe6 = zzb;
        int i50 = 0;
        int i51 = i;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = -1;
        int i56 = 1048575;
        while (true) {
            if (i51 < i48) {
                int i57 = i51 + 1;
                int i58 = bArr[i51];
                if (i58 < 0) {
                    i6 = zzga.zzi(i58, bArr, i57, zzfzVar6);
                    i5 = zzfzVar6.zza;
                } else {
                    i5 = i58;
                    i6 = i57;
                }
                int i59 = i5 >>> 3;
                if (i59 > i55) {
                    zzq = (i59 < this.zze || i59 > this.zzf) ? -1 : zzq(i59, i52 / 3);
                } else if (i59 < this.zze || i59 > this.zzf) {
                    i7 = -1;
                    i8 = -1;
                    if (i8 == i7) {
                        int i60 = i5 & 7;
                        int[] iArr = this.zzc;
                        int i61 = iArr[i8 + 1];
                        int i62 = i5;
                        int zzr = zzr(i61);
                        long j = i61 & 1048575;
                        String str = "Protocol message had invalid UTF-8.";
                        if (zzr > 17) {
                            int i63 = i6;
                            i11 = i56;
                            i13 = 0;
                            i10 = i54;
                            int i64 = i8;
                            zzfz zzfzVar7 = zzfzVar6;
                            Unsafe unsafe7 = unsafe6;
                            if (zzr != 27) {
                                if (zzr > 49) {
                                    unsafe3 = unsafe7;
                                    i26 = i64;
                                    i27 = i62;
                                    i12 = i59;
                                    if (zzr != 50) {
                                        obj3 = obj;
                                        unsafe = unsafe3;
                                        Unsafe unsafe8 = zzb;
                                        long j2 = iArr[i26 + 2] & 1048575;
                                        switch (zzr) {
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 1) {
                                                    i51 = i46 + 8;
                                                    unsafe8.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr, i46))));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                        i4 = i3;
                                                        i9 = i51;
                                                        i50 = i45;
                                                        break;
                                                    } else {
                                                        i48 = i2;
                                                        i49 = i3;
                                                        i55 = i12;
                                                        i53 = i14;
                                                        zzfzVar6 = zzfzVar2;
                                                        i56 = i11;
                                                        i50 = 0;
                                                        i54 = i10;
                                                        unsafe6 = unsafe;
                                                        i52 = i45;
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 5) {
                                                    i51 = i46 + 4;
                                                    unsafe8.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr, i46))));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 0) {
                                                    zzk = zzga.zzk(bArr, i46, zzfzVar2);
                                                    unsafe8.putObject(obj3, j, Long.valueOf(zzfzVar2.zzb));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    i51 = zzk;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                            case 62:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 0) {
                                                    i51 = zzga.zzh(bArr, i46, zzfzVar2);
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(zzfzVar2.zza));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case 56:
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 1) {
                                                    i51 = i46 + 8;
                                                    unsafe8.putObject(obj3, j, Long.valueOf(zzga.zzn(bArr, i46)));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 5) {
                                                    i51 = i46 + 4;
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(zzga.zzb(bArr, i46)));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case 58:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 0) {
                                                    zzk = zzga.zzk(bArr, i46, zzfzVar2);
                                                    unsafe8.putObject(obj3, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    i51 = zzk;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case 59:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                if (i60 == 2) {
                                                    i51 = zzga.zzh(bArr, i46, zzfzVar2);
                                                    int i65 = zzfzVar2.zza;
                                                    if (i65 == 0) {
                                                        unsafe8.putObject(obj3, j, "");
                                                    } else {
                                                        int i66 = i51 + i65;
                                                        if ((i61 & C0366C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzjt.zzd(bArr, i51, i66)) {
                                                            throw new zzhr(str);
                                                        }
                                                        unsafe8.putObject(obj3, j, new String(bArr, i51, i65, zzhp.zza));
                                                        i51 = i66;
                                                    }
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                i47 = i27;
                                                i46 = i63;
                                                if (i60 == 2) {
                                                    Object zzy = zzy(obj3, i12, i26);
                                                    zzfzVar2 = zzfzVar7;
                                                    i51 = zzga.zzm(zzy, zzv(i26), bArr, i46, i2, zzfzVar);
                                                    zzG(obj3, i12, i26, zzy);
                                                    i45 = i26;
                                                    i14 = i47;
                                                    i12 = i12;
                                                    if (i51 != i46) {
                                                    }
                                                } else {
                                                    zzfzVar2 = zzfzVar7;
                                                    i45 = i26;
                                                    i14 = i47;
                                                    i51 = i46;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                i47 = i27;
                                                i46 = i63;
                                                if (i60 == 2) {
                                                    i51 = zzga.zza(bArr, i46, zzfzVar7);
                                                    unsafe8.putObject(obj3, j, zzfzVar7.zzc);
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i14 = i47;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i47;
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                                i47 = i27;
                                                i46 = i63;
                                                if (i60 == 0) {
                                                    i51 = zzga.zzh(bArr, i46, zzfzVar7);
                                                    int i67 = zzfzVar7.zza;
                                                    zzhm zzu = zzu(i26);
                                                    if (zzu == null || zzu.zza(i67)) {
                                                        unsafe8.putObject(obj3, j, Integer.valueOf(i67));
                                                        unsafe8.putInt(obj3, j2, i12);
                                                    } else {
                                                        zzd(obj).zzj(i47, Long.valueOf(i67));
                                                    }
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i14 = i47;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i47;
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                                i47 = i27;
                                                i46 = i63;
                                                if (i60 == 0) {
                                                    i51 = zzga.zzh(bArr, i46, zzfzVar7);
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(zzgn.zzb(zzfzVar7.zza)));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i14 = i47;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i47;
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                            case 67:
                                                i47 = i27;
                                                if (i60 == 0) {
                                                    i46 = i63;
                                                    int zzk2 = zzga.zzk(bArr, i46, zzfzVar7);
                                                    unsafe8.putObject(obj3, j, Long.valueOf(zzgn.zzc(zzfzVar7.zzb)));
                                                    unsafe8.putInt(obj3, j2, i12);
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i51 = zzk2;
                                                    i14 = i47;
                                                    if (i51 != i46) {
                                                    }
                                                } else {
                                                    i46 = i63;
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i14 = i47;
                                                    i51 = i46;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i60 == 3) {
                                                    Object zzy2 = zzy(obj3, i12, i26);
                                                    i47 = i27;
                                                    int zzl = zzga.zzl(zzy2, zzv(i26), bArr, i63, i2, (i27 & (-8)) | 4, zzfzVar);
                                                    zzG(obj3, i12, i26, zzy2);
                                                    i45 = i26;
                                                    zzfzVar2 = zzfzVar7;
                                                    i51 = zzl;
                                                    i46 = i63;
                                                    i14 = i47;
                                                    if (i51 != i46) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i45 = i26;
                                                zzfzVar2 = zzfzVar7;
                                                i14 = i27;
                                                i46 = i63;
                                                i51 = i46;
                                                if (i51 != i46) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i60 == 2) {
                                            Unsafe unsafe9 = zzb;
                                            Object zzw = zzw(i26);
                                            Object object = unsafe9.getObject(obj, j);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe9.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        zzfzVar4 = zzfzVar7;
                                        obj3 = obj;
                                        i4 = i3;
                                        i50 = i26;
                                        zzfzVar2 = zzfzVar4;
                                        unsafe = unsafe3;
                                        i14 = i27;
                                        i9 = i63;
                                    }
                                } else {
                                    long j3 = i61;
                                    Unsafe unsafe10 = zzb;
                                    zzho zzhoVar = (zzho) unsafe10.getObject(obj3, j);
                                    if (zzhoVar.zzc()) {
                                        i28 = i64;
                                    } else {
                                        int size = zzhoVar.size();
                                        i28 = i64;
                                        zzhoVar = zzhoVar.zzd(size + size);
                                        unsafe10.putObject(obj3, j, zzhoVar);
                                    }
                                    zzho zzhoVar2 = zzhoVar;
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            i29 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            i32 = i59;
                                            unsafe4 = unsafe7;
                                            int i68 = i28;
                                            if (i60 != 2) {
                                                i28 = i68;
                                                if (i60 == 1) {
                                                    i51 = i31 + 8;
                                                    int i69 = zzga.zza;
                                                    zzgt zzgtVar = (zzgt) zzhoVar2;
                                                    zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr, i31)));
                                                    while (i51 < i29) {
                                                        int zzh2 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr, zzh2)));
                                                            i51 = zzh2 + 8;
                                                        }
                                                    }
                                                }
                                                i34 = i28;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                    i4 = i3;
                                                    i9 = i51;
                                                    i12 = i32;
                                                    unsafe = unsafe4;
                                                    i14 = i30;
                                                    i50 = i34;
                                                    zzfzVar2 = zzfzVar5;
                                                    obj3 = obj;
                                                    break;
                                                } else {
                                                    zzfzVar6 = zzfzVar5;
                                                    i55 = i32;
                                                    unsafe6 = unsafe4;
                                                    i53 = i30;
                                                    i56 = i11;
                                                    i50 = 0;
                                                    i54 = i10;
                                                    i52 = i34;
                                                    obj3 = obj;
                                                    i49 = i3;
                                                    i48 = i29;
                                                }
                                            } else {
                                                int i70 = zzga.zza;
                                                zzgt zzgtVar2 = (zzgt) zzhoVar2;
                                                int zzh3 = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i71 = zzfzVar5.zza;
                                                int i72 = zzh3 + i71;
                                                if (i72 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzgtVar2.zzg(zzgtVar2.size() + (i71 / 8));
                                                while (zzh3 < i72) {
                                                    zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr, zzh3)));
                                                    zzh3 += 8;
                                                    i68 = i68;
                                                }
                                                i28 = i68;
                                                if (zzh3 != i72) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = zzh3;
                                            }
                                            i34 = i28;
                                            if (i51 != i31) {
                                            }
                                        case 19:
                                        case 36:
                                            i29 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            i32 = i59;
                                            unsafe4 = unsafe7;
                                            i33 = i28;
                                            if (i60 == 2) {
                                                int i73 = zzga.zza;
                                                zzhd zzhdVar = (zzhd) zzhoVar2;
                                                zzh = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i74 = zzfzVar5.zza;
                                                int i75 = zzh + i74;
                                                if (i75 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzhdVar.zzg(zzhdVar.size() + (i74 / 4));
                                                while (zzh < i75) {
                                                    zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr, zzh)));
                                                    zzh += 4;
                                                }
                                                if (zzh != i75) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = zzh;
                                                i34 = i33;
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    i51 = i31 + 4;
                                                    int i76 = zzga.zza;
                                                    zzhd zzhdVar2 = (zzhd) zzhoVar2;
                                                    zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr, i31)));
                                                    while (i51 < i29) {
                                                        int zzh4 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr, zzh4)));
                                                            i51 = zzh4 + 4;
                                                        } else {
                                                            i34 = i33;
                                                            if (i51 != i31) {
                                                            }
                                                        }
                                                    }
                                                    i34 = i33;
                                                    if (i51 != i31) {
                                                    }
                                                }
                                                i34 = i33;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i29 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            i32 = i59;
                                            unsafe4 = unsafe7;
                                            i33 = i28;
                                            if (i60 == 2) {
                                                int i77 = zzga.zza;
                                                zzib zzibVar = (zzib) zzhoVar2;
                                                zzh = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i78 = zzfzVar5.zza + zzh;
                                                while (zzh < i78) {
                                                    zzh = zzga.zzk(bArr, zzh, zzfzVar5);
                                                    zzibVar.zzf(zzfzVar5.zzb);
                                                }
                                                if (zzh != i78) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    int i79 = zzga.zza;
                                                    zzib zzibVar2 = (zzib) zzhoVar2;
                                                    zzh = zzga.zzk(bArr, i31, zzfzVar5);
                                                    zzibVar2.zzf(zzfzVar5.zzb);
                                                    while (zzh < i29) {
                                                        int zzh5 = zzga.zzh(bArr, zzh, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzh = zzga.zzk(bArr, zzh5, zzfzVar5);
                                                            zzibVar2.zzf(zzfzVar5.zzb);
                                                        }
                                                    }
                                                }
                                                i34 = i33;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            i51 = zzh;
                                            i34 = i33;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i35 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            unsafe4 = unsafe7;
                                            i36 = i28;
                                            if (i60 == 2) {
                                                i51 = zzga.zzf(bArr, i31, zzhoVar2, zzfzVar5);
                                                i29 = i35;
                                                i34 = i36;
                                                i32 = i59;
                                                if (i51 != i31) {
                                                }
                                            } else if (i60 == 0) {
                                                i29 = i35;
                                                i32 = i59;
                                                i33 = i36;
                                                i51 = zzga.zzj(i30, bArr, i31, i2, zzhoVar2, zzfzVar);
                                                i34 = i33;
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                i29 = i35;
                                                i32 = i59;
                                                i34 = i36;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i35 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            unsafe4 = unsafe7;
                                            i36 = i28;
                                            if (i60 == 2) {
                                                int i80 = zzga.zza;
                                                zzib zzibVar3 = (zzib) zzhoVar2;
                                                i51 = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i81 = zzfzVar5.zza;
                                                int i82 = i51 + i81;
                                                if (i82 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzibVar3.zzg(zzibVar3.size() + (i81 / 8));
                                                while (i51 < i82) {
                                                    zzibVar3.zzf(zzga.zzn(bArr, i51));
                                                    i51 += 8;
                                                }
                                                if (i51 != i82) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 1) {
                                                    i51 = i31 + 8;
                                                    int i83 = zzga.zza;
                                                    zzib zzibVar4 = (zzib) zzhoVar2;
                                                    zzibVar4.zzf(zzga.zzn(bArr, i31));
                                                    while (i51 < i35) {
                                                        int zzh6 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzibVar4.zzf(zzga.zzn(bArr, zzh6));
                                                            i51 = zzh6 + 8;
                                                        }
                                                    }
                                                }
                                                i29 = i35;
                                                i34 = i36;
                                                i32 = i59;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            i29 = i35;
                                            i34 = i36;
                                            i32 = i59;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i35 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            unsafe4 = unsafe7;
                                            i36 = i28;
                                            if (i60 == 2) {
                                                int i84 = zzga.zza;
                                                zzhl zzhlVar = (zzhl) zzhoVar2;
                                                i51 = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i85 = zzfzVar5.zza;
                                                int i86 = i51 + i85;
                                                if (i86 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzhlVar.zzh(zzhlVar.size() + (i85 / 4));
                                                while (i51 < i86) {
                                                    zzhlVar.zzg(zzga.zzb(bArr, i51));
                                                    i51 += 4;
                                                }
                                                if (i51 != i86) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    i51 = i31 + 4;
                                                    int i87 = zzga.zza;
                                                    zzhl zzhlVar2 = (zzhl) zzhoVar2;
                                                    zzhlVar2.zzg(zzga.zzb(bArr, i31));
                                                    while (i51 < i35) {
                                                        int zzh7 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzhlVar2.zzg(zzga.zzb(bArr, zzh7));
                                                            i51 = zzh7 + 4;
                                                        }
                                                    }
                                                }
                                                i29 = i35;
                                                i34 = i36;
                                                i32 = i59;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            i29 = i35;
                                            i34 = i36;
                                            i32 = i59;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i35 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            unsafe4 = unsafe7;
                                            i36 = i28;
                                            if (i60 == 2) {
                                                int i88 = zzga.zza;
                                                zzgb zzgbVar = (zzgb) zzhoVar2;
                                                i51 = zzga.zzh(bArr, i31, zzfzVar5);
                                                int i89 = zzfzVar5.zza + i51;
                                                while (i51 < i89) {
                                                    i51 = zzga.zzk(bArr, i51, zzfzVar5);
                                                    zzgbVar.zze(zzfzVar5.zzb != 0);
                                                }
                                                if (i51 != i89) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    int i90 = zzga.zza;
                                                    zzgb zzgbVar2 = (zzgb) zzhoVar2;
                                                    i51 = zzga.zzk(bArr, i31, zzfzVar5);
                                                    zzgbVar2.zze(zzfzVar5.zzb != 0);
                                                    while (i51 < i35) {
                                                        int zzh8 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            i51 = zzga.zzk(bArr, zzh8, zzfzVar5);
                                                            zzgbVar2.zze(zzfzVar5.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i29 = i35;
                                                i34 = i36;
                                                i32 = i59;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            i29 = i35;
                                            i34 = i36;
                                            i32 = i59;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 26:
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            i36 = i28;
                                            if (i60 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    i51 = zzga.zzh(bArr, i31, zzfzVar5);
                                                    int i91 = zzfzVar5.zza;
                                                    if (i91 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i91 == 0) {
                                                        obj2 = "";
                                                        zzhoVar2.add(obj2);
                                                    } else {
                                                        obj2 = "";
                                                        zzhoVar2.add(new String(bArr, i51, i91, zzhp.zza));
                                                        i51 += i91;
                                                    }
                                                    while (i51 < i2) {
                                                        int zzh9 = zzga.zzh(bArr, i51, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            i51 = zzga.zzh(bArr, zzh9, zzfzVar5);
                                                            int i92 = zzfzVar5.zza;
                                                            if (i92 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i92 == 0) {
                                                                zzhoVar2.add(obj2);
                                                            } else {
                                                                zzhoVar2.add(new String(bArr, i51, i92, zzhp.zza));
                                                                i51 += i92;
                                                            }
                                                        } else {
                                                            unsafe4 = unsafe7;
                                                            i29 = i2;
                                                            i32 = i59;
                                                            i34 = i36;
                                                        }
                                                    }
                                                    unsafe4 = unsafe7;
                                                    i29 = i2;
                                                    i32 = i59;
                                                    i34 = i36;
                                                } else {
                                                    int zzh10 = zzga.zzh(bArr, i31, zzfzVar5);
                                                    int i93 = zzfzVar5.zza;
                                                    if (i93 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i93 == 0) {
                                                        zzhoVar2.add("");
                                                        unsafe5 = unsafe7;
                                                        i37 = i59;
                                                    } else {
                                                        int i94 = zzh10 + i93;
                                                        if (!zzjt.zzd(bArr, zzh10, i94)) {
                                                            throw new zzhr(str);
                                                        }
                                                        unsafe5 = unsafe7;
                                                        i37 = i59;
                                                        zzhoVar2.add(new String(bArr, zzh10, i93, zzhp.zza));
                                                        zzh10 = i94;
                                                    }
                                                    while (zzh10 < i2) {
                                                        int zzh11 = zzga.zzh(bArr, zzh10, zzfzVar5);
                                                        if (i30 == zzfzVar5.zza) {
                                                            zzh10 = zzga.zzh(bArr, zzh11, zzfzVar5);
                                                            int i95 = zzfzVar5.zza;
                                                            if (i95 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i95 == 0) {
                                                                zzhoVar2.add("");
                                                            } else {
                                                                int i96 = zzh10 + i95;
                                                                if (!zzjt.zzd(bArr, zzh10, i96)) {
                                                                    throw new zzhr(str);
                                                                }
                                                                zzhoVar2.add(new String(bArr, zzh10, i95, zzhp.zza));
                                                                zzh10 = i96;
                                                            }
                                                        } else {
                                                            i51 = zzh10;
                                                            i29 = i2;
                                                            i34 = i36;
                                                            i32 = i37;
                                                            unsafe4 = unsafe5;
                                                        }
                                                    }
                                                    i51 = zzh10;
                                                    i29 = i2;
                                                    i34 = i36;
                                                    i32 = i37;
                                                    unsafe4 = unsafe5;
                                                }
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                unsafe4 = unsafe7;
                                                i29 = i2;
                                                i32 = i59;
                                                i34 = i36;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            i38 = i2;
                                            i39 = i59;
                                            int i97 = i28;
                                            if (i60 == 2) {
                                                zzfzVar5 = zzfzVar7;
                                                i30 = i62;
                                                i31 = i63;
                                                unsafe4 = unsafe7;
                                                i32 = i39;
                                                i34 = i97;
                                                i51 = zzga.zze(zzv(i97), i62, bArr, i63, i2, zzhoVar2, zzfzVar);
                                                i29 = i38;
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                zzfzVar5 = zzfzVar7;
                                                i34 = i97;
                                                i30 = i62;
                                                i31 = i63;
                                                unsafe4 = unsafe7;
                                                int i98 = i38;
                                                i32 = i39;
                                                i29 = i98;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i38 = i2;
                                            i40 = i62;
                                            i41 = i63;
                                            i39 = i59;
                                            int i99 = i28;
                                            if (i60 == 2) {
                                                i51 = zzga.zzh(bArr, i41, zzfzVar7);
                                                int i100 = zzfzVar7.zza;
                                                if (i100 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i100 > bArr.length - i51) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i100 == 0) {
                                                    zzhoVar2.add(zzgk.zzb);
                                                } else {
                                                    zzhoVar2.add(zzgk.zzj(bArr, i51, i100));
                                                    i51 += i100;
                                                }
                                                while (i51 < i38) {
                                                    int zzh12 = zzga.zzh(bArr, i51, zzfzVar7);
                                                    if (i40 == zzfzVar7.zza) {
                                                        i51 = zzga.zzh(bArr, zzh12, zzfzVar7);
                                                        int i101 = zzfzVar7.zza;
                                                        if (i101 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i101 > bArr.length - i51) {
                                                            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i101 == 0) {
                                                            zzhoVar2.add(zzgk.zzb);
                                                        } else {
                                                            zzhoVar2.add(zzgk.zzj(bArr, i51, i101));
                                                            i51 += i101;
                                                        }
                                                    } else {
                                                        i34 = i99;
                                                        zzfzVar5 = zzfzVar7;
                                                        unsafe4 = unsafe7;
                                                        i30 = i40;
                                                        i31 = i41;
                                                        int i102 = i38;
                                                        i32 = i39;
                                                        i29 = i102;
                                                        if (i51 != i31) {
                                                        }
                                                    }
                                                }
                                                i34 = i99;
                                                zzfzVar5 = zzfzVar7;
                                                unsafe4 = unsafe7;
                                                i30 = i40;
                                                i31 = i41;
                                                int i1022 = i38;
                                                i32 = i39;
                                                i29 = i1022;
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                i34 = i99;
                                                zzfzVar5 = zzfzVar7;
                                                unsafe4 = unsafe7;
                                                i30 = i40;
                                                i31 = i41;
                                                int i982 = i38;
                                                i32 = i39;
                                                i29 = i982;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i40 = i62;
                                            i41 = i63;
                                            if (i60 == 2) {
                                                zzj = zzga.zzf(bArr, i41, zzhoVar2, zzfzVar7);
                                                i38 = i2;
                                                i39 = i59;
                                                i42 = i28;
                                            } else {
                                                if (i60 == 0) {
                                                    i39 = i59;
                                                    i42 = i28;
                                                    i38 = i2;
                                                    zzj = zzga.zzj(i40, bArr, i41, i2, zzhoVar2, zzfzVar);
                                                }
                                                i29 = i2;
                                                zzfzVar5 = zzfzVar7;
                                                i32 = i59;
                                                unsafe4 = unsafe7;
                                                i34 = i28;
                                                i30 = i40;
                                                i31 = i41;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            zzhm zzu2 = zzu(i42);
                                            zzjj zzjjVar = this.zzl;
                                            int i103 = zziz.zza;
                                            if (zzu2 == null) {
                                                i43 = zzj;
                                                i44 = i42;
                                            } else if (zzhoVar2 instanceof RandomAccess) {
                                                int size2 = zzhoVar2.size();
                                                i43 = zzj;
                                                Object obj4 = null;
                                                int i104 = 0;
                                                int i105 = 0;
                                                while (i104 < size2) {
                                                    int i106 = i42;
                                                    int intValue = ((Integer) zzhoVar2.get(i104)).intValue();
                                                    if (zzu2.zza(intValue)) {
                                                        if (i104 != i105) {
                                                            zzhoVar2.set(i105, Integer.valueOf(intValue));
                                                        }
                                                        i105++;
                                                    } else {
                                                        obj4 = zziz.zzn(obj3, i39, intValue, obj4, zzjjVar);
                                                    }
                                                    i104++;
                                                    i42 = i106;
                                                }
                                                i44 = i42;
                                                if (i105 != size2) {
                                                    zzhoVar2.subList(i105, size2).clear();
                                                }
                                            } else {
                                                i43 = zzj;
                                                i44 = i42;
                                                Iterator it = zzhoVar2.iterator();
                                                Object obj5 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu2.zza(intValue2)) {
                                                        obj5 = zziz.zzn(obj3, i39, intValue2, obj5, zzjjVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i51 = i43;
                                            zzfzVar5 = zzfzVar7;
                                            unsafe4 = unsafe7;
                                            i34 = i44;
                                            i30 = i40;
                                            i31 = i41;
                                            int i10222 = i38;
                                            i32 = i39;
                                            i29 = i10222;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i40 = i62;
                                            i41 = i63;
                                            if (i60 == 2) {
                                                int i107 = zzga.zza;
                                                zzhl zzhlVar3 = (zzhl) zzhoVar2;
                                                i51 = zzga.zzh(bArr, i41, zzfzVar7);
                                                int i108 = zzfzVar7.zza + i51;
                                                while (i51 < i108) {
                                                    i51 = zzga.zzh(bArr, i51, zzfzVar7);
                                                    zzhlVar3.zzg(zzgn.zzb(zzfzVar7.zza));
                                                }
                                                if (i51 != i108) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    int i109 = zzga.zza;
                                                    zzhl zzhlVar4 = (zzhl) zzhoVar2;
                                                    i51 = zzga.zzh(bArr, i41, zzfzVar7);
                                                    zzhlVar4.zzg(zzgn.zzb(zzfzVar7.zza));
                                                    while (i51 < i2) {
                                                        int zzh13 = zzga.zzh(bArr, i51, zzfzVar7);
                                                        if (i40 == zzfzVar7.zza) {
                                                            i51 = zzga.zzh(bArr, zzh13, zzfzVar7);
                                                            zzhlVar4.zzg(zzgn.zzb(zzfzVar7.zza));
                                                        }
                                                    }
                                                }
                                                i29 = i2;
                                                zzfzVar5 = zzfzVar7;
                                                i32 = i59;
                                                unsafe4 = unsafe7;
                                                i34 = i28;
                                                i30 = i40;
                                                i31 = i41;
                                                i51 = i31;
                                                if (i51 != i31) {
                                                }
                                            }
                                            i29 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i32 = i59;
                                            unsafe4 = unsafe7;
                                            i34 = i28;
                                            i30 = i40;
                                            i31 = i41;
                                            if (i51 != i31) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i60 == 2) {
                                                int i110 = zzga.zza;
                                                zzib zzibVar5 = (zzib) zzhoVar2;
                                                i51 = zzga.zzh(bArr, i63, zzfzVar7);
                                                int i111 = zzfzVar7.zza + i51;
                                                while (i51 < i111) {
                                                    i51 = zzga.zzk(bArr, i51, zzfzVar7);
                                                    zzibVar5.zzf(zzgn.zzc(zzfzVar7.zzb));
                                                }
                                                if (i51 != i111) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i29 = i2;
                                                i31 = i63;
                                                zzfzVar5 = zzfzVar7;
                                                i30 = i62;
                                                i32 = i59;
                                                unsafe4 = unsafe7;
                                                i34 = i28;
                                                if (i51 != i31) {
                                                }
                                            } else {
                                                i41 = i63;
                                                if (i60 == 0) {
                                                    int i112 = zzga.zza;
                                                    zzib zzibVar6 = (zzib) zzhoVar2;
                                                    i51 = zzga.zzk(bArr, i41, zzfzVar7);
                                                    zzibVar6.zzf(zzgn.zzc(zzfzVar7.zzb));
                                                    while (true) {
                                                        if (i51 < i2) {
                                                            int zzh14 = zzga.zzh(bArr, i51, zzfzVar7);
                                                            i40 = i62;
                                                            if (i40 == zzfzVar7.zza) {
                                                                i51 = zzga.zzk(bArr, zzh14, zzfzVar7);
                                                                zzibVar6.zzf(zzgn.zzc(zzfzVar7.zzb));
                                                                i62 = i40;
                                                            }
                                                        } else {
                                                            i40 = i62;
                                                        }
                                                    }
                                                    i29 = i2;
                                                    zzfzVar5 = zzfzVar7;
                                                    i32 = i59;
                                                    unsafe4 = unsafe7;
                                                    i34 = i28;
                                                    i30 = i40;
                                                    i31 = i41;
                                                    if (i51 != i31) {
                                                    }
                                                } else {
                                                    i29 = i2;
                                                    i31 = i41;
                                                    zzfzVar5 = zzfzVar7;
                                                    i30 = i62;
                                                    i32 = i59;
                                                    unsafe4 = unsafe7;
                                                    i34 = i28;
                                                    i51 = i31;
                                                    if (i51 != i31) {
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            i29 = i2;
                                            zzfzVar5 = zzfzVar7;
                                            i30 = i62;
                                            i31 = i63;
                                            i32 = i59;
                                            unsafe4 = unsafe7;
                                            if (i60 == 3) {
                                                int i113 = (i30 & (-8)) | 4;
                                                int i114 = i28;
                                                zzix zzv = zzv(i114);
                                                i34 = i114;
                                                i51 = zzga.zzc(zzv, bArr, i31, i2, i113, zzfzVar);
                                                zzhoVar2.add(zzfzVar5.zzc);
                                                while (i51 < i29) {
                                                    int zzh15 = zzga.zzh(bArr, i51, zzfzVar5);
                                                    if (i30 == zzfzVar5.zza) {
                                                        i51 = zzga.zzc(zzv, bArr, zzh15, i2, i113, zzfzVar);
                                                        zzhoVar2.add(zzfzVar5.zzc);
                                                    } else if (i51 != i31) {
                                                    }
                                                }
                                                if (i51 != i31) {
                                                }
                                            }
                                            i34 = i28;
                                            i51 = i31;
                                            if (i51 != i31) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i60 == 2) {
                                zzho zzhoVar3 = (zzho) unsafe7.getObject(obj3, j);
                                if (!zzhoVar3.zzc()) {
                                    int size3 = zzhoVar3.size();
                                    zzhoVar3 = zzhoVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe7.putObject(obj3, j, zzhoVar3);
                                }
                                i49 = i3;
                                zzfzVar6 = zzfzVar7;
                                i51 = zzga.zze(zzv(i64), i62, bArr, i63, i2, zzhoVar3, zzfzVar);
                                unsafe6 = unsafe7;
                                i52 = i64;
                                i48 = i2;
                                i56 = i11;
                                i53 = i62;
                                i50 = 0;
                                i54 = i10;
                                i55 = i59;
                            } else {
                                i26 = i64;
                                unsafe3 = unsafe7;
                                zzfzVar4 = zzfzVar7;
                                i27 = i62;
                                i12 = i59;
                                i4 = i3;
                                i50 = i26;
                                zzfzVar2 = zzfzVar4;
                                unsafe = unsafe3;
                                i14 = i27;
                                i9 = i63;
                            }
                        } else {
                            int i115 = iArr[i8 + 2];
                            int i116 = 1 << (i115 >>> 20);
                            int i117 = i115 & 1048575;
                            if (i117 != i56) {
                                if (i56 != 1048575) {
                                    unsafe6.putInt(obj3, i56, i54);
                                }
                                i54 = i117 == 1048575 ? 0 : unsafe6.getInt(obj3, i117);
                                i11 = i117;
                            } else {
                                i11 = i56;
                            }
                            switch (zzr) {
                                case 0:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 1) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i51 = i17 + 8;
                                        i54 |= i116;
                                        zzjq.zzo(obj3, j, Double.longBitsToDouble(zzga.zzn(bArr, i17)));
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 1:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 5) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i51 = i17 + 4;
                                        i54 |= i116;
                                        zzjq.zzp(obj3, j, Float.intBitsToFloat(zzga.zzb(bArr, i17)));
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 2:
                                case 3:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 0) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int i118 = i54 | i116;
                                        int zzk3 = zzga.zzk(bArr, i17, zzfzVar6);
                                        unsafe6.putLong(obj, j, zzfzVar6.zzb);
                                        i49 = i3;
                                        i54 = i118;
                                        i51 = zzk3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 4:
                                case 11:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 0) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i54 |= i116;
                                        i51 = zzga.zzh(bArr, i17, zzfzVar6);
                                        unsafe6.putInt(obj3, j, zzfzVar6.zza);
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 5:
                                case 14:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 1) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        unsafe6.putLong(obj, j, zzga.zzn(bArr, i17));
                                        i49 = i3;
                                        i51 = i17 + 8;
                                        i54 = i116 | i54;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 6:
                                case 13:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 5) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i51 = i17 + 4;
                                        i54 |= i116;
                                        unsafe6.putInt(obj3, j, zzga.zzb(bArr, i17));
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 7:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 0) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i54 |= i116;
                                        i51 = zzga.zzk(bArr, i17, zzfzVar6);
                                        zzjq.zzm(obj3, j, zzfzVar6.zzb != 0);
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                case 8:
                                    int i119 = i6;
                                    i18 = i8;
                                    int i120 = i62;
                                    if (i60 != 2) {
                                        i19 = i54;
                                        i20 = i119;
                                        unsafe2 = unsafe6;
                                        i62 = i120;
                                        i21 = i18;
                                        i22 = i59;
                                        i13 = 0;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        if ((i61 & C0366C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
                                            int i121 = i54 | i116;
                                            int zzh16 = zzga.zzh(bArr, i119, zzfzVar6);
                                            int i122 = zzfzVar6.zza;
                                            if (i122 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i122 == 0) {
                                                zzfzVar6.zzc = "";
                                                i23 = i121;
                                                i62 = i120;
                                                i50 = 0;
                                            } else {
                                                int i123 = zzjt.zza;
                                                int length = bArr.length;
                                                if ((((length - zzh16) - i122) | zzh16 | i122) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh16), Integer.valueOf(i122)));
                                                }
                                                int i124 = zzh16 + i122;
                                                char[] cArr = new char[i122];
                                                int i125 = 0;
                                                while (zzh16 < i124) {
                                                    byte b = bArr[zzh16];
                                                    if (zzjr.zzd(b)) {
                                                        zzh16++;
                                                        cArr[i125] = (char) b;
                                                        i125++;
                                                    } else {
                                                        while (zzh16 < i124) {
                                                            int i126 = zzh16 + 1;
                                                            byte b2 = bArr[zzh16];
                                                            if (zzjr.zzd(b2)) {
                                                                cArr[i125] = (char) b2;
                                                                i125++;
                                                                zzh16 = i126;
                                                                while (zzh16 < i124) {
                                                                    byte b3 = bArr[zzh16];
                                                                    if (zzjr.zzd(b3)) {
                                                                        zzh16++;
                                                                        cArr[i125] = (char) b3;
                                                                        i125++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i127 = i121;
                                                                if (b2 >= -32) {
                                                                    int i128 = i120;
                                                                    String str2 = str;
                                                                    if (b2 < -16) {
                                                                        if (i126 >= i124 - 1) {
                                                                            throw new zzhr(str2);
                                                                        }
                                                                        zzjr.zzb(b2, bArr[i126], bArr[zzh16 + 2], cArr, i125);
                                                                        str = str2;
                                                                        i125++;
                                                                        i121 = i127;
                                                                        i120 = i128;
                                                                        zzh16 += 3;
                                                                    } else {
                                                                        if (i126 >= i124 - 2) {
                                                                            throw new zzhr(str2);
                                                                        }
                                                                        byte b4 = bArr[i126];
                                                                        int i129 = zzh16 + 3;
                                                                        byte b5 = bArr[zzh16 + 2];
                                                                        zzh16 += 4;
                                                                        zzjr.zza(b2, b4, b5, bArr[i129], cArr, i125);
                                                                        i125 += 2;
                                                                        str = str2;
                                                                        i121 = i127;
                                                                        i120 = i128;
                                                                    }
                                                                } else {
                                                                    if (i126 >= i124) {
                                                                        throw new zzhr(str);
                                                                    }
                                                                    zzh16 += 2;
                                                                    zzjr.zzc(b2, bArr[i126], cArr, i125);
                                                                    i125++;
                                                                    i121 = i127;
                                                                }
                                                            }
                                                        }
                                                        i23 = i121;
                                                        i62 = i120;
                                                        i50 = 0;
                                                        zzfzVar6.zzc = new String(cArr, 0, i125);
                                                        zzh16 = i124;
                                                    }
                                                }
                                                while (zzh16 < i124) {
                                                }
                                                i23 = i121;
                                                i62 = i120;
                                                i50 = 0;
                                                zzfzVar6.zzc = new String(cArr, 0, i125);
                                                zzh16 = i124;
                                            }
                                            i51 = zzh16;
                                            i54 = i23;
                                        } else {
                                            i62 = i120;
                                            i50 = 0;
                                            i51 = zzga.zzh(bArr, i119, zzfzVar6);
                                            int i130 = zzfzVar6.zza;
                                            if (i130 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i54 |= i116;
                                            if (i130 == 0) {
                                                zzfzVar6.zzc = "";
                                            } else {
                                                zzfzVar6.zzc = new String(bArr, i51, i130, zzhp.zza);
                                                i51 += i130;
                                            }
                                        }
                                        unsafe6.putObject(obj3, j, zzfzVar6.zzc);
                                        i49 = i3;
                                        i52 = i18;
                                        i56 = i11;
                                        i53 = i62;
                                        i55 = i59;
                                        i48 = i2;
                                    }
                                    break;
                                case 9:
                                    i24 = i8;
                                    i25 = i62;
                                    if (i60 != 2) {
                                        i20 = i6;
                                        i19 = i54;
                                        unsafe2 = unsafe6;
                                        i62 = i25;
                                        i21 = i24;
                                        i22 = i59;
                                        i13 = 0;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int i131 = i54 | i116;
                                        Object zzx = zzx(obj3, i24);
                                        i51 = zzga.zzm(zzx, zzv(i24), bArr, i6, i2, zzfzVar);
                                        zzF(obj3, i24, zzx);
                                        i54 = i131;
                                        i53 = i25;
                                        i52 = i24;
                                        i56 = i11;
                                        i55 = i59;
                                        i50 = 0;
                                        i48 = i2;
                                        i49 = i3;
                                    }
                                case 10:
                                    i24 = i8;
                                    i25 = i62;
                                    if (i60 != 2) {
                                        i20 = i6;
                                        i19 = i54;
                                        unsafe2 = unsafe6;
                                        i62 = i25;
                                        i21 = i24;
                                        i22 = i59;
                                        i13 = 0;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i54 |= i116;
                                        i51 = zzga.zza(bArr, i6, zzfzVar6);
                                        unsafe6.putObject(obj3, j, zzfzVar6.zzc);
                                        i53 = i25;
                                        i52 = i24;
                                        i56 = i11;
                                        i55 = i59;
                                        i50 = 0;
                                        i48 = i2;
                                        i49 = i3;
                                    }
                                case 12:
                                    i24 = i8;
                                    i25 = i62;
                                    if (i60 != 0) {
                                        i20 = i6;
                                        i19 = i54;
                                        unsafe2 = unsafe6;
                                        i62 = i25;
                                        i21 = i24;
                                        i22 = i59;
                                        i13 = 0;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i51 = zzga.zzh(bArr, i6, zzfzVar6);
                                        int i132 = zzfzVar6.zza;
                                        zzhm zzu3 = zzu(i24);
                                        if ((i61 & Integer.MIN_VALUE) == 0 || zzu3 == null || zzu3.zza(i132)) {
                                            i54 |= i116;
                                            unsafe6.putInt(obj3, j, i132);
                                        } else {
                                            zzd(obj).zzj(i25, Long.valueOf(i132));
                                        }
                                        i53 = i25;
                                        i52 = i24;
                                        i56 = i11;
                                        i55 = i59;
                                        i50 = 0;
                                        i48 = i2;
                                        i49 = i3;
                                    }
                                case 15:
                                    i24 = i8;
                                    i25 = i62;
                                    if (i60 != 0) {
                                        i20 = i6;
                                        i19 = i54;
                                        unsafe2 = unsafe6;
                                        i62 = i25;
                                        i21 = i24;
                                        i22 = i59;
                                        i13 = 0;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i54 |= i116;
                                        i51 = zzga.zzh(bArr, i6, zzfzVar6);
                                        unsafe6.putInt(obj3, j, zzgn.zzb(zzfzVar6.zza));
                                        i53 = i25;
                                        i52 = i24;
                                        i56 = i11;
                                        i55 = i59;
                                        i50 = 0;
                                        i48 = i2;
                                        i49 = i3;
                                    }
                                case 16:
                                    if (i60 != 0) {
                                        i20 = i6;
                                        i19 = i54;
                                        unsafe2 = unsafe6;
                                        zzfzVar3 = zzfzVar6;
                                        i13 = 0;
                                        i21 = i8;
                                        i22 = i59;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int i133 = i54 | i116;
                                        int zzk4 = zzga.zzk(bArr, i6, zzfzVar6);
                                        i24 = i8;
                                        i25 = i62;
                                        unsafe6.putLong(obj, j, zzgn.zzc(zzfzVar6.zzb));
                                        i54 = i133;
                                        i51 = zzk4;
                                        i53 = i25;
                                        i52 = i24;
                                        i56 = i11;
                                        i55 = i59;
                                        i50 = 0;
                                        i48 = i2;
                                        i49 = i3;
                                    }
                                default:
                                    i17 = i6;
                                    i18 = i8;
                                    i50 = 0;
                                    if (i60 != 3) {
                                        i19 = i54;
                                        i20 = i17;
                                        i13 = i50;
                                        unsafe2 = unsafe6;
                                        i21 = i18;
                                        i22 = i59;
                                        zzfzVar3 = zzfzVar6;
                                        i10 = i19;
                                        unsafe = unsafe2;
                                        i50 = i21;
                                        zzfzVar2 = zzfzVar3;
                                        i14 = i62;
                                        i12 = i22;
                                        i9 = i20;
                                        i4 = i3;
                                        break;
                                    } else {
                                        Object zzx2 = zzx(obj3, i18);
                                        int zzl2 = zzga.zzl(zzx2, zzv(i18), bArr, i17, i2, (i59 << 3) | 4, zzfzVar);
                                        zzF(obj3, i18, zzx2);
                                        i49 = i3;
                                        zzfzVar6 = zzfzVar;
                                        i55 = i59;
                                        unsafe6 = unsafe6;
                                        i52 = i18;
                                        i48 = i2;
                                        i51 = zzl2;
                                        i56 = i11;
                                        i53 = i62;
                                        i50 = 0;
                                        i54 |= i116;
                                    }
                            }
                        }
                    } else {
                        i9 = i6;
                        i10 = i54;
                        i11 = i56;
                        i12 = i59;
                        i13 = i50;
                        unsafe = unsafe6;
                        zzfzVar2 = zzfzVar6;
                        i4 = i49;
                        i14 = i5;
                    }
                    if (i14 == i4 || i4 == 0) {
                        if (this.zzh) {
                            zzgw zzgwVar = zzfzVar2.zzd;
                            int i134 = zzgw.zzb;
                            int i135 = zziu.zza;
                            if (zzgwVar != zzgw.zza) {
                                zzim zzimVar = this.zzg;
                                zzgw zzgwVar2 = zzfzVar2.zzd;
                                int i136 = zzga.zza;
                                if (zzgwVar2.zzb(zzimVar, i12) != null) {
                                    throw null;
                                }
                                i15 = i12;
                                i16 = i14;
                                i51 = zzga.zzg(i14, bArr, i9, i2, zzd(obj), zzfzVar);
                                i48 = i2;
                                i49 = i4;
                                i52 = i50;
                                i53 = i16;
                                i55 = i15;
                                i56 = i11;
                                i50 = i13;
                                i54 = i10;
                                unsafe6 = unsafe;
                                zzfzVar6 = zzfzVar2;
                            }
                        }
                        i15 = i12;
                        i16 = i14;
                        i51 = zzga.zzg(i16, bArr, i9, i2, zzd(obj), zzfzVar);
                        i48 = i2;
                        i49 = i4;
                        i52 = i50;
                        i53 = i16;
                        i55 = i15;
                        i56 = i11;
                        i50 = i13;
                        i54 = i10;
                        unsafe6 = unsafe;
                        zzfzVar6 = zzfzVar2;
                    } else {
                        i51 = i9;
                        i53 = i14;
                        i56 = i11;
                        i54 = i10;
                    }
                } else {
                    zzq = zzq(i59, i50);
                }
                i8 = zzq;
                i7 = -1;
                if (i8 == i7) {
                }
                if (i14 == i4) {
                }
                if (this.zzh) {
                }
                i15 = i12;
                i16 = i14;
                i51 = zzga.zzg(i16, bArr, i9, i2, zzd(obj), zzfzVar);
                i48 = i2;
                i49 = i4;
                i52 = i50;
                i53 = i16;
                i55 = i15;
                i56 = i11;
                i50 = i13;
                i54 = i10;
                unsafe6 = unsafe;
                zzfzVar6 = zzfzVar2;
            } else {
                unsafe = unsafe6;
                i4 = i49;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(Integer.MAX_VALUE);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                ((zzho) zzjq.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzjq.zzo(obj, j, zzjq.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzho zzhoVar = (zzho) zzjq.zzf(obj, j);
                    zzho zzhoVar2 = (zzho) zzjq.zzf(obj2, j);
                    int size = zzhoVar.size();
                    int size2 = zzhoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVar.zzc()) {
                            zzhoVar = zzhoVar.zzd(size2 + size);
                        }
                        zzhoVar.addAll(zzhoVar2);
                    }
                    if (size > 0) {
                        zzhoVar2 = zzhoVar;
                    }
                    zzjq.zzs(obj, j, zzhoVar2);
                    break;
                case 50:
                    int i4 = zziz.zza;
                    zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzfzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        Map.Entry entry3;
        if (this.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            if (!zzhbVar.zza.isEmpty()) {
                entry = (Map.Entry) zzhbVar.zze().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzs = zzs(i);
                    int[] iArr2 = this.zzc;
                    int zzr = zzr(zzs);
                    int i8 = iArr2[i];
                    if (zzr <= 17) {
                        int i9 = iArr2[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzs & i5;
                    switch (zzr) {
                        case 0:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzf(i8, zzjq.zza(obj, j));
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 1:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzo(i8, zzjq.zzb(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 2:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzt(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 3:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzK(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 4:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzr(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 5:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzm(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 6:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzk(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 7:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzb(i8, zzjq.zzw(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 8:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzO(i8, unsafe.getObject(obj, j), zzjwVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 9:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzv(i8, unsafe.getObject(obj, j), zzv(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 10:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzd(i8, (zzgk) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 11:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzI(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 12:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzi(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 13:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzx(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 14:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzz(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 15:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzB(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 16:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzD(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 17:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzq(i8, unsafe.getObject(obj, j), zzv(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            entry = entry3;
                            i7 = i3;
                            i5 = 1048575;
                        case 18:
                            zziz.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 19:
                            zziz.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 20:
                            zziz.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 21:
                            zziz.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 22:
                            zziz.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 23:
                            zziz.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 24:
                            zziz.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 25:
                            zziz.zzq(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 26:
                            int i11 = this.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zziz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzjwVar.zzH(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = this.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzix zzv = zzv(i);
                            int i14 = zziz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzgs) zzjwVar).zzv(i13, list2.get(i15), zzv);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = this.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zziz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzjwVar.zze(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zziz.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 30:
                            zziz.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 31:
                            zziz.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 32:
                            zziz.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 33:
                            zziz.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 34:
                            zziz.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            break;
                        case 35:
                            zziz.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 36:
                            zziz.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 37:
                            zziz.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 38:
                            zziz.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 39:
                            zziz.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 40:
                            zziz.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 41:
                            zziz.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 42:
                            zziz.zzq(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 43:
                            zziz.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 44:
                            zziz.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 45:
                            zziz.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 46:
                            zziz.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 47:
                            zziz.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 48:
                            zziz.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            int i18 = this.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzix zzv2 = zzv(i);
                            int i19 = zziz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzgs) zzjwVar).zzq(i18, list4.get(i20), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzf(i8, zzm(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzo(i8, zzn(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzt(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzK(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzr(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzm(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzk(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzb(i8, zzN(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzM(obj, i8, i)) {
                                zzO(i8, unsafe.getObject(obj, j), zzjwVar);
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzv(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzd(i8, (zzgk) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzI(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzi(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzx(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzz(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzB(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzD(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzM(obj, i8, i)) {
                                zzjwVar.zzq(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            }
                            break;
                    }
                    entry3 = entry;
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i3;
                    i5 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    ((zzhk) obj).zzc.zzl(zzjwVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzjq.zza(obj, j)) == Double.doubleToLongBits(zzjq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzjq.zzb(obj, j)) == Float.floatToIntBits(zzjq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzjq.zzw(obj, j) == zzjq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                case 68:
                    long zzp = zzp(i) & 1048575;
                    if (zzjq.zzc(obj, zzp) == zzjq.zzc(obj2, zzp) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }
}
