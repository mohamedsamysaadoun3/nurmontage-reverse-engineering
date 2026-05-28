// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.Iterator;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$20 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$20(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(View iterator) {
        EngineActivity.-$$Nest$mhideLayoutResolution(this.this$0);
        if (EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0)) {
            EngineActivity.-$$Nest$fputmIsPlaying(this.this$0, false);
            this.this$0.pauseTimelineAnimation();
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setPlaying(EngineActivity.-$$Nest$fgetmIsPlaying(this.this$0));
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).invalidate();
            iterator = (View)EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListAudio().iterator();
            while (((Iterator)iterator).hasNext()) {
                final EntityAudio entityAudio = ((Iterator<EntityAudio>)iterator).next();
                try {
                    if (!entityAudio.visible()) {
                        continue;
                    }
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
                break;
            }
            EngineActivity.-$$Nest$fgetbtnPlayPause(this.this$0).setImageResource(R$drawable.play_btn);
        }
        else {
            if (EngineActivity.-$$Nest$fgetcurrent_position_time(this.this$0) == 0) {
                EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).updateCursur(0);
            }
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).calculMaxTime();
            EngineActivity.-$$Nest$fgetbtnPlayPause(this.this$0).setImageResource(R$drawable.pause_24px);
            EngineActivity.-$$Nest$mupdateBtnToEndAndStart(this.this$0);
            EngineActivity.-$$Nest$fputcurrent_position_time(this.this$0, (int)System.currentTimeMillis());
            final EngineActivity this$0 = this.this$0;
            final boolean b = true;
            EngineActivity.-$$Nest$fputmIsPlaying(this$0, b);
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPlaying(b);
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setPlaying(b);
            this.this$0.startTimelineAnimation();
        }
    }
}
