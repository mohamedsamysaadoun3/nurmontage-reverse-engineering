/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment.audio_effect;

public class Reverbe {
    private final String cmd_ffmpeg;
    private final String name;

    public Reverbe(String string2, String string3) {
        this.cmd_ffmpeg = string3;
        this.name = string2;
    }

    public String getCmd_ffmpeg() {
        return this.cmd_ffmpeg;
    }

    public String getName() {
        return this.name;
    }
}

