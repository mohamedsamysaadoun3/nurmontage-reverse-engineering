// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatEditText;

public class EditTextCustumFont extends AppCompatEditText
{
    private Typeface typeface;
    
    public EditTextCustumFont(final Context context) {
        super(context);
        this.init(context);
    }
    
    public EditTextCustumFont(final Context context, final AttributeSet set) {
        super(context, set);
        this.init(context);
    }
    
    public EditTextCustumFont(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.init(context);
    }
    
    private void init(final Context context) {
        if (this.typeface == null) {
            this.setTypeface(this.typeface = Typeface.createFromAsset(this.getResources().getAssets(), "fonts/arabic/\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf"));
        }
    }
}
