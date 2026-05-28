// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ColorBgAdabter extends RecyclerView$Adapter
{
    private int[] colors;
    private boolean enabled;
    public ColorBgAdabter$IColor iColorCallback;
    private int pos_select;
    
    public ColorBgAdabter(final ColorBgAdabter$IColor iColorCallback, final int[] colors, final int pos_select) {
        this.colors = colors;
        this.enabled = true;
        this.iColorCallback = iColorCallback;
        this.pos_select = pos_select;
    }
    
    public int getItemCount() {
        final int[] colors = this.colors;
        if (colors == null) {
            return 0;
        }
        return colors.length;
    }
    
    public int getPos_select() {
        return this.pos_select;
    }
    
    public void onBindViewHolder(final ColorBgAdabter$ViewHolder colorBgAdabter$ViewHolder, int n) {
        final ImageView imageView = colorBgAdabter$ViewHolder.imageView;
        final View itemView = colorBgAdabter$ViewHolder.itemView;
        final int n2 = this.colors[n];
        if (n == this.pos_select) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.setGradientBackground((View)imageView, itemView, n2, (boolean)(n != 0));
    }
    
    public ColorBgAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ColorBgAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_color, viewGroup, false));
    }
    
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
    
    public void setGradientBackground(final View view, final View view2, final int color, final boolean b) {
        final float n = 10.0f;
        if (b) {
            final GradientDrawable background = new GradientDrawable();
            background.setShape(0);
            background.setCornerRadius(n);
            background.setStroke(3, -1);
            view2.setBackground((Drawable)background);
        }
        else {
            view2.setBackground((Drawable)null);
        }
        final GradientDrawable background2 = new GradientDrawable();
        background2.setShape(0);
        background2.setCornerRadius(n);
        background2.setColor(color);
        view.setBackground((Drawable)background2);
    }
}
