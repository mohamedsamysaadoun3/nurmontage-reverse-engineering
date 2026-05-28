// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.graphics.Typeface;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.content.Context;
import android.app.Dialog;

class SeettingActivity$19 implements Runnable
{
    final /* synthetic */ SeettingActivity this$0;
    final /* synthetic */ boolean val$s;
    
    SeettingActivity$19(final SeettingActivity this$0, final boolean val$s) {
        this.this$0 = this$0;
        this.val$s = val$s;
    }
    
    public void run() {
        try {
            final SeettingActivity this$0 = this.this$0;
            try {
                try {
                    final Dialog dialog = new Dialog((Context)this.this$0);
                    final SeettingActivity seettingActivity = this$0;
                    try {
                        SeettingActivity.-$$Nest$fputdialog(seettingActivity, dialog);
                        final SeettingActivity this$2 = this.this$0;
                        try {
                            SeettingActivity.-$$Nest$fgetdialog(this$2).setCancelable(false);
                            final SeettingActivity this$3 = this.this$0;
                            try {
                                SeettingActivity.-$$Nest$fgetdialog(this$3).requestWindowFeature(1);
                                final SeettingActivity this$4 = this.this$0;
                                try {
                                    final Dialog -$$Nest$fgetdialog = SeettingActivity.-$$Nest$fgetdialog(this$4);
                                    try {
                                        -$$Nest$fgetdialog.getWindow().setLayout(-1, -2);
                                        final SeettingActivity this$5 = this.this$0;
                                        try {
                                            final Dialog -$$Nest$fgetdialog2 = SeettingActivity.-$$Nest$fgetdialog(this$5);
                                            try {
                                                final Window window = -$$Nest$fgetdialog2.getWindow();
                                                try {
                                                    final ColorDrawable backgroundDrawable = new ColorDrawable(0);
                                                    final Window window2 = window;
                                                    try {
                                                        window2.setBackgroundDrawable((Drawable)backgroundDrawable);
                                                        Label_0294: {
                                                            if (!this.val$s) {
                                                                break Label_0294;
                                                            }
                                                            final SeettingActivity this$6 = this.this$0;
                                                            try {
                                                                final LayoutInflater from = LayoutInflater.from((Context)this$6);
                                                                try {
                                                                    final View inflate = from.inflate(R$layout.layout_pro_done, (ViewGroup)null);
                                                                    try {
                                                                        final SeettingActivity this$7 = this.this$0;
                                                                        try {
                                                                            SeettingActivity.-$$Nest$fgetdialog(this$7).setContentView(inflate);
                                                                            final View viewById = inflate.findViewById(R$id.dialog_title);
                                                                            try {
                                                                                final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)viewById;
                                                                                try {
                                                                                    final SeettingActivity this$8 = this.this$0;
                                                                                    try {
                                                                                        final Resources -$$Nest$fgetmResources = SeettingActivity.-$$Nest$fgetmResources(this$8);
                                                                                        try {
                                                                                            textCustumFontBold.setText((CharSequence)-$$Nest$fgetmResources.getString(R$string.premium_activated));
                                                                                            final View viewById2 = inflate.findViewById(R$id.tv_msj);
                                                                                            try {
                                                                                                final TextCustumFont textCustumFont = (TextCustumFont)viewById2;
                                                                                                try {
                                                                                                    final SeettingActivity this$9 = this.this$0;
                                                                                                    try {
                                                                                                        final Resources -$$Nest$fgetmResources2 = SeettingActivity.-$$Nest$fgetmResources(this$9);
                                                                                                        try {
                                                                                                            textCustumFont.setText((CharSequence)-$$Nest$fgetmResources2.getString(R$string.subscription_restored));
                                                                                                            final View viewById3 = inflate.findViewById(R$id.dialog_no);
                                                                                                            try {
                                                                                                                final SeettingActivity$19$1 onClickListener = new SeettingActivity$19$1(this);
                                                                                                                final View view = viewById3;
                                                                                                                try {
                                                                                                                    view.setOnClickListener((View$OnClickListener)onClickListener);
                                                                                                                    Label_0506: {
                                                                                                                        break Label_0506;
                                                                                                                        final SeettingActivity this$10 = this.this$0;
                                                                                                                        try {
                                                                                                                            final LayoutInflater from2 = LayoutInflater.from((Context)this$10);
                                                                                                                            try {
                                                                                                                                final View inflate2 = from2.inflate(R$layout.layout_pro_not_found, (ViewGroup)null);
                                                                                                                                try {
                                                                                                                                    final SeettingActivity this$11 = this.this$0;
                                                                                                                                    try {
                                                                                                                                        SeettingActivity.-$$Nest$fgetdialog(this$11).setContentView(inflate2);
                                                                                                                                        final View viewById4 = inflate2.findViewById(R$id.dialog_title);
                                                                                                                                        try {
                                                                                                                                            final TextCustumFontBold textCustumFontBold2 = (TextCustumFontBold)viewById4;
                                                                                                                                            try {
                                                                                                                                                final SeettingActivity this$12 = this.this$0;
                                                                                                                                                try {
                                                                                                                                                    final Resources -$$Nest$fgetmResources3 = SeettingActivity.-$$Nest$fgetmResources(this$12);
                                                                                                                                                    try {
                                                                                                                                                        textCustumFontBold2.setText((CharSequence)-$$Nest$fgetmResources3.getString(R$string.nothing_to_restore));
                                                                                                                                                        final View viewById5 = inflate2.findViewById(R$id.tv_msj);
                                                                                                                                                        try {
                                                                                                                                                            final TextCustumFont textCustumFont2 = (TextCustumFont)viewById5;
                                                                                                                                                            try {
                                                                                                                                                                final SeettingActivity this$13 = this.this$0;
                                                                                                                                                                try {
                                                                                                                                                                    final Resources -$$Nest$fgetmResources4 = SeettingActivity.-$$Nest$fgetmResources(this$13);
                                                                                                                                                                    try {
                                                                                                                                                                        textCustumFont2.setText((CharSequence)-$$Nest$fgetmResources4.getString(R$string.msj_no_found_subscribe));
                                                                                                                                                                        final SeettingActivity this$14 = this.this$0;
                                                                                                                                                                        try {
                                                                                                                                                                            final Resources resources = this$14.getResources();
                                                                                                                                                                            try {
                                                                                                                                                                                final Typeface fromAsset = Typeface.createFromAsset(resources.getAssets(), "fonts/ReadexPro_Medium.ttf");
                                                                                                                                                                                try {
                                                                                                                                                                                    final View viewById6 = inflate2.findViewById(R$id.contact_us);
                                                                                                                                                                                    try {
                                                                                                                                                                                        final Button button = (Button)viewById6;
                                                                                                                                                                                        button.setTypeface(fromAsset);
                                                                                                                                                                                        final SeettingActivity$19$2 onClickListener2 = new SeettingActivity$19$2(this);
                                                                                                                                                                                        final Button button2 = button;
                                                                                                                                                                                        try {
                                                                                                                                                                                            button2.setOnClickListener((View$OnClickListener)onClickListener2);
                                                                                                                                                                                            final View viewById7 = inflate2.findViewById(R$id.dialog_no);
                                                                                                                                                                                            try {
                                                                                                                                                                                                final SeettingActivity$19$3 onClickListener3 = new SeettingActivity$19$3(this);
                                                                                                                                                                                                final View view2 = viewById7;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    view2.setOnClickListener((View$OnClickListener)onClickListener3);
                                                                                                                                                                                                    final SeettingActivity this$15 = this.this$0;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        final Dialog -$$Nest$fgetdialog3 = SeettingActivity.-$$Nest$fgetdialog(this$15);
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            -$$Nest$fgetdialog3.show();
                                                                                                                                                                                                            final SeettingActivity this$16 = this.this$0;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                this$16.findViewById(R$id.progress).setVisibility(8);
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
                                                                                                                catch (final Exception ex23) {}
                                                                                                            }
                                                                                                            catch (final Exception ex24) {}
                                                                                                        }
                                                                                                        catch (final Exception ex25) {}
                                                                                                    }
                                                                                                    catch (final Exception ex26) {}
                                                                                                }
                                                                                                catch (final Exception ex27) {}
                                                                                            }
                                                                                            catch (final Exception ex28) {}
                                                                                        }
                                                                                        catch (final Exception ex29) {}
                                                                                    }
                                                                                    catch (final Exception ex30) {}
                                                                                }
                                                                                catch (final Exception ex31) {}
                                                                            }
                                                                            catch (final Exception ex32) {}
                                                                        }
                                                                        catch (final Exception ex33) {}
                                                                    }
                                                                    catch (final Exception ex34) {}
                                                                }
                                                                catch (final Exception ex35) {}
                                                            }
                                                            catch (final Exception ex36) {}
                                                        }
                                                    }
                                                    catch (final Exception ex37) {}
                                                }
                                                catch (final Exception ex38) {}
                                            }
                                            catch (final Exception ex39) {}
                                        }
                                        catch (final Exception ex40) {}
                                    }
                                    catch (final Exception ex41) {}
                                }
                                catch (final Exception ex42) {}
                            }
                            catch (final Exception ex43) {}
                        }
                        catch (final Exception ex44) {}
                    }
                    catch (final Exception ex45) {}
                }
                catch (final Exception ex46) {}
            }
            catch (final Exception ex47) {}
        }
        catch (final Exception ex48) {}
    }
}
