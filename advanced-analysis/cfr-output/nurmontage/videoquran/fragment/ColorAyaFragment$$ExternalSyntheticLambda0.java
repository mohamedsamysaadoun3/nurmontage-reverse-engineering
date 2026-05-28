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
import hazem.nurmontage.videoquran.fragment.ColorAyaFragment;

public final class ColorAyaFragment$$ExternalSyntheticLambda0
implements View.OnClickListener {
    public final /* synthetic */ ColorAyaFragment f$0;
    public final /* synthetic */ TextView[] f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ AyaTextPreset[] f$3;

    public /* synthetic */ ColorAyaFragment$$ExternalSyntheticLambda0(ColorAyaFragment colorAyaFragment, TextView[] textViewArray, int n, AyaTextPreset[] ayaTextPresetArray) {
        this.f$0 = colorAyaFragment;
        this.f$1 = textViewArray;
        this.f$2 = n;
        this.f$3 = ayaTextPresetArray;
    }

    public final void onClick(View view) {
        ColorAyaFragment colorAyaFragment = this.f$0;
        TextView[] textViewArray = this.f$1;
        int n = this.f$2;
        AyaTextPreset[] ayaTextPresetArray = this.f$3;
        colorAyaFragment.cfr_renamed_200(textViewArray, n, ayaTextPresetArray, view);
    }
}

