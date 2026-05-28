/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  androidx.fragment.app.FragmentActivity
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$15;
import hazem.nurmontage.videoquran.EngineActivity$15$1$1;
import hazem.nurmontage.videoquran.Utils.BitmapCropper;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import java.io.File;

class EngineActivity$15$1
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity$15 this$1;
    final /* synthetic */ File val$file;
    final /* synthetic */ File val$file_frame;
    final /* synthetic */ int val$max;
    final /* synthetic */ String val$path;

    EngineActivity$15$1(EngineActivity$15 engineActivity$15, File file, int n, String string2, File file2) {
        this.this$1 = engineActivity$15;
        this.val$file = file;
        this.val$max = n;
        this.val$path = string2;
        this.val$file_frame = file2;
    }

    /*
     * Unable to fully structure code
     */
    public void apply(FFmpegSession var1_1) {
        block687: {
            block686: {
                block685: {
                    block684: {
                        block683: {
                            block682: {
                                block681: {
                                    block678: {
                                        block680: {
                                            block679: {
                                                block675: {
                                                    block677: {
                                                        block676: {
                                                            block673: {
                                                                block674: {
                                                                    block672: {
                                                                        var2_2 = this;
                                                                        var3_3 = 1;
                                                                        var4_4 = 0;
                                                                        var5_5 = null;
                                                                        var6_6 = this.this$1;
                                                                        var6_6 = var6_6.this$0;
                                                                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                                                                        var7_7 = this.val$file;
                                                                        var7_7 = var7_7.getAbsolutePath();
                                                                        var6_6.setFrame_bg((String)var7_7);
                                                                        var6_6 = this.this$1;
                                                                        var6_6 = var6_6.this$0;
                                                                        var6_6 = Glide.with((FragmentActivity)var6_6);
                                                                        var6_6 = var6_6.asBitmap();
                                                                        var7_7 = this.this$1;
                                                                        var7_7 = var7_7.this$0;
                                                                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                                        var7_7 = var7_7.getFrame_bg();
                                                                        var6_6 = var6_6.load((String)var7_7);
                                                                        var7_7 = DiskCacheStrategy.NONE;
                                                                        var6_6 = var6_6.diskCacheStrategy((DiskCacheStrategy)var7_7);
                                                                        var6_6 = (RequestBuilder)var6_6;
                                                                        var6_6 = var6_6.skipMemoryCache((boolean)var3_3);
                                                                        var6_6 = (RequestBuilder)var6_6;
                                                                        var8_8 = this.val$max;
                                                                        var6_6 = var6_6.override(var8_8, var8_8);
                                                                        var6_6 = (RequestBuilder)var6_6;
                                                                        var6_6 = var6_6.submit();
                                                                        var6_6 = var6_6.get();
                                                                        var6_6 = (Bitmap)var6_6;
                                                                        var7_7 = this.this$1;
                                                                        var7_7 = var7_7.this$0;
                                                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                        var9_9 = this.this$1;
                                                                        var9_9 = var9_9.this$0;
                                                                        var9_9 = EngineActivity.cfr_renamed_2((EngineActivity)var9_9);
                                                                        var10_10 = (int)var9_9.isGlass();
                                                                        var7_7.setGlass((boolean)var10_10);
                                                                        var7_7 = this.this$1;
                                                                        var7_7 = var7_7.this$0;
                                                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                        var7_7.setVideo((boolean)var3_3);
                                                                        var7_7 = this.this$1;
                                                                        var7_7 = var7_7.this$0;
                                                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                        var7_7.setBitmapOriginal((Bitmap)var6_6);
                                                                        var6_6 = this.this$1;
                                                                        var6_6 = var6_6.this$0;
                                                                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                                                                        var11_11 = var6_6.geTypeResize();
                                                                        var7_7 = ResizeType.SOCIAL_STORY;
                                                                        var8_8 = var7_7.ordinal();
                                                                        if (var11_11 != var8_8) break block672;
                                                                        var6_6 = this.this$1;
                                                                        var6_6 = var6_6.this$0;
                                                                        var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                                                                        var6_6 = var6_6.getBitmapOriginal();
                                                                        var7_7 = this.this$1;
                                                                        var7_7 = var7_7.this$0;
                                                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                        var8_8 = var7_7.getW();
                                                                        var9_9 = this.this$1;
                                                                        var9_9 = var9_9.this$0;
                                                                        var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                                        var10_10 = var9_9.getH();
                                                                        var6_6 = BitmapCropper.cropTo9x16((Bitmap)var6_6, var8_8, var10_10);
                                                                        break block673;
                                                                    }
                                                                    var6_6 = this.this$1;
                                                                    var6_6 = var6_6.this$0;
                                                                    var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                                                                    var11_11 = var6_6.geTypeResize();
                                                                    var7_7 = ResizeType.SQUARE;
                                                                    var8_8 = var7_7.ordinal();
                                                                    if (var11_11 != var8_8) break block674;
                                                                    var6_6 = this.this$1;
                                                                    var6_6 = var6_6.this$0;
                                                                    var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                                                                    var6_6 = var6_6.getBitmapOriginal();
                                                                    var7_7 = this.this$1;
                                                                    var7_7 = var7_7.this$0;
                                                                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                    var8_8 = var7_7.getW();
                                                                    var9_9 = this.this$1;
                                                                    var9_9 = var9_9.this$0;
                                                                    var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                                    var10_10 = var9_9.getH();
                                                                    var6_6 = BitmapCropper.cropTo1x1((Bitmap)var6_6, var8_8, var10_10);
                                                                    break block673;
                                                                }
                                                                var6_6 = this.this$1;
                                                                var6_6 = var6_6.this$0;
                                                                var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                                                                var6_6 = var6_6.getBitmapOriginal();
                                                                var7_7 = this.this$1;
                                                                var7_7 = var7_7.this$0;
                                                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                                var8_8 = var7_7.getW();
                                                                var9_9 = this.this$1;
                                                                var9_9 = var9_9.this$0;
                                                                var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                                var10_10 = var9_9.getH();
                                                                var6_6 = BitmapCropper.cropTo16x9((Bitmap)var6_6, var8_8, var10_10);
                                                            }
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                            var7_7.updatePosCanvas((Bitmap)var6_6);
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                            var9_9 = var2_2.this$1;
                                                            var9_9 = var9_9.this$0;
                                                            var9_9 = EngineActivity.cfr_renamed_2((EngineActivity)var9_9);
                                                            var10_10 = var9_9.getIpad_type();
                                                            var12_12 = var2_2.this$1;
                                                            var12_12 = var12_12.this$0;
                                                            var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                                                            var13_13 = var12_12.geTypeResize();
                                                            var7_7.updateIpad((Bitmap)var6_6, var10_10, var13_13);
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.BLACK_LAYER;
                                                            var10_10 = var9_9.ordinal();
                                                            var13_13 = 1057560199;
                                                            var14_14 = 0.5355f;
                                                            var15_15 = 1065353216;
                                                            var16_16 = 1.0f;
                                                            var17_17 = 20;
                                                            var18_18 = 2.8E-44f;
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.GRADIENT;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.MASK_BRUSH;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.BLUE_TYPE;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.CASSET_IMG;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.CASSET_IMG_BLUR;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 == var10_10) ** GOTO lbl1178
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                            var8_8 = var7_7.getIpad_type();
                                                            var9_9 = IpadType.IPAD_NEOMORPHIC;
                                                            var10_10 = var9_9.ordinal();
                                                            if (var8_8 != var10_10) break block675;
                                                            var7_7 = var2_2.this$1;
                                                            var7_7 = var7_7.this$0;
                                                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                            var7_7 = var7_7.getIpad_rect();
                                                            var19_19 = var7_7.width();
                                                            var10_10 = 1058642330;
                                                            var20_20 = 0.6f;
                                                            var8_8 = (int)(var19_19 *= var20_20);
                                                            var9_9 = var2_2.this$1;
                                                            var9_9 = var9_9.this$0;
                                                            var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                            var9_9 = var9_9.getBitmapOriginal();
                                                            var10_10 = var9_9.getWidth();
                                                            var20_20 = var10_10;
                                                            var12_12 = var2_2.this$1;
                                                            var12_12 = var12_12.this$0;
                                                            var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                                                            var14_14 = var12_12.getX_square();
                                                            var20_20 *= var14_14;
                                                            var10_10 = Math.round(var20_20);
                                                            var12_12 = var2_2.this$1;
                                                            var12_12 = var12_12.this$0;
                                                            var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                                                            var12_12 = var12_12.getBitmapOriginal();
                                                            var13_13 = var12_12.getHeight();
                                                            var14_14 = var13_13;
                                                            var21_24 = var2_2.this$1;
                                                            var21_24 = var21_24.this$0;
                                                            var21_24 = EngineActivity.cfr_renamed_2((EngineActivity)var21_24);
                                                            var16_16 = var21_24.getY_square();
                                                            var14_14 *= var16_16;
                                                            var13_13 = Math.round(var14_14);
                                                            var15_15 = var8_8 + var10_10;
                                                            var22_28 = var2_2.this$1;
                                                            var22_28 = var22_28.this$0;
                                                            var22_28 = EngineActivity.cfr_renamed_64((EngineActivity)var22_28);
                                                            var22_28 = var22_28.getBitmapOriginal();
                                                            var23_33 = var22_28.getWidth();
                                                            if (var15_15 <= var23_33) break block676;
                                                            var22_28 = var2_2.this$1;
                                                            var22_28 = var22_28.this$0;
                                                            var22_28 = EngineActivity.cfr_renamed_64((EngineActivity)var22_28);
                                                            var22_28 = var22_28.getBitmapOriginal();
                                                            var23_33 = var22_28.getWidth();
                                                            var10_10 -= (var15_15 -= var23_33);
                                                            var21_24 = var2_2.this$1;
                                                            var21_24 = var21_24.this$0;
                                                            var21_24 = EngineActivity.cfr_renamed_64((EngineActivity)var21_24);
                                                            var21_24 = var21_24.getBitmapOriginal();
                                                            var15_15 = var21_24.getWidth();
                                                        }
                                                        var23_33 = var8_8 + var13_13;
                                                        var24_36 = var2_2.this$1;
                                                        var24_36 = var24_36.this$0;
                                                        var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                                        var24_36 = var24_36.getBitmapOriginal();
                                                        var25_39 = var24_36.getHeight();
                                                        if (var23_33 <= var25_39) break block677;
                                                        var24_36 = var2_2.this$1;
                                                        var24_36 = var24_36.this$0;
                                                        var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                                        var24_36 = var24_36.getBitmapOriginal();
                                                        var25_39 = var24_36.getHeight();
                                                        var13_13 -= (var23_33 -= var25_39);
                                                        var22_28 = var2_2.this$1;
                                                        var22_28 = var22_28.this$0;
                                                        var22_28 = EngineActivity.cfr_renamed_64((EngineActivity)var22_28);
                                                        var22_28 = var22_28.getBitmapOriginal();
                                                        var23_33 = var22_28.getHeight();
                                                    }
                                                    if (var10_10 < 0) {
                                                        var10_10 = 0;
                                                        var9_9 = null;
                                                        var20_20 = 0.0f;
                                                    }
                                                    if (var13_13 < 0) {
                                                        var13_13 = 0;
                                                        var12_12 = null;
                                                        var14_14 = 0.0f;
                                                    }
                                                    var24_36 = new Rect(var10_10, var13_13, var15_15, var23_33);
                                                    var9_9 = var2_2.this$1;
                                                    var9_9 = var9_9.this$0;
                                                    var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                    var9_9.setRadius_square(var8_8);
                                                    var9_9 = var2_2.this$1;
                                                    var9_9 = var9_9.this$0;
                                                    var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                    var9_9 = var9_9.getBitmapOriginal();
                                                    var10_10 = var9_9.getWidth();
                                                    var20_20 = var10_10;
                                                    var12_12 = var2_2.this$1;
                                                    var12_12 = var12_12.this$0;
                                                    var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                                                    var14_14 = var12_12.getWidth_square();
                                                    var10_10 = (int)(var20_20 *= var14_14);
                                                    var12_12 = var2_2.this$1;
                                                    var12_12 = var12_12.this$0;
                                                    var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                                                    var12_12 = var12_12.getBitmapOriginal();
                                                    var13_13 = var12_12.getHeight();
                                                    var14_14 = var13_13;
                                                    var21_24 = var2_2.this$1;
                                                    var21_24 = var21_24.this$0;
                                                    var21_24 = EngineActivity.cfr_renamed_2((EngineActivity)var21_24);
                                                    var16_16 = var21_24.getHeight_square();
                                                    var13_13 = (int)(var14_14 *= var16_16);
                                                    var21_24 = var2_2.this$1;
                                                    var21_24 = var21_24.this$0;
                                                    var21_24 = EngineActivity.cfr_renamed_64((EngineActivity)var21_24);
                                                    var21_24 = var21_24.getBitmapOriginal();
                                                    var7_7 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var21_24, (Rect)var24_36, var8_8, var10_10, var13_13);
                                                    var15_15 = var24_36.left + var10_10;
                                                    var24_36.right = var15_15;
                                                    var10_10 = var24_36.top + var13_13;
                                                    var24_36.bottom = var10_10;
                                                    var9_9 = var2_2.this$1;
                                                    var9_9 = var9_9.this$0;
                                                    var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                                    var9_9.setRectSquare((Rect)var24_36);
lbl526:
                                                    // 3 sources

                                                    while (true) {
                                                        var26_41 = var7_7;
                                                        ** GOTO lbl1093
                                                        break;
                                                    }
                                                }
                                                var7_7 = var2_2.this$1;
                                                var7_7 = var7_7.this$0;
                                                var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                var8_8 = var7_7.getIpad_type();
                                                var9_9 = IpadType.IPAD;
                                                var10_10 = var9_9.ordinal();
                                                if (var8_8 == var10_10) break block678;
                                                var7_7 = var2_2.this$1;
                                                var7_7 = var7_7.this$0;
                                                var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                var8_8 = var7_7.getIpad_type();
                                                var9_9 = IpadType.IPAD_UNBLUR;
                                                var10_10 = var9_9.ordinal();
                                                if (var8_8 == var10_10) break block678;
                                                var7_7 = var2_2.this$1;
                                                var7_7 = var7_7.this$0;
                                                var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                                var8_8 = var7_7.getIpad_type();
                                                var9_9 = IpadType.IPAD_CLASSIC;
                                                var10_10 = var9_9.ordinal();
                                                if (var8_8 == var10_10) break block678;
                                                var7_7 = var2_2.this$1;
                                                var7_7 = var7_7.this$0;
                                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                var7_7 = var7_7.getIpad_rect();
                                                var19_19 = var7_7.width() * var16_16;
                                                var8_8 = (int)var19_19;
                                                var20_21 = (float)var6_6.getHeight() * var14_14;
                                                var10_10 = (int)var20_21;
                                                var12_12 = var2_2.this$1;
                                                var12_12 = var12_12.this$0;
                                                var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                                                var12_12 = var12_12.getBitmapOriginal();
                                                var13_13 = var12_12.getWidth();
                                                var14_14 = var13_13;
                                                var21_25 = var2_2.this$1;
                                                var21_25 = var21_25.this$0;
                                                var21_25 = EngineActivity.cfr_renamed_2((EngineActivity)var21_25);
                                                var16_16 = var21_25.getX_square();
                                                var14_14 *= var16_16;
                                                var13_13 = Math.round(var14_14);
                                                var21_25 = var2_2.this$1;
                                                var21_25 = var21_25.this$0;
                                                var21_25 = EngineActivity.cfr_renamed_64((EngineActivity)var21_25);
                                                var21_25 = var21_25.getBitmapOriginal();
                                                var15_15 = var21_25.getHeight();
                                                var16_16 = var15_15;
                                                var22_29 = var2_2.this$1;
                                                var22_29 = var22_29.this$0;
                                                var22_29 = EngineActivity.cfr_renamed_2((EngineActivity)var22_29);
                                                var27_42 = var22_29.getY_square();
                                                var16_16 *= var27_42;
                                                var15_15 = Math.round(var16_16);
                                                var8_8 += var13_13;
                                                var22_29 = var2_2.this$1;
                                                var22_29 = var22_29.this$0;
                                                var22_29 = EngineActivity.cfr_renamed_64((EngineActivity)var22_29);
                                                var22_29 = var22_29.getBitmapOriginal();
                                                var23_34 = var22_29.getWidth();
                                                if (var8_8 <= var23_34) break block679;
                                                var22_29 = var2_2.this$1;
                                                var22_29 = var22_29.this$0;
                                                var22_29 = EngineActivity.cfr_renamed_64((EngineActivity)var22_29);
                                                var22_29 = var22_29.getBitmapOriginal();
                                                var23_34 = var22_29.getWidth();
                                                var13_13 -= (var8_8 -= var23_34);
                                                var7_7 = var2_2.this$1;
                                                var7_7 = var7_7.this$0;
                                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                                var7_7 = var7_7.getBitmapOriginal();
                                                var8_8 = var7_7.getWidth();
                                            }
                                            var10_10 += var15_15;
                                            var22_29 = var2_2.this$1;
                                            var22_29 = var22_29.this$0;
                                            var22_29 = EngineActivity.cfr_renamed_64((EngineActivity)var22_29);
                                            var22_29 = var22_29.getBitmapOriginal();
                                            var23_34 = var22_29.getHeight();
                                            if (var10_10 <= var23_34) break block680;
                                            var22_29 = var2_2.this$1;
                                            var22_29 = var22_29.this$0;
                                            var22_29 = EngineActivity.cfr_renamed_64((EngineActivity)var22_29);
                                            var22_29 = var22_29.getBitmapOriginal();
                                            var23_34 = var22_29.getHeight();
                                            var15_15 -= (var10_10 -= var23_34);
                                            var9_9 = var2_2.this$1;
                                            var9_9 = var9_9.this$0;
                                            var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                            var9_9 = var9_9.getBitmapOriginal();
                                            var10_10 = var9_9.getHeight();
                                        }
                                        if (var13_13 < 0) {
                                            var13_13 = 0;
                                            var12_12 = null;
                                            var14_14 = 0.0f;
                                        }
                                        if (var15_15 < 0) {
                                            var15_15 = 0;
                                            var21_25 = null;
                                            var16_16 = 0.0f;
                                        }
                                        var24_36 = new Rect(var13_13, var15_15, var8_8, var10_10);
                                        var7_7 = var2_2.this$1;
                                        var7_7 = var7_7.this$0;
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                        var7_7 = var7_7.getBitmapOriginal();
                                        var8_8 = var7_7.getWidth();
                                        var19_19 = var8_8;
                                        var9_9 = var2_2.this$1;
                                        var9_9 = var9_9.this$0;
                                        var9_9 = EngineActivity.cfr_renamed_2((EngineActivity)var9_9);
                                        var20_21 = var9_9.getWidth_square();
                                        var8_8 = (int)(var19_19 *= var20_21);
                                        var9_9 = var2_2.this$1;
                                        var9_9 = var9_9.this$0;
                                        var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                        var9_9 = var9_9.getBitmapOriginal();
                                        var10_10 = var9_9.getHeight();
                                        var20_21 = var10_10;
                                        var12_12 = var2_2.this$1;
                                        var12_12 = var12_12.this$0;
                                        var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                                        var14_14 = var12_12.getHeight_square();
                                        var10_10 = (int)(var20_21 *= var14_14);
                                        var12_12 = var2_2.this$1;
                                        var12_12 = var12_12.this$0;
                                        var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                                        var12_12 = var12_12.getBitmapOriginal();
                                        var12_12 = UtilsBitmap.cropToSquare((Bitmap)var12_12, (Rect)var24_36, var8_8, var10_10);
                                        var21_25 = var2_2.this$1;
                                        var21_25 = var21_25.this$0;
                                        var21_25 = EngineActivity.cfr_renamed_64((EngineActivity)var21_25);
                                        var21_25.setBitmapSquare((Bitmap)var12_12);
                                        var21_25 = var2_2.this$1;
                                        var21_25 = var21_25.this$0;
                                        var21_25 = EngineActivity.cfr_renamed_64((EngineActivity)var21_25);
                                        var21_25.setRadius_square(0);
                                        var15_15 = var24_36.left + var8_8;
                                        var24_36.right = var15_15;
                                        var8_8 = var24_36.top + var10_10;
                                        var24_36.bottom = var8_8;
                                        var7_7 = var2_2.this$1;
                                        var7_7 = var7_7.this$0;
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                        var7_7.setRectSquare((Rect)var24_36);
                                        var26_41 = var12_12;
                                        ** GOTO lbl1093
                                    }
                                    var7_7 = var2_2.this$1;
                                    var7_7 = var7_7.this$0;
                                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    var7_7 = var7_7.getIpad_rect();
                                    var19_19 = var7_7.width() * 0.87530595f;
                                    var8_8 = (int)var19_19;
                                    var20_22 = var8_8;
                                    var13_13 = 1066443735;
                                    var14_14 = 1.13f;
                                    var10_10 = (int)(var20_22 *= var14_14);
                                    var13_13 = Math.min(var8_8, var10_10);
                                    var21_26 = var2_2.this$1;
                                    var21_26 = var21_26.this$0;
                                    var21_26 = EngineActivity.cfr_renamed_64((EngineActivity)var21_26);
                                    var21_26 = var21_26.getBitmapOriginal();
                                    var15_15 = var21_26.getWidth();
                                    var16_16 = var15_15;
                                    var22_30 = var2_2.this$1;
                                    var22_30 = var22_30.this$0;
                                    var22_30 = EngineActivity.cfr_renamed_2((EngineActivity)var22_30);
                                    var27_43 = var22_30.getX_square();
                                    var16_16 *= var27_43;
                                    var15_15 = Math.round(var16_16);
                                    var22_30 = var2_2.this$1;
                                    var22_30 = var22_30.this$0;
                                    var22_30 = EngineActivity.cfr_renamed_64((EngineActivity)var22_30);
                                    var22_30 = var22_30.getBitmapOriginal();
                                    var23_35 = var22_30.getHeight();
                                    var27_43 = var23_35;
                                    var24_36 = var2_2.this$1;
                                    var24_36 = var24_36.this$0;
                                    var24_36 = EngineActivity.cfr_renamed_2((EngineActivity)var24_36);
                                    var28_44 = var24_36.getY_square();
                                    var27_43 *= var28_44;
                                    var23_35 = Math.round(var27_43);
                                    var8_8 += var15_15;
                                    var24_36 = var2_2.this$1;
                                    var24_36 = var24_36.this$0;
                                    var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                    var24_36 = var24_36.getBitmapOriginal();
                                    var25_40 = var24_36.getWidth();
                                    if (var8_8 <= var25_40) break block681;
                                    var24_36 = var2_2.this$1;
                                    var24_36 = var24_36.this$0;
                                    var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                    var24_36 = var24_36.getBitmapOriginal();
                                    var25_40 = var24_36.getWidth();
                                    var15_15 -= (var8_8 -= var25_40);
                                    var7_7 = var2_2.this$1;
                                    var7_7 = var7_7.this$0;
                                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    var7_7 = var7_7.getBitmapOriginal();
                                    var8_8 = var7_7.getWidth();
                                }
                                var10_10 += var23_35;
                                var24_36 = var2_2.this$1;
                                var24_36 = var24_36.this$0;
                                var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                var24_36 = var24_36.getBitmapOriginal();
                                var25_40 = var24_36.getHeight();
                                if (var10_10 <= var25_40) break block682;
                                var24_36 = var2_2.this$1;
                                var24_36 = var24_36.this$0;
                                var24_36 = EngineActivity.cfr_renamed_64((EngineActivity)var24_36);
                                var24_36 = var24_36.getBitmapOriginal();
                                var25_40 = var24_36.getHeight();
                                var23_35 -= (var10_10 -= var25_40);
                                var9_9 = var2_2.this$1;
                                var9_9 = var9_9.this$0;
                                var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                                var9_9 = var9_9.getBitmapOriginal();
                                var10_10 = var9_9.getHeight();
                            }
                            if (var15_15 < 0) {
                                var15_15 = 0;
                                var21_26 = null;
                                var16_16 = 0.0f;
                            }
                            if (var23_35 < 0) {
                                var23_35 = 0;
                                var22_30 = null;
                                var27_43 = 0.0f;
                            }
                            var24_36 = new Rect(var15_15, var23_35, var8_8, var10_10);
                            var7_7 = var2_2.this$1;
                            var7_7 = var7_7.this$0;
                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                            var8_8 = var7_7.getIpad_type();
                            var9_9 = IpadType.IPAD_CLASSIC;
                            var10_10 = var9_9.ordinal();
                            if (var8_8 != var10_10) break block683;
                            var7_7 = var2_2.this$1;
                            var7_7 = var7_7.this$0;
                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            var7_7 = var7_7.getBitmapOriginal();
                            var8_8 = var7_7.getWidth();
                            var19_19 = var8_8;
                            var9_9 = var2_2.this$1;
                            var9_9 = var9_9.this$0;
                            var9_9 = EngineActivity.cfr_renamed_2((EngineActivity)var9_9);
                            var20_22 = var9_9.getWidth_square();
                            var8_8 = (int)(var19_19 *= var20_22);
                            var9_9 = var2_2.this$1;
                            var9_9 = var9_9.this$0;
                            var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                            var9_9 = var9_9.getBitmapOriginal();
                            var10_10 = var9_9.getHeight();
                            var20_22 = var10_10;
                            var12_12 = var2_2.this$1;
                            var12_12 = var12_12.this$0;
                            var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                            var14_14 = var12_12.getHeight_square();
                            var10_10 = (int)(var20_22 *= var14_14);
                            var12_12 = var2_2.this$1;
                            var12_12 = var12_12.this$0;
                            var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                            var12_12 = var12_12.getBitmapOriginal();
                            var12_12 = UtilsBitmap.cropToSquare((Bitmap)var12_12, (Rect)var24_36, var8_8, var10_10);
                            var21_26 = var2_2.this$1;
                            var21_26 = var21_26.this$0;
                            var21_26 = EngineActivity.cfr_renamed_64((EngineActivity)var21_26);
                            var21_26.setBitmapSquare((Bitmap)var12_12);
                            var21_26 = var2_2.this$1;
                            var21_26 = var21_26.this$0;
                            var21_26 = EngineActivity.cfr_renamed_64((EngineActivity)var21_26);
                            var21_26.setRadius_square(0);
                            var15_15 = var24_36.left + var8_8;
                            var24_36.right = var15_15;
                            var8_8 = var24_36.top + var10_10;
                            var24_36.bottom = var8_8;
                            var7_7 = var2_2.this$1;
                            var7_7 = var7_7.this$0;
                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            var7_7.setRectSquare((Rect)var24_36);
                            var7_7 = var12_12;
                            ** GOTO lbl526
                        }
                        var19_19 = var13_13;
                        var10_10 = 1037905692;
                        var20_22 = 0.10800001f;
                        var8_8 = (int)(var19_19 *= var20_22);
                        var9_9 = var2_2.this$1;
                        var9_9 = var9_9.this$0;
                        var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                        var9_9.setRadius_square(var8_8);
                        var9_9 = var2_2.this$1;
                        var9_9 = var9_9.this$0;
                        var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                        var9_9 = var9_9.getBitmapOriginal();
                        var10_10 = var9_9.getWidth();
                        var20_22 = var10_10;
                        var12_12 = var2_2.this$1;
                        var12_12 = var12_12.this$0;
                        var12_12 = EngineActivity.cfr_renamed_2((EngineActivity)var12_12);
                        var14_14 = var12_12.getWidth_square();
                        var10_10 = (int)(var20_22 *= var14_14);
                        var12_12 = var2_2.this$1;
                        var12_12 = var12_12.this$0;
                        var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                        var12_12 = var12_12.getBitmapOriginal();
                        var13_13 = var12_12.getHeight();
                        var14_14 = var13_13;
                        var21_26 = var2_2.this$1;
                        var21_26 = var21_26.this$0;
                        var21_26 = EngineActivity.cfr_renamed_2((EngineActivity)var21_26);
                        var16_16 = var21_26.getHeight_square();
                        var13_13 = (int)(var14_14 *= var16_16);
                        var21_26 = var2_2.this$1;
                        var21_26 = var21_26.this$0;
                        var21_26 = EngineActivity.cfr_renamed_64((EngineActivity)var21_26);
                        var21_26 = var21_26.getBitmapOriginal();
                        var7_7 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var21_26, (Rect)var24_36, var8_8, var10_10, var13_13);
                        var15_15 = var24_36.left + var10_10;
                        var24_36.right = var15_15;
                        var10_10 = var24_36.top + var13_13;
                        var24_36.bottom = var10_10;
                        var9_9 = var2_2.this$1;
                        var9_9 = var9_9.this$0;
                        var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                        var9_9.setRectSquare((Rect)var24_36);
                        ** continue;
lbl1093:
                        // 2 sources

                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var7_7 = var7_7.getGradient();
                        if (var7_7 == null) ** GOTO lbl1140
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var29_45 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var30_48 = UtilsBitmap.blur((Context)var7_7, (Bitmap)var6_6, var17_17, var3_3);
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var31_51 = var6_6.getGradient();
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var32_52 = var6_6.getIpad_type();
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var33_55 = var6_6.geTypeResize();
                        var29_45.setBitmap(var30_48, (Bitmap)var26_41, var31_51, var32_52, var33_55, (Rect)var24_36);
                        ** GOTO lbl1449
lbl1140:
                        // 1 sources

                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var29_46 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var30_49 = UtilsBitmap.blur((Context)var7_7, (Bitmap)var6_6, var17_17, var3_3);
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var34_57 = var6_6.getColor_ipad();
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var32_53 = var6_6.getIpad_type();
                        var6_6 = var2_2.this$1;
                        var6_6 = var6_6.this$0;
                        var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                        var33_56 = var6_6.geTypeResize();
                        var29_46.setBitmap(var30_49, (Bitmap)var26_41, var34_57, var32_53, var33_56, (Rect)var24_36);
                        ** GOTO lbl1449
lbl1178:
                        // 6 sources

                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var7_7 = var7_7.getGradient();
                        var29_47 = null;
                        var32_54 = false;
                        if (var7_7 == null) ** GOTO lbl1227
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var22_31 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var24_37 = UtilsBitmap.blur((Context)var7_7, (Bitmap)var6_6, var17_17, var3_3);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var30_50 = var7_7.getGradient();
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var35_60 = var7_7.getIpad_type();
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var34_58 = var7_7.geTypeResize();
                        var22_31.setBitmap(var24_37, null, var30_50, var35_60, var34_58, null);
                        ** GOTO lbl1264
lbl1227:
                        // 1 sources

                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var22_32 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var24_38 = UtilsBitmap.blur((Context)var7_7, (Bitmap)var6_6, var17_17, var3_3);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var36_62 = var7_7.getColor_ipad();
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var35_61 = var7_7.getIpad_type();
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var34_59 = var7_7.geTypeResize();
                        var22_32.setBitmap(var24_38, null, var36_62, var35_61, var34_59, null);
lbl1264:
                        // 2 sources

                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var7_7.getIpad_rect();
                        var19_19 = var7_7.width() * var16_16;
                        var8_8 = (int)var19_19;
                        var20_23 = (float)var6_6.getHeight() * var14_14;
                        var10_10 = (int)var20_23;
                        var12_12 = var2_2.this$1;
                        var12_12 = var12_12.this$0;
                        var12_12 = EngineActivity.cfr_renamed_64((EngineActivity)var12_12);
                        var12_12 = var12_12.getBitmapOriginal();
                        var13_13 = var12_12.getWidth();
                        var14_14 = var13_13;
                        var21_27 = var2_2.this$1;
                        var21_27 = var21_27.this$0;
                        var21_27 = EngineActivity.cfr_renamed_2((EngineActivity)var21_27);
                        var16_16 = var21_27.getX_square();
                        var14_14 *= var16_16;
                        var13_13 = Math.round(var14_14);
                        var21_27 = var2_2.this$1;
                        var21_27 = var21_27.this$0;
                        var21_27 = EngineActivity.cfr_renamed_64((EngineActivity)var21_27);
                        var21_27 = var21_27.getBitmapOriginal();
                        var15_15 = var21_27.getHeight();
                        var16_16 = var15_15;
                        var37_63 = var2_2.this$1;
                        var37_63 = var37_63.this$0;
                        var37_63 = EngineActivity.cfr_renamed_2((EngineActivity)var37_63);
                        var18_18 = var37_63.getY_square();
                        var16_16 *= var18_18;
                        var15_15 = Math.round(var16_16);
                        var8_8 += var13_13;
                        var37_63 = var2_2.this$1;
                        var37_63 = var37_63.this$0;
                        var37_63 = EngineActivity.cfr_renamed_64((EngineActivity)var37_63);
                        var37_63 = var37_63.getBitmapOriginal();
                        var17_17 = var37_63.getWidth();
                        if (var8_8 <= var17_17) break block684;
                        var37_63 = var2_2.this$1;
                        var37_63 = var37_63.this$0;
                        var37_63 = EngineActivity.cfr_renamed_64((EngineActivity)var37_63);
                        var37_63 = var37_63.getBitmapOriginal();
                        var17_17 = var37_63.getWidth();
                        var13_13 -= (var8_8 -= var17_17);
                        var7_7 = var2_2.this$1;
                        var7_7 = var7_7.this$0;
                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var7_7.getBitmapOriginal();
                        var8_8 = var7_7.getWidth();
                    }
                    var10_10 += var15_15;
                    var37_63 = var2_2.this$1;
                    var37_63 = var37_63.this$0;
                    var37_63 = EngineActivity.cfr_renamed_64((EngineActivity)var37_63);
                    var37_63 = var37_63.getBitmapOriginal();
                    var17_17 = var37_63.getHeight();
                    if (var10_10 <= var17_17) break block685;
                    var37_63 = var2_2.this$1;
                    var37_63 = var37_63.this$0;
                    var37_63 = EngineActivity.cfr_renamed_64((EngineActivity)var37_63);
                    var37_63 = var37_63.getBitmapOriginal();
                    var17_17 = var37_63.getHeight();
                    var15_15 -= (var10_10 -= var17_17);
                    var9_9 = var2_2.this$1;
                    var9_9 = var9_9.this$0;
                    var9_9 = EngineActivity.cfr_renamed_64((EngineActivity)var9_9);
                    var9_9 = var9_9.getBitmapOriginal();
                    var10_10 = var9_9.getHeight();
                }
                if (var13_13 < 0) {
                    var13_13 = 0;
                    var12_12 = null;
                    var14_14 = 0.0f;
                }
                if (var15_15 < 0) {
                    var15_15 = 0;
                    var21_27 = null;
                    var16_16 = 0.0f;
                }
                var37_63 = new Rect(var13_13, var15_15, var8_8, var10_10);
                var7_7 = var2_2.this$1;
                var7_7 = var7_7.this$0;
                var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                var8_8 = var7_7.getIpad_type();
                var9_9 = IpadType.CASSET_IMG_BLUR;
                var10_10 = var9_9.ordinal();
                if (var8_8 != var10_10) ** GOTO lbl1428
                var6_6 = var2_2.this$1;
                var6_6 = var6_6.this$0;
                var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                var7_7 = var2_2.this$1;
                var7_7 = var7_7.this$0;
                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                var7_7 = var7_7.getBitmapBlured();
                var6_6.setBitmapSquare((Bitmap)var7_7);
                ** GOTO lbl1435
lbl1428:
                // 1 sources

                var7_7 = var2_2.this$1;
                var7_7 = var7_7.this$0;
                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                var7_7.setBitmapSquare((Bitmap)var6_6);
lbl1435:
                // 2 sources

                var6_6 = var2_2.this$1;
                var6_6 = var6_6.this$0;
                var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                var6_6.setRadius_square(0);
                var6_6 = var2_2.this$1;
                var6_6 = var6_6.this$0;
                var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                var6_6.setRectSquare((Rect)var37_63);
lbl1449:
                // 3 sources

                var6_6 = var2_2.this$1;
                var6_6 = var6_6.this$0;
                var6_6 = EngineActivity.cfr_renamed_2((EngineActivity)var6_6);
                var11_11 = var6_6.getIpad_type();
                var7_7 = IpadType.BLUE_TYPE;
                var8_8 = var7_7.ordinal();
                if (var11_11 != var8_8) break block686;
                var6_6 = var2_2.this$1;
                var6_6 = var6_6.this$0;
                var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
                var6_6 = var6_6.getPaintLecture();
                var11_11 = var6_6.getColor();
                break block687;
            }
            var6_6 = var2_2.this$1;
            var6_6 = var6_6.this$0;
            var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
            var6_6 = var6_6.getPaintLecture();
            var11_11 = var6_6.getColor();
            var8_8 = -1;
            var19_19 = 0.0f / 0.0f;
            var11_11 = var11_11 == var8_8 ? -256 : -8780025;
        }
        var7_7 = var2_2.this$1;
        var7_7 = var7_7.this$0;
        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
        var7_7.setClr_trsl(var11_11);
        var6_6 = var2_2.this$1;
        var6_6 = var6_6.this$0;
        var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
        var7_7 = var2_2.this$1;
        var7_7 = var7_7.this$0;
        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
        var7_7 = var7_7.getPaintLecture();
        var8_8 = var7_7.getColor();
        var6_6.setClr_aya(var8_8);
        var6_6 = var2_2.this$1;
        var6_6 = var6_6.this$0;
        try {
            EngineActivity.cfr_renamed_295((EngineActivity)var6_6);
        }
        catch (Exception v0) {
            ** continue;
        }
lbl1519:
        // 2 sources

        while (true) {
            var6_6 = EngineActivity.cfr_renamed_296(var2_2.this$1.this$0);
            var7_7 = new String[17];
            var7_7[0] = "-i";
            var5_5 = var2_2.val$path;
            var7_7[var3_3] = var5_5;
            var7_7[2] = "-ss";
            var5_5 = "";
            var38_64 = new StringBuilder(var5_5);
            var10_10 = EngineActivity.cfr_renamed_297(var2_2.this$1.this$0);
            var7_7[3] = var38_64 = var38_64.append(var10_10).toString();
            var7_7[4] = "-r";
            var7_7[5] = "25";
            var7_7[6] = "-vf";
            var38_64 = new StringBuilder("scale=");
            var10_10 = var2_2.val$max;
            var38_64 = var38_64.append(var10_10).append(":");
            var10_10 = var2_2.val$max;
            var7_7[7] = var38_64 = var38_64.append(var10_10).append(":force_original_aspect_ratio=increase").toString();
            var7_7[8] = "-start_number";
            var38_64 = new StringBuilder(var5_5);
            var4_4 = EngineActivity.cfr_renamed_297(var2_2.this$1.this$0) * 25;
            var7_7[9] = var38_64 = var38_64.append(var4_4).toString();
            var7_7[10] = "-q:v";
            var7_7[11] = "0";
            var7_7[12] = "-threads";
            var7_7[13] = "4";
            var7_7[14] = "-an";
            var7_7[15] = "-y";
            var7_7[16] = var38_64 = var2_2.val$file_frame.getAbsolutePath();
            var38_64 = new EngineActivity$15$1$1(var2_2);
            var38_64 = FFmpegKit.executeWithArgumentsAsync((String[])var7_7, (FFmpegSessionCompleteCallback)var38_64).getSessionId();
            var6_6.add(var38_64);
            return;
        }
    }
}

