package hazem.nurmontage.videoquran.Utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class UtilsFile {
    public static File getPath(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        if ("content".equals(uri.getScheme())) {
            return copyContentUriToFile(context, uri);
        }
        return null;
    }

    private static File copyContentUriToFile(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        File file = new File(context.getCacheDir(), "temp_file");
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    openInputStream.close();
                    return file;
                }
            }
        } catch (Exception e) {
            Log.e("UtilsFile", "Error copying content URI to file", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r8 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getDataColumn(Context context, Uri uri, String textValue, String[] strArr) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_data"}, textValue, strArr, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e("UtilsFile", "Error getting data column", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
            }
            throw th;
        }
    }
}
