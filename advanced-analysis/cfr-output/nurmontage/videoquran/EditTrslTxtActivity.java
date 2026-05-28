/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewPropertyAnimator
 *  android.view.Window
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$1;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$2;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$3;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$4;
import hazem.nurmontage.videoquran.EditTrslTxtActivity$5;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$IColor;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public class EditTrslTxtActivity
extends Base {
    final int[] BG_COLORS;
    private ColorBgAdabter adapter;
    private CheckboxCustumFont checkBg;
    private int clrBg;
    private EditTextCustumFont editText;
    private final ColorBgAdabter$IColor iColor;
    private int index_surah;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    private RecyclerView recyclerView;
    private int style;
    private TextCustumFont tvOption1;
    private TextCustumFont tvOption2;

    static /* bridge */ /* synthetic */ CheckboxCustumFont cfr_renamed_358(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.checkBg;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_405(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.clrBg;
    }

    static /* bridge */ /* synthetic */ EditTextCustumFont cfr_renamed_402(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.editText;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_404(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.index_surah;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_403(EditTrslTxtActivity editTrslTxtActivity) {
        return editTrslTxtActivity.style;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_415(EditTrslTxtActivity editTrslTxtActivity, int n) {
        editTrslTxtActivity.clrBg = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_119(EditTrslTxtActivity editTrslTxtActivity, boolean bl) {
        editTrslTxtActivity.updateColorUI(bl);
    }

    public EditTrslTxtActivity() {
        Object object = new EditTrslTxtActivity$1(this, true);
        this.onBackPressedCallback = object;
        Object object2 = object = (Object)new int[8];
        object2[0] = (EditTrslTxtActivity$1)-8388608;
        object2[1] = (EditTrslTxtActivity$1)-1;
        object2[2] = (EditTrslTxtActivity$1)-16777216;
        object2[3] = (EditTrslTxtActivity$1)-2838729;
        object2[4] = (EditTrslTxtActivity$1)-16777088;
        object2[5] = (EditTrslTxtActivity$1)-16694239;
        object2[6] = (EditTrslTxtActivity$1)-13220529;
        object2[7] = (EditTrslTxtActivity$1)-9404272;
        this.BG_COLORS = (int[])object;
        super(this);
        this.iColor = object;
    }

    private void initRv() {
        Object object;
        int n = R$id.rv_color;
        this.recyclerView = object = (RecyclerView)this.findViewById(n);
        Object object2 = this.iColor;
        int[] nArray = this.BG_COLORS;
        int n2 = this.clrBg;
        n2 = Utils.indexOf(nArray, n2);
        object = new ColorBgAdabter((ColorBgAdabter$IColor)object2, nArray, n2);
        this.adapter = object;
        object = this.recyclerView;
        boolean bl = LocaleHelper.getLanguage((Context)this).equals("ar");
        object2 = new LinearLayoutManager((Context)this, 0, bl);
        object.setLayoutManager((RecyclerView.LayoutManager)object2);
        this.recyclerView.setItemAnimator(null);
        this.recyclerView.setHasFixedSize(true);
        object = this.recyclerView;
        object2 = this.adapter;
        object.setAdapter((RecyclerView.Adapter)object2);
        this.scrollToSelectedPosition();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat.Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void selectOption(TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        int n = R$drawable.bg_option_surah_selected;
        textCustumFont.setBackgroundResource(n);
        textCustumFont.setTextColor(-1);
        int n2 = R$drawable.bg_option_surah_unselected;
        textCustumFont2.setBackgroundResource(n2);
        n2 = Color.parseColor((String)"#888888");
        textCustumFont2.setTextColor(n2);
    }

    private void updateColorUI(boolean bl) {
        this.recyclerView.setEnabled(bl);
        ViewPropertyAnimator viewPropertyAnimator = this.recyclerView.animate();
        float f = bl ? 1.0f : 0.4f;
        viewPropertyAnimator.alpha(f).setDuration(180L).start();
        this.adapter.setEnabled(bl);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void closeKeyboard() {
        Object object = "input_method";
        object = this.getSystemService((String)object);
        object = (InputMethodManager)object;
        EditTextCustumFont editTextCustumFont = this.editText;
        editTextCustumFont = editTextCustumFont.getWindowToken();
        try {
            object.hideSoftInputFromWindow((IBinder)editTextCustumFont, 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int findWordIndex_Loop(String string2) {
        int n;
        String[] stringArray = this.getResources();
        int n2 = R$array.surah_names_merged;
        stringArray = stringArray.getStringArray(n2);
        n2 = -1;
        if (string2 == null) {
            return n2;
        }
        for (int i = 0; i < (n = stringArray.length); ++i) {
            String string3 = stringArray[i];
            n = string2.contains(string3) ? 1 : 0;
            if (n == 0) continue;
            return i + 1;
        }
        return n2;
    }

    protected void onCreate(Bundle object) {
        int n;
        super.onCreate(object);
        EdgeToEdge.enable((ComponentActivity)this);
        int bl = R$layout.activity_edit_trsl;
        this.setContentView(bl);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        boolean bl2 = false;
        object2 = null;
        object.setAppearanceLightStatusBars(false);
        object.setAppearanceLightNavigationBars(false);
        int n2 = R$id.main;
        object = this.findViewById(n2);
        Object object3 = new EditTrslTxtActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object3);
        this.setStatusBarColor(-15658735);
        int n3 = -14935010;
        this.setNavigationBarColor(n3);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        int n4 = R$id.tv_tittle;
        object = (TextCustumFontBold)this.findViewById(n4);
        int n5 = R$id.tv_add_bg;
        object3 = (TextCustumFontBold)this.findViewById(n5);
        Object object4 = this.mResources;
        int n6 = R$string.add_bg;
        object4 = object4.getString(n6);
        object3.setText((CharSequence)object4);
        object4 = this.mResources;
        n6 = R$string.edit;
        object4 = object4.getString(n6);
        object.setText((CharSequence)object4);
        int n7 = R$id.checkbox_bg;
        object = (CheckboxCustumFont)this.findViewById(n7);
        this.checkBg = object;
        int n8 = R$id.edt_reader;
        object = (EditTextCustumFont)this.findViewById(n8);
        this.editText = object;
        object.requestFocus();
        object = this.getIntent().getStringExtra("reader_name");
        this.getIntent().getStringExtra("surah_name");
        this.style = n = this.getIntent().getIntExtra("style", 0);
        this.clrBg = n = this.getIntent().getIntExtra("clrBg", -16777216);
        object4 = this.checkBg;
        bl2 = this.getIntent().getBooleanExtra("isBg", false);
        object4.setChecked(bl2);
        this.editText.setText((CharSequence)object);
        this.showKeyboard();
        int n9 = R$id.btn_on_back;
        object = this.findViewById(n9);
        object2 = new EditTrslTxtActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        int n10 = R$id.btn_done;
        object = this.findViewById(n10);
        object2 = new EditTrslTxtActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = new EditTrslTxtActivity$4(this);
        object3.setOnClickListener((View.OnClickListener)object);
        this.initRv();
        object = this.checkBg;
        object2 = new EditTrslTxtActivity$5(this);
        object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        boolean bl3 = this.checkBg.isChecked();
        this.updateColorUI(bl3);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onPause() {
        this.closeKeyboard();
        super.onPause();
    }

    public void scrollToSelectedPosition() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            ColorBgAdabter colorBgAdabter = this.adapter;
            int n = colorBgAdabter.getPos_select();
            RecyclerView recyclerView = this.recyclerView;
            int n2 = recyclerView.getWidth() / 2 + -50;
            linearLayoutManager.scrollToPositionWithOffset(n, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void showKeyboard() {
        Object object = "input_method";
        try {
            object = this.getSystemService((String)object);
        }
        catch (Exception exception) {
            return;
        }
        object = (InputMethodManager)object;
        EditTextCustumFont editTextCustumFont = this.editText;
        int n = 1;
        object.showSoftInput((View)editTextCustumFont, n);
    }
}

