/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.ProVersionActivity$16$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ProVersionActivity$16$1;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.ImgAdapter;
import java.util.ArrayList;
import java.util.List;

class ProVersionActivity$16
implements Runnable {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$16(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    /* synthetic */ void cfr_renamed_112(List list) {
        RecyclerView recyclerView = ProVersionActivity.cfr_renamed_93(this.this$0);
        int n = list.size();
        recyclerView.scrollToPosition(n);
    }

    public void run() {
        Object object = ProVersionActivity.cfr_renamed_93(this.this$0);
        float f = object.getHeight();
        float f2 = 0.95f;
        int n = (int)(f *= f2);
        if (n == 0) {
            object = this.this$0;
            f = ScreenUtils.getScreenHeight((Activity)object);
            f2 = 0.4f;
            n = (int)(f *= f2);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Object object2 = R$drawable.nur_2;
        arrayList.add((Integer)object2);
        object2 = R$drawable.nur_3;
        arrayList.add((Integer)object2);
        object2 = R$drawable.nur_4;
        arrayList.add((Integer)object2);
        object2 = R$drawable.nur_1;
        arrayList.add((Integer)object2);
        object2 = new ArrayList();
        object2.addAll(arrayList);
        object2.addAll(arrayList);
        object2.addAll(arrayList);
        String string2 = AppUtils.getAppVersionName((Context)this.this$0);
        ImgAdapter imgAdapter = new ImgAdapter(string2, (List)object2, n);
        object2 = this.this$0;
        object = new LinearLayoutManager((Context)object2, 0, false);
        boolean bl = true;
        object.setItemPrefetchEnabled(bl);
        object.setInitialPrefetchItemCount(6);
        ProVersionActivity.cfr_renamed_93(this.this$0).setLayoutManager((RecyclerView.LayoutManager)object);
        ProVersionActivity.cfr_renamed_93(this.this$0).setAdapter((RecyclerView.Adapter)imgAdapter);
        ProVersionActivity.cfr_renamed_93(this.this$0).setHasFixedSize(bl);
        ProVersionActivity.cfr_renamed_93(this.this$0).setItemViewCacheSize(12);
        ProVersionActivity.cfr_renamed_93(this.this$0).setItemAnimator(null);
        object = ProVersionActivity.cfr_renamed_93(this.this$0);
        object2 = new ProVersionActivity$16$1(this);
        object.addOnScrollListener((RecyclerView.OnScrollListener)object2);
        object = ProVersionActivity.cfr_renamed_93(this.this$0);
        object2 = new ProVersionActivity$16$$ExternalSyntheticLambda0(this, arrayList);
        object.post((Runnable)object2);
        ProVersionActivity.cfr_renamed_105(this.this$0);
    }
}

