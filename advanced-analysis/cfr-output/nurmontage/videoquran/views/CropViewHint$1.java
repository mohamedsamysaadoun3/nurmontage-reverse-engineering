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
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.views.CropViewHint;

class CropViewHint$1
implements Runnable {
    final /* synthetic */ CropViewHint this$0;
    final /* synthetic */ int val$byWidthScreen;
    final /* synthetic */ Context val$context;

    CropViewHint$1(CropViewHint cropViewHint, Context context, int n) {
        this.this$0 = cropViewHint;
        this.val$context = context;
        this.val$byWidthScreen = n;
    }

    public void run() {
        CropViewHint cropViewHint = this.this$0;
        Context context = this.val$context;
        int n = this.val$byWidthScreen;
        int n2 = R$drawable.bg_13;
        context = CropViewHint.get(context, n, n, n2);
        CropViewHint.cfr_renamed_489(cropViewHint, (Bitmap)context);
        cropViewHint = this.this$0;
        try {
            cropViewHint.invalidate();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

