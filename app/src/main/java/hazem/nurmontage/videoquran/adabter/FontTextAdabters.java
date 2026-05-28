package hazem.nurmontage.videoquran.adabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.Utils.FontProvider;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.List;

/* loaded from: classes2.dex */
public class FontTextAdabters extends RecyclerView.Adapter<ViewHolder> {
    private List<String> fontList;
    private final FontProvider fontProvider;
    private FontFragment.IFontCallback iFontCallback;
    private int selected;

    public FontTextAdabters(FontProvider fontProvider, FontFragment.IFontCallback iFontCallback, List<String> list, int resourceId) {
        this.iFontCallback = iFontCallback;
        this.fontList = list;
        this.fontProvider = fontProvider;
        this.selected = resourceId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int index) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_font, viewGroup, false));
    }

    public void setSelected(int index) {
        try {
            int i2 = this.selected;
            this.selected = index;
            notifyItemChanged(i2);
            notifyItemChanged(this.selected);
            List<String> list = this.fontList;
            if (list != null) {
                String name = list.get(index);
                this.iFontCallback.onAdd(this.fontProvider.getFullName(name), this.fontProvider.getTypeface(name));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int index) {
        String textValue = this.fontList.get(index);
        viewHolder.nameFont.setText(textValue);
        viewHolder.tvNumber.setText(String.valueOf(index + 1));
        try {
            viewHolder.nameFont.setTypeface(this.fontProvider.getTypeface(textValue));
            if (this.selected == index) {
                viewHolder.nameFont.setTextColor(-14540254);
                viewHolder.nameFont.setBackgroundResource(C2014R.drawable.btn_item_font_state);
            } else {
                viewHolder.nameFont.setTextColor(-1);
                viewHolder.nameFont.setBackground(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.fontList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextCustumFont nameFont;
        TextCustumFont tvNumber;

        public ViewHolder(View view) {
            super(view);
            this.nameFont = (TextCustumFont) view.findViewById(C2014R.id.tv_font);
            this.tvNumber = (TextCustumFont) view.findViewById(C2014R.id.tv_number);
            this.nameFont.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.FontTextAdabters.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (FontTextAdabters.this.iFontCallback == null || FontTextAdabters.this.selected == ViewHolder.this.getAdapterPosition()) {
                        return;
                    }
                    int index = FontTextAdabters.this.selected;
                    FontTextAdabters.this.selected = ViewHolder.this.getAdapterPosition();
                    FontTextAdabters.this.notifyItemChanged(index);
                    FontTextAdabters.this.notifyItemChanged(FontTextAdabters.this.selected);
                    String str = (String) FontTextAdabters.this.fontList.get(FontTextAdabters.this.selected);
                    FontTextAdabters.this.iFontCallback.onAdd(FontTextAdabters.this.fontProvider.getFullName(str), FontTextAdabters.this.fontProvider.getTypeface(str));
                }
            });
        }
    }

    public void clear() {
        this.iFontCallback = null;
    }
}
