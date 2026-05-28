package kotlinx.coroutines.channels;

import androidx.media3.extractor.p001ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: Channels.common.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 176)
@DebugMetadata(m684c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m685f = "Channels.common.kt", m686i = {0, 0}, m687l = {TsExtractor.TS_STREAM_TYPE_AC3}, m688m = "consumeEach", m689n = {"action", "channel$iv"}, m690s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class ChannelsKt__Channels_commonKt$consumeEach$3<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__Channels_commonKt$consumeEach$3(Continuation<? super ChannelsKt__Channels_commonKt$consumeEach$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.consumeEach((BroadcastChannel) null, (Function1) null, this);
    }
}
