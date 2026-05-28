package org.apache.commons.p008io.output;

import java.util.Objects;
import org.apache.commons.p008io.function.IOFunction;
import org.apache.commons.p008io.function.IOTriFunction;
import org.apache.commons.p008io.function.Uncheck;

/* loaded from: classes3.dex */
class UncheckedAppendableImpl implements UncheckedAppendable {
    private final Appendable appendable;

    UncheckedAppendableImpl(Appendable appendable) {
        this.appendable = (Appendable) Objects.requireNonNull(appendable, "appendable");
    }

    @Override // org.apache.commons.p008io.output.UncheckedAppendable, java.lang.Appendable
    public UncheckedAppendable append(char c) {
        final Appendable appendable = this.appendable;
        appendable.getClass();
        Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda0
            @Override // org.apache.commons.p008io.function.IOFunction
            public final Object apply(Object obj) {
                return appendable.append(((Character) obj).charValue());
            }
        }, Character.valueOf(c));
        return this;
    }

    @Override // org.apache.commons.p008io.output.UncheckedAppendable, java.lang.Appendable
    public UncheckedAppendable append(CharSequence charSequence) {
        final Appendable appendable = this.appendable;
        appendable.getClass();
        Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda2
            @Override // org.apache.commons.p008io.function.IOFunction
            public final Object apply(Object obj) {
                return appendable.append((CharSequence) obj);
            }
        }, charSequence);
        return this;
    }

    @Override // org.apache.commons.p008io.output.UncheckedAppendable, java.lang.Appendable
    public UncheckedAppendable append(CharSequence charSequence, int i, int i2) {
        final Appendable appendable = this.appendable;
        appendable.getClass();
        Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda1
            @Override // org.apache.commons.p008io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return appendable.append((CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }

    public String toString() {
        return this.appendable.toString();
    }
}
