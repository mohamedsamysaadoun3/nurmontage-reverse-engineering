// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public class NonScrollableLinearLayoutManager extends LinearLayoutManager
{
    public NonScrollableLinearLayoutManager(final Context context) {
        super(context);
    }
    
    public boolean canScrollVertically() {
        return false;
    }
}
