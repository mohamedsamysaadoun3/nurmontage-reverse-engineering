package nl.dionsegijn.konfetti.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.emitter.Confetti;

/* compiled from: PartySystem.kt */
@Metadata(m667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m668d2 = {"toParticle", "Lnl/dionsegijn/konfetti/core/Particle;", "Lnl/dionsegijn/konfetti/core/emitter/Confetti;", "core"}, m669k = 2, m670mv = {1, 8, 0}, m672xi = 48)
/* loaded from: classes.dex */
public final class PartySystemKt {
    public static final Particle toParticle(Confetti confetti) {
        Intrinsics.checkNotNullParameter(confetti, "<this>");
        return new Particle(confetti.getLocation().getX(), confetti.getLocation().getY(), confetti.getWidth(), confetti.getWidth(), confetti.getAlphaColor(), confetti.getRotation(), confetti.getScaleX(), confetti.getShape(), confetti.getAlpha());
    }
}
