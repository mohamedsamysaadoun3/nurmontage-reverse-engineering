/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

public final class AudioUtils$$ExternalSyntheticLambda2
implements Runnable {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ AudioUtils$Callback f$3;

    public /* synthetic */ AudioUtils$$ExternalSyntheticLambda2(String string2, Context context, String string3, AudioUtils$Callback audioUtils$Callback) {
        this.f$0 = string2;
        this.f$1 = context;
        this.f$2 = string3;
        this.f$3 = audioUtils$Callback;
    }

    public final void run() {
        String string2 = this.f$0;
        Context context = this.f$1;
        String string3 = this.f$2;
        AudioUtils$Callback audioUtils$Callback = this.f$3;
        AudioUtils.lambda$copyToLocalAsync$2(string2, context, string3, audioUtils$Callback);
    }
}

