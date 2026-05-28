// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.database.Cursor;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import android.content.ContentUris;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.net.Uri;
import android.content.Context;
import java.io.File;

public class FileUtils
{
    public static boolean checkFileExists(final String pathname) {
        return new File(pathname).exists();
    }
    
    public static String getDataColumn(Context query, final Uri uri, final String s, final String[] array) {
        final String[] array2 = { null };
        final String s2 = "_data";
        array2[0] = s2;
        Object o = null;
        try {
            query = (Context)query.getContentResolver().query(uri, array2, s, array, (String)null);
            if (query != null) {
                try {
                    if (((Cursor)query).moveToFirst()) {
                        final String string = ((Cursor)query).getString(((Cursor)query).getColumnIndexOrThrow(s2));
                        if (query != null) {
                            ((Cursor)query).close();
                        }
                        return string;
                    }
                }
                finally {
                    o = query;
                }
            }
            if (query != null) {
                ((Cursor)query).close();
            }
            return null;
        }
        finally {}
        if (o != null) {
            ((Cursor)o).close();
        }
    }
    
    public static File getFile(final Context context) {
        final File externalFilesDir = context.getExternalFilesDir((String)null);
        if (externalFilesDir == null) {
            return null;
        }
        final boolean exists = externalFilesDir.exists();
        final String s = "! mkdirs.";
        final String s2 = "TAG getFileVideo";
        if (!exists && !externalFilesDir.mkdirs()) {
            Log.e(s2, s);
            return null;
        }
        final File file = new File(externalFilesDir, "Work_" + System.currentTimeMillis());
        if (!file.exists() && !file.mkdirs()) {
            Log.e(s2, s);
            return null;
        }
        return file;
    }
    
    public static File getFileFromUri(final Context context, Uri withAppendedId) {
        final boolean documentUri = DocumentsContract.isDocumentUri(context, withAppendedId);
        Object pathname = null;
        if (documentUri) {
            final boolean externalStorageDocument = isExternalStorageDocument(withAppendedId);
            final String s = ":";
            final int n = 1;
            if (externalStorageDocument) {
                final String[] split = DocumentsContract.getDocumentId(withAppendedId).split(s);
                if ("primary".equalsIgnoreCase(split[0])) {
                    pathname = Environment.getExternalStorageDirectory() + "/" + split[n];
                }
            }
            else if (isDownloadsDocument(withAppendedId)) {
                withAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), (long)Long.valueOf(DocumentsContract.getDocumentId(withAppendedId)));
                pathname = getDataColumn(context, withAppendedId, null, null);
            }
            else if (isMediaDocument(withAppendedId)) {
                final String[] split2 = DocumentsContract.getDocumentId(withAppendedId).split(s);
                final String anObject = split2[0];
                if ("image".equals(anObject)) {
                    pathname = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
                }
                else if ("video".equals(anObject)) {
                    pathname = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                }
                else if ("audio".equals(anObject)) {
                    pathname = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
                }
                final String[] array = new String[n];
                array[0] = split2[n];
                pathname = getDataColumn(context, (Uri)pathname, "_id=?", array);
            }
        }
        else if ("content".equalsIgnoreCase(withAppendedId.getScheme())) {
            pathname = getDataColumn(context, withAppendedId, null, null);
        }
        else if ("file".equalsIgnoreCase(withAppendedId.getScheme())) {
            pathname = withAppendedId.getPath();
        }
        return new File((String)pathname);
    }
    
    public static File getFileVideo(final String pathname) {
        final File parent = new File(pathname);
        final boolean exists = parent.exists();
        final String s = "! mkdirs.";
        final String s2 = "TAG getFileVideo";
        if (!exists && !parent.mkdirs()) {
            Log.e(s2, s);
            return null;
        }
        final File file = new File(parent, "VideoFrame");
        if (!file.exists() && !file.mkdirs()) {
            Log.e(s2, s);
            return null;
        }
        return file;
    }
    
    public static boolean isDownloadsDocument(final Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }
    
    public static boolean isExternalStorageDocument(final Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
    
    public static boolean isMediaDocument(final Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
