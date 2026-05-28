/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.DashPathEffect
 *  android.graphics.Insets
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.PathEffect
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Pair
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.Scroller
 *  androidx.core.content.ContextCompat
 *  androidx.core.view.GestureDetectorCompat
 */
package hazem.nurmontage.videoquran.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.GestureDetectorCompat;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.Utils.CanvasUtils;
import hazem.nurmontage.videoquran.common.StackEntity;
import hazem.nurmontage.videoquran.constant.EntityAction;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.views.TrackEntityView$1;
import hazem.nurmontage.videoquran.views.TrackEntityView$2;
import hazem.nurmontage.videoquran.views.TrackEntityView$4;
import hazem.nurmontage.videoquran.views.TrackEntityView$5;
import hazem.nurmontage.videoquran.views.TrackEntityView$6;
import hazem.nurmontage.videoquran.views.TrackEntityView$7;
import hazem.nurmontage.videoquran.views.TrackEntityView$8;
import hazem.nurmontage.videoquran.views.TrackEntityView$9;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import hazem.nurmontage.videoquran.views.TrackEntityView$ScaleListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.Vector;

public class TrackEntityView
extends FrameLayout
implements View.OnTouchListener {
    private static final float DEFAULT_SCALE = 0.5f;
    private final int CLR_DEFAULT_BG;
    private float DETECT_LEFT_MOVE;
    private float DETECT_RIGHT_MOVE;
    private final float FACTOR_VITESSE;
    private final float MAX_SCALE;
    private final float MIN_SCALE;
    private float SPEED;
    private float TOLERANCE_X;
    private Runnable autoMoveRunnable;
    private Handler autoScrollHandler;
    private Runnable autoScrollRunnable;
    private EntityBismilahTimeline bismilahTimeline;
    private ImageButton btn_redo;
    private ImageButton btn_undo;
    private float canvas_top_Y;
    private float centerX;
    private int clr_btn_audio;
    private int clr_btn_quran;
    private int clr_btn_trsl;
    private final int clr_select;
    private int countMove;
    private float currentEventX;
    private float currentPosition;
    private int current_cursur_position;
    private int duration;
    private float dx;
    private Stack entityList;
    private List entityListAudio;
    private final List entityListQuran;
    private final List entityListTrslQuran;
    private float eventX;
    private float eventY;
    List exclusionRects;
    private GestureDetectorCompat gestureDetector;
    private final GestureDetector.SimpleOnGestureListener gestureListener;
    private TrackEntityView$ITrimLineCallback iTrimLineCallback;
    private boolean isArabic_lang;
    private boolean isAutoMove;
    private boolean isAutoScroll;
    private boolean isCheckLine;
    private boolean isCheckLineCursur;
    private boolean isDetectChange;
    private boolean isFling;
    private boolean isMove;
    private boolean isOnUp;
    private boolean isPassScroll;
    private boolean isPlaying;
    private boolean isProgress;
    private boolean isScaleListener;
    private float lasX;
    private long lastDifference;
    private long lastTime;
    private EntityBismilahTimeline mIsi3adaTimeline;
    private float mScrollY;
    private float m_pos_y_marker;
    private float markerHeight;
    private float maxBottom;
    private int maxTime;
    private float max_trim;
    private ObjectAnimator objectAnimator;
    private boolean onThink;
    private float p;
    private float paddingCursur;
    private Paint paintCursur;
    private final Paint paintItem;
    private Paint paintLineCheck;
    private Paint paintMaker;
    private Paint paint_time;
    private boolean pass;
    private Path pathItemAudio;
    private Path pathItemQuran;
    private Path pathItemTrslQuran;
    private float posY;
    private float radius;
    private RectF rectFItemQuran;
    private RectF rectFItemTrslQuran;
    private RectF rectItemAudio;
    private RectF rectSquareAudio;
    private RectF rectSquareQuran;
    private RectF rectSquareTrslQuran;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    private float scrolled_with_zoom;
    private Scroller scroller;
    private float second_in_screen;
    private Entity selectedEntity;
    private float signeX;
    private float signeY;
    private float startXLine;
    private float start_y_draw;
    private float target;
    private float timeLineW;
    private long time_start;
    private Stack undoEntityList;
    private float w_time_item;
    private int width_screen;
    float y;

    static /* bridge */ /* synthetic */ float cfr_renamed_428(TrackEntityView trackEntityView) {
        return trackEntityView.SPEED;
    }

    static /* bridge */ /* synthetic */ Handler cfr_renamed_82(TrackEntityView trackEntityView) {
        return trackEntityView.autoScrollHandler;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_429(TrackEntityView trackEntityView) {
        return trackEntityView.centerX;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_430(TrackEntityView trackEntityView) {
        return trackEntityView.clr_btn_audio;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_431(TrackEntityView trackEntityView) {
        return trackEntityView.clr_btn_quran;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_432(TrackEntityView trackEntityView) {
        return trackEntityView.clr_btn_trsl;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_433(TrackEntityView trackEntityView) {
        return trackEntityView.currentPosition;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_434(TrackEntityView trackEntityView) {
        return trackEntityView.entityListAudio;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_435(TrackEntityView trackEntityView) {
        return trackEntityView.entityListQuran;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_436(TrackEntityView trackEntityView) {
        return trackEntityView.entityListTrslQuran;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_437(TrackEntityView trackEntityView) {
        return trackEntityView.eventX;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_438(TrackEntityView trackEntityView) {
        return trackEntityView.eventY;
    }

    static /* bridge */ /* synthetic */ TrackEntityView$ITrimLineCallback cfr_renamed_73(TrackEntityView trackEntityView) {
        return trackEntityView.iTrimLineCallback;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_439(TrackEntityView trackEntityView) {
        return trackEntityView.isAutoMove;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_440(TrackEntityView trackEntityView) {
        return trackEntityView.isAutoScroll;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_441(TrackEntityView trackEntityView) {
        return trackEntityView.isPassScroll;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_442(TrackEntityView trackEntityView) {
        return trackEntityView.isProgress;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_443(TrackEntityView trackEntityView) {
        return trackEntityView.isScaleListener;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_444(TrackEntityView trackEntityView) {
        return trackEntityView.max_trim;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_445(TrackEntityView trackEntityView) {
        return trackEntityView.radius;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_446(TrackEntityView trackEntityView) {
        return trackEntityView.scaleFactor;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_447(TrackEntityView trackEntityView) {
        return trackEntityView.scrolled_with_zoom;
    }

    static /* bridge */ /* synthetic */ Scroller cfr_renamed_448(TrackEntityView trackEntityView) {
        return trackEntityView.scroller;
    }

    static /* bridge */ /* synthetic */ Entity cfr_renamed_449(TrackEntityView trackEntityView) {
        return trackEntityView.selectedEntity;
    }

    static /* bridge */ /* synthetic */ float cfr_renamed_450(TrackEntityView trackEntityView) {
        return trackEntityView.timeLineW;
    }

    static /* bridge */ /* synthetic */ long cfr_renamed_451(TrackEntityView trackEntityView) {
        return trackEntityView.time_start;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_452(TrackEntityView trackEntityView, int n) {
        trackEntityView.clr_btn_audio = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_453(TrackEntityView trackEntityView, int n) {
        trackEntityView.clr_btn_quran = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_454(TrackEntityView trackEntityView, int n) {
        trackEntityView.clr_btn_trsl = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_455(TrackEntityView trackEntityView, float f) {
        trackEntityView.currentPosition = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_456(TrackEntityView trackEntityView, float f) {
        trackEntityView.eventX = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_457(TrackEntityView trackEntityView, float f) {
        trackEntityView.eventY = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_458(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isAutoMove = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_459(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isAutoScroll = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_460(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isCheckLine = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_461(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isCheckLineCursur = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_462(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isMove = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_463(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isPassScroll = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_464(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.isScaleListener = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_465(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.onThink = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_466(TrackEntityView trackEntityView, boolean bl) {
        trackEntityView.pass = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_467(TrackEntityView trackEntityView, float f) {
        trackEntityView.scaleFactor = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_468(TrackEntityView trackEntityView, float f) {
        trackEntityView.scrolled_with_zoom = f;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_469(TrackEntityView trackEntityView, float f) {
        trackEntityView.target = f;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_470(TrackEntityView trackEntityView, float f, float f2) {
        return trackEntityView.handleItemInteraction(f, f2);
    }

    public TrackEntityView(Context object) {
        super(object);
        Paint paint;
        super();
        this.entityListAudio = object;
        super();
        this.entityListQuran = object;
        super();
        this.entityListTrslQuran = object;
        super();
        this.entityList = object;
        super();
        this.undoEntityList = object;
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        super();
        this.exclusionRects = object;
        int n = 1;
        this.isPassScroll = n;
        this.onThink = n;
        this.scaleFactor = 0.5f;
        this.paintItem = paint = new Paint(n);
        this.clr_select = -794718;
        this.CLR_DEFAULT_BG = n = -13421771;
        this.clr_btn_audio = n;
        this.clr_btn_quran = n;
        this.clr_btn_trsl = n;
        super(this);
        this.gestureListener = object;
        this.init();
    }

    public TrackEntityView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        super();
        this.entityListAudio = object;
        super();
        this.entityListQuran = object;
        super();
        this.entityListTrslQuran = object;
        super();
        this.entityList = object;
        super();
        this.undoEntityList = object;
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        super();
        this.exclusionRects = object;
        int n = 1;
        this.isPassScroll = n;
        this.onThink = n;
        this.scaleFactor = 0.5f;
        super(n);
        this.paintItem = attributeSet;
        this.clr_select = -794718;
        this.CLR_DEFAULT_BG = n = -13421771;
        this.clr_btn_audio = n;
        this.clr_btn_quran = n;
        this.clr_btn_trsl = n;
        super(this);
        this.gestureListener = object;
        this.init();
    }

    public TrackEntityView(Context object, AttributeSet attributeSet, int n) {
        super(object, attributeSet, n);
        super();
        this.entityListAudio = object;
        super();
        this.entityListQuran = object;
        super();
        this.entityListTrslQuran = object;
        super();
        this.entityList = object;
        super();
        this.undoEntityList = object;
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        super();
        this.exclusionRects = object;
        int n2 = 1;
        this.isPassScroll = n2;
        this.onThink = n2;
        this.scaleFactor = 0.5f;
        super(n2);
        this.paintItem = attributeSet;
        this.clr_select = -794718;
        this.CLR_DEFAULT_BG = n2 = -13421771;
        this.clr_btn_audio = n2;
        this.clr_btn_quran = n2;
        this.clr_btn_trsl = n2;
        super(this);
        this.gestureListener = object;
        this.init();
    }

    private boolean deselectAllAudioItems() {
        boolean bl;
        Object object = this.entityListAudio;
        if (object == null) {
            return false;
        }
        object = object.iterator();
        boolean bl2 = false;
        while (bl = object.hasNext()) {
            EntityAudio entityAudio = (EntityAudio)object.next();
            boolean bl3 = entityAudio.visible();
            if (!bl3 || !(bl3 = entityAudio.isSelect())) continue;
            entityAudio.setSelect(false);
            entityAudio.setSelectMultiple(false);
            bl2 = true;
        }
        if (bl2) {
            int n;
            this.clr_btn_audio = n = -13421771;
        }
        return bl2;
    }

    private boolean deselectAllQuranItems() {
        boolean bl;
        EntityBismilahTimeline entityBismilahTimeline = this.bismilahTimeline;
        int n = this.isExist(entityBismilahTimeline);
        int n2 = 1;
        if (n != 0 && (n = (entityBismilahTimeline = this.bismilahTimeline).isSelect()) != 0) {
            this.bismilahTimeline.setSelect(false);
            entityBismilahTimeline = this.bismilahTimeline;
            entityBismilahTimeline.setSelectMultiple(false);
            n = n2;
        } else {
            n = 0;
            entityBismilahTimeline = null;
        }
        Iterator iterator = this.mIsi3adaTimeline;
        boolean bl2 = this.isExist((EntityBismilahTimeline)((Object)iterator));
        if (bl2 && (bl2 = ((Entity)((Object)(iterator = this.mIsi3adaTimeline))).isSelect())) {
            this.mIsi3adaTimeline.setSelect(false);
            entityBismilahTimeline = this.mIsi3adaTimeline;
            entityBismilahTimeline.setSelectMultiple(false);
            n = n2;
        }
        if ((iterator = this.entityListQuran) == null) {
            return n != 0;
        }
        iterator = iterator.iterator();
        while (bl = iterator.hasNext()) {
            EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)iterator.next();
            boolean bl3 = entityQuranTimeline.visible();
            if (!bl3 || !(bl3 = entityQuranTimeline.isSelect())) continue;
            entityQuranTimeline.setSelect(false);
            entityQuranTimeline.setSelectMultiple(false);
            n = n2;
        }
        if (n != 0) {
            this.clr_btn_quran = n2 = -13421771;
        }
        return n != 0;
    }

    private boolean deselectAllTrslQuranItems() {
        boolean bl;
        Object object = this.entityListTrslQuran;
        if (object == null) {
            return false;
        }
        object = object.iterator();
        boolean bl2 = false;
        while (bl = object.hasNext()) {
            EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)object.next();
            boolean bl3 = entityTrslTimeline.visible();
            if (!bl3 || !(bl3 = entityTrslTimeline.isSelect())) continue;
            entityTrslTimeline.setSelect(false);
            entityTrslTimeline.setSelectMultiple(false);
            bl2 = true;
        }
        if (bl2) {
            int n;
            this.clr_btn_trsl = n = -13421771;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    private void drawAllEntities(Canvas var1_1, int var2_2, int var3_3) {
        block39: {
            block40: {
                block42: {
                    block41: {
                        this.y = var4_4 = this.start_y_draw;
                        var5_5 = this.scrolled_with_zoom;
                        var6_6 = this.centerX;
                        var5_5 = -var5_5;
                        var8_8 = var5_5 - var6_6;
                        var9_9 = -this.mScrollY;
                        var10_10 = this.y;
                        var9_9 += var10_10;
                        var5_5 += var6_6;
                        var6_6 = var1_1.getHeight();
                        var10_10 = this.mScrollY;
                        var7_7 = new RectF(var8_8, var9_9, var5_5, var6_6 -= var10_10);
                        var5_5 = 0.0f;
                        var11_11 = 0;
                        var6_6 = 0.0f;
                        while (true) {
                            block25: {
                                block27: {
                                    block29: {
                                        block28: {
                                            block26: {
                                                var12_12 = this.entityListAudio;
                                                var13_13 = var12_12.size();
                                                var14_14 = true;
                                                var9_9 = 1.4E-45f;
                                                var10_10 = 0.0f;
                                                if (var11_11 >= var13_13) break;
                                                var12_12 = (EntityAudio)this.entityListAudio.get(var11_11);
                                                var15_15 = var12_12.visible();
                                                if (!var15_15) break block25;
                                                var16_16 = this.selectedEntity;
                                                if (var16_16 != var12_12 || (var17_17 = this.isPlaying()) != 0) break block26;
                                                var16_16 = this.selectedEntity;
                                                var9_9 = this.y;
                                                var16_16.setY(var9_9);
                                                var16_16 = this.selectedEntity;
                                                var9_9 = this.scaleFactor;
                                                var16_16.updateRect(var9_9);
                                                var16_16 = var12_12.getRect();
                                                var4_4 = var16_16.bottom;
                                                var8_8 = this.p;
                                                break block27;
                                            }
                                            var4_4 = this.scaleFactor;
                                            var12_12.updateRect(var4_4);
                                            var17_17 = var12_12.isVisible();
                                            if (var17_17 == 0) break block28;
                                            var4_4 = this.getCurrentPosition();
                                            var18_18 = var12_12.getRect();
                                            var9_9 = var18_18.left;
                                            cfr_temp_0 = (var4_4 = (float)Math.round(var4_4 + var9_9)) - 0.0f;
                                            var17_17 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var17_17 > 0) ** GOTO lbl-1000
                                            var4_4 = this.getCurrentPosition();
                                            var18_18 = var12_12.getRect();
                                            var9_9 = var18_18.right;
                                            cfr_temp_1 = (var4_4 = (float)Math.round(var4_4 + var9_9)) - 0.0f;
                                            var17_17 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                            if (var17_17 > 0) {
                                                this.setupFade((EntityAudio)var12_12);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var12_12.setVisible(false);
                                            }
                                            break block29;
                                        }
                                        var16_16 = var12_12.getRect();
                                        var4_4 = var16_16.left;
                                        var19_19 = this.getCurrentPosition();
                                        cfr_temp_2 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                        var17_17 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                        if (var17_17 <= 0) {
                                            var16_16 = var12_12.getRect();
                                            var4_4 = var16_16.right;
                                            var19_19 = this.getCurrentPosition();
                                            cfr_temp_3 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                            var17_17 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                            if (var17_17 > 0) {
                                                this.setupFade((EntityAudio)var12_12);
                                                var12_12.setVisible(var14_14);
                                                var16_16 = this.iTrimLineCallback;
                                                var16_16.onUpdatePlayerAudio((EntityAudio)var12_12);
                                            }
                                        }
                                    }
                                    var4_4 = this.y;
                                    var12_12.setY(var4_4);
                                    var16_16 = var12_12.getRect();
                                    var17_17 = (int)RectF.intersects((RectF)var7_7, (RectF)var16_16);
                                    if (var17_17 != 0) {
                                        var12_12.update((Canvas)var1_1);
                                    }
                                    var16_16 = var12_12.getRect();
                                    var4_4 = var16_16.bottom;
                                    var8_8 = this.p;
                                }
                                var4_4 += var8_8;
                            }
                            ++var11_11;
                        }
                        this.y = var4_4;
                        var4_4 = this.start_y_draw;
                        var6_6 = this.drawBasmala((Canvas)var1_1, var7_7);
                        var8_8 = this.p;
                        var4_4 = Math.max(var4_4, var6_6 += var8_8);
                        var6_6 = 0.0f;
                        for (var11_11 = 0; var11_11 < (var13_13 = (var12_12 = this.entityListQuran).size()); ++var11_11) {
                            block31: {
                                block32: {
                                    block33: {
                                        block30: {
                                            var12_12 = (EntityQuranTimeline)this.entityListQuran.get(var11_11);
                                            var15_15 = var12_12.visible();
                                            if (!var15_15) continue;
                                            var16_16 = this.selectedEntity;
                                            if (var16_16 != var12_12 || (var17_17 = (int)this.isPlaying()) != 0) break block30;
                                            var4_4 = this.scaleFactor;
                                            var12_12.updateRect(var4_4);
                                            var16_16 = this.selectedEntity;
                                            var19_19 = this.y;
                                            var16_16.setY(var19_19);
                                            var16_16 = var12_12.getRect();
                                            var4_4 = var16_16.bottom;
                                            var8_8 = this.p;
                                            break block31;
                                        }
                                        var4_4 = this.scaleFactor;
                                        var12_12.updateRect(var4_4);
                                        var16_16 = var12_12.getEntityView();
                                        if (var16_16 == null) break block32;
                                        var16_16 = var12_12.getEntityView();
                                        var17_17 = (int)var16_16.isVisible();
                                        if (var17_17 == 0) break block33;
                                        var4_4 = this.getCurrentPosition();
                                        var20_20 = var12_12.getRect();
                                        var19_19 = var20_20.left;
                                        cfr_temp_4 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                        var17_17 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                        if (var17_17 > 0) ** GOTO lbl-1000
                                        var4_4 = this.getCurrentPosition();
                                        var20_20 = var12_12.getRect();
                                        var19_19 = var20_20.right;
                                        cfr_temp_5 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                        var17_17 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                                        if (var17_17 > 0) {
                                            var16_16 = var12_12.getQuranEntity();
                                            this.setupAnimation((QuranEntity)var16_16);
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var12_12.getEntityView().setVisible(false);
                                            var12_12.getQuranEntity().endAnimator();
                                            var16_16 = this.iTrimLineCallback;
                                            var16_16.onUpdate();
                                        }
                                        break block32;
                                    }
                                    var16_16 = var12_12.getRect();
                                    var4_4 = var16_16.left;
                                    var19_19 = this.getCurrentPosition();
                                    cfr_temp_6 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                    var17_17 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1);
                                    if (var17_17 <= 0) {
                                        var16_16 = var12_12.getRect();
                                        var4_4 = var16_16.right;
                                        var19_19 = this.getCurrentPosition();
                                        cfr_temp_7 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                        var17_17 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                        if (var17_17 > 0) {
                                            var16_16 = var12_12.getQuranEntity();
                                            this.setupAnimation((QuranEntity)var16_16);
                                            var12_12.getEntityView().setVisible(var14_14);
                                            var16_16 = this.iTrimLineCallback;
                                            var16_16.onUpdate();
                                        }
                                    }
                                }
                                var4_4 = this.y;
                                var12_12.setY(var4_4);
                                var16_16 = var12_12.getRect();
                                var17_17 = (int)RectF.intersects((RectF)var7_7, (RectF)var16_16);
                                if (var17_17 != 0) {
                                    var12_12.update((Canvas)var1_1);
                                }
                                var16_16 = var12_12.getRect();
                                var4_4 = var16_16.bottom;
                                var8_8 = this.p;
                            }
                            var4_4 += var8_8;
                        }
                        this.y = var4_4;
                        var6_6 = 0.0f;
                        for (var11_11 = 0; var11_11 < (var13_13 = (var12_12 = this.entityListTrslQuran).size()); ++var11_11) {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block34: {
                                                var12_12 = (EntityTrslTimeline)this.entityListTrslQuran.get(var11_11);
                                                var15_15 = var12_12.visible();
                                                if (!var15_15) continue;
                                                var16_16 = this.selectedEntity;
                                                if (var16_16 != var12_12 || (var17_17 = (int)this.isPlaying()) != 0) break block34;
                                                var4_4 = this.scaleFactor;
                                                var12_12.updateRect(var4_4);
                                                var16_16 = this.selectedEntity;
                                                var19_19 = this.y;
                                                var16_16.setY(var19_19);
                                                var16_16 = var12_12.getRect();
                                                var4_4 = var16_16.bottom;
                                                var8_8 = this.p;
                                                break block35;
                                            }
                                            var4_4 = this.scaleFactor;
                                            var12_12.updateRect(var4_4);
                                            var16_16 = var12_12.getEntityView();
                                            if (var16_16 == null) break block36;
                                            var16_16 = var12_12.getEntityView();
                                            var17_17 = (int)var16_16.isVisible();
                                            if (var17_17 == 0) break block37;
                                            var4_4 = this.getCurrentPosition();
                                            var20_20 = var12_12.getRect();
                                            var19_19 = var20_20.left;
                                            cfr_temp_8 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                            var17_17 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
                                            if (var17_17 > 0) break block38;
                                            var4_4 = this.getCurrentPosition();
                                            var20_20 = var12_12.getRect();
                                            var19_19 = var20_20.right;
                                            cfr_temp_9 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                            var17_17 = cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 < 0.0f ? -1 : 1);
                                            if (var17_17 > 0) break block36;
                                        }
                                        var12_12.getEntityView().setVisible(false);
                                        var12_12.getQuranEntity().endAnimator();
                                        var16_16 = this.iTrimLineCallback;
                                        var16_16.onUpdate();
                                        break block36;
                                    }
                                    var16_16 = var12_12.getRect();
                                    var4_4 = var16_16.left;
                                    var19_19 = this.getCurrentPosition();
                                    cfr_temp_10 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                    var17_17 = cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 < 0.0f ? -1 : 1);
                                    if (var17_17 <= 0) {
                                        var16_16 = var12_12.getRect();
                                        var4_4 = var16_16.right;
                                        var19_19 = this.getCurrentPosition();
                                        cfr_temp_11 = (var4_4 = (float)Math.round(var4_4 + var19_19)) - 0.0f;
                                        var17_17 = cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1);
                                        if (var17_17 > 0) {
                                            var12_12.getEntityView().setVisible(var14_14);
                                            var16_16 = this.iTrimLineCallback;
                                            var16_16.onUpdate();
                                        }
                                    }
                                }
                                var4_4 = this.y;
                                var12_12.setY(var4_4);
                                var16_16 = var12_12.getRect();
                                var17_17 = (int)RectF.intersects((RectF)var7_7, (RectF)var16_16);
                                if (var17_17 != 0) {
                                    var12_12.update((Canvas)var1_1);
                                }
                                var16_16 = var12_12.getRect();
                                var4_4 = var16_16.bottom;
                                var8_8 = this.p;
                            }
                            var4_4 += var8_8;
                        }
                        this.y = var4_4;
                        var16_16 = this.selectedEntity;
                        if (var16_16 == null || (var17_17 = (int)this.isPlaying()) != 0 || (var17_17 = (int)(var16_16 = this.selectedEntity).visible()) == 0) break block39;
                        var16_16 = this.selectedEntity.getRect();
                        var17_17 = (int)RectF.intersects((RectF)var7_7, (RectF)var16_16);
                        if (var17_17 == 0) break block40;
                        var16_16 = this.selectedEntity;
                        var11_11 = var16_16 instanceof EntityAudio;
                        if (var11_11 == 0) break block41;
                        var16_16 = ((Entity)var16_16).getRect();
                        var4_4 = var16_16.left;
                        var6_6 = this.getCurrentPosition();
                        cfr_temp_12 = (var4_4 = (float)Math.round(var4_4 + var6_6)) - 0.0f;
                        var17_17 = cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 < 0.0f ? -1 : 1);
                        if (var17_17 > 0) ** GOTO lbl-1000
                        var16_16 = this.selectedEntity.getRect();
                        var4_4 = var16_16.right;
                        var6_6 = this.getCurrentPosition();
                        cfr_temp_13 = (var4_4 = (float)Math.round(var4_4 + var6_6)) - 0.0f;
                        var17_17 = cfr_temp_13 == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1);
                        if (var17_17 > 0) {
                            var16_16 = this.selectedEntity;
                            var16_16.setVisible(var14_14);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var16_16 = this.selectedEntity;
                            var16_16.setVisible(false);
                        }
                        break block42;
                    }
                    if ((var16_16 = var16_16.getEntityView()) == null) break block42;
                    var16_16 = this.selectedEntity.getRect();
                    var4_4 = var16_16.left;
                    var6_6 = this.getCurrentPosition();
                    cfr_temp_14 = (var4_4 = (float)Math.round(var4_4 + var6_6)) - 0.0f;
                    var17_17 = cfr_temp_14 == 0.0f ? 0 : (cfr_temp_14 < 0.0f ? -1 : 1);
                    if (var17_17 > 0) ** GOTO lbl-1000
                    var16_16 = this.selectedEntity.getRect();
                    var4_4 = var16_16.right;
                    var6_6 = this.getCurrentPosition();
                    cfr_temp_15 = (var4_4 = (float)Math.round(var4_4 + var6_6)) - 0.0f;
                    var17_17 = cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1);
                    if (var17_17 > 0) {
                        this.selectedEntity.getEntityView().endAnimator();
                        var16_16 = this.selectedEntity.getEntityView();
                        var17_17 = (int)var16_16.isVisible();
                        if (var17_17 == 0) {
                            this.selectedEntity.getEntityView().setVisible(var14_14);
                            var16_16 = this.iTrimLineCallback;
                            var16_16.onUpdate();
                        }
                    } else if ((var17_17 = (int)(var16_16 = this.selectedEntity.getEntityView()).isVisible()) != 0) {
                        this.selectedEntity.getEntityView().endAnimator();
                        this.selectedEntity.getEntityView().setVisible(false);
                        var16_16 = this.iTrimLineCallback;
                        var16_16.onUpdate();
                    }
                }
                var16_16 = this.selectedEntity;
                var16_16.update((Canvas)var1_1, var2_2, var3_3);
                break block39;
            }
            var1_1 = this.selectedEntity.getEntityView();
            if (var1_1 != null && (var21_21 = (var1_1 = this.selectedEntity.getEntityView()).isVisible())) {
                this.selectedEntity.getEntityView().endAnimator();
                this.selectedEntity.getEntityView().setVisible(false);
                var1_1 = this.iTrimLineCallback;
                var1_1.onUpdate();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private float drawBasmala(Canvas var1_1, RectF var2_2) {
        block14: {
            block15: {
                block16: {
                    block13: {
                        block10: {
                            block11: {
                                block12: {
                                    var3_3 = this.bismilahTimeline;
                                    var4_4 = this.isExist((EntityBismilahTimeline)var3_3);
                                    var5_5 = true;
                                    var6_6 = 1.4E-45f;
                                    var7_7 = 0.0f;
                                    if (var4_4 == 0) break block10;
                                    var3_3 = this.bismilahTimeline;
                                    var8_8 = this.scaleFactor;
                                    var3_3.updateRect(var8_8);
                                    var3_3 = this.bismilahTimeline.getEntityView();
                                    if (var3_3 == null) break block11;
                                    var3_3 = this.bismilahTimeline.getEntityView();
                                    var4_4 = var3_3.isVisible();
                                    if (var4_4 == 0) break block12;
                                    var9_9 = this.getCurrentPosition();
                                    var10_10 = this.bismilahTimeline.getRect();
                                    var8_8 = var10_10.left;
                                    cfr_temp_0 = (var9_9 = (float)Math.round(var9_9 + var8_8)) - 0.0f;
                                    var4_4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    if (var4_4 > 0) ** GOTO lbl-1000
                                    var9_9 = this.getCurrentPosition();
                                    var10_10 = this.bismilahTimeline.getRect();
                                    var8_8 = var10_10.right;
                                    cfr_temp_1 = (var9_9 = (float)Math.round(var9_9 + var8_8)) - 0.0f;
                                    var4_4 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                    if (var4_4 > 0) {
                                        var3_3 = this.bismilahTimeline.getQuranEntity();
                                        this.setupAnimation((BismilahEntity)var3_3);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        this.bismilahTimeline.getEntityView().setVisible(false);
                                        this.bismilahTimeline.getQuranEntity().endAnimator();
                                        var3_3 = this.iTrimLineCallback;
                                        var3_3.onUpdate();
                                    }
                                    break block11;
                                }
                                var3_3 = this.bismilahTimeline.getRect();
                                var9_9 = var3_3.left;
                                var8_8 = this.getCurrentPosition();
                                cfr_temp_2 = (var9_9 = (float)Math.round(var9_9 + var8_8)) - 0.0f;
                                var4_4 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                if (var4_4 <= 0) {
                                    var3_3 = this.bismilahTimeline.getRect();
                                    var9_9 = var3_3.right;
                                    var8_8 = this.getCurrentPosition();
                                    cfr_temp_3 = (var9_9 = (float)Math.round(var9_9 + var8_8)) - 0.0f;
                                    var4_4 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                    if (var4_4 > 0) {
                                        var3_3 = this.bismilahTimeline.getQuranEntity();
                                        this.setupAnimation((BismilahEntity)var3_3);
                                        this.bismilahTimeline.getEntityView().setVisible(var5_5);
                                        var3_3 = this.iTrimLineCallback;
                                        var3_3.onUpdate();
                                    }
                                }
                            }
                            var3_3 = this.bismilahTimeline;
                            var8_8 = this.y;
                            var3_3.setY(var8_8);
                            var3_3 = this.bismilahTimeline.getRect();
                            var4_4 = RectF.intersects((RectF)var2_2, (RectF)var3_3);
                            if (var4_4 != 0) {
                                var3_3 = this.bismilahTimeline;
                                var3_3.update(var1_1);
                            }
                            var3_3 = this.bismilahTimeline.getRect();
                            var9_9 = var3_3.bottom;
                            break block13;
                        }
                        var4_4 = 0;
                        var3_3 = null;
                        var9_9 = 0.0f;
                    }
                    var10_10 = this.mIsi3adaTimeline;
                    var11_11 = this.isExist(var10_10);
                    if (!var11_11) break block14;
                    var3_3 = this.mIsi3adaTimeline;
                    var8_8 = this.scaleFactor;
                    var3_3.updateRect(var8_8);
                    var3_3 = this.mIsi3adaTimeline.getEntityView();
                    if (var3_3 == null) break block15;
                    var3_3 = this.mIsi3adaTimeline.getEntityView();
                    var4_4 = var3_3.isVisible();
                    if (var4_4 == 0) break block16;
                    var9_9 = this.getCurrentPosition();
                    var12_12 = this.mIsi3adaTimeline.getRect();
                    var6_6 = var12_12.left;
                    cfr_temp_4 = (var9_9 = (float)Math.round(var9_9 + var6_6)) - 0.0f;
                    var4_4 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                    if (var4_4 > 0) ** GOTO lbl-1000
                    var9_9 = this.getCurrentPosition();
                    var12_12 = this.mIsi3adaTimeline.getRect();
                    var6_6 = var12_12.right;
                    cfr_temp_5 = (var9_9 = (float)Math.round(var9_9 + var6_6)) - 0.0f;
                    var4_4 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                    if (var4_4 > 0) {
                        var3_3 = this.mIsi3adaTimeline.getQuranEntity();
                        this.setupAnimation((BismilahEntity)var3_3);
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.mIsi3adaTimeline.getEntityView().setVisible(false);
                        this.mIsi3adaTimeline.getQuranEntity().endAnimator();
                        var3_3 = this.iTrimLineCallback;
                        var3_3.onUpdate();
                    }
                    break block15;
                }
                var3_3 = this.mIsi3adaTimeline.getRect();
                var9_9 = var3_3.left;
                var7_7 = this.getCurrentPosition();
                cfr_temp_6 = (var9_9 = (float)Math.round(var9_9 + var7_7)) - 0.0f;
                var4_4 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1);
                if (var4_4 <= 0) {
                    var3_3 = this.mIsi3adaTimeline.getRect();
                    var9_9 = var3_3.right;
                    var7_7 = this.getCurrentPosition();
                    cfr_temp_7 = (var9_9 = (float)Math.round(var9_9 + var7_7)) - 0.0f;
                    var4_4 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                    if (var4_4 > 0) {
                        var3_3 = this.mIsi3adaTimeline.getQuranEntity();
                        this.setupAnimation((BismilahEntity)var3_3);
                        this.mIsi3adaTimeline.getEntityView().setVisible(var5_5);
                        var3_3 = this.iTrimLineCallback;
                        var3_3.onUpdate();
                    }
                }
            }
            var3_3 = this.mIsi3adaTimeline;
            var6_6 = this.y;
            var3_3.setY(var6_6);
            var3_3 = this.mIsi3adaTimeline.getRect();
            var13_13 = RectF.intersects((RectF)var2_2, (RectF)var3_3);
            if (var13_13) {
                var2_2 = this.mIsi3adaTimeline;
                var2_2.update(var1_1);
            }
            var1_1 = this.mIsi3adaTimeline.getRect();
            var9_9 = var1_1.bottom;
        }
        return var9_9;
    }

    private void drawIconDrawable(Canvas canvas) {
        Paint paint = new Paint(1);
        paint.setColor(-14540254);
        float f = (int)((float)this.getWidth() * 0.015f);
        int n = (int)((float)this.getWidth() * 0.03f);
        int n2 = (int)((float)this.getWidth() * 0.104f);
        int n3 = (int)this.start_y_draw;
        float f2 = n;
        float f3 = n3;
        float f4 = n + n2;
        float f5 = n3 + n2;
        RectF rectF = new RectF(f2, f3, f4, f5);
        canvas.drawRoundRect(rectF, f, f, paint);
        Context context = this.getContext();
        n3 = R$drawable.add_audio;
        context = ContextCompat.getDrawable((Context)context, (int)n3);
        n3 = -1052689;
        context.setTint(n3);
        int n4 = (int)rectF.left;
        int n5 = (int)rectF.top;
        int n6 = (int)rectF.right;
        int n7 = (int)rectF.bottom;
        context.setBounds(n4, n5, n6, n7);
        context.draw(canvas);
        n = (int)(rectF.bottom + f2);
        f3 = rectF.left;
        float f6 = n;
        float f7 = rectF.right;
        f4 = n + n2;
        RectF rectF2 = new RectF(f3, f6, f7, f4);
        canvas.drawRoundRect(rectF2, f, f, paint);
        paint = this.getContext();
        int n8 = R$drawable.add_quran;
        paint = ContextCompat.getDrawable((Context)paint, (int)n8);
        paint.setTint(n3);
        n8 = (int)rectF2.left;
        n = (int)rectF2.top;
        n2 = (int)rectF2.right;
        n3 = (int)rectF2.bottom;
        paint.setBounds(n8, n, n2, n3);
        paint.draw(canvas);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItemBtn(Canvas var1_1) {
        block183: {
            block184: {
                block182: {
                    block185: {
                        block181: {
                            var2_2 = this.getAudio();
                            var3_3 = -13421771;
                            var4_4 = -2.381977E38f;
                            var5_5 = 1058642330;
                            var6_6 = 0.6f;
                            var7_7 = 1041865114;
                            var8_8 = 0.15f;
                            var9_9 = 0x40000000;
                            var10_10 = 2.0f;
                            if (var2_2 == null) ** GOTO lbl117
                            var11_11 /* !! */  = var2_2.getRect();
                            var12_12 = var11_11 /* !! */ .top;
                            var13_13 = var1_1 /* !! */ .getWidth();
                            var14_14 = var13_13;
                            var15_15 = var14_14 * var8_8;
                            var2_2 = var2_2.getRect();
                            var16_16 = var2_2.bottom;
                            var2_2 = this.rectItemAudio;
                            if (var2_2 != null) ** GOTO lbl60
                            var17_17 = 0;
                            var18_18 = 0.0f;
                            var2_2 = new RectF(0.0f, var12_12, var15_15, var16_16);
                            this.rectItemAudio = var2_2;
                            var19_19 = var2_2.width() * var8_8;
                            var11_11 /* !! */  = this.rectItemAudio;
                            var14_14 = var11_11 /* !! */ .height() * var6_6;
                            var19_19 = var15_15 - var19_19;
                            var20_20 = var19_19 - var14_14;
                            var21_21 = this.rectItemAudio;
                            var22_22 = var21_21.centerY();
                            var22_22 -= (var14_14 /= var10_10);
                            var23_23 = this.rectItemAudio;
                            var24_24 = var23_23.centerY() + var14_14;
                            var11_11 /* !! */  = new RectF(var20_20, var22_22, var19_19, var24_24);
                            this.rectSquareAudio = var11_11 /* !! */ ;
                            var24_24 = 100.0f;
                            var25_25 /* !! */  = var1_1 /* !! */ ;
                            var22_22 = var24_24;
                            var2_2 = CanvasUtils.drawCustomRoundedRect(var1_1 /* !! */ , 0.0f, var12_12, var15_15, var16_16, var24_24, var24_24);
                            this.pathItemAudio = var2_2;
lbl60:
                            // 2 sources

                            var2_2 = this.paintItem;
                            var13_13 = this.clr_btn_audio;
                            var2_2.setColor(var13_13);
                            var2_2 = this.pathItemAudio;
                            var11_11 /* !! */  = this.paintItem;
                            var1_1 /* !! */ .drawPath((Path)var2_2, (Paint)var11_11 /* !! */ );
                            var2_2 = this.paintItem;
                            var13_13 = -3042963;
                            var14_14 = 0.0f / 0.0f;
                            var2_2.setColor(var13_13);
                            var2_2 = this.rectSquareAudio;
                            var11_11 /* !! */  = this.paintItem;
                            var1_1 /* !! */ .drawRoundRect((RectF)var2_2, var10_10, var10_10, (Paint)var11_11 /* !! */ );
                            var2_2 = this.rectItemAudio;
                            var19_19 = var2_2.right;
                            var11_11 /* !! */  = this.rectSquareAudio;
                            var14_14 = var11_11 /* !! */ .right;
                            var26_26 = (int)(var19_19 -= var14_14);
                            var13_13 = this.clr_btn_audio;
                            if (var13_13 == var3_3) ** GOTO lbl117
                            var11_11 /* !! */  = this.getContext();
                            var27_27 = R$drawable.checked_timeline;
                            var11_11 /* !! */  = ContextCompat.getDrawable((Context)var11_11 /* !! */ , (int)var27_27);
                            var25_25 /* !! */  = this.rectSquareAudio;
                            var20_20 = var25_25 /* !! */ .top;
                            var27_27 = (int)var20_20;
                            var18_18 = var26_26;
                            var28_28 = this.rectSquareAudio;
                            var12_12 = var28_28.width();
                            var17_17 = (int)(var18_18 += var12_12);
                            var28_28 = this.rectSquareAudio;
                            var12_12 = var28_28.bottom;
                            var29_29 = (int)var12_12;
                            var11_11 /* !! */ .setBounds(var26_26, var27_27, var17_17, var29_29);
                            var11_11 /* !! */ .draw(var1_1 /* !! */ );
lbl117:
                            // 3 sources

                            var2_2 = this.bismilahTimeline;
                            var26_26 = this.isExist((EntityBismilahTimeline)var2_2);
                            var11_11 /* !! */  = this.mIsi3adaTimeline;
                            var13_13 = (int)this.isExist((EntityBismilahTimeline)var11_11 /* !! */ );
                            var27_27 = -5253382;
                            var20_20 = 0.0f / 0.0f;
                            if (var26_26 != 0 || var13_13 != 0) break block185;
                            var2_2 = this.getQuran();
                            if (var2_2 == null) ** GOTO lbl354
                            var11_11 /* !! */  = var2_2.getRect();
                            var15_15 = var11_11 /* !! */ .top;
                            var13_13 = var1_1 /* !! */ .getWidth();
                            var14_14 = var13_13;
                            var16_16 = var14_14 * var8_8;
                            var2_2 = var2_2.getRect();
                            var22_22 = var2_2.bottom;
                            var2_2 = this.rectFItemQuran;
                            if (var2_2 == null) break block181;
                            var19_19 = var2_2.top;
                            var26_26 = var19_19 == var15_15 ? 0 : (var19_19 > var15_15 ? 1 : -1);
                            if (var26_26 == 0) ** GOTO lbl183
                        }
                        var29_29 = 0;
                        var12_12 = 0.0f;
                        var28_28 = null;
                        var2_2 = new RectF(0.0f, var15_15, var16_16, var22_22);
                        this.rectFItemQuran = var2_2;
                        var19_19 = var2_2.width() * var8_8;
                        var11_11 /* !! */  = this.rectFItemQuran;
                        var14_14 = var11_11 /* !! */ .height() * var6_6;
                        var19_19 = var16_16 - var19_19;
                        var18_18 = var19_19 - var14_14;
                        var23_23 = this.rectFItemQuran;
                        var24_24 = var23_23.centerY();
                        var24_24 -= (var14_14 /= var10_10);
                        var30_30 = this.rectFItemQuran;
                        var31_32 = var30_30.centerY() + var14_14;
                        var11_11 /* !! */  = new RectF(var18_18, var24_24, var19_19, var31_32);
                        this.rectSquareQuran = var11_11 /* !! */ ;
                        var32_34 = 1120403456;
                        var24_24 = var31_32 = 100.0f;
                        var2_2 = CanvasUtils.drawCustomRoundedRect(var1_1 /* !! */ , 0.0f, var15_15, var16_16, var22_22, var31_32, var31_32);
                        this.pathItemQuran = var2_2;
lbl183:
                        // 2 sources

                        var2_2 = this.paintItem;
                        var13_13 = this.clr_btn_quran;
                        var2_2.setColor(var13_13);
                        var2_2 = this.pathItemQuran;
                        var11_11 /* !! */  = this.paintItem;
                        var1_1 /* !! */ .drawPath((Path)var2_2, (Paint)var11_11 /* !! */ );
                        var2_2 = this.paintItem;
                        var2_2.setColor(var27_27);
                        var2_2 = this.rectSquareQuran;
                        var11_11 /* !! */  = this.paintItem;
                        var1_1 /* !! */ .drawRoundRect((RectF)var2_2, var10_10, var10_10, (Paint)var11_11 /* !! */ );
                        var26_26 = this.clr_btn_quran;
                        if (var26_26 == var3_3) ** GOTO lbl354
                        var2_2 = this.getContext();
                        var13_13 = R$drawable.checked_timeline;
                        var2_2 = ContextCompat.getDrawable((Context)var2_2, (int)var13_13);
                        var11_11 /* !! */  = this.rectFItemQuran;
                        var14_14 = var11_11 /* !! */ .right;
                        var25_25 /* !! */  = this.rectSquareQuran;
                        var20_20 = var25_25 /* !! */ .right;
                        var13_13 = (int)(var14_14 -= var20_20);
                        var25_25 /* !! */  = this.rectSquareQuran;
                        var20_20 = var25_25 /* !! */ .top;
                        var27_27 = (int)var20_20;
                        var18_18 = var13_13;
                        var28_28 = this.rectSquareQuran;
                        var12_12 = var28_28.width();
                        var17_17 = (int)(var18_18 += var12_12);
                        var28_28 = this.rectSquareQuran;
                        var12_12 = var28_28.bottom;
                        var29_29 = (int)var12_12;
                        var2_2.setBounds(var13_13, var27_27, var17_17, var29_29);
                        var2_2.draw(var1_1 /* !! */ );
                        ** GOTO lbl354
                    }
                    if (var26_26 != 0) {
                        var2_2 = this.bismilahTimeline;
                    } else {
                        var2_2 = this.mIsi3adaTimeline;
                    }
                    var11_11 /* !! */  = var2_2.getRect();
                    var15_15 = var11_11 /* !! */ .top;
                    var13_13 = var1_1 /* !! */ .getWidth();
                    var14_14 = var13_13;
                    var16_16 = var14_14 * var8_8;
                    var2_2 = var2_2.getRect();
                    var22_22 = var2_2.bottom;
                    var2_2 = this.rectFItemQuran;
                    if (var2_2 == null) break block182;
                    var19_19 = var2_2.top;
                    var26_26 = var19_19 == var15_15 ? 0 : (var19_19 > var15_15 ? 1 : -1);
                    if (var26_26 == 0) ** GOTO lbl299
                }
                var29_29 = 0;
                var12_12 = 0.0f;
                var28_28 = null;
                var2_2 = new RectF(0.0f, var15_15, var16_16, var22_22);
                this.rectFItemQuran = var2_2;
                var19_19 = var2_2.width() * var8_8;
                var11_11 /* !! */  = this.rectFItemQuran;
                var14_14 = var11_11 /* !! */ .height() * var6_6;
                var19_19 = var16_16 - var19_19;
                var18_18 = var19_19 - var14_14;
                var23_23 = this.rectFItemQuran;
                var24_24 = var23_23.centerY();
                var24_24 -= (var14_14 /= var10_10);
                var30_31 = this.rectFItemQuran;
                var31_33 = var30_31.centerY() + var14_14;
                var11_11 /* !! */  = new RectF(var18_18, var24_24, var19_19, var31_33);
                this.rectSquareQuran = var11_11 /* !! */ ;
                var32_35 = 1120403456;
                var24_24 = var31_33 = 100.0f;
                var2_2 = CanvasUtils.drawCustomRoundedRect(var1_1 /* !! */ , 0.0f, var15_15, var16_16, var22_22, var31_33, var31_33);
                this.pathItemQuran = var2_2;
lbl299:
                // 2 sources

                var2_2 = this.paintItem;
                var13_13 = this.clr_btn_quran;
                var2_2.setColor(var13_13);
                var2_2 = this.pathItemQuran;
                var11_11 /* !! */  = this.paintItem;
                var1_1 /* !! */ .drawPath((Path)var2_2, (Paint)var11_11 /* !! */ );
                var2_2 = this.paintItem;
                var2_2.setColor(var27_27);
                var2_2 = this.rectSquareQuran;
                var11_11 /* !! */  = this.paintItem;
                var1_1 /* !! */ .drawRoundRect((RectF)var2_2, var10_10, var10_10, (Paint)var11_11 /* !! */ );
                var26_26 = this.clr_btn_quran;
                if (var26_26 == var3_3) ** GOTO lbl354
                var2_2 = this.getContext();
                var13_13 = R$drawable.checked_timeline;
                var2_2 = ContextCompat.getDrawable((Context)var2_2, (int)var13_13);
                var11_11 /* !! */  = this.rectFItemQuran;
                var14_14 = var11_11 /* !! */ .right;
                var25_25 /* !! */  = this.rectSquareQuran;
                var20_20 = var25_25 /* !! */ .right;
                var13_13 = (int)(var14_14 -= var20_20);
                var25_25 /* !! */  = this.rectSquareQuran;
                var20_20 = var25_25 /* !! */ .top;
                var27_27 = (int)var20_20;
                var18_18 = var13_13;
                var28_28 = this.rectSquareQuran;
                var12_12 = var28_28.width();
                var17_17 = (int)(var18_18 += var12_12);
                var28_28 = this.rectSquareQuran;
                var12_12 = var28_28.bottom;
                var29_29 = (int)var12_12;
                var2_2.setBounds(var13_13, var27_27, var17_17, var29_29);
                var2_2.draw(var1_1 /* !! */ );
lbl354:
                // 5 sources

                if ((var2_2 = this.getTrslQuran()) == null) break block183;
                var11_11 /* !! */  = var2_2.getRect();
                var12_12 = var11_11 /* !! */ .top;
                var13_13 = var1_1 /* !! */ .getWidth();
                var14_14 = var13_13;
                var15_15 = var14_14 * var8_8;
                var2_2 = var2_2.getRect();
                var16_16 = var2_2.bottom;
                var2_2 = this.rectFItemTrslQuran;
                if (var2_2 == null) break block184;
                var19_19 = var2_2.top;
                var26_26 = var19_19 == var12_12 ? 0 : (var19_19 > var12_12 ? 1 : -1);
                if (var26_26 == 0) ** GOTO lbl408
            }
            var17_17 = 0;
            var18_18 = 0.0f;
            var2_2 = new RectF(0.0f, var12_12, var15_15, var16_16);
            this.rectFItemTrslQuran = var2_2;
            var19_19 = var2_2.width() * var8_8;
            var33_36 = this.rectFItemTrslQuran;
            var8_8 = var33_36.height() * var6_6;
            var19_19 = var15_15 - var19_19;
            var6_6 = var19_19 - var8_8;
            var11_11 /* !! */  = this.rectFItemTrslQuran;
            var14_14 = var11_11 /* !! */ .centerY();
            var14_14 -= (var8_8 /= var10_10);
            var25_25 /* !! */  = this.rectFItemTrslQuran;
            var20_20 = var25_25 /* !! */ .centerY() + var8_8;
            var33_36 = new RectF(var6_6, var14_14, var19_19, var20_20);
            this.rectSquareTrslQuran = var33_36;
            var24_24 = 100.0f;
            var25_25 /* !! */  = var1_1 /* !! */ ;
            var22_22 = var24_24;
            var2_2 = CanvasUtils.drawCustomRoundedRect(var1_1 /* !! */ , 0.0f, var12_12, var15_15, var16_16, var24_24, var24_24);
            this.pathItemTrslQuran = var2_2;
lbl408:
            // 2 sources

            var2_2 = this.paintItem;
            var5_5 = this.clr_btn_trsl;
            var2_2.setColor(var5_5);
            var2_2 = this.pathItemTrslQuran;
            var34_37 = this.paintItem;
            var1_1 /* !! */ .drawPath((Path)var2_2, var34_37);
            var2_2 = this.paintItem;
            var5_5 = -67133;
            var6_6 = 0.0f / 0.0f;
            var2_2.setColor(var5_5);
            var2_2 = this.rectSquareTrslQuran;
            var34_37 = this.paintItem;
            var1_1 /* !! */ .drawRoundRect((RectF)var2_2, var10_10, var10_10, var34_37);
            var26_26 = this.clr_btn_trsl;
            if (var26_26 == var3_3) break block183;
            var2_2 = this.getContext();
            var3_3 = R$drawable.checked_timeline;
            var2_2 = ContextCompat.getDrawable((Context)var2_2, (int)var3_3);
            var35_38 = this.rectFItemTrslQuran;
            var4_4 = var35_38.right;
            var34_37 = this.rectSquareTrslQuran;
            var6_6 = var34_37.right;
            var3_3 = (int)(var4_4 -= var6_6);
            var34_37 = this.rectSquareTrslQuran;
            var6_6 = var34_37.top;
            var5_5 = (int)var6_6;
            var8_8 = var3_3;
            var36_39 = this.rectSquareTrslQuran;
            var10_10 = var36_39.width();
            var7_7 = (int)(var8_8 += var10_10);
            var36_39 = this.rectSquareTrslQuran;
            var10_10 = var36_39.bottom;
            var9_9 = (int)var10_10;
            var2_2.setBounds(var3_3, var5_5, var7_7, var9_9);
            try {
                var2_2.draw(var1_1 /* !! */ );
            }
            catch (Exception v0) {
                var1_1 /* !! */  = "mException";
                var2_2 = "drawItemBtn";
                Log.e((String)var1_1 /* !! */ , (String)var2_2);
            }
        }
    }

    private void drawMarker(Canvas canvas, float f, float f2) {
        float f3 = this.paintMaker.getStrokeWidth();
        float f4 = f + f3;
        f = this.posY;
        f3 = this.m_pos_y_marker;
        float f5 = f + f3;
        float f6 = f5 + f2;
        Paint paint = this.paintMaker;
        canvas.drawLine(f4, f5, f4, f6, paint);
    }

    private void drawTimeBar(Canvas canvas, int n, int n2, float f) {
        float f2;
        float f3;
        float f4 = this.scaleFactor;
        float f5 = 4.0f;
        float f6 = f4 == f5 ? 0 : (f4 > f5 ? 1 : -1);
        int n3 = 1048576000;
        float f7 = 0.25f;
        float f8 = 2.0f;
        if (f6 >= 0) {
            f5 = f7;
        } else {
            f6 = f4 == f8 ? 0 : (f4 > f8 ? 1 : -1);
            if (f6 >= 0) {
                f5 = 0.5f;
            } else {
                f3 = 0.8f;
                float f9 = f4 - f3;
                f6 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                if (f6 >= 0) {
                    f5 = f8;
                } else {
                    f3 = 0.4f;
                    float f10 = f4 - f3;
                    f6 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    if (f6 < 0) {
                        float f11 = f4 == f7 ? 0 : (f4 > f7 ? 1 : -1);
                        f5 = f11 > 0 ? 6.0f : 8.0f;
                    }
                }
            }
        }
        float f12 = n;
        f4 = f12 % f5;
        f12 -= f4;
        f4 = f * f5;
        f6 = 1045220557;
        f3 = 0.2f;
        f4 *= f3;
        while ((f6 = (f2 = f12 - (f3 = (float)n2)) == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1)) <= 0) {
            f3 = f12 * f;
            f7 = f3 / f;
            float f13 = this.markerHeight;
            this.drawMarker(canvas, f3, f13);
            int n4 = this.isArabic_lang;
            String string2 = n4 != 0 ? this.formatTimeLabelArabic(f7) : this.formatTimeLabel(f7);
            f13 = this.w_time_item;
            f13 = f3 - f13;
            float f14 = this.posY;
            Paint paint = this.paint_time;
            canvas.drawText(string2, f13, f14, paint);
            n3 = 1;
            f7 = Float.MIN_VALUE;
            while (true) {
                n4 = 4;
                f13 = 5.6E-45f;
                if (n3 > n4) break;
                f13 = (float)n3 * f4 + f3;
                f14 = this.markerHeight / f8;
                this.drawMarker(canvas, f13, f14);
                ++n3;
            }
            f12 += f5;
        }
    }

    private String formatTimeLabel(float f) {
        int n = 1114636288;
        float f2 = 60.0f;
        float f3 = f - f2;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 < 0) {
            double d;
            f2 = Math.abs(f - 14.0f);
            double d2 = f2;
            double d3 = d2 - (d = 0.01);
            n = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
            if (n < 0) {
                Locale locale = Locale.ENGLISH;
                Object[] objectArray = new Object[]{};
                return String.format(locale, "14s", objectArray);
            }
            f2 = Math.round(f);
            d2 = f2 = Math.abs(f - f2);
            double d4 = d2 - d;
            n = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
            if (n < 0) {
                Locale locale = Locale.ENGLISH;
                Object[] objectArray = Integer.valueOf((int)f);
                objectArray = new Object[]{objectArray};
                return String.format(locale, "%ds", objectArray);
            }
            Locale locale = Locale.ENGLISH;
            Object[] objectArray = Float.valueOf(f);
            objectArray = new Object[]{objectArray};
            return String.format(locale, "%.2fs", objectArray);
        }
        float f5 = f / f2;
        f4 = (int)f5;
        int n2 = Math.round(f %= f2);
        if (n2 == 0) {
            Locale locale = Locale.ENGLISH;
            Object[] objectArray = Integer.valueOf((int)f4);
            objectArray = new Object[]{objectArray};
            return String.format(locale, "%dm", objectArray);
        }
        Locale locale = Locale.ENGLISH;
        Integer n3 = (int)f4;
        Object[] objectArray = Integer.valueOf(n2);
        objectArray = new Object[]{n3, objectArray};
        return String.format(locale, "%dm %ds", objectArray);
    }

    private String formatTimeLabelArabic(float f) {
        int n = 1114636288;
        float f2 = 60.0f;
        float f3 = f - f2;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 < 0) {
            double d;
            f2 = Math.abs(f - 14.0f);
            double d2 = f2;
            double d3 = d2 - (d = 0.01);
            n = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
            if (n < 0) {
                Locale locale = Locale.ENGLISH;
                Object[] objectArray = new Object[]{};
                return String.format(locale, "14\u062b", objectArray);
            }
            f2 = Math.round(f);
            d2 = f2 = Math.abs(f - f2);
            double d4 = d2 - d;
            n = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
            if (n < 0) {
                Locale locale = Locale.ENGLISH;
                Object[] objectArray = Integer.valueOf((int)f);
                objectArray = new Object[]{objectArray};
                return String.format(locale, "%d\u062b", objectArray);
            }
            Locale locale = Locale.ENGLISH;
            Object[] objectArray = Float.valueOf(f);
            objectArray = new Object[]{objectArray};
            return String.format(locale, "%.2f\u062b", objectArray);
        }
        float f5 = f / f2;
        f4 = (int)f5;
        int n2 = Math.round(f %= f2);
        if (n2 == 0) {
            Locale locale = Locale.ENGLISH;
            Object[] objectArray = Integer.valueOf((int)f4);
            objectArray = new Object[]{objectArray};
            return String.format(locale, "%d\u062f", objectArray);
        }
        Locale locale = Locale.ENGLISH;
        Integer n3 = (int)f4;
        Object[] objectArray = Integer.valueOf(n2);
        objectArray = new Object[]{n3, objectArray};
        return String.format(locale, "%d\u062f %d\u062b", objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private boolean handleItemInteraction(float f, float f2) {
        void var11_21;
        Object object;
        boolean bl;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        RectF rectF = this.rectFItemQuran;
        boolean bl6 = true;
        float f3 = Float.MIN_VALUE;
        if (rectF != null && (bl5 = rectF.contains(f, f2))) {
            bl5 = bl6;
        } else {
            bl5 = false;
            rectF = null;
        }
        RectF rectF2 = this.rectItemAudio;
        if (rectF2 != null && (bl4 = rectF2.contains(f, f2))) {
            bl4 = bl6;
        } else {
            bl4 = false;
            rectF2 = null;
        }
        RectF rectF3 = this.rectFItemTrslQuran;
        if (rectF3 != null && (bl3 = rectF3.contains(f, f2))) {
            bl3 = bl6;
            f = f3;
        } else {
            bl3 = false;
            f = 0.0f;
        }
        if (!(bl5 || bl4 || bl3)) {
            boolean bl2 = this.deselectAllQuranItems();
            boolean bl7 = this.deselectAllAudioItems();
            bl = this.deselectAllTrslQuranItems();
            if (!(bl2 || bl7 || bl)) {
                boolean bl8 = false;
                object = null;
                f2 = 0.0f;
            } else {
                boolean bl9 = bl6;
                f2 = f3;
            }
            boolean bl10 = false;
            rectF3 = null;
        } else {
            void var11_19;
            void var11_18;
            object = this.selectedEntity;
            if (object != null) {
                ((Entity)object).setSelect(false);
            }
            if (bl5) {
                int n = this.processQuranItemsSelection();
            } else {
                boolean bl11 = false;
                object = null;
                f2 = 0.0f;
            }
            if (bl4) {
                void var11_17;
                int n = this.processAudioItemsSelection();
                var11_18 = var11_17 + n;
            }
            if (bl3) {
                int n = this.processTrslQuranItemsSelection();
                var11_19 = var11_18 + n;
            }
            void var12_26 = var11_19;
            boolean bl12 = bl6;
            f2 = f3;
        }
        if (var11_21 != false) {
            object = this.iTrimLineCallback;
            if (object != null && (bl5 || bl4 || bl3)) {
                void var12_27;
                bl = false;
                this.selectedEntity = null;
                object.onSelectMultiple((int)var12_27);
            }
            this.invalidate();
        }
        if (!(bl5 || bl4 || bl3)) {
            bl6 = false;
            f3 = 0.0f;
        }
        return bl6;
    }

    private void init() {
        long l;
        ScaleGestureDetector scaleGestureDetector;
        this.maxTime = -1;
        this.TOLERANCE_X = 0.95f;
        this.entityListAudio = scaleGestureDetector = new ArrayList();
        this.lastTime = l = 0L;
        this.lastDifference = l;
        this.setWillNotDraw(false);
        this.initAutoScroll();
        this.setOnTouchListener(this);
        Context context = this.getContext();
        TrackEntityView$ScaleListener trackEntityView$ScaleListener = new TrackEntityView$ScaleListener(this, null);
        this.scaleGestureDetector = scaleGestureDetector = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)trackEntityView$ScaleListener);
        context = this.getContext();
        trackEntityView$ScaleListener = this.gestureListener;
        scaleGestureDetector = new GestureDetectorCompat(context, (GestureDetector.OnGestureListener)trackEntityView$ScaleListener);
        this.gestureDetector = scaleGestureDetector;
        context = this.getContext();
        scaleGestureDetector = new Scroller(context);
        this.scroller = scaleGestureDetector;
    }

    private void initAutoScroll() {
        Object object;
        this.autoScrollHandler = object = new Handler();
        object = new TrackEntityView$1(this);
        this.autoScrollRunnable = object;
        object = new TrackEntityView$2(this);
        this.autoMoveRunnable = object;
    }

    private void mDraw(Canvas canvas) {
        Canvas canvas2;
        int n = -15658735;
        canvas.drawColor(n);
        canvas.save();
        float f = this.getSecond_in_screen();
        float f2 = this.centerX;
        float f3 = this.scrolled_with_zoom;
        f2 += f3;
        f3 = this.getPaddingTop();
        canvas.translate(f2, f3);
        f2 = Math.abs(this.scrolled_with_zoom);
        f3 = this.centerX;
        f2 = (f2 - f3) / f;
        int n2 = (int)f2;
        f3 = Math.abs(this.scrolled_with_zoom);
        float f4 = this.centerX;
        f3 = (f3 + f4) / f;
        int n3 = (int)f3 + 1;
        if (n2 < 0) {
            n2 = 0;
            f2 = 0.0f;
            canvas2 = null;
        }
        this.drawTimeBar(canvas, n2, n3, f);
        f = -this.second_in_screen;
        f4 = this.canvas_top_Y;
        int n4 = this.getWidth();
        float f5 = n4;
        float f6 = this.scrolled_with_zoom;
        f5 -= f6;
        int n5 = this.getHeight();
        f6 = n5;
        float f7 = this.mScrollY;
        canvas.clipRect(f, f4, f5, f6 -= f7);
        f = 0.0f;
        Paint paint = null;
        f4 = this.mScrollY;
        canvas.translate(0.0f, f4);
        this.drawAllEntities(canvas, n2, n3);
        n = this.isCheckLine ? 1 : 0;
        if (n != 0) {
            f5 = this.startXLine;
            n = this.getHeight();
            f = n;
            f2 = this.mScrollY;
            f6 = f - f2;
            Paint paint2 = this.paintLineCheck;
            f4 = 0.0f;
            canvas2 = canvas;
            f3 = f5;
            canvas.drawLine(f5, 0.0f, f5, f6, paint2);
        }
        canvas.restore();
        n = this.isCheckLineCursur ? 1 : 0;
        if (n != 0) {
            paint = this.paintCursur;
            n2 = this.paintLineCheck.getColor();
            paint.setColor(n2);
            f = this.centerX;
            f2 = this.paintMaker.getStrokeWidth();
            f4 = f + f2;
            f = this.posY;
            f2 = this.m_pos_y_marker;
            f += f2;
            canvas2 = this.paintMaker;
            f2 = canvas2.getStrokeWidth();
            f5 = f + f2;
            f6 = this.centerX;
            n = this.getHeight();
            f7 = n;
            Paint paint3 = this.paintCursur;
            canvas.drawLine(f4, f5, f6, f7, paint3);
        } else {
            paint = this.paintCursur;
            n2 = -1;
            paint.setColor(n2);
            f = this.centerX;
            f2 = this.paintMaker.getStrokeWidth();
            f4 = f + f2;
            f = this.posY;
            f2 = this.m_pos_y_marker;
            f += f2;
            canvas2 = this.paintMaker;
            f2 = canvas2.getStrokeWidth();
            f5 = f + f2;
            f6 = this.centerX;
            n = this.getHeight();
            f7 = n;
            Paint paint4 = this.paintCursur;
            canvas.drawLine(f4, f5, f6, f7, paint4);
        }
    }

    private int processAudioItemsSelection() {
        int n;
        int n2;
        boolean bl;
        Object object = this.entityListAudio;
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = object.iterator();
        while (bl = object.hasNext()) {
            EntityAudio entityAudio = (EntityAudio)object.next();
            boolean bl2 = entityAudio.visible();
            if (!bl2) continue;
            bl2 = entityAudio.isSelect();
            boolean bl3 = bl2 ^ true;
            entityAudio.setSelect(bl3);
            entityAudio.setSelectMultiple(bl2 ^= true);
            bl = entityAudio.isSelect();
            if (!bl) continue;
            ++n3;
        }
        this.clr_btn_audio = n3 > 0 ? (n2 = -794718) : (n = -13421771);
        return n3;
    }

    private int processQuranItemsSelection() {
        int n;
        int n2;
        boolean bl;
        Entity entity;
        boolean bl2;
        Object object = this.entityListQuran;
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            entity = (EntityQuranTimeline)object.next();
            boolean bl3 = entity.visible();
            if (!bl3) continue;
            bl3 = entity.isSelect();
            boolean bl4 = bl3 ^ true;
            ((EntityQuranTimeline)entity).setSelect(bl4);
            entity.setSelectMultiple(bl3 ^= true);
            bl2 = entity.isSelect();
            if (!bl2) continue;
            ++n3;
        }
        object = this.bismilahTimeline;
        boolean bl5 = this.isExist((EntityBismilahTimeline)object);
        if (bl5) {
            boolean bl6 = this.bismilahTimeline.isSelect();
            entity = this.bismilahTimeline;
            boolean bl7 = bl6 ^ true;
            ((EntityBismilahTimeline)entity).setSelect(bl7);
            entity = this.bismilahTimeline;
            boolean bl8 = bl6 ^ true;
            entity.setSelectMultiple(bl8);
            object = this.bismilahTimeline;
            boolean bl9 = ((Entity)object).isSelect();
            if (bl9) {
                ++n3;
            }
        }
        if (bl = this.isExist((EntityBismilahTimeline)(object = this.mIsi3adaTimeline))) {
            boolean bl10 = this.mIsi3adaTimeline.isSelect();
            entity = this.mIsi3adaTimeline;
            boolean bl11 = bl10 ^ true;
            ((EntityBismilahTimeline)entity).setSelect(bl11);
            entity = this.mIsi3adaTimeline;
            boolean bl12 = bl10 ^ true;
            entity.setSelectMultiple(bl12);
            object = this.mIsi3adaTimeline;
            boolean bl13 = ((Entity)object).isSelect();
            if (bl13) {
                ++n3;
            }
        }
        this.clr_btn_quran = n3 > 0 ? (n2 = -794718) : (n = -13421771);
        return n3;
    }

    private int processTrslQuranItemsSelection() {
        int n;
        int n2;
        boolean bl;
        Object object = this.entityListTrslQuran;
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = object.iterator();
        while (bl = object.hasNext()) {
            EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)object.next();
            boolean bl2 = entityTrslTimeline.visible();
            if (!bl2) continue;
            bl2 = entityTrslTimeline.isSelect();
            boolean bl3 = bl2 ^ true;
            entityTrslTimeline.setSelect(bl3);
            entityTrslTimeline.setSelectMultiple(bl2 ^= true);
            bl = entityTrslTimeline.isSelect();
            if (!bl) continue;
            ++n3;
        }
        this.clr_btn_trsl = n3 > 0 ? (n2 = -794718) : (n = -13421771);
        return n3;
    }

    private void setupAnimation(BismilahEntity bismilahEntity) {
        Object object;
        int n = this.isPlaying();
        if (n != 0 && (object = bismilahEntity.getBismilahTimeline().getTransition()) != null && (n = bismilahEntity.isAnimRun()) == 0) {
            boolean bl;
            float f;
            int n2;
            float f2;
            float f3;
            Object object2;
            object = bismilahEntity.getBismilahTimeline().getTransition();
            float f4 = this.getCurrentPosition();
            float f5 = this.getSecond_in_screen();
            f4 /= f5;
            int n3 = 1148846080;
            f5 = 1000.0f;
            int n4 = Math.abs(Math.round(f4 * f5));
            f4 = n4;
            boolean n5 = ((Transition)object).isIn();
            int n6 = 0x3F000000;
            float f6 = 0.5f;
            if (n5) {
                object2 = bismilahEntity.getBismilahTimeline().getRect();
                f3 = object2.left;
                f2 = this.getSecond_in_screen();
                f3 = f3 / f2 * f5;
                int n7 = Math.round(f3);
                f2 = ((Transition)object).getDuration_in() * f5;
                n2 = (int)f2;
                float f7 = (float)n2 * f6 + (f = (float)n7);
                float f8 = f4 - f7;
                float f9 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (f9 < 0) {
                    object2 = ((Transition)object).getType_in();
                    bismilahEntity.runIn(n2, false, (String)object2);
                } else {
                    float f10;
                    float f11;
                    float f12;
                    f9 = (float)((Transition)object).isOut();
                    if (f9 == false && ((f12 = f4 == f ? 0 : (f4 < f ? -1 : 1)) < 0 || (f11 = (f10 = f4 - (f3 = (float)(n7 + n2))) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1)) >= 0)) {
                        bismilahEntity.endAnimator();
                    }
                }
            }
            if (bl = bismilahEntity.isAnimRun()) {
                return;
            }
            boolean bl2 = ((Transition)object).isOut();
            if (bl2) {
                object2 = bismilahEntity.getBismilahTimeline().getRect();
                f3 = object2.right;
                f2 = this.getSecond_in_screen();
                f3 = f3 / f2 * f5;
                int n8 = (int)f3;
                n3 = (int)(((Transition)object).getDuration_out() * f5);
                n2 = n8 - n3;
                f2 = n2;
                f = (float)n3 * f6 + f2;
                n6 = f4 == f2 ? 0 : (f4 > f2 ? 1 : -1);
                if (n6 >= 0 && (n6 = (int)(f4 == f ? 0 : (f4 < f ? -1 : 1))) < 0) {
                    object = ((Transition)object).getType_out();
                    bismilahEntity.runOut(n3, false, (String)object);
                } else {
                    float f13 = n8;
                    float f14 = f4 - f13;
                    n = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (n >= 0) {
                        bismilahEntity.endAnimator();
                    }
                }
            }
        }
    }

    private void setupAnimation(QuranEntity quranEntity) {
        Object object;
        int n = this.isPlaying();
        if (n != 0 && (object = quranEntity.getEntityQuran().getTransition()) != null && (n = quranEntity.isAnimRun()) == 0) {
            boolean bl;
            float f;
            int n2;
            float f2;
            float f3;
            Object object2;
            object = quranEntity.getEntityQuran().getTransition();
            float f4 = this.getCurrentPosition();
            float f5 = this.getSecond_in_screen();
            f4 /= f5;
            int n3 = 1148846080;
            f5 = 1000.0f;
            int n4 = Math.abs(Math.round(f4 * f5));
            f4 = n4;
            boolean n5 = ((Transition)object).isIn();
            int n6 = 0x3F000000;
            float f6 = 0.5f;
            if (n5) {
                object2 = quranEntity.getEntityQuran().getRect();
                f3 = object2.left;
                f2 = this.getSecond_in_screen();
                f3 = f3 / f2 * f5;
                int n7 = Math.round(f3);
                f2 = ((Transition)object).getDuration_in() * f5;
                n2 = (int)f2;
                float f7 = (float)n2 * f6 + (f = (float)n7);
                float f8 = f4 - f7;
                float f9 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (f9 < 0) {
                    object2 = ((Transition)object).getType_in();
                    quranEntity.runIn(n2, false, (String)object2);
                } else {
                    float f10;
                    float f11;
                    float f12;
                    f9 = (float)((Transition)object).isOut();
                    if (f9 == false && ((f12 = f4 == f ? 0 : (f4 < f ? -1 : 1)) < 0 || (f11 = (f10 = f4 - (f3 = (float)(n7 + n2))) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1)) >= 0)) {
                        quranEntity.endAnimator();
                    }
                }
            }
            if (bl = quranEntity.isAnimRun()) {
                return;
            }
            boolean bl2 = ((Transition)object).isOut();
            if (bl2) {
                object2 = quranEntity.getEntityQuran().getRect();
                f3 = object2.right;
                f2 = this.getSecond_in_screen();
                f3 = f3 / f2 * f5;
                int n8 = (int)f3;
                n3 = (int)(((Transition)object).getDuration_out() * f5);
                n2 = n8 - n3;
                f2 = n2;
                f = (float)n3 * f6 + f2;
                n6 = f4 == f2 ? 0 : (f4 > f2 ? 1 : -1);
                if (n6 >= 0 && (n6 = (int)(f4 == f ? 0 : (f4 < f ? -1 : 1))) < 0) {
                    object = ((Transition)object).getType_out();
                    quranEntity.runOut(n3, false, (String)object);
                } else {
                    float f13 = n8;
                    float f14 = f4 - f13;
                    n = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (n >= 0) {
                        quranEntity.endAnimator();
                    }
                }
            }
        }
    }

    private void setupFade(EntityAudio entityAudio) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void updateGestureExclusion() {
        int n;
        try {
            n = Build.VERSION.SDK_INT;
            int n2 = 29;
            if (n < n2) return;
        }
        catch (Exception exception) {
            return;
        }
        List list = this.exclusionRects;
        list.clear();
        list = this.getRootWindowInsets();
        list = list.getSystemGestureInsets();
        int n3 = ((Insets)list).left;
        int n4 = this.getHeight();
        Rect rect = new Rect(0, 0, n3, n4);
        n4 = this.getRight();
        n = ((Insets)list).right;
        n4 -= n;
        n = this.getRight();
        int n5 = this.getHeight();
        Rect rect2 = new Rect(n4, 0, n, n5);
        list = this.exclusionRects;
        list.add(rect);
        list = this.exclusionRects;
        list.add(rect2);
        list = this.exclusionRects;
        this.setSystemGestureExclusionRects(list);
    }

    private void updateIndex() {
        Object object;
        int n;
        for (int i = 0; i < (n = (object = this.entityListQuran).size()); ++i) {
            object = (EntityQuranTimeline)this.entityListQuran.get(i);
            ((Entity)object).setIndex(i);
            object = ((EntityQuranTimeline)object).getQuranEntity();
            ((QuranEntity)object).setIndex(i);
        }
    }

    private void updateMediaIndex() {
        Object object;
        int n;
        for (int i = 0; i < (n = (object = this.entityListAudio).size()); ++i) {
            object = (EntityAudio)this.entityListAudio.get(i);
            ((Entity)object).setIndex(i);
        }
    }

    private void updateTrslIndex() {
        Object object;
        int n;
        for (int i = 0; i < (n = (object = this.entityListTrslQuran).size()); ++i) {
            object = (EntityTrslTimeline)this.entityListTrslQuran.get(i);
            ((Entity)object).setIndex(i);
            object = ((EntityTrslTimeline)object).getQuranEntity();
            ((TranslationQuranEntity)object).setIndex(i);
        }
    }

    public void addAudio(EntityAudio object) {
        this.entityListAudio.add(object);
        int n = this.entityListAudio.size() + -1;
        ((Entity)object).setIndex(n);
        Object object2 = this.entityList;
        EntityAction entityAction = EntityAction.ADD;
        Pair pair = new Pair(object, (Object)entityAction);
        object2.push(pair);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addAudio(EntityAudio object, int n) {
        Object object2;
        Object object3;
        List list = this.entityListAudio;
        int n2 = list.size();
        if (n < n2) {
            int n3;
            ((Entity)object).setIndex(n);
            this.entityListAudio.add(n, object);
            list = ((EntityAudio)object).getRect();
            float f = ((RectF)list).right;
            while (++n < (n3 = (object3 = this.entityListAudio).size())) {
                object3 = (EntityAudio)this.entityListAudio.get(n);
                boolean bl = ((Entity)object3).visible();
                if (!bl) continue;
                RectF rectF = ((EntityAudio)object3).getRect();
                float f2 = rectF.width();
                ((Entity)object3).setCurrentRect();
                ((EntityAudio)object3).setX(f);
                ((EntityAudio)object3).setRight(f += f2);
                ((Entity)object3).setIndex(n);
                list = ((EntityAudio)object3).getRect();
                f = ((RectF)list).right;
            }
        } else {
            ((Entity)object).setIndex(n);
            object2 = this.entityListAudio;
            object2.add(object);
        }
        object2 = this.entityList;
        object3 = EntityAction.ADD;
        list = new Pair(object, object3);
        ((Stack)object2).push(list);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addQuran(EntityQuranTimeline object) {
        this.entityListQuran.add(object);
        int n = this.entityListQuran.size() + -1;
        ((Entity)object).setIndex(n);
        Object object2 = this.entityList;
        EntityAction entityAction = EntityAction.ADD;
        Pair pair = new Pair(object, (Object)entityAction);
        object2.push(pair);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addQuran(EntityQuranTimeline object, int n) {
        Object object2;
        Object object3;
        List list = this.entityListQuran;
        int n2 = list.size();
        if (n < n2) {
            int n3;
            ((Entity)object).setIndex(n);
            this.entityListQuran.add(n, object);
            list = ((EntityQuranTimeline)object).getRect();
            float f = ((RectF)list).right;
            while (++n < (n3 = (object3 = this.entityListQuran).size())) {
                object3 = (EntityQuranTimeline)this.entityListQuran.get(n);
                boolean bl = ((Entity)object3).visible();
                if (!bl) continue;
                RectF rectF = ((EntityQuranTimeline)object3).getRect();
                float f2 = rectF.width();
                ((Entity)object3).setCurrentRect();
                ((EntityQuranTimeline)object3).setX(f);
                ((EntityQuranTimeline)object3).setRight(f += f2);
                ((Entity)object3).setIndex(n);
                list = ((EntityQuranTimeline)object3).getRect();
                f = ((RectF)list).right;
            }
        } else {
            ((Entity)object).setIndex(n);
            object2 = this.entityListQuran;
            object2.add(object);
        }
        object2 = this.entityList;
        object3 = EntityAction.ADD;
        list = new Pair(object, object3);
        ((Stack)object2).push(list);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addQuran_split(EntityQuranTimeline object, int n) {
        Object object2;
        Object object3 = this.entityListQuran;
        int n2 = object3.size();
        if (n < n2) {
            ((Entity)object).setIndex(n);
            object3 = this.entityListQuran;
            object3.add(n, object);
            while (++n < (n2 = (object3 = this.entityListQuran).size())) {
                object3 = (EntityQuranTimeline)this.entityListQuran.get(n);
                boolean bl = ((Entity)object3).visible();
                if (!bl) continue;
                ((Entity)object3).setIndex(n);
            }
        } else {
            ((Entity)object).setIndex(n);
            object2 = this.entityListQuran;
            object2.add(object);
        }
        object2 = this.entityList;
        EntityAction entityAction = EntityAction.SPLIT;
        object3 = new Pair(object, (Object)entityAction);
        ((Stack)object2).push(object3);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.SPLIT;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addQuran_split(EntityTrslTimeline object, int n) {
        Object object2;
        Object object3 = this.entityListTrslQuran;
        int n2 = object3.size();
        if (n < n2) {
            ((Entity)object).setIndex(n);
            object3 = this.entityListTrslQuran;
            object3.add(n, object);
            while (++n < (n2 = (object3 = this.entityListTrslQuran).size())) {
                object3 = (EntityTrslTimeline)this.entityListTrslQuran.get(n);
                boolean bl = ((Entity)object3).visible();
                if (!bl) continue;
                ((Entity)object3).setIndex(n);
            }
        } else {
            ((Entity)object).setIndex(n);
            object2 = this.entityListTrslQuran;
            object2.add(object);
        }
        object2 = this.entityList;
        EntityAction entityAction = EntityAction.SPLIT;
        object3 = new Pair(object, (Object)entityAction);
        ((Stack)object2).push(object3);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.SPLIT;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addStack(Entity entity, EntityAction entityAction) {
        Stack stack = this.entityList;
        Pair pair = new Pair((Object)entity, (Object)entityAction);
        stack.push(pair);
    }

    public void addTrslQuran(EntityTrslTimeline object) {
        this.entityListTrslQuran.add(object);
        int n = this.entityListTrslQuran.size() + -1;
        ((Entity)object).setIndex(n);
        Object object2 = this.entityList;
        EntityAction entityAction = EntityAction.ADD;
        Pair pair = new Pair(object, (Object)entityAction);
        object2.push(pair);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void addTrslQuran(EntityTrslTimeline object, int n) {
        Object object2;
        Object object3;
        List list = this.entityListTrslQuran;
        int n2 = list.size();
        if (n < n2) {
            int n3;
            ((Entity)object).setIndex(n);
            this.entityListTrslQuran.add(n, object);
            list = ((EntityTrslTimeline)object).getRect();
            float f = ((RectF)list).right;
            while (++n < (n3 = (object3 = this.entityListTrslQuran).size())) {
                object3 = (EntityTrslTimeline)this.entityListTrslQuran.get(n);
                boolean bl = ((Entity)object3).visible();
                if (!bl) continue;
                RectF rectF = ((EntityTrslTimeline)object3).getRect();
                float f2 = rectF.width();
                ((Entity)object3).setCurrentRect();
                ((EntityTrslTimeline)object3).setX(f);
                ((EntityTrslTimeline)object3).setRight(f += f2);
                ((Entity)object3).setIndex(n);
                list = ((EntityTrslTimeline)object3).getRect();
                f = ((RectF)list).right;
            }
        } else {
            ((Entity)object).setIndex(n);
            object2 = this.entityListTrslQuran;
            object2.add(object);
        }
        object2 = this.entityList;
        object3 = EntityAction.ADD;
        list = new Pair(object, object3);
        ((Stack)object2).push(list);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.ADD;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void calculMaxTime() {
        var1_1 = this.getAudio();
        var2_2 = 0;
        var3_3 = 0.0f;
        var4_4 = null;
        if (var1_1 != null && (var5_5 = var1_1.getRect()) != null) {
            var6_6 = var1_1.getmScaleFactor();
            cfr_temp_0 = var6_6 - (var7_7 = this.getScaleFactor());
            var8_8 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var8_8 != false) {
                var5_5 = var1_1.getRect();
                var6_6 = var5_5.right;
                var9_10 = var1_1.getmScaleFactor();
                var6_6 /= var9_10;
                var9_10 = this.getScaleFactor();
                var6_6 *= var9_10;
            } else {
                var1_1 = var1_1.getRect();
                var6_6 = var1_1.right;
            }
        } else {
            var8_9 = false;
            var5_5 = null;
            var6_6 = 0.0f;
        }
        var1_1 = this.getQuran();
        if (var1_1 != null && (var10_11 = var1_1.getRect()) != null) {
            var3_3 = var1_1.getmScaleFactor();
            cfr_temp_1 = var3_3 - (var7_7 = this.getScaleFactor());
            var2_2 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var2_2 != 0) {
                var4_4 = var1_1.getRect();
                var3_3 = var4_4.right;
                var9_10 = var1_1.getmScaleFactor();
                var3_3 /= var9_10;
                var9_10 = this.getScaleFactor();
                var3_3 *= var9_10;
            } else {
                var1_1 = var1_1.getRect();
                var3_3 = var1_1.right;
            }
        } else {
            var1_1 = this.bismilahTimeline;
            var11_12 = this.isExist((EntityBismilahTimeline)var1_1);
            if (var11_12) {
                var1_1 = this.bismilahTimeline;
                var9_10 = var1_1.getmScaleFactor();
                cfr_temp_2 = var9_10 - (var3_3 = this.getScaleFactor());
                var11_12 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                if (var11_12) {
                    var1_1 = this.bismilahTimeline.getRect();
                    var9_10 = var1_1.right;
                    var4_4 = this.bismilahTimeline;
                    var3_3 = var4_4.getmScaleFactor();
                    var9_10 /= var3_3;
                    var3_3 = this.getScaleFactor();
lbl53:
                    // 2 sources

                    while (true) {
                        var3_3 *= var9_10;
                        break;
                    }
                } else {
                    var1_1 = this.bismilahTimeline.getRect();
                    var3_3 = var1_1.right;
                }
            } else {
                var1_1 = this.mIsi3adaTimeline;
                var11_12 = this.isExist((EntityBismilahTimeline)var1_1);
                if (var11_12) {
                    var1_1 = this.mIsi3adaTimeline;
                    var9_10 = var1_1.getmScaleFactor();
                    cfr_temp_3 = var9_10 - (var3_3 = this.getScaleFactor());
                    var11_12 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                    if (var11_12) {
                        var1_1 = this.mIsi3adaTimeline.getRect();
                        var9_10 = var1_1.right;
                        var4_4 = this.mIsi3adaTimeline;
                        var3_3 = var4_4.getmScaleFactor();
                        var9_10 /= var3_3;
                        var3_3 = this.getScaleFactor();
                        ** continue;
                    }
                    var1_1 = this.mIsi3adaTimeline.getRect();
                    var3_3 = var1_1.right;
                }
            }
        }
        var1_1 = this.getTrslQuran();
        if (var1_1 != null && (var10_11 = var1_1.getRect()) != null) {
            var7_7 = var1_1.getmScaleFactor();
            cfr_temp_4 = var7_7 - (var12_13 = this.getScaleFactor());
            var13_14 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
            if (var13_14 != false) {
                var10_11 = var1_1.getRect();
                var7_7 = var10_11.right;
                var9_10 = var1_1.getmScaleFactor();
                var7_7 /= var9_10;
                var9_10 = this.getScaleFactor();
                var3_3 = Math.max(var7_7 *= var9_10, var3_3);
            } else {
                var1_1 = var1_1.getRect();
                var9_10 = var1_1.right;
                var3_3 = Math.max(var9_10, var3_3);
            }
        }
        var9_10 = Math.max(var3_3, var6_6);
        var3_3 = this.getSecond_in_screen();
        var3_3 = var9_10 / var3_3;
        var6_6 = 1000.0f;
        this.maxTime = var2_2 = (int)(var3_3 * var6_6);
        this.duration = var2_2 = (int)((float)var2_2 / var6_6);
        var3_3 = this.scaleFactor;
        this.timeLineW = var9_10 /= var3_3;
    }

    public void clearAudio() {
        Stack<Pair> stack = this.entityListAudio;
        boolean bl = stack.isEmpty();
        if (!bl) {
            boolean bl2;
            this.entityListAudio.clear();
            stack = new Stack<Pair>();
            Object object = this.entityList.iterator();
            while (bl2 = object.hasNext()) {
                Pair pair = (Pair)object.next();
                Object object2 = pair.first;
                boolean bl3 = object2 instanceof EntityAudio;
                if (bl3) continue;
                stack.push(pair);
            }
            object = this.entityList;
            ((Vector)object).clear();
            this.entityList = stack;
        }
    }

    public void computeScroll() {
        int n;
        boolean bl;
        Scroller scroller = this.scroller;
        if (scroller != null && !(bl = this.isProgress) && (n = scroller.computeScrollOffset()) != 0) {
            float f = this.currentPosition;
            bl = false;
            float f2 = 0.0f;
            TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = null;
            float f3 = f - 0.0f;
            n = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            if (n != 0 || (n = (scroller = this.scroller).getCurrX()) <= 0) {
                scroller = this.scroller;
                this.currentPosition = f = (float)scroller.getCurrX();
                float f4 = f - 0.0f;
                n = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                if (n > 0) {
                    this.currentPosition = 0.0f;
                }
                f = this.currentPosition;
                f2 = this.scaleFactor;
                this.scrolled_with_zoom = f *= f2;
                bl = this.isPlaying;
                if (!bl && (trackEntityView$ITrimLineCallback = this.iTrimLineCallback) != null) {
                    trackEntityView$ITrimLineCallback.onSeekPlayer(f);
                }
                this.invalidate();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void deleteEntity(boolean var1_1) {
        block16: {
            block17: {
                try {
                    var2_2 = this.selectedEntity;
                    if (var2_2 == null) break block16;
                    var3_3 /* !! */  = null;
                }
                catch (Exception v0) {
                    ** continue;
                }
                var2_2.visible(false);
                var2_2 = this.iTrimLineCallback;
                if (var2_2 == null) ** GOTO lbl17
                var3_3 /* !! */  = this.selectedEntity;
                var3_3 /* !! */  = var3_3 /* !! */ .getEntityView();
                var2_2.onDelete((EntityView)var3_3 /* !! */ );
lbl17:
                // 2 sources

                var2_2 = this.entityList;
                var4_4 = this.selectedEntity;
                var5_5 = EntityAction.DELETE;
                var3_3 /* !! */  = new Pair((Object)var4_4, (Object)var5_5);
                var2_2.push(var3_3 /* !! */ );
                var2_2 = this.iTrimLineCallback;
                if (var2_2 == null) break block17;
                var3_3 /* !! */  = EntityAction.DELETE;
                var2_2.onAddStack((EntityAction)var3_3 /* !! */ );
            }
            var2_2 = null;
            this.selectedEntity = null;
            if (!var1_1) ** GOTO lbl41
            this.updateTrslIndex();
            break block16;
lbl41:
            // 1 sources

            this.updateIndex();
        }
lbl43:
        // 2 sources

        while (true) {
            this.invalidate();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void deleteEntityAllSelect() {
        block109: {
            var1_1 = this.entityListQuran;
            var2_2 = null;
            var3_3 = false;
            var4_4 = null;
            if (var1_1 == null) ** GOTO lbl75
            var5_5 = (int)var1_1.isEmpty();
            if (var5_5 != 0) ** GOTO lbl75
            var1_1 = new ArrayList();
            var6_6 = 0;
            var7_7 = null;
            var8_8 = 0;
            var9_9 = null;
            while (true) {
                block103: {
                    block105: {
                        block104: {
                            var10_10 /* !! */  = this.entityListQuran;
                            var11_11 = var10_10 /* !! */ .size();
                            if (var8_8 >= var11_11) break;
                            var10_10 /* !! */  = this.entityListQuran;
                            var10_10 /* !! */  = var10_10 /* !! */ .get(var8_8);
                            var10_10 /* !! */  = (EntityQuranTimeline)var10_10 /* !! */ ;
                            var12_12 = var10_10 /* !! */ .visible();
                            if (!var12_12) break block103;
                            var12_12 = var10_10 /* !! */ .isSelect();
                            if (!var12_12) break block103;
                            if (var7_7 != null) break block104;
                            var7_7 = var10_10 /* !! */ ;
                            break block105;
                        }
                        var1_1.add(var10_10 /* !! */ );
                    }
                    var10_10 /* !! */ .visible(false);
                    var10_10 /* !! */ .setSelect(false);
                    var13_13 /* !! */  = this.iTrimLineCallback;
                    if (var13_13 /* !! */  == null) ** GOTO lbl52
                    var10_10 /* !! */  = var10_10 /* !! */ .getEntityView();
                    var13_13 /* !! */ .onDelete((EntityView)var10_10 /* !! */ );
lbl52:
                    // 2 sources

                    if ((var10_10 /* !! */  = this.iTrimLineCallback) == null) break block103;
                    var13_13 /* !! */  = EntityAction.DELETE;
                    var10_10 /* !! */ .onAddStack(var13_13 /* !! */ );
                }
                ++var8_8;
            }
            if (var7_7 == null) ** GOTO lbl74
            var9_9 = this.entityList;
            var13_13 /* !! */  = EntityAction.DELETE_MULTIPLE;
            var10_10 /* !! */  = new Pair(var7_7, (Object)var13_13 /* !! */ );
            var9_9.push(var10_10 /* !! */ );
            var8_8 = (int)var1_1.isEmpty();
            if (var8_8 != 0) ** GOTO lbl74
            var7_7.setEntitiesGroup((List)var1_1);
lbl74:
            // 3 sources

            this.updateIndex();
lbl75:
            // 3 sources

            if ((var1_1 = this.entityListTrslQuran) == null) ** GOTO lbl144
            var5_5 = (int)var1_1.isEmpty();
            if (var5_5 != 0) ** GOTO lbl144
            var1_1 = new ArrayList();
            var6_6 = 0;
            var7_7 = null;
            var8_8 = 0;
            var9_9 = null;
            while (true) {
                block106: {
                    block108: {
                        block107: {
                            var10_10 /* !! */  = this.entityListTrslQuran;
                            var11_11 = var10_10 /* !! */ .size();
                            if (var8_8 >= var11_11) break;
                            var10_10 /* !! */  = this.entityListTrslQuran;
                            var10_10 /* !! */  = var10_10 /* !! */ .get(var8_8);
                            var10_10 /* !! */  = (EntityTrslTimeline)var10_10 /* !! */ ;
                            var12_12 = var10_10 /* !! */ .visible();
                            if (!var12_12) break block106;
                            var12_12 = var10_10 /* !! */ .isSelect();
                            if (!var12_12) break block106;
                            if (var7_7 != null) break block107;
                            var7_7 = var10_10 /* !! */ ;
                            break block108;
                        }
                        var1_1.add(var10_10 /* !! */ );
                    }
                    var10_10 /* !! */ .visible(false);
                    var10_10 /* !! */ .setSelect(false);
                    var13_13 /* !! */  = this.iTrimLineCallback;
                    if (var13_13 /* !! */  == null) ** GOTO lbl121
                    var10_10 /* !! */  = var10_10 /* !! */ .getEntityView();
                    var13_13 /* !! */ .onDelete((EntityView)var10_10 /* !! */ );
lbl121:
                    // 2 sources

                    if ((var10_10 /* !! */  = this.iTrimLineCallback) == null) break block106;
                    var13_13 /* !! */  = EntityAction.DELETE;
                    var10_10 /* !! */ .onAddStack(var13_13 /* !! */ );
                }
                ++var8_8;
            }
            if (var7_7 == null) ** GOTO lbl143
            var9_9 = this.entityList;
            var13_13 /* !! */  = EntityAction.DELETE_MULTIPLE;
            var10_10 /* !! */  = new Pair(var7_7, (Object)var13_13 /* !! */ );
            var9_9.push(var10_10 /* !! */ );
            var8_8 = (int)var1_1.isEmpty();
            if (var8_8 != 0) ** GOTO lbl143
            var7_7.setEntitiesGroup((List)var1_1);
lbl143:
            // 3 sources

            this.updateTrslIndex();
lbl144:
            // 3 sources

            var1_1 = this.bismilahTimeline;
            var5_5 = (int)this.isExist((EntityBismilahTimeline)var1_1);
            if (var5_5 == 0) ** GOTO lbl181
            var1_1 = this.bismilahTimeline;
            var5_5 = (int)var1_1.isSelect();
            if (var5_5 == 0) ** GOTO lbl181
            var1_1 = this.bismilahTimeline;
            var1_1.visible(false);
            var1_1 = this.bismilahTimeline;
            var1_1.setSelect(false);
            var1_1 = this.bismilahTimeline;
            var1_1.setSelectMultiple(false);
            var1_1 = this.iTrimLineCallback;
            if (var1_1 == null) ** GOTO lbl171
            var9_9 = this.bismilahTimeline;
            var9_9 = var9_9.getEntityView();
            var1_1.onDelete((EntityView)var9_9);
lbl171:
            // 2 sources

            var1_1 = this.entityList;
            var7_7 = this.bismilahTimeline;
            var10_10 /* !! */  = EntityAction.DELETE_MULTIPLE;
            var9_9 = new Pair(var7_7, var10_10 /* !! */ );
            var1_1.push(var9_9);
lbl181:
            // 3 sources

            var1_1 = this.mIsi3adaTimeline;
            var5_5 = (int)this.isExist((EntityBismilahTimeline)var1_1);
            if (var5_5 == 0) ** GOTO lbl218
            var1_1 = this.mIsi3adaTimeline;
            var5_5 = (int)var1_1.isSelect();
            if (var5_5 == 0) ** GOTO lbl218
            var1_1 = this.mIsi3adaTimeline;
            var1_1.visible(false);
            var1_1 = this.mIsi3adaTimeline;
            var1_1.setSelect(false);
            var1_1 = this.mIsi3adaTimeline;
            var1_1.setSelectMultiple(false);
            var1_1 = this.iTrimLineCallback;
            if (var1_1 == null) ** GOTO lbl208
            var9_9 = this.mIsi3adaTimeline;
            var9_9 = var9_9.getEntityView();
            var1_1.onDelete((EntityView)var9_9);
lbl208:
            // 2 sources

            var1_1 = this.entityList;
            var7_7 = this.mIsi3adaTimeline;
            var10_10 /* !! */  = EntityAction.DELETE_MULTIPLE;
            var9_9 = new Pair(var7_7, var10_10 /* !! */ );
            var1_1.push(var9_9);
lbl218:
            // 3 sources

            if ((var1_1 = this.entityListAudio) == null) break block109;
            var5_5 = (int)var1_1.isEmpty();
            if (var5_5 != 0) break block109;
            var1_1 = new ArrayList();
            var8_8 = 0;
            var9_9 = null;
            while (true) {
                block110: {
                    block111: {
                        var7_7 = this.entityListAudio;
                        var6_6 = var7_7.size();
                        if (var8_8 >= var6_6) break;
                        var7_7 = this.entityListAudio;
                        var7_7 = var7_7.get(var8_8);
                        var7_7 = (EntityAudio)var7_7;
                        var11_11 = (int)var7_7.visible();
                        if (var11_11 == 0) break block110;
                        var11_11 = (int)var7_7.isSelect();
                        if (var11_11 == 0) break block110;
                        var7_7.visible(false);
                        var7_7.setSelect(false);
                        if (var2_2 != null) break block111;
                        var2_2 = var7_7;
                        ** GOTO lbl255
                    }
                    var1_1.add(var7_7);
lbl255:
                    // 2 sources

                    var7_7 = this.iTrimLineCallback;
                    if (var7_7 == null) break block110;
                    var10_10 /* !! */  = EntityAction.DELETE;
                    var7_7.onAddStack((EntityAction)var10_10 /* !! */ );
                }
                ++var8_8;
            }
            if (var2_2 == null) ** GOTO lbl280
            try {
                var4_4 = this.entityList;
            }
            catch (Exception v0) {
                ** continue;
            }
            var7_7 = EntityAction.DELETE_MULTIPLE;
            var9_9 = new Pair(var2_2, var7_7);
            var4_4.push(var9_9);
            var3_3 = var1_1.isEmpty();
            if (var3_3) ** GOTO lbl280
            var2_2.setEntitiesGroup((List)var1_1);
lbl280:
            // 3 sources

            this.updateMediaIndex();
        }
lbl282:
        // 2 sources

        while (true) {
            this.clr_btn_audio = var5_5 = -13421771;
            this.clr_btn_quran = var5_5;
            this.clr_btn_trsl = var5_5;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void deleteMediaEntity() {
        block11: {
            Object object;
            block12: {
                Entity entity;
                try {
                    object = this.selectedEntity;
                    if (object == null) break block11;
                    Object var2_2 = null;
                    ((Entity)object).visible(false);
                    object = this.entityList;
                    entity = this.selectedEntity;
                }
                catch (Exception exception) {}
                EntityAction entityAction = EntityAction.DELETE;
                Pair pair = new Pair((Object)entity, (Object)entityAction);
                ((Stack)object).push(pair);
                object = this.iTrimLineCallback;
                if (object == null) break block12;
                EntityAction entityAction2 = EntityAction.DELETE;
                object.onAddStack(entityAction2);
            }
            object = null;
            this.selectedEntity = null;
            this.updateMediaIndex();
        }
        this.invalidate();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void finishScroll() {
        boolean bl;
        Scroller scroller;
        block7: {
            try {
                scroller = this.scroller;
                if (scroller == null) break block7;
            }
            catch (Exception exception) {
                return;
            }
            bl = scroller.isFinished();
            if (bl) break block7;
            scroller = this.scroller;
            scroller.abortAnimation();
        }
        bl = false;
        scroller = null;
        this.scroller = null;
    }

    public void flingY() {
        ObjectAnimator objectAnimator;
        float f = this.target;
        float[] fArray = new float[]{f, 0.0f};
        this.objectAnimator = objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (String)"FlingY", (float[])fArray);
        objectAnimator.setDuration(1000L);
        this.objectAnimator.start();
    }

    public EntityAudio getAudio() {
        List list = this.entityListAudio;
        for (int i = list.size() + -1; i >= 0; i += -1) {
            EntityAudio entityAudio = (EntityAudio)this.entityListAudio.get(i);
            boolean bl = entityAudio.visible();
            if (!bl) {
                continue;
            }
            return entityAudio;
        }
        return null;
    }

    public EntityBismilahTimeline getBismilahTimeline() {
        return this.bismilahTimeline;
    }

    public float getCurrentPosition() {
        return this.scrolled_with_zoom;
    }

    public int getCurrent_cursur_position() {
        return this.current_cursur_position;
    }

    public float getDefaultScale() {
        return 0.5f;
    }

    public int getDuration() {
        return this.duration;
    }

    public Pair getEntityAudioNotDeleted(int n) {
        Object object;
        int n2;
        while (n < (n2 = (object = this.entityListAudio).size())) {
            object = (EntityAudio)this.entityListAudio.get(n);
            boolean bl = ((Entity)object).visible();
            if (bl) {
                Integer n3 = n;
                Pair pair = new Pair((Object)n3, object);
                return pair;
            }
            ++n;
        }
        return null;
    }

    public List getEntityListAudio() {
        return this.entityListAudio;
    }

    public List getEntityListQuran() {
        return this.entityListQuran;
    }

    public List getEntityListTrslQuran() {
        return this.entityListTrslQuran;
    }

    public EntityQuranTimeline getLastAyaQuran() {
        List list = this.entityListQuran;
        boolean bl = list.isEmpty();
        if (bl) {
            return null;
        }
        list = this.entityListQuran;
        int n = list.size() + -1;
        return (EntityQuranTimeline)list.get(n);
    }

    public int getMaxTime() {
        return this.maxTime;
    }

    public EntityAudio getPreviewOrNextEntityAudio(List list, int n, boolean n2) {
        if (n2 != 0) {
            while (n < (n2 = list.size())) {
                EntityAudio entityAudio = (EntityAudio)list.get(n);
                n2 = entityAudio.visible() ? 1 : 0;
                if (n2 != 0) {
                    return (EntityAudio)list.get(n);
                }
                ++n;
            }
            return null;
        }
        while (n >= 0 && n < (n2 = list.size())) {
            EntityAudio entityAudio = (EntityAudio)list.get(n);
            n2 = entityAudio.visible() ? 1 : 0;
            if (n2 != 0) {
                return (EntityAudio)list.get(n);
            }
            n += -1;
        }
        return null;
    }

    public EntityQuranTimeline getPreviewOrNextEntityQuran(List list, int n, boolean n2) {
        if (n2 != 0) {
            while (n < (n2 = list.size())) {
                EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)list.get(n);
                n2 = entityQuranTimeline.visible() ? 1 : 0;
                if (n2 != 0) {
                    return (EntityQuranTimeline)list.get(n);
                }
                ++n;
            }
            return null;
        }
        while (n >= 0 && n < (n2 = list.size())) {
            EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)list.get(n);
            n2 = entityQuranTimeline.visible() ? 1 : 0;
            if (n2 != 0) {
                return (EntityQuranTimeline)list.get(n);
            }
            n += -1;
        }
        return null;
    }

    public EntityTrslTimeline getPreviewOrNextEntityTrslQuran(List list, int n, boolean n2) {
        if (n2 != 0) {
            while (n < (n2 = list.size())) {
                EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)list.get(n);
                n2 = entityTrslTimeline.visible() ? 1 : 0;
                if (n2 != 0) {
                    return (EntityTrslTimeline)list.get(n);
                }
                ++n;
            }
            return null;
        }
        while (n >= 0 && n < (n2 = list.size())) {
            EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)list.get(n);
            n2 = entityTrslTimeline.visible() ? 1 : 0;
            if (n2 != 0) {
                return (EntityTrslTimeline)list.get(n);
            }
            n += -1;
        }
        return null;
    }

    public EntityQuranTimeline getQuran() {
        List list = this.entityListQuran;
        for (int i = list.size() + -1; i >= 0; i += -1) {
            EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)this.entityListQuran.get(i);
            boolean bl = entityQuranTimeline.visible();
            if (!bl) {
                continue;
            }
            return entityQuranTimeline;
        }
        return null;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public float getSecond_in_screen() {
        float f = this.second_in_screen;
        float f2 = this.scaleFactor;
        return f * f2;
    }

    public float getSecond_in_screenNoScale() {
        return this.second_in_screen;
    }

    public Entity getSelectedEntity() {
        return this.selectedEntity;
    }

    public float getTextSize() {
        Paint paint = this.paint_time;
        if (paint == null) {
            return 1.0f;
        }
        return paint.getTextSize() * 1.42f;
    }

    public float getTimeLineW() {
        return this.timeLineW;
    }

    public EntityTrslTimeline getTrslQuran() {
        List list = this.entityListTrslQuran;
        for (int i = list.size() + -1; i >= 0; i += -1) {
            EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)this.entityListTrslQuran.get(i);
            boolean bl = entityTrslTimeline.visible();
            if (!bl) {
                continue;
            }
            return entityTrslTimeline;
        }
        return null;
    }

    public float getXCursur() {
        float f = -this.currentPosition;
        float f2 = this.scaleFactor;
        return f * f2;
    }

    public EntityBismilahTimeline getmIsi3adaTimeline() {
        return this.mIsi3adaTimeline;
    }

    public void init(int n, int n2) {
        if (n > 0 && n2 > 0) {
            Paint paint;
            Object object;
            float f;
            float f2 = n;
            this.SPEED = f = 0.04f * f2;
            int n3 = 1;
            this.paint_time = object = new Paint(n3);
            object.setColor(-8355712);
            object = this.paint_time;
            Typeface typeface = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
            object.setTypeface(typeface);
            this.radius = f = 0.006f * f2;
            object = this.paint_time;
            object.setTextSize(f2 *= 0.023f);
            this.paintMaker = paint = new Paint(n3);
            paint.setColor(-1);
            paint = this.paintMaker;
            f = this.radius;
            float f3 = 0.5f;
            paint.setStrokeWidth(f *= f3);
            this.markerHeight = f2 = this.radius * 3.0f;
            f2 = this.paintMaker.getStrokeWidth();
            f = 4.0f;
            this.m_pos_y_marker = f2 *= f;
            f2 = this.radius;
            this.paddingCursur = f *= f2;
            f = (float)this.width_screen * f3;
            this.centerX = f -= (f2 *= f3);
            this.DETECT_RIGHT_MOVE = f2 = 0.4f * f;
            this.DETECT_LEFT_MOVE = f *= 0.45f;
            this.paintCursur = paint = new Paint(n3);
            f = this.radius;
            paint.setStrokeWidth(f);
            f2 = this.paintCursur.getStrokeWidth();
            n2 = 0x40333333;
            f = 2.8f;
            f2 *= f;
            this.paintLineCheck = object = new Paint(n3);
            int n4 = -16121;
            object.setColor(n4);
            object = this.paintLineCheck;
            float f4 = this.paintCursur.getStrokeWidth();
            object.setStrokeWidth(f4);
            object = this.paintLineCheck;
            int n5 = 2;
            float[] fArray = new float[n5];
            fArray[0] = f2;
            fArray[n3] = f2;
            n = 0;
            DashPathEffect dashPathEffect = new DashPathEffect(fArray, 0.0f);
            object.setPathEffect((PathEffect)dashPathEffect);
            paint = this.paint_time;
            object = "999";
            this.w_time_item = f2 = paint.measureText((String)object) * f3;
        }
    }

    public boolean isExist(EntityBismilahTimeline entityBismilahTimeline) {
        boolean bl;
        if (entityBismilahTimeline != null && (bl = entityBismilahTimeline.visible())) {
            bl = true;
        } else {
            bl = false;
            entityBismilahTimeline = null;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public boolean isPass(MotionEvent var1_1) {
        var2_2 = var1_1.getEventTime();
        var4_3 = this.lastTime;
        var2_2 -= var4_3;
        var6_4 = this.isDetectChange;
        var7_5 = 1;
        if (var6_4) ** GOTO lbl-1000
        var8_6 = 0L;
        var10_7 = 0.0;
        var12_8 = var4_3 == var8_6 ? 0 : (var4_3 < var8_6 ? -1 : 1);
        if (var12_8 != 0) {
            var13_9 = var2_2;
            var8_6 = this.lastDifference;
            var10_7 = var8_6;
            var15_10 = 2.88;
            cfr_temp_0 = var13_9 - (var10_7 *= var15_10);
            var12_8 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
            if (var12_8 > 0) {
                this.isDetectChange = var7_5;
            }
        } else lbl-1000:
        // 2 sources

        {
            this.countMove = var12_8 = this.countMove + var7_5;
            var17_11 = 3;
            if (var12_8 > var17_11) {
                this.isDetectChange = false;
                this.countMove = 0;
            }
        }
        if ((var12_8 = (int)this.isDetectChange) != 0) {
            return false;
        }
        this.lastTime = var4_3 = var1_1.getEventTime();
        this.lastDifference = var2_2;
        return (boolean)var7_5;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    protected void onDraw(Canvas canvas) {
        boolean bl;
        Paint paint = this.paint_time;
        if (paint != null && !(bl = this.isProgress)) {
            block4: {
                this.mDraw(canvas);
                bl = this.isPlaying();
                if (bl) break block4;
                try {
                    this.drawItemBtn(canvas);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            super.onDraw(canvas);
        }
    }

    public void onLayout(boolean bl, int n, int n2, int n3, int n4) {
        if (bl) {
            this.updateGestureExclusion();
        }
    }

    protected void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        n3 = 1;
        if (n2 >= n3 && n >= n3) {
            float f;
            float f2 = n2;
            this.maxBottom = f = 0.78f * f2;
            this.start_y_draw = f = 0.18f * f2;
            this.canvas_top_Y = f = 0.1f * f2;
            this.posY = f = 0.05f * f2;
            n2 = 1020591604;
            f = 0.026f;
            this.p = f2 *= f;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback;
        Object object;
        TrackEntityView trackEntityView;
        block223: {
            Object object2;
            int n;
            float f;
            block224: {
                block225: {
                    Object object3;
                    block230: {
                        int n2;
                        block229: {
                            block227: {
                                float f2;
                                Object object4;
                                float f3;
                                float f4;
                                int n3;
                                float f5;
                                int n4;
                                block254: {
                                    float f6;
                                    block252: {
                                        int n5;
                                        block246: {
                                            int n6;
                                            block240: {
                                                int n7;
                                                block259: {
                                                    float f7;
                                                    block258: {
                                                        block250: {
                                                            block257: {
                                                                long l;
                                                                block255: {
                                                                    block256: {
                                                                        float f8;
                                                                        block253: {
                                                                            int n8;
                                                                            block251: {
                                                                                block244: {
                                                                                    block249: {
                                                                                        long l2;
                                                                                        block247: {
                                                                                            block248: {
                                                                                                block245: {
                                                                                                    List list;
                                                                                                    block238: {
                                                                                                        block243: {
                                                                                                            block241: {
                                                                                                                block242: {
                                                                                                                    block239: {
                                                                                                                        List list2;
                                                                                                                        float f9;
                                                                                                                        block215: {
                                                                                                                            float f10;
                                                                                                                            Object object5;
                                                                                                                            float f11;
                                                                                                                            Object object6;
                                                                                                                            boolean bl;
                                                                                                                            long l3;
                                                                                                                            block216: {
                                                                                                                                float f12;
                                                                                                                                block206: {
                                                                                                                                    block237: {
                                                                                                                                        block236: {
                                                                                                                                            block232: {
                                                                                                                                                block235: {
                                                                                                                                                    float f13;
                                                                                                                                                    block233: {
                                                                                                                                                        block234: {
                                                                                                                                                            Object object7;
                                                                                                                                                            float f14;
                                                                                                                                                            block231: {
                                                                                                                                                                int n9;
                                                                                                                                                                block210: {
                                                                                                                                                                    Object object8;
                                                                                                                                                                    float f15;
                                                                                                                                                                    Object object9;
                                                                                                                                                                    float f16;
                                                                                                                                                                    float f17;
                                                                                                                                                                    block211: {
                                                                                                                                                                        block228: {
                                                                                                                                                                            block226: {
                                                                                                                                                                                long l4;
                                                                                                                                                                                block207: {
                                                                                                                                                                                    block222: {
                                                                                                                                                                                        block221: {
                                                                                                                                                                                            block219: {
                                                                                                                                                                                                block220: {
                                                                                                                                                                                                    float f18;
                                                                                                                                                                                                    Entity entity;
                                                                                                                                                                                                    int n10;
                                                                                                                                                                                                    block217: {
                                                                                                                                                                                                        block218: {
                                                                                                                                                                                                            float f19;
                                                                                                                                                                                                            float f20;
                                                                                                                                                                                                            List list3;
                                                                                                                                                                                                            int n11;
                                                                                                                                                                                                            Object object10;
                                                                                                                                                                                                            block208: {
                                                                                                                                                                                                                float f21;
                                                                                                                                                                                                                block214: {
                                                                                                                                                                                                                    block212: {
                                                                                                                                                                                                                        List list4;
                                                                                                                                                                                                                        float f22;
                                                                                                                                                                                                                        block213: {
                                                                                                                                                                                                                            Entity entity2;
                                                                                                                                                                                                                            block209: {
                                                                                                                                                                                                                                int n12;
                                                                                                                                                                                                                                float f23;
                                                                                                                                                                                                                                float f24;
                                                                                                                                                                                                                                trackEntityView = this;
                                                                                                                                                                                                                                object = motionEvent;
                                                                                                                                                                                                                                n7 = 0;
                                                                                                                                                                                                                                f7 = 0.0f;
                                                                                                                                                                                                                                trackEntityView$ITrimLineCallback = null;
                                                                                                                                                                                                                                if (motionEvent == null) return false;
                                                                                                                                                                                                                                n4 = this.isProgress;
                                                                                                                                                                                                                                if (n4 != 0) {
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                f6 = motionEvent.getX();
                                                                                                                                                                                                                                f = this.getPaddingLeft();
                                                                                                                                                                                                                                f6 += f;
                                                                                                                                                                                                                                f = this.centerX;
                                                                                                                                                                                                                                f5 = this.radius;
                                                                                                                                                                                                                                n3 = 0x3F000000;
                                                                                                                                                                                                                                f4 = 0.5f;
                                                                                                                                                                                                                                f -= (f5 *= f4);
                                                                                                                                                                                                                                f5 = this.scrolled_with_zoom;
                                                                                                                                                                                                                                f6 -= (f += f5);
                                                                                                                                                                                                                                f = motionEvent.getY();
                                                                                                                                                                                                                                n2 = this.getPaddingTop();
                                                                                                                                                                                                                                f5 = n2;
                                                                                                                                                                                                                                f += f5;
                                                                                                                                                                                                                                f5 = this.mScrollY;
                                                                                                                                                                                                                                motionEvent.setLocation(f6, f -= f5);
                                                                                                                                                                                                                                n4 = motionEvent.getPointerCount();
                                                                                                                                                                                                                                n = 1;
                                                                                                                                                                                                                                f = Float.MIN_VALUE;
                                                                                                                                                                                                                                if (n4 > n) {
                                                                                                                                                                                                                                    return this.scaleGestureDetector.onTouchEvent(motionEvent);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n4 = this.isScaleListener ? 1 : 0;
                                                                                                                                                                                                                                if (n4 != 0) {
                                                                                                                                                                                                                                    int n13 = motionEvent.getAction();
                                                                                                                                                                                                                                    if (n13 != n) return n != 0;
                                                                                                                                                                                                                                    this.isScaleListener = false;
                                                                                                                                                                                                                                    return n != 0;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n4 = motionEvent.getAction();
                                                                                                                                                                                                                                n2 = -1082130432;
                                                                                                                                                                                                                                f5 = -1.0f;
                                                                                                                                                                                                                                n3 = 0;
                                                                                                                                                                                                                                f4 = 0.0f;
                                                                                                                                                                                                                                object3 = null;
                                                                                                                                                                                                                                if (n4 == n) break block207;
                                                                                                                                                                                                                                n8 = 2;
                                                                                                                                                                                                                                f3 = 2.8E-45f;
                                                                                                                                                                                                                                if (n4 != n8) {
                                                                                                                                                                                                                                    return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                object4 = this.selectedEntity;
                                                                                                                                                                                                                                if (object4 == null) return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                                                                n10 = this.isPassScroll;
                                                                                                                                                                                                                                if (n10 != 0) return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                                                                if ((object4 = ((Entity)object4).getSelectTrim()) == null) break block208;
                                                                                                                                                                                                                                n4 = this.isPass(motionEvent) ? 1 : 0;
                                                                                                                                                                                                                                if (n4 == 0) {
                                                                                                                                                                                                                                    return n != 0;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                object4 = this.iTrimLineCallback;
                                                                                                                                                                                                                                if (object4 != null) {
                                                                                                                                                                                                                                    object4.onMove();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                object4 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                n4 = ((Entity)object4).getTrim_type();
                                                                                                                                                                                                                                l3 = 500L;
                                                                                                                                                                                                                                if (n4 != 0 || (n4 = (int)(trackEntityView.onThink ? 1 : 0)) == 0) break block209;
                                                                                                                                                                                                                                f6 = motionEvent.getX();
                                                                                                                                                                                                                                f3 = trackEntityView.lasX;
                                                                                                                                                                                                                                float f25 = (f6 = Math.abs(f6 - f3)) - (f3 = trackEntityView.TOLERANCE_X);
                                                                                                                                                                                                                                n4 = f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                if (n4 <= 0) {
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                trackEntityView.lasX = f6 = motionEvent.getX();
                                                                                                                                                                                                                                f6 = motionEvent.getX();
                                                                                                                                                                                                                                Entity entity3 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                f3 = entity3.getDownX();
                                                                                                                                                                                                                                float f26 = (f6 -= f3) - 0.0f;
                                                                                                                                                                                                                                n8 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                                if (n8 == 0) {
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                trackEntityView.selectedEntity.setTrimLeft(n != 0);
                                                                                                                                                                                                                                Entity entity4 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                f3 = entity4.getLeft() + f6;
                                                                                                                                                                                                                                RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                                float f27 = rectF.right - f3;
                                                                                                                                                                                                                                f17 = trackEntityView.max_trim;
                                                                                                                                                                                                                                f14 = f27 == f17 ? 0 : (f27 > f17 ? 1 : -1);
                                                                                                                                                                                                                                if (f14 > 0) {
                                                                                                                                                                                                                                    f14 = n;
                                                                                                                                                                                                                                    f27 = f;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    f14 = 0.0f;
                                                                                                                                                                                                                                    rectF = null;
                                                                                                                                                                                                                                    f27 = 0.0f;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                f16 = (f24 = f3 - 0.0f) == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                if (f16 < 0) {
                                                                                                                                                                                                                                    n8 = 0;
                                                                                                                                                                                                                                    Object var24_29 = null;
                                                                                                                                                                                                                                    f3 = 0.0f;
                                                                                                                                                                                                                                } else if (f14 == false) {
                                                                                                                                                                                                                                    RectF rectF2 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                                    f3 = rectF2.right;
                                                                                                                                                                                                                                    f17 = trackEntityView.max_trim;
                                                                                                                                                                                                                                    f3 -= f17;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                object9 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                int n14 = object9 instanceof EntityAudio;
                                                                                                                                                                                                                                if (n14 != 0) {
                                                                                                                                                                                                                                    object9 = (EntityAudio)object9;
                                                                                                                                                                                                                                    f15 = ((Entity)object9).getOffset_right();
                                                                                                                                                                                                                                    float f28 = ((Entity)object9).getmScaleFactor();
                                                                                                                                                                                                                                    object8 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                                    f23 = ((RectF)object8).right + (f15 *= f28) - f3;
                                                                                                                                                                                                                                    f28 = ((EntityAudio)object9).getMax();
                                                                                                                                                                                                                                    float f29 = ((Entity)object9).getmScaleFactor();
                                                                                                                                                                                                                                    float f30 = f23 - (f28 *= f29);
                                                                                                                                                                                                                                    n12 = f30 == 0.0f ? 0 : (f30 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                                    if (n12 > 0) {
                                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                        f7 = ((Entity)object).getRect().right + f15 - f28;
                                                                                                                                                                                                                                        ((Entity)object).setX(f7);
                                                                                                                                                                                                                                        ((EntityAudio)object9).updateStartTrim();
                                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    n12 = ((Entity)object9).getIndex();
                                                                                                                                                                                                                                    if (n12 > 0) {
                                                                                                                                                                                                                                        object8 = trackEntityView.entityListAudio;
                                                                                                                                                                                                                                        n14 = ((Entity)object9).getIndex() - n;
                                                                                                                                                                                                                                        if ((object8 = trackEntityView.getPreviewOrNextEntityAudio((List)object8, n14, false)) != null) {
                                                                                                                                                                                                                                            RectF rectF3 = ((EntityAudio)object8).getRect();
                                                                                                                                                                                                                                            f15 = rectF3.right;
                                                                                                                                                                                                                                            float f31 = f3 - f15;
                                                                                                                                                                                                                                            n14 = f31 == 0.0f ? 0 : (f31 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                            if (n14 <= 0) {
                                                                                                                                                                                                                                                float f32 = ((EntityAudio)object8).getRect().right;
                                                                                                                                                                                                                                                f6 = trackEntityView.selectedEntity.getRect().width();
                                                                                                                                                                                                                                                object4 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                                f5 = ((EntityAudio)object8).getRect().right;
                                                                                                                                                                                                                                                ((Entity)object4).setX(f5);
                                                                                                                                                                                                                                                ((EntityAudio)object9).updateStartTrim();
                                                                                                                                                                                                                                                trackEntityView.selectedEntity.setRight(f32 += f6);
                                                                                                                                                                                                                                                trackEntityView.pass = false;
                                                                                                                                                                                                                                                this.invalidate();
                                                                                                                                                                                                                                                return n != 0;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if ((f16 = (float)((object8 = trackEntityView.selectedEntity) instanceof EntityQuranTimeline)) != false) {
                                                                                                                                                                                                                                    f16 = ((Entity)(object8 = (EntityQuranTimeline)object8)).getIndex();
                                                                                                                                                                                                                                    if (f16 > 0 && (object8 = trackEntityView.getPreviewOrNextEntityQuran((List)(object9 = trackEntityView.entityListQuran), n12 = ((Entity)object8).getIndex() - n, false)) != null) {
                                                                                                                                                                                                                                        object9 = ((EntityQuranTimeline)object8).getRect();
                                                                                                                                                                                                                                        f17 = ((RectF)object9).right;
                                                                                                                                                                                                                                        float f33 = f3 - f17;
                                                                                                                                                                                                                                        f16 = f33 == 0.0f ? 0 : (f33 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                        if (f16 <= 0) {
                                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                            f6 = ((EntityQuranTimeline)object8).getRect().right;
                                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if ((n12 = trackEntityView.isExist((EntityBismilahTimeline)(object8 = trackEntityView.bismilahTimeline))) != 0) {
                                                                                                                                                                                                                                        object8 = trackEntityView.bismilahTimeline.getRect();
                                                                                                                                                                                                                                        f23 = ((RectF)object8).right;
                                                                                                                                                                                                                                        float f34 = f3 - f23;
                                                                                                                                                                                                                                        n12 = f34 == 0.0f ? 0 : (f34 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                        if (n12 <= 0) {
                                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                            f6 = trackEntityView.bismilahTimeline.getRect().right;
                                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if ((n12 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(object8 = trackEntityView.mIsi3adaTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                                        object8 = trackEntityView.mIsi3adaTimeline.getRect();
                                                                                                                                                                                                                                        f23 = ((RectF)object8).right;
                                                                                                                                                                                                                                        float f35 = f3 - f23;
                                                                                                                                                                                                                                        n12 = f35 == 0.0f ? 0 : (f35 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                        if (n12 <= 0) {
                                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                            f6 = trackEntityView.mIsi3adaTimeline.getRect().right;
                                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if ((f16 = (float)((object8 = trackEntityView.selectedEntity) instanceof EntityTrslTimeline)) != false && (f16 = (float)((Entity)(object8 = (EntityTrslTimeline)object8)).getIndex()) > 0 && (object8 = trackEntityView.getPreviewOrNextEntityTrslQuran((List)(object9 = trackEntityView.entityListTrslQuran), n12 = ((Entity)object8).getIndex() - n, false)) != null) {
                                                                                                                                                                                                                                    object9 = ((EntityTrslTimeline)object8).getRect();
                                                                                                                                                                                                                                    f17 = ((RectF)object9).right;
                                                                                                                                                                                                                                    float f36 = f3 - f17;
                                                                                                                                                                                                                                    f16 = f36 == 0.0f ? 0 : (f36 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                    if (f16 <= 0) {
                                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                        f6 = ((EntityTrslTimeline)object8).getRect().right;
                                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if ((f16 = (float)((object8 = trackEntityView.selectedEntity) instanceof EntityBismilahTimeline)) != false && (object8 = (EntityBismilahTimeline)object8) == (object9 = trackEntityView.bismilahTimeline) && (n12 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(object8 = trackEntityView.mIsi3adaTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                                    object8 = trackEntityView.mIsi3adaTimeline.getRect();
                                                                                                                                                                                                                                    f23 = ((RectF)object8).right;
                                                                                                                                                                                                                                    float f37 = f3 - f23;
                                                                                                                                                                                                                                    n12 = f37 == 0.0f ? 0 : (f37 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                    if (n12 <= 0) {
                                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                        f6 = trackEntityView.mIsi3adaTimeline.getRect().right;
                                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if ((n12 = (int)(trackEntityView.onThink ? 1 : 0)) == 0 || (n12 = (int)(trackEntityView.pass ? 1 : 0)) == 0) break block210;
                                                                                                                                                                                                                                object8 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                                f23 = ((RectF)object8).left;
                                                                                                                                                                                                                                f17 = trackEntityView.scrolled_with_zoom;
                                                                                                                                                                                                                                f15 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                                                                                f13 = -f15;
                                                                                                                                                                                                                                float f38 = (f23 += f17) - f13;
                                                                                                                                                                                                                                n10 = f38 == 0.0f ? 0 : (f38 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                                if (n10 >= 0 && (n10 = (int)(f23 == f15 ? 0 : (f23 < f15 ? -1 : 1))) < 0) {
                                                                                                                                                                                                                                    trackEntityView.onThink = false;
                                                                                                                                                                                                                                    f6 = -f17;
                                                                                                                                                                                                                                    trackEntityView.selectedEntity.setX(f6);
                                                                                                                                                                                                                                    trackEntityView.selectedEntity.updateStartTrim();
                                                                                                                                                                                                                                    Entity entity5 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                                    n3 = entity5 instanceof EntityAudio;
                                                                                                                                                                                                                                    if (n3 != 0) {
                                                                                                                                                                                                                                        object3 = entity5.getRect();
                                                                                                                                                                                                                                        f4 = object3.width();
                                                                                                                                                                                                                                        entity5.setRight(f6 += f4);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    trackEntityView.isCheckLineCursur = n;
                                                                                                                                                                                                                                    trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().left;
                                                                                                                                                                                                                                    this.invalidate();
                                                                                                                                                                                                                                    object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                                                                                    if (object4 != null) {
                                                                                                                                                                                                                                        object4.onPlayVibration();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    object4 = new Handler();
                                                                                                                                                                                                                                    TrackEntityView$4 trackEntityView$4 = new TrackEntityView$4(trackEntityView, (MotionEvent)object);
                                                                                                                                                                                                                                    object4.postDelayed((Runnable)trackEntityView$4, l3);
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                object7 = trackEntityView.entityList.iterator();
                                                                                                                                                                                                                                break block211;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            n4 = ((Entity)object4).getTrim_type();
                                                                                                                                                                                                                            if (n4 != n) return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                                                            n4 = trackEntityView.onThink ? 1 : 0;
                                                                                                                                                                                                                            if (n4 == 0) return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                                                            f6 = motionEvent.getX();
                                                                                                                                                                                                                            f2 = trackEntityView.lasX;
                                                                                                                                                                                                                            float f39 = (f6 = Math.abs(f6 - f2)) - (f2 = trackEntityView.TOLERANCE_X);
                                                                                                                                                                                                                            n4 = f39 == 0.0f ? 0 : (f39 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                            if (n4 <= 0) {
                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            trackEntityView.lasX = f6 = motionEvent.getX();
                                                                                                                                                                                                                            f6 = motionEvent.getX();
                                                                                                                                                                                                                            Entity entity6 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f2 = entity6.getDownX();
                                                                                                                                                                                                                            float f40 = (f6 -= f2) - 0.0f;
                                                                                                                                                                                                                            n10 = f40 == 0.0f ? 0 : (f40 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                            if (n10 == 0) {
                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            entity6 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f2 = entity6.getRight() + f6;
                                                                                                                                                                                                                            RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                            float f41 = rectF.left;
                                                                                                                                                                                                                            f9 = trackEntityView.max_trim;
                                                                                                                                                                                                                            float f42 = (f41 = f2 - f41) - f9;
                                                                                                                                                                                                                            f8 = f42 == 0.0f ? 0 : (f42 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                            if (f8 > 0) {
                                                                                                                                                                                                                                f8 = n;
                                                                                                                                                                                                                                f41 = f;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                f8 = 0.0f;
                                                                                                                                                                                                                                rectF = null;
                                                                                                                                                                                                                                f41 = 0.0f;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (f8 == false) {
                                                                                                                                                                                                                                entity6 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                                f2 = ((RectF)entity6).left;
                                                                                                                                                                                                                                f9 = trackEntityView.max_trim;
                                                                                                                                                                                                                                f2 += f9;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!(bl = (entity2 = trackEntityView.selectedEntity) instanceof EntityAudio)) break block212;
                                                                                                                                                                                                                            object6 = entity2;
                                                                                                                                                                                                                            object6 = (EntityAudio)entity2;
                                                                                                                                                                                                                            entity2 = entity2.getRect();
                                                                                                                                                                                                                            f9 = ((RectF)entity2).left;
                                                                                                                                                                                                                            f9 = f2 - f9;
                                                                                                                                                                                                                            f21 = ((EntityAudio)object6).getMax();
                                                                                                                                                                                                                            f11 = ((Entity)object6).getmScaleFactor();
                                                                                                                                                                                                                            f21 *= f11;
                                                                                                                                                                                                                            f11 = ((Entity)object6).getOffset_left();
                                                                                                                                                                                                                            float f43 = ((Entity)object6).getmScaleFactor();
                                                                                                                                                                                                                            float f44 = f9 - (f21 -= (f11 *= f43));
                                                                                                                                                                                                                            f22 = f44 == 0.0f ? 0 : (f44 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                            if (f22 <= 0) break block213;
                                                                                                                                                                                                                            entity6 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                            f2 = ((RectF)entity6).left + f21;
                                                                                                                                                                                                                            break block214;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        int n15 = ((Entity)object6).getIndex() + n;
                                                                                                                                                                                                                        if (n15 >= (f22 = (float)(list4 = trackEntityView.entityListAudio).size())) break block214;
                                                                                                                                                                                                                        object5 = trackEntityView.entityListAudio;
                                                                                                                                                                                                                        f22 = ((Entity)object6).getIndex() + n;
                                                                                                                                                                                                                        if ((object5 = trackEntityView.getPreviewOrNextEntityAudio((List)object5, (int)f22, n != 0)) == null) break block214;
                                                                                                                                                                                                                        RectF rectF = ((EntityAudio)object5).getRect();
                                                                                                                                                                                                                        f11 = rectF.left;
                                                                                                                                                                                                                        float f45 = f2 - f11;
                                                                                                                                                                                                                        f22 = f45 == 0.0f ? 0 : (f45 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                        if (f22 <= 0) break block214;
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                        ((RectF)object).right = f2;
                                                                                                                                                                                                                        f12 = f9 == f5 ? 0 : (f9 > f5 ? 1 : -1);
                                                                                                                                                                                                                        if (f12 == false) {
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f5 = ((Entity)object).getRight() + f6;
                                                                                                                                                                                                                            ((Entity)object).setLastRight(f5);
                                                                                                                                                                                                                            break block206;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            object4 = ((Entity)object).getRect();
                                                                                                                                                                                                                            f6 = ((RectF)object4).right;
                                                                                                                                                                                                                            ((Entity)object).setLastRight(f6);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        break block206;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    int n16 = n2;
                                                                                                                                                                                                                    f9 = f5;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                bl = trackEntityView.onThink;
                                                                                                                                                                                                                if (!bl || !(bl = trackEntityView.pass)) break block215;
                                                                                                                                                                                                                object6 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                f10 = ((RectF)object6).right;
                                                                                                                                                                                                                f21 = trackEntityView.scrolled_with_zoom;
                                                                                                                                                                                                                f11 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                                                                f4 = -f11;
                                                                                                                                                                                                                float f46 = (f10 += f21) - f4;
                                                                                                                                                                                                                n3 = f46 == 0.0f ? 0 : (f46 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                if (n3 >= 0 && (n3 = (int)(f10 == f11 ? 0 : (f10 < f11 ? -1 : 1))) < 0) {
                                                                                                                                                                                                                    trackEntityView.onThink = false;
                                                                                                                                                                                                                    f6 = -f21 + f11;
                                                                                                                                                                                                                    Entity entity7 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                    n3 = entity7 instanceof EntityAudio;
                                                                                                                                                                                                                    if (n3 != 0) {
                                                                                                                                                                                                                        object3 = entity7.getRect();
                                                                                                                                                                                                                        f4 = ((RectF)object3).right;
                                                                                                                                                                                                                        RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                                        f3 = rectF.width();
                                                                                                                                                                                                                        entity7.setX(f4 -= f3);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    Entity entity8 = trackEntityView.selectedEntity;
                                                                                                                                                                                                                    entity8.setRight(f6);
                                                                                                                                                                                                                    trackEntityView.isCheckLineCursur = n;
                                                                                                                                                                                                                    trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().right;
                                                                                                                                                                                                                    this.invalidate();
                                                                                                                                                                                                                    object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                                                                    if (object4 != null) {
                                                                                                                                                                                                                        object4.onPlayVibration();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    object4 = new Handler();
                                                                                                                                                                                                                    TrackEntityView$7 trackEntityView$7 = new TrackEntityView$7(trackEntityView, (MotionEvent)object);
                                                                                                                                                                                                                    object4.postDelayed((Runnable)trackEntityView$7, l3);
                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                object3 = trackEntityView.entityList.iterator();
                                                                                                                                                                                                                break block216;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            f6 = motionEvent.getX();
                                                                                                                                                                                                            f4 = this.lasX;
                                                                                                                                                                                                            float f47 = (f6 = Math.abs(f6 - f4)) - (f4 = this.TOLERANCE_X);
                                                                                                                                                                                                            n4 = f47 == 0.0f ? 0 : (f47 < 0.0f ? -1 : 1);
                                                                                                                                                                                                            if (n4 <= 0) {
                                                                                                                                                                                                                return false;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.lasX = f6 = motionEvent.getX();
                                                                                                                                                                                                            f6 = motionEvent.getX();
                                                                                                                                                                                                            f4 = this.selectedEntity.getDownX();
                                                                                                                                                                                                            f6 -= f4;
                                                                                                                                                                                                            n3 = 0;
                                                                                                                                                                                                            f4 = 0.0f;
                                                                                                                                                                                                            object3 = null;
                                                                                                                                                                                                            float f48 = f6 - 0.0f;
                                                                                                                                                                                                            n8 = f48 == 0.0f ? 0 : (f48 > 0.0f ? 1 : -1);
                                                                                                                                                                                                            if (n8 == 0) {
                                                                                                                                                                                                                return false;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            RectF rectF = this.selectedEntity.getRect();
                                                                                                                                                                                                            f3 = rectF.width();
                                                                                                                                                                                                            entity = this.selectedEntity;
                                                                                                                                                                                                            f18 = entity.getLeft();
                                                                                                                                                                                                            float f49 = (f6 += f18) - 0.0f;
                                                                                                                                                                                                            n10 = f49 == 0.0f ? 0 : (f49 < 0.0f ? -1 : 1);
                                                                                                                                                                                                            if (n10 < 0) {
                                                                                                                                                                                                                n4 = 0;
                                                                                                                                                                                                                f6 = 0.0f;
                                                                                                                                                                                                                object4 = null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            f4 = f6 + f3;
                                                                                                                                                                                                            entity = trackEntityView.selectedEntity;
                                                                                                                                                                                                            int n17 = entity instanceof EntityQuranTimeline;
                                                                                                                                                                                                            if (n17 != 0) {
                                                                                                                                                                                                                n17 = (entity = (EntityQuranTimeline)entity).getIndex();
                                                                                                                                                                                                                if (n17 > 0) {
                                                                                                                                                                                                                    object10 = trackEntityView.entityListQuran;
                                                                                                                                                                                                                    n11 = entity.getIndex() - n;
                                                                                                                                                                                                                    if ((object10 = trackEntityView.getPreviewOrNextEntityQuran((List)object10, n11, false)) != null) {
                                                                                                                                                                                                                        list3 = ((EntityQuranTimeline)object10).getRect();
                                                                                                                                                                                                                        f20 = ((RectF)list3).right;
                                                                                                                                                                                                                        float f50 = f6 - f20;
                                                                                                                                                                                                                        n11 = f50 == 0.0f ? 0 : (f50 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                        if (n11 <= 0) {
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityQuranTimeline)object10).getRect().right;
                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityQuranTimeline)object10).getRect().right + f3;
                                                                                                                                                                                                                            ((Entity)object).setRight(f6);
                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((n17 = entity.getIndex() + n) < (n11 = (list3 = this.getEntityListQuran()).size()) && (entity = trackEntityView.getPreviewOrNextEntityQuran((List)(object10 = trackEntityView.entityListQuran), n10 = entity.getIndex() + n, n != 0)) != null) {
                                                                                                                                                                                                                    object10 = ((EntityQuranTimeline)entity).getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).left;
                                                                                                                                                                                                                    float f51 = f4 - f19;
                                                                                                                                                                                                                    n17 = f51 == 0.0f ? 0 : (f51 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                    if (n17 >= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityQuranTimeline)entity).getRect().left - f3;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityQuranTimeline)entity).getRect().left;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((n10 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(entity = trackEntityView.bismilahTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                    entity = trackEntityView.bismilahTimeline.getRect();
                                                                                                                                                                                                                    f18 = ((RectF)entity).right;
                                                                                                                                                                                                                    float f52 = f6 - f18;
                                                                                                                                                                                                                    n10 = f52 == 0.0f ? 0 : (f52 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                    if (n10 <= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.bismilahTimeline.getRect().right;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.bismilahTimeline.getRect().right + f3;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((n10 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(entity = trackEntityView.mIsi3adaTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                    entity = trackEntityView.mIsi3adaTimeline.getRect();
                                                                                                                                                                                                                    f18 = ((RectF)entity).right;
                                                                                                                                                                                                                    float f53 = f6 - f18;
                                                                                                                                                                                                                    n10 = f53 == 0.0f ? 0 : (f53 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                    if (n10 <= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.mIsi3adaTimeline.getRect().right;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.mIsi3adaTimeline.getRect().right + f3;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if ((n17 = (entity = trackEntityView.selectedEntity) instanceof EntityTrslTimeline) != 0) {
                                                                                                                                                                                                                n17 = (entity = (EntityTrslTimeline)entity).getIndex();
                                                                                                                                                                                                                if (n17 > 0) {
                                                                                                                                                                                                                    object10 = trackEntityView.entityListTrslQuran;
                                                                                                                                                                                                                    n11 = entity.getIndex() - n;
                                                                                                                                                                                                                    if ((object10 = trackEntityView.getPreviewOrNextEntityTrslQuran((List)object10, n11, false)) != null) {
                                                                                                                                                                                                                        list3 = ((EntityTrslTimeline)object10).getRect();
                                                                                                                                                                                                                        f20 = ((RectF)list3).right;
                                                                                                                                                                                                                        float f54 = f6 - f20;
                                                                                                                                                                                                                        n11 = f54 == 0.0f ? 0 : (f54 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                        if (n11 <= 0) {
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityTrslTimeline)object10).getRect().right;
                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityTrslTimeline)object10).getRect().right + f3;
                                                                                                                                                                                                                            ((Entity)object).setRight(f6);
                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((n17 = entity.getIndex() + n) < (n11 = (list3 = this.getEntityListTrslQuran()).size()) && (entity = trackEntityView.getPreviewOrNextEntityTrslQuran((List)(object10 = trackEntityView.entityListTrslQuran), n10 = entity.getIndex() + n, n != 0)) != null) {
                                                                                                                                                                                                                    object10 = ((EntityTrslTimeline)entity).getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).left;
                                                                                                                                                                                                                    float f55 = f4 - f19;
                                                                                                                                                                                                                    n17 = f55 == 0.0f ? 0 : (f55 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                    if (n17 >= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityTrslTimeline)entity).getRect().left - f3;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityTrslTimeline)entity).getRect().left;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if ((n17 = (entity = trackEntityView.selectedEntity) instanceof EntityBismilahTimeline) != 0) {
                                                                                                                                                                                                                object10 = trackEntityView.mIsi3adaTimeline;
                                                                                                                                                                                                                if ((entity = (EntityBismilahTimeline)entity) == object10 && (n17 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(object10 = trackEntityView.bismilahTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                    object10 = trackEntityView.bismilahTimeline.getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).left;
                                                                                                                                                                                                                    float f56 = f4 - f19;
                                                                                                                                                                                                                    n17 = f56 == 0.0f ? 0 : (f56 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                    if (n17 >= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.bismilahTimeline.getRect().left - f3;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.bismilahTimeline.getRect().left;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (entity == (object10 = trackEntityView.bismilahTimeline) && (n17 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(object10 = trackEntityView.mIsi3adaTimeline)) ? 1 : 0)) != 0) {
                                                                                                                                                                                                                    object10 = trackEntityView.mIsi3adaTimeline.getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).right;
                                                                                                                                                                                                                    float f57 = f6 - f19;
                                                                                                                                                                                                                    n17 = f57 == 0.0f ? 0 : (f57 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                    if (n17 <= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.mIsi3adaTimeline.getRect().right;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = trackEntityView.mIsi3adaTimeline.getRect().right + f3;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((entity = trackEntityView.getPreviewOrNextEntityQuran((List)(object10 = trackEntityView.entityListQuran), n10 = entity.getIndex(), n != 0)) != null) {
                                                                                                                                                                                                                    object10 = ((EntityQuranTimeline)entity).getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).left;
                                                                                                                                                                                                                    float f58 = f4 - f19;
                                                                                                                                                                                                                    n17 = f58 == 0.0f ? 0 : (f58 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                    if (n17 >= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityQuranTimeline)entity).getRect().left - f3;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityQuranTimeline)entity).getRect().left;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if ((n17 = (entity = trackEntityView.selectedEntity) instanceof EntityAudio) != 0) {
                                                                                                                                                                                                                n17 = (entity = (EntityAudio)entity).getIndex();
                                                                                                                                                                                                                if (n17 > 0) {
                                                                                                                                                                                                                    object10 = trackEntityView.entityListAudio;
                                                                                                                                                                                                                    n11 = entity.getIndex() - n;
                                                                                                                                                                                                                    if ((object10 = trackEntityView.getPreviewOrNextEntityAudio((List)object10, n11, false)) != null) {
                                                                                                                                                                                                                        list3 = ((EntityAudio)object10).getRect();
                                                                                                                                                                                                                        f20 = ((RectF)list3).right;
                                                                                                                                                                                                                        float f59 = f6 - f20;
                                                                                                                                                                                                                        n11 = f59 == 0.0f ? 0 : (f59 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                        if (n11 <= 0) {
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityAudio)object10).getRect().right;
                                                                                                                                                                                                                            ((Entity)object).setX(f6);
                                                                                                                                                                                                                            object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                            f6 = ((EntityAudio)object10).getRect().right + f3;
                                                                                                                                                                                                                            ((Entity)object).setRight(f6);
                                                                                                                                                                                                                            trackEntityView.pass = false;
                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                            return n != 0;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if ((n17 = entity.getIndex() + n) < (n11 = (list3 = this.getEntityListAudio()).size()) && (entity = trackEntityView.getPreviewOrNextEntityAudio((List)(object10 = trackEntityView.entityListAudio), n10 = entity.getIndex() + n, n != 0)) != null) {
                                                                                                                                                                                                                    object10 = ((EntityAudio)entity).getRect();
                                                                                                                                                                                                                    f19 = ((RectF)object10).left;
                                                                                                                                                                                                                    float f60 = f4 - f19;
                                                                                                                                                                                                                    n17 = f60 == 0.0f ? 0 : (f60 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                    if (n17 >= 0) {
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityAudio)entity).getRect().left - f3;
                                                                                                                                                                                                                        ((Entity)object).setX(f6);
                                                                                                                                                                                                                        object = trackEntityView.selectedEntity;
                                                                                                                                                                                                                        f6 = ((EntityAudio)entity).getRect().left;
                                                                                                                                                                                                                        ((Entity)object).setRight(f6);
                                                                                                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                                                                                                        this.invalidate();
                                                                                                                                                                                                                        return n != 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            RectF rectF4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                            f3 = rectF4.right;
                                                                                                                                                                                                            float f61 = f3 - f4;
                                                                                                                                                                                                            n8 = f61 == 0.0f ? 0 : (f61 < 0.0f ? -1 : 1);
                                                                                                                                                                                                            if (n8 >= 0) break block217;
                                                                                                                                                                                                            RectF rectF5 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                            f3 = rectF5.left;
                                                                                                                                                                                                            f18 = this.getCurrentPosition();
                                                                                                                                                                                                            float f62 = (f3 += f18) - (f18 = trackEntityView.DETECT_RIGHT_MOVE);
                                                                                                                                                                                                            n8 = f62 == 0.0f ? 0 : (f62 > 0.0f ? 1 : -1);
                                                                                                                                                                                                            if (n8 <= 0) break block218;
                                                                                                                                                                                                            n8 = trackEntityView.isAutoMove ? 1 : 0;
                                                                                                                                                                                                            if (n8 == 0) {
                                                                                                                                                                                                                long l5;
                                                                                                                                                                                                                f3 = trackEntityView.SPEED;
                                                                                                                                                                                                                f18 = 0.0f;
                                                                                                                                                                                                                entity = null;
                                                                                                                                                                                                                float f63 = f3 - 0.0f;
                                                                                                                                                                                                                n10 = f63 == 0.0f ? 0 : (f63 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                if (n10 > 0) {
                                                                                                                                                                                                                    trackEntityView.SPEED = f3 *= f5;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                trackEntityView.isAutoMove = n;
                                                                                                                                                                                                                trackEntityView.time_start = l5 = System.currentTimeMillis();
                                                                                                                                                                                                                Handler handler = trackEntityView.autoScrollHandler;
                                                                                                                                                                                                                Runnable runnable = trackEntityView.autoMoveRunnable;
                                                                                                                                                                                                                long l6 = 100;
                                                                                                                                                                                                                handler.postDelayed(runnable, l6);
                                                                                                                                                                                                                break block219;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                f3 = trackEntityView.SPEED;
                                                                                                                                                                                                                f18 = 0.0f;
                                                                                                                                                                                                                entity = null;
                                                                                                                                                                                                                float f64 = f3 - 0.0f;
                                                                                                                                                                                                                n10 = f64 == 0.0f ? 0 : (f64 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                if (n10 < 0) {
                                                                                                                                                                                                                    trackEntityView.SPEED = f3 *= f5;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            break block219;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n2 = trackEntityView.isAutoMove ? 1 : 0;
                                                                                                                                                                                                        if (n2 != 0) {
                                                                                                                                                                                                            trackEntityView.isAutoMove = false;
                                                                                                                                                                                                            Handler handler = trackEntityView.autoScrollHandler;
                                                                                                                                                                                                            Runnable runnable = trackEntityView.autoMoveRunnable;
                                                                                                                                                                                                            handler.removeCallbacks(runnable);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        break block219;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                    f3 = rectF.left;
                                                                                                                                                                                                    n10 = 0;
                                                                                                                                                                                                    f18 = 0.0f;
                                                                                                                                                                                                    entity = null;
                                                                                                                                                                                                    float f65 = f3 - 0.0f;
                                                                                                                                                                                                    n8 = f65 == 0.0f ? 0 : (f65 > 0.0f ? 1 : -1);
                                                                                                                                                                                                    if (n8 <= 0) break block220;
                                                                                                                                                                                                    RectF rectF6 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                    f3 = rectF6.left;
                                                                                                                                                                                                    f18 = this.getCurrentPosition();
                                                                                                                                                                                                    float f66 = (f3 += f18) - (f18 = -trackEntityView.DETECT_LEFT_MOVE);
                                                                                                                                                                                                    n8 = f66 == 0.0f ? 0 : (f66 < 0.0f ? -1 : 1);
                                                                                                                                                                                                    if (n8 >= 0) break block220;
                                                                                                                                                                                                    n8 = trackEntityView.isAutoMove ? 1 : 0;
                                                                                                                                                                                                    if (n8 == 0) {
                                                                                                                                                                                                        long l7;
                                                                                                                                                                                                        f3 = trackEntityView.SPEED;
                                                                                                                                                                                                        f18 = 0.0f;
                                                                                                                                                                                                        entity = null;
                                                                                                                                                                                                        float f67 = f3 - 0.0f;
                                                                                                                                                                                                        n10 = f67 == 0.0f ? 0 : (f67 < 0.0f ? -1 : 1);
                                                                                                                                                                                                        if (n10 < 0) {
                                                                                                                                                                                                            trackEntityView.SPEED = f3 *= f5;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        trackEntityView.isAutoMove = n;
                                                                                                                                                                                                        trackEntityView.time_start = l7 = System.currentTimeMillis();
                                                                                                                                                                                                        Handler handler = trackEntityView.autoScrollHandler;
                                                                                                                                                                                                        Runnable runnable = trackEntityView.autoMoveRunnable;
                                                                                                                                                                                                        long l8 = 100;
                                                                                                                                                                                                        handler.postDelayed(runnable, l8);
                                                                                                                                                                                                        break block219;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        f3 = trackEntityView.SPEED;
                                                                                                                                                                                                        f18 = 0.0f;
                                                                                                                                                                                                        entity = null;
                                                                                                                                                                                                        float f68 = f3 - 0.0f;
                                                                                                                                                                                                        n10 = f68 == 0.0f ? 0 : (f68 > 0.0f ? 1 : -1);
                                                                                                                                                                                                        if (n10 > 0) {
                                                                                                                                                                                                            trackEntityView.SPEED = f3 *= f5;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break block219;
                                                                                                                                                                                                }
                                                                                                                                                                                                if ((n2 = (int)(trackEntityView.isAutoMove ? 1 : 0)) != 0) {
                                                                                                                                                                                                    trackEntityView.isAutoMove = false;
                                                                                                                                                                                                    Handler handler = trackEntityView.autoScrollHandler;
                                                                                                                                                                                                    Runnable runnable = trackEntityView.autoMoveRunnable;
                                                                                                                                                                                                    handler.removeCallbacks(runnable);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            n2 = trackEntityView.isAutoMove ? 1 : 0;
                                                                                                                                                                                            if (n2 == 0) {
                                                                                                                                                                                                RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                rectF.left = f6;
                                                                                                                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                                ((RectF)object4).right = f4;
                                                                                                                                                                                                trackEntityView.isMove = n;
                                                                                                                                                                                            }
                                                                                                                                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                            f6 = ((RectF)object4).left;
                                                                                                                                                                                            f5 = -trackEntityView.TOLERANCE_X;
                                                                                                                                                                                            float f69 = f6 - f5;
                                                                                                                                                                                            n4 = f69 == 0.0f ? 0 : (f69 < 0.0f ? -1 : 1);
                                                                                                                                                                                            if (n4 < 0) break block221;
                                                                                                                                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                            f6 = ((RectF)object4).left;
                                                                                                                                                                                            f5 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                                            float f70 = f6 - f5;
                                                                                                                                                                                            n4 = f70 == 0.0f ? 0 : (f70 > 0.0f ? 1 : -1);
                                                                                                                                                                                            if (n4 < 0) break block222;
                                                                                                                                                                                        }
                                                                                                                                                                                        n7 = n;
                                                                                                                                                                                        f7 = f;
                                                                                                                                                                                    }
                                                                                                                                                                                    trackEntityView.pass = n7;
                                                                                                                                                                                    this.invalidate();
                                                                                                                                                                                    return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                                                                }
                                                                                                                                                                                n4 = 0;
                                                                                                                                                                                f6 = 0.0f;
                                                                                                                                                                                this.eventY = 0.0f;
                                                                                                                                                                                this.eventX = 0.0f;
                                                                                                                                                                                this.signeY = f5;
                                                                                                                                                                                this.signeX = f5;
                                                                                                                                                                                this.lastTime = l4 = 0L;
                                                                                                                                                                                this.lastDifference = l4;
                                                                                                                                                                                this.countMove = 0;
                                                                                                                                                                                this.isDetectChange = false;
                                                                                                                                                                                this.isPassScroll = n;
                                                                                                                                                                                this.isAutoMove = false;
                                                                                                                                                                                object2 = this.selectedEntity;
                                                                                                                                                                                if (object2 == null) break block223;
                                                                                                                                                                                n4 = this.isMove ? 1 : 0;
                                                                                                                                                                                if (n4 != 0) {
                                                                                                                                                                                    f6 = this.currentPosition;
                                                                                                                                                                                    n3 = 1148846080;
                                                                                                                                                                                    f6 *= 1000.0f;
                                                                                                                                                                                    f4 = this.second_in_screen;
                                                                                                                                                                                    f6 = f6 / f4 * f5;
                                                                                                                                                                                    this.current_cursur_position = n4 = Math.round(f6);
                                                                                                                                                                                    this.isAutoScroll = false;
                                                                                                                                                                                    this.isOnUp = n;
                                                                                                                                                                                    this.isCheckLineCursur = false;
                                                                                                                                                                                    this.isCheckLine = false;
                                                                                                                                                                                    this.invalidate();
                                                                                                                                                                                    this.selectedEntity.onChange();
                                                                                                                                                                                    object2 = this.entityList;
                                                                                                                                                                                    object3 = this.selectedEntity;
                                                                                                                                                                                    EntityAction entityAction = EntityAction.MOVE;
                                                                                                                                                                                    Pair pair = new Pair(object3, (Object)entityAction);
                                                                                                                                                                                    ((Stack)object2).push(pair);
                                                                                                                                                                                    object2 = this.iTrimLineCallback;
                                                                                                                                                                                    if (object2 != null) {
                                                                                                                                                                                        object2.onUpdateTime();
                                                                                                                                                                                        object2 = this.iTrimLineCallback;
                                                                                                                                                                                        EntityAction entityAction2 = EntityAction.MOVE;
                                                                                                                                                                                        object2.onAddStack(entityAction2);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if ((object2 = trackEntityView.selectedEntity.getSelectTrim()) == null) break block224;
                                                                                                                                                                                trackEntityView.isAutoScroll = false;
                                                                                                                                                                                object2 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                                if (object2 != null) {
                                                                                                                                                                                    object2.onUp();
                                                                                                                                                                                }
                                                                                                                                                                                trackEntityView.pass = n;
                                                                                                                                                                                trackEntityView.onThink = n;
                                                                                                                                                                                f6 = 0.0f;
                                                                                                                                                                                trackEntityView.lasX = 0.0f;
                                                                                                                                                                                trackEntityView.isOnUp = n;
                                                                                                                                                                                trackEntityView.isCheckLineCursur = false;
                                                                                                                                                                                trackEntityView.isCheckLine = false;
                                                                                                                                                                                object2 = trackEntityView.selectedEntity;
                                                                                                                                                                                n4 = ((Entity)object2).getTrim_type();
                                                                                                                                                                                if (n4 == 0) {
                                                                                                                                                                                    trackEntityView.selectedEntity.onChange();
                                                                                                                                                                                    object2 = trackEntityView.entityList;
                                                                                                                                                                                    object3 = trackEntityView.selectedEntity;
                                                                                                                                                                                    EntityAction entityAction = EntityAction.TRIM;
                                                                                                                                                                                    Pair pair = new Pair(object3, (Object)entityAction);
                                                                                                                                                                                    ((Stack)object2).push(pair);
                                                                                                                                                                                    object2 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                                    if (object2 != null) {
                                                                                                                                                                                        EntityAction entityAction3 = EntityAction.TRIM;
                                                                                                                                                                                        object2.onAddStack(entityAction3);
                                                                                                                                                                                    }
                                                                                                                                                                                    object2 = trackEntityView.selectedEntity;
                                                                                                                                                                                    ((Entity)object2).onUpLeft();
                                                                                                                                                                                }
                                                                                                                                                                                if ((n4 = ((Entity)(object2 = trackEntityView.selectedEntity)).getTrim_type()) != n) break block225;
                                                                                                                                                                                object2 = trackEntityView.selectedEntity;
                                                                                                                                                                                n = object2 instanceof EntityQuranTimeline;
                                                                                                                                                                                if (n == 0) break block226;
                                                                                                                                                                                object2 = this.getEntityListQuran().iterator();
                                                                                                                                                                                break block227;
                                                                                                                                                                            }
                                                                                                                                                                            n = object2 instanceof EntityAudio;
                                                                                                                                                                            if (n == 0) break block228;
                                                                                                                                                                            object2 = this.getEntityListAudio().iterator();
                                                                                                                                                                            break block229;
                                                                                                                                                                        }
                                                                                                                                                                        n = object2 instanceof EntityBismilahTimeline;
                                                                                                                                                                        if (n != 0 && (object2 = ((Entity)object2).getCurrentStackEntity()) != null) {
                                                                                                                                                                            trackEntityView.selectedEntity.onChange();
                                                                                                                                                                            object2 = trackEntityView.entityList;
                                                                                                                                                                            Entity entity = trackEntityView.selectedEntity;
                                                                                                                                                                            object3 = EntityAction.MOVE;
                                                                                                                                                                            Pair pair = new Pair((Object)entity, object3);
                                                                                                                                                                            ((Stack)object2).push(pair);
                                                                                                                                                                        }
                                                                                                                                                                        break block230;
                                                                                                                                                                    }
                                                                                                                                                                    while ((n9 = object7.hasNext()) != 0) {
                                                                                                                                                                        EntityAction entityAction;
                                                                                                                                                                        EntityAction entityAction4;
                                                                                                                                                                        Object object11 = (Pair)object7.next();
                                                                                                                                                                        object8 = (Entity)((Pair)object11).first;
                                                                                                                                                                        object9 = ((Entity)object8).getRect();
                                                                                                                                                                        f17 = ((RectF)object9).top;
                                                                                                                                                                        RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                        f15 = rectF.top;
                                                                                                                                                                        float f71 = f17 - f15;
                                                                                                                                                                        f16 = f71 == 0.0f ? 0 : (f71 > 0.0f ? 1 : -1);
                                                                                                                                                                        if (f16 == false || object8 == (object9 = trackEntityView.selectedEntity) || (object9 = ((Pair)object11).second) != (entityAction4 = EntityAction.ADD) && (object9 = ((Pair)object11).second) != (entityAction = EntityAction.SPLIT) || (n9 = ((Entity)(object11 = (Entity)((Pair)object11).first)).visible()) == 0) continue;
                                                                                                                                                                        object11 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                        float f72 = ((RectF)object11).left;
                                                                                                                                                                        object9 = ((Entity)object8).getRect();
                                                                                                                                                                        f17 = ((RectF)object9).left;
                                                                                                                                                                        f15 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                        float f73 = f72 - (f17 -= f15);
                                                                                                                                                                        n9 = f73 == 0.0f ? 0 : (f73 > 0.0f ? 1 : -1);
                                                                                                                                                                        if (n9 >= 0) {
                                                                                                                                                                            object11 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                            f72 = ((RectF)object11).left;
                                                                                                                                                                            object9 = ((Entity)object8).getRect();
                                                                                                                                                                            f17 = ((RectF)object9).left;
                                                                                                                                                                            f15 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                            float f74 = f72 - (f17 += f15);
                                                                                                                                                                            n9 = f74 == 0.0f ? 0 : (f74 < 0.0f ? -1 : 1);
                                                                                                                                                                            if (n9 <= 0) {
                                                                                                                                                                                trackEntityView.onThink = false;
                                                                                                                                                                                object4 = trackEntityView.selectedEntity;
                                                                                                                                                                                RectF rectF7 = ((Entity)object8).getRect();
                                                                                                                                                                                f5 = rectF7.left;
                                                                                                                                                                                ((Entity)object4).setX(f5);
                                                                                                                                                                                trackEntityView.selectedEntity.updateStartTrim();
                                                                                                                                                                                object4 = trackEntityView.selectedEntity;
                                                                                                                                                                                n2 = object4 instanceof EntityAudio;
                                                                                                                                                                                if (n2 != 0) {
                                                                                                                                                                                    RectF rectF8 = ((Entity)object8).getRect();
                                                                                                                                                                                    f5 = rectF8.left;
                                                                                                                                                                                    object3 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                                    f4 = object3.width();
                                                                                                                                                                                    ((Entity)object4).setRight(f5 += f4);
                                                                                                                                                                                }
                                                                                                                                                                                trackEntityView.isCheckLine = n;
                                                                                                                                                                                trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().left;
                                                                                                                                                                                this.invalidate();
                                                                                                                                                                                object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                                if (object4 != null) {
                                                                                                                                                                                    object4.onPlayVibration();
                                                                                                                                                                                }
                                                                                                                                                                                object4 = new Handler();
                                                                                                                                                                                TrackEntityView$5 trackEntityView$5 = new TrackEntityView$5(trackEntityView, (MotionEvent)object);
                                                                                                                                                                                object4.postDelayed((Runnable)trackEntityView$5, l3);
                                                                                                                                                                                return false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        object11 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                        f72 = ((RectF)object11).left;
                                                                                                                                                                        object9 = ((Entity)object8).getRect();
                                                                                                                                                                        f17 = ((RectF)object9).right;
                                                                                                                                                                        f15 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                        float f75 = f72 - (f17 -= f15);
                                                                                                                                                                        n9 = f75 == 0.0f ? 0 : (f75 > 0.0f ? 1 : -1);
                                                                                                                                                                        if (n9 < 0) continue;
                                                                                                                                                                        object11 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                        f72 = ((RectF)object11).left;
                                                                                                                                                                        object9 = ((Entity)object8).getRect();
                                                                                                                                                                        f17 = ((RectF)object9).right;
                                                                                                                                                                        f15 = trackEntityView.TOLERANCE_X;
                                                                                                                                                                        float f76 = f72 - (f17 += f15);
                                                                                                                                                                        n9 = f76 == 0.0f ? 0 : (f76 < 0.0f ? -1 : 1);
                                                                                                                                                                        if (n9 > 0) continue;
                                                                                                                                                                        trackEntityView.onThink = false;
                                                                                                                                                                        object4 = trackEntityView.selectedEntity;
                                                                                                                                                                        RectF rectF9 = ((Entity)object8).getRect();
                                                                                                                                                                        f5 = rectF9.right;
                                                                                                                                                                        ((Entity)object4).setX(f5);
                                                                                                                                                                        object4 = trackEntityView.selectedEntity;
                                                                                                                                                                        n2 = object4 instanceof EntityAudio;
                                                                                                                                                                        if (n2 != 0) {
                                                                                                                                                                            RectF rectF10 = ((Entity)object8).getRect();
                                                                                                                                                                            f5 = rectF10.right;
                                                                                                                                                                            object3 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                            f4 = object3.width();
                                                                                                                                                                            ((Entity)object4).setRight(f5 += f4);
                                                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                                                            ((Entity)object4).updateStartTrim();
                                                                                                                                                                        }
                                                                                                                                                                        trackEntityView.isCheckLine = n;
                                                                                                                                                                        trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().left;
                                                                                                                                                                        this.invalidate();
                                                                                                                                                                        object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                                                        if (object4 != null) {
                                                                                                                                                                            object4.onPlayVibration();
                                                                                                                                                                        }
                                                                                                                                                                        object4 = new Handler();
                                                                                                                                                                        TrackEntityView$6 trackEntityView$6 = new TrackEntityView$6(trackEntityView, (MotionEvent)object);
                                                                                                                                                                        object4.postDelayed((Runnable)trackEntityView$6, l3);
                                                                                                                                                                        return false;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if ((n9 = (object7 = trackEntityView.selectedEntity) instanceof EntityAudio) == 0) break block231;
                                                                                                                                                                ((Entity)object7).getRect().left = f3;
                                                                                                                                                                Entity entity = trackEntityView.selectedEntity;
                                                                                                                                                                f4 = entity.getLeft() + f6;
                                                                                                                                                                entity.setLastLeft(f4);
                                                                                                                                                                trackEntityView.selectedEntity.updateStartTrim();
                                                                                                                                                                object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                                Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                                object4.removeCallbacks(runnable);
                                                                                                                                                                trackEntityView.isAutoScroll = false;
                                                                                                                                                                break block232;
                                                                                                                                                            }
                                                                                                                                                            if (f14 == false) break block232;
                                                                                                                                                            object4 = ((Entity)object7).getRect();
                                                                                                                                                            f6 = ((RectF)object4).left;
                                                                                                                                                            float f77 = f6 - f3;
                                                                                                                                                            n4 = f77 == 0.0f ? 0 : (f77 < 0.0f ? -1 : 1);
                                                                                                                                                            if (n4 >= 0) break block233;
                                                                                                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                            f6 = ((RectF)object4).left;
                                                                                                                                                            f13 = this.getCurrentPosition();
                                                                                                                                                            float f78 = (f6 += f13) - (f13 = trackEntityView.DETECT_RIGHT_MOVE);
                                                                                                                                                            n4 = f78 == 0.0f ? 0 : (f78 > 0.0f ? 1 : -1);
                                                                                                                                                            if (n4 <= 0) break block234;
                                                                                                                                                            n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                                                                            if (n4 == 0) {
                                                                                                                                                                long l9;
                                                                                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                f6 = ((RectF)object4).left;
                                                                                                                                                                float f79 = f3 - f6;
                                                                                                                                                                n4 = f79 == 0.0f ? 0 : (f79 > 0.0f ? 1 : -1);
                                                                                                                                                                if (n4 > 0) {
                                                                                                                                                                    f6 = trackEntityView.SPEED;
                                                                                                                                                                    float f80 = f6 - 0.0f;
                                                                                                                                                                    n3 = f80 == 0.0f ? 0 : (f80 < 0.0f ? -1 : 1);
                                                                                                                                                                    if (n3 < 0) {
                                                                                                                                                                        trackEntityView.SPEED = f6 *= f5;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    f6 = trackEntityView.SPEED;
                                                                                                                                                                    float f81 = f6 - 0.0f;
                                                                                                                                                                    n3 = f81 == 0.0f ? 0 : (f81 > 0.0f ? 1 : -1);
                                                                                                                                                                    if (n3 > 0) {
                                                                                                                                                                        trackEntityView.SPEED = f6 *= f5;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                trackEntityView.isAutoScroll = n;
                                                                                                                                                                trackEntityView.time_start = l9 = System.currentTimeMillis();
                                                                                                                                                                object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                                Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                                long l10 = 100;
                                                                                                                                                                object4.postDelayed(runnable, l10);
                                                                                                                                                                break block232;
                                                                                                                                                            } else {
                                                                                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                                f6 = ((RectF)object4).left;
                                                                                                                                                                float f82 = f3 - f6;
                                                                                                                                                                n4 = f82 == 0.0f ? 0 : (f82 < 0.0f ? -1 : 1);
                                                                                                                                                                if (n4 < 0 && (n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                                                                                                    trackEntityView.isAutoScroll = false;
                                                                                                                                                                    object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                                    Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                                    object4.removeCallbacks(runnable);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            break block232;
                                                                                                                                                        }
                                                                                                                                                        n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                                                                        if (n4 != 0) {
                                                                                                                                                            trackEntityView.isAutoScroll = false;
                                                                                                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                            Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                            object4.removeCallbacks(runnable);
                                                                                                                                                        }
                                                                                                                                                        break block232;
                                                                                                                                                    }
                                                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                    f6 = ((RectF)object4).left;
                                                                                                                                                    float f83 = f6 - 0.0f;
                                                                                                                                                    n4 = f83 == 0.0f ? 0 : (f83 > 0.0f ? 1 : -1);
                                                                                                                                                    if (n4 <= 0) break block235;
                                                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                    f6 = ((RectF)object4).left;
                                                                                                                                                    f13 = this.getCurrentPosition();
                                                                                                                                                    float f84 = (f6 += f13) - (f13 = -trackEntityView.DETECT_LEFT_MOVE);
                                                                                                                                                    n4 = f84 == 0.0f ? 0 : (f84 < 0.0f ? -1 : 1);
                                                                                                                                                    if (n4 >= 0) break block235;
                                                                                                                                                    n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                                                                    if (n4 == 0) {
                                                                                                                                                        long l11;
                                                                                                                                                        f6 = trackEntityView.SPEED;
                                                                                                                                                        float f85 = f6 - 0.0f;
                                                                                                                                                        n3 = f85 == 0.0f ? 0 : (f85 < 0.0f ? -1 : 1);
                                                                                                                                                        if (n3 < 0) {
                                                                                                                                                            trackEntityView.SPEED = f6 *= f5;
                                                                                                                                                        }
                                                                                                                                                        trackEntityView.isAutoScroll = n;
                                                                                                                                                        trackEntityView.time_start = l11 = System.currentTimeMillis();
                                                                                                                                                        object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                        Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                        long l12 = 100;
                                                                                                                                                        object4.postDelayed(runnable, l12);
                                                                                                                                                        break block232;
                                                                                                                                                    } else {
                                                                                                                                                        f6 = trackEntityView.SPEED;
                                                                                                                                                        float f86 = f6 - 0.0f;
                                                                                                                                                        n3 = f86 == 0.0f ? 0 : (f86 > 0.0f ? 1 : -1);
                                                                                                                                                        if (n3 > 0) {
                                                                                                                                                            trackEntityView.SPEED = f6 *= f5;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break block232;
                                                                                                                                                }
                                                                                                                                                if ((n4 = trackEntityView.isAutoScroll) != 0) {
                                                                                                                                                    trackEntityView.isAutoScroll = false;
                                                                                                                                                    object4 = trackEntityView.autoScrollHandler;
                                                                                                                                                    Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                                                                                    object4.removeCallbacks(runnable);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            n4 = trackEntityView.isAutoScroll;
                                                                                                                                            if (n4 == 0) {
                                                                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                f6 = ((RectF)object4).left;
                                                                                                                                                float f87 = f3 - f6;
                                                                                                                                                n4 = f87 == 0.0f ? 0 : (f87 > 0.0f ? 1 : -1);
                                                                                                                                                if (n4 > 0) {
                                                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                    f5 = trackEntityView.TOLERANCE_X;
                                                                                                                                                    ((RectF)object4).left = f3 += f5;
                                                                                                                                                } else {
                                                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                    f5 = trackEntityView.TOLERANCE_X;
                                                                                                                                                    ((RectF)object4).left = f3 -= f5;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            object4 = trackEntityView.paintCursur;
                                                                                                                                            f6 = object4.getStrokeWidth() * 0.3f;
                                                                                                                                            RectF rectF = trackEntityView.selectedEntity.getRect();
                                                                                                                                            f5 = rectF.left;
                                                                                                                                            f4 = trackEntityView.startXLine - f6;
                                                                                                                                            float f88 = f5 - f4;
                                                                                                                                            n2 = f88 == 0.0f ? 0 : (f88 < 0.0f ? -1 : 1);
                                                                                                                                            if (n2 < 0) break block236;
                                                                                                                                            RectF rectF11 = trackEntityView.selectedEntity.getRect();
                                                                                                                                            f5 = rectF11.left;
                                                                                                                                            f4 = trackEntityView.startXLine + f6;
                                                                                                                                            float f89 = f5 - f4;
                                                                                                                                            n4 = f89 == 0.0f ? 0 : (f89 > 0.0f ? 1 : -1);
                                                                                                                                            if (n4 <= 0) break block237;
                                                                                                                                        }
                                                                                                                                        n7 = n;
                                                                                                                                        f7 = f;
                                                                                                                                    }
                                                                                                                                    trackEntityView.pass = n7;
                                                                                                                                    this.invalidate();
                                                                                                                                    return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                                                                                                                }
                                                                                                                                object = ((EntityAudio)object5).getRect();
                                                                                                                                float f90 = object.width() + f2;
                                                                                                                                object4 = ((EntityAudio)object5).getRect();
                                                                                                                                f6 = ((RectF)object4).left;
                                                                                                                                f6 = f2 - f6;
                                                                                                                                ((Entity)object5).setCurrentRect();
                                                                                                                                ((EntityAudio)object5).setX(f2);
                                                                                                                                ((EntityAudio)object5).setRight(f90);
                                                                                                                                f12 = ((Entity)object6).getIndex() + n8;
                                                                                                                                while (true) {
                                                                                                                                    List list5;
                                                                                                                                    if (f12 >= (n2 = (list5 = trackEntityView.entityListAudio).size())) {
                                                                                                                                        trackEntityView.pass = false;
                                                                                                                                        this.invalidate();
                                                                                                                                        return n != 0;
                                                                                                                                    }
                                                                                                                                    Entity entity = (Entity)trackEntityView.entityListAudio.get((int)f12);
                                                                                                                                    n3 = entity.visible();
                                                                                                                                    if (n3 != 0) {
                                                                                                                                        object3 = entity.getRect();
                                                                                                                                        f4 = ((RectF)object3).left + f6;
                                                                                                                                        RectF rectF = entity.getRect();
                                                                                                                                        f3 = rectF.width() + f4;
                                                                                                                                        entity.setCurrentRect();
                                                                                                                                        entity.setX(f4);
                                                                                                                                        entity.setRight(f3);
                                                                                                                                    }
                                                                                                                                    ++f12;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            while (bl = object3.hasNext()) {
                                                                                                                                Object object12;
                                                                                                                                EntityAction entityAction;
                                                                                                                                Object object13;
                                                                                                                                Entity entity;
                                                                                                                                object6 = (Pair)object3.next();
                                                                                                                                object5 = (Entity)((Pair)object6).first;
                                                                                                                                RectF rectF = ((Entity)object5).getRect();
                                                                                                                                f11 = rectF.top;
                                                                                                                                RectF rectF12 = trackEntityView.selectedEntity.getRect();
                                                                                                                                f3 = rectF12.top;
                                                                                                                                float f91 = f11 - f3;
                                                                                                                                n8 = f91 == 0.0f ? 0 : (f91 > 0.0f ? 1 : -1);
                                                                                                                                if (n8 != 0 && object5 != (entity = trackEntityView.selectedEntity) && ((object13 = ((Pair)object6).second) == (entityAction = EntityAction.ADD) || (object12 = ((Pair)object6).second) == (object6 = EntityAction.SPLIT)) && (n8 = (int)(((Entity)object5).visible() ? 1 : 0)) != 0) {
                                                                                                                                    RectF rectF13 = trackEntityView.selectedEntity.getRect();
                                                                                                                                    f3 = rectF13.right;
                                                                                                                                    object6 = ((Entity)object5).getRect();
                                                                                                                                    f10 = ((RectF)object6).left;
                                                                                                                                    f11 = trackEntityView.TOLERANCE_X;
                                                                                                                                    float f92 = f3 - (f10 -= f11);
                                                                                                                                    n8 = f92 == 0.0f ? 0 : (f92 > 0.0f ? 1 : -1);
                                                                                                                                    if (n8 >= 0) {
                                                                                                                                        RectF rectF14 = trackEntityView.selectedEntity.getRect();
                                                                                                                                        f3 = rectF14.right;
                                                                                                                                        object6 = ((Entity)object5).getRect();
                                                                                                                                        f10 = ((RectF)object6).left;
                                                                                                                                        f11 = trackEntityView.TOLERANCE_X;
                                                                                                                                        float f93 = f3 - (f10 += f11);
                                                                                                                                        n8 = f93 == 0.0f ? 0 : (f93 < 0.0f ? -1 : 1);
                                                                                                                                        if (n8 <= 0) {
                                                                                                                                            trackEntityView.onThink = false;
                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                            RectF rectF15 = ((Entity)object5).getRect();
                                                                                                                                            f5 = rectF15.left;
                                                                                                                                            ((Entity)object4).setRight(f5);
                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                            n2 = object4 instanceof EntityAudio;
                                                                                                                                            if (n2 != 0) {
                                                                                                                                                RectF rectF16 = ((Entity)object5).getRect();
                                                                                                                                                f5 = rectF16.left;
                                                                                                                                                object3 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                f4 = object3.width();
                                                                                                                                                ((Entity)object4).setX(f5 -= f4);
                                                                                                                                            }
                                                                                                                                            trackEntityView.isCheckLine = n;
                                                                                                                                            trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().right;
                                                                                                                                            this.invalidate();
                                                                                                                                            object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                            if (object4 != null) {
                                                                                                                                                object4.onPlayVibration();
                                                                                                                                            }
                                                                                                                                            object4 = new Handler();
                                                                                                                                            TrackEntityView$8 trackEntityView$8 = new TrackEntityView$8(trackEntityView, (MotionEvent)object);
                                                                                                                                            object4.postDelayed((Runnable)trackEntityView$8, l3);
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    RectF rectF17 = trackEntityView.selectedEntity.getRect();
                                                                                                                                    f3 = rectF17.right;
                                                                                                                                    object6 = ((Entity)object5).getRect();
                                                                                                                                    f10 = ((RectF)object6).right;
                                                                                                                                    f11 = trackEntityView.TOLERANCE_X;
                                                                                                                                    float f94 = f3 - (f10 -= f11);
                                                                                                                                    n8 = f94 == 0.0f ? 0 : (f94 > 0.0f ? 1 : -1);
                                                                                                                                    if (n8 >= 0) {
                                                                                                                                        RectF rectF18 = trackEntityView.selectedEntity.getRect();
                                                                                                                                        f3 = rectF18.right;
                                                                                                                                        object6 = ((Entity)object5).getRect();
                                                                                                                                        f10 = ((RectF)object6).right;
                                                                                                                                        f11 = trackEntityView.TOLERANCE_X;
                                                                                                                                        float f95 = f3 - (f10 += f11);
                                                                                                                                        n8 = f95 == 0.0f ? 0 : (f95 < 0.0f ? -1 : 1);
                                                                                                                                        if (n8 <= 0) {
                                                                                                                                            trackEntityView.onThink = false;
                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                            RectF rectF19 = ((Entity)object5).getRect();
                                                                                                                                            f5 = rectF19.right;
                                                                                                                                            ((Entity)object4).setRight(f5);
                                                                                                                                            object4 = trackEntityView.selectedEntity;
                                                                                                                                            n2 = object4 instanceof EntityAudio;
                                                                                                                                            if (n2 != 0) {
                                                                                                                                                RectF rectF20 = ((Entity)object5).getRect();
                                                                                                                                                f5 = rectF20.right;
                                                                                                                                                object3 = trackEntityView.selectedEntity.getRect();
                                                                                                                                                f4 = object3.width();
                                                                                                                                                ((Entity)object4).setX(f5 -= f4);
                                                                                                                                            }
                                                                                                                                            trackEntityView.isCheckLine = n;
                                                                                                                                            trackEntityView.startXLine = f6 = trackEntityView.selectedEntity.getRect().right;
                                                                                                                                            this.invalidate();
                                                                                                                                            object4 = trackEntityView.iTrimLineCallback;
                                                                                                                                            if (object4 != null) {
                                                                                                                                                object4.onPlayVibration();
                                                                                                                                            }
                                                                                                                                            object4 = new Handler();
                                                                                                                                            TrackEntityView$9 trackEntityView$9 = new TrackEntityView$9(trackEntityView, (MotionEvent)object);
                                                                                                                                            object4.postDelayed((Runnable)trackEntityView$9, l3);
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                n8 = 2;
                                                                                                                                f3 = 2.8E-45f;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if ((n8 = (object3 = trackEntityView.selectedEntity) instanceof EntityAudio) != 0) {
                                                                                                                            object3 = ((Entity)object3).getRect();
                                                                                                                            ((RectF)object3).right = f2;
                                                                                                                            n3 = f9 == f5 ? 0 : (f9 > f5 ? 1 : -1);
                                                                                                                            if (n3 == 0) {
                                                                                                                                object3 = trackEntityView.selectedEntity;
                                                                                                                                f3 = ((Entity)object3).getRight() + f6;
                                                                                                                                ((Entity)object3).setLastRight(f3);
                                                                                                                            } else {
                                                                                                                                object4 = trackEntityView.selectedEntity;
                                                                                                                                object3 = ((Entity)object4).getRect();
                                                                                                                                f4 = ((RectF)object3).right;
                                                                                                                                ((Entity)object4).setLastRight(f4);
                                                                                                                            }
                                                                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                                                                            object3 = trackEntityView.autoScrollRunnable;
                                                                                                                            object4.removeCallbacks((Runnable)object3);
                                                                                                                            trackEntityView.isAutoScroll = false;
                                                                                                                        }
                                                                                                                        if ((n3 = (object4 = trackEntityView.selectedEntity) instanceof EntityQuranTimeline) == 0) break block238;
                                                                                                                        n3 = ((Entity)(object4 = (EntityQuranTimeline)object4)).getIndex();
                                                                                                                        if (n3 >= (n8 = (list2 = trackEntityView.entityListQuran).size())) break block239;
                                                                                                                        object3 = trackEntityView.entityListQuran;
                                                                                                                        n8 = ((Entity)object4).getIndex() + n;
                                                                                                                        if ((object3 = trackEntityView.getPreviewOrNextEntityQuran((List)object3, n8, n != 0)) == null) break block239;
                                                                                                                        RectF rectF = ((EntityQuranTimeline)object3).getRect();
                                                                                                                        f3 = rectF.left;
                                                                                                                        float f96 = f2 - f3;
                                                                                                                        n8 = f96 == 0.0f ? 0 : (f96 > 0.0f ? 1 : -1);
                                                                                                                        if (n8 <= 0) break block239;
                                                                                                                        object = ((EntityQuranTimeline)object3).getRect();
                                                                                                                        float f97 = object.width() + f2;
                                                                                                                        RectF rectF21 = ((EntityQuranTimeline)object3).getRect();
                                                                                                                        f5 = rectF21.left;
                                                                                                                        f5 = f2 - f5;
                                                                                                                        ((Entity)object3).setCurrentRect();
                                                                                                                        ((EntityQuranTimeline)object3).setX(f2);
                                                                                                                        ((EntityQuranTimeline)object3).setRight(f97);
                                                                                                                        n6 = ((Entity)object4).getIndex();
                                                                                                                        n4 = 2;
                                                                                                                        f6 = 2.8E-45f;
                                                                                                                        n6 += n4;
                                                                                                                        break block240;
                                                                                                                    }
                                                                                                                    if (f8 == false) break block238;
                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                    f6 = ((RectF)object4).right;
                                                                                                                    float f98 = f6 - f2;
                                                                                                                    n4 = f98 == 0.0f ? 0 : (f98 < 0.0f ? -1 : 1);
                                                                                                                    if (n4 >= 0) break block241;
                                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                    f6 = ((RectF)object4).right;
                                                                                                                    f4 = this.getCurrentPosition();
                                                                                                                    float f99 = (f6 += f4) - (f4 = trackEntityView.DETECT_RIGHT_MOVE);
                                                                                                                    n4 = f99 == 0.0f ? 0 : (f99 > 0.0f ? 1 : -1);
                                                                                                                    if (n4 <= 0) break block242;
                                                                                                                    n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                                    if (n4 == 0) {
                                                                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                        f6 = ((RectF)object4).right;
                                                                                                                        float f100 = f2 - f6;
                                                                                                                        n4 = f100 == 0.0f ? 0 : (f100 > 0.0f ? 1 : -1);
                                                                                                                        if (n4 > 0) {
                                                                                                                            f6 = trackEntityView.SPEED;
                                                                                                                            n3 = 0;
                                                                                                                            f4 = 0.0f;
                                                                                                                            object3 = null;
                                                                                                                            float f101 = f6 - 0.0f;
                                                                                                                            n8 = f101 == 0.0f ? 0 : (f101 < 0.0f ? -1 : 1);
                                                                                                                            if (n8 < 0) {
                                                                                                                                trackEntityView.SPEED = f6 *= f5;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            n3 = 0;
                                                                                                                            f4 = 0.0f;
                                                                                                                            object3 = null;
                                                                                                                            f6 = trackEntityView.SPEED;
                                                                                                                            float f102 = f6 - 0.0f;
                                                                                                                            n8 = f102 == 0.0f ? 0 : (f102 > 0.0f ? 1 : -1);
                                                                                                                            if (n8 > 0) {
                                                                                                                                trackEntityView.SPEED = f6 *= f5;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        trackEntityView.isAutoScroll = n;
                                                                                                                        trackEntityView.time_start = l = System.currentTimeMillis();
                                                                                                                        object4 = trackEntityView.autoScrollHandler;
                                                                                                                        object3 = trackEntityView.autoScrollRunnable;
                                                                                                                        l2 = 100;
                                                                                                                        object4.postDelayed((Runnable)object3, l2);
                                                                                                                        break block238;
                                                                                                                    } else {
                                                                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                                                                        f6 = ((RectF)object4).right;
                                                                                                                        float f103 = f2 - f6;
                                                                                                                        n4 = f103 == 0.0f ? 0 : (f103 < 0.0f ? -1 : 1);
                                                                                                                        if (n4 < 0 && (n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                                                            trackEntityView.isAutoScroll = false;
                                                                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                                                                            object3 = trackEntityView.autoScrollRunnable;
                                                                                                                            object4.removeCallbacks((Runnable)object3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break block238;
                                                                                                                }
                                                                                                                n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                                if (n4 != 0) {
                                                                                                                    trackEntityView.isAutoScroll = false;
                                                                                                                    object4 = trackEntityView.autoScrollHandler;
                                                                                                                    object3 = trackEntityView.autoScrollRunnable;
                                                                                                                    object4.removeCallbacks((Runnable)object3);
                                                                                                                }
                                                                                                                break block238;
                                                                                                            }
                                                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                                                            f6 = ((RectF)object4).right;
                                                                                                            n3 = 0;
                                                                                                            f4 = 0.0f;
                                                                                                            object3 = null;
                                                                                                            float f104 = f6 - 0.0f;
                                                                                                            n4 = f104 == 0.0f ? 0 : (f104 > 0.0f ? 1 : -1);
                                                                                                            if (n4 <= 0) break block243;
                                                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                                                            f6 = ((RectF)object4).right;
                                                                                                            f4 = this.getCurrentPosition();
                                                                                                            float f105 = (f6 += f4) - (f4 = -trackEntityView.DETECT_LEFT_MOVE);
                                                                                                            n4 = f105 == 0.0f ? 0 : (f105 < 0.0f ? -1 : 1);
                                                                                                            if (n4 >= 0) break block243;
                                                                                                            n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                            if (n4 == 0) {
                                                                                                                f6 = trackEntityView.SPEED;
                                                                                                                n3 = 0;
                                                                                                                f4 = 0.0f;
                                                                                                                object3 = null;
                                                                                                                float f106 = f6 - 0.0f;
                                                                                                                n8 = f106 == 0.0f ? 0 : (f106 < 0.0f ? -1 : 1);
                                                                                                                if (n8 < 0) {
                                                                                                                    trackEntityView.SPEED = f6 *= f5;
                                                                                                                }
                                                                                                                trackEntityView.isAutoScroll = n;
                                                                                                                trackEntityView.time_start = l = System.currentTimeMillis();
                                                                                                                object4 = trackEntityView.autoScrollHandler;
                                                                                                                object3 = trackEntityView.autoScrollRunnable;
                                                                                                                l2 = 100;
                                                                                                                object4.postDelayed((Runnable)object3, l2);
                                                                                                                break block238;
                                                                                                            } else {
                                                                                                                f6 = trackEntityView.SPEED;
                                                                                                                n3 = 0;
                                                                                                                f4 = 0.0f;
                                                                                                                object3 = null;
                                                                                                                float f107 = f6 - 0.0f;
                                                                                                                n8 = f107 == 0.0f ? 0 : (f107 > 0.0f ? 1 : -1);
                                                                                                                if (n8 > 0) {
                                                                                                                    trackEntityView.SPEED = f6 *= f5;
                                                                                                                }
                                                                                                            }
                                                                                                            break block238;
                                                                                                        }
                                                                                                        if ((n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                                            trackEntityView.isAutoScroll = false;
                                                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                                                            object3 = trackEntityView.autoScrollRunnable;
                                                                                                            object4.removeCallbacks((Runnable)object3);
                                                                                                        }
                                                                                                    }
                                                                                                    if ((n3 = (object4 = trackEntityView.selectedEntity) instanceof EntityTrslTimeline) == 0) break block244;
                                                                                                    n3 = ((Entity)(object4 = (EntityTrslTimeline)object4)).getIndex();
                                                                                                    if (n3 >= (n8 = (list = trackEntityView.entityListTrslQuran).size())) break block245;
                                                                                                    object3 = trackEntityView.entityListTrslQuran;
                                                                                                    n8 = ((Entity)object4).getIndex() + n;
                                                                                                    if ((object3 = trackEntityView.getPreviewOrNextEntityTrslQuran((List)object3, n8, n != 0)) == null) break block245;
                                                                                                    RectF rectF = ((EntityTrslTimeline)object3).getRect();
                                                                                                    f3 = rectF.left;
                                                                                                    float f108 = f2 - f3;
                                                                                                    n8 = f108 == 0.0f ? 0 : (f108 > 0.0f ? 1 : -1);
                                                                                                    if (n8 <= 0) break block245;
                                                                                                    object = ((EntityTrslTimeline)object3).getRect();
                                                                                                    float f109 = object.width() + f2;
                                                                                                    RectF rectF22 = ((EntityTrslTimeline)object3).getRect();
                                                                                                    f5 = rectF22.left;
                                                                                                    f5 = f2 - f5;
                                                                                                    ((Entity)object3).setCurrentRect();
                                                                                                    ((EntityTrslTimeline)object3).setX(f2);
                                                                                                    ((EntityTrslTimeline)object3).setRight(f109);
                                                                                                    n5 = ((Entity)object4).getIndex();
                                                                                                    n4 = 2;
                                                                                                    f6 = 2.8E-45f;
                                                                                                    n5 += n4;
                                                                                                    break block246;
                                                                                                }
                                                                                                if (f8 == false) break block244;
                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                f6 = ((RectF)object4).right;
                                                                                                float f110 = f6 - f2;
                                                                                                n4 = f110 == 0.0f ? 0 : (f110 < 0.0f ? -1 : 1);
                                                                                                if (n4 >= 0) break block247;
                                                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                                                f6 = ((RectF)object4).right;
                                                                                                f4 = this.getCurrentPosition();
                                                                                                float f111 = (f6 += f4) - (f4 = trackEntityView.DETECT_RIGHT_MOVE);
                                                                                                n4 = f111 == 0.0f ? 0 : (f111 > 0.0f ? 1 : -1);
                                                                                                if (n4 <= 0) break block248;
                                                                                                n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                                if (n4 == 0) {
                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                    f6 = ((RectF)object4).right;
                                                                                                    float f112 = f2 - f6;
                                                                                                    n4 = f112 == 0.0f ? 0 : (f112 > 0.0f ? 1 : -1);
                                                                                                    if (n4 > 0) {
                                                                                                        f6 = trackEntityView.SPEED;
                                                                                                        n3 = 0;
                                                                                                        f4 = 0.0f;
                                                                                                        object3 = null;
                                                                                                        float f113 = f6 - 0.0f;
                                                                                                        n8 = f113 == 0.0f ? 0 : (f113 < 0.0f ? -1 : 1);
                                                                                                        if (n8 < 0) {
                                                                                                            trackEntityView.SPEED = f6 *= f5;
                                                                                                        }
                                                                                                    } else {
                                                                                                        n3 = 0;
                                                                                                        f4 = 0.0f;
                                                                                                        object3 = null;
                                                                                                        f6 = trackEntityView.SPEED;
                                                                                                        float f114 = f6 - 0.0f;
                                                                                                        n8 = f114 == 0.0f ? 0 : (f114 > 0.0f ? 1 : -1);
                                                                                                        if (n8 > 0) {
                                                                                                            trackEntityView.SPEED = f6 *= f5;
                                                                                                        }
                                                                                                    }
                                                                                                    trackEntityView.isAutoScroll = n;
                                                                                                    trackEntityView.time_start = l = System.currentTimeMillis();
                                                                                                    object4 = trackEntityView.autoScrollHandler;
                                                                                                    object3 = trackEntityView.autoScrollRunnable;
                                                                                                    l2 = 100;
                                                                                                    object4.postDelayed((Runnable)object3, l2);
                                                                                                    break block244;
                                                                                                } else {
                                                                                                    object4 = trackEntityView.selectedEntity.getRect();
                                                                                                    f6 = ((RectF)object4).right;
                                                                                                    float f115 = f2 - f6;
                                                                                                    n4 = f115 == 0.0f ? 0 : (f115 < 0.0f ? -1 : 1);
                                                                                                    if (n4 < 0 && (n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                                        trackEntityView.isAutoScroll = false;
                                                                                                        object4 = trackEntityView.autoScrollHandler;
                                                                                                        object3 = trackEntityView.autoScrollRunnable;
                                                                                                        object4.removeCallbacks((Runnable)object3);
                                                                                                    }
                                                                                                }
                                                                                                break block244;
                                                                                            }
                                                                                            n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                                            if (n4 != 0) {
                                                                                                trackEntityView.isAutoScroll = false;
                                                                                                object4 = trackEntityView.autoScrollHandler;
                                                                                                object3 = trackEntityView.autoScrollRunnable;
                                                                                                object4.removeCallbacks((Runnable)object3);
                                                                                            }
                                                                                            break block244;
                                                                                        }
                                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                                        f6 = ((RectF)object4).right;
                                                                                        n3 = 0;
                                                                                        f4 = 0.0f;
                                                                                        object3 = null;
                                                                                        float f116 = f6 - 0.0f;
                                                                                        n4 = f116 == 0.0f ? 0 : (f116 > 0.0f ? 1 : -1);
                                                                                        if (n4 <= 0) break block249;
                                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                                        f6 = ((RectF)object4).right;
                                                                                        f4 = this.getCurrentPosition();
                                                                                        float f117 = (f6 += f4) - (f4 = -trackEntityView.DETECT_LEFT_MOVE);
                                                                                        n4 = f117 == 0.0f ? 0 : (f117 < 0.0f ? -1 : 1);
                                                                                        if (n4 >= 0) break block249;
                                                                                        n4 = trackEntityView.isAutoScroll;
                                                                                        if (n4 == 0) {
                                                                                            f6 = trackEntityView.SPEED;
                                                                                            n3 = 0;
                                                                                            f4 = 0.0f;
                                                                                            object3 = null;
                                                                                            float f118 = f6 - 0.0f;
                                                                                            n8 = f118 == 0.0f ? 0 : (f118 < 0.0f ? -1 : 1);
                                                                                            if (n8 < 0) {
                                                                                                trackEntityView.SPEED = f6 *= f5;
                                                                                            }
                                                                                            trackEntityView.isAutoScroll = n;
                                                                                            trackEntityView.time_start = l = System.currentTimeMillis();
                                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                                            object3 = trackEntityView.autoScrollRunnable;
                                                                                            l2 = 100;
                                                                                            object4.postDelayed((Runnable)object3, l2);
                                                                                            break block244;
                                                                                        } else {
                                                                                            f6 = trackEntityView.SPEED;
                                                                                            n3 = 0;
                                                                                            f4 = 0.0f;
                                                                                            object3 = null;
                                                                                            float f119 = f6 - 0.0f;
                                                                                            n8 = f119 == 0.0f ? 0 : (f119 > 0.0f ? 1 : -1);
                                                                                            if (n8 > 0) {
                                                                                                trackEntityView.SPEED = f6 *= f5;
                                                                                            }
                                                                                        }
                                                                                        break block244;
                                                                                    }
                                                                                    if ((n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                        trackEntityView.isAutoScroll = false;
                                                                                        object4 = trackEntityView.autoScrollHandler;
                                                                                        object3 = trackEntityView.autoScrollRunnable;
                                                                                        object4.removeCallbacks((Runnable)object3);
                                                                                    }
                                                                                }
                                                                                if ((n3 = (object4 = trackEntityView.selectedEntity) instanceof EntityBismilahTimeline) == 0) break block250;
                                                                                object3 = trackEntityView.mIsi3adaTimeline;
                                                                                if ((object4 = (EntityBismilahTimeline)object4) != object3 || (n3 = (int)(trackEntityView.isExist((EntityBismilahTimeline)(object3 = trackEntityView.bismilahTimeline)) ? 1 : 0)) == 0) break block251;
                                                                                object3 = trackEntityView.bismilahTimeline.getRect();
                                                                                f4 = ((RectF)object3).left;
                                                                                float f120 = f2 - f4;
                                                                                n3 = f120 == 0.0f ? 0 : (f120 > 0.0f ? 1 : -1);
                                                                                if (n3 >= 0) break block252;
                                                                            }
                                                                            object3 = trackEntityView.entityListQuran;
                                                                            n8 = ((Entity)object4).getIndex();
                                                                            if ((object3 = trackEntityView.getPreviewOrNextEntityQuran((List)object3, n8, n != 0)) == null) break block253;
                                                                            RectF rectF = ((EntityQuranTimeline)object3).getRect();
                                                                            f3 = rectF.left;
                                                                            float f121 = f2 - f3;
                                                                            n8 = f121 == 0.0f ? 0 : (f121 > 0.0f ? 1 : -1);
                                                                            if (n8 >= 0) break block254;
                                                                        }
                                                                        if (f8 == false) break block250;
                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                        f6 = ((RectF)object4).right;
                                                                        float f122 = f6 - f2;
                                                                        n4 = f122 == 0.0f ? 0 : (f122 < 0.0f ? -1 : 1);
                                                                        if (n4 >= 0) break block255;
                                                                        object4 = trackEntityView.selectedEntity.getRect();
                                                                        f6 = ((RectF)object4).right;
                                                                        f4 = this.getCurrentPosition();
                                                                        float f123 = (f6 += f4) - (f4 = trackEntityView.DETECT_RIGHT_MOVE);
                                                                        n4 = f123 == 0.0f ? 0 : (f123 > 0.0f ? 1 : -1);
                                                                        if (n4 <= 0) break block256;
                                                                        n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                        if (n4 == 0) {
                                                                            long l13;
                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                            f6 = ((RectF)object4).right;
                                                                            float f124 = f2 - f6;
                                                                            n4 = f124 == 0.0f ? 0 : (f124 > 0.0f ? 1 : -1);
                                                                            if (n4 > 0) {
                                                                                f6 = trackEntityView.SPEED;
                                                                                f4 = 0.0f;
                                                                                object3 = null;
                                                                                float f125 = f6 - 0.0f;
                                                                                n3 = f125 == 0.0f ? 0 : (f125 < 0.0f ? -1 : 1);
                                                                                if (n3 < 0) {
                                                                                    trackEntityView.SPEED = f6 *= f5;
                                                                                }
                                                                            } else {
                                                                                f4 = 0.0f;
                                                                                object3 = null;
                                                                                f6 = trackEntityView.SPEED;
                                                                                float f126 = f6 - 0.0f;
                                                                                n3 = f126 == 0.0f ? 0 : (f126 > 0.0f ? 1 : -1);
                                                                                if (n3 > 0) {
                                                                                    trackEntityView.SPEED = f6 *= f5;
                                                                                }
                                                                            }
                                                                            trackEntityView.isAutoScroll = n;
                                                                            trackEntityView.time_start = l13 = System.currentTimeMillis();
                                                                            object4 = trackEntityView.autoScrollHandler;
                                                                            Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                            l = 100;
                                                                            object4.postDelayed(runnable, l);
                                                                            break block250;
                                                                        } else {
                                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                                            f6 = ((RectF)object4).right;
                                                                            float f127 = f2 - f6;
                                                                            n4 = f127 == 0.0f ? 0 : (f127 < 0.0f ? -1 : 1);
                                                                            if (n4 < 0 && (n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                                trackEntityView.isAutoScroll = false;
                                                                                object4 = trackEntityView.autoScrollHandler;
                                                                                Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                                object4.removeCallbacks(runnable);
                                                                            }
                                                                        }
                                                                        break block250;
                                                                    }
                                                                    n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                    if (n4 != 0) {
                                                                        trackEntityView.isAutoScroll = false;
                                                                        object4 = trackEntityView.autoScrollHandler;
                                                                        Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                        object4.removeCallbacks(runnable);
                                                                    }
                                                                    break block250;
                                                                }
                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                f6 = ((RectF)object4).right;
                                                                n3 = 0;
                                                                f4 = 0.0f;
                                                                object3 = null;
                                                                float f128 = f6 - 0.0f;
                                                                n4 = f128 == 0.0f ? 0 : (f128 > 0.0f ? 1 : -1);
                                                                if (n4 <= 0) break block257;
                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                f6 = ((RectF)object4).right;
                                                                f4 = this.getCurrentPosition();
                                                                float f129 = (f6 += f4) - (f4 = -trackEntityView.DETECT_LEFT_MOVE);
                                                                n4 = f129 == 0.0f ? 0 : (f129 < 0.0f ? -1 : 1);
                                                                if (n4 >= 0) break block257;
                                                                n4 = trackEntityView.isAutoScroll ? 1 : 0;
                                                                if (n4 == 0) {
                                                                    long l14;
                                                                    f6 = trackEntityView.SPEED;
                                                                    f4 = 0.0f;
                                                                    object3 = null;
                                                                    float f130 = f6 - 0.0f;
                                                                    n3 = f130 == 0.0f ? 0 : (f130 < 0.0f ? -1 : 1);
                                                                    if (n3 < 0) {
                                                                        trackEntityView.SPEED = f6 *= f5;
                                                                    }
                                                                    trackEntityView.isAutoScroll = n;
                                                                    trackEntityView.time_start = l14 = System.currentTimeMillis();
                                                                    object4 = trackEntityView.autoScrollHandler;
                                                                    Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                    l = 100;
                                                                    object4.postDelayed(runnable, l);
                                                                    break block250;
                                                                } else {
                                                                    f6 = trackEntityView.SPEED;
                                                                    f4 = 0.0f;
                                                                    object3 = null;
                                                                    float f131 = f6 - 0.0f;
                                                                    n3 = f131 == 0.0f ? 0 : (f131 > 0.0f ? 1 : -1);
                                                                    if (n3 > 0) {
                                                                        trackEntityView.SPEED = f6 *= f5;
                                                                    }
                                                                }
                                                                break block250;
                                                            }
                                                            if ((n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) != 0) {
                                                                trackEntityView.isAutoScroll = false;
                                                                object4 = trackEntityView.autoScrollHandler;
                                                                Runnable runnable = trackEntityView.autoScrollRunnable;
                                                                object4.removeCallbacks(runnable);
                                                            }
                                                        }
                                                        if ((n4 = (int)(trackEntityView.isAutoScroll ? 1 : 0)) == 0) {
                                                            object4 = trackEntityView.selectedEntity.getRect();
                                                            f6 = ((RectF)object4).right;
                                                            float f132 = f2 - f6;
                                                            n4 = f132 == 0.0f ? 0 : (f132 > 0.0f ? 1 : -1);
                                                            if (n4 > 0) {
                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                f5 = trackEntityView.TOLERANCE_X;
                                                                ((RectF)object4).right = f2 += f5;
                                                            } else {
                                                                object4 = trackEntityView.selectedEntity.getRect();
                                                                f5 = trackEntityView.TOLERANCE_X;
                                                                ((RectF)object4).right = f2 -= f5;
                                                            }
                                                        }
                                                        object4 = trackEntityView.paintCursur;
                                                        f6 = object4.getStrokeWidth() * 0.3f;
                                                        RectF rectF = trackEntityView.selectedEntity.getRect();
                                                        f5 = rectF.right;
                                                        f4 = trackEntityView.startXLine - f6;
                                                        float f133 = f5 - f4;
                                                        n2 = f133 == 0.0f ? 0 : (f133 < 0.0f ? -1 : 1);
                                                        if (n2 < 0) break block258;
                                                        RectF rectF23 = trackEntityView.selectedEntity.getRect();
                                                        f5 = rectF23.right;
                                                        f4 = trackEntityView.startXLine + f6;
                                                        float f134 = f5 - f4;
                                                        n4 = f134 == 0.0f ? 0 : (f134 > 0.0f ? 1 : -1);
                                                        if (n4 <= 0) break block259;
                                                    }
                                                    n7 = n;
                                                    f7 = f;
                                                }
                                                trackEntityView.pass = n7;
                                                this.invalidate();
                                                return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
                                            }
                                            while (true) {
                                                if (n6 >= (n4 = (object4 = trackEntityView.entityListQuran).size())) {
                                                    trackEntityView.pass = false;
                                                    trackEntityView.selectedEntity.getRect().right = f2;
                                                    this.invalidate();
                                                    return n != 0;
                                                }
                                                object4 = (Entity)trackEntityView.entityListQuran.get(n6);
                                                n3 = ((Entity)object4).visible() ? 1 : 0;
                                                if (n3 != 0) {
                                                    object3 = ((Entity)object4).getRect();
                                                    f4 = ((RectF)object3).left + f5;
                                                    RectF rectF = ((Entity)object4).getRect();
                                                    f3 = rectF.width() + f4;
                                                    ((Entity)object4).setCurrentRect();
                                                    ((Entity)object4).setX(f4);
                                                    ((Entity)object4).setRight(f3);
                                                }
                                                ++n6;
                                            }
                                        }
                                        while (true) {
                                            if (n5 >= (n4 = (object4 = trackEntityView.entityListTrslQuran).size())) {
                                                trackEntityView.pass = false;
                                                trackEntityView.selectedEntity.getRect().right = f2;
                                                this.invalidate();
                                                return n != 0;
                                            }
                                            object4 = (Entity)trackEntityView.entityListTrslQuran.get(n5);
                                            n3 = ((Entity)object4).visible();
                                            if (n3 != 0) {
                                                object3 = ((Entity)object4).getRect();
                                                f4 = ((RectF)object3).left + f5;
                                                RectF rectF = ((Entity)object4).getRect();
                                                f3 = rectF.width() + f4;
                                                ((Entity)object4).setCurrentRect();
                                                ((Entity)object4).setX(f4);
                                                ((Entity)object4).setRight(f3);
                                            }
                                            ++n5;
                                        }
                                    }
                                    object = trackEntityView.bismilahTimeline.getRect();
                                    float f135 = ((RectF)object).left;
                                    f135 = f2 - f135;
                                    f6 = trackEntityView.bismilahTimeline.getRect().width() + f2;
                                    trackEntityView.bismilahTimeline.setCurrentRect();
                                    trackEntityView.bismilahTimeline.setX(f2);
                                    EntityBismilahTimeline entityBismilahTimeline = trackEntityView.bismilahTimeline;
                                    entityBismilahTimeline.setRight(f6);
                                    object4 = trackEntityView.bismilahTimeline;
                                    n4 = ((Entity)object4).getIndex();
                                    while (true) {
                                        List list;
                                        if (n4 >= (n2 = (list = trackEntityView.entityListQuran).size())) {
                                            trackEntityView.pass = false;
                                            trackEntityView.selectedEntity.getRect().right = f2;
                                            this.invalidate();
                                            return n != 0;
                                        }
                                        Entity entity = (Entity)trackEntityView.entityListQuran.get(n4);
                                        n3 = entity.visible() ? 1 : 0;
                                        if (n3 != 0) {
                                            object3 = entity.getRect();
                                            f4 = ((RectF)object3).left + f135;
                                            RectF rectF = entity.getRect();
                                            f3 = rectF.width() + f4;
                                            entity.setCurrentRect();
                                            entity.setX(f4);
                                            entity.setRight(f3);
                                        }
                                        ++n4;
                                    }
                                }
                                object = ((EntityQuranTimeline)object3).getRect();
                                float f136 = ((RectF)object).left;
                                f136 = f2 - f136;
                                RectF rectF = ((EntityQuranTimeline)object3).getRect();
                                f5 = rectF.width() + f2;
                                ((Entity)object3).setCurrentRect();
                                ((EntityQuranTimeline)object3).setX(f2);
                                ((EntityQuranTimeline)object3).setRight(f5);
                                n4 = ((Entity)object4).getIndex() + n;
                                while (true) {
                                    List list;
                                    if (n4 >= (n2 = (list = trackEntityView.entityListQuran).size())) {
                                        trackEntityView.pass = false;
                                        trackEntityView.selectedEntity.getRect().right = f2;
                                        this.invalidate();
                                        return n != 0;
                                    }
                                    Entity entity = (Entity)trackEntityView.entityListQuran.get(n4);
                                    n3 = entity.visible() ? 1 : 0;
                                    if (n3 != 0) {
                                        object3 = entity.getRect();
                                        f4 = ((RectF)object3).left + f136;
                                        RectF rectF24 = entity.getRect();
                                        f3 = rectF24.width() + f4;
                                        entity.setCurrentRect();
                                        entity.setX(f4);
                                        entity.setRight(f3);
                                    }
                                    ++n4;
                                }
                            }
                            while ((n = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                                Entity entity;
                                StackEntity stackEntity;
                                EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)object2.next();
                                n2 = entityQuranTimeline.visible() ? 1 : 0;
                                if (n2 == 0 || (stackEntity = entityQuranTimeline.getCurrentStackEntity()) == null || entityQuranTimeline == (entity = trackEntityView.selectedEntity)) continue;
                                entityQuranTimeline.onChange();
                                Stack stack = trackEntityView.entityList;
                                EntityAction entityAction = EntityAction.MOVE;
                                object3 = new Pair((Object)entityQuranTimeline, (Object)entityAction);
                                stack.push(object3);
                            }
                            break block230;
                        }
                        while ((n = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                            Entity entity;
                            StackEntity stackEntity;
                            EntityAudio entityAudio = (EntityAudio)object2.next();
                            n2 = entityAudio.visible() ? 1 : 0;
                            if (n2 == 0 || (stackEntity = entityAudio.getCurrentStackEntity()) == null || entityAudio == (entity = trackEntityView.selectedEntity)) continue;
                            entityAudio.onChange();
                            Stack stack = trackEntityView.entityList;
                            EntityAction entityAction = EntityAction.MOVE;
                            object3 = new Pair((Object)entityAudio, (Object)entityAction);
                            stack.push(object3);
                        }
                    }
                    trackEntityView.selectedEntity.onChange();
                    object2 = trackEntityView.entityList;
                    Entity entity = trackEntityView.selectedEntity;
                    object3 = EntityAction.TRIM;
                    Pair pair = new Pair((Object)entity, object3);
                    ((Stack)object2).push(pair);
                    object2 = trackEntityView.iTrimLineCallback;
                    if (object2 != null) {
                        EntityAction entityAction = EntityAction.TRIM;
                        object2.onAddStack(entityAction);
                    }
                    object2 = trackEntityView.selectedEntity;
                    ((Entity)object2).onUpRight();
                }
                object2 = trackEntityView.selectedEntity;
                ((Entity)object2).resetTrim_type();
                this.invalidate();
            }
            object2 = trackEntityView.selectedEntity;
            f = ((Entity)object2).getRect().left;
            ((Entity)object2).setX(f);
            object2 = trackEntityView.selectedEntity;
            RectF rectF = ((Entity)object2).getRect();
            f = rectF.right;
            ((Entity)object2).setRight(f);
            object2 = trackEntityView.iTrimLineCallback;
            if (object2 != null && (n = (int)(trackEntityView.isMove ? 1 : 0)) == 0) {
                object2.onUpdateTime();
            }
            trackEntityView.isMove = false;
            trackEntityView$ITrimLineCallback = trackEntityView.autoScrollHandler;
            object2 = trackEntityView.autoMoveRunnable;
            trackEntityView$ITrimLineCallback.removeCallbacks((Runnable)object2);
            trackEntityView$ITrimLineCallback = trackEntityView.autoScrollHandler;
            object2 = trackEntityView.autoScrollRunnable;
            trackEntityView$ITrimLineCallback.removeCallbacks((Runnable)object2);
        }
        if ((trackEntityView$ITrimLineCallback = trackEntityView.iTrimLineCallback) == null) return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
        trackEntityView$ITrimLineCallback.onUp();
        return trackEntityView.gestureDetector.onTouchEvent((MotionEvent)object);
    }

    public void onWindowSystemUiVisibilityChanged(int n) {
        super.onWindowSystemUiVisibilityChanged(n);
        this.updateGestureExclusion();
    }

    public void pauseScroll() {
        boolean bl;
        Scroller scroller = this.scroller;
        if (scroller != null && !(bl = scroller.isFinished())) {
            scroller = this.scroller;
            scroller.abortAnimation();
        }
    }

    public void previewEntity(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        float f = entity.getRect().left;
        float f2 = this.getSecond_in_screen();
        this.current_cursur_position = n = Math.round(f / f2) * 1000;
        f = -n;
        f2 = this.getSecond_in_screen();
        f *= f2;
        f2 = 1000.0f;
        this.currentPosition = f /= f2;
        float f3 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f3;
        f = entity.getRect().right;
        f3 = this.getSecond_in_screen();
        this.maxTime = n = (int)(f / f3 * f2);
        float f4 = entity.getRect().right;
        f = this.scaleFactor;
        this.timeLineW = f4 /= f;
    }

    /*
     * Exception decompiling
     */
    public void redo() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [72[UNCONDITIONALDOLOOP]], but top level block is 42[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void selectEntity(Entity entity, boolean bl) {
        Entity entity2 = this.selectedEntity;
        if (entity2 != null) {
            entity2.setSelect(false);
        }
        if (entity != null) {
            boolean bl2 = true;
            entity.setSelect(bl2);
        }
        this.selectedEntity = entity;
        if (bl) {
            this.invalidate();
        }
    }

    public void setBismilahTimeline(EntityBismilahTimeline entityBismilahTimeline) {
        this.bismilahTimeline = entityBismilahTimeline;
    }

    public void setCurrent_cursur_position(int n) {
        this.current_cursur_position = n;
    }

    public void setDuration(int n) {
        this.duration = n;
    }

    public void setFlingY(float f) {
        this.target = f;
        int n = 0;
        float f2 = 0.0f;
        float f3 = f - 0.0f;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        float f5 = 100.0f;
        if (f4 <= 0) {
            f = this.y;
            f2 = this.mScrollY;
            n = this.getHeight();
            float f6 = (f += f2) - (f2 = (float)n);
            float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (f7 >= 0) {
                f = this.mScrollY;
                f2 = this.target / f5;
                this.mScrollY = f += f2;
                f2 = this.y + f;
                float f8 = f2 - (f = (float)this.getHeight());
                f7 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (f7 < 0) {
                    f7 = this.getHeight();
                    f = f7;
                    f2 = this.y;
                    this.mScrollY = f -= f2;
                }
                this.invalidate();
            }
            return;
        }
        float f9 = this.mScrollY;
        float f10 = f9 - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (f11 < 0) {
            this.mScrollY = f9 += (f /= f5);
            float f12 = f9 - 0.0f;
            float f13 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (f13 > 0) {
                this.mScrollY = 0.0f;
            }
            this.invalidate();
        }
    }

    public void setMaxTime(int n) {
        this.maxTime = n;
        float f = n;
        float f2 = this.getSecond_in_screen();
        this.timeLineW = f = f * f2 / 1000.0f;
    }

    public void setOnProgress(boolean bl) {
        this.isProgress = bl;
    }

    public void setPlaying(boolean bl) {
        this.isPlaying = bl;
    }

    public void setPosCursur(int n) {
        this.current_cursur_position = n;
        float f = -n;
        float f2 = this.second_in_screen;
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void setRedoUndo(ImageButton imageButton, ImageButton imageButton2) {
        this.btn_redo = imageButton;
        this.btn_undo = imageButton2;
    }

    public void setScaleFactor(float f) {
        this.scaleFactor = f;
        float f2 = this.currentPosition;
        this.scrolled_with_zoom = f *= f2;
    }

    public void setSecond_in_screen(float f) {
        float f2;
        this.second_in_screen = f;
        this.dx = f2 = 0.03f * f;
        this.max_trim = f *= 0.2f;
    }

    public void setSecond_in_screen(float f, int n, int n2) {
        float f2;
        this.second_in_screen = f;
        this.duration = n;
        this.width_screen = n2;
        this.dx = f2 = 0.03f * f;
        this.TOLERANCE_X = f2;
        this.max_trim = f *= 0.2f;
    }

    public void setiTrimLineCallback(TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback) {
        this.iTrimLineCallback = trackEntityView$ITrimLineCallback;
    }

    public void setmIsi3adaTimeline(EntityBismilahTimeline entityBismilahTimeline) {
        this.mIsi3adaTimeline = entityBismilahTimeline;
    }

    public void splitAudio(EntityAudio entityAudio, int n) {
        List list = this.entityListAudio;
        int n2 = list.size();
        if (n < n2) {
            list = this.entityListAudio;
            list.add(n, entityAudio);
        } else {
            List list2 = this.entityListAudio;
            list2.add(entityAudio);
        }
        this.selectEntity(entityAudio, false);
    }

    public void stackSplit(Entity object) {
        Object object2 = this.entityList;
        EntityAction entityAction = EntityAction.SPLIT;
        Pair pair = new Pair(object, (Object)entityAction);
        object2.push(pair);
        object = this.iTrimLineCallback;
        if (object != null) {
            object2 = EntityAction.SPLIT;
            object.onAddStack((EntityAction)((Object)object2));
        }
    }

    public void translateEndNow() {
        Object object = this.selectedEntity;
        int n = object instanceof EntityQuranTimeline;
        int n2 = 1;
        float f = Float.MIN_VALUE;
        if (n != 0) {
            Object object2;
            Object object3;
            int n3;
            n = ((Entity)(object = (EntityQuranTimeline)object)).getIndex() + n2;
            if (n < (n3 = (object3 = this.entityListQuran).size())) {
                object2 = this.entityListQuran;
                n3 = ((Entity)object).getIndex() + n2;
                if ((object2 = this.getPreviewOrNextEntityQuran((List)object2, n3, n2 != 0)) != null) {
                    ((Entity)object).setCurrentRect();
                    float f2 = ((EntityQuranTimeline)object2).getRect().left;
                    ((EntityQuranTimeline)object).setRight(f2);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    Entity entity = this.selectedEntity;
                    object3 = EntityAction.TRIM;
                    object2 = new Pair((Object)entity, object3);
                    ((Stack)object).push(object2);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object2 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object2));
                    }
                    return;
                }
            }
            ((Entity)object).setCurrentRect();
            object = this.getSelectedEntity();
            float f3 = this.getTimeLineW();
            f = this.getScaleFactor();
            ((Entity)object).setRight(f3 *= f);
            this.invalidate();
            this.selectedEntity.onChange();
            object = this.entityList;
            Entity entity = this.selectedEntity;
            object3 = EntityAction.TRIM;
            object2 = new Pair((Object)entity, object3);
            ((Stack)object).push(object2);
            object = this.iTrimLineCallback;
            if (object != null) {
                object2 = EntityAction.TRIM;
                object.onAddStack((EntityAction)((Object)object2));
            }
        } else {
            n = object instanceof EntityBismilahTimeline;
            if (n != 0) {
                Object object4;
                int n4;
                Object object5 = this.mIsi3adaTimeline;
                if ((object = (EntityBismilahTimeline)object) == object5 && (n = (int)(this.isExist((EntityBismilahTimeline)(object5 = this.bismilahTimeline)) ? 1 : 0)) != 0) {
                    ((Entity)object).setCurrentRect();
                    float f4 = this.bismilahTimeline.getRect().left;
                    ((EntityBismilahTimeline)object).setRight(f4);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    Entity entity = this.selectedEntity;
                    EntityAction entityAction = EntityAction.TRIM;
                    object5 = new Pair((Object)entity, (Object)entityAction);
                    ((Stack)object).push(object5);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object5 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object5));
                    }
                    return;
                }
                n = ((Entity)object).getIndex();
                if (n < (n4 = (object4 = this.entityListQuran).size())) {
                    object5 = this.entityListQuran;
                    n4 = ((Entity)object).getIndex();
                    if ((object5 = this.getPreviewOrNextEntityQuran((List)object5, n4, n2 != 0)) != null) {
                        ((Entity)object).setCurrentRect();
                        float f5 = ((EntityQuranTimeline)object5).getRect().left;
                        ((EntityBismilahTimeline)object).setRight(f5);
                        this.invalidate();
                        this.selectedEntity.onChange();
                        object = this.entityList;
                        Entity entity = this.selectedEntity;
                        object4 = EntityAction.TRIM;
                        object5 = new Pair((Object)entity, object4);
                        ((Stack)object).push(object5);
                        object = this.iTrimLineCallback;
                        if (object != null) {
                            object5 = EntityAction.TRIM;
                            object.onAddStack((EntityAction)((Object)object5));
                        }
                        return;
                    }
                }
                ((Entity)object).setCurrentRect();
                object = this.getSelectedEntity();
                float f6 = this.getTimeLineW();
                f = this.getScaleFactor();
                ((Entity)object).setRight(f6 *= f);
                this.invalidate();
                this.selectedEntity.onChange();
                object = this.entityList;
                Entity entity = this.selectedEntity;
                object4 = EntityAction.TRIM;
                object5 = new Pair((Object)entity, object4);
                ((Stack)object).push(object5);
                object = this.iTrimLineCallback;
                if (object != null) {
                    object5 = EntityAction.TRIM;
                    object.onAddStack((EntityAction)((Object)object5));
                }
            } else {
                n = object instanceof EntityTrslTimeline;
                if (n != 0) {
                    Object object6;
                    Object object7;
                    int n5;
                    n = ((Entity)(object = (EntityTrslTimeline)object)).getIndex() + n2;
                    if (n < (n5 = (object7 = this.entityListTrslQuran).size())) {
                        object6 = this.entityListTrslQuran;
                        n5 = ((Entity)object).getIndex() + n2;
                        if ((object6 = this.getPreviewOrNextEntityTrslQuran((List)object6, n5, n2 != 0)) != null) {
                            ((Entity)object).setCurrentRect();
                            float f7 = ((EntityTrslTimeline)object6).getRect().left;
                            ((EntityTrslTimeline)object).setRight(f7);
                            this.invalidate();
                            this.selectedEntity.onChange();
                            object = this.entityList;
                            Entity entity = this.selectedEntity;
                            object7 = EntityAction.TRIM;
                            object6 = new Pair((Object)entity, object7);
                            ((Stack)object).push(object6);
                            object = this.iTrimLineCallback;
                            if (object != null) {
                                object6 = EntityAction.TRIM;
                                object.onAddStack((EntityAction)((Object)object6));
                            }
                            return;
                        }
                    }
                    ((Entity)object).setCurrentRect();
                    object = this.getSelectedEntity();
                    float f8 = this.getTimeLineW();
                    f = this.getScaleFactor();
                    ((Entity)object).setRight(f8 *= f);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    Entity entity = this.selectedEntity;
                    object7 = EntityAction.TRIM;
                    object6 = new Pair((Object)entity, object7);
                    ((Stack)object).push(object6);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object6 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object6));
                    }
                }
            }
        }
    }

    public void translateFromNow() {
        float f = this.getSecond_in_screen();
        float f2 = 0.5f;
        f *= f2;
        Object object = this.selectedEntity;
        int n = object instanceof EntityQuranTimeline;
        int n2 = 0;
        float f3 = 0.0f;
        Object object2 = null;
        if (n != 0) {
            Object object3;
            object = (EntityQuranTimeline)object;
            float f4 = Math.abs(this.getCurrentPosition());
            RectF rectF = ((EntityQuranTimeline)object).getRect();
            float f5 = rectF.right - f4;
            float f6 = f5 - f;
            float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (f7 < 0) {
                return;
            }
            f7 = object.getIndex() + -1;
            if (f7 >= 0) {
                object3 = this.getEntityListQuran();
                int n3 = object.getIndex() + -1;
                if ((object3 = this.getPreviewOrNextEntityQuran((List)object3, n3, false)) != null) {
                    object2 = ((EntityQuranTimeline)object3).getRect();
                    f3 = object2.left;
                    f5 = this.getSecond_in_screen();
                    float f8 = f4 - (f3 += f5);
                    n2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                    if (n2 < 0) {
                        f4 = this.getSecond_in_screen();
                        object2 = ((EntityQuranTimeline)object3).getRect();
                        f3 = object2.left;
                        f4 += f3;
                    }
                    object.setCurrentRect();
                    ((EntityQuranTimeline)object).setX(f4);
                    Object object4 = ((EntityQuranTimeline)object).getRect();
                    f4 = object4.left;
                    object2 = ((EntityQuranTimeline)object3).getRect();
                    f3 = object2.right;
                    n = f4 == f3 ? 0 : (f4 < f3 ? -1 : 1);
                    if (n < 0) {
                        ((Entity)object3).setCurrentRect();
                        f2 = ((EntityQuranTimeline)object).getRect().left;
                        ((EntityQuranTimeline)object3).setRight(f2);
                        ((Entity)object3).onChange();
                        object = this.entityList;
                        object2 = EntityAction.MOVE;
                        object4 = new Pair(object3, object2);
                        ((Stack)object).push(object4);
                        object3 = this.iTrimLineCallback;
                        if (object3 != null) {
                            object = EntityAction.MOVE;
                            object3.onAddStack((EntityAction)((Object)object));
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object3 = this.entityList;
                    object4 = this.selectedEntity;
                    object2 = EntityAction.TRIM;
                    object = new Pair(object4, object2);
                    ((Stack)object3).push(object);
                    object3 = this.iTrimLineCallback;
                    if (object3 != null) {
                        object = EntityAction.TRIM;
                        object3.onAddStack((EntityAction)((Object)object));
                    }
                    return;
                }
            }
            if ((f7 = (float)this.isExist((EntityBismilahTimeline)(object3 = this.bismilahTimeline))) != false) {
                Object object5;
                object3 = this.bismilahTimeline.getRect();
                f = ((RectF)object3).left;
                f3 = this.getSecond_in_screen();
                float f9 = f4 - (f += f3);
                f7 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                if (f7 < 0) {
                    f = this.getSecond_in_screen();
                    object5 = this.bismilahTimeline.getRect();
                    f4 = object5.left + f;
                }
                object.setCurrentRect();
                ((EntityQuranTimeline)object).setX(f4);
                object3 = ((EntityQuranTimeline)object).getRect();
                f = ((RectF)object3).left;
                object5 = this.bismilahTimeline.getRect();
                f4 = object5.right;
                f7 = f == f4 ? 0 : (f < f4 ? -1 : 1);
                if (f7 < 0) {
                    this.bismilahTimeline.setCurrentRect();
                    object3 = this.bismilahTimeline;
                    f2 = ((EntityQuranTimeline)object).getRect().left;
                    ((EntityBismilahTimeline)object3).setRight(f2);
                    this.bismilahTimeline.onChange();
                    object3 = this.entityList;
                    object5 = this.bismilahTimeline;
                    object2 = EntityAction.MOVE;
                    object = new Pair(object5, object2);
                    ((Stack)object3).push(object);
                    object3 = this.iTrimLineCallback;
                    if (object3 != null) {
                        object = EntityAction.MOVE;
                        object3.onAddStack((EntityAction)((Object)object));
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                object3 = this.entityList;
                object5 = this.selectedEntity;
                object2 = EntityAction.TRIM;
                object = new Pair(object5, object2);
                ((Stack)object3).push(object);
                object3 = this.iTrimLineCallback;
                if (object3 != null) {
                    object = EntityAction.TRIM;
                    object3.onAddStack((EntityAction)((Object)object));
                }
                return;
            }
            object3 = this.mIsi3adaTimeline;
            f7 = (float)this.isExist((EntityBismilahTimeline)object3);
            if (f7 != false) {
                Object object6;
                object3 = this.mIsi3adaTimeline.getRect();
                f = ((RectF)object3).left;
                f3 = this.getSecond_in_screen();
                float f10 = f4 - (f += f3);
                f7 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (f7 < 0) {
                    f = this.getSecond_in_screen();
                    object6 = this.mIsi3adaTimeline.getRect();
                    f4 = object6.left + f;
                }
                object.setCurrentRect();
                ((EntityQuranTimeline)object).setX(f4);
                object3 = ((EntityQuranTimeline)object).getRect();
                f = ((RectF)object3).left;
                object6 = this.mIsi3adaTimeline.getRect();
                f4 = object6.right;
                f7 = f == f4 ? 0 : (f < f4 ? -1 : 1);
                if (f7 < 0) {
                    this.mIsi3adaTimeline.setCurrentRect();
                    object3 = this.mIsi3adaTimeline;
                    f2 = ((EntityQuranTimeline)object).getRect().left;
                    ((EntityBismilahTimeline)object3).setRight(f2);
                    this.mIsi3adaTimeline.onChange();
                    object3 = this.entityList;
                    object6 = this.mIsi3adaTimeline;
                    object2 = EntityAction.MOVE;
                    object = new Pair(object6, object2);
                    ((Stack)object3).push(object);
                    object3 = this.iTrimLineCallback;
                    if (object3 != null) {
                        object = EntityAction.MOVE;
                        object3.onAddStack((EntityAction)((Object)object));
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                object3 = this.entityList;
                object6 = this.selectedEntity;
                object2 = EntityAction.TRIM;
                object = new Pair(object6, object2);
                ((Stack)object3).push(object);
                object3 = this.iTrimLineCallback;
                if (object3 != null) {
                    object = EntityAction.TRIM;
                    object3.onAddStack((EntityAction)((Object)object));
                }
                return;
            }
            object.setCurrentRect();
            this.selectedEntity.setX(f4);
            this.invalidate();
            this.selectedEntity.onChange();
            object3 = this.entityList;
            Entity entity = this.selectedEntity;
            object2 = EntityAction.TRIM;
            object = new Pair((Object)entity, object2);
            ((Stack)object3).push(object);
            object3 = this.iTrimLineCallback;
            if (object3 != null) {
                object = EntityAction.TRIM;
                object3.onAddStack((EntityAction)((Object)object));
            }
        } else {
            n = object instanceof EntityBismilahTimeline;
            if (n != 0) {
                Entity entity = object;
                entity = (EntityBismilahTimeline)object;
                f3 = Math.abs(this.getCurrentPosition());
                RectF rectF = ((EntityBismilahTimeline)entity).getRect();
                float f11 = rectF.right - f3;
                float f12 = f11 - f;
                float f13 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (f13 < 0) {
                    return;
                }
                entity.setCurrentRect();
                this.selectedEntity.setX(f3);
                Object object7 = this.bismilahTimeline;
                if (object == object7 && (object = this.mIsi3adaTimeline) != null) {
                    object7 = ((EntityBismilahTimeline)object7).getRect();
                    f = ((RectF)object7).left;
                    object = this.mIsi3adaTimeline.getRect();
                    f2 = ((RectF)object).right;
                    float f14 = f - f2;
                    f13 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    if (f13 < 0) {
                        this.mIsi3adaTimeline.setCurrentRect();
                        object7 = this.mIsi3adaTimeline;
                        f2 = ((EntityBismilahTimeline)entity).getRect().left;
                        ((EntityBismilahTimeline)object7).setRight(f2);
                        this.mIsi3adaTimeline.onChange();
                        object7 = this.entityList;
                        entity = this.mIsi3adaTimeline;
                        object2 = EntityAction.MOVE;
                        object = new Pair((Object)entity, object2);
                        ((Stack)object7).push(object);
                        object7 = this.iTrimLineCallback;
                        if (object7 != null) {
                            object = EntityAction.MOVE;
                            object7.onAddStack((EntityAction)((Object)object));
                        }
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                object7 = this.entityList;
                entity = this.selectedEntity;
                object2 = EntityAction.TRIM;
                object = new Pair((Object)entity, object2);
                ((Stack)object7).push(object);
                object7 = this.iTrimLineCallback;
                if (object7 != null) {
                    object = EntityAction.TRIM;
                    object7.onAddStack((EntityAction)((Object)object));
                }
            } else {
                n = object instanceof EntityTrslTimeline;
                if (n != 0) {
                    Object object8;
                    object = (EntityTrslTimeline)object;
                    float f15 = Math.abs(this.getCurrentPosition());
                    RectF rectF = ((EntityTrslTimeline)object).getRect();
                    float f16 = rectF.right - f15;
                    float f17 = f16 - f;
                    float f18 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    if (f18 < 0) {
                        return;
                    }
                    f18 = object.getIndex() + -1;
                    if (f18 >= 0) {
                        object8 = this.getEntityListTrslQuran();
                        int n4 = object.getIndex() + -1;
                        if ((object8 = this.getPreviewOrNextEntityTrslQuran((List)object8, n4, false)) != null) {
                            object2 = ((EntityTrslTimeline)object8).getRect();
                            f3 = object2.left;
                            f16 = this.getSecond_in_screen();
                            float f19 = f15 - (f3 += f16);
                            n2 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                            if (n2 < 0) {
                                f15 = this.getSecond_in_screen();
                                object2 = ((EntityTrslTimeline)object8).getRect();
                                f3 = object2.left;
                                f15 += f3;
                            }
                            object.setCurrentRect();
                            ((EntityTrslTimeline)object).setX(f15);
                            Object object9 = ((EntityTrslTimeline)object).getRect();
                            f15 = object9.left;
                            object2 = ((EntityTrslTimeline)object8).getRect();
                            f3 = object2.right;
                            n = f15 == f3 ? 0 : (f15 < f3 ? -1 : 1);
                            if (n < 0) {
                                ((Entity)object8).setCurrentRect();
                                f2 = ((EntityTrslTimeline)object).getRect().left;
                                ((EntityTrslTimeline)object8).setRight(f2);
                                ((Entity)object8).onChange();
                                object = this.entityList;
                                object2 = EntityAction.MOVE;
                                object9 = new Pair(object8, object2);
                                ((Stack)object).push(object9);
                                object8 = this.iTrimLineCallback;
                                if (object8 != null) {
                                    object = EntityAction.MOVE;
                                    object8.onAddStack((EntityAction)((Object)object));
                                }
                            }
                            this.invalidate();
                            this.selectedEntity.onChange();
                            object8 = this.entityList;
                            object9 = this.selectedEntity;
                            object2 = EntityAction.TRIM;
                            object = new Pair(object9, object2);
                            ((Stack)object8).push(object);
                            object8 = this.iTrimLineCallback;
                            if (object8 != null) {
                                object = EntityAction.TRIM;
                                object8.onAddStack((EntityAction)((Object)object));
                            }
                            return;
                        }
                    }
                    object.setCurrentRect();
                    this.selectedEntity.setX(f15);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object8 = this.entityList;
                    Entity entity = this.selectedEntity;
                    object2 = EntityAction.TRIM;
                    object = new Pair((Object)entity, object2);
                    ((Stack)object8).push(object);
                    object8 = this.iTrimLineCallback;
                    if (object8 != null) {
                        object = EntityAction.TRIM;
                        object8.onAddStack((EntityAction)((Object)object));
                    }
                }
            }
        }
    }

    public void translateFromStart() {
        Object object = this.selectedEntity;
        int n = object instanceof EntityQuranTimeline;
        Entity entity = null;
        EntityAction entityAction = null;
        if (n != 0) {
            Object object2;
            n = ((Entity)(object = (EntityQuranTimeline)object)).getIndex() + -1;
            if (n >= 0) {
                object2 = this.entityListQuran;
                int n2 = ((Entity)object).getIndex() + -1;
                if ((object2 = this.getPreviewOrNextEntityQuran((List)object2, n2, false)) != null) {
                    ((Entity)object).setCurrentRect();
                    float f = ((EntityQuranTimeline)object2).getRect().right;
                    ((EntityQuranTimeline)object).setX(f);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    entity = this.selectedEntity;
                    entityAction = EntityAction.TRIM;
                    object2 = new Pair((Object)entity, (Object)entityAction);
                    ((Stack)object).push(object2);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object2 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object2));
                    }
                    return;
                }
            }
            if ((n = (int)(this.isExist((EntityBismilahTimeline)(object2 = this.bismilahTimeline)) ? 1 : 0)) != 0) {
                ((Entity)object).setCurrentRect();
                float f = this.bismilahTimeline.getRect().right;
                ((EntityQuranTimeline)object).setX(f);
                this.invalidate();
                this.selectedEntity.onChange();
                object = this.entityList;
                entity = this.selectedEntity;
                entityAction = EntityAction.TRIM;
                object2 = new Pair((Object)entity, (Object)entityAction);
                ((Stack)object).push(object2);
                object = this.iTrimLineCallback;
                if (object != null) {
                    object2 = EntityAction.TRIM;
                    object.onAddStack((EntityAction)((Object)object2));
                }
                return;
            }
            object2 = this.mIsi3adaTimeline;
            n = this.isExist((EntityBismilahTimeline)object2) ? 1 : 0;
            if (n != 0) {
                ((Entity)object).setCurrentRect();
                float f = this.mIsi3adaTimeline.getRect().right;
                ((EntityQuranTimeline)object).setX(f);
                this.invalidate();
                this.selectedEntity.onChange();
                object = this.entityList;
                entity = this.selectedEntity;
                entityAction = EntityAction.TRIM;
                object2 = new Pair((Object)entity, (Object)entityAction);
                ((Stack)object).push(object2);
                object = this.iTrimLineCallback;
                if (object != null) {
                    object2 = EntityAction.TRIM;
                    object.onAddStack((EntityAction)((Object)object2));
                }
                return;
            }
            ((Entity)object).setCurrentRect();
            this.selectedEntity.setX(0.0f);
            this.invalidate();
            this.selectedEntity.onChange();
            object = this.entityList;
            entity = this.selectedEntity;
            entityAction = EntityAction.TRIM;
            object2 = new Pair((Object)entity, (Object)entityAction);
            ((Stack)object).push(object2);
            object = this.iTrimLineCallback;
            if (object != null) {
                object2 = EntityAction.TRIM;
                object.onAddStack((EntityAction)((Object)object2));
            }
        } else {
            n = object instanceof EntityBismilahTimeline;
            if (n != 0) {
                boolean bl;
                Object object3 = object;
                object3 = (EntityBismilahTimeline)object;
                entity = this.bismilahTimeline;
                if (object == entity && (bl = this.isExist((EntityBismilahTimeline)(object = this.mIsi3adaTimeline)))) {
                    object3.setCurrentRect();
                    float f = this.mIsi3adaTimeline.getRect().right;
                    ((EntityBismilahTimeline)object3).setX(f);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    entity = this.selectedEntity;
                    entityAction = EntityAction.TRIM;
                    object3 = new Pair((Object)entity, (Object)entityAction);
                    ((Stack)object).push(object3);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object3 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object3));
                    }
                    return;
                }
                object3.setCurrentRect();
                this.selectedEntity.setX(0.0f);
                this.invalidate();
                this.selectedEntity.onChange();
                object = this.entityList;
                entity = this.selectedEntity;
                entityAction = EntityAction.TRIM;
                object3 = new Pair((Object)entity, (Object)entityAction);
                ((Stack)object).push(object3);
                object = this.iTrimLineCallback;
                if (object != null) {
                    object3 = EntityAction.TRIM;
                    object.onAddStack((EntityAction)((Object)object3));
                }
            } else {
                n = object instanceof EntityTrslTimeline;
                if (n != 0) {
                    Object object4;
                    n = ((Entity)(object = (EntityTrslTimeline)object)).getIndex() + -1;
                    if (n >= 0) {
                        object4 = this.entityListTrslQuran;
                        int n3 = ((Entity)object).getIndex() + -1;
                        if ((object4 = this.getPreviewOrNextEntityTrslQuran((List)object4, n3, false)) != null) {
                            ((Entity)object).setCurrentRect();
                            float f = ((EntityTrslTimeline)object4).getRect().right;
                            ((EntityTrslTimeline)object).setX(f);
                            this.invalidate();
                            this.selectedEntity.onChange();
                            object = this.entityList;
                            entity = this.selectedEntity;
                            entityAction = EntityAction.TRIM;
                            object4 = new Pair((Object)entity, (Object)entityAction);
                            ((Stack)object).push(object4);
                            object = this.iTrimLineCallback;
                            if (object != null) {
                                object4 = EntityAction.TRIM;
                                object.onAddStack((EntityAction)((Object)object4));
                            }
                            return;
                        }
                    }
                    ((Entity)object).setCurrentRect();
                    this.selectedEntity.setX(0.0f);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object = this.entityList;
                    entity = this.selectedEntity;
                    entityAction = EntityAction.TRIM;
                    object4 = new Pair((Object)entity, (Object)entityAction);
                    ((Stack)object).push(object4);
                    object = this.iTrimLineCallback;
                    if (object != null) {
                        object4 = EntityAction.TRIM;
                        object.onAddStack((EntityAction)((Object)object4));
                    }
                }
            }
        }
    }

    public void translateToEnd() {
        int n;
        this.current_cursur_position = n = this.maxTime;
        float f = -n;
        float f2 = this.second_in_screen;
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void translateToEnd(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        float f = entity.getRect().right;
        float f2 = this.getSecond_in_screen();
        this.current_cursur_position = n = Math.round(f / f2) * 1000;
        f = -n;
        f2 = this.getSecond_in_screen();
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void translateToRight() {
        EntityBismilahTimeline entityBismilahTimeline = this.bismilahTimeline;
        Object object = entityBismilahTimeline.getRect();
        float f = ((RectF)object).right;
        Object object2 = this.entityListQuran;
        int n = entityBismilahTimeline.getIndex();
        int n2 = 1;
        float f2 = Float.MIN_VALUE;
        if ((object2 = this.getPreviewOrNextEntityQuran((List)object2, n, n2 != 0)) != null) {
            RectF rectF = ((EntityQuranTimeline)object2).getRect();
            float f3 = rectF.left;
            float f4 = f - f3;
            n = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
            if (n >= 0) {
                int n3;
                rectF = ((EntityQuranTimeline)object2).getRect();
                f3 = rectF.left;
                f3 = f - f3;
                RectF rectF2 = ((EntityQuranTimeline)object2).getRect();
                float f5 = rectF2.width() + f;
                ((Entity)object2).setCurrentRect();
                ((EntityQuranTimeline)object2).setX(f);
                ((EntityQuranTimeline)object2).setRight(f5);
                for (int i = entityBismilahTimeline.getIndex() + n2; i < (n3 = (object = this.entityListQuran).size()); ++i) {
                    object = (Entity)this.entityListQuran.get(i);
                    boolean bl = ((Entity)object).visible();
                    if (!bl) continue;
                    object2 = ((Entity)object).getRect();
                    float f6 = ((RectF)object2).left + f3;
                    RectF rectF3 = ((Entity)object).getRect();
                    f2 = rectF3.width() + f6;
                    ((Entity)object).setCurrentRect();
                    ((Entity)object).setX(f6);
                    ((Entity)object).setRight(f2);
                }
            }
        }
    }

    public void translateToRight(boolean n) {
        Object object;
        Object object2 = n != 0 ? this.mIsi3adaTimeline : this.bismilahTimeline;
        Object object3 = ((EntityBismilahTimeline)object2).getRect();
        float f = ((RectF)object3).right;
        if (n != 0 && (n = this.isExist((EntityBismilahTimeline)(object = this.bismilahTimeline))) != 0) {
            object = this.bismilahTimeline.getRect();
            float f2 = ((RectF)object).left;
            float f3 = f - f2;
            n = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            if (n >= 0) {
                int n2;
                f2 = this.bismilahTimeline.getRect().width() + f;
                object2 = this.bismilahTimeline.getRect();
                float f4 = ((RectF)object2).left;
                f4 = f - f4;
                this.bismilahTimeline.setCurrentRect();
                EntityBismilahTimeline entityBismilahTimeline = this.bismilahTimeline;
                entityBismilahTimeline.setX(f);
                object3 = this.bismilahTimeline;
                ((EntityBismilahTimeline)object3).setRight(f2);
                object = this.bismilahTimeline;
                for (n = ((Entity)object).getIndex(); n < (n2 = (object3 = this.entityListQuran).size()); ++n) {
                    object3 = (Entity)this.entityListQuran.get(n);
                    boolean bl = ((Entity)object3).visible();
                    if (!bl) continue;
                    entityBismilahTimeline = ((Entity)object3).getRect();
                    float f5 = ((RectF)entityBismilahTimeline).left + f4;
                    RectF rectF = ((Entity)object3).getRect();
                    float f6 = rectF.width() + f5;
                    ((Entity)object3).setCurrentRect();
                    ((Entity)object3).setX(f5);
                    ((Entity)object3).setRight(f6);
                }
                return;
            }
        }
        object = this.entityListQuran;
        int n3 = ((Entity)object2).getIndex();
        int n4 = 1;
        float f7 = Float.MIN_VALUE;
        if ((object = this.getPreviewOrNextEntityQuran((List)object, n3, n4 != 0)) != null) {
            RectF rectF = ((EntityQuranTimeline)object).getRect();
            float f8 = rectF.left;
            float f9 = f - f8;
            n3 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
            if (n3 >= 0) {
                int n5;
                rectF = ((EntityQuranTimeline)object).getRect();
                f8 = rectF.left;
                f8 = f - f8;
                RectF rectF2 = ((EntityQuranTimeline)object).getRect();
                float f10 = rectF2.width() + f;
                ((Entity)object).setCurrentRect();
                ((EntityQuranTimeline)object).setX(f);
                ((EntityQuranTimeline)object).setRight(f10);
                for (n = ((Entity)object2).getIndex() + n4; n < (n5 = (object2 = this.entityListQuran).size()); ++n) {
                    object2 = (Entity)this.entityListQuran.get(n);
                    boolean bl = ((Entity)object2).visible();
                    if (!bl) continue;
                    object3 = ((Entity)object2).getRect();
                    f = ((RectF)object3).left + f8;
                    RectF rectF3 = ((Entity)object2).getRect();
                    f7 = rectF3.width() + f;
                    ((Entity)object2).setCurrentRect();
                    ((Entity)object2).setX(f);
                    ((Entity)object2).setRight(f7);
                }
            }
        }
    }

    public void translateToRightBismilah(EntityBismilahTimeline entityBismilahTimeline) {
        int n;
        float f = Math.abs(this.getCurrentPosition());
        Object object = entityBismilahTimeline.getRect();
        float f2 = object.left;
        float f3 = (f -= f2) - (f2 = this.second_in_screen);
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 < 0) {
            return;
        }
        f4 = entityBismilahTimeline.getIndex();
        if (f4 < (n = (object = this.getEntityListQuran()).size())) {
            Object object2 = this.getEntityListQuran();
            n = entityBismilahTimeline.getIndex();
            int n2 = 1;
            float f5 = Float.MIN_VALUE;
            if ((object2 = this.getPreviewOrNextEntityQuran((List)object2, n, n2 != 0)) != null) {
                object = entityBismilahTimeline.getRect();
                f2 = object.right;
                RectF rectF = ((EntityQuranTimeline)object2).getRect();
                float f6 = rectF.left;
                float f7 = f2 - f6;
                n = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n > 0) {
                    f2 = entityBismilahTimeline.getRect().right;
                    f6 = ((EntityQuranTimeline)object2).getRect().width();
                    f2 += f6;
                    rectF = entityBismilahTimeline.getRect();
                    f6 = rectF.right;
                    float f8 = ((EntityQuranTimeline)object2).getRect().left;
                    f6 -= f8;
                    ((Entity)object2).setCurrentRect();
                    f8 = entityBismilahTimeline.getRect().right;
                    ((EntityQuranTimeline)object2).setX(f8);
                    ((EntityQuranTimeline)object2).setRight(f2);
                    ((Entity)object2).onChange();
                    object = this.entityList;
                    EntityAction entityAction = EntityAction.MOVE;
                    Object object3 = new Pair(object2, (Object)entityAction);
                    object.push(object3);
                    object2 = this.iTrimLineCallback;
                    if (object2 != null) {
                        object = EntityAction.MOVE;
                        object2.onAddStack((EntityAction)((Object)object));
                    }
                    for (int i = entityBismilahTimeline.getIndex() + n2; i < (f4 = (float)(object2 = this.getEntityListQuran()).size()); ++i) {
                        object2 = (EntityQuranTimeline)this.getEntityListQuran().get(i);
                        ((Entity)object2).setCurrentRect();
                        f2 = ((EntityQuranTimeline)object2).getRect().left + f6;
                        f5 = ((EntityQuranTimeline)object2).getRect().width() + f2;
                        ((EntityQuranTimeline)object2).setX(f2);
                        ((EntityQuranTimeline)object2).setRight(f5);
                        this.invalidate();
                        ((Entity)object2).onChange();
                        object = this.entityList;
                        object3 = EntityAction.MOVE;
                        Pair pair = new Pair(object2, object3);
                        object.push(pair);
                        object2 = this.iTrimLineCallback;
                        if (object2 == null) continue;
                        object = EntityAction.MOVE;
                        object2.onAddStack((EntityAction)((Object)object));
                    }
                }
                this.invalidate();
            }
        }
    }

    public void translateToStart() {
        this.current_cursur_position = 0;
        this.currentPosition = 0.0f;
        this.scrolled_with_zoom = 0.0f;
        this.invalidate();
    }

    public void translateToStart(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        float f = entity.getRect().left;
        float f2 = this.getSecond_in_screen();
        this.current_cursur_position = n = Math.round(f / f2) * 1000;
        f = -n;
        f2 = this.getSecond_in_screen();
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void translateUntilNow() {
        float f = this.getSecond_in_screen();
        int n = 0x3F000000;
        float f2 = 0.5f;
        f *= f2;
        Object object = this.selectedEntity;
        int n2 = object instanceof EntityQuranTimeline;
        int n3 = 1;
        float f3 = Float.MIN_VALUE;
        if (n2 != 0) {
            Object object2;
            int n4;
            object = (EntityQuranTimeline)object;
            float f4 = Math.abs(this.getCurrentPosition());
            Object object3 = ((EntityQuranTimeline)object).getRect();
            float f5 = ((RectF)object3).left;
            float f6 = (f5 = f4 - f5) - f;
            float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (f7 < 0) {
                return;
            }
            f7 = ((Entity)object).getIndex() + n3;
            if (f7 < (n4 = (object3 = this.getEntityListQuran()).size())) {
                object2 = this.getEntityListQuran();
                n4 = ((Entity)object).getIndex() + n3;
                if ((object2 = this.getPreviewOrNextEntityQuran((List)object2, n4, n3 != 0)) != null) {
                    ((Entity)object).setCurrentRect();
                    ((EntityQuranTimeline)object).setRight(f4);
                    Object object4 = ((EntityQuranTimeline)object).getRect();
                    f4 = object4.right;
                    Object object5 = ((EntityQuranTimeline)object2).getRect();
                    f3 = object5.left;
                    n2 = f4 == f3 ? 0 : (f4 > f3 ? 1 : -1);
                    if (n2 > 0) {
                        f4 = ((EntityQuranTimeline)object).getRect().right;
                        f3 = ((EntityQuranTimeline)object2).getRect().width();
                        f4 += f3;
                        object5 = ((EntityQuranTimeline)object).getRect();
                        f3 = object5.right;
                        f5 = ((EntityQuranTimeline)object2).getRect().left;
                        f3 -= f5;
                        ((Entity)object2).setCurrentRect();
                        f5 = ((EntityQuranTimeline)object).getRect().right;
                        ((EntityQuranTimeline)object2).setX(f5);
                        ((EntityQuranTimeline)object2).setRight(f4);
                        ((Entity)object2).onChange();
                        object4 = this.entityList;
                        EntityAction entityAction = EntityAction.MOVE;
                        object3 = new Pair(object2, (Object)entityAction);
                        object4.push(object3);
                        object2 = this.iTrimLineCallback;
                        if (object2 != null) {
                            object4 = EntityAction.MOVE;
                            object2.onAddStack((EntityAction)((Object)object4));
                        }
                        for (f7 = (float)(((Entity)object).getIndex() + 2); f7 < (n = (object = this.getEntityListQuran()).size()); ++f7) {
                            object = (EntityQuranTimeline)this.getEntityListQuran().get((int)f7);
                            ((Entity)object).setCurrentRect();
                            f4 = ((EntityQuranTimeline)object).getRect().left + f3;
                            f5 = ((EntityQuranTimeline)object).getRect().width() + f4;
                            ((EntityQuranTimeline)object).setX(f4);
                            ((EntityQuranTimeline)object).setRight(f5);
                            this.invalidate();
                            ((Entity)object).onChange();
                            object4 = this.entityList;
                            entityAction = EntityAction.MOVE;
                            object3 = new Pair(object, (Object)entityAction);
                            object4.push(object3);
                            object = this.iTrimLineCallback;
                            if (object == null) continue;
                            object4 = EntityAction.MOVE;
                            object.onAddStack((EntityAction)((Object)object4));
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object2 = this.entityList;
                    object4 = this.selectedEntity;
                    object5 = EntityAction.TRIM;
                    object = new Pair(object4, object5);
                    ((Stack)object2).push(object);
                    object2 = this.iTrimLineCallback;
                    if (object2 != null) {
                        object = EntityAction.TRIM;
                        object2.onAddStack((EntityAction)((Object)object));
                    }
                    return;
                }
            }
            ((Entity)object).setCurrentRect();
            this.selectedEntity.setRight(f4);
            this.invalidate();
            this.selectedEntity.onChange();
            object2 = this.entityList;
            Entity entity = this.selectedEntity;
            EntityAction entityAction = EntityAction.TRIM;
            object = new Pair((Object)entity, (Object)entityAction);
            ((Stack)object2).push(object);
            object2 = this.iTrimLineCallback;
            if (object2 != null) {
                object = EntityAction.TRIM;
                object2.onAddStack((EntityAction)((Object)object));
            }
        } else {
            n2 = object instanceof EntityBismilahTimeline;
            if (n2 != 0) {
                int n5;
                object = (EntityBismilahTimeline)object;
                float f8 = Math.abs(this.getCurrentPosition());
                Object object6 = ((EntityBismilahTimeline)object).getRect();
                float f9 = object6.left;
                float f10 = (f9 = f8 - f9) - f;
                float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (f11 < 0) {
                    return;
                }
                Object object7 = this.mIsi3adaTimeline;
                if (object == object7 && (f11 = (float)this.isExist((EntityBismilahTimeline)(object7 = this.bismilahTimeline))) != false) {
                    Object object8;
                    ((Entity)object).setCurrentRect();
                    ((EntityBismilahTimeline)object).setRight(f8);
                    object7 = ((EntityBismilahTimeline)object).getRect();
                    f = ((RectF)object7).right;
                    Object object9 = this.bismilahTimeline.getRect();
                    f8 = object9.left;
                    f11 = f == f8 ? 0 : (f > f8 ? 1 : -1);
                    if (f11 > 0) {
                        f = ((EntityBismilahTimeline)object).getRect().right;
                        f8 = this.bismilahTimeline.getRect().width();
                        f += f8;
                        object9 = ((EntityBismilahTimeline)object).getRect();
                        f8 = object9.right;
                        f3 = this.bismilahTimeline.getRect().left;
                        f8 -= f3;
                        this.bismilahTimeline.setCurrentRect();
                        object8 = this.bismilahTimeline;
                        f2 = ((EntityBismilahTimeline)object).getRect().right;
                        ((EntityBismilahTimeline)object8).setX(f2);
                        this.bismilahTimeline.setRight(f);
                        this.bismilahTimeline.onChange();
                        object7 = this.entityList;
                        object8 = this.bismilahTimeline;
                        object6 = EntityAction.MOVE;
                        object = new Pair(object8, object6);
                        ((Stack)object7).push(object);
                        object7 = this.iTrimLineCallback;
                        if (object7 != null) {
                            object = EntityAction.MOVE;
                            object7.onAddStack((EntityAction)((Object)object));
                        }
                        object7 = this.bismilahTimeline;
                        for (f11 = (float)((Entity)object7).getIndex(); f11 < (n = (object = this.getEntityListQuran()).size()); ++f11) {
                            object = (EntityQuranTimeline)this.getEntityListQuran().get((int)f11);
                            ((Entity)object).setCurrentRect();
                            f3 = ((EntityQuranTimeline)object).getRect().left + f8;
                            f9 = ((EntityQuranTimeline)object).getRect().width() + f3;
                            ((EntityQuranTimeline)object).setX(f3);
                            ((EntityQuranTimeline)object).setRight(f9);
                            this.invalidate();
                            ((Entity)object).onChange();
                            object8 = this.entityList;
                            EntityAction entityAction = EntityAction.MOVE;
                            object6 = new Pair(object, (Object)entityAction);
                            ((Stack)object8).push(object6);
                            object = this.iTrimLineCallback;
                            if (object == null) continue;
                            object8 = EntityAction.MOVE;
                            object.onAddStack((EntityAction)((Object)object8));
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object7 = this.entityList;
                    object9 = this.selectedEntity;
                    object8 = EntityAction.TRIM;
                    object = new Pair(object9, object8);
                    ((Stack)object7).push(object);
                    object7 = this.iTrimLineCallback;
                    if (object7 != null) {
                        object = EntityAction.TRIM;
                        object7.onAddStack((EntityAction)((Object)object));
                    }
                    return;
                }
                f11 = ((Entity)object).getIndex();
                if (f11 < (n5 = (object6 = this.getEntityListQuran()).size())) {
                    object7 = this.getEntityListQuran();
                    n5 = ((Entity)object).getIndex();
                    if ((object7 = this.getPreviewOrNextEntityQuran((List)object7, n5, n3 != 0)) != null) {
                        EntityAction entityAction;
                        ((Entity)object).setCurrentRect();
                        ((EntityBismilahTimeline)object).setRight(f8);
                        Object object10 = ((EntityBismilahTimeline)object).getRect();
                        f8 = object10.right;
                        object6 = ((EntityQuranTimeline)object7).getRect();
                        f9 = object6.left;
                        n2 = f8 == f9 ? 0 : (f8 > f9 ? 1 : -1);
                        if (n2 > 0) {
                            f8 = ((EntityBismilahTimeline)object).getRect().right;
                            f9 = ((EntityQuranTimeline)object7).getRect().width();
                            f8 += f9;
                            object6 = ((EntityBismilahTimeline)object).getRect();
                            f9 = object6.right;
                            float f12 = ((EntityQuranTimeline)object7).getRect().left;
                            f9 -= f12;
                            ((Entity)object7).setCurrentRect();
                            f12 = ((EntityBismilahTimeline)object).getRect().right;
                            ((EntityQuranTimeline)object7).setX(f12);
                            ((EntityQuranTimeline)object7).setRight(f8);
                            ((Entity)object7).onChange();
                            object10 = this.entityList;
                            EntityAction entityAction2 = EntityAction.MOVE;
                            Object object11 = new Pair(object7, (Object)entityAction2);
                            object10.push(object11);
                            object7 = this.iTrimLineCallback;
                            if (object7 != null) {
                                object10 = EntityAction.MOVE;
                                object7.onAddStack((EntityAction)((Object)object10));
                            }
                            for (f11 = (float)(((Entity)object).getIndex() + n3); f11 < (n = (object = this.getEntityListQuran()).size()); ++f11) {
                                object = (EntityQuranTimeline)this.getEntityListQuran().get((int)f11);
                                ((Entity)object).setCurrentRect();
                                f8 = ((EntityQuranTimeline)object).getRect().left + f9;
                                f3 = ((EntityQuranTimeline)object).getRect().width() + f8;
                                ((EntityQuranTimeline)object).setX(f8);
                                ((EntityQuranTimeline)object).setRight(f3);
                                this.invalidate();
                                ((Entity)object).onChange();
                                object10 = this.entityList;
                                object11 = EntityAction.MOVE;
                                entityAction = new Pair(object, object11);
                                object10.push(entityAction);
                                object = this.iTrimLineCallback;
                                if (object == null) continue;
                                object10 = EntityAction.MOVE;
                                object.onAddStack((EntityAction)((Object)object10));
                            }
                        }
                        this.invalidate();
                        this.selectedEntity.onChange();
                        object7 = this.entityList;
                        object10 = this.selectedEntity;
                        entityAction = EntityAction.TRIM;
                        object = new Pair(object10, (Object)entityAction);
                        ((Stack)object7).push(object);
                        object7 = this.iTrimLineCallback;
                        if (object7 != null) {
                            object = EntityAction.TRIM;
                            object7.onAddStack((EntityAction)((Object)object));
                        }
                        return;
                    }
                }
                ((Entity)object).setCurrentRect();
                this.selectedEntity.setRight(f8);
                this.invalidate();
                this.selectedEntity.onChange();
                object7 = this.entityList;
                Entity entity = this.selectedEntity;
                EntityAction entityAction = EntityAction.TRIM;
                object = new Pair((Object)entity, (Object)entityAction);
                ((Stack)object7).push(object);
                object7 = this.iTrimLineCallback;
                if (object7 != null) {
                    object = EntityAction.TRIM;
                    object7.onAddStack((EntityAction)((Object)object));
                }
            } else {
                n2 = object instanceof EntityTrslTimeline;
                if (n2 != 0) {
                    Object object12;
                    int n6;
                    object = (EntityTrslTimeline)object;
                    float f13 = Math.abs(this.getCurrentPosition());
                    Object object13 = ((EntityTrslTimeline)object).getRect();
                    float f14 = ((RectF)object13).left;
                    float f15 = (f14 = f13 - f14) - f;
                    float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                    if (f16 < 0) {
                        return;
                    }
                    f16 = ((Entity)object).getIndex() + n3;
                    if (f16 < (n6 = (object13 = this.getEntityListTrslQuran()).size())) {
                        object12 = this.getEntityListTrslQuran();
                        n6 = ((Entity)object).getIndex() + n3;
                        if ((object12 = this.getPreviewOrNextEntityTrslQuran((List)object12, n6, n3 != 0)) != null) {
                            ((Entity)object).setCurrentRect();
                            ((EntityTrslTimeline)object).setRight(f13);
                            Object object14 = ((EntityTrslTimeline)object).getRect();
                            f13 = object14.right;
                            Object object15 = ((EntityTrslTimeline)object12).getRect();
                            f3 = object15.left;
                            n2 = f13 == f3 ? 0 : (f13 > f3 ? 1 : -1);
                            if (n2 > 0) {
                                f13 = ((EntityTrslTimeline)object).getRect().right;
                                f3 = ((EntityTrslTimeline)object12).getRect().width();
                                f13 += f3;
                                object15 = ((EntityTrslTimeline)object).getRect();
                                f3 = object15.right;
                                f14 = ((EntityTrslTimeline)object12).getRect().left;
                                f3 -= f14;
                                ((Entity)object12).setCurrentRect();
                                f14 = ((EntityTrslTimeline)object).getRect().right;
                                ((EntityTrslTimeline)object12).setX(f14);
                                ((EntityTrslTimeline)object12).setRight(f13);
                                ((Entity)object12).onChange();
                                object14 = this.entityList;
                                EntityAction entityAction = EntityAction.MOVE;
                                object13 = new Pair(object12, (Object)entityAction);
                                object14.push(object13);
                                object12 = this.iTrimLineCallback;
                                if (object12 != null) {
                                    object14 = EntityAction.MOVE;
                                    object12.onAddStack((EntityAction)((Object)object14));
                                }
                                for (f16 = (float)(((Entity)object).getIndex() + 2); f16 < (n = (object = this.getEntityListTrslQuran()).size()); ++f16) {
                                    object = (EntityTrslTimeline)this.getEntityListTrslQuran().get((int)f16);
                                    ((Entity)object).setCurrentRect();
                                    f13 = ((EntityTrslTimeline)object).getRect().left + f3;
                                    f14 = ((EntityTrslTimeline)object).getRect().width() + f13;
                                    ((EntityTrslTimeline)object).setX(f13);
                                    ((EntityTrslTimeline)object).setRight(f14);
                                    this.invalidate();
                                    ((Entity)object).onChange();
                                    object14 = this.entityList;
                                    entityAction = EntityAction.MOVE;
                                    object13 = new Pair(object, (Object)entityAction);
                                    object14.push(object13);
                                    object = this.iTrimLineCallback;
                                    if (object == null) continue;
                                    object14 = EntityAction.MOVE;
                                    object.onAddStack((EntityAction)((Object)object14));
                                }
                            }
                            this.invalidate();
                            this.selectedEntity.onChange();
                            object12 = this.entityList;
                            object14 = this.selectedEntity;
                            object15 = EntityAction.TRIM;
                            object = new Pair(object14, object15);
                            ((Stack)object12).push(object);
                            object12 = this.iTrimLineCallback;
                            if (object12 != null) {
                                object = EntityAction.TRIM;
                                object12.onAddStack((EntityAction)((Object)object));
                            }
                            return;
                        }
                    }
                    ((Entity)object).setCurrentRect();
                    this.selectedEntity.setRight(f13);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    object12 = this.entityList;
                    Entity entity = this.selectedEntity;
                    EntityAction entityAction = EntityAction.TRIM;
                    object = new Pair((Object)entity, (Object)entityAction);
                    ((Stack)object12).push(object);
                    object12 = this.iTrimLineCallback;
                    if (object12 != null) {
                        object = EntityAction.TRIM;
                        object12.onAddStack((EntityAction)((Object)object));
                    }
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void undo() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [77[UNCONDITIONALDOLOOP]], but top level block is 42[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void unselectEntity() {
        Entity entity = this.selectedEntity;
        if (entity != null) {
            entity.setSelect(false);
            entity = null;
            this.selectedEntity = null;
        }
    }

    public void updateCursur(float f) {
        this.currentPosition = f = -f;
        float f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void updateCursur(int n) {
        this.current_cursur_position = n;
        float f = -n;
        float f2 = this.second_in_screen;
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    public void updateCursurToSelectEntity() {
        int n;
        Entity entity = this.selectedEntity;
        if (entity == null) {
            return;
        }
        EntityView entityView = entity.getEntityView();
        boolean bl = entityView.isVisible();
        if (bl) {
            return;
        }
        float f = entity.getRect().left;
        float f2 = this.selectedEntity.getRect().width() * 0.5f;
        f += f2;
        f2 = this.getSecond_in_screen();
        this.current_cursur_position = n = Math.round(f / f2) * 1000;
        f = -n;
        f2 = this.second_in_screen;
        this.currentPosition = f = f * f2 / 1000.0f;
        f2 = this.scaleFactor;
        this.scrolled_with_zoom = f *= f2;
        this.invalidate();
    }

    /*
     * WARNING - void declaration
     */
    public void updateSelectionOnTap(MotionEvent object) {
        boolean bl;
        boolean bl2;
        int n;
        float f;
        Entity entity;
        int n2;
        int n3;
        Object object2;
        float f2;
        Object object3;
        int n5;
        int n6;
        Object object4;
        int n7;
        Object object5;
        float f3;
        float f4;
        block60: {
            void var11_16;
            int n4;
            f4 = object.getX();
            f3 = object.getY();
            object5 = new PointF(f4, f3);
            n7 = 1;
            f3 = Float.MIN_VALUE;
            this.isPassScroll = n7;
            object4 = this.selectedEntity;
            float f5 = 0.0f;
            RectF rectF = null;
            n6 = 0;
            n5 = -1;
            if (object4 != null) {
                int n8;
                boolean n42 = ((Entity)object4).contains((PointF)object5);
                if (!n42 && (n4 = ((Entity)(object3 = this.selectedEntity)).getTrim_type()) == n5) {
                    n4 = n7;
                    f2 = f3;
                } else {
                    n4 = 0;
                    object3 = null;
                    f2 = 0.0f;
                }
                this.isPassScroll = n4;
                if (n42 || (n8 = ((Entity)(object4 = this.selectedEntity)).getTrim_type()) != n5) {
                    int n9;
                    this.selectedEntity.setCurrentRect();
                    object5 = this.iTrimLineCallback;
                    if (object5 != null) {
                        object5 = this.selectedEntity;
                        n9 = ((Entity)object5).getTrim_type();
                        if (n9 == 0) {
                            object5 = this.selectedEntity;
                            object4 = ((Entity)object5).getRect();
                            f4 = ((RectF)object4).left;
                            f5 = this.getSecond_in_screen();
                            int n10 = Math.round(f4 / f5) * 1000;
                            f4 = n10;
                            rectF = this.selectedEntity.getRect();
                            f5 = rectF.left;
                            ((Entity)object5).setOnTapTime(f4, f5);
                            object5 = this.iTrimLineCallback;
                            object5.onPlayVibration();
                        } else {
                            object5 = this.selectedEntity;
                            n9 = ((Entity)object5).getTrim_type();
                            if (n9 == n7) {
                                object5 = this.selectedEntity;
                                object4 = ((Entity)object5).getRect();
                                f4 = ((RectF)object4).right;
                                f5 = this.getSecond_in_screen();
                                int n11 = Math.round(f4 / f5) * 1000;
                                f4 = n11;
                                rectF = this.selectedEntity.getRect();
                                f5 = rectF.right;
                                ((Entity)object5).setOnTapTime(f4, f5);
                                object5 = this.iTrimLineCallback;
                                object5.onPlayVibration();
                            } else {
                                object5 = this.iTrimLineCallback;
                                object4 = this.selectedEntity;
                                object5.onSelectEntity((Entity)object4, 0.0f);
                            }
                        }
                    }
                    if ((n9 = (int)(((Entity)(object5 = this.selectedEntity)).isSelect() ? 1 : 0)) == 0) {
                        object5 = this.selectedEntity;
                        ((Entity)object5).setSelect(n7 != 0);
                        this.invalidate();
                    }
                    return;
                }
            }
            boolean bl3 = false;
            object4 = null;
            f4 = 0.0f;
            while (var11_16 < (n4 = (object3 = this.entityListQuran).size())) {
                object3 = (EntityQuranTimeline)this.entityListQuran.get((int)var11_16);
                if (object3 != (object2 = this.selectedEntity) && (n3 = ((Entity)object3).visible()) != 0) {
                    n3 = ((EntityQuranTimeline)object3).contains((PointF)object5) ? 1 : 0;
                    if (n3 == 0 && (n2 = ((EntityQuranTimeline)object3).getTrim_type()) == n5) {
                        n2 = n7;
                    } else {
                        n2 = 0;
                        entity = null;
                    }
                    this.isPassScroll = n2;
                    if (n3 != 0 || (n3 = ((EntityQuranTimeline)object3).getTrim_type()) != n5) {
                        ((Entity)object3).setCurrentRect();
                        ((Entity)object3).setSelect(n7 != 0);
                        f4 = ((PointF)object5).x;
                        ((Entity)object3).setDownX(f4);
                        object4 = this.iTrimLineCallback;
                        if (object4 != null) {
                            int n12 = ((Entity)object3).getTrim_type();
                            if (n12 == 0) {
                                f4 = ((Entity)object3).getRect().left;
                                f = this.getSecond_in_screen();
                                int n13 = Math.round(f4 / f) * 1000;
                                f4 = n13;
                                object2 = ((Entity)object3).getRect();
                                f = ((RectF)object2).left;
                                ((Entity)object3).setOnTapTime(f4, f);
                                object4 = this.iTrimLineCallback;
                                object4.onPlayVibration();
                            } else {
                                int n14 = ((Entity)object3).getTrim_type();
                                if (n14 == n7) {
                                    f4 = ((Entity)object3).getRect().right;
                                    f = this.getSecond_in_screen();
                                    int n15 = Math.round(f4 / f) * 1000;
                                    f4 = n15;
                                    object2 = ((Entity)object3).getRect();
                                    f = ((RectF)object2).right;
                                    ((Entity)object3).setOnTapTime(f4, f);
                                    object4 = this.iTrimLineCallback;
                                    object4.onPlayVibration();
                                } else {
                                    object4 = this.iTrimLineCallback;
                                    object4.onSelectEntity((Entity)object3, 0.0f);
                                }
                            }
                        }
                        break block60;
                    }
                }
                ++var11_16;
            }
            n4 = 0;
            f2 = 0.0f;
            object3 = null;
        }
        if (object3 == null) {
            void var11_23;
            boolean bl4 = false;
            object4 = null;
            f4 = 0.0f;
            while (var11_23 < (n3 = (object2 = this.entityListTrslQuran).size())) {
                object2 = (EntityTrslTimeline)this.entityListTrslQuran.get((int)var11_23);
                if (object2 != (entity = this.selectedEntity) && (n2 = (int)(((Entity)object2).visible() ? 1 : 0)) != 0) {
                    n2 = ((EntityTrslTimeline)object2).contains((PointF)object5) ? 1 : 0;
                    n = n2 == 0 && (n = ((EntityTrslTimeline)object2).getTrim_type()) == n5 ? n7 : 0;
                    this.isPassScroll = n;
                    if (n2 != 0 || (n2 = ((EntityTrslTimeline)object2).getTrim_type()) != n5) {
                        ((Entity)object2).setCurrentRect();
                        ((Entity)object2).setSelect(n7 != 0);
                        f4 = ((PointF)object5).x;
                        ((Entity)object2).setDownX(f4);
                        object4 = this.iTrimLineCallback;
                        if (object4 != null) {
                            int n16 = ((Entity)object2).getTrim_type();
                            if (n16 == 0) {
                                f4 = ((Entity)object2).getRect().left;
                                f2 = this.getSecond_in_screen();
                                int n17 = Math.round(f4 / f2) * 1000;
                                f4 = n17;
                                object3 = ((Entity)object2).getRect();
                                f2 = ((RectF)object3).left;
                                ((Entity)object2).setOnTapTime(f4, f2);
                                object4 = this.iTrimLineCallback;
                                object4.onPlayVibration();
                            } else {
                                int n18 = ((Entity)object2).getTrim_type();
                                if (n18 == n7) {
                                    f4 = ((Entity)object2).getRect().right;
                                    f2 = this.getSecond_in_screen();
                                    int n19 = Math.round(f4 / f2) * 1000;
                                    f4 = n19;
                                    object3 = ((Entity)object2).getRect();
                                    f2 = ((RectF)object3).right;
                                    ((Entity)object2).setOnTapTime(f4, f2);
                                    object4 = this.iTrimLineCallback;
                                    object4.onPlayVibration();
                                } else {
                                    object4 = this.iTrimLineCallback;
                                    object4.onSelectEntity((Entity)object2, 0.0f);
                                }
                            }
                        }
                        object3 = object2;
                        break;
                    }
                }
                ++var11_23;
            }
        }
        if (object3 == null) {
            void var11_30;
            boolean bl5 = false;
            object4 = null;
            f4 = 0.0f;
            while (var11_30 < (n3 = (object2 = this.entityListAudio).size())) {
                object2 = (EntityAudio)this.entityListAudio.get((int)var11_30);
                if (object2 != (entity = this.selectedEntity) && (n2 = (int)(((Entity)object2).visible() ? 1 : 0)) != 0) {
                    n2 = ((EntityAudio)object2).contains((PointF)object5) ? 1 : 0;
                    n = n2 == 0 && (n = ((EntityAudio)object2).getTrim_type()) == n5 ? n7 : 0;
                    this.isPassScroll = n;
                    if (n2 != 0 || (n2 = ((EntityAudio)object2).getTrim_type()) != n5) {
                        ((Entity)object2).setCurrentRect();
                        ((Entity)object2).setSelect(n7 != 0);
                        f4 = ((PointF)object5).x;
                        ((Entity)object2).setDownX(f4);
                        object4 = this.iTrimLineCallback;
                        if (object4 != null) {
                            int n20 = ((Entity)object2).getTrim_type();
                            if (n20 == 0) {
                                f4 = ((Entity)object2).getRect().left;
                                f2 = this.getSecond_in_screen();
                                int n21 = Math.round(f4 / f2) * 1000;
                                f4 = n21;
                                object3 = ((Entity)object2).getRect();
                                f2 = ((RectF)object3).left;
                                ((Entity)object2).setOnTapTime(f4, f2);
                                object4 = this.iTrimLineCallback;
                                object4.onPlayVibration();
                            } else {
                                int n22 = ((Entity)object2).getTrim_type();
                                if (n22 == n7) {
                                    f4 = ((Entity)object2).getRect().right;
                                    f2 = this.getSecond_in_screen();
                                    int n23 = Math.round(f4 / f2) * 1000;
                                    f4 = n23;
                                    object3 = ((Entity)object2).getRect();
                                    f2 = ((RectF)object3).right;
                                    ((Entity)object2).setOnTapTime(f4, f2);
                                    object4 = this.iTrimLineCallback;
                                    object4.onPlayVibration();
                                } else {
                                    object4 = this.iTrimLineCallback;
                                    object4.onSelectEntity((Entity)object2, 0.0f);
                                }
                            }
                        }
                        object3 = object2;
                        break;
                    }
                }
                ++var11_30;
            }
        }
        if (object3 == null && (bl2 = this.isExist((EntityBismilahTimeline)(object4 = this.bismilahTimeline)))) {
            int n24;
            object4 = this.bismilahTimeline;
            boolean bl6 = ((EntityBismilahTimeline)object4).contains((PointF)object5);
            if (!bl6 && (n3 = ((EntityBismilahTimeline)(object2 = this.bismilahTimeline)).getTrim_type()) == n5) {
                n3 = n7;
                f = f3;
            } else {
                n3 = 0;
                object2 = null;
                f = 0.0f;
            }
            this.isPassScroll = n3;
            if (bl6 || (n24 = ((EntityBismilahTimeline)(object4 = this.bismilahTimeline)).getTrim_type()) != n5) {
                object3 = this.bismilahTimeline;
                ((Entity)object3).setCurrentRect();
                ((Entity)object3).setSelect(n7 != 0);
                f4 = ((PointF)object5).x;
                ((Entity)object3).setDownX(f4);
                object4 = this.iTrimLineCallback;
                if (object4 != null) {
                    int n25 = ((Entity)object3).getTrim_type();
                    if (n25 == 0) {
                        f4 = ((Entity)object3).getRect().left;
                        f = this.getSecond_in_screen();
                        int n26 = Math.round(f4 / f) * 1000;
                        f4 = n26;
                        object2 = ((Entity)object3).getRect();
                        f = ((RectF)object2).left;
                        ((Entity)object3).setOnTapTime(f4, f);
                        object4 = this.iTrimLineCallback;
                        object4.onPlayVibration();
                    } else {
                        int n27 = ((Entity)object3).getTrim_type();
                        if (n27 == n7) {
                            f4 = ((Entity)object3).getRect().right;
                            f = this.getSecond_in_screen();
                            int n28 = Math.round(f4 / f) * 1000;
                            f4 = n28;
                            object2 = ((Entity)object3).getRect();
                            f = ((RectF)object2).right;
                            ((Entity)object3).setOnTapTime(f4, f);
                            object4 = this.iTrimLineCallback;
                            object4.onPlayVibration();
                        } else {
                            object4 = this.iTrimLineCallback;
                            object4.onSelectEntity((Entity)object3, 0.0f);
                        }
                    }
                }
            }
        }
        if (object3 == null && (bl = this.isExist((EntityBismilahTimeline)(object4 = this.mIsi3adaTimeline)))) {
            int n29;
            object4 = this.mIsi3adaTimeline;
            boolean bl7 = ((EntityBismilahTimeline)object4).contains((PointF)object5);
            if (!bl7 && (n3 = ((EntityBismilahTimeline)(object2 = this.mIsi3adaTimeline)).getTrim_type()) == n5) {
                n6 = n7;
            }
            this.isPassScroll = n6;
            if (bl7 || (n29 = ((EntityBismilahTimeline)(object4 = this.mIsi3adaTimeline)).getTrim_type()) != n5) {
                object3 = this.mIsi3adaTimeline;
                ((Entity)object3).setCurrentRect();
                ((Entity)object3).setSelect(n7 != 0);
                float f5 = ((PointF)object5).x;
                ((Entity)object3).setDownX(f5);
                object5 = this.iTrimLineCallback;
                if (object5 != null) {
                    int n30 = ((Entity)object3).getTrim_type();
                    if (n30 == 0) {
                        f3 = ((Entity)object3).getRect().left;
                        f5 = this.getSecond_in_screen();
                        n7 = Math.round(f3 / f5) * 1000;
                        f3 = n7;
                        object5 = ((Entity)object3).getRect();
                        f5 = ((RectF)object5).left;
                        ((Entity)object3).setOnTapTime(f3, f5);
                        object = this.iTrimLineCallback;
                        object.onPlayVibration();
                    } else {
                        n30 = ((Entity)object3).getTrim_type();
                        if (n30 == n7) {
                            f3 = ((Entity)object3).getRect().right;
                            f5 = this.getSecond_in_screen();
                            n7 = Math.round(f3 / f5) * 1000;
                            f3 = n7;
                            object5 = ((Entity)object3).getRect();
                            f5 = ((RectF)object5).right;
                            ((Entity)object3).setOnTapTime(f3, f5);
                            object = this.iTrimLineCallback;
                            object.onPlayVibration();
                        } else {
                            object = this.iTrimLineCallback;
                            object.onSelectEntity((Entity)object3, 0.0f);
                        }
                    }
                }
            }
        }
        if (object3 == null) {
            object = this.selectedEntity;
            if (object != null) {
                this.unselectEntity();
                this.invalidate();
            }
        } else {
            object = this.selectedEntity;
            if (object != object3) {
                this.unselectEntity();
                this.selectedEntity = object3;
                this.invalidate();
            }
        }
        if ((object = this.selectedEntity) == null && (object = this.iTrimLineCallback) != null) {
            object.onEmptySelect();
        }
    }

    public void updateWhenEffect(EntityAudio entityAudio) {
        int n = entityAudio.getIndex();
        int n2 = 1;
        float f = Float.MIN_VALUE;
        List list = this.entityListAudio;
        int n3 = list.size();
        if ((n += n2) < n3) {
            Object object = this.entityListAudio;
            n3 = entityAudio.getIndex() + n2;
            if ((object = this.getPreviewOrNextEntityAudio((List)object, n3, n2 != 0)) != null) {
                RectF rectF = entityAudio.getRect();
                f = rectF.right;
                list = ((EntityAudio)object).getRect();
                float f2 = ((RectF)list).left;
                float f3 = f - f2;
                n2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                if (n2 > 0) {
                    rectF = ((EntityAudio)object).getRect();
                    f = rectF.width();
                    f2 = entityAudio.getRect().right;
                    f += f2;
                    list = entityAudio.getRect();
                    f2 = ((RectF)list).right;
                    float f4 = ((EntityAudio)object).getRect().left;
                    f2 -= f4;
                    ((Entity)object).setCurrentRect();
                    RectF rectF2 = entityAudio.getRect();
                    f4 = rectF2.right;
                    ((EntityAudio)object).setX(f4);
                    ((EntityAudio)object).setRight(f);
                    for (int i = entityAudio.getIndex() + 2; i < (n = (object = this.entityListAudio).size()); ++i) {
                        object = (Entity)this.entityListAudio.get(i);
                        n2 = ((Entity)object).visible() ? 1 : 0;
                        if (n2 == 0) continue;
                        rectF = ((Entity)object).getRect();
                        f = rectF.left + f2;
                        rectF2 = ((Entity)object).getRect();
                        f4 = rectF2.width() + f;
                        ((Entity)object).setCurrentRect();
                        ((Entity)object).setX(f);
                        ((Entity)object).setRight(f4);
                    }
                }
            }
        }
    }

    public void update_current_cursur_position(int n) {
        this.current_cursur_position = n;
    }
}

