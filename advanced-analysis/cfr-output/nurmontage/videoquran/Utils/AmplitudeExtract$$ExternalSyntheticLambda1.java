/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.AmplitudeExtract;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$AmplitudeDataCallback;
import java.util.List;

public final class AmplitudeExtract$$ExternalSyntheticLambda1
implements Runnable {
    public final /* synthetic */ AmplitudeExtract$AmplitudeDataCallback f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ AmplitudeExtract$$ExternalSyntheticLambda1(AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback, List list) {
        this.f$0 = amplitudeExtract$AmplitudeDataCallback;
        this.f$1 = list;
    }

    public final void run() {
        AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback = this.f$0;
        List list = this.f$1;
        AmplitudeExtract.lambda$extractAmplitudeDataAsync$0(amplitudeExtract$AmplitudeDataCallback, list);
    }
}

