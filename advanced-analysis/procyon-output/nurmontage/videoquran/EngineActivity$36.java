// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.TrackEntityView;
import android.graphics.RectF;
import android.util.Log;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$AnimatorListener;

class EngineActivity$36 implements SmoothTimelineAnimator$AnimatorListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$maxTime;
    final /* synthetic */ float val$timeLineW;
    
    EngineActivity$36(final EngineActivity this$0, final int val$maxTime, final float val$timeLineW) {
        this.this$0 = this$0;
        this.val$maxTime = val$maxTime;
        this.val$timeLineW = val$timeLineW;
    }
    
    public void onEnd() {
        if (EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, false);
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            this.this$0.stop();
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setCurrent_cursur_position(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getMaxTime());
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).updateCursur(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getMaxTime());
            Label_0266: {
                try {
                    final EngineActivity this$0 = this.this$0;
                    try {
                        Label_0211: {
                            if (EngineActivity.-$$Nest$fgetentityAudio_visible(this$0) == null) {
                                break Label_0211;
                            }
                            final EngineActivity this$2 = this.this$0;
                            try {
                                final EntityAudio -$$Nest$fgetentityAudio_visible = EngineActivity.-$$Nest$fgetentityAudio_visible(this$2);
                                try {
                                    if (-$$Nest$fgetentityAudio_visible.getMediaPlayer() == null) {
                                        break Label_0211;
                                    }
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        final EntityAudio -$$Nest$fgetentityAudio_visible2 = EngineActivity.-$$Nest$fgetentityAudio_visible(this$3);
                                        try {
                                            final MediaPlayer mediaPlayer = -$$Nest$fgetentityAudio_visible2.getMediaPlayer();
                                            try {
                                                if (!mediaPlayer.isPlaying()) {
                                                    break Label_0211;
                                                }
                                                final EngineActivity this$4 = this.this$0;
                                                try {
                                                    final EntityAudio -$$Nest$fgetentityAudio_visible3 = EngineActivity.-$$Nest$fgetentityAudio_visible(this$4);
                                                    try {
                                                        final MediaPlayer mediaPlayer2 = -$$Nest$fgetentityAudio_visible3.getMediaPlayer();
                                                        try {
                                                            mediaPlayer2.pause();
                                                            final EngineActivity this$5 = this.this$0;
                                                            try {
                                                                if (EngineActivity.-$$Nest$fgetmPlayer(this$5) == null) {
                                                                    break Label_0266;
                                                                }
                                                                final EngineActivity this$6 = this.this$0;
                                                                try {
                                                                    final MediaPlayer -$$Nest$fgetmPlayer = EngineActivity.-$$Nest$fgetmPlayer(this$6);
                                                                    try {
                                                                        if (!-$$Nest$fgetmPlayer.isPlaying()) {
                                                                            break Label_0266;
                                                                        }
                                                                        final EngineActivity this$7 = this.this$0;
                                                                        try {
                                                                            final MediaPlayer -$$Nest$fgetmPlayer2 = EngineActivity.-$$Nest$fgetmPlayer(this$7);
                                                                            try {
                                                                                -$$Nest$fgetmPlayer2.pause();
                                                                            }
                                                                            catch (final Exception ex) {
                                                                                ex.printStackTrace();
                                                                            }
                                                                        }
                                                                        catch (final Exception ex2) {}
                                                                    }
                                                                    catch (final Exception ex3) {}
                                                                }
                                                                catch (final Exception ex4) {}
                                                            }
                                                            catch (final Exception ex5) {}
                                                        }
                                                        catch (final Exception ex6) {}
                                                    }
                                                    catch (final Exception ex7) {}
                                                }
                                                catch (final Exception ex8) {}
                                            }
                                            catch (final Exception ex9) {}
                                        }
                                        catch (final Exception ex10) {}
                                    }
                                    catch (final Exception ex11) {}
                                }
                                catch (final Exception ex12) {}
                            }
                            catch (final Exception ex13) {}
                        }
                    }
                    catch (final Exception ex14) {}
                }
                catch (final Exception ex15) {}
            }
            EngineActivity.-$$Nest$fputstartCursur(this.this$0, 0);
            EngineActivity.-$$Nest$fputcurrent_position_time(this.this$0, 0);
            if (EngineActivity.-$$Nest$fgetbtnPlayPause(this.this$0) != null) {
                EngineActivity.-$$Nest$fgetbtnPlayPause(this.this$0).setImageResource(R$drawable.play_btn);
            }
            EngineActivity.-$$Nest$mupdateBtnToEnd(this.this$0);
            EngineActivity.-$$Nest$mupdateBtnToStart(this.this$0);
        }
    }
    
    public void onUpdate(int current_cursur_position) {
        final String s = "";
        if (EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            if (current_cursur_position == 0) {
                return;
            }
            final float progress = current_cursur_position / (float)this.val$maxTime;
            if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0) != null) {
                EngineActivity.-$$Nest$mupdateTime(this.this$0, (long)current_cursur_position);
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setProgress(progress);
            }
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).updateCursur(progress * this.val$timeLineW);
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setCurrent_cursur_position(current_cursur_position);
            final float n = EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrentPosition() / EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSecond_in_screen();
            final float n2 = 1000.0f;
            current_cursur_position = Math.abs(Math.round(n * n2));
            final float n3 = (float)current_cursur_position;
            if (n3 > EngineActivity.-$$Nest$fgetendTimeAudioVisible(this.this$0)) {
                EngineActivity.-$$Nest$fputentityAudio_visible(this.this$0, (EntityAudio)null);
            }
            if (EngineActivity.-$$Nest$fgetentityAudio_visible(this.this$0) == null) {
                for (int i = EngineActivity.-$$Nest$fgetlastIndexVisible(this.this$0); i < EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListAudio().size(); ++i) {
                    final EntityAudio entityAudio = EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListAudio().get(i);
                    if (entityAudio.visible() && entityAudio.isVisible()) {
                        EngineActivity.-$$Nest$fputentityAudio_visible(this.this$0, entityAudio);
                        final EngineActivity this$0 = this.this$0;
                        EngineActivity.-$$Nest$fputendTimeAudioVisible(this$0, Math.round(EngineActivity.-$$Nest$fgetentityAudio_visible(this$0).getRect().right / EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSecond_in_screen() * n2));
                        EngineActivity.-$$Nest$fputlastIndexVisible(this.this$0, i);
                        break;
                    }
                }
            }
            Label_0988: {
                try {
                    final EngineActivity this$2 = this.this$0;
                    try {
                        Label_0919: {
                            if (EngineActivity.-$$Nest$fgetentityAudio_visible(this$2) == null) {
                                break Label_0919;
                            }
                            final EngineActivity this$3 = this.this$0;
                            try {
                                final EntityAudio -$$Nest$fgetentityAudio_player = EngineActivity.-$$Nest$fgetentityAudio_player(this$3);
                                try {
                                    final EngineActivity this$4 = this.this$0;
                                    try {
                                        Label_0551: {
                                            if (-$$Nest$fgetentityAudio_player == EngineActivity.-$$Nest$fgetentityAudio_visible(this$4)) {
                                                break Label_0551;
                                            }
                                            final EngineActivity this$5 = this.this$0;
                                            try {
                                                if (EngineActivity.-$$Nest$fgetmPlayer(this$5) == null) {
                                                    break Label_0551;
                                                }
                                                final EngineActivity this$6 = this.this$0;
                                                try {
                                                    final MediaPlayer -$$Nest$fgetmPlayer = EngineActivity.-$$Nest$fgetmPlayer(this$6);
                                                    try {
                                                        if (!-$$Nest$fgetmPlayer.isPlaying()) {
                                                            break Label_0551;
                                                        }
                                                        final EngineActivity this$7 = this.this$0;
                                                        try {
                                                            final MediaPlayer -$$Nest$fgetmPlayer2 = EngineActivity.-$$Nest$fgetmPlayer(this$7);
                                                            try {
                                                                -$$Nest$fgetmPlayer2.pause();
                                                                final EngineActivity this$8 = this.this$0;
                                                                try {
                                                                    final EntityAudio -$$Nest$fgetentityAudio_visible = EngineActivity.-$$Nest$fgetentityAudio_visible(this$8);
                                                                    try {
                                                                        EngineActivity.-$$Nest$fputmPlayer(this$8, -$$Nest$fgetentityAudio_visible.getMediaPlayer());
                                                                        final EngineActivity this$9 = this.this$0;
                                                                        try {
                                                                            if (EngineActivity.-$$Nest$fgetmPlayer(this$9) == null) {
                                                                                break Label_0988;
                                                                            }
                                                                            final EngineActivity this$10 = this.this$0;
                                                                            try {
                                                                                final MediaPlayer -$$Nest$fgetmPlayer3 = EngineActivity.-$$Nest$fgetmPlayer(this$10);
                                                                                try {
                                                                                    if (-$$Nest$fgetmPlayer3.isPlaying()) {
                                                                                        break Label_0988;
                                                                                    }
                                                                                    final EngineActivity this$11 = this.this$0;
                                                                                    try {
                                                                                        EngineActivity.-$$Nest$fputentityAudio_player(this$11, EngineActivity.-$$Nest$fgetentityAudio_visible(this$11));
                                                                                        final EngineActivity this$12 = this.this$0;
                                                                                        try {
                                                                                            final EntityAudio -$$Nest$fgetentityAudio_visible2 = EngineActivity.-$$Nest$fgetentityAudio_visible(this$12);
                                                                                            try {
                                                                                                final RectF rect = -$$Nest$fgetentityAudio_visible2.getRect();
                                                                                                try {
                                                                                                    final float left = rect.left;
                                                                                                    try {
                                                                                                        final EngineActivity this$13 = this.this$0;
                                                                                                        try {
                                                                                                            final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$13);
                                                                                                            try {
                                                                                                                final int round = Math.round(left / -$$Nest$fgettrackViewEntity.getSecond_in_screen() * n2);
                                                                                                                try {
                                                                                                                    final float n4 = n3 - Math.abs(round);
                                                                                                                    final EngineActivity this$14 = this.this$0;
                                                                                                                    try {
                                                                                                                        final EntityAudio -$$Nest$fgetentityAudio_visible3 = EngineActivity.-$$Nest$fgetentityAudio_visible(this$14);
                                                                                                                        try {
                                                                                                                            current_cursur_position = (int)(n4 + -$$Nest$fgetentityAudio_visible3.getStart());
                                                                                                                            final EngineActivity this$15 = this.this$0;
                                                                                                                            try {
                                                                                                                                final MediaPlayer -$$Nest$fgetmPlayer4 = EngineActivity.-$$Nest$fgetmPlayer(this$15);
                                                                                                                                try {
                                                                                                                                    Label_0788: {
                                                                                                                                        if (current_cursur_position > -$$Nest$fgetmPlayer4.getDuration()) {
                                                                                                                                            break Label_0788;
                                                                                                                                        }
                                                                                                                                        final EngineActivity this$16 = this.this$0;
                                                                                                                                        try {
                                                                                                                                            EngineActivity.-$$Nest$fgetmPlayer(this$16).seekTo(current_cursur_position);
                                                                                                                                            final String s2 = "data";
                                                                                                                                            try {
                                                                                                                                                final StringBuilder sb = new StringBuilder();
                                                                                                                                                try {
                                                                                                                                                    final StringBuilder append = sb.append(s);
                                                                                                                                                    try {
                                                                                                                                                        final EngineActivity this$17 = this.this$0;
                                                                                                                                                        try {
                                                                                                                                                            final MediaPlayer -$$Nest$fgetmPlayer5 = EngineActivity.-$$Nest$fgetmPlayer(this$17);
                                                                                                                                                            try {
                                                                                                                                                                final StringBuilder append2 = append.append(-$$Nest$fgetmPlayer5.getCurrentPosition());
                                                                                                                                                                try {
                                                                                                                                                                    Log.e(s2, append2.toString());
                                                                                                                                                                    final EngineActivity this$18 = this.this$0;
                                                                                                                                                                    try {
                                                                                                                                                                        final MediaPlayer -$$Nest$fgetmPlayer6 = EngineActivity.-$$Nest$fgetmPlayer(this$18);
                                                                                                                                                                        try {
                                                                                                                                                                            -$$Nest$fgetmPlayer6.start();
                                                                                                                                                                            final String s3 = "mPlayer c ";
                                                                                                                                                                            try {
                                                                                                                                                                                final StringBuilder sb2 = new StringBuilder();
                                                                                                                                                                                try {
                                                                                                                                                                                    final StringBuilder append3 = sb2.append(s);
                                                                                                                                                                                    try {
                                                                                                                                                                                        final EngineActivity this$19 = this.this$0;
                                                                                                                                                                                        try {
                                                                                                                                                                                            final MediaPlayer -$$Nest$fgetmPlayer7 = EngineActivity.-$$Nest$fgetmPlayer(this$19);
                                                                                                                                                                                            try {
                                                                                                                                                                                                final StringBuilder append4 = append3.append(-$$Nest$fgetmPlayer7.isPlaying());
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Log.e(s3, append4.toString());
                                                                                                                                                                                                    break Label_0988;
                                                                                                                                                                                                    final EngineActivity this$20 = this.this$0;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (EngineActivity.-$$Nest$fgetmPlayer(this$20) == null) {
                                                                                                                                                                                                            break Label_0988;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        final EngineActivity this$21 = this.this$0;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            final MediaPlayer -$$Nest$fgetmPlayer8 = EngineActivity.-$$Nest$fgetmPlayer(this$21);
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                current_cursur_position = (-$$Nest$fgetmPlayer8.isPlaying() ? 1 : 0);
                                                                                                                                                                                                                if (current_cursur_position == 0) {
                                                                                                                                                                                                                    break Label_0988;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                final EngineActivity this$22 = this.this$0;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    final MediaPlayer -$$Nest$fgetmPlayer9 = EngineActivity.-$$Nest$fgetmPlayer(this$22);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        -$$Nest$fgetmPlayer9.pause();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (final Exception ex) {
                                                                                                                                                                                                                        ex.printStackTrace();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (final Exception ex2) {}
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (final Exception ex3) {}
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (final Exception ex4) {}
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception ex5) {}
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (final Exception ex6) {}
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (final Exception ex7) {}
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex8) {}
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final Exception ex9) {}
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex10) {}
                                                                                                                                                                            }
                                                                                                                                                                            catch (final Exception ex11) {}
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex12) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex13) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex14) {}
                                                                                                                                                            }
                                                                                                                                                            catch (final Exception ex15) {}
                                                                                                                                                        }
                                                                                                                                                        catch (final Exception ex16) {}
                                                                                                                                                    }
                                                                                                                                                    catch (final Exception ex17) {}
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex18) {}
                                                                                                                                            }
                                                                                                                                            catch (final Exception ex19) {}
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex20) {}
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (final Exception ex21) {}
                                                                                                                            }
                                                                                                                            catch (final Exception ex22) {}
                                                                                                                        }
                                                                                                                        catch (final Exception ex23) {}
                                                                                                                    }
                                                                                                                    catch (final Exception ex24) {}
                                                                                                                }
                                                                                                                catch (final Exception ex25) {}
                                                                                                            }
                                                                                                            catch (final Exception ex26) {}
                                                                                                        }
                                                                                                        catch (final Exception ex27) {}
                                                                                                    }
                                                                                                    catch (final Exception ex28) {}
                                                                                                }
                                                                                                catch (final Exception ex29) {}
                                                                                            }
                                                                                            catch (final Exception ex30) {}
                                                                                        }
                                                                                        catch (final Exception ex31) {}
                                                                                    }
                                                                                    catch (final Exception ex32) {}
                                                                                }
                                                                                catch (final Exception ex33) {}
                                                                            }
                                                                            catch (final Exception ex34) {}
                                                                        }
                                                                        catch (final Exception ex35) {}
                                                                    }
                                                                    catch (final Exception ex36) {}
                                                                }
                                                                catch (final Exception ex37) {}
                                                            }
                                                            catch (final Exception ex38) {}
                                                        }
                                                        catch (final Exception ex39) {}
                                                    }
                                                    catch (final Exception ex40) {}
                                                }
                                                catch (final Exception ex41) {}
                                            }
                                            catch (final Exception ex42) {}
                                        }
                                    }
                                    catch (final Exception ex43) {}
                                }
                                catch (final Exception ex44) {}
                            }
                            catch (final Exception ex45) {}
                        }
                    }
                    catch (final Exception ex46) {}
                }
                catch (final Exception ex47) {}
            }
            final EngineActivity this$23 = this.this$0;
            this$23.updateStartViewTime(EngineActivity.-$$Nest$fgettrackViewEntity(this$23).getCurrent_cursur_position());
            EngineActivity.-$$Nest$mupdateBtnCutState(this.this$0);
        }
    }
}
