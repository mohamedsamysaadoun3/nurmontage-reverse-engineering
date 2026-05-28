// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import android.graphics.Typeface;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;

class EngineActivity$94 implements FontFragment$IFontCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$94(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdd(final String s, final Typeface typeface) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$0);
                try {
                    Label_0064: {
                        if (!(-$$Nest$fgetblurredImageView.getEntity_select() instanceof SurahNameEntity)) {
                            break Label_0064;
                        }
                        final EngineActivity this$2 = this.this$0;
                        try {
                            final BlurredImageView -$$Nest$fgetblurredImageView2 = EngineActivity.-$$Nest$fgetblurredImageView(this$2);
                            try {
                                -$$Nest$fgetblurredImageView2.getSurahNameEntity().setTypeface(typeface, s);
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    final BlurredImageView -$$Nest$fgetblurredImageView3 = EngineActivity.-$$Nest$fgetblurredImageView(this$3);
                                    try {
                                        -$$Nest$fgetblurredImageView3.invalidate();
                                        Label_0088: {
                                            break Label_0088;
                                            final EngineActivity this$4 = this.this$0;
                                            try {
                                                EngineActivity.-$$Nest$fgetblurredImageView(this$4).setTypeface(typeface, s);
                                                FontFragment.instance.add(typeface, s);
                                                return;
                                            }
                                            catch (final Exception ex) {}
                                        }
                                        iftrue(Label_0088:)(s == null || typeface == null);
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
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
    
    public void onCancel(final String s, final Typeface typeface) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$0);
                try {
                    Label_0073: {
                        if (!(-$$Nest$fgetblurredImageView.getEntity_select() instanceof SurahNameEntity)) {
                            break Label_0073;
                        }
                        final EngineActivity this$2 = this.this$0;
                        try {
                            final BlurredImageView -$$Nest$fgetblurredImageView2 = EngineActivity.-$$Nest$fgetblurredImageView(this$2);
                            try {
                                -$$Nest$fgetblurredImageView2.getSurahNameEntity().setTypeface(typeface, s);
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    final BlurredImageView -$$Nest$fgetblurredImageView3 = EngineActivity.-$$Nest$fgetblurredImageView(this$3);
                                    try {
                                        -$$Nest$fgetblurredImageView3.invalidate();
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            EngineActivity.-$$Nest$mselectSurahName(this$4);
                                            return;
                                            final EngineActivity this$5 = this.this$0;
                                            try {
                                                EngineActivity.-$$Nest$fgetblurredImageView(this$5).setTypeface(typeface, s);
                                                final EngineActivity this$6;
                                                Label_0097: {
                                                    this$6 = this.this$0;
                                                }
                                                try {
                                                    EngineActivity.-$$Nest$mhideFragment(this$6);
                                                    final EngineActivity this$7 = this.this$0;
                                                    try {
                                                        final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = EngineActivity.-$$Nest$fgetiTrimLineCallback(this$7);
                                                        try {
                                                            final EngineActivity this$8 = this.this$0;
                                                            try {
                                                                final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$8);
                                                                try {
                                                                    -$$Nest$fgetiTrimLineCallback.onSelectEntity(-$$Nest$fgettrackViewEntity.getSelectedEntity(), -1.0f);
                                                                    return;
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
                                            iftrue(Label_0097:)(s == null || typeface == null);
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
            catch (final Exception ex13) {}
        }
        catch (final Exception ex14) {}
    }
    
    public void onDone(final String s, final Typeface typeface) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mhideFragment(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$2);
                    try {
                        Label_0045: {
                            if (!(-$$Nest$fgetblurredImageView.getEntity_select() instanceof SurahNameEntity)) {
                                break Label_0045;
                            }
                            final EngineActivity this$3 = this.this$0;
                            try {
                                EngineActivity.-$$Nest$mselectSurahName(this$3);
                                return;
                                final EngineActivity this$4 = this.this$0;
                                try {
                                    final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = EngineActivity.-$$Nest$fgetiTrimLineCallback(this$4);
                                    try {
                                        final EngineActivity this$5 = this.this$0;
                                        try {
                                            final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$5);
                                            try {
                                                -$$Nest$fgetiTrimLineCallback.onSelectEntity(-$$Nest$fgettrackViewEntity.getSelectedEntity(), -1.0f);
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
