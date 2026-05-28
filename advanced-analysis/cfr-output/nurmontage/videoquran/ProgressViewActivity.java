/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.lifecycle.LifecycleOwner
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 *  com.arthenica.ffmpegkit.Statistics
 *  com.arthenica.ffmpegkit.StatisticsCallback
 *  org.apache.commons.io.FileUtils
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda11;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda12;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda7;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda8;
import hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda9;
import hazem.nurmontage.videoquran.ProgressViewActivity$1;
import hazem.nurmontage.videoquran.ProgressViewActivity$10;
import hazem.nurmontage.videoquran.ProgressViewActivity$11;
import hazem.nurmontage.videoquran.ProgressViewActivity$2;
import hazem.nurmontage.videoquran.ProgressViewActivity$3;
import hazem.nurmontage.videoquran.ProgressViewActivity$4;
import hazem.nurmontage.videoquran.ProgressViewActivity$5;
import hazem.nurmontage.videoquran.ProgressViewActivity$6;
import hazem.nurmontage.videoquran.ProgressViewActivity$7;
import hazem.nurmontage.videoquran.ProgressViewActivity$8;
import hazem.nurmontage.videoquran.ProgressViewActivity$9;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker$CodecInfo;
import hazem.nurmontage.videoquran.Utils.FileMediaScanner;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.VideoViewActivity;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.model.EntityBismilahTemplate;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import hazem.nurmontage.videoquran.model.EntityTranslationTemplate;
import hazem.nurmontage.videoquran.model.RenderManager;
import hazem.nurmontage.videoquran.model.SquareBitmapModel;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.model.TimeModel;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import org.apache.commons.io.FileUtils;

public class ProgressViewActivity
extends Base {
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

    static /* bridge */ /* synthetic */ Dialog cfr_renamed_19(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.dialog;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_20(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.displayedProgress;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_21(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.isCancel;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_22(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.isDestroy;
    }

    static /* bridge */ /* synthetic */ Template cfr_renamed_2(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.mTemplate;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_23(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.mUri;
    }

    static /* bridge */ /* synthetic */ StringBuilder cfr_renamed_24(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.overlay;
    }

    static /* bridge */ /* synthetic */ SquareOutlineProgressBar cfr_renamed_25(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.progressIndicator;
    }

    static /* bridge */ /* synthetic */ RenderManager cfr_renamed_26(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.renderManager;
    }

    static /* bridge */ /* synthetic */ Runnable cfr_renamed_27(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.runnableProgress;
    }

    static /* bridge */ /* synthetic */ Statistics cfr_renamed_28(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.statistics;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_29(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.targetProgress;
    }

    static /* bridge */ /* synthetic */ Handler cfr_renamed_30(ProgressViewActivity progressViewActivity) {
        return progressViewActivity.uiHandler;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_31(ProgressViewActivity progressViewActivity, float f) {
        progressViewActivity.displayedProgress = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_32(ProgressViewActivity progressViewActivity, boolean bl) {
        progressViewActivity.isAnimating = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_33(ProgressViewActivity progressViewActivity, boolean bl) {
        progressViewActivity.isCancel = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_34(ProgressViewActivity progressViewActivity, Statistics statistics) {
        progressViewActivity.statistics = statistics;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_35(ProgressViewActivity progressViewActivity, float f) {
        progressViewActivity.targetProgress = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_36(ProgressViewActivity progressViewActivity) {
        progressViewActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_37(ProgressViewActivity progressViewActivity) {
        progressViewActivity.completeProgress();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_38(ProgressViewActivity progressViewActivity, File file) {
        progressViewActivity.deleteFolderWithCommonsIO(file);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_39(ProgressViewActivity progressViewActivity, Uri uri) {
        progressViewActivity.insertToGallery(uri);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_40(ProgressViewActivity progressViewActivity, FFmpegSession fFmpegSession) {
        progressViewActivity.showError(fFmpegSession);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_41(ProgressViewActivity progressViewActivity) {
        progressViewActivity.toShare();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_42(ProgressViewActivity progressViewActivity) {
        progressViewActivity.toStudio();
    }

    public ProgressViewActivity() {
        Object object = new StringBuilder();
        this.overlay = object;
        this.renderManager = object = new RenderManager();
        object = new ProgressViewActivity$1(this, true);
        this.onBackPressedCallback = object;
        object = Executors.newSingleThreadExecutor();
        this.executor = object;
        object = new ArrayList();
        this.id_ffmpeg = object;
        Looper looper = Looper.getMainLooper();
        object = new Handler(looper);
        this.uiHandler = object;
        this.displayedProgress = 0.0f;
        this.targetProgress = 0.0f;
        this.FRAME_MS = 16;
        this.isAnimating = false;
        object = new ProgressViewActivity$11(this);
        this.runnableProgress = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int addBasmala(EntityBismilahTemplate var1_1, int var2_2, Semaphore var3_3, CountDownLatch var4_4, List var5_5, float var6_6) {
        block52: {
            block30: {
                block47: {
                    block51: {
                        block31: {
                            block49: {
                                block50: {
                                    block48: {
                                        block35: {
                                            block38: {
                                                block44: {
                                                    block45: {
                                                        block46: {
                                                            block43: {
                                                                block41: {
                                                                    block42: {
                                                                        block40: {
                                                                            block39: {
                                                                                block36: {
                                                                                    block37: {
                                                                                        block34: {
                                                                                            block33: {
                                                                                                block32: {
                                                                                                    var7_7 = this;
                                                                                                    var8_8 = var2_2;
                                                                                                    var9_9 = var5_5;
                                                                                                    if (var1_1 == null) {
                                                                                                        return var2_2;
                                                                                                    }
                                                                                                    var10_10 = Math.abs(var1_1.getStart());
                                                                                                    var11_11 = var1_1.getEnd();
                                                                                                    var12_12 = Math.abs(var11_11);
                                                                                                    var14_14 = new StringBuilder();
                                                                                                    var15_15 = this.mTemplate.getFolder_template();
                                                                                                    var14_14 = var14_14.append((String)var15_15);
                                                                                                    var16_16 = "/";
                                                                                                    var14_14 = var14_14.append((String)var16_16);
                                                                                                    var15_15 = var1_1.getFile();
                                                                                                    var13_13 = new File((String)(var14_14 = var14_14.append((String)var15_15).toString()));
                                                                                                    var17_17 = var13_13.exists();
                                                                                                    if (var17_17 == 0 || (var17_17 = var13_13.isFile()) == 0 || (var22_20 = (cfr_temp_0 = (var18_18 = var13_13.length()) - (var20_19 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) break block30;
                                                                                                    var13_13 = var1_1.getTransition();
                                                                                                    var23_21 = ":";
                                                                                                    var24_22 = "-i";
                                                                                                    var25_23 = ")'[ov";
                                                                                                    var26_24 = "]overlay=";
                                                                                                    var27_25 = ":enable='between(t,";
                                                                                                    var28_26 = ",";
                                                                                                    var15_15 = "[ov";
                                                                                                    var14_14 = "];";
                                                                                                    if (var13_13 == null) break block31;
                                                                                                    var13_13 = var1_1.getTransition();
                                                                                                    var22_20 = (long)var13_13.isOut();
                                                                                                    if (var22_20 == false) break block32;
                                                                                                    var13_13 = var1_1.getTransition();
                                                                                                    var11_11 = var13_13.getDuration_out();
                                                                                                    var29_27 = 0.0f;
                                                                                                    var30_28 /* !! */  = null;
                                                                                                    cfr_temp_1 = var11_11 - 0.0f;
                                                                                                    var22_20 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                                                    if (var22_20 <= 0) break block33;
                                                                                                    var22_20 = 1;
                                                                                                    var11_11 = 1.4E-45f;
                                                                                                    break block34;
                                                                                                }
                                                                                                var29_27 = 0.0f;
                                                                                                var30_28 /* !! */  = null;
                                                                                            }
                                                                                            var22_20 = 0;
                                                                                            var11_11 = 0.0f;
                                                                                            var13_13 = null;
                                                                                        }
                                                                                        var31_29 = var1_1.getTransition();
                                                                                        var32_30 = var31_29.isIn();
                                                                                        if (var32_30 != 0 && (var32_30 = (cfr_temp_2 = (var33_31 = (var31_29 = var1_1.getTransition()).getDuration_in()) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1)) > 0) {
                                                                                            var32_30 = 1;
                                                                                            var33_31 = 1.4E-45f;
                                                                                        } else {
                                                                                            var32_30 = 0;
                                                                                            var33_31 = 0.0f;
                                                                                            var31_29 = null;
                                                                                        }
                                                                                        var34_32 = var16_16;
                                                                                        var35_33 = var23_21;
                                                                                        var36_34 = ":y=";
                                                                                        var37_35 = "[seg";
                                                                                        var16_16 = "]";
                                                                                        var38_36 = "/TB";
                                                                                        var23_21 = "[";
                                                                                        var39_37 = "setpts=PTS-STARTPTS+";
                                                                                        var40_38 = "][seg";
                                                                                        if (var32_30 == 0 || var22_20 == false) break block35;
                                                                                        var13_13 = var1_1.getTransition();
                                                                                        var11_11 = var13_13.getDuration_in();
                                                                                        var41_39 = var40_38;
                                                                                        var29_27 = var1_1.getBtm_x();
                                                                                        var42_41 = var1_1.getBtm_y();
                                                                                        var31_29 = var1_1.getTransition();
                                                                                        var33_31 = var31_29.getFromW();
                                                                                        var43_43 = var1_1.getTransition();
                                                                                        var44_44 = var42_41;
                                                                                        var40_38 = var43_43.getType_in();
                                                                                        var43_43 = TransitionType.FADE_IN;
                                                                                        var45_46 /* !! */  = var14_14;
                                                                                        var14_14 = var43_43.getValue();
                                                                                        var17_17 = var40_38.equals(var14_14);
                                                                                        if (var17_17 != 0) break block36;
                                                                                        var14_14 = var1_1.getTransition().getType_out();
                                                                                        var43_43 = TransitionType.FADE_OUT;
                                                                                        var46_49 = var15_15;
                                                                                        var15_15 = var43_43.getValue();
                                                                                        var17_17 = var14_14.equals(var15_15);
                                                                                        if (var17_17 != 0) break block37;
                                                                                        var47_50 = var1_1.getTransition().getDuration_out();
                                                                                        var48_51 = Math.abs(var12_12 - var47_50);
                                                                                        var43_43 = var28_26;
                                                                                        var49_52 = var48_51 - var10_10;
                                                                                        var28_26 = var7_7.fadeInOut(var49_52, var11_11, var47_50);
                                                                                        var50_53 = var11_11;
                                                                                        var11_11 = var12_12 - var10_10;
                                                                                        var22_20 = (int)var11_11;
                                                                                        var51_54 = var50_53;
                                                                                        var13_13 = this;
                                                                                        var52_57 = var48_51;
                                                                                        var53_58 = var45_46 /* !! */ ;
                                                                                        var54_61 = var12_12;
                                                                                        var55_64 = var45_46 /* !! */ ;
                                                                                        var14_14 = var1_1;
                                                                                        var56_66 = var46_49;
                                                                                        var57_68 = var47_50;
                                                                                        var58_69 = var2_2;
                                                                                        var59_74 = var43_43;
                                                                                        var60_76 = var27_25;
                                                                                        var61_79 = var22_20;
                                                                                        var62_85 = var26_24;
                                                                                        var26_24 = var4_4;
                                                                                        var63_89 = var25_23;
                                                                                        var25_23 = var3_3;
                                                                                        var13_13 = this.generateVideoSegment(var1_1, var2_2, (String)var28_26, (int)var22_20, var4_4, var3_3);
                                                                                        if (var13_13 != null) {
                                                                                            var9_9.add(var24_22);
                                                                                            var9_9.add(var13_13);
                                                                                            var64_91 = var8_8 + 1;
                                                                                            var13_13 = var7_7.overlay.append((String)var23_21).append(var64_91).append((String)var16_16);
                                                                                            var26_24 = var39_37;
                                                                                            var13_13 = var13_13.append(var39_37).append(var10_10);
                                                                                            var27_25 = var38_36;
                                                                                            var13_13 = var13_13.append((String)var38_36);
                                                                                            var28_26 = var37_35;
                                                                                            var13_13.append((String)var37_35).append(var64_91).append((String)var45_46 /* !! */ );
                                                                                            var13_13 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                            var22_20 = (long)var40_38.equals(var13_13);
                                                                                            if (var22_20 != false) {
                                                                                                var42_41 = var29_27 - var33_31;
                                                                                                var65_98 = -1.0f;
                                                                                                var66_106 = false;
                                                                                                var67_111 = 0.0f;
                                                                                                var16_16 = null;
                                                                                                var13_13 = this;
                                                                                                var48_51 = var10_10;
                                                                                                var47_50 = var50_53;
                                                                                                var49_52 = var29_27;
                                                                                                var68_116 = var33_31;
                                                                                                var69_122 = var64_91;
                                                                                                var64_91 = 0;
                                                                                                var25_23 = null;
                                                                                                var70_123 = 0.0f;
                                                                                                var13_13 = this.mSlideX(var10_10, var50_53, var29_27, var33_31, var65_98, 0.0f);
                                                                                            } else {
                                                                                                var69_122 = var64_91;
                                                                                                var42_41 = var29_27 + var33_31;
                                                                                                var65_98 = 1.0f;
                                                                                                var64_91 = 0;
                                                                                                var70_123 = 0.0f;
                                                                                                var25_23 = null;
                                                                                                var13_13 = this;
                                                                                                var48_51 = var10_10;
                                                                                                var47_50 = var50_53;
                                                                                                var49_52 = var29_27;
                                                                                                var68_116 = var33_31;
                                                                                                var13_13 = this.mSlideX(var10_10, var50_53, var29_27, var33_31, var65_98, 0.0f);
                                                                                            }
                                                                                            var16_16 = var13_13;
                                                                                            var13_13 = var1_1.getTransition().getType_out();
                                                                                            var14_14 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                            var22_20 = (long)var13_13.equals(var14_14);
                                                                                            if (var22_20 != false) {
                                                                                                var71_130 = var29_27 + var33_31;
                                                                                                var65_98 = 0.0f;
                                                                                                var26_24 = null;
                                                                                                var64_91 = 1065353216;
                                                                                                var70_123 = 1.0f;
                                                                                                var13_13 = this;
                                                                                                var48_51 = var52_57;
                                                                                                var47_50 = var57_68;
                                                                                                var49_52 = var29_27;
                                                                                                var68_116 = var33_31;
                                                                                                var13_13 = this.mSlideX(var52_57, var57_68, var29_27, var33_31, 0.0f, var70_123);
                                                                                            } else {
                                                                                                var71_130 = var29_27 - var33_31;
                                                                                                var65_98 = 0.0f;
                                                                                                var26_24 = null;
                                                                                                var64_91 = -1082130432;
                                                                                                var70_123 = -1.0f;
                                                                                                var13_13 = this;
                                                                                                var48_51 = var52_57;
                                                                                                var47_50 = var57_68;
                                                                                                var49_52 = var29_27;
                                                                                                var68_116 = var33_31;
                                                                                                var13_13 = this.mSlideX(var52_57, var57_68, var29_27, var33_31, 0.0f, var70_123);
                                                                                            }
                                                                                            var48_51 = var71_130;
                                                                                            var15_15 = new StringBuilder("'if(lt(t,");
                                                                                            var15_15 = var15_15.append(var10_10);
                                                                                            var28_26 = "),";
                                                                                            var15_15 = var15_15.append((String)var28_26).append(var42_41);
                                                                                            var27_25 = ",if(lt(t,";
                                                                                            var15_15 = var15_15.append((String)var27_25);
                                                                                            var70_123 = var51_54;
                                                                                            var65_98 = var10_10 + var51_54;
                                                                                            var15_15 = var15_15.append(var65_98).append((String)var28_26).append((String)var16_16).append((String)var27_25);
                                                                                            var65_98 = var52_57;
                                                                                            var15_15 = var15_15.append(var52_57).append((String)var28_26);
                                                                                            var70_123 = var29_27;
                                                                                            var15_15 = var15_15.append(var29_27).append((String)var27_25);
                                                                                            var68_116 = var52_57 + var57_68;
                                                                                            var13_13 = var15_15.append(var68_116).append((String)var28_26).append((String)var13_13);
                                                                                            var15_15 = var59_74;
                                                                                            var13_13 = var13_13.append((String)var59_74).append(var71_130).append("))))'").toString();
                                                                                            var14_14 = var7_7.overlay;
                                                                                            var28_26 = var56_66;
                                                                                            var14_14 = var14_14.append((String)var56_66).append(var8_8);
                                                                                            var27_25 = var41_39;
                                                                                            var14_14 = var14_14.append(var41_39).append(var69_122);
                                                                                            var27_25 = "]overlay=x=";
                                                                                            var13_13 = var14_14.append((String)var27_25).append((String)var13_13);
                                                                                            var14_14 = var36_34;
                                                                                            var13_13 = var13_13.append((String)var36_34);
                                                                                            var48_51 = var44_44;
                                                                                            var13_13 = var13_13.append(var44_44);
                                                                                            var14_14 = var60_76;
                                                                                            var13_13 = var13_13.append((String)var60_76).append(var10_10).append((String)var59_74);
                                                                                            var68_116 = var54_61;
                                                                                            var13_13 = var13_13.append(var54_61);
                                                                                            var26_24 = var63_89;
                                                                                            var13_13 = var13_13.append((String)var63_89).append(var69_122);
                                                                                            var13_13.append((String)var55_64);
                                                                                            var72_132 = 1;
                                                                                            var73_133 = 1.4E-45f;
                                                                                        } else {
                                                                                            var68_116 = var12_12;
                                                                                            var28_26 = var46_49;
                                                                                            var15_15 = var43_43;
                                                                                            var14_14 = var27_25;
                                                                                            var26_24 = var63_89;
                                                                                            var69_122 = var8_8;
                                                                                            var72_132 = 0;
                                                                                            var73_133 = 0.0f;
                                                                                            var74_134 = null;
                                                                                        }
                                                                                        var25_23 = var28_26;
                                                                                        var28_26 = var62_85;
                                                                                        break block38;
                                                                                    }
                                                                                    var15_15 = var28_26;
                                                                                    var75_139 = var27_25;
                                                                                    var62_86 /* !! */  = var26_24;
                                                                                    var76_140 = var25_23;
                                                                                    var14_14 = var36_34;
                                                                                    var28_26 = var37_35;
                                                                                    var27_25 = var38_36;
                                                                                    var26_24 = var39_37;
                                                                                    var77_141 = var41_39;
                                                                                    var78_143 = var42_41;
                                                                                    var79_144 = var46_49;
                                                                                    break block39;
                                                                                }
                                                                                var79_144 = var15_15;
                                                                                var15_15 = var28_26;
                                                                                var75_139 = var27_25;
                                                                                var62_86 /* !! */  = var26_24;
                                                                                var76_140 = var25_23;
                                                                                var14_14 = var36_34;
                                                                                var28_26 = var37_35;
                                                                                var27_25 = var38_36;
                                                                                var26_24 = var39_37;
                                                                                var77_141 = var41_39;
                                                                                var78_143 = var42_41;
                                                                            }
                                                                            var70_124 = var11_11;
                                                                            var11_11 = var12_12;
                                                                            var55_64 = var45_46 /* !! */ ;
                                                                            var36_34 = TransitionType.FADE_IN;
                                                                            var37_35 = var14_14;
                                                                            var14_14 = var36_34.getValue();
                                                                            var17_17 = (int)var40_38.equals(var14_14);
                                                                            if (var17_17 == 0) break block40;
                                                                            var42_41 = var1_1.getTransition().getDuration_out();
                                                                            var80_145 = Math.abs(var12_12 - var42_41);
                                                                            var38_36 = var14_14 = var1_1.getTransition().getType_out();
                                                                            var48_51 = var80_145 - var10_10;
                                                                            var25_23 = var7_7.fadeInOut(var48_51, var70_124, var42_41);
                                                                            var48_51 = var12_12 - var10_10;
                                                                            var17_17 = (int)var48_51;
                                                                            var81_147 = var12_12;
                                                                            var13_13 = this;
                                                                            var82_148 = var37_35;
                                                                            var40_38 = var14_14;
                                                                            var83_150 = var17_17;
                                                                            var14_14 = var1_1;
                                                                            var84_152 = var15_15;
                                                                            var58_70 = var2_2;
                                                                            var40_38 = var28_26;
                                                                            var28_26 = var25_23;
                                                                            var25_23 = var27_25;
                                                                            var61_80 = var17_17;
                                                                            var55_64 = var26_24;
                                                                            var26_24 = var4_4;
                                                                            var37_35 = var40_38;
                                                                            var40_38 = var27_25;
                                                                            var25_23 = var3_3;
                                                                            var13_13 = this.generateVideoSegment(var1_1, var2_2, (String)var28_26, var17_17, var4_4, var3_3);
                                                                            if (var13_13 != null) {
                                                                                var9_9.add(var24_22);
                                                                                var9_9.add(var13_13);
                                                                                var64_92 = var8_8 + 1;
                                                                                var13_13 = var7_7.overlay.append((String)var23_21).append(var64_92).append((String)var16_16).append((String)var55_64).append(var10_10).append((String)var27_25);
                                                                                var26_24 = var37_35;
                                                                                var13_13 = var13_13.append((String)var37_35).append(var64_92);
                                                                                var55_64 = var45_46 /* !! */ ;
                                                                                var13_13.append((String)var45_46 /* !! */ );
                                                                                var13_13 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                var14_14 = var38_36;
                                                                                var22_20 = (long)var38_36.equals(var13_13);
                                                                                if (var22_20 != false) {
                                                                                    var65_99 = 0.0f;
                                                                                    var26_24 = null;
                                                                                    var66_107 = 1065353216;
                                                                                    var67_112 = 1.0f;
                                                                                    var13_13 = this;
                                                                                    var48_51 = var80_145;
                                                                                    var47_50 = var42_41;
                                                                                    var49_52 = var29_27;
                                                                                    var68_116 = var33_31;
                                                                                    var69_122 = var64_92;
                                                                                    var64_92 = var66_107;
                                                                                    var70_124 = var67_112;
                                                                                    var13_13 = this.slideX(var80_145, var42_41, var29_27, var33_31, 0.0f, var67_112);
                                                                                } else {
                                                                                    var69_122 = var64_92;
                                                                                    var13_13 = TransitionType.SLIDE_TO_LEFT.getValue();
                                                                                    var22_20 = (long)var38_36.equals(var13_13);
                                                                                    if (var22_20 != false) {
                                                                                        var65_99 = 0.0f;
                                                                                        var26_24 = null;
                                                                                        var64_92 = -1082130432;
                                                                                        var70_124 = -1.0f;
                                                                                        var13_13 = this;
                                                                                        var48_51 = var80_145;
                                                                                        var47_50 = var42_41;
                                                                                        var49_52 = var29_27;
                                                                                        var68_116 = var33_31;
                                                                                        var13_13 = this.slideX(var80_145, var42_41, var29_27, var33_31, 0.0f, var70_124);
                                                                                    } else {
                                                                                        var14_14 = "";
                                                                                        var13_13 = new StringBuilder((String)var14_14);
                                                                                        var68_116 = var29_27;
                                                                                        var13_13 = var13_13.append(var29_27).toString();
                                                                                    }
                                                                                }
                                                                                var14_14 = var7_7.overlay;
                                                                                var28_26 = var79_144;
                                                                                var14_14 = var14_14.append((String)var79_144).append(var8_8);
                                                                                var15_15 = var77_141;
                                                                                var14_14 = var14_14.append(var77_141).append(var69_122);
                                                                                var15_15 = var62_86 /* !! */ ;
                                                                                var13_13 = var14_14.append(var62_86 /* !! */ ).append((String)var13_13);
                                                                                var14_14 = var82_148;
                                                                                var13_13 = var13_13.append((String)var82_148);
                                                                                var48_51 = var78_143;
                                                                                var13_13 = var13_13.append(var78_143);
                                                                                var14_14 = var75_139;
                                                                                var13_13 = var13_13.append((String)var75_139).append(var10_10);
                                                                                var27_25 = var84_152;
                                                                                var13_13 = var13_13.append((String)var84_152);
                                                                                var65_99 = var81_147;
                                                                                var13_13 = var13_13.append(var81_147);
                                                                                var25_23 = var76_140;
                                                                                var13_13 = var13_13.append(var76_140).append(var69_122);
                                                                                var13_13.append((String)var55_64);
                                                                                var72_132 = 1;
                                                                                var73_133 = 1.4E-45f;
                                                                            } else {
                                                                                var55_64 = var45_46 /* !! */ ;
                                                                                var15_15 = var62_86 /* !! */ ;
                                                                                var25_23 = var76_140;
                                                                                var14_14 = var75_139;
                                                                                var28_26 = var79_144;
                                                                                var65_99 = var12_12;
                                                                                var27_25 = var84_152;
                                                                                var69_122 = var8_8;
                                                                                var72_132 = 0;
                                                                                var73_133 = 0.0f;
                                                                                var74_135 = null;
                                                                            }
                                                                            var53_58 = var28_26;
                                                                            var28_26 = var15_15;
                                                                            var15_15 = var27_25;
                                                                            var68_116 = var65_99;
                                                                            var26_24 = var25_23;
                                                                            var25_23 = var53_58;
                                                                            break block38;
                                                                        }
                                                                        var85_153 = var15_15;
                                                                        var14_14 = var40_38;
                                                                        var36_34 = var37_35;
                                                                        var15_15 = var77_141;
                                                                        var40_38 = var27_25;
                                                                        var55_64 = var26_24;
                                                                        var68_116 = var29_27;
                                                                        var26_24 = var28_26;
                                                                        var28_26 = var79_144;
                                                                        var30_28 /* !! */  = TransitionType.SLIDE_TO_RIGHT;
                                                                        var41_39 = var77_141;
                                                                        var15_15 = var30_28 /* !! */ .getValue();
                                                                        var58_71 = var14_14.equals(var15_15);
                                                                        if (var58_71 == 0) break block41;
                                                                        var48_51 = var1_1.getTransition().getDuration_out();
                                                                        var47_50 = Math.abs(var12_12 - var48_51) - var10_10;
                                                                        var30_28 /* !! */  = var7_7.fadeInOut(var47_50, var70_124, var48_51);
                                                                        var58_71 = (int)(var12_12 - var10_10);
                                                                        var48_51 = var12_12;
                                                                        var13_13 = this;
                                                                        var14_14 = var1_1;
                                                                        var86_154 = var58_71;
                                                                        var58_71 = var2_2;
                                                                        var28_26 = var30_28 /* !! */ ;
                                                                        var61_81 = var86_154;
                                                                        var87_155 = var26_24;
                                                                        var26_24 = var4_4;
                                                                        var51_55 = var70_124;
                                                                        var25_23 = var3_3;
                                                                        var13_13 = this.generateVideoSegment(var1_1, var2_2, var30_28 /* !! */ , var86_154, var4_4, var3_3);
                                                                        if (var13_13 == null) break block42;
                                                                        var9_9.add(var24_22);
                                                                        var9_9.add(var13_13);
                                                                        var64_93 = var8_8 + 1;
                                                                        var13_13 = var7_7.overlay.append((String)var23_21).append(var64_93).append((String)var16_16).append((String)var55_64).append(var10_10).append((String)var27_25);
                                                                        var26_24 = var87_155;
                                                                        var13_13 = var13_13.append((String)var87_155).append(var64_93);
                                                                        var55_64 = var45_46 /* !! */ ;
                                                                        var13_13.append((String)var45_46 /* !! */ );
                                                                        var65_100 = -1.0f;
                                                                        var66_108 = false;
                                                                        var67_113 = 0.0f;
                                                                        var16_16 = null;
                                                                        var13_13 = this;
                                                                        var48_51 = var10_10;
                                                                        var47_50 = var70_124;
                                                                        var49_52 = var29_27;
                                                                        var68_116 = var33_31;
                                                                        var69_122 = var64_93;
                                                                        var64_93 = 0;
                                                                        var70_124 = 0.0f;
                                                                        var13_13 = this.slideX(var10_10, var51_55, var29_27, var33_31, var65_100, 0.0f);
                                                                        var14_14 = var7_7.overlay;
                                                                        var25_23 = var79_144;
                                                                        var14_14 = var14_14.append((String)var79_144).append(var8_8);
                                                                        var27_25 = var77_141;
                                                                        var14_14 = var14_14.append(var77_141).append(var69_122);
                                                                        var28_26 = var62_86 /* !! */ ;
                                                                        var13_13 = var14_14.append(var62_86 /* !! */ ).append((String)var13_13);
                                                                        var15_15 = var37_35;
                                                                        var13_13 = var13_13.append((String)var37_35);
                                                                        var48_51 = var78_143;
                                                                        var13_13 = var13_13.append(var78_143);
                                                                        var14_14 = var75_139;
                                                                        var13_13 = var13_13.append((String)var75_139).append(var10_10);
                                                                        var15_15 = var85_153;
                                                                        var13_13 = var13_13.append((String)var85_153);
                                                                        var68_116 = var12_12;
                                                                        var13_13 = var13_13.append(var12_12);
                                                                        var26_24 = var76_140;
                                                                        var13_13 = var13_13.append(var76_140).append(var69_122);
                                                                        var13_13.append((String)var45_46 /* !! */ );
                                                                        break block43;
                                                                    }
                                                                    var26_24 = var76_140;
                                                                    var28_26 = var62_86 /* !! */ ;
                                                                    var14_14 = var75_139;
                                                                    var15_15 = var85_153;
                                                                    var55_64 = var45_46 /* !! */ ;
                                                                    var68_116 = var12_12;
                                                                    var25_23 = var79_144;
                                                                    break block44;
                                                                }
                                                                var51_56 = var70_124;
                                                                var15_15 = var37_35;
                                                                var27_25 = var77_141;
                                                                var25_23 = var79_144;
                                                                var28_26 = var62_86 /* !! */ ;
                                                                var36_34 = TransitionType.SLIDE_TO_LEFT;
                                                                var82_149 = var37_35;
                                                                var15_15 = var36_34.getValue();
                                                                var17_17 = (int)var14_14.equals(var15_15);
                                                                if (var17_17 == 0) break block45;
                                                                var48_51 = var1_1.getTransition().getDuration_out();
                                                                var47_50 = Math.abs(var12_12 - var48_51) - var10_10;
                                                                var38_36 = var40_38;
                                                                var42_41 = var70_124;
                                                                var36_34 = var7_7.fadeInOut(var47_50, var70_124, var48_51);
                                                                var58_71 = (int)(var12_12 - var10_10);
                                                                var48_51 = var12_12;
                                                                var13_13 = this;
                                                                var14_14 = var1_1;
                                                                var83_151 = var58_71;
                                                                var58_71 = var2_2;
                                                                var28_26 = var36_34;
                                                                var61_82 = var83_151;
                                                                var40_38 = var26_24;
                                                                var26_24 = var4_4;
                                                                var25_23 = var3_3;
                                                                var13_13 = this.generateVideoSegment(var1_1, var2_2, (String)var36_34, var83_151, var4_4, var3_3);
                                                                if (var13_13 == null) break block46;
                                                                var9_9.add(var24_22);
                                                                var9_9.add(var13_13);
                                                                var64_94 = var8_8 + 1;
                                                                var13_13 = var7_7.overlay.append((String)var23_21).append(var64_94).append((String)var16_16).append((String)var55_64).append(var10_10);
                                                                var26_24 = var38_36;
                                                                var13_13 = var13_13.append((String)var38_36).append((String)var40_38).append(var64_94);
                                                                var55_64 = var45_46 /* !! */ ;
                                                                var13_13.append((String)var45_46 /* !! */ );
                                                                var65_101 = 1.0f;
                                                                var66_109 = false;
                                                                var67_114 = 0.0f;
                                                                var16_16 = null;
                                                                var13_13 = this;
                                                                var48_51 = var10_10;
                                                                var47_50 = var70_124;
                                                                var49_52 = var29_27;
                                                                var68_116 = var33_31;
                                                                var69_122 = var64_94;
                                                                var64_94 = 0;
                                                                var70_124 = 0.0f;
                                                                var13_13 = this.slideX(var10_10, var51_56, var29_27, var33_31, var65_101, 0.0f);
                                                                var14_14 = var7_7.overlay;
                                                                var25_23 = var79_144;
                                                                var14_14 = var14_14.append((String)var79_144).append(var8_8).append(var77_141).append(var69_122);
                                                                var28_26 = var62_86 /* !! */ ;
                                                                var13_13 = var14_14.append(var62_86 /* !! */ ).append((String)var13_13);
                                                                var15_15 = var37_35;
                                                                var13_13 = var13_13.append((String)var37_35);
                                                                var48_51 = var78_143;
                                                                var13_13 = var13_13.append(var78_143);
                                                                var14_14 = var75_139;
                                                                var13_13 = var13_13.append((String)var75_139).append(var10_10);
                                                                var15_15 = var85_153;
                                                                var13_13 = var13_13.append((String)var85_153);
                                                                var68_116 = var12_12;
                                                                var13_13 = var13_13.append(var12_12);
                                                                var26_24 = var76_140;
                                                                var13_13 = var13_13.append(var76_140).append(var69_122);
                                                                var13_13.append((String)var45_46 /* !! */ );
                                                            }
                                                            var72_132 = 1;
                                                            var73_133 = 1.4E-45f;
                                                            break block38;
                                                        }
                                                        var26_24 = var76_140;
                                                        var14_14 = var75_139;
                                                        var15_15 = var85_153;
                                                        var55_64 = var45_46 /* !! */ ;
                                                        var68_116 = var12_12;
                                                        var28_26 = var62_86 /* !! */ ;
                                                        var25_23 = var79_144;
                                                        break block44;
                                                    }
                                                    var68_116 = var12_12;
                                                    var26_24 = var76_140;
                                                    var14_14 = var75_139;
                                                    var15_15 = var85_153;
                                                    var55_64 = var45_46 /* !! */ ;
                                                }
                                                var69_122 = var8_8;
                                                var72_132 = 0;
                                                var73_133 = 0.0f;
                                                var74_136 = null;
                                            }
                                            var9_9 = var15_15;
                                            var15_15 = var28_26;
                                            var16_16 = var26_24;
                                            var26_24 = var55_64;
                                            var88_156 = var24_22;
                                            var89_157 = var72_132;
                                            var42_41 = var73_133;
                                            var12_12 = var68_116;
                                            var27_25 = var35_33;
                                            var53_58 = var25_23;
                                            var25_23 = var14_14;
                                            var48_51 = var10_10;
                                            var90_158 = var53_58;
                                            break block47;
                                        }
                                        var91_159 /* !! */  = var14_14;
                                        var92_160 = var28_26;
                                        var14_14 = var27_25;
                                        var28_26 = var26_24;
                                        var93_161 = var25_23;
                                        var27_25 = var40_38;
                                        var26_24 = var38_36;
                                        var25_23 = var15_15;
                                        var42_42 = var12_12;
                                        var15_15 = var36_34;
                                        var55_65 = var39_37;
                                        if (var32_30 == 0) break block48;
                                        var11_11 = var1_1.getTransition().getDuration_in();
                                        var33_31 = var1_1.getBtm_x();
                                        var12_12 = var1_1.getBtm_y();
                                        var36_34 = var1_1.getTransition();
                                        var80_146 = var36_34.getFromW();
                                        var38_36 = var1_1.getTransition();
                                        var94_162 = var12_12;
                                        var55_65 = var38_36.getType_in();
                                        var60_77 = var14_14;
                                        var30_28 /* !! */  = var55_65;
                                        var95_163 = true;
                                        var12_12 = 1.4E-45f;
                                        var74_137 = var7_7.mFadeFilter(0.0f, var11_11, var95_163);
                                        var48_51 = var42_42 - var10_10;
                                        var17_17 = (int)var48_51;
                                        var96_166 = var11_11;
                                        var13_13 = this;
                                        var55_65 = var14_14;
                                        var14_14 = var1_1;
                                        var97_168 = var15_15;
                                        var58_72 = var2_2;
                                        var54_62 = var42_42;
                                        var40_38 = var28_26;
                                        var28_26 = var74_137;
                                        var55_65 = var27_25;
                                        var61_83 = var17_17;
                                        var62_87 = var40_38;
                                        var40_38 = var26_24;
                                        var26_24 = var4_4;
                                        var77_142 = var27_25;
                                        var55_65 = var25_23;
                                        var25_23 = var3_3;
                                        var13_13 = this.generateVideoSegment(var1_1, var2_2, (String)var74_137, var17_17, var4_4, var3_3);
                                        if (var13_13 != null) {
                                            var9_9.add(var24_22);
                                            var9_9.add(var13_13);
                                            var64_95 = var8_8 + 1;
                                            var13_13 = var7_7.overlay.append((String)var23_21).append(var64_95).append((String)var16_16);
                                            var26_24 = var39_37;
                                            var13_13 = var13_13.append(var39_37).append(var10_10).append((String)var40_38);
                                            var27_25 = var37_35;
                                            var13_13 = var13_13.append((String)var37_35).append(var64_95);
                                            var16_16 = var91_159 /* !! */ ;
                                            var13_13.append((String)var91_159 /* !! */ );
                                            var13_13 = TransitionType.FADE_IN.getValue();
                                            var14_14 = var30_28 /* !! */ ;
                                            var22_20 = (long)var30_28 /* !! */ .equals(var13_13);
                                            if (var22_20 != false) {
                                                var13_13 = var7_7.overlay.append((String)var55_65).append(var8_8);
                                                var23_21 = var77_142;
                                                var13_13 = var13_13.append((String)var77_142).append(var64_95);
                                                var40_38 = var62_87;
                                                var13_13 = var13_13.append((String)var62_87);
                                                var49_52 = var33_31;
                                                var13_13 = var13_13.append(var33_31);
                                                var26_24 = var35_33;
                                                var13_13 = var13_13.append((String)var35_33);
                                                var68_117 = var94_162;
                                                var13_13 = var13_13.append(var94_162);
                                                var15_15 = var60_77;
                                                var13_13 = var13_13.append((String)var60_77).append(var10_10);
                                                var14_14 = var92_160;
                                                var13_13 = var13_13.append((String)var92_160);
                                                var49_52 = var42_42;
                                                var13_13 = var13_13.append(var42_42);
                                                var27_25 = var93_161;
                                                var13_13 = var13_13.append(var93_161).append(var64_95);
                                                var13_13.append((String)var91_159 /* !! */ );
                                                var98_169 = var35_33;
                                                var99_171 = var64_95;
                                                var74_137 = var24_22;
                                                var25_23 = var92_160;
                                                var24_22 = var60_77;
                                                var15_15 = var93_161;
lbl679:
                                                // 2 sources

                                                while (true) {
                                                    var14_14 = var16_16;
                                                    break;
                                                }
                                            } else {
                                                var49_52 = var33_31;
                                                var26_24 = var35_33;
                                                var68_118 = var94_162;
                                                var11_11 = var42_42;
                                                var15_15 = var60_77;
                                                var40_38 = var62_87;
                                                var23_21 = var77_142;
                                                var30_28 /* !! */  = TransitionType.SLIDE_TO_RIGHT;
                                                var13_13 = var30_28 /* !! */ .getValue();
                                                var22_20 = (long)var14_14.equals(var13_13);
                                                if (var22_20 != false) {
                                                    var29_27 = -1.0f;
                                                    var32_30 = 0;
                                                    var33_31 = 0.0f;
                                                    var31_29 = null;
                                                    var48_51 = var42_42;
                                                    var13_13 = this;
                                                    var48_51 = var10_10;
                                                    var47_50 = var96_166;
                                                    var68_118 = var80_146;
                                                    var98_169 = var35_33;
                                                    var65_102 = var29_27;
                                                    var99_171 = var64_95;
                                                    var64_95 = 0;
                                                    var70_125 = 0.0f;
                                                    var13_13 = this.slideX(var10_10, var96_166, var49_52, var80_146, var29_27, 0.0f);
                                                    var14_14 = var7_7.overlay.append((String)var55_65).append(var8_8).append((String)var77_142).append(var99_171).append((String)var62_87);
                                                    var13_13 = var14_14.append((String)var13_13);
                                                    var25_23 = var97_168;
                                                    var13_13 = var13_13.append((String)var97_168);
                                                    var65_102 = var94_162;
                                                    var13_13 = var13_13.append(var94_162);
                                                    var27_25 = var60_77;
                                                    var13_13 = var13_13.append((String)var60_77).append(var10_10);
                                                    var15_15 = var92_160;
                                                    var13_13 = var13_13.append((String)var92_160);
                                                    var48_51 = var42_42;
                                                    var13_13 = var13_13.append(var42_42);
                                                    var28_26 = var93_161;
                                                    var13_13 = var13_13.append(var93_161).append(var99_171);
                                                    var13_13.append((String)var91_159 /* !! */ );
                                                    var25_23 = var92_160;
                                                    var15_15 = var93_161;
                                                    var74_137 = var24_22;
                                                    var49_52 = var42_42;
                                                    var24_22 = var60_77;
                                                    ** continue;
                                                }
                                                var98_169 = var35_33;
                                                var99_171 = var64_95;
                                                var25_23 = var97_168;
                                                var65_103 = var94_162;
                                                var27_25 = var60_77;
                                                var15_15 = var92_160;
                                                var30_28 /* !! */  = TransitionType.SLIDE_TO_LEFT;
                                                var13_13 = var30_28 /* !! */ .getValue();
                                                var22_20 = (long)var14_14.equals(var13_13);
                                                if (var22_20 != false) {
                                                    var29_27 = 1.0f;
                                                    var32_30 = 0;
                                                    var33_31 = 0.0f;
                                                    var31_29 = null;
                                                    var48_51 = var42_42;
                                                    var13_13 = this;
                                                    var48_51 = var10_10;
                                                    var47_50 = var96_166;
                                                    var68_118 = var80_146;
                                                    var74_137 = var24_22;
                                                    var100_173 = var94_162;
                                                    var65_103 = var29_27;
                                                    var45_47 /* !! */  = var91_159 /* !! */ ;
                                                    var16_16 = var97_168;
                                                    var64_95 = 0;
                                                    var70_126 = 0.0f;
                                                    var13_13 = this.slideX(var10_10, var96_166, var49_52, var80_146, var29_27, 0.0f);
                                                    var13_13 = var7_7.overlay.append((String)var55_65).append(var8_8).append((String)var77_142).append(var99_171).append((String)var62_87).append((String)var13_13).append((String)var97_168).append(var94_162);
                                                    var24_22 = var60_77;
                                                    var13_13 = var13_13.append((String)var60_77).append(var10_10);
                                                    var25_23 = var92_160;
                                                    var13_13 = var13_13.append((String)var92_160);
                                                    var49_52 = var42_42;
                                                    var13_13 = var13_13.append(var42_42);
                                                    var15_15 = var93_161;
                                                    var13_13 = var13_13.append(var93_161).append(var99_171);
                                                    var14_14 = var91_159 /* !! */ ;
                                                    var13_13.append((String)var91_159 /* !! */ );
                                                } else {
                                                    var25_23 = var92_160;
                                                    var14_14 = var91_159 /* !! */ ;
                                                    var74_137 = var24_22;
                                                    var49_52 = var42_42;
                                                    var15_15 = var93_161;
                                                    var24_22 = var60_77;
                                                }
                                            }
                                            var101_175 = 1;
                                            var44_45 = 1.4E-45f;
                                        } else {
                                            var74_137 = var24_22;
                                            var98_169 = var35_33;
                                            var49_52 = var42_42;
                                            var24_22 = var60_77;
                                            var40_38 = var62_87;
                                            var15_15 = var93_161;
                                            var25_23 = var92_160;
                                            var14_14 = var91_159 /* !! */ ;
                                            var99_171 = var8_8;
                                            var101_175 = 0;
                                            var44_45 = 0.0f;
                                        }
                                        var26_24 = var14_14;
                                        var16_16 = var15_15;
                                        var69_122 = var99_171;
                                        var48_51 = var10_10;
                                        var90_158 = var55_65;
                                        var15_15 = var40_38;
                                        var88_156 = var74_137;
                                        var89_157 = var101_175;
                                        var42_42 = var44_45;
                                        var27_25 = var98_169;
                                        var12_12 = var49_52;
                                        var9_9 = var25_23;
                                        var25_23 = var24_22;
                                        break block47;
                                    }
                                    var60_78 /* !! */  = var14_14;
                                    var14_14 = var40_38;
                                    var9_9 = var16_16;
                                    var74_138 /* !! */  = var24_22;
                                    var98_170 = var35_33;
                                    var27_25 = var37_35;
                                    var15_15 = var93_161;
                                    var16_16 = var91_159 /* !! */ ;
                                    var24_22 = var28_26;
                                    var49_52 = var12_12;
                                    var40_38 = var38_36;
                                    var26_24 = var39_37;
                                    var55_65 = var25_23;
                                    var25_23 = var92_160;
                                    if (var22_20 == false) break block49;
                                    var11_11 = var1_1.getTransition().getDuration_out();
                                    var29_27 = Math.abs(var12_12 - var11_11);
                                    var62_88 = var28_26;
                                    var100_174 = var1_1.getBtm_x();
                                    var56_67 = var55_65;
                                    var12_12 = var1_1.getBtm_y();
                                    var31_29 = var1_1.getTransition();
                                    var33_31 = var31_29.getFromW();
                                    var35_33 = var1_1.getTransition();
                                    var71_131 = var12_12;
                                    var55_65 = var35_33.getType_out();
                                    var41_40 = var14_14;
                                    var17_17 = (int)(var42_42 - var10_10);
                                    var63_90 = var93_161;
                                    var47_50 = (float)var17_17 - var11_11;
                                    var102_176 = var17_17;
                                    var17_17 = 0;
                                    var48_51 = 0.0f;
                                    var38_36 = var7_7.mFadeFilter(var47_50, var11_11, false);
                                    var13_13 = this;
                                    var15_15 = var14_14;
                                    var14_14 = var1_1;
                                    var58_73 = var2_2;
                                    var103_177 = var42_42;
                                    var28_26 = var38_36;
                                    var96_167 = var100_174;
                                    var24_22 = var37_35;
                                    var61_84 = var102_176;
                                    var45_48 /* !! */  = var91_159 /* !! */ ;
                                    var16_16 = var39_37;
                                    var26_24 = var4_4;
                                    var25_23 = var3_3;
                                    var13_13 = this.generateVideoSegment(var1_1, var2_2, (String)var38_36, var102_176, var4_4, var3_3);
                                    if (var13_13 == null) break block50;
                                    var25_23 = var5_5;
                                    var26_24 = var74_138 /* !! */ ;
                                    var5_5.add(var74_138 /* !! */ );
                                    var5_5.add(var13_13);
                                    var61_84 = var8_8 + 1;
                                    var13_13 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                    var22_20 = (long)var55_65.equals(var13_13);
                                    var28_26 = ")'";
                                    if (var22_20 != false) {
                                        var13_13 = var7_7.overlay.append((String)var23_21).append(var61_84).append((String)var9_9).append(var39_37).append(var10_10).append((String)var40_38).append((String)var37_35).append(var61_84);
                                        var9_9 = var91_159 /* !! */ ;
                                        var13_13.append((String)var91_159 /* !! */ );
                                        var95_164 = false;
                                        var66_110 = 1065353216;
                                        var67_115 = 1.0f;
                                        var13_13 = this;
                                        var48_51 = var29_27;
                                        var47_50 = var11_11;
                                        var23_21 = var28_26;
                                        var49_52 = var100_174;
                                        var89_157 = var61_84;
                                        var68_119 = var33_31;
                                        var24_22 = var74_138 /* !! */ ;
                                        var65_104 = 0.0f;
                                        var55_65 = var5_5;
                                        var64_96 = var66_110;
                                        var70_127 = var67_115;
                                        var13_13 = this.slideX(var29_27, var11_11, var100_174, var33_31, 0.0f, var67_115);
                                        var14_14 = var7_7.overlay;
                                        var25_23 = var56_67;
                                        var14_14 = var14_14.append(var56_67).append(var8_8);
                                        var26_24 = var41_40;
                                        var14_14 = var14_14.append((String)var41_40).append(var61_84);
                                        var27_25 = var62_88;
                                        var13_13 = var14_14.append((String)var62_88).append((String)var13_13);
                                        var28_26 = var36_34;
                                        var13_13 = var13_13.append((String)var36_34);
                                        var47_50 = var12_12;
                                        var13_13 = var13_13.append(var12_12);
                                        var14_14 = var60_78 /* !! */ ;
                                        var13_13 = var13_13.append((String)var60_78 /* !! */ ).append(var10_10);
                                        var15_15 = var92_160;
                                        var13_13 = var13_13.append((String)var92_160);
                                        var49_52 = var42_42;
                                        var13_13 = var13_13.append(var42_42).append((String)var23_21).append(var56_67).append(var61_84);
                                        var13_13.append((String)var91_159 /* !! */ );
                                        var12_12 = var42_42;
                                        var26_24 = var91_159 /* !! */ ;
                                        var22_20 = var61_84;
                                        var88_156 = var74_138 /* !! */ ;
                                        var16_16 = var93_161;
                                        var9_9 = var92_160;
                                        var15_15 = var62_88;
                                        var27_25 = var98_170;
                                        var53_59 = var56_67;
                                        var25_23 = var60_78 /* !! */ ;
                                        var48_51 = var10_10;
                                        var90_158 = var56_67;
                                    } else {
                                        var104_178 = var28_26;
                                        var88_156 = var74_138 /* !! */ ;
                                        var13_13 = var5_5;
                                        var28_26 = var36_34;
                                        var47_50 = var12_12;
                                        var26_24 = var91_159 /* !! */ ;
                                        var14_14 = var60_78 /* !! */ ;
                                        var64_97 = var61_84;
                                        var27_25 = var62_88;
                                        var74_138 /* !! */  = TransitionType.SLIDE_TO_LEFT;
                                        var13_13 = var74_138 /* !! */ .getValue();
                                        var22_20 = (long)var55_65.equals(var13_13);
                                        if (var22_20 != false) {
                                            var7_7.overlay.append((String)var23_21).append(var61_84).append((String)var9_9).append(var39_37).append(var10_10).append((String)var40_38).append((String)var37_35).append(var61_84).append((String)var91_159 /* !! */ );
                                            var95_165 = -1082130432;
                                            var16_16 = var5_5;
                                            var13_13 = this;
                                            var23_21 = var60_78 /* !! */ ;
                                            var48_51 = var29_27;
                                            var42_42 = var12_12;
                                            var47_50 = var11_11;
                                            var24_22 = var36_34;
                                            var49_52 = var100_174;
                                            var68_120 = var33_31;
                                            var16_16 = var41_40;
                                            var65_105 = 0.0f;
                                            var99_172 = var61_84;
                                            var29_27 = var10_10;
                                            var90_158 = var56_67;
                                            var64_97 = var95_165;
                                            var70_128 = -1.0f;
                                            var13_13 = this.slideX(var48_51, var11_11, var100_174, var33_31, 0.0f, var70_128);
                                            var14_14 = var7_7.overlay.append(var56_67).append(var8_8).append((String)var41_40).append(var61_84);
                                            var15_15 = var62_88;
                                            var14_14 = var14_14.append((String)var62_88);
                                            var13_13 = var14_14.append((String)var13_13).append((String)var36_34).append(var12_12).append((String)var60_78 /* !! */ );
                                            var48_51 = var10_10;
                                            var13_13 = var13_13.append(var10_10);
                                            var28_26 = var92_160;
                                            var13_13 = var13_13.append((String)var92_160);
                                            var68_120 = var103_177;
                                            var13_13 = var13_13.append(var103_177);
                                            var26_24 = var104_178;
                                            var13_13 = var13_13.append((String)var104_178).append(var56_67).append(var61_84);
                                            var26_24 = var91_159 /* !! */ ;
                                            var13_13.append((String)var91_159 /* !! */ );
                                            var12_12 = var103_177;
                                            var22_20 = var61_84;
                                            var25_23 = var60_78 /* !! */ ;
                                            var27_25 = var98_170;
                                            var16_16 = var93_161;
                                            var9_9 = var92_160;
                                        } else {
                                            var28_26 = var60_78 /* !! */ ;
                                            var22_20 = var61_84;
                                            var48_51 = var10_10;
                                            var90_158 = var56_67;
                                            var54_63 = var42_42;
                                            var59_75 = var92_160;
                                            var70_129 = var12_12;
                                            var15_15 = var62_88;
                                            var27_25 = var39_37;
                                            var16_16 = var41_40;
                                            var30_28 /* !! */  = TransitionType.FADE_OUT;
                                            var28_26 = var30_28 /* !! */ .getValue();
                                            var105_179 = var55_65.equals(var28_26);
                                            if (var105_179) {
                                                var7_7.overlay.append((String)var23_21).append(var61_84).append((String)var9_9).append(var39_37).append(var10_10).append((String)var40_38).append((String)var37_35).append(var61_84).append((String)var91_159 /* !! */ );
                                                var28_26 = var7_7.overlay.append(var56_67).append(var8_8).append((String)var41_40).append(var61_84).append((String)var62_88);
                                                var68_121 = var100_174;
                                                var28_26 = var28_26.append(var100_174);
                                                var27_25 = var98_170;
                                                var28_26 = var28_26.append(var98_170).append(var12_12);
                                                var25_23 = var60_78 /* !! */ ;
                                                var28_26 = var28_26.append((String)var60_78 /* !! */ ).append(var10_10);
                                                var9_9 = var92_160;
                                                var28_26 = var28_26.append((String)var92_160);
                                                var12_12 = var42_42;
                                                var28_26 = var28_26.append(var42_42);
                                                var16_16 = var93_161;
                                                var28_26 = var28_26.append(var93_161).append(var61_84);
                                                var28_26.append((String)var91_159 /* !! */ );
                                            } else {
                                                var12_12 = var42_42;
                                                var9_9 = var92_160;
                                                var25_23 = var60_78 /* !! */ ;
                                                var27_25 = var98_170;
                                                var16_16 = var93_161;
                                            }
                                        }
                                    }
                                    var69_122 = (int)var22_20;
                                    var89_157 = 1;
                                    var42_42 = 1.4E-45f;
                                    break block47;
                                }
                                var48_51 = var10_10;
                                var88_156 = var74_138 /* !! */ ;
                                var26_24 = var91_159 /* !! */ ;
                                var90_158 = var56_67;
                                var25_23 = var60_78 /* !! */ ;
                                var15_15 = var62_88;
                                var27_25 = var98_170;
                                var16_16 = var93_161;
                                var12_12 = var42_42;
                                var9_9 = var92_160;
                                break block51;
                            }
                            var9_9 = var92_160;
                            var48_51 = var10_10;
                            var90_158 = var55_65;
                            var26_24 = var91_159 /* !! */ ;
                            var88_156 = var74_138 /* !! */ ;
                            var25_23 = var60_78 /* !! */ ;
                            var27_25 = var35_33;
                            var16_16 = var93_161;
                            var15_15 = var28_26;
                            break block51;
                        }
                        var9_9 = var28_26;
                        var34_32 = var16_16;
                        var88_156 = var24_22;
                        var16_16 = var25_23;
                        var25_23 = var27_25;
                        var27_25 = var23_21;
                        var53_60 = var26_24;
                        var26_24 = var14_14;
                        var48_51 = var10_10;
                        var90_158 = var15_15;
                        var15_15 = var53_60;
                    }
                    var69_122 = var8_8;
                    var89_157 = 0;
                    var42_42 = 0.0f;
                    var40_38 = null;
                }
                if (var89_157 == 0) {
                    var13_13 = var5_5;
                    var28_26 = var88_156;
                    var5_5.add(var88_156);
                    var28_26 = new StringBuilder();
                    var106_180 = var7_7.mTemplate.getFolder_template();
                    var28_26 = var28_26.append(var106_180);
                    var106_180 = var34_32;
                    var28_26 = var28_26.append(var34_32);
                    var106_180 = var1_1.getFile();
                    var28_26 = var28_26.append(var106_180).toString();
                    var5_5.add(var28_26);
                    var22_20 = var69_122 + 1;
                    var28_26 = var7_7.overlay.append((String)var90_158).append(var69_122);
                    var106_180 = "][";
                    var15_15 = var28_26.append(var106_180).append((int)var22_20).append((String)var15_15);
                    var49_52 = var1_1.getBtm_x();
                    var15_15 = var15_15.append(var49_52).append((String)var27_25);
                    var49_52 = var1_1.getBtm_y();
                    var14_14 = var15_15.append(var49_52).append((String)var25_23).append(var48_51).append((String)var9_9);
                    var47_50 = Math.abs(var12_12 -= var6_6);
                    var14_14.append(var47_50).append((String)var16_16).append((int)var22_20).append((String)var26_24);
                    var14_14 = var7_7.renderManager;
                    var15_15 = "basmal prerender";
                    var105_179 = false;
                    var49_52 = 0.0f;
                    var28_26 = null;
                    var14_14.addTask((String)var15_15, 0);
                    var14_14 = var7_7.renderManager;
                    var14_14.nextTask();
                    var4_4.countDown();
                    var69_122 = (int)var22_20;
                }
                break block52;
            }
            var69_122 = var8_8;
        }
        return var69_122;
    }

    private void cancelDialog() {
        boolean bl;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl = dialog.isShowing())) {
            dialog = this.dialog;
            dialog.dismiss();
        }
        this.dialog = null;
    }

    private void clearFFmpeg() {
        boolean bl;
        Iterator iterator = this.id_ffmpeg.iterator();
        while (bl = iterator.hasNext()) {
            Long l = (Long)iterator.next();
            long l2 = l;
            try {
                FFmpegKit.cancel((long)l2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void completeProgress() {
        this.isDestroy = true;
        Handler handler = this.uiHandler;
        ProgressViewActivity$6 progressViewActivity$6 = new ProgressViewActivity$6(this);
        handler.post((Runnable)progressViewActivity$6);
    }

    /*
     * Exception decompiling
     */
    private String concatVideoSegments(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[UNCONDITIONALDOLOOP]], but top level block is 20[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private File createTransparentBg(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void deleteDirectoryManually(File file) {
        boolean bl = file.isDirectory();
        if (bl) {
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File file2 : fileArray) {
                    boolean bl2 = file2.isDirectory();
                    if (bl2) {
                        this.deleteDirectoryManually(file2);
                        continue;
                    }
                    file2.delete();
                }
            }
            file.delete();
        }
    }

    private void deleteFolderWithCommonsIO(File file) {
        int n = Build.VERSION.SDK_INT;
        int n2 = 26;
        if (n >= n2) {
            try {
                FileUtils.deleteDirectory((File)file);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else {
            this.deleteDirectoryManually(file);
        }
    }

    private String fadeFilter(int n, float f, float f2, boolean bl) {
        String string2 = bl ? "in" : "out";
        StringBuilder stringBuilder = new StringBuilder("[");
        StringBuilder stringBuilder2 = stringBuilder.append(n).append("]fade=t=").append(string2).append(":st=").append(f).append(":d=");
        f2 = Math.abs(f2 - 0.05f);
        return stringBuilder2.append(f2).append(":alpha=1:color=white,fps=60,format=rgba[").append(string2).append("_").append(n).append("];").toString();
    }

    private String fadeFilter(String string2, float f, float f2, boolean bl) {
        String string3 = bl ? "in" : "out";
        StringBuilder stringBuilder = new StringBuilder("[");
        StringBuilder stringBuilder2 = stringBuilder.append(string2).append("]fade=t=").append(string3).append(":st=").append(f).append(":d=");
        f2 = Math.abs(f2 - 0.05f);
        return stringBuilder2.append(f2).append(":alpha=1:color=white,fps=60,format=rgba[").append(string3).append("_").append(string2).append("];").toString();
    }

    private String fadeFilter(String charSequence, int n, float f, float f2, boolean bl) {
        String string2 = bl ? "in" : "out";
        StringBuilder stringBuilder = new StringBuilder();
        charSequence = stringBuilder.append((String)charSequence).append("fade=t=").append(string2).append(":st=").append(f).append(":d=");
        f = Math.abs(f2 - 0.05f);
        return ((StringBuilder)charSequence).append(f).append(":alpha=1:color=white,fps=60,format=rgba[").append(string2).append("_").append(n).append("];").toString();
    }

    private String fadeInOut(float f, float f2, float f3) {
        float f4;
        int n;
        int n2 = 0;
        CharSequence charSequence = null;
        float f5 = f - 0.0f;
        float f6 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
        int n3 = 1008981770;
        float f7 = 0.01f;
        if (f6 <= 0) {
            f = f7;
        }
        f6 = 1028443341;
        float f8 = 0.05f;
        float f9 = f2 - f8;
        float f10 = f9 - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (f11 <= 0) {
            n = n3;
            f2 = f7;
        }
        if ((n2 = (f4 = (f8 = f3 - f8) - 0.0f) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1)) <= 0) {
            f3 = f7;
        }
        charSequence = new StringBuilder("fade=t=in:st=0:d=");
        f2 = Math.abs(f2);
        StringBuilder stringBuilder = charSequence.append(f2);
        charSequence = ":alpha=1:color=white,fps=";
        stringBuilder = stringBuilder.append((String)charSequence);
        f6 = this.mTemplate.getFps();
        stringBuilder = stringBuilder.append((int)f6).append(",format=rgba,fade=t=out:st=");
        f = Math.abs(f);
        StringBuilder stringBuilder2 = stringBuilder.append(f).append(":d=");
        f2 = Math.abs(f3);
        stringBuilder2 = stringBuilder2.append(f2).append((String)charSequence);
        n = this.mTemplate.getFps();
        return stringBuilder2.append(n).append(",format=rgba").toString();
    }

    private String generateVideoSegment(EntityBismilahTemplate object, int n, String object2, int n2, CountDownLatch object3, Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", n2);
        Serializable serializable = new StringBuilder();
        CharSequence charSequence = this.mTemplate.getFolder_template();
        String string2 = ((StringBuilder)serializable).append((String)charSequence).append("/bismilah_").append(n).append(".mov").toString();
        serializable = new ArrayList();
        serializable.add("-y");
        serializable.add("-loop");
        serializable.add("1");
        serializable.add("-i");
        charSequence = new StringBuilder();
        String string3 = this.mTemplate.getFolder_template();
        charSequence = ((StringBuilder)charSequence).append(string3);
        string3 = "/";
        charSequence = ((StringBuilder)charSequence).append(string3);
        object = ((EntityBismilahTemplate)object).getFile();
        object = ((StringBuilder)charSequence).append((String)object).toString();
        serializable.add(object);
        serializable.add("-vf");
        serializable.add(object2);
        serializable.add("-t");
        object = String.valueOf(Math.max(n2, 1));
        serializable.add(object);
        serializable.add("-c:v");
        serializable.add("qtrle");
        serializable.add("-pix_fmt");
        serializable.add("argb");
        serializable.add("-preset");
        serializable.add("veryfast");
        serializable.add("-avoid_negative_ts");
        serializable.add("make_zero");
        serializable.add(string2);
        object = null;
        try {
            semaphore.acquire();
        }
        catch (Exception exception) {
            this.renderManager.nextTask();
            ((CountDownLatch)object3).countDown();
            return null;
        }
        object2 = new String[]{};
        object2 = serializable.toArray((T[])object2);
        ProgressViewActivity$$ExternalSyntheticLambda1 progressViewActivity$$ExternalSyntheticLambda1 = new ProgressViewActivity$$ExternalSyntheticLambda1(this, (CountDownLatch)object3, semaphore);
        object3 = new ProgressViewActivity$$ExternalSyntheticLambda6(this);
        long l = FFmpegKit.executeWithArgumentsAsync((String[])object2, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda1, null, (StatisticsCallback)object3).getSessionId();
        object = this.id_ffmpeg;
        object2 = l;
        object.add(object2);
        return string2;
    }

    private String generateVideoSegment(EntityQuranTemplate object, int n, String object2, int n2, CountDownLatch object3, Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", n2);
        Serializable serializable = new StringBuilder();
        CharSequence charSequence = this.mTemplate.getFolder_template();
        String string2 = ((StringBuilder)serializable).append((String)charSequence).append("/ayah_").append(n).append(".mov").toString();
        serializable = new ArrayList();
        serializable.add("-y");
        serializable.add("-loop");
        serializable.add("1");
        serializable.add("-i");
        charSequence = new StringBuilder();
        String string3 = this.mTemplate.getFolder_template();
        charSequence = ((StringBuilder)charSequence).append(string3);
        string3 = "/";
        charSequence = ((StringBuilder)charSequence).append(string3);
        object = ((EntityQuranTemplate)object).getFile();
        object = ((StringBuilder)charSequence).append((String)object).toString();
        serializable.add(object);
        serializable.add("-vf");
        serializable.add(object2);
        serializable.add("-t");
        object = String.valueOf(Math.max(n2, 1));
        serializable.add(object);
        serializable.add("-c:v");
        serializable.add("qtrle");
        serializable.add("-pix_fmt");
        serializable.add("argb");
        serializable.add("-preset");
        serializable.add("veryfast");
        serializable.add("-avoid_negative_ts");
        serializable.add("make_zero");
        serializable.add(string2);
        object = null;
        try {
            semaphore.acquire();
        }
        catch (InterruptedException interruptedException) {
            this.renderManager.nextTask();
            ((CountDownLatch)object3).countDown();
            return null;
        }
        object2 = new String[]{};
        object2 = serializable.toArray((T[])object2);
        ProgressViewActivity$$ExternalSyntheticLambda2 progressViewActivity$$ExternalSyntheticLambda2 = new ProgressViewActivity$$ExternalSyntheticLambda2(this, (CountDownLatch)object3, semaphore);
        object3 = new ProgressViewActivity$$ExternalSyntheticLambda6(this);
        long l = FFmpegKit.executeWithArgumentsAsync((String[])object2, (FFmpegSessionCompleteCallback)progressViewActivity$$ExternalSyntheticLambda2, null, (StatisticsCallback)object3).getSessionId();
        object = this.id_ffmpeg;
        object2 = l;
        object.add(object2);
        return string2;
    }

    private String generateVideoTimer(int n, CountDownLatch object, Semaphore object2) {
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = this.mTemplate.getFolder_template();
        charSequence = charSequence.append((String)charSequence2);
        charSequence2 = "/timer.mov";
        charSequence = charSequence.append((String)charSequence2).toString();
        n /= 1000;
        int n2 = 1;
        n = Math.max(n, n2);
        this.renderManager.addTask("timer prerender", n);
        Object object3 = this.mTemplate.getmTimeModel();
        float f = ((TimeModel)object3).getPosXRight();
        String string2 = this.mTemplate.getmTimeModel().getColor();
        TimeModel timeModel = this.mTemplate.getmTimeModel();
        float f2 = timeModel.getSize();
        CharSequence charSequence3 = new StringBuilder();
        ArrayList<String> arrayList = this.getFilesDir().getAbsolutePath();
        charSequence3 = charSequence3.append((String)((Object)arrayList)).append("/NotoNaskhArabic.ttf").toString();
        arrayList = new ArrayList<String>();
        arrayList.add("-y");
        arrayList.add("-f");
        arrayList.add("lavfi");
        String string3 = "-i";
        arrayList.add(string3);
        boolean bl = ColorUtils.isColorDark(Color.parseColor((String)string2));
        string3 = bl ? "black@0" : "white@0";
        CharSequence charSequence4 = new StringBuilder("color=size=");
        float f3 = this.mTemplate.getmTimeModel().getWidth_bitmap_progress();
        float f4 = 1.3f;
        int n3 = Math.round(f3 *= f4);
        charSequence4 = charSequence4.append(n3).append("x");
        n3 = this.mTemplate.getmTimeModel().getHeight_bitmap_progress();
        charSequence4 = charSequence4.append(n3).append(":rate=10:duration=").append(n);
        String string4 = ":color=";
        string3 = charSequence4.append(string4).append(string3).append(",format=rgba").toString();
        arrayList.add(string3);
        n += n2;
        charSequence2 = new StringBuilder("drawtext=fontfile='");
        charSequence2 = ((StringBuilder)charSequence2).append((String)charSequence3).append("':text='%{eif\\:trunc(t/60)\\:d\\:2}\\:%{eif\\:trunc(mod(t\\,60))\\:d\\:2}':x=0.0:y=0.0:fontsize=").append(f2);
        string3 = ":fontcolor=";
        charSequence2 = ((StringBuilder)charSequence2).append(string3).append(string2);
        charSequence4 = ",drawtext=fontfile='";
        charSequence2 = ((StringBuilder)charSequence2).append((String)charSequence4).append((String)charSequence3).append("':text='-%{eif\\:trunc((").append(n);
        charSequence3 = "-t)/60)\\:d\\:2}\\:%{eif\\:trunc(mod(";
        Object object4 = ((StringBuilder)charSequence2).append((String)charSequence3).append(n).append("-t\\,60))\\:d\\:2}':x=").append(f).append(":y=0.0:fontsize=").append(f2).append(string3).append(string2).toString();
        charSequence2 = "-vf";
        arrayList.add((String)charSequence2);
        arrayList.add((String)object4);
        arrayList.add("-c:v");
        arrayList.add("qtrle");
        arrayList.add("-pix_fmt");
        arrayList.add("argb");
        arrayList.add("-preset");
        arrayList.add("veryfast");
        arrayList.add("-avoid_negative_ts");
        arrayList.add("make_zero");
        arrayList.add((String)charSequence);
        n = 0;
        object4 = null;
        try {
            ((Semaphore)object2).acquire();
        }
        catch (InterruptedException interruptedException) {
            this.renderManager.nextTask();
            ((CountDownLatch)object).countDown();
            return null;
        }
        charSequence2 = new String[]{};
        charSequence2 = (String[])arrayList.toArray((T[])charSequence2);
        object3 = new ProgressViewActivity$$ExternalSyntheticLambda12(this, (CountDownLatch)object, (Semaphore)object2);
        object = new ProgressViewActivity$$ExternalSyntheticLambda6(this);
        long l = FFmpegKit.executeWithArgumentsAsync((String[])charSequence2, (FFmpegSessionCompleteCallback)object3, null, (StatisticsCallback)object).getSessionId();
        object2 = this.id_ffmpeg;
        object4 = l;
        object2.add(object4);
        return charSequence;
    }

    private String getBestH264Codec() {
        boolean bl;
        String string2;
        boolean bl2;
        String string3;
        block22: {
            Object object;
            String string4;
            block21: {
                block20: {
                    string3 = null;
                    string4 = "-hide_banner -encoders";
                    try {
                        string4 = FFmpegKit.execute((String)string4);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return null;
                    }
                    object = string4.getReturnCode();
                    bl2 = ReturnCode.isSuccess((ReturnCode)object);
                    if (bl2) break block20;
                    return null;
                }
                string4 = string4.getOutput();
                if (string4 != null) break block21;
                return null;
            }
            string4 = string4.toLowerCase();
            object = " h264_mediacodec ";
            bl2 = string4.contains((CharSequence)object);
            string2 = " libx264 ";
            bl = string4.contains(string2);
            string2 = "h264_mediacodec";
            if (bl || !bl2) break block22;
            return string2;
        }
        int n = Build.VERSION.SDK_INT;
        int n2 = 29;
        String string5 = "libx264";
        if (n <= n2) {
            if (bl) {
                string3 = string5;
            } else if (bl2) {
                string3 = string2;
            }
            return string3;
        }
        n2 = 30;
        if (n == n2) {
            if (bl) {
                string3 = string5;
            } else if (bl2) {
                string3 = string2;
            }
            return string3;
        }
        if (bl2) {
            string3 = string2;
        } else if (bl) {
            string3 = string5;
        }
        return string3;
    }

    private String getBitrate(int n, int n2, int n3) {
        int n4 = 30;
        n3 = n3 > n4 ? 1 : 0;
        if ((n = Math.max(n, n2)) <= (n2 = 720)) {
            String string2 = n3 != 0 ? "2000k" : "1500k";
            return string2;
        }
        n2 = 1280;
        if (n <= n2) {
            String string3 = n3 != 0 ? "4000k" : "3000k";
            return string3;
        }
        n2 = 1920;
        if (n <= n2) {
            String string4 = n3 != 0 ? "6000k" : "4500k";
            return string4;
        }
        return "8000k";
    }

    /*
     * Exception decompiling
     */
    private File getOrCreateMask(int var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private File getOrCreateMaskCircle(int n, int n2) {
        int n3;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        int n4 = Math.min(n, n2);
        float f = n4;
        float f2 = 2.0f;
        float f3 = (float)n / f2;
        float f4 = (float)n2 / f2;
        canvas.drawCircle(f3, f4, f /= f2, paint);
        String string2 = this.mTemplate.getFolder_template();
        String string3 = "circle_";
        StringBuilder stringBuilder = new StringBuilder(string3);
        Object object = stringBuilder.append(n);
        String string4 = "x";
        object = ((StringBuilder)object).append(string4).append(n2);
        String string5 = ".png";
        object = ((StringBuilder)object).append(string5).toString();
        File file = new File(string2, (String)object);
        try {
            object = new FileOutputStream(file);
            string5 = Bitmap.CompressFormat.PNG;
            n3 = 100;
        }
        catch (Exception exception) {
            return file;
        }
        config.compress((Bitmap.CompressFormat)string5, n3, (OutputStream)object);
        ((FileOutputStream)object).close();
        return file;
    }

    private void insertToGallery(Uri uri) {
        if (uri == null) {
            return;
        }
        Object object = uri.getPath();
        File file = new File((String)object);
        boolean bl = file.exists();
        if (bl) {
            object = new FileMediaScanner((Context)this, file);
            object = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
            file = new Intent((String)object, uri);
            try {
                this.sendBroadcast((Intent)file);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    static /* synthetic */ void lambda$checkAacEncoder$2(FFmpegSession object) {
        Object object2 = object.getReturnCode();
        boolean bl = ReturnCode.isSuccess((ReturnCode)object2);
        String string2 = "AAC workd";
        if (bl) {
            object = "AAC encoder is available!";
            Log.e((String)string2, (String)object);
        } else {
            object2 = "AAC encoder NOT supported in this build!";
            Log.e((String)string2, (String)object2);
            object = object.getAllLogsAsString();
            Log.e((String)string2, (String)object);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat.Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private String mFadeFilter(float f, float f2, boolean bl) {
        float f3 = f2 - 0.05f;
        float f4 = f3 - 0.0f;
        float f5 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
        if (f5 <= 0) {
            f2 = 0.01f;
        }
        CharSequence charSequence = bl ? "in" : "out";
        StringBuilder stringBuilder = new StringBuilder("fade=t=");
        charSequence = stringBuilder.append((String)charSequence).append(":st=");
        f = Math.abs(f);
        StringBuilder stringBuilder2 = ((StringBuilder)charSequence).append(f).append(":d=");
        f2 = Math.abs(f2);
        return stringBuilder2.append(f2).append(":alpha=1:color=white,fps=60,format=rgba").toString();
    }

    private String mSlideX(float f, float f2, float f3, float f4, float f5, float f6) {
        CharSequence charSequence = new StringBuilder("clip((t-");
        String string2 = charSequence.append(f).append(")/").append(f2).append(",0,1)").toString();
        charSequence = "(";
        StringBuilder stringBuilder = new StringBuilder((String)charSequence);
        string2 = stringBuilder.append(string2).append("*").append(string2).append("*(3-2*").append(string2).append("))").toString();
        stringBuilder = new StringBuilder((String)charSequence);
        stringBuilder = stringBuilder.append(f5);
        charSequence = "+(";
        stringBuilder = stringBuilder.append((String)charSequence);
        stringBuilder = stringBuilder.append(f6 -= f5);
        String string3 = ")*";
        string2 = stringBuilder.append(string3).append(string2).append(")").toString();
        stringBuilder = new StringBuilder();
        return stringBuilder.append(f3).append((String)charSequence).append(string2).append(string3).append(f4).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void releaseWakeLock() {
        int n;
        Window window;
        try {
            window = this.getWindow();
            n = 128;
        }
        catch (Exception exception) {
            return;
        }
        window.clearFlags(n);
    }

    private String runPreRender(String object, String stringArray, String object2, int n, String string2, boolean bl, CountDownLatch countDownLatch, Semaphore semaphore, String string3) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        arrayList.add("-stream_loop");
        arrayList.add("-1");
        String string4 = "-i";
        arrayList.add(string4);
        arrayList.add(object);
        if (stringArray != null) {
            arrayList.add(string4);
            arrayList.add(stringArray);
        }
        arrayList.add("-filter_complex");
        arrayList.add(object2);
        object = "-c:v";
        if (bl) {
            arrayList.add(object);
            arrayList.add("qtrle");
            arrayList.add("-pix_fmt");
            object = "rgba";
            arrayList.add(object);
        } else if (string3 != null) {
            arrayList.add("-threads");
            stringArray = "0";
            arrayList.add(stringArray);
            arrayList.add(object);
            arrayList.add(string3);
            arrayList.add("-preset");
            arrayList.add("fast");
            arrayList.add("-crf");
            object = "18";
            arrayList.add(object);
        } else {
            arrayList.add("-b:v");
            object = "4M";
            arrayList.add(object);
        }
        arrayList.add("-r");
        int n2 = this.mTemplate.getFps();
        object = String.valueOf(n2);
        arrayList.add(object);
        arrayList.add("-t");
        object = new StringBuilder();
        int n3 = Math.max(n, 500);
        object = ((StringBuilder)object).append(n3);
        stringArray = "ms";
        object = ((StringBuilder)object).append((String)stringArray).toString();
        arrayList.add(object);
        if (!bl) {
            arrayList.add("-movflags");
            object = "+faststart";
            arrayList.add(object);
        }
        arrayList.add(string2);
        n2 = 0;
        object = null;
        try {
            semaphore.acquire();
        }
        catch (InterruptedException interruptedException) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
        stringArray = new String[]{};
        stringArray = arrayList.toArray(stringArray);
        object2 = new ProgressViewActivity$$ExternalSyntheticLambda5(this, countDownLatch, semaphore);
        ProgressViewActivity$$ExternalSyntheticLambda6 progressViewActivity$$ExternalSyntheticLambda6 = new ProgressViewActivity$$ExternalSyntheticLambda6(this);
        long l = FFmpegKit.executeWithArgumentsAsync((String[])stringArray, (FFmpegSessionCompleteCallback)object2, null, (StatisticsCallback)progressViewActivity$$ExternalSyntheticLambda6).getSessionId();
        object2 = this.id_ffmpeg;
        object = l;
        object2.add(object);
        return string2;
    }

    private void showError(FFmpegSession fFmpegSession) {
        ProgressViewActivity$10 progressViewActivity$10 = new ProgressViewActivity$10(this, fFmpegSession);
        try {
            this.runOnUiThread(progressViewActivity$10);
        }
        catch (Exception exception) {
            this.toStudio();
        }
    }

    private String slideX(float f, float f2, float f3, float f4, float f5, float f6) {
        CharSequence charSequence = new StringBuilder("clip((t-");
        String string2 = charSequence.append(f).append(")/").append(f2).append(",0,1)").toString();
        charSequence = "(";
        StringBuilder stringBuilder = new StringBuilder((String)charSequence);
        string2 = stringBuilder.append(string2).append("*").append(string2).append("*(3-2*").append(string2).append("))").toString();
        stringBuilder = new StringBuilder((String)charSequence);
        stringBuilder = stringBuilder.append(f5);
        charSequence = "+(";
        stringBuilder = stringBuilder.append((String)charSequence);
        stringBuilder = stringBuilder.append(f6 -= f5);
        String string3 = ")*";
        string2 = stringBuilder.append(string3).append(string2).append(")").toString();
        String string4 = "'";
        stringBuilder = new StringBuilder(string4);
        return stringBuilder.append(f3).append((String)charSequence).append(string2).append(string3).append(f4).append(string4).toString();
    }

    private void startExport() {
        Object object = this.getIntent();
        if (object != null) {
            object = this.getIntent();
            Object object2 = "template";
            if ((object = object.getStringExtra((String)object2)) != null) {
                object = (Template)LocalPersistence.readObjectFromFile((Context)this, (String)object);
                this.mTemplate = object;
                if (object != null) {
                    this.mUri = object = ((Template)object).getUri_video();
                }
                object = this.mTemplate.getEntityMediaList();
                object2 = new ProgressViewActivity$$ExternalSyntheticLambda0(this);
                this.prepareAllMedia((List)object, (Runnable)object2);
            }
        }
    }

    private void startSmoothAnimation() {
        this.isAnimating = true;
        Handler handler = this.uiHandler;
        ProgressViewActivity$7 progressViewActivity$7 = new ProgressViewActivity$7(this);
        handler.post((Runnable)progressViewActivity$7);
    }

    private void toShare() {
        Intent intent = new Intent((Context)this, VideoViewActivity.class);
        Object object = this.mTemplate.getEntitySurahTemplate();
        String string2 = "reader";
        String string3 = "surah";
        if (object != null) {
            object = this.mTemplate.getEntitySurahTemplate().getName();
            intent.putExtra(string3, (String)object);
            object = this.mTemplate.getEntitySurahTemplate().getReader();
            intent.putExtra(string2, (String)object);
        } else {
            object = "";
            intent.putExtra(string3, (String)object);
            intent.putExtra(string2, (String)object);
        }
        object = this.mTemplate.getIdTemplate();
        intent.putExtra("template", (String)object);
        object = Uri.parse((String)this.mTemplate.getUri_video());
        intent.setData((Uri)object);
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }

    private void toStudio() {
        Intent intent = new Intent((Context)this, EngineActivity.class);
        Object object = this.mTemplate;
        if (object != null) {
            String string2 = "template";
            object = ((Template)object).getIdTemplate();
            intent.putExtra(string2, (String)object);
        }
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }

    private void updateNext(CountDownLatch countDownLatch, Semaphore semaphore) {
        RenderManager renderManager = this.renderManager;
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

    public void checkAacEncoder(Context object) {
        Object object2 = "-y -f lavfi -i anullsrc=channel_layout=stereo:sample_rate=44100 -t 1 -c:a aac -b:a 64k ";
        CharSequence charSequence = "aac_test";
        String string2 = ".m4a";
        object = object.getCacheDir();
        object = File.createTempFile((String)charSequence, string2, (File)object);
        ((File)object).deleteOnExit();
        charSequence = new StringBuilder((String)object2);
        object = ((File)object).getAbsolutePath();
        object = ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)object).toString();
        object2 = new ProgressViewActivity$$ExternalSyntheticLambda9();
        try {
            FFmpegKit.executeAsync((String)object, (FFmpegSessionCompleteCallback)object2);
        }
        catch (Exception exception) {
            charSequence = "Error checking AAC: ";
            object2 = new StringBuilder((String)charSequence);
            String string3 = exception.getMessage();
            string3 = ((StringBuilder)object2).append(string3).toString();
            object2 = "AAC workd";
            Log.e((String)object2, (String)string3);
        }
    }

    public void dialog() {
        Object object;
        this.dialog = object = new Dialog((Context)this);
        int n = 1;
        object.setCancelable(n != 0);
        this.dialog.requestWindowFeature(n);
        this.dialog.getWindow().setLayout(-1, -2);
        object = this.dialog.getWindow();
        Object object2 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object2);
        object = LayoutInflater.from((Context)this);
        n = R$layout.layout_dialog;
        object = object.inflate(n, null);
        this.dialog.setContentView((View)object);
        n = R$id.dialog_title;
        object2 = (TextCustumFont)object.findViewById(n);
        int n2 = R$id.dialog_message;
        Object object3 = (TextCustumFont)object.findViewById(n2);
        int n3 = R$id.dialog_no;
        ButtonCustumFont buttonCustumFont = (ButtonCustumFont)object.findViewById(n3);
        Object object4 = new ProgressViewActivity$3(this);
        buttonCustumFont.setOnClickListener((View.OnClickListener)object4);
        int n4 = R$id.dialog_yes;
        object = (ButtonCustumFont)object.findViewById(n4);
        object4 = new ProgressViewActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object4);
        object4 = LocaleHelper.getLanguage((Context)this);
        String string2 = "ar";
        n4 = ((String)object4).equals(string2) ? 1 : 0;
        if (n4 != 0) {
            object4 = "\u0647\u0644 \u0623\u0646\u062a \u0645\u062a\u0623\u0643\u062f \u0645\u0646 \u0645\u063a\u0627\u062f\u0631\u0629 \u0647\u0630\u0627 \u0627\u0644\u0639\u0645\u0644\u061f";
            object3.setText((CharSequence)object4);
            object3 = "\u062e\u0631\u0648\u062c...";
            object2.setText((CharSequence)object3);
            buttonCustumFont.setText("\u0645\u063a\u0627\u062f\u0631\u0629");
            object2 = "\u0645\u062a\u0627\u0628\u0639\u0629";
            object.setText((CharSequence)object2);
        } else {
            object4 = "Are you sure want to leave this work ?";
            object3.setText((CharSequence)object4);
            object3 = "Exit...";
            object2.setText((CharSequence)object3);
            buttonCustumFont.setText("Leave");
            object2 = "Continue";
            object.setText((CharSequence)object2);
        }
        this.dialog.show();
    }

    public void export(String[] object) {
        Object object2 = new ProgressViewActivity$8(this);
        ProgressViewActivity$9 progressViewActivity$9 = new ProgressViewActivity$9(this);
        long l = FFmpegKit.executeWithArgumentsAsync((String[])object, (FFmpegSessionCompleteCallback)object2, null, (StatisticsCallback)progressViewActivity$9).getSessionId();
        object = this.id_ffmpeg;
        object2 = l;
        object.add(object2);
    }

    /* synthetic */ void cfr_renamed_43(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /* synthetic */ void cfr_renamed_44(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /* synthetic */ void cfr_renamed_45(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /* synthetic */ void cfr_renamed_46(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /* synthetic */ void cfr_renamed_0(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    /* synthetic */ void cfr_renamed_47(List var1_1, Runnable var2_4) {
        block36: {
            block33: {
                block32: {
                    if (var1_1 != null) {
                        var3_5 = var1_1.isEmpty();
                        if (var3_5 != 0) break block32;
                        var3_5 = 0;
                        var4_6 = null;
                        break block33;
                    }
                }
                var1_1 = "AudioUtils";
                var4_7 = "Media list is null or empty";
                Log.w((String)var1_1, (String)var4_7);
                if (var2_4 == null) return;
                var2_4.run();
                return;
            }
            while (true) {
                block35: {
                    block34: {
                        var5_8 = var1_1.size();
                        if (var3_5 >= var5_8) ** GOTO lbl77
                        var6_9 = var1_1.get(var3_5);
                        var6_9 = (EntityMedia)var6_9;
                        if (var6_9 == null) ** GOTO lbl75
                        var7_11 = var6_9.getEnd();
                        var8_12 = var6_9.getStart();
                        var9_13 = var7_11 == var8_12 ? 0 : (var7_11 < var8_12 ? -1 : 1);
                        if (var9_13 < 0) ** GOTO lbl75
                        var10_14 = var6_9.getPath_ffmpeg_effect();
                        if (var10_14 != null) ** GOTO lbl75
                        var10_14 = var6_9.getUri();
                        if (var10_14 == null) ** GOTO lbl75
                        var10_14 = var6_9.getUri();
                        var11_15 = "http";
                        var9_13 = (float)var10_14.startsWith((String)var11_15);
                        if (var9_13 == false) break block34;
                        var10_14 = var6_9.getUri();
                        var11_15 = this.mTemplate;
                        var11_15 = var11_15.getFolder_template();
                        var10_14 = AudioUtils.downloadFile((Context)this, var10_14, (String)var11_15);
                        break block35;
                    }
                    var10_14 = var6_9.getUri();
                    var10_14 = Uri.parse((String)var10_14);
                    var11_15 = this.mTemplate;
                    var11_15 = var11_15.getFolder_template();
                    var10_14 = AudioUtils.copyFromUri((Context)this, (Uri)var10_14, (String)var11_15);
                }
                if (var10_14 == null) ** GOTO lbl75
                var6_9.setPath_ffmpeg(var10_14);
                try {
                    var6_9.setPath_ffmpeg_effect(var10_14);
                    ** GOTO lbl75
                }
                catch (Exception var6_10) {
                    var6_10.printStackTrace();
lbl75:
                    // 7 sources

                    ++var3_5;
                    continue;
lbl77:
                    // 1 sources

                    if (var2_4 == null) return;
                    break;
                    {
                        catch (Throwable var1_2) {
                            break block36;
                        }
                        catch (Exception var1_3) {}
                        {
                            var1_3.printStackTrace();
                            if (var2_4 == null) return;
                        }
                    }
                }
                break;
            }
            var2_4.run();
            return;
        }
        if (var2_4 == null) throw var1_2;
        var2_4.run();
        throw var1_2;
    }

    /* synthetic */ void cfr_renamed_48(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        this.updateNext(countDownLatch, semaphore);
    }

    /* synthetic */ void cfr_renamed_49(CountDownLatch object, List list) {
        boolean bl;
        block8: {
            ((CountDownLatch)object).await();
            object = Thread.currentThread();
            bl = ((Thread)object).isInterrupted();
            if (!bl) break block8;
            bl = this.isDestroy;
            if (!bl) break block8;
            return;
        }
        bl = false;
        object = null;
        object = new String[]{};
        object = list.toArray((T[])object);
        object = (String[])object;
        try {
            this.export((String[])object);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    /* synthetic */ void cfr_renamed_50() {
        ProgressViewActivity$$ExternalSyntheticLambda3 progressViewActivity$$ExternalSyntheticLambda3 = new ProgressViewActivity$$ExternalSyntheticLambda3(this);
        FfmpegCodecChecker.detectCodecsAsync(progressViewActivity$$ExternalSyntheticLambda3);
    }

    protected void onCreate(Bundle object) {
        Object object2 = this.getWindow();
        int n = 1536;
        object2.setFlags(n, n);
        super.onCreate(object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n2 = R$layout.activity_progress_view;
        this.setContentView(n2);
        object = this.getOnBackPressedDispatcher();
        object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, (OnBackPressedCallback)object2);
        n2 = -16777216;
        this.setStatusBarColor(n2);
        this.setNavigationBarColor(n2);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        object.setAppearanceLightStatusBars(false);
        object.setAppearanceLightNavigationBars(false);
        n2 = R$id.main;
        object = this.findViewById(n2);
        object2 = new ProgressViewActivity$$ExternalSyntheticLambda4();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        this.wakeLockAquire();
        n2 = R$id.progress_horizontal;
        object = (SquareOutlineProgressBar)this.findViewById(n2);
        this.progressIndicator = object;
        n2 = R$id.btn_cancel;
        object = this.findViewById(n2);
        object2 = new ProgressViewActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        try {
            this.startExport();
        }
        catch (Exception exception) {
            this.toStudio();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    protected void onDestroy() {
        Thread thread;
        ProgressViewActivity$5 progressViewActivity$5;
        this.clearFFmpeg();
        super.onDestroy();
        boolean bl = true;
        try {
            this.isDestroy = bl;
            this.releaseWakeLock();
        }
        catch (Exception exception) {
            return;
        }
        {
            progressViewActivity$5 = new ProgressViewActivity$5(this);
        }
        {
            thread = new Thread(progressViewActivity$5);
            thread.start();
            thread = this.workerThread;
            if (thread == null) return;
        }
        {
            thread.interrupt();
            return;
        }
    }

    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }

    public String preRenderMask_Circle(SquareBitmapModel squareBitmapModel, int n, CountDownLatch countDownLatch, Semaphore semaphore) {
        String string2 = this.mTemplate.getUri_media_video();
        Serializable serializable = new StringBuilder();
        Object object = this.mTemplate.getFolder_template();
        serializable = ((StringBuilder)serializable).append((String)object).append("/circle_");
        long l = System.currentTimeMillis();
        String string3 = ((StringBuilder)serializable).append(l).append(".mov").toString();
        serializable = this.mTemplate;
        int n2 = ((Template)serializable).getWidth();
        object = this.mTemplate;
        int n3 = ((Template)object).getHeight();
        n2 = Math.max(n2, n3);
        float f = squareBitmapModel.getRight();
        n3 = Math.round(f);
        float f2 = squareBitmapModel.getBottom();
        int n4 = Math.round(f2);
        float f3 = squareBitmapModel.getLef_square();
        int n5 = Math.round(f3);
        float f4 = squareBitmapModel.getTop_square();
        int n6 = Math.round(f4);
        float f5 = squareBitmapModel.getWidth_sqaure();
        int n7 = Math.round(f5);
        float f6 = squareBitmapModel.getHeight_square();
        int n8 = Math.round(f6);
        int n9 = n7 & 1;
        int n10 = 1;
        if (n9 == n10) {
            ++n7;
        }
        if ((n9 = n8 & 1) == n10) {
            ++n8;
        }
        Object object2 = this.getOrCreateMaskCircle(n7, n8);
        Serializable serializable2 = new StringBuilder("[0:v]scale=");
        serializable2 = serializable2.append(n2);
        String string4 = ":";
        String string5 = serializable2.append(string4).append(n2).append(":force_original_aspect_ratio=increase,crop=").append(n3).append(string4).append(n4).append(string4).append(n5).append(string4).append(n6).append(",scale=").append(n7).append(string4).append(n8).append(":flags=lanczos[v];[v][1:v]alphamerge,format=rgba").toString();
        String string6 = ((File)object2).getAbsolutePath();
        object = this;
        n6 = n;
        object2 = countDownLatch;
        serializable2 = semaphore;
        return this.runPreRender(string2, string6, string5, n, string3, true, countDownLatch, semaphore, null);
    }

    public String preRenderMask_Rounded(SquareBitmapModel serializable, int n, CountDownLatch countDownLatch, Semaphore semaphore) {
        String string2 = this.mTemplate.getUri_media_video();
        Serializable serializable2 = new StringBuilder();
        Object object = this.mTemplate.getFolder_template();
        serializable2 = ((StringBuilder)serializable2).append((String)object).append("/rounded_");
        long l = System.currentTimeMillis();
        String string3 = ((StringBuilder)serializable2).append(l).append(".mov").toString();
        serializable2 = this.mTemplate;
        int n2 = ((Template)serializable2).getWidth();
        object = this.mTemplate;
        int n3 = ((Template)object).getHeight();
        n2 = Math.max(n2, n3);
        float f = ((SquareBitmapModel)serializable).getRight();
        n3 = Math.round(f);
        float f2 = ((SquareBitmapModel)serializable).getBottom();
        int n4 = Math.round(f2);
        float f3 = ((SquareBitmapModel)serializable).getLef_square();
        int n5 = Math.round(f3);
        float f4 = ((SquareBitmapModel)serializable).getTop_square();
        int n6 = Math.round(f4);
        float f5 = ((SquareBitmapModel)serializable).getWidth_sqaure();
        int n7 = Math.round(f5);
        float f6 = ((SquareBitmapModel)serializable).getHeight_square();
        int n8 = Math.round(f6);
        int n9 = n7 & 1;
        int n10 = 1;
        if (n9 == n10) {
            ++n7;
        }
        if ((n9 = n8 & 1) == n10) {
            ++n8;
        }
        int n11 = (int)((SquareBitmapModel)serializable).getRaduis();
        serializable = this.getOrCreateMask(n7, n8, n11);
        Serializable serializable3 = new StringBuilder("[0:v]scale=");
        serializable3 = serializable3.append(n2);
        String string4 = ":";
        String string5 = serializable3.append(string4).append(n2).append(":force_original_aspect_ratio=increase,crop=").append(n3).append(string4).append(n4).append(string4).append(n5).append(string4).append(n6).append(",scale=").append(n7).append(string4).append(n8).append(":flags=lanczos[v];[v][1:v]alphamerge,format=rgba").toString();
        String string6 = ((File)serializable).getAbsolutePath();
        object = this;
        n6 = n;
        serializable3 = semaphore;
        return this.runPreRender(string2, string6, string5, n, string3, true, countDownLatch, semaphore, null);
    }

    public String preRenderVideo(int n, CountDownLatch object, Semaphore object2, String object3) {
        int n2;
        Object object4 = this.mTemplate.getUri_media_video();
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = this.mTemplate.getFolder_template();
        charSequence = charSequence.append((String)charSequence2).append("/layer_video_");
        long l = System.currentTimeMillis();
        charSequence = charSequence.append(l).append(".mp4").toString();
        int n3 = this.mTemplate.getWidth();
        int n4 = this.mTemplate.getHeight();
        n3 = Math.max(n3, n4);
        ArrayList<String> arrayList = new ArrayList<String>("(iw-");
        int n5 = this.mTemplate.getWidth();
        arrayList = ((StringBuilder)((Object)arrayList)).append(n5);
        String string2 = ")/2";
        arrayList = ((StringBuilder)((Object)arrayList)).append(string2).toString();
        CharSequence charSequence3 = new StringBuilder("(ih-");
        int n6 = this.mTemplate.getHeight();
        string2 = charSequence3.append(n6).append(string2).toString();
        charSequence3 = new StringBuilder("[0:v]scale=");
        charSequence3 = charSequence3.append(n3);
        String string3 = ":";
        charSequence2 = charSequence3.append(string3).append(n3).append(":force_original_aspect_ratio=increase:flags=lanczos,crop=");
        int n7 = this.mTemplate.getWidth();
        charSequence2 = ((StringBuilder)charSequence2).append(n7).append(string3);
        n7 = this.mTemplate.getHeight();
        charSequence2 = ((StringBuilder)charSequence2).append(n7).append(string3).append((String)((Object)arrayList)).append(string3).append(string2).append("[v];[v][1:v]overlay,format=rgba").toString();
        arrayList = new ArrayList<String>();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        arrayList.add("-stream_loop");
        arrayList.add("-1");
        string2 = "-i";
        arrayList.add(string2);
        arrayList.add((String)object4);
        charSequence3 = this.mTemplate.getUri_bg_ffmpeg();
        object4 = new File((String)charSequence3);
        n7 = ((File)object4).exists() ? 1 : 0;
        n6 = 0;
        string3 = null;
        if (n7 != 0 && (n2 = ((File)object4).isFile()) != 0) {
            arrayList.add(string2);
            object4 = this.mTemplate.getUri_bg_ffmpeg();
            arrayList.add((String)object4);
            object4 = "-filter_complex";
            arrayList.add((String)object4);
            arrayList.add((String)charSequence2);
            if (object3 != null) {
                arrayList.add("-threads");
                arrayList.add("0");
                object4 = "-c:v";
                arrayList.add((String)object4);
                arrayList.add((String)object3);
                arrayList.add("-preset");
                arrayList.add("fast");
                arrayList.add("-crf");
                object3 = "18";
                arrayList.add((String)object3);
            } else {
                arrayList.add("-b:v");
                object3 = "4M";
                arrayList.add((String)object3);
            }
            arrayList.add("-r");
            int n8 = this.mTemplate.getFps();
            object3 = String.valueOf(n8);
            arrayList.add((String)object3);
            arrayList.add("-t");
            object3 = new StringBuilder();
            n2 = 500;
            n = Math.max(n, n2);
            Object object5 = ((StringBuilder)object3).append(n);
            object3 = "ms";
            object5 = object5.append((String)object3).toString();
            arrayList.add((String)object5);
            arrayList.add("-movflags");
            arrayList.add("+faststart");
            object5 = "-an";
            arrayList.add((String)object5);
            arrayList.add((String)charSequence);
            try {
                ((Semaphore)object2).acquire();
            }
            catch (InterruptedException interruptedException) {
                this.renderManager.nextTask();
                ((CountDownLatch)object).countDown();
                return null;
            }
            object5 = new String[]{};
            object5 = arrayList.toArray((T[])object5);
            object3 = new ProgressViewActivity$$ExternalSyntheticLambda7(this, (CountDownLatch)object, (Semaphore)object2);
            object = new ProgressViewActivity$$ExternalSyntheticLambda6(this);
            long l2 = FFmpegKit.executeWithArgumentsAsync((String[])object5, (FFmpegSessionCompleteCallback)object3, null, (StatisticsCallback)object).getSessionId();
            object2 = this.id_ffmpeg;
            object5 = l2;
            object2.add(object5);
            return charSequence;
        }
        this.updateNext((CountDownLatch)object, (Semaphore)object2);
        return null;
    }

    public String preRenderVideoHue(int n, CountDownLatch countDownLatch, Semaphore semaphore, String string2) {
        int n2;
        ProgressViewActivity progressViewActivity = this;
        int n3 = n;
        Object object = countDownLatch;
        Object object2 = semaphore;
        Object object3 = string2;
        Object object4 = this.mTemplate.getUri_media_video();
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = this.mTemplate.getFolder_template();
        charSequence = charSequence.append((String)charSequence2).append("/layer_video_");
        long l = System.currentTimeMillis();
        charSequence = charSequence.append(l).append(".mp4").toString();
        int n4 = this.mTemplate.getWidth();
        int n5 = this.mTemplate.getHeight();
        n4 = Math.max(n4, n5);
        n5 = this.mTemplate.getWidth();
        int n6 = this.mTemplate.getHeight();
        CharSequence charSequence3 = new StringBuilder("(iw-");
        charSequence3 = charSequence3.append(n5);
        String string3 = ")/2";
        charSequence3 = charSequence3.append(string3).toString();
        CharSequence charSequence4 = new StringBuilder("(ih-");
        string3 = charSequence4.append(n6).append(string3).toString();
        int n7 = this.mTemplate.getmTimeModel().getWidth_bitmap_progress();
        int n8 = this.mTemplate.getmTimeModel().getProgress_offset();
        n7 -= n8;
        n8 = -this.mTemplate.getmTimeModel().getWidth_bitmap_progress();
        double d = n8;
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence5 = stringBuilder.append(d).append(" + ((cos((t / (");
        double d2 = n;
        double d3 = 1000.0;
        charSequence4 = charSequence5.append(d2 /= d3).append(") + 1) * PI) / 2 + 0.5) * ").append(n7).append(")").toString();
        charSequence5 = new StringBuilder("[0:v]scale=");
        charSequence5 = charSequence5.append(n4);
        String string4 = ":";
        charSequence2 = charSequence5.append(string4).append(n4);
        charSequence5 = ":force_original_aspect_ratio=increase:flags=lanczos,hue=s=0,crop=";
        charSequence2 = ((StringBuilder)charSequence2).append((String)charSequence5).append(n5).append(string4).append(n6).append(string4).append((String)charSequence3).append(string4).append(string3).append("[main];[main][1]overlay[fm];[2:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineProg];[3:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineBg];[lineProg][lineBg]overlay=x=").append((String)charSequence4).append(":y=0[bgApplied];[fm][bgApplied]overlay=");
        float f = this.mTemplate.getEntityProgressTemplate().getLeft();
        charSequence2 = ((StringBuilder)charSequence2).append(f).append(string4);
        f = this.mTemplate.getEntityProgressTemplate().getTop();
        charSequence2 = ((StringBuilder)charSequence2).append(f).toString();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        String string5 = "-i";
        arrayList.add(string5);
        arrayList.add(object4);
        charSequence3 = this.mTemplate.getUri_bg_ffmpeg();
        object4 = new File((String)charSequence3);
        boolean bl = ((File)object4).exists();
        string3 = null;
        if (bl && (n2 = ((File)object4).isFile()) != 0) {
            arrayList.add(string5);
            object4 = this.mTemplate.getUri_bg_ffmpeg();
            arrayList.add(object4);
            arrayList.add(string5);
            object4 = new StringBuilder();
            charSequence3 = this.mTemplate.getFolder_template();
            object4 = ((StringBuilder)object4).append((String)charSequence3).append("/line_progress.png").toString();
            arrayList.add(object4);
            arrayList.add(string5);
            object4 = new StringBuilder();
            string5 = this.mTemplate.getFolder_template();
            object4 = ((StringBuilder)object4).append(string5).append("/line_bg.png").toString();
            arrayList.add(object4);
            arrayList.add("-filter_complex");
            arrayList.add(charSequence2);
            object4 = "18";
            charSequence2 = "-crf";
            string5 = "-preset";
            charSequence3 = "-c:v";
            if (string2 != null) {
                arrayList.add(charSequence3);
                arrayList.add(string2);
                arrayList.add(string5);
                object3 = "fast";
                arrayList.add(object3);
                arrayList.add(charSequence2);
                arrayList.add(object4);
            } else {
                arrayList.add(charSequence3);
                arrayList.add("libx264");
                arrayList.add(string5);
                object3 = "veryfast";
                arrayList.add(object3);
                arrayList.add(charSequence2);
                arrayList.add(object4);
            }
            arrayList.add("-r");
            int n9 = progressViewActivity.mTemplate.getFps();
            object3 = String.valueOf(n9);
            arrayList.add(object3);
            arrayList.add("-t");
            object3 = new StringBuilder();
            n2 = 500;
            n3 = Math.max(n3, n2);
            Object object5 = ((StringBuilder)object3).append(n3);
            object3 = "ms";
            object5 = object5.append((String)object3).toString();
            arrayList.add(object5);
            arrayList.add("-movflags");
            arrayList.add("+faststart");
            object5 = "-an";
            arrayList.add(object5);
            arrayList.add(charSequence);
            try {
                semaphore.acquire();
            }
            catch (InterruptedException interruptedException) {
                progressViewActivity.renderManager.nextTask();
                countDownLatch.countDown();
                return null;
            }
            object5 = new String[]{};
            object5 = arrayList.toArray((T[])object5);
            object3 = new ProgressViewActivity$$ExternalSyntheticLambda8(progressViewActivity, (CountDownLatch)object, (Semaphore)object2);
            object = new ProgressViewActivity$$ExternalSyntheticLambda6(progressViewActivity);
            long l2 = FFmpegKit.executeWithArgumentsAsync((String[])object5, (FFmpegSessionCompleteCallback)object3, null, (StatisticsCallback)object).getSessionId();
            object2 = progressViewActivity.id_ffmpeg;
            object5 = l2;
            object2.add(object5);
            return charSequence;
        }
        progressViewActivity.updateNext((CountDownLatch)object, (Semaphore)object2);
        return null;
    }

    public String preRender_NoMask(SquareBitmapModel squareBitmapModel, int n, CountDownLatch countDownLatch, Semaphore semaphore, String string2) {
        String string3 = this.mTemplate.getUri_media_video();
        Object object = new StringBuilder();
        Object object2 = this.mTemplate.getFolder_template();
        object = object.append((String)object2).append("/nomask_");
        long l = System.currentTimeMillis();
        String string4 = object.append(l).append(".mp4").toString();
        object = this.mTemplate;
        int n2 = ((Template)object).getWidth();
        object2 = this.mTemplate;
        int n3 = ((Template)object2).getHeight();
        n2 = Math.max(n2, n3);
        float f = squareBitmapModel.getRight();
        n3 = Math.round(f);
        float f2 = squareBitmapModel.getBottom();
        int n4 = Math.round(f2);
        float f3 = squareBitmapModel.getLef_square();
        int n5 = Math.round(f3);
        float f4 = squareBitmapModel.getTop_square();
        int n6 = Math.round(f4);
        float f5 = squareBitmapModel.getWidth_sqaure();
        int n7 = Math.round(f5);
        float f6 = squareBitmapModel.getHeight_square();
        int n8 = Math.round(f6);
        int n9 = n7 & 1;
        int n10 = 1;
        if (n9 == n10) {
            ++n7;
        }
        if ((n9 = n8 & 1) == n10) {
            ++n8;
        }
        CharSequence charSequence = new StringBuilder("scale=");
        charSequence = charSequence.append(n2);
        String string5 = ":";
        String string6 = charSequence.append(string5).append(n2).append(":force_original_aspect_ratio=increase,crop=").append(n3).append(string5).append(n4).append(string5).append(n5).append(string5).append(n6).append(",scale=").append(n7).append(string5).append(n8).append(":flags=lanczos,format=yuv420p").toString();
        object = this;
        n5 = n;
        charSequence = string2;
        return this.runPreRender(string3, null, string6, n, string4, false, countDownLatch, semaphore, string2);
    }

    public void prepareAllMedia(List list, Runnable runnable) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ProgressViewActivity$$ExternalSyntheticLambda11 progressViewActivity$$ExternalSyntheticLambda11 = new ProgressViewActivity$$ExternalSyntheticLambda11(this, list, runnable);
        executorService.execute(progressViewActivity$$ExternalSyntheticLambda11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setupCommand(FfmpegCodecChecker$CodecInfo var1_1) {
        block158: {
            block202: {
                block156: {
                    block157: {
                        block201: {
                            block168: {
                                block172: {
                                    block170: {
                                        block165: {
                                            block171: {
                                                block166: {
                                                    block169: {
                                                        block167: {
                                                            block153: {
                                                                block159: {
                                                                    block160: {
                                                                        block164: {
                                                                            block162: {
                                                                                block163: {
                                                                                    block161: {
                                                                                        var2_2 = this;
                                                                                        var3_3 = var1_1;
                                                                                        var4_4 = Math.max(this.mTemplate.getDuration(), 1000);
                                                                                        var5_5 = new ArrayList();
                                                                                        var5_5.add("-hide_banner");
                                                                                        var6_6 = var4_4 / 1000;
                                                                                        this.renderManager.addTask("Vido prerender", var6_6);
                                                                                        var7_7 = var1_1.videoCodec;
                                                                                        var9_9 = 5.6E-45f;
                                                                                        var8_8 = new Semaphore(4);
                                                                                        var10_10 = this.mTemplate;
                                                                                        var11_11 = var10_10.getIpad_type();
                                                                                        var12_12 = IpadType.IPAD;
                                                                                        var13_13 = var12_12.ordinal();
                                                                                        var14_14 = "][";
                                                                                        var15_15 = "/line_bg.png";
                                                                                        var16_16 = "overlay=";
                                                                                        var17_17 = ":y=";
                                                                                        var18_18 = "]overlay=";
                                                                                        var19_19 = ":";
                                                                                        var20_20 = "[";
                                                                                        var3_3 = "]";
                                                                                        var21_21 = var7_7;
                                                                                        var7_7 = "-i";
                                                                                        var22_22 = var8_8;
                                                                                        var8_8 = "[ov";
                                                                                        var23_23 = var6_6;
                                                                                        var24_24 = "];";
                                                                                        var25_29 = var16_16;
                                                                                        if (var11_11 == var13_13 || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.IPAD_UNBLUR).ordinal()) || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.IPAD_CLASSIC).ordinal()) || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.IPAD_NEOMORPHIC).ordinal()) || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.ROUND_RECT).ordinal()) || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.BOTTOM_RECT).ordinal()) || (var11_11 = (var10_10 = this.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.RECT).ordinal())) break block159;
                                                                                        var12_12 = this.mTemplate.getQuranEntityList();
                                                                                        var13_13 = var12_12.size();
                                                                                        var26_30 = this.mTemplate.getTranslationTemplateList().size();
                                                                                        var13_13 += var26_30;
                                                                                        var26_30 = (int)this.mTemplate.isVideoSquare();
                                                                                        var13_13 += var26_30;
                                                                                        var16_16 = this.mTemplate.getEntityBismilahTemplate();
                                                                                        if (var16_16 != null) {
                                                                                            var26_30 = 1;
                                                                                            var27_31 = 1.4E-45f;
                                                                                        } else {
                                                                                            var26_30 = 0;
                                                                                            var27_31 = 0.0f;
                                                                                            var16_16 = null;
                                                                                        }
                                                                                        var13_13 += var26_30;
                                                                                        var16_16 = var2_2.mTemplate.getEntityIsti3adaTemplate();
                                                                                        if (var16_16 != null) {
                                                                                            var26_30 = 1;
                                                                                            var27_31 = 1.4E-45f;
                                                                                        } else {
                                                                                            var26_30 = 0;
                                                                                            var27_31 = 0.0f;
                                                                                            var16_16 = null;
                                                                                        }
                                                                                        var10_10 = new CountDownLatch(var13_13 += var26_30);
                                                                                        var12_12 = var2_2.mTemplate;
                                                                                        var13_13 = var12_12.getIpad_type();
                                                                                        var16_16 = IpadType.HEART;
                                                                                        var26_30 = var16_16.ordinal();
                                                                                        if (var13_13 == var26_30) {
                                                                                            var16_16 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                            var12_12 = new File((String)var16_16);
                                                                                            var26_30 = (int)var12_12.exists();
                                                                                            if (var26_30 != 0 && (var13_13 = (int)var12_12.isFile()) != 0) {
                                                                                                var5_5.add(var7_7);
                                                                                                var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                                var5_5.add(var12_12);
                                                                                            }
                                                                                            var5_5.add(var7_7);
                                                                                            var12_12 = new StringBuilder();
                                                                                            var16_16 = var2_2.mTemplate.getFolder_template();
                                                                                            var12_12 = var12_12.append((String)var16_16).append((String)var15_15).toString();
                                                                                            var5_5.add(var12_12);
                                                                                            var5_5.add("-f");
                                                                                            var5_5.add("lavfi");
                                                                                            var5_5.add(var7_7);
                                                                                            var12_12 = new StringBuilder("color=size=");
                                                                                            var28_32 = var2_2.mTemplate.getWidth();
                                                                                            var12_12 = var12_12.append(var28_32).append("x");
                                                                                            var28_32 = var2_2.mTemplate.getmTimeModel().getHeightShape();
                                                                                            var12_12 = var12_12.append(var28_32).append(":color=#00000000").toString();
                                                                                            var5_5.add(var12_12);
                                                                                            var29_33 = var4_4;
                                                                                            var31_34 = 4652007308841189376L;
                                                                                            var33_35 = 1000.0;
                                                                                            var12_12 = String.valueOf(var29_33 / var33_35);
                                                                                            var35_36 = var2_2.mTemplate.getmTimeModel().getHeightShape();
                                                                                            var16_16 = var2_2.overlay.append((String)var20_20);
                                                                                            var36_37 = var10_10;
                                                                                            var11_11 = 2;
                                                                                            var16_16.append(var11_11).append((String)var14_14).append(1).append("]overlay=x=0:y='").append(var35_36).append("*(1-clip(t/").append((String)var12_12).append(",0,1))*0.8 + ").append(var35_36).append("*(1-(0.5-0.5*cos(PI*clip(t/").append((String)var12_12).append(",0,1))))*0.2'").append((String)var8_8).append(1).append((String)var24_24);
                                                                                            var9_9 = var2_2.mTemplate.getmTimeModel().getStartShape();
                                                                                            var29_33 = var9_9;
                                                                                            var10_10 = var2_2.overlay.append("[0]").append((String)var8_8).append(1).append((String)var18_18);
                                                                                            var26_30 = 0;
                                                                                            var10_10 = var10_10.append(0).append((String)var19_19);
                                                                                            var27_31 = var2_2.mTemplate.getEntityProgressTemplate().getTop();
                                                                                            var37_38 = var14_14;
                                                                                            var38_39 = var17_17;
                                                                                            var39_40 = (double)var27_31 + var29_33;
                                                                                            var10_10.append(var39_40).append((String)var8_8).append(2).append((String)var24_24);
                                                                                            var5_5.add(var7_7);
                                                                                            var10_10 = new StringBuilder();
                                                                                            var12_12 = var2_2.mTemplate.getFolder_template();
                                                                                            var10_10 = var10_10.append((String)var12_12);
                                                                                            var12_12 = "/line_progress.png";
                                                                                            var10_10 = var10_10.append((String)var12_12).toString();
                                                                                            var5_5.add(var10_10);
                                                                                            var10_10 = var2_2.overlay.append((String)var8_8).append(2).append((String)var3_3).append((String)var20_20);
                                                                                            var13_13 = 3;
                                                                                            var41_41 = 4.2E-45f;
                                                                                            var10_10 = var10_10.append(var13_13).append((String)var18_18).append(0).append((String)var19_19);
                                                                                            var15_15 = var2_2.mTemplate.getEntityProgressTemplate();
                                                                                            var35_36 = var15_15.getTop();
                                                                                            var10_10 = var10_10.append(var35_36).append((String)var8_8).append(var13_13);
                                                                                            var10_10.append((String)var24_24);
                                                                                            var28_32 = var13_13;
                                                                                            var35_36 = var41_41;
                                                                                            var17_17 = var25_29;
                                                                                            var16_16 = var36_37;
lbl133:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var25_29 = var22_22;
                                                                                                break block153;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var36_37 = var10_10;
                                                                                        var37_38 = var14_14;
                                                                                        var38_39 = var17_17;
                                                                                        var10_10 = var2_2.mTemplate;
                                                                                        var11_11 = var10_10.getIpad_type();
                                                                                        if (var11_11 == (var13_13 = (var12_12 = IpadType.BATTERY).ordinal())) {
                                                                                            var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                            var10_10 = new File((String)var12_12);
                                                                                            var13_13 = (int)var10_10.exists();
                                                                                            if (var13_13 != 0 && (var11_11 = (int)var10_10.isFile()) != 0) {
                                                                                                var5_5.add(var7_7);
                                                                                                var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                                var5_5.add(var10_10);
                                                                                            }
                                                                                            var5_5.add("-loop");
                                                                                            var5_5.add("1");
                                                                                            var5_5.add(var7_7);
                                                                                            var10_10 = new StringBuilder();
                                                                                            var12_12 = var2_2.mTemplate.getFolder_template();
                                                                                            var10_10 = var10_10.append((String)var12_12).append((String)var15_15).toString();
                                                                                            var5_5.add(var10_10);
                                                                                            var11_11 = -var2_2.mTemplate.getmTimeModel().getWidthShape();
                                                                                            var9_9 = var11_11;
                                                                                            var41_41 = var2_2.mTemplate.getmTimeModel().getStartShape();
                                                                                            var42_42 = var9_9 += var41_41;
                                                                                            var39_40 = var4_4;
                                                                                            var44_43 = 1000.0;
                                                                                            var15_15 = String.valueOf(var39_40 /= var44_43);
                                                                                            var26_30 = var2_2.mTemplate.getmTimeModel().getWidthShape();
                                                                                            var27_31 = var26_30;
                                                                                            var14_14 = var2_2.overlay.append("[0]").append((String)var20_20);
                                                                                            var46_44 = 1;
                                                                                            var10_10 = var14_14.append(var46_44).append((String)var3_3).append("overlay=x='").append(var42_42).append("+(").append(var27_31).append("*(clip(t/").append((String)var15_15).append(",0,1))*0.8").append("+").append(var27_31).append("*(0.5-0.5*cos(PI*clip(t/").append((String)var15_15).append(",0,1)))*0.2").append(")'");
                                                                                            var14_14 = var38_39;
                                                                                            var10_10 = var10_10.append((String)var38_39);
                                                                                            var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getTop();
                                                                                            var10_10.append(var41_41).append((String)var8_8).append(1).append((String)var24_24);
                                                                                            var5_5.add(var7_7);
                                                                                            var10_10 = new StringBuilder();
                                                                                            var12_12 = var2_2.mTemplate.getFolder_template();
                                                                                            var10_10 = var10_10.append((String)var12_12);
                                                                                            var12_12 = "/line_progress.png";
                                                                                            var10_10 = var10_10.append((String)var12_12).toString();
                                                                                            var5_5.add(var10_10);
                                                                                            var10_10 = var2_2.overlay.append((String)var8_8).append(1).append((String)var3_3).append((String)var20_20);
                                                                                            var13_13 = 2;
                                                                                            var41_41 = 2.8E-45f;
                                                                                            var10_10 = var10_10.append(var13_13).append("]overlay=0:");
                                                                                            var15_15 = var2_2.mTemplate.getEntityProgressTemplate();
                                                                                            var35_36 = var15_15.getTop();
                                                                                            var10_10 = var10_10.append(var35_36).append((String)var8_8).append(var13_13);
                                                                                            var10_10.append((String)var24_24);
                                                                                            var17_17 = var25_29;
                                                                                            var16_16 = var36_37;
                                                                                            var14_14 = var37_38;
                                                                                            var28_32 = 2;
                                                                                            var35_36 = 2.8E-45f;
                                                                                            ** continue;
                                                                                        }
                                                                                        var14_14 = var17_17;
                                                                                        var10_10 = var2_2.mTemplate;
                                                                                        var11_11 = var10_10.getIpad_type();
                                                                                        var12_12 = IpadType.CASSET;
                                                                                        var13_13 = var12_12.ordinal();
                                                                                        var16_16 = "[rot";
                                                                                        if (var11_11 == var13_13 || (var11_11 = (var10_10 = var2_2.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.CASSET_IMG_BLUR).ordinal())) break block160;
                                                                                        var10_10 = var2_2.mTemplate;
                                                                                        var11_11 = var10_10.getIpad_type();
                                                                                        if (var11_11 != (var13_13 = (var12_12 = IpadType.CASSET_IMG).ordinal())) break block161;
                                                                                        var10_10 = var2_2.mTemplate;
                                                                                        var11_11 = (int)var10_10.isVideoSquare();
                                                                                        if (var11_11 != 0) {
                                                                                            var5_5.add("-stream_loop");
                                                                                            var5_5.add("-1");
                                                                                            var5_5.add(var7_7);
                                                                                            var10_10 = var2_2.mTemplate.getUri_media_video();
                                                                                            var5_5.add(var10_10);
                                                                                            var10_10 = new StringBuilder("(iw-");
                                                                                            var13_13 = var2_2.mTemplate.getWidth();
                                                                                            var10_10 = var10_10.append(var13_13).append(")/2").toString();
                                                                                            var12_12 = new StringBuilder("(ih-");
                                                                                            var46_44 = var2_2.mTemplate.getHeight();
                                                                                            var12_12 = var12_12.append(var46_44).append(")/2").toString();
                                                                                            var46_44 = var2_2.mTemplate.getWidth();
                                                                                            var47_45 = var2_2.mTemplate.getHeight();
                                                                                            var47_45 = Math.max(var46_44, var47_45);
                                                                                            var17_17 = var2_2.overlay.append((String)var20_20);
                                                                                            var48_46 /* !! */  = var18_18;
                                                                                            var49_47 = 0;
                                                                                            var50_48 = 0.0f;
                                                                                            var17_17 = var17_17.append(0);
                                                                                            var18_18 = var17_17.append(":v]scale=").append(var47_45).append((String)var19_19).append(var47_45).append(":force_original_aspect_ratio=increase[sc];[sc]crop=");
                                                                                            var47_45 = var2_2.mTemplate.getWidth();
                                                                                            var18_18 = var18_18.append(var47_45).append((String)var19_19);
                                                                                            var14_14 = var2_2.mTemplate;
                                                                                            var47_45 = var14_14.getHeight();
                                                                                            var18_18 = var18_18.append(var47_45).append((String)var19_19);
                                                                                            var10_10 = var18_18.append((String)var10_10).append((String)var19_19).append((String)var12_12).append(",format=yuva420p").append((String)var8_8);
                                                                                            var41_41 = 0.0f;
                                                                                            var10_10.append(0).append((String)var24_24);
                                                                                            var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                            var10_10 = new File((String)var12_12);
                                                                                            var13_13 = (int)var10_10.exists();
                                                                                            if (var13_13 != 0 && (var11_11 = (int)var10_10.isFile()) != 0) {
                                                                                                var5_5.add(var7_7);
                                                                                                var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                                var5_5.add(var10_10);
                                                                                                var10_10 = var2_2.overlay.append((String)var8_8);
                                                                                                var12_12 = null;
                                                                                                var10_10 = var10_10.append(0);
                                                                                                var14_14 = var37_38;
                                                                                                var10_10 = var10_10.append((String)var37_38);
                                                                                                var13_13 = 1;
                                                                                                var41_41 = 1.4E-45f;
                                                                                                var10_10 = var10_10.append(var13_13);
                                                                                                var18_18 = "]overlay[ov";
                                                                                                var10_10 = var10_10.append((String)var18_18).append(var13_13);
                                                                                                var10_10.append((String)var24_24);
                                                                                                var11_11 = 1;
                                                                                                var9_9 = 1.4E-45f;
                                                                                            } else {
                                                                                                var14_14 = var37_38;
                                                                                                var11_11 = 0;
                                                                                                var9_9 = 0.0f;
                                                                                                var10_10 = null;
                                                                                            }
                                                                                            var12_12 = new StringBuilder((String)var8_8);
                                                                                            var12_12 = var12_12.append(var11_11).append((String)var3_3).toString();
                                                                                        } else {
                                                                                            var48_46 /* !! */  = var18_18;
                                                                                            var14_14 = var37_38;
                                                                                            var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                            var10_10 = new File((String)var12_12);
                                                                                            var13_13 = (int)var10_10.exists();
                                                                                            if (var13_13 != 0 && (var11_11 = (int)var10_10.isFile()) != 0) {
                                                                                                var5_5.add(var7_7);
                                                                                                var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                                var5_5.add(var10_10);
                                                                                            }
                                                                                            var12_12 = "[0]";
                                                                                            var11_11 = 0;
                                                                                            var9_9 = 0.0f;
                                                                                            var10_10 = null;
                                                                                        }
                                                                                        var5_5.add("-loop");
                                                                                        var5_5.add("1");
                                                                                        var5_5.add(var7_7);
                                                                                        var18_18 = new StringBuilder();
                                                                                        var17_17 = var2_2.mTemplate.getFolder_template();
                                                                                        var15_15 = var18_18.append((String)var17_17).append((String)var15_15).toString();
                                                                                        var5_5.add(var15_15);
                                                                                        var2_2.overlay.append((String)var20_20).append(++var11_11).append((String)var3_3).append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append((String)var16_16).append(var11_11).append((String)var24_24);
                                                                                        var12_12 = var2_2.overlay.append((String)var12_12).append((String)var16_16).append(var11_11).append((String)var3_3);
                                                                                        var17_17 = var25_29;
                                                                                        var12_12 = var12_12.append((String)var25_29);
                                                                                        var35_36 = var2_2.mTemplate.getmTimeModel().getStartShape();
                                                                                        var12_12 = var12_12.append(var35_36).append((String)var19_19);
                                                                                        var28_32 = var2_2.mTemplate.getmTimeModel().getHeightShape();
                                                                                        var12_12.append(var28_32).append((String)var8_8).append(var11_11).append((String)var24_24);
                                                                                        var2_2.overlay.append((String)var20_20).append(var11_11).append((String)var3_3).append("rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append((String)var16_16).append(var11_11).append((String)var24_24);
                                                                                        var12_12 = var2_2.overlay.append((String)var8_8).append(var11_11).append((String)var3_3).append((String)var16_16).append(var11_11).append((String)var3_3).append((String)var25_29);
                                                                                        var28_32 = var2_2.mTemplate.getmTimeModel().getWidthShape();
                                                                                        var12_12 = var12_12.append(var28_32).append((String)var19_19);
                                                                                        var15_15 = var2_2.mTemplate.getmTimeModel();
                                                                                        var28_32 = var15_15.getHeightShape();
                                                                                        var12_12 = var12_12.append(var28_32).append((String)var8_8).append(var11_11);
                                                                                        var12_12.append((String)var24_24);
                                                                                        var28_32 = var11_11;
                                                                                        var25_29 = var22_22;
                                                                                        var16_16 = var36_37;
                                                                                        var18_18 = var48_46 /* !! */ ;
                                                                                        break block153;
                                                                                    }
                                                                                    var48_46 /* !! */  = var18_18;
                                                                                    var17_17 = var25_29;
                                                                                    var14_14 = var37_38;
                                                                                    var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                    var10_10 = new File((String)var12_12);
                                                                                    var12_12 = var2_2.mTemplate;
                                                                                    var13_13 = (int)var12_12.isVideoSquare();
                                                                                    if (var13_13 != 0 || (var13_13 = (int)var10_10.exists()) == 0 || (var11_11 = (int)var10_10.isFile()) == 0) break block162;
                                                                                    var10_10 = var2_2.mTemplate;
                                                                                    var11_11 = var10_10.getIpad_type();
                                                                                    if (var11_11 != (var13_13 = (var12_12 = IpadType.BLUE_TYPE).ordinal())) break block163;
                                                                                    var5_5.add(var7_7);
                                                                                    var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                    var5_5.add(var10_10);
                                                                                    var5_5.add(var7_7);
                                                                                    var10_10 = new StringBuilder();
                                                                                    var12_12 = var2_2.mTemplate.getFolder_template();
                                                                                    var10_10 = var10_10.append((String)var12_12).append("/line_progress.png").toString();
                                                                                    var5_5.add(var10_10);
                                                                                    var2_2.overlay.append((String)var20_20).append(1).append((String)var3_3).append("loop=loop=-1:size=1:start=0").append("[lp];");
                                                                                    var5_5.add(var7_7);
                                                                                    var10_10 = new StringBuilder();
                                                                                    var12_12 = var2_2.mTemplate.getFolder_template();
                                                                                    var10_10 = var10_10.append((String)var12_12).append((String)var15_15).toString();
                                                                                    var5_5.add(var10_10);
                                                                                    var11_11 = var2_2.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                                                                                    var13_13 = var2_2.mTemplate.getmTimeModel().getProgress_offset();
                                                                                    var29_33 = -var2_2.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                                                                                    var18_18 = var2_2.overlay.append("[lp]").append((String)var20_20);
                                                                                    var26_30 = 2;
                                                                                    var27_31 = 2.8E-45f;
                                                                                    var10_10 = var18_18.append(var26_30).append("]overlay=x=").append(var29_33).append(" + ( ((cos((t / (").append(var4_4).append("/1000.0) + 1) * PI) / 2) + 0.5) * ").append(var11_11 -= var13_13).append(" )").append(":y=0").append((String)var8_8);
                                                                                    var13_13 = 1;
                                                                                    var10_10.append(var13_13).append((String)var24_24);
                                                                                    var10_10 = var2_2.overlay;
                                                                                    var15_15 = "[0]";
                                                                                    var10_10 = var10_10.append((String)var15_15).append((String)var8_8).append(var13_13);
                                                                                    var18_18 = var48_46 /* !! */ ;
                                                                                    var10_10 = var10_10.append((String)var48_46 /* !! */ );
                                                                                    var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getLeft();
                                                                                    var10_10 = var10_10.append(var41_41).append((String)var19_19);
                                                                                    var12_12 = var2_2.mTemplate.getEntityProgressTemplate();
                                                                                    var41_41 = var12_12.getTop();
                                                                                    var10_10 = var10_10.append(var41_41).append((String)var8_8);
                                                                                    var13_13 = 2;
                                                                                    var41_41 = 2.8E-45f;
                                                                                    var10_10 = var10_10.append(var13_13);
                                                                                    var10_10.append((String)var24_24);
                                                                                    var25_29 = var22_22;
                                                                                    var16_16 = var36_37;
                                                                                    var28_32 = 2;
                                                                                    var35_36 = 2.8E-45f;
                                                                                    break block153;
                                                                                }
                                                                                var5_5.add("-loop");
                                                                                var5_5.add("1");
                                                                                var5_5.add(var7_7);
                                                                                var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                                var5_5.add(var10_10);
                                                                                var10_10 = var2_2.overlay.append("[0]format=yuv420p[ov");
                                                                                var13_13 = 0;
                                                                                var41_41 = 0.0f;
                                                                                var12_12 = null;
                                                                                var10_10 = var10_10.append(0);
                                                                                var10_10.append((String)var24_24);
                                                                                break block164;
                                                                            }
                                                                            var18_18 = var48_46 /* !! */ ;
                                                                        }
                                                                        var25_29 = var22_22;
                                                                        var16_16 = var36_37;
                                                                        var28_32 = 0;
                                                                        var35_36 = 0.0f;
                                                                        var15_15 = null;
                                                                        break block153;
                                                                    }
                                                                    var38_39 = var14_14;
                                                                    var17_17 = var25_29;
                                                                    var14_14 = var37_38;
                                                                    var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                    var10_10 = new File((String)var12_12);
                                                                    var13_13 = (int)var10_10.exists();
                                                                    if (var13_13 != 0 && (var11_11 = (int)var10_10.isFile()) != 0) {
                                                                        var5_5.add(var7_7);
                                                                        var10_10 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                        var5_5.add(var10_10);
                                                                    }
                                                                    var5_5.add("-loop");
                                                                    var5_5.add("1");
                                                                    var5_5.add(var7_7);
                                                                    var10_10 = new StringBuilder();
                                                                    var12_12 = var2_2.mTemplate.getFolder_template();
                                                                    var10_10 = var10_10.append((String)var12_12).append((String)var15_15).toString();
                                                                    var5_5.add(var10_10);
                                                                    var10_10 = var2_2.overlay.append((String)var20_20);
                                                                    var13_13 = 1;
                                                                    var10_10.append(var13_13).append((String)var3_3).append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append((String)var16_16).append(var13_13).append((String)var24_24);
                                                                    var10_10 = var2_2.overlay.append("[0]").append((String)var16_16).append(var13_13).append((String)var3_3).append((String)var17_17);
                                                                    var41_41 = var2_2.mTemplate.getmTimeModel().getStartShape();
                                                                    var10_10 = var10_10.append(var41_41).append((String)var19_19);
                                                                    var13_13 = var2_2.mTemplate.getmTimeModel().getHeightShape();
                                                                    var10_10 = var10_10.append(var13_13).append((String)var8_8);
                                                                    var13_13 = 1;
                                                                    var10_10.append(var13_13).append((String)var24_24);
                                                                    var10_10 = var2_2.overlay.append((String)var20_20).append(var13_13).append((String)var3_3);
                                                                    var15_15 = "rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000";
                                                                    var10_10.append((String)var15_15).append((String)var16_16).append(var13_13).append((String)var24_24);
                                                                    var10_10 = var2_2.overlay.append((String)var8_8).append(var13_13).append((String)var3_3).append((String)var16_16).append(var13_13).append((String)var3_3).append((String)var17_17);
                                                                    var13_13 = var2_2.mTemplate.getmTimeModel().getWidthShape();
                                                                    var10_10 = var10_10.append(var13_13).append((String)var19_19);
                                                                    var12_12 = var2_2.mTemplate.getmTimeModel();
                                                                    var13_13 = var12_12.getHeightShape();
                                                                    var10_10 = var10_10.append(var13_13).append((String)var8_8);
                                                                    var13_13 = 1;
                                                                    var41_41 = 1.4E-45f;
                                                                    var10_10 = var10_10.append(var13_13);
                                                                    var10_10.append((String)var24_24);
                                                                    var25_29 = var22_22;
                                                                    var16_16 = var36_37;
                                                                    var28_32 = 1;
                                                                    var35_36 = 1.4E-45f;
                                                                    break block153;
                                                                }
                                                                var38_39 = var17_17;
                                                                var17_17 = var25_29;
                                                                var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                var10_10 = new File((String)var12_12);
                                                                var13_13 = (int)var10_10.exists();
                                                                if (var13_13 != 0 && (var11_11 = (int)var10_10.isFile()) != 0) {
                                                                    var12_12 = var2_2.mTemplate.getQuranEntityList();
                                                                    var13_13 = var12_12.size();
                                                                    var26_30 = var2_2.mTemplate.getTranslationTemplateList().size();
                                                                    var13_13 += var26_30;
                                                                    var26_30 = (int)var2_2.mTemplate.isVideoSquare();
                                                                    var13_13 += var26_30;
                                                                    var26_30 = 1;
                                                                    var27_31 = 1.4E-45f;
                                                                    var13_13 += var26_30;
                                                                    var16_16 = var2_2.mTemplate.getEntityBismilahTemplate();
                                                                    if (var16_16 != null) {
                                                                        var26_30 = 1;
                                                                        var27_31 = 1.4E-45f;
                                                                    } else {
                                                                        var26_30 = 0;
                                                                        var27_31 = 0.0f;
                                                                        var16_16 = null;
                                                                    }
                                                                    var13_13 += var26_30;
                                                                    var16_16 = var2_2.mTemplate.getEntityIsti3adaTemplate();
                                                                    if (var16_16 != null) {
                                                                        var26_30 = 1;
                                                                        var27_31 = 1.4E-45f;
                                                                    } else {
                                                                        var26_30 = 0;
                                                                        var27_31 = 0.0f;
                                                                        var16_16 = null;
                                                                    }
                                                                    var10_10 = new CountDownLatch(var13_13 += var26_30);
                                                                    var5_5.add(var7_7);
                                                                    var12_12 = var2_2.mTemplate.getUri_bg_ffmpeg();
                                                                    var5_5.add(var12_12);
                                                                    var5_5.add(var7_7);
                                                                    var16_16 = var22_22;
                                                                    var12_12 = var2_2.generateVideoTimer(var4_4, (CountDownLatch)var10_10, (Semaphore)var22_22);
                                                                    var5_5.add(var12_12);
                                                                    var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getLeft();
                                                                    var22_22 = var10_10;
                                                                    var9_9 = var2_2.mTemplate.getmTimeModel().getPosY();
                                                                    var25_29 = var16_16;
                                                                    var27_31 = var2_2.mTemplate.getEntityProgressTemplate().getTop();
                                                                    var9_9 += var27_31;
                                                                    var16_16 = var2_2.overlay.append((String)var20_20);
                                                                    var36_37 = var8_8;
                                                                    var8_8 = null;
                                                                    var16_16 = var16_16.append(0).append((String)var14_14);
                                                                    var51_49 = 1;
                                                                    var52_50 = 1.4E-45f;
                                                                    var16_16 = var16_16.append(var51_49).append((String)var18_18);
                                                                    var16_16.append(var41_41).append((String)var19_19).append(var9_9).append("[bg];");
                                                                    var5_5.add(var7_7);
                                                                    var10_10 = new StringBuilder();
                                                                    var12_12 = var2_2.mTemplate.getFolder_template();
                                                                    var10_10 = var10_10.append((String)var12_12).append("/line_progress.png").toString();
                                                                    var5_5.add(var10_10);
                                                                    var10_10 = var2_2.overlay.append((String)var20_20);
                                                                    var41_41 = 2.8E-45f;
                                                                    var10_10.append(2).append(":v]").append("loop=loop=-1:size=1:start=0").append(",format=rgba").append("[lp];");
                                                                    var5_5.add(var7_7);
                                                                    var10_10 = new StringBuilder();
                                                                    var12_12 = var2_2.mTemplate.getFolder_template();
                                                                    var10_10 = var10_10.append((String)var12_12).append((String)var15_15).toString();
                                                                    var5_5.add(var10_10);
                                                                    var10_10 = var2_2.mTemplate;
                                                                    var11_11 = var10_10.getIpad_type();
                                                                    var12_12 = IpadType.IPAD_NEOMORPHIC;
                                                                    var13_13 = var12_12.ordinal();
                                                                    var15_15 = "[bg]";
                                                                    if (var11_11 == var13_13) {
                                                                        var11_11 = var2_2.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                                                                        var12_12 = new StringBuilder("[tmp");
                                                                        var51_49 = 2;
                                                                        var52_50 = 2.8E-45f;
                                                                        var12_12 = var12_12.append(var51_49).append((String)var3_3).toString();
                                                                        var8_8 = new StringBuilder("(");
                                                                        var48_46 /* !! */  = var18_18;
                                                                        var53_51 = var4_4;
                                                                        var55_52 = 1000.0;
                                                                        var18_18 = var8_8.append(var53_51 /= var55_52).append(")").toString();
                                                                        var16_16 = new StringBuilder("clip(t/");
                                                                        var18_18 = var16_16.append((String)var18_18).append(",0,1)").toString();
                                                                        var16_16 = new StringBuilder("(-");
                                                                        var10_10 = var16_16.append(var11_11).append("*(1-").append((String)var18_18).append("))").toString();
                                                                        var18_18 = var2_2.overlay.append("[lp][").append(3);
                                                                        var16_16 = "]overlay=x='";
                                                                        var18_18.append((String)var16_16).append((String)var10_10).append("':y=0:shortest=0").append((String)var12_12).append(";");
                                                                        var5_5.add(var7_7);
                                                                        var10_10 = new StringBuilder();
                                                                        var18_18 = var2_2.mTemplate.getFolder_template();
                                                                        var10_10 = var10_10.append((String)var18_18).append("/line_bg_tmp.png").toString();
                                                                        var5_5.add(var10_10);
                                                                        var10_10 = var2_2.overlay.append((String)var15_15).append((String)var12_12).append((String)var17_17);
                                                                        var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getLeft();
                                                                        var10_10 = var10_10.append(var41_41).append((String)var19_19);
                                                                        var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getTop();
                                                                        var10_10.append(var41_41).append("[ps];");
                                                                        var10_10 = var2_2.overlay.append("[ps][");
                                                                        var26_30 = 4;
                                                                        var27_31 = 5.6E-45f;
                                                                        var10_10 = var10_10.append(var26_30).append("]overlay='if(lte(t,0),-100,");
                                                                        var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getLeft();
                                                                        var10_10 = var10_10.append(var41_41).append(")':");
                                                                        var12_12 = var2_2.mTemplate.getEntityProgressTemplate();
                                                                        var41_41 = var12_12.getTop();
                                                                        var10_10 = var10_10.append(var41_41);
                                                                        var8_8 = var36_37;
                                                                        var10_10 = var10_10.append((String)var36_37).append(var26_30);
                                                                        var10_10.append((String)var24_24);
                                                                        var18_18 = var48_46 /* !! */ ;
                                                                    } else {
                                                                        var48_46 /* !! */  = var18_18;
                                                                        var8_8 = var36_37;
                                                                        var11_11 = var2_2.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                                                                        var13_13 = var2_2.mTemplate.getmTimeModel().getProgress_offset();
                                                                        var12_12 = var2_2.overlay.append((String)var20_20);
                                                                        var50_48 = 4.2E-45f;
                                                                        var12_12 = var12_12.append(3).append((String)var3_3).append("[lp]overlay='if(lte(t,0),-");
                                                                        var49_47 = var2_2.mTemplate.getmTimeModel().getWidth_bitmap_progress();
                                                                        var10_10 = var12_12.append(var49_47).append(",min(").append(var11_11 -= var13_13).append(",(").append(var11_11).append(" * ((cos((t / (").append(var4_4).append("/1000.0) + 1) * PI) / 2) + 0.5))))':0[ov");
                                                                        var13_13 = 2;
                                                                        var10_10.append(var13_13).append((String)var24_24);
                                                                        var10_10 = var2_2.overlay.append((String)var15_15).append((String)var36_37).append(var13_13);
                                                                        var18_18 = var48_46 /* !! */ ;
                                                                        var10_10 = var10_10.append((String)var48_46 /* !! */ );
                                                                        var41_41 = var2_2.mTemplate.getEntityProgressTemplate().getLeft();
                                                                        var10_10 = var10_10.append(var41_41).append((String)var19_19);
                                                                        var12_12 = var2_2.mTemplate.getEntityProgressTemplate();
                                                                        var41_41 = var12_12.getTop();
                                                                        var10_10 = var10_10.append(var41_41).append((String)var36_37);
                                                                        var13_13 = 3;
                                                                        var41_41 = 4.2E-45f;
                                                                        var10_10 = var10_10.append(var13_13);
                                                                        var10_10.append((String)var24_24);
                                                                        var26_30 = var13_13;
                                                                        var27_31 = var41_41;
                                                                    }
                                                                    var10_10 = var22_22;
                                                                } else {
                                                                    var25_29 = var22_22;
                                                                    var12_12 = var2_2.mTemplate.getQuranEntityList();
                                                                    var13_13 = var12_12.size();
                                                                    var28_32 = var2_2.mTemplate.getTranslationTemplateList().size();
                                                                    var13_13 += var28_32;
                                                                    var28_32 = (int)var2_2.mTemplate.isVideoSquare();
                                                                    var13_13 += var28_32;
                                                                    var15_15 = var2_2.mTemplate.getEntityBismilahTemplate();
                                                                    if (var15_15 != null) {
                                                                        var26_30 = 1;
                                                                        var27_31 = 1.4E-45f;
                                                                    } else {
                                                                        var26_30 = 0;
                                                                        var27_31 = 0.0f;
                                                                        var16_16 = null;
                                                                    }
                                                                    var13_13 += var26_30;
                                                                    var15_15 = var2_2.mTemplate.getEntityIsti3adaTemplate();
                                                                    if (var15_15 != null) {
                                                                        var26_30 = 1;
                                                                        var27_31 = 1.4E-45f;
                                                                    } else {
                                                                        var26_30 = 0;
                                                                        var27_31 = 0.0f;
                                                                        var16_16 = null;
                                                                    }
                                                                    var10_10 = new CountDownLatch(var13_13 += var26_30);
                                                                    var26_30 = 0;
                                                                    var27_31 = 0.0f;
                                                                    var16_16 = null;
                                                                }
                                                                var28_32 = var26_30;
                                                                var35_36 = var27_31;
                                                                var16_16 = var10_10;
                                                            }
                                                            var10_10 = var2_2.mTemplate;
                                                            var11_11 = (int)var10_10.isVideoSquare();
                                                            if (var11_11 == 0 || (var13_13 = (int)(var10_10 = new File((String)(var12_12 = var2_2.mTemplate.getUri_media_video()))).isFile()) == 0 || (var11_11 = (int)var10_10.exists()) == 0) break block165;
                                                            var10_10 = var2_2.renderManager;
                                                            var37_38 = var14_14;
                                                            var47_45 = var23_23;
                                                            var10_10.addTask("Video prerender", var23_23);
                                                            var10_10 = var2_2.mTemplate;
                                                            var11_11 = var10_10.getIpad_type();
                                                            var12_12 = IpadType.IPAD;
                                                            var13_13 = var12_12.ordinal();
                                                            if (var11_11 == var13_13 || (var11_11 = (var10_10 = var2_2.mTemplate).getIpad_type()) == (var13_13 = (var12_12 = IpadType.IPAD_UNBLUR).ordinal())) break block166;
                                                            var10_10 = var2_2.mTemplate;
                                                            var11_11 = var10_10.getIpad_type();
                                                            if (var11_11 != (var13_13 = (var12_12 = IpadType.IPAD_NEOMORPHIC).ordinal())) break block167;
                                                            var10_10 = var2_2.mTemplate.getSquareBitmapModel();
                                                            var48_46 /* !! */  = var18_18;
                                                            if (var10_10 != null) {
                                                                var12_12 = var25_29;
                                                                var18_18 = var2_2.preRenderMask_Circle((SquareBitmapModel)var10_10, var4_4, (CountDownLatch)var16_16, (Semaphore)var25_29);
                                                                var5_5.add(var7_7);
                                                                var5_5.add(var18_18);
                                                                var49_47 = var28_32 + 1;
                                                                var15_15 = var2_2.overlay.append((String)var8_8).append(var28_32).append((String)var3_3).append((String)var20_20).append(var49_47);
                                                                var14_14 = ":v]";
                                                                var15_15 = var15_15.append((String)var14_14).append((String)var17_17);
                                                                var57_53 = var10_10.getPosX();
                                                                var15_15 = var15_15.append(var57_53).append((String)var19_19);
                                                                var9_9 = var10_10.getPosY();
                                                                var10_10 = var15_15.append(var9_9).append((String)var8_8).append(var49_47);
                                                                var10_10.append((String)var24_24);
                                                                var28_32 = var49_47;
                                                            } else {
                                                                var12_12 = var25_29;
                                                            }
                                                            var18_18 = var24_24;
                                                            var25_29 = var16_16;
                                                            var14_14 = var21_21;
                                                            var6_6 = var23_23;
                                                            var58_54 /* !! */  = var48_46 /* !! */ ;
                                                            var16_16 = var19_19;
                                                            var59_55 = var4_4;
                                                            var60_56 = var20_20;
                                                            var20_20 = var12_12;
                                                            break block168;
                                                        }
                                                        var48_46 /* !! */  = var18_18;
                                                        var12_12 = var25_29;
                                                        var10_10 = var2_2.mTemplate;
                                                        var11_11 = var10_10.getIpad_type();
                                                        if (var11_11 == (var49_47 = (var18_18 = IpadType.BOTTOM_RECT).ordinal()) || (var11_11 = (var10_10 = var2_2.mTemplate).getIpad_type()) == (var49_47 = (var18_18 = IpadType.IPAD_CLASSIC).ordinal())) break block169;
                                                        var10_10 = var2_2.mTemplate;
                                                        var11_11 = var10_10.getIpad_type();
                                                        if (var11_11 != (var49_47 = (var18_18 = IpadType.BLACK_LAYER).ordinal()) && (var11_11 = (var10_10 = var2_2.mTemplate).getIpad_type()) != (var49_47 = (var18_18 = IpadType.GRADIENT).ordinal()) && (var11_11 = (var10_10 = var2_2.mTemplate).getIpad_type()) != (var49_47 = (var18_18 = IpadType.MASK_BRUSH).ordinal())) {
                                                            var10_10 = var2_2.mTemplate;
                                                            var11_11 = var10_10.getIpad_type();
                                                            if (var11_11 == (var49_47 = (var18_18 = IpadType.BLUE_TYPE).ordinal())) {
                                                                var14_14 = var21_21;
                                                                var10_10 = var2_2.preRenderVideoHue(var4_4, (CountDownLatch)var16_16, (Semaphore)var25_29, var21_21);
                                                                var5_5.add(var7_7);
                                                                var5_5.add(var10_10);
                                                                var10_10 = var2_2.overlay;
                                                                var18_18 = "[0]format=yuv420p[ov";
                                                                var10_10 = var10_10.append((String)var18_18).append(var28_32);
                                                                var10_10.append((String)var24_24);
                                                            } else {
                                                                var14_14 = var21_21;
                                                                var16_16.countDown();
                                                            }
                                                        } else {
                                                            var14_14 = var21_21;
                                                            var10_10 = var2_2.preRenderVideo(var4_4, (CountDownLatch)var16_16, (Semaphore)var12_12, var21_21);
                                                            var5_5.add(var7_7);
                                                            var5_5.add(var10_10);
                                                            var10_10 = var2_2.overlay;
                                                            var18_18 = "[0]format=yuv420p[ov";
                                                            var10_10 = var10_10.append((String)var18_18).append(var28_32);
                                                            var10_10.append((String)var24_24);
                                                        }
                                                        var18_18 = var24_24;
                                                        var6_6 = var28_32;
                                                        var25_29 = var16_16;
                                                        var58_54 /* !! */  = var48_46 /* !! */ ;
                                                        var16_16 = var19_19;
                                                        var59_55 = var4_4;
                                                        var60_56 = var20_20;
                                                        var20_20 = var12_12;
                                                        break block170;
                                                    }
                                                    var14_14 = var21_21;
                                                    var10_10 = var2_2.mTemplate;
                                                    var61_57 = var10_10.getSquareBitmapModel();
                                                    if (var61_57 != null) {
                                                        var10_10 = this;
                                                        var18_18 = var12_12;
                                                        var12_12 = var61_57;
                                                        var21_21 = var24_24;
                                                        var6_6 = var28_32;
                                                        var28_32 = var4_4;
                                                        var62_58 = var4_4;
                                                        var60_56 = var20_20;
                                                        var20_20 = var16_16;
                                                        var25_29 = var16_16;
                                                        var16_16 = var19_19;
                                                        var19_19 = var18_18;
                                                        var63_59 = var18_18;
                                                        var58_54 /* !! */  = var48_46 /* !! */ ;
                                                        var18_18 = var14_14;
                                                        var10_10 = this.preRender_NoMask(var61_57, var4_4, (CountDownLatch)var20_20, (Semaphore)var19_19, (String)var14_14);
                                                        var5_5.add(var7_7);
                                                        var5_5.add(var10_10);
                                                        var28_32 = var6_6 + 1;
                                                        var24_24 = var2_2.overlay.append((String)var8_8).append(var6_6).append((String)var3_3).append((String)var60_56).append(var28_32);
                                                        var10_10 = ":v]";
                                                        var24_24 = var24_24.append((String)var10_10).append((String)var17_17);
                                                        var9_9 = var61_57.getPosX();
                                                        var24_24 = var24_24.append(var9_9).append((String)var16_16);
                                                        var9_9 = var61_57.getPosY();
                                                        var24_24 = var24_24.append(var9_9).append((String)var8_8).append(var28_32);
                                                        var18_18 = var21_21;
                                                        var24_24.append(var21_21);
                                                    } else {
                                                        var18_18 = var24_24;
                                                        var63_59 = var12_12;
                                                        var6_6 = var28_32;
                                                        var25_29 = var16_16;
                                                        var62_58 = var4_4;
                                                        var58_54 /* !! */  = var48_46 /* !! */ ;
                                                        var60_56 = var20_20;
                                                        var16_16 = var19_19;
                                                    }
                                                    var59_55 = var62_58;
                                                    var6_6 = var23_23;
                                                    var20_20 = var63_59;
                                                    break block168;
                                                }
                                                var58_54 /* !! */  = var18_18;
                                                var62_58 = var4_4;
                                                var23_23 = var47_45;
                                                var14_14 = var21_21;
                                                var63_59 = var25_29;
                                                var18_18 = var24_24;
                                                var6_6 = var28_32;
                                                var60_56 = var20_20;
                                                var25_29 = var16_16;
                                                var16_16 = var19_19;
                                                var10_10 = var2_2.mTemplate.getSquareBitmapModel();
                                                var59_55 = var4_4;
                                                if (var10_10 == null) break block171;
                                                var15_15 = var25_29;
                                                var20_20 = var63_59;
                                                var12_12 = var2_2.preRenderMask_Rounded((SquareBitmapModel)var10_10, var4_4, (CountDownLatch)var25_29, (Semaphore)var63_59);
                                                var5_5.add(var7_7);
                                                var5_5.add(var12_12);
                                                var13_13 = var28_32 + 1;
                                                var24_24 = var2_2.overlay.append((String)var8_8).append(var28_32).append((String)var3_3).append((String)var60_56).append(var13_13);
                                                var15_15 = ":v]";
                                                var24_24 = var24_24.append((String)var15_15).append((String)var17_17);
                                                var35_36 = var10_10.getPosX();
                                                var24_24 = var24_24.append(var35_36).append((String)var19_19);
                                                var9_9 = var10_10.getPosY();
                                                var24_24 = var24_24.append(var9_9).append((String)var8_8).append(var13_13);
                                                var24_24.append((String)var18_18);
                                                var28_32 = var13_13;
                                                break block172;
                                            }
                                            var20_20 = var63_59;
                                            break block170;
                                        }
                                        var58_54 /* !! */  = var18_18;
                                        var37_38 = var14_14;
                                        var14_14 = var21_21;
                                        var18_18 = var24_24;
                                        var6_6 = var28_32;
                                        var60_56 = var20_20;
                                        var20_20 = var25_29;
                                        var25_29 = var16_16;
                                        var16_16 = var19_19;
                                        var59_55 = var4_4;
                                    }
                                    var28_32 = var6_6;
                                }
                                var6_6 = var23_23;
                            }
                            var64_60 = var6_6;
                            var9_9 = var2_2.mTemplate.getFps();
                            var64_60 /= var9_9;
                            var9_9 = 2.0E-4f;
                            var64_60 *= var9_9;
                            var12_12 = var2_2.mTemplate.getEntityIsti3adaTemplate();
                            var10_10 = this;
                            var36_37 = var25_29;
                            var17_17 = var20_20;
                            var22_22 = var20_20;
                            var46_44 = var59_55;
                            var19_19 = var25_29;
                            var65_61 = var59_55;
                            var17_17 = var18_18;
                            var18_18 = var5_5;
                            var21_21 = var14_14;
                            var14_14 = var16_16;
                            var27_31 = var64_60;
                            var28_32 = this.addBasmala((EntityBismilahTemplate)var12_12, var28_32, (Semaphore)var20_20, (CountDownLatch)var25_29, (List)var5_5, var64_60);
                            var12_12 = var2_2.mTemplate.getEntityBismilahTemplate();
                            var10_10 = this;
                            var26_30 = var11_11 = this.addBasmala((EntityBismilahTemplate)var12_12, var28_32, (Semaphore)var20_20, (CountDownLatch)var25_29, (List)var5_5, var64_60);
                            var49_47 = 0;
                            var50_48 = 0.0f;
                            var18_18 = null;
                            while (true) {
                                block174: {
                                    block175: {
                                        block198: {
                                            block176: {
                                                block193: {
                                                    block196: {
                                                        block197: {
                                                            block195: {
                                                                block194: {
                                                                    block187: {
                                                                        block189: {
                                                                            block191: {
                                                                                block192: {
                                                                                    block190: {
                                                                                        block188: {
                                                                                            block177: {
                                                                                                block186: {
                                                                                                    block184: {
                                                                                                        block185: {
                                                                                                            block183: {
                                                                                                                block181: {
                                                                                                                    block182: {
                                                                                                                        block180: {
                                                                                                                            block178: {
                                                                                                                                block179: {
                                                                                                                                    block173: {
                                                                                                                                        var10_10 = var2_2.mTemplate.getQuranEntityList();
                                                                                                                                        var11_11 = var10_10.size();
                                                                                                                                        var19_19 = ")'[ov";
                                                                                                                                        var20_20 = ":enable='between(t,";
                                                                                                                                        var15_15 = ",";
                                                                                                                                        if (var49_47 >= var11_11) break;
                                                                                                                                        var66_62 = var10_10 = var2_2.mTemplate.getQuranEntityList().get(var49_47);
                                                                                                                                        var66_62 = (EntityQuranTemplate)var10_10;
                                                                                                                                        var41_41 = Math.abs(var66_62.getStart());
                                                                                                                                        cfr_temp_0 = var41_41 - (var9_9 = Math.abs(var66_62.getEnd()));
                                                                                                                                        var67_63 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                                                                                        if (var67_63 < 0) break block173;
                                                                                                                                        var68_64 = var64_60;
                                                                                                                                        var67_63 = var49_47;
                                                                                                                                        var28_32 = var26_30;
                                                                                                                                        var69_65 = var3_3;
                                                                                                                                        var70_66 = var60_56;
                                                                                                                                        var16_16 = var5_5;
                                                                                                                                        var60_56 = var7_7;
                                                                                                                                        var19_19 = var14_14;
                                                                                                                                        var24_24 = var17_17;
                                                                                                                                        var7_7 = var37_38;
                                                                                                                                        var18_18 = var58_54 /* !! */ ;
                                                                                                                                        var17_17 = var8_8;
                                                                                                                                        break block174;
                                                                                                                                    }
                                                                                                                                    var36_37 = var15_15;
                                                                                                                                    var48_46 /* !! */  = var20_20;
                                                                                                                                    var20_20 = new StringBuilder();
                                                                                                                                    var71_67 = var19_19;
                                                                                                                                    var19_19 = var2_2.mTemplate.getFolder_template();
                                                                                                                                    var20_20 = var20_20.append((String)var19_19).append("/");
                                                                                                                                    var19_19 = var66_62.getFile();
                                                                                                                                    var15_15 = new File((String)(var20_20 = var20_20.append((String)var19_19).toString()));
                                                                                                                                    var72_68 = (int)var15_15.exists();
                                                                                                                                    if (var72_68 == 0 || (var72_68 = (int)var15_15.isFile()) == 0 || (var28_32 = (int)((cfr_temp_1 = (var73_69 = var15_15.length()) - (var75_70 = 0L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) <= 0) break block175;
                                                                                                                                    var15_15 = var66_62.getTransition();
                                                                                                                                    if (var15_15 == null) break block176;
                                                                                                                                    var15_15 = var66_62.getTransition();
                                                                                                                                    var28_32 = (int)var15_15.isOut();
                                                                                                                                    if (var28_32 == 0) ** GOTO lbl-1000
                                                                                                                                    var15_15 = var66_62.getTransition();
                                                                                                                                    var35_36 = var15_15.getDuration_out();
                                                                                                                                    var72_68 = 0;
                                                                                                                                    var77_71 = 0.0f;
                                                                                                                                    var20_20 = null;
                                                                                                                                    cfr_temp_2 = var35_36 - 0.0f;
                                                                                                                                    var28_32 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                                                                                    if (var28_32 > 0) {
                                                                                                                                        var28_32 = 1;
                                                                                                                                        var35_36 = 1.4E-45f;
                                                                                                                                    } else lbl-1000:
                                                                                                                                    // 2 sources

                                                                                                                                    {
                                                                                                                                        var28_32 = 0;
                                                                                                                                        var35_36 = 0.0f;
                                                                                                                                        var15_15 = null;
                                                                                                                                    }
                                                                                                                                    var20_20 = var66_62.getTransition();
                                                                                                                                    var72_68 = (int)var20_20.isIn();
                                                                                                                                    if (var72_68 == 0) ** GOTO lbl-1000
                                                                                                                                    var20_20 = var66_62.getTransition();
                                                                                                                                    var77_71 = var20_20.getDuration_in();
                                                                                                                                    var59_55 = 0;
                                                                                                                                    var78_72 = 0.0f;
                                                                                                                                    var19_19 = null;
                                                                                                                                    cfr_temp_3 = var77_71 - 0.0f;
                                                                                                                                    var72_68 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                                                                                                    if (var72_68 > 0) {
                                                                                                                                        var72_68 = 1;
                                                                                                                                        var77_71 = 1.4E-45f;
                                                                                                                                    } else lbl-1000:
                                                                                                                                    // 2 sources

                                                                                                                                    {
                                                                                                                                        var72_68 = 0;
                                                                                                                                        var77_71 = 0.0f;
                                                                                                                                        var20_20 = null;
                                                                                                                                    }
                                                                                                                                    var19_19 = "[seg";
                                                                                                                                    var68_64 = var64_60;
                                                                                                                                    var24_24 = "/TB";
                                                                                                                                    var63_59 = var14_14;
                                                                                                                                    var14_14 = "setpts=PTS-STARTPTS+";
                                                                                                                                    var79_73 = var8_8;
                                                                                                                                    var8_8 = "][seg";
                                                                                                                                    if (var72_68 == 0 || var28_32 == 0) break block177;
                                                                                                                                    var77_71 = var66_62.getTransition().getDuration_in();
                                                                                                                                    var35_36 = var66_62.getBtm_x();
                                                                                                                                    var80_74 = var8_8;
                                                                                                                                    var52_50 = var66_62.getBtm_y();
                                                                                                                                    var81_75 = var66_62.getTransition();
                                                                                                                                    var82_76 = var81_75.getFromW();
                                                                                                                                    var83_77 = var66_62.getTransition();
                                                                                                                                    var84_78 = var52_50;
                                                                                                                                    var8_8 = var83_77.getType_in();
                                                                                                                                    var83_77 = TransitionType.FADE_IN;
                                                                                                                                    var85_79 = var35_36;
                                                                                                                                    var15_15 = var83_77.getValue();
                                                                                                                                    var28_32 = (int)var8_8.equals(var15_15);
                                                                                                                                    if (var28_32 != 0) break block178;
                                                                                                                                    var15_15 = var66_62.getTransition().getType_out();
                                                                                                                                    var83_77 = TransitionType.FADE_OUT;
                                                                                                                                    var69_65 = var19_19;
                                                                                                                                    var19_19 = var83_77.getValue();
                                                                                                                                    var28_32 = (int)var15_15.equals(var19_19);
                                                                                                                                    if (var28_32 != 0) break block179;
                                                                                                                                    var15_15 = var66_62.getTransition();
                                                                                                                                    var78_72 = var15_15.getDuration_out();
                                                                                                                                    var35_36 = Math.abs(var9_9 - var78_72);
                                                                                                                                    var86_80 = var49_47;
                                                                                                                                    var50_48 = var35_36 - var41_41;
                                                                                                                                    var18_18 = var2_2.fadeInOut(var50_48, var77_71, var78_72);
                                                                                                                                    var87_81 = var35_36;
                                                                                                                                    var35_36 = var9_9 - var41_41;
                                                                                                                                    var28_32 = (int)var35_36;
                                                                                                                                    var88_82 = var9_9;
                                                                                                                                    var10_10 = this;
                                                                                                                                    var70_66 = var8_8;
                                                                                                                                    var52_50 = var41_41;
                                                                                                                                    var12_12 = var66_62;
                                                                                                                                    var89_83 = var36_37;
                                                                                                                                    var90_84 = var85_79;
                                                                                                                                    var67_63 = var28_32;
                                                                                                                                    var28_32 = var26_30;
                                                                                                                                    var85_79 = var77_71;
                                                                                                                                    var91_85 = var48_46 /* !! */ ;
                                                                                                                                    var20_20 = var18_18;
                                                                                                                                    var92_86 = var78_72;
                                                                                                                                    var93_87 = var71_67;
                                                                                                                                    var18_18 = var69_65;
                                                                                                                                    var59_55 = (int)var67_63;
                                                                                                                                    var71_67 = var17_17;
                                                                                                                                    var67_63 = var49_47;
                                                                                                                                    var17_17 = var69_65;
                                                                                                                                    var18_18 = var25_29;
                                                                                                                                    var46_44 = var26_30;
                                                                                                                                    var16_16 = var22_22;
                                                                                                                                    var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var26_30, (String)var20_20, var59_55, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                                                                                    if (var10_10 == null) {
                                                                                                                                        var69_65 = var3_3;
                                                                                                                                        var70_66 = var60_56;
                                                                                                                                        var16_16 = var5_5;
                                                                                                                                        var60_56 = var7_7;
                                                                                                                                        var7_7 = var37_38;
                                                                                                                                        var24_24 = var71_67;
                                                                                                                                        var19_19 = var63_59;
                                                                                                                                        var18_18 = var58_54 /* !! */ ;
                                                                                                                                        var17_17 = var79_73;
                                                                                                                                    } else {
                                                                                                                                        var5_5.add(var7_7);
                                                                                                                                        var5_5.add(var10_10);
                                                                                                                                        var24_24 = var2_2.overlay.append((String)var60_56).append(++var26_30).append((String)var3_3).append((String)var14_14).append(var41_41).append((String)var24_24);
                                                                                                                                        var18_18 = var69_65;
                                                                                                                                        var24_24 = var24_24.append((String)var69_65).append(var26_30);
                                                                                                                                        var14_14 = var71_67;
                                                                                                                                        var24_24.append((String)var71_67);
                                                                                                                                        var24_24 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                                                                        var10_10 = var8_8;
                                                                                                                                        var6_6 = (int)var8_8.equals(var24_24);
                                                                                                                                        if (var6_6 != 0) {
                                                                                                                                            var64_60 = var90_84;
                                                                                                                                            var94_88 = var90_84 - var82_76;
                                                                                                                                            var49_47 = -1082130432;
                                                                                                                                            var50_48 = -1.0f;
                                                                                                                                            var86_80 = 0;
                                                                                                                                            var95_89 = 0.0f;
                                                                                                                                            var83_77 = null;
                                                                                                                                            var10_10 = this;
                                                                                                                                            var35_36 = var77_71;
                                                                                                                                            var77_71 = var90_84;
                                                                                                                                            var78_72 = var82_76;
                                                                                                                                            var69_65 = var3_3;
                                                                                                                                            var96_90 = var26_30;
                                                                                                                                            var26_30 = 0;
                                                                                                                                            var16_16 = null;
                                                                                                                                            var27_31 = 0.0f;
                                                                                                                                            var10_10 = this.mSlideX(var41_41, var85_79, var90_84, var82_76, var50_48, 0.0f);
                                                                                                                                        } else {
                                                                                                                                            var69_65 = var3_3;
                                                                                                                                            var64_60 = var90_84;
                                                                                                                                            var96_90 = var26_30;
                                                                                                                                            var94_88 = var90_84 + var82_76;
                                                                                                                                            var49_47 = 1065353216;
                                                                                                                                            var50_48 = 1.0f;
                                                                                                                                            var26_30 = 0;
                                                                                                                                            var27_31 = 0.0f;
                                                                                                                                            var16_16 = null;
                                                                                                                                            var10_10 = this;
                                                                                                                                            var35_36 = var77_71;
                                                                                                                                            var77_71 = var90_84;
                                                                                                                                            var78_72 = var82_76;
                                                                                                                                            var10_10 = this.mSlideX(var41_41, var85_79, var90_84, var82_76, var50_48, 0.0f);
                                                                                                                                        }
                                                                                                                                        var16_16 = var10_10;
                                                                                                                                        var50_48 = var94_88;
                                                                                                                                        var10_10 = var66_62.getTransition().getType_out();
                                                                                                                                        var12_12 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                                                                        var11_11 = (int)var10_10.equals(var12_12);
                                                                                                                                        if (var11_11 != 0) {
                                                                                                                                            var97_91 = var64_60 + var82_76;
                                                                                                                                            var94_88 = 0.0f;
                                                                                                                                            var86_80 = 1065353216;
                                                                                                                                            var95_89 = 1.0f;
                                                                                                                                            var10_10 = this;
                                                                                                                                            var41_41 = var87_81;
                                                                                                                                            var35_36 = var92_86;
                                                                                                                                            var77_71 = var64_60;
                                                                                                                                            var78_72 = var82_76;
                                                                                                                                            var70_66 = var60_56;
                                                                                                                                            var98_92 = var50_48;
                                                                                                                                            var49_47 = 0;
                                                                                                                                            var18_18 = null;
                                                                                                                                            var50_48 = 0.0f;
                                                                                                                                            var71_67 = var5_5;
                                                                                                                                            var5_5 = var16_16;
                                                                                                                                            var26_30 = var86_80;
                                                                                                                                            var27_31 = var95_89;
                                                                                                                                            var10_10 = this.mSlideX(var87_81, var92_86, var64_60, var82_76, 0.0f, var95_89);
                                                                                                                                        } else {
                                                                                                                                            var70_66 = var60_56;
                                                                                                                                            var71_67 = var5_5;
                                                                                                                                            var98_92 = var94_88;
                                                                                                                                            var5_5 = var16_16;
                                                                                                                                            var97_91 = var64_60 - var82_76;
                                                                                                                                            var49_47 = 0;
                                                                                                                                            var50_48 = 0.0f;
                                                                                                                                            var18_18 = null;
                                                                                                                                            var26_30 = -1082130432;
                                                                                                                                            var27_31 = -1.0f;
                                                                                                                                            var10_10 = this;
                                                                                                                                            var41_41 = var87_81;
                                                                                                                                            var35_36 = var92_86;
                                                                                                                                            var77_71 = var64_60;
                                                                                                                                            var78_72 = var82_76;
                                                                                                                                            var10_10 = this.mSlideX(var87_81, var92_86, var64_60, var82_76, 0.0f, var27_31);
                                                                                                                                        }
                                                                                                                                        var41_41 = var97_91;
                                                                                                                                        var15_15 = new StringBuilder("'if(lt(t,");
                                                                                                                                        var15_15 = var15_15.append(var52_50).append("),").append(var98_92).append(",if(lt(t,");
                                                                                                                                        var98_92 = var85_79;
                                                                                                                                        var77_71 = var52_50 + var85_79;
                                                                                                                                        var15_15 = var15_15.append(var77_71).append("),").append((String)var5_5).append(",if(lt(t,");
                                                                                                                                        var77_71 = var87_81;
                                                                                                                                        var24_24 = var15_15.append(var87_81).append("),").append(var64_60).append(",if(lt(t,");
                                                                                                                                        var35_36 = var87_81 + var92_86;
                                                                                                                                        var24_24 = var24_24.append(var35_36);
                                                                                                                                        var15_15 = "),";
                                                                                                                                        var24_24 = var24_24.append((String)var15_15).append((String)var10_10);
                                                                                                                                        var5_5 = var89_83;
                                                                                                                                        var24_24 = var24_24.append((String)var89_83).append(var97_91).append("))))'").toString();
                                                                                                                                        var10_10 = var2_2.overlay;
                                                                                                                                        var16_16 = var79_73;
                                                                                                                                        var10_10 = var10_10.append((String)var79_73).append(var46_44);
                                                                                                                                        var19_19 = var80_74;
                                                                                                                                        var24_24 = var10_10.append((String)var80_74).append(var96_90).append("]overlay=x=").append((String)var24_24);
                                                                                                                                        var20_20 = var38_39;
                                                                                                                                        var24_24 = var24_24.append((String)var38_39);
                                                                                                                                        var35_36 = var84_78;
                                                                                                                                        var24_24 = var24_24.append(var84_78);
                                                                                                                                        var12_12 = var91_85;
                                                                                                                                        var24_24 = var24_24.append((String)var91_85).append(var52_50).append((String)var89_83);
                                                                                                                                        var9_9 = var88_82;
                                                                                                                                        var24_24 = var24_24.append(var88_82);
                                                                                                                                        var10_10 = var93_87;
                                                                                                                                        var24_24.append((String)var93_87).append(var96_90).append((String)var14_14);
                                                                                                                                        var17_17 = var79_73;
                                                                                                                                        var28_32 = var96_90;
                                                                                                                                        var60_56 = var7_7;
                                                                                                                                        var24_24 = var14_14;
                                                                                                                                        var7_7 = var37_38;
                                                                                                                                        var16_16 = var71_67;
                                                                                                                                        var19_19 = var63_59;
                                                                                                                                        var18_18 = var58_54 /* !! */ ;
                                                                                                                                    }
                                                                                                                                    break block174;
                                                                                                                                }
                                                                                                                                var70_66 = var60_56;
                                                                                                                                var89_83 = var36_37;
                                                                                                                                var99_93 = var71_67;
                                                                                                                                var19_19 = var80_74;
                                                                                                                                var35_36 = var52_50;
                                                                                                                                var90_84 = var85_79;
                                                                                                                                var98_92 = var77_71;
                                                                                                                                var67_63 = var49_47;
                                                                                                                                var71_67 = var5_5;
                                                                                                                                var5_5 = var17_17;
                                                                                                                                var20_20 = var38_39;
                                                                                                                                var18_18 = var69_65;
                                                                                                                                var46_44 = var26_30;
                                                                                                                                var69_65 = var3_3;
                                                                                                                                var16_16 = var79_73;
                                                                                                                                var100_94 = var9_9;
                                                                                                                                var10_10 = var8_8;
                                                                                                                                var52_50 = var41_41;
                                                                                                                                var12_12 = var48_46 /* !! */ ;
                                                                                                                                break block180;
                                                                                                                            }
                                                                                                                            var69_65 = var3_3;
                                                                                                                            var70_66 = var60_56;
                                                                                                                            var89_83 = var36_37;
                                                                                                                            var99_93 = var71_67;
                                                                                                                            var35_36 = var52_50;
                                                                                                                            var90_84 = var85_79;
                                                                                                                            var100_94 = var9_9;
                                                                                                                            var98_92 = var77_71;
                                                                                                                            var67_63 = var49_47;
                                                                                                                            var71_67 = var5_5;
                                                                                                                            var10_10 = var8_8;
                                                                                                                            var5_5 = var17_17;
                                                                                                                            var20_20 = var38_39;
                                                                                                                            var52_50 = var41_41;
                                                                                                                            var18_18 = var19_19;
                                                                                                                            var46_44 = var26_30;
                                                                                                                            var12_12 = var48_46 /* !! */ ;
                                                                                                                            var16_16 = var79_73;
                                                                                                                            var19_19 = var80_74;
                                                                                                                        }
                                                                                                                        var38_39 = TransitionType.FADE_IN;
                                                                                                                        var91_85 = var12_12;
                                                                                                                        var12_12 = var38_39.getValue();
                                                                                                                        var13_13 = (int)var10_10.equals(var12_12);
                                                                                                                        if (var13_13 == 0) break block181;
                                                                                                                        var41_41 = var66_62.getTransition().getDuration_out();
                                                                                                                        var101_95 = Math.abs(var100_94 - var41_41);
                                                                                                                        var48_46 /* !! */  = var10_10 = var66_62.getTransition().getType_out();
                                                                                                                        var9_9 = var101_95 - var52_50;
                                                                                                                        var60_56 = var2_2.fadeInOut(var9_9, var98_92, var41_41);
                                                                                                                        var9_9 = var100_94 - var52_50;
                                                                                                                        var11_11 = (int)var9_9;
                                                                                                                        var88_82 = var100_94;
                                                                                                                        var3_3 = var10_10;
                                                                                                                        var10_10 = this;
                                                                                                                        var102_96 = var41_41;
                                                                                                                        var103_97 = var91_85;
                                                                                                                        var12_12 = var66_62;
                                                                                                                        var104_98 = var35_36;
                                                                                                                        var28_32 = var46_44;
                                                                                                                        var105_99 = var20_20;
                                                                                                                        var20_20 = var60_56;
                                                                                                                        var60_56 = var19_19;
                                                                                                                        var59_55 = var11_11;
                                                                                                                        var80_74 = var19_19;
                                                                                                                        var60_56 = var18_18;
                                                                                                                        var18_18 = var25_29;
                                                                                                                        var106_100 = var16_16;
                                                                                                                        var16_16 = var22_22;
                                                                                                                        var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var46_44, (String)var20_20, var11_11, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                                                                        if (var10_10 != null) break block182;
                                                                                                                        var24_24 = var5_5;
                                                                                                                        var60_56 = var7_7;
                                                                                                                        var7_7 = var37_38;
                                                                                                                        var16_16 = var71_67;
                                                                                                                        var19_19 = var63_59;
                                                                                                                        var18_18 = var58_54 /* !! */ ;
                                                                                                                        var38_39 = var105_99;
                                                                                                                        var17_17 = var106_100;
                                                                                                                        break block174;
                                                                                                                    }
                                                                                                                    var16_16 = var71_67;
                                                                                                                    var71_67.add(var7_7);
                                                                                                                    var71_67.add(var10_10);
                                                                                                                    var49_47 = var46_44 + 1;
                                                                                                                    var10_10 = var2_2.overlay;
                                                                                                                    var19_19 = var70_66;
                                                                                                                    var10_10 = var10_10.append((String)var70_66).append(var49_47);
                                                                                                                    var20_20 = var69_65;
                                                                                                                    var10_10 = var10_10.append((String)var69_65).append((String)var14_14).append(var52_50);
                                                                                                                    var10_10.append((String)var24_24).append((String)var60_56).append(var49_47).append((String)var5_5);
                                                                                                                    var24_24 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                                                                    var6_6 = (int)var48_46 /* !! */ .equals(var24_24);
                                                                                                                    if (var6_6 != 0) {
                                                                                                                        var6_6 = 0;
                                                                                                                        var64_60 = 0.0f;
                                                                                                                        var96_90 = 1065353216;
                                                                                                                        var100_94 = 1.0f;
                                                                                                                        var10_10 = this;
                                                                                                                        var41_41 = var101_95;
                                                                                                                        var35_36 = var102_96;
                                                                                                                        var60_56 = var69_65;
                                                                                                                        var77_71 = var90_84;
                                                                                                                        var14_14 = var70_66;
                                                                                                                        var78_72 = var82_76;
                                                                                                                        var4_4 = var49_47;
                                                                                                                        var49_47 = 0;
                                                                                                                        var18_18 = null;
                                                                                                                        var50_48 = 0.0f;
                                                                                                                        var14_14 = var71_67;
                                                                                                                        var26_30 = var96_90;
                                                                                                                        var27_31 = var100_94;
                                                                                                                        var24_24 = this.slideX(var101_95, var102_96, var90_84, var82_76, 0.0f, var100_94);
                                                                                                                    } else {
                                                                                                                        var4_4 = var49_47;
                                                                                                                        var14_14 = var71_67;
                                                                                                                        var24_24 = TransitionType.SLIDE_TO_LEFT.getValue();
                                                                                                                        var6_6 = (int)var48_46 /* !! */ .equals(var24_24);
                                                                                                                        if (var6_6 != 0) {
                                                                                                                            var49_47 = 0;
                                                                                                                            var50_48 = 0.0f;
                                                                                                                            var18_18 = null;
                                                                                                                            var26_30 = -1082130432;
                                                                                                                            var27_31 = -1.0f;
                                                                                                                            var10_10 = this;
                                                                                                                            var41_41 = var101_95;
                                                                                                                            var35_36 = var102_96;
                                                                                                                            var77_71 = var90_84;
                                                                                                                            var78_72 = var82_76;
                                                                                                                            var24_24 = this.slideX(var101_95, var102_96, var90_84, var82_76, 0.0f, var27_31);
                                                                                                                        } else {
                                                                                                                            var10_10 = "";
                                                                                                                            var24_24 = new StringBuilder((String)var10_10);
                                                                                                                            var100_94 = var90_84;
                                                                                                                            var24_24 = var24_24.append(var90_84).toString();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var10_10 = var2_2.overlay;
                                                                                                                    var16_16 = var106_100;
                                                                                                                    var10_10 = var10_10.append((String)var106_100).append(var46_44);
                                                                                                                    var12_12 = var80_74;
                                                                                                                    var10_10 = var10_10.append((String)var80_74).append(var4_4);
                                                                                                                    var18_18 = var58_54 /* !! */ ;
                                                                                                                    var24_24 = var10_10.append((String)var58_54 /* !! */ ).append((String)var24_24);
                                                                                                                    var19_19 = var105_99;
                                                                                                                    var24_24 = var24_24.append((String)var105_99);
                                                                                                                    var77_71 = var104_98;
                                                                                                                    var24_24 = var24_24.append(var104_98);
                                                                                                                    var15_15 = var103_97;
                                                                                                                    var24_24 = var24_24.append((String)var103_97).append(var52_50);
                                                                                                                    var12_12 = var89_83;
                                                                                                                    var24_24 = var24_24.append((String)var89_83);
                                                                                                                    var9_9 = var88_82;
                                                                                                                    var24_24 = var24_24.append(var88_82);
                                                                                                                    var10_10 = var99_93;
                                                                                                                    var24_24 = var24_24.append((String)var99_93).append(var4_4);
                                                                                                                    var24_24.append((String)var5_5);
                                                                                                                    var38_39 = var105_99;
                                                                                                                    var17_17 = var106_100;
                                                                                                                    ** GOTO lbl1429
                                                                                                                }
                                                                                                                var38_39 = var24_24;
                                                                                                                var107_101 = var19_19;
                                                                                                                var48_46 /* !! */  = var14_14;
                                                                                                                var14_14 = var71_67;
                                                                                                                var24_24 = var70_66;
                                                                                                                var12_12 = var89_83;
                                                                                                                var19_19 = var20_20;
                                                                                                                var71_67 = var5_5;
                                                                                                                var77_71 = var35_36;
                                                                                                                var108_102 = var98_92;
                                                                                                                var60_56 = var69_65;
                                                                                                                var15_15 = var91_85;
                                                                                                                var69_65 = var18_18;
                                                                                                                var18_18 = var58_54 /* !! */ ;
                                                                                                                var58_54 /* !! */  = TransitionType.SLIDE_TO_RIGHT;
                                                                                                                var12_12 = var58_54 /* !! */ .getValue();
                                                                                                                var13_13 = (int)var10_10.equals(var12_12);
                                                                                                                if (var13_13 == 0) break block183;
                                                                                                                var9_9 = var66_62.getTransition().getDuration_out();
                                                                                                                var41_41 = Math.abs(var100_94 - var9_9) - var52_50;
                                                                                                                var58_54 /* !! */  = var2_2.fadeInOut(var41_41, var98_92, var9_9);
                                                                                                                var9_9 = var100_94 - var52_50;
                                                                                                                var13_13 = (int)var9_9;
                                                                                                                var10_10 = this;
                                                                                                                var109_103 = var13_13;
                                                                                                                var88_82 = var100_94;
                                                                                                                var3_3 = var89_83;
                                                                                                                var12_12 = var66_62;
                                                                                                                var3_3 = var91_85;
                                                                                                                var28_32 = var46_44;
                                                                                                                var100_94 = var35_36;
                                                                                                                var20_20 = var58_54 /* !! */ ;
                                                                                                                var84_78 = var35_36;
                                                                                                                var3_3 = var19_19;
                                                                                                                var59_55 = var13_13;
                                                                                                                var105_99 = var19_19;
                                                                                                                var3_3 = var18_18;
                                                                                                                var18_18 = var25_29;
                                                                                                                var58_54 /* !! */  = var3_3;
                                                                                                                var3_3 = var16_16;
                                                                                                                var16_16 = var22_22;
                                                                                                                var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var46_44, (String)var20_20, var13_13, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                                                                if (var10_10 == null) {
                                                                                                                    var69_65 = var60_56;
                                                                                                                    var60_56 = var7_7;
                                                                                                                    var16_16 = var14_14;
                                                                                                                    var7_7 = var37_38;
                                                                                                                    var24_24 = var5_5;
                                                                                                                    var19_19 = var63_59;
                                                                                                                    var18_18 = var58_54 /* !! */ ;
                                                                                                                    var38_39 = var105_99;
                                                                                                                    var17_17 = var3_3;
                                                                                                                } else {
                                                                                                                    var14_14.add(var7_7);
                                                                                                                    var14_14.add(var10_10);
                                                                                                                    var26_30 = var46_44 + 1;
                                                                                                                    var10_10 = var2_2.overlay.append((String)var70_66).append(var26_30).append((String)var60_56);
                                                                                                                    var18_18 = var48_46 /* !! */ ;
                                                                                                                    var10_10 = var10_10.append((String)var48_46 /* !! */ ).append(var52_50);
                                                                                                                    var19_19 = var38_39;
                                                                                                                    var10_10 = var10_10.append((String)var38_39);
                                                                                                                    var20_20 = var69_65;
                                                                                                                    var10_10 = var10_10.append((String)var69_65).append(var26_30);
                                                                                                                    var18_18 = var5_5;
                                                                                                                    var10_10.append((String)var5_5);
                                                                                                                    var23_23 = -1082130432;
                                                                                                                    var97_91 = -1.0f;
                                                                                                                    var101_95 = 0.0f;
                                                                                                                    var10_10 = this;
                                                                                                                    var41_41 = var52_50;
                                                                                                                    var35_36 = var98_92;
                                                                                                                    var77_71 = var90_84;
                                                                                                                    var78_72 = var82_76;
                                                                                                                    var49_47 = var23_23;
                                                                                                                    var50_48 = var97_91;
                                                                                                                    var69_65 = var60_56;
                                                                                                                    var4_4 = var26_30;
                                                                                                                    var26_30 = 0;
                                                                                                                    var27_31 = 0.0f;
                                                                                                                    var10_10 = this.slideX(var52_50, var98_92, var90_84, var82_76, var97_91, 0.0f);
                                                                                                                    var12_12 = var2_2.overlay.append((String)var3_3).append(var46_44);
                                                                                                                    var16_16 = var107_101;
                                                                                                                    var12_12 = var12_12.append((String)var107_101).append(var4_4);
                                                                                                                    var15_15 = var58_54 /* !! */ ;
                                                                                                                    var10_10 = var12_12.append((String)var58_54 /* !! */ ).append((String)var10_10);
                                                                                                                    var12_12 = var105_99;
                                                                                                                    var10_10 = var10_10.append((String)var105_99);
                                                                                                                    var77_71 = var100_94;
                                                                                                                    var10_10 = var10_10.append(var100_94);
                                                                                                                    var20_20 = var91_85;
                                                                                                                    var10_10 = var10_10.append((String)var91_85).append(var52_50);
                                                                                                                    var20_20 = var89_83;
                                                                                                                    var10_10 = var10_10.append((String)var89_83);
                                                                                                                    var77_71 = var88_82;
                                                                                                                    var10_10 = var10_10.append(var88_82);
                                                                                                                    var20_20 = var99_93;
                                                                                                                    var10_10 = var10_10.append((String)var99_93).append(var4_4);
                                                                                                                    var10_10.append((String)var5_5);
                                                                                                                    var38_39 = var105_99;
                                                                                                                    var18_18 = var58_54 /* !! */ ;
                                                                                                                    var17_17 = var3_3;
lbl1429:
                                                                                                                    // 2 sources

                                                                                                                    var28_32 = var4_4;
                                                                                                                    var24_24 = var5_5;
                                                                                                                    var60_56 = var7_7;
                                                                                                                    var16_16 = var14_14;
                                                                                                                    var7_7 = var37_38;
                                                                                                                    var19_19 = var63_59;
                                                                                                                }
                                                                                                                break block174;
                                                                                                            }
                                                                                                            var110_104 = var35_36;
                                                                                                            var12_12 = var20_20;
                                                                                                            var15_15 = var18_18;
                                                                                                            var79_73 = var16_16;
                                                                                                            var19_19 = var38_39;
                                                                                                            var18_18 = var48_46 /* !! */ ;
                                                                                                            var20_20 = var69_65;
                                                                                                            var16_16 = var107_101;
                                                                                                            var69_65 = var60_56;
                                                                                                            var98_92 = var100_94;
                                                                                                            var3_3 = var5_5;
                                                                                                            var38_39 = TransitionType.SLIDE_TO_LEFT;
                                                                                                            var105_99 = var12_12;
                                                                                                            var12_12 = var38_39.getValue();
                                                                                                            var11_11 = (int)var10_10.equals(var12_12);
                                                                                                            if (var11_11 == 0) break block184;
                                                                                                            var9_9 = var66_62.getTransition().getDuration_out();
                                                                                                            var41_41 = Math.abs(var100_94 - var9_9) - var52_50;
                                                                                                            var38_39 = var2_2.fadeInOut(var41_41, var108_102, var9_9);
                                                                                                            var9_9 = var100_94 - var52_50;
                                                                                                            var13_13 = (int)var9_9;
                                                                                                            var10_10 = this;
                                                                                                            var88_82 = var100_94;
                                                                                                            var60_56 = var105_99;
                                                                                                            var12_12 = var66_62;
                                                                                                            var60_56 = var15_15;
                                                                                                            var28_32 = var46_44;
                                                                                                            var58_54 /* !! */  = var15_15;
                                                                                                            var60_56 = var20_20;
                                                                                                            var20_20 = var38_39;
                                                                                                            var85_79 = var108_102;
                                                                                                            var5_5 = var19_19;
                                                                                                            var59_55 = var13_13;
                                                                                                            var3_3 = var48_46 /* !! */ ;
                                                                                                            var18_18 = var25_29;
                                                                                                            var16_16 = var22_22;
                                                                                                            var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var46_44, (String)var38_39, var13_13, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                                                            if (var10_10 != null) break block185;
                                                                                                            var60_56 = var7_7;
                                                                                                            var16_16 = var14_14;
                                                                                                            var7_7 = var37_38;
                                                                                                            var24_24 = var71_67;
                                                                                                            var19_19 = var63_59;
                                                                                                            var18_18 = var15_15;
                                                                                                            break block186;
                                                                                                        }
                                                                                                        var14_14.add(var7_7);
                                                                                                        var14_14.add(var10_10);
                                                                                                        var26_30 = var46_44 + 1;
                                                                                                        var10_10 = var2_2.overlay.append((String)var70_66).append(var26_30);
                                                                                                        var18_18 = var69_65;
                                                                                                        var10_10 = var10_10.append((String)var69_65).append((String)var48_46 /* !! */ ).append(var52_50).append((String)var19_19).append((String)var60_56).append(var26_30);
                                                                                                        var3_3 = var71_67;
                                                                                                        var10_10.append((String)var71_67);
                                                                                                        var98_92 = 1.0f;
                                                                                                        var111_105 = 0;
                                                                                                        var108_102 = 0.0f;
                                                                                                        var5_5 = null;
                                                                                                        var10_10 = this;
                                                                                                        var41_41 = var52_50;
                                                                                                        var35_36 = var85_79;
                                                                                                        var77_71 = var90_84;
                                                                                                        var78_72 = var82_76;
                                                                                                        var112_106 = var69_65;
                                                                                                        var49_47 = 1065353216;
                                                                                                        var50_48 = var98_92;
                                                                                                        var4_4 = var26_30;
                                                                                                        var26_30 = 0;
                                                                                                        var27_31 = 0.0f;
                                                                                                        var10_10 = this.slideX(var52_50, var85_79, var90_84, var82_76, var98_92, 0.0f);
                                                                                                        var12_12 = var2_2.overlay;
                                                                                                        var16_16 = var79_73;
                                                                                                        var12_12 = var12_12.append((String)var79_73).append(var46_44);
                                                                                                        var18_18 = var107_101;
                                                                                                        var12_12 = var12_12.append((String)var107_101).append(var4_4);
                                                                                                        var19_19 = var15_15;
                                                                                                        var10_10 = var12_12.append((String)var15_15).append((String)var10_10);
                                                                                                        var12_12 = var105_99;
                                                                                                        var10_10 = var10_10.append((String)var105_99);
                                                                                                        var35_36 = var110_104;
                                                                                                        var10_10 = var10_10.append(var110_104);
                                                                                                        var15_15 = var91_85;
                                                                                                        var10_10 = var10_10.append((String)var91_85).append(var52_50);
                                                                                                        var15_15 = var89_83;
                                                                                                        var10_10 = var10_10.append((String)var89_83);
                                                                                                        var35_36 = var100_94;
                                                                                                        var10_10 = var10_10.append(var100_94);
                                                                                                        var15_15 = var99_93;
                                                                                                        var10_10 = var10_10.append((String)var99_93).append(var4_4);
                                                                                                        var10_10.append((String)var71_67);
                                                                                                        var38_39 = var105_99;
                                                                                                        var18_18 = var58_54 /* !! */ ;
                                                                                                        var17_17 = var79_73;
                                                                                                        var24_24 = var71_67;
                                                                                                        var28_32 = var4_4;
                                                                                                        var60_56 = var7_7;
                                                                                                        var16_16 = var14_14;
                                                                                                        var7_7 = var37_38;
                                                                                                        var19_19 = var63_59;
                                                                                                        break block174;
                                                                                                    }
                                                                                                    var18_18 = var15_15;
                                                                                                    var24_24 = var5_5;
                                                                                                    var60_56 = var7_7;
                                                                                                    var16_16 = var14_14;
                                                                                                    var28_32 = var46_44;
                                                                                                    var7_7 = var37_38;
                                                                                                    var19_19 = var63_59;
                                                                                                }
                                                                                                var17_17 = var79_73;
                                                                                                var38_39 = var105_99;
                                                                                                break block174;
                                                                                            }
                                                                                            var112_106 = var3_3;
                                                                                            var3_3 = var14_14;
                                                                                            var113_107 = var17_17;
                                                                                            var114_108 = var48_46 /* !! */ ;
                                                                                            var115_109 = var71_67;
                                                                                            var67_63 = var49_47;
                                                                                            var46_44 = var26_30;
                                                                                            var14_14 = var5_5;
                                                                                            var18_18 = var8_8;
                                                                                            var16_16 = var79_73;
                                                                                            var5_5 = var24_24;
                                                                                            var52_50 = var41_41;
                                                                                            var24_24 = var60_56;
                                                                                            var12_12 = var38_39;
                                                                                            var60_56 = var19_19;
                                                                                            var19_19 = var58_54 /* !! */ ;
                                                                                            if (var72_68 == 0) break block187;
                                                                                            var15_15 = var66_62.getTransition();
                                                                                            var77_71 = var15_15.getDuration_in();
                                                                                            var35_36 = var66_62.getBtm_x();
                                                                                            var69_65 = var60_56;
                                                                                            var98_92 = var66_62.getBtm_y();
                                                                                            var38_39 = var66_62.getTransition();
                                                                                            var101_95 = var38_39.getFromW();
                                                                                            var48_46 /* !! */  = var66_62.getTransition();
                                                                                            var94_88 = var98_92;
                                                                                            var60_56 = var48_46 /* !! */ .getType_in();
                                                                                            var105_99 = var12_12;
                                                                                            var48_46 /* !! */  = var60_56;
                                                                                            var4_4 = 1;
                                                                                            var116_110 /* !! */  = var2_2.mFadeFilter(0.0f, var77_71, (boolean)var4_4);
                                                                                            var41_41 = var9_9 - var41_41;
                                                                                            var13_13 = (int)var41_41;
                                                                                            var98_92 = var9_9;
                                                                                            var10_10 = this;
                                                                                            var109_103 = var13_13;
                                                                                            var12_12 = var66_62;
                                                                                            var88_82 = var9_9;
                                                                                            var98_92 = var35_36;
                                                                                            var28_32 = var26_30;
                                                                                            var97_91 = var77_71;
                                                                                            var20_20 = var116_110 /* !! */ ;
                                                                                            var117_111 = var35_36;
                                                                                            var60_56 = var58_54 /* !! */ ;
                                                                                            var59_55 = var13_13;
                                                                                            var79_73 = var58_54 /* !! */ ;
                                                                                            var60_56 = var8_8;
                                                                                            var18_18 = var25_29;
                                                                                            var80_74 = var8_8;
                                                                                            var60_56 = var16_16;
                                                                                            var16_16 = var22_22;
                                                                                            var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var26_30, var116_110 /* !! */ , var13_13, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                                            if (var10_10 != null) break block188;
                                                                                            var70_66 = var24_24;
                                                                                            var16_16 = var14_14;
                                                                                            var19_19 = var63_59;
                                                                                            var18_18 = var58_54 /* !! */ ;
                                                                                            var69_65 = var112_106;
                                                                                            var24_24 = var17_17;
                                                                                            var38_39 = var105_99;
                                                                                            var17_17 = var60_56;
                                                                                            var60_56 = var7_7;
                                                                                            break block189;
                                                                                        }
                                                                                        var14_14.add(var7_7);
                                                                                        var14_14.add(var10_10);
                                                                                        var10_10 = var2_2.overlay.append((String)var24_24).append(++var26_30);
                                                                                        var18_18 = var112_106;
                                                                                        var10_10 = var10_10.append((String)var112_106).append((String)var3_3).append(var52_50).append((String)var5_5);
                                                                                        var19_19 = var69_65;
                                                                                        var10_10 = var10_10.append((String)var69_65).append(var26_30);
                                                                                        var3_3 = var17_17;
                                                                                        var10_10.append((String)var17_17);
                                                                                        var10_10 = TransitionType.FADE_IN.getValue();
                                                                                        var12_12 = var48_46 /* !! */ ;
                                                                                        var11_11 = (int)var48_46 /* !! */ .equals(var10_10);
                                                                                        if (var11_11 == 0) break block190;
                                                                                        var10_10 = var2_2.overlay.append((String)var60_56).append(var46_44);
                                                                                        var5_5 = var8_8;
                                                                                        var10_10 = var10_10.append((String)var8_8).append(var26_30);
                                                                                        var19_19 = var58_54 /* !! */ ;
                                                                                        var10_10 = var10_10.append((String)var58_54 /* !! */ );
                                                                                        var77_71 = var35_36;
                                                                                        var10_10 = var10_10.append(var35_36);
                                                                                        var15_15 = var63_59;
                                                                                        var10_10 = var10_10.append((String)var63_59);
                                                                                        var41_41 = var94_88;
                                                                                        var10_10 = var10_10.append(var94_88);
                                                                                        var12_12 = var114_108;
                                                                                        var10_10 = var10_10.append((String)var114_108).append(var52_50);
                                                                                        var12_12 = var36_37;
                                                                                        var10_10 = var10_10.append((String)var36_37);
                                                                                        var41_41 = var9_9;
                                                                                        var10_10 = var10_10.append(var9_9);
                                                                                        var12_12 = var71_67;
                                                                                        var10_10 = var10_10.append((String)var71_67).append(var26_30);
                                                                                        var10_10.append((String)var17_17);
                                                                                        var70_66 = var24_24;
                                                                                        var118_112 = var63_59;
                                                                                        var119_113 = var112_106;
                                                                                        var6_6 = var26_30;
                                                                                        var38_39 = var7_7;
                                                                                        var71_67 = var14_14;
                                                                                        var7_7 = var105_99;
                                                                                        var14_14 = var58_54 /* !! */ ;
                                                                                        break block191;
                                                                                    }
                                                                                    var77_71 = var35_36;
                                                                                    var15_15 = var63_59;
                                                                                    var19_19 = var58_54 /* !! */ ;
                                                                                    var5_5 = var8_8;
                                                                                    var116_110 /* !! */  = TransitionType.SLIDE_TO_RIGHT;
                                                                                    var10_10 = var116_110 /* !! */ .getValue();
                                                                                    var11_11 = (int)var48_46 /* !! */ .equals(var10_10);
                                                                                    if (var11_11 == 0) break block192;
                                                                                    var120_114 = -1082130432;
                                                                                    var117_111 = -1.0f;
                                                                                    var92_86 = 0.0f;
                                                                                    var48_46 /* !! */  = null;
                                                                                    var41_41 = var9_9;
                                                                                    var10_10 = this;
                                                                                    var41_41 = var52_50;
                                                                                    var118_112 = var63_59;
                                                                                    var35_36 = var97_91;
                                                                                    var78_72 = var101_95;
                                                                                    var119_113 = var112_106;
                                                                                    var49_47 = var120_114;
                                                                                    var50_48 = var117_111;
                                                                                    var70_66 = var24_24;
                                                                                    var6_6 = var26_30;
                                                                                    var26_30 = 0;
                                                                                    var27_31 = 0.0f;
                                                                                    var10_10 = this.slideX(var52_50, var97_91, var98_92, var101_95, var117_111, 0.0f);
                                                                                    var12_12 = var2_2.overlay.append((String)var60_56).append(var46_44).append((String)var8_8).append(var6_6);
                                                                                    var16_16 = var58_54 /* !! */ ;
                                                                                    var10_10 = var12_12.append((String)var58_54 /* !! */ ).append((String)var10_10);
                                                                                    var18_18 = var105_99;
                                                                                    var10_10 = var10_10.append((String)var105_99);
                                                                                    var78_72 = var94_88;
                                                                                    var10_10 = var10_10.append(var94_88);
                                                                                    var15_15 = var114_108;
                                                                                    var10_10 = var10_10.append((String)var114_108).append(var52_50);
                                                                                    var12_12 = var36_37;
                                                                                    var10_10 = var10_10.append((String)var36_37);
                                                                                    var41_41 = var9_9;
                                                                                    var10_10 = var10_10.append(var9_9);
                                                                                    var12_12 = var71_67;
                                                                                    var10_10 = var10_10.append((String)var71_67).append(var6_6);
                                                                                    var10_10.append((String)var17_17);
                                                                                    ** GOTO lbl-1000
                                                                                }
                                                                                var70_66 = var24_24;
                                                                                var118_112 = var63_59;
                                                                                var119_113 = var112_106;
                                                                                var6_6 = var26_30;
                                                                                var18_18 = var105_99;
                                                                                var15_15 = var114_108;
                                                                                var16_16 = var58_54 /* !! */ ;
                                                                                var78_72 = var94_88;
                                                                                var116_110 /* !! */  = TransitionType.SLIDE_TO_LEFT;
                                                                                var10_10 = var116_110 /* !! */ .getValue();
                                                                                var11_11 = (int)var48_46 /* !! */ .equals(var10_10);
                                                                                if (var11_11 != 0) {
                                                                                    var120_114 = 1065353216;
                                                                                    var117_111 = 1.0f;
                                                                                    var92_86 = 0.0f;
                                                                                    var48_46 /* !! */  = null;
                                                                                    var41_41 = var9_9;
                                                                                    var10_10 = this;
                                                                                    var41_41 = var52_50;
                                                                                    var35_36 = var97_91;
                                                                                    var78_72 = var101_95;
                                                                                    var38_39 = var7_7;
                                                                                    var7_7 = var105_99;
                                                                                    var49_47 = var120_114;
                                                                                    var50_48 = var117_111;
                                                                                    var71_67 = var14_14;
                                                                                    var14_14 = var58_54 /* !! */ ;
                                                                                    var26_30 = 0;
                                                                                    var27_31 = 0.0f;
                                                                                    var10_10 = this.slideX(var52_50, var97_91, var98_92, var101_95, var117_111, 0.0f);
                                                                                    var10_10 = var2_2.overlay.append((String)var60_56).append(var46_44).append((String)var8_8).append(var6_6).append((String)var58_54 /* !! */ ).append((String)var10_10).append((String)var105_99);
                                                                                    var41_41 = var94_88;
                                                                                    var10_10 = var10_10.append(var94_88);
                                                                                    var16_16 = var114_108;
                                                                                    var10_10 = var10_10.append((String)var114_108).append(var52_50);
                                                                                    var18_18 = var36_37;
                                                                                    var10_10 = var10_10.append((String)var36_37);
                                                                                    var77_71 = var9_9;
                                                                                    var10_10 = var10_10.append(var9_9);
                                                                                    var12_12 = var115_109;
                                                                                    var10_10 = var10_10.append((String)var115_109).append(var6_6);
                                                                                    var10_10.append((String)var17_17);
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var38_39 = var7_7;
                                                                                    var71_67 = var14_14;
                                                                                    var7_7 = var18_18;
                                                                                    var14_14 = var16_16;
                                                                                }
                                                                            }
                                                                            var28_32 = var6_6;
                                                                            var24_24 = var3_3;
                                                                            var17_17 = var60_56;
                                                                            var18_18 = var14_14;
                                                                            var60_56 = var38_39;
                                                                            var16_16 = var71_67;
                                                                            var19_19 = var118_112;
                                                                            var69_65 = var119_113;
                                                                            var38_39 = var7_7;
                                                                        }
                                                                        var7_7 = var37_38;
                                                                        break block174;
                                                                    }
                                                                    var70_66 = var24_24;
                                                                    var77_71 = var9_9;
                                                                    var24_24 = var8_8;
                                                                    var38_39 = var7_7;
                                                                    var71_67 = var14_14;
                                                                    var118_112 = var63_59;
                                                                    var119_113 = var112_106;
                                                                    var18_18 = var36_37;
                                                                    var10_10 = var17_17;
                                                                    var7_7 = var12_12;
                                                                    var14_14 = var58_54 /* !! */ ;
                                                                    var19_19 = var60_56;
                                                                    var12_12 = var115_109;
                                                                    var60_56 = var79_73;
                                                                    var16_16 = var48_46 /* !! */ ;
                                                                    if (var28_32 == 0) break block193;
                                                                    var15_15 = var66_62.getTransition();
                                                                    var35_36 = var15_15.getDuration_out();
                                                                    var117_111 = Math.abs(var9_9 - var35_36);
                                                                    var105_99 = var7_7;
                                                                    var121_115 = var66_62.getBtm_x();
                                                                    var48_46 /* !! */  = var58_54 /* !! */ ;
                                                                    var57_53 = var66_62.getBtm_y();
                                                                    var63_59 = var66_62.getTransition();
                                                                    var122_116 = var63_59.getFromW();
                                                                    var79_73 = var66_62.getTransition();
                                                                    var14_14 = var79_73.getType_out();
                                                                    var11_11 = (int)(var9_9 - var41_41);
                                                                    var93_87 = var115_109;
                                                                    var41_41 = (float)var11_11 - var35_36;
                                                                    var109_103 = var11_11;
                                                                    var11_11 = 0;
                                                                    var9_9 = 0.0f;
                                                                    var81_75 = var2_2.mFadeFilter(var41_41, var35_36, false);
                                                                    var12_12 = var17_17;
                                                                    var10_10 = this;
                                                                    var107_101 = var8_8;
                                                                    var24_24 = var17_17;
                                                                    var12_12 = var66_62;
                                                                    var97_91 = var35_36;
                                                                    var28_32 = var26_30;
                                                                    var123_117 = var77_71;
                                                                    var20_20 = var81_75;
                                                                    var106_100 = var60_56;
                                                                    var60_56 = var19_19;
                                                                    var59_55 = var109_103;
                                                                    var18_18 = var25_29;
                                                                    var16_16 = var22_22;
                                                                    var10_10 = this.generateVideoSegment((EntityQuranTemplate)var66_62, var26_30, (String)var81_75, var109_103, (CountDownLatch)var25_29, (Semaphore)var22_22);
                                                                    if (var10_10 != null) break block194;
                                                                    var7_7 = var37_38;
                                                                    var60_56 = var38_39;
                                                                    var18_18 = var58_54 /* !! */ ;
                                                                    var16_16 = var71_67;
                                                                    var38_39 = var105_99;
                                                                    var17_17 = var106_100;
                                                                    var19_19 = var118_112;
                                                                    var69_65 = var112_106;
                                                                    break block174;
                                                                }
                                                                var18_18 = var38_39;
                                                                var16_16 = var71_67;
                                                                var71_67.add(var38_39);
                                                                var71_67.add(var10_10);
                                                                var59_55 = var26_30 + 1;
                                                                var10_10 = TransitionType.SLIDE_TO_RIGHT.getValue();
                                                                var11_11 = (int)var14_14.equals(var10_10);
                                                                if (var11_11 == 0) break block195;
                                                                var10_10 = var2_2.overlay;
                                                                var14_14 = var70_66;
                                                                var10_10 = var10_10.append((String)var70_66).append(var59_55);
                                                                var20_20 = var112_106;
                                                                var10_10.append((String)var112_106).append((String)var3_3).append(var52_50).append((String)var5_5).append((String)var19_19).append(var59_55).append((String)var17_17);
                                                                var96_90 = 0;
                                                                var100_94 = 0.0f;
                                                                var4_4 = 1065353216;
                                                                var98_92 = 1.0f;
                                                                var10_10 = this;
                                                                var41_41 = var117_111;
                                                                var5_5 = var112_106;
                                                                var77_71 = var121_115;
                                                                var124_118 = var59_55;
                                                                var78_72 = var122_116;
                                                                var125_119 = var38_39;
                                                                var49_47 = 0;
                                                                var50_48 = 0.0f;
                                                                var3_3 = var71_67;
                                                                var26_30 = var4_4;
                                                                var27_31 = var98_92;
                                                                var10_10 = this.slideX(var117_111, var35_36, var121_115, var122_116, 0.0f, var98_92);
                                                                var12_12 = var2_2.overlay;
                                                                var16_16 = var106_100;
                                                                var12_12 = var12_12.append((String)var106_100).append(var46_44);
                                                                var18_18 = var8_8;
                                                                var12_12 = var12_12.append((String)var8_8).append(var59_55);
                                                                var19_19 = var58_54 /* !! */ ;
                                                                var10_10 = var12_12.append((String)var58_54 /* !! */ ).append((String)var10_10);
                                                                var20_20 = var7_7;
                                                                var10_10 = var10_10.append((String)var7_7);
                                                                var35_36 = var57_53;
                                                                var10_10 = var10_10.append(var57_53);
                                                                var12_12 = var114_108;
                                                                var10_10 = var10_10.append((String)var114_108).append(var52_50);
                                                                var12_12 = var36_37;
                                                                var10_10 = var10_10.append((String)var36_37);
                                                                var41_41 = var123_117;
                                                                var10_10 = var10_10.append(var123_117);
                                                                var12_12 = ")'";
                                                                var10_10 = var10_10.append((String)var12_12).append((String)var106_100).append(var59_55);
                                                                var10_10.append((String)var17_17);
                                                                var38_39 = var7_7;
                                                                var18_18 = var58_54 /* !! */ ;
                                                                var17_17 = var106_100;
                                                                var26_30 = var59_55;
                                                                var19_19 = var118_112;
                                                                var14_14 = var112_106;
                                                                break block196;
                                                            }
                                                            var125_119 = var38_39;
                                                            var10_10 = var71_67;
                                                            var35_36 = var57_53;
                                                            var18_18 = var70_66;
                                                            var20_20 = var7_7;
                                                            var79_73 = var106_100;
                                                            var80_74 = var8_8;
                                                            var17_17 = var112_106;
                                                            var12_12 = var114_108;
                                                            var26_30 = var59_55;
                                                            var19_19 = var58_54 /* !! */ ;
                                                            var48_46 /* !! */  = TransitionType.SLIDE_TO_LEFT;
                                                            var10_10 = var48_46 /* !! */ .getValue();
                                                            var11_11 = (int)var14_14.equals(var10_10);
                                                            if (var11_11 == 0) break block197;
                                                            var2_2.overlay.append((String)var70_66).append(var59_55).append((String)var112_106).append((String)var3_3).append(var52_50).append((String)var5_5).append((String)var60_56).append(var59_55).append((String)var113_107);
                                                            var100_94 = 0.0f;
                                                            var3_3 = null;
                                                            var4_4 = -1082130432;
                                                            var98_92 = -1.0f;
                                                            var5_5 = var71_67;
                                                            var10_10 = this;
                                                            var14_14 = var114_108;
                                                            var41_41 = var117_111;
                                                            var35_36 = var97_91;
                                                            var77_71 = var121_115;
                                                            var7_7 = var58_54 /* !! */ ;
                                                            var78_72 = var122_116;
                                                            var69_65 = var112_106;
                                                            var5_5 = var8_8;
                                                            var17_17 = var70_66;
                                                            var49_47 = 0;
                                                            var96_90 = var59_55;
                                                            var17_17 = var106_100;
                                                            var26_30 = var4_4;
                                                            var27_31 = var98_92;
                                                            var10_10 = this.slideX(var117_111, var97_91, var121_115, var122_116, 0.0f, var98_92);
                                                            var10_10 = var2_2.overlay.append((String)var106_100).append(var46_44).append((String)var8_8).append(var59_55).append((String)var58_54 /* !! */ ).append((String)var10_10);
                                                            var12_12 = var105_99;
                                                            var10_10 = var10_10.append((String)var105_99);
                                                            var77_71 = var57_53;
                                                            var10_10 = var10_10.append(var57_53).append((String)var114_108).append(var52_50);
                                                            var19_19 = var36_37;
                                                            var10_10 = var10_10.append((String)var36_37);
                                                            var50_48 = var123_117;
                                                            var10_10 = var10_10.append(var123_117);
                                                            var15_15 = ")'";
                                                            var10_10 = var10_10.append((String)var15_15).append((String)var106_100).append(var59_55);
                                                            var10_10.append((String)var113_107);
                                                            var38_39 = var105_99;
                                                            var26_30 = var59_55;
                                                            var18_18 = var58_54 /* !! */ ;
                                                            ** GOTO lbl-1000
                                                        }
                                                        var10_10 = var114_108;
                                                        var12_12 = var5_5;
                                                        var69_65 = var112_106;
                                                        var17_17 = var106_100;
                                                        var5_5 = var8_8;
                                                        var88_82 = var77_71;
                                                        var18_18 = var58_54 /* !! */ ;
                                                        var19_19 = var36_37;
                                                        var77_71 = var57_53;
                                                        var38_39 = var7_7;
                                                        var116_110 /* !! */  = TransitionType.FADE_OUT;
                                                        var89_83 = var36_37;
                                                        var19_19 = var116_110 /* !! */ .getValue();
                                                        var59_55 = (int)var14_14.equals(var19_19);
                                                        if (var59_55 != 0) {
                                                            var19_19 = var2_2.overlay;
                                                            var14_14 = var70_66;
                                                            var19_19 = var19_19.append((String)var70_66).append(var26_30);
                                                            var14_14 = var112_106;
                                                            var19_19.append((String)var112_106).append((String)var3_3).append(var52_50).append((String)var12_12).append((String)var60_56).append(var26_30).append((String)var113_107);
                                                            var12_12 = var2_2.overlay.append((String)var106_100).append(var46_44).append((String)var8_8).append(var26_30).append((String)var58_54 /* !! */ ).append(var121_115);
                                                            var19_19 = var118_112;
                                                            var10_10 = var12_12.append((String)var118_112).append(var57_53).append((String)var114_108).append(var52_50);
                                                            var12_12 = var36_37;
                                                            var10_10 = var10_10.append((String)var36_37);
                                                            var77_71 = var123_117;
                                                            var10_10 = var10_10.append(var123_117);
                                                            var3_3 = var115_109;
                                                            var10_10 = var10_10.append((String)var115_109).append(var26_30);
                                                            var10_10.append((String)var113_107);
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var14_14 = var69_65;
                                                            var19_19 = var118_112;
                                                        }
                                                    }
                                                    var28_32 = var26_30;
                                                    var69_65 = var14_14;
                                                    var7_7 = var37_38;
                                                    var16_16 = var71_67;
                                                    var60_56 = var125_119;
                                                    break block174;
                                                }
                                                var24_24 = var17_17;
                                                var3_3 = var115_109;
                                                var12_12 = var36_37;
                                                var10_10 = var48_46 /* !! */ ;
                                                var18_18 = var58_54 /* !! */ ;
                                                var28_32 = var26_30;
                                                var125_119 = var38_39;
                                                var19_19 = var63_59;
                                                var14_14 = var112_106;
                                                var17_17 = var79_73;
                                                var38_39 = var7_7;
                                                var16_16 = var71_67;
                                                var60_56 = var125_119;
                                                break block198;
                                            }
                                            var68_64 = var64_60;
                                            var77_71 = var9_9;
                                            var28_32 = var26_30;
                                            var70_66 = var60_56;
                                            var19_19 = var14_14;
                                            var24_24 = var17_17;
                                            var10_10 = var48_46 /* !! */ ;
                                            var14_14 = var3_3;
                                            var17_17 = var8_8;
                                            var3_3 = var71_67;
                                            var52_50 = var41_41;
                                            var12_12 = var36_37;
                                            var67_63 = var49_47;
                                            var18_18 = var58_54 /* !! */ ;
                                            var16_16 = var5_5;
                                            var60_56 = var7_7;
                                        }
                                        var16_16.add(var60_56);
                                        var5_5 = new StringBuilder();
                                        var7_7 = var2_2.mTemplate.getFolder_template();
                                        var5_5 = var5_5.append((String)var7_7).append("/");
                                        var7_7 = var66_62.getFile();
                                        var5_5 = var5_5.append((String)var7_7).toString();
                                        var16_16.add(var5_5);
                                        var111_105 = var28_32 + 1;
                                        var15_15 = var2_2.overlay.append((String)var17_17).append(var28_32);
                                        var7_7 = var37_38;
                                        var15_15 = var15_15.append((String)var37_38).append(var111_105).append((String)var18_18);
                                        var69_65 = var14_14;
                                        var57_53 = var66_62.getBtm_x();
                                        var15_15 = var15_15.append(var57_53).append((String)var19_19);
                                        var57_53 = var66_62.getBtm_y();
                                        var15_15 = var15_15.append(var57_53);
                                        var10_10 = var15_15.append((String)var10_10).append(var52_50).append((String)var12_12);
                                        var41_41 = Math.abs(var77_71 - var68_64);
                                        var10_10 = var10_10.append(var41_41).append((String)var3_3).append(var111_105);
                                        var10_10.append((String)var24_24);
                                        var25_29.countDown();
                                        var28_32 = var111_105;
                                        break block174;
                                    }
                                    var68_64 = var64_60;
                                    var67_63 = var49_47;
                                    var28_32 = var26_30;
                                    var69_65 = var3_3;
                                    var70_66 = var60_56;
                                    var16_16 = var5_5;
                                    var60_56 = var7_7;
                                    var19_19 = var14_14;
                                    var24_24 = var17_17;
                                    var7_7 = var37_38;
                                    var18_18 = var58_54 /* !! */ ;
                                    var17_17 = var8_8;
                                    var25_29.countDown();
                                }
                                var11_11 = (int)(var67_63 + true);
                                var14_14 = var19_19;
                                var58_54 /* !! */  = var18_18;
                                var5_5 = var16_16;
                                var37_38 = var7_7;
                                var8_8 = var17_17;
                                var3_3 = var69_65;
                                var17_17 = var24_24;
                                var49_47 = var11_11;
                                var26_30 = var28_32;
                                var7_7 = var60_56;
                                var64_60 = var68_64;
                                var60_56 = var70_66;
                            }
                            var68_64 = var64_60;
                            var12_12 = var15_15;
                            var10_10 = var20_20;
                            var28_32 = var26_30;
                            var69_65 = var3_3;
                            var70_66 = var60_56;
                            var16_16 = var5_5;
                            var60_56 = var7_7;
                            var24_24 = var17_17;
                            var7_7 = var37_38;
                            var18_18 = var58_54 /* !! */ ;
                            var3_3 = var19_19;
                            var17_17 = var8_8;
                            var19_19 = var14_14;
                            var72_68 = var26_30;
                            var28_32 = 0;
                            var35_36 = 0.0f;
                            var15_15 = null;
                            while (var28_32 < (var111_105 = (var5_5 = var2_2.mTemplate.getTranslationTemplateList()).size())) {
                                block200: {
                                    block199: {
                                        var5_5 = (EntityTranslationTemplate)var2_2.mTemplate.getTranslationTemplateList().get(var28_32);
                                        var52_50 = Math.abs(var5_5.getStart());
                                        cfr_temp_4 = var52_50 - (var57_53 = Math.abs(var5_5.getEnd()));
                                        var62_58 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                        if (var62_58 < 0) break block199;
                                        var8_8 = var24_24;
                                        var62_58 = var28_32;
                                        var5_5 = var3_3;
                                        var96_90 = 0;
                                        var100_94 = 0.0f;
                                        var3_3 = null;
                                        break block200;
                                    }
                                    var62_58 = var28_32;
                                    var71_67 = var24_24;
                                    var24_24 = new StringBuilder();
                                    var93_87 = var3_3;
                                    var3_3 = var2_2.mTemplate.getFolder_template();
                                    var24_24 = var24_24.append((String)var3_3).append("/");
                                    var3_3 = var5_5.getFile();
                                    var15_15 = new File((String)(var24_24 = var24_24.append((String)var3_3).toString()));
                                    var6_6 = (int)var15_15.exists();
                                    if (var6_6 == 0 || (var6_6 = (int)var15_15.isFile()) == 0) ** GOTO lbl-1000
                                    var126_120 = var15_15.length();
                                    var31_34 = 0L;
                                    var33_35 = 0.0;
                                    var6_6 = var126_120 == var31_34 ? 0 : (var126_120 < var31_34 ? -1 : 1);
                                    if (var6_6 > 0) {
                                        var16_16.add(var60_56);
                                        var24_24 = new StringBuilder();
                                        var15_15 = var2_2.mTemplate.getFolder_template();
                                        var24_24 = var24_24.append((String)var15_15).append("/");
                                        var15_15 = var5_5.getFile();
                                        var24_24 = var24_24.append((String)var15_15).toString();
                                        var16_16.add(var24_24);
                                        var6_6 = var72_68 + 1;
                                        var15_15 = var2_2.overlay.append((String)var17_17).append(var72_68).append((String)var7_7).append(var6_6).append((String)var18_18);
                                        var96_90 = 0;
                                        var100_94 = 0.0f;
                                        var3_3 = null;
                                        var15_15 = var15_15.append(0).append((String)var19_19);
                                        var77_71 = var5_5.getBtm_y();
                                        var15_15 = var15_15.append(var77_71).append((String)var10_10).append(var52_50).append((String)var12_12);
                                        var77_71 = Math.abs(var57_53 -= var68_64);
                                        var15_15 = var15_15.append(var77_71);
                                        var5_5 = var93_87;
                                        var15_15 = var15_15.append((String)var93_87).append(var6_6);
                                        var8_8 = var71_67;
                                        var15_15.append((String)var71_67);
                                        var25_29.countDown();
                                        var72_68 = var6_6;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var8_8 = var71_67;
                                        var5_5 = var93_87;
                                        var96_90 = 0;
                                        var100_94 = 0.0f;
                                        var3_3 = null;
                                        var25_29.countDown();
                                    }
                                }
                                var28_32 = var62_58 + 1;
                                var3_3 = var5_5;
                                var24_24 = var8_8;
                            }
                            var8_8 = var24_24;
                            var96_90 = 0;
                            var100_94 = 0.0f;
                            var3_3 = null;
                            var24_24 = new StringBuilder((String)var17_17);
                            var24_24 = var24_24.append(var72_68);
                            var10_10 = var69_65;
                            var12_12 = var24_24.append((String)var69_65).toString();
                            var24_24 = "";
                            var28_32 = 0;
                            var15_15 = null;
                            var35_36 = 0.0f;
                            var59_55 = 0;
                            var19_19 = null;
                            var78_72 = 0.0f;
                            while (true) {
                                block154: {
                                    block155: {
                                        var18_18 = var2_2.mTemplate;
                                        var18_18 = var18_18.getEntityMediaList();
                                        var49_47 = var18_18.size();
                                        if (var28_32 >= var49_47) break;
                                        var18_18 = var2_2.mTemplate;
                                        var18_18 = var18_18.getEntityMediaList();
                                        var18_18 = var18_18.get(var28_32);
                                        var18_18 = (EntityMedia)var18_18;
                                        var108_102 = var18_18.getEnd();
                                        var121_115 = var18_18.getStart();
                                        var111_105 = var108_102 == var121_115 ? 0 : (var108_102 < var121_115 ? -1 : 1);
                                        if (var111_105 < 0) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                var22_22 = var12_12;
                                                var71_67 = var16_16;
                                                var38_39 = var60_56;
                                                var16_16 = var70_66;
                                                break block154;
                                                break;
                                            }
                                        }
                                        var7_7 = var18_18.getPath_ffmpeg_effect();
                                        var5_5 = new File((String)var7_7);
                                        var124_118 = var5_5.isFile();
                                        if (var124_118 == 0) ** GOTO lbl-1000
                                        var111_105 = (int)var5_5.exists();
                                        if (var111_105 != 0) ** break;
                                        ** continue;
                                        var16_16.add(var60_56);
                                        var5_5 = var18_18.getPath_ffmpeg_effect();
                                        var16_16.add(var5_5);
                                        ++var72_68;
                                        var108_102 = var18_18.getStart();
                                        var124_118 = 1148846080;
                                        var121_115 = 1000.0f;
                                        var108_102 /= var121_115;
                                        var108_102 = Utils.f2(var108_102);
                                        var121_115 = var18_18.getEnd();
                                        var47_45 = 1148846080;
                                        var57_53 = 1000.0f;
                                        var121_115 /= var57_53;
                                        var121_115 = Utils.f2(var121_115);
                                        var57_53 = var18_18.getPosXFFmpeg();
                                        var47_45 = Math.round(var57_53);
                                        var128_121 = var47_45;
                                        var3_3 = new StringBuilder();
                                        var38_39 = var60_56;
                                        var60_56 = "a";
                                        var3_3 = var3_3.append((String)var60_56);
                                        var3_3 = var3_3.append(var28_32);
                                        var3_3 = var3_3.toString();
                                        var60_56 = new StringBuilder();
                                        var22_22 = var12_12;
                                        var12_12 = "d";
                                        var12_12 = var60_56.append((String)var12_12);
                                        var12_12 = var12_12.append(var28_32);
                                        var12_12 = var12_12.toString();
                                        var60_56 = var2_2.overlay;
                                        var71_67 = var16_16;
                                        var16_16 = var70_66;
                                        try {
                                            var60_56 = var60_56.append((String)var70_66);
                                        }
                                        catch (Exception var24_25) {
                                            break block156;
                                        }
                                        var60_56 = var60_56.append(var72_68);
                                        var120_114 = var72_68;
                                        var20_20 = ":a]";
                                        var20_20 = var60_56.append((String)var20_20);
                                        var60_56 = "volume=0.5";
                                        var20_20 = var20_20.append((String)var60_56);
                                        var60_56 = "[vlm";
                                        var20_20 = var20_20.append((String)var60_56);
                                        var20_20 = var20_20.append(var28_32);
                                        var20_20.append((String)var8_8);
                                        var72_68 = (int)var18_18.isApplyEffectInPreview();
                                        if (var72_68 == 0) ** GOTO lbl2319
                                        var20_20 = var2_2.overlay;
                                        var18_18 = "[vlm";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var28_32);
                                        var20_20 = var20_20.append((String)var10_10);
                                        var18_18 = "adelay=";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var128_121);
                                        var18_18 = "|";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var128_121);
                                        var20_20 = var20_20.append((String)var70_66);
                                        var20_20 = var20_20.append((String)var12_12);
                                        var20_20.append((String)var8_8);
                                        break block155;
lbl2319:
                                        // 1 sources

                                        var20_20 = var2_2.overlay;
                                        var18_18 = "[vlm";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var28_32);
                                        var20_20 = var20_20.append((String)var10_10);
                                        var18_18 = "atrim=start=";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var108_102);
                                        var18_18 = ":end=";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var121_115);
                                        var18_18 = ",asetpts=PTS-STARTPTS";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append((String)var70_66);
                                        var20_20 = var20_20.append((String)var3_3);
                                        var20_20.append((String)var8_8);
                                        var20_20 = var2_2.overlay;
                                        var20_20 = var20_20.append((String)var70_66);
                                        var20_20 = var20_20.append((String)var3_3);
                                        var20_20 = var20_20.append((String)var10_10);
                                        var18_18 = "adelay=";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var128_121);
                                        var18_18 = "|";
                                        var20_20 = var20_20.append((String)var18_18);
                                        var20_20 = var20_20.append(var128_121);
                                        var20_20 = var20_20.append((String)var70_66);
                                        var20_20 = var20_20.append((String)var12_12);
                                        var20_20.append((String)var8_8);
                                    }
                                    var20_20 = new StringBuilder();
                                    var24_24 = var20_20.append((String)var24_24);
                                    var24_24 = var24_24.append((String)var16_16);
                                    var24_24 = var24_24.append((String)var12_12);
                                    var24_24 = var24_24.append((String)var10_10);
                                    var24_24 = var24_24.toString();
                                    ++var59_55;
                                    var72_68 = var120_114;
                                    break block154;
                                    catch (Exception var24_26) {
                                        break block157;
                                    }
                                }
                                ++var28_32;
                                var70_66 = var16_16;
                                var12_12 = var22_22;
                                var60_56 = var38_39;
                                var16_16 = var71_67;
                                var96_90 = 0;
                                var100_94 = 0.0f;
                                var3_3 = null;
                            }
                            var22_22 = var12_12;
                            var71_67 = var16_16;
                            if (var59_55 <= 0) break block201;
                            var10_10 = var2_2.overlay;
                            var24_24 = var10_10.append((String)var24_24);
                            var10_10 = "amix=inputs=";
                            var24_24 = var24_24.append((String)var10_10);
                            var24_24 = var24_24.append(var59_55);
                            var10_10 = ":duration=longest:normalize=0:dropout_transition=0,volume=2[a]";
                            try {
                                var24_24.append((String)var10_10);
                                var51_49 = 1;
                                var52_50 = 1.4E-45f;
                                break block158;
                            }
                            catch (Exception var24_27) {
                                var51_49 = 1;
                                var52_50 = 1.4E-45f;
                            }
                            break block202;
                        }
                        var51_49 = 0;
                        var52_50 = 0.0f;
                        var8_8 = null;
                        break block158;
                        catch (Exception var24_28) {
                            var22_22 = var12_12;
                        }
                    }
                    var71_67 = var16_16;
                }
                var51_49 = 0;
                var52_50 = 0.0f;
                var8_8 = null;
            }
            var24_24.printStackTrace();
        }
        var10_10 = var71_67;
        var71_67.add("-filter_complex");
        var24_24 = var2_2.overlay.toString();
        var71_67.add(var24_24);
        if (var51_49 != 0) {
            var71_67.add("-map");
            var12_12 = var22_22;
            var71_67.add(var22_22);
            var71_67.add("-map");
            var71_67.add("[a]");
            var12_12 = var1_1;
            var24_24 = var1_1.audioCodec;
            if (var24_24 != null) {
                var71_67.add("-c:a");
                var24_24 = var1_1.audioCodec;
                var71_67.add(var24_24);
                var71_67.add("-b:a");
                var71_67.add("256k");
                var71_67.add("-ar");
                var71_67.add("44100");
                var71_67.add("-ac");
                var24_24 = "2";
                var71_67.add(var24_24);
            }
        } else {
            var12_12 = var22_22;
            var24_24 = "-map";
            var71_67.add(var24_24);
            var71_67.add(var22_22);
        }
        var10_10.add("-y");
        var10_10.add("-level");
        var10_10.add("4.1");
        var10_10.add("-g");
        var24_24 = "120";
        var10_10.add(var24_24);
        if (var21_21 != null) {
            var10_10.add("-threads");
            var10_10.add("0");
            var10_10.add("-c:v");
            var12_12 = var21_21;
            var10_10.add(var21_21);
            var10_10.add("-preset");
            var10_10.add("fast");
            var10_10.add("-crf");
            var24_24 = "18";
            var10_10.add(var24_24);
        } else {
            var10_10.add("-b:v");
            var24_24 = "4M";
            var10_10.add(var24_24);
        }
        var10_10.add("-pix_fmt");
        var10_10.add("yuv420p");
        var10_10.add("-framerate");
        var24_24 = new StringBuilder("");
        var13_13 = var2_2.mTemplate.getFps();
        var24_24 = var24_24.append(var13_13).toString();
        var10_10.add(var24_24);
        var10_10.add("-movflags");
        var10_10.add("+faststart");
        var10_10.add("-t");
        var24_24 = new StringBuilder();
        var13_13 = var65_61;
        var24_24 = var24_24.append(var65_61).append("ms").toString();
        var10_10.add(var24_24);
        var24_24 = var2_2.mUri;
        var10_10.add(var24_24);
        var2_2.renderManager.computeWeights();
        var15_15 = var25_29;
        var12_12 = new ProgressViewActivity$$ExternalSyntheticLambda10(var2_2, (CountDownLatch)var25_29, (List)var10_10);
        var2_2.workerThread = var24_24 = new Thread((Runnable)var12_12);
        var24_24.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    protected void updateProgressDialog(Statistics statistics) {
        RenderManager renderManager;
        float f;
        float f2;
        int n;
        int n2;
        block10: {
            double d;
            if (statistics == null) return;
            n2 = this.isDestroy;
            if (n2 != 0) {
                return;
            }
            try {
                d = statistics.getTime();
            }
            catch (Exception exception) {
                return;
            }
            n = (int)d;
            if (n <= 0) {
                return;
            }
            f2 = n;
            n2 = 1148846080;
            f = 1000.0f;
            f2 /= f;
            renderManager = this.renderManager;
            f = renderManager.getCurrentStepDuration();
            f2 /= f;
            n2 = 1065353216;
            f = 1.0f;
            float f3 = f2 == f ? 0 : (f2 > f ? 1 : -1);
            if (f3 <= 0) break block10;
            n = n2;
            f2 = f;
        }
        renderManager = this.renderManager;
        f2 = renderManager.updateLocalProgress(f2);
        n2 = 1120403456;
        f = 100.0f;
        f2 *= f;
        this.targetProgress = f2;
        n = this.isAnimating ? 1 : 0;
        if (n != 0) return;
        this.startSmoothAnimation();
    }
}

