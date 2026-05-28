// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import hazem.nurmontage.videoquran.model.VideoItem;
import java.io.File;
import android.content.ContentUris;
import android.provider.MediaStore$Video$Media;
import java.util.HashSet;
import hazem.nurmontage.videoquran.model.ExploreItem;
import java.util.ArrayList;
import android.provider.MediaStore$Files;

class GalleryPickerVideo$7 implements Runnable
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$7(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final ContentResolver contentResolver = this.this$0.getContentResolver();
        final Uri contentUri = MediaStore$Files.getContentUri("external");
        final String[] array = new String[4];
        String s = "_id";
        array[0] = s;
        String s2 = "duration";
        array[1] = s2;
        String s3 = "_data";
        array[2] = s3;
        array[3] = "parent";
        String s4 = null;
        final Cursor query = contentResolver.query(contentUri, array, "media_type=3", (String[])null, "date_added DESC");
        final ArrayList<ExploreItem> list = new ArrayList<ExploreItem>();
        final ArrayList list2 = new ArrayList();
        HashSet set = new HashSet();
        int i = 0;
        int n = 0;
        String str;
        HashSet set2;
        String s5;
        String s6;
        String s7;
        while (true) {
            final boolean moveToNext = query.moveToNext();
            str = "";
            if (!moveToNext) {
                set2 = set;
                s5 = s;
                s6 = s2;
                s7 = s3;
                break;
            }
            final int int1 = query.getInt(query.getColumnIndexOrThrow(s2));
            HashSet set3;
            String s9;
            String s10;
            if (int1 != 0) {
                query.getString(query.getColumnIndexOrThrow(s3));
                final Uri external_CONTENT_URI = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                final int columnIndexOrThrow = query.getColumnIndexOrThrow(s);
                s5 = s;
                s6 = s2;
                final String string = ContentUris.withAppendedId(external_CONTENT_URI, query.getLong(columnIndexOrThrow)).toString();
                final String parent = new File(string).getParent();
                if (set.contains(parent)) {
                    set2 = set;
                    s7 = s3;
                }
                else {
                    set.add(parent);
                    final File file = new File(parent);
                    final File[] listFiles = file.listFiles();
                    int k;
                    if (listFiles != null) {
                        int length = listFiles.length;
                        set2 = set;
                        int j = 0;
                        int n2 = 0;
                        while (j < length) {
                            final int n3 = length;
                            final GalleryPickerVideo this$0 = this.this$0;
                            final String s8 = s3;
                            if (this$0.isVideoFile(listFiles[j])) {
                                ++n2;
                                if (s4 == null) {
                                    s4 = string;
                                }
                            }
                            ++j;
                            length = n3;
                            s3 = s8;
                        }
                        s7 = s3;
                        k = n2;
                    }
                    else {
                        set2 = set;
                        s7 = s3;
                        k = 0;
                    }
                    if (k > 0) {
                        i += k;
                        list.add(new ExploreItem(file, parent, str + k, file.getName(), string));
                    }
                }
                list2.add(new VideoItem(parent, string, this.this$0.formatDuration(int1), false));
                ++n;
                if (n > 50) {
                    break;
                }
                set3 = set2;
                s9 = s5;
                s10 = s6;
            }
            else {
                set3 = set;
                s9 = s;
                s10 = s2;
                s7 = s3;
            }
            set = set3;
            s2 = s10;
            s = s9;
            s3 = s7;
        }
        this.this$0.runOnUiThread((Runnable)new GalleryPickerVideo$7$1(this, list2));
        String s11 = s4;
        while (query.moveToNext()) {
            final int int2 = query.getInt(query.getColumnIndexOrThrow(s6));
            HashSet set4;
            String s14;
            String s15;
            if (int2 != 0) {
                String s12 = s7;
                final String parent2 = new File(query.getString(query.getColumnIndexOrThrow(s7))).getParent();
                final Uri external_CONTENT_URI2 = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                String s13 = s5;
                final String string2 = ContentUris.withAppendedId(external_CONTENT_URI2, query.getLong(query.getColumnIndexOrThrow(s5))).toString();
                set4 = set2;
                if (set2.contains(parent2)) {
                    s14 = s6;
                    s15 = s13;
                }
                else {
                    set2.add(parent2);
                    final File file2 = new File(parent2);
                    final File[] listFiles2 = file2.listFiles();
                    int m;
                    if (listFiles2 != null) {
                        final int length2 = listFiles2.length;
                        s14 = s6;
                        int l = 0;
                        int n4 = 0;
                        while (l < length2) {
                            final String s16 = s12;
                            final GalleryPickerVideo this$2 = this.this$0;
                            final String s17 = s13;
                            if (this$2.isVideoFile(listFiles2[l])) {
                                ++n4;
                                if (s11 == null) {
                                    s11 = string2;
                                }
                            }
                            ++l;
                            s13 = s17;
                            s12 = s16;
                        }
                        s7 = s12;
                        s15 = s13;
                        m = n4;
                    }
                    else {
                        s14 = s6;
                        s15 = s13;
                        m = 0;
                    }
                    if (m > 0) {
                        i += m;
                        list.add(new ExploreItem(file2, parent2, str + m, file2.getName(), string2));
                    }
                }
                list2.add(new VideoItem(parent2, string2, this.this$0.formatDuration(int2), false));
            }
            else {
                set4 = set2;
                s15 = s5;
                s14 = s6;
            }
            s6 = s14;
            s5 = s15;
            set2 = set4;
        }
        query.close();
        list.add(0, new ExploreItem(null, GalleryPickerVideo.-$$Nest$fgetmResources(this.this$0).getString(R$string.all), str + i, GalleryPickerVideo.-$$Nest$fgetmResources(this.this$0).getString(R$string.all), s11));
        this.this$0.runOnUiThread((Runnable)new GalleryPickerVideo$7$2(this, list2, list));
    }
}
