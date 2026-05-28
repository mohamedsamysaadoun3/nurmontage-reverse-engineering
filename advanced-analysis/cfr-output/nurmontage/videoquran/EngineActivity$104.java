/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;

class EngineActivity$104
implements EffectAyaFragment$ITransition {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$104(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void applyAll(int n, EntityQuranTimeline entityQuranTimeline) {
        boolean bl;
        EngineActivity.cfr_renamed_60(this.this$0);
        Object object = this.this$0;
        Object object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getmIsi3adaTimeline();
        EngineActivity.cfr_renamed_147((EngineActivity)((Object)object), (EntityBismilahTimeline)object2, entityQuranTimeline);
        object = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getBismilahTimeline();
        EngineActivity.cfr_renamed_147((EngineActivity)((Object)object), (EntityBismilahTimeline)object2, entityQuranTimeline);
        object = EngineActivity.cfr_renamed_18(this.this$0).getEntityListQuran().iterator();
        while (bl = object.hasNext()) {
            object2 = (EntityQuranTimeline)object.next();
            if (object2 == entityQuranTimeline) continue;
            Transition transition = entityQuranTimeline.getTransition();
            if (transition == null) {
                ((EntityQuranTimeline)object2).setTransition(null);
                return;
            }
            transition = ((EntityQuranTimeline)object2).getTransition();
            if (transition == null) {
                transition = new Transition();
                ((EntityQuranTimeline)object2).setTransition(transition);
            }
            transition = ((EntityQuranTimeline)object2).getTransition();
            boolean bl2 = entityQuranTimeline.getTransition().isOut();
            transition.setOut(bl2);
            transition = ((EntityQuranTimeline)object2).getTransition();
            String string2 = entityQuranTimeline.getTransition().getType_out();
            transition.setType_out(string2);
            transition = ((EntityQuranTimeline)object2).getTransition();
            float f = entityQuranTimeline.getTransition().getDuration_out();
            transition.setDuration_out(f);
            transition = ((EntityQuranTimeline)object2).getTransition();
            bl2 = entityQuranTimeline.getTransition().isIn();
            transition.setIn(bl2);
            transition = ((EntityQuranTimeline)object2).getTransition();
            string2 = entityQuranTimeline.getTransition().getType_in();
            transition.setType_in(string2);
            object2 = ((EntityQuranTimeline)object2).getTransition();
            transition = entityQuranTimeline.getTransition();
            float f2 = transition.getDuration_in();
            ((Transition)object2).setDuration_in(f2);
        }
        EngineActivity.cfr_renamed_13(this.this$0);
    }

    public void destroy(EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getQuranEntity().setAnimTest(false);
        entityQuranTimeline.getQuranEntity().endAnimator();
        EngineActivity.cfr_renamed_64(this.this$0).invalidate();
    }

    public void in(String object, EntityQuranTimeline object2) {
        if (object2 == null) {
            return;
        }
        Transition transition = ((EntityQuranTimeline)object2).getTransition();
        if (transition == null) {
            transition = new Transition();
            ((EntityQuranTimeline)object2).setTransition(transition);
        }
        transition = ((EntityQuranTimeline)object2).getTransition();
        boolean bl = true;
        transition.setIn(bl);
        ((EntityQuranTimeline)object2).getTransition().setType_in((String)object);
        object = EffectAyaFragment.instance;
        float f = ((EntityQuranTimeline)object2).getTransition().getDuration_in();
        Transition transition2 = ((EntityQuranTimeline)object2).getTransition();
        ((EffectAyaFragment)((Object)object)).updateView(f, transition2);
        ((EntityQuranTimeline)object2).getQuranEntity().endAnimator();
        object = ((EntityQuranTimeline)object2).getQuranEntity();
        int n = (int)(((EntityQuranTimeline)object2).getTransition().getDuration_in() * 1000.0f);
        object2 = ((EntityQuranTimeline)object2).getTransition().getType_in();
        ((QuranEntity)object).runIn(n, bl, (String)object2);
    }

    public void onHideFragment(EntityQuranTimeline entityQuranTimeline) {
        Object object = this.this$0;
        EngineActivity.cfr_renamed_75((EngineActivity)((Object)object));
        object = this.this$0;
        object = EngineActivity.cfr_renamed_73((EngineActivity)((Object)object));
        float f = -1.0f;
        try {
            object.onSelectEntity(entityQuranTimeline, f);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void out(String object, EntityQuranTimeline object2) {
        if (object2 == null) {
            return;
        }
        Transition transition = ((EntityQuranTimeline)object2).getTransition();
        if (transition == null) {
            transition = new Transition();
            ((EntityQuranTimeline)object2).setTransition(transition);
        }
        transition = ((EntityQuranTimeline)object2).getTransition();
        boolean bl = true;
        transition.setOut(bl);
        ((EntityQuranTimeline)object2).getTransition().setType_out((String)object);
        object = EffectAyaFragment.instance;
        float f = ((EntityQuranTimeline)object2).getTransition().getDuration_out();
        Transition transition2 = ((EntityQuranTimeline)object2).getTransition();
        ((EffectAyaFragment)((Object)object)).updateView(f, transition2);
        ((EntityQuranTimeline)object2).getQuranEntity().endAnimator();
        object = ((EntityQuranTimeline)object2).getQuranEntity();
        int n = (int)(((EntityQuranTimeline)object2).getTransition().getDuration_out() * 1000.0f);
        object2 = ((EntityQuranTimeline)object2).getTransition().getType_out();
        ((QuranEntity)object).runOut(n, bl, (String)object2);
    }

    public void playing(EntityQuranTimeline entityQuranTimeline) {
        if (entityQuranTimeline == null) {
            return;
        }
        entityQuranTimeline.getQuranEntity().setAnimTest(true);
    }

    public void remove(int n, EntityQuranTimeline entityQuranTimeline) {
        int n2;
        if (n == 0) {
            entityQuranTimeline.getTransition().setIn(false);
            QuranEntity quranEntity = entityQuranTimeline.getQuranEntity();
            quranEntity.endAnimator();
        }
        if (n == (n2 = 1)) {
            entityQuranTimeline.getTransition().setOut(false);
            QuranEntity quranEntity = entityQuranTimeline.getQuranEntity();
            quranEntity.endAnimator();
        }
    }

    public void toSubscribe() {
    }

    public void updateDurationIn(float f, EntityQuranTimeline object) {
        if (object == null) {
            return;
        }
        ((EntityQuranTimeline)object).getTransition().setDuration_in(f);
        ((EntityQuranTimeline)object).getQuranEntity().endAnimator();
        QuranEntity quranEntity = ((EntityQuranTimeline)object).getQuranEntity();
        int n = (int)(((EntityQuranTimeline)object).getTransition().getDuration_in() * 1000.0f);
        object = ((EntityQuranTimeline)object).getTransition().getType_in();
        quranEntity.runIn(n, true, (String)object);
    }

    public void updateDurationOut(float f, EntityQuranTimeline object) {
        if (object == null) {
            return;
        }
        ((EntityQuranTimeline)object).getTransition().setDuration_out(f);
        ((EntityQuranTimeline)object).getQuranEntity().endAnimator();
        QuranEntity quranEntity = ((EntityQuranTimeline)object).getQuranEntity();
        int n = (int)(((EntityQuranTimeline)object).getTransition().getDuration_out() * 1000.0f);
        object = ((EntityQuranTimeline)object).getTransition().getType_out();
        quranEntity.runOut(n, true, (String)object);
    }
}

