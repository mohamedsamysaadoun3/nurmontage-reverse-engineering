// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import android.widget.TextView$OnEditorActionListener;
import android.graphics.Typeface;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View$OnClickListener;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.RemoveTashkeel;
import hazem.nurmontage.videoquran.Utils.Utils;
import android.text.TextUtils;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.os.Looper;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.Utils.JavaBM;
import java.io.InputStream;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ISearchQuranCallback;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedReader;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;

public class QuranSearchActivity extends Base
{
    private ButtonCustumFont btnDone;
    private BufferedReader bufferedReader_quran;
    private TextView countAya;
    private EditText editText;
    private final Handler handler;
    private final SearchQuranAdabters$ISearchQuranCallback iSearchQuranCallback;
    private InputStream in_quran;
    private volatile int indexAya;
    private volatile int indexSurah;
    private boolean isFullSurah;
    private volatile boolean isRun;
    private JavaBM javaBM;
    private String lastKey;
    private String lastSearchKey;
    private int mFrom;
    private int mTo;
    private final OnBackPressedCallback onBackPressedCallback;
    private RecyclerView recyclerView;
    private Runnable runnableByAya;
    private Runnable runnableBySurah;
    private ProgressBar searchProgressBar;
    private SearchQuranAdabters searchQuranAdapter;
    private String[] surahNames;
    private Thread thread;
    
    public QuranSearchActivity() {
        this.mFrom = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.in_quran = null;
        this.bufferedReader_quran = null;
        this.onBackPressedCallback = new QuranSearchActivity$2(this, true);
        this.iSearchQuranCallback = new QuranSearchActivity$4(this);
    }
    
    private void closeQuranStreams() {
        try {
            final BufferedReader bufferedReader_quran = this.bufferedReader_quran;
            if (bufferedReader_quran != null) {
                bufferedReader_quran.close();
            }
            final InputStream in_quran = this.in_quran;
            if (in_quran != null) {
                in_quran.close();
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private int getIndexSurah(String normalizeArabic) {
        normalizeArabic = this.normalizeArabic(normalizeArabic);
        int n = 0;
        while (true) {
            final String[] surahNames = this.surahNames;
            if (n >= surahNames.length) {
                return -1;
            }
            if (this.normalizeArabic(surahNames[n].split("-")[0].trim()).contains(normalizeArabic)) {
                return n;
            }
            ++n;
        }
    }
    
    private void lastSearch() {
        final String lastSearch = QuranPreference.getLastSearch((Context)this);
        if (lastSearch != null && !TextUtils.isEmpty((CharSequence)lastSearch)) {
            try {
                this.editText.setText((CharSequence)lastSearch);
                this.performSearch();
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        }
    }
    
    private String normalizeArabic(String s) {
        final String replacement = "";
        if (s == null) {
            return replacement;
        }
        s = s.trim();
        if (s.startsWith("\u0627\u0644")) {
            s = s.substring(2);
        }
        final String replacement2 = "\u0627";
        return s.replace("\u0623", replacement2).replace("\u0625", replacement2).replace("\u0622", replacement2).replace("\u0649", "\u064a").replace("\u0629", "\u0647").replaceAll("[\\u064B-\\u065F]", replacement);
    }
    
    private void performSearch() {
        this.resetFromTo();
        final String trim = this.editText.getText().toString().trim();
        if (!trim.isEmpty() && !trim.equals("--")) {
            if (Utils.isProbablyLArabic(trim)) {
                final String lastSearchKey = this.lastSearchKey;
                if (lastSearchKey != null && lastSearchKey.equals(trim)) {
                    return;
                }
                this.lastSearchKey = trim.replace("\"", "");
                final SearchQuranAdabters searchQuranAdapter = this.searchQuranAdapter;
                if (searchQuranAdapter != null) {
                    searchQuranAdapter.clear();
                }
                final String[] split = this.lastSearchKey.split(" ");
                final int length = split.length;
                int n = 3;
                final String s = "\u0639\u0645\u0631\u0627\u0646";
                final int n2 = 1;
                final int indexAya = -1;
                Label_0291: {
                    if (length == n2) {
                        final int indexSurah = this.getIndexSurah(split[0]);
                        if (!this.lastSearchKey.contains(s)) {
                            n = indexSurah;
                        }
                        if (n != indexAya) {
                            this.indexSurah = n;
                            this.indexAya = indexAya;
                            this.searchBySurah();
                            return;
                        }
                    }
                    else if (split.length == 2) {
                        final int indexSurah2 = this.getIndexSurah(split[0]);
                        if (!this.lastSearchKey.contains(s)) {
                            n = indexSurah2;
                        }
                        final String[] array = split;
                        try {
                            final String s2 = array[n2];
                            try {
                                final int int1 = Integer.parseInt(s2);
                                if (n == indexAya) {
                                    break Label_0291;
                                }
                                this.indexSurah = n;
                                try {
                                    this.indexAya = int1;
                                    this.searchBySurah();
                                }
                                catch (final NumberFormatException ex) {}
                            }
                            catch (final NumberFormatException ex2) {}
                        }
                        catch (final NumberFormatException ex3) {}
                    }
                }
                this.isFullSurah = false;
                if (this.javaBM == null) {
                    this.javaBM = new JavaBM();
                }
                this.javaBM.setmPattern(RemoveTashkeel.removeTashkeel(this.lastSearchKey));
                this.searchAllQuran();
            }
        }
    }
    
    private void resetFromTo() {
        final int n = -1;
        this.mFrom = n;
        this.mTo = n;
        this.btnDone.setVisibility(8);
    }
    
    private void searchAllQuran() {
        this.stopCurrentSearchThread();
        this.isRun = true;
        (this.thread = new Thread(new QuranSearchActivity$$ExternalSyntheticLambda0(this))).start();
    }
    
    private void searchBySurah() {
        final boolean b = true;
        this.isFullSurah = b;
        if (this.runnableBySurah == null) {
            this.runnableBySurah = new QuranSearchActivity$3(this);
        }
        if (this.thread != null) {
            try {
                this.isRun = false;
                final Thread thread = this.thread;
                try {
                    thread.join();
                }
                catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            catch (final InterruptedException ex2) {}
        }
        this.isRun = b;
        (this.thread = new Thread(this.runnableBySurah)).start();
    }
    
    private void stopCurrentSearchThread() {
        if (this.thread != null) {
            try {
                this.isRun = false;
                final Thread thread = this.thread;
                try {
                    thread.join();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    ex.printStackTrace();
                }
            }
            catch (final InterruptedException ex2) {}
        }
    }
    
    private void updateCount() {
        this.countAya.setText((CharSequence)("\u0627\u0644\u0622\u064a\u0640\u0640\u0640\u0627\u062a : (" + this.searchQuranAdapter.getSize() + ")"));
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
                    final EditText editText = this.editText;
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
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        this.setContentView(R$layout.activity_quran_search);
        final int n = -15658732;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new QuranSearchActivity$$ExternalSyntheticLambda1());
        this.surahNames = this.getResources().getStringArray(R$array.sura_names);
        this.findViewById(R$id.btn_onBack).setOnClickListener((View$OnClickListener)new QuranSearchActivity$$ExternalSyntheticLambda2(this));
        (this.btnDone = (ButtonCustumFont)this.findViewById(R$id.btn_done)).setOnClickListener((View$OnClickListener)new QuranSearchActivity$1(this));
        this.searchProgressBar = (ProgressBar)this.findViewById(R$id.progress);
        this.countAya = (TextView)this.findViewById(R$id.tv_count_aya);
        ((TextCustumFont)this.findViewById(R$id.tv_tittle)).setText((CharSequence)this.getResources().getString(R$string.search));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv_search_quran);
        this.recyclerView = recyclerView;
        final boolean b = true;
        recyclerView.setHasFixedSize(b);
        this.recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        this.recyclerView.setItemViewCacheSize(20);
        this.recyclerView.setDrawingCacheEnabled(b);
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.recyclerView.setDrawingCacheQuality(1048576);
        final SearchQuranAdabters searchQuranAdabters = new SearchQuranAdabters(this.iSearchQuranCallback);
        this.searchQuranAdapter = searchQuranAdabters;
        this.recyclerView.setAdapter((RecyclerView$Adapter)searchQuranAdabters);
        (this.editText = (EditText)this.findViewById(R$id.edt_search_quran)).setHint((CharSequence)this.getResources().getString(R$string.hint_search_quran));
        this.editText.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf"));
        this.editText.setOnEditorActionListener((TextView$OnEditorActionListener)new QuranSearchActivity$$ExternalSyntheticLambda3(this));
        this.findViewById(R$id.btn_search).setOnClickListener((View$OnClickListener)new QuranSearchActivity$$ExternalSyntheticLambda4(this));
        this.lastSearch();
    }
    
    protected void onPause() {
        this.closeKeyboard();
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
        this.editText.requestFocus();
        this.showKeyboard();
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
