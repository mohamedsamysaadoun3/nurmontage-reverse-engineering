// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$id;
import android.widget.TextView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import hazem.nurmontage.videoquran.R$layout;
import android.content.Context;
import android.widget.ArrayAdapter;

public class SurahSpinnerAdapter extends ArrayAdapter
{
    private final Context context;
    private boolean isArabic;
    private final String[] surahNames;
    
    public SurahSpinnerAdapter(final Context context, final String[] surahNames, final boolean isArabic) {
        super(context, R$layout.row_spinner_aya, (Object[])surahNames);
        this.context = context;
        this.surahNames = surahNames;
        this.isArabic = isArabic;
    }
    
    private View getCustomView(final int i, View inflate, final ViewGroup viewGroup, int isArabic) {
        if (inflate == null) {
            inflate = LayoutInflater.from(this.context).inflate(isArabic, viewGroup, false);
        }
        Log.e("getCustomView", "" + i);
        final TextView textView = (TextView)inflate.findViewById(R$id.spinner_text);
        isArabic = (this.isArabic ? 1 : 0);
        final String s = " - ";
        String text;
        if (isArabic != 0) {
            text = this.surahNames[i].split(s)[0];
        }
        else {
            final String[] split = this.surahNames[i].split(s);
            isArabic = 1;
            text = split[isArabic];
        }
        textView.setText((CharSequence)text);
        return inflate;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return this.getCustomView(n, view, viewGroup, R$layout.row_spinner_aya);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.getCustomView(n, view, viewGroup, R$layout.row_spinner_aya);
    }
}
