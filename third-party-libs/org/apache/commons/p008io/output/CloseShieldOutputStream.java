package org.apache.commons.p008io.output;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class CloseShieldOutputStream extends ProxyOutputStream {
    public static CloseShieldOutputStream wrap(OutputStream outputStream) {
        return new CloseShieldOutputStream(outputStream);
    }

    @Deprecated
    public CloseShieldOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.p008io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out = ClosedOutputStream.INSTANCE;
    }
}
