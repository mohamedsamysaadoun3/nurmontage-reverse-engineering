/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.BlurredImageView$IViewCallback;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;

class EngineActivity$25
implements BlurredImageView$IViewCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$25(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onDrawFinish() {
    }

    public void onEmtyClick() {
        EngineActivity.cfr_renamed_73(this.this$0).onEmptySelect();
    }

    public void onEndMove() {
        Object object = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
        if (object != null) {
            object = EngineActivity.cfr_renamed_64(this.this$0);
            EntityView entityView = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            float f = entityView.getFactor_scale();
            RectF rectF = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select().getRect();
            EntityView entityView2 = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            int n = entityView2.getMax_w();
            EntityView entityView3 = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            int n2 = entityView3.getMax_h();
            ((BlurredImageView)((Object)object)).applyAll(f, rectF, n, n2);
        }
    }

    public void onEndScale() {
        Object object = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
        if (object != null) {
            object = EngineActivity.cfr_renamed_64(this.this$0);
            EntityView entityView = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            float f = entityView.getFactor_scale();
            RectF rectF = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select().getRect();
            EntityView entityView2 = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            int n = entityView2.getMax_w();
            EntityView entityView3 = EngineActivity.cfr_renamed_64(this.this$0).getEntity_select();
            int n2 = entityView3.getMax_h();
            ((BlurredImageView)((Object)object)).applyAll(f, rectF, n, n2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void onSelect(EntityView object) {
        boolean bl = object instanceof SurahNameEntity;
        if (bl) {
            try {
                object = EditS_NameFragment.instance;
                if (object != null) {
                    return;
                }
            }
            catch (Exception exception) {
                return;
            }
            {
                object = this.this$0;
            }
            {
                EngineActivity.cfr_renamed_68((EngineActivity)((Object)object));
                object = this.this$0;
            }
            {
                EngineActivity.cfr_renamed_129((EngineActivity)((Object)object));
                return;
            }
        }
        bl = object instanceof QuranEntity;
        boolean bl2 = true;
        if (bl) {
            Object object2 = EngineActivity.cfr_renamed_18(this.this$0);
            EntityQuranTimeline entityQuranTimeline = ((EntityView)object).getEntityQuran();
            ((TrackEntityView)((Object)object2)).selectEntity(entityQuranTimeline, bl2);
            object2 = EngineActivity.cfr_renamed_73(this.this$0);
            object = ((EntityView)object).getEntityQuran();
            object2.onSelectEntity((Entity)object, 0.0f);
            return;
        }
        bl = object instanceof BismilahEntity;
        if (bl) {
            object = ((BismilahEntity)object).getBismilahTimeline();
            EngineActivity.cfr_renamed_18(this.this$0).selectEntity((Entity)object, bl2);
            TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = EngineActivity.cfr_renamed_73(this.this$0);
            trackEntityView$ITrimLineCallback.onSelectEntity((Entity)object, 0.0f);
            return;
        }
        bl = object instanceof TranslationQuranEntity;
        if (!bl) return;
        Object object3 = EngineActivity.cfr_renamed_18(this.this$0);
        EntityTrslTimeline entityTrslTimeline = ((EntityView)object).getEntityTrslTimeline();
        ((TrackEntityView)((Object)object3)).selectEntity(entityTrslTimeline, bl2);
        object3 = EngineActivity.cfr_renamed_73(this.this$0);
        object = ((EntityView)object).getEntityTrslTimeline();
        object3.onSelectEntity((Entity)object, 0.0f);
    }

    public void onSquare() {
    }

    public void onWattermark() {
        this.this$0.dialogWatermark();
    }
}

