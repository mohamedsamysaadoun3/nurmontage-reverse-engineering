/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FontUtils {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static void copyFontToInternalStorage(Context object, String object2) {
        int n;
        int n2;
        Object object3 = "fonts/arabic/";
        AssetManager assetManager = object.getAssets();
        File file = new File((File)(object = object.getFilesDir()), (String)object2);
        boolean bl = file.exists();
        if (bl) return;
        object = new StringBuilder((String)object3);
        object = ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        object = assetManager.open((String)object);
        object2 = new FileOutputStream(file);
        int n3 = 1024;
        object3 = new byte[n3];
        while ((n2 = ((InputStream)object).read((byte[])object3)) != (n = -1)) {
            n = 0;
            file = null;
            ((OutputStream)object2).write((byte[])object3, 0, n2);
        }
        ((OutputStream)object2).flush();
        ((OutputStream)object2).close();
        if (object == null) return;
        ((InputStream)object).close();
        return;
        catch (Throwable throwable) {
            try {
                ((OutputStream)object2).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    if (object == null) throw throwable3;
                    try {
                        ((InputStream)object).close();
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        try {
                            throwable3.addSuppressed(throwable4);
                            throw throwable3;
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

