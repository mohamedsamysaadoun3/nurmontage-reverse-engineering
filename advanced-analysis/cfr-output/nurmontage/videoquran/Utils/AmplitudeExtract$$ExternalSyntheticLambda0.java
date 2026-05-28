/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.AmplitudeExtract;
import hazem.nurmontage.videoquran.Utils.AmplitudeExtract$AmplitudeDataCallback;

public final class AmplitudeExtract$$ExternalSyntheticLambda0
implements Runnable {
    public final /* synthetic */ AmplitudeExtract f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ AmplitudeExtract$AmplitudeDataCallback f$3;

    public /* synthetic */ AmplitudeExtract$$ExternalSyntheticLambda0(AmplitudeExtract amplitudeExtract, String string2, int n, AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback) {
        this.f$0 = amplitudeExtract;
        this.f$1 = string2;
        this.f$2 = n;
        this.f$3 = amplitudeExtract$AmplitudeDataCallback;
    }

    public final void run() {
        AmplitudeExtract amplitudeExtract = this.f$0;
        String string2 = this.f$1;
        int n = this.f$2;
        AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback = this.f$3;
        amplitudeExtract.cfr_renamed_523(string2, n, amplitudeExtract$AmplitudeDataCallback);
    }
}

