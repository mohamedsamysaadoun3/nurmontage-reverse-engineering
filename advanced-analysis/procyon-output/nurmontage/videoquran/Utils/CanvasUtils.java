// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Canvas;

public class CanvasUtils
{
    public static Path drawCustomRoundedRect(final Canvas canvas, final float n, float n2, final float n3, final float n4, float min, float min2) {
        final Path path = new Path();
        final float n5 = n3 - n;
        final float n6 = n4 - n2;
        final float n7 = 2.0f;
        final float n8 = n5 / n7;
        final float n9 = n6 / n7;
        min = Math.min(min, Math.min(n8, n9));
        min2 = Math.min(min2, Math.min(n8, n9));
        path.moveTo(n, n2);
        path.lineTo(n3 - min, n2);
        final float n10 = fcmpl(min, 0.0f);
        final float n11 = 90.0f;
        if (n10 > 0) {
            min *= n7;
            final float n12 = n3 - min;
            min += n2;
            final RectF rectF = new RectF(n12, n2, n3, min);
            n2 = -90.0f;
            path.arcTo(rectF, n2, n11, false);
        }
        else {
            path.lineTo(n3, n2);
        }
        n2 = n4 - min2;
        path.lineTo(n3, n2);
        if (min2 > 0.0f) {
            min2 *= n7;
            min = n3 - min2;
            min2 = n4 - min2;
            path.arcTo(new RectF(min, min2, n3, n4), 0.0f, n11, false);
        }
        else {
            path.lineTo(n3, n4);
        }
        path.lineTo(n, n4);
        path.close();
        return path;
    }
}
