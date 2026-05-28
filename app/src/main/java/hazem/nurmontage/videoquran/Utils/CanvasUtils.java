package hazem.nurmontage.videoquran.Utils;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class CanvasUtils {
    public static Path drawCustomRoundedRect(Canvas canvas, float f, float value, float value0, float value0, float value0, float floatValue6) {
        Path path = new Path();
        float f7 = (value0 - f) / 2.0f;
        float f8 = (value0 - value) / 2.0f;
        float min = Math.min(value0, Math.min(f7, f8));
        float min2 = Math.min(floatValue6, Math.min(f7, f8));
        path.moveTo(f, value);
        path.lineTo(value0 - min, value);
        if (min > 0.0f) {
            float value1 = min * 2.0f;
            path.arcTo(new RectF(value0 - value1, value, value0, f9 + value), -90.0f, 90.0f, false);
        } else {
            path.lineTo(value0, value);
        }
        path.lineTo(value0, value0 - min2);
        if (min2 > 0.0f) {
            float value = min2 * 2.0f;
            path.arcTo(new RectF(value0 - f10, value0 - f10, value0, value0), 0.0f, 90.0f, false);
        } else {
            path.lineTo(value0, value0);
        }
        path.lineTo(f, f4);
        path.close();
        return path;
    }
}
