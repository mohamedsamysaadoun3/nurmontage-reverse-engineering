package hazem.nurmontage.videoquran.multitouch;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class MoveGestureDetector extends BaseGestureDetector {
    private static final PointF FOCUS_DELTA_ZERO = new PointF();
    private PointF mCurrFocusInternal;
    private PointF mFocusDeltaExternal;
    private PointF mFocusExternal;
    private final OnMoveGestureListener mListener;
    private PointF mPrevFocusInternal;

    public interface OnMoveGestureListener {
        boolean onMove(MoveGestureDetector moveGestureDetector);

        boolean onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector);
    }

    public static class SimpleOnMoveGestureListener implements OnMoveGestureListener {
        @Override // hazem.nurmontage.videoquran.multitouch.MoveGestureDetector.OnMoveGestureListener
        public boolean onMove(MoveGestureDetector moveGestureDetector) {
            return false;
        }

        @Override // hazem.nurmontage.videoquran.multitouch.MoveGestureDetector.OnMoveGestureListener
        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            return true;
        }

        @Override // hazem.nurmontage.videoquran.multitouch.MoveGestureDetector.OnMoveGestureListener
        public void onMoveEnd(MoveGestureDetector moveGestureDetector) {
        }
    }

    public MoveGestureDetector(Context context, OnMoveGestureListener onMoveGestureListener) {
        super(context);
        this.mFocusExternal = new PointF();
        this.mFocusDeltaExternal = new PointF();
        this.mListener = onMoveGestureListener;
    }

    @Override // hazem.nurmontage.videoquran.multitouch.BaseGestureDetector
    protected void handleStartProgressEvent(int resourceId, MotionEvent motionEvent) {
        if (resourceId != 0) {
            if (resourceId != 2) {
                return;
            }
            this.mGestureInProgress = this.mListener.onMoveBegin(this);
        } else {
            resetState();
            this.mPrevEvent = MotionEvent.obtain(motionEvent);
            this.mTimeDelta = 0L;
            updateStateByEvent(motionEvent);
        }
    }

    @Override // hazem.nurmontage.videoquran.multitouch.BaseGestureDetector
    protected void handleInProgressEvent(int resourceId, MotionEvent motionEvent) {
        if (resourceId != 1) {
            if (resourceId == 2) {
                updateStateByEvent(motionEvent);
                if (this.mCurrPressure / this.mPrevPressure <= 0.67f || !this.mListener.onMove(this)) {
                    return;
                }
                this.mPrevEvent.recycle();
                this.mPrevEvent = MotionEvent.obtain(motionEvent);
                return;
            }
            if (resourceId != 3) {
                return;
            }
        }
        this.mListener.onMoveEnd(this);
        resetState();
    }

    @Override // hazem.nurmontage.videoquran.multitouch.BaseGestureDetector
    protected void updateStateByEvent(MotionEvent motionEvent) {
        super.updateStateByEvent(motionEvent);
        MotionEvent motionEvent2 = this.mPrevEvent;
        this.mCurrFocusInternal = determineFocalPoint(motionEvent);
        this.mPrevFocusInternal = determineFocalPoint(motionEvent2);
        this.mFocusDeltaExternal = motionEvent2.getPointerCount() != motionEvent.getPointerCount() ? FOCUS_DELTA_ZERO : new PointF(this.mCurrFocusInternal.x - this.mPrevFocusInternal.x, this.mCurrFocusInternal.y - this.mPrevFocusInternal.y);
        this.mFocusExternal.x += this.mFocusDeltaExternal.x;
        this.mFocusExternal.y += this.mFocusDeltaExternal.y;
    }

    private PointF determineFocalPoint(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float value12 = 0.0f;
        for (int counter = 0; counter < pointerCount; counter++) {
            f += motionEvent.getX(counter);
            value12 += motionEvent.getY(counter);
        }
        float value = pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    public float getFocusX() {
        return this.mFocusExternal.x;
    }

    public float getFocusY() {
        return this.mFocusExternal.y;
    }

    public PointF getFocusDelta() {
        return this.mFocusDeltaExternal;
    }
}
