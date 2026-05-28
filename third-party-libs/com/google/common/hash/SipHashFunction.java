package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f307c;

    /* renamed from: d */
    private final int f308d;

    /* renamed from: k0 */
    private final long f309k0;

    /* renamed from: k1 */
    private final long f310k1;

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    SipHashFunction(int c, int d, long k0, long k1) {
        Preconditions.checkArgument(c > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c);
        Preconditions.checkArgument(d > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d);
        this.f307c = c;
        this.f308d = d;
        this.f309k0 = k0;
        this.f310k1 = k1;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f307c, this.f308d, this.f309k0, this.f310k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f307c + "" + this.f308d + "(" + this.f309k0 + ", " + this.f310k1 + ")";
    }

    public boolean equals(@CheckForNull Object object) {
        if (!(object instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) object;
        return this.f307c == sipHashFunction.f307c && this.f308d == sipHashFunction.f308d && this.f309k0 == sipHashFunction.f309k0 && this.f310k1 == sipHashFunction.f310k1;
    }

    public int hashCode() {
        return (int) ((((getClass().hashCode() ^ this.f307c) ^ this.f308d) ^ this.f309k0) ^ this.f310k1);
    }

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b */
        private long f311b;

        /* renamed from: c */
        private final int f312c;

        /* renamed from: d */
        private final int f313d;
        private long finalM;

        /* renamed from: v0 */
        private long f314v0;

        /* renamed from: v1 */
        private long f315v1;

        /* renamed from: v2 */
        private long f316v2;

        /* renamed from: v3 */
        private long f317v3;

        SipHasher(int c, int d, long k0, long k1) {
            super(8);
            this.f311b = 0L;
            this.finalM = 0L;
            this.f312c = c;
            this.f313d = d;
            this.f314v0 = 8317987319222330741L ^ k0;
            this.f315v1 = 7237128888997146477L ^ k1;
            this.f316v2 = 7816392313619706465L ^ k0;
            this.f317v3 = 8387220255154660723L ^ k1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer buffer) {
            this.f311b += 8;
            processM(buffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer buffer) {
            this.f311b += buffer.remaining();
            int i = 0;
            while (buffer.hasRemaining()) {
                this.finalM ^= (buffer.get() & 255) << i;
                i += 8;
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j = this.finalM ^ (this.f311b << 56);
            this.finalM = j;
            processM(j);
            this.f316v2 ^= 255;
            sipRound(this.f313d);
            return HashCode.fromLong(((this.f314v0 ^ this.f315v1) ^ this.f316v2) ^ this.f317v3);
        }

        private void processM(long m) {
            this.f317v3 ^= m;
            sipRound(this.f312c);
            this.f314v0 = m ^ this.f314v0;
        }

        private void sipRound(int iterations) {
            for (int i = 0; i < iterations; i++) {
                long j = this.f314v0;
                long j2 = this.f315v1;
                this.f314v0 = j + j2;
                this.f316v2 += this.f317v3;
                this.f315v1 = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f317v3, 16);
                long j3 = this.f315v1;
                long j4 = this.f314v0;
                this.f315v1 = j3 ^ j4;
                this.f317v3 = rotateLeft ^ this.f316v2;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f316v2;
                long j6 = this.f315v1;
                this.f316v2 = j5 + j6;
                this.f314v0 = rotateLeft2 + this.f317v3;
                this.f315v1 = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f317v3, 21);
                long j7 = this.f315v1;
                long j8 = this.f316v2;
                this.f315v1 = j7 ^ j8;
                this.f317v3 = rotateLeft3 ^ this.f314v0;
                this.f316v2 = Long.rotateLeft(j8, 32);
            }
        }
    }
}
