// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.model.Template;
import android.content.res.Resources;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$34 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$34(final EngineActivity this$0) {
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
                            final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$2);
                            try {
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$3);
                                    try {
                                        final int ipad_type = -$$Nest$fgetmTemplate.getIpad_type();
                                        try {
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                final EditIpadFragment$IIpadEditCallback -$$Nest$fgetiIpadEditCallback = EngineActivity.-$$Nest$fgetiIpadEditCallback(this$4);
                                                try {
                                                    final EngineActivity this$5 = this.this$0;
                                                    try {
                                                        final Template -$$Nest$fgetmTemplate2 = EngineActivity.-$$Nest$fgetmTemplate(this$5);
                                                        try {
                                                            final int index_color = -$$Nest$fgetmTemplate2.getIndex_color();
                                                            try {
                                                                final EngineActivity this$6 = this.this$0;
                                                                try {
                                                                    final Template -$$Nest$fgetmTemplate3 = EngineActivity.-$$Nest$fgetmTemplate(this$6);
                                                                    try {
                                                                        final boolean b = -$$Nest$fgetmTemplate3.getGradient() != null;
                                                                        final EngineActivity this$7 = this.this$0;
                                                                        try {
                                                                            final Template -$$Nest$fgetmTemplate4 = EngineActivity.-$$Nest$fgetmTemplate(this$7);
                                                                            try {
                                                                                EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)EditIpadFragment.getInstance(-$$Nest$fgetmResources, ipad_type, -$$Nest$fgetiIpadEditCallback, index_color, b, -$$Nest$fgetmTemplate4.isGlass()));
                                                                                final int container = R$id.m_container;
                                                                                try {
                                                                                    final EngineActivity this$8 = this.this$0;
                                                                                    try {
                                                                                        beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$8));
                                                                                        beginTransaction.commit();
                                                                                        final EngineActivity this$9 = this.this$0;
                                                                                        try {
                                                                                            final Resources -$$Nest$fgetmResources2 = EngineActivity.-$$Nest$fgetmResources(this$9);
                                                                                            try {
                                                                                                EngineActivity.-$$Nest$msetupShowFragment(this$9, -$$Nest$fgetmResources2.getString(R$string.ipad));
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
}
