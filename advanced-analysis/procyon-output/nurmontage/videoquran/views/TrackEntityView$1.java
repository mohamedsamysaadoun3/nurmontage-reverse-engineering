// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

class TrackEntityView$1 implements Runnable
{
    final /* synthetic */ TrackEntityView this$0;
    
    TrackEntityView$1(final TrackEntityView this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (TrackEntityView.-$$Nest$fgetisAutoScroll(this.this$0)) {
            float n = (System.currentTimeMillis() - TrackEntityView.-$$Nest$fgettime_start(this.this$0)) / 180.0f;
            if (TrackEntityView.-$$Nest$fgetSPEED(this.this$0) < 0.0f) {
                n *= -1.0f;
            }
            final float n2 = n + TrackEntityView.-$$Nest$fgetSPEED(this.this$0);
            if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) == null) {
                return;
            }
            final int trim_type = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getTrim_type();
            final int n3 = 1;
            if (trim_type == n3) {
                final RectF rect = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect();
                final float n4 = rect.right + n2;
                rect.right = n4;
                if (rect.right - TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left <= TrackEntityView.-$$Nest$fgetmax_trim(this.this$0)) {
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left + TrackEntityView.-$$Nest$fgetmax_trim(this.this$0);
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastRight(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right);
                    this.this$0.invalidate();
                    TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                    return;
                }
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityQuranTimeline) {
                    final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                    if (entityQuranTimeline.getIndex() + n3 < TrackEntityView.-$$Nest$fgetentityListQuran(this.this$0).size()) {
                        final TrackEntityView this$0 = this.this$0;
                        final EntityQuranTimeline previewOrNextEntityQuran = this$0.getPreviewOrNextEntityQuran(TrackEntityView.-$$Nest$fgetentityListQuran(this$0), entityQuranTimeline.getIndex() + n3, (boolean)(n3 != 0));
                        if (previewOrNextEntityQuran != null && n4 > previewOrNextEntityQuran.getRect().left) {
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right = previewOrNextEntityQuran.getRect().left;
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastRight(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right);
                            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                }
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityTrslTimeline) {
                    final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                    if (entityTrslTimeline.getIndex() + n3 < TrackEntityView.-$$Nest$fgetentityListTrslQuran(this.this$0).size()) {
                        final TrackEntityView this$2 = this.this$0;
                        final EntityTrslTimeline previewOrNextEntityTrslQuran = this$2.getPreviewOrNextEntityTrslQuran(TrackEntityView.-$$Nest$fgetentityListTrslQuran(this$2), entityTrslTimeline.getIndex() + n3, (boolean)(n3 != 0));
                        if (previewOrNextEntityTrslQuran != null && n4 > previewOrNextEntityTrslQuran.getRect().left) {
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right = previewOrNextEntityTrslQuran.getRect().left;
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastRight(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right);
                            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                }
                TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right = n4;
                TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastRight(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right);
            }
            else if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getTrim_type() == 0) {
                final RectF rect2 = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect();
                final float n5 = rect2.left + n2;
                rect2.left = n5;
                if (n5 < 0.0f) {
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = 0.0f;
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastLeft(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).updateStartTrim();
                    TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                    TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                    this.this$0.invalidate();
                    return;
                }
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right - n5 <= TrackEntityView.-$$Nest$fgetmax_trim(this.this$0)) {
                    final float left = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right - TrackEntityView.-$$Nest$fgetmax_trim(this.this$0);
                    TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = left;
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastLeft(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                    TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).updateStartTrim();
                    TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                    this.this$0.invalidate();
                    return;
                }
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityQuranTimeline) {
                    final EntityQuranTimeline entityQuranTimeline2 = (EntityQuranTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                    if (entityQuranTimeline2.getIndex() > 0) {
                        final TrackEntityView this$3 = this.this$0;
                        final EntityQuranTimeline previewOrNextEntityQuran2 = this$3.getPreviewOrNextEntityQuran(TrackEntityView.-$$Nest$fgetentityListQuran(this$3), entityQuranTimeline2.getIndex() - n3, false);
                        if (previewOrNextEntityQuran2 != null && n5 <= previewOrNextEntityQuran2.getRect().right) {
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = previewOrNextEntityQuran2.getRect().right;
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastLeft(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).updateStartTrim();
                            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                }
                if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityTrslTimeline) {
                    final EntityTrslTimeline entityTrslTimeline2 = (EntityTrslTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                    if (entityTrslTimeline2.getIndex() > 0) {
                        final TrackEntityView this$4 = this.this$0;
                        final EntityTrslTimeline previewOrNextEntityTrslQuran2 = this$4.getPreviewOrNextEntityTrslQuran(TrackEntityView.-$$Nest$fgetentityListTrslQuran(this$4), entityTrslTimeline2.getIndex() - n3, false);
                        if (previewOrNextEntityTrslQuran2 != null && n5 <= previewOrNextEntityTrslQuran2.getRect().right) {
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = previewOrNextEntityTrslQuran2.getRect().right;
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastLeft(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).updateStartTrim();
                            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                            TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                            this.this$0.invalidate();
                            return;
                        }
                    }
                }
                TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = n5;
                TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setLastLeft(TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left);
                TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).updateStartTrim();
            }
            final TrackEntityView this$5 = this.this$0;
            TrackEntityView.-$$Nest$fputcurrentPosition(this$5, TrackEntityView.-$$Nest$fgetcurrentPosition(this$5) - n2 / TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
            if (TrackEntityView.-$$Nest$fgetcurrentPosition(this.this$0) > 0.0f) {
                TrackEntityView.-$$Nest$fputcurrentPosition(this.this$0, 0.0f);
                final TrackEntityView this$6 = this.this$0;
                TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$6, TrackEntityView.-$$Nest$fgetcurrentPosition(this$6) * TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
                TrackEntityView.-$$Nest$fputisAutoScroll(this.this$0, false);
                TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                this.this$0.invalidate();
                return;
            }
            final TrackEntityView this$7 = this.this$0;
            TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$7, TrackEntityView.-$$Nest$fgetcurrentPosition(this$7) * TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
            this.this$0.invalidate();
            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).postDelayed((Runnable)this, (long)100);
        }
    }
}
