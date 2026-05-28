/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$AnimatorListener;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.RemoveNoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.SpeedFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$37
implements SmoothTimelineAnimator$AnimatorListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$maxTime;
    final /* synthetic */ float val$timeLineW;

    EngineActivity$37(EngineActivity engineActivity, int n, float f, EntityAudio entityAudio) {
        this.this$0 = engineActivity;
        this.val$maxTime = n;
        this.val$timeLineW = f;
        this.val$entityAudio = entityAudio;
    }

    public void onEnd() {
        Object object = this.this$0;
        boolean bl = EngineActivity.cfr_renamed_77(object);
        if (bl) {
            Object object2;
            int n;
            block16: {
                EngineActivity.cfr_renamed_78(this.this$0, false);
                object = EngineActivity.cfr_renamed_18(this.this$0);
                n = EngineActivity.cfr_renamed_77(this.this$0);
                ((TrackEntityView)((Object)object)).setPlaying(n != 0);
                object = EngineActivity.cfr_renamed_64(this.this$0);
                object2 = this.this$0;
                n = EngineActivity.cfr_renamed_77((EngineActivity)((Object)object2));
                ((BlurredImageView)((Object)object)).setPlaying(n != 0);
                object = this.this$0;
                object.stop();
                object = this.val$entityAudio;
                object = ((EntityAudio)object).getMediaPlayer();
                if (object == null) break block16;
                object = this.val$entityAudio;
                object = ((EntityAudio)object).getMediaPlayer();
                bl = object.isPlaying();
                if (!bl) break block16;
                object = this.val$entityAudio;
                object = ((EntityAudio)object).getMediaPlayer();
                try {
                    object.pause();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            object = this.this$0;
            object2 = EngineActivity.cfr_renamed_18(object);
            n = ((TrackEntityView)((Object)object2)).getCurrent_cursur_position();
            EngineActivity.cfr_renamed_79(object, n);
        }
        if ((object = VolumeFragment.instance) != null) {
            object = VolumeFragment.instance;
            ((VolumeFragment)((Object)object)).updateButton();
        }
        if ((object = SpeedFragment.instance) != null) {
            object = SpeedFragment.instance;
            ((SpeedFragment)((Object)object)).updateButton();
        }
        if ((object = FadeInOutFragment.instance) != null) {
            object = FadeInOutFragment.instance;
            ((FadeInOutFragment)((Object)object)).updateButton();
        }
        if ((object = EchoEffectFragment.instance) != null) {
            object = EchoEffectFragment.instance;
            ((EchoEffectFragment)((Object)object)).updateButton();
        }
        if ((object = EnhanceVoiceFragment.instance) != null) {
            object = EnhanceVoiceFragment.instance;
            ((EnhanceVoiceFragment)((Object)object)).updateButton();
        }
        if ((object = RemoveNoiceFragment.instance) != null) {
            object = RemoveNoiceFragment.instance;
            ((RemoveNoiceFragment)((Object)object)).updateButton();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onUpdate(int var1_1) {
        block35: {
            block34: {
                var2_2 /* !! */  = this.this$0;
                var3_3 = EngineActivity.cfr_renamed_77(var2_2 /* !! */ );
                if (var3_3 == 0) break block35;
                if (var1_1 == 0) {
                    return;
                }
                var4_4 = var1_1;
                var5_5 = this.val$maxTime;
                var6_6 = var5_5;
                var4_4 /= var6_6;
                var7_7 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */  = this.this$0;
                    var8_8 = var1_1;
                    EngineActivity.cfr_renamed_74((EngineActivity)var7_7 /* !! */ , var8_8);
                    var7_7 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                    var7_7 /* !! */ .setProgress(var4_4);
                }
                var7_7 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                var10_9 = this.val$timeLineW;
                var7_7 /* !! */ .updateCursur(var4_4 *= var10_9);
                var2_2 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                var2_2 /* !! */ .setCurrent_cursur_position(var1_1);
                var11_10 = this.val$entityAudio;
                var11_10 = var11_10.getMediaPlayer();
                if (var11_10 == null) break block34;
                var11_10 = this.val$entityAudio;
                var11_10 = var11_10.getMediaPlayer();
                var1_1 = (int)var11_10.isPlaying();
                if (var1_1 != 0) break block34;
                var11_10 = this.this$0;
                var11_10 = EngineActivity.cfr_renamed_18((EngineActivity)var11_10);
                var12_12 = var11_10.getCurrentPosition();
                var2_2 /* !! */  = this.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_18(var2_2 /* !! */ );
                var4_4 = var2_2 /* !! */ .getSecond_in_screen();
                var12_12 /= var4_4;
                var3_3 = 1148846080;
                var4_4 = 1000.0f;
                var12_12 *= var4_4;
                var1_1 = Math.round(var12_12);
                var1_1 = Math.abs(var1_1);
                var12_12 = var1_1;
                var7_7 /* !! */  = this.val$entityAudio;
                var7_7 /* !! */  = var7_7 /* !! */ .getRect();
                var6_6 = var7_7 /* !! */ .left;
                var13_13 = this.this$0;
                var13_13 = EngineActivity.cfr_renamed_18((EngineActivity)var13_13);
                var10_9 = var13_13.getSecond_in_screen();
                var6_6 = var6_6 / var10_9 * var4_4;
                var3_3 = Math.round(var6_6);
                var3_3 = Math.abs(var3_3);
                var4_4 = var3_3;
                var12_12 -= var4_4;
                var2_2 /* !! */  = this.val$entityAudio;
                var4_4 = var2_2 /* !! */ .getStart();
                var1_1 = (int)(var12_12 += var4_4);
                var2_2 /* !! */  = this.val$entityAudio;
                var2_2 /* !! */  = var2_2 /* !! */ .getMediaPlayer();
                var3_3 = var2_2 /* !! */ .getDuration();
                if (var1_1 > var3_3) ** GOTO lbl92
                var2_2 /* !! */  = this.val$entityAudio;
                var2_2 /* !! */  = var2_2 /* !! */ .getMediaPlayer();
                var2_2 /* !! */ .seekTo(var1_1);
lbl92:
                // 2 sources

                var11_10 = this.val$entityAudio;
                var11_10 = var11_10.getMediaPlayer();
                try {
                    var11_10.start();
                }
                catch (Exception var11_11) {
                    var11_11.printStackTrace();
                }
            }
            var11_10 = this.this$0;
            var2_2 /* !! */  = EngineActivity.cfr_renamed_18((EngineActivity)var11_10);
            var3_3 = var2_2 /* !! */ .getCurrent_cursur_position();
            var11_10.updateStartViewTime(var3_3);
        }
    }
}

