// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.multitouch;

import android.view.MotionEvent;
import android.content.Context;

public class RotateGestureDetector extends TwoFingerGestureDetector
{
    private final RotateGestureDetector$OnRotateGestureListener mListener;
    private boolean mSloppyGesture;
    
    public RotateGestureDetector(final Context context, final RotateGestureDetector$OnRotateGestureListener mListener) {
        super(context);
        this.mListener = mListener;
    }
    
    public float getRotationDegreesDelta() {
        return (float)((Math.atan2(this.mPrevFingerDiffY, this.mPrevFingerDiffX) - Math.atan2(this.mCurrFingerDiffY, this.mCurrFingerDiffX)) * 180.0 / 3.141592653589793);
    }
    
    @Override
    protected void handleInProgressEvent(int n, final MotionEvent motionEvent) {
        if (n != 2) {
            if (n != 3) {
                if (n == 6) {
                    this.updateStateByEvent(motionEvent);
                    n = (this.mSloppyGesture ? 1 : 0);
                    if (n == 0) {
                        this.mListener.onRotateEnd(this);
                    }
                    this.resetState();
                }
            }
            else {
                n = (this.mSloppyGesture ? 1 : 0);
                if (n == 0) {
                    this.mListener.onRotateEnd(this);
                }
                this.resetState();
            }
        }
        else {
            this.updateStateByEvent(motionEvent);
            n = fcmpl(this.mCurrPressure / this.mPrevPressure, 0.67f);
            if (n > 0) {
                n = (this.mListener.onRotate(this) ? 1 : 0);
                if (n != 0) {
                    this.mPrevEvent.recycle();
                    this.mPrevEvent = MotionEvent.obtain(motionEvent);
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
                    n = (this.mListener.onRotateBegin(this) ? 1 : 0);
                    this.mGestureInProgress = (n != 0);
                }
            }
        }
        else {
            n = (this.mSloppyGesture ? 1 : 0);
            if (n != 0) {
                n = (this.isSloppyGesture(motionEvent) ? 1 : 0);
                if (!(this.mSloppyGesture = (n != 0))) {
                    n = (this.mListener.onRotateBegin(this) ? 1 : 0);
                    this.mGestureInProgress = (n != 0);
                }
            }
        }
    }
    
    @Override
    protected void resetState() {
        super.resetState();
        this.mSloppyGesture = false;
    }
}
