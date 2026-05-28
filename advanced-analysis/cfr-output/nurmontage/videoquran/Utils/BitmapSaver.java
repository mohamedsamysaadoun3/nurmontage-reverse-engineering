/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BitmapSaver {
    private Context context;

    public BitmapSaver(Context context) {
        this.context = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public boolean saveBitmap(Bitmap var1_1, String var2_9) {
        block16: {
            var3_11 = this.context;
            var4_12 = 0;
            var5_13 = null;
            if ((var3_11 = var3_11.getExternalFilesDir(null)) == null) {
                return false;
            }
            var7_15 /* !! */  = new StringBuilder();
            var3_11 = var3_11.getAbsolutePath();
            var3_11 = var7_15 /* !! */ .append((String)var3_11);
            var7_15 /* !! */  = "/";
            var3_11 = var3_11.append((String)var7_15 /* !! */ );
            var2_9 = var3_11.append((String)var2_9).toString();
            var6_14 = new File((String)var2_9);
            try {
                var2_9 = new FileOutputStream(var6_14);
            }
            catch (Throwable var1_5) {
                break block16;
            }
            catch (IOException var1_6) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var3_11 = Bitmap.CompressFormat.JPEG;
                var4_12 = 90;
            }
            catch (Throwable var1_3) {
                var5_13 = var2_9;
                break block16;
            }
            catch (IOException var1_4) {
                var5_13 = var2_9;
                ** GOTO lbl-1000
            }
            {
                var1_1.compress((Bitmap.CompressFormat)var3_11, var4_12, (OutputStream)var2_9);
                var2_9.flush();
            }
            try {
                var2_9.close();
                return true;
            }
            catch (IOException var1_2) {
                var1_2.printStackTrace();
            }
            return true;
lbl-1000:
            // 2 sources

            {
                var1_1.printStackTrace();
                if (var5_13 == null) return false;
            }
            try {
                var5_13.close();
                return false;
            }
            catch (IOException var1_7) {
                var1_7.printStackTrace();
            }
            return false;
        }
        if (var5_13 == null) throw var1_8;
        try {
            var5_13.close();
            throw var1_8;
        }
        catch (IOException var2_10) {
            var2_10.printStackTrace();
        }
        throw var1_8;
    }
}

