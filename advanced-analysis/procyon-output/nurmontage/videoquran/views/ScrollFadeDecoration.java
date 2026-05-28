// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$State;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView$ItemDecoration;

public class ScrollFadeDecoration extends RecyclerView$ItemDecoration
{
    private final int fadeColor;
    private final int fadeWidth;
    private final Paint paint;
    
    public ScrollFadeDecoration() {
        this.paint = new Paint();
        this.fadeWidth = 50;
        this.fadeColor = -2013265920;
    }
    
    public void onDrawOver(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$State recyclerView$State) {
        final RecyclerView$LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
        final int firstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        final int lastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        final int itemCount = linearLayoutManager.getItemCount();
        final int width = recyclerView.getWidth();
        final int height = recyclerView.getHeight();
        if (firstCompletelyVisibleItemPosition > 0) {
            this.paint.setShader((Shader)new LinearGradient(0.0f, 0.0f, 50.0f, 0.0f, -2013265920, 0, Shader$TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, 50.0f, (float)height, this.paint);
        }
        if (lastCompletelyVisibleItemPosition < itemCount - 1) {
            final float n = (float)(width - 50);
            final float n2 = (float)width;
            this.paint.setShader((Shader)new LinearGradient(n, 0.0f, n2, 0.0f, 0, -2013265920, Shader$TileMode.CLAMP));
            canvas.drawRect(n, 0.0f, n2, (float)height, this.paint);
        }
        this.paint.setShader((Shader)null);
    }
}
