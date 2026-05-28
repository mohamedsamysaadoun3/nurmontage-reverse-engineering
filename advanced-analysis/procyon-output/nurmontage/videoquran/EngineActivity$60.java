// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.EditMediaFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.fragment.EditTextFragment;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import java.util.Iterator;
import java.util.List;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.constant.EntityAction;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;

class EngineActivity$60 implements TrackEntityView$ITrimLineCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$60(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void enableRedo(final boolean b) {
        if (b) {
            EngineActivity.-$$Nest$menableRedoBtn(this.this$0);
        }
        else {
            EngineActivity.-$$Nest$mdisableRedoBtn(this.this$0);
        }
    }
    
    public void enableUndo(final boolean b) {
        if (b) {
            EngineActivity.-$$Nest$menableUndoBtn(this.this$0);
        }
        else {
            EngineActivity.-$$Nest$mdisableUndoBtn(this.this$0);
        }
    }
    
    public void fadeInAudio(final float n) {
    }
    
    public void fadeOutAudio(final float n) {
    }
    
    public void onAddStack(final EntityAction entityAction) {
        EngineActivity.-$$Nest$menableUndoBtn(this.this$0);
    }
    
    public void onDelete(final EntityView entityView) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$fgetblurredImageView(this$0).setEntity_select(null);
                final EngineActivity this$2 = this.this$0;
                try {
                    final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$2);
                    try {
                        -$$Nest$fgetblurredImageView.postInvalidate();
                        final EngineActivity this$3 = this.this$0;
                        try {
                            EngineActivity.-$$Nest$mhideFragment(this$3);
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
    
    public void onEmptySelect() {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setEntity_select(null);
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).postInvalidate();
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
    }
    
    public void onMove() {
    }
    
    public void onPlayVibration() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.runOnUiThread((Runnable)new EngineActivity$60$1(this));
    }
    
    public void onSeekPlayer(float abs) {
        try {
            EngineActivity.-$$Nest$fputisOnScroll(this.this$0, true);
            final EngineActivity this$0 = this.this$0;
            try {
                final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$0);
                try {
                    final List entityListAudio = -$$Nest$fgettrackViewEntity.getEntityListAudio();
                    try {
                        final Iterator iterator = entityListAudio.iterator();
                        try {
                            while (true) {
                                Label_0120: {
                                    if (!iterator.hasNext()) {
                                        break Label_0120;
                                    }
                                    final Object next = iterator.next();
                                    try {
                                        final EntityAudio entityAudio = (EntityAudio)next;
                                        try {
                                            if (entityAudio.getMediaPlayer() == null) {
                                                continue;
                                            }
                                            final MediaPlayer mediaPlayer = entityAudio.getMediaPlayer();
                                            try {
                                                if (mediaPlayer.isPlaying()) {
                                                    final MediaPlayer mediaPlayer2 = entityAudio.getMediaPlayer();
                                                    try {
                                                        mediaPlayer2.pause();
                                                    }
                                                    catch (final Exception ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    continue;
                                                }
                                                continue;
                                            }
                                            catch (final Exception ex2) {}
                                        }
                                        catch (final Exception ex3) {}
                                        final EngineActivity this$2 = this.this$0;
                                        try {
                                            Label_0217: {
                                                if (!EngineActivity.-$$Nest$fgetmIsPlaying(this$2)) {
                                                    break Label_0217;
                                                }
                                                final EngineActivity this$3 = this.this$0;
                                                try {
                                                    Label_0169: {
                                                        if (EngineActivity.-$$Nest$fgetbtnPlayPause(this$3) == null) {
                                                            break Label_0169;
                                                        }
                                                        final EngineActivity this$4 = this.this$0;
                                                        try {
                                                            final ImageButton -$$Nest$fgetbtnPlayPause = EngineActivity.-$$Nest$fgetbtnPlayPause(this$4);
                                                            try {
                                                                -$$Nest$fgetbtnPlayPause.setImageResource(R$drawable.play_btn);
                                                                EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, false);
                                                                final EngineActivity this$5 = this.this$0;
                                                                try {
                                                                    EngineActivity.-$$Nest$fgettrackViewEntity(this$5).setPlaying(false);
                                                                    final EngineActivity this$6 = this.this$0;
                                                                    try {
                                                                        EngineActivity.-$$Nest$fgetblurredImageView(this$6).setPlaying(false);
                                                                        final EngineActivity this$7 = this.this$0;
                                                                        try {
                                                                            this$7.pauseTimelineAnimation();
                                                                            final EngineActivity this$8 = this.this$0;
                                                                            try {
                                                                                this$8.stop();
                                                                                final EngineActivity this$9 = this.this$0;
                                                                                try {
                                                                                    final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$9);
                                                                                    try {
                                                                                        abs /= -$$Nest$fgettrackViewEntity2.getSecond_in_screen();
                                                                                        abs *= -1000.0f;
                                                                                        abs = Math.abs(abs);
                                                                                        try {
                                                                                            final int round = Math.round(abs);
                                                                                            try {
                                                                                                final EngineActivity this$10 = this.this$0;
                                                                                                try {
                                                                                                    Label_0436: {
                                                                                                        if (EngineActivity.-$$Nest$fgetblurredImageView(this$10) == null) {
                                                                                                            break Label_0436;
                                                                                                        }
                                                                                                        final EngineActivity this$11 = this.this$0;
                                                                                                        try {
                                                                                                            final TrackEntityView -$$Nest$fgettrackViewEntity3 = EngineActivity.-$$Nest$fgettrackViewEntity(this$11);
                                                                                                            try {
                                                                                                                final int maxTime = -$$Nest$fgettrackViewEntity3.getMaxTime();
                                                                                                                final float a = 1.0f;
                                                                                                                Label_0352: {
                                                                                                                    if (round <= maxTime) {
                                                                                                                        break Label_0352;
                                                                                                                    }
                                                                                                                    final EngineActivity this$12 = this.this$0;
                                                                                                                    try {
                                                                                                                        final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$12);
                                                                                                                        try {
                                                                                                                            if (-$$Nest$fgetblurredImageView.getProgress() >= a) {
                                                                                                                                break Label_0436;
                                                                                                                            }
                                                                                                                            final float n = (float)round;
                                                                                                                            final EngineActivity this$13 = this.this$0;
                                                                                                                            try {
                                                                                                                                final TrackEntityView -$$Nest$fgettrackViewEntity4 = EngineActivity.-$$Nest$fgettrackViewEntity(this$13);
                                                                                                                                try {
                                                                                                                                    final float min = Math.min(a, n / -$$Nest$fgettrackViewEntity4.getMaxTime());
                                                                                                                                    try {
                                                                                                                                        EngineActivity.-$$Nest$mupdateTime(this.this$0, (long)round);
                                                                                                                                        final EngineActivity this$14 = this.this$0;
                                                                                                                                        try {
                                                                                                                                            EngineActivity.-$$Nest$fgetblurredImageView(this$14).setProgress(min);
                                                                                                                                            final EngineActivity this$15 = this.this$0;
                                                                                                                                            try {
                                                                                                                                                EngineActivity.-$$Nest$fgettrackViewEntity(this$15).update_current_cursur_position(round);
                                                                                                                                                final EngineActivity this$16 = this.this$0;
                                                                                                                                                try {
                                                                                                                                                    EngineActivity.-$$Nest$fputcurrent_position_time(this$16, (int)System.currentTimeMillis());
                                                                                                                                                    final EngineActivity this$17 = this.this$0;
                                                                                                                                                    try {
                                                                                                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity5 = EngineActivity.-$$Nest$fgettrackViewEntity(this$17);
                                                                                                                                                        try {
                                                                                                                                                            EngineActivity.-$$Nest$fputstartCursur(this$17, -$$Nest$fgettrackViewEntity5.getCurrent_cursur_position());
                                                                                                                                                            final EngineActivity this$18 = this.this$0;
                                                                                                                                                            try {
                                                                                                                                                                final TrackEntityView -$$Nest$fgettrackViewEntity6 = EngineActivity.-$$Nest$fgettrackViewEntity(this$18);
                                                                                                                                                                try {
                                                                                                                                                                    final int maxTime2 = -$$Nest$fgettrackViewEntity6.getMaxTime();
                                                                                                                                                                    try {
                                                                                                                                                                        final EngineActivity this$19 = this.this$0;
                                                                                                                                                                        try {
                                                                                                                                                                            final TrackEntityView -$$Nest$fgettrackViewEntity7 = EngineActivity.-$$Nest$fgettrackViewEntity(this$19);
                                                                                                                                                                            try {
                                                                                                                                                                                this$18.updateViewTime(maxTime2, -$$Nest$fgettrackViewEntity7.getCurrent_cursur_position());
                                                                                                                                                                                final EngineActivity this$20 = this.this$0;
                                                                                                                                                                                try {
                                                                                                                                                                                    EngineActivity.-$$Nest$mupdateBtnCutState(this$20);
                                                                                                                                                                                    final EngineActivity this$21 = this.this$0;
                                                                                                                                                                                    try {
                                                                                                                                                                                        EngineActivity.-$$Nest$mupdateBtnToStart(this$21);
                                                                                                                                                                                        final EngineActivity this$22 = this.this$0;
                                                                                                                                                                                        try {
                                                                                                                                                                                            EngineActivity.-$$Nest$mupdateBtnToEnd(this$22);
                                                                                                                                                                                            final EngineActivity this$23 = this.this$0;
                                                                                                                                                                                            try {
                                                                                                                                                                                                EngineActivity.-$$Nest$mupdateFrame(this$23);
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
                                                                                                            }
                                                                                                            catch (final Exception ex23) {}
                                                                                                        }
                                                                                                        catch (final Exception ex24) {}
                                                                                                    }
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
                                                }
                                                catch (final Exception ex36) {}
                                            }
                                        }
                                        catch (final Exception ex37) {}
                                    }
                                    catch (final Exception ex38) {}
                                }
                            }
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
    
    public void onSelectEntity(final Entity entity, final float n) {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        if (entity instanceof EntityQuranTimeline) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setEntity_select(entity.getEntityView());
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
            if (EditEntityFragment.instance != null) {
                EditEntityFragment.instance.checkSplitEntity(entity, -EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrentPosition());
                EditEntityFragment.instance.checkIcon(entity);
                return;
            }
            if (EditTextFragment.instance != null) {
                EditTextFragment.instance.update(((EntityQuranTimeline)entity).getQuranEntity());
                return;
            }
            EngineActivity.-$$Nest$mshowEditEntity(this.this$0, (Entity)entity);
        }
        else if (entity instanceof EntityTrslTimeline) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setEntity_select(entity.getEntityView());
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
            if (EditTrslEntityFragment.instance != null) {
                EditTrslEntityFragment.instance.checkSplitEntity(entity, -EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrentPosition());
                return;
            }
            EngineActivity.-$$Nest$mshowEditTrslEntity(this.this$0, (Entity)entity);
        }
        else if (entity instanceof EntityBismilahTimeline) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setEntity_select(entity.getEntityView());
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
            EngineActivity.-$$Nest$mshowEditBismilahEntity(this.this$0, (Entity)entity);
        }
        else if (entity instanceof EntityAudio) {
            final EntityAudio entityAudio = (EntityAudio)entity;
            if (EditMediaFragment.instance != null) {
                EditMediaFragment.instance.checkSplit(entityAudio, -EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrentPosition());
                return;
            }
            EngineActivity.-$$Nest$mshowEditAudioEntity(this.this$0, entityAudio);
        }
    }
    
    public void onSelectMultiple(final int n) {
        EngineActivity.-$$Nest$mshowEditMultipleEntity(this.this$0, n);
    }
    
    public void onUp() {
        EngineActivity.-$$Nest$fputisOnScroll(this.this$0, false);
        EngineActivity.-$$Nest$mupdateBtnCutState(this.this$0);
    }
    
    public void onUpdate() {
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0) != null) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).postInvalidate();
        }
    }
    
    public void onUpdatePlayerAudio(final EntityAudio entityAudio) {
    }
    
    public void onUpdateTime() {
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputstartCursur(this$0, EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getCurrent_cursur_position());
        EngineActivity.-$$Nest$mupdateTime(this.this$0);
    }
    
    public void pause() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
    }
    
    public void progress(final boolean b) {
        this.this$0.runOnUiThread((Runnable)new EngineActivity$60$2(this, b));
    }
}
