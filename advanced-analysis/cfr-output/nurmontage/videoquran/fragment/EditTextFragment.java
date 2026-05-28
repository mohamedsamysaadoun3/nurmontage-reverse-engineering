/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$IWordAya;
import hazem.nurmontage.videoquran.databinding.FragmentEditTextBinding;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$1;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$2;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$IEdiTextCallback;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.views.ArrowOverlayDecoration;
import java.util.ArrayList;

public class EditTextFragment
extends Fragment {
    public static EditTextFragment instance;
    private FragmentEditTextBinding fragmentBinding;
    private EditTextFragment$IEdiTextCallback iEditEntityCallback;
    private WordAyaAdabter$IWordAya iWordAya;
    private QuranEntity quranEntity;
    private RecyclerView recyclerView;
    private WordAyaAdabter wordAyaAdabter;

    static /* bridge */ /* synthetic */ EditTextFragment$IEdiTextCallback cfr_renamed_164(EditTextFragment editTextFragment) {
        return editTextFragment.iEditEntityCallback;
    }

    static /* bridge */ /* synthetic */ QuranEntity cfr_renamed_165(EditTextFragment editTextFragment) {
        return editTextFragment.quranEntity;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_151(EditTextFragment editTextFragment) {
        return editTextFragment.getSelectedAya();
    }

    public EditTextFragment() {
        EditTextFragment$2 editTextFragment$2 = new EditTextFragment$2(this);
        this.iWordAya = editTextFragment$2;
    }

    public EditTextFragment(EditTextFragment$IEdiTextCallback editTextFragment$IEdiTextCallback, QuranEntity quranEntity) {
        EditTextFragment$2 editTextFragment$2 = new EditTextFragment$2(this);
        this.iWordAya = editTextFragment$2;
        this.iEditEntityCallback = editTextFragment$IEdiTextCallback;
        this.quranEntity = quranEntity;
    }

    public static int findFirstDigitIndex(String string2) {
        int n;
        int n2 = -1;
        if (string2 != null && (n = string2.isEmpty()) == 0) {
            int n3;
            for (n = 0; n < (n3 = string2.length()); ++n) {
                n3 = Character.isDigit(string2.charAt(n)) ? 1 : 0;
                if (n3 == 0) continue;
                return n;
            }
        }
        return n2;
    }

    public static EditTextFragment getInstance(EditTextFragment$IEdiTextCallback editTextFragment$IEdiTextCallback, QuranEntity quranEntity) {
        EditTextFragment editTextFragment = instance;
        if (editTextFragment == null) {
            instance = editTextFragment = new EditTextFragment(editTextFragment$IEdiTextCallback, quranEntity);
        }
        return instance;
    }

    private String getSelectedAya() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = new StringBuilder();
        Object object2 = this.wordAyaAdabter.getList();
        String[] stringArray = this.quranEntity.getTranslation_complete();
        if (stringArray != null) {
            stringArray = this.quranEntity.getTranslation_complete();
            String string2 = ",";
            stringArray = stringArray.split(string2);
        } else {
            stringArray = null;
        }
        int n2 = -1;
        int n3 = n2;
        int n4 = 0;
        for (int i = 0; i < (n = object2.size()); ++i) {
            Object object3 = (WordModel)object2.get(i);
            boolean bl = ((WordModel)object3).isSelected();
            if (!bl) continue;
            if (n3 == n2) {
                n3 = i;
            }
            ++n4;
            object3 = ((WordModel)object3).getW();
            object3 = stringBuilder.append((String)object3);
            String string3 = " ";
            ((StringBuilder)object3).append(string3);
            if (stringArray == null || i >= (n = stringArray.length)) continue;
            object3 = stringArray[i];
            object3 = ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object3).append(string3);
        }
        int n5 = ((StringBuilder)object).length();
        if (n5 > 0) {
            object2 = this.quranEntity;
            object = ((StringBuilder)object).toString();
            ((QuranEntity)object2).setTranslation((String)object);
        } else {
            object = this.quranEntity;
            ((QuranEntity)object).setTranslation(null);
        }
        n4 += n3;
        object = this.quranEntity;
        int n6 = ((QuranEntity)object).getNumber();
        if (n6 != n2) {
            ++n4;
        }
        this.quranEntity.setEndWord_index(n4);
        this.quranEntity.setStartWord_index(n3);
        return stringBuilder.toString().trim();
    }

    private void init(View view) {
        Object object;
        Object object2;
        int n;
        EditTextFragment editTextFragment = this;
        Object object3 = this.quranEntity;
        int n2 = ((QuranEntity)object3).getIndexNumber();
        Object object4 = null;
        if (n2 >= 0) {
            n = this.quranEntity.getTxt().length();
            n2 = Math.min(n2, n);
            object2 = new StringBuilder();
            object = this.quranEntity.getTxt();
            object3 = ((String)object).substring(0, n2);
            object3 = ((StringBuilder)object2).append((String)object3).append(" ");
            object2 = this.quranEntity;
            n = ((QuranEntity)object2).getNumber();
            object3 = ((StringBuilder)object3).append(n).toString();
        } else {
            object3 = this.quranEntity.getTxt();
        }
        object2 = editTextFragment.quranEntity.getComplete_aya();
        object = editTextFragment.quranEntity;
        int n3 = ((QuranEntity)object).getStartWord_index();
        Context context = editTextFragment.quranEntity;
        int n4 = context.getEndWord_index();
        String[] stringArray = ((String)object2).trim();
        String string2 = "\\s*([\\u06D6-\\u06ED])";
        String string3 = "$1";
        stringArray = stringArray.replaceAll(string2, string3).trim();
        String string4 = "\\s+";
        stringArray = stringArray.split(string4);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string5 = "-1";
        int n5 = 1;
        if (n3 == n4) {
            context = ((String)object3).trim().replaceAll(string2, string3).split(string4);
            n2 = ((String)object2).indexOf((String)object3);
            if (n2 == 0) {
                n = n5;
            } else {
                n = 0;
                object2 = null;
            }
            int n6 = stringArray.length;
            string3 = null;
            int n7 = 0;
            string4 = null;
            int n8 = 0;
            for (int i = 0; i < n6; ++i) {
                String string6 = stringArray[i];
                int n9 = string6.equals(string5);
                if (n9 == 0) {
                    WordModel wordModel;
                    if (n == 0) {
                        if (n7 == n2) {
                            n = n5;
                        }
                        n9 = string6.length() + n5;
                        n7 += n9;
                    }
                    if (n != 0 && n8 < (n9 = ((Context)context).length)) {
                        Context context2 = context[n8];
                        n9 = string6.equals(context2) ? 1 : 0;
                        wordModel = new WordModel(string6, n9 != 0);
                        arrayList.add(wordModel);
                        if (n9 != 0) {
                            ++n8;
                        }
                    } else {
                        wordModel = new WordModel(string6, false);
                        arrayList.add(wordModel);
                    }
                }
                n5 = 1;
            }
        } else {
            object3 = null;
            for (n2 = 0; n2 < (n = stringArray.length); ++n2) {
                boolean bl;
                object2 = stringArray[n2];
                n = ((String)object2).equals(string5) ? 1 : 0;
                if (n != 0) continue;
                string2 = stringArray[n2];
                if (n2 >= n3 && n2 < n4) {
                    bl = true;
                } else {
                    bl = false;
                    string3 = null;
                }
                object2 = new WordModel(string2, bl);
                arrayList.add(object2);
            }
        }
        object2 = editTextFragment.iWordAya;
        object3 = new WordAyaAdabter((WordAyaAdabter$IWordAya)object2, arrayList);
        editTextFragment.wordAyaAdabter = object3;
        n2 = R$id.rv;
        object2 = view;
        object3 = (RecyclerView)view.findViewById(n2);
        editTextFragment.recyclerView = object3;
        context = this.getContext();
        boolean bl = true;
        object2 = new LinearLayoutManager(context, 0, bl);
        object3.setLayoutManager((RecyclerView.LayoutManager)object2);
        editTextFragment.recyclerView.setHasFixedSize(bl);
        editTextFragment.recyclerView.setItemAnimator(null);
        object3 = editTextFragment.recyclerView;
        object4 = editTextFragment.wordAyaAdabter;
        object3.setAdapter((RecyclerView.Adapter)object4);
        object3 = editTextFragment.recyclerView;
        try {
            object3.scrollToPosition(n3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object3 = editTextFragment.recyclerView;
        object2 = this.getContext();
        n3 = R$drawable.btn_on_back;
        object4 = new ArrowOverlayDecoration((Context)object2, n3, 18);
        object3.addItemDecoration((RecyclerView.ItemDecoration)object4);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentEditTextBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditTextBinding)object).getRoot();
        object2 = this.quranEntity;
        if (object2 != null && (object2 = this.iEditEntityCallback) != null) {
            this.init((View)object);
            int n = R$id.btn_close;
            object2 = object.findViewById(n);
            object3 = new EditTextFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        FragmentEditTextBinding fragmentEditTextBinding = this.fragmentBinding;
        if (fragmentEditTextBinding != null) {
            fragmentEditTextBinding = fragmentEditTextBinding.getRoot();
            fragmentEditTextBinding.removeAllViews();
            this.fragmentBinding = null;
        }
        this.iWordAya = null;
        instance = null;
        super.onDestroyView();
    }

    public void update(QuranEntity quranEntity) {
        Object object;
        Object object2;
        int n;
        EditTextFragment editTextFragment = this;
        Object object3 = quranEntity;
        if (quranEntity == null) {
            return;
        }
        this.quranEntity = quranEntity;
        int n2 = quranEntity.getIndexNumber();
        if (n2 >= 0) {
            n = this.quranEntity.getTxt().length();
            n2 = Math.min(n2, n);
            object2 = new StringBuilder();
            object = this.quranEntity.getTxt();
            object3 = ((String)object).substring(0, n2);
            object3 = ((StringBuilder)object2).append((String)object3).append(" ");
            object2 = this.quranEntity;
            n = ((QuranEntity)object2).getNumber();
            object3 = ((StringBuilder)object3).append(n).toString();
        } else {
            object3 = this.quranEntity.getTxt();
        }
        object2 = editTextFragment.quranEntity.getComplete_aya();
        object = editTextFragment.quranEntity;
        int n3 = ((QuranEntity)object).getStartWord_index();
        String[] stringArray = editTextFragment.quranEntity;
        int n4 = stringArray.getEndWord_index();
        String[] stringArray2 = ((String)object2).trim();
        Object object4 = "\\s*([\\u06D6-\\u06ED])";
        String string2 = "$1";
        stringArray2 = stringArray2.replaceAll((String)object4, string2).trim();
        String string3 = "\\s+";
        stringArray2 = stringArray2.split(string3);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string4 = "-1";
        int n5 = 1;
        if (n3 == n4) {
            stringArray = ((String)object3).trim().replaceAll((String)object4, string2).split(string3);
            n2 = ((String)object2).indexOf((String)object3);
            if (n2 == 0) {
                n = n5;
            } else {
                n = 0;
                object2 = null;
            }
            int n6 = stringArray2.length;
            string2 = null;
            int n7 = 0;
            string3 = null;
            int n8 = 0;
            for (int i = 0; i < n6; ++i) {
                String string5 = stringArray2[i];
                int n9 = string5.equals(string4);
                if (n9 == 0) {
                    WordModel wordModel;
                    if (n == 0) {
                        if (n7 == n2) {
                            n = n5;
                        }
                        n9 = string5.length() + n5;
                        n7 += n9;
                    }
                    if (n != 0 && n8 < (n9 = stringArray.length)) {
                        String string6 = stringArray[n8];
                        n9 = string5.equals(string6) ? 1 : 0;
                        wordModel = new WordModel(string5, n9 != 0);
                        arrayList.add(wordModel);
                        if (n9 != 0) {
                            ++n8;
                        }
                    } else {
                        wordModel = new WordModel(string5, false);
                        arrayList.add(wordModel);
                    }
                }
                n5 = 1;
            }
        } else {
            object3 = null;
            for (n2 = 0; n2 < (n = stringArray2.length); ++n2) {
                boolean bl;
                object2 = stringArray2[n2];
                boolean bl2 = ((String)object2).equals(string4);
                if (bl2) continue;
                if (n2 >= n3 && n2 < n4) {
                    bl = true;
                } else {
                    bl = false;
                    string2 = null;
                }
                object4 = new WordModel((String)object2, bl);
                arrayList.add(object4);
            }
        }
        object3 = editTextFragment.wordAyaAdabter;
        ((WordAyaAdabter)((Object)object3)).setList(arrayList);
        object3 = editTextFragment.recyclerView;
        try {
            object3.scrollToPosition(n3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

