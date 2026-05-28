// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

class WorkUserActivity$8 implements Runnable
{
    final /* synthetic */ WorkUserActivity this$0;
    final /* synthetic */ RecyclerView val$recyclerView;
    final /* synthetic */ List val$templateList;
    
    WorkUserActivity$8(final WorkUserActivity this$0, final List val$templateList, final RecyclerView val$recyclerView) {
        this.this$0 = this$0;
        this.val$templateList = val$templateList;
        this.val$recyclerView = val$recyclerView;
    }
    
    public void run() {
        final int n = (int)(ScreenUtils.getScreenWidth((Activity)this.this$0) * 0.3f);
        WorkUserActivity.-$$Nest$fputworkUserAdabter(this.this$0, new WorkUserAdabter(AppUtils.getAppVersionName((Context)this.this$0), this.val$templateList, WorkUserActivity.-$$Nest$fgetiWorkUserCallback(this.this$0), n, n));
        final RecyclerView val$recyclerView = this.val$recyclerView;
        final WorkUserActivity this$0 = this.this$0;
        final boolean hasFixedSize = true;
        val$recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this$0, (int)(hasFixedSize ? 1 : 0), false));
        this.val$recyclerView.setHasFixedSize(hasFixedSize);
        this.val$recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.val$recyclerView.setAdapter((RecyclerView$Adapter)WorkUserActivity.-$$Nest$fgetworkUserAdabter(this.this$0));
    }
}
