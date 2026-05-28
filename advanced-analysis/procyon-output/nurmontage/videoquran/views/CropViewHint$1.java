// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.R$drawable;
import android.content.Context;

class CropViewHint$1 implements Runnable
{
    final /* synthetic */ CropViewHint this$0;
    final /* synthetic */ int val$byWidthScreen;
    final /* synthetic */ Context val$context;
    
    CropViewHint$1(final CropViewHint this$0, final Context val$context, final int val$byWidthScreen) {
        this.this$0 = this$0;
        this.val$context = val$context;
        this.val$byWidthScreen = val$byWidthScreen;
    }
    
    public void run() {
        try {
            final CropViewHint this$0 = this.this$0;
            try {
                final Context val$context = this.val$context;
                try {
                    final int val$byWidthScreen = this.val$byWidthScreen;
                    try {
                        CropViewHint.-$$Nest$fputbitmap(this$0, CropViewHint.get(val$context, val$byWidthScreen, val$byWidthScreen, R$drawable.bg_13));
                        final CropViewHint this$2 = this.this$0;
                        try {
                            this$2.invalidate();
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex3) {}
            }
            catch (final Exception ex4) {}
        }
        catch (final Exception ex5) {}
    }
}
