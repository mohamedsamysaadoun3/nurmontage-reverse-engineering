package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class FontUtils {
    public static void copyFontToInternalStorage(Context context, String textValue) {
        AssetManager assets = context.getAssets();
        File file = new File(context.getFilesDir(), textValue);
        if (file.exists()) {
            return;
        }
        try {
            InputStream open = assets.open("fonts/arabic/" + textValue);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (open != null) {
                        open.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
