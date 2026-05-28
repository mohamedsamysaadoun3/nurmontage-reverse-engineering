// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.multitouch;

import android.view.MotionEvent;
import android.content.Context;

public abstract class BaseGestureDetector
{
    protected static final float PRESSURE_THRESHOLD = 0.67f;
    protected final Context mContext;
    protected MotionEvent mCurrEvent;
    protected float mCurrPressure;
    protected boolean mGestureInProgress;
    protected MotionEvent mPrevEvent;
    protected float mPrevPressure;
    protected long mTimeDelta;
    
    public BaseGestureDetector(final Context mContext) {
        this.mContext = mContext;
    }
    
    public long getEventTime() {
        return this.mCurrEvent.getEventTime();
    }
    
    public long getTimeDelta() {
        return this.mTimeDelta;
    }
    
    protected abstract void handleInProgressEvent(final int p0, final MotionEvent p1);
    
    protected abstract void handleStartProgressEvent(final int p0, final MotionEvent p1);
    
    public boolean isInProgress() {
        return this.mGestureInProgress;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        final int n = 1;
        if (pointerCount > n) {
            return false;
        }
        final int n2 = motionEvent.getAction() & 0xFF;
        if (!this.mGestureInProgress) {
            this.handleStartProgressEvent(n2, motionEvent);
        }
        else {
            this.handleInProgressEvent(n2, motionEvent);
        }
        return n != 0;
    }
    
    protected void resetState() {
        final MotionEvent mPrevEvent = this.mPrevEvent;
        if (mPrevEvent != null) {
            mPrevEvent.recycle();
            this.mPrevEvent = null;
        }
        final MotionEvent mCurrEvent = this.mCurrEvent;
        if (mCurrEvent != null) {
            mCurrEvent.recycle();
            this.mCurrEvent = null;
        }
        this.mGestureInProgress = false;
    }
    
    protected void updateStateByEvent(final MotionEvent motionEvent) {
        final MotionEvent mPrevEvent = this.mPrevEvent;
        final MotionEvent mCurrEvent = this.mCurrEvent;
        if (mCurrEvent != null) {
            mCurrEvent.recycle();
            this.mCurrEvent = null;
        }
        this.mCurrEvent = MotionEvent.obtain(motionEvent);
        this.mTimeDelta = motionEvent.getEventTime() - mPrevEvent.getEventTime();
        this.mCurrPressure = motionEvent.getPressure(motionEvent.getActionIndex());
        this.mPrevPressure = mPrevEvent.getPressure(mPrevEvent.getActionIndex());
    }
}
