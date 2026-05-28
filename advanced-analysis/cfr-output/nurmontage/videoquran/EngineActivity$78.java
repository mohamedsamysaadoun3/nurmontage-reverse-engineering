/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$78$1;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.fragment.ResizeFragment;

class EngineActivity$78
implements DimensionAdabters$IDimensionCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$78(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void done() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void isCustomSize(boolean bl, ResizeType resizeType) {
    }

    public void onCustumSize(int n, int n2, int n3, String string2, int n4) {
        this.this$0.updateHitRatio(n3, string2);
        Object object = EngineActivity.cfr_renamed_2(this.this$0);
        n = object.geTypeResize();
        if (n3 == n) {
            return;
        }
        object = ResizeFragment.instance;
        if (object != null) {
            object = ResizeFragment.instance;
            ((ResizeFragment)((Object)object)).scrollToSelectedPosition();
        }
        EngineActivity.cfr_renamed_72(this.this$0);
        object = EngineActivity.cfr_renamed_413(this.this$0);
        EngineActivity$78$1 engineActivity$78$1 = new EngineActivity$78$1(this, n3, string2);
        object.execute(engineActivity$78$1);
    }
}

