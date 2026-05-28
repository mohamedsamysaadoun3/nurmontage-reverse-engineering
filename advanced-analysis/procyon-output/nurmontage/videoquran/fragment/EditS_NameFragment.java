// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.databinding.FragmentEditSNameBinding;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import androidx.fragment.app.Fragment;

public class EditS_NameFragment extends Fragment
{
    public static EditS_NameFragment instance;
    private SurahNameEntity entity_select;
    private FragmentEditSNameBinding fragmentBinding;
    private EditS_NameFragment$IEditS_Name iEditSName;
    private Resources resources;
    
    public EditS_NameFragment() {
    }
    
    public EditS_NameFragment(final EditS_NameFragment$IEditS_Name iEditSName, final Resources resources, final SurahNameEntity entity_select) {
        this.iEditSName = iEditSName;
        this.resources = resources;
        this.entity_select = entity_select;
    }
    
    public static EditS_NameFragment getInstance(final EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name, final Resources resources, final SurahNameEntity surahNameEntity) {
        if (EditS_NameFragment.instance == null) {
            EditS_NameFragment.instance = new EditS_NameFragment(editS_NameFragment$IEditS_Name, resources, surahNameEntity);
        }
        return EditS_NameFragment.instance;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEditSNameBinding inflate = FragmentEditSNameBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final LinearLayout root = inflate.getRoot();
        if (this.iEditSName != null && this.resources != null) {
            if (this.entity_select != null) {
                ((TextCustumFont)((View)root).findViewById(R$id.tv_color)).setText((CharSequence)this.resources.getString(R$string.color));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_edit)).setText((CharSequence)this.resources.getString(R$string.edit));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_font)).setText((CharSequence)this.resources.getString(R$string.font));
                ((View)root).findViewById(R$id.btn_font).setOnClickListener((View$OnClickListener)new EditS_NameFragment$1(this));
                ((View)root).findViewById(R$id.btn_color).setOnClickListener((View$OnClickListener)new EditS_NameFragment$2(this));
                ((View)root).findViewById(R$id.btn_edit).setOnClickListener((View$OnClickListener)new EditS_NameFragment$3(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        EditS_NameFragment.instance = null;
        this.iEditSName = null;
        this.fragmentBinding = null;
        super.onDestroyView();
    }
}
