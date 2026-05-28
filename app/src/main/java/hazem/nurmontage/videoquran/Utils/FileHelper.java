package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public class FileHelper {
    private Context context;

    public FileHelper(Context context) {
        this.context = context;
    }

    public File createVideoFolder(String textValue) {
        File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_MOVIES), textValue);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("Folder created successfully: " + file.getAbsolutePath());
            } else {
                System.err.println("Failed to create folder: " + file.getAbsolutePath());
                return null;
            }
        }
        return file;
    }

    public File createPublicVideoFolder(String textValue) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), textValue);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("Folder created successfully: " + file.getAbsolutePath());
            } else {
                System.err.println("Failed to create folder: " + file.getAbsolutePath());
                return null;
            }
        }
        return file;
    }
}
