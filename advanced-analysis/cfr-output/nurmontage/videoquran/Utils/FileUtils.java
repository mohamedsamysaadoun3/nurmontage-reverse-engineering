/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video$Media
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;

public class FileUtils {
    public static boolean checkFileExists(String string2) {
        File file = new File(string2);
        return file.exists();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static String getDataColumn(Context context, Uri object, String string2, String[] stringArray) {
        void var1_4;
        Context context2;
        block9: {
            block10: {
                block11: {
                    int n;
                    ContentResolver contentResolver;
                    String string3 = "_data";
                    String[] stringArray2 = new String[]{string3};
                    context2 = null;
                    try {
                        contentResolver = context.getContentResolver();
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                        break block9;
                    }
                    {
                        context = contentResolver.query((Uri)object, stringArray2, string2, stringArray, null);
                        if (context == null) break block10;
                    }
                    try {
                        n = context.moveToFirst();
                        if (n == 0) break block10;
                    }
                    catch (Throwable throwable) {
                        context2 = context;
                        break block9;
                    }
                    {
                        n = context.getColumnIndexOrThrow(string3);
                    }
                    {
                        object = context.getString(n);
                        if (context == null) break block11;
                    }
                    context.close();
                }
                return object;
            }
            if (context != null) {
                context.close();
            }
            return null;
        }
        if (context2 != null) {
            context2.close();
        }
        throw var1_4;
    }

    public static File getFile(Context object) {
        if ((object = object.getExternalFilesDir(null)) == null) {
            return null;
        }
        boolean bl = ((File)object).exists();
        String string2 = "! mkdirs.";
        String string3 = "TAG getFileVideo";
        if (!bl && !(bl = ((File)object).mkdirs())) {
            Log.e((String)string3, (String)string2);
            return null;
        }
        String string4 = "Work_";
        CharSequence charSequence = new StringBuilder(string4);
        long l = System.currentTimeMillis();
        File file = new File((File)object, (String)(charSequence = charSequence.append(l).toString()));
        boolean bl2 = file.exists();
        if (!bl2 && !(bl2 = file.mkdirs())) {
            Log.e((String)string3, (String)string2);
            return null;
        }
        return file;
    }

    public static File getFileFromUri(Context object, Uri object2) {
        boolean bl = DocumentsContract.isDocumentUri((Context)object, (Uri)object2);
        String string2 = null;
        if (bl) {
            bl = FileUtils.isExternalStorageDocument((Uri)object2);
            String string3 = ":";
            int n = 1;
            if (bl) {
                Object object3 = "primary";
                object = DocumentsContract.getDocumentId((Uri)object2).split(string3);
                boolean bl2 = ((String)object3).equalsIgnoreCase((String)(object2 = object[0]));
                if (bl2) {
                    object2 = new StringBuilder();
                    object3 = Environment.getExternalStorageDirectory();
                    object2 = ((StringBuilder)object2).append(object3);
                    object3 = "/";
                    object2 = ((StringBuilder)object2).append((String)object3);
                    object = object[n];
                    object = ((StringBuilder)object2).append((String)object);
                    string2 = ((StringBuilder)object).toString();
                }
            } else {
                bl = FileUtils.isDownloadsDocument((Uri)object2);
                if (bl) {
                    object2 = DocumentsContract.getDocumentId((Uri)object2);
                    Uri uri = Uri.parse((String)"content://downloads/public_downloads");
                    long l = Long.valueOf((String)object2);
                    object2 = ContentUris.withAppendedId((Uri)uri, (long)l);
                    string2 = FileUtils.getDataColumn((Context)object, (Uri)object2, null, null);
                } else {
                    bl = FileUtils.isMediaDocument((Uri)object2);
                    if (bl) {
                        string3 = "image";
                        String[] stringArray = (object2 = DocumentsContract.getDocumentId((Uri)object2).split(string3))[0];
                        boolean bl3 = string3.equals(stringArray);
                        if (bl3) {
                            string2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else {
                            string3 = "video";
                            bl3 = string3.equals(stringArray);
                            if (bl3) {
                                string2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            } else {
                                string3 = "audio";
                                bl = string3.equals(stringArray);
                                if (bl) {
                                    string2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                }
                            }
                        }
                        stringArray = new String[n];
                        stringArray[0] = object2 = object2[n];
                        object2 = "_id=?";
                        string2 = FileUtils.getDataColumn((Context)object, (Uri)string2, (String)object2, stringArray);
                    }
                }
            }
        } else {
            String string4 = "content";
            String string5 = object2.getScheme();
            bl = string4.equalsIgnoreCase(string5);
            if (bl) {
                string2 = FileUtils.getDataColumn((Context)object, (Uri)object2, null, null);
            } else {
                object = "file";
                string4 = object2.getScheme();
                boolean bl4 = ((String)object).equalsIgnoreCase(string4);
                if (bl4) {
                    string2 = object2.getPath();
                }
            }
        }
        object = new File(string2);
        return object;
    }

    public static File getFileVideo(String object) {
        File file = new File((String)object);
        boolean bl = file.exists();
        String string2 = "! mkdirs.";
        String string3 = "TAG getFileVideo";
        if (!bl && !(bl = file.mkdirs())) {
            Log.e((String)string3, (String)string2);
            return null;
        }
        String string4 = "VideoFrame";
        object = new File(file, string4);
        boolean bl2 = ((File)object).exists();
        if (!bl2 && !(bl2 = ((File)object).mkdirs())) {
            Log.e((String)string3, (String)string2);
            return null;
        }
        return object;
    }

    public static boolean isDownloadsDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.providers.downloads.documents".equals(object);
    }

    public static boolean isExternalStorageDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.externalstorage.documents".equals(object);
    }

    public static boolean isMediaDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.providers.media.documents".equals(object);
    }
}

