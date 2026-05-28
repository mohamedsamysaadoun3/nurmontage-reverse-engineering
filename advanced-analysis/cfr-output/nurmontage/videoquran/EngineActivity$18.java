/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;

class EngineActivity$18
implements CustomDiscreteSeekBar$OnProgressChangeListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$18(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onProgressChanged(CustomDiscreteSeekBar customDiscreteSeekBar, int n, String string2, boolean bl) {
    }

    public void onStartTrackingTouch(CustomDiscreteSeekBar customDiscreteSeekBar) {
    }

    public void onStopTrackingTouch(CustomDiscreteSeekBar object) {
        object = EngineActivity.cfr_renamed_2(this.this$0);
        if (object != null) {
            object = EngineActivity.cfr_renamed_2(this.this$0);
            String string2 = EngineActivity.cfr_renamed_519(this.this$0).getCurrentLabel();
            int n = Integer.parseInt(string2);
            ((Template)object).setFps(n);
        }
    }
}

