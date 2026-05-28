/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  com.google.android.material.bottomsheet.BottomSheetDialogFragment
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog$1;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog$2;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog$3;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class RatingBottomSheetDialog
extends BottomSheetDialogFragment {
    private static final String KEY_NEVER_ASK_AGAIN = "never_ask_again_new";
    private static final String PREFS_NAME = "app_prefs_new_mars";
    private Resources res;

    static /* bridge */ /* synthetic */ void cfr_renamed_166(RatingBottomSheetDialog ratingBottomSheetDialog, Context context) {
        ratingBottomSheetDialog.openPlayStore(context);
    }

    public RatingBottomSheetDialog() {
    }

    public RatingBottomSheetDialog(Resources resources) {
        this.res = resources;
    }

    private void openPlayStore(Context context) {
        String string2 = "android.intent.action.VIEW";
        CharSequence charSequence = "market://details?id=";
        String string3 = context.getPackageName();
        CharSequence charSequence2 = new StringBuilder((String)charSequence);
        charSequence = ((StringBuilder)charSequence2).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = Uri.parse((String)charSequence);
        Object object = new Intent(string2, (Uri)charSequence);
        try {
            context.startActivity((Intent)object);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            charSequence2 = "https://play.google.com/store/apps/details?id=";
            object = new StringBuilder((String)charSequence2);
            string3 = Uri.parse((String)((StringBuilder)object).append(string3).toString());
            charSequence = new Intent(string2, (Uri)string3);
            context.startActivity((Intent)charSequence);
        }
    }

    public static void setNeverAskAgain(Context context, boolean bl) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean(KEY_NEVER_ASK_AGAIN, bl);
        context.apply();
    }

    public static boolean shouldShowRatingDialog(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(KEY_NEVER_ASK_AGAIN, false) ^ true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n = R$layout.rating_bottom_sheet;
        int n2 = 0;
        ButtonCustumFont buttonCustumFont = null;
        layoutInflater = layoutInflater.inflate(n, object, false);
        object = this.res;
        if (object == null) {
            return layoutInflater;
        }
        int n3 = R$id.rateButton;
        object = (ButtonCustumFont)layoutInflater.findViewById(n3);
        n = R$id.laterButton;
        object2 = (ButtonCustumFont)layoutInflater.findViewById(n);
        n2 = R$id.neverButton;
        buttonCustumFont = (ButtonCustumFont)layoutInflater.findViewById(n2);
        Object object3 = this.res;
        int n4 = R$string.rate_now;
        object3 = object3.getString(n4);
        object.setText((CharSequence)object3);
        object3 = this.res;
        n4 = R$string.later;
        object3 = object3.getString(n4);
        object2.setText((CharSequence)object3);
        object3 = this.res;
        n4 = R$string.no_thanks;
        object3 = object3.getString(n4);
        buttonCustumFont.setText((CharSequence)object3);
        int n5 = R$id.tv_tittle;
        object3 = (TextCustumFont)layoutInflater.findViewById(n5);
        n4 = R$id.tv_subtittle;
        TextCustumFont textCustumFont = (TextCustumFont)layoutInflater.findViewById(n4);
        Object object4 = this.res;
        int n6 = R$string.enjoying_the_app;
        object4 = object4.getString(n6);
        object3.setText((CharSequence)object4);
        object3 = this.res;
        int n7 = R$string.moment_to_rate;
        object3 = object3.getString(n7);
        textCustumFont.setText((CharSequence)object3);
        object3 = new RatingBottomSheetDialog$1(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = new RatingBottomSheetDialog$2(this);
        object2.setOnClickListener((View.OnClickListener)object);
        object = new RatingBottomSheetDialog$3(this);
        buttonCustumFont.setOnClickListener((View.OnClickListener)object);
        return layoutInflater;
    }
}

