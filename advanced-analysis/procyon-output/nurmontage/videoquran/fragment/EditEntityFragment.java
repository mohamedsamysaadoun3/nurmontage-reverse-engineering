// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.RelativeLayout;
import android.view.View$OnScrollChangeListener;
import android.widget.HorizontalScrollView;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.model.EntityView;
import android.graphics.PorterDuff$Mode;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.databinding.FragmentEditEntityBinding;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class EditEntityFragment extends Fragment
{
    public static EditEntityFragment instance;
    private LinearLayout btnCut;
    private LinearLayout btn_from_now;
    private LinearLayout btn_icon;
    private LinearLayout btn_until_now;
    private Entity entity_select;
    private FragmentEditEntityBinding fragmentBinding;
    private EditEntityFragment$IEditEntityCallback iEditEntityCallback;
    private ImageView iv_cut;
    private ImageView iv_from_now;
    private ImageView iv_icon;
    private ImageView iv_until_now;
    private float pos_cursur;
    private Resources resources;
    private TextCustumFont tv_cut;
    private TextCustumFont tv_from_now;
    private TextCustumFont tv_icon;
    private TextCustumFont tv_until_now;
    
    public EditEntityFragment() {
    }
    
    public EditEntityFragment(final EditEntityFragment$IEditEntityCallback iEditEntityCallback, final Resources resources, final Entity entity_select, final float pos_cursur) {
        this.iEditEntityCallback = iEditEntityCallback;
        this.resources = resources;
        this.entity_select = entity_select;
        this.pos_cursur = pos_cursur;
    }
    
    public static EditEntityFragment getInstance(final EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback, final Resources resources, final Entity entity, final float n) {
        if (EditEntityFragment.instance == null) {
            EditEntityFragment.instance = new EditEntityFragment(editEntityFragment$IEditEntityCallback, resources, entity, n);
        }
        return EditEntityFragment.instance;
    }
    
    public void checkIcon(final Entity entity) {
        try {
            if (entity.getEntityView() instanceof QuranEntity) {
                final EntityView entityView = entity.getEntityView();
                try {
                    final QuranEntity quranEntity = (QuranEntity)entityView;
                    try {
                        final int number = quranEntity.getNumber();
                        final int textColor = -1;
                        Label_0085: {
                            if (number != textColor) {
                                break Label_0085;
                            }
                            final TextCustumFont tv_icon = this.tv_icon;
                            final int textColor2 = -8355712;
                            tv_icon.setTextColor(textColor2);
                            final ImageView iv_icon = this.iv_icon;
                            try {
                                iv_icon.setColorFilter(textColor2, PorterDuff$Mode.SRC_IN);
                                this.btn_icon.setClickable(false);
                                return;
                                this.btn_icon.setClickable(true);
                                this.tv_icon.setTextColor(textColor);
                                final ImageView iv_icon2 = this.iv_icon;
                                try {
                                    iv_icon2.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
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
    
    public void checkSplitEntity(final Entity entity, final float n) {
        if (entity == null) {
            return;
        }
        try {
            final RectF rect = entity.getRect();
            try {
                final float n2 = fcmpg(rect.right, n);
                final boolean clickable = true;
                final int textColor = -1;
                final int textColor2 = -8355712;
                Label_0079: {
                    if (n2 >= 0) {
                        break Label_0079;
                    }
                    this.tv_from_now.setTextColor(textColor2);
                    final ImageView iv_from_now = this.iv_from_now;
                    try {
                        iv_from_now.setColorFilter(textColor2, PorterDuff$Mode.SRC_IN);
                        this.btn_from_now.setClickable(false);
                        Label_0119: {
                            break Label_0119;
                            this.btn_from_now.setClickable(clickable);
                            this.tv_from_now.setTextColor(textColor);
                            final ImageView iv_from_now2 = this.iv_from_now;
                            try {
                                iv_from_now2.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
                                final RectF rect2 = entity.getRect();
                                try {
                                    Label_0183: {
                                        if (rect2.left <= n) {
                                            break Label_0183;
                                        }
                                        this.tv_until_now.setTextColor(textColor2);
                                        final ImageView iv_until_now = this.iv_until_now;
                                        try {
                                            iv_until_now.setColorFilter(textColor2, PorterDuff$Mode.SRC_IN);
                                            this.btn_until_now.setClickable(false);
                                            Label_0223: {
                                                break Label_0223;
                                                this.btn_until_now.setClickable(clickable);
                                                this.tv_until_now.setTextColor(textColor);
                                                final ImageView iv_until_now2 = this.iv_until_now;
                                                try {
                                                    iv_until_now2.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
                                                    final RectF rect3 = entity.getRect();
                                                    try {
                                                        Label_0313: {
                                                            if (rect3.left > n) {
                                                                break Label_0313;
                                                            }
                                                            final RectF rect4 = entity.getRect();
                                                            try {
                                                                if (rect4.right < n) {
                                                                    break Label_0313;
                                                                }
                                                                this.btnCut.setClickable(clickable);
                                                                this.tv_cut.setTextColor(textColor);
                                                                final ImageView iv_cut = this.iv_cut;
                                                                try {
                                                                    iv_cut.setColorFilter(textColor, PorterDuff$Mode.SRC_IN);
                                                                    return;
                                                                    this.tv_cut.setTextColor(textColor2);
                                                                    final ImageView iv_cut2 = this.iv_cut;
                                                                    try {
                                                                        iv_cut2.setColorFilter(textColor2, PorterDuff$Mode.SRC_IN);
                                                                        this.btnCut.setClickable(false);
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
                                        }
                                        catch (final Exception ex6) {}
                                    }
                                }
                                catch (final Exception ex7) {}
                            }
                            catch (final Exception ex8) {}
                        }
                    }
                    catch (final Exception ex9) {}
                }
            }
            catch (final Exception ex10) {}
        }
        catch (final Exception ex11) {}
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
                this.iv_cut = (ImageView)((View)root).findViewById(R$id.iv_cut);
                this.iv_from_now = (ImageView)((View)root).findViewById(R$id.iv_from_now);
                this.iv_until_now = (ImageView)((View)root).findViewById(R$id.iv_until_now);
                ((TextCustumFont)((View)root).findViewById(R$id.tv_delete)).setText((CharSequence)this.resources.getString(R$string.delete));
                (this.tv_cut = (TextCustumFont)((View)root).findViewById(R$id.tv_cut)).setText((CharSequence)this.resources.getString(R$string.cut));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_edit)).setText((CharSequence)this.resources.getString(R$string.edit));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_color)).setText((CharSequence)this.resources.getString(R$string.color));
                ((View)root).findViewById(R$id.btn_color).setOnClickListener((View$OnClickListener)new EditEntityFragment$1(this));
                ((View)root).findViewById(R$id.btn_delete).setOnClickListener((View$OnClickListener)new EditEntityFragment$2(this));
                (this.btnCut = (LinearLayout)((View)root).findViewById(R$id.btn_cut)).setOnClickListener((View$OnClickListener)new EditEntityFragment$3(this));
                ((View)root).findViewById(R$id.btn_edit).setOnClickListener((View$OnClickListener)new EditEntityFragment$4(this));
                (this.tv_from_now = (TextCustumFont)((View)root).findViewById(R$id.tv_from_now)).setText((CharSequence)this.resources.getString(R$string.from_now));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_from_the_start)).setText((CharSequence)this.resources.getString(R$string.from_the_start));
                (this.tv_until_now = (TextCustumFont)((View)root).findViewById(R$id.tv_until_now)).setText((CharSequence)this.resources.getString(R$string.until_now));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_until_the_end)).setText((CharSequence)this.resources.getString(R$string.until_the_end));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_duplicate)).setText((CharSequence)this.resources.getString(R$string.duplicate));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_font)).setText((CharSequence)this.resources.getString(R$string.font));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_anim)).setText((CharSequence)this.resources.getString(R$string.animtion));
                (this.btn_from_now = (LinearLayout)((View)root).findViewById(R$id.btn_from_now)).setOnClickListener((View$OnClickListener)new EditEntityFragment$5(this));
                ((View)root).findViewById(R$id.btn_from_the_start).setOnClickListener((View$OnClickListener)new EditEntityFragment$6(this));
                (this.btn_until_now = (LinearLayout)((View)root).findViewById(R$id.btn_until_now)).setOnClickListener((View$OnClickListener)new EditEntityFragment$7(this));
                ((View)root).findViewById(R$id.btn_until_the_end).setOnClickListener((View$OnClickListener)new EditEntityFragment$8(this));
                ((View)root).findViewById(R$id.btn_duplicate).setOnClickListener((View$OnClickListener)new EditEntityFragment$9(this));
                ((View)root).findViewById(R$id.btn_font).setOnClickListener((View$OnClickListener)new EditEntityFragment$10(this));
                (this.tv_icon = (TextCustumFont)((View)root).findViewById(R$id.tv_icon)).setText((CharSequence)this.resources.getString(R$string.icon));
                this.iv_icon = (ImageView)((View)root).findViewById(R$id.iv_icon);
                (this.btn_icon = (LinearLayout)((View)root).findViewById(R$id.btn_icon)).setOnClickListener((View$OnClickListener)new EditEntityFragment$11(this));
                this.checkIcon(this.entity_select);
                ((View)root).findViewById(R$id.btn_anim).setOnClickListener((View$OnClickListener)new EditEntityFragment$12(this));
                ((HorizontalScrollView)((View)root).findViewById(R$id.scroll_menu)).setOnScrollChangeListener((View$OnScrollChangeListener)new EditEntityFragment$13(this, (ImageView)((View)root).findViewById(R$id.btn_show_right), (ImageView)((View)root).findViewById(R$id.btn_show_left)));
                this.checkSplitEntity(this.entity_select, this.pos_cursur);
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.fragmentBinding = null;
        EditEntityFragment.instance = null;
        this.iEditEntityCallback = null;
        super.onDestroyView();
    }
}
