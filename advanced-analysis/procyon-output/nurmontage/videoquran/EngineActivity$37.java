// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.fragment.audio_effect.RemoveNoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.SpeedFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$AnimatorListener;

class EngineActivity$37 implements SmoothTimelineAnimator$AnimatorListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$maxTime;
    final /* synthetic */ float val$timeLineW;
    
    EngineActivity$37(final EngineActivity this$0, final int val$maxTime, final float val$timeLineW, final EntityAudio val$entityAudio) {
        this.this$0 = this$0;
        this.val$maxTime = val$maxTime;
        this.val$timeLineW = val$timeLineW;
        this.val$entityAudio = val$entityAudio;
    }
    
    public void onEnd() {
        if (EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, false);
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            this.this$0.stop();
            Label_0132: {
                try {
                    final EntityAudio val$entityAudio = this.val$entityAudio;
                    try {
                        if (val$entityAudio.getMediaPlayer() == null) {
                            break Label_0132;
                        }
                        final EntityAudio val$entityAudio2 = this.val$entityAudio;
                        try {
                            final MediaPlayer mediaPlayer = val$entityAudio2.getMediaPlayer();
                            try {
                                if (!mediaPlayer.isPlaying()) {
                                    break Label_0132;
                                }
                                final EntityAudio val$entityAudio3 = this.val$entityAudio;
                                try {
                                    final MediaPlayer mediaPlayer2 = val$entityAudio3.getMediaPlayer();
                                    try {
                                        mediaPlayer2.pause();
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
            final EngineActivity this$0 = this.this$0;
            EngineActivity.-$$Nest$fputstartCursur(this$0, EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getCurrent_cursur_position());
        }
        if (VolumeFragment.instance != null) {
            VolumeFragment.instance.updateButton();
        }
        if (SpeedFragment.instance != null) {
            SpeedFragment.instance.updateButton();
        }
        if (FadeInOutFragment.instance != null) {
            FadeInOutFragment.instance.updateButton();
        }
        if (EchoEffectFragment.instance != null) {
            EchoEffectFragment.instance.updateButton();
        }
        if (EnhanceVoiceFragment.instance != null) {
            EnhanceVoiceFragment.instance.updateButton();
        }
        if (RemoveNoiceFragment.instance != null) {
            RemoveNoiceFragment.instance.updateButton();
        }
    }
    
    public void onUpdate(int n) {
        if (EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            if (n == 0) {
                return;
            }
            final float progress = n / (float)this.val$maxTime;
            if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0) != null) {
                EngineActivity.-$$Nest$mupdateTime(this.this$0, (long)n);
                EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setProgress(progress);
            }
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).updateCursur(progress * this.val$timeLineW);
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setCurrent_cursur_position(n);
            Label_0400: {
                try {
                    final EntityAudio val$entityAudio = this.val$entityAudio;
                    try {
                        if (val$entityAudio.getMediaPlayer() == null) {
                            break Label_0400;
                        }
                        final EntityAudio val$entityAudio2 = this.val$entityAudio;
                        try {
                            final MediaPlayer mediaPlayer = val$entityAudio2.getMediaPlayer();
                            try {
                                n = (mediaPlayer.isPlaying() ? 1 : 0);
                                if (n != 0) {
                                    break Label_0400;
                                }
                                final EngineActivity this$0 = this.this$0;
                                try {
                                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$0);
                                    try {
                                        final float currentPosition = -$$Nest$fgettrackViewEntity.getCurrentPosition();
                                        try {
                                            final EngineActivity this$2 = this.this$0;
                                            try {
                                                final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                                                try {
                                                    final float n2 = currentPosition / -$$Nest$fgettrackViewEntity2.getSecond_in_screen();
                                                    final float n3 = 1000.0f;
                                                    n = Math.round(n2 * n3);
                                                    try {
                                                        n = Math.abs(n);
                                                        final float n4 = (float)n;
                                                        final EntityAudio val$entityAudio3 = this.val$entityAudio;
                                                        try {
                                                            final RectF rect = val$entityAudio3.getRect();
                                                            try {
                                                                final float left = rect.left;
                                                                try {
                                                                    final EngineActivity this$3 = this.this$0;
                                                                    try {
                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity3 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                                                                        try {
                                                                            final int round = Math.round(left / -$$Nest$fgettrackViewEntity3.getSecond_in_screen() * n3);
                                                                            try {
                                                                                final float n5 = n4 - Math.abs(round);
                                                                                final EntityAudio val$entityAudio4 = this.val$entityAudio;
                                                                                try {
                                                                                    n = (int)(n5 + val$entityAudio4.getStart());
                                                                                    final EntityAudio val$entityAudio5 = this.val$entityAudio;
                                                                                    try {
                                                                                        final MediaPlayer mediaPlayer2 = val$entityAudio5.getMediaPlayer();
                                                                                        try {
                                                                                            Label_0372: {
                                                                                                if (n > mediaPlayer2.getDuration()) {
                                                                                                    break Label_0372;
                                                                                                }
                                                                                                final EntityAudio val$entityAudio6 = this.val$entityAudio;
                                                                                                try {
                                                                                                    val$entityAudio6.getMediaPlayer().seekTo(n);
                                                                                                    final EntityAudio val$entityAudio7 = this.val$entityAudio;
                                                                                                    try {
                                                                                                        final MediaPlayer mediaPlayer3 = val$entityAudio7.getMediaPlayer();
                                                                                                        try {
                                                                                                            mediaPlayer3.start();
                                                                                                        }
                                                                                                        catch (final Exception ex) {
                                                                                                            ex.printStackTrace();
                                                                                                        }
                                                                                                    }
                                                                                                    catch (final Exception ex2) {}
                                                                                                }
                                                                                                catch (final Exception ex3) {}
                                                                                            }
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
                    catch (final Exception ex21) {}
                }
                catch (final Exception ex22) {}
            }
            final EngineActivity this$4 = this.this$0;
            this$4.updateStartViewTime(EngineActivity.-$$Nest$fgettrackViewEntity(this$4).getCurrent_cursur_position());
        }
    }
}
