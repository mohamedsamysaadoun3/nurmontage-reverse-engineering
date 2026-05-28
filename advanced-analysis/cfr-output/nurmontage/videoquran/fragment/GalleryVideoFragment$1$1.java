/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.fragment.GalleryVideoFragment;
import hazem.nurmontage.videoquran.fragment.GalleryVideoFragment$1;
import java.util.ArrayList;

class GalleryVideoFragment$1$1
implements Runnable {
    final /* synthetic */ GalleryVideoFragment$1 this$1;
    final /* synthetic */ ArrayList val$arrayList;

    GalleryVideoFragment$1$1(GalleryVideoFragment$1 galleryVideoFragment$1, ArrayList arrayList) {
        this.this$1 = galleryVideoFragment$1;
        this.val$arrayList = arrayList;
    }

    public void run() {
        GalleryVideoAdabters galleryVideoAdabters = GalleryVideoFragment.cfr_renamed_202(this.this$1.this$0);
        ArrayList arrayList = this.val$arrayList;
        galleryVideoAdabters.addItems(arrayList);
        GalleryVideoFragment.cfr_renamed_202(this.this$1.this$0).notifyDataSetChanged();
    }
}

