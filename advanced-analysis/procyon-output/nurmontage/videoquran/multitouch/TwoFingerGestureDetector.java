// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.multitouch;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.content.Context;

public abstract class TwoFingerGestureDetector extends BaseGestureDetector
{
    private float mBottomSlopEdge;
    protected float mCurrFingerDiffX;
    protected float mCurrFingerDiffY;
    private float mCurrLen;
    private final float mEdgeSlop;
    protected float mPrevFingerDiffX;
    protected float mPrevFingerDiffY;
    private float mPrevLen;
    private float mRightSlopEdge;
    
    public TwoFingerGestureDetector(final Context context) {
        super(context);
        this.mEdgeSlop = (float)ViewConfiguration.get(context).getScaledEdgeSlop();
    }
    
    protected static float getRawX(final MotionEvent motionEvent, final int n) {
        final float n2 = motionEvent.getX() - motionEvent.getRawX();
        if (n < motionEvent.getPointerCount()) {
            return motionEvent.getX(n) + n2;
        }
        return 0.0f;
    }
    
    protected static float getRawY(final MotionEvent motionEvent, final int n) {
        final float n2 = motionEvent.getY() - motionEvent.getRawY();
        if (n < motionEvent.getPointerCount()) {
            return motionEvent.getY(n) + n2;
        }
        return 0.0f;
    }
    
    public float getCurrentSpan() {
        if (this.mCurrLen == -1.0f) {
            final float mCurrFingerDiffX = this.mCurrFingerDiffX;
            final float mCurrFingerDiffY = this.mCurrFingerDiffY;
            this.mCurrLen = (float)Math.sqrt(mCurrFingerDiffX * mCurrFingerDiffX + mCurrFingerDiffY * mCurrFingerDiffY);
        }
        return this.mCurrLen;
    }
    
    public float getPreviousSpan() {
        if (this.mPrevLen == -1.0f) {
            final float mPrevFingerDiffX = this.mPrevFingerDiffX;
            final float mPrevFingerDiffY = this.mPrevFingerDiffY;
            this.mPrevLen = (float)Math.sqrt(mPrevFingerDiffX * mPrevFingerDiffX + mPrevFingerDiffY * mPrevFingerDiffY);
        }
        return this.mPrevLen;
    }
    
    @Override
    protected abstract void handleInProgressEvent(final int p0, final MotionEvent p1);
    
    @Override
    protected abstract void handleStartProgressEvent(final int p0, final MotionEvent p1);
    
    protected boolean isSloppyGesture(final MotionEvent motionEvent) {
        final DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        this.mRightSlopEdge = displayMetrics.widthPixels - this.mEdgeSlop;
        final float n = (float)displayMetrics.heightPixels;
        final float mEdgeSlop = this.mEdgeSlop;
        final float mBottomSlopEdge = n - mEdgeSlop;
        this.mBottomSlopEdge = mBottomSlopEdge;
        final float mRightSlopEdge = this.mRightSlopEdge;
        final float rawX = motionEvent.getRawX();
        final float rawY = motionEvent.getRawY();
        final int n2 = 1;
        final float rawX2 = getRawX(motionEvent, n2);
        final float rawY2 = getRawY(motionEvent, n2);
        int n3;
        if (rawX >= mEdgeSlop && rawY >= mEdgeSlop && rawX <= mRightSlopEdge && rawY <= mBottomSlopEdge) {
            n3 = 0;
        }
        else {
            n3 = n2;
        }
        int n4;
        if (rawX2 >= mEdgeSlop && rawY2 >= mEdgeSlop && rawX2 <= mRightSlopEdge && rawY2 <= mBottomSlopEdge) {
            n4 = 0;
        }
        else {
            n4 = n2;
        }
        if (n3 != 0 && n4 != 0) {
            return n2 != 0;
        }
        if (n3 != 0) {
            return n2 != 0;
        }
        return n4 != 0 && n2;
    }
    
    @Override
    protected void updateStateByEvent(final MotionEvent motionEvent) {
        super.updateStateByEvent(motionEvent);
        final MotionEvent mPrevEvent = this.mPrevEvent;
        final float n = -1.0f;
        this.mCurrLen = n;
        this.mPrevLen = n;
        final float x = mPrevEvent.getX(0);
        final float y = mPrevEvent.getY(0);
        final int n2 = 1;
        final float x2 = mPrevEvent.getX(n2);
        final float y2 = mPrevEvent.getY(n2);
        final float mPrevFingerDiffX = x2 - x;
        final float mPrevFingerDiffY = y2 - y;
        this.mPrevFingerDiffX = mPrevFingerDiffX;
        this.mPrevFingerDiffY = mPrevFingerDiffY;
        final float x3 = motionEvent.getX(0);
        final float y3 = motionEvent.getY(0);
        final float x4 = motionEvent.getX(n2);
        final float y4 = motionEvent.getY(n2);
        final float mCurrFingerDiffX = x4 - x3;
        final float mCurrFingerDiffY = y4 - y3;
        this.mCurrFingerDiffX = mCurrFingerDiffX;
        this.mCurrFingerDiffY = mCurrFingerDiffY;
    }
}
