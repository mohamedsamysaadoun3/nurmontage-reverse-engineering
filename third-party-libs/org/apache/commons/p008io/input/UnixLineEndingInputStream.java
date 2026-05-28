package org.apache.commons.p008io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class UnixLineEndingInputStream extends InputStream {
    private boolean atEos;
    private boolean atSlashCr;
    private boolean atSlashLf;

    /* renamed from: in */
    private final InputStream f517in;
    private final boolean lineFeedAtEndOfFile;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.f517in = inputStream;
        this.lineFeedAtEndOfFile = z;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f517in.close();
    }

    private int handleEos(boolean z) {
        if (z || !this.lineFeedAtEndOfFile || this.atSlashLf) {
            return -1;
        }
        this.atSlashLf = true;
        return 10;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw UnsupportedOperationExceptions.mark();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.atSlashCr;
        if (this.atEos) {
            return handleEos(z);
        }
        int readWithUpdate = readWithUpdate();
        if (this.atEos) {
            return handleEos(z);
        }
        if (this.atSlashCr) {
            return 10;
        }
        return (z && this.atSlashLf) ? read() : readWithUpdate;
    }

    private int readWithUpdate() throws IOException {
        int read = this.f517in.read();
        boolean z = read == -1;
        this.atEos = z;
        if (z) {
            return read;
        }
        this.atSlashCr = read == 13;
        this.atSlashLf = read == 10;
        return read;
    }
}
