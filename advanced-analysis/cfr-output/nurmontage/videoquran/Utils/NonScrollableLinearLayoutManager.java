/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.recyclerview.widget.LinearLayoutManager
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public class NonScrollableLinearLayoutManager
extends LinearLayoutManager {
    public NonScrollableLinearLayoutManager(Context context) {
        super(context);
    }

    public boolean canScrollVertically() {
        return false;
    }
}

