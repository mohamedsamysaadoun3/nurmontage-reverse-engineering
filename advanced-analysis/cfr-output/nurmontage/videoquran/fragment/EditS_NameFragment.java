/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.databinding.FragmentEditSNameBinding;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$1;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$2;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$3;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$IEditS_Name;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class EditS_NameFragment
extends Fragment {
    public static EditS_NameFragment instance;
    private SurahNameEntity entity_select;
    private FragmentEditSNameBinding fragmentBinding;
    private EditS_NameFragment$IEditS_Name iEditSName;
    private Resources resources;

    static /* bridge */ /* synthetic */ SurahNameEntity cfr_renamed_177(EditS_NameFragment editS_NameFragment) {
        return editS_NameFragment.entity_select;
    }

    static /* bridge */ /* synthetic */ EditS_NameFragment$IEditS_Name cfr_renamed_176(EditS_NameFragment editS_NameFragment) {
        return editS_NameFragment.iEditSName;
    }

    public EditS_NameFragment() {
    }

    public EditS_NameFragment(EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name, Resources resources, SurahNameEntity surahNameEntity) {
        this.iEditSName = editS_NameFragment$IEditS_Name;
        this.resources = resources;
        this.entity_select = surahNameEntity;
    }

    public static EditS_NameFragment getInstance(EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name, Resources resources, SurahNameEntity surahNameEntity) {
        EditS_NameFragment editS_NameFragment = instance;
        if (editS_NameFragment == null) {
            instance = editS_NameFragment = new EditS_NameFragment(editS_NameFragment$IEditS_Name, resources, surahNameEntity);
        }
        return instance;
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = null;
        object = FragmentEditSNameBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditSNameBinding)object).getRoot();
        object2 = this.iEditSName;
        if (object2 != null && (object2 = this.resources) != null && (object2 = this.entity_select) != null) {
            int n = R$id.tv_color;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            int n2 = R$string.color;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_edit;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.edit;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.tv_font;
            object2 = (TextCustumFont)object.findViewById(n);
            object3 = this.resources;
            n2 = R$string.font;
            object3 = object3.getString(n2);
            object2.setText((CharSequence)object3);
            n = R$id.btn_font;
            object2 = object.findViewById(n);
            object3 = new EditS_NameFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_color;
            object2 = object.findViewById(n);
            object3 = new EditS_NameFragment$2(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n = R$id.btn_edit;
            object2 = object.findViewById(n);
            object3 = new EditS_NameFragment$3(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        instance = null;
        this.iEditSName = null;
        this.fragmentBinding = null;
        super.onDestroyView();
    }
}

