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
import hazem.nurmontage.videoquran.adabter.GradientAdabter$IColor;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.Gradient;
import java.util.List;

public class GradientAdabter
extends RecyclerView.Adapter {
    private List colors;
    public GradientAdabter$IColor iColorCallback;
    private boolean isSubscribe;
    private final int max_free;
    private int pos_select;

    static /* bridge */ /* synthetic */ List cfr_renamed_318(GradientAdabter gradientAdabter) {
        return gradientAdabter.colors;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_303(GradientAdabter gradientAdabter) {
        return gradientAdabter.isSubscribe;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_320(GradientAdabter gradientAdabter) {
        return gradientAdabter.pos_select;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_321(GradientAdabter gradientAdabter, int n) {
        gradientAdabter.pos_select = n;
    }

    public GradientAdabter(GradientAdabter$IColor gradientAdabter$IColor, List list, boolean bl, int n) {
        this.max_free = 1;
        this.colors = list;
        this.iColorCallback = gradientAdabter$IColor;
        this.isSubscribe = bl;
        this.pos_select = n;
    }

    public int getItemCount() {
        List list = this.colors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPos_select() {
        return this.pos_select;
    }

    public Gradient getSelect() {
        int n = this.pos_select;
        if (n >= 0) {
            return (Gradient)this.colors.get(n);
        }
        return null;
    }

    public void onBindViewHolder(GradientAdabter$ViewHolder gradientAdabter$ViewHolder, int n) {
        ImageView imageView = gradientAdabter$ViewHolder.imageView;
        View view = gradientAdabter$ViewHolder.itemView;
        Gradient gradient = (Gradient)this.colors.get(n);
        int n2 = this.pos_select;
        int n3 = 1;
        n2 = n == n2 ? n3 : 0;
        this.setGradientBackground((View)imageView, view, gradient, n2 != 0);
        boolean bl = this.isSubscribe;
        if (!bl && n > n3) {
            gradientAdabter$ViewHolder = gradientAdabter$ViewHolder.imageLayer;
            gradientAdabter$ViewHolder.setVisibility(0);
        } else {
            gradientAdabter$ViewHolder = gradientAdabter$ViewHolder.imageLayer;
            n = 8;
            gradientAdabter$ViewHolder.setVisibility(n);
        }
    }

    public GradientAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_color;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new GradientAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void setGradientBackground(View view, int n) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(n);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(100.0f);
        view.setBackground((Drawable)gradientDrawable);
    }

    public void setGradientBackground(View view, View view2, Gradient object, boolean bl) {
        int n = 1120403456;
        float f = 100.0f;
        if (bl) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(f);
            int n2 = 3;
            int n3 = -1;
            gradientDrawable.setStroke(n2, n3);
            view2.setBackground((Drawable)gradientDrawable);
        } else {
            boolean bl2 = false;
            Object var7_10 = null;
            view2.setBackground(null);
        }
        view2 = new GradientDrawable();
        view2.setShape(0);
        view2.setCornerRadius(f);
        int n4 = ((Gradient)object).getColor();
        n = ((Gradient)object).getSecond();
        int n5 = ((Gradient)object).getThree();
        object = new int[]{n4, n, n5};
        view2.setColors((int[])object);
        view.setBackground((Drawable)view2);
    }
}

