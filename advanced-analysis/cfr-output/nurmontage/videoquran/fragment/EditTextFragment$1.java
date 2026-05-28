/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EditTextFragment;

class EditTextFragment$1
implements View.OnClickListener {
    final /* synthetic */ EditTextFragment this$0;

    EditTextFragment$1(EditTextFragment editTextFragment) {
        this.this$0 = editTextFragment;
    }

    public void onClick(View object) {
        object = EditTextFragment.cfr_renamed_164(this.this$0);
        if (object != null) {
            object = EditTextFragment.cfr_renamed_164(this.this$0);
            EntityQuranTimeline entityQuranTimeline = EditTextFragment.cfr_renamed_165(this.this$0).getEntityQuran();
            object.onDone(entityQuranTimeline);
        }
    }
}

