// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$54$1 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity$54 this$1;
    final /* synthetic */ File val$file;
    final /* synthetic */ String val$path;
    
    EngineActivity$54$1(final EngineActivity$54 this$1, final File val$file, final String val$path) {
        this.this$1 = this$1;
        this.val$file = val$file;
        this.val$path = val$path;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            try {
                final EngineActivity$54 this$1 = this.this$1;
                try {
                    final EngineActivity this$2 = this$1.this$0;
                    try {
                        final RequestManager with = Glide.with((FragmentActivity)this$2);
                        try {
                            final RequestBuilder bitmap = with.asBitmap();
                            try {
                                final File val$file = this.val$file;
                                try {
                                    final RequestBuilder load = bitmap.load(Uri.fromFile(val$file));
                                    try {
                                        final FutureTarget submit = load.submit();
                                        try {
                                            final Object value = submit.get();
                                            try {
                                                final Bitmap bitmap2 = (Bitmap)value;
                                                try {
                                                    final EngineActivity$54 this$3 = this.this$1;
                                                    try {
                                                        final EntityAudio val$entityAudio = this$3.val$entityAudio;
                                                        try {
                                                            val$entityAudio.setPath_ffmpeg(this.val$path);
                                                            final EngineActivity$54 this$4 = this.this$1;
                                                            try {
                                                                final EngineActivity this$5 = this$4.this$0;
                                                                try {
                                                                    final EngineActivity$54$1$1 engineActivity$54$1$1 = new EngineActivity$54$1$1(this);
                                                                    final EngineActivity engineActivity = this$5;
                                                                    try {
                                                                        engineActivity.runOnUiThread((Runnable)engineActivity$54$1$1);
                                                                    }
                                                                    catch (final Exception ex) {
                                                                        ex.printStackTrace();
                                                                        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
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
        EngineActivity.-$$Nest$maddAudioReciters(this.this$1.this$0, this.this$1.val$recitersModels, this.this$1.val$index + 1);
    }
}
