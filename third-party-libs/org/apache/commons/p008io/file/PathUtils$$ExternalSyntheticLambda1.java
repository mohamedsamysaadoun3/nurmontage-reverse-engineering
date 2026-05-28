package org.apache.commons.p008io.file;

import java.io.InputStream;
import java.net.URL;
import org.apache.commons.p008io.function.IOSupplier;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class PathUtils$$ExternalSyntheticLambda1 implements IOSupplier {
    public final /* synthetic */ URL f$0;

    public /* synthetic */ PathUtils$$ExternalSyntheticLambda1(URL url) {
        this.f$0 = url;
    }

    @Override // org.apache.commons.p008io.function.IOSupplier
    public final Object get() {
        InputStream openStream;
        openStream = this.f$0.openStream();
        return openStream;
    }
}
