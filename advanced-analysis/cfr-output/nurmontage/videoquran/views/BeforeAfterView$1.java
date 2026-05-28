/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Bitmap;
import hazem.nurmontage.videoquran.views.BeforeAfterView;

class BeforeAfterView$1
implements Runnable {
    final /* synthetic */ BeforeAfterView this$0;
    final /* synthetic */ Context val$context;

    BeforeAfterView$1(BeforeAfterView beforeAfterView, Context context) {
        this.this$0 = beforeAfterView;
        this.val$context = context;
    }

    public void run() {
        BeforeAfterView beforeAfterView = this.this$0;
        Bitmap bitmap = BeforeAfterView.cfr_renamed_487(beforeAfterView);
        BeforeAfterView beforeAfterView2 = this.this$0;
        beforeAfterView2 = BeforeAfterView.cfr_renamed_486(beforeAfterView2);
        Context context = this.val$context;
        beforeAfterView.addTextPaint(bitmap, (Bitmap)beforeAfterView2, context);
        beforeAfterView = this.this$0;
        try {
            beforeAfterView.invalidate();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

