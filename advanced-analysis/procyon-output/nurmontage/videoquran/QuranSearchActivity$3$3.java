// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class QuranSearchActivity$3$3 implements Runnable
{
    final /* synthetic */ QuranSearchActivity$3 this$1;
    
    QuranSearchActivity$3$3(final QuranSearchActivity$3 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        if (QuranSearchActivity.-$$Nest$fgetsearchQuranAdapter(this.this$1.this$0) != null && QuranSearchActivity.-$$Nest$fgetsearchQuranAdapter(this.this$1.this$0).getSize() == 0) {
            QuranSearchActivity.-$$Nest$mupdateCount(this.this$1.this$0);
        }
        if (QuranSearchActivity.-$$Nest$fgetsearchProgressBar(this.this$1.this$0) != null) {
            QuranSearchActivity.-$$Nest$fgetsearchProgressBar(this.this$1.this$0).setVisibility(8);
        }
    }
}
