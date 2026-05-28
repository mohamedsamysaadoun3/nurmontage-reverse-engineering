// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.ResizeFragment;
import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$32 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$32(final EngineActivity this$0) {
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
                            final DimensionAdabters$IDimensionCallback -$$Nest$fgetiDimensionCallback = EngineActivity.-$$Nest$fgetiDimensionCallback(this$2);
                            try {
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)ResizeFragment.getInstance(-$$Nest$fgetiDimensionCallback, EngineActivity.-$$Nest$fgetmResources(this$3), "16"));
                                    final int container = R$id.m_container;
                                    try {
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$4));
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
}
