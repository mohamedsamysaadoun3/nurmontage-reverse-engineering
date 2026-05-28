// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.graphics.drawable.Drawable;
import hazem.nurmontage.videoquran.R$drawable;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class FontTextAdabters extends RecyclerView$Adapter
{
    private List fontList;
    private final FontProvider fontProvider;
    private FontFragment$IFontCallback iFontCallback;
    private int selected;
    
    public FontTextAdabters(final FontProvider fontProvider, final FontFragment$IFontCallback iFontCallback, final List fontList, final int selected) {
        this.iFontCallback = iFontCallback;
        this.fontList = fontList;
        this.fontProvider = fontProvider;
        this.selected = selected;
    }
    
    public void clear() {
        this.iFontCallback = null;
    }
    
    public int getItemCount() {
        final List fontList = this.fontList;
        if (fontList != null) {
            return fontList.size();
        }
        return 0;
    }
    
    public void onBindViewHolder(final FontTextAdabters$ViewHolder fontTextAdabters$ViewHolder, int btn_item_font_state) {
        final String text = this.fontList.get(btn_item_font_state);
        fontTextAdabters$ViewHolder.nameFont.setText((CharSequence)text);
        fontTextAdabters$ViewHolder.tvNumber.setText((CharSequence)String.valueOf(btn_item_font_state + 1));
        try {
            final TextCustumFont nameFont = fontTextAdabters$ViewHolder.nameFont;
            try {
                nameFont.setTypeface(this.fontProvider.getTypeface(text));
                Label_0118: {
                    if (this.selected != btn_item_font_state) {
                        break Label_0118;
                    }
                    fontTextAdabters$ViewHolder.nameFont.setTextColor(-14540254);
                    final TextCustumFont nameFont2 = fontTextAdabters$ViewHolder.nameFont;
                    try {
                        btn_item_font_state = R$drawable.btn_item_font_state;
                        nameFont2.setBackgroundResource(btn_item_font_state);
                        return;
                        fontTextAdabters$ViewHolder.nameFont.setTextColor(-1);
                        final TextCustumFont nameFont3 = fontTextAdabters$ViewHolder.nameFont;
                        btn_item_font_state = 0;
                        nameFont3.setBackground((Drawable)null);
                    }
                    catch (final Exception ex) {}
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    public FontTextAdabters$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new FontTextAdabters$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_font, viewGroup, false));
    }
    
    public void setSelected(final int selected) {
        try {
            final int selected2 = this.selected;
            this.selected = selected;
            try {
                this.notifyItemChanged(selected2);
                this.notifyItemChanged(this.selected);
                final List fontList = this.fontList;
                if (fontList == null) {
                    return;
                }
                final Object value = fontList.get(selected);
                try {
                    final String s = (String)value;
                    try {
                        final String fullName = this.fontProvider.getFullName(s);
                        try {
                            final FontFragment$IFontCallback iFontCallback = this.iFontCallback;
                            try {
                                iFontCallback.onAdd(fullName, this.fontProvider.getTypeface(s));
                            }
                            catch (final Exception ex) {}
                        }
                        catch (final Exception ex2) {}
                    }
                    catch (final Exception ex3) {}
                }
                catch (final Exception ex4) {}
            }
            catch (final Exception ex5) {}
        }
        catch (final Exception ex6) {}
    }
}
