// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.views.BlurredImageView$IViewCallback;

class EngineActivity$25 implements BlurredImageView$IViewCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$25(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onDrawFinish() {
    }
    
    public void onEmtyClick() {
        EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
    }
    
    public void onEndMove() {
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select() != null) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).applyAll(EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getFactor_scale(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getRect(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getMax_w(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getMax_h());
        }
    }
    
    public void onEndScale() {
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select() != null) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).applyAll(EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getFactor_scale(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getRect(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getMax_w(), EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select().getMax_h());
        }
    }
    
    public void onSelect(final EntityView entityView) {
        Label_0039: {
            if (!(entityView instanceof SurahNameEntity)) {
                break Label_0039;
            }
            try {
                if (EditS_NameFragment.instance != null) {
                    return;
                }
                final EngineActivity this$0 = this.this$0;
                try {
                    EngineActivity.-$$Nest$mpausePlayer(this$0);
                    final EngineActivity this$2 = this.this$0;
                    try {
                        EngineActivity.-$$Nest$mselectSurahName(this$2);
                        Label_0210: {
                            return;
                        }
                        final boolean b = entityView instanceof QuranEntity;
                        final boolean b2 = true;
                        iftrue(Label_0099:)(!b);
                        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).selectEntity(entityView.getEntityQuran(), b2);
                        EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(entityView.getEntityQuran(), 0.0f);
                        return;
                        Label_0099:
                        iftrue(Label_0149:)(!(entityView instanceof BismilahEntity));
                        final EntityBismilahTimeline bismilahTimeline = ((BismilahEntity)entityView).getBismilahTimeline();
                        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).selectEntity(bismilahTimeline, b2);
                        EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(bismilahTimeline, 0.0f);
                        return;
                        Label_0149:
                        iftrue(Label_0210:)(!(entityView instanceof TranslationQuranEntity));
                        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).selectEntity(entityView.getEntityTrslTimeline(), b2);
                        EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(entityView.getEntityTrslTimeline(), 0.0f);
                    }
                    catch (final Exception ex) {}
                }
                catch (final Exception ex2) {}
            }
            catch (final Exception ex3) {}
        }
    }
    
    public void onSquare() {
    }
    
    public void onWattermark() {
        this.this$0.dialogWatermark();
    }
}
