/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$7;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import java.util.ArrayList;
import java.util.List;

class GalleryPickerOneImage$7$1
implements Runnable {
    final /* synthetic */ GalleryPickerOneImage$7 this$1;
    final /* synthetic */ ArrayList val$arrayList2;

    GalleryPickerOneImage$7$1(GalleryPickerOneImage$7 galleryPickerOneImage$7, ArrayList arrayList) {
        this.this$1 = galleryPickerOneImage$7;
        this.val$arrayList2 = arrayList;
    }

    public void run() {
        GalleryPickerAdabters galleryPickerAdabters;
        int n = (int)((float)ScreenUtils.getScreenWidth((Activity)this.this$1.this$0) * 0.3f);
        GalleryPickerOneImage galleryPickerOneImage = this.this$1.this$0;
        int bl = R$id.rv;
        galleryPickerOneImage = (RecyclerView)galleryPickerOneImage.findViewById(bl);
        boolean bl2 = true;
        galleryPickerOneImage.setHasFixedSize(bl2);
        GalleryPickerOneImage galleryPickerOneImage2 = this.this$1.this$0;
        Object object = new GridLayoutManager((Context)galleryPickerOneImage2, 3);
        galleryPickerOneImage.setLayoutManager((RecyclerView.LayoutManager)object);
        galleryPickerOneImage.setItemViewCacheSize(20);
        galleryPickerOneImage.setDrawingCacheEnabled(bl2);
        galleryPickerOneImage.setItemAnimator(null);
        GalleryPickerOneImage galleryPickerOneImage3 = this.this$1.this$0;
        object = AppUtils.getAppVersionName((Context)this.this$1.this$0);
        galleryPickerOneImage2 = GalleryPickerOneImage.cfr_renamed_90(this.this$1.this$0);
        GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryPickerOneImage.cfr_renamed_278(this.this$1.this$0);
        GalleryPickerAdabters galleryPickerAdabters2 = galleryPickerAdabters;
        galleryPickerAdabters = new GalleryPickerAdabters((String)object, (Resources)galleryPickerOneImage2, null, n, galleryPickerVideo$IPicker);
        GalleryPickerOneImage.cfr_renamed_279(galleryPickerOneImage3, galleryPickerAdabters);
        galleryPickerAdabters2 = GalleryPickerOneImage.cfr_renamed_280(this.this$1.this$0);
        object = this.val$arrayList2;
        galleryPickerAdabters2.addItems((List)object);
        galleryPickerAdabters2 = GalleryPickerOneImage.cfr_renamed_280(this.this$1.this$0);
        galleryPickerOneImage.setAdapter(galleryPickerAdabters2);
    }
}

