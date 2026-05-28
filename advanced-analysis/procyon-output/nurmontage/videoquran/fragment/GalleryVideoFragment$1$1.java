// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import java.util.ArrayList;

class GalleryVideoFragment$1$1 implements Runnable
{
    final /* synthetic */ GalleryVideoFragment$1 this$1;
    final /* synthetic */ ArrayList val$arrayList;
    
    GalleryVideoFragment$1$1(final GalleryVideoFragment$1 this$1, final ArrayList val$arrayList) {
        this.this$1 = this$1;
        this.val$arrayList = val$arrayList;
    }
    
    public void run() {
        GalleryVideoFragment.-$$Nest$fgetadabters(this.this$1.this$0).addItems(this.val$arrayList);
        GalleryVideoFragment.-$$Nest$fgetadabters(this.this$1.this$0).notifyDataSetChanged();
    }
}
