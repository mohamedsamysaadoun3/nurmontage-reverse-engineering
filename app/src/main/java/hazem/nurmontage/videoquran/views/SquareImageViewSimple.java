package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public class SquareImageViewSimple extends AppCompatImageView {
    public SquareImageViewSimple(Context context) {
        super(context);
    }

    public SquareImageViewSimple(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageViewSimple(Context context, AttributeSet attributeSet, int index) {
        super(context, attributeSet, index);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int width, int width3) {
        super.onMeasure(width, width3);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
