/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.databinding.FragmentEditEntityBinding;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$1;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$10;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$11;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$12;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$13;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$2;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$3;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$4;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$5;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$6;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$7;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$8;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$9;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$IEditEntityCallback;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class EditEntityFragment
extends Fragment {
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

    static /* bridge */ /* synthetic */ LinearLayout cfr_renamed_187(EditEntityFragment editEntityFragment) {
        return editEntityFragment.btnCut;
    }

    static /* bridge */ /* synthetic */ EditEntityFragment$IEditEntityCallback cfr_renamed_164(EditEntityFragment editEntityFragment) {
        return editEntityFragment.iEditEntityCallback;
    }

    public EditEntityFragment() {
    }

    public EditEntityFragment(EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback, Resources resources, Entity entity, float f) {
        this.iEditEntityCallback = editEntityFragment$IEditEntityCallback;
        this.resources = resources;
        this.entity_select = entity;
        this.pos_cursur = f;
    }

    public static EditEntityFragment getInstance(EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback, Resources resources, Entity entity, float f) {
        EditEntityFragment editEntityFragment = instance;
        if (editEntityFragment == null) {
            instance = editEntityFragment = new EditEntityFragment(editEntityFragment$IEditEntityCallback, resources, entity, f);
        }
        return instance;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void checkIcon(Entity var1_1) {
        block14: {
            var2_3 = var1_1.getEntityView();
            var3_4 = var2_3 instanceof QuranEntity;
            if (var3_4 == 0) break block14;
            var1_1 = var1_1.getEntityView();
            var1_1 = (QuranEntity)var1_1;
            var4_5 = var1_1.getNumber();
            var3_4 = -1;
            if (var4_5 != var3_4) ** GOTO lbl29
            var1_1 = this.tv_icon;
            var3_4 = -8355712;
            var1_1.setTextColor(var3_4);
            var1_1 = this.iv_icon;
            var5_6 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var3_4, var5_6);
            var1_1 = this.btn_icon;
            var3_4 = 0;
            var2_3 = null;
            var1_1.setClickable(false);
            break block14;
lbl29:
            // 1 sources

            var1_1 = this.btn_icon;
            var6_8 = true;
            var1_1.setClickable(var6_8);
            var1_1 = this.tv_icon;
            var1_1.setTextColor(var3_4);
            var1_1 = this.iv_icon;
            var5_7 = PorterDuff.Mode.SRC_IN;
            try {
                var1_1.setColorFilter(var3_4, var5_7);
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
    public void checkSplitEntity(Entity var1_1, float var2_3) {
        block35: {
            if (var1_1 == null) {
                return;
            }
            var3_4 /* !! */  = var1_1.getRect();
            var4_5 = var3_4 /* !! */ .right;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 < var2_3 ? -1 : 1);
            var6_7 = true;
            var7_8 = -1;
            var8_9 = -8355712;
            if (var5_6 >= 0) ** GOTO lbl25
            var3_4 /* !! */  = this.tv_from_now;
            var3_4 /* !! */ .setTextColor(var8_9);
            var3_4 /* !! */  = this.iv_from_now;
            var9_10 = PorterDuff.Mode.SRC_IN;
            var3_4 /* !! */ .setColorFilter(var8_9, var9_10);
            var3_4 /* !! */  = this.btn_from_now;
            var3_4 /* !! */ .setClickable(false);
            ** GOTO lbl36
lbl25:
            // 1 sources

            var3_4 /* !! */  = this.btn_from_now;
            var3_4 /* !! */ .setClickable(var6_7);
            var3_4 /* !! */  = this.tv_from_now;
            var3_4 /* !! */ .setTextColor(var7_8);
            var3_4 /* !! */  = this.iv_from_now;
            var9_10 = PorterDuff.Mode.SRC_IN;
            var3_4 /* !! */ .setColorFilter(var7_8, var9_10);
lbl36:
            // 2 sources

            var3_4 /* !! */  = var1_1.getRect();
            var4_5 = var3_4 /* !! */ .left;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 > var2_3 ? 1 : -1);
            if (var5_6 <= 0) ** GOTO lbl54
            var3_4 /* !! */  = this.tv_until_now;
            var3_4 /* !! */ .setTextColor(var8_9);
            var3_4 /* !! */  = this.iv_until_now;
            var9_10 = PorterDuff.Mode.SRC_IN;
            var3_4 /* !! */ .setColorFilter(var8_9, var9_10);
            var3_4 /* !! */  = this.btn_until_now;
            var3_4 /* !! */ .setClickable(false);
            ** GOTO lbl65
lbl54:
            // 1 sources

            var3_4 /* !! */  = this.btn_until_now;
            var3_4 /* !! */ .setClickable(var6_7);
            var3_4 /* !! */  = this.tv_until_now;
            var3_4 /* !! */ .setTextColor(var7_8);
            var3_4 /* !! */  = this.iv_until_now;
            var9_10 = PorterDuff.Mode.SRC_IN;
            var3_4 /* !! */ .setColorFilter(var7_8, var9_10);
lbl65:
            // 2 sources

            var3_4 /* !! */  = var1_1.getRect();
            var4_5 = var3_4 /* !! */ .left;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 > var2_3 ? 1 : -1);
            if (var5_6 > 0) ** GOTO lbl89
            var1_1 = var1_1.getRect();
            var10_11 = var1_1.right;
            var11_12 = var10_11 == var2_3 ? 0 : (var10_11 < var2_3 ? -1 : 1);
            if (var11_12 < 0) ** GOTO lbl89
            var1_1 = this.btnCut;
            var1_1.setClickable(var6_7);
            var1_1 = this.tv_cut;
            var1_1.setTextColor(var7_8);
            var1_1 = this.iv_cut;
            var12_13 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var7_8, var12_13);
            break block35;
lbl89:
            // 2 sources

            var1_1 = this.tv_cut;
            var1_1.setTextColor(var8_9);
            var1_1 = this.iv_cut;
            var12_14 = PorterDuff.Mode.SRC_IN;
            var1_1.setColorFilter(var8_9, var12_14);
            var1_1 = this.btnCut;
            try {
                var1_1.setClickable(false);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        int n = 0;
        float f = 0.0f;
        object3 = null;
        object = FragmentEditEntityBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditEntityBinding)object).getRoot();
        object2 = this.iEditEntityCallback;
        if (object2 != null && (object2 = this.resources) != null) {
            int n2 = R$id.iv_cut;
            object2 = (ImageView)object.findViewById(n2);
            this.iv_cut = object2;
            n2 = R$id.iv_from_now;
            object2 = (ImageView)object.findViewById(n2);
            this.iv_from_now = object2;
            n2 = R$id.iv_until_now;
            object2 = (ImageView)object.findViewById(n2);
            this.iv_until_now = object2;
            n2 = R$id.tv_delete;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            int n3 = R$string.delete;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_cut;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_cut = object2;
            object3 = this.resources;
            n3 = R$string.cut;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_edit;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.edit;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_color;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.color;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.btn_color;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_delete;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$2(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_cut;
            object2 = (LinearLayout)object.findViewById(n2);
            this.btnCut = object2;
            object3 = new EditEntityFragment$3(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_edit;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$4(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.tv_from_now;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_from_now = object2;
            object3 = this.resources;
            n3 = R$string.from_now;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_from_the_start;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.from_the_start;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_until_now;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_until_now = object2;
            object3 = this.resources;
            n3 = R$string.until_now;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_until_the_end;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.until_the_end;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_duplicate;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.duplicate;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_font;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.font;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.tv_anim;
            object2 = (TextCustumFont)object.findViewById(n2);
            object3 = this.resources;
            n3 = R$string.animtion;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.btn_from_now;
            object2 = (LinearLayout)object.findViewById(n2);
            this.btn_from_now = object2;
            object3 = new EditEntityFragment$5(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_from_the_start;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$6(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_until_now;
            object2 = (LinearLayout)object.findViewById(n2);
            this.btn_until_now = object2;
            object3 = new EditEntityFragment$7(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_until_the_end;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$8(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_duplicate;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$9(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_font;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$10(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.tv_icon;
            object2 = (TextCustumFont)object.findViewById(n2);
            this.tv_icon = object2;
            object3 = this.resources;
            n3 = R$string.icon;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n2 = R$id.iv_icon;
            object2 = (ImageView)object.findViewById(n2);
            this.iv_icon = object2;
            n2 = R$id.btn_icon;
            object2 = (LinearLayout)object.findViewById(n2);
            this.btn_icon = object2;
            object3 = new EditEntityFragment$11(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            object2 = this.entity_select;
            this.checkIcon((Entity)object2);
            n2 = R$id.btn_anim;
            object2 = object.findViewById(n2);
            object3 = new EditEntityFragment$12(this);
            object2.setOnClickListener((View.OnClickListener)object3);
            n2 = R$id.btn_show_left;
            object2 = (ImageView)object.findViewById(n2);
            n = R$id.btn_show_right;
            object3 = (ImageView)object.findViewById(n);
            n3 = R$id.scroll_menu;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView)object.findViewById(n3);
            EditEntityFragment$13 editEntityFragment$13 = new EditEntityFragment$13(this, (ImageView)object3, (ImageView)object2);
            horizontalScrollView.setOnScrollChangeListener((View.OnScrollChangeListener)editEntityFragment$13);
            object2 = this.entity_select;
            f = this.pos_cursur;
            this.checkSplitEntity((Entity)object2, f);
        }
        return object;
    }

    public void onDestroyView() {
        this.fragmentBinding = null;
        instance = null;
        this.iEditEntityCallback = null;
        super.onDestroyView();
    }
}

