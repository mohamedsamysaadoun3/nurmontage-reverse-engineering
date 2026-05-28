// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;
import java.io.File;
import hazem.nurmontage.videoquran.Utils.FileUtils;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

class EngineActivity$15 implements AudioUtils$Callback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$15(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onError(final Exception ex) {
    }
    
    public void onSuccess(final String uri_media_video) {
        EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setUri_media_video(uri_media_video);
        final File fileVideo = FileUtils.getFileVideo(EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getFolder_template());
        final File file = new File(fileVideo, "frame_%04d.jpg");
        final File file2 = new File(fileVideo, "frame_0001.jpg");
        final int height = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getHeight();
        final EngineActivity this$0 = this.this$0;
        final int round = Math.round(EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getMaxTime() / 1000.0f);
        final int a = 4;
        EngineActivity.-$$Nest$fputendFrame(this$0, Math.min(a, round));
        if (EngineActivity.-$$Nest$fgetendFrame(this.this$0) == 0) {
            EngineActivity.-$$Nest$fputendFrame(this.this$0, a);
        }
        final List -$$Nest$fgetid_ffmpeg = EngineActivity.-$$Nest$fgetid_ffmpeg(this.this$0);
        final String[] array = new String[17];
        array[0] = "-i";
        array[1] = uri_media_video;
        array[2] = "-ss";
        final String s = "0";
        array[3] = s;
        array[a] = "-t";
        array[5] = "" + EngineActivity.-$$Nest$fgetendFrame(this.this$0);
        array[6] = "-r";
        array[7] = "25";
        array[8] = "-vf";
        array[9] = "scale=" + height + ":" + height + ":force_original_aspect_ratio=increase";
        array[10] = "-q:v";
        array[11] = s;
        array[12] = "-threads";
        array[13] = "4";
        array[14] = "-an";
        array[15] = "-y";
        array[16] = file.getAbsolutePath();
        -$$Nest$fgetid_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)new EngineActivity$15$1(this, file2, height, uri_media_video, file)).getSessionId());
    }
}
