/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.PopupWindow
 *  android.widget.RelativeLayout
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.ChoiceLangActivity;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.MFileUtils;
import hazem.nurmontage.videoquran.Utils.MFileUtils$FileInfo;
import hazem.nurmontage.videoquran.WorkUserActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.WorkUserActivity$1;
import hazem.nurmontage.videoquran.WorkUserActivity$10;
import hazem.nurmontage.videoquran.WorkUserActivity$11;
import hazem.nurmontage.videoquran.WorkUserActivity$12;
import hazem.nurmontage.videoquran.WorkUserActivity$2;
import hazem.nurmontage.videoquran.WorkUserActivity$3;
import hazem.nurmontage.videoquran.WorkUserActivity$4;
import hazem.nurmontage.videoquran.WorkUserActivity$5;
import hazem.nurmontage.videoquran.WorkUserActivity$6;
import hazem.nurmontage.videoquran.WorkUserActivity$7;
import hazem.nurmontage.videoquran.WorkUserActivity$8;
import hazem.nurmontage.videoquran.WorkUserActivity$9;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class WorkUserActivity
extends Base {
    private boolean backPressedOnce = false;
    private int countClick;
    private Dialog dialog;
    private WorkUserAdabter$IWorkUserCallback iWorkUserCallback;
    private Resources mResources;
    private Toast mToast;
    private OnBackPressedCallback onBackPressedCallback;
    private PopupWindow popupWindow;
    private WorkUserAdabter workUserAdabter;

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetbackPressedOnce(WorkUserActivity workUserActivity) {
        return workUserActivity.backPressedOnce;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetcountClick(WorkUserActivity workUserActivity) {
        return workUserActivity.countClick;
    }

    static /* bridge */ /* synthetic */ Dialog -$$Nest$fgetdialog(WorkUserActivity workUserActivity) {
        return workUserActivity.dialog;
    }

    static /* bridge */ /* synthetic */ WorkUserAdabter$IWorkUserCallback -$$Nest$fgetiWorkUserCallback(WorkUserActivity workUserActivity) {
        return workUserActivity.iWorkUserCallback;
    }

    static /* bridge */ /* synthetic */ Resources -$$Nest$fgetmResources(WorkUserActivity workUserActivity) {
        return workUserActivity.mResources;
    }

    static /* bridge */ /* synthetic */ Toast -$$Nest$fgetmToast(WorkUserActivity workUserActivity) {
        return workUserActivity.mToast;
    }

    static /* bridge */ /* synthetic */ PopupWindow -$$Nest$fgetpopupWindow(WorkUserActivity workUserActivity) {
        return workUserActivity.popupWindow;
    }

    static /* bridge */ /* synthetic */ WorkUserAdabter -$$Nest$fgetworkUserAdabter(WorkUserActivity workUserActivity) {
        return workUserActivity.workUserAdabter;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputbackPressedOnce(WorkUserActivity workUserActivity, boolean bl) {
        workUserActivity.backPressedOnce = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputcountClick(WorkUserActivity workUserActivity, int n) {
        workUserActivity.countClick = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmToast(WorkUserActivity workUserActivity, Toast toast) {
        workUserActivity.mToast = toast;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputworkUserAdabter(WorkUserActivity workUserActivity, WorkUserAdabter workUserAdabter) {
        workUserActivity.workUserAdabter = workUserAdabter;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowPopup(WorkUserActivity workUserActivity, View view, Template template, int n) {
        workUserActivity.showPopup(view, template, n);
    }

    public WorkUserActivity() {
        Object object = new WorkUserActivity$1(this, true);
        this.onBackPressedCallback = object;
        this.iWorkUserCallback = object = new WorkUserActivity$10(this);
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

    private void initRv() {
        int n;
        int n2;
        Object object = this.getSharedPreferences("MTemplate", 0);
        Object object2 = object.getAll();
        if (object2 != null && (n2 = object2.isEmpty()) == 0) {
            boolean bl;
            Object object3 = new GsonBuilder();
            object3 = ((GsonBuilder)object3).create();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            object2 = object2.entrySet().iterator();
            while (bl = object2.hasNext()) {
                Object object4;
                block14: {
                    object4 = (Map.Entry)object2.next();
                    object4 = object4.getKey();
                    object4 = (String)object4;
                    Object object5 = "";
                    object4 = object.getString((String)object4, (String)object5);
                    object5 = Template.class;
                    object4 = ((Gson)object3).fromJson((String)object4, (Class)object5);
                    if ((object4 = (Template)object4) == null) continue;
                    object5 = ((Template)object4).getFileInfo();
                    if (object5 != null) break block14;
                    object5 = this.getApplicationContext();
                    String string2 = ((Template)object4).getUri_video();
                    object5 = MFileUtils.getFileInfo((Context)object5, string2);
                    ((Template)object4).setFileInfo((MFileUtils$FileInfo)object5);
                }
                try {
                    arrayList.add(object4);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            object = new WorkUserActivity$7(this);
            Collections.sort(arrayList, object);
            n = R$id.rv;
            object = (RecyclerView)this.findViewById(n);
            object2 = new WorkUserActivity$8(this, arrayList, (RecyclerView)object);
            object.post((Runnable)object2);
        }
        n = R$id.btn_to_studio;
        object = (ButtonCustumFont)this.findViewById(n);
        object2 = this.mResources;
        n2 = R$string.create_video;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object2 = new WorkUserActivity$9(this);
        object.setOnClickListener((View.OnClickListener)object2);
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

    private void openPlayStoreForRating() {
        String string2 = "android.intent.action.VIEW";
        CharSequence charSequence = "market://details?id=";
        CharSequence charSequence2 = new StringBuilder((String)charSequence);
        charSequence = this.getPackageName();
        charSequence = ((StringBuilder)charSequence2).append((String)charSequence);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = Uri.parse((String)charSequence);
        Object object = new Intent(string2, (Uri)charSequence);
        int n = 0x48000000;
        object.addFlags(n);
        try {
            this.startActivity((Intent)object);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = new StringBuilder("http://play.google.com/store/apps/details?id=");
            charSequence2 = this.getPackageName();
            object = Uri.parse((String)((StringBuilder)object).append((String)charSequence2).toString());
            charSequence = new Intent(string2, (Uri)object);
            this.startActivity((Intent)charSequence);
        }
    }

    private void shareApp() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Check out this app!");
        Object object = this.mResources;
        int n = R$string.share_mjs;
        object = object.getString(n);
        intent.putExtra("android.intent.extra.TEXT", (String)object);
        intent = Intent.createChooser((Intent)intent, (CharSequence)"Share via");
        this.startActivity(intent);
    }

    private void showPopup(View view, Template object, int object2) {
        PopupWindow popupWindow;
        if (object == null) {
            return;
        }
        LayoutInflater layoutInflater = (LayoutInflater)this.getSystemService("layout_inflater");
        int n = R$layout.layout_work_setup;
        layoutInflater = layoutInflater.inflate(n, null);
        int n2 = -2;
        this.popupWindow = popupWindow = new PopupWindow((View)layoutInflater, n2, n2);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        popupWindow.setBackgroundDrawable((Drawable)colorDrawable);
        popupWindow = this.popupWindow;
        n2 = 1;
        popupWindow.setOutsideTouchable(n2 != 0);
        this.popupWindow.setFocusable(n2 != 0);
        n = R$id.btn_share;
        popupWindow = (RelativeLayout)layoutInflater.findViewById(n);
        Object object3 = new WorkUserActivity$4(this, (Template)object);
        popupWindow.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_delete;
        popupWindow = (RelativeLayout)layoutInflater.findViewById(n);
        object3 = new WorkUserActivity$5(this, (int)object2, (Template)object);
        popupWindow.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_duplicate;
        popupWindow = (RelativeLayout)layoutInflater.findViewById(n);
        object3 = new WorkUserActivity$6(this, (Template)object, (int)object2);
        popupWindow.setOnClickListener((View.OnClickListener)object3);
        Object object4 = R$id.tv_share;
        object = (TextCustumFont)layoutInflater.findViewById(object4);
        Object object5 = this.mResources;
        n = R$string.just_share;
        object5 = object5.getString(n);
        object.setText((CharSequence)object5);
        object4 = R$id.tv_duplicate;
        object = (TextCustumFont)layoutInflater.findViewById(object4);
        object5 = this.mResources;
        n = R$string.duplicate;
        object5 = object5.getString(n);
        object.setText((CharSequence)object5);
        object4 = R$id.tv_delete;
        object = (TextCustumFont)layoutInflater.findViewById(object4);
        object5 = this.mResources;
        int n3 = R$string.delete;
        object5 = object5.getString(n3);
        object.setText((CharSequence)object5);
        object = new int[2];
        view.getLocationOnScreen((int[])object);
        object2 = object[0];
        object4 = object[n2];
        n3 = view.getHeight();
        this.popupWindow.showAtLocation(view, 0, object2, object4 += n3);
    }

    private void toLang() {
        Intent intent = new Intent((Context)this, ChoiceLangActivity.class);
        intent.putExtra("from_setting", true);
        this.startActivity(intent);
        this.finish();
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void dialog(int n, Template object, Uri uri) {
        Dialog dialog;
        this.dialog = dialog = new Dialog((Context)this);
        int n2 = 1;
        dialog.setCancelable(n2 != 0);
        this.dialog.requestWindowFeature(n2);
        this.dialog.getWindow().setLayout(-1, -2);
        dialog = this.dialog.getWindow();
        Object object2 = new ColorDrawable(0);
        dialog.setBackgroundDrawable((Drawable)object2);
        dialog = LayoutInflater.from((Context)this);
        n2 = R$layout.layout_dialog;
        dialog = dialog.inflate(n2, null);
        this.dialog.setContentView((View)dialog);
        n2 = R$id.dialog_title;
        dialog.findViewById(n2).setVisibility(8);
        n2 = R$id.dialog_message;
        object2 = (TextCustumFont)dialog.findViewById(n2);
        Object object3 = this.mResources;
        int n3 = R$string.are_you_sure_to_delete_this_work;
        object3 = object3.getString(n3);
        object2.setText((CharSequence)object3);
        n2 = R$id.dialog_no;
        object2 = (ButtonCustumFont)dialog.findViewById(n2);
        object3 = this.mResources;
        n3 = R$string.delete;
        object3 = object3.getString(n3);
        object2.setText((CharSequence)object3);
        object2.setTextColor(-1499549);
        int n4 = R$drawable.btn_dialog_delete;
        ((AppCompatButton)object2).setBackgroundResource(n4);
        object3 = new WorkUserActivity$11(this, uri, (Template)object, n);
        object2.setOnClickListener((View.OnClickListener)object3);
        n = R$id.dialog_yes;
        ButtonCustumFont buttonCustumFont = (ButtonCustumFont)dialog.findViewById(n);
        object = this.mResources;
        int n5 = R$string.no;
        object = object.getString(n5);
        buttonCustumFont.setText((CharSequence)object);
        object = new WorkUserActivity$12(this);
        buttonCustumFont.setOnClickListener((View.OnClickListener)object);
        this.dialog.show();
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_work_user;
        this.setContentView(n);
        object = this.getWindow();
        boolean bl = true;
        WindowCompat.setDecorFitsSystemWindows((Window)object, bl);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new WorkUserActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getResources();
        this.mResources = object;
        this.initRv();
        n = R$id.btn_menu;
        object = this.findViewById(n);
        object2 = new WorkUserActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = BillingPreferences.isSubscribed((Context)this) ? 1 : 0;
        if (n == 0) {
            n = R$id.tv_secret;
            object = this.findViewById(n);
            object2 = new WorkUserActivity$3(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDestroy() {
        super.onDestroy();
        try {
            Glide glide = Glide.get((Context)this);
            glide.clearMemory();
        }
        catch (Exception exception) {}
        this.iWorkUserCallback = null;
        this.onBackPressedCallback = null;
        this.cancelDialog();
    }

    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }
}
