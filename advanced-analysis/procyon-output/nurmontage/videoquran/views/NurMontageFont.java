// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;

public class NurMontageFont extends AppCompatTextView
{
    private Typeface typeface;
    
    public NurMontageFont(final Context context) {
        super(context);
        this.init(context);
    }
    
    public NurMontageFont(final Context context, final AttributeSet set) {
        super(context, set);
        this.init(context);
    }
    
    public NurMontageFont(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.init(context);
    }
    
    private void init(final Context context) {
        if (this.typeface == null) {
            this.setTypeface(this.typeface = Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf"));
        }
    }
}
