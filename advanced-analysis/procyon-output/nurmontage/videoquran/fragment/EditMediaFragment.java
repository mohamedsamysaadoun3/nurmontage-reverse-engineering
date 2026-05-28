// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.R$drawable;
import android.widget.RelativeLayout;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.R$string;
import android.view.View$OnScrollChangeListener;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import android.widget.HorizontalScrollView;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.RectF;
import android.graphics.PorterDuff$Mode;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.databinding.FragmentEditMediaBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class EditMediaFragment extends Fragment
{
    public static EditMediaFragment instance;
    private LinearLayout btn_cut;
    private LinearLayout btn_echo;
    private LinearLayout btn_enhance_voice;
    private LinearLayout btn_fade;
    private LinearLayout btn_remove_noice;
    private LinearLayout btn_reverb;
    private LinearLayout btn_speed;
    private LinearLayout btn_volume;
    private EntityAudio entity_select;
    private FragmentEditMediaBinding fragmentBinding;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private ImageView iv_cut;
    private float pos_cursur;
    private Resources resources;
    private TextCustumFont tv_cut;
    
    public EditMediaFragment() {
    }
    
    public EditMediaFragment(final EditMediaFragment$IEditMediaCallback iEditMediaCallback, final Resources resources, final EntityAudio entity_select, final float pos_cursur) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.resources = resources;
        this.entity_select = entity_select;
        this.pos_cursur = pos_cursur;
    }
    
    public static EditMediaFragment getInstance(final EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, final Resources resources, final EntityAudio entityAudio, final float n) {
        if (EditMediaFragment.instance == null) {
            EditMediaFragment.instance = new EditMediaFragment(editMediaFragment$IEditMediaCallback, resources, entityAudio, n);
        }
        return EditMediaFragment.instance;
    }
    
    public void checkSplit(final EntityAudio entity_select, float n) {
        if (entity_select == null) {
            return;
        }
        this.entity_select = entity_select;
        this.updateBtn();
        try {
            final RectF rect = entity_select.getRect();
            try {
                Label_0115: {
                    if (rect.left > n) {
                        break Label_0115;
                    }
                    final RectF rect2 = entity_select.getRect();
                    try {
                        if (rect2.right < n) {
                            break Label_0115;
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
    
    public void initCheckSplit(final EntityAudio entityAudio, float n) {
        try {
            final RectF rect = entityAudio.getRect();
            try {
                Label_0101: {
                    if (rect.left > n) {
                        break Label_0101;
                    }
                    final RectF rect2 = entityAudio.getRect();
                    try {
                        if (rect2.right < n) {
                            break Label_0101;
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
        final FragmentEditMediaBinding inflate = FragmentEditMediaBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        final RelativeLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null && this.resources != null) {
            if (this.entity_select != null) {
                this.iv_cut = (ImageView)((View)root).findViewById(R$id.iv_cut);
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView)((View)root).findViewById(R$id.view_scroll);
                this.btn_cut = (LinearLayout)((View)root).findViewById(R$id.btn_cut);
                final int scrollX = MyPrefereces.getScrollX(this.getContext());
                if (scrollX != 0) {
                    MyPrefereces.putScrollX(this.getContext(), 0);
                    horizontalScrollView.post((Runnable)new EditMediaFragment$1(this, horizontalScrollView, scrollX));
                }
                horizontalScrollView.setOnScrollChangeListener((View$OnScrollChangeListener)new EditMediaFragment$2(this, (ImageView)((View)root).findViewById(R$id.btn_show_right), (ImageView)((View)root).findViewById(R$id.btn_show_left)));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_enhance)).setText((CharSequence)this.resources.getString(R$string.enhance));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_delete)).setText((CharSequence)this.resources.getString(R$string.delete));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_duplicate)).setText((CharSequence)this.resources.getString(R$string.duplicate));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_volume)).setText((CharSequence)this.resources.getString(R$string.volume));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_reverbe)).setText((CharSequence)this.resources.getString(R$string.reverb));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_echo)).setText((CharSequence)this.resources.getString(R$string.echo));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_fade)).setText((CharSequence)this.resources.getString(R$string.fade));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_noice)).setText((CharSequence)this.resources.getString(R$string.noice));
                ((TextCustumFont)((View)root).findViewById(R$id.tv_speed)).setText((CharSequence)this.resources.getString(R$string.speed));
                (this.tv_cut = (TextCustumFont)((View)root).findViewById(R$id.tv_cut)).setText((CharSequence)this.resources.getString(R$string.cut));
                ((View)root).findViewById(R$id.btn_delete).setOnClickListener((View$OnClickListener)new EditMediaFragment$3(this));
                ((View)root).findViewById(R$id.btn_duplicate).setOnClickListener((View$OnClickListener)new EditMediaFragment$4(this));
                (this.btn_reverb = (LinearLayout)((View)root).findViewById(R$id.btn_reverb)).setOnClickListener((View$OnClickListener)new EditMediaFragment$5(this, horizontalScrollView));
                (this.btn_enhance_voice = (LinearLayout)((View)root).findViewById(R$id.btn_enhance_voice)).setOnClickListener((View$OnClickListener)new EditMediaFragment$6(this, horizontalScrollView));
                (this.btn_remove_noice = (LinearLayout)((View)root).findViewById(R$id.btn_remove_noice)).setOnClickListener((View$OnClickListener)new EditMediaFragment$7(this, horizontalScrollView));
                (this.btn_echo = (LinearLayout)((View)root).findViewById(R$id.btn_echo)).setOnClickListener((View$OnClickListener)new EditMediaFragment$8(this, horizontalScrollView));
                (this.btn_volume = (LinearLayout)((View)root).findViewById(R$id.btn_volume)).setOnClickListener((View$OnClickListener)new EditMediaFragment$9(this, horizontalScrollView));
                (this.btn_fade = (LinearLayout)((View)root).findViewById(R$id.btn_fade)).setOnClickListener((View$OnClickListener)new EditMediaFragment$10(this, horizontalScrollView));
                (this.btn_speed = (LinearLayout)((View)root).findViewById(R$id.btn_speed)).setOnClickListener((View$OnClickListener)new EditMediaFragment$11(this, horizontalScrollView));
                this.btn_cut.setOnClickListener((View$OnClickListener)new EditMediaFragment$12(this));
                this.updateBtn();
                this.initCheckSplit(this.entity_select, this.pos_cursur);
            }
        }
        return (View)root;
    }
    
    public void onDestroyView() {
        this.fragmentBinding = null;
        EditMediaFragment.instance = null;
        this.iEditMediaCallback = null;
        super.onDestroyView();
    }
    
    public void updateBtn() {
        try {
            final EntityAudio entity_select = this.entity_select;
            try {
                final EffectAudio effectAudio = entity_select.getEffectAudio();
                try {
                    Label_0038: {
                        if (effectAudio.getReverbPreset() == null) {
                            break Label_0038;
                        }
                        final LinearLayout btn_reverb = this.btn_reverb;
                        try {
                            btn_reverb.setBackgroundResource(R$drawable.bg_item_effect);
                            final EntityAudio entity_select2 = this.entity_select;
                            try {
                                final EffectAudio effectAudio2 = entity_select2.getEffectAudio();
                                try {
                                    Label_0086: {
                                        if (!effectAudio2.isEnhance()) {
                                            break Label_0086;
                                        }
                                        final LinearLayout btn_enhance_voice = this.btn_enhance_voice;
                                        try {
                                            btn_enhance_voice.setBackgroundResource(R$drawable.bg_item_effect);
                                            final EntityAudio entity_select3 = this.entity_select;
                                            try {
                                                final EffectAudio effectAudio3 = entity_select3.getEffectAudio();
                                                try {
                                                    Label_0134: {
                                                        if (!effectAudio3.isRemoveNoice()) {
                                                            break Label_0134;
                                                        }
                                                        final LinearLayout btn_remove_noice = this.btn_remove_noice;
                                                        try {
                                                            btn_remove_noice.setBackgroundResource(R$drawable.bg_item_effect);
                                                            final EntityAudio entity_select4 = this.entity_select;
                                                            try {
                                                                final EffectAudio effectAudio4 = entity_select4.getEffectAudio();
                                                                try {
                                                                    Label_0224: {
                                                                        if (effectAudio4.getDecays() == 0) {
                                                                            break Label_0224;
                                                                        }
                                                                        final EntityAudio entity_select5 = this.entity_select;
                                                                        try {
                                                                            final EffectAudio effectAudio5 = entity_select5.getEffectAudio();
                                                                            try {
                                                                                if (effectAudio5.getDelays() == 0) {
                                                                                    break Label_0224;
                                                                                }
                                                                                final EntityAudio entity_select6 = this.entity_select;
                                                                                try {
                                                                                    final EffectAudio effectAudio6 = entity_select6.getEffectAudio();
                                                                                    try {
                                                                                        if (effectAudio6.getVolume_echo() == 0) {
                                                                                            break Label_0224;
                                                                                        }
                                                                                        final LinearLayout btn_echo = this.btn_echo;
                                                                                        try {
                                                                                            btn_echo.setBackgroundResource(R$drawable.bg_item_effect);
                                                                                            final EntityAudio entity_select7 = this.entity_select;
                                                                                            try {
                                                                                                final EffectAudio effectAudio7 = entity_select7.getEffectAudio();
                                                                                                try {
                                                                                                    final float volume = effectAudio7.getVolume();
                                                                                                    final float n = 1.0f;
                                                                                                    Label_0290: {
                                                                                                        if (volume == n) {
                                                                                                            break Label_0290;
                                                                                                        }
                                                                                                        final LinearLayout btn_volume = this.btn_volume;
                                                                                                        try {
                                                                                                            btn_volume.setBackgroundResource(R$drawable.bg_item_effect);
                                                                                                            final EntityAudio entity_select8 = this.entity_select;
                                                                                                            try {
                                                                                                                final EffectAudio effectAudio8 = entity_select8.getEffectAudio();
                                                                                                                try {
                                                                                                                    Label_0345: {
                                                                                                                        if (effectAudio8.getSpeed() == n) {
                                                                                                                            break Label_0345;
                                                                                                                        }
                                                                                                                        final LinearLayout btn_speed = this.btn_speed;
                                                                                                                        try {
                                                                                                                            btn_speed.setBackgroundResource(R$drawable.bg_item_effect);
                                                                                                                            final EntityAudio entity_select9 = this.entity_select;
                                                                                                                            try {
                                                                                                                                final EffectAudio effectAudio9 = entity_select9.getEffectAudio();
                                                                                                                                try {
                                                                                                                                    Label_0414: {
                                                                                                                                        if (effectAudio9.getFade_in() <= 0) {
                                                                                                                                            break Label_0414;
                                                                                                                                        }
                                                                                                                                        final EntityAudio entity_select10 = this.entity_select;
                                                                                                                                        try {
                                                                                                                                            final EffectAudio effectAudio10 = entity_select10.getEffectAudio();
                                                                                                                                            try {
                                                                                                                                                if (effectAudio10.getFade_out() <= 0) {
                                                                                                                                                    break Label_0414;
                                                                                                                                                }
                                                                                                                                                final LinearLayout btn_fade = this.btn_fade;
                                                                                                                                                try {
                                                                                                                                                    btn_fade.setBackgroundResource(R$drawable.bg_item_effect);
                                                                                                                                                    return;
                                                                                                                                                    this.btn_fade.setBackgroundColor(0);
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
                                                                                                                            this.btn_speed.setBackgroundColor(0);
                                                                                                                        }
                                                                                                                        catch (final Exception ex6) {}
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (final Exception ex7) {}
                                                                                                            }
                                                                                                            catch (final Exception ex8) {}
                                                                                                            this.btn_volume.setBackgroundColor(0);
                                                                                                        }
                                                                                                        catch (final Exception ex9) {}
                                                                                                    }
                                                                                                }
                                                                                                catch (final Exception ex10) {}
                                                                                            }
                                                                                            catch (final Exception ex11) {}
                                                                                            this.btn_echo.setBackgroundColor(0);
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
                                                                }
                                                                catch (final Exception ex17) {}
                                                            }
                                                            catch (final Exception ex18) {}
                                                            this.btn_remove_noice.setBackgroundColor(0);
                                                        }
                                                        catch (final Exception ex19) {}
                                                    }
                                                }
                                                catch (final Exception ex20) {}
                                            }
                                            catch (final Exception ex21) {}
                                            this.btn_enhance_voice.setBackgroundColor(0);
                                        }
                                        catch (final Exception ex22) {}
                                    }
                                }
                                catch (final Exception ex23) {}
                            }
                            catch (final Exception ex24) {}
                            this.btn_reverb.setBackgroundColor(0);
                        }
                        catch (final Exception ex25) {}
                    }
                }
                catch (final Exception ex26) {}
            }
            catch (final Exception ex27) {}
        }
        catch (final Exception ex28) {}
    }
}
