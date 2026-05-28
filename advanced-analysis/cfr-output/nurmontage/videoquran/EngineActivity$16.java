/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.util.Log
 *  androidx.fragment.app.FragmentActivity
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.BitmapCropper;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;

class EngineActivity$16
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$16(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void run() {
        block451: {
            block450: {
                block442: {
                    block449: {
                        block448: {
                            block447: {
                                block446: {
                                    block443: {
                                        block445: {
                                            block444: {
                                                block439: {
                                                    block441: {
                                                        block440: {
                                                            block437: {
                                                                block438: {
                                                                    block436: {
                                                                        var1_1 = this;
                                                                        var2_2 /* !! */  = this.this$0;
                                                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                                                                        var3_5 = this.this$0;
                                                                        var3_5 = EngineActivity.cfr_renamed_64((EngineActivity)var3_5);
                                                                        var4_6 = var3_5.getWidth();
                                                                        var5_7 = this.this$0;
                                                                        var5_7 = EngineActivity.cfr_renamed_64((EngineActivity)var5_7);
                                                                        var6_8 = var5_7.getHeight();
                                                                        var7_9 = this.this$0;
                                                                        var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                                        var8_10 = var7_9.geTypeResize();
                                                                        var2_2 /* !! */ .initCanvasDimension(var4_6, var6_8, var8_10);
                                                                        var2_2 /* !! */  = this.this$0;
                                                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                                                                        var9_11 = var2_2 /* !! */ .getHeight();
                                                                        var4_6 = -1;
                                                                        var6_8 = 1;
                                                                        var7_9 = this.this$0;
                                                                        var7_9 = Glide.with((FragmentActivity)var7_9);
                                                                        var7_9 = var7_9.asBitmap();
                                                                        var10_12 = this.this$0;
                                                                        var10_12 = EngineActivity.cfr_renamed_2((EngineActivity)var10_12);
                                                                        var10_12 = var10_12.getUri_bg();
                                                                        var7_9 = var7_9.load((String)var10_12);
                                                                        var10_12 = DiskCacheStrategy.NONE;
                                                                        var7_9 = var7_9.diskCacheStrategy((DiskCacheStrategy)var10_12);
                                                                        var7_9 = (RequestBuilder)var7_9;
                                                                        var7_9 = var7_9.skipMemoryCache((boolean)var6_8);
                                                                        var7_9 = (RequestBuilder)var7_9;
                                                                        var7_9 = var7_9.override(var9_11, var9_11);
                                                                        var7_9 = (RequestBuilder)var7_9;
                                                                        var7_9 = var7_9.submit();
                                                                        var7_9 = var7_9.get();
                                                                        try {
                                                                            var7_9 = (Bitmap)var7_9;
                                                                        }
                                                                        catch (Exception v0) {
                                                                            var7_9 = var1_1.this$0;
                                                                            var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                                            var7_9.setColor_ipad(var4_6);
                                                                            var7_9 = var1_1.this$0;
                                                                            var7_9 = Glide.with((FragmentActivity)var7_9);
                                                                            var7_9 = var7_9.asBitmap();
                                                                            var11_13 = R$drawable.bg_19;
                                                                            var10_12 = var11_13;
                                                                            var7_9 = var7_9.load((Integer)var10_12);
                                                                            var10_12 = DiskCacheStrategy.NONE;
                                                                            var7_9 = var7_9.diskCacheStrategy((DiskCacheStrategy)var10_12);
                                                                            var7_9 = (RequestBuilder)var7_9;
                                                                            var7_9 = var7_9.skipMemoryCache((boolean)var6_8);
                                                                            var7_9 = (RequestBuilder)var7_9;
                                                                            var7_9 = var7_9.override(var9_11, var9_11);
                                                                            var7_9 = (RequestBuilder)var7_9;
                                                                            var7_9 = var7_9.submit();
                                                                            var7_9 = var7_9.get();
                                                                            var7_9 = (Bitmap)var7_9;
                                                                        }
                                                                        var10_12 = var1_1.this$0;
                                                                        var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                                        var12_14 = var1_1.this$0;
                                                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_368((EngineActivity)var12_14, (Bitmap)var7_9, var9_11);
                                                                        var10_12.setBitmapOriginal((Bitmap)var2_2 /* !! */ );
                                                                        var2_2 /* !! */  = var1_1.this$0;
                                                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                                                                        var9_11 = var2_2 /* !! */ .geTypeResize();
                                                                        var7_9 = ResizeType.SOCIAL_STORY;
                                                                        var8_10 = var7_9.ordinal();
                                                                        if (var9_11 != var8_10) break block436;
                                                                        var2_2 /* !! */  = var1_1.this$0;
                                                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                                                                        var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                                                        var7_9 = var1_1.this$0;
                                                                        var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                                        var8_10 = var7_9.getW();
                                                                        var10_12 = var1_1.this$0;
                                                                        var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                                        var11_13 = var10_12.getH();
                                                                        var2_2 /* !! */  = BitmapCropper.cropTo9x16((Bitmap)var2_2 /* !! */ , var8_10, var11_13);
                                                                        break block437;
                                                                    }
                                                                    var2_2 /* !! */  = var1_1.this$0;
                                                                    var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                                                                    var9_11 = var2_2 /* !! */ .geTypeResize();
                                                                    var7_9 = ResizeType.SQUARE;
                                                                    var8_10 = var7_9.ordinal();
                                                                    if (var9_11 != var8_10) break block438;
                                                                    var2_2 /* !! */  = var1_1.this$0;
                                                                    var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                                                                    var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                                                    var7_9 = var1_1.this$0;
                                                                    var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                                    var8_10 = var7_9.getW();
                                                                    var10_12 = var1_1.this$0;
                                                                    var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                                    var11_13 = var10_12.getH();
                                                                    var2_2 /* !! */  = BitmapCropper.cropTo1x1((Bitmap)var2_2 /* !! */ , var8_10, var11_13);
                                                                    break block437;
                                                                }
                                                                var2_2 /* !! */  = var1_1.this$0;
                                                                var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                                                                var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                                                var7_9 = var1_1.this$0;
                                                                var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                                var8_10 = var7_9.getW();
                                                                var10_12 = var1_1.this$0;
                                                                var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                                var11_13 = var10_12.getH();
                                                                var2_2 /* !! */  = BitmapCropper.cropTo16x9((Bitmap)var2_2 /* !! */ , var8_10, var11_13);
                                                            }
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                            var10_12 = var1_1.this$0;
                                                            var10_12 = EngineActivity.cfr_renamed_2((EngineActivity)var10_12);
                                                            var11_13 = (int)var10_12.isGlass();
                                                            var7_9.setGlass((boolean)var11_13);
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                            var11_13 = 0;
                                                            var13_15 = 0.0f;
                                                            var10_12 = null;
                                                            var7_9.setVideo(false);
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                            var7_9.updatePosCanvas((Bitmap)var2_2 /* !! */ );
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                            var12_14 = var1_1.this$0;
                                                            var12_14 = EngineActivity.cfr_renamed_2((EngineActivity)var12_14);
                                                            var14_16 = var12_14.getIpad_type();
                                                            var15_17 = var1_1.this$0;
                                                            var15_17 = EngineActivity.cfr_renamed_2((EngineActivity)var15_17);
                                                            var16_18 = var15_17.geTypeResize();
                                                            var7_9.updateIpad((Bitmap)var2_2 /* !! */ , var14_16, var16_18);
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                            var8_10 = var7_9.getIpad_type();
                                                            var12_14 = IpadType.IPAD_NEOMORPHIC;
                                                            var14_16 = var12_14.ordinal();
                                                            if (var8_10 != var14_16) break block439;
                                                            var7_9 = var1_1.this$0;
                                                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                            var7_9 = var7_9.getIpad_rect();
                                                            var17_19 = var7_9.width();
                                                            var14_16 = 1058642330;
                                                            var18_22 = 0.6f;
                                                            var8_10 = (int)(var17_19 *= var18_22);
                                                            var12_14 = var1_1.this$0;
                                                            var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                                                            var12_14 = var12_14.getBitmapOriginal();
                                                            var14_16 = var12_14.getWidth();
                                                            var18_22 = var14_16;
                                                            var15_17 = var1_1.this$0;
                                                            var15_17 = EngineActivity.cfr_renamed_2((EngineActivity)var15_17);
                                                            var19_25 = var15_17.getX_square();
                                                            var18_22 *= var19_25;
                                                            var14_16 = Math.round(var18_22);
                                                            var15_17 = var1_1.this$0;
                                                            var15_17 = EngineActivity.cfr_renamed_64((EngineActivity)var15_17);
                                                            var15_17 = var15_17.getBitmapOriginal();
                                                            var16_18 = var15_17.getHeight();
                                                            var19_25 = var16_18;
                                                            var20_28 = var1_1.this$0;
                                                            var20_28 = EngineActivity.cfr_renamed_2((EngineActivity)var20_28);
                                                            var21_31 = var20_28.getY_square();
                                                            var19_25 *= var21_31;
                                                            var16_18 = Math.round(var19_25);
                                                            var22_34 = var8_10 + var14_16;
                                                            var23_37 = var1_1.this$0;
                                                            var23_37 = EngineActivity.cfr_renamed_64((EngineActivity)var23_37);
                                                            var23_37 = var23_37.getBitmapOriginal();
                                                            var24_40 = var23_37.getWidth();
                                                            if (var22_34 <= var24_40) break block440;
                                                            var23_37 = var1_1.this$0;
                                                            var23_37 = EngineActivity.cfr_renamed_64((EngineActivity)var23_37);
                                                            var23_37 = var23_37.getBitmapOriginal();
                                                            var24_40 = var23_37.getWidth();
                                                            var14_16 -= (var22_34 -= var24_40);
                                                            var20_28 = var1_1.this$0;
                                                            var20_28 = EngineActivity.cfr_renamed_64((EngineActivity)var20_28);
                                                            var20_28 = var20_28.getBitmapOriginal();
                                                            var22_34 = var20_28.getWidth();
                                                        }
                                                        var24_40 = var8_10 + var16_18;
                                                        var25_43 = var1_1.this$0;
                                                        var25_43 = EngineActivity.cfr_renamed_64((EngineActivity)var25_43);
                                                        var25_43 = var25_43.getBitmapOriginal();
                                                        var26_45 = var25_43.getHeight();
                                                        if (var24_40 <= var26_45) break block441;
                                                        var25_43 = var1_1.this$0;
                                                        var25_43 = EngineActivity.cfr_renamed_64((EngineActivity)var25_43);
                                                        var25_43 = var25_43.getBitmapOriginal();
                                                        var26_45 = var25_43.getHeight();
                                                        var16_18 -= (var24_40 -= var26_45);
                                                        var23_37 = var1_1.this$0;
                                                        var23_37 = EngineActivity.cfr_renamed_64((EngineActivity)var23_37);
                                                        var23_37 = var23_37.getBitmapOriginal();
                                                        var24_40 = var23_37.getHeight();
                                                    }
                                                    if (var14_16 < 0) {
                                                        var14_16 = 0;
                                                        var12_14 = null;
                                                        var18_22 = 0.0f;
                                                    }
                                                    if (var16_18 >= 0) {
                                                        var11_13 = var16_18;
                                                    }
                                                    var15_17 = new Rect(var14_16, var11_13, var22_34, var24_40);
                                                    var10_12 = var1_1.this$0;
                                                    var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                    var10_12.setRadius_square(var8_10);
                                                    var10_12 = var1_1.this$0;
                                                    var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                    var10_12 = var10_12.getBitmapOriginal();
                                                    var11_13 = var10_12.getWidth();
                                                    var13_15 = var11_13;
                                                    var12_14 = var1_1.this$0;
                                                    var12_14 = EngineActivity.cfr_renamed_2((EngineActivity)var12_14);
                                                    var18_22 = var12_14.getWidth_square();
                                                    var11_13 = (int)(var13_15 *= var18_22);
                                                    var12_14 = var1_1.this$0;
                                                    var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                                                    var12_14 = var12_14.getBitmapOriginal();
                                                    var14_16 = var12_14.getHeight();
                                                    var18_22 = var14_16;
                                                    var20_28 = var1_1.this$0;
                                                    var20_28 = EngineActivity.cfr_renamed_2((EngineActivity)var20_28);
                                                    var21_31 = var20_28.getHeight_square();
                                                    var14_16 = (int)(var18_22 *= var21_31);
                                                    var20_28 = var1_1.this$0;
                                                    var20_28 = EngineActivity.cfr_renamed_64((EngineActivity)var20_28);
                                                    var20_28 = var20_28.getBitmapOriginal();
                                                    var7_9 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var20_28, (Rect)var15_17, var8_10, var11_13, var14_16);
                                                    var22_34 = var15_17.left + var11_13;
                                                    var15_17.right = var22_34;
                                                    var11_13 = var15_17.top + var14_16;
                                                    var15_17.bottom = var11_13;
                                                    var10_12 = var1_1.this$0;
                                                    var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                                                    var10_12.setRectSquare((Rect)var15_17);
                                                    var27_47 = var7_9;
                                                    var28_48 /* !! */  = var15_17;
                                                    break block442;
                                                }
                                                var7_9 = var1_1.this$0;
                                                var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                var8_10 = var7_9.getIpad_type();
                                                var12_14 = IpadType.IPAD;
                                                var14_16 = var12_14.ordinal();
                                                if (var8_10 == var14_16) break block443;
                                                var7_9 = var1_1.this$0;
                                                var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                var8_10 = var7_9.getIpad_type();
                                                var12_14 = IpadType.IPAD_UNBLUR;
                                                var14_16 = var12_14.ordinal();
                                                if (var8_10 == var14_16) break block443;
                                                var7_9 = var1_1.this$0;
                                                var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                                                var8_10 = var7_9.getIpad_type();
                                                var12_14 = IpadType.IPAD_CLASSIC;
                                                var14_16 = var12_14.ordinal();
                                                if (var8_10 == var14_16) break block443;
                                                var7_9 = var1_1.this$0;
                                                var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                var7_9 = var7_9.getIpad_rect();
                                                var17_20 = var7_9.width();
                                                var14_16 = 1065353216;
                                                var18_23 = 1.0f;
                                                var8_10 = (int)(var17_20 *= var18_23);
                                                var18_23 = var2_2 /* !! */ .getHeight();
                                                var16_18 = 1057560199;
                                                var19_26 = 0.5355f;
                                                var14_16 = (int)(var18_23 *= var19_26);
                                                var15_17 = var1_1.this$0;
                                                var15_17 = EngineActivity.cfr_renamed_64((EngineActivity)var15_17);
                                                var15_17 = var15_17.getBitmapOriginal();
                                                var16_18 = var15_17.getWidth();
                                                var19_26 = var16_18;
                                                var20_29 = var1_1.this$0;
                                                var20_29 = EngineActivity.cfr_renamed_2((EngineActivity)var20_29);
                                                var21_32 = var20_29.getX_square();
                                                var19_26 *= var21_32;
                                                var16_18 = Math.round(var19_26);
                                                var20_29 = var1_1.this$0;
                                                var20_29 = EngineActivity.cfr_renamed_64((EngineActivity)var20_29);
                                                var20_29 = var20_29.getBitmapOriginal();
                                                var22_35 = var20_29.getHeight();
                                                var21_32 = var22_35;
                                                var23_38 = var1_1.this$0;
                                                var23_38 = EngineActivity.cfr_renamed_2((EngineActivity)var23_38);
                                                var29_49 = var23_38.getY_square();
                                                var21_32 *= var29_49;
                                                var22_35 = Math.round(var21_32);
                                                var8_10 += var16_18;
                                                var23_38 = var1_1.this$0;
                                                var23_38 = EngineActivity.cfr_renamed_64((EngineActivity)var23_38);
                                                var23_38 = var23_38.getBitmapOriginal();
                                                var24_41 = var23_38.getWidth();
                                                if (var8_10 <= var24_41) break block444;
                                                var23_38 = var1_1.this$0;
                                                var23_38 = EngineActivity.cfr_renamed_64((EngineActivity)var23_38);
                                                var23_38 = var23_38.getBitmapOriginal();
                                                var24_41 = var23_38.getWidth();
                                                var16_18 -= (var8_10 -= var24_41);
                                                var7_9 = var1_1.this$0;
                                                var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                                var7_9 = var7_9.getBitmapOriginal();
                                                var8_10 = var7_9.getWidth();
                                            }
                                            var14_16 += var22_35;
                                            var23_38 = var1_1.this$0;
                                            var23_38 = EngineActivity.cfr_renamed_64((EngineActivity)var23_38);
                                            var23_38 = var23_38.getBitmapOriginal();
                                            var24_41 = var23_38.getHeight();
                                            if (var14_16 <= var24_41) break block445;
                                            var23_38 = var1_1.this$0;
                                            var23_38 = EngineActivity.cfr_renamed_64((EngineActivity)var23_38);
                                            var23_38 = var23_38.getBitmapOriginal();
                                            var24_41 = var23_38.getHeight();
                                            var22_35 -= (var14_16 -= var24_41);
                                            var12_14 = var1_1.this$0;
                                            var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                                            var12_14 = var12_14.getBitmapOriginal();
                                            var14_16 = var12_14.getHeight();
                                        }
                                        if (var16_18 < 0) {
                                            var16_18 = 0;
                                            var15_17 = null;
                                            var19_26 = 0.0f;
                                        }
                                        if (var22_35 < 0) {
                                            var22_35 = 0;
                                            var20_29 = null;
                                            var21_32 = 0.0f;
                                        }
                                        var23_38 = new Rect(var16_18, var22_35, var8_10, var14_16);
                                        var7_9 = var1_1.this$0;
                                        var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                        var7_9 = var7_9.getBitmapOriginal();
                                        var8_10 = var7_9.getWidth();
                                        var17_20 = var8_10;
                                        var12_14 = var1_1.this$0;
                                        var12_14 = EngineActivity.cfr_renamed_2((EngineActivity)var12_14);
                                        var18_23 = var12_14.getWidth_square();
                                        var8_10 = (int)(var17_20 *= var18_23);
                                        var12_14 = var1_1.this$0;
                                        var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                                        var12_14 = var12_14.getBitmapOriginal();
                                        var14_16 = var12_14.getHeight();
                                        var18_23 = var14_16;
                                        var15_17 = var1_1.this$0;
                                        var15_17 = EngineActivity.cfr_renamed_2((EngineActivity)var15_17);
                                        var19_26 = var15_17.getHeight_square();
                                        var14_16 = (int)(var18_23 *= var19_26);
                                        var15_17 = var1_1.this$0;
                                        var15_17 = EngineActivity.cfr_renamed_64((EngineActivity)var15_17);
                                        var15_17 = var15_17.getBitmapOriginal();
                                        var15_17 = UtilsBitmap.cropToSquare((Bitmap)var15_17, (Rect)var23_38, var8_10, var14_16);
                                        var20_29 = var1_1.this$0;
                                        var20_29 = EngineActivity.cfr_renamed_64((EngineActivity)var20_29);
                                        var20_29.setBitmapSquare((Bitmap)var15_17);
                                        var20_29 = var1_1.this$0;
                                        var20_29 = EngineActivity.cfr_renamed_64((EngineActivity)var20_29);
                                        var20_29.setRadius_square(0);
                                        var11_13 = var23_38.left + var8_10;
                                        var23_38.right = var11_13;
                                        var8_10 = var23_38.top + var14_16;
                                        var23_38.bottom = var8_10;
                                        var7_9 = var1_1.this$0;
                                        var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                        var7_9.setRectSquare((Rect)var23_38);
                                        var27_47 = var15_17;
                                        var28_48 /* !! */  = var23_38;
                                        break block442;
                                    }
                                    var7_9 = var1_1.this$0;
                                    var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                    var7_9 = var7_9.getIpad_rect();
                                    var17_21 = var7_9.width() * 0.87530595f;
                                    var8_10 = (int)var17_21;
                                    var18_24 = var8_10;
                                    var16_18 = 1066443735;
                                    var19_27 = 1.13f;
                                    var14_16 = (int)(var18_24 *= var19_27);
                                    var16_18 = Math.min(var8_10, var14_16);
                                    var20_30 = var1_1.this$0;
                                    var20_30 = EngineActivity.cfr_renamed_64((EngineActivity)var20_30);
                                    var20_30 = var20_30.getBitmapOriginal();
                                    var22_36 = var20_30.getWidth();
                                    var21_33 = var22_36;
                                    var23_39 = var1_1.this$0;
                                    var23_39 = EngineActivity.cfr_renamed_2((EngineActivity)var23_39);
                                    var29_50 = var23_39.getX_square();
                                    var21_33 *= var29_50;
                                    var22_36 = Math.round(var21_33);
                                    var23_39 = var1_1.this$0;
                                    var23_39 = EngineActivity.cfr_renamed_64((EngineActivity)var23_39);
                                    var23_39 = var23_39.getBitmapOriginal();
                                    var24_42 = var23_39.getHeight();
                                    var29_50 = var24_42;
                                    var25_44 = var1_1.this$0;
                                    var25_44 = EngineActivity.cfr_renamed_2((EngineActivity)var25_44);
                                    var30_51 = var25_44.getY_square();
                                    var29_50 *= var30_51;
                                    var24_42 = Math.round(var29_50);
                                    var8_10 += var22_36;
                                    var25_44 = var1_1.this$0;
                                    var25_44 = EngineActivity.cfr_renamed_64((EngineActivity)var25_44);
                                    var25_44 = var25_44.getBitmapOriginal();
                                    var26_46 = var25_44.getWidth();
                                    if (var8_10 <= var26_46) break block446;
                                    var25_44 = var1_1.this$0;
                                    var25_44 = EngineActivity.cfr_renamed_64((EngineActivity)var25_44);
                                    var25_44 = var25_44.getBitmapOriginal();
                                    var26_46 = var25_44.getWidth();
                                    var22_36 -= (var8_10 -= var26_46);
                                    var7_9 = var1_1.this$0;
                                    var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                                    var7_9 = var7_9.getBitmapOriginal();
                                    var8_10 = var7_9.getWidth();
                                }
                                var14_16 += var24_42;
                                var25_44 = var1_1.this$0;
                                var25_44 = EngineActivity.cfr_renamed_64((EngineActivity)var25_44);
                                var25_44 = var25_44.getBitmapOriginal();
                                var26_46 = var25_44.getHeight();
                                if (var14_16 <= var26_46) break block447;
                                var25_44 = var1_1.this$0;
                                var25_44 = EngineActivity.cfr_renamed_64((EngineActivity)var25_44);
                                var25_44 = var25_44.getBitmapOriginal();
                                var26_46 = var25_44.getHeight();
                                var24_42 -= (var14_16 -= var26_46);
                                var12_14 = var1_1.this$0;
                                var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                                var12_14 = var12_14.getBitmapOriginal();
                                var14_16 = var12_14.getHeight();
                            }
                            if (var22_36 < 0) {
                                var22_36 = 0;
                                var20_30 = null;
                                var21_33 = 0.0f;
                            }
                            if (var24_42 < 0) {
                                var24_42 = 0;
                                var23_39 = null;
                                var29_50 = 0.0f;
                            }
                            var25_44 = new Rect(var22_36, var24_42, var8_10, var14_16);
                            var7_9 = var1_1.this$0;
                            var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                            var8_10 = var7_9.getIpad_type();
                            var12_14 = IpadType.IPAD_CLASSIC;
                            var14_16 = var12_14.ordinal();
                            if (var8_10 != var14_16) break block448;
                            var7_9 = var1_1.this$0;
                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                            var7_9 = var7_9.getBitmapOriginal();
                            var8_10 = var7_9.getWidth();
                            var17_21 = var8_10;
                            var12_14 = var1_1.this$0;
                            var12_14 = EngineActivity.cfr_renamed_2((EngineActivity)var12_14);
                            var18_24 = var12_14.getWidth_square();
                            var8_10 = (int)(var17_21 *= var18_24);
                            var12_14 = var1_1.this$0;
                            var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                            var12_14 = var12_14.getBitmapOriginal();
                            var14_16 = var12_14.getHeight();
                            var18_24 = var14_16;
                            var15_17 = var1_1.this$0;
                            var15_17 = EngineActivity.cfr_renamed_2((EngineActivity)var15_17);
                            var19_27 = var15_17.getHeight_square();
                            var14_16 = (int)(var18_24 *= var19_27);
                            var15_17 = var1_1.this$0;
                            var15_17 = EngineActivity.cfr_renamed_64((EngineActivity)var15_17);
                            var15_17 = var15_17.getBitmapOriginal();
                            var15_17 = UtilsBitmap.cropToSquare((Bitmap)var15_17, (Rect)var25_44, var8_10, var14_16);
                            var20_30 = var1_1.this$0;
                            var20_30 = EngineActivity.cfr_renamed_64((EngineActivity)var20_30);
                            var20_30.setBitmapSquare((Bitmap)var15_17);
                            var20_30 = var1_1.this$0;
                            var20_30 = EngineActivity.cfr_renamed_64((EngineActivity)var20_30);
                            var20_30.setRadius_square(0);
                            var11_13 = var25_44.left + var8_10;
                            var25_44.right = var11_13;
                            var8_10 = var25_44.top + var14_16;
                            var25_44.bottom = var8_10;
                            var7_9 = var1_1.this$0;
                            var7_9 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                            var7_9.setRectSquare((Rect)var25_44);
                            var7_9 = var15_17;
                            break block449;
                        }
                        var17_21 = var16_18;
                        var11_13 = 1037905692;
                        var13_15 = 0.10800001f;
                        var8_10 = (int)(var17_21 *= var13_15);
                        var10_12 = var1_1.this$0;
                        var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                        var10_12.setRadius_square(var8_10);
                        var10_12 = var1_1.this$0;
                        var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                        var10_12 = var10_12.getBitmapOriginal();
                        var11_13 = var10_12.getWidth();
                        var13_15 = var11_13;
                        var12_14 = var1_1.this$0;
                        var12_14 = EngineActivity.cfr_renamed_2((EngineActivity)var12_14);
                        var18_24 = var12_14.getWidth_square();
                        var11_13 = (int)(var13_15 *= var18_24);
                        var12_14 = var1_1.this$0;
                        var12_14 = EngineActivity.cfr_renamed_64((EngineActivity)var12_14);
                        var12_14 = var12_14.getBitmapOriginal();
                        var14_16 = var12_14.getHeight();
                        var18_24 = var14_16;
                        var15_17 = var1_1.this$0;
                        var15_17 = EngineActivity.cfr_renamed_2((EngineActivity)var15_17);
                        var19_27 = var15_17.getHeight_square();
                        var14_16 = (int)(var18_24 *= var19_27);
                        var15_17 = var1_1.this$0;
                        var15_17 = EngineActivity.cfr_renamed_64((EngineActivity)var15_17);
                        var15_17 = var15_17.getBitmapOriginal();
                        var7_9 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var15_17, (Rect)var25_44, var8_10, var11_13, var14_16);
                        var16_18 = var25_44.left + var11_13;
                        var25_44.right = var16_18;
                        var11_13 = var25_44.top + var14_16;
                        var25_44.bottom = var11_13;
                        var10_12 = var1_1.this$0;
                        var10_12 = EngineActivity.cfr_renamed_64((EngineActivity)var10_12);
                        var10_12.setRectSquare((Rect)var25_44);
                    }
                    var27_47 = var7_9;
                    var28_48 /* !! */  = var25_44;
                }
                var7_9 = var1_1.this$0;
                var7_9 = EngineActivity.cfr_renamed_2((EngineActivity)var7_9);
                var7_9 = var7_9.getGradient();
                var11_13 = 20;
                var13_15 = 2.8E-44f;
                if (var7_9 == null) ** GOTO lbl936
                var7_9 = var1_1.this$0;
                var31_52 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                var7_9 = var1_1.this$0;
                var32_54 = UtilsBitmap.blur((Context)var7_9, (Bitmap)var2_2 /* !! */ , var11_13, var6_8);
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var33_56 = var2_2 /* !! */ .getGradient();
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var34_57 = var2_2 /* !! */ .getIpad_type();
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var35_59 = var2_2 /* !! */ .geTypeResize();
                var31_52.setBitmap(var32_54, (Bitmap)var27_47, var33_56, var34_57, var35_59, (Rect)var28_48 /* !! */ );
                ** GOTO lbl963
lbl936:
                // 1 sources

                var7_9 = var1_1.this$0;
                var31_53 = EngineActivity.cfr_renamed_64((EngineActivity)var7_9);
                var7_9 = var1_1.this$0;
                var32_55 = UtilsBitmap.blur((Context)var7_9, (Bitmap)var2_2 /* !! */ , var11_13, var6_8);
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var36_61 = var2_2 /* !! */ .getColor_ipad();
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var34_58 = var2_2 /* !! */ .getIpad_type();
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var35_60 = var2_2 /* !! */ .geTypeResize();
                var31_53.setBitmap(var32_55, (Bitmap)var27_47, var36_61, var34_58, var35_60, (Rect)var28_48 /* !! */ );
lbl963:
                // 2 sources

                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_2(var2_2 /* !! */ );
                var9_11 = var2_2 /* !! */ .getIpad_type();
                var5_7 = IpadType.BLUE_TYPE;
                var6_8 = var5_7.ordinal();
                if (var9_11 != var6_8) break block450;
                var2_2 /* !! */  = var1_1.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
                var2_2 /* !! */  = var2_2 /* !! */ .getPaintLecture();
                var9_11 = var2_2 /* !! */ .getColor();
                break block451;
            }
            var2_2 /* !! */  = var1_1.this$0;
            var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
            var2_2 /* !! */  = var2_2 /* !! */ .getPaintLecture();
            var9_11 = var2_2 /* !! */ .getColor();
            var9_11 = var9_11 == var4_6 ? -256 : -8780025;
        }
        var3_5 = var1_1.this$0;
        var3_5 = EngineActivity.cfr_renamed_64((EngineActivity)var3_5);
        var3_5.setClr_trsl(var9_11);
        var2_2 /* !! */  = var1_1.this$0;
        var2_2 /* !! */  = EngineActivity.cfr_renamed_64(var2_2 /* !! */ );
        var3_5 = var1_1.this$0;
        var3_5 = EngineActivity.cfr_renamed_64((EngineActivity)var3_5);
        var3_5 = var3_5.getPaintLecture();
        var4_6 = var3_5.getColor();
        var2_2 /* !! */ .setClr_aya(var4_6);
        var2_2 /* !! */  = var1_1.this$0;
        EngineActivity.cfr_renamed_295(var2_2 /* !! */ );
        {
            catch (Exception var2_3) {
                var5_7 = "init ";
                var3_5 = new StringBuilder((String)var5_7);
                var2_4 = var2_3.getMessage();
                var2_4 = var3_5.append(var2_4).toString();
                var3_5 = "Tag : ";
                Log.e((String)var3_5, (String)var2_4);
            }
        }
    }
}

