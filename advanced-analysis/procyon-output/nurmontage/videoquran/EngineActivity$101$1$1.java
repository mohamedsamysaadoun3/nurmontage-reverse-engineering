// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;

class EngineActivity$101$1$1 implements Runnable
{
    final /* synthetic */ EngineActivity$101$1 this$2;
    final /* synthetic */ MediaPlayer val$mp;
    
    EngineActivity$101$1$1(final EngineActivity$101$1 this$2, final MediaPlayer val$mp) {
        this.this$2 = this$2;
        this.val$mp = val$mp;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$2.this$1.this$0).invalidate();
        this.this$2.this$1.val$entityAudio.setMediaPlayer(this.val$mp);
        EngineActivity.-$$Nest$fgetiEditMediaCallback(this.this$2.this$1.this$0).startPreview();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$2.this$1.this$0);
    }
}
