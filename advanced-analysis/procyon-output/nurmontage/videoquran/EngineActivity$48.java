// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import hazem.nurmontage.videoquran.model.Template;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import android.net.Uri;
import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.model.EntityMedia;

class EngineActivity$48 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ EntityAudio val$finalEntityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$pathPcm;
    final /* synthetic */ int val$w;
    
    EngineActivity$48(final EngineActivity this$0, final int val$h, final int val$w, final String val$pathPcm, final EntityAudio val$finalEntityAudio, final String val$path, final int val$index, final EntityMedia val$entityMedia) {
        this.this$0 = this$0;
        this.val$h = val$h;
        this.val$w = val$w;
        this.val$pathPcm = val$pathPcm;
        this.val$finalEntityAudio = val$finalEntityAudio;
        this.val$path = val$path;
        this.val$index = val$index;
        this.val$entityMedia = val$entityMedia;
    }
    
    public void run() {
        try {
            final int val$h = this.val$h;
            final int n = this.val$w / ((int)(val$h * 0.1f) + (int)(val$h * 0.07f));
            try {
                final float[] waveform = PCMWaveformExtractor.extractWaveform(this.val$pathPcm, n);
                try {
                    final EntityAudio val$finalEntityAudio = this.val$finalEntityAudio;
                    try {
                        final int val$w = this.val$w;
                        try {
                            val$finalEntityAudio.setAmps(waveform, val$w, this.val$h);
                            final EntityAudio val$finalEntityAudio2 = this.val$finalEntityAudio;
                            try {
                                val$finalEntityAudio2.setPath_ffmpeg(this.val$path);
                                final int val$index = this.val$index;
                                final int n2 = 1;
                                final int n3 = val$index + n2;
                                final EngineActivity this$0 = this.this$0;
                                try {
                                    final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$0);
                                    try {
                                        final List entityMediaList = -$$Nest$fgetmTemplate.getEntityMediaList();
                                        try {
                                            if (n3 >= entityMediaList.size()) {
                                                try {
                                                    final EngineActivity this$2 = this.this$0;
                                                    try {
                                                        final EngineActivity$48$1 engineActivity$48$1 = new EngineActivity$48$1(this);
                                                        final EngineActivity engineActivity = this$2;
                                                        try {
                                                            engineActivity.runOnUiThread((Runnable)engineActivity$48$1);
                                                            return;
                                                        }
                                                        catch (final Exception ex) {
                                                            ex.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    catch (final Exception ex2) {}
                                                }
                                                catch (final Exception ex3) {}
                                            }
                                            final EngineActivity this$3 = this.this$0;
                                            try {
                                                final Template -$$Nest$fgetmTemplate2 = EngineActivity.-$$Nest$fgetmTemplate(this$3);
                                                try {
                                                    final Object value = -$$Nest$fgetmTemplate2.getEntityMediaList().get(n3);
                                                    try {
                                                        final EntityMedia entityMedia = (EntityMedia)value;
                                                        try {
                                                            Label_0443: {
                                                                if (entityMedia.getVideo_path() == null) {
                                                                    break Label_0443;
                                                                }
                                                                final EngineActivity this$4 = this.this$0;
                                                                try {
                                                                    final Template -$$Nest$fgetmTemplate3 = EngineActivity.-$$Nest$fgetmTemplate(this$4);
                                                                    try {
                                                                        final String uri_upload_extract_audio_video = -$$Nest$fgetmTemplate3.getUri_upload_extract_audio_video();
                                                                        try {
                                                                            final Uri parse = Uri.parse(uri_upload_extract_audio_video);
                                                                            try {
                                                                                final EngineActivity this$5 = this.this$0;
                                                                                try {
                                                                                    final Template -$$Nest$fgetmTemplate4 = EngineActivity.-$$Nest$fgetmTemplate(this$5);
                                                                                    try {
                                                                                        final String copyFromUri = AudioUtils.copyFromUri((Context)this$4, parse, -$$Nest$fgetmTemplate4.getFolder_template());
                                                                                        try {
                                                                                            this.val$entityMedia.setVideo_path(copyFromUri);
                                                                                            final EngineActivity this$6 = this.this$0;
                                                                                            try {
                                                                                                final Template -$$Nest$fgetmTemplate5 = EngineActivity.-$$Nest$fgetmTemplate(this$6);
                                                                                                try {
                                                                                                    Label_0393: {
                                                                                                        if (-$$Nest$fgetmTemplate5.getExtension() == null) {
                                                                                                            break Label_0393;
                                                                                                        }
                                                                                                        final EngineActivity this$7 = this.this$0;
                                                                                                        try {
                                                                                                            final Template -$$Nest$fgetmTemplate6 = EngineActivity.-$$Nest$fgetmTemplate(this$7);
                                                                                                            try {
                                                                                                                final String extension = -$$Nest$fgetmTemplate6.getExtension();
                                                                                                                try {
                                                                                                                    final EntityMedia val$entityMedia = this.val$entityMedia;
                                                                                                                    try {
                                                                                                                        EngineActivity.-$$Nest$maddAudioFromVideoWithExtention(this$7, extension, val$entityMedia.getVideo_path(), n3);
                                                                                                                        return;
                                                                                                                        EngineActivity.-$$Nest$fputstart_extenstion(this.this$0, 0);
                                                                                                                        final EngineActivity this$8 = this.this$0;
                                                                                                                        try {
                                                                                                                            final EntityMedia val$entityMedia2 = this.val$entityMedia;
                                                                                                                            try {
                                                                                                                                EngineActivity.-$$Nest$mextractAudioFromVideoRecursive(this$8, val$entityMedia2.getVideo_path(), 0, (boolean)(n2 != 0), n3);
                                                                                                                                return;
                                                                                                                                final EngineActivity this$9 = this.this$0;
                                                                                                                                try {
                                                                                                                                    EngineActivity.-$$Nest$maddAudioRecitersTemplate(this$9, entityMedia.getPaths_https(), n3, (String)null);
                                                                                                                                    return;
                                                                                                                                    final EngineActivity this$10;
                                                                                                                                    Label_0486: {
                                                                                                                                        this$10 = this.this$0;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        final String uri = entityMedia.getUri();
                                                                                                                                        try {
                                                                                                                                            EngineActivity.-$$Nest$maddAudioTemplateHttp(this$10, Uri.parse(uri), n3, (String)null);
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex4) {
                                                                                                                                            ex4.printStackTrace();
                                                                                                                                            this.this$0.runOnUiThread((Runnable)new EngineActivity$48$2(this));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    catch (final Exception ex5) {}
                                                                                                                                }
                                                                                                                                catch (final Exception ex6) {}
                                                                                                                                iftrue(Label_0486:)(entityMedia.getPaths_https() == null);
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
            catch (final Exception ex33) {}
        }
        catch (final Exception ex34) {}
    }
}
