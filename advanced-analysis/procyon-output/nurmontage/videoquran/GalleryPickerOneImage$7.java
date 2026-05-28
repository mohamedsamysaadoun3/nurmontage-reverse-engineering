// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import hazem.nurmontage.videoquran.model.PhotoItem;
import android.content.ContentUris;
import android.provider.MediaStore$Images$Media;
import java.io.File;
import android.util.Log;
import java.util.HashSet;
import hazem.nurmontage.videoquran.model.ExploreItem;
import java.util.ArrayList;
import android.provider.MediaStore$Files;

class GalleryPickerOneImage$7 implements Runnable
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$7(final GalleryPickerOneImage this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final ContentResolver contentResolver = this.this$0.getContentResolver();
        final Uri contentUri = MediaStore$Files.getContentUri("external");
        final String[] array = new String[3];
        int i = 0;
        final String s = "_id";
        array[0] = s;
        final int n = 1;
        final String s2 = "_data";
        array[n] = s2;
        array[2] = "parent";
        final Cursor query = contentResolver.query(contentUri, array, "media_type=1", (String[])null, "date_added DESC");
        final ArrayList<ExploreItem> list = new ArrayList<ExploreItem>();
        final ArrayList list2 = new ArrayList();
        HashSet set = new HashSet();
        final String s3 = "";
        Log.e("query start", s3 + query);
        int j = 0;
        int n2 = 0;
        String s4 = null;
        while (query.moveToNext()) {
            final String parent = new File(query.getString(query.getColumnIndexOrThrow(s2))).getParent();
            if (!set.contains(parent)) {
                set.add(parent);
                final File file = new File(parent);
                File[] listFiles = file.listFiles();
                int k;
                String s5;
                if (listFiles != null) {
                    int length = listFiles.length;
                    int n3 = 0;
                    String absolutePath = null;
                    while (i < length) {
                        final int n4 = length;
                        final File file2 = listFiles[i];
                        final File[] array2 = listFiles;
                        if (this.this$0.isImageFile(file2)) {
                            ++n3;
                            if (absolutePath == null) {
                                absolutePath = file2.getAbsolutePath();
                                if (s4 == null) {
                                    s4 = absolutePath;
                                }
                            }
                        }
                        ++i;
                        length = n4;
                        listFiles = array2;
                    }
                    k = n3;
                    s5 = absolutePath;
                }
                else {
                    k = 0;
                    s5 = null;
                }
                if (k > 0) {
                    j += k;
                    list.add(new ExploreItem(file, parent, s3 + k, file.getName(), s5));
                }
            }
            list2.add(new PhotoItem(parent, ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow(s))).toString(), false));
            ++n2;
            if (n2 > 50) {
                break;
            }
            i = 0;
        }
        this.this$0.runOnUiThread((Runnable)new GalleryPickerOneImage$7$1(this, list2));
        String s6 = s4;
        while (query.moveToNext()) {
            final String parent2 = new File(query.getString(query.getColumnIndexOrThrow(s2))).getParent();
            HashSet set2;
            if (set.contains(parent2)) {
                set2 = set;
            }
            else {
                set.add(parent2);
                final File file3 = new File(parent2);
                File[] listFiles2 = file3.listFiles();
                int m;
                String s7;
                if (listFiles2 != null) {
                    final int length2 = listFiles2.length;
                    int l = 0;
                    m = 0;
                    String absolutePath2 = null;
                    while (l < length2) {
                        final HashSet set3 = set;
                        final File file4 = listFiles2[l];
                        final File[] array3 = listFiles2;
                        if (this.this$0.isImageFile(file4)) {
                            ++m;
                            if (absolutePath2 == null) {
                                absolutePath2 = file4.getAbsolutePath();
                                if (s6 == null) {
                                    s6 = absolutePath2;
                                }
                            }
                        }
                        ++l;
                        set = set3;
                        listFiles2 = array3;
                    }
                    set2 = set;
                    s7 = absolutePath2;
                }
                else {
                    set2 = set;
                    m = 0;
                    s7 = null;
                }
                if (m > 0) {
                    j += m;
                    list.add(new ExploreItem(file3, parent2, s3 + m, file3.getName(), s7));
                }
            }
            list2.add(new PhotoItem(parent2, ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow(s))).toString(), false));
            set = set2;
        }
        query.close();
        list.add(0, new ExploreItem(null, GalleryPickerOneImage.-$$Nest$fgetmResources(this.this$0).getString(R$string.all), s3 + j, GalleryPickerOneImage.-$$Nest$fgetmResources(this.this$0).getString(R$string.all), s6));
        this.this$0.runOnUiThread((Runnable)new GalleryPickerOneImage$7$2(this, list2, list));
    }
}
