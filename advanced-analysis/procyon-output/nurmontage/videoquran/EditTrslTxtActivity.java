// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.view.ViewPropertyAnimator;
import android.graphics.Color;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$IColor;
import hazem.nurmontage.videoquran.views.EditTextCustumFont;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.adabter.ColorBgAdabter;

public class EditTrslTxtActivity extends Base
{
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
    
    public EditTrslTxtActivity() {
        this.onBackPressedCallback = new EditTrslTxtActivity$1(this, true);
        final int[] array;
        final int[] bg_COLORS = array = new int[8];
        array[0] = -8388608;
        array[1] = -1;
        array[2] = -16777216;
        array[3] = -2838729;
        array[4] = -16777088;
        array[5] = -16694239;
        array[6] = -13220529;
        array[7] = -9404272;
        this.BG_COLORS = bg_COLORS;
        this.iColor = new EditTrslTxtActivity$6(this);
    }
    
    private void initRv() {
        this.recyclerView = (RecyclerView)this.findViewById(R$id.rv_color);
        final ColorBgAdabter$IColor iColor = this.iColor;
        final int[] bg_COLORS = this.BG_COLORS;
        this.adapter = new ColorBgAdabter(iColor, bg_COLORS, Utils.indexOf(bg_COLORS, this.clrBg));
        this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this, 0, LocaleHelper.getLanguage((Context)this).equals("ar")));
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setAdapter((RecyclerView$Adapter)this.adapter);
        this.scrollToSelectedPosition();
    }
    
    private void selectOption(final TextCustumFont textCustumFont, final TextCustumFont textCustumFont2) {
        textCustumFont.setBackgroundResource(R$drawable.bg_option_surah_selected);
        textCustumFont.setTextColor(-1);
        textCustumFont2.setBackgroundResource(R$drawable.bg_option_surah_unselected);
        textCustumFont2.setTextColor(Color.parseColor("#888888"));
    }
    
    private void updateColorUI(final boolean b) {
        this.recyclerView.setEnabled(b);
        final ViewPropertyAnimator animate = this.recyclerView.animate();
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.4f;
        }
        animate.alpha(n).setDuration(180L).start();
        this.adapter.setEnabled(b);
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void closeKeyboard() {
        final String s = "input_method";
        try {
            final Object systemService = this.getSystemService(s);
            try {
                final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
                try {
                    final EditTextCustumFont editText = this.editText;
                    try {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
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
    
    public int findWordIndex_Loop(final String s) {
        final String[] stringArray = this.getResources().getStringArray(R$array.surah_names_merged);
        final int n = -1;
        if (s == null) {
            return n;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            if (s.contains(stringArray[i])) {
                return i + 1;
            }
        }
        return n;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_edit_trsl);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new EditTrslTxtActivity$$ExternalSyntheticLambda0());
        this.setStatusBarColor(-15658735);
        this.setNavigationBarColor(-14935010);
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)this.findViewById(R$id.tv_tittle);
        final TextCustumFontBold textCustumFontBold2 = (TextCustumFontBold)this.findViewById(R$id.tv_add_bg);
        textCustumFontBold2.setText((CharSequence)this.mResources.getString(R$string.add_bg));
        textCustumFontBold.setText((CharSequence)this.mResources.getString(R$string.edit));
        this.checkBg = (CheckboxCustumFont)this.findViewById(R$id.checkbox_bg);
        (this.editText = (EditTextCustumFont)this.findViewById(R$id.edt_reader)).requestFocus();
        final String stringExtra = this.getIntent().getStringExtra("reader_name");
        this.getIntent().getStringExtra("surah_name");
        this.style = this.getIntent().getIntExtra("style", 0);
        this.clrBg = this.getIntent().getIntExtra("clrBg", -16777216);
        this.checkBg.setChecked(this.getIntent().getBooleanExtra("isBg", false));
        this.editText.setText((CharSequence)stringExtra);
        this.showKeyboard();
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new EditTrslTxtActivity$2(this));
        this.findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new EditTrslTxtActivity$3(this));
        textCustumFontBold2.setOnClickListener((View$OnClickListener)new EditTrslTxtActivity$4(this));
        this.initRv();
        this.checkBg.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new EditTrslTxtActivity$5(this));
        this.updateColorUI(this.checkBg.isChecked());
    }
    
    protected void onDestroy() {
        super.onDestroy();
    }
    
    protected void onPause() {
        this.closeKeyboard();
        super.onPause();
    }
    
    public void scrollToSelectedPosition() {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.adapter.getPos_select(), this.recyclerView.getWidth() / 2 - 50);
        }
    }
    
    public void showKeyboard() {
        final String s = "input_method";
        try {
            final Object systemService = this.getSystemService(s);
            try {
                final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
                try {
                    inputMethodManager.showSoftInput((View)this.editText, 1);
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
