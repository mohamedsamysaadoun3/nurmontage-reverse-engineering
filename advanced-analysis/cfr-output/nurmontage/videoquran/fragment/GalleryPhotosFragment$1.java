/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentUris
 *  android.net.Uri
 *  android.provider.MediaStore$Video$Media
 *  androidx.fragment.app.FragmentActivity
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentActivity;
import hazem.nurmontage.videoquran.fragment.GalleryPhotosFragment;
import hazem.nurmontage.videoquran.fragment.GalleryPhotosFragment$1$1;
import hazem.nurmontage.videoquran.model.VideoItem;
import java.util.ArrayList;

class GalleryPhotosFragment$1
implements Runnable {
    final /* synthetic */ GalleryPhotosFragment this$0;

    GalleryPhotosFragment$1(GalleryPhotosFragment galleryPhotosFragment) {
        this.this$0 = galleryPhotosFragment;
    }

    public void run() {
        int n;
        String string2;
        String string3;
        Object object = this.this$0.requireActivity().getContentResolver();
        Object object2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Object object3 = new String[2];
        FragmentActivity fragmentActivity = null;
        object3[0] = string3 = "_id";
        boolean bl = true;
        object3[bl] = string2 = "duration";
        int n2 = 0;
        Object object4 = null;
        object = object.query((Uri)object2, (String[])object3, null, null, null);
        object2 = new ArrayList();
        while ((n = object.moveToNext()) != 0) {
            n = object.getColumnIndexOrThrow(string2);
            object.getInt(n);
            object3 = this.this$0;
            object4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            n2 = object.getColumnIndexOrThrow(string3);
            long l = object.getLong(n2);
            if ((object3 = ((GalleryPhotosFragment)((Object)object3)).isContains((String)(object4 = ContentUris.withAppendedId((Uri)object4, (long)l).toString()))) == null) continue;
            ((VideoItem)object3).setSelect(bl);
            ((ArrayList)object2).add(object3);
        }
        object.close();
        fragmentActivity = this.this$0.requireActivity();
        object = new GalleryPhotosFragment$1$1(this, (ArrayList)object2);
        fragmentActivity.runOnUiThread((Runnable)object);
    }
}

