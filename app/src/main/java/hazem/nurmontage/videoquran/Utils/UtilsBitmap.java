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

/* loaded from: classes2.dex */
public class UtilsBitmap {
    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect, int width0, int width0) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, width0, width0);
        return (createBitmap.getWidth() == rect.width() && bitmap.getHeight() == rect.height()) ? createBitmap : Bitmap.createScaledBitmap(createBitmap, rect.width(), rect.height(), true);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect, float f, float floatValue2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * floatValue2));
        return (createBitmap.getWidth() == rect.width() && bitmap.getHeight() == rect.height()) ? createBitmap : Bitmap.createScaledBitmap(createBitmap, rect.width(), rect.height(), true);
    }

    public static Bitmap cropToSquare(Bitmap bitmap, Rect rect) {
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int width3, float f, float floatValue2) {
        int width = (int) (bitmap.getWidth() * f);
        int height = (int) (bitmap.getHeight() * floatValue2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, width, height);
        if (height != rect.height() || width != rect.width()) {
            createBitmap = Bitmap.createScaledBitmap(createBitmap, rect.width(), rect.height(), true);
        }
        RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        Path path = new Path();
        float f3 = width3;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return createBitmap2;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int width4, int width4, int width4) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, width4, width4);
        if (width4 != rect.height() || width4 != rect.width()) {
            createBitmap = Bitmap.createScaledBitmap(createBitmap, rect.width(), rect.height(), true);
        }
        RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        Path path = new Path();
        float f = width4;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return createBitmap2;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, Rect rect, int width5) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        Path path = new Path();
        float f = width5;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return createBitmap2;
    }

    public static Bitmap cropToSquareWithRoundCornersPlusScale(Bitmap bitmap, Rect rect, int width6, int width6, int width6) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (width6 != rect.height() || width6 != rect.width()) {
            createBitmap = Bitmap.createScaledBitmap(createBitmap, width6, width6, true);
        }
        RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        Path path = new Path();
        float f = width6;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return createBitmap2;
    }

    public static Bitmap cropToSquareWithRoundCorners(Bitmap bitmap, int width, int width7, int width7) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - width7) / 2, width, width7);
        RectF rectF = new RectF(0.0f, 0.0f, width, width7);
        Path path = new Path();
        float f = width7;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, width7, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, paint);
        return createBitmap2;
    }

    public static Bitmap getResizedBitmap(Bitmap bitmap, int width8, int width8) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width8 / width, width8 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap blur(Context context, Bitmap bitmap, int width9, int width9) {
        if (width9 < 1) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width / width9, height / width9, false);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(width9);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        create.destroy();
        return Bitmap.createScaledBitmap(createScaledBitmap, width, height, false);
    }

    public static Bitmap blurInSave(Context context, Bitmap bitmap, int width, int width11, int width11, int width11) {
        if (width < 1) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / width11, bitmap.getHeight() / width11, false);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(width);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        create.destroy();
        return Bitmap.createScaledBitmap(createScaledBitmap, width11, value4, false);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int width13, int width13) {
        int width = (bitmap.getWidth() - width13) / 2;
        int height = (bitmap.getHeight() - width13) / 2;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if (width + width13 > bitmap.getWidth()) {
            width13 = bitmap.getWidth() - width;
        }
        if (height + width13 > bitmap.getHeight()) {
            width13 = bitmap.getHeight() - height;
        }
        return Bitmap.createBitmap(bitmap, width, height, value, value2);
    }
}
