/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BlurMaskFilter
 *  android.graphics.BlurMaskFilter$Blur
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.MaskFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$Op
 *  android.graphics.Point
 *  android.graphics.PointF
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RadialGradient
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.VectorDrawable
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.core.content.ContextCompat
 *  androidx.core.view.GestureDetectorCompat
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.GestureDetectorCompat;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.AspectRatioCalculator;
import hazem.nurmontage.videoquran.Utils.ColorSchemeGenerator;
import hazem.nurmontage.videoquran.Utils.ColorSchemeGenerator$Scheme;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.Utils.CreateGradient;
import hazem.nurmontage.videoquran.Utils.FontUtils;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.model.EntitySelectTool;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.Gradient;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.model.TimeModel;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.multitouch.BaseGestureDetector;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector$OnMoveGestureListener;
import hazem.nurmontage.videoquran.views.BlurredImageView$IViewCallback;
import hazem.nurmontage.videoquran.views.BlurredImageView$MoveListener;
import hazem.nurmontage.videoquran.views.BlurredImageView$ScaleListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class BlurredImageView
extends View
implements View.OnTouchListener {
    private static final float SNAP_FORCE = 0.2f;
    private static final float SNAP_THRESHOLD = 30.0f;
    Paint backgroundPaint;
    private BismilahEntity bismilahEntity;
    private Bitmap bitmapBlured;
    private Bitmap bitmapNotBlur;
    private Bitmap bitmapOriginal;
    private Bitmap bitmapSquare;
    private float btmX;
    private float btmY;
    private int clr_aya;
    private int clr_trsl;
    private int color_bg_type_classic;
    private Gradient color_gradient;
    private int color_ipad;
    private int color_line_bg;
    private String currentTime;
    Paint darkShadowPaint;
    private EntityView entity_select;
    private long frameInterval;
    private GestureDetectorCompat gestureDetector;
    private final GestureDetector.SimpleOnGestureListener gestureListener;
    private Paint grayscalePaint;
    private BlurredImageView$IViewCallback iViewCallback;
    private RectF ipad_rect;
    private boolean isAnimWatermk;
    private boolean isDrawingSquareVideo;
    private boolean isGlass;
    private boolean isNotDraw;
    private boolean isOnScale;
    private boolean isPlaying;
    private boolean isPro;
    private boolean isRemoveWattermark;
    private boolean isSquare;
    private boolean isVideo;
    private boolean isWattermark;
    private float left_square;
    Paint lightShadowPaint;
    private Paint linePaint;
    private LinearGradient linearGradient_classic;
    private int mCanvas_height;
    private int mCanvas_width;
    private float mDrawingTranslationX;
    private float mDrawingTranslationY;
    private int mIpadType;
    private BismilahEntity mIsti3adhaEntity;
    private RectF mRectWattermark;
    private int mResizetype;
    private MoveGestureDetector moveGestureDetector;
    private float newLeft_txt;
    private Paint paint;
    private Paint paintClear;
    private Paint paintIpad;
    private Paint paintLecture;
    private TextPaint paintText;
    private Paint paintWattermark;
    private float prevDistance;
    private float progress;
    private final List quranEntities;
    private float radius_cursur;
    private int radius_square;
    private RectF rectFAya;
    private RectF rectFLecture;
    private RectF rectFProgress;
    private RectF rectFSurahName;
    private Rect rectSquare;
    private String remainingTime;
    private ScaleGestureDetector scaleGestureDetector;
    private ColorSchemeGenerator$Scheme scheme;
    private EntitySelectTool selectTool;
    private boolean showCenterLineX;
    private boolean showCenterLineY;
    private long startTime;
    private SurahNameEntity surahNameEntity;
    private float top_square;
    private final List translationEntities;
    private float txt_y;
    private float wmAlpha;
    private float wmScale;
    private float wmTranslateY;

    static /* bridge */ /* synthetic */ EntityView cfr_renamed_177(BlurredImageView blurredImageView) {
        return blurredImageView.entity_select;
    }

    static /* bridge */ /* synthetic */ BlurredImageView$IViewCallback cfr_renamed_495(BlurredImageView blurredImageView) {
        return blurredImageView.iViewCallback;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_496(BlurredImageView blurredImageView) {
        return blurredImageView.isPro;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_497(BlurredImageView blurredImageView) {
        return blurredImageView.isSquare;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_498(BlurredImageView blurredImageView) {
        return blurredImageView.isWattermark;
    }

    static /* bridge */ /* synthetic */ RectF cfr_renamed_499(BlurredImageView blurredImageView) {
        return blurredImageView.mRectWattermark;
    }

    static /* bridge */ /* synthetic */ EntitySelectTool cfr_renamed_493(BlurredImageView blurredImageView) {
        return blurredImageView.selectTool;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_492(BlurredImageView blurredImageView, boolean bl) {
        blurredImageView.isOnScale = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_500(BlurredImageView blurredImageView, boolean bl) {
        blurredImageView.isSquare = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_501(BlurredImageView blurredImageView, boolean bl) {
        blurredImageView.isWattermark = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_502(BlurredImageView blurredImageView, float f) {
        blurredImageView.prevDistance = f;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_503(BlurredImageView blurredImageView, float f, float f2) {
        return blurredImageView.distanceToCenter(f, f2);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_504(BlurredImageView blurredImageView, PointF pointF) {
        blurredImageView.handleTranslate(pointF);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_505(BlurredImageView blurredImageView, MotionEvent motionEvent) {
        blurredImageView.updateSelectionOnTap(motionEvent);
    }

    public BlurredImageView(Context object) {
        super(object);
        float f;
        int n;
        this.mIpadType = n = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        super();
        this.quranEntities = object;
        super();
        this.translationEntities = object;
        super(1);
        this.paint = object;
        super();
        this.paintClear = object;
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        this.wmAlpha = f = 1.0f;
        this.wmScale = f;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        super(this);
        this.gestureListener = object;
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }

    public BlurredImageView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        float f;
        int n;
        this.mIpadType = n = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        super();
        this.quranEntities = object;
        super();
        this.translationEntities = object;
        super(1);
        this.paint = object;
        super();
        this.paintClear = object;
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        this.wmAlpha = f = 1.0f;
        this.wmScale = f;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        super(this);
        this.gestureListener = object;
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }

    public BlurredImageView(Context object, AttributeSet attributeSet, int n) {
        super(object, attributeSet, n);
        float f;
        int n2;
        this.mIpadType = n2 = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        super();
        this.quranEntities = object;
        super();
        this.translationEntities = object;
        super(1);
        this.paint = object;
        super();
        this.paintClear = object;
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        this.wmAlpha = f = 1.0f;
        this.wmScale = f;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        super(this);
        this.gestureListener = object;
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }

    private int countEntityQuran() {
        Object object;
        int n;
        int n2;
        List list = this.quranEntities;
        int n3 = list.size();
        if (n3 == (n2 = 1)) {
            return n2;
        }
        list = null;
        int n4 = 0;
        for (n3 = 0; n3 < (n = (object = this.quranEntities).size()); ++n3) {
            object = ((QuranEntity)this.quranEntities.get(n3)).getEntityQuran();
            n = ((Entity)object).visible() ? 1 : 0;
            if (n != 0) {
                ++n4;
            }
            if (n4 <= n2) continue;
            return 2;
        }
        return n4;
    }

    private int countEntityTrsl() {
        Object object;
        int n;
        int n2;
        List list = this.translationEntities;
        int n3 = list.size();
        if (n3 == (n2 = 1)) {
            return n2;
        }
        list = null;
        int n4 = 0;
        for (n3 = 0; n3 < (n = (object = this.translationEntities).size()); ++n3) {
            object = ((TranslationQuranEntity)this.translationEntities.get(n3)).getEntityTrslTimeline();
            n = ((Entity)object).visible() ? 1 : 0;
            if (n != 0) {
                ++n4;
            }
            if (n4 <= n2) continue;
            return 2;
        }
        return n4;
    }

    private float distanceToCenter(float f, float f2) {
        float f3 = this.entity_select.getRect().centerX();
        float f4 = this.entity_select.getRect().centerY();
        double d = f - f3;
        double d2 = f2 - f4;
        return (float)Math.hypot(d, d2);
    }

    private void drawAya(Canvas canvas) {
        this.paintLecture.setColor(-256);
        RectF rectF = this.rectFAya;
        Paint paint = this.paintLecture;
        canvas.drawRect(rectF, paint);
    }

    private void drawBatteryType(Canvas canvas, boolean bl, boolean bl2) {
        BlurredImageView blurredImageView = this;
        Canvas canvas2 = canvas;
        if (bl) {
            float f = this.linePaint.getStrokeWidth();
            float f2 = this.rectFProgress.width();
            RectF rectF = this.rectFProgress;
            float f3 = rectF.height();
            RectF rectF2 = this.rectFProgress;
            float f4 = rectF2.centerX();
            RectF rectF3 = this.rectFProgress;
            float f5 = rectF3.centerY();
            f2 = Math.min(f2, f3);
            f3 = 0.8f * f2;
            float f6 = 0.45f * f2;
            float f7 = 2.0f;
            float f8 = f3 / f7;
            float f9 = f4 - f8;
            f7 = f6 / f7;
            float f10 = f5 - f7;
            f7 += f5;
            float f11 = 0.07f * f3 + (f8 += f4);
            float f12 = 0.25f * f6;
            float f13 = f5 - f12;
            f12 += f5;
            Path path = new Path();
            float f14 = f;
            RectF rectF4 = new RectF(f9, f10, f8, f7);
            float f15 = f7;
            f7 = f2 * 0.05f;
            float f16 = f2;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF4, f7, f7, direction);
            rectF4 = new RectF(f8, f13, f11, f12);
            direction = Path.Direction.CW;
            path.addRect(rectF4, direction);
            rectF4 = new Path();
            f2 = 0.3f;
            f3 *= f2;
            f7 = 0.5f;
            f6 *= f7;
            f8 = f4 - (f2 *= f3);
            f6 *= f7;
            f7 = f5 - f6;
            rectF4.moveTo(f8, f7);
            rectF4.lineTo(f4, f5);
            f7 = f4 - (f3 *= 0.2f);
            rectF4.lineTo(f7, f5);
            rectF4.lineTo(f2 += f4, f6 += f5);
            rectF4.lineTo(f4, f5);
            rectF4.lineTo(f4 += f3, f5);
            rectF4.close();
            canvas.save();
            canvas.clipPath(path);
            int n = Build.VERSION.SDK_INT;
            int n2 = 26;
            f3 = 3.6E-44f;
            if (n >= n2) {
                direction = new Path();
                rectF = Path.Op.DIFFERENCE;
                direction.op(path, (Path)rectF4, (Path.Op)rectF);
                canvas.clipPath((Path)direction);
            }
            f11 -= f9;
            f = blurredImageView.progress;
            f11 *= f;
            f5 = f15;
            rectF4 = new RectF(f9, f10, f11 += f9, f15);
            direction = blurredImageView.paintIpad;
            canvas2.drawRect(rectF4, (Paint)direction);
            canvas.restore();
            rectF4 = blurredImageView.paintIpad;
            direction = Paint.Style.STROKE;
            rectF4.setStyle((Paint.Style)direction);
            rectF4 = blurredImageView.paintIpad;
            n = 0x3CCCCCCD;
            f2 = 0.025f * f16;
            rectF4.setStrokeWidth(f2);
            rectF4 = blurredImageView.paintIpad;
            canvas2.drawPath(path, (Paint)rectF4);
            canvas2 = blurredImageView.paintIpad;
            rectF4 = Paint.Style.FILL;
            canvas2.setStyle((Paint.Style)rectF4);
            canvas2 = blurredImageView.paintIpad;
            f = f14;
            canvas2.setStrokeWidth(f14);
        }
    }

    private void drawBismilah(Canvas canvas) {
        boolean bl;
        Object object = this.bismilahEntity;
        if (object != null && (bl = ((BismilahEntity)object).isVisible()) && (bl = ((Entity)(object = this.bismilahEntity.getBismilahTimeline())).visible())) {
            object = this.bismilahEntity;
            ((BismilahEntity)object).draw(canvas);
        }
        if ((object = this.mIsti3adhaEntity) != null && (bl = ((BismilahEntity)object).isVisible()) && (bl = ((Entity)(object = this.mIsti3adhaEntity.getBismilahTimeline())).visible())) {
            object = this.mIsti3adhaEntity;
            ((BismilahEntity)object).draw(canvas);
        }
    }

    private void drawBlackLayer(Canvas canvas, boolean bl, boolean bl2) {
        Paint paint;
        Paint paint2 = this.paintIpad;
        int n = 204;
        paint2.setAlpha(n);
        if (bl2) {
            paint2 = this.bitmapSquare;
            bl2 = false;
            paint = null;
            n = 0;
            canvas.drawBitmap((Bitmap)paint2, 0.0f, 0.0f, null);
        }
        paint2 = this.ipad_rect;
        paint = this.paintIpad;
        canvas.drawRect((RectF)paint2, paint);
        this.paintIpad.setAlpha(190);
    }

    private void drawBlueType(Canvas canvas, boolean bl, boolean bl2) {
        float[] fArray;
        Paint paint;
        RectF rectF;
        Paint paint2 = this.paintIpad;
        int n = -16777216;
        float f = -1.7014118E38f;
        paint2.setColor(n);
        int n2 = 0;
        float f2 = 0.0f;
        paint2 = null;
        if (bl2 && bl) {
            rectF = this.bitmapSquare;
            paint = this.grayscalePaint;
            canvas.drawBitmap((Bitmap)rectF, 0.0f, 0.0f, paint);
        }
        rectF = this.ipad_rect;
        float f3 = rectF.width();
        float f4 = this.ipad_rect.height();
        f3 = Math.min(f3, f4) * 1.3f;
        paint = this.paintIpad;
        paint.setAlpha(240);
        f4 = -0.15f * f3;
        Paint paint3 = this.paintIpad;
        float f5 = this.ipad_rect.centerX();
        int n3 = -872415232;
        int[] nArray = new int[]{n, n3, -1 << -1, 0};
        float[] fArray2 = fArray = new float[4];
        float[] fArray3 = fArray;
        fArray2[0] = 0.2f;
        fArray3[1] = 0.5f;
        fArray2[2] = 0.7f;
        fArray3[3] = 1.0f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float f6 = f4;
        float f7 = f3;
        RadialGradient radialGradient = new RadialGradient(f5, f4, f3, nArray, fArray, tileMode);
        paint3.setShader((Shader)radialGradient);
        n = 190;
        f = 2.66E-43f;
        float f8 = 0.0f;
        if (bl) {
            float f9 = this.ipad_rect.centerX();
            paint2 = this.paintIpad;
            canvas.drawCircle(f9, f4, f3, paint2);
            this.paintIpad.setShader(null);
            this.paintIpad.setAlpha(n);
            Paint paint4 = this.linePaint;
            f9 = paint4.getStrokeWidth();
            rectF = this.linePaint;
            f2 = this.rectFProgress.height() * 0.18f;
            rectF.setStrokeWidth(f2);
            f3 = this.rectFProgress.left;
            f2 = this.rectFProgress.width();
            f = this.progress;
            f5 = f3 + (f2 *= f);
            rectF = this.linePaint;
            n2 = this.color_line_bg;
            rectF.setColor(n2);
            f7 = this.rectFProgress.left;
            float f10 = this.rectFProgress.centerY();
            float f11 = this.rectFProgress.right;
            float f12 = this.rectFProgress.centerY();
            paint3 = this.linePaint;
            canvas.drawLine(f7, f10, f11, f12, paint3);
            rectF = this.linePaint;
            paint2 = this.paintLecture;
            n2 = paint2.getColor();
            rectF.setColor(n2);
            rectF = this.linePaint;
            f2 = rectF.getStrokeWidth();
            n = 0x3F000000;
            f = 0.5f;
            rectF.setStrokeWidth(f2 *= f);
            f4 = this.rectFProgress.left;
            f8 = this.rectFProgress.centerY();
            rectF = this.rectFProgress;
            f6 = rectF.centerY();
            Paint paint5 = this.linePaint;
            canvas.drawLine(f4, f8, f5, f6, paint5);
            canvas = this.linePaint;
            canvas.setStrokeWidth(f9);
        } else {
            Bitmap bitmap = this.bitmapNotBlur;
            Paint paint6 = this.grayscalePaint;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint6);
            bitmap = this.ipad_rect;
            float f13 = bitmap.centerX();
            paint2 = this.paintIpad;
            canvas.drawCircle(f13, f4, f3, paint2);
            this.paintIpad.setShader(null);
            canvas = this.paintIpad;
            canvas.setAlpha(n);
        }
    }

    private void drawCaset(Canvas canvas, boolean bl, File file) {
        float f;
        float f2;
        Shader shader;
        BlurredImageView blurredImageView = this;
        Canvas canvas2 = canvas;
        int n = this.scheme.screen1;
        ColorSchemeGenerator$Scheme colorSchemeGenerator$Scheme = this.scheme;
        int n2 = colorSchemeGenerator$Scheme.screen2;
        int n3 = this.scheme.body;
        int n4 = this.scheme.shadow;
        int n5 = this.scheme.label;
        int n6 = this.scheme.accent;
        Object object = this.paintIpad.getShader();
        this.paintIpad.setShader(null);
        int n7 = this.bitmapBlured.getWidth();
        int n8 = this.bitmapBlured.getHeight();
        canvas.drawColor(n);
        Path path = new Path();
        float f3 = this.ipad_rect.centerX();
        float f4 = this.ipad_rect.bottom;
        float f5 = 0.8f;
        path.moveTo(f3, f4 *= f5);
        float f6 = n7;
        f3 = this.ipad_rect.bottom;
        f4 = 1.065f;
        path.lineTo(f6, f3 *= f4);
        float f7 = n8;
        path.lineTo(f6, f7);
        path.lineTo(0.0f, f7);
        f7 = this.ipad_rect.bottom * f4;
        path.lineTo(0.0f, f7);
        path.close();
        this.paintIpad.setColor(n2);
        Paint paint = this.paintIpad;
        canvas.drawPath(path, paint);
        float f8 = this.ipad_rect.height() * 0.07f;
        f6 = this.ipad_rect.height() * 0.1f;
        f3 = this.ipad_rect.left - f6;
        f6 = this.ipad_rect.top;
        f4 = this.ipad_rect.right;
        float f9 = 1.01f;
        RectF rectF = this.ipad_rect;
        float f10 = rectF.bottom;
        RectF rectF2 = new RectF(f3, f6, f4 *= f9, f10);
        this.paintIpad.setColor(n4);
        Paint paint2 = this.paintIpad;
        canvas.drawRoundRect(rectF2, f8, f8, paint2);
        this.paintIpad.setColor(n3);
        paint2 = this.ipad_rect;
        paint = this.paintIpad;
        canvas.drawRoundRect((RectF)paint2, f8, f8, paint);
        path = new Path();
        float f11 = this.ipad_rect.width();
        n7 = 1047904911;
        paint = this.ipad_rect;
        f6 = paint.height() * 0.14f;
        f7 = this.ipad_rect.centerX() - (f11 *= 0.24f);
        f3 = this.ipad_rect.top;
        path.moveTo(f7, f3);
        f7 = this.ipad_rect.centerX() + f11;
        f3 = this.ipad_rect.top;
        path.lineTo(f7, f3);
        f7 = this.ipad_rect.centerX();
        f3 = 0.85f * f11;
        f4 = this.ipad_rect.top + f6;
        path.lineTo(f7 += f3, f4);
        f7 = this.ipad_rect.centerX() - f3;
        f4 = this.ipad_rect.top + f6;
        path.lineTo(f7, f4);
        path.close();
        this.paintIpad.setColor(n6);
        Paint paint3 = this.paintIpad;
        canvas.drawPath(path, paint3);
        path = new Path();
        float f12 = this.ipad_rect.centerX() - f11;
        f7 = this.ipad_rect.bottom;
        path.moveTo(f12, f7);
        f12 = this.ipad_rect.centerX() + f11;
        f11 = this.ipad_rect.bottom;
        path.lineTo(f12, f11);
        f11 = this.ipad_rect.centerX() + f3;
        f12 = this.ipad_rect.bottom - f6;
        path.lineTo(f11, f12);
        f11 = this.ipad_rect.centerX() - f3;
        f12 = this.ipad_rect.bottom - f6;
        path.lineTo(f11, f12);
        path.close();
        paint2 = this.paintIpad;
        canvas.drawPath(path, paint2);
        f8 = this.ipad_rect.width() * 0.4f;
        f11 = this.ipad_rect.height() * 0.2f;
        f12 = this.ipad_rect.top + f11;
        f3 = this.ipad_rect.centerX() - f8;
        RectF rectF3 = this.ipad_rect;
        f4 = rectF3.centerX() + f8;
        rectF2 = new RectF(f3, f12, f4, f11 += f12);
        this.paintIpad.setColor(n5);
        paint2 = this.paintIpad;
        canvas.drawRect(rectF2, paint2);
        f11 = rectF2.bottom * f9;
        RectF rectF4 = this.ipad_rect;
        float f13 = rectF4.bottom;
        n6 = 1067030938;
        f12 = 1.2f * f6;
        f7 = this.ipad_rect.centerX() - f8;
        RectF rectF5 = this.ipad_rect;
        f3 = rectF5.centerX() + f8;
        paint3 = new RectF(f7, f11, f3, f13 -= f12);
        path = this.paintIpad;
        canvas.drawRect((RectF)paint3, (Paint)path);
        f8 = paint3.height() * 0.26f;
        f11 = paint3.centerY();
        f13 = paint3.centerX();
        f7 = 2.0f * f8;
        f13 -= f7;
        f12 = paint3.centerX() + f7;
        rectF2 = this.paintIpad;
        n3 = ColorUtils.darkenColor(n3, f5);
        rectF2.setColor(n3);
        Paint paint4 = this.paintIpad;
        canvas.drawCircle(f13, f11, f8, paint4);
        paint4 = this.paintIpad;
        canvas.drawCircle(f12, f11, f8, paint4);
        paint4 = this.getContext();
        n8 = R$drawable.ic_circle_caset;
        paint4 = ContextCompat.getDrawable((Context)paint4, (int)n8);
        paint4.setTint(n2);
        n2 = Math.round(f13);
        n4 = (int)f11;
        n8 = 1061158912;
        f7 = 0.75f;
        n = (int)(f8 *= f7);
        int n9 = n2 - n;
        int n10 = n4 - n;
        int n11 = n2 + n;
        int n12 = n4 + n;
        rectF2 = new Rect(n9, n10, n11, n12);
        if (bl) {
            n11 = n10;
            long l = this.startTime;
            long l2 = 0L;
            long l3 = l - l2;
            n9 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (n9 < 0) {
                this.startTime = l = System.currentTimeMillis();
            }
            l = System.currentTimeMillis();
            shader = object;
            f2 = f6;
            long l4 = blurredImageView.startTime;
            float f14 = (float)(l - l4) / 1000.0f;
            l = 4636033603912859648L;
            double d = 90.0;
            double d2 = (double)f14 * d;
            f14 = (float)d2;
            canvas.save();
            f = n2;
            f11 = n4;
            canvas2.rotate(f14, f, f11);
            n2 = rectF2.left;
            n7 = rectF2.top;
            n9 = rectF2.right;
            n8 = rectF2.bottom;
            paint4.setBounds(n2, n7, n9, n8);
            paint4.draw(canvas2);
            canvas.restore();
            n2 = (int)f12;
            canvas.save();
            f14 = -f14;
            f6 = n2;
            canvas2.rotate(f14, f6, f11);
            n4 = n2 - n;
            n2 += n;
            n = n11;
            paint4.setBounds(n4, n11, n2, n12);
            paint4.draw(canvas2);
            canvas.restore();
            n4 = 0x3F000000;
            f11 = 0.5f;
        } else {
            shader = object;
            f2 = f6;
            path = this.rectFProgress;
            f = rectF2.width();
            n4 = 0x3F000000;
            f11 = 0.5f;
            f *= f11;
            path.left = f = f13 - f;
            path = this.rectFProgress;
            path.top = f = (float)rectF2.top;
            path = this.rectFProgress;
            f = (float)rectF2.width() * f11;
            path.right = f = f12 - f;
            n = rectF2.width();
            n2 = rectF2.height();
            object = file;
            this.saveProgressCassetBitmap(file, n, n2, (Drawable)paint4);
        }
        f6 = f2 * 0.25f;
        f8 = blurredImageView.ipad_rect.top;
        f = f2 * f11;
        n = (int)(f8 + f);
        float f15 = blurredImageView.ipad_rect.bottom - f;
        f12 *= 0.95f;
        blurredImageView.paintIpad.setColor(-1);
        f8 = n;
        colorSchemeGenerator$Scheme = blurredImageView.paintIpad;
        canvas2.drawCircle(f13 *= 1.02f, f8, f6, (Paint)colorSchemeGenerator$Scheme);
        colorSchemeGenerator$Scheme = blurredImageView.paintIpad;
        canvas2.drawCircle(f12, f8, f6, (Paint)colorSchemeGenerator$Scheme);
        path = blurredImageView.paintIpad;
        canvas2.drawCircle(f13, f15, f6, (Paint)path);
        path = blurredImageView.paintIpad;
        canvas2.drawCircle(f12, f15, f6, (Paint)path);
        canvas2 = blurredImageView.paintIpad;
        path = shader;
        canvas2.setShader(shader);
    }

    private void drawCasetNoBg(Canvas canvas, boolean bl, File file, boolean bl2) {
        float f;
        Paint paint;
        float f2;
        int n;
        Object object;
        BlurredImageView blurredImageView = this;
        Canvas canvas2 = canvas;
        int n2 = 0;
        float f3 = 0.0f;
        Path path = null;
        if (bl2) {
            object = this.bitmapSquare;
            n = 0;
            f2 = 0.0f;
            paint = null;
            canvas.drawBitmap(object, 0.0f, 0.0f, null);
        }
        object = blurredImageView.scheme;
        int n3 = object.screen2;
        n = blurredImageView.scheme.body;
        int n4 = blurredImageView.scheme.shadow;
        int n5 = blurredImageView.scheme.label;
        int n6 = blurredImageView.scheme.accent;
        Shader shader = blurredImageView.paintIpad.getShader();
        blurredImageView.paintIpad.setShader(null);
        f3 = blurredImageView.ipad_rect.height() * 0.07f;
        float f4 = blurredImageView.ipad_rect.height() * 0.1f;
        float f5 = blurredImageView.ipad_rect.left - f4;
        f4 = blurredImageView.ipad_rect.top;
        float f6 = blurredImageView.ipad_rect.right;
        float f7 = 1.01f;
        RectF rectF = blurredImageView.ipad_rect;
        float f8 = rectF.bottom;
        Object object2 = new RectF(f5, f4, f6 *= f7, f8);
        blurredImageView.paintIpad.setColor(n4);
        Paint paint2 = blurredImageView.paintIpad;
        canvas2.drawRoundRect(object2, f3, f3, paint2);
        blurredImageView.paintIpad.setColor(n);
        paint2 = blurredImageView.ipad_rect;
        Paint paint3 = blurredImageView.paintIpad;
        canvas2.drawRoundRect((RectF)paint2, f3, f3, paint3);
        path = new Path();
        float f9 = blurredImageView.ipad_rect.width() * 0.24f;
        paint3 = blurredImageView.ipad_rect;
        f4 = paint3.height() * 0.14f;
        float f10 = blurredImageView.ipad_rect.centerX() - f9;
        f5 = blurredImageView.ipad_rect.top;
        path.moveTo(f10, f5);
        f10 = blurredImageView.ipad_rect.centerX() + f9;
        f5 = blurredImageView.ipad_rect.top;
        path.lineTo(f10, f5);
        f10 = blurredImageView.ipad_rect.centerX();
        f5 = 0.85f * f9;
        f6 = blurredImageView.ipad_rect.top + f4;
        path.lineTo(f10 += f5, f6);
        f10 = blurredImageView.ipad_rect.centerX() - f5;
        f6 = blurredImageView.ipad_rect.top + f4;
        path.lineTo(f10, f6);
        path.close();
        blurredImageView.paintIpad.setColor(n6);
        Paint paint4 = blurredImageView.paintIpad;
        canvas2.drawPath(path, paint4);
        path = new Path();
        float f11 = blurredImageView.ipad_rect.centerX() - f9;
        f10 = blurredImageView.ipad_rect.bottom;
        path.moveTo(f11, f10);
        f11 = blurredImageView.ipad_rect.centerX() + f9;
        f9 = blurredImageView.ipad_rect.bottom;
        path.lineTo(f11, f9);
        f9 = blurredImageView.ipad_rect.centerX() + f5;
        f11 = blurredImageView.ipad_rect.bottom - f4;
        path.lineTo(f9, f11);
        f9 = blurredImageView.ipad_rect.centerX() - f5;
        f11 = blurredImageView.ipad_rect.bottom - f4;
        path.lineTo(f9, f11);
        path.close();
        paint2 = blurredImageView.paintIpad;
        canvas2.drawPath(path, paint2);
        f3 = blurredImageView.ipad_rect.width() * 0.4f;
        f9 = blurredImageView.ipad_rect.height() * 0.2f;
        f11 = blurredImageView.ipad_rect.top + f9;
        f5 = blurredImageView.ipad_rect.centerX() - f3;
        RectF rectF2 = blurredImageView.ipad_rect;
        f6 = rectF2.centerX() + f3;
        object2 = new RectF(f5, f11, f6, f9 += f11);
        blurredImageView.paintIpad.setColor(n5);
        paint2 = blurredImageView.paintIpad;
        canvas2.drawRect(object2, paint2);
        f9 = object2.bottom * f7;
        RectF rectF3 = blurredImageView.ipad_rect;
        float f12 = rectF3.bottom;
        n6 = 1067030938;
        f11 = 1.2f * f4;
        f10 = blurredImageView.ipad_rect.centerX() - f3;
        RectF rectF4 = blurredImageView.ipad_rect;
        f5 = rectF4.centerX() + f3;
        paint4 = new RectF(f10, f9, f5, f12 -= f11);
        path = blurredImageView.paintIpad;
        canvas2.drawRect((RectF)paint4, (Paint)path);
        f3 = paint4.height() * 0.26f;
        f9 = paint4.centerY();
        f12 = paint4.centerX();
        f10 = 2.0f * f3;
        f12 -= f10;
        f11 = paint4.centerX() + f10;
        object2 = blurredImageView.paintIpad;
        f5 = 0.8f;
        n = ColorUtils.darkenColor(n, f5);
        object2.setColor(n);
        paint = blurredImageView.paintIpad;
        canvas2.drawCircle(f12, f9, f3, paint);
        paint = blurredImageView.paintIpad;
        canvas2.drawCircle(f11, f9, f3, paint);
        paint = this.getContext();
        int n7 = R$drawable.ic_circle_caset;
        paint = ContextCompat.getDrawable((Context)paint, (int)n7);
        paint.setTint(n3);
        n3 = Math.round(f12);
        n4 = (int)f9;
        n7 = 1061158912;
        f10 = 0.75f;
        n2 = (int)(f3 *= f10);
        int n8 = n3 - n2;
        int n9 = n4 - n2;
        int n10 = n3 + n2;
        int n11 = n4 + n2;
        object2 = new Rect(n8, n9, n10, n11);
        if (bl) {
            int n12 = n9;
            long l = blurredImageView.startTime;
            long l2 = 0L;
            long l3 = l - l2;
            n8 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (n8 < 0) {
                blurredImageView.startTime = l = System.currentTimeMillis();
            }
            l = System.currentTimeMillis();
            long l4 = blurredImageView.startTime;
            f5 = l -= l4;
            f6 = 1000.0f;
            double d = 90.0;
            double d2 = (double)(f5 /= f6) * d;
            f5 = (float)d2;
            canvas.save();
            f = n3;
            f9 = n4;
            canvas2.rotate(f5, f, f9);
            n3 = object2.left;
            n9 = object2.top;
            n10 = object2.right;
            n7 = object2.bottom;
            paint.setBounds(n3, n9, n10, n7);
            paint.draw(canvas2);
            canvas.restore();
            n3 = (int)f11;
            canvas.save();
            f10 = -f5;
            f5 = n3;
            canvas2.rotate(f10, f5, f9);
            n4 = n3 - n2;
            n3 += n2;
            n7 = n11;
            n2 = n12;
            paint.setBounds(n4, n12, n3, n11);
            paint.draw(canvas2);
            canvas.restore();
            n4 = 0x3F000000;
            f9 = 0.5f;
        } else {
            path = blurredImageView.rectFProgress;
            f = object2.width();
            n4 = 0x3F000000;
            f9 = 0.5f;
            f *= f9;
            path.left = f = f12 - f;
            path = blurredImageView.rectFProgress;
            path.top = f = (float)object2.top;
            path = blurredImageView.rectFProgress;
            f = (float)object2.width() * f9;
            path.right = f = f11 - f;
            n2 = object2.width();
            n3 = object2.height();
            object2 = file;
            blurredImageView.saveProgressCassetBitmap(file, n2, n3, (Drawable)paint);
        }
        f3 = 0.25f * f4;
        f = blurredImageView.ipad_rect.top;
        n3 = (int)(f + (f4 *= f9));
        f2 = blurredImageView.ipad_rect.bottom - f4;
        f11 *= 0.95f;
        blurredImageView.paintIpad.setColor(-1);
        f = n3;
        paint2 = blurredImageView.paintIpad;
        canvas2.drawCircle(f12 *= 1.02f, f, f3, paint2);
        paint2 = blurredImageView.paintIpad;
        canvas2.drawCircle(f11, f, f3, paint2);
        object = blurredImageView.paintIpad;
        canvas2.drawCircle(f12, f2, f3, (Paint)object);
        object = blurredImageView.paintIpad;
        canvas2.drawCircle(f11, f2, f3, (Paint)object);
        blurredImageView.paintIpad.setShader(shader);
    }

    private void drawEntity(Canvas canvas) {
        Object object;
        int n;
        int n2;
        int n3 = 0;
        Object object2 = null;
        for (n2 = 0; n2 < (n = (object = this.quranEntities).size()); ++n2) {
            EntityQuranTimeline entityQuranTimeline;
            object = (QuranEntity)this.quranEntities.get(n2);
            boolean bl = ((QuranEntity)object).isVisible();
            if (!bl || !(bl = (entityQuranTimeline = ((EntityView)object).getEntityQuran()).visible())) continue;
            ((QuranEntity)object).draw(canvas);
        }
        while (n3 < (n2 = (object2 = this.translationEntities).size())) {
            object2 = (TranslationQuranEntity)this.translationEntities.get(n3);
            n = ((TranslationQuranEntity)object2).isVisible() ? 1 : 0;
            if (n != 0 && (n = (int)(((Entity)(object = ((EntityView)object2).getEntityTrslTimeline())).visible() ? 1 : 0)) != 0) {
                ((TranslationQuranEntity)object2).draw(canvas);
            }
            ++n3;
        }
    }

    private void drawEntityBitmap(File file, int n, int n2) {
        float f;
        CharSequence charSequence;
        String string2;
        Canvas canvas;
        Object object;
        int n3;
        float f2;
        float f3;
        float f4;
        int n4;
        EntityQuranTimeline entityQuranTimeline;
        int n5;
        String string3;
        int n6;
        Object object2;
        this.updateSizeAyaSave(n, n2);
        this.updateSizeTrslSave(n, n2);
        this.updateBismilahEntity(n, n2);
        int n7 = 0;
        Object object3 = null;
        int n8 = 0;
        Object object4 = null;
        float f5 = 0.0f;
        int n9 = 0;
        Object object5 = null;
        float f6 = 0.0f;
        while (true) {
            object2 = this.quranEntities;
            n6 = object2.size();
            string3 = ".png";
            n5 = 255;
            if (n8 >= n6) break;
            object2 = (QuranEntity)this.quranEntities.get(n8);
            entityQuranTimeline = ((EntityView)object2).getEntityQuran();
            n4 = entityQuranTimeline.visible();
            if (n4 != 0) {
                ((QuranEntity)object2).getPaintAya().setAlpha(n5);
                ((QuranEntity)object2).getPaintTranslationAya().setAlpha(n5);
                Transition transition = ((EntityView)object2).getEntityQuran().getTransition();
                f4 = ((EntityView)object2).getCopyRect().bottom;
                f3 = n2;
                f4 *= f3;
                f2 = ((EntityView)object2).getCopyRect().top * f3;
                f4 -= f2;
                f3 = ((EntityView)object2).getCopyRect().right;
                f2 = n;
                f3 *= f2;
                float f7 = ((EntityView)object2).getCopyRect().left * f2;
                n3 = (int)(f3 -= f7);
                n4 = (int)f4;
                object = Bitmap.Config.ARGB_8888;
                entityQuranTimeline = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)object);
                canvas = new Canvas((Bitmap)entityQuranTimeline);
                ((QuranEntity)object2).setupCanvasDraw(canvas);
                ((QuranEntity)object2).singleDraw(canvas);
                object = ((EntityView)object2).getEntityQuran();
                string2 = "quran_";
                charSequence = new StringBuilder(string2);
                charSequence = ((StringBuilder)charSequence).append(n9);
                string3 = ((StringBuilder)charSequence).append(string3).toString();
                ((EntityQuranTimeline)object).setFile(string3);
                string3 = ((EntityView)object2).getEntityQuran().getFile();
                this.saveBitmap((Bitmap)entityQuranTimeline, file, string3);
                if (transition != null) {
                    int n10 = entityQuranTimeline.getWidth();
                    f = n10;
                    transition.setFromW(f);
                }
                ++n9;
                ((QuranEntity)object2).restoreCanvas(canvas);
            }
            ++n8;
        }
        n8 = 0;
        object4 = null;
        f5 = 0.0f;
        while (n7 < (n9 = (object5 = this.translationEntities).size())) {
            object5 = (TranslationQuranEntity)this.translationEntities.get(n7);
            object2 = ((EntityView)object5).getEntityTrslTimeline();
            n6 = ((Entity)object2).visible() ? 1 : 0;
            if (n6 != 0) {
                ((TranslationQuranEntity)object5).getPaintAya().setAlpha(n5);
                object2 = ((EntityView)object5).getEntityTrslTimeline().getTransition();
                f4 = ((EntityView)object5).getCopyRect().bottom;
                f3 = n2;
                f4 *= f3;
                f2 = ((EntityView)object5).getCopyRect().top * f3;
                f3 = n;
                n3 = (int)f3;
                n4 = (int)(f4 -= f2);
                object = Bitmap.Config.ARGB_8888;
                entityQuranTimeline = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)object);
                canvas = new Canvas((Bitmap)entityQuranTimeline);
                ((TranslationQuranEntity)object5).setupCanvasDraw(canvas);
                ((TranslationQuranEntity)object5).singleDraw(canvas);
                object = ((EntityView)object5).getEntityTrslTimeline();
                string2 = "trs_";
                charSequence = new StringBuilder(string2);
                charSequence = ((StringBuilder)charSequence).append(n8).append(string3).toString();
                ((EntityTrslTimeline)object).setFile((String)charSequence);
                object = ((EntityView)object5).getEntityTrslTimeline().getFile();
                this.saveBitmap((Bitmap)entityQuranTimeline, file, (String)object);
                if (object2 != null) {
                    n4 = entityQuranTimeline.getWidth();
                    f4 = n4;
                    ((Transition)object2).setFromW(f4);
                }
                ++n8;
                ((TranslationQuranEntity)object5).restoreCanvas(canvas);
            }
            ++n7;
        }
        object3 = this.bismilahEntity;
        if (object3 != null && (n7 = (int)(((Entity)(object3 = ((BismilahEntity)object3).getBismilahTimeline())).visible() ? 1 : 0)) != 0) {
            this.bismilahEntity.getPaintAya().setAlpha(n5);
            object3 = this.bismilahEntity.getBismilahTimeline().getTransition();
            f5 = this.bismilahEntity.getCopyRect().bottom;
            f6 = n2;
            f5 *= f6;
            float f8 = this.bismilahEntity.getCopyRect().top * f6;
            f5 -= f8;
            f6 = this.bismilahEntity.getCopyRect().right;
            f8 = n;
            f6 *= f8;
            string3 = this.bismilahEntity.getCopyRect();
            f = ((RectF)string3).left * f8;
            n9 = (int)(f6 -= f);
            n8 = (int)f5;
            object2 = Bitmap.Config.ARGB_8888;
            object4 = Bitmap.createBitmap((int)n9, (int)n8, (Bitmap.Config)object2);
            object5 = new Canvas(object4);
            this.bismilahEntity.setupCanvasDraw((Canvas)object5);
            this.bismilahEntity.singleDraw((Canvas)object5);
            object5 = this.bismilahEntity.getBismilahTimeline();
            object2 = "bismilah.png";
            ((EntityBismilahTimeline)object5).setFile((String)object2);
            object5 = this.bismilahEntity.getBismilahTimeline().getFile();
            this.saveBitmap((Bitmap)object4, file, (String)object5);
            if (object3 != null) {
                n8 = object4.getWidth();
                f5 = n8;
                ((Transition)object3).setFromW(f5);
            }
        }
        if ((object3 = this.mIsti3adhaEntity) != null && (n7 = (int)(((Entity)(object3 = ((BismilahEntity)object3).getBismilahTimeline())).visible() ? 1 : 0)) != 0) {
            this.mIsti3adhaEntity.getPaintAya().setAlpha(n5);
            object3 = this.mIsti3adhaEntity.getBismilahTimeline().getTransition();
            f5 = this.mIsti3adhaEntity.getCopyRect().bottom;
            float f9 = n2;
            f5 *= f9;
            f6 = this.mIsti3adhaEntity.getCopyRect().top * f9;
            f5 -= f6;
            f9 = this.mIsti3adhaEntity.getCopyRect().right;
            float f10 = n;
            f9 *= f10;
            object5 = this.mIsti3adhaEntity.getCopyRect();
            f6 = ((RectF)object5).left * f10;
            n = (int)(f9 -= f6);
            n2 = (int)f5;
            object4 = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)object4);
            Object object6 = new Canvas(bitmap);
            this.mIsti3adhaEntity.setupCanvasDraw((Canvas)object6);
            this.mIsti3adhaEntity.singleDraw((Canvas)object6);
            object6 = this.mIsti3adhaEntity.getBismilahTimeline();
            object4 = "mIstiada.png";
            ((EntityBismilahTimeline)object6).setFile((String)object4);
            object6 = this.mIsti3adhaEntity.getBismilahTimeline().getFile();
            this.saveBitmap(bitmap, file, (String)object6);
            if (object3 != null) {
                int n11 = bitmap.getWidth();
                float f11 = n11;
                ((Transition)object3).setFromW(f11);
            }
        }
    }

    private void drawGradientLayer(Canvas canvas, boolean bl) {
        Paint paint;
        int n;
        Object object;
        if (bl) {
            object = this.bitmapSquare;
            n = 0;
            paint = null;
            canvas.drawBitmap(object, 0.0f, 0.0f, null);
        }
        this.paintIpad.setAlpha(255);
        object = this.getColor_gradient();
        n = 0;
        paint = null;
        if (object != null) {
            float[] fArray;
            float f = this.ipad_rect.top;
            float f2 = this.ipad_rect.bottom;
            int n2 = this.getColor_gradient().getColor();
            int n3 = this.getColor_gradient().getSecond();
            int n4 = this.getColor_gradient().getThree();
            int[] nArray = new int[]{0, n2, n3, n4};
            n = 4;
            float[] fArray2 = fArray = new float[n];
            float[] fArray3 = fArray;
            fArray2[0] = 0.0f;
            fArray3[1] = 0.87f;
            fArray2[2] = 0.93f;
            fArray3[3] = 1.0f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            n3 = 0;
            n4 = 0;
            object = new LinearGradient(0.0f, f, 0.0f, f2, nArray, fArray, tileMode);
            paint = this.paintIpad;
            paint.setShader((Shader)object);
        } else {
            float f = this.ipad_rect.top;
            float f3 = this.ipad_rect.bottom;
            int n5 = this.paintIpad.getColor();
            int[] nArray = new int[]{0, n5};
            Object var12_19 = null;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            boolean bl2 = false;
            boolean bl3 = false;
            object = new LinearGradient(0.0f, f, 0.0f, f3, nArray, null, tileMode);
            paint = this.paintIpad;
            paint.setShader((Shader)object);
        }
        object = this.ipad_rect;
        paint = this.paintIpad;
        canvas.drawRect((RectF)object, paint);
        this.paintIpad.setShader(null);
    }

    private void drawHeartType(Canvas canvas, boolean bl, boolean bl2) {
        if (bl) {
            float f = this.linePaint.getStrokeWidth();
            Path path = new Path();
            float f2 = this.rectFProgress.width();
            float f3 = this.rectFProgress.height();
            RectF rectF = this.rectFProgress;
            float f4 = rectF.centerX();
            RectF rectF2 = this.rectFProgress;
            float f5 = rectF2.centerY();
            float f6 = Math.min(f2, f3) / 2.0f;
            f2 = 0.6f * f6 + f5;
            path.moveTo(f4, f2);
            f3 = 1.2f * f6;
            float f7 = f4 + f3;
            float f8 = 0.1f * f6 + f5;
            float f9 = f6 * 0.8f;
            float f10 = f4 + f9;
            float f11 = 0.9f * f6;
            float f12 = f5 - f11;
            f11 = 0.4f * f6;
            float f13 = f5 - f11;
            Path path2 = path;
            path.cubicTo(f7, f8, f10, f12, f4, f13);
            f7 = f4 - f9;
            f10 = f4 - f3;
            f13 = f2;
            path.cubicTo(f7, f12, f10, f8, f4, f2);
            path.close();
            RectF rectF3 = new RectF();
            path.computeBounds(rectF3, true);
            canvas.save();
            canvas.clipPath(path);
            f8 = rectF3.bottom;
            f3 = rectF3.height() * 0.78f;
            f4 = this.progress;
            f3 *= f4;
            f4 = f8 - f3;
            f3 = rectF3.left;
            f5 = rectF3.right;
            path2 = this.paintIpad;
            rectF3 = canvas;
            Path path3 = path;
            path = path2;
            canvas.drawRect(f3, f4, f5, f8, (Paint)path2);
            canvas.restore();
            rectF3 = this.paintIpad;
            Paint.Style style2 = Paint.Style.STROKE;
            rectF3.setStyle(style2);
            rectF3 = this.paintIpad;
            f3 = 0.02f * f6;
            rectF3.setStrokeWidth(f3);
            rectF3 = this.paintIpad;
            canvas.drawPath(path3, (Paint)rectF3);
            rectF3 = this.paintIpad;
            style2 = Paint.Style.FILL;
            rectF3.setStyle(style2);
            rectF3 = this.paintIpad;
            rectF3.setStrokeWidth(f);
        }
    }

    private void drawInnerGear(Canvas canvas, float f, float f2, float f3, float f4, int n, Paint paint) {
        Path path = new Path();
        int n2 = n * 2;
        double d = n2;
        double d2 = Math.PI * 2 / d;
        for (int i = 0; i < n2; ++i) {
            float f5;
            float f6;
            double d3 = (double)i * d2;
            int n3 = i % 2;
            if (n3 == 0) {
                f6 = f;
                f5 = f3;
            } else {
                f6 = f;
                f5 = f4;
            }
            double d4 = f6;
            double d5 = f5;
            double d6 = Math.cos(d3) * d5;
            f5 = (float)(d4 += d6);
            d6 = f2;
            d3 = Math.sin(d3);
            float f7 = (float)(d6 += (d5 *= d3));
            if (i == 0) {
                path.moveTo(f5, f7);
                continue;
            }
            path.lineTo(f5, f7);
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    private void drawIpad(Canvas canvas, boolean n) {
        Canvas canvas2;
        int n2;
        boolean bl;
        RectF rectF;
        int n3;
        float f;
        float f2;
        Object object;
        int n4 = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_NEOMORPHIC;
        int n5 = ipadType.ordinal();
        if (n4 == n5) {
            object = this.ipad_rect;
            f2 = object.width() * 0.12f;
            n5 = 0;
            f = 0.0f;
            ipadType = null;
            this.drawNeumorphicRect(canvas, f2, false);
            this.drawLectureNeumorphic(canvas);
            if (n != 0) {
                this.drawProgressNeumorphic(canvas);
            }
        }
        n4 = this.mIpadType;
        ipadType = IpadType.CASSET;
        n5 = ipadType.ordinal();
        int n6 = 0;
        if (n4 == n5) {
            this.drawCaset(canvas, n != 0, null);
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.CASSET_IMG).ordinal()) || (n4 = this.mIpadType) == (n5 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
            n4 = this.isVideo() ? 1 : 0;
            this.drawCasetNoBg(canvas, n != 0, null, n4 != 0);
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.IPAD_CLASSIC).ordinal())) {
            object = this.ipad_rect;
            ipadType = this.paintIpad;
            canvas.drawRect((RectF)object, (Paint)ipadType);
            this.drawBitmapWithShadow(canvas);
            this.drawLecture(canvas);
            if (n != 0) {
                this.drawProgress(canvas);
            }
        }
        n4 = this.mIpadType;
        ipadType = IpadType.IPAD;
        n5 = ipadType.ordinal();
        n6 = 1;
        float f3 = 0.03f;
        if (n4 == n5 || (n4 = this.mIpadType) == (n5 = (ipadType = IpadType.IPAD_UNBLUR).ordinal())) {
            object = this.ipad_rect;
            f2 = object.width();
            ipadType = this.ipad_rect;
            f = ipadType.height();
            n4 = (int)(f2 = Math.min(f2, f) * f3);
            n3 = n4 <= 0 ? n6 : n4;
            rectF = this.ipad_rect;
            bl = true;
            n2 = -16777216;
            canvas2 = canvas;
            this.drawRectWithShadow(canvas, rectF, n2, n3, 0, 0, bl);
            this.drawBitmapWithShadow(canvas);
            this.drawLecture(canvas);
            if (n != 0) {
                this.drawProgress(canvas);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.BOTTOM_RECT).ordinal())) {
            object = this.ipad_rect;
            this.drawRectBottom(canvas, (RectF)object);
            this.drawBitmapWithShadowTypeBottom(canvas);
            this.drawLecture(canvas);
            if (n != 0) {
                this.drawProgress(canvas);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.ROUND_RECT).ordinal())) {
            object = this.ipad_rect;
            f2 = object.width() * f3;
            n4 = (int)f2;
            n3 = n4 <= 0 ? n6 : n4;
            rectF = this.ipad_rect;
            bl = true;
            n2 = -16777216;
            canvas2 = canvas;
            this.drawRectWithShadow(canvas, rectF, n2, n3, 0, 0, bl);
            this.drawLecture(canvas);
            if (n != 0) {
                this.drawProgress(canvas);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.RECT).ordinal()) || (n4 = this.mIpadType) == (n5 = (ipadType = IpadType.BORDER).ordinal())) {
            object = this.ipad_rect;
            f2 = object.width() * f3;
            n4 = (int)f2;
            n2 = n4 <= 0 ? n6 : n4;
            canvas2 = this.ipad_rect;
            int n7 = -16777216;
            n3 = 0;
            this.drawRectWithShadow(canvas, (RectF)canvas2, n7, n2, 0, 0, false);
            this.drawLecture(canvas);
            if (n != 0) {
                this.drawProgress(canvas);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.BLACK_LAYER).ordinal())) {
            n4 = this.isVideo() ? 1 : 0;
            this.drawBlackLayer(canvas, n != 0, n4 != 0);
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.BLUE_TYPE).ordinal())) {
            n4 = this.isVideo() ? 1 : 0;
            this.drawBlueType(canvas, n != 0, n4 != 0);
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.HEART).ordinal())) {
            n4 = this.isVideo() ? 1 : 0;
            this.drawHeartType(canvas, n != 0, n4 != 0);
        }
        if ((n4 = this.mIpadType) == (n5 = (ipadType = IpadType.BATTERY).ordinal())) {
            n4 = this.isVideo ? 1 : 0;
            this.drawBatteryType(canvas, n != 0, n4 != 0);
        }
        if ((n = this.mIpadType) == (n4 = ((Enum)(object = IpadType.GRADIENT)).ordinal())) {
            n = this.isVideo() ? 1 : 0;
            this.drawGradientLayer(canvas, n != 0);
        }
        if ((n = this.mIpadType) == (n4 = ((Enum)(object = IpadType.MASK_BRUSH)).ordinal())) {
            n = this.isVideo ? 1 : 0;
            this.drawMaskedBitmap(canvas, n != 0);
        }
    }

    private void drawIpad(Canvas canvas, boolean bl, boolean bl2) {
        int n;
        boolean bl3;
        int n2;
        float f;
        float f2;
        Object object;
        BlurredImageView blurredImageView = this;
        Canvas canvas2 = canvas;
        boolean bl4 = bl;
        boolean bl5 = bl2;
        int n3 = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_CLASSIC;
        int n4 = ipadType.ordinal();
        float f3 = 0.02f;
        float f4 = 0.5f;
        if (n3 == n4) {
            object = this.ipad_rect;
            ipadType = this.paintIpad;
            canvas.drawRect(object, (Paint)ipadType);
            if (bl2) {
                f2 = this.ipad_rect.centerX();
                f = (float)this.bitmapSquare.getWidth() * f4;
                this.left_square = f2 -= f;
                object = this.ipad_rect;
                f2 = object.top;
                ipadType = this.bitmapBlured;
                n4 = ipadType.getHeight();
                f = (float)n4 * f3;
                this.top_square = f2 += f;
            } else {
                this.drawBitmapWithShadow(canvas);
            }
            this.drawLecture(canvas);
            if (bl4) {
                this.drawProgress(canvas);
            }
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.IPAD_NEOMORPHIC).ordinal())) {
            object = blurredImageView.ipad_rect;
            f2 = object.width();
            n4 = 1039516303;
            f = 0.12f;
            blurredImageView.drawNeumorphicRect(canvas2, f2 *= f, bl5);
            this.drawLectureNeumorphic(canvas);
            if (bl4) {
                this.drawProgressNeumorphic(canvas);
            }
        }
        n3 = blurredImageView.mIpadType;
        ipadType = IpadType.CASSET;
        n4 = ipadType.ordinal();
        RectF rectF = null;
        if (n3 == n4) {
            blurredImageView.drawCaset(canvas2, bl4, null);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.CASSET_IMG).ordinal()) || (n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
            n3 = this.isVideo() ? 1 : 0;
            blurredImageView.drawCasetNoBg(canvas2, bl4, null, n3 != 0);
        }
        n3 = blurredImageView.mIpadType;
        ipadType = IpadType.IPAD;
        n4 = ipadType.ordinal();
        int n5 = 1;
        float f5 = 0.03f;
        if (n3 == n4 || (n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.IPAD_UNBLUR).ordinal())) {
            object = blurredImageView.ipad_rect;
            f2 = object.width();
            ipadType = blurredImageView.ipad_rect;
            f = ipadType.height();
            n3 = (int)(f2 = Math.min(f2, f) * f5);
            n2 = n3 <= 0 ? n5 : n3;
            rectF = blurredImageView.ipad_rect;
            bl3 = true;
            n = -16777216;
            object = this;
            ipadType = canvas;
            this.drawRectWithShadow(canvas, rectF, n, n2, 0, 0, bl3);
            if (bl5) {
                f2 = blurredImageView.ipad_rect.centerX();
                f = (float)blurredImageView.bitmapSquare.getWidth() * f4;
                blurredImageView.left_square = f2 -= f;
                object = blurredImageView.ipad_rect;
                f2 = object.top;
                ipadType = blurredImageView.bitmapBlured;
                n4 = ipadType.getHeight();
                f = (float)n4 * f3;
                blurredImageView.top_square = f2 += f;
            } else {
                this.drawBitmapWithShadow(canvas);
            }
            this.drawLecture(canvas);
            if (bl4) {
                this.drawProgress(canvas);
            }
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.BOTTOM_RECT).ordinal())) {
            object = blurredImageView.ipad_rect;
            blurredImageView.drawRectBottom(canvas2, (RectF)object);
            if (bl5) {
                this.drawBitmapWithShadowTypeBottomSave(canvas);
            } else {
                this.drawBitmapWithShadowTypeBottom(canvas);
            }
            this.drawLecture(canvas);
            if (bl4) {
                this.drawProgress(canvas);
            }
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.ROUND_RECT).ordinal())) {
            object = blurredImageView.ipad_rect;
            f2 = object.width() * f5;
            n3 = (int)f2;
            n2 = n3 <= 0 ? n5 : n3;
            rectF = blurredImageView.ipad_rect;
            bl3 = true;
            n = -16777216;
            object = this;
            ipadType = canvas;
            this.drawRectWithShadow(canvas, rectF, n, n2, 0, 0, bl3);
            this.drawLecture(canvas);
            if (bl4) {
                this.drawProgress(canvas);
            }
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.RECT).ordinal()) || (n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.BORDER).ordinal())) {
            object = blurredImageView.ipad_rect;
            f2 = object.width() * f5;
            n3 = (int)f2;
            n2 = n3 <= 0 ? n5 : n3;
            rectF = blurredImageView.ipad_rect;
            bl3 = false;
            n = -16777216;
            object = this;
            ipadType = canvas;
            this.drawRectWithShadow(canvas, rectF, n, n2, 0, 0, false);
            this.drawLecture(canvas);
            if (bl4) {
                this.drawProgress(canvas);
            }
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.BLACK_LAYER).ordinal())) {
            this.drawBlackLayer(canvas, bl, bl2);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.HEART).ordinal())) {
            this.drawHeartType(canvas, bl, bl2);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.BATTERY).ordinal())) {
            this.drawBatteryType(canvas, bl, bl2);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.BLUE_TYPE).ordinal())) {
            n3 = this.isVideo() ? 1 : 0;
            blurredImageView.drawBlueType(canvas2, bl4, n3 != 0);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.GRADIENT).ordinal())) {
            blurredImageView.drawGradientLayer(canvas2, bl5);
        }
        if ((n3 = blurredImageView.mIpadType) == (n4 = (ipadType = IpadType.MASK_BRUSH).ordinal())) {
            blurredImageView.drawMaskedBitmap(canvas2, bl5);
        }
    }

    private void drawLecture(Canvas canvas) {
        float f = this.rectFLecture.height() * 0.4f;
        int n = (int)(this.rectFLecture.centerX() - f);
        int n2 = (int)(this.rectFLecture.centerY() - f);
        int n3 = (int)(this.rectFLecture.centerX() + f);
        int n4 = (int)(this.rectFLecture.centerY() + f);
        Rect rect = new Rect(n, n2, n3, n4);
        Context context = this.getContext();
        n = R$drawable.pause_circle_24px;
        context = ContextCompat.getDrawable((Context)context, (int)n);
        n = this.paintLecture.getColor();
        context.setTint(n);
        n = rect.left;
        n2 = rect.top;
        n3 = rect.right;
        int n5 = rect.bottom;
        context.setBounds(n, n2, n3, n5);
        context.draw(canvas);
        n4 = (int)((float)rect.height() * 0.3f);
        n = (int)((float)rect.width() * 0.45f);
        float f2 = (float)rect.width() * 0.29f;
        n3 = (int)((float)rect.right + f2);
        int n6 = rect.centerY() - n4;
        int n7 = n3 + n;
        int n8 = rect.centerY() + n4;
        Rect rect2 = new Rect(n3, n6, n7, n8);
        Context context2 = this.getContext();
        n6 = R$drawable.skip_next_24px;
        context2 = ContextCompat.getDrawable((Context)context2, (int)n6);
        n6 = this.paintLecture.getColor();
        context2.setTint(n6);
        n6 = rect2.left;
        n7 = rect2.top;
        n8 = rect2.right;
        n5 = rect2.bottom;
        context2.setBounds(n6, n7, n8, n5);
        context2.draw(canvas);
        n2 = (int)((float)rect.left - f2);
        n = n2 - n;
        n5 = rect.centerY() - n4;
        int n9 = rect.centerY() + n4;
        context2 = new Rect(n, n5, n2, n9);
        context = this.getContext();
        n9 = R$drawable.skip_previous_24px;
        context = ContextCompat.getDrawable((Context)context, (int)n9);
        n9 = this.paintLecture.getColor();
        context.setTint(n9);
        n9 = context2.left;
        n = context2.top;
        n2 = context2.right;
        n5 = context2.bottom;
        context.setBounds(n9, n, n2, n5);
        context.draw(canvas);
        n4 = (int)((float)context2.width() * 0.5f);
        n9 = (int)this.rectFProgress.left;
        n = context2.width() + n9;
        Context context3 = this.getContext();
        n5 = R$drawable.favorite_24px;
        context3 = ContextCompat.getDrawable((Context)context3, (int)n5);
        n5 = this.paintLecture.getColor();
        context3.setTint(n5);
        n5 = context2.centerY() - n4;
        n6 = context2.centerY() + n4;
        context3.setBounds(n9, n5, n, n6);
        context3.draw(canvas);
        n9 = (int)this.rectFProgress.right;
        n = context2.width();
        n9 -= n;
        Context context4 = this.getContext();
        n2 = R$drawable.repeat_24px;
        context4 = ContextCompat.getDrawable((Context)context4, (int)n2);
        n2 = this.paintLecture.getColor();
        context4.setTint(n2);
        n2 = context2.centerY() - n4;
        n5 = (int)this.rectFProgress.right;
        n3 = context2.centerY() + n4;
        context4.setBounds(n9, n2, n5, n3);
        context4.draw(canvas);
    }

    private void drawLectureNeumorphic(Canvas canvas) {
        float f = this.rectFLecture.height() * 0.3f;
        int n = (int)(this.rectFLecture.centerX() - f);
        int n2 = (int)(this.rectFLecture.centerY() - f);
        int n3 = (int)(this.rectFLecture.centerX() + f);
        int n4 = (int)(this.rectFLecture.centerY() + f);
        Rect rect = new Rect(n, n2, n3, n4);
        f = rect.width();
        float f2 = 0.15f;
        n4 = (int)(f * f2);
        float f3 = rect.centerX();
        float f4 = rect.centerY();
        float f5 = rect.height();
        float f6 = 0.5f;
        Paint paint = this.lightShadowPaint;
        canvas.drawCircle(f3, f4, f5 *= f6, paint);
        f3 = rect.centerX();
        f4 = rect.centerY();
        f5 = (float)rect.height() * f6;
        paint = this.darkShadowPaint;
        canvas.drawCircle(f3, f4, f5, paint);
        f3 = rect.centerX();
        f4 = rect.centerY();
        f5 = (float)rect.height() * f6;
        paint = this.backgroundPaint;
        canvas.drawCircle(f3, f4, f5, paint);
        Context context = this.getContext();
        n3 = R$drawable.pause_24px;
        context = ContextCompat.getDrawable((Context)context, (int)n3);
        n3 = this.paintLecture.getColor();
        context.setTint(n3);
        n3 = rect.left + n4;
        int n5 = rect.top + n4;
        int n6 = rect.right - n4;
        int n7 = rect.bottom - n4;
        context.setBounds(n3, n5, n6, n7);
        context.draw(canvas);
        n4 = (int)((float)rect.height() * 0.4f);
        f3 = (float)rect.width() * 0.55f;
        n3 = (int)((float)rect.right + f3);
        n6 = rect.centerY() - n4;
        n7 = n3 + n4;
        int n8 = rect.centerY() + n4;
        Rect rect2 = new Rect(n3, n6, n7, n8);
        n = (int)((float)rect.width() * f2);
        f4 = rect2.centerX();
        float f7 = rect2.centerY();
        float f8 = (float)rect2.height() * f6;
        Paint paint2 = this.lightShadowPaint;
        canvas.drawCircle(f4, f7, f8, paint2);
        f4 = rect2.centerX();
        f7 = rect2.centerY();
        f8 = (float)rect2.height() * f6;
        paint2 = this.darkShadowPaint;
        canvas.drawCircle(f4, f7, f8, paint2);
        f4 = rect2.centerX();
        f7 = rect2.centerY();
        f8 = (float)rect2.height() * f6;
        paint2 = this.backgroundPaint;
        canvas.drawCircle(f4, f7, f8, paint2);
        Context context2 = this.getContext();
        n6 = R$drawable.arrow_forward_ios_24px;
        context2 = ContextCompat.getDrawable((Context)context2, (int)n6);
        n6 = this.paintLecture.getColor();
        context2.setTint(n6);
        n6 = rect2.left;
        n7 = rect2.top + n;
        n8 = rect2.right;
        n5 = rect2.bottom - n;
        context2.setBounds(n6, n7, n8, n5);
        context2.draw(canvas);
        n2 = (int)((float)rect.left - f3);
        n5 = n2 - n4;
        n6 = rect.centerY() - n4;
        int n9 = rect.centerY() + n4;
        context2 = new Rect(n5, n6, n2, n9);
        f = context2.centerX();
        float f9 = context2.centerY();
        f3 = (float)context2.height() * f6;
        rect2 = this.lightShadowPaint;
        canvas.drawCircle(f, f9, f3, (Paint)rect2);
        f = context2.centerX();
        f9 = context2.centerY();
        f3 = (float)context2.height() * f6;
        rect2 = this.darkShadowPaint;
        canvas.drawCircle(f, f9, f3, (Paint)rect2);
        f = context2.centerX();
        f9 = context2.centerY();
        f3 = (float)context2.height() * f6;
        rect2 = this.backgroundPaint;
        canvas.drawCircle(f, f9, f3, (Paint)rect2);
        Context context3 = this.getContext();
        n9 = R$drawable.arrow_back_ios_24px;
        context3 = ContextCompat.getDrawable((Context)context3, (int)n9);
        n9 = this.paintLecture.getColor();
        context3.setTint(n9);
        n9 = context2.left;
        n2 = context2.top + n;
        n5 = context2.right;
        n3 = context2.bottom - n;
        context3.setBounds(n9, n2, n5, n3);
        context3.draw(canvas);
    }

    private void drawLineHelper(Canvas canvas) {
        boolean bl = this.showCenterLineX;
        if (bl || (bl = this.showCenterLineY)) {
            float f;
            Paint paint = new Paint(1);
            String string2 = "#80FF4081";
            int n = Color.parseColor((String)string2);
            paint.setColor(n);
            paint.setStrokeWidth(5.0f);
            float f2 = this.mCanvas_width;
            float f3 = 2.0f;
            float f4 = f2 / f3;
            n = this.mCanvas_height;
            float f5 = n;
            float f6 = f5 / f3;
            boolean bl2 = this.showCenterLineX;
            if (bl2) {
                f5 = 0.0f;
                f = n;
                string2 = canvas;
                f3 = f4;
                canvas.drawLine(f4, 0.0f, f4, f, paint);
            }
            if ((n = (int)(this.showCenterLineY ? 1 : 0)) != 0) {
                n = this.mCanvas_width;
                f4 = n;
                bl2 = false;
                f3 = 0.0f;
                string2 = canvas;
                f5 = f6;
                f = f6;
                canvas.drawLine(0.0f, f6, f4, f6, paint);
            }
        }
    }

    private void drawMaskedBitmap(Canvas canvas, boolean bl) {
        LinearGradient linearGradient;
        Object object;
        Bitmap bitmap;
        Paint paint = this.paintIpad;
        int n = 255;
        float f = 3.57E-43f;
        paint.setAlpha(n);
        if (bl) {
            bitmap = this.bitmapSquare;
            paint = this.paint;
            n = 0;
            f = 0.0f;
            object = null;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        float f2 = this.bitmapNotBlur.getWidth();
        float f3 = 1.1f;
        int n2 = (int)(f2 *= f3);
        n = this.bitmapNotBlur.getHeight();
        f = (float)n * f3;
        int n3 = (int)f;
        object = Bitmap.Config.ARGB_8888;
        bitmap = Bitmap.createBitmap((int)n2, (int)n3, (Bitmap.Config)object);
        paint = new Canvas(bitmap);
        object = this.getColor_gradient();
        if (object != null) {
            object = this.paint;
            linearGradient = this.linearGradient_classic;
            object.setShader((Shader)linearGradient);
            object = this.paint;
            paint.drawPaint((Paint)object);
            object = this.paint;
            object.setShader(null);
        } else {
            object = this.paintIpad;
            n = object.getColor();
            paint.drawColor(n);
        }
        n = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        f = Math.min(n, n4);
        float f4 = 0.57f;
        n = (int)(f *= f4);
        linearGradient = new Rect(0, 0, n, n);
        n = linearGradient.width();
        int n5 = linearGradient.height();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        object = Bitmap.createBitmap((int)n, (int)n5, (Bitmap.Config)config);
        paint.setBitmap((Bitmap)object);
        Object object2 = this.getContext();
        int n6 = R$drawable.brush_mask_2;
        object2 = ContextCompat.getDrawable((Context)object2, (int)n6);
        n6 = linearGradient.width();
        n4 = linearGradient.height();
        object2.setBounds(0, 0, n6, n4);
        object2.draw((Canvas)paint);
        float f5 = Float.MIN_VALUE;
        linearGradient = new Paint(1);
        object2 = PorterDuff.Mode.DST_OUT;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)object2);
        linearGradient.setXfermode((Xfermode)porterDuffXfermode);
        paint.setBitmap(bitmap);
        int n7 = this.mResizetype;
        object2 = ResizeType.SOCIAL_STORY;
        n5 = ((Enum)object2).ordinal();
        n6 = 0x3F000000;
        float f6 = 0.5f;
        if (n7 == n5) {
            n7 = bitmap.getWidth();
            n5 = object.getWidth();
            f5 = (float)(n7 -= n5) * f6;
            n5 = bitmap.getHeight();
            float f8 = n5;
            n6 = 0x3EB33333;
            f6 = 0.35f;
            paint.drawBitmap((Bitmap)object, f5, f8 *= f6, (Paint)linearGradient);
        } else {
            n7 = bitmap.getWidth();
            n5 = object.getWidth();
            f5 = (float)(n7 -= n5) * f6;
            n5 = bitmap.getHeight();
            float f7 = n5;
            n6 = 1050924810;
            f6 = 0.32f;
            paint.drawBitmap((Bitmap)object, f5, f7 *= f6, (Paint)linearGradient);
        }
        f3 = this.btmX;
        f = this.btmY;
        canvas.drawBitmap(bitmap, f3, f, null);
        this.paintIpad.setShader(null);
        this.paintIpad.setAlpha(190);
    }

    private void drawNameSurah(Canvas canvas) {
        SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null) {
            surahNameEntity.draw(canvas);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void drawNeumorphicRect(Canvas canvas, float f, boolean bl) {
        LinearGradient linearGradient;
        void var3_9;
        Paint paint;
        int n;
        Object object;
        float f2;
        Object object2;
        Object object3;
        float f3;
        Object object4;
        Gradient gradient = this.getColor_gradient();
        int n2 = 1066192077;
        float f4 = 1.1f;
        int n3 = 1053609165;
        float f5 = 0.4f;
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        if (gradient != null) {
            gradient = this.paint;
            object4 = this.linearGradient_classic;
            gradient.setShader((Shader)object4);
            gradient = this.paint;
            canvas.drawPaint((Paint)gradient);
            this.paint.setShader(null);
            int n5 = this.getColor_gradient().getSecond();
            f3 = 4.2E-45f;
            object4 = new float[3];
            Color.colorToHSV((int)n5, (float[])object4);
            gradient = null;
            object3 = object4[0];
            object2 = this.getColor_gradient();
            f2 = ((Gradient)object2).getAngle();
            object3 += f2;
            object4[0] = object3 %= 360.0f;
            object = object4[n4] * 1.2f;
            int n6 = 1065353216;
            object3 = 1.0f;
            object4[n4] = object = (Object)Math.min((float)object3, (float)object);
            int n7 = 2;
            object = 2.8E-45f;
            f2 = (float)(object4[n7] * f4);
            object4[n7] = object3 = (Object)Math.min((float)object3, f2);
            int n8 = Color.HSVToColor((float[])object4);
            n = ColorUtils.lightenColor(n8, f5);
            n3 = ColorUtils.darkenColor(n8, f5);
        } else {
            int n9 = this.color_ipad;
            canvas.drawColor(n9);
            int n10 = this.color_ipad;
            n = ColorUtils.lightenColor(n10, f5);
            int n11 = this.color_ipad;
            n3 = ColorUtils.darkenColor(n11, f5);
        }
        this.backgroundPaint = paint = new Paint(n4);
        paint.setColor((int)var3_9);
        paint = this.backgroundPaint;
        object2 = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object2);
        this.lightShadowPaint = paint = new Paint(n4);
        paint.setColor((int)var3_9);
        paint = this.lightShadowPaint;
        object2 = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object2);
        paint = this.lightShadowPaint;
        f2 = -5.0f;
        float f7 = 5.0f;
        paint.setShadowLayer(f7, f2, f2, n);
        object4 = new Paint(n4);
        this.darkShadowPaint = object4;
        object4.setColor((int)var3_9);
        Paint paint2 = this.darkShadowPaint;
        object4 = Paint.Style.FILL;
        paint2.setStyle((Paint.Style)object4);
        this.darkShadowPaint.setShadowLayer(f7, f7, f7, n3);
        Paint paint3 = this.backgroundPaint;
        f3 = this.ipad_rect.left;
        object3 = this.ipad_rect.top;
        f2 = this.ipad_rect.right;
        f7 = this.ipad_rect.bottom;
        n4 = (int)((float)Color.red((int)var3_9) * f4);
        int n12 = (int)((float)Color.green((int)var3_9) * f4);
        n2 = (int)((float)Color.blue((int)var3_9) * f4);
        int n13 = 255;
        n12 = Color.argb((int)n13, (int)n4, (int)n12, (int)n2);
        f4 = Color.red((int)var3_9);
        f6 = 0.9f;
        n2 = (int)(f4 * f6);
        int n14 = (int)((float)Color.green((int)var3_9) * f6);
        int n15 = (int)((float)Color.blue((int)var3_9) * f6);
        n13 = Color.argb((int)n13, (int)n2, (int)n14, (int)n15);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2 = linearGradient;
        linearGradient = new LinearGradient(f3, (float)object3, f2, f7, n12, n13, tileMode);
        paint3.setShader((Shader)linearGradient);
        gradient = this.ipad_rect;
        Paint paint4 = this.lightShadowPaint;
        canvas.drawRoundRect((RectF)gradient, f, f, paint4);
        gradient = this.ipad_rect;
        paint4 = this.darkShadowPaint;
        canvas.drawRoundRect((RectF)gradient, f, f, paint4);
        gradient = this.ipad_rect;
        paint4 = this.backgroundPaint;
        canvas.drawRoundRect((RectF)gradient, f, f, paint4);
        f = this.ipad_rect.centerX();
        object = this.ipad_rect.width() * 0.32f;
        f4 = this.ipad_rect.top;
        f5 = 1.35f * object;
        paint3 = this.lightShadowPaint;
        canvas.drawCircle(f, f4 += f5, (float)object, paint3);
        paint3 = this.darkShadowPaint;
        canvas.drawCircle(f, f4, (float)object, paint3);
        paint3 = this.backgroundPaint;
        canvas.drawCircle(f, f4, (float)object, paint3);
        object = (float)this.bitmapSquare.getWidth() * 0.5f;
        this.left_square = f -= object;
        this.top_square = f4 -= object;
        gradient = this.bitmapSquare;
        canvas.drawBitmap((Bitmap)gradient, f, f4, null);
    }

    private void drawProgress(Canvas canvas) {
        float f = this.rectFProgress.left;
        float f2 = this.rectFProgress.right;
        float f3 = this.rectFProgress.left;
        f2 -= f3;
        f3 = this.progress;
        f += (f2 *= f3);
        Object object = this.linePaint;
        int n = this.color_line_bg;
        object.setColor(n);
        float f4 = this.rectFProgress.left;
        float f5 = this.rectFProgress.centerY();
        float f6 = this.rectFProgress.right;
        float f7 = this.rectFProgress.centerY();
        Paint paint = this.linePaint;
        canvas.drawLine(f4, f5, f6, f7, paint);
        object = this.linePaint;
        n = this.paintLecture.getColor();
        object.setColor(n);
        f4 = this.rectFProgress.left;
        f5 = this.rectFProgress.centerY();
        f7 = this.rectFProgress.centerY();
        paint = this.linePaint;
        f6 = f;
        canvas.drawLine(f4, f5, f, f7, paint);
        f2 = this.rectFProgress.centerY();
        f3 = this.radius_cursur;
        Paint paint2 = this.linePaint;
        canvas.drawCircle(f, f2, f3, paint2);
        Rect rect = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, rect);
        object = this.currentTime;
        f3 = this.rectFProgress.left;
        f4 = this.rectFProgress.bottom;
        TextPaint textPaint = this.paintText;
        canvas.drawText((String)object, f3, f4, (Paint)textPaint);
        object = this.remainingTime;
        f3 = this.rectFProgress.right;
        f = rect.width();
        f3 -= f;
        f = this.rectFProgress.bottom;
        paint2 = this.paintText;
        canvas.drawText((String)object, f3, f, paint2);
    }

    private void drawProgressNeumorphic(Canvas canvas) {
        float f = this.linePaint.getStrokeWidth();
        Paint paint = this.linePaint;
        float f2 = this.rectFProgress.height() * 0.18f;
        paint.setStrokeWidth(f2);
        float f3 = this.linePaint.getStrokeWidth();
        float f4 = 0.5f;
        float f5 = f3 * f4;
        f3 = this.rectFProgress.left;
        f2 = this.rectFProgress.width();
        float f6 = this.progress;
        float f7 = f3 + (f2 *= f6);
        paint = this.linePaint;
        int n = this.color_line_bg;
        paint.setColor(n);
        f2 = this.rectFProgress.left;
        f6 = this.rectFProgress.centerY() - f5;
        float f8 = this.rectFProgress.right;
        float f9 = this.rectFProgress.centerY() + f5;
        float f10 = this.rectFProgress.height();
        float f11 = this.rectFProgress.height();
        Paint paint2 = this.linePaint;
        paint = canvas;
        canvas.drawRoundRect(f2, f6, f8, f9, f10, f11, paint2);
        paint = this.linePaint;
        n = this.paintLecture.getColor();
        paint.setColor(n);
        paint = this.linePaint;
        f2 = paint.getStrokeWidth() * f4;
        paint.setStrokeWidth(f2);
        f2 = this.rectFProgress.left;
        f6 = this.rectFProgress.centerY() - f5;
        f9 = this.rectFProgress.centerY() + f5;
        f10 = this.rectFProgress.height();
        f11 = this.rectFProgress.height();
        paint2 = this.linePaint;
        paint = canvas;
        f8 = f7;
        canvas.drawRoundRect(f2, f6, f7, f9, f10, f11, paint2);
        this.linePaint.setStrokeWidth(f);
        paint = new Rect();
        Object object = this.paintText;
        String string2 = this.currentTime;
        int n2 = string2.length();
        object.getTextBounds(string2, 0, n2, (Rect)paint);
        object = this.currentTime;
        f6 = this.rectFProgress.left;
        f8 = this.rectFProgress.bottom;
        TextPaint textPaint = this.paintText;
        canvas.drawText((String)object, f6, f8, (Paint)textPaint);
        object = this.remainingTime;
        f6 = this.rectFProgress.right;
        f3 = paint.width();
        f6 -= f3;
        f3 = this.rectFProgress.bottom;
        TextPaint textPaint2 = this.paintText;
        canvas.drawText((String)object, f6, f3, (Paint)textPaint2);
    }

    private void drawWattermark(Canvas canvas, boolean bl) {
        RectF rectF;
        Bitmap bitmap = this.bitmapBlured;
        if (bitmap != null && (rectF = this.ipad_rect) != null) {
            boolean bl2;
            float f = (float)bitmap.getWidth() * 0.057f;
            int n = 1049247089;
            float f2 = 0.27f * f;
            this.paintWattermark.setTextSize(f);
            this.paintWattermark.setAntiAlias(true);
            this.paintWattermark.setColor(-1);
            this.paintWattermark.setAlpha(120);
            bitmap = new Rect();
            Paint paint = this.paintWattermark;
            String string2 = "NurMontage";
            int n2 = string2.length();
            paint.getTextBounds(string2, 0, n2, (Rect)bitmap);
            int n3 = bitmap.width();
            float f3 = n3;
            int n4 = bitmap.height();
            f = n4;
            int n5 = 0x40600000;
            float f4 = 3.5f * f2;
            Bitmap bitmap2 = this.bitmapBlured;
            n2 = bitmap2.getWidth();
            float f5 = (float)n2 - f3 - f4;
            int n6 = canvas.getHeight();
            float f6 = (float)n6 - f4;
            Paint paint2 = this.paintWattermark;
            canvas.drawText(string2, f5, f6, paint2);
            paint2 = this.paintWattermark;
            paint2.clearShadowLayer();
            if (!bl && !(bl2 = this.isAnimWatermk)) {
                RectF rectF2;
                f4 = f5 - f2;
                float f7 = f6 - f - f2;
                f5 = f5 + f3 + f2;
                this.mRectWattermark = rectF2 = new RectF(f4, f7, f5, f6 += f2);
                int n7 = 0x3F666666;
                float f8 = 0.9f;
                f *= f8;
                rectF = this.mRectWattermark;
                f2 = rectF.right;
                n3 = 0x3F000000;
                f2 -= (f *= 0.5f);
                paint = this.mRectWattermark;
                f3 = paint.top - f;
                paint2 = this.mRectWattermark;
                f4 = paint2.right + f;
                string2 = this.mRectWattermark;
                f7 = ((RectF)string2).top + f;
                rectF2 = new RectF(f2, f3, f4, f7);
                bitmap = this.getContext();
                n = R$drawable.ic_remove_wattermark;
                if ((bitmap = ContextCompat.getDrawable((Context)bitmap, (int)n)) != null) {
                    n = (int)rectF2.left;
                    f3 = rectF2.top;
                    n3 = (int)f3;
                    f4 = rectF2.right;
                    n5 = (int)f4;
                    f7 = rectF2.bottom;
                    int n8 = (int)f7;
                    bitmap.setBounds(n, n3, n5, n8);
                    n = 180;
                    f2 = 2.52E-43f;
                    bitmap.setAlpha(n);
                    bitmap.draw(canvas);
                }
                canvas = this.mRectWattermark;
                canvas.union(rectF2);
            }
        }
    }

    private void fadeIn(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f = this.AccelerateDecelerateInterpolator(f) * 255.0f;
            int n3 = Math.round(f);
            f2 = 0.0f;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3);
            CharSequence charSequence = new StringBuilder("quran_in_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private void fadeOut(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f2 = 1.0f - f;
            f = this.AccelerateDecelerateInterpolator(f2) * 255.0f;
            int n3 = Math.round(f);
            f2 = 0.0f;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3);
            CharSequence charSequence = new StringBuilder("quran_out_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private EntityView findEntityAtPoint(float f, float f2) {
        Entity entity;
        boolean bl;
        EntityView entityView;
        int n;
        Object object = this.surahNameEntity;
        if (object != null && (n = (object = ((EntityView)object).getRect()).contains(f, f2)) != 0) {
            return this.surahNameEntity;
        }
        object = this.mIsti3adhaEntity;
        if (object != null && (n = ((BismilahEntity)object).isVisible()) != 0 && (n = ((Entity)(object = this.mIsti3adhaEntity.getBismilahTimeline())).visible()) != 0 && (n = (int)((object = this.mIsti3adhaEntity.getRect()).contains(f, f2) ? 1 : 0)) != 0) {
            return this.mIsti3adhaEntity;
        }
        object = this.bismilahEntity;
        if (object != null && (n = ((BismilahEntity)object).isVisible()) != 0 && (n = (int)(((Entity)(object = this.bismilahEntity.getBismilahTimeline())).visible() ? 1 : 0)) != 0 && (n = (int)((object = this.bismilahEntity.getRect()).contains(f, f2) ? 1 : 0)) != 0) {
            return this.bismilahEntity;
        }
        object = this.quranEntities;
        for (n = object.size() + -1; n >= 0; n += -1) {
            entityView = (EntityView)this.quranEntities.get(n);
            bl = entityView.isVisible();
            if (!bl || !(bl = (entity = entityView.getEntityQuran()).visible()) || !(bl = (entity = entityView.getRect()).contains(f, f2))) continue;
            return entityView;
        }
        object = this.translationEntities;
        for (n = object.size() + -1; n >= 0; n += -1) {
            entityView = (EntityView)this.translationEntities.get(n);
            bl = entityView.isVisible();
            if (!bl || !(bl = (entity = entityView.getEntityTrslTimeline()).visible()) || !(bl = (entity = entityView.getRect()).contains(f, f2))) continue;
            return entityView;
        }
        return null;
    }

    private QuranEntity getLastAdd() {
        List list = this.quranEntities;
        for (int i = list.size() + -1; i >= 0; i += -1) {
            float f;
            float f2;
            float f3;
            QuranEntity quranEntity = (QuranEntity)this.quranEntities.get(i);
            EntityQuranTimeline entityQuranTimeline = quranEntity.getEntityQuran();
            boolean bl = entityQuranTimeline.visible();
            if (!bl || (bl = (f3 = (f2 = quranEntity.getFactorSize()) - (f = 1.0f)) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1))) continue;
            return quranEntity;
        }
        list = this.quranEntities;
        int n = list.size() + -1;
        return (QuranEntity)list.get(n);
    }

    private TranslationQuranEntity getLastAddTrsl() {
        List list = this.translationEntities;
        for (int i = list.size() + -1; i >= 0; i += -1) {
            float f;
            float f2;
            float f3;
            TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)this.translationEntities.get(i);
            EntityTrslTimeline entityTrslTimeline = translationQuranEntity.getEntityTrslTimeline();
            boolean bl = entityTrslTimeline.visible();
            if (!bl || (bl = (f3 = (f2 = translationQuranEntity.getFactorSize()) - (f = 1.0f)) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1))) continue;
            return translationQuranEntity;
        }
        list = this.translationEntities;
        int n = list.size() + -1;
        return (TranslationQuranEntity)list.get(n);
    }

    private void handleTranslate(PointF object) {
        float f;
        EntityView entityView = this.entity_select;
        if (entityView == null) {
            return;
        }
        float f2 = Math.abs(((PointF)object).x);
        int n = 1117782016;
        float f3 = 80.0f;
        float f4 = f2 - f3;
        float f5 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
        if (f5 <= 0 && (f5 = (f = (f2 = Math.abs(((PointF)object).y)) - f3) == 0.0f ? 0 : (f > 0.0f ? 1 : -1)) <= 0) {
            float f6;
            float f7;
            float f8;
            float f9;
            entityView = this.entity_select.getRect();
            f3 = entityView.centerX();
            f2 = entityView.centerY();
            float f10 = ((PointF)object).x;
            f3 += f10;
            f10 = ((PointF)object).y;
            f2 += f10;
            int n2 = this.mCanvas_width;
            f10 = n2;
            float f11 = 2.0f;
            f10 /= f11;
            int n3 = this.mCanvas_height;
            float f12 = (float)n3 / f11;
            boolean bl = false;
            f11 = 0.0f;
            this.showCenterLineX = false;
            this.showCenterLineY = false;
            float f13 = ((PointF)object).x;
            float f14 = ((PointF)object).y;
            f10 = f3 - f10;
            float f15 = Math.abs(f10);
            float f16 = 30.0f;
            float f17 = f15 == f16 ? 0 : (f15 < f16 ? -1 : 1);
            float f18 = 1.0f;
            float f19 = 0.2f;
            boolean bl2 = true;
            float f20 = Float.MIN_VALUE;
            if (f17 < 0) {
                this.showCenterLineX = bl2;
                f15 = f10 * f19;
                f10 = Math.abs(f10) / f16;
                f10 = f18 - f10;
                f13 -= (f15 *= f10);
            }
            if ((n3 = (int)((f9 = (f12 = Math.abs(f10 = f2 - f12)) - f16) == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1))) < 0) {
                this.showCenterLineY = bl2;
                f19 *= f10;
                f10 = Math.abs(f10) / f16;
                f14 -= (f19 *= (f18 -= f10));
            }
            n2 = 0;
            f10 = 0.0f;
            float f21 = f3 - 0.0f;
            n3 = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
            if (n3 >= 0 && (n = (int)((f8 = f3 - (f12 = (float)(n3 = this.getWidth()))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) <= 0) {
                this.entity_select.postTranslate(f13, 0.0f);
                EntitySelectTool entitySelectTool = this.selectTool;
                entitySelectTool.setApply_Move(bl2);
                bl = bl2;
                f11 = f20;
            }
            if ((n = (int)((f7 = f2 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) >= 0 && (f5 = (f6 = f2 - (f3 = (float)(n = this.getHeight()))) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
                entityView = this.entity_select;
                entityView.postTranslate(0.0f, f14);
                object = this.selectTool;
                ((EntitySelectTool)object).setApply_Move(bl2);
            } else {
                bl2 = bl;
                f20 = f11;
            }
            if (bl2) {
                this.invalidate();
            }
        }
    }

    private void init() {
        MoveGestureDetector moveGestureDetector;
        this.setOnTouchListener(this);
        Context context = this.getContext();
        Object object = new BlurredImageView$MoveListener(this, null);
        this.moveGestureDetector = moveGestureDetector = new MoveGestureDetector(context, (MoveGestureDetector$OnMoveGestureListener)object);
        context = this.getContext();
        object = new BlurredImageView$ScaleListener(this, null);
        moveGestureDetector = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)object);
        this.scaleGestureDetector = moveGestureDetector;
        context = this.getContext();
        object = this.gestureListener;
        moveGestureDetector = new GestureDetectorCompat(context, (GestureDetector.OnGestureListener)object);
        this.gestureDetector = moveGestureDetector;
        moveGestureDetector = new Paint();
        this.grayscalePaint = moveGestureDetector;
        moveGestureDetector = new ColorMatrix();
        moveGestureDetector.setSaturation(0.0f);
        context = new ColorMatrixColorFilter((ColorMatrix)moveGestureDetector);
        this.grayscalePaint.setColorFilter((ColorFilter)context);
        int n = 1;
        moveGestureDetector = new Paint(n);
        this.paintWattermark = moveGestureDetector;
        moveGestureDetector.setColor(-16777216);
        this.paintWattermark.setAlpha(25);
        moveGestureDetector = this.paintWattermark;
        object = UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/ReadexPro_Medium.ttf");
        moveGestureDetector.setTypeface((Typeface)object);
        this.paintWattermark.setFakeBoldText(n != 0);
        moveGestureDetector = new Paint();
        this.linePaint = moveGestureDetector;
        moveGestureDetector.setAntiAlias(n != 0);
        moveGestureDetector = new Paint(n);
        this.paintLecture = moveGestureDetector;
        moveGestureDetector = new Paint(n);
        this.paintIpad = moveGestureDetector;
        moveGestureDetector = new TextPaint(n);
        this.paintText = moveGestureDetector;
        moveGestureDetector = new Paint();
        this.paintClear = moveGestureDetector;
        object = PorterDuff.Mode.CLEAR;
        context = new PorterDuffXfermode((PorterDuff.Mode)object);
        moveGestureDetector.setXfermode((Xfermode)context);
        moveGestureDetector = UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/arabic/NotoNaskhArabic.ttf");
        this.paintText.setTypeface((Typeface)moveGestureDetector);
    }

    private void saveBg(String string2, Bitmap bitmap, File file) {
        this.saveBitmap(bitmap, file, string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    private void saveBitmap(Bitmap var1_1, File var2_8, String var3_10) {
        block15: {
            block16: {
                var4_11 = 0;
                var5_12 = null;
                if (var2_8 == null) {
                    var2_8 = this.getContext().getExternalFilesDir(null);
                }
                var6_13 = new File((File)var2_8, var3_10);
                var2_8 = new FileOutputStream(var6_13);
                var3_10 = Bitmap.CompressFormat.PNG;
                var4_11 = 100;
                var1_1.compress((Bitmap.CompressFormat)var3_10, var4_11, (OutputStream)var2_8);
                var2_8.flush();
                try {}
                catch (IOException var1_6) {
                    var1_6.printStackTrace();
                    return;
                }
                break block16;
                catch (Throwable var1_4) {
                    break block15;
                }
                catch (IOException var1_5) {
                    // empty catch block
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    var5_12 = var2_8;
                    break block15;
                }
                catch (IOException var1_3) {
                    var5_12 = var2_8;
                    ** GOTO lbl-1000
                }
            }
            var2_8.close();
            return;
lbl-1000:
            // 2 sources

            {
                var1_1.printStackTrace();
                if (var5_12 == null) return;
            }
            {
                var5_12.close();
                return;
            }
        }
        if (var5_12 == null) throw var1_7;
        try {
            var5_12.close();
            throw var1_7;
        }
        catch (IOException var2_9) {
            var2_9.printStackTrace();
        }
        throw var1_7;
    }

    private void saveProgressBitmap(File file, float f) {
        float f2;
        float f3 = this.rectFProgress.width();
        int n = (int)f3;
        RectF rectF = this.rectFProgress;
        int n2 = (int)rectF.height();
        Object object = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)object);
        Canvas canvas = new Canvas(bitmap);
        float f4 = canvas.getHeight();
        float f5 = 0.5f;
        float f6 = f4 * f5;
        n2 = this.mIpadType;
        object = IpadType.BOTTOM_RECT;
        int n3 = object.ordinal();
        if (n2 == n3) {
            rectF = this.paintText;
            object = this.ipad_rect;
            f5 = object.width();
            RectF rectF2 = this.ipad_rect;
            f2 = rectF2.height();
            f5 = Math.min(f5, f2);
            f2 = 0.07f;
            rectF.setTextSize(f5 *= f2);
        } else {
            n2 = this.mIpadType;
            object = IpadType.BORDER;
            n3 = object.ordinal();
            if (n2 == n3) {
                rectF = this.paintText;
                object = this.ipad_rect;
                f5 = object.width();
                RectF rectF3 = this.ipad_rect;
                f2 = rectF3.height();
                f5 = Math.min(f5, f2);
                f2 = 0.027f;
                rectF.setTextSize(f5 *= f2);
            } else {
                rectF = this.paintText;
                object = this.ipad_rect;
                f5 = object.width();
                f2 = 0.0388f;
                rectF.setTextSize(f5 *= f2);
            }
        }
        rectF = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, (Rect)rectF);
        f5 = this.rectFProgress.width();
        f4 = rectF.width();
        this.newLeft_txt = f5 = (f5 - f4) * 0.964f;
        this.txt_y = f4 = (float)canvas.getHeight() * 0.76f;
        this.linePaint.setAntiAlias(false);
        f4 = this.linePaint.getStrokeWidth() * 1.1f;
        this.linePaint.setStrokeWidth(f4);
        rectF = this.linePaint;
        n3 = this.paintLecture.getColor();
        rectF.setColor(n3);
        float f7 = canvas.getWidth();
        Paint paint = this.linePaint;
        rectF = canvas;
        f2 = f6;
        canvas.drawLine(0.0f, f6, f7, f6, paint);
        this.saveBitmap(bitmap, file, "line_bg.png");
        bitmap.eraseColor(0);
        rectF = this.linePaint;
        n3 = this.color_line_bg;
        rectF.setColor(n3);
        f7 = canvas.getWidth();
        paint = this.linePaint;
        rectF = canvas;
        canvas.drawLine(0.0f, f6, f7, f6, paint);
        rectF = this.linePaint;
        n3 = this.paintLecture.getColor();
        rectF.setColor(n3);
        this.linePaint.setAntiAlias(true);
        rectF = this.linePaint;
        canvas.drawCircle(f, f6, f, (Paint)rectF);
        this.saveBitmap(bitmap, file, "line_progress.png");
    }

    private Pair saveProgressBitmapTypeBattery(File file, Bitmap bitmap) {
        BlurredImageView blurredImageView = this;
        File file2 = file;
        int n = bitmap.getWidth();
        float f = this.rectFProgress.height();
        int n2 = (int)f;
        Object object = Bitmap.Config.ARGB_8888;
        Object object2 = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)object);
        Object object3 = new Canvas(object2);
        object = this.rectFProgress;
        float f2 = object.width();
        Object object4 = this.rectFProgress;
        float f3 = object4.height();
        float f4 = this.rectFProgress.centerX();
        int n3 = object3.getHeight();
        float f5 = (float)n3 * 0.5f;
        f2 = Math.min(f2, f3);
        f3 = 0.8f * f2;
        float f6 = 0.45f * f2;
        float f7 = 2.0f;
        float f8 = f3 / f7;
        float f9 = f4 - f8;
        f7 = f6 / f7;
        float f10 = f5 - f7;
        f7 += f5;
        float f11 = 0.07f * f3 + (f8 += f4);
        float f12 = 0.25f * f6;
        float f13 = f5 - f12;
        f12 += f5;
        file2 = new Path();
        Bitmap bitmap2 = object2;
        object2 = new RectF(f9, f10, f8, f7);
        f7 = 0.05f * f2;
        Path.Direction direction = Path.Direction.CW;
        file2.addRoundRect((RectF)object2, f7, f7, direction);
        object2 = new RectF(f8, f13, f11, f12);
        Object object5 = Path.Direction.CW;
        file2.addRect((RectF)object2, (Path.Direction)object5);
        object2 = new Path();
        int n4 = 1050253722;
        f13 = 0.3f;
        f3 *= f13;
        f7 = 0.5f;
        f6 *= f7;
        f8 = f4 - (f13 *= f3);
        f6 *= f7;
        f7 = f5 - f6;
        object2.moveTo(f8, f7);
        object2.lineTo(f4, f5);
        f7 = f4 - (f3 *= 0.2f);
        object2.lineTo(f7, f5);
        object2.lineTo(f13 += f4, f6 += f5);
        object2.lineTo(f4, f5);
        object2.lineTo(f4 += f3, f5);
        object2.close();
        int n5 = -16777216;
        f3 = -1.7014118E38f;
        object3.drawColor(n5);
        Paint paint = this.paintIpad;
        int n6 = paint.getAlpha();
        Gradient gradient = this.getColor_gradient();
        if (gradient != null && (gradient = this.linearGradient_classic) != null) {
            this.paintIpad.setShader((Shader)gradient);
            gradient = this.paintIpad;
            object5 = this.getColor_gradient();
            n4 = ((Gradient)object5).getColor();
            gradient.setColor(n4);
        } else {
            gradient = blurredImageView.paintIpad;
            n4 = blurredImageView.color_ipad;
            gradient.setColor(n4);
        }
        blurredImageView.paintIpad.setAlpha(n6);
        paint = blurredImageView.paintIpad;
        object5 = PorterDuff.Mode.CLEAR;
        gradient = new PorterDuffXfermode((PorterDuff.Mode)object5);
        paint.setXfermode((Xfermode)gradient);
        paint = blurredImageView.paintIpad;
        gradient = Paint.Style.FILL;
        paint.setStyle((Paint.Style)gradient);
        paint = blurredImageView.paintIpad;
        object3.drawPath((Path)file2, paint);
        paint = blurredImageView.paintIpad;
        n3 = 0;
        f5 = 0.0f;
        gradient = null;
        paint.setXfermode(null);
        paint = blurredImageView.paintIpad;
        object5 = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)object5);
        paint = blurredImageView.paintIpad;
        n4 = 0x3CCCCCCD;
        f13 = 0.025f;
        paint.setStrokeWidth(f2 *= f13);
        object = blurredImageView.paintIpad;
        object3.drawPath((Path)file2, (Paint)object);
        blurredImageView.paintIpad.setXfermode(null);
        file2 = blurredImageView.paintIpad;
        object = Paint.Style.FILL;
        file2.setStyle((Paint.Style)object);
        file2 = blurredImageView.paintIpad.getShader();
        blurredImageView.paintIpad.setShader(null);
        blurredImageView.paintIpad.setColor(n5);
        object = blurredImageView.paintIpad;
        object3.drawPath((Path)object2, (Paint)object);
        blurredImageView.paintIpad.setShader((Shader)file2);
        object2 = file;
        object = bitmap2;
        blurredImageView.saveBitmap(bitmap2, file, "line_progress.png");
        f11 -= f9;
        float f14 = blurredImageView.paintIpad.getStrokeWidth();
        n5 = 0x3F000000;
        f3 = 0.5f;
        int n7 = Math.round(f11 += (f14 *= f3));
        int n8 = bitmap2.getHeight();
        object4 = Bitmap.Config.ARGB_8888;
        file2 = Bitmap.createBitmap((int)n7, (int)n8, (Bitmap.Config)object4);
        object3.setBitmap((Bitmap)file2);
        object = this.getColor_gradient();
        if (object != null && (object = blurredImageView.linearGradient_classic) != null) {
            blurredImageView.paintIpad.setShader((Shader)object);
            object = blurredImageView.paintIpad;
            object4 = this.getColor_gradient();
            n5 = ((Gradient)object4).getColor();
            object.setColor(n5);
        } else {
            object = blurredImageView.paintIpad;
            n5 = blurredImageView.color_ipad;
            object.setColor(n5);
        }
        object = blurredImageView.paintIpad;
        object3.drawPaint((Paint)object);
        blurredImageView.saveBitmap((Bitmap)file2, (File)object2, "line_bg.png");
        object3 = Float.valueOf(f9);
        n5 = file2.getWidth();
        n7 = file2.getHeight();
        object = new Point(n5, n7);
        object2 = new Pair(object3, object);
        return object2;
    }

    private void saveProgressBitmapTypeBlue(File file) {
        int n = (int)this.rectFProgress.width();
        int n2 = (int)this.rectFProgress.height();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas(bitmap);
        float f = canvas.getHeight();
        float f2 = 0.5f;
        float f3 = f * f2;
        float f4 = this.rectFProgress.height() * 0.18f;
        Paint paint = this.linePaint;
        paint.setStrokeWidth(f2 *= f4);
        paint = this.linePaint;
        int n3 = this.paintLecture.getColor();
        paint.setColor(n3);
        float f5 = canvas.getWidth();
        Paint paint2 = this.linePaint;
        paint = canvas;
        canvas.drawLine(0.0f, f3, f5, f3, paint2);
        this.saveBitmap(bitmap, file, "line_bg.png");
        bitmap.eraseColor(0);
        this.linePaint.setStrokeWidth(f4);
        paint = this.linePaint;
        n3 = this.color_line_bg;
        paint.setColor(n3);
        f5 = canvas.getWidth();
        paint2 = this.linePaint;
        paint = canvas;
        canvas.drawLine(0.0f, f3, f5, f3, paint2);
        this.saveBitmap(bitmap, file, "line_progress.png");
    }

    private Pair saveProgressBitmapTypeHeart(File file, Bitmap bitmap) {
        Gradient gradient;
        BlurredImageView blurredImageView = this;
        File file2 = file;
        int n = bitmap.getWidth();
        float f = this.rectFProgress.height();
        int n2 = (int)f;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Object object = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Object object2 = new Canvas(object);
        Path path = new Path();
        float f2 = this.rectFProgress.width();
        float f3 = this.rectFProgress.height();
        float f4 = this.rectFProgress.centerX();
        int n3 = object2.getHeight();
        float f5 = n3;
        int n4 = 0x3F000000;
        float f6 = f5 * 0.5f;
        float f7 = Math.min(f2, f3) / 2.0f;
        f2 = 0.6f * f7;
        float f8 = f6 + f2;
        path.moveTo(f4, f8);
        float f9 = f7 * 1.2f;
        f3 = f4 + f9;
        f2 = 0.1f * f7;
        float f10 = f6 + f2;
        float f11 = f7 * 0.8f;
        float f12 = f4 + f11;
        f2 = 0.9f * f7;
        float f13 = f6 - f2;
        f2 = 0.4f * f7;
        float f14 = f6 - f2;
        config = path;
        f5 = f10;
        path.cubicTo(f3, f10, f12, f13, f4, f14);
        f3 = f4 - f11;
        f12 = f4 - f9;
        f5 = f13;
        f14 = f8;
        path.cubicTo(f3, f13, f12, f10, f4, f8);
        path.close();
        config = new RectF();
        path.computeBounds((RectF)config, true);
        f3 = 0.536f * f7;
        f2 = config.bottom - (f6 -= f3);
        int n5 = Math.round(f2);
        Paint paint = this.paintIpad;
        int n6 = paint.getAlpha();
        Gradient gradient2 = this.getColor_gradient();
        if (gradient2 != null && (gradient2 = this.linearGradient_classic) != null) {
            this.paintIpad.setShader((Shader)gradient2);
            gradient2 = this.paintIpad;
            gradient = this.getColor_gradient();
            n4 = gradient.getColor();
            gradient2.setColor(n4);
        } else {
            gradient2 = blurredImageView.paintIpad;
            n4 = blurredImageView.color_ipad;
            gradient2.setColor(n4);
        }
        blurredImageView.paintIpad.setAlpha(n6);
        object2.drawColor(-16777216);
        paint = blurredImageView.paintIpad;
        gradient2 = Paint.Style.FILL;
        paint.setStyle((Paint.Style)gradient2);
        paint = blurredImageView.paintIpad;
        gradient = PorterDuff.Mode.CLEAR;
        gradient2 = new PorterDuffXfermode((PorterDuff.Mode)gradient);
        paint.setXfermode((Xfermode)gradient2);
        paint = blurredImageView.paintIpad;
        object2.drawPath(path, paint);
        blurredImageView.paintIpad.setXfermode(null);
        paint = blurredImageView.paintIpad;
        gradient = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)gradient);
        paint = blurredImageView.paintIpad;
        paint.setStrokeWidth(f7 *= 0.02f);
        paint = blurredImageView.paintIpad;
        object2.drawPath(path, paint);
        blurredImageView.saveBitmap((Bitmap)object, file2, "line_progress.png");
        blurredImageView.paintIpad.setXfermode(null);
        gradient2 = PorterDuff.Mode.CLEAR;
        object2.drawColor(0, (PorterDuff.Mode)gradient2);
        paint = blurredImageView.paintIpad;
        object2.drawPaint(paint);
        blurredImageView.saveBitmap((Bitmap)object, file2, "line_bg.png");
        object = Float.valueOf(f6);
        object2 = n5;
        file2 = new Pair(object, object2);
        return file2;
    }

    private void saveProgressBitmapTypeIPAD_NEOMORPHIC(File file, Bitmap bitmap) {
        int n = (int)this.rectFProgress.width();
        int n2 = (int)this.rectFProgress.height();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas(bitmap2);
        TextPaint textPaint = this.paintText;
        float f = this.ipad_rect.width() * 0.0388f;
        textPaint.setTextSize(f);
        textPaint = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, (Rect)textPaint);
        f = this.rectFProgress.width();
        float f2 = textPaint.width();
        this.newLeft_txt = f = (f - f2) * 0.964f;
        this.txt_y = f2 = (float)canvas.getHeight() * 0.76f;
        f2 = canvas.getHeight();
        f = 0.5f;
        f2 *= f;
        float f3 = this.rectFProgress.height() * 0.18f;
        this.linePaint.setStrokeWidth(f *= f3);
        Paint paint = this.linePaint;
        int n3 = this.paintLecture.getColor();
        paint.setColor(n3);
        float f4 = canvas.getHeight();
        float f5 = (float)canvas.getWidth() * 0.024f;
        canvas.save();
        float f6 = canvas.getWidth();
        float f7 = canvas.getHeight();
        canvas.clipRect(f5, 0.0f, f6, f7);
        float f8 = f2 - f;
        f7 = canvas.getWidth();
        float f9 = f2 + f;
        Paint paint2 = this.linePaint;
        textPaint = canvas;
        f6 = f8;
        float f10 = f9;
        float f11 = f9;
        f9 = f4;
        float f12 = f8;
        f8 = f4;
        Paint paint3 = paint2;
        canvas.drawRoundRect(0.0f, f6, f7, f10, f4, f4, paint2);
        canvas.restore();
        this.saveBitmap(bitmap2, file, "line_bg.png");
        bitmap2.eraseColor(0);
        canvas.save();
        f8 = f10;
        canvas.clipRect(0.0f, f6, f5, f10);
        int n4 = bitmap2.getWidth();
        int n5 = bitmap2.getHeight();
        textPaint = new Rect(0, 0, n4, n5);
        n5 = (int)this.rectFProgress.left;
        n3 = (int)this.rectFProgress.top;
        int n6 = (int)this.rectFProgress.right;
        int n7 = (int)this.rectFProgress.bottom;
        config = new Rect(n5, n3, n6, n7);
        canvas.drawBitmap(bitmap, (Rect)config, (Rect)textPaint, null);
        f7 = canvas.getWidth();
        Paint paint4 = this.linePaint;
        textPaint = canvas;
        f6 = f12;
        f10 = f11;
        f9 = f4;
        f8 = f4;
        f11 = f12;
        paint3 = paint4;
        canvas.drawRoundRect(0.0f, f12, f7, f10, f4, f4, paint4);
        canvas.restore();
        this.saveBitmap(bitmap2, file, "line_bg_tmp.png");
        this.linePaint.setStrokeWidth(f3);
        textPaint = this.linePaint;
        n4 = this.color_line_bg;
        textPaint.setColor(n4);
        bitmap2.eraseColor(0);
        f7 = canvas.getWidth();
        paint3 = this.linePaint;
        textPaint = canvas;
        canvas.drawRoundRect(0.0f, f12, f7, f10, f4, f4, paint3);
        this.saveBitmap(bitmap2, file, "line_progress.png");
    }

    private void saveProgressCassetBitmap(File file, int n, int n2, Drawable drawable2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        drawable2.setBounds(0, 0, n, n2);
        drawable2.draw(canvas);
        this.saveBitmap((Bitmap)config, file, "line_bg.png");
    }

    private void slideInToLeft(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f = this.AccelerateDecelerateInterpolator(f);
            f2 = 255.0f * f;
            int n3 = Math.round(f2);
            float f3 = 1.0f - f;
            f = 0.0f;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3, f3);
            CharSequence charSequence = new StringBuilder("quran_in_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private void slideInToRight(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f = this.AccelerateDecelerateInterpolator(f);
            f2 = 255.0f * f;
            int n3 = Math.round(f2);
            float f3 = -1.0f + f;
            f = 0.0f;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3, f3);
            CharSequence charSequence = new StringBuilder("quran_in_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private void slideOutToLeft(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f = this.AccelerateDecelerateInterpolator(f);
            f2 = (1.0f - f) * 255.0f;
            int n3 = Math.round(f2);
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3, f *= -1.0f);
            CharSequence charSequence = new StringBuilder("quran_out_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private void slideOutToRight(Canvas canvas, Bitmap bitmap, QuranEntity quranEntity, File file, int n, int n2) {
        for (int i = 1; i < n2; ++i) {
            float f = i;
            float f2 = n2;
            f /= f2;
            f = this.AccelerateDecelerateInterpolator(f);
            f2 = (1.0f - f) * 255.0f;
            int n3 = Math.round(f2);
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, n3, f);
            CharSequence charSequence = new StringBuilder("quran_out_");
            charSequence = charSequence.append(n).append("_").append(i);
            String string2 = ".png";
            charSequence = charSequence.append(string2).toString();
            this.saveBitmap(bitmap, file, (String)charSequence);
        }
    }

    private void updateBismilahEntity() {
        float f;
        float f2;
        int n;
        int n2;
        boolean bl;
        Object object = this.bismilahEntity;
        int n3 = 1062836634;
        float f3 = 0.85f;
        int n4 = 1065353216;
        float f4 = 1.0f;
        if (object != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.bismilahEntity;
            n2 = this.getmCanvas_width();
            n = this.getmCanvas_height();
            ((EntityView)object).setCanvasWH(n2, n);
            this.bismilahEntity.setFactor_scale(f4);
            this.bismilahEntity.setFcSize(f4);
            object = this.bismilahEntity;
            RectF rectF = this.rectFAya;
            n = (int)(rectF.width() * f3);
            RectF rectF2 = this.rectFAya;
            float f5 = rectF2.height() * f3;
            int n5 = (int)f5;
            ((BismilahEntity)object).update(rectF, n, n5);
            this.bismilahEntity.createStaticLayout();
            object = this.bismilahEntity;
            n2 = ((BismilahEntity)object).getmPreset();
            ((BismilahEntity)object).initPreset(n2);
            object = this.bismilahEntity;
            rectF = ((BismilahEntity)object).getPaintAya();
            f2 = rectF.getTextSize();
            n = this.getmCanvas_width();
            f = n;
            ((EntityView)object).setFcSize(f2 /= f);
        }
        if ((object = this.mIsti3adhaEntity) != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.mIsti3adhaEntity;
            n2 = this.getmCanvas_width();
            n = this.getmCanvas_height();
            ((EntityView)object).setCanvasWH(n2, n);
            this.mIsti3adhaEntity.setFactor_scale(f4);
            this.mIsti3adhaEntity.setFcSize(f4);
            object = this.mIsti3adhaEntity;
            RectF rectF = this.rectFAya;
            f2 = rectF.width() * f3;
            n2 = (int)f2;
            RectF rectF3 = this.rectFAya;
            f = rectF3.height() * f3;
            n3 = (int)f;
            ((BismilahEntity)object).update(rectF, n2, n3);
            this.mIsti3adhaEntity.createStaticLayout();
            object = this.mIsti3adhaEntity;
            n3 = ((BismilahEntity)object).getmPreset();
            ((BismilahEntity)object).initPreset(n3);
            object = this.mIsti3adhaEntity;
            TextPaint textPaint = ((BismilahEntity)object).getPaintAya();
            f3 = textPaint.getTextSize();
            n4 = this.getmCanvas_width();
            f4 = n4;
            ((EntityView)object).setFcSize(f3 /= f4);
        }
    }

    private void updateSelectionOnTap(MotionEvent object) {
        float f = object.getX();
        float f2 = object.getY();
        object = this.findEntityAtPoint(f, f2);
        this.setEntity_select((EntityView)object);
        object = this.iViewCallback;
        if (object != null) {
            EntityView entityView = this.entity_select;
            if (entityView != null) {
                object.onSelect(entityView);
            } else {
                object.onEmtyClick();
            }
        }
        this.invalidate();
    }

    public float AccelerateDecelerateInterpolator(float f) {
        return (float)(Math.cos((double)(f + 1.0f) * Math.PI) / 2.0) + 0.5f;
    }

    public void addBismilahEntity(BismilahEntity bismilahEntity) {
        this.bismilahEntity = bismilahEntity;
    }

    public void addEntity(QuranEntity quranEntity) {
        this.quranEntities.add(quranEntity);
        int n = this.quranEntities.size() + -1;
        quranEntity.setIndex(n);
    }

    public void addEntity(QuranEntity quranEntity, int n) {
        List list = this.quranEntities;
        int n2 = list.size();
        if (n < n2) {
            list = this.quranEntities;
            list.add(n, quranEntity);
        } else {
            list = this.quranEntities;
            list.add(quranEntity);
        }
        quranEntity.setIndex(n);
    }

    public void addEntity(TranslationQuranEntity translationQuranEntity) {
        this.translationEntities.add(translationQuranEntity);
        int n = this.translationEntities.size() + -1;
        translationQuranEntity.setIndex(n);
    }

    public void addEntity(TranslationQuranEntity translationQuranEntity, int n) {
        List list = this.translationEntities;
        int n2 = list.size();
        if (n < n2) {
            list = this.translationEntities;
            list.add(n, translationQuranEntity);
        } else {
            list = this.translationEntities;
            list.add(translationQuranEntity);
        }
        translationQuranEntity.setIndex(n);
    }

    public void addIsti3adhaEntity(BismilahEntity bismilahEntity) {
        this.mIsti3adhaEntity = bismilahEntity;
    }

    public void animWatermark(float f, float f2, float f3) {
        this.isAnimWatermk = true;
        this.wmAlpha = f;
        this.wmScale = f2;
        this.wmTranslateY = f3;
        this.invalidate();
    }

    public void applyAll(float f, RectF rectF, int n, int n2) {
        EntityView entityView = this.entity_select;
        if (entityView == null) {
            return;
        }
        n = entityView instanceof QuranEntity;
        if (n != 0) {
            entityView = (QuranEntity)entityView;
            Iterator iterator = this.quranEntities.iterator();
            while ((n2 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                QuranEntity quranEntity = (QuranEntity)iterator.next();
                if (quranEntity == entityView) continue;
                int n3 = this.getmCanvas_width();
                TextPaint textPaint = ((QuranEntity)entityView).getPaintAya();
                float f2 = textPaint.getTextSize();
                float f3 = entityView.getFactorSize();
                quranEntity.applyAll(n3, rectF, f2, f3);
            }
            this.invalidate();
        } else {
            n = entityView instanceof TranslationQuranEntity;
            if (n != 0) {
                entityView = (TranslationQuranEntity)entityView;
                Iterator iterator = this.translationEntities.iterator();
                while ((n2 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)iterator.next();
                    if (translationQuranEntity == entityView) continue;
                    int n4 = this.getmCanvas_width();
                    TextPaint textPaint = ((TranslationQuranEntity)entityView).getPaintAya();
                    float f4 = textPaint.getTextSize();
                    float f5 = entityView.getFactorSize();
                    translationQuranEntity.applyAll(n4, rectF, f4, f5);
                }
                this.invalidate();
            }
        }
    }

    public float calculateTextSize(String string2, Paint paint, int n, int n2) {
        int n3;
        float f = 0.0f;
        if (string2 != null && (n3 = string2.isEmpty()) == 0 && n > 0 && n2 > 0) {
            n3 = 1065353216;
            float f2 = 1.0f;
            paint.setTextSize(f2);
            Rect rect = new Rect();
            int n4 = string2.length();
            paint.getTextBounds(string2, 0, n4, rect);
            rect.width();
            rect.height();
            n4 = 1148846080;
            float f3 = 1000.0f;
            int n5 = 0;
            while (true) {
                float f4;
                int n6 = 100;
                float f5 = 1.4E-43f;
                if (n5 >= n6) break;
                f5 = (f + f3) / 2.0f;
                paint.setTextSize(f5);
                int n7 = string2.length();
                paint.getTextBounds(string2, 0, n7, rect);
                float f6 = rect.width();
                int n8 = rect.height();
                float f7 = n8;
                float f8 = n;
                n7 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
                if (n7 <= 0 && (n7 = (int)((f4 = f7 - (f6 = (float)n2)) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1))) <= 0) {
                    f = f5;
                } else {
                    f3 = f5;
                }
                ++n5;
            }
        }
        return f;
    }

    public void changeColorIpad() {
        Gradient gradient = this.getColor_gradient();
        if (gradient != null) {
            gradient = this.getColor_gradient();
            this.setColorIpad(gradient);
        } else {
            int n = this.colorIpad();
            this.setColorIpad(n);
        }
    }

    public void changeTypeIpad(int n) {
        this.mIpadType = n;
        this.updateIpad();
        n = this.mIpadType;
        IpadType ipadType = IpadType.BOTTOM_RECT;
        int n2 = ipadType.ordinal();
        if (n == n2) {
            TextPaint textPaint = this.paintText;
            ipadType = this.ipad_rect;
            float f = ipadType.width();
            RectF rectF = this.ipad_rect;
            float f2 = rectF.height();
            f = Math.min(f, f2);
            f2 = 0.07f;
            textPaint.setTextSize(f *= f2);
        } else {
            n = this.mIpadType;
            ipadType = IpadType.BORDER;
            n2 = ipadType.ordinal();
            if (n == n2) {
                TextPaint textPaint = this.paintText;
                ipadType = this.ipad_rect;
                float f = ipadType.width();
                RectF rectF = this.ipad_rect;
                float f3 = rectF.height();
                f = Math.min(f, f3);
                f3 = 0.027f;
                textPaint.setTextSize(f *= f3);
            } else {
                TextPaint textPaint = this.paintText;
                ipadType = this.ipad_rect;
                float f = ipadType.width();
                float f4 = 0.0388f;
                textPaint.setTextSize(f *= f4);
            }
        }
    }

    public int colorIpad() {
        return this.color_ipad;
    }

    public void createRect() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        int n;
        RectF rectF7;
        RectF rectF8;
        RectF rectF9;
        float f;
        int n2;
        Bitmap bitmap;
        float f2;
        RectF rectF10;
        float f3;
        int n3;
        float f4;
        int n4;
        float f5;
        RectF rectF11;
        float f6;
        float f7;
        RectF rectF12;
        BlurredImageView blurredImageView = this;
        this.updatePosSurahName();
        int n5 = this.mIpadType;
        Enum enum_ = IpadType.IPAD_CLASSIC;
        int n6 = enum_.ordinal();
        float f8 = 0.35f;
        int n7 = 1069547520;
        float f9 = 1.5f;
        float f10 = 0.03f;
        int n8 = 1053609165;
        float f11 = 0.4f;
        float f12 = 0.5f;
        float f13 = 0.25f;
        int n9 = 1041865114;
        float f14 = 0.15f;
        float f15 = 0.2f;
        if (n5 == n6) {
            rectF12 = this.ipad_rect;
            f7 = rectF12.height();
            f6 = this.bitmapSquare.getHeight();
            f7 -= f6;
            f6 = f7 * f10;
            rectF11 = this.ipad_rect;
            f5 = rectF11.centerX();
            n4 = this.bitmapSquare.getWidth();
            f4 = (float)n4 * f12;
            f5 -= f4;
            f4 = this.ipad_rect.top + f6;
            n3 = this.bitmapSquare.getHeight();
            f3 = n3;
            f4 += f3;
            this.rectFSurahName = rectF10 = new RectF();
            f3 = this.ipad_rect.width() * f11;
            f2 = f7 * f15 - f6;
            bitmap = this.bitmapSquare;
            n2 = bitmap.getWidth();
            f = (float)n2 + f5;
            float f16 = f6 * f9;
            f3 = f - f3;
            this.rectFSurahName.set(f3, f4, f, f2 += (f4 += f16));
            this.rectFAya = rectF9 = new RectF();
            f9 = f7 * f8 - f6;
            n6 = this.bitmapSquare.getWidth();
            f6 = (float)n6 + f5;
            this.rectFAya.set(f5, f2, f6, f9 += f2);
            enum_ = new RectF();
            this.rectFProgress = enum_;
            f6 = f7 * f14;
            f4 = this.rectFAya.right;
            rectF10 = this.rectFProgress;
            rectF10.set(f5, f9, f4, f6 += f9);
            rectF9 = this.rectFAya;
            rectF9.bottom = f4 = this.rectFProgress.centerY();
            this.rectFLecture = rectF9 = new RectF();
            f7 *= f13;
            rectF9 = this.rectFAya;
            f9 = rectF9.right;
            rectF8 = this.rectFLecture;
            rectF8.set(f5, f6, f9, f7 += f6);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.IPAD_NEOMORPHIC;
        n6 = enum_.ordinal();
        n7 = 1050253722;
        f9 = 0.3f;
        if (n5 == n6) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            n6 = 1058642330;
            f6 = (f7 *= 0.6f) * f10;
            f5 = blurredImageView.ipad_rect.top;
            f4 = blurredImageView.ipad_rect.width() * f9;
            n3 = 1075419546;
            f5 += (f4 *= 2.4f);
            blurredImageView.rectFSurahName = rectF8 = new RectF();
            f4 = blurredImageView.ipad_rect.width() * f12 * f12;
            f3 = blurredImageView.ipad_rect.height();
            f2 = 0.1f;
            f3 *= f2;
            n2 = 0x40333333;
            f = 2.8f * f6;
            bitmap = blurredImageView.rectFSurahName;
            f9 = blurredImageView.ipad_rect.centerX() - f4;
            f14 = blurredImageView.ipad_rect.centerX() + f4;
            bitmap.set(f9, f5, f14, f3 += (f5 += f));
            f9 = blurredImageView.rectFSurahName.centerY();
            f14 = 2.0f * f6;
            blurredImageView.rectFAya = rectF7 = new RectF();
            f5 = f7 * f13 - f6 + (f9 += f14);
            f4 = blurredImageView.ipad_rect.left + f6;
            f3 = blurredImageView.ipad_rect.right - f6;
            rectF7.set(f4, f9, f3, f5);
            f9 = 0.055f * f7;
            blurredImageView.rectFProgress = rectF9 = new RectF();
            f7 = f7 * f15 + (f5 += f9);
            f9 = blurredImageView.bitmapSquare.getWidth();
            n9 = 1059481190;
            f14 = 0.65f;
            rectF7 = blurredImageView.rectFProgress;
            f4 = blurredImageView.ipad_rect.centerX() - (f9 *= f14);
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.centerX() + f9;
            rectF7.set(f4, f5, f3, f7);
            f7 += f6;
            enum_ = blurredImageView.rectFAya;
            ((RectF)enum_).bottom = f9 = blurredImageView.rectFProgress.centerY();
            enum_ = new RectF();
            blurredImageView.rectFLecture = enum_;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).bottom;
            rectF9 = blurredImageView.bitmapSquare;
            n7 = rectF9.getWidth();
            f9 = (float)n7 * f2;
            rectF7 = blurredImageView.rectFLecture;
            rectF11 = blurredImageView.rectFProgress;
            f5 = rectF11.left - f9;
            rectF8 = blurredImageView.rectFProgress;
            f4 = rectF8.right + f9;
            rectF7.set(f5, f7, f4, f6);
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.IPAD).ordinal()) || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.IPAD_UNBLUR).ordinal())) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            f6 = blurredImageView.bitmapSquare.getHeight();
            f7 -= f6;
            f6 = f7 * f10;
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.centerX();
            n9 = blurredImageView.bitmapSquare.getWidth();
            f14 = (float)n9 * f12;
            f9 -= f14;
            f14 = blurredImageView.ipad_rect.top + f6;
            n = blurredImageView.bitmapSquare.getHeight();
            f5 = n;
            f14 += f5;
            blurredImageView.rectFSurahName = rectF11 = new RectF();
            f5 = blurredImageView.ipad_rect.width() * f11;
            f4 = f7 * f15 - f6;
            rectF10 = blurredImageView.bitmapSquare;
            n3 = rectF10.getWidth();
            f3 = (float)n3 + f9;
            f2 = 1.5f;
            f = f6 * f2;
            f5 = f3 - f5;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f5, f14, f3, f4 += (f14 += f));
            blurredImageView.rectFAya = rectF7 = new RectF();
            f14 = f7 * f8 - f6;
            f6 = (float)blurredImageView.bitmapSquare.getWidth() + f9;
            rectF11 = blurredImageView.rectFAya;
            rectF11.set(f9, f4, f6, f14 += f4);
            enum_ = new RectF();
            blurredImageView.rectFProgress = enum_;
            n6 = 1041865114;
            f5 = f7 * 0.15f;
            f6 = blurredImageView.rectFAya.right;
            rectF8 = blurredImageView.rectFProgress;
            rectF8.set(f9, f14, f6, f5 += f14);
            enum_ = blurredImageView.rectFAya;
            ((RectF)enum_).bottom = f14 = blurredImageView.rectFProgress.centerY();
            enum_ = new RectF();
            blurredImageView.rectFLecture = enum_;
            f7 *= f13;
            enum_ = blurredImageView.rectFAya;
            f6 = ((RectF)enum_).right;
            rectF7 = blurredImageView.rectFLecture;
            rectF7.set(f9, f5, f6, f7 += f5);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.ROUND_RECT;
        n6 = enum_.ordinal();
        n7 = 1017370378;
        f9 = 0.02f;
        n9 = 1057300152;
        f14 = 0.52f;
        n = 1043073073;
        f5 = 0.168f;
        n4 = 1061158912;
        f4 = 0.75f;
        if (n5 == n6) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1032805417;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).left + (f7 *= 0.07f);
            f3 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF6 = new RectF();
            f2 = blurredImageView.ipad_rect.width() * f14;
            bitmap = blurredImageView.ipad_rect;
            f = bitmap.height() * f13;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.right - f7;
            f2 = f8 - f2;
            blurredImageView.rectFSurahName.set(f2, f3, f8, f += f3);
            blurredImageView.rectFAya = rectF4 = new RectF();
            f10 = blurredImageView.ipad_rect.width() * f9;
            f3 = blurredImageView.ipad_rect.left + f10;
            rectF6 = blurredImageView.ipad_rect;
            f2 = rectF6.right - f10;
            f10 = blurredImageView.ipad_rect.height();
            float f17 = 0.3f;
            f10 = f10 * f17 + f;
            blurredImageView.rectFAya.set(f3, f, f2, f10);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.height() * f5 + f10;
            blurredImageView.rectFProgress.set(f6, f10, f8, f9);
            rectF4 = blurredImageView.rectFAya;
            rectF10 = blurredImageView.rectFProgress;
            rectF4.bottom = f3 = rectF10.centerY();
            blurredImageView.rectFLecture = rectF4 = new RectF();
            rectF4 = blurredImageView.ipad_rect;
            f10 = rectF4.bottom;
            rectF12 = blurredImageView.rectFLecture;
            rectF12.set(f6, f9, f8, f10 -= (f7 *= f4));
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.RECT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1028443341;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).left + (f7 *= 0.05f);
            f8 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * f14;
            f10 = blurredImageView.ipad_rect.height() * f13;
            f3 = blurredImageView.ipad_rect.right - f7;
            f9 = f3 - f9;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f9, f8, f3, f10 += f8);
            blurredImageView.rectFAya = rectF5 = new RectF();
            f8 = blurredImageView.ipad_rect.height();
            n7 = 1050253722;
            f8 = f8 * 0.3f + f10;
            blurredImageView.rectFAya.set(f6, f10, f3, f8);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.height() * 0.18f;
            f10 = blurredImageView.rectFAya.right;
            rectF10 = blurredImageView.rectFProgress;
            rectF10.set(f6, f8, f10, f9 += f8);
            rectF5 = blurredImageView.rectFAya;
            rectF5.bottom = f10 = blurredImageView.rectFProgress.centerY();
            blurredImageView.rectFLecture = rectF5 = new RectF();
            rectF5 = blurredImageView.rectFAya;
            f8 = rectF5.right;
            rectF4 = blurredImageView.ipad_rect;
            f10 = rectF4.bottom - f7;
            rectF12 = blurredImageView.rectFLecture;
            rectF12.set(f6, f9, f8, f10);
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BOTTOM_RECT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1000593162;
            f6 = blurredImageView.ipad_rect.width() * 0.025f;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.left + f6;
            f6 = blurredImageView.ipad_rect.top + (f7 *= 0.005f);
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * 0.37f;
            f10 = blurredImageView.ipad_rect.height() * f15;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.right;
            f2 = blurredImageView.ipad_rect.width();
            n2 = 1014350479;
            f = 0.015f;
            f9 = (f3 -= (f2 *= f)) - f9;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f9, f6, f3, f10 += f6);
            f6 = blurredImageView.ipad_rect.height();
            f9 = blurredImageView.ipad_rect.width();
            f6 = Math.min(f6, f9);
            blurredImageView.rectFAya = rectF9 = new RectF();
            f2 = f6 * f13 + (f10 += f7);
            rectF9.set(f8, f10, f3, f2);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            f6 *= 0.3f;
            f9 = blurredImageView.rectFAya.right;
            blurredImageView.rectFProgress.set(f8, f2, f9, f6 += f2);
            f6 = blurredImageView.rectFProgress.bottom;
            n7 = 0x40200000;
            blurredImageView.rectFLecture = rectF12 = new RectF();
            f7 = blurredImageView.rectFAya.right;
            rectF9 = blurredImageView.rectFAya;
            f9 = rectF9.height() + (f6 -= (f7 *= 2.5f));
            rectF4 = blurredImageView.rectFLecture;
            rectF4.set(f8, f6, f7, f9);
            rectF12 = blurredImageView.rectFAya;
            enum_ = blurredImageView.rectFProgress;
            f6 = ((RectF)enum_).top;
            f8 = 1.025f;
            rectF12.bottom = f6 *= f8;
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.BLACK_LAYER;
        n6 = enum_.ordinal();
        f8 = 0.8f;
        n7 = 1051595899;
        f9 = 0.34f;
        f10 = 0.014f;
        if (n5 == n6) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SQUARE;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                n5 = n7;
                f7 = f9;
            } else {
                n5 = n8;
                f7 = f11;
            }
            f6 = blurredImageView.ipad_rect.width() * f10;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.left + f6;
            f2 = blurredImageView.ipad_rect.top + f6;
            bitmap = new RectF();
            blurredImageView.rectFSurahName = bitmap;
            f = blurredImageView.ipad_rect.width();
            rectF7 = blurredImageView.ipad_rect;
            f14 = rectF7.height();
            f14 = Math.min(f, f14);
            f7 *= f14;
            f = blurredImageView.ipad_rect.height();
            float f18 = 0.12f;
            f *= f18;
            rectF3 = blurredImageView.ipad_rect;
            f15 = rectF3.right - f6;
            f7 = f15 - f7;
            blurredImageView.rectFSurahName.set(f7, f2, f15, f += f2);
            f7 = blurredImageView.ipad_rect.centerY() * f8;
            blurredImageView.rectFAya = rectF2 = new RectF();
            f2 = f14 * 0.15f;
            f13 = blurredImageView.ipad_rect.left + f2;
            bitmap = blurredImageView.ipad_rect;
            f = bitmap.right - f2;
            float f19 = f14 * 0.3f;
            f2 = f7 + f19;
            blurredImageView.rectFAya.set(f13, f7, f, f2);
            f7 = blurredImageView.rectFAya.centerY();
            blurredImageView.rectFProgress = rectF5 = new RectF();
            f14 = f14 * f5 + f7;
            rectF2 = blurredImageView.rectFAya;
            f13 = rectF2.left;
            rectF6 = blurredImageView.rectFAya;
            f2 = rectF6.right;
            rectF5.set(f13, f7, f2, f14);
            blurredImageView.rectFLecture = rectF12 = new RectF();
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.bottom;
            enum_ = blurredImageView.rectFLecture;
            enum_.set(f3, f14, f15, f7 -= (f6 *= f4));
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.HEART;
        n6 = enum_.ordinal();
        f8 = 0.09f;
        if (n5 == n6 || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BATTERY).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f13 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF7 = new RectF();
                f14 = blurredImageView.ipad_rect.width();
                f15 = blurredImageView.ipad_rect.height();
                f14 = Math.min(f14, f15);
                f15 = f14 * f11;
                f3 = blurredImageView.ipad_rect.height() * f8;
                rectF6 = blurredImageView.ipad_rect;
                f2 = rectF6.right - f7;
                f15 = f2 - f15;
                bitmap = blurredImageView.rectFSurahName;
                bitmap.set(f15, f13, f2, f3 += f13);
                f13 = blurredImageView.ipad_rect.centerY();
                f15 = 0.3f;
                f13 *= f15;
                blurredImageView.rectFAya = rectF10 = new RectF();
                n3 = 1041865114;
                f = f14 * 0.15f;
                f3 = blurredImageView.ipad_rect.left + f;
                f5 = blurredImageView.ipad_rect.right - f;
                f14 = f14 * f15 + f13;
                blurredImageView.rectFAya.set(f3, f13, f5, f14);
                blurredImageView.rectFProgress = rectF2 = new RectF();
                rectF2 = blurredImageView.rectFAya;
                f13 = rectF2.width();
                f14 = blurredImageView.ipad_rect.centerY();
                f15 = blurredImageView.rectFAya.width() * f12;
                f13 += (f14 -= f15);
                rectF3 = blurredImageView.rectFProgress;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.left;
                rectF10 = blurredImageView.rectFAya;
                f3 = rectF10.right;
                rectF3.set(f5, f14, f3, f13);
                blurredImageView.rectFLecture = rectF7 = new RectF();
                rectF7 = blurredImageView.ipad_rect;
                f14 = rectF7.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f13, f2, f14 -= (f7 *= f4));
            }
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.YOUTUBE_THUMBNAIL;
            n6 = enum_.ordinal();
            f13 = 0.9f;
            n9 = 1067869798;
            f14 = 1.3f;
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f15 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF11 = new RectF();
                f5 = blurredImageView.ipad_rect.width();
                f3 = blurredImageView.ipad_rect.height();
                f5 = Math.min(f5, f3);
                f3 = f5 * f11;
                f2 = blurredImageView.ipad_rect.height();
                n2 = 1041865114;
                f2 *= 0.15f;
                bitmap = blurredImageView.ipad_rect;
                f = bitmap.right - f7;
                f3 = f - f3;
                blurredImageView.rectFSurahName.set(f3, f15, f, f2 += f15);
                f12 = blurredImageView.ipad_rect.centerY() * f9;
                blurredImageView.rectFAya = rectF3 = new RectF();
                f15 = 0.55f * f5;
                f3 = blurredImageView.ipad_rect.left + f15;
                f2 = blurredImageView.ipad_rect.right - f15;
                f5 = f5 * 0.3f + f12;
                blurredImageView.rectFAya.set(f3, f12, f2, f5);
                blurredImageView.rectFProgress = rectF = new RectF();
                f12 = blurredImageView.rectFAya.centerY() * f14;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.bottom * f13;
                rectF11 = blurredImageView.rectFProgress;
                rectF10 = blurredImageView.rectFAya;
                f3 = rectF10.left;
                rectF6 = blurredImageView.rectFAya;
                f2 = rectF6.right;
                rectF11.set(f3, f12, f2, f15);
                blurredImageView.rectFLecture = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f15, f, f12 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f12 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF3 = new RectF();
                f15 = blurredImageView.ipad_rect.width();
                f5 = blurredImageView.ipad_rect.height();
                f15 = Math.min(f15, f5);
                f5 = f15 * f9;
                f3 = blurredImageView.ipad_rect.height() * f8;
                rectF6 = blurredImageView.ipad_rect;
                f2 = rectF6.right - f7;
                f5 = f2 - f5;
                bitmap = blurredImageView.rectFSurahName;
                bitmap.set(f5, f12, f2, f3 += f12);
                f12 = blurredImageView.ipad_rect.centerY();
                n = 1050253722;
                f5 = 0.3f;
                f12 *= f5;
                blurredImageView.rectFAya = rectF10 = new RectF();
                n3 = 1048576000;
                f = f15 * 0.25f;
                rectF10 = blurredImageView.ipad_rect;
                f3 = rectF10.left + f;
                f9 = blurredImageView.ipad_rect.right - f;
                f15 = f15 * f5 + f12;
                rectF11 = blurredImageView.rectFAya;
                rectF11.set(f3, f12, f9, f15);
                blurredImageView.rectFProgress = rectF9 = new RectF();
                f9 = blurredImageView.rectFAya.centerY() * f14;
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.bottom * f13;
                rectF2 = blurredImageView.rectFProgress;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF3 = blurredImageView.rectFAya;
                f15 = rectF3.right;
                rectF2.set(f14, f9, f15, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f2, f9 -= (f7 *= f4));
            }
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.CASSET;
        n6 = enum_.ordinal();
        n7 = 1044549468;
        f9 = 0.19f;
        if (n5 == n6 || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.CASSET_IMG).ordinal()) || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.CASSET_IMG_BLUR).ordinal())) {
            f7 = blurredImageView.ipad_rect.width() * 0.012f;
            f6 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF = new RectF();
            f12 = blurredImageView.ipad_rect.width();
            f13 = blurredImageView.ipad_rect.height();
            f12 = Math.min(f12, f13);
            f13 = blurredImageView.ipad_rect.height() * f9;
            f14 = blurredImageView.ipad_rect.right - f7;
            f7 = f14 - (f12 *= 0.45f);
            blurredImageView.rectFSurahName.set(f7, f6, f14, f13 += f6);
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1051260355;
            f7 *= 0.33f;
            enum_ = blurredImageView.ipad_rect;
            f6 = enum_.height() * 0.2f;
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.top + f6;
            rectF7 = blurredImageView.ipad_rect;
            f14 = rectF7.centerX() - f7;
            rectF3 = blurredImageView.ipad_rect;
            f15 = rectF3.centerX() + f7;
            blurredImageView.rectFAya = rectF2 = new RectF(f14, f12, f15, f6 += f12);
            blurredImageView.rectFProgress = rectF12 = new RectF();
            blurredImageView.rectFLecture = rectF12 = new RectF();
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.GRADIENT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width() * f10;
            f6 = blurredImageView.ipad_rect.left + f7;
            blurredImageView.ipad_rect.centerY();
            blurredImageView.rectFSurahName = rectF = new RectF();
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.width();
            f13 = blurredImageView.ipad_rect.height();
            f12 = Math.min(f12, f13);
            f14 = f12 * 0.52f;
            rectF2 = blurredImageView.ipad_rect;
            f13 = rectF2.right - f7;
            f14 = f13 - f14;
            blurredImageView.rectFAya = rectF3 = new RectF();
            f5 = f12 * 0.15f;
            f15 = blurredImageView.ipad_rect.left + f5;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.right - f5;
            n = 1050253722;
            f2 = f12 * 0.3f;
            f5 = blurredImageView.ipad_rect.bottom;
            n2 = 0x3F733333;
            f = 0.95f;
            bitmap = blurredImageView.rectFAya;
            f9 = (f5 *= f) - f2;
            bitmap.set(f15, f9, f3, f5);
            rectF9 = blurredImageView.rectFSurahName;
            f15 = blurredImageView.rectFAya.centerY() - f2;
            f5 = blurredImageView.rectFAya.centerY();
            rectF9.set(f14, f15, f13, f5);
            f9 = blurredImageView.rectFAya.centerY();
            blurredImageView.rectFProgress = rectF7 = new RectF();
            f12 = f12 * 0.168f + f9;
            rectF3 = blurredImageView.rectFAya;
            f15 = rectF3.left;
            rectF11 = blurredImageView.rectFAya;
            f5 = rectF11.right;
            rectF7.set(f15, f9, f5, f12);
            blurredImageView.rectFLecture = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.bottom;
            blurredImageView.rectFLecture.set(f6, f12, f13, f9 -= (f7 *= f4));
            rectF12 = blurredImageView.rectFSurahName;
            enum_ = blurredImageView.rectFAya;
            rectF12.bottom = f6 = ((RectF)enum_).top;
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.MASK_BRUSH).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f13 = f15 - f13;
                blurredImageView.rectFSurahName.set(f13, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.height() * 0.19f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.15f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f13, f9, f5, f3);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f14 = f12 * 0.25f;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f14 = f15 - f14;
                blurredImageView.rectFSurahName.set(f14, f9, f15, f13 += f9);
                f9 = blurredImageView.ipad_rect.height() * 0.11f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.15f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f13, f9, f5, f3);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f14 = f12 * 0.25f;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f14 = f15 - f14;
                blurredImageView.rectFSurahName.set(f14, f9, f15, f13 += f9);
                f9 = -blurredImageView.rectFSurahName.height() * 0.5f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.3f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                rectF10 = blurredImageView.rectFAya;
                rectF10.set(f13, f9, f5, f14 += f9);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BLUE_TYPE).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = blurredImageView.ipad_rect.height();
                f12 = Math.min(f12, f13);
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right - f7;
                f13 = f15 - f13;
                blurredImageView.rectFSurahName.set(f13, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.3f;
                f9 *= f13;
                blurredImageView.rectFAya = rectF7 = new RectF();
                f5 = f12 * 0.15f;
                f14 = blurredImageView.ipad_rect.left + f5;
                rectF10 = blurredImageView.ipad_rect;
                f3 = rectF10.right - f5;
                f5 = f12 * f13 + f9;
                blurredImageView.rectFAya.set(f14, f9, f3, f5);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.2f;
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + (f9 *= f13);
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = blurredImageView.ipad_rect.height();
                f12 = Math.min(f12, f13);
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * 0.15f;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right - f7;
                f5 = f15 - f13;
                rectF10 = blurredImageView.rectFSurahName;
                rectF10.set(f5, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.centerY() * 0.34f;
                blurredImageView.rectFAya = rectF7 = new RectF();
                f14 = blurredImageView.ipad_rect.left + f13;
                f5 = blurredImageView.ipad_rect.right - f13;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f14, f9, f5, f3);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.2f;
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + (f9 *= f13);
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF4 = new RectF();
                rectF4 = blurredImageView.ipad_rect;
                f10 = rectF4.width();
                f12 = blurredImageView.ipad_rect.height();
                f10 = Math.min(f10, f12);
                f12 = 0.34f * f10;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF5 = blurredImageView.ipad_rect;
                f8 = rectF5.right - f7;
                f12 = f8 - f12;
                blurredImageView.rectFSurahName.set(f12, f9, f8, f13 += f9);
                f9 = blurredImageView.ipad_rect.centerY();
                f12 = 0.3f;
                f9 *= f12;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f15 = f10 * 0.2f;
                f13 = blurredImageView.ipad_rect.left + f15;
                f14 = blurredImageView.ipad_rect.right - f15;
                f12 = f12 * f10 + f9;
                rectF3 = blurredImageView.rectFAya;
                rectF3.set(f13, f9, f14, f12);
                f9 = blurredImageView.ipad_rect.centerY();
                f12 = 0.2f;
                blurredImageView.rectFProgress = rectF = new RectF();
                f10 = f10 * 0.16f + (f9 *= f12);
                rectF2 = blurredImageView.rectFAya;
                f13 = rectF2.left;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.right;
                rectF.set(f13, f9, f14, f10);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f10, f8, f9 -= (f7 *= f4));
            }
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BORDER).ordinal())) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            f6 = blurredImageView.bitmapSquare.getHeight();
            f10 = (f7 -= f6) * 0.03f;
            f6 = blurredImageView.ipad_rect.width() * 0.8f;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.centerX();
            f9 = 0.5f;
            f12 = f6 * f9;
            f8 -= f12;
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.top + f10;
            f13 = blurredImageView.bitmapSquare.getHeight();
            f12 = (f12 + f13) * f9;
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * f11;
            f15 = f7 * 0.2f - f10;
            f11 = f8 + f6;
            f13 = 1.5f * f10;
            f9 = f11 - f9;
            rectF2 = blurredImageView.rectFSurahName;
            rectF2.set(f9, f12, f11, f15 += (f12 += f13));
            blurredImageView.rectFAya = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.centerX();
            f12 = (f6 *= 0.7f) * 0.5f;
            n8 = 0x3EB33333;
            f11 = 0.35f * f7 - f10;
            blurredImageView.rectFAya.set(f9, f15, f6 += (f9 -= f12), f11 += f15);
            enum_ = new RectF();
            blurredImageView.rectFProgress = enum_;
            n6 = 1046562734;
            f6 = 0.22f * f7;
            f9 = blurredImageView.rectFSurahName.right;
            blurredImageView.rectFProgress.set(f8, f11, f9, f6 += f11);
            rectF9 = blurredImageView.rectFAya;
            rectF9.bottom = f10 = blurredImageView.rectFProgress.centerY();
            blurredImageView.rectFLecture = rectF9 = new RectF();
            n7 = 1048576000;
            f7 *= 0.25f;
            rectF9 = blurredImageView.rectFSurahName;
            f9 = rectF9.right;
            rectF4 = blurredImageView.rectFLecture;
            rectF4.set(f8, f6, f9, f7 += f6);
        } else {
            rectF12 = blurredImageView.paintIpad;
            enum_ = Paint.Style.FILL;
            rectF12.setStyle((Paint.Style)enum_);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.BOTTOM_RECT;
        n6 = enum_.ordinal();
        if (n5 != n6 && (n5 = blurredImageView.mIpadType) != (n6 = (enum_ = IpadType.ROUND_RECT).ordinal())) {
            rectF12 = blurredImageView.linePaint;
            enum_ = blurredImageView.rectFProgress;
            f6 = enum_.height();
            f8 = 0.03f;
            rectF12.setStrokeWidth(f6 *= f8);
        } else {
            rectF12 = blurredImageView.linePaint;
            enum_ = blurredImageView.rectFProgress;
            f6 = enum_.height();
            f8 = 0.02f;
            rectF12.setStrokeWidth(f6 *= f8);
        }
        blurredImageView.radius_cursur = f7 = blurredImageView.linePaint.getStrokeWidth() * 4.2f;
    }

    public void createRectWithoutSurahName() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        int n;
        RectF rectF7;
        RectF rectF8;
        RectF rectF9;
        float f;
        int n2;
        Bitmap bitmap;
        float f2;
        RectF rectF10;
        float f3;
        int n3;
        float f4;
        int n4;
        float f5;
        RectF rectF11;
        float f6;
        float f7;
        RectF rectF12;
        BlurredImageView blurredImageView = this;
        int n5 = this.mIpadType;
        Enum enum_ = IpadType.IPAD_CLASSIC;
        int n6 = enum_.ordinal();
        float f8 = 0.35f;
        int n7 = 1069547520;
        float f9 = 1.5f;
        float f10 = 0.03f;
        int n8 = 1053609165;
        float f11 = 0.4f;
        float f12 = 0.5f;
        float f13 = 0.25f;
        int n9 = 1041865114;
        float f14 = 0.15f;
        float f15 = 0.2f;
        if (n5 == n6) {
            rectF12 = this.ipad_rect;
            f7 = rectF12.height();
            f6 = this.bitmapSquare.getHeight();
            f7 -= f6;
            f6 = f7 * f10;
            rectF11 = this.ipad_rect;
            f5 = rectF11.centerX();
            n4 = this.bitmapSquare.getWidth();
            f4 = (float)n4 * f12;
            f5 -= f4;
            f4 = this.ipad_rect.top + f6;
            n3 = this.bitmapSquare.getHeight();
            f3 = n3;
            f4 += f3;
            this.rectFSurahName = rectF10 = new RectF();
            f3 = this.ipad_rect.width() * f11;
            f2 = f7 * f15 - f6;
            bitmap = this.bitmapSquare;
            n2 = bitmap.getWidth();
            f = (float)n2 + f5;
            float f16 = f6 * f9;
            f3 = f - f3;
            this.rectFSurahName.set(f3, f4, f, f2 += (f4 += f16));
            this.rectFAya = rectF9 = new RectF();
            f9 = f7 * f8 - f6;
            n6 = this.bitmapSquare.getWidth();
            f6 = (float)n6 + f5;
            this.rectFAya.set(f5, f2, f6, f9 += f2);
            enum_ = new RectF();
            this.rectFProgress = enum_;
            f6 = f7 * f14;
            f4 = this.rectFAya.right;
            rectF10 = this.rectFProgress;
            rectF10.set(f5, f9, f4, f6 += f9);
            rectF9 = this.rectFAya;
            rectF9.bottom = f4 = this.rectFProgress.centerY();
            this.rectFLecture = rectF9 = new RectF();
            f7 *= f13;
            rectF9 = this.rectFAya;
            f9 = rectF9.right;
            rectF8 = this.rectFLecture;
            rectF8.set(f5, f6, f9, f7 += f6);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.IPAD_NEOMORPHIC;
        n6 = enum_.ordinal();
        n7 = 1050253722;
        f9 = 0.3f;
        if (n5 == n6) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            n6 = 1058642330;
            f6 = (f7 *= 0.6f) * f10;
            f5 = blurredImageView.ipad_rect.top;
            f4 = blurredImageView.ipad_rect.width() * f9;
            n3 = 1075419546;
            f5 += (f4 *= 2.4f);
            blurredImageView.rectFSurahName = rectF8 = new RectF();
            f4 = blurredImageView.ipad_rect.width() * f12 * f12;
            f3 = blurredImageView.ipad_rect.height();
            f2 = 0.1f;
            f3 *= f2;
            n2 = 0x40333333;
            f = 2.8f * f6;
            bitmap = blurredImageView.rectFSurahName;
            f9 = blurredImageView.ipad_rect.centerX() - f4;
            f14 = blurredImageView.ipad_rect.centerX() + f4;
            bitmap.set(f9, f5, f14, f3 += (f5 += f));
            f9 = blurredImageView.rectFSurahName.centerY();
            f14 = 2.0f * f6;
            blurredImageView.rectFAya = rectF7 = new RectF();
            f5 = f7 * f13 - f6 + (f9 += f14);
            f4 = blurredImageView.ipad_rect.left + f6;
            f3 = blurredImageView.ipad_rect.right - f6;
            rectF7.set(f4, f9, f3, f5);
            f9 = 0.055f * f7;
            blurredImageView.rectFProgress = rectF9 = new RectF();
            f7 = f7 * f15 + (f5 += f9);
            f9 = blurredImageView.bitmapSquare.getWidth();
            n9 = 1059481190;
            f14 = 0.65f;
            rectF7 = blurredImageView.rectFProgress;
            f4 = blurredImageView.ipad_rect.centerX() - (f9 *= f14);
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.centerX() + f9;
            rectF7.set(f4, f5, f3, f7);
            f7 += f6;
            enum_ = blurredImageView.rectFAya;
            ((RectF)enum_).bottom = f9 = blurredImageView.rectFProgress.centerY();
            enum_ = new RectF();
            blurredImageView.rectFLecture = enum_;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).bottom;
            rectF9 = blurredImageView.bitmapSquare;
            n7 = rectF9.getWidth();
            f9 = (float)n7 * f2;
            rectF7 = blurredImageView.rectFLecture;
            rectF11 = blurredImageView.rectFProgress;
            f5 = rectF11.left - f9;
            rectF8 = blurredImageView.rectFProgress;
            f4 = rectF8.right + f9;
            rectF7.set(f5, f7, f4, f6);
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.IPAD).ordinal()) || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.IPAD_UNBLUR).ordinal())) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            f6 = blurredImageView.bitmapSquare.getHeight();
            f7 -= f6;
            f6 = f7 * f10;
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.centerX();
            n9 = blurredImageView.bitmapSquare.getWidth();
            f14 = (float)n9 * f12;
            f9 -= f14;
            f14 = blurredImageView.ipad_rect.top + f6;
            n = blurredImageView.bitmapSquare.getHeight();
            f5 = n;
            f14 += f5;
            blurredImageView.rectFSurahName = rectF11 = new RectF();
            f5 = blurredImageView.ipad_rect.width() * f11;
            f4 = f7 * f15 - f6;
            rectF10 = blurredImageView.bitmapSquare;
            n3 = rectF10.getWidth();
            f3 = (float)n3 + f9;
            f2 = 1.5f;
            f = f6 * f2;
            f5 = f3 - f5;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f5, f14, f3, f4 += (f14 += f));
            blurredImageView.rectFAya = rectF7 = new RectF();
            f14 = f7 * f8 - f6;
            f6 = (float)blurredImageView.bitmapSquare.getWidth() + f9;
            rectF11 = blurredImageView.rectFAya;
            rectF11.set(f9, f4, f6, f14 += f4);
            enum_ = new RectF();
            blurredImageView.rectFProgress = enum_;
            n6 = 1041865114;
            f5 = f7 * 0.15f;
            f6 = blurredImageView.rectFAya.right;
            rectF8 = blurredImageView.rectFProgress;
            rectF8.set(f9, f14, f6, f5 += f14);
            enum_ = blurredImageView.rectFAya;
            ((RectF)enum_).bottom = f14 = blurredImageView.rectFProgress.centerY();
            enum_ = new RectF();
            blurredImageView.rectFLecture = enum_;
            f7 *= f13;
            enum_ = blurredImageView.rectFAya;
            f6 = ((RectF)enum_).right;
            rectF7 = blurredImageView.rectFLecture;
            rectF7.set(f9, f5, f6, f7 += f5);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.ROUND_RECT;
        n6 = enum_.ordinal();
        n7 = 1017370378;
        f9 = 0.02f;
        n9 = 1057300152;
        f14 = 0.52f;
        n = 1043073073;
        f5 = 0.168f;
        n4 = 1061158912;
        f4 = 0.75f;
        if (n5 == n6) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1032805417;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).left + (f7 *= 0.07f);
            f3 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF6 = new RectF();
            f2 = blurredImageView.ipad_rect.width() * f14;
            bitmap = blurredImageView.ipad_rect;
            f = bitmap.height() * f13;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.right - f7;
            f2 = f8 - f2;
            blurredImageView.rectFSurahName.set(f2, f3, f8, f += f3);
            blurredImageView.rectFAya = rectF4 = new RectF();
            f10 = blurredImageView.ipad_rect.width() * f9;
            f3 = blurredImageView.ipad_rect.left + f10;
            rectF6 = blurredImageView.ipad_rect;
            f2 = rectF6.right - f10;
            f10 = blurredImageView.ipad_rect.height();
            float f17 = 0.3f;
            f10 = f10 * f17 + f;
            blurredImageView.rectFAya.set(f3, f, f2, f10);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.height() * f5 + f10;
            blurredImageView.rectFProgress.set(f6, f10, f8, f9);
            rectF4 = blurredImageView.rectFAya;
            rectF10 = blurredImageView.rectFProgress;
            rectF4.bottom = f3 = rectF10.centerY();
            blurredImageView.rectFLecture = rectF4 = new RectF();
            rectF4 = blurredImageView.ipad_rect;
            f10 = rectF4.bottom;
            rectF12 = blurredImageView.rectFLecture;
            rectF12.set(f6, f9, f8, f10 -= (f7 *= f4));
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.RECT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1028443341;
            enum_ = blurredImageView.ipad_rect;
            f6 = ((RectF)enum_).left + (f7 *= 0.05f);
            f8 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * f14;
            f10 = blurredImageView.ipad_rect.height() * f13;
            f3 = blurredImageView.ipad_rect.right - f7;
            f9 = f3 - f9;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f9, f8, f3, f10 += f8);
            blurredImageView.rectFAya = rectF5 = new RectF();
            f8 = blurredImageView.ipad_rect.height();
            n7 = 1050253722;
            f8 = f8 * 0.3f + f10;
            blurredImageView.rectFAya.set(f6, f10, f3, f8);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.height() * 0.18f;
            f10 = blurredImageView.rectFAya.right;
            rectF10 = blurredImageView.rectFProgress;
            rectF10.set(f6, f8, f10, f9 += f8);
            rectF5 = blurredImageView.rectFAya;
            rectF5.bottom = f10 = blurredImageView.rectFProgress.centerY();
            blurredImageView.rectFLecture = rectF5 = new RectF();
            rectF5 = blurredImageView.rectFAya;
            f8 = rectF5.right;
            rectF4 = blurredImageView.ipad_rect;
            f10 = rectF4.bottom - f7;
            rectF12 = blurredImageView.rectFLecture;
            rectF12.set(f6, f9, f8, f10);
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BOTTOM_RECT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1000593162;
            f6 = blurredImageView.ipad_rect.width() * 0.025f;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.left + f6;
            f6 = blurredImageView.ipad_rect.top + (f7 *= 0.005f);
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * 0.37f;
            f10 = blurredImageView.ipad_rect.height() * f15;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.right;
            f2 = blurredImageView.ipad_rect.width();
            n2 = 1014350479;
            f = 0.015f;
            f9 = (f3 -= (f2 *= f)) - f9;
            rectF6 = blurredImageView.rectFSurahName;
            rectF6.set(f9, f6, f3, f10 += f6);
            f6 = blurredImageView.ipad_rect.height();
            f9 = blurredImageView.ipad_rect.width();
            f6 = Math.min(f6, f9);
            blurredImageView.rectFAya = rectF9 = new RectF();
            f2 = f6 * f13 + (f10 += f7);
            rectF9.set(f8, f10, f3, f2);
            blurredImageView.rectFProgress = rectF9 = new RectF();
            f6 *= 0.3f;
            f9 = blurredImageView.rectFAya.right;
            blurredImageView.rectFProgress.set(f8, f2, f9, f6 += f2);
            f6 = blurredImageView.rectFProgress.bottom;
            n7 = 0x40200000;
            blurredImageView.rectFLecture = rectF12 = new RectF();
            f7 = blurredImageView.rectFAya.right;
            rectF9 = blurredImageView.rectFAya;
            f9 = rectF9.height() + (f6 -= (f7 *= 2.5f));
            rectF4 = blurredImageView.rectFLecture;
            rectF4.set(f8, f6, f7, f9);
            rectF12 = blurredImageView.rectFAya;
            enum_ = blurredImageView.rectFProgress;
            f6 = ((RectF)enum_).top;
            f8 = 1.025f;
            rectF12.bottom = f6 *= f8;
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.BLACK_LAYER;
        n6 = enum_.ordinal();
        f8 = 0.8f;
        n7 = 1051595899;
        f9 = 0.34f;
        f10 = 0.014f;
        if (n5 == n6) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SQUARE;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                n5 = n7;
                f7 = f9;
            } else {
                n5 = n8;
                f7 = f11;
            }
            f6 = blurredImageView.ipad_rect.width() * f10;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.left + f6;
            f2 = blurredImageView.ipad_rect.top + f6;
            bitmap = new RectF();
            blurredImageView.rectFSurahName = bitmap;
            f = blurredImageView.ipad_rect.width();
            rectF7 = blurredImageView.ipad_rect;
            f14 = rectF7.height();
            f14 = Math.min(f, f14);
            f7 *= f14;
            f = blurredImageView.ipad_rect.height();
            float f18 = 0.12f;
            f *= f18;
            rectF3 = blurredImageView.ipad_rect;
            f15 = rectF3.right - f6;
            f7 = f15 - f7;
            blurredImageView.rectFSurahName.set(f7, f2, f15, f += f2);
            f7 = blurredImageView.ipad_rect.centerY() * f8;
            blurredImageView.rectFAya = rectF2 = new RectF();
            f2 = f14 * 0.15f;
            f13 = blurredImageView.ipad_rect.left + f2;
            bitmap = blurredImageView.ipad_rect;
            f = bitmap.right - f2;
            float f19 = f14 * 0.3f;
            f2 = f7 + f19;
            blurredImageView.rectFAya.set(f13, f7, f, f2);
            f7 = blurredImageView.rectFAya.centerY();
            blurredImageView.rectFProgress = rectF5 = new RectF();
            f14 = f14 * f5 + f7;
            rectF2 = blurredImageView.rectFAya;
            f13 = rectF2.left;
            rectF6 = blurredImageView.rectFAya;
            f2 = rectF6.right;
            rectF5.set(f13, f7, f2, f14);
            blurredImageView.rectFLecture = rectF12 = new RectF();
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.bottom;
            enum_ = blurredImageView.rectFLecture;
            enum_.set(f3, f14, f15, f7 -= (f6 *= f4));
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.HEART;
        n6 = enum_.ordinal();
        f8 = 0.09f;
        if (n5 == n6 || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BATTERY).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f13 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF7 = new RectF();
                f14 = blurredImageView.ipad_rect.width();
                f15 = blurredImageView.ipad_rect.height();
                f14 = Math.min(f14, f15);
                f15 = f14 * f11;
                f3 = blurredImageView.ipad_rect.height() * f8;
                rectF6 = blurredImageView.ipad_rect;
                f2 = rectF6.right - f7;
                f15 = f2 - f15;
                bitmap = blurredImageView.rectFSurahName;
                bitmap.set(f15, f13, f2, f3 += f13);
                f13 = blurredImageView.ipad_rect.centerY();
                f15 = 0.3f;
                f13 *= f15;
                blurredImageView.rectFAya = rectF10 = new RectF();
                n3 = 1041865114;
                f = f14 * 0.15f;
                f3 = blurredImageView.ipad_rect.left + f;
                f5 = blurredImageView.ipad_rect.right - f;
                f14 = f14 * f15 + f13;
                blurredImageView.rectFAya.set(f3, f13, f5, f14);
                blurredImageView.rectFProgress = rectF2 = new RectF();
                rectF2 = blurredImageView.rectFAya;
                f13 = rectF2.width();
                f14 = blurredImageView.ipad_rect.centerY();
                f15 = blurredImageView.rectFAya.width() * f12;
                f13 += (f14 -= f15);
                rectF3 = blurredImageView.rectFProgress;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.left;
                rectF10 = blurredImageView.rectFAya;
                f3 = rectF10.right;
                rectF3.set(f5, f14, f3, f13);
                blurredImageView.rectFLecture = rectF7 = new RectF();
                rectF7 = blurredImageView.ipad_rect;
                f14 = rectF7.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f13, f2, f14 -= (f7 *= f4));
            }
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.YOUTUBE_THUMBNAIL;
            n6 = enum_.ordinal();
            f13 = 0.9f;
            n9 = 1067869798;
            f14 = 1.3f;
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f15 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF11 = new RectF();
                f5 = blurredImageView.ipad_rect.width();
                f3 = blurredImageView.ipad_rect.height();
                f5 = Math.min(f5, f3);
                f3 = f5 * f11;
                f2 = blurredImageView.ipad_rect.height();
                n2 = 1041865114;
                f2 *= 0.15f;
                bitmap = blurredImageView.ipad_rect;
                f = bitmap.right - f7;
                f3 = f - f3;
                blurredImageView.rectFSurahName.set(f3, f15, f, f2 += f15);
                f12 = blurredImageView.ipad_rect.centerY() * f9;
                blurredImageView.rectFAya = rectF3 = new RectF();
                f15 = 0.55f * f5;
                f3 = blurredImageView.ipad_rect.left + f15;
                f2 = blurredImageView.ipad_rect.right - f15;
                f5 = f5 * 0.3f + f12;
                blurredImageView.rectFAya.set(f3, f12, f2, f5);
                blurredImageView.rectFProgress = rectF = new RectF();
                f12 = blurredImageView.rectFAya.centerY() * f14;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.bottom * f13;
                rectF11 = blurredImageView.rectFProgress;
                rectF10 = blurredImageView.rectFAya;
                f3 = rectF10.left;
                rectF6 = blurredImageView.rectFAya;
                f2 = rectF6.right;
                rectF11.set(f3, f12, f2, f15);
                blurredImageView.rectFLecture = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f15, f, f12 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f12 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF3 = new RectF();
                f15 = blurredImageView.ipad_rect.width();
                f5 = blurredImageView.ipad_rect.height();
                f15 = Math.min(f15, f5);
                f5 = f15 * f9;
                f3 = blurredImageView.ipad_rect.height() * f8;
                rectF6 = blurredImageView.ipad_rect;
                f2 = rectF6.right - f7;
                f5 = f2 - f5;
                bitmap = blurredImageView.rectFSurahName;
                bitmap.set(f5, f12, f2, f3 += f12);
                f12 = blurredImageView.ipad_rect.centerY();
                n = 1050253722;
                f5 = 0.3f;
                f12 *= f5;
                blurredImageView.rectFAya = rectF10 = new RectF();
                n3 = 1048576000;
                f = f15 * 0.25f;
                rectF10 = blurredImageView.ipad_rect;
                f3 = rectF10.left + f;
                f9 = blurredImageView.ipad_rect.right - f;
                f15 = f15 * f5 + f12;
                rectF11 = blurredImageView.rectFAya;
                rectF11.set(f3, f12, f9, f15);
                blurredImageView.rectFProgress = rectF9 = new RectF();
                f9 = blurredImageView.rectFAya.centerY() * f14;
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.bottom * f13;
                rectF2 = blurredImageView.rectFProgress;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF3 = blurredImageView.rectFAya;
                f15 = rectF3.right;
                rectF2.set(f14, f9, f15, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f2, f9 -= (f7 *= f4));
            }
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.CASSET;
        n6 = enum_.ordinal();
        n7 = 1044549468;
        f9 = 0.19f;
        if (n5 == n6 || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.CASSET_IMG).ordinal()) || (n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.CASSET_IMG_BLUR).ordinal())) {
            f7 = blurredImageView.ipad_rect.width() * 0.012f;
            f6 = blurredImageView.ipad_rect.top + f7;
            blurredImageView.rectFSurahName = rectF = new RectF();
            f12 = blurredImageView.ipad_rect.width();
            f13 = blurredImageView.ipad_rect.height();
            f12 = Math.min(f12, f13);
            f13 = blurredImageView.ipad_rect.height() * f9;
            f14 = blurredImageView.ipad_rect.right - f7;
            f7 = f14 - (f12 *= 0.45f);
            blurredImageView.rectFSurahName.set(f7, f6, f14, f13 += f6);
            f7 = blurredImageView.ipad_rect.width();
            n6 = 1051260355;
            f7 *= 0.33f;
            enum_ = blurredImageView.ipad_rect;
            f6 = enum_.height() * 0.2f;
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.top + f6;
            rectF7 = blurredImageView.ipad_rect;
            f14 = rectF7.centerX() - f7;
            rectF3 = blurredImageView.ipad_rect;
            f15 = rectF3.centerX() + f7;
            blurredImageView.rectFAya = rectF2 = new RectF(f14, f12, f15, f6 += f12);
            blurredImageView.rectFProgress = rectF12 = new RectF();
            blurredImageView.rectFLecture = rectF12 = new RectF();
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.GRADIENT).ordinal())) {
            f7 = blurredImageView.ipad_rect.width() * f10;
            f6 = blurredImageView.ipad_rect.left + f7;
            blurredImageView.ipad_rect.centerY();
            blurredImageView.rectFSurahName = rectF = new RectF();
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.width();
            f13 = blurredImageView.ipad_rect.height();
            f12 = Math.min(f12, f13);
            f14 = f12 * 0.52f;
            rectF2 = blurredImageView.ipad_rect;
            f13 = rectF2.right - f7;
            f14 = f13 - f14;
            blurredImageView.rectFAya = rectF3 = new RectF();
            f5 = f12 * 0.15f;
            f15 = blurredImageView.ipad_rect.left + f5;
            rectF10 = blurredImageView.ipad_rect;
            f3 = rectF10.right - f5;
            n = 1050253722;
            f2 = f12 * 0.3f;
            f5 = blurredImageView.ipad_rect.bottom;
            n2 = 0x3F733333;
            f = 0.95f;
            bitmap = blurredImageView.rectFAya;
            f9 = (f5 *= f) - f2;
            bitmap.set(f15, f9, f3, f5);
            rectF9 = blurredImageView.rectFSurahName;
            f15 = blurredImageView.rectFAya.centerY() - f2;
            f5 = blurredImageView.rectFAya.centerY();
            rectF9.set(f14, f15, f13, f5);
            f9 = blurredImageView.rectFAya.centerY();
            blurredImageView.rectFProgress = rectF7 = new RectF();
            f12 = f12 * 0.168f + f9;
            rectF3 = blurredImageView.rectFAya;
            f15 = rectF3.left;
            rectF11 = blurredImageView.rectFAya;
            f5 = rectF11.right;
            rectF7.set(f15, f9, f5, f12);
            blurredImageView.rectFLecture = rectF9 = new RectF();
            rectF9 = blurredImageView.ipad_rect;
            f9 = rectF9.bottom;
            blurredImageView.rectFLecture.set(f6, f12, f13, f9 -= (f7 *= f4));
            rectF12 = blurredImageView.rectFSurahName;
            enum_ = blurredImageView.rectFAya;
            rectF12.bottom = f6 = ((RectF)enum_).top;
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.MASK_BRUSH).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f13 = f15 - f13;
                blurredImageView.rectFSurahName.set(f13, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.height() * 0.19f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.15f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f13, f9, f5, f3);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f14 = f12 * 0.25f;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f14 = f15 - f14;
                blurredImageView.rectFSurahName.set(f14, f9, f15, f13 += f9);
                f9 = blurredImageView.ipad_rect.height() * 0.11f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.15f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f13, f9, f5, f3);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f14 = f12 * 0.25f;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right;
                f14 = f15 - f14;
                blurredImageView.rectFSurahName.set(f14, f9, f15, f13 += f9);
                f9 = -blurredImageView.rectFSurahName.height() * 0.5f;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f14 = f12 * 0.3f;
                f13 = blurredImageView.ipad_rect.left + f14;
                f5 = blurredImageView.ipad_rect.right - f14;
                rectF10 = blurredImageView.rectFAya;
                rectF10.set(f13, f9, f5, f14 += f9);
                f9 = blurredImageView.rectFAya.centerY();
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + f9;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BLUE_TYPE).ordinal())) {
            n5 = blurredImageView.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n6 = enum_.ordinal();
            if (n5 == n6) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = blurredImageView.ipad_rect.height();
                f12 = Math.min(f12, f13);
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * f8;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right - f7;
                f13 = f15 - f13;
                blurredImageView.rectFSurahName.set(f13, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.3f;
                f9 *= f13;
                blurredImageView.rectFAya = rectF7 = new RectF();
                f5 = f12 * 0.15f;
                f14 = blurredImageView.ipad_rect.left + f5;
                rectF10 = blurredImageView.ipad_rect;
                f3 = rectF10.right - f5;
                f5 = f12 * f13 + f9;
                blurredImageView.rectFAya.set(f14, f9, f3, f5);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.2f;
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + (f9 *= f13);
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF = new RectF();
                rectF = blurredImageView.ipad_rect;
                f12 = rectF.width();
                f13 = blurredImageView.ipad_rect.height();
                f12 = Math.min(f12, f13);
                f13 = f12 * f11;
                f14 = blurredImageView.ipad_rect.height() * 0.15f;
                rectF3 = blurredImageView.ipad_rect;
                f15 = rectF3.right - f7;
                f5 = f15 - f13;
                rectF10 = blurredImageView.rectFSurahName;
                rectF10.set(f5, f9, f15, f14 += f9);
                f9 = blurredImageView.ipad_rect.centerY() * 0.34f;
                blurredImageView.rectFAya = rectF7 = new RectF();
                f14 = blurredImageView.ipad_rect.left + f13;
                f5 = blurredImageView.ipad_rect.right - f13;
                f3 = f12 * 0.3f + f9;
                blurredImageView.rectFAya.set(f14, f9, f5, f3);
                f9 = blurredImageView.ipad_rect.centerY();
                f13 = 0.2f;
                blurredImageView.rectFProgress = rectF2 = new RectF();
                n9 = 1043073073;
                f12 = f12 * 0.168f + (f9 *= f13);
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.left;
                rectF11 = blurredImageView.rectFAya;
                f5 = rectF11.right;
                rectF2.set(f14, f9, f5, f12);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f12, f15, f9 -= (f7 *= f4));
            }
            if ((n5 = blurredImageView.mResizetype) == (n6 = (enum_ = ResizeType.SQUARE).ordinal())) {
                f7 = blurredImageView.ipad_rect.width() * f10;
                enum_ = blurredImageView.ipad_rect;
                f6 = ((RectF)enum_).left + f7;
                f9 = blurredImageView.ipad_rect.top + f7;
                blurredImageView.rectFSurahName = rectF4 = new RectF();
                rectF4 = blurredImageView.ipad_rect;
                f10 = rectF4.width();
                f12 = blurredImageView.ipad_rect.height();
                f10 = Math.min(f10, f12);
                f12 = 0.34f * f10;
                f13 = blurredImageView.ipad_rect.height() * f8;
                rectF5 = blurredImageView.ipad_rect;
                f8 = rectF5.right - f7;
                f12 = f8 - f12;
                blurredImageView.rectFSurahName.set(f12, f9, f8, f13 += f9);
                f9 = blurredImageView.ipad_rect.centerY();
                f12 = 0.3f;
                f9 *= f12;
                blurredImageView.rectFAya = rectF2 = new RectF();
                f15 = f10 * 0.2f;
                f13 = blurredImageView.ipad_rect.left + f15;
                f14 = blurredImageView.ipad_rect.right - f15;
                f12 = f12 * f10 + f9;
                rectF3 = blurredImageView.rectFAya;
                rectF3.set(f13, f9, f14, f12);
                f9 = blurredImageView.ipad_rect.centerY();
                f12 = 0.2f;
                blurredImageView.rectFProgress = rectF = new RectF();
                f10 = f10 * 0.16f + (f9 *= f12);
                rectF2 = blurredImageView.rectFAya;
                f13 = rectF2.left;
                rectF7 = blurredImageView.rectFAya;
                f14 = rectF7.right;
                rectF.set(f13, f9, f14, f10);
                blurredImageView.rectFLecture = rectF9 = new RectF();
                rectF9 = blurredImageView.ipad_rect;
                f9 = rectF9.bottom;
                rectF12 = blurredImageView.rectFLecture;
                rectF12.set(f6, f10, f8, f9 -= (f7 *= f4));
            }
        }
        if ((n5 = blurredImageView.mIpadType) == (n6 = (enum_ = IpadType.BORDER).ordinal())) {
            rectF12 = blurredImageView.ipad_rect;
            f7 = rectF12.height();
            f6 = blurredImageView.bitmapSquare.getHeight();
            f10 = (f7 -= f6) * 0.03f;
            f6 = blurredImageView.ipad_rect.width() * 0.8f;
            rectF5 = blurredImageView.ipad_rect;
            f8 = rectF5.centerX();
            f9 = 0.5f;
            f12 = f6 * f9;
            f8 -= f12;
            rectF = blurredImageView.ipad_rect;
            f12 = rectF.top + f10;
            f13 = blurredImageView.bitmapSquare.getHeight();
            f12 = (f12 + f13) * f9;
            blurredImageView.rectFSurahName = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.width() * f11;
            f15 = f7 * 0.2f - f10;
            f11 = f8 + f6;
            f13 = 1.5f * f10;
            f9 = f11 - f9;
            rectF2 = blurredImageView.rectFSurahName;
            rectF2.set(f9, f12, f11, f15 += (f12 += f13));
            blurredImageView.rectFAya = rectF9 = new RectF();
            f9 = blurredImageView.ipad_rect.centerX();
            f12 = (f6 *= 0.7f) * 0.5f;
            n8 = 0x3EB33333;
            f11 = 0.35f * f7 - f10;
            blurredImageView.rectFAya.set(f9, f15, f6 += (f9 -= f12), f11 += f15);
            enum_ = new RectF();
            blurredImageView.rectFProgress = enum_;
            n6 = 1046562734;
            f6 = 0.22f * f7;
            f9 = blurredImageView.rectFSurahName.right;
            blurredImageView.rectFProgress.set(f8, f11, f9, f6 += f11);
            rectF9 = blurredImageView.rectFAya;
            rectF9.bottom = f10 = blurredImageView.rectFProgress.centerY();
            blurredImageView.rectFLecture = rectF9 = new RectF();
            n7 = 1048576000;
            f7 *= 0.25f;
            rectF9 = blurredImageView.rectFSurahName;
            f9 = rectF9.right;
            rectF4 = blurredImageView.rectFLecture;
            rectF4.set(f8, f6, f9, f7 += f6);
        } else {
            rectF12 = blurredImageView.paintIpad;
            enum_ = Paint.Style.FILL;
            rectF12.setStyle((Paint.Style)enum_);
        }
        n5 = blurredImageView.mIpadType;
        enum_ = IpadType.BOTTOM_RECT;
        n6 = enum_.ordinal();
        if (n5 != n6 && (n5 = blurredImageView.mIpadType) != (n6 = (enum_ = IpadType.ROUND_RECT).ordinal())) {
            rectF12 = blurredImageView.linePaint;
            enum_ = blurredImageView.rectFProgress;
            f6 = enum_.height();
            f8 = 0.03f;
            rectF12.setStrokeWidth(f6 *= f8);
        } else {
            rectF12 = blurredImageView.linePaint;
            enum_ = blurredImageView.rectFProgress;
            f6 = enum_.height();
            f8 = 0.02f;
            rectF12.setStrokeWidth(f6 *= f8);
        }
        blurredImageView.radius_cursur = f7 = blurredImageView.linePaint.getStrokeWidth() * 4.2f;
    }

    /*
     * Unable to fully structure code
     */
    public void drawBitmapWithShadow(Canvas var1_1) {
        block29: {
            var2_3 = this.bitmapSquare;
            if (var2_3 == null || (var3_4 = var2_3.isRecycled()) != 0) break block29;
            var2_3 = this.bitmapSquare;
            var3_4 = var2_3.getWidth();
            var4_5 = var3_4;
            var5_6 = 1022739087;
            var6_7 = 0.03f;
            var4_5 *= var6_7;
            var8_9 = BlurMaskFilter.Blur.INNER;
            var7_8 = new BlurMaskFilter(var4_5, var8_9);
            var2_3 = new Paint();
            var9_10 = 1;
            var10_11 = 1.4E-45f;
            var2_3.setAntiAlias((boolean)var9_10);
            var9_10 = -16777216;
            var10_11 = -1.7014118E38f;
            var2_3.setColor(var9_10);
            var2_3.setMaskFilter((MaskFilter)var7_8);
            var7_8 = this.ipad_rect;
            var6_7 = var7_8.centerX();
            var8_9 = this.bitmapSquare;
            var9_10 = var8_9.getWidth();
            var10_11 = var9_10;
            var11_12 = 0.5f;
            var6_7 -= (var10_11 *= var11_12);
            this.left_square = var6_7;
            var7_8 = this.ipad_rect;
            var6_7 = var7_8.top;
            var8_9 = this.bitmapBlured;
            var9_10 = var8_9.getHeight();
            var10_11 = var9_10;
            var11_12 = 0.02f;
            var6_7 += (var10_11 *= var11_12);
            this.top_square = var6_7;
            var7_8 = this.bitmapSquare;
            if (var7_8 == null) ** GOTO lbl65
            var5_6 = (int)var7_8.isRecycled();
            if (var5_6 != 0) ** GOTO lbl65
            var7_8 = this.bitmapSquare;
            var10_11 = this.left_square;
            var11_12 = this.top_square;
            var1_1.drawBitmap((Bitmap)var7_8, var10_11, var11_12, (Paint)var2_3);
lbl65:
            // 3 sources

            if ((var2_3 = this.bitmapSquare) == null) break block29;
            var3_4 = (int)var2_3.isRecycled();
            if (var3_4 != 0) break block29;
            var2_3 = this.bitmapSquare;
            var6_7 = this.left_square;
            var10_11 = this.top_square;
            var12_13 = this.paint;
            try {
                var1_1.drawBitmap(var2_3, var6_7, var10_11, var12_13);
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public void drawBitmapWithShadowTypeBottom(Canvas canvas) {
        block15: {
            boolean bl;
            Bitmap bitmap = this.bitmapSquare;
            if (bitmap != null && !(bl = bitmap.isRecycled())) {
                bitmap = this.ipad_rect;
                float f = bitmap.left;
                this.left_square = f;
                bitmap = this.ipad_rect;
                f = bitmap.top;
                Bitmap bitmap2 = this.bitmapSquare;
                int n = bitmap2.getHeight();
                float f2 = n;
                f -= f2;
                this.top_square = f;
                bitmap = this.bitmapSquare;
                if (bitmap == null) break block15;
                bl = bitmap.isRecycled();
                if (bl) break block15;
                bitmap = this.bitmapSquare;
                f2 = this.left_square;
                float f3 = this.top_square;
                Paint paint = this.paint;
                try {
                    canvas.drawBitmap(bitmap, f2, f3, paint);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public void drawBitmapWithShadowTypeBottomSave(Canvas canvas) {
        block14: {
            boolean bl;
            Bitmap bitmap = this.bitmapSquare;
            if (bitmap != null && !(bl = bitmap.isRecycled())) {
                bitmap = this.ipad_rect;
                float f = bitmap.left;
                this.left_square = f;
                bitmap = this.ipad_rect;
                f = bitmap.top;
                Bitmap bitmap2 = this.bitmapSquare;
                int n = bitmap2.getHeight();
                float f2 = n;
                f -= f2;
                this.top_square = f;
                bitmap = this.bitmapSquare;
                if (bitmap == null) break block14;
                bl = bitmap.isRecycled();
                if (bl) break block14;
                bitmap = this.bitmapSquare;
                f2 = this.left_square;
                float f3 = this.top_square;
                try {
                    canvas.drawBitmap(bitmap, f2, f3, null);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public void drawRectBottom(Canvas canvas, RectF object) {
        int n = this.isGlass();
        if (n != 0) {
            int n2;
            float f;
            Object object2;
            int n3;
            int n4;
            float f2;
            RectF rectF;
            int n5;
            int n6;
            int n7;
            float f3 = object.width();
            float f4 = object.height();
            Math.min(f3, f4);
            Gradient gradient = this.color_gradient;
            if (gradient != null) {
                float[] fArray;
                n = gradient.getColor();
                n7 = Color.red((int)n);
                n6 = Color.green((int)n);
                n5 = Color.blue((int)n);
                n7 = Color.argb((int)70, (int)n7, (int)n6, (int)n5);
                rectF = this.ipad_rect;
                n5 = this.color_gradient.getAngle();
                f2 = n5;
                n4 = this.color_gradient.getColor();
                n3 = this.color_gradient.getSecond();
                Gradient gradient2 = this.color_gradient;
                int n8 = gradient2.getThree();
                object2 = new int[]{n4, n3, n8};
                n3 = 3;
                f = 4.2E-45f;
                float[] fArray2 = fArray = new float[n3];
                fArray[0] = 0.0f;
                fArray2[1] = 0.7f;
                fArray2[2] = 1.0f;
                rectF = CreateGradient.createLinearGradientWithAngle(rectF, f2, object2, fArray);
                Paint paint = this.paintIpad;
                paint.setShader((Shader)rectF);
                rectF = this.paintIpad;
                rectF.setColor(n7);
            } else {
                n = this.color_ipad;
                n7 = Color.red((int)n);
                n6 = Color.green((int)this.color_ipad);
                n5 = Color.blue((int)this.color_ipad);
                n4 = 60;
                n7 = Color.argb((int)n4, (int)n7, (int)n6, (int)n5);
                rectF = this.paintIpad;
                rectF.setColor(n7);
            }
            Paint paint = this.paintIpad;
            rectF = Paint.Style.FILL;
            paint.setStyle((Paint.Style)rectF);
            paint = this.paintIpad;
            canvas.drawRect(object, paint);
            paint = this.paintIpad;
            rectF = Paint.Style.STROKE;
            paint.setStyle((Paint.Style)rectF);
            paint = this.paintIpad;
            float f5 = object.height() * 0.003f;
            paint.setStrokeWidth(f5);
            paint = this.paintIpad;
            n6 = Color.red((int)n) + 40;
            n5 = 255;
            f2 = 3.57E-43f;
            n6 = Math.min(n5, n6);
            n4 = Color.green((int)n) + 40;
            n4 = Math.min(n5, n4);
            n = Color.blue((int)n) + 40;
            n = Math.min(n5, n);
            n3 = 120;
            n = Color.argb((int)n3, (int)n6, (int)n4, (int)n);
            paint.setColor(n);
            gradient = this.paintIpad;
            canvas.drawRect(object, (Paint)gradient);
            f = object.left;
            float f6 = object.top;
            float f7 = object.right;
            float f8 = object.bottom;
            n7 = Color.argb((int)140, (int)n5, (int)n5, (int)n5);
            f5 = 1.4E-44f;
            n6 = Color.argb((int)10, (int)n5, (int)n5, (int)n5);
            int[] nArray = new int[]{n7, n6};
            n7 = 2;
            f4 = 2.8E-45f;
            float[] fArray = new float[n7];
            fArray[0] = 0.0f;
            fArray[1] = 1.0f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            object2 = gradient;
            gradient = new LinearGradient(f, f6, f7, f8, nArray, fArray, tileMode);
            this.paintIpad.setShader((Shader)gradient);
            gradient = this.paintIpad;
            paint = Paint.Style.FILL;
            gradient.setStyle((Paint.Style)paint);
            gradient = this.paintIpad;
            canvas.drawRect(object, (Paint)gradient);
            canvas = this.paintIpad;
            object = this.color_gradient;
            if (object != null) {
                object = this.linearGradient_classic;
            } else {
                n2 = 0;
                object = null;
            }
            canvas.setShader((Shader)object);
            canvas = this.paintIpad;
            n2 = this.color_ipad;
            canvas.setColor(n2);
            canvas = this.paintIpad;
            n2 = 190;
            canvas.setAlpha(n2);
        } else {
            Paint paint = this.paintIpad;
            canvas.drawRect(object, paint);
        }
    }

    public void drawRectWithShadow(Canvas canvas, RectF rectF, int n, int n2, int n3, int n4, boolean bl) {
        BlurredImageView blurredImageView = this;
        Canvas canvas2 = canvas;
        Object object = rectF;
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        boolean bl2 = this.isGlass();
        int n9 = 1041194025;
        float f = 0.14f;
        int n10 = 80;
        float f2 = 1.12E-43f;
        int n11 = 1;
        float f3 = Float.MIN_VALUE;
        if (bl2) {
            int n12;
            float f4;
            RectF rectF2;
            float f5 = rectF.width();
            float f6 = rectF.height();
            f5 = Math.min(f5, f6) * f;
            Object object2 = new Paint();
            object2.setAntiAlias(n11 != 0);
            object2.setColor(n);
            float f7 = n2;
            Object object3 = BlurMaskFilter.Blur.OUTER;
            Object object4 = new BlurMaskFilter(f7, (BlurMaskFilter.Blur)object3);
            object2.setMaskFilter((MaskFilter)object4);
            object2.setAlpha(n10);
            object4 = new Path();
            Path.Direction direction = Path.Direction.CW;
            if (bl) {
                object4.addRoundRect(rectF, f5, f5, direction);
            } else {
                object4.addRect(rectF, direction);
            }
            f7 = n7;
            float f8 = n8;
            object4.offset(f7, f8);
            canvas2.drawPath((Path)object4, object2);
            object4 = blurredImageView.color_gradient;
            if (object4 != null) {
                float[] fArray;
                n5 = ((Gradient)object4).getColor();
                n6 = Color.red((int)n5);
                n7 = Color.green((int)n5);
                n8 = Color.blue((int)n5);
                f = 9.8E-44f;
                n6 = Color.argb((int)70, (int)n6, (int)n7, (int)n8);
                rectF2 = blurredImageView.ipad_rect;
                n8 = blurredImageView.color_gradient.getAngle();
                f4 = n8;
                n9 = blurredImageView.color_gradient.getColor();
                n10 = blurredImageView.color_gradient.getSecond();
                object3 = blurredImageView.color_gradient;
                n11 = ((Gradient)object3).getThree();
                object2 = new int[]{n9, n10, n11};
                n10 = 3;
                f2 = 4.2E-45f;
                float[] fArray2 = fArray = new float[n10];
                fArray[0] = 0.0f;
                fArray2[1] = 0.7f;
                fArray2[2] = 1.0f;
                rectF2 = CreateGradient.createLinearGradientWithAngle(rectF2, f4, (int[])object2, fArray);
                Paint paint = blurredImageView.paintIpad;
                paint.setShader((Shader)rectF2);
                rectF2 = blurredImageView.paintIpad;
                rectF2.setColor(n6);
            } else {
                n5 = blurredImageView.color_ipad;
                n6 = Color.red((int)n5);
                n7 = Color.green((int)blurredImageView.color_ipad);
                n8 = Color.blue((int)blurredImageView.color_ipad);
                n9 = 60;
                f = 8.4E-44f;
                n6 = Color.argb((int)n9, (int)n6, (int)n7, (int)n8);
                rectF2 = blurredImageView.paintIpad;
                rectF2.setColor(n6);
            }
            direction = blurredImageView.paintIpad;
            rectF2 = Paint.Style.FILL;
            direction.setStyle((Paint.Style)rectF2);
            direction = blurredImageView.paintIpad;
            if (bl) {
                canvas2.drawRoundRect(object, f5, f5, (Paint)direction);
            } else {
                canvas2.drawRect(object, (Paint)direction);
            }
            direction = blurredImageView.paintIpad;
            rectF2 = Paint.Style.STROKE;
            direction.setStyle((Paint.Style)rectF2);
            direction = blurredImageView.paintIpad;
            f8 = rectF.height() * 0.003f;
            direction.setStrokeWidth(f8);
            direction = blurredImageView.paintIpad;
            n7 = Color.red((int)n5) + 40;
            n8 = 255;
            f4 = 3.57E-43f;
            n7 = Math.min(n8, n7);
            n9 = Color.green((int)n5) + 40;
            n9 = Math.min(n8, n9);
            n5 = Color.blue((int)n5) + 40;
            n5 = Math.min(n8, n5);
            n10 = 120;
            f2 = 1.68E-43f;
            n5 = Color.argb((int)n10, (int)n7, (int)n9, (int)n5);
            direction.setColor(n5);
            object4 = blurredImageView.paintIpad;
            if (bl) {
                canvas2.drawRoundRect(object, f5, f5, (Paint)object4);
            } else {
                canvas2.drawRect(object, (Paint)object4);
            }
            f2 = object.left;
            f3 = object.top;
            f6 = object.right;
            float f9 = object.bottom;
            n6 = Color.argb((int)140, (int)n8, (int)n8, (int)n8);
            f8 = 1.4E-44f;
            n7 = Color.argb((int)10, (int)n8, (int)n8, (int)n8);
            int[] nArray = new int[]{n6, n7};
            n6 = 2;
            f7 = 2.8E-45f;
            float[] fArray = new float[n6];
            fArray[0] = 0.0f;
            fArray[1] = 1.0f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            object2 = object4;
            object4 = new LinearGradient(f2, f3, f6, f9, nArray, fArray, tileMode);
            blurredImageView.paintIpad.setShader((Shader)object4);
            object4 = blurredImageView.paintIpad;
            direction = Paint.Style.FILL;
            object4.setStyle((Paint.Style)direction);
            object4 = blurredImageView.paintIpad;
            if (bl) {
                canvas2.drawRoundRect(object, f5, f5, (Paint)object4);
            } else {
                canvas2.drawRect(object, (Paint)object4);
            }
            canvas2 = blurredImageView.paintIpad;
            object = blurredImageView.color_gradient;
            if (object != null) {
                object = blurredImageView.linearGradient_classic;
            } else {
                n12 = 0;
                object = null;
            }
            canvas2.setShader((Shader)object);
            canvas2 = blurredImageView.paintIpad;
            n12 = blurredImageView.color_ipad;
            canvas2.setColor(n12);
            canvas2 = blurredImageView.paintIpad;
            n12 = 190;
            canvas2.setAlpha(n12);
        } else {
            Paint paint = new Paint();
            paint.setAntiAlias(n11 != 0);
            paint.setColor(n);
            float f10 = n2;
            BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.OUTER;
            BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10, blur);
            paint.setMaskFilter((MaskFilter)blurMaskFilter);
            paint.setAlpha(n10);
            if (bl) {
                float f11 = rectF.width();
                f10 = rectF.height();
                f11 = Math.min(f11, f10) * f;
                Path path = new Path();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, f11, f11, direction);
                float f12 = n3;
                float f13 = n4;
                path.offset(f12, f13);
                canvas.drawPath(path, paint);
                path = this.paintIpad;
                canvas.drawRoundRect(rectF, f11, f11, (Paint)path);
            } else {
                blurMaskFilter = new Path();
                Path.Direction direction = Path.Direction.CW;
                blurMaskFilter.addRect(rectF, direction);
                f10 = n3;
                float f14 = n4;
                blurMaskFilter.offset(f10, f14);
                canvas.drawPath((Path)blurMaskFilter, paint);
                blurMaskFilter = this.paintIpad;
                canvas.drawRect(rectF, (Paint)blurMaskFilter);
            }
        }
    }

    public BismilahEntity getBismilahEntity() {
        return this.bismilahEntity;
    }

    public Bitmap getBitmapBlured() {
        return this.bitmapBlured;
    }

    public Bitmap getBitmapDraw(boolean bl, File file) {
        SurahNameEntity surahNameEntity;
        float f;
        Serializable serializable;
        int n = this.mIpadType;
        Object object = IpadType.BLACK_LAYER;
        int n2 = object.ordinal();
        Bitmap bitmap = n != n2 && (n = this.mIpadType) != (n2 = (object = IpadType.BLUE_TYPE).ordinal()) && (n = this.mIpadType) != (n2 = (object = IpadType.GRADIENT).ordinal()) && (n = this.mIpadType) != (n2 = (object = IpadType.MASK_BRUSH).ordinal()) && (n = this.mIpadType) != (n2 = (object = IpadType.CASSET_IMG).ordinal()) && (n = this.mIpadType) != (n2 = (object = IpadType.IPAD_UNBLUR).ordinal()) ? this.bitmapBlured : this.bitmapNotBlur;
        object = this.getColor_gradient();
        if (object != null) {
            object = this.getColor_gradient();
            this.setColorIpad((Gradient)object);
        }
        object = new Canvas(bitmap);
        int n3 = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_CLASSIC;
        int n4 = ipadType.ordinal();
        if (n3 == n4) {
            serializable = this.getColor_gradient();
            if (serializable != null) {
                serializable = this.paint;
                ipadType = this.linearGradient_classic;
                serializable.setShader((Shader)ipadType);
                serializable = this.paint;
                object.drawPaint((Paint)serializable);
                serializable = this.paint;
                n4 = 0;
                f = 0.0f;
                ipadType = null;
                serializable.setShader(null);
            } else {
                n3 = this.color_bg_type_classic;
                object.drawColor(n3);
            }
        }
        n3 = this.mIpadType;
        ipadType = IpadType.CASSET;
        n4 = ipadType.ordinal();
        int n5 = 0;
        float f2 = 0.0f;
        RectF rectF = null;
        if (n3 == n4) {
            this.drawCaset((Canvas)object, false, file);
        } else {
            n3 = this.mIpadType;
            ipadType = IpadType.CASSET_IMG;
            n4 = ipadType.ordinal();
            if (n3 == n4) {
                this.drawCasetNoBg((Canvas)object, false, file, bl);
            } else {
                n3 = this.mIpadType;
                ipadType = IpadType.CASSET_IMG_BLUR;
                n4 = ipadType.ordinal();
                if (n3 == n4) {
                    serializable = this.bitmapBlured;
                    this.bitmapSquare = serializable;
                    this.drawCasetNoBg((Canvas)object, false, file, bl);
                } else {
                    this.drawIpad((Canvas)object, false, bl);
                }
            }
        }
        bl = this.isPro();
        int n6 = 1;
        if (!bl) {
            this.resetWatermark();
            this.drawWattermark((Canvas)object, n6 != 0);
        }
        if ((surahNameEntity = this.surahNameEntity) != null) {
            float f3 = this.surahNameEntity.getCopyRect().left;
            n4 = object.getWidth();
            f = n4;
            f3 *= f;
            ipadType = this.surahNameEntity.getCopyRect();
            f = ((RectF)ipadType).top;
            n5 = object.getHeight();
            f2 = n5;
            f *= f2;
            rectF = this.surahNameEntity.getCopyRect();
            f2 = rectF.right;
            int n7 = object.getWidth();
            float f4 = n7;
            f2 *= f4;
            RectF rectF2 = this.surahNameEntity.getCopyRect();
            f4 = rectF2.bottom;
            int n8 = object.getHeight();
            float f5 = n8;
            surahNameEntity = new RectF(f3, f, f2, f4 *= f5);
            serializable = this.surahNameEntity;
            ((SurahNameEntity)serializable).setRect((RectF)surahNameEntity);
            surahNameEntity = this.surahNameEntity;
            f3 = surahNameEntity.getFactor_scale();
            surahNameEntity.scale(f3, n6, n6);
            surahNameEntity = this.surahNameEntity;
            surahNameEntity.draw((Canvas)object);
        }
        return bitmap;
    }

    public Bitmap getBitmapNotBlur() {
        return this.bitmapNotBlur;
    }

    public Bitmap getBitmapOriginal() {
        return this.bitmapOriginal;
    }

    public Bitmap getBitmapSquare() {
        return this.bitmapSquare;
    }

    public float getBtmX() {
        return this.btmX;
    }

    public float getBtmY() {
        return this.btmY;
    }

    public int getClr_aya() {
        return this.clr_aya;
    }

    public int getClr_trsl() {
        return this.clr_trsl;
    }

    public Gradient getColor_gradient() {
        return this.color_gradient;
    }

    public int getColor_ipad() {
        return this.color_ipad;
    }

    public EntityView getEntity_select() {
        return this.entity_select;
    }

    public int getH() {
        int n = this.getHeight();
        int n2 = this.getPaddingTop();
        n -= n2;
        n2 = this.getPaddingBottom();
        return n - n2;
    }

    public RectF getIpad_rect() {
        return this.ipad_rect;
    }

    public float getLeft_square() {
        return this.left_square;
    }

    public Paint getPaintLecture() {
        return this.paintLecture;
    }

    public float getProgress() {
        return this.progress;
    }

    public List getQuranEntities() {
        return this.quranEntities;
    }

    public int getRadius_square() {
        return this.radius_square;
    }

    public RectF getRectFAya() {
        return this.rectFAya;
    }

    public RectF getRectFProgress() {
        return this.rectFProgress;
    }

    public RectF getRectFSurahName() {
        return this.rectFSurahName;
    }

    public Rect getRectSquare() {
        return this.rectSquare;
    }

    public SurahNameEntity getSurahNameEntity() {
        return this.surahNameEntity;
    }

    public float getTop_square() {
        return this.top_square;
    }

    public int getW() {
        int n = this.getWidth();
        int n2 = this.getPaddingStart();
        n -= n2;
        n2 = this.getPaddingEnd();
        return n - n2;
    }

    public int getmCanvas_height() {
        return this.mCanvas_height;
    }

    public int getmCanvas_width() {
        return this.mCanvas_width;
    }

    public float getmDrawingTranslationX() {
        return this.mDrawingTranslationX;
    }

    public float getmDrawingTranslationY() {
        return this.mDrawingTranslationY;
    }

    public int getmIpadType() {
        return this.mIpadType;
    }

    public BismilahEntity getmIsti3adhaEntity() {
        return this.mIsti3adhaEntity;
    }

    public void initCanvasDimension(int n, int n2, int n3) {
        ResizeType resizeType = ResizeType.SOCIAL_STORY;
        int n4 = resizeType.ordinal();
        if (n3 == n4) {
            this.mCanvas_height = n2;
            this.mCanvas_width = n = AspectRatioCalculator.calculateWidth(n2);
        } else {
            resizeType = ResizeType.SQUARE;
            n4 = resizeType.ordinal();
            if (n3 == n4) {
                this.mCanvas_width = n = Math.min(n, n2);
                this.mCanvas_height = n;
            } else {
                this.mCanvas_width = n;
                this.mCanvas_height = n = AspectRatioCalculator.calculateHeight_Youtube(n);
            }
        }
    }

    public boolean isDrawingSquareVideo() {
        return this.isDrawingSquareVideo;
    }

    public boolean isGlass() {
        return this.isGlass;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public boolean isPro() {
        return this.isPro;
    }

    public boolean isRemoveWattermark() {
        return this.isRemoveWattermark;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    protected void onDraw(Canvas var1_1) {
        block107: {
            block108: {
                block109: {
                    super.onDraw((Canvas)var1_1);
                    var2_4 = this.isNotDraw;
                    if (var2_4 != 0) {
                        var3_5 = this.isPlaying();
                        if (var3_5 && (var1_1 = this.iViewCallback) != null) {
                            var1_1.onDrawFinish();
                        }
                        return;
                    }
                    {
                        catch (Throwable var1_2) {
                            break block107;
                        }
                        catch (Exception var1_3) {}
                        {
                            var1_3.printStackTrace();
                            var3_7 = this.isPlaying();
                            if (!var3_7 || (var1_1 = this.iViewCallback) == null) break block108;
                            break block109;
                        }
                    }
                    {
                        var1_1.save();
                        var4_8 = this.mDrawingTranslationX;
                    }
                    {
                        var5_9 = this.mDrawingTranslationY;
                    }
                    {
                        var1_1.translate(var4_8, var5_9);
                        var2_4 = this.mCanvas_width;
                    }
                    {
                        var6_10 = this.mCanvas_height;
                    }
                    {
                        var1_1.clipRect(0, 0, var2_4, var6_10);
                        var2_4 = -16777216;
                        var4_8 = -1.7014118E38f;
                    }
                    {
                        var1_1.drawColor(var2_4);
                        var7_11 = this.bitmapBlured;
                    }
                    {
                        if (var7_11 == null || (var2_4 = (int)var7_11.isRecycled()) != 0) ** GOTO lbl-1000
                    }
                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.GRADIENT;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 == var6_10 || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.MASK_BRUSH).ordinal()) || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.BLACK_LAYER).ordinal()) || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.CASSET_IMG).ordinal())) ** GOTO lbl-1000
                    }
                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.BLUE_TYPE;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 != var6_10) ** GOTO lbl-1000
                    }
                    {
                        var2_4 = (int)this.isVideo;
                        if (var2_4 != 0 || (var7_11 = this.bitmapNotBlur) == null || (var2_4 = (int)var7_11.isRecycled()) != 0) ** GOTO lbl108
                    }
                    {
                        var7_11 = this.bitmapNotBlur;
                    }
                    {
                        var5_9 = this.btmX;
                    }
                    {
                        var9_13 = this.btmY;
                    }
                    {
                        var10_18 = this.grayscalePaint;
                    }
                    {
                        var1_1.drawBitmap((Bitmap)var7_11, var5_9, var9_13, var10_18);
                        ** GOTO lbl108
                    }
lbl-1000:
                    // 1 sources

                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.CASSET_IMG_BLUR;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 != var6_10) ** GOTO lbl-1000
                    }
                    {
                        var2_4 = (int)this.isVideo;
                        if (var2_4 != 0) ** GOTO lbl108
                    }
                    {
                        var7_11 = this.bitmapBlured;
                    }
                    {
                        var5_9 = this.btmX;
                    }
                    {
                        var9_14 = this.btmY;
                    }
                    {
                        var10_19 = this.paint;
                    }
                    {
                        var1_1.drawBitmap((Bitmap)var7_11, var5_9, var9_14, var10_19);
                        ** GOTO lbl108
                    }
lbl-1000:
                    // 1 sources

                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.IPAD_CLASSIC;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 != var6_10) ** GOTO lbl-1000
                    }
                    {
                        var7_11 = this.getColor_gradient();
                        if (var7_11 == null) ** GOTO lbl78
                    }
                    {
                        var7_11 = this.paint;
                    }
                    {
                        var8_12 /* !! */  = this.linearGradient_classic;
                    }
                    {
                        var7_11.setShader((Shader)var8_12 /* !! */ );
                        var7_11 = this.paint;
                    }
                    {
                        var1_1.drawPaint((Paint)var7_11);
                        var7_11 = this.paint;
                        var6_10 = 0;
                        var5_9 = 0.0f;
                        var8_12 /* !! */  = null;
                    }
                    {
                        var7_11.setShader(null);
                        ** GOTO lbl108
lbl78:
                        // 1 sources

                        var2_4 = this.color_bg_type_classic;
                    }
                    {
                        var1_1.drawColor(var2_4);
                        ** GOTO lbl108
                    }
lbl-1000:
                    // 1 sources

                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.IPAD_NEOMORPHIC;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 == var6_10 || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.HEART).ordinal()) || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.BATTERY).ordinal()) || (var2_4 = this.mIpadType) == (var6_10 = (var8_12 /* !! */  = IpadType.CASSET).ordinal())) ** GOTO lbl108
                    }
                    {
                        var2_4 = this.mIpadType;
                        var8_12 /* !! */  = IpadType.IPAD_UNBLUR;
                        var6_10 = var8_12 /* !! */ .ordinal();
                        if (var2_4 != var6_10) ** GOTO lbl95
                    }
                    {
                        var7_11 = this.bitmapNotBlur;
                    }
                    {
                        var5_9 = this.btmX;
                    }
                    {
                        var9_15 = this.btmY;
                    }
                    {
                        var10_20 = this.paint;
                    }
                    {
                        var1_1.drawBitmap((Bitmap)var7_11, var5_9, var9_15, var10_20);
                        ** GOTO lbl108
lbl95:
                        // 1 sources

                        var7_11 = this.bitmapBlured;
                    }
                    {
                        var5_9 = this.btmX;
                    }
                    {
                        var9_16 = this.btmY;
                    }
                    {
                        var10_21 = this.paint;
                    }
                    {
                        var1_1.drawBitmap((Bitmap)var7_11, var5_9, var9_16, var10_21);
                        ** GOTO lbl108
                    }
lbl-1000:
                    // 1 sources

                    {
                        var2_4 = (int)this.isVideo;
                        if (var2_4 != 0 || (var7_11 = this.bitmapNotBlur) == null || (var2_4 = (int)var7_11.isRecycled()) != 0) ** GOTO lbl108
                    }
                    {
                        var7_11 = this.bitmapNotBlur;
                    }
                    {
                        var5_9 = this.btmX;
                    }
                    {
                        var9_17 = this.btmY;
                    }
                    {
                        var10_22 = this.paint;
                    }
                    {
                        var1_1.drawBitmap((Bitmap)var7_11, var5_9, var9_17, var10_22);
lbl108:
                        // 11 sources

                        if ((var7_11 = this.bitmapSquare) == null) ** GOTO lbl-1000
                        var2_4 = 1;
                        var4_8 = 1.4E-45f;
                    }
                    {
                        this.drawIpad((Canvas)var1_1, (boolean)var2_4);
                        ** GOTO lbl-1000
                    }
lbl-1000:
                    // 1 sources

                    {
                        this.drawProgress((Canvas)var1_1);
                    }
lbl-1000:
                    // 2 sources

                    {
                        this.drawLineHelper((Canvas)var1_1);
                    }
                    {
                        this.drawBismilah((Canvas)var1_1);
                    }
                    {
                        this.drawEntity((Canvas)var1_1);
                    }
                    {
                        this.drawNameSurah((Canvas)var1_1);
                        var7_11 = this.entity_select;
                    }
                    {
                        if (var7_11 == null || (var8_12 /* !! */  = this.selectTool) == null || (var2_4 = (int)var7_11.isVisible()) == 0) ** GOTO lbl-1000
                    }
                    var7_11 = this.entity_select;
                    var6_10 = var7_11 instanceof SurahNameEntity;
                    if (var6_10 != 0 || (var6_10 = var7_11 instanceof BismilahEntity) != 0) ** GOTO lbl-1000
                    {
                        if ((var7_11 = var7_11.getEntityQuran()) == null) ** GOTO lbl-1000
                    }
                    {
                        var7_11 = this.entity_select;
                    }
                    {
                        var2_4 = (int)(var7_11 = var7_11.getEntityQuran()).visible();
                        if (var2_4 != 0) ** GOTO lbl-1000
                    }
lbl-1000:
                    // 2 sources

                    {
                        var7_11 = this.entity_select;
                    }
                    {
                        if ((var7_11 = var7_11.getEntityTrslTimeline()) == null) ** GOTO lbl-1000
                    }
                    {
                        var7_11 = this.entity_select;
                    }
                    {
                        var2_4 = (int)(var7_11 = var7_11.getEntityTrslTimeline()).visible();
                        if (var2_4 == 0) ** GOTO lbl-1000
                    }
lbl-1000:
                    // 3 sources

                    {
                        var7_11 = this.selectTool;
                    }
                    {
                        var8_12 /* !! */  = this.entity_select;
                    }
                    {
                        var7_11.draw((Canvas)var1_1, (EntityView)var8_12 /* !! */ );
                    }
lbl-1000:
                    // 5 sources

                    {
                        if ((var2_4 = (int)this.isPro()) != 0 || (var2_4 = (int)this.isRemoveWattermark()) != 0) ** GOTO lbl137
                    }
                    {
                        this.drawWattermark((Canvas)var1_1, false);
lbl137:
                        // 2 sources

                        var1_1.restore();
                        var3_6 = this.isPlaying();
                        if (!var3_6 || (var1_1 = this.iViewCallback) == null) break block108;
                    }
                }
                var1_1.onDrawFinish();
            }
            return;
        }
        var2_4 = this.isPlaying();
        if (var2_4 != 0 && (var7_11 = this.iViewCallback) != null) {
            var7_11.onDrawFinish();
        }
        throw var1_2;
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        EntitySelectTool entitySelectTool = this.selectTool;
        if (entitySelectTool == null) {
            Context context = this.getContext();
            this.selectTool = entitySelectTool = new EntitySelectTool(n, context);
        }
    }

    public boolean onTouch(View object, MotionEvent object2) {
        boolean n = false;
        float f = 0.0f;
        object = null;
        if (object2 == null) {
            return false;
        }
        float f2 = object2.getX();
        float f3 = this.getPaddingLeft();
        f2 += f3;
        f3 = this.mDrawingTranslationX;
        f2 -= f3;
        f3 = object2.getY();
        int n2 = this.getPaddingTop();
        float f4 = n2;
        f3 += f4;
        f4 = this.mDrawingTranslationY;
        object2.setLocation(f2, f3 -= f4);
        int n3 = object2.getPointerCount();
        int n4 = 1;
        f3 = Float.MIN_VALUE;
        if (n3 > n4) {
            return this.scaleGestureDetector.onTouchEvent((MotionEvent)object2);
        }
        Object object3 = this.selectTool;
        if (object3 != null && (n3 = (int)(((EntitySelectTool)object3).isOnProgress() ? 1 : 0)) && (n3 = (int)(((EntitySelectTool)(object3 = this.selectTool)).isApply_Scale() ? 1 : 0)) && (object3 = this.entity_select) != null) {
            n3 = object2.getAction();
            n2 = 2;
            f4 = 2.8E-45f;
            if (n3 == n2) {
                f2 = this.prevDistance;
                n2 = 0;
                f4 = 0.0f;
                float f5 = f2 - 0.0f;
                n3 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                if (n3 > 0) {
                    float f6;
                    f = object2.getX();
                    float f7 = object2.getY();
                    f = this.distanceToCenter(f, f7);
                    int n5 = 1065353216;
                    f7 = 1.0f;
                    float f8 = f - f7;
                    n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                    if (n3 < 0) {
                        int n6 = n5;
                        f = f7;
                    }
                    if ((n3 = (int)((f6 = (f2 = this.prevDistance) - f7) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) < 0) {
                        this.prevDistance = f7;
                    }
                    f2 = this.prevDistance;
                    f4 = (f - f2) / f2;
                    n3 = 0x3F000000;
                    f2 = 0.5f;
                    float f9 = f4 - f2;
                    float f10 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                    if (f10 > 0) {
                        n2 = n3;
                        f4 = f2;
                    }
                    n3 = -1090519040;
                    f2 = -0.5f;
                    float f11 = f4 - f2;
                    f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (f10 < 0) {
                        n2 = n3;
                        f4 = f2;
                    }
                    object2 = this.entity_select;
                    n3 = this.getmCanvas_width();
                    f10 = this.getmCanvas_height();
                    ((EntityView)object2).scale(f4 += f7, n3, (int)f10);
                    this.invalidate();
                    this.prevDistance = f;
                    return n4 != 0;
                }
            }
            if ((n3 = object2.getAction()) == n4) {
                boolean bl;
                boolean bl2;
                float f12;
                int n7 = -1082130432;
                this.prevDistance = f12 = -1.0f;
                object2 = this.selectTool;
                ((EntitySelectTool)object2).setOnProgress(false);
                object = this.selectTool;
                boolean bl3 = ((EntitySelectTool)object).isApply_Scale();
                if (bl3 && (object = this.iViewCallback) != null && ((n7 = (object = this.entity_select) instanceof QuranEntity) != 0 || (bl2 = object instanceof TranslationQuranEntity)) && !(bl = ((EntitySelectTool)(object = this.selectTool)).isApply_all())) {
                    object = this.selectTool;
                    ((EntitySelectTool)object).setApply_all(n4 != 0);
                    this.invalidate();
                }
                return n4 != 0;
            }
        }
        if ((n3 = object2.getAction()) == n4 && ((n3 = (int)(this.showCenterLineX ? 1 : 0)) || (n3 = (int)(this.showCenterLineY ? 1 : 0)))) {
            this.showCenterLineY = false;
            this.showCenterLineX = false;
            this.invalidate();
        }
        if (!(n3 = (int)(this.isOnScale ? 1 : 0))) {
            object3 = this.moveGestureDetector;
            ((BaseGestureDetector)object3).onTouchEvent((MotionEvent)object2);
        }
        this.isOnScale = false;
        return this.gestureDetector.onTouchEvent((MotionEvent)object2);
    }

    public void reset() {
        boolean bl;
        Bitmap bitmap = this.bitmapBlured;
        if (bitmap != null && !(bl = bitmap.isRecycled())) {
            bitmap = this.bitmapBlured;
            bitmap.recycle();
        }
        if ((bitmap = this.bitmapSquare) != null && !(bl = bitmap.isRecycled())) {
            bitmap = this.bitmapSquare;
            bitmap.recycle();
        }
    }

    public void resetWatermark() {
        float f;
        this.wmAlpha = f = 1.0f;
        this.wmScale = f;
        this.wmTranslateY = 0.0f;
        this.isAnimWatermk = false;
    }

    public void resizeEntity() {
        SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null) {
            int n = this.getmCanvas_width();
            int n2 = this.getmCanvas_height();
            surahNameEntity.setCanvasWH(n, n2);
        }
        this.updateSizeAyaResize();
        this.updateSizeTrslAyaResize();
        this.updateBismilahEntity();
    }

    public void setBitmap(Bitmap bitmap, Bitmap object, int n, int n2, int n3, Rect rect) {
        this.bitmapBlured = bitmap;
        if (object != null) {
            this.bitmapSquare = object;
        }
        this.rectSquare = rect;
        this.mIpadType = n2;
        int n4 = -1;
        if (n != n4) {
            this.setColorIpad(n);
        } else if (object != null) {
            n4 = ColorUtils.getAverageColor(object);
            this.setColorIpad(n4);
        }
        this.mResizetype = n3;
        n4 = this.mIpadType;
        object = IpadType.BOTTOM_RECT;
        int n5 = object.ordinal();
        if (n4 == n5) {
            bitmap = this.paintText;
            object = this.ipad_rect;
            float f = object.width();
            RectF rectF = this.ipad_rect;
            float f2 = rectF.height();
            f = Math.min(f, f2);
            n = 1032805417;
            f2 = 0.07f;
            bitmap.setTextSize(f *= f2);
        } else {
            n4 = this.mIpadType;
            object = IpadType.BORDER;
            n5 = object.ordinal();
            if (n4 == n5) {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                RectF rectF = this.ipad_rect;
                float f3 = rectF.height();
                f = Math.min(f, f3);
                n = 1021128475;
                f3 = 0.027f;
                bitmap.setTextSize(f *= f3);
            } else {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                n = 1025436864;
                float f4 = 0.0388f;
                bitmap.setTextSize(f *= f4);
            }
        }
        this.createRect();
    }

    public void setBitmap(Bitmap bitmap, Bitmap object, Gradient gradient, int n, int n2, Rect rect) {
        this.bitmapBlured = bitmap;
        if (object != null) {
            this.bitmapSquare = object;
        }
        this.rectSquare = rect;
        this.mIpadType = n;
        this.setColorIpad(gradient);
        this.mResizetype = n2;
        int n3 = this.mIpadType;
        object = IpadType.BOTTOM_RECT;
        int n4 = object.ordinal();
        if (n3 == n4) {
            bitmap = this.paintText;
            object = this.ipad_rect;
            float f = object.width();
            gradient = this.ipad_rect;
            float f2 = gradient.height();
            f = Math.min(f, f2);
            f2 = 0.07f;
            bitmap.setTextSize(f *= f2);
        } else {
            n3 = this.mIpadType;
            object = IpadType.BORDER;
            n4 = object.ordinal();
            if (n3 == n4) {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                gradient = this.ipad_rect;
                float f3 = gradient.height();
                f = Math.min(f, f3);
                f3 = 0.027f;
                bitmap.setTextSize(f *= f3);
            } else {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                float f4 = 0.0388f;
                bitmap.setTextSize(f *= f4);
            }
        }
        this.createRect();
    }

    public void setBitmapBlured(Bitmap bitmap) {
        this.bitmapBlured = bitmap;
    }

    public void setBitmapNotBlur(Bitmap bitmap) {
        this.bitmapNotBlur = bitmap;
    }

    public void setBitmapOriginal(Bitmap bitmap) {
        this.bitmapOriginal = bitmap;
    }

    public void setBitmapSquare(Bitmap bitmap) {
        boolean bl;
        if (bitmap != null && !(bl = bitmap.isRecycled())) {
            this.bitmapSquare = bitmap;
        }
    }

    public void setClr_aya(int n) {
        this.clr_aya = n;
    }

    public void setClr_trsl(int n) {
        this.clr_trsl = n;
    }

    public void setColorAya(int n) {
        boolean bl;
        boolean bl2;
        this.setClr_aya(n);
        Object object = this.quranEntities.iterator();
        while (bl2 = object.hasNext()) {
            QuranEntity quranEntity = (QuranEntity)object.next();
            quranEntity.setColor(n);
        }
        object = this.mIsti3adhaEntity;
        if (object != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.mIsti3adhaEntity;
            ((BismilahEntity)object).setColor(n);
        }
        if ((object = this.bismilahEntity) != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.bismilahEntity;
            ((BismilahEntity)object).setColor(n);
        }
        this.invalidate();
    }

    public void setColorIpad(int n) {
        Object object;
        Paint paint = null;
        this.setColor_gradient(null);
        this.paintIpad.setShader(null);
        this.color_ipad = n;
        int n2 = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_CLASSIC;
        int n3 = ipadType.ordinal();
        float f = 0.4f;
        if (n2 == n3) {
            this.color_bg_type_classic = n2 = ColorUtils.lightenColor(n, f);
            paint = this.paintIpad;
            float f2 = 0.2f;
            n3 = ColorUtils.darkenColor(n, f2);
            paint.setColor(n3);
        } else {
            paint = this.paintIpad;
            paint.setColor(n);
        }
        n2 = this.mIpadType;
        ipadType = IpadType.BORDER;
        n3 = ipadType.ordinal();
        if (n2 == n3) {
            this.color_line_bg = n2 = ColorUtils.darkenColor(n, f);
            paint = this.paintLecture;
            paint.setColor(n);
        } else {
            n2 = this.mIpadType;
            ipadType = IpadType.BLUE_TYPE;
            n3 = ipadType.ordinal();
            float f3 = 0.7f;
            if (n2 == n3) {
                paint = this.paintLecture;
                n = ColorUtils.convertToEnergyColor(n);
                paint.setColor(n);
                object = this.paintLecture;
                this.color_line_bg = n = ColorUtils.darkenColor(object.getColor(), f3);
            } else {
                n2 = this.mIpadType;
                ipadType = IpadType.CASSET;
                n3 = ipadType.ordinal();
                int n4 = -1;
                int n5 = -16777216;
                if (n2 != n3 && (n2 = this.mIpadType) != (n3 = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n2 = this.mIpadType) != (n3 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
                    this.color_line_bg = n = ColorUtils.darkenColor(n, f);
                    object = this.paintIpad;
                    n2 = 190;
                    object.setAlpha(n2);
                    object = this.paintIpad;
                    n = ColorUtils.isColorDark(object.getColor()) ? 1 : 0;
                    if (n != 0) {
                        object = this.paintLecture;
                        object.setColor(n4);
                    } else {
                        object = this.paintLecture;
                        object.setColor(n5);
                    }
                } else {
                    object = ColorSchemeGenerator.generateScheme(n);
                    this.scheme = object;
                    n = ColorUtils.isColorDark(object.label) ? 1 : 0;
                    if (n != 0) {
                        object = this.paintLecture;
                        object.setColor(n4);
                    } else {
                        object = this.paintLecture;
                        object.setColor(n5);
                    }
                    object = this.paintLecture;
                    this.color_line_bg = n = ColorUtils.darkenColor(object.getColor(), f3);
                }
            }
        }
        object = this.paintText;
        n2 = this.paintLecture.getColor();
        object.setColor(n2);
    }

    public void setColorIpad(Gradient object) {
        this.setColor_gradient((Gradient)object);
        int n = ((Gradient)object).getColor();
        int n2 = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_CLASSIC;
        int n3 = ipadType.ordinal();
        int n4 = 3;
        float f = 4.2E-45f;
        int n5 = 1053609165;
        float f2 = 0.4f;
        if (n2 == n3) {
            float[] fArray;
            Paint paint = this.paintIpad;
            ipadType = null;
            paint.setShader(null);
            paint = this.ipad_rect;
            float f3 = ((Gradient)object).getAngle();
            int n6 = ColorUtils.lightenColor(((Gradient)object).getColor(), f2);
            int n7 = ColorUtils.lightenColor(((Gradient)object).getSecond(), f2);
            int n8 = ColorUtils.lightenColor(((Gradient)object).getThree(), f2);
            int[] nArray = new int[]{n6, n7, n8};
            float[] fArray2 = fArray = new float[n4];
            fArray[0] = 0.0f;
            fArray2[1] = 0.7f;
            fArray2[2] = 1.0f;
            paint = CreateGradient.createLinearGradientWithAngle((RectF)paint, f3, nArray, fArray);
            this.linearGradient_classic = paint;
            paint = this.paintIpad;
            n3 = ((Gradient)object).getSecond();
            n4 = 1045220557;
            f = 0.2f;
            n3 = ColorUtils.darkenColor(n3, f);
            paint.setColor(n3);
        } else {
            float[] fArray;
            RectF rectF = this.ipad_rect;
            n3 = ((Gradient)object).getAngle();
            float f4 = n3;
            int n9 = ((Gradient)object).getColor();
            int n10 = ((Gradient)object).getSecond();
            int n11 = ((Gradient)object).getThree();
            int[] nArray = new int[]{n9, n10, n11};
            float[] fArray3 = fArray = new float[n4];
            fArray[0] = 0.0f;
            fArray3[1] = 0.7f;
            fArray3[2] = 1.0f;
            rectF = CreateGradient.createLinearGradientWithAngle(rectF, f4, nArray, fArray);
            this.linearGradient_classic = rectF;
            ipadType = this.paintIpad;
            ipadType.setShader((Shader)rectF);
            rectF = this.paintIpad;
            rectF.setColor(n);
        }
        this.color_line_bg = n2 = ColorUtils.darkenColor(n, f2);
        n2 = this.mIpadType;
        ipadType = IpadType.BORDER;
        n3 = ipadType.ordinal();
        if (n2 == n3) {
            object = this.paintLecture;
            object.setColor(n);
        } else {
            n2 = this.mIpadType;
            ipadType = IpadType.BLUE_TYPE;
            n3 = ipadType.ordinal();
            if (n2 == n3) {
                object = this.paintLecture;
                n2 = 0x3F333333;
                float f5 = 0.7f;
                n = ColorUtils.lightenColor(n, f5);
                object.setColor(n);
            } else {
                n2 = this.mIpadType;
                ipadType = IpadType.CASSET;
                n3 = ipadType.ordinal();
                n4 = -1;
                f = 0.0f / 0.0f;
                n5 = -16777216;
                f2 = -1.7014118E38f;
                if (n2 != n3 && (n2 = this.mIpadType) != (n3 = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n2 = this.mIpadType) != (n3 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
                    object = this.paintIpad;
                    n = 190;
                    object.setAlpha(n);
                    object = this.paintIpad;
                    boolean bl = ColorUtils.isColorDark(object.getColor());
                    if (bl) {
                        object = this.paintLecture;
                        object.setColor(n4);
                    } else {
                        object = this.paintLecture;
                        object.setColor(n5);
                    }
                } else {
                    float f6 = ((Gradient)object).getAngle();
                    this.scheme = object = ColorSchemeGenerator.generateScheme(n, f6);
                    boolean bl = ColorUtils.isColorDark(((ColorSchemeGenerator$Scheme)object).label);
                    if (bl) {
                        object = this.paintLecture;
                        object.setColor(n4);
                    } else {
                        object = this.paintLecture;
                        object.setColor(n5);
                    }
                }
            }
        }
        object = this.paintText;
        n = this.paintLecture.getColor();
        object.setColor(n);
    }

    public void setColorTrsl(int n) {
        boolean bl;
        this.setClr_trsl(n);
        Iterator iterator = this.translationEntities.iterator();
        while (bl = iterator.hasNext()) {
            TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)iterator.next();
            translationQuranEntity.setColor(n);
        }
        this.invalidate();
    }

    public void setColor_gradient(Gradient gradient) {
        this.color_gradient = gradient;
    }

    public void setCurrentTime(String charSequence, String string2) {
        this.currentTime = charSequence;
        charSequence = new StringBuilder("-");
        charSequence = ((StringBuilder)charSequence).append(string2).toString();
        this.remainingTime = charSequence;
    }

    public void setDrawingSquareVideo(boolean bl) {
        this.isDrawingSquareVideo = bl;
    }

    public void setEntity_select(EntityView entityView) {
        Object object = this.entity_select;
        if (object != entityView) {
            object = this.selectTool;
            ((EntitySelectTool)object).reset();
        }
        this.entity_select = entityView;
    }

    public void setGlass(boolean bl) {
        this.isGlass = bl;
    }

    public void setIcon(String string2, VectorDrawable vectorDrawable) {
        boolean bl;
        Iterator iterator = this.quranEntities.iterator();
        while (bl = iterator.hasNext()) {
            int n;
            int n2;
            QuranEntity quranEntity = (QuranEntity)iterator.next();
            String string3 = quranEntity.getIcon();
            if (string3 == null || (n2 = (string3 = quranEntity.getIcon()).equals(string2)) != 0 || (n2 = quranEntity.getNumber()) == (n = -1)) continue;
            quranEntity.setVectorDrawable(vectorDrawable);
            quranEntity.setIcon(string2);
            quranEntity.updateIconDraw();
        }
        this.updateSizeAya();
        this.invalidate();
    }

    public void setIpad_rect(RectF rectF) {
        this.ipad_rect = rectF;
    }

    public void setNotDraw(boolean bl) {
        this.isNotDraw = bl;
    }

    public void setPlaying(boolean bl) {
        this.isPlaying = bl;
    }

    public void setPreset(AyaTextPreset ayaTextPreset) {
        boolean bl;
        boolean bl2;
        Object object = this.quranEntities.iterator();
        while (bl2 = object.hasNext()) {
            QuranEntity quranEntity = (QuranEntity)object.next();
            quranEntity.setPreset(ayaTextPreset);
        }
        object = this.mIsti3adhaEntity;
        if (object != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.mIsti3adhaEntity;
            ((BismilahEntity)object).setPreset(ayaTextPreset);
        }
        if ((object = this.bismilahEntity) != null && (bl = ((Entity)(object = ((BismilahEntity)object).getBismilahTimeline())).visible())) {
            object = this.bismilahEntity;
            ((BismilahEntity)object).setPreset(ayaTextPreset);
        }
        this.invalidate();
    }

    public void setPro(boolean bl) {
        this.isPro = bl;
    }

    public void setProgress(float f) {
        this.progress = f;
        this.postInvalidate();
    }

    public void setRadius_square(int n) {
        this.radius_square = n;
    }

    public void setRectSquare(Rect rect) {
        this.rectSquare = rect;
    }

    public void setRemoveWattermark(boolean bl) {
        this.isRemoveWattermark = bl;
    }

    public void setResizetype(int n) {
        this.mResizetype = n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setSurahNameEntity(String var1_1, String var2_2, RectF var3_3, float var4_4, String var5_5, int var6_6, int var7_7, int var8_8, int var9_9, boolean var10_10, int var11_11) {
        var12_12 = this;
        var13_13 = var3_3;
        var14_14 = var8_8;
        if (var2_2 == null) {
            var15_15 = " ";
            var16_16 = var15_15;
        } else {
            var16_16 = var2_2;
        }
        var17_17 = var12_12.mIpadType;
        var18_18 = IpadType.IPAD_NEOMORPHIC;
        var19_19 = var18_18.ordinal();
        if (var17_17 != var19_19 && (var17_17 = var12_12.mIpadType) != (var19_19 = (var18_18 = IpadType.CASSET).ordinal()) && (var17_17 = var12_12.mIpadType) != (var19_19 = (var18_18 = IpadType.CASSET_IMG).ordinal()) && (var17_17 = var12_12.mIpadType) != (var19_19 = (var18_18 = IpadType.CASSET_IMG_BLUR).ordinal())) {
            var17_17 = (int)Utils.isProbablyLArabic(var16_16);
            var19_19 = 1032805417;
            var20_20 = 0.07f;
            var21_21 = 1028443341;
            var22_22 = 0.05f;
            var23_23 = 0x3F000000;
            var24_24 = 0.5f;
            var25_25 = 1014350479;
            var26_26 = 0.015f;
            if (var17_17 == 0) {
                var15_15 = Layout.Alignment.ALIGN_NORMAL;
                var27_27 = SurahNameStyle.ZAGHRAFAT;
                var28_29 = var27_27.ordinal();
                if (var14_14 != var28_29) {
                    var28_29 = var12_12.mIpadType;
                    var29_30 = IpadType.IPAD;
                    var30_32 = var29_30.ordinal();
                    if (var28_29 != var30_32 && (var28_29 = var12_12.mIpadType) != (var30_32 = (var29_30 = IpadType.IPAD_UNBLUR).ordinal()) && (var28_29 = var12_12.mIpadType) != (var30_32 = (var29_30 = IpadType.IPAD_CLASSIC).ordinal())) {
                        var21_21 = var12_12.mIpadType;
                        var31_34 /* !! */  = IpadType.BOTTOM_RECT;
                        var23_23 = var31_34 /* !! */ .ordinal();
                        if (var21_21 == var23_23) {
                            var18_18 = var12_12.ipad_rect;
                            var20_20 = var18_18.width();
lbl37:
                            // 2 sources

                            while (true) {
                                var20_20 *= var26_26;
                                break;
                            }
                        } else {
                            var21_21 = var12_12.mIpadType;
                            var31_34 /* !! */  = IpadType.BLACK_LAYER;
                            var23_23 = var31_34 /* !! */ .ordinal();
                            if (var21_21 != var23_23 && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.BLUE_TYPE).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.GRADIENT).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.MASK_BRUSH).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.HEART).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.BATTERY).ordinal())) {
                                var32_35 /* !! */  = var12_12.ipad_rect;
                                var22_22 = var32_35 /* !! */ .width();
                                var20_20 *= var22_22;
                            } else {
                                var18_18 = var12_12.ipad_rect;
                                var20_20 = var18_18.width();
                                ** continue;
                            }
                        }
                        var32_35 /* !! */  = var12_12.rectFSurahName;
                        var22_22 = var32_35 /* !! */ .width();
                        var31_34 /* !! */  = var12_12.rectFSurahName;
                        var33_36 /* !! */  = var12_12.ipad_rect;
                        var26_26 = var33_36 /* !! */ .left;
                        var31_34 /* !! */ .left = var20_20 += var26_26;
                        var18_18 = var12_12.rectFSurahName;
                        var18_18.right = var24_24 = var18_18.left + var22_22;
                    } else {
                        var18_18 = var12_12.rectFSurahName;
                        var20_20 = var18_18.width();
                        var26_26 = var12_12.ipad_rect.centerX();
                        var27_27 = var12_12.bitmapSquare;
                        var28_29 = var27_27.getWidth();
                        var34_37 = (float)var28_29 * var24_24;
                        var12_12.left_square = var26_26 -= var34_37;
                        var23_23 = var12_12.mIpadType;
                        var33_36 /* !! */  = IpadType.IPAD_CLASSIC;
                        var25_25 = var33_36 /* !! */ .ordinal();
                        if (var23_23 == var25_25) {
                            var32_35 /* !! */  = var12_12.rectFSurahName;
                            var32_35 /* !! */ .left = var24_24 = var12_12.left_square;
                        } else {
                            var31_34 /* !! */  = var12_12.ipad_rect;
                            var24_24 = var31_34 /* !! */ .width() * var22_22;
                            var32_35 /* !! */  = var12_12.rectFSurahName;
                            var26_26 = var12_12.left_square;
                            var32_35 /* !! */ .left = var24_24 += var26_26;
                        }
                        var32_35 /* !! */  = var12_12.rectFSurahName;
                        var32_35 /* !! */ .right = var24_24 = var32_35 /* !! */ .left + var20_20;
                    }
                }
            } else {
                var15_15 = Layout.Alignment.ALIGN_OPPOSITE;
                var27_28 = SurahNameStyle.ZAGHRAFAT;
                var28_29 = var27_28.ordinal();
                if (var14_14 != var28_29) {
                    var28_29 = var12_12.mIpadType;
                    var29_31 = IpadType.IPAD;
                    var30_33 = var29_31.ordinal();
                    if (var28_29 != var30_33 && (var28_29 = var12_12.mIpadType) != (var30_33 = (var29_31 = IpadType.IPAD_UNBLUR).ordinal()) && (var28_29 = var12_12.mIpadType) != (var30_33 = (var29_31 = IpadType.IPAD_CLASSIC).ordinal())) {
                        var21_21 = var12_12.mIpadType;
                        var31_34 /* !! */  = IpadType.BOTTOM_RECT;
                        var23_23 = var31_34 /* !! */ .ordinal();
                        if (var21_21 == var23_23) {
                            var18_18 = var12_12.ipad_rect;
                            var20_20 = var18_18.width();
lbl96:
                            // 2 sources

                            while (true) {
                                var20_20 *= var26_26;
                                break;
                            }
                        } else {
                            var21_21 = var12_12.mIpadType;
                            var31_34 /* !! */  = IpadType.BLACK_LAYER;
                            var23_23 = var31_34 /* !! */ .ordinal();
                            if (var21_21 != var23_23 && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.BLUE_TYPE).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.GRADIENT).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.MASK_BRUSH).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.HEART).ordinal()) && (var21_21 = var12_12.mIpadType) != (var23_23 = (var31_34 /* !! */  = IpadType.BATTERY).ordinal())) {
                                var32_35 /* !! */  = var12_12.ipad_rect;
                                var22_22 = var32_35 /* !! */ .width();
                                var20_20 *= var22_22;
                            } else {
                                var18_18 = var12_12.ipad_rect;
                                var20_20 = var18_18.width();
                                ** continue;
                            }
                        }
                        var32_35 /* !! */  = var12_12.rectFSurahName;
                        var22_22 = var32_35 /* !! */ .width();
                        var31_34 /* !! */  = var12_12.rectFSurahName;
                        var33_36 /* !! */  = var12_12.ipad_rect;
                        var31_34 /* !! */ .right = var26_26 = var33_36 /* !! */ .right - var20_20;
                        var18_18 = var12_12.rectFSurahName;
                        var18_18.left = var24_24 = var18_18.right - var22_22;
                    } else {
                        var18_18 = var12_12.rectFSurahName;
                        var20_20 = var18_18.width();
                        var26_26 = var12_12.ipad_rect.centerX();
                        var27_28 = var12_12.bitmapSquare;
                        var28_29 = var27_28.getWidth();
                        var34_38 = (float)var28_29 * var24_24;
                        var12_12.left_square = var26_26 -= var34_38;
                        var23_23 = var12_12.mIpadType;
                        var33_36 /* !! */  = IpadType.IPAD_CLASSIC;
                        var25_25 = var33_36 /* !! */ .ordinal();
                        if (var23_23 == var25_25) {
                            var32_35 /* !! */  = var12_12.rectFSurahName;
                            var24_24 = var12_12.left_square;
                            var33_36 /* !! */  = var12_12.bitmapSquare;
                            var25_25 = var33_36 /* !! */ .getWidth();
                            var26_26 = var25_25;
                            var32_35 /* !! */ .right = var24_24 += var26_26;
                        } else {
                            var31_34 /* !! */  = var12_12.ipad_rect;
                            var24_24 = var31_34 /* !! */ .width() * var22_22;
                            var32_35 /* !! */  = var12_12.rectFSurahName;
                            var26_26 = var12_12.left_square;
                            var27_28 = var12_12.bitmapSquare;
                            var28_29 = var27_28.getWidth();
                            var34_38 = var28_29;
                            var32_35 /* !! */ .right = var26_26 = var26_26 + var34_38 - var24_24;
                        }
                        var32_35 /* !! */  = var12_12.rectFSurahName;
                        var32_35 /* !! */ .left = var24_24 = var32_35 /* !! */ .right - var20_20;
                    }
                }
            }
        } else {
            var15_15 = Layout.Alignment.ALIGN_CENTER;
        }
        var18_18 = var15_15;
        var15_15 = var12_12.surahNameEntity;
        if (var15_15 == null) {
            var15_15 = this.getContext();
            var31_34 /* !! */  = "fonts/arabic/";
            var32_35 /* !! */  = new StringBuilder(var31_34 /* !! */ );
            var32_35 /* !! */  = var32_35 /* !! */ .append(var5_5).toString();
            var33_36 /* !! */  = UtilsFileLast.loadFontFromAsset((Context)var15_15, (String)var32_35 /* !! */ );
            var15_15 = this.getContext();
            var32_35 /* !! */  = "fonts/surah_name.otf";
            var35_39 = UtilsFileLast.loadFontFromAsset((Context)var15_15, (String)var32_35 /* !! */ );
            if (var6_6 == 0) {
                var15_15 = var12_12.paintLecture;
                var17_17 = var15_15.getColor();
                var21_21 = this.getmIpadType();
                if (var21_21 == (var23_23 = (var31_34 /* !! */  = IpadType.CASSET).ordinal()) || (var21_21 = this.getmIpadType()) == (var23_23 = (var31_34 /* !! */  = IpadType.CASSET_IMG).ordinal()) || (var21_21 = var12_12.mIpadType) == (var23_23 = (var31_34 /* !! */  = IpadType.CASSET_IMG_BLUR).ordinal())) {
                    var15_15 = var12_12.scheme;
                    var17_17 = (int)ColorUtils.isColorDark(var15_15.body);
                    var17_17 = var17_17 != 0 ? -1 : -16777216;
                }
                var28_29 = var17_17;
            } else {
                var28_29 = var6_6;
            }
            if (var13_13 != null) {
                var12_12.rectFSurahName = var13_13;
            }
            var31_34 /* !! */  = var12_12.rectFSurahName;
            var37_41 = var12_12.mIpadType;
            var15_15 = var36_40;
            var32_35 /* !! */  = var1_1;
            var14_14 = var8_8;
            var38_42 = var37_41;
            var37_41 = var9_9;
            var13_13 = var36_40;
            var39_43 = var38_42;
            var38_42 = (int)var10_10;
            var12_12.surahNameEntity = var36_40 = new SurahNameEntity((Layout.Alignment)var18_18, var1_1, var16_16, (RectF)var31_34 /* !! */ , var33_36 /* !! */ , var28_29, var4_4, var5_5, var7_7, var35_39, var8_8, var9_9, var39_43, var10_10, var11_11);
            var17_17 = this.getmCanvas_width();
            var19_19 = this.getmCanvas_height();
            var36_40.setCanvasWH(var17_17, var19_19);
            if (var3_3 != null) {
                var13_13 = var12_12.surahNameEntity;
                var13_13.move();
            }
        } else {
            var15_15.setIndex_surah(var9_9);
            var13_13 = var12_12.surahNameEntity;
            var15_15 = var12_12.rectFSurahName;
            var13_13.setRect((RectF)var15_15);
            var13_13 = var12_12.surahNameEntity;
            var15_15 = var1_1;
            var13_13.setNameAndReader((Layout.Alignment)var18_18, var1_1, var16_16);
        }
    }

    public void setTrslPreset(AyaTextPreset ayaTextPreset) {
        boolean bl;
        Iterator iterator = this.translationEntities.iterator();
        while (bl = iterator.hasNext()) {
            TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)iterator.next();
            translationQuranEntity.setPreset(ayaTextPreset);
        }
        this.invalidate();
    }

    public void setTypeface(Typeface typeface, String string2) {
        Object object = this.entity_select;
        boolean bl = object instanceof QuranEntity;
        if (bl) {
            object = this.quranEntities.iterator();
            while (bl = object.hasNext()) {
                boolean bl2;
                QuranEntity quranEntity = (QuranEntity)object.next();
                String string3 = quranEntity.getNameFont();
                if (string3 == null || (bl2 = (string3 = quranEntity.getNameFont()).equals(string2))) continue;
                quranEntity.setTypeface(typeface, string2);
            }
            this.updateSizeAyaResize();
        } else {
            boolean bl3 = object instanceof TranslationQuranEntity;
            if (bl3) {
                object = this.translationEntities.iterator();
                while (bl = object.hasNext()) {
                    boolean bl4;
                    TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)object.next();
                    String string4 = translationQuranEntity.getNameFont();
                    if (string4 == null || (bl4 = (string4 = translationQuranEntity.getNameFont()).equals(string2))) continue;
                    translationQuranEntity.setTypeface(typeface, string2);
                }
                this.updateSizeTrslAyaResize();
            }
        }
        this.invalidate();
    }

    public void setVideo(boolean bl) {
        this.isVideo = bl;
    }

    public void setiViewCallback(BlurredImageView$IViewCallback blurredImageView$IViewCallback) {
        this.iViewCallback = blurredImageView$IViewCallback;
    }

    public void setmIpadType(int n) {
        this.mIpadType = n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String setupBitmapDraw(Bitmap var1_1, Bitmap var2_2, Template var3_3) {
        block14: {
            block13: {
                var4_4 = this;
                var5_5 = var3_3.getFps();
                var6_6 = 1000 / var5_5;
                this.frameInterval = var7_7 = (long)var6_6;
                var9_8 = var1_1;
                this.bitmapBlured = var1_1;
                var9_8 = var2_2;
                this.bitmapSquare = var2_2;
                var9_8 = this.surahNameEntity;
                if (var9_8 != null) {
                    var9_8.setCopyRect();
                }
                this.createRect();
                var9_8 = new StringBuilder("bg_");
                var10_9 = System.currentTimeMillis();
                var9_8 = var9_8.append(var10_9).append(".png").toString();
                var13_11 = var3_3.getFolder_template();
                var12_10 = new File((String)var13_11);
                var14_12 = var3_3.isVideoSquare();
                var13_11 = var4_4.getBitmapDraw(var14_12, (File)var12_10);
                var15_13 /* !! */  = this.getContext();
                var16_14 = "NotoNaskhArabic.ttf";
                FontUtils.copyFontToInternalStorage(var15_13 /* !! */ , (String)var16_14);
                var15_13 /* !! */  = var4_4.linePaint;
                var17_15 = var15_13 /* !! */ .getStrokeWidth();
                var18_16 = 4.2f;
                var17_15 *= var18_16;
                var19_17 = var3_3.getIpad_type();
                var20_18 /* !! */  = IpadType.BLACK_LAYER;
                var21_19 = var20_18 /* !! */ .ordinal();
                var22_20 = 0.0f;
                if (var19_17 == var21_19 || (var19_17 = var3_3.getIpad_type()) == (var21_19 = (var20_18 /* !! */  = IpadType.BLUE_TYPE).ordinal()) || (var19_17 = var3_3.getIpad_type()) == (var21_19 = (var20_18 /* !! */  = IpadType.GRADIENT).ordinal()) || (var19_17 = var3_3.getIpad_type()) == (var21_19 = (var20_18 /* !! */  = IpadType.MASK_BRUSH).ordinal()) || (var19_17 = var3_3.getIpad_type()) == (var21_19 = (var20_18 /* !! */  = IpadType.HEART).ordinal()) || (var19_17 = var4_4.mIpadType) == (var21_19 = (var20_18 /* !! */  = IpadType.BATTERY).ordinal())) {
                    var23_21 = 0;
                    var15_13 /* !! */  = null;
                    var17_15 = 0.0f;
                }
                var19_17 = var3_3.getIpad_type();
                var20_18 /* !! */  = IpadType.BLUE_TYPE;
                var21_19 = var20_18 /* !! */ .ordinal();
                var24_22 = 0;
                if (var19_17 != var21_19) break block13;
                var4_4.saveProgressBitmapTypeBlue((File)var12_10);
                ** GOTO lbl76
            }
            var19_17 = var3_3.getIpad_type();
            if (var19_17 != (var21_19 = (var20_18 /* !! */  = IpadType.IPAD_NEOMORPHIC).ordinal())) break block14;
            var4_4.saveProgressBitmapTypeIPAD_NEOMORPHIC((File)var12_10, (Bitmap)var13_11);
            ** GOTO lbl76
        }
        var19_17 = var3_3.getIpad_type();
        if (var19_17 == (var21_19 = (var20_18 /* !! */  = IpadType.HEART).ordinal())) {
            var16_14 = var4_4.saveProgressBitmapTypeHeart((File)var12_10, (Bitmap)var13_11);
            var20_18 /* !! */  = (Float)var16_14.first;
            var22_20 = var20_18 /* !! */ .floatValue();
            var16_14 = (Integer)var16_14.second;
            var19_17 = var16_14.intValue();
        } else {
            var19_17 = var4_4.mIpadType;
            var20_18 /* !! */  = IpadType.BATTERY;
            var21_19 = var20_18 /* !! */ .ordinal();
            if (var19_17 == var21_19) {
                var16_14 = var4_4.saveProgressBitmapTypeBattery((File)var12_10, (Bitmap)var13_11);
                var22_20 = ((Float)var16_14.first).floatValue();
                var20_18 /* !! */  = (Point)var16_14.second;
                var24_22 = var20_18 /* !! */ .y;
                var16_14 = (Point)var16_14.second;
                var19_17 = var16_14.x;
lbl66:
                // 2 sources

                while (true) {
                    var25_23 = var24_22;
                    var24_22 = var19_17;
                    var19_17 = var25_23;
                    break;
                }
            } else {
                var19_17 = var4_4.mIpadType;
                var20_18 /* !! */  = IpadType.CASSET;
                var21_19 = var20_18 /* !! */ .ordinal();
                if (var19_17 != var21_19 && (var19_17 = var4_4.mIpadType) != (var21_19 = (var20_18 /* !! */  = IpadType.CASSET_IMG).ordinal()) && (var19_17 = var4_4.mIpadType) != (var21_19 = (var20_18 /* !! */  = IpadType.CASSET_IMG_BLUR).ordinal())) {
                    var4_4.saveProgressBitmap((File)var12_10, var17_15);
lbl76:
                    // 3 sources

                    var19_17 = 0;
                    var16_14 = null;
                    var18_16 = 0.0f;
                } else {
                    var22_20 = var4_4.rectFProgress.left;
                    var24_22 = (int)var4_4.rectFProgress.top;
                    var16_14 = var4_4.rectFProgress;
                    var18_16 = var16_14.right;
                    var19_17 = (int)var18_16;
                    ** continue;
                }
            }
        }
        var21_19 = var13_11.getWidth();
        var26_24 = var13_11.getHeight();
        var4_4.drawEntityBitmap((File)var12_10, var21_19, var26_24);
        var4_4.saveBg((String)var9_8, (Bitmap)var13_11, (File)var12_10);
        var13_11 = var3_3.getmTimeModel();
        var21_19 = 1073574052;
        var27_25 = 1.98f;
        var23_21 = Math.round(var17_15 *= var27_25);
        var20_18 /* !! */  = "white";
        var28_26 = "black";
        var29_27 = 1064682127;
        var30_28 = 0.96f;
        var31_29 = 1069547520;
        var32_30 = 1.5f;
        var33_31 = -1;
        var34_32 = 0.0f / 0.0f;
        if (var13_11 == null) {
            var35_33 /* !! */  = var4_4.rectFProgress;
            var36_35 = var35_33 /* !! */ .width();
            var37_36 = (int)var36_35;
            var31_29 = (int)(var4_4.rectFProgress.height() * var32_30);
            var38_38 = var4_4.paintText;
            var39_39 = var38_38.getTextSize() * var30_28;
            var40_40 = var4_4.paintText;
            var29_27 = var40_40.getColor();
            if (var29_27 != var33_31) {
                var20_18 /* !! */  = var28_26;
            }
            var41_41 = var4_4.txt_y;
            var34_32 = var4_4.newLeft_txt;
            var28_26 = var13_11;
            var29_27 = var37_36;
            var42_42 = var34_32;
            var34_32 = var39_39;
            var35_33 /* !! */  = var20_18 /* !! */ ;
            var39_39 = var41_41;
            var41_41 = var42_42;
            var13_11 = new TimeModel(var37_36, var31_29, var34_32, (String)var20_18 /* !! */ , var39_39, var42_42, var23_21);
        } else {
            var35_34 = var4_4.paintText;
            var37_37 = var35_34.getColor();
            if (var37_37 != var33_31) {
                var20_18 /* !! */  = var28_26;
            }
            var13_11.setColor((String)var20_18 /* !! */ );
            var27_25 = var4_4.newLeft_txt;
            var13_11.setPosXRight(var27_25);
            var27_25 = var4_4.txt_y;
            var13_11.setPosY(var27_25);
            var21_19 = (int)(var4_4.rectFProgress.height() * var32_30);
            var13_11.setHeight_bitmap_progress(var21_19);
            var21_19 = (int)var4_4.rectFProgress.width();
            var13_11.setWidth_bitmap_progress(var21_19);
            var20_18 /* !! */  = var4_4.paintText;
            var27_25 = var20_18 /* !! */ .getTextSize() * var30_28;
            var13_11.setSize(var27_25);
            var13_11.setProgress_offset(var23_21);
        }
        var13_11.setStartShape(var22_20);
        var13_11.setWidthShape(var24_22);
        var13_11.setHeightShape(var19_17);
        var15_13 /* !! */  = var3_3;
        var3_3.setmTimeModel((TimeModel)var13_11);
        var13_11 = new StringBuilder();
        var12_10 = var12_10.getAbsolutePath();
        return var13_11.append((String)var12_10).append("/").append((String)var9_8).toString();
    }

    public Layout.Alignment updateAlignmentSurah(String string2) {
        boolean bl;
        int n = this.mIpadType;
        IpadType ipadType = IpadType.IPAD_NEOMORPHIC;
        int n2 = ipadType.ordinal();
        string2 = n != n2 && (n = this.mIpadType) != (n2 = (ipadType = IpadType.CASSET).ordinal()) && (n = this.mIpadType) != (n2 = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n = this.mIpadType) != (n2 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal()) ? (!(bl = Utils.isProbablyLArabic(string2)) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE) : Layout.Alignment.ALIGN_CENTER;
        return string2;
    }

    public void updateBismilahEntity(int n, int n2) {
        int n3;
        Object object;
        RectF rectF;
        float f;
        float f2;
        RectF rectF2;
        float f3;
        float f4;
        boolean bl;
        Object object2 = this.bismilahEntity;
        int n4 = 1062836634;
        float f5 = 0.85f;
        if (object2 != null && (bl = ((Entity)(object2 = ((BismilahEntity)object2).getBismilahTimeline())).visible())) {
            this.bismilahEntity.setCopyRect();
            f4 = this.bismilahEntity.getCopyRect().left;
            f3 = n;
            f4 *= f3;
            rectF2 = this.bismilahEntity.getCopyRect();
            f2 = rectF2.top;
            f = n2;
            RectF rectF3 = this.bismilahEntity.getCopyRect();
            float f6 = rectF3.right * f3;
            rectF = this.bismilahEntity.getCopyRect();
            f3 = rectF.bottom * f;
            object2 = new RectF(f4, f2 *= f, f6, f3);
            object = this.bismilahEntity;
            f3 = object2.width() * f5;
            int n5 = (int)f3;
            f2 = object2.height() * f5;
            int n6 = (int)f2;
            ((BismilahEntity)object).update((RectF)object2, n5, n6);
            object2 = this.bismilahEntity;
            f4 = ((EntityView)object2).getFactorSize();
            ((BismilahEntity)object2).setupScaleSave(f4, n);
            object2 = this.bismilahEntity;
            n3 = ((BismilahEntity)object2).getmPreset();
            ((BismilahEntity)object2).initPreset(n3);
        }
        if ((object2 = this.mIsti3adhaEntity) != null && (bl = ((Entity)(object2 = ((BismilahEntity)object2).getBismilahTimeline())).visible())) {
            this.mIsti3adhaEntity.setCopyRect();
            object = this.mIsti3adhaEntity.getCopyRect();
            f4 = ((RectF)object).left;
            f3 = n;
            f4 *= f3;
            rectF2 = this.mIsti3adhaEntity.getCopyRect();
            f2 = rectF2.top;
            float f7 = n2;
            RectF rectF4 = this.mIsti3adhaEntity.getCopyRect();
            f = rectF4.right * f3;
            rectF = this.mIsti3adhaEntity.getCopyRect();
            f3 = rectF.bottom * f7;
            object2 = new RectF(f4, f2 *= f7, f, f3);
            BismilahEntity bismilahEntity = this.mIsti3adhaEntity;
            f4 = object2.width() * f5;
            n3 = (int)f4;
            f3 = object2.height() * f5;
            n4 = (int)f3;
            bismilahEntity.update((RectF)object2, n3, n4);
            bismilahEntity = this.mIsti3adhaEntity;
            float f8 = bismilahEntity.getFactorSize();
            bismilahEntity.setupScaleSave(f8, n);
            BismilahEntity bismilahEntity2 = this.mIsti3adhaEntity;
            n2 = bismilahEntity2.getmPreset();
            bismilahEntity2.initPreset(n2);
        }
    }

    public void updateBitmap(Bitmap bitmap, Bitmap object, int n, int n2, int n3, Rect rect) {
        this.bitmapBlured = bitmap;
        if (object != null) {
            this.bitmapSquare = object;
        }
        this.rectSquare = rect;
        this.mIpadType = n2;
        int n4 = -1;
        if (n != n4) {
            this.setColorIpad(n);
        } else if (object != null) {
            n4 = ColorUtils.getAverageColor(object);
            this.setColorIpad(n4);
        }
        this.mResizetype = n3;
        n4 = this.mIpadType;
        object = IpadType.BOTTOM_RECT;
        int n5 = object.ordinal();
        if (n4 == n5) {
            bitmap = this.paintText;
            object = this.ipad_rect;
            float f = object.width();
            RectF rectF = this.ipad_rect;
            float f2 = rectF.height();
            f = Math.min(f, f2);
            n = 1032805417;
            f2 = 0.07f;
            bitmap.setTextSize(f *= f2);
        } else {
            n4 = this.mIpadType;
            object = IpadType.BORDER;
            n5 = object.ordinal();
            if (n4 == n5) {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                RectF rectF = this.ipad_rect;
                float f3 = rectF.height();
                f = Math.min(f, f3);
                n = 1021128475;
                f3 = 0.027f;
                bitmap.setTextSize(f *= f3);
            } else {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                n = 1025436864;
                float f4 = 0.0388f;
                bitmap.setTextSize(f *= f4);
            }
        }
    }

    public void updateBitmap(Bitmap bitmap, Bitmap object, Gradient gradient, int n, int n2, Rect rect) {
        this.bitmapBlured = bitmap;
        if (object != null) {
            this.bitmapSquare = object;
        }
        this.rectSquare = rect;
        this.mIpadType = n;
        this.setColorIpad(gradient);
        this.mResizetype = n2;
        int n3 = this.mIpadType;
        object = IpadType.BOTTOM_RECT;
        int n4 = object.ordinal();
        if (n3 == n4) {
            bitmap = this.paintText;
            object = this.ipad_rect;
            float f = object.width();
            gradient = this.ipad_rect;
            float f2 = gradient.height();
            f = Math.min(f, f2);
            f2 = 0.07f;
            bitmap.setTextSize(f *= f2);
        } else {
            n3 = this.mIpadType;
            object = IpadType.BORDER;
            n4 = object.ordinal();
            if (n3 == n4) {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                gradient = this.ipad_rect;
                float f3 = gradient.height();
                f = Math.min(f, f3);
                f3 = 0.027f;
                bitmap.setTextSize(f *= f3);
            } else {
                bitmap = this.paintText;
                object = this.ipad_rect;
                float f = object.width();
                float f4 = 0.0388f;
                bitmap.setTextSize(f *= f4);
            }
        }
    }

    public void updateIpad() {
        Bitmap bitmap;
        Bitmap bitmap2;
        int n;
        Bitmap bitmap3;
        RectF rectF;
        float f;
        float f2;
        int n2;
        float f3;
        float f4;
        int n3;
        Bitmap bitmap4;
        float f5;
        float f6;
        Bitmap bitmap5;
        int n4 = this.mIpadType;
        Enum enum_ = IpadType.IPAD_CLASSIC;
        int n5 = enum_.ordinal();
        float f7 = 0.56f;
        int n6 = 1061329306;
        float f8 = 0.7601563f;
        float f9 = 0.5f;
        if (n4 == n5) {
            n4 = this.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n5 = enum_.ordinal();
            if (n4 == n5) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.SQUARE).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.IPAD_NEOMORPHIC).ordinal())) {
            n4 = this.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n5 = enum_.ordinal();
            if (n4 == n5) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.SQUARE).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.IPAD).ordinal()) || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.IPAD_UNBLUR).ordinal())) {
            n4 = this.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n5 = enum_.ordinal();
            if (n4 == n5) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.SQUARE).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getHeight();
                f4 = (float)n3 * f9;
                f5 += f4;
                f4 = f6 * f9;
                f5 -= f4;
                f4 = f6 * f7;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = (float)n2 * f9;
                f = f4 * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f8;
                f5 = this.btmY;
                bitmap3 = this.bitmapBlured;
                n6 = bitmap3.getHeight();
                f8 = (float)n6 * f9;
                f5 += f8;
                f8 = f6 * f9;
                f5 -= f8;
                f8 = this.btmX;
                n3 = this.bitmapBlured.getWidth();
                f4 = (float)n3 * f9;
                f3 = (f7 *= f6) * f9;
                bitmap4 = new RectF(f8, f5, f7 += (f8 += (f4 -= f3)), f6 += f5);
                this.ipad_rect = bitmap4;
            }
        }
        n4 = this.mIpadType;
        enum_ = IpadType.BOTTOM_RECT;
        n5 = enum_.ordinal();
        f7 = 0.2f;
        if (n4 == n5) {
            n4 = this.mResizetype;
            enum_ = ResizeType.SOCIAL_STORY;
            n5 = enum_.ordinal();
            n6 = 1063339950;
            f8 = 0.88f;
            if (n4 == n5) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f7;
                f5 = this.btmY;
                f4 = (float)this.bitmapBlured.getHeight() * f8 - f6;
                f5 += f4;
                bitmap4 = this.bitmapBlured;
                n3 = bitmap4.getWidth();
                f4 = n3;
                n = 1061158912;
                f3 = this.btmX;
                n2 = this.bitmapBlured.getWidth();
                f2 = ((float)n2 - (f4 *= 0.75f)) * f9;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += f2), f6 += f5);
            }
            n4 = this.mResizetype;
            enum_ = ResizeType.SQUARE;
            n5 = enum_.ordinal();
            n3 = 0x3F333333;
            f4 = 0.7f;
            n = 1048576000;
            f3 = 0.25f;
            if (n4 == n5) {
                RectF rectF2;
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f3;
                f5 = this.btmY;
                f2 = (float)this.bitmapBlured.getHeight() * f8 - f6;
                f5 += f2;
                rectF = this.bitmapBlured;
                n2 = rectF.getWidth();
                f2 = (float)n2 * f4;
                f = this.btmX;
                int n7 = this.bitmapBlured.getWidth();
                float f10 = ((float)n7 - f2) * f9;
                this.ipad_rect = rectF2 = new RectF(f, f5, f2 += (f += f10), f6 += f5);
            }
            if ((n4 = this.mResizetype) == (n5 = (enum_ = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                bitmap5 = this.bitmapBlured;
                n4 = bitmap5.getHeight();
                f6 = (float)n4 * f3;
                f5 = this.btmY;
                f3 = (float)this.bitmapBlured.getHeight() * f8 - f6;
                f5 += f3;
                bitmap3 = this.bitmapBlured;
                n6 = bitmap3.getWidth();
                f8 = (float)n6 * f4;
                f4 = this.btmX;
                n = this.bitmapBlured.getWidth();
                f3 = ((float)n - f8) * f9;
                bitmap2 = new RectF(f4, f5, f8 += (f4 += f3), f6 += f5);
                this.ipad_rect = bitmap2;
            }
        }
        n4 = this.mIpadType;
        enum_ = IpadType.ROUND_RECT;
        n5 = enum_.ordinal();
        n6 = 0x3EE66666;
        f8 = 0.45f;
        if (n4 == n5) {
            bitmap5 = this.bitmapBlured;
            n4 = bitmap5.getWidth();
            enum_ = this.bitmapBlured;
            n5 = enum_.getHeight();
            n4 = Math.min(n4, n5);
            f6 = (float)n4 * f8;
            f5 = this.btmY;
            bitmap4 = this.bitmapBlured;
            n3 = bitmap4.getHeight();
            f4 = (float)n3 * f9;
            f5 += f4;
            f4 = f6 * f9;
            f5 -= f4;
            f3 = this.btmX;
            n2 = this.bitmapBlured.getWidth();
            f2 = (float)n2 * f9 - f4;
            f4 = (f3 += f2) + f6;
            this.ipad_rect = rectF = new RectF(f3, f5, f4, f6 += f5);
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.CASSET).ordinal()) || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.CASSET_IMG).ordinal()) || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.CASSET_IMG_BLUR).ordinal())) {
            bitmap5 = this.bitmapBlured;
            n4 = bitmap5.getWidth();
            enum_ = this.bitmapBlured;
            n5 = enum_.getHeight();
            n4 = Math.min(n4, n5);
            f6 = n4;
            f5 = this.btmY;
            bitmap4 = this.bitmapBlured;
            f4 = (float)bitmap4.getHeight() * f9;
            f5 += f4;
            f4 = (f8 *= f6) * f9;
            f5 -= f4;
            n3 = 1061997773;
            f4 = this.btmX;
            bitmap2 = this.bitmapBlured;
            n = bitmap2.getWidth();
            f3 = (float)n * f9;
            bitmap = new RectF(f4 += (f3 -= (f9 *= (f6 *= 0.8f))), f5, f6 += f4, f8 += f5);
            this.ipad_rect = bitmap;
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.RECT).ordinal())) {
            bitmap5 = this.bitmapBlured;
            n4 = bitmap5.getWidth();
            enum_ = this.bitmapBlured;
            n5 = enum_.getHeight();
            n4 = Math.min(n4, n5);
            f6 = n4;
            n5 = 0x3EB33333;
            f5 = 0.35f * f6;
            f8 = this.btmY;
            bitmap = this.bitmapBlured;
            f9 = (float)bitmap.getHeight() * 0.3f;
            f8 += f9;
            f6 *= 0.4f;
            f9 = this.btmX;
            n3 = this.bitmapBlured.getWidth();
            f4 = n3;
            n = 1062836634;
            f3 = 0.85f;
            f4 = f4 * f3 - f6;
            bitmap4 = new RectF(f9, f8, f6 += (f9 += f4), f5 += f8);
            this.ipad_rect = bitmap4;
        }
        n4 = this.mIpadType;
        enum_ = IpadType.BLACK_LAYER;
        n5 = enum_.ordinal();
        n6 = 0x40000000;
        f8 = 2.0f;
        if (n4 == n5 || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.BLUE_TYPE).ordinal()) || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.HEART).ordinal()) || (n4 = this.mIpadType) == (n5 = (enum_ = IpadType.BATTERY).ordinal())) {
            f5 = this.btmX;
            f9 = f5 - f8;
            f4 = this.btmY;
            bitmap2 = this.bitmapBlured;
            n = bitmap2.getWidth();
            f3 = n;
            f5 = f5 + f3 + f8;
            f3 = this.btmY;
            rectF = this.bitmapBlured;
            n2 = rectF.getHeight();
            f2 = n2;
            bitmap5 = new RectF(f9, f4, f5, f3 += f2);
            this.ipad_rect = bitmap5;
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.GRADIENT).ordinal())) {
            f6 = this.btmY;
            n5 = this.bitmapBlured.getHeight();
            f5 = n5;
            f6 += f5;
            f9 = this.btmX - f8;
            f4 = this.btmY;
            f3 = (float)this.bitmapBlured.getHeight() * f7;
            f4 += f3;
            f7 = this.btmX;
            bitmap2 = this.bitmapBlured;
            n = bitmap2.getWidth();
            f3 = n;
            f7 = f7 + f3 + f8;
            enum_ = new RectF(f9, f4, f7, f6);
            this.ipad_rect = enum_;
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.MASK_BRUSH).ordinal())) {
            f5 = this.btmX;
            f7 = this.btmY;
            bitmap3 = this.bitmapBlured;
            n6 = bitmap3.getWidth();
            f8 = (float)n6 + f5;
            f9 = this.btmY;
            bitmap4 = this.bitmapBlured;
            n3 = bitmap4.getHeight();
            f4 = n3;
            bitmap5 = new RectF(f5, f7, f8, f9 += f4);
            this.ipad_rect = bitmap5;
        }
        if ((n4 = this.mIpadType) == (n5 = (enum_ = IpadType.BORDER).ordinal())) {
            bitmap5 = this.bitmapBlured;
            n4 = bitmap5.getWidth();
            n5 = this.bitmapBlured.getHeight();
            n4 = Math.min(n4, n5);
            n5 = this.bitmapBlured.getHeight();
            f5 = n5;
            f7 = Common.p_h_border;
            f5 *= f7;
            f7 = this.bitmapBlured.getWidth();
            f8 = Common.p_w_border;
            f7 *= f8;
            f8 = this.btmY + f5;
            f9 = this.btmX;
            f4 = f9 + f7;
            f3 = this.bitmapBlured.getWidth();
            f9 = f9 + f3 - f7;
            f7 = this.btmY;
            bitmap2 = this.bitmapBlured;
            n = bitmap2.getHeight();
            f3 = n;
            f7 = f7 + f3 - f5;
            enum_ = new RectF(f4, f8, f9, f7);
            this.ipad_rect = enum_;
            enum_ = this.paintIpad;
            Paint.Style style2 = Paint.Style.STROKE;
            enum_.setStyle(style2);
            enum_ = this.paintIpad;
            f6 = n4;
            f7 = 0.013f;
            enum_.setStrokeWidth(f6 *= f7);
        } else {
            bitmap5 = this.paintIpad;
            enum_ = Paint.Style.FILL;
            bitmap5.setStyle((Paint.Style)enum_);
        }
    }

    public void updateIpad(Bitmap bitmap, int n, int n2) {
        int n3;
        ResizeType resizeType;
        RectF rectF;
        float f;
        int n4;
        float f2;
        RectF rectF2;
        float f3;
        int n5;
        float f4;
        float f5;
        int n6;
        float f6;
        float f7;
        int n7;
        ResizeType resizeType2;
        this.mResizetype = n2;
        this.bitmapNotBlur = bitmap;
        this.mIpadType = n;
        IpadType ipadType = IpadType.IPAD_CLASSIC;
        n2 = ipadType.ordinal();
        int n8 = 1057971241;
        float f8 = 0.56f;
        int n9 = 1061329306;
        float f9 = 0.7601563f;
        int n10 = 0x3F000000;
        float f10 = 0.5f;
        if (n == n2) {
            n2 = this.mResizetype;
            resizeType2 = ResizeType.SOCIAL_STORY;
            n7 = resizeType2.ordinal();
            if (n2 == n7) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = ((float)n6 - f7) * f10;
                f6 += f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = ((float)n5 - f5) * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += f3), f7 += f6);
            }
            if ((n2 = this.mResizetype) == (n7 = (resizeType2 = ResizeType.SQUARE).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = (float)n6 * f10;
                f6 += f5;
                f5 = f7 * f10;
                f6 -= f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = (float)n5 * f10;
                f2 = f5 * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += (f3 -= f2)), f7 += f6);
            }
            if ((n2 = this.mResizetype) == (n7 = (resizeType2 = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = (float)n6 * f10;
                f6 += f5;
                f5 = f7 * f10;
                f6 -= f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = (float)n5 * f10;
                f2 = f5 * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += (f3 -= f2)), f7 += f6);
            }
        }
        if (n == (n2 = (ipadType = IpadType.IPAD_NEOMORPHIC).ordinal())) {
            n2 = this.mResizetype;
            resizeType2 = ResizeType.SOCIAL_STORY;
            n7 = resizeType2.ordinal();
            if (n2 == n7) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = ((float)n6 - f7) * f10;
                f6 += f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = ((float)n5 - f5) * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += f3), f7 += f6);
            }
            if ((n2 = this.mResizetype) == (n7 = (resizeType2 = ResizeType.SQUARE).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = (float)n6 * f10;
                f6 += f5;
                f5 = f7 * f10;
                f6 -= f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = (float)n5 * f10;
                f2 = f5 * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += (f3 -= f2)), f7 += f6);
            }
            if ((n2 = this.mResizetype) == (n7 = (resizeType2 = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f6 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = (float)n6 * f10;
                f6 += f5;
                f5 = f7 * f10;
                f6 -= f5;
                f5 = f7 * f8;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = (float)n5 * f10;
                f2 = f5 * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f6, f5 += (f4 += (f3 -= f2)), f7 += f6);
            }
        }
        ipadType = IpadType.CASSET;
        n2 = ipadType.ordinal();
        n7 = 0x3EE66666;
        f6 = 0.45f;
        if (n == n2 || n == (n2 = (ipadType = IpadType.CASSET_IMG).ordinal()) || n == (n2 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
            n2 = bitmap.getWidth();
            n6 = bitmap.getHeight();
            n2 = Math.min(n2, n6);
            f7 = n2;
            f5 = f7 * f6;
            f4 = this.btmY;
            f3 = (float)bitmap.getHeight() * f10;
            f4 += f3;
            f3 = f5 * f10;
            f4 -= f3;
            n5 = 1061997773;
            f3 = this.btmX;
            n4 = bitmap.getWidth();
            f2 = (float)n4 * f10;
            f = (f7 *= 0.8f) * f10;
            this.ipad_rect = rectF = new RectF(f3, f4, f7 += (f3 += (f2 -= f)), f5 += f4);
        }
        if (n == (n2 = (ipadType = IpadType.IPAD).ordinal()) || n == (n2 = (ipadType = IpadType.IPAD_UNBLUR).ordinal())) {
            n2 = this.mResizetype;
            resizeType = ResizeType.SOCIAL_STORY;
            n6 = resizeType.ordinal();
            if (n2 == n6) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f5 = this.btmY;
                n3 = bitmap.getHeight();
                f4 = ((float)n3 - f7) * f10;
                f5 += f4;
                f4 = f7 * f8;
                f3 = this.btmX;
                n4 = bitmap.getWidth();
                f2 = ((float)n4 - f4) * f10;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += f2), f7 += f5);
            }
            if ((n2 = this.mResizetype) == (n6 = (resizeType = ResizeType.SQUARE).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f5 = this.btmY;
                n3 = bitmap.getHeight();
                f4 = (float)n3 * f10;
                f5 += f4;
                f4 = f7 * f10;
                f5 -= f4;
                f4 = f7 * f8;
                f3 = this.btmX;
                n4 = bitmap.getWidth();
                f2 = (float)n4 * f10;
                f = f4 * f10;
                this.ipad_rect = rectF = new RectF(f3, f5, f4 += (f3 += (f2 -= f)), f7 += f5);
            }
            if ((n2 = this.mResizetype) == (n6 = (resizeType = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                RectF rectF3;
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f9;
                f9 = this.btmY;
                n6 = bitmap.getHeight();
                f5 = (float)n6 * f10;
                f9 += f5;
                f5 = f7 * f10;
                f9 -= f5;
                f5 = this.btmX;
                n3 = bitmap.getWidth();
                f4 = (float)n3 * f10;
                f3 = (f8 *= f7) * f10;
                this.ipad_rect = rectF3 = new RectF(f5, f9, f8 += (f5 += (f4 -= f3)), f7 += f9);
            }
        }
        ipadType = IpadType.BOTTOM_RECT;
        n2 = ipadType.ordinal();
        n8 = 1045220557;
        f8 = 0.2f;
        if (n == n2) {
            n2 = this.mResizetype;
            ResizeType resizeType3 = ResizeType.SOCIAL_STORY;
            n9 = resizeType3.ordinal();
            n6 = 1063339950;
            f5 = 0.88f;
            if (n2 == n9) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f8;
                f9 = this.btmY;
                f4 = (float)bitmap.getHeight() * f5 - f7;
                f9 += f4;
                n3 = bitmap.getWidth();
                f4 = n3;
                n5 = 1061158912;
                f3 = this.btmX;
                n4 = bitmap.getWidth();
                f2 = ((float)n4 - (f4 *= 0.75f)) * f10;
                this.ipad_rect = rectF = new RectF(f3, f9, f4 += (f3 += f2), f7 += f9);
            }
            n2 = this.mResizetype;
            resizeType3 = ResizeType.SQUARE;
            n9 = resizeType3.ordinal();
            n3 = 0x3F333333;
            f4 = 0.7f;
            n5 = 1048576000;
            f3 = 0.25f;
            if (n2 == n9) {
                RectF rectF4;
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f3;
                f9 = this.btmY;
                f2 = (float)bitmap.getHeight() * f5 - f7;
                f9 += f2;
                n4 = bitmap.getWidth();
                f2 = (float)n4 * f4;
                f = this.btmX;
                int n11 = bitmap.getWidth();
                float f11 = ((float)n11 - f2) * f10;
                this.ipad_rect = rectF4 = new RectF(f, f9, f2 += (f += f11), f7 += f9);
            }
            if ((n2 = this.mResizetype) == (n9 = (resizeType3 = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                n2 = bitmap.getHeight();
                f7 = (float)n2 * f3;
                f9 = this.btmY;
                f3 = (float)bitmap.getHeight() * f5 - f7;
                f9 += f3;
                n6 = bitmap.getWidth();
                f5 = (float)n6 * f4;
                f4 = this.btmX;
                n5 = bitmap.getWidth();
                f3 = ((float)n5 - f5) * f10;
                this.ipad_rect = rectF2 = new RectF(f4, f9, f5 += (f4 += f3), f7 += f9);
            }
        }
        if (n == (n2 = (ipadType = IpadType.ROUND_RECT).ordinal())) {
            n2 = bitmap.getWidth();
            n9 = bitmap.getHeight();
            n2 = Math.min(n2, n9);
            f7 = (float)n2 * f6;
            f9 = this.btmY;
            n7 = bitmap.getHeight();
            f6 = (float)n7 * f10;
            f9 += f6;
            f6 = f7 * f10;
            f5 = this.btmX;
            n3 = bitmap.getWidth();
            f4 = (float)n3 * f10 - f6;
            f10 = (f5 += f4) + f7;
            resizeType2 = new RectF(f5, f9, f10, f7 += (f9 -= f6));
            this.ipad_rect = resizeType2;
        }
        if (n == (n2 = (ipadType = IpadType.RECT).ordinal())) {
            n2 = bitmap.getWidth();
            n9 = bitmap.getHeight();
            n2 = Math.min(n2, n9);
            f7 = n2;
            n9 = 0x3EB33333;
            f9 = 0.35f * f7;
            f10 = this.btmY;
            f6 = (float)bitmap.getHeight() * 0.3f;
            f10 += f6;
            n7 = 1053609165;
            f7 *= 0.4f;
            f6 = this.btmX;
            n6 = bitmap.getWidth();
            f5 = n6;
            n3 = 1062836634;
            f4 = 0.85f;
            f5 = f5 * f4 - f7;
            resizeType = new RectF(f6, f10, f7 += (f6 += f5), f9 += f10);
            this.ipad_rect = resizeType;
        }
        ipadType = IpadType.BLACK_LAYER;
        n2 = ipadType.ordinal();
        n9 = 0x40000000;
        f9 = 2.0f;
        if (n == n2 || n == (n2 = (ipadType = IpadType.BLUE_TYPE).ordinal()) || n == (n2 = (ipadType = IpadType.HEART).ordinal()) || n == (n2 = (ipadType = IpadType.BATTERY).ordinal())) {
            f10 = this.btmX;
            f6 = f10 - f9;
            f5 = this.btmY;
            n3 = bitmap.getWidth();
            f4 = n3;
            f10 = f10 + f4 + f9;
            f4 = this.btmY;
            n5 = bitmap.getHeight();
            f3 = n5;
            ipadType = new RectF(f6, f5, f10, f4 += f3);
            this.ipad_rect = ipadType;
        }
        if (n == (n2 = (ipadType = IpadType.GRADIENT).ordinal())) {
            RectF rectF5;
            f7 = this.btmY;
            n10 = bitmap.getHeight();
            f10 = n10;
            f7 += f10;
            f6 = this.btmX - f9;
            f5 = this.btmY;
            f4 = (float)bitmap.getHeight() * f8;
            f5 += f4;
            f8 = this.btmX;
            n3 = bitmap.getWidth();
            f4 = n3;
            f8 = f8 + f4 + f9;
            this.ipad_rect = rectF5 = new RectF(f6, f5, f8, f7);
        }
        if (n == (n2 = (ipadType = IpadType.MASK_BRUSH).ordinal())) {
            f8 = this.btmX;
            f9 = this.btmY;
            n10 = bitmap.getWidth();
            f10 = (float)n10 + f8;
            f6 = this.btmY;
            n6 = bitmap.getHeight();
            f5 = n6;
            ipadType = new RectF(f8, f9, f10, f6 += f5);
            this.ipad_rect = ipadType;
        }
        if (n == (n2 = (ipadType = IpadType.BORDER).ordinal())) {
            n = bitmap.getWidth();
            n2 = bitmap.getHeight();
            n = Math.min(n, n2);
            f7 = bitmap.getHeight();
            f8 = Common.p_h_border;
            f7 *= f8;
            n8 = bitmap.getWidth();
            f8 = n8;
            f9 = Common.p_w_border;
            f8 *= f9;
            f9 = this.btmY + f7;
            f10 = this.btmX;
            f6 = f10 + f8;
            n6 = bitmap.getWidth();
            f5 = n6;
            f10 = f10 + f5 - f8;
            f8 = this.btmY;
            int n12 = bitmap.getHeight();
            float f12 = n12;
            f8 = f8 + f12 - f7;
            bitmap = new RectF(f6, f9, f10, f8);
            this.ipad_rect = bitmap;
            bitmap = this.paintIpad;
            ipadType = Paint.Style.STROKE;
            bitmap.setStyle((Paint.Style)ipadType);
            bitmap = this.paintIpad;
            float f13 = n;
            n2 = 1012202996;
            f7 = 0.013f;
            bitmap.setStrokeWidth(f13 *= f7);
        } else {
            bitmap = this.paintIpad;
            Paint.Style style2 = Paint.Style.FILL;
            bitmap.setStyle(style2);
        }
    }

    public void updatePosCanvas(int n, int n2, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        int n3 = this.mCanvas_width;
        float f = n - n3;
        float f2 = 2.0f;
        this.mDrawingTranslationX = f /= f2;
        n3 = this.mCanvas_height;
        this.mDrawingTranslationY = f = (float)(n2 - n3) / f2;
        n3 = bitmap.getWidth();
        float f3 = (float)(n - n3) / f2;
        f = this.mDrawingTranslationX;
        this.btmX = f3 -= f;
        n = bitmap.getHeight();
        f3 = (float)(n2 - n) / f2;
        float f4 = this.mDrawingTranslationY;
        this.btmY = f3 -= f4;
    }

    public void updatePosCanvas(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        int n = this.getWidth();
        int n2 = this.getPaddingStart();
        n -= n2;
        n2 = this.getPaddingEnd();
        float f = n - n2;
        n2 = this.getHeight();
        int n3 = this.getPaddingTop();
        n2 -= n3;
        n3 = this.getPaddingBottom();
        float f2 = n2 - n3;
        float f3 = this.mCanvas_width;
        f3 = f - f3;
        float f4 = 2.0f;
        this.mDrawingTranslationX = f3 /= f4;
        f3 = this.mCanvas_height;
        this.mDrawingTranslationY = f3 = (f2 - f3) / f4;
        f3 = bitmap.getWidth();
        f = (f - f3) / f4;
        f3 = this.mDrawingTranslationX;
        this.btmX = f -= f3;
        float f5 = bitmap.getHeight();
        f2 = (f2 - f5) / f4;
        f5 = this.mDrawingTranslationY;
        this.btmY = f2 -= f5;
    }

    /*
     * Unable to fully structure code
     */
    public void updatePosSurahName() {
        var1_1 = this.surahNameEntity;
        if (var1_1 != null) {
            var2_2 = this.mIpadType;
            var3_3 = IpadType.IPAD_NEOMORPHIC;
            var4_4 = var3_3.ordinal();
            if (var2_2 != var4_4 && (var2_2 = this.mIpadType) != (var4_4 = (var3_3 = IpadType.CASSET).ordinal()) && (var2_2 = this.mIpadType) != (var4_4 = (var3_3 = IpadType.CASSET_IMG).ordinal()) && (var2_2 = this.mIpadType) != (var4_4 = (var3_3 = IpadType.CASSET_IMG_BLUR).ordinal())) {
                var1_1 = this.surahNameEntity.getReader();
                var2_2 = (int)Utils.isProbablyLArabic((String)var1_1);
                var4_4 = 1032805417;
                var5_5 = 0.07f;
                var6_6 = 1028443341;
                var7_7 = 0.05f;
                var8_8 = 0x3F000000;
                var9_9 = 0.5f;
                var10_10 = 1014350479;
                var11_11 = 0.015f;
                if (var2_2 == 0) {
                    var2_2 = this.mIpadType;
                    var12_12 = IpadType.IPAD;
                    var13_14 = var12_12.ordinal();
                    if (var2_2 != var13_14 && (var2_2 = this.mIpadType) != (var13_14 = (var12_12 = IpadType.IPAD_UNBLUR).ordinal()) && (var2_2 = this.mIpadType) != (var13_14 = (var12_12 = IpadType.IPAD_CLASSIC).ordinal())) {
                        var2_2 = this.mIpadType;
                        var14_16 = IpadType.BOTTOM_RECT;
                        var6_6 = var14_16.ordinal();
                        if (var2_2 == var6_6) {
                            var1_1 = this.ipad_rect;
                            var15_20 = var1_1.width();
lbl28:
                            // 2 sources

                            while (true) {
                                var15_20 *= var11_11;
                                break;
                            }
                        } else {
                            var2_2 = this.mIpadType;
                            var14_16 = IpadType.BLACK_LAYER;
                            var6_6 = var14_16.ordinal();
                            if (var2_2 != var6_6 && (var2_2 = this.mIpadType) != (var6_6 = (var14_16 = IpadType.BLUE_TYPE).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_16 = IpadType.GRADIENT).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_16 = IpadType.MASK_BRUSH).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_16 = IpadType.HEART).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_16 = IpadType.BATTERY).ordinal())) {
                                var1_1 = this.ipad_rect;
                                var15_20 = var1_1.width() * var5_5;
                            } else {
                                var1_1 = this.ipad_rect;
                                var15_20 = var1_1.width();
                                ** continue;
                            }
                        }
                        var3_3 = this.rectFSurahName;
                        var5_5 = var3_3.width();
                        var14_16 = this.rectFSurahName;
                        var16_24 = this.ipad_rect;
                        var9_9 = var16_24.left;
                        var14_16.left = var15_20 += var9_9;
                        var1_1 = this.rectFSurahName;
                        var1_1.right = var7_7 = var1_1.left + var5_5;
                    } else {
                        var1_1 = this.rectFSurahName;
                        var15_21 = var1_1.width();
                        var3_3 = this.ipad_rect;
                        var5_5 = var3_3.centerX();
                        var17_28 = this.bitmapSquare;
                        var10_10 = var17_28.getWidth();
                        var11_11 = (float)var10_10 * var9_9;
                        this.left_square = var5_5 -= var11_11;
                        var4_4 = this.mIpadType;
                        var16_25 = IpadType.IPAD_CLASSIC;
                        var8_8 = var16_25.ordinal();
                        if (var4_4 == var8_8) {
                            var3_3 = this.rectFSurahName;
                            var3_3.left = var7_7 = this.left_square;
                        } else {
                            var3_3 = this.ipad_rect;
                            var5_5 = var3_3.width() * var7_7;
                            var14_17 = this.rectFSurahName;
                            var9_9 = this.left_square;
                            var14_17.left = var5_5 += var9_9;
                        }
                        var3_3 = this.rectFSurahName;
                        var3_3.right = var7_7 = var3_3.left + var15_21;
                    }
                    var1_1 = this.surahNameEntity;
                    var3_3 = Layout.Alignment.ALIGN_NORMAL;
                    var1_1.setAlignment((Layout.Alignment)var3_3);
                } else {
                    var2_2 = this.mIpadType;
                    var12_13 = IpadType.IPAD;
                    var13_15 = var12_13.ordinal();
                    if (var2_2 != var13_15 && (var2_2 = this.mIpadType) != (var13_15 = (var12_13 = IpadType.IPAD_UNBLUR).ordinal()) && (var2_2 = this.mIpadType) != (var13_15 = (var12_13 = IpadType.IPAD_CLASSIC).ordinal())) {
                        var2_2 = this.mIpadType;
                        var14_18 = IpadType.BOTTOM_RECT;
                        var6_6 = var14_18.ordinal();
                        if (var2_2 == var6_6) {
                            var1_1 = this.ipad_rect;
                            var15_22 = var1_1.width();
lbl86:
                            // 2 sources

                            while (true) {
                                var15_22 *= var11_11;
                                break;
                            }
                        } else {
                            var2_2 = this.mIpadType;
                            var14_18 = IpadType.BLACK_LAYER;
                            var6_6 = var14_18.ordinal();
                            if (var2_2 != var6_6 && (var2_2 = this.mIpadType) != (var6_6 = (var14_18 = IpadType.BLUE_TYPE).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_18 = IpadType.GRADIENT).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_18 = IpadType.MASK_BRUSH).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_18 = IpadType.HEART).ordinal()) && (var2_2 = this.mIpadType) != (var6_6 = (var14_18 = IpadType.BATTERY).ordinal())) {
                                var1_1 = this.ipad_rect;
                                var15_22 = var1_1.width() * var5_5;
                            } else {
                                var1_1 = this.ipad_rect;
                                var15_22 = var1_1.width();
                                ** continue;
                            }
                        }
                        var3_3 = this.rectFSurahName;
                        var5_5 = var3_3.width();
                        var14_18 = this.rectFSurahName;
                        var16_26 = this.ipad_rect;
                        var14_18.right = var9_9 = var16_26.right - var15_22;
                        var1_1 = this.rectFSurahName;
                        var1_1.left = var7_7 = var1_1.right - var5_5;
                    } else {
                        var1_1 = this.rectFSurahName;
                        var15_23 = var1_1.width();
                        var3_3 = this.ipad_rect;
                        var5_5 = var3_3.centerX();
                        var17_29 = this.bitmapSquare;
                        var10_10 = var17_29.getWidth();
                        var11_11 = (float)var10_10 * var9_9;
                        this.left_square = var5_5 -= var11_11;
                        var4_4 = this.mIpadType;
                        var16_27 = IpadType.IPAD_CLASSIC;
                        var8_8 = var16_27.ordinal();
                        if (var4_4 == var8_8) {
                            var3_3 = this.rectFSurahName;
                            var7_7 = this.left_square;
                            var16_27 = this.bitmapSquare;
                            var8_8 = var16_27.getWidth();
                            var9_9 = var8_8;
                            var3_3.right = var7_7 += var9_9;
                        } else {
                            var3_3 = this.ipad_rect;
                            var5_5 = var3_3.width() * var7_7;
                            var14_19 = this.rectFSurahName;
                            var9_9 = this.left_square;
                            var17_29 = this.bitmapSquare;
                            var10_10 = var17_29.getWidth();
                            var11_11 = var10_10;
                            var14_19.right = var9_9 = var9_9 + var11_11 - var5_5;
                        }
                        var3_3 = this.rectFSurahName;
                        var3_3.left = var7_7 = var3_3.right - var15_23;
                    }
                    var1_1 = this.surahNameEntity;
                    var3_3 = Layout.Alignment.ALIGN_OPPOSITE;
                    var1_1.setAlignment((Layout.Alignment)var3_3);
                }
            } else {
                var1_1 = this.surahNameEntity;
                var3_3 = Layout.Alignment.ALIGN_CENTER;
                var1_1.setAlignment((Layout.Alignment)var3_3);
            }
            var1_1 = this.surahNameEntity;
            var4_4 = this.mIpadType;
            var1_1.setIpad_type(var4_4);
            var1_1 = this.surahNameEntity;
            var4_4 = 1065353216;
            var5_5 = 1.0f;
            var1_1.setFactor_scale(var5_5);
            var1_1 = this.surahNameEntity;
            var3_3 = this.rectFSurahName;
            var1_1.update((RectF)var3_3);
        }
    }

    public void updateSizeAya() {
        int n;
        BlurredImageView blurredImageView = this;
        Object object = this.quranEntities;
        if (object != null && (n = object.isEmpty()) == 0) {
            Object object2;
            float f;
            float f2;
            float f3;
            List list;
            int n2;
            float f4;
            float f5;
            int n3;
            object = this.getLastAdd();
            Object object3 = ((QuranEntity)object).getTranslation();
            if (object3 != null) {
                object3 = object;
            } else {
                n3 = 0;
                f5 = 0.0f;
                object3 = null;
            }
            int n4 = 0;
            float f6 = 0.0f;
            Object object4 = null;
            if (object3 != null) {
                f4 = ((QuranEntity)object).getTranslationWidth();
            } else {
                n2 = 0;
                list = null;
                f4 = 0.0f;
            }
            n4 = (f3 = f4 - 0.0f) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            int n5 = 1;
            float f7 = Float.MIN_VALUE;
            if (n4 != 0) {
                n4 = n5;
                f6 = f7;
            } else {
                n4 = 0;
                f6 = 0.0f;
                object4 = null;
            }
            int n6 = this.countEntityQuran();
            float f8 = 0.5f;
            float f9 = 0.83f;
            float f10 = 0.85f;
            if (n6 == n5) {
                object3 = ((QuranEntity)object).getTxt();
                n3 = ((String)object3).length();
                n2 = 9;
                f4 = 1.3E-44f;
                if (n3 < n2) {
                    f5 = ((QuranEntity)object).calculateTextSize();
                    n2 = 0x3F333333;
                    f4 = 0.7f;
                } else {
                    f5 = ((QuranEntity)object).calculateTextSize();
                    n2 = 0x3F733333;
                    f4 = 0.95f;
                }
                ((QuranEntity)object).setTextSize(f5 *= f4);
                f4 = this.getmCanvas_width();
                ((EntityView)object).setFcSize(f5 /= f4);
                f5 = ((EntityView)object).getFactorSize();
                n2 = this.getmCanvas_width();
                int n7 = this.getmCanvas_height();
                ((QuranEntity)object).setupScale(f5, n2, n7);
                if (n4 != 0) {
                    object3 = ((EntityView)object).getRect();
                    n3 = (int)(object3.width() * f10);
                    object4 = ((EntityView)object).getRect();
                    n4 = (int)(object4.height() * f8 * f9);
                    f5 = ((QuranEntity)object).calculateOptimalTextSize(n3, n4);
                    ((QuranEntity)object).updateTranslation(f5);
                    n4 = this.getmCanvas_width();
                    f6 = n4;
                    ((EntityView)object).setFactorSizeTrl(f5 /= f6);
                }
                n3 = ((QuranEntity)object).getmPreset();
                ((QuranEntity)object).initPreset(n3);
                return;
            }
            float f11 = ((EntityView)object).getFactorSize();
            float f12 = 1.0f;
            n6 = f11 == f12 ? 0 : (f11 > f12 ? 1 : -1);
            int n8 = -1082130432;
            float f13 = -1.0f;
            if (n6 == 0) {
                f11 = ((QuranEntity)object).getWidth();
            } else {
                n6 = n8;
                f11 = f13;
            }
            List list2 = blurredImageView.quranEntities;
            for (int i = list2.size() - n5; i >= 0; i += -1) {
                float f14;
                float f15;
                float f16;
                QuranEntity quranEntity = (QuranEntity)blurredImageView.quranEntities.get(i);
                EntityQuranTimeline entityQuranTimeline = quranEntity.getEntityQuran();
                int n9 = entityQuranTimeline.visible();
                if (n9 == 0 || (f2 = (f16 = (f15 = (entityQuranTimeline = quranEntity.getRect()).width()) - (f = (object2 = blurredImageView.rectFAya).width())) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) != false) continue;
                f = quranEntity.getWidth();
                float f17 = f - f11;
                n9 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                if (n9 > 0 || (n9 = (int)(f11 == f13 ? 0 : (f11 > f13 ? 1 : -1))) == 0) {
                    f11 = f;
                    object = quranEntity;
                }
                if ((object2 = quranEntity.getTranslation()) == null || (f2 = (f14 = (f = quranEntity.getTranslationWidth()) - f4) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) <= 0) continue;
                f4 = f5 = quranEntity.getTranslationWidth();
                n4 = n5;
                f6 = f7;
                object3 = quranEntity;
            }
            float f18 = ((QuranEntity)object).calculateTextSize();
            list = blurredImageView.quranEntities;
            for (n2 = list.size() - n5; n2 >= 0; n2 += -1) {
                RectF rectF;
                float f19;
                object2 = (QuranEntity)blurredImageView.quranEntities.get(n2);
                EntityQuranTimeline entityQuranTimeline = ((EntityView)object2).getEntityQuran();
                n5 = entityQuranTimeline.visible() ? 1 : 0;
                if (n5 == 0 || (n5 = (int)((f19 = (f7 = (entityQuranTimeline = ((EntityView)object2).getRect()).width()) - (f11 = (rectF = blurredImageView.rectFAya).width())) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1))) != 0) continue;
                f7 = ((EntityView)object2).getFactorSize();
                float f20 = f7 - f12;
                n5 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                if (n5 == 0) {
                    n5 = this.getmCanvas_width();
                    f7 = n5;
                    f7 = f18 / f7;
                    ((EntityView)object2).setFcSize(f7);
                }
                f7 = ((EntityView)object2).getFactorSize();
                n6 = this.getmCanvas_width();
                n8 = this.getmCanvas_height();
                ((QuranEntity)object2).setupScale(f7, n6, n8);
                n5 = ((QuranEntity)object2).getmPreset();
                ((QuranEntity)object2).initPresetAya(n5);
            }
            if (n4 != 0) {
                object = ((EntityView)object3).getRect();
                n = (int)(object.width() * f10);
                object4 = ((EntityView)object3).getRect();
                f6 = object4.height() * f8 * f9;
                n4 = (int)f6;
                f18 = ((QuranEntity)object3).calculateOptimalTextSize(n, n4);
                f = 0.0f;
                object2 = null;
                for (f2 = 0.0f; f2 < (n3 = (object3 = blurredImageView.quranEntities).size()); ++f2) {
                    object3 = (QuranEntity)blurredImageView.quranEntities.get((int)f2);
                    object4 = ((EntityView)object3).getEntityQuran();
                    n4 = ((Entity)object4).visible() ? 1 : 0;
                    if (n4 == 0 || (object4 = ((QuranEntity)object3).getTranslation()) == null) continue;
                    ((QuranEntity)object3).updateTranslation(f18);
                    f6 = this.getmCanvas_width();
                    f6 = f18 / f6;
                    ((EntityView)object3).setFactorSizeTrl(f6);
                    n4 = ((QuranEntity)object3).getmPreset();
                    ((QuranEntity)object3).initPresetTrsl(n4);
                }
            }
        }
    }

    public void updateSizeAyaResize() {
        int n;
        BlurredImageView blurredImageView = this;
        Object object = this.quranEntities;
        if (object != null && (n = object.isEmpty()) == 0) {
            Object object2;
            float f;
            int n2;
            float f2;
            float f3;
            object = this.getLastAdd();
            int n3 = this.mIpadType;
            ((QuranEntity)object).setIpad_type(n3);
            n3 = this.getmCanvas_width();
            int n4 = this.getmCanvas_height();
            ((EntityView)object).setCanvasWH(n3, n4);
            n3 = 1065353216;
            float f4 = 1.0f;
            ((EntityView)object).setFactor_scale(f4);
            ((EntityView)object).setFcSize(f4);
            ((EntityView)object).setFactorSizeTrl(f4);
            Object object3 = this.rectFAya;
            float f5 = object3.width();
            float f6 = 0.85f;
            int n5 = (int)(f5 *= f6);
            Object object4 = this.rectFAya;
            float f7 = object4.height() * f6;
            int n6 = (int)f7;
            ((QuranEntity)object).update((RectF)object3, n5, n6);
            object3 = ((QuranEntity)object).getTranslation();
            if (object3 != null) {
                object3 = object;
            } else {
                n4 = 0;
                f3 = 0.0f;
                object3 = null;
            }
            n5 = 0;
            f5 = 0.0f;
            if (object3 != null) {
                f7 = ((QuranEntity)object).getTranslationWidth();
            } else {
                n6 = 0;
                object4 = null;
                f7 = 0.0f;
            }
            n5 = (f2 = f7 - 0.0f) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
            int n7 = 1;
            float f8 = Float.MIN_VALUE;
            if (n5 != 0) {
                n5 = n7;
                f5 = f8;
            } else {
                n5 = 0;
                f5 = 0.0f;
            }
            float f9 = ((QuranEntity)object).getWidth();
            int n8 = this.countEntityQuran();
            float f10 = 0.5f;
            float f11 = 0.83f;
            if (n8 == n7) {
                String string2 = ((QuranEntity)object).getTxt();
                n3 = string2.length();
                n4 = 9;
                f3 = 1.3E-44f;
                if (n3 < n4) {
                    f4 = ((QuranEntity)object).calculateTextSize();
                    n4 = 0x3F333333;
                    f3 = 0.7f;
                } else {
                    f4 = ((QuranEntity)object).calculateTextSize();
                    n4 = 0x3F733333;
                    f3 = 0.95f;
                }
                ((QuranEntity)object).setTextSize(f4 *= f3);
                f3 = this.getmCanvas_width();
                ((EntityView)object).setFcSize(f4 /= f3);
                f4 = ((EntityView)object).getFactorSize();
                n4 = this.getmCanvas_width();
                n6 = this.getmCanvas_height();
                ((QuranEntity)object).setupScale(f4, n4, n6);
                if (n5 != 0) {
                    string2 = ((EntityView)object).getRect();
                    n3 = (int)(string2.width() * f6);
                    object3 = ((EntityView)object).getRect();
                    n4 = (int)(object3.height() * f10 * f11);
                    f4 = ((QuranEntity)object).calculateOptimalTextSize(n3, n4);
                    ((QuranEntity)object).updateTranslation(f4);
                    n4 = this.getmCanvas_width();
                    f3 = n4;
                    ((EntityView)object).setFactorSizeTrl(f4 /= f3);
                }
                n3 = ((QuranEntity)object).getmPreset();
                ((QuranEntity)object).initPreset(n3);
                return;
            }
            List list = blurredImageView.quranEntities;
            for (n8 = list.size() - n7; n8 >= 0; n8 += -1) {
                float f12;
                QuranEntity quranEntity = (QuranEntity)blurredImageView.quranEntities.get(n8);
                EntityQuranTimeline entityQuranTimeline = quranEntity.getEntityQuran();
                int n9 = entityQuranTimeline.visible();
                if (n9 == 0) continue;
                n9 = this.getmCanvas_width();
                int n10 = this.getmCanvas_height();
                quranEntity.setCanvasWH(n9, n10);
                n9 = blurredImageView.mIpadType;
                quranEntity.setIpad_type(n9);
                entityQuranTimeline = blurredImageView.rectFAya;
                n10 = ((QuranEntity)object).getMax_w();
                n2 = ((QuranEntity)object).getMax_h();
                quranEntity.update((RectF)entityQuranTimeline, n10, n2);
                f = quranEntity.getWidth();
                n9 = f == f9 ? 0 : (f > f9 ? 1 : -1);
                if (n9 > 0) {
                    f9 = f;
                    object = quranEntity;
                }
                if ((object2 = quranEntity.getTranslation()) == null || (n2 = (int)((f12 = (f = quranEntity.getTranslationWidth()) - f7) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) <= 0) continue;
                f7 = f3 = quranEntity.getTranslationWidth();
                n5 = n7;
                f5 = f8;
                object3 = quranEntity;
            }
            float f13 = ((QuranEntity)object).calculateTextSize();
            object4 = blurredImageView.quranEntities;
            for (n6 = object4.size() - n7; n6 >= 0; n6 += -1) {
                object2 = (QuranEntity)blurredImageView.quranEntities.get(n6);
                EntityQuranTimeline entityQuranTimeline = ((EntityView)object2).getEntityQuran();
                n7 = entityQuranTimeline.visible() ? 1 : 0;
                if (n7 == 0) continue;
                ((EntityView)object2).setFactor_scale(f4);
                ((EntityView)object2).setFactorSizeTrl(f4);
                f8 = this.getmCanvas_width();
                f8 = f13 / f8;
                ((EntityView)object2).setFcSize(f8);
                f8 = ((EntityView)object2).getFactorSize();
                int n11 = this.getmCanvas_width();
                n8 = this.getmCanvas_height();
                ((QuranEntity)object2).setupScale(f8, n11, n8);
                n7 = ((QuranEntity)object2).getmPreset();
                ((QuranEntity)object2).initPresetAya(n7);
            }
            if (n5 != 0) {
                object = ((EntityView)object3).getRect();
                n = (int)(object.width() * f6);
                Object object5 = ((EntityView)object3).getRect();
                f4 = object5.height() * f10 * f11;
                n3 = (int)f4;
                f13 = ((QuranEntity)object3).calculateOptimalTextSize(n, n3);
                f = 0.0f;
                object2 = null;
                for (n2 = 0; n2 < (n3 = (object5 = blurredImageView.quranEntities).size()); ++n2) {
                    object5 = (QuranEntity)blurredImageView.quranEntities.get(n2);
                    object3 = ((EntityView)object5).getEntityQuran();
                    n4 = ((Entity)object3).visible() ? 1 : 0;
                    if (n4 == 0 || (object3 = ((QuranEntity)object5).getTranslation()) == null) continue;
                    ((QuranEntity)object5).updateTranslation(f13);
                    f3 = this.getmCanvas_width();
                    f3 = f13 / f3;
                    ((EntityView)object5).setFactorSizeTrl(f3);
                    n4 = ((QuranEntity)object5).getmPreset();
                    ((QuranEntity)object5).initPresetTrsl(n4);
                }
            }
        }
    }

    public void updateSizeAyaSave(int n, int n2) {
        int n3;
        List list = this.quranEntities;
        if (list != null && (n3 = list.isEmpty()) == 0) {
            list = this.quranEntities;
            for (n3 = list.size() + -1; n3 >= 0; n3 += -1) {
                QuranEntity quranEntity = (QuranEntity)this.quranEntities.get(n3);
                EntityQuranTimeline entityQuranTimeline = quranEntity.getEntityQuran();
                int n4 = entityQuranTimeline.visible();
                if (n4 == 0) continue;
                n4 = this.mIpadType;
                quranEntity.setIpad_type(n4);
                quranEntity.setCopyRect();
                RectF rectF = quranEntity.getCopyRect();
                float f = rectF.left;
                float f2 = n;
                f *= f2;
                RectF rectF2 = quranEntity.getCopyRect();
                float f3 = rectF2.top;
                float f4 = n2;
                RectF rectF3 = quranEntity.getCopyRect();
                float f5 = rectF3.right * f2;
                RectF rectF4 = quranEntity.getCopyRect();
                f2 = rectF4.bottom * f4;
                entityQuranTimeline = new RectF(f, f3 *= f4, f5, f2);
                f = entityQuranTimeline.width();
                f2 = 0.85f;
                int n5 = (int)(f *= f2);
                f3 = entityQuranTimeline.height() * f2;
                int n6 = (int)f3;
                quranEntity.update((RectF)entityQuranTimeline, n5, n6);
                float f6 = quranEntity.getFactorSize();
                quranEntity.setupScaleSave(f6, n);
                n4 = quranEntity.getmPreset();
                quranEntity.initPreset(n4);
            }
        }
    }

    public void updateSizeAyaTrsl() {
        boolean bl;
        Object object = this.translationEntities;
        if (object != null && !(bl = object.isEmpty())) {
            int n;
            object = this.getLastAddTrsl();
            int n2 = this.countEntityTrsl();
            int n3 = 1;
            float f = Float.MIN_VALUE;
            if (n2 == n3) {
                float f2;
                String string2 = ((TranslationQuranEntity)object).getTxt();
                n2 = string2.length();
                n3 = 9;
                f = 1.3E-44f;
                if (n2 < n3) {
                    f2 = ((TranslationQuranEntity)object).calculateTextSize();
                    n3 = 0x3F333333;
                    f = 0.7f;
                } else {
                    f2 = ((TranslationQuranEntity)object).calculateTextSize();
                    n3 = 0x3F733333;
                    f = 0.95f;
                }
                ((TranslationQuranEntity)object).setTextSize(f2 *= f);
                f = this.getmCanvas_width();
                ((EntityView)object).setFcSize(f2 /= f);
                f2 = ((EntityView)object).getFactorSize();
                n3 = this.getmCanvas_width();
                int n4 = this.getmCanvas_height();
                ((TranslationQuranEntity)object).setupScale(f2, n3, n4);
                n2 = ((TranslationQuranEntity)object).getmPreset();
                ((TranslationQuranEntity)object).initPreset(n2);
                return;
            }
            float f3 = ((EntityView)object).getFactorSize();
            int n5 = 1065353216;
            float f4 = 1.0f;
            n2 = f3 == f4 ? 0 : (f3 > f4 ? 1 : -1);
            int n6 = -1082130432;
            float f5 = -1.0f;
            if (n2 == 0) {
                f3 = ((TranslationQuranEntity)object).getWidth();
            } else {
                n2 = n6;
                f3 = f5;
            }
            List list = this.translationEntities;
            for (n = list.size() - n3; n >= 0; n += -1) {
                float f6;
                float f7;
                float f8;
                TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)this.translationEntities.get(n);
                EntityTrslTimeline entityTrslTimeline = translationQuranEntity.getEntityTrslTimeline();
                boolean bl2 = entityTrslTimeline.visible();
                if (!bl2 || (f8 = (f7 = (f6 = translationQuranEntity.getWidth()) - f3) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0 && (f8 = f3 == f5 ? 0 : (f3 > f5 ? 1 : -1)) != false) continue;
                object = translationQuranEntity;
                f3 = f6;
            }
            float f9 = ((TranslationQuranEntity)object).calculateTextSize();
            List list2 = this.translationEntities;
            for (n2 = list2.size() - n3; n2 >= 0; n2 += -1) {
                TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)this.translationEntities.get(n2);
                EntityTrslTimeline entityTrslTimeline = translationQuranEntity.getEntityTrslTimeline();
                n6 = entityTrslTimeline.visible() ? 1 : 0;
                if (n6 == 0) continue;
                f5 = translationQuranEntity.getFactorSize();
                float f10 = f5 - f4;
                n6 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                if (n6 == 0) {
                    n6 = this.getmCanvas_width();
                    f5 = n6;
                    f5 = f9 / f5;
                    translationQuranEntity.setFcSize(f5);
                }
                f5 = translationQuranEntity.getFactorSize();
                n = this.getmCanvas_width();
                int n7 = this.getmCanvas_height();
                translationQuranEntity.setupScale(f5, n, n7);
                n6 = translationQuranEntity.getmPreset();
                translationQuranEntity.initPresetAya(n6);
            }
        }
    }

    public void updateSizeTrslAyaResize() {
        boolean bl;
        Object object = this.translationEntities;
        if (object != null && !(bl = object.isEmpty())) {
            int n;
            object = this.getLastAddTrsl();
            int n2 = this.mIpadType;
            ((TranslationQuranEntity)object).setIpad_type(n2);
            n2 = this.getmCanvas_width();
            int n3 = this.getmCanvas_height();
            ((EntityView)object).setCanvasWH(n2, n3);
            n2 = 1065353216;
            float f = 1.0f;
            ((EntityView)object).setFactor_scale(f);
            ((EntityView)object).setFcSize(f);
            ((EntityView)object).setFactorSizeTrl(f);
            Object object2 = this.rectFAya;
            float f2 = object2.width();
            float f3 = 0.85f;
            int n4 = (int)(f2 *= f3);
            Object object3 = this.rectFAya;
            float f4 = object3.height() * f3;
            int n5 = (int)f4;
            ((TranslationQuranEntity)object).onResize((RectF)object2, n4, n5);
            float f5 = ((TranslationQuranEntity)object).getWidth();
            n4 = this.countEntityTrsl();
            n5 = 1;
            f3 = Float.MIN_VALUE;
            if (n4 == n5) {
                String string2 = ((TranslationQuranEntity)object).getTxt();
                n2 = string2.length();
                n3 = 9;
                f5 = 1.3E-44f;
                if (n2 < n3) {
                    f = ((TranslationQuranEntity)object).calculateTextSize();
                    n3 = 0x3F333333;
                    f5 = 0.7f;
                } else {
                    f = ((TranslationQuranEntity)object).calculateTextSize();
                    n3 = 0x3F733333;
                    f5 = 0.95f;
                }
                ((TranslationQuranEntity)object).setTextSize(f *= f5);
                f5 = this.getmCanvas_width();
                ((EntityView)object).setFcSize(f /= f5);
                f = ((EntityView)object).getFactorSize();
                n3 = this.getmCanvas_width();
                n4 = this.getmCanvas_height();
                ((TranslationQuranEntity)object).setupScale(f, n3, n4);
                n2 = ((TranslationQuranEntity)object).getmPreset();
                ((TranslationQuranEntity)object).initPreset(n2);
                return;
            }
            Object object4 = this.translationEntities;
            for (n4 = object4.size() - n5; n4 >= 0; n4 += -1) {
                object3 = (TranslationQuranEntity)this.translationEntities.get(n4);
                EntityTrslTimeline entityTrslTimeline = ((EntityView)object3).getEntityTrslTimeline();
                n = entityTrslTimeline.visible();
                if (n == 0) continue;
                n = this.getmCanvas_width();
                int n6 = this.getmCanvas_height();
                ((EntityView)object3).setCanvasWH(n, n6);
                n = this.mIpadType;
                ((TranslationQuranEntity)object3).setIpad_type(n);
                entityTrslTimeline = this.rectFAya;
                n6 = ((TranslationQuranEntity)object).getMax_w();
                int n7 = ((TranslationQuranEntity)object).getMax_h();
                ((TranslationQuranEntity)object3).onResize((RectF)entityTrslTimeline, n6, n7);
                float f6 = ((TranslationQuranEntity)object3).getWidth();
                n6 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
                if (n6 <= 0) continue;
                object = object3;
                f5 = f6;
            }
            float f7 = ((TranslationQuranEntity)object).calculateTextSize();
            object2 = this.translationEntities;
            for (n3 = object2.size() - n5; n3 >= 0; n3 += -1) {
                object4 = (TranslationQuranEntity)this.translationEntities.get(n3);
                EntityTrslTimeline entityTrslTimeline = ((EntityView)object4).getEntityTrslTimeline();
                n5 = entityTrslTimeline.visible() ? 1 : 0;
                if (n5 == 0) continue;
                ((EntityView)object4).setFactor_scale(f);
                ((EntityView)object4).setFactorSizeTrl(f);
                f3 = this.getmCanvas_width();
                f3 = f7 / f3;
                ((EntityView)object4).setFcSize(f3);
                f3 = ((EntityView)object4).getFactorSize();
                int n8 = this.getmCanvas_width();
                n = this.getmCanvas_height();
                ((TranslationQuranEntity)object4).setupScale(f3, n8, n);
                n5 = ((TranslationQuranEntity)object4).getmPreset();
                ((TranslationQuranEntity)object4).initPresetAya(n5);
            }
        }
    }

    public void updateSizeTrslSave(int n, int n2) {
        int n3;
        List list = this.translationEntities;
        if (list != null && (n3 = list.isEmpty()) == 0) {
            list = this.translationEntities;
            for (n3 = list.size() + -1; n3 >= 0; n3 += -1) {
                TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)this.translationEntities.get(n3);
                EntityTrslTimeline entityTrslTimeline = translationQuranEntity.getEntityTrslTimeline();
                int n4 = entityTrslTimeline.visible();
                if (n4 == 0) continue;
                n4 = this.mIpadType;
                translationQuranEntity.setIpad_type(n4);
                translationQuranEntity.setCopyRect();
                RectF rectF = translationQuranEntity.getCopyRect();
                float f = rectF.left;
                float f2 = n;
                f *= f2;
                RectF rectF2 = translationQuranEntity.getCopyRect();
                float f3 = rectF2.top;
                float f4 = n2;
                RectF rectF3 = translationQuranEntity.getCopyRect();
                float f5 = rectF3.right * f2;
                RectF rectF4 = translationQuranEntity.getCopyRect();
                f2 = rectF4.bottom * f4;
                entityTrslTimeline = new RectF(f, f3 *= f4, f5, f2);
                f = entityTrslTimeline.width();
                f2 = 0.85f;
                int n5 = (int)(f *= f2);
                f3 = entityTrslTimeline.height() * f2;
                int n6 = (int)f3;
                translationQuranEntity.update((RectF)entityTrslTimeline, n5, n6);
                float f6 = translationQuranEntity.getFactorSize();
                translationQuranEntity.setupScaleSave(f6, n);
                n4 = translationQuranEntity.getmPreset();
                translationQuranEntity.initPreset(n4);
            }
        }
    }
}

