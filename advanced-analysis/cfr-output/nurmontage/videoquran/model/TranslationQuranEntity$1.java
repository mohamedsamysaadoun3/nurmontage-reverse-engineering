/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.AyaTextPreset;

class TranslationQuranEntity$1 {
    static final /* synthetic */ int[] $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    static {
        int n;
        int n2;
        AyaTextPreset ayaTextPreset;
        int[] nArray;
        block21: {
            block20: {
                block19: {
                    int n3 = AyaTextPreset.values().length;
                    nArray = new int[n3];
                    $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset = nArray;
                    try {
                        ayaTextPreset = AyaTextPreset.NONE;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {
                        break block19;
                    }
                    {
                        n2 = ayaTextPreset.ordinal();
                        n = 1;
                    }
                    {
                        nArray[n2] = n;
                    }
                }
                try {
                    nArray = $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    break block20;
                }
                {
                    ayaTextPreset = AyaTextPreset.OUTLINE;
                }
                {
                    n2 = ayaTextPreset.ordinal();
                    n = 2;
                }
                {
                    nArray[n2] = n;
                }
            }
            try {
                nArray = $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                break block21;
            }
            {
                ayaTextPreset = AyaTextPreset.SHADOW;
            }
            {
                n2 = ayaTextPreset.ordinal();
                n = 3;
            }
            {
                nArray[n2] = n;
            }
        }
        try {
            nArray = $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        {
            ayaTextPreset = AyaTextPreset.GLOW;
        }
        {
            n2 = ayaTextPreset.ordinal();
            n = 4;
        }
        {
            nArray[n2] = n;
            return;
        }
    }
}

