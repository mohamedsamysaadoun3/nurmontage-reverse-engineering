/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.util.Log
 */
package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.util.Log;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$AnimatorListener;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;

class EngineActivity$36
implements SmoothTimelineAnimator$AnimatorListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$maxTime;
    final /* synthetic */ float val$timeLineW;

    EngineActivity$36(EngineActivity engineActivity, int n, float f) {
        this.this$0 = engineActivity;
        this.val$maxTime = n;
        this.val$timeLineW = f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onEnd() {
        block23: {
            block22: {
                var1_1 /* !! */  = this.this$0;
                var2_3 = EngineActivity.cfr_renamed_77(var1_1 /* !! */ );
                if (!var2_3) break block23;
                var1_1 /* !! */  = this.this$0;
                var3_4 = 0;
                EngineActivity.cfr_renamed_78(var1_1 /* !! */ , false);
                var1_1 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                var4_5 = EngineActivity.cfr_renamed_77(this.this$0);
                var1_1 /* !! */ .setPlaying((boolean)var4_5);
                var1_1 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                var4_5 = EngineActivity.cfr_renamed_77(this.this$0);
                var1_1 /* !! */ .setPlaying((boolean)var4_5);
                this.this$0.stop();
                var1_1 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                var4_5 = EngineActivity.cfr_renamed_18(this.this$0).getMaxTime();
                var1_1 /* !! */ .setCurrent_cursur_position(var4_5);
                var1_1 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                var5_6 = EngineActivity.cfr_renamed_18(this.this$0);
                var4_5 = var5_6.getMaxTime();
                var1_1 /* !! */ .updateCursur(var4_5);
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_282(var1_1 /* !! */ );
                if (var1_1 /* !! */  == null) ** GOTO lbl50
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_282(var1_1 /* !! */ );
                var1_1 /* !! */  = var1_1 /* !! */ .getMediaPlayer();
                if (var1_1 /* !! */  == null) ** GOTO lbl50
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_282(var1_1 /* !! */ );
                var1_1 /* !! */  = var1_1 /* !! */ .getMediaPlayer();
                var2_3 = var1_1 /* !! */ .isPlaying();
                if (!var2_3) ** GOTO lbl50
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_282(var1_1 /* !! */ );
                var1_1 /* !! */  = var1_1 /* !! */ .getMediaPlayer();
                var1_1 /* !! */ .pause();
lbl50:
                // 4 sources

                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_144(var1_1 /* !! */ );
                if (var1_1 /* !! */  == null) break block22;
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_144(var1_1 /* !! */ );
                var2_3 = var1_1 /* !! */ .isPlaying();
                if (!var2_3) break block22;
                var1_1 /* !! */  = this.this$0;
                var1_1 /* !! */  = EngineActivity.cfr_renamed_144(var1_1 /* !! */ );
                try {
                    var1_1 /* !! */ .pause();
                }
                catch (Exception var1_2) {
                    var1_2.printStackTrace();
                }
            }
            EngineActivity.cfr_renamed_79(this.this$0, 0);
            EngineActivity.cfr_renamed_283(this.this$0, 0);
            var1_1 /* !! */  = EngineActivity.cfr_renamed_284(this.this$0);
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */  = EngineActivity.cfr_renamed_284(this.this$0);
                var3_4 = R$drawable.play_btn;
                var1_1 /* !! */ .setImageResource(var3_4);
            }
            EngineActivity.cfr_renamed_53(this.this$0);
            var1_1 /* !! */  = this.this$0;
            EngineActivity.cfr_renamed_54(var1_1 /* !! */ );
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onUpdate(int var1_1) {
        block76: {
            block74: {
                block75: {
                    var2_2 = "";
                    var3_3 /* !! */  = this.this$0;
                    var4_4 = EngineActivity.cfr_renamed_77(var3_3 /* !! */ );
                    if (!var4_4) break block76;
                    if (var1_1 == 0) {
                        return;
                    }
                    var5_5 = var1_1;
                    var6_6 = this.val$maxTime;
                    var7_7 = var6_6;
                    var5_5 /= var7_7;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                    if (var8_8 /* !! */  != null) {
                        var8_8 /* !! */  = this.this$0;
                        var9_9 = var1_1;
                        EngineActivity.cfr_renamed_74((EngineActivity)var8_8 /* !! */ , var9_9);
                        var8_8 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                        var8_8 /* !! */ .setProgress(var5_5);
                    }
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                    var11_10 = this.val$timeLineW;
                    var8_8 /* !! */ .updateCursur(var5_5 *= var11_10);
                    EngineActivity.cfr_renamed_18(this.this$0).setCurrent_cursur_position(var1_1);
                    var12_11 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                    var13_13 = var12_11 /* !! */ .getCurrentPosition();
                    var3_3 /* !! */  = EngineActivity.cfr_renamed_18(this.this$0);
                    var5_5 = var3_3 /* !! */ .getSecond_in_screen();
                    var13_13 /= var5_5;
                    var4_4 = 1148846080 != 0;
                    var5_5 = 1000.0f;
                    var1_1 = Math.abs(Math.round(var13_13 * var5_5));
                    var13_13 = var1_1;
                    var8_8 /* !! */  = this.this$0;
                    var7_7 = EngineActivity.cfr_renamed_285((EngineActivity)var8_8 /* !! */ );
                    var6_6 = var13_13 == var7_7 ? 0 : (var13_13 > var7_7 ? 1 : -1);
                    if (var6_6 > 0) {
                        var8_8 /* !! */  = this.this$0;
                        var14_14 = 0;
                        var11_10 = 0.0f;
                        var15_15 = null;
                        EngineActivity.cfr_renamed_286((EngineActivity)var8_8 /* !! */ , null);
                    }
                    if ((var8_8 /* !! */  = EngineActivity.cfr_renamed_282(this.this$0)) == null) {
                        var8_8 /* !! */  = this.this$0;
                        for (var6_6 = EngineActivity.cfr_renamed_287((EngineActivity)var8_8 /* !! */ ); var6_6 < (var14_14 = (var15_15 = EngineActivity.cfr_renamed_18(this.this$0).getEntityListAudio()).size()); ++var6_6) {
                            var15_15 = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getEntityListAudio().get(var6_6);
                            var16_16 = var15_15.visible();
                            if (var16_16 == 0 || (var16_16 = var15_15.isVisible()) == 0) continue;
                            EngineActivity.cfr_renamed_286(this.this$0, (EntityAudio)var15_15);
                            var15_15 = this.this$0;
                            var17_17 = EngineActivity.cfr_renamed_282((EngineActivity)var15_15).getRect();
                            var18_18 = var17_17.right;
                            var19_19 = EngineActivity.cfr_renamed_18(this.this$0);
                            var20_20 = var19_19.getSecond_in_screen();
                            var18_18 = var18_18 / var20_20 * var5_5;
                            var16_16 = Math.round(var18_18);
                            EngineActivity.cfr_renamed_288((EngineActivity)var15_15, var16_16);
                            var15_15 = this.this$0;
                            EngineActivity.cfr_renamed_289((EngineActivity)var15_15, var6_6);
                            break;
                        }
                    }
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_282((EngineActivity)var8_8 /* !! */ );
                    if (var8_8 /* !! */  == null) ** GOTO lbl197
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_290((EngineActivity)var8_8 /* !! */ );
                    var15_15 = this.this$0;
                    var15_15 = EngineActivity.cfr_renamed_282((EngineActivity)var15_15);
                    if (var8_8 /* !! */  == var15_15) ** GOTO lbl90
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                    if (var8_8 /* !! */  == null) ** GOTO lbl90
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                    var6_6 = (int)var8_8 /* !! */ .isPlaying();
                    if (var6_6 == 0) ** GOTO lbl90
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                    var8_8 /* !! */ .pause();
lbl90:
                    // 4 sources

                    var8_8 /* !! */  = this.this$0;
                    var15_15 = EngineActivity.cfr_renamed_282((EngineActivity)var8_8 /* !! */ );
                    var15_15 = var15_15.getMediaPlayer();
                    EngineActivity.cfr_renamed_143((EngineActivity)var8_8 /* !! */ , (MediaPlayer)var15_15);
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                    if (var8_8 /* !! */  == null) break block74;
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                    var6_6 = (int)var8_8 /* !! */ .isPlaying();
                    if (var6_6 != 0) break block74;
                    var8_8 /* !! */  = this.this$0;
                    var15_15 = EngineActivity.cfr_renamed_282((EngineActivity)var8_8 /* !! */ );
                    EngineActivity.cfr_renamed_291((EngineActivity)var8_8 /* !! */ , (EntityAudio)var15_15);
                    var8_8 /* !! */  = this.this$0;
                    var8_8 /* !! */  = EngineActivity.cfr_renamed_282((EngineActivity)var8_8 /* !! */ );
                    var8_8 /* !! */  = var8_8 /* !! */ .getRect();
                    var7_7 = var8_8 /* !! */ .left;
                    var15_15 = this.this$0;
                    var15_15 = EngineActivity.cfr_renamed_18((EngineActivity)var15_15);
                    var11_10 = var15_15.getSecond_in_screen();
                    var7_7 = var7_7 / var11_10 * var5_5;
                    var4_4 = Math.round(var7_7);
                    var4_4 = Math.abs((int)var4_4);
                    var5_5 = (float)var4_4;
                    var13_13 -= var5_5;
                    var3_3 /* !! */  = this.this$0;
                    var3_3 /* !! */  = EngineActivity.cfr_renamed_282(var3_3 /* !! */ );
                    var5_5 = var3_3 /* !! */ .getStart();
                    var1_1 = (int)(var13_13 += var5_5);
                    var3_3 /* !! */  = this.this$0;
                    var3_3 /* !! */  = EngineActivity.cfr_renamed_144(var3_3 /* !! */ );
                    var4_4 = var3_3 /* !! */ .getDuration();
                    if (var1_1 > var4_4) break block75;
                    var3_3 /* !! */  = this.this$0;
                    var3_3 /* !! */  = EngineActivity.cfr_renamed_144(var3_3 /* !! */ );
                    var3_3 /* !! */ .seekTo(var1_1);
                }
                var12_11 /* !! */  = "data";
                var3_3 /* !! */  = new StringBuilder();
                var3_3 /* !! */  = var3_3 /* !! */ .append((String)var2_2);
                var8_8 /* !! */  = this.this$0;
                var8_8 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var8_8 /* !! */ );
                var6_6 = var8_8 /* !! */ .getCurrentPosition();
                var3_3 /* !! */  = var3_3 /* !! */ .append(var6_6);
                var3_3 /* !! */  = var3_3 /* !! */ .toString();
                Log.e((String)var12_11 /* !! */ , (String)var3_3 /* !! */ );
                var12_11 /* !! */  = this.this$0;
                var12_11 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var12_11 /* !! */ );
                var12_11 /* !! */ .start();
                var12_11 /* !! */  = "mPlayer c ";
                var3_3 /* !! */  = new StringBuilder();
                var2_2 = var3_3 /* !! */ .append((String)var2_2);
                var3_3 /* !! */  = this.this$0;
                var3_3 /* !! */  = EngineActivity.cfr_renamed_144(var3_3 /* !! */ );
                var4_4 = var3_3 /* !! */ .isPlaying();
                var2_2 = var2_2.append(var4_4);
                var2_2 = var2_2.toString();
                Log.e((String)var12_11 /* !! */ , (String)var2_2);
                break block74;
lbl197:
                // 1 sources

                var12_11 /* !! */  = this.this$0;
                var12_11 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var12_11 /* !! */ );
                if (var12_11 /* !! */  == null) break block74;
                var12_11 /* !! */  = this.this$0;
                var12_11 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var12_11 /* !! */ );
                var1_1 = (int)var12_11 /* !! */ .isPlaying();
                if (var1_1 == 0) break block74;
                var12_11 /* !! */  = this.this$0;
                var12_11 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var12_11 /* !! */ );
                try {
                    var12_11 /* !! */ .pause();
                }
                catch (Exception var12_12) {
                    var12_12.printStackTrace();
                }
            }
            var12_11 /* !! */  = this.this$0;
            var2_2 = EngineActivity.cfr_renamed_18((EngineActivity)var12_11 /* !! */ );
            var21_21 = var2_2.getCurrent_cursur_position();
            var12_11 /* !! */ .updateStartViewTime(var21_21);
            var12_11 /* !! */  = this.this$0;
            EngineActivity.cfr_renamed_292((EngineActivity)var12_11 /* !! */ );
        }
    }
}

