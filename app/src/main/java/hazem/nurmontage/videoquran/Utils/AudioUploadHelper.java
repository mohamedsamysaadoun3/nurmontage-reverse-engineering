package hazem.nurmontage.videoquran.Utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class AudioUploadHelper {
    private static final String TAG = "AudioUploadHelper";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File processAudioUriForUpload(Context context, Uri uri, String str) {
        File file;
        InputStream inputStream;
        ContentResolver contentResolver = context.getContentResolver();
        ?? r4 = 0;
        try {
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    try {
                        if (inputStream == null) {
                            Log.e(TAG, "Failed to open InputStream for URI: " + uri);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    Log.e(TAG, "Error closing InputStream", e);
                                }
                            }
                            return null;
                        }
                        file = new File(context.getExternalFilesDir(null), str);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Log.d(TAG, "Audio content copied to cache file: " + file.getAbsolutePath());
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e2) {
                                        Log.e(TAG, "Error closing InputStream", e2);
                                    }
                                }
                                return file;
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            Log.e(TAG, "IOException while processing URI: " + uri, e);
                            if (file != null && file.exists()) {
                                file.delete();
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e4) {
                                    Log.e(TAG, "Error closing InputStream", e4);
                                }
                            }
                            return null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        file = null;
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                    Log.e(TAG, "File not found for URI (or permission issue): " + uri, e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e7) {
                            Log.e(TAG, "Error closing InputStream", e7);
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = contentResolver;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException e8) {
                        Log.e(TAG, "Error closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            inputStream = null;
        } catch (IOException e10) {
            e = e10;
            file = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (r4 != 0) {
            }
            throw th;
        }
    }
}
