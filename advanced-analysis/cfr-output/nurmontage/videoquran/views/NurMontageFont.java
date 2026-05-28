/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatTextView
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class NurMontageFont
extends AppCompatTextView {
    private Typeface typeface;

    public NurMontageFont(Context context) {
        super(context);
        this.init(context);
    }

    public NurMontageFont(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public NurMontageFont(Context context, AttributeSet attributeSet, int n) {
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

