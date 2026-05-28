// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import java.util.Iterator;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;

class EngineActivity$104 implements EffectAyaFragment$ITransition
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$104(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void applyAll(final int n, final EntityQuranTimeline entityQuranTimeline) {
        EngineActivity.-$$Nest$mshowProgress(this.this$0);
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$maddUpdateAnim(this$0, EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getmIsi3adaTimeline(), entityQuranTimeline);
        final EngineActivity this$2 = this.this$0;
        EngineActivity.-$$Nest$maddUpdateAnim(this$2, EngineActivity.-$$Nest$fgettrackViewEntity(this$2).getBismilahTimeline(), entityQuranTimeline);
        for (final EntityQuranTimeline entityQuranTimeline2 : EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getEntityListQuran()) {
            if (entityQuranTimeline2 == entityQuranTimeline) {
                continue;
            }
            if (entityQuranTimeline.getTransition() == null) {
                entityQuranTimeline2.setTransition(null);
                return;
            }
            if (entityQuranTimeline2.getTransition() == null) {
                entityQuranTimeline2.setTransition(new Transition());
            }
            entityQuranTimeline2.getTransition().setOut(entityQuranTimeline.getTransition().isOut());
            entityQuranTimeline2.getTransition().setType_out(entityQuranTimeline.getTransition().getType_out());
            entityQuranTimeline2.getTransition().setDuration_out(entityQuranTimeline.getTransition().getDuration_out());
            entityQuranTimeline2.getTransition().setIn(entityQuranTimeline.getTransition().isIn());
            entityQuranTimeline2.getTransition().setType_in(entityQuranTimeline.getTransition().getType_in());
            entityQuranTimeline2.getTransition().setDuration_in(entityQuranTimeline.getTransition().getDuration_in());
        }
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
    }
    
    public void destroy(final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getQuranEntity().setAnimTest(false);
        entityQuranTimeline.getQuranEntity().endAnimator();
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
    }
    
    public void in(final String type_in, final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        if (entityQuranTimeline.getTransition() == null) {
            entityQuranTimeline.setTransition(new Transition());
        }
        final Transition transition = entityQuranTimeline.getTransition();
        final boolean in = true;
        transition.setIn(in);
        entityQuranTimeline.getTransition().setType_in(type_in);
        EffectAyaFragment.instance.updateView(entityQuranTimeline.getTransition().getDuration_in(), entityQuranTimeline.getTransition());
        entityQuranTimeline.getQuranEntity().endAnimator();
        entityQuranTimeline.getQuranEntity().runIn((int)(entityQuranTimeline.getTransition().getDuration_in() * 1000.0f), in, entityQuranTimeline.getTransition().getType_in());
    }
    
    public void onHideFragment(final EntityQuranTimeline entityQuranTimeline) {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$fgetiTrimLineCallback(this$0).onSelectEntity(entityQuranTimeline, -1.0f);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
    }
    
    public void out(final String type_out, final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        if (entityQuranTimeline.getTransition() == null) {
            entityQuranTimeline.setTransition(new Transition());
        }
        final Transition transition = entityQuranTimeline.getTransition();
        final boolean out = true;
        transition.setOut(out);
        entityQuranTimeline.getTransition().setType_out(type_out);
        EffectAyaFragment.instance.updateView(entityQuranTimeline.getTransition().getDuration_out(), entityQuranTimeline.getTransition());
        entityQuranTimeline.getQuranEntity().endAnimator();
        entityQuranTimeline.getQuranEntity().runOut((int)(entityQuranTimeline.getTransition().getDuration_out() * 1000.0f), out, entityQuranTimeline.getTransition().getType_out());
    }
    
    public void playing(final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getQuranEntity().setAnimTest(true);
    }
    
    public void remove(final int n, final EntityQuranTimeline entityQuranTimeline) {
        if (n == 0) {
            entityQuranTimeline.getTransition().setIn(false);
            entityQuranTimeline.getQuranEntity().endAnimator();
        }
        if (n == 1) {
            entityQuranTimeline.getTransition().setOut(false);
            entityQuranTimeline.getQuranEntity().endAnimator();
        }
    }
    
    public void toSubscribe() {
    }
    
    public void updateDurationIn(final float duration_in, final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getTransition().setDuration_in(duration_in);
        entityQuranTimeline.getQuranEntity().endAnimator();
        entityQuranTimeline.getQuranEntity().runIn((int)(entityQuranTimeline.getTransition().getDuration_in() * 1000.0f), true, entityQuranTimeline.getTransition().getType_in());
    }
    
    public void updateDurationOut(final float duration_out, final EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getTransition().setDuration_out(duration_out);
        entityQuranTimeline.getQuranEntity().endAnimator();
        entityQuranTimeline.getQuranEntity().runOut((int)(entityQuranTimeline.getTransition().getDuration_out() * 1000.0f), true, entityQuranTimeline.getTransition().getType_out());
    }
}
