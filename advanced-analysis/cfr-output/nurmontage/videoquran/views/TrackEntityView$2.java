/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.util.List;

class TrackEntityView$2
implements Runnable {
    final /* synthetic */ TrackEntityView this$0;

    TrackEntityView$2(TrackEntityView trackEntityView) {
        this.this$0 = trackEntityView;
    }

    public void run() {
        Object object = this.this$0;
        int n = TrackEntityView.cfr_renamed_439(object);
        if (n != 0) {
            float f;
            int n2;
            float f2;
            int n3;
            List list;
            Object object2;
            int n4;
            long l = System.currentTimeMillis();
            long l2 = TrackEntityView.cfr_renamed_451(this.this$0);
            float f3 = (float)(l -= l2) / 180.0f;
            TrackEntityView trackEntityView = this.this$0;
            float f4 = TrackEntityView.cfr_renamed_428(trackEntityView);
            float f5 = 0.0f;
            TrackEntityView trackEntityView2 = null;
            float f6 = f4 - 0.0f;
            float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (f7 < 0) {
                f7 = -1082130432;
                f4 = -1.0f;
                f3 *= f4;
            }
            f4 = TrackEntityView.cfr_renamed_428(this.this$0);
            f3 += f4;
            trackEntityView = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
            f4 = trackEntityView.width();
            RectF rectF = TrackEntityView.cfr_renamed_449(this.this$0).getRect();
            float f8 = rectF.left + f3;
            float f9 = f8 - 0.0f;
            float f10 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
            if (f10 < 0) {
                rectF = null;
                f8 = 0.0f;
            }
            float f11 = f8 + f4;
            Entity entity = TrackEntityView.cfr_renamed_449(this.this$0);
            int n5 = entity instanceof EntityQuranTimeline;
            int n6 = 1;
            if (n5 != 0) {
                entity = (EntityQuranTimeline)TrackEntityView.cfr_renamed_449(this.this$0);
                n4 = entity.getIndex();
                if (n4 > 0) {
                    object2 = this.this$0;
                    list = TrackEntityView.cfr_renamed_435((TrackEntityView)((Object)object2));
                    if ((object2 = ((TrackEntityView)((Object)object2)).getPreviewOrNextEntityQuran(list, n3 = entity.getIndex() - n6, false)) != null) {
                        list = ((EntityQuranTimeline)object2).getRect();
                        f2 = ((RectF)list).right;
                        float f12 = f8 - f2;
                        n2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                        if (n2 <= 0) {
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityQuranTimeline)object2).getRect().right;
                            ((Entity)object).setX(f5);
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityQuranTimeline)object2).getRect().right + f4;
                            ((Entity)object).setRight(f5);
                            TrackEntityView.cfr_renamed_466(this.this$0, false);
                            this.this$0.invalidate();
                            TrackEntityView.cfr_renamed_458(this.this$0, false);
                            TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                            return;
                        }
                    }
                }
                if ((n4 = entity.getIndex() + n6) < (n2 = (list = this.this$0.getEntityListQuran()).size()) && (entity = ((TrackEntityView)((Object)(object2 = this.this$0))).getPreviewOrNextEntityQuran(list = TrackEntityView.cfr_renamed_435((TrackEntityView)((Object)object2)), n5 = entity.getIndex() + n6, n6 != 0)) != null) {
                    object2 = ((EntityQuranTimeline)entity).getRect();
                    f = ((RectF)object2).left;
                    float f13 = f11 - f;
                    n4 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    if (n4 >= 0) {
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f5 = ((EntityQuranTimeline)entity).getRect().left - f4;
                        ((Entity)object).setX(f5);
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f4 = ((EntityQuranTimeline)entity).getRect().left;
                        ((Entity)object).setRight(f4);
                        TrackEntityView.cfr_renamed_466(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.cfr_renamed_458(this.this$0, false);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            if ((n5 = (entity = TrackEntityView.cfr_renamed_449(this.this$0)) instanceof EntityTrslTimeline) != 0) {
                entity = (EntityTrslTimeline)TrackEntityView.cfr_renamed_449(this.this$0);
                n4 = entity.getIndex();
                if (n4 > 0) {
                    object2 = this.this$0;
                    list = TrackEntityView.cfr_renamed_436((TrackEntityView)((Object)object2));
                    if ((object2 = ((TrackEntityView)((Object)object2)).getPreviewOrNextEntityTrslQuran(list, n3 = entity.getIndex() - n6, false)) != null) {
                        list = ((EntityTrslTimeline)object2).getRect();
                        f2 = ((RectF)list).right;
                        float f14 = f8 - f2;
                        n2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                        if (n2 <= 0) {
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityTrslTimeline)object2).getRect().right;
                            ((Entity)object).setX(f5);
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityTrslTimeline)object2).getRect().right + f4;
                            ((Entity)object).setRight(f5);
                            TrackEntityView.cfr_renamed_466(this.this$0, false);
                            this.this$0.invalidate();
                            TrackEntityView.cfr_renamed_458(this.this$0, false);
                            TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                            return;
                        }
                    }
                }
                if ((n4 = entity.getIndex() + n6) < (n2 = (list = this.this$0.getEntityListQuran()).size()) && (entity = ((TrackEntityView)((Object)(object2 = this.this$0))).getPreviewOrNextEntityQuran(list = TrackEntityView.cfr_renamed_435((TrackEntityView)((Object)object2)), n5 = entity.getIndex() + n6, n6 != 0)) != null) {
                    object2 = ((EntityQuranTimeline)entity).getRect();
                    f = ((RectF)object2).left;
                    float f15 = f11 - f;
                    n4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (n4 >= 0) {
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f5 = ((EntityQuranTimeline)entity).getRect().left - f4;
                        ((Entity)object).setX(f5);
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f4 = ((EntityQuranTimeline)entity).getRect().left;
                        ((Entity)object).setRight(f4);
                        TrackEntityView.cfr_renamed_466(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.cfr_renamed_458(this.this$0, false);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            if ((n5 = (entity = TrackEntityView.cfr_renamed_449(this.this$0)) instanceof EntityAudio) != 0) {
                entity = (EntityAudio)TrackEntityView.cfr_renamed_449(this.this$0);
                n4 = entity.getIndex();
                if (n4 > 0) {
                    object2 = this.this$0;
                    list = TrackEntityView.cfr_renamed_434((TrackEntityView)((Object)object2));
                    if ((object2 = ((TrackEntityView)((Object)object2)).getPreviewOrNextEntityAudio(list, n3 = entity.getIndex() - n6, false)) != null) {
                        list = ((EntityAudio)object2).getRect();
                        f2 = ((RectF)list).right;
                        float f16 = f8 - f2;
                        n2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        if (n2 <= 0) {
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityAudio)object2).getRect().right;
                            ((Entity)object).setX(f5);
                            object = TrackEntityView.cfr_renamed_449(this.this$0);
                            f5 = ((EntityAudio)object2).getRect().right + f4;
                            ((Entity)object).setRight(f5);
                            TrackEntityView.cfr_renamed_466(this.this$0, false);
                            this.this$0.invalidate();
                            TrackEntityView.cfr_renamed_458(this.this$0, false);
                            TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                            return;
                        }
                    }
                }
                if ((n4 = entity.getIndex() + n6) < (n2 = (list = this.this$0.getEntityListAudio()).size()) && (entity = ((TrackEntityView)((Object)(object2 = this.this$0))).getPreviewOrNextEntityAudio(list = TrackEntityView.cfr_renamed_434((TrackEntityView)((Object)object2)), n5 = entity.getIndex() + n6, n6 != 0)) != null) {
                    object2 = ((EntityAudio)entity).getRect();
                    f = ((RectF)object2).left;
                    float f17 = f11 - f;
                    n4 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                    if (n4 >= 0) {
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f5 = ((EntityAudio)entity).getRect().left - f4;
                        ((Entity)object).setX(f5);
                        object = TrackEntityView.cfr_renamed_449(this.this$0);
                        f4 = ((EntityAudio)entity).getRect().left;
                        ((Entity)object).setRight(f4);
                        TrackEntityView.cfr_renamed_466(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.cfr_renamed_458(this.this$0, false);
                        TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            trackEntityView = this.this$0;
            float f18 = TrackEntityView.cfr_renamed_433(trackEntityView);
            object2 = this.this$0;
            f = TrackEntityView.cfr_renamed_446((TrackEntityView)((Object)object2));
            TrackEntityView.cfr_renamed_455(trackEntityView, f18 -= (f3 /= f));
            object = this.this$0;
            f3 = TrackEntityView.cfr_renamed_433(object);
            float f19 = f3 - 0.0f;
            n = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            if (n > 0) {
                TrackEntityView.cfr_renamed_455(this.this$0, 0.0f);
                object = this.this$0;
                f4 = TrackEntityView.cfr_renamed_433(object);
                f5 = TrackEntityView.cfr_renamed_446(this.this$0);
                TrackEntityView.cfr_renamed_468(object, f4 *= f5);
                TrackEntityView.cfr_renamed_458(this.this$0, false);
                TrackEntityView.cfr_renamed_82(this.this$0).removeCallbacks((Runnable)this);
                this.this$0.invalidate();
                return;
            }
            object = this.this$0;
            f4 = TrackEntityView.cfr_renamed_433(object);
            trackEntityView2 = this.this$0;
            f5 = TrackEntityView.cfr_renamed_446(trackEntityView2);
            TrackEntityView.cfr_renamed_468(object, f4 *= f5);
            TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().left = f8;
            TrackEntityView.cfr_renamed_449((TrackEntityView)this.this$0).getRect().right = f11;
            TrackEntityView.cfr_renamed_462(this.this$0, n6 != 0);
            this.this$0.invalidate();
            object = TrackEntityView.cfr_renamed_82(this.this$0);
            long l3 = 100;
            object.postDelayed(this, l3);
        }
    }
}

