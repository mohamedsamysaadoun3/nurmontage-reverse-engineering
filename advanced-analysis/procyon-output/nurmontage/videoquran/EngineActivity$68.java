// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

class EngineActivity$68 implements ActivityResultCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$68(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onActivityResult(final ActivityResult activityResult) {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, false);
        try {
            Label_0033: {
                if (AddQuranFragment.instance == null) {
                    break Label_0033;
                }
                final AddQuranFragment instance = AddQuranFragment.instance;
                try {
                    instance.addAyaIndex();
                    return;
                    final EngineActivity this$0 = this.this$0;
                    try {
                        final FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                        try {
                            final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            try {
                                final EngineActivity this$2 = this.this$0;
                                try {
                                    final AddQuranFragment$IAddQuran -$$Nest$fgetiAddQuran = EngineActivity.-$$Nest$fgetiAddQuran(this$2);
                                    try {
                                        final EngineActivity this$3 = this.this$0;
                                        try {
                                            EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)AddQuranFragment.getInstance(-$$Nest$fgetiAddQuran, EngineActivity.-$$Nest$fgetmResources(this$3)));
                                            final int container = R$id.m_container;
                                            try {
                                                final EngineActivity this$4 = this.this$0;
                                                try {
                                                    beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$4));
                                                    beginTransaction.commit();
                                                    final EngineActivity this$5 = this.this$0;
                                                    try {
                                                        final EngineActivity$68$1 engineActivity$68$1 = new EngineActivity$68$1(this);
                                                        final EngineActivity engineActivity = this$5;
                                                        try {
                                                            engineActivity.runOnUiThread((Runnable)engineActivity$68$1);
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
        }
        catch (final Exception ex12) {}
    }
}
