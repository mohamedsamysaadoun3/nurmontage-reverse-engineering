// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.R$layout;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.SharedPreferences$Editor;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class RatingBottomSheetDialog extends BottomSheetDialogFragment
{
    private static final String KEY_NEVER_ASK_AGAIN = "never_ask_again_new";
    private static final String PREFS_NAME = "app_prefs_new_mars";
    private Resources res;
    
    public RatingBottomSheetDialog() {
    }
    
    public RatingBottomSheetDialog(final Resources res) {
        this.res = res;
    }
    
    private void openPlayStore(final Context context) {
        final String s = "android.intent.action.VIEW";
        final String str = "market://details?id=";
        final String packageName = context.getPackageName();
        try {
            try {
                final StringBuilder sb = new StringBuilder(str);
                try {
                    final StringBuilder append = sb.append(packageName);
                    try {
                        final String string = append.toString();
                        try {
                            final Intent intent = new Intent(s, Uri.parse(string));
                            try {
                                context.startActivity(intent);
                            }
                            catch (final ActivityNotFoundException ex) {
                                context.startActivity(new Intent(s, Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                            }
                        }
                        catch (final ActivityNotFoundException ex2) {}
                    }
                    catch (final ActivityNotFoundException ex3) {}
                }
                catch (final ActivityNotFoundException ex4) {}
            }
            catch (final ActivityNotFoundException ex5) {}
        }
        catch (final ActivityNotFoundException ex6) {}
    }
    
    public static void setNeverAskAgain(final Context context, final boolean b) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("app_prefs_new_mars", 0).edit();
        edit.putBoolean("never_ask_again_new", b);
        edit.apply();
    }
    
    public static boolean shouldShowRatingDialog(final Context context) {
        return context.getSharedPreferences("app_prefs_new_mars", 0).getBoolean("never_ask_again_new", false) ^ true;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(R$layout.rating_bottom_sheet, viewGroup, false);
        if (this.res == null) {
            return inflate;
        }
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)inflate.findViewById(R$id.rateButton);
        final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)inflate.findViewById(R$id.laterButton);
        final ButtonCustumFont buttonCustumFont3 = (ButtonCustumFont)inflate.findViewById(R$id.neverButton);
        buttonCustumFont.setText((CharSequence)this.res.getString(R$string.rate_now));
        buttonCustumFont2.setText((CharSequence)this.res.getString(R$string.later));
        buttonCustumFont3.setText((CharSequence)this.res.getString(R$string.no_thanks));
        final TextCustumFont textCustumFont = (TextCustumFont)inflate.findViewById(R$id.tv_tittle);
        final TextCustumFont textCustumFont2 = (TextCustumFont)inflate.findViewById(R$id.tv_subtittle);
        textCustumFont.setText((CharSequence)this.res.getString(R$string.enjoying_the_app));
        textCustumFont2.setText((CharSequence)this.res.getString(R$string.moment_to_rate));
        buttonCustumFont.setOnClickListener((View$OnClickListener)new RatingBottomSheetDialog$1(this));
        buttonCustumFont2.setOnClickListener((View$OnClickListener)new RatingBottomSheetDialog$2(this));
        buttonCustumFont3.setOnClickListener((View$OnClickListener)new RatingBottomSheetDialog$3(this));
        return inflate;
    }
}
