package com.google.android.material.color.utilities;

/* loaded from: classes2.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f218a1;

    /* renamed from: a2 */
    public TonalPalette f219a2;

    /* renamed from: a3 */
    public TonalPalette f220a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f221n1;

    /* renamed from: n2 */
    public TonalPalette f222n2;

    /* renamed from: of */
    public static CorePalette m290of(int i) {
        return new CorePalette(i, false);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    private CorePalette(int i, boolean z) {
        Hct fromInt = Hct.fromInt(i);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z) {
            this.f218a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f219a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f220a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f221n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f222n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f218a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f219a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f220a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f221n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f222n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
