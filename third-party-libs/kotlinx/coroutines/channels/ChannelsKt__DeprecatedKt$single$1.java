package kotlinx.coroutines.channels;

import androidx.media3.extractor.p001ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 48)
@DebugMetadata(m684c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m685f = "Deprecated.kt", m686i = {0, 0, 1, 1}, m687l = {TsExtractor.TS_STREAM_TYPE_DTS_HD, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m688m = "single", m689n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m690s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$single$1(Continuation<? super ChannelsKt__DeprecatedKt$single$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object single;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        single = ChannelsKt__DeprecatedKt.single(null, this);
        return single;
    }
}
