/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

public class CanvasUtils {
    public static Path drawCustomRoundedRect(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        canvas = new Path();
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 2.0f;
        float f11 = Math.min(f8 /= f10, f9 /= f10);
        f5 = Math.min(f5, f11);
        f8 = Math.min(f8, f9);
        f6 = Math.min(f6, f8);
        canvas.moveTo(f, f2);
        f8 = f3 - f5;
        canvas.lineTo(f8, f2);
        f8 = 0.0f;
        float f12 = f5 - 0.0f;
        float f13 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        f11 = 0.0f;
        float f14 = 90.0f;
        if (f13 > 0) {
            float f15 = f3 - (f5 *= f10);
            RectF rectF = new RectF(f15, f2, f3, f5 += f2);
            f7 = -1028390912;
            f2 = -90.0f;
            canvas.arcTo(rectF, f2, f14, false);
        } else {
            canvas.lineTo(f3, f2);
        }
        f2 = f4 - f6;
        canvas.lineTo(f3, f2);
        float f16 = f6 - 0.0f;
        f7 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (f7 > 0) {
            f5 = f3 - (f6 *= f10);
            f6 = f4 - f6;
            RectF rectF = new RectF(f5, f6, f3, f4);
            canvas.arcTo(rectF, 0.0f, f14, false);
        } else {
            canvas.lineTo(f3, f4);
        }
        canvas.lineTo(f, f4);
        canvas.close();
        return canvas;
    }
}

