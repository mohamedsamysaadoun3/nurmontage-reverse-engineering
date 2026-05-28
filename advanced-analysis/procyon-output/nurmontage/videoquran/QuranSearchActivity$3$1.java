// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class QuranSearchActivity$3$1 implements Runnable
{
    final /* synthetic */ QuranSearchActivity$3 this$1;
    
    QuranSearchActivity$3$1(final QuranSearchActivity$3 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        if (QuranSearchActivity.-$$Nest$fgetsearchProgressBar(this.this$1.this$0) != null) {
            QuranSearchActivity.-$$Nest$fgetsearchProgressBar(this.this$1.this$0).setVisibility(0);
        }
    }
}
