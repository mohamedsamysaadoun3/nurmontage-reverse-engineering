// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView$OnScrollListener;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.adabter.ImgAdapter;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import java.util.List;

class ProVersionActivity$16 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$16(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        int n = (int)(ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).getHeight() * 0.95f);
        if (n == 0) {
            n = (int)(ScreenUtils.getScreenHeight((Activity)this.this$0) * 0.4f);
        }
        final ArrayList list = new ArrayList();
        list.add(R$drawable.nur_2);
        list.add(R$drawable.nur_3);
        list.add(R$drawable.nur_4);
        list.add(R$drawable.nur_1);
        final ArrayList list2 = new ArrayList();
        list2.addAll(list);
        list2.addAll(list);
        list2.addAll(list);
        final ImgAdapter adapter = new ImgAdapter(AppUtils.getAppVersionName((Context)this.this$0), list2, n);
        final LinearLayoutManager layoutManager = new LinearLayoutManager((Context)this.this$0, 0, false);
        final boolean b = true;
        layoutManager.setItemPrefetchEnabled(b);
        layoutManager.setInitialPrefetchItemCount(6);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).setLayoutManager((RecyclerView$LayoutManager)layoutManager);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).setAdapter((RecyclerView$Adapter)adapter);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).setHasFixedSize(b);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).setItemViewCacheSize(12);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).setItemAnimator((RecyclerView$ItemAnimator)null);
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).addOnScrollListener((RecyclerView$OnScrollListener)new ProVersionActivity$16$1(this));
        ProVersionActivity.-$$Nest$fgetrecyclerView(this.this$0).post((Runnable)new ProVersionActivity$16$$ExternalSyntheticLambda0(this, list));
        ProVersionActivity.-$$Nest$mstartAutoScroll(this.this$0);
    }
}
