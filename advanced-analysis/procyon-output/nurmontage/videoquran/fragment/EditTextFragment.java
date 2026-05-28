// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$ItemDecoration;
import hazem.nurmontage.videoquran.views.ArrowOverlayDecoration;
import hazem.nurmontage.videoquran.R$drawable;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import hazem.nurmontage.videoquran.R$id;
import java.util.ArrayList;
import android.view.View;
import java.util.List;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$IWordAya;
import hazem.nurmontage.videoquran.databinding.FragmentEditTextBinding;
import androidx.fragment.app.Fragment;

public class EditTextFragment extends Fragment
{
    public static EditTextFragment instance;
    private FragmentEditTextBinding fragmentBinding;
    private EditTextFragment$IEdiTextCallback iEditEntityCallback;
    private WordAyaAdabter$IWordAya iWordAya;
    private QuranEntity quranEntity;
    private RecyclerView recyclerView;
    private WordAyaAdabter wordAyaAdabter;
    
    public EditTextFragment() {
        this.iWordAya = new EditTextFragment$2(this);
    }
    
    public EditTextFragment(final EditTextFragment$IEdiTextCallback iEditEntityCallback, final QuranEntity quranEntity) {
        this.iWordAya = new EditTextFragment$2(this);
        this.iEditEntityCallback = iEditEntityCallback;
        this.quranEntity = quranEntity;
    }
    
    public static int findFirstDigitIndex(final String s) {
        final int n = -1;
        if (s != null) {
            if (!s.isEmpty()) {
                for (int i = 0; i < s.length(); ++i) {
                    if (Character.isDigit(s.charAt(i))) {
                        return i;
                    }
                }
            }
        }
        return n;
    }
    
    public static EditTextFragment getInstance(final EditTextFragment$IEdiTextCallback editTextFragment$IEdiTextCallback, final QuranEntity quranEntity) {
        if (EditTextFragment.instance == null) {
            EditTextFragment.instance = new EditTextFragment(editTextFragment$IEdiTextCallback, quranEntity);
        }
        return EditTextFragment.instance;
    }
    
    private String getSelectedAya() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        final List list = this.wordAyaAdabter.getList();
        String[] split;
        if (this.quranEntity.getTranslation_complete() != null) {
            split = this.quranEntity.getTranslation_complete().split(",");
        }
        else {
            split = null;
        }
        final int n = -1;
        int i = 0;
        int startWord_index = n;
        int n2 = 0;
        while (i < list.size()) {
            final WordModel wordModel = list.get(i);
            if (wordModel.isSelected()) {
                if (startWord_index == n) {
                    startWord_index = i;
                }
                ++n2;
                final StringBuilder append = sb.append(wordModel.getW());
                final String s = " ";
                append.append(s);
                if (split != null && i < split.length) {
                    sb2.append(split[i]).append(s);
                }
            }
            ++i;
        }
        if (sb2.length() > 0) {
            this.quranEntity.setTranslation(sb2.toString());
        }
        else {
            this.quranEntity.setTranslation(null);
        }
        int endWord_index = n2 + startWord_index;
        if (this.quranEntity.getNumber() != n) {
            ++endWord_index;
        }
        this.quranEntity.setEndWord_index(endWord_index);
        this.quranEntity.setStartWord_index(startWord_index);
        return sb.toString().trim();
    }
    
    private void init(final View view) {
        final int indexNumber = this.quranEntity.getIndexNumber();
        String str;
        if (indexNumber >= 0) {
            str = this.quranEntity.getTxt().substring(0, Math.min(indexNumber, this.quranEntity.getTxt().length())) + " " + this.quranEntity.getNumber();
        }
        else {
            str = this.quranEntity.getTxt();
        }
        final String complete_aya = this.quranEntity.getComplete_aya();
        final int startWord_index = this.quranEntity.getStartWord_index();
        final int endWord_index = this.quranEntity.getEndWord_index();
        final String trim = complete_aya.trim();
        final String s = "\\s*([\\u06D6-\\u06ED])";
        final String s2 = "$1";
        final String trim2 = trim.replaceAll(s, s2).trim();
        final String s3 = "\\s+";
        final String[] split = trim2.split(s3);
        final ArrayList list = new ArrayList();
        final String s4 = "-1";
        int n = 1;
        if (startWord_index == endWord_index) {
            final String[] split2 = str.trim().replaceAll(s, s2).split(s3);
            final int index = complete_aya.indexOf(str);
            int n2;
            if (index == 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            final int length = split.length;
            int i = 0;
            int n3 = 0;
            int n4 = 0;
            while (i < length) {
                final String s5 = split[i];
                if (!s5.equals(s4)) {
                    if (n2 == 0) {
                        if (n3 == index) {
                            n2 = n;
                        }
                        n3 += s5.length() + n;
                    }
                    if (n2 != 0 && n4 < split2.length) {
                        final boolean equals = s5.equals(split2[n4]);
                        list.add(new WordModel(s5, equals));
                        if (equals) {
                            ++n4;
                        }
                    }
                    else {
                        list.add(new WordModel(s5, false));
                    }
                }
                ++i;
                n = 1;
            }
        }
        else {
            for (int j = 0; j < split.length; ++j) {
                if (!split[j].equals(s4)) {
                    list.add(new WordModel(split[j], j >= startWord_index && j < endWord_index));
                }
            }
        }
        this.wordAyaAdabter = new WordAyaAdabter(this.iWordAya, list);
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(R$id.rv);
        this.recyclerView = recyclerView;
        final Context context = this.getContext();
        final boolean hasFixedSize = true;
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager(context, 0, hasFixedSize));
        this.recyclerView.setHasFixedSize(hasFixedSize);
        this.recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        this.recyclerView.setAdapter((RecyclerView$Adapter)this.wordAyaAdabter);
        try {
            this.recyclerView.scrollToPosition(startWord_index);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.recyclerView.addItemDecoration((RecyclerView$ItemDecoration)new ArrowOverlayDecoration(this.getContext(), R$drawable.btn_on_back, 18));
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEditTextBinding inflate = FragmentEditTextBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.quranEntity != null) {
            if (this.iEditEntityCallback != null) {
                this.init((View)root);
                ((View)root).findViewById(R$id.btn_close).setOnClickListener((View$OnClickListener)new EditTextFragment$1(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        final FragmentEditTextBinding fragmentBinding = this.fragmentBinding;
        if (fragmentBinding != null) {
            fragmentBinding.getRoot().removeAllViews();
            this.fragmentBinding = null;
        }
        this.iWordAya = null;
        EditTextFragment.instance = null;
        super.onDestroyView();
    }
    
    public void update(final QuranEntity quranEntity) {
        if (quranEntity == null) {
            return;
        }
        this.quranEntity = quranEntity;
        final int indexNumber = quranEntity.getIndexNumber();
        String str;
        if (indexNumber >= 0) {
            str = this.quranEntity.getTxt().substring(0, Math.min(indexNumber, this.quranEntity.getTxt().length())) + " " + this.quranEntity.getNumber();
        }
        else {
            str = this.quranEntity.getTxt();
        }
        final String complete_aya = this.quranEntity.getComplete_aya();
        final int startWord_index = this.quranEntity.getStartWord_index();
        final int endWord_index = this.quranEntity.getEndWord_index();
        final String trim = complete_aya.trim();
        final String s = "\\s*([\\u06D6-\\u06ED])";
        final String s2 = "$1";
        final String trim2 = trim.replaceAll(s, s2).trim();
        final String s3 = "\\s+";
        final String[] split = trim2.split(s3);
        final ArrayList list = new ArrayList();
        final String s4 = "-1";
        int n = 1;
        if (startWord_index == endWord_index) {
            final String[] split2 = str.trim().replaceAll(s, s2).split(s3);
            final int index = complete_aya.indexOf(str);
            int n2;
            if (index == 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            final int length = split.length;
            int i = 0;
            int n3 = 0;
            int n4 = 0;
            while (i < length) {
                final String s5 = split[i];
                if (!s5.equals(s4)) {
                    if (n2 == 0) {
                        if (n3 == index) {
                            n2 = n;
                        }
                        n3 += s5.length() + n;
                    }
                    if (n2 != 0 && n4 < split2.length) {
                        final boolean equals = s5.equals(split2[n4]);
                        list.add(new WordModel(s5, equals));
                        if (equals) {
                            ++n4;
                        }
                    }
                    else {
                        list.add(new WordModel(s5, false));
                    }
                }
                ++i;
                n = 1;
            }
        }
        else {
            for (int j = 0; j < split.length; ++j) {
                final String s6 = split[j];
                if (!s6.equals(s4)) {
                    list.add(new WordModel(s6, j >= startWord_index && j < endWord_index));
                }
            }
        }
        this.wordAyaAdabter.setList(list);
        try {
            this.recyclerView.scrollToPosition(startWord_index);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
