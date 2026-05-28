// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import android.graphics.drawable.Drawable;
import android.content.Context;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import android.util.Log;
import android.graphics.drawable.VectorDrawable;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.Utils.DrawableHelper;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;

class EngineActivity$92 implements EditIconQuranFragment$IQuranIconCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$92(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void add(String string) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$0);
                try {
                    final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                    try {
                        final EntityView entityView = selectedEntity.getEntityView();
                        try {
                            final QuranEntity quranEntity = (QuranEntity)entityView;
                            try {
                                final EngineActivity this$2 = this.this$0;
                                try {
                                    final Context applicationContext = this$2.getApplicationContext();
                                    try {
                                        final Drawable drawable = ContextCompat.getDrawable(applicationContext, DrawableHelper.getIDDrawableIconByName(string));
                                        try {
                                            quranEntity.setVectorDrawable((VectorDrawable)drawable);
                                            final QuranEntity quranEntity2 = quranEntity;
                                            try {
                                                quranEntity2.setIcon(string);
                                                quranEntity.updateIconDraw();
                                                quranEntity.initPreset(quranEntity.getmPreset());
                                                final EngineActivity this$3 = this.this$0;
                                                try {
                                                    final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$3);
                                                    try {
                                                        -$$Nest$fgetblurredImageView.invalidate();
                                                    }
                                                    catch (final Exception ex) {
                                                        string = "" + string;
                                                        Log.e("icon  e ", string);
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
    
    public void onCancel(final String icon) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final TrackEntityView -$$Nest$fgettrackViewEntity = EngineActivity.-$$Nest$fgettrackViewEntity(this$0);
                try {
                    final Entity selectedEntity = -$$Nest$fgettrackViewEntity.getSelectedEntity();
                    try {
                        final EntityView entityView = selectedEntity.getEntityView();
                        try {
                            final QuranEntity quranEntity = (QuranEntity)entityView;
                            try {
                                final EngineActivity this$2 = this.this$0;
                                try {
                                    final Context applicationContext = this$2.getApplicationContext();
                                    try {
                                        final Drawable drawable = ContextCompat.getDrawable(applicationContext, DrawableHelper.getIDDrawableIconByName(icon));
                                        try {
                                            quranEntity.setVectorDrawable((VectorDrawable)drawable);
                                            final QuranEntity quranEntity2 = quranEntity;
                                            try {
                                                quranEntity2.setIcon(icon);
                                                quranEntity.updateIconDraw();
                                                quranEntity.initPreset(quranEntity.getmPreset());
                                                final EngineActivity this$3 = this.this$0;
                                                try {
                                                    final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this$3);
                                                    try {
                                                        -$$Nest$fgetblurredImageView.invalidate();
                                                        final EngineActivity this$4 = this.this$0;
                                                        try {
                                                            EngineActivity.-$$Nest$mhideFragment(this$4);
                                                            final EngineActivity this$5 = this.this$0;
                                                            try {
                                                                final TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback = EngineActivity.-$$Nest$fgetiTrimLineCallback(this$5);
                                                                try {
                                                                    final EngineActivity this$6 = this.this$0;
                                                                    try {
                                                                        final TrackEntityView -$$Nest$fgettrackViewEntity2 = EngineActivity.-$$Nest$fgettrackViewEntity(this$6);
                                                                        try {
                                                                            -$$Nest$fgetiTrimLineCallback.onSelectEntity(-$$Nest$fgettrackViewEntity2.getSelectedEntity(), -1.0f);
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
    
    public void onDone(final String s) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final Context applicationContext = this$0.getApplicationContext();
                try {
                    final Drawable drawable = ContextCompat.getDrawable(applicationContext, DrawableHelper.getIDDrawableIconByName(s));
                    try {
                        final VectorDrawable vectorDrawable = (VectorDrawable)drawable;
                        try {
                            final EngineActivity this$2 = this.this$0;
                            try {
                                EngineActivity.-$$Nest$fgetblurredImageView(this$2).setIcon(s, vectorDrawable);
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    EngineActivity.-$$Nest$mhideFragment(this$3);
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
