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
import hazem.nurmontage.videoquran.model.Gradient;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class GradientAdabter extends RecyclerView$Adapter
{
    private List colors;
    public GradientAdabter$IColor iColorCallback;
    private boolean isSubscribe;
    private final int max_free;
    private int pos_select;
    
    public GradientAdabter(final GradientAdabter$IColor iColorCallback, final List colors, final boolean isSubscribe, final int pos_select) {
        this.max_free = 1;
        this.colors = colors;
        this.iColorCallback = iColorCallback;
        this.isSubscribe = isSubscribe;
        this.pos_select = pos_select;
    }
    
    public int getItemCount() {
        final List colors = this.colors;
        if (colors == null) {
            return 0;
        }
        return colors.size();
    }
    
    public int getPos_select() {
        return this.pos_select;
    }
    
    public Gradient getSelect() {
        final int pos_select = this.pos_select;
        if (pos_select >= 0) {
            return (Gradient)this.colors.get(pos_select);
        }
        return null;
    }
    
    public void onBindViewHolder(final GradientAdabter$ViewHolder gradientAdabter$ViewHolder, int visibility) {
        final ImageView imageView = gradientAdabter$ViewHolder.imageView;
        final View itemView = gradientAdabter$ViewHolder.itemView;
        final Gradient gradient = this.colors.get(visibility);
        final int pos_select = this.pos_select;
        final int n = 1;
        boolean b;
        if (visibility == pos_select) {
            b = (n != 0);
        }
        else {
            b = false;
        }
        this.setGradientBackground((View)imageView, itemView, gradient, b);
        if (!this.isSubscribe && visibility > n) {
            gradientAdabter$ViewHolder.imageLayer.setVisibility(0);
        }
        else {
            final ImageView imageLayer = gradientAdabter$ViewHolder.imageLayer;
            visibility = 8;
            imageLayer.setVisibility(visibility);
        }
    }
    
    public GradientAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new GradientAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_color, viewGroup, false));
    }
    
    public void setGradientBackground(final View view, final int color) {
        final GradientDrawable background = new GradientDrawable();
        background.setColor(color);
        background.setShape(0);
        background.setCornerRadius(100.0f);
        view.setBackground((Drawable)background);
    }
    
    public void setGradientBackground(final View view, final View view2, final Gradient gradient, final boolean b) {
        final float n = 100.0f;
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
        background2.setColors(new int[] { gradient.getColor(), gradient.getSecond(), gradient.getThree() });
        view.setBackground((Drawable)background2);
    }
}
