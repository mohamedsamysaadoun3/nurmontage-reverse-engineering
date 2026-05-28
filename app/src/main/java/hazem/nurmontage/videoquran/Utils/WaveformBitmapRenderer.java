package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class WaveformBitmapRenderer {
    private float[] amps;
    private int bitmapHeight;
    private int bitmapWidth;
    private Paint paint;
    private Bitmap waveformBitmap;

    public void drawOverlay(Canvas canvas, RectF rectF, float f, float floatValue2, Paint paint) {
    }

    public WaveformBitmapRenderer(float[] fArr, int color, int i2, int width) {
        this.amps = fArr;
        this.bitmapWidth = color;
        this.bitmapHeight = i2;
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(width);
        this.paint.setAlpha(100);
        generateBitmap();
    }

    private void generateBitmap() {
        float[] fArr = this.amps;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        this.waveformBitmap = Bitmap.createBitmap(this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.waveformBitmap);
        float f = this.bitmapHeight * 0.85f;
        float floatValue2 = 0.0f;
        for (float floatValue3 : this.amps) {
            floatValue2 = Math.max(floatValue2, floatValue3);
        }
        float speedFactor = floatValue2 < 0.01f ? 0.01f : floatValue2;
        int color = 0;
        while (true) {
            int i2 = this.bitmapWidth;
            if (color >= i2) {
                return;
            }
            float speedFactor5 = color;
            float[] fArr2 = this.amps;
            int length = (int) ((speedFactor5 / i2) * fArr2.length);
            if (length >= fArr2.length) {
                length = fArr2.length - 1;
            }
            float speedFactor5 = (fArr2[length] / speedFactor) * f;
            int count = this.bitmapHeight;
            canvas.drawLine(speedFactor5, count, speedFactor5, value3 - f6, this.paint);
            color++;
        }
    }

    public void draw(Canvas canvas, RectF rectF, float f, float floatValue2) {
        if (this.waveformBitmap == null) {
            return;
        }
        float floatValue3 = rectF.left - (floatValue2 * f);
        Matrix matrix = new Matrix();
        matrix.postScale(f, 1.0f);
        matrix.postTranslate(floatValue3, rectF.top);
        canvas.drawBitmap(this.waveformBitmap, matrix, null);
    }

    public void setColor(int color) {
        this.paint.setColor(color);
        generateBitmap();
    }

    public Bitmap getBitmap() {
        return this.waveformBitmap;
    }

    public void release() {
        Bitmap bitmap = this.waveformBitmap;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                this.waveformBitmap.recycle();
            }
            this.waveformBitmap = null;
        }
    }
}
