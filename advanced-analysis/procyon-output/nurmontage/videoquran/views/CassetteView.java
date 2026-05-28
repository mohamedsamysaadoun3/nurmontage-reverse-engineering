// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.RectF;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class CassetteView extends View
{
    private String labelText;
    private Paint paintAccent;
    private Paint paintBody;
    private Paint paintFloor;
    private Paint paintHole;
    private Paint paintLabel;
    private Paint paintReel;
    private Paint paintScrew;
    private Paint paintShadow;
    private Paint paintText;
    
    public CassetteView(final Context context) {
        super(context);
        this.labelText = "Titanium \u2013 David Guetta Ft. Sia";
        this.init();
    }
    
    public CassetteView(final Context context, final AttributeSet set) {
        super(context, set);
        this.labelText = "Titanium \u2013 David Guetta Ft. Sia";
        this.init();
    }
    
    public CassetteView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.labelText = "Titanium \u2013 David Guetta Ft. Sia";
        this.init();
    }
    
    private void drawInnerGear(final Canvas canvas, final float n, final float n2, final float n3, final float n4, final int n5, final Paint paint) {
        final Path path = new Path();
        final int n6 = n5 * 2;
        final double n7 = 6.283185307179586 / n6;
        for (int i = 0; i < n6; ++i) {
            final double n8 = i * n7;
            float n9;
            float n10;
            if (i % 2 == 0) {
                n9 = n;
                n10 = n3;
            }
            else {
                n9 = n;
                n10 = n4;
            }
            final double n11 = n9;
            final double n12 = n10;
            final float n13 = (float)(n11 + Math.cos(n8) * n12);
            final float n14 = (float)(n2 + n12 * Math.sin(n8));
            if (i == 0) {
                path.moveTo(n13, n14);
            }
            else {
                path.lineTo(n13, n14);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }
    
    private void init() {
        final int n = 1;
        (this.paintBody = new Paint(n)).setColor(Color.parseColor("#E74C3C"));
        (this.paintShadow = new Paint(n)).setColor(Color.parseColor("#A93226"));
        (this.paintLabel = new Paint(n)).setColor(Color.parseColor("#FAE5D3"));
        final Paint paintReel = new Paint(n);
        this.paintReel = paintReel;
        final int n2 = -16777216;
        paintReel.setColor(n2);
        (this.paintHole = new Paint(n)).setColor(Color.parseColor("#5DADE2"));
        (this.paintAccent = new Paint(n)).setColor(Color.parseColor("#E67E22"));
        (this.paintScrew = new Paint(n)).setColor(-1);
        (this.paintFloor = new Paint(n)).setColor(Color.parseColor("#6EC6E9"));
        (this.paintText = new Paint(n)).setColor(n2);
        this.paintText.setTextSize(36.0f);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int width = this.getWidth();
        final int height = this.getHeight();
        canvas.drawColor(Color.parseColor("#87CEEB"));
        final Path path = new Path();
        final float n = (float)height;
        final float n2 = 0.7f * n;
        path.moveTo(0.0f, n2);
        final float n3 = (float)width;
        path.lineTo(n3, n2);
        path.lineTo(n3, n);
        path.lineTo(0.0f, n);
        path.close();
        canvas.drawPath(path, this.paintFloor);
        final RectF rectF = new RectF(0.12f * n3, 0.32f * n, 0.92f * n3, 0.72f * n);
        final float n4 = 0.1f;
        final float n5 = n3 * n4;
        final float n6 = 0.3f;
        final float n7 = n * n6;
        final float n8 = 0.9f * n3;
        final RectF rectF2 = new RectF(n5, n7, n8, n2);
        final Paint paintShadow = this.paintShadow;
        final float n9 = 20.0f;
        canvas.drawRoundRect(rectF, n9, n9, paintShadow);
        canvas.drawRoundRect(rectF2, n9, n9, this.paintBody);
        final Path path2 = new Path();
        path2.moveTo(n5, n7);
        path2.lineTo(n8, n7);
        final float n10 = n3 * 0.85f;
        final float n11 = 0.35f;
        final float n12 = n * n11;
        path2.lineTo(n10, n12);
        final float n13 = 0.15f * n3;
        path2.lineTo(n13, n12);
        path2.close();
        canvas.drawPath(path2, this.paintAccent);
        final Path path3 = new Path();
        path3.moveTo(n5, n2);
        path3.lineTo(n8, n2);
        final float n14 = 0.65f;
        final float n15 = n * n14;
        path3.lineTo(n10, n15);
        path3.lineTo(n13, n15);
        path3.close();
        canvas.drawPath(path3, this.paintAccent);
        final float n16 = 0.2f * n3;
        final float n17 = 0.36f * n;
        final float n18 = 0.8f * n3;
        canvas.drawRect(new RectF(n16, n17, n18, 0.44f * n), this.paintLabel);
        canvas.drawText(this.labelText, (n3 - this.paintText.measureText(this.labelText)) / 2.0f, 0.415f * n, this.paintText);
        canvas.drawRect(new RectF(n16, 0.48f * n, n18, 0.62f * n), this.paintLabel);
        final float n19 = n * n4;
        final float n20 = n19 * n6;
        final float n21 = n19 * 0.45f;
        final float n22 = n * 0.55f;
        final float n23 = n11 * n3;
        final float n24 = n3 * n14;
        canvas.drawCircle(n23, n22, n19, this.paintReel);
        final Paint paintHole = this.paintHole;
        final float n25 = n10;
        final float n26 = n24;
        final int n27 = 8;
        final float n28 = n13;
        this.drawInnerGear(canvas, n23, n22, n20, n21, n27, paintHole);
        canvas.drawCircle(n26, n22, n19, this.paintReel);
        this.drawInnerGear(canvas, n26, n22, n20, n21, 8, this.paintHole);
        final float n29 = n3 * 0.015f;
        final float n30 = 0.34f * n;
        canvas.drawCircle(n28, n30, n29, this.paintScrew);
        canvas.drawCircle(n25, n30, n29, this.paintScrew);
        final float n31 = n * 0.66f;
        canvas.drawCircle(n28, n31, n29, this.paintScrew);
        canvas.drawCircle(n25, n31, n29, this.paintScrew);
    }
}
