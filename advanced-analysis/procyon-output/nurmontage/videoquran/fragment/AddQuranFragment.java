// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticBackport0;
import java.util.Arrays;
import java.util.Collection;
import hazem.nurmontage.videoquran.model.RecitersModel;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.R$id;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import android.net.Uri;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.Spinner;
import android.content.res.Resources;
import java.util.List;
import hazem.nurmontage.videoquran.Utils.QuranReader;
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.CheckboxCustumFont;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;
import hazem.nurmontage.videoquran.databinding.FragmentAddQuranBinding;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;

public class AddQuranFragment extends Fragment
{
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
    private String icon;
    private IconQuranAdabters iconQuranAdabters;
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private CheckboxCustumFont includeBismilah;
    private boolean isFromSearch;
    private boolean isFromSelect;
    private boolean isFromSelectReciters;
    private boolean isInit;
    private ImageView iv_done_upload;
    private LinearLayout layoutConnection;
    private AdapterView$OnItemSelectedListener onFromAyaSelectedListener;
    private AdapterView$OnItemSelectedListener onSurahSelectedListener;
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
    
    public AddQuranFragment() {
        this.icon = "hafes";
        this.recitersModels = new ArrayList();
        this.current_pos = -1;
        final String[] translation_name = new String[8];
        translation_name[0] = "en.hilali.txt";
        final int n = 1;
        translation_name[n] = "fr.hamidullah.txt";
        translation_name[2] = "ur.maududi.txt";
        translation_name[3] = "tr.ozturk.txt";
        translation_name[4] = "de.bubenheim.txt";
        translation_name[5] = "id.indonesian.txt";
        translation_name[6] = "fa.fooladvand.txt";
        translation_name[7] = "bn.bengali.txt";
        this.translation_name = translation_name;
        this.isInit = (n != 0);
        this.isFromSelect = (n != 0);
        this.iconQuranCallback = new AddQuranFragment$8(this);
        this.onFromAyaSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$9(this);
        this.onSurahSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$10(this);
    }
    
    public AddQuranFragment(final AddQuranFragment$IAddQuran iAddQuran, final Resources resources) {
        this.icon = "hafes";
        this.recitersModels = new ArrayList();
        this.current_pos = -1;
        final String[] translation_name = new String[8];
        translation_name[0] = "en.hilali.txt";
        final int n = 1;
        translation_name[n] = "fr.hamidullah.txt";
        translation_name[2] = "ur.maududi.txt";
        translation_name[3] = "tr.ozturk.txt";
        translation_name[4] = "de.bubenheim.txt";
        translation_name[5] = "id.indonesian.txt";
        translation_name[6] = "fa.fooladvand.txt";
        translation_name[7] = "bn.bengali.txt";
        this.translation_name = translation_name;
        this.isInit = (n != 0);
        this.isFromSelect = (n != 0);
        this.iconQuranCallback = new AddQuranFragment$8(this);
        this.onFromAyaSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$9(this);
        this.onSurahSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$10(this);
        this.iAddQuran = iAddQuran;
        this.resources = resources;
    }
    
    public AddQuranFragment(final AddQuranFragment$IAddQuran iAddQuran, final Resources resources, final Uri uri_recitation, final String path_video_copy, final String reader_name) {
        this.icon = "hafes";
        this.recitersModels = new ArrayList();
        this.current_pos = -1;
        final String[] translation_name = new String[8];
        translation_name[0] = "en.hilali.txt";
        final int n = 1;
        translation_name[n] = "fr.hamidullah.txt";
        translation_name[2] = "ur.maududi.txt";
        translation_name[3] = "tr.ozturk.txt";
        translation_name[4] = "de.bubenheim.txt";
        translation_name[5] = "id.indonesian.txt";
        translation_name[6] = "fa.fooladvand.txt";
        translation_name[7] = "bn.bengali.txt";
        this.translation_name = translation_name;
        this.isInit = (n != 0);
        this.isFromSelect = (n != 0);
        this.iconQuranCallback = new AddQuranFragment$8(this);
        this.onFromAyaSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$9(this);
        this.onSurahSelectedListener = (AdapterView$OnItemSelectedListener)new AddQuranFragment$10(this);
        this.iAddQuran = iAddQuran;
        this.resources = resources;
        this.uri_recitation = uri_recitation;
        this.path_video_copy = path_video_copy;
        this.reader_name = reader_name;
    }
    
    public static AddQuranFragment getInstance(final AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, final Resources resources) {
        if (AddQuranFragment.instance == null) {
            AddQuranFragment.instance = new AddQuranFragment(addQuranFragment$IAddQuran, resources);
        }
        return AddQuranFragment.instance;
    }
    
    public static AddQuranFragment getInstance(final AddQuranFragment$IAddQuran addQuranFragment$IAddQuran, final Resources resources, final Uri uri, final String s, final String s2) {
        if (AddQuranFragment.instance == null) {
            AddQuranFragment.instance = new AddQuranFragment(addQuranFragment$IAddQuran, resources, uri, s, s2);
        }
        return AddQuranFragment.instance;
    }
    
    private void goneReaderNameUpload() {
        this.uri_recitation = null;
        this.iv_done_upload.setVisibility(8);
        this.tv_reader_name.setText((CharSequence)"-");
        this.tv_reader_name.getPaint().setUnderlineText(false);
        this.tv_reader_name.setOnClickListener((View$OnClickListener)null);
    }
    
    private void initIconRv(final View view) {
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(R$id.rv);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        recyclerView.setHasFixedSize(true);
        final ArrayList list = new ArrayList();
        list.add("hafes");
        list.add("shamerli");
        list.add("nour_hode");
        list.add("amiri");
        final IconQuranAdabters iconQuranAdabters = new IconQuranAdabters(this.iconQuranCallback, list, MyPrefereces.getLastIconIndex(this.getContext()));
        this.iconQuranAdabters = iconQuranAdabters;
        this.icon = (String)list.get(iconQuranAdabters.getSelect());
        recyclerView.setAdapter((RecyclerView$Adapter)this.iconQuranAdabters);
    }
    
    private void savePreference() {
        final QuranPreference quranPreference = this.quranPreference;
        if (quranPreference != null) {
            quranPreference.savePreferences(this.spinnerSurah.getSelectedItemPosition(), this.spinnerFrom.getSelectedItemPosition(), this.spinnerTo.getSelectedItemPosition(), this.spinnerReciters.getSelectedItemPosition(), this.spinnerTranslation.getSelectedItemPosition());
        }
        try {
            final Context context = this.getContext();
            try {
                final IconQuranAdabters iconQuranAdabters = this.iconQuranAdabters;
                try {
                    MyPrefereces.putIndexLastIcon(context, iconQuranAdabters.getSelect());
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
        try {
            final Context context2 = this.getContext();
            try {
                final CheckboxCustumFont includeBismilah = this.includeBismilah;
                try {
                    MyPrefereces.putIncludeBismilah(context2, includeBismilah.isChecked());
                }
                catch (final Exception ex4) {
                    ex4.printStackTrace();
                }
            }
            catch (final Exception ex5) {}
        }
        catch (final Exception ex6) {}
    }
    
    private void setSystemBarsColorBlack() {
    }
    
    public void addAyaEntityRecursive(int selectedItemPosition, final int n, int selectedItemPosition2) {
        try {
            final String ayahText = this.quranReader.getAyahText(selectedItemPosition2, selectedItemPosition);
            try {
                final Spinner spinnerTranslation = this.spinnerTranslation;
                try {
                    final int selectedItemPosition3 = spinnerTranslation.getSelectedItemPosition();
                    final int n2 = 1;
                    Label_0091: {
                        if (selectedItemPosition3 <= 0) {
                            break Label_0091;
                        }
                        final QuranReader quranReader = this.quranReader;
                        try {
                            final String[] translation_name = this.translation_name;
                            try {
                                final Spinner spinnerTranslation2 = this.spinnerTranslation;
                                try {
                                    String translationAyahText = quranReader.getTranslationAyahText(translation_name[spinnerTranslation2.getSelectedItemPosition() - n2], selectedItemPosition2, selectedItemPosition);
                                    this.splitAya(ayahText, null, selectedItemPosition);
                                    Label_0161: {
                                        if (translationAyahText == null) {
                                            break Label_0161;
                                        }
                                        final AddQuranFragment$IAddQuran iAddQuran = this.iAddQuran;
                                        try {
                                            final Spinner spinnerTranslation3 = this.spinnerTranslation;
                                            try {
                                                boolean b;
                                                if (spinnerTranslation3.getSelectedItemPosition() == n2) {
                                                    b = (n2 != 0);
                                                }
                                                else {
                                                    b = false;
                                                }
                                                iAddQuran.onAddTranslation(translationAyahText, selectedItemPosition, b);
                                                Label_0523: {
                                                    if (this.iAddQuran == null) {
                                                        break Label_0523;
                                                    }
                                                    final Spinner spinnerReciters = this.spinnerReciters;
                                                    try {
                                                        Label_0246: {
                                                            if (!spinnerReciters.isEnabled()) {
                                                                break Label_0246;
                                                            }
                                                            final List recitersModels = this.recitersModels;
                                                            try {
                                                                try {
                                                                    final String[] arrayIdentifier = this.arrayIdentifier;
                                                                    try {
                                                                        final Spinner spinnerReciters2 = this.spinnerReciters;
                                                                        try {
                                                                            final RecitersModel recitersModel = new RecitersModel(arrayIdentifier[spinnerReciters2.getSelectedItemPosition()], selectedItemPosition2, selectedItemPosition);
                                                                            final List list = recitersModels;
                                                                            try {
                                                                                list.add(recitersModel);
                                                                                if (selectedItemPosition < n) {
                                                                                    break Label_0523;
                                                                                }
                                                                                Label_0388: {
                                                                                    if (this.uri_recitation == null) {
                                                                                        break Label_0388;
                                                                                    }
                                                                                    final AddQuranFragment$IAddQuran iAddQuran2 = this.iAddQuran;
                                                                                    try {
                                                                                        try {
                                                                                            final StringBuilder append = new StringBuilder().append(this.surah_hint);
                                                                                            try {
                                                                                                final String[] arraySurah = this.arraySurah;
                                                                                                try {
                                                                                                    final Spinner spinnerSurah = this.spinnerSurah;
                                                                                                    try {
                                                                                                        selectedItemPosition2 = spinnerSurah.getSelectedItemPosition();
                                                                                                        final StringBuilder append2 = append.append(arraySurah[selectedItemPosition2]);
                                                                                                        try {
                                                                                                            final String string = append2.toString();
                                                                                                            try {
                                                                                                                final Spinner spinnerSurah2 = this.spinnerSurah;
                                                                                                                try {
                                                                                                                    selectedItemPosition = spinnerSurah2.getSelectedItemPosition();
                                                                                                                    final int n3 = selectedItemPosition + 1;
                                                                                                                    final String reader_name = this.reader_name;
                                                                                                                    try {
                                                                                                                        final Uri uri_recitation = this.uri_recitation;
                                                                                                                        try {
                                                                                                                            iAddQuran2.onDone(string, n3, reader_name, uri_recitation, this.path_video_copy);
                                                                                                                            return;
                                                                                                                            final AddQuranFragment$IAddQuran iAddQuran3 = this.iAddQuran;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    final StringBuilder append3 = new StringBuilder().append(this.surah_hint);
                                                                                                                                    try {
                                                                                                                                        final String[] arraySurah2 = this.arraySurah;
                                                                                                                                        try {
                                                                                                                                            final Spinner spinnerSurah3 = this.spinnerSurah;
                                                                                                                                            try {
                                                                                                                                                final StringBuilder append4 = append3.append(arraySurah2[spinnerSurah3.getSelectedItemPosition()]);
                                                                                                                                                try {
                                                                                                                                                    final String string2 = append4.toString();
                                                                                                                                                    try {
                                                                                                                                                        final Spinner spinnerSurah4 = this.spinnerSurah;
                                                                                                                                                        try {
                                                                                                                                                            selectedItemPosition2 = spinnerSurah4.getSelectedItemPosition() + n2;
                                                                                                                                                            final String[] arrayReciters = this.arrayReciters;
                                                                                                                                                            try {
                                                                                                                                                                final Spinner spinnerReciters3 = this.spinnerReciters;
                                                                                                                                                                try {
                                                                                                                                                                    final String s = arrayReciters[spinnerReciters3.getSelectedItemPosition()];
                                                                                                                                                                    try {
                                                                                                                                                                        iAddQuran3.onDone(string2, selectedItemPosition2, s, this.recitersModels);
                                                                                                                                                                        return;
                                                                                                                                                                        selectedItemPosition += n2;
                                                                                                                                                                        this.addAyaEntityRecursive(selectedItemPosition, n, selectedItemPosition2);
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
                                                                                    catch (final Exception ex21) {}
                                                                                }
                                                                            }
                                                                            catch (final Exception ex22) {}
                                                                        }
                                                                        catch (final Exception ex23) {}
                                                                    }
                                                                    catch (final Exception ex24) {}
                                                                }
                                                                catch (final Exception ex25) {}
                                                            }
                                                            catch (final Exception ex26) {}
                                                        }
                                                    }
                                                    catch (final Exception ex27) {}
                                                }
                                            }
                                            catch (final Exception ex28) {}
                                        }
                                        catch (final Exception ex29) {}
                                    }
                                    translationAyahText = null;
                                }
                                catch (final Exception ex30) {}
                            }
                            catch (final Exception ex31) {}
                        }
                        catch (final Exception ex32) {}
                    }
                }
                catch (final Exception ex33) {}
            }
            catch (final Exception ex34) {}
        }
        catch (final Exception ex35) {}
    }
    
    public void addAyaIndex() {
        int i = 1;
        try {
            this.isFromSearch = (i != 0);
            final QuranPreference quranPreference = this.quranPreference;
            try {
                final int surah = quranPreference.getSurah();
                this.current_pos = surah;
                this.spinnerSurah.setSelection(surah, false);
                final int[] arrayCount = this.arrayCount;
                try {
                    final QuranPreference quranPreference2 = this.quranPreference;
                    try {
                        final int n = arrayCount[quranPreference2.getSurah()];
                        try {
                            try {
                                final ArrayList<String> list = new ArrayList<String>();
                                while (i <= n) {
                                    list.add(String.valueOf(i));
                                    ++i;
                                }
                                final ArrayAdapter adapterFromAyah = this.adapterFromAyah;
                                try {
                                    adapterFromAyah.clear();
                                    this.adapterFromAyah.addAll((Collection)list);
                                    final ArrayAdapter adapterToAyah = this.adapterToAyah;
                                    try {
                                        adapterToAyah.clear();
                                        this.adapterToAyah.addAll((Collection)list);
                                        final Spinner spinnerFrom = this.spinnerFrom;
                                        try {
                                            final QuranPreference quranPreference3 = this.quranPreference;
                                            try {
                                                spinnerFrom.setSelection(quranPreference3.getFrom(), false);
                                                final Spinner spinnerReciters = this.spinnerReciters;
                                                try {
                                                    final QuranPreference quranPreference4 = this.quranPreference;
                                                    try {
                                                        spinnerReciters.setSelection(quranPreference4.getNameReader(), false);
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
    
    public String getWords(final String[] original, int from, int length) {
        final String s = "";
        if (original == null || original.length == 0) {
            return s;
        }
        if (from < 0) {
            from = 0;
        }
        if (length > original.length) {
            length = original.length;
        }
        if (from >= length) {
            return s;
        }
        return ProVersionActivity$$ExternalSyntheticBackport0.m(" ", Arrays.copyOfRange(original, from, length));
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentAddQuranBinding inflate = FragmentAddQuranBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final RelativeLayout root = inflate.getRoot();
        if (this.resources != null) {
            if (this.iAddQuran != null) {
                this.quranPreference = new QuranPreference(this.getContext());
                this.quranReader = new QuranReader(this.getContext());
                String surah_hint;
                if (LocaleHelper.getLanguage(this.getContext()).equals("ar")) {
                    surah_hint = "\u0633\u0648\u0631\u0629 ";
                }
                else {
                    surah_hint = "Surah ";
                }
                this.surah_hint = surah_hint;
                final ImageView iv_done_upload = (ImageView)((View)root).findViewById(R$id.iv_done);
                this.iv_done_upload = iv_done_upload;
                if (this.uri_recitation != null) {
                    iv_done_upload.setVisibility(0);
                }
                ((TextCustumFont)((View)root).findViewById(R$id.tv_surah)).setText((CharSequence)this.resources.getString(R$string.tv_surah));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_icon)).setText((CharSequence)this.resources.getString(R$string.quran_icon));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_add_bismilah)).setText((CharSequence)this.resources.getString(R$string.add_bismilah));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_end_ayah)).setText((CharSequence)this.resources.getString(R$string.to));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_hint_reader)).setText((CharSequence)this.resources.getString(R$string.tv_hint_reader));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_translation)).setText((CharSequence)this.resources.getString(R$string.translation));
                this.arraySurah = this.getResources().getStringArray(R$array.surah_names_merged);
                this.arrayCount = this.getResources().getIntArray(R$array.surah_count);
                this.arrayIdentifier = this.getResources().getStringArray(R$array.identifier);
                this.arrayReciters = this.resources.getStringArray(R$array.reciters);
                this.arrayTranslation = this.resources.getStringArray(R$array.translation_name);
                (this.includeBismilah = (CheckboxCustumFont)((View)root).findViewById(R$id.checkbox)).setChecked(MyPrefereces.isIncludeBismilah(this.getContext()));
                ((View)root).findViewById(R$id.add_bismilah).setOnClickListener((View$OnClickListener)new AddQuranFragment$1(this));
                this.spinnerSurah = (Spinner)((View)root).findViewById(R$id.sura_name);
                final ArrayAdapter adapter = new ArrayAdapter(this.getContext(), R$layout.row_spinner_aya, (Object[])this.arraySurah);
                final int dropDownViewResource = 17367049;
                adapter.setDropDownViewResource(dropDownViewResource);
                this.spinnerSurah.setOnItemSelectedListener(this.onSurahSelectedListener);
                this.spinnerSurah.setAdapter((SpinnerAdapter)adapter);
                final Spinner spinnerSurah = this.spinnerSurah;
                spinnerSurah.setDropDownVerticalOffset(spinnerSurah.getHeight() * -10);
                this.spinnerFrom = (Spinner)((View)root).findViewById(R$id.aya_from);
                (this.adapterFromAyah = new ArrayAdapter(this.getContext(), R$layout.row_spinner_aya)).setDropDownViewResource(dropDownViewResource);
                this.spinnerFrom.setOnItemSelectedListener(this.onFromAyaSelectedListener);
                this.spinnerFrom.setAdapter((SpinnerAdapter)this.adapterFromAyah);
                this.spinnerTo = (Spinner)((View)root).findViewById(R$id.aya_to);
                (this.adapterToAyah = new ArrayAdapter(this.getContext(), R$layout.row_spinner_aya)).setDropDownViewResource(dropDownViewResource);
                this.spinnerTo.setAdapter((SpinnerAdapter)this.adapterToAyah);
                this.spinnerReciters = (Spinner)((View)root).findViewById(R$id.spinner_reciters);
                final ArrayAdapter adapter2 = new ArrayAdapter(this.getContext(), R$layout.row_spinner_aya, (Object[])this.arrayReciters);
                adapter2.setDropDownViewResource(dropDownViewResource);
                this.spinnerReciters.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AddQuranFragment$2(this));
                this.spinnerReciters.setAdapter((SpinnerAdapter)adapter2);
                this.spinnerTranslation = (Spinner)((View)root).findViewById(R$id.spinner_translation);
                final ArrayAdapter adapter3 = new ArrayAdapter(this.getContext(), R$layout.row_spinner_aya, (Object[])this.arrayTranslation);
                adapter3.setDropDownViewResource(dropDownViewResource);
                this.spinnerTranslation.setAdapter((SpinnerAdapter)adapter3);
                this.layoutConnection = (LinearLayout)((View)root).findViewById(R$id.hint_no_internet);
                ((View)root).findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new AddQuranFragment$3(this));
                ((View)root).findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new AddQuranFragment$4(this));
                ((View)root).findViewById(R$id.btn_search).setOnClickListener((View$OnClickListener)new AddQuranFragment$5(this));
                ((View)root).findViewById(R$id.btn_upload).setOnClickListener((View$OnClickListener)new AddQuranFragment$6(this));
                (this.tv_reader_name = (TextCustumFont)((View)root).findViewById(R$id.tv_reader)).setOnClickListener((View$OnClickListener)new AddQuranFragment$7(this));
                final String reader_name = this.reader_name;
                if (reader_name != null && !reader_name.isEmpty()) {
                    this.tv_reader_name.getPaint().setUnderlineText(true);
                    this.tv_reader_name.setText((CharSequence)this.reader_name);
                }
                else {
                    this.reader_name = "-";
                    this.tv_reader_name.setTextColor(-1);
                }
                this.initIconRv((View)root);
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.savePreference();
        QuranPreference.saveLastSearch(this.requireContext(), null);
        final AddQuranFragment$IAddQuran iAddQuran = this.iAddQuran;
        if (iAddQuran != null) {
            iAddQuran.onCancel();
        }
        this.onFromAyaSelectedListener = null;
        this.onSurahSelectedListener = null;
        this.fragmentBinding = null;
        AddQuranFragment.instance = null;
        this.iconQuranCallback = null;
    }
    
    public void onResume() {
        super.onResume();
        try {
            final Context context = this.getContext();
            try {
                if (NetworkUtils.isNetworkAvailable(context)) {
                    this.spinnerReciters.setVisibility(0);
                    this.spinnerReciters.setEnabled(true);
                    this.layoutConnection.setVisibility(8);
                    return;
                }
                this.spinnerReciters.setEnabled(false);
                this.spinnerReciters.setVisibility(4);
                this.layoutConnection.setVisibility(0);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
    }
    
    public void onStart() {
        super.onStart();
        this.setSystemBarsColorBlack();
    }
    
    public void setNameReader(String s, final Uri uri_recitation, final String path_video_copy) {
        this.uri_recitation = uri_recitation;
        this.path_video_copy = path_video_copy;
        if (uri_recitation != null) {
            this.iv_done_upload.setVisibility(0);
        }
        if (s != null && !s.isEmpty()) {
            this.tv_reader_name.getPaint().setUnderlineText(true);
        }
        else {
            this.tv_reader_name.getPaint().setUnderlineText(false);
            s = "-";
        }
        this.reader_name = s;
        this.tv_reader_name.setText((CharSequence)s);
    }
    
    public void splitAya(final String str, final String s, final int n) {
        final String trim = str.trim();
        final String[] split = trim.replaceAll("\\s*([\\u06D6-\\u06ED])", "$1").trim().split("\\s+");
        final String s2 = ",";
        String[] split2;
        if (s != null) {
            split2 = s.split(s2);
        }
        else {
            split2 = null;
        }
        final int length = split.length;
        final int n2 = 4;
        String s3 = " ";
        String str2 = " \u0646\u0635";
        if (length <= n2) {
            String replace;
            if (s != null) {
                replace = s.replace(s2, s3);
            }
            else {
                replace = null;
            }
            this.iAddQuran.onAdd(str + str2, trim, replace, s, str.length(), n, this.icon, 0, split.length);
            return;
        }
        StringBuilder sb = new StringBuilder();
        final int length2 = split.length;
        int n3 = 1;
        float n4 = Float.MIN_VALUE;
        int n5 = length2 - 1;
        int n6 = 0;
        int n7 = 0;
        int i = 0;
        int n8 = 0;
        while (i < split.length) {
            final String str3 = split[i];
            sb.append(str3).append(s3);
            if (str3.length() > n3) {
                ++n6;
            }
            final int n9 = n7 + 1;
            int n11;
            int n12;
            int n13;
            float n14;
            String s5;
            String s6;
            StringBuilder sb3;
            if (n6 == 5) {
                final int n10 = n8 + n6 - (n9 - n6);
                StringBuilder sb2;
                int n15;
                if (i == n5) {
                    final String trim2 = sb.toString().trim();
                    final AddQuranFragment$IAddQuran iAddQuran = this.iAddQuran;
                    final String string = trim2 + str2;
                    String words;
                    if (split2 != null) {
                        words = this.getWords(split2, n8, n10);
                    }
                    else {
                        words = null;
                    }
                    final int length3 = trim2.length();
                    final String icon = this.icon;
                    final AddQuranFragment$IAddQuran addQuranFragment$IAddQuran = iAddQuran;
                    n11 = i;
                    n12 = n5;
                    n13 = 1;
                    n14 = Float.MIN_VALUE;
                    sb2 = sb;
                    final String s4 = icon;
                    s5 = str2;
                    s6 = s3;
                    addQuranFragment$IAddQuran.onAdd(string, trim, words, s, length3, n, s4, n8, n10);
                    n15 = n8;
                }
                else {
                    n11 = i;
                    n12 = n5;
                    n13 = n3;
                    n14 = n4;
                    sb2 = sb;
                    s5 = str2;
                    s6 = s3;
                    final AddQuranFragment$IAddQuran iAddQuran2 = this.iAddQuran;
                    final String trim3 = sb.toString().trim();
                    int n16;
                    String words2;
                    if (split2 != null) {
                        n16 = n8;
                        words2 = this.getWords(split2, n8, n10);
                    }
                    else {
                        n16 = n8;
                        words2 = null;
                    }
                    final String icon2 = this.icon;
                    final int n17 = n16 + n9;
                    final int n18 = -1;
                    final int n19 = -1;
                    final int n20 = n16;
                    n15 = n16;
                    iAddQuran2.onAdd(trim3, trim, words2, s, n18, n19, icon2, n20, n17);
                }
                n8 = n15 + n9;
                sb3 = sb2;
                sb2.setLength();
                n6 = 0;
                n7 = 0;
            }
            else {
                n11 = i;
                n12 = n5;
                n13 = n3;
                n14 = n4;
                sb3 = sb;
                s5 = str2;
                s6 = s3;
                n7 = n9;
            }
            final int n21 = n11 + 1;
            sb = sb3;
            i = n21;
            n3 = n13;
            n4 = n14;
            s3 = s6;
            n5 = n12;
            str2 = s5;
        }
        final int n22 = n8;
        if (sb.length() > 0) {
            final String trim4 = sb.toString().trim();
            final AddQuranFragment$IAddQuran iAddQuran3 = this.iAddQuran;
            final String string2 = trim4 + str2;
            String words3;
            if (split2 != null) {
                words3 = this.getWords(split2, split2.length - n6 - (n7 - n6), split2.length);
            }
            else {
                words3 = null;
            }
            iAddQuran3.onAdd(string2, trim, words3, s, trim4.length(), n, this.icon, n22, n22 + n7);
        }
    }
}
