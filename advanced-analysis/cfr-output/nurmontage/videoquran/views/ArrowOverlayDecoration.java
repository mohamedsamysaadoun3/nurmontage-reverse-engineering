/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  androidx.appcompat.content.res.AppCompatResources
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ArrowOverlayDecoration
extends RecyclerView.ItemDecoration {
    private final Drawable arrowDrawable;
    private final int arrowSize;

    public ArrowOverlayDecoration(Context context, int n, int n2) {
        int n3;
        Drawable drawable2;
        this.arrowDrawable = drawable2 = AppCompatResources.getDrawable((Context)context, (int)n);
        float f = n2;
        context = context.getResources().getDisplayMetrics();
        this.arrowSize = n3 = (int)TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)context);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        state = recyclerView.getLayoutManager();
        int n = state instanceof LinearLayoutManager;
        if (n == 0) {
            return;
        }
        state = (LinearLayoutManager)state;
        n = state.findFirstCompletelyVisibleItemPosition();
        int n2 = state.findLastCompletelyVisibleItemPosition();
        int n3 = state.getItemCount();
        int n4 = recyclerView.getHeight() / 2;
        if (n2 < (n3 += -1)) {
            n3 = this.arrowSize;
            n2 = n3 / 2;
            n2 = n4 - n2;
            Drawable drawable2 = this.arrowDrawable;
            int n5 = n2 + n3;
            drawable2.setBounds(0, n2, n3, n5);
            this.arrowDrawable.setAutoMirrored(false);
            state = this.arrowDrawable;
            state.draw(canvas);
        }
        if (n > 0) {
            int n6 = recyclerView.getWidth();
            n3 = this.arrowSize / 2;
            n4 -= n3;
            canvas.save();
            float f = n6;
            float f2 = (float)this.arrowSize / 2.0f;
            f -= f2;
            f2 = 0.0f;
            float f3 = -1.0f;
            float f4 = 1.0f;
            canvas.scale(f3, f4, f, 0.0f);
            state = this.arrowDrawable;
            n = this.arrowSize;
            n2 = n6 - n;
            state.setBounds(n2, n4, n6, n += n4);
            recyclerView = this.arrowDrawable;
            recyclerView.draw(canvas);
            canvas.restore();
        }
    }
}

