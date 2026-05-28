/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.PrintStream;

public class FileHelper {
    private Context context;

    public FileHelper(Context context) {
        this.context = context;
    }

    public File createPublicVideoFolder(String object) {
        Object object2 = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_MOVIES);
        Object object3 = new File((File)object2, (String)object);
        boolean bl = ((File)object3).exists();
        if (!bl) {
            bl = ((File)object3).mkdirs();
            if (bl) {
                object = System.out;
                object2 = new StringBuilder("Folder created successfully: ");
                String string2 = ((File)object3).getAbsolutePath();
                object2 = ((StringBuilder)object2).append(string2).toString();
                ((PrintStream)object).println((String)object2);
            } else {
                object = System.err;
                object2 = new StringBuilder("Failed to create folder: ");
                object3 = ((File)object3).getAbsolutePath();
                object3 = ((StringBuilder)object2).append((String)object3).toString();
                ((PrintStream)object).println((String)object3);
                return null;
            }
        }
        return object3;
    }

    public File createVideoFolder(String object) {
        Object object2 = this.context;
        String string2 = Environment.DIRECTORY_MOVIES;
        Object object3 = new File((File)(object2 = object2.getExternalFilesDir(string2)), (String)object);
        boolean bl = ((File)object3).exists();
        if (!bl) {
            bl = ((File)object3).mkdirs();
            if (bl) {
                object = System.out;
                object2 = new StringBuilder("Folder created successfully: ");
                string2 = ((File)object3).getAbsolutePath();
                object2 = ((StringBuilder)object2).append(string2).toString();
                ((PrintStream)object).println((String)object2);
            } else {
                object = System.err;
                object2 = new StringBuilder("Failed to create folder: ");
                object3 = ((File)object3).getAbsolutePath();
                object3 = ((StringBuilder)object2).append((String)object3).toString();
                ((PrintStream)object).println((String)object3);
                return null;
            }
        }
        return object3;
    }
}

