/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

public final class AudioUtils$$ExternalSyntheticLambda1
implements Runnable {
    public final /* synthetic */ AudioUtils$Callback f$0;
    public final /* synthetic */ Exception f$1;

    public /* synthetic */ AudioUtils$$ExternalSyntheticLambda1(AudioUtils$Callback audioUtils$Callback, Exception exception) {
        this.f$0 = audioUtils$Callback;
        this.f$1 = exception;
    }

    public final void run() {
        AudioUtils$Callback audioUtils$Callback = this.f$0;
        Exception exception = this.f$1;
        AudioUtils.lambda$copyToLocalAsync$1(audioUtils$Callback, exception);
    }
}

