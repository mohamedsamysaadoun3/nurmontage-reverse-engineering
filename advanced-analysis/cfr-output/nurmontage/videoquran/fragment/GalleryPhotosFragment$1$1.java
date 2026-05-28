/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.fragment.GalleryPhotosFragment;
import hazem.nurmontage.videoquran.fragment.GalleryPhotosFragment$1;
import java.util.ArrayList;

class GalleryPhotosFragment$1$1
implements Runnable {
    final /* synthetic */ GalleryPhotosFragment$1 this$1;
    final /* synthetic */ ArrayList val$arrayList;

    GalleryPhotosFragment$1$1(GalleryPhotosFragment$1 galleryPhotosFragment$1, ArrayList arrayList) {
        this.this$1 = galleryPhotosFragment$1;
        this.val$arrayList = arrayList;
    }

    public void run() {
        GalleryVideoAdabters galleryVideoAdabters = GalleryPhotosFragment.cfr_renamed_202(this.this$1.this$0);
        ArrayList arrayList = this.val$arrayList;
        galleryVideoAdabters.addItems(arrayList);
        GalleryPhotosFragment.cfr_renamed_202(this.this$1.this$0).notifyDataSetChanged();
    }
}

