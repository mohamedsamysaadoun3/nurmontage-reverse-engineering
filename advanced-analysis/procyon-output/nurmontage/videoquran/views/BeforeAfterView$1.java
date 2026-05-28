// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Bitmap;
import android.content.Context;

class BeforeAfterView$1 implements Runnable
{
    final /* synthetic */ BeforeAfterView this$0;
    final /* synthetic */ Context val$context;
    
    BeforeAfterView$1(final BeforeAfterView this$0, final Context val$context) {
        this.this$0 = this$0;
        this.val$context = val$context;
    }
    
    public void run() {
        try {
            final BeforeAfterView this$0 = this.this$0;
            try {
                final Bitmap -$$Nest$fgetbeforeImage = BeforeAfterView.-$$Nest$fgetbeforeImage(this$0);
                try {
                    final BeforeAfterView this$2 = this.this$0;
                    try {
                        final Bitmap -$$Nest$fgetafterImage = BeforeAfterView.-$$Nest$fgetafterImage(this$2);
                        try {
                            this$0.addTextPaint(-$$Nest$fgetbeforeImage, -$$Nest$fgetafterImage, this.val$context);
                            final BeforeAfterView this$3 = this.this$0;
                            try {
                                this$3.invalidate();
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
        catch (final Exception ex6) {}
    }
}
