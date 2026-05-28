/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

public final class AudioUtils$$ExternalSyntheticLambda0
implements Runnable {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ AudioUtils$Callback f$1;

    public /* synthetic */ AudioUtils$$ExternalSyntheticLambda0(String string2, AudioUtils$Callback audioUtils$Callback) {
        this.f$0 = string2;
        this.f$1 = audioUtils$Callback;
    }

    public final void run() {
        String string2 = this.f$0;
        AudioUtils$Callback audioUtils$Callback = this.f$1;
        AudioUtils.lambda$copyToLocalAsync$0(string2, audioUtils$Callback);
    }
}

