// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.fragment.audio_effect.SpeedFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.fragment.audio_effect.RemoveNoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;

class EngineActivity$102 implements EditMediaFragment$IEditMediaCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$102(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void echoEffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)EchoEffectFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void enhanceVoice() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)EnhanceVoiceFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void fadeffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)FadeInOutFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void noice() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)RemoveNoiceFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void onCmd(final String s) {
        this.pausePreview();
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity() instanceof EntityAudio) {
            this.this$0.applyffect(s, (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity());
        }
    }
    
    public void onCmdAll(final EffectAudio effectAudio) {
        this.pausePreview();
        EngineActivity.-$$Nest$mshowProgressSimple(this.this$0);
        this.this$0.applyffectAll(effectAudio, 0);
    }
    
    public void onCmdPlay(final String s) {
        this.pausePreview();
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity() instanceof EntityAudio) {
            this.this$0.applyffectPlayAuto(s, (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity());
        }
    }
    
    public void onCut() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        if (!(-$$Nest$fgettrackViewEntity.getSelectedEntity() instanceof EntityAudio)) {
                            return;
                        }
                        final EngineActivity this$3 = this.this$0;
                        try {
                            final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                            try {
                                final Entity selectedEntity = -$$Nest$fgettrackViewEntity2.getSelectedEntity();
                                try {
                                    final EntityAudio entityAudio = (EntityAudio)selectedEntity;
                                    try {
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            final TrackEntityView -$$Nest$fgettrackViewEntity3 = EngineActivity.-$$Nest$fgettrackViewEntity(this$4);
                                            try {
                                                final float currentPosition = -$$Nest$fgettrackViewEntity3.getCurrentPosition();
                                                try {
                                                    final float abs = Math.abs(currentPosition);
                                                    try {
                                                        final RectF rect = entityAudio.getRect();
                                                        try {
                                                            if (abs < rect.left) {
                                                                return;
                                                            }
                                                            final RectF rect2 = entityAudio.getRect();
                                                            try {
                                                                if (abs > rect2.right) {
                                                                    return;
                                                                }
                                                                final EngineActivity this$5 = this.this$0;
                                                                try {
                                                                    final TrackEntityView -$$Nest$fgettrackViewEntity4 = EngineActivity.-$$Nest$fgettrackViewEntity(this$5);
                                                                    try {
                                                                        final float n = -$$Nest$fgettrackViewEntity4.getSecond_in_screenNoScale() * 0.1f;
                                                                        final RectF rect3 = entityAudio.getRect();
                                                                        try {
                                                                            Label_0218: {
                                                                                if (abs <= rect3.left) {
                                                                                    break Label_0218;
                                                                                }
                                                                                final RectF rect4 = entityAudio.getRect();
                                                                                try {
                                                                                    if (abs < rect4.left + n) {
                                                                                        return;
                                                                                    }
                                                                                    final RectF rect5 = entityAudio.getRect();
                                                                                    try {
                                                                                        Label_0272: {
                                                                                            if (abs >= rect5.right) {
                                                                                                break Label_0272;
                                                                                            }
                                                                                            final RectF rect6 = entityAudio.getRect();
                                                                                            try {
                                                                                                if (abs > rect6.right - n) {
                                                                                                    return;
                                                                                                }
                                                                                                final EngineActivity this$6 = this.this$0;
                                                                                                try {
                                                                                                    final TrackEntityView -$$Nest$fgettrackViewEntity5 = EngineActivity.-$$Nest$fgettrackViewEntity(this$6);
                                                                                                    try {
                                                                                                        final float currentPosition2 = -$$Nest$fgettrackViewEntity5.getCurrentPosition();
                                                                                                        try {
                                                                                                            final EngineActivity this$7 = this.this$0;
                                                                                                            try {
                                                                                                                final TrackEntityView -$$Nest$fgettrackViewEntity6 = EngineActivity.-$$Nest$fgettrackViewEntity(this$7);
                                                                                                                try {
                                                                                                                    final float n2 = currentPosition2 / -$$Nest$fgettrackViewEntity6.getSecond_in_screen();
                                                                                                                    final float n3 = 1000.0f;
                                                                                                                    final int round = Math.round(n2 * n3);
                                                                                                                    try {
                                                                                                                        final int abs2 = Math.abs(round);
                                                                                                                        try {
                                                                                                                            final RectF rect7 = entityAudio.getRect();
                                                                                                                            try {
                                                                                                                                final float left = rect7.left;
                                                                                                                                try {
                                                                                                                                    final EngineActivity this$8 = this.this$0;
                                                                                                                                    try {
                                                                                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity7 = EngineActivity.-$$Nest$fgettrackViewEntity(this$8);
                                                                                                                                        try {
                                                                                                                                            final int round2 = Math.round(left / -$$Nest$fgettrackViewEntity7.getSecond_in_screen() * n3);
                                                                                                                                            try {
                                                                                                                                                final int round3 = Math.round(abs2 - Math.abs(round2) + entityAudio.getStart());
                                                                                                                                                final EntityAudio split = entityAudio.split(abs);
                                                                                                                                                try {
                                                                                                                                                    split.setAmps(entityAudio.getAmps());
                                                                                                                                                    split.setRenderer(entityAudio.getRenderer());
                                                                                                                                                    split.addPathHttp(entityAudio.getPaths_http());
                                                                                                                                                    split.setPath_ffmpeg_effect(entityAudio.getPath_ffmpeg_effect());
                                                                                                                                                    split.setVideo_path(entityAudio.getVideo_path());
                                                                                                                                                    split.setApplyEffectInPreview(entityAudio.isApplyEffectInPreview());
                                                                                                                                                    split.setEffectAudio(entityAudio.getEffectAudio());
                                                                                                                                                    split.setmScaleFactor(entityAudio.getmScaleFactor());
                                                                                                                                                    split.setMediaPlayer(entityAudio.getMediaPlayer());
                                                                                                                                                    split.setPath_ffmpeg(entityAudio.getPath_ffmpeg());
                                                                                                                                                    split.setIndex(entityAudio.getIndex() + 1);
                                                                                                                                                    split.setEnd(entityAudio.getEnd());
                                                                                                                                                    final float n4 = (float)round3;
                                                                                                                                                    split.setStart(n4);
                                                                                                                                                    final EntityAudio entityAudio2 = split;
                                                                                                                                                    try {
                                                                                                                                                        entityAudio2.setMin_duration(round3);
                                                                                                                                                        final EngineActivity this$9 = this.this$0;
                                                                                                                                                        try {
                                                                                                                                                            final TrackEntityView -$$Nest$fgettrackViewEntity8 = EngineActivity.-$$Nest$fgettrackViewEntity(this$9);
                                                                                                                                                            try {
                                                                                                                                                                -$$Nest$fgettrackViewEntity8.splitAudio(split, split.getIndex());
                                                                                                                                                                final EngineActivity this$10 = this.this$0;
                                                                                                                                                                try {
                                                                                                                                                                    EngineActivity.-$$Nest$fgettrackViewEntity(this$10).stackSplit(entityAudio);
                                                                                                                                                                    entityAudio.setCurrentRect();
                                                                                                                                                                    final EntityAudio entityAudio3 = entityAudio;
                                                                                                                                                                    try {
                                                                                                                                                                        entityAudio3.setRight(abs);
                                                                                                                                                                        final RectF rect8 = entityAudio.getRect();
                                                                                                                                                                        try {
                                                                                                                                                                            final float right = rect8.right;
                                                                                                                                                                            try {
                                                                                                                                                                                final float n5 = right / entityAudio.getmScaleFactor();
                                                                                                                                                                                final RectF rect9 = entityAudio.getRect();
                                                                                                                                                                                try {
                                                                                                                                                                                    final float left2 = rect9.left;
                                                                                                                                                                                    try {
                                                                                                                                                                                        entityAudio.setMax(n5 - (left2 / entityAudio.getmScaleFactor() - entityAudio.getOffset_left()));
                                                                                                                                                                                        final EntityAudio entityAudio4 = entityAudio;
                                                                                                                                                                                        try {
                                                                                                                                                                                            entityAudio4.setEnd(n4);
                                                                                                                                                                                            split.setOffset_right(entityAudio.getOffset_right());
                                                                                                                                                                                            entityAudio.setOffset_right(0.0f);
                                                                                                                                                                                            final float offset = entityAudio.getOffset();
                                                                                                                                                                                            try {
                                                                                                                                                                                                final float n6 = offset + entityAudio.getOffset_left();
                                                                                                                                                                                                final RectF rect10 = entityAudio.getRect();
                                                                                                                                                                                                try {
                                                                                                                                                                                                    final float width = rect10.width();
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        split.setOffset(n6 + width / entityAudio.getmScaleFactor());
                                                                                                                                                                                                        entityAudio.onChange();
                                                                                                                                                                                                        final EngineActivity this$11 = this.this$0;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            final TrackEntityView -$$Nest$fgettrackViewEntity9 = EngineActivity.-$$Nest$fgettrackViewEntity(this$11);
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                split.setSecond_in_screen(-$$Nest$fgettrackViewEntity9.getSecond_in_screenNoScale());
                                                                                                                                                                                                                split.updateEffect();
                                                                                                                                                                                                                entityAudio.updateEffect();
                                                                                                                                                                                                                final EngineActivity this$12 = this.this$0;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    EngineActivity.-$$Nest$fgettrackViewEntity(this$12).stackSplit(split);
                                                                                                                                                                                                                    final EngineActivity this$13 = this.this$0;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity10 = EngineActivity.-$$Nest$fgettrackViewEntity(this$13);
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            -$$Nest$fgettrackViewEntity10.invalidate();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (final Exception ex) {
                                                                                                                                                                                                                            if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
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
                                                                                    }
                                                                                    catch (final Exception ex33) {}
                                                                                }
                                                                                catch (final Exception ex34) {}
                                                                            }
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
                                        catch (final Exception ex43) {}
                                    }
                                    catch (final Exception ex44) {}
                                }
                                catch (final Exception ex45) {}
                            }
                            catch (final Exception ex46) {}
                        }
                        catch (final Exception ex47) {}
                    }
                    catch (final Exception ex48) {}
                }
                catch (final Exception ex49) {}
            }
            catch (final Exception ex50) {}
        }
        catch (final Exception ex51) {}
    }
    
    public void onDelete() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        -$$Nest$fgettrackViewEntity.deleteMediaEntity();
                        final EngineActivity this$3 = this.this$0;
                        try {
                            EngineActivity.-$$Nest$mupdateTime(this$3);
                            final EngineActivity this$4 = this.this$0;
                            try {
                                final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = EngineActivity.-$$Nest$fgetiTrimLineCallback(this$4);
                                try {
                                    -$$Nest$fgetiTrimLineCallback.onEmptySelect();
                                }
                                catch (final Exception ex) {
                                    if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                        return;
                                    }
                                    EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
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
    
    public void onDone() {
        this.pausePreview();
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
        EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity(), -1.0f);
    }
    
    public void onDuplicate() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$0);
                try {
                    if (!(-$$Nest$fgettrackViewEntity.getSelectedEntity() instanceof EntityAudio)) {
                        return;
                    }
                    final EngineActivity this$2 = this.this$0;
                    try {
                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                        try {
                            final Entity selectedEntity = -$$Nest$fgettrackViewEntity2.getSelectedEntity();
                            try {
                                final EntityAudio entityAudio = (EntityAudio)selectedEntity;
                                try {
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        EngineActivity.-$$Nest$mpausePlayer(this$3);
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            final MediaPlayer mediaPlayer = entityAudio.getMediaPlayer();
                                            try {
                                                EngineActivity.-$$Nest$mduplicateEntityAudio(this$4, mediaPlayer.getDuration(), entityAudio);
                                                final EngineActivity this$5 = this.this$0;
                                                try {
                                                    EngineActivity.-$$Nest$mupdateTime(this$5);
                                                }
                                                catch (final Exception ex) {
                                                    if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                                        return;
                                                    }
                                                    EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
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
    
    public void onReplace() {
    }
    
    public void pausePreview() {
        if (!EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            return;
        }
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity() instanceof EntityAudio) {
            final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
            EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, false);
            this.this$0.pauseTimelineAnimation();
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            try {
                if (entityAudio.getMediaPlayer() != null) {
                    final MediaPlayer mediaPlayer = entityAudio.getMediaPlayer();
                    try {
                        if (!mediaPlayer.isPlaying()) {
                            return;
                        }
                        final MediaPlayer mediaPlayer2 = entityAudio.getMediaPlayer();
                        try {
                            mediaPlayer2.pause();
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    catch (final Exception ex2) {}
                }
            }
            catch (final Exception ex3) {}
        }
    }
    
    public void pitchffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)PitchFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void reverbEffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)ReverbePresetFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void speedffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)SpeedFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
    
    public void startPreview() {
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity() instanceof EntityAudio) {
            final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
            if (!entityAudio.getMediaPlayer().isPlaying()) {
                EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).previewEntity(entityAudio);
                EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, true);
                EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateToStart(entityAudio);
                final EngineActivity this$0 = this.this$0;
                EngineActivity.-$$Nest$fputstartCursur(this$0, EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getCurrent_cursur_position());
                this.this$0.startTimelineAnimationPreview(entityAudio);
            }
        }
    }
    
    public void updateEntity(final EffectAudioType effectAudioType, final EntityAudio entityAudio) {
        for (int i = 0; i < EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListAudio().size(); ++i) {
            final EntityAudio entityAudio2 = EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListAudio().get(i);
            if (entityAudio2 != entityAudio) {
                if (entityAudio2.visible()) {
                    if (effectAudioType == EffectAudioType.ECHO) {
                        entityAudio2.getEffectAudio().setDecays(entityAudio.getEffectAudio().getDecays());
                        entityAudio2.getEffectAudio().setDelays(entityAudio.getEffectAudio().getDelays());
                        entityAudio2.getEffectAudio().setOutGain(entityAudio.getEffectAudio().getOutGain());
                        entityAudio2.getEffectAudio().setDecays_cmd(entityAudio.getEffectAudio().getDecays_cmd());
                        entityAudio2.getEffectAudio().setDelays_cmd(entityAudio.getEffectAudio().getDelays_cmd());
                    }
                    if (effectAudioType == EffectAudioType.NOICE) {
                        entityAudio2.getEffectAudio().setRemoveNoice(entityAudio.getEffectAudio().isRemoveNoice());
                    }
                    if (effectAudioType == EffectAudioType.ENHANCE) {
                        entityAudio2.getEffectAudio().setEnhance(entityAudio.getEffectAudio().isEnhance());
                    }
                    if (effectAudioType == EffectAudioType.SPEED) {
                        entityAudio2.getEffectAudio().setSpeed(entityAudio.getEffectAudio().getSpeed());
                    }
                    if (effectAudioType == EffectAudioType.REVERB) {
                        entityAudio2.getEffectAudio().setReverbPreset(entityAudio.getEffectAudio().getReverbPreset());
                        entityAudio2.getEffectAudio().setReverbPreset_index_list(entityAudio.getEffectAudio().getReverbPreset_index_list());
                    }
                    if (effectAudioType == EffectAudioType.VOLUME) {
                        entityAudio2.getEffectAudio().setVolume(entityAudio.getEffectAudio().getVolume());
                    }
                    if (effectAudioType == EffectAudioType.FADE) {
                        entityAudio2.getEffectAudio().setFade_in(entityAudio.getEffectAudio().getFade_in());
                        entityAudio2.getEffectAudio().setFade_out(entityAudio.getEffectAudio().getFade_out());
                    }
                }
            }
        }
    }
    
    public void volumeEffect() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.findViewById(R$id.layout_menu).setVisibility(4);
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EntityAudio entityAudio = (EntityAudio)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)VolumeFragment.getInstance(EngineActivity.-$$Nest$fgetiEditMediaCallback(this$0), entityAudio));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
    }
}
