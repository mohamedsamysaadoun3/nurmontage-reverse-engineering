/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 */
package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.ColorAyaFragment;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$IEditEntityCallback;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;
import hazem.nurmontage.videoquran.fragment.EditTextFragment;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$IEdiTextCallback;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$96
implements EditEntityFragment$IEditEntityCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$96(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void fromNow() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_18(this.this$0).translateFromNow();
    }

    public void fromTheStart() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_18(this.this$0).translateFromStart();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onAnim() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        EngineActivity engineActivity2 = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
        Entity entity = trackEntityView.getSelectedEntity();
        EntityView entityView = entity.getEntityView();
        QuranEntity quranEntity = (QuranEntity)entityView;
        EngineActivity engineActivity3 = this.this$0;
        TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
        trackEntityView2.updateCursurToSelectEntity();
        EngineActivity engineActivity4 = this.this$0;
        FragmentManager fragmentManager = engineActivity4.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity5 = this.this$0;
        EntityQuranTimeline entityQuranTimeline = quranEntity.getEntityQuran();
        Transition transition = entityQuranTimeline.getTransition();
        EngineActivity engineActivity6 = this.this$0;
        engineActivity6 = EngineActivity.cfr_renamed_90(engineActivity6);
        EngineActivity engineActivity7 = this.this$0;
        EffectAyaFragment$ITransition effectAyaFragment$ITransition = EngineActivity.cfr_renamed_273(engineActivity7);
        Object object = this.this$0;
        object = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
        object = ((TrackEntityView)((Object)object)).getSelectedEntity();
        object = (EntityQuranTimeline)object;
        EffectAyaFragment effectAyaFragment = EffectAyaFragment.get(transition, (Resources)engineActivity6, effectAyaFragment$ITransition, (EntityQuranTimeline)object);
        EngineActivity.cfr_renamed_70(engineActivity5, effectAyaFragment);
        int n = R$id.m_container;
        engineActivity5 = this.this$0;
        engineActivity5 = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, (Fragment)engineActivity5);
        fragmentTransaction.commit();
        EngineActivity engineActivity8 = this.this$0;
        Resources resources = EngineActivity.cfr_renamed_90(engineActivity8);
        int n2 = R$string.animtion;
        String string2 = resources.getString(n2);
        EngineActivity.cfr_renamed_274(engineActivity8, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onColor() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        EngineActivity engineActivity2 = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
        Entity entity = trackEntityView.getSelectedEntity();
        EntityView entityView = entity.getEntityView();
        QuranEntity quranEntity = (QuranEntity)entityView;
        EngineActivity engineActivity3 = this.this$0;
        TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
        trackEntityView2.updateCursurToSelectEntity();
        EngineActivity engineActivity4 = this.this$0;
        FragmentManager fragmentManager = engineActivity4.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity5 = this.this$0;
        EditEntityFragment$IEditEntityCallback editEntityFragment$IEditEntityCallback = EngineActivity.cfr_renamed_164(engineActivity5);
        EngineActivity engineActivity6 = this.this$0;
        engineActivity6 = EngineActivity.cfr_renamed_90(engineActivity6);
        ColorAyaFragment colorAyaFragment = ColorAyaFragment.getInstance(editEntityFragment$IEditEntityCallback, quranEntity, (Resources)engineActivity6);
        EngineActivity.cfr_renamed_70(engineActivity5, colorAyaFragment);
        int n = R$id.m_container;
        engineActivity5 = this.this$0;
        engineActivity5 = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, (Fragment)engineActivity5);
        fragmentTransaction.commit();
        EngineActivity engineActivity7 = this.this$0;
        Object var2_14 = null;
        EngineActivity.cfr_renamed_274(engineActivity7, null);
    }

    public void onCut() {
        block8: {
            Object object = this.this$0;
            EngineActivity.cfr_renamed_68((EngineActivity)((Object)object));
            object = this.this$0;
            Object object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
            object2 = ((TrackEntityView)((Object)object2)).getSelectedEntity();
            object2 = ((Entity)object2).getEntityView();
            object2 = (QuranEntity)object2;
            try {
                EngineActivity.cfr_renamed_275((EngineActivity)((Object)object), (QuranEntity)object2);
            }
            catch (Exception exception) {
                object = EngineActivity.cfr_renamed_73(this.this$0);
                if (object == null) break block8;
                object = EngineActivity.cfr_renamed_73(this.this$0);
                object.onEmptySelect();
            }
        }
    }

    public void onDelete() {
        block8: {
            Object object = this.this$0;
            EngineActivity.cfr_renamed_68((EngineActivity)((Object)object));
            object = this.this$0;
            object = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
            ((TrackEntityView)((Object)object)).deleteEntity(false);
            object = this.this$0;
            EngineActivity.cfr_renamed_74((EngineActivity)((Object)object));
            object = this.this$0;
            object = EngineActivity.cfr_renamed_73((EngineActivity)((Object)object));
            try {
                object.onEmptySelect();
            }
            catch (Exception exception) {
                object = EngineActivity.cfr_renamed_73(this.this$0);
                if (object == null) break block8;
                object = EngineActivity.cfr_renamed_73(this.this$0);
                object.onEmptySelect();
            }
        }
    }

    public void onDone() {
        EngineActivity.cfr_renamed_75(this.this$0);
        Object object = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
        boolean bl = object instanceof QuranEntity;
        if (bl) {
            object = EngineActivity.cfr_renamed_73(this.this$0);
            Entity entity = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
            float f = -1.0f;
            object.onSelectEntity(entity, f);
        }
    }

    public void onDuplicate() {
        block9: {
            Object object = this.this$0;
            EngineActivity.cfr_renamed_68(object);
            object = this.this$0;
            Object object2 = EngineActivity.cfr_renamed_18(object);
            object2 = ((TrackEntityView)((Object)object2)).getSelectedEntity();
            object2 = ((Entity)object2).getEntityView();
            object2 = (QuranEntity)object2;
            EngineActivity.cfr_renamed_276(object, (QuranEntity)object2);
            object = this.this$0;
            try {
                EngineActivity.cfr_renamed_74(object);
            }
            catch (Exception exception) {
                object = EngineActivity.cfr_renamed_73(this.this$0);
                if (object == null) break block9;
                object = EngineActivity.cfr_renamed_73(this.this$0);
                object.onEmptySelect();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onEdit() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        EngineActivity engineActivity2 = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
        Entity entity = trackEntityView.getSelectedEntity();
        EntityView entityView = entity.getEntityView();
        QuranEntity quranEntity = (QuranEntity)entityView;
        EngineActivity engineActivity3 = this.this$0;
        TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
        trackEntityView2.updateCursurToSelectEntity();
        EngineActivity engineActivity4 = this.this$0;
        FragmentManager fragmentManager = engineActivity4.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity5 = this.this$0;
        EditTextFragment$IEdiTextCallback editTextFragment$IEdiTextCallback = EngineActivity.cfr_renamed_277(engineActivity5);
        EditTextFragment editTextFragment = EditTextFragment.getInstance(editTextFragment$IEdiTextCallback, quranEntity);
        EngineActivity.cfr_renamed_70(engineActivity5, editTextFragment);
        int n = R$id.m_container;
        engineActivity5 = this.this$0;
        engineActivity5 = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, (Fragment)engineActivity5);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        Object var2_14 = null;
        EngineActivity.cfr_renamed_274(engineActivity6, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onFont() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        EngineActivity engineActivity2 = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
        Entity entity = trackEntityView.getSelectedEntity();
        EntityView entityView = entity.getEntityView();
        QuranEntity quranEntity = (QuranEntity)entityView;
        EngineActivity engineActivity3 = this.this$0;
        TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
        trackEntityView2.updateCursurToSelectEntity();
        EngineActivity engineActivity4 = this.this$0;
        FragmentManager fragmentManager = engineActivity4.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity5 = this.this$0;
        FontFragment$IFontCallback fontFragment$IFontCallback = EngineActivity.cfr_renamed_156(engineActivity5);
        String string2 = quranEntity.getNameFont();
        TextPaint textPaint = quranEntity.getPaintAya();
        Typeface typeface = textPaint.getTypeface();
        FontFragment fontFragment = FontFragment.getInstance(fontFragment$IFontCallback, string2, typeface);
        EngineActivity.cfr_renamed_70(engineActivity5, fontFragment);
        int n = R$id.m_container;
        engineActivity5 = this.this$0;
        engineActivity5 = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, (Fragment)engineActivity5);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        Resources resources = EngineActivity.cfr_renamed_90(engineActivity6);
        int n2 = R$string.font;
        String string3 = resources.getString(n2);
        EngineActivity.cfr_renamed_274(engineActivity6, string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onIcon() {
        EngineActivity engineActivity;
        try {
            engineActivity = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        EngineActivity.cfr_renamed_68(engineActivity);
        EngineActivity engineActivity2 = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
        Entity entity = trackEntityView.getSelectedEntity();
        EntityView entityView = entity.getEntityView();
        QuranEntity quranEntity = (QuranEntity)entityView;
        EngineActivity engineActivity3 = this.this$0;
        TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
        trackEntityView2.updateCursurToSelectEntity();
        EngineActivity engineActivity4 = this.this$0;
        FragmentManager fragmentManager = engineActivity4.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EngineActivity engineActivity5 = this.this$0;
        EditIconQuranFragment$IQuranIconCallback editIconQuranFragment$IQuranIconCallback = EngineActivity.cfr_renamed_160(engineActivity5);
        String string2 = quranEntity.getIcon();
        EditIconQuranFragment editIconQuranFragment = EditIconQuranFragment.getInstance(editIconQuranFragment$IQuranIconCallback, string2);
        EngineActivity.cfr_renamed_70(engineActivity5, editIconQuranFragment);
        int n = R$id.m_container;
        engineActivity5 = this.this$0;
        engineActivity5 = EngineActivity.cfr_renamed_71(engineActivity5);
        fragmentTransaction.replace(n, (Fragment)engineActivity5);
        fragmentTransaction.commit();
        EngineActivity engineActivity6 = this.this$0;
        Resources resources = EngineActivity.cfr_renamed_90(engineActivity6);
        int n2 = R$string.icon;
        String string3 = resources.getString(n2);
        EngineActivity.cfr_renamed_274(engineActivity6, string3);
    }

    public void untilNow() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_18(this.this$0).translateUntilNow();
    }

    public void untilTheEnd() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_18(this.this$0).translateEndNow();
    }

    public void updateAya(int n) {
        EngineActivity.cfr_renamed_64(this.this$0).setColorAya(n);
    }

    public void updatePreset(AyaTextPreset ayaTextPreset) {
        EngineActivity.cfr_renamed_64(this.this$0).setPreset(ayaTextPreset);
    }

    public void updateTrsl(int n) {
        EngineActivity.cfr_renamed_64(this.this$0).setColorTrsl(n);
    }
}

