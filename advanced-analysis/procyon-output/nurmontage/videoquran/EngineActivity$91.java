// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;

class EngineActivity$91 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$selectedImageUri;
    
    EngineActivity$91(final EngineActivity this$0, final Uri val$selectedImageUri) {
        this.this$0 = this$0;
        this.val$selectedImageUri = val$selectedImageUri;
    }
    
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: iconst_1       
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //     8: astore_3       
        //     9: aload_3        
        //    10: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.getContentResolver:()Landroid/content/ContentResolver;
        //    13: astore_3       
        //    14: aload_0        
        //    15: getfield        hazem/nurmontage/videoquran/EngineActivity$91.val$selectedImageUri:Landroid/net/Uri;
        //    18: astore          4
        //    20: aload_3        
        //    21: aload           4
        //    23: iload_2        
        //    24: invokevirtual   android/content/ContentResolver.takePersistableUriPermission:(Landroid/net/Uri;I)V
        //    27: goto            40
        //    30: astore          5
        //    32: aload           5
        //    34: astore          6
        //    36: goto            3427
        //    39: pop            
        //    40: aload_1        
        //    41: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    44: astore_3       
        //    45: aload_1        
        //    46: getfield        hazem/nurmontage/videoquran/EngineActivity$91.val$selectedImageUri:Landroid/net/Uri;
        //    49: astore          4
        //    51: aload           4
        //    53: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    56: astore          4
        //    58: aload_3        
        //    59: aload           4
        //    61: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fputuri_bg:(Lhazem/nurmontage/videoquran/EngineActivity;Ljava/lang/String;)V
        //    64: aload_1        
        //    65: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    68: astore_3       
        //    69: aload_3        
        //    70: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //    73: astore_3       
        //    74: iconst_0       
        //    75: istore          7
        //    77: fconst_0       
        //    78: fstore          8
        //    80: aconst_null    
        //    81: astore          4
        //    83: aload_3        
        //    84: aconst_null    
        //    85: invokevirtual   hazem/nurmontage/videoquran/model/Template.setName_drawable:(Ljava/lang/String;)V
        //    88: aload_1        
        //    89: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    92: astore_3       
        //    93: aload_3        
        //    94: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //    97: astore_3       
        //    98: aload_1        
        //    99: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   102: astore          9
        //   104: aload           9
        //   106: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgeturi_bg:(Lhazem/nurmontage/videoquran/EngineActivity;)Ljava/lang/String;
        //   109: astore          9
        //   111: aload_3        
        //   112: aload           9
        //   114: invokevirtual   hazem/nurmontage/videoquran/model/Template.setUri_bg:(Ljava/lang/String;)V
        //   117: aload_1        
        //   118: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   121: astore_3       
        //   122: aload_3        
        //   123: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   126: astore_3       
        //   127: iconst_0       
        //   128: istore          10
        //   130: fconst_0       
        //   131: fstore          11
        //   133: aconst_null    
        //   134: astore          9
        //   136: aload_3        
        //   137: iconst_0       
        //   138: invokevirtual   hazem/nurmontage/videoquran/model/Template.setVideoSquare:(Z)V
        //   141: aload_1        
        //   142: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   145: astore_3       
        //   146: aload_3        
        //   147: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   150: astore_3       
        //   151: aload_3        
        //   152: iconst_0       
        //   153: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setVideo:(Z)V
        //   156: aload_1        
        //   157: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   160: astore_3       
        //   161: aload_3        
        //   162: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   165: astore_3       
        //   166: aload_1        
        //   167: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   170: astore          12
        //   172: aload_1        
        //   173: getfield        hazem/nurmontage/videoquran/EngineActivity$91.val$selectedImageUri:Landroid/net/Uri;
        //   176: astore          13
        //   178: aload           12
        //   180: aload           13
        //   182: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$msetupOriginalBitmap:(Lhazem/nurmontage/videoquran/EngineActivity;Landroid/net/Uri;)Landroid/graphics/Bitmap;
        //   185: astore          12
        //   187: aload_3        
        //   188: aload           12
        //   190: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapOriginal:(Landroid/graphics/Bitmap;)V
        //   193: aload_1        
        //   194: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   197: astore_3       
        //   198: aload_3        
        //   199: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   202: astore_3       
        //   203: aload_3        
        //   204: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   207: istore          14
        //   209: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SOCIAL_STORY:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //   212: astore          12
        //   214: aload           12
        //   216: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //   219: istore          15
        //   221: iload           14
        //   223: iload           15
        //   225: if_icmpne       295
        //   228: aload_1        
        //   229: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   232: astore_3       
        //   233: aload_3        
        //   234: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   237: astore_3       
        //   238: aload_3        
        //   239: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   242: astore_3       
        //   243: aload_1        
        //   244: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   247: astore          12
        //   249: aload           12
        //   251: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   254: astore          12
        //   256: aload           12
        //   258: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   261: istore          15
        //   263: aload_1        
        //   264: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   267: astore          13
        //   269: aload           13
        //   271: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   274: astore          13
        //   276: aload           13
        //   278: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   281: istore          16
        //   283: aload_3        
        //   284: iload           15
        //   286: iload           16
        //   288: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo9x16:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   291: astore_3       
        //   292: goto            461
        //   295: aload_1        
        //   296: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   299: astore_3       
        //   300: aload_3        
        //   301: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   304: astore_3       
        //   305: aload_3        
        //   306: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   309: istore          14
        //   311: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SQUARE:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //   314: astore          12
        //   316: aload           12
        //   318: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //   321: istore          15
        //   323: iload           14
        //   325: iload           15
        //   327: if_icmpne       397
        //   330: aload_1        
        //   331: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   334: astore_3       
        //   335: aload_3        
        //   336: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   339: astore_3       
        //   340: aload_3        
        //   341: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   344: astore_3       
        //   345: aload_1        
        //   346: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   349: astore          12
        //   351: aload           12
        //   353: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   356: astore          12
        //   358: aload           12
        //   360: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   363: istore          15
        //   365: aload_1        
        //   366: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   369: astore          13
        //   371: aload           13
        //   373: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   376: astore          13
        //   378: aload           13
        //   380: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   383: istore          16
        //   385: aload_3        
        //   386: iload           15
        //   388: iload           16
        //   390: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo1x1:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   393: astore_3       
        //   394: goto            461
        //   397: aload_1        
        //   398: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   401: astore_3       
        //   402: aload_3        
        //   403: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   406: astore_3       
        //   407: aload_3        
        //   408: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   411: astore_3       
        //   412: aload_1        
        //   413: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   416: astore          12
        //   418: aload           12
        //   420: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   423: astore          12
        //   425: aload           12
        //   427: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   430: istore          15
        //   432: aload_1        
        //   433: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   436: astore          13
        //   438: aload           13
        //   440: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   443: astore          13
        //   445: aload           13
        //   447: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   450: istore          16
        //   452: aload_3        
        //   453: iload           15
        //   455: iload           16
        //   457: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo16x9:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   460: astore_3       
        //   461: aload_1        
        //   462: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   465: astore          12
        //   467: aload           12
        //   469: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   472: astore          12
        //   474: aload           12
        //   476: aload_3        
        //   477: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.updatePosCanvas:(Landroid/graphics/Bitmap;)V
        //   480: aload_1        
        //   481: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   484: astore          12
        //   486: aload           12
        //   488: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   491: astore          12
        //   493: aload_1        
        //   494: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   497: astore          13
        //   499: aload           13
        //   501: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   504: astore          13
        //   506: aload           13
        //   508: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   511: istore          16
        //   513: aload_1        
        //   514: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   517: astore          17
        //   519: aload           17
        //   521: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   524: astore          17
        //   526: aload           17
        //   528: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   531: istore          18
        //   533: aload           12
        //   535: aload_3        
        //   536: iload           16
        //   538: iload           18
        //   540: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.updateIpad:(Landroid/graphics/Bitmap;II)V
        //   543: aload_1        
        //   544: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   547: astore          12
        //   549: aload           12
        //   551: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   554: astore          12
        //   556: aload           12
        //   558: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   561: astore          12
        //   563: aload           12
        //   565: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   568: istore          15
        //   570: aload_1        
        //   571: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   574: astore          13
        //   576: aload           13
        //   578: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   581: astore          13
        //   583: aload           13
        //   585: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   588: astore          13
        //   590: aload           13
        //   592: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   595: istore          16
        //   597: iload           15
        //   599: iload           16
        //   601: invokestatic    java/lang/Math.min:(II)I
        //   604: istore          15
        //   606: aload_1        
        //   607: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   610: astore          13
        //   612: aload           13
        //   614: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   617: astore          13
        //   619: aload           13
        //   621: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   624: istore          16
        //   626: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_NEOMORPHIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   629: astore          17
        //   631: aload           17
        //   633: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   636: istore          18
        //   638: iload           16
        //   640: iload           18
        //   642: if_icmpne       1219
        //   645: aload_1        
        //   646: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   649: astore          4
        //   651: aload           4
        //   653: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   656: astore          4
        //   658: aload           4
        //   660: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //   663: astore          4
        //   665: aload           4
        //   667: invokevirtual   android/graphics/RectF.width:()F
        //   670: fstore          8
        //   672: ldc             1058642330
        //   674: istore          16
        //   676: ldc             0.6
        //   678: fstore          19
        //   680: fload           8
        //   682: fload           19
        //   684: fmul           
        //   685: fstore          8
        //   687: fload           8
        //   689: f2i            
        //   690: istore          7
        //   692: iload           15
        //   694: i2f            
        //   695: fstore          20
        //   697: aload_1        
        //   698: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   701: astore          13
        //   703: aload           13
        //   705: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   708: astore          13
        //   710: aload           13
        //   712: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //   715: fload           20
        //   717: fmul           
        //   718: fstore          19
        //   720: fload           19
        //   722: invokestatic    java/lang/Math.round:(F)I
        //   725: istore          16
        //   727: aload_1        
        //   728: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   731: astore          17
        //   733: aload           17
        //   735: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   738: astore          17
        //   740: aload           17
        //   742: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //   745: fload           20
        //   747: fmul           
        //   748: fstore          21
        //   750: fload           21
        //   752: invokestatic    java/lang/Math.round:(F)I
        //   755: istore          18
        //   757: iload           7
        //   759: iload           16
        //   761: iadd           
        //   762: istore          22
        //   764: aload_1        
        //   765: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   768: astore          23
        //   770: aload           23
        //   772: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   775: astore          23
        //   777: aload           23
        //   779: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   782: astore          23
        //   784: aload           23
        //   786: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   789: istore          24
        //   791: iload           22
        //   793: iload           24
        //   795: if_icmple       866
        //   798: aload_1        
        //   799: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   802: astore          23
        //   804: aload           23
        //   806: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   809: astore          23
        //   811: aload           23
        //   813: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   816: astore          23
        //   818: aload           23
        //   820: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   823: istore          24
        //   825: iload           22
        //   827: iload           24
        //   829: isub           
        //   830: istore          22
        //   832: iload           16
        //   834: iload           22
        //   836: isub           
        //   837: istore          16
        //   839: aload_1        
        //   840: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   843: astore          25
        //   845: aload           25
        //   847: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   850: astore          25
        //   852: aload           25
        //   854: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   857: astore          25
        //   859: aload           25
        //   861: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   864: istore          22
        //   866: iload           7
        //   868: iload           18
        //   870: iadd           
        //   871: istore          24
        //   873: aload_1        
        //   874: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   877: astore          26
        //   879: aload           26
        //   881: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   884: astore          26
        //   886: aload           26
        //   888: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   891: astore          26
        //   893: aload           26
        //   895: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   898: istore          27
        //   900: iload           24
        //   902: iload           27
        //   904: if_icmple       975
        //   907: aload_1        
        //   908: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   911: astore          26
        //   913: aload           26
        //   915: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   918: astore          26
        //   920: aload           26
        //   922: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   925: astore          26
        //   927: aload           26
        //   929: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   932: istore          27
        //   934: iload           24
        //   936: iload           27
        //   938: isub           
        //   939: istore          24
        //   941: iload           18
        //   943: iload           24
        //   945: isub           
        //   946: istore          18
        //   948: aload_1        
        //   949: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   952: astore          23
        //   954: aload           23
        //   956: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   959: astore          23
        //   961: aload           23
        //   963: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   966: astore          23
        //   968: aload           23
        //   970: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   973: istore          24
        //   975: iload           16
        //   977: ifge            989
        //   980: iconst_0       
        //   981: istore          16
        //   983: aconst_null    
        //   984: astore          13
        //   986: fconst_0       
        //   987: fstore          19
        //   989: iload           18
        //   991: ifge            997
        //   994: goto            1001
        //   997: iload           18
        //   999: istore          10
        //  1001: new             Landroid/graphics/Rect;
        //  1004: astore          17
        //  1006: aload           17
        //  1008: iload           16
        //  1010: iload           10
        //  1012: iload           22
        //  1014: iload           24
        //  1016: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  1019: aload_1        
        //  1020: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1023: astore          9
        //  1025: aload           9
        //  1027: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1030: astore          9
        //  1032: aload           9
        //  1034: iload           7
        //  1036: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  1039: aload_1        
        //  1040: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1043: astore          9
        //  1045: aload           9
        //  1047: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1050: astore          9
        //  1052: aload           9
        //  1054: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  1057: fload           20
        //  1059: fmul           
        //  1060: fstore          11
        //  1062: fload           11
        //  1064: f2i            
        //  1065: istore          10
        //  1067: aload_1        
        //  1068: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1071: astore          13
        //  1073: aload           13
        //  1075: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1078: astore          13
        //  1080: aload           13
        //  1082: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  1085: fstore          19
        //  1087: fload           20
        //  1089: fload           19
        //  1091: fmul           
        //  1092: fstore          20
        //  1094: fload           20
        //  1096: f2i            
        //  1097: istore          15
        //  1099: aload_1        
        //  1100: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1103: astore          13
        //  1105: aload           13
        //  1107: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1110: astore          13
        //  1112: aload           13
        //  1114: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1117: astore          13
        //  1119: aload           13
        //  1121: aload           17
        //  1123: iload           7
        //  1125: iload           10
        //  1127: iload           15
        //  1129: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCorners:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  1132: astore          4
        //  1134: aload_1        
        //  1135: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1138: astore          13
        //  1140: aload           13
        //  1142: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1145: astore          13
        //  1147: aload           13
        //  1149: aload           4
        //  1151: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  1154: aload           17
        //  1156: getfield        android/graphics/Rect.left:I
        //  1159: iload           10
        //  1161: iadd           
        //  1162: istore          16
        //  1164: aload           17
        //  1166: iload           16
        //  1168: putfield        android/graphics/Rect.right:I
        //  1171: aload           17
        //  1173: getfield        android/graphics/Rect.top:I
        //  1176: iload           15
        //  1178: iadd           
        //  1179: istore          10
        //  1181: aload           17
        //  1183: iload           10
        //  1185: putfield        android/graphics/Rect.bottom:I
        //  1188: aload_1        
        //  1189: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1192: astore          9
        //  1194: aload           9
        //  1196: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1199: astore          9
        //  1201: aload           9
        //  1203: aload           17
        //  1205: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  1208: aload           4
        //  1210: astore          28
        //  1212: aload           17
        //  1214: astore          29
        //  1216: goto            2839
        //  1219: aload_1        
        //  1220: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1223: astore          13
        //  1225: aload           13
        //  1227: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1230: astore          13
        //  1232: aload           13
        //  1234: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1237: istore          16
        //  1239: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1242: astore          17
        //  1244: aload           17
        //  1246: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1249: istore          18
        //  1251: iload           16
        //  1253: iload           18
        //  1255: if_icmpeq       1987
        //  1258: aload_1        
        //  1259: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1262: astore          13
        //  1264: aload           13
        //  1266: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1269: astore          13
        //  1271: aload           13
        //  1273: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1276: istore          16
        //  1278: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_UNBLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1281: astore          17
        //  1283: aload           17
        //  1285: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1288: istore          18
        //  1290: iload           16
        //  1292: iload           18
        //  1294: if_icmpeq       1987
        //  1297: aload_1        
        //  1298: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1301: astore          13
        //  1303: aload           13
        //  1305: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1308: astore          13
        //  1310: aload           13
        //  1312: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1315: istore          16
        //  1317: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1320: astore          17
        //  1322: aload           17
        //  1324: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1327: istore          18
        //  1329: iload           16
        //  1331: iload           18
        //  1333: if_icmpne       1339
        //  1336: goto            1987
        //  1339: aload_1        
        //  1340: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1343: astore          13
        //  1345: aload           13
        //  1347: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1350: astore          13
        //  1352: aload           13
        //  1354: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1357: istore          16
        //  1359: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BOTTOM_RECT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1362: astore          17
        //  1364: aload           17
        //  1366: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1369: istore          18
        //  1371: iload           16
        //  1373: iload           18
        //  1375: if_icmpne       1978
        //  1378: aload_1        
        //  1379: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1382: astore          4
        //  1384: aload           4
        //  1386: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1389: astore          4
        //  1391: aload           4
        //  1393: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //  1396: astore          4
        //  1398: aload           4
        //  1400: invokevirtual   android/graphics/RectF.width:()F
        //  1403: fstore          8
        //  1405: ldc             1065353216
        //  1407: istore          16
        //  1409: ldc             1.0
        //  1411: fstore          19
        //  1413: fload           8
        //  1415: fload           19
        //  1417: fmul           
        //  1418: fstore          8
        //  1420: fload           8
        //  1422: f2i            
        //  1423: istore          7
        //  1425: aload_3        
        //  1426: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1429: i2f            
        //  1430: fstore          19
        //  1432: ldc             1057560199
        //  1434: istore          18
        //  1436: ldc             0.5355
        //  1438: fstore          21
        //  1440: fload           19
        //  1442: fload           21
        //  1444: fmul           
        //  1445: fstore          19
        //  1447: fload           19
        //  1449: f2i            
        //  1450: istore          16
        //  1452: iload           15
        //  1454: i2f            
        //  1455: fstore          20
        //  1457: aload_1        
        //  1458: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1461: astore          17
        //  1463: aload           17
        //  1465: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1468: astore          17
        //  1470: aload           17
        //  1472: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //  1475: fload           20
        //  1477: fmul           
        //  1478: fstore          21
        //  1480: fload           21
        //  1482: invokestatic    java/lang/Math.round:(F)I
        //  1485: istore          18
        //  1487: aload_1        
        //  1488: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1491: astore          25
        //  1493: aload           25
        //  1495: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1498: astore          25
        //  1500: aload           25
        //  1502: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //  1505: fload           20
        //  1507: fmul           
        //  1508: fstore          30
        //  1510: fload           30
        //  1512: invokestatic    java/lang/Math.round:(F)I
        //  1515: istore          22
        //  1517: iload           7
        //  1519: iload           18
        //  1521: iadd           
        //  1522: istore          7
        //  1524: aload_1        
        //  1525: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1528: astore          23
        //  1530: aload           23
        //  1532: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1535: astore          23
        //  1537: aload           23
        //  1539: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1542: astore          23
        //  1544: aload           23
        //  1546: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1549: istore          24
        //  1551: iload           7
        //  1553: iload           24
        //  1555: if_icmple       1626
        //  1558: aload_1        
        //  1559: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1562: astore          23
        //  1564: aload           23
        //  1566: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1569: astore          23
        //  1571: aload           23
        //  1573: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1576: astore          23
        //  1578: aload           23
        //  1580: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1583: istore          24
        //  1585: iload           7
        //  1587: iload           24
        //  1589: isub           
        //  1590: istore          7
        //  1592: iload           18
        //  1594: iload           7
        //  1596: isub           
        //  1597: istore          18
        //  1599: aload_1        
        //  1600: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1603: astore          4
        //  1605: aload           4
        //  1607: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1610: astore          4
        //  1612: aload           4
        //  1614: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1617: astore          4
        //  1619: aload           4
        //  1621: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1624: istore          7
        //  1626: iload           16
        //  1628: iload           22
        //  1630: iadd           
        //  1631: istore          16
        //  1633: aload_1        
        //  1634: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1637: astore          23
        //  1639: aload           23
        //  1641: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1644: astore          23
        //  1646: aload           23
        //  1648: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1651: astore          23
        //  1653: aload           23
        //  1655: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1658: istore          24
        //  1660: iload           16
        //  1662: iload           24
        //  1664: if_icmple       1735
        //  1667: aload_1        
        //  1668: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1671: astore          23
        //  1673: aload           23
        //  1675: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1678: astore          23
        //  1680: aload           23
        //  1682: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1685: astore          23
        //  1687: aload           23
        //  1689: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1692: istore          24
        //  1694: iload           16
        //  1696: iload           24
        //  1698: isub           
        //  1699: istore          16
        //  1701: iload           22
        //  1703: iload           16
        //  1705: isub           
        //  1706: istore          22
        //  1708: aload_1        
        //  1709: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1712: astore          13
        //  1714: aload           13
        //  1716: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1719: astore          13
        //  1721: aload           13
        //  1723: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1726: astore          13
        //  1728: aload           13
        //  1730: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1733: istore          16
        //  1735: iload           18
        //  1737: ifge            1749
        //  1740: iconst_0       
        //  1741: istore          18
        //  1743: aconst_null    
        //  1744: astore          17
        //  1746: fconst_0       
        //  1747: fstore          21
        //  1749: iload           22
        //  1751: ifge            1763
        //  1754: iconst_0       
        //  1755: istore          22
        //  1757: aconst_null    
        //  1758: astore          25
        //  1760: fconst_0       
        //  1761: fstore          30
        //  1763: new             Landroid/graphics/Rect;
        //  1766: astore          23
        //  1768: aload           23
        //  1770: iload           18
        //  1772: iload           22
        //  1774: iload           7
        //  1776: iload           16
        //  1778: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  1781: aload_1        
        //  1782: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1785: astore          4
        //  1787: aload           4
        //  1789: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1792: astore          4
        //  1794: aload           4
        //  1796: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  1799: fload           20
        //  1801: fmul           
        //  1802: fstore          8
        //  1804: fload           8
        //  1806: f2i            
        //  1807: istore          7
        //  1809: aload_1        
        //  1810: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1813: astore          13
        //  1815: aload           13
        //  1817: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1820: astore          13
        //  1822: aload           13
        //  1824: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  1827: fstore          19
        //  1829: fload           20
        //  1831: fload           19
        //  1833: fmul           
        //  1834: fstore          20
        //  1836: fload           20
        //  1838: f2i            
        //  1839: istore          15
        //  1841: aload_1        
        //  1842: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1845: astore          13
        //  1847: aload           13
        //  1849: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1852: astore          13
        //  1854: aload           13
        //  1856: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1859: astore          13
        //  1861: aload           13
        //  1863: aload           23
        //  1865: iload           7
        //  1867: iload           15
        //  1869: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquare:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;
        //  1872: astore          13
        //  1874: aload_1        
        //  1875: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1878: astore          17
        //  1880: aload           17
        //  1882: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1885: astore          17
        //  1887: aload           17
        //  1889: aload           13
        //  1891: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  1894: aload_1        
        //  1895: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1898: astore          17
        //  1900: aload           17
        //  1902: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1905: astore          17
        //  1907: aload           17
        //  1909: iconst_0       
        //  1910: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  1913: aload           23
        //  1915: getfield        android/graphics/Rect.left:I
        //  1918: iload           7
        //  1920: iadd           
        //  1921: istore          10
        //  1923: aload           23
        //  1925: iload           10
        //  1927: putfield        android/graphics/Rect.right:I
        //  1930: aload           23
        //  1932: getfield        android/graphics/Rect.top:I
        //  1935: iload           15
        //  1937: iadd           
        //  1938: istore          7
        //  1940: aload           23
        //  1942: iload           7
        //  1944: putfield        android/graphics/Rect.bottom:I
        //  1947: aload_1        
        //  1948: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1951: astore          4
        //  1953: aload           4
        //  1955: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1958: astore          4
        //  1960: aload           4
        //  1962: aload           23
        //  1964: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  1967: aload           13
        //  1969: astore          28
        //  1971: aload           23
        //  1973: astore          29
        //  1975: goto            2839
        //  1978: aconst_null    
        //  1979: astore          28
        //  1981: aconst_null    
        //  1982: astore          29
        //  1984: goto            2839
        //  1987: aload_1        
        //  1988: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1991: astore          4
        //  1993: aload           4
        //  1995: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1998: astore          4
        //  2000: aload           4
        //  2002: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //  2005: astore          4
        //  2007: aload           4
        //  2009: invokevirtual   android/graphics/RectF.width:()F
        //  2012: ldc             0.87530595
        //  2014: fmul           
        //  2015: fstore          8
        //  2017: fload           8
        //  2019: f2i            
        //  2020: istore          7
        //  2022: iload           7
        //  2024: i2f            
        //  2025: fstore          19
        //  2027: ldc             1066443735
        //  2029: istore          18
        //  2031: ldc             1.13
        //  2033: fstore          21
        //  2035: fload           19
        //  2037: fload           21
        //  2039: fmul           
        //  2040: fstore          19
        //  2042: fload           19
        //  2044: f2i            
        //  2045: istore          16
        //  2047: iload           7
        //  2049: iload           16
        //  2051: invokestatic    java/lang/Math.min:(II)I
        //  2054: istore          18
        //  2056: iload           15
        //  2058: i2f            
        //  2059: fstore          20
        //  2061: aload_1        
        //  2062: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2065: astore          25
        //  2067: aload           25
        //  2069: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2072: astore          25
        //  2074: aload           25
        //  2076: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //  2079: fload           20
        //  2081: fmul           
        //  2082: fstore          30
        //  2084: fload           30
        //  2086: invokestatic    java/lang/Math.round:(F)I
        //  2089: istore          22
        //  2091: aload_1        
        //  2092: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2095: astore          23
        //  2097: aload           23
        //  2099: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2102: astore          23
        //  2104: aload           23
        //  2106: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //  2109: fload           20
        //  2111: fmul           
        //  2112: fstore          31
        //  2114: fload           31
        //  2116: invokestatic    java/lang/Math.round:(F)I
        //  2119: istore          24
        //  2121: iload           7
        //  2123: iload           22
        //  2125: iadd           
        //  2126: istore          7
        //  2128: aload_1        
        //  2129: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2132: astore          26
        //  2134: aload           26
        //  2136: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2139: astore          26
        //  2141: aload           26
        //  2143: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2146: astore          26
        //  2148: aload           26
        //  2150: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2153: istore          27
        //  2155: iload           7
        //  2157: iload           27
        //  2159: if_icmple       2230
        //  2162: aload_1        
        //  2163: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2166: astore          26
        //  2168: aload           26
        //  2170: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2173: astore          26
        //  2175: aload           26
        //  2177: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2180: astore          26
        //  2182: aload           26
        //  2184: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2187: istore          27
        //  2189: iload           7
        //  2191: iload           27
        //  2193: isub           
        //  2194: istore          7
        //  2196: iload           22
        //  2198: iload           7
        //  2200: isub           
        //  2201: istore          22
        //  2203: aload_1        
        //  2204: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2207: astore          4
        //  2209: aload           4
        //  2211: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2214: astore          4
        //  2216: aload           4
        //  2218: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2221: astore          4
        //  2223: aload           4
        //  2225: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2228: istore          7
        //  2230: iload           16
        //  2232: iload           24
        //  2234: iadd           
        //  2235: istore          16
        //  2237: aload_1        
        //  2238: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2241: astore          26
        //  2243: aload           26
        //  2245: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2248: astore          26
        //  2250: aload           26
        //  2252: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2255: astore          26
        //  2257: aload           26
        //  2259: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2262: istore          27
        //  2264: iload           16
        //  2266: iload           27
        //  2268: if_icmple       2339
        //  2271: aload_1        
        //  2272: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2275: astore          26
        //  2277: aload           26
        //  2279: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2282: astore          26
        //  2284: aload           26
        //  2286: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2289: astore          26
        //  2291: aload           26
        //  2293: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2296: istore          27
        //  2298: iload           16
        //  2300: iload           27
        //  2302: isub           
        //  2303: istore          16
        //  2305: iload           24
        //  2307: iload           16
        //  2309: isub           
        //  2310: istore          24
        //  2312: aload_1        
        //  2313: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2316: astore          13
        //  2318: aload           13
        //  2320: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2323: astore          13
        //  2325: aload           13
        //  2327: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2330: astore          13
        //  2332: aload           13
        //  2334: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2337: istore          16
        //  2339: iload           22
        //  2341: ifge            2353
        //  2344: iconst_0       
        //  2345: istore          22
        //  2347: aconst_null    
        //  2348: astore          25
        //  2350: fconst_0       
        //  2351: fstore          30
        //  2353: iload           24
        //  2355: ifge            2367
        //  2358: iconst_0       
        //  2359: istore          24
        //  2361: aconst_null    
        //  2362: astore          23
        //  2364: fconst_0       
        //  2365: fstore          31
        //  2367: new             Landroid/graphics/Rect;
        //  2370: astore          26
        //  2372: aload           26
        //  2374: iload           22
        //  2376: iload           24
        //  2378: iload           7
        //  2380: iload           16
        //  2382: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  2385: aload_1        
        //  2386: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2389: astore          4
        //  2391: aload           4
        //  2393: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2396: astore          4
        //  2398: aload           4
        //  2400: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  2403: istore          7
        //  2405: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  2408: astore          13
        //  2410: aload           13
        //  2412: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  2415: istore          16
        //  2417: iload           7
        //  2419: iload           16
        //  2421: if_icmpne       2617
        //  2424: aload_1        
        //  2425: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2428: astore          4
        //  2430: aload           4
        //  2432: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2435: astore          4
        //  2437: aload           4
        //  2439: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  2442: fload           20
        //  2444: fmul           
        //  2445: fstore          8
        //  2447: fload           8
        //  2449: f2i            
        //  2450: istore          7
        //  2452: aload_1        
        //  2453: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2456: astore          13
        //  2458: aload           13
        //  2460: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2463: astore          13
        //  2465: aload           13
        //  2467: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  2470: fstore          19
        //  2472: fload           20
        //  2474: fload           19
        //  2476: fmul           
        //  2477: fstore          20
        //  2479: fload           20
        //  2481: f2i            
        //  2482: istore          15
        //  2484: aload_1        
        //  2485: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2488: astore          13
        //  2490: aload           13
        //  2492: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2495: astore          13
        //  2497: aload           13
        //  2499: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2502: astore          13
        //  2504: aload           13
        //  2506: aload           26
        //  2508: iload           7
        //  2510: iload           15
        //  2512: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquare:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;
        //  2515: astore          13
        //  2517: aload_1        
        //  2518: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2521: astore          17
        //  2523: aload           17
        //  2525: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2528: astore          17
        //  2530: aload           17
        //  2532: aload           13
        //  2534: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  2537: aload_1        
        //  2538: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2541: astore          17
        //  2543: aload           17
        //  2545: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2548: astore          17
        //  2550: aload           17
        //  2552: iconst_0       
        //  2553: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  2556: aload           26
        //  2558: getfield        android/graphics/Rect.left:I
        //  2561: iload           7
        //  2563: iadd           
        //  2564: istore          10
        //  2566: aload           26
        //  2568: iload           10
        //  2570: putfield        android/graphics/Rect.right:I
        //  2573: aload           26
        //  2575: getfield        android/graphics/Rect.top:I
        //  2578: iload           15
        //  2580: iadd           
        //  2581: istore          7
        //  2583: aload           26
        //  2585: iload           7
        //  2587: putfield        android/graphics/Rect.bottom:I
        //  2590: aload_1        
        //  2591: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2594: astore          4
        //  2596: aload           4
        //  2598: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2601: astore          4
        //  2603: aload           4
        //  2605: aload           26
        //  2607: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  2610: aload           13
        //  2612: astore          4
        //  2614: goto            2831
        //  2617: iload           18
        //  2619: i2f            
        //  2620: fstore          8
        //  2622: ldc             1037905692
        //  2624: istore          10
        //  2626: ldc             0.10800001
        //  2628: fstore          11
        //  2630: fload           8
        //  2632: fload           11
        //  2634: fmul           
        //  2635: fstore          8
        //  2637: fload           8
        //  2639: f2i            
        //  2640: istore          7
        //  2642: aload_1        
        //  2643: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2646: astore          9
        //  2648: aload           9
        //  2650: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2653: astore          9
        //  2655: aload           9
        //  2657: iload           7
        //  2659: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  2662: aload_1        
        //  2663: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2666: astore          9
        //  2668: aload           9
        //  2670: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2673: astore          9
        //  2675: aload           9
        //  2677: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  2680: fload           20
        //  2682: fmul           
        //  2683: fstore          11
        //  2685: fload           11
        //  2687: f2i            
        //  2688: istore          10
        //  2690: aload_1        
        //  2691: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2694: astore          13
        //  2696: aload           13
        //  2698: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2701: astore          13
        //  2703: aload           13
        //  2705: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  2708: fstore          19
        //  2710: fload           20
        //  2712: fload           19
        //  2714: fmul           
        //  2715: fstore          20
        //  2717: fload           20
        //  2719: f2i            
        //  2720: istore          15
        //  2722: aload_1        
        //  2723: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2726: astore          13
        //  2728: aload           13
        //  2730: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2733: astore          13
        //  2735: aload           13
        //  2737: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2740: astore          13
        //  2742: aload           13
        //  2744: aload           26
        //  2746: iload           7
        //  2748: iload           10
        //  2750: iload           15
        //  2752: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCorners:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  2755: astore          4
        //  2757: aload_1        
        //  2758: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2761: astore          13
        //  2763: aload           13
        //  2765: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2768: astore          13
        //  2770: aload           13
        //  2772: aload           4
        //  2774: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  2777: aload           26
        //  2779: getfield        android/graphics/Rect.left:I
        //  2782: iload           10
        //  2784: iadd           
        //  2785: istore          16
        //  2787: aload           26
        //  2789: iload           16
        //  2791: putfield        android/graphics/Rect.right:I
        //  2794: aload           26
        //  2796: getfield        android/graphics/Rect.top:I
        //  2799: iload           15
        //  2801: iadd           
        //  2802: istore          10
        //  2804: aload           26
        //  2806: iload           10
        //  2808: putfield        android/graphics/Rect.bottom:I
        //  2811: aload_1        
        //  2812: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2815: astore          9
        //  2817: aload           9
        //  2819: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2822: astore          9
        //  2824: aload           9
        //  2826: aload           26
        //  2828: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  2831: aload           4
        //  2833: astore          28
        //  2835: aload           26
        //  2837: astore          29
        //  2839: aload_1        
        //  2840: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2843: astore          4
        //  2845: aload           4
        //  2847: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2850: astore          4
        //  2852: aload           4
        //  2854: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  2857: istore          7
        //  2859: getstatic       hazem/nurmontage/videoquran/constant/IpadType.GRADIENT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  2862: astore          9
        //  2864: aload           9
        //  2866: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  2869: istore          10
        //  2871: bipush          20
        //  2873: istore          15
        //  2875: ldc             2.8E-44
        //  2877: fstore          20
        //  2879: iload           7
        //  2881: iload           10
        //  2883: if_icmpne       2980
        //  2886: aload_1        
        //  2887: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2890: astore          4
        //  2892: aload           4
        //  2894: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2897: astore          32
        //  2899: aload_1        
        //  2900: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2903: astore          4
        //  2905: aload           4
        //  2907: aload_3        
        //  2908: iload           15
        //  2910: iload_2        
        //  2911: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  2914: astore          33
        //  2916: aload_1        
        //  2917: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2920: astore          6
        //  2922: aload           6
        //  2924: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2927: astore          6
        //  2929: aload           6
        //  2931: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  2934: istore          34
        //  2936: aload_1        
        //  2937: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2940: astore          6
        //  2942: aload           6
        //  2944: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2947: astore          6
        //  2949: aload           6
        //  2951: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  2954: istore          35
        //  2956: ldc             -16777216
        //  2958: istore          36
        //  2960: aload           32
        //  2962: aload           33
        //  2964: aload           28
        //  2966: iload           36
        //  2968: iload           34
        //  2970: iload           35
        //  2972: aload           29
        //  2974: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIILandroid/graphics/Rect;)V
        //  2977: goto            3354
        //  2980: aload_1        
        //  2981: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2984: astore          4
        //  2986: aload           4
        //  2988: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2991: astore          4
        //  2993: aload           4
        //  2995: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  2998: istore          7
        //  3000: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLUE_TYPE:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  3003: astore          9
        //  3005: aload           9
        //  3007: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  3010: istore          10
        //  3012: iload           7
        //  3014: iload           10
        //  3016: if_icmpne       3264
        //  3019: aload_1        
        //  3020: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3023: astore          4
        //  3025: aload           4
        //  3027: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3030: astore          4
        //  3032: aload           4
        //  3034: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  3037: astore          4
        //  3039: aload           4
        //  3041: ifnull          3154
        //  3044: aload_1        
        //  3045: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3048: astore          4
        //  3050: aload           4
        //  3052: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3055: astore          32
        //  3057: aload_1        
        //  3058: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3061: astore          4
        //  3063: aload           4
        //  3065: aload_3        
        //  3066: iload           15
        //  3068: iload_2        
        //  3069: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  3072: astore          33
        //  3074: aload_1        
        //  3075: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3078: astore          6
        //  3080: aload           6
        //  3082: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3085: astore          6
        //  3087: aload           6
        //  3089: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  3092: astore          37
        //  3094: aload_1        
        //  3095: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3098: astore          6
        //  3100: aload           6
        //  3102: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3105: astore          6
        //  3107: aload           6
        //  3109: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  3112: istore          34
        //  3114: aload_1        
        //  3115: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3118: astore          6
        //  3120: aload           6
        //  3122: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3125: astore          6
        //  3127: aload           6
        //  3129: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  3132: istore          35
        //  3134: aload           32
        //  3136: aload           33
        //  3138: aload           28
        //  3140: aload           37
        //  3142: iload           34
        //  3144: iload           35
        //  3146: aload           29
        //  3148: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lhazem/nurmontage/videoquran/model/Gradient;IILandroid/graphics/Rect;)V
        //  3151: goto            3354
        //  3154: aload_1        
        //  3155: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3158: astore          4
        //  3160: aload           4
        //  3162: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3165: astore          32
        //  3167: aload_1        
        //  3168: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3171: astore          4
        //  3173: aload           4
        //  3175: aload_3        
        //  3176: iload           15
        //  3178: iload_2        
        //  3179: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  3182: astore          33
        //  3184: aload_1        
        //  3185: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3188: astore          6
        //  3190: aload           6
        //  3192: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3195: astore          6
        //  3197: aload           6
        //  3199: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_ipad:()I
        //  3202: istore          36
        //  3204: aload_1        
        //  3205: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3208: astore          6
        //  3210: aload           6
        //  3212: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3215: astore          6
        //  3217: aload           6
        //  3219: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  3222: istore          34
        //  3224: aload_1        
        //  3225: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3228: astore          6
        //  3230: aload           6
        //  3232: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3235: astore          6
        //  3237: aload           6
        //  3239: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  3242: istore          35
        //  3244: aload           32
        //  3246: aload           33
        //  3248: aload           28
        //  3250: iload           36
        //  3252: iload           34
        //  3254: iload           35
        //  3256: aload           29
        //  3258: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIILandroid/graphics/Rect;)V
        //  3261: goto            3354
        //  3264: aload_1        
        //  3265: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3268: astore          4
        //  3270: aload           4
        //  3272: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3275: astore          32
        //  3277: aload_1        
        //  3278: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3281: astore          4
        //  3283: aload           4
        //  3285: aload_3        
        //  3286: iload           15
        //  3288: iload_2        
        //  3289: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  3292: astore          33
        //  3294: aload_1        
        //  3295: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3298: astore          6
        //  3300: aload           6
        //  3302: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3305: astore          6
        //  3307: aload           6
        //  3309: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  3312: istore          34
        //  3314: aload_1        
        //  3315: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3318: astore          6
        //  3320: aload           6
        //  3322: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3325: astore          6
        //  3327: aload           6
        //  3329: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  3332: istore          35
        //  3334: iconst_m1      
        //  3335: istore          36
        //  3337: aload           32
        //  3339: aload           33
        //  3341: aload           28
        //  3343: iload           36
        //  3345: iload           34
        //  3347: iload           35
        //  3349: aload           29
        //  3351: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIILandroid/graphics/Rect;)V
        //  3354: aload_1        
        //  3355: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3358: astore          6
        //  3360: aload           6
        //  3362: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3365: astore          6
        //  3367: aload           6
        //  3369: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.invalidate:()V
        //  3372: aload_1        
        //  3373: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3376: astore          6
        //  3378: new             Lhazem/nurmontage/videoquran/EngineActivity$91$1;
        //  3381: astore_3       
        //  3382: aload_3        
        //  3383: aload_1        
        //  3384: invokespecial   hazem/nurmontage/videoquran/EngineActivity$91$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$91;)V
        //  3387: aload           6
        //  3389: aload_3        
        //  3390: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  3393: goto            3426
        //  3396: astore          5
        //  3398: aload           5
        //  3400: astore          6
        //  3402: aload           5
        //  3404: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  3407: aload_1        
        //  3408: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3411: astore          6
        //  3413: new             Lhazem/nurmontage/videoquran/EngineActivity$91$1;
        //  3416: astore_3       
        //  3417: aload_3        
        //  3418: aload_1        
        //  3419: invokespecial   hazem/nurmontage/videoquran/EngineActivity$91$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$91;)V
        //  3422: goto            3387
        //  3425: pop            
        //  3426: return         
        //  3427: aload_1        
        //  3428: getfield        hazem/nurmontage/videoquran/EngineActivity$91.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3431: astore_3       
        //  3432: new             Lhazem/nurmontage/videoquran/EngineActivity$91$1;
        //  3435: astore          4
        //  3437: aload           4
        //  3439: aload_1        
        //  3440: invokespecial   hazem/nurmontage/videoquran/EngineActivity$91$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$91;)V
        //  3443: aload_3        
        //  3444: aload           4
        //  3446: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  3449: aload           6
        //  3451: athrow         
        //  3452: pop            
        //  3453: goto            3449
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      8      39     40     Ljava/lang/Exception;
        //  4      8      30     3456   Any
        //  9      13     39     40     Ljava/lang/Exception;
        //  9      13     30     3456   Any
        //  14     18     39     40     Ljava/lang/Exception;
        //  14     18     30     3456   Any
        //  23     27     39     40     Ljava/lang/Exception;
        //  23     27     30     3456   Any
        //  40     44     3396   3425   Ljava/lang/Exception;
        //  40     44     30     3456   Any
        //  45     49     3396   3425   Ljava/lang/Exception;
        //  45     49     30     3456   Any
        //  51     56     3396   3425   Ljava/lang/Exception;
        //  51     56     30     3456   Any
        //  59     64     3396   3425   Ljava/lang/Exception;
        //  59     64     30     3456   Any
        //  64     68     3396   3425   Ljava/lang/Exception;
        //  64     68     30     3456   Any
        //  69     73     3396   3425   Ljava/lang/Exception;
        //  69     73     30     3456   Any
        //  84     88     3396   3425   Ljava/lang/Exception;
        //  84     88     30     3456   Any
        //  88     92     3396   3425   Ljava/lang/Exception;
        //  88     92     30     3456   Any
        //  93     97     3396   3425   Ljava/lang/Exception;
        //  93     97     30     3456   Any
        //  98     102    3396   3425   Ljava/lang/Exception;
        //  98     102    30     3456   Any
        //  104    109    3396   3425   Ljava/lang/Exception;
        //  104    109    30     3456   Any
        //  112    117    3396   3425   Ljava/lang/Exception;
        //  112    117    30     3456   Any
        //  117    121    3396   3425   Ljava/lang/Exception;
        //  117    121    30     3456   Any
        //  122    126    3396   3425   Ljava/lang/Exception;
        //  122    126    30     3456   Any
        //  137    141    3396   3425   Ljava/lang/Exception;
        //  137    141    30     3456   Any
        //  141    145    3396   3425   Ljava/lang/Exception;
        //  141    145    30     3456   Any
        //  146    150    3396   3425   Ljava/lang/Exception;
        //  146    150    30     3456   Any
        //  152    156    3396   3425   Ljava/lang/Exception;
        //  152    156    30     3456   Any
        //  156    160    3396   3425   Ljava/lang/Exception;
        //  156    160    30     3456   Any
        //  161    165    3396   3425   Ljava/lang/Exception;
        //  161    165    30     3456   Any
        //  166    170    3396   3425   Ljava/lang/Exception;
        //  166    170    30     3456   Any
        //  172    176    3396   3425   Ljava/lang/Exception;
        //  172    176    30     3456   Any
        //  180    185    3396   3425   Ljava/lang/Exception;
        //  180    185    30     3456   Any
        //  188    193    3396   3425   Ljava/lang/Exception;
        //  188    193    30     3456   Any
        //  193    197    3396   3425   Ljava/lang/Exception;
        //  193    197    30     3456   Any
        //  198    202    3396   3425   Ljava/lang/Exception;
        //  198    202    30     3456   Any
        //  203    207    3396   3425   Ljava/lang/Exception;
        //  203    207    30     3456   Any
        //  209    212    3396   3425   Ljava/lang/Exception;
        //  209    212    30     3456   Any
        //  214    219    3396   3425   Ljava/lang/Exception;
        //  214    219    30     3456   Any
        //  228    232    3396   3425   Ljava/lang/Exception;
        //  228    232    30     3456   Any
        //  233    237    3396   3425   Ljava/lang/Exception;
        //  233    237    30     3456   Any
        //  238    242    3396   3425   Ljava/lang/Exception;
        //  238    242    30     3456   Any
        //  243    247    3396   3425   Ljava/lang/Exception;
        //  243    247    30     3456   Any
        //  249    254    3396   3425   Ljava/lang/Exception;
        //  249    254    30     3456   Any
        //  256    261    3396   3425   Ljava/lang/Exception;
        //  256    261    30     3456   Any
        //  263    267    3396   3425   Ljava/lang/Exception;
        //  263    267    30     3456   Any
        //  269    274    3396   3425   Ljava/lang/Exception;
        //  269    274    30     3456   Any
        //  276    281    3396   3425   Ljava/lang/Exception;
        //  276    281    30     3456   Any
        //  286    291    3396   3425   Ljava/lang/Exception;
        //  286    291    30     3456   Any
        //  295    299    3396   3425   Ljava/lang/Exception;
        //  295    299    30     3456   Any
        //  300    304    3396   3425   Ljava/lang/Exception;
        //  300    304    30     3456   Any
        //  305    309    3396   3425   Ljava/lang/Exception;
        //  305    309    30     3456   Any
        //  311    314    3396   3425   Ljava/lang/Exception;
        //  311    314    30     3456   Any
        //  316    321    3396   3425   Ljava/lang/Exception;
        //  316    321    30     3456   Any
        //  330    334    3396   3425   Ljava/lang/Exception;
        //  330    334    30     3456   Any
        //  335    339    3396   3425   Ljava/lang/Exception;
        //  335    339    30     3456   Any
        //  340    344    3396   3425   Ljava/lang/Exception;
        //  340    344    30     3456   Any
        //  345    349    3396   3425   Ljava/lang/Exception;
        //  345    349    30     3456   Any
        //  351    356    3396   3425   Ljava/lang/Exception;
        //  351    356    30     3456   Any
        //  358    363    3396   3425   Ljava/lang/Exception;
        //  358    363    30     3456   Any
        //  365    369    3396   3425   Ljava/lang/Exception;
        //  365    369    30     3456   Any
        //  371    376    3396   3425   Ljava/lang/Exception;
        //  371    376    30     3456   Any
        //  378    383    3396   3425   Ljava/lang/Exception;
        //  378    383    30     3456   Any
        //  388    393    3396   3425   Ljava/lang/Exception;
        //  388    393    30     3456   Any
        //  397    401    3396   3425   Ljava/lang/Exception;
        //  397    401    30     3456   Any
        //  402    406    3396   3425   Ljava/lang/Exception;
        //  402    406    30     3456   Any
        //  407    411    3396   3425   Ljava/lang/Exception;
        //  407    411    30     3456   Any
        //  412    416    3396   3425   Ljava/lang/Exception;
        //  412    416    30     3456   Any
        //  418    423    3396   3425   Ljava/lang/Exception;
        //  418    423    30     3456   Any
        //  425    430    3396   3425   Ljava/lang/Exception;
        //  425    430    30     3456   Any
        //  432    436    3396   3425   Ljava/lang/Exception;
        //  432    436    30     3456   Any
        //  438    443    3396   3425   Ljava/lang/Exception;
        //  438    443    30     3456   Any
        //  445    450    3396   3425   Ljava/lang/Exception;
        //  445    450    30     3456   Any
        //  455    460    3396   3425   Ljava/lang/Exception;
        //  455    460    30     3456   Any
        //  461    465    3396   3425   Ljava/lang/Exception;
        //  461    465    30     3456   Any
        //  467    472    3396   3425   Ljava/lang/Exception;
        //  467    472    30     3456   Any
        //  476    480    3396   3425   Ljava/lang/Exception;
        //  476    480    30     3456   Any
        //  480    484    3396   3425   Ljava/lang/Exception;
        //  480    484    30     3456   Any
        //  486    491    3396   3425   Ljava/lang/Exception;
        //  486    491    30     3456   Any
        //  493    497    3396   3425   Ljava/lang/Exception;
        //  493    497    30     3456   Any
        //  499    504    3396   3425   Ljava/lang/Exception;
        //  499    504    30     3456   Any
        //  506    511    3396   3425   Ljava/lang/Exception;
        //  506    511    30     3456   Any
        //  513    517    3396   3425   Ljava/lang/Exception;
        //  513    517    30     3456   Any
        //  519    524    3396   3425   Ljava/lang/Exception;
        //  519    524    30     3456   Any
        //  526    531    3396   3425   Ljava/lang/Exception;
        //  526    531    30     3456   Any
        //  538    543    3396   3425   Ljava/lang/Exception;
        //  538    543    30     3456   Any
        //  543    547    3396   3425   Ljava/lang/Exception;
        //  543    547    30     3456   Any
        //  549    554    3396   3425   Ljava/lang/Exception;
        //  549    554    30     3456   Any
        //  556    561    3396   3425   Ljava/lang/Exception;
        //  556    561    30     3456   Any
        //  563    568    3396   3425   Ljava/lang/Exception;
        //  563    568    30     3456   Any
        //  570    574    3396   3425   Ljava/lang/Exception;
        //  570    574    30     3456   Any
        //  576    581    3396   3425   Ljava/lang/Exception;
        //  576    581    30     3456   Any
        //  583    588    3396   3425   Ljava/lang/Exception;
        //  583    588    30     3456   Any
        //  590    595    3396   3425   Ljava/lang/Exception;
        //  590    595    30     3456   Any
        //  599    604    3396   3425   Ljava/lang/Exception;
        //  599    604    30     3456   Any
        //  606    610    3396   3425   Ljava/lang/Exception;
        //  606    610    30     3456   Any
        //  612    617    3396   3425   Ljava/lang/Exception;
        //  612    617    30     3456   Any
        //  619    624    3396   3425   Ljava/lang/Exception;
        //  619    624    30     3456   Any
        //  626    629    3396   3425   Ljava/lang/Exception;
        //  626    629    30     3456   Any
        //  631    636    3396   3425   Ljava/lang/Exception;
        //  631    636    30     3456   Any
        //  645    649    3396   3425   Ljava/lang/Exception;
        //  645    649    30     3456   Any
        //  651    656    3396   3425   Ljava/lang/Exception;
        //  651    656    30     3456   Any
        //  658    663    3396   3425   Ljava/lang/Exception;
        //  658    663    30     3456   Any
        //  665    670    3396   3425   Ljava/lang/Exception;
        //  665    670    30     3456   Any
        //  697    701    3396   3425   Ljava/lang/Exception;
        //  697    701    30     3456   Any
        //  703    708    3396   3425   Ljava/lang/Exception;
        //  703    708    30     3456   Any
        //  710    715    3396   3425   Ljava/lang/Exception;
        //  710    715    30     3456   Any
        //  720    725    3396   3425   Ljava/lang/Exception;
        //  720    725    30     3456   Any
        //  727    731    3396   3425   Ljava/lang/Exception;
        //  727    731    30     3456   Any
        //  733    738    3396   3425   Ljava/lang/Exception;
        //  733    738    30     3456   Any
        //  740    745    3396   3425   Ljava/lang/Exception;
        //  740    745    30     3456   Any
        //  750    755    3396   3425   Ljava/lang/Exception;
        //  750    755    30     3456   Any
        //  764    768    3396   3425   Ljava/lang/Exception;
        //  764    768    30     3456   Any
        //  770    775    3396   3425   Ljava/lang/Exception;
        //  770    775    30     3456   Any
        //  777    782    3396   3425   Ljava/lang/Exception;
        //  777    782    30     3456   Any
        //  784    789    3396   3425   Ljava/lang/Exception;
        //  784    789    30     3456   Any
        //  798    802    3396   3425   Ljava/lang/Exception;
        //  798    802    30     3456   Any
        //  804    809    3396   3425   Ljava/lang/Exception;
        //  804    809    30     3456   Any
        //  811    816    3396   3425   Ljava/lang/Exception;
        //  811    816    30     3456   Any
        //  818    823    3396   3425   Ljava/lang/Exception;
        //  818    823    30     3456   Any
        //  839    843    3396   3425   Ljava/lang/Exception;
        //  839    843    30     3456   Any
        //  845    850    3396   3425   Ljava/lang/Exception;
        //  845    850    30     3456   Any
        //  852    857    3396   3425   Ljava/lang/Exception;
        //  852    857    30     3456   Any
        //  859    864    3396   3425   Ljava/lang/Exception;
        //  859    864    30     3456   Any
        //  873    877    3396   3425   Ljava/lang/Exception;
        //  873    877    30     3456   Any
        //  879    884    3396   3425   Ljava/lang/Exception;
        //  879    884    30     3456   Any
        //  886    891    3396   3425   Ljava/lang/Exception;
        //  886    891    30     3456   Any
        //  893    898    3396   3425   Ljava/lang/Exception;
        //  893    898    30     3456   Any
        //  907    911    3396   3425   Ljava/lang/Exception;
        //  907    911    30     3456   Any
        //  913    918    3396   3425   Ljava/lang/Exception;
        //  913    918    30     3456   Any
        //  920    925    3396   3425   Ljava/lang/Exception;
        //  920    925    30     3456   Any
        //  927    932    3396   3425   Ljava/lang/Exception;
        //  927    932    30     3456   Any
        //  948    952    3396   3425   Ljava/lang/Exception;
        //  948    952    30     3456   Any
        //  954    959    3396   3425   Ljava/lang/Exception;
        //  954    959    30     3456   Any
        //  961    966    3396   3425   Ljava/lang/Exception;
        //  961    966    30     3456   Any
        //  968    973    3396   3425   Ljava/lang/Exception;
        //  968    973    30     3456   Any
        //  1001   1004   3396   3425   Ljava/lang/Exception;
        //  1001   1004   30     3456   Any
        //  1014   1019   3396   3425   Ljava/lang/Exception;
        //  1014   1019   30     3456   Any
        //  1019   1023   3396   3425   Ljava/lang/Exception;
        //  1019   1023   30     3456   Any
        //  1025   1030   3396   3425   Ljava/lang/Exception;
        //  1025   1030   30     3456   Any
        //  1034   1039   3396   3425   Ljava/lang/Exception;
        //  1034   1039   30     3456   Any
        //  1039   1043   3396   3425   Ljava/lang/Exception;
        //  1039   1043   30     3456   Any
        //  1045   1050   3396   3425   Ljava/lang/Exception;
        //  1045   1050   30     3456   Any
        //  1052   1057   3396   3425   Ljava/lang/Exception;
        //  1052   1057   30     3456   Any
        //  1067   1071   3396   3425   Ljava/lang/Exception;
        //  1067   1071   30     3456   Any
        //  1073   1078   3396   3425   Ljava/lang/Exception;
        //  1073   1078   30     3456   Any
        //  1080   1085   3396   3425   Ljava/lang/Exception;
        //  1080   1085   30     3456   Any
        //  1099   1103   3396   3425   Ljava/lang/Exception;
        //  1099   1103   30     3456   Any
        //  1105   1110   3396   3425   Ljava/lang/Exception;
        //  1105   1110   30     3456   Any
        //  1112   1117   3396   3425   Ljava/lang/Exception;
        //  1112   1117   30     3456   Any
        //  1127   1132   3396   3425   Ljava/lang/Exception;
        //  1127   1132   30     3456   Any
        //  1134   1138   3396   3425   Ljava/lang/Exception;
        //  1134   1138   30     3456   Any
        //  1140   1145   3396   3425   Ljava/lang/Exception;
        //  1140   1145   30     3456   Any
        //  1149   1154   3396   3425   Ljava/lang/Exception;
        //  1149   1154   30     3456   Any
        //  1154   1159   3396   3425   Ljava/lang/Exception;
        //  1154   1159   30     3456   Any
        //  1166   1171   3396   3425   Ljava/lang/Exception;
        //  1166   1171   30     3456   Any
        //  1171   1176   3396   3425   Ljava/lang/Exception;
        //  1171   1176   30     3456   Any
        //  1183   1188   3396   3425   Ljava/lang/Exception;
        //  1183   1188   30     3456   Any
        //  1188   1192   3396   3425   Ljava/lang/Exception;
        //  1188   1192   30     3456   Any
        //  1194   1199   3396   3425   Ljava/lang/Exception;
        //  1194   1199   30     3456   Any
        //  1203   1208   3396   3425   Ljava/lang/Exception;
        //  1203   1208   30     3456   Any
        //  1219   1223   3396   3425   Ljava/lang/Exception;
        //  1219   1223   30     3456   Any
        //  1225   1230   3396   3425   Ljava/lang/Exception;
        //  1225   1230   30     3456   Any
        //  1232   1237   3396   3425   Ljava/lang/Exception;
        //  1232   1237   30     3456   Any
        //  1239   1242   3396   3425   Ljava/lang/Exception;
        //  1239   1242   30     3456   Any
        //  1244   1249   3396   3425   Ljava/lang/Exception;
        //  1244   1249   30     3456   Any
        //  1258   1262   3396   3425   Ljava/lang/Exception;
        //  1258   1262   30     3456   Any
        //  1264   1269   3396   3425   Ljava/lang/Exception;
        //  1264   1269   30     3456   Any
        //  1271   1276   3396   3425   Ljava/lang/Exception;
        //  1271   1276   30     3456   Any
        //  1278   1281   3396   3425   Ljava/lang/Exception;
        //  1278   1281   30     3456   Any
        //  1283   1288   3396   3425   Ljava/lang/Exception;
        //  1283   1288   30     3456   Any
        //  1297   1301   3396   3425   Ljava/lang/Exception;
        //  1297   1301   30     3456   Any
        //  1303   1308   3396   3425   Ljava/lang/Exception;
        //  1303   1308   30     3456   Any
        //  1310   1315   3396   3425   Ljava/lang/Exception;
        //  1310   1315   30     3456   Any
        //  1317   1320   3396   3425   Ljava/lang/Exception;
        //  1317   1320   30     3456   Any
        //  1322   1327   3396   3425   Ljava/lang/Exception;
        //  1322   1327   30     3456   Any
        //  1339   1343   3396   3425   Ljava/lang/Exception;
        //  1339   1343   30     3456   Any
        //  1345   1350   3396   3425   Ljava/lang/Exception;
        //  1345   1350   30     3456   Any
        //  1352   1357   3396   3425   Ljava/lang/Exception;
        //  1352   1357   30     3456   Any
        //  1359   1362   3396   3425   Ljava/lang/Exception;
        //  1359   1362   30     3456   Any
        //  1364   1369   3396   3425   Ljava/lang/Exception;
        //  1364   1369   30     3456   Any
        //  1378   1382   3396   3425   Ljava/lang/Exception;
        //  1378   1382   30     3456   Any
        //  1384   1389   3396   3425   Ljava/lang/Exception;
        //  1384   1389   30     3456   Any
        //  1391   1396   3396   3425   Ljava/lang/Exception;
        //  1391   1396   30     3456   Any
        //  1398   1403   3396   3425   Ljava/lang/Exception;
        //  1398   1403   30     3456   Any
        //  1425   1429   3396   3425   Ljava/lang/Exception;
        //  1425   1429   30     3456   Any
        //  1457   1461   3396   3425   Ljava/lang/Exception;
        //  1457   1461   30     3456   Any
        //  1463   1468   3396   3425   Ljava/lang/Exception;
        //  1463   1468   30     3456   Any
        //  1470   1475   3396   3425   Ljava/lang/Exception;
        //  1470   1475   30     3456   Any
        //  1480   1485   3396   3425   Ljava/lang/Exception;
        //  1480   1485   30     3456   Any
        //  1487   1491   3396   3425   Ljava/lang/Exception;
        //  1487   1491   30     3456   Any
        //  1493   1498   3396   3425   Ljava/lang/Exception;
        //  1493   1498   30     3456   Any
        //  1500   1505   3396   3425   Ljava/lang/Exception;
        //  1500   1505   30     3456   Any
        //  1510   1515   3396   3425   Ljava/lang/Exception;
        //  1510   1515   30     3456   Any
        //  1524   1528   3396   3425   Ljava/lang/Exception;
        //  1524   1528   30     3456   Any
        //  1530   1535   3396   3425   Ljava/lang/Exception;
        //  1530   1535   30     3456   Any
        //  1537   1542   3396   3425   Ljava/lang/Exception;
        //  1537   1542   30     3456   Any
        //  1544   1549   3396   3425   Ljava/lang/Exception;
        //  1544   1549   30     3456   Any
        //  1558   1562   3396   3425   Ljava/lang/Exception;
        //  1558   1562   30     3456   Any
        //  1564   1569   3396   3425   Ljava/lang/Exception;
        //  1564   1569   30     3456   Any
        //  1571   1576   3396   3425   Ljava/lang/Exception;
        //  1571   1576   30     3456   Any
        //  1578   1583   3396   3425   Ljava/lang/Exception;
        //  1578   1583   30     3456   Any
        //  1599   1603   3396   3425   Ljava/lang/Exception;
        //  1599   1603   30     3456   Any
        //  1605   1610   3396   3425   Ljava/lang/Exception;
        //  1605   1610   30     3456   Any
        //  1612   1617   3396   3425   Ljava/lang/Exception;
        //  1612   1617   30     3456   Any
        //  1619   1624   3396   3425   Ljava/lang/Exception;
        //  1619   1624   30     3456   Any
        //  1633   1637   3396   3425   Ljava/lang/Exception;
        //  1633   1637   30     3456   Any
        //  1639   1644   3396   3425   Ljava/lang/Exception;
        //  1639   1644   30     3456   Any
        //  1646   1651   3396   3425   Ljava/lang/Exception;
        //  1646   1651   30     3456   Any
        //  1653   1658   3396   3425   Ljava/lang/Exception;
        //  1653   1658   30     3456   Any
        //  1667   1671   3396   3425   Ljava/lang/Exception;
        //  1667   1671   30     3456   Any
        //  1673   1678   3396   3425   Ljava/lang/Exception;
        //  1673   1678   30     3456   Any
        //  1680   1685   3396   3425   Ljava/lang/Exception;
        //  1680   1685   30     3456   Any
        //  1687   1692   3396   3425   Ljava/lang/Exception;
        //  1687   1692   30     3456   Any
        //  1708   1712   3396   3425   Ljava/lang/Exception;
        //  1708   1712   30     3456   Any
        //  1714   1719   3396   3425   Ljava/lang/Exception;
        //  1714   1719   30     3456   Any
        //  1721   1726   3396   3425   Ljava/lang/Exception;
        //  1721   1726   30     3456   Any
        //  1728   1733   3396   3425   Ljava/lang/Exception;
        //  1728   1733   30     3456   Any
        //  1763   1766   3396   3425   Ljava/lang/Exception;
        //  1763   1766   30     3456   Any
        //  1776   1781   3396   3425   Ljava/lang/Exception;
        //  1776   1781   30     3456   Any
        //  1781   1785   3396   3425   Ljava/lang/Exception;
        //  1781   1785   30     3456   Any
        //  1787   1792   3396   3425   Ljava/lang/Exception;
        //  1787   1792   30     3456   Any
        //  1794   1799   3396   3425   Ljava/lang/Exception;
        //  1794   1799   30     3456   Any
        //  1809   1813   3396   3425   Ljava/lang/Exception;
        //  1809   1813   30     3456   Any
        //  1815   1820   3396   3425   Ljava/lang/Exception;
        //  1815   1820   30     3456   Any
        //  1822   1827   3396   3425   Ljava/lang/Exception;
        //  1822   1827   30     3456   Any
        //  1841   1845   3396   3425   Ljava/lang/Exception;
        //  1841   1845   30     3456   Any
        //  1847   1852   3396   3425   Ljava/lang/Exception;
        //  1847   1852   30     3456   Any
        //  1854   1859   3396   3425   Ljava/lang/Exception;
        //  1854   1859   30     3456   Any
        //  1867   1872   3396   3425   Ljava/lang/Exception;
        //  1867   1872   30     3456   Any
        //  1874   1878   3396   3425   Ljava/lang/Exception;
        //  1874   1878   30     3456   Any
        //  1880   1885   3396   3425   Ljava/lang/Exception;
        //  1880   1885   30     3456   Any
        //  1889   1894   3396   3425   Ljava/lang/Exception;
        //  1889   1894   30     3456   Any
        //  1894   1898   3396   3425   Ljava/lang/Exception;
        //  1894   1898   30     3456   Any
        //  1900   1905   3396   3425   Ljava/lang/Exception;
        //  1900   1905   30     3456   Any
        //  1909   1913   3396   3425   Ljava/lang/Exception;
        //  1909   1913   30     3456   Any
        //  1913   1918   3396   3425   Ljava/lang/Exception;
        //  1913   1918   30     3456   Any
        //  1925   1930   3396   3425   Ljava/lang/Exception;
        //  1925   1930   30     3456   Any
        //  1930   1935   3396   3425   Ljava/lang/Exception;
        //  1930   1935   30     3456   Any
        //  1942   1947   3396   3425   Ljava/lang/Exception;
        //  1942   1947   30     3456   Any
        //  1947   1951   3396   3425   Ljava/lang/Exception;
        //  1947   1951   30     3456   Any
        //  1953   1958   3396   3425   Ljava/lang/Exception;
        //  1953   1958   30     3456   Any
        //  1962   1967   3396   3425   Ljava/lang/Exception;
        //  1962   1967   30     3456   Any
        //  1987   1991   3396   3425   Ljava/lang/Exception;
        //  1987   1991   30     3456   Any
        //  1993   1998   3396   3425   Ljava/lang/Exception;
        //  1993   1998   30     3456   Any
        //  2000   2005   3396   3425   Ljava/lang/Exception;
        //  2000   2005   30     3456   Any
        //  2007   2012   3396   3425   Ljava/lang/Exception;
        //  2007   2012   30     3456   Any
        //  2049   2054   3396   3425   Ljava/lang/Exception;
        //  2049   2054   30     3456   Any
        //  2061   2065   3396   3425   Ljava/lang/Exception;
        //  2061   2065   30     3456   Any
        //  2067   2072   3396   3425   Ljava/lang/Exception;
        //  2067   2072   30     3456   Any
        //  2074   2079   3396   3425   Ljava/lang/Exception;
        //  2074   2079   30     3456   Any
        //  2084   2089   3396   3425   Ljava/lang/Exception;
        //  2084   2089   30     3456   Any
        //  2091   2095   3396   3425   Ljava/lang/Exception;
        //  2091   2095   30     3456   Any
        //  2097   2102   3396   3425   Ljava/lang/Exception;
        //  2097   2102   30     3456   Any
        //  2104   2109   3396   3425   Ljava/lang/Exception;
        //  2104   2109   30     3456   Any
        //  2114   2119   3396   3425   Ljava/lang/Exception;
        //  2114   2119   30     3456   Any
        //  2128   2132   3396   3425   Ljava/lang/Exception;
        //  2128   2132   30     3456   Any
        //  2134   2139   3396   3425   Ljava/lang/Exception;
        //  2134   2139   30     3456   Any
        //  2141   2146   3396   3425   Ljava/lang/Exception;
        //  2141   2146   30     3456   Any
        //  2148   2153   3396   3425   Ljava/lang/Exception;
        //  2148   2153   30     3456   Any
        //  2162   2166   3396   3425   Ljava/lang/Exception;
        //  2162   2166   30     3456   Any
        //  2168   2173   3396   3425   Ljava/lang/Exception;
        //  2168   2173   30     3456   Any
        //  2175   2180   3396   3425   Ljava/lang/Exception;
        //  2175   2180   30     3456   Any
        //  2182   2187   3396   3425   Ljava/lang/Exception;
        //  2182   2187   30     3456   Any
        //  2203   2207   3396   3425   Ljava/lang/Exception;
        //  2203   2207   30     3456   Any
        //  2209   2214   3396   3425   Ljava/lang/Exception;
        //  2209   2214   30     3456   Any
        //  2216   2221   3396   3425   Ljava/lang/Exception;
        //  2216   2221   30     3456   Any
        //  2223   2228   3396   3425   Ljava/lang/Exception;
        //  2223   2228   30     3456   Any
        //  2237   2241   3396   3425   Ljava/lang/Exception;
        //  2237   2241   30     3456   Any
        //  2243   2248   3396   3425   Ljava/lang/Exception;
        //  2243   2248   30     3456   Any
        //  2250   2255   3396   3425   Ljava/lang/Exception;
        //  2250   2255   30     3456   Any
        //  2257   2262   3396   3425   Ljava/lang/Exception;
        //  2257   2262   30     3456   Any
        //  2271   2275   3396   3425   Ljava/lang/Exception;
        //  2271   2275   30     3456   Any
        //  2277   2282   3396   3425   Ljava/lang/Exception;
        //  2277   2282   30     3456   Any
        //  2284   2289   3396   3425   Ljava/lang/Exception;
        //  2284   2289   30     3456   Any
        //  2291   2296   3396   3425   Ljava/lang/Exception;
        //  2291   2296   30     3456   Any
        //  2312   2316   3396   3425   Ljava/lang/Exception;
        //  2312   2316   30     3456   Any
        //  2318   2323   3396   3425   Ljava/lang/Exception;
        //  2318   2323   30     3456   Any
        //  2325   2330   3396   3425   Ljava/lang/Exception;
        //  2325   2330   30     3456   Any
        //  2332   2337   3396   3425   Ljava/lang/Exception;
        //  2332   2337   30     3456   Any
        //  2367   2370   3396   3425   Ljava/lang/Exception;
        //  2367   2370   30     3456   Any
        //  2380   2385   3396   3425   Ljava/lang/Exception;
        //  2380   2385   30     3456   Any
        //  2385   2389   3396   3425   Ljava/lang/Exception;
        //  2385   2389   30     3456   Any
        //  2391   2396   3396   3425   Ljava/lang/Exception;
        //  2391   2396   30     3456   Any
        //  2398   2403   3396   3425   Ljava/lang/Exception;
        //  2398   2403   30     3456   Any
        //  2405   2408   3396   3425   Ljava/lang/Exception;
        //  2405   2408   30     3456   Any
        //  2410   2415   3396   3425   Ljava/lang/Exception;
        //  2410   2415   30     3456   Any
        //  2424   2428   3396   3425   Ljava/lang/Exception;
        //  2424   2428   30     3456   Any
        //  2430   2435   3396   3425   Ljava/lang/Exception;
        //  2430   2435   30     3456   Any
        //  2437   2442   3396   3425   Ljava/lang/Exception;
        //  2437   2442   30     3456   Any
        //  2452   2456   3396   3425   Ljava/lang/Exception;
        //  2452   2456   30     3456   Any
        //  2458   2463   3396   3425   Ljava/lang/Exception;
        //  2458   2463   30     3456   Any
        //  2465   2470   3396   3425   Ljava/lang/Exception;
        //  2465   2470   30     3456   Any
        //  2484   2488   3396   3425   Ljava/lang/Exception;
        //  2484   2488   30     3456   Any
        //  2490   2495   3396   3425   Ljava/lang/Exception;
        //  2490   2495   30     3456   Any
        //  2497   2502   3396   3425   Ljava/lang/Exception;
        //  2497   2502   30     3456   Any
        //  2510   2515   3396   3425   Ljava/lang/Exception;
        //  2510   2515   30     3456   Any
        //  2517   2521   3396   3425   Ljava/lang/Exception;
        //  2517   2521   30     3456   Any
        //  2523   2528   3396   3425   Ljava/lang/Exception;
        //  2523   2528   30     3456   Any
        //  2532   2537   3396   3425   Ljava/lang/Exception;
        //  2532   2537   30     3456   Any
        //  2537   2541   3396   3425   Ljava/lang/Exception;
        //  2537   2541   30     3456   Any
        //  2543   2548   3396   3425   Ljava/lang/Exception;
        //  2543   2548   30     3456   Any
        //  2552   2556   3396   3425   Ljava/lang/Exception;
        //  2552   2556   30     3456   Any
        //  2556   2561   3396   3425   Ljava/lang/Exception;
        //  2556   2561   30     3456   Any
        //  2568   2573   3396   3425   Ljava/lang/Exception;
        //  2568   2573   30     3456   Any
        //  2573   2578   3396   3425   Ljava/lang/Exception;
        //  2573   2578   30     3456   Any
        //  2585   2590   3396   3425   Ljava/lang/Exception;
        //  2585   2590   30     3456   Any
        //  2590   2594   3396   3425   Ljava/lang/Exception;
        //  2590   2594   30     3456   Any
        //  2596   2601   3396   3425   Ljava/lang/Exception;
        //  2596   2601   30     3456   Any
        //  2605   2610   3396   3425   Ljava/lang/Exception;
        //  2605   2610   30     3456   Any
        //  2642   2646   3396   3425   Ljava/lang/Exception;
        //  2642   2646   30     3456   Any
        //  2648   2653   3396   3425   Ljava/lang/Exception;
        //  2648   2653   30     3456   Any
        //  2657   2662   3396   3425   Ljava/lang/Exception;
        //  2657   2662   30     3456   Any
        //  2662   2666   3396   3425   Ljava/lang/Exception;
        //  2662   2666   30     3456   Any
        //  2668   2673   3396   3425   Ljava/lang/Exception;
        //  2668   2673   30     3456   Any
        //  2675   2680   3396   3425   Ljava/lang/Exception;
        //  2675   2680   30     3456   Any
        //  2690   2694   3396   3425   Ljava/lang/Exception;
        //  2690   2694   30     3456   Any
        //  2696   2701   3396   3425   Ljava/lang/Exception;
        //  2696   2701   30     3456   Any
        //  2703   2708   3396   3425   Ljava/lang/Exception;
        //  2703   2708   30     3456   Any
        //  2722   2726   3396   3425   Ljava/lang/Exception;
        //  2722   2726   30     3456   Any
        //  2728   2733   3396   3425   Ljava/lang/Exception;
        //  2728   2733   30     3456   Any
        //  2735   2740   3396   3425   Ljava/lang/Exception;
        //  2735   2740   30     3456   Any
        //  2750   2755   3396   3425   Ljava/lang/Exception;
        //  2750   2755   30     3456   Any
        //  2757   2761   3396   3425   Ljava/lang/Exception;
        //  2757   2761   30     3456   Any
        //  2763   2768   3396   3425   Ljava/lang/Exception;
        //  2763   2768   30     3456   Any
        //  2772   2777   3396   3425   Ljava/lang/Exception;
        //  2772   2777   30     3456   Any
        //  2777   2782   3396   3425   Ljava/lang/Exception;
        //  2777   2782   30     3456   Any
        //  2789   2794   3396   3425   Ljava/lang/Exception;
        //  2789   2794   30     3456   Any
        //  2794   2799   3396   3425   Ljava/lang/Exception;
        //  2794   2799   30     3456   Any
        //  2806   2811   3396   3425   Ljava/lang/Exception;
        //  2806   2811   30     3456   Any
        //  2811   2815   3396   3425   Ljava/lang/Exception;
        //  2811   2815   30     3456   Any
        //  2817   2822   3396   3425   Ljava/lang/Exception;
        //  2817   2822   30     3456   Any
        //  2826   2831   3396   3425   Ljava/lang/Exception;
        //  2826   2831   30     3456   Any
        //  2839   2843   3396   3425   Ljava/lang/Exception;
        //  2839   2843   30     3456   Any
        //  2845   2850   3396   3425   Ljava/lang/Exception;
        //  2845   2850   30     3456   Any
        //  2852   2857   3396   3425   Ljava/lang/Exception;
        //  2852   2857   30     3456   Any
        //  2859   2862   3396   3425   Ljava/lang/Exception;
        //  2859   2862   30     3456   Any
        //  2864   2869   3396   3425   Ljava/lang/Exception;
        //  2864   2869   30     3456   Any
        //  2886   2890   3396   3425   Ljava/lang/Exception;
        //  2886   2890   30     3456   Any
        //  2892   2897   3396   3425   Ljava/lang/Exception;
        //  2892   2897   30     3456   Any
        //  2899   2903   3396   3425   Ljava/lang/Exception;
        //  2899   2903   30     3456   Any
        //  2910   2914   3396   3425   Ljava/lang/Exception;
        //  2910   2914   30     3456   Any
        //  2916   2920   3396   3425   Ljava/lang/Exception;
        //  2916   2920   30     3456   Any
        //  2922   2927   3396   3425   Ljava/lang/Exception;
        //  2922   2927   30     3456   Any
        //  2929   2934   3396   3425   Ljava/lang/Exception;
        //  2929   2934   30     3456   Any
        //  2936   2940   3396   3425   Ljava/lang/Exception;
        //  2936   2940   30     3456   Any
        //  2942   2947   3396   3425   Ljava/lang/Exception;
        //  2942   2947   30     3456   Any
        //  2949   2954   3396   3425   Ljava/lang/Exception;
        //  2949   2954   30     3456   Any
        //  2972   2977   3396   3425   Ljava/lang/Exception;
        //  2972   2977   30     3456   Any
        //  2980   2984   3396   3425   Ljava/lang/Exception;
        //  2980   2984   30     3456   Any
        //  2986   2991   3396   3425   Ljava/lang/Exception;
        //  2986   2991   30     3456   Any
        //  2993   2998   3396   3425   Ljava/lang/Exception;
        //  2993   2998   30     3456   Any
        //  3000   3003   3396   3425   Ljava/lang/Exception;
        //  3000   3003   30     3456   Any
        //  3005   3010   3396   3425   Ljava/lang/Exception;
        //  3005   3010   30     3456   Any
        //  3019   3023   3396   3425   Ljava/lang/Exception;
        //  3019   3023   30     3456   Any
        //  3025   3030   3396   3425   Ljava/lang/Exception;
        //  3025   3030   30     3456   Any
        //  3032   3037   3396   3425   Ljava/lang/Exception;
        //  3032   3037   30     3456   Any
        //  3044   3048   3396   3425   Ljava/lang/Exception;
        //  3044   3048   30     3456   Any
        //  3050   3055   3396   3425   Ljava/lang/Exception;
        //  3050   3055   30     3456   Any
        //  3057   3061   3396   3425   Ljava/lang/Exception;
        //  3057   3061   30     3456   Any
        //  3068   3072   3396   3425   Ljava/lang/Exception;
        //  3068   3072   30     3456   Any
        //  3074   3078   3396   3425   Ljava/lang/Exception;
        //  3074   3078   30     3456   Any
        //  3080   3085   3396   3425   Ljava/lang/Exception;
        //  3080   3085   30     3456   Any
        //  3087   3092   3396   3425   Ljava/lang/Exception;
        //  3087   3092   30     3456   Any
        //  3094   3098   3396   3425   Ljava/lang/Exception;
        //  3094   3098   30     3456   Any
        //  3100   3105   3396   3425   Ljava/lang/Exception;
        //  3100   3105   30     3456   Any
        //  3107   3112   3396   3425   Ljava/lang/Exception;
        //  3107   3112   30     3456   Any
        //  3114   3118   3396   3425   Ljava/lang/Exception;
        //  3114   3118   30     3456   Any
        //  3120   3125   3396   3425   Ljava/lang/Exception;
        //  3120   3125   30     3456   Any
        //  3127   3132   3396   3425   Ljava/lang/Exception;
        //  3127   3132   30     3456   Any
        //  3146   3151   3396   3425   Ljava/lang/Exception;
        //  3146   3151   30     3456   Any
        //  3154   3158   3396   3425   Ljava/lang/Exception;
        //  3154   3158   30     3456   Any
        //  3160   3165   3396   3425   Ljava/lang/Exception;
        //  3160   3165   30     3456   Any
        //  3167   3171   3396   3425   Ljava/lang/Exception;
        //  3167   3171   30     3456   Any
        //  3178   3182   3396   3425   Ljava/lang/Exception;
        //  3178   3182   30     3456   Any
        //  3184   3188   3396   3425   Ljava/lang/Exception;
        //  3184   3188   30     3456   Any
        //  3190   3195   3396   3425   Ljava/lang/Exception;
        //  3190   3195   30     3456   Any
        //  3197   3202   3396   3425   Ljava/lang/Exception;
        //  3197   3202   30     3456   Any
        //  3204   3208   3396   3425   Ljava/lang/Exception;
        //  3204   3208   30     3456   Any
        //  3210   3215   3396   3425   Ljava/lang/Exception;
        //  3210   3215   30     3456   Any
        //  3217   3222   3396   3425   Ljava/lang/Exception;
        //  3217   3222   30     3456   Any
        //  3224   3228   3396   3425   Ljava/lang/Exception;
        //  3224   3228   30     3456   Any
        //  3230   3235   3396   3425   Ljava/lang/Exception;
        //  3230   3235   30     3456   Any
        //  3237   3242   3396   3425   Ljava/lang/Exception;
        //  3237   3242   30     3456   Any
        //  3256   3261   3396   3425   Ljava/lang/Exception;
        //  3256   3261   30     3456   Any
        //  3264   3268   3396   3425   Ljava/lang/Exception;
        //  3264   3268   30     3456   Any
        //  3270   3275   3396   3425   Ljava/lang/Exception;
        //  3270   3275   30     3456   Any
        //  3277   3281   3396   3425   Ljava/lang/Exception;
        //  3277   3281   30     3456   Any
        //  3288   3292   3396   3425   Ljava/lang/Exception;
        //  3288   3292   30     3456   Any
        //  3294   3298   3396   3425   Ljava/lang/Exception;
        //  3294   3298   30     3456   Any
        //  3300   3305   3396   3425   Ljava/lang/Exception;
        //  3300   3305   30     3456   Any
        //  3307   3312   3396   3425   Ljava/lang/Exception;
        //  3307   3312   30     3456   Any
        //  3314   3318   3396   3425   Ljava/lang/Exception;
        //  3314   3318   30     3456   Any
        //  3320   3325   3396   3425   Ljava/lang/Exception;
        //  3320   3325   30     3456   Any
        //  3327   3332   3396   3425   Ljava/lang/Exception;
        //  3327   3332   30     3456   Any
        //  3349   3354   3396   3425   Ljava/lang/Exception;
        //  3349   3354   30     3456   Any
        //  3354   3358   3396   3425   Ljava/lang/Exception;
        //  3354   3358   30     3456   Any
        //  3360   3365   3396   3425   Ljava/lang/Exception;
        //  3360   3365   30     3456   Any
        //  3367   3372   3396   3425   Ljava/lang/Exception;
        //  3367   3372   30     3456   Any
        //  3372   3376   3425   3426   Ljava/lang/Exception;
        //  3378   3381   3425   3426   Ljava/lang/Exception;
        //  3383   3387   3425   3426   Ljava/lang/Exception;
        //  3389   3393   3425   3426   Ljava/lang/Exception;
        //  3402   3407   30     3456   Any
        //  3407   3411   3425   3426   Ljava/lang/Exception;
        //  3413   3416   3425   3426   Ljava/lang/Exception;
        //  3418   3422   3425   3426   Ljava/lang/Exception;
        //  3427   3431   3452   3456   Ljava/lang/Exception;
        //  3432   3435   3452   3456   Ljava/lang/Exception;
        //  3439   3443   3452   3456   Ljava/lang/Exception;
        //  3444   3449   3452   3456   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1652 out of bounds for length 1652
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:385)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:427)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
