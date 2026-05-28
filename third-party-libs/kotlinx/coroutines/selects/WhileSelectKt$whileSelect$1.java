package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WhileSelect.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 176)
@DebugMetadata(m684c = "kotlinx.coroutines.selects.WhileSelectKt", m685f = "WhileSelect.kt", m686i = {0}, m687l = {37}, m688m = "whileSelect", m689n = {"builder"}, m690s = {"L$0"})
/* loaded from: classes.dex */
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WhileSelectKt$whileSelect$1(Continuation<? super WhileSelectKt$whileSelect$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WhileSelectKt.whileSelect(null, this);
    }
}
