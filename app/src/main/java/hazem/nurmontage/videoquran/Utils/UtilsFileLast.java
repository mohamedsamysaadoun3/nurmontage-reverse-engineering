package hazem.nurmontage.videoquran.Utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import androidx.media3.common.MimeTypes;

/* loaded from: classes2.dex */
public class UtilsFileLast {
    private static final String TAG = "UtilsFileLast";

    private static String extractNumericId(String textValue) {
        return textValue;
    }

    public static Typeface loadFontFromAsset(Context context, String textValue) {
        try {
            return Typeface.createFromAsset(context.getAssets(), textValue);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getPath(Context context, Uri uri) {
        Uri uri2;
        Log.d(TAG, "getPath called with URI: " + uri);
        if (context == null || uri == null) {
            Log.e(TAG, "Context or URI is null");
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Log.d(TAG, "URI is a document URI");
            if (isExternalStorageDocument(uri)) {
                Log.d(TAG, "URI is an external storage document");
                String documentId = DocumentsContract.getDocumentId(uri);
                String[] split = documentId.split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    String textValue = Environment.getExternalStorageDirectory() + "/" + split[1];
                    Log.d(TAG, "External storage path (primary): " + textValue);
                    return textValue;
                }
                Log.d(TAG, "External storage path (non-primary): " + documentId);
                String pathFromTreeUri = getPathFromTreeUri(context, DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", documentId), split[1]);
                if (pathFromTreeUri != null) {
                    return pathFromTreeUri;
                }
                return null;
            }
            if (isDownloadsDocument(uri)) {
                Log.d(TAG, "URI is a downloads document");
                String documentId2 = DocumentsContract.getDocumentId(uri);
                String extractNumericId = extractNumericId(documentId2);
                if (extractNumericId == null) {
                    Log.e(TAG, "Could not extract numeric ID from downloads document ID: " + documentId2);
                    return null;
                }
                try {
                    String dataColumn = getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(extractNumericId)), null, null);
                    Log.d(TAG, "Downloads document path: " + dataColumn);
                    return dataColumn;
                } catch (NumberFormatException e) {
                    Log.e(TAG, "Error parsing numeric ID from downloads document ID: " + extractNumericId, e);
                    return null;
                }
            }
            if (isMediaDocument(uri)) {
                Log.d(TAG, "URI is a media document");
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = split2[0];
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (MimeTypes.BASE_TYPE_VIDEO.equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (MimeTypes.BASE_TYPE_AUDIO.equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else {
                    Log.w(TAG, "Unsupported media document type: " + str2);
                    return null;
                }
                String dataColumn2 = getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                Log.d(TAG, "Media document path: " + dataColumn2);
                return dataColumn2;
            }
            Log.w(TAG, "Unsupported document URI: " + uri);
            return null;
        }
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            Log.d(TAG, "URI is a content URI");
            String dataColumn3 = getDataColumn(context, uri, null, null);
            Log.d(TAG, "Content URI path: " + dataColumn3);
            return dataColumn3;
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            Log.d(TAG, "URI is a file URI");
            String path = uri.getPath();
            Log.d(TAG, "File URI path: " + path);
            return path;
        }
        Log.w(TAG, "Unsupported URI scheme: " + uri.getScheme());
        return null;
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
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
    private static String getDataColumn(Context context, Uri uri, String textValue, String[] strArr) {
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
                        Log.e(TAG, "Error getting data column", e);
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0097, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00aa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        r4.close();
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ac: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:47:0x00ac */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getPathFromTreeUri(Context context, Uri uri, String textValue) {
        Cursor cursor;
        Cursor cursor2;
        String pathFromTreeUri;
        Cursor cursor3 = null;
        try {
            try {
                cursor = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUri(uri.toString(), DocumentsContract.getTreeDocumentId(uri)), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            do {
                                String string = cursor.getString(cursor.getColumnIndexOrThrow("document_id"));
                                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
                                String string3 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                                if (string2.equals(textValue)) {
                                    if ("vnd.android.document/directory".equals(string3)) {
                                        String pathFromTreeUri2 = getPathFromTreeUri(context, DocumentsContract.buildDocumentUriUsingTree(uri, string), textValue);
                                        if (pathFromTreeUri2 != null) {
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return pathFromTreeUri2;
                                        }
                                    } else {
                                        String dataColumn = getDataColumn(context, DocumentsContract.buildDocumentUriUsingTree(uri, string), null, null);
                                        if (dataColumn != null) {
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return dataColumn;
                                        }
                                    }
                                } else if (string3.equals("vnd.android.document/directory") && (pathFromTreeUri = getPathFromTreeUri(context, DocumentsContract.buildDocumentUriUsingTree(uri, string), textValue)) != null) {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return pathFromTreeUri;
                                }
                            } while (cursor.moveToNext());
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e(TAG, "Error in getPathFromTreeUri", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }
}
