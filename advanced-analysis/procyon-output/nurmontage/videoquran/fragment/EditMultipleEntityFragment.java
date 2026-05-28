// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.RelativeLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.RectF;
import android.graphics.PorterDuff$Mode;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.databinding.FragmentEditMediaMultipleBinding;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class EditMultipleEntityFragment extends Fragment
{
    public static EditMultipleEntityFragment instance;
    private LinearLayout btn_cut;
    private int count_select;
    private FragmentEditMediaMultipleBinding fragmentBinding;
    private EditMultipleEntityFragment$IEditMultipleCallback iEditMediaCallback;
    private ImageView iv_cut;
    private Resources resources;
    private TextCustumFont tv_cut;
    private TextCustumFont tv_delete;
    
    public EditMultipleEntityFragment() {
    }
    
    public EditMultipleEntityFragment(final EditMultipleEntityFragment$IEditMultipleCallback iEditMediaCallback, final Resources resources, final int count_select) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.resources = resources;
        this.count_select = count_select;
    }
    
    public static EditMultipleEntityFragment getInstance(final EditMultipleEntityFragment$IEditMultipleCallback editMultipleEntityFragment$IEditMultipleCallback, final Resources resources, final int n) {
        if (EditMultipleEntityFragment.instance == null) {
            EditMultipleEntityFragment.instance = new EditMultipleEntityFragment(editMultipleEntityFragment$IEditMultipleCallback, resources, n);
        }
        return EditMultipleEntityFragment.instance;
    }
    
    public void checkSplit(final Entity entity, float n) {
        if (entity == null) {
            return;
        }
        try {
            final RectF rect = entity.getRect();
            try {
                Label_0106: {
                    if (rect.left > n) {
                        break Label_0106;
                    }
                    final RectF rect2 = entity.getRect();
                    try {
                        if (rect2.right < n) {
                            break Label_0106;
                        }
                        final LinearLayout btn_cut = this.btn_cut;
                        final boolean clickable = true;
                        n = Float.MIN_VALUE;
                        btn_cut.setClickable(clickable);
                        final TextCustumFont tv_cut = this.tv_cut;
                        final int textColor = -1;
                        n = 0.0f / 0.0f;
                        tv_cut.setTextColor(textColor);
                        final ImageView iv_cut = this.iv_cut;
                        try {
                            iv_cut.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
                            return;
                            final TextCustumFont tv_cut2 = this.tv_cut;
                            final int textColor2 = -8355712;
                            n = 0.0f / 0.0f;
                            tv_cut2.setTextColor(textColor2);
                            final ImageView iv_cut2 = this.iv_cut;
                            try {
                                iv_cut2.setColorFilter(textColor2, PorterDuff$Mode.SRC_IN);
                                final LinearLayout btn_cut2 = this.btn_cut;
                                n = 0.0f;
                                btn_cut2.setClickable(false);
                            }
                            catch (final Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                        catch (final Exception ex2) {}
                    }
                    catch (final Exception ex3) {}
                }
            }
            catch (final Exception ex4) {}
        }
        catch (final Exception ex5) {}
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEditMediaMultipleBinding inflate = FragmentEditMediaMultipleBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final RelativeLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null) {
            if (this.resources != null) {
                final ImageView iv_cut = (ImageView)((View)root).findViewById(R$id.iv_cut);
                this.iv_cut = iv_cut;
                final PorterDuff$Mode src_IN = PorterDuff$Mode.SRC_IN;
                final int textColor = -8355712;
                iv_cut.setColorFilter(textColor, src_IN);
                (this.tv_delete = (TextCustumFont)((View)root).findViewById(R$id.tv_delete)).setText((CharSequence)this.resources.getString(R$string.delete));
                (this.tv_cut = (TextCustumFont)((View)root).findViewById(R$id.tv_cut)).setText((CharSequence)this.resources.getString(R$string.cut));
                this.tv_cut.setTextColor(textColor);
                ((View)root).findViewById(R$id.btn_delete).setOnClickListener((View$OnClickListener)new EditMultipleEntityFragment$1(this));
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.fragmentBinding = null;
        EditMultipleEntityFragment.instance = null;
        this.iEditMediaCallback = null;
        super.onDestroyView();
    }
    
    public void setCount_select(final int n) {
    }
}
