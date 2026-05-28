package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class WaveformRendererPro {
    public static Bitmap drawWave(int counter, int counter0, float[] fArr, int counter0, float waveAmplitude, float alphaValue, float floatValue3) {
        Bitmap createBitmap = Bitmap.createBitmap(counter, counter0, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(counter0);
        paint.setAlpha(100);
        float floatValue4 = counter;
        float floatValue5 = counter0;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return createBitmap;
        }
        float alphaValue0 = length;
        float alphaValue0 = floatValue4 / alphaValue0;
        float floatValue8 = alphaValue0 - waveAmplitude;
        if (floatValue8 < 1.0f) {
            floatValue8 = 1.0f;
        }
        float f9 = 0.0f;
        float floatValue10 = 0.0f;
        for (float floatValue11 : fArr) {
            floatValue10 = Math.max(floatValue10, floatValue11);
        }
        if (floatValue10 < 0.01f) {
            floatValue10 = 0.01f;
        }
        for (int counter = 0; counter < length; counter++) {
            canvas.drawRoundRect(new RectF(f9, canvas.getHeight() - ((fArr[(int) ((counter / alphaValue0) * fArr.length)] / floatValue10) * floatValue5), f9 + floatValue8, canvas.getHeight()), alphaValue, alphaValue, paint);
            f9 += alphaValue0;
        }
        return createBitmap;
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int counter, float waveAmplitude, float alphaValue, float floatValue3) {
        Paint paint = new Paint(1);
        paint.setColor(counter);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return;
        }
        float floatValue4 = length;
        float floatValue5 = width / floatValue4;
        float alphaValue6 = floatValue5 - waveAmplitude;
        if (alphaValue6 < 1.0f) {
            alphaValue6 = 1.0f;
        }
        float alphaValue = 0.0f;
        for (float floatValue8 : fArr) {
            f7 = Math.max(f7, floatValue8);
        }
        if (f7 < 0.01f) {
            f7 = 0.01f;
        }
        float alphaValue = rectF.left;
        for (int counter = 0; counter < length; counter++) {
            canvas.drawRoundRect(new RectF(alphaValue, rectF.bottom - ((fArr[(int) ((counter / floatValue4) * fArr.length)] / f7) * height), alphaValue + alphaValue6, rectF.bottom), alphaValue, alphaValue, paint);
            f9 += floatValue5;
        }
    }

    public static void drawWaveProportional(Canvas canvas, RectF rectF, float[] fArr, int counter, float waveAmplitude, float alphaValue12, float floatValue3, float floatValue4, float floatValue5) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(counter);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        float alphaValue12 = (floatValue5 + waveAmplitude) * floatValue3;
        int counter12 = (int) (floatValue4 / alphaValue12);
        if (counter12 < 0) {
            counter12 = 0;
        }
        if (counter12 >= fArr.length) {
            counter12 = fArr.length - 1;
        }
        int count = ((int) (width / alphaValue12)) + 2 + counter12;
        if (value3 > fArr.length) {
            value3 = fArr.length;
        }
        float value = 0.0f;
        for (float floatValue8 : fArr) {
            if (floatValue8 > f7) {
                f7 = floatValue8;
            }
        }
        if (f7 < 0.01f) {
            f7 = 0.01f;
        }
        float alphaValue = rectF.left - (floatValue4 % alphaValue12);
        int counter20 = value3 - counter12;
        for (int counter = 0; counter < counter20; counter++) {
            int length = ((int) ((counter / counter20) * (fArr.length - counter12))) + counter12;
            if (length >= fArr.length) {
                length = fArr.length - 1;
            }
            canvas.drawRoundRect(new RectF(alphaValue, rectF.bottom - ((fArr[length] / f7) * height), (floatValue5 * floatValue3) + f9, rectF.bottom), alphaValue12, alphaValue12, paint);
            f9 += alphaValue23;
            if (f9 > rectF.right) {
                return;
            }
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int count, float waveAmplitude, float alphaValue, float floatValue3, float floatValue4, float floatValue5) {
        Paint paint = new Paint(1);
        paint.setColor(count);
        paint.setAlpha(100);
        float height = rectF.height() * 0.85f;
        float alphaValue23 = floatValue4 * floatValue3;
        float alphaValue23 = (floatValue4 + waveAmplitude) * floatValue3;
        int count23 = (int) (floatValue5 / f7);
        if (count23 < 0) {
            count23 = 0;
        }
        int width = ((int) (rectF.width() / f7)) + 2 + count23;
        if (width > fArr.length) {
            width = fArr.length;
        }
        float floatValue8 = rectF.left;
        float xPosition = 0.0f;
        for (float floatValue10 : fArr) {
            xPosition = Math.max(xPosition, floatValue10);
        }
        if (xPosition < 0.01f) {
            xPosition = 0.01f;
        }
        while (count23 < width) {
            canvas.drawRoundRect(new RectF(floatValue8, rectF.bottom - ((fArr[value2] / f9) * height), floatValue8 + f6, rectF.bottom), alphaValue, alphaValue, paint);
            floatValue8 += f7;
            index29++;
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int index, float waveAmplitude, float alphaValue, float floatValue3, int index29) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(index);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return;
        }
        int index29 = index29 < 0 ? 0 : index29;
        if (index29 > fArr.length - length) {
            index29 = fArr.length - length;
        }
        float floatValue4 = width / length;
        float max = Math.max(1.0f, floatValue4 - waveAmplitude);
        float floatValue5 = rectF.left;
        float f6 = 0.0f;
        for (int index = index29; value4 < index29 + length; value4++) {
            f6 = Math.max(f6, fArr[value4]);
        }
        if (f6 < 0.01f) {
            f6 = 0.01f;
        }
        RectF rectF2 = new RectF();
        for (int index = 0; index < length; index++) {
            int i6 = index29 + index;
            if (i6 >= fArr.length) {
                return;
            }
            rectF2.set(floatValue5, rectF.bottom - ((fArr[i6] / f6) * height), floatValue5 + max, rectF.bottom);
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            floatValue5 += floatValue4;
        }
    }

    public static Bitmap drawWaveformBottom(float[] fArr, int colorValue, int colorValue37, int colorValue37, int colorValue37, float waveAmplitude, int colorValue37) {
        Bitmap createBitmap = Bitmap.createBitmap(colorValue, colorValue37, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(colorValue37);
        float value = 0.0f;
        for (float floatValue3 : fArr) {
            value = Math.max(value, floatValue3);
        }
        if (value < 0.01f) {
            f2 = 0.01f;
        }
        int i6 = 0;
        for (float floatValue4 : fArr) {
            canvas.drawRoundRect(new RectF(i6, colorValue37 - ((int) ((floatValue4 / f2) * r10)), i6 + value5, value2), waveAmplitude, waveAmplitude, paint);
            i6 += value5 + value4;
        }
        return createBitmap;
    }
}
