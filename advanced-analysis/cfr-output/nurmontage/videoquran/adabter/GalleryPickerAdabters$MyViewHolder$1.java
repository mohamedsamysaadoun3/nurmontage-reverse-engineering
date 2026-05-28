/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.views.SquareImageView;

class GalleryPickerAdabters$MyViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerAdabters$MyViewHolder this$1;
    final /* synthetic */ GalleryPickerAdabters val$this$0;

    GalleryPickerAdabters$MyViewHolder$1(GalleryPickerAdabters$MyViewHolder galleryPickerAdabters$MyViewHolder, GalleryPickerAdabters galleryPickerAdabters) {
        this.this$1 = galleryPickerAdabters$MyViewHolder;
        this.val$this$0 = galleryPickerAdabters;
    }

    public void onClick(View object) {
        int n;
        object = GalleryPickerAdabters.cfr_renamed_278(this.this$1.this$0);
        if (object != null && (n = (object = this.this$1).getAdapterPosition()) >= 0) {
            object = GalleryPickerAdabters.cfr_renamed_312(this.this$1.this$0);
            int n2 = 1;
            if (object == null) {
                Object object2;
                object = GalleryPickerAdabters.cfr_renamed_313(this.this$1.this$0);
                int n3 = this.this$1.getAdapterPosition();
                if ((object = (PhotoItem)object.get(n3)) == (object2 = GalleryPickerAdabters.cfr_renamed_314(this.this$1.this$0))) {
                    return;
                }
                object2 = GalleryPickerAdabters.cfr_renamed_314(this.this$1.this$0);
                if (object2 != null) {
                    GalleryPickerAdabters.cfr_renamed_314(this.this$1.this$0).setSelect(false);
                    object2 = this.this$1.this$0;
                    PhotoItem photoItem = GalleryPickerAdabters.cfr_renamed_314(this.this$1.this$0);
                    int n4 = photoItem.getAdabter_pos();
                    object2.notifyItemChanged(n4);
                }
                ((PhotoItem)object).setSelect(n2 != 0);
                GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(this.this$1).onSelect(n2 != 0);
                GalleryPickerAdabters.cfr_renamed_315(this.this$1.this$0, (PhotoItem)object);
                n2 = this.this$1.getAdapterPosition();
                ((PhotoItem)object).setAdabter_pos(n2);
                GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryPickerAdabters.cfr_renamed_278(this.this$1.this$0);
                int n5 = this.this$1.getAdapterPosition();
                galleryPickerVideo$IPicker.onAdd((PhotoItem)object, n5);
                return;
            }
            object = GalleryPickerAdabters.cfr_renamed_313(this.this$1.this$0);
            int n5 = this.this$1.getAdapterPosition();
            object = (PhotoItem)object.get(n5);
            boolean bl = ((PhotoItem)object).isSelect() ^ n2;
            ((PhotoItem)object).setSelect(bl);
            SquareImageView squareImageView = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
            boolean bl2 = ((PhotoItem)object).isSelect();
            squareImageView.onSelect(bl2);
            boolean bl3 = ((PhotoItem)object).isSelect();
            if (bl3) {
                squareImageView = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
                int n6 = GalleryPickerAdabters.cfr_renamed_312(this.this$1.this$0).size() + n2;
                squareImageView.setNumber(n6);
                n2 = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(this.this$1).getAnInt();
                ((PhotoItem)object).setNumber(n2);
                n2 = this.this$1.getAdapterPosition();
                ((PhotoItem)object).setAdabter_pos(n2);
                GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryPickerAdabters.cfr_renamed_278(this.this$1.this$0);
                int n7 = this.this$1.getAdapterPosition();
                galleryPickerVideo$IPicker.onAdd((PhotoItem)object, n7);
                return;
            }
            Object object3 = this.this$1.this$0;
            squareImageView = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
            int n8 = squareImageView.getAnInt();
            ((GalleryPickerAdabters)((Object)object3)).updateNumbers(n8);
            object3 = GalleryPickerAdabters.cfr_renamed_278(this.this$1.this$0);
            object = ((PhotoItem)object).getGallerySelected();
            object3.onDelete((GallerySelected)object);
        }
    }
}

