// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

class ProVersionActivity$15 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$15(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        try {
            final ProVersionActivity this$0 = this.this$0;
            try {
                if (ProVersionActivity.-$$Nest$fgetrecyclerView(this$0) == null) {
                    return;
                }
                final ProVersionActivity this$2 = this.this$0;
                try {
                    if (ProVersionActivity.-$$Nest$fgetisUserScrolling(this$2)) {
                        return;
                    }
                    final ProVersionActivity this$3 = this.this$0;
                    try {
                        final RecyclerView -$$Nest$fgetrecyclerView = ProVersionActivity.-$$Nest$fgetrecyclerView(this$3);
                        try {
                            final RecyclerView$LayoutManager layoutManager = -$$Nest$fgetrecyclerView.getLayoutManager();
                            try {
                                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
                                if (linearLayoutManager == null) {
                                    return;
                                }
                                final int firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                final int n = -1;
                                final long n2 = 16;
                                Label_0094: {
                                    if (firstVisibleItemPosition != n) {
                                        break Label_0094;
                                    }
                                    final ProVersionActivity this$4 = this.this$0;
                                    try {
                                        ProVersionActivity.-$$Nest$fgetautoScrollHandler(this$4).postDelayed((Runnable)this, n2);
                                        return;
                                        final int n3 = linearLayoutManager.getItemCount() / 3;
                                        iftrue(Label_0136:)(firstVisibleItemPosition < n3 * 2);
                                        final int n4 = firstVisibleItemPosition - n3;
                                        final ProVersionActivity this$5 = this.this$0;
                                        try {
                                            ProVersionActivity.-$$Nest$fgetrecyclerView(this$5).scrollToPosition(n4);
                                            Label_0185: {
                                                break Label_0185;
                                                final int n5 = firstVisibleItemPosition + n3;
                                                final ProVersionActivity this$6 = this.this$0;
                                                try {
                                                    ProVersionActivity.-$$Nest$fgetrecyclerView(this$6).scrollToPosition(n5);
                                                    break Label_0185;
                                                    final ProVersionActivity this$7;
                                                    Label_0163: {
                                                        this$7 = this.this$0;
                                                    }
                                                    try {
                                                        ProVersionActivity.-$$Nest$fgetrecyclerView(this$7).scrollBy(2, 0);
                                                        final ProVersionActivity this$8 = this.this$0;
                                                        try {
                                                            ProVersionActivity.-$$Nest$fgetautoScrollHandler(this$8).postDelayed((Runnable)this, n2);
                                                            return;
                                                        }
                                                        catch (final Exception ex) {
                                                            ex.printStackTrace();
                                                        }
                                                    }
                                                    catch (final Exception ex2) {}
                                                }
                                                catch (final Exception ex3) {}
                                            }
                                            Label_0136: {
                                                iftrue(Label_0163:)(firstVisibleItemPosition >= n3);
                                            }
                                        }
                                        catch (final Exception ex4) {}
                                    }
                                    catch (final Exception ex5) {}
                                }
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
