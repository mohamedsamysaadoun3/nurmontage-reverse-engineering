/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnScrollChangeListener
 *  android.widget.ImageView
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;

class EditMediaFragment$2
implements View.OnScrollChangeListener {
    final /* synthetic */ EditMediaFragment this$0;
    final /* synthetic */ ImageView val$arrow_left;
    final /* synthetic */ ImageView val$arrow_right;

    EditMediaFragment$2(EditMediaFragment editMediaFragment, ImageView imageView, ImageView imageView2) {
        this.this$0 = editMediaFragment;
        this.val$arrow_right = imageView;
        this.val$arrow_left = imageView2;
    }

    /*
     * Unable to fully structure code
     */
    public void onScrollChange(View var1_1, int var2_3, int var3_4, int var4_5, int var5_6) {
        block9: {
            var6_7 = var2_3;
            var7_8 = this.this$0;
            var7_8 = EditMediaFragment.cfr_renamed_196(var7_8);
            var8_9 = (float)var7_8.getWidth() * 0.3f;
            var9_10 = var6_7 == var8_9 ? 0 : (var6_7 > var8_9 ? 1 : -1);
            var2_3 = 0;
            var8_9 = 0.0f;
            var7_8 = null;
            var3_4 = 8;
            if (var9_10 <= 0) ** GOTO lbl22
            var1_1 = this.val$arrow_right;
            var1_1.setVisibility(var3_4);
            var1_1 = this.val$arrow_left;
            var1_1.setVisibility(0);
            break block9;
lbl22:
            // 1 sources

            var1_1 = this.val$arrow_left;
            var1_1.setVisibility(var3_4);
            var1_1 = this.val$arrow_right;
            try {
                var1_1.setVisibility(0);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }
}

