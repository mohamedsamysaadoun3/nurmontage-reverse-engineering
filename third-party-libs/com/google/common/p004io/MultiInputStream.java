package com.google.common.p004io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class MultiInputStream extends InputStream {

    /* renamed from: in */
    @CheckForNull
    private InputStream f332in;

    /* renamed from: it */
    private Iterator<? extends ByteSource> f333it;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f333it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f332in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f332in = null;
            }
        }
    }

    private void advance() throws IOException {
        close();
        if (this.f333it.hasNext()) {
            this.f332in = this.f333it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f332in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f332in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        Preconditions.checkNotNull(b);
        while (true) {
            InputStream inputStream = this.f332in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(b, off, len);
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        InputStream inputStream = this.f332in;
        if (inputStream == null || n <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(n);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f332in.skip(n - 1) + 1;
    }
}
