// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$59$1 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity$59 this$1;
    
    EngineActivity$59$1(final EngineActivity$59 this$1) {
        this.this$1 = this$1;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (this.this$1.val$entityAudio.getMediaPlayer() != null && mediaPlayer.getDuration() != this.this$1.val$entityAudio.getMediaPlayer().getDuration()) {
            this.this$1.val$entityAudio.setRight(this.this$1.val$entityAudio.getRect().left + Math.round(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).getSecond_in_screen() * (mediaPlayer.getDuration() / 1000.0f)));
            this.this$1.val$entityAudio.setDuration(mediaPlayer.getDuration() * 1000);
            this.this$1.val$entityAudio.setMax(this.this$1.val$entityAudio.getRect().right / this.this$1.val$entityAudio.getmScaleFactor() - (this.this$1.val$entityAudio.getRect().left / this.this$1.val$entityAudio.getmScaleFactor() - this.this$1.val$entityAudio.getOffset_left()));
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).updateWhenEffect(this.this$1.val$entityAudio);
            this.this$1.this$0.runOnUiThread((Runnable)new EngineActivity$59$1$1(this));
        }
        else {
            this.this$1.this$0.runOnUiThread((Runnable)new EngineActivity$59$1$2(this));
        }
        this.this$1.val$entityAudio.setMediaPlayer(mediaPlayer);
    }
}
