// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$State;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Canvas;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$ItemDecoration;

public class ArrowOverlayDecoration extends RecyclerView$ItemDecoration
{
    private final Drawable arrowDrawable;
    private final int arrowSize;
    
    public ArrowOverlayDecoration(final Context context, final int n, final int n2) {
        this.arrowDrawable = AppCompatResources.getDrawable(context, n);
        this.arrowSize = (int)TypedValue.applyDimension(1, (float)n2, context.getResources().getDisplayMetrics());
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
        final int n = recyclerView.getHeight() / 2;
        if (lastCompletelyVisibleItemPosition < itemCount - 1) {
            final int arrowSize = this.arrowSize;
            final int n2 = n - arrowSize / 2;
            this.arrowDrawable.setBounds(0, n2, arrowSize, n2 + arrowSize);
            this.arrowDrawable.setAutoMirrored(false);
            this.arrowDrawable.draw(canvas);
        }
        if (firstCompletelyVisibleItemPosition > 0) {
            final int width = recyclerView.getWidth();
            final int n3 = n - this.arrowSize / 2;
            canvas.save();
            canvas.scale(-1.0f, 1.0f, width - this.arrowSize / 2.0f, 0.0f);
            final Drawable arrowDrawable = this.arrowDrawable;
            final int arrowSize2 = this.arrowSize;
            arrowDrawable.setBounds(width - arrowSize2, n3, width, arrowSize2 + n3);
            this.arrowDrawable.draw(canvas);
            canvas.restore();
        }
    }
}
