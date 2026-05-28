package org.apache.commons.p008io.input;

import java.io.Reader;

/* loaded from: classes3.dex */
public class CloseShieldReader extends ProxyReader {
    public static CloseShieldReader wrap(Reader reader) {
        return new CloseShieldReader(reader);
    }

    @Deprecated
    public CloseShieldReader(Reader reader) {
        super(reader);
    }

    @Override // org.apache.commons.p008io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in = ClosedReader.INSTANCE;
    }
}
