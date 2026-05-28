package com.google.common.collect;

import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class Hashing {

    /* renamed from: C1 */
    private static final long f288C1 = -862048943;

    /* renamed from: C2 */
    private static final long f289C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    static boolean needsResizing(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    private Hashing() {
    }

    static int smear(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * f288C1), 15) * f289C2);
    }

    static int smearedHash(@CheckForNull Object o) {
        return smear(o == null ? 0 : o.hashCode());
    }

    static int closedTableSize(int expectedEntries, double loadFactor) {
        int max = Math.max(expectedEntries, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (loadFactor * highestOneBit))) {
            return highestOneBit;
        }
        int i = highestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }
}
