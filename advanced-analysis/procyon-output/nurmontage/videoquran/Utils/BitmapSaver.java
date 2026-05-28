// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.File;
import android.graphics.Bitmap;
import android.content.Context;

public class BitmapSaver
{
    private Context context;
    
    public BitmapSaver(final Context context) {
        this.context = context;
    }
    
    public boolean saveBitmap(final Bitmap bitmap, String string) {
        final Context context = this.context;
        Object o = null;
        final File externalFilesDir = context.getExternalFilesDir((String)null);
        if (externalFilesDir == null) {
            return false;
        }
        string = externalFilesDir.getAbsolutePath() + "/" + (String)string;
        final File file = new File((String)string);
        try {
            try {
                string = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap$CompressFormat.JPEG, 90, (OutputStream)string);
                    ((OutputStream)string).flush();
                    try {
                        ((FileOutputStream)string).close();
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                    return true;
                }
                catch (final IOException ex2) {}
                finally {
                    o = string;
                }
            }
            finally {}
        }
        catch (final IOException ex3) {}
        ((Throwable)bitmap).printStackTrace();
        if (o != null) {
            try {
                ((FileOutputStream)o).close();
            }
            catch (final IOException ex4) {
                ex4.printStackTrace();
            }
        }
        return false;
        if (o != null) {
            try {
                ((FileOutputStream)o).close();
            }
            catch (final IOException ex5) {
                ex5.printStackTrace();
            }
        }
    }
}
