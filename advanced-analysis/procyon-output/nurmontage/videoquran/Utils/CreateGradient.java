// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Shader$TileMode;
import android.graphics.LinearGradient;
import android.graphics.RectF;

public class CreateGradient
{
    public static LinearGradient createLinearGradientWithAngle(final RectF rectF, float width, final int[] array, final float[] array2) {
        final double radians = Math.toRadians(width);
        width = rectF.width();
        final float n = 2.0f;
        width /= n;
        final float n2 = rectF.height() / n;
        final float centerX = rectF.centerX();
        final float centerY = rectF.centerY();
        width = (float)Math.hypot(width, n2);
        final float n3 = (float)Math.cos(radians) * width;
        final float n4 = (float)Math.sin(radians) * width;
        return new LinearGradient(centerX - n3, centerY - n4, centerX + n3, centerY + n4, array, array2, Shader$TileMode.CLAMP);
    }
}
