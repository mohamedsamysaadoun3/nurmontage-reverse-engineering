// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$90 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ String val$path;
    
    EngineActivity$90(final EngineActivity this$0, final String val$path) {
        this.this$0 = this$0;
        this.val$path = val$path;
    }
    
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //     4: astore_1       
        //     5: aload_1        
        //     6: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //     9: astore_1       
        //    10: aload_1        
        //    11: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getHeight:()I
        //    14: istore_2       
        //    15: aload_0        
        //    16: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    19: astore_3       
        //    20: aload_3        
        //    21: invokestatic    com/bumptech/glide/Glide.with:(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;
        //    24: astore_3       
        //    25: aload_3        
        //    26: invokevirtual   com/bumptech/glide/RequestManager.asBitmap:()Lcom/bumptech/glide/RequestBuilder;
        //    29: astore_3       
        //    30: aload_0        
        //    31: getfield        hazem/nurmontage/videoquran/EngineActivity$90.val$path:Ljava/lang/String;
        //    34: astore          4
        //    36: aload_3        
        //    37: aload           4
        //    39: invokevirtual   com/bumptech/glide/RequestBuilder.load:(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;
        //    42: astore_3       
        //    43: getstatic       com/bumptech/glide/load/engine/DiskCacheStrategy.NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;
        //    46: astore          4
        //    48: aload_3        
        //    49: aload           4
        //    51: invokevirtual   com/bumptech/glide/RequestBuilder.diskCacheStrategy:(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;
        //    54: astore_3       
        //    55: aload_3        
        //    56: checkcast       Lcom/bumptech/glide/RequestBuilder;
        //    59: astore_3       
        //    60: iconst_1       
        //    61: istore          5
        //    63: ldc             1.4E-45
        //    65: fstore          6
        //    67: aload_3        
        //    68: iload           5
        //    70: invokevirtual   com/bumptech/glide/RequestBuilder.skipMemoryCache:(Z)Lcom/bumptech/glide/request/BaseRequestOptions;
        //    73: astore_3       
        //    74: aload_3        
        //    75: checkcast       Lcom/bumptech/glide/RequestBuilder;
        //    78: astore_3       
        //    79: aload_3        
        //    80: iload_2        
        //    81: iload_2        
        //    82: invokevirtual   com/bumptech/glide/RequestBuilder.override:(II)Lcom/bumptech/glide/request/BaseRequestOptions;
        //    85: astore_1       
        //    86: aload_1        
        //    87: checkcast       Lcom/bumptech/glide/RequestBuilder;
        //    90: astore_1       
        //    91: aload_1        
        //    92: invokevirtual   com/bumptech/glide/RequestBuilder.submit:()Lcom/bumptech/glide/request/FutureTarget;
        //    95: astore_1       
        //    96: aload_1        
        //    97: invokeinterface com/bumptech/glide/request/FutureTarget.get:()Ljava/lang/Object;
        //   102: astore_1       
        //   103: aload_1        
        //   104: checkcast       Landroid/graphics/Bitmap;
        //   107: astore_1       
        //   108: aload_1        
        //   109: ifnonnull       132
        //   112: aload_0        
        //   113: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   116: astore_1       
        //   117: new             Lhazem/nurmontage/videoquran/EngineActivity$90$1;
        //   120: astore_3       
        //   121: aload_3        
        //   122: aload_0        
        //   123: invokespecial   hazem/nurmontage/videoquran/EngineActivity$90$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$90;)V
        //   126: aload_1        
        //   127: aload_3        
        //   128: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   131: return         
        //   132: aload_0        
        //   133: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   136: astore_3       
        //   137: aload_3        
        //   138: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   141: astore_3       
        //   142: aload_3        
        //   143: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   146: istore          7
        //   148: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLACK_LAYER:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   151: astore          4
        //   153: aload           4
        //   155: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   158: istore          5
        //   160: iload           7
        //   162: iload           5
        //   164: if_icmpeq       1325
        //   167: aload_0        
        //   168: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   171: astore_3       
        //   172: aload_3        
        //   173: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   176: astore_3       
        //   177: aload_3        
        //   178: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   181: istore          7
        //   183: getstatic       hazem/nurmontage/videoquran/constant/IpadType.GRADIENT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   186: astore          4
        //   188: aload           4
        //   190: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   193: istore          5
        //   195: iload           7
        //   197: iload           5
        //   199: if_icmpeq       1325
        //   202: aload_0        
        //   203: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   206: astore_3       
        //   207: aload_3        
        //   208: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   211: astore_3       
        //   212: aload_3        
        //   213: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   216: istore          7
        //   218: getstatic       hazem/nurmontage/videoquran/constant/IpadType.MASK_BRUSH:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   221: astore          4
        //   223: aload           4
        //   225: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   228: istore          5
        //   230: iload           7
        //   232: iload           5
        //   234: if_icmpeq       1325
        //   237: aload_0        
        //   238: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   241: astore_3       
        //   242: aload_3        
        //   243: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   246: astore_3       
        //   247: aload_3        
        //   248: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   251: istore          7
        //   253: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLUE_TYPE:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   256: astore          4
        //   258: aload           4
        //   260: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   263: istore          5
        //   265: iload           7
        //   267: iload           5
        //   269: if_icmpeq       1325
        //   272: aload_0        
        //   273: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   276: astore_3       
        //   277: aload_3        
        //   278: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   281: astore_3       
        //   282: aload_3        
        //   283: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   286: istore          7
        //   288: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   291: astore          4
        //   293: aload           4
        //   295: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   298: istore          5
        //   300: iload           7
        //   302: iload           5
        //   304: if_icmpeq       1325
        //   307: aload_0        
        //   308: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   311: astore_3       
        //   312: aload_3        
        //   313: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   316: astore_3       
        //   317: aload_3        
        //   318: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   321: istore          7
        //   323: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG_BLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   326: astore          4
        //   328: aload           4
        //   330: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   333: istore          5
        //   335: iload           7
        //   337: iload           5
        //   339: if_icmpne       345
        //   342: goto            1325
        //   345: aload_0        
        //   346: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   349: astore_3       
        //   350: aload_3        
        //   351: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   354: astore_3       
        //   355: aload_3        
        //   356: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   359: istore          7
        //   361: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   364: astore          4
        //   366: aload           4
        //   368: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   371: istore          5
        //   373: iload           7
        //   375: iload           5
        //   377: if_icmpeq       1206
        //   380: aload_0        
        //   381: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   384: astore_3       
        //   385: aload_3        
        //   386: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   389: astore_3       
        //   390: aload_3        
        //   391: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   394: istore          7
        //   396: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_UNBLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   399: astore          4
        //   401: aload           4
        //   403: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   406: istore          5
        //   408: iload           7
        //   410: iload           5
        //   412: if_icmpeq       1206
        //   415: aload_0        
        //   416: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   419: astore_3       
        //   420: aload_3        
        //   421: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   424: astore_3       
        //   425: aload_3        
        //   426: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   429: istore          7
        //   431: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BOTTOM_RECT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   434: astore          4
        //   436: aload           4
        //   438: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   441: istore          5
        //   443: iload           7
        //   445: iload           5
        //   447: if_icmpeq       1206
        //   450: aload_0        
        //   451: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   454: astore_3       
        //   455: aload_3        
        //   456: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   459: astore_3       
        //   460: aload_3        
        //   461: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   464: istore          7
        //   466: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   469: astore          4
        //   471: aload           4
        //   473: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   476: istore          5
        //   478: iload           7
        //   480: iload           5
        //   482: if_icmpeq       1206
        //   485: aload_0        
        //   486: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   489: astore_3       
        //   490: aload_3        
        //   491: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   494: astore_3       
        //   495: aload_3        
        //   496: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   499: istore          7
        //   501: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_NEOMORPHIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   504: astore          4
        //   506: aload           4
        //   508: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   511: istore          5
        //   513: iload           7
        //   515: iload           5
        //   517: if_icmpeq       1206
        //   520: aload_0        
        //   521: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   524: astore_3       
        //   525: aload_3        
        //   526: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   529: astore_3       
        //   530: aload_3        
        //   531: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //   534: astore_3       
        //   535: aload_3        
        //   536: invokevirtual   android/graphics/RectF.width:()F
        //   539: ldc             0.87530595
        //   541: fmul           
        //   542: fstore          8
        //   544: fload           8
        //   546: f2i            
        //   547: istore          7
        //   549: iload           7
        //   551: i2f            
        //   552: fstore          6
        //   554: ldc             1066443735
        //   556: istore          9
        //   558: ldc             1.13
        //   560: fstore          10
        //   562: fload           6
        //   564: fload           10
        //   566: fmul           
        //   567: fstore          6
        //   569: fload           6
        //   571: f2i            
        //   572: istore          5
        //   574: iload           7
        //   576: iload           5
        //   578: invokestatic    java/lang/Math.min:(II)I
        //   581: i2f            
        //   582: fstore          10
        //   584: ldc             1037905692
        //   586: istore          11
        //   588: ldc             0.10800001
        //   590: fstore          12
        //   592: fload           10
        //   594: fload           12
        //   596: fmul           
        //   597: fstore          10
        //   599: fload           10
        //   601: f2i            
        //   602: istore          9
        //   604: aload_0        
        //   605: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   608: astore          13
        //   610: aload           13
        //   612: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   615: astore          13
        //   617: aload           13
        //   619: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   622: astore          13
        //   624: aload           13
        //   626: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   629: istore          11
        //   631: iload           11
        //   633: i2f            
        //   634: fstore          12
        //   636: aload_0        
        //   637: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   640: astore          14
        //   642: aload           14
        //   644: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   647: astore          14
        //   649: aload           14
        //   651: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //   654: fstore          15
        //   656: fload           12
        //   658: fload           15
        //   660: fmul           
        //   661: fstore          12
        //   663: fload           12
        //   665: invokestatic    java/lang/Math.round:(F)I
        //   668: istore          11
        //   670: aload_0        
        //   671: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   674: astore          14
        //   676: aload           14
        //   678: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   681: astore          14
        //   683: aload           14
        //   685: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   688: astore          14
        //   690: aload           14
        //   692: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   695: istore          16
        //   697: iload           16
        //   699: i2f            
        //   700: fstore          15
        //   702: aload_0        
        //   703: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   706: astore          17
        //   708: aload           17
        //   710: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   713: astore          17
        //   715: aload           17
        //   717: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //   720: fstore          18
        //   722: fload           15
        //   724: fload           18
        //   726: fmul           
        //   727: fstore          15
        //   729: fload           15
        //   731: invokestatic    java/lang/Math.round:(F)I
        //   734: istore          16
        //   736: iload           7
        //   738: iload           11
        //   740: iadd           
        //   741: istore          7
        //   743: aload_0        
        //   744: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   747: astore          17
        //   749: aload           17
        //   751: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   754: astore          17
        //   756: aload           17
        //   758: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   761: astore          17
        //   763: aload           17
        //   765: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   768: istore          19
        //   770: iload           7
        //   772: iload           19
        //   774: if_icmple       839
        //   777: aload_0        
        //   778: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   781: astore          17
        //   783: aload           17
        //   785: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   788: astore          17
        //   790: aload           17
        //   792: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   795: astore          17
        //   797: aload           17
        //   799: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   802: istore          19
        //   804: iload           7
        //   806: iload           19
        //   808: isub           
        //   809: istore          7
        //   811: iload           11
        //   813: iload           7
        //   815: isub           
        //   816: istore          11
        //   818: aload_0        
        //   819: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   822: astore_3       
        //   823: aload_3        
        //   824: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   827: astore_3       
        //   828: aload_3        
        //   829: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   832: astore_3       
        //   833: aload_3        
        //   834: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   837: istore          7
        //   839: iload           5
        //   841: iload           16
        //   843: iadd           
        //   844: istore          5
        //   846: aload_0        
        //   847: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   850: astore          17
        //   852: aload           17
        //   854: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   857: astore          17
        //   859: aload           17
        //   861: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   864: astore          17
        //   866: aload           17
        //   868: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   871: istore          19
        //   873: iload           5
        //   875: iload           19
        //   877: if_icmple       948
        //   880: aload_0        
        //   881: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   884: astore          17
        //   886: aload           17
        //   888: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   891: astore          17
        //   893: aload           17
        //   895: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   898: astore          17
        //   900: aload           17
        //   902: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   905: istore          19
        //   907: iload           5
        //   909: iload           19
        //   911: isub           
        //   912: istore          5
        //   914: iload           16
        //   916: iload           5
        //   918: isub           
        //   919: istore          16
        //   921: aload_0        
        //   922: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   925: astore          4
        //   927: aload           4
        //   929: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   932: astore          4
        //   934: aload           4
        //   936: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   939: astore          4
        //   941: aload           4
        //   943: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   946: istore          5
        //   948: iconst_0       
        //   949: istore          19
        //   951: fconst_0       
        //   952: fstore          18
        //   954: aconst_null    
        //   955: astore          17
        //   957: iload           11
        //   959: ifge            971
        //   962: iconst_0       
        //   963: istore          11
        //   965: aconst_null    
        //   966: astore          13
        //   968: fconst_0       
        //   969: fstore          12
        //   971: iload           16
        //   973: ifge            985
        //   976: iconst_0       
        //   977: istore          16
        //   979: aconst_null    
        //   980: astore          14
        //   982: fconst_0       
        //   983: fstore          15
        //   985: new             Landroid/graphics/Rect;
        //   988: astore          17
        //   990: aload           17
        //   992: iload           11
        //   994: iload           16
        //   996: iload           7
        //   998: iload           5
        //  1000: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  1003: aload_0        
        //  1004: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1007: astore_3       
        //  1008: aload_3        
        //  1009: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1012: astore_3       
        //  1013: aload_3        
        //  1014: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1017: astore_3       
        //  1018: aload_3        
        //  1019: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1022: istore          7
        //  1024: iload           7
        //  1026: i2f            
        //  1027: fstore          8
        //  1029: aload_0        
        //  1030: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1033: astore          4
        //  1035: aload           4
        //  1037: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1040: astore          4
        //  1042: aload           4
        //  1044: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  1047: fstore          6
        //  1049: fload           8
        //  1051: fload           6
        //  1053: fmul           
        //  1054: fstore          8
        //  1056: fload           8
        //  1058: f2i            
        //  1059: istore          7
        //  1061: aload_0        
        //  1062: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1065: astore          4
        //  1067: aload           4
        //  1069: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1072: astore          4
        //  1074: aload           4
        //  1076: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1079: astore          4
        //  1081: aload           4
        //  1083: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1086: istore          5
        //  1088: iload           5
        //  1090: i2f            
        //  1091: fstore          6
        //  1093: aload_0        
        //  1094: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1097: astore          13
        //  1099: aload           13
        //  1101: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1104: astore          13
        //  1106: aload           13
        //  1108: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  1111: fstore          12
        //  1113: fload           6
        //  1115: fload           12
        //  1117: fmul           
        //  1118: fstore          6
        //  1120: fload           6
        //  1122: f2i            
        //  1123: istore          5
        //  1125: aload_1        
        //  1126: aload           17
        //  1128: iload           9
        //  1130: iload           7
        //  1132: iload           5
        //  1134: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCorners:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  1137: astore_1       
        //  1138: aload_0        
        //  1139: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1142: astore          20
        //  1144: aload           20
        //  1146: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1149: astore          20
        //  1151: aload           20
        //  1153: aload_1        
        //  1154: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  1157: aload           17
        //  1159: getfield        android/graphics/Rect.left:I
        //  1162: iload           7
        //  1164: iadd           
        //  1165: istore_2       
        //  1166: aload           17
        //  1168: iload_2        
        //  1169: putfield        android/graphics/Rect.right:I
        //  1172: aload           17
        //  1174: getfield        android/graphics/Rect.top:I
        //  1177: iload           5
        //  1179: iadd           
        //  1180: istore_2       
        //  1181: aload           17
        //  1183: iload_2        
        //  1184: putfield        android/graphics/Rect.bottom:I
        //  1187: aload_0        
        //  1188: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1191: astore_1       
        //  1192: aload_1        
        //  1193: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1196: astore_1       
        //  1197: aload_1        
        //  1198: aload           17
        //  1200: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  1203: goto            1551
        //  1206: aload_0        
        //  1207: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1210: astore_3       
        //  1211: aload_3        
        //  1212: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1215: astore_3       
        //  1216: aload_3        
        //  1217: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getRectSquare:()Landroid/graphics/Rect;
        //  1220: astore_3       
        //  1221: aload_0        
        //  1222: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1225: astore          4
        //  1227: aload           4
        //  1229: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1232: astore          4
        //  1234: aload           4
        //  1236: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getRadius_square:()I
        //  1239: istore          5
        //  1241: aload_0        
        //  1242: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1245: astore          20
        //  1247: aload           20
        //  1249: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1252: astore          20
        //  1254: aload           20
        //  1256: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapSquare:()Landroid/graphics/Bitmap;
        //  1259: astore          20
        //  1261: aload           20
        //  1263: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1266: istore          9
        //  1268: aload_0        
        //  1269: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1272: astore          13
        //  1274: aload           13
        //  1276: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1279: astore          13
        //  1281: aload           13
        //  1283: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapSquare:()Landroid/graphics/Bitmap;
        //  1286: astore          13
        //  1288: aload           13
        //  1290: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1293: istore          11
        //  1295: aload_1        
        //  1296: aload_3        
        //  1297: iload           5
        //  1299: iload           9
        //  1301: iload           11
        //  1303: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCornersPlusScale:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  1306: astore_1       
        //  1307: aload_0        
        //  1308: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1311: astore_3       
        //  1312: aload_3        
        //  1313: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1316: astore_3       
        //  1317: aload_3        
        //  1318: aload_1        
        //  1319: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  1322: goto            1551
        //  1325: aload_0        
        //  1326: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1329: astore_3       
        //  1330: aload_3        
        //  1331: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1334: astore_3       
        //  1335: aload_3        
        //  1336: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  1339: istore          7
        //  1341: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SOCIAL_STORY:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //  1344: astore          4
        //  1346: aload           4
        //  1348: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //  1351: istore          5
        //  1353: iload           7
        //  1355: iload           5
        //  1357: if_icmpne       1408
        //  1360: aload_0        
        //  1361: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1364: astore_3       
        //  1365: aload_3        
        //  1366: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1369: astore_3       
        //  1370: aload_3        
        //  1371: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //  1374: istore          7
        //  1376: aload_0        
        //  1377: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1380: astore          4
        //  1382: aload           4
        //  1384: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1387: astore          4
        //  1389: aload           4
        //  1391: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //  1394: istore          5
        //  1396: aload_1        
        //  1397: iload           7
        //  1399: iload           5
        //  1401: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo9x16:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  1404: astore_1       
        //  1405: goto            1536
        //  1408: aload_0        
        //  1409: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1412: astore_3       
        //  1413: aload_3        
        //  1414: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1417: astore_3       
        //  1418: aload_3        
        //  1419: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //  1422: istore          7
        //  1424: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SQUARE:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //  1427: astore          4
        //  1429: aload           4
        //  1431: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //  1434: istore          5
        //  1436: iload           7
        //  1438: iload           5
        //  1440: if_icmpne       1491
        //  1443: aload_0        
        //  1444: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1447: astore_3       
        //  1448: aload_3        
        //  1449: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1452: astore_3       
        //  1453: aload_3        
        //  1454: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //  1457: istore          7
        //  1459: aload_0        
        //  1460: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1463: astore          4
        //  1465: aload           4
        //  1467: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1470: astore          4
        //  1472: aload           4
        //  1474: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //  1477: istore          5
        //  1479: aload_1        
        //  1480: iload           7
        //  1482: iload           5
        //  1484: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo1x1:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  1487: astore_1       
        //  1488: goto            1536
        //  1491: aload_0        
        //  1492: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1495: astore_3       
        //  1496: aload_3        
        //  1497: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1500: astore_3       
        //  1501: aload_3        
        //  1502: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //  1505: istore          7
        //  1507: aload_0        
        //  1508: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1511: astore          4
        //  1513: aload           4
        //  1515: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1518: astore          4
        //  1520: aload           4
        //  1522: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //  1525: istore          5
        //  1527: aload_1        
        //  1528: iload           7
        //  1530: iload           5
        //  1532: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo16x9:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  1535: astore_1       
        //  1536: aload_0        
        //  1537: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1540: astore_3       
        //  1541: aload_3        
        //  1542: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1545: astore_3       
        //  1546: aload_3        
        //  1547: aload_1        
        //  1548: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  1551: aload_0        
        //  1552: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1555: astore_1       
        //  1556: new             Lhazem/nurmontage/videoquran/EngineActivity$90$1;
        //  1559: astore_3       
        //  1560: aload_3        
        //  1561: aload_0        
        //  1562: invokespecial   hazem/nurmontage/videoquran/EngineActivity$90$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$90;)V
        //  1565: goto            1591
        //  1568: astore_1       
        //  1569: goto            1597
        //  1572: astore_1       
        //  1573: aload_1        
        //  1574: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  1577: aload_0        
        //  1578: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1581: astore_1       
        //  1582: new             Lhazem/nurmontage/videoquran/EngineActivity$90$1;
        //  1585: astore_3       
        //  1586: aload_3        
        //  1587: aload_0        
        //  1588: invokespecial   hazem/nurmontage/videoquran/EngineActivity$90$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$90;)V
        //  1591: aload_1        
        //  1592: aload_3        
        //  1593: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  1596: return         
        //  1597: aload_0        
        //  1598: getfield        hazem/nurmontage/videoquran/EngineActivity$90.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1601: astore_3       
        //  1602: new             Lhazem/nurmontage/videoquran/EngineActivity$90$1;
        //  1605: astore          4
        //  1607: aload           4
        //  1609: aload_0        
        //  1610: invokespecial   hazem/nurmontage/videoquran/EngineActivity$90$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$90;)V
        //  1613: aload_3        
        //  1614: aload           4
        //  1616: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  1619: aload_1        
        //  1620: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      4      1572   1591   Ljava/lang/Exception;
        //  0      4      1568   1572   Any
        //  5      9      1572   1591   Ljava/lang/Exception;
        //  5      9      1568   1572   Any
        //  10     14     1572   1591   Ljava/lang/Exception;
        //  10     14     1568   1572   Any
        //  15     19     1572   1591   Ljava/lang/Exception;
        //  15     19     1568   1572   Any
        //  20     24     1572   1591   Ljava/lang/Exception;
        //  20     24     1568   1572   Any
        //  25     29     1572   1591   Ljava/lang/Exception;
        //  25     29     1568   1572   Any
        //  30     34     1572   1591   Ljava/lang/Exception;
        //  30     34     1568   1572   Any
        //  37     42     1572   1591   Ljava/lang/Exception;
        //  37     42     1568   1572   Any
        //  43     46     1572   1591   Ljava/lang/Exception;
        //  43     46     1568   1572   Any
        //  49     54     1572   1591   Ljava/lang/Exception;
        //  49     54     1568   1572   Any
        //  55     59     1572   1591   Ljava/lang/Exception;
        //  55     59     1568   1572   Any
        //  68     73     1572   1591   Ljava/lang/Exception;
        //  68     73     1568   1572   Any
        //  74     78     1572   1591   Ljava/lang/Exception;
        //  74     78     1568   1572   Any
        //  81     85     1572   1591   Ljava/lang/Exception;
        //  81     85     1568   1572   Any
        //  86     90     1572   1591   Ljava/lang/Exception;
        //  86     90     1568   1572   Any
        //  91     95     1572   1591   Ljava/lang/Exception;
        //  91     95     1568   1572   Any
        //  96     102    1572   1591   Ljava/lang/Exception;
        //  96     102    1568   1572   Any
        //  103    107    1572   1591   Ljava/lang/Exception;
        //  103    107    1568   1572   Any
        //  132    136    1572   1591   Ljava/lang/Exception;
        //  132    136    1568   1572   Any
        //  137    141    1572   1591   Ljava/lang/Exception;
        //  137    141    1568   1572   Any
        //  142    146    1572   1591   Ljava/lang/Exception;
        //  142    146    1568   1572   Any
        //  148    151    1572   1591   Ljava/lang/Exception;
        //  148    151    1568   1572   Any
        //  153    158    1572   1591   Ljava/lang/Exception;
        //  153    158    1568   1572   Any
        //  167    171    1572   1591   Ljava/lang/Exception;
        //  167    171    1568   1572   Any
        //  172    176    1572   1591   Ljava/lang/Exception;
        //  172    176    1568   1572   Any
        //  177    181    1572   1591   Ljava/lang/Exception;
        //  177    181    1568   1572   Any
        //  183    186    1572   1591   Ljava/lang/Exception;
        //  183    186    1568   1572   Any
        //  188    193    1572   1591   Ljava/lang/Exception;
        //  188    193    1568   1572   Any
        //  202    206    1572   1591   Ljava/lang/Exception;
        //  202    206    1568   1572   Any
        //  207    211    1572   1591   Ljava/lang/Exception;
        //  207    211    1568   1572   Any
        //  212    216    1572   1591   Ljava/lang/Exception;
        //  212    216    1568   1572   Any
        //  218    221    1572   1591   Ljava/lang/Exception;
        //  218    221    1568   1572   Any
        //  223    228    1572   1591   Ljava/lang/Exception;
        //  223    228    1568   1572   Any
        //  237    241    1572   1591   Ljava/lang/Exception;
        //  237    241    1568   1572   Any
        //  242    246    1572   1591   Ljava/lang/Exception;
        //  242    246    1568   1572   Any
        //  247    251    1572   1591   Ljava/lang/Exception;
        //  247    251    1568   1572   Any
        //  253    256    1572   1591   Ljava/lang/Exception;
        //  253    256    1568   1572   Any
        //  258    263    1572   1591   Ljava/lang/Exception;
        //  258    263    1568   1572   Any
        //  272    276    1572   1591   Ljava/lang/Exception;
        //  272    276    1568   1572   Any
        //  277    281    1572   1591   Ljava/lang/Exception;
        //  277    281    1568   1572   Any
        //  282    286    1572   1591   Ljava/lang/Exception;
        //  282    286    1568   1572   Any
        //  288    291    1572   1591   Ljava/lang/Exception;
        //  288    291    1568   1572   Any
        //  293    298    1572   1591   Ljava/lang/Exception;
        //  293    298    1568   1572   Any
        //  307    311    1572   1591   Ljava/lang/Exception;
        //  307    311    1568   1572   Any
        //  312    316    1572   1591   Ljava/lang/Exception;
        //  312    316    1568   1572   Any
        //  317    321    1572   1591   Ljava/lang/Exception;
        //  317    321    1568   1572   Any
        //  323    326    1572   1591   Ljava/lang/Exception;
        //  323    326    1568   1572   Any
        //  328    333    1572   1591   Ljava/lang/Exception;
        //  328    333    1568   1572   Any
        //  345    349    1572   1591   Ljava/lang/Exception;
        //  345    349    1568   1572   Any
        //  350    354    1572   1591   Ljava/lang/Exception;
        //  350    354    1568   1572   Any
        //  355    359    1572   1591   Ljava/lang/Exception;
        //  355    359    1568   1572   Any
        //  361    364    1572   1591   Ljava/lang/Exception;
        //  361    364    1568   1572   Any
        //  366    371    1572   1591   Ljava/lang/Exception;
        //  366    371    1568   1572   Any
        //  380    384    1572   1591   Ljava/lang/Exception;
        //  380    384    1568   1572   Any
        //  385    389    1572   1591   Ljava/lang/Exception;
        //  385    389    1568   1572   Any
        //  390    394    1572   1591   Ljava/lang/Exception;
        //  390    394    1568   1572   Any
        //  396    399    1572   1591   Ljava/lang/Exception;
        //  396    399    1568   1572   Any
        //  401    406    1572   1591   Ljava/lang/Exception;
        //  401    406    1568   1572   Any
        //  415    419    1572   1591   Ljava/lang/Exception;
        //  415    419    1568   1572   Any
        //  420    424    1572   1591   Ljava/lang/Exception;
        //  420    424    1568   1572   Any
        //  425    429    1572   1591   Ljava/lang/Exception;
        //  425    429    1568   1572   Any
        //  431    434    1572   1591   Ljava/lang/Exception;
        //  431    434    1568   1572   Any
        //  436    441    1572   1591   Ljava/lang/Exception;
        //  436    441    1568   1572   Any
        //  450    454    1572   1591   Ljava/lang/Exception;
        //  450    454    1568   1572   Any
        //  455    459    1572   1591   Ljava/lang/Exception;
        //  455    459    1568   1572   Any
        //  460    464    1572   1591   Ljava/lang/Exception;
        //  460    464    1568   1572   Any
        //  466    469    1572   1591   Ljava/lang/Exception;
        //  466    469    1568   1572   Any
        //  471    476    1572   1591   Ljava/lang/Exception;
        //  471    476    1568   1572   Any
        //  485    489    1572   1591   Ljava/lang/Exception;
        //  485    489    1568   1572   Any
        //  490    494    1572   1591   Ljava/lang/Exception;
        //  490    494    1568   1572   Any
        //  495    499    1572   1591   Ljava/lang/Exception;
        //  495    499    1568   1572   Any
        //  501    504    1572   1591   Ljava/lang/Exception;
        //  501    504    1568   1572   Any
        //  506    511    1572   1591   Ljava/lang/Exception;
        //  506    511    1568   1572   Any
        //  520    524    1572   1591   Ljava/lang/Exception;
        //  520    524    1568   1572   Any
        //  525    529    1572   1591   Ljava/lang/Exception;
        //  525    529    1568   1572   Any
        //  530    534    1572   1591   Ljava/lang/Exception;
        //  530    534    1568   1572   Any
        //  535    539    1572   1591   Ljava/lang/Exception;
        //  535    539    1568   1572   Any
        //  576    581    1572   1591   Ljava/lang/Exception;
        //  576    581    1568   1572   Any
        //  604    608    1572   1591   Ljava/lang/Exception;
        //  604    608    1568   1572   Any
        //  610    615    1572   1591   Ljava/lang/Exception;
        //  610    615    1568   1572   Any
        //  617    622    1572   1591   Ljava/lang/Exception;
        //  617    622    1568   1572   Any
        //  624    629    1572   1591   Ljava/lang/Exception;
        //  624    629    1568   1572   Any
        //  636    640    1572   1591   Ljava/lang/Exception;
        //  636    640    1568   1572   Any
        //  642    647    1572   1591   Ljava/lang/Exception;
        //  642    647    1568   1572   Any
        //  649    654    1572   1591   Ljava/lang/Exception;
        //  649    654    1568   1572   Any
        //  663    668    1572   1591   Ljava/lang/Exception;
        //  663    668    1568   1572   Any
        //  670    674    1572   1591   Ljava/lang/Exception;
        //  670    674    1568   1572   Any
        //  676    681    1572   1591   Ljava/lang/Exception;
        //  676    681    1568   1572   Any
        //  683    688    1572   1591   Ljava/lang/Exception;
        //  683    688    1568   1572   Any
        //  690    695    1572   1591   Ljava/lang/Exception;
        //  690    695    1568   1572   Any
        //  702    706    1572   1591   Ljava/lang/Exception;
        //  702    706    1568   1572   Any
        //  708    713    1572   1591   Ljava/lang/Exception;
        //  708    713    1568   1572   Any
        //  715    720    1572   1591   Ljava/lang/Exception;
        //  715    720    1568   1572   Any
        //  729    734    1572   1591   Ljava/lang/Exception;
        //  729    734    1568   1572   Any
        //  743    747    1572   1591   Ljava/lang/Exception;
        //  743    747    1568   1572   Any
        //  749    754    1572   1591   Ljava/lang/Exception;
        //  749    754    1568   1572   Any
        //  756    761    1572   1591   Ljava/lang/Exception;
        //  756    761    1568   1572   Any
        //  763    768    1572   1591   Ljava/lang/Exception;
        //  763    768    1568   1572   Any
        //  777    781    1572   1591   Ljava/lang/Exception;
        //  777    781    1568   1572   Any
        //  783    788    1572   1591   Ljava/lang/Exception;
        //  783    788    1568   1572   Any
        //  790    795    1572   1591   Ljava/lang/Exception;
        //  790    795    1568   1572   Any
        //  797    802    1572   1591   Ljava/lang/Exception;
        //  797    802    1568   1572   Any
        //  818    822    1572   1591   Ljava/lang/Exception;
        //  818    822    1568   1572   Any
        //  823    827    1572   1591   Ljava/lang/Exception;
        //  823    827    1568   1572   Any
        //  828    832    1572   1591   Ljava/lang/Exception;
        //  828    832    1568   1572   Any
        //  833    837    1572   1591   Ljava/lang/Exception;
        //  833    837    1568   1572   Any
        //  846    850    1572   1591   Ljava/lang/Exception;
        //  846    850    1568   1572   Any
        //  852    857    1572   1591   Ljava/lang/Exception;
        //  852    857    1568   1572   Any
        //  859    864    1572   1591   Ljava/lang/Exception;
        //  859    864    1568   1572   Any
        //  866    871    1572   1591   Ljava/lang/Exception;
        //  866    871    1568   1572   Any
        //  880    884    1572   1591   Ljava/lang/Exception;
        //  880    884    1568   1572   Any
        //  886    891    1572   1591   Ljava/lang/Exception;
        //  886    891    1568   1572   Any
        //  893    898    1572   1591   Ljava/lang/Exception;
        //  893    898    1568   1572   Any
        //  900    905    1572   1591   Ljava/lang/Exception;
        //  900    905    1568   1572   Any
        //  921    925    1572   1591   Ljava/lang/Exception;
        //  921    925    1568   1572   Any
        //  927    932    1572   1591   Ljava/lang/Exception;
        //  927    932    1568   1572   Any
        //  934    939    1572   1591   Ljava/lang/Exception;
        //  934    939    1568   1572   Any
        //  941    946    1572   1591   Ljava/lang/Exception;
        //  941    946    1568   1572   Any
        //  985    988    1572   1591   Ljava/lang/Exception;
        //  985    988    1568   1572   Any
        //  998    1003   1572   1591   Ljava/lang/Exception;
        //  998    1003   1568   1572   Any
        //  1003   1007   1572   1591   Ljava/lang/Exception;
        //  1003   1007   1568   1572   Any
        //  1008   1012   1572   1591   Ljava/lang/Exception;
        //  1008   1012   1568   1572   Any
        //  1013   1017   1572   1591   Ljava/lang/Exception;
        //  1013   1017   1568   1572   Any
        //  1018   1022   1572   1591   Ljava/lang/Exception;
        //  1018   1022   1568   1572   Any
        //  1029   1033   1572   1591   Ljava/lang/Exception;
        //  1029   1033   1568   1572   Any
        //  1035   1040   1572   1591   Ljava/lang/Exception;
        //  1035   1040   1568   1572   Any
        //  1042   1047   1572   1591   Ljava/lang/Exception;
        //  1042   1047   1568   1572   Any
        //  1061   1065   1572   1591   Ljava/lang/Exception;
        //  1061   1065   1568   1572   Any
        //  1067   1072   1572   1591   Ljava/lang/Exception;
        //  1067   1072   1568   1572   Any
        //  1074   1079   1572   1591   Ljava/lang/Exception;
        //  1074   1079   1568   1572   Any
        //  1081   1086   1572   1591   Ljava/lang/Exception;
        //  1081   1086   1568   1572   Any
        //  1093   1097   1572   1591   Ljava/lang/Exception;
        //  1093   1097   1568   1572   Any
        //  1099   1104   1572   1591   Ljava/lang/Exception;
        //  1099   1104   1568   1572   Any
        //  1106   1111   1572   1591   Ljava/lang/Exception;
        //  1106   1111   1568   1572   Any
        //  1132   1137   1572   1591   Ljava/lang/Exception;
        //  1132   1137   1568   1572   Any
        //  1138   1142   1572   1591   Ljava/lang/Exception;
        //  1138   1142   1568   1572   Any
        //  1144   1149   1572   1591   Ljava/lang/Exception;
        //  1144   1149   1568   1572   Any
        //  1153   1157   1572   1591   Ljava/lang/Exception;
        //  1153   1157   1568   1572   Any
        //  1157   1162   1572   1591   Ljava/lang/Exception;
        //  1157   1162   1568   1572   Any
        //  1168   1172   1572   1591   Ljava/lang/Exception;
        //  1168   1172   1568   1572   Any
        //  1172   1177   1572   1591   Ljava/lang/Exception;
        //  1172   1177   1568   1572   Any
        //  1183   1187   1572   1591   Ljava/lang/Exception;
        //  1183   1187   1568   1572   Any
        //  1187   1191   1572   1591   Ljava/lang/Exception;
        //  1187   1191   1568   1572   Any
        //  1192   1196   1572   1591   Ljava/lang/Exception;
        //  1192   1196   1568   1572   Any
        //  1198   1203   1572   1591   Ljava/lang/Exception;
        //  1198   1203   1568   1572   Any
        //  1206   1210   1572   1591   Ljava/lang/Exception;
        //  1206   1210   1568   1572   Any
        //  1211   1215   1572   1591   Ljava/lang/Exception;
        //  1211   1215   1568   1572   Any
        //  1216   1220   1572   1591   Ljava/lang/Exception;
        //  1216   1220   1568   1572   Any
        //  1221   1225   1572   1591   Ljava/lang/Exception;
        //  1221   1225   1568   1572   Any
        //  1227   1232   1572   1591   Ljava/lang/Exception;
        //  1227   1232   1568   1572   Any
        //  1234   1239   1572   1591   Ljava/lang/Exception;
        //  1234   1239   1568   1572   Any
        //  1241   1245   1572   1591   Ljava/lang/Exception;
        //  1241   1245   1568   1572   Any
        //  1247   1252   1572   1591   Ljava/lang/Exception;
        //  1247   1252   1568   1572   Any
        //  1254   1259   1572   1591   Ljava/lang/Exception;
        //  1254   1259   1568   1572   Any
        //  1261   1266   1572   1591   Ljava/lang/Exception;
        //  1261   1266   1568   1572   Any
        //  1268   1272   1572   1591   Ljava/lang/Exception;
        //  1268   1272   1568   1572   Any
        //  1274   1279   1572   1591   Ljava/lang/Exception;
        //  1274   1279   1568   1572   Any
        //  1281   1286   1572   1591   Ljava/lang/Exception;
        //  1281   1286   1568   1572   Any
        //  1288   1293   1572   1591   Ljava/lang/Exception;
        //  1288   1293   1568   1572   Any
        //  1301   1306   1572   1591   Ljava/lang/Exception;
        //  1301   1306   1568   1572   Any
        //  1307   1311   1572   1591   Ljava/lang/Exception;
        //  1307   1311   1568   1572   Any
        //  1312   1316   1572   1591   Ljava/lang/Exception;
        //  1312   1316   1568   1572   Any
        //  1318   1322   1572   1591   Ljava/lang/Exception;
        //  1318   1322   1568   1572   Any
        //  1325   1329   1572   1591   Ljava/lang/Exception;
        //  1325   1329   1568   1572   Any
        //  1330   1334   1572   1591   Ljava/lang/Exception;
        //  1330   1334   1568   1572   Any
        //  1335   1339   1572   1591   Ljava/lang/Exception;
        //  1335   1339   1568   1572   Any
        //  1341   1344   1572   1591   Ljava/lang/Exception;
        //  1341   1344   1568   1572   Any
        //  1346   1351   1572   1591   Ljava/lang/Exception;
        //  1346   1351   1568   1572   Any
        //  1360   1364   1572   1591   Ljava/lang/Exception;
        //  1360   1364   1568   1572   Any
        //  1365   1369   1572   1591   Ljava/lang/Exception;
        //  1365   1369   1568   1572   Any
        //  1370   1374   1572   1591   Ljava/lang/Exception;
        //  1370   1374   1568   1572   Any
        //  1376   1380   1572   1591   Ljava/lang/Exception;
        //  1376   1380   1568   1572   Any
        //  1382   1387   1572   1591   Ljava/lang/Exception;
        //  1382   1387   1568   1572   Any
        //  1389   1394   1572   1591   Ljava/lang/Exception;
        //  1389   1394   1568   1572   Any
        //  1399   1404   1572   1591   Ljava/lang/Exception;
        //  1399   1404   1568   1572   Any
        //  1408   1412   1572   1591   Ljava/lang/Exception;
        //  1408   1412   1568   1572   Any
        //  1413   1417   1572   1591   Ljava/lang/Exception;
        //  1413   1417   1568   1572   Any
        //  1418   1422   1572   1591   Ljava/lang/Exception;
        //  1418   1422   1568   1572   Any
        //  1424   1427   1572   1591   Ljava/lang/Exception;
        //  1424   1427   1568   1572   Any
        //  1429   1434   1572   1591   Ljava/lang/Exception;
        //  1429   1434   1568   1572   Any
        //  1443   1447   1572   1591   Ljava/lang/Exception;
        //  1443   1447   1568   1572   Any
        //  1448   1452   1572   1591   Ljava/lang/Exception;
        //  1448   1452   1568   1572   Any
        //  1453   1457   1572   1591   Ljava/lang/Exception;
        //  1453   1457   1568   1572   Any
        //  1459   1463   1572   1591   Ljava/lang/Exception;
        //  1459   1463   1568   1572   Any
        //  1465   1470   1572   1591   Ljava/lang/Exception;
        //  1465   1470   1568   1572   Any
        //  1472   1477   1572   1591   Ljava/lang/Exception;
        //  1472   1477   1568   1572   Any
        //  1482   1487   1572   1591   Ljava/lang/Exception;
        //  1482   1487   1568   1572   Any
        //  1491   1495   1572   1591   Ljava/lang/Exception;
        //  1491   1495   1568   1572   Any
        //  1496   1500   1572   1591   Ljava/lang/Exception;
        //  1496   1500   1568   1572   Any
        //  1501   1505   1572   1591   Ljava/lang/Exception;
        //  1501   1505   1568   1572   Any
        //  1507   1511   1572   1591   Ljava/lang/Exception;
        //  1507   1511   1568   1572   Any
        //  1513   1518   1572   1591   Ljava/lang/Exception;
        //  1513   1518   1568   1572   Any
        //  1520   1525   1572   1591   Ljava/lang/Exception;
        //  1520   1525   1568   1572   Any
        //  1530   1535   1572   1591   Ljava/lang/Exception;
        //  1530   1535   1568   1572   Any
        //  1536   1540   1572   1591   Ljava/lang/Exception;
        //  1536   1540   1568   1572   Any
        //  1541   1545   1572   1591   Ljava/lang/Exception;
        //  1541   1545   1568   1572   Any
        //  1547   1551   1572   1591   Ljava/lang/Exception;
        //  1547   1551   1568   1572   Any
        //  1573   1577   1568   1572   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1551:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
