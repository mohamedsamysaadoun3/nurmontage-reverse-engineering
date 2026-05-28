/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.GallerySelctedAdabters;
import hazem.nurmontage.videoquran.adabter.GallerySelctedAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;

class GallerySelctedAdabters$MyViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ GallerySelctedAdabters$MyViewHolder this$1;
    final /* synthetic */ GallerySelctedAdabters val$this$0;

    GallerySelctedAdabters$MyViewHolder$1(GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder, GallerySelctedAdabters gallerySelctedAdabters) {
        this.this$1 = gallerySelctedAdabters$MyViewHolder;
        this.val$this$0 = gallerySelctedAdabters;
    }

    public void onClick(View object) {
        object = GallerySelctedAdabters.cfr_renamed_322(this.this$1.this$0);
        int n = this.this$1.getAdapterPosition();
        object = (GallerySelected)object.get(n);
        Object object2 = this.this$1.this$0;
        GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder = this.this$1;
        int n2 = gallerySelctedAdabters$MyViewHolder.getAdapterPosition();
        ((GallerySelctedAdabters)((Object)object2)).deletedItem(n2);
        object2 = ((GallerySelected)object).getVideoItem();
        if (object2 != null) {
            object2 = GallerySelctedAdabters.cfr_renamed_323(this.this$1.this$0);
            int n3 = ((GallerySelected)object).getIndex();
            object2.inselectVideo(n3);
        } else {
            object2 = GallerySelctedAdabters.cfr_renamed_323(this.this$1.this$0);
            int n4 = ((GallerySelected)object).getIndex();
            object2.inselectPhoto(n4);
        }
    }
}

