// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$88$1$1 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity$88$1 this$2;
    final /* synthetic */ File val$file;
    final /* synthetic */ File val$file_frame;
    final /* synthetic */ int val$max;
    
    EngineActivity$88$1$1(final EngineActivity$88$1 this$2, final File val$file, final int val$max, final File val$file_frame) {
        this.this$2 = this$2;
        this.val$file = val$file;
        this.val$max = val$max;
        this.val$file_frame = val$file_frame;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        EngineActivity.-$$Nest$mchangeBitmap(this.this$2.this$1.this$0, this.val$file.getAbsolutePath());
        this.this$2.this$1.this$0.runOnUiThread((Runnable)new EngineActivity$88$1$1$1(this));
        final List -$$Nest$fgetid_ffmpeg = EngineActivity.-$$Nest$fgetid_ffmpeg(this.this$2.this$1.this$0);
        final String[] array = new String[17];
        array[0] = "-i";
        array[1] = this.this$2.val$path;
        array[2] = "-ss";
        final String s = "";
        array[3] = s + EngineActivity.-$$Nest$fgetendFrame(this.this$2.this$1.this$0);
        array[4] = "-r";
        array[5] = "25";
        array[6] = "-vf";
        array[7] = "scale=" + this.val$max + ":" + this.val$max + ":force_original_aspect_ratio=increase";
        array[8] = "-start_number";
        array[9] = s + EngineActivity.-$$Nest$fgetendFrame(this.this$2.this$1.this$0) * 25;
        array[10] = "-q:v";
        array[11] = "0";
        array[12] = "-threads";
        array[13] = "4";
        array[14] = "-an";
        array[15] = "-y";
        array[16] = this.val$file_frame.getAbsolutePath();
        -$$Nest$fgetid_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)new EngineActivity$88$1$1$2(this)).getSessionId());
    }
}
