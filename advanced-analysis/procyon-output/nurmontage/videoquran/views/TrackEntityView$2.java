// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

class TrackEntityView$2 implements Runnable
{
    final /* synthetic */ TrackEntityView this$0;
    
    TrackEntityView$2(final TrackEntityView this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (TrackEntityView.-$$Nest$fgetisAutoMove(this.this$0)) {
            float n = (System.currentTimeMillis() - TrackEntityView.-$$Nest$fgettime_start(this.this$0)) / 180.0f;
            if (TrackEntityView.-$$Nest$fgetSPEED(this.this$0) < 0.0f) {
                n *= -1.0f;
            }
            final float n2 = n + TrackEntityView.-$$Nest$fgetSPEED(this.this$0);
            final float width = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().width();
            float left = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left + n2;
            if (left < 0.0f) {
                left = 0.0f;
            }
            final float right = left + width;
            final boolean b = TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityQuranTimeline;
            final int n3 = 1;
            if (b) {
                final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                if (entityQuranTimeline.getIndex() > 0) {
                    final TrackEntityView this$0 = this.this$0;
                    final EntityQuranTimeline previewOrNextEntityQuran = this$0.getPreviewOrNextEntityQuran(TrackEntityView.-$$Nest$fgetentityListQuran(this$0), entityQuranTimeline.getIndex() - n3, false);
                    if (previewOrNextEntityQuran != null && left <= previewOrNextEntityQuran.getRect().right) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityQuran.getRect().right);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityQuran.getRect().right + width);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
                if (entityQuranTimeline.getIndex() + n3 < this.this$0.getEntityListQuran().size()) {
                    final TrackEntityView this$2 = this.this$0;
                    final EntityQuranTimeline previewOrNextEntityQuran2 = this$2.getPreviewOrNextEntityQuran(TrackEntityView.-$$Nest$fgetentityListQuran(this$2), entityQuranTimeline.getIndex() + n3, (boolean)(n3 != 0));
                    if (previewOrNextEntityQuran2 != null && right >= previewOrNextEntityQuran2.getRect().left) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityQuran2.getRect().left - width);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityQuran2.getRect().left);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityTrslTimeline) {
                final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                if (entityTrslTimeline.getIndex() > 0) {
                    final TrackEntityView this$3 = this.this$0;
                    final EntityTrslTimeline previewOrNextEntityTrslQuran = this$3.getPreviewOrNextEntityTrslQuran(TrackEntityView.-$$Nest$fgetentityListTrslQuran(this$3), entityTrslTimeline.getIndex() - n3, false);
                    if (previewOrNextEntityTrslQuran != null && left <= previewOrNextEntityTrslQuran.getRect().right) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityTrslQuran.getRect().right);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityTrslQuran.getRect().right + width);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
                if (entityTrslTimeline.getIndex() + n3 < this.this$0.getEntityListQuran().size()) {
                    final TrackEntityView this$4 = this.this$0;
                    final EntityQuranTimeline previewOrNextEntityQuran3 = this$4.getPreviewOrNextEntityQuran(TrackEntityView.-$$Nest$fgetentityListQuran(this$4), entityTrslTimeline.getIndex() + n3, (boolean)(n3 != 0));
                    if (previewOrNextEntityQuran3 != null && right >= previewOrNextEntityQuran3.getRect().left) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityQuran3.getRect().left - width);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityQuran3.getRect().left);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) instanceof EntityAudio) {
                final EntityAudio entityAudio = (EntityAudio)TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0);
                if (entityAudio.getIndex() > 0) {
                    final TrackEntityView this$5 = this.this$0;
                    final EntityAudio previewOrNextEntityAudio = this$5.getPreviewOrNextEntityAudio(TrackEntityView.-$$Nest$fgetentityListAudio(this$5), entityAudio.getIndex() - n3, false);
                    if (previewOrNextEntityAudio != null && left <= previewOrNextEntityAudio.getRect().right) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityAudio.getRect().right);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityAudio.getRect().right + width);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
                if (entityAudio.getIndex() + n3 < this.this$0.getEntityListAudio().size()) {
                    final TrackEntityView this$6 = this.this$0;
                    final EntityAudio previewOrNextEntityAudio2 = this$6.getPreviewOrNextEntityAudio(TrackEntityView.-$$Nest$fgetentityListAudio(this$6), entityAudio.getIndex() + n3, (boolean)(n3 != 0));
                    if (previewOrNextEntityAudio2 != null && right >= previewOrNextEntityAudio2.getRect().left) {
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setX(previewOrNextEntityAudio2.getRect().left - width);
                        TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setRight(previewOrNextEntityAudio2.getRect().left);
                        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
                        this.this$0.invalidate();
                        TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                        TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                        return;
                    }
                }
            }
            final TrackEntityView this$7 = this.this$0;
            TrackEntityView.-$$Nest$fputcurrentPosition(this$7, TrackEntityView.-$$Nest$fgetcurrentPosition(this$7) - n2 / TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
            if (TrackEntityView.-$$Nest$fgetcurrentPosition(this.this$0) > 0.0f) {
                TrackEntityView.-$$Nest$fputcurrentPosition(this.this$0, 0.0f);
                final TrackEntityView this$8 = this.this$0;
                TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$8, TrackEntityView.-$$Nest$fgetcurrentPosition(this$8) * TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
                TrackEntityView.-$$Nest$fputisAutoMove(this.this$0, false);
                TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).removeCallbacks((Runnable)this);
                this.this$0.invalidate();
                return;
            }
            final TrackEntityView this$9 = this.this$0;
            TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$9, TrackEntityView.-$$Nest$fgetcurrentPosition(this$9) * TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0));
            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().left = left;
            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).getRect().right = right;
            TrackEntityView.-$$Nest$fputisMove(this.this$0, (boolean)(n3 != 0));
            this.this$0.invalidate();
            TrackEntityView.-$$Nest$fgetautoScrollHandler(this.this$0).postDelayed((Runnable)this, (long)100);
        }
    }
}
