// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

class TrackEntityView$3 extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ TrackEntityView this$0;
    
    TrackEntityView$3(final TrackEntityView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        this.this$0.pauseScroll();
        final PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        final TrackEntityView this$0 = this.this$0;
        final boolean select = true;
        TrackEntityView.-$$Nest$fputisPassScroll(this$0, select);
        if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) != null) {
            final boolean contains = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).contains(pointF);
            final TrackEntityView this$2 = this.this$0;
            TrackEntityView.-$$Nest$fputisPassScroll(this$2, !contains && TrackEntityView.-$$Nest$fgetselectedEntity(this$2).getTrim_type() == -1 && select);
            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setSelect(select);
            if (!TrackEntityView.-$$Nest$fgetisPassScroll(this.this$0) && TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0) != null) {
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getTrim_type() == 0) {
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setCurrentRect();
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setOnTapTime((float)(Math.round(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left / this.this$0.getSecond_in_screen()) * 1000), TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                    TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0).onPlayVibration();
                }
                else if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getTrim_type() == (select ? 1 : 0)) {
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setCurrentRect();
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setOnTapTime((float)(Math.round(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right / this.this$0.getSecond_in_screen()) * 1000), TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right);
                    TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0).onPlayVibration();
                }
                else if (contains) {
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setCurrentRect();
                    TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0), 0.0f);
                }
            }
        }
        return select;
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, final float n2) {
        final boolean -$$Nest$fgetisProgress = TrackEntityView.-$$Nest$fgetisProgress(this.this$0);
        final boolean b = true;
        if (-$$Nest$fgetisProgress) {
            return b;
        }
        if (this.this$0.isPlaying()) {
            this.this$0.setPlaying(false);
        }
        if (motionEvent2.getEventTime() - motionEvent.getEventTime() > 107) {
            return b;
        }
        if (TrackEntityView.-$$Nest$fgeteventX(this.this$0) == 0.0f) {
            TrackEntityView.-$$Nest$fputeventX(this.this$0, motionEvent.getRawX());
            TrackEntityView.-$$Nest$fputeventY(this.this$0, motionEvent.getRawY());
        }
        final float abs = Math.abs(motionEvent2.getRawX() - TrackEntityView.-$$Nest$fgeteventX(this.this$0));
        final float abs2 = Math.abs(motionEvent2.getRawY() - TrackEntityView.-$$Nest$fgeteventY(this.this$0));
        TrackEntityView.-$$Nest$fputeventX(this.this$0, motionEvent2.getRawX());
        TrackEntityView.-$$Nest$fputeventY(this.this$0, motionEvent2.getRawY());
        Label_0313: {
            if (motionEvent2.getRawX() <= motionEvent.getRawX()) {
                if (n <= 0.0f) {
                    break Label_0313;
                }
            }
            else if (n >= 0.0f) {
                break Label_0313;
            }
            n *= -1.0f;
        }
        if (abs2 > abs * 1.2f) {
            TrackEntityView.-$$Nest$fputtarget(this.this$0, n2);
            this.this$0.flingY();
        }
        else {
            TrackEntityView.-$$Nest$fgetscroller(this.this$0).fling((int)TrackEntityView.-$$Nest$fgetcurrentPosition(this.this$0), 0, (int)n, 0, (int)(-TrackEntityView.-$$Nest$fgettimeLineW(this.this$0)), 0, 0, 0);
            this.this$0.invalidate();
        }
        return b;
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, float n2) {
        if (!TrackEntityView.-$$Nest$fgetisProgress(this.this$0) && TrackEntityView.-$$Nest$fgetisPassScroll(this.this$0) && (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) == null || TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getTrim_type() == -1)) {
            final boolean -$$Nest$fgetisScaleListener = TrackEntityView.-$$Nest$fgetisScaleListener(this.this$0);
            final boolean b = true;
            n2 = Float.MIN_VALUE;
            if (!-$$Nest$fgetisScaleListener && motionEvent2.getEventTime() - motionEvent.getEventTime() >= 107) {
                if (this.this$0.isPass(motionEvent2)) {
                    if (this.this$0.isPlaying()) {
                        final TrackEntityView this$0 = this.this$0;
                        n = 0.0f;
                        this$0.setPlaying(false);
                    }
                    final float -$$Nest$fgeteventX = TrackEntityView.-$$Nest$fgeteventX(this.this$0);
                    n = 0.0f;
                    if (-$$Nest$fgeteventX == 0.0f) {
                        final TrackEntityView this$2 = this.this$0;
                        n = motionEvent2.getRawX();
                        TrackEntityView.-$$Nest$fputeventX(this$2, n);
                        TrackEntityView.-$$Nest$fputeventY(this.this$0, motionEvent2.getRawY());
                        return b;
                    }
                    final float n3 = motionEvent2.getRawX() - TrackEntityView.-$$Nest$fgeteventX(this.this$0);
                    final TrackEntityView this$3 = this.this$0;
                    TrackEntityView.-$$Nest$fputcurrentPosition(this$3, TrackEntityView.-$$Nest$fgetcurrentPosition(this$3) + n3 / TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
                    if (TrackEntityView.-$$Nest$fgetcurrentPosition(this.this$0) > 0.0f) {
                        TrackEntityView.-$$Nest$fputcurrentPosition(this.this$0, 0.0f);
                    }
                    final TrackEntityView this$4 = this.this$0;
                    n = TrackEntityView.-$$Nest$fgetcurrentPosition(this$4);
                    n *= TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0);
                    TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$4, n);
                    if (TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0) != null) {
                        final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0);
                        n = TrackEntityView.-$$Nest$fgetscrolled_with_zoom(this.this$0);
                        -$$Nest$fgetiTrimLineCallback.onSeekPlayer(n);
                    }
                    final TrackEntityView this$5 = this.this$0;
                    n = motionEvent2.getRawX();
                    TrackEntityView.-$$Nest$fputeventX(this$5, n);
                    TrackEntityView.-$$Nest$fputeventY(this.this$0, motionEvent2.getRawY());
                    this.this$0.invalidate();
                }
            }
            return b;
        }
        return super.onScroll(motionEvent, motionEvent2, n, n2);
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        final boolean playing = this.this$0.isPlaying();
        final boolean b = true;
        if (!playing) {
            if (TrackEntityView.-$$Nest$mhandleItemInteraction(this.this$0, motionEvent.getX() + this.this$0.getPaddingLeft() + (TrackEntityView.-$$Nest$fgetcenterX(this.this$0) - TrackEntityView.-$$Nest$fgetradius(this.this$0) * 0.5f + TrackEntityView.-$$Nest$fgetscrolled_with_zoom(this.this$0)), motionEvent.getY())) {
                return b;
            }
        }
        else {
            final int -$$Nest$fgetclr_btn_quran = TrackEntityView.-$$Nest$fgetclr_btn_quran(this.this$0);
            final int n = -13421771;
            if (-$$Nest$fgetclr_btn_quran != n || TrackEntityView.-$$Nest$fgetclr_btn_audio(this.this$0) != n || TrackEntityView.-$$Nest$fgetclr_btn_trsl(this.this$0) != n) {
                final TrackEntityView this$0 = this.this$0;
                TrackEntityView.-$$Nest$fputclr_btn_trsl(this$0, n);
                TrackEntityView.-$$Nest$fputclr_btn_quran(this$0, n);
                TrackEntityView.-$$Nest$fputclr_btn_audio(this$0, n);
            }
        }
        if (TrackEntityView.-$$Nest$fgetisPassScroll(this.this$0)) {
            this.this$0.updateSelectionOnTap(motionEvent);
        }
        return b;
    }
}
