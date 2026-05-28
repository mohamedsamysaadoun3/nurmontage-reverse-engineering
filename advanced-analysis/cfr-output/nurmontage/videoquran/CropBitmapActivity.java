/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.CropBitmapActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.CropBitmapActivity$1;
import hazem.nurmontage.videoquran.CropBitmapActivity$2;
import hazem.nurmontage.videoquran.CropBitmapActivity$3;
import hazem.nurmontage.videoquran.CropBitmapActivity$4;
import hazem.nurmontage.videoquran.CropBitmapActivity$5;
import hazem.nurmontage.videoquran.CropBitmapActivity$6;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.CropView;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CropBitmapActivity
extends Base {
    public static boolean isActive;
    private CropView cropView;
    private Dialog dialog;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ CropView -$$Nest$fgetcropView(CropBitmapActivity cropBitmapActivity) {
        return cropBitmapActivity.cropView;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcancel(CropBitmapActivity cropBitmapActivity) {
        cropBitmapActivity.cancel();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcancelDialog(CropBitmapActivity cropBitmapActivity) {
        cropBitmapActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mtoProVersion(CropBitmapActivity cropBitmapActivity) {
        cropBitmapActivity.toProVersion();
    }

    public CropBitmapActivity() {
        CropBitmapActivity$1 cropBitmapActivity$1 = new CropBitmapActivity$1(this, true);
        this.onBackPressedCallback = cropBitmapActivity$1;
    }

    private void cancel() {
        this.setResult(0);
        this.finish();
    }

    private void cancelDialog() {
        boolean bl;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl = dialog.isShowing())) {
            dialog = this.dialog;
            dialog.dismiss();
        }
        this.dialog = null;
    }

    private void init() {
        int n = R$id.btn_cancel;
        Object object = this.findViewById(n);
        Object object2 = new CropBitmapActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = Common.bitmap;
        if (object != null && (object = Common.rect) != null) {
            n = R$id.crop_view;
            object = (CropView)this.findViewById(n);
            this.cropView = object;
            object2 = new CropBitmapActivity$5(this);
            object.post((Runnable)object2);
            n = R$id.btn_done;
            object = (ButtonCustumFont)this.findViewById(n);
            object2 = this.mResources;
            int n2 = R$string.done;
            object2 = object2.getString(n2);
            object.setText((CharSequence)object2);
            object2 = new CropBitmapActivity$6(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat$Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void toProVersion() {
        Intent intent = new Intent((Context)this, ProVersionActivity.class);
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void dialogPremium() {
        Object object;
        block45: {
            object = this.dialog;
            if (object == null) break block45;
            this.cancelDialog();
        }
        object = new Dialog((Context)this);
        this.dialog = object;
        int n = 1;
        object.setCancelable(n != 0);
        object = this.dialog;
        object.requestWindowFeature(n);
        object = this.dialog;
        object = object.getWindow();
        n = -1;
        int n2 = -2;
        object.setLayout(n, n2);
        object = this.dialog;
        object = object.getWindow();
        n2 = 0;
        Object object2 = null;
        Object object3 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object3);
        object = LayoutInflater.from((Context)this);
        n = R$layout.layout_dialog;
        int n3 = 0;
        object = object.inflate(n, null);
        object3 = this.dialog;
        object3.setContentView((View)object);
        n = R$id.dialog_title;
        object3 = object.findViewById(n);
        n3 = 8;
        object3.setVisibility(n3);
        n = R$id.img_pro;
        object3 = object.findViewById(n);
        object3.setVisibility(0);
        n = R$id.dialog_message;
        object3 = object.findViewById(n);
        object3 = (TextCustumFont)object3;
        object2 = this.mResources;
        n3 = R$string.unlock_premium;
        object2 = object2.getString(n3);
        object3.setText((CharSequence)object2);
        n2 = 17;
        object3.setGravity(n2);
        n = R$id.dialog_no;
        object3 = object.findViewById(n);
        object3 = (ButtonCustumFont)object3;
        object2 = this.mResources;
        n3 = R$string.no;
        object2 = object2.getString(n3);
        object3.setText((CharSequence)object2);
        object2 = new CropBitmapActivity$2(this);
        object3.setOnClickListener((View.OnClickListener)object2);
        n = R$id.dialog_yes;
        object = object.findViewById(n);
        object = (ButtonCustumFont)object;
        object3 = this.mResources;
        n2 = R$string.yes;
        object3 = object3.getString(n2);
        object.setText((CharSequence)object3);
        object3 = new CropBitmapActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.dialog;
        try {
            object.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_crop_bitmap;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        isActive = true;
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new CropBitmapActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        if (object != null) {
            n = R$id.tv_tittle_fragment;
            object = (TextCustumFont)this.findViewById(n);
            object2 = this.mResources;
            int n2 = R$string.choice_screen_ipod;
            object2 = object2.getString(n2);
            object.setText((CharSequence)object2);
        }
        this.init();
    }

    protected void onDestroy() {
        super.onDestroy();
        isActive = false;
    }

    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }
}
