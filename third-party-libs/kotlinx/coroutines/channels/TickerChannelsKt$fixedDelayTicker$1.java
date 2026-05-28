package kotlinx.coroutines.channels;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TickerChannels.kt */
@Metadata(m669k = 3, m670mv = {1, 6, 0}, m672xi = 48)
@DebugMetadata(m684c = "kotlinx.coroutines.channels.TickerChannelsKt", m685f = "TickerChannels.kt", m686i = {0, 0, 1, 1, 2, 2}, m687l = {106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m688m = "fixedDelayTicker", m689n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m690s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes2.dex */
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TickerChannelsKt$fixedDelayTicker$1(Continuation<? super TickerChannelsKt$fixedDelayTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fixedDelayTicker;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fixedDelayTicker = TickerChannelsKt.fixedDelayTicker(0L, 0L, null, this);
        return fixedDelayTicker;
    }
}
