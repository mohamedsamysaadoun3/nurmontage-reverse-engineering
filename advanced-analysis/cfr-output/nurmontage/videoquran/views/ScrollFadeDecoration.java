/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollFadeDecoration
extends RecyclerView.ItemDecoration {
    private final int fadeColor;
    private final int fadeWidth;
    private final Paint paint;

    public ScrollFadeDecoration() {
        Paint paint;
        this.paint = paint = new Paint();
        this.fadeWidth = 50;
        this.fadeColor = -2013265920;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        LinearGradient linearGradient;
        int n;
        Shader.TileMode tileMode;
        int n2;
        state = recyclerView.getLayoutManager();
        int n3 = state instanceof LinearLayoutManager;
        if (n3 == 0) {
            return;
        }
        state = (LinearLayoutManager)state;
        n3 = state.findFirstCompletelyVisibleItemPosition();
        int n4 = state.findLastCompletelyVisibleItemPosition();
        int n5 = state.getItemCount();
        int n6 = recyclerView.getWidth();
        int n7 = recyclerView.getHeight();
        if (n3 > 0) {
            LinearGradient linearGradient2;
            n2 = 0;
            tileMode = Shader.TileMode.CLAMP;
            n = -2013265920;
            linearGradient = linearGradient2;
            linearGradient2 = new LinearGradient(0.0f, 0.0f, 50.0f, 0.0f, n, 0, tileMode);
            linearGradient = this.paint;
            linearGradient.setShader((Shader)linearGradient2);
            f2 = n7;
            Paint paint = this.paint;
            f = 50.0f;
            canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        }
        if (n4 < (n5 += -1)) {
            n3 = n6 + -50;
            float f3 = n3;
            float f4 = n6;
            n2 = -2013265920;
            tileMode = Shader.TileMode.CLAMP;
            n = 0;
            f2 = 0.0f;
            linearGradient = state;
            state = new LinearGradient(f3, 0.0f, f4, 0.0f, 0, n2, tileMode);
            Paint paint = this.paint;
            paint.setShader((Shader)state);
            f = n7;
            Paint paint2 = this.paint;
            linearGradient = canvas;
            canvas.drawRect(f3, 0.0f, f4, f, paint2);
        }
        this.paint.setShader(null);
    }
}

