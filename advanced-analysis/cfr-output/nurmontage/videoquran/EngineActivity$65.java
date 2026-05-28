/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.net.Uri
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.AddReaderNameActivity;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$65$1;
import hazem.nurmontage.videoquran.EngineActivity$65$2;
import hazem.nurmontage.videoquran.EngineActivity$65$3;
import hazem.nurmontage.videoquran.EngineActivity$65$4;
import hazem.nurmontage.videoquran.EngineActivity$65$5;
import hazem.nurmontage.videoquran.QuranSearchActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$IAudioCallback;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.util.List;

class EngineActivity$65
implements AddQuranFragment$IAddQuran {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$65(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onAdd(String string2, String string3, String string4, String string5, int n, int n2, String string6, int n3, int n4) {
        EngineActivity engineActivity = this.this$0;
        CharSequence charSequence = new StringBuilder();
        String string7 = string3;
        string7 = charSequence.append(string3).append(" ").append(n2).toString();
        charSequence = string2;
        EngineActivity.cfr_renamed_383(engineActivity, string2, string7, string4, string5, n, n2, string6, n3, n4);
    }

    public void onAddReaderName(String string2, String string3, Uri object) {
        EngineActivity engineActivity = this.this$0;
        boolean bl = true;
        EngineActivity.cfr_renamed_117(engineActivity, bl);
        Object object2 = this.this$0;
        Class<AddReaderNameActivity> clazz = AddReaderNameActivity.class;
        engineActivity = new Intent((Context)object2, clazz);
        object2 = "name";
        engineActivity.putExtra((String)object2, string2);
        if (object != null) {
            string2 = "audio";
            object = object.toString();
            engineActivity.putExtra(string2, (String)object);
        }
        engineActivity.putExtra("path_video_copy", string3);
        EngineActivity.cfr_renamed_384(this.this$0).launch((Object)engineActivity);
    }

    public void onAddTranslation(String string2, int n, boolean bl) {
        EngineActivity.cfr_renamed_385(this.this$0, string2, n, bl);
    }

    public void onBismilah() {
        Object object = this.this$0;
        boolean bl = EngineActivity.cfr_renamed_386((EngineActivity)((Object)object));
        Object object2 = this.this$0;
        boolean bl2 = EngineActivity.cfr_renamed_387((EngineActivity)((Object)object2));
        if (bl && bl2) {
            object = EngineActivity.cfr_renamed_18(this.this$0);
            ((TrackEntityView)((Object)object)).translateToRight();
        } else {
            object2 = EngineActivity.cfr_renamed_18(this.this$0);
            ((TrackEntityView)((Object)object2)).translateToRight(bl);
        }
    }

    public void onCancel() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void onDone(String string2, int n, String string3, Uri uri, String string4) {
        int n2;
        EngineActivity$65 engineActivity$65 = this;
        Uri uri2 = uri;
        Object object = string4;
        Object object2 = this.this$0;
        Object object3 = new EngineActivity$65$2(this);
        object2.runOnUiThread((Runnable)object3);
        EngineActivity.cfr_renamed_64(this.this$0).updateSizeAya();
        EngineActivity.cfr_renamed_64(this.this$0).updateSizeAyaTrsl();
        object3 = EngineActivity.cfr_renamed_64(this.this$0);
        int n3 = EngineActivity.cfr_renamed_64(this.this$0).getClr_aya();
        int n4 = AyaTextPreset.NONE.ordinal();
        object2 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
        if (object2 != null) {
            object2 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
            n2 = ((SurahNameEntity)object2).getStyle();
        } else {
            object2 = SurahNameStyle.NONE;
            n2 = ((Enum)object2).ordinal();
        }
        int n5 = n2;
        object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
        if (object2 != null && (n2 = (int)(((SurahNameEntity)(object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity())).isHaveBg() ? 1 : 0)) != 0) {
            n2 = 1;
        } else {
            n2 = 0;
            object2 = null;
        }
        int n6 = n2;
        object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
        if (object2 != null) {
            object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
            n2 = ((SurahNameEntity)object2).getClrBg();
        } else {
            n2 = -16777216;
        }
        float f = 1.0f;
        String string5 = "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf";
        ((BlurredImageView)((Object)object3)).setSurahNameEntity(string2, string3, null, f, string5, n3, n4, n5, n, n6 != 0, n2);
        if (object == null) {
            object = engineActivity$65.this$0;
            EngineActivity.cfr_renamed_388((EngineActivity)((Object)object), uri2);
        } else {
            object2 = engineActivity$65.this$0;
            EngineActivity.cfr_renamed_389(object2, uri2, object);
        }
    }

    public void onDone(String string2, int n, String string3, List list) {
        int n2;
        EngineActivity$65 engineActivity$65 = this;
        Object object = list;
        Object object2 = this.this$0;
        Object object3 = new EngineActivity$65$3(this);
        object2.runOnUiThread((Runnable)object3);
        EngineActivity.cfr_renamed_64(this.this$0).updateSizeAya();
        EngineActivity.cfr_renamed_64(this.this$0).updateSizeAyaTrsl();
        object3 = EngineActivity.cfr_renamed_64(this.this$0);
        int n3 = EngineActivity.cfr_renamed_64(this.this$0).getClr_aya();
        int n4 = AyaTextPreset.NONE.ordinal();
        object2 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
        if (object2 != null) {
            object2 = EngineActivity.cfr_renamed_64(this.this$0).getSurahNameEntity();
            n2 = ((SurahNameEntity)object2).getStyle();
        } else {
            object2 = SurahNameStyle.NONE;
            n2 = ((Enum)object2).ordinal();
        }
        int n5 = n2;
        object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
        if (object2 != null && (n2 = (int)(((SurahNameEntity)(object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity())).isHaveBg() ? 1 : 0)) != 0) {
            n2 = 1;
        } else {
            n2 = 0;
            object2 = null;
        }
        int n6 = n2;
        object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
        if (object2 != null) {
            object2 = EngineActivity.cfr_renamed_64(engineActivity$65.this$0).getSurahNameEntity();
            n2 = ((SurahNameEntity)object2).getClrBg();
        } else {
            n2 = -16777216;
        }
        float f = 1.0f;
        String string4 = "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf";
        ((BlurredImageView)((Object)object3)).setSurahNameEntity(string2, string3, null, f, string4, n3, n4, n5, n, n6 != 0, n2);
        object2 = engineActivity$65.this$0;
        n2 = NetworkUtils.isNetworkAvailable((Context)object2) ? 1 : 0;
        if (n2 != 0 && object != null && (n2 = (int)(list.isEmpty() ? 1 : 0)) == 0) {
            object2 = engineActivity$65.this$0;
            EngineActivity.cfr_renamed_390(object2, object);
        } else {
            object = engineActivity$65.this$0;
            object2 = new EngineActivity$65$4(this);
            object.runOnUiThread((Runnable)object2);
        }
    }

    public void onErrorLimitation() {
        EngineActivity engineActivity = this.this$0;
        EngineActivity$65$5 engineActivity$65$5 = new EngineActivity$65$5(this);
        engineActivity.runOnUiThread(engineActivity$65$5);
    }

    public void onSearch() {
        EngineActivity.cfr_renamed_117(this.this$0, true);
        EngineActivity engineActivity = this.this$0;
        Intent intent = new Intent((Context)engineActivity, QuranSearchActivity.class);
        EngineActivity.cfr_renamed_391(this.this$0).launch((Object)intent);
    }

    public void onVuCopyRight() {
        this.this$0.dialogCopyRight();
    }

    public void progress() {
        EngineActivity engineActivity = this.this$0;
        EngineActivity$65$1 engineActivity$65$1 = new EngineActivity$65$1(this);
        engineActivity.runOnUiThread(engineActivity$65$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void uploadRecitation() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        engineActivity = engineActivity.getSupportFragmentManager();
        engineActivity = engineActivity.beginTransaction();
        EngineActivity engineActivity2 = this.this$0;
        AddAudioFragment$IAudioCallback addAudioFragment$IAudioCallback = EngineActivity.cfr_renamed_197(engineActivity2);
        EngineActivity engineActivity3 = this.this$0;
        engineActivity3 = EngineActivity.cfr_renamed_90(engineActivity3);
        AddAudioFragment addAudioFragment = AddAudioFragment.getInstance(addAudioFragment$IAudioCallback, (Resources)engineActivity3);
        EngineActivity.cfr_renamed_70(engineActivity2, addAudioFragment);
        int n = R$id.m_container;
        EngineActivity engineActivity4 = this.this$0;
        Fragment fragment = EngineActivity.cfr_renamed_71(engineActivity4);
        engineActivity.replace(n, fragment);
        engineActivity.commit();
        engineActivity = this.this$0;
        Resources resources = EngineActivity.cfr_renamed_90(engineActivity);
        int n2 = R$string.audio;
        String string2 = resources.getString(n2);
        EngineActivity.cfr_renamed_274(engineActivity, string2);
    }
}

