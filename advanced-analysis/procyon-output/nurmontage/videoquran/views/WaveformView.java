// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class WaveformView extends View
{
    private int[] amplitudes;
    private WaveformView$OnWaveformClickListener listener;
    private Paint paint;
    private float progress;
    
    public WaveformView(final Context context, final AttributeSet set) {
        super(context, set);
        final Paint paint = new Paint();
        this.paint = paint;
        final int[] array;
        final int[] amplitudes = array = new int[18];
        array[0] = 30;
        array[1] = 40;
        array[2] = 60;
        array[3] = 80;
        array[4] = 50;
        array[5] = 90;
        array[6] = 100;
        array[7] = 70;
        array[8] = 40;
        array[9] = 60;
        array[10] = 80;
        array[11] = 50;
        array[12] = 30;
        array[13] = 50;
        array[14] = 70;
        array[15] = 90;
        array[16] = 60;
        array[17] = 40;
        this.amplitudes = amplitudes;
        this.progress = 0.0f;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint$Style.FILL);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float n = (float)this.getWidth();
        final float n2 = (float)this.getHeight();
        final float n3 = n / (this.amplitudes.length * 2);
        int n4 = 0;
        while (true) {
            final int[] amplitudes = this.amplitudes;
            if (n4 >= amplitudes.length) {
                break;
            }
            final float n5 = amplitudes[n4] / 100.0f * n2;
            final float n6 = (float)n4;
            final float n7 = n6 * (n3 + n3);
            final float n8 = (n2 - n5) / 2.0f;
            final float n9 = n6 / amplitudes.length;
            final float progress = this.progress;
            if (progress > 0.0f && n9 < progress) {
                this.paint.setColor(-1);
            }
            else {
                this.paint.setColor(-12303292);
            }
            canvas.drawRoundRect(n7, n8, n7 + n3, n8 + n5, 5.0f, 5.0f, this.paint);
            ++n4;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            return super.onTouchEvent(motionEvent);
        }
        float progress = motionEvent.getX() / this.getWidth();
        if (progress < 0.0f) {
            progress = 0.0f;
        }
        final float n = 1.0f;
        if (progress > n) {
            progress = n;
        }
        this.setProgress(progress);
        final WaveformView$OnWaveformClickListener listener = this.listener;
        if (listener != null) {
            listener.onProgressChanged(progress);
        }
        return true;
    }
    
    public void setOnWaveformClickListener(final WaveformView$OnWaveformClickListener listener) {
        this.listener = listener;
    }
    
    public void setProgress(final float progress) {
        this.progress = progress;
        this.invalidate();
    }
}
