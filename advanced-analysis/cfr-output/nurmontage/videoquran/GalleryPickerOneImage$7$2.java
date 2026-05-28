/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$7;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import java.util.ArrayList;
import java.util.List;

class GalleryPickerOneImage$7$2
implements Runnable {
    final /* synthetic */ GalleryPickerOneImage$7 this$1;
    final /* synthetic */ ArrayList val$arrayList;
    final /* synthetic */ ArrayList val$arrayList2;

    GalleryPickerOneImage$7$2(GalleryPickerOneImage$7 galleryPickerOneImage$7, ArrayList arrayList, ArrayList arrayList2) {
        this.this$1 = galleryPickerOneImage$7;
        this.val$arrayList2 = arrayList;
        this.val$arrayList = arrayList2;
    }

    public void run() {
        Object object = GalleryPickerOneImage.cfr_renamed_280(this.this$1.this$0);
        ArrayList arrayList = this.val$arrayList2;
        object.doneItems(arrayList);
        GalleryPickerOneImage.cfr_renamed_280(this.this$1.this$0).notifyDataSetChanged();
        int n = (int)((float)ScreenUtils.getScreenWidth((Activity)this.this$1.this$0) * 0.2f);
        arrayList = GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0);
        boolean bl = true;
        arrayList.setHasFixedSize(bl);
        arrayList = GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0);
        Object object2 = this.this$1.this$0;
        Object object3 = new LinearLayoutManager((Context)object2);
        arrayList.setLayoutManager((RecyclerView.LayoutManager)object3);
        GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0).setItemViewCacheSize(20);
        GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0).setDrawingCacheEnabled(bl);
        GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0).setItemAnimator(null);
        arrayList = GalleryPickerOneImage.cfr_renamed_141(this.this$1.this$0);
        object3 = this.val$arrayList;
        object2 = GalleryPickerOneImage.cfr_renamed_342(this.this$1.this$0);
        String string2 = ((Object)GalleryPickerOneImage.cfr_renamed_142(this.this$1.this$0).getText()).toString();
        ExploreAdabters exploreAdabters = new ExploreAdabters((List)object3, n, (ExploreAdabters$IExplore)object2, string2);
        arrayList.setAdapter(exploreAdabters);
        object = this.this$1.this$0;
        int n2 = R$id.view_progress;
        object.findViewById(n2).setVisibility(8);
        GalleryPickerOneImage.cfr_renamed_142(this.this$1.this$0).setVisibility(0);
    }
}

