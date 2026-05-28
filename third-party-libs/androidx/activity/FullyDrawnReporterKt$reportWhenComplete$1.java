package androidx.activity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FullyDrawnReporter.kt */
@Metadata(m669k = 3, m670mv = {1, 8, 0}, m672xi = 176)
@DebugMetadata(m684c = "androidx.activity.FullyDrawnReporterKt", m685f = "FullyDrawnReporter.kt", m686i = {0}, m687l = {185}, m688m = "reportWhenComplete", m689n = {"$this$reportWhenComplete"}, m690s = {"L$0"})
/* loaded from: classes.dex */
final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FullyDrawnReporterKt$reportWhenComplete$1(Continuation<? super FullyDrawnReporterKt$reportWhenComplete$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}
