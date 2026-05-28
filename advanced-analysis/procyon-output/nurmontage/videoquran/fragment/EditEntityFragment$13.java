// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.LinearLayout;
import android.view.View;
import android.widget.ImageView;
import android.view.View$OnScrollChangeListener;

class EditEntityFragment$13 implements View$OnScrollChangeListener
{
    final /* synthetic */ EditEntityFragment this$0;
    final /* synthetic */ ImageView val$arrow_left;
    final /* synthetic */ ImageView val$arrow_right;
    
    EditEntityFragment$13(final EditEntityFragment this$0, final ImageView val$arrow_right, final ImageView val$arrow_left) {
        this.this$0 = this$0;
        this.val$arrow_right = val$arrow_right;
        this.val$arrow_left = val$arrow_left;
    }
    
    public void onScrollChange(final View view, int n, int n2, final int n3, final int n4) {
        final float n5 = (float)n;
        try {
            final EditEntityFragment this$0 = this.this$0;
            try {
                final LinearLayout -$$Nest$fgetbtnCut = EditEntityFragment.-$$Nest$fgetbtnCut(this$0);
                try {
                    final float n6 = fcmpl(n5, -$$Nest$fgetbtnCut.getWidth() * 0.3f);
                    n = 0;
                    n2 = 8;
                    if (n6 > 0) {
                        this.val$arrow_right.setVisibility(n2);
                        this.val$arrow_left.setVisibility(0);
                        return;
                    }
                    this.val$arrow_left.setVisibility(n2);
                    this.val$arrow_right.setVisibility(0);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
