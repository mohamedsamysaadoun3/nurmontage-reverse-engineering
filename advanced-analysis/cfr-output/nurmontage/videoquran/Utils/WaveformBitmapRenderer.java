/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

public class WaveformBitmapRenderer {
    private float[] amps;
    private int bitmapHeight;
    private int bitmapWidth;
    private Paint paint;
    private Bitmap waveformBitmap;

    public WaveformBitmapRenderer(float[] object, int n, int n2, int n3) {
        this.amps = object;
        this.bitmapWidth = n;
        this.bitmapHeight = n2;
        object = new Paint;
        super(1);
        this.paint = (Paint)object;
        object.setColor(n3);
        this.paint.setAlpha(100);
        this.generateBitmap();
    }

    private void generateBitmap() {
        int n;
        Object object = this.amps;
        if (object != null && (n = ((float[])object).length) != 0) {
            n = this.bitmapWidth;
            int n2 = this.bitmapHeight;
            Object object2 = Bitmap.Config.ARGB_8888;
            object = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)object2);
            this.waveformBitmap = (Bitmap)object;
            object = new Canvas;
            Object object3 = this.waveformBitmap;
            object(object3);
            n2 = this.bitmapHeight;
            float f = n2;
            float f2 = 0.85f;
            float f3 = f * f2;
            object3 = this.amps;
            int n3 = ((Bitmap)object3).length;
            int n4 = 0;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i = 0; i < n3; ++i) {
                Bitmap bitmap = object3[i];
                f5 = Math.max(f5, (float)bitmap);
            }
            n2 = 1008981770;
            f = 0.01f;
            float f7 = f5 - f;
            n3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            float f8 = n3 < 0 ? f : f5;
            for (int i = 0; i < (n2 = this.bitmapWidth); ++i) {
                f5 = i;
                f = n2;
                f = f5 / f;
                object2 = this.amps;
                f4 = ((Bitmap.Config)object2).length;
                n2 = (int)(f *= f4);
                n4 = ((Bitmap.Config)object2).length;
                if (n2 >= n4) {
                    n2 = ((Bitmap.Config)object2).length + -1;
                }
                f = (float)(object2[n2] / f8 * f3);
                n3 = this.bitmapHeight;
                f4 = n3;
                f6 = (float)n3 - f;
                Paint paint = this.paint;
                object3 = object;
                f2 = f5;
                object.drawLine(f5, f4, f5, f6, paint);
            }
        }
    }

    public void draw(Canvas canvas, RectF rectF, float f, float f2) {
        Bitmap bitmap = this.waveformBitmap;
        if (bitmap == null) {
            return;
        }
        float f3 = rectF.left;
        Matrix matrix = new Matrix();
        matrix.postScale(f, 1.0f);
        float f4 = rectF.top;
        matrix.postTranslate(f3 -= (f2 *= f), f4);
        rectF = this.waveformBitmap;
        canvas.drawBitmap((Bitmap)rectF, matrix, null);
    }

    public void drawOverlay(Canvas canvas, RectF rectF, float f, float f2, Paint paint) {
    }

    public Bitmap getBitmap() {
        return this.waveformBitmap;
    }

    public void release() {
        Bitmap bitmap = this.waveformBitmap;
        if (bitmap != null) {
            boolean bl = bitmap.isRecycled();
            if (!bl) {
                bitmap = this.waveformBitmap;
                bitmap.recycle();
            }
            bl = false;
            bitmap = null;
            this.waveformBitmap = null;
        }
    }

    public void setColor(int n) {
        this.paint.setColor(n);
        this.generateBitmap();
    }
}

