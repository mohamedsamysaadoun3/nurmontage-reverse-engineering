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
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.views.SquareImageView;

class GalleryVideoAdabters$MyViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ GalleryVideoAdabters$MyViewHolder this$1;
    final /* synthetic */ GalleryVideoAdabters val$this$0;

    GalleryVideoAdabters$MyViewHolder$1(GalleryVideoAdabters$MyViewHolder galleryVideoAdabters$MyViewHolder, GalleryVideoAdabters galleryVideoAdabters) {
        this.this$1 = galleryVideoAdabters$MyViewHolder;
        this.val$this$0 = galleryVideoAdabters;
    }

    public void onClick(View object) {
        int n;
        object = GalleryVideoAdabters.cfr_renamed_278(this.this$1.this$0);
        if (object != null && (n = (object = this.this$1).getAdapterPosition()) >= 0) {
            object = GalleryVideoAdabters.cfr_renamed_312(this.this$1.this$0);
            int n2 = 1;
            if (object == null) {
                Object object2;
                object = GalleryVideoAdabters.cfr_renamed_353(this.this$1.this$0);
                int n3 = this.this$1.getAdapterPosition();
                if ((object = (VideoItem)object.get(n3)) == (object2 = GalleryVideoAdabters.cfr_renamed_352(this.this$1.this$0))) {
                    return;
                }
                object2 = GalleryVideoAdabters.cfr_renamed_352(this.this$1.this$0);
                if (object2 != null) {
                    GalleryVideoAdabters.cfr_renamed_352(this.this$1.this$0).setSelect(false);
                    object2 = this.this$1.this$0;
                    VideoItem videoItem = GalleryVideoAdabters.cfr_renamed_352(this.this$1.this$0);
                    int n4 = videoItem.getAdabter_pos();
                    object2.notifyItemChanged(n4);
                }
                GalleryVideoAdabters.cfr_renamed_354(this.this$1.this$0, (VideoItem)object);
                ((VideoItem)object).setSelect(n2 != 0);
                GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(this.this$1).onSelect(n2 != 0);
                n2 = this.this$1.getAdapterPosition();
                ((VideoItem)object).setAdabter_pos(n2);
                GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryVideoAdabters.cfr_renamed_278(this.this$1.this$0);
                int n5 = this.this$1.getAdapterPosition();
                galleryPickerVideo$IPicker.onAdd((VideoItem)object, n5);
                return;
            }
            object = GalleryVideoAdabters.cfr_renamed_353(this.this$1.this$0);
            int n5 = this.this$1.getAdapterPosition();
            object = (VideoItem)object.get(n5);
            boolean bl = ((VideoItem)object).isSelect() ^ n2;
            ((VideoItem)object).setSelect(bl);
            SquareImageView squareImageView = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
            boolean bl2 = ((VideoItem)object).isSelect();
            squareImageView.onSelect(bl2);
            boolean bl3 = ((VideoItem)object).isSelect();
            if (bl3) {
                squareImageView = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
                int n6 = GalleryVideoAdabters.cfr_renamed_312(this.this$1.this$0).size() + n2;
                squareImageView.setNumber(n6);
                n2 = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(this.this$1).getAnInt();
                ((VideoItem)object).setNumber(n2);
                n2 = this.this$1.getAdapterPosition();
                ((VideoItem)object).setAdabter_pos(n2);
                GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryVideoAdabters.cfr_renamed_278(this.this$1.this$0);
                int n7 = this.this$1.getAdapterPosition();
                galleryPickerVideo$IPicker.onAdd((VideoItem)object, n7);
                return;
            }
            Object object3 = this.this$1.this$0;
            squareImageView = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(this.this$1);
            int n8 = squareImageView.getAnInt();
            ((GalleryVideoAdabters)((Object)object3)).updateNumbers(n8);
            object3 = GalleryVideoAdabters.cfr_renamed_278(this.this$1.this$0);
            object = ((VideoItem)object).getGallerySelected();
            object3.onDelete((GallerySelected)object);
        }
    }
}

