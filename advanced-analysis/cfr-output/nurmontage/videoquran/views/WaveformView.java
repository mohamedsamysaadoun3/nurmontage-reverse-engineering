/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import hazem.nurmontage.videoquran.views.WaveformView$OnWaveformClickListener;

public class WaveformView
extends View {
    private int[] amplitudes;
    private WaveformView$OnWaveformClickListener listener;
    private Paint paint;
    private float progress;

    public WaveformView(Context context, AttributeSet object) {
        super(context, object);
        super();
        this.paint = context;
        Object object2 = object = (Object)new int[18];
        object2[0] = (AttributeSet)30;
        object2[1] = (AttributeSet)40;
        object2[2] = (AttributeSet)60;
        object2[3] = (AttributeSet)80;
        object2[4] = (AttributeSet)50;
        object2[5] = (AttributeSet)90;
        object2[6] = (AttributeSet)100;
        object2[7] = (AttributeSet)70;
        object2[8] = (AttributeSet)40;
        object2[9] = (AttributeSet)60;
        object2[10] = (AttributeSet)80;
        object2[11] = (AttributeSet)50;
        object2[12] = (AttributeSet)30;
        object2[13] = (AttributeSet)50;
        object2[14] = (AttributeSet)70;
        object2[15] = (AttributeSet)90;
        object2[16] = (AttributeSet)60;
        object2[17] = (AttributeSet)40;
        this.amplitudes = (int[])object;
        this.progress = 0.0f;
        context.setAntiAlias(true);
        context = this.paint;
        object = Paint.Style.FILL;
        context.setStyle((Paint.Style)object);
    }

    protected void onDraw(Canvas canvas) {
        Object object;
        int n;
        WaveformView waveformView = this;
        super.onDraw(canvas);
        int n2 = this.getWidth();
        float f = n2;
        int n3 = this.getHeight();
        float f2 = n3;
        float f3 = this.amplitudes.length * 2;
        f /= f3;
        f3 = 0.0f;
        for (int i = 0; i < (n = ((int[])(object = waveformView.amplitudes)).length); ++i) {
            n = object[i];
            float f4 = n;
            int n4 = 1120403456;
            f4 = f4 / 100.0f * f2;
            float f5 = i;
            float f6 = f + f;
            float f7 = f5 * f6;
            f6 = f2 - f4;
            float f8 = 2.0f;
            float f9 = f6 / f8;
            int n5 = ((int[])object).length;
            float f10 = n5;
            f5 /= f10;
            f10 = waveformView.progress;
            f6 = 0.0f;
            float f11 = f10 - 0.0f;
            float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (f12 > 0 && (n5 = (int)(f5 == f10 ? 0 : (f5 < f10 ? -1 : 1))) < 0) {
                object = waveformView.paint;
                n4 = -1;
                f5 = 0.0f / 0.0f;
                object.setColor(n4);
            } else {
                object = waveformView.paint;
                n4 = -12303292;
                f5 = -2.6088314E38f;
                object.setColor(n4);
            }
            float f13 = f7 + f;
            float f14 = f9 + f4;
            float f15 = 5.0f;
            Paint paint = waveformView.paint;
            float f16 = 5.0f;
            canvas.drawRoundRect(f7, f9, f13, f14, f16, f15, paint);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n;
        int n2 = motionEvent.getAction();
        if (n2 != 0 && (n2 = motionEvent.getAction()) != (n = 2)) {
            return super.onTouchEvent(motionEvent);
        }
        float f = motionEvent.getX();
        float f2 = this.getWidth();
        f /= f2;
        n2 = 0;
        f2 = 0.0f;
        WaveformView$OnWaveformClickListener waveformView$OnWaveformClickListener = null;
        float f3 = f - 0.0f;
        n = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (n < 0) {
            motionEvent = null;
            f = 0.0f;
        }
        n2 = 1065353216;
        f2 = 1.0f;
        float f4 = f - f2;
        n = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
        if (n > 0) {
            f = f2;
        }
        this.setProgress(f);
        waveformView$OnWaveformClickListener = this.listener;
        if (waveformView$OnWaveformClickListener != null) {
            waveformView$OnWaveformClickListener.onProgressChanged(f);
        }
        return true;
    }

    public void setOnWaveformClickListener(WaveformView$OnWaveformClickListener waveformView$OnWaveformClickListener) {
        this.listener = waveformView$OnWaveformClickListener;
    }

    public void setProgress(float f) {
        this.progress = f;
        this.invalidate();
    }
}

