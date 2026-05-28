// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.Template;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$31 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$31(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                try {
                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                    try {
                        final EngineActivity this$2 = this.this$0;
                        try {
                            final ChangeBgFragment$IChangeBgCallback -$$Nest$fgetiChangeBgCallback = EngineActivity.-$$Nest$fgetiChangeBgCallback(this$2);
                            try {
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$3);
                                    try {
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$4);
                                            try {
                                                EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)ChangeBgFragment.getInstance(-$$Nest$fgetiChangeBgCallback, -$$Nest$fgetmResources, -$$Nest$fgetmTemplate.getName_drawable()));
                                                final int container = R$id.m_container;
                                                try {
                                                    final EngineActivity this$5 = this.this$0;
                                                    try {
                                                        beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$5));
                                                        beginTransaction.commitNow();
                                                        final EngineActivity this$6 = this.this$0;
                                                        try {
                                                            final Resources -$$Nest$fgetmResources2 = EngineActivity.-$$Nest$fgetmResources(this$6);
                                                            try {
                                                                EngineActivity.-$$Nest$msetupShowFragment(this$6, -$$Nest$fgetmResources2.getString(R$string.bg));
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
}
