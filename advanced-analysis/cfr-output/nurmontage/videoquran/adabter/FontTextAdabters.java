/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import hazem.nurmontage.videoquran.adabter.FontTextAdabters$ViewHolder;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import java.util.List;

public class FontTextAdabters
extends RecyclerView.Adapter {
    private List fontList;
    private final FontProvider fontProvider;
    private FontFragment$IFontCallback iFontCallback;
    private int selected;

    static /* bridge */ /* synthetic */ List cfr_renamed_347(FontTextAdabters fontTextAdabters) {
        return fontTextAdabters.fontList;
    }

    static /* bridge */ /* synthetic */ FontProvider cfr_renamed_348(FontTextAdabters fontTextAdabters) {
        return fontTextAdabters.fontProvider;
    }

    static /* bridge */ /* synthetic */ FontFragment$IFontCallback cfr_renamed_156(FontTextAdabters fontTextAdabters) {
        return fontTextAdabters.iFontCallback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_309(FontTextAdabters fontTextAdabters) {
        return fontTextAdabters.selected;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_310(FontTextAdabters fontTextAdabters, int n) {
        fontTextAdabters.selected = n;
    }

    public FontTextAdabters(FontProvider fontProvider, FontFragment$IFontCallback fontFragment$IFontCallback, List list, int n) {
        this.iFontCallback = fontFragment$IFontCallback;
        this.fontList = list;
        this.fontProvider = fontProvider;
        this.selected = n;
    }

    public void clear() {
        this.iFontCallback = null;
    }

    public int getItemCount() {
        List list = this.fontList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onBindViewHolder(FontTextAdabters$ViewHolder var1_1, int var2_2) {
        var3_3 = (String)this.fontList.get(var2_2);
        var1_1 /* !! */ .nameFont.setText(var3_3);
        var4_4 = var1_1 /* !! */ .tvNumber;
        var5_5 = var2_2 + 1;
        var6_6 = String.valueOf(var5_5);
        var4_4.setText((CharSequence)var6_6);
        try {
            var4_4 = var1_1 /* !! */ .nameFont;
        }
        catch (Exception v0) {
            ** continue;
        }
        var6_6 = this.fontProvider;
        var3_3 = var6_6.getTypeface(var3_3);
        var4_4.setTypeface((Typeface)var3_3);
        var7_7 = this.selected;
        if (var7_7 != var2_2) ** GOTO lbl30
        var8_8 = var1_1 /* !! */ .nameFont;
        var7_7 = -14540254;
        var8_8.setTextColor(var7_7);
        var1_1 /* !! */  = var1_1 /* !! */ .nameFont;
        var2_2 = R$drawable.btn_item_font_state;
        var1_1 /* !! */ .setBackgroundResource(var2_2);
        ** GOTO lbl39
lbl30:
        // 1 sources

        var8_9 = var1_1 /* !! */ .nameFont;
        var7_7 = -1;
        var8_9.setTextColor(var7_7);
        var1_1 /* !! */  = var1_1 /* !! */ .nameFont;
        var2_2 = 0;
        var8_9 = null;
        var1_1 /* !! */ .setBackground(null);
lbl39:
        // 3 sources

    }

    public FontTextAdabters$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_font;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        FontTextAdabters$ViewHolder fontTextAdabters$ViewHolder = new FontTextAdabters$ViewHolder(this, (View)viewGroup);
        return fontTextAdabters$ViewHolder;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void setSelected(int n) {
        Typeface typeface;
        FontProvider fontProvider;
        FontFragment$IFontCallback fontFragment$IFontCallback;
        String string2;
        Object e;
        Object object;
        int n2;
        try {
            n2 = this.selected;
        }
        catch (Exception exception) {
            return;
        }
        {
            this.selected = n;
        }
        {
            this.notifyItemChanged(n2);
            n2 = this.selected;
        }
        {
            this.notifyItemChanged(n2);
            object = this.fontList;
            if (object == null) return;
        }
        {
            e = object.get(n);
        }
        {
            string2 = (String)e;
        }
        {
            object = this.fontProvider;
        }
        {
            object = ((FontProvider)object).getFullName(string2);
        }
        {
            fontFragment$IFontCallback = this.iFontCallback;
        }
        {
            fontProvider = this.fontProvider;
        }
        {
            typeface = fontProvider.getTypeface(string2);
        }
        {
            fontFragment$IFontCallback.onAdd((String)object, typeface);
            return;
        }
    }
}

