// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;

class WorkUserActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ WorkUserActivity this$0;
    
    WorkUserActivity$1(final WorkUserActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        try {
            final WorkUserActivity this$0 = this.this$0;
            try {
                Label_0054: {
                    if (!WorkUserActivity.-$$Nest$fgetbackPressedOnce(this$0)) {
                        break Label_0054;
                    }
                    final WorkUserActivity this$2 = this.this$0;
                    try {
                        Label_0042: {
                            if (WorkUserActivity.-$$Nest$fgetmToast(this$2) == null) {
                                break Label_0042;
                            }
                            final WorkUserActivity this$3 = this.this$0;
                            try {
                                final Toast -$$Nest$fgetmToast = WorkUserActivity.-$$Nest$fgetmToast(this$3);
                                try {
                                    -$$Nest$fgetmToast.cancel();
                                    final WorkUserActivity this$4 = this.this$0;
                                    try {
                                        this$4.finish();
                                        return;
                                        WorkUserActivity.-$$Nest$fputbackPressedOnce(this.this$0, true);
                                        final WorkUserActivity this$5 = this.this$0;
                                        try {
                                            final Resources -$$Nest$fgetmResources = WorkUserActivity.-$$Nest$fgetmResources(this$5);
                                            try {
                                                WorkUserActivity.-$$Nest$fputmToast(this$5, Toast.makeText((Context)this$5, (CharSequence)-$$Nest$fgetmResources.getString(R$string.press_again_to_exit), 0));
                                                final WorkUserActivity this$6 = this.this$0;
                                                try {
                                                    final Toast -$$Nest$fgetmToast2 = WorkUserActivity.-$$Nest$fgetmToast(this$6);
                                                    try {
                                                        -$$Nest$fgetmToast2.show();
                                                        try {
                                                            new Handler(Looper.getMainLooper()).postDelayed((Runnable)new WorkUserActivity$1$1(this), 2000L);
                                                        }
                                                        catch (final Exception ex) {
                                                            this.this$0.finish();
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
                    }
                    catch (final Exception ex9) {}
                }
            }
            catch (final Exception ex10) {}
        }
        catch (final Exception ex11) {}
    }
}
