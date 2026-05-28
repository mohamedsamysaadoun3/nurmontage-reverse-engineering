// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.graphics.Color;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class NeumorphicRectView extends View
{
    private Paint backgroundPaint;
    private int baseColor;
    private float cornerRadius;
    private int darkShadowColor;
    private Paint darkShadowPaint;
    private int lightShadowColor;
    private Paint lightShadowPaint;
    private RectF rect;
    private float shadowOffset;
    
    public NeumorphicRectView(final Context context) {
        super(context);
        this.cornerRadius = 40.0f;
        this.shadowOffset = 20.0f;
        this.baseColor = Color.parseColor("#398B89");
        this.lightShadowColor = Color.parseColor("#57A9A7");
        this.darkShadowColor = Color.parseColor("#1B6D6B");
        this.init();
    }
    
    public NeumorphicRectView(final Context context, final AttributeSet set) {
        super(context, set);
        this.cornerRadius = 40.0f;
        this.shadowOffset = 20.0f;
        this.baseColor = Color.parseColor("#398B89");
        this.lightShadowColor = Color.parseColor("#57A9A7");
        this.darkShadowColor = Color.parseColor("#1B6D6B");
        this.init();
    }
    
    public NeumorphicRectView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.cornerRadius = 40.0f;
        this.shadowOffset = 20.0f;
        this.baseColor = Color.parseColor("#398B89");
        this.lightShadowColor = Color.parseColor("#57A9A7");
        this.darkShadowColor = Color.parseColor("#1B6D6B");
        this.init();
    }
    
    private void init() {
        final int n = 1;
        this.setLayerType(n, (Paint)null);
        (this.backgroundPaint = new Paint(n)).setColor(this.baseColor);
        this.backgroundPaint.setStyle(Paint$Style.FILL);
        (this.lightShadowPaint = new Paint(n)).setColor(this.baseColor);
        this.lightShadowPaint.setStyle(Paint$Style.FILL);
        final Paint lightShadowPaint = this.lightShadowPaint;
        final float shadowOffset = this.shadowOffset;
        lightShadowPaint.setShadowLayer(shadowOffset, -shadowOffset, -shadowOffset, this.lightShadowColor);
        (this.darkShadowPaint = new Paint(n)).setColor(this.baseColor);
        this.darkShadowPaint.setStyle(Paint$Style.FILL);
        final Paint darkShadowPaint = this.darkShadowPaint;
        final float shadowOffset2 = this.shadowOffset;
        darkShadowPaint.setShadowLayer(shadowOffset2, shadowOffset2, shadowOffset2, this.darkShadowColor);
        this.rect = new RectF();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final RectF rect = this.rect;
        final float cornerRadius = this.cornerRadius;
        canvas.drawRoundRect(rect, cornerRadius, cornerRadius, this.lightShadowPaint);
        final RectF rect2 = this.rect;
        final float cornerRadius2 = this.cornerRadius;
        canvas.drawRoundRect(rect2, cornerRadius2, cornerRadius2, this.darkShadowPaint);
        final RectF rect3 = this.rect;
        final float cornerRadius3 = this.cornerRadius;
        canvas.drawRoundRect(rect3, cornerRadius3, cornerRadius3, this.backgroundPaint);
    }
    
    protected void onSizeChanged(final int n, final int n2, int argb, int n3) {
        super.onSizeChanged(n, n2, argb, n3);
        final float shadowOffset = this.shadowOffset;
        final float n4 = 1.5f;
        this.rect.set(shadowOffset * n4, shadowOffset * n4, n - shadowOffset * n4, n2 - shadowOffset * n4);
        final Paint backgroundPaint = this.backgroundPaint;
        final float left = this.rect.left;
        final float top = this.rect.top;
        final float right = this.rect.right;
        final float bottom = this.rect.bottom;
        final float n5 = (float)Color.red(this.baseColor);
        final float n6 = 1.1f;
        argb = (int)(n5 * n6);
        final int n7 = (int)(Color.green(this.baseColor) * n6);
        n3 = (int)(Color.blue(this.baseColor) * n6);
        final int n8 = 255;
        argb = Color.argb(n8, argb, n7, n3);
        final float n9 = (float)Color.red(this.baseColor);
        final float n10 = 0.9f;
        n3 = (int)(n9 * n10);
        backgroundPaint.setShader((Shader)new LinearGradient(left, top, right, bottom, argb, Color.argb(n8, n3, (int)(Color.green(this.baseColor) * n10), (int)(Color.blue(this.baseColor) * n10)), Shader$TileMode.CLAMP));
    }
}
