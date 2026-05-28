// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import java.util.List;
import java.util.ArrayList;

class GalleryPickerOneImage$7$2 implements Runnable
{
    final /* synthetic */ GalleryPickerOneImage$7 this$1;
    final /* synthetic */ ArrayList val$arrayList;
    final /* synthetic */ ArrayList val$arrayList2;
    
    GalleryPickerOneImage$7$2(final GalleryPickerOneImage$7 this$1, final ArrayList val$arrayList2, final ArrayList val$arrayList3) {
        this.this$1 = this$1;
        this.val$arrayList2 = val$arrayList2;
        this.val$arrayList = val$arrayList3;
    }
    
    public void run() {
        GalleryPickerOneImage.-$$Nest$fgetgalleryPickerAdabters(this.this$1.this$0).doneItems(this.val$arrayList2);
        GalleryPickerOneImage.-$$Nest$fgetgalleryPickerAdabters(this.this$1.this$0).notifyDataSetChanged();
        final int n = (int)(ScreenUtils.getScreenWidth((Activity)this.this$1.this$0) * 0.2f);
        final RecyclerView -$$Nest$fgetrv_explore = GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0);
        final boolean b = true;
        -$$Nest$fgetrv_explore.setHasFixedSize(b);
        GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0).setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this.this$1.this$0));
        GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0).setItemViewCacheSize(20);
        GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0).setDrawingCacheEnabled(b);
        GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0).setItemAnimator((RecyclerView$ItemAnimator)null);
        GalleryPickerOneImage.-$$Nest$fgetrv_explore(this.this$1.this$0).setAdapter((RecyclerView$Adapter)new ExploreAdabters(this.val$arrayList, n, GalleryPickerOneImage.-$$Nest$fgetiExplore(this.this$1.this$0), GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$1.this$0).getText().toString()));
        this.this$1.this$0.findViewById(R$id.view_progress).setVisibility(8);
        GalleryPickerOneImage.-$$Nest$fgetbtnExplore(this.this$1.this$0).setVisibility(0);
    }
}
