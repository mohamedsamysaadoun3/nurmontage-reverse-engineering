package com.google.android.gms.internal.play_billing;

import androidx.concurrent.futures.C0127xc40028dd;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzk {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!C0127xc40028dd.m6m(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
