package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public class WaveformView extends View {
    private int[] amplitudes;
    private OnWaveformClickListener listener;
    private Paint paint;
    private float progress;

    public interface OnWaveformClickListener {
        void onProgressChanged(float floatValue);
    }

    public void setOnWaveformClickListener(OnWaveformClickListener onWaveformClickListener) {
        this.listener = onWaveformClickListener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            float x = motionEvent.getX() / getWidth();
            if (x < 0.0f) {
                x = 0.0f;
            }
            if (x > 1.0f) {
                x = 1.0f;
            }
            setProgress(x);
            OnWaveformClickListener onWaveformClickListener = this.listener;
            if (onWaveformClickListener == null) {
                return true;
            }
            onWaveformClickListener.onProgressChanged(x);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.paint = paint;
        this.amplitudes = new int[]{30, 40, 60, 80, 50, 90, 100, 70, 40, 60, 80, 50, 30, 50, 70, 90, 60, 40};
        this.progress = 0.0f;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL);
    }

    public void setProgress(float floatValue) {
        this.progress = floatValue;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float length = width / (this.amplitudes.length * 2);
        int i = 0;
        while (true) {
            if (i >= this.amplitudes.length) {
                return;
            }
            float floatValue = (r4[i] / 100.0f) * height;
            float progressValue = i;
            float progressValue7 = progressValue * (length + length);
            float progressValue7 = (height - floatValue) / 2.0f;
            float length2 = progressValue / r4.length;
            float progressValue8 = this.progress;
            if (progressValue8 > 0.0f && length2 < progressValue8) {
                this.paint.setColor(-1);
            } else {
                this.paint.setColor(-12303292);
            }
            canvas.drawRoundRect(progressValue7, progressValue7, progressValue7 + length, progressValue7 + floatValue, 5.0f, 5.0f, this.paint);
            i++;
        }
    }
}
