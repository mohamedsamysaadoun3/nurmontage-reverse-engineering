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
 *  android.view.ViewGroup
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.databinding.FragmentEditMediaMultipleBinding;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment$1;
import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment$IEditMultipleCallback;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class EditMultipleEntityFragment
extends Fragment {
    public static EditMultipleEntityFragment instance;
    private LinearLayout btn_cut;
    private int count_select;
    private FragmentEditMediaMultipleBinding fragmentBinding;
    private EditMultipleEntityFragment$IEditMultipleCallback iEditMediaCallback;
    private ImageView iv_cut;
    private Resources resources;
    private TextCustumFont tv_cut;
    private TextCustumFont tv_delete;

    static /* bridge */ /* synthetic */ EditMultipleEntityFragment$IEditMultipleCallback cfr_renamed_69(EditMultipleEntityFragment editMultipleEntityFragment) {
        return editMultipleEntityFragment.iEditMediaCallback;
    }

    public EditMultipleEntityFragment() {
    }

    public EditMultipleEntityFragment(EditMultipleEntityFragment$IEditMultipleCallback editMultipleEntityFragment$IEditMultipleCallback, Resources resources, int n) {
        this.iEditMediaCallback = editMultipleEntityFragment$IEditMultipleCallback;
        this.resources = resources;
        this.count_select = n;
    }

    public static EditMultipleEntityFragment getInstance(EditMultipleEntityFragment$IEditMultipleCallback editMultipleEntityFragment$IEditMultipleCallback, Resources resources, int n) {
        EditMultipleEntityFragment editMultipleEntityFragment = instance;
        if (editMultipleEntityFragment == null) {
            instance = editMultipleEntityFragment = new EditMultipleEntityFragment(editMultipleEntityFragment$IEditMultipleCallback, resources, n);
        }
        return instance;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void checkSplit(Entity var1_1, float var2_3) {
        block15: {
            if (var1_1 == null) {
                return;
            }
            var3_4 = var1_1.getRect();
            var4_5 = var3_4.left;
            var5_6 = var4_5 == var2_3 ? 0 : (var4_5 > var2_3 ? 1 : -1);
            if (var5_6 > 0) ** GOTO lbl32
            var1_1 = var1_1.getRect();
            var6_7 = var1_1.right;
            var7_8 = var6_7 == var2_3 ? 0 : (var6_7 < var2_3 ? -1 : 1);
            if (var7_8 < 0) ** GOTO lbl32
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
lbl32:
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
        object3 = null;
        object = FragmentEditMediaMultipleBinding.inflate((LayoutInflater)object, object2, false);
        this.fragmentBinding = object;
        object = ((FragmentEditMediaMultipleBinding)object).getRoot();
        object2 = this.iEditMediaCallback;
        if (object2 != null && (object2 = this.resources) != null) {
            int n = R$id.iv_cut;
            object2 = (ImageView)object.findViewById(n);
            this.iv_cut = object2;
            object3 = PorterDuff.Mode.SRC_IN;
            int n2 = -8355712;
            object2.setColorFilter(n2, (PorterDuff.Mode)object3);
            n = R$id.tv_delete;
            object2 = (TextCustumFont)object.findViewById(n);
            this.tv_delete = object2;
            object3 = this.resources;
            int n3 = R$string.delete;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            n = R$id.tv_cut;
            object2 = (TextCustumFont)object.findViewById(n);
            this.tv_cut = object2;
            object3 = this.resources;
            n3 = R$string.cut;
            object3 = object3.getString(n3);
            object2.setText((CharSequence)object3);
            this.tv_cut.setTextColor(n2);
            n = R$id.btn_delete;
            object2 = object.findViewById(n);
            object3 = new EditMultipleEntityFragment$1(this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        return object;
    }

    public void onDestroyView() {
        this.fragmentBinding = null;
        instance = null;
        this.iEditMediaCallback = null;
        super.onDestroyView();
    }

    public void setCount_select(int n) {
    }
}

