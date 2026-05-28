// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.OutputStream;
import java.io.InputStream;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import android.content.Context;

public class FontUtils
{
    public static void copyFontToInternalStorage(Context open, String s) {
        final String str = "fonts/arabic/";
        final AssetManager assets = open.getAssets();
        final File file = new File(open.getFilesDir(), s);
        if (!file.exists()) {
            try {
                final StringBuilder sb = new StringBuilder(str);
                try {
                    final StringBuilder append = sb.append(s);
                    try {
                        open = (Context)assets.open(append.toString());
                        try {
                            s = (String)new FileOutputStream(file);
                            final int n = 1024;
                            try {
                                final byte[] array = new byte[n];
                                while (true) {
                                    final int read = ((InputStream)open).read(array);
                                    if (read == -1) {
                                        break;
                                    }
                                    ((OutputStream)s).write(array, 0, read);
                                }
                                ((OutputStream)s).flush();
                                ((OutputStream)s).close();
                                if (open != null) {
                                    ((InputStream)open).close();
                                }
                            }
                            finally {
                                try {
                                    ((OutputStream)s).close();
                                }
                                finally {
                                    final Throwable t;
                                    final Throwable exception;
                                    t.addSuppressed(exception);
                                }
                            }
                        }
                        finally {
                            if (open != null) {
                                try {
                                    ((InputStream)open).close();
                                }
                                finally {
                                    final Throwable exception2;
                                    ((Throwable)s).addSuppressed(exception2);
                                }
                            }
                        }
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                }
                catch (final IOException ex2) {}
            }
            catch (final IOException ex3) {}
        }
    }
}
