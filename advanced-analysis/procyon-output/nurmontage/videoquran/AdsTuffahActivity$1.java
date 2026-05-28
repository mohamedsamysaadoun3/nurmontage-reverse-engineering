// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class AdsTuffahActivity$1 implements Runnable
{
    final /* synthetic */ AdsTuffahActivity this$0;
    
    AdsTuffahActivity$1(final AdsTuffahActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (AdsTuffahActivity.-$$Nest$fgetmediaPlayer(this.this$0) != null && AdsTuffahActivity.-$$Nest$fgetmediaPlayer(this.this$0).isPlaying()) {
            AdsTuffahActivity.-$$Nest$fgetcurrentWave(this.this$0).setProgress(AdsTuffahActivity.-$$Nest$fgetmediaPlayer(this.this$0).getCurrentPosition() / (float)AdsTuffahActivity.-$$Nest$fgetmediaPlayer(this.this$0).getDuration());
            AdsTuffahActivity.-$$Nest$fgethandler(this.this$0).postDelayed((Runnable)this, (long)50);
        }
    }
}
