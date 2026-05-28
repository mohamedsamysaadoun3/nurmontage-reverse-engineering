/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.AmplitudeExtract;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$AmplitudeDataCallback;

public final class AmplitudeExtract$$ExternalSyntheticLambda2
implements Runnable {
    public final /* synthetic */ AmplitudeExtract$AmplitudeDataCallback f$0;
    public final /* synthetic */ Exception f$1;

    public /* synthetic */ AmplitudeExtract$$ExternalSyntheticLambda2(AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback, Exception exception) {
        this.f$0 = amplitudeExtract$AmplitudeDataCallback;
        this.f$1 = exception;
    }

    public final void run() {
        AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback = this.f$0;
        Exception exception = this.f$1;
        AmplitudeExtract.lambda$extractAmplitudeDataAsync$1(amplitudeExtract$AmplitudeDataCallback, exception);
    }
}

