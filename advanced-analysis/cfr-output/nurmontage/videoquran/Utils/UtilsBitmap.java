/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.renderscript.Allocation
 *  android.renderscript.Element
 *  android.renderscript.RenderScript
 *  android.renderscript.ScriptIntrinsicBlur
 *  android.renderscript.Type
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;

public class UtilsBitmap {
    public static Bitmap blur(Context context, Bitmap bitmap, int n, int n2) {
        int n3 = 1;
        if (n < n3) {
            return null;
        }
        n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        int n5 = n3 / n2;
        n2 = n4 / n2;
        bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n5, (int)n2, (boolean)false);
        context = RenderScript.create((Context)context);
        Allocation allocation = Allocation.createFromBitmap((RenderScript)context, (Bitmap)bitmap);
        Type type = allocation.getType();
        type = Allocation.createTyped((RenderScript)context, (Type)type);
        Element element = Element.U8_4((RenderScript)context);
        element = ScriptIntrinsicBlur.create((RenderScript)context, (Element)element);
        float f = n;
        element.setRadius(f);
        element.setInput(allocation);
        element.forEach((Allocation)type);
        type.copyTo(bitmap);
        context.destroy();
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n4, (boolean)false);
    }

    public static Bitmap blurInSave(Context context, Bitmap bitmap, int n, int n2, int n3, int n4) {
        int n5 = 1;
        if (n < n5) {
            return null;
        }
        n5 = bitmap.getWidth();
        int n6 = bitmap.getHeight();
        bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)(n5 /= n2), (int)(n6 /= n2), (boolean)false);
        context = RenderScript.create((Context)context);
        Allocation allocation = Allocation.createFromBitmap((RenderScript)context, (Bitmap)bitmap);
        Type type = allocation.getType();
        type = Allocation.createTyped((RenderScript)context, (Type)type);
        Element element = Element.U8_4((RenderScript)context);
        element = ScriptIntrinsicBlur.create((RenderScript)context, (Element)element);
        float f = n;
        element.setRadius(f);
        element.setInput(allocation);
        element.forEach((Allocation)type);
        type.copyTo(bitmap);
        context.destroy();
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n4, (boolean)false);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int n, int n2) {
        int n3;
        int n4 = (bitmap.getWidth() - n) / 2;
        int n5 = (bitmap.getHeight() - n2) / 2;
        int n6 = 0;
        if (n4 < 0) {
            n4 = 0;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if ((n6 = n4 + n) > (n3 = bitmap.getWidth())) {
            n = bitmap.getWidth() - n4;
        }
        if ((n6 = n5 + n2) > (n3 = bitmap.getHeight())) {
            n2 = bitmap.getHeight() - n5;
        }
        return Bitmap.createBitmap((Bitmap)bitmap, (int)n4, (int)n5, (int)n, (int)n2);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect) {
        int n = rect.left;
        int n2 = rect.top;
        int n3 = rect.width();
        int n4 = rect.height();
        return Bitmap.createBitmap((Bitmap)bitmap, (int)n, (int)n2, (int)n3, (int)n4);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect, float f, float f2) {
        int n;
        int n2 = (int)((float)bitmap.getWidth() * f);
        float f3 = (float)bitmap.getHeight() * f2;
        int n3 = (int)f3;
        int n4 = rect.left;
        int n5 = rect.top;
        Bitmap bitmap2 = Bitmap.createBitmap((Bitmap)bitmap, (int)n4, (int)n5, (int)n2, (int)n3);
        if ((n3 = bitmap2.getWidth()) == (n4 = rect.width()) && (n = bitmap.getHeight()) == (n3 = rect.height())) {
            return bitmap2;
        }
        n = rect.width();
        int n6 = rect.height();
        return Bitmap.createScaledBitmap((Bitmap)bitmap2, (int)n, (int)n6, (boolean)true);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect, int n, int n2) {
        int n3;
        int n4 = rect.left;
        int n5 = rect.top;
        Bitmap bitmap2 = Bitmap.createBitmap((Bitmap)bitmap, (int)n4, (int)n5, (int)n, (int)n2);
        if ((n2 = bitmap2.getWidth()) == (n4 = rect.width()) && (n3 = bitmap.getHeight()) == (n2 = rect.height())) {
            return bitmap2;
        }
        n3 = rect.width();
        int n6 = rect.height();
        return Bitmap.createScaledBitmap((Bitmap)bitmap2, (int)n3, (int)n6, (boolean)true);
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, int n, int n2, int n3) {
        int n4 = bitmap.getWidth();
        int n5 = bitmap.getHeight();
        n4 = (n4 - n) / 2;
        n5 = (n5 - n2) / 2;
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n4, (int)n5, (int)n, (int)n2);
        float f = n;
        float f2 = n2;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Path path = new Path();
        float f3 = n3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f3, f3, direction);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas(bitmap2);
        config = new Paint();
        config.setAntiAlias(true);
        direction = Shader.TileMode.CLAMP;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        rectF = new BitmapShader(bitmap, (Shader.TileMode)direction, tileMode);
        config.setShader((Shader)rectF);
        canvas.drawPath(path, (Paint)config);
        return bitmap2;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int n) {
        int n2 = rect.left;
        int n3 = rect.top;
        int n4 = rect.width();
        int n5 = rect.height();
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n2, (int)n3, (int)n4, (int)n5);
        float f = bitmap.getWidth();
        float f2 = bitmap.getHeight();
        rect = new RectF(0.0f, 0.0f, f, f2);
        Path path = new Path();
        float f3 = n;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect((RectF)rect, f3, f3, direction);
        n5 = bitmap.getWidth();
        n = bitmap.getHeight();
        direction = Bitmap.Config.ARGB_8888;
        rect = Bitmap.createBitmap((int)n5, (int)n, (Bitmap.Config)direction);
        Canvas canvas = new Canvas((Bitmap)rect);
        direction = new Paint();
        direction.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode2);
        direction.setShader((Shader)bitmapShader);
        canvas.drawPath(path, (Paint)direction);
        return rect;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int n, float f, float f2) {
        int n2;
        int n3 = (int)((float)bitmap.getWidth() * f);
        float f3 = (float)bitmap.getHeight() * f2;
        int n4 = (int)f3;
        int n5 = rect.left;
        int bl = rect.top;
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n5, (int)bl, (int)n3, (int)n4);
        n5 = rect.height();
        boolean bl2 = true;
        if (n4 != n5 || n3 != (n4 = rect.width())) {
            n3 = rect.width();
            n2 = rect.height();
            bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n2, (boolean)bl2);
        }
        f = bitmap.getWidth();
        f2 = bitmap.getHeight();
        rect = new RectF(0.0f, 0.0f, f, f2);
        Path path = new Path();
        float f4 = n;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect((RectF)rect, f4, f4, direction);
        n2 = bitmap.getWidth();
        n = bitmap.getHeight();
        direction = Bitmap.Config.ARGB_8888;
        rect = Bitmap.createBitmap((int)n2, (int)n, (Bitmap.Config)direction);
        Canvas canvas = new Canvas((Bitmap)rect);
        direction = new Paint();
        direction.setAntiAlias(bl2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode2);
        direction.setShader((Shader)bitmapShader);
        canvas.drawPath(path, (Paint)direction);
        return rect;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int n, int n2, int n3) {
        int n4;
        int n5 = rect.left;
        int bl = rect.top;
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n5, (int)bl, (int)n2, (int)n3);
        n5 = rect.height();
        boolean bl2 = true;
        if (n3 != n5 || n2 != (n3 = rect.width())) {
            n2 = rect.width();
            n4 = rect.height();
            bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n2, (int)n4, (boolean)bl2);
        }
        float f = bitmap.getWidth();
        float f2 = bitmap.getHeight();
        rect = new RectF(0.0f, 0.0f, f, f2);
        Path path = new Path();
        float f3 = n;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect((RectF)rect, f3, f3, direction);
        n4 = bitmap.getWidth();
        n = bitmap.getHeight();
        direction = Bitmap.Config.ARGB_8888;
        rect = Bitmap.createBitmap((int)n4, (int)n, (Bitmap.Config)direction);
        Canvas canvas = new Canvas((Bitmap)rect);
        direction = new Paint();
        direction.setAntiAlias(bl2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode2);
        direction.setShader((Shader)bitmapShader);
        canvas.drawPath(path, (Paint)direction);
        return rect;
    }

    public static Bitmap cropToSquareWithRoundCornersPlusScale(Bitmap bitmap, Rect rect, int n, int n2, int n3) {
        int n4;
        int n5 = rect.left;
        int bl = rect.top;
        int n6 = rect.width();
        int n7 = rect.height();
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)n5, (int)bl, (int)n6, (int)n7);
        n5 = rect.height();
        boolean bl2 = true;
        if (n3 != n5 || n2 != (n4 = rect.width())) {
            bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n2, (int)n3, (boolean)bl2);
        }
        float f = bitmap.getWidth();
        float f2 = bitmap.getHeight();
        rect = new RectF(0.0f, 0.0f, f, f2);
        Path path = new Path();
        float f3 = n;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect((RectF)rect, f3, f3, direction);
        n4 = bitmap.getWidth();
        n = bitmap.getHeight();
        direction = Bitmap.Config.ARGB_8888;
        rect = Bitmap.createBitmap((int)n4, (int)n, (Bitmap.Config)direction);
        Canvas canvas = new Canvas((Bitmap)rect);
        direction = new Paint();
        direction.setAntiAlias(bl2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode2);
        direction.setShader((Shader)bitmapShader);
        canvas.drawPath(path, (Paint)direction);
        return rect;
    }

    public static Bitmap getResizedBitmap(Bitmap bitmap, int n, int n2) {
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        float f = n;
        float f2 = n3;
        f /= f2;
        float f3 = n2;
        f2 = n4;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f3 /= f2);
        Bitmap bitmap2 = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n3, (int)n4, (Matrix)matrix, (boolean)false);
        bitmap.recycle();
        return bitmap2;
    }
}

