/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.SeettingActivity;
import hazem.nurmontage.videoquran.SeettingActivity$19$1;
import hazem.nurmontage.videoquran.SeettingActivity$19$2;
import hazem.nurmontage.videoquran.SeettingActivity$19$3;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

class SeettingActivity$19
implements Runnable {
    final /* synthetic */ SeettingActivity this$0;
    final /* synthetic */ boolean val$s;

    SeettingActivity$19(SeettingActivity seettingActivity, boolean bl) {
        this.this$0 = seettingActivity;
        this.val$s = bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void run() {
        var1_1 = this.this$0;
        var3_4 /* !! */  = this.this$0;
        var2_3 /* !! */  = new Dialog((Context)var3_4 /* !! */ );
        SeettingActivity.cfr_renamed_543(var1_1, var2_3 /* !! */ );
        var1_1 = this.this$0;
        var1_1 = SeettingActivity.cfr_renamed_19(var1_1);
        var4_5 = 0;
        var2_3 /* !! */  = null;
        var1_1.setCancelable(false);
        var1_1 = this.this$0;
        var1_1 = SeettingActivity.cfr_renamed_19(var1_1);
        var5_6 = 1;
        var1_1.requestWindowFeature(var5_6);
        var1_1 = this.this$0;
        var1_1 = SeettingActivity.cfr_renamed_19(var1_1);
        var1_1 = var1_1.getWindow();
        var5_6 = -1;
        var6_7 = -2;
        var1_1.setLayout(var5_6, var6_7);
        var1_1 = this.this$0;
        var1_1 = SeettingActivity.cfr_renamed_19(var1_1);
        var1_1 = var1_1.getWindow();
        var3_4 /* !! */  = new ColorDrawable(0);
        var1_1.setBackgroundDrawable((Drawable)var3_4 /* !! */ );
        var7_8 = this.val$s;
        var4_5 = 0;
        var2_3 /* !! */  = null;
        if (!var7_8) ** GOTO lbl97
        var1_1 = this.this$0;
        var1_1 = LayoutInflater.from((Context)var1_1);
        var5_6 = R$layout.layout_pro_done;
        var1_1 = var1_1.inflate(var5_6, null);
        var2_3 /* !! */  = this.this$0;
        var2_3 /* !! */  = SeettingActivity.cfr_renamed_19((SeettingActivity)var2_3 /* !! */ );
        var2_3 /* !! */ .setContentView((View)var1_1);
        var4_5 = R$id.dialog_title;
        var2_3 /* !! */  = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = (TextCustumFontBold)var2_3 /* !! */ ;
        var3_4 /* !! */  = this.this$0;
        var3_4 /* !! */  = SeettingActivity.cfr_renamed_90(var3_4 /* !! */ );
        var6_7 = R$string.premium_activated;
        var3_4 /* !! */  = var3_4 /* !! */ .getString(var6_7);
        var2_3 /* !! */ .setText((CharSequence)var3_4 /* !! */ );
        var4_5 = R$id.tv_msj;
        var2_3 /* !! */  = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = (TextCustumFont)var2_3 /* !! */ ;
        var3_4 /* !! */  = this.this$0;
        var3_4 /* !! */  = SeettingActivity.cfr_renamed_90(var3_4 /* !! */ );
        var6_7 = R$string.subscription_restored;
        var3_4 /* !! */  = var3_4 /* !! */ .getString(var6_7);
        var2_3 /* !! */ .setText((CharSequence)var3_4 /* !! */ );
        var4_5 = R$id.dialog_no;
        var1_1 = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = new SeettingActivity$19$1(this);
        var1_1.setOnClickListener((View.OnClickListener)var2_3 /* !! */ );
        ** GOTO lbl167
lbl97:
        // 1 sources

        var1_1 = this.this$0;
        var1_1 = LayoutInflater.from((Context)var1_1);
        var5_6 = R$layout.layout_pro_not_found;
        var1_1 = var1_1.inflate(var5_6, null);
        var2_3 /* !! */  = this.this$0;
        var2_3 /* !! */  = SeettingActivity.cfr_renamed_19((SeettingActivity)var2_3 /* !! */ );
        var2_3 /* !! */ .setContentView((View)var1_1);
        var4_5 = R$id.dialog_title;
        var2_3 /* !! */  = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = (TextCustumFontBold)var2_3 /* !! */ ;
        var3_4 /* !! */  = this.this$0;
        var3_4 /* !! */  = SeettingActivity.cfr_renamed_90(var3_4 /* !! */ );
        var6_7 = R$string.nothing_to_restore;
        var3_4 /* !! */  = var3_4 /* !! */ .getString(var6_7);
        var2_3 /* !! */ .setText((CharSequence)var3_4 /* !! */ );
        var4_5 = R$id.tv_msj;
        var2_3 /* !! */  = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = (TextCustumFont)var2_3 /* !! */ ;
        var3_4 /* !! */  = this.this$0;
        var3_4 /* !! */  = SeettingActivity.cfr_renamed_90(var3_4 /* !! */ );
        var6_7 = R$string.msj_no_found_subscribe;
        var3_4 /* !! */  = var3_4 /* !! */ .getString(var6_7);
        var2_3 /* !! */ .setText((CharSequence)var3_4 /* !! */ );
        var2_3 /* !! */  = this.this$0;
        var2_3 /* !! */  = var2_3 /* !! */ .getResources();
        var2_3 /* !! */  = var2_3 /* !! */ .getAssets();
        var3_4 /* !! */  = "fonts/ReadexPro_Medium.ttf";
        var2_3 /* !! */  = Typeface.createFromAsset((AssetManager)var2_3 /* !! */ , (String)var3_4 /* !! */ );
        var5_6 = R$id.contact_us;
        var3_4 /* !! */  = var1_1.findViewById(var5_6);
        var3_4 /* !! */  = (Button)var3_4 /* !! */ ;
        var3_4 /* !! */ .setTypeface((Typeface)var2_3 /* !! */ );
        var2_3 /* !! */  = new SeettingActivity$19$2(this);
        var3_4 /* !! */ .setOnClickListener((View.OnClickListener)var2_3 /* !! */ );
        var4_5 = R$id.dialog_no;
        var1_1 = var1_1.findViewById(var4_5);
        var2_3 /* !! */  = new SeettingActivity$19$3(this);
        var1_1.setOnClickListener((View.OnClickListener)var2_3 /* !! */ );
lbl167:
        // 2 sources

        var1_1 = this.this$0;
        var1_1 = SeettingActivity.cfr_renamed_19(var1_1);
        var1_1.show();
        var1_1 = this.this$0;
        var4_5 = R$id.progress;
        var1_1 = var1_1.findViewById(var4_5);
        var4_5 = 8;
        try {
            var1_1.setVisibility(var4_5);
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

