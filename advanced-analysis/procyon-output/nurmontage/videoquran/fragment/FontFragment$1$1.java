// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

class FontFragment$1$1 implements Runnable
{
    final /* synthetic */ FontFragment$1 this$1;
    final /* synthetic */ int val$centerPosition;
    
    FontFragment$1$1(final FontFragment$1 this$1, final int val$centerPosition) {
        this.this$1 = this$1;
        this.val$centerPosition = val$centerPosition;
    }
    
    public void run() {
        if (this.this$1.val$adapter != null) {
            this.this$1.val$adapter.setSelected(this.val$centerPosition);
        }
    }
}
