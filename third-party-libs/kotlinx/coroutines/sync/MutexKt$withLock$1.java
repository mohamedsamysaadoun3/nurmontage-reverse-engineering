package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Mutex.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 176)
@DebugMetadata(m684c = "kotlinx.coroutines.sync.MutexKt", m685f = "Mutex.kt", m686i = {0, 0, 0}, m687l = {112}, m688m = "withLock", m689n = {"$this$withLock", "owner", "action"}, m690s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class MutexKt$withLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MutexKt$withLock$1(Continuation<? super MutexKt$withLock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MutexKt.withLock(null, null, null, this);
    }
}
