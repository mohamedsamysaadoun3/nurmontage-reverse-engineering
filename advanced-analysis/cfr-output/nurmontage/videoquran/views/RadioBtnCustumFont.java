/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatRadioButton
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;

public class RadioBtnCustumFont
extends AppCompatRadioButton {
    private Typeface typeface;

    public RadioBtnCustumFont(Context context) {
        super(context);
        this.init(context);
    }

    public RadioBtnCustumFont(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public RadioBtnCustumFont(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(context);
    }

    private void init(Context context) {
        context = this.typeface;
        if (context == null) {
            context = this.getResources().getAssets();
            String string2 = "fonts/ReadexPro_Medium.ttf";
            context = Typeface.createFromAsset((AssetManager)context, (String)string2);
            this.typeface = context;
            this.setTypeface((Typeface)context);
        }
    }
}

