package org.apache.commons.p008io.output;

/* loaded from: classes3.dex */
public interface UncheckedAppendable extends Appendable {
    @Override // java.lang.Appendable
    UncheckedAppendable append(char c);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence, int i, int i2);

    /* renamed from: on */
    static UncheckedAppendable m741on(Appendable appendable) {
        return new UncheckedAppendableImpl(appendable);
    }
}
