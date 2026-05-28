package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 48)
@DebugMetadata(m684c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m685f = "Deprecated.kt", m686i = {0}, m687l = {447}, m688m = "none", m689n = {"$this$consume$iv"}, m690s = {"L$0"})
/* loaded from: classes2.dex */
final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$none$1(Continuation<? super ChannelsKt__DeprecatedKt$none$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object none;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        none = ChannelsKt__DeprecatedKt.none(null, this);
        return none;
    }
}
