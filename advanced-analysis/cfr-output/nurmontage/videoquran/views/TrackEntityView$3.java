/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.widget.Scroller
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Scroller;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class TrackEntityView$3
extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ TrackEntityView this$0;

    TrackEntityView$3(TrackEntityView trackEntityView) {
        this.this$0 = trackEntityView;
    }

    public boolean onDown(MotionEvent object) {
        this.this$0.pauseScroll();
        float f = object.getX();
        float f2 = object.getY();
        Object object2 = new PointF(f, f2);
        object = this.this$0;
        int n = 1;
        f = Float.MIN_VALUE;
        TrackEntityView.cfr_renamed_463((TrackEntityView)((Object)object), n != 0);
        object = TrackEntityView.cfr_renamed_449(this.this$0);
        if (object != null) {
            float f3;
            int n2;
            Entity entity;
            int n3;
            object = TrackEntityView.cfr_renamed_449(this.this$0);
            boolean bl = ((Entity)object).contains((PointF)object2);
            object2 = this.this$0;
            if (!bl && (n3 = (entity = TrackEntityView.cfr_renamed_449((TrackEntityView)((Object)object2))).getTrim_type()) == (n2 = -1)) {
                n3 = n;
                f3 = f;
            } else {
                n3 = 0;
                f3 = 0.0f;
                entity = null;
            }
            TrackEntityView.cfr_renamed_463((TrackEntityView)((Object)object2), n3 != 0);
            TrackEntityView.cfr_renamed_449(this.this$0).setSelect(n != 0);
            object2 = this.this$0;
            int n4 = TrackEntityView.cfr_renamed_441((TrackEntityView)((Object)object2));
            if (n4 == 0 && (object2 = TrackEntityView.cfr_renamed_73(this.this$0)) != null) {
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                n4 = ((Entity)object2).getTrim_type();
                if (n4 == 0) {
                    TrackEntityView.cfr_renamed_449(this.this$0).setCurrentRect();
                    object = TrackEntityView.cfr_renamed_449(this.this$0);
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    float f4 = ((RectF)object2).left;
                    f3 = this.this$0.getSecond_in_screen();
                    n4 = Math.round(f4 / f3) * 1000;
                    f4 = n4;
                    entity = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    f3 = ((RectF)entity).left;
                    ((Entity)object).setOnTapTime(f4, f3);
                    object = TrackEntityView.cfr_renamed_73(this.this$0);
                    object.onPlayVibration();
                } else {
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                    n4 = ((Entity)object2).getTrim_type();
                    if (n4 == n) {
                        TrackEntityView.cfr_renamed_449(this.this$0).setCurrentRect();
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        object2 = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                        float f5 = ((RectF)object2).right;
                        f3 = this.this$0.getSecond_in_screen();
                        n4 = Math.round(f5 / f3) * 1000;
                        f5 = n4;
                        entity = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                        f3 = ((RectF)entity).right;
                        ((Entity)object).setOnTapTime(f5, f3);
                        object = TrackEntityView.cfr_renamed_73(this.this$0);
                        object.onPlayVibration();
                    } else if (bl) {
                        TrackEntityView.cfr_renamed_449(this.this$0).setCurrentRect();
                        object = TrackEntityView.cfr_renamed_73(this.this$0);
                        object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                        n3 = 0;
                        f3 = 0.0f;
                        entity = null;
                        object.onSelectEntity((Entity)object2, 0.0f);
                    }
                }
            }
        }
        return n != 0;
    }

    public boolean onFling(MotionEvent object, MotionEvent motionEvent, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        Scroller scroller;
        TrackEntityView trackEntityView = this.this$0;
        int n = TrackEntityView.cfr_renamed_442(trackEntityView);
        boolean bl = true;
        if (n != 0) {
            return bl;
        }
        trackEntityView = this.this$0;
        n = trackEntityView.isPlaying();
        if (n != 0) {
            trackEntityView = this.this$0;
            scroller = null;
            trackEntityView.setPlaying(false);
        }
        long l = motionEvent.getEventTime();
        long l2 = object.getEventTime();
        long l3 = (l -= l2) - (l2 = (long)107);
        n = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (n > 0) {
            return bl;
        }
        trackEntityView = this.this$0;
        float f7 = TrackEntityView.cfr_renamed_437(trackEntityView);
        scroller = null;
        float f8 = f7 - 0.0f;
        n = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (n == 0) {
            trackEntityView = this.this$0;
            f6 = object.getRawX();
            TrackEntityView.cfr_renamed_456(trackEntityView, f6);
            trackEntityView = this.this$0;
            f6 = object.getRawY();
            TrackEntityView.cfr_renamed_457(trackEntityView, f6);
        }
        f7 = motionEvent.getRawX();
        TrackEntityView trackEntityView2 = this.this$0;
        f6 = TrackEntityView.cfr_renamed_437(trackEntityView2);
        f7 = Math.abs(f7 - f6);
        f6 = motionEvent.getRawY();
        float f9 = TrackEntityView.cfr_renamed_438(this.this$0);
        f6 = Math.abs(f6 - f9);
        TrackEntityView trackEntityView3 = this.this$0;
        float f10 = motionEvent.getRawX();
        TrackEntityView.cfr_renamed_456(trackEntityView3, f10);
        trackEntityView3 = this.this$0;
        f10 = motionEvent.getRawY();
        TrackEntityView.cfr_renamed_457(trackEntityView3, f10);
        float f11 = motionEvent.getRawX();
        float f12 = object.getRawX();
        float f13 = f11 == f12 ? 0 : (f11 < f12 ? -1 : 1);
        if (f13 <= 0 ? (f13 = (f5 = f - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0 : (f13 = (f4 = f - 0.0f) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1)) < 0) {
            f13 = -1082130432;
            f12 = -1.0f;
            f *= f12;
        }
        if ((f13 = (f3 = f6 - (f7 *= (f12 = 1.2f))) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1)) > 0) {
            TrackEntityView.cfr_renamed_469(this.this$0, f2);
            object = this.this$0;
            object.flingY();
        } else {
            scroller = TrackEntityView.cfr_renamed_448(this.this$0);
            int n2 = (int)TrackEntityView.cfr_renamed_433(this.this$0);
            int n3 = (int)f;
            f12 = -TrackEntityView.cfr_renamed_450(this.this$0);
            int n4 = (int)f12;
            f9 = 0.0f;
            trackEntityView3 = null;
            scroller.fling(n2, 0, n3, 0, n4, 0, 0, 0);
            object = this.this$0;
            object.invalidate();
        }
        return bl;
    }

    public boolean onScroll(MotionEvent object, MotionEvent motionEvent, float f, float f2) {
        block9: {
            float f3;
            Object object2;
            block10: {
                object2 = this.this$0;
                int n = TrackEntityView.cfr_renamed_442(object2);
                if (n != 0 || (n = TrackEntityView.cfr_renamed_441(object2 = this.this$0)) == 0) break block9;
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                if (object2 == null) break block10;
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                n = ((Entity)object2).getTrim_type();
                int n2 = -1;
                f3 = 0.0f / 0.0f;
                if (n != n2) break block9;
            }
            TrackEntityView trackEntityView = this.this$0;
            boolean bl = TrackEntityView.cfr_renamed_443(trackEntityView);
            boolean bl2 = true;
            f2 = Float.MIN_VALUE;
            if (!bl) {
                long l = motionEvent.getEventTime();
                long l2 = object.getEventTime();
                long l3 = (l -= l2) - (l2 = (long)107);
                long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (l4 >= 0 && (l4 = (long)(object = this.this$0).isPass(motionEvent)) != false) {
                    object = this.this$0;
                    l4 = (long)object.isPlaying();
                    if (l4 != false) {
                        object = this.this$0;
                        bl = false;
                        f = 0.0f;
                        trackEntityView = null;
                        object.setPlaying(false);
                    }
                    object = this.this$0;
                    float f4 = TrackEntityView.cfr_renamed_437((TrackEntityView)((Object)object));
                    bl = false;
                    f = 0.0f;
                    trackEntityView = null;
                    float f5 = f4 - 0.0f;
                    l4 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                    if (l4 == false) {
                        object = this.this$0;
                        f = motionEvent.getRawX();
                        TrackEntityView.cfr_renamed_456((TrackEntityView)((Object)object), f);
                        object = this.this$0;
                        float f6 = motionEvent.getRawY();
                        TrackEntityView.cfr_renamed_457((TrackEntityView)((Object)object), f6);
                        return bl2;
                    }
                    f4 = motionEvent.getRawX();
                    float f7 = TrackEntityView.cfr_renamed_437(this.this$0);
                    f4 -= f7;
                    object2 = this.this$0;
                    f3 = TrackEntityView.cfr_renamed_433(object2);
                    TrackEntityView trackEntityView2 = this.this$0;
                    float f8 = TrackEntityView.cfr_renamed_446(trackEntityView2);
                    TrackEntityView.cfr_renamed_455(object2, f3 += (f4 /= f8));
                    object = this.this$0;
                    f4 = TrackEntityView.cfr_renamed_433((TrackEntityView)((Object)object));
                    float f9 = f4 - 0.0f;
                    l4 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                    if (l4 > 0) {
                        object = this.this$0;
                        TrackEntityView.cfr_renamed_455((TrackEntityView)((Object)object), 0.0f);
                    }
                    object = this.this$0;
                    f = TrackEntityView.cfr_renamed_433((TrackEntityView)((Object)object));
                    object2 = this.this$0;
                    f7 = TrackEntityView.cfr_renamed_446(object2);
                    TrackEntityView.cfr_renamed_468((TrackEntityView)((Object)object), f *= f7);
                    object = TrackEntityView.cfr_renamed_73(this.this$0);
                    if (object != null) {
                        object = TrackEntityView.cfr_renamed_73(this.this$0);
                        trackEntityView = this.this$0;
                        f = TrackEntityView.cfr_renamed_447(trackEntityView);
                        object.onSeekPlayer(f);
                    }
                    object = this.this$0;
                    f = motionEvent.getRawX();
                    TrackEntityView.cfr_renamed_456((TrackEntityView)((Object)object), f);
                    object = this.this$0;
                    float f10 = motionEvent.getRawY();
                    TrackEntityView.cfr_renamed_457((TrackEntityView)((Object)object), f10);
                    object = this.this$0;
                    object.invalidate();
                }
            }
            return bl2;
        }
        return super.onScroll(object, motionEvent, f, f2);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        TrackEntityView trackEntityView = this.this$0;
        int n = trackEntityView.isPlaying();
        boolean bl = true;
        if (n == 0) {
            float f = motionEvent.getX();
            int n2 = this.this$0.getPaddingLeft();
            float f2 = n2;
            f += f2;
            f2 = TrackEntityView.cfr_renamed_429(this.this$0);
            float f3 = TrackEntityView.cfr_renamed_445(this.this$0);
            float f4 = 0.5f;
            f2 -= (f3 *= f4);
            TrackEntityView trackEntityView2 = this.this$0;
            f3 = TrackEntityView.cfr_renamed_447(trackEntityView2);
            TrackEntityView trackEntityView3 = this.this$0;
            n = TrackEntityView.cfr_renamed_470(trackEntityView3, f += (f2 += f3), f3 = motionEvent.getY()) ? 1 : 0;
            if (n != 0) {
                return bl;
            }
        } else {
            trackEntityView = this.this$0;
            n = TrackEntityView.cfr_renamed_431(trackEntityView);
            int n3 = -13421771;
            float f = -2.381977E38f;
            if (n != n3 || (n = TrackEntityView.cfr_renamed_430(trackEntityView = this.this$0)) != n3 || (n = TrackEntityView.cfr_renamed_432(trackEntityView = this.this$0)) != n3) {
                trackEntityView = this.this$0;
                TrackEntityView.cfr_renamed_454(trackEntityView, n3);
                TrackEntityView.cfr_renamed_453(trackEntityView, n3);
                TrackEntityView.cfr_renamed_452(trackEntityView, n3);
            }
        }
        if ((n = (int)(TrackEntityView.cfr_renamed_441(trackEntityView = this.this$0) ? 1 : 0)) != 0) {
            trackEntityView = this.this$0;
            trackEntityView.updateSelectionOnTap(motionEvent);
        }
        return bl;
    }
}

