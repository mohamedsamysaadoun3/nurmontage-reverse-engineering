/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.util.Log
 */
package hazem.nurmontage.videoquran;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.model.Gradient;

class EngineActivity$80
implements EditIpadFragment$IIpadEditCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$80(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onCancel() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onChangeType(int var1_1) {
        block402: {
            block401: {
                block400: {
                    block399: {
                        block398: {
                            block397: {
                                block396: {
                                    block395: {
                                        block394: {
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64(this.this$0);
                                            var3_3 = var2_2 /* !! */ .getmIpadType();
                                            if (var3_3 == var1_1) {
                                                return;
                                            }
                                            var2_2 /* !! */  = EditIpadFragment.instance;
                                            if (var2_2 /* !! */  != null) {
                                                var2_2 /* !! */  = EditIpadFragment.instance;
                                                var2_2 /* !! */ .scrollToSelectedPosition();
                                            }
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_2((EngineActivity)var2_2 /* !! */ );
                                            var2_2 /* !! */ .setIpad_type(var1_1);
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                            var2_2 /* !! */ .changeTypeIpad(var1_1);
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_2((EngineActivity)var2_2 /* !! */ );
                                            var3_3 = (int)var2_2 /* !! */ .isVideoSquare();
                                            var4_4 = 0;
                                            var5_5 = 0.0f;
                                            var6_6 = null;
                                            if (var3_3 == 0) ** GOTO lbl99
                                            var2_2 /* !! */  = IpadType.GRADIENT;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 == var3_3) ** GOTO lbl83
                                            var2_2 /* !! */  = IpadType.BLACK_LAYER;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 == var3_3) ** GOTO lbl83
                                            var2_2 /* !! */  = IpadType.MASK_BRUSH;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 == var3_3) ** GOTO lbl83
                                            var2_2 /* !! */  = IpadType.BLUE_TYPE;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 == var3_3) ** GOTO lbl83
                                            var2_2 /* !! */  = IpadType.CASSET_IMG;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 == var3_3) ** GOTO lbl83
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_2((EngineActivity)var2_2 /* !! */ );
                                            var3_3 = var2_2 /* !! */ .getIpad_type();
                                            var7_7 = IpadType.CASSET_IMG_BLUR;
                                            var8_8 = var7_7.ordinal();
                                            if (var3_3 != var8_8) ** GOTO lbl99
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                            var7_7 = this.this$0;
                                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                            var7_7 = var7_7.getBitmapBlured();
                                            var2_2 /* !! */ .setBitmapSquare((Bitmap)var7_7);
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                            var2_2 /* !! */ .setRadius_square(0);
                                            ** GOTO lbl99
lbl83:
                                            // 5 sources

                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                            var7_7 = this.this$0;
                                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                            var7_7 = var7_7.getBitmapNotBlur();
                                            var2_2 /* !! */ .setBitmapSquare((Bitmap)var7_7);
                                            var2_2 /* !! */  = this.this$0;
                                            var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                            var2_2 /* !! */ .setRadius_square(0);
lbl99:
                                            // 4 sources

                                            var2_2 /* !! */  = IpadType.IPAD;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            var8_8 = 1066443735;
                                            var9_9 = 1.13f;
                                            var10_10 = 1063261197;
                                            var11_11 = 0.87530595f;
                                            if (var1_1 == var3_3) break block394;
                                            var2_2 /* !! */  = IpadType.IPAD_UNBLUR;
                                            var3_3 = var2_2 /* !! */ .ordinal();
                                            if (var1_1 != var3_3) ** GOTO lbl292
                                        }
                                        var2_2 /* !! */  = this.this$0;
                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                        var2_2 /* !! */  = var2_2 /* !! */ .getIpad_rect();
                                        var12_12 = var2_2 /* !! */ .width() * var11_11;
                                        var3_3 = (int)var12_12;
                                        var13_13 = (float)var3_3 * var9_9;
                                        var14_14 = (int)var13_13;
                                        var15_15 = Math.min(var3_3, var14_14);
                                        var16_16 = 1037905692;
                                        var17_17 = 0.10800001f;
                                        var18_18 = (int)(var15_15 *= var17_17);
                                        var19_19 = this.this$0;
                                        var19_19 = EngineActivity.cfr_renamed_64((EngineActivity)var19_19);
                                        var19_19 = var19_19.getBitmapOriginal();
                                        var16_16 = var19_19.getWidth();
                                        var17_17 = var16_16;
                                        var20_20 = this.this$0;
                                        var20_20 = EngineActivity.cfr_renamed_2((EngineActivity)var20_20);
                                        var21_21 = var20_20.getX_square();
                                        var17_17 *= var21_21;
                                        var16_16 = Math.round(var17_17);
                                        var20_20 = this.this$0;
                                        var20_20 = EngineActivity.cfr_renamed_64((EngineActivity)var20_20);
                                        var20_20 = var20_20.getBitmapOriginal();
                                        var22_22 = var20_20.getHeight();
                                        var21_21 = var22_22;
                                        var23_23 = this.this$0;
                                        var23_23 = EngineActivity.cfr_renamed_2((EngineActivity)var23_23);
                                        var24_24 = var23_23.getY_square();
                                        var21_21 *= var24_24;
                                        var22_22 = Math.round(var21_21);
                                        var3_3 += var16_16;
                                        var23_23 = this.this$0;
                                        var23_23 = EngineActivity.cfr_renamed_64((EngineActivity)var23_23);
                                        var23_23 = var23_23.getBitmapOriginal();
                                        var25_25 = var23_23.getWidth();
                                        if (var3_3 <= var25_25) break block395;
                                        var23_23 = this.this$0;
                                        var23_23 = EngineActivity.cfr_renamed_64((EngineActivity)var23_23);
                                        var23_23 = var23_23.getBitmapOriginal();
                                        var25_25 = var23_23.getWidth();
                                        var16_16 -= (var3_3 -= var25_25);
                                        var2_2 /* !! */  = this.this$0;
                                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                        var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                        var3_3 = var2_2 /* !! */ .getWidth();
                                    }
                                    var14_14 += var22_22;
                                    var23_23 = this.this$0;
                                    var23_23 = EngineActivity.cfr_renamed_64((EngineActivity)var23_23);
                                    var23_23 = var23_23.getBitmapOriginal();
                                    var25_25 = var23_23.getHeight();
                                    if (var14_14 <= var25_25) break block396;
                                    var23_23 = this.this$0;
                                    var23_23 = EngineActivity.cfr_renamed_64((EngineActivity)var23_23);
                                    var23_23 = var23_23.getBitmapOriginal();
                                    var25_25 = var23_23.getHeight();
                                    var22_22 -= (var14_14 -= var25_25);
                                    var26_26 = this.this$0;
                                    var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                                    var26_26 = var26_26.getBitmapOriginal();
                                    var14_14 = var26_26.getHeight();
                                }
                                if (var16_16 < 0) {
                                    var16_16 = 0;
                                    var19_19 = null;
                                    var17_17 = 0.0f;
                                }
                                if (var22_22 < 0) {
                                    var22_22 = 0;
                                    var20_20 = null;
                                    var21_21 = 0.0f;
                                }
                                var23_23 = new Rect(var16_16, var22_22, var3_3, var14_14);
                                var2_2 /* !! */  = this.this$0;
                                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                var3_3 = var2_2 /* !! */ .getWidth();
                                var12_12 = var3_3;
                                var26_26 = this.this$0;
                                var26_26 = EngineActivity.cfr_renamed_2((EngineActivity)var26_26);
                                var13_13 = var26_26.getWidth_square();
                                var3_3 = (int)(var12_12 *= var13_13);
                                var26_26 = this.this$0;
                                var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                                var26_26 = var26_26.getBitmapOriginal();
                                var14_14 = var26_26.getHeight();
                                var13_13 = var14_14;
                                var19_19 = this.this$0;
                                var19_19 = EngineActivity.cfr_renamed_2((EngineActivity)var19_19);
                                var17_17 = var19_19.getHeight_square();
                                var14_14 = (int)(var13_13 *= var17_17);
                                var19_19 = this.this$0;
                                var19_19 = EngineActivity.cfr_renamed_64((EngineActivity)var19_19);
                                var19_19 = var19_19.getBitmapOriginal();
                                var19_19 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var19_19, (Rect)var23_23, var18_18, var3_3, var14_14);
                                var20_20 = this.this$0;
                                var20_20 = EngineActivity.cfr_renamed_64((EngineActivity)var20_20);
                                var20_20.setBitmapSquare((Bitmap)var19_19);
                                var19_19 = this.this$0;
                                var19_19 = EngineActivity.cfr_renamed_64((EngineActivity)var19_19);
                                var19_19.setRadius_square(var18_18);
                                var18_18 = var23_23.left + var3_3;
                                var23_23.right = var18_18;
                                var3_3 = var23_23.top + var14_14;
                                var23_23.bottom = var3_3;
                                var2_2 /* !! */  = this.this$0;
                                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                var2_2 /* !! */ .setRectSquare((Rect)var23_23);
lbl292:
                                // 2 sources

                                var2_2 /* !! */  = IpadType.IPAD_CLASSIC;
                                var3_3 = var2_2 /* !! */ .ordinal();
                                if (var1_1 != var3_3) ** GOTO lbl470
                                var2_2 /* !! */  = this.this$0;
                                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                var2_2 /* !! */  = var2_2 /* !! */ .getIpad_rect();
                                var12_12 = var2_2 /* !! */ .width() * var11_11;
                                var3_3 = (int)var12_12;
                                var11_11 = (float)var3_3 * var9_9;
                                var8_8 = (int)var11_11;
                                var27_27 = this.this$0;
                                var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                                var27_27 = var27_27.getBitmapOriginal();
                                var10_10 = var27_27.getWidth();
                                var11_11 = var10_10;
                                var26_26 = this.this$0;
                                var26_26 = EngineActivity.cfr_renamed_2((EngineActivity)var26_26);
                                var13_13 = var26_26.getX_square();
                                var11_11 *= var13_13;
                                var10_10 = Math.round(var11_11);
                                var26_26 = this.this$0;
                                var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                                var26_26 = var26_26.getBitmapOriginal();
                                var14_14 = var26_26.getHeight();
                                var13_13 = var14_14;
                                var28_28 = this.this$0;
                                var28_28 = EngineActivity.cfr_renamed_2((EngineActivity)var28_28);
                                var15_15 = var28_28.getY_square();
                                var13_13 *= var15_15;
                                var14_14 = Math.round(var13_13);
                                var3_3 += var10_10;
                                var28_28 = this.this$0;
                                var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                                var28_28 = var28_28.getBitmapOriginal();
                                var18_18 = var28_28.getWidth();
                                if (var3_3 <= var18_18) break block397;
                                var28_28 = this.this$0;
                                var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                                var28_28 = var28_28.getBitmapOriginal();
                                var18_18 = var28_28.getWidth();
                                var10_10 -= (var3_3 -= var18_18);
                                var2_2 /* !! */  = this.this$0;
                                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                                var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                                var3_3 = var2_2 /* !! */ .getWidth();
                            }
                            var8_8 += var14_14;
                            var28_28 = this.this$0;
                            var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                            var28_28 = var28_28.getBitmapOriginal();
                            var18_18 = var28_28.getHeight();
                            if (var8_8 <= var18_18) break block398;
                            var28_28 = this.this$0;
                            var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                            var28_28 = var28_28.getBitmapOriginal();
                            var18_18 = var28_28.getHeight();
                            var14_14 -= (var8_8 -= var18_18);
                            var7_7 = this.this$0;
                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            var7_7 = var7_7.getBitmapOriginal();
                            var8_8 = var7_7.getHeight();
                        }
                        if (var10_10 < 0) {
                            var10_10 = 0;
                            var27_27 = null;
                            var11_11 = 0.0f;
                        }
                        if (var14_14 < 0) {
                            var14_14 = 0;
                            var26_26 = null;
                            var13_13 = 0.0f;
                        }
                        var28_28 = new Rect(var10_10, var14_14, var3_3, var8_8);
                        var2_2 /* !! */  = this.this$0;
                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                        var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                        var3_3 = var2_2 /* !! */ .getWidth();
                        var12_12 = var3_3;
                        var7_7 = this.this$0;
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        var9_9 = var7_7.getWidth_square();
                        var3_3 = (int)(var12_12 *= var9_9);
                        var7_7 = this.this$0;
                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var7_7.getBitmapOriginal();
                        var8_8 = var7_7.getHeight();
                        var9_9 = var8_8;
                        var27_27 = this.this$0;
                        var27_27 = EngineActivity.cfr_renamed_2((EngineActivity)var27_27);
                        var11_11 = var27_27.getHeight_square();
                        var8_8 = (int)(var9_9 *= var11_11);
                        var27_27 = this.this$0;
                        var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                        var27_27 = var27_27.getBitmapOriginal();
                        var27_27 = UtilsBitmap.cropToSquare((Bitmap)var27_27, (Rect)var28_28, var3_3, var8_8);
                        var26_26 = this.this$0;
                        var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                        var26_26.setBitmapSquare((Bitmap)var27_27);
                        var27_27 = this.this$0;
                        var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                        var27_27.setRadius_square(0);
                        var10_10 = var28_28.left + var3_3;
                        var28_28.right = var10_10;
                        var3_3 = var28_28.top + var8_8;
                        var28_28.bottom = var3_3;
                        var2_2 /* !! */  = this.this$0;
                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                        var2_2 /* !! */ .setRectSquare((Rect)var28_28);
lbl470:
                        // 2 sources

                        var2_2 /* !! */  = IpadType.IPAD_NEOMORPHIC;
                        var3_3 = var2_2 /* !! */ .ordinal();
                        if (var1_1 != var3_3) ** GOTO lbl648
                        var2_2 /* !! */  = this.this$0;
                        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                        var2_2 /* !! */  = var2_2 /* !! */ .getIpad_rect();
                        var12_12 = var2_2 /* !! */ .width();
                        var8_8 = 1058642330;
                        var9_9 = 0.6f;
                        var3_3 = (int)(var12_12 *= var9_9);
                        var7_7 = this.this$0;
                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        var7_7 = var7_7.getBitmapOriginal();
                        var8_8 = var7_7.getWidth();
                        var9_9 = var8_8;
                        var27_27 = this.this$0;
                        var27_27 = EngineActivity.cfr_renamed_2((EngineActivity)var27_27);
                        var11_11 = var27_27.getX_square();
                        var9_9 *= var11_11;
                        var8_8 = Math.round(var9_9);
                        var27_27 = this.this$0;
                        var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                        var27_27 = var27_27.getBitmapOriginal();
                        var10_10 = var27_27.getHeight();
                        var11_11 = var10_10;
                        var26_26 = this.this$0;
                        var26_26 = EngineActivity.cfr_renamed_2((EngineActivity)var26_26);
                        var13_13 = var26_26.getY_square();
                        var11_11 *= var13_13;
                        var10_10 = Math.round(var11_11);
                        var14_14 = var3_3 + var8_8;
                        var28_28 = this.this$0;
                        var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                        var28_28 = var28_28.getBitmapOriginal();
                        var18_18 = var28_28.getWidth();
                        if (var14_14 <= var18_18) break block399;
                        var28_28 = this.this$0;
                        var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                        var28_28 = var28_28.getBitmapOriginal();
                        var18_18 = var28_28.getWidth();
                        var8_8 -= (var14_14 -= var18_18);
                        var26_26 = this.this$0;
                        var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                        var26_26 = var26_26.getBitmapOriginal();
                        var14_14 = var26_26.getWidth();
                    }
                    var18_18 = var3_3 + var10_10;
                    var19_19 = this.this$0;
                    var19_19 = EngineActivity.cfr_renamed_64((EngineActivity)var19_19);
                    var19_19 = var19_19.getBitmapOriginal();
                    var16_16 = var19_19.getHeight();
                    if (var18_18 <= var16_16) break block400;
                    var19_19 = this.this$0;
                    var19_19 = EngineActivity.cfr_renamed_64((EngineActivity)var19_19);
                    var19_19 = var19_19.getBitmapOriginal();
                    var16_16 = var19_19.getHeight();
                    var10_10 -= (var18_18 -= var16_16);
                    var28_28 = this.this$0;
                    var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                    var28_28 = var28_28.getBitmapOriginal();
                    var18_18 = var28_28.getHeight();
                }
                if (var8_8 < 0) {
                    var8_8 = 0;
                    var7_7 = null;
                    var9_9 = 0.0f;
                }
                if (var10_10 < 0) {
                    var10_10 = 0;
                    var27_27 = null;
                    var11_11 = 0.0f;
                }
                var19_19 = new Rect(var8_8, var10_10, var14_14, var18_18);
                var7_7 = this.this$0;
                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                var7_7 = var7_7.getBitmapOriginal();
                var8_8 = var7_7.getWidth();
                var9_9 = var8_8;
                var27_27 = this.this$0;
                var27_27 = EngineActivity.cfr_renamed_2((EngineActivity)var27_27);
                var11_11 = var27_27.getWidth_square();
                var8_8 = (int)(var9_9 *= var11_11);
                var27_27 = this.this$0;
                var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                var27_27 = var27_27.getBitmapOriginal();
                var10_10 = var27_27.getHeight();
                var11_11 = var10_10;
                var26_26 = this.this$0;
                var26_26 = EngineActivity.cfr_renamed_2((EngineActivity)var26_26);
                var13_13 = var26_26.getHeight_square();
                var10_10 = (int)(var11_11 *= var13_13);
                var26_26 = this.this$0;
                var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                var26_26 = var26_26.getBitmapOriginal();
                var26_26 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var26_26, (Rect)var19_19, var3_3, var8_8, var10_10);
                var28_28 = this.this$0;
                var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                var28_28.setBitmapSquare((Bitmap)var26_26);
                var26_26 = this.this$0;
                var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                var26_26.setRadius_square(var3_3);
                var3_3 = var19_19.left + var8_8;
                var19_19.right = var3_3;
                var3_3 = var19_19.top + var10_10;
                var19_19.bottom = var3_3;
                var2_2 /* !! */  = this.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                var2_2 /* !! */ .setRectSquare((Rect)var19_19);
lbl648:
                // 2 sources

                var2_2 /* !! */  = IpadType.BOTTOM_RECT;
                var3_3 = var2_2 /* !! */ .ordinal();
                if (var1_1 != var3_3) ** GOTO lbl837
                var2_2 /* !! */  = this.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                var2_2 /* !! */  = var2_2 /* !! */ .getIpad_rect();
                var12_12 = var2_2 /* !! */ .width();
                var8_8 = 1065353216;
                var9_9 = 1.0f;
                var3_3 = (int)(var12_12 *= var9_9);
                var7_7 = this.this$0;
                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                var7_7 = var7_7.getBitmapBlured();
                var9_9 = var7_7.getHeight();
                var10_10 = 1057560199;
                var11_11 = 0.5355f;
                var8_8 = (int)(var9_9 *= var11_11);
                var27_27 = this.this$0;
                var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
                var27_27 = var27_27.getBitmapOriginal();
                var10_10 = var27_27.getWidth();
                var11_11 = var10_10;
                var26_26 = this.this$0;
                var26_26 = EngineActivity.cfr_renamed_2((EngineActivity)var26_26);
                var13_13 = var26_26.getX_square();
                var11_11 *= var13_13;
                var10_10 = Math.round(var11_11);
                var26_26 = this.this$0;
                var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
                var26_26 = var26_26.getBitmapOriginal();
                var14_14 = var26_26.getHeight();
                var13_13 = var14_14;
                var28_28 = this.this$0;
                var28_28 = EngineActivity.cfr_renamed_2((EngineActivity)var28_28);
                var15_15 = var28_28.getY_square();
                var13_13 *= var15_15;
                var14_14 = Math.round(var13_13);
                var3_3 += var10_10;
                var28_28 = this.this$0;
                var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                var28_28 = var28_28.getBitmapOriginal();
                var18_18 = var28_28.getWidth();
                if (var3_3 <= var18_18) break block401;
                var28_28 = this.this$0;
                var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
                var28_28 = var28_28.getBitmapOriginal();
                var18_18 = var28_28.getWidth();
                var10_10 -= (var3_3 -= var18_18);
                var2_2 /* !! */  = this.this$0;
                var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
                var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
                var3_3 = var2_2 /* !! */ .getWidth();
            }
            var8_8 += var14_14;
            var28_28 = this.this$0;
            var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
            var28_28 = var28_28.getBitmapOriginal();
            var18_18 = var28_28.getHeight();
            if (var8_8 <= var18_18) break block402;
            var28_28 = this.this$0;
            var28_28 = EngineActivity.cfr_renamed_64((EngineActivity)var28_28);
            var28_28 = var28_28.getBitmapOriginal();
            var18_18 = var28_28.getHeight();
            var14_14 -= (var8_8 -= var18_18);
            var7_7 = this.this$0;
            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
            var7_7 = var7_7.getBitmapOriginal();
            var8_8 = var7_7.getHeight();
        }
        if (var10_10 < 0) {
            var10_10 = 0;
            var27_27 = null;
            var11_11 = 0.0f;
        }
        if (var14_14 < 0) {
            var14_14 = 0;
            var26_26 = null;
            var13_13 = 0.0f;
        }
        var28_28 = new Rect(var10_10, var14_14, var3_3, var8_8);
        var2_2 /* !! */  = this.this$0;
        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
        var2_2 /* !! */  = var2_2 /* !! */ .getBitmapOriginal();
        var3_3 = var2_2 /* !! */ .getWidth();
        var12_12 = var3_3;
        var7_7 = this.this$0;
        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
        var9_9 = var7_7.getWidth_square();
        var3_3 = (int)(var12_12 *= var9_9);
        var7_7 = this.this$0;
        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
        var7_7 = var7_7.getBitmapOriginal();
        var8_8 = var7_7.getHeight();
        var9_9 = var8_8;
        var27_27 = this.this$0;
        var27_27 = EngineActivity.cfr_renamed_2((EngineActivity)var27_27);
        var11_11 = var27_27.getHeight_square();
        var8_8 = (int)(var9_9 *= var11_11);
        var27_27 = this.this$0;
        var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
        var27_27 = var27_27.getBitmapOriginal();
        var27_27 = UtilsBitmap.cropToSquare((Bitmap)var27_27, (Rect)var28_28, var3_3, var8_8);
        var26_26 = this.this$0;
        var26_26 = EngineActivity.cfr_renamed_64((EngineActivity)var26_26);
        var26_26.setBitmapSquare((Bitmap)var27_27);
        var27_27 = this.this$0;
        var27_27 = EngineActivity.cfr_renamed_64((EngineActivity)var27_27);
        var27_27.setRadius_square(0);
        var4_4 = var28_28.left + var3_3;
        var28_28.right = var4_4;
        var3_3 = var28_28.top + var8_8;
        var28_28.bottom = var3_3;
        var2_2 /* !! */  = this.this$0;
        var2_2 /* !! */  = EngineActivity.cfr_renamed_64((EngineActivity)var2_2 /* !! */ );
        var2_2 /* !! */ .setRectSquare((Rect)var28_28);
lbl837:
        // 2 sources

        var2_2 /* !! */  = IpadType.BORDER;
        var3_3 = var2_2 /* !! */ .ordinal();
        if (var1_1 != var3_3) ** GOTO lbl900
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29 = var29_29.getBitmapOriginal();
        var30_32 = var29_29.getWidth();
        var3_3 = 0x3F000000;
        var12_12 = 0.5f;
        var1_1 = (int)(var30_32 *= var12_12);
        var6_6 = this.this$0;
        var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
        var6_6 = var6_6.getBitmapOriginal();
        var4_4 = var6_6.getHeight();
        var5_5 = (float)var4_4 * var12_12;
        var3_3 = (int)var5_5;
        var6_6 = this.this$0;
        var6_6 = EngineActivity.cfr_renamed_64((EngineActivity)var6_6);
        var6_6 = var6_6.getBitmapOriginal();
        var1_1 = var6_6.getPixel(var1_1, var3_3);
        var1_1 = (int)ColorUtils.isColorDark(var1_1);
        if (var1_1 == 0) ** GOTO lbl882
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_2((EngineActivity)var29_29);
        var3_3 = -1;
        var12_12 = 0.0f / 0.0f;
        var29_29.setColor_ipad(var3_3);
        ** GOTO lbl889
lbl882:
        // 1 sources

        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_2((EngineActivity)var29_29);
        var3_3 = -16777216;
        var12_12 = -1.7014118E38f;
        var29_29.setColor_ipad(var3_3);
lbl889:
        // 2 sources

        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var2_2 /* !! */  = this.this$0;
        var2_2 /* !! */  = EngineActivity.cfr_renamed_2((EngineActivity)var2_2 /* !! */ );
        var3_3 = var2_2 /* !! */ .getColor_ipad();
        var29_29.setColorIpad(var3_3);
lbl900:
        // 2 sources

        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29.createRectWithoutSurahName();
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29.resizeEntity();
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29 = var29_29.getSurahNameEntity();
        if (var29_29 == null) ** GOTO lbl944
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29 = var29_29.getSurahNameEntity();
        var1_1 = var29_29.getStyle();
        var2_2 /* !! */  = SurahNameStyle.ZAGHRAFAT;
        var3_3 = var2_2 /* !! */ .ordinal();
        if (var1_1 == var3_3) ** GOTO lbl944
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29 = var29_29.getSurahNameEntity();
        var1_1 = (int)var29_29.isHaveBg();
        if (var1_1 != 0) ** GOTO lbl944
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29.updatePosSurahName();
lbl944:
        // 4 sources

        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        var29_29.changeColorIpad();
        var29_29 = this.this$0;
        var29_29 = EngineActivity.cfr_renamed_64((EngineActivity)var29_29);
        try {
            var29_29.invalidate();
        }
        catch (Exception var29_30) {
            var6_6 = "onChangeType";
            var2_2 /* !! */  = new StringBuilder((String)var6_6);
            var29_31 = var29_30.getMessage();
            var29_31 = var2_2 /* !! */ .append(var29_31).toString();
            var2_2 /* !! */  = "execption";
            Log.e((String)var2_2 /* !! */ , (String)var29_31);
        }
    }

    public void onClick(int n, int n2) {
        EngineActivity.cfr_renamed_2(this.this$0).setColor_ipad(n);
        EngineActivity.cfr_renamed_2(this.this$0).setIndex_color(n2);
        EngineActivity.cfr_renamed_2(this.this$0).setGradient(null);
        EngineActivity.cfr_renamed_64(this.this$0).setColorIpad(n);
        EngineActivity.cfr_renamed_64(this.this$0).invalidate();
    }

    public void onClick(Gradient gradient, int n) {
        EngineActivity.cfr_renamed_2(this.this$0).setGradient(gradient);
        EngineActivity.cfr_renamed_2(this.this$0).setIndex_color(n);
        EngineActivity.cfr_renamed_64(this.this$0).setColorIpad(gradient);
        EngineActivity.cfr_renamed_64(this.this$0).invalidate();
    }

    public void onDialogPremium() {
        this.this$0.dialogPremium(0);
    }

    public void onDone() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void onGlassType(boolean bl) {
        EngineActivity.cfr_renamed_2(this.this$0).setGlass(bl);
        EngineActivity.cfr_renamed_64(this.this$0).setGlass(bl);
        EngineActivity.cfr_renamed_64(this.this$0).invalidate();
    }
}

