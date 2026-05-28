// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import android.net.Uri;
import android.graphics.RectF;
import java.util.List;
import android.graphics.Paint;
import android.view.View;

public class VideoFrameSelectorView extends View
{
    private float cornerRadius;
    private Paint cursorPaint;
    private float cursorX;
    private List frameBitmaps;
    private int frameCount;
    private float frameHeight;
    private Paint framePaint;
    private RectF frameRect;
    private float frameSpacing;
    private float frameWidth;
    private VideoFrameSelectorView$OnFrameSelectedListener onFrameSelectedListener;
    private int selectedFrameIndex;
    private Uri videoUri;
    
    public VideoFrameSelectorView(final Context context) {
        super(context);
        this.frameCount = 7;
        this.frameBitmaps = new ArrayList();
        this.selectedFrameIndex = 0;
        this.cursorX = 0.0f;
        this.framePaint = new Paint();
        this.cursorPaint = new Paint();
        this.frameRect = new RectF();
        this.frameSpacing = 1.0f;
        this.cornerRadius = 10.0f;
        this.init();
    }
    
    public VideoFrameSelectorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.frameCount = 7;
        this.frameBitmaps = new ArrayList();
        this.selectedFrameIndex = 0;
        this.cursorX = 0.0f;
        this.framePaint = new Paint();
        this.cursorPaint = new Paint();
        this.frameRect = new RectF();
        this.frameSpacing = 1.0f;
        this.cornerRadius = 10.0f;
        this.init();
    }
    
    private void init() {
        this.framePaint.setColor(-7829368);
        this.cursorPaint.setColor(-65536);
        this.cursorPaint.setStrokeWidth(5.0f);
        this.cursorPaint.setStyle(Paint$Style.STROKE);
    }
    
    private void loadFrames() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.videoUri:Landroid/net/Uri;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnonnull       10
        //     9: return         
        //    10: aload_0        
        //    11: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.frameBitmaps:Ljava/util/List;
        //    14: invokeinterface java/util/List.clear:()V
        //    19: new             Landroid/media/MediaMetadataRetriever;
        //    22: astore_1       
        //    23: aload_1        
        //    24: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    27: aload_0        
        //    28: invokevirtual   hazem/nurmontage/videoquran/views/VideoFrameSelectorView.getContext:()Landroid/content/Context;
        //    31: astore_2       
        //    32: aload_0        
        //    33: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.videoUri:Landroid/net/Uri;
        //    36: astore_3       
        //    37: aload_1        
        //    38: aload_2        
        //    39: aload_3        
        //    40: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Landroid/content/Context;Landroid/net/Uri;)V
        //    43: bipush          9
        //    45: istore          4
        //    47: aload_1        
        //    48: iload           4
        //    50: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    53: astore_2       
        //    54: aload_2        
        //    55: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    58: lstore          5
        //    60: aload_0        
        //    61: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.frameCount:I
        //    64: istore          7
        //    66: iload           7
        //    68: i2l            
        //    69: lstore          8
        //    71: lload           5
        //    73: lload           8
        //    75: ldiv           
        //    76: lstore          5
        //    78: iconst_0       
        //    79: istore          7
        //    81: aload_0        
        //    82: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.frameCount:I
        //    85: istore          10
        //    87: iload           7
        //    89: iload           10
        //    91: if_icmpge       172
        //    94: iload           7
        //    96: i2l            
        //    97: lload           5
        //    99: lmul           
        //   100: lstore          11
        //   102: ldc2_w          1000
        //   105: lstore          13
        //   107: lload           11
        //   109: lload           13
        //   111: lmul           
        //   112: lstore          11
        //   114: iconst_2       
        //   115: istore          15
        //   117: aload_1        
        //   118: lload           11
        //   120: iload           15
        //   122: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(JI)Landroid/graphics/Bitmap;
        //   125: astore          16
        //   127: aload           16
        //   129: ifnull          163
        //   132: aload_0        
        //   133: getfield        hazem/nurmontage/videoquran/views/VideoFrameSelectorView.frameBitmaps:Ljava/util/List;
        //   136: astore          17
        //   138: new             Lhazem/nurmontage/videoquran/views/VideoFrameSelectorView$BitmapFrame;
        //   141: astore          18
        //   143: aload           18
        //   145: aload_0        
        //   146: aload           16
        //   148: lload           11
        //   150: invokespecial   hazem/nurmontage/videoquran/views/VideoFrameSelectorView$BitmapFrame.<init>:(Lhazem/nurmontage/videoquran/views/VideoFrameSelectorView;Landroid/graphics/Bitmap;J)V
        //   153: aload           17
        //   155: aload           18
        //   157: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   162: pop            
        //   163: iload           7
        //   165: iconst_1       
        //   166: iadd           
        //   167: istore          7
        //   169: goto            81
        //   172: aload_1        
        //   173: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   176: goto            200
        //   179: astore_2       
        //   180: goto            201
        //   183: astore_2       
        //   184: aload_2        
        //   185: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   188: aload_1        
        //   189: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   192: goto            200
        //   195: astore_1       
        //   196: aload_1        
        //   197: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   200: return         
        //   201: aload_1        
        //   202: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   205: goto            213
        //   208: astore_1       
        //   209: aload_1        
        //   210: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   213: aload_2        
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     31     183    195    Ljava/lang/Exception;
        //  27     31     179    215    Any
        //  32     36     183    195    Ljava/lang/Exception;
        //  32     36     179    215    Any
        //  39     43     183    195    Ljava/lang/Exception;
        //  39     43     179    215    Any
        //  48     53     183    195    Ljava/lang/Exception;
        //  48     53     179    215    Any
        //  54     58     183    195    Ljava/lang/Exception;
        //  54     58     179    215    Any
        //  60     64     183    195    Ljava/lang/Exception;
        //  60     64     179    215    Any
        //  73     76     183    195    Ljava/lang/Exception;
        //  73     76     179    215    Any
        //  81     85     183    195    Ljava/lang/Exception;
        //  81     85     179    215    Any
        //  120    125    183    195    Ljava/lang/Exception;
        //  120    125    179    215    Any
        //  132    136    183    195    Ljava/lang/Exception;
        //  132    136    179    215    Any
        //  138    141    183    195    Ljava/lang/Exception;
        //  138    141    179    215    Any
        //  148    153    183    195    Ljava/lang/Exception;
        //  148    153    179    215    Any
        //  155    163    183    195    Ljava/lang/Exception;
        //  155    163    179    215    Any
        //  172    176    195    200    Ljava/lang/Exception;
        //  184    188    179    215    Any
        //  188    192    195    200    Ljava/lang/Exception;
        //  201    205    208    213    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 112 out of bounds for length 112
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:385)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:427)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    public VideoFrameSelectorView$BitmapFrame getFrameBitmap() {
        final int selectedFrameIndex = this.selectedFrameIndex;
        if (selectedFrameIndex >= 0 && selectedFrameIndex < this.frameBitmaps.size()) {
            return (VideoFrameSelectorView$BitmapFrame)this.frameBitmaps.get(selectedFrameIndex);
        }
        return null;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.frameBitmaps.isEmpty()) {
            final float n = (float)this.getWidth();
            final float n2 = (float)this.getHeight();
            final float cornerRadius = this.cornerRadius;
            canvas.drawRoundRect(0.0f, 0.0f, n, n2, cornerRadius, cornerRadius, this.framePaint);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.getHeight() - this.frameHeight) * 0.5f);
        for (int i = 0; i < this.frameBitmaps.size(); ++i) {
            final float n3 = (float)i;
            final float frameWidth = this.frameWidth;
            final float n4 = n3 * (this.frameSpacing + frameWidth);
            this.frameRect.set(n4, 0.0f, frameWidth + n4, this.frameHeight);
            final RectF frameRect = this.frameRect;
            final float cornerRadius2 = this.cornerRadius;
            canvas.drawRoundRect(frameRect, cornerRadius2, cornerRadius2, this.framePaint);
            final Bitmap -$$Nest$fgetbitmap = VideoFrameSelectorView$BitmapFrame.-$$Nest$fgetbitmap((VideoFrameSelectorView$BitmapFrame)this.frameBitmaps.get(i));
            if (-$$Nest$fgetbitmap != null) {
                canvas.drawBitmap(-$$Nest$fgetbitmap, new Rect(0, 0, -$$Nest$fgetbitmap.getWidth(), -$$Nest$fgetbitmap.getHeight()), this.frameRect, (Paint)null);
            }
        }
        canvas.restore();
        final float cursorX = this.cursorX;
        canvas.drawLine(cursorX, 0.0f, cursorX, (float)this.getHeight(), this.cursorPaint);
    }
    
    protected void onSizeChanged(final int n, int frameCount, int n2, final int n3) {
        super.onSizeChanged(n, frameCount, n2, n3);
        frameCount = this.frameCount;
        if (frameCount > 0) {
            n2 = 1065353216;
            final float n4 = n * 1.0f / frameCount;
            this.frameWidth = n4;
            this.frameHeight = n4;
            frameCount = 1073741824;
            this.cursorX = n4 / 2.0f;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 0 && action != 2) {
            return super.onTouchEvent(motionEvent);
        }
        final float max = Math.max(0.0f, Math.min(motionEvent.getX(), (float)this.getWidth()));
        this.cursorX = max;
        final int n = (int)(max / (this.frameWidth + this.frameSpacing));
        this.selectedFrameIndex = n;
        final int frameCount = this.frameCount;
        final int n2 = 1;
        this.selectedFrameIndex = Math.max(0, Math.min(n, frameCount - n2));
        this.invalidate();
        return n2 != 0;
    }
    
    public void setOnFrameSelectedListener(final VideoFrameSelectorView$OnFrameSelectedListener onFrameSelectedListener) {
        this.onFrameSelectedListener = onFrameSelectedListener;
    }
    
    public void setVideoUri(final Uri videoUri) {
        this.videoUri = videoUri;
        this.loadFrames();
        this.invalidate();
    }
}
