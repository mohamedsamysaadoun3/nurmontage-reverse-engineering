/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import java.io.File;
import java.util.List;

public final class EngineActivity$$ExternalSyntheticLambda6
implements FFmpegSessionCompleteCallback {
    public final /* synthetic */ EngineActivity f$0;
    public final /* synthetic */ File f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ File f$3;

    public /* synthetic */ EngineActivity$$ExternalSyntheticLambda6(EngineActivity engineActivity, File file, List list, File file2) {
        this.f$0 = engineActivity;
        this.f$1 = file;
        this.f$2 = list;
        this.f$3 = file2;
    }

    public final void apply(FFmpegSession fFmpegSession) {
        EngineActivity engineActivity = this.f$0;
        File file = this.f$1;
        List list = this.f$2;
        File file2 = this.f$3;
        engineActivity.cfr_renamed_359(file, list, file2, fFmpegSession);
    }
}

