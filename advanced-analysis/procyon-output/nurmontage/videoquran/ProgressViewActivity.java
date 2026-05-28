// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.io.Serializable;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EntityTranslationTemplate;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecInfo;
import hazem.nurmontage.videoquran.model.SquareBitmapModel;
import androidx.core.view.WindowInsetsControllerCompat;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecCallback;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import hazem.nurmontage.videoquran.model.EntitySurahTemplate;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.FileMediaScanner;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import android.graphics.Color;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import com.arthenica.ffmpegkit.StatisticsCallback;
import com.arthenica.ffmpegkit.LogCallback;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import android.os.Build$VERSION;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Iterator;
import com.arthenica.ffmpegkit.FFmpegKit;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.constant.TransitionType;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import hazem.nurmontage.videoquran.model.EntityBismilahTemplate;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import com.arthenica.ffmpegkit.FFmpegSession;
import android.net.Uri;
import java.io.File;
import android.os.Handler;
import com.arthenica.ffmpegkit.Statistics;
import hazem.nurmontage.videoquran.model.RenderManager;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;
import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.model.Template;
import java.util.List;
import java.util.concurrent.Executor;
import android.app.Dialog;

public class ProgressViewActivity extends Base
{
    private final int FRAME_MS;
    private Dialog dialog;
    private float displayedProgress;
    private final Executor executor;
    private final List id_ffmpeg;
    private boolean isAnimating;
    private boolean isCancel;
    private volatile boolean isDestroy;
    private Template mTemplate;
    private String mUri;
    private final OnBackPressedCallback onBackPressedCallback;
    private final StringBuilder overlay;
    private SquareOutlineProgressBar progressIndicator;
    private final RenderManager renderManager;
    private final Runnable runnableProgress;
    private Statistics statistics;
    private float targetProgress;
    private final Handler uiHandler;
    private Thread workerThread;
    
    public ProgressViewActivity() {
        this.overlay = new StringBuilder();
        this.renderManager = new RenderManager();
        this.onBackPressedCallback = new ProgressViewActivity$1(this, true);
        this.executor = Executors.newSingleThreadExecutor();
        this.id_ffmpeg = new ArrayList();
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.displayedProgress = 0.0f;
        this.targetProgress = 0.0f;
        this.FRAME_MS = 16;
        this.isAnimating = false;
        this.runnableProgress = new ProgressViewActivity$11(this);
    }
    
    private int addBasmala(final EntityBismilahTemplate entityBismilahTemplate, final int n, final Semaphore semaphore, final CountDownLatch countDownLatch, final List list, final float n2) {
        if (entityBismilahTemplate == null) {
            return n;
        }
        final float abs = Math.abs(entityBismilahTemplate.getStart());
        float abs2 = Math.abs(entityBismilahTemplate.getEnd());
        final StringBuilder append = new StringBuilder().append(this.mTemplate.getFolder_template());
        final String str = "/";
        final File file = new File(append.append(str).append(entityBismilahTemplate.getFile()).toString());
        int i = 0;
        if (file.exists() && file.isFile() && file.length() > 0L) {
            final Transition transition = entityBismilahTemplate.getTransition();
            final String s = ":";
            final String s2 = "-i";
            final String s3 = ")'[ov";
            final String s4 = "]overlay=";
            final String s5 = ":enable='between(t,";
            final String s6 = ",";
            final String s7 = "[ov";
            final String s8 = "];";
            String str2 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String s43 = null;
            int n25 = 0;
            String str33 = null;
            String str34 = null;
            float f8 = 0.0f;
            String str35 = null;
            Label_6001: {
                if (transition != null) {
                    boolean b = false;
                    Label_0271: {
                        if (entityBismilahTemplate.getTransition().isOut()) {
                            if (entityBismilahTemplate.getTransition().getDuration_out() > 0.0f) {
                                b = true;
                                break Label_0271;
                            }
                        }
                        b = false;
                    }
                    final boolean b2 = entityBismilahTemplate.getTransition().isIn() && entityBismilahTemplate.getTransition().getDuration_in() > 0.0f;
                    str2 = str;
                    final String str3 = s;
                    final String str4 = ":y=";
                    final String str5 = "[seg";
                    final String str6 = "]";
                    final String str7 = "/TB";
                    final String s9 = "[";
                    final String str8 = "setpts=PTS-STARTPTS+";
                    final String s10 = "][seg";
                    if (b2 && b) {
                        final float duration_in = entityBismilahTemplate.getTransition().getDuration_in();
                        final String str9 = s10;
                        final float btm_x = entityBismilahTemplate.getBtm_x();
                        final float btm_y = entityBismilahTemplate.getBtm_y();
                        final float fromW = entityBismilahTemplate.getTransition().getFromW();
                        final Transition transition2 = entityBismilahTemplate.getTransition();
                        final float f = btm_y;
                        final String type_in = transition2.getType_in();
                        final TransitionType fade_IN = TransitionType.FADE_IN;
                        final String s11 = s8;
                        String s14 = null;
                        String s19 = null;
                        String s21 = null;
                        float n9 = 0.0f;
                        String s22 = null;
                        int n10 = 0;
                        String s23 = null;
                        String s24 = null;
                        Label_3311: {
                            String s25;
                            String str16;
                            String str17;
                            String str18;
                            String s26;
                            String s27;
                            String s28;
                            String s29;
                            String str19;
                            float f6;
                            String str20;
                            if (!type_in.equals(fade_IN.getValue())) {
                                final String type_out = entityBismilahTemplate.getTransition().getType_out();
                                final TransitionType fade_OUT = TransitionType.FADE_OUT;
                                final String s12 = s7;
                                if (!type_out.equals(fade_OUT.getValue())) {
                                    final float duration_out = entityBismilahTemplate.getTransition().getDuration_out();
                                    final float abs3 = Math.abs(abs2 - duration_out);
                                    final String s13 = s6;
                                    final String fadeInOut = this.fadeInOut(abs3 - abs, duration_in, duration_out);
                                    final float n3 = duration_in;
                                    final int n4 = (int)(abs2 - abs);
                                    final float n5 = n3;
                                    final float f2 = abs3;
                                    final float f3 = abs2;
                                    s14 = s11;
                                    final String str10 = s12;
                                    final float n6 = duration_out;
                                    final String s15 = s13;
                                    final String str11 = s5;
                                    final String s16 = s4;
                                    final String str12 = s3;
                                    final String generateVideoSegment = this.generateVideoSegment(entityBismilahTemplate, n, fadeInOut, n4, countDownLatch, semaphore);
                                    String s20;
                                    if (generateVideoSegment != null) {
                                        list.add(s2);
                                        list.add(generateVideoSegment);
                                        final int n7 = n + 1;
                                        this.overlay.append(s9).append(n7).append(str6).append(str8).append(abs).append(str7).append(str5).append(n7).append(s11);
                                        float f4;
                                        String s17;
                                        if (type_in.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                            f4 = btm_x - fromW;
                                            final float n8 = -1.0f;
                                            i = n7;
                                            s17 = this.mSlideX(abs, n3, btm_x, fromW, n8, 0.0f);
                                        }
                                        else {
                                            i = n7;
                                            f4 = btm_x + fromW;
                                            s17 = this.mSlideX(abs, n3, btm_x, fromW, 1.0f, 0.0f);
                                        }
                                        final String str13 = s17;
                                        float f5;
                                        String str14;
                                        if (entityBismilahTemplate.getTransition().getType_out().equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                            f5 = btm_x + fromW;
                                            str14 = this.mSlideX(f2, n6, btm_x, fromW, 0.0f, 1.0f);
                                        }
                                        else {
                                            f5 = btm_x - fromW;
                                            str14 = this.mSlideX(f2, n6, btm_x, fromW, 0.0f, -1.0f);
                                        }
                                        final StringBuilder append2 = new StringBuilder("'if(lt(t,").append(abs);
                                        final String s18 = "),";
                                        final StringBuilder append3 = append2.append(s18).append(f4);
                                        final String str15 = ",if(lt(t,";
                                        final StringBuilder append4 = append3.append(str15).append(abs + n5).append(s18).append(str13).append(str15).append(f2).append(s18).append(btm_x).append(str15).append(f2 + n6).append(s18).append(str14);
                                        s19 = s15;
                                        final String string = append4.append(s15).append(f5).append("))))'").toString();
                                        final StringBuilder overlay = this.overlay;
                                        s20 = str10;
                                        final StringBuilder append5 = overlay.append(str10).append(n).append(str9).append(i).append("]overlay=x=").append(string).append(str4).append(f);
                                        s21 = str11;
                                        final StringBuilder append6 = append5.append(str11).append(abs).append(s15);
                                        n9 = f3;
                                        final StringBuilder append7 = append6.append(f3);
                                        s22 = str12;
                                        append7.append(str12).append(i).append(s14);
                                        n10 = 1;
                                    }
                                    else {
                                        n9 = abs2;
                                        s20 = s12;
                                        s19 = s13;
                                        s21 = s5;
                                        s22 = str12;
                                        i = n;
                                        n10 = 0;
                                    }
                                    s23 = s20;
                                    s24 = s16;
                                    break Label_3311;
                                }
                                s25 = s6;
                                str16 = s5;
                                str17 = s4;
                                str18 = s3;
                                s26 = str4;
                                s27 = str5;
                                s28 = str7;
                                s29 = str8;
                                str19 = str9;
                                f6 = btm_y;
                                str20 = s12;
                            }
                            else {
                                str20 = s7;
                                s25 = s6;
                                str16 = s5;
                                str17 = s4;
                                str18 = s3;
                                s26 = str4;
                                s27 = str5;
                                s28 = str7;
                                s29 = str8;
                                str19 = str9;
                                f6 = btm_y;
                            }
                            final float n11 = duration_in;
                            final TransitionType fade_IN2 = TransitionType.FADE_IN;
                            final String s30 = s26;
                            if (type_in.equals(fade_IN2.getValue())) {
                                final float duration_out2 = entityBismilahTemplate.getTransition().getDuration_out();
                                final float abs4 = Math.abs(abs2 - duration_out2);
                                final String type_out2 = entityBismilahTemplate.getTransition().getType_out();
                                final String fadeInOut2 = this.fadeInOut(abs4 - abs, n11, duration_out2);
                                final int n12 = (int)(abs2 - abs);
                                final float f7 = abs2;
                                final String str21 = s30;
                                final String str22 = s25;
                                final String s31 = s27;
                                final String s32 = fadeInOut2;
                                final String str23 = s29;
                                final String str24 = s31;
                                final String generateVideoSegment2 = this.generateVideoSegment(entityBismilahTemplate, n, s32, n12, countDownLatch, semaphore);
                                String s33;
                                String s34;
                                String s35;
                                float n15;
                                String s36;
                                if (generateVideoSegment2 != null) {
                                    list.add(s2);
                                    list.add(generateVideoSegment2);
                                    final int n13 = n + 1;
                                    final StringBuilder append8 = this.overlay.append(s9).append(n13).append(str6).append(str23).append(abs).append(s28).append(str24).append(n13);
                                    s14 = s11;
                                    append8.append(s11);
                                    String str25;
                                    if (type_out2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        final float n14 = 1.0f;
                                        i = n13;
                                        str25 = this.slideX(abs4, duration_out2, btm_x, fromW, 0.0f, n14);
                                    }
                                    else {
                                        i = n13;
                                        if (type_out2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                            str25 = this.slideX(abs4, duration_out2, btm_x, fromW, 0.0f, -1.0f);
                                        }
                                        else {
                                            str25 = "" + btm_x;
                                        }
                                    }
                                    final StringBuilder overlay2 = this.overlay;
                                    s33 = str20;
                                    final StringBuilder append9 = overlay2.append(str20).append(n).append(str19).append(i);
                                    s34 = str17;
                                    final StringBuilder append10 = append9.append(str17).append(str25).append(str21).append(f6);
                                    s21 = str16;
                                    final StringBuilder append11 = append10.append(str16).append(abs);
                                    s35 = str22;
                                    final StringBuilder append12 = append11.append(str22);
                                    n15 = f7;
                                    final StringBuilder append13 = append12.append(f7);
                                    s36 = str18;
                                    append13.append(str18).append(i).append(s14);
                                    n10 = 1;
                                }
                                else {
                                    s14 = s11;
                                    s34 = str17;
                                    s36 = str18;
                                    s21 = str16;
                                    s33 = str20;
                                    n15 = abs2;
                                    s35 = str22;
                                    i = n;
                                    n10 = 0;
                                }
                                final String s37 = s33;
                                s24 = s34;
                                s19 = s35;
                                n9 = n15;
                                s22 = s36;
                                s23 = s37;
                            }
                            else {
                                final String s38 = s25;
                                final String s39 = type_in;
                                final String s40 = s28;
                                final String s41 = s29;
                                final String s42 = s27;
                                Label_3298: {
                                    if (s39.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        final float duration_out3 = entityBismilahTemplate.getTransition().getDuration_out();
                                        final String fadeInOut3 = this.fadeInOut(Math.abs(abs2 - duration_out3) - abs, n11, duration_out3);
                                        final int n16 = (int)(abs2 - abs);
                                        final String str26 = s42;
                                        final float n17 = n11;
                                        final String generateVideoSegment3 = this.generateVideoSegment(entityBismilahTemplate, n, fadeInOut3, n16, countDownLatch, semaphore);
                                        if (generateVideoSegment3 == null) {
                                            s22 = str18;
                                            s24 = str17;
                                            s21 = str16;
                                            s19 = s38;
                                            s14 = s11;
                                            n9 = abs2;
                                            s23 = str20;
                                            break Label_3298;
                                        }
                                        list.add(s2);
                                        list.add(generateVideoSegment3);
                                        final int n18 = n + 1;
                                        final StringBuilder append14 = this.overlay.append(s9).append(n18).append(str6).append(s41).append(abs).append(s28).append(str26).append(n18);
                                        s14 = s11;
                                        append14.append(s11);
                                        final float n19 = -1.0f;
                                        i = n18;
                                        final String slideX = this.slideX(abs, n17, btm_x, fromW, n19, 0.0f);
                                        final StringBuilder overlay3 = this.overlay;
                                        s23 = str20;
                                        final StringBuilder append15 = overlay3.append(str20).append(n).append(str19).append(i);
                                        s24 = str17;
                                        final StringBuilder append16 = append15.append(str17).append(slideX).append(s30).append(f6);
                                        s21 = str16;
                                        final StringBuilder append17 = append16.append(str16).append(abs);
                                        s19 = s38;
                                        final StringBuilder append18 = append17.append(s38);
                                        n9 = abs2;
                                        final StringBuilder append19 = append18.append(abs2);
                                        s22 = str18;
                                        append19.append(str18).append(i).append(s11);
                                    }
                                    else {
                                        final float n20 = n11;
                                        s23 = str20;
                                        s24 = str17;
                                        if (!s39.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                            n9 = abs2;
                                            s22 = str18;
                                            s21 = str16;
                                            s19 = s38;
                                            s14 = s11;
                                            break Label_3298;
                                        }
                                        final float duration_out4 = entityBismilahTemplate.getTransition().getDuration_out();
                                        final float n21 = Math.abs(abs2 - duration_out4) - abs;
                                        final String str27 = s40;
                                        final String fadeInOut4 = this.fadeInOut(n21, n11, duration_out4);
                                        final int n22 = (int)(abs2 - abs);
                                        final String str28 = s42;
                                        final String generateVideoSegment4 = this.generateVideoSegment(entityBismilahTemplate, n, fadeInOut4, n22, countDownLatch, semaphore);
                                        if (generateVideoSegment4 == null) {
                                            s22 = str18;
                                            s21 = str16;
                                            s19 = s38;
                                            s14 = s11;
                                            n9 = abs2;
                                            s24 = str17;
                                            s23 = str20;
                                            break Label_3298;
                                        }
                                        list.add(s2);
                                        list.add(generateVideoSegment4);
                                        final int n23 = n + 1;
                                        final StringBuilder append20 = this.overlay.append(s9).append(n23).append(str6).append(s41).append(abs).append(str27).append(str28).append(n23);
                                        s14 = s11;
                                        append20.append(s11);
                                        final float n24 = 1.0f;
                                        i = n23;
                                        final String slideX2 = this.slideX(abs, n20, btm_x, fromW, n24, 0.0f);
                                        final StringBuilder overlay4 = this.overlay;
                                        s23 = str20;
                                        final StringBuilder append21 = overlay4.append(str20).append(n).append(str19).append(i);
                                        s24 = str17;
                                        final StringBuilder append22 = append21.append(str17).append(slideX2).append(s30).append(f6);
                                        s21 = str16;
                                        final StringBuilder append23 = append22.append(str16).append(abs);
                                        s19 = s38;
                                        final StringBuilder append24 = append23.append(s38);
                                        n9 = abs2;
                                        final StringBuilder append25 = append24.append(abs2);
                                        s22 = str18;
                                        append25.append(str18).append(i).append(s11);
                                    }
                                    n10 = 1;
                                    break Label_3311;
                                }
                                i = n;
                                n10 = 0;
                            }
                        }
                        str29 = s19;
                        str30 = s24;
                        str31 = s22;
                        str32 = s14;
                        s43 = s2;
                        n25 = n10;
                        abs2 = n9;
                        str33 = str3;
                        final String s44 = s23;
                        str34 = s21;
                        f8 = abs;
                        str35 = s44;
                        break Label_6001;
                    }
                    final String s45 = s8;
                    final String s46 = s6;
                    final String s47 = s5;
                    final String s48 = s4;
                    final String s49 = s3;
                    final String s50 = s10;
                    final String s51 = str7;
                    final String s52 = s7;
                    final float f9 = abs2;
                    final String s53 = str4;
                    if (b2) {
                        final float duration_in2 = entityBismilahTemplate.getTransition().getDuration_in();
                        final float btm_x2 = entityBismilahTemplate.getBtm_x();
                        final float btm_y2 = entityBismilahTemplate.getBtm_y();
                        final float fromW2 = entityBismilahTemplate.getTransition().getFromW();
                        final Transition transition3 = entityBismilahTemplate.getTransition();
                        final float f10 = btm_y2;
                        final String type_in2 = transition3.getType_in();
                        final String str36 = s47;
                        final String s54 = type_in2;
                        final String mFadeFilter = this.mFadeFilter(0.0f, duration_in2, true);
                        final int n26 = (int)(f9 - abs);
                        final float n27 = duration_in2;
                        final String s55 = s53;
                        final String str37 = s48;
                        final String str38 = s51;
                        final String str39 = s50;
                        final String str40 = s52;
                        final String generateVideoSegment5 = this.generateVideoSegment(entityBismilahTemplate, n, mFadeFilter, n26, countDownLatch, semaphore);
                        String s58 = null;
                        float n29 = 0.0f;
                        String s59 = null;
                        int n30 = 0;
                        String s60 = null;
                        String s61 = null;
                        String s62 = null;
                        String s63 = null;
                        String s64 = null;
                        int n34;
                        if (generateVideoSegment5 != null) {
                            list.add(s2);
                            list.add(generateVideoSegment5);
                            final int n28 = n + 1;
                            final StringBuilder append26 = this.overlay.append(s9).append(n28).append(str6).append(str8).append(abs).append(str38).append(str5).append(n28);
                            final String s56 = s45;
                            append26.append(s45);
                            final String value = TransitionType.FADE_IN.getValue();
                            final String s57 = s54;
                            Label_4460: {
                                if (s54.equals(value)) {
                                    final StringBuilder append27 = this.overlay.append(str40).append(n).append(str39).append(n28);
                                    s58 = str37;
                                    final StringBuilder append28 = append27.append(str37).append(btm_x2).append(str3).append(f10).append(str36).append(abs).append(s46);
                                    n29 = f9;
                                    append28.append(f9).append(s49).append(n28).append(s45);
                                    s59 = str3;
                                    n30 = n28;
                                    s60 = s2;
                                    s61 = s46;
                                    s62 = str36;
                                    s63 = s49;
                                }
                                else {
                                    final float n31 = btm_x2;
                                    s58 = str37;
                                    if (s57.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        final float n32 = -1.0f;
                                        s59 = str3;
                                        n30 = n28;
                                        this.overlay.append(str40).append(n).append(str39).append(n30).append(str37).append(this.slideX(abs, n27, n31, fromW2, n32, 0.0f)).append(s55).append(f10).append(str36).append(abs).append(s46).append(f9).append(s49).append(n30).append(s45);
                                        s61 = s46;
                                        s63 = s49;
                                        s60 = s2;
                                        n29 = f9;
                                        s62 = str36;
                                    }
                                    else {
                                        s59 = str3;
                                        n30 = n28;
                                        if (s57.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                            final float n33 = 1.0f;
                                            s60 = s2;
                                            final StringBuilder append29 = this.overlay.append(str40).append(n).append(str39).append(n30).append(str37).append(this.slideX(abs, n27, n31, fromW2, n33, 0.0f)).append(s55).append(f10);
                                            s62 = str36;
                                            final StringBuilder append30 = append29.append(str36).append(abs);
                                            s61 = s46;
                                            final StringBuilder append31 = append30.append(s46);
                                            n29 = f9;
                                            final StringBuilder append32 = append31.append(f9);
                                            s63 = s49;
                                            final StringBuilder append33 = append32.append(s49).append(n30);
                                            s64 = s45;
                                            append33.append(s45);
                                            break Label_4460;
                                        }
                                        s61 = s46;
                                        s64 = s45;
                                        s60 = s2;
                                        n29 = f9;
                                        s63 = s49;
                                        s62 = str36;
                                        break Label_4460;
                                    }
                                }
                                s64 = s56;
                            }
                            n34 = 1;
                        }
                        else {
                            s60 = s2;
                            s59 = str3;
                            n29 = f9;
                            s62 = str36;
                            s58 = str37;
                            s63 = s49;
                            s61 = s46;
                            s64 = s45;
                            n30 = n;
                            n34 = 0;
                        }
                        str32 = s64;
                        str31 = s63;
                        i = n30;
                        f8 = abs;
                        str35 = str40;
                        str30 = s58;
                        s43 = s60;
                        n25 = n34;
                        str33 = s59;
                        abs2 = n29;
                        str29 = s61;
                        str34 = s62;
                        break Label_6001;
                    }
                    final String str41 = s47;
                    final String s65 = s10;
                    final String str42 = str6;
                    final String s66 = s2;
                    final String str43 = str3;
                    final String str44 = str7;
                    final String s67 = s52;
                    if (b) {
                        final float duration_out5 = entityBismilahTemplate.getTransition().getDuration_out();
                        final float abs5 = Math.abs(abs2 - duration_out5);
                        final String str45 = s48;
                        final float btm_x3 = entityBismilahTemplate.getBtm_x();
                        final String str46 = s67;
                        final float btm_y3 = entityBismilahTemplate.getBtm_y();
                        final float fromW3 = entityBismilahTemplate.getTransition().getFromW();
                        final String type_out3 = entityBismilahTemplate.getTransition().getType_out();
                        final String str47 = s65;
                        final int n35 = (int)(f9 - abs);
                        final float n36 = n35 - duration_out5;
                        final int n37 = n35;
                        final String mFadeFilter2 = this.mFadeFilter(n36, duration_out5, false);
                        final float f11 = f9;
                        final String generateVideoSegment6 = this.generateVideoSegment(entityBismilahTemplate, n, mFadeFilter2, n37, countDownLatch, semaphore);
                        if (generateVideoSegment6 != null) {
                            list.add(s66);
                            list.add(generateVideoSegment6);
                            final int n38 = n + 1;
                            final boolean equals = type_out3.equals(TransitionType.SLIDE_TO_RIGHT.getValue());
                            final String str48 = ")'";
                            int n39;
                            if (equals) {
                                this.overlay.append(s9).append(n38).append(str42).append(str8).append(abs).append(str44).append(str5).append(n38).append(s45);
                                this.overlay.append(str46).append(n).append(str47).append(n38).append(str45).append(this.slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, 1.0f)).append(str4).append(btm_y3).append(str41).append(abs).append(s46).append(f9).append(str48).append(str46).append(n38).append(s45);
                                abs2 = f9;
                                str32 = s45;
                                n39 = n38;
                                s43 = s66;
                                str31 = s49;
                                str29 = s46;
                                str30 = str45;
                                str33 = str43;
                                str34 = str41;
                                f8 = abs;
                                str35 = str46;
                            }
                            else {
                                final String str49 = str48;
                                s43 = s66;
                                str32 = s45;
                                if (type_out3.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                    this.overlay.append(s9).append(n38).append(str42).append(str8).append(abs).append(str44).append(str5).append(n38).append(s45);
                                    final float n40 = abs5;
                                    str35 = str46;
                                    final String slideX3 = this.slideX(n40, duration_out5, btm_x3, fromW3, 0.0f, -1.0f);
                                    final StringBuilder append34 = this.overlay.append(str46).append(n).append(str47).append(n38);
                                    str30 = str45;
                                    final StringBuilder append35 = append34.append(str45).append(slideX3).append(str4).append(btm_y3).append(str41);
                                    f8 = abs;
                                    final StringBuilder append36 = append35.append(abs).append(s46).append(f11).append(str49).append(str46).append(n38);
                                    str32 = s45;
                                    append36.append(s45);
                                    abs2 = f11;
                                    n39 = n38;
                                    str34 = str41;
                                    str33 = str43;
                                    str31 = s49;
                                    str29 = s46;
                                }
                                else {
                                    n39 = n38;
                                    f8 = abs;
                                    str35 = str46;
                                    str30 = str45;
                                    if (type_out3.equals(TransitionType.FADE_OUT.getValue())) {
                                        this.overlay.append(s9).append(n38).append(str42).append(str8).append(abs).append(str44).append(str5).append(n38).append(s45);
                                        final StringBuilder append37 = this.overlay.append(str46).append(n).append(str47).append(n38).append(str45).append(btm_x3);
                                        str33 = str43;
                                        final StringBuilder append38 = append37.append(str43).append(btm_y3);
                                        str34 = str41;
                                        final StringBuilder append39 = append38.append(str41).append(abs);
                                        str29 = s46;
                                        final StringBuilder append40 = append39.append(s46);
                                        abs2 = f9;
                                        final StringBuilder append41 = append40.append(f9);
                                        str31 = s49;
                                        append41.append(s49).append(n38).append(s45);
                                    }
                                    else {
                                        abs2 = f9;
                                        str29 = s46;
                                        str34 = str41;
                                        str33 = str43;
                                        str31 = s49;
                                    }
                                }
                            }
                            i = n39;
                            n25 = 1;
                            break Label_6001;
                        }
                        f8 = abs;
                        s43 = s66;
                        str32 = s45;
                        str35 = str46;
                        str34 = str41;
                        str30 = str45;
                        str33 = str43;
                        str31 = s49;
                        abs2 = f9;
                        str29 = s46;
                    }
                    else {
                        str29 = s46;
                        f8 = abs;
                        str35 = s67;
                        str32 = s45;
                        s43 = s66;
                        str34 = str41;
                        str33 = str3;
                        str31 = s49;
                        str30 = s48;
                    }
                }
                else {
                    str29 = s6;
                    str2 = str;
                    s43 = s2;
                    str31 = s3;
                    str34 = s5;
                    str33 = s;
                    final String s68 = s4;
                    str32 = s8;
                    f8 = abs;
                    str35 = s7;
                    str30 = s68;
                }
                i = n;
                n25 = 0;
            }
            if (n25 == 0) {
                list.add(s43);
                list.add(this.mTemplate.getFolder_template() + str2 + entityBismilahTemplate.getFile());
                final int n41 = i + 1;
                this.overlay.append(str35).append(i).append("][").append(n41).append(str30).append(entityBismilahTemplate.getBtm_x()).append(str33).append(entityBismilahTemplate.getBtm_y()).append(str34).append(f8).append(str29).append(Math.abs(abs2 - n2)).append(str31).append(n41).append(str32);
                this.renderManager.addTask("basmal prerender", 0);
                this.renderManager.nextTask();
                countDownLatch.countDown();
                i = n41;
            }
        }
        else {
            i = n;
        }
        return i;
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void clearFFmpeg() {
        for (final long longValue : this.id_ffmpeg) {
            try {
                FFmpegKit.cancel(longValue);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void completeProgress() {
        this.isDestroy = true;
        this.uiHandler.post((Runnable)new ProgressViewActivity$6(this));
    }
    
    private String concatVideoSegments(final List list) {
        try {
            try {
                try {
                    final StringBuilder sb = new StringBuilder();
                    final Template mTemplate = this.mTemplate;
                    try {
                        final StringBuilder append = sb.append(mTemplate.getFolder_template()).append("/file_list.txt");
                        try {
                            final File file = new File(append.toString());
                            final BufferedWriter bufferedWriter = new(java.io.BufferedWriter.class)();
                            try {
                                final FileWriter out = new FileWriter(file);
                                final BufferedWriter bufferedWriter2 = bufferedWriter;
                                try {
                                    new BufferedWriter(out);
                                    final Iterator iterator = list.iterator();
                                    try {
                                        while (true) {
                                            Label_0173: {
                                                if (!iterator.hasNext()) {
                                                    break Label_0173;
                                                }
                                                final Object next = iterator.next();
                                                try {
                                                    final String str = (String)next;
                                                    try {
                                                        try {
                                                            final StringBuilder append2 = new StringBuilder().append("file '").append(str).append("'\n");
                                                            try {
                                                                bufferedWriter.write(append2.toString());
                                                                continue;
                                                                bufferedWriter.close();
                                                                try {
                                                                    final StringBuilder sb2 = new StringBuilder();
                                                                    final Template mTemplate2 = this.mTemplate;
                                                                    try {
                                                                        final StringBuilder append3 = sb2.append(mTemplate2.getFolder_template()).append("/final_video.mp4");
                                                                        try {
                                                                            final String string = append3.toString();
                                                                            try {
                                                                                try {
                                                                                    final ArrayList list2 = new ArrayList();
                                                                                    list2.add("-y");
                                                                                    list2.add("-f");
                                                                                    list2.add("concat");
                                                                                    list2.add("-safe");
                                                                                    list2.add("0");
                                                                                    list2.add("-i");
                                                                                    list2.add(file.getAbsolutePath());
                                                                                    list2.add("-c");
                                                                                    list2.add("copy");
                                                                                    final ArrayList list3 = list2;
                                                                                    try {
                                                                                        list3.add(string);
                                                                                        final Object[] array = list2.toArray(new String[0]);
                                                                                        try {
                                                                                            final String[] array2 = (String[])array;
                                                                                            try {
                                                                                                FFmpegKit.executeWithArguments(array2);
                                                                                                return string;
                                                                                            }
                                                                                            catch (final Exception ex) {
                                                                                                ex.printStackTrace();
                                                                                                return null;
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
                                        }
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
    
    private File createTransparentBg(final int n, final int n2) {
        final File file = new File(this.getFilesDir(), "bg_tr_.png");
        if (file.exists()) {
            return file;
        }
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
                fileOutputStream.close();
            }
            finally {
                try {
                    fileOutputStream.close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
            return file;
        }
        catch (final Exception ex) {
            return file;
        }
    }
    
    private void deleteDirectoryManually(final File file) {
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    final File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        this.deleteDirectoryManually(file2);
                    }
                    else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }
    
    private void deleteFolderWithCommonsIO(final File file) {
        if (Build$VERSION.SDK_INT >= 26) {
            try {
                FileUtils.deleteDirectory(file);
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            this.deleteDirectoryManually(file);
        }
    }
    
    private String fadeFilter(final int n, final float f, float abs, final boolean b) {
        String s;
        if (b) {
            s = "in";
        }
        else {
            s = "out";
        }
        final StringBuilder append = new StringBuilder("[").append(n).append("]fade=t=").append(s).append(":st=").append(f).append(":d=");
        abs = Math.abs(abs - 0.05f);
        return append.append(abs).append(":alpha=1:color=white,fps=60,format=rgba[").append(s).append("_").append(n).append("];").toString();
    }
    
    private String fadeFilter(final String s, final float f, float abs, final boolean b) {
        String s2;
        if (b) {
            s2 = "in";
        }
        else {
            s2 = "out";
        }
        final StringBuilder append = new StringBuilder("[").append(s).append("]fade=t=").append(s2).append(":st=").append(f).append(":d=");
        abs = Math.abs(abs - 0.05f);
        return append.append(abs).append(":alpha=1:color=white,fps=60,format=rgba[").append(s2).append("_").append(s).append("];").toString();
    }
    
    private String fadeFilter(final String str, final int i, float abs, final float n, final boolean b) {
        String s;
        if (b) {
            s = "in";
        }
        else {
            s = "out";
        }
        final StringBuilder append = new StringBuilder().append(str).append("fade=t=").append(s).append(":st=").append(abs).append(":d=");
        abs = Math.abs(n - 0.05f);
        return append.append(abs).append(":alpha=1:color=white,fps=60,format=rgba[").append(s).append("_").append(i).append("];").toString();
    }
    
    private String fadeInOut(float abs, float f, float a) {
        final float n = fcmpg(abs, 0.0f);
        final float n2 = 0.01f;
        if (n <= 0) {
            abs = n2;
        }
        final float n3 = 0.05f;
        if (f - n3 <= 0.0f) {
            f = n2;
        }
        if (a - n3 <= 0.0f) {
            a = n2;
        }
        final StringBuilder sb = new StringBuilder("fade=t=in:st=0:d=");
        f = Math.abs(f);
        final StringBuilder append = sb.append(f);
        final String s = ":alpha=1:color=white,fps=";
        final StringBuilder append2 = append.append(s).append(this.mTemplate.getFps()).append(",format=rgba,fade=t=out:st=");
        abs = Math.abs(abs);
        final StringBuilder append3 = append2.append(abs).append(":d=");
        f = Math.abs(a);
        return append3.append(f).append(s).append(this.mTemplate.getFps()).append(",format=rgba").toString();
    }
    
    private String generateVideoSegment(final EntityBismilahTemplate entityBismilahTemplate, final int i, final String s, final int a, CountDownLatch countDownLatch, final Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", a);
        final String string = this.mTemplate.getFolder_template() + "/bismilah_" + i + ".mov";
        final ArrayList list = new ArrayList();
        list.add("-y");
        list.add("-loop");
        list.add("1");
        list.add("-i");
        list.add(this.mTemplate.getFolder_template() + "/" + entityBismilahTemplate.getFile());
        list.add("-vf");
        list.add(s);
        list.add("-t");
        list.add(String.valueOf(Math.max(a, 1)));
        list.add("-c:v");
        list.add("qtrle");
        list.add("-pix_fmt");
        list.add("argb");
        list.add("-preset");
        list.add("veryfast");
        list.add("-avoid_negative_ts");
        list.add("make_zero");
        list.add(string);
        try {
            semaphore.acquire();
            final String[] array = (String[])list.toArray(new String[0]);
            final ProgressViewActivity$$ExternalSyntheticLambda1 progressViewActivity$$ExternalSyntheticLambda1 = new ProgressViewActivity$$ExternalSyntheticLambda1(this, countDownLatch, semaphore);
            countDownLatch = (CountDownLatch)new ProgressViewActivity$$ExternalSyntheticLambda6(this);
            this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda1, (LogCallback)null, (StatisticsCallback)countDownLatch).getSessionId());
            return string;
        }
        catch (final Exception ex) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }
    
    private String generateVideoSegment(final EntityQuranTemplate entityQuranTemplate, final int i, final String s, final int a, CountDownLatch countDownLatch, final Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", a);
        final String string = this.mTemplate.getFolder_template() + "/ayah_" + i + ".mov";
        final ArrayList list = new ArrayList();
        list.add("-y");
        list.add("-loop");
        list.add("1");
        list.add("-i");
        list.add(this.mTemplate.getFolder_template() + "/" + entityQuranTemplate.getFile());
        list.add("-vf");
        list.add(s);
        list.add("-t");
        list.add(String.valueOf(Math.max(a, 1)));
        list.add("-c:v");
        list.add("qtrle");
        list.add("-pix_fmt");
        list.add("argb");
        list.add("-preset");
        list.add("veryfast");
        list.add("-avoid_negative_ts");
        list.add("make_zero");
        list.add(string);
        try {
            semaphore.acquire();
            final String[] array = (String[])list.toArray(new String[0]);
            final ProgressViewActivity$$ExternalSyntheticLambda2 progressViewActivity$$ExternalSyntheticLambda2 = new ProgressViewActivity$$ExternalSyntheticLambda2(this, countDownLatch, semaphore);
            countDownLatch = (CountDownLatch)new ProgressViewActivity$$ExternalSyntheticLambda6(this);
            this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda2, (LogCallback)null, (StatisticsCallback)countDownLatch).getSessionId());
            return string;
        }
        catch (final InterruptedException ex) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }
    
    private String generateVideoTimer(int max, CountDownLatch countDownLatch, final Semaphore semaphore) {
        final String string = this.mTemplate.getFolder_template() + "/timer.mov";
        max /= 1000;
        final int b = 1;
        max = Math.max(max, b);
        this.renderManager.addTask("timer prerender", max);
        final float posXRight = this.mTemplate.getmTimeModel().getPosXRight();
        final String color = this.mTemplate.getmTimeModel().getColor();
        final float size = this.mTemplate.getmTimeModel().getSize();
        final String string2 = this.getFilesDir().getAbsolutePath() + "/NotoNaskhArabic.ttf";
        final ArrayList list = new ArrayList();
        list.add("-y");
        list.add("-f");
        list.add("lavfi");
        list.add("-i");
        String str;
        if (ColorUtils.isColorDark(Color.parseColor(color))) {
            str = "black@0";
        }
        else {
            str = "white@0";
        }
        list.add("color=size=" + Math.round(this.mTemplate.getmTimeModel().getWidth_bitmap_progress() * 1.3f) + "x" + this.mTemplate.getmTimeModel().getHeight_bitmap_progress() + ":rate=10:duration=" + max + ":color=" + str + ",format=rgba");
        max += b;
        final StringBuilder append = new StringBuilder("drawtext=fontfile='").append(string2).append("':text='%{eif\\:trunc(t/60)\\:d\\:2}\\:%{eif\\:trunc(mod(t\\,60))\\:d\\:2}':x=0.0:y=0.0:fontsize=").append(size);
        final String s = ":fontcolor=";
        final String string3 = append.append(s).append(color).append(",drawtext=fontfile='").append(string2).append("':text='-%{eif\\:trunc((").append(max).append("-t)/60)\\:d\\:2}\\:%{eif\\:trunc(mod(").append(max).append("-t\\,60))\\:d\\:2}':x=").append(posXRight).append(":y=0.0:fontsize=").append(size).append(s).append(color).toString();
        list.add("-vf");
        list.add(string3);
        list.add("-c:v");
        list.add("qtrle");
        list.add("-pix_fmt");
        list.add("argb");
        list.add("-preset");
        list.add("veryfast");
        list.add("-avoid_negative_ts");
        list.add("make_zero");
        list.add(string);
        max = 0;
        try {
            semaphore.acquire();
            final String[] array = (String[])list.toArray(new String[0]);
            final ProgressViewActivity$$ExternalSyntheticLambda12 progressViewActivity$$ExternalSyntheticLambda12 = new ProgressViewActivity$$ExternalSyntheticLambda12(this, countDownLatch, semaphore);
            countDownLatch = (CountDownLatch)new ProgressViewActivity$$ExternalSyntheticLambda6(this);
            this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda12, (LogCallback)null, (StatisticsCallback)countDownLatch).getSessionId());
            return string;
        }
        catch (final InterruptedException ex) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }
    
    private String getBestH264Codec() {
        String s = null;
        final String s2 = "-hide_banner -encoders";
        try {
            final FFmpegSession execute = FFmpegKit.execute(s2);
            try {
                final ReturnCode returnCode = execute.getReturnCode();
                try {
                    if (!ReturnCode.isSuccess(returnCode)) {
                        return null;
                    }
                    final String output = execute.getOutput();
                    if (output == null) {
                        return null;
                    }
                    final String lowerCase = output.toLowerCase();
                    final boolean contains = lowerCase.contains(" h264_mediacodec ");
                    final boolean contains2 = lowerCase.contains(" libx264 ");
                    final String s3 = "h264_mediacodec";
                    if (!contains2 && contains) {
                        return s3;
                    }
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    final int n = 29;
                    final String s4 = "libx264";
                    if (sdk_INT <= n) {
                        if (contains2) {
                            s = s4;
                        }
                        else if (contains) {
                            s = s3;
                        }
                        return s;
                    }
                    if (sdk_INT == 30) {
                        if (contains2) {
                            s = s4;
                        }
                        else if (contains) {
                            s = s3;
                        }
                        return s;
                    }
                    if (contains) {
                        s = s3;
                    }
                    else if (contains2) {
                        s = s4;
                    }
                    return s;
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                    return null;
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    private String getBitrate(int max, int b, int n) {
        if (n > 30) {
            n = 1;
        }
        else {
            n = 0;
        }
        max = Math.max(max, b);
        b = 720;
        if (max <= b) {
            String s;
            if (n != 0) {
                s = "2000k";
            }
            else {
                s = "1500k";
            }
            return s;
        }
        b = 1280;
        if (max <= b) {
            String s2;
            if (n != 0) {
                s2 = "4000k";
            }
            else {
                s2 = "3000k";
            }
            return s2;
        }
        b = 1920;
        if (max <= b) {
            String s3;
            if (n != 0) {
                s3 = "6000k";
            }
            else {
                s3 = "4500k";
            }
            return s3;
        }
        return "8000k";
    }
    
    private File getOrCreateMask(final int i, final int j, int k) {
        final File file = new File(this.getFilesDir(), "mask_" + i + "x" + j + "_r" + k + ".png");
        if (file.exists()) {
            return file;
        }
        final Bitmap bitmap = Bitmap.createBitmap(i, j, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff$Mode.CLEAR);
        final Paint paint = new Paint(1);
        paint.setColor(-1);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)i, (float)j);
        final float n = (float)k;
        canvas.drawRoundRect(rectF, n, n, paint);
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                final Bitmap$CompressFormat png = Bitmap$CompressFormat.PNG;
                k = 100;
                bitmap.compress(png, k, (OutputStream)fileOutputStream);
                fileOutputStream.close();
            }
            finally {
                try {
                    fileOutputStream.close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
            return file;
        }
        catch (final Exception ex) {
            return file;
        }
    }
    
    private File getOrCreateMaskCircle(final int n, final int n2) {
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final Paint paint = new Paint(1);
        paint.setColor(-1);
        final float n3 = (float)Math.min(n, n2);
        final float n4 = 2.0f;
        canvas.drawCircle(n / n4, n2 / n4, n3 / n4, paint);
        final File file = new File(this.mTemplate.getFolder_template(), "circle_" + n + "x" + n2 + ".png");
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            return file;
        }
        catch (final Exception ex) {
            return file;
        }
    }
    
    private void insertToGallery(final Uri uri) {
        if (uri == null) {
            return;
        }
        final File file = new File(uri.getPath());
        if (file.exists()) {
            try {
                final FileMediaScanner fileMediaScanner = new FileMediaScanner((Context)this, file);
                final Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri);
                try {
                    this.sendBroadcast(intent);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
    }
    
    private String mFadeFilter(float abs, float abs2, final boolean b) {
        if (abs2 - 0.05f <= 0.0f) {
            abs2 = 0.01f;
        }
        String str;
        if (b) {
            str = "in";
        }
        else {
            str = "out";
        }
        final StringBuilder append = new StringBuilder("fade=t=").append(str).append(":st=");
        abs = Math.abs(abs);
        final StringBuilder append2 = append.append(abs).append(":d=");
        abs2 = Math.abs(abs2);
        return append2.append(abs2).append(":alpha=1:color=white,fps=60,format=rgba").toString();
    }
    
    private String mSlideX(final float f, final float f2, final float f3, final float f4, final float f5, float f6) {
        final String string = "clip((t-" + f + ")/" + f2 + ",0,1)";
        final String s = "(";
        final String string2 = s + string + "*" + string + "*(3-2*" + string + "))";
        final StringBuilder append = new StringBuilder(s).append(f5);
        final String s2 = "+(";
        final StringBuilder append2 = append.append(s2);
        f6 -= f5;
        final StringBuilder append3 = append2.append(f6);
        final String s3 = ")*";
        return f3 + s2 + append3.append(s3).append(string2).append(")").toString() + s3 + f4;
    }
    
    private void releaseWakeLock() {
        try {
            this.getWindow().clearFlags(128);
        }
        catch (final Exception ex) {}
    }
    
    private String runPreRender(String s, String str, final String s2, final int a, final String s3, final boolean b, final CountDownLatch countDownLatch, final Semaphore semaphore, final String s4) {
        final ArrayList list = new ArrayList();
        list.add("-hide_banner");
        list.add("-y");
        list.add("-stream_loop");
        list.add("-1");
        final String s5 = "-i";
        list.add(s5);
        list.add(s);
        if (str != null) {
            list.add(s5);
            list.add(str);
        }
        list.add("-filter_complex");
        list.add(s2);
        s = "-c:v";
        if (b) {
            list.add(s);
            list.add("qtrle");
            list.add("-pix_fmt");
            s = "rgba";
            list.add(s);
        }
        else if (s4 != null) {
            list.add("-threads");
            str = "0";
            list.add(str);
            list.add(s);
            list.add(s4);
            list.add("-preset");
            list.add("fast");
            list.add("-crf");
            s = "18";
            list.add(s);
        }
        else {
            list.add("-b:v");
            s = "4M";
            list.add(s);
        }
        list.add("-r");
        s = String.valueOf(this.mTemplate.getFps());
        list.add(s);
        list.add("-t");
        final StringBuilder append = new StringBuilder().append(Math.max(a, 500));
        str = "ms";
        s = append.append(str).toString();
        list.add(s);
        if (!b) {
            list.add("-movflags");
            s = "+faststart";
            list.add(s);
        }
        list.add(s3);
        try {
            semaphore.acquire();
            this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync((String[])list.toArray(new String[0]), (FFmpegSessionCompleteCallback)new ProgressViewActivity$$ExternalSyntheticLambda5(this, countDownLatch, semaphore), (LogCallback)null, (StatisticsCallback)new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId());
            return s3;
        }
        catch (final InterruptedException ex) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }
    
    private void showError(final FFmpegSession fFmpegSession) {
        try {
            final ProgressViewActivity$10 progressViewActivity$10 = new ProgressViewActivity$10(this, fFmpegSession);
            try {
                this.runOnUiThread((Runnable)progressViewActivity$10);
            }
            catch (final Exception ex) {
                this.toStudio();
            }
        }
        catch (final Exception ex2) {}
    }
    
    private String slideX(final float f, final float f2, final float f3, final float f4, final float f5, float f6) {
        final String string = "clip((t-" + f + ")/" + f2 + ",0,1)";
        final String s = "(";
        final String string2 = s + string + "*" + string + "*(3-2*" + string + "))";
        final StringBuilder append = new StringBuilder(s).append(f5);
        final String s2 = "+(";
        final StringBuilder append2 = append.append(s2);
        f6 -= f5;
        final StringBuilder append3 = append2.append(f6);
        final String s3 = ")*";
        final String string3 = append3.append(s3).append(string2).append(")").toString();
        final String s4 = "'";
        return s4 + f3 + s2 + string3 + s3 + f4 + s4;
    }
    
    private void startExport() {
        if (this.getIntent() != null) {
            final String stringExtra = this.getIntent().getStringExtra("template");
            if (stringExtra != null) {
                final Template mTemplate = (Template)LocalPersistence.readObjectFromFile((Context)this, stringExtra);
                if ((this.mTemplate = mTemplate) != null) {
                    this.mUri = mTemplate.getUri_video();
                }
                this.prepareAllMedia(this.mTemplate.getEntityMediaList(), new ProgressViewActivity$$ExternalSyntheticLambda0(this));
            }
        }
    }
    
    private void startSmoothAnimation() {
        this.isAnimating = true;
        this.uiHandler.post((Runnable)new ProgressViewActivity$7(this));
    }
    
    private void toShare() {
        final Intent intent = new Intent((Context)this, (Class)VideoViewActivity.class);
        final EntitySurahTemplate entitySurahTemplate = this.mTemplate.getEntitySurahTemplate();
        final String s = "reader";
        final String s2 = "surah";
        if (entitySurahTemplate != null) {
            intent.putExtra(s2, this.mTemplate.getEntitySurahTemplate().getName());
            intent.putExtra(s, this.mTemplate.getEntitySurahTemplate().getReader());
        }
        else {
            final String s3 = "";
            intent.putExtra(s2, s3);
            intent.putExtra(s, s3);
        }
        intent.putExtra("template", this.mTemplate.getIdTemplate());
        intent.setData(Uri.parse(this.mTemplate.getUri_video()));
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }
    
    private void toStudio() {
        final Intent intent = new Intent((Context)this, (Class)EngineActivity.class);
        final Template mTemplate = this.mTemplate;
        if (mTemplate != null) {
            intent.putExtra("template", mTemplate.getIdTemplate());
        }
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }
    
    private void updateNext(final CountDownLatch countDownLatch, final Semaphore semaphore) {
        final RenderManager renderManager = this.renderManager;
        if (renderManager != null) {
            renderManager.nextTask();
        }
        if (semaphore != null) {
            semaphore.release();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
    
    public void checkAacEncoder(final Context context) {
        final String str = "-y -f lavfi -i anullsrc=channel_layout=stereo:sample_rate=44100 -t 1 -c:a aac -b:a 64k ";
        final String prefix = "aac_test";
        final String suffix = ".m4a";
        try {
            final File tempFile = File.createTempFile(prefix, suffix, context.getCacheDir());
            try {
                tempFile.deleteOnExit();
                final StringBuilder append = new StringBuilder(str).append(tempFile.getAbsolutePath());
                try {
                    final String string = append.toString();
                    try {
                        try {
                            final ProgressViewActivity$$ExternalSyntheticLambda9 progressViewActivity$$ExternalSyntheticLambda9 = new ProgressViewActivity$$ExternalSyntheticLambda9();
                            final String s = string;
                            try {
                                FFmpegKit.executeAsync(s, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda9);
                            }
                            catch (final Exception ex) {
                                Log.e("AAC workd", "Error checking AAC: " + ex.getMessage());
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
    
    public void dialog() {
        final Dialog dialog = new Dialog((Context)this);
        this.dialog = dialog;
        final int cancelable = 1;
        dialog.setCancelable((boolean)(cancelable != 0));
        this.dialog.requestWindowFeature(cancelable);
        this.dialog.getWindow().setLayout(-1, -2);
        this.dialog.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        final View inflate = LayoutInflater.from((Context)this).inflate(R$layout.layout_dialog, (ViewGroup)null);
        this.dialog.setContentView(inflate);
        final TextCustumFont textCustumFont = (TextCustumFont)inflate.findViewById(R$id.dialog_title);
        final TextCustumFont textCustumFont2 = (TextCustumFont)inflate.findViewById(R$id.dialog_message);
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)inflate.findViewById(R$id.dialog_no);
        buttonCustumFont.setOnClickListener((View$OnClickListener)new ProgressViewActivity$3(this));
        final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)inflate.findViewById(R$id.dialog_yes);
        buttonCustumFont2.setOnClickListener((View$OnClickListener)new ProgressViewActivity$4(this));
        if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
            textCustumFont2.setText((CharSequence)"\u0647\u0644 \u0623\u0646\u062a \u0645\u062a\u0623\u0643\u062f \u0645\u0646 \u0645\u063a\u0627\u062f\u0631\u0629 \u0647\u0630\u0627 \u0627\u0644\u0639\u0645\u0644\u061f");
            textCustumFont.setText((CharSequence)"\u062e\u0631\u0648\u062c...");
            buttonCustumFont.setText((CharSequence)"\u0645\u063a\u0627\u062f\u0631\u0629");
            buttonCustumFont2.setText((CharSequence)"\u0645\u062a\u0627\u0628\u0639\u0629");
        }
        else {
            textCustumFont2.setText((CharSequence)"Are you sure want to leave this work ?");
            textCustumFont.setText((CharSequence)"Exit...");
            buttonCustumFont.setText((CharSequence)"Leave");
            buttonCustumFont2.setText((CharSequence)"Continue");
        }
        this.dialog.show();
    }
    
    public void export(final String[] array) {
        this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)new ProgressViewActivity$8(this), (LogCallback)null, (StatisticsCallback)new ProgressViewActivity$9(this)).getSessionId());
    }
    
    protected void onCreate(final Bundle bundle) {
        final Window window = this.getWindow();
        final int n = 1536;
        window.setFlags(n, n);
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_progress_view);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n2 = -16777216;
        this.setStatusBarColor(n2);
        this.setNavigationBarColor(n2);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new ProgressViewActivity$$ExternalSyntheticLambda4());
        this.wakeLockAquire();
        this.progressIndicator = (SquareOutlineProgressBar)this.findViewById(R$id.progress_horizontal);
        this.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new ProgressViewActivity$2(this));
        try {
            this.startExport();
        }
        catch (final Exception ex) {
            this.toStudio();
        }
    }
    
    protected void onDestroy() {
        this.clearFFmpeg();
        super.onDestroy();
        final boolean isDestroy = true;
        try {
            this.isDestroy = isDestroy;
            this.releaseWakeLock();
            final Thread thread = new(java.lang.Thread.class)();
            try {
                final ProgressViewActivity$5 task = new ProgressViewActivity$5(this);
                final Thread thread2 = thread;
                try {
                    new Thread(task);
                    thread.start();
                    final Thread workerThread = this.workerThread;
                    if (workerThread != null) {
                        workerThread.interrupt();
                    }
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }
    
    public String preRenderMask_Circle(final SquareBitmapModel squareBitmapModel, final int n, final CountDownLatch countDownLatch, final Semaphore semaphore) {
        final String uri_media_video = this.mTemplate.getUri_media_video();
        final String string = this.mTemplate.getFolder_template() + "/circle_" + System.currentTimeMillis() + ".mov";
        final int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        final int round = Math.round(squareBitmapModel.getRight());
        final int round2 = Math.round(squareBitmapModel.getBottom());
        final int round3 = Math.round(squareBitmapModel.getLef_square());
        final int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        final int n2 = round5 & 0x1;
        final int n3 = 1;
        if (n2 == n3) {
            ++round5;
        }
        if ((round6 & 0x1) == n3) {
            ++round6;
        }
        final File orCreateMaskCircle = this.getOrCreateMaskCircle(round5, round6);
        final StringBuilder append = new StringBuilder("[0:v]scale=").append(max);
        final String str = ":";
        return this.runPreRender(uri_media_video, orCreateMaskCircle.getAbsolutePath(), append.append(str).append(max).append(":force_original_aspect_ratio=increase,crop=").append(round).append(str).append(round2).append(str).append(round3).append(str).append(round4).append(",scale=").append(round5).append(str).append(round6).append(":flags=lanczos[v];[v][1:v]alphamerge,format=rgba").toString(), n, string, true, countDownLatch, semaphore, null);
    }
    
    public String preRenderMask_Rounded(final SquareBitmapModel squareBitmapModel, final int n, final CountDownLatch countDownLatch, final Semaphore semaphore) {
        final String uri_media_video = this.mTemplate.getUri_media_video();
        final String string = this.mTemplate.getFolder_template() + "/rounded_" + System.currentTimeMillis() + ".mov";
        final int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        final int round = Math.round(squareBitmapModel.getRight());
        final int round2 = Math.round(squareBitmapModel.getBottom());
        final int round3 = Math.round(squareBitmapModel.getLef_square());
        final int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        final int n2 = round5 & 0x1;
        final int n3 = 1;
        if (n2 == n3) {
            ++round5;
        }
        if ((round6 & 0x1) == n3) {
            ++round6;
        }
        final File orCreateMask = this.getOrCreateMask(round5, round6, (int)squareBitmapModel.getRaduis());
        final StringBuilder append = new StringBuilder("[0:v]scale=").append(max);
        final String str = ":";
        return this.runPreRender(uri_media_video, orCreateMask.getAbsolutePath(), append.append(str).append(max).append(":force_original_aspect_ratio=increase,crop=").append(round).append(str).append(round2).append(str).append(round3).append(str).append(round4).append(",scale=").append(round5).append(str).append(round6).append(":flags=lanczos[v];[v][1:v]alphamerge,format=rgba").toString(), n, string, true, countDownLatch, semaphore, null);
    }
    
    public String preRenderVideo(int max, CountDownLatch countDownLatch, final Semaphore semaphore, String value) {
        final String uri_media_video = this.mTemplate.getUri_media_video();
        final String string = this.mTemplate.getFolder_template() + "/layer_video_" + System.currentTimeMillis() + ".mp4";
        final int max2 = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        final StringBuilder append = new StringBuilder("(iw-").append(this.mTemplate.getWidth());
        final String s = ")/2";
        final String string2 = append.append(s).toString();
        final String string3 = "(ih-" + this.mTemplate.getHeight() + s;
        final StringBuilder append2 = new StringBuilder("[0:v]scale=").append(max2);
        final String s2 = ":";
        final String string4 = append2.append(s2).append(max2).append(":force_original_aspect_ratio=increase:flags=lanczos,crop=").append(this.mTemplate.getWidth()).append(s2).append(this.mTemplate.getHeight()).append(s2).append(string2).append(s2).append(string3).append("[v];[v][1:v]overlay,format=rgba").toString();
        final ArrayList list = new ArrayList();
        list.add("-hide_banner");
        list.add("-y");
        list.add("-stream_loop");
        list.add("-1");
        final String s3 = "-i";
        list.add(s3);
        list.add(uri_media_video);
        final File file = new File(this.mTemplate.getUri_bg_ffmpeg());
        if (file.exists() && file.isFile()) {
            list.add(s3);
            list.add(this.mTemplate.getUri_bg_ffmpeg());
            list.add("-filter_complex");
            list.add(string4);
            if (value != null) {
                list.add("-threads");
                list.add("0");
                list.add("-c:v");
                list.add(value);
                list.add("-preset");
                list.add("fast");
                list.add("-crf");
                value = "18";
                list.add(value);
            }
            else {
                list.add("-b:v");
                value = "4M";
                list.add(value);
            }
            list.add("-r");
            value = String.valueOf(this.mTemplate.getFps());
            list.add(value);
            list.add("-t");
            final StringBuilder sb = new StringBuilder();
            max = Math.max(max, 500);
            final StringBuilder append3 = sb.append(max);
            value = "ms";
            list.add(append3.append(value).toString());
            list.add("-movflags");
            list.add("+faststart");
            list.add("-an");
            list.add(string);
            try {
                semaphore.acquire();
                final String[] array = (String[])list.toArray(new String[0]);
                final ProgressViewActivity$$ExternalSyntheticLambda7 progressViewActivity$$ExternalSyntheticLambda7 = new ProgressViewActivity$$ExternalSyntheticLambda7(this, countDownLatch, semaphore);
                countDownLatch = (CountDownLatch)new ProgressViewActivity$$ExternalSyntheticLambda6(this);
                this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync(array, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda7, (LogCallback)null, (StatisticsCallback)countDownLatch).getSessionId());
                return string;
            }
            catch (final InterruptedException ex) {
                this.renderManager.nextTask();
                countDownLatch.countDown();
                return null;
            }
        }
        this.updateNext(countDownLatch, semaphore);
        return null;
    }
    
    public String preRenderVideoHue(final int a, final CountDownLatch countDownLatch, final Semaphore semaphore, final String s) {
        final String uri_media_video = this.mTemplate.getUri_media_video();
        final String string = this.mTemplate.getFolder_template() + "/layer_video_" + System.currentTimeMillis() + ".mp4";
        final int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        final int width = this.mTemplate.getWidth();
        final int height = this.mTemplate.getHeight();
        final StringBuilder append = new StringBuilder("(iw-").append(width);
        final String s2 = ")/2";
        final String string2 = append.append(s2).toString();
        final String string3 = "(ih-" + height + s2;
        final String string4 = (double)(-this.mTemplate.getmTimeModel().getWidth_bitmap_progress()) + " + ((cos((t / (" + a / 1000.0 + ") + 1) * PI) / 2 + 0.5) * " + (this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset()) + ")";
        final StringBuilder append2 = new StringBuilder("[0:v]scale=").append(max);
        final String str = ":";
        final String string5 = append2.append(str).append(max).append(":force_original_aspect_ratio=increase:flags=lanczos,hue=s=0,crop=").append(width).append(str).append(height).append(str).append(string2).append(str).append(string3).append("[main];[main][1]overlay[fm];[2:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineProg];[3:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineBg];[lineProg][lineBg]overlay=x=").append(string4).append(":y=0[bgApplied];[fm][bgApplied]overlay=").append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(str).append(this.mTemplate.getEntityProgressTemplate().getTop()).toString();
        final ArrayList list = new ArrayList();
        list.add("-hide_banner");
        list.add("-y");
        final String s3 = "-i";
        list.add(s3);
        list.add(uri_media_video);
        final File file = new File(this.mTemplate.getUri_bg_ffmpeg());
        if (file.exists() && file.isFile()) {
            list.add(s3);
            list.add(this.mTemplate.getUri_bg_ffmpeg());
            list.add(s3);
            list.add(this.mTemplate.getFolder_template() + "/line_progress.png");
            list.add(s3);
            list.add(this.mTemplate.getFolder_template() + "/line_bg.png");
            list.add("-filter_complex");
            list.add(string5);
            final String s4 = "18";
            final String s5 = "-crf";
            final String s6 = "-preset";
            final String s7 = "-c:v";
            if (s != null) {
                list.add(s7);
                list.add(s);
                list.add(s6);
                list.add("fast");
                list.add(s5);
                list.add(s4);
            }
            else {
                list.add(s7);
                list.add("libx264");
                list.add(s6);
                list.add("veryfast");
                list.add(s5);
                list.add(s4);
            }
            list.add("-r");
            list.add(String.valueOf(this.mTemplate.getFps()));
            list.add("-t");
            list.add(Math.max(a, 500) + "ms");
            list.add("-movflags");
            list.add("+faststart");
            list.add("-an");
            list.add(string);
            try {
                semaphore.acquire();
                this.id_ffmpeg.add(FFmpegKit.executeWithArgumentsAsync((String[])list.toArray(new String[0]), (FFmpegSessionCompleteCallback)new ProgressViewActivity$$ExternalSyntheticLambda8(this, countDownLatch, semaphore), (LogCallback)null, (StatisticsCallback)new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId());
                return string;
            }
            catch (final InterruptedException ex) {
                this.renderManager.nextTask();
                countDownLatch.countDown();
                return null;
            }
        }
        this.updateNext(countDownLatch, semaphore);
        return null;
    }
    
    public String preRender_NoMask(final SquareBitmapModel squareBitmapModel, final int n, final CountDownLatch countDownLatch, final Semaphore semaphore, final String s) {
        final String uri_media_video = this.mTemplate.getUri_media_video();
        final String string = this.mTemplate.getFolder_template() + "/nomask_" + System.currentTimeMillis() + ".mp4";
        final int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        final int round = Math.round(squareBitmapModel.getRight());
        final int round2 = Math.round(squareBitmapModel.getBottom());
        final int round3 = Math.round(squareBitmapModel.getLef_square());
        final int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        final int n2 = round5 & 0x1;
        final int n3 = 1;
        if (n2 == n3) {
            ++round5;
        }
        if ((round6 & 0x1) == n3) {
            ++round6;
        }
        final StringBuilder append = new StringBuilder("scale=").append(max);
        final String str = ":";
        return this.runPreRender(uri_media_video, null, append.append(str).append(max).append(":force_original_aspect_ratio=increase,crop=").append(round).append(str).append(round2).append(str).append(round3).append(str).append(round4).append(",scale=").append(round5).append(str).append(round6).append(":flags=lanczos,format=yuv420p").toString(), n, string, false, countDownLatch, semaphore, s);
    }
    
    public void prepareAllMedia(final List list, final Runnable runnable) {
        Executors.newSingleThreadExecutor().execute(new ProgressViewActivity$$ExternalSyntheticLambda11(this, list, runnable));
    }
    
    public void setupCommand(final FfmpegCodecChecker$CodecInfo ffmpegCodecChecker$CodecInfo) {
        final int max = Math.max(this.mTemplate.getDuration(), 1000);
        List<String> list = new ArrayList<String>();
        list.add("-hide_banner");
        final int n = max / 1000;
        this.renderManager.addTask("Vido prerender", n);
        final String videoCodec = ffmpegCodecChecker$CodecInfo.videoCodec;
        final Semaphore semaphore = new Semaphore(4);
        final int ipad_type = this.mTemplate.getIpad_type();
        final int ordinal = IpadType.IPAD.ordinal();
        String s = "][";
        final String s2 = "/line_bg.png";
        final String s3 = "overlay=";
        final String s4 = ":y=";
        String str = "]overlay=";
        final String s5 = ":";
        final String str2 = "[";
        String str3 = "]";
        final String s6 = videoCodec;
        String s7 = "-i";
        final Semaphore semaphore2 = semaphore;
        String s8 = "[ov";
        int n2 = n;
        final String s9 = "];";
        final String s10 = s3;
        String s11 = null;
        int n10 = 0;
        String s12 = null;
        CountDownLatch countDownLatch3 = null;
        Semaphore semaphore3 = null;
        Label_5668: {
            if (ipad_type != ordinal && this.mTemplate.getIpad_type() != IpadType.IPAD_UNBLUR.ordinal() && this.mTemplate.getIpad_type() != IpadType.IPAD_CLASSIC.ordinal() && this.mTemplate.getIpad_type() != IpadType.IPAD_NEOMORPHIC.ordinal() && this.mTemplate.getIpad_type() != IpadType.ROUND_RECT.ordinal() && this.mTemplate.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.mTemplate.getIpad_type() != IpadType.RECT.ordinal()) {
                final int n3 = this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0);
                int n4;
                if (this.mTemplate.getEntityBismilahTemplate() != null) {
                    n4 = 1;
                }
                else {
                    n4 = 0;
                }
                final int n5 = n3 + n4;
                int n6;
                if (this.mTemplate.getEntityIsti3adaTemplate() != null) {
                    n6 = 1;
                }
                else {
                    n6 = 0;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(n5 + n6);
                if (this.mTemplate.getIpad_type() == IpadType.HEART.ordinal()) {
                    final File file = new File(this.mTemplate.getUri_bg_ffmpeg());
                    if (file.exists() && file.isFile()) {
                        list.add(s7);
                        list.add(this.mTemplate.getUri_bg_ffmpeg());
                    }
                    list.add(s7);
                    list.add(this.mTemplate.getFolder_template() + s2);
                    list.add("-f");
                    list.add("lavfi");
                    list.add(s7);
                    list.add("color=size=" + this.mTemplate.getWidth() + "x" + this.mTemplate.getmTimeModel().getHeightShape() + ":color=#00000000");
                    final String value = String.valueOf(max / 1000.0);
                    final float n7 = (float)this.mTemplate.getmTimeModel().getHeightShape();
                    final StringBuilder append = this.overlay.append(str2);
                    final CountDownLatch countDownLatch2 = countDownLatch;
                    append.append(2).append(s).append(1).append("]overlay=x=0:y='").append(n7).append("*(1-clip(t/").append(value).append(",0,1))*0.8 + ").append(n7).append("*(1-(0.5-0.5*cos(PI*clip(t/").append(value).append(",0,1))))*0.2'").append(s8).append(1).append(s9);
                    final double n8 = this.mTemplate.getmTimeModel().getStartShape();
                    final StringBuilder append2 = this.overlay.append("[0]").append(s8).append(1).append(str).append(0).append(s5);
                    final float top = this.mTemplate.getEntityProgressTemplate().getTop();
                    s11 = s4;
                    append2.append(top + n8).append(s8).append(2).append(s9);
                    list.add(s7);
                    list.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                    final StringBuilder append3 = this.overlay.append(s8).append(2).append(str3).append(str2);
                    final int n9 = 3;
                    append3.append(n9).append(str).append(0).append(s5).append(this.mTemplate.getEntityProgressTemplate().getTop()).append(s8).append(n9).append(s9);
                    n10 = n9;
                    s12 = s10;
                    countDownLatch3 = countDownLatch2;
                }
                else {
                    final CountDownLatch countDownLatch4 = countDownLatch;
                    final String str4 = s;
                    s11 = s4;
                    if (this.mTemplate.getIpad_type() == IpadType.BATTERY.ordinal()) {
                        final File file2 = new File(this.mTemplate.getUri_bg_ffmpeg());
                        if (file2.exists() && file2.isFile()) {
                            list.add(s7);
                            list.add(this.mTemplate.getUri_bg_ffmpeg());
                        }
                        list.add("-loop");
                        list.add("1");
                        list.add(s7);
                        list.add(this.mTemplate.getFolder_template() + s2);
                        final double d = -this.mTemplate.getmTimeModel().getWidthShape() + this.mTemplate.getmTimeModel().getStartShape();
                        final String value2 = String.valueOf(max / 1000.0);
                        final float n11 = (float)this.mTemplate.getmTimeModel().getWidthShape();
                        this.overlay.append("[0]").append(str2).append(1).append(str3).append("overlay=x='").append(d).append("+(").append(n11).append("*(clip(t/").append(value2).append(",0,1))*0.8").append("+").append(n11).append("*(0.5-0.5*cos(PI*clip(t/").append(value2).append(",0,1)))*0.2").append(")'").append(s11).append(this.mTemplate.getEntityProgressTemplate().getTop()).append(s8).append(1).append(s9);
                        list.add(s7);
                        list.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                        final StringBuilder append4 = this.overlay.append(s8).append(1).append(str3).append(str2);
                        final int n12 = 2;
                        append4.append(n12).append("]overlay=0:").append(this.mTemplate.getEntityProgressTemplate().getTop()).append(s8).append(n12).append(s9);
                        s12 = s10;
                        countDownLatch3 = countDownLatch4;
                        s = str4;
                        n10 = 2;
                    }
                    else {
                        final String s13 = s4;
                        final int ipad_type2 = this.mTemplate.getIpad_type();
                        final int ordinal2 = IpadType.CASSET.ordinal();
                        final String s14 = "[rot";
                        if (ipad_type2 == ordinal2 || this.mTemplate.getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                            s11 = s13;
                            s12 = s10;
                            s = str4;
                            final File file3 = new File(this.mTemplate.getUri_bg_ffmpeg());
                            if (file3.exists() && file3.isFile()) {
                                list.add(s7);
                                list.add(this.mTemplate.getUri_bg_ffmpeg());
                            }
                            list.add("-loop");
                            list.add("1");
                            list.add(s7);
                            list.add(this.mTemplate.getFolder_template() + s2);
                            final StringBuilder append5 = this.overlay.append(str2);
                            final int i = 1;
                            append5.append(i).append(str3).append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append(s14).append(i).append(s9);
                            final StringBuilder append6 = this.overlay.append("[0]").append(s14).append(i).append(str3).append(s12).append(this.mTemplate.getmTimeModel().getStartShape()).append(s5).append(this.mTemplate.getmTimeModel().getHeightShape()).append(s8);
                            final int j = 1;
                            append6.append(j).append(s9);
                            this.overlay.append(str2).append(j).append(str3).append("rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append(s14).append(j).append(s9);
                            this.overlay.append(s8).append(j).append(str3).append(s14).append(j).append(str3).append(s12).append(this.mTemplate.getmTimeModel().getWidthShape()).append(s5).append(this.mTemplate.getmTimeModel().getHeightShape()).append(s8).append(1).append(s9);
                            semaphore3 = semaphore2;
                            countDownLatch3 = countDownLatch4;
                            n10 = 1;
                            break Label_5668;
                        }
                        if (this.mTemplate.getIpad_type() == IpadType.CASSET_IMG.ordinal()) {
                            String s15;
                            int k;
                            String string3;
                            if (this.mTemplate.isVideoSquare()) {
                                list.add("-stream_loop");
                                list.add("-1");
                                list.add(s7);
                                list.add(this.mTemplate.getUri_media_video());
                                final String string = "(iw-" + this.mTemplate.getWidth() + ")/2";
                                final String string2 = "(ih-" + this.mTemplate.getHeight() + ")/2";
                                final int max2 = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
                                final StringBuilder append7 = this.overlay.append(str2);
                                s15 = str;
                                append7.append(0).append(":v]scale=").append(max2).append(s5).append(max2).append(":force_original_aspect_ratio=increase[sc];[sc]crop=").append(this.mTemplate.getWidth()).append(s5).append(this.mTemplate.getHeight()).append(s5).append(string).append(s5).append(string2).append(",format=yuva420p").append(s8).append(0).append(s9);
                                final File file4 = new File(this.mTemplate.getUri_bg_ffmpeg());
                                if (file4.exists() && file4.isFile()) {
                                    list.add(s7);
                                    list.add(this.mTemplate.getUri_bg_ffmpeg());
                                    final StringBuilder append8 = this.overlay.append(s8).append(0);
                                    s = str4;
                                    final StringBuilder append9 = append8.append(str4);
                                    final int n13 = 1;
                                    append9.append(n13).append("]overlay[ov").append(n13).append(s9);
                                    k = 1;
                                }
                                else {
                                    s = str4;
                                    k = 0;
                                }
                                string3 = s8 + k + str3;
                            }
                            else {
                                s15 = str;
                                s = str4;
                                final File file5 = new File(this.mTemplate.getUri_bg_ffmpeg());
                                if (file5.exists() && file5.isFile()) {
                                    list.add(s7);
                                    list.add(this.mTemplate.getUri_bg_ffmpeg());
                                }
                                string3 = "[0]";
                                k = 0;
                            }
                            list.add("-loop");
                            list.add("1");
                            list.add(s7);
                            list.add(this.mTemplate.getFolder_template() + s2);
                            final int l = k + 1;
                            this.overlay.append(str2).append(l).append(str3).append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append(s14).append(l).append(s9);
                            final StringBuilder append10 = this.overlay.append(string3).append(s14).append(l).append(str3);
                            s12 = s10;
                            append10.append(s10).append(this.mTemplate.getmTimeModel().getStartShape()).append(s5).append(this.mTemplate.getmTimeModel().getHeightShape()).append(s8).append(l).append(s9);
                            this.overlay.append(str2).append(l).append(str3).append("rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append(s14).append(l).append(s9);
                            this.overlay.append(s8).append(l).append(str3).append(s14).append(l).append(str3).append(s10).append(this.mTemplate.getmTimeModel().getWidthShape()).append(s5).append(this.mTemplate.getmTimeModel().getHeightShape()).append(s8).append(l).append(s9);
                            n10 = l;
                            semaphore3 = semaphore2;
                            countDownLatch3 = countDownLatch4;
                            str = s15;
                            break Label_5668;
                        }
                        final String str5 = str;
                        s12 = s10;
                        s = str4;
                        final File file6 = new File(this.mTemplate.getUri_bg_ffmpeg());
                        if (!this.mTemplate.isVideoSquare() && file6.exists() && file6.isFile()) {
                            if (this.mTemplate.getIpad_type() == IpadType.BLUE_TYPE.ordinal()) {
                                list.add(s7);
                                list.add(this.mTemplate.getUri_bg_ffmpeg());
                                list.add(s7);
                                list.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                                this.overlay.append(str2).append(1).append(str3).append("loop=loop=-1:size=1:start=0").append("[lp];");
                                list.add(s7);
                                list.add(this.mTemplate.getFolder_template() + s2);
                                final StringBuilder append11 = this.overlay.append("[lp]").append(str2).append(2).append("]overlay=x=").append((double)(-this.mTemplate.getmTimeModel().getWidth_bitmap_progress())).append(" + ( ((cos((t / (").append(max).append("/1000.0) + 1) * PI) / 2) + 0.5) * ").append(this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset()).append(" )").append(":y=0").append(s8);
                                final int n14 = 1;
                                append11.append(n14).append(s9);
                                final StringBuilder append12 = this.overlay.append("[0]").append(s8).append(n14);
                                str = str5;
                                append12.append(str5).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(s5).append(this.mTemplate.getEntityProgressTemplate().getTop()).append(s8).append(2).append(s9);
                                semaphore3 = semaphore2;
                                countDownLatch3 = countDownLatch4;
                                n10 = 2;
                                break Label_5668;
                            }
                            list.add("-loop");
                            list.add("1");
                            list.add(s7);
                            list.add(this.mTemplate.getUri_bg_ffmpeg());
                            this.overlay.append("[0]format=yuv420p[ov").append(0).append(s9);
                        }
                        else {
                            str = str5;
                        }
                        semaphore3 = semaphore2;
                        countDownLatch3 = countDownLatch4;
                        n10 = 0;
                        break Label_5668;
                    }
                }
                semaphore3 = semaphore2;
            }
            else {
                s11 = s4;
                s12 = s10;
                final File file7 = new File(this.mTemplate.getUri_bg_ffmpeg());
                int n19;
                CountDownLatch countDownLatch7;
                if (file7.exists() && file7.isFile()) {
                    final int n15 = this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0) + 1;
                    int n16;
                    if (this.mTemplate.getEntityBismilahTemplate() != null) {
                        n16 = 1;
                    }
                    else {
                        n16 = 0;
                    }
                    final int n17 = n15 + n16;
                    int n18;
                    if (this.mTemplate.getEntityIsti3adaTemplate() != null) {
                        n18 = 1;
                    }
                    else {
                        n18 = 0;
                    }
                    final CountDownLatch countDownLatch5 = new CountDownLatch(n17 + n18);
                    list.add(s7);
                    list.add(this.mTemplate.getUri_bg_ffmpeg());
                    list.add(s7);
                    final Semaphore semaphore4 = semaphore2;
                    list.add(this.generateVideoTimer(max, countDownLatch5, semaphore2));
                    final float left = this.mTemplate.getEntityProgressTemplate().getLeft();
                    final CountDownLatch countDownLatch6 = countDownLatch5;
                    final float posY = this.mTemplate.getmTimeModel().getPosY();
                    semaphore3 = semaphore4;
                    final float f = posY + this.mTemplate.getEntityProgressTemplate().getTop();
                    final StringBuilder append13 = this.overlay.append(str2);
                    final String str6 = s8;
                    append13.append(0).append(s).append(1).append(str).append(left).append(s5).append(f).append("[bg];");
                    list.add(s7);
                    list.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                    this.overlay.append(str2).append(2).append(":v]").append("loop=loop=-1:size=1:start=0").append(",format=rgba").append("[lp];");
                    list.add(s7);
                    list.add(this.mTemplate.getFolder_template() + s2);
                    final int ipad_type3 = this.mTemplate.getIpad_type();
                    final int ordinal3 = IpadType.IPAD_NEOMORPHIC.ordinal();
                    final String s16 = "[bg]";
                    if (ipad_type3 == ordinal3) {
                        final int width_bitmap_progress = this.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                        final String string4 = "[tmp" + 2 + str3;
                        final StringBuilder sb = new StringBuilder("(");
                        final String s17 = str;
                        this.overlay.append("[lp][").append(3).append("]overlay=x='").append("(-" + width_bitmap_progress + "*(1-" + ("clip(t/" + sb.append(max / 1000.0).append(")").toString() + ",0,1)") + "))").append("':y=0:shortest=0").append(string4).append(";");
                        list.add(s7);
                        list.add(this.mTemplate.getFolder_template() + "/line_bg_tmp.png");
                        this.overlay.append(s16).append(string4).append(s12).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(s5).append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ps];");
                        final StringBuilder append14 = this.overlay.append("[ps][");
                        n19 = 4;
                        final StringBuilder append15 = append14.append(n19).append("]overlay='if(lte(t,0),-100,").append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(")':").append(this.mTemplate.getEntityProgressTemplate().getTop());
                        s8 = str6;
                        append15.append(str6).append(n19).append(s9);
                        str = s17;
                    }
                    else {
                        final String str7 = str;
                        s8 = str6;
                        final int n20 = this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset();
                        final StringBuilder append16 = this.overlay.append(str2).append(3).append(str3).append("[lp]overlay='if(lte(t,0),-").append(this.mTemplate.getmTimeModel().getWidth_bitmap_progress()).append(",min(").append(n20).append(",(").append(n20).append(" * ((cos((t / (").append(max).append("/1000.0) + 1) * PI) / 2) + 0.5))))':0[ov");
                        final int n21 = 2;
                        append16.append(n21).append(s9);
                        final StringBuilder append17 = this.overlay.append(s16).append(str6).append(n21);
                        str = str7;
                        final StringBuilder append18 = append17.append(str7).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(s5).append(this.mTemplate.getEntityProgressTemplate().getTop()).append(str6);
                        final int m = 3;
                        append18.append(m).append(s9);
                        n19 = m;
                    }
                    countDownLatch7 = countDownLatch6;
                }
                else {
                    semaphore3 = semaphore2;
                    countDownLatch7 = new(java.util.concurrent.CountDownLatch.class)();
                    final int n22 = this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0);
                    int n23;
                    if (this.mTemplate.getEntityBismilahTemplate() != null) {
                        n23 = 1;
                    }
                    else {
                        n23 = 0;
                    }
                    final int n24 = n22 + n23;
                    int n25;
                    if (this.mTemplate.getEntityIsti3adaTemplate() != null) {
                        n25 = 1;
                    }
                    else {
                        n25 = 0;
                    }
                    new CountDownLatch(n24 + n25);
                    n19 = 0;
                }
                n10 = n19;
                countDownLatch3 = countDownLatch7;
            }
        }
        String str8 = null;
        String str9 = null;
        CountDownLatch countDownLatch8 = null;
        String s19 = null;
        int n28 = 0;
        String str10 = null;
        String str11 = null;
        int n29 = 0;
        String str12 = null;
        Semaphore semaphore6 = null;
        Label_7021: {
            Label_7017: {
                int n30 = 0;
                Label_7013: {
                    if (this.mTemplate.isVideoSquare()) {
                        final File file8 = new File(this.mTemplate.getUri_media_video());
                        if (file8.isFile() && file8.exists()) {
                            final RenderManager renderManager = this.renderManager;
                            str8 = s;
                            final int n26 = n2;
                            renderManager.addTask("Video prerender", n2);
                            if (this.mTemplate.getIpad_type() != IpadType.IPAD.ordinal() && this.mTemplate.getIpad_type() != IpadType.IPAD_UNBLUR.ordinal()) {
                                if (this.mTemplate.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                                    final SquareBitmapModel squareBitmapModel = this.mTemplate.getSquareBitmapModel();
                                    final String s18 = str;
                                    Semaphore semaphore5;
                                    if (squareBitmapModel != null) {
                                        semaphore5 = semaphore3;
                                        final String preRenderMask_Circle = this.preRenderMask_Circle(squareBitmapModel, max, countDownLatch3, semaphore3);
                                        list.add(s7);
                                        list.add(preRenderMask_Circle);
                                        final int n27 = n10 + 1;
                                        this.overlay.append(s8).append(n10).append(str3).append(str2).append(n27).append(":v]").append(s12).append(squareBitmapModel.getPosX()).append(s5).append(squareBitmapModel.getPosY()).append(s8).append(n27).append(s9);
                                        n10 = n27;
                                    }
                                    else {
                                        semaphore5 = semaphore3;
                                    }
                                    str9 = s9;
                                    countDownLatch8 = countDownLatch3;
                                    s19 = s6;
                                    n28 = n2;
                                    str10 = s18;
                                    str11 = s5;
                                    n29 = max;
                                    str12 = str2;
                                    semaphore6 = semaphore5;
                                    break Label_7021;
                                }
                                final String s20 = str;
                                final Semaphore semaphore7 = semaphore3;
                                if (this.mTemplate.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.mTemplate.getIpad_type() != IpadType.IPAD_CLASSIC.ordinal()) {
                                    if (this.mTemplate.getIpad_type() != IpadType.BLACK_LAYER.ordinal() && this.mTemplate.getIpad_type() != IpadType.GRADIENT.ordinal() && this.mTemplate.getIpad_type() != IpadType.MASK_BRUSH.ordinal()) {
                                        if (this.mTemplate.getIpad_type() == IpadType.BLUE_TYPE.ordinal()) {
                                            s19 = s6;
                                            final String preRenderVideoHue = this.preRenderVideoHue(max, countDownLatch3, semaphore3, s6);
                                            list.add(s7);
                                            list.add(preRenderVideoHue);
                                            this.overlay.append("[0]format=yuv420p[ov").append(n10).append(s9);
                                        }
                                        else {
                                            s19 = s6;
                                            countDownLatch3.countDown();
                                        }
                                    }
                                    else {
                                        s19 = s6;
                                        final String preRenderVideo = this.preRenderVideo(max, countDownLatch3, semaphore7, s6);
                                        list.add(s7);
                                        list.add(preRenderVideo);
                                        this.overlay.append("[0]format=yuv420p[ov").append(n10).append(s9);
                                    }
                                    str9 = s9;
                                    n30 = n10;
                                    countDownLatch8 = countDownLatch3;
                                    str10 = s20;
                                    str11 = s5;
                                    n29 = max;
                                    str12 = str2;
                                    semaphore6 = semaphore7;
                                    break Label_7013;
                                }
                                s19 = s6;
                                final SquareBitmapModel squareBitmapModel2 = this.mTemplate.getSquareBitmapModel();
                                int n31;
                                Semaphore semaphore10;
                                if (squareBitmapModel2 != null) {
                                    final Semaphore semaphore8 = semaphore7;
                                    final String str13 = s9;
                                    final int i2 = n10;
                                    n31 = max;
                                    str12 = str2;
                                    final CountDownLatch countDownLatch9 = countDownLatch3;
                                    countDownLatch8 = countDownLatch3;
                                    str11 = s5;
                                    final Semaphore semaphore9 = semaphore8;
                                    semaphore10 = semaphore8;
                                    str10 = s20;
                                    final String preRender_NoMask = this.preRender_NoMask(squareBitmapModel2, max, countDownLatch9, semaphore9, s19);
                                    list.add(s7);
                                    list.add(preRender_NoMask);
                                    n10 = i2 + 1;
                                    final StringBuilder append19 = this.overlay.append(s8).append(i2).append(str3).append(str12).append(n10).append(":v]").append(s12).append(squareBitmapModel2.getPosX()).append(str11).append(squareBitmapModel2.getPosY()).append(s8).append(n10);
                                    str9 = str13;
                                    append19.append(str13);
                                }
                                else {
                                    str9 = s9;
                                    semaphore10 = semaphore7;
                                    countDownLatch8 = countDownLatch3;
                                    n31 = max;
                                    str10 = s20;
                                    str12 = str2;
                                    str11 = s5;
                                }
                                n29 = n31;
                                n28 = n2;
                                semaphore6 = semaphore10;
                                break Label_7021;
                            }
                            else {
                                str10 = str;
                                n2 = n26;
                                s19 = s6;
                                final Semaphore semaphore11 = semaphore3;
                                str9 = s9;
                                n30 = n10;
                                str12 = str2;
                                countDownLatch8 = countDownLatch3;
                                str11 = s5;
                                final SquareBitmapModel squareBitmapModel3 = this.mTemplate.getSquareBitmapModel();
                                n29 = max;
                                if (squareBitmapModel3 != null) {
                                    semaphore6 = semaphore11;
                                    final String preRenderMask_Rounded = this.preRenderMask_Rounded(squareBitmapModel3, max, countDownLatch8, semaphore11);
                                    list.add(s7);
                                    list.add(preRenderMask_Rounded);
                                    final int n32 = n10 + 1;
                                    this.overlay.append(s8).append(n10).append(str3).append(str12).append(n32).append(":v]").append(s12).append(squareBitmapModel3.getPosX()).append(s5).append(squareBitmapModel3.getPosY()).append(s8).append(n32).append(str9);
                                    n10 = n32;
                                    break Label_7017;
                                }
                                semaphore6 = semaphore11;
                                break Label_7013;
                            }
                        }
                    }
                    str10 = str;
                    str8 = s;
                    s19 = s6;
                    str9 = s9;
                    n30 = n10;
                    str12 = str2;
                    semaphore6 = semaphore3;
                    countDownLatch8 = countDownLatch3;
                    str11 = s5;
                    n29 = max;
                }
                n10 = n30;
            }
            n28 = n2;
        }
        float n33 = n28 / (float)this.mTemplate.getFps() * 2.0E-4f;
        final EntityBismilahTemplate entityIsti3adaTemplate = this.mTemplate.getEntityIsti3adaTemplate();
        final Semaphore semaphore12 = semaphore6;
        final int i3 = n29;
        String s21 = str9;
        final String s22 = s19;
        String s23 = str11;
        int addBasmala = this.addBasmala(this.mTemplate.getEntityBismilahTemplate(), this.addBasmala(entityIsti3adaTemplate, n10, semaphore6, countDownLatch8, list, n33), semaphore6, countDownLatch8, list, n33);
        int n34 = 0;
        String s24;
        String s25;
        String s26;
        while (true) {
            final int size = this.mTemplate.getQuranEntityList().size();
            s24 = ")'[ov";
            s25 = ":enable='between(t,";
            s26 = ",";
            if (n34 >= size) {
                break;
            }
            final EntityQuranTemplate entityQuranTemplate = this.mTemplate.getQuranEntityList().get(n34);
            final float abs = Math.abs(entityQuranTemplate.getStart());
            final float abs2 = Math.abs(entityQuranTemplate.getEnd());
            float n35 = 0.0f;
            int n36 = 0;
            int n37 = 0;
            String s27 = null;
            String s28 = null;
            List<String> list2 = null;
            String s29 = null;
            String str14 = null;
            String str15 = null;
            String s30 = null;
            String str16 = null;
            String str17 = null;
            Label_13831: {
                if (abs >= abs2) {
                    n35 = n33;
                    n36 = n34;
                    n37 = addBasmala;
                    s27 = str3;
                    s28 = str12;
                    list2 = list;
                    s29 = s7;
                    str14 = s23;
                    str15 = s21;
                    s30 = str8;
                    str16 = str10;
                    str17 = s8;
                }
                else {
                    final String s31 = s26;
                    final String s32 = s25;
                    final StringBuilder sb2 = new StringBuilder();
                    final String s33 = s24;
                    final File file9 = new File(sb2.append(this.mTemplate.getFolder_template()).append("/").append(entityQuranTemplate.getFile()).toString());
                    if (file9.exists() && file9.isFile() && file9.length() > 0L) {
                        float f15;
                        float n77;
                        String str57;
                        String str58;
                        String str59;
                        int i6;
                        String s85;
                        if (entityQuranTemplate.getTransition() != null) {
                            final boolean b = entityQuranTemplate.getTransition().isOut() && entityQuranTemplate.getTransition().getDuration_out() > 0.0f;
                            final boolean b2 = entityQuranTemplate.getTransition().isIn() && entityQuranTemplate.getTransition().getDuration_in() > 0.0f;
                            final String s34 = "[seg";
                            n35 = n33;
                            final String s35 = "/TB";
                            final String str18 = s23;
                            final String s36 = "setpts=PTS-STARTPTS+";
                            final String str19 = s8;
                            final String s37 = "][seg";
                            if (b2 && b) {
                                final float duration_in = entityQuranTemplate.getTransition().getDuration_in();
                                final float btm_x = entityQuranTemplate.getBtm_x();
                                final String str20 = s37;
                                final float btm_y = entityQuranTemplate.getBtm_y();
                                final float fromW = entityQuranTemplate.getTransition().getFromW();
                                final Transition transition = entityQuranTemplate.getTransition();
                                final float f2 = btm_y;
                                final String type_in = transition.getType_in();
                                final TransitionType fade_IN = TransitionType.FADE_IN;
                                final float n38 = btm_x;
                                String str28;
                                String str29;
                                String s42;
                                float n52;
                                float f8;
                                float n53;
                                List<String> list4;
                                String s43;
                                String s44;
                                String s45;
                                int i5;
                                String s46;
                                float f9;
                                String s47;
                                float n54;
                                String s48;
                                if (!type_in.equals(fade_IN.getValue())) {
                                    final String type_out = entityQuranTemplate.getTransition().getType_out();
                                    final TransitionType fade_OUT = TransitionType.FADE_OUT;
                                    final String str21 = s34;
                                    if (!type_out.equals(fade_OUT.getValue())) {
                                        final float duration_out = entityQuranTemplate.getTransition().getDuration_out();
                                        final float abs3 = Math.abs(abs2 - duration_out);
                                        final String fadeInOut = this.fadeInOut(abs3 - abs, duration_in, duration_out);
                                        final float f3 = abs3;
                                        final int n39 = (int)(abs2 - abs);
                                        final float f4 = abs2;
                                        final float n40 = abs;
                                        final String s38 = s31;
                                        final float n41 = n38;
                                        final int n42 = n39;
                                        n37 = addBasmala;
                                        final float n43 = duration_in;
                                        final String str22 = s32;
                                        final String s39 = fadeInOut;
                                        final float n44 = duration_out;
                                        final String str23 = s33;
                                        final int n45 = n42;
                                        final String str24 = s21;
                                        n36 = n34;
                                        final int i4 = addBasmala;
                                        final String generateVideoSegment = this.generateVideoSegment(entityQuranTemplate, addBasmala, s39, n45, countDownLatch8, semaphore12);
                                        if (generateVideoSegment == null) {
                                            s27 = str3;
                                            s28 = str12;
                                            list2 = list;
                                            s29 = s7;
                                            s30 = str8;
                                            str15 = str24;
                                            str14 = str18;
                                            str16 = str10;
                                            str17 = str19;
                                            break Label_13831;
                                        }
                                        list.add(s7);
                                        list.add(generateVideoSegment);
                                        final int n46 = addBasmala + 1;
                                        final StringBuilder append20 = this.overlay.append(str12).append(n46).append(str3).append(s36).append(abs).append(s35).append(str21).append(n46);
                                        final String str25 = str24;
                                        append20.append(str24);
                                        float f5;
                                        float n47;
                                        int n49;
                                        String s40;
                                        if (type_in.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                            f5 = n41;
                                            n47 = n41 - fromW;
                                            final float n48 = -1.0f;
                                            s27 = str3;
                                            n49 = n46;
                                            s40 = this.mSlideX(abs, n43, n41, fromW, n48, 0.0f);
                                        }
                                        else {
                                            s27 = str3;
                                            f5 = n41;
                                            n49 = n46;
                                            n47 = n41 + fromW;
                                            s40 = this.mSlideX(abs, n43, n41, fromW, 1.0f, 0.0f);
                                        }
                                        final String s41 = s40;
                                        final float n50 = n47;
                                        float f6;
                                        float f7;
                                        List<String> list3;
                                        String str26;
                                        String str27;
                                        if (entityQuranTemplate.getTransition().getType_out().equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                            f6 = f5 + fromW;
                                            final float n51 = 1.0f;
                                            s28 = str12;
                                            f7 = n50;
                                            list3 = list;
                                            str26 = s41;
                                            str27 = this.mSlideX(f3, n44, f5, fromW, 0.0f, n51);
                                        }
                                        else {
                                            s28 = str12;
                                            list3 = list;
                                            f7 = n47;
                                            str26 = s41;
                                            f6 = f5 - fromW;
                                            str27 = this.mSlideX(f3, n44, f5, fromW, 0.0f, -1.0f);
                                        }
                                        this.overlay.append(str19).append(i4).append(str20).append(n49).append("]overlay=x=").append("'if(lt(t," + n40 + ")," + f7 + ",if(lt(t," + (n40 + n43) + ")," + str26 + ",if(lt(t," + f3 + ")," + f5 + ",if(lt(t," + (f3 + n44) + ")," + str27 + s38 + f6 + "))))'").append(s11).append(f2).append(str22).append(n40).append(s38).append(f4).append(str23).append(n49).append(str25);
                                        str17 = str19;
                                        n37 = n49;
                                        s29 = s7;
                                        str15 = str25;
                                        s30 = str8;
                                        list2 = list3;
                                        str14 = str18;
                                        str16 = str10;
                                        break Label_13831;
                                    }
                                    else {
                                        s28 = str12;
                                        str28 = s31;
                                        str29 = s33;
                                        s42 = str20;
                                        n52 = btm_y;
                                        f8 = n38;
                                        n53 = duration_in;
                                        n36 = n34;
                                        list4 = list;
                                        s43 = s21;
                                        s44 = s11;
                                        s45 = str21;
                                        i5 = addBasmala;
                                        s27 = str3;
                                        s46 = str19;
                                        f9 = abs2;
                                        s47 = type_in;
                                        n54 = abs;
                                        s48 = s32;
                                    }
                                }
                                else {
                                    s27 = str3;
                                    s28 = str12;
                                    str28 = s31;
                                    str29 = s33;
                                    n52 = btm_y;
                                    f8 = n38;
                                    f9 = abs2;
                                    n53 = duration_in;
                                    n36 = n34;
                                    list4 = list;
                                    s47 = type_in;
                                    s43 = s21;
                                    s44 = s11;
                                    n54 = abs;
                                    s45 = s34;
                                    i5 = addBasmala;
                                    s48 = s32;
                                    s46 = str19;
                                    s42 = str20;
                                }
                                final TransitionType fade_IN2 = TransitionType.FADE_IN;
                                final String s49 = s48;
                                int n59;
                                List<String> list5;
                                if (s47.equals(fade_IN2.getValue())) {
                                    final float duration_out2 = entityQuranTemplate.getTransition().getDuration_out();
                                    final float abs4 = Math.abs(f9 - duration_out2);
                                    final String type_out2 = entityQuranTemplate.getTransition().getType_out();
                                    final String fadeInOut2 = this.fadeInOut(abs4 - n54, n53, duration_out2);
                                    final int n55 = (int)(f9 - n54);
                                    final float f10 = f9;
                                    final float n56 = duration_out2;
                                    final String str30 = s49;
                                    final float f11 = n52;
                                    n37 = i5;
                                    final String str31 = s44;
                                    final String s50 = fadeInOut2;
                                    final String str32 = s42;
                                    final String str33 = s45;
                                    final String str34 = s46;
                                    final String generateVideoSegment2 = this.generateVideoSegment(entityQuranTemplate, i5, s50, n55, countDownLatch8, semaphore12);
                                    if (generateVideoSegment2 == null) {
                                        str15 = s43;
                                        s29 = s7;
                                        s30 = str8;
                                        list2 = list4;
                                        str14 = str18;
                                        str16 = str10;
                                        s11 = str31;
                                        str17 = str34;
                                        break Label_13831;
                                    }
                                    list4.add(s7);
                                    list4.add(generateVideoSegment2);
                                    final int n57 = i5 + 1;
                                    this.overlay.append(s28).append(n57).append(s27).append(s36).append(n54).append(s35).append(str33).append(n57).append(s43);
                                    String str35;
                                    if (type_out2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        final float n58 = 1.0f;
                                        n59 = n57;
                                        list5 = list4;
                                        str35 = this.slideX(abs4, n56, f8, fromW, 0.0f, n58);
                                    }
                                    else {
                                        n59 = n57;
                                        list5 = list4;
                                        if (type_out2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                            str35 = this.slideX(abs4, n56, f8, fromW, 0.0f, -1.0f);
                                        }
                                        else {
                                            str35 = "" + f8;
                                        }
                                    }
                                    final StringBuilder append21 = this.overlay.append(str34).append(i5).append(str32).append(n59);
                                    str16 = str10;
                                    append21.append(str10).append(str35).append(str31).append(f11).append(str30).append(n54).append(str28).append(f10).append(str29).append(n59).append(s43);
                                    s11 = str31;
                                    str17 = str34;
                                }
                                else {
                                    final String str36 = s35;
                                    final String s51 = s42;
                                    final String s52 = s36;
                                    list5 = list4;
                                    final String s53 = s44;
                                    final String s54 = s43;
                                    final float n60 = n53;
                                    final String str37 = s27;
                                    final String str38 = s45;
                                    final String s55 = str10;
                                    if (!s47.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        final float f12 = n52;
                                        final String s56 = s44;
                                        final String str39 = s55;
                                        final String str40 = s46;
                                        final String str41 = str36;
                                        final String s57 = str38;
                                        s27 = str37;
                                        final TransitionType slide_TO_LEFT = TransitionType.SLIDE_TO_LEFT;
                                        final String str42 = s56;
                                        if (s47.equals(slide_TO_LEFT.getValue())) {
                                            final float duration_out3 = entityQuranTemplate.getTransition().getDuration_out();
                                            final String fadeInOut3 = this.fadeInOut(Math.abs(f9 - duration_out3) - n54, n60, duration_out3);
                                            final int n61 = (int)(f9 - n54);
                                            n37 = i5;
                                            final String s58 = str39;
                                            final String str43 = s57;
                                            final float n62 = n60;
                                            final String generateVideoSegment3 = this.generateVideoSegment(entityQuranTemplate, i5, fadeInOut3, n61, countDownLatch8, semaphore12);
                                            if (generateVideoSegment3 != null) {
                                                list5.add(s7);
                                                list5.add(generateVideoSegment3);
                                                final int n63 = i5 + 1;
                                                this.overlay.append(s28).append(n63).append(s27).append(s52).append(n54).append(str41).append(str43).append(n63).append(s54);
                                                final float n64 = 1.0f;
                                                final int n65 = n63;
                                                this.overlay.append(str40).append(i5).append(s51).append(n65).append(str39).append(this.slideX(n54, n62, f8, fromW, n64, 0.0f)).append(str42).append(f12).append(s49).append(n54).append(str28).append(f9).append(str29).append(n65).append(s54);
                                                s11 = str42;
                                                str16 = s58;
                                                str17 = str40;
                                                str15 = s54;
                                                n37 = n65;
                                                s29 = s7;
                                                list2 = list5;
                                                s30 = str8;
                                                str14 = str18;
                                                break Label_13831;
                                            }
                                            s29 = s7;
                                            list2 = list5;
                                            s30 = str8;
                                            str15 = s54;
                                            str14 = str18;
                                            str16 = str39;
                                        }
                                        else {
                                            str16 = str39;
                                            str15 = s43;
                                            s29 = s7;
                                            list2 = list5;
                                            n37 = i5;
                                            s30 = str8;
                                            str14 = str18;
                                        }
                                        str17 = str40;
                                        s11 = str42;
                                        break Label_13831;
                                    }
                                    final float duration_out4 = entityQuranTemplate.getTransition().getDuration_out();
                                    final String fadeInOut4 = this.fadeInOut(Math.abs(f9 - duration_out4) - n54, n53, duration_out4);
                                    final int n66 = (int)(f9 - n54);
                                    final float f13 = f9;
                                    n37 = i5;
                                    final float f14 = n52;
                                    final String s59 = fadeInOut4;
                                    final String str44 = s53;
                                    final String str45 = s55;
                                    final String str46 = s46;
                                    final String generateVideoSegment4 = this.generateVideoSegment(entityQuranTemplate, i5, s59, n66, countDownLatch8, semaphore12);
                                    if (generateVideoSegment4 == null) {
                                        s27 = str37;
                                        s29 = s7;
                                        list2 = list5;
                                        s30 = str8;
                                        str15 = s43;
                                        str14 = str18;
                                        str16 = str45;
                                        s11 = str44;
                                        str17 = str46;
                                        break Label_13831;
                                    }
                                    list5.add(s7);
                                    list5.add(generateVideoSegment4);
                                    final int n67 = i5 + 1;
                                    this.overlay.append(s28).append(n67).append(str37).append(s52).append(n54).append(str36).append(str38).append(n67).append(s43);
                                    final float n68 = -1.0f;
                                    s27 = str37;
                                    n59 = n67;
                                    this.overlay.append(str46).append(i5).append(s51).append(n59).append(str45).append(this.slideX(n54, n53, f8, fromW, n68, 0.0f)).append(str44).append(f14).append(s49).append(n54).append(str28).append(f13).append(str29).append(n59).append(s43);
                                    s11 = str44;
                                    str16 = str45;
                                    str17 = str46;
                                }
                                n37 = n59;
                                str15 = s43;
                                s29 = s7;
                                list2 = list5;
                                s30 = str8;
                                str14 = str18;
                                break Label_13831;
                            }
                            final String s60 = str3;
                            final String s61 = s36;
                            final String s62 = s21;
                            final String s63 = s32;
                            final String s64 = s33;
                            n36 = n34;
                            final int n69 = addBasmala;
                            final List<String> list6 = list;
                            final String s65 = str19;
                            final String str47 = s35;
                            f15 = abs;
                            final String str48 = str12;
                            final String s66 = s11;
                            final String s67 = s34;
                            if (b2) {
                                final float duration_in2 = entityQuranTemplate.getTransition().getDuration_in();
                                final float btm_x2 = entityQuranTemplate.getBtm_x();
                                final String str49 = s67;
                                final float btm_y2 = entityQuranTemplate.getBtm_y();
                                final float fromW2 = entityQuranTemplate.getTransition().getFromW();
                                final Transition transition2 = entityQuranTemplate.getTransition();
                                final float f16 = btm_y2;
                                final String type_in2 = transition2.getType_in();
                                final String s68 = s66;
                                final String s69 = type_in2;
                                final String mFadeFilter = this.mFadeFilter(0.0f, duration_in2, true);
                                final int n70 = (int)(abs2 - abs);
                                final float n71 = btm_x2;
                                n37 = addBasmala;
                                final float n72 = duration_in2;
                                final String str50 = s65;
                                final String generateVideoSegment5 = this.generateVideoSegment(entityQuranTemplate, addBasmala, mFadeFilter, n70, countDownLatch8, semaphore12);
                                if (generateVideoSegment5 == null) {
                                    s28 = str48;
                                    list2 = list6;
                                    str14 = str18;
                                    str16 = str10;
                                    s27 = s60;
                                    str15 = s21;
                                    s11 = s68;
                                    str17 = str50;
                                    s29 = s7;
                                }
                                else {
                                    list6.add(s7);
                                    list6.add(generateVideoSegment5);
                                    final int n73 = addBasmala + 1;
                                    final StringBuilder append22 = this.overlay.append(str48).append(n73).append(s60).append(s61).append(f15).append(str47).append(str49).append(n73);
                                    final String s70 = s21;
                                    append22.append(s21);
                                    String s71 = null;
                                    String s72 = null;
                                    int n74 = 0;
                                    String s73 = null;
                                    List<String> list7 = null;
                                    String s74 = null;
                                    String s75 = null;
                                    Label_12074: {
                                        if (s69.equals(TransitionType.FADE_IN.getValue())) {
                                            this.overlay.append(str50).append(n69).append(s37).append(n73).append(str10).append(btm_x2).append(str18).append(f16).append(s63).append(f15).append(s31).append(abs2).append(s33).append(n73).append(s21);
                                            s28 = str48;
                                            s71 = str18;
                                            s72 = s60;
                                            n74 = n73;
                                            s73 = s7;
                                            list7 = list6;
                                            s74 = s68;
                                            s75 = str10;
                                        }
                                        else {
                                            String s76;
                                            String s77;
                                            if (s69.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                final float n75 = -1.0f;
                                                s71 = str18;
                                                s72 = s60;
                                                s28 = str48;
                                                n74 = n73;
                                                final String slideX = this.slideX(f15, n72, n71, fromW2, n75, 0.0f);
                                                final StringBuilder append23 = this.overlay.append(str50).append(n69).append(s37).append(n74);
                                                s76 = str10;
                                                final StringBuilder append24 = append23.append(str10).append(slideX);
                                                s77 = s68;
                                                append24.append(s68).append(f16).append(s63).append(f15).append(s31).append(abs2).append(s33).append(n74).append(s21);
                                            }
                                            else {
                                                s28 = str48;
                                                s71 = str18;
                                                s72 = s60;
                                                n74 = n73;
                                                s77 = s68;
                                                s76 = str10;
                                                if (s69.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                                    final float n76 = 1.0f;
                                                    s73 = s7;
                                                    s74 = s68;
                                                    list7 = list6;
                                                    s75 = str10;
                                                    this.overlay.append(str50).append(n69).append(s37).append(n74).append(str10).append(this.slideX(f15, n72, n71, fromW2, n76, 0.0f)).append(s68).append(f16).append(s63).append(f15).append(s31).append(abs2).append(s64).append(n74).append(s21);
                                                    break Label_12074;
                                                }
                                            }
                                            s73 = s7;
                                            list7 = list6;
                                            s74 = s77;
                                            s75 = s76;
                                        }
                                    }
                                    n37 = n74;
                                    str15 = s70;
                                    str17 = str50;
                                    str16 = s75;
                                    s29 = s73;
                                    list2 = list7;
                                    str14 = s71;
                                    s27 = s72;
                                    s11 = s74;
                                }
                                s30 = str8;
                                break Label_13831;
                            }
                            s28 = str48;
                            n77 = abs2;
                            final String s78 = s7;
                            final List<String> list8 = list6;
                            final String str51 = str18;
                            final String str52 = s66;
                            final String str53 = s67;
                            final String s79 = str19;
                            if (b) {
                                final float duration_out5 = entityQuranTemplate.getTransition().getDuration_out();
                                final float abs5 = Math.abs(abs2 - duration_out5);
                                final String str54 = str52;
                                final float btm_x3 = entityQuranTemplate.getBtm_x();
                                final float btm_y3 = entityQuranTemplate.getBtm_y();
                                final float fromW3 = entityQuranTemplate.getTransition().getFromW();
                                final String type_out3 = entityQuranTemplate.getTransition().getType_out();
                                final int n78 = (int)(abs2 - abs);
                                final float n79 = n78 - duration_out5;
                                final int n80 = n78;
                                final String mFadeFilter2 = this.mFadeFilter(n79, duration_out5, false);
                                str15 = s21;
                                final float n81 = duration_out5;
                                n37 = addBasmala;
                                final float f17 = n77;
                                final String str55 = s79;
                                final String s80 = str53;
                                final String generateVideoSegment6 = this.generateVideoSegment(entityQuranTemplate, addBasmala, mFadeFilter2, n80, countDownLatch8, semaphore12);
                                if (generateVideoSegment6 == null) {
                                    s30 = str8;
                                    s29 = s78;
                                    str16 = str10;
                                    list2 = list8;
                                    s11 = str54;
                                    str17 = str55;
                                    str14 = str51;
                                    s27 = s60;
                                    break Label_13831;
                                }
                                list8.add(s78);
                                list8.add(generateVideoSegment6);
                                final int n82 = addBasmala + 1;
                                String s81 = null;
                                int n84 = 0;
                                String s82 = null;
                                Label_13415: {
                                    if (type_out3.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                        this.overlay.append(s28).append(n82).append(s60).append(s61).append(f15).append(str47).append(str53).append(n82).append(s21);
                                        final float n83 = 1.0f;
                                        s81 = s78;
                                        this.overlay.append(str55).append(n69).append(s37).append(n82).append(str10).append(this.slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, n83)).append(str52).append(btm_y3).append(s63).append(f15).append(s31).append(f17).append(")'").append(str55).append(n82).append(s21);
                                        s11 = str52;
                                        str16 = str10;
                                        str17 = str55;
                                        n84 = n82;
                                        str14 = str51;
                                        s82 = s60;
                                    }
                                    else {
                                        s81 = s78;
                                        n84 = n82;
                                        String s83;
                                        if (type_out3.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                            this.overlay.append(s28).append(n82).append(s60).append(s61).append(f15).append(str47).append(s80).append(n82).append(s62);
                                            final float n85 = -1.0f;
                                            s83 = s60;
                                            str17 = str55;
                                            this.overlay.append(str55).append(n69).append(s37).append(n82).append(str10).append(this.slideX(abs5, n81, btm_x3, fromW3, 0.0f, n85)).append(str54).append(btm_y3).append(s63).append(f15).append(s31).append(f17).append(")'").append(str55).append(n82).append(s62);
                                            s11 = str54;
                                            n84 = n82;
                                            str16 = str10;
                                        }
                                        else {
                                            final String str56 = str47;
                                            s83 = s60;
                                            str17 = str55;
                                            str16 = str10;
                                            s11 = str52;
                                            if (type_out3.equals(TransitionType.FADE_OUT.getValue())) {
                                                final StringBuilder append25 = this.overlay.append(s28).append(n84);
                                                s82 = s60;
                                                append25.append(s60).append(s61).append(f15).append(str56).append(s80).append(n84).append(s62);
                                                final StringBuilder append26 = this.overlay.append(str55).append(n69).append(s37).append(n84).append(str10).append(btm_x3);
                                                str14 = str51;
                                                append26.append(str51).append(btm_y3).append(s63).append(f15).append(s31).append(f17).append(s64).append(n84).append(s62);
                                                break Label_13415;
                                            }
                                        }
                                        s82 = s83;
                                        str14 = str51;
                                    }
                                }
                                n37 = n84;
                                s27 = s82;
                                s30 = str8;
                                list2 = list8;
                                s29 = s81;
                                break Label_13831;
                            }
                            else {
                                str15 = s21;
                                str57 = s64;
                                str58 = s31;
                                str59 = s32;
                                str16 = str10;
                                i6 = addBasmala;
                                final String s84 = s78;
                                str14 = str18;
                                s85 = s60;
                                str17 = str19;
                                s11 = str52;
                                list2 = list8;
                                s29 = s84;
                            }
                        }
                        else {
                            n35 = n33;
                            n77 = abs2;
                            i6 = addBasmala;
                            s28 = str12;
                            str14 = s23;
                            str15 = s21;
                            str59 = s32;
                            s85 = str3;
                            str17 = s8;
                            str57 = s33;
                            f15 = abs;
                            str58 = s31;
                            n36 = n34;
                            str16 = str10;
                            list2 = list;
                            s29 = s7;
                        }
                        list2.add(s29);
                        list2.add(this.mTemplate.getFolder_template() + "/" + entityQuranTemplate.getFile());
                        final int n86 = i6 + 1;
                        final StringBuilder append27 = this.overlay.append(str17).append(i6);
                        s30 = str8;
                        final StringBuilder append28 = append27.append(str8).append(n86).append(str16);
                        s27 = s85;
                        append28.append(entityQuranTemplate.getBtm_x()).append(str14).append(entityQuranTemplate.getBtm_y()).append(str59).append(f15).append(str58).append(Math.abs(n77 - n35)).append(str57).append(n86).append(str15);
                        countDownLatch8.countDown();
                        n37 = n86;
                    }
                    else {
                        n35 = n33;
                        n36 = n34;
                        n37 = addBasmala;
                        s27 = str3;
                        s28 = str12;
                        list2 = list;
                        s29 = s7;
                        str14 = s23;
                        str15 = s21;
                        s30 = str8;
                        str16 = str10;
                        str17 = s8;
                        countDownLatch8.countDown();
                    }
                }
            }
            final int n87 = n36 + 1;
            s23 = str14;
            str10 = str16;
            list = list2;
            str8 = s30;
            s8 = str17;
            str3 = s27;
            s21 = str15;
            n34 = n87;
            addBasmala = n37;
            s7 = s29;
            n33 = n35;
            str12 = s28;
        }
        final float n88 = n33;
        final String str60 = s26;
        final String str61 = s25;
        final String str62 = str3;
        String str63 = str12;
        Object str64 = list;
        String s86 = s7;
        String s87 = s21;
        final String str65 = str8;
        final String str66 = str10;
        String s88 = s24;
        final String s89 = s8;
        final String str67 = s23;
        int n89 = addBasmala;
        String s90;
        int n91;
        String s91;
        for (int n90 = 0; n90 < this.mTemplate.getTranslationTemplateList().size(); n90 = n91 + 1, s88 = s91, s87 = s90) {
            final EntityTranslationTemplate entityTranslationTemplate = this.mTemplate.getTranslationTemplateList().get(n90);
            final float abs6 = Math.abs(entityTranslationTemplate.getStart());
            final float abs7 = Math.abs(entityTranslationTemplate.getEnd());
            if (abs6 >= abs7) {
                s90 = s87;
                n91 = n90;
                s91 = s88;
            }
            else {
                n91 = n90;
                final String str68 = s87;
                final StringBuilder sb3 = new StringBuilder();
                final String str69 = s88;
                final File file10 = new File(sb3.append(this.mTemplate.getFolder_template()).append("/").append(entityTranslationTemplate.getFile()).toString());
                if (file10.exists() && file10.isFile() && file10.length() > 0L) {
                    ((List<String>)str64).add(s86);
                    ((List<String>)str64).add(this.mTemplate.getFolder_template() + "/" + entityTranslationTemplate.getFile());
                    final int n92 = n89 + 1;
                    final StringBuilder append29 = this.overlay.append(s89).append(n89).append(str65).append(n92).append(str66).append(0).append(str67).append(entityTranslationTemplate.getBtm_y()).append(str61).append(abs6).append(str60).append(Math.abs(abs7 - n88));
                    s91 = str69;
                    final StringBuilder append30 = append29.append(str69).append(n92);
                    s90 = str68;
                    append30.append(str68);
                    countDownLatch8.countDown();
                    n89 = n92;
                }
                else {
                    s90 = str68;
                    s91 = str69;
                    countDownLatch8.countDown();
                }
            }
        }
        final String s92 = s87;
        final StringBuilder append31 = new StringBuilder(s89).append(n89);
        final String s93 = str62;
        Serializable s94 = append31.append(str62).toString();
        String string5 = "";
        int i7 = 0;
        int i8 = 0;
        Serializable s95 = null;
        Object o = null;
        boolean b3 = false;
        Label_15530: {
            Label_15525: {
                try {
                Label_14593_Outer:
                    while (true) {
                        final Template mTemplate = this.mTemplate;
                        try {
                            final List entityMediaList = mTemplate.getEntityMediaList();
                            try {
                                Label_15408: {
                                    if (i7 >= entityMediaList.size()) {
                                        break Label_15408;
                                    }
                                    final Template mTemplate2 = this.mTemplate;
                                    try {
                                        final Object value3 = mTemplate2.getEntityMediaList().get(i7);
                                        try {
                                            final EntityMedia entityMedia = (EntityMedia)value3;
                                            try {
                                                final float end = entityMedia.getEnd();
                                                try {
                                                    while (true) {
                                                        Label_15375: {
                                                            Label_14612: {
                                                                if (end >= entityMedia.getStart()) {
                                                                    break Label_14612;
                                                                }
                                                                s95 = s94;
                                                                o = str64;
                                                                final String s96 = s86;
                                                                str64 = str63;
                                                                break Label_15375;
                                                            }
                                                            try {
                                                                final File file11 = new File(entityMedia.getPath_ffmpeg_effect());
                                                                if (!file11.isFile()) {
                                                                    continue;
                                                                }
                                                                if (!file11.exists()) {
                                                                    continue;
                                                                }
                                                                ((List<String>)str64).add(s86);
                                                                ((List<String>)str64).add(entityMedia.getPath_ffmpeg_effect());
                                                                final int i9 = n89 + 1;
                                                                final float f18 = Utils.f2(entityMedia.getStart() / 1000.0f);
                                                                try {
                                                                    final float f19 = Utils.f2(entityMedia.getEnd() / 1000.0f);
                                                                    try {
                                                                        final float posXFFmpeg = entityMedia.getPosXFFmpeg();
                                                                        try {
                                                                            final long n93 = Math.round(posXFFmpeg);
                                                                            try {
                                                                                final StringBuilder sb4 = new StringBuilder();
                                                                                final String s96 = s86;
                                                                                final StringBuilder append32 = sb4.append("a").append(i7);
                                                                                try {
                                                                                    final String string6 = append32.toString();
                                                                                    try {
                                                                                        try {
                                                                                            final StringBuilder sb5 = new StringBuilder();
                                                                                            s95 = s94;
                                                                                            s94 = "d";
                                                                                            final StringBuilder sb6 = sb5;
                                                                                            try {
                                                                                                s94 = sb6.append((String)s94);
                                                                                                s94 = ((StringBuilder)s94).append(i7);
                                                                                                try {
                                                                                                    s94 = ((StringBuilder)s94).toString();
                                                                                                    try {
                                                                                                        final StringBuilder overlay = this.overlay;
                                                                                                        o = str64;
                                                                                                        str64 = str63;
                                                                                                        final StringBuilder sb7 = overlay;
                                                                                                        try {
                                                                                                            final StringBuilder append33 = sb7.append(str63).append(i9);
                                                                                                            final int n94 = i9;
                                                                                                            append33.append(":a]").append("volume=0.5").append("[vlm").append(i7).append(s92);
                                                                                                            if (entityMedia.isApplyEffectInPreview()) {
                                                                                                                this.overlay.append("[vlm").append(i7).append(s93).append("adelay=").append(n93).append("|").append(n93).append(str63).append((String)s94).append(s92);
                                                                                                            }
                                                                                                            else {
                                                                                                                this.overlay.append("[vlm").append(i7).append(s93).append("atrim=start=").append(f18).append(":end=").append(f19).append(",asetpts=PTS-STARTPTS").append(str63).append(string6).append(s92);
                                                                                                                this.overlay.append(str63).append(string6).append(s93).append("adelay=").append(n93).append("|").append(n93).append(str63).append((String)s94).append(s92);
                                                                                                            }
                                                                                                            try {
                                                                                                                final StringBuilder sb8 = new StringBuilder();
                                                                                                                try {
                                                                                                                    final StringBuilder append34 = sb8.append(string5).append((String)str64).append((String)s94).append(s93);
                                                                                                                    try {
                                                                                                                        string5 = append34.toString();
                                                                                                                        ++i8;
                                                                                                                        n89 = n94;
                                                                                                                    }
                                                                                                                    catch (final Exception ex) {}
                                                                                                                }
                                                                                                                catch (final Exception ex2) {}
                                                                                                            }
                                                                                                            catch (final Exception ex3) {}
                                                                                                        }
                                                                                                        catch (final Exception ex4) {}
                                                                                                    }
                                                                                                    catch (final Exception ex) {}
                                                                                                }
                                                                                                catch (final Exception ex5) {}
                                                                                            }
                                                                                            catch (final Exception ex6) {}
                                                                                            ++i7;
                                                                                            str63 = (String)str64;
                                                                                            s94 = s95;
                                                                                            s86 = s96;
                                                                                            str64 = o;
                                                                                            continue Label_14593_Outer;
                                                                                            while (true) {
                                                                                                b3 = false;
                                                                                                break Label_15530;
                                                                                                try {
                                                                                                    this.overlay.append(string5).append("amix=inputs=").append(i8).append(":duration=longest:normalize=0:dropout_transition=0,volume=2[a]");
                                                                                                    b3 = true;
                                                                                                    break Label_15530;
                                                                                                }
                                                                                                catch (final Exception ex) {
                                                                                                    b3 = true;
                                                                                                    break Label_15525;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            s95 = s94;
                                                                                            o = str64;
                                                                                            iftrue(Label_15494:)(i8 <= 0);
                                                                                        }
                                                                                        catch (final Exception ex) {
                                                                                            s95 = s94;
                                                                                        }
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
                                                        break;
                                                    }
                                                }
                                                catch (final Exception ex14) {}
                                            }
                                            catch (final Exception ex15) {}
                                        }
                                        catch (final Exception ex16) {}
                                    }
                                    catch (final Exception ex17) {}
                                }
                            }
                            catch (final Exception ex18) {}
                        }
                        catch (final Exception ex19) {}
                    }
                }
                catch (final Exception ex20) {}
                o = str64;
                b3 = false;
            }
            final Exception ex;
            ex.printStackTrace();
        }
        final Object o2 = o;
        ((List<String>)o).add("-filter_complex");
        ((List<String>)o).add(this.overlay.toString());
        if (b3) {
            ((List<String>)o).add("-map");
            ((List<String>)o).add((String)s95);
            ((List<String>)o).add("-map");
            ((List<String>)o).add("[a]");
            if (ffmpegCodecChecker$CodecInfo.audioCodec != null) {
                ((List<String>)o).add("-c:a");
                ((List<String>)o).add(ffmpegCodecChecker$CodecInfo.audioCodec);
                ((List<String>)o).add("-b:a");
                ((List<String>)o).add("256k");
                ((List<String>)o).add("-ar");
                ((List<String>)o).add("44100");
                ((List<String>)o).add("-ac");
                ((List<String>)o).add("2");
            }
        }
        else {
            ((List<String>)o).add("-map");
            ((List<String>)o).add((String)s95);
        }
        ((List<String>)o2).add("-y");
        ((List<String>)o2).add("-level");
        ((List<String>)o2).add("4.1");
        ((List<String>)o2).add("-g");
        ((List<String>)o2).add("120");
        if (s22 != null) {
            ((List<String>)o2).add("-threads");
            ((List<String>)o2).add("0");
            ((List<String>)o2).add("-c:v");
            ((List<String>)o2).add(s22);
            ((List<String>)o2).add("-preset");
            ((List<String>)o2).add("fast");
            ((List<String>)o2).add("-crf");
            ((List<String>)o2).add("18");
        }
        else {
            ((List<String>)o2).add("-b:v");
            ((List<String>)o2).add("4M");
        }
        ((List<String>)o2).add("-pix_fmt");
        ((List<String>)o2).add("yuv420p");
        ((List<String>)o2).add("-framerate");
        ((List<String>)o2).add("" + this.mTemplate.getFps());
        ((List<String>)o2).add("-movflags");
        ((List<String>)o2).add("+faststart");
        ((List<String>)o2).add("-t");
        ((List<String>)o2).add(i3 + "ms");
        ((List<String>)o2).add(this.mUri);
        this.renderManager.computeWeights();
        (this.workerThread = new Thread(new ProgressViewActivity$$ExternalSyntheticLambda10(this, countDownLatch8, (List)o2))).start();
    }
    
    protected void updateProgressDialog(final Statistics statistics) {
        if (statistics == null) {
            return;
        }
        if (this.isDestroy) {
            return;
        }
        try {
            final int n = (int)statistics.getTime();
            if (n <= 0) {
                return;
            }
            final float n2 = n / 1000.0f;
            final RenderManager renderManager = this.renderManager;
            try {
                float n3 = n2 / renderManager.getCurrentStepDuration();
                final float n4 = 1.0f;
                if (n3 > n4) {
                    n3 = n4;
                }
                this.targetProgress = this.renderManager.updateLocalProgress(n3) * 100.0f;
                if (!this.isAnimating) {
                    this.startSmoothAnimation();
                }
            }
            catch (final Exception ex) {}
        }
        catch (final Exception ex2) {}
    }
}
