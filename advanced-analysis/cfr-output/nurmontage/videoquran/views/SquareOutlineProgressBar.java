/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import java.util.Locale;

public class SquareOutlineProgressBar
extends View {
    private float cornerRadius;
    private int[] gradientColors;
    private int maxProgress;
    private final Path partialPath;
    private final Path path;
    private final PathMeasure pathMeasure;
    private int progress;
    private final Paint progressPaint;
    private LinearGradient progressShader;
    private final RectF rect;
    private String strHint;
    private float strokeWidth;
    private final TextPaint textPaint;
    private int trackColor;
    private final Paint trackPaint;
    private float xH;
    private float xP;
    private float y_hint;
    private float y_progrees;

    public SquareOutlineProgressBar(Context object) {
        super(object);
        int n = 1;
        super(n);
        this.trackPaint = object;
        super(n);
        this.progressPaint = object;
        super();
        this.rect = object;
        super();
        this.path = object;
        super();
        this.partialPath = object;
        super();
        this.pathMeasure = object;
        this.progress = 0;
        this.maxProgress = 100;
        super(n);
        this.textPaint = object;
        this.trackColor = 0x22FFFFFF;
        int n2 = Color.parseColor((String)"#a8ce46");
        n = Color.parseColor((String)"#D2DE49");
        int n3 = Color.parseColor((String)"#F4D853");
        object = new int[]{n2, n, n3};
        this.gradientColors = (int[])object;
        this.init();
    }

    public SquareOutlineProgressBar(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        int n = 1;
        super(n);
        this.trackPaint = object;
        super(n);
        this.progressPaint = object;
        super();
        this.rect = object;
        super();
        this.path = object;
        super();
        this.partialPath = object;
        super();
        this.pathMeasure = object;
        this.progress = 0;
        this.maxProgress = 100;
        super(n);
        this.textPaint = object;
        this.trackColor = 0x22FFFFFF;
        int n2 = Color.parseColor((String)"#a8ce46");
        n = Color.parseColor((String)"#D2DE49");
        int n3 = Color.parseColor((String)"#F4D853");
        object = new int[]{n2, n, n3};
        this.gradientColors = (int[])object;
        this.init();
    }

    public SquareOutlineProgressBar(Context object, AttributeSet attributeSet, int n) {
        super(object, attributeSet, n);
        int n2 = 1;
        super(n2);
        this.trackPaint = object;
        super(n2);
        this.progressPaint = object;
        super();
        this.rect = object;
        super();
        this.path = object;
        super();
        this.partialPath = object;
        super();
        this.pathMeasure = object;
        this.progress = 0;
        this.maxProgress = 100;
        super(n2);
        this.textPaint = object;
        this.trackColor = 0x22FFFFFF;
        int n3 = Color.parseColor((String)"#a8ce46");
        n2 = Color.parseColor((String)"#D2DE49");
        n = Color.parseColor((String)"#F4D853");
        object = new int[]{n3, n2, n};
        this.gradientColors = (int[])object;
        this.init();
    }

    private void init() {
        Paint paint = this.trackPaint;
        Object object = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)object);
        paint = this.trackPaint;
        object = Paint.Cap.ROUND;
        paint.setStrokeCap((Paint.Cap)object);
        paint = this.trackPaint;
        object = Paint.Join.ROUND;
        paint.setStrokeJoin((Paint.Join)object);
        paint = this.trackPaint;
        int n = this.trackColor;
        paint.setColor(n);
        paint = this.progressPaint;
        object = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)object);
        paint = this.progressPaint;
        object = Paint.Cap.ROUND;
        paint.setStrokeCap((Paint.Cap)object);
        paint = this.progressPaint;
        object = Paint.Join.ROUND;
        paint.setStrokeJoin((Paint.Join)object);
        this.textPaint.setColor(-1);
        paint = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        object = LocaleHelper.getLanguage(this.getContext());
        String string2 = "ar";
        n = ((String)object).equals(string2) ? 1 : 0;
        this.strHint = n != 0 ? (object = "\u064a\u0631\u062c\u0649 \u0639\u062f\u0645 \u0642\u0641\u0644 \u0627\u0644\u0634\u0627\u0634\u0629 \u0623\u0648 \u0627\u0644\u062a\u0628\u062f\u064a\u0644 \u0625\u0644\u0649 \u062a\u0637\u0628\u064a\u0642\u0627\u062a \u0623\u062e\u0631\u0649.") : (object = "Please don't lock the screen or switch to other apps.");
        this.textPaint.setTypeface((Typeface)paint);
    }

    private void updateShader(int n, int n2) {
        if (n != 0 && n2 != 0) {
            LinearGradient linearGradient;
            float f = n;
            float f2 = n2;
            int[] nArray = this.gradientColors;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.progressShader = linearGradient = new LinearGradient(0.0f, 0.0f, f, f2, nArray, null, tileMode);
            Paint paint = this.progressPaint;
            paint.setShader((Shader)linearGradient);
        }
    }

    public int getMax() {
        return this.maxProgress;
    }

    public int getProgress() {
        return this.progress;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.rect.left;
        float f2 = this.rect.top;
        float f3 = this.rect.right;
        float f4 = this.rect.bottom;
        float f5 = this.cornerRadius;
        Object object = this.rect;
        Object[] objectArray = this.trackPaint;
        canvas.drawRoundRect(object, f5, f5, (Paint)objectArray);
        object = Locale.US;
        objectArray = this.progress;
        objectArray = new Object[]{objectArray};
        object = String.format((Locale)object, "%% %d", objectArray);
        float f6 = this.xP;
        float f7 = this.y_progrees;
        TextPaint textPaint = this.textPaint;
        canvas.drawText((String)object, f6, f7, (Paint)textPaint);
        object = this.strHint;
        f6 = this.xH;
        f7 = this.y_hint;
        textPaint = this.textPaint;
        canvas.drawText((String)object, f6, f7, (Paint)textPaint);
        this.path.reset();
        this.partialPath.reset();
        object = this.path;
        f6 = f + f5;
        object.moveTo(f6, f2);
        object = this.path;
        f7 = f3 - f5;
        object.lineTo(f7, f2);
        object = this.path;
        float f8 = 2.0f * f5;
        float f9 = f3 - f8;
        float f10 = f2 + f8;
        RectF rectF = new RectF(f9, f2, f3, f10);
        float f11 = 90.0f;
        object.arcTo(rectF, -90.0f, f11, false);
        object = this.path;
        f7 = f4 - f5;
        object.lineTo(f3, f7);
        object = this.path;
        float f12 = f4 - f8;
        rectF = new RectF(f9, f12, f3, f4);
        object.arcTo(rectF, 0.0f, f11, false);
        this.path.lineTo(f6, f4);
        object = this.path;
        objectArray = new RectF(f, f12, f8 += f, f4);
        object.arcTo((RectF)objectArray, f11, f11, false);
        Path path = this.path;
        path.lineTo(f, f5 += f2);
        path = this.path;
        RectF rectF2 = new RectF(f, f2, f8, f10);
        path.arcTo(rectF2, 180.0f, f11, false);
        this.path.close();
        PathMeasure pathMeasure = this.pathMeasure;
        Path path2 = this.path;
        pathMeasure.setPath(path2, false);
        f = this.pathMeasure.getLength();
        f2 = this.progress;
        f4 = this.maxProgress;
        path2 = this.pathMeasure;
        path = this.partialPath;
        path2.getSegment(0.0f, f *= (f2 /= f4), path, true);
        pathMeasure = this.partialPath;
        path2 = this.progressPaint;
        canvas.drawPath((Path)pathMeasure, (Paint)path2);
    }

    protected void onMeasure(int n, int n2) {
        n = View.MeasureSpec.getSize((int)n);
        n2 = (int)((float)n / 1.618034f);
        this.setMeasuredDimension(n2, n);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.updateShader(n, n2);
        TextPaint textPaint = this.textPaint;
        float f = n;
        float f2 = 0.033f * f;
        textPaint.setTextSize(f2);
        textPaint = new Rect();
        this.cornerRadius = f2 = 0.04f * f;
        this.strokeWidth = f *= 0.0085f;
        this.trackPaint.setStrokeWidth(f);
        Paint paint = this.progressPaint;
        f2 = this.strokeWidth;
        paint.setStrokeWidth(f2);
        paint = this.textPaint;
        String string2 = this.strHint;
        n4 = string2.length();
        paint.getTextBounds(string2, 0, n4, (Rect)textPaint);
        f = this.strokeWidth / 2.0f;
        f2 = this.getWidth();
        float f3 = this.getHeight();
        RectF rectF = this.rect;
        rectF.set(f, f, f2 -= f, f3 -= f);
        f = this.rect.centerY();
        f2 = textPaint.height();
        this.y_progrees = f -= f2;
        f = this.rect.centerY();
        f2 = textPaint.height();
        this.y_hint = f += f2;
        f = this.rect.centerX();
        f2 = textPaint.width();
        f3 = 0.5f;
        this.xH = f -= (f2 *= f3);
        this.textPaint.getTextBounds("100", 0, 3, (Rect)textPaint);
        f = this.rect.centerX();
        float f4 = (float)textPaint.width() * f3;
        this.xP = f -= f4;
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
        this.invalidate();
    }

    public void setMaxProgress(int n) {
        this.maxProgress = n = Math.max(1, n);
        this.invalidate();
    }

    public void setProgress(int n) {
        int n2 = this.maxProgress;
        n = Math.min(n, n2);
        n2 = this.progress;
        if (n2 != (n = Math.max(0, n))) {
            this.progress = n;
            this.invalidate();
        }
    }

    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
        this.trackPaint.setStrokeWidth(f);
        this.progressPaint.setStrokeWidth(f);
        this.invalidate();
    }
}

