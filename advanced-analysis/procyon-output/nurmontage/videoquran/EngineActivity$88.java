// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.Template;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import android.net.Uri;

class EngineActivity$88 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$88(final EngineActivity this$0, final Uri val$uri) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
    }
    
    public void run() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final Uri val$uri = this.val$uri;
                try {
                    final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$0);
                    try {
                        final String copyFromUri = AudioUtils.copyFromUri((Context)this$0, val$uri, -$$Nest$fgetmTemplate.getFolder_template());
                        try {
                            try {
                                final MediaPlayer mediaPlayer = new MediaPlayer();
                                final EngineActivity this$2 = this.this$0;
                                try {
                                    mediaPlayer.setDataSource((Context)this$2, this.val$uri);
                                    final EngineActivity$88$1 onPreparedListener = new EngineActivity$88$1(this, copyFromUri);
                                    final MediaPlayer mediaPlayer2 = mediaPlayer;
                                    try {
                                        mediaPlayer2.setOnPreparedListener((MediaPlayer$OnPreparedListener)onPreparedListener);
                                        mediaPlayer.prepare();
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                        this.this$0.runOnUiThread((Runnable)new EngineActivity$88$2(this));
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
}
