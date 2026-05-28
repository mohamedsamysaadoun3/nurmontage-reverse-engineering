// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.bumptech.glide.Glide;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.core.view.WindowCompat;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.content.Context;
import java.util.Iterator;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import hazem.nurmontage.videoquran.Utils.MFileUtils;
import java.util.Map;
import java.util.ArrayList;
import com.google.gson.GsonBuilder;
import hazem.nurmontage.videoquran.model.Template;
import android.view.View;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import android.widget.Toast;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;
import android.app.Dialog;

public class WorkUserActivity extends Base
{
    private boolean backPressedOnce;
    private int countClick;
    private Dialog dialog;
    private WorkUserAdabter$IWorkUserCallback iWorkUserCallback;
    private Resources mResources;
    private Toast mToast;
    private OnBackPressedCallback onBackPressedCallback;
    private PopupWindow popupWindow;
    private WorkUserAdabter workUserAdabter;
    
    public WorkUserActivity() {
        this.backPressedOnce = false;
        this.onBackPressedCallback = new WorkUserActivity$1(this, true);
        this.iWorkUserCallback = new WorkUserActivity$10(this);
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void initRv() {
        final SharedPreferences sharedPreferences = this.getSharedPreferences("MTemplate", 0);
        final Map all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            final Gson create = new GsonBuilder().create();
            final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<Template>();
            for (final Map.Entry<Object, V> entry : all.entrySet()) {
                try {
                    final String key = entry.getKey();
                    try {
                        final Object fromJson = create.fromJson(sharedPreferences.getString((String)key, ""), (Class)Template.class);
                        try {
                            final Template template = (Template)fromJson;
                            if (template == null) {
                                continue;
                            }
                            Label_0193: {
                                if (template.getFileInfo() != null) {
                                    break Label_0193;
                                }
                                final Context applicationContext = this.getApplicationContext();
                                try {
                                    template.setFileInfo(MFileUtils.getFileInfo(applicationContext, template.getUri_video()));
                                    final ArrayList<Object> list2 = list;
                                    try {
                                        list2.add(template);
                                        continue;
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                        continue;
                                    }
                                }
                                catch (final Exception ex2) {}
                            }
                        }
                        catch (final Exception ex3) {}
                    }
                    catch (final Exception ex4) {}
                }
                catch (final Exception ex5) {}
                break;
            }
            Collections.sort(list, new WorkUserActivity$7(this));
            final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
            recyclerView.post((Runnable)new WorkUserActivity$8(this, list, recyclerView));
        }
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)this.findViewById(R$id.btn_to_studio);
        buttonCustumFont.setText((CharSequence)this.mResources.getString(R$string.create_video));
        buttonCustumFont.setOnClickListener((View$OnClickListener)new WorkUserActivity$9(this));
    }
    
    private void openPlayStoreForRating() {
        final String s = "android.intent.action.VIEW";
        final String str = "market://details?id=";
        try {
            try {
                final StringBuilder append = new StringBuilder(str).append(this.getPackageName());
                try {
                    final String string = append.toString();
                    try {
                        final Intent intent = new Intent(s, Uri.parse(string));
                        intent.addFlags(1207959552);
                        try {
                            this.startActivity(intent);
                        }
                        catch (final ActivityNotFoundException ex) {
                            this.startActivity(new Intent(s, Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
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
    
    private void shareApp() {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Check out this app!");
        intent.putExtra("android.intent.extra.TEXT", this.mResources.getString(R$string.share_mjs));
        this.startActivity(Intent.createChooser(intent, (CharSequence)"Share via"));
    }
    
    private void showPopup(final View view, final Template template, int n) {
        if (template == null) {
            return;
        }
        final View inflate = ((LayoutInflater)this.getSystemService("layout_inflater")).inflate(R$layout.layout_work_setup, (ViewGroup)null);
        final int n2 = -2;
        (this.popupWindow = new PopupWindow(inflate, n2, n2)).setBackgroundDrawable((Drawable)new ColorDrawable(0));
        final PopupWindow popupWindow = this.popupWindow;
        final int n3 = 1;
        popupWindow.setOutsideTouchable((boolean)(n3 != 0));
        this.popupWindow.setFocusable((boolean)(n3 != 0));
        ((RelativeLayout)inflate.findViewById(R$id.btn_share)).setOnClickListener((View$OnClickListener)new WorkUserActivity$4(this, template));
        ((RelativeLayout)inflate.findViewById(R$id.btn_delete)).setOnClickListener((View$OnClickListener)new WorkUserActivity$5(this, n, template));
        ((RelativeLayout)inflate.findViewById(R$id.btn_duplicate)).setOnClickListener((View$OnClickListener)new WorkUserActivity$6(this, template, n));
        ((TextCustumFont)inflate.findViewById(R$id.tv_share)).setText((CharSequence)this.mResources.getString(R$string.just_share));
        ((TextCustumFont)inflate.findViewById(R$id.tv_duplicate)).setText((CharSequence)this.mResources.getString(R$string.duplicate));
        ((TextCustumFont)inflate.findViewById(R$id.tv_delete)).setText((CharSequence)this.mResources.getString(R$string.delete));
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        n = array[0];
        this.popupWindow.showAtLocation(view, 0, n, array[n3] + view.getHeight());
    }
    
    private void toLang() {
        final Intent intent = new Intent((Context)this, (Class)ChoiceLangActivity.class);
        intent.putExtra("from_setting", true);
        this.startActivity(intent);
        this.finish();
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void dialog(int dialog_yes, final Template template, final Uri uri) {
        final Dialog dialog = new Dialog((Context)this);
        this.dialog = dialog;
        final int cancelable = 1;
        dialog.setCancelable((boolean)(cancelable != 0));
        this.dialog.requestWindowFeature(cancelable);
        this.dialog.getWindow().setLayout(-1, -2);
        this.dialog.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        final View inflate = LayoutInflater.from((Context)this).inflate(R$layout.layout_dialog, (ViewGroup)null);
        this.dialog.setContentView(inflate);
        inflate.findViewById(R$id.dialog_title).setVisibility(8);
        ((TextCustumFont)inflate.findViewById(R$id.dialog_message)).setText((CharSequence)this.mResources.getString(R$string.are_you_sure_to_delete_this_work));
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)inflate.findViewById(R$id.dialog_no);
        buttonCustumFont.setText((CharSequence)this.mResources.getString(R$string.delete));
        buttonCustumFont.setTextColor(-1499549);
        buttonCustumFont.setBackgroundResource(R$drawable.btn_dialog_delete);
        buttonCustumFont.setOnClickListener((View$OnClickListener)new WorkUserActivity$11(this, uri, template, dialog_yes));
        dialog_yes = R$id.dialog_yes;
        final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)inflate.findViewById(dialog_yes);
        buttonCustumFont2.setText((CharSequence)this.mResources.getString(R$string.no));
        buttonCustumFont2.setOnClickListener((View$OnClickListener)new WorkUserActivity$12(this));
        this.dialog.show();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_work_user);
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), true);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new WorkUserActivity$$ExternalSyntheticLambda0());
        final int n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        this.mResources = this.getResources();
        this.initRv();
        this.findViewById(R$id.btn_menu).setOnClickListener((View$OnClickListener)new WorkUserActivity$2(this));
        if (!BillingPreferences.isSubscribed((Context)this)) {
            this.findViewById(R$id.tv_secret).setOnClickListener((View$OnClickListener)new WorkUserActivity$3(this));
        }
    }
    
    protected void onDestroy() {
        super.onDestroy();
        try {
            final Glide value = Glide.get((Context)this);
            try {
                value.clearMemory();
                this.iWorkUserCallback = null;
                this.onBackPressedCallback = null;
                this.cancelDialog();
            }
            catch (final Exception ex) {}
        }
        catch (final Exception ex2) {}
    }
    
    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }
}
