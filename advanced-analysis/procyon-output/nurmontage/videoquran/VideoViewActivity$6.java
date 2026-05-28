// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import android.os.Parcelable;
import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import android.net.Uri;
import android.content.Intent;
import hazem.nurmontage.videoquran.Utils.Utils;
import android.view.View;
import android.view.View$OnClickListener;

class VideoViewActivity$6 implements View$OnClickListener
{
    final /* synthetic */ VideoViewActivity this$0;
    
    VideoViewActivity$6(final VideoViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final String s = "Send To";
        try {
            final VideoViewActivity this$0 = this.this$0;
            try {
                final String -$$Nest$fgetreader = VideoViewActivity.-$$Nest$fgetreader(this$0);
                try {
                    Label_0077: {
                        if (Utils.isProbablyLArabic(-$$Nest$fgetreader)) {
                            break Label_0077;
                        }
                        final String format = "%s %s #NurMontage_app #\u0642\u0631\u0622\u0646_\u0643\u0631\u064a\u0645 ";
                        final VideoViewActivity this$2 = this.this$0;
                        try {
                            final String -$$Nest$fgetsurah = VideoViewActivity.-$$Nest$fgetsurah(this$2);
                            try {
                                final VideoViewActivity this$3 = this.this$0;
                                try {
                                    final String -$$Nest$fgetreader2 = VideoViewActivity.-$$Nest$fgetreader(this$3);
                                    try {
                                        String s2 = String.format(format, -$$Nest$fgetsurah, -$$Nest$fgetreader2);
                                        Label_0129: {
                                            break Label_0129;
                                            final String format2 = " %s \u0628\u0635\u0648\u062a %s #\u062a\u0637\u0628\u064a\u0642_NurMontage #\u0642\u0631\u0622\u0646_\u0643\u0631\u064a\u0645";
                                            final VideoViewActivity this$4 = this.this$0;
                                            try {
                                                final String -$$Nest$fgetsurah2 = VideoViewActivity.-$$Nest$fgetsurah(this$4);
                                                try {
                                                    final VideoViewActivity this$5 = this.this$0;
                                                    try {
                                                        final String -$$Nest$fgetreader3 = VideoViewActivity.-$$Nest$fgetreader(this$5);
                                                        try {
                                                            s2 = String.format(format2, -$$Nest$fgetsurah2, -$$Nest$fgetreader3);
                                                            try {
                                                                final Intent intent = new Intent("android.intent.action.SEND");
                                                                intent.putExtra("act", "ACT_SHARE");
                                                                intent.putExtra("android.intent.extra.TITLE", s);
                                                                intent.putExtra("android.intent.extra.TEXT", s2);
                                                                final String s3 = "android.intent.extra.SUBJECT";
                                                                final VideoViewActivity this$6 = this.this$0;
                                                                try {
                                                                    final Resources -$$Nest$fgetmResources = VideoViewActivity.-$$Nest$fgetmResources(this$6);
                                                                    try {
                                                                        intent.putExtra(s3, -$$Nest$fgetmResources.getString(R$string.nurmontage_app));
                                                                        final String s4 = "android.intent.extra.STREAM";
                                                                        final VideoViewActivity this$7 = this.this$0;
                                                                        try {
                                                                            final Resources resources = this$7.getResources();
                                                                            try {
                                                                                final String string = resources.getString(R$string.file_provider);
                                                                                try {
                                                                                    try {
                                                                                        final VideoViewActivity this$8 = this.this$0;
                                                                                        try {
                                                                                            final String -$$Nest$fgetmUri = VideoViewActivity.-$$Nest$fgetmUri(this$8);
                                                                                            try {
                                                                                                final Uri parse = Uri.parse(-$$Nest$fgetmUri);
                                                                                                try {
                                                                                                    intent.putExtra(s4, (Parcelable)FileProvider.getUriForFile((Context)this$7, string, new File(parse.getPath())));
                                                                                                    intent.setType("video/mp4");
                                                                                                    this.this$0.startActivity(Intent.createChooser(intent, (CharSequence)s));
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
                                    }
                                    catch (final Exception ex15) {}
                                }
                                catch (final Exception ex16) {}
                            }
                            catch (final Exception ex17) {}
                        }
                        catch (final Exception ex18) {}
                    }
                }
                catch (final Exception ex19) {}
            }
            catch (final Exception ex20) {}
        }
        catch (final Exception ex21) {}
    }
}
