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
 *  android.graphics.Paint$Align
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.MotionEvent
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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import hazem.nurmontage.videoquran.R$styleable;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomDiscreteSeekBar
extends View {
    private int mCurrentProgressIndex;
    private int[] mGradientColors;
    private boolean mIsDragging;
    private boolean mIsRTL;
    private float mLabelTextSize;
    private List mLabels;
    private CustomDiscreteSeekBar$OnProgressChangeListener mListener;
    private int mMaxProgressIndex;
    private float mPaddingBottom;
    private Paint mProgressPaint;
    private Paint mTextPaint;
    private Paint mThumbPaint;
    private float mThumbRadius;
    private float mThumbX;
    private Paint mTickPaint;
    private float[] mTickPositionsX;
    private float mTickRadius;
    private float mTrackHeight;
    private Paint mTrackPaint;
    private RectF mTrackRect;

    public CustomDiscreteSeekBar(Context context) {
        super(context);
        this.init(null);
    }

    public CustomDiscreteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(attributeSet);
    }

    public CustomDiscreteSeekBar(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(attributeSet);
    }

    private void calculateThumbPositionForIndex() {
        int n = this.mMaxProgressIndex;
        if (n >= 0) {
            float f;
            float[] fArray = this.mTickPositionsX;
            int n2 = this.mCurrentProgressIndex;
            this.mThumbX = f = fArray[n2];
        } else {
            float f;
            n = this.mIsRTL ? 1 : 0;
            if (n != 0) {
                RectF rectF = this.mTrackRect;
                f = rectF.right;
            } else {
                RectF rectF = this.mTrackRect;
                f = rectF.left;
            }
            this.mThumbX = f;
        }
    }

    private float dpToPx(float f) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        return TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)displayMetrics);
    }

    private void init(AttributeSet object) {
        int n;
        float f;
        int n2;
        int n3;
        int n4;
        Object object2 = LocaleHelper.getLanguage(this.getContext());
        this.mIsRTL = n4 = ((String)object2).equals("ar");
        String string2 = "#fae065";
        ArrayList arrayList = "#cbd653";
        Object object3 = "#a8ce46";
        if (n4 != 0) {
            n4 = Color.parseColor((String)string2);
            n3 = Color.parseColor((String)((Object)arrayList));
            n2 = Color.parseColor((String)object3);
            object2 = new int[]{n4, n3, n2};
            this.mGradientColors = (int[])object2;
        } else {
            n4 = Color.parseColor((String)object3);
            n2 = Color.parseColor((String)((Object)arrayList));
            n3 = Color.parseColor((String)string2);
            object2 = new int[]{n4, n2, n3};
            this.mGradientColors = (int[])object2;
        }
        this.mTrackHeight = f = this.dpToPx(1.2f);
        this.mThumbRadius = f = this.dpToPx(10.0f);
        this.mTickRadius = f = this.dpToPx(4.0f);
        this.mLabelTextSize = f = this.spToPx(10.5f);
        this.mPaddingBottom = f = this.dpToPx(8.0f);
        n3 = 1;
        object2 = new Paint(n3);
        this.mTrackPaint = object2;
        n2 = -3355444;
        object2.setColor(n2);
        object2 = this.mTrackPaint;
        object3 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object3);
        object2 = new Paint(n3);
        this.mProgressPaint = object2;
        object3 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object3);
        object2 = new Paint(n3);
        this.mThumbPaint = object2;
        object2.setColor(n2);
        object2 = this.mThumbPaint;
        object3 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object3);
        object2 = new Paint(n3);
        this.mTickPaint = object2;
        object2.setColor(n2);
        object2 = this.mTickPaint;
        object3 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object3);
        object2 = new Paint(n3);
        this.mTextPaint = object2;
        object2.setColor(n2);
        object2 = this.mTextPaint;
        float f2 = this.mLabelTextSize;
        object2.setTextSize(f2);
        object2 = this.mTextPaint;
        arrayList = Paint.Align.CENTER;
        object2.setTextAlign((Paint.Align)arrayList);
        object2 = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        arrayList = this.mTextPaint;
        arrayList.setTypeface((Typeface)object2);
        n4 = 0;
        f = 0.0f;
        object2 = null;
        if (object != null) {
            arrayList = this.getContext();
            object3 = R$styleable.CustomDiscreteSeekBar;
            object = arrayList.obtainStyledAttributes((AttributeSet)object, (int[])object3);
            try {
                n2 = R$styleable.CustomDiscreteSeekBar_labelsArray;
                n2 = object.getResourceId(n2, 0);
            }
            finally {
                object.recycle();
            }
        } else {
            n2 = 0;
            arrayList = null;
            f2 = 0.0f;
        }
        if (n2 != 0) {
            object = this.getContext().getResources().getStringArray(n2);
            object = Arrays.asList(object);
            this.mLabels = arrayList = new ArrayList(object);
        } else {
            object = new ArrayList();
            this.mLabels = object;
        }
        this.mMaxProgressIndex = n = this.mLabels.size() - n3;
        this.mCurrentProgressIndex = 0;
        this.mTrackRect = object = new RectF();
        object = new float[this.mLabels.size()];
        this.mTickPositionsX = (float[])object;
        this.mIsDragging = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isTouchNearThumbOrTrack(float f, float f2) {
        float f3 = this.dpToPx(20.0f);
        RectF rectF = this.mTrackRect;
        float f4 = rectF.centerY();
        float f5 = this.mThumbRadius;
        float f6 = f2 - (f4 = f4 - f5 - f3);
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 <= 0) return 0 != 0;
        rectF = this.mTrackRect;
        f4 = rectF.centerY();
        f5 = this.mThumbRadius;
        f4 += f5;
        f5 = this.mLabelTextSize;
        f4 += f5;
        f5 = this.mPaddingBottom;
        float f8 = f2 - (f4 = f4 + f5 + f3);
        float f9 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (f9 >= 0) return 0 != 0;
        RectF rectF2 = this.mTrackRect;
        f2 = rectF2.left;
        f4 = this.mThumbRadius;
        float f10 = f - (f2 = f2 - f4 - f3);
        f9 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (f9 <= 0) return 0 != 0;
        rectF2 = this.mTrackRect;
        f2 = rectF2.right;
        f4 = this.mThumbRadius;
        float f11 = f - (f2 = f2 + f4 + f3);
        int n = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (n >= 0) return 0 != 0;
        return 1 != 0;
    }

    private void snapToNearestTickAndNotify(float f) {
        float[] fArray;
        int n;
        float f2 = Float.MAX_VALUE;
        int n2 = 0;
        for (int i = 0; i < (n = (fArray = this.mTickPositionsX).length); ++i) {
            float f3 = fArray[i];
            float f4 = (f3 = Math.abs(f - f3)) - f2;
            n = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
            if (n >= 0) continue;
            n2 = i;
            f2 = f3;
        }
        this.mCurrentProgressIndex = n2;
        this.calculateThumbPositionForIndex();
        this.invalidate();
    }

    private float spToPx(float f) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        return TypedValue.applyDimension((int)2, (float)f, (DisplayMetrics)displayMetrics);
    }

    public String getCurrentLabel() {
        List list;
        int n;
        int n2 = this.mCurrentProgressIndex;
        if (n2 >= 0 && n2 < (n = (list = this.mLabels).size())) {
            List list2 = this.mLabels;
            n = this.mCurrentProgressIndex;
            return (String)list2.get(n);
        }
        return "";
    }

    public int getProgress() {
        return this.mCurrentProgressIndex;
    }

    public List getmLabels() {
        return this.mLabels;
    }

    protected void onDraw(Canvas canvas) {
        List list;
        int n;
        float f;
        Paint paint;
        float f2;
        int n2;
        float f3;
        float f4;
        float f5;
        float f6;
        super.onDraw(canvas);
        RectF rectF = this.mTrackRect;
        int n3 = 1120403456;
        float f7 = 100.0f;
        Object object = this.mTrackPaint;
        canvas.drawRoundRect(rectF, f7, f7, object);
        boolean bl = this.mIsRTL;
        if (bl) {
            f6 = this.mThumbX;
            f5 = this.mTrackRect.top;
            f4 = this.mTrackRect.right;
            rectF = this.mTrackRect;
            f3 = rectF.bottom;
            n2 = 1120403456;
            f2 = 100.0f;
            paint = this.mProgressPaint;
            f = 100.0f;
            canvas.drawRoundRect(f6, f5, f4, f3, f, f2, paint);
        } else {
            f6 = this.mTrackRect.left;
            f5 = this.mTrackRect.top;
            f4 = this.mThumbX;
            rectF = this.mTrackRect;
            f3 = rectF.bottom;
            n2 = 1120403456;
            f2 = 100.0f;
            paint = this.mProgressPaint;
            f = 100.0f;
            canvas.drawRoundRect(f6, f5, f4, f3, f, f2, paint);
        }
        bl = false;
        float f8 = 0.0f;
        rectF = null;
        f7 = 0.0f;
        for (n3 = 0; n3 < (n = (object = this.mLabels).size()); ++n3) {
            int n4;
            object = this.mTickPositionsX;
            f6 = (float)object[n3];
            if (n3 == 0) {
                n4 = this.mIsRTL;
                f4 = 0.7f;
                if (n4 != 0) {
                    f5 = this.mThumbRadius * f4;
                    f6 -= f5;
                } else {
                    f5 = this.mThumbRadius * f4;
                    f6 += f5;
                }
            }
            if (n3 == (n4 = (list = this.mLabels).size() + -1)) {
                n4 = this.mIsRTL ? 1 : 0;
                if (n4 != 0) {
                    f5 = this.mThumbRadius;
                    f6 += f5;
                } else {
                    f5 = this.mThumbRadius;
                    f6 -= f5;
                }
            }
            list = this.mTrackRect;
            f5 = list.centerY();
            String string2 = (String)this.mLabels.get(n3);
            Rect rect = new Rect();
            Paint paint2 = this.mTextPaint;
            n2 = string2.length();
            paint2.getTextBounds(string2, 0, n2, rect);
            f = this.mThumbRadius;
            f5 += f;
            f = this.mPaddingBottom;
            f5 += f;
            int n5 = rect.height();
            f3 = n5;
            rect = this.mTextPaint;
            canvas.drawText(string2, f6, f5 += f3, (Paint)rect);
        }
        f8 = this.mThumbX;
        f7 = this.mTrackRect.centerY();
        f6 = this.mThumbRadius;
        list = this.mThumbPaint;
        canvas.drawCircle(f8, f7, f6, (Paint)list);
    }

    protected void onMeasure(int n, int n2) {
        float f = this.dpToPx(200.0f);
        int n3 = (int)f;
        float f2 = this.mThumbRadius * 2.0f;
        float f3 = this.mLabelTextSize;
        f2 += f3;
        f3 = this.mPaddingBottom;
        f2 += f3;
        f3 = this.dpToPx(8.0f);
        int n4 = (int)(f2 += f3);
        int n5 = View.MeasureSpec.getMode((int)n);
        n = View.MeasureSpec.getSize((int)n);
        int n6 = View.MeasureSpec.getMode((int)n2);
        n2 = View.MeasureSpec.getSize((int)n2);
        int n7 = -1 << -1;
        int n8 = 0x40000000;
        if (n5 == n8) {
            n3 = n;
        } else if (n5 == n7) {
            n3 = Math.min(n3, n);
        }
        if (n6 == n8) {
            n4 = n2;
        } else if (n6 == n7) {
            n4 = Math.min(n4, n2);
        }
        this.setMeasuredDimension(n3, n4);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        int n5;
        float f;
        float f2;
        float f3;
        int n6;
        CustomDiscreteSeekBar customDiscreteSeekBar = this;
        super.onSizeChanged(n, n2, n3, n4);
        int n7 = this.mIsRTL;
        if (n7 != 0) {
            n7 = this.getWidth();
            n6 = this.getPaddingEnd();
            f3 = n7 -= n6;
            f2 = this.mThumbRadius;
            f3 -= f2;
            n6 = this.getPaddingStart();
            f2 = n6;
            f = this.mThumbRadius;
            f2 += f;
        } else {
            n7 = this.getPaddingStart();
            f3 = n7;
            f2 = this.mThumbRadius;
            f3 += f2;
            n6 = this.getWidth();
            n5 = this.getPaddingEnd();
            f2 = n6 -= n5;
            f = this.mThumbRadius;
            f2 -= f;
        }
        Object object = customDiscreteSeekBar.mTrackRect;
        float f4 = Math.min(f3, f2);
        float f5 = this.getPaddingTop();
        float f6 = customDiscreteSeekBar.mThumbRadius;
        f5 += f6;
        f6 = customDiscreteSeekBar.mTrackHeight;
        float f7 = 2.0f;
        f5 -= (f6 /= f7);
        f6 = Math.max(f3, f2);
        int n8 = this.getPaddingTop();
        float f8 = n8;
        float f9 = customDiscreteSeekBar.mThumbRadius;
        f8 += f9;
        f9 = customDiscreteSeekBar.mTrackHeight;
        f7 = f9 / f7;
        f8 = f8 - f7 + f9;
        object.set(f4, f5, f6, f8);
        float f10 = customDiscreteSeekBar.mTrackRect.left;
        float f11 = customDiscreteSeekBar.mTrackRect.centerY();
        float f12 = customDiscreteSeekBar.mTrackRect.right;
        float f13 = customDiscreteSeekBar.mTrackRect.centerY();
        int[] nArray = customDiscreteSeekBar.mGradientColors;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        object = new LinearGradient(f10, f11, f12, f13, nArray, null, tileMode);
        customDiscreteSeekBar.mProgressPaint.setShader((Shader)object);
        object = customDiscreteSeekBar.mLabels;
        n5 = object.size();
        f4 = 0.0f;
        int n9 = 1;
        f5 = Float.MIN_VALUE;
        if (n5 > n9) {
            f2 = Math.abs(f2 - f3);
            object = customDiscreteSeekBar.mLabels;
            n5 = object.size() - n9;
            f = n5;
            f2 /= f;
            for (int i = 0; i < (n5 = (object = customDiscreteSeekBar.mLabels).size()); ++i) {
                n5 = customDiscreteSeekBar.mIsRTL ? 1 : 0;
                if (n5 != 0) {
                    object = customDiscreteSeekBar.mTickPositionsX;
                    f5 = (float)i * f2;
                    f5 = f3 - f5;
                    object[i] = (RectF)f5;
                    continue;
                }
                object = customDiscreteSeekBar.mTickPositionsX;
                f5 = (float)i * f2 + f3;
                object[i] = (RectF)f5;
            }
        } else {
            Object object2 = customDiscreteSeekBar.mLabels;
            n7 = object2.size();
            if (n7 == n9) {
                object2 = customDiscreteSeekBar.mTickPositionsX;
                RectF rectF = customDiscreteSeekBar.mTrackRect;
                f2 = rectF.centerX();
                object2[0] = f2;
            }
        }
        this.calculateThumbPositionForIndex();
    }

    public boolean onTouchEvent(MotionEvent object) {
        block8: {
            block12: {
                boolean bl;
                float f;
                float f2;
                float f3;
                float f4;
                int n;
                block9: {
                    boolean bl2;
                    block10: {
                        block11: {
                            int n2 = this.isEnabled();
                            n = 0;
                            if (n2 == 0 || (n2 = this.mMaxProgressIndex) < 0) break block8;
                            f4 = object.getX();
                            f3 = object.getY();
                            boolean bl3 = this.mIsRTL;
                            if (bl3) {
                                RectF rectF = this.mTrackRect;
                                f2 = rectF.left;
                                RectF rectF2 = this.mTrackRect;
                                f = rectF2.right;
                            } else {
                                RectF rectF = this.mTrackRect;
                                f2 = rectF.left;
                                RectF rectF3 = this.mTrackRect;
                                f = rectF3.right;
                            }
                            boolean bl4 = object.getAction();
                            bl = true;
                            if (!bl4) break block9;
                            if (bl4 == bl) break block10;
                            boolean bl22 = 2 != 0;
                            f3 = 2.8E-45f;
                            if (bl4 == bl22) break block11;
                            boolean bl5 = 3 != 0;
                            f3 = 4.2E-45f;
                            if (bl4 == bl5) break block10;
                            break block12;
                        }
                        n = this.mIsDragging;
                        if (n != 0) {
                            float f5 = Math.min(f4, f);
                            this.mThumbX = f5 = Math.max(f2, f5);
                            this.invalidate();
                            return bl;
                        }
                        break block12;
                    }
                    if (bl2 = this.mIsDragging) {
                        this.mIsDragging = false;
                        int n2 = this.mCurrentProgressIndex;
                        this.snapToNearestTickAndNotify(f4);
                        CustomDiscreteSeekBar$OnProgressChangeListener customDiscreteSeekBar$OnProgressChangeListener = this.mListener;
                        if (customDiscreteSeekBar$OnProgressChangeListener != null) {
                            n = this.mCurrentProgressIndex;
                            if (n2 != n) {
                                object = (String)this.mLabels.get(n);
                                customDiscreteSeekBar$OnProgressChangeListener.onProgressChanged(this, n, (String)object, bl);
                            }
                            object = this.mListener;
                            object.onStopTrackingTouch(this);
                        }
                        return bl;
                    }
                    break block12;
                }
                n = this.isTouchNearThumbOrTrack(f4, f3);
                if (n != 0) {
                    this.mIsDragging = bl;
                    object = this.mListener;
                    if (object != null) {
                        object.onStartTrackingTouch(this);
                    }
                    float f6 = Math.min(f4, f);
                    this.mThumbX = f6 = Math.max(f2, f6);
                    this.invalidate();
                    this.performClick();
                    return bl;
                }
            }
            return super.onTouchEvent((MotionEvent)object);
        }
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnProgressChangeListener(CustomDiscreteSeekBar$OnProgressChangeListener customDiscreteSeekBar$OnProgressChangeListener) {
        this.mListener = customDiscreteSeekBar$OnProgressChangeListener;
    }

    public void setProgress(int n) {
        int n2;
        if (n >= 0 && n <= (n2 = this.mMaxProgressIndex)) {
            n2 = this.mCurrentProgressIndex;
            n2 = n2 != n ? 1 : 0;
            this.mCurrentProgressIndex = n;
            this.calculateThumbPositionForIndex();
            this.invalidate();
            CustomDiscreteSeekBar$OnProgressChangeListener customDiscreteSeekBar$OnProgressChangeListener = this.mListener;
            if (customDiscreteSeekBar$OnProgressChangeListener != null && n2 != 0) {
                n2 = this.mCurrentProgressIndex;
                String string2 = (String)this.mLabels.get(n2);
                customDiscreteSeekBar$OnProgressChangeListener.onProgressChanged(this, n2, string2, false);
            }
        }
    }
}

