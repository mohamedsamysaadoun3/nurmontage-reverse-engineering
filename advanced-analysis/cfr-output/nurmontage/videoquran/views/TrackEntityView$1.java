/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.util.List;

class TrackEntityView$1
implements Runnable {
    final /* synthetic */ TrackEntityView this$0;

    TrackEntityView$1(TrackEntityView trackEntityView) {
        this.this$0 = trackEntityView;
    }

    public void run() {
        Object object = this.this$0;
        int n = TrackEntityView.cfr_renamed_440(object);
        if (n != 0) {
            float f;
            long l = System.currentTimeMillis();
            long l2 = TrackEntityView.cfr_renamed_451(this.this$0);
            float f2 = (float)(l -= l2) / 180.0f;
            Object object2 = this.this$0;
            float f3 = TrackEntityView.cfr_renamed_428((TrackEntityView)((Object)object2));
            float f4 = 0.0f;
            TrackEntityView trackEntityView = null;
            float f5 = f3 - 0.0f;
            float f6 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
            if (f6 < 0) {
                f6 = -1082130432;
                f3 = -1.0f;
                f2 *= f3;
            }
            f3 = TrackEntityView.cfr_renamed_428(this.this$0);
            f2 += f3;
            object2 = TrackEntityView.cfr_renamed_449(this.this$0);
            if (object2 == null) {
                return;
            }
            object2 = TrackEntityView.cfr_renamed_449(this.this$0);
            f6 = ((Entity)object2).getTrim_type();
            int n2 = 1;
            float f7 = Float.MIN_VALUE;
            if (f6 == n2) {
                RectF rectF;
                List list;
                int n3;
                int n4;
                object2 = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                f3 = ((RectF)object2).right = (f = ((RectF)object2).right + f2);
                float f8 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                TrackEntityView trackEntityView2 = this.this$0;
                float f9 = (f3 -= f8) - (f8 = TrackEntityView.cfr_renamed_444(trackEntityView2));
                f6 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                if (f6 <= 0) {
                    object = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                    f4 = TrackEntityView.cfr_renamed_444(this.this$0);
                    ((RectF)object).right = f3 += f4;
                    object = TrackEntityView.cfr_renamed_449(this.this$0);
                    f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right;
                    ((Entity)object).setLastRight(f3);
                    this.this$0.invalidate();
                    TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                    return;
                }
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                f6 = (float)(object2 instanceof EntityQuranTimeline);
                if (f6 != false && (n4 = ((Entity)(object2 = (EntityQuranTimeline)TrackEntityView.cfr_renamed_449(this.this$0))).getIndex() + n2) < (n3 = (list = TrackEntityView.cfr_renamed_435(this.this$0)).size()) && (object2 = (trackEntityView2 = this.this$0).getPreviewOrNextEntityQuran(list = TrackEntityView.cfr_renamed_435(trackEntityView2), (int)(f6 = (float)(((Entity)object2).getIndex() + n2)), n2 != 0)) != null) {
                    trackEntityView2 = ((EntityQuranTimeline)object2).getRect();
                    f8 = ((RectF)trackEntityView2).left;
                    float f10 = f - f8;
                    n4 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    if (n4 > 0) {
                        object = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                        ((RectF)object).right = f3 = ((EntityQuranTimeline)object2).getRect().left;
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right;
                        ((Entity)object).setLastRight(f3);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        TrackEntityView.cfr_renamed_459(this.this$0, false);
                        this.this$0.invalidate();
                        return;
                    }
                }
                if ((f6 = (float)((object2 = TrackEntityView.cfr_renamed_449(this.this$0)) instanceof EntityTrslTimeline)) != false && (n4 = ((Entity)(object2 = (EntityTrslTimeline)TrackEntityView.cfr_renamed_449(this.this$0))).getIndex() + n2) < (n3 = (list = TrackEntityView.cfr_renamed_436(this.this$0)).size()) && (object2 = (trackEntityView2 = this.this$0).getPreviewOrNextEntityTrslQuran(list = TrackEntityView.cfr_renamed_436(trackEntityView2), (int)(f6 = (float)(((Entity)object2).getIndex() + n2)), n2 != 0)) != null) {
                    rectF = ((EntityTrslTimeline)object2).getRect();
                    f7 = rectF.left;
                    float f11 = f - f7;
                    n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (n2 > 0) {
                        object = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                        ((RectF)object).right = f3 = ((EntityTrslTimeline)object2).getRect().left;
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right;
                        ((Entity)object).setLastRight(f3);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        TrackEntityView.cfr_renamed_459(this.this$0, false);
                        this.this$0.invalidate();
                        return;
                    }
                }
                TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right = f;
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                rectF = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                f7 = rectF.right;
                ((Entity)object2).setLastRight(f7);
            } else {
                object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                f6 = ((Entity)object2).getTrim_type();
                if (f6 == false) {
                    RectF rectF;
                    List list;
                    int n5;
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    ((RectF)object2).left = f = ((RectF)object2).left + f2;
                    float f12 = f - 0.0f;
                    f6 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (f6 < 0) {
                        TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left = 0.0f;
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                        ((Entity)object).setLastLeft(f3);
                        TrackEntityView.cfr_renamed_449(this.this$0).updateStartTrim();
                        TrackEntityView.cfr_renamed_459(this.this$0, false);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        this.this$0.invalidate();
                        return;
                    }
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    f3 = ((RectF)object2).right - f;
                    TrackEntityView trackEntityView3 = this.this$0;
                    float f13 = TrackEntityView.cfr_renamed_444(trackEntityView3);
                    float f14 = f3 - f13;
                    f6 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    if (f6 <= 0) {
                        f2 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right;
                        f3 = TrackEntityView.cfr_renamed_444(this.this$0);
                        TrackEntityView.cfr_renamed_459(this.this$0, false);
                        TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left = f2 -= f3;
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                        ((Entity)object).setLastLeft(f3);
                        TrackEntityView.cfr_renamed_449(this.this$0).updateStartTrim();
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        this.this$0.invalidate();
                        return;
                    }
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                    f6 = (float)(object2 instanceof EntityQuranTimeline);
                    if (f6 != false && (n5 = ((Entity)(object2 = (EntityQuranTimeline)TrackEntityView.cfr_renamed_449(this.this$0))).getIndex()) > 0 && (object2 = (trackEntityView3 = this.this$0).getPreviewOrNextEntityQuran(list = TrackEntityView.cfr_renamed_435(trackEntityView3), (int)(f6 = (float)(((Entity)object2).getIndex() - n2)), false)) != null) {
                        trackEntityView3 = ((EntityQuranTimeline)object2).getRect();
                        f13 = ((RectF)trackEntityView3).right;
                        float f15 = f - f13;
                        n5 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                        if (n5 <= 0) {
                            object = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                            ((RectF)object).left = f3 = ((EntityQuranTimeline)object2).getRect().right;
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                            ((Entity)object).setLastLeft(f3);
                            TrackEntityView.cfr_renamed_449(this.this$0).updateStartTrim();
                            TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.cfr_renamed_459(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                    if ((f6 = (float)((object2 = TrackEntityView.cfr_renamed_449(this.this$0)) instanceof EntityTrslTimeline)) != false && (n5 = ((Entity)(object2 = (EntityTrslTimeline)TrackEntityView.cfr_renamed_449(this.this$0))).getIndex()) > 0 && (object2 = (trackEntityView3 = this.this$0).getPreviewOrNextEntityTrslQuran(list = TrackEntityView.cfr_renamed_436(trackEntityView3), (int)(f6 = (float)(((Entity)object2).getIndex() - n2)), false)) != null) {
                        rectF = ((EntityTrslTimeline)object2).getRect();
                        f7 = rectF.right;
                        float f16 = f - f7;
                        n2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        if (n2 <= 0) {
                            object = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                            ((RectF)object).left = f3 = ((EntityTrslTimeline)object2).getRect().right;
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f3 = TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left;
                            ((Entity)object).setLastLeft(f3);
                            TrackEntityView.cfr_renamed_449(this.this$0).updateStartTrim();
                            TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.cfr_renamed_459(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                    TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left = f;
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                    rectF = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
                    f7 = rectF.left;
                    ((Entity)object2).setLastLeft(f7);
                    object2 = TrackEntityView.cfr_renamed_449(this.this$0);
                    ((Entity)object2).updateStartTrim();
                }
            }
            object2 = this.this$0;
            f7 = TrackEntityView.cfr_renamed_433((TrackEntityView)((Object)object2));
            TrackEntityView trackEntityView4 = this.this$0;
            f = TrackEntityView.cfr_renamed_446(trackEntityView4);
            TrackEntityView.cfr_renamed_455((TrackEntityView)((Object)object2), f7 -= (f2 /= f));
            object = this.this$0;
            f2 = TrackEntityView.cfr_renamed_433(object);
            float f17 = f2 - 0.0f;
            n = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
            if (n > 0) {
                TrackEntityView.cfr_renamed_455(this.this$0, 0.0f);
                object = this.this$0;
                f3 = TrackEntityView.cfr_renamed_433(object);
                f4 = TrackEntityView.cfr_renamed_446(this.this$0);
                TrackEntityView.cfr_renamed_468(object, f3 *= f4);
                TrackEntityView.cfr_renamed_459(this.this$0, false);
                TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                this.this$0.invalidate();
                return;
            }
            object = this.this$0;
            f3 = TrackEntityView.cfr_renamed_433(object);
            trackEntityView = this.this$0;
            f4 = TrackEntityView.cfr_renamed_446(trackEntityView);
            TrackEntityView.cfr_renamed_468(object, f3 *= f4);
            this.this$0.invalidate();
            object = TrackEntityView.cfr_renamed_82(this.this$0);
            long l3 = 100;
            object.postDelayed(this, l3);
        }
    }
}

