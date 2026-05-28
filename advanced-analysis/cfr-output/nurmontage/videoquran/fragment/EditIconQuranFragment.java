/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.databinding.FragmentFontBinding;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$1;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$2;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$3;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;
import java.util.ArrayList;
import java.util.List;

public class EditIconQuranFragment
extends Fragment {
    public static EditIconQuranFragment instance;
    private FragmentFontBinding fragmentBinding;
    private EditIconQuranFragment$IQuranIconCallback iQuranIconCallback;
    private String icon;
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private String last_icon;

    static /* bridge */ /* synthetic */ EditIconQuranFragment$IQuranIconCallback cfr_renamed_160(EditIconQuranFragment editIconQuranFragment) {
        return editIconQuranFragment.iQuranIconCallback;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_161(EditIconQuranFragment editIconQuranFragment) {
        return editIconQuranFragment.icon;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_162(EditIconQuranFragment editIconQuranFragment) {
        return editIconQuranFragment.last_icon;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_163(EditIconQuranFragment editIconQuranFragment, String string2) {
        editIconQuranFragment.icon = string2;
    }

    public EditIconQuranFragment() {
        EditIconQuranFragment$3 editIconQuranFragment$3 = new EditIconQuranFragment$3(this);
        this.iconQuranCallback = editIconQuranFragment$3;
    }

    public EditIconQuranFragment(EditIconQuranFragment$IQuranIconCallback editIconQuranFragment$IQuranIconCallback, String string2) {
        EditIconQuranFragment$3 editIconQuranFragment$3 = new EditIconQuranFragment$3(this);
        this.iconQuranCallback = editIconQuranFragment$3;
        this.iQuranIconCallback = editIconQuranFragment$IQuranIconCallback;
        this.icon = string2;
        this.last_icon = string2;
    }

    public static EditIconQuranFragment getInstance(EditIconQuranFragment$IQuranIconCallback editIconQuranFragment$IQuranIconCallback, String string2) {
        EditIconQuranFragment editIconQuranFragment = instance;
        if (editIconQuranFragment == null) {
            instance = editIconQuranFragment = new EditIconQuranFragment(editIconQuranFragment$IQuranIconCallback, string2);
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        Object object3;
        int n;
        block32: {
            boolean bl = false;
            object2 = null;
            object = FragmentFontBinding.inflate((LayoutInflater)object, viewGroup, false);
            this.fragmentBinding = object;
            object = ((FragmentFontBinding)object).getRoot();
            n = R$id.rv;
            viewGroup = object.findViewById(n);
            viewGroup = (RecyclerView)viewGroup;
            Object object4 = this.getContext();
            object3 = new LinearLayoutManager(object4, 0, false);
            viewGroup.setLayoutManager((RecyclerView.LayoutManager)object3);
            bl = false;
            object2 = null;
            viewGroup.setItemAnimator(null);
            bl = true;
            viewGroup.setHasFixedSize(bl);
            object2 = new ArrayList();
            object3 = "hafes";
            object2.add(object3);
            object3 = "shamerli";
            object2.add(object3);
            object3 = "nour_hode";
            object2.add(object3);
            object3 = "amiri";
            object2.add(object3);
            object4 = this.iconQuranCallback;
            String string2 = this.icon;
            int n2 = object2.indexOf(string2);
            object3 = new IconQuranAdabters((IconQuranAdabters$IIconQuranCallback)object4, (List)object2, n2);
            int n3 = ((IconQuranAdabters)((Object)object3)).getSelect();
            n2 = -1;
            if (n3 == n2) break block32;
            n3 = ((IconQuranAdabters)((Object)object3)).getSelect();
            object2 = object2.get(n3);
            object2 = (String)object2;
            this.icon = object2;
        }
        viewGroup.setAdapter((RecyclerView.Adapter)object3);
        n = R$id.btn_done;
        viewGroup = object.findViewById(n);
        object2 = new EditIconQuranFragment$1(this);
        viewGroup.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_cancel;
        viewGroup = object.findViewById(n);
        object2 = new EditIconQuranFragment$2(this);
        try {
            viewGroup.setOnClickListener((View.OnClickListener)object2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.iconQuranCallback = null;
        this.fragmentBinding = null;
        this.iQuranIconCallback = null;
        instance = null;
    }
}

