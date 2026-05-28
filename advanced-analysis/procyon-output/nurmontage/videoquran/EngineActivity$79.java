// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$IAudioCallback;

class EngineActivity$79 implements AddAudioFragment$IAudioCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$79(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void cancel() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$0);
                try {
                    EngineActivity.-$$Nest$msetupShowFragment(this$0, -$$Nest$fgetmResources.getString(R$string.quran));
                    final EngineActivity this$2 = this.this$0;
                    try {
                        final FragmentManager supportFragmentManager = this$2.getSupportFragmentManager();
                        try {
                            final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            try {
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    final AddQuranFragment$IAddQuran -$$Nest$fgetiAddQuran = EngineActivity.-$$Nest$fgetiAddQuran(this$3);
                                    try {
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            EngineActivity.-$$Nest$fputmCurrentFragment(this$3, (Fragment)AddQuranFragment.getInstance(-$$Nest$fgetiAddQuran, EngineActivity.-$$Nest$fgetmResources(this$4)));
                                            final int container = R$id.m_container;
                                            try {
                                                final EngineActivity this$5 = this.this$0;
                                                try {
                                                    beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$5));
                                                    beginTransaction.commit();
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
    
    public void extract() {
        this.this$0.pickVideoForAudio();
    }
    
    public void upload() {
        if (EngineActivity.-$$Nest$mcheckPermissionAudio(this.this$0)) {
            this.this$0.pickAudio();
        }
    }
}
