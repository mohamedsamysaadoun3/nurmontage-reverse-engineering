// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Paint;

public class WaveformBitmapRenderer
{
    private float[] amps;
    private int bitmapHeight;
    private int bitmapWidth;
    private Paint paint;
    private Bitmap waveformBitmap;
    
    public WaveformBitmapRenderer(final float[] amps, final int bitmapWidth, final int bitmapHeight, final int color) {
        this.amps = amps;
        this.bitmapWidth = bitmapWidth;
        this.bitmapHeight = bitmapHeight;
        (this.paint = new Paint(1)).setColor(color);
        this.paint.setAlpha(100);
        this.generateBitmap();
    }
    
    private void generateBitmap() {
        final float[] amps = this.amps;
        if (amps != null) {
            if (amps.length != 0) {
                this.waveformBitmap = Bitmap.createBitmap(this.bitmapWidth, this.bitmapHeight, Bitmap$Config.ARGB_8888);
                final Canvas canvas = new Canvas(this.waveformBitmap);
                final float n = this.bitmapHeight * 0.85f;
                final float[] amps2 = this.amps;
                final int length = amps2.length;
                float max = 0.0f;
                for (int i = 0; i < length; ++i) {
                    max = Math.max(max, amps2[i]);
                }
                final float n2 = 0.01f;
                float n3;
                if (max < n2) {
                    n3 = n2;
                }
                else {
                    n3 = max;
                }
                int n4 = 0;
                while (true) {
                    final int bitmapWidth = this.bitmapWidth;
                    if (n4 >= bitmapWidth) {
                        break;
                    }
                    final float n5 = (float)n4;
                    final float n6 = n5 / bitmapWidth;
                    final float[] amps3 = this.amps;
                    int n7 = (int)(n6 * amps3.length);
                    if (n7 >= amps3.length) {
                        n7 = amps3.length - 1;
                    }
                    final float n8 = amps3[n7] / n3 * n;
                    final int bitmapHeight = this.bitmapHeight;
                    canvas.drawLine(n5, (float)bitmapHeight, n5, bitmapHeight - n8, this.paint);
                    ++n4;
                }
            }
        }
    }
    
    public void draw(final Canvas canvas, final RectF rectF, final float n, float n2) {
        if (this.waveformBitmap == null) {
            return;
        }
        final float left = rectF.left;
        n2 *= n;
        final float n3 = left - n2;
        final Matrix matrix = new Matrix();
        matrix.postScale(n, 1.0f);
        matrix.postTranslate(n3, rectF.top);
        canvas.drawBitmap(this.waveformBitmap, matrix, (Paint)null);
    }
    
    public void drawOverlay(final Canvas canvas, final RectF rectF, final float n, final float n2, final Paint paint) {
    }
    
    public Bitmap getBitmap() {
        return this.waveformBitmap;
    }
    
    public void release() {
        final Bitmap waveformBitmap = this.waveformBitmap;
        if (waveformBitmap != null) {
            if (!waveformBitmap.isRecycled()) {
                this.waveformBitmap.recycle();
            }
            this.waveformBitmap = null;
        }
    }
    
    public void setColor(final int color) {
        this.paint.setColor(color);
        this.generateBitmap();
    }
}
