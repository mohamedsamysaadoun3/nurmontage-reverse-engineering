// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.res.Resources;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$IAudioCallback;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import java.util.List;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import android.graphics.RectF;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;

class EngineActivity$65 implements AddQuranFragment$IAddQuran
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$65(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdd(final String s, final String str, final String s2, final String s3, final int n, final int i, final String s4, final int n2, final int n3) {
        EngineActivity.-$$Nest$maddEntity(this.this$0, s, str + " " + i, s2, s3, n, i, s4, n2, n3);
    }
    
    public void onAddReaderName(String s, final String s2, final Uri uri) {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, true);
        final Intent intent = new Intent((Context)this.this$0, (Class)AddReaderNameActivity.class);
        intent.putExtra("name", s);
        if (uri != null) {
            s = "audio";
            intent.putExtra(s, uri.toString());
        }
        intent.putExtra("path_video_copy", s2);
        EngineActivity.-$$Nest$fgetnameReaderResult(this.this$0).launch((Object)intent);
    }
    
    public void onAddTranslation(final String s, final int n, final boolean b) {
        EngineActivity.-$$Nest$maddTranslationEntity(this.this$0, s, n, b);
    }
    
    public void onBismilah() {
        final boolean -$$Nest$maddEntityIste3adha = EngineActivity.-$$Nest$maddEntityIste3adha(this.this$0);
        final boolean -$$Nest$maddEntityBissmilah = EngineActivity.-$$Nest$maddEntityBissmilah(this.this$0);
        if (-$$Nest$maddEntityIste3adha && -$$Nest$maddEntityBissmilah) {
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateToRight();
        }
        else {
            EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateToRight(-$$Nest$maddEntityIste3adha);
        }
    }
    
    public void onCancel() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
    }
    
    public void onDone(final String s, final int n, final String s2, final Uri uri, final String s3) {
        this.this$0.runOnUiThread((Runnable)new EngineActivity$65$2(this));
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).updateSizeAya();
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).updateSizeAyaTrsl();
        final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0);
        final int clr_aya = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getClr_aya();
        final int ordinal = AyaTextPreset.NONE.ordinal();
        int n2;
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null) {
            n2 = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().getStyle();
        }
        else {
            n2 = SurahNameStyle.NONE.ordinal();
        }
        final int n3 = n2;
        final boolean b = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null && EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().isHaveBg();
        int clrBg;
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null) {
            clrBg = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().getClrBg();
        }
        else {
            clrBg = -16777216;
        }
        -$$Nest$fgetblurredImageView.setSurahNameEntity(s, s2, null, 1.0f, "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf", clr_aya, ordinal, n3, n, b, clrBg);
        if (s3 == null) {
            EngineActivity.-$$Nest$maddAudio(this.this$0, uri);
        }
        else {
            EngineActivity.-$$Nest$maddAudioFromVideo(this.this$0, uri, s3);
        }
    }
    
    public void onDone(final String s, final int n, final String s2, final List list) {
        this.this$0.runOnUiThread((Runnable)new EngineActivity$65$3(this));
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).updateSizeAya();
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).updateSizeAyaTrsl();
        final BlurredImageView -$$Nest$fgetblurredImageView = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0);
        final int clr_aya = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getClr_aya();
        final int ordinal = AyaTextPreset.NONE.ordinal();
        int n2;
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null) {
            n2 = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().getStyle();
        }
        else {
            n2 = SurahNameStyle.NONE.ordinal();
        }
        final int n3 = n2;
        final boolean b = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null && EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().isHaveBg();
        int clrBg;
        if (EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity() != null) {
            clrBg = EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).getSurahNameEntity().getClrBg();
        }
        else {
            clrBg = -16777216;
        }
        -$$Nest$fgetblurredImageView.setSurahNameEntity(s, s2, null, 1.0f, "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf", clr_aya, ordinal, n3, n, b, clrBg);
        if (NetworkUtils.isNetworkAvailable((Context)this.this$0) && list != null && !list.isEmpty()) {
            EngineActivity.-$$Nest$maddAudioReciters(this.this$0, list);
        }
        else {
            this.this$0.runOnUiThread((Runnable)new EngineActivity$65$4(this));
        }
    }
    
    public void onErrorLimitation() {
        this.this$0.runOnUiThread((Runnable)new EngineActivity$65$5(this));
    }
    
    public void onSearch() {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, true);
        EngineActivity.-$$Nest$fgetsearchAyaResult(this.this$0).launch((Object)new Intent((Context)this.this$0, (Class)QuranSearchActivity.class));
    }
    
    public void onVuCopyRight() {
        this.this$0.dialogCopyRight();
    }
    
    public void progress() {
        this.this$0.runOnUiThread((Runnable)new EngineActivity$65$1(this));
    }
    
    public void uploadRecitation() {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                try {
                    final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                    try {
                        final EngineActivity this$2 = this.this$0;
                        try {
                            final AddAudioFragment$IAudioCallback -$$Nest$fgetiAudioCallback = EngineActivity.-$$Nest$fgetiAudioCallback(this$2);
                            try {
                                final EngineActivity this$3 = this.this$0;
                                try {
                                    EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)AddAudioFragment.getInstance(-$$Nest$fgetiAudioCallback, EngineActivity.-$$Nest$fgetmResources(this$3)));
                                    final int container = R$id.m_container;
                                    try {
                                        final EngineActivity this$4 = this.this$0;
                                        try {
                                            beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$4));
                                            beginTransaction.commit();
                                            final EngineActivity this$5 = this.this$0;
                                            try {
                                                final Resources -$$Nest$fgetmResources = EngineActivity.-$$Nest$fgetmResources(this$5);
                                                try {
                                                    EngineActivity.-$$Nest$msetupShowFragment(this$5, -$$Nest$fgetmResources.getString(R$string.audio));
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
