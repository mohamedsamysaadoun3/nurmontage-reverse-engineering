// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$78$1 implements Runnable
{
    final /* synthetic */ EngineActivity$78 this$1;
    final /* synthetic */ int val$resize;
    final /* synthetic */ String val$str;
    
    EngineActivity$78$1(final EngineActivity$78 this$1, final int val$resize, final String val$str) {
        this.this$1 = this$1;
        this.val$resize = val$resize;
        this.val$str = val$str;
    }
    
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: ldc             "init "
        //     4: astore_2       
        //     5: aload_0        
        //     6: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //     9: astore_3       
        //    10: aload_3        
        //    11: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    14: astore_3       
        //    15: aload_3        
        //    16: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //    19: astore_3       
        //    20: aload_3        
        //    21: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.reset:()V
        //    24: aload_0        
        //    25: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //    28: astore_3       
        //    29: aload_3        
        //    30: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    33: astore_3       
        //    34: aload_3        
        //    35: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //    38: astore_3       
        //    39: aload_0        
        //    40: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //    43: istore          4
        //    45: aload_3        
        //    46: iload           4
        //    48: invokevirtual   hazem/nurmontage/videoquran/model/Template.setResizeType:(I)V
        //    51: aload_0        
        //    52: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //    55: astore_3       
        //    56: aload_3        
        //    57: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    60: astore_3       
        //    61: aload_3        
        //    62: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //    65: astore_3       
        //    66: aload_0        
        //    67: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$str:Ljava/lang/String;
        //    70: astore          5
        //    72: aload_3        
        //    73: aload           5
        //    75: invokevirtual   hazem/nurmontage/videoquran/model/Template.setImgResize:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //    82: istore          6
        //    84: aload_0        
        //    85: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //    88: astore          5
        //    90: aload           5
        //    92: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //    95: astore          5
        //    97: aload           5
        //    99: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   102: astore          5
        //   104: aload           5
        //   106: invokevirtual   hazem/nurmontage/videoquran/model/Template.getResolution:()Ljava/lang/String;
        //   109: astore          5
        //   111: iload           6
        //   113: aload           5
        //   115: invokestatic    hazem/nurmontage/videoquran/Utils/AspectRatioCalculator.getSize:(ILjava/lang/String;)Lkotlin/Pair;
        //   118: astore_3       
        //   119: aload_0        
        //   120: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   123: astore          5
        //   125: aload           5
        //   127: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   130: astore          5
        //   132: aload           5
        //   134: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   137: astore          5
        //   139: aload_3        
        //   140: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   143: astore          7
        //   145: aload           7
        //   147: checkcast       Ljava/lang/Integer;
        //   150: astore          7
        //   152: aload           7
        //   154: invokevirtual   java/lang/Integer.intValue:()I
        //   157: istore          8
        //   159: aload_3        
        //   160: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   163: astore_3       
        //   164: aload_3        
        //   165: checkcast       Ljava/lang/Integer;
        //   168: astore_3       
        //   169: aload_3        
        //   170: invokevirtual   java/lang/Integer.intValue:()I
        //   173: istore          6
        //   175: aload           5
        //   177: iload           8
        //   179: iload           6
        //   181: invokevirtual   hazem/nurmontage/videoquran/model/Template.setWidthAndHeight:(II)V
        //   184: aload_0        
        //   185: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   188: astore_3       
        //   189: aload_3        
        //   190: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   193: astore_3       
        //   194: aload_3        
        //   195: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   198: astore_3       
        //   199: aload_0        
        //   200: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   203: astore          5
        //   205: aload           5
        //   207: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   210: astore          5
        //   212: aload           5
        //   214: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   217: astore          5
        //   219: aload           5
        //   221: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getWidth:()I
        //   224: istore          4
        //   226: aload_0        
        //   227: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   230: astore          7
        //   232: aload           7
        //   234: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   237: astore          7
        //   239: aload           7
        //   241: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   244: astore          7
        //   246: aload           7
        //   248: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getHeight:()I
        //   251: istore          8
        //   253: aload_0        
        //   254: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //   257: istore          9
        //   259: aload_3        
        //   260: iload           4
        //   262: iload           8
        //   264: iload           9
        //   266: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.initCanvasDimension:(III)V
        //   269: aload_0        
        //   270: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   273: astore_3       
        //   274: aload_3        
        //   275: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   278: astore_3       
        //   279: aload_3        
        //   280: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   283: astore_3       
        //   284: aload_3        
        //   285: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   288: istore          6
        //   290: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SOCIAL_STORY:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //   293: astore          5
        //   295: aload           5
        //   297: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //   300: istore          4
        //   302: iload           6
        //   304: iload           4
        //   306: if_icmpne       395
        //   309: aload_0        
        //   310: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   313: astore_3       
        //   314: aload_3        
        //   315: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   318: astore_3       
        //   319: aload_3        
        //   320: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   323: astore_3       
        //   324: aload_3        
        //   325: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   328: astore_3       
        //   329: aload_0        
        //   330: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   333: astore          5
        //   335: aload           5
        //   337: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   340: astore          5
        //   342: aload           5
        //   344: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   347: astore          5
        //   349: aload           5
        //   351: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   354: istore          4
        //   356: aload_0        
        //   357: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   360: astore          7
        //   362: aload           7
        //   364: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   367: astore          7
        //   369: aload           7
        //   371: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   374: astore          7
        //   376: aload           7
        //   378: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   381: istore          8
        //   383: aload_3        
        //   384: iload           4
        //   386: iload           8
        //   388: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo9x16:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   391: astore_3       
        //   392: goto            604
        //   395: aload_0        
        //   396: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   399: astore_3       
        //   400: aload_3        
        //   401: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   404: astore_3       
        //   405: aload_3        
        //   406: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   409: astore_3       
        //   410: aload_3        
        //   411: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   414: istore          6
        //   416: getstatic       hazem/nurmontage/videoquran/constant/ResizeType.SQUARE:Lhazem/nurmontage/videoquran/constant/ResizeType;
        //   419: astore          5
        //   421: aload           5
        //   423: invokevirtual   hazem/nurmontage/videoquran/constant/ResizeType.ordinal:()I
        //   426: istore          4
        //   428: iload           6
        //   430: iload           4
        //   432: if_icmpne       521
        //   435: aload_0        
        //   436: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   439: astore_3       
        //   440: aload_3        
        //   441: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   444: astore_3       
        //   445: aload_3        
        //   446: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   449: astore_3       
        //   450: aload_3        
        //   451: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   454: astore_3       
        //   455: aload_0        
        //   456: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   459: astore          5
        //   461: aload           5
        //   463: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   466: astore          5
        //   468: aload           5
        //   470: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   473: astore          5
        //   475: aload           5
        //   477: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   480: istore          4
        //   482: aload_0        
        //   483: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   486: astore          7
        //   488: aload           7
        //   490: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   493: astore          7
        //   495: aload           7
        //   497: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   500: astore          7
        //   502: aload           7
        //   504: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   507: istore          8
        //   509: aload_3        
        //   510: iload           4
        //   512: iload           8
        //   514: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo1x1:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   517: astore_3       
        //   518: goto            604
        //   521: aload_0        
        //   522: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   525: astore_3       
        //   526: aload_3        
        //   527: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   530: astore_3       
        //   531: aload_3        
        //   532: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   535: astore_3       
        //   536: aload_3        
        //   537: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //   540: astore_3       
        //   541: aload_0        
        //   542: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   545: astore          5
        //   547: aload           5
        //   549: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   552: astore          5
        //   554: aload           5
        //   556: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   559: astore          5
        //   561: aload           5
        //   563: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getW:()I
        //   566: istore          4
        //   568: aload_0        
        //   569: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   572: astore          7
        //   574: aload           7
        //   576: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   579: astore          7
        //   581: aload           7
        //   583: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   586: astore          7
        //   588: aload           7
        //   590: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getH:()I
        //   593: istore          8
        //   595: aload_3        
        //   596: iload           4
        //   598: iload           8
        //   600: invokestatic    hazem/nurmontage/videoquran/Utils/BitmapCropper.cropTo16x9:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   603: astore_3       
        //   604: aload_1        
        //   605: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   608: astore          5
        //   610: aload           5
        //   612: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   615: astore          5
        //   617: aload           5
        //   619: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   622: astore          5
        //   624: aload           5
        //   626: aload_3        
        //   627: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.updatePosCanvas:(Landroid/graphics/Bitmap;)V
        //   630: aload_1        
        //   631: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   634: astore          5
        //   636: aload           5
        //   638: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   641: astore          5
        //   643: aload           5
        //   645: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   648: astore          5
        //   650: aload           5
        //   652: aload_3        
        //   653: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapBlured:(Landroid/graphics/Bitmap;)V
        //   656: aload_1        
        //   657: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   660: astore          5
        //   662: aload           5
        //   664: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   667: astore          5
        //   669: aload           5
        //   671: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //   674: astore          5
        //   676: aload_1        
        //   677: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   680: astore          7
        //   682: aload           7
        //   684: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   687: astore          7
        //   689: aload           7
        //   691: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   694: astore          7
        //   696: aload           7
        //   698: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   701: istore          8
        //   703: aload_1        
        //   704: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   707: astore          10
        //   709: aload           10
        //   711: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   714: astore          10
        //   716: aload           10
        //   718: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   721: astore          10
        //   723: aload           10
        //   725: invokevirtual   hazem/nurmontage/videoquran/model/Template.geTypeResize:()I
        //   728: istore          9
        //   730: aload           5
        //   732: aload_3        
        //   733: iload           8
        //   735: iload           9
        //   737: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.updateIpad:(Landroid/graphics/Bitmap;II)V
        //   740: aload_1        
        //   741: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   744: astore          5
        //   746: aload           5
        //   748: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   751: astore          5
        //   753: aload           5
        //   755: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   758: astore          5
        //   760: aload           5
        //   762: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   765: istore          4
        //   767: getstatic       hazem/nurmontage/videoquran/constant/IpadType.GRADIENT:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   770: astore          7
        //   772: aload           7
        //   774: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   777: istore          8
        //   779: bipush          20
        //   781: istore          9
        //   783: iconst_1       
        //   784: istore          11
        //   786: iconst_0       
        //   787: istore          12
        //   789: fconst_0       
        //   790: fstore          13
        //   792: aconst_null    
        //   793: astore          14
        //   795: iload           4
        //   797: iload           8
        //   799: if_icmpeq       4392
        //   802: aload_1        
        //   803: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   806: astore          5
        //   808: aload           5
        //   810: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   813: astore          5
        //   815: aload           5
        //   817: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   820: astore          5
        //   822: aload           5
        //   824: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   827: istore          4
        //   829: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLACK_LAYER:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   832: astore          7
        //   834: aload           7
        //   836: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   839: istore          8
        //   841: iload           4
        //   843: iload           8
        //   845: if_icmpeq       4392
        //   848: aload_1        
        //   849: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   852: astore          5
        //   854: aload           5
        //   856: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   859: astore          5
        //   861: aload           5
        //   863: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   866: astore          5
        //   868: aload           5
        //   870: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   873: istore          4
        //   875: getstatic       hazem/nurmontage/videoquran/constant/IpadType.MASK_BRUSH:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   878: astore          7
        //   880: aload           7
        //   882: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   885: istore          8
        //   887: iload           4
        //   889: iload           8
        //   891: if_icmpeq       4392
        //   894: aload_1        
        //   895: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   898: astore          5
        //   900: aload           5
        //   902: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   905: astore          5
        //   907: aload           5
        //   909: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   912: astore          5
        //   914: aload           5
        //   916: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   919: istore          4
        //   921: getstatic       hazem/nurmontage/videoquran/constant/IpadType.BLUE_TYPE:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   924: astore          7
        //   926: aload           7
        //   928: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   931: istore          8
        //   933: iload           4
        //   935: iload           8
        //   937: if_icmpeq       4392
        //   940: aload_1        
        //   941: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   944: astore          5
        //   946: aload           5
        //   948: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   951: astore          5
        //   953: aload           5
        //   955: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //   958: astore          5
        //   960: aload           5
        //   962: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //   965: istore          4
        //   967: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG:Lhazem/nurmontage/videoquran/constant/IpadType;
        //   970: astore          7
        //   972: aload           7
        //   974: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //   977: istore          8
        //   979: iload           4
        //   981: iload           8
        //   983: if_icmpeq       4392
        //   986: aload_1        
        //   987: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //   990: astore          5
        //   992: aload           5
        //   994: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //   997: astore          5
        //   999: aload           5
        //  1001: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1004: astore          5
        //  1006: aload           5
        //  1008: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1011: istore          4
        //  1013: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG_BLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1016: astore          7
        //  1018: aload           7
        //  1020: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1023: istore          8
        //  1025: iload           4
        //  1027: iload           8
        //  1029: if_icmpne       1035
        //  1032: goto            4392
        //  1035: aload_1        
        //  1036: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1039: astore          5
        //  1041: aload           5
        //  1043: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1046: astore          5
        //  1048: aload           5
        //  1050: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1053: astore          5
        //  1055: aload           5
        //  1057: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1060: istore          4
        //  1062: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_NEOMORPHIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1065: astore          7
        //  1067: aload           7
        //  1069: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1072: istore          8
        //  1074: iload           4
        //  1076: iload           8
        //  1078: if_icmpne       1896
        //  1081: aload_1        
        //  1082: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1085: astore          5
        //  1087: aload           5
        //  1089: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1092: astore          5
        //  1094: aload           5
        //  1096: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1099: astore          5
        //  1101: aload           5
        //  1103: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //  1106: astore          5
        //  1108: aload           5
        //  1110: invokevirtual   android/graphics/RectF.width:()F
        //  1113: fstore          15
        //  1115: ldc             1058642330
        //  1117: istore          8
        //  1119: ldc             0.6
        //  1121: fstore          16
        //  1123: fload           15
        //  1125: fload           16
        //  1127: fmul           
        //  1128: fstore          15
        //  1130: fload           15
        //  1132: f2i            
        //  1133: istore          4
        //  1135: aload_1        
        //  1136: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1139: astore          7
        //  1141: aload           7
        //  1143: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1146: astore          7
        //  1148: aload           7
        //  1150: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1153: astore          7
        //  1155: aload           7
        //  1157: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1160: astore          7
        //  1162: aload           7
        //  1164: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1167: istore          8
        //  1169: iload           8
        //  1171: i2f            
        //  1172: fstore          16
        //  1174: aload_1        
        //  1175: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1178: astore          17
        //  1180: aload           17
        //  1182: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1185: astore          17
        //  1187: aload           17
        //  1189: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1192: astore          17
        //  1194: aload           17
        //  1196: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //  1199: fstore          18
        //  1201: fload           16
        //  1203: fload           18
        //  1205: fmul           
        //  1206: fstore          16
        //  1208: fload           16
        //  1210: invokestatic    java/lang/Math.round:(F)I
        //  1213: istore          8
        //  1215: aload_1        
        //  1216: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1219: astore          17
        //  1221: aload           17
        //  1223: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1226: astore          17
        //  1228: aload           17
        //  1230: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1233: astore          17
        //  1235: aload           17
        //  1237: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1240: astore          17
        //  1242: aload           17
        //  1244: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1247: istore          19
        //  1249: iload           19
        //  1251: i2f            
        //  1252: fstore          18
        //  1254: aload_1        
        //  1255: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1258: astore          20
        //  1260: aload           20
        //  1262: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1265: astore          20
        //  1267: aload           20
        //  1269: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1272: astore          20
        //  1274: aload           20
        //  1276: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //  1279: fstore          21
        //  1281: fload           18
        //  1283: fload           21
        //  1285: fmul           
        //  1286: fstore          18
        //  1288: fload           18
        //  1290: invokestatic    java/lang/Math.round:(F)I
        //  1293: istore          19
        //  1295: iload           4
        //  1297: iload           8
        //  1299: iadd           
        //  1300: istore          22
        //  1302: aload_1        
        //  1303: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1306: astore          23
        //  1308: aload           23
        //  1310: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1313: astore          23
        //  1315: aload           23
        //  1317: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1320: astore          23
        //  1322: aload           23
        //  1324: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1327: astore          23
        //  1329: aload           23
        //  1331: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1334: istore          24
        //  1336: iload           22
        //  1338: iload           24
        //  1340: if_icmple       1425
        //  1343: aload_1        
        //  1344: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1347: astore          23
        //  1349: aload           23
        //  1351: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1354: astore          23
        //  1356: aload           23
        //  1358: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1361: astore          23
        //  1363: aload           23
        //  1365: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1368: astore          23
        //  1370: aload           23
        //  1372: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1375: istore          24
        //  1377: iload           22
        //  1379: iload           24
        //  1381: isub           
        //  1382: istore          22
        //  1384: iload           8
        //  1386: iload           22
        //  1388: isub           
        //  1389: istore          8
        //  1391: aload_1        
        //  1392: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1395: astore          20
        //  1397: aload           20
        //  1399: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1402: astore          20
        //  1404: aload           20
        //  1406: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1409: astore          20
        //  1411: aload           20
        //  1413: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1416: astore          20
        //  1418: aload           20
        //  1420: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1423: istore          22
        //  1425: iload           4
        //  1427: iload           19
        //  1429: iadd           
        //  1430: istore          24
        //  1432: aload_1        
        //  1433: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1436: astore          25
        //  1438: aload           25
        //  1440: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1443: astore          25
        //  1445: aload           25
        //  1447: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1450: astore          25
        //  1452: aload           25
        //  1454: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1457: astore          25
        //  1459: aload           25
        //  1461: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1464: istore          26
        //  1466: iload           24
        //  1468: iload           26
        //  1470: if_icmple       1555
        //  1473: aload_1        
        //  1474: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1477: astore          25
        //  1479: aload           25
        //  1481: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1484: astore          25
        //  1486: aload           25
        //  1488: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1491: astore          25
        //  1493: aload           25
        //  1495: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1498: astore          25
        //  1500: aload           25
        //  1502: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1505: istore          26
        //  1507: iload           24
        //  1509: iload           26
        //  1511: isub           
        //  1512: istore          24
        //  1514: iload           19
        //  1516: iload           24
        //  1518: isub           
        //  1519: istore          19
        //  1521: aload_1        
        //  1522: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1525: astore          23
        //  1527: aload           23
        //  1529: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1532: astore          23
        //  1534: aload           23
        //  1536: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1539: astore          23
        //  1541: aload           23
        //  1543: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1546: astore          23
        //  1548: aload           23
        //  1550: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1553: istore          24
        //  1555: iload           8
        //  1557: ifge            1569
        //  1560: iconst_0       
        //  1561: istore          8
        //  1563: aconst_null    
        //  1564: astore          7
        //  1566: fconst_0       
        //  1567: fstore          16
        //  1569: iload           19
        //  1571: ifge            1577
        //  1574: goto            1581
        //  1577: iload           19
        //  1579: istore          12
        //  1581: new             Landroid/graphics/Rect;
        //  1584: astore          17
        //  1586: aload           17
        //  1588: iload           8
        //  1590: iload           12
        //  1592: iload           22
        //  1594: iload           24
        //  1596: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  1599: aload_1        
        //  1600: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1603: astore          7
        //  1605: aload           7
        //  1607: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1610: astore          7
        //  1612: aload           7
        //  1614: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1617: astore          7
        //  1619: aload           7
        //  1621: iload           4
        //  1623: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  1626: aload_1        
        //  1627: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1630: astore          7
        //  1632: aload           7
        //  1634: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1637: astore          7
        //  1639: aload           7
        //  1641: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1644: astore          7
        //  1646: aload           7
        //  1648: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1651: astore          7
        //  1653: aload           7
        //  1655: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  1658: istore          8
        //  1660: iload           8
        //  1662: i2f            
        //  1663: fstore          16
        //  1665: aload_1        
        //  1666: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1669: astore          14
        //  1671: aload           14
        //  1673: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1676: astore          14
        //  1678: aload           14
        //  1680: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1683: astore          14
        //  1685: aload           14
        //  1687: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  1690: fstore          13
        //  1692: fload           16
        //  1694: fload           13
        //  1696: fmul           
        //  1697: fstore          16
        //  1699: fload           16
        //  1701: f2i            
        //  1702: istore          8
        //  1704: aload_1        
        //  1705: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1708: astore          14
        //  1710: aload           14
        //  1712: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1715: astore          14
        //  1717: aload           14
        //  1719: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1722: astore          14
        //  1724: aload           14
        //  1726: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1729: astore          14
        //  1731: aload           14
        //  1733: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  1736: istore          12
        //  1738: iload           12
        //  1740: i2f            
        //  1741: fstore          13
        //  1743: aload_1        
        //  1744: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1747: astore          20
        //  1749: aload           20
        //  1751: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1754: astore          20
        //  1756: aload           20
        //  1758: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1761: astore          20
        //  1763: aload           20
        //  1765: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  1768: fstore          21
        //  1770: fload           13
        //  1772: fload           21
        //  1774: fmul           
        //  1775: fstore          13
        //  1777: fload           13
        //  1779: f2i            
        //  1780: istore          12
        //  1782: aload_1        
        //  1783: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1786: astore          20
        //  1788: aload           20
        //  1790: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1793: astore          20
        //  1795: aload           20
        //  1797: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1800: astore          20
        //  1802: aload           20
        //  1804: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  1807: astore          20
        //  1809: aload           20
        //  1811: aload           17
        //  1813: iload           4
        //  1815: iload           8
        //  1817: iload           12
        //  1819: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCorners:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  1822: astore          5
        //  1824: aload           17
        //  1826: getfield        android/graphics/Rect.left:I
        //  1829: iload           8
        //  1831: iadd           
        //  1832: istore          22
        //  1834: aload           17
        //  1836: iload           22
        //  1838: putfield        android/graphics/Rect.right:I
        //  1841: aload           17
        //  1843: getfield        android/graphics/Rect.top:I
        //  1846: iload           12
        //  1848: iadd           
        //  1849: istore          8
        //  1851: aload           17
        //  1853: iload           8
        //  1855: putfield        android/graphics/Rect.bottom:I
        //  1858: aload_1        
        //  1859: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1862: astore          7
        //  1864: aload           7
        //  1866: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1869: astore          7
        //  1871: aload           7
        //  1873: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  1876: astore          7
        //  1878: aload           7
        //  1880: aload           17
        //  1882: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  1885: aload           5
        //  1887: astore          27
        //  1889: aload           17
        //  1891: astore          28
        //  1893: goto            4134
        //  1896: aload_1        
        //  1897: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1900: astore          5
        //  1902: aload           5
        //  1904: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1907: astore          5
        //  1909: aload           5
        //  1911: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1914: astore          5
        //  1916: aload           5
        //  1918: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1921: istore          4
        //  1923: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1926: astore          7
        //  1928: aload           7
        //  1930: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1933: istore          8
        //  1935: iload           4
        //  1937: iload           8
        //  1939: if_icmpeq       2905
        //  1942: aload_1        
        //  1943: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1946: astore          5
        //  1948: aload           5
        //  1950: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1953: astore          5
        //  1955: aload           5
        //  1957: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  1960: astore          5
        //  1962: aload           5
        //  1964: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  1967: istore          4
        //  1969: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_UNBLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  1972: astore          7
        //  1974: aload           7
        //  1976: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  1979: istore          8
        //  1981: iload           4
        //  1983: iload           8
        //  1985: if_icmpeq       2905
        //  1988: aload_1        
        //  1989: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  1992: astore          5
        //  1994: aload           5
        //  1996: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  1999: astore          5
        //  2001: aload           5
        //  2003: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2006: astore          5
        //  2008: aload           5
        //  2010: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  2013: istore          4
        //  2015: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  2018: astore          7
        //  2020: aload           7
        //  2022: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  2025: istore          8
        //  2027: iload           4
        //  2029: iload           8
        //  2031: if_icmpne       2037
        //  2034: goto            2905
        //  2037: aload_1        
        //  2038: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2041: astore          5
        //  2043: aload           5
        //  2045: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2048: astore          5
        //  2050: aload           5
        //  2052: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2055: astore          5
        //  2057: aload           5
        //  2059: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //  2062: astore          5
        //  2064: aload           5
        //  2066: invokevirtual   android/graphics/RectF.width:()F
        //  2069: fstore          15
        //  2071: ldc             1065353216
        //  2073: istore          8
        //  2075: ldc             1.0
        //  2077: fstore          16
        //  2079: fload           15
        //  2081: fload           16
        //  2083: fmul           
        //  2084: fstore          15
        //  2086: fload           15
        //  2088: f2i            
        //  2089: istore          4
        //  2091: aload_3        
        //  2092: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2095: i2f            
        //  2096: fstore          16
        //  2098: ldc             1057560199
        //  2100: istore          19
        //  2102: ldc             0.5355
        //  2104: fstore          18
        //  2106: fload           16
        //  2108: fload           18
        //  2110: fmul           
        //  2111: fstore          16
        //  2113: fload           16
        //  2115: f2i            
        //  2116: istore          8
        //  2118: aload_1        
        //  2119: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2122: astore          17
        //  2124: aload           17
        //  2126: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2129: astore          17
        //  2131: aload           17
        //  2133: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2136: astore          17
        //  2138: aload           17
        //  2140: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2143: astore          17
        //  2145: aload           17
        //  2147: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2150: istore          19
        //  2152: iload           19
        //  2154: i2f            
        //  2155: fstore          18
        //  2157: aload_1        
        //  2158: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2161: astore          20
        //  2163: aload           20
        //  2165: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2168: astore          20
        //  2170: aload           20
        //  2172: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2175: astore          20
        //  2177: aload           20
        //  2179: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //  2182: fstore          21
        //  2184: fload           18
        //  2186: fload           21
        //  2188: fmul           
        //  2189: fstore          18
        //  2191: fload           18
        //  2193: invokestatic    java/lang/Math.round:(F)I
        //  2196: istore          19
        //  2198: aload_1        
        //  2199: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2202: astore          20
        //  2204: aload           20
        //  2206: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2209: astore          20
        //  2211: aload           20
        //  2213: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2216: astore          20
        //  2218: aload           20
        //  2220: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2223: astore          20
        //  2225: aload           20
        //  2227: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2230: istore          22
        //  2232: iload           22
        //  2234: i2f            
        //  2235: fstore          21
        //  2237: aload_1        
        //  2238: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2241: astore          23
        //  2243: aload           23
        //  2245: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2248: astore          23
        //  2250: aload           23
        //  2252: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2255: astore          23
        //  2257: aload           23
        //  2259: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //  2262: fstore          29
        //  2264: fload           21
        //  2266: fload           29
        //  2268: fmul           
        //  2269: fstore          21
        //  2271: fload           21
        //  2273: invokestatic    java/lang/Math.round:(F)I
        //  2276: istore          22
        //  2278: iload           4
        //  2280: iload           19
        //  2282: iadd           
        //  2283: istore          4
        //  2285: aload_1        
        //  2286: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2289: astore          23
        //  2291: aload           23
        //  2293: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2296: astore          23
        //  2298: aload           23
        //  2300: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2303: astore          23
        //  2305: aload           23
        //  2307: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2310: astore          23
        //  2312: aload           23
        //  2314: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2317: istore          24
        //  2319: iload           4
        //  2321: iload           24
        //  2323: if_icmple       2408
        //  2326: aload_1        
        //  2327: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2330: astore          23
        //  2332: aload           23
        //  2334: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2337: astore          23
        //  2339: aload           23
        //  2341: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2344: astore          23
        //  2346: aload           23
        //  2348: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2351: astore          23
        //  2353: aload           23
        //  2355: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2358: istore          24
        //  2360: iload           4
        //  2362: iload           24
        //  2364: isub           
        //  2365: istore          4
        //  2367: iload           19
        //  2369: iload           4
        //  2371: isub           
        //  2372: istore          19
        //  2374: aload_1        
        //  2375: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2378: astore          5
        //  2380: aload           5
        //  2382: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2385: astore          5
        //  2387: aload           5
        //  2389: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2392: astore          5
        //  2394: aload           5
        //  2396: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2399: astore          5
        //  2401: aload           5
        //  2403: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2406: istore          4
        //  2408: iload           8
        //  2410: iload           22
        //  2412: iadd           
        //  2413: istore          8
        //  2415: aload_1        
        //  2416: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2419: astore          23
        //  2421: aload           23
        //  2423: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2426: astore          23
        //  2428: aload           23
        //  2430: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2433: astore          23
        //  2435: aload           23
        //  2437: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2440: astore          23
        //  2442: aload           23
        //  2444: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2447: istore          24
        //  2449: iload           8
        //  2451: iload           24
        //  2453: if_icmple       2538
        //  2456: aload_1        
        //  2457: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2460: astore          23
        //  2462: aload           23
        //  2464: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2467: astore          23
        //  2469: aload           23
        //  2471: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2474: astore          23
        //  2476: aload           23
        //  2478: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2481: astore          23
        //  2483: aload           23
        //  2485: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2488: istore          24
        //  2490: iload           8
        //  2492: iload           24
        //  2494: isub           
        //  2495: istore          8
        //  2497: iload           22
        //  2499: iload           8
        //  2501: isub           
        //  2502: istore          22
        //  2504: aload_1        
        //  2505: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2508: astore          7
        //  2510: aload           7
        //  2512: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2515: astore          7
        //  2517: aload           7
        //  2519: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2522: astore          7
        //  2524: aload           7
        //  2526: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2529: astore          7
        //  2531: aload           7
        //  2533: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2536: istore          8
        //  2538: iload           19
        //  2540: ifge            2552
        //  2543: iconst_0       
        //  2544: istore          19
        //  2546: aconst_null    
        //  2547: astore          17
        //  2549: fconst_0       
        //  2550: fstore          18
        //  2552: iload           22
        //  2554: ifge            2566
        //  2557: iconst_0       
        //  2558: istore          22
        //  2560: aconst_null    
        //  2561: astore          20
        //  2563: fconst_0       
        //  2564: fstore          21
        //  2566: new             Landroid/graphics/Rect;
        //  2569: astore          23
        //  2571: aload           23
        //  2573: iload           19
        //  2575: iload           22
        //  2577: iload           4
        //  2579: iload           8
        //  2581: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  2584: aload_1        
        //  2585: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2588: astore          5
        //  2590: aload           5
        //  2592: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2595: astore          5
        //  2597: aload           5
        //  2599: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2602: astore          5
        //  2604: aload           5
        //  2606: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2609: astore          5
        //  2611: aload           5
        //  2613: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  2616: istore          4
        //  2618: iload           4
        //  2620: i2f            
        //  2621: fstore          15
        //  2623: aload_1        
        //  2624: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2627: astore          7
        //  2629: aload           7
        //  2631: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2634: astore          7
        //  2636: aload           7
        //  2638: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2641: astore          7
        //  2643: aload           7
        //  2645: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  2648: fstore          16
        //  2650: fload           15
        //  2652: fload           16
        //  2654: fmul           
        //  2655: fstore          15
        //  2657: fload           15
        //  2659: f2i            
        //  2660: istore          4
        //  2662: aload_1        
        //  2663: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2666: astore          7
        //  2668: aload           7
        //  2670: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2673: astore          7
        //  2675: aload           7
        //  2677: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2680: astore          7
        //  2682: aload           7
        //  2684: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2687: astore          7
        //  2689: aload           7
        //  2691: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  2694: istore          8
        //  2696: iload           8
        //  2698: i2f            
        //  2699: fstore          16
        //  2701: aload_1        
        //  2702: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2705: astore          17
        //  2707: aload           17
        //  2709: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2712: astore          17
        //  2714: aload           17
        //  2716: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  2719: astore          17
        //  2721: aload           17
        //  2723: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  2726: fstore          18
        //  2728: fload           16
        //  2730: fload           18
        //  2732: fmul           
        //  2733: fstore          16
        //  2735: fload           16
        //  2737: f2i            
        //  2738: istore          8
        //  2740: aload_1        
        //  2741: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2744: astore          17
        //  2746: aload           17
        //  2748: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2751: astore          17
        //  2753: aload           17
        //  2755: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2758: astore          17
        //  2760: aload           17
        //  2762: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  2765: astore          17
        //  2767: aload           17
        //  2769: aload           23
        //  2771: iload           4
        //  2773: iload           8
        //  2775: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquare:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;
        //  2778: astore          17
        //  2780: aload_1        
        //  2781: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2784: astore          20
        //  2786: aload           20
        //  2788: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2791: astore          20
        //  2793: aload           20
        //  2795: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2798: astore          20
        //  2800: aload           20
        //  2802: aload           17
        //  2804: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  2807: aload_1        
        //  2808: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2811: astore          20
        //  2813: aload           20
        //  2815: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2818: astore          20
        //  2820: aload           20
        //  2822: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2825: astore          20
        //  2827: aload           20
        //  2829: iconst_0       
        //  2830: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  2833: aload           23
        //  2835: getfield        android/graphics/Rect.left:I
        //  2838: iload           4
        //  2840: iadd           
        //  2841: istore          12
        //  2843: aload           23
        //  2845: iload           12
        //  2847: putfield        android/graphics/Rect.right:I
        //  2850: aload           23
        //  2852: getfield        android/graphics/Rect.top:I
        //  2855: iload           8
        //  2857: iadd           
        //  2858: istore          4
        //  2860: aload           23
        //  2862: iload           4
        //  2864: putfield        android/graphics/Rect.bottom:I
        //  2867: aload_1        
        //  2868: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2871: astore          5
        //  2873: aload           5
        //  2875: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2878: astore          5
        //  2880: aload           5
        //  2882: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2885: astore          5
        //  2887: aload           5
        //  2889: aload           23
        //  2891: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  2894: aload           17
        //  2896: astore          27
        //  2898: aload           23
        //  2900: astore          28
        //  2902: goto            4134
        //  2905: aload_1        
        //  2906: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2909: astore          5
        //  2911: aload           5
        //  2913: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2916: astore          5
        //  2918: aload           5
        //  2920: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  2923: astore          5
        //  2925: aload           5
        //  2927: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getIpad_rect:()Landroid/graphics/RectF;
        //  2930: astore          5
        //  2932: aload           5
        //  2934: invokevirtual   android/graphics/RectF.width:()F
        //  2937: ldc_w           0.87530595
        //  2940: fmul           
        //  2941: fstore          15
        //  2943: fload           15
        //  2945: f2i            
        //  2946: istore          4
        //  2948: iload           4
        //  2950: i2f            
        //  2951: fstore          16
        //  2953: ldc_w           1066443735
        //  2956: istore          19
        //  2958: ldc_w           1.13
        //  2961: fstore          18
        //  2963: fload           16
        //  2965: fload           18
        //  2967: fmul           
        //  2968: fstore          16
        //  2970: fload           16
        //  2972: f2i            
        //  2973: istore          8
        //  2975: iload           4
        //  2977: iload           8
        //  2979: invokestatic    java/lang/Math.min:(II)I
        //  2982: istore          19
        //  2984: aload_1        
        //  2985: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  2988: astore          20
        //  2990: aload           20
        //  2992: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  2995: astore          20
        //  2997: aload           20
        //  2999: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3002: astore          20
        //  3004: aload           20
        //  3006: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3009: astore          20
        //  3011: aload           20
        //  3013: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3016: istore          22
        //  3018: iload           22
        //  3020: i2f            
        //  3021: fstore          21
        //  3023: aload_1        
        //  3024: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3027: astore          23
        //  3029: aload           23
        //  3031: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3034: astore          23
        //  3036: aload           23
        //  3038: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3041: astore          23
        //  3043: aload           23
        //  3045: invokevirtual   hazem/nurmontage/videoquran/model/Template.getX_square:()F
        //  3048: fstore          29
        //  3050: fload           21
        //  3052: fload           29
        //  3054: fmul           
        //  3055: fstore          21
        //  3057: fload           21
        //  3059: invokestatic    java/lang/Math.round:(F)I
        //  3062: istore          22
        //  3064: aload_1        
        //  3065: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3068: astore          23
        //  3070: aload           23
        //  3072: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3075: astore          23
        //  3077: aload           23
        //  3079: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3082: astore          23
        //  3084: aload           23
        //  3086: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3089: astore          23
        //  3091: aload           23
        //  3093: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3096: istore          24
        //  3098: iload           24
        //  3100: i2f            
        //  3101: fstore          29
        //  3103: aload_1        
        //  3104: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3107: astore          25
        //  3109: aload           25
        //  3111: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3114: astore          25
        //  3116: aload           25
        //  3118: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3121: astore          25
        //  3123: aload           25
        //  3125: invokevirtual   hazem/nurmontage/videoquran/model/Template.getY_square:()F
        //  3128: fstore          30
        //  3130: fload           29
        //  3132: fload           30
        //  3134: fmul           
        //  3135: fstore          29
        //  3137: fload           29
        //  3139: invokestatic    java/lang/Math.round:(F)I
        //  3142: istore          24
        //  3144: iload           4
        //  3146: iload           22
        //  3148: iadd           
        //  3149: istore          4
        //  3151: aload_1        
        //  3152: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3155: astore          25
        //  3157: aload           25
        //  3159: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3162: astore          25
        //  3164: aload           25
        //  3166: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3169: astore          25
        //  3171: aload           25
        //  3173: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3176: astore          25
        //  3178: aload           25
        //  3180: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3183: istore          26
        //  3185: iload           4
        //  3187: iload           26
        //  3189: if_icmple       3274
        //  3192: aload_1        
        //  3193: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3196: astore          25
        //  3198: aload           25
        //  3200: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3203: astore          25
        //  3205: aload           25
        //  3207: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3210: astore          25
        //  3212: aload           25
        //  3214: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3217: astore          25
        //  3219: aload           25
        //  3221: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3224: istore          26
        //  3226: iload           4
        //  3228: iload           26
        //  3230: isub           
        //  3231: istore          4
        //  3233: iload           22
        //  3235: iload           4
        //  3237: isub           
        //  3238: istore          22
        //  3240: aload_1        
        //  3241: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3244: astore          5
        //  3246: aload           5
        //  3248: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3251: astore          5
        //  3253: aload           5
        //  3255: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3258: astore          5
        //  3260: aload           5
        //  3262: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3265: astore          5
        //  3267: aload           5
        //  3269: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3272: istore          4
        //  3274: iload           8
        //  3276: iload           24
        //  3278: iadd           
        //  3279: istore          8
        //  3281: aload_1        
        //  3282: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3285: astore          25
        //  3287: aload           25
        //  3289: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3292: astore          25
        //  3294: aload           25
        //  3296: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3299: astore          25
        //  3301: aload           25
        //  3303: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3306: astore          25
        //  3308: aload           25
        //  3310: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3313: istore          26
        //  3315: iload           8
        //  3317: iload           26
        //  3319: if_icmple       3404
        //  3322: aload_1        
        //  3323: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3326: astore          25
        //  3328: aload           25
        //  3330: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3333: astore          25
        //  3335: aload           25
        //  3337: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3340: astore          25
        //  3342: aload           25
        //  3344: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3347: astore          25
        //  3349: aload           25
        //  3351: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3354: istore          26
        //  3356: iload           8
        //  3358: iload           26
        //  3360: isub           
        //  3361: istore          8
        //  3363: iload           24
        //  3365: iload           8
        //  3367: isub           
        //  3368: istore          24
        //  3370: aload_1        
        //  3371: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3374: astore          7
        //  3376: aload           7
        //  3378: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3381: astore          7
        //  3383: aload           7
        //  3385: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3388: astore          7
        //  3390: aload           7
        //  3392: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3395: astore          7
        //  3397: aload           7
        //  3399: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3402: istore          8
        //  3404: iload           22
        //  3406: ifge            3418
        //  3409: iconst_0       
        //  3410: istore          22
        //  3412: aconst_null    
        //  3413: astore          20
        //  3415: fconst_0       
        //  3416: fstore          21
        //  3418: iload           24
        //  3420: ifge            3432
        //  3423: iconst_0       
        //  3424: istore          24
        //  3426: aconst_null    
        //  3427: astore          23
        //  3429: fconst_0       
        //  3430: fstore          29
        //  3432: new             Landroid/graphics/Rect;
        //  3435: astore          25
        //  3437: aload           25
        //  3439: iload           22
        //  3441: iload           24
        //  3443: iload           4
        //  3445: iload           8
        //  3447: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  3450: aload_1        
        //  3451: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3454: astore          5
        //  3456: aload           5
        //  3458: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3461: astore          5
        //  3463: aload           5
        //  3465: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3468: astore          5
        //  3470: aload           5
        //  3472: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  3475: istore          4
        //  3477: getstatic       hazem/nurmontage/videoquran/constant/IpadType.IPAD_CLASSIC:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  3480: astore          7
        //  3482: aload           7
        //  3484: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  3487: istore          8
        //  3489: iload           4
        //  3491: iload           8
        //  3493: if_icmpne       3813
        //  3496: aload_1        
        //  3497: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3500: astore          5
        //  3502: aload           5
        //  3504: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3507: astore          5
        //  3509: aload           5
        //  3511: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3514: astore          5
        //  3516: aload           5
        //  3518: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3521: astore          5
        //  3523: aload           5
        //  3525: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3528: istore          4
        //  3530: iload           4
        //  3532: i2f            
        //  3533: fstore          15
        //  3535: aload_1        
        //  3536: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3539: astore          7
        //  3541: aload           7
        //  3543: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3546: astore          7
        //  3548: aload           7
        //  3550: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3553: astore          7
        //  3555: aload           7
        //  3557: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  3560: fstore          16
        //  3562: fload           15
        //  3564: fload           16
        //  3566: fmul           
        //  3567: fstore          15
        //  3569: fload           15
        //  3571: f2i            
        //  3572: istore          4
        //  3574: aload_1        
        //  3575: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3578: astore          7
        //  3580: aload           7
        //  3582: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3585: astore          7
        //  3587: aload           7
        //  3589: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3592: astore          7
        //  3594: aload           7
        //  3596: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3599: astore          7
        //  3601: aload           7
        //  3603: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3606: istore          8
        //  3608: iload           8
        //  3610: i2f            
        //  3611: fstore          16
        //  3613: aload_1        
        //  3614: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3617: astore          17
        //  3619: aload           17
        //  3621: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3624: astore          17
        //  3626: aload           17
        //  3628: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3631: astore          17
        //  3633: aload           17
        //  3635: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  3638: fstore          18
        //  3640: fload           16
        //  3642: fload           18
        //  3644: fmul           
        //  3645: fstore          16
        //  3647: fload           16
        //  3649: f2i            
        //  3650: istore          8
        //  3652: aload_1        
        //  3653: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3656: astore          17
        //  3658: aload           17
        //  3660: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3663: astore          17
        //  3665: aload           17
        //  3667: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3670: astore          17
        //  3672: aload           17
        //  3674: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3677: astore          17
        //  3679: aload           17
        //  3681: aload           25
        //  3683: iload           4
        //  3685: iload           8
        //  3687: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquare:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;
        //  3690: astore          17
        //  3692: aload_1        
        //  3693: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3696: astore          20
        //  3698: aload           20
        //  3700: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3703: astore          20
        //  3705: aload           20
        //  3707: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3710: astore          20
        //  3712: aload           20
        //  3714: aload           17
        //  3716: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  3719: aload_1        
        //  3720: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3723: astore          20
        //  3725: aload           20
        //  3727: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3730: astore          20
        //  3732: aload           20
        //  3734: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3737: astore          20
        //  3739: aload           20
        //  3741: iconst_0       
        //  3742: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  3745: aload           25
        //  3747: getfield        android/graphics/Rect.left:I
        //  3750: iload           4
        //  3752: iadd           
        //  3753: istore          12
        //  3755: aload           25
        //  3757: iload           12
        //  3759: putfield        android/graphics/Rect.right:I
        //  3762: aload           25
        //  3764: getfield        android/graphics/Rect.top:I
        //  3767: iload           8
        //  3769: iadd           
        //  3770: istore          4
        //  3772: aload           25
        //  3774: iload           4
        //  3776: putfield        android/graphics/Rect.bottom:I
        //  3779: aload_1        
        //  3780: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3783: astore          5
        //  3785: aload           5
        //  3787: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3790: astore          5
        //  3792: aload           5
        //  3794: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3797: astore          5
        //  3799: aload           5
        //  3801: aload           25
        //  3803: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  3806: aload           17
        //  3808: astore          5
        //  3810: goto            4126
        //  3813: iload           19
        //  3815: i2f            
        //  3816: fstore          15
        //  3818: ldc_w           1037905692
        //  3821: istore          8
        //  3823: ldc_w           0.10800001
        //  3826: fstore          16
        //  3828: fload           15
        //  3830: fload           16
        //  3832: fmul           
        //  3833: fstore          15
        //  3835: fload           15
        //  3837: f2i            
        //  3838: istore          4
        //  3840: aload_1        
        //  3841: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3844: astore          7
        //  3846: aload           7
        //  3848: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3851: astore          7
        //  3853: aload           7
        //  3855: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3858: astore          7
        //  3860: aload           7
        //  3862: iload           4
        //  3864: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  3867: aload_1        
        //  3868: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3871: astore          7
        //  3873: aload           7
        //  3875: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3878: astore          7
        //  3880: aload           7
        //  3882: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3885: astore          7
        //  3887: aload           7
        //  3889: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3892: astore          7
        //  3894: aload           7
        //  3896: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //  3899: istore          8
        //  3901: iload           8
        //  3903: i2f            
        //  3904: fstore          16
        //  3906: aload_1        
        //  3907: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3910: astore          14
        //  3912: aload           14
        //  3914: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3917: astore          14
        //  3919: aload           14
        //  3921: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  3924: astore          14
        //  3926: aload           14
        //  3928: invokevirtual   hazem/nurmontage/videoquran/model/Template.getWidth_square:()F
        //  3931: fstore          13
        //  3933: fload           16
        //  3935: fload           13
        //  3937: fmul           
        //  3938: fstore          16
        //  3940: fload           16
        //  3942: f2i            
        //  3943: istore          8
        //  3945: aload_1        
        //  3946: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3949: astore          14
        //  3951: aload           14
        //  3953: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3956: astore          14
        //  3958: aload           14
        //  3960: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  3963: astore          14
        //  3965: aload           14
        //  3967: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  3970: astore          14
        //  3972: aload           14
        //  3974: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //  3977: istore          12
        //  3979: iload           12
        //  3981: i2f            
        //  3982: fstore          13
        //  3984: aload_1        
        //  3985: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  3988: astore          17
        //  3990: aload           17
        //  3992: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  3995: astore          17
        //  3997: aload           17
        //  3999: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4002: astore          17
        //  4004: aload           17
        //  4006: invokevirtual   hazem/nurmontage/videoquran/model/Template.getHeight_square:()F
        //  4009: fstore          18
        //  4011: fload           13
        //  4013: fload           18
        //  4015: fmul           
        //  4016: fstore          13
        //  4018: fload           13
        //  4020: f2i            
        //  4021: istore          12
        //  4023: aload_1        
        //  4024: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4027: astore          17
        //  4029: aload           17
        //  4031: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4034: astore          17
        //  4036: aload           17
        //  4038: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4041: astore          17
        //  4043: aload           17
        //  4045: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapOriginal:()Landroid/graphics/Bitmap;
        //  4048: astore          17
        //  4050: aload           17
        //  4052: aload           25
        //  4054: iload           4
        //  4056: iload           8
        //  4058: iload           12
        //  4060: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.cropToSquareWithRoundCorners:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;III)Landroid/graphics/Bitmap;
        //  4063: astore          5
        //  4065: aload           25
        //  4067: getfield        android/graphics/Rect.left:I
        //  4070: iload           8
        //  4072: iadd           
        //  4073: istore          19
        //  4075: aload           25
        //  4077: iload           19
        //  4079: putfield        android/graphics/Rect.right:I
        //  4082: aload           25
        //  4084: getfield        android/graphics/Rect.top:I
        //  4087: iload           12
        //  4089: iadd           
        //  4090: istore          8
        //  4092: aload           25
        //  4094: iload           8
        //  4096: putfield        android/graphics/Rect.bottom:I
        //  4099: aload_1        
        //  4100: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4103: astore          7
        //  4105: aload           7
        //  4107: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4110: astore          7
        //  4112: aload           7
        //  4114: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4117: astore          7
        //  4119: aload           7
        //  4121: aload           25
        //  4123: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRectSquare:(Landroid/graphics/Rect;)V
        //  4126: aload           5
        //  4128: astore          27
        //  4130: aload           25
        //  4132: astore          28
        //  4134: aload_1        
        //  4135: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4138: astore          5
        //  4140: aload           5
        //  4142: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4145: astore          5
        //  4147: aload           5
        //  4149: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4152: astore          5
        //  4154: aload           5
        //  4156: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  4159: astore          5
        //  4161: aload           5
        //  4163: ifnull          4279
        //  4166: aload_1        
        //  4167: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4170: astore          5
        //  4172: aload           5
        //  4174: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4177: astore          5
        //  4179: aload           5
        //  4181: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4184: astore          31
        //  4186: aload_1        
        //  4187: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4190: astore          5
        //  4192: aload           5
        //  4194: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4197: astore          5
        //  4199: aload           5
        //  4201: aload_3        
        //  4202: iload           9
        //  4204: iload           11
        //  4206: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  4209: astore          32
        //  4211: aload_1        
        //  4212: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4215: astore_3       
        //  4216: aload_3        
        //  4217: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4220: astore_3       
        //  4221: aload_3        
        //  4222: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4225: astore_3       
        //  4226: aload_3        
        //  4227: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  4230: astore          33
        //  4232: aload_1        
        //  4233: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4236: astore_3       
        //  4237: aload_3        
        //  4238: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4241: astore_3       
        //  4242: aload_3        
        //  4243: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4246: astore_3       
        //  4247: aload_3        
        //  4248: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  4251: istore          34
        //  4253: aload_1        
        //  4254: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //  4257: istore          6
        //  4259: aload           31
        //  4261: aload           32
        //  4263: aload           27
        //  4265: aload           33
        //  4267: iload           34
        //  4269: iload           6
        //  4271: aload           28
        //  4273: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lhazem/nurmontage/videoquran/model/Gradient;IILandroid/graphics/Rect;)V
        //  4276: goto            4858
        //  4279: aload_1        
        //  4280: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4283: astore          5
        //  4285: aload           5
        //  4287: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4290: astore          5
        //  4292: aload           5
        //  4294: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4297: astore          31
        //  4299: aload_1        
        //  4300: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4303: astore          5
        //  4305: aload           5
        //  4307: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4310: astore          5
        //  4312: aload           5
        //  4314: aload_3        
        //  4315: iload           9
        //  4317: iload           11
        //  4319: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  4322: astore          32
        //  4324: aload_1        
        //  4325: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4328: astore_3       
        //  4329: aload_3        
        //  4330: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4333: astore_3       
        //  4334: aload_3        
        //  4335: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4338: astore_3       
        //  4339: aload_3        
        //  4340: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_ipad:()I
        //  4343: istore          35
        //  4345: aload_1        
        //  4346: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4349: astore_3       
        //  4350: aload_3        
        //  4351: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4354: astore_3       
        //  4355: aload_3        
        //  4356: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4359: astore_3       
        //  4360: aload_3        
        //  4361: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  4364: istore          34
        //  4366: aload_1        
        //  4367: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //  4370: istore          6
        //  4372: aload           31
        //  4374: aload           32
        //  4376: aload           27
        //  4378: iload           35
        //  4380: iload           34
        //  4382: iload           6
        //  4384: aload           28
        //  4386: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIILandroid/graphics/Rect;)V
        //  4389: goto            4858
        //  4392: aload_1        
        //  4393: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4396: astore          5
        //  4398: aload           5
        //  4400: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4403: astore          5
        //  4405: aload           5
        //  4407: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4410: astore          5
        //  4412: aload           5
        //  4414: aload_3        
        //  4415: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapNotBlur:(Landroid/graphics/Bitmap;)V
        //  4418: aload_3        
        //  4419: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //  4422: astore          5
        //  4424: aload           5
        //  4426: ifnull          4438
        //  4429: aload_3        
        //  4430: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //  4433: astore          5
        //  4435: goto            4443
        //  4438: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //  4441: astore          5
        //  4443: aload_3        
        //  4444: aload           5
        //  4446: iload           11
        //  4448: invokevirtual   android/graphics/Bitmap.copy:(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
        //  4451: astore          23
        //  4453: aload_1        
        //  4454: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4457: astore          5
        //  4459: aload           5
        //  4461: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4464: astore          5
        //  4466: aload           5
        //  4468: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4471: astore          5
        //  4473: aload           5
        //  4475: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  4478: astore          5
        //  4480: aload           5
        //  4482: ifnull          4619
        //  4485: aload_1        
        //  4486: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4489: astore          5
        //  4491: aload           5
        //  4493: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4496: astore          5
        //  4498: aload           5
        //  4500: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4503: astore          17
        //  4505: aload_1        
        //  4506: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4509: astore          5
        //  4511: aload           5
        //  4513: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4516: astore          5
        //  4518: aload           5
        //  4520: aload_3        
        //  4521: iload           9
        //  4523: iload           11
        //  4525: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  4528: astore          20
        //  4530: aload_1        
        //  4531: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4534: astore_3       
        //  4535: aload_3        
        //  4536: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4539: astore_3       
        //  4540: aload_3        
        //  4541: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4544: astore_3       
        //  4545: aload_3        
        //  4546: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_gradient:()Lhazem/nurmontage/videoquran/model/Gradient;
        //  4549: astore          25
        //  4551: aload_1        
        //  4552: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4555: astore_3       
        //  4556: aload_3        
        //  4557: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4560: astore_3       
        //  4561: aload_3        
        //  4562: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4565: astore_3       
        //  4566: aload_3        
        //  4567: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  4570: istore          36
        //  4572: aload_1        
        //  4573: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //  4576: istore          37
        //  4578: aload_1        
        //  4579: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4582: astore_3       
        //  4583: aload_3        
        //  4584: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4587: astore_3       
        //  4588: aload_3        
        //  4589: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4592: astore_3       
        //  4593: aload_3        
        //  4594: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getRectSquare:()Landroid/graphics/Rect;
        //  4597: astore          27
        //  4599: aload           17
        //  4601: aload           20
        //  4603: aload           23
        //  4605: aload           25
        //  4607: iload           36
        //  4609: iload           37
        //  4611: aload           27
        //  4613: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lhazem/nurmontage/videoquran/model/Gradient;IILandroid/graphics/Rect;)V
        //  4616: goto            4750
        //  4619: aload_1        
        //  4620: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4623: astore          5
        //  4625: aload           5
        //  4627: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4630: astore          5
        //  4632: aload           5
        //  4634: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4637: astore          17
        //  4639: aload_1        
        //  4640: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4643: astore          5
        //  4645: aload           5
        //  4647: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4650: astore          5
        //  4652: aload           5
        //  4654: aload_3        
        //  4655: iload           9
        //  4657: iload           11
        //  4659: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsBitmap.blur:(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //  4662: astore          20
        //  4664: aload_1        
        //  4665: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4668: astore_3       
        //  4669: aload_3        
        //  4670: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4673: astore_3       
        //  4674: aload_3        
        //  4675: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4678: astore_3       
        //  4679: aload_3        
        //  4680: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getColor_ipad:()I
        //  4683: istore          26
        //  4685: aload_1        
        //  4686: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4689: astore_3       
        //  4690: aload_3        
        //  4691: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4694: astore_3       
        //  4695: aload_3        
        //  4696: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4699: astore_3       
        //  4700: aload_3        
        //  4701: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  4704: istore          36
        //  4706: aload_1        
        //  4707: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.val$resize:I
        //  4710: istore          37
        //  4712: aload_1        
        //  4713: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4716: astore_3       
        //  4717: aload_3        
        //  4718: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4721: astore_3       
        //  4722: aload_3        
        //  4723: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4726: astore_3       
        //  4727: aload_3        
        //  4728: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getRectSquare:()Landroid/graphics/Rect;
        //  4731: astore          27
        //  4733: aload           17
        //  4735: aload           20
        //  4737: aload           23
        //  4739: iload           26
        //  4741: iload           36
        //  4743: iload           37
        //  4745: aload           27
        //  4747: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIILandroid/graphics/Rect;)V
        //  4750: aload_1        
        //  4751: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4754: astore_3       
        //  4755: aload_3        
        //  4756: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4759: astore_3       
        //  4760: aload_3        
        //  4761: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetmTemplate:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/model/Template;
        //  4764: astore_3       
        //  4765: aload_3        
        //  4766: invokevirtual   hazem/nurmontage/videoquran/model/Template.getIpad_type:()I
        //  4769: istore          6
        //  4771: getstatic       hazem/nurmontage/videoquran/constant/IpadType.CASSET_IMG_BLUR:Lhazem/nurmontage/videoquran/constant/IpadType;
        //  4774: astore          5
        //  4776: aload           5
        //  4778: invokevirtual   hazem/nurmontage/videoquran/constant/IpadType.ordinal:()I
        //  4781: istore          4
        //  4783: iload           6
        //  4785: iload           4
        //  4787: if_icmpne       4858
        //  4790: aload_1        
        //  4791: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4794: astore_3       
        //  4795: aload_3        
        //  4796: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4799: astore_3       
        //  4800: aload_3        
        //  4801: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4804: astore_3       
        //  4805: aload_1        
        //  4806: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4809: astore          5
        //  4811: aload           5
        //  4813: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4816: astore          5
        //  4818: aload           5
        //  4820: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4823: astore          5
        //  4825: aload           5
        //  4827: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.getBitmapBlured:()Landroid/graphics/Bitmap;
        //  4830: astore          5
        //  4832: aload_3        
        //  4833: aload           5
        //  4835: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setBitmapSquare:(Landroid/graphics/Bitmap;)V
        //  4838: aload_1        
        //  4839: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4842: astore_3       
        //  4843: aload_3        
        //  4844: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4847: astore_3       
        //  4848: aload_3        
        //  4849: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4852: astore_3       
        //  4853: aload_3        
        //  4854: iconst_0       
        //  4855: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.setRadius_square:(I)V
        //  4858: aload_1        
        //  4859: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4862: astore_3       
        //  4863: aload_3        
        //  4864: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4867: astore_3       
        //  4868: aload_3        
        //  4869: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4872: astore_3       
        //  4873: aload_3        
        //  4874: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.resizeEntity:()V
        //  4877: aload_1        
        //  4878: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4881: astore_3       
        //  4882: aload_3        
        //  4883: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4886: astore_3       
        //  4887: aload_3        
        //  4888: invokestatic    hazem/nurmontage/videoquran/EngineActivity.-$$Nest$fgetblurredImageView:(Lhazem/nurmontage/videoquran/EngineActivity;)Lhazem/nurmontage/videoquran/views/BlurredImageView;
        //  4891: astore_3       
        //  4892: aload_3        
        //  4893: invokevirtual   hazem/nurmontage/videoquran/views/BlurredImageView.updatePosSurahName:()V
        //  4896: aload_1        
        //  4897: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4900: astore_3       
        //  4901: aload_3        
        //  4902: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4905: astore_3       
        //  4906: new             Lhazem/nurmontage/videoquran/EngineActivity$78$1$1;
        //  4909: astore          5
        //  4911: aload           5
        //  4913: aload_1        
        //  4914: invokespecial   hazem/nurmontage/videoquran/EngineActivity$78$1$1.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$78$1;)V
        //  4917: aload_3        
        //  4918: aload           5
        //  4920: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  4923: aload_1        
        //  4924: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  4927: astore_2       
        //  4928: aload_2        
        //  4929: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  4932: astore_2       
        //  4933: new             Lhazem/nurmontage/videoquran/EngineActivity$78$1$2;
        //  4936: astore_3       
        //  4937: aload_3        
        //  4938: aload_1        
        //  4939: invokespecial   hazem/nurmontage/videoquran/EngineActivity$78$1$2.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$78$1;)V
        //  4942: aload_2        
        //  4943: aload_3        
        //  4944: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  4947: goto            5027
        //  4950: astore          38
        //  4952: aload           38
        //  4954: astore_2       
        //  4955: goto            5028
        //  4958: astore          38
        //  4960: aload           38
        //  4962: astore_3       
        //  4963: ldc_w           "Tag resize : "
        //  4966: astore          5
        //  4968: new             Ljava/lang/StringBuilder;
        //  4971: astore          7
        //  4973: aload           7
        //  4975: aload_2        
        //  4976: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  4979: aload           38
        //  4981: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //  4984: astore_2       
        //  4985: aload           7
        //  4987: aload_2        
        //  4988: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4991: astore_2       
        //  4992: aload_2        
        //  4993: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4996: astore_2       
        //  4997: aload           5
        //  4999: aload_2        
        //  5000: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //  5003: pop            
        //  5004: aload_1        
        //  5005: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  5008: astore_2       
        //  5009: aload_2        
        //  5010: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  5013: astore_2       
        //  5014: new             Lhazem/nurmontage/videoquran/EngineActivity$78$1$2;
        //  5017: astore_3       
        //  5018: aload_3        
        //  5019: aload_1        
        //  5020: invokespecial   hazem/nurmontage/videoquran/EngineActivity$78$1$2.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$78$1;)V
        //  5023: goto            4942
        //  5026: pop            
        //  5027: return         
        //  5028: aload_1        
        //  5029: getfield        hazem/nurmontage/videoquran/EngineActivity$78$1.this$1:Lhazem/nurmontage/videoquran/EngineActivity$78;
        //  5032: astore_3       
        //  5033: aload_3        
        //  5034: getfield        hazem/nurmontage/videoquran/EngineActivity$78.this$0:Lhazem/nurmontage/videoquran/EngineActivity;
        //  5037: astore_3       
        //  5038: new             Lhazem/nurmontage/videoquran/EngineActivity$78$1$2;
        //  5041: astore          5
        //  5043: aload           5
        //  5045: aload_1        
        //  5046: invokespecial   hazem/nurmontage/videoquran/EngineActivity$78$1$2.<init>:(Lhazem/nurmontage/videoquran/EngineActivity$78$1;)V
        //  5049: aload_3        
        //  5050: aload           5
        //  5052: invokevirtual   hazem/nurmontage/videoquran/EngineActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  5055: aload_2        
        //  5056: athrow         
        //  5057: pop            
        //  5058: goto            5055
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      9      4958   5026   Ljava/lang/Exception;
        //  5      9      4950   5061   Any
        //  10     14     4958   5026   Ljava/lang/Exception;
        //  10     14     4950   5061   Any
        //  15     19     4958   5026   Ljava/lang/Exception;
        //  15     19     4950   5061   Any
        //  20     24     4958   5026   Ljava/lang/Exception;
        //  20     24     4950   5061   Any
        //  24     28     4958   5026   Ljava/lang/Exception;
        //  24     28     4950   5061   Any
        //  29     33     4958   5026   Ljava/lang/Exception;
        //  29     33     4950   5061   Any
        //  34     38     4958   5026   Ljava/lang/Exception;
        //  34     38     4950   5061   Any
        //  39     43     4958   5026   Ljava/lang/Exception;
        //  39     43     4950   5061   Any
        //  46     51     4958   5026   Ljava/lang/Exception;
        //  46     51     4950   5061   Any
        //  51     55     4958   5026   Ljava/lang/Exception;
        //  51     55     4950   5061   Any
        //  56     60     4958   5026   Ljava/lang/Exception;
        //  56     60     4950   5061   Any
        //  61     65     4958   5026   Ljava/lang/Exception;
        //  61     65     4950   5061   Any
        //  66     70     4958   5026   Ljava/lang/Exception;
        //  66     70     4950   5061   Any
        //  73     78     4958   5026   Ljava/lang/Exception;
        //  73     78     4950   5061   Any
        //  78     82     4958   5026   Ljava/lang/Exception;
        //  78     82     4950   5061   Any
        //  84     88     4958   5026   Ljava/lang/Exception;
        //  84     88     4950   5061   Any
        //  90     95     4958   5026   Ljava/lang/Exception;
        //  90     95     4950   5061   Any
        //  97     102    4958   5026   Ljava/lang/Exception;
        //  97     102    4950   5061   Any
        //  104    109    4958   5026   Ljava/lang/Exception;
        //  104    109    4950   5061   Any
        //  113    118    4958   5026   Ljava/lang/Exception;
        //  113    118    4950   5061   Any
        //  119    123    4958   5026   Ljava/lang/Exception;
        //  119    123    4950   5061   Any
        //  125    130    4958   5026   Ljava/lang/Exception;
        //  125    130    4950   5061   Any
        //  132    137    4958   5026   Ljava/lang/Exception;
        //  132    137    4950   5061   Any
        //  139    143    4958   5026   Ljava/lang/Exception;
        //  139    143    4950   5061   Any
        //  145    150    4958   5026   Ljava/lang/Exception;
        //  145    150    4950   5061   Any
        //  152    157    4958   5026   Ljava/lang/Exception;
        //  152    157    4950   5061   Any
        //  159    163    4958   5026   Ljava/lang/Exception;
        //  159    163    4950   5061   Any
        //  164    168    4958   5026   Ljava/lang/Exception;
        //  164    168    4950   5061   Any
        //  169    173    4958   5026   Ljava/lang/Exception;
        //  169    173    4950   5061   Any
        //  179    184    4958   5026   Ljava/lang/Exception;
        //  179    184    4950   5061   Any
        //  184    188    4958   5026   Ljava/lang/Exception;
        //  184    188    4950   5061   Any
        //  189    193    4958   5026   Ljava/lang/Exception;
        //  189    193    4950   5061   Any
        //  194    198    4958   5026   Ljava/lang/Exception;
        //  194    198    4950   5061   Any
        //  199    203    4958   5026   Ljava/lang/Exception;
        //  199    203    4950   5061   Any
        //  205    210    4958   5026   Ljava/lang/Exception;
        //  205    210    4950   5061   Any
        //  212    217    4958   5026   Ljava/lang/Exception;
        //  212    217    4950   5061   Any
        //  219    224    4958   5026   Ljava/lang/Exception;
        //  219    224    4950   5061   Any
        //  226    230    4958   5026   Ljava/lang/Exception;
        //  226    230    4950   5061   Any
        //  232    237    4958   5026   Ljava/lang/Exception;
        //  232    237    4950   5061   Any
        //  239    244    4958   5026   Ljava/lang/Exception;
        //  239    244    4950   5061   Any
        //  246    251    4958   5026   Ljava/lang/Exception;
        //  246    251    4950   5061   Any
        //  253    257    4958   5026   Ljava/lang/Exception;
        //  253    257    4950   5061   Any
        //  264    269    4958   5026   Ljava/lang/Exception;
        //  264    269    4950   5061   Any
        //  269    273    4958   5026   Ljava/lang/Exception;
        //  269    273    4950   5061   Any
        //  274    278    4958   5026   Ljava/lang/Exception;
        //  274    278    4950   5061   Any
        //  279    283    4958   5026   Ljava/lang/Exception;
        //  279    283    4950   5061   Any
        //  284    288    4958   5026   Ljava/lang/Exception;
        //  284    288    4950   5061   Any
        //  290    293    4958   5026   Ljava/lang/Exception;
        //  290    293    4950   5061   Any
        //  295    300    4958   5026   Ljava/lang/Exception;
        //  295    300    4950   5061   Any
        //  309    313    4958   5026   Ljava/lang/Exception;
        //  309    313    4950   5061   Any
        //  314    318    4958   5026   Ljava/lang/Exception;
        //  314    318    4950   5061   Any
        //  319    323    4958   5026   Ljava/lang/Exception;
        //  319    323    4950   5061   Any
        //  324    328    4958   5026   Ljava/lang/Exception;
        //  324    328    4950   5061   Any
        //  329    333    4958   5026   Ljava/lang/Exception;
        //  329    333    4950   5061   Any
        //  335    340    4958   5026   Ljava/lang/Exception;
        //  335    340    4950   5061   Any
        //  342    347    4958   5026   Ljava/lang/Exception;
        //  342    347    4950   5061   Any
        //  349    354    4958   5026   Ljava/lang/Exception;
        //  349    354    4950   5061   Any
        //  356    360    4958   5026   Ljava/lang/Exception;
        //  356    360    4950   5061   Any
        //  362    367    4958   5026   Ljava/lang/Exception;
        //  362    367    4950   5061   Any
        //  369    374    4958   5026   Ljava/lang/Exception;
        //  369    374    4950   5061   Any
        //  376    381    4958   5026   Ljava/lang/Exception;
        //  376    381    4950   5061   Any
        //  386    391    4958   5026   Ljava/lang/Exception;
        //  386    391    4950   5061   Any
        //  395    399    4958   5026   Ljava/lang/Exception;
        //  395    399    4950   5061   Any
        //  400    404    4958   5026   Ljava/lang/Exception;
        //  400    404    4950   5061   Any
        //  405    409    4958   5026   Ljava/lang/Exception;
        //  405    409    4950   5061   Any
        //  410    414    4958   5026   Ljava/lang/Exception;
        //  410    414    4950   5061   Any
        //  416    419    4958   5026   Ljava/lang/Exception;
        //  416    419    4950   5061   Any
        //  421    426    4958   5026   Ljava/lang/Exception;
        //  421    426    4950   5061   Any
        //  435    439    4958   5026   Ljava/lang/Exception;
        //  435    439    4950   5061   Any
        //  440    444    4958   5026   Ljava/lang/Exception;
        //  440    444    4950   5061   Any
        //  445    449    4958   5026   Ljava/lang/Exception;
        //  445    449    4950   5061   Any
        //  450    454    4958   5026   Ljava/lang/Exception;
        //  450    454    4950   5061   Any
        //  455    459    4958   5026   Ljava/lang/Exception;
        //  455    459    4950   5061   Any
        //  461    466    4958   5026   Ljava/lang/Exception;
        //  461    466    4950   5061   Any
        //  468    473    4958   5026   Ljava/lang/Exception;
        //  468    473    4950   5061   Any
        //  475    480    4958   5026   Ljava/lang/Exception;
        //  475    480    4950   5061   Any
        //  482    486    4958   5026   Ljava/lang/Exception;
        //  482    486    4950   5061   Any
        //  488    493    4958   5026   Ljava/lang/Exception;
        //  488    493    4950   5061   Any
        //  495    500    4958   5026   Ljava/lang/Exception;
        //  495    500    4950   5061   Any
        //  502    507    4958   5026   Ljava/lang/Exception;
        //  502    507    4950   5061   Any
        //  512    517    4958   5026   Ljava/lang/Exception;
        //  512    517    4950   5061   Any
        //  521    525    4958   5026   Ljava/lang/Exception;
        //  521    525    4950   5061   Any
        //  526    530    4958   5026   Ljava/lang/Exception;
        //  526    530    4950   5061   Any
        //  531    535    4958   5026   Ljava/lang/Exception;
        //  531    535    4950   5061   Any
        //  536    540    4958   5026   Ljava/lang/Exception;
        //  536    540    4950   5061   Any
        //  541    545    4958   5026   Ljava/lang/Exception;
        //  541    545    4950   5061   Any
        //  547    552    4958   5026   Ljava/lang/Exception;
        //  547    552    4950   5061   Any
        //  554    559    4958   5026   Ljava/lang/Exception;
        //  554    559    4950   5061   Any
        //  561    566    4958   5026   Ljava/lang/Exception;
        //  561    566    4950   5061   Any
        //  568    572    4958   5026   Ljava/lang/Exception;
        //  568    572    4950   5061   Any
        //  574    579    4958   5026   Ljava/lang/Exception;
        //  574    579    4950   5061   Any
        //  581    586    4958   5026   Ljava/lang/Exception;
        //  581    586    4950   5061   Any
        //  588    593    4958   5026   Ljava/lang/Exception;
        //  588    593    4950   5061   Any
        //  598    603    4958   5026   Ljava/lang/Exception;
        //  598    603    4950   5061   Any
        //  604    608    4958   5026   Ljava/lang/Exception;
        //  604    608    4950   5061   Any
        //  610    615    4958   5026   Ljava/lang/Exception;
        //  610    615    4950   5061   Any
        //  617    622    4958   5026   Ljava/lang/Exception;
        //  617    622    4950   5061   Any
        //  626    630    4958   5026   Ljava/lang/Exception;
        //  626    630    4950   5061   Any
        //  630    634    4958   5026   Ljava/lang/Exception;
        //  630    634    4950   5061   Any
        //  636    641    4958   5026   Ljava/lang/Exception;
        //  636    641    4950   5061   Any
        //  643    648    4958   5026   Ljava/lang/Exception;
        //  643    648    4950   5061   Any
        //  652    656    4958   5026   Ljava/lang/Exception;
        //  652    656    4950   5061   Any
        //  656    660    4958   5026   Ljava/lang/Exception;
        //  656    660    4950   5061   Any
        //  662    667    4958   5026   Ljava/lang/Exception;
        //  662    667    4950   5061   Any
        //  669    674    4958   5026   Ljava/lang/Exception;
        //  669    674    4950   5061   Any
        //  676    680    4958   5026   Ljava/lang/Exception;
        //  676    680    4950   5061   Any
        //  682    687    4958   5026   Ljava/lang/Exception;
        //  682    687    4950   5061   Any
        //  689    694    4958   5026   Ljava/lang/Exception;
        //  689    694    4950   5061   Any
        //  696    701    4958   5026   Ljava/lang/Exception;
        //  696    701    4950   5061   Any
        //  703    707    4958   5026   Ljava/lang/Exception;
        //  703    707    4950   5061   Any
        //  709    714    4958   5026   Ljava/lang/Exception;
        //  709    714    4950   5061   Any
        //  716    721    4958   5026   Ljava/lang/Exception;
        //  716    721    4950   5061   Any
        //  723    728    4958   5026   Ljava/lang/Exception;
        //  723    728    4950   5061   Any
        //  735    740    4958   5026   Ljava/lang/Exception;
        //  735    740    4950   5061   Any
        //  740    744    4958   5026   Ljava/lang/Exception;
        //  740    744    4950   5061   Any
        //  746    751    4958   5026   Ljava/lang/Exception;
        //  746    751    4950   5061   Any
        //  753    758    4958   5026   Ljava/lang/Exception;
        //  753    758    4950   5061   Any
        //  760    765    4958   5026   Ljava/lang/Exception;
        //  760    765    4950   5061   Any
        //  767    770    4958   5026   Ljava/lang/Exception;
        //  767    770    4950   5061   Any
        //  772    777    4958   5026   Ljava/lang/Exception;
        //  772    777    4950   5061   Any
        //  802    806    4958   5026   Ljava/lang/Exception;
        //  802    806    4950   5061   Any
        //  808    813    4958   5026   Ljava/lang/Exception;
        //  808    813    4950   5061   Any
        //  815    820    4958   5026   Ljava/lang/Exception;
        //  815    820    4950   5061   Any
        //  822    827    4958   5026   Ljava/lang/Exception;
        //  822    827    4950   5061   Any
        //  829    832    4958   5026   Ljava/lang/Exception;
        //  829    832    4950   5061   Any
        //  834    839    4958   5026   Ljava/lang/Exception;
        //  834    839    4950   5061   Any
        //  848    852    4958   5026   Ljava/lang/Exception;
        //  848    852    4950   5061   Any
        //  854    859    4958   5026   Ljava/lang/Exception;
        //  854    859    4950   5061   Any
        //  861    866    4958   5026   Ljava/lang/Exception;
        //  861    866    4950   5061   Any
        //  868    873    4958   5026   Ljava/lang/Exception;
        //  868    873    4950   5061   Any
        //  875    878    4958   5026   Ljava/lang/Exception;
        //  875    878    4950   5061   Any
        //  880    885    4958   5026   Ljava/lang/Exception;
        //  880    885    4950   5061   Any
        //  894    898    4958   5026   Ljava/lang/Exception;
        //  894    898    4950   5061   Any
        //  900    905    4958   5026   Ljava/lang/Exception;
        //  900    905    4950   5061   Any
        //  907    912    4958   5026   Ljava/lang/Exception;
        //  907    912    4950   5061   Any
        //  914    919    4958   5026   Ljava/lang/Exception;
        //  914    919    4950   5061   Any
        //  921    924    4958   5026   Ljava/lang/Exception;
        //  921    924    4950   5061   Any
        //  926    931    4958   5026   Ljava/lang/Exception;
        //  926    931    4950   5061   Any
        //  940    944    4958   5026   Ljava/lang/Exception;
        //  940    944    4950   5061   Any
        //  946    951    4958   5026   Ljava/lang/Exception;
        //  946    951    4950   5061   Any
        //  953    958    4958   5026   Ljava/lang/Exception;
        //  953    958    4950   5061   Any
        //  960    965    4958   5026   Ljava/lang/Exception;
        //  960    965    4950   5061   Any
        //  967    970    4958   5026   Ljava/lang/Exception;
        //  967    970    4950   5061   Any
        //  972    977    4958   5026   Ljava/lang/Exception;
        //  972    977    4950   5061   Any
        //  986    990    4958   5026   Ljava/lang/Exception;
        //  986    990    4950   5061   Any
        //  992    997    4958   5026   Ljava/lang/Exception;
        //  992    997    4950   5061   Any
        //  999    1004   4958   5026   Ljava/lang/Exception;
        //  999    1004   4950   5061   Any
        //  1006   1011   4958   5026   Ljava/lang/Exception;
        //  1006   1011   4950   5061   Any
        //  1013   1016   4958   5026   Ljava/lang/Exception;
        //  1013   1016   4950   5061   Any
        //  1018   1023   4958   5026   Ljava/lang/Exception;
        //  1018   1023   4950   5061   Any
        //  1035   1039   4958   5026   Ljava/lang/Exception;
        //  1035   1039   4950   5061   Any
        //  1041   1046   4958   5026   Ljava/lang/Exception;
        //  1041   1046   4950   5061   Any
        //  1048   1053   4958   5026   Ljava/lang/Exception;
        //  1048   1053   4950   5061   Any
        //  1055   1060   4958   5026   Ljava/lang/Exception;
        //  1055   1060   4950   5061   Any
        //  1062   1065   4958   5026   Ljava/lang/Exception;
        //  1062   1065   4950   5061   Any
        //  1067   1072   4958   5026   Ljava/lang/Exception;
        //  1067   1072   4950   5061   Any
        //  1081   1085   4958   5026   Ljava/lang/Exception;
        //  1081   1085   4950   5061   Any
        //  1087   1092   4958   5026   Ljava/lang/Exception;
        //  1087   1092   4950   5061   Any
        //  1094   1099   4958   5026   Ljava/lang/Exception;
        //  1094   1099   4950   5061   Any
        //  1101   1106   4958   5026   Ljava/lang/Exception;
        //  1101   1106   4950   5061   Any
        //  1108   1113   4958   5026   Ljava/lang/Exception;
        //  1108   1113   4950   5061   Any
        //  1135   1139   4958   5026   Ljava/lang/Exception;
        //  1135   1139   4950   5061   Any
        //  1141   1146   4958   5026   Ljava/lang/Exception;
        //  1141   1146   4950   5061   Any
        //  1148   1153   4958   5026   Ljava/lang/Exception;
        //  1148   1153   4950   5061   Any
        //  1155   1160   4958   5026   Ljava/lang/Exception;
        //  1155   1160   4950   5061   Any
        //  1162   1167   4958   5026   Ljava/lang/Exception;
        //  1162   1167   4950   5061   Any
        //  1174   1178   4958   5026   Ljava/lang/Exception;
        //  1174   1178   4950   5061   Any
        //  1180   1185   4958   5026   Ljava/lang/Exception;
        //  1180   1185   4950   5061   Any
        //  1187   1192   4958   5026   Ljava/lang/Exception;
        //  1187   1192   4950   5061   Any
        //  1194   1199   4958   5026   Ljava/lang/Exception;
        //  1194   1199   4950   5061   Any
        //  1208   1213   4958   5026   Ljava/lang/Exception;
        //  1208   1213   4950   5061   Any
        //  1215   1219   4958   5026   Ljava/lang/Exception;
        //  1215   1219   4950   5061   Any
        //  1221   1226   4958   5026   Ljava/lang/Exception;
        //  1221   1226   4950   5061   Any
        //  1228   1233   4958   5026   Ljava/lang/Exception;
        //  1228   1233   4950   5061   Any
        //  1235   1240   4958   5026   Ljava/lang/Exception;
        //  1235   1240   4950   5061   Any
        //  1242   1247   4958   5026   Ljava/lang/Exception;
        //  1242   1247   4950   5061   Any
        //  1254   1258   4958   5026   Ljava/lang/Exception;
        //  1254   1258   4950   5061   Any
        //  1260   1265   4958   5026   Ljava/lang/Exception;
        //  1260   1265   4950   5061   Any
        //  1267   1272   4958   5026   Ljava/lang/Exception;
        //  1267   1272   4950   5061   Any
        //  1274   1279   4958   5026   Ljava/lang/Exception;
        //  1274   1279   4950   5061   Any
        //  1288   1293   4958   5026   Ljava/lang/Exception;
        //  1288   1293   4950   5061   Any
        //  1302   1306   4958   5026   Ljava/lang/Exception;
        //  1302   1306   4950   5061   Any
        //  1308   1313   4958   5026   Ljava/lang/Exception;
        //  1308   1313   4950   5061   Any
        //  1315   1320   4958   5026   Ljava/lang/Exception;
        //  1315   1320   4950   5061   Any
        //  1322   1327   4958   5026   Ljava/lang/Exception;
        //  1322   1327   4950   5061   Any
        //  1329   1334   4958   5026   Ljava/lang/Exception;
        //  1329   1334   4950   5061   Any
        //  1343   1347   4958   5026   Ljava/lang/Exception;
        //  1343   1347   4950   5061   Any
        //  1349   1354   4958   5026   Ljava/lang/Exception;
        //  1349   1354   4950   5061   Any
        //  1356   1361   4958   5026   Ljava/lang/Exception;
        //  1356   1361   4950   5061   Any
        //  1363   1368   4958   5026   Ljava/lang/Exception;
        //  1363   1368   4950   5061   Any
        //  1370   1375   4958   5026   Ljava/lang/Exception;
        //  1370   1375   4950   5061   Any
        //  1391   1395   4958   5026   Ljava/lang/Exception;
        //  1391   1395   4950   5061   Any
        //  1397   1402   4958   5026   Ljava/lang/Exception;
        //  1397   1402   4950   5061   Any
        //  1404   1409   4958   5026   Ljava/lang/Exception;
        //  1404   1409   4950   5061   Any
        //  1411   1416   4958   5026   Ljava/lang/Exception;
        //  1411   1416   4950   5061   Any
        //  1418   1423   4958   5026   Ljava/lang/Exception;
        //  1418   1423   4950   5061   Any
        //  1432   1436   4958   5026   Ljava/lang/Exception;
        //  1432   1436   4950   5061   Any
        //  1438   1443   4958   5026   Ljava/lang/Exception;
        //  1438   1443   4950   5061   Any
        //  1445   1450   4958   5026   Ljava/lang/Exception;
        //  1445   1450   4950   5061   Any
        //  1452   1457   4958   5026   Ljava/lang/Exception;
        //  1452   1457   4950   5061   Any
        //  1459   1464   4958   5026   Ljava/lang/Exception;
        //  1459   1464   4950   5061   Any
        //  1473   1477   4958   5026   Ljava/lang/Exception;
        //  1473   1477   4950   5061   Any
        //  1479   1484   4958   5026   Ljava/lang/Exception;
        //  1479   1484   4950   5061   Any
        //  1486   1491   4958   5026   Ljava/lang/Exception;
        //  1486   1491   4950   5061   Any
        //  1493   1498   4958   5026   Ljava/lang/Exception;
        //  1493   1498   4950   5061   Any
        //  1500   1505   4958   5026   Ljava/lang/Exception;
        //  1500   1505   4950   5061   Any
        //  1521   1525   4958   5026   Ljava/lang/Exception;
        //  1521   1525   4950   5061   Any
        //  1527   1532   4958   5026   Ljava/lang/Exception;
        //  1527   1532   4950   5061   Any
        //  1534   1539   4958   5026   Ljava/lang/Exception;
        //  1534   1539   4950   5061   Any
        //  1541   1546   4958   5026   Ljava/lang/Exception;
        //  1541   1546   4950   5061   Any
        //  1548   1553   4958   5026   Ljava/lang/Exception;
        //  1548   1553   4950   5061   Any
        //  1581   1584   4958   5026   Ljava/lang/Exception;
        //  1581   1584   4950   5061   Any
        //  1594   1599   4958   5026   Ljava/lang/Exception;
        //  1594   1599   4950   5061   Any
        //  1599   1603   4958   5026   Ljava/lang/Exception;
        //  1599   1603   4950   5061   Any
        //  1605   1610   4958   5026   Ljava/lang/Exception;
        //  1605   1610   4950   5061   Any
        //  1612   1617   4958   5026   Ljava/lang/Exception;
        //  1612   1617   4950   5061   Any
        //  1621   1626   4958   5026   Ljava/lang/Exception;
        //  1621   1626   4950   5061   Any
        //  1626   1630   4958   5026   Ljava/lang/Exception;
        //  1626   1630   4950   5061   Any
        //  1632   1637   4958   5026   Ljava/lang/Exception;
        //  1632   1637   4950   5061   Any
        //  1639   1644   4958   5026   Ljava/lang/Exception;
        //  1639   1644   4950   5061   Any
        //  1646   1651   4958   5026   Ljava/lang/Exception;
        //  1646   1651   4950   5061   Any
        //  1653   1658   4958   5026   Ljava/lang/Exception;
        //  1653   1658   4950   5061   Any
        //  1665   1669   4958   5026   Ljava/lang/Exception;
        //  1665   1669   4950   5061   Any
        //  1671   1676   4958   5026   Ljava/lang/Exception;
        //  1671   1676   4950   5061   Any
        //  1678   1683   4958   5026   Ljava/lang/Exception;
        //  1678   1683   4950   5061   Any
        //  1685   1690   4958   5026   Ljava/lang/Exception;
        //  1685   1690   4950   5061   Any
        //  1704   1708   4958   5026   Ljava/lang/Exception;
        //  1704   1708   4950   5061   Any
        //  1710   1715   4958   5026   Ljava/lang/Exception;
        //  1710   1715   4950   5061   Any
        //  1717   1722   4958   5026   Ljava/lang/Exception;
        //  1717   1722   4950   5061   Any
        //  1724   1729   4958   5026   Ljava/lang/Exception;
        //  1724   1729   4950   5061   Any
        //  1731   1736   4958   5026   Ljava/lang/Exception;
        //  1731   1736   4950   5061   Any
        //  1743   1747   4958   5026   Ljava/lang/Exception;
        //  1743   1747   4950   5061   Any
        //  1749   1754   4958   5026   Ljava/lang/Exception;
        //  1749   1754   4950   5061   Any
        //  1756   1761   4958   5026   Ljava/lang/Exception;
        //  1756   1761   4950   5061   Any
        //  1763   1768   4958   5026   Ljava/lang/Exception;
        //  1763   1768   4950   5061   Any
        //  1782   1786   4958   5026   Ljava/lang/Exception;
        //  1782   1786   4950   5061   Any
        //  1788   1793   4958   5026   Ljava/lang/Exception;
        //  1788   1793   4950   5061   Any
        //  1795   1800   4958   5026   Ljava/lang/Exception;
        //  1795   1800   4950   5061   Any
        //  1802   1807   4958   5026   Ljava/lang/Exception;
        //  1802   1807   4950   5061   Any
        //  1817   1822   4958   5026   Ljava/lang/Exception;
        //  1817   1822   4950   5061   Any
        //  1824   1829   4958   5026   Ljava/lang/Exception;
        //  1824   1829   4950   5061   Any
        //  1836   1841   4958   5026   Ljava/lang/Exception;
        //  1836   1841   4950   5061   Any
        //  1841   1846   4958   5026   Ljava/lang/Exception;
        //  1841   1846   4950   5061   Any
        //  1853   1858   4958   5026   Ljava/lang/Exception;
        //  1853   1858   4950   5061   Any
        //  1858   1862   4958   5026   Ljava/lang/Exception;
        //  1858   1862   4950   5061   Any
        //  1864   1869   4958   5026   Ljava/lang/Exception;
        //  1864   1869   4950   5061   Any
        //  1871   1876   4958   5026   Ljava/lang/Exception;
        //  1871   1876   4950   5061   Any
        //  1880   1885   4958   5026   Ljava/lang/Exception;
        //  1880   1885   4950   5061   Any
        //  1896   1900   4958   5026   Ljava/lang/Exception;
        //  1896   1900   4950   5061   Any
        //  1902   1907   4958   5026   Ljava/lang/Exception;
        //  1902   1907   4950   5061   Any
        //  1909   1914   4958   5026   Ljava/lang/Exception;
        //  1909   1914   4950   5061   Any
        //  1916   1921   4958   5026   Ljava/lang/Exception;
        //  1916   1921   4950   5061   Any
        //  1923   1926   4958   5026   Ljava/lang/Exception;
        //  1923   1926   4950   5061   Any
        //  1928   1933   4958   5026   Ljava/lang/Exception;
        //  1928   1933   4950   5061   Any
        //  1942   1946   4958   5026   Ljava/lang/Exception;
        //  1942   1946   4950   5061   Any
        //  1948   1953   4958   5026   Ljava/lang/Exception;
        //  1948   1953   4950   5061   Any
        //  1955   1960   4958   5026   Ljava/lang/Exception;
        //  1955   1960   4950   5061   Any
        //  1962   1967   4958   5026   Ljava/lang/Exception;
        //  1962   1967   4950   5061   Any
        //  1969   1972   4958   5026   Ljava/lang/Exception;
        //  1969   1972   4950   5061   Any
        //  1974   1979   4958   5026   Ljava/lang/Exception;
        //  1974   1979   4950   5061   Any
        //  1988   1992   4958   5026   Ljava/lang/Exception;
        //  1988   1992   4950   5061   Any
        //  1994   1999   4958   5026   Ljava/lang/Exception;
        //  1994   1999   4950   5061   Any
        //  2001   2006   4958   5026   Ljava/lang/Exception;
        //  2001   2006   4950   5061   Any
        //  2008   2013   4958   5026   Ljava/lang/Exception;
        //  2008   2013   4950   5061   Any
        //  2015   2018   4958   5026   Ljava/lang/Exception;
        //  2015   2018   4950   5061   Any
        //  2020   2025   4958   5026   Ljava/lang/Exception;
        //  2020   2025   4950   5061   Any
        //  2037   2041   4958   5026   Ljava/lang/Exception;
        //  2037   2041   4950   5061   Any
        //  2043   2048   4958   5026   Ljava/lang/Exception;
        //  2043   2048   4950   5061   Any
        //  2050   2055   4958   5026   Ljava/lang/Exception;
        //  2050   2055   4950   5061   Any
        //  2057   2062   4958   5026   Ljava/lang/Exception;
        //  2057   2062   4950   5061   Any
        //  2064   2069   4958   5026   Ljava/lang/Exception;
        //  2064   2069   4950   5061   Any
        //  2091   2095   4958   5026   Ljava/lang/Exception;
        //  2091   2095   4950   5061   Any
        //  2118   2122   4958   5026   Ljava/lang/Exception;
        //  2118   2122   4950   5061   Any
        //  2124   2129   4958   5026   Ljava/lang/Exception;
        //  2124   2129   4950   5061   Any
        //  2131   2136   4958   5026   Ljava/lang/Exception;
        //  2131   2136   4950   5061   Any
        //  2138   2143   4958   5026   Ljava/lang/Exception;
        //  2138   2143   4950   5061   Any
        //  2145   2150   4958   5026   Ljava/lang/Exception;
        //  2145   2150   4950   5061   Any
        //  2157   2161   4958   5026   Ljava/lang/Exception;
        //  2157   2161   4950   5061   Any
        //  2163   2168   4958   5026   Ljava/lang/Exception;
        //  2163   2168   4950   5061   Any
        //  2170   2175   4958   5026   Ljava/lang/Exception;
        //  2170   2175   4950   5061   Any
        //  2177   2182   4958   5026   Ljava/lang/Exception;
        //  2177   2182   4950   5061   Any
        //  2191   2196   4958   5026   Ljava/lang/Exception;
        //  2191   2196   4950   5061   Any
        //  2198   2202   4958   5026   Ljava/lang/Exception;
        //  2198   2202   4950   5061   Any
        //  2204   2209   4958   5026   Ljava/lang/Exception;
        //  2204   2209   4950   5061   Any
        //  2211   2216   4958   5026   Ljava/lang/Exception;
        //  2211   2216   4950   5061   Any
        //  2218   2223   4958   5026   Ljava/lang/Exception;
        //  2218   2223   4950   5061   Any
        //  2225   2230   4958   5026   Ljava/lang/Exception;
        //  2225   2230   4950   5061   Any
        //  2237   2241   4958   5026   Ljava/lang/Exception;
        //  2237   2241   4950   5061   Any
        //  2243   2248   4958   5026   Ljava/lang/Exception;
        //  2243   2248   4950   5061   Any
        //  2250   2255   4958   5026   Ljava/lang/Exception;
        //  2250   2255   4950   5061   Any
        //  2257   2262   4958   5026   Ljava/lang/Exception;
        //  2257   2262   4950   5061   Any
        //  2271   2276   4958   5026   Ljava/lang/Exception;
        //  2271   2276   4950   5061   Any
        //  2285   2289   4958   5026   Ljava/lang/Exception;
        //  2285   2289   4950   5061   Any
        //  2291   2296   4958   5026   Ljava/lang/Exception;
        //  2291   2296   4950   5061   Any
        //  2298   2303   4958   5026   Ljava/lang/Exception;
        //  2298   2303   4950   5061   Any
        //  2305   2310   4958   5026   Ljava/lang/Exception;
        //  2305   2310   4950   5061   Any
        //  2312   2317   4958   5026   Ljava/lang/Exception;
        //  2312   2317   4950   5061   Any
        //  2326   2330   4958   5026   Ljava/lang/Exception;
        //  2326   2330   4950   5061   Any
        //  2332   2337   4958   5026   Ljava/lang/Exception;
        //  2332   2337   4950   5061   Any
        //  2339   2344   4958   5026   Ljava/lang/Exception;
        //  2339   2344   4950   5061   Any
        //  2346   2351   4958   5026   Ljava/lang/Exception;
        //  2346   2351   4950   5061   Any
        //  2353   2358   4958   5026   Ljava/lang/Exception;
        //  2353   2358   4950   5061   Any
        //  2374   2378   4958   5026   Ljava/lang/Exception;
        //  2374   2378   4950   5061   Any
        //  2380   2385   4958   5026   Ljava/lang/Exception;
        //  2380   2385   4950   5061   Any
        //  2387   2392   4958   5026   Ljava/lang/Exception;
        //  2387   2392   4950   5061   Any
        //  2394   2399   4958   5026   Ljava/lang/Exception;
        //  2394   2399   4950   5061   Any
        //  2401   2406   4958   5026   Ljava/lang/Exception;
        //  2401   2406   4950   5061   Any
        //  2415   2419   4958   5026   Ljava/lang/Exception;
        //  2415   2419   4950   5061   Any
        //  2421   2426   4958   5026   Ljava/lang/Exception;
        //  2421   2426   4950   5061   Any
        //  2428   2433   4958   5026   Ljava/lang/Exception;
        //  2428   2433   4950   5061   Any
        //  2435   2440   4958   5026   Ljava/lang/Exception;
        //  2435   2440   4950   5061   Any
        //  2442   2447   4958   5026   Ljava/lang/Exception;
        //  2442   2447   4950   5061   Any
        //  2456   2460   4958   5026   Ljava/lang/Exception;
        //  2456   2460   4950   5061   Any
        //  2462   2467   4958   5026   Ljava/lang/Exception;
        //  2462   2467   4950   5061   Any
        //  2469   2474   4958   5026   Ljava/lang/Exception;
        //  2469   2474   4950   5061   Any
        //  2476   2481   4958   5026   Ljava/lang/Exception;
        //  2476   2481   4950   5061   Any
        //  2483   2488   4958   5026   Ljava/lang/Exception;
        //  2483   2488   4950   5061   Any
        //  2504   2508   4958   5026   Ljava/lang/Exception;
        //  2504   2508   4950   5061   Any
        //  2510   2515   4958   5026   Ljava/lang/Exception;
        //  2510   2515   4950   5061   Any
        //  2517   2522   4958   5026   Ljava/lang/Exception;
        //  2517   2522   4950   5061   Any
        //  2524   2529   4958   5026   Ljava/lang/Exception;
        //  2524   2529   4950   5061   Any
        //  2531   2536   4958   5026   Ljava/lang/Exception;
        //  2531   2536   4950   5061   Any
        //  2566   2569   4958   5026   Ljava/lang/Exception;
        //  2566   2569   4950   5061   Any
        //  2579   2584   4958   5026   Ljava/lang/Exception;
        //  2579   2584   4950   5061   Any
        //  2584   2588   4958   5026   Ljava/lang/Exception;
        //  2584   2588   4950   5061   Any
        //  2590   2595   4958   5026   Ljava/lang/Exception;
        //  2590   2595   4950   5061   Any
        //  2597   2602   4958   5026   Ljava/lang/Exception;
        //  2597   2602   4950   5061   Any
        //  2604   2609   4958   5026   Ljava/lang/Exception;
        //  2604   2609   4950   5061   Any
        //  2611   2616   4958   5026   Ljava/lang/Exception;
        //  2611   2616   4950   5061   Any
        //  2623   2627   4958   5026   Ljava/lang/Exception;
        //  2623   2627   4950   5061   Any
        //  2629   2634   4958   5026   Ljava/lang/Exception;
        //  2629   2634   4950   5061   Any
        //  2636   2641   4958   5026   Ljava/lang/Exception;
        //  2636   2641   4950   5061   Any
        //  2643   2648   4958   5026   Ljava/lang/Exception;
        //  2643   2648   4950   5061   Any
        //  2662   2666   4958   5026   Ljava/lang/Exception;
        //  2662   2666   4950   5061   Any
        //  2668   2673   4958   5026   Ljava/lang/Exception;
        //  2668   2673   4950   5061   Any
        //  2675   2680   4958   5026   Ljava/lang/Exception;
        //  2675   2680   4950   5061   Any
        //  2682   2687   4958   5026   Ljava/lang/Exception;
        //  2682   2687   4950   5061   Any
        //  2689   2694   4958   5026   Ljava/lang/Exception;
        //  2689   2694   4950   5061   Any
        //  2701   2705   4958   5026   Ljava/lang/Exception;
        //  2701   2705   4950   5061   Any
        //  2707   2712   4958   5026   Ljava/lang/Exception;
        //  2707   2712   4950   5061   Any
        //  2714   2719   4958   5026   Ljava/lang/Exception;
        //  2714   2719   4950   5061   Any
        //  2721   2726   4958   5026   Ljava/lang/Exception;
        //  2721   2726   4950   5061   Any
        //  2740   2744   4958   5026   Ljava/lang/Exception;
        //  2740   2744   4950   5061   Any
        //  2746   2751   4958   5026   Ljava/lang/Exception;
        //  2746   2751   4950   5061   Any
        //  2753   2758   4958   5026   Ljava/lang/Exception;
        //  2753   2758   4950   5061   Any
        //  2760   2765   4958   5026   Ljava/lang/Exception;
        //  2760   2765   4950   5061   Any
        //  2773   2778   4958   5026   Ljava/lang/Exception;
        //  2773   2778   4950   5061   Any
        //  2780   2784   4958   5026   Ljava/lang/Exception;
        //  2780   2784   4950   5061   Any
        //  2786   2791   4958   5026   Ljava/lang/Exception;
        //  2786   2791   4950   5061   Any
        //  2793   2798   4958   5026   Ljava/lang/Exception;
        //  2793   2798   4950   5061   Any
        //  2802   2807   4958   5026   Ljava/lang/Exception;
        //  2802   2807   4950   5061   Any
        //  2807   2811   4958   5026   Ljava/lang/Exception;
        //  2807   2811   4950   5061   Any
        //  2813   2818   4958   5026   Ljava/lang/Exception;
        //  2813   2818   4950   5061   Any
        //  2820   2825   4958   5026   Ljava/lang/Exception;
        //  2820   2825   4950   5061   Any
        //  2829   2833   4958   5026   Ljava/lang/Exception;
        //  2829   2833   4950   5061   Any
        //  2833   2838   4958   5026   Ljava/lang/Exception;
        //  2833   2838   4950   5061   Any
        //  2845   2850   4958   5026   Ljava/lang/Exception;
        //  2845   2850   4950   5061   Any
        //  2850   2855   4958   5026   Ljava/lang/Exception;
        //  2850   2855   4950   5061   Any
        //  2862   2867   4958   5026   Ljava/lang/Exception;
        //  2862   2867   4950   5061   Any
        //  2867   2871   4958   5026   Ljava/lang/Exception;
        //  2867   2871   4950   5061   Any
        //  2873   2878   4958   5026   Ljava/lang/Exception;
        //  2873   2878   4950   5061   Any
        //  2880   2885   4958   5026   Ljava/lang/Exception;
        //  2880   2885   4950   5061   Any
        //  2889   2894   4958   5026   Ljava/lang/Exception;
        //  2889   2894   4950   5061   Any
        //  2905   2909   4958   5026   Ljava/lang/Exception;
        //  2905   2909   4950   5061   Any
        //  2911   2916   4958   5026   Ljava/lang/Exception;
        //  2911   2916   4950   5061   Any
        //  2918   2923   4958   5026   Ljava/lang/Exception;
        //  2918   2923   4950   5061   Any
        //  2925   2930   4958   5026   Ljava/lang/Exception;
        //  2925   2930   4950   5061   Any
        //  2932   2937   4958   5026   Ljava/lang/Exception;
        //  2932   2937   4950   5061   Any
        //  2977   2982   4958   5026   Ljava/lang/Exception;
        //  2977   2982   4950   5061   Any
        //  2984   2988   4958   5026   Ljava/lang/Exception;
        //  2984   2988   4950   5061   Any
        //  2990   2995   4958   5026   Ljava/lang/Exception;
        //  2990   2995   4950   5061   Any
        //  2997   3002   4958   5026   Ljava/lang/Exception;
        //  2997   3002   4950   5061   Any
        //  3004   3009   4958   5026   Ljava/lang/Exception;
        //  3004   3009   4950   5061   Any
        //  3011   3016   4958   5026   Ljava/lang/Exception;
        //  3011   3016   4950   5061   Any
        //  3023   3027   4958   5026   Ljava/lang/Exception;
        //  3023   3027   4950   5061   Any
        //  3029   3034   4958   5026   Ljava/lang/Exception;
        //  3029   3034   4950   5061   Any
        //  3036   3041   4958   5026   Ljava/lang/Exception;
        //  3036   3041   4950   5061   Any
        //  3043   3048   4958   5026   Ljava/lang/Exception;
        //  3043   3048   4950   5061   Any
        //  3057   3062   4958   5026   Ljava/lang/Exception;
        //  3057   3062   4950   5061   Any
        //  3064   3068   4958   5026   Ljava/lang/Exception;
        //  3064   3068   4950   5061   Any
        //  3070   3075   4958   5026   Ljava/lang/Exception;
        //  3070   3075   4950   5061   Any
        //  3077   3082   4958   5026   Ljava/lang/Exception;
        //  3077   3082   4950   5061   Any
        //  3084   3089   4958   5026   Ljava/lang/Exception;
        //  3084   3089   4950   5061   Any
        //  3091   3096   4958   5026   Ljava/lang/Exception;
        //  3091   3096   4950   5061   Any
        //  3103   3107   4958   5026   Ljava/lang/Exception;
        //  3103   3107   4950   5061   Any
        //  3109   3114   4958   5026   Ljava/lang/Exception;
        //  3109   3114   4950   5061   Any
        //  3116   3121   4958   5026   Ljava/lang/Exception;
        //  3116   3121   4950   5061   Any
        //  3123   3128   4958   5026   Ljava/lang/Exception;
        //  3123   3128   4950   5061   Any
        //  3137   3142   4958   5026   Ljava/lang/Exception;
        //  3137   3142   4950   5061   Any
        //  3151   3155   4958   5026   Ljava/lang/Exception;
        //  3151   3155   4950   5061   Any
        //  3157   3162   4958   5026   Ljava/lang/Exception;
        //  3157   3162   4950   5061   Any
        //  3164   3169   4958   5026   Ljava/lang/Exception;
        //  3164   3169   4950   5061   Any
        //  3171   3176   4958   5026   Ljava/lang/Exception;
        //  3171   3176   4950   5061   Any
        //  3178   3183   4958   5026   Ljava/lang/Exception;
        //  3178   3183   4950   5061   Any
        //  3192   3196   4958   5026   Ljava/lang/Exception;
        //  3192   3196   4950   5061   Any
        //  3198   3203   4958   5026   Ljava/lang/Exception;
        //  3198   3203   4950   5061   Any
        //  3205   3210   4958   5026   Ljava/lang/Exception;
        //  3205   3210   4950   5061   Any
        //  3212   3217   4958   5026   Ljava/lang/Exception;
        //  3212   3217   4950   5061   Any
        //  3219   3224   4958   5026   Ljava/lang/Exception;
        //  3219   3224   4950   5061   Any
        //  3240   3244   4958   5026   Ljava/lang/Exception;
        //  3240   3244   4950   5061   Any
        //  3246   3251   4958   5026   Ljava/lang/Exception;
        //  3246   3251   4950   5061   Any
        //  3253   3258   4958   5026   Ljava/lang/Exception;
        //  3253   3258   4950   5061   Any
        //  3260   3265   4958   5026   Ljava/lang/Exception;
        //  3260   3265   4950   5061   Any
        //  3267   3272   4958   5026   Ljava/lang/Exception;
        //  3267   3272   4950   5061   Any
        //  3281   3285   4958   5026   Ljava/lang/Exception;
        //  3281   3285   4950   5061   Any
        //  3287   3292   4958   5026   Ljava/lang/Exception;
        //  3287   3292   4950   5061   Any
        //  3294   3299   4958   5026   Ljava/lang/Exception;
        //  3294   3299   4950   5061   Any
        //  3301   3306   4958   5026   Ljava/lang/Exception;
        //  3301   3306   4950   5061   Any
        //  3308   3313   4958   5026   Ljava/lang/Exception;
        //  3308   3313   4950   5061   Any
        //  3322   3326   4958   5026   Ljava/lang/Exception;
        //  3322   3326   4950   5061   Any
        //  3328   3333   4958   5026   Ljava/lang/Exception;
        //  3328   3333   4950   5061   Any
        //  3335   3340   4958   5026   Ljava/lang/Exception;
        //  3335   3340   4950   5061   Any
        //  3342   3347   4958   5026   Ljava/lang/Exception;
        //  3342   3347   4950   5061   Any
        //  3349   3354   4958   5026   Ljava/lang/Exception;
        //  3349   3354   4950   5061   Any
        //  3370   3374   4958   5026   Ljava/lang/Exception;
        //  3370   3374   4950   5061   Any
        //  3376   3381   4958   5026   Ljava/lang/Exception;
        //  3376   3381   4950   5061   Any
        //  3383   3388   4958   5026   Ljava/lang/Exception;
        //  3383   3388   4950   5061   Any
        //  3390   3395   4958   5026   Ljava/lang/Exception;
        //  3390   3395   4950   5061   Any
        //  3397   3402   4958   5026   Ljava/lang/Exception;
        //  3397   3402   4950   5061   Any
        //  3432   3435   4958   5026   Ljava/lang/Exception;
        //  3432   3435   4950   5061   Any
        //  3445   3450   4958   5026   Ljava/lang/Exception;
        //  3445   3450   4950   5061   Any
        //  3450   3454   4958   5026   Ljava/lang/Exception;
        //  3450   3454   4950   5061   Any
        //  3456   3461   4958   5026   Ljava/lang/Exception;
        //  3456   3461   4950   5061   Any
        //  3463   3468   4958   5026   Ljava/lang/Exception;
        //  3463   3468   4950   5061   Any
        //  3470   3475   4958   5026   Ljava/lang/Exception;
        //  3470   3475   4950   5061   Any
        //  3477   3480   4958   5026   Ljava/lang/Exception;
        //  3477   3480   4950   5061   Any
        //  3482   3487   4958   5026   Ljava/lang/Exception;
        //  3482   3487   4950   5061   Any
        //  3496   3500   4958   5026   Ljava/lang/Exception;
        //  3496   3500   4950   5061   Any
        //  3502   3507   4958   5026   Ljava/lang/Exception;
        //  3502   3507   4950   5061   Any
        //  3509   3514   4958   5026   Ljava/lang/Exception;
        //  3509   3514   4950   5061   Any
        //  3516   3521   4958   5026   Ljava/lang/Exception;
        //  3516   3521   4950   5061   Any
        //  3523   3528   4958   5026   Ljava/lang/Exception;
        //  3523   3528   4950   5061   Any
        //  3535   3539   4958   5026   Ljava/lang/Exception;
        //  3535   3539   4950   5061   Any
        //  3541   3546   4958   5026   Ljava/lang/Exception;
        //  3541   3546   4950   5061   Any
        //  3548   3553   4958   5026   Ljava/lang/Exception;
        //  3548   3553   4950   5061   Any
        //  3555   3560   4958   5026   Ljava/lang/Exception;
        //  3555   3560   4950   5061   Any
        //  3574   3578   4958   5026   Ljava/lang/Exception;
        //  3574   3578   4950   5061   Any
        //  3580   3585   4958   5026   Ljava/lang/Exception;
        //  3580   3585   4950   5061   Any
        //  3587   3592   4958   5026   Ljava/lang/Exception;
        //  3587   3592   4950   5061   Any
        //  3594   3599   4958   5026   Ljava/lang/Exception;
        //  3594   3599   4950   5061   Any
        //  3601   3606   4958   5026   Ljava/lang/Exception;
        //  3601   3606   4950   5061   Any
        //  3613   3617   4958   5026   Ljava/lang/Exception;
        //  3613   3617   4950   5061   Any
        //  3619   3624   4958   5026   Ljava/lang/Exception;
        //  3619   3624   4950   5061   Any
        //  3626   3631   4958   5026   Ljava/lang/Exception;
        //  3626   3631   4950   5061   Any
        //  3633   3638   4958   5026   Ljava/lang/Exception;
        //  3633   3638   4950   5061   Any
        //  3652   3656   4958   5026   Ljava/lang/Exception;
        //  3652   3656   4950   5061   Any
        //  3658   3663   4958   5026   Ljava/lang/Exception;
        //  3658   3663   4950   5061   Any
        //  3665   3670   4958   5026   Ljava/lang/Exception;
        //  3665   3670   4950   5061   Any
        //  3672   3677   4958   5026   Ljava/lang/Exception;
        //  3672   3677   4950   5061   Any
        //  3685   3690   4958   5026   Ljava/lang/Exception;
        //  3685   3690   4950   5061   Any
        //  3692   3696   4958   5026   Ljava/lang/Exception;
        //  3692   3696   4950   5061   Any
        //  3698   3703   4958   5026   Ljava/lang/Exception;
        //  3698   3703   4950   5061   Any
        //  3705   3710   4958   5026   Ljava/lang/Exception;
        //  3705   3710   4950   5061   Any
        //  3714   3719   4958   5026   Ljava/lang/Exception;
        //  3714   3719   4950   5061   Any
        //  3719   3723   4958   5026   Ljava/lang/Exception;
        //  3719   3723   4950   5061   Any
        //  3725   3730   4958   5026   Ljava/lang/Exception;
        //  3725   3730   4950   5061   Any
        //  3732   3737   4958   5026   Ljava/lang/Exception;
        //  3732   3737   4950   5061   Any
        //  3741   3745   4958   5026   Ljava/lang/Exception;
        //  3741   3745   4950   5061   Any
        //  3745   3750   4958   5026   Ljava/lang/Exception;
        //  3745   3750   4950   5061   Any
        //  3757   3762   4958   5026   Ljava/lang/Exception;
        //  3757   3762   4950   5061   Any
        //  3762   3767   4958   5026   Ljava/lang/Exception;
        //  3762   3767   4950   5061   Any
        //  3774   3779   4958   5026   Ljava/lang/Exception;
        //  3774   3779   4950   5061   Any
        //  3779   3783   4958   5026   Ljava/lang/Exception;
        //  3779   3783   4950   5061   Any
        //  3785   3790   4958   5026   Ljava/lang/Exception;
        //  3785   3790   4950   5061   Any
        //  3792   3797   4958   5026   Ljava/lang/Exception;
        //  3792   3797   4950   5061   Any
        //  3801   3806   4958   5026   Ljava/lang/Exception;
        //  3801   3806   4950   5061   Any
        //  3840   3844   4958   5026   Ljava/lang/Exception;
        //  3840   3844   4950   5061   Any
        //  3846   3851   4958   5026   Ljava/lang/Exception;
        //  3846   3851   4950   5061   Any
        //  3853   3858   4958   5026   Ljava/lang/Exception;
        //  3853   3858   4950   5061   Any
        //  3862   3867   4958   5026   Ljava/lang/Exception;
        //  3862   3867   4950   5061   Any
        //  3867   3871   4958   5026   Ljava/lang/Exception;
        //  3867   3871   4950   5061   Any
        //  3873   3878   4958   5026   Ljava/lang/Exception;
        //  3873   3878   4950   5061   Any
        //  3880   3885   4958   5026   Ljava/lang/Exception;
        //  3880   3885   4950   5061   Any
        //  3887   3892   4958   5026   Ljava/lang/Exception;
        //  3887   3892   4950   5061   Any
        //  3894   3899   4958   5026   Ljava/lang/Exception;
        //  3894   3899   4950   5061   Any
        //  3906   3910   4958   5026   Ljava/lang/Exception;
        //  3906   3910   4950   5061   Any
        //  3912   3917   4958   5026   Ljava/lang/Exception;
        //  3912   3917   4950   5061   Any
        //  3919   3924   4958   5026   Ljava/lang/Exception;
        //  3919   3924   4950   5061   Any
        //  3926   3931   4958   5026   Ljava/lang/Exception;
        //  3926   3931   4950   5061   Any
        //  3945   3949   4958   5026   Ljava/lang/Exception;
        //  3945   3949   4950   5061   Any
        //  3951   3956   4958   5026   Ljava/lang/Exception;
        //  3951   3956   4950   5061   Any
        //  3958   3963   4958   5026   Ljava/lang/Exception;
        //  3958   3963   4950   5061   Any
        //  3965   3970   4958   5026   Ljava/lang/Exception;
        //  3965   3970   4950   5061   Any
        //  3972   3977   4958   5026   Ljava/lang/Exception;
        //  3972   3977   4950   5061   Any
        //  3984   3988   4958   5026   Ljava/lang/Exception;
        //  3984   3988   4950   5061   Any
        //  3990   3995   4958   5026   Ljava/lang/Exception;
        //  3990   3995   4950   5061   Any
        //  3997   4002   4958   5026   Ljava/lang/Exception;
        //  3997   4002   4950   5061   Any
        //  4004   4009   4958   5026   Ljava/lang/Exception;
        //  4004   4009   4950   5061   Any
        //  4023   4027   4958   5026   Ljava/lang/Exception;
        //  4023   4027   4950   5061   Any
        //  4029   4034   4958   5026   Ljava/lang/Exception;
        //  4029   4034   4950   5061   Any
        //  4036   4041   4958   5026   Ljava/lang/Exception;
        //  4036   4041   4950   5061   Any
        //  4043   4048   4958   5026   Ljava/lang/Exception;
        //  4043   4048   4950   5061   Any
        //  4058   4063   4958   5026   Ljava/lang/Exception;
        //  4058   4063   4950   5061   Any
        //  4065   4070   4958   5026   Ljava/lang/Exception;
        //  4065   4070   4950   5061   Any
        //  4077   4082   4958   5026   Ljava/lang/Exception;
        //  4077   4082   4950   5061   Any
        //  4082   4087   4958   5026   Ljava/lang/Exception;
        //  4082   4087   4950   5061   Any
        //  4094   4099   4958   5026   Ljava/lang/Exception;
        //  4094   4099   4950   5061   Any
        //  4099   4103   4958   5026   Ljava/lang/Exception;
        //  4099   4103   4950   5061   Any
        //  4105   4110   4958   5026   Ljava/lang/Exception;
        //  4105   4110   4950   5061   Any
        //  4112   4117   4958   5026   Ljava/lang/Exception;
        //  4112   4117   4950   5061   Any
        //  4121   4126   4958   5026   Ljava/lang/Exception;
        //  4121   4126   4950   5061   Any
        //  4134   4138   4958   5026   Ljava/lang/Exception;
        //  4134   4138   4950   5061   Any
        //  4140   4145   4958   5026   Ljava/lang/Exception;
        //  4140   4145   4950   5061   Any
        //  4147   4152   4958   5026   Ljava/lang/Exception;
        //  4147   4152   4950   5061   Any
        //  4154   4159   4958   5026   Ljava/lang/Exception;
        //  4154   4159   4950   5061   Any
        //  4166   4170   4958   5026   Ljava/lang/Exception;
        //  4166   4170   4950   5061   Any
        //  4172   4177   4958   5026   Ljava/lang/Exception;
        //  4172   4177   4950   5061   Any
        //  4179   4184   4958   5026   Ljava/lang/Exception;
        //  4179   4184   4950   5061   Any
        //  4186   4190   4958   5026   Ljava/lang/Exception;
        //  4186   4190   4950   5061   Any
        //  4192   4197   4958   5026   Ljava/lang/Exception;
        //  4192   4197   4950   5061   Any
        //  4204   4209   4958   5026   Ljava/lang/Exception;
        //  4204   4209   4950   5061   Any
        //  4211   4215   4958   5026   Ljava/lang/Exception;
        //  4211   4215   4950   5061   Any
        //  4216   4220   4958   5026   Ljava/lang/Exception;
        //  4216   4220   4950   5061   Any
        //  4221   4225   4958   5026   Ljava/lang/Exception;
        //  4221   4225   4950   5061   Any
        //  4226   4230   4958   5026   Ljava/lang/Exception;
        //  4226   4230   4950   5061   Any
        //  4232   4236   4958   5026   Ljava/lang/Exception;
        //  4232   4236   4950   5061   Any
        //  4237   4241   4958   5026   Ljava/lang/Exception;
        //  4237   4241   4950   5061   Any
        //  4242   4246   4958   5026   Ljava/lang/Exception;
        //  4242   4246   4950   5061   Any
        //  4247   4251   4958   5026   Ljava/lang/Exception;
        //  4247   4251   4950   5061   Any
        //  4253   4257   4958   5026   Ljava/lang/Exception;
        //  4253   4257   4950   5061   Any
        //  4271   4276   4958   5026   Ljava/lang/Exception;
        //  4271   4276   4950   5061   Any
        //  4279   4283   4958   5026   Ljava/lang/Exception;
        //  4279   4283   4950   5061   Any
        //  4285   4290   4958   5026   Ljava/lang/Exception;
        //  4285   4290   4950   5061   Any
        //  4292   4297   4958   5026   Ljava/lang/Exception;
        //  4292   4297   4950   5061   Any
        //  4299   4303   4958   5026   Ljava/lang/Exception;
        //  4299   4303   4950   5061   Any
        //  4305   4310   4958   5026   Ljava/lang/Exception;
        //  4305   4310   4950   5061   Any
        //  4317   4322   4958   5026   Ljava/lang/Exception;
        //  4317   4322   4950   5061   Any
        //  4324   4328   4958   5026   Ljava/lang/Exception;
        //  4324   4328   4950   5061   Any
        //  4329   4333   4958   5026   Ljava/lang/Exception;
        //  4329   4333   4950   5061   Any
        //  4334   4338   4958   5026   Ljava/lang/Exception;
        //  4334   4338   4950   5061   Any
        //  4339   4343   4958   5026   Ljava/lang/Exception;
        //  4339   4343   4950   5061   Any
        //  4345   4349   4958   5026   Ljava/lang/Exception;
        //  4345   4349   4950   5061   Any
        //  4350   4354   4958   5026   Ljava/lang/Exception;
        //  4350   4354   4950   5061   Any
        //  4355   4359   4958   5026   Ljava/lang/Exception;
        //  4355   4359   4950   5061   Any
        //  4360   4364   4958   5026   Ljava/lang/Exception;
        //  4360   4364   4950   5061   Any
        //  4366   4370   4958   5026   Ljava/lang/Exception;
        //  4366   4370   4950   5061   Any
        //  4384   4389   4958   5026   Ljava/lang/Exception;
        //  4384   4389   4950   5061   Any
        //  4392   4396   4958   5026   Ljava/lang/Exception;
        //  4392   4396   4950   5061   Any
        //  4398   4403   4958   5026   Ljava/lang/Exception;
        //  4398   4403   4950   5061   Any
        //  4405   4410   4958   5026   Ljava/lang/Exception;
        //  4405   4410   4950   5061   Any
        //  4414   4418   4958   5026   Ljava/lang/Exception;
        //  4414   4418   4950   5061   Any
        //  4418   4422   4958   5026   Ljava/lang/Exception;
        //  4418   4422   4950   5061   Any
        //  4429   4433   4958   5026   Ljava/lang/Exception;
        //  4429   4433   4950   5061   Any
        //  4438   4441   4958   5026   Ljava/lang/Exception;
        //  4438   4441   4950   5061   Any
        //  4446   4451   4958   5026   Ljava/lang/Exception;
        //  4446   4451   4950   5061   Any
        //  4453   4457   4958   5026   Ljava/lang/Exception;
        //  4453   4457   4950   5061   Any
        //  4459   4464   4958   5026   Ljava/lang/Exception;
        //  4459   4464   4950   5061   Any
        //  4466   4471   4958   5026   Ljava/lang/Exception;
        //  4466   4471   4950   5061   Any
        //  4473   4478   4958   5026   Ljava/lang/Exception;
        //  4473   4478   4950   5061   Any
        //  4485   4489   4958   5026   Ljava/lang/Exception;
        //  4485   4489   4950   5061   Any
        //  4491   4496   4958   5026   Ljava/lang/Exception;
        //  4491   4496   4950   5061   Any
        //  4498   4503   4958   5026   Ljava/lang/Exception;
        //  4498   4503   4950   5061   Any
        //  4505   4509   4958   5026   Ljava/lang/Exception;
        //  4505   4509   4950   5061   Any
        //  4511   4516   4958   5026   Ljava/lang/Exception;
        //  4511   4516   4950   5061   Any
        //  4523   4528   4958   5026   Ljava/lang/Exception;
        //  4523   4528   4950   5061   Any
        //  4530   4534   4958   5026   Ljava/lang/Exception;
        //  4530   4534   4950   5061   Any
        //  4535   4539   4958   5026   Ljava/lang/Exception;
        //  4535   4539   4950   5061   Any
        //  4540   4544   4958   5026   Ljava/lang/Exception;
        //  4540   4544   4950   5061   Any
        //  4545   4549   4958   5026   Ljava/lang/Exception;
        //  4545   4549   4950   5061   Any
        //  4551   4555   4958   5026   Ljava/lang/Exception;
        //  4551   4555   4950   5061   Any
        //  4556   4560   4958   5026   Ljava/lang/Exception;
        //  4556   4560   4950   5061   Any
        //  4561   4565   4958   5026   Ljava/lang/Exception;
        //  4561   4565   4950   5061   Any
        //  4566   4570   4958   5026   Ljava/lang/Exception;
        //  4566   4570   4950   5061   Any
        //  4572   4576   4958   5026   Ljava/lang/Exception;
        //  4572   4576   4950   5061   Any
        //  4578   4582   4958   5026   Ljava/lang/Exception;
        //  4578   4582   4950   5061   Any
        //  4583   4587   4958   5026   Ljava/lang/Exception;
        //  4583   4587   4950   5061   Any
        //  4588   4592   4958   5026   Ljava/lang/Exception;
        //  4588   4592   4950   5061   Any
        //  4593   4597   4958   5026   Ljava/lang/Exception;
        //  4593   4597   4950   5061   Any
        //  4611   4616   4958   5026   Ljava/lang/Exception;
        //  4611   4616   4950   5061   Any
        //  4619   4623   4958   5026   Ljava/lang/Exception;
        //  4619   4623   4950   5061   Any
        //  4625   4630   4958   5026   Ljava/lang/Exception;
        //  4625   4630   4950   5061   Any
        //  4632   4637   4958   5026   Ljava/lang/Exception;
        //  4632   4637   4950   5061   Any
        //  4639   4643   4958   5026   Ljava/lang/Exception;
        //  4639   4643   4950   5061   Any
        //  4645   4650   4958   5026   Ljava/lang/Exception;
        //  4645   4650   4950   5061   Any
        //  4657   4662   4958   5026   Ljava/lang/Exception;
        //  4657   4662   4950   5061   Any
        //  4664   4668   4958   5026   Ljava/lang/Exception;
        //  4664   4668   4950   5061   Any
        //  4669   4673   4958   5026   Ljava/lang/Exception;
        //  4669   4673   4950   5061   Any
        //  4674   4678   4958   5026   Ljava/lang/Exception;
        //  4674   4678   4950   5061   Any
        //  4679   4683   4958   5026   Ljava/lang/Exception;
        //  4679   4683   4950   5061   Any
        //  4685   4689   4958   5026   Ljava/lang/Exception;
        //  4685   4689   4950   5061   Any
        //  4690   4694   4958   5026   Ljava/lang/Exception;
        //  4690   4694   4950   5061   Any
        //  4695   4699   4958   5026   Ljava/lang/Exception;
        //  4695   4699   4950   5061   Any
        //  4700   4704   4958   5026   Ljava/lang/Exception;
        //  4700   4704   4950   5061   Any
        //  4706   4710   4958   5026   Ljava/lang/Exception;
        //  4706   4710   4950   5061   Any
        //  4712   4716   4958   5026   Ljava/lang/Exception;
        //  4712   4716   4950   5061   Any
        //  4717   4721   4958   5026   Ljava/lang/Exception;
        //  4717   4721   4950   5061   Any
        //  4722   4726   4958   5026   Ljava/lang/Exception;
        //  4722   4726   4950   5061   Any
        //  4727   4731   4958   5026   Ljava/lang/Exception;
        //  4727   4731   4950   5061   Any
        //  4745   4750   4958   5026   Ljava/lang/Exception;
        //  4745   4750   4950   5061   Any
        //  4750   4754   4958   5026   Ljava/lang/Exception;
        //  4750   4754   4950   5061   Any
        //  4755   4759   4958   5026   Ljava/lang/Exception;
        //  4755   4759   4950   5061   Any
        //  4760   4764   4958   5026   Ljava/lang/Exception;
        //  4760   4764   4950   5061   Any
        //  4765   4769   4958   5026   Ljava/lang/Exception;
        //  4765   4769   4950   5061   Any
        //  4771   4774   4958   5026   Ljava/lang/Exception;
        //  4771   4774   4950   5061   Any
        //  4776   4781   4958   5026   Ljava/lang/Exception;
        //  4776   4781   4950   5061   Any
        //  4790   4794   4958   5026   Ljava/lang/Exception;
        //  4790   4794   4950   5061   Any
        //  4795   4799   4958   5026   Ljava/lang/Exception;
        //  4795   4799   4950   5061   Any
        //  4800   4804   4958   5026   Ljava/lang/Exception;
        //  4800   4804   4950   5061   Any
        //  4805   4809   4958   5026   Ljava/lang/Exception;
        //  4805   4809   4950   5061   Any
        //  4811   4816   4958   5026   Ljava/lang/Exception;
        //  4811   4816   4950   5061   Any
        //  4818   4823   4958   5026   Ljava/lang/Exception;
        //  4818   4823   4950   5061   Any
        //  4825   4830   4958   5026   Ljava/lang/Exception;
        //  4825   4830   4950   5061   Any
        //  4833   4838   4958   5026   Ljava/lang/Exception;
        //  4833   4838   4950   5061   Any
        //  4838   4842   4958   5026   Ljava/lang/Exception;
        //  4838   4842   4950   5061   Any
        //  4843   4847   4958   5026   Ljava/lang/Exception;
        //  4843   4847   4950   5061   Any
        //  4848   4852   4958   5026   Ljava/lang/Exception;
        //  4848   4852   4950   5061   Any
        //  4854   4858   4958   5026   Ljava/lang/Exception;
        //  4854   4858   4950   5061   Any
        //  4858   4862   4958   5026   Ljava/lang/Exception;
        //  4858   4862   4950   5061   Any
        //  4863   4867   4958   5026   Ljava/lang/Exception;
        //  4863   4867   4950   5061   Any
        //  4868   4872   4958   5026   Ljava/lang/Exception;
        //  4868   4872   4950   5061   Any
        //  4873   4877   4958   5026   Ljava/lang/Exception;
        //  4873   4877   4950   5061   Any
        //  4877   4881   4958   5026   Ljava/lang/Exception;
        //  4877   4881   4950   5061   Any
        //  4882   4886   4958   5026   Ljava/lang/Exception;
        //  4882   4886   4950   5061   Any
        //  4887   4891   4958   5026   Ljava/lang/Exception;
        //  4887   4891   4950   5061   Any
        //  4892   4896   4958   5026   Ljava/lang/Exception;
        //  4892   4896   4950   5061   Any
        //  4896   4900   4958   5026   Ljava/lang/Exception;
        //  4896   4900   4950   5061   Any
        //  4901   4905   4958   5026   Ljava/lang/Exception;
        //  4901   4905   4950   5061   Any
        //  4906   4909   4958   5026   Ljava/lang/Exception;
        //  4906   4909   4950   5061   Any
        //  4913   4917   4958   5026   Ljava/lang/Exception;
        //  4913   4917   4950   5061   Any
        //  4918   4923   4958   5026   Ljava/lang/Exception;
        //  4918   4923   4950   5061   Any
        //  4923   4927   5026   5027   Ljava/lang/Exception;
        //  4928   4932   5026   5027   Ljava/lang/Exception;
        //  4933   4936   5026   5027   Ljava/lang/Exception;
        //  4938   4942   5026   5027   Ljava/lang/Exception;
        //  4943   4947   5026   5027   Ljava/lang/Exception;
        //  4968   4971   4950   5061   Any
        //  4975   4979   4950   5061   Any
        //  4979   4984   4950   5061   Any
        //  4987   4991   4950   5061   Any
        //  4992   4996   4950   5061   Any
        //  4999   5004   4950   5061   Any
        //  5004   5008   5026   5027   Ljava/lang/Exception;
        //  5009   5013   5026   5027   Ljava/lang/Exception;
        //  5014   5017   5026   5027   Ljava/lang/Exception;
        //  5019   5023   5026   5027   Ljava/lang/Exception;
        //  5028   5032   5057   5061   Ljava/lang/Exception;
        //  5033   5037   5057   5061   Ljava/lang/Exception;
        //  5038   5041   5057   5061   Ljava/lang/Exception;
        //  5045   5049   5057   5061   Ljava/lang/Exception;
        //  5050   5055   5057   5061   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 2410 out of bounds for length 2410
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
