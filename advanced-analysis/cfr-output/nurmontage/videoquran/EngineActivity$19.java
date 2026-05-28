/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.AspectRatioCalculator;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;

class EngineActivity$19
implements CustomDiscreteSeekBar$OnProgressChangeListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$19(EngineActivity engineActivity) {
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
            Object object2 = EngineActivity.cfr_renamed_549(this.this$0).getCurrentLabel();
            ((Template)object).setResolution((String)object2);
            int n = EngineActivity.cfr_renamed_2(this.this$0).geTypeResize();
            object2 = EngineActivity.cfr_renamed_2(this.this$0).getResolution();
            object = AspectRatioCalculator.getSize(n, (String)object2);
            object2 = EngineActivity.cfr_renamed_550(this.this$0);
            Object object3 = EngineActivity.cfr_renamed_2(this.this$0).getResolution();
            object2.setText((CharSequence)object3);
            object2 = EngineActivity.cfr_renamed_2(this.this$0);
            object3 = (Integer)object.getFirst();
            int n2 = (Integer)object3;
            object = (Integer)object.getSecond();
            n = (Integer)object;
            ((Template)object2).setWidthAndHeight(n2, n);
        }
    }
}

