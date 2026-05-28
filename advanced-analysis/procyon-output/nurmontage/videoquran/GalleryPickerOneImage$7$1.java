// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import java.util.ArrayList;

class GalleryPickerOneImage$7$1 implements Runnable
{
    final /* synthetic */ GalleryPickerOneImage$7 this$1;
    final /* synthetic */ ArrayList val$arrayList2;
    
    GalleryPickerOneImage$7$1(final GalleryPickerOneImage$7 this$1, final ArrayList val$arrayList2) {
        this.this$1 = this$1;
        this.val$arrayList2 = val$arrayList2;
    }
    
    public void run() {
        final int n = (int)(ScreenUtils.getScreenWidth((Activity)this.this$1.this$0) * 0.3f);
        final RecyclerView recyclerView = (RecyclerView)this.this$1.this$0.findViewById(R$id.rv);
        final boolean b = true;
        recyclerView.setHasFixedSize(b);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new GridLayoutManager((Context)this.this$1.this$0, 3));
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(b);
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        GalleryPickerOneImage.-$$Nest$fputgalleryPickerAdabters(this.this$1.this$0, new GalleryPickerAdabters(AppUtils.getAppVersionName((Context)this.this$1.this$0), GalleryPickerOneImage.-$$Nest$fgetmResources(this.this$1.this$0), null, n, GalleryPickerOneImage.-$$Nest$fgetiPicker(this.this$1.this$0)));
        GalleryPickerOneImage.-$$Nest$fgetgalleryPickerAdabters(this.this$1.this$0).addItems(this.val$arrayList2);
        recyclerView.setAdapter((RecyclerView$Adapter)GalleryPickerOneImage.-$$Nest$fgetgalleryPickerAdabters(this.this$1.this$0));
    }
}
