// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.RelativeLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.graphics.RectF;
import android.graphics.PorterDuff$Mode;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.databinding.FragmentEditEntityBinding;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class EditBismilahEntityFragment extends Fragment
{
    public static EditBismilahEntityFragment instance;
    private LinearLayout btnDelete;
    private LinearLayout btn_from_now;
    private LinearLayout btn_until_now;
    private Entity entity_select;
    private FragmentEditEntityBinding fragmentBinding;
    private EditBismilahEntityFragment$IBismilahEntityCallback iEditEntityCallback;
    private ImageView iv_from_now;
    private ImageView iv_until_now;
    private float pos_cursur;
    private Resources resources;
    private TextCustumFont tv_from_now;
    private TextCustumFont tv_until_now;
    
    public EditBismilahEntityFragment() {
    }
    
    public EditBismilahEntityFragment(final EditBismilahEntityFragment$IBismilahEntityCallback iEditEntityCallback, final Resources resources, final Entity entity_select, final float pos_cursur) {
        this.iEditEntityCallback = iEditEntityCallback;
        this.resources = resources;
        this.entity_select = entity_select;
        this.pos_cursur = pos_cursur;
    }
    
    public static EditBismilahEntityFragment getInstance(final EditBismilahEntityFragment$IBismilahEntityCallback editBismilahEntityFragment$IBismilahEntityCallback, final Resources resources, final Entity entity, final float n) {
        if (EditBismilahEntityFragment.instance == null) {
            EditBismilahEntityFragment.instance = new EditBismilahEntityFragment(editBismilahEntityFragment$IBismilahEntityCallback, resources, entity, n);
        }
        return EditBismilahEntityFragment.instance;
    }
    
    public void checkSplitEntity(final Entity entity, final float n) {
        if (entity == null) {
            return;
        }
        try {
            final RectF rect = entity.getRect();
            try {
                final float n2 = fcmpg(rect.right, n);
                final boolean b = true;
                final int n3 = -1;
                final int n4 = -8355712;
                Label_0079: {
                    if (n2 >= 0) {
                        break Label_0079;
                    }
                    this.tv_from_now.setTextColor(n4);
                    final ImageView iv_from_now = this.iv_from_now;
                    try {
                        iv_from_now.setColorFilter(n4, PorterDuff$Mode.SRC_IN);
                        this.btn_from_now.setClickable(false);
                        Label_0119: {
                            break Label_0119;
                            this.btn_from_now.setClickable(b);
                            this.tv_from_now.setTextColor(n3);
                            final ImageView iv_from_now2 = this.iv_from_now;
                            try {
                                iv_from_now2.setColorFilter(n3, PorterDuff$Mode.SRC_IN);
                                final RectF rect2 = entity.getRect();
                                try {
                                    Label_0183: {
                                        if (rect2.left <= n) {
                                            break Label_0183;
                                        }
                                        this.tv_until_now.setTextColor(n4);
                                        final ImageView iv_until_now = this.iv_until_now;
                                        try {
                                            iv_until_now.setColorFilter(n4, PorterDuff$Mode.SRC_IN);
                                            this.btn_until_now.setClickable(false);
                                            return;
                                            this.btn_until_now.setClickable(b);
                                            this.tv_until_now.setTextColor(n3);
                                            final ImageView iv_until_now2 = this.iv_until_now;
                                            try {
                                                iv_until_now2.setColorFilter(n3, PorterDuff$Mode.SRC_IN);
                                            }
                                            catch (final Exception ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        catch (final Exception ex2) {}
                                    }
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                    }
                    catch (final Exception ex5) {}
                }
            }
            catch (final Exception ex6) {}
        }
        catch (final Exception ex7) {}
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentEditEntityBinding inflate = FragmentEditEntityBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final RelativeLayout root = inflate.getRoot();
        if (this.iEditEntityCallback != null) {
            if (this.resources != null) {
                final View viewById = ((View)root).findViewById(R$id.btn_duplicate);
                final int visibility = 8;
                viewById.setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_font).setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_icon).setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_edit).setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_show_left).setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_show_right).setVisibility(visibility);
                ((View)root).findViewById(R$id.btn_cut).setVisibility(visibility);
                this.iv_from_now = (ImageView)((View)root).findViewById(R$id.iv_from_now);
                this.iv_until_now = (ImageView)((View)root).findViewById(R$id.iv_until_now);
                ((TextCustumFont)((View)root).findViewById(R$id.tv_delete)).setText((CharSequence)this.resources.getString(R$string.delete));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_color)).setText((CharSequence)this.resources.getString(R$string.color));
                ((View)root).findViewById(R$id.btn_color).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$1(this));
                (this.btnDelete = (LinearLayout)((View)root).findViewById(R$id.btn_delete)).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$2(this));
                (this.tv_from_now = (TextCustumFont)((View)root).findViewById(R$id.tv_from_now)).setText((CharSequence)this.resources.getString(R$string.from_now));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_from_the_start)).setText((CharSequence)this.resources.getString(R$string.from_the_start));
                (this.tv_until_now = (TextCustumFont)((View)root).findViewById(R$id.tv_until_now)).setText((CharSequence)this.resources.getString(R$string.until_now));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_until_the_end)).setText((CharSequence)this.resources.getString(R$string.until_the_end));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_anim)).setText((CharSequence)this.resources.getString(R$string.animtion));
                (this.btn_from_now = (LinearLayout)((View)root).findViewById(R$id.btn_from_now)).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$3(this));
                ((View)root).findViewById(R$id.btn_from_the_start).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$4(this));
                (this.btn_until_now = (LinearLayout)((View)root).findViewById(R$id.btn_until_now)).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$5(this));
                ((View)root).findViewById(R$id.btn_until_the_end).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$6(this));
                ((View)root).findViewById(R$id.btn_anim).setOnClickListener((View$OnClickListener)new EditBismilahEntityFragment$7(this));
                this.checkSplitEntity(this.entity_select, this.pos_cursur);
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.fragmentBinding = null;
        EditBismilahEntityFragment.instance = null;
        this.iEditEntityCallback = null;
        super.onDestroyView();
    }
}
