// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import java.util.ArrayList;

class GalleryPhotosFragment$1$1 implements Runnable
{
    final /* synthetic */ GalleryPhotosFragment$1 this$1;
    final /* synthetic */ ArrayList val$arrayList;
    
    GalleryPhotosFragment$1$1(final GalleryPhotosFragment$1 this$1, final ArrayList val$arrayList) {
        this.this$1 = this$1;
        this.val$arrayList = val$arrayList;
    }
    
    public void run() {
        GalleryPhotosFragment.-$$Nest$fgetadabters(this.this$1.this$0).addItems(this.val$arrayList);
        GalleryPhotosFragment.-$$Nest$fgetadabters(this.this$1.this$0).notifyDataSetChanged();
    }
}
