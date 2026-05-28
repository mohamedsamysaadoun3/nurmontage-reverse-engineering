// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.FontFragment;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.ColorS_NameFragment;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$IEditS_Name;

class EngineActivity$93 implements EditS_NameFragment$IEditS_Name
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$93(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final SurahNameEntity surahNameEntity) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                EngineActivity.-$$Nest$mpausePlayer(this$0);
                final EngineActivity this$2 = this.this$0;
                try {
                    final FragmentManager supportFragmentManager = this$2.getSupportFragmentManager();
                    try {
                        final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                        try {
                            final EngineActivity this$3 = this.this$0;
                            try {
                                final EditS_NameFragment$IEditS_Name -$$Nest$fgetiEditSName = EngineActivity.-$$Nest$fgetiEditSName(this$3);
                                try {
                                    final EngineActivity this$4 = this.this$0;
                                    try {
                                        EngineActivity.-$$Nest$fputmCurrentFragment(this$3, (Fragment)ColorS_NameFragment.getInstance(-$$Nest$fgetiEditSName, surahNameEntity, EngineActivity.-$$Nest$fgetmResources(this$4)));
                                        final int container = R$id.m_container;
                                        try {
                                            final EngineActivity this$5 = this.this$0;
                                            try {
                                                beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$5));
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
    
    public void onDone() {
        EngineActivity.-$$Nest$mselectSurahName(this.this$0);
    }
    
    public void onEdit(final SurahNameEntity surahNameEntity) {
        try {
            EngineActivity.-$$Nest$fputisToCrop(this.this$0, true);
            try {
                final Intent intent = new Intent((Context)this.this$0, (Class)EditS_NameActivity.class);
                final String s = "surah_name";
                final EngineActivity this$0 = this.this$0;
                try {
                    final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$0);
                    try {
                        final SurahNameEntity surahNameEntity2 = -$$Nest$fgetblurredImageView.getSurahNameEntity();
                        try {
                            intent.putExtra(s, surahNameEntity2.getName());
                            final String s2 = "reader_name";
                            final EngineActivity this$2 = this.this$0;
                            try {
                                final BlurredImageView -$$Nest$fgetblurredImageView2 = EngineActivity.-$$Nest$fgetblurredImageView(this$2);
                                try {
                                    final SurahNameEntity surahNameEntity3 = -$$Nest$fgetblurredImageView2.getSurahNameEntity();
                                    try {
                                        intent.putExtra(s2, surahNameEntity3.getReader());
                                        final String s3 = "style";
                                        final EngineActivity this$3 = this.this$0;
                                        try {
                                            final BlurredImageView -$$Nest$fgetblurredImageView3 = EngineActivity.-$$Nest$fgetblurredImageView(this$3);
                                            try {
                                                final SurahNameEntity surahNameEntity4 = -$$Nest$fgetblurredImageView3.getSurahNameEntity();
                                                try {
                                                    intent.putExtra(s3, surahNameEntity4.getStyle());
                                                    final String s4 = "index";
                                                    final EngineActivity this$4 = this.this$0;
                                                    try {
                                                        final BlurredImageView -$$Nest$fgetblurredImageView4 = EngineActivity.-$$Nest$fgetblurredImageView(this$4);
                                                        try {
                                                            final SurahNameEntity surahNameEntity5 = -$$Nest$fgetblurredImageView4.getSurahNameEntity();
                                                            try {
                                                                intent.putExtra(s4, surahNameEntity5.getIndex_surah());
                                                                final String s5 = "isBg";
                                                                final EngineActivity this$5 = this.this$0;
                                                                try {
                                                                    final BlurredImageView -$$Nest$fgetblurredImageView5 = EngineActivity.-$$Nest$fgetblurredImageView(this$5);
                                                                    try {
                                                                        final SurahNameEntity surahNameEntity6 = -$$Nest$fgetblurredImageView5.getSurahNameEntity();
                                                                        try {
                                                                            intent.putExtra(s5, surahNameEntity6.isHaveBg());
                                                                            final String s6 = "clrBg";
                                                                            final EngineActivity this$6 = this.this$0;
                                                                            try {
                                                                                final BlurredImageView -$$Nest$fgetblurredImageView6 = EngineActivity.-$$Nest$fgetblurredImageView(this$6);
                                                                                try {
                                                                                    final SurahNameEntity surahNameEntity7 = -$$Nest$fgetblurredImageView6.getSurahNameEntity();
                                                                                    try {
                                                                                        intent.putExtra(s6, surahNameEntity7.getClrBg());
                                                                                        final EngineActivity this$7 = this.this$0;
                                                                                        try {
                                                                                            EngineActivity.-$$Nest$fgeteditSurahNameResult(this$7).launch((Object)intent);
                                                                                            this.this$0.overridePendingTransition(0, 0);
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
    
    public void onFont(final SurahNameEntity surahNameEntity) {
        final FragmentTransaction beginTransaction = this.this$0.getSupportFragmentManager().beginTransaction();
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputmCurrentFragment(this$0, (Fragment)FontFragment.getInstance(EngineActivity.-$$Nest$fgetiFontCallback(this$0), surahNameEntity.getNameFont(), surahNameEntity.getPaintAya().getTypeface()));
        beginTransaction.replace(R$id.m_container, EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0));
        beginTransaction.commit();
        final EngineActivity this$2 = this.this$0;
        EngineActivity.-$$Nest$msetupShowFragment(this$2, EngineActivity.-$$Nest$fgetmResources(this$2).getString(R$string.font));
    }
    
    public void update() {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).postInvalidate();
    }
}
