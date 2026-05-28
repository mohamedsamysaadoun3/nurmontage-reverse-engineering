// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import hazem.nurmontage.videoquran.model.Template;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;
import java.io.File;
import hazem.nurmontage.videoquran.Utils.FileUtils;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$88$1 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity$88 this$1;
    final /* synthetic */ String val$path;
    
    EngineActivity$88$1(final EngineActivity$88 this$1, final String val$path) {
        this.this$1 = this$1;
        this.val$path = val$path;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        final int height = EngineActivity.-$$Nest$fgetblurredImageView(this.this$1.this$0).getHeight();
        final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0);
        final int n = 1;
        -$$Nest$fgetmTemplate.setVideoSquare((boolean)(n != 0));
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$1.this$0).setVideo((boolean)(n != 0));
        EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).setName_drawable(null);
        EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).setUri_original_upload_video(this.this$1.val$uri.toString());
        EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).setUri_media_video(this.val$path);
        EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).setDuration_video_media(mediaPlayer.getDuration() / 1000);
        final File fileVideo = FileUtils.getFileVideo(EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).getFolder_template());
        final File file = new File(fileVideo, "frame_%04d.jpg");
        final File file2 = new File(fileVideo, "frame_0001.jpg");
        EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).setFrame_bg(file2.getAbsolutePath());
        final EngineActivity this$0 = this.this$1.this$0;
        final int round = Math.round(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).getMaxTime() / 1000.0f);
        final int b = 3;
        EngineActivity.-$$Nest$fputendFrame(this$0, Math.min(round, b));
        if (EngineActivity.-$$Nest$fgetendFrame(this.this$1.this$0) == 0) {
            EngineActivity.-$$Nest$fputendFrame(this.this$1.this$0, b);
        }
        final List -$$Nest$fgetid_ffmpeg = EngineActivity.-$$Nest$fgetid_ffmpeg(this.this$1.this$0);
        final String[] array = new String[17];
        array[0] = "-i";
        array[n] = this.val$path;
        array[2] = "-ss";
        final String s = "0";
        array[b] = s;
        array[4] = "-t";
        array[5] = "" + EngineActivity.-$$Nest$fgetendFrame(this.this$1.this$0);
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
        -$$Nest$fgetid_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)new EngineActivity$88$1$1(this, file2, height, file)).getSessionId());
    }
}
