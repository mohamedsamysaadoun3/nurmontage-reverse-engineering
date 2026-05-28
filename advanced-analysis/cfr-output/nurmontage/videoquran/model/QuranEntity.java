/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.VectorDrawable
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.ColorUtils
 */
package hazem.nurmontage.videoquran.model;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.VectorDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.Utils.EndOfAyaSpan;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity$1;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class QuranEntity
extends EntityView
implements Serializable {
    private int clrAya;
    private int clrTrsl;
    private String complete_aya;
    private int endWord_index;
    private String icon;
    private int index;
    private int indexNumber;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isVisible;
    private int mPreset;
    private String nameFont;
    private int number;
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private float padding;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaTrslOutline;
    private final TextPaint paintTranslationAya;
    private float scaleX;
    private SpannableString spannableString;
    private int startWord_index;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private StaticLayout staticLayoutTranslation;
    private StaticLayout staticLayoutTranslationOutline;
    private String translation;
    private String translation_complete;
    private String txt;
    private final Typeface typefaceNumber;
    private VectorDrawable vectorDrawable;
    private WeakReference viewWeakReference;
    private int viewWidth;
    private WeakReference weakBlurredImageView;
    private float x_translation;

    public QuranEntity(Context context, int n, String string2, String string3, String string4, String string5, RectF rectF, Typeface typeface, Typeface typeface2, int n2, int n3, Typeface typeface3, int n4, int n5, String string6, boolean bl) {
        boolean bl2;
        TextPaint textPaint;
        TextPaint textPaint2;
        float f;
        QuranEntity quranEntity = this;
        String string7 = string2;
        RectF rectF2 = rectF;
        int n6 = n4;
        int n7 = n5;
        this.padding = f = 1.0f;
        this.scaleX = f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        boolean bl3 = true;
        this.paintAya = textPaint2 = new TextPaint(bl3 ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl3 ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl3 ? 1 : 0);
        this.paintTranslationAya = textPaint = new TextPaint(bl3 ? 1 : 0);
        this.txt = string2;
        this.translation = string4;
        this.translation_complete = string5;
        this.complete_aya = string3;
        if (string3 == null || (bl2 = string3.isEmpty())) {
            quranEntity.complete_aya = string7;
        }
        string7 = string6;
        quranEntity.nameFont = string6;
        int n8 = n2;
        quranEntity.indexNumber = n2;
        n8 = n3;
        quranEntity.number = n3;
        string7 = typeface3;
        quranEntity.typefaceNumber = typeface3;
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        super(f2, f3, f4, f5);
        quranEntity.rect = string7;
        this.setVisible(bl3);
        quranEntity.viewWidth = n8 = (int)rectF.width();
        string7 = typeface;
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n6);
        float f6 = 0.05f;
        textPaint2.setTextSize(f6);
        textPaint.setTextSize(f6);
        textPaint.setColor(n7);
        string7 = typeface2;
        textPaint.setTypeface(typeface2);
        this.setClrAya(n6);
        this.setClrTrsl(n7);
        string7 = (VectorDrawable)ContextCompat.getDrawable((Context)context, (int)n);
        quranEntity.vectorDrawable = string7;
        f6 = quranEntity.rect.height();
        f2 = 0.85f;
        quranEntity.max_h = n8 = (int)(f6 * f2);
        quranEntity.max_w = n8 = (int)(quranEntity.rect.width() * f2);
    }

    public QuranEntity(Context context, String string2, String string3, String string4, String string5, RectF rectF, Typeface typeface, Typeface typeface2, int n, int n2, Typeface typeface3, int n3, int n4, String string6, boolean bl, int n5) {
        int n6;
        TextPaint textPaint;
        TextPaint textPaint2;
        float f;
        QuranEntity quranEntity = this;
        String string7 = string2;
        RectF rectF2 = rectF;
        int n7 = n3;
        int n8 = n4;
        this.padding = f = 1.0f;
        this.scaleX = f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        boolean bl2 = true;
        this.paintAya = textPaint2 = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintTranslationAya = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.txt = string2;
        this.complete_aya = string3;
        if (string3 == null || (n6 = string3.isEmpty()) != 0) {
            quranEntity.complete_aya = string7;
        }
        string7 = string4;
        quranEntity.translation = string4;
        string7 = string5;
        quranEntity.translation_complete = string5;
        string7 = string6;
        quranEntity.nameFont = string6;
        int n9 = n;
        quranEntity.indexNumber = n;
        n9 = n2;
        quranEntity.number = n2;
        string7 = typeface3;
        quranEntity.typefaceNumber = typeface3;
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        super(f2, f3, f4, f5);
        quranEntity.rect = string7;
        this.setVisible(bl2);
        quranEntity.viewWidth = n9 = (int)rectF.width();
        string7 = typeface;
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n7);
        float f6 = 0.05f;
        textPaint2.setTextSize(f6);
        textPaint.setTextSize(f6);
        textPaint.setColor(n8);
        string7 = typeface2;
        textPaint.setTypeface(typeface2);
        this.setClrAya(n7);
        this.setClrTrsl(n8);
        string7 = context;
        n6 = n5;
        string7 = (VectorDrawable)ContextCompat.getDrawable((Context)context, (int)n5);
        quranEntity.vectorDrawable = string7;
        f6 = quranEntity.rect.height();
        f2 = 0.85f;
        quranEntity.max_h = n9 = (int)(f6 * f2);
        quranEntity.max_w = n9 = (int)(quranEntity.rect.width() * f2);
    }

    public QuranEntity(String string2, String string3, String string4, String string5, RectF rectF, Typeface typeface, Typeface typeface2, int n, int n2, Typeface typeface3, int n3, int n4, String string6, float f, float f2, boolean bl, VectorDrawable vectorDrawable) {
        int n5;
        TextPaint textPaint;
        TextPaint textPaint2;
        float f3;
        this.padding = f3 = 1.0f;
        this.scaleX = f3;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        boolean bl2 = true;
        this.paintAya = textPaint2 = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintTranslationAya = textPaint = new TextPaint(bl2 ? 1 : 0);
        String string7 = string2;
        this.txt = string2;
        string7 = string4;
        this.translation = string4;
        string7 = string5;
        this.translation_complete = string5;
        string7 = string3;
        this.complete_aya = string3;
        string7 = string6;
        this.nameFont = string6;
        this.indexNumber = n;
        this.number = n2;
        string7 = typeface3;
        this.typefaceNumber = typeface3;
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        super(f4, f5, f6, f7);
        this.rect = string7;
        this.setVisible(bl2);
        this.viewWidth = n5 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        n5 = n3;
        textPaint2.setColor(n3);
        float f8 = f;
        textPaint2.setTextSize(f);
        f8 = f2;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(typeface2);
        n5 = n4;
        textPaint.setColor(n4);
        this.vectorDrawable = vectorDrawable;
        f8 = this.rect.height();
        f3 = 0.85f;
        this.max_h = n5 = (int)(f8 * f3);
        this.max_w = n5 = (int)(this.rect.width() * f3);
    }

    public QuranEntity(String string2, String string3, String string4, String string5, RectF rectF, Typeface typeface, Typeface typeface2, int n, int n2, Typeface typeface3, int n3, int n4, String string6, float f, boolean bl, VectorDrawable vectorDrawable) {
        int n5;
        TextPaint textPaint;
        TextPaint textPaint2;
        float f2;
        this.padding = f2 = 1.0f;
        this.scaleX = f2;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        boolean bl2 = true;
        this.paintAya = textPaint2 = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintTranslationAya = textPaint = new TextPaint(bl2 ? 1 : 0);
        String string7 = string2;
        this.txt = string2;
        string7 = string4;
        this.translation = string4;
        string7 = string5;
        this.translation_complete = string5;
        string7 = string3;
        this.complete_aya = string3;
        string7 = string6;
        this.nameFont = string6;
        this.indexNumber = n;
        this.number = n2;
        string7 = typeface3;
        this.typefaceNumber = typeface3;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        super(f3, f4, f5, f6);
        this.rect = string7;
        this.setVisible(bl2);
        this.viewWidth = n5 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        n5 = n3;
        textPaint2.setColor(n3);
        float f7 = f;
        textPaint2.setTextSize(f);
        textPaint.setTextSize(0.05f);
        textPaint.setTypeface(typeface2);
        n5 = n4;
        textPaint.setColor(n4);
        this.vectorDrawable = vectorDrawable;
        f7 = this.rect.height();
        f2 = 0.85f;
        this.max_h = n5 = (int)(f7 * f2);
        this.max_w = n5 = (int)(this.rect.width() * f2);
    }

    private StaticLayout buildStaticLayout(String string2, TextPaint textPaint, int n) {
        int n2 = string2.length();
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n2, (TextPaint)textPaint, (int)n);
        textPaint = Layout.Alignment.ALIGN_CENTER;
        return string2.setAlignment((Layout.Alignment)textPaint).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private void fadeIn(int n, boolean bl) {
        int n2 = 255;
        Object object = new int[]{0, n2};
        String string2 = "OpacityFade";
        object = ObjectAnimator.ofInt((Object)this, (String)string2, (int[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.objectAnimator.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.objectAnimator;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.objectAnimator.start();
    }

    private void fadeOut(int n, boolean bl) {
        int n2 = 255;
        Object object = new int[]{n2, 0};
        String string2 = "OpacityFade";
        object = ObjectAnimator.ofInt((Object)this, (String)string2, (int[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.objectAnimator.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.objectAnimator;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.objectAnimator.start();
    }

    private float getMaxLineWidth(StaticLayout staticLayout) {
        int n;
        float f = 0.0f;
        for (int i = 0; i < (n = staticLayout.getLineCount()); ++i) {
            float f2 = staticLayout.getLineWidth(i);
            f = Math.max(f, f2);
        }
        return f;
    }

    private StaticLayout getStaticLayoutOutline() {
        int n;
        int n2;
        SpannableString spannableString;
        String string2;
        CharSequence charSequence;
        block14: {
            charSequence = "";
            string2 = this.txt;
            spannableString = new SpannableString((CharSequence)string2);
            int n3 = this.number;
            n2 = -1;
            if (n3 != n2) {
                string2 = this.txt;
                n3 = string2.length();
                n2 = this.indexNumber;
                if (n3 <= n2) break block14;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                EndOfAyaSpan endOfAyaSpan = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    spannableString.setSpan((Object)endOfAyaSpan, n, n3, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n = spannableString.length();
        string2 = this.paintAyaOutline;
        n2 = this.viewWidth;
        charSequence = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)string2, (int)n2);
        spannableString = Layout.Alignment.ALIGN_CENTER;
        return charSequence.setAlignment((Layout.Alignment)spannableString).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private boolean isTrsl() {
        IpadType ipadType;
        int n;
        int n2;
        String string2 = this.translation;
        if (string2 != null && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.BOTTOM_RECT).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
            n2 = 1;
        } else {
            n2 = 0;
            string2 = null;
        }
        return n2 != 0;
    }

    private void setTls() {
        int n = (int)(this.getRect().width() * 0.85f);
        int n2 = (int)(this.getRect().height() * 0.5f * 0.83f);
        float f = this.calculateOptimalTextSize(n, n2);
        this.updateTranslation(f);
    }

    public void applyAll(int n, RectF object, float f, float f2) {
        int n2;
        Object object2;
        int n3;
        boolean bl;
        float f3;
        int n4;
        int n5;
        SpannableString spannableString;
        String string2;
        CharSequence charSequence;
        block16: {
            charSequence = "";
            this.paintAya.setTextSize(f);
            string2 = this.txt;
            spannableString = new SpannableString((CharSequence)string2);
            n5 = this.number;
            n4 = -1;
            f3 = 0.0f / 0.0f;
            bl = false;
            if (n5 != n4) {
                string2 = this.txt;
                n5 = string2.length();
                n4 = this.indexNumber;
                if (n5 <= n4) break block16;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n3 = this.number;
                charSequence = stringBuilder.append(n3);
                charSequence = ((StringBuilder)charSequence).toString();
                object2 = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n3 = this.indexNumber;
                try {
                    spannableString.setSpan(object2, n3, n5, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        float f4 = object.width();
        string2 = this.paintAya;
        object2 = spannableString.toString();
        float f5 = Math.round(string2.measureText(object2));
        this.viewWidth = n3 = (int)((float)((int)Math.max(f4, f5)) * 1.1f);
        n3 = spannableString.length();
        string2 = this.paintAya;
        n4 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n3, (TextPaint)string2, (int)n4);
        charSequence = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)charSequence);
        n3 = 0;
        charSequence = null;
        n5 = 1065353216;
        spannableString = spannableString.setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = spannableString.getWidth();
        this.setFcSize(f2);
        f2 = 0.5f;
        f4 = f * f2;
        string2 = this.rect;
        f5 = string2.height();
        object2 = this.rect;
        f3 = object2.width();
        f5 = f5 * (f /= f3) * f2;
        spannableString = this.rect;
        f3 = object.centerX() - f4;
        float f6 = object.centerY() - f5;
        float f7 = object.centerX() + f4;
        float f8 = object.centerY() + f5;
        spannableString.set(f3, f6, f7, f8);
        f8 = this.rect.centerX();
        f = (float)this.staticLayout.getWidth() * f2;
        this.x = f8 -= f;
        f8 = this.rect.centerY();
        spannableString = this.staticLayout;
        int n6 = spannableString.getHeight();
        f = (float)n6 * f2;
        this.y = f8 -= f;
        object = this.translation;
        if (object != null && (object = this.staticLayoutTranslation) != null) {
            bl = true;
        }
        f8 = this.rect.height();
        n6 = 1062836634;
        f = 0.85f;
        this.max_h = n2 = Math.round(f8 * f);
        object = this.rect;
        f8 = object.width() * f;
        this.max_w = n2 = Math.round(f8);
        if (bl) {
            n2 = (int)(this.getRect().width() * f);
            spannableString = this.getRect();
            f = spannableString.height() * f2;
            f2 = 0.83f;
            n6 = (int)(f *= f2);
            f8 = this.calculateOptimalTextSize(n2, n6);
            this.updateTranslation(f8);
            object = this.paintTranslationAya;
            f8 = object.getTextSize();
            float f9 = n;
            this.setFactorSizeTrl(f8 /= f9);
        }
        n = this.getmPreset();
        this.initPreset(n);
    }

    public void applyAll(int n, RectF object, float f, float f2, QuranEntity quranEntity) {
        int n2;
        Object object2;
        int n3;
        boolean bl;
        float f3;
        int n4;
        int n5;
        Object object3;
        String string2;
        CharSequence charSequence;
        block16: {
            charSequence = "";
            this.paintAya.setTextSize(f);
            string2 = this.txt;
            object3 = new SpannableString((CharSequence)string2);
            n5 = this.number;
            n4 = -1;
            f3 = 0.0f / 0.0f;
            bl = false;
            if (n5 != n4) {
                string2 = this.txt;
                n5 = string2.length();
                n4 = this.indexNumber;
                if (n5 <= n4) break block16;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n3 = this.number;
                charSequence = stringBuilder.append(n3);
                charSequence = ((StringBuilder)charSequence).toString();
                object2 = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n3 = this.indexNumber;
                try {
                    object3.setSpan(object2, n3, n5, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        float f4 = object.width();
        string2 = this.paintAya;
        object2 = object3.toString();
        float f5 = Math.round(string2.measureText(object2));
        this.viewWidth = n3 = (int)((float)((int)Math.max(f4, f5)) * 1.1f);
        n3 = object3.length();
        string2 = this.paintAya;
        n4 = this.viewWidth;
        object3 = StaticLayout.Builder.obtain((CharSequence)object3, (int)0, (int)n3, (TextPaint)string2, (int)n4);
        charSequence = Layout.Alignment.ALIGN_CENTER;
        object3 = object3.setAlignment((Layout.Alignment)charSequence);
        n3 = 0;
        charSequence = null;
        n5 = 1065353216;
        object3 = object3.setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = object3;
        f = object3.getWidth();
        this.setFcSize(f2);
        f2 = 0.5f;
        f4 = f * f2;
        string2 = this.rect;
        f5 = string2.height();
        object2 = this.rect;
        f3 = object2.width();
        f5 = f5 * (f /= f3) * f2;
        object3 = this.rect;
        f3 = object.centerX() - f4;
        float f6 = object.centerY() - f5;
        float f7 = object.centerX() + f4;
        float f8 = object.centerY() + f5;
        object3.set(f3, f6, f7, f8);
        f8 = this.rect.centerX();
        f = (float)this.staticLayout.getWidth() * f2;
        this.x = f8 -= f;
        f8 = this.rect.centerY();
        object3 = this.staticLayout;
        int n6 = object3.getHeight();
        f = (float)n6 * f2;
        this.y = f8 -= f;
        object = this.translation;
        if (object != null && (object = this.staticLayoutTranslation) != null) {
            bl = true;
        }
        f8 = this.rect.height();
        n6 = 1062836634;
        f = 0.85f;
        this.max_h = n2 = Math.round(f8 * f);
        object = this.rect;
        f8 = object.width() * f;
        this.max_w = n2 = Math.round(f8);
        if (bl) {
            object = this.paintTranslationAya;
            f = quranEntity.getPaintTranslationAya().getTextSize();
            object.setTextSize(f);
            f8 = this.viewWidth;
            n6 = 0x3F666666;
            f = 0.9f;
            n2 = (int)(f8 * f);
            object3 = this.translation;
            TextPaint textPaint = this.paintTranslationAya;
            object = this.buildStaticLayout((String)object3, textPaint, n2);
            this.staticLayoutTranslation = object;
            object = this.paintTranslationAya;
            f8 = object.getTextSize();
            float f9 = n;
            this.setFactorSizeTrl(f8 /= f9);
        }
        n = this.getmPreset();
        this.initPreset(n);
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int n, Typeface object, float f) {
        paint.reset();
        paint.setTypeface((Typeface)object);
        paint.setTextSize(f);
        Object object2 = 1;
        float f2 = Float.MIN_VALUE;
        paint.setAntiAlias((boolean)object2);
        paint.setSubpixelText((boolean)object2);
        paint.setDither((boolean)object2);
        object = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object);
        paint.setColor(n);
        object = this.paintAyaTrslOutline;
        if (paint == object) {
            object2 = 1068289229;
            f2 = 1.35f;
            f *= f2;
        }
        object = QuranEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
        Object object3 = ayaTextPreset.ordinal();
        object3 = object[object3];
        object2 = 2;
        f2 = 2.8E-45f;
        if (object3 != object2) {
            object2 = 3;
            f2 = 4.2E-45f;
            if (object3 != object2) {
                object2 = 4;
                f2 = 5.6E-45f;
                if (object3 == object2) {
                    f *= 0.45f;
                    float f3 = 3.57E-43f;
                    object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)n, (int)255);
                    n = 0;
                    float f4 = 0.0f;
                    Object var11_15 = null;
                    paint.setShadowLayer(f, 0.0f, 0.0f, object3);
                }
            } else {
                object3 = this.ipad_type;
                IpadType ipadType = IpadType.HEART;
                n = ipadType.ordinal();
                if (object3 != n && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BATTERY).ordinal()) && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BLUE_TYPE).ordinal())) {
                    object3 = -16777216;
                    float f5 = -1.7014118E38f;
                } else {
                    object3 = -1;
                    float f6 = 0.0f / 0.0f;
                }
                n = 1043878380;
                float f7 = 0.18f * f;
                object2 = 120;
                f2 = 1.68E-43f;
                object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)object3, (int)object2);
                paint.setShadowLayer(f7, f *= 0.08f, f, object3);
            }
        } else {
            ayaTextPreset = Paint.Style.FILL_AND_STROKE;
            paint.setStyle((Paint.Style)ayaTextPreset);
            float f8 = 0.12f;
            paint.setStrokeWidth(f *= f8);
            ayaTextPreset = Paint.Cap.ROUND;
            paint.setStrokeCap((Paint.Cap)ayaTextPreset);
            ayaTextPreset = Paint.Join.ROUND;
            paint.setStrokeJoin((Paint.Join)ayaTextPreset);
            object3 = this.ipad_type;
            object = IpadType.HEART;
            object2 = ((Enum)object).ordinal();
            f = 0.85f;
            if (object3 != object2 && (object3 = this.ipad_type) != (object2 = ((Enum)(object = IpadType.BATTERY)).ordinal()) && (object3 = this.ipad_type) != (object2 = ((Enum)(object = IpadType.BLUE_TYPE)).ordinal())) {
                object3 = ColorUtils.darkenColor(n, f);
                paint.setColor(object3);
            } else {
                object3 = ColorUtils.lightenColor(n, f);
                paint.setColor(object3);
            }
        }
    }

    public float calculateOptimalTextSize(int n, int n2) {
        String string2 = this.translation;
        if (string2 == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.paintTranslationAya;
        return this.calculateOptimalTextSize(string2, n, n2, textPaint);
    }

    public float calculateOptimalTextSize(String string2, int n, int n2, TextPaint textPaint) {
        float f;
        float f2 = 5.0f;
        float f3 = 1000.0f;
        float f4 = f2;
        while ((f = f2 == f3 ? 0 : (f2 < f3 ? -1 : 1)) <= 0) {
            float f5;
            float f6 = (f2 + f3) / 2.0f;
            textPaint.setTextSize(f6);
            int n3 = string2.length();
            StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n3, (TextPaint)textPaint, (int)n);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            builder = builder.setAlignment(alignment);
            alignment = null;
            float f7 = 1.0f;
            builder = builder.setLineSpacing(0.0f, f7).setIncludePad(false).build();
            float f8 = builder.getHeight();
            float f9 = this.getMaxLineWidth((StaticLayout)builder);
            float f10 = n2;
            float f11 = f8 == f10 ? 0 : (f8 < f10 ? -1 : 1);
            f10 = 0.03f;
            if (f11 <= 0 && (n3 = (int)((f5 = f9 - (f8 = (float)n)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) <= 0) {
                f4 = f6;
                f2 = f10 += f6;
                continue;
            }
            f3 = f6 -= f10;
        }
        return f4;
    }

    public float calculateTextSize() {
        float f;
        int n;
        float f2;
        int n2 = this.isTrsl();
        if (n2 != 0) {
            RectF rectF = this.rect;
            f2 = rectF.height();
            n = 0x3F000000;
            f = 0.5f;
            f2 *= f;
        } else {
            RectF rectF = this.rect;
            f2 = rectF.height();
        }
        f = this.getFactor_scale();
        f2 /= f;
        f = 0.85f;
        n2 = (int)(f2 * f);
        float f3 = this.rect.width();
        float f4 = this.getFactor_scale();
        n = (int)(f3 / f4 * f);
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        return this.calculateTextSize(string2, (Paint)textPaint, n, n2);
    }

    public float calculateTextSize(String string2, Paint paint, int n, int n2) {
        int n3;
        float f = 0.0f;
        if (string2 != null && (n3 = string2.isEmpty()) == 0 && n > 0 && n2 > 0) {
            n3 = 1065353216;
            float f2 = 1.0f;
            paint.setTextSize(f2);
            Rect rect = new Rect();
            int n4 = string2.length();
            paint.getTextBounds(string2, 0, n4, rect);
            rect.width();
            rect.height();
            n4 = 1148846080;
            float f3 = 1000.0f;
            int n5 = 0;
            while (true) {
                float f4;
                int n6 = 100;
                float f5 = 1.4E-43f;
                if (n5 >= n6) break;
                f5 = (f + f3) / 2.0f;
                paint.setTextSize(f5);
                int n7 = string2.length();
                paint.getTextBounds(string2, 0, n7, rect);
                float f6 = rect.width();
                int n8 = rect.height();
                float f7 = n8;
                float f8 = n;
                n7 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
                if (n7 <= 0 && (n7 = (int)((f4 = f7 - (f6 = (float)n2)) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1))) <= 0) {
                    f = f5;
                } else {
                    f3 = f5;
                }
                ++n5;
            }
        }
        return f;
    }

    public void createStaticLayout() {
        float f;
        Object object;
        int n;
        Typeface typeface;
        Object object2;
        String string2;
        float f2;
        int n2;
        float f3;
        int n3;
        int n4;
        SpannableString spannableString;
        Object object3;
        CharSequence charSequence;
        block23: {
            charSequence = "";
            object3 = this.txt;
            spannableString = new SpannableString((CharSequence)object3);
            n4 = this.number;
            n3 = -1;
            f3 = 0.0f / 0.0f;
            n2 = 0;
            f2 = 0.0f;
            string2 = null;
            if (n4 != n3) {
                object3 = this.txt;
                n4 = ((String)object3).length();
                n3 = this.indexNumber;
                if (n4 <= n3) break block23;
                object2 = this.vectorDrawable;
                typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new EndOfAyaSpan((VectorDrawable)object2, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    spannableString.setSpan(object, n, n4, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n = spannableString.length();
        object3 = this.paintAya;
        n3 = this.viewWidth;
        charSequence = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)object3, (int)n3);
        spannableString = Layout.Alignment.ALIGN_CENTER;
        charSequence = charSequence.setAlignment((Layout.Alignment)spannableString);
        spannableString = null;
        n4 = 1065353216;
        float f4 = 1.0f;
        charSequence = charSequence.setLineSpacing(0.0f, f4).setIncludePad(false).build();
        this.staticLayout = charSequence;
        charSequence = this.translation;
        float f5 = 0.5f;
        if (charSequence != null && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.BOTTOM_RECT)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.CASSET)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.CASSET_IMG)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.CASSET_IMG_BLUR)).ordinal())) {
            n = this.getIpad_type();
            if (n == (n4 = ((Enum)(object3 = IpadType.IPAD_NEOMORPHIC)).ordinal())) {
                n = 0x40000000;
                f = 2.0f;
            } else {
                n = this.getIpad_type();
                object3 = IpadType.MASK_BRUSH;
                n4 = ((Enum)object3).ordinal();
                n3 = 0x3EE66666;
                f3 = 0.45f;
                if (n != n4 && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.BLUE_TYPE)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.HEART)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.BATTERY)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.BLACK_LAYER)).ordinal()) && (n = this.getIpad_type()) != (n4 = ((Enum)(object3 = IpadType.GRADIENT)).ordinal())) {
                    n = 1067030938;
                    f = 1.2f;
                } else {
                    n = n3;
                    f = f3;
                }
            }
            f4 = this.rect.centerX();
            f3 = (float)this.staticLayout.getWidth() * f5;
            this.x = f4 -= f3;
            object3 = this.paintTranslationAya;
            object = this.translation;
            f2 = (float)this.viewWidth * 0.85f;
            n2 = (int)f2;
            float f6 = this.rect.height();
            typeface = this.staticLayout;
            int n5 = typeface.getHeight();
            float f7 = (float)n5 * f;
            n = (int)(f6 -= f7);
            object2 = this.paintTranslationAya;
            f = this.calculateOptimalTextSize((String)object, n2, n, (TextPaint)object2);
            object3.setTextSize(f);
            n = this.viewWidth;
            object3 = this.translation;
            object = this.paintTranslationAya;
            object3 = this.buildStaticLayout((String)object3, (TextPaint)object, n);
            this.staticLayoutTranslation = object3;
            n4 = object3.getLineCount();
            n3 = 2;
            f3 = 2.8E-45f;
            if (n4 == n3) {
                object3 = this.staticLayoutTranslation;
                n4 = object3.getLineCount() + -1;
                while (true) {
                    n3 = this.staticLayoutTranslation.getLineStart(n4);
                    n2 = this.staticLayoutTranslation.getLineEnd(n4);
                    object2 = this.translation;
                    object = ((String)object2).substring(n3, n2).trim();
                    string2 = "\\s+";
                    object = ((String)object).split(string2);
                    n3 = ((Object)object).length;
                    n2 = 3;
                    f2 = 4.2E-45f;
                    if (n3 >= n2) break;
                    n3 = 10;
                    f3 = 1.4E-44f;
                    if ((n += -10) < n3) break;
                    object = this.translation;
                    string2 = this.paintTranslationAya;
                    object = this.buildStaticLayout((String)object, (TextPaint)string2, n);
                    this.staticLayoutTranslation = object;
                }
                charSequence = this.rect;
                f = charSequence.centerX();
                object3 = this.staticLayoutTranslation;
                n4 = object3.getWidth();
                f4 = (float)n4 * f5;
                this.x_translation = f -= f4;
            } else {
                this.x_translation = f = this.x;
            }
            charSequence = this.rect;
            f = charSequence.centerY();
            object3 = this.staticLayout;
            n4 = object3.getHeight();
            object = this.staticLayoutTranslation;
            n3 = object.getHeight();
            f4 = (float)(n4 += n3) * f5;
            this.y = f -= f4;
        } else {
            charSequence = this.rect;
            f = charSequence.centerY();
            object3 = this.staticLayout;
            n4 = object3.getHeight();
            f4 = (float)n4 * f5;
            this.y = f -= f4;
        }
        f = this.rect.centerX();
        f4 = (float)this.staticLayout.getWidth() * f5;
        this.x = f -= f4;
    }

    public void draw(Canvas canvas) {
        Object object = this.staticLayout;
        if (object != null) {
            canvas.save();
            float f = this.x;
            float f2 = this.offsetX;
            StaticLayout staticLayout = this.staticLayout;
            int n = staticLayout.getWidth();
            float f3 = n;
            f2 = this.y;
            canvas.translate(f += (f2 *= f3), f2);
            f = this.scaleX;
            canvas.scale(f, f);
            int n2 = this.mPreset;
            Enum enum_ = AyaTextPreset.OUTLINE;
            int n3 = enum_.ordinal();
            if (n2 == n3 && (object = this.staticLayoutOutline) != null) {
                object = this.paintAyaOutline;
                enum_ = this.paintAya;
                f2 = enum_.getTextSize();
                object.setTextSize(f2);
                object = this.staticLayoutOutline;
                object.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            canvas.restore();
            object = this.translation;
            if (object != null && (object = this.staticLayoutTranslation) != null && (n2 = this.getIpad_type()) != (n3 = (enum_ = IpadType.BOTTOM_RECT).ordinal()) && (n2 = this.getIpad_type()) != (n3 = (enum_ = IpadType.CASSET).ordinal()) && (n2 = this.getIpad_type()) != (n3 = (enum_ = IpadType.CASSET_IMG).ordinal()) && (n2 = this.getIpad_type()) != (n3 = (enum_ = IpadType.CASSET_IMG_BLUR).ordinal())) {
                canvas.save();
                f = this.x_translation;
                f2 = this.offsetX;
                f3 = this.staticLayout.getWidth();
                f += (f2 *= f3);
                f2 = this.y;
                staticLayout = this.staticLayout;
                n = staticLayout.getHeight();
                f3 = n;
                float f4 = this.padding;
                canvas.translate(f, f2 += (f3 *= f4));
                f = this.scaleX;
                canvas.scale(f, f);
                n2 = this.mPreset;
                enum_ = AyaTextPreset.OUTLINE;
                n3 = enum_.ordinal();
                if (n2 == n3 && (object = this.staticLayoutTranslationOutline) != null) {
                    object = this.paintAyaTrslOutline;
                    enum_ = this.paintTranslationAya;
                    f2 = enum_.getTextSize();
                    object.setTextSize(f2);
                    object = this.staticLayoutTranslationOutline;
                    object.draw(canvas);
                }
                object = this.staticLayoutTranslation;
                object.draw(canvas);
                canvas.restore();
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void endAnimator() {
        block11: {
            try {
                var1_1 = this.objectAnimator;
                if (var1_1 != null) {
                }
                ** GOTO lbl-1000
            }
            catch (Exception v0) {
                ** GOTO lbl20
            }
            {
                var2_2 = var1_1.isRunning();
                if (!var2_2) ** GOTO lbl-1000
            }
            {
                var1_1 = this.objectAnimator;
            }
            {
                var1_1.end();
            }
lbl-1000:
            // 3 sources

            {
                if ((var1_1 = this.otherAnimation) == null || !(var2_2 = var1_1.isRunning())) break block11;
            }
            {
                var1_1 = this.otherAnimation;
            }
            {
                var1_1.end();
            }
        }
        var2_2 = false;
        var1_1 = null;
        {
            this.objectAnimator = null;
        }
        {
            this.otherAnimation = null;
lbl20:
            // 2 sources

            this.setFadeIn(false);
            this.setFadeOut(false);
            this.offsetX = 0.0f;
        }
        this.paintAya.setAlpha(255);
        var1_1 = this.paintTranslationAya;
        var3_3 = this.paintAya.getAlpha();
        var1_1.setAlpha(var3_3);
        var1_1 = this.paintAyaTrslOutline;
        var3_3 = this.paintAya.getAlpha();
        var1_1.setAlpha(var3_3);
        var1_1 = this.paintAyaOutline;
        var3_3 = this.paintAya.getAlpha();
        var1_1.setAlpha(var3_3);
    }

    public AyaTextPreset get(int n) {
        AyaTextPreset ayaTextPreset = AyaTextPreset.SHADOW;
        int n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.SHADOW;
        }
        ayaTextPreset = AyaTextPreset.OUTLINE;
        n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.OUTLINE;
        }
        ayaTextPreset = AyaTextPreset.GLOW;
        n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.GLOW;
        }
        return AyaTextPreset.NONE;
    }

    public int getClrAya() {
        return this.clrAya;
    }

    public int getClrTrsl() {
        return this.clrTrsl;
    }

    public String getComplete_aya() {
        return this.complete_aya;
    }

    public int getDuration_fade() {
        float f = this.getEntityQuran().getRect().left;
        float f2 = this.getEntityQuran().getSecond_in_screen();
        f = Math.abs(f / f2);
        f2 = this.getEntityQuran().getRect().right;
        float f3 = this.getEntityQuran().getSecond_in_screen();
        return (int)((Math.abs(f2 / f3) - f) * 0.2f * 1000.0f);
    }

    public int getEndWord_index() {
        return this.endWord_index;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getIndex() {
        return this.index;
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public int getIpad_type() {
        return this.ipad_type;
    }

    public int getMax_h() {
        return this.max_h;
    }

    public int getMax_w() {
        return this.max_w;
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public int getNumber() {
        return this.number;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public TextPaint getPaintTranslationAya() {
        return this.paintTranslationAya;
    }

    public int getStartWord_index() {
        return this.startWord_index;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public String getTranslation() {
        return this.translation;
    }

    public float getTranslationWidth() {
        this.paintTranslationAya.setTextSize(3.0f);
        TextPaint textPaint = this.paintTranslationAya;
        String string2 = this.translation;
        return textPaint.measureText(string2);
    }

    public String getTranslation_complete() {
        return this.translation_complete;
    }

    public String getTxt() {
        return this.txt;
    }

    public Typeface getTypefaceNumber() {
        return this.typefaceNumber;
    }

    public VectorDrawable getVectorDrawable() {
        return this.vectorDrawable;
    }

    public int getViewWidth() {
        return this.viewWidth;
    }

    public float getWidth() {
        this.paintAya.setTextSize(3.0f);
        TextPaint textPaint = this.paintAya;
        String string2 = this.txt;
        return textPaint.measureText(string2);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int getmPreset() {
        return this.mPreset;
    }

    public void initPreset(int n) {
        Object object;
        this.mPreset = n;
        Object object2 = this.get(n);
        if (object2 == (object = AyaTextPreset.NONE)) {
            return;
        }
        object = AyaTextPreset.OUTLINE;
        if (object2 == object) {
            Object object3 = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            QuranEntity quranEntity = this;
            this.applyAyaPreset((Paint)object3, ayaTextPreset, n2, typeface, f);
            object2 = this.getStaticLayoutOutline();
            this.staticLayoutOutline = object2;
            quranEntity = this.paintAya;
            object3 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            Typeface typeface2 = this.paintAya.getTypeface();
            object2 = this.paintAya;
            float f2 = object2.getTextSize();
            object = this;
            this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
            n = this.isTrsl() ? 1 : 0;
            if (n != 0) {
                quranEntity = this.paintAyaTrslOutline;
                object3 = AyaTextPreset.OUTLINE;
                n3 = this.clrTrsl;
                typeface2 = this.paintTranslationAya.getTypeface();
                f2 = this.paintTranslationAya.getTextSize();
                this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
                object2 = this.translation;
                object = this.paintAyaTrslOutline;
                int n4 = this.staticLayoutTranslation.getWidth();
                object2 = this.buildStaticLayout((String)object2, (TextPaint)object, n4);
                this.staticLayoutTranslationOutline = object2;
                quranEntity = this.paintTranslationAya;
                object3 = AyaTextPreset.NONE;
                n3 = this.clrTrsl;
                typeface2 = this.paintTranslationAya.getTypeface();
                object2 = this.paintTranslationAya;
                f2 = object2.getTextSize();
                object = this;
                this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
            }
        } else {
            TextPaint textPaint = this.paintAya;
            int n5 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            float f = this.paintAya.getTextSize();
            object = this;
            AyaTextPreset ayaTextPreset = object2;
            this.applyAyaPreset((Paint)textPaint, (AyaTextPreset)((Object)object2), n5, typeface, f);
            boolean bl = this.isTrsl();
            if (bl && (object = this.staticLayoutTranslation) != null) {
                textPaint = this.paintTranslationAya;
                n5 = this.clrTrsl;
                typeface = textPaint.getTypeface();
                f = this.paintTranslationAya.getTextSize();
                object = this;
                this.applyAyaPreset((Paint)textPaint, (AyaTextPreset)((Object)object2), n5, typeface, f);
            }
        }
    }

    public void initPresetAya(int n) {
        AyaTextPreset ayaTextPreset;
        this.mPreset = n;
        AyaTextPreset ayaTextPreset2 = this.get(n);
        if (ayaTextPreset2 == (ayaTextPreset = AyaTextPreset.NONE)) {
            return;
        }
        ayaTextPreset = AyaTextPreset.OUTLINE;
        if (ayaTextPreset2 == ayaTextPreset) {
            TextPaint textPaint = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset3 = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset3, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            TextPaint textPaint2 = this.paintAya;
            ayaTextPreset2 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            textPaint = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            float f2 = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint2, ayaTextPreset2, n3, (Typeface)textPaint, f2);
        } else {
            TextPaint textPaint = this.paintAya;
            int n4 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            ayaTextPreset = this.paintAya;
            float f = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset2, n4, typeface, f);
        }
    }

    public void initPresetTrsl(int n) {
        Object object;
        this.mPreset = n;
        AyaTextPreset ayaTextPreset = this.get(n);
        if (ayaTextPreset == (object = AyaTextPreset.NONE)) {
            return;
        }
        object = AyaTextPreset.OUTLINE;
        if (ayaTextPreset == object) {
            n = this.isTrsl() ? 1 : 0;
            if (n != 0) {
                TextPaint textPaint = this.paintAyaTrslOutline;
                ayaTextPreset = AyaTextPreset.OUTLINE;
                int n2 = this.clrTrsl;
                Typeface typeface = this.paintTranslationAya.getTypeface();
                float f = this.paintTranslationAya.getTextSize();
                QuranEntity quranEntity = this;
                this.applyAyaPreset((Paint)textPaint, ayaTextPreset, n2, typeface, f);
                object = this.translation;
                quranEntity = this.paintAyaTrslOutline;
                int n3 = this.staticLayoutTranslation.getWidth();
                object = this.buildStaticLayout((String)object, (TextPaint)quranEntity, n3);
                this.staticLayoutTranslationOutline = object;
                textPaint = this.paintTranslationAya;
                ayaTextPreset = AyaTextPreset.NONE;
                n2 = this.clrTrsl;
                typeface = this.paintTranslationAya.getTypeface();
                object = this.paintTranslationAya;
                f = object.getTextSize();
                quranEntity = this;
                this.applyAyaPreset((Paint)textPaint, ayaTextPreset, n2, typeface, f);
            }
        } else {
            n = this.isTrsl() ? 1 : 0;
            if (n != 0 && (object = this.staticLayoutTranslation) != null) {
                TextPaint textPaint = this.paintTranslationAya;
                int n4 = this.clrTrsl;
                Typeface typeface = textPaint.getTypeface();
                object = this.paintTranslationAya;
                float f = object.getTextSize();
                QuranEntity quranEntity = this;
                this.applyAyaPreset((Paint)textPaint, ayaTextPreset, n4, typeface, f);
            }
        }
    }

    public boolean isAnimRun() {
        boolean bl;
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null && (bl = objectAnimator.isRunning()) || (objectAnimator = this.otherAnimation) != null && (bl = objectAnimator.isRunning())) {
            bl = true;
        } else {
            bl = false;
            objectAnimator = null;
        }
        return bl;
    }

    public boolean isAnimTest() {
        return super.isAnimTest();
    }

    public boolean isFadeIn() {
        return this.isFadeIn;
    }

    public boolean isFadeOut() {
        return this.isFadeOut;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void postTranslate(float f, float f2) {
        RectF rectF = this.rect;
        rectF.offset(f, f2);
        RectF rectF2 = this.rect;
        f = rectF2.centerX();
        StaticLayout staticLayout = this.staticLayout;
        int n = staticLayout.getWidth();
        f2 = n;
        float f3 = 0.5f;
        this.x = f -= (f2 *= f3);
        boolean bl = this.isTrsl();
        if (bl && (rectF2 = this.staticLayoutTranslation) != null) {
            f = this.rect.centerX();
            f2 = (float)this.staticLayoutTranslation.getWidth() * f3;
            this.x_translation = f -= f2;
            rectF2 = this.rect;
            f = rectF2.centerY();
            staticLayout = this.staticLayout;
            n = staticLayout.getHeight();
            StaticLayout staticLayout2 = this.staticLayoutTranslation;
            int n2 = staticLayout2.getHeight();
            f2 = (float)(n += n2) * f3;
            this.y = f -= f2;
        } else {
            rectF2 = this.rect;
            f = rectF2.centerY();
            staticLayout = this.staticLayout;
            n = staticLayout.getHeight();
            f2 = (float)n * f3;
            this.y = f -= f2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void restoreCanvas(Canvas canvas) {
        try {
            canvas.restore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void runIn(int n, boolean bl, String string2) {
        boolean bl2;
        String string3 = TransitionType.SLIDE_TO_LEFT.getValue();
        boolean bl3 = string2.equals(string3);
        if (bl3) {
            this.slidToLeft(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRight(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.ZOOM_IN.getValue())) {
            this.zoomIn_In(n, bl);
        }
        if (bl2 = string2.equals(string3 = TransitionType.FADE_IN.getValue())) {
            this.fadeIn(n, bl);
        }
    }

    public void runOut(int n, boolean bl, String string2) {
        boolean bl2;
        String string3 = TransitionType.SLIDE_TO_LEFT.getValue();
        boolean bl3 = string2.equals(string3);
        if (bl3) {
            this.slidToLeftOut(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRightOut(n, bl);
        }
        if (bl2 = string2.equals(string3 = TransitionType.FADE_OUT.getValue())) {
            this.fadeOut(n, bl);
        }
    }

    public void scale(float f, int n, int n2) {
        float f2;
        this.setFactor_scale(f);
        float f3 = this.rect.width() * f;
        RectF rectF = this.rect;
        float f4 = rectF.height() * f;
        int n3 = 0x3F000000;
        f = 0.5f;
        RectF rectF2 = this.rect;
        rectF2.left = f2 = this.rect.centerX() - (f3 *= f);
        rectF2 = this.rect;
        RectF rectF3 = this.rect;
        rectF2.right = f2 = rectF3.centerX() + f3;
        Object object = this.rect;
        object.top = f3 = this.rect.centerY() - (f4 *= f);
        object = this.rect;
        RectF rectF4 = this.rect;
        object.bottom = f3 = rectF4.centerY() + f4;
        object = this.translation;
        if (object != null && (object = this.staticLayoutTranslation) != null) {
            n3 = 1;
            f = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f = 0.0f;
            object = null;
        }
        this.viewWidth = n2 = (int)this.rect.width();
        rectF4 = this.paintAya;
        f4 = this.calculateTextSize();
        rectF4.setTextSize(f4);
        this.createStaticLayout();
        rectF4 = this.paintAya;
        f3 = rectF4.getTextSize();
        float f5 = n;
        this.setFcSize(f3 /= f5);
        if (n3 != 0) {
            this.setTls();
            object = this.paintTranslationAya;
            f = object.getTextSize() / f5;
            this.setFactorSizeTrl(f);
        }
        n3 = this.getmPreset();
        this.initPreset(n3);
    }

    public void setAnimTest(boolean bl) {
        super.setAnimTest(bl);
    }

    public void setClrAya(int n) {
        this.clrAya = n;
    }

    public void setClrTrsl(int n) {
        this.clrTrsl = n;
    }

    public void setColor(int n) {
        this.setClrAya(n);
        this.paintAya.setColor(n);
    }

    public void setColorTranslation(int n) {
        this.setClrTrsl(n);
        TextPaint textPaint = this.paintTranslationAya;
        if (textPaint != null) {
            textPaint.setColor(n);
        }
    }

    public void setEndWord_index(int n) {
        this.endWord_index = n;
    }

    public void setFactorSize(float f) {
        Object object;
        this.scaleX = f;
        boolean bl = this.isAnimTest();
        if (bl && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setFadeIn(boolean bl) {
        this.isFadeIn = bl;
    }

    public void setFadeOut(boolean bl) {
        this.isFadeOut = bl;
    }

    public void setIcon(String string2) {
        this.icon = string2;
    }

    public void setIndex(int n) {
        this.index = n;
    }

    public void setIndexNumber(int n) {
        this.indexNumber = n;
    }

    public void setIpad_type(int n) {
        this.ipad_type = n;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void setOpacityFade(int n) {
        this.paintAya.setAlpha(n);
        Object object = this.paintTranslationAya;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaTrslOutline;
        n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        TextPaint textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0) {
            object = this.weakBlurredImageView;
            if (object != null) {
                object = (BlurredImageView)((Object)object.get());
                object.invalidate();
            }
        } else {
            object = this.viewWeakReference;
            if (object != null) {
                object = (TrackEntityView)((Object)object.get());
                object.invalidate();
            }
        }
    }

    public void setPreset(AyaTextPreset object) {
        int n;
        this.mPreset = n = object.ordinal();
        Object object2 = AyaTextPreset.OUTLINE;
        if (object == object2) {
            Object object3 = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            QuranEntity quranEntity = this;
            this.applyAyaPreset((Paint)object3, ayaTextPreset, n2, typeface, f);
            object = this.getStaticLayoutOutline();
            this.staticLayoutOutline = object;
            quranEntity = this.paintAya;
            object3 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            Typeface typeface2 = this.paintAya.getTypeface();
            object = this.paintAya;
            float f2 = object.getTextSize();
            object2 = this;
            this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
            boolean bl = this.isTrsl();
            if (bl) {
                quranEntity = this.paintAyaTrslOutline;
                object3 = AyaTextPreset.OUTLINE;
                n3 = this.clrTrsl;
                typeface2 = this.paintTranslationAya.getTypeface();
                f2 = this.paintTranslationAya.getTextSize();
                this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
                object = this.translation;
                object2 = this.paintAyaTrslOutline;
                int n4 = this.staticLayoutTranslation.getWidth();
                object = this.buildStaticLayout((String)object, (TextPaint)object2, n4);
                this.staticLayoutTranslationOutline = object;
                quranEntity = this.paintTranslationAya;
                object3 = AyaTextPreset.NONE;
                n3 = this.clrTrsl;
                typeface2 = this.paintTranslationAya.getTypeface();
                object = this.paintTranslationAya;
                f2 = object.getTextSize();
                object2 = this;
                this.applyAyaPreset((Paint)quranEntity, (AyaTextPreset)((Object)object3), n3, typeface2, f2);
            }
        } else {
            TextPaint textPaint = this.paintAya;
            int n5 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            object2 = this.paintAya;
            float f = object2.getTextSize();
            this.applyAyaPreset((Paint)textPaint, (AyaTextPreset)((Object)object), n5, typeface, f);
            n = this.isTrsl() ? 1 : 0;
            if (n != 0) {
                TextPaint textPaint2 = this.paintTranslationAya;
                int n6 = this.clrTrsl;
                Typeface typeface3 = textPaint2.getTypeface();
                object2 = this.paintTranslationAya;
                float f3 = object2.getTextSize();
                QuranEntity quranEntity = this;
                AyaTextPreset ayaTextPreset = object;
                this.applyAyaPreset((Paint)textPaint2, (AyaTextPreset)((Object)object), n6, typeface3, f3);
            }
        }
    }

    public void setSlideX(float f) {
        this.offsetX = f;
        TextPaint textPaint = this.paintAya;
        f = Math.abs(f);
        float f2 = 1.0f - f;
        f = 255.0f;
        int n = Math.round(f2 *= f);
        textPaint.setAlpha(n);
        Object object = this.paintTranslationAya;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaTrslOutline;
        n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0 && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setSlideXOut(float f) {
        this.offsetX = f;
        TextPaint textPaint = this.paintAya;
        f = Math.abs(f);
        float f2 = 1.0f - f;
        f = 255.0f;
        int n = Math.round(f2 *= f);
        textPaint.setAlpha(n);
        Object object = this.paintTranslationAya;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaTrslOutline;
        n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0 && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setStartWord_index(int n) {
        this.startWord_index = n;
    }

    public void setStaticLayout() {
        Object object;
        int n;
        Object object2;
        String string2;
        int n2;
        int n3;
        int n4;
        Object object3;
        String string3;
        CharSequence charSequence;
        block19: {
            charSequence = "";
            string3 = this.txt;
            object3 = new SpannableString((CharSequence)string3);
            n4 = this.number;
            n3 = -1;
            n2 = 0;
            string2 = null;
            if (n4 != n3) {
                string3 = this.txt;
                n4 = string3.length();
                n3 = this.indexNumber;
                if (n4 <= n3) break block19;
                object2 = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new EndOfAyaSpan((VectorDrawable)object2, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    object3.setSpan(object, n, n4, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n = object3.length();
        string3 = this.paintAya;
        n3 = this.viewWidth;
        charSequence = StaticLayout.Builder.obtain((CharSequence)object3, (int)0, (int)n, (TextPaint)string3, (int)n3);
        object3 = Layout.Alignment.ALIGN_CENTER;
        charSequence = charSequence.setAlignment((Layout.Alignment)object3).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = charSequence;
        float f = this.rect.centerX();
        object3 = this.staticLayout;
        int n5 = object3.getWidth();
        float f2 = n5;
        n4 = 0x3F000000;
        float f3 = 0.5f;
        this.x = f -= (f2 *= f3);
        charSequence = this.translation;
        if (charSequence != null && (n = this.getIpad_type()) != (n5 = ((Enum)(object3 = IpadType.BOTTOM_RECT)).ordinal()) && (n = this.getIpad_type()) != (n5 = ((Enum)(object3 = IpadType.CASSET)).ordinal()) && (n = this.getIpad_type()) != (n5 = ((Enum)(object3 = IpadType.CASSET_IMG)).ordinal()) && (n = this.getIpad_type()) != (n5 = ((Enum)(object3 = IpadType.CASSET_IMG_BLUR)).ordinal())) {
            n = this.viewWidth;
            object3 = this.translation;
            object = this.paintTranslationAya;
            object3 = this.buildStaticLayout((String)object3, (TextPaint)object, n);
            this.staticLayoutTranslation = object3;
            n5 = object3.getLineCount();
            if (n5 == (n3 = 2)) {
                object3 = this.staticLayoutTranslation;
                n5 = object3.getLineCount() + -1;
                while (true) {
                    n3 = this.staticLayoutTranslation.getLineStart(n5);
                    n2 = this.staticLayoutTranslation.getLineEnd(n5);
                    object2 = this.translation;
                    object = ((String)object2).substring(n3, n2).trim();
                    string2 = "\\s+";
                    n3 = ((Object)(object = ((String)object).split(string2))).length;
                    if (n3 >= (n2 = 3) || (n += -10) < (n3 = 10)) break;
                    object = this.translation;
                    string2 = this.paintTranslationAya;
                    object = this.buildStaticLayout((String)object, (TextPaint)string2, n);
                    this.staticLayoutTranslation = object;
                }
                charSequence = this.rect;
                f = charSequence.centerX();
                object3 = this.staticLayoutTranslation;
                n5 = object3.getWidth();
                f2 = (float)n5 * f3;
                this.x_translation = f -= f2;
            } else {
                this.x_translation = f = this.x;
            }
            charSequence = this.rect;
            f = charSequence.centerY();
            object3 = this.staticLayout;
            n5 = object3.getHeight();
            object = this.staticLayoutTranslation;
            n3 = object.getHeight();
            f2 = (float)(n5 += n3) * f3;
            this.y = f -= f2;
        } else {
            charSequence = this.rect;
            f = charSequence.centerY();
            object3 = this.staticLayout;
            n5 = object3.getHeight();
            f2 = (float)n5 * f3;
            this.y = f -= f2;
        }
    }

    public void setTextSize(float f) {
        this.paintAya.setTextSize(f);
    }

    public void setTextSizeInBoucle(float f) {
        int n;
        int n2;
        SpannableString spannableString;
        String string2;
        CharSequence charSequence;
        block14: {
            charSequence = "";
            this.paintAya.setTextSize(f);
            string2 = this.txt;
            spannableString = new SpannableString((CharSequence)string2);
            int n3 = this.number;
            n2 = -1;
            if (n3 != n2) {
                string2 = this.txt;
                n3 = string2.length();
                n2 = this.indexNumber;
                if (n3 <= n2) break block14;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                EndOfAyaSpan endOfAyaSpan = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    spannableString.setSpan((Object)endOfAyaSpan, n, n3, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n = spannableString.length();
        string2 = this.paintAya;
        n2 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)string2, (int)n2);
        charSequence = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)charSequence).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = this.rect.centerY();
        float f2 = this.staticLayout.getHeight();
        float f3 = 0.5f;
        this.y = f -= (f2 *= f3);
        f = this.rect.centerX();
        f2 = (float)this.staticLayout.getWidth() * f3;
        this.x = f -= f2;
    }

    public void setTranslate(float f, float f2) {
        float f3;
        RectF rectF = this.rect;
        float f4 = rectF.width();
        float f5 = 0.5f;
        RectF rectF2 = this.rect;
        float f6 = rectF2.height() * f5;
        RectF rectF3 = this.rect;
        rectF3.left = f3 = f - (f4 *= f5);
        rectF3 = this.rect;
        rectF3.right = f += f4;
        Object object = this.rect;
        object.top = f4 = f2 - f6;
        object = this.rect;
        object.bottom = f2 += f6;
        f = this.rect.centerX();
        StaticLayout staticLayout = this.staticLayout;
        int n = staticLayout.getWidth();
        f2 = (float)n * f5;
        this.x = f -= f2;
        object = this.translation;
        if (object != null && (object = this.staticLayoutTranslation) != null) {
            f = this.rect.centerX();
            f2 = (float)this.staticLayoutTranslation.getWidth() * f5;
            this.x_translation = f -= f2;
            object = this.rect;
            f = object.centerY();
            staticLayout = this.staticLayout;
            n = staticLayout.getHeight();
            rectF = this.staticLayoutTranslation;
            int n2 = rectF.getHeight();
            f2 = (float)(n += n2) * f5;
            this.y = f -= f2;
        } else {
            object = this.rect;
            f = object.centerY();
            staticLayout = this.staticLayout;
            n = staticLayout.getHeight();
            f2 = (float)n * f5;
            this.y = f -= f2;
        }
    }

    public void setTranslation(String string2) {
        this.translation = string2;
    }

    public void setTranslation_complete(String string2) {
        this.translation_complete = string2;
    }

    public void setTxt(String string2) {
        int n;
        int n2;
        int n3;
        SpannableString spannableString;
        CharSequence charSequence;
        block14: {
            charSequence = "";
            this.txt = string2;
            spannableString = new SpannableString((CharSequence)string2);
            n3 = this.number;
            int n4 = -1;
            if (n3 != n4) {
                n2 = string2.length();
                n3 = this.indexNumber;
                if (n2 <= n3) break block14;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                EndOfAyaSpan endOfAyaSpan = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    spannableString.setSpan((Object)endOfAyaSpan, n, n2, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n2 = spannableString.length();
        charSequence = this.paintAya;
        n3 = this.viewWidth;
        string2 = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n2, (TextPaint)charSequence, (int)n3);
        charSequence = Layout.Alignment.ALIGN_CENTER;
        string2 = string2.setAlignment((Layout.Alignment)charSequence);
        n = 0;
        float f = 0.0f;
        charSequence = null;
        int n5 = 1065353216;
        float f2 = 1.0f;
        string2 = string2.setLineSpacing(0.0f, f2).setIncludePad(false).build();
        this.staticLayout = string2;
        n2 = this.isTrsl() ? 1 : 0;
        if (n2 != 0) {
            string2 = this.translation;
            charSequence = this.paintTranslationAya;
            n5 = this.staticLayoutTranslation.getWidth();
            string2 = this.buildStaticLayout(string2, (TextPaint)charSequence, n5);
            this.staticLayoutTranslation = string2;
            float f3 = this.rect.centerY();
            n = this.staticLayout.getHeight();
            spannableString = this.staticLayoutTranslation;
            n5 = spannableString.getHeight();
            f = n + n5;
            n5 = 0x3F000000;
            f2 = 0.5f;
            this.y = f3 -= (f *= f2);
            string2 = this.rect;
            f3 = string2.centerX();
            charSequence = this.staticLayoutTranslation;
            n = charSequence.getWidth();
            f = (float)n * f2;
            this.x_translation = f3 -= f;
        }
    }

    public void setTypeface(Typeface typeface, String string2) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = string2;
    }

    public void setTypefaceOneAya(Typeface typeface, String string2) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = string2;
    }

    public void setUnderLine(boolean bl) {
        this.paintAya.setUnderlineText(bl);
    }

    public void setVectorDrawable(VectorDrawable vectorDrawable) {
        this.vectorDrawable = vectorDrawable;
    }

    public void setViewWeakReference(WeakReference weakReference, WeakReference weakReference2) {
        this.viewWeakReference = weakReference;
        this.weakBlurredImageView = weakReference2;
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public void setmPreset(int n) {
        this.mPreset = n;
    }

    public void setupCanvasDraw(Canvas canvas) {
        float f;
        Object object;
        int n;
        int n2;
        String string2 = this.translation;
        float f2 = 0.5f;
        if (string2 != null && (string2 = this.staticLayoutTranslation) != null && (n2 = this.getIpad_type()) != (n = ((Enum)(object = IpadType.BOTTOM_RECT)).ordinal()) && (n2 = this.getIpad_type()) != (n = ((Enum)(object = IpadType.CASSET)).ordinal()) && (n2 = this.getIpad_type()) != (n = ((Enum)(object = IpadType.CASSET_IMG)).ordinal()) && (n2 = this.getIpad_type()) != (n = ((Enum)(object = IpadType.CASSET_IMG_BLUR)).ordinal())) {
            n2 = canvas.getHeight();
            n = this.staticLayout.getHeight();
            n2 -= n;
            n = this.staticLayoutTranslation.getHeight();
            this.y = f = (float)(n2 - n) * f2;
            n2 = canvas.getWidth();
            object = this.staticLayoutTranslation;
            n = object.getWidth();
            this.x_translation = f = (float)(n2 -= n) * f2;
        } else {
            n2 = canvas.getHeight();
            object = this.staticLayout;
            n = object.getHeight();
            this.y = f = (float)(n2 -= n) * f2;
        }
        n2 = canvas.getWidth();
        n = this.staticLayout.getWidth();
        this.x = f = (float)(n2 - n) * f2;
        canvas.save();
        f = this.x;
        f2 = this.y;
        canvas.translate(f, f2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setupScale(float var1_1, int var2_2, int var3_3) {
        block21: {
            var4_4 = "";
            var5_6 = this.paintAya;
            var6_7 = var2_2;
            var5_6.setTextSize(var1_1 *= var6_7);
            var5_6 = this.txt;
            var7_8 = new SpannableString((CharSequence)var5_6);
            var8_9 = this.number;
            var9_10 = -1;
            var6_7 = 0.0f / 0.0f;
            var10_11 = false;
            if (var8_9 != var9_10) {
                var5_6 = this.txt;
                var8_9 = var5_6.length();
                var9_10 = this.indexNumber;
                if (var8_9 <= var9_10) break block21;
                var12_13 = this.vectorDrawable;
                var13_14 = this.typefaceNumber;
                var14_15 = new StringBuilder((String)var4_4);
                var15_16 = this.number;
                var4_4 = var14_15.append(var15_16);
                var4_4 = var4_4.toString();
                var11_12 /* !! */  = new EndOfAyaSpan(var12_13, var13_14, (String)var4_4);
                var15_16 = this.indexNumber;
                try {
                    var7_8.setSpan((Object)var11_12 /* !! */ , var15_16, var8_9, 0);
                }
                catch (Exception var4_5) {
                    var4_5.printStackTrace();
                }
            }
        }
        var16_17 = this.rect.width();
        var5_6 = this.paintAya;
        var11_12 /* !! */  = var7_8.toString();
        var17_18 = Math.round(var5_6.measureText(var11_12 /* !! */ ));
        this.viewWidth = var15_16 = (int)Math.max(var16_17, var17_18);
        var15_16 = var7_8.length();
        var5_6 = this.paintAya;
        var9_10 = this.viewWidth;
        var7_8 = StaticLayout.Builder.obtain((CharSequence)var7_8, (int)0, (int)var15_16, (TextPaint)var5_6, (int)var9_10);
        var4_4 = Layout.Alignment.ALIGN_CENTER;
        var7_8 = var7_8.setAlignment((Layout.Alignment)var4_4);
        var4_4 = null;
        var8_9 = 1065353216;
        var7_8 = var7_8.setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = var7_8;
        var18_19 = var7_8.getWidth();
        var1_1 = var18_19;
        var15_16 = 0x3F000000;
        var16_17 = 0.5f;
        var17_18 = var1_1 * var16_17;
        var11_12 /* !! */  = this.rect;
        var6_7 = var11_12 /* !! */ .height();
        var19_20 = this.rect.width();
        var6_7 = var6_7 * (var1_1 /= var19_20) * var16_17;
        var1_1 = this.rect.centerY();
        var12_13 = this.rect;
        var19_20 = var12_13.centerX();
        var13_14 = this.rect;
        var20_21 = var19_20 - var17_18;
        var21_22 = var1_1 - var6_7;
        var13_14.set(var20_21, var21_22, var19_20 += var17_18, var1_1 += var6_7);
        var7_8 = this.translation;
        if (var7_8 != null && (var7_8 = this.staticLayoutTranslation) != null) {
            var10_11 = true;
        }
        if (!var10_11) ** GOTO lbl-1000
        var7_8 = this.txt;
        var18_19 = var7_8.length();
        var8_9 = 20;
        var17_18 = 2.8E-44f;
        if (var18_19 < var8_9) {
            var1_1 = this.rect.height();
            var2_2 = 1057803469;
            var22_23 = 0.55f;
            this.max_h = var18_19 = Math.round(var1_1 * var22_23);
            var7_8 = this.rect;
            var1_1 = var7_8.width() * var22_23;
            this.max_w = var18_19 = Math.round(var1_1);
        } else if (var10_11 && var2_2 > var3_3) {
            var1_1 = this.rect.height();
            var2_2 = 1059313418;
            var22_23 = 0.64f;
            this.max_h = var18_19 = Math.round(var1_1 * var22_23);
            var7_8 = this.rect;
            var1_1 = var7_8.width() * var22_23;
            this.max_w = var18_19 = Math.round(var1_1);
        } else if (var10_11 && var2_2 == var3_3) {
            var1_1 = this.rect.height();
            var2_2 = 1061997773;
            var22_23 = 0.8f;
            this.max_h = var18_19 = Math.round(var1_1 * var22_23);
            var7_8 = this.rect;
            var1_1 = var7_8.width() * var22_23;
            this.max_w = var18_19 = Math.round(var1_1);
        } else {
            var1_1 = this.rect.height();
            var2_2 = 1062836634;
            var22_23 = 0.85f;
            this.max_h = var18_19 = Math.round(var1_1 * var22_23);
            var7_8 = this.rect;
            var1_1 = var7_8.width() * var22_23;
            this.max_w = var18_19 = Math.round(var1_1);
        }
        var1_1 = this.rect.centerX();
        var22_23 = (float)this.staticLayout.getWidth() * var16_17;
        this.x = var1_1 -= var22_23;
        var1_1 = this.rect.centerY();
        var22_23 = (float)this.staticLayout.getHeight() * var16_17;
        this.y = var1_1 -= var22_23;
    }

    public void setupScaleSave(float f, int n) {
        int n2;
        Object object;
        int n3;
        int n4;
        int n5;
        Object object2;
        float f2;
        Object object3;
        CharSequence charSequence;
        block16: {
            charSequence = "";
            object3 = this.paintAya;
            f2 = n;
            object3.setTextSize(f *= f2);
            object3 = this.txt;
            object2 = new SpannableString((CharSequence)object3);
            n5 = this.number;
            n4 = -1;
            if (n5 != n4) {
                object3 = this.txt;
                n5 = ((String)object3).length();
                n4 = this.indexNumber;
                if (n5 <= n4) break block16;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n3 = this.number;
                charSequence = stringBuilder.append(n3);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n3 = this.indexNumber;
                try {
                    object2.setSpan(object, n3, n5, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        float f3 = this.rect.width();
        object3 = this.paintAya;
        object = object2.toString();
        float f4 = Math.round(object3.measureText(object));
        this.viewWidth = n3 = (int)Math.max(f3, f4);
        n3 = object2.length();
        object3 = this.paintAya;
        n4 = this.viewWidth;
        object2 = StaticLayout.Builder.obtain((CharSequence)object2, (int)0, (int)n3, (TextPaint)object3, (int)n4);
        charSequence = Layout.Alignment.ALIGN_CENTER;
        object2 = object2.setAlignment((Layout.Alignment)charSequence).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = object2;
        f = this.rect.height();
        f3 = 0.85f;
        this.max_h = n2 = Math.round(f * f3);
        this.max_w = n2 = Math.round(this.rect.width() * f3);
        f = this.rect.centerX();
        charSequence = this.staticLayout;
        n3 = charSequence.getWidth();
        f3 = n3;
        n5 = 0x3F000000;
        f4 = 0.5f;
        this.x = f -= (f3 *= f4);
        object2 = this.translation;
        if (object2 != null) {
            f = this.getFactorSizeTrl() * f2;
            this.updateTranslationSave(f);
            object2 = this.staticLayoutTranslation;
            if (object2 != null) {
                f = this.rect.centerX();
                f2 = (float)this.staticLayoutTranslation.getWidth() * f4;
                this.x_translation = f -= f2;
                f = this.rect.centerY();
                n = this.staticLayout.getHeight();
                n3 = this.staticLayoutTranslation.getHeight();
                f2 = (float)(n + n3) * f4;
                this.y = f -= f2;
                return;
            }
        }
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f4;
        this.y = f -= f2;
    }

    public void singleDraw(Canvas canvas) {
        Object object = this.staticLayout;
        if (object != null) {
            float f;
            int n = this.mPreset;
            Enum enum_ = AyaTextPreset.OUTLINE;
            int n2 = enum_.ordinal();
            if (n == n2 && (object = this.staticLayoutOutline) != null) {
                object = this.paintAyaOutline;
                enum_ = this.paintAya;
                f = enum_.getTextSize();
                object.setTextSize(f);
                object = this.staticLayoutOutline;
                object.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            object = this.translation;
            if (object != null && (object = this.staticLayoutTranslation) != null && (n = this.getIpad_type()) != (n2 = (enum_ = IpadType.BOTTOM_RECT).ordinal()) && (n = this.getIpad_type()) != (n2 = (enum_ = IpadType.CASSET).ordinal()) && (n = this.getIpad_type()) != (n2 = (enum_ = IpadType.CASSET_IMG).ordinal()) && (n = this.getIpad_type()) != (n2 = (enum_ = IpadType.CASSET_IMG_BLUR).ordinal())) {
                canvas.save();
                float f2 = -this.x;
                f = this.x_translation;
                f2 += f;
                f = this.staticLayout.getHeight();
                float f3 = this.padding;
                canvas.translate(f2, f *= f3);
                n = this.mPreset;
                enum_ = AyaTextPreset.OUTLINE;
                n2 = enum_.ordinal();
                if (n == n2 && (object = this.staticLayoutTranslationOutline) != null) {
                    object = this.paintAyaTrslOutline;
                    enum_ = this.paintTranslationAya;
                    f = enum_.getTextSize();
                    object.setTextSize(f);
                    object = this.staticLayoutTranslationOutline;
                    object.draw(canvas);
                }
                object = this.staticLayoutTranslation;
                object.draw(canvas);
                canvas.restore();
            }
        }
    }

    public void singleDraw(Canvas canvas, int n) {
        Object object = this.staticLayout;
        if (object != null) {
            IpadType ipadType;
            int n2;
            int n3;
            this.paintAya.setAlpha(n);
            this.staticLayout.draw(canvas);
            object = this.translation;
            if (object != null && (object = this.staticLayoutTranslation) != null && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.BOTTOM_RECT).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
                canvas.save();
                float f = -this.x;
                float f2 = this.x_translation;
                f += f2;
                ipadType = this.staticLayout;
                n2 = ipadType.getHeight();
                f2 = n2;
                float f3 = this.padding;
                canvas.translate(f, f2 *= f3);
                object = this.paintTranslationAya;
                object.setAlpha(n);
                StaticLayout staticLayout = this.staticLayoutTranslation;
                staticLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    public void singleDraw(Canvas canvas, int n, float f) {
        Object object = this.staticLayout;
        if (object != null) {
            IpadType ipadType;
            int n2;
            canvas.save();
            int n3 = this.staticLayout.getWidth();
            float f2 = (float)n3 * f;
            canvas.translate(f2, 0.0f);
            this.paintAya.setAlpha(n);
            this.staticLayout.draw(canvas);
            canvas.restore();
            object = this.translation;
            if (object != null && (object = this.staticLayoutTranslation) != null && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.BOTTOM_RECT).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n3 = this.getIpad_type()) != (n2 = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
                canvas.save();
                f2 = -this.x;
                float f3 = this.x_translation;
                f2 += f3;
                ipadType = this.staticLayout;
                n2 = ipadType.getHeight();
                f3 = n2;
                float f4 = this.padding;
                canvas.translate(f2, f3 *= f4);
                object = this.staticLayout;
                n3 = object.getWidth();
                f2 = n3;
                canvas.translate(f *= f2, 0.0f);
                TextPaint textPaint = this.paintTranslationAya;
                textPaint.setAlpha(n);
                StaticLayout staticLayout = this.staticLayoutTranslation;
                staticLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    public void slidToLeft(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 1.0f;
        object[1] = 0.0f;
        String string2 = "SlideX";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToLeftOut(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = -1.0f;
        String string2 = "SlideXOut";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToRight(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = -1.0f;
        object[1] = 0.0f;
        String string2 = "SlideX";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToRightOut(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = 1.0f;
        String string2 = "SlideXOut";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void update(RectF rectF, int n, int n2) {
        int n3;
        RectF rectF2;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        this.rect = rectF2 = new RectF(f, f2, f3, f4);
        this.max_h = n2;
        this.max_w = n;
        this.viewWidth = n3 = (int)this.rect.width();
    }

    public void updateIconDraw() {
        int n;
        int n2;
        SpannableString spannableString;
        String string2;
        CharSequence charSequence;
        block14: {
            charSequence = "";
            string2 = this.txt;
            spannableString = new SpannableString((CharSequence)string2);
            int n3 = this.number;
            n2 = -1;
            if (n3 != n2) {
                string2 = this.txt;
                n3 = string2.length();
                n2 = this.indexNumber;
                if (n3 <= n2) break block14;
                VectorDrawable vectorDrawable = this.vectorDrawable;
                Typeface typeface = this.typefaceNumber;
                StringBuilder stringBuilder = new StringBuilder((String)charSequence);
                n = this.number;
                charSequence = stringBuilder.append(n);
                charSequence = ((StringBuilder)charSequence).toString();
                EndOfAyaSpan endOfAyaSpan = new EndOfAyaSpan(vectorDrawable, typeface, (String)charSequence);
                n = this.indexNumber;
                try {
                    spannableString.setSpan((Object)endOfAyaSpan, n, n3, 0);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        n = spannableString.length();
        string2 = this.paintAya;
        n2 = this.viewWidth;
        charSequence = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)string2, (int)n2);
        spannableString = Layout.Alignment.ALIGN_CENTER;
        charSequence = charSequence.setAlignment((Layout.Alignment)spannableString).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = charSequence;
    }

    public void updateStaticLayout() {
        int n;
        Object object = this.spannableString;
        int n2 = object.length();
        Object object2 = this.paintAya;
        int n3 = this.viewWidth;
        String string2 = null;
        object = StaticLayout.Builder.obtain((CharSequence)object, (int)0, (int)n2, (TextPaint)object2, (int)n3);
        Object object3 = Layout.Alignment.ALIGN_CENTER;
        object = object.setAlignment((Layout.Alignment)object3);
        n2 = 0;
        float f = 0.0f;
        object3 = null;
        int n4 = 1065353216;
        float f2 = 1.0f;
        object = object.setLineSpacing(0.0f, f2).setIncludePad(false).build();
        this.staticLayout = object;
        object = this.translation;
        if (object != null && (n = this.getIpad_type()) != (n2 = ((Enum)(object3 = IpadType.BOTTOM_RECT)).ordinal()) && (n = this.getIpad_type()) != (n2 = ((Enum)(object3 = IpadType.CASSET)).ordinal()) && (n = this.getIpad_type()) != (n2 = ((Enum)(object3 = IpadType.CASSET_IMG)).ordinal()) && (n = this.getIpad_type()) != (n2 = ((Enum)(object3 = IpadType.CASSET_IMG_BLUR)).ordinal())) {
            n = this.viewWidth;
            object3 = this.translation;
            object2 = this.paintTranslationAya;
            object3 = this.buildStaticLayout((String)object3, (TextPaint)object2, n);
            this.staticLayoutTranslation = object3;
            n2 = object3.getLineCount();
            n4 = 2;
            f2 = 2.8E-45f;
            if (n2 == n4) {
                object3 = this.staticLayoutTranslation;
                n2 = object3.getLineCount() + -1;
                while (true) {
                    n4 = this.staticLayoutTranslation.getLineStart(n2);
                    n3 = this.staticLayoutTranslation.getLineEnd(n2);
                    string2 = this.translation;
                    object2 = string2.substring(n4, n3).trim();
                    String string3 = "\\s+";
                    n4 = ((Object)(object2 = ((String)object2).split(string3))).length;
                    if (n4 >= (n3 = 3)) break;
                    n4 = 10;
                    f2 = 1.4E-44f;
                    if ((n += -10) < n4) break;
                    object2 = this.translation;
                    string3 = this.paintTranslationAya;
                    object2 = this.buildStaticLayout((String)object2, (TextPaint)string3, n);
                    this.staticLayoutTranslation = object2;
                }
                object = this.rect;
                float f3 = object.centerX();
                object3 = this.staticLayoutTranslation;
                n2 = object3.getWidth();
                f = n2;
                n4 = 0x3F000000;
                f2 = 0.5f;
                this.x_translation = f3 -= (f *= f2);
            } else {
                float f4;
                this.x_translation = f4 = this.x;
            }
        }
    }

    public void updateTranslation(float f) {
        int n = this.isTrsl();
        if (n == 0) {
            return;
        }
        TextPaint textPaint = this.paintTranslationAya;
        textPaint.setTextSize(f);
        float f2 = this.viewWidth;
        int n2 = 0x3F666666;
        n = (int)(f2 *= 0.9f);
        String string2 = this.translation;
        TextPaint textPaint2 = this.paintTranslationAya;
        string2 = this.buildStaticLayout(string2, textPaint2, n);
        this.staticLayoutTranslation = string2;
        float f3 = (float)n * 0.17f;
        textPaint2 = this.staticLayout;
        int n3 = textPaint2.getWidth();
        float f4 = n3;
        float f5 = 0.4f;
        f4 *= f5;
        StaticLayout staticLayout = this.staticLayoutTranslation;
        int n4 = staticLayout.getLineCount() + -1;
        while (true) {
            int n5 = this.staticLayoutTranslation.getLineStart(n4);
            int n6 = this.staticLayoutTranslation.getLineEnd(n4);
            String string3 = this.translation;
            StaticLayout staticLayout2 = string3.substring(n5, n6).trim();
            String string4 = "\\s+";
            n5 = ((String[])(staticLayout2 = staticLayout2.split(string4))).length;
            if (n5 >= (n6 = 2)) break;
            f2 = (float)n - f3;
            float f6 = n = (int)f2;
            float f7 = f6 - f4;
            n5 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (n5 < 0) {
                this.paintTranslationAya.setTextSize(f);
                String string5 = this.translation;
                textPaint = this.paintTranslationAya;
                n2 = this.viewWidth;
                string5 = this.buildStaticLayout(string5, textPaint, n2);
                this.staticLayoutTranslation = string5;
                break;
            }
            staticLayout2 = this.translation;
            string4 = this.paintTranslationAya;
            this.staticLayoutTranslation = staticLayout2 = this.buildStaticLayout((String)staticLayout2, (TextPaint)string4, n);
        }
        f = this.rect.centerX();
        f2 = this.staticLayoutTranslation.getWidth();
        f3 = 0.5f;
        this.x_translation = f -= (f2 *= f3);
        f = this.rect.centerY();
        n = this.staticLayout.getHeight();
        n3 = this.staticLayoutTranslation.getHeight();
        f2 = (float)(n + n3) * f3;
        this.y = f -= f2;
    }

    public void updateTranslationSave(float f) {
        IpadType ipadType;
        int n;
        int n2;
        String string2 = this.translation;
        if (string2 != null && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET_IMG).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.BOTTOM_RECT).ordinal()) && (n2 = this.getIpad_type()) != (n = (ipadType = IpadType.CASSET_IMG_BLUR).ordinal())) {
            float f2;
            float f3;
            float f4;
            float f5;
            RectF rectF;
            float f6;
            StaticLayout staticLayout;
            this.paintTranslationAya.setTextSize(f);
            int n3 = (int)((float)this.viewWidth * 0.9f);
            string2 = this.translation;
            ipadType = this.paintTranslationAya;
            this.staticLayoutTranslation = staticLayout = this.buildStaticLayout(string2, (TextPaint)ipadType, n3);
            staticLayout = this.staticLayout;
            f = staticLayout.getWidth();
            string2 = this.rect;
            float f7 = string2.width();
            n3 = f == f7 ? 0 : (f > f7 ? 1 : -1);
            n2 = 0x3F000000;
            f7 = 0.5f;
            if (n3 > 0) {
                staticLayout = this.staticLayout;
                n3 = staticLayout.getWidth();
                f = (float)n3 * f7;
                ipadType = this.rect;
                ((RectF)ipadType).left = f6 = this.rect.centerX() - f;
                ipadType = this.rect;
                rectF = this.rect;
                ((RectF)ipadType).right = f6 = rectF.centerX() + f;
            }
            if ((n3 = (int)((f5 = (f = (float)(staticLayout = this.staticLayoutTranslation).getWidth()) - (f4 = (ipadType = this.rect).width())) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
                staticLayout = this.staticLayoutTranslation;
                n3 = staticLayout.getWidth();
                f = (float)n3 * f7;
                ipadType = this.rect;
                ((RectF)ipadType).left = f6 = this.rect.centerX() - f;
                ipadType = this.rect;
                rectF = this.rect;
                ((RectF)ipadType).right = f6 = rectF.centerX() + f;
            }
            if ((n3 = (int)((f3 = (f = (float)(staticLayout = this.staticLayout).getHeight()) - (f4 = (ipadType = this.rect).height())) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1))) > 0) {
                staticLayout = this.staticLayout;
                n3 = staticLayout.getHeight();
                f = (float)n3 * f7;
                ipadType = this.rect;
                ((RectF)ipadType).top = f6 = this.rect.centerY() - f;
                ipadType = this.rect;
                rectF = this.rect;
                ((RectF)ipadType).bottom = f6 = rectF.centerY() + f;
            }
            if ((n3 = (int)((f2 = (f = (float)(staticLayout = this.staticLayoutTranslation).getHeight()) - (f4 = (ipadType = this.rect).height())) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1))) > 0) {
                staticLayout = this.staticLayoutTranslation;
                n3 = staticLayout.getHeight();
                f = (float)n3 * f7;
                string2 = this.rect;
                ((RectF)string2).top = f4 = this.rect.centerY() - f;
                string2 = this.rect;
                ipadType = this.rect;
                ((RectF)string2).bottom = f4 = ipadType.centerY() + f;
            }
        }
    }

    public void zoomIn_In(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = 1.0f;
        String string2 = "FactorSize";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }
}

