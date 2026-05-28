// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.ContentUris;
import hazem.nurmontage.videoquran.model.VideoItem;
import java.util.ArrayList;
import android.provider.MediaStore$Video$Media;

class GalleryPhotosFragment$1 implements Runnable
{
    final /* synthetic */ GalleryPhotosFragment this$0;
    
    GalleryPhotosFragment$1(final GalleryPhotosFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final ContentResolver contentResolver = this.this$0.requireActivity().getContentResolver();
        final Uri external_CONTENT_URI = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
        final String[] array = new String[2];
        final String s = "_id";
        array[0] = s;
        final int select = 1;
        final String s2 = "duration";
        array[select] = s2;
        final Cursor query = contentResolver.query(external_CONTENT_URI, array, (String)null, (String[])null, (String)null);
        final ArrayList<VideoItem> list = new ArrayList<VideoItem>();
        while (query.moveToNext()) {
            query.getInt(query.getColumnIndexOrThrow(s2));
            final VideoItem contains = this.this$0.isContains(ContentUris.withAppendedId(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow(s))).toString());
            if (contains != null) {
                contains.setSelect((boolean)(select != 0));
                list.add(contains);
            }
        }
        query.close();
        this.this$0.requireActivity().runOnUiThread((Runnable)new GalleryPhotosFragment$1$1(this, list));
    }
}
