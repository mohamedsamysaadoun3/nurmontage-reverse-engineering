/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticBackport0;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import hazem.nurmontage.videoquran.Utils.QuranReader;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.databinding.FragmentAddQuranBinding;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$1;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$2;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$3;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$4;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$5;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$6;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$7;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import hazem.nurmontage.videoquran.model.RecitersModel;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AddQuranFragment
extends Fragment {
    public static AddQuranFragment instance;
    private ArrayAdapter adapterFromAyah;
    private ArrayAdapter adapterToAyah;
    private int[] arrayCount;
    private String[] arrayIdentifier;
    private String[] arrayReciters;
    private String[] arraySurah;
    private String[] arrayTranslation;
    private int current_pos;
    private FragmentAddQuranBinding fragmentBinding;
    private AddQuranFragment$IAddQuran iAddQuran;
    private String icon = "hafes";
    private IconQuranAdabters iconQuranAdabters;
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private CheckboxCustumFont includeBismilah;
    private boolean isFromSearch;
    private boolean isFromSelect;
    private boolean isFromSelectReciters;
    private boolean isInit;
    private ImageView iv_done_upload;
    private LinearLayout layoutConnection;
    private AdapterView.OnItemSelectedListener onFromAyaSelectedListener;
    private AdapterView.OnItemSelectedListener onSurahSelectedListener;
    private String path_video_copy;
    private QuranPreference quranPreference;
    private QuranReader quranReader;
    private String reader_name;
    private List recitersModels;
    private Resources resources;
    private Spinner spinnerFrom;
    private Spinner spinnerReciters;
    private Spinner spinnerSurah;
    private Spinner spinnerTo;
    private Spinner spinnerTranslation;
    private String surah_hint;
    private final String[] translation_name;
    private TextCustumFont tv_reader_name;
    private Uri uri_recitation;

    static /* bridge */ /* synthetic */ ArrayAdapter cfr_renamed_244(AddQuranFragment addQuranFragment) {
        return addQuranFragment.adapterFromAyah;
    }

    static /* bridge */ /* synthetic */ ArrayAdapter cfr_renamed_245(AddQuranFragment addQuranFragment) {
        return addQuranFragment.adapterToAyah;
    }

    static /* bridge */ /* synthetic */ int[] cfr_renamed_246(AddQuranFragment addQuranFragment) {
        return addQuranFragment.arrayCount;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_247(AddQuranFragment addQuranFragment) {
        return addQuranFragment.current_pos;
    }

    static /* bridge */ /* synthetic */ AddQuranFragment$IAddQuran cfr_renamed_185(AddQuranFragment addQuranFragment) {
        return addQuranFragment.iAddQuran;
    }

    static /* bridge */ /* synthetic */ CheckboxCustumFont cfr_renamed_199(AddQuranFragment addQuranFragment) {
        return addQuranFragment.includeBismilah;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_248(AddQuranFragment addQuranFragment) {
        return addQuranFragment.isFromSearch;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_249(AddQuranFragment addQuranFragment) {
        return addQuranFragment.isFromSelect;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_207(AddQuranFragment addQuranFragment) {
        return addQuranFragment.isFromSelectReciters;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_250(AddQuranFragment addQuranFragment) {
        return addQuranFragment.isInit;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_251(AddQuranFragment addQuranFragment) {
        return addQuranFragment.path_video_copy;
    }

    static /* bridge */ /* synthetic */ QuranPreference cfr_renamed_252(AddQuranFragment addQuranFragment) {
        return addQuranFragment.quranPreference;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_253(AddQuranFragment addQuranFragment) {
        return addQuranFragment.reader_name;
    }

    static /* bridge */ /* synthetic */ Spinner cfr_renamed_254(AddQuranFragment addQuranFragment) {
        return addQuranFragment.spinnerFrom;
    }

    static /* bridge */ /* synthetic */ Spinner cfr_renamed_255(AddQuranFragment addQuranFragment) {
        return addQuranFragment.spinnerReciters;
    }

    static /* bridge */ /* synthetic */ Spinner cfr_renamed_256(AddQuranFragment addQuranFragment) {
        return addQuranFragment.spinnerSurah;
    }

    static /* bridge */ /* synthetic */ Spinner cfr_renamed_257(AddQuranFragment addQuranFragment) {
        return addQuranFragment.spinnerTo;
    }

    static /* bridge */ /* synthetic */ Spinner cfr_renamed_258(AddQuranFragment addQuranFragment) {
        return addQuranFragment.spinnerTranslation;
    }

    static /* bridge */ /* synthetic */ Uri cfr_renamed_259(AddQuranFragment addQuranFragment) {
        return addQuranFragment.uri_recitation;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_260(AddQuranFragment addQuranFragment, int n) {
        addQuranFragment.current_pos = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_186(AddQuranFragment addQuranFragment, AddQuranFragment$IAddQuran addQuranFragment$IAddQuran) {
        addQuranFragment.iAddQuran = addQuranFragment$IAddQuran;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_163(AddQuranFragment addQuranFragment, String string2) {
        addQuranFragment.icon = string2;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_261(AddQuranFragment addQuranFragment, boolean bl) {
        addQuranFragment.isFromSearch = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_262(AddQuranFragment addQuranFragment, boolean bl) {
        addQuranFragment.isFromSelect = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_209(AddQuranFragment addQuranFragment, boolean bl) {
        addQuranFragment.isFromSelectReciters = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_263(AddQuranFragment addQuranFragment, boolean bl) {
        addQuranFragment.isInit = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_208(AddQuranFragment addQuranFragment) {
        addQuranFragment.goneReaderNameUpload();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_264(AddQuranFragment addQuranFragment) {
        addQuranFragment.savePreference();
    }

    public AddQuranFragment() {
        Object object;
        this.recitersModels = object = new ArrayList();
        this.current_pos = -1;
        object = new String[8];
        object[0] = "en.hilali.txt";
        int n = 1;
        object[n] = "fr.hamidullah.txt";
        object[2] = "ur.maududi.txt";
        object[3] = "tr.ozturk.txt";
        object[4] = "de.bubenheim.txt";
        object[5] = "id.indonesian.txt";
        object[6] = "fa.fooladvand.txt";
        object[7] = "bn.bengali.txt";
        this.translation_name = object;
        this.isInit = n;
        this.isFromSelect = n;
        super(this);
        this.iconQuranCallback = object;
        super(this);
        this.onFromAyaSelectedListener = object;
        super(this);
        this.onSurahSelectedListener = object;
    }

    public AddQuranFragment(AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, Resources resources) {
        Object object;
        this.recitersModels = object = new ArrayList();
        this.current_pos = -1;
        object = new String[8];
        object[0] = "en.hilali.txt";
        int n = 1;
        object[n] = "fr.hamidullah.txt";
        object[2] = "ur.maududi.txt";
        object[3] = "tr.ozturk.txt";
        object[4] = "de.bubenheim.txt";
        object[5] = "id.indonesian.txt";
        object[6] = "fa.fooladvand.txt";
        object[7] = "bn.bengali.txt";
        this.translation_name = object;
        this.isInit = n;
        this.isFromSelect = n;
        super(this);
        this.iconQuranCallback = object;
        super(this);
        this.onFromAyaSelectedListener = object;
        super(this);
        this.onSurahSelectedListener = object;
        this.iAddQuran = addQuranFragment$IAddQuran;
        this.resources = resources;
    }

    public AddQuranFragment(AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, Resources resources, Uri uri, String string2, String string3) {
        Object object;
        this.recitersModels = object = new ArrayList();
        this.current_pos = -1;
        object = new String[8];
        object[0] = "en.hilali.txt";
        int n = 1;
        object[n] = "fr.hamidullah.txt";
        object[2] = "ur.maududi.txt";
        object[3] = "tr.ozturk.txt";
        object[4] = "de.bubenheim.txt";
        object[5] = "id.indonesian.txt";
        object[6] = "fa.fooladvand.txt";
        object[7] = "bn.bengali.txt";
        this.translation_name = object;
        this.isInit = n;
        this.isFromSelect = n;
        super(this);
        this.iconQuranCallback = object;
        super(this);
        this.onFromAyaSelectedListener = object;
        super(this);
        this.onSurahSelectedListener = object;
        this.iAddQuran = addQuranFragment$IAddQuran;
        this.resources = resources;
        this.uri_recitation = uri;
        this.path_video_copy = string2;
        this.reader_name = string3;
    }

    public static AddQuranFragment getInstance(AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, Resources resources) {
        AddQuranFragment addQuranFragment = instance;
        if (addQuranFragment == null) {
            instance = addQuranFragment = new AddQuranFragment(addQuranFragment$IAddQuran, resources);
        }
        return instance;
    }

    public static AddQuranFragment getInstance(AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, Resources resources, Uri uri, String string2, String string3) {
        AddQuranFragment addQuranFragment = instance;
        if (addQuranFragment == null) {
            instance = addQuranFragment = new AddQuranFragment(addQuranFragment$IAddQuran, resources, uri, string2, string3);
        }
        return instance;
    }

    private void goneReaderNameUpload() {
        this.uri_recitation = null;
        this.iv_done_upload.setVisibility(8);
        this.tv_reader_name.setText("-");
        this.tv_reader_name.getPaint().setUnderlineText(false);
        this.tv_reader_name.setOnClickListener(null);
    }

    private void initIconRv(View view) {
        int n = R$id.rv;
        view = (RecyclerView)view.findViewById(n);
        Object object = this.getContext();
        Object object2 = new LinearLayoutManager((Context)object, 0, false);
        view.setLayoutManager((RecyclerView.LayoutManager)object2);
        view.setItemAnimator(null);
        view.setHasFixedSize(true);
        object2 = new ArrayList();
        object2.add("hafes");
        object2.add("shamerli");
        object2.add("nour_hode");
        object2.add("amiri");
        IconQuranAdabters$IIconQuranCallback iconQuranAdabters$IIconQuranCallback = this.iconQuranCallback;
        int n2 = MyPrefereces.getLastIconIndex(this.getContext());
        object = new IconQuranAdabters(iconQuranAdabters$IIconQuranCallback, (List)object2, n2);
        this.iconQuranAdabters = object;
        int n3 = ((IconQuranAdabters)((Object)object)).getSelect();
        object2 = (String)object2.get(n3);
        this.icon = object2;
        object2 = this.iconQuranAdabters;
        view.setAdapter((RecyclerView.Adapter)object2);
    }

    private void savePreference() {
        int n;
        Object object;
        QuranPreference quranPreference = this.quranPreference;
        if (quranPreference != null) {
            object = this.spinnerSurah;
            n = object.getSelectedItemPosition();
            Spinner spinner = this.spinnerFrom;
            int n2 = spinner.getSelectedItemPosition();
            Spinner spinner2 = this.spinnerTo;
            int n3 = spinner2.getSelectedItemPosition();
            Spinner spinner3 = this.spinnerReciters;
            int n4 = spinner3.getSelectedItemPosition();
            Spinner spinner4 = this.spinnerTranslation;
            int n5 = spinner4.getSelectedItemPosition();
            quranPreference.savePreferences(n, n2, n3, n4, n5);
        }
        quranPreference = this.getContext();
        object = this.iconQuranAdabters;
        n = object.getSelect();
        try {
            MyPrefereces.putIndexLastIcon((Context)quranPreference, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        quranPreference = this.getContext();
        object = this.includeBismilah;
        n = object.isChecked() ? 1 : 0;
        try {
            MyPrefereces.putIncludeBismilah((Context)quranPreference, n != 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void setSystemBarsColorBlack() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void addAyaEntityRecursive(int var1_1, int var2_2, int var3_3) {
        block65: {
            block66: {
                block64: {
                    block63: {
                        block62: {
                            var4_4 /* !! */  = this.quranReader;
                            var4_4 /* !! */  = var4_4 /* !! */ .getAyahText(var3_3, var1_1);
                            var5_5 = this.spinnerTranslation;
                            var6_6 = var5_5.getSelectedItemPosition();
                            var7_7 = 0;
                            var8_8 /* !! */  = null;
                            var9_9 = 1;
                            if (var6_6 <= 0) break block62;
                            var5_5 = this.quranReader;
                            var10_10 = this.translation_name;
                            var11_11 /* !! */  = this.spinnerTranslation;
                            var12_12 = var11_11 /* !! */ .getSelectedItemPosition() - var9_9;
                            var10_10 = var10_10[var12_12];
                            var5_5 = var5_5.getTranslationAyahText((String)var10_10, var3_3, var1_1);
                            break block63;
                        }
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    this.splitAya((String)var4_4 /* !! */ , null, var1_1);
                    if (var5_5 == null) ** GOTO lbl47
                    var4_4 /* !! */  = this.iAddQuran;
                    var8_8 /* !! */  = this.spinnerTranslation;
                    var7_7 = var8_8 /* !! */ .getSelectedItemPosition();
                    if (var7_7 == var9_9) {
                        var7_7 = var9_9;
                        break block64;
                    }
                    var7_7 = 0;
                    var8_8 /* !! */  = null;
                }
                var4_4 /* !! */ .onAddTranslation((String)var5_5, var1_1, (boolean)var7_7);
lbl47:
                // 2 sources

                if ((var4_4 /* !! */  = this.iAddQuran) == null) break block65;
                var4_4 /* !! */  = this.spinnerReciters;
                var13_13 = var4_4 /* !! */ .isEnabled();
                if (var13_13 == 0) break block66;
                var4_4 /* !! */  = this.recitersModels;
                var8_8 /* !! */  = this.arrayIdentifier;
                var10_10 = this.spinnerReciters;
                var14_14 = var10_10.getSelectedItemPosition();
                var8_8 /* !! */  = var8_8 /* !! */ [var14_14];
                var5_5 = new RecitersModel((String)var8_8 /* !! */ , var3_3, var1_1);
                var4_4 /* !! */ .add(var5_5);
            }
            if (var1_1 < var2_2) break block65;
            var15_15 = this.uri_recitation;
            if (var15_15 == null) ** GOTO lbl106
            var10_10 = this.iAddQuran;
            var15_15 = new StringBuilder();
            var16_17 /* !! */  = this.surah_hint;
            var15_15 = var15_15.append((String)var16_17 /* !! */ );
            var16_17 /* !! */  = this.arraySurah;
            var17_19 = this.spinnerSurah;
            var3_3 = var17_19.getSelectedItemPosition();
            var16_17 /* !! */  = var16_17 /* !! */ [var3_3];
            var15_15 = var15_15.append((String)var16_17 /* !! */ );
            var11_11 /* !! */  = var15_15.toString();
            var15_15 = this.spinnerSurah;
            var1_1 = var15_15.getSelectedItemPosition();
            var18_21 = var1_1 + 1;
            var19_22 = this.reader_name;
            var20_23 = this.uri_recitation;
            var21_24 = this.path_video_copy;
            var10_10.onDone((String)var11_11 /* !! */ , var18_21, var19_22, var20_23, var21_24);
            ** GOTO lbl140
lbl106:
            // 1 sources

            var15_15 = this.iAddQuran;
            var16_18 /* !! */  = new StringBuilder();
            var17_20 = this.surah_hint;
            var16_18 /* !! */  = var16_18 /* !! */ .append((String)var17_20);
            var17_20 = this.arraySurah;
            var4_4 /* !! */  = this.spinnerSurah;
            var13_13 = var4_4 /* !! */ .getSelectedItemPosition();
            var17_20 = var17_20[var13_13];
            var16_18 /* !! */  = var16_18 /* !! */ .append((String)var17_20);
            var16_18 /* !! */  = var16_18 /* !! */ .toString();
            var17_20 = this.spinnerSurah;
            var3_3 = var17_20.getSelectedItemPosition() + var9_9;
            var4_4 /* !! */  = this.arrayReciters;
            var5_5 = this.spinnerReciters;
            var6_6 = var5_5.getSelectedItemPosition();
            var4_4 /* !! */  = var4_4 /* !! */ [var6_6];
            var5_5 = this.recitersModels;
            var15_15.onDone((String)var16_18 /* !! */ , var3_3, (String)var4_4 /* !! */ , (List)var5_5);
lbl140:
            // 2 sources

            return;
        }
        var1_1 += var9_9;
        try {
            this.addAyaEntityRecursive(var1_1, var2_2, var3_3);
        }
        catch (Exception var15_16) {
            var15_16.printStackTrace();
        }
    }

    public void addAyaIndex() {
        Object object5;
        this.isFromSearch = object5;
        Object object2 = this.quranPreference;
        Object object3 = ((QuranPreference)object2).getSurah();
        this.current_pos = object3;
        Object object4 = this.spinnerSurah;
        object4.setSelection(object3, false);
        object2 = this.arrayCount;
        object4 = this.quranPreference;
        int n = ((QuranPreference)object4).getSurah();
        object3 = object2[n];
        object4 = new ArrayList();
        for (Object object5 = 1; object5 <= object3; ++object5) {
            String string2 = String.valueOf(object5);
            ((ArrayList)object4).add(string2);
            continue;
        }
        ArrayAdapter arrayAdapter = this.adapterFromAyah;
        arrayAdapter.clear();
        arrayAdapter = this.adapterFromAyah;
        arrayAdapter.addAll((Collection)object4);
        arrayAdapter = this.adapterToAyah;
        arrayAdapter.clear();
        arrayAdapter = this.adapterToAyah;
        arrayAdapter.addAll((Collection)object4);
        arrayAdapter = this.spinnerFrom;
        object2 = this.quranPreference;
        object3 = ((QuranPreference)object2).getFrom();
        arrayAdapter.setSelection(object3, false);
        arrayAdapter = this.spinnerReciters;
        object2 = this.quranPreference;
        object3 = ((QuranPreference)object2).getNameReader();
        try {
            arrayAdapter.setSelection(object3, false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String getWords(String[] charSequenceArray, int n, int n2) {
        int n3;
        String string2 = "";
        if (charSequenceArray != null && (n3 = charSequenceArray.length) != 0) {
            if (n < 0) {
                n = 0;
            }
            if (n2 > (n3 = charSequenceArray.length)) {
                n2 = charSequenceArray.length;
            }
            if (n >= n2) {
                return string2;
            }
            charSequenceArray = Arrays.copyOfRange(charSequenceArray, n, n2);
            return ProVersionActivity$$ExternalSyntheticBackport0.m((CharSequence)" ", charSequenceArray);
        }
        return string2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        boolean bl = false;
        object3 = null;
        this.fragmentBinding = object = FragmentAddQuranBinding.inflate((LayoutInflater)object, (ViewGroup)object2, false);
        object = ((FragmentAddQuranBinding)object).getRoot();
        object2 = this.resources;
        if (object2 != null && (object2 = this.iAddQuran) != null) {
            Object object4 = this.getContext();
            object2 = new QuranPreference((Context)object4);
            this.quranPreference = object2;
            object4 = this.getContext();
            object2 = new QuranReader((Context)object4);
            this.quranReader = object2;
            object2 = LocaleHelper.getLanguage(this.getContext());
            int n = object2.equals(object4 = "ar");
            object2 = n != 0 ? "\u0633\u0648\u0631\u0629 " : "Surah ";
            this.surah_hint = object2;
            n = R$id.iv_done;
            object2 = (ImageView)object.findViewById(n);
            this.iv_done_upload = object2;
            object4 = this.uri_recitation;
            if (object4 != null) {
                object2.setVisibility(0);
            }
            n = R$id.tv_surah;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            int n2 = R$string.tv_surah;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_icon;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.quran_icon;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_add_bismilah;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.add_bismilah;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_end_ayah;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.to;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_hint_reader;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.tv_hint_reader;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_translation;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.translation;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            object2 = this.getResources();
            int n3 = R$array.surah_names_merged;
            object2 = object2.getStringArray(n3);
            this.arraySurah = object2;
            object2 = this.getResources();
            int n4 = R$array.surah_count;
            object2 = object2.getIntArray(n4);
            this.arrayCount = (int[])object2;
            object2 = this.getResources();
            int n5 = R$array.identifier;
            object2 = object2.getStringArray(n5);
            this.arrayIdentifier = object2;
            object2 = this.resources;
            int n6 = R$array.reciters;
            object2 = object2.getStringArray(n6);
            this.arrayReciters = object2;
            object2 = this.resources;
            int n7 = R$array.translation_name;
            object2 = object2.getStringArray(n7);
            this.arrayTranslation = object2;
            n = R$id.checkbox;
            object2 = (CheckboxCustumFont)object.findViewById(n);
            this.includeBismilah = object2;
            boolean bl2 = MyPrefereces.isIncludeBismilah(this.getContext());
            object2.setChecked(bl2);
            n = R$id.add_bismilah;
            object2 = object.findViewById(n);
            object3 = new AddQuranFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.sura_name;
            object2 = (Spinner)object.findViewById(n);
            this.spinnerSurah = object2;
            object3 = this.getContext();
            n2 = R$layout.row_spinner_aya;
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.arraySurah;
            object2 = new ArrayAdapter((Context)object3, n2, (Object[])onItemSelectedListener);
            int n8 = 0x1090009;
            object2.setDropDownViewResource(n8);
            object4 = this.spinnerSurah;
            onItemSelectedListener = this.onSurahSelectedListener;
            object4.setOnItemSelectedListener(onItemSelectedListener);
            this.spinnerSurah.setAdapter((SpinnerAdapter)object2);
            object2 = this.spinnerSurah;
            n2 = object2.getHeight() * -10;
            object2.setDropDownVerticalOffset(n2);
            n = R$id.aya_from;
            object2 = (Spinner)object.findViewById(n);
            this.spinnerFrom = object2;
            object4 = this.getContext();
            int n9 = R$layout.row_spinner_aya;
            object2 = new ArrayAdapter(object4, n9);
            this.adapterFromAyah = object2;
            object2.setDropDownViewResource(n8);
            object2 = this.spinnerFrom;
            object4 = this.onFromAyaSelectedListener;
            object2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object4);
            object2 = this.spinnerFrom;
            object4 = this.adapterFromAyah;
            object2.setAdapter((SpinnerAdapter)object4);
            n = R$id.aya_to;
            object2 = (Spinner)object.findViewById(n);
            this.spinnerTo = object2;
            object4 = this.getContext();
            n9 = R$layout.row_spinner_aya;
            object2 = new ArrayAdapter(object4, n9);
            this.adapterToAyah = object2;
            object2.setDropDownViewResource(n8);
            object2 = this.spinnerTo;
            object4 = this.adapterToAyah;
            object2.setAdapter((SpinnerAdapter)object4);
            n = R$id.spinner_reciters;
            object2 = (Spinner)object.findViewById(n);
            this.spinnerReciters = object2;
            object4 = this.getContext();
            n9 = R$layout.row_spinner_aya;
            Object[] objectArray = this.arrayReciters;
            object2 = new ArrayAdapter(object4, n9, objectArray);
            object2.setDropDownViewResource(n8);
            object4 = this.spinnerReciters;
            onItemSelectedListener = new AddQuranFragment$2(this);
            object4.setOnItemSelectedListener(onItemSelectedListener);
            this.spinnerReciters.setAdapter((SpinnerAdapter)object2);
            n = R$id.spinner_translation;
            object2 = (Spinner)object.findViewById(n);
            this.spinnerTranslation = object2;
            object4 = this.getContext();
            n9 = R$layout.row_spinner_aya;
            objectArray = this.arrayTranslation;
            object2 = new ArrayAdapter(object4, n9, objectArray);
            object2.setDropDownViewResource(n8);
            this.spinnerTranslation.setAdapter((SpinnerAdapter)object2);
            n = R$id.hint_no_internet;
            object2 = (LinearLayout)object.findViewById(n);
            this.layoutConnection = object2;
            n = R$id.btn_done;
            object2 = object.findViewById(n);
            object3 = new AddQuranFragment$3(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_cancel;
            object2 = object.findViewById(n);
            object3 = new AddQuranFragment$4(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_search;
            object2 = object.findViewById(n);
            object3 = new AddQuranFragment$5(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_upload;
            object2 = object.findViewById(n);
            object3 = new AddQuranFragment$6(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.tv_reader;
            object2 = (TextCustumFont)object.findViewById(n);
            this.tv_reader_name = object2;
            object3 = new AddQuranFragment$7(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            object2 = this.reader_name;
            if (object2 != null && (n = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = this.tv_reader_name.getPaint();
                boolean bl3 = true;
                object2.setUnderlineText(bl3);
                object2 = this.tv_reader_name;
                object3 = this.reader_name;
                object2.setText((CharSequence)object3);
            } else {
                this.reader_name = "-";
                object2 = this.tv_reader_name;
                int n10 = -1;
                object2.setTextColor(n10);
            }
            this.initIconRv((View)object);
        }
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.savePreference();
        QuranPreference.saveLastSearch(this.requireContext(), null);
        AddQuranFragment$IAddQuran addQuranFragment$IAddQuran = this.iAddQuran;
        if (addQuranFragment$IAddQuran != null) {
            addQuranFragment$IAddQuran.onCancel();
        }
        this.onFromAyaSelectedListener = null;
        this.onSurahSelectedListener = null;
        this.fragmentBinding = null;
        instance = null;
        this.iconQuranCallback = null;
    }

    /*
     * Unable to fully structure code
     */
    public void onResume() {
        block10: {
            super.onResume();
            var1_1 = this.getContext();
            var2_3 = NetworkUtils.isNetworkAvailable(var1_1);
            var3_4 = 0;
            if (!var2_3) ** GOTO lbl21
            var1_1 = this.spinnerReciters;
            var1_1.setVisibility(0);
            var1_1 = this.spinnerReciters;
            var3_4 = 1;
            var1_1.setEnabled((boolean)var3_4);
            var1_1 = this.layoutConnection;
            var3_4 = 8;
            var1_1.setVisibility(var3_4);
            break block10;
lbl21:
            // 1 sources

            var1_1 = this.spinnerReciters;
            var1_1.setEnabled(false);
            var1_1 = this.spinnerReciters;
            var4_5 = 4;
            var1_1.setVisibility(var4_5);
            var1_1 = this.layoutConnection;
            try {
                var1_1.setVisibility(0);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.setSystemBarsColorBlack();
    }

    public void setNameReader(String string2, Uri uri, String string3) {
        boolean bl;
        this.uri_recitation = uri;
        this.path_video_copy = string3;
        boolean bl2 = false;
        string3 = null;
        if (uri != null) {
            uri = this.iv_done_upload;
            uri.setVisibility(0);
        }
        if (string2 != null && !(bl = string2.isEmpty())) {
            uri = this.tv_reader_name.getPaint();
            bl2 = true;
            uri.setUnderlineText(bl2);
        } else {
            this.tv_reader_name.getPaint().setUnderlineText(false);
            string2 = "-";
        }
        this.reader_name = string2;
        this.tv_reader_name.setText(string2);
    }

    public void splitAya(String string2, String string3, int n) {
        int n2;
        int n3;
        int n4;
        String string4;
        CharSequence charSequence;
        int n5;
        String[] stringArray;
        AddQuranFragment addQuranFragment = this;
        String string5 = string3;
        String string6 = string2.trim();
        Object object = string6.replaceAll("\\s*([\\u06D6-\\u06ED])", "$1").trim();
        Object object2 = "\\s+";
        String[] stringArray2 = ((String)object).split((String)object2);
        object = ",";
        if (string3 != null) {
            object2 = string3.split((String)object);
            stringArray = object2;
        } else {
            stringArray = null;
        }
        int n6 = stringArray2.length;
        int n7 = 4;
        String string7 = " ";
        String string8 = " \u0646\u0635";
        if (n6 <= n7) {
            String string9;
            if (string5 != null) {
                object = string5.replace((CharSequence)object, string7);
                string9 = object;
            } else {
                boolean bl = false;
                string9 = null;
            }
            object = addQuranFragment.iAddQuran;
            object2 = new StringBuilder();
            String string10 = string2;
            object2 = ((StringBuilder)object2).append(string2).append(string8).toString();
            int n8 = string2.length();
            String string11 = addQuranFragment.icon;
            int n9 = stringArray2.length;
            string10 = string6;
            String string12 = string3;
            int n10 = n;
            object.onAdd((String)object2, string6, string9, string3, n8, n, string11, 0, n9);
            return;
        }
        CharSequence charSequence2 = new StringBuilder();
        int n11 = stringArray2.length;
        int n12 = 1;
        float f = Float.MIN_VALUE;
        int n13 = n11 + -1;
        n11 = 0;
        object = null;
        n6 = 0;
        object2 = null;
        n7 = 0;
        CharSequence charSequence3 = null;
        int n14 = 0;
        Object object3 = null;
        while (n7 < (n5 = stringArray2.length)) {
            float f2;
            int n15;
            int n16;
            int n17;
            String string13;
            charSequence = stringArray2[n7];
            StringBuilder stringBuilder = ((StringBuilder)charSequence2).append((String)charSequence);
            stringBuilder.append(string7);
            n5 = ((String)charSequence).length();
            if (n5 > n12) {
                ++n11;
            }
            int n18 = n6 + 1;
            n6 = 5;
            if (n11 == n6) {
                CharSequence charSequence4;
                int n19;
                n6 = n14 + n11;
                n11 = n18 - n11;
                n5 = n6 - n11;
                if (n7 == n13) {
                    String string14;
                    object = ((StringBuilder)charSequence2).toString().trim();
                    object2 = addQuranFragment.iAddQuran;
                    CharSequence charSequence5 = new StringBuilder();
                    charSequence5 = charSequence5.append((String)object).append(string8).toString();
                    if (stringArray != null) {
                        string14 = addQuranFragment.getWords(stringArray, n14, n5);
                    } else {
                        n19 = 0;
                        string14 = null;
                    }
                    int n20 = ((String)object).length();
                    string13 = addQuranFragment.icon;
                    object = object2;
                    object2 = charSequence5;
                    n17 = n7;
                    charSequence3 = string6;
                    n12 = n14;
                    object3 = string14;
                    n19 = n5;
                    string5 = null;
                    charSequence = string3;
                    n16 = n13;
                    n13 = n20;
                    n15 = 1;
                    f2 = Float.MIN_VALUE;
                    n12 = n;
                    charSequence4 = charSequence2;
                    charSequence2 = string13;
                    string4 = string8;
                    n4 = n14;
                    string13 = string7;
                    n3 = n5;
                    object.onAdd((String)charSequence5, string6, string14, string3, n20, n, (String)charSequence2, n14, n5);
                    n2 = n14;
                } else {
                    n17 = n7;
                    n19 = n5;
                    n16 = n13;
                    n15 = n12;
                    f2 = f;
                    charSequence4 = charSequence2;
                    string4 = string8;
                    string13 = string7;
                    string5 = null;
                    object = addQuranFragment.iAddQuran;
                    object2 = ((StringBuilder)charSequence2).toString().trim();
                    if (stringArray != null) {
                        n3 = n14;
                        n7 = n5;
                        charSequence3 = addQuranFragment.getWords(stringArray, n14, n5);
                        object3 = charSequence3;
                    } else {
                        n3 = n14;
                        n14 = 0;
                        object3 = null;
                    }
                    charSequence2 = addQuranFragment.icon;
                    n19 = n3 + n18;
                    n13 = -1;
                    n12 = -1;
                    f = 0.0f / 0.0f;
                    charSequence3 = string6;
                    charSequence = string3;
                    n4 = n3;
                    n2 = n3;
                    n3 = n19;
                    object.onAdd((String)object2, string6, (String)object3, string3, n13, n12, (String)charSequence2, n4, n19);
                }
                n14 = n2 + n18;
                charSequence3 = charSequence4;
                ((StringBuilder)charSequence4).setLength(0);
                n11 = 0;
                object = null;
                n6 = 0;
                object2 = null;
            } else {
                n17 = n7;
                n2 = n14;
                n16 = n13;
                n15 = n12;
                f2 = f;
                charSequence3 = charSequence2;
                string4 = string8;
                string13 = string7;
                string5 = null;
                n6 = n18;
            }
            n5 = n17 + 1;
            string5 = string3;
            charSequence2 = charSequence3;
            n7 = n5;
            n12 = n15;
            f = f2;
            string7 = string13;
            n13 = n16;
            string8 = string4;
        }
        n2 = n14;
        charSequence3 = charSequence2;
        string4 = string8;
        n14 = ((StringBuilder)charSequence2).length();
        if (n14 > 0) {
            Object object4;
            charSequence3 = ((StringBuilder)charSequence2).toString().trim();
            object3 = addQuranFragment.iAddQuran;
            charSequence = new StringBuilder();
            charSequence = ((StringBuilder)charSequence).append((String)charSequence3).append(string8).toString();
            if (stringArray != null) {
                n13 = stringArray.length - n11;
                n11 = n6 - n11;
                n13 -= n11;
                n11 = stringArray.length;
                object4 = object = addQuranFragment.getWords(stringArray, n13, n11);
            } else {
                object4 = null;
            }
            n13 = ((String)charSequence3).length();
            charSequence2 = addQuranFragment.icon;
            n3 = n2 + n6;
            object = object3;
            object2 = charSequence;
            charSequence3 = string6;
            object3 = object4;
            charSequence = string3;
            n12 = n;
            n4 = n2;
            object.onAdd((String)object2, string6, (String)object4, string3, n13, n, (String)charSequence2, n2, n3);
        }
    }
}

