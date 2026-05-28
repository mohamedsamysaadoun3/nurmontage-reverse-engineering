// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import android.content.Context;
import android.content.Intent;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import hazem.nurmontage.videoquran.fragment.ColorTrslAyaFragment;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.model.Transition;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment$IEditEntityCallback;

class EngineActivity$97 implements EditTrslEntityFragment$IEditEntityCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$97(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void fromNow() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateFromNow();
    }
    
    public void fromTheStart() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateFromStart();
    }
    
    public void onAnim() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                final QuranEntity quranEntity = (QuranEntity)entityView;
                                try {
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                                        try {
                                            -$$Nest$fgettrackViewEntity2.updateCursurToSelectEntity();
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                final FragmentManager supportFragmentManager = this$4.getSupportFragmentManager();
                                                try {
                                                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                                                    try {
                                                        final EngineActivity this$5 = this.this$0;
                                                        try {
                                                            final EntityQuranTimeline entityQuran = quranEntity.getEntityQuran();
                                                            try {
                                                                final Transition transition = entityQuran.getTransition();
                                                                try {
                                                                    final EngineActivity this$6 = this.this$0;
                                                                    try {
                                                                        final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$6);
                                                                        try {
                                                                            final EngineActivity this$7 = this.this$0;
                                                                            try {
                                                                                final EffectAyaFragment$ITransition -$$Nest$fgetiTransitionCallback = EngineActivity.-$$Nest$fgetiTransitionCallback(this$7);
                                                                                try {
                                                                                    final EngineActivity this$8 = this.this$0;
                                                                                    try {
                                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity3 = EngineActivity.-$$Nest$fgettrackViewEntity(this$8);
                                                                                        try {
                                                                                            final Entity selectedEntity2 = -$$Nest$fgettrackViewEntity3.getSelectedEntity();
                                                                                            try {
                                                                                                EngineActivity.-$$Nest$fputmCurrentFragment(this$5, (Fragment)EffectAyaFragment.get(transition, -$$Nest$fgetmResources, -$$Nest$fgetiTransitionCallback, (EntityQuranTimeline)selectedEntity2));
                                                                                                final int container = R$id.m_container;
                                                                                                try {
                                                                                                    final EngineActivity this$9 = this.this$0;
                                                                                                    try {
                                                                                                        beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$9));
                                                                                                        beginTransaction.commit();
                                                                                                        final EngineActivity this$10 = this.this$0;
                                                                                                        try {
                                                                                                            final Resources -$$Nest$fgetmResources2 = EngineActivity.-$$Nest$fgetmResources(this$10);
                                                                                                            try {
                                                                                                                EngineActivity.-$$Nest$msetupShowFragment(this$10, -$$Nest$fgetmResources2.getString(R$string.animtion));
                                                                                                            }
                                                                                                            catch (final Exception ex) {}
                                                                                                        }
                                                                                                        catch (final Exception ex2) {}
                                                                                                    }
                                                                                                    catch (final Exception ex3) {}
                                                                                                }
                                                                                                catch (final Exception ex4) {}
                                                                                            }
                                                                                            catch (final Exception ex5) {}
                                                                                        }
                                                                                        catch (final Exception ex6) {}
                                                                                    }
                                                                                    catch (final Exception ex7) {}
                                                                                }
                                                                                catch (final Exception ex8) {}
                                                                            }
                                                                            catch (final Exception ex9) {}
                                                                        }
                                                                        catch (final Exception ex10) {}
                                                                    }
                                                                    catch (final Exception ex11) {}
                                                                }
                                                                catch (final Exception ex12) {}
                                                            }
                                                            catch (final Exception ex13) {}
                                                        }
                                                        catch (final Exception ex14) {}
                                                    }
                                                    catch (final Exception ex15) {}
                                                }
                                                catch (final Exception ex16) {}
                                            }
                                            catch (final Exception ex17) {}
                                        }
                                        catch (final Exception ex18) {}
                                    }
                                    catch (final Exception ex19) {}
                                }
                                catch (final Exception ex20) {}
                            }
                            catch (final Exception ex21) {}
                        }
                        catch (final Exception ex22) {}
                    }
                    catch (final Exception ex23) {}
                }
                catch (final Exception ex24) {}
            }
            catch (final Exception ex25) {}
        }
        catch (final Exception ex26) {}
    }
    
    public void onColor() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                final TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)entityView;
                                try {
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                                        try {
                                            -$$Nest$fgettrackViewEntity2.updateCursurToSelectEntity();
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                final FragmentManager supportFragmentManager = this$4.getSupportFragmentManager();
                                                try {
                                                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                                                    try {
                                                        final EngineActivity this$5 = this.this$0;
                                                        try {
                                                            final EditTrslEntityFragment$IEditEntityCallback -$$Nest$fgetiEditTrstEntityCallback = EngineActivity.-$$Nest$fgetiEditTrstEntityCallback(this$5);
                                                            try {
                                                                final EngineActivity this$6 = this.this$0;
                                                                try {
                                                                    EngineActivity.-$$Nest$fputmCurrentFragment(this$5, (Fragment)ColorTrslAyaFragment.getInstance(-$$Nest$fgetiEditTrstEntityCallback, translationQuranEntity, EngineActivity.-$$Nest$fgetmResources(this$6)));
                                                                    final int container = R$id.m_container;
                                                                    try {
                                                                        final EngineActivity this$7 = this.this$0;
                                                                        try {
                                                                            beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$7));
                                                                            beginTransaction.commit();
                                                                            EngineActivity.-$$Nest$msetupShowFragment(this.this$0, (String)null);
                                                                        }
                                                                        catch (final Exception ex) {}
                                                                    }
                                                                    catch (final Exception ex2) {}
                                                                }
                                                                catch (final Exception ex3) {}
                                                            }
                                                            catch (final Exception ex4) {}
                                                        }
                                                        catch (final Exception ex5) {}
                                                    }
                                                    catch (final Exception ex6) {}
                                                }
                                                catch (final Exception ex7) {}
                                            }
                                            catch (final Exception ex8) {}
                                        }
                                        catch (final Exception ex9) {}
                                    }
                                    catch (final Exception ex10) {}
                                }
                                catch (final Exception ex11) {}
                            }
                            catch (final Exception ex12) {}
                        }
                        catch (final Exception ex13) {}
                    }
                    catch (final Exception ex14) {}
                }
                catch (final Exception ex15) {}
            }
            catch (final Exception ex16) {}
        }
        catch (final Exception ex17) {}
    }
    
    public void onCut() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                EngineActivity.-$$Nest$msplitEntity(this$2, (TranslationQuranEntity)entityView);
                            }
                            catch (final Exception ex) {
                                if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                    return;
                                }
                                EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
                            }
                        }
                        catch (final Exception ex2) {}
                    }
                    catch (final Exception ex3) {}
                }
                catch (final Exception ex4) {}
            }
            catch (final Exception ex5) {}
        }
        catch (final Exception ex6) {}
    }
    
    public void onDelete() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    EngineActivity.-$$Nest$fgettrackViewEntity(this$2).deleteEntity(true);
                    final EngineActivity this$3 = this.this$0;
                    try {
                        EngineActivity.-$$Nest$mupdateTime(this$3);
                        final EngineActivity this$4 = this.this$0;
                        try {
                            final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = EngineActivity.-$$Nest$fgetiTrimLineCallback(this$4);
                            try {
                                -$$Nest$fgetiTrimLineCallback.onEmptySelect();
                            }
                            catch (final Exception ex) {
                                if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                    return;
                                }
                                EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
                            }
                        }
                        catch (final Exception ex2) {}
                    }
                    catch (final Exception ex3) {}
                }
                catch (final Exception ex4) {}
            }
            catch (final Exception ex5) {}
        }
        catch (final Exception ex6) {}
    }
    
    public void onDone() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getEntity_select() instanceof TranslationQuranEntity) {
            EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onSelectEntity(EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getSelectedEntity(), -1.0f);
        }
    }
    
    public void onDuplicate() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                EngineActivity.-$$Nest$mduplicateEntity(this$2, (TranslationQuranEntity)entityView);
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    EngineActivity.-$$Nest$mupdateTime(this$3);
                                }
                                catch (final Exception ex) {
                                    if (EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0) == null) {
                                        return;
                                    }
                                    EngineActivity.-$$Nest$fgetiTrimLineCallback(this.this$0).onEmptySelect();
                                }
                            }
                            catch (final Exception ex2) {}
                        }
                        catch (final Exception ex3) {}
                    }
                    catch (final Exception ex4) {}
                }
                catch (final Exception ex5) {}
            }
            catch (final Exception ex6) {}
        }
        catch (final Exception ex7) {}
    }
    
    public void onEdit() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                EngineActivity.-$$Nest$fputisToCrop(this.this$0, true);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                final TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)entityView;
                                try {
                                    try {
                                        final Intent intent = new Intent((Context)this.this$0, (Class)EditTrslTxtActivity.class);
                                        intent.putExtra("surah_name", "");
                                        intent.putExtra("reader_name", translationQuranEntity.getTxt());
                                        intent.putExtra("isBg", translationQuranEntity.isHaveBg());
                                        intent.putExtra("clrBg", translationQuranEntity.getClrBg());
                                        final EngineActivity this$3 = this.this$0;
                                        try {
                                            EngineActivity.-$$Nest$fgeteditTrslResult(this$3).launch((Object)intent);
                                            this.this$0.overridePendingTransition(0, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
            catch (final Exception ex8) {}
        }
        catch (final Exception ex9) {}
    }
    
    public void onFont() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                final TranslationQuranEntity translationQuranEntity = (TranslationQuranEntity)entityView;
                                try {
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                                        try {
                                            -$$Nest$fgettrackViewEntity2.updateCursurToSelectEntity();
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                final FragmentManager supportFragmentManager = this$4.getSupportFragmentManager();
                                                try {
                                                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                                                    try {
                                                        final EngineActivity this$5 = this.this$0;
                                                        try {
                                                            final FontFragment$IFontCallback -$$Nest$fgetiFontCallback = EngineActivity.-$$Nest$fgetiFontCallback(this$5);
                                                            try {
                                                                final String nameFont = translationQuranEntity.getNameFont();
                                                                try {
                                                                    final TextPaint paintAya = translationQuranEntity.getPaintAya();
                                                                    try {
                                                                        EngineActivity.-$$Nest$fputmCurrentFragment(this$5, (Fragment)FontFragment.getInstance(-$$Nest$fgetiFontCallback, nameFont, paintAya.getTypeface()));
                                                                        final int container = R$id.m_container;
                                                                        try {
                                                                            final EngineActivity this$6 = this.this$0;
                                                                            try {
                                                                                beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$6));
                                                                                beginTransaction.commit();
                                                                                final EngineActivity this$7 = this.this$0;
                                                                                try {
                                                                                    final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$7);
                                                                                    try {
                                                                                        EngineActivity.-$$Nest$msetupShowFragment(this$7, -$$Nest$fgetmResources.getString(R$string.font));
                                                                                    }
                                                                                    catch (final Exception ex) {}
                                                                                }
                                                                                catch (final Exception ex2) {}
                                                                            }
                                                                            catch (final Exception ex3) {}
                                                                        }
                                                                        catch (final Exception ex4) {}
                                                                    }
                                                                    catch (final Exception ex5) {}
                                                                }
                                                                catch (final Exception ex6) {}
                                                            }
                                                            catch (final Exception ex7) {}
                                                        }
                                                        catch (final Exception ex8) {}
                                                    }
                                                    catch (final Exception ex9) {}
                                                }
                                                catch (final Exception ex10) {}
                                            }
                                            catch (final Exception ex11) {}
                                        }
                                        catch (final Exception ex12) {}
                                    }
                                    catch (final Exception ex13) {}
                                }
                                catch (final Exception ex14) {}
                            }
                            catch (final Exception ex15) {}
                        }
                        catch (final Exception ex16) {}
                    }
                    catch (final Exception ex17) {}
                }
                catch (final Exception ex18) {}
            }
            catch (final Exception ex19) {}
        }
        catch (final Exception ex20) {}
    }
    
    public void onIcon() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$2);
                    try {
                        final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                        try {
                            final EntityView entityView = selectedEntity.getEntityView();
                            try {
                                final QuranEntity quranEntity = (QuranEntity)entityView;
                                try {
                                    final EngineActivity this$3 = this.this$0;
                                    try {
                                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$3);
                                        try {
                                            -$$Nest$fgettrackViewEntity2.updateCursurToSelectEntity();
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                final FragmentManager supportFragmentManager = this$4.getSupportFragmentManager();
                                                try {
                                                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                                                    try {
                                                        final EngineActivity this$5 = this.this$0;
                                                        try {
                                                            final EditIconQuranFragment$IQuranIconCallback -$$Nest$fgetiQuranIconCallback = EngineActivity.-$$Nest$fgetiQuranIconCallback(this$5);
                                                            try {
                                                                EngineActivity.-$$Nest$fputmCurrentFragment(this$5, (Fragment)EditIconQuranFragment.getInstance(-$$Nest$fgetiQuranIconCallback, quranEntity.getIcon()));
                                                                final int container = R$id.m_container;
                                                                try {
                                                                    final EngineActivity this$6 = this.this$0;
                                                                    try {
                                                                        beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$6));
                                                                        beginTransaction.commit();
                                                                        final EngineActivity this$7 = this.this$0;
                                                                        try {
                                                                            final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$7);
                                                                            try {
                                                                                EngineActivity.-$$Nest$msetupShowFragment(this$7, -$$Nest$fgetmResources.getString(R$string.icon));
                                                                            }
                                                                            catch (final Exception ex) {}
                                                                        }
                                                                        catch (final Exception ex2) {}
                                                                    }
                                                                    catch (final Exception ex3) {}
                                                                }
                                                                catch (final Exception ex4) {}
                                                            }
                                                            catch (final Exception ex5) {}
                                                        }
                                                        catch (final Exception ex6) {}
                                                    }
                                                    catch (final Exception ex7) {}
                                                }
                                                catch (final Exception ex8) {}
                                            }
                                            catch (final Exception ex9) {}
                                        }
                                        catch (final Exception ex10) {}
                                    }
                                    catch (final Exception ex11) {}
                                }
                                catch (final Exception ex12) {}
                            }
                            catch (final Exception ex13) {}
                        }
                        catch (final Exception ex14) {}
                    }
                    catch (final Exception ex15) {}
                }
                catch (final Exception ex16) {}
            }
            catch (final Exception ex17) {}
        }
        catch (final Exception ex18) {}
    }
    
    public void untilNow() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateUntilNow();
    }
    
    public void untilTheEnd() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateEndNow();
    }
    
    public void updateAya(final int colorTrsl) {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setColorTrsl(colorTrsl);
    }
    
    public void updatePreset(final AyaTextPreset trslPreset) {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setTrslPreset(trslPreset);
    }
    
    public void updateTrsl(final int colorTrsl) {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setColorTrsl(colorTrsl);
    }
}
