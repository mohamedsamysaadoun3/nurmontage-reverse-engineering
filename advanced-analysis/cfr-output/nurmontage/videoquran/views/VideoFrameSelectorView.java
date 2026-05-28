/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.media.MediaMetadataRetriever
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 */
package hazem.nurmontage.videoquran.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$BitmapFrame;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$OnFrameSelectedListener;
import java.util.List;

public class VideoFrameSelectorView
extends View {
    private float cornerRadius;
    private Paint cursorPaint;
    private float cursorX;
    private List frameBitmaps;
    private int frameCount = 7;
    private float frameHeight;
    private Paint framePaint;
    private RectF frameRect;
    private float frameSpacing;
    private float frameWidth;
    private VideoFrameSelectorView$OnFrameSelectedListener onFrameSelectedListener;
    private int selectedFrameIndex;
    private Uri videoUri;

    public VideoFrameSelectorView(Context object) {
        super(object);
        super();
        this.frameBitmaps = object;
        this.selectedFrameIndex = 0;
        this.cursorX = 0.0f;
        super();
        this.framePaint = object;
        super();
        this.cursorPaint = object;
        super();
        this.frameRect = object;
        this.frameSpacing = 1.0f;
        this.cornerRadius = 10.0f;
        this.init();
    }

    public VideoFrameSelectorView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        super();
        this.frameBitmaps = object;
        this.selectedFrameIndex = 0;
        this.cursorX = 0.0f;
        super();
        this.framePaint = object;
        super();
        this.cursorPaint = object;
        super();
        this.frameRect = object;
        this.frameSpacing = 1.0f;
        this.cornerRadius = 10.0f;
        this.init();
    }

    private void init() {
        this.framePaint.setColor(-7829368);
        this.cursorPaint.setColor(-65536);
        this.cursorPaint.setStrokeWidth(5.0f);
        Paint paint = this.cursorPaint;
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    private void loadFrames() {
        Throwable throwable222222;
        Uri uri;
        block24: {
            uri = this.videoUri;
            if (uri == null) {
                return;
            }
            this.frameBitmaps.clear();
            uri = new MediaMetadataRetriever();
            Object object = this.getContext();
            Uri uri2 = this.videoUri;
            uri.setDataSource(object, uri2);
            int n = 9;
            object = uri.extractMetadata(n);
            long l = Long.parseLong((String)object);
            int n2 = this.frameCount;
            long l2 = n2;
            l /= l2;
            n2 = 0;
            while (true) {
                block23: {
                    int n3 = this.frameCount;
                    if (n2 >= n3) break;
                    long l3 = (long)n2 * l;
                    long l4 = 1000L;
                    l3 *= l4;
                    int n4 = 2;
                    Bitmap bitmap = uri.getFrameAtTime(l3, n4);
                    if (bitmap == null) break block23;
                    List list = this.frameBitmaps;
                    VideoFrameSelectorView$BitmapFrame videoFrameSelectorView$BitmapFrame = new VideoFrameSelectorView$BitmapFrame(this, bitmap, l3);
                    list.add(videoFrameSelectorView$BitmapFrame);
                }
                ++n2;
            }
            uri.release();
            return;
            {
                catch (Throwable throwable222222) {
                    break block24;
                }
                catch (Exception exception) {}
                {
                    exception.printStackTrace();
                }
                try {
                    uri.release();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            return;
        }
        try {
            uri.release();
            throw throwable222222;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        throw throwable222222;
    }

    public VideoFrameSelectorView$BitmapFrame getFrameBitmap() {
        List list;
        int n;
        int n2 = this.selectedFrameIndex;
        if (n2 >= 0 && n2 < (n = (list = this.frameBitmaps).size())) {
            return (VideoFrameSelectorView$BitmapFrame)this.frameBitmaps.get(n2);
        }
        return null;
    }

    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        List list;
        int n;
        super.onDraw(canvas);
        List list2 = this.frameBitmaps;
        boolean bl = list2.isEmpty();
        if (bl) {
            float f3 = this.getWidth();
            float f4 = this.getHeight();
            float f5 = this.cornerRadius;
            Paint paint = this.framePaint;
            float f6 = f5;
            canvas.drawRoundRect(0.0f, 0.0f, f3, f4, f5, f5, paint);
            return;
        }
        canvas.save();
        float f7 = this.getHeight();
        float f8 = this.frameHeight;
        f7 = (f7 - f8) * 0.5f;
        f8 = 0.0f;
        canvas.translate(0.0f, f7);
        bl = false;
        f7 = 0.0f;
        list2 = null;
        for (int i = 0; i < (n = (list = this.frameBitmaps).size()); ++i) {
            float f9 = i;
            f2 = this.frameWidth;
            float f10 = this.frameSpacing + f2;
            f2 += (f9 *= f10);
            f10 = this.frameHeight;
            RectF rectF = this.frameRect;
            rectF.set(f9, 0.0f, f2, f10);
            list = this.frameRect;
            f2 = this.cornerRadius;
            Paint paint = this.framePaint;
            canvas.drawRoundRect((RectF)list, f2, f2, paint);
            list = VideoFrameSelectorView$BitmapFrame.cfr_renamed_490((VideoFrameSelectorView$BitmapFrame)this.frameBitmaps.get(i));
            if (list == null) continue;
            int n2 = list.getWidth();
            int n3 = list.getHeight();
            Rect rect = new Rect(0, 0, n2, n3);
            paint = this.frameRect;
            n3 = 0;
            f = 0.0f;
            rectF = null;
            canvas.drawBitmap((Bitmap)list, rect, (RectF)paint, null);
        }
        canvas.restore();
        f = this.cursorX;
        float f11 = this.getHeight();
        Paint paint = this.cursorPaint;
        list = canvas;
        f2 = f;
        canvas.drawLine(f, 0.0f, f, f11, paint);
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        n2 = this.frameCount;
        if (n2 > 0) {
            n3 = 1065353216;
            float f = 1.0f;
            float f2 = (float)n * f;
            float f3 = n2;
            this.frameWidth = f2 /= f3;
            this.frameHeight = f2;
            n2 = 0x40000000;
            f3 = 2.0f;
            this.cursorX = f2 /= f3;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n;
        float f;
        int n2;
        int n3 = motionEvent.getAction();
        if (n3) {
            n2 = 2;
            f = 2.8E-45f;
            if (n3 != n2) {
                return super.onTouchEvent(motionEvent);
            }
        }
        float f2 = motionEvent.getX();
        float f3 = this.getWidth();
        f2 = Math.min(f2, f3);
        this.cursorX = f2 = Math.max(0.0f, f2);
        f3 = this.frameWidth;
        f = this.frameSpacing;
        this.selectedFrameIndex = n = (int)(f2 / (f3 += f));
        n3 = this.frameCount;
        n2 = 1;
        n = Math.min(n, n3 -= n2);
        this.selectedFrameIndex = n = Math.max(0, n);
        this.invalidate();
        return n2 != 0;
    }

    public void setOnFrameSelectedListener(VideoFrameSelectorView$OnFrameSelectedListener videoFrameSelectorView$OnFrameSelectedListener) {
        this.onFrameSelectedListener = videoFrameSelectorView$OnFrameSelectedListener;
    }

    public void setVideoUri(Uri uri) {
        this.videoUri = uri;
        this.loadFrames();
        this.invalidate();
    }
}

