package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MFileUtils {

    public static class FileInfo implements Serializable {
        public String formattedDate;
        public long lastModified;
        public String name;
        public String timedDate;

        public FileInfo(String filePath, long durationMs) {
            this.name = filePath;
            this.lastModified = durationMs;
            this.formattedDate = MFileUtils.formatDateShort(durationMs);
            if (durationMs > 0) {
                this.timedDate = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(durationMs));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(14:32|33|(3:38|39|(3:41|(1:43)|(3:45|46|(6:48|(1:37)|(5:16|17|(1:19)(1:29)|20|(3:(1:23)|24|(2:26|27)))|(1:13)|14|15))))|35|(0)|(1:10)|16|17|(0)(0)|20|(0)|(0)|14|15)|8|(0)|16|17|(0)(0)|20|(0)|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r13.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:17:0x007e, B:19:0x008a, B:20:0x0099, B:23:0x00a1, B:26:0x00a9, B:29:0x0094), top: B:16:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:17:0x007e, B:19:0x008a, B:20:0x0099, B:23:0x00a1, B:26:0x00a9, B:29:0x0094), top: B:16:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FileInfo getFileInfo(Context context, String filePath) {
        String filePath2;
        Cursor query;
        long durationMs;
        File file;
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        r2 = null;
        Cursor cursor2 = null;
        String filePath2 = null;
        if (filePath == null) {
            return null;
        }
        Uri parse = Uri.parse(filePath);
        try {
            if ("content".equalsIgnoreCase(parse.getScheme())) {
                try {
                    query = context.getContentResolver().query(parse, new String[]{"_display_name", "date_modified"}, null, null, null);
                } catch (Exception e) {
                    e = e;
                    filePath2 = null;
                }
                if (query != null) {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        String filePath4 = filePath2;
                        cursor2 = query;
                        filePath2 = filePath4;
                        e.printStackTrace();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        filePath2 = filePath2;
                        durationMs = 0;
                        if (filePath2 != null) {
                        }
                        if (!"file".equalsIgnoreCase(parse.getScheme())) {
                        }
                        if (file.exists()) {
                        }
                        if (filePath2 == null) {
                        }
                        return new FileInfo(filePath2, durationMs);
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_display_name");
                        int columnIndex2 = query.getColumnIndex("date_modified");
                        filePath2 = columnIndex != -1 ? query.getString(columnIndex) : null;
                        if (columnIndex2 != -1) {
                            long durationMs9 = query.getLong(columnIndex2);
                            if (durationMs9 > 0) {
                                durationMs = durationMs9 * 1000;
                                if (query != null) {
                                    query.close();
                                }
                                if (filePath2 != null || durationMs == 0) {
                                    if (!"file".equalsIgnoreCase(parse.getScheme())) {
                                        file = new File(parse.getPath());
                                    } else {
                                        file = new File(filePath);
                                    }
                                    if (file.exists()) {
                                        if (filePath2 == null) {
                                            filePath2 = file.getName();
                                        }
                                        if (durationMs == 0) {
                                            durationMs = file.lastModified();
                                        }
                                    }
                                }
                                if (filePath2 == null) {
                                    filePath2 = parse.getLastPathSegment();
                                }
                                return new FileInfo(filePath2, durationMs);
                            }
                        }
                    }
                }
                durationMs = 0;
                if (query != null) {
                }
                if (filePath2 != null) {
                }
                if (!"file".equalsIgnoreCase(parse.getScheme())) {
                }
                if (file.exists()) {
                }
                if (filePath2 == null) {
                }
                return new FileInfo(filePath2, durationMs);
            }
            durationMs = 0;
            if (filePath2 != null) {
            }
            if (!"file".equalsIgnoreCase(parse.getScheme())) {
            }
            if (file.exists()) {
            }
            if (str3 == null) {
            }
            return new FileInfo(str3, durationMs);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String formatDateShort(long j) {
        if (j <= 0) {
            return "";
        }
        return new SimpleDateFormat("MMM dd-yyyy", Locale.ENGLISH).format(new Date(j));
    }
}
