// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Paint$Align;
import android.graphics.Typeface;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class NeumorphicView extends View
{
    private int accentColor;
    private int baseColor;
    private int darkShadowColor;
    private int iconColor;
    private int lightHighlightColor;
    private Paint paint;
    private RectF rectF;
    private int textColor;
    
    public NeumorphicView(final Context context) {
        super(context);
        this.init();
    }
    
    public NeumorphicView(final Context context, final AttributeSet set) {
        super(context, set);
        this.init();
    }
    
    public NeumorphicView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.init();
    }
    
    private Path createTrianglePath(float n, float n2, float n3, final boolean b) {
        final Path path = new Path();
        final float n4 = 2.0f;
        if (b) {
            n3 /= n4;
            final float n5 = n + n3;
            path.moveTo(n5, n2 - n3);
            n -= n3;
            path.lineTo(n, n2);
            n2 += n3;
            path.lineTo(n5, n2);
        }
        else {
            n3 /= n4;
            final float n6 = n - n3;
            path.moveTo(n6, n2 - n3);
            n += n3;
            path.lineTo(n, n2);
            n2 += n3;
            path.lineTo(n6, n2);
        }
        path.close();
        return path;
    }
    
    private float dpToPx(final float n) {
        return n * this.getResources().getDisplayMetrics().density;
    }
    
    private void drawNeumorphicCircle(final Canvas canvas, final float n, final float n2, final float n3, final int color, int color2, final int n4, final float n5, final boolean b) {
        final Paint paint = this.paint;
        int color3;
        if (b) {
            color3 = color2;
        }
        else {
            color3 = n4;
        }
        paint.setColor(color3);
        canvas.drawCircle(n + n5, n2 + n5, n3, this.paint);
        final Paint paint2 = this.paint;
        if (b) {
            color2 = n4;
        }
        paint2.setColor(color2);
        canvas.drawCircle(n - n5, n2 - n5, n3, this.paint);
        this.paint.setColor(color);
        canvas.drawCircle(n, n2, n3, this.paint);
    }
    
    private void drawNeumorphicRect(final Canvas canvas, final float n, final float n2, final float n3, final float n4, final float n5, final int color, final int n6, final int n7, final float n8, final boolean b) {
        final Paint paint = this.paint;
        int color2;
        if (b) {
            color2 = n6;
        }
        else {
            color2 = n7;
        }
        paint.setColor(color2);
        final RectF rectF = this.rectF;
        final float n9 = n + n8;
        final float n10 = n2 + n8;
        final float n11 = n + n3;
        final float n12 = n11 + n8;
        final float n13 = n2 + n4;
        rectF.set(n9, n10, n12, n13 + n8);
        canvas.drawRoundRect(this.rectF, n5, n5, this.paint);
        final Paint paint2 = this.paint;
        int color3;
        if (b) {
            color3 = n7;
        }
        else {
            color3 = n6;
        }
        paint2.setColor(color3);
        this.rectF.set(n - n8, n2 - n8, n11 - n8, n13 - n8);
        canvas.drawRoundRect(this.rectF, n5, n5, this.paint);
        this.paint.setColor(color);
        this.rectF.set(n, n2, n11, n13);
        canvas.drawRoundRect(this.rectF, n5, n5, this.paint);
    }
    
    private void init() {
        (this.paint = new Paint(1)).setStyle(Paint$Style.FILL);
        this.rectF = new RectF();
        final int n = 200;
        this.setBaseThemeColor(Color.rgb(n, n, n));
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float n = 30.0f;
        final int n2 = (int)this.dpToPx(n);
        final int width = this.getWidth();
        final int n3 = n2 * 2;
        final float n4 = (float)(width - n3);
        final float n5 = (float)(this.getHeight() - n3);
        final float n6 = (float)n2;
        final float dpToPx = this.dpToPx(n);
        final int baseColor = this.baseColor;
        final int darkShadowColor = this.darkShadowColor;
        final int lightHighlightColor = this.lightHighlightColor;
        final float n7 = 10.0f;
        final float dpToPx2 = this.dpToPx(n7);
        final float n8 = n6;
        final float n9 = n7;
        final float n10 = n4;
        final float n11 = n6;
        final float n12 = dpToPx2;
        final float n13 = n4;
        this.drawNeumorphicRect(canvas, n8, n8, n10, n5, dpToPx, baseColor, darkShadowColor, lightHighlightColor, n12, true);
        final float n14 = 100.0f;
        final float dpToPx3 = this.dpToPx(n14);
        final float n15 = (float)this.getWidth();
        final float n16 = 2.0f;
        final float n17 = n15 / n16;
        final float n18 = n8 + this.dpToPx(n14);
        this.drawNeumorphicCircle(canvas, n17, n18, dpToPx3, this.baseColor, this.lightHighlightColor, this.darkShadowColor, this.dpToPx(n9), false);
        this.paint.setColor(this.textColor);
        this.paint.setTextSize(this.dpToPx(30.0f));
        this.paint.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.paint.setTextAlign(Paint$Align.CENTER);
        canvas.drawText("\u0627\u0644\u0643\u064e\u0647\u0652\u0641", n17, n18 + this.paint.getTextSize() / 3.0f, this.paint);
        final Paint paint = this.paint;
        final float n19 = 20.0f;
        paint.setTextSize(this.dpToPx(n19));
        final Paint paint2 = this.paint;
        final String s = "sans-serif-light";
        paint2.setTypeface(Typeface.create(s, 0));
        final float n20 = this.getWidth() / n16;
        final float n21 = n18 + dpToPx3;
        canvas.drawText("Al- Kahfi", n20, n21 + this.dpToPx(40.0f), this.paint);
        this.paint.setTextSize(this.dpToPx(16.0f));
        canvas.drawText("Ustadz : Muzammil Hasballah", this.getWidth() / n16, n21 + this.dpToPx(65.0f), this.paint);
        final float n22 = n13 - this.dpToPx(60.0f);
        final float dpToPx4 = this.dpToPx(n19);
        final float n23 = n11 + this.dpToPx(30.0f);
        final float n24 = n21 + this.dpToPx(115.0f);
        final float dpToPx5 = this.dpToPx(n9);
        final int baseColor2 = this.baseColor;
        final int darkShadowColor2 = this.darkShadowColor;
        final int lightHighlightColor2 = this.lightHighlightColor;
        final float dpToPx6 = this.dpToPx(5.0f);
        final float n25 = dpToPx5;
        final float n26 = n23;
        final float n27 = n24;
        final float n28 = n22;
        final int n29 = n2;
        final float n30 = n19;
        this.drawNeumorphicRect(canvas, n26, n24, n28, dpToPx4, n25, baseColor2, darkShadowColor2, lightHighlightColor2, dpToPx6, true);
        final float n31 = (float)(n28 * 0.6);
        this.paint.setColor(this.accentColor);
        this.rectF.set(n26, n27, n26 + n31, n24 + dpToPx4);
        canvas.drawRoundRect(this.rectF, n25, n25, this.paint);
        final float dpToPx7 = this.dpToPx(60.0f);
        final float dpToPx8 = this.dpToPx(n30);
        final float n32 = n27 + this.dpToPx(70.0f);
        final float dpToPx9 = this.dpToPx(n30);
        final float n33 = this.getWidth() / n16 - dpToPx7 - dpToPx9 - this.dpToPx(40.0f);
        this.drawNeumorphicRect(canvas, n33, n32, dpToPx7, dpToPx7, dpToPx8, this.baseColor, this.darkShadowColor, this.lightHighlightColor, this.dpToPx(8.0f), true);
        this.paint.setColor(this.iconColor);
        final float n34 = n33 + this.dpToPx(n30);
        final float n35 = n32 + this.dpToPx(n30);
        final float n36 = 25.0f;
        canvas.drawRect(n34, n35, n33 + this.dpToPx(n36), n32 + this.dpToPx(40.0f), this.paint);
        canvas.drawPath(this.createTrianglePath(n33 + this.dpToPx(n36), n32 + this.dpToPx(30.0f), this.dpToPx(n30), true), this.paint);
        final float n37 = this.getWidth() / n16 - dpToPx7 / n16;
        this.drawNeumorphicRect(canvas, n37, n32, dpToPx7, dpToPx7, dpToPx8, this.baseColor, this.darkShadowColor, this.lightHighlightColor, this.dpToPx(8.0f), true);
        this.paint.setColor(this.iconColor);
        canvas.drawRect(n37 + this.dpToPx(n30), n32 + this.dpToPx(n30), n37 + this.dpToPx(30.0f), n32 + this.dpToPx(40.0f), this.paint);
        final float n38 = n37 + this.dpToPx(35.0f);
        final float n39 = n32 + this.dpToPx(n30);
        final float n40 = 45.0f;
        canvas.drawRect(n38, n39, n37 + this.dpToPx(n40), n32 + this.dpToPx(40.0f), this.paint);
        final float n41 = this.getWidth() / n16 + dpToPx9 + this.dpToPx(40.0f);
        final int baseColor3 = this.baseColor;
        final int darkShadowColor3 = this.darkShadowColor;
        final int lightHighlightColor3 = this.lightHighlightColor;
        final float dpToPx10 = this.dpToPx(8.0f);
        final float n42 = dpToPx7;
        final float n43 = n40;
        this.drawNeumorphicRect(canvas, n41, n32, n42, n42, dpToPx8, baseColor3, darkShadowColor3, lightHighlightColor3, dpToPx10, true);
        this.paint.setColor(this.iconColor);
        final float n44 = 40.0f;
        canvas.drawRect(n41 + this.dpToPx(n44), n32 + this.dpToPx(n30), n41 + this.dpToPx(n43), n32 + this.dpToPx(n44), this.paint);
        canvas.drawPath(this.createTrianglePath(n41 + this.dpToPx(35.0f), n32 + this.dpToPx(30.0f), this.dpToPx(n30), false), this.paint);
        this.paint.setTextSize(this.dpToPx(12.0f));
        this.paint.setTypeface(Typeface.create(s, 0));
        final Paint paint3 = this.paint;
        final String s2 = "Created by : story_rilla";
        final float measureText = paint3.measureText(s2);
        final float n45 = this.getWidth() / n16;
        final float n46 = this.getHeight() - n29 - this.dpToPx(n30);
        final float n47 = 40.0f;
        final float n48 = measureText + this.dpToPx(n47);
        final float dpToPx11 = this.dpToPx(n47);
        final float n49 = this.getWidth() / n16 - n48 / n16;
        final float n50 = this.getHeight() - n29 - dpToPx11;
        final float dpToPx12 = this.dpToPx(15.0f);
        final int baseColor4 = this.baseColor;
        final int darkShadowColor4 = this.darkShadowColor;
        final int lightHighlightColor4 = this.lightHighlightColor;
        final float dpToPx13 = this.dpToPx(5.0f);
        final float n51 = n45;
        this.drawNeumorphicRect(canvas, n49, n50, n48, dpToPx11, dpToPx12, baseColor4, darkShadowColor4, lightHighlightColor4, dpToPx13, true);
        this.paint.setColor(this.iconColor);
        final float n52 = 25.0f;
        canvas.drawText(s2, n51, n46 + this.dpToPx(n52), this.paint);
        final float dpToPx14 = this.dpToPx(40.0f);
        final float dpToPx15 = this.dpToPx(20.0f);
        final float dpToPx16 = this.dpToPx(15.0f);
        final int baseColor5 = this.baseColor;
        final int darkShadowColor5 = this.darkShadowColor;
        final int lightHighlightColor5 = this.lightHighlightColor;
        final float dpToPx17 = this.dpToPx(5.0f);
        final float n53 = dpToPx14;
        final float n54 = dpToPx14;
        final float n55 = dpToPx14;
        final float n56 = n52;
        this.drawNeumorphicRect(canvas, dpToPx15, dpToPx15, n53, n53, dpToPx16, baseColor5, darkShadowColor5, lightHighlightColor5, dpToPx17, true);
        this.paint.setColor(this.iconColor);
        final Path path = new Path();
        final float n57 = this.dpToPx(n56) + dpToPx15;
        final float n58 = 15.0f;
        path.moveTo(n57, this.dpToPx(n58) + dpToPx15);
        path.lineTo(this.dpToPx(n58) + dpToPx15, this.dpToPx(n56) + dpToPx15);
        path.lineTo(this.dpToPx(n56) + dpToPx15, this.dpToPx(35.0f) + dpToPx15);
        path.close();
        canvas.drawPath(path, this.paint);
        final float n59 = this.getWidth() - dpToPx15 - n53;
        final float dpToPx18 = this.dpToPx(15.0f);
        final int baseColor6 = this.baseColor;
        final int darkShadowColor6 = this.darkShadowColor;
        final int lightHighlightColor6 = this.lightHighlightColor;
        final float dpToPx19 = this.dpToPx(5.0f);
        final boolean b = true;
        this.drawNeumorphicRect(canvas, n59, dpToPx15, n53, n53, dpToPx18, baseColor6, darkShadowColor6, lightHighlightColor6, dpToPx19, b);
        this.paint.setColor(this.iconColor);
        final float n60 = this.getWidth() - dpToPx15 - n53;
        final float n61 = 20.0f;
        canvas.drawCircle(n60 + this.dpToPx(n61), this.dpToPx(n61) + dpToPx15, this.dpToPx(5.0f), this.paint);
        canvas.drawLine(this.dpToPx(n61) + (this.getWidth() - dpToPx15 - n54), dpToPx15 + this.dpToPx(n61), this.dpToPx(35.0f) + (this.getWidth() - dpToPx15 - n54), dpToPx15 + this.dpToPx(5.0f), this.paint);
        final float n62 = this.getWidth() - dpToPx15 - n55;
        final float n63 = 20.0f;
        final float n64 = this.dpToPx(n63) + n62;
        final float n65 = dpToPx15 + this.dpToPx(n63);
        final float n66 = this.getWidth() - dpToPx15 - n55;
        final float n67 = 35.0f;
        canvas.drawLine(n64, n65, this.dpToPx(n67) + n66, dpToPx15 + this.dpToPx(n67), this.paint);
        final float n68 = dpToPx15 + n55;
        this.drawNeumorphicRect(canvas, n68 + this.dpToPx(10.0f), dpToPx15, n55, n55, this.dpToPx(15.0f), this.baseColor, this.darkShadowColor, this.lightHighlightColor, this.dpToPx(5.0f), b);
        this.paint.setColor(this.iconColor);
        final float n69 = 10.0f;
        final float n70 = this.dpToPx(n69) + n68 + this.dpToPx(15.0f);
        final float n71 = this.dpToPx(n69) + dpToPx15;
        final float n72 = 20.0f;
        canvas.drawCircle(n70, n71 + this.dpToPx(n72), this.dpToPx(5.0f), this.paint);
        canvas.drawLine(this.dpToPx(n69) + n68 + this.dpToPx(n72), this.dpToPx(n69) + dpToPx15 + this.dpToPx(n69), this.dpToPx(n69) + n68 + this.dpToPx(n72), this.dpToPx(n69) + dpToPx15 + this.dpToPx(n72), this.paint);
        final float n73 = 10.0f;
        canvas.drawLine(this.dpToPx(n73) + n68 + this.dpToPx(20.0f), this.dpToPx(n73) + dpToPx15 + this.dpToPx(n73), this.dpToPx(35.0f) + (n68 + this.dpToPx(n73)), dpToPx15 + this.dpToPx(n73) + this.dpToPx(n73), this.paint);
    }
    
    public void setBaseThemeColor(int backgroundColor) {
        this.baseColor = backgroundColor;
        final int red = Color.red(backgroundColor);
        final int green = Color.green(backgroundColor);
        backgroundColor = Color.blue(backgroundColor);
        this.darkShadowColor = Color.argb(150, Math.max(0, red - 50), Math.max(0, green - 50), Math.max(0, backgroundColor - 50));
        final int b = red + 50;
        final int a = 255;
        this.lightHighlightColor = Color.argb(200, Math.min(a, b), Math.min(a, green + 50), Math.min(a, backgroundColor + 50));
        this.accentColor = Color.rgb(Math.max(0, red - 30), Math.max(0, green - 30), Math.max(0, backgroundColor - 30));
        final int max = Math.max(0, red - 100);
        final int max2 = Math.max(0, green - 100);
        backgroundColor -= 100;
        backgroundColor = Math.max(0, backgroundColor);
        backgroundColor = Color.rgb(max, max2, backgroundColor);
        this.textColor = backgroundColor;
        this.iconColor = backgroundColor;
        backgroundColor = this.baseColor;
        this.setBackgroundColor(backgroundColor);
        this.invalidate();
    }
}
