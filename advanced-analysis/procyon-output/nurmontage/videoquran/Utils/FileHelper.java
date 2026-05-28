// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.os.Environment;
import java.io.File;
import android.content.Context;

public class FileHelper
{
    private Context context;
    
    public FileHelper(final Context context) {
        this.context = context;
    }
    
    public File createPublicVideoFolder(final String child) {
        final File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), child);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                System.err.println("Failed to create folder: " + file.getAbsolutePath());
                return null;
            }
            System.out.println("Folder created successfully: " + file.getAbsolutePath());
        }
        return file;
    }
    
    public File createVideoFolder(final String child) {
        final File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_MOVIES), child);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                System.err.println("Failed to create folder: " + file.getAbsolutePath());
                return null;
            }
            System.out.println("Folder created successfully: " + file.getAbsolutePath());
        }
        return file;
    }
}
