package kotlinx.coroutines.flow;

import androidx.media3.extractor.p001ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Limit.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 176)
@DebugMetadata(m684c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m685f = "Limit.kt", m686i = {0}, m687l = {TsExtractor.TS_STREAM_TYPE_DTS_HD}, m688m = "collectWhile", m689n = {"collector"}, m690s = {"L$0"})
/* loaded from: classes2.dex */
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FlowKt__LimitKt$collectWhile$1(Continuation<? super FlowKt__LimitKt$collectWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.collectWhile(null, null, this);
    }
}
