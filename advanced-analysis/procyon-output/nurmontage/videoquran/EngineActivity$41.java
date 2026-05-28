// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.net.Uri;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$41 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri_audio;
    final /* synthetic */ String val$video_original;
    
    EngineActivity$41(final EngineActivity this$0, final Uri val$uri_audio, final String val$video_original) {
        this.this$0 = this$0;
        this.val$uri_audio = val$uri_audio;
        this.val$video_original = val$video_original;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        EngineActivity.-$$Nest$mchangeEntityAudioFromVideo(this.this$0, mediaPlayer.getDuration(), this.val$uri_audio, this.val$video_original);
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final EngineActivity$41$1 engineActivity$41$1 = new EngineActivity$41$1(this);
                final EngineActivity engineActivity = this$0;
                try {
                    engineActivity.runOnUiThread((Runnable)engineActivity$41$1);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                    this.this$0.runOnUiThread((Runnable)new EngineActivity$41$2(this));
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
