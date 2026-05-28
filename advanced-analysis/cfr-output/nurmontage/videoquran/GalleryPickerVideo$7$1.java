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
import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.GalleryPickerVideo$7;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import java.util.ArrayList;
import java.util.List;

class GalleryPickerVideo$7$1
implements Runnable {
    final /* synthetic */ GalleryPickerVideo$7 this$1;
    final /* synthetic */ ArrayList val$arrayList2;

    GalleryPickerVideo$7$1(GalleryPickerVideo$7 galleryPickerVideo$7, ArrayList arrayList) {
        this.this$1 = galleryPickerVideo$7;
        this.val$arrayList2 = arrayList;
    }

    public void run() {
        GalleryVideoAdabters galleryVideoAdabters;
        int n = (int)((float)ScreenUtils.getScreenWidth((Activity)this.this$1.this$0) * 0.3f);
        GalleryPickerVideo galleryPickerVideo = this.this$1.this$0;
        int bl = R$id.rv;
        galleryPickerVideo = (RecyclerView)galleryPickerVideo.findViewById(bl);
        boolean bl2 = true;
        galleryPickerVideo.setHasFixedSize(bl2);
        GalleryPickerVideo galleryPickerVideo2 = this.this$1.this$0;
        Object object = new GridLayoutManager((Context)galleryPickerVideo2, 3);
        galleryPickerVideo.setLayoutManager((RecyclerView.LayoutManager)object);
        galleryPickerVideo.setItemViewCacheSize(20);
        galleryPickerVideo.setDrawingCacheEnabled(bl2);
        galleryPickerVideo.setItemAnimator(null);
        GalleryPickerVideo galleryPickerVideo3 = this.this$1.this$0;
        object = AppUtils.getAppVersionName((Context)this.this$1.this$0);
        galleryPickerVideo2 = GalleryPickerVideo.cfr_renamed_90(this.this$1.this$0);
        GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = GalleryPickerVideo.cfr_renamed_278(this.this$1.this$0);
        GalleryVideoAdabters galleryVideoAdabters2 = galleryVideoAdabters;
        galleryVideoAdabters = new GalleryVideoAdabters((String)object, (Resources)galleryPickerVideo2, null, n, galleryPickerVideo$IPicker);
        GalleryPickerVideo.cfr_renamed_279(galleryPickerVideo3, galleryVideoAdabters);
        galleryVideoAdabters2 = GalleryPickerVideo.cfr_renamed_280(this.this$1.this$0);
        object = this.val$arrayList2;
        galleryVideoAdabters2.addItems((List)object);
        galleryVideoAdabters2 = GalleryPickerVideo.cfr_renamed_280(this.this$1.this$0);
        galleryPickerVideo.setAdapter(galleryVideoAdabters2);
    }
}

