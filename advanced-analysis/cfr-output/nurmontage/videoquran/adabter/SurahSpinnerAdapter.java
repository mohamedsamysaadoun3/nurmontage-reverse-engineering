/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.TextView
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public class SurahSpinnerAdapter
extends ArrayAdapter {
    private final Context context;
    private boolean isArabic;
    private final String[] surahNames;

    public SurahSpinnerAdapter(Context context, String[] stringArray, boolean bl) {
        int n = R$layout.row_spinner_aya;
        super(context, n, (Object[])stringArray);
        this.context = context;
        this.surahNames = stringArray;
        this.isArabic = bl;
    }

    private View getCustomView(int n, View view, ViewGroup object, int n2) {
        Object object2;
        if (view == null) {
            view = LayoutInflater.from((Context)this.context).inflate(n2, (ViewGroup)object, false);
        }
        object = new StringBuilder("");
        object = ((StringBuilder)object).append(n).toString();
        String[] stringArray = "getCustomView";
        Log.e((String)stringArray, (String)object);
        int n3 = R$id.spinner_text;
        object = (TextView)view.findViewById(n3);
        n2 = this.isArabic ? 1 : 0;
        String string2 = " - ";
        if (n2 != 0) {
            stringArray = this.surahNames;
            object2 = stringArray[n].split(string2)[0];
        } else {
            stringArray = this.surahNames;
            object2 = stringArray[n].split(string2);
            n2 = 1;
            object2 = object2[n2];
        }
        object.setText((CharSequence)object2);
        return view;
    }

    public View getDropDownView(int n, View view, ViewGroup viewGroup) {
        int n2 = R$layout.row_spinner_aya;
        return this.getCustomView(n, view, viewGroup, n2);
    }

    public View getView(int n, View view, ViewGroup viewGroup) {
        int n2 = R$layout.row_spinner_aya;
        return this.getCustomView(n, view, viewGroup, n2);
    }
}

