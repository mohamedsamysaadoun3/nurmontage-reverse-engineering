// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.database.Cursor;
import android.content.ContentResolver;
import java.io.File;
import android.net.Uri;
import android.content.Context;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class MFileUtils
{
    public static String formatDateShort(final long date) {
        if (date <= 0L) {
            return "";
        }
        return new SimpleDateFormat("MMM dd-yyyy", Locale.ENGLISH).format(new Date(date));
    }
    
    public static MFileUtils$FileInfo getFileInfo(Context query, String path) {
        final String s = "date_modified";
        final String s2 = "_display_name";
        Object o = null;
        if (path == null) {
            return null;
        }
        final Uri parse = Uri.parse(path);
        final boolean equalsIgnoreCase = "content".equalsIgnoreCase(parse.getScheme());
        final long n = 0L;
        long n3 = 0L;
        Label_0288: {
            Label_0284: {
                if (equalsIgnoreCase) {
                    Label_0270: {
                        try {
                            try {
                                final ContentResolver contentResolver = query.getContentResolver();
                                final String[] array = new String[2];
                                query = null;
                                array[0] = s2;
                                array[1] = s;
                                query = (Context)contentResolver.query(parse, array, (String)null, (String[])null, (String)null);
                                Label_0225: {
                                    if (query != null) {
                                        try {
                                            if (((Cursor)query).moveToFirst()) {
                                                final int columnIndex = ((Cursor)query).getColumnIndex(s2);
                                                final int columnIndex2 = ((Cursor)query).getColumnIndex(s);
                                                final int n2 = -1;
                                                if (columnIndex != n2) {
                                                    o = ((Cursor)query).getString(columnIndex);
                                                }
                                                if (columnIndex2 != n2) {
                                                    n3 = ((Cursor)query).getLong(columnIndex2);
                                                    if (n3 > n) {
                                                        n3 *= 1000L;
                                                        break Label_0225;
                                                    }
                                                }
                                            }
                                        }
                                        catch (final Exception s) {
                                            o = query;
                                        }
                                        finally {
                                            o = query;
                                            break Label_0270;
                                        }
                                    }
                                    n3 = n;
                                }
                                if (query != null) {
                                    ((Cursor)query).close();
                                }
                                break Label_0288;
                            }
                            finally {}
                        }
                        catch (final Exception s) {
                            query = null;
                        }
                        ((Throwable)s).printStackTrace();
                        if (o != null) {
                            ((Cursor)o).close();
                        }
                        o = query;
                        break Label_0284;
                    }
                    if (o != null) {
                        ((Cursor)o).close();
                    }
                }
            }
            n3 = n;
        }
        Label_0407: {
            if (o == null || n3 == n) {
                final String s3 = "file";
                try {
                    Label_0346: {
                        if (!s3.equalsIgnoreCase(parse.getScheme())) {
                            break Label_0346;
                        }
                        File file = new(java.io.File.class)();
                        try {
                            path = parse.getPath();
                            new File(path);
                            if (!file.exists()) {
                                break Label_0407;
                            }
                            if (o == null) {
                                o = file.getName();
                            }
                            if (n3 == n) {
                                n3 = file.lastModified();
                            }
                            break Label_0407;
                            file = new File(path);
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                catch (final Exception ex2) {}
            }
        }
        if (o == null) {
            o = parse.getLastPathSegment();
        }
        return new MFileUtils$FileInfo((String)o, n3);
    }
}
