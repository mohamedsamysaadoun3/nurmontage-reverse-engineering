package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Collection.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 48)
@DebugMetadata(m684c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m685f = "Collection.kt", m686i = {0}, m687l = {26}, m688m = "toCollection", m689n = {"destination"}, m690s = {"L$0"})
/* loaded from: classes2.dex */
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FlowKt__CollectionKt$toCollection$1(Continuation<? super FlowKt__CollectionKt$toCollection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.toCollection(null, null, this);
    }
}
