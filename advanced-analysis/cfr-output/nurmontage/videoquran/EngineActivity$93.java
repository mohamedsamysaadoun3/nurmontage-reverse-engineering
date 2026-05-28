/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  androidx.activity.result.ActivityResultLauncher
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.EditS_NameActivity;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.fragment.ColorS_NameFragment;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$IEditS_Name;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;

class EngineActivity$93
implements EditS_NameFragment$IEditS_Name {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$93(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onColor(SurahNameEntity object) {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        engineActivity = this.this$0;
        engineActivity = engineActivity.getSupportFragmentManager();
        engineActivity = engineActivity.beginTransaction();
        EngineActivity engineActivity2 = this.this$0;
        EditS_NameFragment$IEditS_Name editS_NameFragment$IEditS_Name = EngineActivity.cfr_renamed_176(engineActivity2);
        EngineActivity engineActivity3 = this.this$0;
        engineActivity3 = EngineActivity.cfr_renamed_90(engineActivity3);
        ColorS_NameFragment colorS_NameFragment = ColorS_NameFragment.getInstance(editS_NameFragment$IEditS_Name, object, (Resources)engineActivity3);
        EngineActivity.cfr_renamed_70(engineActivity2, colorS_NameFragment);
        int n = R$id.m_container;
        engineActivity2 = this.this$0;
        engineActivity2 = EngineActivity.cfr_renamed_71(engineActivity2);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
        EngineActivity engineActivity4 = this.this$0;
        engineActivity = null;
        EngineActivity.cfr_renamed_274(engineActivity4, null);
    }

    public void onDone() {
        EngineActivity.cfr_renamed_129(this.this$0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onEdit(SurahNameEntity object) {
        boolean bl;
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
            bl = true;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_117(engineActivity, bl);
        EngineActivity engineActivity2 = this.this$0;
        Object object2 = EditS_NameActivity.class;
        Intent intent = new Intent((Context)engineActivity2, object2);
        String string2 = "surah_name";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        object2 = ((SurahNameEntity)object2).getName();
        intent.putExtra(string2, (String)object2);
        String string3 = "reader_name";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        object2 = ((SurahNameEntity)object2).getReader();
        intent.putExtra(string3, (String)object2);
        String string4 = "style";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        int n = ((SurahNameEntity)object2).getStyle();
        intent.putExtra(string4, n);
        String string5 = "index";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        n = ((SurahNameEntity)object2).getIndex_surah();
        intent.putExtra(string5, n);
        String string6 = "isBg";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        n = ((SurahNameEntity)object2).isHaveBg() ? 1 : 0;
        intent.putExtra(string6, n != 0);
        String string7 = "clrBg";
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_64(object2);
        object2 = ((BlurredImageView)((Object)object2)).getSurahNameEntity();
        n = ((SurahNameEntity)object2).getClrBg();
        intent.putExtra(string7, n);
        EngineActivity engineActivity3 = this.this$0;
        ActivityResultLauncher activityResultLauncher = EngineActivity.cfr_renamed_294(engineActivity3);
        activityResultLauncher.launch((Object)intent);
        EngineActivity engineActivity4 = this.this$0;
        bl = false;
        Object var3_15 = null;
        engineActivity4.overridePendingTransition(0, 0);
    }

    public void onFont(SurahNameEntity object) {
        Object object2 = this.this$0.getSupportFragmentManager().beginTransaction();
        EngineActivity engineActivity = this.this$0;
        FontFragment$IFontCallback fontFragment$IFontCallback = EngineActivity.cfr_renamed_156(engineActivity);
        String string2 = object.getNameFont();
        object = object.getPaintAya().getTypeface();
        object = FontFragment.getInstance(fontFragment$IFontCallback, string2, (Typeface)object);
        EngineActivity.cfr_renamed_70(engineActivity, (Fragment)object);
        int n = R$id.m_container;
        engineActivity = EngineActivity.cfr_renamed_71(this.this$0);
        object2.replace(n, (Fragment)engineActivity);
        object2.commit();
        object = this.this$0;
        object2 = EngineActivity.cfr_renamed_90((EngineActivity)((Object)object));
        int n2 = R$string.font;
        object2 = object2.getString(n2);
        EngineActivity.cfr_renamed_274((EngineActivity)((Object)object), (String)object2);
    }

    public void update() {
        EngineActivity.cfr_renamed_64(this.this$0).postInvalidate();
    }
}

