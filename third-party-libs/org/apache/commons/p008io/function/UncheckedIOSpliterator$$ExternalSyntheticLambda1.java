package org.apache.commons.p008io.function;

import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class UncheckedIOSpliterator$$ExternalSyntheticLambda1 implements IOConsumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ UncheckedIOSpliterator$$ExternalSyntheticLambda1(Consumer consumer) {
        this.f$0 = consumer;
    }

    @Override // org.apache.commons.p008io.function.IOConsumer
    public final void accept(Object obj) {
        this.f$0.accept(obj);
    }
}
