package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import hazem.nurmontage.videoquran.C2014R;

/* loaded from: classes2.dex */
public class SurahSpinnerAdapter extends ArrayAdapter<String> {
    private final Context context;
    private boolean isArabic;
    private final String[] surahNames;

    public SurahSpinnerAdapter(Context context, String[] strArr, boolean isFlag) {
        super(context, C2014R.layout.row_spinner_aya, strArr);
        this.context = context;
        this.surahNames = strArr;
        this.isArabic = isFlag;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int value, View view, ViewGroup viewGroup) {
        return getCustomView(value, view, viewGroup, C2014R.layout.row_spinner_aya);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int value, View view, ViewGroup viewGroup) {
        return getCustomView(value, view, viewGroup, C2014R.layout.row_spinner_aya);
    }

    private View getCustomView(int value, View view, ViewGroup viewGroup, int value2) {
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(value2, viewGroup, false);
        }
        Log.e("getCustomView", "" + value);
        TextView textView = (TextView) view.findViewById(C2014R.id.spinner_text);
        if (this.isArabic) {
            str = this.surahNames[value].split(" - ")[0];
        } else {
            str = this.surahNames[value].split(" - ")[1];
        }
        textView.setText(str);
        return view;
    }
}
