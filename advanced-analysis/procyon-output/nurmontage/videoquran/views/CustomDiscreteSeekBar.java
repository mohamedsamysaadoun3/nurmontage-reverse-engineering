// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import hazem.nurmontage.videoquran.R$styleable;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Color;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import java.util.List;
import android.view.View;

public class CustomDiscreteSeekBar extends View
{
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
    
    public CustomDiscreteSeekBar(final Context context) {
        super(context);
        this.init(null);
    }
    
    public CustomDiscreteSeekBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.init(set);
    }
    
    public CustomDiscreteSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.init(set);
    }
    
    private void calculateThumbPositionForIndex() {
        if (this.mMaxProgressIndex >= 0) {
            this.mThumbX = this.mTickPositionsX[this.mCurrentProgressIndex];
        }
        else {
            float mThumbX;
            if (this.mIsRTL) {
                mThumbX = this.mTrackRect.right;
            }
            else {
                mThumbX = this.mTrackRect.left;
            }
            this.mThumbX = mThumbX;
        }
    }
    
    private float dpToPx(final float n) {
        return TypedValue.applyDimension(1, n, this.getResources().getDisplayMetrics());
    }
    
    private void init(AttributeSet obtainStyledAttributes) {
        final boolean equals = LocaleHelper.getLanguage(this.getContext()).equals("ar");
        this.mIsRTL = equals;
        final String s = "#fae065";
        final String s2 = "#cbd653";
        final String s3 = "#a8ce46";
        if (equals) {
            this.mGradientColors = new int[] { Color.parseColor(s), Color.parseColor(s2), Color.parseColor(s3) };
        }
        else {
            this.mGradientColors = new int[] { Color.parseColor(s3), Color.parseColor(s2), Color.parseColor(s) };
        }
        this.mTrackHeight = this.dpToPx(1.2f);
        this.mThumbRadius = this.dpToPx(10.0f);
        this.mTickRadius = this.dpToPx(4.0f);
        this.mLabelTextSize = this.spToPx(10.5f);
        this.mPaddingBottom = this.dpToPx(8.0f);
        final int n = 1;
        final Paint mTrackPaint = new Paint(n);
        this.mTrackPaint = mTrackPaint;
        int n2 = -3355444;
        mTrackPaint.setColor(n2);
        this.mTrackPaint.setStyle(Paint$Style.FILL);
        (this.mProgressPaint = new Paint(n)).setStyle(Paint$Style.FILL);
        (this.mThumbPaint = new Paint(n)).setColor(n2);
        this.mThumbPaint.setStyle(Paint$Style.FILL);
        (this.mTickPaint = new Paint(n)).setColor(n2);
        this.mTickPaint.setStyle(Paint$Style.FILL);
        (this.mTextPaint = new Paint(n)).setColor(n2);
        this.mTextPaint.setTextSize(this.mLabelTextSize);
        this.mTextPaint.setTextAlign(Paint$Align.CENTER);
        this.mTextPaint.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf"));
        Label_0485: {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes = (AttributeSet)this.getContext().obtainStyledAttributes(obtainStyledAttributes, R$styleable.CustomDiscreteSeekBar);
                try {
                    n2 = R$styleable.CustomDiscreteSeekBar_labelsArray;
                    n2 = ((TypedArray)obtainStyledAttributes).getResourceId(n2, 0);
                    break Label_0485;
                }
                finally {
                    ((TypedArray)obtainStyledAttributes).recycle();
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            this.mLabels = new ArrayList(Arrays.asList(this.getContext().getResources().getStringArray(n2)));
        }
        else {
            this.mLabels = new ArrayList();
        }
        this.mMaxProgressIndex = this.mLabels.size() - n;
        this.mCurrentProgressIndex = 0;
        this.mTrackRect = new RectF();
        this.mTickPositionsX = new float[this.mLabels.size()];
        this.mIsDragging = false;
    }
    
    private boolean isTouchNearThumbOrTrack(float n, float n2) {
        final float dpToPx = this.dpToPx(20.0f);
        if (n2 > this.mTrackRect.centerY() - this.mThumbRadius - dpToPx && n2 < this.mTrackRect.centerY() + this.mThumbRadius + this.mLabelTextSize + this.mPaddingBottom + dpToPx) {
            n2 = this.mTrackRect.left;
            n2 = n2 - this.mThumbRadius - dpToPx;
            if (n > n2) {
                n2 = this.mTrackRect.right;
                n2 = n2 + this.mThumbRadius + dpToPx;
                if (n < n2) {
                    final boolean b = true;
                    n = Float.MIN_VALUE;
                    return b;
                }
            }
        }
        final boolean b = false;
        n = 0.0f;
        return b;
    }
    
    private void snapToNearestTickAndNotify(final float n) {
        int n2 = 0;
        float n3 = Float.MAX_VALUE;
        int mCurrentProgressIndex = 0;
        while (true) {
            final float[] mTickPositionsX = this.mTickPositionsX;
            if (n2 >= mTickPositionsX.length) {
                break;
            }
            final float abs = Math.abs(n - mTickPositionsX[n2]);
            if (abs < n3) {
                mCurrentProgressIndex = n2;
                n3 = abs;
            }
            ++n2;
        }
        this.mCurrentProgressIndex = mCurrentProgressIndex;
        this.calculateThumbPositionForIndex();
        this.invalidate();
    }
    
    private float spToPx(final float n) {
        return TypedValue.applyDimension(2, n, this.getResources().getDisplayMetrics());
    }
    
    public String getCurrentLabel() {
        final int mCurrentProgressIndex = this.mCurrentProgressIndex;
        if (mCurrentProgressIndex >= 0 && mCurrentProgressIndex < this.mLabels.size()) {
            return this.mLabels.get(this.mCurrentProgressIndex);
        }
        return "";
    }
    
    public int getProgress() {
        return this.mCurrentProgressIndex;
    }
    
    public List getmLabels() {
        return this.mLabels;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final RectF mTrackRect = this.mTrackRect;
        final float n = 100.0f;
        canvas.drawRoundRect(mTrackRect, n, n, this.mTrackPaint);
        if (this.mIsRTL) {
            canvas.drawRoundRect(this.mThumbX, this.mTrackRect.top, this.mTrackRect.right, this.mTrackRect.bottom, 100.0f, 100.0f, this.mProgressPaint);
        }
        else {
            canvas.drawRoundRect(this.mTrackRect.left, this.mTrackRect.top, this.mThumbX, this.mTrackRect.bottom, 100.0f, 100.0f, this.mProgressPaint);
        }
        for (int i = 0; i < this.mLabels.size(); ++i) {
            float n2 = this.mTickPositionsX[i];
            if (i == 0) {
                final boolean mIsRTL = this.mIsRTL;
                final float n3 = 0.7f;
                if (mIsRTL) {
                    n2 -= this.mThumbRadius * n3;
                }
                else {
                    n2 += this.mThumbRadius * n3;
                }
            }
            if (i == this.mLabels.size() - 1) {
                if (this.mIsRTL) {
                    n2 += this.mThumbRadius;
                }
                else {
                    n2 -= this.mThumbRadius;
                }
            }
            final float centerY = this.mTrackRect.centerY();
            final String s = this.mLabels.get(i);
            final Rect rect = new Rect();
            this.mTextPaint.getTextBounds(s, 0, s.length(), rect);
            canvas.drawText(s, n2, centerY + this.mThumbRadius + this.mPaddingBottom + rect.height(), this.mTextPaint);
        }
        canvas.drawCircle(this.mThumbX, this.mTrackRect.centerY(), this.mThumbRadius, this.mThumbPaint);
    }
    
    protected void onMeasure(int size, int size2) {
        int min = (int)this.dpToPx(200.0f);
        int min2 = (int)(this.mThumbRadius * 2.0f + this.mLabelTextSize + this.mPaddingBottom + this.dpToPx(8.0f));
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        final int n = -1 << -1;
        final int n2 = 1073741824;
        if (mode == n2) {
            min = size;
        }
        else if (mode == n) {
            min = Math.min(min, size);
        }
        if (mode2 == n2) {
            min2 = size2;
        }
        else if (mode2 == n) {
            min2 = Math.min(min2, size2);
        }
        this.setMeasuredDimension(min, min2);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        float n5;
        float n6;
        if (this.mIsRTL) {
            n5 = this.getWidth() - this.getPaddingEnd() - this.mThumbRadius;
            n6 = this.getPaddingStart() + this.mThumbRadius;
        }
        else {
            n5 = this.getPaddingStart() + this.mThumbRadius;
            n6 = this.getWidth() - this.getPaddingEnd() - this.mThumbRadius;
        }
        final RectF mTrackRect = this.mTrackRect;
        final float min = Math.min(n5, n6);
        final float n7 = this.getPaddingTop() + this.mThumbRadius;
        final float mTrackHeight = this.mTrackHeight;
        final float n8 = 2.0f;
        final float n9 = n7 - mTrackHeight / n8;
        final float max = Math.max(n5, n6);
        final float n10 = this.getPaddingTop() + this.mThumbRadius;
        final float mTrackHeight2 = this.mTrackHeight;
        mTrackRect.set(min, n9, max, n10 - mTrackHeight2 / n8 + mTrackHeight2);
        this.mProgressPaint.setShader((Shader)new LinearGradient(this.mTrackRect.left, this.mTrackRect.centerY(), this.mTrackRect.right, this.mTrackRect.centerY(), this.mGradientColors, (float[])null, Shader$TileMode.CLAMP));
        final int size = this.mLabels.size();
        int i = 0;
        final int n11 = 1;
        if (size > n11) {
            final float n12 = Math.abs(n6 - n5) / (this.mLabels.size() - n11);
            while (i < this.mLabels.size()) {
                if (this.mIsRTL) {
                    this.mTickPositionsX[i] = n5 - i * n12;
                }
                else {
                    this.mTickPositionsX[i] = i * n12 + n5;
                }
                ++i;
            }
        }
        else if (this.mLabels.size() == n11) {
            this.mTickPositionsX[0] = this.mTrackRect.centerX();
        }
        this.calculateThumbPositionForIndex();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.isEnabled() && this.mMaxProgressIndex >= 0) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            float n;
            float n2;
            if (this.mIsRTL) {
                n = this.mTrackRect.left;
                n2 = this.mTrackRect.right;
            }
            else {
                n = this.mTrackRect.left;
                n2 = this.mTrackRect.right;
            }
            final int action = motionEvent.getAction();
            final boolean mIsDragging = true;
            if (action != 0) {
                if (action != (mIsDragging ? 1 : 0)) {
                    if (action != 2) {
                        if (action != 3) {
                            return super.onTouchEvent(motionEvent);
                        }
                    }
                    else {
                        if (this.mIsDragging) {
                            this.mThumbX = Math.max(n, Math.min(x, n2));
                            this.invalidate();
                            return mIsDragging;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
                if (this.mIsDragging) {
                    this.mIsDragging = false;
                    final int mCurrentProgressIndex = this.mCurrentProgressIndex;
                    this.snapToNearestTickAndNotify(x);
                    final CustomDiscreteSeekBar$OnProgressChangeListener mListener = this.mListener;
                    if (mListener != null) {
                        final int mCurrentProgressIndex2 = this.mCurrentProgressIndex;
                        if (mCurrentProgressIndex != mCurrentProgressIndex2) {
                            mListener.onProgressChanged(this, mCurrentProgressIndex2, (String)this.mLabels.get(mCurrentProgressIndex2), mIsDragging);
                        }
                        this.mListener.onStopTrackingTouch(this);
                    }
                    return mIsDragging;
                }
            }
            else if (this.isTouchNearThumbOrTrack(x, y)) {
                this.mIsDragging = mIsDragging;
                final CustomDiscreteSeekBar$OnProgressChangeListener mListener2 = this.mListener;
                if (mListener2 != null) {
                    mListener2.onStartTrackingTouch(this);
                }
                this.mThumbX = Math.max(n, Math.min(x, n2));
                this.invalidate();
                this.performClick();
                return mIsDragging;
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
    
    public boolean performClick() {
        super.performClick();
        return true;
    }
    
    public void setOnProgressChangeListener(final CustomDiscreteSeekBar$OnProgressChangeListener mListener) {
        this.mListener = mListener;
    }
    
    public void setProgress(final int mCurrentProgressIndex) {
        if (mCurrentProgressIndex >= 0 && mCurrentProgressIndex <= this.mMaxProgressIndex) {
            final boolean b = this.mCurrentProgressIndex != mCurrentProgressIndex;
            this.mCurrentProgressIndex = mCurrentProgressIndex;
            this.calculateThumbPositionForIndex();
            this.invalidate();
            final CustomDiscreteSeekBar$OnProgressChangeListener mListener = this.mListener;
            if (mListener != null && b) {
                final int mCurrentProgressIndex2 = this.mCurrentProgressIndex;
                mListener.onProgressChanged(this, mCurrentProgressIndex2, (String)this.mLabels.get(mCurrentProgressIndex2), false);
            }
        }
    }
}
