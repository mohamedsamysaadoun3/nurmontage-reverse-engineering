/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class QuranReader {
    private final Context context;

    public QuranReader(Context context) {
        this.context = context;
    }

    /*
     * Loose catch block
     */
    public String getAyahText(int n, int n2) {
        Object object = "quran/quran-simple.txt";
        Object object2 = this.context;
        object2 = object2.getAssets();
        object = object2.open((String)object);
        Object object3 = StandardCharsets.UTF_8;
        Object object4 = new InputStreamReader((InputStream)object, (Charset)object3);
        object2 = new BufferedReader((Reader)object4);
        while ((object = ((BufferedReader)object2).readLine()) != null) {
            object4 = "\\|";
        }
        {
            catch (IOException iOException) {
                iOException.printStackTrace();
                StringBuilder stringBuilder = new StringBuilder("Error reading file: ");
                String string2 = iOException.getMessage();
                return stringBuilder.append(string2).toString();
            }
        }
        {
            object = object.split((String)object4);
            int n3 = ((String[])object).length;
            int n4 = 3;
            if (n3 != n4) continue;
            n3 = 0;
            object4 = null;
            object4 = object[0];
            n3 = Integer.parseInt((String)object4);
            n4 = 1;
            object3 = object[n4];
            n4 = Integer.parseInt((String)object3);
            int n5 = 2;
            try {
                object = object[n5];
                if (n3 != n || n4 != n2) continue;
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                continue;
            }
        }
        return "Ayah not found";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public String getTranslationAyahText(String var1_1, int var2_8, int var3_9) {
        block36: {
            block37: {
                block35: {
                    var4_10 = "quran/";
                    var5_11 = null;
                    var6_12 /* !! */  = this.context;
                    var6_12 /* !! */  = var6_12 /* !! */ .getAssets();
                    var7_13 /* !! */  = new StringBuilder((String)var4_10);
                    var1_1 = var7_13 /* !! */ .append((String)var1_1);
                    var1_1 = var1_1.toString();
                    var1_1 = var6_12 /* !! */ .open((String)var1_1);
                    var7_13 /* !! */  = StandardCharsets.UTF_8;
                    var6_12 /* !! */  = new InputStreamReader((InputStream)var1_1, (Charset)var7_13 /* !! */ );
                    var4_10 = new BufferedReader((Reader)var6_12 /* !! */ );
                    var1_1 = new StringBuilder();
                    var1_1 = var1_1.append(var2_8);
                    var8_14 = "|";
                    var1_1 = var1_1.append(var8_14);
                    var1_1 = var1_1.append(var3_9);
                    var1_1 = var1_1.toString();
                    while (true) {
                        var8_14 = var4_10.readLine();
                        if (var8_14 == null) break block35;
                        if ((var3_9 = (int)var8_14.startsWith((String)var1_1)) == 0) continue;
                        break;
                    }
                    var9_17 = var1_1.length();
                    var1_1 = var8_14.substring(var9_17);
                    try {
                        var4_10.close();
                        return var1_1;
                    }
                    catch (IOException var8_15) {
                        var8_15.printStackTrace();
                    }
                    return var1_1;
                }
                try {}
                catch (IOException var1_6) {
                    var1_6.printStackTrace();
                    return "Aya Not Found !";
                }
                break block37;
                catch (Throwable var1_4) {
                    break block36;
                }
                catch (Exception var1_5) {
                    // empty catch block
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    var5_11 = var4_10;
                    break block36;
                }
                catch (Exception var1_3) {
                    var5_11 = var4_10;
                    ** GOTO lbl-1000
                }
            }
            var4_10.close();
            return "Aya Not Found !";
lbl-1000:
            // 2 sources

            {
                var1_1.printStackTrace();
                if (var5_11 == null) return "Aya Not Found !";
            }
            {
                var5_11.close();
                return "Aya Not Found !";
            }
        }
        if (var5_11 == null) throw var1_7;
        try {
            var5_11.close();
            throw var1_7;
        }
        catch (IOException var8_16) {
            var8_16.printStackTrace();
        }
        throw var1_7;
    }
}

