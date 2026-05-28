/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment;

class ReverbePresetFragment$1
implements View.OnClickListener {
    final /* synthetic */ ReverbePresetFragment this$0;

    ReverbePresetFragment$1(ReverbePresetFragment reverbePresetFragment) {
        this.this$0 = reverbePresetFragment;
    }

    public void onClick(View object) {
        object = ReverbePresetFragment.cfr_renamed_69(this.this$0);
        if (object != null) {
            ReverbePresetFragment.cfr_renamed_69(this.this$0).pausePreview();
            object = ReverbePresetFragment.cfr_renamed_69(this.this$0);
            object.onDone();
        }
    }
}

