package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class CustomDiscreteSeekBar extends View {
    private int mCurrentProgressIndex;
    private int[] mGradientColors;
    private boolean mIsDragging;
    private boolean mIsRTL;
    private float mLabelTextSize;
    private List<String> mLabels;
    private OnProgressChangeListener mListener;
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

    public interface OnProgressChangeListener {
        void onProgressChanged(CustomDiscreteSeekBar customDiscreteSeekBar, int value, String textValue, boolean isFlag);

        void onStartTrackingTouch(CustomDiscreteSeekBar customDiscreteSeekBar);

        void onStopTrackingTouch(CustomDiscreteSeekBar customDiscreteSeekBar);
    }

    public void setOnProgressChangeListener(OnProgressChangeListener onProgressChangeListener) {
        this.mListener = onProgressChangeListener;
    }

    public CustomDiscreteSeekBar(Context context) {
        super(context);
        init(null);
    }

    public CustomDiscreteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public CustomDiscreteSeekBar(Context context, AttributeSet attributeSet, int index) {
        super(context, attributeSet, index);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        int index;
        boolean equals = LocaleHelper.getLanguage(getContext()).equals("ar");
        this.mIsRTL = equals;
        if (equals) {
            this.mGradientColors = new int[]{Color.parseColor("#fae065"), Color.parseColor("#cbd653"), Color.parseColor("#a8ce46")};
        } else {
            this.mGradientColors = new int[]{Color.parseColor("#a8ce46"), Color.parseColor("#cbd653"), Color.parseColor("#fae065")};
        }
        this.mTrackHeight = dpToPx(1.2f);
        this.mThumbRadius = dpToPx(10.0f);
        this.mTickRadius = dpToPx(4.0f);
        this.mLabelTextSize = spToPx(10.5f);
        this.mPaddingBottom = dpToPx(8.0f);
        Paint paint = new Paint(1);
        this.mTrackPaint = paint;
        paint.setColor(-3355444);
        this.mTrackPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mProgressPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.mThumbPaint = paint3;
        paint3.setColor(-3355444);
        this.mThumbPaint.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(1);
        this.mTickPaint = paint4;
        paint4.setColor(-3355444);
        this.mTickPaint.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint(1);
        this.mTextPaint = paint5;
        paint5.setColor(-3355444);
        this.mTextPaint.setTextSize(this.mLabelTextSize);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "fonts/ReadexPro_Medium.ttf"));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2014R.styleable.CustomDiscreteSeekBar);
            try {
                index = obtainStyledAttributes.getResourceId(C2014R.styleable.CustomDiscreteSeekBar_labelsArray, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            index = 0;
        }
        if (index != 0) {
            this.mLabels = new ArrayList(Arrays.asList(getContext().getResources().getStringArray(index)));
        } else {
            this.mLabels = new ArrayList();
        }
        this.mMaxProgressIndex = this.mLabels.size() - 1;
        this.mCurrentProgressIndex = 0;
        this.mTrackRect = new RectF();
        this.mTickPositionsX = new float[this.mLabels.size()];
        this.mIsDragging = false;
    }

    public List<String> getmLabels() {
        return this.mLabels;
    }

    private float dpToPx(float progressValue) {
        return TypedValue.applyDimension(1, progressValue, getResources().getDisplayMetrics());
    }

    private float spToPx(float progressValue) {
        return TypedValue.applyDimension(2, progressValue, getResources().getDisplayMetrics());
    }

    public void setProgress(int index) {
        if (index < 0 || index > this.mMaxProgressIndex) {
            return;
        }
        boolean isFlag = this.mCurrentProgressIndex != index;
        this.mCurrentProgressIndex = index;
        calculateThumbPositionForIndex();
        invalidate();
        OnProgressChangeListener onProgressChangeListener = this.mListener;
        if (onProgressChangeListener == null || !isFlag) {
            return;
        }
        int index11 = this.mCurrentProgressIndex;
        onProgressChangeListener.onProgressChanged(this, index11, this.mLabels.get(index11), false);
    }

    public int getProgress() {
        return this.mCurrentProgressIndex;
    }

    public String getCurrentLabel() {
        int index = this.mCurrentProgressIndex;
        if (index >= 0 && index < this.mLabels.size()) {
            return this.mLabels.get(this.mCurrentProgressIndex);
        }
        return "";
    }

    @Override // android.view.View
    protected void onMeasure(int size16, int size16) {
        int dpToPx = (int) dpToPx(200.0f);
        int dpToPx2 = (int) ((this.mThumbRadius * 2.0f) + this.mLabelTextSize + this.mPaddingBottom + dpToPx(8.0f));
        int mode = View.MeasureSpec.getMode(size16);
        int size = View.MeasureSpec.getSize(size16);
        int mode2 = View.MeasureSpec.getMode(size16);
        int size2 = View.MeasureSpec.getSize(size16);
        if (mode == 1073741824) {
            dpToPx = size;
        } else if (mode == Integer.MIN_VALUE) {
            dpToPx = Math.min(dpToPx, size);
        }
        if (mode2 == 1073741824) {
            dpToPx2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            dpToPx2 = Math.min(dpToPx2, size2);
        }
        setMeasuredDimension(dpToPx, dpToPx2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int index, int index21, int i3, int size4) {
        float paddingStart;
        float width;
        super.onSizeChanged(index, index21, i3, size4);
        if (this.mIsRTL) {
            paddingStart = (getWidth() - getPaddingEnd()) - this.mThumbRadius;
            width = getPaddingStart() + this.mThumbRadius;
        } else {
            paddingStart = getPaddingStart() + this.mThumbRadius;
            width = (getWidth() - getPaddingEnd()) - this.mThumbRadius;
        }
        RectF rectF = this.mTrackRect;
        float min = Math.min(paddingStart, width);
        float paddingTop = (getPaddingTop() + this.mThumbRadius) - (this.mTrackHeight / 2.0f);
        float max = Math.max(paddingStart, width);
        float paddingTop2 = getPaddingTop() + this.mThumbRadius;
        float progressValue = this.mTrackHeight;
        rectF.set(min, paddingTop, max, (paddingTop2 - (progressValue / 2.0f)) + progressValue);
        this.mProgressPaint.setShader(new LinearGradient(this.mTrackRect.left, this.mTrackRect.centerY(), this.mTrackRect.right, this.mTrackRect.centerY(), this.mGradientColors, (float[]) null, Shader.TileMode.CLAMP));
        if (this.mLabels.size() > 1) {
            float abs = Math.abs(width - paddingStart) / (this.mLabels.size() - 1);
            for (int value5 = 0; value5 < this.mLabels.size(); value5++) {
                if (this.mIsRTL) {
                    this.mTickPositionsX[value5] = paddingStart - (value5 * abs);
                } else {
                    this.mTickPositionsX[value5] = (value5 * abs) + paddingStart;
                }
            }
        } else if (this.mLabels.size() == 1) {
            this.mTickPositionsX[0] = this.mTrackRect.centerX();
        }
        calculateThumbPositionForIndex();
    }

    private void calculateThumbPositionForIndex() {
        if (this.mMaxProgressIndex >= 0) {
            this.mThumbX = this.mTickPositionsX[this.mCurrentProgressIndex];
        } else {
            this.mThumbX = this.mIsRTL ? this.mTrackRect.right : this.mTrackRect.left;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.mTrackRect, 100.0f, 100.0f, this.mTrackPaint);
        if (this.mIsRTL) {
            canvas.drawRoundRect(this.mThumbX, this.mTrackRect.top, this.mTrackRect.right, this.mTrackRect.bottom, 100.0f, 100.0f, this.mProgressPaint);
        } else {
            canvas.drawRoundRect(this.mTrackRect.left, this.mTrackRect.top, this.mThumbX, this.mTrackRect.bottom, 100.0f, 100.0f, this.mProgressPaint);
        }
        for (int index = 0; index < this.mLabels.size(); index++) {
            float progressValue = this.mTickPositionsX[index];
            if (index == 0) {
                if (this.mIsRTL) {
                    progressValue -= this.mThumbRadius * 0.7f;
                } else {
                    progressValue += this.mThumbRadius * 0.7f;
                }
            }
            if (index == this.mLabels.size() - 1) {
                if (this.mIsRTL) {
                    progressValue += this.mThumbRadius;
                } else {
                    progressValue -= this.mThumbRadius;
                }
            }
            float centerY = this.mTrackRect.centerY();
            String textValue = this.mLabels.get(index);
            this.mTextPaint.getTextBounds(textValue, 0, textValue.length(), new Rect());
            canvas.drawText(textValue, progressValue, centerY + this.mThumbRadius + this.mPaddingBottom + r5.height(), this.mTextPaint);
        }
        canvas.drawCircle(this.mThumbX, this.mTrackRect.centerY(), this.mThumbRadius, this.mThumbPaint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5 != 3) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float progressValue;
        float floatValue2;
        if (!isEnabled() || this.mMaxProgressIndex < 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.mIsRTL) {
            progressValue = this.mTrackRect.left;
            floatValue2 = this.mTrackRect.right;
        } else {
            progressValue = this.mTrackRect.left;
            floatValue2 = this.mTrackRect.right;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (isTouchNearThumbOrTrack(x, y)) {
                this.mIsDragging = true;
                OnProgressChangeListener onProgressChangeListener = this.mListener;
                if (onProgressChangeListener != null) {
                    onProgressChangeListener.onStartTrackingTouch(this);
                }
                this.mThumbX = Math.max(progressValue, Math.min(x, floatValue2));
                invalidate();
                performClick();
                return true;
            }
        } else {
            if (action != 1) {
                if (action == 2) {
                    if (this.mIsDragging) {
                        this.mThumbX = Math.max(progressValue, Math.min(x, floatValue2));
                        invalidate();
                        return true;
                    }
                }
            }
            if (this.mIsDragging) {
                this.mIsDragging = false;
                int index = this.mCurrentProgressIndex;
                snapToNearestTickAndNotify(x);
                OnProgressChangeListener onProgressChangeListener2 = this.mListener;
                if (onProgressChangeListener2 != null) {
                    int index38 = this.mCurrentProgressIndex;
                    if (index != index38) {
                        onProgressChangeListener2.onProgressChanged(this, index38, this.mLabels.get(index38), true);
                    }
                    this.mListener.onStopTrackingTouch(this);
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean isTouchNearThumbOrTrack(float progressValue, float floatValue2) {
        float dpToPx = dpToPx(20.0f);
        return floatValue2 > (this.mTrackRect.centerY() - this.mThumbRadius) - dpToPx && floatValue2 < (((this.mTrackRect.centerY() + this.mThumbRadius) + this.mLabelTextSize) + this.mPaddingBottom) + dpToPx && progressValue > (this.mTrackRect.left - this.mThumbRadius) - dpToPx && progressValue < (this.mTrackRect.right + this.mThumbRadius) + dpToPx;
    }

    private void snapToNearestTickAndNotify(float progressValue) {
        int count = 0;
        float floatValue2 = Float.MAX_VALUE;
        int count42 = 0;
        while (true) {
            float[] fArr = this.mTickPositionsX;
            if (count < fArr.length) {
                float abs = Math.abs(progressValue - fArr[count]);
                if (abs < floatValue2) {
                    count42 = count;
                    floatValue2 = abs;
                }
                count++;
            } else {
                this.mCurrentProgressIndex = count42;
                calculateThumbPositionForIndex();
                invalidate();
                return;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }
}
