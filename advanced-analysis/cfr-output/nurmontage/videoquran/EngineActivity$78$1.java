/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Rect
 *  android.util.Log
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$78;
import hazem.nurmontage.videoquran.EngineActivity$78$1$1;
import hazem.nurmontage.videoquran.EngineActivity$78$1$2;
import hazem.nurmontage.videoquran.Utils.AspectRatioCalculator;
import hazem.nurmontage.videoquran.Utils.BitmapCropper;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;

class EngineActivity$78$1
implements Runnable {
    final /* synthetic */ EngineActivity$78 this$1;
    final /* synthetic */ int val$resize;
    final /* synthetic */ String val$str;

    EngineActivity$78$1(EngineActivity$78 engineActivity$78, int n, String string2) {
        this.this$1 = engineActivity$78;
        this.val$resize = n;
        this.val$str = string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void run() {
        block612: {
            block618: {
                block617: {
                    block616: {
                        block615: {
                            block614: {
                                block613: {
                                    var1_1 = this;
                                    var2_2 /* !! */  = "init ";
                                    var3_3 = this.this$1;
                                    {
                                        catch (Throwable var38_76) {
                                            var2_2 /* !! */  = var38_76;
                                            break block612;
                                        }
                                        catch (Exception var38_77) {}
                                        var3_3 = var38_77;
                                        var5_5 = "Tag resize : ";
                                        {
                                            var7_7 = new StringBuilder((String)var2_2 /* !! */ );
                                            var2_2 /* !! */  = var38_77.getMessage();
                                        }
                                        {
                                            var2_2 /* !! */  = var7_7.append((String)var2_2 /* !! */ );
                                        }
                                        {
                                            var2_2 /* !! */  = var2_2 /* !! */ .toString();
                                        }
                                        {
                                            Log.e((String)var5_5, (String)var2_2 /* !! */ );
                                        }
                                        try {
                                            var2_2 /* !! */  = var1_1.this$1;
                                        }
                                        catch (Exception v0) {}
                                        var2_2 /* !! */  = var2_2 /* !! */ .this$0;
                                        var3_3 = new EngineActivity$78$1$2(var1_1);
                                        ** GOTO lbl-1000
                                        return;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
                                    }
                                    {
                                        var3_3.reset();
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
                                    }
                                    {
                                        var4_4 = this.val$resize;
                                    }
                                    {
                                        var3_3.setResizeType(var4_4);
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
                                    }
                                    {
                                        var5_5 = this.val$str;
                                    }
                                    {
                                        var3_3.setImgResize((String)var5_5);
                                        var6_6 = this.val$resize;
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5);
                                    }
                                    {
                                        var5_5 = var5_5.getResolution();
                                    }
                                    {
                                        var3_3 = AspectRatioCalculator.getSize(var6_6, (String)var5_5);
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5);
                                    }
                                    {
                                        var7_7 = var3_3.getFirst();
                                    }
                                    {
                                        var7_7 = (Integer)var7_7;
                                    }
                                    {
                                        var8_8 = var7_7.intValue();
                                    }
                                    {
                                        var3_3 = var3_3.getSecond();
                                    }
                                    {
                                        var3_3 = (Integer)var3_3;
                                    }
                                    {
                                        var6_6 = var3_3.intValue();
                                    }
                                    {
                                        var5_5.setWidthAndHeight(var8_8, var6_6);
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var4_4 = var5_5.getWidth();
                                    }
                                    {
                                        var7_7 = this.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    }
                                    {
                                        var8_8 = var7_7.getHeight();
                                    }
                                    {
                                        var9_9 = this.val$resize;
                                    }
                                    {
                                        var3_3.initCanvasDimension(var4_4, var8_8, var9_9);
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
                                    }
                                    {
                                        var6_6 = var3_3.geTypeResize();
                                    }
                                    {
                                        var5_5 = ResizeType.SOCIAL_STORY;
                                    }
                                    {
                                        var4_4 = var5_5.ordinal();
                                        if (var6_6 != var4_4) ** GOTO lbl-1000
                                    }
                                    {
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
                                    }
                                    {
                                        var3_3 = var3_3.getBitmapOriginal();
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var4_4 = var5_5.getW();
                                    }
                                    {
                                        var7_7 = this.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    }
                                    {
                                        var8_8 = var7_7.getH();
                                    }
                                    {
                                        var3_3 = BitmapCropper.cropTo9x16((Bitmap)var3_3, var4_4, var8_8);
                                        ** GOTO lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var6_6 = (var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3)).geTypeResize();
                                        if (var6_6 != (var4_4 = (var5_5 = ResizeType.SQUARE).ordinal())) ** GOTO lbl-1000
                                    }
                                    {
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
                                    }
                                    {
                                        var3_3 = var3_3.getBitmapOriginal();
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var4_4 = var5_5.getW();
                                    }
                                    {
                                        var7_7 = this.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    }
                                    {
                                        var8_8 = var7_7.getH();
                                    }
                                    {
                                        var3_3 = BitmapCropper.cropTo1x1((Bitmap)var3_3, var4_4, var8_8);
                                        ** GOTO lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var3_3 = this.this$1;
                                    }
                                    {
                                        var3_3 = var3_3.this$0;
                                    }
                                    {
                                        var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
                                    }
                                    {
                                        var3_3 = var3_3.getBitmapOriginal();
                                    }
                                    {
                                        var5_5 = this.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var4_4 = var5_5.getW();
                                    }
                                    {
                                        var7_7 = this.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    }
                                    {
                                        var8_8 = var7_7.getH();
                                    }
                                    {
                                        var3_3 = BitmapCropper.cropTo16x9((Bitmap)var3_3, var4_4, var8_8);
                                    }
lbl-1000:
                                    // 3 sources

                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var5_5.updatePosCanvas((Bitmap)var3_3);
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var5_5.setBitmapBlured((Bitmap)var3_3);
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var7_7 = var1_1.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                                    }
                                    {
                                        var8_8 = var7_7.getIpad_type();
                                    }
                                    {
                                        var10_10 = var1_1.this$1;
                                    }
                                    {
                                        var10_10 = var10_10.this$0;
                                    }
                                    {
                                        var10_10 = EngineActivity.cfr_renamed_2((EngineActivity)var10_10);
                                    }
                                    {
                                        var9_9 = var10_10.geTypeResize();
                                    }
                                    {
                                        var5_5.updateIpad((Bitmap)var3_3, var8_8, var9_9);
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5);
                                    }
                                    {
                                        var4_4 = var5_5.getIpad_type();
                                    }
                                    {
                                        var7_7 = IpadType.GRADIENT;
                                    }
                                    {
                                        var8_8 = var7_7.ordinal();
                                        var9_9 = 20;
                                        var11_11 = 1;
                                        var12_12 = 0;
                                        var13_13 = 0.0f;
                                        var14_14 = null;
                                        if (var4_4 == var8_8) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 == (var8_8 = (var7_7 = IpadType.BLACK_LAYER).ordinal())) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 == (var8_8 = (var7_7 = IpadType.MASK_BRUSH).ordinal())) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 == (var8_8 = (var7_7 = IpadType.BLUE_TYPE).ordinal())) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 == (var8_8 = (var7_7 = IpadType.CASSET_IMG).ordinal())) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 == (var8_8 = (var7_7 = IpadType.CASSET_IMG_BLUR).ordinal())) ** GOTO lbl636
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                        if (var4_4 != (var8_8 = (var7_7 = IpadType.IPAD_NEOMORPHIC).ordinal())) ** GOTO lbl-1000
                                    }
                                    {
                                        var5_5 = var1_1.this$1;
                                    }
                                    {
                                        var5_5 = var5_5.this$0;
                                    }
                                    {
                                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                                    }
                                    {
                                        var5_5 = var5_5.getIpad_rect();
                                    }
                                    {
                                        var15_15 = var5_5.width();
                                        var8_8 = 1058642330;
                                        var16_18 = 0.6f;
                                    }
                                    var4_4 = (int)(var15_15 *= var16_18);
                                    {
                                        var7_7 = var1_1.this$1;
                                    }
                                    {
                                        var7_7 = var7_7.this$0;
                                    }
                                    {
                                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                                    }
                                    {
                                        var7_7 = var7_7.getBitmapOriginal();
                                    }
                                    {
                                        var8_8 = var7_7.getWidth();
                                    }
                                    var16_18 = var8_8;
                                    {
                                        var17_21 = var1_1.this$1;
                                    }
                                    {
                                        var17_21 = var17_21.this$0;
                                    }
                                    {
                                        var17_21 = EngineActivity.cfr_renamed_2((EngineActivity)var17_21);
                                    }
                                    {
                                        var18_27 = var17_21.getX_square();
                                    }
                                    {
                                        var8_8 = Math.round(var16_18 *= var18_27);
                                    }
                                    {
                                        var17_21 = var1_1.this$1;
                                    }
                                    {
                                        var17_21 = var17_21.this$0;
                                    }
                                    {
                                        var17_21 = EngineActivity.cfr_renamed_64((EngineActivity)var17_21);
                                    }
                                    {
                                        var17_21 = var17_21.getBitmapOriginal();
                                    }
                                    {
                                        var19_30 = var17_21.getHeight();
                                    }
                                    var18_27 = var19_30;
                                    {
                                        var20_33 = var1_1.this$1;
                                    }
                                    {
                                        var20_33 = var20_33.this$0;
                                    }
                                    {
                                        var20_33 = EngineActivity.cfr_renamed_2((EngineActivity)var20_33);
                                    }
                                    {
                                        var21_38 = var20_33.getY_square();
                                    }
                                    {
                                        var19_30 = Math.round(var18_27 *= var21_38);
                                        var22_41 = var4_4 + var8_8;
                                    }
                                    {
                                        var23_44 = var1_1.this$1;
                                    }
                                    {
                                        var23_44 = var23_44.this$0;
                                    }
                                    {
                                        var23_44 = EngineActivity.cfr_renamed_64((EngineActivity)var23_44);
                                    }
                                    {
                                        var24_48 = (var23_44 = var23_44.getBitmapOriginal()).getWidth();
                                        if (var22_41 <= var24_48) break block613;
                                    }
                                    {
                                        var23_44 = var1_1.this$1;
                                    }
                                    {
                                        var23_44 = var23_44.this$0;
                                    }
                                    {
                                        var23_44 = EngineActivity.cfr_renamed_64((EngineActivity)var23_44);
                                    }
                                    {
                                        var23_44 = var23_44.getBitmapOriginal();
                                    }
                                    {
                                        var24_48 = var23_44.getWidth();
                                        var8_8 -= (var22_41 -= var24_48);
                                    }
                                    {
                                        var20_33 = var1_1.this$1;
                                    }
                                    {
                                        var20_33 = var20_33.this$0;
                                    }
                                    {
                                        var20_33 = EngineActivity.cfr_renamed_64((EngineActivity)var20_33);
                                    }
                                    {
                                        var20_33 = var20_33.getBitmapOriginal();
                                    }
                                    {
                                        var22_41 = var20_33.getWidth();
                                    }
                                }
                                var24_48 = var4_4 + var19_30;
                                {
                                    var25_51 = var1_1.this$1;
                                }
                                {
                                    var25_51 = var25_51.this$0;
                                }
                                {
                                    var25_51 = EngineActivity.cfr_renamed_64((EngineActivity)var25_51);
                                }
                                {
                                    var26_54 = (var25_51 = var25_51.getBitmapOriginal()).getHeight();
                                    if (var24_48 <= var26_54) break block614;
                                }
                                {
                                    var25_51 = var1_1.this$1;
                                }
                                {
                                    var25_51 = var25_51.this$0;
                                }
                                {
                                    var25_51 = EngineActivity.cfr_renamed_64((EngineActivity)var25_51);
                                }
                                {
                                    var25_51 = var25_51.getBitmapOriginal();
                                }
                                {
                                    var26_54 = var25_51.getHeight();
                                    var19_30 -= (var24_48 -= var26_54);
                                }
                                {
                                    var23_44 = var1_1.this$1;
                                }
                                {
                                    var23_44 = var23_44.this$0;
                                }
                                {
                                    var23_44 = EngineActivity.cfr_renamed_64((EngineActivity)var23_44);
                                }
                                {
                                    var23_44 = var23_44.getBitmapOriginal();
                                }
                                {
                                    var24_48 = var23_44.getHeight();
                                }
                            }
                            if (var8_8 < 0) {
                                var8_8 = 0;
                                var7_7 = null;
                                var16_18 = 0.0f;
                            }
                            if (var19_30 < 0) ** GOTO lbl-1000
                            var12_12 = var19_30;
lbl-1000:
                            // 2 sources

                            {
                                var17_21 = new Rect(var8_8, var12_12, var22_41, var24_48);
                                var7_7 = var1_1.this$1;
                            }
                            {
                                var7_7 = var7_7.this$0;
                            }
                            {
                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            }
                            {
                                var7_7.setRadius_square(var4_4);
                                var7_7 = var1_1.this$1;
                            }
                            {
                                var7_7 = var7_7.this$0;
                            }
                            {
                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            }
                            {
                                var7_7 = var7_7.getBitmapOriginal();
                            }
                            {
                                var8_8 = var7_7.getWidth();
                            }
                            var16_18 = var8_8;
                            {
                                var14_14 = var1_1.this$1;
                            }
                            {
                                var14_14 = var14_14.this$0;
                            }
                            {
                                var14_14 = EngineActivity.cfr_renamed_2((EngineActivity)var14_14);
                            }
                            {
                                var13_13 = var14_14.getWidth_square();
                            }
                            var8_8 = (int)(var16_18 *= var13_13);
                            {
                                var14_14 = var1_1.this$1;
                            }
                            {
                                var14_14 = var14_14.this$0;
                            }
                            {
                                var14_14 = EngineActivity.cfr_renamed_64((EngineActivity)var14_14);
                            }
                            {
                                var14_14 = var14_14.getBitmapOriginal();
                            }
                            {
                                var12_12 = var14_14.getHeight();
                            }
                            var13_13 = var12_12;
                            {
                                var20_33 = var1_1.this$1;
                            }
                            {
                                var20_33 = var20_33.this$0;
                            }
                            {
                                var20_33 = EngineActivity.cfr_renamed_2((EngineActivity)var20_33);
                            }
                            {
                                var21_38 = var20_33.getHeight_square();
                            }
                            var12_12 = (int)(var13_13 *= var21_38);
                            {
                                var20_33 = var1_1.this$1;
                            }
                            {
                                var20_33 = var20_33.this$0;
                            }
                            {
                                var20_33 = EngineActivity.cfr_renamed_64((EngineActivity)var20_33);
                            }
                            {
                                var20_33 = var20_33.getBitmapOriginal();
                            }
                            {
                                var5_5 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var20_33, (Rect)var17_21, var4_4, var8_8, var12_12);
                            }
                            {
                                var22_41 = var17_21.left + var8_8;
                            }
                            {
                                var17_21.right = var22_41;
                                var8_8 = var17_21.top + var12_12;
                            }
                            {
                                var17_21.bottom = var8_8;
                                var7_7 = var1_1.this$1;
                            }
                            {
                                var7_7 = var7_7.this$0;
                            }
                            {
                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            }
                            {
                                var7_7.setRectSquare((Rect)var17_21);
                                var27_57 = var5_5;
                                var28_60 = var17_21;
                                ** GOTO lbl-1000
                            }
lbl-1000:
                            // 1 sources

                            {
                                var5_5 = var1_1.this$1;
                            }
                            {
                                var5_5 = var5_5.this$0;
                            }
                            {
                                var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                if (var4_4 == (var8_8 = (var7_7 = IpadType.IPAD).ordinal())) ** GOTO lbl-1000
                            }
                            {
                                var5_5 = var1_1.this$1;
                            }
                            {
                                var5_5 = var5_5.this$0;
                            }
                            {
                                var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                if (var4_4 == (var8_8 = (var7_7 = IpadType.IPAD_UNBLUR).ordinal())) ** GOTO lbl-1000
                            }
                            {
                                var5_5 = var1_1.this$1;
                            }
                            {
                                var5_5 = var5_5.this$0;
                            }
                            {
                                var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                                if (var4_4 == (var8_8 = (var7_7 = IpadType.IPAD_CLASSIC).ordinal())) ** GOTO lbl-1000
                            }
                            {
                                var5_5 = var1_1.this$1;
                            }
                            {
                                var5_5 = var5_5.this$0;
                            }
                            {
                                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                            }
                            {
                                var5_5 = var5_5.getIpad_rect();
                            }
                            {
                                var15_16 = var5_5.width();
                                var8_8 = 1065353216;
                                var16_19 = 1.0f;
                            }
                            var4_4 = (int)(var15_16 *= var16_19);
                            {
                                var16_19 = var3_3.getHeight();
                                var19_31 = 1057560199;
                                var18_28 = 0.5355f;
                            }
                            var8_8 = (int)(var16_19 *= var18_28);
                            {
                                var17_22 = var1_1.this$1;
                            }
                            {
                                var17_22 = var17_22.this$0;
                            }
                            {
                                var17_22 = EngineActivity.cfr_renamed_64((EngineActivity)var17_22);
                            }
                            {
                                var17_22 = var17_22.getBitmapOriginal();
                            }
                            {
                                var19_31 = var17_22.getWidth();
                            }
                            var18_28 = var19_31;
                            {
                                var20_34 = var1_1.this$1;
                            }
                            {
                                var20_34 = var20_34.this$0;
                            }
                            {
                                var20_34 = EngineActivity.cfr_renamed_2((EngineActivity)var20_34);
                            }
                            {
                                var21_39 = var20_34.getX_square();
                            }
                            {
                                var19_31 = Math.round(var18_28 *= var21_39);
                            }
                            {
                                var20_34 = var1_1.this$1;
                            }
                            {
                                var20_34 = var20_34.this$0;
                            }
                            {
                                var20_34 = EngineActivity.cfr_renamed_64((EngineActivity)var20_34);
                            }
                            {
                                var20_34 = var20_34.getBitmapOriginal();
                            }
                            {
                                var22_42 = var20_34.getHeight();
                            }
                            var21_39 = var22_42;
                            {
                                var23_45 = var1_1.this$1;
                            }
                            {
                                var23_45 = var23_45.this$0;
                            }
                            {
                                var23_45 = EngineActivity.cfr_renamed_2((EngineActivity)var23_45);
                            }
                            {
                                var29_61 = var23_45.getY_square();
                            }
                            {
                                var22_42 = Math.round(var21_39 *= var29_61);
                            }
                            {
                                var23_45 = var1_1.this$1;
                            }
                            {
                                var23_45 = var23_45.this$0;
                            }
                            {
                                var23_45 = EngineActivity.cfr_renamed_64((EngineActivity)var23_45);
                            }
                            {
                                var24_49 = (var23_45 = var23_45.getBitmapOriginal()).getWidth();
                                if ((var4_4 += var19_31) <= var24_49) ** GOTO lbl-1000
                            }
                            {
                                var23_45 = var1_1.this$1;
                            }
                            {
                                var23_45 = var23_45.this$0;
                            }
                            {
                                var23_45 = EngineActivity.cfr_renamed_64((EngineActivity)var23_45);
                            }
                            {
                                var23_45 = var23_45.getBitmapOriginal();
                            }
                            {
                                var24_49 = var23_45.getWidth();
                                var19_31 -= (var4_4 -= var24_49);
                            }
                            {
                                var5_5 = var1_1.this$1;
                            }
                            {
                                var5_5 = var5_5.this$0;
                            }
                            {
                                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                            }
                            {
                                var5_5 = var5_5.getBitmapOriginal();
                            }
                            {
                                var4_4 = var5_5.getWidth();
                            }
lbl-1000:
                            // 2 sources

                            {
                                var23_45 = var1_1.this$1;
                            }
                            {
                                var23_45 = var23_45.this$0;
                            }
                            {
                                var23_45 = EngineActivity.cfr_renamed_64((EngineActivity)var23_45);
                            }
                            {
                                var24_49 = (var23_45 = var23_45.getBitmapOriginal()).getHeight();
                                if ((var8_8 += var22_42) <= var24_49) break block615;
                            }
                            {
                                var23_45 = var1_1.this$1;
                            }
                            {
                                var23_45 = var23_45.this$0;
                            }
                            {
                                var23_45 = EngineActivity.cfr_renamed_64((EngineActivity)var23_45);
                            }
                            {
                                var23_45 = var23_45.getBitmapOriginal();
                            }
                            {
                                var24_49 = var23_45.getHeight();
                                var22_42 -= (var8_8 -= var24_49);
                            }
                            {
                                var7_7 = var1_1.this$1;
                            }
                            {
                                var7_7 = var7_7.this$0;
                            }
                            {
                                var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                            }
                            {
                                var7_7 = var7_7.getBitmapOriginal();
                            }
                            {
                                var8_8 = var7_7.getHeight();
                            }
                        }
                        if (var19_31 < 0) {
                            var19_31 = 0;
                            var17_22 = null;
                            var18_28 = 0.0f;
                        }
                        if (var22_42 >= 0) ** GOTO lbl-1000
                        var22_42 = 0;
                        var20_34 = null;
                        var21_39 = 0.0f;
lbl-1000:
                        // 2 sources

                        {
                            var23_45 = new Rect(var19_31, var22_42, var4_4, var8_8);
                            var5_5 = var1_1.this$1;
                        }
                        {
                            var5_5 = var5_5.this$0;
                        }
                        {
                            var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                        }
                        {
                            var5_5 = var5_5.getBitmapOriginal();
                        }
                        {
                            var4_4 = var5_5.getWidth();
                        }
                        var15_16 = var4_4;
                        {
                            var7_7 = var1_1.this$1;
                        }
                        {
                            var7_7 = var7_7.this$0;
                        }
                        {
                            var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                        }
                        {
                            var16_19 = var7_7.getWidth_square();
                        }
                        var4_4 = (int)(var15_16 *= var16_19);
                        {
                            var7_7 = var1_1.this$1;
                        }
                        {
                            var7_7 = var7_7.this$0;
                        }
                        {
                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        }
                        {
                            var7_7 = var7_7.getBitmapOriginal();
                        }
                        {
                            var8_8 = var7_7.getHeight();
                        }
                        var16_19 = var8_8;
                        {
                            var17_22 = var1_1.this$1;
                        }
                        {
                            var17_22 = var17_22.this$0;
                        }
                        {
                            var17_22 = EngineActivity.cfr_renamed_2((EngineActivity)var17_22);
                        }
                        {
                            var18_28 = var17_22.getHeight_square();
                        }
                        var8_8 = (int)(var16_19 *= var18_28);
                        {
                            var17_22 = var1_1.this$1;
                        }
                        {
                            var17_22 = var17_22.this$0;
                        }
                        {
                            var17_22 = EngineActivity.cfr_renamed_64((EngineActivity)var17_22);
                        }
                        {
                            var17_22 = var17_22.getBitmapOriginal();
                        }
                        {
                            var17_22 = UtilsBitmap.cropToSquare((Bitmap)var17_22, (Rect)var23_45, var4_4, var8_8);
                        }
                        {
                            var20_34 = var1_1.this$1;
                        }
                        {
                            var20_34 = var20_34.this$0;
                        }
                        {
                            var20_34 = EngineActivity.cfr_renamed_64((EngineActivity)var20_34);
                        }
                        {
                            var20_34.setBitmapSquare((Bitmap)var17_22);
                            var20_34 = var1_1.this$1;
                        }
                        {
                            var20_34 = var20_34.this$0;
                        }
                        {
                            var20_34 = EngineActivity.cfr_renamed_64((EngineActivity)var20_34);
                        }
                        {
                            var20_34.setRadius_square(0);
                            var12_12 = var23_45.left + var4_4;
                        }
                        {
                            var23_45.right = var12_12;
                            var4_4 = var23_45.top + var8_8;
                        }
                        {
                            var23_45.bottom = var4_4;
                            var5_5 = var1_1.this$1;
                        }
                        {
                            var5_5 = var5_5.this$0;
                        }
                        {
                            var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                        }
                        {
                            var5_5.setRectSquare((Rect)var23_45);
                            var27_57 = var17_22;
                            var28_60 = var23_45;
                            ** GOTO lbl-1000
                        }
lbl-1000:
                        // 3 sources

                        {
                            var5_5 = var1_1.this$1;
                        }
                        {
                            var5_5 = var5_5.this$0;
                        }
                        {
                            var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                        }
                        {
                            var5_5 = var5_5.getIpad_rect();
                        }
                        {
                            var15_17 = var5_5.width() * 0.87530595f;
                        }
                        var4_4 = (int)var15_17;
                        var16_20 = var4_4;
                        var19_32 = 1066443735;
                        var18_29 = 1.13f;
                        var8_8 = (int)(var16_20 *= var18_29);
                        {
                            var19_32 = Math.min(var4_4, var8_8);
                        }
                        {
                            var20_35 = var1_1.this$1;
                        }
                        {
                            var20_35 = var20_35.this$0;
                        }
                        {
                            var20_35 = EngineActivity.cfr_renamed_64((EngineActivity)var20_35);
                        }
                        {
                            var20_35 = var20_35.getBitmapOriginal();
                        }
                        {
                            var22_43 = var20_35.getWidth();
                        }
                        var21_40 = var22_43;
                        {
                            var23_46 = var1_1.this$1;
                        }
                        {
                            var23_46 = var23_46.this$0;
                        }
                        {
                            var23_46 = EngineActivity.cfr_renamed_2((EngineActivity)var23_46);
                        }
                        {
                            var29_62 = var23_46.getX_square();
                        }
                        {
                            var22_43 = Math.round(var21_40 *= var29_62);
                        }
                        {
                            var23_46 = var1_1.this$1;
                        }
                        {
                            var23_46 = var23_46.this$0;
                        }
                        {
                            var23_46 = EngineActivity.cfr_renamed_64((EngineActivity)var23_46);
                        }
                        {
                            var23_46 = var23_46.getBitmapOriginal();
                        }
                        {
                            var24_50 = var23_46.getHeight();
                        }
                        var29_62 = var24_50;
                        {
                            var25_52 = var1_1.this$1;
                        }
                        {
                            var25_52 = var25_52.this$0;
                        }
                        {
                            var25_52 = EngineActivity.cfr_renamed_2((EngineActivity)var25_52);
                        }
                        {
                            var30_63 = var25_52.getY_square();
                        }
                        {
                            var24_50 = Math.round(var29_62 *= var30_63);
                        }
                        {
                            var25_52 = var1_1.this$1;
                        }
                        {
                            var25_52 = var25_52.this$0;
                        }
                        {
                            var25_52 = EngineActivity.cfr_renamed_64((EngineActivity)var25_52);
                        }
                        {
                            var26_55 = (var25_52 = var25_52.getBitmapOriginal()).getWidth();
                            if ((var4_4 += var22_43) <= var26_55) ** GOTO lbl-1000
                        }
                        {
                            var25_52 = var1_1.this$1;
                        }
                        {
                            var25_52 = var25_52.this$0;
                        }
                        {
                            var25_52 = EngineActivity.cfr_renamed_64((EngineActivity)var25_52);
                        }
                        {
                            var25_52 = var25_52.getBitmapOriginal();
                        }
                        {
                            var26_55 = var25_52.getWidth();
                            var22_43 -= (var4_4 -= var26_55);
                        }
                        {
                            var5_5 = var1_1.this$1;
                        }
                        {
                            var5_5 = var5_5.this$0;
                        }
                        {
                            var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                        }
                        {
                            var5_5 = var5_5.getBitmapOriginal();
                        }
                        {
                            var4_4 = var5_5.getWidth();
                        }
lbl-1000:
                        // 2 sources

                        {
                            var25_52 = var1_1.this$1;
                        }
                        {
                            var25_52 = var25_52.this$0;
                        }
                        {
                            var25_52 = EngineActivity.cfr_renamed_64((EngineActivity)var25_52);
                        }
                        {
                            var26_55 = (var25_52 = var25_52.getBitmapOriginal()).getHeight();
                            if ((var8_8 += var24_50) <= var26_55) break block616;
                        }
                        {
                            var25_52 = var1_1.this$1;
                        }
                        {
                            var25_52 = var25_52.this$0;
                        }
                        {
                            var25_52 = EngineActivity.cfr_renamed_64((EngineActivity)var25_52);
                        }
                        {
                            var25_52 = var25_52.getBitmapOriginal();
                        }
                        {
                            var26_55 = var25_52.getHeight();
                            var24_50 -= (var8_8 -= var26_55);
                        }
                        {
                            var7_7 = var1_1.this$1;
                        }
                        {
                            var7_7 = var7_7.this$0;
                        }
                        {
                            var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                        }
                        {
                            var7_7 = var7_7.getBitmapOriginal();
                        }
                        {
                            var8_8 = var7_7.getHeight();
                        }
                    }
                    if (var22_43 < 0) {
                        var22_43 = 0;
                        var20_35 = null;
                        var21_40 = 0.0f;
                    }
                    if (var24_50 >= 0) ** GOTO lbl-1000
                    var24_50 = 0;
                    var23_46 = null;
                    var29_62 = 0.0f;
lbl-1000:
                    // 2 sources

                    {
                        var25_52 = new Rect(var22_43, var24_50, var4_4, var8_8);
                        var5_5 = var1_1.this$1;
                    }
                    {
                        var5_5 = var5_5.this$0;
                    }
                    {
                        var4_4 = (var5_5 = EngineActivity.cfr_renamed_2((EngineActivity)var5_5)).getIpad_type();
                        if (var4_4 != (var8_8 = (var7_7 = IpadType.IPAD_CLASSIC).ordinal())) break block617;
                    }
                    {
                        var5_5 = var1_1.this$1;
                    }
                    {
                        var5_5 = var5_5.this$0;
                    }
                    {
                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                    }
                    {
                        var5_5 = var5_5.getBitmapOriginal();
                    }
                    {
                        var4_4 = var5_5.getWidth();
                    }
                    var15_17 = var4_4;
                    {
                        var7_7 = var1_1.this$1;
                    }
                    {
                        var7_7 = var7_7.this$0;
                    }
                    {
                        var7_7 = EngineActivity.cfr_renamed_2((EngineActivity)var7_7);
                    }
                    {
                        var16_20 = var7_7.getWidth_square();
                    }
                    var4_4 = (int)(var15_17 *= var16_20);
                    {
                        var7_7 = var1_1.this$1;
                    }
                    {
                        var7_7 = var7_7.this$0;
                    }
                    {
                        var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                    }
                    {
                        var7_7 = var7_7.getBitmapOriginal();
                    }
                    {
                        var8_8 = var7_7.getHeight();
                    }
                    var16_20 = var8_8;
                    {
                        var17_23 = var1_1.this$1;
                    }
                    {
                        var17_23 = var17_23.this$0;
                    }
                    {
                        var17_23 = EngineActivity.cfr_renamed_2((EngineActivity)var17_23);
                    }
                    {
                        var18_29 = var17_23.getHeight_square();
                    }
                    var8_8 = (int)(var16_20 *= var18_29);
                    {
                        var17_23 = var1_1.this$1;
                    }
                    {
                        var17_23 = var17_23.this$0;
                    }
                    {
                        var17_23 = EngineActivity.cfr_renamed_64((EngineActivity)var17_23);
                    }
                    {
                        var17_23 = var17_23.getBitmapOriginal();
                    }
                    {
                        var17_23 = UtilsBitmap.cropToSquare((Bitmap)var17_23, (Rect)var25_52, var4_4, var8_8);
                    }
                    {
                        var20_35 = var1_1.this$1;
                    }
                    {
                        var20_35 = var20_35.this$0;
                    }
                    {
                        var20_35 = EngineActivity.cfr_renamed_64((EngineActivity)var20_35);
                    }
                    {
                        var20_35.setBitmapSquare((Bitmap)var17_23);
                        var20_35 = var1_1.this$1;
                    }
                    {
                        var20_35 = var20_35.this$0;
                    }
                    {
                        var20_35 = EngineActivity.cfr_renamed_64((EngineActivity)var20_35);
                    }
                    {
                        var20_35.setRadius_square(0);
                        var12_12 = var25_52.left + var4_4;
                    }
                    {
                        var25_52.right = var12_12;
                        var4_4 = var25_52.top + var8_8;
                    }
                    {
                        var25_52.bottom = var4_4;
                        var5_5 = var1_1.this$1;
                    }
                    {
                        var5_5 = var5_5.this$0;
                    }
                    {
                        var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
                    }
                    {
                        var5_5.setRectSquare((Rect)var25_52);
                        var5_5 = var17_23;
                        break block618;
                    }
                }
                var15_17 = var19_32;
                var8_8 = 1037905692;
                var16_20 = 0.10800001f;
                var4_4 = (int)(var15_17 *= var16_20);
                {
                    var7_7 = var1_1.this$1;
                }
                {
                    var7_7 = var7_7.this$0;
                }
                {
                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                }
                {
                    var7_7.setRadius_square(var4_4);
                    var7_7 = var1_1.this$1;
                }
                {
                    var7_7 = var7_7.this$0;
                }
                {
                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                }
                {
                    var7_7 = var7_7.getBitmapOriginal();
                }
                {
                    var8_8 = var7_7.getWidth();
                }
                var16_20 = var8_8;
                {
                    var14_14 = var1_1.this$1;
                }
                {
                    var14_14 = var14_14.this$0;
                }
                {
                    var14_14 = EngineActivity.cfr_renamed_2((EngineActivity)var14_14);
                }
                {
                    var13_13 = var14_14.getWidth_square();
                }
                var8_8 = (int)(var16_20 *= var13_13);
                {
                    var14_14 = var1_1.this$1;
                }
                {
                    var14_14 = var14_14.this$0;
                }
                {
                    var14_14 = EngineActivity.cfr_renamed_64((EngineActivity)var14_14);
                }
                {
                    var14_14 = var14_14.getBitmapOriginal();
                }
                {
                    var12_12 = var14_14.getHeight();
                }
                var13_13 = var12_12;
                {
                    var17_24 = var1_1.this$1;
                }
                {
                    var17_24 = var17_24.this$0;
                }
                {
                    var17_24 = EngineActivity.cfr_renamed_2((EngineActivity)var17_24);
                }
                {
                    var18_29 = var17_24.getHeight_square();
                }
                var12_12 = (int)(var13_13 *= var18_29);
                {
                    var17_24 = var1_1.this$1;
                }
                {
                    var17_24 = var17_24.this$0;
                }
                {
                    var17_24 = EngineActivity.cfr_renamed_64((EngineActivity)var17_24);
                }
                {
                    var17_24 = var17_24.getBitmapOriginal();
                }
                {
                    var5_5 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var17_24, (Rect)var25_52, var4_4, var8_8, var12_12);
                }
                {
                    var19_32 = var25_52.left + var8_8;
                }
                {
                    var25_52.right = var19_32;
                    var8_8 = var25_52.top + var12_12;
                }
                {
                    var25_52.bottom = var8_8;
                    var7_7 = var1_1.this$1;
                }
                {
                    var7_7 = var7_7.this$0;
                }
                {
                    var7_7 = EngineActivity.cfr_renamed_64((EngineActivity)var7_7);
                }
                {
                    var7_7.setRectSquare((Rect)var25_52);
                }
            }
            var27_57 = var5_5;
            var28_60 = var25_52;
lbl-1000:
            // 3 sources

            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var5_5.getColor_gradient();
                if (var5_5 == null) ** GOTO lbl619
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var31_64 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var32_66 = UtilsBitmap.blur((Context)var5_5, (Bitmap)var3_3, var9_9, var11_11);
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var33_68 = var3_3.getColor_gradient();
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
            }
            {
                var34_69 = var3_3.getIpad_type();
            }
            {
                var6_6 = var1_1.val$resize;
            }
            {
                var31_64.setBitmap(var32_66, (Bitmap)var27_57, var33_68, var34_69, var6_6, (Rect)var28_60);
                ** GOTO lbl708
lbl619:
                // 1 sources

                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var31_65 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var32_67 = UtilsBitmap.blur((Context)var5_5, (Bitmap)var3_3, var9_9, var11_11);
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var35_71 = var3_3.getColor_ipad();
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
            }
            {
                var34_70 = var3_3.getIpad_type();
            }
            {
                var6_6 = var1_1.val$resize;
            }
            {
                var31_65.setBitmap(var32_67, (Bitmap)var27_57, var35_71, var34_70, var6_6, (Rect)var28_60);
                ** GOTO lbl708
lbl636:
                // 6 sources

                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5.setBitmapNotBlur((Bitmap)var3_3);
                var5_5 = var3_3.getConfig();
                var5_5 = var5_5 != null ? var3_3.getConfig() : Bitmap.Config.ARGB_8888;
            }
            {
                var23_47 = var3_3.copy((Bitmap.Config)var5_5, (boolean)var11_11);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var5_5.getColor_gradient();
                if (var5_5 == null) ** GOTO lbl669
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var17_25 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var20_36 = UtilsBitmap.blur((Context)var5_5, (Bitmap)var3_3, var9_9, var11_11);
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var25_53 = var3_3.getColor_gradient();
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
            }
            {
                var36_72 = var3_3.getIpad_type();
            }
            {
                var37_74 = var1_1.val$resize;
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var27_58 = var3_3.getRectSquare();
            }
            {
                var17_25.setBitmap(var20_36, var23_47, var25_53, var36_72, var37_74, var27_58);
                ** GOTO lbl689
lbl669:
                // 1 sources

                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var17_26 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var20_37 = UtilsBitmap.blur((Context)var5_5, (Bitmap)var3_3, var9_9, var11_11);
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var26_56 = var3_3.getColor_ipad();
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
            }
            {
                var36_73 = var3_3.getIpad_type();
            }
            {
                var37_75 = var1_1.val$resize;
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var27_59 = var3_3.getRectSquare();
            }
            {
                var17_26.setBitmap(var20_37, var23_47, var26_56, var36_73, var37_75, var27_59);
lbl689:
                // 2 sources

                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_2((EngineActivity)var3_3);
            }
            {
                var6_6 = var3_3.getIpad_type();
            }
            {
                var5_5 = IpadType.CASSET_IMG_BLUR;
            }
            {
                var4_4 = var5_5.ordinal();
                if (var6_6 != var4_4) ** GOTO lbl708
            }
            {
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var5_5 = var1_1.this$1;
            }
            {
                var5_5 = var5_5.this$0;
            }
            {
                var5_5 = EngineActivity.cfr_renamed_64((EngineActivity)var5_5);
            }
            {
                var5_5 = var5_5.getBitmapBlured();
            }
            {
                var3_3.setBitmapSquare((Bitmap)var5_5);
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var3_3.setRadius_square(0);
lbl708:
                // 4 sources

                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var3_3.resizeEntity();
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var3_3 = EngineActivity.cfr_renamed_64((EngineActivity)var3_3);
            }
            {
                var3_3.updatePosSurahName();
                var3_3 = var1_1.this$1;
            }
            {
                var3_3 = var3_3.this$0;
            }
            {
                var5_5 = new EngineActivity$78$1$1(var1_1);
            }
            {
                var3_3.runOnUiThread((Runnable)var5_5);
            }
            {
                var2_2 /* !! */  = var1_1.this$1;
                var2_2 /* !! */  = var2_2 /* !! */ .this$0;
            }
            {
                var3_3 = new EngineActivity$78$1$2(var1_1);
            }
lbl-1000:
            // 2 sources

            {
                var2_2 /* !! */ .runOnUiThread((Runnable)var3_3);
                return;
            }
        }
        try {
            var3_3 = var1_1.this$1;
        }
        catch (Exception v1) {
            throw var2_2 /* !! */ ;
        }
        {
            var3_3 = var3_3.this$0;
        }
        {
            var5_5 = new EngineActivity$78$1$2(var1_1);
        }
        {
            var3_3.runOnUiThread((Runnable)var5_5);
        }
        throw var2_2 /* !! */ ;
    }
}

