// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment.audio_effect;

public class Reverbe
{
    private final String cmd_ffmpeg;
    private final String name;
    
    public Reverbe(final String name, final String cmd_ffmpeg) {
        this.cmd_ffmpeg = cmd_ffmpeg;
        this.name = name;
    }
    
    public String getCmd_ffmpeg() {
        return this.cmd_ffmpeg;
    }
    
    public String getName() {
        return this.name;
    }
}
