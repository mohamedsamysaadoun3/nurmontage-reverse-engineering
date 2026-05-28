// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class WaveformRendererPro
{
    public static Bitmap drawWave(final int n, final int n2, final float[] array, final int color, final float n3, final float n4, final float n5) {
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final int n6 = 1;
        final Paint paint = new Paint(n6);
        paint.setColor(color);
        paint.setAlpha(100);
        final float n7 = (float)n;
        final float n8 = (float)n2;
        final int n9 = (int)(array.length * n5);
        if (n9 < n6) {
            return bitmap;
        }
        final float n10 = (float)n9;
        final float n11 = n7 / n10;
        float n12 = n11 - n3;
        final float n13 = 1.0f;
        if (n12 < n13) {
            n12 = n13;
        }
        final int length = array.length;
        int i = 0;
        float n14 = 0.0f;
        int j = 0;
        float max = 0.0f;
        while (j < length) {
            max = Math.max(max, array[j]);
            ++j;
        }
        final float n15 = 0.01f;
        if (max < n15) {
            max = n15;
        }
        while (i < n9) {
            canvas.drawRoundRect(new RectF(n14, canvas.getHeight() - array[(int)(i / n10 * array.length)] / max * n8, n14 + n12, (float)canvas.getHeight()), n4, n4, paint);
            n14 += n11;
            ++i;
        }
        return bitmap;
    }
    
    public static void drawWaveInRect(final Canvas canvas, final RectF rectF, final float[] array, final int color, final float n, final float n2, final float n3) {
        final int n4 = 1;
        final Paint paint = new Paint(n4);
        paint.setColor(color);
        paint.setAlpha(100);
        final float width = rectF.width();
        final float n5 = rectF.height() * 0.85f;
        final int n6 = (int)(array.length * n3);
        if (n6 < n4) {
            return;
        }
        final float n7 = (float)n6;
        final float n8 = width / n7;
        float n9 = n8 - n;
        final float n10 = 1.0f;
        if (n9 < n10) {
            n9 = n10;
        }
        final int length = array.length;
        int i = 0;
        float max = 0.0f;
        for (int j = 0; j < length; ++j) {
            max = Math.max(max, array[j]);
        }
        final float n11 = 0.01f;
        if (max < n11) {
            max = n11;
        }
        float left = rectF.left;
        while (i < n6) {
            canvas.drawRoundRect(new RectF(left, rectF.bottom - array[(int)(i / n7 * array.length)] / max * n5, left + n9, rectF.bottom), n2, n2, paint);
            left += n8;
            ++i;
        }
    }
    
    public static void drawWaveInRect(final Canvas canvas, final RectF rectF, final float[] array, int n, float n2, final float n3, float n4, float n5, float n6) {
        final Paint paint = new Paint(1);
        paint.setColor(n);
        n = 100;
        paint.setAlpha(n);
        final float n7 = rectF.height() * 0.85f;
        final float n8 = n5 * n4;
        n5 = (n5 + n2) * n4;
        n6 /= n5;
        int i = (int)n6;
        int j = 0;
        n4 = 0.0f;
        if (i < 0) {
            i = 0;
            n2 = 0.0f;
        }
        n6 = rectF.width() / n5;
        int length = (int)n6 + 2 + i;
        if (length > array.length) {
            length = array.length;
        }
        float left = rectF.left;
        final int length2 = array.length;
        float max = 0.0f;
        while (j < length2) {
            max = Math.max(max, array[j]);
            ++j;
        }
        n4 = 0.01f;
        if (max < n4) {
            max = n4;
        }
        while (i < length) {
            n4 = array[i] / max * n7;
            canvas.drawRoundRect(new RectF(left, rectF.bottom - n4, left + n8, rectF.bottom), n3, n3, paint);
            left += n5;
            ++i;
        }
    }
    
    public static void drawWaveInRect(final Canvas canvas, final RectF rectF, final float[] array, final int color, final float n, final float n2, final float n3, final int n4) {
        if (array != null) {
            if (array.length != 0) {
                final int n5 = 1;
                final Paint paint = new Paint(n5);
                paint.setColor(color);
                paint.setAlpha(100);
                final float width = rectF.width();
                final float n6 = rectF.height() * 0.85f;
                final int n7 = (int)(array.length * n3);
                if (n7 < n5) {
                    return;
                }
                int i = 0;
                int n8;
                if (n4 < 0) {
                    n8 = 0;
                }
                else {
                    n8 = n4;
                }
                if (n8 > array.length - n7) {
                    n8 = array.length - n7;
                }
                final float n9 = width / n7;
                final float max = Math.max(1.0f, n9 - n);
                float left = rectF.left;
                float max2 = 0.0f;
                for (int j = n8; j < n8 + n7; ++j) {
                    max2 = Math.max(max2, array[j]);
                }
                final float n10 = 0.01f;
                if (max2 < n10) {
                    max2 = n10;
                }
                final RectF rectF2 = new RectF();
                while (i < n7) {
                    final int n11 = n8 + i;
                    if (n11 >= array.length) {
                        break;
                    }
                    rectF2.set(left, rectF.bottom - array[n11] / max2 * n6, left + max, rectF.bottom);
                    canvas.drawRoundRect(rectF2, n2, n2, paint);
                    left += n9;
                    ++i;
                }
            }
        }
    }
    
    public static void drawWaveProportional(final Canvas canvas, final RectF rectF, final float[] array, final int color, final float n, final float n2, final float n3, final float n4, final float n5) {
        if (array != null) {
            if (array.length != 0) {
                final int n6 = 1;
                final Paint paint = new Paint(n6);
                paint.setColor(color);
                paint.setAlpha(100);
                final float width = rectF.width();
                final float n7 = rectF.height() * 0.85f;
                final float n8 = (n5 + n) * n3;
                int n9 = (int)(n4 / n8);
                int i = 0;
                if (n9 < 0) {
                    n9 = 0;
                }
                if (n9 >= array.length) {
                    n9 = array.length - n6;
                }
                int length = (int)(width / n8) + 2 + n9;
                if (length > array.length) {
                    length = array.length;
                }
                final int length2 = array.length;
                float n10 = 0.0f;
                for (int j = 0; j < length2; ++j) {
                    final float n11 = array[j];
                    if (n11 > n10) {
                        n10 = n11;
                    }
                }
                final float n12 = 0.01f;
                if (n10 < n12) {
                    n10 = n12;
                }
                float n13 = rectF.left - n4 % n8;
                for (int n14 = length - n9; i < n14; ++i) {
                    int n15 = (int)(i / (float)n14 * (array.length - n9)) + n9;
                    if (n15 >= array.length) {
                        n15 = array.length - n6;
                    }
                    canvas.drawRoundRect(new RectF(n13, rectF.bottom - array[n15] / n10 * n7, n5 * n3 + n13, rectF.bottom), n2, n2, paint);
                    n13 += n8;
                    if (n13 > rectF.right) {
                        break;
                    }
                }
            }
        }
    }
    
    public static Bitmap drawWaveformBottom(final float[] array, final int n, final int n2, final int color, final int n3, final float n4, final int n5) {
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final Paint paint = new Paint(1);
        paint.setColor(color);
        final int length = array.length;
        float max = 0.0f;
        int i = 0;
        for (int j = 0; j < length; ++j) {
            max = Math.max(max, array[j]);
        }
        final float n6 = 0.01f;
        if (max < n6) {
            max = n6;
        }
        final int length2 = array.length;
        int n7 = 0;
        while (i < length2) {
            final float n8 = array[i] / max;
            final float n9 = (float)n2;
            canvas.drawRoundRect(new RectF((float)n7, (float)(n2 - (int)(n8 * n9)), (float)(n7 + n5), n9), n4, n4, paint);
            n7 += n5 + n3;
            ++i;
        }
        return bitmap;
    }
}
