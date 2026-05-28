/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$60$1;
import hazem.nurmontage.videoquran.EngineActivity$60$2;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.constant.EntityAction;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;
import hazem.nurmontage.videoquran.fragment.EditTextFragment;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;

class EngineActivity$60
implements TrackEntityView$ITrimLineCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$60(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void enableRedo(boolean bl) {
        if (bl) {
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_417(engineActivity);
        } else {
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_418(engineActivity);
        }
    }

    public void enableUndo(boolean bl) {
        if (bl) {
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_419(engineActivity);
        } else {
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_420(engineActivity);
        }
    }

    public void fadeInAudio(float f) {
    }

    public void fadeOutAudio(float f) {
    }

    public void onAddStack(EntityAction entityAction) {
        EngineActivity.cfr_renamed_419(this.this$0);
    }

    public void onDelete(EntityView object) {
        object = this.this$0;
        object = EngineActivity.cfr_renamed_64((EngineActivity)((Object)object));
        ((BlurredImageView)((Object)object)).setEntity_select(null);
        object = this.this$0;
        object = EngineActivity.cfr_renamed_64((EngineActivity)((Object)object));
        object.postInvalidate();
        object = this.this$0;
        try {
            EngineActivity.cfr_renamed_75((EngineActivity)((Object)object));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onEmptySelect() {
        EngineActivity.cfr_renamed_64(this.this$0).setEntity_select(null);
        EngineActivity.cfr_renamed_64(this.this$0).postInvalidate();
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void onMove() {
    }

    public void onPlayVibration() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        EngineActivity$60$1 engineActivity$60$1 = new EngineActivity$60$1(this);
        engineActivity.runOnUiThread(engineActivity$60$1);
    }

    /*
     * Unable to fully structure code
     */
    public void onSeekPlayer(float var1_1) {
        block69: {
            var2_2 = this.this$0;
            var3_3 = 1;
            var4_4 = 1.4E-45f;
            EngineActivity.cfr_renamed_421((EngineActivity)var2_2, (boolean)var3_3);
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
            var2_2 = var2_2.getEntityListAudio();
            var2_2 = var2_2.iterator();
            while (true) {
                var3_3 = var2_2.hasNext();
                if (var3_3 == 0) break;
                var5_5 = var2_2.next();
                var5_5 = (EntityAudio)var5_5;
                var6_7 = var5_5.getMediaPlayer();
                if (var6_7 == null) continue;
                var6_7 = var5_5.getMediaPlayer();
                var7_8 = var6_7.isPlaying();
                if (var7_8 == 0) continue;
                var5_5 = var5_5.getMediaPlayer();
                try {
                    var5_5.pause();
                }
                catch (Exception var5_6) {
                    var5_6.printStackTrace();
                }
            }
            {
                var2_2 = this.this$0;
            }
            var8_9 = EngineActivity.cfr_renamed_77((EngineActivity)var2_2);
            if (var8_9 == 0) ** GOTO lbl74
            {
                catch (Exception v0) {
                    ** continue;
                }
            }
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_284((EngineActivity)var2_2);
            if (var2_2 == null) ** GOTO lbl58
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_284((EngineActivity)var2_2);
            var3_3 = R$drawable.play_btn;
            var2_2.setImageResource(var3_3);
lbl58:
            // 2 sources

            var2_2 = this.this$0;
            var3_3 = 0;
            var4_4 = 0.0f;
            var5_5 = null;
            EngineActivity.cfr_renamed_78((EngineActivity)var2_2, false);
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
            var2_2.setPlaying(false);
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_64((EngineActivity)var2_2);
            var2_2.setPlaying(false);
lbl74:
            // 2 sources

            var2_2 = this.this$0;
            var2_2.pauseTimelineAnimation();
            var2_2 = this.this$0;
            var2_2.stop();
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
            var9_10 = var2_2.getSecond_in_screen();
            var1_1 /= var9_10;
            var8_9 = -998637568;
            var9_10 = -1000.0f;
            var1_1 *= var9_10;
            var1_1 = Math.abs(var1_1);
            var10_11 = Math.round(var1_1);
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_64((EngineActivity)var2_2);
            if (var2_2 == null) ** GOTO lbl137
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
            var8_9 = var2_2.getMaxTime();
            var3_3 = 1065353216;
            var4_4 = 1.0f;
            if (var10_11 <= var8_9) break block69;
            var2_2 = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_64((EngineActivity)var2_2);
            var9_10 = var2_2.getProgress();
            var8_9 = var9_10 == var4_4 ? 0 : (var9_10 < var4_4 ? -1 : 1);
            if (var8_9 >= 0) ** GOTO lbl137
        }
        var9_10 = var10_11;
        var6_7 = this.this$0;
        var6_7 = EngineActivity.cfr_renamed_18((EngineActivity)var6_7);
        var7_8 = var6_7.getMaxTime();
        var11_12 = var7_8;
        var9_10 /= var11_12;
        var9_10 = Math.min(var4_4, var9_10);
        var5_5 = this.this$0;
        var12_13 = var10_11;
        EngineActivity.cfr_renamed_74(var5_5, var12_13);
        var5_5 = this.this$0;
        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
        var5_5.setProgress(var9_10);
lbl137:
        // 3 sources

        var2_2 = this.this$0;
        var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var2_2);
        var2_2.update_current_cursur_position(var10_11);
        var14_14 = this.this$0;
        var15_15 = System.currentTimeMillis();
        var8_9 = (int)var15_15;
        EngineActivity.cfr_renamed_283(var14_14, var8_9);
        var14_14 = this.this$0;
        var2_2 = EngineActivity.cfr_renamed_18(var14_14);
        var8_9 = var2_2.getCurrent_cursur_position();
        EngineActivity.cfr_renamed_79(var14_14, var8_9);
        var14_14 = this.this$0;
        var2_2 = EngineActivity.cfr_renamed_18(var14_14);
        var8_9 = var2_2.getMaxTime();
        var5_5 = this.this$0;
        var5_5 = EngineActivity.cfr_renamed_18(var5_5);
        var3_3 = var5_5.getCurrent_cursur_position();
        var14_14.updateViewTime(var8_9, var3_3);
        var14_14 = this.this$0;
        EngineActivity.cfr_renamed_292(var14_14);
        var14_14 = this.this$0;
        EngineActivity.cfr_renamed_54(var14_14);
        var14_14 = this.this$0;
        EngineActivity.cfr_renamed_53(var14_14);
        var14_14 = this.this$0;
        EngineActivity.cfr_renamed_422(var14_14);
lbl180:
        // 2 sources

    }

    public void onSelectEntity(Entity object, float f) {
        Object object2 = this.this$0;
        EngineActivity.cfr_renamed_68(object2);
        boolean bl = object instanceof EntityQuranTimeline;
        if (bl) {
            object2 = EngineActivity.cfr_renamed_64(this.this$0);
            EntityView entityView = ((Entity)object).getEntityView();
            ((BlurredImageView)((Object)object2)).setEntity_select(entityView);
            EngineActivity.cfr_renamed_64(this.this$0).invalidate();
            object2 = EditEntityFragment.instance;
            if (object2 != null) {
                object2 = EditEntityFragment.instance;
                float f2 = -EngineActivity.cfr_renamed_18(this.this$0).getCurrentPosition();
                ((EditEntityFragment)((Object)object2)).checkSplitEntity((Entity)object, f2);
                EditEntityFragment.instance.checkIcon((Entity)object);
                return;
            }
            object2 = EditTextFragment.instance;
            if (object2 != null) {
                object2 = EditTextFragment.instance;
                object = ((EntityQuranTimeline)object).getQuranEntity();
                ((EditTextFragment)((Object)object2)).update((QuranEntity)object);
                return;
            }
            object2 = this.this$0;
            EngineActivity.cfr_renamed_423(object2, (Entity)object);
        } else {
            bl = object instanceof EntityTrslTimeline;
            if (bl) {
                object2 = EngineActivity.cfr_renamed_64(this.this$0);
                EntityView entityView = ((Entity)object).getEntityView();
                ((BlurredImageView)((Object)object2)).setEntity_select(entityView);
                EngineActivity.cfr_renamed_64(this.this$0).invalidate();
                object2 = EditTrslEntityFragment.instance;
                if (object2 != null) {
                    object2 = EditTrslEntityFragment.instance;
                    float f3 = -EngineActivity.cfr_renamed_18(this.this$0).getCurrentPosition();
                    ((EditTrslEntityFragment)((Object)object2)).checkSplitEntity((Entity)object, f3);
                    return;
                }
                object2 = this.this$0;
                EngineActivity.cfr_renamed_424(object2, (Entity)object);
            } else {
                bl = object instanceof EntityBismilahTimeline;
                if (bl) {
                    object2 = EngineActivity.cfr_renamed_64(this.this$0);
                    EntityView entityView = ((Entity)object).getEntityView();
                    ((BlurredImageView)((Object)object2)).setEntity_select(entityView);
                    EngineActivity.cfr_renamed_64(this.this$0).invalidate();
                    object2 = this.this$0;
                    EngineActivity.cfr_renamed_425(object2, (Entity)object);
                } else {
                    bl = object instanceof EntityAudio;
                    if (bl) {
                        object = (EntityAudio)object;
                        object2 = EditMediaFragment.instance;
                        if (object2 != null) {
                            object2 = EditMediaFragment.instance;
                            float f4 = -EngineActivity.cfr_renamed_18(this.this$0).getCurrentPosition();
                            ((EditMediaFragment)((Object)object2)).checkSplit((EntityAudio)object, f4);
                            return;
                        }
                        object2 = this.this$0;
                        EngineActivity.cfr_renamed_426(object2, (EntityAudio)object);
                    }
                }
            }
        }
    }

    public void onSelectMultiple(int n) {
        EngineActivity.cfr_renamed_427(this.this$0, n);
    }

    public void onUp() {
        EngineActivity.cfr_renamed_421(this.this$0, false);
        EngineActivity.cfr_renamed_292(this.this$0);
    }

    public void onUpdate() {
        BlurredImageView blurredImageView = EngineActivity.cfr_renamed_64(this.this$0);
        if (blurredImageView != null) {
            blurredImageView = EngineActivity.cfr_renamed_64(this.this$0);
            blurredImageView.postInvalidate();
        }
    }

    public void onUpdatePlayerAudio(EntityAudio entityAudio) {
    }

    public void onUpdateTime() {
        EngineActivity engineActivity = this.this$0;
        int n = EngineActivity.cfr_renamed_18(engineActivity).getCurrent_cursur_position();
        EngineActivity.cfr_renamed_79(engineActivity, n);
        EngineActivity.cfr_renamed_74(this.this$0);
    }

    public void pause() {
        EngineActivity.cfr_renamed_68(this.this$0);
    }

    public void progress(boolean bl) {
        EngineActivity engineActivity = this.this$0;
        EngineActivity$60$2 engineActivity$60$2 = new EngineActivity$60$2(this, bl);
        engineActivity.runOnUiThread(engineActivity$60$2);
    }
}

