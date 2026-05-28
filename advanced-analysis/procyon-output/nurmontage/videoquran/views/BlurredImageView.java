// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.model.TimeModel;
import hazem.nurmontage.videoquran.Utils.FontUtils;
import hazem.nurmontage.videoquran.model.Template;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import android.text.Layout$Alignment;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.graphics.drawable.VectorDrawable;
import hazem.nurmontage.videoquran.Utils.ColorSchemeGenerator;
import hazem.nurmontage.videoquran.Utils.AspectRatioCalculator;
import hazem.nurmontage.videoquran.Utils.CreateGradient;
import android.graphics.MaskFilter;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import java.util.Iterator;
import android.graphics.Point;
import android.util.Pair;
import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.view.GestureDetector$OnGestureListener;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector$OnMoveGestureListener;
import hazem.nurmontage.videoquran.constant.ResizeType;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import hazem.nurmontage.videoquran.model.Transition;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import java.io.File;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$Style;
import android.graphics.Path$Op;
import android.os.Build$VERSION;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.Canvas;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.model.QuranEntity;
import android.util.AttributeSet;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.constant.IpadType;
import android.content.Context;
import android.view.MotionEvent;
import android.graphics.PointF;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.model.EntitySelectTool;
import hazem.nurmontage.videoquran.Utils.ColorSchemeGenerator$Scheme;
import android.view.ScaleGestureDetector;
import android.graphics.Rect;
import java.util.List;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.view.GestureDetector$SimpleOnGestureListener;
import androidx.core.view.GestureDetectorCompat;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.Gradient;
import android.graphics.Bitmap;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import android.graphics.Paint;
import android.view.View$OnTouchListener;
import android.view.View;

public class BlurredImageView extends View implements View$OnTouchListener
{
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
    private final GestureDetector$SimpleOnGestureListener gestureListener;
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
    
    public BlurredImageView(final Context context) {
        super(context);
        this.mIpadType = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        this.quranEntities = new ArrayList();
        this.translationEntities = new ArrayList();
        this.paint = new Paint(1);
        this.paintClear = new Paint();
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        final float n = 1.0f;
        this.wmAlpha = n;
        this.wmScale = n;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        this.gestureListener = new BlurredImageView$1(this);
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }
    
    public BlurredImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.mIpadType = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        this.quranEntities = new ArrayList();
        this.translationEntities = new ArrayList();
        this.paint = new Paint(1);
        this.paintClear = new Paint();
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        final float n = 1.0f;
        this.wmAlpha = n;
        this.wmScale = n;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        this.gestureListener = new BlurredImageView$1(this);
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }
    
    public BlurredImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mIpadType = IpadType.IPAD.ordinal();
        this.color_ipad = -1;
        this.quranEntities = new ArrayList();
        this.translationEntities = new ArrayList();
        this.paint = new Paint(1);
        this.paintClear = new Paint();
        this.currentTime = "0:00";
        this.remainingTime = "0:15";
        final float n2 = 1.0f;
        this.wmAlpha = n2;
        this.wmScale = n2;
        this.wmTranslateY = 0.0f;
        this.startTime = -1;
        this.gestureListener = new BlurredImageView$1(this);
        this.showCenterLineX = false;
        this.showCenterLineY = false;
        this.prevDistance = -1.0f;
        this.init();
    }
    
    private int countEntityQuran() {
        final int size = this.quranEntities.size();
        final int n = 1;
        if (size == n) {
            return n;
        }
        int i = 0;
        int n2 = 0;
        while (i < this.quranEntities.size()) {
            if (((QuranEntity)this.quranEntities.get(i)).getEntityQuran().visible()) {
                ++n2;
            }
            if (n2 > n) {
                return 2;
            }
            ++i;
        }
        return n2;
    }
    
    private int countEntityTrsl() {
        final int size = this.translationEntities.size();
        final int n = 1;
        if (size == n) {
            return n;
        }
        int i = 0;
        int n2 = 0;
        while (i < this.translationEntities.size()) {
            if (((TranslationQuranEntity)this.translationEntities.get(i)).getEntityTrslTimeline().visible()) {
                ++n2;
            }
            if (n2 > n) {
                return 2;
            }
            ++i;
        }
        return n2;
    }
    
    private float distanceToCenter(final float n, final float n2) {
        return (float)Math.hypot(n - this.entity_select.getRect().centerX(), n2 - this.entity_select.getRect().centerY());
    }
    
    private void drawAya(final Canvas canvas) {
        this.paintLecture.setColor(-256);
        canvas.drawRect(this.rectFAya, this.paintLecture);
    }
    
    private void drawBatteryType(final Canvas canvas, final boolean b, final boolean b2) {
        if (b) {
            final float strokeWidth = this.linePaint.getStrokeWidth();
            final float width = this.rectFProgress.width();
            final float height = this.rectFProgress.height();
            final float centerX = this.rectFProgress.centerX();
            final float centerY = this.rectFProgress.centerY();
            final float min = Math.min(width, height);
            final float n = 0.8f * min;
            final float n2 = 0.45f * min;
            final float n3 = 2.0f;
            final float n4 = n / n3;
            final float n5 = centerX - n4;
            final float n6 = n2 / n3;
            final float n7 = centerY - n6;
            final float n8 = n4 + centerX;
            final float n9 = n6 + centerY;
            final float n10 = 0.07f * n + n8;
            final float n11 = 0.25f * n2;
            final float n12 = centerY - n11;
            final float n13 = n11 + centerY;
            final Path path = new Path();
            final float strokeWidth2 = strokeWidth;
            final RectF rectF = new RectF(n5, n7, n8, n9);
            final float n14 = n9;
            final float n15 = min * 0.05f;
            final float n16 = min;
            path.addRoundRect(rectF, n15, n15, Path$Direction.CW);
            path.addRect(new RectF(n8, n12, n10, n13), Path$Direction.CW);
            final Path path2 = new Path();
            final float n17 = 0.3f;
            final float n18 = n * n17;
            final float n19 = 0.5f;
            final float n20 = n2 * n19;
            final float n21 = n17 * n18;
            final float n22 = centerX - n21;
            final float n23 = n20 * n19;
            path2.moveTo(n22, centerY - n23);
            path2.lineTo(centerX, centerY);
            final float n24 = n18 * 0.2f;
            path2.lineTo(centerX - n24, centerY);
            path2.lineTo(n21 + centerX, n23 + centerY);
            path2.lineTo(centerX, centerY);
            path2.lineTo(centerX + n24, centerY);
            path2.close();
            canvas.save();
            canvas.clipPath(path);
            if (Build$VERSION.SDK_INT >= 26) {
                final Path path3 = new Path();
                path3.op(path, path2, Path$Op.DIFFERENCE);
                canvas.clipPath(path3);
            }
            canvas.drawRect(new RectF(n5, n7, (n10 - n5) * this.progress + n5, n14), this.paintIpad);
            canvas.restore();
            this.paintIpad.setStyle(Paint$Style.STROKE);
            this.paintIpad.setStrokeWidth(0.025f * n16);
            canvas.drawPath(path, this.paintIpad);
            this.paintIpad.setStyle(Paint$Style.FILL);
            this.paintIpad.setStrokeWidth(strokeWidth2);
        }
    }
    
    private void drawBismilah(final Canvas canvas) {
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        if (bismilahEntity != null && bismilahEntity.isVisible() && this.bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.draw(canvas);
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.isVisible() && this.mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.draw(canvas);
        }
    }
    
    private void drawBlackLayer(final Canvas canvas, final boolean b, final boolean b2) {
        this.paintIpad.setAlpha(204);
        if (b2) {
            canvas.drawBitmap(this.bitmapSquare, 0.0f, 0.0f, (Paint)null);
        }
        canvas.drawRect(this.ipad_rect, this.paintIpad);
        this.paintIpad.setAlpha(190);
    }
    
    private void drawBlueType(final Canvas canvas, final boolean b, final boolean b2) {
        final Paint paintIpad = this.paintIpad;
        final int color = -16777216;
        paintIpad.setColor(color);
        if (b2 && b) {
            canvas.drawBitmap(this.bitmapSquare, 0.0f, 0.0f, this.grayscalePaint);
        }
        final float n = Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 1.3f;
        this.paintIpad.setAlpha(240);
        final float n2 = -0.15f * n;
        final Paint paintIpad2 = this.paintIpad;
        final float centerX = this.ipad_rect.centerX();
        final int[] array = { color, -872415232, -1 << -1, 0 };
        final float[] array3;
        final float[] array2 = array3 = new float[4];
        array3[0] = 0.2f;
        array3[1] = 0.5f;
        array3[2] = 0.7f;
        array3[3] = 1.0f;
        paintIpad2.setShader((Shader)new RadialGradient(centerX, n2, n, array, array2, Shader$TileMode.CLAMP));
        final int n3 = 190;
        if (b) {
            canvas.drawCircle(this.ipad_rect.centerX(), n2, n, this.paintIpad);
            this.paintIpad.setShader((Shader)null);
            this.paintIpad.setAlpha(n3);
            final float strokeWidth = this.linePaint.getStrokeWidth();
            this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.18f);
            final float n4 = this.rectFProgress.left + this.rectFProgress.width() * this.progress;
            this.linePaint.setColor(this.color_line_bg);
            canvas.drawLine(this.rectFProgress.left, this.rectFProgress.centerY(), this.rectFProgress.right, this.rectFProgress.centerY(), this.linePaint);
            this.linePaint.setColor(this.paintLecture.getColor());
            final Paint linePaint = this.linePaint;
            linePaint.setStrokeWidth(linePaint.getStrokeWidth() * 0.5f);
            canvas.drawLine(this.rectFProgress.left, this.rectFProgress.centerY(), n4, this.rectFProgress.centerY(), this.linePaint);
            this.linePaint.setStrokeWidth(strokeWidth);
        }
        else {
            canvas.drawBitmap(this.bitmapNotBlur, 0.0f, 0.0f, this.grayscalePaint);
            canvas.drawCircle(this.ipad_rect.centerX(), n2, n, this.paintIpad);
            this.paintIpad.setShader((Shader)null);
            this.paintIpad.setAlpha(n3);
        }
    }
    
    private void drawCaset(final Canvas canvas, final boolean b, final File file) {
        final int screen1 = this.scheme.screen1;
        final int screen2 = this.scheme.screen2;
        final int body = this.scheme.body;
        final int shadow = this.scheme.shadow;
        final int label = this.scheme.label;
        final int accent = this.scheme.accent;
        final Shader shader = this.paintIpad.getShader();
        this.paintIpad.setShader((Shader)null);
        final int width = this.bitmapBlured.getWidth();
        final int height = this.bitmapBlured.getHeight();
        canvas.drawColor(screen1);
        final Path path = new Path();
        final float centerX = this.ipad_rect.centerX();
        final float bottom = this.ipad_rect.bottom;
        final float n = 0.8f;
        path.moveTo(centerX, bottom * n);
        final float n2 = (float)width;
        final float bottom2 = this.ipad_rect.bottom;
        final float n3 = 1.065f;
        path.lineTo(n2, bottom2 * n3);
        final float n4 = (float)height;
        path.lineTo(n2, n4);
        path.lineTo(0.0f, n4);
        path.lineTo(0.0f, this.ipad_rect.bottom * n3);
        path.close();
        this.paintIpad.setColor(screen2);
        canvas.drawPath(path, this.paintIpad);
        final float n5 = this.ipad_rect.height() * 0.07f;
        final float n6 = this.ipad_rect.left - this.ipad_rect.height() * 0.1f;
        final float top = this.ipad_rect.top;
        final float right = this.ipad_rect.right;
        final float n7 = 1.01f;
        final RectF rectF = new RectF(n6, top, right * n7, this.ipad_rect.bottom);
        this.paintIpad.setColor(shadow);
        canvas.drawRoundRect(rectF, n5, n5, this.paintIpad);
        this.paintIpad.setColor(body);
        canvas.drawRoundRect(this.ipad_rect, n5, n5, this.paintIpad);
        final Path path2 = new Path();
        final float n8 = this.ipad_rect.width() * 0.24f;
        final float n9 = this.ipad_rect.height() * 0.14f;
        path2.moveTo(this.ipad_rect.centerX() - n8, this.ipad_rect.top);
        path2.lineTo(this.ipad_rect.centerX() + n8, this.ipad_rect.top);
        final float centerX2 = this.ipad_rect.centerX();
        final float n10 = 0.85f * n8;
        path2.lineTo(centerX2 + n10, this.ipad_rect.top + n9);
        path2.lineTo(this.ipad_rect.centerX() - n10, this.ipad_rect.top + n9);
        path2.close();
        this.paintIpad.setColor(accent);
        canvas.drawPath(path2, this.paintIpad);
        final Path path3 = new Path();
        path3.moveTo(this.ipad_rect.centerX() - n8, this.ipad_rect.bottom);
        path3.lineTo(this.ipad_rect.centerX() + n8, this.ipad_rect.bottom);
        path3.lineTo(this.ipad_rect.centerX() + n10, this.ipad_rect.bottom - n9);
        path3.lineTo(this.ipad_rect.centerX() - n10, this.ipad_rect.bottom - n9);
        path3.close();
        canvas.drawPath(path3, this.paintIpad);
        final float n11 = this.ipad_rect.width() * 0.4f;
        final float n12 = this.ipad_rect.height() * 0.2f;
        final float n13 = this.ipad_rect.top + n12;
        final RectF rectF2 = new RectF(this.ipad_rect.centerX() - n11, n13, this.ipad_rect.centerX() + n11, n12 + n13);
        this.paintIpad.setColor(label);
        canvas.drawRect(rectF2, this.paintIpad);
        final RectF rectF3 = new RectF(this.ipad_rect.centerX() - n11, rectF2.bottom * n7, this.ipad_rect.centerX() + n11, this.ipad_rect.bottom - 1.2f * n9);
        canvas.drawRect(rectF3, this.paintIpad);
        final float n14 = rectF3.height() * 0.26f;
        final float centerY = rectF3.centerY();
        final float centerX3 = rectF3.centerX();
        final float n15 = 2.0f * n14;
        final float a = centerX3 - n15;
        final float n16 = rectF3.centerX() + n15;
        this.paintIpad.setColor(ColorUtils.darkenColor(body, n));
        canvas.drawCircle(a, centerY, n14, this.paintIpad);
        canvas.drawCircle(n16, centerY, n14, this.paintIpad);
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.ic_circle_caset);
        drawable.setTint(screen2);
        final int round = Math.round(a);
        final int n17 = (int)centerY;
        final int n18 = (int)(n14 * 0.75f);
        final int n19 = round - n18;
        final int n20 = n17 - n18;
        final int n21 = round + n18;
        final int n22 = n17 + n18;
        final Rect rect = new Rect(n19, n20, n21, n22);
        Shader shader2;
        float n24;
        float n29;
        if (b) {
            final int n23 = n20;
            if (this.startTime < 0L) {
                this.startTime = System.currentTimeMillis();
            }
            final long currentTimeMillis = System.currentTimeMillis();
            shader2 = shader;
            n24 = n9;
            final float n25 = (float)((currentTimeMillis - this.startTime) / 1000.0f * 90.0);
            canvas.save();
            final float n26 = (float)round;
            final float n27 = (float)n17;
            canvas.rotate(n25, n26, n27);
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
            drawable.draw(canvas);
            canvas.restore();
            final int n28 = (int)n16;
            canvas.save();
            canvas.rotate(-n25, (float)n28, n27);
            drawable.setBounds(n28 - n18, n23, n28 + n18, n22);
            drawable.draw(canvas);
            canvas.restore();
            n29 = 0.5f;
        }
        else {
            shader2 = shader;
            n24 = n9;
            final RectF rectFProgress = this.rectFProgress;
            final float n30 = (float)rect.width();
            n29 = 0.5f;
            rectFProgress.left = a - n30 * n29;
            this.rectFProgress.top = (float)rect.top;
            this.rectFProgress.right = n16 - rect.width() * n29;
            this.saveProgressCassetBitmap(file, rect.width(), rect.height(), drawable);
        }
        final float n31 = n24 * 0.25f;
        final float top2 = this.ipad_rect.top;
        final float n32 = n24 * n29;
        final int n33 = (int)(top2 + n32);
        final float n34 = this.ipad_rect.bottom - n32;
        final float n35 = a * 1.02f;
        final float n36 = n16 * 0.95f;
        this.paintIpad.setColor(-1);
        final float n37 = (float)n33;
        canvas.drawCircle(n35, n37, n31, this.paintIpad);
        canvas.drawCircle(n36, n37, n31, this.paintIpad);
        canvas.drawCircle(n35, n34, n31, this.paintIpad);
        canvas.drawCircle(n36, n34, n31, this.paintIpad);
        this.paintIpad.setShader(shader2);
    }
    
    private void drawCasetNoBg(final Canvas canvas, final boolean b, final File file, final boolean b2) {
        if (b2) {
            canvas.drawBitmap(this.bitmapSquare, 0.0f, 0.0f, (Paint)null);
        }
        final int screen2 = this.scheme.screen2;
        final int body = this.scheme.body;
        final int shadow = this.scheme.shadow;
        final int label = this.scheme.label;
        final int accent = this.scheme.accent;
        final Shader shader = this.paintIpad.getShader();
        this.paintIpad.setShader((Shader)null);
        final float n = this.ipad_rect.height() * 0.07f;
        final float n2 = this.ipad_rect.left - this.ipad_rect.height() * 0.1f;
        final float top = this.ipad_rect.top;
        final float right = this.ipad_rect.right;
        final float n3 = 1.01f;
        final RectF rectF = new RectF(n2, top, right * n3, this.ipad_rect.bottom);
        this.paintIpad.setColor(shadow);
        canvas.drawRoundRect(rectF, n, n, this.paintIpad);
        this.paintIpad.setColor(body);
        canvas.drawRoundRect(this.ipad_rect, n, n, this.paintIpad);
        final Path path = new Path();
        final float n4 = this.ipad_rect.width() * 0.24f;
        final float n5 = this.ipad_rect.height() * 0.14f;
        path.moveTo(this.ipad_rect.centerX() - n4, this.ipad_rect.top);
        path.lineTo(this.ipad_rect.centerX() + n4, this.ipad_rect.top);
        final float centerX = this.ipad_rect.centerX();
        final float n6 = 0.85f * n4;
        path.lineTo(centerX + n6, this.ipad_rect.top + n5);
        path.lineTo(this.ipad_rect.centerX() - n6, this.ipad_rect.top + n5);
        path.close();
        this.paintIpad.setColor(accent);
        canvas.drawPath(path, this.paintIpad);
        final Path path2 = new Path();
        path2.moveTo(this.ipad_rect.centerX() - n4, this.ipad_rect.bottom);
        path2.lineTo(this.ipad_rect.centerX() + n4, this.ipad_rect.bottom);
        path2.lineTo(this.ipad_rect.centerX() + n6, this.ipad_rect.bottom - n5);
        path2.lineTo(this.ipad_rect.centerX() - n6, this.ipad_rect.bottom - n5);
        path2.close();
        canvas.drawPath(path2, this.paintIpad);
        final float n7 = this.ipad_rect.width() * 0.4f;
        final float n8 = this.ipad_rect.height() * 0.2f;
        final float n9 = this.ipad_rect.top + n8;
        final RectF rectF2 = new RectF(this.ipad_rect.centerX() - n7, n9, this.ipad_rect.centerX() + n7, n8 + n9);
        this.paintIpad.setColor(label);
        canvas.drawRect(rectF2, this.paintIpad);
        final RectF rectF3 = new RectF(this.ipad_rect.centerX() - n7, rectF2.bottom * n3, this.ipad_rect.centerX() + n7, this.ipad_rect.bottom - 1.2f * n5);
        canvas.drawRect(rectF3, this.paintIpad);
        final float n10 = rectF3.height() * 0.26f;
        final float centerY = rectF3.centerY();
        final float centerX2 = rectF3.centerX();
        final float n11 = 2.0f * n10;
        final float a = centerX2 - n11;
        final float n12 = rectF3.centerX() + n11;
        this.paintIpad.setColor(ColorUtils.darkenColor(body, 0.8f));
        canvas.drawCircle(a, centerY, n10, this.paintIpad);
        canvas.drawCircle(n12, centerY, n10, this.paintIpad);
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.ic_circle_caset);
        drawable.setTint(screen2);
        final int round = Math.round(a);
        final int n13 = (int)centerY;
        final int n14 = (int)(n10 * 0.75f);
        final int n15 = round - n14;
        final int n16 = n13 - n14;
        final int n17 = round + n14;
        final int n18 = n13 + n14;
        final Rect rect = new Rect(n15, n16, n17, n18);
        float n24;
        if (b) {
            final int n19 = n16;
            if (this.startTime < 0L) {
                this.startTime = System.currentTimeMillis();
            }
            final float n20 = (float)((System.currentTimeMillis() - this.startTime) / 1000.0f * 90.0);
            canvas.save();
            final float n21 = (float)round;
            final float n22 = (float)n13;
            canvas.rotate(n20, n21, n22);
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
            drawable.draw(canvas);
            canvas.restore();
            final int n23 = (int)n12;
            canvas.save();
            canvas.rotate(-n20, (float)n23, n22);
            drawable.setBounds(n23 - n14, n19, n23 + n14, n18);
            drawable.draw(canvas);
            canvas.restore();
            n24 = 0.5f;
        }
        else {
            final RectF rectFProgress = this.rectFProgress;
            final float n25 = (float)rect.width();
            n24 = 0.5f;
            rectFProgress.left = a - n25 * n24;
            this.rectFProgress.top = (float)rect.top;
            this.rectFProgress.right = n12 - rect.width() * n24;
            this.saveProgressCassetBitmap(file, rect.width(), rect.height(), drawable);
        }
        final float n26 = 0.25f * n5;
        final float top2 = this.ipad_rect.top;
        final float n27 = n5 * n24;
        final int n28 = (int)(top2 + n27);
        final float n29 = this.ipad_rect.bottom - n27;
        final float n30 = a * 1.02f;
        final float n31 = n12 * 0.95f;
        this.paintIpad.setColor(-1);
        final float n32 = (float)n28;
        canvas.drawCircle(n30, n32, n26, this.paintIpad);
        canvas.drawCircle(n31, n32, n26, this.paintIpad);
        canvas.drawCircle(n30, n29, n26, this.paintIpad);
        canvas.drawCircle(n31, n29, n26, this.paintIpad);
        this.paintIpad.setShader(shader);
    }
    
    private void drawEntity(final Canvas canvas) {
        int i = 0;
        for (int j = 0; j < this.quranEntities.size(); ++j) {
            final QuranEntity quranEntity = this.quranEntities.get(j);
            if (quranEntity.isVisible()) {
                if (quranEntity.getEntityQuran().visible()) {
                    quranEntity.draw(canvas);
                }
            }
        }
        while (i < this.translationEntities.size()) {
            final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
            if (translationQuranEntity.isVisible()) {
                if (translationQuranEntity.getEntityTrslTimeline().visible()) {
                    translationQuranEntity.draw(canvas);
                }
            }
            ++i;
        }
    }
    
    private void drawEntityBitmap(final File file, int n, int n2) {
        this.updateSizeAyaSave(n, n2);
        this.updateSizeTrslSave(n, n2);
        this.updateBismilahEntity(n, n2);
        int i = 0;
        int n3 = 0;
        int j = 0;
        String s;
        int alpha;
        while (true) {
            final int size = this.quranEntities.size();
            s = ".png";
            alpha = 255;
            if (n3 >= size) {
                break;
            }
            final QuranEntity quranEntity = this.quranEntities.get(n3);
            if (quranEntity.getEntityQuran().visible()) {
                quranEntity.getPaintAya().setAlpha(alpha);
                quranEntity.getPaintTranslationAya().setAlpha(alpha);
                final Transition transition = quranEntity.getEntityQuran().getTransition();
                final float bottom = quranEntity.getCopyRect().bottom;
                final float n4 = (float)n2;
                final float n5 = bottom * n4 - quranEntity.getCopyRect().top * n4;
                final float right = quranEntity.getCopyRect().right;
                final float n6 = (float)n;
                final Bitmap bitmap = Bitmap.createBitmap((int)(right * n6 - quranEntity.getCopyRect().left * n6), (int)n5, Bitmap$Config.ARGB_8888);
                final Canvas canvas = new Canvas(bitmap);
                quranEntity.setupCanvasDraw(canvas);
                quranEntity.singleDraw(canvas);
                quranEntity.getEntityQuran().setFile("quran_" + j + s);
                this.saveBitmap(bitmap, file, quranEntity.getEntityQuran().getFile());
                if (transition != null) {
                    transition.setFromW((float)bitmap.getWidth());
                }
                ++j;
                quranEntity.restoreCanvas(canvas);
            }
            ++n3;
        }
        int k = 0;
        while (i < this.translationEntities.size()) {
            final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
            if (translationQuranEntity.getEntityTrslTimeline().visible()) {
                translationQuranEntity.getPaintAya().setAlpha(alpha);
                final Transition transition2 = translationQuranEntity.getEntityTrslTimeline().getTransition();
                final float bottom2 = translationQuranEntity.getCopyRect().bottom;
                final float n7 = (float)n2;
                final Bitmap bitmap2 = Bitmap.createBitmap((int)(float)n, (int)(bottom2 * n7 - translationQuranEntity.getCopyRect().top * n7), Bitmap$Config.ARGB_8888);
                final Canvas canvas2 = new Canvas(bitmap2);
                translationQuranEntity.setupCanvasDraw(canvas2);
                translationQuranEntity.singleDraw(canvas2);
                translationQuranEntity.getEntityTrslTimeline().setFile("trs_" + k + s);
                this.saveBitmap(bitmap2, file, translationQuranEntity.getEntityTrslTimeline().getFile());
                if (transition2 != null) {
                    transition2.setFromW((float)bitmap2.getWidth());
                }
                ++k;
                translationQuranEntity.restoreCanvas(canvas2);
            }
            ++i;
        }
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        if (bismilahEntity != null && bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.getPaintAya().setAlpha(alpha);
            final Transition transition3 = this.bismilahEntity.getBismilahTimeline().getTransition();
            final float bottom3 = this.bismilahEntity.getCopyRect().bottom;
            final float n8 = (float)n2;
            final float n9 = bottom3 * n8 - this.bismilahEntity.getCopyRect().top * n8;
            final float right2 = this.bismilahEntity.getCopyRect().right;
            final float n10 = (float)n;
            final Bitmap bitmap3 = Bitmap.createBitmap((int)(right2 * n10 - this.bismilahEntity.getCopyRect().left * n10), (int)n9, Bitmap$Config.ARGB_8888);
            final Canvas canvas3 = new Canvas(bitmap3);
            this.bismilahEntity.setupCanvasDraw(canvas3);
            this.bismilahEntity.singleDraw(canvas3);
            this.bismilahEntity.getBismilahTimeline().setFile("bismilah.png");
            this.saveBitmap(bitmap3, file, this.bismilahEntity.getBismilahTimeline().getFile());
            if (transition3 != null) {
                transition3.setFromW((float)bitmap3.getWidth());
            }
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.getPaintAya().setAlpha(alpha);
            final Transition transition4 = this.mIsti3adhaEntity.getBismilahTimeline().getTransition();
            final float bottom4 = this.mIsti3adhaEntity.getCopyRect().bottom;
            final float n11 = (float)n2;
            final float n12 = bottom4 * n11 - this.mIsti3adhaEntity.getCopyRect().top * n11;
            final float right3 = this.mIsti3adhaEntity.getCopyRect().right;
            final float n13 = (float)n;
            n = (int)(right3 * n13 - this.mIsti3adhaEntity.getCopyRect().left * n13);
            n2 = (int)n12;
            final Bitmap bitmap4 = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
            final Canvas canvas4 = new Canvas(bitmap4);
            this.mIsti3adhaEntity.setupCanvasDraw(canvas4);
            this.mIsti3adhaEntity.singleDraw(canvas4);
            this.mIsti3adhaEntity.getBismilahTimeline().setFile("mIstiada.png");
            this.saveBitmap(bitmap4, file, this.mIsti3adhaEntity.getBismilahTimeline().getFile());
            if (transition4 != null) {
                transition4.setFromW((float)bitmap4.getWidth());
            }
        }
    }
    
    private void drawGradientLayer(final Canvas canvas, final boolean b) {
        if (b) {
            canvas.drawBitmap(this.bitmapSquare, 0.0f, 0.0f, (Paint)null);
        }
        this.paintIpad.setAlpha(255);
        if (this.getColor_gradient() != null) {
            final float top = this.ipad_rect.top;
            final float bottom = this.ipad_rect.bottom;
            final int[] array = { 0, this.getColor_gradient().getColor(), this.getColor_gradient().getSecond(), this.getColor_gradient().getThree() };
            final float[] array3;
            final float[] array2 = array3 = new float[4];
            array3[0] = 0.0f;
            array3[1] = 0.87f;
            array3[2] = 0.93f;
            array3[3] = 1.0f;
            this.paintIpad.setShader((Shader)new LinearGradient(0.0f, top, 0.0f, bottom, array, array2, Shader$TileMode.CLAMP));
        }
        else {
            this.paintIpad.setShader((Shader)new LinearGradient(0.0f, this.ipad_rect.top, 0.0f, this.ipad_rect.bottom, new int[] { 0, this.paintIpad.getColor() }, (float[])null, Shader$TileMode.CLAMP));
        }
        canvas.drawRect(this.ipad_rect, this.paintIpad);
        this.paintIpad.setShader((Shader)null);
    }
    
    private void drawHeartType(final Canvas canvas, final boolean b, final boolean b2) {
        if (b) {
            final float strokeWidth = this.linePaint.getStrokeWidth();
            final Path path = new Path();
            final float width = this.rectFProgress.width();
            final float height = this.rectFProgress.height();
            final float centerX = this.rectFProgress.centerX();
            final float centerY = this.rectFProgress.centerY();
            final float n = Math.min(width, height) / 2.0f;
            final float n2 = 0.6f * n + centerY;
            path.moveTo(centerX, n2);
            final float n3 = 1.2f * n;
            final float n4 = centerX + n3;
            final float n5 = 0.1f * n + centerY;
            final float n6 = n * 0.8f;
            final float n7 = centerX + n6;
            final float n8 = centerY - 0.9f * n;
            path.cubicTo(n4, n5, n7, n8, centerX, centerY - 0.4f * n);
            path.cubicTo(centerX - n6, n8, centerX - n3, n5, centerX, n2);
            path.close();
            final RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            canvas.save();
            canvas.clipPath(path);
            final float bottom = rectF.bottom;
            final float n9 = bottom - rectF.height() * 0.78f * this.progress;
            final float left = rectF.left;
            final float right = rectF.right;
            final Paint paintIpad = this.paintIpad;
            final Path path2 = path;
            canvas.drawRect(left, n9, right, bottom, paintIpad);
            canvas.restore();
            this.paintIpad.setStyle(Paint$Style.STROKE);
            this.paintIpad.setStrokeWidth(0.02f * n);
            canvas.drawPath(path2, this.paintIpad);
            this.paintIpad.setStyle(Paint$Style.FILL);
            this.paintIpad.setStrokeWidth(strokeWidth);
        }
    }
    
    private void drawInnerGear(final Canvas canvas, final float n, final float n2, final float n3, final float n4, final int n5, final Paint paint) {
        final Path path = new Path();
        final int n6 = n5 * 2;
        final double n7 = 6.283185307179586 / n6;
        for (int i = 0; i < n6; ++i) {
            final double n8 = i * n7;
            float n9;
            float n10;
            if (i % 2 == 0) {
                n9 = n;
                n10 = n3;
            }
            else {
                n9 = n;
                n10 = n4;
            }
            final double n11 = n9;
            final double n12 = n10;
            final float n13 = (float)(n11 + Math.cos(n8) * n12);
            final float n14 = (float)(n2 + n12 * Math.sin(n8));
            if (i == 0) {
                path.moveTo(n13, n14);
            }
            else {
                path.lineTo(n13, n14);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }
    
    private void drawIpad(final Canvas canvas, final boolean b) {
        if (this.mIpadType == IpadType.IPAD_NEOMORPHIC.ordinal()) {
            this.drawNeumorphicRect(canvas, this.ipad_rect.width() * 0.12f, false);
            this.drawLectureNeumorphic(canvas);
            if (b) {
                this.drawProgressNeumorphic(canvas);
            }
        }
        if (this.mIpadType == IpadType.CASSET.ordinal()) {
            this.drawCaset(canvas, b, null);
        }
        if (this.mIpadType == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            this.drawCasetNoBg(canvas, b, null, this.isVideo());
        }
        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
            canvas.drawRect(this.ipad_rect, this.paintIpad);
            this.drawBitmapWithShadow(canvas);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD.ordinal();
        final int n = 1;
        final float n2 = 0.03f;
        if (mIpadType == ordinal || this.mIpadType == IpadType.IPAD_UNBLUR.ordinal()) {
            final int n3 = (int)(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * n2);
            int n4;
            if (n3 <= 0) {
                n4 = n;
            }
            else {
                n4 = n3;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n4, 0, 0, true);
            this.drawBitmapWithShadow(canvas);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.drawRectBottom(canvas, this.ipad_rect);
            this.drawBitmapWithShadowTypeBottom(canvas);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.ROUND_RECT.ordinal()) {
            final int n5 = (int)(this.ipad_rect.width() * n2);
            int n6;
            if (n5 <= 0) {
                n6 = n;
            }
            else {
                n6 = n5;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n6, 0, 0, true);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.RECT.ordinal() || this.mIpadType == IpadType.BORDER.ordinal()) {
            final int n7 = (int)(this.ipad_rect.width() * n2);
            int n8;
            if (n7 <= 0) {
                n8 = n;
            }
            else {
                n8 = n7;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n8, 0, 0, false);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.BLACK_LAYER.ordinal()) {
            this.drawBlackLayer(canvas, b, this.isVideo());
        }
        if (this.mIpadType == IpadType.BLUE_TYPE.ordinal()) {
            this.drawBlueType(canvas, b, this.isVideo());
        }
        if (this.mIpadType == IpadType.HEART.ordinal()) {
            this.drawHeartType(canvas, b, this.isVideo());
        }
        if (this.mIpadType == IpadType.BATTERY.ordinal()) {
            this.drawBatteryType(canvas, b, this.isVideo);
        }
        if (this.mIpadType == IpadType.GRADIENT.ordinal()) {
            this.drawGradientLayer(canvas, this.isVideo());
        }
        if (this.mIpadType == IpadType.MASK_BRUSH.ordinal()) {
            this.drawMaskedBitmap(canvas, this.isVideo);
        }
    }
    
    private void drawIpad(final Canvas canvas, final boolean b, final boolean b2) {
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final float n = 0.02f;
        final float n2 = 0.5f;
        if (mIpadType == ordinal) {
            canvas.drawRect(this.ipad_rect, this.paintIpad);
            if (b2) {
                this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n2;
                this.top_square = this.ipad_rect.top + this.bitmapBlured.getHeight() * n;
            }
            else {
                this.drawBitmapWithShadow(canvas);
            }
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.IPAD_NEOMORPHIC.ordinal()) {
            this.drawNeumorphicRect(canvas, this.ipad_rect.width() * 0.12f, b2);
            this.drawLectureNeumorphic(canvas);
            if (b) {
                this.drawProgressNeumorphic(canvas);
            }
        }
        if (this.mIpadType == IpadType.CASSET.ordinal()) {
            this.drawCaset(canvas, b, null);
        }
        if (this.mIpadType == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            this.drawCasetNoBg(canvas, b, null, this.isVideo());
        }
        final int mIpadType2 = this.mIpadType;
        final int ordinal2 = IpadType.IPAD.ordinal();
        final int n3 = 1;
        final float n4 = 0.03f;
        if (mIpadType2 == ordinal2 || this.mIpadType == IpadType.IPAD_UNBLUR.ordinal()) {
            final int n5 = (int)(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * n4);
            int n6;
            if (n5 <= 0) {
                n6 = n3;
            }
            else {
                n6 = n5;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n6, 0, 0, true);
            if (b2) {
                this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n2;
                this.top_square = this.ipad_rect.top + this.bitmapBlured.getHeight() * n;
            }
            else {
                this.drawBitmapWithShadow(canvas);
            }
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.drawRectBottom(canvas, this.ipad_rect);
            if (b2) {
                this.drawBitmapWithShadowTypeBottomSave(canvas);
            }
            else {
                this.drawBitmapWithShadowTypeBottom(canvas);
            }
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.ROUND_RECT.ordinal()) {
            final int n7 = (int)(this.ipad_rect.width() * n4);
            int n8;
            if (n7 <= 0) {
                n8 = n3;
            }
            else {
                n8 = n7;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n8, 0, 0, true);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.RECT.ordinal() || this.mIpadType == IpadType.BORDER.ordinal()) {
            final int n9 = (int)(this.ipad_rect.width() * n4);
            int n10;
            if (n9 <= 0) {
                n10 = n3;
            }
            else {
                n10 = n9;
            }
            this.drawRectWithShadow(canvas, this.ipad_rect, -16777216, n10, 0, 0, false);
            this.drawLecture(canvas);
            if (b) {
                this.drawProgress(canvas);
            }
        }
        if (this.mIpadType == IpadType.BLACK_LAYER.ordinal()) {
            this.drawBlackLayer(canvas, b, b2);
        }
        if (this.mIpadType == IpadType.HEART.ordinal()) {
            this.drawHeartType(canvas, b, b2);
        }
        if (this.mIpadType == IpadType.BATTERY.ordinal()) {
            this.drawBatteryType(canvas, b, b2);
        }
        if (this.mIpadType == IpadType.BLUE_TYPE.ordinal()) {
            this.drawBlueType(canvas, b, this.isVideo());
        }
        if (this.mIpadType == IpadType.GRADIENT.ordinal()) {
            this.drawGradientLayer(canvas, b2);
        }
        if (this.mIpadType == IpadType.MASK_BRUSH.ordinal()) {
            this.drawMaskedBitmap(canvas, b2);
        }
    }
    
    private void drawLecture(final Canvas canvas) {
        final float n = this.rectFLecture.height() * 0.4f;
        final Rect rect = new Rect((int)(this.rectFLecture.centerX() - n), (int)(this.rectFLecture.centerY() - n), (int)(this.rectFLecture.centerX() + n), (int)(this.rectFLecture.centerY() + n));
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.pause_circle_24px);
        drawable.setTint(this.paintLecture.getColor());
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        drawable.draw(canvas);
        final int n2 = (int)(rect.height() * 0.3f);
        final int n3 = (int)(rect.width() * 0.45f);
        final float n4 = rect.width() * 0.29f;
        final int n5 = (int)(rect.right + n4);
        final Rect rect2 = new Rect(n5, rect.centerY() - n2, n5 + n3, rect.centerY() + n2);
        final Drawable drawable2 = ContextCompat.getDrawable(this.getContext(), R$drawable.skip_next_24px);
        drawable2.setTint(this.paintLecture.getColor());
        drawable2.setBounds(rect2.left, rect2.top, rect2.right, rect2.bottom);
        drawable2.draw(canvas);
        final int n6 = (int)(rect.left - n4);
        final Rect rect3 = new Rect(n6 - n3, rect.centerY() - n2, n6, rect.centerY() + n2);
        final Drawable drawable3 = ContextCompat.getDrawable(this.getContext(), R$drawable.skip_previous_24px);
        drawable3.setTint(this.paintLecture.getColor());
        drawable3.setBounds(rect3.left, rect3.top, rect3.right, rect3.bottom);
        drawable3.draw(canvas);
        final int n7 = (int)(rect3.width() * 0.5f);
        final int n8 = (int)this.rectFProgress.left;
        final int n9 = rect3.width() + n8;
        final Drawable drawable4 = ContextCompat.getDrawable(this.getContext(), R$drawable.favorite_24px);
        drawable4.setTint(this.paintLecture.getColor());
        drawable4.setBounds(n8, rect3.centerY() - n7, n9, rect3.centerY() + n7);
        drawable4.draw(canvas);
        final int n10 = (int)this.rectFProgress.right - rect3.width();
        final Drawable drawable5 = ContextCompat.getDrawable(this.getContext(), R$drawable.repeat_24px);
        drawable5.setTint(this.paintLecture.getColor());
        drawable5.setBounds(n10, rect3.centerY() - n7, (int)this.rectFProgress.right, rect3.centerY() + n7);
        drawable5.draw(canvas);
    }
    
    private void drawLectureNeumorphic(final Canvas canvas) {
        final float n = this.rectFLecture.height() * 0.3f;
        final Rect rect = new Rect((int)(this.rectFLecture.centerX() - n), (int)(this.rectFLecture.centerY() - n), (int)(this.rectFLecture.centerX() + n), (int)(this.rectFLecture.centerY() + n));
        final float n2 = (float)rect.width();
        final float n3 = 0.15f;
        final int n4 = (int)(n2 * n3);
        final float n5 = (float)rect.centerX();
        final float n6 = (float)rect.centerY();
        final float n7 = (float)rect.height();
        final float n8 = 0.5f;
        canvas.drawCircle(n5, n6, n7 * n8, this.lightShadowPaint);
        canvas.drawCircle((float)rect.centerX(), (float)rect.centerY(), rect.height() * n8, this.darkShadowPaint);
        canvas.drawCircle((float)rect.centerX(), (float)rect.centerY(), rect.height() * n8, this.backgroundPaint);
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.pause_24px);
        drawable.setTint(this.paintLecture.getColor());
        drawable.setBounds(rect.left + n4, rect.top + n4, rect.right - n4, rect.bottom - n4);
        drawable.draw(canvas);
        final int n9 = (int)(rect.height() * 0.4f);
        final float n10 = rect.width() * 0.55f;
        final int n11 = (int)(rect.right + n10);
        final Rect rect2 = new Rect(n11, rect.centerY() - n9, n11 + n9, rect.centerY() + n9);
        final int n12 = (int)(rect.width() * n3);
        canvas.drawCircle((float)rect2.centerX(), (float)rect2.centerY(), rect2.height() * n8, this.lightShadowPaint);
        canvas.drawCircle((float)rect2.centerX(), (float)rect2.centerY(), rect2.height() * n8, this.darkShadowPaint);
        canvas.drawCircle((float)rect2.centerX(), (float)rect2.centerY(), rect2.height() * n8, this.backgroundPaint);
        final Drawable drawable2 = ContextCompat.getDrawable(this.getContext(), R$drawable.arrow_forward_ios_24px);
        drawable2.setTint(this.paintLecture.getColor());
        drawable2.setBounds(rect2.left, rect2.top + n12, rect2.right, rect2.bottom - n12);
        drawable2.draw(canvas);
        final int n13 = (int)(rect.left - n10);
        final Rect rect3 = new Rect(n13 - n9, rect.centerY() - n9, n13, rect.centerY() + n9);
        canvas.drawCircle((float)rect3.centerX(), (float)rect3.centerY(), rect3.height() * n8, this.lightShadowPaint);
        canvas.drawCircle((float)rect3.centerX(), (float)rect3.centerY(), rect3.height() * n8, this.darkShadowPaint);
        canvas.drawCircle((float)rect3.centerX(), (float)rect3.centerY(), rect3.height() * n8, this.backgroundPaint);
        final Drawable drawable3 = ContextCompat.getDrawable(this.getContext(), R$drawable.arrow_back_ios_24px);
        drawable3.setTint(this.paintLecture.getColor());
        drawable3.setBounds(rect3.left, rect3.top + n12, rect3.right, rect3.bottom - n12);
        drawable3.draw(canvas);
    }
    
    private void drawLineHelper(final Canvas canvas) {
        if (this.showCenterLineX || this.showCenterLineY) {
            final Paint paint = new Paint(1);
            paint.setColor(Color.parseColor("#80FF4081"));
            paint.setStrokeWidth(5.0f);
            final float n = (float)this.mCanvas_width;
            final float n2 = 2.0f;
            final float n3 = n / n2;
            final int mCanvas_height = this.mCanvas_height;
            final float n4 = mCanvas_height / n2;
            if (this.showCenterLineX) {
                canvas.drawLine(n3, 0.0f, n3, (float)mCanvas_height, paint);
            }
            if (this.showCenterLineY) {
                canvas.drawLine(0.0f, n4, (float)this.mCanvas_width, n4, paint);
            }
        }
    }
    
    private void drawMaskedBitmap(final Canvas canvas, final boolean b) {
        this.paintIpad.setAlpha(255);
        if (b) {
            canvas.drawBitmap(this.bitmapSquare, 0.0f, 0.0f, this.paint);
        }
        final float n = (float)this.bitmapNotBlur.getWidth();
        final float n2 = 1.1f;
        final Bitmap bitmap = Bitmap.createBitmap((int)(n * n2), (int)(this.bitmapNotBlur.getHeight() * n2), Bitmap$Config.ARGB_8888);
        final Canvas canvas2 = new Canvas(bitmap);
        if (this.getColor_gradient() != null) {
            this.paint.setShader((Shader)this.linearGradient_classic);
            canvas2.drawPaint(this.paint);
            this.paint.setShader((Shader)null);
        }
        else {
            canvas2.drawColor(this.paintIpad.getColor());
        }
        final int n3 = (int)(Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.57f);
        final Rect rect = new Rect(0, 0, n3, n3);
        final Bitmap bitmap2 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap$Config.ARGB_8888);
        canvas2.setBitmap(bitmap2);
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.brush_mask_2);
        drawable.setBounds(0, 0, rect.width(), rect.height());
        drawable.draw(canvas2);
        final Paint paint = new Paint(1);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        canvas2.setBitmap(bitmap);
        final int mResizetype = this.mResizetype;
        final int ordinal = ResizeType.SOCIAL_STORY.ordinal();
        final float n4 = 0.5f;
        if (mResizetype == ordinal) {
            canvas2.drawBitmap(bitmap2, (bitmap.getWidth() - bitmap2.getWidth()) * n4, bitmap.getHeight() * 0.35f, paint);
        }
        else {
            canvas2.drawBitmap(bitmap2, (bitmap.getWidth() - bitmap2.getWidth()) * n4, bitmap.getHeight() * 0.32f, paint);
        }
        canvas.drawBitmap(bitmap, this.btmX, this.btmY, (Paint)null);
        this.paintIpad.setShader((Shader)null);
        this.paintIpad.setAlpha(190);
    }
    
    private void drawNameSurah(final Canvas canvas) {
        final SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null) {
            surahNameEntity.draw(canvas);
        }
    }
    
    private void drawNeumorphicRect(final Canvas canvas, float centerX, final boolean b) {
        final Gradient color_gradient = this.getColor_gradient();
        final float n = 1.1f;
        final float n2 = 0.4f;
        final int n3 = 1;
        int color;
        int n6;
        int n7;
        if (color_gradient != null) {
            this.paint.setShader((Shader)this.linearGradient_classic);
            canvas.drawPaint(this.paint);
            this.paint.setShader((Shader)null);
            final int second = this.getColor_gradient().getSecond();
            final float[] array = new float[3];
            Color.colorToHSV(second, array);
            array[0] = (array[0] + this.getColor_gradient().getAngle()) % 360.0f;
            final float b2 = array[n3] * 1.2f;
            final float n4 = 1.0f;
            array[n3] = Math.min(n4, b2);
            final int n5 = 2;
            array[n5] = Math.min(n4, array[n5] * n);
            color = Color.HSVToColor(array);
            n6 = ColorUtils.lightenColor(color, n2);
            n7 = ColorUtils.darkenColor(color, n2);
        }
        else {
            canvas.drawColor(this.color_ipad);
            color = this.color_ipad;
            n6 = ColorUtils.lightenColor(color, n2);
            n7 = ColorUtils.darkenColor(this.color_ipad, n2);
        }
        (this.backgroundPaint = new Paint(n3)).setColor(color);
        this.backgroundPaint.setStyle(Paint$Style.FILL);
        (this.lightShadowPaint = new Paint(n3)).setColor(color);
        this.lightShadowPaint.setStyle(Paint$Style.FILL);
        final Paint lightShadowPaint = this.lightShadowPaint;
        final float n8 = -5.0f;
        final float n9 = 5.0f;
        lightShadowPaint.setShadowLayer(n9, n8, n8, n6);
        (this.darkShadowPaint = new Paint(n3)).setColor(color);
        this.darkShadowPaint.setStyle(Paint$Style.FILL);
        this.darkShadowPaint.setShadowLayer(n9, n9, n9, n7);
        final Paint backgroundPaint = this.backgroundPaint;
        final float left = this.ipad_rect.left;
        final float top = this.ipad_rect.top;
        final float right = this.ipad_rect.right;
        final float bottom = this.ipad_rect.bottom;
        final int n10 = (int)(Color.red(color) * n);
        final int n11 = (int)(Color.green(color) * n);
        final int n12 = (int)(Color.blue(color) * n);
        final int n13 = 255;
        final int argb = Color.argb(n13, n10, n11, n12);
        final float n14 = (float)Color.red(color);
        final float n15 = 0.9f;
        backgroundPaint.setShader((Shader)new LinearGradient(left, top, right, bottom, argb, Color.argb(n13, (int)(n14 * n15), (int)(Color.green(color) * n15), (int)(Color.blue(color) * n15)), Shader$TileMode.CLAMP));
        canvas.drawRoundRect(this.ipad_rect, centerX, centerX, this.lightShadowPaint);
        canvas.drawRoundRect(this.ipad_rect, centerX, centerX, this.darkShadowPaint);
        canvas.drawRoundRect(this.ipad_rect, centerX, centerX, this.backgroundPaint);
        centerX = this.ipad_rect.centerX();
        final float n16 = this.ipad_rect.width() * 0.32f;
        final float n17 = this.ipad_rect.top + 1.35f * n16;
        canvas.drawCircle(centerX, n17, n16, this.lightShadowPaint);
        canvas.drawCircle(centerX, n17, n16, this.darkShadowPaint);
        canvas.drawCircle(centerX, n17, n16, this.backgroundPaint);
        final float n18 = this.bitmapSquare.getWidth() * 0.5f;
        centerX -= n18;
        this.left_square = centerX;
        final float top_square = n17 - n18;
        this.top_square = top_square;
        canvas.drawBitmap(this.bitmapSquare, centerX, top_square, (Paint)null);
    }
    
    private void drawProgress(final Canvas canvas) {
        final float n = this.rectFProgress.left + (this.rectFProgress.right - this.rectFProgress.left) * this.progress;
        this.linePaint.setColor(this.color_line_bg);
        canvas.drawLine(this.rectFProgress.left, this.rectFProgress.centerY(), this.rectFProgress.right, this.rectFProgress.centerY(), this.linePaint);
        this.linePaint.setColor(this.paintLecture.getColor());
        canvas.drawLine(this.rectFProgress.left, this.rectFProgress.centerY(), n, this.rectFProgress.centerY(), this.linePaint);
        canvas.drawCircle(n, this.rectFProgress.centerY(), this.radius_cursur, this.linePaint);
        final Rect rect = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, rect);
        canvas.drawText(this.currentTime, this.rectFProgress.left, this.rectFProgress.bottom, (Paint)this.paintText);
        canvas.drawText(this.remainingTime, this.rectFProgress.right - rect.width(), this.rectFProgress.bottom, (Paint)this.paintText);
    }
    
    private void drawProgressNeumorphic(final Canvas canvas) {
        final float strokeWidth = this.linePaint.getStrokeWidth();
        this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.18f);
        final float strokeWidth2 = this.linePaint.getStrokeWidth();
        final float n = 0.5f;
        final float n2 = strokeWidth2 * n;
        final float n3 = this.rectFProgress.left + this.rectFProgress.width() * this.progress;
        this.linePaint.setColor(this.color_line_bg);
        canvas.drawRoundRect(this.rectFProgress.left, this.rectFProgress.centerY() - n2, this.rectFProgress.right, this.rectFProgress.centerY() + n2, this.rectFProgress.height(), this.rectFProgress.height(), this.linePaint);
        this.linePaint.setColor(this.paintLecture.getColor());
        final Paint linePaint = this.linePaint;
        linePaint.setStrokeWidth(linePaint.getStrokeWidth() * n);
        canvas.drawRoundRect(this.rectFProgress.left, this.rectFProgress.centerY() - n2, n3, this.rectFProgress.centerY() + n2, this.rectFProgress.height(), this.rectFProgress.height(), this.linePaint);
        this.linePaint.setStrokeWidth(strokeWidth);
        final Rect rect = new Rect();
        final TextPaint paintText = this.paintText;
        final String currentTime = this.currentTime;
        paintText.getTextBounds(currentTime, 0, currentTime.length(), rect);
        canvas.drawText(this.currentTime, this.rectFProgress.left, this.rectFProgress.bottom, (Paint)this.paintText);
        canvas.drawText(this.remainingTime, this.rectFProgress.right - rect.width(), this.rectFProgress.bottom, (Paint)this.paintText);
    }
    
    private void drawWattermark(final Canvas canvas, final boolean b) {
        final Bitmap bitmapBlured = this.bitmapBlured;
        if (bitmapBlured != null) {
            if (this.ipad_rect != null) {
                final float textSize = bitmapBlured.getWidth() * 0.057f;
                final float n = 0.27f * textSize;
                this.paintWattermark.setTextSize(textSize);
                this.paintWattermark.setAntiAlias(true);
                this.paintWattermark.setColor(-1);
                this.paintWattermark.setAlpha(120);
                final Rect rect = new Rect();
                final Paint paintWattermark = this.paintWattermark;
                final String s = "NurMontage";
                paintWattermark.getTextBounds(s, 0, s.length(), rect);
                final float n2 = (float)rect.width();
                final float n3 = (float)rect.height();
                final float n4 = 3.5f * n;
                final float n5 = this.bitmapBlured.getWidth() - n2 - n4;
                final float n6 = canvas.getHeight() - n4;
                canvas.drawText(s, n5, n6, this.paintWattermark);
                this.paintWattermark.clearShadowLayer();
                if (!b && !this.isAnimWatermk) {
                    this.mRectWattermark = new RectF(n5 - n, n6 - n3 - n, n5 + n2 + n, n6 + n);
                    final float n7 = n3 * 0.9f;
                    final float right = this.mRectWattermark.right;
                    final float n8 = n7 * 0.5f;
                    final RectF rectF = new RectF(right - n8, this.mRectWattermark.top - n8, this.mRectWattermark.right + n8, this.mRectWattermark.top + n8);
                    final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.ic_remove_wattermark);
                    if (drawable != null) {
                        drawable.setBounds((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
                        drawable.setAlpha(180);
                        drawable.draw(canvas);
                    }
                    this.mRectWattermark.union(rectF);
                }
            }
        }
    }
    
    private void fadeIn(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final int round = Math.round(this.AccelerateDecelerateInterpolator(j / (float)n) * 255.0f);
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round);
            this.saveBitmap(bitmap, file, "quran_in_" + i + "_" + j + ".png");
        }
    }
    
    private void fadeOut(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final int round = Math.round(this.AccelerateDecelerateInterpolator(1.0f - j / (float)n) * 255.0f);
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round);
            this.saveBitmap(bitmap, file, "quran_out_" + i + "_" + j + ".png");
        }
    }
    
    private EntityView findEntityAtPoint(final float n, final float n2) {
        final SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null && surahNameEntity.getRect().contains(n, n2)) {
            return this.surahNameEntity;
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.isVisible() && this.mIsti3adhaEntity.getBismilahTimeline().visible() && this.mIsti3adhaEntity.getRect().contains(n, n2)) {
            return this.mIsti3adhaEntity;
        }
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        if (bismilahEntity != null && bismilahEntity.isVisible() && this.bismilahEntity.getBismilahTimeline().visible() && this.bismilahEntity.getRect().contains(n, n2)) {
            return this.bismilahEntity;
        }
        for (int i = this.quranEntities.size() - 1; i >= 0; --i) {
            final EntityView entityView = this.quranEntities.get(i);
            if (entityView.isVisible()) {
                if (entityView.getEntityQuran().visible()) {
                    if (entityView.getRect().contains(n, n2)) {
                        return entityView;
                    }
                }
            }
        }
        for (int j = this.translationEntities.size() - 1; j >= 0; --j) {
            final EntityView entityView2 = this.translationEntities.get(j);
            if (entityView2.isVisible()) {
                if (entityView2.getEntityTrslTimeline().visible()) {
                    if (entityView2.getRect().contains(n, n2)) {
                        return entityView2;
                    }
                }
            }
        }
        return null;
    }
    
    private QuranEntity getLastAdd() {
        for (int i = this.quranEntities.size() - 1; i >= 0; --i) {
            final QuranEntity quranEntity = this.quranEntities.get(i);
            if (quranEntity.getEntityQuran().visible() && quranEntity.getFactorSize() == 1.0f) {
                return quranEntity;
            }
        }
        final List quranEntities = this.quranEntities;
        return (QuranEntity)quranEntities.get(quranEntities.size() - 1);
    }
    
    private TranslationQuranEntity getLastAddTrsl() {
        for (int i = this.translationEntities.size() - 1; i >= 0; --i) {
            final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
            if (translationQuranEntity.getEntityTrslTimeline().visible() && translationQuranEntity.getFactorSize() == 1.0f) {
                return translationQuranEntity;
            }
        }
        final List translationEntities = this.translationEntities;
        return (TranslationQuranEntity)translationEntities.get(translationEntities.size() - 1);
    }
    
    private void handleTranslate(final PointF pointF) {
        if (this.entity_select == null) {
            return;
        }
        final float abs = Math.abs(pointF.x);
        final float n = 80.0f;
        if (abs <= n) {
            if (Math.abs(pointF.y) <= n) {
                final RectF rect = this.entity_select.getRect();
                final float centerX = rect.centerX();
                final float centerY = rect.centerY();
                final float n2 = centerX + pointF.x;
                final float n3 = centerY + pointF.y;
                final float n4 = (float)this.mCanvas_width;
                final float n5 = 2.0f;
                final float n6 = n4 / n5;
                final float n7 = this.mCanvas_height / n5;
                boolean b = false;
                this.showCenterLineX = false;
                this.showCenterLineY = false;
                float x = pointF.x;
                float y = pointF.y;
                final float n8 = n2 - n6;
                final float abs2 = Math.abs(n8);
                final float n9 = 30.0f;
                final float n10 = fcmpg(abs2, n9);
                final float n11 = 1.0f;
                final float n12 = 0.2f;
                int n13 = 1;
                if (n10 < 0) {
                    this.showCenterLineX = (n13 != 0);
                    x -= n8 * n12 * (n11 - Math.abs(n8) / n9);
                }
                final float n14 = n3 - n7;
                if (Math.abs(n14) < n9) {
                    this.showCenterLineY = (n13 != 0);
                    y -= n12 * n14 * (n11 - Math.abs(n14) / n9);
                }
                if (n2 >= 0.0f && n2 <= this.getWidth()) {
                    this.entity_select.postTranslate(x, 0.0f);
                    this.selectTool.setApply_Move((boolean)(n13 != 0));
                    b = (n13 != 0);
                }
                if (n3 >= 0.0f && n3 <= this.getHeight()) {
                    this.entity_select.postTranslate(0.0f, y);
                    this.selectTool.setApply_Move((boolean)(n13 != 0));
                }
                else {
                    n13 = (b ? 1 : 0);
                }
                if (n13 != 0) {
                    this.invalidate();
                }
            }
        }
    }
    
    private void init() {
        this.setOnTouchListener((View$OnTouchListener)this);
        this.moveGestureDetector = new MoveGestureDetector(this.getContext(), new BlurredImageView$MoveListener(this, null));
        this.scaleGestureDetector = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector$OnScaleGestureListener)new BlurredImageView$ScaleListener(this, null));
        this.gestureDetector = new GestureDetectorCompat(this.getContext(), (GestureDetector$OnGestureListener)this.gestureListener);
        this.grayscalePaint = new Paint();
        final ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.grayscalePaint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(colorMatrix));
        final boolean b = true;
        (this.paintWattermark = new Paint((int)(b ? 1 : 0))).setColor(-16777216);
        this.paintWattermark.setAlpha(25);
        this.paintWattermark.setTypeface(UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/ReadexPro_Medium.ttf"));
        this.paintWattermark.setFakeBoldText(b);
        (this.linePaint = new Paint()).setAntiAlias(b);
        this.paintLecture = new Paint((int)(b ? 1 : 0));
        this.paintIpad = new Paint((int)(b ? 1 : 0));
        this.paintText = new TextPaint((int)(b ? 1 : 0));
        (this.paintClear = new Paint()).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        this.paintText.setTypeface(UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/arabic/NotoNaskhArabic.ttf"));
    }
    
    private void saveBg(final String s, final Bitmap bitmap, final File file) {
        this.saveBitmap(bitmap, file, s);
    }
    
    private void saveBitmap(Bitmap bitmap, File externalFilesDir, final String child) {
        Object o = null;
        if (externalFilesDir == null) {
            externalFilesDir = this.getContext().getExternalFilesDir((String)null);
        }
        final File file = new File(externalFilesDir, child);
        try {
            try {
                externalFilesDir = (File)new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)externalFilesDir);
                    ((OutputStream)externalFilesDir).flush();
                    final File file2 = externalFilesDir;
                    ((FileOutputStream)file2).close();
                }
                catch (final IOException ex) {}
                finally {
                    final Bitmap bitmap2;
                    bitmap = bitmap2;
                    o = externalFilesDir;
                }
            }
            finally {}
        }
        catch (final IOException ex2) {}
        try {
            final File file2 = externalFilesDir;
            ((FileOutputStream)file2).close();
            return;
            ((FileOutputStream)o).close();
        }
        catch (final IOException ex3) {
            ex3.printStackTrace();
        }
        return;
        if (o != null) {
            try {
                ((FileOutputStream)o).close();
            }
            catch (final IOException ex4) {
                ex4.printStackTrace();
            }
        }
    }
    
    private void saveProgressBitmap(final File file, final float n) {
        final Bitmap bitmap = Bitmap.createBitmap((int)this.rectFProgress.width(), (int)this.rectFProgress.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final float n2 = canvas.getHeight() * 0.5f;
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.07f);
        }
        else if (this.mIpadType == IpadType.BORDER.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.027f);
        }
        else {
            this.paintText.setTextSize(this.ipad_rect.width() * 0.0388f);
        }
        final Rect rect = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, rect);
        this.newLeft_txt = (this.rectFProgress.width() - rect.width()) * 0.964f;
        this.txt_y = canvas.getHeight() * 0.76f;
        this.linePaint.setAntiAlias(false);
        this.linePaint.setStrokeWidth(this.linePaint.getStrokeWidth() * 1.1f);
        this.linePaint.setColor(this.paintLecture.getColor());
        canvas.drawLine(0.0f, n2, (float)canvas.getWidth(), n2, this.linePaint);
        this.saveBitmap(bitmap, file, "line_bg.png");
        bitmap.eraseColor(0);
        this.linePaint.setColor(this.color_line_bg);
        canvas.drawLine(0.0f, n2, (float)canvas.getWidth(), n2, this.linePaint);
        this.linePaint.setColor(this.paintLecture.getColor());
        this.linePaint.setAntiAlias(true);
        canvas.drawCircle(n, n2, n, this.linePaint);
        this.saveBitmap(bitmap, file, "line_progress.png");
    }
    
    private Pair saveProgressBitmapTypeBattery(final File file, final Bitmap bitmap) {
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), (int)this.rectFProgress.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final float width = this.rectFProgress.width();
        final float height = this.rectFProgress.height();
        final float centerX = this.rectFProgress.centerX();
        final float n = canvas.getHeight() * 0.5f;
        final float min = Math.min(width, height);
        final float n2 = 0.8f * min;
        final float n3 = 0.45f * min;
        final float n4 = 2.0f;
        final float n5 = n2 / n4;
        final float f = centerX - n5;
        final float n6 = n3 / n4;
        final float n7 = n - n6;
        final float n8 = n5 + centerX;
        final float n9 = n6 + n;
        final float n10 = 0.07f * n2 + n8;
        final float n11 = 0.25f * n3;
        final float n12 = n - n11;
        final float n13 = n11 + n;
        final Path path = new Path();
        final Bitmap bitmap3 = bitmap2;
        final RectF rectF = new RectF(f, n7, n8, n9);
        final float n14 = 0.05f * min;
        path.addRoundRect(rectF, n14, n14, Path$Direction.CW);
        path.addRect(new RectF(n8, n12, n10, n13), Path$Direction.CW);
        final Path path2 = new Path();
        final float n15 = 0.3f;
        final float n16 = n2 * n15;
        final float n17 = 0.5f;
        final float n18 = n3 * n17;
        final float n19 = n15 * n16;
        final float n20 = centerX - n19;
        final float n21 = n18 * n17;
        path2.moveTo(n20, n - n21);
        path2.lineTo(centerX, n);
        final float n22 = n16 * 0.2f;
        path2.lineTo(centerX - n22, n);
        path2.lineTo(n19 + centerX, n21 + n);
        path2.lineTo(centerX, n);
        path2.lineTo(centerX + n22, n);
        path2.close();
        final int color = -16777216;
        canvas.drawColor(color);
        final int alpha = this.paintIpad.getAlpha();
        Label_0570: {
            if (this.getColor_gradient() != null) {
                final LinearGradient linearGradient_classic = this.linearGradient_classic;
                if (linearGradient_classic != null) {
                    this.paintIpad.setShader((Shader)linearGradient_classic);
                    this.paintIpad.setColor(this.getColor_gradient().getColor());
                    break Label_0570;
                }
            }
            this.paintIpad.setColor(this.color_ipad);
        }
        this.paintIpad.setAlpha(alpha);
        this.paintIpad.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        this.paintIpad.setStyle(Paint$Style.FILL);
        canvas.drawPath(path, this.paintIpad);
        this.paintIpad.setXfermode((Xfermode)null);
        this.paintIpad.setStyle(Paint$Style.STROKE);
        this.paintIpad.setStrokeWidth(min * 0.025f);
        canvas.drawPath(path, this.paintIpad);
        this.paintIpad.setXfermode((Xfermode)null);
        this.paintIpad.setStyle(Paint$Style.FILL);
        final Shader shader = this.paintIpad.getShader();
        this.paintIpad.setShader((Shader)null);
        this.paintIpad.setColor(color);
        canvas.drawPath(path2, this.paintIpad);
        this.paintIpad.setShader(shader);
        this.saveBitmap(bitmap3, file, "line_progress.png");
        final Bitmap bitmap4 = Bitmap.createBitmap(Math.round(n10 - f + this.paintIpad.getStrokeWidth() * 0.5f), bitmap3.getHeight(), Bitmap$Config.ARGB_8888);
        canvas.setBitmap(bitmap4);
        Label_0981: {
            if (this.getColor_gradient() != null) {
                final LinearGradient linearGradient_classic2 = this.linearGradient_classic;
                if (linearGradient_classic2 != null) {
                    this.paintIpad.setShader((Shader)linearGradient_classic2);
                    this.paintIpad.setColor(this.getColor_gradient().getColor());
                    break Label_0981;
                }
            }
            this.paintIpad.setColor(this.color_ipad);
        }
        canvas.drawPaint(this.paintIpad);
        this.saveBitmap(bitmap4, file, "line_bg.png");
        return new Pair((Object)f, (Object)new Point(bitmap4.getWidth(), bitmap4.getHeight()));
    }
    
    private void saveProgressBitmapTypeBlue(final File file) {
        final Bitmap bitmap = Bitmap.createBitmap((int)this.rectFProgress.width(), (int)this.rectFProgress.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final float n = (float)canvas.getHeight();
        final float n2 = 0.5f;
        final float n3 = n * n2;
        final float strokeWidth = this.rectFProgress.height() * 0.18f;
        this.linePaint.setStrokeWidth(n2 * strokeWidth);
        this.linePaint.setColor(this.paintLecture.getColor());
        canvas.drawLine(0.0f, n3, (float)canvas.getWidth(), n3, this.linePaint);
        this.saveBitmap(bitmap, file, "line_bg.png");
        bitmap.eraseColor(0);
        this.linePaint.setStrokeWidth(strokeWidth);
        this.linePaint.setColor(this.color_line_bg);
        canvas.drawLine(0.0f, n3, (float)canvas.getWidth(), n3, this.linePaint);
        this.saveBitmap(bitmap, file, "line_progress.png");
    }
    
    private Pair saveProgressBitmapTypeHeart(final File file, final Bitmap bitmap) {
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), (int)this.rectFProgress.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Path path = new Path();
        final float width = this.rectFProgress.width();
        final float height = this.rectFProgress.height();
        final float centerX = this.rectFProgress.centerX();
        final float n = canvas.getHeight() * 0.5f;
        final float n2 = Math.min(width, height) / 2.0f;
        final float n3 = n + 0.6f * n2;
        path.moveTo(centerX, n3);
        final float n4 = n2 * 1.2f;
        final float n5 = centerX + n4;
        final float n6 = n + 0.1f * n2;
        final float n7 = n2 * 0.8f;
        final float n8 = centerX + n7;
        final float n9 = n - 0.9f * n2;
        path.cubicTo(n5, n6, n8, n9, centerX, n - 0.4f * n2);
        path.cubicTo(centerX - n7, n9, centerX - n4, n6, centerX, n3);
        path.close();
        final RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        final float f = n - 0.536f * n2;
        final int round = Math.round(rectF.bottom - f);
        final int alpha = this.paintIpad.getAlpha();
        Label_0439: {
            if (this.getColor_gradient() != null) {
                final LinearGradient linearGradient_classic = this.linearGradient_classic;
                if (linearGradient_classic != null) {
                    this.paintIpad.setShader((Shader)linearGradient_classic);
                    this.paintIpad.setColor(this.getColor_gradient().getColor());
                    break Label_0439;
                }
            }
            this.paintIpad.setColor(this.color_ipad);
        }
        this.paintIpad.setAlpha(alpha);
        canvas.drawColor(-16777216);
        this.paintIpad.setStyle(Paint$Style.FILL);
        this.paintIpad.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        canvas.drawPath(path, this.paintIpad);
        this.paintIpad.setXfermode((Xfermode)null);
        this.paintIpad.setStyle(Paint$Style.STROKE);
        this.paintIpad.setStrokeWidth(n2 * 0.02f);
        canvas.drawPath(path, this.paintIpad);
        this.saveBitmap(bitmap2, file, "line_progress.png");
        this.paintIpad.setXfermode((Xfermode)null);
        canvas.drawColor(0, PorterDuff$Mode.CLEAR);
        canvas.drawPaint(this.paintIpad);
        this.saveBitmap(bitmap2, file, "line_bg.png");
        return new Pair((Object)f, (Object)round);
    }
    
    private void saveProgressBitmapTypeIPAD_NEOMORPHIC(final File file, final Bitmap bitmap) {
        final Bitmap bitmap2 = Bitmap.createBitmap((int)this.rectFProgress.width(), (int)this.rectFProgress.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        this.paintText.setTextSize(this.ipad_rect.width() * 0.0388f);
        final Rect rect = new Rect();
        this.paintText.getTextBounds("0:60", 0, 4, rect);
        this.newLeft_txt = (this.rectFProgress.width() - rect.width()) * 0.964f;
        this.txt_y = canvas.getHeight() * 0.76f;
        final float n = (float)canvas.getHeight();
        final float n2 = 0.5f;
        final float n3 = n * n2;
        final float strokeWidth = this.rectFProgress.height() * 0.18f;
        final float strokeWidth2 = n2 * strokeWidth;
        this.linePaint.setStrokeWidth(strokeWidth2);
        this.linePaint.setColor(this.paintLecture.getColor());
        final float n4 = (float)canvas.getHeight();
        final float n5 = canvas.getWidth() * 0.024f;
        canvas.save();
        canvas.clipRect(n5, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight());
        final float n6 = n3 - strokeWidth2;
        final float n7 = (float)canvas.getWidth();
        final float n8 = n3 + strokeWidth2;
        final Paint linePaint = this.linePaint;
        final float n9 = n6;
        final float n10 = n8;
        final float n11 = n8;
        final float n12 = n6;
        canvas.drawRoundRect(0.0f, n9, n7, n10, n4, n4, linePaint);
        canvas.restore();
        this.saveBitmap(bitmap2, file, "line_bg.png");
        bitmap2.eraseColor(0);
        canvas.save();
        canvas.clipRect(0.0f, n9, n5, n10);
        canvas.drawBitmap(bitmap, new Rect((int)this.rectFProgress.left, (int)this.rectFProgress.top, (int)this.rectFProgress.right, (int)this.rectFProgress.bottom), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), (Paint)null);
        final float n13 = (float)canvas.getWidth();
        final Paint linePaint2 = this.linePaint;
        final float n14 = n11;
        canvas.drawRoundRect(0.0f, n12, n13, n14, n4, n4, linePaint2);
        canvas.restore();
        this.saveBitmap(bitmap2, file, "line_bg_tmp.png");
        this.linePaint.setStrokeWidth(strokeWidth);
        this.linePaint.setColor(this.color_line_bg);
        bitmap2.eraseColor(0);
        canvas.drawRoundRect(0.0f, n12, (float)canvas.getWidth(), n14, n4, n4, this.linePaint);
        this.saveBitmap(bitmap2, file, "line_progress.png");
    }
    
    private void saveProgressCassetBitmap(final File file, final int n, final int n2, final Drawable drawable) {
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, n, n2);
        drawable.draw(canvas);
        this.saveBitmap(bitmap, file, "line_bg.png");
    }
    
    private void slideInToLeft(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final float accelerateDecelerateInterpolator = this.AccelerateDecelerateInterpolator(j / (float)n);
            final int round = Math.round(255.0f * accelerateDecelerateInterpolator);
            final float n2 = 1.0f - accelerateDecelerateInterpolator;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round, n2);
            this.saveBitmap(bitmap, file, "quran_in_" + i + "_" + j + ".png");
        }
    }
    
    private void slideInToRight(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final float accelerateDecelerateInterpolator = this.AccelerateDecelerateInterpolator(j / (float)n);
            final int round = Math.round(255.0f * accelerateDecelerateInterpolator);
            final float n2 = -1.0f + accelerateDecelerateInterpolator;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round, n2);
            this.saveBitmap(bitmap, file, "quran_in_" + i + "_" + j + ".png");
        }
    }
    
    private void slideOutToLeft(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final float accelerateDecelerateInterpolator = this.AccelerateDecelerateInterpolator(j / (float)n);
            final int round = Math.round((1.0f - accelerateDecelerateInterpolator) * 255.0f);
            final float n2 = accelerateDecelerateInterpolator * -1.0f;
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round, n2);
            this.saveBitmap(bitmap, file, "quran_out_" + i + "_" + j + ".png");
        }
    }
    
    private void slideOutToRight(final Canvas canvas, final Bitmap bitmap, final QuranEntity quranEntity, final File file, final int i, final int n) {
        for (int j = 1; j < n; ++j) {
            final float accelerateDecelerateInterpolator = this.AccelerateDecelerateInterpolator(j / (float)n);
            final int round = Math.round((1.0f - accelerateDecelerateInterpolator) * 255.0f);
            bitmap.eraseColor(0);
            quranEntity.singleDraw(canvas, round, accelerateDecelerateInterpolator);
            this.saveBitmap(bitmap, file, "quran_out_" + i + "_" + j + ".png");
        }
    }
    
    private void updateBismilahEntity() {
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        final float n = 0.85f;
        final float n2 = 1.0f;
        if (bismilahEntity != null && bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
            this.bismilahEntity.setFactor_scale(n2);
            this.bismilahEntity.setFcSize(n2);
            final BismilahEntity bismilahEntity2 = this.bismilahEntity;
            final RectF rectFAya = this.rectFAya;
            bismilahEntity2.update(rectFAya, (int)(rectFAya.width() * n), (int)(this.rectFAya.height() * n));
            this.bismilahEntity.createStaticLayout();
            final BismilahEntity bismilahEntity3 = this.bismilahEntity;
            bismilahEntity3.initPreset(bismilahEntity3.getmPreset());
            final BismilahEntity bismilahEntity4 = this.bismilahEntity;
            bismilahEntity4.setFcSize(bismilahEntity4.getPaintAya().getTextSize() / this.getmCanvas_width());
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
            this.mIsti3adhaEntity.setFactor_scale(n2);
            this.mIsti3adhaEntity.setFcSize(n2);
            final BismilahEntity mIsti3adhaEntity2 = this.mIsti3adhaEntity;
            final RectF rectFAya2 = this.rectFAya;
            mIsti3adhaEntity2.update(rectFAya2, (int)(rectFAya2.width() * n), (int)(this.rectFAya.height() * n));
            this.mIsti3adhaEntity.createStaticLayout();
            final BismilahEntity mIsti3adhaEntity3 = this.mIsti3adhaEntity;
            mIsti3adhaEntity3.initPreset(mIsti3adhaEntity3.getmPreset());
            final BismilahEntity mIsti3adhaEntity4 = this.mIsti3adhaEntity;
            mIsti3adhaEntity4.setFcSize(mIsti3adhaEntity4.getPaintAya().getTextSize() / this.getmCanvas_width());
        }
    }
    
    private void updateSelectionOnTap(final MotionEvent motionEvent) {
        this.setEntity_select(this.findEntityAtPoint(motionEvent.getX(), motionEvent.getY()));
        final BlurredImageView$IViewCallback iViewCallback = this.iViewCallback;
        if (iViewCallback != null) {
            final EntityView entity_select = this.entity_select;
            if (entity_select != null) {
                iViewCallback.onSelect(entity_select);
            }
            else {
                iViewCallback.onEmtyClick();
            }
        }
        this.invalidate();
    }
    
    public float AccelerateDecelerateInterpolator(final float n) {
        return (float)(Math.cos((n + 1.0f) * 3.141592653589793) / 2.0) + 0.5f;
    }
    
    public void addBismilahEntity(final BismilahEntity bismilahEntity) {
        this.bismilahEntity = bismilahEntity;
    }
    
    public void addEntity(final QuranEntity quranEntity) {
        this.quranEntities.add(quranEntity);
        quranEntity.setIndex(this.quranEntities.size() - 1);
    }
    
    public void addEntity(final QuranEntity quranEntity, final int index) {
        if (index < this.quranEntities.size()) {
            this.quranEntities.add(index, quranEntity);
        }
        else {
            this.quranEntities.add(quranEntity);
        }
        quranEntity.setIndex(index);
    }
    
    public void addEntity(final TranslationQuranEntity translationQuranEntity) {
        this.translationEntities.add(translationQuranEntity);
        translationQuranEntity.setIndex(this.translationEntities.size() - 1);
    }
    
    public void addEntity(final TranslationQuranEntity translationQuranEntity, final int index) {
        if (index < this.translationEntities.size()) {
            this.translationEntities.add(index, translationQuranEntity);
        }
        else {
            this.translationEntities.add(translationQuranEntity);
        }
        translationQuranEntity.setIndex(index);
    }
    
    public void addIsti3adhaEntity(final BismilahEntity mIsti3adhaEntity) {
        this.mIsti3adhaEntity = mIsti3adhaEntity;
    }
    
    public void animWatermark(final float wmAlpha, final float wmScale, final float wmTranslateY) {
        this.isAnimWatermk = true;
        this.wmAlpha = wmAlpha;
        this.wmScale = wmScale;
        this.wmTranslateY = wmTranslateY;
        this.invalidate();
    }
    
    public void applyAll(final float n, final RectF rectF, int n2, int n3) {
        final EntityView entity_select = this.entity_select;
        if (entity_select == null) {
            return;
        }
        n2 = ((entity_select instanceof QuranEntity) ? 1 : 0);
        if (n2 != 0) {
            final QuranEntity quranEntity = (QuranEntity)entity_select;
            final Iterator iterator = this.quranEntities.iterator();
            while (true) {
                n3 = (iterator.hasNext() ? 1 : 0);
                if (n3 == 0) {
                    break;
                }
                final QuranEntity quranEntity2 = (QuranEntity)iterator.next();
                if (quranEntity2 == quranEntity) {
                    continue;
                }
                quranEntity2.applyAll(this.getmCanvas_width(), rectF, quranEntity.getPaintAya().getTextSize(), quranEntity.getFactorSize());
            }
            this.invalidate();
        }
        else {
            n2 = ((entity_select instanceof TranslationQuranEntity) ? 1 : 0);
            if (n2 != 0) {
                final TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)entity_select;
                final Iterator iterator2 = this.translationEntities.iterator();
                while (true) {
                    n3 = (iterator2.hasNext() ? 1 : 0);
                    if (n3 == 0) {
                        break;
                    }
                    final TranslationQuranEntity translationQuranEntity2 = (TranslationQuranEntity)iterator2.next();
                    if (translationQuranEntity2 == translationQuranEntity) {
                        continue;
                    }
                    translationQuranEntity2.applyAll(this.getmCanvas_width(), rectF, translationQuranEntity.getPaintAya().getTextSize(), translationQuranEntity.getFactorSize());
                }
                this.invalidate();
            }
        }
    }
    
    public float calculateTextSize(final String s, final Paint paint, final int n, final int n2) {
        float n3 = 0.0f;
        if (s != null && !s.isEmpty() && n > 0) {
            if (n2 > 0) {
                paint.setTextSize(1.0f);
                final Rect rect = new Rect();
                paint.getTextBounds(s, 0, s.length(), rect);
                rect.width();
                rect.height();
                float n4 = 1000.0f;
                for (int i = 0; i < 100; ++i) {
                    final float textSize = (n3 + n4) / 2.0f;
                    paint.setTextSize(textSize);
                    paint.getTextBounds(s, 0, s.length(), rect);
                    final float n5 = (float)rect.width();
                    final float n6 = (float)rect.height();
                    if (n5 <= n && n6 <= n2) {
                        n3 = textSize;
                    }
                    else {
                        n4 = textSize;
                    }
                }
            }
        }
        return n3;
    }
    
    public void changeColorIpad() {
        if (this.getColor_gradient() != null) {
            this.setColorIpad(this.getColor_gradient());
        }
        else {
            this.setColorIpad(this.colorIpad());
        }
    }
    
    public void changeTypeIpad(int mIpadType) {
        this.mIpadType = mIpadType;
        this.updateIpad();
        mIpadType = this.mIpadType;
        if (mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.07f);
        }
        else {
            mIpadType = this.mIpadType;
            if (mIpadType == IpadType.BORDER.ordinal()) {
                this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.027f);
            }
            else {
                this.paintText.setTextSize(this.ipad_rect.width() * 0.0388f);
            }
        }
    }
    
    public int colorIpad() {
        return this.color_ipad;
    }
    
    public void createRect() {
        this.updatePosSurahName();
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final float n = 0.35f;
        final float n2 = 1.5f;
        final float n3 = 0.03f;
        final float n4 = 0.4f;
        final float n5 = 0.5f;
        final float n6 = 0.25f;
        final float n7 = 0.15f;
        final float n8 = 0.2f;
        if (mIpadType == ordinal) {
            final float n9 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n10 = n9 * n3;
            final float n11 = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n5;
            final float n12 = this.ipad_rect.top + n10 + this.bitmapSquare.getHeight();
            this.rectFSurahName = new RectF();
            final float n13 = this.ipad_rect.width() * n4;
            final float n14 = n9 * n8 - n10;
            final float n15 = this.bitmapSquare.getWidth() + n11;
            final float n16 = n12 + n10 * n2;
            final float n17 = n14 + n16;
            this.rectFSurahName.set(n15 - n13, n16, n15, n17);
            this.rectFAya = new RectF();
            final float n18 = n9 * n - n10;
            final float n19 = this.bitmapSquare.getWidth() + n11;
            final float n20 = n18 + n17;
            this.rectFAya.set(n11, n17, n19, n20);
            this.rectFProgress = new RectF();
            final float n21 = n9 * n7;
            final float right = this.rectFAya.right;
            final float n22 = n21 + n20;
            this.rectFProgress.set(n11, n20, right, n22);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n11, n22, this.rectFAya.right, n9 * n6 + n22);
        }
        final int mIpadType2 = this.mIpadType;
        final int ordinal2 = IpadType.IPAD_NEOMORPHIC.ordinal();
        final float n23 = 0.3f;
        if (mIpadType2 == ordinal2) {
            final float n24 = this.ipad_rect.height() * 0.6f;
            final float n25 = n24 * n3;
            final float n26 = this.ipad_rect.top + this.ipad_rect.width() * n23 * 2.4f;
            this.rectFSurahName = new RectF();
            final float n27 = this.ipad_rect.width() * n5 * n5;
            final float height = this.ipad_rect.height();
            final float n28 = 0.1f;
            final float n29 = height * n28;
            final float n30 = n26 + 2.8f * n25;
            this.rectFSurahName.set(this.ipad_rect.centerX() - n27, n30, this.ipad_rect.centerX() + n27, n29 + n30);
            final float n31 = this.rectFSurahName.centerY() + 2.0f * n25;
            final RectF rectFAya = new RectF();
            this.rectFAya = rectFAya;
            final float n32 = n24 * n6 - n25 + n31;
            rectFAya.set(this.ipad_rect.left + n25, n31, this.ipad_rect.right - n25, n32);
            final float n33 = n32 + 0.055f * n24;
            this.rectFProgress = new RectF();
            final float n34 = n24 * n8 + n33;
            final float n35 = this.bitmapSquare.getWidth() * 0.65f;
            this.rectFProgress.set(this.ipad_rect.centerX() - n35, n33, this.ipad_rect.centerX() + n35, n34);
            final float n36 = n34 + n25;
            this.rectFAya.bottom = this.rectFProgress.centerY();
            this.rectFLecture = new RectF();
            final float bottom = this.ipad_rect.bottom;
            final float n37 = this.bitmapSquare.getWidth() * n28;
            this.rectFLecture.set(this.rectFProgress.left - n37, n36, this.rectFProgress.right + n37, bottom);
        }
        if (this.mIpadType == IpadType.IPAD.ordinal() || this.mIpadType == IpadType.IPAD_UNBLUR.ordinal()) {
            final float n38 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n39 = n38 * n3;
            final float n40 = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n5;
            final float n41 = this.ipad_rect.top + n39 + this.bitmapSquare.getHeight();
            this.rectFSurahName = new RectF();
            final float n42 = this.ipad_rect.width() * n4;
            final float n43 = n38 * n8 - n39;
            final float n44 = this.bitmapSquare.getWidth() + n40;
            final float n45 = n41 + n39 * 1.5f;
            final float n46 = n43 + n45;
            this.rectFSurahName.set(n44 - n42, n45, n44, n46);
            this.rectFAya = new RectF();
            final float n47 = n38 * n - n39;
            final float n48 = this.bitmapSquare.getWidth() + n40;
            final float n49 = n47 + n46;
            this.rectFAya.set(n40, n46, n48, n49);
            this.rectFProgress = new RectF();
            final float n50 = n38 * 0.15f;
            final float right2 = this.rectFAya.right;
            final float n51 = n50 + n49;
            this.rectFProgress.set(n40, n49, right2, n51);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n40, n51, this.rectFAya.right, n38 * n6 + n51);
        }
        final int mIpadType3 = this.mIpadType;
        final int ordinal3 = IpadType.ROUND_RECT.ordinal();
        final float n52 = 0.02f;
        final float n53 = 0.52f;
        final float n54 = 0.168f;
        final float n55 = 0.75f;
        if (mIpadType3 == ordinal3) {
            final float n56 = this.ipad_rect.width() * 0.07f;
            final float n57 = this.ipad_rect.left + n56;
            final float n58 = this.ipad_rect.top + n56;
            this.rectFSurahName = new RectF();
            final float n59 = this.ipad_rect.width() * n53;
            final float n60 = this.ipad_rect.height() * n6;
            final float n61 = this.ipad_rect.right - n56;
            final float n62 = n60 + n58;
            this.rectFSurahName.set(n61 - n59, n58, n61, n62);
            this.rectFAya = new RectF();
            final float n63 = this.ipad_rect.width() * n52;
            final float n64 = this.ipad_rect.left + n63;
            final float n65 = this.ipad_rect.right - n63;
            final float n66 = this.ipad_rect.height() * 0.3f + n62;
            this.rectFAya.set(n64, n62, n65, n66);
            this.rectFProgress = new RectF();
            final float n67 = this.ipad_rect.height() * n54 + n66;
            this.rectFProgress.set(n57, n66, n61, n67);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n57, n67, n61, this.ipad_rect.bottom - n56 * n55);
        }
        if (this.mIpadType == IpadType.RECT.ordinal()) {
            final float n68 = this.ipad_rect.width() * 0.05f;
            final float n69 = this.ipad_rect.left + n68;
            final float n70 = this.ipad_rect.top + n68;
            this.rectFSurahName = new RectF();
            final float n71 = this.ipad_rect.width() * n53;
            final float n72 = this.ipad_rect.height() * n6;
            final float n73 = this.ipad_rect.right - n68;
            final float n74 = n72 + n70;
            this.rectFSurahName.set(n73 - n71, n70, n73, n74);
            this.rectFAya = new RectF();
            final float n75 = this.ipad_rect.height() * 0.3f + n74;
            this.rectFAya.set(n69, n74, n73, n75);
            this.rectFProgress = new RectF();
            final float n76 = this.ipad_rect.height() * 0.18f;
            final float right3 = this.rectFAya.right;
            final float n77 = n76 + n75;
            this.rectFProgress.set(n69, n75, right3, n77);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n69, n77, this.rectFAya.right, this.ipad_rect.bottom - n68);
        }
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            final float n78 = this.ipad_rect.width() * 0.005f;
            final float n79 = this.ipad_rect.left + this.ipad_rect.width() * 0.025f;
            final float n80 = this.ipad_rect.top + n78;
            this.rectFSurahName = new RectF();
            final float n81 = this.ipad_rect.width() * 0.37f;
            final float n82 = this.ipad_rect.height() * n8;
            final float n83 = this.ipad_rect.right - this.ipad_rect.width() * 0.015f;
            final float n84 = n82 + n80;
            this.rectFSurahName.set(n83 - n81, n80, n83, n84);
            final float n85 = n84 + n78;
            final float min = Math.min(this.ipad_rect.height(), this.ipad_rect.width());
            final RectF rectFAya2 = new RectF();
            this.rectFAya = rectFAya2;
            final float n86 = min * n6 + n85;
            rectFAya2.set(n79, n85, n83, n86);
            (this.rectFProgress = new RectF()).set(n79, n86, this.rectFAya.right, min * 0.3f + n86);
            final float n87 = this.rectFProgress.bottom - n78 * 2.5f;
            (this.rectFLecture = new RectF()).set(n79, n87, this.rectFAya.right, this.rectFAya.height() + n87);
            this.rectFAya.bottom = this.rectFProgress.top * 1.025f;
        }
        final int mIpadType4 = this.mIpadType;
        final int ordinal4 = IpadType.BLACK_LAYER.ordinal();
        final float n88 = 0.8f;
        final float n89 = 0.34f;
        final float n90 = 0.014f;
        if (mIpadType4 == ordinal4) {
            float n91;
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                n91 = n89;
            }
            else {
                n91 = n4;
            }
            final float n92 = this.ipad_rect.width() * n90;
            final float n93 = this.ipad_rect.left + n92;
            final float n94 = this.ipad_rect.top + n92;
            this.rectFSurahName = new RectF();
            final float min2 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            final float n95 = n91 * min2;
            final float n96 = this.ipad_rect.height() * 0.12f;
            final float n97 = this.ipad_rect.right - n92;
            this.rectFSurahName.set(n97 - n95, n94, n97, n96 + n94);
            final float n98 = this.ipad_rect.centerY() * n88;
            this.rectFAya = new RectF();
            final float n99 = min2 * 0.15f;
            this.rectFAya.set(this.ipad_rect.left + n99, n98, this.ipad_rect.right - n99, n98 + min2 * 0.3f);
            final float centerY = this.rectFAya.centerY();
            final RectF rectFProgress = new RectF();
            this.rectFProgress = rectFProgress;
            final float n100 = min2 * n54 + centerY;
            rectFProgress.set(this.rectFAya.left, centerY, this.rectFAya.right, n100);
            (this.rectFLecture = new RectF()).set(n93, n100, n97, this.ipad_rect.bottom - n92 * n55);
        }
        final int mIpadType5 = this.mIpadType;
        final int ordinal5 = IpadType.HEART.ordinal();
        final float n101 = 0.09f;
        if (mIpadType5 == ordinal5 || this.mIpadType == IpadType.BATTERY.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n102 = this.ipad_rect.width() * n90;
                final float n103 = this.ipad_rect.left + n102;
                final float n104 = this.ipad_rect.top + n102;
                this.rectFSurahName = new RectF();
                final float min3 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n105 = min3 * n4;
                final float n106 = this.ipad_rect.height() * n101;
                final float n107 = this.ipad_rect.right - n102;
                this.rectFSurahName.set(n107 - n105, n104, n107, n106 + n104);
                final float centerY2 = this.ipad_rect.centerY();
                final float n108 = 0.3f;
                final float n109 = centerY2 * n108;
                this.rectFAya = new RectF();
                final float n110 = min3 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n110, n109, this.ipad_rect.right - n110, min3 * n108 + n109);
                this.rectFProgress = new RectF();
                final float width = this.rectFAya.width();
                final float n111 = this.ipad_rect.centerY() - this.rectFAya.width() * n5;
                final float n112 = width + n111;
                this.rectFProgress.set(this.rectFAya.left, n111, this.rectFAya.right, n112);
                (this.rectFLecture = new RectF()).set(n103, n112, n107, this.ipad_rect.bottom - n102 * n55);
            }
            final int mResizetype = this.mResizetype;
            final int ordinal6 = ResizeType.YOUTUBE_THUMBNAIL.ordinal();
            final float n113 = 0.9f;
            final float n114 = 1.3f;
            if (mResizetype == ordinal6) {
                final float n115 = this.ipad_rect.width() * n90;
                final float n116 = this.ipad_rect.left + n115;
                final float n117 = this.ipad_rect.top + n115;
                this.rectFSurahName = new RectF();
                final float min4 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n118 = min4 * n4;
                final float n119 = this.ipad_rect.height() * 0.15f;
                final float n120 = this.ipad_rect.right - n115;
                this.rectFSurahName.set(n120 - n118, n117, n120, n119 + n117);
                final float n121 = this.ipad_rect.centerY() * n89;
                this.rectFAya = new RectF();
                final float n122 = 0.55f * min4;
                this.rectFAya.set(this.ipad_rect.left + n122, n121, this.ipad_rect.right - n122, min4 * 0.3f + n121);
                this.rectFProgress = new RectF();
                final float n123 = this.rectFAya.centerY() * n114;
                final float n124 = this.ipad_rect.bottom * n113;
                this.rectFProgress.set(this.rectFAya.left, n123, this.rectFAya.right, n124);
                (this.rectFLecture = new RectF()).set(n116, n124, n120, this.ipad_rect.bottom - n115 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n125 = this.ipad_rect.width() * n90;
                final float n126 = this.ipad_rect.left + n125;
                final float n127 = this.ipad_rect.top + n125;
                this.rectFSurahName = new RectF();
                final float min5 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n128 = min5 * n89;
                final float n129 = this.ipad_rect.height() * n101;
                final float n130 = this.ipad_rect.right - n125;
                this.rectFSurahName.set(n130 - n128, n127, n130, n129 + n127);
                final float centerY3 = this.ipad_rect.centerY();
                final float n131 = 0.3f;
                final float n132 = centerY3 * n131;
                this.rectFAya = new RectF();
                final float n133 = min5 * 0.25f;
                this.rectFAya.set(this.ipad_rect.left + n133, n132, this.ipad_rect.right - n133, min5 * n131 + n132);
                this.rectFProgress = new RectF();
                final float n134 = this.rectFAya.centerY() * n114;
                final float n135 = this.ipad_rect.bottom * n113;
                this.rectFProgress.set(this.rectFAya.left, n134, this.rectFAya.right, n135);
                (this.rectFLecture = new RectF()).set(n126, n135, n130, this.ipad_rect.bottom - n125 * n55);
            }
        }
        final int mIpadType6 = this.mIpadType;
        final int ordinal7 = IpadType.CASSET.ordinal();
        final float n136 = 0.19f;
        if (mIpadType6 == ordinal7 || this.mIpadType == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            final float n137 = this.ipad_rect.width() * 0.012f;
            final float n138 = this.ipad_rect.top + n137;
            this.rectFSurahName = new RectF();
            final float n139 = Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.45f;
            final float n140 = this.ipad_rect.height() * n136;
            final float n141 = this.ipad_rect.right - n137;
            this.rectFSurahName.set(n141 - n139, n138, n141, n140 + n138);
            final float n142 = this.ipad_rect.width() * 0.33f;
            final float n143 = this.ipad_rect.height() * 0.2f;
            final float n144 = this.ipad_rect.top + n143;
            this.rectFAya = new RectF(this.ipad_rect.centerX() - n142, n144, this.ipad_rect.centerX() + n142, n143 + n144);
            this.rectFProgress = new RectF();
            this.rectFLecture = new RectF();
        }
        if (this.mIpadType == IpadType.GRADIENT.ordinal()) {
            final float n145 = this.ipad_rect.width() * n90;
            final float n146 = this.ipad_rect.left + n145;
            this.ipad_rect.centerY();
            this.rectFSurahName = new RectF();
            final float min6 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            final float n147 = min6 * 0.52f;
            final float n148 = this.ipad_rect.right - n145;
            final float n149 = n148 - n147;
            this.rectFAya = new RectF();
            final float n150 = min6 * 0.15f;
            final float n151 = this.ipad_rect.left + n150;
            final float n152 = this.ipad_rect.right - n150;
            final float n153 = min6 * 0.3f;
            final float n154 = this.ipad_rect.bottom * 0.95f;
            this.rectFAya.set(n151, n154 - n153, n152, n154);
            this.rectFSurahName.set(n149, this.rectFAya.centerY() - n153, n148, this.rectFAya.centerY());
            final float centerY4 = this.rectFAya.centerY();
            final RectF rectFProgress2 = new RectF();
            this.rectFProgress = rectFProgress2;
            final float n155 = min6 * 0.168f + centerY4;
            rectFProgress2.set(this.rectFAya.left, centerY4, this.rectFAya.right, n155);
            (this.rectFLecture = new RectF()).set(n146, n155, n148, this.ipad_rect.bottom - n145 * n55);
            this.rectFSurahName.bottom = this.rectFAya.top;
        }
        if (this.mIpadType == IpadType.MASK_BRUSH.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n156 = this.ipad_rect.width() * n90;
                final float n157 = this.ipad_rect.left + n156;
                final float n158 = this.ipad_rect.top + n156;
                this.rectFSurahName = new RectF();
                final float width2 = this.ipad_rect.width();
                final float n159 = width2 * n4;
                final float n160 = this.ipad_rect.height() * n101;
                final float right4 = this.ipad_rect.right;
                this.rectFSurahName.set(right4 - n159, n158, right4, n160 + n158);
                final float n161 = this.ipad_rect.height() * 0.19f;
                this.rectFAya = new RectF();
                final float n162 = width2 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n162, n161, this.ipad_rect.right - n162, width2 * 0.3f + n161);
                final float centerY5 = this.rectFAya.centerY();
                final RectF rectFProgress3 = new RectF();
                this.rectFProgress = rectFProgress3;
                final float n163 = width2 * 0.168f + centerY5;
                rectFProgress3.set(this.rectFAya.left, centerY5, this.rectFAya.right, n163);
                (this.rectFLecture = new RectF()).set(n157, n163, right4, this.ipad_rect.bottom - n156 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n164 = this.ipad_rect.width() * n90;
                final float n165 = this.ipad_rect.left + n164;
                final float n166 = this.ipad_rect.top + n164;
                this.rectFSurahName = new RectF();
                final float width3 = this.ipad_rect.width();
                final float n167 = width3 * 0.25f;
                final float n168 = this.ipad_rect.height() * n101;
                final float right5 = this.ipad_rect.right;
                this.rectFSurahName.set(right5 - n167, n166, right5, n168 + n166);
                final float n169 = this.ipad_rect.height() * 0.11f;
                this.rectFAya = new RectF();
                final float n170 = width3 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n170, n169, this.ipad_rect.right - n170, width3 * 0.3f + n169);
                final float centerY6 = this.rectFAya.centerY();
                final RectF rectFProgress4 = new RectF();
                this.rectFProgress = rectFProgress4;
                final float n171 = width3 * 0.168f + centerY6;
                rectFProgress4.set(this.rectFAya.left, centerY6, this.rectFAya.right, n171);
                (this.rectFLecture = new RectF()).set(n165, n171, right5, this.ipad_rect.bottom - n164 * n55);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n172 = this.ipad_rect.width() * n90;
                final float n173 = this.ipad_rect.left + n172;
                final float n174 = this.ipad_rect.top + n172;
                this.rectFSurahName = new RectF();
                final float width4 = this.ipad_rect.width();
                final float n175 = width4 * 0.25f;
                final float n176 = this.ipad_rect.height() * n101;
                final float right6 = this.ipad_rect.right;
                this.rectFSurahName.set(right6 - n175, n174, right6, n176 + n174);
                final float n177 = -this.rectFSurahName.height() * 0.5f;
                this.rectFAya = new RectF();
                final float n178 = width4 * 0.3f;
                this.rectFAya.set(this.ipad_rect.left + n178, n177, this.ipad_rect.right - n178, n178 + n177);
                final float centerY7 = this.rectFAya.centerY();
                final RectF rectFProgress5 = new RectF();
                this.rectFProgress = rectFProgress5;
                final float n179 = width4 * 0.168f + centerY7;
                rectFProgress5.set(this.rectFAya.left, centerY7, this.rectFAya.right, n179);
                (this.rectFLecture = new RectF()).set(n173, n179, right6, this.ipad_rect.bottom - n172 * n55);
            }
        }
        if (this.mIpadType == IpadType.BLUE_TYPE.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n180 = this.ipad_rect.width() * n90;
                final float n181 = this.ipad_rect.left + n180;
                final float n182 = this.ipad_rect.top + n180;
                this.rectFSurahName = new RectF();
                final float min7 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n183 = min7 * n4;
                final float n184 = this.ipad_rect.height() * n101;
                final float n185 = this.ipad_rect.right - n180;
                this.rectFSurahName.set(n185 - n183, n182, n185, n184 + n182);
                final float centerY8 = this.ipad_rect.centerY();
                final float n186 = 0.3f;
                final float n187 = centerY8 * n186;
                this.rectFAya = new RectF();
                final float n188 = min7 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n188, n187, this.ipad_rect.right - n188, min7 * n186 + n187);
                final float n189 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress6 = new RectF();
                this.rectFProgress = rectFProgress6;
                final float n190 = min7 * 0.168f + n189;
                rectFProgress6.set(this.rectFAya.left, n189, this.rectFAya.right, n190);
                (this.rectFLecture = new RectF()).set(n181, n190, n185, this.ipad_rect.bottom - n180 * n55);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n191 = this.ipad_rect.width() * n90;
                final float n192 = this.ipad_rect.left + n191;
                final float n193 = this.ipad_rect.top + n191;
                this.rectFSurahName = new RectF();
                final float min8 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n194 = min8 * n4;
                final float n195 = this.ipad_rect.height() * 0.15f;
                final float n196 = this.ipad_rect.right - n191;
                this.rectFSurahName.set(n196 - n194, n193, n196, n195 + n193);
                final float n197 = this.ipad_rect.centerY() * 0.34f;
                (this.rectFAya = new RectF()).set(this.ipad_rect.left + n194, n197, this.ipad_rect.right - n194, min8 * 0.3f + n197);
                final float n198 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress7 = new RectF();
                this.rectFProgress = rectFProgress7;
                final float n199 = min8 * 0.168f + n198;
                rectFProgress7.set(this.rectFAya.left, n198, this.rectFAya.right, n199);
                (this.rectFLecture = new RectF()).set(n192, n199, n196, this.ipad_rect.bottom - n191 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n200 = this.ipad_rect.width() * n90;
                final float n201 = this.ipad_rect.left + n200;
                final float n202 = this.ipad_rect.top + n200;
                this.rectFSurahName = new RectF();
                final float min9 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n203 = 0.34f * min9;
                final float n204 = this.ipad_rect.height() * n101;
                final float n205 = this.ipad_rect.right - n200;
                this.rectFSurahName.set(n205 - n203, n202, n205, n204 + n202);
                final float centerY9 = this.ipad_rect.centerY();
                final float n206 = 0.3f;
                final float n207 = centerY9 * n206;
                this.rectFAya = new RectF();
                final float n208 = min9 * 0.2f;
                this.rectFAya.set(this.ipad_rect.left + n208, n207, this.ipad_rect.right - n208, n206 * min9 + n207);
                final float n209 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress8 = new RectF();
                this.rectFProgress = rectFProgress8;
                final float n210 = min9 * 0.16f + n209;
                rectFProgress8.set(this.rectFAya.left, n209, this.rectFAya.right, n210);
                (this.rectFLecture = new RectF()).set(n201, n210, n205, this.ipad_rect.bottom - n200 * n55);
            }
        }
        if (this.mIpadType == IpadType.BORDER.ordinal()) {
            final float n211 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n212 = n211 * 0.03f;
            final float n213 = this.ipad_rect.width() * 0.8f;
            final float centerX = this.ipad_rect.centerX();
            final float n214 = 0.5f;
            final float n215 = centerX - n213 * n214;
            final float n216 = (this.ipad_rect.top + n212 + this.bitmapSquare.getHeight()) * n214;
            this.rectFSurahName = new RectF();
            final float n217 = this.ipad_rect.width() * n4;
            final float n218 = n211 * 0.2f - n212;
            final float n219 = n215 + n213;
            final float n220 = n216 + 1.5f * n212;
            final float n221 = n218 + n220;
            this.rectFSurahName.set(n219 - n217, n220, n219, n221);
            this.rectFAya = new RectF();
            final float n222 = n213 * 0.7f;
            final float n223 = this.ipad_rect.centerX() - n222 * 0.5f;
            final float n224 = 0.35f * n211 - n212;
            final float n225 = n222 + n223;
            final float n226 = n224 + n221;
            this.rectFAya.set(n223, n221, n225, n226);
            this.rectFProgress = new RectF();
            final float n227 = 0.22f * n211;
            final float right7 = this.rectFSurahName.right;
            final float n228 = n227 + n226;
            this.rectFProgress.set(n215, n226, right7, n228);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n215, n228, this.rectFSurahName.right, n211 * 0.25f + n228);
        }
        else {
            this.paintIpad.setStyle(Paint$Style.FILL);
        }
        if (this.mIpadType != IpadType.BOTTOM_RECT.ordinal() && this.mIpadType != IpadType.ROUND_RECT.ordinal()) {
            this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.03f);
        }
        else {
            this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.02f);
        }
        this.radius_cursur = this.linePaint.getStrokeWidth() * 4.2f;
    }
    
    public void createRectWithoutSurahName() {
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final float n = 0.35f;
        final float n2 = 1.5f;
        final float n3 = 0.03f;
        final float n4 = 0.4f;
        final float n5 = 0.5f;
        final float n6 = 0.25f;
        final float n7 = 0.15f;
        final float n8 = 0.2f;
        if (mIpadType == ordinal) {
            final float n9 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n10 = n9 * n3;
            final float n11 = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n5;
            final float n12 = this.ipad_rect.top + n10 + this.bitmapSquare.getHeight();
            this.rectFSurahName = new RectF();
            final float n13 = this.ipad_rect.width() * n4;
            final float n14 = n9 * n8 - n10;
            final float n15 = this.bitmapSquare.getWidth() + n11;
            final float n16 = n12 + n10 * n2;
            final float n17 = n14 + n16;
            this.rectFSurahName.set(n15 - n13, n16, n15, n17);
            this.rectFAya = new RectF();
            final float n18 = n9 * n - n10;
            final float n19 = this.bitmapSquare.getWidth() + n11;
            final float n20 = n18 + n17;
            this.rectFAya.set(n11, n17, n19, n20);
            this.rectFProgress = new RectF();
            final float n21 = n9 * n7;
            final float right = this.rectFAya.right;
            final float n22 = n21 + n20;
            this.rectFProgress.set(n11, n20, right, n22);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n11, n22, this.rectFAya.right, n9 * n6 + n22);
        }
        final int mIpadType2 = this.mIpadType;
        final int ordinal2 = IpadType.IPAD_NEOMORPHIC.ordinal();
        final float n23 = 0.3f;
        if (mIpadType2 == ordinal2) {
            final float n24 = this.ipad_rect.height() * 0.6f;
            final float n25 = n24 * n3;
            final float n26 = this.ipad_rect.top + this.ipad_rect.width() * n23 * 2.4f;
            this.rectFSurahName = new RectF();
            final float n27 = this.ipad_rect.width() * n5 * n5;
            final float height = this.ipad_rect.height();
            final float n28 = 0.1f;
            final float n29 = height * n28;
            final float n30 = n26 + 2.8f * n25;
            this.rectFSurahName.set(this.ipad_rect.centerX() - n27, n30, this.ipad_rect.centerX() + n27, n29 + n30);
            final float n31 = this.rectFSurahName.centerY() + 2.0f * n25;
            final RectF rectFAya = new RectF();
            this.rectFAya = rectFAya;
            final float n32 = n24 * n6 - n25 + n31;
            rectFAya.set(this.ipad_rect.left + n25, n31, this.ipad_rect.right - n25, n32);
            final float n33 = n32 + 0.055f * n24;
            this.rectFProgress = new RectF();
            final float n34 = n24 * n8 + n33;
            final float n35 = this.bitmapSquare.getWidth() * 0.65f;
            this.rectFProgress.set(this.ipad_rect.centerX() - n35, n33, this.ipad_rect.centerX() + n35, n34);
            final float n36 = n34 + n25;
            this.rectFAya.bottom = this.rectFProgress.centerY();
            this.rectFLecture = new RectF();
            final float bottom = this.ipad_rect.bottom;
            final float n37 = this.bitmapSquare.getWidth() * n28;
            this.rectFLecture.set(this.rectFProgress.left - n37, n36, this.rectFProgress.right + n37, bottom);
        }
        if (this.mIpadType == IpadType.IPAD.ordinal() || this.mIpadType == IpadType.IPAD_UNBLUR.ordinal()) {
            final float n38 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n39 = n38 * n3;
            final float n40 = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n5;
            final float n41 = this.ipad_rect.top + n39 + this.bitmapSquare.getHeight();
            this.rectFSurahName = new RectF();
            final float n42 = this.ipad_rect.width() * n4;
            final float n43 = n38 * n8 - n39;
            final float n44 = this.bitmapSquare.getWidth() + n40;
            final float n45 = n41 + n39 * 1.5f;
            final float n46 = n43 + n45;
            this.rectFSurahName.set(n44 - n42, n45, n44, n46);
            this.rectFAya = new RectF();
            final float n47 = n38 * n - n39;
            final float n48 = this.bitmapSquare.getWidth() + n40;
            final float n49 = n47 + n46;
            this.rectFAya.set(n40, n46, n48, n49);
            this.rectFProgress = new RectF();
            final float n50 = n38 * 0.15f;
            final float right2 = this.rectFAya.right;
            final float n51 = n50 + n49;
            this.rectFProgress.set(n40, n49, right2, n51);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n40, n51, this.rectFAya.right, n38 * n6 + n51);
        }
        final int mIpadType3 = this.mIpadType;
        final int ordinal3 = IpadType.ROUND_RECT.ordinal();
        final float n52 = 0.02f;
        final float n53 = 0.52f;
        final float n54 = 0.168f;
        final float n55 = 0.75f;
        if (mIpadType3 == ordinal3) {
            final float n56 = this.ipad_rect.width() * 0.07f;
            final float n57 = this.ipad_rect.left + n56;
            final float n58 = this.ipad_rect.top + n56;
            this.rectFSurahName = new RectF();
            final float n59 = this.ipad_rect.width() * n53;
            final float n60 = this.ipad_rect.height() * n6;
            final float n61 = this.ipad_rect.right - n56;
            final float n62 = n60 + n58;
            this.rectFSurahName.set(n61 - n59, n58, n61, n62);
            this.rectFAya = new RectF();
            final float n63 = this.ipad_rect.width() * n52;
            final float n64 = this.ipad_rect.left + n63;
            final float n65 = this.ipad_rect.right - n63;
            final float n66 = this.ipad_rect.height() * 0.3f + n62;
            this.rectFAya.set(n64, n62, n65, n66);
            this.rectFProgress = new RectF();
            final float n67 = this.ipad_rect.height() * n54 + n66;
            this.rectFProgress.set(n57, n66, n61, n67);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n57, n67, n61, this.ipad_rect.bottom - n56 * n55);
        }
        if (this.mIpadType == IpadType.RECT.ordinal()) {
            final float n68 = this.ipad_rect.width() * 0.05f;
            final float n69 = this.ipad_rect.left + n68;
            final float n70 = this.ipad_rect.top + n68;
            this.rectFSurahName = new RectF();
            final float n71 = this.ipad_rect.width() * n53;
            final float n72 = this.ipad_rect.height() * n6;
            final float n73 = this.ipad_rect.right - n68;
            final float n74 = n72 + n70;
            this.rectFSurahName.set(n73 - n71, n70, n73, n74);
            this.rectFAya = new RectF();
            final float n75 = this.ipad_rect.height() * 0.3f + n74;
            this.rectFAya.set(n69, n74, n73, n75);
            this.rectFProgress = new RectF();
            final float n76 = this.ipad_rect.height() * 0.18f;
            final float right3 = this.rectFAya.right;
            final float n77 = n76 + n75;
            this.rectFProgress.set(n69, n75, right3, n77);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n69, n77, this.rectFAya.right, this.ipad_rect.bottom - n68);
        }
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            final float n78 = this.ipad_rect.width() * 0.005f;
            final float n79 = this.ipad_rect.left + this.ipad_rect.width() * 0.025f;
            final float n80 = this.ipad_rect.top + n78;
            this.rectFSurahName = new RectF();
            final float n81 = this.ipad_rect.width() * 0.37f;
            final float n82 = this.ipad_rect.height() * n8;
            final float n83 = this.ipad_rect.right - this.ipad_rect.width() * 0.015f;
            final float n84 = n82 + n80;
            this.rectFSurahName.set(n83 - n81, n80, n83, n84);
            final float n85 = n84 + n78;
            final float min = Math.min(this.ipad_rect.height(), this.ipad_rect.width());
            final RectF rectFAya2 = new RectF();
            this.rectFAya = rectFAya2;
            final float n86 = min * n6 + n85;
            rectFAya2.set(n79, n85, n83, n86);
            (this.rectFProgress = new RectF()).set(n79, n86, this.rectFAya.right, min * 0.3f + n86);
            final float n87 = this.rectFProgress.bottom - n78 * 2.5f;
            (this.rectFLecture = new RectF()).set(n79, n87, this.rectFAya.right, this.rectFAya.height() + n87);
            this.rectFAya.bottom = this.rectFProgress.top * 1.025f;
        }
        final int mIpadType4 = this.mIpadType;
        final int ordinal4 = IpadType.BLACK_LAYER.ordinal();
        final float n88 = 0.8f;
        final float n89 = 0.34f;
        final float n90 = 0.014f;
        if (mIpadType4 == ordinal4) {
            float n91;
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                n91 = n89;
            }
            else {
                n91 = n4;
            }
            final float n92 = this.ipad_rect.width() * n90;
            final float n93 = this.ipad_rect.left + n92;
            final float n94 = this.ipad_rect.top + n92;
            this.rectFSurahName = new RectF();
            final float min2 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            final float n95 = n91 * min2;
            final float n96 = this.ipad_rect.height() * 0.12f;
            final float n97 = this.ipad_rect.right - n92;
            this.rectFSurahName.set(n97 - n95, n94, n97, n96 + n94);
            final float n98 = this.ipad_rect.centerY() * n88;
            this.rectFAya = new RectF();
            final float n99 = min2 * 0.15f;
            this.rectFAya.set(this.ipad_rect.left + n99, n98, this.ipad_rect.right - n99, n98 + min2 * 0.3f);
            final float centerY = this.rectFAya.centerY();
            final RectF rectFProgress = new RectF();
            this.rectFProgress = rectFProgress;
            final float n100 = min2 * n54 + centerY;
            rectFProgress.set(this.rectFAya.left, centerY, this.rectFAya.right, n100);
            (this.rectFLecture = new RectF()).set(n93, n100, n97, this.ipad_rect.bottom - n92 * n55);
        }
        final int mIpadType5 = this.mIpadType;
        final int ordinal5 = IpadType.HEART.ordinal();
        final float n101 = 0.09f;
        if (mIpadType5 == ordinal5 || this.mIpadType == IpadType.BATTERY.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n102 = this.ipad_rect.width() * n90;
                final float n103 = this.ipad_rect.left + n102;
                final float n104 = this.ipad_rect.top + n102;
                this.rectFSurahName = new RectF();
                final float min3 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n105 = min3 * n4;
                final float n106 = this.ipad_rect.height() * n101;
                final float n107 = this.ipad_rect.right - n102;
                this.rectFSurahName.set(n107 - n105, n104, n107, n106 + n104);
                final float centerY2 = this.ipad_rect.centerY();
                final float n108 = 0.3f;
                final float n109 = centerY2 * n108;
                this.rectFAya = new RectF();
                final float n110 = min3 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n110, n109, this.ipad_rect.right - n110, min3 * n108 + n109);
                this.rectFProgress = new RectF();
                final float width = this.rectFAya.width();
                final float n111 = this.ipad_rect.centerY() - this.rectFAya.width() * n5;
                final float n112 = width + n111;
                this.rectFProgress.set(this.rectFAya.left, n111, this.rectFAya.right, n112);
                (this.rectFLecture = new RectF()).set(n103, n112, n107, this.ipad_rect.bottom - n102 * n55);
            }
            final int mResizetype = this.mResizetype;
            final int ordinal6 = ResizeType.YOUTUBE_THUMBNAIL.ordinal();
            final float n113 = 0.9f;
            final float n114 = 1.3f;
            if (mResizetype == ordinal6) {
                final float n115 = this.ipad_rect.width() * n90;
                final float n116 = this.ipad_rect.left + n115;
                final float n117 = this.ipad_rect.top + n115;
                this.rectFSurahName = new RectF();
                final float min4 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n118 = min4 * n4;
                final float n119 = this.ipad_rect.height() * 0.15f;
                final float n120 = this.ipad_rect.right - n115;
                this.rectFSurahName.set(n120 - n118, n117, n120, n119 + n117);
                final float n121 = this.ipad_rect.centerY() * n89;
                this.rectFAya = new RectF();
                final float n122 = 0.55f * min4;
                this.rectFAya.set(this.ipad_rect.left + n122, n121, this.ipad_rect.right - n122, min4 * 0.3f + n121);
                this.rectFProgress = new RectF();
                final float n123 = this.rectFAya.centerY() * n114;
                final float n124 = this.ipad_rect.bottom * n113;
                this.rectFProgress.set(this.rectFAya.left, n123, this.rectFAya.right, n124);
                (this.rectFLecture = new RectF()).set(n116, n124, n120, this.ipad_rect.bottom - n115 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n125 = this.ipad_rect.width() * n90;
                final float n126 = this.ipad_rect.left + n125;
                final float n127 = this.ipad_rect.top + n125;
                this.rectFSurahName = new RectF();
                final float min5 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n128 = min5 * n89;
                final float n129 = this.ipad_rect.height() * n101;
                final float n130 = this.ipad_rect.right - n125;
                this.rectFSurahName.set(n130 - n128, n127, n130, n129 + n127);
                final float centerY3 = this.ipad_rect.centerY();
                final float n131 = 0.3f;
                final float n132 = centerY3 * n131;
                this.rectFAya = new RectF();
                final float n133 = min5 * 0.25f;
                this.rectFAya.set(this.ipad_rect.left + n133, n132, this.ipad_rect.right - n133, min5 * n131 + n132);
                this.rectFProgress = new RectF();
                final float n134 = this.rectFAya.centerY() * n114;
                final float n135 = this.ipad_rect.bottom * n113;
                this.rectFProgress.set(this.rectFAya.left, n134, this.rectFAya.right, n135);
                (this.rectFLecture = new RectF()).set(n126, n135, n130, this.ipad_rect.bottom - n125 * n55);
            }
        }
        final int mIpadType6 = this.mIpadType;
        final int ordinal7 = IpadType.CASSET.ordinal();
        final float n136 = 0.19f;
        if (mIpadType6 == ordinal7 || this.mIpadType == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            final float n137 = this.ipad_rect.width() * 0.012f;
            final float n138 = this.ipad_rect.top + n137;
            this.rectFSurahName = new RectF();
            final float n139 = Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.45f;
            final float n140 = this.ipad_rect.height() * n136;
            final float n141 = this.ipad_rect.right - n137;
            this.rectFSurahName.set(n141 - n139, n138, n141, n140 + n138);
            final float n142 = this.ipad_rect.width() * 0.33f;
            final float n143 = this.ipad_rect.height() * 0.2f;
            final float n144 = this.ipad_rect.top + n143;
            this.rectFAya = new RectF(this.ipad_rect.centerX() - n142, n144, this.ipad_rect.centerX() + n142, n143 + n144);
            this.rectFProgress = new RectF();
            this.rectFLecture = new RectF();
        }
        if (this.mIpadType == IpadType.GRADIENT.ordinal()) {
            final float n145 = this.ipad_rect.width() * n90;
            final float n146 = this.ipad_rect.left + n145;
            this.ipad_rect.centerY();
            this.rectFSurahName = new RectF();
            final float min6 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            final float n147 = min6 * 0.52f;
            final float n148 = this.ipad_rect.right - n145;
            final float n149 = n148 - n147;
            this.rectFAya = new RectF();
            final float n150 = min6 * 0.15f;
            final float n151 = this.ipad_rect.left + n150;
            final float n152 = this.ipad_rect.right - n150;
            final float n153 = min6 * 0.3f;
            final float n154 = this.ipad_rect.bottom * 0.95f;
            this.rectFAya.set(n151, n154 - n153, n152, n154);
            this.rectFSurahName.set(n149, this.rectFAya.centerY() - n153, n148, this.rectFAya.centerY());
            final float centerY4 = this.rectFAya.centerY();
            final RectF rectFProgress2 = new RectF();
            this.rectFProgress = rectFProgress2;
            final float n155 = min6 * 0.168f + centerY4;
            rectFProgress2.set(this.rectFAya.left, centerY4, this.rectFAya.right, n155);
            (this.rectFLecture = new RectF()).set(n146, n155, n148, this.ipad_rect.bottom - n145 * n55);
            this.rectFSurahName.bottom = this.rectFAya.top;
        }
        if (this.mIpadType == IpadType.MASK_BRUSH.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n156 = this.ipad_rect.width() * n90;
                final float n157 = this.ipad_rect.left + n156;
                final float n158 = this.ipad_rect.top + n156;
                this.rectFSurahName = new RectF();
                final float width2 = this.ipad_rect.width();
                final float n159 = width2 * n4;
                final float n160 = this.ipad_rect.height() * n101;
                final float right4 = this.ipad_rect.right;
                this.rectFSurahName.set(right4 - n159, n158, right4, n160 + n158);
                final float n161 = this.ipad_rect.height() * 0.19f;
                this.rectFAya = new RectF();
                final float n162 = width2 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n162, n161, this.ipad_rect.right - n162, width2 * 0.3f + n161);
                final float centerY5 = this.rectFAya.centerY();
                final RectF rectFProgress3 = new RectF();
                this.rectFProgress = rectFProgress3;
                final float n163 = width2 * 0.168f + centerY5;
                rectFProgress3.set(this.rectFAya.left, centerY5, this.rectFAya.right, n163);
                (this.rectFLecture = new RectF()).set(n157, n163, right4, this.ipad_rect.bottom - n156 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n164 = this.ipad_rect.width() * n90;
                final float n165 = this.ipad_rect.left + n164;
                final float n166 = this.ipad_rect.top + n164;
                this.rectFSurahName = new RectF();
                final float width3 = this.ipad_rect.width();
                final float n167 = width3 * 0.25f;
                final float n168 = this.ipad_rect.height() * n101;
                final float right5 = this.ipad_rect.right;
                this.rectFSurahName.set(right5 - n167, n166, right5, n168 + n166);
                final float n169 = this.ipad_rect.height() * 0.11f;
                this.rectFAya = new RectF();
                final float n170 = width3 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n170, n169, this.ipad_rect.right - n170, width3 * 0.3f + n169);
                final float centerY6 = this.rectFAya.centerY();
                final RectF rectFProgress4 = new RectF();
                this.rectFProgress = rectFProgress4;
                final float n171 = width3 * 0.168f + centerY6;
                rectFProgress4.set(this.rectFAya.left, centerY6, this.rectFAya.right, n171);
                (this.rectFLecture = new RectF()).set(n165, n171, right5, this.ipad_rect.bottom - n164 * n55);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n172 = this.ipad_rect.width() * n90;
                final float n173 = this.ipad_rect.left + n172;
                final float n174 = this.ipad_rect.top + n172;
                this.rectFSurahName = new RectF();
                final float width4 = this.ipad_rect.width();
                final float n175 = width4 * 0.25f;
                final float n176 = this.ipad_rect.height() * n101;
                final float right6 = this.ipad_rect.right;
                this.rectFSurahName.set(right6 - n175, n174, right6, n176 + n174);
                final float n177 = -this.rectFSurahName.height() * 0.5f;
                this.rectFAya = new RectF();
                final float n178 = width4 * 0.3f;
                this.rectFAya.set(this.ipad_rect.left + n178, n177, this.ipad_rect.right - n178, n178 + n177);
                final float centerY7 = this.rectFAya.centerY();
                final RectF rectFProgress5 = new RectF();
                this.rectFProgress = rectFProgress5;
                final float n179 = width4 * 0.168f + centerY7;
                rectFProgress5.set(this.rectFAya.left, centerY7, this.rectFAya.right, n179);
                (this.rectFLecture = new RectF()).set(n173, n179, right6, this.ipad_rect.bottom - n172 * n55);
            }
        }
        if (this.mIpadType == IpadType.BLUE_TYPE.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n180 = this.ipad_rect.width() * n90;
                final float n181 = this.ipad_rect.left + n180;
                final float n182 = this.ipad_rect.top + n180;
                this.rectFSurahName = new RectF();
                final float min7 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n183 = min7 * n4;
                final float n184 = this.ipad_rect.height() * n101;
                final float n185 = this.ipad_rect.right - n180;
                this.rectFSurahName.set(n185 - n183, n182, n185, n184 + n182);
                final float centerY8 = this.ipad_rect.centerY();
                final float n186 = 0.3f;
                final float n187 = centerY8 * n186;
                this.rectFAya = new RectF();
                final float n188 = min7 * 0.15f;
                this.rectFAya.set(this.ipad_rect.left + n188, n187, this.ipad_rect.right - n188, min7 * n186 + n187);
                final float n189 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress6 = new RectF();
                this.rectFProgress = rectFProgress6;
                final float n190 = min7 * 0.168f + n189;
                rectFProgress6.set(this.rectFAya.left, n189, this.rectFAya.right, n190);
                (this.rectFLecture = new RectF()).set(n181, n190, n185, this.ipad_rect.bottom - n180 * n55);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n191 = this.ipad_rect.width() * n90;
                final float n192 = this.ipad_rect.left + n191;
                final float n193 = this.ipad_rect.top + n191;
                this.rectFSurahName = new RectF();
                final float min8 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n194 = min8 * n4;
                final float n195 = this.ipad_rect.height() * 0.15f;
                final float n196 = this.ipad_rect.right - n191;
                this.rectFSurahName.set(n196 - n194, n193, n196, n195 + n193);
                final float n197 = this.ipad_rect.centerY() * 0.34f;
                (this.rectFAya = new RectF()).set(this.ipad_rect.left + n194, n197, this.ipad_rect.right - n194, min8 * 0.3f + n197);
                final float n198 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress7 = new RectF();
                this.rectFProgress = rectFProgress7;
                final float n199 = min8 * 0.168f + n198;
                rectFProgress7.set(this.rectFAya.left, n198, this.rectFAya.right, n199);
                (this.rectFLecture = new RectF()).set(n192, n199, n196, this.ipad_rect.bottom - n191 * n55);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n200 = this.ipad_rect.width() * n90;
                final float n201 = this.ipad_rect.left + n200;
                final float n202 = this.ipad_rect.top + n200;
                this.rectFSurahName = new RectF();
                final float min9 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
                final float n203 = 0.34f * min9;
                final float n204 = this.ipad_rect.height() * n101;
                final float n205 = this.ipad_rect.right - n200;
                this.rectFSurahName.set(n205 - n203, n202, n205, n204 + n202);
                final float centerY9 = this.ipad_rect.centerY();
                final float n206 = 0.3f;
                final float n207 = centerY9 * n206;
                this.rectFAya = new RectF();
                final float n208 = min9 * 0.2f;
                this.rectFAya.set(this.ipad_rect.left + n208, n207, this.ipad_rect.right - n208, n206 * min9 + n207);
                final float n209 = this.ipad_rect.centerY() * 0.2f;
                final RectF rectFProgress8 = new RectF();
                this.rectFProgress = rectFProgress8;
                final float n210 = min9 * 0.16f + n209;
                rectFProgress8.set(this.rectFAya.left, n209, this.rectFAya.right, n210);
                (this.rectFLecture = new RectF()).set(n201, n210, n205, this.ipad_rect.bottom - n200 * n55);
            }
        }
        if (this.mIpadType == IpadType.BORDER.ordinal()) {
            final float n211 = this.ipad_rect.height() - this.bitmapSquare.getHeight();
            final float n212 = n211 * 0.03f;
            final float n213 = this.ipad_rect.width() * 0.8f;
            final float centerX = this.ipad_rect.centerX();
            final float n214 = 0.5f;
            final float n215 = centerX - n213 * n214;
            final float n216 = (this.ipad_rect.top + n212 + this.bitmapSquare.getHeight()) * n214;
            this.rectFSurahName = new RectF();
            final float n217 = this.ipad_rect.width() * n4;
            final float n218 = n211 * 0.2f - n212;
            final float n219 = n215 + n213;
            final float n220 = n216 + 1.5f * n212;
            final float n221 = n218 + n220;
            this.rectFSurahName.set(n219 - n217, n220, n219, n221);
            this.rectFAya = new RectF();
            final float n222 = n213 * 0.7f;
            final float n223 = this.ipad_rect.centerX() - n222 * 0.5f;
            final float n224 = 0.35f * n211 - n212;
            final float n225 = n222 + n223;
            final float n226 = n224 + n221;
            this.rectFAya.set(n223, n221, n225, n226);
            this.rectFProgress = new RectF();
            final float n227 = 0.22f * n211;
            final float right7 = this.rectFSurahName.right;
            final float n228 = n227 + n226;
            this.rectFProgress.set(n215, n226, right7, n228);
            this.rectFAya.bottom = this.rectFProgress.centerY();
            (this.rectFLecture = new RectF()).set(n215, n228, this.rectFSurahName.right, n211 * 0.25f + n228);
        }
        else {
            this.paintIpad.setStyle(Paint$Style.FILL);
        }
        if (this.mIpadType != IpadType.BOTTOM_RECT.ordinal() && this.mIpadType != IpadType.ROUND_RECT.ordinal()) {
            this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.03f);
        }
        else {
            this.linePaint.setStrokeWidth(this.rectFProgress.height() * 0.02f);
        }
        this.radius_cursur = this.linePaint.getStrokeWidth() * 4.2f;
    }
    
    public void drawBitmapWithShadow(final Canvas canvas) {
        final Bitmap bitmapSquare = this.bitmapSquare;
        if (bitmapSquare != null) {
            if (!bitmapSquare.isRecycled()) {
                try {
                    final Bitmap bitmapSquare2 = this.bitmapSquare;
                    try {
                        final float n = bitmapSquare2.getWidth() * 0.03f;
                        try {
                            final BlurMaskFilter maskFilter = new BlurMaskFilter(n, BlurMaskFilter$Blur.INNER);
                            try {
                                final Paint paint = new Paint();
                                paint.setAntiAlias(true);
                                paint.setColor(-16777216);
                                final Paint paint2 = paint;
                                try {
                                    paint2.setMaskFilter((MaskFilter)maskFilter);
                                    final RectF ipad_rect = this.ipad_rect;
                                    try {
                                        final float centerX = ipad_rect.centerX();
                                        try {
                                            final Bitmap bitmapSquare3 = this.bitmapSquare;
                                            try {
                                                this.left_square = centerX - bitmapSquare3.getWidth() * 0.5f;
                                                final RectF ipad_rect2 = this.ipad_rect;
                                                try {
                                                    final float top = ipad_rect2.top;
                                                    try {
                                                        final Bitmap bitmapBlured = this.bitmapBlured;
                                                        try {
                                                            this.top_square = top + bitmapBlured.getHeight() * 0.02f;
                                                            final Bitmap bitmapSquare4 = this.bitmapSquare;
                                                            Label_0279: {
                                                                if (bitmapSquare4 == null || bitmapSquare4.isRecycled()) {
                                                                    break Label_0279;
                                                                }
                                                                final Bitmap bitmapSquare5 = this.bitmapSquare;
                                                                try {
                                                                    final float left_square = this.left_square;
                                                                    try {
                                                                        canvas.drawBitmap(bitmapSquare5, left_square, this.top_square, paint);
                                                                        final Bitmap bitmapSquare6 = this.bitmapSquare;
                                                                        if (bitmapSquare6 == null || bitmapSquare6.isRecycled()) {
                                                                            return;
                                                                        }
                                                                        final Bitmap bitmapSquare7 = this.bitmapSquare;
                                                                        try {
                                                                            final float left_square2 = this.left_square;
                                                                            try {
                                                                                final float top_square = this.top_square;
                                                                                try {
                                                                                    canvas.drawBitmap(bitmapSquare7, left_square2, top_square, this.paint);
                                                                                }
                                                                                catch (final Exception ex) {
                                                                                    ex.printStackTrace();
                                                                                }
                                                                            }
                                                                            catch (final Exception ex2) {}
                                                                        }
                                                                        catch (final Exception ex3) {}
                                                                    }
                                                                    catch (final Exception ex4) {}
                                                                }
                                                                catch (final Exception ex5) {}
                                                            }
                                                        }
                                                        catch (final Exception ex6) {}
                                                    }
                                                    catch (final Exception ex7) {}
                                                }
                                                catch (final Exception ex8) {}
                                            }
                                            catch (final Exception ex9) {}
                                        }
                                        catch (final Exception ex10) {}
                                    }
                                    catch (final Exception ex11) {}
                                }
                                catch (final Exception ex12) {}
                            }
                            catch (final Exception ex13) {}
                        }
                        catch (final Exception ex14) {}
                    }
                    catch (final Exception ex15) {}
                }
                catch (final Exception ex16) {}
            }
        }
    }
    
    public void drawBitmapWithShadowTypeBottom(final Canvas canvas) {
        final Bitmap bitmapSquare = this.bitmapSquare;
        if (bitmapSquare != null) {
            if (!bitmapSquare.isRecycled()) {
                try {
                    final RectF ipad_rect = this.ipad_rect;
                    try {
                        this.left_square = ipad_rect.left;
                        final RectF ipad_rect2 = this.ipad_rect;
                        try {
                            final float top = ipad_rect2.top;
                            try {
                                final Bitmap bitmapSquare2 = this.bitmapSquare;
                                try {
                                    this.top_square = top - bitmapSquare2.getHeight();
                                    final Bitmap bitmapSquare3 = this.bitmapSquare;
                                    if (bitmapSquare3 == null || bitmapSquare3.isRecycled()) {
                                        return;
                                    }
                                    final Bitmap bitmapSquare4 = this.bitmapSquare;
                                    try {
                                        final float left_square = this.left_square;
                                        try {
                                            final float top_square = this.top_square;
                                            try {
                                                canvas.drawBitmap(bitmapSquare4, left_square, top_square, this.paint);
                                            }
                                            catch (final Exception ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        catch (final Exception ex2) {}
                                    }
                                    catch (final Exception ex3) {}
                                }
                                catch (final Exception ex4) {}
                            }
                            catch (final Exception ex5) {}
                        }
                        catch (final Exception ex6) {}
                    }
                    catch (final Exception ex7) {}
                }
                catch (final Exception ex8) {}
            }
        }
    }
    
    public void drawBitmapWithShadowTypeBottomSave(final Canvas canvas) {
        final Bitmap bitmapSquare = this.bitmapSquare;
        if (bitmapSquare != null) {
            if (!bitmapSquare.isRecycled()) {
                try {
                    final RectF ipad_rect = this.ipad_rect;
                    try {
                        this.left_square = ipad_rect.left;
                        final RectF ipad_rect2 = this.ipad_rect;
                        try {
                            final float top = ipad_rect2.top;
                            try {
                                final Bitmap bitmapSquare2 = this.bitmapSquare;
                                try {
                                    this.top_square = top - bitmapSquare2.getHeight();
                                    final Bitmap bitmapSquare3 = this.bitmapSquare;
                                    if (bitmapSquare3 == null || bitmapSquare3.isRecycled()) {
                                        return;
                                    }
                                    final Bitmap bitmapSquare4 = this.bitmapSquare;
                                    try {
                                        final float left_square = this.left_square;
                                        try {
                                            canvas.drawBitmap(bitmapSquare4, left_square, this.top_square, (Paint)null);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
    }
    
    public void drawRectBottom(final Canvas canvas, final RectF rectF) {
        if (this.isGlass()) {
            Math.min(rectF.width(), rectF.height());
            final Gradient color_gradient = this.color_gradient;
            int n;
            if (color_gradient != null) {
                n = color_gradient.getColor();
                final int argb = Color.argb(70, Color.red(n), Color.green(n), Color.blue(n));
                final RectF ipad_rect = this.ipad_rect;
                final float n2 = (float)this.color_gradient.getAngle();
                final int[] array = { this.color_gradient.getColor(), this.color_gradient.getSecond(), this.color_gradient.getThree() };
                final float[] array3;
                final float[] array2 = array3 = new float[3];
                array3[0] = 0.0f;
                array3[1] = 0.7f;
                array3[2] = 1.0f;
                this.paintIpad.setShader((Shader)CreateGradient.createLinearGradientWithAngle(ipad_rect, n2, array, array2));
                this.paintIpad.setColor(argb);
            }
            else {
                n = this.color_ipad;
                this.paintIpad.setColor(Color.argb(60, Color.red(n), Color.green(this.color_ipad), Color.blue(this.color_ipad)));
            }
            this.paintIpad.setStyle(Paint$Style.FILL);
            canvas.drawRect(rectF, this.paintIpad);
            this.paintIpad.setStyle(Paint$Style.STROKE);
            this.paintIpad.setStrokeWidth(rectF.height() * 0.003f);
            final Paint paintIpad = this.paintIpad;
            final int b = Color.red(n) + 40;
            final int a = 255;
            paintIpad.setColor(Color.argb(120, Math.min(a, b), Math.min(a, Color.green(n) + 40), Math.min(a, Color.blue(n) + 40)));
            canvas.drawRect(rectF, this.paintIpad);
            final float left = rectF.left;
            final float top = rectF.top;
            final float right = rectF.right;
            final float bottom = rectF.bottom;
            final int[] array4 = { Color.argb(140, a, a, a), Color.argb(10, a, a, a) };
            final float[] array6;
            final float[] array5 = array6 = new float[2];
            array6[0] = 0.0f;
            array6[1] = 1.0f;
            this.paintIpad.setShader((Shader)new LinearGradient(left, top, right, bottom, array4, array5, Shader$TileMode.CLAMP));
            this.paintIpad.setStyle(Paint$Style.FILL);
            canvas.drawRect(rectF, this.paintIpad);
            final Paint paintIpad2 = this.paintIpad;
            Object linearGradient_classic;
            if (this.color_gradient != null) {
                linearGradient_classic = this.linearGradient_classic;
            }
            else {
                linearGradient_classic = null;
            }
            paintIpad2.setShader((Shader)linearGradient_classic);
            this.paintIpad.setColor(this.color_ipad);
            this.paintIpad.setAlpha(190);
        }
        else {
            canvas.drawRect(rectF, this.paintIpad);
        }
    }
    
    public void drawRectWithShadow(final Canvas canvas, final RectF rectF, final int n, final int n2, final int n3, final int n4, final boolean b) {
        final boolean glass = this.isGlass();
        final float n5 = 0.14f;
        final int n6 = 80;
        final boolean b2 = true;
        if (glass) {
            final float n7 = Math.min(rectF.width(), rectF.height()) * n5;
            final Paint paint = new Paint();
            paint.setAntiAlias(b2);
            paint.setColor(n);
            paint.setMaskFilter((MaskFilter)new BlurMaskFilter((float)n2, BlurMaskFilter$Blur.OUTER));
            paint.setAlpha(n6);
            final Path path = new Path();
            final Path$Direction cw = Path$Direction.CW;
            if (b) {
                path.addRoundRect(rectF, n7, n7, cw);
            }
            else {
                path.addRect(rectF, cw);
            }
            path.offset((float)n3, (float)n4);
            canvas.drawPath(path, paint);
            final Gradient color_gradient = this.color_gradient;
            int n8;
            if (color_gradient != null) {
                n8 = color_gradient.getColor();
                final int argb = Color.argb(70, Color.red(n8), Color.green(n8), Color.blue(n8));
                final RectF ipad_rect = this.ipad_rect;
                final float n9 = (float)this.color_gradient.getAngle();
                final int[] array = { this.color_gradient.getColor(), this.color_gradient.getSecond(), this.color_gradient.getThree() };
                final float[] array3;
                final float[] array2 = array3 = new float[3];
                array3[0] = 0.0f;
                array3[1] = 0.7f;
                array3[2] = 1.0f;
                this.paintIpad.setShader((Shader)CreateGradient.createLinearGradientWithAngle(ipad_rect, n9, array, array2));
                this.paintIpad.setColor(argb);
            }
            else {
                n8 = this.color_ipad;
                this.paintIpad.setColor(Color.argb(60, Color.red(n8), Color.green(this.color_ipad), Color.blue(this.color_ipad)));
            }
            this.paintIpad.setStyle(Paint$Style.FILL);
            final Paint paintIpad = this.paintIpad;
            if (b) {
                canvas.drawRoundRect(rectF, n7, n7, paintIpad);
            }
            else {
                canvas.drawRect(rectF, paintIpad);
            }
            this.paintIpad.setStyle(Paint$Style.STROKE);
            this.paintIpad.setStrokeWidth(rectF.height() * 0.003f);
            final Paint paintIpad2 = this.paintIpad;
            final int b3 = Color.red(n8) + 40;
            final int a = 255;
            paintIpad2.setColor(Color.argb(120, Math.min(a, b3), Math.min(a, Color.green(n8) + 40), Math.min(a, Color.blue(n8) + 40)));
            final Paint paintIpad3 = this.paintIpad;
            if (b) {
                canvas.drawRoundRect(rectF, n7, n7, paintIpad3);
            }
            else {
                canvas.drawRect(rectF, paintIpad3);
            }
            final float left = rectF.left;
            final float top = rectF.top;
            final float right = rectF.right;
            final float bottom = rectF.bottom;
            final int[] array4 = { Color.argb(140, a, a, a), Color.argb(10, a, a, a) };
            final float[] array6;
            final float[] array5 = array6 = new float[2];
            array6[0] = 0.0f;
            array6[1] = 1.0f;
            this.paintIpad.setShader((Shader)new LinearGradient(left, top, right, bottom, array4, array5, Shader$TileMode.CLAMP));
            this.paintIpad.setStyle(Paint$Style.FILL);
            final Paint paintIpad4 = this.paintIpad;
            if (b) {
                canvas.drawRoundRect(rectF, n7, n7, paintIpad4);
            }
            else {
                canvas.drawRect(rectF, paintIpad4);
            }
            final Paint paintIpad5 = this.paintIpad;
            Object linearGradient_classic;
            if (this.color_gradient != null) {
                linearGradient_classic = this.linearGradient_classic;
            }
            else {
                linearGradient_classic = null;
            }
            paintIpad5.setShader((Shader)linearGradient_classic);
            this.paintIpad.setColor(this.color_ipad);
            this.paintIpad.setAlpha(190);
        }
        else {
            final Paint paint2 = new Paint();
            paint2.setAntiAlias(b2);
            paint2.setColor(n);
            paint2.setMaskFilter((MaskFilter)new BlurMaskFilter((float)n2, BlurMaskFilter$Blur.OUTER));
            paint2.setAlpha(n6);
            if (b) {
                final float n10 = Math.min(rectF.width(), rectF.height()) * n5;
                final Path path2 = new Path();
                path2.addRoundRect(rectF, n10, n10, Path$Direction.CW);
                path2.offset((float)n3, (float)n4);
                canvas.drawPath(path2, paint2);
                canvas.drawRoundRect(rectF, n10, n10, this.paintIpad);
            }
            else {
                final Path path3 = new Path();
                path3.addRect(rectF, Path$Direction.CW);
                path3.offset((float)n3, (float)n4);
                canvas.drawPath(path3, paint2);
                canvas.drawRect(rectF, this.paintIpad);
            }
        }
    }
    
    public BismilahEntity getBismilahEntity() {
        return this.bismilahEntity;
    }
    
    public Bitmap getBitmapBlured() {
        return this.bitmapBlured;
    }
    
    public Bitmap getBitmapDraw(final boolean b, final File file) {
        Bitmap bitmap;
        if (this.mIpadType != IpadType.BLACK_LAYER.ordinal() && this.mIpadType != IpadType.BLUE_TYPE.ordinal() && this.mIpadType != IpadType.GRADIENT.ordinal() && this.mIpadType != IpadType.MASK_BRUSH.ordinal() && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.IPAD_UNBLUR.ordinal()) {
            bitmap = this.bitmapBlured;
        }
        else {
            bitmap = this.bitmapNotBlur;
        }
        if (this.getColor_gradient() != null) {
            this.setColorIpad(this.getColor_gradient());
        }
        final Canvas canvas = new Canvas(bitmap);
        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
            if (this.getColor_gradient() != null) {
                this.paint.setShader((Shader)this.linearGradient_classic);
                canvas.drawPaint(this.paint);
                this.paint.setShader((Shader)null);
            }
            else {
                canvas.drawColor(this.color_bg_type_classic);
            }
        }
        if (this.mIpadType == IpadType.CASSET.ordinal()) {
            this.drawCaset(canvas, false, file);
        }
        else if (this.mIpadType == IpadType.CASSET_IMG.ordinal()) {
            this.drawCasetNoBg(canvas, false, file, b);
        }
        else if (this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            this.bitmapSquare = this.bitmapBlured;
            this.drawCasetNoBg(canvas, false, file, b);
        }
        else {
            this.drawIpad(canvas, false, b);
        }
        final boolean pro = this.isPro();
        final int n = 1;
        if (!pro) {
            this.resetWatermark();
            this.drawWattermark(canvas, (boolean)(n != 0));
        }
        if (this.surahNameEntity != null) {
            this.surahNameEntity.setRect(new RectF(this.surahNameEntity.getCopyRect().left * canvas.getWidth(), this.surahNameEntity.getCopyRect().top * canvas.getHeight(), this.surahNameEntity.getCopyRect().right * canvas.getWidth(), this.surahNameEntity.getCopyRect().bottom * canvas.getHeight()));
            final SurahNameEntity surahNameEntity = this.surahNameEntity;
            surahNameEntity.scale(surahNameEntity.getFactor_scale(), n, n);
            this.surahNameEntity.draw(canvas);
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
        return this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
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
        return this.getWidth() - this.getPaddingStart() - this.getPaddingEnd();
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
    
    public void initCanvasDimension(int n, final int n2, final int n3) {
        if (n3 == ResizeType.SOCIAL_STORY.ordinal()) {
            this.mCanvas_height = n2;
            n = AspectRatioCalculator.calculateWidth(n2);
            this.mCanvas_width = n;
        }
        else if (n3 == ResizeType.SQUARE.ordinal()) {
            n = Math.min(n, n2);
            this.mCanvas_width = n;
            this.mCanvas_height = n;
        }
        else {
            this.mCanvas_width = n;
            n = AspectRatioCalculator.calculateHeight_Youtube(n);
            this.mCanvas_height = n;
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
    
    protected void onDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   android/view/View.onDraw:(Landroid/graphics/Canvas;)V
        //     5: aload_0        
        //     6: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.isNotDraw:Z
        //     9: istore_2       
        //    10: iload_2        
        //    11: ifeq            39
        //    14: aload_0        
        //    15: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isPlaying:()Z
        //    18: istore_3       
        //    19: iload_3        
        //    20: ifeq            38
        //    23: aload_0        
        //    24: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.iViewCallback:Lhazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback;
        //    27: astore_1       
        //    28: aload_1        
        //    29: ifnull          38
        //    32: aload_1        
        //    33: invokeinterface hazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback.onDrawFinish:()V
        //    38: return         
        //    39: aload_1        
        //    40: invokevirtual   android/graphics/Canvas.save:()I
        //    43: pop            
        //    44: aload_0        
        //    45: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mDrawingTranslationX:F
        //    48: fstore          4
        //    50: aload_0        
        //    51: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mDrawingTranslationY:F
        //    54: fstore          5
        //    56: aload_1        
        //    57: fload           4
        //    59: fload           5
        //    61: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //    64: aload_0        
        //    65: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mCanvas_width:I
        //    68: istore_2       
        //    69: aload_0        
        //    70: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mCanvas_height:I
        //    73: istore          6
        //    75: aload_1        
        //    76: iconst_0       
        //    77: iconst_0       
        //    78: iload_2        
        //    79: iload           6
        //    81: invokevirtual   android/graphics/Canvas.clipRect:(IIII)Z
        //    84: pop            
        //    85: ldc_w           -16777216
        //    88: istore_2       
        //    89: ldc_w           -1.7014118E38
        //    92: fstore          4
        //    94: aload_1        
        //    95: iload_2        
        //    96: invokevirtual   android/graphics/Canvas.drawColor:(I)V
        //    99: aload_0        
        //   100: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapBlured:Landroid/graphics/Bitmap;
        //   103: astore          7
        //   105: aload           7
        //   107: ifnull          950
        //   110: aload           7
        //   112: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   115: istore_2       
        //   116: iload_2        
        //   117: ifne            950
        //   120: aload_0        
        //   121: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   124: istore_2       
        //   125: getstatic       hazem/nurmontage/videoquran/constant/IpadType.GRADIENT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   128: astore          8
        //   130: aload           8
        //   132: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   135: istore          6
        //   137: iload_2        
        //   138: iload           6
        //   140: if_icmpeq       675
        //   143: aload_0        
        //   144: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   147: istore_2       
        //   148: getstatic       hazem/nurmontage/videoquran/constant/IpadType.MASK_BRUSH:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   151: astore          8
        //   153: aload           8
        //   155: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   158: istore          6
        //   160: iload_2        
        //   161: iload           6
        //   163: if_icmpeq       675
        //   166: aload_0        
        //   167: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   170: istore_2       
        //   171: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLACK_LAYER:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   174: astore          8
        //   176: aload           8
        //   178: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   181: istore          6
        //   183: iload_2        
        //   184: iload           6
        //   186: if_icmpeq       675
        //   189: aload_0        
        //   190: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   193: istore_2       
        //   194: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   197: astore          8
        //   199: aload           8
        //   201: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   204: istore          6
        //   206: iload_2        
        //   207: iload           6
        //   209: if_icmpne       215
        //   212: goto            675
        //   215: aload_0        
        //   216: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   219: istore_2       
        //   220: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLUE_TYPE:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   223: astore          8
        //   225: aload           8
        //   227: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   230: istore          6
        //   232: iload_2        
        //   233: iload           6
        //   235: if_icmpne       307
        //   238: aload_0        
        //   239: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.isVideo:Z
        //   242: istore_2       
        //   243: iload_2        
        //   244: ifne            741
        //   247: aload_0        
        //   248: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapNotBlur:Landroid/graphics/Bitmap;
        //   251: astore          7
        //   253: aload           7
        //   255: ifnull          741
        //   258: aload           7
        //   260: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   263: istore_2       
        //   264: iload_2        
        //   265: ifne            741
        //   268: aload_0        
        //   269: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapNotBlur:Landroid/graphics/Bitmap;
        //   272: astore          7
        //   274: aload_0        
        //   275: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmX:F
        //   278: fstore          5
        //   280: aload_0        
        //   281: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmY:F
        //   284: fstore          9
        //   286: aload_0        
        //   287: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.grayscalePaint:Landroid/graphics/Paint;
        //   290: astore          10
        //   292: aload_1        
        //   293: aload           7
        //   295: fload           5
        //   297: fload           9
        //   299: aload           10
        //   301: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   304: goto            741
        //   307: aload_0        
        //   308: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   311: istore_2       
        //   312: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG_BLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   315: astore          8
        //   317: aload           8
        //   319: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   322: istore          6
        //   324: iload_2        
        //   325: iload           6
        //   327: if_icmpne       378
        //   330: aload_0        
        //   331: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.isVideo:Z
        //   334: istore_2       
        //   335: iload_2        
        //   336: ifne            741
        //   339: aload_0        
        //   340: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapBlured:Landroid/graphics/Bitmap;
        //   343: astore          7
        //   345: aload_0        
        //   346: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmX:F
        //   349: fstore          5
        //   351: aload_0        
        //   352: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmY:F
        //   355: fstore          9
        //   357: aload_0        
        //   358: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   361: astore          10
        //   363: aload_1        
        //   364: aload           7
        //   366: fload           5
        //   368: fload           9
        //   370: aload           10
        //   372: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   375: goto            741
        //   378: aload_0        
        //   379: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   382: istore_2       
        //   383: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   386: astore          8
        //   388: aload           8
        //   390: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   393: istore          6
        //   395: iload_2        
        //   396: iload           6
        //   398: if_icmpne       482
        //   401: aload_0        
        //   402: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //   405: astore          7
        //   407: aload           7
        //   409: ifnull          469
        //   412: aload_0        
        //   413: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   416: astore          7
        //   418: aload_0        
        //   419: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.linearGradient_classic:Landroid/graphics/LinearGradient;
        //   422: astore          8
        //   424: aload           7
        //   426: aload           8
        //   428: invokevirtual   android/graphics/Paint.setShader:(Landroid/graphics/Shader;)Landroid/graphics/Shader;
        //   431: pop            
        //   432: aload_0        
        //   433: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   436: astore          7
        //   438: aload_1        
        //   439: aload           7
        //   441: invokevirtual   android/graphics/Canvas.drawPaint:(Landroid/graphics/Paint;)V
        //   444: aload_0        
        //   445: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   448: astore          7
        //   450: iconst_0       
        //   451: istore          6
        //   453: fconst_0       
        //   454: fstore          5
        //   456: aconst_null    
        //   457: astore          8
        //   459: aload           7
        //   461: aconst_null    
        //   462: invokevirtual   android/graphics/Paint.setShader:(Landroid/graphics/Shader;)Landroid/graphics/Shader;
        //   465: pop            
        //   466: goto            741
        //   469: aload_0        
        //   470: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.color_bg_type_classic:I
        //   473: istore_2       
        //   474: aload_1        
        //   475: iload_2        
        //   476: invokevirtual   android/graphics/Canvas.drawColor:(I)V
        //   479: goto            741
        //   482: aload_0        
        //   483: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   486: istore_2       
        //   487: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_NEOMORPHIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   490: astore          8
        //   492: aload           8
        //   494: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   497: istore          6
        //   499: iload_2        
        //   500: iload           6
        //   502: if_icmpeq       741
        //   505: aload_0        
        //   506: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   509: istore_2       
        //   510: getstatic       hazem/nurmontage/videoquran/constant/IpadType.HEART:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   513: astore          8
        //   515: aload           8
        //   517: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   520: istore          6
        //   522: iload_2        
        //   523: iload           6
        //   525: if_icmpeq       741
        //   528: aload_0        
        //   529: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   532: istore_2       
        //   533: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BATTERY:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   536: astore          8
        //   538: aload           8
        //   540: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   543: istore          6
        //   545: iload_2        
        //   546: iload           6
        //   548: if_icmpeq       741
        //   551: aload_0        
        //   552: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   555: istore_2       
        //   556: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   559: astore          8
        //   561: aload           8
        //   563: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   566: istore          6
        //   568: iload_2        
        //   569: iload           6
        //   571: if_icmpeq       741
        //   574: aload_0        
        //   575: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.mIpadType:I
        //   578: istore_2       
        //   579: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_UNBLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   582: astore          8
        //   584: aload           8
        //   586: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   589: istore          6
        //   591: iload_2        
        //   592: iload           6
        //   594: if_icmpne       636
        //   597: aload_0        
        //   598: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapNotBlur:Landroid/graphics/Bitmap;
        //   601: astore          7
        //   603: aload_0        
        //   604: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmX:F
        //   607: fstore          5
        //   609: aload_0        
        //   610: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmY:F
        //   613: fstore          9
        //   615: aload_0        
        //   616: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   619: astore          10
        //   621: aload_1        
        //   622: aload           7
        //   624: fload           5
        //   626: fload           9
        //   628: aload           10
        //   630: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   633: goto            741
        //   636: aload_0        
        //   637: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapBlured:Landroid/graphics/Bitmap;
        //   640: astore          7
        //   642: aload_0        
        //   643: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmX:F
        //   646: fstore          5
        //   648: aload_0        
        //   649: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmY:F
        //   652: fstore          9
        //   654: aload_0        
        //   655: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   658: astore          10
        //   660: aload_1        
        //   661: aload           7
        //   663: fload           5
        //   665: fload           9
        //   667: aload           10
        //   669: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   672: goto            741
        //   675: aload_0        
        //   676: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.isVideo:Z
        //   679: istore_2       
        //   680: iload_2        
        //   681: ifne            741
        //   684: aload_0        
        //   685: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapNotBlur:Landroid/graphics/Bitmap;
        //   688: astore          7
        //   690: aload           7
        //   692: ifnull          741
        //   695: aload           7
        //   697: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   700: istore_2       
        //   701: iload_2        
        //   702: ifne            741
        //   705: aload_0        
        //   706: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapNotBlur:Landroid/graphics/Bitmap;
        //   709: astore          7
        //   711: aload_0        
        //   712: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmX:F
        //   715: fstore          5
        //   717: aload_0        
        //   718: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.btmY:F
        //   721: fstore          9
        //   723: aload_0        
        //   724: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.paint:Landroid/graphics/Paint;
        //   727: astore          10
        //   729: aload_1        
        //   730: aload           7
        //   732: fload           5
        //   734: fload           9
        //   736: aload           10
        //   738: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   741: aload_0        
        //   742: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.bitmapSquare:Landroid/graphics/Bitmap;
        //   745: astore          7
        //   747: aload           7
        //   749: ifnull          767
        //   752: iconst_1       
        //   753: istore_2       
        //   754: ldc             1.4E-45
        //   756: fstore          4
        //   758: aload_0        
        //   759: aload_1        
        //   760: iload_2        
        //   761: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawIpad:(Landroid/graphics/Canvas;Z)V
        //   764: goto            772
        //   767: aload_0        
        //   768: aload_1        
        //   769: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawProgress:(Landroid/graphics/Canvas;)V
        //   772: aload_0        
        //   773: aload_1        
        //   774: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawLineHelper:(Landroid/graphics/Canvas;)V
        //   777: aload_0        
        //   778: aload_1        
        //   779: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawBismilah:(Landroid/graphics/Canvas;)V
        //   782: aload_0        
        //   783: aload_1        
        //   784: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawEntity:(Landroid/graphics/Canvas;)V
        //   787: aload_0        
        //   788: aload_1        
        //   789: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawNameSurah:(Landroid/graphics/Canvas;)V
        //   792: aload_0        
        //   793: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   796: astore          7
        //   798: aload           7
        //   800: ifnull          950
        //   803: aload_0        
        //   804: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.selectTool:Lhazem/nurmontage/videoquran/model/EntitySelectTool;
        //   807: astore          8
        //   809: aload           8
        //   811: ifnull          950
        //   814: aload           7
        //   816: invokevirtual   hazem/nurmontage/videoquran/model/EntityView.isVisible:()Z
        //   819: istore_2       
        //   820: iload_2        
        //   821: ifeq            950
        //   824: aload_0        
        //   825: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   828: astore          7
        //   830: aload           7
        //   832: instanceof      Lhazem/nurmontage/videoquran/model/SurahNameEntity;
        //   835: istore          6
        //   837: iload           6
        //   839: ifne            930
        //   842: aload           7
        //   844: instanceof      Lhazem/nurmontage/videoquran/model/BismilahEntity;
        //   847: istore          6
        //   849: iload           6
        //   851: ifne            930
        //   854: aload           7
        //   856: invokevirtual   hazem/nurmontage/videoquran/model/EntityView.getEntityQuran:()Lhazem/nurmontage/videoquran/entity_timeline/EntityQuranTimeline;
        //   859: astore          7
        //   861: aload           7
        //   863: ifnull          889
        //   866: aload_0        
        //   867: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   870: astore          7
        //   872: aload           7
        //   874: invokevirtual   hazem/nurmontage/videoquran/model/EntityView.getEntityQuran:()Lhazem/nurmontage/videoquran/entity_timeline/EntityQuranTimeline;
        //   877: astore          7
        //   879: aload           7
        //   881: invokevirtual   hazem/nurmontage/videoquran/entity_timeline/EntityQuranTimeline.visible:()Z
        //   884: istore_2       
        //   885: iload_2        
        //   886: ifne            930
        //   889: aload_0        
        //   890: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   893: astore          7
        //   895: aload           7
        //   897: invokevirtual   hazem/nurmontage/videoquran/model/EntityView.getEntityTrslTimeline:()Lhazem/nurmontage/videoquran/entity_timeline/EntityTrslTimeline;
        //   900: astore          7
        //   902: aload           7
        //   904: ifnull          950
        //   907: aload_0        
        //   908: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   911: astore          7
        //   913: aload           7
        //   915: invokevirtual   hazem/nurmontage/videoquran/model/EntityView.getEntityTrslTimeline:()Lhazem/nurmontage/videoquran/entity_timeline/EntityTrslTimeline;
        //   918: astore          7
        //   920: aload           7
        //   922: invokevirtual   hazem/nurmontage/videoquran/entity_timeline/EntityTrslTimeline.visible:()Z
        //   925: istore_2       
        //   926: iload_2        
        //   927: ifeq            950
        //   930: aload_0        
        //   931: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.selectTool:Lhazem/nurmontage/videoquran/model/EntitySelectTool;
        //   934: astore          7
        //   936: aload_0        
        //   937: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.entity_select:Lhazem/nurmontage/videoquran/model/EntityView;
        //   940: astore          8
        //   942: aload           7
        //   944: aload_1        
        //   945: aload           8
        //   947: invokevirtual   hazem/nurmontage/videoquran/model/EntitySelectTool.draw:(Landroid/graphics/Canvas;Lhazem/nurmontage/videoquran/model/EntityView;)V
        //   950: aload_0        
        //   951: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isPro:()Z
        //   954: istore_2       
        //   955: iload_2        
        //   956: ifne            974
        //   959: aload_0        
        //   960: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isRemoveWattermark:()Z
        //   963: istore_2       
        //   964: iload_2        
        //   965: ifne            974
        //   968: aload_0        
        //   969: aload_1        
        //   970: iconst_0       
        //   971: invokespecial   hazem/nurmontage/videoquran/views/BlurredImageView.drawWattermark:(Landroid/graphics/Canvas;Z)V
        //   974: aload_1        
        //   975: invokevirtual   android/graphics/Canvas.restore:()V
        //   978: aload_0        
        //   979: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isPlaying:()Z
        //   982: istore_3       
        //   983: iload_3        
        //   984: ifeq            1032
        //   987: aload_0        
        //   988: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.iViewCallback:Lhazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback;
        //   991: astore_1       
        //   992: aload_1        
        //   993: ifnull          1032
        //   996: goto            1026
        //   999: astore_1       
        //  1000: goto            1033
        //  1003: astore_1       
        //  1004: aload_1        
        //  1005: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  1008: aload_0        
        //  1009: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isPlaying:()Z
        //  1012: istore_3       
        //  1013: iload_3        
        //  1014: ifeq            1032
        //  1017: aload_0        
        //  1018: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.iViewCallback:Lhazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback;
        //  1021: astore_1       
        //  1022: aload_1        
        //  1023: ifnull          1032
        //  1026: aload_1        
        //  1027: invokeinterface hazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback.onDrawFinish:()V
        //  1032: return         
        //  1033: aload_0        
        //  1034: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.isPlaying:()Z
        //  1037: istore_2       
        //  1038: iload_2        
        //  1039: ifeq            1060
        //  1042: aload_0        
        //  1043: getfield        hazem/nurmontage/videoquran/views/BlurredImageView.iViewCallback:Lhazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback;
        //  1046: astore          7
        //  1048: aload           7
        //  1050: ifnull          1060
        //  1053: aload           7
        //  1055: invokeinterface hazem/nurmontage/videoquran/views/BlurredImageView$IViewCallback.onDrawFinish:()V
        //  1060: aload_1        
        //  1061: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      9      1003   1026   Ljava/lang/Exception;
        //  5      9      999    1062   Any
        //  39     44     1003   1026   Ljava/lang/Exception;
        //  39     44     999    1062   Any
        //  44     48     1003   1026   Ljava/lang/Exception;
        //  44     48     999    1062   Any
        //  50     54     1003   1026   Ljava/lang/Exception;
        //  50     54     999    1062   Any
        //  59     64     1003   1026   Ljava/lang/Exception;
        //  59     64     999    1062   Any
        //  64     68     1003   1026   Ljava/lang/Exception;
        //  64     68     999    1062   Any
        //  69     73     1003   1026   Ljava/lang/Exception;
        //  69     73     999    1062   Any
        //  79     85     1003   1026   Ljava/lang/Exception;
        //  79     85     999    1062   Any
        //  95     99     1003   1026   Ljava/lang/Exception;
        //  95     99     999    1062   Any
        //  99     103    1003   1026   Ljava/lang/Exception;
        //  99     103    999    1062   Any
        //  110    115    1003   1026   Ljava/lang/Exception;
        //  110    115    999    1062   Any
        //  120    124    1003   1026   Ljava/lang/Exception;
        //  120    124    999    1062   Any
        //  125    128    1003   1026   Ljava/lang/Exception;
        //  125    128    999    1062   Any
        //  130    135    1003   1026   Ljava/lang/Exception;
        //  130    135    999    1062   Any
        //  143    147    1003   1026   Ljava/lang/Exception;
        //  143    147    999    1062   Any
        //  148    151    1003   1026   Ljava/lang/Exception;
        //  148    151    999    1062   Any
        //  153    158    1003   1026   Ljava/lang/Exception;
        //  153    158    999    1062   Any
        //  166    170    1003   1026   Ljava/lang/Exception;
        //  166    170    999    1062   Any
        //  171    174    1003   1026   Ljava/lang/Exception;
        //  171    174    999    1062   Any
        //  176    181    1003   1026   Ljava/lang/Exception;
        //  176    181    999    1062   Any
        //  189    193    1003   1026   Ljava/lang/Exception;
        //  189    193    999    1062   Any
        //  194    197    1003   1026   Ljava/lang/Exception;
        //  194    197    999    1062   Any
        //  199    204    1003   1026   Ljava/lang/Exception;
        //  199    204    999    1062   Any
        //  215    219    1003   1026   Ljava/lang/Exception;
        //  215    219    999    1062   Any
        //  220    223    1003   1026   Ljava/lang/Exception;
        //  220    223    999    1062   Any
        //  225    230    1003   1026   Ljava/lang/Exception;
        //  225    230    999    1062   Any
        //  238    242    1003   1026   Ljava/lang/Exception;
        //  238    242    999    1062   Any
        //  247    251    1003   1026   Ljava/lang/Exception;
        //  247    251    999    1062   Any
        //  258    263    1003   1026   Ljava/lang/Exception;
        //  258    263    999    1062   Any
        //  268    272    1003   1026   Ljava/lang/Exception;
        //  268    272    999    1062   Any
        //  274    278    1003   1026   Ljava/lang/Exception;
        //  274    278    999    1062   Any
        //  280    284    1003   1026   Ljava/lang/Exception;
        //  280    284    999    1062   Any
        //  286    290    1003   1026   Ljava/lang/Exception;
        //  286    290    999    1062   Any
        //  299    304    1003   1026   Ljava/lang/Exception;
        //  299    304    999    1062   Any
        //  307    311    1003   1026   Ljava/lang/Exception;
        //  307    311    999    1062   Any
        //  312    315    1003   1026   Ljava/lang/Exception;
        //  312    315    999    1062   Any
        //  317    322    1003   1026   Ljava/lang/Exception;
        //  317    322    999    1062   Any
        //  330    334    1003   1026   Ljava/lang/Exception;
        //  330    334    999    1062   Any
        //  339    343    1003   1026   Ljava/lang/Exception;
        //  339    343    999    1062   Any
        //  345    349    1003   1026   Ljava/lang/Exception;
        //  345    349    999    1062   Any
        //  351    355    1003   1026   Ljava/lang/Exception;
        //  351    355    999    1062   Any
        //  357    361    1003   1026   Ljava/lang/Exception;
        //  357    361    999    1062   Any
        //  370    375    1003   1026   Ljava/lang/Exception;
        //  370    375    999    1062   Any
        //  378    382    1003   1026   Ljava/lang/Exception;
        //  378    382    999    1062   Any
        //  383    386    1003   1026   Ljava/lang/Exception;
        //  383    386    999    1062   Any
        //  388    393    1003   1026   Ljava/lang/Exception;
        //  388    393    999    1062   Any
        //  401    405    1003   1026   Ljava/lang/Exception;
        //  401    405    999    1062   Any
        //  412    416    1003   1026   Ljava/lang/Exception;
        //  412    416    999    1062   Any
        //  418    422    1003   1026   Ljava/lang/Exception;
        //  418    422    999    1062   Any
        //  426    432    1003   1026   Ljava/lang/Exception;
        //  426    432    999    1062   Any
        //  432    436    1003   1026   Ljava/lang/Exception;
        //  432    436    999    1062   Any
        //  439    444    1003   1026   Ljava/lang/Exception;
        //  439    444    999    1062   Any
        //  444    448    1003   1026   Ljava/lang/Exception;
        //  444    448    999    1062   Any
        //  461    466    1003   1026   Ljava/lang/Exception;
        //  461    466    999    1062   Any
        //  469    473    1003   1026   Ljava/lang/Exception;
        //  469    473    999    1062   Any
        //  475    479    1003   1026   Ljava/lang/Exception;
        //  475    479    999    1062   Any
        //  482    486    1003   1026   Ljava/lang/Exception;
        //  482    486    999    1062   Any
        //  487    490    1003   1026   Ljava/lang/Exception;
        //  487    490    999    1062   Any
        //  492    497    1003   1026   Ljava/lang/Exception;
        //  492    497    999    1062   Any
        //  505    509    1003   1026   Ljava/lang/Exception;
        //  505    509    999    1062   Any
        //  510    513    1003   1026   Ljava/lang/Exception;
        //  510    513    999    1062   Any
        //  515    520    1003   1026   Ljava/lang/Exception;
        //  515    520    999    1062   Any
        //  528    532    1003   1026   Ljava/lang/Exception;
        //  528    532    999    1062   Any
        //  533    536    1003   1026   Ljava/lang/Exception;
        //  533    536    999    1062   Any
        //  538    543    1003   1026   Ljava/lang/Exception;
        //  538    543    999    1062   Any
        //  551    555    1003   1026   Ljava/lang/Exception;
        //  551    555    999    1062   Any
        //  556    559    1003   1026   Ljava/lang/Exception;
        //  556    559    999    1062   Any
        //  561    566    1003   1026   Ljava/lang/Exception;
        //  561    566    999    1062   Any
        //  574    578    1003   1026   Ljava/lang/Exception;
        //  574    578    999    1062   Any
        //  579    582    1003   1026   Ljava/lang/Exception;
        //  579    582    999    1062   Any
        //  584    589    1003   1026   Ljava/lang/Exception;
        //  584    589    999    1062   Any
        //  597    601    1003   1026   Ljava/lang/Exception;
        //  597    601    999    1062   Any
        //  603    607    1003   1026   Ljava/lang/Exception;
        //  603    607    999    1062   Any
        //  609    613    1003   1026   Ljava/lang/Exception;
        //  609    613    999    1062   Any
        //  615    619    1003   1026   Ljava/lang/Exception;
        //  615    619    999    1062   Any
        //  628    633    1003   1026   Ljava/lang/Exception;
        //  628    633    999    1062   Any
        //  636    640    1003   1026   Ljava/lang/Exception;
        //  636    640    999    1062   Any
        //  642    646    1003   1026   Ljava/lang/Exception;
        //  642    646    999    1062   Any
        //  648    652    1003   1026   Ljava/lang/Exception;
        //  648    652    999    1062   Any
        //  654    658    1003   1026   Ljava/lang/Exception;
        //  654    658    999    1062   Any
        //  667    672    1003   1026   Ljava/lang/Exception;
        //  667    672    999    1062   Any
        //  675    679    1003   1026   Ljava/lang/Exception;
        //  675    679    999    1062   Any
        //  684    688    1003   1026   Ljava/lang/Exception;
        //  684    688    999    1062   Any
        //  695    700    1003   1026   Ljava/lang/Exception;
        //  695    700    999    1062   Any
        //  705    709    1003   1026   Ljava/lang/Exception;
        //  705    709    999    1062   Any
        //  711    715    1003   1026   Ljava/lang/Exception;
        //  711    715    999    1062   Any
        //  717    721    1003   1026   Ljava/lang/Exception;
        //  717    721    999    1062   Any
        //  723    727    1003   1026   Ljava/lang/Exception;
        //  723    727    999    1062   Any
        //  736    741    1003   1026   Ljava/lang/Exception;
        //  736    741    999    1062   Any
        //  741    745    1003   1026   Ljava/lang/Exception;
        //  741    745    999    1062   Any
        //  760    764    1003   1026   Ljava/lang/Exception;
        //  760    764    999    1062   Any
        //  768    772    1003   1026   Ljava/lang/Exception;
        //  768    772    999    1062   Any
        //  773    777    1003   1026   Ljava/lang/Exception;
        //  773    777    999    1062   Any
        //  778    782    1003   1026   Ljava/lang/Exception;
        //  778    782    999    1062   Any
        //  783    787    1003   1026   Ljava/lang/Exception;
        //  783    787    999    1062   Any
        //  788    792    1003   1026   Ljava/lang/Exception;
        //  788    792    999    1062   Any
        //  792    796    1003   1026   Ljava/lang/Exception;
        //  792    796    999    1062   Any
        //  803    807    1003   1026   Ljava/lang/Exception;
        //  803    807    999    1062   Any
        //  814    819    1003   1026   Ljava/lang/Exception;
        //  814    819    999    1062   Any
        //  824    828    1003   1026   Ljava/lang/Exception;
        //  824    828    999    1062   Any
        //  854    859    1003   1026   Ljava/lang/Exception;
        //  854    859    999    1062   Any
        //  866    870    1003   1026   Ljava/lang/Exception;
        //  866    870    999    1062   Any
        //  872    877    1003   1026   Ljava/lang/Exception;
        //  872    877    999    1062   Any
        //  879    884    1003   1026   Ljava/lang/Exception;
        //  879    884    999    1062   Any
        //  889    893    1003   1026   Ljava/lang/Exception;
        //  889    893    999    1062   Any
        //  895    900    1003   1026   Ljava/lang/Exception;
        //  895    900    999    1062   Any
        //  907    911    1003   1026   Ljava/lang/Exception;
        //  907    911    999    1062   Any
        //  913    918    1003   1026   Ljava/lang/Exception;
        //  913    918    999    1062   Any
        //  920    925    1003   1026   Ljava/lang/Exception;
        //  920    925    999    1062   Any
        //  930    934    1003   1026   Ljava/lang/Exception;
        //  930    934    999    1062   Any
        //  936    940    1003   1026   Ljava/lang/Exception;
        //  936    940    999    1062   Any
        //  945    950    1003   1026   Ljava/lang/Exception;
        //  945    950    999    1062   Any
        //  950    954    1003   1026   Ljava/lang/Exception;
        //  950    954    999    1062   Any
        //  959    963    1003   1026   Ljava/lang/Exception;
        //  959    963    999    1062   Any
        //  970    974    1003   1026   Ljava/lang/Exception;
        //  970    974    999    1062   Any
        //  974    978    1003   1026   Ljava/lang/Exception;
        //  974    978    999    1062   Any
        //  1004   1008   999    1062   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0950:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (this.selectTool == null) {
            this.selectTool = new EntitySelectTool(n, this.getContext());
        }
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        motionEvent.setLocation(motionEvent.getX() + this.getPaddingLeft() - this.mDrawingTranslationX, motionEvent.getY() + this.getPaddingTop() - this.mDrawingTranslationY);
        final int pointerCount = motionEvent.getPointerCount();
        final int apply_all = 1;
        if (pointerCount > apply_all) {
            return this.scaleGestureDetector.onTouchEvent(motionEvent);
        }
        final EntitySelectTool selectTool = this.selectTool;
        if (selectTool != null && selectTool.isOnProgress() && this.selectTool.isApply_Scale() && this.entity_select != null) {
            if (motionEvent.getAction() == 2 && this.prevDistance > 0.0f) {
                float distanceToCenter = this.distanceToCenter(motionEvent.getX(), motionEvent.getY());
                final float prevDistance = 1.0f;
                if (distanceToCenter < prevDistance) {
                    distanceToCenter = prevDistance;
                }
                if (this.prevDistance < prevDistance) {
                    this.prevDistance = prevDistance;
                }
                final float prevDistance2 = this.prevDistance;
                float n = (distanceToCenter - prevDistance2) / prevDistance2;
                final float n2 = 0.5f;
                if (n > n2) {
                    n = n2;
                }
                final float n3 = -0.5f;
                if (n < n3) {
                    n = n3;
                }
                this.entity_select.scale(n + prevDistance, this.getmCanvas_width(), this.getmCanvas_height());
                this.invalidate();
                this.prevDistance = distanceToCenter;
                return apply_all != 0;
            }
            if (motionEvent.getAction() == apply_all) {
                this.prevDistance = -1.0f;
                this.selectTool.setOnProgress(false);
                if (this.selectTool.isApply_Scale() && this.iViewCallback != null) {
                    final EntityView entity_select = this.entity_select;
                    if ((entity_select instanceof QuranEntity || entity_select instanceof TranslationQuranEntity) && !this.selectTool.isApply_all()) {
                        this.selectTool.setApply_all((boolean)(apply_all != 0));
                        this.invalidate();
                    }
                }
                return apply_all != 0;
            }
        }
        if (motionEvent.getAction() == apply_all && (this.showCenterLineX || this.showCenterLineY)) {
            this.showCenterLineY = false;
            this.showCenterLineX = false;
            this.invalidate();
        }
        if (!this.isOnScale) {
            this.moveGestureDetector.onTouchEvent(motionEvent);
        }
        this.isOnScale = false;
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
    
    public void reset() {
        final Bitmap bitmapBlured = this.bitmapBlured;
        if (bitmapBlured != null && !bitmapBlured.isRecycled()) {
            this.bitmapBlured.recycle();
        }
        final Bitmap bitmapSquare = this.bitmapSquare;
        if (bitmapSquare != null && !bitmapSquare.isRecycled()) {
            this.bitmapSquare.recycle();
        }
    }
    
    public void resetWatermark() {
        final float n = 1.0f;
        this.wmAlpha = n;
        this.wmScale = n;
        this.wmTranslateY = 0.0f;
        this.isAnimWatermk = false;
    }
    
    public void resizeEntity() {
        final SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null) {
            surahNameEntity.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
        }
        this.updateSizeAyaResize();
        this.updateSizeTrslAyaResize();
        this.updateBismilahEntity();
    }
    
    public void setBitmap(final Bitmap bitmapBlured, final Bitmap bitmapSquare, int colorIpad, final int mIpadType, final int mResizetype, final Rect rectSquare) {
        this.bitmapBlured = bitmapBlured;
        if (bitmapSquare != null) {
            this.bitmapSquare = bitmapSquare;
        }
        this.rectSquare = rectSquare;
        this.mIpadType = mIpadType;
        if (colorIpad != -1) {
            this.setColorIpad(colorIpad);
        }
        else if (bitmapSquare != null) {
            this.setColorIpad(ColorUtils.getAverageColor(bitmapSquare));
        }
        this.mResizetype = mResizetype;
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            final TextPaint paintText = this.paintText;
            final float min = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            colorIpad = 1032805417;
            paintText.setTextSize(min * 0.07f);
        }
        else if (this.mIpadType == IpadType.BORDER.ordinal()) {
            final TextPaint paintText2 = this.paintText;
            final float min2 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            colorIpad = 1021128475;
            paintText2.setTextSize(min2 * 0.027f);
        }
        else {
            final TextPaint paintText3 = this.paintText;
            final float width = this.ipad_rect.width();
            colorIpad = 1025436864;
            paintText3.setTextSize(width * 0.0388f);
        }
        this.createRect();
    }
    
    public void setBitmap(final Bitmap bitmapBlured, final Bitmap bitmapSquare, final Gradient colorIpad, final int mIpadType, final int mResizetype, final Rect rectSquare) {
        this.bitmapBlured = bitmapBlured;
        if (bitmapSquare != null) {
            this.bitmapSquare = bitmapSquare;
        }
        this.rectSquare = rectSquare;
        this.mIpadType = mIpadType;
        this.setColorIpad(colorIpad);
        this.mResizetype = mResizetype;
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.07f);
        }
        else if (this.mIpadType == IpadType.BORDER.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.027f);
        }
        else {
            this.paintText.setTextSize(this.ipad_rect.width() * 0.0388f);
        }
        this.createRect();
    }
    
    public void setBitmapBlured(final Bitmap bitmapBlured) {
        this.bitmapBlured = bitmapBlured;
    }
    
    public void setBitmapNotBlur(final Bitmap bitmapNotBlur) {
        this.bitmapNotBlur = bitmapNotBlur;
    }
    
    public void setBitmapOriginal(final Bitmap bitmapOriginal) {
        this.bitmapOriginal = bitmapOriginal;
    }
    
    public void setBitmapSquare(final Bitmap bitmapSquare) {
        if (bitmapSquare != null) {
            if (!bitmapSquare.isRecycled()) {
                this.bitmapSquare = bitmapSquare;
            }
        }
    }
    
    public void setClr_aya(final int clr_aya) {
        this.clr_aya = clr_aya;
    }
    
    public void setClr_trsl(final int clr_trsl) {
        this.clr_trsl = clr_trsl;
    }
    
    public void setColorAya(final int n) {
        this.setClr_aya(n);
        final Iterator iterator = this.quranEntities.iterator();
        while (iterator.hasNext()) {
            ((QuranEntity)iterator.next()).setColor(n);
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.setColor(n);
        }
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        if (bismilahEntity != null && bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.setColor(n);
        }
        this.invalidate();
    }
    
    public void setColorIpad(int color_line_bg) {
        this.setColor_gradient(null);
        this.paintIpad.setShader((Shader)null);
        this.color_ipad = color_line_bg;
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final float n = 0.4f;
        if (mIpadType == ordinal) {
            this.color_bg_type_classic = ColorUtils.lightenColor(color_line_bg, n);
            this.paintIpad.setColor(ColorUtils.darkenColor(color_line_bg, 0.2f));
        }
        else {
            this.paintIpad.setColor(color_line_bg);
        }
        if (this.mIpadType == IpadType.BORDER.ordinal()) {
            this.color_line_bg = ColorUtils.darkenColor(color_line_bg, n);
            this.paintLecture.setColor(color_line_bg);
        }
        else {
            final int mIpadType2 = this.mIpadType;
            final int ordinal2 = IpadType.BLUE_TYPE.ordinal();
            final float n2 = 0.7f;
            if (mIpadType2 == ordinal2) {
                final Paint paintLecture = this.paintLecture;
                color_line_bg = ColorUtils.convertToEnergyColor(color_line_bg);
                paintLecture.setColor(color_line_bg);
                color_line_bg = ColorUtils.darkenColor(this.paintLecture.getColor(), n2);
                this.color_line_bg = color_line_bg;
            }
            else {
                final int mIpadType3 = this.mIpadType;
                final int ordinal3 = IpadType.CASSET.ordinal();
                final int n3 = -1;
                final int n4 = -16777216;
                if (mIpadType3 != ordinal3 && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
                    color_line_bg = ColorUtils.darkenColor(color_line_bg, n);
                    this.color_line_bg = color_line_bg;
                    this.paintIpad.setAlpha(190);
                    color_line_bg = (ColorUtils.isColorDark(this.paintIpad.getColor()) ? 1 : 0);
                    if (color_line_bg != 0) {
                        this.paintLecture.setColor(n3);
                    }
                    else {
                        this.paintLecture.setColor(n4);
                    }
                }
                else {
                    final ColorSchemeGenerator$Scheme generateScheme = ColorSchemeGenerator.generateScheme(color_line_bg);
                    this.scheme = generateScheme;
                    color_line_bg = (ColorUtils.isColorDark(generateScheme.label) ? 1 : 0);
                    if (color_line_bg != 0) {
                        this.paintLecture.setColor(n3);
                    }
                    else {
                        this.paintLecture.setColor(n4);
                    }
                    color_line_bg = ColorUtils.darkenColor(this.paintLecture.getColor(), n2);
                    this.color_line_bg = color_line_bg;
                }
            }
        }
        this.paintText.setColor(this.paintLecture.getColor());
    }
    
    public void setColorIpad(final Gradient color_gradient) {
        this.setColor_gradient(color_gradient);
        final int color = color_gradient.getColor();
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final int n = 3;
        final float n2 = 0.4f;
        if (mIpadType == ordinal) {
            this.paintIpad.setShader((Shader)null);
            final RectF ipad_rect = this.ipad_rect;
            final float n3 = (float)color_gradient.getAngle();
            final int[] array = { ColorUtils.lightenColor(color_gradient.getColor(), n2), ColorUtils.lightenColor(color_gradient.getSecond(), n2), ColorUtils.lightenColor(color_gradient.getThree(), n2) };
            final float[] array3;
            final float[] array2 = array3 = new float[n];
            array3[0] = 0.0f;
            array3[1] = 0.7f;
            array3[2] = 1.0f;
            this.linearGradient_classic = CreateGradient.createLinearGradientWithAngle(ipad_rect, n3, array, array2);
            this.paintIpad.setColor(ColorUtils.darkenColor(color_gradient.getSecond(), 0.2f));
        }
        else {
            final RectF ipad_rect2 = this.ipad_rect;
            final float n4 = (float)color_gradient.getAngle();
            final int[] array4 = { color_gradient.getColor(), color_gradient.getSecond(), color_gradient.getThree() };
            final float[] array6;
            final float[] array5 = array6 = new float[n];
            array6[0] = 0.0f;
            array6[1] = 0.7f;
            array6[2] = 1.0f;
            final LinearGradient linearGradientWithAngle = CreateGradient.createLinearGradientWithAngle(ipad_rect2, n4, array4, array5);
            this.linearGradient_classic = linearGradientWithAngle;
            this.paintIpad.setShader((Shader)linearGradientWithAngle);
            this.paintIpad.setColor(color);
        }
        this.color_line_bg = ColorUtils.darkenColor(color, n2);
        if (this.mIpadType == IpadType.BORDER.ordinal()) {
            this.paintLecture.setColor(color);
        }
        else if (this.mIpadType == IpadType.BLUE_TYPE.ordinal()) {
            this.paintLecture.setColor(ColorUtils.lightenColor(color, 0.7f));
        }
        else {
            final int mIpadType2 = this.mIpadType;
            final int ordinal2 = IpadType.CASSET.ordinal();
            final int n5 = -1;
            final int n6 = -16777216;
            if (mIpadType2 != ordinal2 && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
                this.paintIpad.setAlpha(190);
                if (ColorUtils.isColorDark(this.paintIpad.getColor())) {
                    this.paintLecture.setColor(n5);
                }
                else {
                    this.paintLecture.setColor(n6);
                }
            }
            else {
                final ColorSchemeGenerator$Scheme generateScheme = ColorSchemeGenerator.generateScheme(color, (float)color_gradient.getAngle());
                this.scheme = generateScheme;
                if (ColorUtils.isColorDark(generateScheme.label)) {
                    this.paintLecture.setColor(n5);
                }
                else {
                    this.paintLecture.setColor(n6);
                }
            }
        }
        this.paintText.setColor(this.paintLecture.getColor());
    }
    
    public void setColorTrsl(final int n) {
        this.setClr_trsl(n);
        final Iterator iterator = this.translationEntities.iterator();
        while (iterator.hasNext()) {
            ((TranslationQuranEntity)iterator.next()).setColor(n);
        }
        this.invalidate();
    }
    
    public void setColor_gradient(final Gradient color_gradient) {
        this.color_gradient = color_gradient;
    }
    
    public void setCurrentTime(String string, final String str) {
        this.currentTime = string;
        string = "-" + str;
        this.remainingTime = string;
    }
    
    public void setDrawingSquareVideo(final boolean isDrawingSquareVideo) {
        this.isDrawingSquareVideo = isDrawingSquareVideo;
    }
    
    public void setEntity_select(final EntityView entity_select) {
        if (this.entity_select != entity_select) {
            this.selectTool.reset();
        }
        this.entity_select = entity_select;
    }
    
    public void setGlass(final boolean isGlass) {
        this.isGlass = isGlass;
    }
    
    public void setIcon(final String s, final VectorDrawable vectorDrawable) {
        for (final QuranEntity quranEntity : this.quranEntities) {
            if (quranEntity.getIcon() != null && !quranEntity.getIcon().equals(s)) {
                if (quranEntity.getNumber() == -1) {
                    continue;
                }
                quranEntity.setVectorDrawable(vectorDrawable);
                quranEntity.setIcon(s);
                quranEntity.updateIconDraw();
            }
        }
        this.updateSizeAya();
        this.invalidate();
    }
    
    public void setIpad_rect(final RectF ipad_rect) {
        this.ipad_rect = ipad_rect;
    }
    
    public void setNotDraw(final boolean isNotDraw) {
        this.isNotDraw = isNotDraw;
    }
    
    public void setPlaying(final boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
    
    public void setPreset(final AyaTextPreset preset) {
        final Iterator iterator = this.quranEntities.iterator();
        while (iterator.hasNext()) {
            ((QuranEntity)iterator.next()).setPreset(preset);
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.setPreset(preset);
        }
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        if (bismilahEntity != null && bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.setPreset(preset);
        }
        this.invalidate();
    }
    
    public void setPro(final boolean isPro) {
        this.isPro = isPro;
    }
    
    public void setProgress(final float progress) {
        this.progress = progress;
        this.postInvalidate();
    }
    
    public void setRadius_square(final int radius_square) {
        this.radius_square = radius_square;
    }
    
    public void setRectSquare(final Rect rectSquare) {
        this.rectSquare = rectSquare;
    }
    
    public void setRemoveWattermark(final boolean isRemoveWattermark) {
        this.isRemoveWattermark = isRemoveWattermark;
    }
    
    public void setResizetype(final int mResizetype) {
        this.mResizetype = mResizetype;
    }
    
    public void setSurahNameEntity(final String s, final String s2, final RectF rectFSurahName, final float n, final String str, final int n2, final int n3, final int n4, final int index_surah, final boolean b, final int n5) {
        String s3;
        if (s2 == null) {
            s3 = " ";
        }
        else {
            s3 = s2;
        }
        Layout$Alignment layout$Alignment;
        if (this.mIpadType != IpadType.IPAD_NEOMORPHIC.ordinal() && this.mIpadType != IpadType.CASSET.ordinal() && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
            final boolean probablyLArabic = Utils.isProbablyLArabic(s3);
            final float n6 = 0.07f;
            final float n7 = 0.05f;
            final float n8 = 0.5f;
            final float n9 = 0.015f;
            if (!probablyLArabic) {
                layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                if (n4 != SurahNameStyle.ZAGHRAFAT.ordinal()) {
                    if (this.mIpadType != IpadType.IPAD.ordinal() && this.mIpadType != IpadType.IPAD_UNBLUR.ordinal() && this.mIpadType != IpadType.IPAD_CLASSIC.ordinal()) {
                        float n11 = 0.0f;
                        Label_0543: {
                            float n10;
                            if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
                                n10 = this.ipad_rect.width();
                            }
                            else {
                                if (this.mIpadType != IpadType.BLACK_LAYER.ordinal() && this.mIpadType != IpadType.BLUE_TYPE.ordinal() && this.mIpadType != IpadType.GRADIENT.ordinal() && this.mIpadType != IpadType.MASK_BRUSH.ordinal() && this.mIpadType != IpadType.HEART.ordinal() && this.mIpadType != IpadType.BATTERY.ordinal()) {
                                    n11 = n6 * this.ipad_rect.width();
                                    break Label_0543;
                                }
                                n10 = this.ipad_rect.width();
                            }
                            n11 = n10 * n9;
                        }
                        final float width = this.rectFSurahName.width();
                        this.rectFSurahName.left = n11 + this.ipad_rect.left;
                        final RectF rectFSurahName2 = this.rectFSurahName;
                        rectFSurahName2.right = rectFSurahName2.left + width;
                    }
                    else {
                        final float width2 = this.rectFSurahName.width();
                        this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n8;
                        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
                            this.rectFSurahName.left = this.left_square;
                        }
                        else {
                            this.rectFSurahName.left = this.ipad_rect.width() * n7 + this.left_square;
                        }
                        final RectF rectFSurahName3 = this.rectFSurahName;
                        rectFSurahName3.right = rectFSurahName3.left + width2;
                    }
                }
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                if (n4 != SurahNameStyle.ZAGHRAFAT.ordinal()) {
                    if (this.mIpadType != IpadType.IPAD.ordinal() && this.mIpadType != IpadType.IPAD_UNBLUR.ordinal() && this.mIpadType != IpadType.IPAD_CLASSIC.ordinal()) {
                        float n13 = 0.0f;
                        Label_1156: {
                            float n12;
                            if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
                                n12 = this.ipad_rect.width();
                            }
                            else {
                                if (this.mIpadType != IpadType.BLACK_LAYER.ordinal() && this.mIpadType != IpadType.BLUE_TYPE.ordinal() && this.mIpadType != IpadType.GRADIENT.ordinal() && this.mIpadType != IpadType.MASK_BRUSH.ordinal() && this.mIpadType != IpadType.HEART.ordinal() && this.mIpadType != IpadType.BATTERY.ordinal()) {
                                    n13 = n6 * this.ipad_rect.width();
                                    break Label_1156;
                                }
                                n12 = this.ipad_rect.width();
                            }
                            n13 = n12 * n9;
                        }
                        final float width3 = this.rectFSurahName.width();
                        this.rectFSurahName.right = this.ipad_rect.right - n13;
                        final RectF rectFSurahName4 = this.rectFSurahName;
                        rectFSurahName4.left = rectFSurahName4.right - width3;
                    }
                    else {
                        final float width4 = this.rectFSurahName.width();
                        this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n8;
                        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
                            this.rectFSurahName.right = this.left_square + this.bitmapSquare.getWidth();
                        }
                        else {
                            this.rectFSurahName.right = this.left_square + this.bitmapSquare.getWidth() - this.ipad_rect.width() * n7;
                        }
                        final RectF rectFSurahName5 = this.rectFSurahName;
                        rectFSurahName5.left = rectFSurahName5.right - width4;
                    }
                }
            }
        }
        else {
            layout$Alignment = Layout$Alignment.ALIGN_CENTER;
        }
        final Layout$Alignment layout$Alignment2 = layout$Alignment;
        final SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity == null) {
            final Typeface loadFontFromAsset = UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/arabic/" + str);
            final Typeface loadFontFromAsset2 = UtilsFileLast.loadFontFromAsset(this.getContext(), "fonts/surah_name.otf");
            int n14;
            if (n2 == 0) {
                int color = this.paintLecture.getColor();
                if (this.getmIpadType() == IpadType.CASSET.ordinal() || this.getmIpadType() == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
                    if (ColorUtils.isColorDark(this.scheme.body)) {
                        color = -1;
                    }
                    else {
                        color = -16777216;
                    }
                }
                n14 = color;
            }
            else {
                n14 = n2;
            }
            if (rectFSurahName != null) {
                this.rectFSurahName = rectFSurahName;
            }
            (this.surahNameEntity = new SurahNameEntity(layout$Alignment2, s, s3, this.rectFSurahName, loadFontFromAsset, n14, n, str, n3, loadFontFromAsset2, n4, index_surah, this.mIpadType, b, n5)).setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
            if (rectFSurahName != null) {
                this.surahNameEntity.move();
            }
        }
        else {
            surahNameEntity.setIndex_surah(index_surah);
            this.surahNameEntity.setRect(this.rectFSurahName);
            this.surahNameEntity.setNameAndReader(layout$Alignment2, s, s3);
        }
    }
    
    public void setTrslPreset(final AyaTextPreset preset) {
        final Iterator iterator = this.translationEntities.iterator();
        while (iterator.hasNext()) {
            ((TranslationQuranEntity)iterator.next()).setPreset(preset);
        }
        this.invalidate();
    }
    
    public void setTypeface(final Typeface typeface, final String s) {
        final EntityView entity_select = this.entity_select;
        if (entity_select instanceof QuranEntity) {
            for (final QuranEntity quranEntity : this.quranEntities) {
                if (quranEntity.getNameFont() != null) {
                    if (quranEntity.getNameFont().equals(s)) {
                        continue;
                    }
                    quranEntity.setTypeface(typeface, s);
                }
            }
            this.updateSizeAyaResize();
        }
        else if (entity_select instanceof TranslationQuranEntity) {
            for (final TranslationQuranEntity translationQuranEntity : this.translationEntities) {
                if (translationQuranEntity.getNameFont() != null) {
                    if (translationQuranEntity.getNameFont().equals(s)) {
                        continue;
                    }
                    translationQuranEntity.setTypeface(typeface, s);
                }
            }
            this.updateSizeTrslAyaResize();
        }
        this.invalidate();
    }
    
    public void setVideo(final boolean isVideo) {
        this.isVideo = isVideo;
    }
    
    public void setiViewCallback(final BlurredImageView$IViewCallback iViewCallback) {
        this.iViewCallback = iViewCallback;
    }
    
    public void setmIpadType(final int mIpadType) {
        this.mIpadType = mIpadType;
    }
    
    public String setupBitmapDraw(final Bitmap bitmapBlured, final Bitmap bitmapSquare, final Template template) {
        this.frameInterval = 1000 / template.getFps();
        this.bitmapBlured = bitmapBlured;
        this.bitmapSquare = bitmapSquare;
        final SurahNameEntity surahNameEntity = this.surahNameEntity;
        if (surahNameEntity != null) {
            surahNameEntity.setCopyRect();
        }
        this.createRect();
        final String string = "bg_" + System.currentTimeMillis() + ".png";
        final File file = new File(template.getFolder_template());
        final Bitmap bitmapDraw = this.getBitmapDraw(template.isVideoSquare(), file);
        FontUtils.copyFontToInternalStorage(this.getContext(), "NotoNaskhArabic.ttf");
        float n = this.linePaint.getStrokeWidth() * 4.2f;
        final int ipad_type = template.getIpad_type();
        final int ordinal = IpadType.BLACK_LAYER.ordinal();
        float startShape = 0.0f;
        if (ipad_type == ordinal || template.getIpad_type() == IpadType.BLUE_TYPE.ordinal() || template.getIpad_type() == IpadType.GRADIENT.ordinal() || template.getIpad_type() == IpadType.MASK_BRUSH.ordinal() || template.getIpad_type() == IpadType.HEART.ordinal() || this.mIpadType == IpadType.BATTERY.ordinal()) {
            n = 0.0f;
        }
        final int ipad_type2 = template.getIpad_type();
        final int ordinal2 = IpadType.BLUE_TYPE.ordinal();
        int widthShape = 0;
        int intValue = 0;
        Label_0734: {
            Label_0679: {
                if (ipad_type2 == ordinal2) {
                    this.saveProgressBitmapTypeBlue(file);
                }
                else if (template.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                    this.saveProgressBitmapTypeIPAD_NEOMORPHIC(file, bitmapDraw);
                }
                else {
                    if (template.getIpad_type() == IpadType.HEART.ordinal()) {
                        final Pair saveProgressBitmapTypeHeart = this.saveProgressBitmapTypeHeart(file, bitmapDraw);
                        startShape = (float)saveProgressBitmapTypeHeart.first;
                        intValue = (int)saveProgressBitmapTypeHeart.second;
                        break Label_0734;
                    }
                    int y;
                    int x;
                    if (this.mIpadType == IpadType.BATTERY.ordinal()) {
                        final Pair saveProgressBitmapTypeBattery = this.saveProgressBitmapTypeBattery(file, bitmapDraw);
                        startShape = (float)saveProgressBitmapTypeBattery.first;
                        y = ((Point)saveProgressBitmapTypeBattery.second).y;
                        x = ((Point)saveProgressBitmapTypeBattery.second).x;
                    }
                    else {
                        if (this.mIpadType != IpadType.CASSET.ordinal() && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
                            this.saveProgressBitmap(file, n);
                            break Label_0679;
                        }
                        startShape = this.rectFProgress.left;
                        y = (int)this.rectFProgress.top;
                        x = (int)this.rectFProgress.right;
                    }
                    final int n2 = y;
                    widthShape = x;
                    intValue = n2;
                    break Label_0734;
                }
            }
            intValue = 0;
        }
        this.drawEntityBitmap(file, bitmapDraw.getWidth(), bitmapDraw.getHeight());
        this.saveBg(string, bitmapDraw, file);
        TimeModel getmTimeModel = template.getmTimeModel();
        final int round = Math.round(n * 1.98f);
        String color = "white";
        final String s = "black";
        final float n3 = 0.96f;
        final float n4 = 1.5f;
        final int n5 = -1;
        if (getmTimeModel == null) {
            getmTimeModel = new(hazem.nurmontage.videoquran.model.TimeModel.class)();
            final int n6 = (int)this.rectFProgress.width();
            final int n7 = (int)(this.rectFProgress.height() * n4);
            final float n8 = this.paintText.getTextSize() * n3;
            if (this.paintText.getColor() != n5) {
                color = s;
            }
            new TimeModel(n6, n7, n8, color, this.txt_y, this.newLeft_txt, round);
        }
        else {
            if (this.paintText.getColor() != n5) {
                color = s;
            }
            getmTimeModel.setColor(color);
            getmTimeModel.setPosXRight(this.newLeft_txt);
            getmTimeModel.setPosY(this.txt_y);
            getmTimeModel.setHeight_bitmap_progress((int)(this.rectFProgress.height() * n4));
            getmTimeModel.setWidth_bitmap_progress((int)this.rectFProgress.width());
            getmTimeModel.setSize(this.paintText.getTextSize() * n3);
            getmTimeModel.setProgress_offset(round);
        }
        getmTimeModel.setStartShape(startShape);
        getmTimeModel.setWidthShape(widthShape);
        getmTimeModel.setHeightShape(intValue);
        template.setmTimeModel(getmTimeModel);
        return file.getAbsolutePath() + "/" + string;
    }
    
    public Layout$Alignment updateAlignmentSurah(final String s) {
        Layout$Alignment layout$Alignment;
        if (this.mIpadType != IpadType.IPAD_NEOMORPHIC.ordinal() && this.mIpadType != IpadType.CASSET.ordinal() && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
            if (!Utils.isProbablyLArabic(s)) {
                layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
        }
        else {
            layout$Alignment = Layout$Alignment.ALIGN_CENTER;
        }
        return layout$Alignment;
    }
    
    public void updateBismilahEntity(final int n, int getmPreset) {
        final BismilahEntity bismilahEntity = this.bismilahEntity;
        final float n2 = 0.85f;
        if (bismilahEntity != null && bismilahEntity.getBismilahTimeline().visible()) {
            this.bismilahEntity.setCopyRect();
            final float left = this.bismilahEntity.getCopyRect().left;
            final float n3 = (float)n;
            final float n4 = left * n3;
            final float top = this.bismilahEntity.getCopyRect().top;
            final float n5 = (float)getmPreset;
            final RectF rectF = new RectF(n4, top * n5, this.bismilahEntity.getCopyRect().right * n3, this.bismilahEntity.getCopyRect().bottom * n5);
            this.bismilahEntity.update(rectF, (int)(rectF.width() * n2), (int)(rectF.height() * n2));
            final BismilahEntity bismilahEntity2 = this.bismilahEntity;
            bismilahEntity2.setupScaleSave(bismilahEntity2.getFactorSize(), n);
            final BismilahEntity bismilahEntity3 = this.bismilahEntity;
            bismilahEntity3.initPreset(bismilahEntity3.getmPreset());
        }
        final BismilahEntity mIsti3adhaEntity = this.mIsti3adhaEntity;
        if (mIsti3adhaEntity != null && mIsti3adhaEntity.getBismilahTimeline().visible()) {
            this.mIsti3adhaEntity.setCopyRect();
            final float left2 = this.mIsti3adhaEntity.getCopyRect().left;
            final float n6 = (float)n;
            final float n7 = left2 * n6;
            final float top2 = this.mIsti3adhaEntity.getCopyRect().top;
            final float n8 = (float)getmPreset;
            final RectF rectF2 = new RectF(n7, top2 * n8, this.mIsti3adhaEntity.getCopyRect().right * n6, this.mIsti3adhaEntity.getCopyRect().bottom * n8);
            this.mIsti3adhaEntity.update(rectF2, (int)(rectF2.width() * n2), (int)(rectF2.height() * n2));
            final BismilahEntity mIsti3adhaEntity2 = this.mIsti3adhaEntity;
            mIsti3adhaEntity2.setupScaleSave(mIsti3adhaEntity2.getFactorSize(), n);
            final BismilahEntity mIsti3adhaEntity3 = this.mIsti3adhaEntity;
            getmPreset = mIsti3adhaEntity3.getmPreset();
            mIsti3adhaEntity3.initPreset(getmPreset);
        }
    }
    
    public void updateBitmap(final Bitmap bitmapBlured, final Bitmap bitmapSquare, int colorIpad, final int mIpadType, final int mResizetype, final Rect rectSquare) {
        this.bitmapBlured = bitmapBlured;
        if (bitmapSquare != null) {
            this.bitmapSquare = bitmapSquare;
        }
        this.rectSquare = rectSquare;
        this.mIpadType = mIpadType;
        if (colorIpad != -1) {
            this.setColorIpad(colorIpad);
        }
        else if (bitmapSquare != null) {
            this.setColorIpad(ColorUtils.getAverageColor(bitmapSquare));
        }
        this.mResizetype = mResizetype;
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            final TextPaint paintText = this.paintText;
            final float min = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            colorIpad = 1032805417;
            paintText.setTextSize(min * 0.07f);
        }
        else if (this.mIpadType == IpadType.BORDER.ordinal()) {
            final TextPaint paintText2 = this.paintText;
            final float min2 = Math.min(this.ipad_rect.width(), this.ipad_rect.height());
            colorIpad = 1021128475;
            paintText2.setTextSize(min2 * 0.027f);
        }
        else {
            final TextPaint paintText3 = this.paintText;
            final float width = this.ipad_rect.width();
            colorIpad = 1025436864;
            paintText3.setTextSize(width * 0.0388f);
        }
    }
    
    public void updateBitmap(final Bitmap bitmapBlured, final Bitmap bitmapSquare, final Gradient colorIpad, final int mIpadType, final int mResizetype, final Rect rectSquare) {
        this.bitmapBlured = bitmapBlured;
        if (bitmapSquare != null) {
            this.bitmapSquare = bitmapSquare;
        }
        this.rectSquare = rectSquare;
        this.mIpadType = mIpadType;
        this.setColorIpad(colorIpad);
        this.mResizetype = mResizetype;
        if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.07f);
        }
        else if (this.mIpadType == IpadType.BORDER.ordinal()) {
            this.paintText.setTextSize(Math.min(this.ipad_rect.width(), this.ipad_rect.height()) * 0.027f);
        }
        else {
            this.paintText.setTextSize(this.ipad_rect.width() * 0.0388f);
        }
    }
    
    public void updateIpad() {
        final int mIpadType = this.mIpadType;
        final int ordinal = IpadType.IPAD_CLASSIC.ordinal();
        final float n = 0.56f;
        final float n2 = 0.7601563f;
        final float n3 = 0.5f;
        if (mIpadType == ordinal) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n4 = this.bitmapBlured.getHeight() * n2;
                final float n5 = this.btmY + this.bitmapBlured.getHeight() * n3 - n4 * n3;
                final float n6 = n4 * n;
                final float n7 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n6 * n3);
                this.ipad_rect = new RectF(n7, n5, n6 + n7, n4 + n5);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n8 = this.bitmapBlured.getHeight() * n2;
                final float n9 = this.btmY + this.bitmapBlured.getHeight() * n3 - n8 * n3;
                final float n10 = n8 * n;
                final float n11 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n10 * n3);
                this.ipad_rect = new RectF(n11, n9, n10 + n11, n8 + n9);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n12 = this.bitmapBlured.getHeight() * n2;
                final float n13 = this.btmY + this.bitmapBlured.getHeight() * n3 - n12 * n3;
                final float n14 = n12 * n;
                final float n15 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n14 * n3);
                this.ipad_rect = new RectF(n15, n13, n14 + n15, n12 + n13);
            }
        }
        if (this.mIpadType == IpadType.IPAD_NEOMORPHIC.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n16 = this.bitmapBlured.getHeight() * n2;
                final float n17 = this.btmY + this.bitmapBlured.getHeight() * n3 - n16 * n3;
                final float n18 = n16 * n;
                final float n19 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n18 * n3);
                this.ipad_rect = new RectF(n19, n17, n18 + n19, n16 + n17);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n20 = this.bitmapBlured.getHeight() * n2;
                final float n21 = this.btmY + this.bitmapBlured.getHeight() * n3 - n20 * n3;
                final float n22 = n20 * n;
                final float n23 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n22 * n3);
                this.ipad_rect = new RectF(n23, n21, n22 + n23, n20 + n21);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n24 = this.bitmapBlured.getHeight() * n2;
                final float n25 = this.btmY + this.bitmapBlured.getHeight() * n3 - n24 * n3;
                final float n26 = n24 * n;
                final float n27 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n26 * n3);
                this.ipad_rect = new RectF(n27, n25, n26 + n27, n24 + n25);
            }
        }
        if (this.mIpadType == IpadType.IPAD.ordinal() || this.mIpadType == IpadType.IPAD_UNBLUR.ordinal()) {
            if (this.mResizetype == ResizeType.SOCIAL_STORY.ordinal()) {
                final float n28 = this.bitmapBlured.getHeight() * n2;
                final float n29 = this.btmY + this.bitmapBlured.getHeight() * n3 - n28 * n3;
                final float n30 = n28 * n;
                final float n31 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n30 * n3);
                this.ipad_rect = new RectF(n31, n29, n30 + n31, n28 + n29);
            }
            if (this.mResizetype == ResizeType.SQUARE.ordinal()) {
                final float n32 = this.bitmapBlured.getHeight() * n2;
                final float n33 = this.btmY + this.bitmapBlured.getHeight() * n3 - n32 * n3;
                final float n34 = n32 * n;
                final float n35 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n34 * n3);
                this.ipad_rect = new RectF(n35, n33, n34 + n35, n32 + n33);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n36 = this.bitmapBlured.getHeight() * n2;
                final float n37 = this.btmY + this.bitmapBlured.getHeight() * n3 - n36 * n3;
                final float n38 = n * n36;
                final float n39 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n38 * n3);
                this.ipad_rect = new RectF(n39, n37, n38 + n39, n36 + n37);
            }
        }
        final int mIpadType2 = this.mIpadType;
        final int ordinal2 = IpadType.BOTTOM_RECT.ordinal();
        final float n40 = 0.2f;
        if (mIpadType2 == ordinal2) {
            final int mResizetype = this.mResizetype;
            final int ordinal3 = ResizeType.SOCIAL_STORY.ordinal();
            final float n41 = 0.88f;
            if (mResizetype == ordinal3) {
                final float n42 = this.bitmapBlured.getHeight() * n40;
                final float n43 = this.btmY + (this.bitmapBlured.getHeight() * n41 - n42);
                final float n44 = this.bitmapBlured.getWidth() * 0.75f;
                final float n45 = this.btmX + (this.bitmapBlured.getWidth() - n44) * n3;
                this.ipad_rect = new RectF(n45, n43, n44 + n45, n42 + n43);
            }
            final int mResizetype2 = this.mResizetype;
            final int ordinal4 = ResizeType.SQUARE.ordinal();
            final float n46 = 0.7f;
            final float n47 = 0.25f;
            if (mResizetype2 == ordinal4) {
                final float n48 = this.bitmapBlured.getHeight() * n47;
                final float n49 = this.btmY + (this.bitmapBlured.getHeight() * n41 - n48);
                final float n50 = this.bitmapBlured.getWidth() * n46;
                final float n51 = this.btmX + (this.bitmapBlured.getWidth() - n50) * n3;
                this.ipad_rect = new RectF(n51, n49, n50 + n51, n48 + n49);
            }
            if (this.mResizetype == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                final float n52 = this.bitmapBlured.getHeight() * n47;
                final float n53 = this.btmY + (this.bitmapBlured.getHeight() * n41 - n52);
                final float n54 = this.bitmapBlured.getWidth() * n46;
                final float n55 = this.btmX + (this.bitmapBlured.getWidth() - n54) * n3;
                this.ipad_rect = new RectF(n55, n53, n54 + n55, n52 + n53);
            }
        }
        final int mIpadType3 = this.mIpadType;
        final int ordinal5 = IpadType.ROUND_RECT.ordinal();
        final float n56 = 0.45f;
        if (mIpadType3 == ordinal5) {
            final float n57 = Math.min(this.bitmapBlured.getWidth(), this.bitmapBlured.getHeight()) * n56;
            final float n58 = this.btmY + this.bitmapBlured.getHeight() * n3;
            final float n59 = n57 * n3;
            final float n60 = n58 - n59;
            final float n61 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n59);
            this.ipad_rect = new RectF(n61, n60, n61 + n57, n57 + n60);
        }
        if (this.mIpadType == IpadType.CASSET.ordinal() || this.mIpadType == IpadType.CASSET_IMG.ordinal() || this.mIpadType == IpadType.CASSET_IMG_BLUR.ordinal()) {
            final float n62 = (float)Math.min(this.bitmapBlured.getWidth(), this.bitmapBlured.getHeight());
            final float n63 = n56 * n62;
            final float n64 = this.btmY + this.bitmapBlured.getHeight() * n3 - n63 * n3;
            final float n65 = n62 * 0.8f;
            final float n66 = this.btmX + (this.bitmapBlured.getWidth() * n3 - n3 * n65);
            this.ipad_rect = new RectF(n66, n64, n65 + n66, n63 + n64);
        }
        if (this.mIpadType == IpadType.RECT.ordinal()) {
            final float n67 = (float)Math.min(this.bitmapBlured.getWidth(), this.bitmapBlured.getHeight());
            final float n68 = 0.35f * n67;
            final float n69 = this.btmY + this.bitmapBlured.getHeight() * 0.3f;
            final float n70 = n67 * 0.4f;
            final float n71 = this.btmX + (this.bitmapBlured.getWidth() * 0.85f - n70);
            this.ipad_rect = new RectF(n71, n69, n70 + n71, n68 + n69);
        }
        final int mIpadType4 = this.mIpadType;
        final int ordinal6 = IpadType.BLACK_LAYER.ordinal();
        final float n72 = 2.0f;
        if (mIpadType4 == ordinal6 || this.mIpadType == IpadType.BLUE_TYPE.ordinal() || this.mIpadType == IpadType.HEART.ordinal() || this.mIpadType == IpadType.BATTERY.ordinal()) {
            final float btmX = this.btmX;
            this.ipad_rect = new RectF(btmX - n72, this.btmY, btmX + this.bitmapBlured.getWidth() + n72, this.btmY + this.bitmapBlured.getHeight());
        }
        if (this.mIpadType == IpadType.GRADIENT.ordinal()) {
            this.ipad_rect = new RectF(this.btmX - n72, this.btmY + this.bitmapBlured.getHeight() * n40, this.btmX + this.bitmapBlured.getWidth() + n72, this.btmY + this.bitmapBlured.getHeight());
        }
        if (this.mIpadType == IpadType.MASK_BRUSH.ordinal()) {
            final float btmX2 = this.btmX;
            this.ipad_rect = new RectF(btmX2, this.btmY, this.bitmapBlured.getWidth() + btmX2, this.btmY + this.bitmapBlured.getHeight());
        }
        if (this.mIpadType == IpadType.BORDER.ordinal()) {
            final int min = Math.min(this.bitmapBlured.getWidth(), this.bitmapBlured.getHeight());
            final float n73 = this.bitmapBlured.getHeight() * Common.p_h_border;
            final float n74 = this.bitmapBlured.getWidth() * Common.p_w_border;
            final float n75 = this.btmY + n73;
            final float btmX3 = this.btmX;
            this.ipad_rect = new RectF(btmX3 + n74, n75, btmX3 + this.bitmapBlured.getWidth() - n74, this.btmY + this.bitmapBlured.getHeight() - n73);
            this.paintIpad.setStyle(Paint$Style.STROKE);
            this.paintIpad.setStrokeWidth(min * 0.013f);
        }
        else {
            this.paintIpad.setStyle(Paint$Style.FILL);
        }
    }
    
    public void updateIpad(final Bitmap bitmapNotBlur, int n, int b) {
        this.mResizetype = b;
        this.bitmapNotBlur = bitmapNotBlur;
        this.mIpadType = n;
        b = IpadType.IPAD_CLASSIC.ordinal();
        final float n2 = 0.56f;
        final float n3 = 0.7601563f;
        final float n4 = 0.5f;
        if (n == b) {
            b = this.mResizetype;
            if (b == ResizeType.SOCIAL_STORY.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n5 = b * n3;
                final float n6 = this.btmY + (bitmapNotBlur.getHeight() - n5) * n4;
                final float n7 = n5 * n2;
                final float n8 = this.btmX + (bitmapNotBlur.getWidth() - n7) * n4;
                this.ipad_rect = new RectF(n8, n6, n7 + n8, n5 + n6);
            }
            b = this.mResizetype;
            if (b == ResizeType.SQUARE.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n9 = b * n3;
                final float n10 = this.btmY + bitmapNotBlur.getHeight() * n4 - n9 * n4;
                final float n11 = n9 * n2;
                final float n12 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n11 * n4);
                this.ipad_rect = new RectF(n12, n10, n11 + n12, n9 + n10);
            }
            b = this.mResizetype;
            if (b == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n13 = b * n3;
                final float n14 = this.btmY + bitmapNotBlur.getHeight() * n4 - n13 * n4;
                final float n15 = n13 * n2;
                final float n16 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n15 * n4);
                this.ipad_rect = new RectF(n16, n14, n15 + n16, n13 + n14);
            }
        }
        b = IpadType.IPAD_NEOMORPHIC.ordinal();
        if (n == b) {
            b = this.mResizetype;
            if (b == ResizeType.SOCIAL_STORY.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n17 = b * n3;
                final float n18 = this.btmY + (bitmapNotBlur.getHeight() - n17) * n4;
                final float n19 = n17 * n2;
                final float n20 = this.btmX + (bitmapNotBlur.getWidth() - n19) * n4;
                this.ipad_rect = new RectF(n20, n18, n19 + n20, n17 + n18);
            }
            b = this.mResizetype;
            if (b == ResizeType.SQUARE.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n21 = b * n3;
                final float n22 = this.btmY + bitmapNotBlur.getHeight() * n4 - n21 * n4;
                final float n23 = n21 * n2;
                final float n24 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n23 * n4);
                this.ipad_rect = new RectF(n24, n22, n23 + n24, n21 + n22);
            }
            b = this.mResizetype;
            if (b == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n25 = b * n3;
                final float n26 = this.btmY + bitmapNotBlur.getHeight() * n4 - n25 * n4;
                final float n27 = n25 * n2;
                final float n28 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n27 * n4);
                this.ipad_rect = new RectF(n28, n26, n27 + n28, n25 + n26);
            }
        }
        b = IpadType.CASSET.ordinal();
        final float n29 = 0.45f;
        Label_1221: {
            if (n != b) {
                b = IpadType.CASSET_IMG.ordinal();
                if (n != b) {
                    b = IpadType.CASSET_IMG_BLUR.ordinal();
                    if (n != b) {
                        break Label_1221;
                    }
                }
            }
            b = bitmapNotBlur.getWidth();
            b = Math.min(b, bitmapNotBlur.getHeight());
            final float n30 = (float)b;
            final float n31 = n30 * n29;
            final float n32 = this.btmY + bitmapNotBlur.getHeight() * n4 - n31 * n4;
            final float n33 = n30 * 0.8f;
            final float n34 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n33 * n4);
            this.ipad_rect = new RectF(n34, n32, n33 + n34, n31 + n32);
        }
        b = IpadType.IPAD.ordinal();
        Label_1717: {
            if (n != b) {
                b = IpadType.IPAD_UNBLUR.ordinal();
                if (n != b) {
                    break Label_1717;
                }
            }
            b = this.mResizetype;
            if (b == ResizeType.SOCIAL_STORY.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n35 = b * n3;
                final float n36 = this.btmY + (bitmapNotBlur.getHeight() - n35) * n4;
                final float n37 = n35 * n2;
                final float n38 = this.btmX + (bitmapNotBlur.getWidth() - n37) * n4;
                this.ipad_rect = new RectF(n38, n36, n37 + n38, n35 + n36);
            }
            b = this.mResizetype;
            if (b == ResizeType.SQUARE.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n39 = b * n3;
                final float n40 = this.btmY + bitmapNotBlur.getHeight() * n4 - n39 * n4;
                final float n41 = n39 * n2;
                final float n42 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n41 * n4);
                this.ipad_rect = new RectF(n42, n40, n41 + n42, n39 + n40);
            }
            b = this.mResizetype;
            if (b == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n43 = b * n3;
                final float n44 = this.btmY + bitmapNotBlur.getHeight() * n4 - n43 * n4;
                final float n45 = n2 * n43;
                final float n46 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n45 * n4);
                this.ipad_rect = new RectF(n46, n44, n45 + n46, n43 + n44);
            }
        }
        b = IpadType.BOTTOM_RECT.ordinal();
        final float n47 = 0.2f;
        if (n == b) {
            b = this.mResizetype;
            final int ordinal = ResizeType.SOCIAL_STORY.ordinal();
            final float n48 = 0.88f;
            if (b == ordinal) {
                b = bitmapNotBlur.getHeight();
                final float n49 = b * n47;
                final float n50 = this.btmY + (bitmapNotBlur.getHeight() * n48 - n49);
                final float n51 = bitmapNotBlur.getWidth() * 0.75f;
                final float n52 = this.btmX + (bitmapNotBlur.getWidth() - n51) * n4;
                this.ipad_rect = new RectF(n52, n50, n51 + n52, n49 + n50);
            }
            b = this.mResizetype;
            final int ordinal2 = ResizeType.SQUARE.ordinal();
            final float n53 = 0.7f;
            final float n54 = 0.25f;
            if (b == ordinal2) {
                b = bitmapNotBlur.getHeight();
                final float n55 = b * n54;
                final float n56 = this.btmY + (bitmapNotBlur.getHeight() * n48 - n55);
                final float n57 = bitmapNotBlur.getWidth() * n53;
                final float n58 = this.btmX + (bitmapNotBlur.getWidth() - n57) * n4;
                this.ipad_rect = new RectF(n58, n56, n57 + n58, n55 + n56);
            }
            b = this.mResizetype;
            if (b == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
                b = bitmapNotBlur.getHeight();
                final float n59 = b * n54;
                final float n60 = this.btmY + (bitmapNotBlur.getHeight() * n48 - n59);
                final float n61 = bitmapNotBlur.getWidth() * n53;
                final float n62 = this.btmX + (bitmapNotBlur.getWidth() - n61) * n4;
                this.ipad_rect = new RectF(n62, n60, n61 + n62, n59 + n60);
            }
        }
        b = IpadType.ROUND_RECT.ordinal();
        if (n == b) {
            b = bitmapNotBlur.getWidth();
            b = Math.min(b, bitmapNotBlur.getHeight());
            final float n63 = b * n29;
            final float n64 = this.btmY + bitmapNotBlur.getHeight() * n4;
            final float n65 = n63 * n4;
            final float n66 = n64 - n65;
            final float n67 = this.btmX + (bitmapNotBlur.getWidth() * n4 - n65);
            this.ipad_rect = new RectF(n67, n66, n67 + n63, n63 + n66);
        }
        b = IpadType.RECT.ordinal();
        if (n == b) {
            b = bitmapNotBlur.getWidth();
            b = Math.min(b, bitmapNotBlur.getHeight());
            final float n68 = (float)b;
            final float n69 = 0.35f * n68;
            final float n70 = this.btmY + bitmapNotBlur.getHeight() * 0.3f;
            final float n71 = n68 * 0.4f;
            final float n72 = this.btmX + (bitmapNotBlur.getWidth() * 0.85f - n71);
            this.ipad_rect = new RectF(n72, n70, n71 + n72, n69 + n70);
        }
        b = IpadType.BLACK_LAYER.ordinal();
        final float n73 = 2.0f;
        Label_2693: {
            if (n != b) {
                b = IpadType.BLUE_TYPE.ordinal();
                if (n != b) {
                    b = IpadType.HEART.ordinal();
                    if (n != b) {
                        b = IpadType.BATTERY.ordinal();
                        if (n != b) {
                            break Label_2693;
                        }
                    }
                }
            }
            final float btmX = this.btmX;
            this.ipad_rect = new RectF(btmX - n73, this.btmY, btmX + bitmapNotBlur.getWidth() + n73, this.btmY + bitmapNotBlur.getHeight());
        }
        b = IpadType.GRADIENT.ordinal();
        if (n == b) {
            this.ipad_rect = new RectF(this.btmX - n73, this.btmY + bitmapNotBlur.getHeight() * n47, this.btmX + bitmapNotBlur.getWidth() + n73, this.btmY + bitmapNotBlur.getHeight());
        }
        b = IpadType.MASK_BRUSH.ordinal();
        if (n == b) {
            final float btmX2 = this.btmX;
            this.ipad_rect = new RectF(btmX2, this.btmY, bitmapNotBlur.getWidth() + btmX2, this.btmY + bitmapNotBlur.getHeight());
        }
        b = IpadType.BORDER.ordinal();
        if (n == b) {
            n = bitmapNotBlur.getWidth();
            b = bitmapNotBlur.getHeight();
            n = Math.min(n, b);
            final float n74 = bitmapNotBlur.getHeight() * Common.p_h_border;
            final float n75 = bitmapNotBlur.getWidth() * Common.p_w_border;
            final float n76 = this.btmY + n74;
            final float btmX3 = this.btmX;
            this.ipad_rect = new RectF(btmX3 + n75, n76, btmX3 + bitmapNotBlur.getWidth() - n75, this.btmY + bitmapNotBlur.getHeight() - n74);
            this.paintIpad.setStyle(Paint$Style.STROKE);
            final Paint paintIpad = this.paintIpad;
            final float n77 = (float)n;
            b = 1012202996;
            paintIpad.setStrokeWidth(n77 * 0.013f);
        }
        else {
            this.paintIpad.setStyle(Paint$Style.FILL);
        }
    }
    
    public void updatePosCanvas(int height, final int n, final Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final float n2 = (float)(height - this.mCanvas_width);
        final float n3 = 2.0f;
        this.mDrawingTranslationX = n2 / n3;
        this.mDrawingTranslationY = (n - this.mCanvas_height) / n3;
        this.btmX = (height - bitmap.getWidth()) / n3 - this.mDrawingTranslationX;
        height = bitmap.getHeight();
        this.btmY = (n - height) / n3 - this.mDrawingTranslationY;
    }
    
    public void updatePosCanvas(final Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final float n = (float)(this.getWidth() - this.getPaddingStart() - this.getPaddingEnd());
        final float n2 = (float)(this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
        final float n3 = n - this.mCanvas_width;
        final float n4 = 2.0f;
        this.mDrawingTranslationX = n3 / n4;
        this.mDrawingTranslationY = (n2 - this.mCanvas_height) / n4;
        this.btmX = (n - bitmap.getWidth()) / n4 - this.mDrawingTranslationX;
        this.btmY = (n2 - bitmap.getHeight()) / n4 - this.mDrawingTranslationY;
    }
    
    public void updatePosSurahName() {
        if (this.surahNameEntity != null) {
            if (this.mIpadType != IpadType.IPAD_NEOMORPHIC.ordinal() && this.mIpadType != IpadType.CASSET.ordinal() && this.mIpadType != IpadType.CASSET_IMG.ordinal() && this.mIpadType != IpadType.CASSET_IMG_BLUR.ordinal()) {
                final boolean probablyLArabic = Utils.isProbablyLArabic(this.surahNameEntity.getReader());
                final float n = 0.07f;
                final float n2 = 0.05f;
                final float n3 = 0.5f;
                final float n4 = 0.015f;
                if (!probablyLArabic) {
                    if (this.mIpadType != IpadType.IPAD.ordinal() && this.mIpadType != IpadType.IPAD_UNBLUR.ordinal() && this.mIpadType != IpadType.IPAD_CLASSIC.ordinal()) {
                        float n6 = 0.0f;
                        Label_0441: {
                            float n5;
                            if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
                                n5 = this.ipad_rect.width();
                            }
                            else {
                                if (this.mIpadType != IpadType.BLACK_LAYER.ordinal() && this.mIpadType != IpadType.BLUE_TYPE.ordinal() && this.mIpadType != IpadType.GRADIENT.ordinal() && this.mIpadType != IpadType.MASK_BRUSH.ordinal() && this.mIpadType != IpadType.HEART.ordinal() && this.mIpadType != IpadType.BATTERY.ordinal()) {
                                    n6 = this.ipad_rect.width() * n;
                                    break Label_0441;
                                }
                                n5 = this.ipad_rect.width();
                            }
                            n6 = n5 * n4;
                        }
                        final float width = this.rectFSurahName.width();
                        this.rectFSurahName.left = n6 + this.ipad_rect.left;
                        final RectF rectFSurahName = this.rectFSurahName;
                        rectFSurahName.right = rectFSurahName.left + width;
                    }
                    else {
                        final float width2 = this.rectFSurahName.width();
                        this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n3;
                        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
                            this.rectFSurahName.left = this.left_square;
                        }
                        else {
                            this.rectFSurahName.left = this.ipad_rect.width() * n2 + this.left_square;
                        }
                        final RectF rectFSurahName2 = this.rectFSurahName;
                        rectFSurahName2.right = rectFSurahName2.left + width2;
                    }
                    this.surahNameEntity.setAlignment(Layout$Alignment.ALIGN_NORMAL);
                }
                else {
                    if (this.mIpadType != IpadType.IPAD.ordinal() && this.mIpadType != IpadType.IPAD_UNBLUR.ordinal() && this.mIpadType != IpadType.IPAD_CLASSIC.ordinal()) {
                        float n8 = 0.0f;
                        Label_0974: {
                            float n7;
                            if (this.mIpadType == IpadType.BOTTOM_RECT.ordinal()) {
                                n7 = this.ipad_rect.width();
                            }
                            else {
                                if (this.mIpadType != IpadType.BLACK_LAYER.ordinal() && this.mIpadType != IpadType.BLUE_TYPE.ordinal() && this.mIpadType != IpadType.GRADIENT.ordinal() && this.mIpadType != IpadType.MASK_BRUSH.ordinal() && this.mIpadType != IpadType.HEART.ordinal() && this.mIpadType != IpadType.BATTERY.ordinal()) {
                                    n8 = this.ipad_rect.width() * n;
                                    break Label_0974;
                                }
                                n7 = this.ipad_rect.width();
                            }
                            n8 = n7 * n4;
                        }
                        final float width3 = this.rectFSurahName.width();
                        this.rectFSurahName.right = this.ipad_rect.right - n8;
                        final RectF rectFSurahName3 = this.rectFSurahName;
                        rectFSurahName3.left = rectFSurahName3.right - width3;
                    }
                    else {
                        final float width4 = this.rectFSurahName.width();
                        this.left_square = this.ipad_rect.centerX() - this.bitmapSquare.getWidth() * n3;
                        if (this.mIpadType == IpadType.IPAD_CLASSIC.ordinal()) {
                            this.rectFSurahName.right = this.left_square + this.bitmapSquare.getWidth();
                        }
                        else {
                            this.rectFSurahName.right = this.left_square + this.bitmapSquare.getWidth() - this.ipad_rect.width() * n2;
                        }
                        final RectF rectFSurahName4 = this.rectFSurahName;
                        rectFSurahName4.left = rectFSurahName4.right - width4;
                    }
                    this.surahNameEntity.setAlignment(Layout$Alignment.ALIGN_OPPOSITE);
                }
            }
            else {
                this.surahNameEntity.setAlignment(Layout$Alignment.ALIGN_CENTER);
            }
            this.surahNameEntity.setIpad_type(this.mIpadType);
            this.surahNameEntity.setFactor_scale(1.0f);
            this.surahNameEntity.update(this.rectFSurahName);
        }
    }
    
    public void updateSizeAya() {
        final List quranEntities = this.quranEntities;
        if (quranEntities != null) {
            if (!quranEntities.isEmpty()) {
                QuranEntity lastAdd = this.getLastAdd();
                QuranEntity quranEntity;
                if (lastAdd.getTranslation() != null) {
                    quranEntity = lastAdd;
                }
                else {
                    quranEntity = null;
                }
                float n;
                if (quranEntity != null) {
                    n = lastAdd.getTranslationWidth();
                }
                else {
                    n = 0.0f;
                }
                final float n2 = fcmpl(n, 0.0f);
                final int n3 = 1;
                int n4;
                if (n2 != 0) {
                    n4 = n3;
                }
                else {
                    n4 = 0;
                }
                final int countEntityQuran = this.countEntityQuran();
                final float n5 = 0.5f;
                final float n6 = 0.83f;
                final float n7 = 0.85f;
                if (countEntityQuran == n3) {
                    float n8;
                    float n9;
                    if (lastAdd.getTxt().length() < 9) {
                        n8 = lastAdd.calculateTextSize();
                        n9 = 0.7f;
                    }
                    else {
                        n8 = lastAdd.calculateTextSize();
                        n9 = 0.95f;
                    }
                    final float textSize = n8 * n9;
                    lastAdd.setTextSize(textSize);
                    lastAdd.setFcSize(textSize / this.getmCanvas_width());
                    lastAdd.setupScale(lastAdd.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                    if (n4 != 0) {
                        final float calculateOptimalTextSize = lastAdd.calculateOptimalTextSize((int)(lastAdd.getRect().width() * n7), (int)(lastAdd.getRect().height() * n5 * n6));
                        lastAdd.updateTranslation(calculateOptimalTextSize);
                        lastAdd.setFactorSizeTrl(calculateOptimalTextSize / this.getmCanvas_width());
                    }
                    lastAdd.initPreset(lastAdd.getmPreset());
                    return;
                }
                final float factorSize = lastAdd.getFactorSize();
                final float n10 = 1.0f;
                final float n11 = fcmpl(factorSize, n10);
                final float n12 = -1.0f;
                float width;
                if (n11 == 0) {
                    width = lastAdd.getWidth();
                }
                else {
                    width = n12;
                }
                for (int i = this.quranEntities.size() - n3; i >= 0; --i) {
                    final QuranEntity quranEntity2 = this.quranEntities.get(i);
                    if (quranEntity2.getEntityQuran().visible()) {
                        if (quranEntity2.getRect().width() == this.rectFAya.width()) {
                            final float width2 = quranEntity2.getWidth();
                            if (width2 > width || width == n12) {
                                width = width2;
                                lastAdd = quranEntity2;
                            }
                            if (quranEntity2.getTranslation() != null && quranEntity2.getTranslationWidth() > n) {
                                n = quranEntity2.getTranslationWidth();
                                n4 = n3;
                                quranEntity = quranEntity2;
                            }
                        }
                    }
                }
                final float calculateTextSize = lastAdd.calculateTextSize();
                for (int j = this.quranEntities.size() - n3; j >= 0; --j) {
                    final QuranEntity quranEntity3 = this.quranEntities.get(j);
                    if (quranEntity3.getEntityQuran().visible()) {
                        if (quranEntity3.getRect().width() == this.rectFAya.width()) {
                            if (quranEntity3.getFactorSize() == n10) {
                                quranEntity3.setFcSize(calculateTextSize / this.getmCanvas_width());
                            }
                            quranEntity3.setupScale(quranEntity3.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                            quranEntity3.initPresetAya(quranEntity3.getmPreset());
                        }
                    }
                }
                if (n4 != 0) {
                    final float calculateOptimalTextSize2 = quranEntity.calculateOptimalTextSize((int)(quranEntity.getRect().width() * n7), (int)(quranEntity.getRect().height() * n5 * n6));
                    for (int k = 0; k < this.quranEntities.size(); ++k) {
                        final QuranEntity quranEntity4 = this.quranEntities.get(k);
                        if (quranEntity4.getEntityQuran().visible()) {
                            if (quranEntity4.getTranslation() != null) {
                                quranEntity4.updateTranslation(calculateOptimalTextSize2);
                                quranEntity4.setFactorSizeTrl(calculateOptimalTextSize2 / this.getmCanvas_width());
                                quranEntity4.initPresetTrsl(quranEntity4.getmPreset());
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void updateSizeAyaResize() {
        final List quranEntities = this.quranEntities;
        if (quranEntities != null) {
            if (!quranEntities.isEmpty()) {
                QuranEntity lastAdd = this.getLastAdd();
                lastAdd.setIpad_type(this.mIpadType);
                lastAdd.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
                final float factorSizeTrl = 1.0f;
                lastAdd.setFactor_scale(factorSizeTrl);
                lastAdd.setFcSize(factorSizeTrl);
                lastAdd.setFactorSizeTrl(factorSizeTrl);
                final RectF rectFAya = this.rectFAya;
                final float width = rectFAya.width();
                final float n = 0.85f;
                lastAdd.update(rectFAya, (int)(width * n), (int)(this.rectFAya.height() * n));
                QuranEntity quranEntity;
                if (lastAdd.getTranslation() != null) {
                    quranEntity = lastAdd;
                }
                else {
                    quranEntity = null;
                }
                float n2;
                if (quranEntity != null) {
                    n2 = lastAdd.getTranslationWidth();
                }
                else {
                    n2 = 0.0f;
                }
                final float n3 = fcmpl(n2, 0.0f);
                final int n4 = 1;
                int n5;
                if (n3 != 0) {
                    n5 = n4;
                }
                else {
                    n5 = 0;
                }
                float width2 = lastAdd.getWidth();
                final int countEntityQuran = this.countEntityQuran();
                final float n6 = 0.5f;
                final float n7 = 0.83f;
                if (countEntityQuran == n4) {
                    float n8;
                    float n9;
                    if (lastAdd.getTxt().length() < 9) {
                        n8 = lastAdd.calculateTextSize();
                        n9 = 0.7f;
                    }
                    else {
                        n8 = lastAdd.calculateTextSize();
                        n9 = 0.95f;
                    }
                    final float textSize = n8 * n9;
                    lastAdd.setTextSize(textSize);
                    lastAdd.setFcSize(textSize / this.getmCanvas_width());
                    lastAdd.setupScale(lastAdd.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                    if (n5 != 0) {
                        final float calculateOptimalTextSize = lastAdd.calculateOptimalTextSize((int)(lastAdd.getRect().width() * n), (int)(lastAdd.getRect().height() * n6 * n7));
                        lastAdd.updateTranslation(calculateOptimalTextSize);
                        lastAdd.setFactorSizeTrl(calculateOptimalTextSize / this.getmCanvas_width());
                    }
                    lastAdd.initPreset(lastAdd.getmPreset());
                    return;
                }
                for (int i = this.quranEntities.size() - n4; i >= 0; --i) {
                    final QuranEntity quranEntity2 = this.quranEntities.get(i);
                    if (quranEntity2.getEntityQuran().visible()) {
                        quranEntity2.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
                        quranEntity2.setIpad_type(this.mIpadType);
                        quranEntity2.update(this.rectFAya, lastAdd.getMax_w(), lastAdd.getMax_h());
                        final float width3 = quranEntity2.getWidth();
                        if (width3 > width2) {
                            width2 = width3;
                            lastAdd = quranEntity2;
                        }
                        if (quranEntity2.getTranslation() != null && quranEntity2.getTranslationWidth() > n2) {
                            n2 = quranEntity2.getTranslationWidth();
                            n5 = n4;
                            quranEntity = quranEntity2;
                        }
                    }
                }
                final float calculateTextSize = lastAdd.calculateTextSize();
                for (int j = this.quranEntities.size() - n4; j >= 0; --j) {
                    final QuranEntity quranEntity3 = this.quranEntities.get(j);
                    if (quranEntity3.getEntityQuran().visible()) {
                        quranEntity3.setFactor_scale(factorSizeTrl);
                        quranEntity3.setFactorSizeTrl(factorSizeTrl);
                        quranEntity3.setFcSize(calculateTextSize / this.getmCanvas_width());
                        quranEntity3.setupScale(quranEntity3.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                        quranEntity3.initPresetAya(quranEntity3.getmPreset());
                    }
                }
                if (n5 != 0) {
                    final float calculateOptimalTextSize2 = quranEntity.calculateOptimalTextSize((int)(quranEntity.getRect().width() * n), (int)(quranEntity.getRect().height() * n6 * n7));
                    for (int k = 0; k < this.quranEntities.size(); ++k) {
                        final QuranEntity quranEntity4 = this.quranEntities.get(k);
                        if (quranEntity4.getEntityQuran().visible()) {
                            if (quranEntity4.getTranslation() != null) {
                                quranEntity4.updateTranslation(calculateOptimalTextSize2);
                                quranEntity4.setFactorSizeTrl(calculateOptimalTextSize2 / this.getmCanvas_width());
                                quranEntity4.initPresetTrsl(quranEntity4.getmPreset());
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void updateSizeAyaSave(final int n, final int n2) {
        final List quranEntities = this.quranEntities;
        if (quranEntities != null) {
            if (!quranEntities.isEmpty()) {
                for (int i = this.quranEntities.size() - 1; i >= 0; --i) {
                    final QuranEntity quranEntity = this.quranEntities.get(i);
                    if (quranEntity.getEntityQuran().visible()) {
                        quranEntity.setIpad_type(this.mIpadType);
                        quranEntity.setCopyRect();
                        final float left = quranEntity.getCopyRect().left;
                        final float n3 = (float)n;
                        final float n4 = left * n3;
                        final float top = quranEntity.getCopyRect().top;
                        final float n5 = (float)n2;
                        final RectF rectF = new RectF(n4, top * n5, quranEntity.getCopyRect().right * n3, quranEntity.getCopyRect().bottom * n5);
                        final float width = rectF.width();
                        final float n6 = 0.85f;
                        quranEntity.update(rectF, (int)(width * n6), (int)(rectF.height() * n6));
                        quranEntity.setupScaleSave(quranEntity.getFactorSize(), n);
                        quranEntity.initPreset(quranEntity.getmPreset());
                    }
                }
            }
        }
    }
    
    public void updateSizeAyaTrsl() {
        final List translationEntities = this.translationEntities;
        if (translationEntities != null) {
            if (!translationEntities.isEmpty()) {
                TranslationQuranEntity lastAddTrsl = this.getLastAddTrsl();
                final int countEntityTrsl = this.countEntityTrsl();
                final int n = 1;
                if (countEntityTrsl == n) {
                    float n2;
                    float n3;
                    if (lastAddTrsl.getTxt().length() < 9) {
                        n2 = lastAddTrsl.calculateTextSize();
                        n3 = 0.7f;
                    }
                    else {
                        n2 = lastAddTrsl.calculateTextSize();
                        n3 = 0.95f;
                    }
                    final float textSize = n2 * n3;
                    lastAddTrsl.setTextSize(textSize);
                    lastAddTrsl.setFcSize(textSize / this.getmCanvas_width());
                    lastAddTrsl.setupScale(lastAddTrsl.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                    lastAddTrsl.initPreset(lastAddTrsl.getmPreset());
                    return;
                }
                final float factorSize = lastAddTrsl.getFactorSize();
                final float n4 = 1.0f;
                final float n5 = fcmpl(factorSize, n4);
                final float n6 = -1.0f;
                float width;
                if (n5 == 0) {
                    width = lastAddTrsl.getWidth();
                }
                else {
                    width = n6;
                }
                for (int i = this.translationEntities.size() - n; i >= 0; --i) {
                    final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
                    if (translationQuranEntity.getEntityTrslTimeline().visible()) {
                        final float width2 = translationQuranEntity.getWidth();
                        if (width2 > width || width == n6) {
                            lastAddTrsl = translationQuranEntity;
                            width = width2;
                        }
                    }
                }
                final float calculateTextSize = lastAddTrsl.calculateTextSize();
                for (int j = this.translationEntities.size() - n; j >= 0; --j) {
                    final TranslationQuranEntity translationQuranEntity2 = this.translationEntities.get(j);
                    if (translationQuranEntity2.getEntityTrslTimeline().visible()) {
                        if (translationQuranEntity2.getFactorSize() == n4) {
                            translationQuranEntity2.setFcSize(calculateTextSize / this.getmCanvas_width());
                        }
                        translationQuranEntity2.setupScale(translationQuranEntity2.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                        translationQuranEntity2.initPresetAya(translationQuranEntity2.getmPreset());
                    }
                }
            }
        }
    }
    
    public void updateSizeTrslAyaResize() {
        final List translationEntities = this.translationEntities;
        if (translationEntities != null) {
            if (!translationEntities.isEmpty()) {
                TranslationQuranEntity lastAddTrsl = this.getLastAddTrsl();
                lastAddTrsl.setIpad_type(this.mIpadType);
                lastAddTrsl.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
                final float factorSizeTrl = 1.0f;
                lastAddTrsl.setFactor_scale(factorSizeTrl);
                lastAddTrsl.setFcSize(factorSizeTrl);
                lastAddTrsl.setFactorSizeTrl(factorSizeTrl);
                final RectF rectFAya = this.rectFAya;
                final float width = rectFAya.width();
                final float n = 0.85f;
                lastAddTrsl.onResize(rectFAya, (int)(width * n), (int)(this.rectFAya.height() * n));
                float width2 = lastAddTrsl.getWidth();
                final int countEntityTrsl = this.countEntityTrsl();
                final int n2 = 1;
                if (countEntityTrsl == n2) {
                    float n3;
                    float n4;
                    if (lastAddTrsl.getTxt().length() < 9) {
                        n3 = lastAddTrsl.calculateTextSize();
                        n4 = 0.7f;
                    }
                    else {
                        n3 = lastAddTrsl.calculateTextSize();
                        n4 = 0.95f;
                    }
                    final float textSize = n3 * n4;
                    lastAddTrsl.setTextSize(textSize);
                    lastAddTrsl.setFcSize(textSize / this.getmCanvas_width());
                    lastAddTrsl.setupScale(lastAddTrsl.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                    lastAddTrsl.initPreset(lastAddTrsl.getmPreset());
                    return;
                }
                for (int i = this.translationEntities.size() - n2; i >= 0; --i) {
                    final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
                    if (translationQuranEntity.getEntityTrslTimeline().visible()) {
                        translationQuranEntity.setCanvasWH(this.getmCanvas_width(), this.getmCanvas_height());
                        translationQuranEntity.setIpad_type(this.mIpadType);
                        translationQuranEntity.onResize(this.rectFAya, lastAddTrsl.getMax_w(), lastAddTrsl.getMax_h());
                        final float width3 = translationQuranEntity.getWidth();
                        if (width3 > width2) {
                            lastAddTrsl = translationQuranEntity;
                            width2 = width3;
                        }
                    }
                }
                final float calculateTextSize = lastAddTrsl.calculateTextSize();
                for (int j = this.translationEntities.size() - n2; j >= 0; --j) {
                    final TranslationQuranEntity translationQuranEntity2 = this.translationEntities.get(j);
                    if (translationQuranEntity2.getEntityTrslTimeline().visible()) {
                        translationQuranEntity2.setFactor_scale(factorSizeTrl);
                        translationQuranEntity2.setFactorSizeTrl(factorSizeTrl);
                        translationQuranEntity2.setFcSize(calculateTextSize / this.getmCanvas_width());
                        translationQuranEntity2.setupScale(translationQuranEntity2.getFactorSize(), this.getmCanvas_width(), this.getmCanvas_height());
                        translationQuranEntity2.initPresetAya(translationQuranEntity2.getmPreset());
                    }
                }
            }
        }
    }
    
    public void updateSizeTrslSave(final int n, final int n2) {
        final List translationEntities = this.translationEntities;
        if (translationEntities != null) {
            if (!translationEntities.isEmpty()) {
                for (int i = this.translationEntities.size() - 1; i >= 0; --i) {
                    final TranslationQuranEntity translationQuranEntity = this.translationEntities.get(i);
                    if (translationQuranEntity.getEntityTrslTimeline().visible()) {
                        translationQuranEntity.setIpad_type(this.mIpadType);
                        translationQuranEntity.setCopyRect();
                        final float left = translationQuranEntity.getCopyRect().left;
                        final float n3 = (float)n;
                        final float n4 = left * n3;
                        final float top = translationQuranEntity.getCopyRect().top;
                        final float n5 = (float)n2;
                        final RectF rectF = new RectF(n4, top * n5, translationQuranEntity.getCopyRect().right * n3, translationQuranEntity.getCopyRect().bottom * n5);
                        final float width = rectF.width();
                        final float n6 = 0.85f;
                        translationQuranEntity.update(rectF, (int)(width * n6), (int)(rectF.height() * n6));
                        translationQuranEntity.setupScaleSave(translationQuranEntity.getFactorSize(), n);
                        translationQuranEntity.initPreset(translationQuranEntity.getmPreset());
                    }
                }
            }
        }
    }
}
