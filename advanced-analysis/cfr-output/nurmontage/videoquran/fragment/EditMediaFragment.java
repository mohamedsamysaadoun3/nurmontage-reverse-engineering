/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnScrollChangeListener
 *  android.view.ViewGroup
 *  android.widget.HorizontalScrollView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.databinding.FragmentEditMediaBinding;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$1;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$10;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$11;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$12;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$2;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$3;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$4;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$5;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$6;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$7;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$8;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$9;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class EditMediaFragment
extends Fragment {
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

    static /* bridge */ /* synthetic */ LinearLayout cfr_renamed_196(EditMediaFragment editMediaFragment) {
        return editMediaFragment.btn_cut;
    }

    static /* bridge */ /* synthetic */ EditMediaFragment$IEditMediaCallback cfr_renamed_69(EditMediaFragment editMediaFragment) {
        return editMediaFragment.iEditMediaCallback;
    }

    public EditMediaFragment() {
    }

    public EditMediaFragment(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, Resources resources, EntityAudio entityAudio, float f) {
        this.iEditMediaCallback = editMediaFragment$IEditMediaCallback;
        this.resources = resources;
        this.entity_select = entityAudio;
        this.pos_cursur = f;
    }

    public static EditMediaFragment getInstance(EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback, Resources resources, EntityAudio entityAudio, float f) {
        EditMediaFragment editMediaFragment = instance;
        if (editMediaFragment == null) {
            instance = editMediaFragment = new EditMediaFragment(editMediaFragment$IEditMediaCallback, resources, entityAudio, f);
        }
        return instance;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void checkSplit(EntityAudio var1_1, float var2_3) {
        block15: {
            if (var1_1 == null) {
                return;
            }
            this.entity_select = var1_1;
            this.updateBtn();
            var3_4 = var1_1.getRect();
            var4_5 = var3_4.left;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 > var2_3 ? 1 : -1);
            if (var5_6 > 0) ** GOTO lbl34
            var1_1 = var1_1.getRect();
            var6_7 = var1_1.right;
            var7_8 = var6_7 == var2_3 ? 0 : (var6_7 < var2_3 ? -1 : 1);
            if (var7_8 < 0) ** GOTO lbl34
            var1_1 = this.btn_cut;
            var8_9 = 1;
            var2_3 = 1.4E-45f;
            var1_1.setClickable((boolean)var8_9);
            var1_1 = this.tv_cut;
            var8_9 = -1;
            var2_3 = 0.0f / 0.0f;
            var1_1.setTextColor(var8_9);
            var1_1 = this.iv_cut;
            var3_4 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var8_9, (PorterDuff.Mode)var3_4);
            break block15;
lbl34:
            // 2 sources

            var1_1 = this.tv_cut;
            var8_10 = -8355712;
            var2_3 = 0.0f / 0.0f;
            var1_1.setTextColor(var8_10);
            var1_1 = this.iv_cut;
            var3_4 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var8_10, (PorterDuff.Mode)var3_4);
            var1_1 = this.btn_cut;
            var8_10 = 0;
            var2_3 = 0.0f;
            try {
                var1_1.setClickable(false);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void initCheckSplit(EntityAudio var1_1, float var2_3) {
        block14: {
            var3_4 = var1_1.getRect();
            var4_5 = var3_4.left;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 > var2_3 ? 1 : -1);
            if (var5_6 > 0) ** GOTO lbl30
            var1_1 = var1_1.getRect();
            var6_7 = var1_1.right;
            var7_8 = var6_7 == var2_3 ? 0 : (var6_7 < var2_3 ? -1 : 1);
            if (var7_8 < 0) ** GOTO lbl30
            var1_1 = this.btn_cut;
            var8_9 = 1;
            var2_3 = 1.4E-45f;
            var1_1.setClickable((boolean)var8_9);
            var1_1 = this.tv_cut;
            var8_9 = -1;
            var2_3 = 0.0f / 0.0f;
            var1_1.setTextColor(var8_9);
            var1_1 = this.iv_cut;
            var3_4 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var8_9, (PorterDuff.Mode)var3_4);
            break block14;
lbl30:
            // 2 sources

            var1_1 = this.tv_cut;
            var8_10 = -8355712;
            var2_3 = 0.0f / 0.0f;
            var1_1.setTextColor(var8_10);
            var1_1 = this.iv_cut;
            var3_4 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var8_10, (PorterDuff.Mode)var3_4);
            var1_1 = this.btn_cut;
            var8_10 = 0;
            var2_3 = 0.0f;
            try {
                var1_1.setClickable(false);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        float f = 0.0f;
        object3 = null;
        object = FragmentEditMediaBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditMediaBinding)object).getRoot();
        object2 = this.iEditMediaCallback;
        if (object2 != null && (object2 = this.resources) != null && (object2 = this.entity_select) != null) {
            Object object4;
            Object object5;
            int n2 = R$id.iv_cut;
            object2 = (ImageView)object.findViewById(n2);
            this.iv_cut = object2;
            n2 = R$id.view_scroll;
            object2 = (HorizontalScrollView)object.findViewById(n2);
            int n3 = R$id.btn_cut;
            this.btn_cut = object5 = (LinearLayout)object.findViewById(n3);
            object5 = this.getContext();
            n3 = MyPrefereces.getScrollX((Context)object5);
            if (n3 != 0) {
                object4 = this.getContext();
                MyPrefereces.putScrollX(object4, 0);
                object3 = new EditMediaFragment$1(this, (HorizontalScrollView)object2, n3);
                object2.post((Runnable)object3);
            }
            n = R$id.btn_show_left;
            object3 = (ImageView)object.findViewById(n);
            n3 = R$id.btn_show_right;
            object5 = (ImageView)object.findViewById(n3);
            object4 = new EditMediaFragment$2(this, (ImageView)object5, (ImageView)object3);
            object2.setOnScrollChangeListener((View.OnScrollChangeListener)object4);
            n = R$id.tv_enhance;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            int n4 = R$string.enhance;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_delete;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.delete;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_duplicate;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.duplicate;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_volume;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.volume;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_reverbe;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.reverb;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_echo;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.echo;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_fade;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.fade;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_noice;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.noice;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_speed;
            object3 = (TextCustumFont)object.findViewById(n);
            object5 = this.resources;
            n4 = R$string.speed;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.tv_cut;
            object3 = (TextCustumFont)object.findViewById(n);
            this.tv_cut = object3;
            object5 = this.resources;
            n4 = R$string.cut;
            object5 = object5.getString(n4);
            object3.setText((CharSequence)object5);
            n = R$id.btn_delete;
            object3 = object.findViewById(n);
            object5 = new EditMediaFragment$3(this);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_duplicate;
            object3 = object.findViewById(n);
            object5 = new EditMediaFragment$4(this);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_reverb;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_reverb = object3;
            object5 = new EditMediaFragment$5(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_enhance_voice;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_enhance_voice = object3;
            object5 = new EditMediaFragment$6(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_remove_noice;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_remove_noice = object3;
            object5 = new EditMediaFragment$7(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_echo;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_echo = object3;
            object5 = new EditMediaFragment$8(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_volume;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_volume = object3;
            object5 = new EditMediaFragment$9(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_fade;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_fade = object3;
            object5 = new EditMediaFragment$10(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            n = R$id.btn_speed;
            object3 = (LinearLayout)object.findViewById(n);
            this.btn_speed = object3;
            object5 = new EditMediaFragment$11(this, (HorizontalScrollView)object2);
            object3.setOnClickListener((View.OnClickListener)object5);
            object2 = this.btn_cut;
            object3 = new EditMediaFragment$12(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            this.updateBtn();
            object2 = this.entity_select;
            f = this.pos_cursur;
            this.initCheckSplit((EntityAudio)object2, f);
        }
        return object;
    }

    public void onDestroyView() {
        this.fragmentBinding = null;
        instance = null;
        this.iEditMediaCallback = null;
        super.onDestroyView();
    }

    /*
     * Unable to fully structure code
     */
    public void updateBtn() {
        block53: {
            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var1_1 = var1_1.getReverbPreset();
            var2_3 = 0;
            if (var1_1 == null) ** GOTO lbl16
            var1_1 = this.btn_reverb;
            var3_4 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var3_4);
            ** GOTO lbl19
lbl16:
            // 1 sources

            var1_1 = this.btn_reverb;
            var1_1.setBackgroundColor(0);
lbl19:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.isEnhance();
            if (var4_5 == 0) ** GOTO lbl32
            var1_1 = this.btn_enhance_voice;
            var3_4 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var3_4);
            ** GOTO lbl35
lbl32:
            // 1 sources

            var1_1 = this.btn_enhance_voice;
            var1_1.setBackgroundColor(0);
lbl35:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.isRemoveNoice();
            if (var4_5 == 0) ** GOTO lbl48
            var1_1 = this.btn_remove_noice;
            var3_4 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var3_4);
            ** GOTO lbl51
lbl48:
            // 1 sources

            var1_1 = this.btn_remove_noice;
            var1_1.setBackgroundColor(0);
lbl51:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.getDecays();
            if (var4_5 == 0) ** GOTO lbl78
            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.getDelays();
            if (var4_5 == 0) ** GOTO lbl78
            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.getVolume_echo();
            if (var4_5 == 0) ** GOTO lbl78
            var1_1 = this.btn_echo;
            var3_4 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var3_4);
            ** GOTO lbl81
lbl78:
            // 3 sources

            var1_1 = this.btn_echo;
            var1_1.setBackgroundColor(0);
lbl81:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var5_6 = var1_1.getVolume();
            var3_4 = 1065353216;
            var6_7 = 1.0f;
            var4_5 = var5_6 == var6_7 ? 0 : (var5_6 > var6_7 ? 1 : -1);
            if (var4_5 == 0) ** GOTO lbl97
            var1_1 = this.btn_volume;
            var7_8 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var7_8);
            ** GOTO lbl100
lbl97:
            // 1 sources

            var1_1 = this.btn_volume;
            var1_1.setBackgroundColor(0);
lbl100:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var5_6 = var1_1.getSpeed();
            var4_5 = var5_6 == var6_7 ? 0 : (var5_6 > var6_7 ? 1 : -1);
            if (var4_5 == 0) ** GOTO lbl114
            var1_1 = this.btn_speed;
            var3_4 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var3_4);
            ** GOTO lbl117
lbl114:
            // 1 sources

            var1_1 = this.btn_speed;
            var1_1.setBackgroundColor(0);
lbl117:
            // 2 sources

            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.getFade_in();
            if (var4_5 <= 0) ** GOTO lbl137
            var1_1 = this.entity_select;
            var1_1 = var1_1.getEffectAudio();
            var4_5 = var1_1.getFade_out();
            if (var4_5 <= 0) ** GOTO lbl137
            var1_1 = this.btn_fade;
            var2_3 = R$drawable.bg_item_effect;
            var1_1.setBackgroundResource(var2_3);
            break block53;
lbl137:
            // 2 sources

            var1_1 = this.btn_fade;
            try {
                var1_1.setBackgroundColor(0);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }
}

