package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Builders.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 48)
@DebugMetadata(m684c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m685f = "Builders.kt", m686i = {0}, m687l = {336}, m688m = "collectTo", m689n = {"scope"}, m690s = {"L$0"})
/* loaded from: classes2.dex */
final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CallbackFlowBuilder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, Continuation<? super CallbackFlowBuilder$collectTo$1> continuation) {
        super(continuation);
        this.this$0 = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collectTo(null, this);
    }
}
