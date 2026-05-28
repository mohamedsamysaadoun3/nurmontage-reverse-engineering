package hazem.nurmontage.videoquran.Utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class WaveformRendererPro {
    public static Bitmap drawWave(int value, int value2, float[] fArr, int value3, float floatValue, float f2, float floatValue3) {
        Bitmap createBitmap = Bitmap.createBitmap(value, value2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(value3);
        paint.setAlpha(100);
        float floatValue4 = value;
        float floatValue5 = value2;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return createBitmap;
        }
        float f6 = length;
        float f7 = floatValue4 / f6;
        float floatValue8 = f7 - floatValue;
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
        for (int value4 = 0; value4 < length; value4++) {
            canvas.drawRoundRect(new RectF(f9, canvas.getHeight() - ((fArr[(int) ((value4 / f6) * fArr.length)] / floatValue10) * floatValue5), f9 + floatValue8, canvas.getHeight()), f2, f2, paint);
            f9 += f7;
        }
        return createBitmap;
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int value, float floatValue, float f2, float floatValue3) {
        Paint paint = new Paint(1);
        paint.setColor(value);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return;
        }
        float floatValue4 = length;
        float floatValue5 = width / floatValue4;
        float f6 = floatValue5 - floatValue;
        if (f6 < 1.0f) {
            f6 = 1.0f;
        }
        float f7 = 0.0f;
        for (float floatValue8 : fArr) {
            f7 = Math.max(f7, floatValue8);
        }
        if (f7 < 0.01f) {
            f7 = 0.01f;
        }
        float f9 = rectF.left;
        for (int value2 = 0; value2 < length; value2++) {
            canvas.drawRoundRect(new RectF(f9, rectF.bottom - ((fArr[(int) ((value2 / floatValue4) * fArr.length)] / f7) * height), f9 + f6, rectF.bottom), f2, f2, paint);
            f9 += floatValue5;
        }
    }

    public static void drawWaveProportional(Canvas canvas, RectF rectF, float[] fArr, int value, float floatValue, float f2, float floatValue3, float floatValue4, float floatValue5) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(value);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        float f6 = (floatValue5 + floatValue) * floatValue3;
        int value2 = (int) (floatValue4 / f6);
        if (value2 < 0) {
            value2 = 0;
        }
        if (value2 >= fArr.length) {
            value2 = fArr.length - 1;
        }
        int value3 = ((int) (width / f6)) + 2 + value2;
        if (value3 > fArr.length) {
            value3 = fArr.length;
        }
        float f7 = 0.0f;
        for (float floatValue8 : fArr) {
            if (floatValue8 > f7) {
                f7 = floatValue8;
            }
        }
        if (f7 < 0.01f) {
            f7 = 0.01f;
        }
        float f9 = rectF.left - (floatValue4 % f6);
        int value4 = value3 - value2;
        for (int value5 = 0; value5 < value4; value5++) {
            int length = ((int) ((value5 / value4) * (fArr.length - value2))) + value2;
            if (length >= fArr.length) {
                length = fArr.length - 1;
            }
            canvas.drawRoundRect(new RectF(f9, rectF.bottom - ((fArr[length] / f7) * height), (floatValue5 * floatValue3) + f9, rectF.bottom), f2, f2, paint);
            f9 += f6;
            if (f9 > rectF.right) {
                return;
            }
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int value, float floatValue, float f2, float floatValue3, float floatValue4, float floatValue5) {
        Paint paint = new Paint(1);
        paint.setColor(value);
        paint.setAlpha(100);
        float height = rectF.height() * 0.85f;
        float f6 = floatValue4 * floatValue3;
        float f7 = (floatValue4 + floatValue) * floatValue3;
        int value2 = (int) (floatValue5 / f7);
        if (value2 < 0) {
            value2 = 0;
        }
        int width = ((int) (rectF.width() / f7)) + 2 + value2;
        if (width > fArr.length) {
            width = fArr.length;
        }
        float floatValue8 = rectF.left;
        float f9 = 0.0f;
        for (float floatValue10 : fArr) {
            f9 = Math.max(f9, floatValue10);
        }
        if (f9 < 0.01f) {
            f9 = 0.01f;
        }
        while (value2 < width) {
            canvas.drawRoundRect(new RectF(floatValue8, rectF.bottom - ((fArr[value2] / f9) * height), floatValue8 + f6, rectF.bottom), f2, f2, paint);
            floatValue8 += f7;
            value2++;
        }
    }

    public static void drawWaveInRect(Canvas canvas, RectF rectF, float[] fArr, int value, float floatValue, float f2, float floatValue3, int value2) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setColor(value);
        paint.setAlpha(100);
        float width = rectF.width();
        float height = rectF.height() * 0.85f;
        int length = (int) (fArr.length * floatValue3);
        if (length < 1) {
            return;
        }
        int value3 = value2 < 0 ? 0 : value2;
        if (value3 > fArr.length - length) {
            value3 = fArr.length - length;
        }
        float floatValue4 = width / length;
        float max = Math.max(1.0f, floatValue4 - floatValue);
        float floatValue5 = rectF.left;
        float f6 = 0.0f;
        for (int value4 = value3; value4 < value3 + length; value4++) {
            f6 = Math.max(f6, fArr[value4]);
        }
        if (f6 < 0.01f) {
            f6 = 0.01f;
        }
        RectF rectF2 = new RectF();
        for (int value5 = 0; value5 < length; value5++) {
            int i6 = value3 + value5;
            if (i6 >= fArr.length) {
                return;
            }
            rectF2.set(floatValue5, rectF.bottom - ((fArr[i6] / f6) * height), floatValue5 + max, rectF.bottom);
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            floatValue5 += floatValue4;
        }
    }

    public static Bitmap drawWaveformBottom(float[] fArr, int value, int value2, int value3, int value4, float floatValue, int value5) {
        Bitmap createBitmap = Bitmap.createBitmap(value, value2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(value3);
        float f2 = 0.0f;
        for (float floatValue3 : fArr) {
            f2 = Math.max(f2, floatValue3);
        }
        if (f2 < 0.01f) {
            f2 = 0.01f;
        }
        int i6 = 0;
        for (float floatValue4 : fArr) {
            canvas.drawRoundRect(new RectF(i6, value2 - ((int) ((floatValue4 / f2) * r10)), i6 + value5, value2), floatValue, floatValue, paint);
            i6 += value5 + value4;
        }
        return createBitmap;
    }
}
