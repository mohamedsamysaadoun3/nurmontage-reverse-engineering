// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.multitouch;

import android.view.MotionEvent;
import android.content.Context;
import android.graphics.PointF;

public class MoveGestureDetector extends BaseGestureDetector
{
    private static final PointF FOCUS_DELTA_ZERO;
    private PointF mCurrFocusInternal;
    private PointF mFocusDeltaExternal;
    private PointF mFocusExternal;
    private final MoveGestureDetector$OnMoveGestureListener mListener;
    private PointF mPrevFocusInternal;
    
    static {
        FOCUS_DELTA_ZERO = new PointF();
    }
    
    public MoveGestureDetector(final Context context, final MoveGestureDetector$OnMoveGestureListener mListener) {
        super(context);
        this.mFocusExternal = new PointF();
        this.mFocusDeltaExternal = new PointF();
        this.mListener = mListener;
    }
    
    private PointF determineFocalPoint(final MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        float n = 0.0f;
        int i = 0;
        float n2 = 0.0f;
        while (i < pointerCount) {
            n += motionEvent.getX(i);
            n2 += motionEvent.getY(i);
            ++i;
        }
        final float n3 = (float)pointerCount;
        return new PointF(n / n3, n2 / n3);
    }
    
    public PointF getFocusDelta() {
        return this.mFocusDeltaExternal;
    }
    
    public float getFocusX() {
        return this.mFocusExternal.x;
    }
    
    public float getFocusY() {
        return this.mFocusExternal.y;
    }
    
    @Override
    protected void handleInProgressEvent(int onMove, final MotionEvent motionEvent) {
        if (onMove != 1) {
            if (onMove != 2) {
                if (onMove != 3) {
                    return;
                }
            }
            else {
                this.updateStateByEvent(motionEvent);
                onMove = fcmpl(this.mCurrPressure / this.mPrevPressure, 0.67f);
                if (onMove <= 0) {
                    return;
                }
                onMove = (this.mListener.onMove(this) ? 1 : 0);
                if (onMove != 0) {
                    this.mPrevEvent.recycle();
                    this.mPrevEvent = MotionEvent.obtain(motionEvent);
                }
                return;
            }
        }
        this.mListener.onMoveEnd(this);
        this.resetState();
    }
    
    @Override
    protected void handleStartProgressEvent(int onMoveBegin, final MotionEvent motionEvent) {
        if (onMoveBegin != 0) {
            if (onMoveBegin == 2) {
                onMoveBegin = (this.mListener.onMoveBegin(this) ? 1 : 0);
                this.mGestureInProgress = (onMoveBegin != 0);
            }
        }
        else {
            this.resetState();
            this.mPrevEvent = MotionEvent.obtain(motionEvent);
            this.mTimeDelta = 0L;
            this.updateStateByEvent(motionEvent);
        }
    }
    
    @Override
    protected void updateStateByEvent(final MotionEvent motionEvent) {
        super.updateStateByEvent(motionEvent);
        final MotionEvent mPrevEvent = this.mPrevEvent;
        this.mCurrFocusInternal = this.determineFocalPoint(motionEvent);
        this.mPrevFocusInternal = this.determineFocalPoint(mPrevEvent);
        PointF focus_DELTA_ZERO;
        if (mPrevEvent.getPointerCount() != motionEvent.getPointerCount()) {
            focus_DELTA_ZERO = MoveGestureDetector.FOCUS_DELTA_ZERO;
        }
        else {
            focus_DELTA_ZERO = new PointF(this.mCurrFocusInternal.x - this.mPrevFocusInternal.x, this.mCurrFocusInternal.y - this.mPrevFocusInternal.y);
        }
        this.mFocusDeltaExternal = focus_DELTA_ZERO;
        final PointF mFocusExternal = this.mFocusExternal;
        mFocusExternal.x += this.mFocusDeltaExternal.x;
        final PointF mFocusExternal2 = this.mFocusExternal;
        mFocusExternal2.y += this.mFocusDeltaExternal.y;
    }
}
