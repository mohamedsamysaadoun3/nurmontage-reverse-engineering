// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.multitouch;

import android.view.MotionEvent;
import android.content.Context;

public class ShoveGestureDetector extends TwoFingerGestureDetector
{
    private float mCurrAverageY;
    private final ShoveGestureDetector$OnShoveGestureListener mListener;
    private float mPrevAverageY;
    private boolean mSloppyGesture;
    
    public ShoveGestureDetector(final Context context, final ShoveGestureDetector$OnShoveGestureListener mListener) {
        super(context);
        this.mListener = mListener;
    }
    
    public float getShovePixelsDelta() {
        return this.mCurrAverageY - this.mPrevAverageY;
    }
    
    @Override
    protected void handleInProgressEvent(int n, final MotionEvent motionEvent) {
        if (n != 2) {
            if (n != 3) {
                if (n == 6) {
                    this.updateStateByEvent(motionEvent);
                    n = (this.mSloppyGesture ? 1 : 0);
                    if (n == 0) {
                        this.mListener.onShoveEnd(this);
                    }
                    this.resetState();
                }
            }
            else {
                n = (this.mSloppyGesture ? 1 : 0);
                if (n == 0) {
                    this.mListener.onShoveEnd(this);
                }
                this.resetState();
            }
        }
        else {
            this.updateStateByEvent(motionEvent);
            n = fcmpl(this.mCurrPressure / this.mPrevPressure, 0.67f);
            if (n > 0) {
                n = fcmpl(Math.abs(this.getShovePixelsDelta()), 0.5f);
                if (n > 0) {
                    n = (this.mListener.onShove(this) ? 1 : 0);
                    if (n != 0) {
                        this.mPrevEvent.recycle();
                        this.mPrevEvent = MotionEvent.obtain(motionEvent);
                    }
                }
            }
        }
    }
    
    @Override
    protected void handleStartProgressEvent(int n, final MotionEvent motionEvent) {
        if (n != 2) {
            if (n == 5) {
                this.resetState();
                this.mPrevEvent = MotionEvent.obtain(motionEvent);
                this.mTimeDelta = 0L;
                this.updateStateByEvent(motionEvent);
                n = (this.isSloppyGesture(motionEvent) ? 1 : 0);
                if (!(this.mSloppyGesture = (n != 0))) {
                    n = (this.mListener.onShoveBegin(this) ? 1 : 0);
                    this.mGestureInProgress = (n != 0);
                }
            }
        }
        else {
            n = (this.mSloppyGesture ? 1 : 0);
            if (n != 0) {
                n = (this.isSloppyGesture(motionEvent) ? 1 : 0);
                if (!(this.mSloppyGesture = (n != 0))) {
                    n = (this.mListener.onShoveBegin(this) ? 1 : 0);
                    this.mGestureInProgress = (n != 0);
                }
            }
        }
    }
    
    @Override
    protected boolean isSloppyGesture(final MotionEvent motionEvent) {
        final boolean sloppyGesture = super.isSloppyGesture(motionEvent);
        boolean b = true;
        if (sloppyGesture) {
            return b;
        }
        final double abs = Math.abs(Math.atan2(this.mCurrFingerDiffY, this.mCurrFingerDiffX));
        if (0.0 >= abs || abs >= 0.3499999940395355) {
            if (2.7899999618530273 >= abs) {
                return b;
            }
            if (abs >= 3.141592653589793) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    protected void resetState() {
        super.resetState();
        this.mSloppyGesture = false;
        this.mPrevAverageY = 0.0f;
        this.mCurrAverageY = 0.0f;
    }
    
    @Override
    protected void updateStateByEvent(final MotionEvent motionEvent) {
        super.updateStateByEvent(motionEvent);
        final MotionEvent mPrevEvent = this.mPrevEvent;
        final float y = mPrevEvent.getY(0);
        final int n = 1;
        final float n2 = y + mPrevEvent.getY(n);
        final float n3 = 2.0f;
        this.mPrevAverageY = n2 / n3;
        this.mCurrAverageY = (motionEvent.getY(0) + motionEvent.getY(n)) / n3;
    }
}
