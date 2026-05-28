// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.view.Window;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.common.Common;
import android.view.View$OnClickListener;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import android.app.Dialog;
import hazem.nurmontage.videoquran.views.CropView;

public class CropBitmapActivity extends Base
{
    public static boolean isActive;
    private CropView cropView;
    private Dialog dialog;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public CropBitmapActivity() {
        this.onBackPressedCallback = new CropBitmapActivity$1(this, true);
    }
    
    private void cancel() {
        this.setResult(0);
        this.finish();
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void init() {
        this.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new CropBitmapActivity$4(this));
        if (Common.bitmap != null) {
            if (Common.rect != null) {
                (this.cropView = (CropView)this.findViewById(R$id.crop_view)).post((Runnable)new CropBitmapActivity$5(this));
                final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)this.findViewById(R$id.btn_done);
                buttonCustumFont.setText((CharSequence)this.mResources.getString(R$string.done));
                buttonCustumFont.setOnClickListener((View$OnClickListener)new CropBitmapActivity$6(this));
            }
        }
    }
    
    private void toProVersion() {
        final Intent intent = new Intent((Context)this, (Class)ProVersionActivity.class);
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void dialogPremium() {
        try {
            if (this.dialog != null) {
                this.cancelDialog();
            }
            final Dialog dialog = new Dialog((Context)this);
            try {
                this.dialog = dialog;
                final int cancelable = 1;
                dialog.setCancelable((boolean)(cancelable != 0));
                this.dialog.requestWindowFeature(cancelable);
                final Dialog dialog2 = this.dialog;
                try {
                    dialog2.getWindow().setLayout(-1, -2);
                    final Dialog dialog3 = this.dialog;
                    try {
                        final Window window = dialog3.getWindow();
                        try {
                            final ColorDrawable backgroundDrawable = new ColorDrawable(0);
                            final Window window2 = window;
                            try {
                                window2.setBackgroundDrawable((Drawable)backgroundDrawable);
                                final LayoutInflater from = LayoutInflater.from((Context)this);
                                try {
                                    final View inflate = from.inflate(R$layout.layout_dialog, (ViewGroup)null);
                                    try {
                                        this.dialog.setContentView(inflate);
                                        inflate.findViewById(R$id.dialog_title).setVisibility(8);
                                        inflate.findViewById(R$id.img_pro).setVisibility(0);
                                        final View viewById = inflate.findViewById(R$id.dialog_message);
                                        try {
                                            final TextCustumFont textCustumFont = (TextCustumFont)viewById;
                                            try {
                                                final Resources mResources = this.mResources;
                                                try {
                                                    textCustumFont.setText((CharSequence)mResources.getString(R$string.unlock_premium));
                                                    textCustumFont.setGravity(17);
                                                    final View viewById2 = inflate.findViewById(R$id.dialog_no);
                                                    try {
                                                        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)viewById2;
                                                        try {
                                                            final Resources mResources2 = this.mResources;
                                                            try {
                                                                buttonCustumFont.setText((CharSequence)mResources2.getString(R$string.no));
                                                                final CropBitmapActivity$2 onClickListener = new CropBitmapActivity$2(this);
                                                                final ButtonCustumFont buttonCustumFont2 = buttonCustumFont;
                                                                try {
                                                                    buttonCustumFont2.setOnClickListener((View$OnClickListener)onClickListener);
                                                                    final View viewById3 = inflate.findViewById(R$id.dialog_yes);
                                                                    try {
                                                                        final ButtonCustumFont buttonCustumFont3 = (ButtonCustumFont)viewById3;
                                                                        try {
                                                                            final Resources mResources3 = this.mResources;
                                                                            try {
                                                                                buttonCustumFont3.setText((CharSequence)mResources3.getString(R$string.yes));
                                                                                final CropBitmapActivity$3 onClickListener2 = new CropBitmapActivity$3(this);
                                                                                final ButtonCustumFont buttonCustumFont4 = buttonCustumFont3;
                                                                                try {
                                                                                    buttonCustumFont4.setOnClickListener((View$OnClickListener)onClickListener2);
                                                                                    final Dialog dialog4 = this.dialog;
                                                                                    try {
                                                                                        dialog4.show();
                                                                                    }
                                                                                    catch (final Exception ex) {
                                                                                        ex.printStackTrace();
                                                                                    }
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
                                                            catch (final Exception ex7) {}
                                                        }
                                                        catch (final Exception ex8) {}
                                                    }
                                                    catch (final Exception ex9) {}
                                                }
                                                catch (final Exception ex10) {}
                                            }
                                            catch (final Exception ex11) {}
                                        }
                                        catch (final Exception ex12) {}
                                    }
                                    catch (final Exception ex13) {}
                                }
                                catch (final Exception ex14) {}
                            }
                            catch (final Exception ex15) {}
                        }
                        catch (final Exception ex16) {}
                    }
                    catch (final Exception ex17) {}
                }
                catch (final Exception ex18) {}
            }
            catch (final Exception ex19) {}
        }
        catch (final Exception ex20) {}
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_crop_bitmap);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        CropBitmapActivity.isActive = true;
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new CropBitmapActivity$$ExternalSyntheticLambda0());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources != null) {
            ((TextCustumFont)this.findViewById(R$id.tv_tittle_fragment)).setText((CharSequence)this.mResources.getString(R$string.choice_screen_ipod));
        }
        this.init();
    }
    
    protected void onDestroy() {
        super.onDestroy();
        CropBitmapActivity.isActive = false;
    }
    
    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }
}
