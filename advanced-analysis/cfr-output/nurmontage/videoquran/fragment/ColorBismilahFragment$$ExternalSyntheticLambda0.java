/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.widget.TextView;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.fragment.ColorBismilahFragment;

public final class ColorBismilahFragment$$ExternalSyntheticLambda0
implements View.OnClickListener {
    public final /* synthetic */ ColorBismilahFragment f$0;
    public final /* synthetic */ TextView[] f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ AyaTextPreset[] f$3;

    public /* synthetic */ ColorBismilahFragment$$ExternalSyntheticLambda0(ColorBismilahFragment colorBismilahFragment, TextView[] textViewArray, int n, AyaTextPreset[] ayaTextPresetArray) {
        this.f$0 = colorBismilahFragment;
        this.f$1 = textViewArray;
        this.f$2 = n;
        this.f$3 = ayaTextPresetArray;
    }

    public final void onClick(View view) {
        ColorBismilahFragment colorBismilahFragment = this.f$0;
        TextView[] textViewArray = this.f$1;
        int n = this.f$2;
        AyaTextPreset[] ayaTextPresetArray = this.f$3;
        colorBismilahFragment.cfr_renamed_159(textViewArray, n, ayaTextPresetArray, view);
    }
}

