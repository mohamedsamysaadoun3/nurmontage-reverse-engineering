/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.LinearGradient
 *  android.graphics.RectF
 *  android.graphics.Shader$TileMode
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public class CreateGradient {
    public static LinearGradient createLinearGradientWithAngle(RectF rectF, float f, int[] nArray, float[] fArray) {
        double d = Math.toRadians(f);
        f = rectF.width();
        float f2 = 2.0f;
        f /= f2;
        float f3 = rectF.height() / f2;
        f2 = rectF.centerX();
        float f4 = rectF.centerY();
        double d2 = f;
        double d3 = f3;
        f = (float)Math.hypot(d2, d3);
        f3 = (float)Math.cos(d) * f;
        float f5 = (float)Math.sin(d) * f;
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        float f8 = f2 + f3;
        float f9 = f4 + f5;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        rectF = new LinearGradient(f6, f7, f8, f9, nArray, fArray, tileMode);
        return rectF;
    }
}

