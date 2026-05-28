/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.QuranSearchActivity$$ExternalSyntheticLambda7;
import hazem.nurmontage.videoquran.QuranSearchActivity$1;
import hazem.nurmontage.videoquran.QuranSearchActivity$3;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.JavaBM;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import hazem.nurmontage.videoquran.Utils.RemoveTashkeel;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters;
import hazem.nurmontage.videoquran.adabter.SearchQuranAdabters$ISearchQuranCallback;
import hazem.nurmontage.videoquran.model.ItemQuranSearch;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class QuranSearchActivity
extends Base {
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
    private int mFrom = -1;
    private int mTo;
    private final OnBackPressedCallback onBackPressedCallback;
    private RecyclerView recyclerView;
    private Runnable runnableByAya;
    private Runnable runnableBySurah;
    private ProgressBar searchProgressBar;
    private SearchQuranAdabters searchQuranAdapter;
    private String[] surahNames;
    private Thread thread;

    static /* bridge */ /* synthetic */ ButtonCustumFont -$$Nest$fgetbtnDone(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.btnDone;
    }

    static /* bridge */ /* synthetic */ BufferedReader -$$Nest$fgetbufferedReader_quran(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.bufferedReader_quran;
    }

    static /* bridge */ /* synthetic */ EditText -$$Nest$fgeteditText(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.editText;
    }

    static /* bridge */ /* synthetic */ Handler -$$Nest$fgethandler(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.handler;
    }

    static /* bridge */ /* synthetic */ InputStream -$$Nest$fgetin_quran(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.in_quran;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetindexAya(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.indexAya;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetindexSurah(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.indexSurah;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetisFullSurah(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.isFullSurah;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetisRun(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.isRun;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetmFrom(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.mFrom;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetmTo(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.mTo;
    }

    static /* bridge */ /* synthetic */ ProgressBar -$$Nest$fgetsearchProgressBar(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.searchProgressBar;
    }

    static /* bridge */ /* synthetic */ SearchQuranAdabters -$$Nest$fgetsearchQuranAdapter(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.searchQuranAdapter;
    }

    static /* bridge */ /* synthetic */ String[] -$$Nest$fgetsurahNames(QuranSearchActivity quranSearchActivity) {
        return quranSearchActivity.surahNames;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputbufferedReader_quran(QuranSearchActivity quranSearchActivity, BufferedReader bufferedReader) {
        quranSearchActivity.bufferedReader_quran = bufferedReader;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputin_quran(QuranSearchActivity quranSearchActivity, InputStream inputStream) {
        quranSearchActivity.in_quran = inputStream;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputindexSurah(QuranSearchActivity quranSearchActivity, int n) {
        quranSearchActivity.indexSurah = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmFrom(QuranSearchActivity quranSearchActivity, int n) {
        quranSearchActivity.mFrom = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmTo(QuranSearchActivity quranSearchActivity, int n) {
        quranSearchActivity.mTo = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateCount(QuranSearchActivity quranSearchActivity) {
        quranSearchActivity.updateCount();
    }

    public QuranSearchActivity() {
        Object object;
        Looper looper = Looper.getMainLooper();
        this.handler = object = new Handler(looper);
        this.in_quran = null;
        this.bufferedReader_quran = null;
        super(this, true);
        this.onBackPressedCallback = object;
        super(this);
        this.iSearchQuranCallback = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void closeQuranStreams() {
        try {
            Closeable closeable = this.bufferedReader_quran;
            if (closeable != null) {
                ((BufferedReader)closeable).close();
            }
            if ((closeable = this.in_quran) == null) return;
            ((InputStream)closeable).close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int getIndexSurah(String string) {
        Object object;
        int n;
        string = this.normalizeArabic(string);
        for (int i = 0; i < (n = ((String[])(object = this.surahNames)).length); ++i) {
            object = object[i];
            String string2 = "-";
            object = ((String)object).split(string2)[0].trim();
            boolean bl = ((String)(object = this.normalizeArabic((String)object))).contains(string);
            if (!bl) continue;
            return i;
        }
        return -1;
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

    private void lastSearch() {
        boolean bl;
        String string = QuranPreference.getLastSearch((Context)this);
        if (string != null && !(bl = TextUtils.isEmpty((CharSequence)string))) {
            Object object = this.editText;
            try {
                object.setText((CharSequence)string);
                this.performSearch();
            }
            catch (InterruptedException interruptedException) {
                object = Thread.currentThread();
                ((Thread)object).interrupt();
                interruptedException.printStackTrace();
            }
        }
    }

    private String normalizeArabic(String string) {
        String string2;
        String string3 = "";
        if (string == null) {
            return string3;
        }
        int n = (string = string.trim()).startsWith(string2 = "\u0627\u0644");
        if (n != 0) {
            n = 2;
            string = string.substring(n);
        }
        String string4 = "\u0627";
        return string.replace("\u0623", string4).replace("\u0625", string4).replace("\u0622", string4).replace("\u0649", "\u064a").replace("\u0629", "\u0647").replaceAll("[\\u064B-\\u065F]", string3);
    }

    private void performSearch() {
        block12: {
            String string;
            Object object;
            block11: {
                int n;
                int n2;
                String string2;
                int n3;
                block13: {
                    boolean bl;
                    boolean bl2;
                    boolean bl3;
                    this.resetFromTo();
                    object = this.editText.getText().toString().trim();
                    boolean n4 = ((String)object).isEmpty();
                    if (n4 || (bl3 = ((String)object).equals(string = "--")) || !(bl2 = Utils.isProbablyLArabic((String)object))) break block12;
                    string = this.lastSearchKey;
                    if (string != null && (bl = string.equals(object))) {
                        return;
                    }
                    string = "\"";
                    String string3 = "";
                    object = ((String)object).replace(string, string3);
                    this.lastSearchKey = object;
                    object = this.searchQuranAdapter;
                    if (object != null) {
                        ((SearchQuranAdabters)object).clear();
                    }
                    object = this.lastSearchKey;
                    string = " ";
                    object = ((String)object).split(string);
                    int n5 = ((String[])object).length;
                    n3 = 3;
                    string2 = "\u0639\u0645\u0631\u0627\u0646";
                    n2 = 1;
                    n = -1;
                    if (n5 != n2) break block13;
                    object = object[0];
                    int n6 = this.getIndexSurah((String)object);
                    string = this.lastSearchKey;
                    boolean bl4 = string.contains(string2);
                    if (!bl4) {
                        n3 = n6;
                    }
                    if (n3 == n) break block11;
                    this.indexSurah = n3;
                    this.indexAya = n;
                    this.searchBySurah();
                    break block12;
                }
                int n7 = ((String[])object).length;
                int n8 = 2;
                if (n7 == n8) {
                    string = object[0];
                    int n9 = this.getIndexSurah(string);
                    String string4 = this.lastSearchKey;
                    boolean bl = string4.contains(string2);
                    if (!bl) {
                        n3 = n9;
                    }
                    try {
                        object = object[n2];
                    }
                    catch (NumberFormatException numberFormatException) {}
                    int n10 = Integer.parseInt((String)object);
                    if (n3 == n) break block11;
                    this.indexSurah = n3;
                    this.indexAya = n10;
                    this.searchBySurah();
                    break block12;
                }
            }
            this.isFullSurah = false;
            object = this.javaBM;
            if (object == null) {
                this.javaBM = object = new JavaBM();
            }
            object = this.javaBM;
            string = RemoveTashkeel.removeTashkeel(this.lastSearchKey);
            ((JavaBM)object).setmPattern(string);
            this.searchAllQuran();
        }
    }

    private void resetFromTo() {
        int n;
        this.mFrom = n = -1;
        this.mTo = n;
        this.btnDone.setVisibility(8);
    }

    private void searchAllQuran() {
        Thread thread;
        this.stopCurrentSearchThread();
        this.isRun = true;
        QuranSearchActivity$$ExternalSyntheticLambda0 quranSearchActivity$$ExternalSyntheticLambda0 = new QuranSearchActivity$$ExternalSyntheticLambda0(this);
        this.thread = thread = new Thread(quranSearchActivity$$ExternalSyntheticLambda0);
        thread.start();
    }

    private void searchBySurah() {
        Thread thread;
        boolean bl;
        this.isFullSurah = bl = true;
        Runnable runnable = this.runnableBySurah;
        if (runnable == null) {
            this.runnableBySurah = runnable = new QuranSearchActivity$3(this);
        }
        if ((runnable = this.thread) != null) {
            runnable = null;
            this.isRun = false;
            runnable = this.thread;
            try {
                ((Thread)runnable).join();
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.isRun = bl;
        runnable = this.runnableBySurah;
        this.thread = thread = new Thread(runnable);
        thread.start();
    }

    private void stopCurrentSearchThread() {
        Thread thread = this.thread;
        if (thread != null) {
            thread = null;
            this.isRun = false;
            thread = this.thread;
            try {
                thread.join();
            }
            catch (InterruptedException interruptedException) {
                Thread thread2 = Thread.currentThread();
                thread2.interrupt();
                interruptedException.printStackTrace();
            }
        }
    }

    private void updateCount() {
        TextView textView = this.countAya;
        CharSequence charSequence = new StringBuilder("\u0627\u0644\u0622\u064a\u0640\u0640\u0640\u0627\u062a : (");
        int n = this.searchQuranAdapter.getSize();
        charSequence = charSequence.append(n).append(")").toString();
        textView.setText(charSequence);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void closeKeyboard() {
        Object object = "input_method";
        object = this.getSystemService((String)object);
        object = (InputMethodManager)object;
        EditText editText = this.editText;
        editText = editText.getWindowToken();
        try {
            object.hideSoftInputFromWindow((IBinder)editText, 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /* synthetic */ void lambda$onCreate$1$hazem-nurmontage-videoquran-QuranSearchActivity(View view) {
        this.closeKeyboard();
        this.setResult(0);
        this.finish();
    }

    /* synthetic */ boolean lambda$onCreate$2$hazem-nurmontage-videoquran-QuranSearchActivity(TextView textView, int n, KeyEvent keyEvent) {
        int n2 = 3;
        if (n == n2) {
            this.closeKeyboard();
            try {
                this.performSearch();
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            return true;
        }
        return false;
    }

    /* synthetic */ void lambda$onCreate$3$hazem-nurmontage-videoquran-QuranSearchActivity(View view) {
        this.closeKeyboard();
        try {
            this.performSearch();
        }
        catch (InterruptedException interruptedException) {
            Thread thread = Thread.currentThread();
            thread.interrupt();
            interruptedException.printStackTrace();
        }
    }

    /* synthetic */ void lambda$searchAllQuran$4$hazem-nurmontage-videoquran-QuranSearchActivity() {
        ProgressBar progressBar = this.searchProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* synthetic */ void lambda$searchAllQuran$5$hazem-nurmontage-videoquran-QuranSearchActivity(int n, String object, String string, int n2, int n3) {
        Object object2 = this.searchQuranAdapter;
        if (object2 != null) {
            int n4 = Utils.countIndex(Utils.countSpace(n, (String)object), string);
            n = Utils.countSpace(this.javaBM.getmPattern());
            int n5 = Utils.countIndex(n4, n, string);
            SearchQuranAdabters searchQuranAdabters = this.searchQuranAdapter;
            String string2 = this.surahNames[n2];
            int n6 = n3 + 1;
            object2 = object;
            object = new ItemQuranSearch(string, string2, n6, n2, n4, n5);
            searchQuranAdabters.add((ItemQuranSearch)object);
            this.updateCount();
        }
    }

    /* synthetic */ void lambda$searchAllQuran$6$hazem-nurmontage-videoquran-QuranSearchActivity() {
        int n;
        SearchQuranAdabters searchQuranAdabters = this.searchQuranAdapter;
        if (searchQuranAdabters != null && (n = searchQuranAdabters.getSize()) == 0) {
            this.updateCount();
        }
        if ((searchQuranAdabters = this.searchProgressBar) != null) {
            int n2 = 8;
            searchQuranAdabters.setVisibility(n2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    /* synthetic */ void lambda$searchAllQuran$7$hazem-nurmontage-videoquran-QuranSearchActivity() {
        Throwable throwable2222222;
        Object object;
        block7: {
            int n;
            Object object2 = this.handler;
            object = new QuranSearchActivity$$ExternalSyntheticLambda5(this);
            object2.post((Runnable)object);
            object2 = this.getAssets();
            object = "quran/quran-simple.txt";
            object2 = object2.open((String)object);
            InputStream inputStream = this.in_quran = object2;
            object = new InputStreamReader(inputStream);
            object2 = new BufferedReader((Reader)object);
            this.bufferedReader_quran = object2;
            while ((n = this.isRun) != 0) {
                String string;
                int n2;
                int n3;
                int n4;
                object2 = this.bufferedReader_quran;
                if ((object2 = ((BufferedReader)object2).readLine()) == null || (n4 = ((String)object2).isEmpty()) != 0) break;
                object = "\\|";
                n4 = ((Object)(object2 = ((String)object2).split((String)object))).length;
                if (n4 < (n3 = 3)) continue;
                n4 = 0;
                object = null;
                object = object2[0];
                n4 = Integer.parseInt((String)object);
                n3 = 1;
                int n5 = n4 + -1;
                object = object2[n3];
                int n6 = Integer.parseInt((String)object) + -1;
                n4 = 2;
                Object object3 = object2[n4];
                if (n5 > 0 && n6 == 0 && (n = ((String)object3).contains((CharSequence)(object2 = "\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650"))) != 0) {
                    n = 40;
                    object2 = ((String)object3).substring(n);
                } else {
                    object2 = object3;
                }
                if ((n2 = ((JavaBM)(object2 = this.javaBM)).match(string = RemoveTashkeel.removeTashkeel((String)object2))) == (n = -1)) continue;
                object2 = this.handler;
                Object object4 = object;
                object = new QuranSearchActivity$$ExternalSyntheticLambda6(this, n2, string, (String)object3, n5, n6);
                object2.post((Runnable)object);
            }
            this.closeQuranStreams();
            object2 = this.handler;
            object = new QuranSearchActivity$$ExternalSyntheticLambda7(this);
            {
                catch (Throwable throwable2222222) {
                    break block7;
                }
                catch (IOException iOException) {}
                {
                    object = System.err;
                    CharSequence charSequence = new StringBuilder();
                    String string = "Error reading Quran file: ";
                    charSequence = charSequence.append(string);
                    string = iOException.getMessage();
                    charSequence = charSequence.append(string);
                    charSequence = charSequence.toString();
                    ((PrintStream)object).println((String)charSequence);
                    iOException.printStackTrace();
                    this.closeQuranStreams();
                    object2 = this.handler;
                    object = new QuranSearchActivity$$ExternalSyntheticLambda7(this);
                }
            }
            object2.post((Runnable)object);
            return;
        }
        this.closeQuranStreams();
        object = this.handler;
        QuranSearchActivity$$ExternalSyntheticLambda7 quranSearchActivity$$ExternalSyntheticLambda7 = new QuranSearchActivity$$ExternalSyntheticLambda7(this);
        object.post((Runnable)quranSearchActivity$$ExternalSyntheticLambda7);
        throw throwable2222222;
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        int n = R$layout.activity_quran_search;
        this.setContentView(n);
        n = -15658732;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new QuranSearchActivity$$ExternalSyntheticLambda1();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        int bl = R$array.sura_names;
        object = object.getStringArray(bl);
        this.surahNames = object;
        n = R$id.btn_onBack;
        object = this.findViewById(n);
        object2 = new QuranSearchActivity$$ExternalSyntheticLambda2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_done;
        this.btnDone = object = (ButtonCustumFont)this.findViewById(n);
        object2 = new QuranSearchActivity$1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.progress;
        object = (ProgressBar)this.findViewById(n);
        this.searchProgressBar = object;
        n = R$id.tv_count_aya;
        object = (TextView)this.findViewById(n);
        this.countAya = object;
        n = R$id.tv_tittle;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.getResources();
        int n2 = R$string.search;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        n = R$id.rv_search_quran;
        this.recyclerView = object = (RecyclerView)this.findViewById(n);
        boolean bl2 = true;
        ((RecyclerView)object).setHasFixedSize(bl2);
        object = this.recyclerView;
        Context context = this.getApplicationContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        ((RecyclerView)object).setLayoutManager(linearLayoutManager);
        this.recyclerView.setItemViewCacheSize(20);
        this.recyclerView.setDrawingCacheEnabled(bl2);
        this.recyclerView.setItemAnimator(null);
        this.recyclerView.setDrawingCacheQuality(0x100000);
        object2 = this.iSearchQuranCallback;
        this.searchQuranAdapter = object = new SearchQuranAdabters((SearchQuranAdabters$ISearchQuranCallback)object2);
        this.recyclerView.setAdapter((RecyclerView$Adapter)object);
        n = R$id.edt_search_quran;
        object = (EditText)this.findViewById(n);
        this.editText = object;
        object2 = this.getResources();
        n2 = R$string.hint_search_quran;
        object2 = object2.getString(n2);
        object.setHint((CharSequence)object2);
        object = this.editText;
        object2 = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        object.setTypeface((Typeface)object2);
        object = this.editText;
        object2 = new QuranSearchActivity$$ExternalSyntheticLambda3(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        n = R$id.btn_search;
        object = this.findViewById(n);
        object2 = new QuranSearchActivity$$ExternalSyntheticLambda4(this);
        object.setOnClickListener((View.OnClickListener)object2);
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
        EditText editText = this.editText;
        int n = 1;
        object.showSoftInput((View)editText, n);
    }
}
