// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Rect;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Element;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.graphics.Bitmap;
import android.content.Context;

public class UtilsBitmap
{
    public static Bitmap blur(final Context context, Bitmap scaledBitmap, final int n, int n2) {
        if (n < 1) {
            return null;
        }
        final int width = scaledBitmap.getWidth();
        final int height = scaledBitmap.getHeight();
        final int n3 = width / n2;
        n2 = height / n2;
        scaledBitmap = Bitmap.createScaledBitmap(scaledBitmap, n3, n2, false);
        final RenderScript create = RenderScript.create(context);
        final Allocation fromBitmap = Allocation.createFromBitmap(create, scaledBitmap);
        final Allocation typed = Allocation.createTyped(create, fromBitmap.getType());
        final ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius((float)n);
        create2.setInput(fromBitmap);
        create2.forEach(typed);
        typed.copyTo(scaledBitmap);
        create.destroy();
        return Bitmap.createScaledBitmap(scaledBitmap, width, height, false);
    }
    
    public static Bitmap blurInSave(final Context context, Bitmap scaledBitmap, final int n, final int n2, final int n3, final int n4) {
        if (n < 1) {
            return null;
        }
        scaledBitmap = Bitmap.createScaledBitmap(scaledBitmap, scaledBitmap.getWidth() / n2, scaledBitmap.getHeight() / n2, false);
        final RenderScript create = RenderScript.create(context);
        final Allocation fromBitmap = Allocation.createFromBitmap(create, scaledBitmap);
        final Allocation typed = Allocation.createTyped(create, fromBitmap.getType());
        final ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius((float)n);
        create2.setInput(fromBitmap);
        create2.forEach(typed);
        typed.copyTo(scaledBitmap);
        create.destroy();
        return Bitmap.createScaledBitmap(scaledBitmap, n3, n4, false);
    }
    
    public static Bitmap cropBitmap(final Bitmap bitmap, int n, int n2) {
        int n3 = (bitmap.getWidth() - n) / 2;
        int n4 = (bitmap.getHeight() - n2) / 2;
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (n3 + n > bitmap.getWidth()) {
            n = bitmap.getWidth() - n3;
        }
        if (n4 + n2 > bitmap.getHeight()) {
            n2 = bitmap.getHeight() - n4;
        }
        return Bitmap.createBitmap(bitmap, n3, n4, n, n2);
    }
    
    public static Bitmap cropToSquare(final Bitmap bitmap, final Rect rect) {
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
    }
    
    public static Bitmap cropToSquare(final Bitmap bitmap, final Rect rect, final float n, final float n2) {
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, (int)(bitmap.getWidth() * n), (int)(bitmap.getHeight() * n2));
        if (bitmap2.getWidth() == rect.width() && bitmap.getHeight() == rect.height()) {
            return bitmap2;
        }
        return Bitmap.createScaledBitmap(bitmap2, rect.width(), rect.height(), true);
    }
    
    public static Bitmap cropToSquare(final Bitmap bitmap, final Rect rect, final int n, int n2) {
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, n, n2);
        n2 = bitmap2.getWidth();
        if (n2 == rect.width()) {
            final int height = bitmap.getHeight();
            n2 = rect.height();
            if (height == n2) {
                return bitmap2;
            }
        }
        return Bitmap.createScaledBitmap(bitmap2, rect.width(), rect.height(), true);
    }
    
    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, final int n, final int n2, final int n3) {
        bitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - n) / 2, (bitmap.getHeight() - n2) / 2, n, n2);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)n, (float)n2);
        final Path path = new Path();
        final float n4 = (float)n3;
        path.addRoundRect(rectF, n4, n4, Path$Direction.CW);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return bitmap2;
    }
    
    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, final Rect rect, int height) {
        bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        final Path path = new Path();
        final float n = (float)height;
        path.addRoundRect(rectF, n, n, Path$Direction.CW);
        final int width = bitmap.getWidth();
        height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return bitmap2;
    }
    
    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, final Rect rect, int height, float n, float n2) {
        final int n3 = (int)(bitmap.getWidth() * n);
        final int n4 = (int)(bitmap.getHeight() * n2);
        bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, n3, n4);
        final int height2 = rect.height();
        final boolean antiAlias = true;
        if (n4 != height2 || n3 != rect.width()) {
            bitmap = Bitmap.createScaledBitmap(bitmap, rect.width(), rect.height(), antiAlias);
        }
        n = (float)bitmap.getWidth();
        n2 = (float)bitmap.getHeight();
        final RectF rectF = new RectF(0.0f, 0.0f, n, n2);
        final Path path = new Path();
        final float n5 = (float)height;
        path.addRoundRect(rectF, n5, n5, Path$Direction.CW);
        final int width = bitmap.getWidth();
        height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        paint.setAntiAlias(antiAlias);
        paint.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return bitmap2;
    }
    
    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, final Rect rect, int height, int width, int width2) {
        bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, width, width2);
        final int height2 = rect.height();
        final boolean antiAlias = true;
        Label_0073: {
            if (width2 == height2) {
                width2 = rect.width();
                if (width == width2) {
                    break Label_0073;
                }
            }
            width = rect.width();
            bitmap = Bitmap.createScaledBitmap(bitmap, width, rect.height(), antiAlias);
        }
        final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        final Path path = new Path();
        final float n = (float)height;
        path.addRoundRect(rectF, n, n, Path$Direction.CW);
        final int width3 = bitmap.getWidth();
        height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width3, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        paint.setAntiAlias(antiAlias);
        paint.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return bitmap2;
    }
    
    public static Bitmap cropToSquareWithRoundCornersPlusScale(Bitmap bitmap, final Rect rect, int height, final int n, final int n2) {
        bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        final int height2 = rect.height();
        final boolean antiAlias = true;
        if (n2 != height2 || n != rect.width()) {
            bitmap = Bitmap.createScaledBitmap(bitmap, n, n2, antiAlias);
        }
        final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        final Path path = new Path();
        final float n3 = (float)height;
        path.addRoundRect(rectF, n3, n3, Path$Direction.CW);
        final int width = bitmap.getWidth();
        height = bitmap.getHeight();
        final Bitmap bitmap2 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint();
        paint.setAntiAlias(antiAlias);
        paint.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return bitmap2;
    }
    
    public static Bitmap getResizedBitmap(final Bitmap bitmap, final int n, final int n2) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final float n3 = n / (float)width;
        final float n4 = n2 / (float)height;
        final Matrix matrix = new Matrix();
        matrix.postScale(n3, n4);
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return bitmap2;
    }
}
