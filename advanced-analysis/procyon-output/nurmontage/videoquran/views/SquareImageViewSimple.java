// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageViewSimple extends AppCompatImageView
{
    public SquareImageViewSimple(final Context context) {
        super(context);
    }
    
    public SquareImageViewSimple(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SquareImageViewSimple(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void onMeasure(int measuredWidth, final int n) {
        super.onMeasure(measuredWidth, n);
        measuredWidth = this.getMeasuredWidth();
        this.setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
