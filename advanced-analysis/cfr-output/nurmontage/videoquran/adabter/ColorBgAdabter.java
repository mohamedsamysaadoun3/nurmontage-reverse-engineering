/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$IColor;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$ViewHolder;

public class ColorBgAdabter
extends RecyclerView.Adapter {
    private int[] colors;
    private boolean enabled;
    public ColorBgAdabter$IColor iColorCallback;
    private int pos_select;

    static /* bridge */ /* synthetic */ int[] cfr_renamed_318(ColorBgAdabter colorBgAdabter) {
        return colorBgAdabter.colors;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_319(ColorBgAdabter colorBgAdabter) {
        return colorBgAdabter.enabled;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_320(ColorBgAdabter colorBgAdabter) {
        return colorBgAdabter.pos_select;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_321(ColorBgAdabter colorBgAdabter, int n) {
        colorBgAdabter.pos_select = n;
    }

    public ColorBgAdabter(ColorBgAdabter$IColor colorBgAdabter$IColor, int[] nArray, int n) {
        this.colors = nArray;
        this.enabled = true;
        this.iColorCallback = colorBgAdabter$IColor;
        this.pos_select = n;
    }

    public int getItemCount() {
        int[] nArray = this.colors;
        if (nArray == null) {
            return 0;
        }
        return nArray.length;
    }

    public int getPos_select() {
        return this.pos_select;
    }

    public void onBindViewHolder(ColorBgAdabter$ViewHolder colorBgAdabter$ViewHolder, int n) {
        ImageView imageView = colorBgAdabter$ViewHolder.imageView;
        colorBgAdabter$ViewHolder = colorBgAdabter$ViewHolder.itemView;
        int[] nArray = this.colors;
        int n2 = nArray[n];
        int n3 = this.pos_select;
        n = n == n3 ? 1 : 0;
        this.setGradientBackground((View)imageView, (View)colorBgAdabter$ViewHolder, n2, n != 0);
    }

    public ColorBgAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_color;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new ColorBgAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void setEnabled(boolean bl) {
        this.enabled = bl;
    }

    public void setGradientBackground(View view, View view2, int n, boolean bl) {
        float f = 10.0f;
        if (bl) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(f);
            int n2 = 3;
            int n3 = -1;
            gradientDrawable.setStroke(n2, n3);
            view2.setBackground((Drawable)gradientDrawable);
        } else {
            bl = false;
            Object var6_7 = null;
            view2.setBackground(null);
        }
        view2 = new GradientDrawable();
        view2.setShape(0);
        view2.setCornerRadius(f);
        view2.setColor(n);
        view.setBackground((Drawable)view2);
    }
}

