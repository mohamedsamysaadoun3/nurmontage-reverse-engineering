// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;
import java.util.Iterator;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;

class EngineActivity$105 implements EffectBismilahFragment$ITransition
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$105(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void applyAll(final EntityBismilahTimeline entityBismilahTimeline) {
        EngineActivity.-$$Nest$mshowProgress(this.this$0);
        EntityBismilahTimeline entityBismilahTimeline2;
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getmIsi3adaTimeline() != entityBismilahTimeline) {
            entityBismilahTimeline2 = EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getmIsi3adaTimeline();
        }
        else {
            entityBismilahTimeline2 = EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getBismilahTimeline();
        }
        EngineActivity.-$$Nest$maddUpdateAnim(this.this$0, entityBismilahTimeline2, entityBismilahTimeline);
        for (final EntityQuranTimeline entityQuranTimeline : EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListQuran()) {
            if (entityBismilahTimeline.getTransition() == null) {
                entityQuranTimeline.setTransition(null);
                return;
            }
            if (entityQuranTimeline.getTransition() == null) {
                entityQuranTimeline.setTransition(new Transition());
            }
            entityQuranTimeline.getTransition().setOut(entityBismilahTimeline.getTransition().isOut());
            entityQuranTimeline.getTransition().setType_out(entityBismilahTimeline.getTransition().getType_out());
            entityQuranTimeline.getTransition().setDuration_out(entityBismilahTimeline.getTransition().getDuration_out());
            entityQuranTimeline.getTransition().setIn(entityBismilahTimeline.getTransition().isIn());
            entityQuranTimeline.getTransition().setType_in(entityBismilahTimeline.getTransition().getType_in());
            entityQuranTimeline.getTransition().setDuration_in(entityBismilahTimeline.getTransition().getDuration_in());
        }
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
    }
    
    public void destroy(final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        entityBismilahTimeline.getQuranEntity().setAnimTest(false);
        entityBismilahTimeline.getQuranEntity().endAnimator();
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
    }
    
    public void in(final String type_in, final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        if (entityBismilahTimeline.getTransition() == null) {
            entityBismilahTimeline.setTransition(new Transition());
        }
        final Transition transition = entityBismilahTimeline.getTransition();
        final boolean in = true;
        transition.setIn(in);
        entityBismilahTimeline.getTransition().setType_in(type_in);
        EffectBismilahFragment.instance.updateView(entityBismilahTimeline.getTransition().getDuration_in(), entityBismilahTimeline.getTransition());
        entityBismilahTimeline.getQuranEntity().endAnimator();
        entityBismilahTimeline.getQuranEntity().runIn((int)(entityBismilahTimeline.getTransition().getDuration_in() * 1000.0f), in, entityBismilahTimeline.getTransition().getType_in());
    }
    
    public void onHideFragment(final EntityBismilahTimeline entityBismilahTimeline) {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$fgetiTrimLineCallback(this$0).onSelectEntity(entityBismilahTimeline, -1.0f);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
    }
    
    public void out(final String type_out, final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        if (entityBismilahTimeline.getTransition() == null) {
            entityBismilahTimeline.setTransition(new Transition());
        }
        final Transition transition = entityBismilahTimeline.getTransition();
        final boolean out = true;
        transition.setOut(out);
        entityBismilahTimeline.getTransition().setType_out(type_out);
        EffectBismilahFragment.instance.updateView(entityBismilahTimeline.getTransition().getDuration_out(), entityBismilahTimeline.getTransition());
        entityBismilahTimeline.getQuranEntity().endAnimator();
        entityBismilahTimeline.getQuranEntity().runOut((int)(entityBismilahTimeline.getTransition().getDuration_out() * 1000.0f), out, entityBismilahTimeline.getTransition().getType_out());
    }
    
    public void playing(final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        entityBismilahTimeline.getQuranEntity().setAnimTest(true);
    }
    
    public void remove(final int n, final EntityBismilahTimeline entityBismilahTimeline) {
        if (n == 0) {
            entityBismilahTimeline.getTransition().setIn(false);
            entityBismilahTimeline.getQuranEntity().endAnimator();
        }
        if (n == 1) {
            entityBismilahTimeline.getTransition().setOut(false);
            entityBismilahTimeline.getQuranEntity().endAnimator();
        }
    }
    
    public void updateDurationIn(final float duration_in, final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        entityBismilahTimeline.getTransition().setDuration_in(duration_in);
        entityBismilahTimeline.getQuranEntity().endAnimator();
        entityBismilahTimeline.getQuranEntity().runIn((int)(entityBismilahTimeline.getTransition().getDuration_in() * 1000.0f), true, entityBismilahTimeline.getTransition().getType_in());
    }
    
    public void updateDurationOut(final float duration_out, final EntityBismilahTimeline entityBismilahTimeline) {
        if (entityBismilahTimeline == null) {
            return;
        }
        entityBismilahTimeline.getTransition().setDuration_out(duration_out);
        entityBismilahTimeline.getQuranEntity().endAnimator();
        entityBismilahTimeline.getQuranEntity().runOut((int)(entityBismilahTimeline.getTransition().getDuration_out() * 1000.0f), true, entityBismilahTimeline.getTransition().getType_out());
    }
}
