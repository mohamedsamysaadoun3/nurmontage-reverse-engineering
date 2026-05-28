/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.net.Uri;
import hazem.nurmontage.videoquran.Utils.MFileUtils$FileInfo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MFileUtils {
    public static String formatDateShort(long l) {
        long l2 = 0L;
        long l3 = l - l2;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 <= 0) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd-yyyy", locale);
        Date date = new Date(l);
        return simpleDateFormat.format(date);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static MFileUtils$FileInfo getFileInfo(Context var0, String var1_2) {
        block31: {
            block32: {
                block30: {
                    block35: {
                        block33: {
                            block28: {
                                block29: {
                                    block34: {
                                        block26: {
                                            block27: {
                                                var2_6 = "date_modified";
                                                var3_10 = "_display_name";
                                                var4_11 = null;
                                                if (var1_2 == null) {
                                                    return null;
                                                }
                                                var5_12 = Uri.parse((String)var1_2);
                                                var6_13 = "content";
                                                var7_14 = var5_12.getScheme();
                                                var8_15 = var6_13.equalsIgnoreCase(var7_14);
                                                var9_16 = 0L;
                                                if (var8_15 == 0) break block33;
                                                var6_13 = var0.getContentResolver();
                                                var11_17 = 2;
                                                var12_18 = new String[var11_17];
                                                var11_17 = 0;
                                                var0 = null;
                                                var12_18[0] = var3_10;
                                                var11_17 = 1;
                                                var12_18[var11_17] = var2_6;
                                                var7_14 = var5_12;
                                                var0 = var6_13.query(var5_12, var12_18, null, null, null);
                                                if (var0 == null) break block26;
                                                var8_15 = var0.moveToFirst();
                                                if (var8_15 == 0) break block26;
                                                var13_19 = var0.getColumnIndex(var3_10);
                                                var14_20 = var0.getColumnIndex(var2_6);
                                                var8_15 = -1;
                                                if (var13_19 == var8_15) break block27;
                                                var4_11 = var0.getString(var13_19);
                                            }
                                            if (var14_20 == var8_15) break block26;
                                            try {
                                                var15_21 = var0.getLong(var14_20);
                                            }
                                            catch (Throwable var1_3) {
                                                var4_11 = var0;
                                                break block28;
                                            }
                                            catch (Exception var2_7) {
                                                var19_23 = var4_11;
                                                var4_11 = var0;
                                                var0 = var19_23;
                                                ** GOTO lbl-1000
                                            }
                                            var8_15 = var15_21 == var9_16 ? 0 : (var15_21 < var9_16 ? -1 : 1);
                                            if (var8_15 <= 0) break block26;
                                            var17_22 = 1000L;
                                            var15_21 *= var17_22;
                                            break block34;
                                        }
                                        var15_21 = var9_16;
                                    }
                                    if (var0 != null) {
                                        var0.close();
                                    }
                                    break block35;
                                    catch (Throwable var1_4) {
                                        break block28;
                                    }
                                    catch (Exception var2_8) {
                                        var11_17 = 0;
                                        var0 = null;
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        var2_9.printStackTrace();
                                        if (var4_11 == null) break block29;
                                    }
                                    var4_11.close();
                                }
                                var4_11 = var0;
                                break block33;
                            }
                            if (var4_11 == null) throw var1_5;
                            var4_11.close();
                            throw var1_5;
                        }
                        var15_21 = var9_16;
                    }
                    if (var4_11 != null && (var11_17 = (int)(var15_21 == var9_16 ? 0 : (var15_21 < var9_16 ? -1 : 1))) != 0) break block31;
                    var0 = "file";
                    var6_13 = var5_12.getScheme();
                    var11_17 = (int)var0.equalsIgnoreCase(var6_13);
                    if (var11_17 == 0) break block30;
                    var1_2 = var5_12.getPath();
                    var0 = new File(var1_2);
                    ** GOTO lbl89
                }
                var0 = new File(var1_2);
lbl89:
                // 2 sources

                var20_24 = var0.exists();
                if (!var20_24) break block31;
                if (var4_11 != null) break block32;
                var4_11 = var0.getName();
            }
            if (var20_24 = var15_21 == var9_16 ? 0 : (var15_21 < var9_16 ? -1 : 1)) break block31;
            try {
                var15_21 = var21_25 = var0.lastModified();
            }
            catch (Exception var0_1) {
                var0_1.printStackTrace();
            }
        }
        if (var4_11 != null) return new MFileUtils$FileInfo((String)var4_11, var15_21);
        var4_11 = var5_12.getLastPathSegment();
        return new MFileUtils$FileInfo((String)var4_11, var15_21);
    }
}

