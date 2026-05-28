/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatImageView
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageViewSimple
extends AppCompatImageView {
    public SquareImageViewSimple(Context context) {
        super(context);
    }

    public SquareImageViewSimple(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageViewSimple(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
    }

    protected void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        n = this.getMeasuredWidth();
        this.setMeasuredDimension(n, n);
    }
}

