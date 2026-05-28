// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.PointF;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import android.util.Pair;
import hazem.nurmontage.videoquran.constant.EntityAction;
import android.graphics.Insets;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.os.Build$VERSION;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import android.view.GestureDetector$OnGestureListener;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import java.util.Locale;
import android.util.Log;
import hazem.nurmontage.videoquran.Utils.CanvasUtils;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.R$drawable;
import android.graphics.Canvas;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import java.util.Iterator;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import android.widget.Scroller;
import android.view.ScaleGestureDetector;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.animation.ObjectAnimator;
import android.view.GestureDetector$SimpleOnGestureListener;
import androidx.core.view.GestureDetectorCompat;
import java.util.List;
import java.util.Stack;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import android.os.Handler;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

public class TrackEntityView extends FrameLayout implements View$OnTouchListener
{
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
    private final GestureDetector$SimpleOnGestureListener gestureListener;
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
    
    public TrackEntityView(final Context context) {
        super(context);
        this.entityListAudio = new ArrayList();
        this.entityListQuran = new ArrayList();
        this.entityListTrslQuran = new ArrayList();
        this.entityList = new Stack();
        this.undoEntityList = new Stack();
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        this.exclusionRects = new ArrayList();
        final boolean b = true;
        this.isPassScroll = b;
        this.onThink = b;
        this.scaleFactor = 0.5f;
        this.paintItem = new Paint((int)(b ? 1 : 0));
        this.clr_select = -794718;
        final int n = -13421771;
        this.CLR_DEFAULT_BG = n;
        this.clr_btn_audio = n;
        this.clr_btn_quran = n;
        this.clr_btn_trsl = n;
        this.gestureListener = new TrackEntityView$3(this);
        this.init();
    }
    
    public TrackEntityView(final Context context, final AttributeSet set) {
        super(context, set);
        this.entityListAudio = new ArrayList();
        this.entityListQuran = new ArrayList();
        this.entityListTrslQuran = new ArrayList();
        this.entityList = new Stack();
        this.undoEntityList = new Stack();
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        this.exclusionRects = new ArrayList();
        final boolean b = true;
        this.isPassScroll = b;
        this.onThink = b;
        this.scaleFactor = 0.5f;
        this.paintItem = new Paint((int)(b ? 1 : 0));
        this.clr_select = -794718;
        final int n = -13421771;
        this.CLR_DEFAULT_BG = n;
        this.clr_btn_audio = n;
        this.clr_btn_quran = n;
        this.clr_btn_trsl = n;
        this.gestureListener = new TrackEntityView$3(this);
        this.init();
    }
    
    public TrackEntityView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.entityListAudio = new ArrayList();
        this.entityListQuran = new ArrayList();
        this.entityListTrslQuran = new ArrayList();
        this.entityList = new Stack();
        this.undoEntityList = new Stack();
        this.MAX_SCALE = 8.0f;
        this.MIN_SCALE = 0.09f;
        this.FACTOR_VITESSE = 180.0f;
        this.exclusionRects = new ArrayList();
        final boolean b = true;
        this.isPassScroll = b;
        this.onThink = b;
        this.scaleFactor = 0.5f;
        this.paintItem = new Paint((int)(b ? 1 : 0));
        this.clr_select = -794718;
        final int n2 = -13421771;
        this.CLR_DEFAULT_BG = n2;
        this.clr_btn_audio = n2;
        this.clr_btn_quran = n2;
        this.clr_btn_trsl = n2;
        this.gestureListener = new TrackEntityView$3(this);
        this.init();
    }
    
    private boolean deselectAllAudioItems() {
        final List entityListAudio = this.entityListAudio;
        if (entityListAudio == null) {
            return false;
        }
        final Iterator iterator = entityListAudio.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final EntityAudio entityAudio = (EntityAudio)iterator.next();
            if (!entityAudio.visible()) {
                continue;
            }
            if (!entityAudio.isSelect()) {
                continue;
            }
            entityAudio.setSelect(false);
            entityAudio.setSelectMultiple(false);
            b = true;
        }
        if (b) {
            this.clr_btn_audio = -13421771;
        }
        return b;
    }
    
    private boolean deselectAllQuranItems() {
        final boolean exist = this.isExist(this.bismilahTimeline);
        final boolean b = true;
        boolean b2;
        if (exist && this.bismilahTimeline.isSelect()) {
            this.bismilahTimeline.setSelect(false);
            this.bismilahTimeline.setSelectMultiple(false);
            b2 = b;
        }
        else {
            b2 = false;
        }
        if (this.isExist(this.mIsi3adaTimeline) && this.mIsi3adaTimeline.isSelect()) {
            this.mIsi3adaTimeline.setSelect(false);
            this.mIsi3adaTimeline.setSelectMultiple(false);
            b2 = b;
        }
        final List entityListQuran = this.entityListQuran;
        if (entityListQuran == null) {
            return b2;
        }
        for (final EntityQuranTimeline entityQuranTimeline : entityListQuran) {
            if (!entityQuranTimeline.visible()) {
                continue;
            }
            if (!entityQuranTimeline.isSelect()) {
                continue;
            }
            entityQuranTimeline.setSelect(false);
            entityQuranTimeline.setSelectMultiple(false);
            b2 = b;
        }
        if (b2) {
            this.clr_btn_quran = -13421771;
        }
        return b2;
    }
    
    private boolean deselectAllTrslQuranItems() {
        final List entityListTrslQuran = this.entityListTrslQuran;
        if (entityListTrslQuran == null) {
            return false;
        }
        final Iterator iterator = entityListTrslQuran.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)iterator.next();
            if (!entityTrslTimeline.visible()) {
                continue;
            }
            if (!entityTrslTimeline.isSelect()) {
                continue;
            }
            entityTrslTimeline.setSelect(false);
            entityTrslTimeline.setSelectMultiple(false);
            b = true;
        }
        if (b) {
            this.clr_btn_trsl = -13421771;
        }
        return b;
    }
    
    private void drawAllEntities(final Canvas canvas, final int n, final int n2) {
        float start_y_draw = this.start_y_draw;
        this.y = start_y_draw;
        final float scrolled_with_zoom = this.scrolled_with_zoom;
        final float centerX = this.centerX;
        final float n3 = -scrolled_with_zoom;
        final RectF rectF = new RectF(n3 - centerX, -this.mScrollY + this.y, n3 + centerX, canvas.getHeight() - this.mScrollY);
        int n4 = 0;
        boolean visible;
        while (true) {
            final int size = this.entityListAudio.size();
            visible = true;
            if (n4 >= size) {
                break;
            }
            final EntityAudio entityAudio = this.entityListAudio.get(n4);
            if (entityAudio.visible()) {
                float n5;
                float n6;
                if (this.selectedEntity == entityAudio && !this.isPlaying()) {
                    this.selectedEntity.setY(this.y);
                    this.selectedEntity.updateRect(this.scaleFactor);
                    n5 = entityAudio.getRect().bottom;
                    n6 = this.p;
                }
                else {
                    entityAudio.updateRect(this.scaleFactor);
                    if (entityAudio.isVisible()) {
                        if (Math.round(this.getCurrentPosition() + entityAudio.getRect().left) <= 0.0f && Math.round(this.getCurrentPosition() + entityAudio.getRect().right) > 0.0f) {
                            this.setupFade(entityAudio);
                        }
                        else {
                            entityAudio.setVisible(false);
                        }
                    }
                    else if (Math.round(entityAudio.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(entityAudio.getRect().right + this.getCurrentPosition()) > 0.0f) {
                        this.setupFade(entityAudio);
                        entityAudio.setVisible(visible);
                        this.iTrimLineCallback.onUpdatePlayerAudio(entityAudio);
                    }
                    entityAudio.setY(this.y);
                    if (RectF.intersects(rectF, entityAudio.getRect())) {
                        entityAudio.update(canvas);
                    }
                    n5 = entityAudio.getRect().bottom;
                    n6 = this.p;
                }
                start_y_draw = n5 + n6;
            }
            ++n4;
        }
        this.y = start_y_draw;
        float max = Math.max(this.start_y_draw, this.drawBasmala(canvas, rectF) + this.p);
        for (int i = 0; i < this.entityListQuran.size(); ++i) {
            final EntityQuranTimeline entityQuranTimeline = this.entityListQuran.get(i);
            if (entityQuranTimeline.visible()) {
                float n7;
                float n8;
                if (this.selectedEntity == entityQuranTimeline && !this.isPlaying()) {
                    entityQuranTimeline.updateRect(this.scaleFactor);
                    this.selectedEntity.setY(this.y);
                    n7 = entityQuranTimeline.getRect().bottom;
                    n8 = this.p;
                }
                else {
                    entityQuranTimeline.updateRect(this.scaleFactor);
                    if (entityQuranTimeline.getEntityView() != null) {
                        if (entityQuranTimeline.getEntityView().isVisible()) {
                            if (Math.round(this.getCurrentPosition() + entityQuranTimeline.getRect().left) <= 0.0f && Math.round(this.getCurrentPosition() + entityQuranTimeline.getRect().right) > 0.0f) {
                                this.setupAnimation(entityQuranTimeline.getQuranEntity());
                            }
                            else {
                                entityQuranTimeline.getEntityView().setVisible(false);
                                entityQuranTimeline.getQuranEntity().endAnimator();
                                this.iTrimLineCallback.onUpdate();
                            }
                        }
                        else if (Math.round(entityQuranTimeline.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(entityQuranTimeline.getRect().right + this.getCurrentPosition()) > 0.0f) {
                            this.setupAnimation(entityQuranTimeline.getQuranEntity());
                            entityQuranTimeline.getEntityView().setVisible(visible);
                            this.iTrimLineCallback.onUpdate();
                        }
                    }
                    entityQuranTimeline.setY(this.y);
                    if (RectF.intersects(rectF, entityQuranTimeline.getRect())) {
                        entityQuranTimeline.update(canvas);
                    }
                    n7 = entityQuranTimeline.getRect().bottom;
                    n8 = this.p;
                }
                max = n7 + n8;
            }
        }
        this.y = max;
        for (int j = 0; j < this.entityListTrslQuran.size(); ++j) {
            final EntityTrslTimeline entityTrslTimeline = this.entityListTrslQuran.get(j);
            if (entityTrslTimeline.visible()) {
                float n9;
                float n10;
                if (this.selectedEntity == entityTrslTimeline && !this.isPlaying()) {
                    entityTrslTimeline.updateRect(this.scaleFactor);
                    this.selectedEntity.setY(this.y);
                    n9 = entityTrslTimeline.getRect().bottom;
                    n10 = this.p;
                }
                else {
                    entityTrslTimeline.updateRect(this.scaleFactor);
                    if (entityTrslTimeline.getEntityView() != null) {
                        if (entityTrslTimeline.getEntityView().isVisible()) {
                            if (Math.round(this.getCurrentPosition() + entityTrslTimeline.getRect().left) > 0.0f || Math.round(this.getCurrentPosition() + entityTrslTimeline.getRect().right) <= 0.0f) {
                                entityTrslTimeline.getEntityView().setVisible(false);
                                entityTrslTimeline.getQuranEntity().endAnimator();
                                this.iTrimLineCallback.onUpdate();
                            }
                        }
                        else if (Math.round(entityTrslTimeline.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(entityTrslTimeline.getRect().right + this.getCurrentPosition()) > 0.0f) {
                            entityTrslTimeline.getEntityView().setVisible(visible);
                            this.iTrimLineCallback.onUpdate();
                        }
                    }
                    entityTrslTimeline.setY(this.y);
                    if (RectF.intersects(rectF, entityTrslTimeline.getRect())) {
                        entityTrslTimeline.update(canvas);
                    }
                    n9 = entityTrslTimeline.getRect().bottom;
                    n10 = this.p;
                }
                max = n9 + n10;
            }
        }
        this.y = max;
        if (this.selectedEntity != null && !this.isPlaying() && this.selectedEntity.visible()) {
            if (RectF.intersects(rectF, this.selectedEntity.getRect())) {
                final Entity selectedEntity = this.selectedEntity;
                if (selectedEntity instanceof EntityAudio) {
                    if (Math.round(selectedEntity.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(this.selectedEntity.getRect().right + this.getCurrentPosition()) > 0.0f) {
                        this.selectedEntity.setVisible(visible);
                    }
                    else {
                        this.selectedEntity.setVisible(false);
                    }
                }
                else if (selectedEntity.getEntityView() != null) {
                    if (Math.round(this.selectedEntity.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(this.selectedEntity.getRect().right + this.getCurrentPosition()) > 0.0f) {
                        this.selectedEntity.getEntityView().endAnimator();
                        if (!this.selectedEntity.getEntityView().isVisible()) {
                            this.selectedEntity.getEntityView().setVisible(visible);
                            this.iTrimLineCallback.onUpdate();
                        }
                    }
                    else if (this.selectedEntity.getEntityView().isVisible()) {
                        this.selectedEntity.getEntityView().endAnimator();
                        this.selectedEntity.getEntityView().setVisible(false);
                        this.iTrimLineCallback.onUpdate();
                    }
                }
                this.selectedEntity.update(canvas, n, n2);
            }
            else if (this.selectedEntity.getEntityView() != null && this.selectedEntity.getEntityView().isVisible()) {
                this.selectedEntity.getEntityView().endAnimator();
                this.selectedEntity.getEntityView().setVisible(false);
                this.iTrimLineCallback.onUpdate();
            }
        }
    }
    
    private float drawBasmala(final Canvas canvas, final RectF rectF) {
        final boolean exist = this.isExist(this.bismilahTimeline);
        final boolean b = true;
        float n;
        if (exist) {
            this.bismilahTimeline.updateRect(this.scaleFactor);
            if (this.bismilahTimeline.getEntityView() != null) {
                if (this.bismilahTimeline.getEntityView().isVisible()) {
                    if (Math.round(this.getCurrentPosition() + this.bismilahTimeline.getRect().left) <= 0.0f && Math.round(this.getCurrentPosition() + this.bismilahTimeline.getRect().right) > 0.0f) {
                        this.setupAnimation(this.bismilahTimeline.getQuranEntity());
                    }
                    else {
                        this.bismilahTimeline.getEntityView().setVisible(false);
                        this.bismilahTimeline.getQuranEntity().endAnimator();
                        this.iTrimLineCallback.onUpdate();
                    }
                }
                else if (Math.round(this.bismilahTimeline.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(this.bismilahTimeline.getRect().right + this.getCurrentPosition()) > 0.0f) {
                    this.setupAnimation(this.bismilahTimeline.getQuranEntity());
                    this.bismilahTimeline.getEntityView().setVisible(b);
                    this.iTrimLineCallback.onUpdate();
                }
            }
            this.bismilahTimeline.setY(this.y);
            if (RectF.intersects(rectF, this.bismilahTimeline.getRect())) {
                this.bismilahTimeline.update(canvas);
            }
            n = this.bismilahTimeline.getRect().bottom;
        }
        else {
            n = 0.0f;
        }
        if (this.isExist(this.mIsi3adaTimeline)) {
            this.mIsi3adaTimeline.updateRect(this.scaleFactor);
            if (this.mIsi3adaTimeline.getEntityView() != null) {
                if (this.mIsi3adaTimeline.getEntityView().isVisible()) {
                    if (Math.round(this.getCurrentPosition() + this.mIsi3adaTimeline.getRect().left) <= 0.0f && Math.round(this.getCurrentPosition() + this.mIsi3adaTimeline.getRect().right) > 0.0f) {
                        this.setupAnimation(this.mIsi3adaTimeline.getQuranEntity());
                    }
                    else {
                        this.mIsi3adaTimeline.getEntityView().setVisible(false);
                        this.mIsi3adaTimeline.getQuranEntity().endAnimator();
                        this.iTrimLineCallback.onUpdate();
                    }
                }
                else if (Math.round(this.mIsi3adaTimeline.getRect().left + this.getCurrentPosition()) <= 0.0f && Math.round(this.mIsi3adaTimeline.getRect().right + this.getCurrentPosition()) > 0.0f) {
                    this.setupAnimation(this.mIsi3adaTimeline.getQuranEntity());
                    this.mIsi3adaTimeline.getEntityView().setVisible(b);
                    this.iTrimLineCallback.onUpdate();
                }
            }
            this.mIsi3adaTimeline.setY(this.y);
            if (RectF.intersects(rectF, this.mIsi3adaTimeline.getRect())) {
                this.mIsi3adaTimeline.update(canvas);
            }
            n = this.mIsi3adaTimeline.getRect().bottom;
        }
        return n;
    }
    
    private void drawIconDrawable(final Canvas canvas) {
        final Paint paint = new Paint(1);
        paint.setColor(-14540254);
        final float n = (float)(int)(this.getWidth() * 0.015f);
        final int n2 = (int)(this.getWidth() * 0.03f);
        final int n3 = (int)(this.getWidth() * 0.104f);
        final int n4 = (int)this.start_y_draw;
        final float n5 = (float)n2;
        final RectF rectF = new RectF(n5, (float)n4, (float)(n2 + n3), (float)(n4 + n3));
        canvas.drawRoundRect(rectF, n, n, paint);
        final Drawable drawable = ContextCompat.getDrawable(this.getContext(), R$drawable.add_audio);
        final int n6 = -1052689;
        drawable.setTint(n6);
        drawable.setBounds((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        drawable.draw(canvas);
        final int n7 = (int)(rectF.bottom + n5);
        final RectF rectF2 = new RectF(rectF.left, (float)n7, rectF.right, (float)(n7 + n3));
        canvas.drawRoundRect(rectF2, n, n, paint);
        final Drawable drawable2 = ContextCompat.getDrawable(this.getContext(), R$drawable.add_quran);
        drawable2.setTint(n6);
        drawable2.setBounds((int)rectF2.left, (int)rectF2.top, (int)rectF2.right, (int)rectF2.bottom);
        drawable2.draw(canvas);
    }
    
    private void drawItemBtn(final Canvas canvas) {
        try {
            final EntityAudio audio = this.getAudio();
            final int n = -13421771;
            final float n2 = 0.6f;
            final float n3 = 0.15f;
            final float n4 = 2.0f;
            Label_0493: {
                if (audio == null) {
                    break Label_0493;
                }
                final RectF rect = audio.getRect();
                try {
                    final float top = rect.top;
                    try {
                        final float n5 = canvas.getWidth() * n3;
                        final RectF rect2 = audio.getRect();
                        try {
                            final float bottom = rect2.bottom;
                            try {
                                Label_0262: {
                                    if (this.rectItemAudio != null) {
                                        break Label_0262;
                                    }
                                    final RectF rectItemAudio = new RectF(0.0f, top, n5, bottom);
                                    try {
                                        this.rectItemAudio = rectItemAudio;
                                        final float n6 = rectItemAudio.width() * n3;
                                        final RectF rectItemAudio2 = this.rectItemAudio;
                                        try {
                                            final float n7 = rectItemAudio2.height() * n2;
                                            final float n8 = n5 - n6;
                                            final float n9 = n8 - n7;
                                            final RectF rectItemAudio3 = this.rectItemAudio;
                                            try {
                                                final float centerY = rectItemAudio3.centerY();
                                                final float n10 = n7 / n4;
                                                final float n11 = centerY - n10;
                                                final RectF rectItemAudio4 = this.rectItemAudio;
                                                try {
                                                    final RectF rectSquareAudio = new RectF(n9, n11, n8, rectItemAudio4.centerY() + n10);
                                                    try {
                                                        this.rectSquareAudio = rectSquareAudio;
                                                        final float n12 = 100.0f;
                                                        this.pathItemAudio = CanvasUtils.drawCustomRoundedRect(canvas, 0.0f, top, n5, bottom, n12, n12);
                                                        final Paint paintItem = this.paintItem;
                                                        try {
                                                            paintItem.setColor(this.clr_btn_audio);
                                                            final Path pathItemAudio = this.pathItemAudio;
                                                            try {
                                                                canvas.drawPath(pathItemAudio, this.paintItem);
                                                                this.paintItem.setColor(-3042963);
                                                                final RectF rectSquareAudio2 = this.rectSquareAudio;
                                                                try {
                                                                    canvas.drawRoundRect(rectSquareAudio2, n4, n4, this.paintItem);
                                                                    final RectF rectItemAudio5 = this.rectItemAudio;
                                                                    try {
                                                                        final float right = rectItemAudio5.right;
                                                                        try {
                                                                            final RectF rectSquareAudio3 = this.rectSquareAudio;
                                                                            try {
                                                                                final int n13 = (int)(right - rectSquareAudio3.right);
                                                                                if (this.clr_btn_audio == n) {
                                                                                    break Label_0493;
                                                                                }
                                                                                final Context context = this.getContext();
                                                                                try {
                                                                                    final Drawable drawable = ContextCompat.getDrawable(context, R$drawable.checked_timeline);
                                                                                    try {
                                                                                        final RectF rectSquareAudio4 = this.rectSquareAudio;
                                                                                        try {
                                                                                            final int n14 = (int)rectSquareAudio4.top;
                                                                                            final float n15 = (float)n13;
                                                                                            final RectF rectSquareAudio5 = this.rectSquareAudio;
                                                                                            try {
                                                                                                final int n16 = (int)(n15 + rectSquareAudio5.width());
                                                                                                final RectF rectSquareAudio6 = this.rectSquareAudio;
                                                                                                try {
                                                                                                    drawable.setBounds(n13, n14, n16, (int)rectSquareAudio6.bottom);
                                                                                                    final Drawable drawable2 = drawable;
                                                                                                    try {
                                                                                                        drawable2.draw(canvas);
                                                                                                        final boolean exist = this.isExist(this.bismilahTimeline);
                                                                                                        try {
                                                                                                            final boolean exist2 = this.isExist(this.mIsi3adaTimeline);
                                                                                                            final int n17 = -5253382;
                                                                                                            Label_1011: {
                                                                                                                if (exist || exist2) {
                                                                                                                    break Label_1011;
                                                                                                                }
                                                                                                                final EntityQuranTimeline quran = this.getQuran();
                                                                                                                Label_1486: {
                                                                                                                    if (quran == null) {
                                                                                                                        break Label_1486;
                                                                                                                    }
                                                                                                                    final RectF rect3 = quran.getRect();
                                                                                                                    try {
                                                                                                                        final float top2 = rect3.top;
                                                                                                                        try {
                                                                                                                            final float n18 = canvas.getWidth() * n3;
                                                                                                                            final RectF rect4 = quran.getRect();
                                                                                                                            try {
                                                                                                                                final float bottom2 = rect4.bottom;
                                                                                                                                try {
                                                                                                                                    final RectF rectFItemQuran = this.rectFItemQuran;
                                                                                                                                    Label_0790: {
                                                                                                                                        if (rectFItemQuran != null && rectFItemQuran.top == top2) {
                                                                                                                                            break Label_0790;
                                                                                                                                        }
                                                                                                                                        final RectF rectFItemQuran2 = new RectF(0.0f, top2, n18, bottom2);
                                                                                                                                        try {
                                                                                                                                            this.rectFItemQuran = rectFItemQuran2;
                                                                                                                                            final float n19 = rectFItemQuran2.width() * n3;
                                                                                                                                            final RectF rectFItemQuran3 = this.rectFItemQuran;
                                                                                                                                            try {
                                                                                                                                                final float n20 = rectFItemQuran3.height() * n2;
                                                                                                                                                final float n21 = n18 - n19;
                                                                                                                                                final float n22 = n21 - n20;
                                                                                                                                                final RectF rectFItemQuran4 = this.rectFItemQuran;
                                                                                                                                                try {
                                                                                                                                                    final float centerY2 = rectFItemQuran4.centerY();
                                                                                                                                                    final float n23 = n20 / n4;
                                                                                                                                                    final float n24 = centerY2 - n23;
                                                                                                                                                    final RectF rectFItemQuran5 = this.rectFItemQuran;
                                                                                                                                                    try {
                                                                                                                                                        final RectF rectSquareQuran = new RectF(n22, n24, n21, rectFItemQuran5.centerY() + n23);
                                                                                                                                                        try {
                                                                                                                                                            this.rectSquareQuran = rectSquareQuran;
                                                                                                                                                            final float n25 = 100.0f;
                                                                                                                                                            this.pathItemQuran = CanvasUtils.drawCustomRoundedRect(canvas, 0.0f, top2, n18, bottom2, n25, n25);
                                                                                                                                                            final Paint paintItem2 = this.paintItem;
                                                                                                                                                            try {
                                                                                                                                                                paintItem2.setColor(this.clr_btn_quran);
                                                                                                                                                                final Path pathItemQuran = this.pathItemQuran;
                                                                                                                                                                try {
                                                                                                                                                                    canvas.drawPath(pathItemQuran, this.paintItem);
                                                                                                                                                                    this.paintItem.setColor(n17);
                                                                                                                                                                    final RectF rectSquareQuran2 = this.rectSquareQuran;
                                                                                                                                                                    try {
                                                                                                                                                                        canvas.drawRoundRect(rectSquareQuran2, n4, n4, this.paintItem);
                                                                                                                                                                        if (this.clr_btn_quran == n) {
                                                                                                                                                                            break Label_1486;
                                                                                                                                                                        }
                                                                                                                                                                        final Context context2 = this.getContext();
                                                                                                                                                                        try {
                                                                                                                                                                            final Drawable drawable3 = ContextCompat.getDrawable(context2, R$drawable.checked_timeline);
                                                                                                                                                                            try {
                                                                                                                                                                                final RectF rectFItemQuran6 = this.rectFItemQuran;
                                                                                                                                                                                try {
                                                                                                                                                                                    final float right2 = rectFItemQuran6.right;
                                                                                                                                                                                    try {
                                                                                                                                                                                        final RectF rectSquareQuran3 = this.rectSquareQuran;
                                                                                                                                                                                        try {
                                                                                                                                                                                            final int n26 = (int)(right2 - rectSquareQuran3.right);
                                                                                                                                                                                            final RectF rectSquareQuran4 = this.rectSquareQuran;
                                                                                                                                                                                            try {
                                                                                                                                                                                                final int n27 = (int)rectSquareQuran4.top;
                                                                                                                                                                                                final float n28 = (float)n26;
                                                                                                                                                                                                final RectF rectSquareQuran5 = this.rectSquareQuran;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    final int n29 = (int)(n28 + rectSquareQuran5.width());
                                                                                                                                                                                                    final RectF rectSquareQuran6 = this.rectSquareQuran;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        drawable3.setBounds(n26, n27, n29, (int)rectSquareQuran6.bottom);
                                                                                                                                                                                                        final Drawable drawable4 = drawable3;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            drawable4.draw(canvas);
                                                                                                                                                                                                            break Label_1486;
                                                                                                                                                                                                        Label_1029_Outer:
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        final EntityBismilahTimeline entityBismilahTimeline;
                                                                                                                                                                                                                        final RectF rect5 = entityBismilahTimeline.getRect();
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            final float top3 = rect5.top;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                final float n30 = canvas.getWidth() * n3;
                                                                                                                                                                                                                                final RectF rect6 = entityBismilahTimeline.getRect();
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    final float bottom3 = rect6.bottom;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        final RectF rectFItemQuran7 = this.rectFItemQuran;
                                                                                                                                                                                                                                        Label_1268: {
                                                                                                                                                                                                                                            if (rectFItemQuran7 != null && rectFItemQuran7.top == top3) {
                                                                                                                                                                                                                                                break Label_1268;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            final RectF rectFItemQuran8 = new RectF(0.0f, top3, n30, bottom3);
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                this.rectFItemQuran = rectFItemQuran8;
                                                                                                                                                                                                                                                final float n31 = rectFItemQuran8.width() * n3;
                                                                                                                                                                                                                                                final RectF rectFItemQuran9 = this.rectFItemQuran;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    final float n32 = rectFItemQuran9.height() * n2;
                                                                                                                                                                                                                                                    final float n33 = n30 - n31;
                                                                                                                                                                                                                                                    final float n34 = n33 - n32;
                                                                                                                                                                                                                                                    final RectF rectFItemQuran10 = this.rectFItemQuran;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        final float centerY3 = rectFItemQuran10.centerY();
                                                                                                                                                                                                                                                        final float n35 = n32 / n4;
                                                                                                                                                                                                                                                        final float n36 = centerY3 - n35;
                                                                                                                                                                                                                                                        final RectF rectFItemQuran11 = this.rectFItemQuran;
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            final RectF rectSquareQuran7 = new RectF(n34, n36, n33, rectFItemQuran11.centerY() + n35);
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                this.rectSquareQuran = rectSquareQuran7;
                                                                                                                                                                                                                                                                final float n37 = 100.0f;
                                                                                                                                                                                                                                                                this.pathItemQuran = CanvasUtils.drawCustomRoundedRect(canvas, 0.0f, top3, n30, bottom3, n37, n37);
                                                                                                                                                                                                                                                                final Paint paintItem3 = this.paintItem;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    paintItem3.setColor(this.clr_btn_quran);
                                                                                                                                                                                                                                                                    final Path pathItemQuran2 = this.pathItemQuran;
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        canvas.drawPath(pathItemQuran2, this.paintItem);
                                                                                                                                                                                                                                                                        this.paintItem.setColor(n17);
                                                                                                                                                                                                                                                                        final RectF rectSquareQuran8 = this.rectSquareQuran;
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            canvas.drawRoundRect(rectSquareQuran8, n4, n4, this.paintItem);
                                                                                                                                                                                                                                                                            if (this.clr_btn_quran == n) {
                                                                                                                                                                                                                                                                                break Label_1486;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            final Context context3 = this.getContext();
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                final Drawable drawable5 = ContextCompat.getDrawable(context3, R$drawable.checked_timeline);
                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                    final RectF rectFItemQuran12 = this.rectFItemQuran;
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        final float right3 = rectFItemQuran12.right;
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            final RectF rectSquareQuran9 = this.rectSquareQuran;
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                final int n38 = (int)(right3 - rectSquareQuran9.right);
                                                                                                                                                                                                                                                                                                final RectF rectSquareQuran10 = this.rectSquareQuran;
                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                    final int n39 = (int)rectSquareQuran10.top;
                                                                                                                                                                                                                                                                                                    final float n40 = (float)n38;
                                                                                                                                                                                                                                                                                                    final RectF rectSquareQuran11 = this.rectSquareQuran;
                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                        final int n41 = (int)(n40 + rectSquareQuran11.width());
                                                                                                                                                                                                                                                                                                        final RectF rectSquareQuran12 = this.rectSquareQuran;
                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                            drawable5.setBounds(n38, n39, n41, (int)rectSquareQuran12.bottom);
                                                                                                                                                                                                                                                                                                            final Drawable drawable6 = drawable5;
                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                drawable6.draw(canvas);
                                                                                                                                                                                                                                                                                                                final EntityTrslTimeline trslQuran = this.getTrslQuran();
                                                                                                                                                                                                                                                                                                                if (trslQuran == null) {
                                                                                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                final RectF rect7 = trslQuran.getRect();
                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                    final float top4 = rect7.top;
                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                        final float n42 = canvas.getWidth() * n3;
                                                                                                                                                                                                                                                                                                                        final RectF rect8 = trslQuran.getRect();
                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                            final float bottom4 = rect8.bottom;
                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                final RectF rectFItemTrslQuran = this.rectFItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                Label_1729: {
                                                                                                                                                                                                                                                                                                                                    if (rectFItemTrslQuran != null && rectFItemTrslQuran.top == top4) {
                                                                                                                                                                                                                                                                                                                                        break Label_1729;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    final RectF rectFItemTrslQuran2 = new RectF(0.0f, top4, n42, bottom4);
                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                        this.rectFItemTrslQuran = rectFItemTrslQuran2;
                                                                                                                                                                                                                                                                                                                                        final float n43 = rectFItemTrslQuran2.width() * n3;
                                                                                                                                                                                                                                                                                                                                        final RectF rectFItemTrslQuran3 = this.rectFItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                            final float n44 = rectFItemTrslQuran3.height() * n2;
                                                                                                                                                                                                                                                                                                                                            final float n45 = n42 - n43;
                                                                                                                                                                                                                                                                                                                                            final float n46 = n45 - n44;
                                                                                                                                                                                                                                                                                                                                            final RectF rectFItemTrslQuran4 = this.rectFItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                final float centerY4 = rectFItemTrslQuran4.centerY();
                                                                                                                                                                                                                                                                                                                                                final float n47 = n44 / n4;
                                                                                                                                                                                                                                                                                                                                                final float n48 = centerY4 - n47;
                                                                                                                                                                                                                                                                                                                                                final RectF rectFItemTrslQuran5 = this.rectFItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                    final RectF rectSquareTrslQuran = new RectF(n46, n48, n45, rectFItemTrslQuran5.centerY() + n47);
                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                        this.rectSquareTrslQuran = rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                        final float n49 = 100.0f;
                                                                                                                                                                                                                                                                                                                                                        this.pathItemTrslQuran = CanvasUtils.drawCustomRoundedRect(canvas, 0.0f, top4, n42, bottom4, n49, n49);
                                                                                                                                                                                                                                                                                                                                                        final Paint paintItem4 = this.paintItem;
                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                            paintItem4.setColor(this.clr_btn_trsl);
                                                                                                                                                                                                                                                                                                                                                            final Path pathItemTrslQuran = this.pathItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                canvas.drawPath(pathItemTrslQuran, this.paintItem);
                                                                                                                                                                                                                                                                                                                                                                this.paintItem.setColor(-67133);
                                                                                                                                                                                                                                                                                                                                                                final RectF rectSquareTrslQuran2 = this.rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                    canvas.drawRoundRect(rectSquareTrslQuran2, n4, n4, this.paintItem);
                                                                                                                                                                                                                                                                                                                                                                    if (this.clr_btn_trsl == n) {
                                                                                                                                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    final Context context4 = this.getContext();
                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                        final Drawable drawable7 = ContextCompat.getDrawable(context4, R$drawable.checked_timeline);
                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                            final RectF rectFItemTrslQuran6 = this.rectFItemTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                final float right4 = rectFItemTrslQuran6.right;
                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                    final RectF rectSquareTrslQuran3 = this.rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                        final int n50 = (int)(right4 - rectSquareTrslQuran3.right);
                                                                                                                                                                                                                                                                                                                                                                                        final RectF rectSquareTrslQuran4 = this.rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                            final int n51 = (int)rectSquareTrslQuran4.top;
                                                                                                                                                                                                                                                                                                                                                                                            final float n52 = (float)n50;
                                                                                                                                                                                                                                                                                                                                                                                            final RectF rectSquareTrslQuran5 = this.rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                final int n53 = (int)(n52 + rectSquareTrslQuran5.width());
                                                                                                                                                                                                                                                                                                                                                                                                final RectF rectSquareTrslQuran6 = this.rectSquareTrslQuran;
                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                    drawable7.setBounds(n50, n51, n53, (int)rectSquareTrslQuran6.bottom);
                                                                                                                                                                                                                                                                                                                                                                                                    final Drawable drawable8 = drawable7;
                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                        drawable8.draw(canvas);
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    catch (final Exception ex) {
                                                                                                                                                                                                                                                                                                                                                                                                        Log.e("mException", "drawItemBtn");
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                catch (final Exception ex2) {}
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            catch (final Exception ex3) {}
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        catch (final Exception ex4) {}
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    catch (final Exception ex5) {}
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                catch (final Exception ex6) {}
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            catch (final Exception ex7) {}
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        catch (final Exception ex8) {}
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    catch (final Exception ex9) {}
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                catch (final Exception ex10) {}
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            catch (final Exception ex11) {}
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        catch (final Exception ex12) {}
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    catch (final Exception ex13) {}
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                catch (final Exception ex14) {}
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            catch (final Exception ex15) {}
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        catch (final Exception ex16) {}
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    catch (final Exception ex17) {}
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            catch (final Exception ex18) {}
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        catch (final Exception ex19) {}
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    catch (final Exception ex20) {}
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                catch (final Exception ex21) {}
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            catch (final Exception ex22) {}
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        catch (final Exception ex23) {}
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    catch (final Exception ex24) {}
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                catch (final Exception ex25) {}
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            catch (final Exception ex26) {}
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        catch (final Exception ex27) {}
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    catch (final Exception ex28) {}
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                catch (final Exception ex29) {}
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch (final Exception ex30) {}
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (final Exception ex31) {}
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    catch (final Exception ex32) {}
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (final Exception ex33) {}
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (final Exception ex34) {}
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (final Exception ex35) {}
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (final Exception ex36) {}
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (final Exception ex37) {}
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (final Exception ex38) {}
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (final Exception ex39) {}
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (final Exception ex40) {}
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (final Exception ex41) {}
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (final Exception ex42) {}
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (final Exception ex43) {}
                                                                                                                                                                                                                    final EntityBismilahTimeline entityBismilahTimeline = this.bismilahTimeline;
                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                Label_1024: {
                                                                                                                                                                                                                    final EntityBismilahTimeline entityBismilahTimeline = this.mIsi3adaTimeline;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                continue Label_1029_Outer;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            iftrue(Label_1024:)(!exist);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (final Exception ex44) {}
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception ex45) {}
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (final Exception ex46) {}
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (final Exception ex47) {}
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex48) {}
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final Exception ex49) {}
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex50) {}
                                                                                                                                                                            }
                                                                                                                                                                            catch (final Exception ex51) {}
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex52) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex53) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex54) {}
                                                                                                                                                            }
                                                                                                                                                            catch (final Exception ex55) {}
                                                                                                                                                        }
                                                                                                                                                        catch (final Exception ex56) {}
                                                                                                                                                    }
                                                                                                                                                    catch (final Exception ex57) {}
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex58) {}
                                                                                                                                            }
                                                                                                                                            catch (final Exception ex59) {}
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex60) {}
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (final Exception ex61) {}
                                                                                                                            }
                                                                                                                            catch (final Exception ex62) {}
                                                                                                                        }
                                                                                                                        catch (final Exception ex63) {}
                                                                                                                    }
                                                                                                                    catch (final Exception ex64) {}
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        catch (final Exception ex65) {}
                                                                                                    }
                                                                                                    catch (final Exception ex66) {}
                                                                                                }
                                                                                                catch (final Exception ex67) {}
                                                                                            }
                                                                                            catch (final Exception ex68) {}
                                                                                        }
                                                                                        catch (final Exception ex69) {}
                                                                                    }
                                                                                    catch (final Exception ex70) {}
                                                                                }
                                                                                catch (final Exception ex71) {}
                                                                            }
                                                                            catch (final Exception ex72) {}
                                                                        }
                                                                        catch (final Exception ex73) {}
                                                                    }
                                                                    catch (final Exception ex74) {}
                                                                }
                                                                catch (final Exception ex75) {}
                                                            }
                                                            catch (final Exception ex76) {}
                                                        }
                                                        catch (final Exception ex77) {}
                                                    }
                                                    catch (final Exception ex78) {}
                                                }
                                                catch (final Exception ex79) {}
                                            }
                                            catch (final Exception ex80) {}
                                        }
                                        catch (final Exception ex81) {}
                                    }
                                    catch (final Exception ex82) {}
                                }
                            }
                            catch (final Exception ex83) {}
                        }
                        catch (final Exception ex84) {}
                    }
                    catch (final Exception ex85) {}
                }
                catch (final Exception ex86) {}
            }
        }
        catch (final Exception ex87) {}
    }
    
    private void drawMarker(final Canvas canvas, float posY, final float n) {
        final float n2 = posY + this.paintMaker.getStrokeWidth();
        posY = this.posY;
        final float n3 = posY + this.m_pos_y_marker;
        canvas.drawLine(n2, n3, n2, n3 + n, this.paintMaker);
    }
    
    private void drawTimeBar(final Canvas canvas, final int n, final int n2, final float n3) {
        final float scaleFactor = this.scaleFactor;
        float n4 = 4.0f;
        final float n5 = fcmpl(scaleFactor, n4);
        final float n6 = 0.25f;
        final float n7 = 2.0f;
        if (n5 >= 0) {
            n4 = n6;
        }
        else if (scaleFactor >= n7) {
            n4 = 0.5f;
        }
        else if (scaleFactor >= 0.8f) {
            n4 = n7;
        }
        else if (scaleFactor < 0.4f) {
            if (scaleFactor > n6) {
                n4 = 6.0f;
            }
            else {
                n4 = 8.0f;
            }
        }
        final float n8 = (float)n;
        float n9 = n8 - n8 % n4;
        final float n10 = n3 * n4 * 0.2f;
        while (n9 <= n2) {
            final float n11 = n9 * n3;
            final float n12 = n11 / n3;
            this.drawMarker(canvas, n11, this.markerHeight);
            String s;
            if (this.isArabic_lang) {
                s = this.formatTimeLabelArabic(n12);
            }
            else {
                s = this.formatTimeLabel(n12);
            }
            canvas.drawText(s, n11 - this.w_time_item, this.posY, this.paint_time);
            for (int i = 1; i <= 4; ++i) {
                this.drawMarker(canvas, i * n10 + n11, this.markerHeight / n7);
            }
            n9 += n4;
        }
    }
    
    private String formatTimeLabel(float a) {
        final float n = 60.0f;
        if (a < n) {
            final double n2 = Math.abs(a - 14.0f);
            final double n3 = 0.01;
            if (n2 < n3) {
                return String.format(Locale.ENGLISH, "14s", new Object[0]);
            }
            if (Math.abs(a - Math.round(a)) < n3) {
                return String.format(Locale.ENGLISH, "%ds", (int)a);
            }
            return String.format(Locale.ENGLISH, "%.2fs", a);
        }
        else {
            final int n4 = (int)(a / n);
            a %= n;
            final int round = Math.round(a);
            if (round == 0) {
                return String.format(Locale.ENGLISH, "%dm", n4);
            }
            return String.format(Locale.ENGLISH, "%dm %ds", n4, round);
        }
    }
    
    private String formatTimeLabelArabic(float a) {
        final float n = 60.0f;
        if (a < n) {
            final double n2 = Math.abs(a - 14.0f);
            final double n3 = 0.01;
            if (n2 < n3) {
                return String.format(Locale.ENGLISH, "14\u062b", new Object[0]);
            }
            if (Math.abs(a - Math.round(a)) < n3) {
                return String.format(Locale.ENGLISH, "%d\u062b", (int)a);
            }
            return String.format(Locale.ENGLISH, "%.2f\u062b", a);
        }
        else {
            final int n4 = (int)(a / n);
            a %= n;
            final int round = Math.round(a);
            if (round == 0) {
                return String.format(Locale.ENGLISH, "%d\u062f", n4);
            }
            return String.format(Locale.ENGLISH, "%d\u062f %d\u062b", n4, round);
        }
    }
    
    private boolean handleItemInteraction(float n, float n2) {
        final RectF rectFItemQuran = this.rectFItemQuran;
        int n3 = 1;
        final float n4 = Float.MIN_VALUE;
        int n5;
        if (rectFItemQuran != null && rectFItemQuran.contains(n, n2)) {
            n5 = n3;
        }
        else {
            n5 = 0;
        }
        final RectF rectItemAudio = this.rectItemAudio;
        final boolean b = rectItemAudio != null && rectItemAudio.contains(n, n2) && n3;
        final RectF rectFItemTrslQuran = this.rectFItemTrslQuran;
        int n6;
        if (rectFItemTrslQuran != null && rectFItemTrslQuran.contains(n, n2)) {
            n6 = n3;
            n = n4;
        }
        else {
            n6 = 0;
            n = 0.0f;
        }
        int n7;
        int n8;
        if (n5 == 0 && !b && n6 == 0) {
            final boolean deselectAllQuranItems = this.deselectAllQuranItems();
            final boolean deselectAllAudioItems = this.deselectAllAudioItems();
            final boolean deselectAllTrslQuranItems = this.deselectAllTrslQuranItems();
            if (!deselectAllQuranItems && !deselectAllAudioItems && !deselectAllTrslQuranItems) {
                n7 = 0;
                n2 = 0.0f;
            }
            else {
                n7 = n3;
                n2 = n4;
            }
            n8 = 0;
        }
        else {
            final Entity selectedEntity = this.selectedEntity;
            if (selectedEntity != null) {
                selectedEntity.setSelect(false);
            }
            int processQuranItemsSelection;
            if (n5 != 0) {
                processQuranItemsSelection = this.processQuranItemsSelection();
            }
            else {
                processQuranItemsSelection = 0;
                n2 = 0.0f;
            }
            if (b) {
                processQuranItemsSelection += this.processAudioItemsSelection();
            }
            if (n6 != 0) {
                processQuranItemsSelection += this.processTrslQuranItemsSelection();
            }
            n8 = processQuranItemsSelection;
            n7 = n3;
            n2 = n4;
        }
        if (n7 != 0) {
            final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
            if (iTrimLineCallback != null && (n5 != 0 || b || n6)) {
                this.selectedEntity = null;
                iTrimLineCallback.onSelectMultiple(n8);
            }
            this.invalidate();
        }
        if (n5 == 0 && !b) {
            if (n6 == 0) {
                n3 = 0;
            }
        }
        return n3 != 0;
    }
    
    private void init() {
        this.maxTime = -1;
        this.TOLERANCE_X = 0.95f;
        this.entityListAudio = new ArrayList();
        final long n = 0L;
        this.lastTime = n;
        this.lastDifference = n;
        this.setWillNotDraw(false);
        this.initAutoScroll();
        this.setOnTouchListener((View$OnTouchListener)this);
        this.scaleGestureDetector = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector$OnScaleGestureListener)new TrackEntityView$ScaleListener(this, null));
        this.gestureDetector = new GestureDetectorCompat(this.getContext(), (GestureDetector$OnGestureListener)this.gestureListener);
        this.scroller = new Scroller(this.getContext());
    }
    
    private void initAutoScroll() {
        this.autoScrollHandler = new Handler();
        this.autoScrollRunnable = new TrackEntityView$1(this);
        this.autoMoveRunnable = new TrackEntityView$2(this);
    }
    
    private void mDraw(final Canvas canvas) {
        canvas.drawColor(-15658735);
        canvas.save();
        final float second_in_screen = this.getSecond_in_screen();
        canvas.translate(this.centerX + this.scrolled_with_zoom, (float)this.getPaddingTop());
        int n = (int)((Math.abs(this.scrolled_with_zoom) - this.centerX) / second_in_screen);
        final int n2 = (int)((Math.abs(this.scrolled_with_zoom) + this.centerX) / second_in_screen) + 1;
        if (n < 0) {
            n = 0;
        }
        this.drawTimeBar(canvas, n, n2, second_in_screen);
        canvas.clipRect(-this.second_in_screen, this.canvas_top_Y, this.getWidth() - this.scrolled_with_zoom, this.getHeight() - this.mScrollY);
        canvas.translate(0.0f, this.mScrollY);
        this.drawAllEntities(canvas, n, n2);
        if (this.isCheckLine) {
            final float startXLine = this.startXLine;
            canvas.drawLine(startXLine, 0.0f, startXLine, this.getHeight() - this.mScrollY, this.paintLineCheck);
        }
        canvas.restore();
        if (this.isCheckLineCursur) {
            this.paintCursur.setColor(this.paintLineCheck.getColor());
            canvas.drawLine(this.centerX + this.paintMaker.getStrokeWidth(), this.posY + this.m_pos_y_marker + this.paintMaker.getStrokeWidth(), this.centerX, (float)this.getHeight(), this.paintCursur);
        }
        else {
            this.paintCursur.setColor(-1);
            canvas.drawLine(this.centerX + this.paintMaker.getStrokeWidth(), this.posY + this.m_pos_y_marker + this.paintMaker.getStrokeWidth(), this.centerX, (float)this.getHeight(), this.paintCursur);
        }
    }
    
    private int processAudioItemsSelection() {
        final List entityListAudio = this.entityListAudio;
        int n = 0;
        if (entityListAudio == null) {
            return 0;
        }
        for (final EntityAudio entityAudio : entityListAudio) {
            if (!entityAudio.visible()) {
                continue;
            }
            final boolean select = entityAudio.isSelect();
            entityAudio.setSelect(select ^ true);
            entityAudio.setSelectMultiple(select ^ true);
            if (!entityAudio.isSelect()) {
                continue;
            }
            ++n;
        }
        if (n > 0) {
            this.clr_btn_audio = -794718;
        }
        else {
            this.clr_btn_audio = -13421771;
        }
        return n;
    }
    
    private int processQuranItemsSelection() {
        final List entityListQuran = this.entityListQuran;
        int n = 0;
        if (entityListQuran == null) {
            return 0;
        }
        for (final EntityQuranTimeline entityQuranTimeline : entityListQuran) {
            if (!entityQuranTimeline.visible()) {
                continue;
            }
            final boolean select = entityQuranTimeline.isSelect();
            entityQuranTimeline.setSelect(select ^ true);
            entityQuranTimeline.setSelectMultiple(select ^ true);
            if (!entityQuranTimeline.isSelect()) {
                continue;
            }
            ++n;
        }
        if (this.isExist(this.bismilahTimeline)) {
            final boolean select2 = this.bismilahTimeline.isSelect();
            this.bismilahTimeline.setSelect(select2 ^ true);
            this.bismilahTimeline.setSelectMultiple(select2 ^ true);
            if (this.bismilahTimeline.isSelect()) {
                ++n;
            }
        }
        if (this.isExist(this.mIsi3adaTimeline)) {
            final boolean select3 = this.mIsi3adaTimeline.isSelect();
            this.mIsi3adaTimeline.setSelect(select3 ^ true);
            this.mIsi3adaTimeline.setSelectMultiple(select3 ^ true);
            if (this.mIsi3adaTimeline.isSelect()) {
                ++n;
            }
        }
        if (n > 0) {
            this.clr_btn_quran = -794718;
        }
        else {
            this.clr_btn_quran = -13421771;
        }
        return n;
    }
    
    private int processTrslQuranItemsSelection() {
        final List entityListTrslQuran = this.entityListTrslQuran;
        int n = 0;
        if (entityListTrslQuran == null) {
            return 0;
        }
        for (final EntityTrslTimeline entityTrslTimeline : entityListTrslQuran) {
            if (!entityTrslTimeline.visible()) {
                continue;
            }
            final boolean select = entityTrslTimeline.isSelect();
            entityTrslTimeline.setSelect(select ^ true);
            entityTrslTimeline.setSelectMultiple(select ^ true);
            if (!entityTrslTimeline.isSelect()) {
                continue;
            }
            ++n;
        }
        if (n > 0) {
            this.clr_btn_trsl = -794718;
        }
        else {
            this.clr_btn_trsl = -13421771;
        }
        return n;
    }
    
    private void setupAnimation(final BismilahEntity bismilahEntity) {
        if (this.isPlaying() && bismilahEntity.getBismilahTimeline().getTransition() != null) {
            if (!bismilahEntity.isAnimRun()) {
                final Transition transition = bismilahEntity.getBismilahTimeline().getTransition();
                final float n = this.getCurrentPosition() / this.getSecond_in_screen();
                final float n2 = 1000.0f;
                final float n3 = (float)Math.abs(Math.round(n * n2));
                final boolean in = transition.isIn();
                final float n4 = 0.5f;
                if (in) {
                    final int round = Math.round(bismilahEntity.getBismilahTimeline().getRect().left / this.getSecond_in_screen() * n2);
                    final int n5 = (int)(transition.getDuration_in() * n2);
                    final float n6 = (float)round;
                    if (n3 < n5 * n4 + n6) {
                        bismilahEntity.runIn(n5, false, transition.getType_in());
                    }
                    else if (!transition.isOut() && (n3 < n6 || n3 >= round + n5)) {
                        bismilahEntity.endAnimator();
                    }
                }
                if (bismilahEntity.isAnimRun()) {
                    return;
                }
                if (transition.isOut()) {
                    final int n7 = (int)(bismilahEntity.getBismilahTimeline().getRect().right / this.getSecond_in_screen() * n2);
                    final int n8 = (int)(transition.getDuration_out() * n2);
                    final float n9 = (float)(n7 - n8);
                    final float n10 = n8 * n4 + n9;
                    if (n3 >= n9 && n3 < n10) {
                        bismilahEntity.runOut(n8, false, transition.getType_out());
                    }
                    else if (n3 >= n7) {
                        bismilahEntity.endAnimator();
                    }
                }
            }
        }
    }
    
    private void setupAnimation(final QuranEntity quranEntity) {
        if (this.isPlaying() && quranEntity.getEntityQuran().getTransition() != null) {
            if (!quranEntity.isAnimRun()) {
                final Transition transition = quranEntity.getEntityQuran().getTransition();
                final float n = this.getCurrentPosition() / this.getSecond_in_screen();
                final float n2 = 1000.0f;
                final float n3 = (float)Math.abs(Math.round(n * n2));
                final boolean in = transition.isIn();
                final float n4 = 0.5f;
                if (in) {
                    final int round = Math.round(quranEntity.getEntityQuran().getRect().left / this.getSecond_in_screen() * n2);
                    final int n5 = (int)(transition.getDuration_in() * n2);
                    final float n6 = (float)round;
                    if (n3 < n5 * n4 + n6) {
                        quranEntity.runIn(n5, false, transition.getType_in());
                    }
                    else if (!transition.isOut() && (n3 < n6 || n3 >= round + n5)) {
                        quranEntity.endAnimator();
                    }
                }
                if (quranEntity.isAnimRun()) {
                    return;
                }
                if (transition.isOut()) {
                    final int n7 = (int)(quranEntity.getEntityQuran().getRect().right / this.getSecond_in_screen() * n2);
                    final int n8 = (int)(transition.getDuration_out() * n2);
                    final float n9 = (float)(n7 - n8);
                    final float n10 = n8 * n4 + n9;
                    if (n3 >= n9 && n3 < n10) {
                        quranEntity.runOut(n8, false, transition.getType_out());
                    }
                    else if (n3 >= n7) {
                        quranEntity.endAnimator();
                    }
                }
            }
        }
    }
    
    private void setupFade(final EntityAudio entityAudio) {
    }
    
    private void updateGestureExclusion() {
        try {
            if (Build$VERSION.SDK_INT < 29) {
                return;
            }
            final List exclusionRects = this.exclusionRects;
            try {
                exclusionRects.clear();
                final WindowInsets rootWindowInsets = this.getRootWindowInsets();
                try {
                    final Insets systemGestureInsets = rootWindowInsets.getSystemGestureInsets();
                    try {
                        try {
                            final int left = systemGestureInsets.left;
                            try {
                                final Rect rect = new Rect(0, 0, left, this.getHeight());
                                try {
                                    final int right = this.getRight();
                                    try {
                                        final int n = right - systemGestureInsets.right;
                                        final int right2 = this.getRight();
                                        try {
                                            final Rect rect2 = new Rect(n, 0, right2, this.getHeight());
                                            this.exclusionRects.add(rect);
                                            this.exclusionRects.add(rect2);
                                            this.setSystemGestureExclusionRects(this.exclusionRects);
                                        }
                                        catch (final Exception ex) {}
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
            catch (final Exception ex8) {}
        }
        catch (final Exception ex9) {}
    }
    
    private void updateIndex() {
        for (int i = 0; i < this.entityListQuran.size(); ++i) {
            final EntityQuranTimeline entityQuranTimeline = this.entityListQuran.get(i);
            entityQuranTimeline.setIndex(i);
            entityQuranTimeline.getQuranEntity().setIndex(i);
        }
    }
    
    private void updateMediaIndex() {
        for (int i = 0; i < this.entityListAudio.size(); ++i) {
            ((EntityAudio)this.entityListAudio.get(i)).setIndex(i);
        }
    }
    
    private void updateTrslIndex() {
        for (int i = 0; i < this.entityListTrslQuran.size(); ++i) {
            final EntityTrslTimeline entityTrslTimeline = this.entityListTrslQuran.get(i);
            entityTrslTimeline.setIndex(i);
            entityTrslTimeline.getQuranEntity().setIndex(i);
        }
    }
    
    public void addAudio(final EntityAudio entityAudio) {
        this.entityListAudio.add(entityAudio);
        entityAudio.setIndex(this.entityListAudio.size() - 1);
        this.entityList.push(new Pair((Object)entityAudio, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void addAudio(final EntityAudio entityAudio, int index) {
        if (index < this.entityListAudio.size()) {
            entityAudio.setIndex(index);
            this.entityListAudio.add(index, entityAudio);
            float x = entityAudio.getRect().right;
            while (true) {
                ++index;
                if (index >= this.entityListAudio.size()) {
                    break;
                }
                final EntityAudio entityAudio2 = this.entityListAudio.get(index);
                if (!entityAudio2.visible()) {
                    continue;
                }
                final float width = entityAudio2.getRect().width();
                entityAudio2.setCurrentRect();
                entityAudio2.setX(x);
                entityAudio2.setRight(x + width);
                entityAudio2.setIndex(index);
                x = entityAudio2.getRect().right;
            }
        }
        else {
            entityAudio.setIndex(index);
            this.entityListAudio.add(entityAudio);
        }
        this.entityList.push(new Pair((Object)entityAudio, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void addQuran(final EntityQuranTimeline entityQuranTimeline) {
        this.entityListQuran.add(entityQuranTimeline);
        entityQuranTimeline.setIndex(this.entityListQuran.size() - 1);
        this.entityList.push(new Pair((Object)entityQuranTimeline, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void addQuran(final EntityQuranTimeline entityQuranTimeline, int index) {
        if (index < this.entityListQuran.size()) {
            entityQuranTimeline.setIndex(index);
            this.entityListQuran.add(index, entityQuranTimeline);
            float x = entityQuranTimeline.getRect().right;
            while (true) {
                ++index;
                if (index >= this.entityListQuran.size()) {
                    break;
                }
                final EntityQuranTimeline entityQuranTimeline2 = this.entityListQuran.get(index);
                if (!entityQuranTimeline2.visible()) {
                    continue;
                }
                final float width = entityQuranTimeline2.getRect().width();
                entityQuranTimeline2.setCurrentRect();
                entityQuranTimeline2.setX(x);
                entityQuranTimeline2.setRight(x + width);
                entityQuranTimeline2.setIndex(index);
                x = entityQuranTimeline2.getRect().right;
            }
        }
        else {
            entityQuranTimeline.setIndex(index);
            this.entityListQuran.add(entityQuranTimeline);
        }
        this.entityList.push(new Pair((Object)entityQuranTimeline, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void addQuran_split(final EntityQuranTimeline entityQuranTimeline, int index) {
        if (index < this.entityListQuran.size()) {
            entityQuranTimeline.setIndex(index);
            this.entityListQuran.add(index, entityQuranTimeline);
            while (true) {
                ++index;
                if (index >= this.entityListQuran.size()) {
                    break;
                }
                final EntityQuranTimeline entityQuranTimeline2 = this.entityListQuran.get(index);
                if (!entityQuranTimeline2.visible()) {
                    continue;
                }
                entityQuranTimeline2.setIndex(index);
            }
        }
        else {
            entityQuranTimeline.setIndex(index);
            this.entityListQuran.add(entityQuranTimeline);
        }
        this.entityList.push(new Pair((Object)entityQuranTimeline, (Object)EntityAction.SPLIT));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.SPLIT);
        }
    }
    
    public void addQuran_split(final EntityTrslTimeline entityTrslTimeline, int index) {
        if (index < this.entityListTrslQuran.size()) {
            entityTrslTimeline.setIndex(index);
            this.entityListTrslQuran.add(index, entityTrslTimeline);
            while (true) {
                ++index;
                if (index >= this.entityListTrslQuran.size()) {
                    break;
                }
                final EntityTrslTimeline entityTrslTimeline2 = this.entityListTrslQuran.get(index);
                if (!entityTrslTimeline2.visible()) {
                    continue;
                }
                entityTrslTimeline2.setIndex(index);
            }
        }
        else {
            entityTrslTimeline.setIndex(index);
            this.entityListTrslQuran.add(entityTrslTimeline);
        }
        this.entityList.push(new Pair((Object)entityTrslTimeline, (Object)EntityAction.SPLIT));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.SPLIT);
        }
    }
    
    public void addStack(final Entity entity, final EntityAction entityAction) {
        this.entityList.push(new Pair((Object)entity, (Object)entityAction));
    }
    
    public void addTrslQuran(final EntityTrslTimeline entityTrslTimeline) {
        this.entityListTrslQuran.add(entityTrslTimeline);
        entityTrslTimeline.setIndex(this.entityListTrslQuran.size() - 1);
        this.entityList.push(new Pair((Object)entityTrslTimeline, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void addTrslQuran(final EntityTrslTimeline entityTrslTimeline, int index) {
        if (index < this.entityListTrslQuran.size()) {
            entityTrslTimeline.setIndex(index);
            this.entityListTrslQuran.add(index, entityTrslTimeline);
            float x = entityTrslTimeline.getRect().right;
            while (true) {
                ++index;
                if (index >= this.entityListTrslQuran.size()) {
                    break;
                }
                final EntityTrslTimeline entityTrslTimeline2 = this.entityListTrslQuran.get(index);
                if (!entityTrslTimeline2.visible()) {
                    continue;
                }
                final float width = entityTrslTimeline2.getRect().width();
                entityTrslTimeline2.setCurrentRect();
                entityTrslTimeline2.setX(x);
                entityTrslTimeline2.setRight(x + width);
                entityTrslTimeline2.setIndex(index);
                x = entityTrslTimeline2.getRect().right;
            }
        }
        else {
            entityTrslTimeline.setIndex(index);
            this.entityListTrslQuran.add(entityTrslTimeline);
        }
        this.entityList.push(new Pair((Object)entityTrslTimeline, (Object)EntityAction.ADD));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.ADD);
        }
    }
    
    public void calculMaxTime() {
        final EntityAudio audio = this.getAudio();
        float a = 0.0f;
        float right;
        if (audio != null && audio.getRect() != null) {
            if (audio.getmScaleFactor() != this.getScaleFactor()) {
                right = audio.getRect().right / audio.getmScaleFactor() * this.getScaleFactor();
            }
            else {
                right = audio.getRect().right;
            }
        }
        else {
            right = 0.0f;
        }
        final EntityQuranTimeline quran = this.getQuran();
        Label_0408: {
            if (quran != null && quran.getRect() != null) {
                if (quran.getmScaleFactor() != this.getScaleFactor()) {
                    a = quran.getRect().right / quran.getmScaleFactor() * this.getScaleFactor();
                }
                else {
                    a = quran.getRect().right;
                }
            }
            else {
                float n;
                float n2;
                if (this.isExist(this.bismilahTimeline)) {
                    if (this.bismilahTimeline.getmScaleFactor() == this.getScaleFactor()) {
                        a = this.bismilahTimeline.getRect().right;
                        break Label_0408;
                    }
                    n = this.bismilahTimeline.getRect().right / this.bismilahTimeline.getmScaleFactor();
                    n2 = this.getScaleFactor();
                }
                else {
                    if (!this.isExist(this.mIsi3adaTimeline)) {
                        break Label_0408;
                    }
                    if (this.mIsi3adaTimeline.getmScaleFactor() == this.getScaleFactor()) {
                        a = this.mIsi3adaTimeline.getRect().right;
                        break Label_0408;
                    }
                    n = this.mIsi3adaTimeline.getRect().right / this.mIsi3adaTimeline.getmScaleFactor();
                    n2 = this.getScaleFactor();
                }
                a = n2 * n;
            }
        }
        final EntityTrslTimeline trslQuran = this.getTrslQuran();
        if (trslQuran != null && trslQuran.getRect() != null) {
            if (trslQuran.getmScaleFactor() != this.getScaleFactor()) {
                a = Math.max(trslQuran.getRect().right / trslQuran.getmScaleFactor() * this.getScaleFactor(), a);
            }
            else {
                a = Math.max(trslQuran.getRect().right, a);
            }
        }
        final float max = Math.max(a, right);
        final float n3 = max / this.getSecond_in_screen();
        final float n4 = 1000.0f;
        final int maxTime = (int)(n3 * n4);
        this.maxTime = maxTime;
        this.duration = (int)(maxTime / n4);
        this.timeLineW = max / this.scaleFactor;
    }
    
    public void clearAudio() {
        if (!this.entityListAudio.isEmpty()) {
            this.entityListAudio.clear();
            final Stack<Pair> entityList = new Stack<Pair>();
            for (final Pair item : this.entityList) {
                if (!(item.first instanceof EntityAudio)) {
                    entityList.push(item);
                }
            }
            this.entityList.clear();
            this.entityList = entityList;
        }
    }
    
    public void computeScroll() {
        final Scroller scroller = this.scroller;
        if (scroller != null) {
            if (!this.isProgress) {
                if (scroller.computeScrollOffset() && (this.currentPosition != 0.0f || this.scroller.getCurrX() <= 0)) {
                    final float currentPosition = (float)this.scroller.getCurrX();
                    this.currentPosition = currentPosition;
                    if (currentPosition > 0.0f) {
                        this.currentPosition = 0.0f;
                    }
                    final float scrolled_with_zoom = this.currentPosition * this.scaleFactor;
                    this.scrolled_with_zoom = scrolled_with_zoom;
                    if (!this.isPlaying) {
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                        if (iTrimLineCallback != null) {
                            iTrimLineCallback.onSeekPlayer(scrolled_with_zoom);
                        }
                    }
                    this.invalidate();
                }
            }
        }
    }
    
    public void deleteEntity(final boolean b) {
        try {
            final Entity selectedEntity = this.selectedEntity;
            Label_0118: {
                if (selectedEntity == null) {
                    break Label_0118;
                }
                selectedEntity.visible(false);
                final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                Label_0042: {
                    if (iTrimLineCallback == null) {
                        break Label_0042;
                    }
                    final Entity selectedEntity2 = this.selectedEntity;
                    try {
                        iTrimLineCallback.onDelete(selectedEntity2.getEntityView());
                        final Stack entityList = this.entityList;
                        try {
                            try {
                                final Entity selectedEntity3 = this.selectedEntity;
                                try {
                                    final Pair item = new Pair((Object)selectedEntity3, (Object)EntityAction.DELETE);
                                    final Stack stack = entityList;
                                    try {
                                        stack.push(item);
                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                                        if (iTrimLineCallback2 != null) {
                                            iTrimLineCallback2.onAddStack(EntityAction.DELETE);
                                        }
                                        this.selectedEntity = null;
                                        if (b) {
                                            this.updateTrslIndex();
                                        }
                                        else {
                                            this.updateIndex();
                                        }
                                        this.invalidate();
                                    }
                                    catch (final Exception ex) {}
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
            }
        }
        catch (final Exception ex6) {}
    }
    
    public void deleteEntityAllSelect() {
        try {
            final List entityListQuran = this.entityListQuran;
            Entity entity = null;
            Label_0277: {
                if (entityListQuran == null || entityListQuran.isEmpty()) {
                    break Label_0277;
                }
                try {
                    final ArrayList entitiesGroup = new ArrayList();
                    Entity entity2 = null;
                    int n = 0;
                    while (true) {
                        final List entityListQuran2 = this.entityListQuran;
                        try {
                            Label_0216: {
                                if (n >= entityListQuran2.size()) {
                                    break Label_0216;
                                }
                                final Object value = this.entityListQuran.get(n);
                                try {
                                    final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)value;
                                    try {
                                        Label_0207: {
                                            if (!entityQuranTimeline.visible()) {
                                                break Label_0207;
                                            }
                                            if (!entityQuranTimeline.isSelect()) {
                                                break Label_0207;
                                            }
                                            if (entity2 == null) {
                                                entity2 = entityQuranTimeline;
                                            }
                                            else {
                                                entitiesGroup.add(entityQuranTimeline);
                                            }
                                            final EntityQuranTimeline entityQuranTimeline2 = entityQuranTimeline;
                                            try {
                                                entityQuranTimeline2.visible(false);
                                                final EntityQuranTimeline entityQuranTimeline3 = entityQuranTimeline;
                                                try {
                                                    entityQuranTimeline3.setSelect(false);
                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                                                    if (iTrimLineCallback != null) {
                                                        iTrimLineCallback.onDelete(entityQuranTimeline.getEntityView());
                                                    }
                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                                                    if (iTrimLineCallback2 != null) {
                                                        iTrimLineCallback2.onAddStack(EntityAction.DELETE);
                                                    }
                                                    ++n;
                                                    continue;
                                                    iftrue(Label_0273:)(entity2 == null);
                                                    final Stack entityList = this.entityList;
                                                    try {
                                                        try {
                                                            final Pair item = new Pair((Object)entity2, (Object)EntityAction.DELETE_MULTIPLE);
                                                            final Stack stack = entityList;
                                                            try {
                                                                stack.push(item);
                                                                if (!entitiesGroup.isEmpty()) {
                                                                    entity2.setEntitiesGroup(entitiesGroup);
                                                                }
                                                                Label_0273: {
                                                                    this.updateIndex();
                                                                }
                                                                final List entityListTrslQuran = this.entityListTrslQuran;
                                                                Label_0547: {
                                                                    if (entityListTrslQuran == null || entityListTrslQuran.isEmpty()) {
                                                                        break Label_0547;
                                                                    }
                                                                    try {
                                                                        final ArrayList entitiesGroup2 = new ArrayList();
                                                                        Entity entity3 = null;
                                                                        int n2 = 0;
                                                                        while (true) {
                                                                            final List entityListTrslQuran2 = this.entityListTrslQuran;
                                                                            try {
                                                                                Label_0486: {
                                                                                    if (n2 >= entityListTrslQuran2.size()) {
                                                                                        break Label_0486;
                                                                                    }
                                                                                    final Object value2 = this.entityListTrslQuran.get(n2);
                                                                                    try {
                                                                                        final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)value2;
                                                                                        try {
                                                                                            Label_0477: {
                                                                                                if (!entityTrslTimeline.visible()) {
                                                                                                    break Label_0477;
                                                                                                }
                                                                                                if (!entityTrslTimeline.isSelect()) {
                                                                                                    break Label_0477;
                                                                                                }
                                                                                                if (entity3 == null) {
                                                                                                    entity3 = entityTrslTimeline;
                                                                                                }
                                                                                                else {
                                                                                                    entitiesGroup2.add(entityTrslTimeline);
                                                                                                }
                                                                                                final EntityTrslTimeline entityTrslTimeline2 = entityTrslTimeline;
                                                                                                try {
                                                                                                    entityTrslTimeline2.visible(false);
                                                                                                    final EntityTrslTimeline entityTrslTimeline3 = entityTrslTimeline;
                                                                                                    try {
                                                                                                        entityTrslTimeline3.setSelect(false);
                                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                                                                                                        if (iTrimLineCallback3 != null) {
                                                                                                            iTrimLineCallback3.onDelete(entityTrslTimeline.getEntityView());
                                                                                                        }
                                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                                                                                                        if (iTrimLineCallback4 != null) {
                                                                                                            iTrimLineCallback4.onAddStack(EntityAction.DELETE);
                                                                                                        }
                                                                                                        ++n2;
                                                                                                        continue;
                                                                                                        iftrue(Label_0543:)(entity3 == null);
                                                                                                        final Stack entityList2 = this.entityList;
                                                                                                        try {
                                                                                                            try {
                                                                                                                final Pair item2 = new Pair((Object)entity3, (Object)EntityAction.DELETE_MULTIPLE);
                                                                                                                final Stack stack2 = entityList2;
                                                                                                                try {
                                                                                                                    stack2.push(item2);
                                                                                                                    if (!entitiesGroup2.isEmpty()) {
                                                                                                                        entity3.setEntitiesGroup(entitiesGroup2);
                                                                                                                    }
                                                                                                                    Label_0543:
                                                                                                                    this.updateTrslIndex();
                                                                                                                    Label_0677: {
                                                                                                                        if (!this.isExist(this.bismilahTimeline)) {
                                                                                                                            break Label_0677;
                                                                                                                        }
                                                                                                                        final EntityBismilahTimeline bismilahTimeline = this.bismilahTimeline;
                                                                                                                        try {
                                                                                                                            if (!bismilahTimeline.isSelect()) {
                                                                                                                                break Label_0677;
                                                                                                                            }
                                                                                                                            this.bismilahTimeline.visible(false);
                                                                                                                            this.bismilahTimeline.setSelect(false);
                                                                                                                            this.bismilahTimeline.setSelectMultiple(false);
                                                                                                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                                                                                                                            Label_0640: {
                                                                                                                                if (iTrimLineCallback5 == null) {
                                                                                                                                    break Label_0640;
                                                                                                                                }
                                                                                                                                final EntityBismilahTimeline bismilahTimeline2 = this.bismilahTimeline;
                                                                                                                                try {
                                                                                                                                    iTrimLineCallback5.onDelete(bismilahTimeline2.getEntityView());
                                                                                                                                    final Stack entityList3 = this.entityList;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            final EntityBismilahTimeline bismilahTimeline3 = this.bismilahTimeline;
                                                                                                                                            try {
                                                                                                                                                final Pair item3 = new Pair((Object)bismilahTimeline3, (Object)EntityAction.DELETE_MULTIPLE);
                                                                                                                                                final Stack stack3 = entityList3;
                                                                                                                                                try {
                                                                                                                                                    stack3.push(item3);
                                                                                                                                                    Label_0807: {
                                                                                                                                                        if (!this.isExist(this.mIsi3adaTimeline)) {
                                                                                                                                                            break Label_0807;
                                                                                                                                                        }
                                                                                                                                                        final EntityBismilahTimeline mIsi3adaTimeline = this.mIsi3adaTimeline;
                                                                                                                                                        try {
                                                                                                                                                            if (!mIsi3adaTimeline.isSelect()) {
                                                                                                                                                                break Label_0807;
                                                                                                                                                            }
                                                                                                                                                            this.mIsi3adaTimeline.visible(false);
                                                                                                                                                            this.mIsi3adaTimeline.setSelect(false);
                                                                                                                                                            this.mIsi3adaTimeline.setSelectMultiple(false);
                                                                                                                                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                                                                                                                                                            Label_0770: {
                                                                                                                                                                if (iTrimLineCallback6 == null) {
                                                                                                                                                                    break Label_0770;
                                                                                                                                                                }
                                                                                                                                                                final EntityBismilahTimeline mIsi3adaTimeline2 = this.mIsi3adaTimeline;
                                                                                                                                                                try {
                                                                                                                                                                    iTrimLineCallback6.onDelete(mIsi3adaTimeline2.getEntityView());
                                                                                                                                                                    final Stack entityList4 = this.entityList;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            final EntityBismilahTimeline mIsi3adaTimeline3 = this.mIsi3adaTimeline;
                                                                                                                                                                            try {
                                                                                                                                                                                final Pair item4 = new Pair((Object)mIsi3adaTimeline3, (Object)EntityAction.DELETE_MULTIPLE);
                                                                                                                                                                                final Stack stack4 = entityList4;
                                                                                                                                                                                try {
                                                                                                                                                                                    stack4.push(item4);
                                                                                                                                                                                    final List entityListAudio = this.entityListAudio;
                                                                                                                                                                                    Label_1037: {
                                                                                                                                                                                        if (entityListAudio == null || entityListAudio.isEmpty()) {
                                                                                                                                                                                            break Label_1037;
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            final ArrayList entitiesGroup3 = new ArrayList();
                                                                                                                                                                                            int n3 = 0;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                final List entityListAudio2 = this.entityListAudio;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Label_0981: {
                                                                                                                                                                                                        if (n3 >= entityListAudio2.size()) {
                                                                                                                                                                                                            break Label_0981;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        final Object value3 = this.entityListAudio.get(n3);
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            final EntityAudio entityAudio = (EntityAudio)value3;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                Label_0972: {
                                                                                                                                                                                                                    if (!entityAudio.visible()) {
                                                                                                                                                                                                                        break Label_0972;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!entityAudio.isSelect()) {
                                                                                                                                                                                                                        break Label_0972;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    entityAudio.visible(false);
                                                                                                                                                                                                                    final EntityAudio entityAudio2 = entityAudio;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        entityAudio2.setSelect(false);
                                                                                                                                                                                                                        if (entity == null) {
                                                                                                                                                                                                                            entity = entityAudio;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        else {
                                                                                                                                                                                                                            entitiesGroup3.add(entityAudio);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
                                                                                                                                                                                                                        if (iTrimLineCallback7 != null) {
                                                                                                                                                                                                                            iTrimLineCallback7.onAddStack(EntityAction.DELETE);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        ++n3;
                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                        final Stack entityList5 = this.entityList;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                final Pair item5 = new Pair((Object)entity, (Object)EntityAction.DELETE_MULTIPLE);
                                                                                                                                                                                                                                final Stack stack5 = entityList5;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    stack5.push(item5);
                                                                                                                                                                                                                                    if (!entitiesGroup3.isEmpty()) {
                                                                                                                                                                                                                                        entity.setEntitiesGroup(entitiesGroup3);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    Label_1033:
                                                                                                                                                                                                                                    this.updateMediaIndex();
                                                                                                                                                                                                                                    final int clr_btn_trsl = -13421771;
                                                                                                                                                                                                                                    this.clr_btn_audio = clr_btn_trsl;
                                                                                                                                                                                                                                    this.clr_btn_quran = clr_btn_trsl;
                                                                                                                                                                                                                                    this.clr_btn_trsl = clr_btn_trsl;
                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (final Exception ex) {}
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (final Exception ex2) {}
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (final Exception ex3) {}
                                                                                                                                                                                                                        iftrue(Label_1033:)(entity == null);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (final Exception ex4) {}
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (final Exception ex5) {}
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (final Exception ex6) {}
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (final Exception ex7) {}
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex8) {}
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex9) {}
                                                                                                                                                                            }
                                                                                                                                                                            catch (final Exception ex10) {}
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex11) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex12) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex13) {}
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch (final Exception ex14) {}
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex15) {}
                                                                                                                                            }
                                                                                                                                            catch (final Exception ex16) {}
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex17) {}
                                                                                                                                    }
                                                                                                                                    catch (final Exception ex18) {}
                                                                                                                                }
                                                                                                                                catch (final Exception ex19) {}
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (final Exception ex20) {}
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (final Exception ex21) {}
                                                                                                            }
                                                                                                            catch (final Exception ex22) {}
                                                                                                        }
                                                                                                        catch (final Exception ex23) {}
                                                                                                    }
                                                                                                    catch (final Exception ex24) {}
                                                                                                }
                                                                                                catch (final Exception ex25) {}
                                                                                            }
                                                                                        }
                                                                                        catch (final Exception ex26) {}
                                                                                    }
                                                                                    catch (final Exception ex27) {}
                                                                                }
                                                                            }
                                                                            catch (final Exception ex28) {}
                                                                        }
                                                                    }
                                                                    catch (final Exception ex29) {}
                                                                }
                                                            }
                                                            catch (final Exception ex30) {}
                                                        }
                                                        catch (final Exception ex31) {}
                                                    }
                                                    catch (final Exception ex32) {}
                                                }
                                                catch (final Exception ex33) {}
                                            }
                                            catch (final Exception ex34) {}
                                        }
                                    }
                                    catch (final Exception ex35) {}
                                }
                                catch (final Exception ex36) {}
                            }
                        }
                        catch (final Exception ex37) {}
                    }
                }
                catch (final Exception ex38) {}
            }
        }
        catch (final Exception ex39) {}
    }
    
    public void deleteMediaEntity() {
        try {
            final Entity selectedEntity = this.selectedEntity;
            Label_0079: {
                if (selectedEntity == null) {
                    break Label_0079;
                }
                selectedEntity.visible(false);
                final Stack entityList = this.entityList;
                try {
                    try {
                        final Entity selectedEntity2 = this.selectedEntity;
                        try {
                            final Pair item = new Pair((Object)selectedEntity2, (Object)EntityAction.DELETE);
                            final Stack stack = entityList;
                            try {
                                stack.push(item);
                                final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                                if (iTrimLineCallback != null) {
                                    iTrimLineCallback.onAddStack(EntityAction.DELETE);
                                }
                                this.selectedEntity = null;
                                this.updateMediaIndex();
                                this.invalidate();
                            }
                            catch (final Exception ex) {}
                        }
                        catch (final Exception ex2) {}
                    }
                    catch (final Exception ex3) {}
                }
                catch (final Exception ex4) {}
            }
        }
        catch (final Exception ex5) {}
    }
    
    public void finishScroll() {
        try {
            final Scroller scroller = this.scroller;
            Label_0027: {
                if (scroller == null || scroller.isFinished()) {
                    break Label_0027;
                }
                final Scroller scroller2 = this.scroller;
                try {
                    scroller2.abortAnimation();
                    this.scroller = null;
                }
                catch (final Exception ex) {}
            }
        }
        catch (final Exception ex2) {}
    }
    
    public void flingY() {
        (this.objectAnimator = ObjectAnimator.ofFloat((Object)this, "FlingY", new float[] { this.target, 0.0f })).setDuration(1000L);
        this.objectAnimator.start();
    }
    
    public EntityAudio getAudio() {
        for (int i = this.entityListAudio.size() - 1; i >= 0; --i) {
            final EntityAudio entityAudio = this.entityListAudio.get(i);
            if (entityAudio.visible()) {
                return entityAudio;
            }
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
    
    public Pair getEntityAudioNotDeleted(int i) {
        while (i < this.entityListAudio.size()) {
            final EntityAudio entityAudio = this.entityListAudio.get(i);
            if (entityAudio.visible()) {
                return new Pair((Object)i, (Object)entityAudio);
            }
            ++i;
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
        if (this.entityListQuran.isEmpty()) {
            return null;
        }
        final List entityListQuran = this.entityListQuran;
        return (EntityQuranTimeline)entityListQuran.get(entityListQuran.size() - 1);
    }
    
    public int getMaxTime() {
        return this.maxTime;
    }
    
    public EntityAudio getPreviewOrNextEntityAudio(final List list, int i, final boolean b) {
        if (b) {
            while (i < list.size()) {
                if (list.get(i).visible()) {
                    return list.get(i);
                }
                ++i;
            }
            return null;
        }
        while (i >= 0 && i < list.size()) {
            if (list.get(i).visible()) {
                return list.get(i);
            }
            --i;
        }
        return null;
    }
    
    public EntityQuranTimeline getPreviewOrNextEntityQuran(final List list, int i, final boolean b) {
        if (b) {
            while (i < list.size()) {
                if (list.get(i).visible()) {
                    return list.get(i);
                }
                ++i;
            }
            return null;
        }
        while (i >= 0 && i < list.size()) {
            if (list.get(i).visible()) {
                return list.get(i);
            }
            --i;
        }
        return null;
    }
    
    public EntityTrslTimeline getPreviewOrNextEntityTrslQuran(final List list, int i, final boolean b) {
        if (b) {
            while (i < list.size()) {
                if (list.get(i).visible()) {
                    return list.get(i);
                }
                ++i;
            }
            return null;
        }
        while (i >= 0 && i < list.size()) {
            if (list.get(i).visible()) {
                return list.get(i);
            }
            --i;
        }
        return null;
    }
    
    public EntityQuranTimeline getQuran() {
        for (int i = this.entityListQuran.size() - 1; i >= 0; --i) {
            final EntityQuranTimeline entityQuranTimeline = this.entityListQuran.get(i);
            if (entityQuranTimeline.visible()) {
                return entityQuranTimeline;
            }
        }
        return null;
    }
    
    public float getScaleFactor() {
        return this.scaleFactor;
    }
    
    public float getSecond_in_screen() {
        return this.second_in_screen * this.scaleFactor;
    }
    
    public float getSecond_in_screenNoScale() {
        return this.second_in_screen;
    }
    
    public Entity getSelectedEntity() {
        return this.selectedEntity;
    }
    
    public float getTextSize() {
        final Paint paint_time = this.paint_time;
        if (paint_time == null) {
            return 1.0f;
        }
        return paint_time.getTextSize() * 1.42f;
    }
    
    public float getTimeLineW() {
        return this.timeLineW;
    }
    
    public EntityTrslTimeline getTrslQuran() {
        for (int i = this.entityListTrslQuran.size() - 1; i >= 0; --i) {
            final EntityTrslTimeline entityTrslTimeline = this.entityListTrslQuran.get(i);
            if (entityTrslTimeline.visible()) {
                return entityTrslTimeline;
            }
        }
        return null;
    }
    
    public float getXCursur() {
        return -this.currentPosition * this.scaleFactor;
    }
    
    public EntityBismilahTimeline getmIsi3adaTimeline() {
        return this.mIsi3adaTimeline;
    }
    
    public void init(int n, int n2) {
        if (n > 0) {
            if (n2 > 0) {
                final float n3 = (float)n;
                this.SPEED = 0.04f * n3;
                final int n4 = 1;
                (this.paint_time = new Paint(n4)).setColor(-8355712);
                this.paint_time.setTypeface(Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf"));
                this.radius = 0.006f * n3;
                this.paint_time.setTextSize(n3 * 0.023f);
                (this.paintMaker = new Paint(n4)).setColor(-1);
                final Paint paintMaker = this.paintMaker;
                final float radius = this.radius;
                final float n5 = 0.5f;
                paintMaker.setStrokeWidth(radius * n5);
                this.markerHeight = this.radius * 3.0f;
                final float strokeWidth = this.paintMaker.getStrokeWidth();
                final float n6 = 4.0f;
                this.m_pos_y_marker = strokeWidth * n6;
                final float radius2 = this.radius;
                this.paddingCursur = n6 * radius2;
                final float centerX = this.width_screen * n5 - radius2 * n5;
                this.centerX = centerX;
                this.DETECT_RIGHT_MOVE = 0.4f * centerX;
                this.DETECT_LEFT_MOVE = centerX * 0.45f;
                (this.paintCursur = new Paint(n4)).setStrokeWidth(this.radius);
                final float strokeWidth2 = this.paintCursur.getStrokeWidth();
                n2 = 1077097267;
                final float n7 = strokeWidth2 * 2.8f;
                (this.paintLineCheck = new Paint(n4)).setColor(-16121);
                this.paintLineCheck.setStrokeWidth(this.paintCursur.getStrokeWidth());
                final Paint paintLineCheck = this.paintLineCheck;
                final float[] array = { n7, 0.0f };
                array[n4] = n7;
                n = 0;
                paintLineCheck.setPathEffect((PathEffect)new DashPathEffect(array, 0.0f));
                this.w_time_item = this.paint_time.measureText("999") * n5;
            }
        }
    }
    
    public boolean isExist(final EntityBismilahTimeline entityBismilahTimeline) {
        return entityBismilahTimeline != null && entityBismilahTimeline.visible();
    }
    
    public boolean isPass(final MotionEvent motionEvent) {
        final long eventTime = motionEvent.getEventTime();
        final long lastTime = this.lastTime;
        final long lastDifference = eventTime - lastTime;
        final boolean isDetectChange = this.isDetectChange;
        final int isDetectChange2 = 1;
        if (!isDetectChange && lastTime != 0L) {
            if (lastDifference > this.lastDifference * 2.88) {
                this.isDetectChange = (isDetectChange2 != 0);
            }
        }
        else if ((this.countMove += isDetectChange2) > 3) {
            this.isDetectChange = false;
            this.countMove = 0;
        }
        if (this.isDetectChange) {
            return false;
        }
        this.lastTime = motionEvent.getEventTime();
        this.lastDifference = lastDifference;
        return isDetectChange2 != 0;
    }
    
    public boolean isPlaying() {
        return this.isPlaying;
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.paint_time != null) {
            if (!this.isProgress) {
                try {
                    this.mDraw(canvas);
                    if (!this.isPlaying()) {
                        this.drawItemBtn(canvas);
                    }
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
                super.onDraw(canvas);
            }
        }
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (b) {
            this.updateGestureExclusion();
        }
    }
    
    protected void onSizeChanged(final int n, int n2, int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        n3 = 1;
        if (n2 >= n3) {
            if (n >= n3) {
                final float n5 = (float)n2;
                this.maxBottom = 0.78f * n5;
                this.start_y_draw = 0.18f * n5;
                this.canvas_top_Y = 0.1f * n5;
                this.posY = 0.05f * n5;
                n2 = 1020591604;
                this.p = n5 * 0.026f;
            }
        }
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        int pass = 0;
        if (motionEvent == null || this.isProgress) {
            return false;
        }
        motionEvent.setLocation(motionEvent.getX() + this.getPaddingLeft() - (this.centerX - this.radius * 0.5f + this.scrolled_with_zoom), motionEvent.getY() + this.getPaddingTop() - this.mScrollY);
        final int pointerCount = motionEvent.getPointerCount();
        final int isOnUp = 1;
        if (pointerCount > isOnUp) {
            return this.scaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.isScaleListener) {
            if (motionEvent.getAction() == isOnUp) {
                this.isScaleListener = false;
            }
            return isOnUp != 0;
        }
        final int action = motionEvent.getAction();
        final float n = -1.0f;
        if (action != isOnUp) {
            final int n2 = 2;
            if (action == n2) {
                final Entity selectedEntity = this.selectedEntity;
                if (selectedEntity != null && !this.isPassScroll) {
                    if (selectedEntity.getSelectTrim() != null) {
                        if (!this.isPass(motionEvent)) {
                            return isOnUp != 0;
                        }
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                        if (iTrimLineCallback != null) {
                            iTrimLineCallback.onMove();
                        }
                        final int trim_type = this.selectedEntity.getTrim_type();
                        final long n3 = 500L;
                        if (trim_type == 0 && this.onThink) {
                            if (Math.abs(motionEvent.getX() - this.lasX) <= this.TOLERANCE_X) {
                                return false;
                            }
                            this.lasX = motionEvent.getX();
                            final float n4 = motionEvent.getX() - this.selectedEntity.getDownX();
                            if (n4 == 0.0f) {
                                return false;
                            }
                            this.selectedEntity.setTrimLeft((boolean)(isOnUp != 0));
                            float left = this.selectedEntity.getLeft() + n4;
                            int n5;
                            if (this.selectedEntity.getRect().right - left > this.max_trim) {
                                n5 = isOnUp;
                            }
                            else {
                                n5 = 0;
                            }
                            if (left < 0.0f) {
                                left = 0.0f;
                            }
                            else if (n5 == 0) {
                                left = this.selectedEntity.getRect().right - this.max_trim;
                            }
                            final Entity selectedEntity2 = this.selectedEntity;
                            if (selectedEntity2 instanceof EntityAudio) {
                                final EntityAudio entityAudio = (EntityAudio)selectedEntity2;
                                final float n6 = entityAudio.getOffset_right() * entityAudio.getmScaleFactor();
                                final float n7 = this.selectedEntity.getRect().right + n6 - left;
                                final float n8 = entityAudio.getMax() * entityAudio.getmScaleFactor();
                                if (n7 > n8) {
                                    final Entity selectedEntity3 = this.selectedEntity;
                                    selectedEntity3.setX(selectedEntity3.getRect().right + n6 - n8);
                                    entityAudio.updateStartTrim();
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                                if (entityAudio.getIndex() > 0) {
                                    final EntityAudio previewOrNextEntityAudio = this.getPreviewOrNextEntityAudio(this.entityListAudio, entityAudio.getIndex() - isOnUp, false);
                                    if (previewOrNextEntityAudio != null && left <= previewOrNextEntityAudio.getRect().right) {
                                        final float right = previewOrNextEntityAudio.getRect().right + this.selectedEntity.getRect().width();
                                        this.selectedEntity.setX(previewOrNextEntityAudio.getRect().right);
                                        entityAudio.updateStartTrim();
                                        this.selectedEntity.setRight(right);
                                        this.pass = false;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                            }
                            final Entity selectedEntity4 = this.selectedEntity;
                            if (selectedEntity4 instanceof EntityQuranTimeline) {
                                final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)selectedEntity4;
                                if (entityQuranTimeline.getIndex() > 0) {
                                    final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline.getIndex() - isOnUp, false);
                                    if (previewOrNextEntityQuran != null && left <= previewOrNextEntityQuran.getRect().right) {
                                        this.selectedEntity.setX(previewOrNextEntityQuran.getRect().right);
                                        this.pass = false;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                                if (this.isExist(this.bismilahTimeline) && left <= this.bismilahTimeline.getRect().right) {
                                    this.selectedEntity.setX(this.bismilahTimeline.getRect().right);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                                if (this.isExist(this.mIsi3adaTimeline) && left <= this.mIsi3adaTimeline.getRect().right) {
                                    this.selectedEntity.setX(this.mIsi3adaTimeline.getRect().right);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                            final Entity selectedEntity5 = this.selectedEntity;
                            if (selectedEntity5 instanceof EntityTrslTimeline) {
                                final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)selectedEntity5;
                                if (entityTrslTimeline.getIndex() > 0) {
                                    final EntityTrslTimeline previewOrNextEntityTrslQuran = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline.getIndex() - isOnUp, false);
                                    if (previewOrNextEntityTrslQuran != null && left <= previewOrNextEntityTrslQuran.getRect().right) {
                                        this.selectedEntity.setX(previewOrNextEntityTrslQuran.getRect().right);
                                        this.pass = false;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                            }
                            final Entity selectedEntity6 = this.selectedEntity;
                            if (selectedEntity6 instanceof EntityBismilahTimeline && selectedEntity6 == this.bismilahTimeline && this.isExist(this.mIsi3adaTimeline) && left <= this.mIsi3adaTimeline.getRect().right) {
                                this.selectedEntity.setX(this.mIsi3adaTimeline.getRect().right);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                            if (this.onThink && this.pass) {
                                final float left2 = this.selectedEntity.getRect().left;
                                final float scrolled_with_zoom = this.scrolled_with_zoom;
                                final float n9 = left2 + scrolled_with_zoom;
                                final float tolerance_X = this.TOLERANCE_X;
                                if (n9 >= -tolerance_X && n9 < tolerance_X) {
                                    this.onThink = false;
                                    final float x = -scrolled_with_zoom;
                                    this.selectedEntity.setX(x);
                                    this.selectedEntity.updateStartTrim();
                                    final Entity selectedEntity7 = this.selectedEntity;
                                    if (selectedEntity7 instanceof EntityAudio) {
                                        selectedEntity7.setRight(x + selectedEntity7.getRect().width());
                                    }
                                    this.isCheckLineCursur = (isOnUp != 0);
                                    this.startXLine = this.selectedEntity.getRect().left;
                                    this.invalidate();
                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                                    if (iTrimLineCallback2 != null) {
                                        iTrimLineCallback2.onPlayVibration();
                                    }
                                    new Handler().postDelayed((Runnable)new TrackEntityView$4(this, motionEvent), n3);
                                    return false;
                                }
                                for (final Pair pair : this.entityList) {
                                    final Entity entity = (Entity)pair.first;
                                    if (entity.getRect().top != this.selectedEntity.getRect().top && entity != this.selectedEntity && (pair.second == EntityAction.ADD || pair.second == EntityAction.SPLIT) && ((Entity)pair.first).visible()) {
                                        if (this.selectedEntity.getRect().left >= entity.getRect().left - this.TOLERANCE_X && this.selectedEntity.getRect().left <= entity.getRect().left + this.TOLERANCE_X) {
                                            this.onThink = false;
                                            this.selectedEntity.setX(entity.getRect().left);
                                            this.selectedEntity.updateStartTrim();
                                            final Entity selectedEntity8 = this.selectedEntity;
                                            if (selectedEntity8 instanceof EntityAudio) {
                                                selectedEntity8.setRight(entity.getRect().left + this.selectedEntity.getRect().width());
                                            }
                                            this.isCheckLine = (isOnUp != 0);
                                            this.startXLine = this.selectedEntity.getRect().left;
                                            this.invalidate();
                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                                            if (iTrimLineCallback3 != null) {
                                                iTrimLineCallback3.onPlayVibration();
                                            }
                                            new Handler().postDelayed((Runnable)new TrackEntityView$5(this, motionEvent), n3);
                                            return false;
                                        }
                                        if (this.selectedEntity.getRect().left >= entity.getRect().right - this.TOLERANCE_X && this.selectedEntity.getRect().left <= entity.getRect().right + this.TOLERANCE_X) {
                                            this.onThink = false;
                                            this.selectedEntity.setX(entity.getRect().right);
                                            final Entity selectedEntity9 = this.selectedEntity;
                                            if (selectedEntity9 instanceof EntityAudio) {
                                                selectedEntity9.setRight(entity.getRect().right + this.selectedEntity.getRect().width());
                                                this.selectedEntity.updateStartTrim();
                                            }
                                            this.isCheckLine = (isOnUp != 0);
                                            this.startXLine = this.selectedEntity.getRect().left;
                                            this.invalidate();
                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                                            if (iTrimLineCallback4 != null) {
                                                iTrimLineCallback4.onPlayVibration();
                                            }
                                            new Handler().postDelayed((Runnable)new TrackEntityView$6(this, motionEvent), n3);
                                            return false;
                                        }
                                        continue;
                                    }
                                }
                            }
                            final Entity selectedEntity10 = this.selectedEntity;
                            if (selectedEntity10 instanceof EntityAudio) {
                                selectedEntity10.getRect().left = left;
                                final Entity selectedEntity11 = this.selectedEntity;
                                selectedEntity11.setLastLeft(selectedEntity11.getLeft() + n4);
                                this.selectedEntity.updateStartTrim();
                                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                this.isAutoScroll = false;
                            }
                            else if (n5 != 0) {
                                if (selectedEntity10.getRect().left < left) {
                                    if (this.selectedEntity.getRect().left + this.getCurrentPosition() > this.DETECT_RIGHT_MOVE) {
                                        if (!this.isAutoScroll) {
                                            if (left > this.selectedEntity.getRect().left) {
                                                final float speed = this.SPEED;
                                                if (speed < 0.0f) {
                                                    this.SPEED = speed * n;
                                                }
                                            }
                                            else {
                                                final float speed2 = this.SPEED;
                                                if (speed2 > 0.0f) {
                                                    this.SPEED = speed2 * n;
                                                }
                                            }
                                            this.isAutoScroll = (isOnUp != 0);
                                            this.time_start = System.currentTimeMillis();
                                            this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                        }
                                        else if (left < this.selectedEntity.getRect().left && this.isAutoScroll) {
                                            this.isAutoScroll = false;
                                            this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                        }
                                    }
                                    else if (this.isAutoScroll) {
                                        this.isAutoScroll = false;
                                        this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                    }
                                }
                                else if (this.selectedEntity.getRect().left > 0.0f && this.selectedEntity.getRect().left + this.getCurrentPosition() < -this.DETECT_LEFT_MOVE) {
                                    if (!this.isAutoScroll) {
                                        final float speed3 = this.SPEED;
                                        if (speed3 < 0.0f) {
                                            this.SPEED = speed3 * n;
                                        }
                                        this.isAutoScroll = (isOnUp != 0);
                                        this.time_start = System.currentTimeMillis();
                                        this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                    }
                                    else {
                                        final float speed4 = this.SPEED;
                                        if (speed4 > 0.0f) {
                                            this.SPEED = speed4 * n;
                                        }
                                    }
                                }
                                else if (this.isAutoScroll) {
                                    this.isAutoScroll = false;
                                    this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                }
                            }
                            if (!this.isAutoScroll) {
                                if (left > this.selectedEntity.getRect().left) {
                                    this.selectedEntity.getRect().left = left + this.TOLERANCE_X;
                                }
                                else {
                                    this.selectedEntity.getRect().left = left - this.TOLERANCE_X;
                                }
                            }
                            final float n10 = this.paintCursur.getStrokeWidth() * 0.3f;
                            if (this.selectedEntity.getRect().left < this.startXLine - n10 || this.selectedEntity.getRect().left > this.startXLine + n10) {
                                pass = isOnUp;
                            }
                            this.pass = (pass != 0);
                            this.invalidate();
                        }
                        else if (this.selectedEntity.getTrim_type() == isOnUp && this.onThink) {
                            if (Math.abs(motionEvent.getX() - this.lasX) <= this.TOLERANCE_X) {
                                return false;
                            }
                            this.lasX = motionEvent.getX();
                            final float n11 = motionEvent.getX() - this.selectedEntity.getDownX();
                            if (n11 == 0.0f) {
                                return false;
                            }
                            float right2 = this.selectedEntity.getRight() + n11;
                            int n12;
                            if (right2 - this.selectedEntity.getRect().left > this.max_trim) {
                                n12 = isOnUp;
                            }
                            else {
                                n12 = 0;
                            }
                            if (n12 == 0) {
                                right2 = this.selectedEntity.getRect().left + this.max_trim;
                            }
                            final Entity selectedEntity12 = this.selectedEntity;
                            float n13;
                            if (selectedEntity12 instanceof EntityAudio) {
                                final EntityAudio entityAudio2 = (EntityAudio)selectedEntity12;
                                n13 = right2 - selectedEntity12.getRect().left;
                                final float n14 = entityAudio2.getMax() * entityAudio2.getmScaleFactor() - entityAudio2.getOffset_left() * entityAudio2.getmScaleFactor();
                                if (n13 > n14) {
                                    right2 = this.selectedEntity.getRect().left + n14;
                                }
                                else if (entityAudio2.getIndex() + isOnUp < this.entityListAudio.size()) {
                                    final EntityAudio previewOrNextEntityAudio2 = this.getPreviewOrNextEntityAudio(this.entityListAudio, entityAudio2.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                    if (previewOrNextEntityAudio2 != null && right2 > previewOrNextEntityAudio2.getRect().left) {
                                        this.selectedEntity.getRect().right = right2;
                                        if (n13 == n) {
                                            final Entity selectedEntity13 = this.selectedEntity;
                                            selectedEntity13.setLastRight(selectedEntity13.getRight() + n11);
                                        }
                                        else {
                                            final Entity selectedEntity14 = this.selectedEntity;
                                            selectedEntity14.setLastRight(selectedEntity14.getRect().right);
                                        }
                                        final float right3 = previewOrNextEntityAudio2.getRect().width() + right2;
                                        final float n15 = right2 - previewOrNextEntityAudio2.getRect().left;
                                        previewOrNextEntityAudio2.setCurrentRect();
                                        previewOrNextEntityAudio2.setX(right2);
                                        previewOrNextEntityAudio2.setRight(right3);
                                        for (int i = entityAudio2.getIndex() + n2; i < this.entityListAudio.size(); ++i) {
                                            final Entity entity2 = this.entityListAudio.get(i);
                                            if (entity2.visible()) {
                                                final float x2 = entity2.getRect().left + n15;
                                                final float right4 = entity2.getRect().width() + x2;
                                                entity2.setCurrentRect();
                                                entity2.setX(x2);
                                                entity2.setRight(right4);
                                            }
                                        }
                                        this.pass = false;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                            }
                            else {
                                n13 = n;
                            }
                            if (this.onThink && this.pass) {
                                final float right5 = this.selectedEntity.getRect().right;
                                final float scrolled_with_zoom2 = this.scrolled_with_zoom;
                                final float n16 = right5 + scrolled_with_zoom2;
                                final float tolerance_X2 = this.TOLERANCE_X;
                                if (n16 >= -tolerance_X2 && n16 < tolerance_X2) {
                                    this.onThink = false;
                                    final float right6 = -scrolled_with_zoom2 + tolerance_X2;
                                    final Entity selectedEntity15 = this.selectedEntity;
                                    if (selectedEntity15 instanceof EntityAudio) {
                                        selectedEntity15.setX(selectedEntity15.getRect().right - this.selectedEntity.getRect().width());
                                    }
                                    this.selectedEntity.setRight(right6);
                                    this.isCheckLineCursur = (isOnUp != 0);
                                    this.startXLine = this.selectedEntity.getRect().right;
                                    this.invalidate();
                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                                    if (iTrimLineCallback5 != null) {
                                        iTrimLineCallback5.onPlayVibration();
                                    }
                                    new Handler().postDelayed((Runnable)new TrackEntityView$7(this, motionEvent), n3);
                                    return false;
                                }
                                for (final Pair pair2 : this.entityList) {
                                    final Entity entity3 = (Entity)pair2.first;
                                    if (entity3.getRect().top != this.selectedEntity.getRect().top && entity3 != this.selectedEntity && (pair2.second == EntityAction.ADD || pair2.second == EntityAction.SPLIT) && entity3.visible()) {
                                        if (this.selectedEntity.getRect().right >= entity3.getRect().left - this.TOLERANCE_X && this.selectedEntity.getRect().right <= entity3.getRect().left + this.TOLERANCE_X) {
                                            this.onThink = false;
                                            this.selectedEntity.setRight(entity3.getRect().left);
                                            final Entity selectedEntity16 = this.selectedEntity;
                                            if (selectedEntity16 instanceof EntityAudio) {
                                                selectedEntity16.setX(entity3.getRect().left - this.selectedEntity.getRect().width());
                                            }
                                            this.isCheckLine = (isOnUp != 0);
                                            this.startXLine = this.selectedEntity.getRect().right;
                                            this.invalidate();
                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                                            if (iTrimLineCallback6 != null) {
                                                iTrimLineCallback6.onPlayVibration();
                                            }
                                            new Handler().postDelayed((Runnable)new TrackEntityView$8(this, motionEvent), n3);
                                            return false;
                                        }
                                        if (this.selectedEntity.getRect().right >= entity3.getRect().right - this.TOLERANCE_X && this.selectedEntity.getRect().right <= entity3.getRect().right + this.TOLERANCE_X) {
                                            this.onThink = false;
                                            this.selectedEntity.setRight(entity3.getRect().right);
                                            final Entity selectedEntity17 = this.selectedEntity;
                                            if (selectedEntity17 instanceof EntityAudio) {
                                                selectedEntity17.setX(entity3.getRect().right - this.selectedEntity.getRect().width());
                                            }
                                            this.isCheckLine = (isOnUp != 0);
                                            this.startXLine = this.selectedEntity.getRect().right;
                                            this.invalidate();
                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
                                            if (iTrimLineCallback7 != null) {
                                                iTrimLineCallback7.onPlayVibration();
                                            }
                                            new Handler().postDelayed((Runnable)new TrackEntityView$9(this, motionEvent), n3);
                                            return false;
                                        }
                                        continue;
                                    }
                                }
                            }
                            final Entity selectedEntity18 = this.selectedEntity;
                            if (selectedEntity18 instanceof EntityAudio) {
                                selectedEntity18.getRect().right = right2;
                                if (n13 == n) {
                                    final Entity selectedEntity19 = this.selectedEntity;
                                    selectedEntity19.setLastRight(selectedEntity19.getRight() + n11);
                                }
                                else {
                                    final Entity selectedEntity20 = this.selectedEntity;
                                    selectedEntity20.setLastRight(selectedEntity20.getRect().right);
                                }
                                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                this.isAutoScroll = false;
                            }
                            final Entity selectedEntity21 = this.selectedEntity;
                            if (selectedEntity21 instanceof EntityQuranTimeline) {
                                final EntityQuranTimeline entityQuranTimeline2 = (EntityQuranTimeline)selectedEntity21;
                                if (entityQuranTimeline2.getIndex() < this.entityListQuran.size()) {
                                    final EntityQuranTimeline previewOrNextEntityQuran2 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline2.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                    if (previewOrNextEntityQuran2 != null && right2 > previewOrNextEntityQuran2.getRect().left) {
                                        final float right7 = previewOrNextEntityQuran2.getRect().width() + right2;
                                        final float n17 = right2 - previewOrNextEntityQuran2.getRect().left;
                                        previewOrNextEntityQuran2.setCurrentRect();
                                        previewOrNextEntityQuran2.setX(right2);
                                        previewOrNextEntityQuran2.setRight(right7);
                                        for (int j = entityQuranTimeline2.getIndex() + 2; j < this.entityListQuran.size(); ++j) {
                                            final Entity entity4 = this.entityListQuran.get(j);
                                            if (entity4.visible()) {
                                                final float x3 = entity4.getRect().left + n17;
                                                final float right8 = entity4.getRect().width() + x3;
                                                entity4.setCurrentRect();
                                                entity4.setX(x3);
                                                entity4.setRight(right8);
                                            }
                                        }
                                        this.pass = false;
                                        this.selectedEntity.getRect().right = right2;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                                if (n12 != 0) {
                                    if (this.selectedEntity.getRect().right < right2) {
                                        if (this.selectedEntity.getRect().right + this.getCurrentPosition() > this.DETECT_RIGHT_MOVE) {
                                            if (!this.isAutoScroll) {
                                                if (right2 > this.selectedEntity.getRect().right) {
                                                    final float speed5 = this.SPEED;
                                                    if (speed5 < 0.0f) {
                                                        this.SPEED = speed5 * n;
                                                    }
                                                }
                                                else {
                                                    final float speed6 = this.SPEED;
                                                    if (speed6 > 0.0f) {
                                                        this.SPEED = speed6 * n;
                                                    }
                                                }
                                                this.isAutoScroll = (isOnUp != 0);
                                                this.time_start = System.currentTimeMillis();
                                                this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                            }
                                            else if (right2 < this.selectedEntity.getRect().right && this.isAutoScroll) {
                                                this.isAutoScroll = false;
                                                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                            }
                                        }
                                        else if (this.isAutoScroll) {
                                            this.isAutoScroll = false;
                                            this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                        }
                                    }
                                    else if (this.selectedEntity.getRect().right > 0.0f && this.selectedEntity.getRect().right + this.getCurrentPosition() < -this.DETECT_LEFT_MOVE) {
                                        if (!this.isAutoScroll) {
                                            final float speed7 = this.SPEED;
                                            if (speed7 < 0.0f) {
                                                this.SPEED = speed7 * n;
                                            }
                                            this.isAutoScroll = (isOnUp != 0);
                                            this.time_start = System.currentTimeMillis();
                                            this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                        }
                                        else {
                                            final float speed8 = this.SPEED;
                                            if (speed8 > 0.0f) {
                                                this.SPEED = speed8 * n;
                                            }
                                        }
                                    }
                                    else if (this.isAutoScroll) {
                                        this.isAutoScroll = false;
                                        this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                    }
                                }
                            }
                            final Entity selectedEntity22 = this.selectedEntity;
                            if (selectedEntity22 instanceof EntityTrslTimeline) {
                                final EntityTrslTimeline entityTrslTimeline2 = (EntityTrslTimeline)selectedEntity22;
                                if (entityTrslTimeline2.getIndex() < this.entityListTrslQuran.size()) {
                                    final EntityTrslTimeline previewOrNextEntityTrslQuran2 = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline2.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                    if (previewOrNextEntityTrslQuran2 != null && right2 > previewOrNextEntityTrslQuran2.getRect().left) {
                                        final float right9 = previewOrNextEntityTrslQuran2.getRect().width() + right2;
                                        final float n18 = right2 - previewOrNextEntityTrslQuran2.getRect().left;
                                        previewOrNextEntityTrslQuran2.setCurrentRect();
                                        previewOrNextEntityTrslQuran2.setX(right2);
                                        previewOrNextEntityTrslQuran2.setRight(right9);
                                        for (int k = entityTrslTimeline2.getIndex() + 2; k < this.entityListTrslQuran.size(); ++k) {
                                            final Entity entity5 = this.entityListTrslQuran.get(k);
                                            if (entity5.visible()) {
                                                final float x4 = entity5.getRect().left + n18;
                                                final float right10 = entity5.getRect().width() + x4;
                                                entity5.setCurrentRect();
                                                entity5.setX(x4);
                                                entity5.setRight(right10);
                                            }
                                        }
                                        this.pass = false;
                                        this.selectedEntity.getRect().right = right2;
                                        this.invalidate();
                                        return isOnUp != 0;
                                    }
                                }
                                if (n12 != 0) {
                                    if (this.selectedEntity.getRect().right < right2) {
                                        if (this.selectedEntity.getRect().right + this.getCurrentPosition() > this.DETECT_RIGHT_MOVE) {
                                            if (!this.isAutoScroll) {
                                                if (right2 > this.selectedEntity.getRect().right) {
                                                    final float speed9 = this.SPEED;
                                                    if (speed9 < 0.0f) {
                                                        this.SPEED = speed9 * n;
                                                    }
                                                }
                                                else {
                                                    final float speed10 = this.SPEED;
                                                    if (speed10 > 0.0f) {
                                                        this.SPEED = speed10 * n;
                                                    }
                                                }
                                                this.isAutoScroll = (isOnUp != 0);
                                                this.time_start = System.currentTimeMillis();
                                                this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                            }
                                            else if (right2 < this.selectedEntity.getRect().right && this.isAutoScroll) {
                                                this.isAutoScroll = false;
                                                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                            }
                                        }
                                        else if (this.isAutoScroll) {
                                            this.isAutoScroll = false;
                                            this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                        }
                                    }
                                    else if (this.selectedEntity.getRect().right > 0.0f && this.selectedEntity.getRect().right + this.getCurrentPosition() < -this.DETECT_LEFT_MOVE) {
                                        if (!this.isAutoScroll) {
                                            final float speed11 = this.SPEED;
                                            if (speed11 < 0.0f) {
                                                this.SPEED = speed11 * n;
                                            }
                                            this.isAutoScroll = (isOnUp != 0);
                                            this.time_start = System.currentTimeMillis();
                                            this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                        }
                                        else {
                                            final float speed12 = this.SPEED;
                                            if (speed12 > 0.0f) {
                                                this.SPEED = speed12 * n;
                                            }
                                        }
                                    }
                                    else if (this.isAutoScroll) {
                                        this.isAutoScroll = false;
                                        this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                    }
                                }
                            }
                            final Entity selectedEntity23 = this.selectedEntity;
                            if (selectedEntity23 instanceof EntityBismilahTimeline) {
                                final EntityBismilahTimeline entityBismilahTimeline = (EntityBismilahTimeline)selectedEntity23;
                                if (entityBismilahTimeline == this.mIsi3adaTimeline && this.isExist(this.bismilahTimeline) && right2 >= this.bismilahTimeline.getRect().left) {
                                    final float n19 = right2 - this.bismilahTimeline.getRect().left;
                                    final float right11 = this.bismilahTimeline.getRect().width() + right2;
                                    this.bismilahTimeline.setCurrentRect();
                                    this.bismilahTimeline.setX(right2);
                                    this.bismilahTimeline.setRight(right11);
                                    for (int l = this.bismilahTimeline.getIndex(); l < this.entityListQuran.size(); ++l) {
                                        final Entity entity6 = this.entityListQuran.get(l);
                                        if (entity6.visible()) {
                                            final float x5 = entity6.getRect().left + n19;
                                            final float right12 = entity6.getRect().width() + x5;
                                            entity6.setCurrentRect();
                                            entity6.setX(x5);
                                            entity6.setRight(right12);
                                        }
                                    }
                                    this.pass = false;
                                    this.selectedEntity.getRect().right = right2;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                                final EntityQuranTimeline previewOrNextEntityQuran3 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityBismilahTimeline.getIndex(), (boolean)(isOnUp != 0));
                                if (previewOrNextEntityQuran3 != null && right2 >= previewOrNextEntityQuran3.getRect().left) {
                                    final float n20 = right2 - previewOrNextEntityQuran3.getRect().left;
                                    final float right13 = previewOrNextEntityQuran3.getRect().width() + right2;
                                    previewOrNextEntityQuran3.setCurrentRect();
                                    previewOrNextEntityQuran3.setX(right2);
                                    previewOrNextEntityQuran3.setRight(right13);
                                    for (int n21 = entityBismilahTimeline.getIndex() + isOnUp; n21 < this.entityListQuran.size(); ++n21) {
                                        final Entity entity7 = this.entityListQuran.get(n21);
                                        if (entity7.visible()) {
                                            final float x6 = entity7.getRect().left + n20;
                                            final float right14 = entity7.getRect().width() + x6;
                                            entity7.setCurrentRect();
                                            entity7.setX(x6);
                                            entity7.setRight(right14);
                                        }
                                    }
                                    this.pass = false;
                                    this.selectedEntity.getRect().right = right2;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                                if (n12 != 0) {
                                    if (this.selectedEntity.getRect().right < right2) {
                                        if (this.selectedEntity.getRect().right + this.getCurrentPosition() > this.DETECT_RIGHT_MOVE) {
                                            if (!this.isAutoScroll) {
                                                if (right2 > this.selectedEntity.getRect().right) {
                                                    final float speed13 = this.SPEED;
                                                    if (speed13 < 0.0f) {
                                                        this.SPEED = speed13 * n;
                                                    }
                                                }
                                                else {
                                                    final float speed14 = this.SPEED;
                                                    if (speed14 > 0.0f) {
                                                        this.SPEED = speed14 * n;
                                                    }
                                                }
                                                this.isAutoScroll = (isOnUp != 0);
                                                this.time_start = System.currentTimeMillis();
                                                this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                            }
                                            else if (right2 < this.selectedEntity.getRect().right && this.isAutoScroll) {
                                                this.isAutoScroll = false;
                                                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                            }
                                        }
                                        else if (this.isAutoScroll) {
                                            this.isAutoScroll = false;
                                            this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                        }
                                    }
                                    else if (this.selectedEntity.getRect().right > 0.0f && this.selectedEntity.getRect().right + this.getCurrentPosition() < -this.DETECT_LEFT_MOVE) {
                                        if (!this.isAutoScroll) {
                                            final float speed15 = this.SPEED;
                                            if (speed15 < 0.0f) {
                                                this.SPEED = speed15 * n;
                                            }
                                            this.isAutoScroll = (isOnUp != 0);
                                            this.time_start = System.currentTimeMillis();
                                            this.autoScrollHandler.postDelayed(this.autoScrollRunnable, (long)100);
                                        }
                                        else {
                                            final float speed16 = this.SPEED;
                                            if (speed16 > 0.0f) {
                                                this.SPEED = speed16 * n;
                                            }
                                        }
                                    }
                                    else if (this.isAutoScroll) {
                                        this.isAutoScroll = false;
                                        this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                                    }
                                }
                            }
                            if (!this.isAutoScroll) {
                                if (right2 > this.selectedEntity.getRect().right) {
                                    this.selectedEntity.getRect().right = right2 + this.TOLERANCE_X;
                                }
                                else {
                                    this.selectedEntity.getRect().right = right2 - this.TOLERANCE_X;
                                }
                            }
                            final float n22 = this.paintCursur.getStrokeWidth() * 0.3f;
                            if (this.selectedEntity.getRect().right < this.startXLine - n22 || this.selectedEntity.getRect().right > this.startXLine + n22) {
                                pass = isOnUp;
                            }
                            this.pass = (pass != 0);
                            this.invalidate();
                        }
                    }
                    else {
                        if (Math.abs(motionEvent.getX() - this.lasX) <= this.TOLERANCE_X) {
                            return false;
                        }
                        this.lasX = motionEvent.getX();
                        final float n23 = motionEvent.getX() - this.selectedEntity.getDownX();
                        if (n23 == 0.0f) {
                            return false;
                        }
                        final float width = this.selectedEntity.getRect().width();
                        float left3 = n23 + this.selectedEntity.getLeft();
                        if (left3 < 0.0f) {
                            left3 = 0.0f;
                        }
                        final float right15 = left3 + width;
                        final Entity selectedEntity24 = this.selectedEntity;
                        if (selectedEntity24 instanceof EntityQuranTimeline) {
                            final EntityQuranTimeline entityQuranTimeline3 = (EntityQuranTimeline)selectedEntity24;
                            if (entityQuranTimeline3.getIndex() > 0) {
                                final EntityQuranTimeline previewOrNextEntityQuran4 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline3.getIndex() - isOnUp, false);
                                if (previewOrNextEntityQuran4 != null && left3 <= previewOrNextEntityQuran4.getRect().right) {
                                    this.selectedEntity.setX(previewOrNextEntityQuran4.getRect().right);
                                    this.selectedEntity.setRight(previewOrNextEntityQuran4.getRect().right + width);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                            if (entityQuranTimeline3.getIndex() + isOnUp < this.getEntityListQuran().size()) {
                                final EntityQuranTimeline previewOrNextEntityQuran5 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline3.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                if (previewOrNextEntityQuran5 != null && right15 >= previewOrNextEntityQuran5.getRect().left) {
                                    this.selectedEntity.setX(previewOrNextEntityQuran5.getRect().left - width);
                                    this.selectedEntity.setRight(previewOrNextEntityQuran5.getRect().left);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                            if (this.isExist(this.bismilahTimeline) && left3 <= this.bismilahTimeline.getRect().right) {
                                this.selectedEntity.setX(this.bismilahTimeline.getRect().right);
                                this.selectedEntity.setRight(this.bismilahTimeline.getRect().right + width);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                            if (this.isExist(this.mIsi3adaTimeline) && left3 <= this.mIsi3adaTimeline.getRect().right) {
                                this.selectedEntity.setX(this.mIsi3adaTimeline.getRect().right);
                                this.selectedEntity.setRight(this.mIsi3adaTimeline.getRect().right + width);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                        }
                        final Entity selectedEntity25 = this.selectedEntity;
                        if (selectedEntity25 instanceof EntityTrslTimeline) {
                            final EntityTrslTimeline entityTrslTimeline3 = (EntityTrslTimeline)selectedEntity25;
                            if (entityTrslTimeline3.getIndex() > 0) {
                                final EntityTrslTimeline previewOrNextEntityTrslQuran3 = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline3.getIndex() - isOnUp, false);
                                if (previewOrNextEntityTrslQuran3 != null && left3 <= previewOrNextEntityTrslQuran3.getRect().right) {
                                    this.selectedEntity.setX(previewOrNextEntityTrslQuran3.getRect().right);
                                    this.selectedEntity.setRight(previewOrNextEntityTrslQuran3.getRect().right + width);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                            if (entityTrslTimeline3.getIndex() + isOnUp < this.getEntityListTrslQuran().size()) {
                                final EntityTrslTimeline previewOrNextEntityTrslQuran4 = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline3.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                if (previewOrNextEntityTrslQuran4 != null && right15 >= previewOrNextEntityTrslQuran4.getRect().left) {
                                    this.selectedEntity.setX(previewOrNextEntityTrslQuran4.getRect().left - width);
                                    this.selectedEntity.setRight(previewOrNextEntityTrslQuran4.getRect().left);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                        }
                        final Entity selectedEntity26 = this.selectedEntity;
                        if (selectedEntity26 instanceof EntityBismilahTimeline) {
                            final EntityBismilahTimeline entityBismilahTimeline2 = (EntityBismilahTimeline)selectedEntity26;
                            if (entityBismilahTimeline2 == this.mIsi3adaTimeline && this.isExist(this.bismilahTimeline) && right15 >= this.bismilahTimeline.getRect().left) {
                                this.selectedEntity.setX(this.bismilahTimeline.getRect().left - width);
                                this.selectedEntity.setRight(this.bismilahTimeline.getRect().left);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                            if (entityBismilahTimeline2 == this.bismilahTimeline && this.isExist(this.mIsi3adaTimeline) && left3 <= this.mIsi3adaTimeline.getRect().right) {
                                this.selectedEntity.setX(this.mIsi3adaTimeline.getRect().right);
                                this.selectedEntity.setRight(this.mIsi3adaTimeline.getRect().right + width);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                            final EntityQuranTimeline previewOrNextEntityQuran6 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityBismilahTimeline2.getIndex(), (boolean)(isOnUp != 0));
                            if (previewOrNextEntityQuran6 != null && right15 >= previewOrNextEntityQuran6.getRect().left) {
                                this.selectedEntity.setX(previewOrNextEntityQuran6.getRect().left - width);
                                this.selectedEntity.setRight(previewOrNextEntityQuran6.getRect().left);
                                this.pass = false;
                                this.invalidate();
                                return isOnUp != 0;
                            }
                        }
                        final Entity selectedEntity27 = this.selectedEntity;
                        if (selectedEntity27 instanceof EntityAudio) {
                            final EntityAudio entityAudio3 = (EntityAudio)selectedEntity27;
                            if (entityAudio3.getIndex() > 0) {
                                final EntityAudio previewOrNextEntityAudio3 = this.getPreviewOrNextEntityAudio(this.entityListAudio, entityAudio3.getIndex() - isOnUp, false);
                                if (previewOrNextEntityAudio3 != null && left3 <= previewOrNextEntityAudio3.getRect().right) {
                                    this.selectedEntity.setX(previewOrNextEntityAudio3.getRect().right);
                                    this.selectedEntity.setRight(previewOrNextEntityAudio3.getRect().right + width);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                            if (entityAudio3.getIndex() + isOnUp < this.getEntityListAudio().size()) {
                                final EntityAudio previewOrNextEntityAudio4 = this.getPreviewOrNextEntityAudio(this.entityListAudio, entityAudio3.getIndex() + isOnUp, (boolean)(isOnUp != 0));
                                if (previewOrNextEntityAudio4 != null && right15 >= previewOrNextEntityAudio4.getRect().left) {
                                    this.selectedEntity.setX(previewOrNextEntityAudio4.getRect().left - width);
                                    this.selectedEntity.setRight(previewOrNextEntityAudio4.getRect().left);
                                    this.pass = false;
                                    this.invalidate();
                                    return isOnUp != 0;
                                }
                            }
                        }
                        if (this.selectedEntity.getRect().right < right15) {
                            if (this.selectedEntity.getRect().left + this.getCurrentPosition() > this.DETECT_RIGHT_MOVE) {
                                if (!this.isAutoMove) {
                                    final float speed17 = this.SPEED;
                                    if (speed17 > 0.0f) {
                                        this.SPEED = speed17 * n;
                                    }
                                    this.isAutoMove = (isOnUp != 0);
                                    this.time_start = System.currentTimeMillis();
                                    this.autoScrollHandler.postDelayed(this.autoMoveRunnable, (long)100);
                                }
                                else {
                                    final float speed18 = this.SPEED;
                                    if (speed18 < 0.0f) {
                                        this.SPEED = speed18 * n;
                                    }
                                }
                            }
                            else if (this.isAutoMove) {
                                this.isAutoMove = false;
                                this.autoScrollHandler.removeCallbacks(this.autoMoveRunnable);
                            }
                        }
                        else if (this.selectedEntity.getRect().left > 0.0f && this.selectedEntity.getRect().left + this.getCurrentPosition() < -this.DETECT_LEFT_MOVE) {
                            if (!this.isAutoMove) {
                                final float speed19 = this.SPEED;
                                if (speed19 < 0.0f) {
                                    this.SPEED = speed19 * n;
                                }
                                this.isAutoMove = (isOnUp != 0);
                                this.time_start = System.currentTimeMillis();
                                this.autoScrollHandler.postDelayed(this.autoMoveRunnable, (long)100);
                            }
                            else {
                                final float speed20 = this.SPEED;
                                if (speed20 > 0.0f) {
                                    this.SPEED = speed20 * n;
                                }
                            }
                        }
                        else if (this.isAutoMove) {
                            this.isAutoMove = false;
                            this.autoScrollHandler.removeCallbacks(this.autoMoveRunnable);
                        }
                        if (!this.isAutoMove) {
                            this.selectedEntity.getRect().left = left3;
                            this.selectedEntity.getRect().right = right15;
                            this.isMove = (isOnUp != 0);
                        }
                        if (this.selectedEntity.getRect().left < -this.TOLERANCE_X || this.selectedEntity.getRect().left >= this.TOLERANCE_X) {
                            pass = isOnUp;
                        }
                        this.pass = (pass != 0);
                        this.invalidate();
                    }
                }
            }
        }
        else {
            this.eventY = 0.0f;
            this.eventX = 0.0f;
            this.signeY = n;
            this.signeX = n;
            final long n24 = 0L;
            this.lastTime = n24;
            this.lastDifference = n24;
            this.countMove = 0;
            this.isDetectChange = false;
            this.isPassScroll = (isOnUp != 0);
            this.isAutoMove = false;
            if (this.selectedEntity != null) {
                if (this.isMove) {
                    this.current_cursur_position = Math.round(this.currentPosition * 1000.0f / this.second_in_screen * n);
                    this.isAutoScroll = false;
                    this.isOnUp = (isOnUp != 0);
                    this.isCheckLineCursur = false;
                    this.isCheckLine = false;
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.MOVE));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback8 = this.iTrimLineCallback;
                    if (iTrimLineCallback8 != null) {
                        iTrimLineCallback8.onUpdateTime();
                        this.iTrimLineCallback.onAddStack(EntityAction.MOVE);
                    }
                }
                if (this.selectedEntity.getSelectTrim() != null) {
                    this.isAutoScroll = false;
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback9 = this.iTrimLineCallback;
                    if (iTrimLineCallback9 != null) {
                        iTrimLineCallback9.onUp();
                    }
                    this.pass = (isOnUp != 0);
                    this.onThink = (isOnUp != 0);
                    this.lasX = 0.0f;
                    this.isOnUp = (isOnUp != 0);
                    this.isCheckLineCursur = false;
                    this.isCheckLine = false;
                    if (this.selectedEntity.getTrim_type() == 0) {
                        this.selectedEntity.onChange();
                        this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback10 = this.iTrimLineCallback;
                        if (iTrimLineCallback10 != null) {
                            iTrimLineCallback10.onAddStack(EntityAction.TRIM);
                        }
                        this.selectedEntity.onUpLeft();
                    }
                    if (this.selectedEntity.getTrim_type() == isOnUp) {
                        final Entity selectedEntity28 = this.selectedEntity;
                        if (selectedEntity28 instanceof EntityQuranTimeline) {
                            for (final EntityQuranTimeline entityQuranTimeline4 : this.getEntityListQuran()) {
                                if (entityQuranTimeline4.visible() && entityQuranTimeline4.getCurrentStackEntity() != null) {
                                    if (entityQuranTimeline4 == this.selectedEntity) {
                                        continue;
                                    }
                                    entityQuranTimeline4.onChange();
                                    this.entityList.push(new Pair((Object)entityQuranTimeline4, (Object)EntityAction.MOVE));
                                }
                            }
                        }
                        else if (selectedEntity28 instanceof EntityAudio) {
                            for (final EntityAudio entityAudio4 : this.getEntityListAudio()) {
                                if (entityAudio4.visible() && entityAudio4.getCurrentStackEntity() != null) {
                                    if (entityAudio4 == this.selectedEntity) {
                                        continue;
                                    }
                                    entityAudio4.onChange();
                                    this.entityList.push(new Pair((Object)entityAudio4, (Object)EntityAction.MOVE));
                                }
                            }
                        }
                        else if (selectedEntity28 instanceof EntityBismilahTimeline && selectedEntity28.getCurrentStackEntity() != null) {
                            this.selectedEntity.onChange();
                            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.MOVE));
                        }
                        this.selectedEntity.onChange();
                        this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback11 = this.iTrimLineCallback;
                        if (iTrimLineCallback11 != null) {
                            iTrimLineCallback11.onAddStack(EntityAction.TRIM);
                        }
                        this.selectedEntity.onUpRight();
                    }
                    this.selectedEntity.resetTrim_type();
                    this.invalidate();
                }
                final Entity selectedEntity29 = this.selectedEntity;
                selectedEntity29.setX(selectedEntity29.getRect().left);
                final Entity selectedEntity30 = this.selectedEntity;
                selectedEntity30.setRight(selectedEntity30.getRect().right);
                final TrackEntityView$ITrimLineCallback iTrimLineCallback12 = this.iTrimLineCallback;
                if (iTrimLineCallback12 != null && !this.isMove) {
                    iTrimLineCallback12.onUpdateTime();
                }
                this.isMove = false;
                this.autoScrollHandler.removeCallbacks(this.autoMoveRunnable);
                this.autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
            }
            final TrackEntityView$ITrimLineCallback iTrimLineCallback13 = this.iTrimLineCallback;
            if (iTrimLineCallback13 != null) {
                iTrimLineCallback13.onUp();
            }
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
    
    public void onWindowSystemUiVisibilityChanged(final int n) {
        super.onWindowSystemUiVisibilityChanged(n);
        this.updateGestureExclusion();
    }
    
    public void pauseScroll() {
        final Scroller scroller = this.scroller;
        if (scroller != null && !scroller.isFinished()) {
            this.scroller.abortAnimation();
        }
    }
    
    public void previewEntity(final Entity entity) {
        if (entity == null) {
            return;
        }
        final int current_cursur_position = Math.round(entity.getRect().left / this.getSecond_in_screen()) * 1000;
        this.current_cursur_position = current_cursur_position;
        final float n = -current_cursur_position * this.getSecond_in_screen();
        final float n2 = 1000.0f;
        final float currentPosition = n / n2;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.maxTime = (int)(entity.getRect().right / this.getSecond_in_screen() * n2);
        this.timeLineW = entity.getRect().right / this.scaleFactor;
    }
    
    public void redo() {
        try {
            final Stack undoEntityList = this.undoEntityList;
            try {
                if (undoEntityList.isEmpty()) {
                    return;
                }
                final Stack undoEntityList2 = this.undoEntityList;
                try {
                    final Object pop = undoEntityList2.pop();
                    try {
                        Pair pair = (Pair)pop;
                        try {
                            final Object second = pair.second;
                            try {
                                final EntityAction delete = EntityAction.DELETE;
                                final boolean b = true;
                                Label_0128: {
                                    if (second != delete) {
                                        break Label_0128;
                                    }
                                    final Object first = pair.first;
                                    try {
                                        ((Entity)first).visible(false);
                                        Label_0472: {
                                            if (this.iTrimLineCallback == null) {
                                                break Label_0472;
                                            }
                                            final Object first2 = pair.first;
                                            try {
                                                final Entity entity = (Entity)first2;
                                                try {
                                                    if (entity.getEntityView() == null) {
                                                        break Label_0472;
                                                    }
                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                                                    try {
                                                        final Object first3 = pair.first;
                                                        try {
                                                            final Entity entity2 = (Entity)first3;
                                                            try {
                                                                iTrimLineCallback.onDelete(entity2.getEntityView());
                                                                break Label_0472;
                                                                final Object second2 = pair.second;
                                                                try {
                                                                    Label_0332: {
                                                                        if (second2 != EntityAction.DELETE_MULTIPLE) {
                                                                            break Label_0332;
                                                                        }
                                                                        if (this.iTrimLineCallback == null) {
                                                                            break Label_0472;
                                                                        }
                                                                        final Object first4 = pair.first;
                                                                        try {
                                                                            ((Entity)first4).visible(false);
                                                                            final Object first5 = pair.first;
                                                                            try {
                                                                                final Entity entity3 = (Entity)first5;
                                                                                try {
                                                                                    Label_0220: {
                                                                                        if (entity3.getEntityView() == null) {
                                                                                            break Label_0220;
                                                                                        }
                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                                                                                        try {
                                                                                            final Object first6 = pair.first;
                                                                                            try {
                                                                                                final Entity entity4 = (Entity)first6;
                                                                                                try {
                                                                                                    iTrimLineCallback2.onDelete(entity4.getEntityView());
                                                                                                    final Object first7 = pair.first;
                                                                                                    try {
                                                                                                        final Entity entity5 = (Entity)first7;
                                                                                                        try {
                                                                                                            if (entity5.getEntitiesGroup() == null) {
                                                                                                                break Label_0472;
                                                                                                            }
                                                                                                            final Object first8 = pair.first;
                                                                                                            try {
                                                                                                                final Entity entity6 = (Entity)first8;
                                                                                                                try {
                                                                                                                    final List entitiesGroup = entity6.getEntitiesGroup();
                                                                                                                    try {
                                                                                                                        final Iterator iterator = entitiesGroup.iterator();
                                                                                                                        try {
                                                                                                                            while (true) {
                                                                                                                                if (!iterator.hasNext()) {
                                                                                                                                    break Label_0472;
                                                                                                                                }
                                                                                                                                final Object next = iterator.next();
                                                                                                                                try {
                                                                                                                                    final Entity entity7 = (Entity)next;
                                                                                                                                    entity7.visible(false);
                                                                                                                                    if (entity7.getEntityView() == null) {
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                                                                                                                                    try {
                                                                                                                                        iTrimLineCallback3.onDelete(entity7.getEntityView());
                                                                                                                                        continue;
                                                                                                                                        final Object second3 = pair.second;
                                                                                                                                        try {
                                                                                                                                            Label_0407: {
                                                                                                                                                if (second3 != EntityAction.SPLIT) {
                                                                                                                                                    break Label_0407;
                                                                                                                                                }
                                                                                                                                                final Object first9 = pair.first;
                                                                                                                                                try {
                                                                                                                                                    final Entity entity8 = (Entity)first9;
                                                                                                                                                    try {
                                                                                                                                                        entity8.redo();
                                                                                                                                                        this.entityList.push(pair);
                                                                                                                                                        final Stack undoEntityList3 = this.undoEntityList;
                                                                                                                                                        try {
                                                                                                                                                            final Object pop2 = undoEntityList3.pop();
                                                                                                                                                            try {
                                                                                                                                                                pair = (Pair)pop2;
                                                                                                                                                                try {
                                                                                                                                                                    final Object first10 = pair.first;
                                                                                                                                                                    try {
                                                                                                                                                                        ((Entity)first10).visible(b);
                                                                                                                                                                        break Label_0472;
                                                                                                                                                                        final Object second4 = pair.second;
                                                                                                                                                                        try {
                                                                                                                                                                            Label_0456: {
                                                                                                                                                                                if (second4 == EntityAction.ADD) {
                                                                                                                                                                                    break Label_0456;
                                                                                                                                                                                }
                                                                                                                                                                                final Object first11 = pair.first;
                                                                                                                                                                                try {
                                                                                                                                                                                    final Entity entity9 = (Entity)first11;
                                                                                                                                                                                    try {
                                                                                                                                                                                        entity9.redo();
                                                                                                                                                                                        final Object first12 = pair.first;
                                                                                                                                                                                        try {
                                                                                                                                                                                            ((Entity)first12).visible(b);
                                                                                                                                                                                            break Label_0472;
                                                                                                                                                                                            final Object first13 = pair.first;
                                                                                                                                                                                            try {
                                                                                                                                                                                                ((Entity)first13).visible(b);
                                                                                                                                                                                                this.entityList.push(pair);
                                                                                                                                                                                                Label_0575: {
                                                                                                                                                                                                    if (this.iTrimLineCallback == null) {
                                                                                                                                                                                                        break Label_0575;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    final Stack undoEntityList4 = this.undoEntityList;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (undoEntityList4.isEmpty()) {
                                                                                                                                                                                                            this.iTrimLineCallback.enableRedo(false);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.iTrimLineCallback.enableUndo(b);
                                                                                                                                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            iTrimLineCallback4.onUpdateTime();
                                                                                                                                                                                                            final Entity selectedEntity = this.selectedEntity;
                                                                                                                                                                                                            if (selectedEntity == null || selectedEntity.visible()) {
                                                                                                                                                                                                                break Label_0575;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.unselectEntity();
                                                                                                                                                                                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                iTrimLineCallback5.onEmptySelect();
                                                                                                                                                                                                                this.invalidate();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (final Exception ex) {
                                                                                                                                                                                                                Log.e("m_redo_expection", "" + ex.getMessage());
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (final Exception ex2) {}
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception ex3) {}
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (final Exception ex4) {}
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex5) {}
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final Exception ex6) {}
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex7) {}
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex8) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex9) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex10) {}
                                                                                                                                                            }
                                                                                                                                                            catch (final Exception ex11) {}
                                                                                                                                                        }
                                                                                                                                                        catch (final Exception ex12) {}
                                                                                                                                                    }
                                                                                                                                                    catch (final Exception ex13) {}
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex14) {}
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex15) {}
                                                                                                                                    }
                                                                                                                                    catch (final Exception ex16) {}
                                                                                                                                }
                                                                                                                                catch (final Exception ex17) {}
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (final Exception ex18) {}
                                                                                                                    }
                                                                                                                    catch (final Exception ex19) {}
                                                                                                                }
                                                                                                                catch (final Exception ex20) {}
                                                                                                            }
                                                                                                            catch (final Exception ex21) {}
                                                                                                        }
                                                                                                        catch (final Exception ex22) {}
                                                                                                    }
                                                                                                    catch (final Exception ex23) {}
                                                                                                }
                                                                                                catch (final Exception ex24) {}
                                                                                            }
                                                                                            catch (final Exception ex25) {}
                                                                                        }
                                                                                        catch (final Exception ex26) {}
                                                                                    }
                                                                                }
                                                                                catch (final Exception ex27) {}
                                                                            }
                                                                            catch (final Exception ex28) {}
                                                                        }
                                                                        catch (final Exception ex29) {}
                                                                    }
                                                                }
                                                                catch (final Exception ex30) {}
                                                            }
                                                            catch (final Exception ex31) {}
                                                        }
                                                        catch (final Exception ex32) {}
                                                    }
                                                    catch (final Exception ex33) {}
                                                }
                                                catch (final Exception ex34) {}
                                            }
                                            catch (final Exception ex35) {}
                                        }
                                    }
                                    catch (final Exception ex36) {}
                                }
                            }
                            catch (final Exception ex37) {}
                        }
                        catch (final Exception ex38) {}
                    }
                    catch (final Exception ex39) {}
                }
                catch (final Exception ex40) {}
            }
            catch (final Exception ex41) {}
        }
        catch (final Exception ex42) {}
    }
    
    public void selectEntity(final Entity selectedEntity, final boolean b) {
        final Entity selectedEntity2 = this.selectedEntity;
        if (selectedEntity2 != null) {
            selectedEntity2.setSelect(false);
        }
        if (selectedEntity != null) {
            selectedEntity.setSelect(true);
        }
        this.selectedEntity = selectedEntity;
        if (b) {
            this.invalidate();
        }
    }
    
    public void setBismilahTimeline(final EntityBismilahTimeline bismilahTimeline) {
        this.bismilahTimeline = bismilahTimeline;
    }
    
    public void setCurrent_cursur_position(final int current_cursur_position) {
        this.current_cursur_position = current_cursur_position;
    }
    
    public void setDuration(final int duration) {
        this.duration = duration;
    }
    
    public void setFlingY(float mScrollY) {
        this.target = mScrollY;
        final float n = fcmpg(mScrollY, 0.0f);
        final float n2 = 100.0f;
        if (n <= 0) {
            mScrollY = this.y;
            mScrollY += this.mScrollY;
            if (mScrollY >= this.getHeight()) {
                mScrollY = this.mScrollY;
                mScrollY += this.target / n2;
                this.mScrollY = mScrollY;
                final float n3 = this.y + mScrollY;
                mScrollY = (float)this.getHeight();
                if (n3 < mScrollY) {
                    mScrollY = (float)this.getHeight();
                    mScrollY -= this.y;
                    this.mScrollY = mScrollY;
                }
                this.invalidate();
            }
            return;
        }
        final float mScrollY2 = this.mScrollY;
        if (mScrollY2 < 0.0f) {
            mScrollY /= n2;
            final float mScrollY3 = mScrollY2 + mScrollY;
            this.mScrollY = mScrollY3;
            if (mScrollY3 > 0.0f) {
                this.mScrollY = 0.0f;
            }
            this.invalidate();
        }
    }
    
    public void setMaxTime(final int maxTime) {
        this.maxTime = maxTime;
        this.timeLineW = maxTime * this.getSecond_in_screen() / 1000.0f;
    }
    
    public void setOnProgress(final boolean isProgress) {
        this.isProgress = isProgress;
    }
    
    public void setPlaying(final boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
    
    public void setPosCursur(final int current_cursur_position) {
        this.current_cursur_position = current_cursur_position;
        final float currentPosition = -current_cursur_position * this.second_in_screen / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void setRedoUndo(final ImageButton btn_redo, final ImageButton btn_undo) {
        this.btn_redo = btn_redo;
        this.btn_undo = btn_undo;
    }
    
    public void setScaleFactor(float n) {
        this.scaleFactor = n;
        n *= this.currentPosition;
        this.scrolled_with_zoom = n;
    }
    
    public void setSecond_in_screen(float n) {
        this.second_in_screen = n;
        this.dx = 0.03f * n;
        n *= 0.2f;
        this.max_trim = n;
    }
    
    public void setSecond_in_screen(float n, final int duration, final int width_screen) {
        this.second_in_screen = n;
        this.duration = duration;
        this.width_screen = width_screen;
        final float n2 = 0.03f * n;
        this.dx = n2;
        this.TOLERANCE_X = n2;
        n *= 0.2f;
        this.max_trim = n;
    }
    
    public void setiTrimLineCallback(final TrackEntityView$ITrimLineCallback iTrimLineCallback) {
        this.iTrimLineCallback = iTrimLineCallback;
    }
    
    public void setmIsi3adaTimeline(final EntityBismilahTimeline mIsi3adaTimeline) {
        this.mIsi3adaTimeline = mIsi3adaTimeline;
    }
    
    public void splitAudio(final EntityAudio entityAudio, final int n) {
        if (n < this.entityListAudio.size()) {
            this.entityListAudio.add(n, entityAudio);
        }
        else {
            this.entityListAudio.add(entityAudio);
        }
        this.selectEntity(entityAudio, false);
    }
    
    public void stackSplit(final Entity entity) {
        this.entityList.push(new Pair((Object)entity, (Object)EntityAction.SPLIT));
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.onAddStack(EntityAction.SPLIT);
        }
    }
    
    public void translateEndNow() {
        final Entity selectedEntity = this.selectedEntity;
        final boolean b = selectedEntity instanceof EntityQuranTimeline;
        final int n = 1;
        if (b) {
            final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)selectedEntity;
            if (entityQuranTimeline.getIndex() + n < this.entityListQuran.size()) {
                final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline.getIndex() + n, (boolean)(n != 0));
                if (previewOrNextEntityQuran != null) {
                    entityQuranTimeline.setCurrentRect();
                    entityQuranTimeline.setRight(previewOrNextEntityQuran.getRect().left);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                    if (iTrimLineCallback != null) {
                        iTrimLineCallback.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityQuranTimeline.setCurrentRect();
            this.getSelectedEntity().setRight(this.getTimeLineW() * this.getScaleFactor());
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
            if (iTrimLineCallback2 != null) {
                iTrimLineCallback2.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityBismilahTimeline) {
            final EntityBismilahTimeline entityBismilahTimeline = (EntityBismilahTimeline)selectedEntity;
            if (entityBismilahTimeline == this.mIsi3adaTimeline && this.isExist(this.bismilahTimeline)) {
                entityBismilahTimeline.setCurrentRect();
                entityBismilahTimeline.setRight(this.bismilahTimeline.getRect().left);
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                if (iTrimLineCallback3 != null) {
                    iTrimLineCallback3.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            if (entityBismilahTimeline.getIndex() < this.entityListQuran.size()) {
                final EntityQuranTimeline previewOrNextEntityQuran2 = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityBismilahTimeline.getIndex(), (boolean)(n != 0));
                if (previewOrNextEntityQuran2 != null) {
                    entityBismilahTimeline.setCurrentRect();
                    entityBismilahTimeline.setRight(previewOrNextEntityQuran2.getRect().left);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                    if (iTrimLineCallback4 != null) {
                        iTrimLineCallback4.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityBismilahTimeline.setCurrentRect();
            this.getSelectedEntity().setRight(this.getTimeLineW() * this.getScaleFactor());
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
            if (iTrimLineCallback5 != null) {
                iTrimLineCallback5.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityTrslTimeline) {
            final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)selectedEntity;
            if (entityTrslTimeline.getIndex() + n < this.entityListTrslQuran.size()) {
                final EntityTrslTimeline previewOrNextEntityTrslQuran = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline.getIndex() + n, (boolean)(n != 0));
                if (previewOrNextEntityTrslQuran != null) {
                    entityTrslTimeline.setCurrentRect();
                    entityTrslTimeline.setRight(previewOrNextEntityTrslQuran.getRect().left);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                    if (iTrimLineCallback6 != null) {
                        iTrimLineCallback6.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityTrslTimeline.setCurrentRect();
            this.getSelectedEntity().setRight(this.getTimeLineW() * this.getScaleFactor());
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
            if (iTrimLineCallback7 != null) {
                iTrimLineCallback7.onAddStack(EntityAction.TRIM);
            }
        }
    }
    
    public void translateFromNow() {
        final float n = this.getSecond_in_screen() * 0.5f;
        final Entity selectedEntity = this.selectedEntity;
        if (selectedEntity instanceof EntityQuranTimeline) {
            final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)selectedEntity;
            float abs = Math.abs(this.getCurrentPosition());
            if (entityQuranTimeline.getRect().right - abs < n) {
                return;
            }
            if (entityQuranTimeline.getIndex() - 1 >= 0) {
                final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(this.getEntityListQuran(), entityQuranTimeline.getIndex() - 1, false);
                if (previewOrNextEntityQuran != null) {
                    if (abs < previewOrNextEntityQuran.getRect().left + this.getSecond_in_screen()) {
                        abs = this.getSecond_in_screen() + previewOrNextEntityQuran.getRect().left;
                    }
                    entityQuranTimeline.setCurrentRect();
                    entityQuranTimeline.setX(abs);
                    if (entityQuranTimeline.getRect().left < previewOrNextEntityQuran.getRect().right) {
                        previewOrNextEntityQuran.setCurrentRect();
                        previewOrNextEntityQuran.setRight(entityQuranTimeline.getRect().left);
                        previewOrNextEntityQuran.onChange();
                        this.entityList.push(new Pair((Object)previewOrNextEntityQuran, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                        if (iTrimLineCallback != null) {
                            iTrimLineCallback.onAddStack(EntityAction.MOVE);
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                    if (iTrimLineCallback2 != null) {
                        iTrimLineCallback2.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            if (this.isExist(this.bismilahTimeline)) {
                if (abs < this.bismilahTimeline.getRect().left + this.getSecond_in_screen()) {
                    abs = this.bismilahTimeline.getRect().left + this.getSecond_in_screen();
                }
                entityQuranTimeline.setCurrentRect();
                entityQuranTimeline.setX(abs);
                if (entityQuranTimeline.getRect().left < this.bismilahTimeline.getRect().right) {
                    this.bismilahTimeline.setCurrentRect();
                    this.bismilahTimeline.setRight(entityQuranTimeline.getRect().left);
                    this.bismilahTimeline.onChange();
                    this.entityList.push(new Pair((Object)this.bismilahTimeline, (Object)EntityAction.MOVE));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                    if (iTrimLineCallback3 != null) {
                        iTrimLineCallback3.onAddStack(EntityAction.MOVE);
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                if (iTrimLineCallback4 != null) {
                    iTrimLineCallback4.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            if (this.isExist(this.mIsi3adaTimeline)) {
                if (abs < this.mIsi3adaTimeline.getRect().left + this.getSecond_in_screen()) {
                    abs = this.mIsi3adaTimeline.getRect().left + this.getSecond_in_screen();
                }
                entityQuranTimeline.setCurrentRect();
                entityQuranTimeline.setX(abs);
                if (entityQuranTimeline.getRect().left < this.mIsi3adaTimeline.getRect().right) {
                    this.mIsi3adaTimeline.setCurrentRect();
                    this.mIsi3adaTimeline.setRight(entityQuranTimeline.getRect().left);
                    this.mIsi3adaTimeline.onChange();
                    this.entityList.push(new Pair((Object)this.mIsi3adaTimeline, (Object)EntityAction.MOVE));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                    if (iTrimLineCallback5 != null) {
                        iTrimLineCallback5.onAddStack(EntityAction.MOVE);
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                if (iTrimLineCallback6 != null) {
                    iTrimLineCallback6.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            entityQuranTimeline.setCurrentRect();
            this.selectedEntity.setX(abs);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
            if (iTrimLineCallback7 != null) {
                iTrimLineCallback7.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityBismilahTimeline) {
            final EntityBismilahTimeline entityBismilahTimeline = (EntityBismilahTimeline)selectedEntity;
            final float abs2 = Math.abs(this.getCurrentPosition());
            if (entityBismilahTimeline.getRect().right - abs2 < n) {
                return;
            }
            entityBismilahTimeline.setCurrentRect();
            this.selectedEntity.setX(abs2);
            final EntityBismilahTimeline bismilahTimeline = this.bismilahTimeline;
            if (selectedEntity == bismilahTimeline && this.mIsi3adaTimeline != null && bismilahTimeline.getRect().left < this.mIsi3adaTimeline.getRect().right) {
                this.mIsi3adaTimeline.setCurrentRect();
                this.mIsi3adaTimeline.setRight(entityBismilahTimeline.getRect().left);
                this.mIsi3adaTimeline.onChange();
                this.entityList.push(new Pair((Object)this.mIsi3adaTimeline, (Object)EntityAction.MOVE));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback8 = this.iTrimLineCallback;
                if (iTrimLineCallback8 != null) {
                    iTrimLineCallback8.onAddStack(EntityAction.MOVE);
                }
            }
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback9 = this.iTrimLineCallback;
            if (iTrimLineCallback9 != null) {
                iTrimLineCallback9.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityTrslTimeline) {
            final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)selectedEntity;
            float abs3 = Math.abs(this.getCurrentPosition());
            if (entityTrslTimeline.getRect().right - abs3 < n) {
                return;
            }
            if (entityTrslTimeline.getIndex() - 1 >= 0) {
                final EntityTrslTimeline previewOrNextEntityTrslQuran = this.getPreviewOrNextEntityTrslQuran(this.getEntityListTrslQuran(), entityTrslTimeline.getIndex() - 1, false);
                if (previewOrNextEntityTrslQuran != null) {
                    if (abs3 < previewOrNextEntityTrslQuran.getRect().left + this.getSecond_in_screen()) {
                        abs3 = this.getSecond_in_screen() + previewOrNextEntityTrslQuran.getRect().left;
                    }
                    entityTrslTimeline.setCurrentRect();
                    entityTrslTimeline.setX(abs3);
                    if (entityTrslTimeline.getRect().left < previewOrNextEntityTrslQuran.getRect().right) {
                        previewOrNextEntityTrslQuran.setCurrentRect();
                        previewOrNextEntityTrslQuran.setRight(entityTrslTimeline.getRect().left);
                        previewOrNextEntityTrslQuran.onChange();
                        this.entityList.push(new Pair((Object)previewOrNextEntityTrslQuran, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback10 = this.iTrimLineCallback;
                        if (iTrimLineCallback10 != null) {
                            iTrimLineCallback10.onAddStack(EntityAction.MOVE);
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback11 = this.iTrimLineCallback;
                    if (iTrimLineCallback11 != null) {
                        iTrimLineCallback11.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityTrslTimeline.setCurrentRect();
            this.selectedEntity.setX(abs3);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback12 = this.iTrimLineCallback;
            if (iTrimLineCallback12 != null) {
                iTrimLineCallback12.onAddStack(EntityAction.TRIM);
            }
        }
    }
    
    public void translateFromStart() {
        final Entity selectedEntity = this.selectedEntity;
        if (selectedEntity instanceof EntityQuranTimeline) {
            final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)selectedEntity;
            if (entityQuranTimeline.getIndex() - 1 >= 0) {
                final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(this.entityListQuran, entityQuranTimeline.getIndex() - 1, false);
                if (previewOrNextEntityQuran != null) {
                    entityQuranTimeline.setCurrentRect();
                    entityQuranTimeline.setX(previewOrNextEntityQuran.getRect().right);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                    if (iTrimLineCallback != null) {
                        iTrimLineCallback.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            if (this.isExist(this.bismilahTimeline)) {
                entityQuranTimeline.setCurrentRect();
                entityQuranTimeline.setX(this.bismilahTimeline.getRect().right);
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                if (iTrimLineCallback2 != null) {
                    iTrimLineCallback2.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            if (this.isExist(this.mIsi3adaTimeline)) {
                entityQuranTimeline.setCurrentRect();
                entityQuranTimeline.setX(this.mIsi3adaTimeline.getRect().right);
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                if (iTrimLineCallback3 != null) {
                    iTrimLineCallback3.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            entityQuranTimeline.setCurrentRect();
            this.selectedEntity.setX(0.0f);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
            if (iTrimLineCallback4 != null) {
                iTrimLineCallback4.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityBismilahTimeline) {
            final EntityBismilahTimeline entityBismilahTimeline = (EntityBismilahTimeline)selectedEntity;
            if (selectedEntity == this.bismilahTimeline && this.isExist(this.mIsi3adaTimeline)) {
                entityBismilahTimeline.setCurrentRect();
                entityBismilahTimeline.setX(this.mIsi3adaTimeline.getRect().right);
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                if (iTrimLineCallback5 != null) {
                    iTrimLineCallback5.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            entityBismilahTimeline.setCurrentRect();
            this.selectedEntity.setX(0.0f);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
            if (iTrimLineCallback6 != null) {
                iTrimLineCallback6.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityTrslTimeline) {
            final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)selectedEntity;
            if (entityTrslTimeline.getIndex() - 1 >= 0) {
                final EntityTrslTimeline previewOrNextEntityTrslQuran = this.getPreviewOrNextEntityTrslQuran(this.entityListTrslQuran, entityTrslTimeline.getIndex() - 1, false);
                if (previewOrNextEntityTrslQuran != null) {
                    entityTrslTimeline.setCurrentRect();
                    entityTrslTimeline.setX(previewOrNextEntityTrslQuran.getRect().right);
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
                    if (iTrimLineCallback7 != null) {
                        iTrimLineCallback7.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityTrslTimeline.setCurrentRect();
            this.selectedEntity.setX(0.0f);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback8 = this.iTrimLineCallback;
            if (iTrimLineCallback8 != null) {
                iTrimLineCallback8.onAddStack(EntityAction.TRIM);
            }
        }
    }
    
    public void translateToEnd() {
        final int maxTime = this.maxTime;
        this.current_cursur_position = maxTime;
        final float currentPosition = -maxTime * this.second_in_screen / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void translateToEnd(final Entity entity) {
        if (entity == null) {
            return;
        }
        final int current_cursur_position = Math.round(entity.getRect().right / this.getSecond_in_screen()) * 1000;
        this.current_cursur_position = current_cursur_position;
        final float currentPosition = -current_cursur_position * this.getSecond_in_screen() / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void translateToRight() {
        final EntityBismilahTimeline bismilahTimeline = this.bismilahTimeline;
        final float right = bismilahTimeline.getRect().right;
        final List entityListQuran = this.entityListQuran;
        final int index = bismilahTimeline.getIndex();
        final int n = 1;
        final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(entityListQuran, index, (boolean)(n != 0));
        if (previewOrNextEntityQuran != null && right >= previewOrNextEntityQuran.getRect().left) {
            final float n2 = right - previewOrNextEntityQuran.getRect().left;
            final float right2 = previewOrNextEntityQuran.getRect().width() + right;
            previewOrNextEntityQuran.setCurrentRect();
            previewOrNextEntityQuran.setX(right);
            previewOrNextEntityQuran.setRight(right2);
            for (int i = bismilahTimeline.getIndex() + n; i < this.entityListQuran.size(); ++i) {
                final Entity entity = this.entityListQuran.get(i);
                if (entity.visible()) {
                    final float x = entity.getRect().left + n2;
                    final float right3 = entity.getRect().width() + x;
                    entity.setCurrentRect();
                    entity.setX(x);
                    entity.setRight(right3);
                }
            }
        }
    }
    
    public void translateToRight(final boolean b) {
        EntityBismilahTimeline entityBismilahTimeline;
        if (b) {
            entityBismilahTimeline = this.mIsi3adaTimeline;
        }
        else {
            entityBismilahTimeline = this.bismilahTimeline;
        }
        final float right = entityBismilahTimeline.getRect().right;
        if (b && this.isExist(this.bismilahTimeline) && right >= this.bismilahTimeline.getRect().left) {
            final float right2 = this.bismilahTimeline.getRect().width() + right;
            final float n = right - this.bismilahTimeline.getRect().left;
            this.bismilahTimeline.setCurrentRect();
            this.bismilahTimeline.setX(right);
            this.bismilahTimeline.setRight(right2);
            for (int i = this.bismilahTimeline.getIndex(); i < this.entityListQuran.size(); ++i) {
                final Entity entity = this.entityListQuran.get(i);
                if (entity.visible()) {
                    final float x = entity.getRect().left + n;
                    final float right3 = entity.getRect().width() + x;
                    entity.setCurrentRect();
                    entity.setX(x);
                    entity.setRight(right3);
                }
            }
            return;
        }
        final List entityListQuran = this.entityListQuran;
        final int index = entityBismilahTimeline.getIndex();
        final int n2 = 1;
        final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(entityListQuran, index, (boolean)(n2 != 0));
        if (previewOrNextEntityQuran != null && right >= previewOrNextEntityQuran.getRect().left) {
            final float n3 = right - previewOrNextEntityQuran.getRect().left;
            final float right4 = previewOrNextEntityQuran.getRect().width() + right;
            previewOrNextEntityQuran.setCurrentRect();
            previewOrNextEntityQuran.setX(right);
            previewOrNextEntityQuran.setRight(right4);
            for (int j = entityBismilahTimeline.getIndex() + n2; j < this.entityListQuran.size(); ++j) {
                final Entity entity2 = this.entityListQuran.get(j);
                if (entity2.visible()) {
                    final float x2 = entity2.getRect().left + n3;
                    final float right5 = entity2.getRect().width() + x2;
                    entity2.setCurrentRect();
                    entity2.setX(x2);
                    entity2.setRight(right5);
                }
            }
        }
    }
    
    public void translateToRightBismilah(final EntityBismilahTimeline entityBismilahTimeline) {
        if (Math.abs(this.getCurrentPosition()) - entityBismilahTimeline.getRect().left < this.second_in_screen) {
            return;
        }
        if (entityBismilahTimeline.getIndex() < this.getEntityListQuran().size()) {
            final List entityListQuran = this.getEntityListQuran();
            final int index = entityBismilahTimeline.getIndex();
            final int n = 1;
            final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(entityListQuran, index, (boolean)(n != 0));
            if (previewOrNextEntityQuran != null) {
                if (entityBismilahTimeline.getRect().right > previewOrNextEntityQuran.getRect().left) {
                    final float right = entityBismilahTimeline.getRect().right + previewOrNextEntityQuran.getRect().width();
                    final float n2 = entityBismilahTimeline.getRect().right - previewOrNextEntityQuran.getRect().left;
                    previewOrNextEntityQuran.setCurrentRect();
                    previewOrNextEntityQuran.setX(entityBismilahTimeline.getRect().right);
                    previewOrNextEntityQuran.setRight(right);
                    previewOrNextEntityQuran.onChange();
                    this.entityList.push(new Pair((Object)previewOrNextEntityQuran, (Object)EntityAction.MOVE));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                    if (iTrimLineCallback != null) {
                        iTrimLineCallback.onAddStack(EntityAction.MOVE);
                    }
                    for (int i = entityBismilahTimeline.getIndex() + n; i < this.getEntityListQuran().size(); ++i) {
                        final EntityQuranTimeline entityQuranTimeline = this.getEntityListQuran().get(i);
                        entityQuranTimeline.setCurrentRect();
                        final float x = entityQuranTimeline.getRect().left + n2;
                        final float right2 = entityQuranTimeline.getRect().width() + x;
                        entityQuranTimeline.setX(x);
                        entityQuranTimeline.setRight(right2);
                        this.invalidate();
                        entityQuranTimeline.onChange();
                        this.entityList.push(new Pair((Object)entityQuranTimeline, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                        if (iTrimLineCallback2 != null) {
                            iTrimLineCallback2.onAddStack(EntityAction.MOVE);
                        }
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
    
    public void translateToStart(final Entity entity) {
        if (entity == null) {
            return;
        }
        final int current_cursur_position = Math.round(entity.getRect().left / this.getSecond_in_screen()) * 1000;
        this.current_cursur_position = current_cursur_position;
        final float currentPosition = -current_cursur_position * this.getSecond_in_screen() / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void translateUntilNow() {
        final float n = this.getSecond_in_screen() * 0.5f;
        final Entity selectedEntity = this.selectedEntity;
        final boolean b = selectedEntity instanceof EntityQuranTimeline;
        final int n2 = 1;
        if (b) {
            final EntityQuranTimeline entityQuranTimeline = (EntityQuranTimeline)selectedEntity;
            final float abs = Math.abs(this.getCurrentPosition());
            if (abs - entityQuranTimeline.getRect().left < n) {
                return;
            }
            if (entityQuranTimeline.getIndex() + n2 < this.getEntityListQuran().size()) {
                final EntityQuranTimeline previewOrNextEntityQuran = this.getPreviewOrNextEntityQuran(this.getEntityListQuran(), entityQuranTimeline.getIndex() + n2, (boolean)(n2 != 0));
                if (previewOrNextEntityQuran != null) {
                    entityQuranTimeline.setCurrentRect();
                    entityQuranTimeline.setRight(abs);
                    if (entityQuranTimeline.getRect().right > previewOrNextEntityQuran.getRect().left) {
                        final float right = entityQuranTimeline.getRect().right + previewOrNextEntityQuran.getRect().width();
                        final float n3 = entityQuranTimeline.getRect().right - previewOrNextEntityQuran.getRect().left;
                        previewOrNextEntityQuran.setCurrentRect();
                        previewOrNextEntityQuran.setX(entityQuranTimeline.getRect().right);
                        previewOrNextEntityQuran.setRight(right);
                        previewOrNextEntityQuran.onChange();
                        this.entityList.push(new Pair((Object)previewOrNextEntityQuran, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                        if (iTrimLineCallback != null) {
                            iTrimLineCallback.onAddStack(EntityAction.MOVE);
                        }
                        for (int i = entityQuranTimeline.getIndex() + 2; i < this.getEntityListQuran().size(); ++i) {
                            final EntityQuranTimeline entityQuranTimeline2 = this.getEntityListQuran().get(i);
                            entityQuranTimeline2.setCurrentRect();
                            final float x = entityQuranTimeline2.getRect().left + n3;
                            final float right2 = entityQuranTimeline2.getRect().width() + x;
                            entityQuranTimeline2.setX(x);
                            entityQuranTimeline2.setRight(right2);
                            this.invalidate();
                            entityQuranTimeline2.onChange();
                            this.entityList.push(new Pair((Object)entityQuranTimeline2, (Object)EntityAction.MOVE));
                            final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                            if (iTrimLineCallback2 != null) {
                                iTrimLineCallback2.onAddStack(EntityAction.MOVE);
                            }
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                    if (iTrimLineCallback3 != null) {
                        iTrimLineCallback3.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityQuranTimeline.setCurrentRect();
            this.selectedEntity.setRight(abs);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
            if (iTrimLineCallback4 != null) {
                iTrimLineCallback4.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityBismilahTimeline) {
            final EntityBismilahTimeline entityBismilahTimeline = (EntityBismilahTimeline)selectedEntity;
            final float abs2 = Math.abs(this.getCurrentPosition());
            if (abs2 - entityBismilahTimeline.getRect().left < n) {
                return;
            }
            if (entityBismilahTimeline == this.mIsi3adaTimeline && this.isExist(this.bismilahTimeline)) {
                entityBismilahTimeline.setCurrentRect();
                entityBismilahTimeline.setRight(abs2);
                if (entityBismilahTimeline.getRect().right > this.bismilahTimeline.getRect().left) {
                    final float right3 = entityBismilahTimeline.getRect().right + this.bismilahTimeline.getRect().width();
                    final float n4 = entityBismilahTimeline.getRect().right - this.bismilahTimeline.getRect().left;
                    this.bismilahTimeline.setCurrentRect();
                    this.bismilahTimeline.setX(entityBismilahTimeline.getRect().right);
                    this.bismilahTimeline.setRight(right3);
                    this.bismilahTimeline.onChange();
                    this.entityList.push(new Pair((Object)this.bismilahTimeline, (Object)EntityAction.MOVE));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                    if (iTrimLineCallback5 != null) {
                        iTrimLineCallback5.onAddStack(EntityAction.MOVE);
                    }
                    for (int j = this.bismilahTimeline.getIndex(); j < this.getEntityListQuran().size(); ++j) {
                        final EntityQuranTimeline entityQuranTimeline3 = this.getEntityListQuran().get(j);
                        entityQuranTimeline3.setCurrentRect();
                        final float x2 = entityQuranTimeline3.getRect().left + n4;
                        final float right4 = entityQuranTimeline3.getRect().width() + x2;
                        entityQuranTimeline3.setX(x2);
                        entityQuranTimeline3.setRight(right4);
                        this.invalidate();
                        entityQuranTimeline3.onChange();
                        this.entityList.push(new Pair((Object)entityQuranTimeline3, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                        if (iTrimLineCallback6 != null) {
                            iTrimLineCallback6.onAddStack(EntityAction.MOVE);
                        }
                    }
                }
                this.invalidate();
                this.selectedEntity.onChange();
                this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                final TrackEntityView$ITrimLineCallback iTrimLineCallback7 = this.iTrimLineCallback;
                if (iTrimLineCallback7 != null) {
                    iTrimLineCallback7.onAddStack(EntityAction.TRIM);
                }
                return;
            }
            if (entityBismilahTimeline.getIndex() < this.getEntityListQuran().size()) {
                final EntityQuranTimeline previewOrNextEntityQuran2 = this.getPreviewOrNextEntityQuran(this.getEntityListQuran(), entityBismilahTimeline.getIndex(), (boolean)(n2 != 0));
                if (previewOrNextEntityQuran2 != null) {
                    entityBismilahTimeline.setCurrentRect();
                    entityBismilahTimeline.setRight(abs2);
                    if (entityBismilahTimeline.getRect().right > previewOrNextEntityQuran2.getRect().left) {
                        final float right5 = entityBismilahTimeline.getRect().right + previewOrNextEntityQuran2.getRect().width();
                        final float n5 = entityBismilahTimeline.getRect().right - previewOrNextEntityQuran2.getRect().left;
                        previewOrNextEntityQuran2.setCurrentRect();
                        previewOrNextEntityQuran2.setX(entityBismilahTimeline.getRect().right);
                        previewOrNextEntityQuran2.setRight(right5);
                        previewOrNextEntityQuran2.onChange();
                        this.entityList.push(new Pair((Object)previewOrNextEntityQuran2, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback8 = this.iTrimLineCallback;
                        if (iTrimLineCallback8 != null) {
                            iTrimLineCallback8.onAddStack(EntityAction.MOVE);
                        }
                        for (int k = entityBismilahTimeline.getIndex() + n2; k < this.getEntityListQuran().size(); ++k) {
                            final EntityQuranTimeline entityQuranTimeline4 = this.getEntityListQuran().get(k);
                            entityQuranTimeline4.setCurrentRect();
                            final float x3 = entityQuranTimeline4.getRect().left + n5;
                            final float right6 = entityQuranTimeline4.getRect().width() + x3;
                            entityQuranTimeline4.setX(x3);
                            entityQuranTimeline4.setRight(right6);
                            this.invalidate();
                            entityQuranTimeline4.onChange();
                            this.entityList.push(new Pair((Object)entityQuranTimeline4, (Object)EntityAction.MOVE));
                            final TrackEntityView$ITrimLineCallback iTrimLineCallback9 = this.iTrimLineCallback;
                            if (iTrimLineCallback9 != null) {
                                iTrimLineCallback9.onAddStack(EntityAction.MOVE);
                            }
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback10 = this.iTrimLineCallback;
                    if (iTrimLineCallback10 != null) {
                        iTrimLineCallback10.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityBismilahTimeline.setCurrentRect();
            this.selectedEntity.setRight(abs2);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback11 = this.iTrimLineCallback;
            if (iTrimLineCallback11 != null) {
                iTrimLineCallback11.onAddStack(EntityAction.TRIM);
            }
        }
        else if (selectedEntity instanceof EntityTrslTimeline) {
            final EntityTrslTimeline entityTrslTimeline = (EntityTrslTimeline)selectedEntity;
            final float abs3 = Math.abs(this.getCurrentPosition());
            if (abs3 - entityTrslTimeline.getRect().left < n) {
                return;
            }
            if (entityTrslTimeline.getIndex() + n2 < this.getEntityListTrslQuran().size()) {
                final EntityTrslTimeline previewOrNextEntityTrslQuran = this.getPreviewOrNextEntityTrslQuran(this.getEntityListTrslQuran(), entityTrslTimeline.getIndex() + n2, (boolean)(n2 != 0));
                if (previewOrNextEntityTrslQuran != null) {
                    entityTrslTimeline.setCurrentRect();
                    entityTrslTimeline.setRight(abs3);
                    if (entityTrslTimeline.getRect().right > previewOrNextEntityTrslQuran.getRect().left) {
                        final float right7 = entityTrslTimeline.getRect().right + previewOrNextEntityTrslQuran.getRect().width();
                        final float n6 = entityTrslTimeline.getRect().right - previewOrNextEntityTrslQuran.getRect().left;
                        previewOrNextEntityTrslQuran.setCurrentRect();
                        previewOrNextEntityTrslQuran.setX(entityTrslTimeline.getRect().right);
                        previewOrNextEntityTrslQuran.setRight(right7);
                        previewOrNextEntityTrslQuran.onChange();
                        this.entityList.push(new Pair((Object)previewOrNextEntityTrslQuran, (Object)EntityAction.MOVE));
                        final TrackEntityView$ITrimLineCallback iTrimLineCallback12 = this.iTrimLineCallback;
                        if (iTrimLineCallback12 != null) {
                            iTrimLineCallback12.onAddStack(EntityAction.MOVE);
                        }
                        for (int l = entityTrslTimeline.getIndex() + 2; l < this.getEntityListTrslQuran().size(); ++l) {
                            final EntityTrslTimeline entityTrslTimeline2 = this.getEntityListTrslQuran().get(l);
                            entityTrslTimeline2.setCurrentRect();
                            final float x4 = entityTrslTimeline2.getRect().left + n6;
                            final float right8 = entityTrslTimeline2.getRect().width() + x4;
                            entityTrslTimeline2.setX(x4);
                            entityTrslTimeline2.setRight(right8);
                            this.invalidate();
                            entityTrslTimeline2.onChange();
                            this.entityList.push(new Pair((Object)entityTrslTimeline2, (Object)EntityAction.MOVE));
                            final TrackEntityView$ITrimLineCallback iTrimLineCallback13 = this.iTrimLineCallback;
                            if (iTrimLineCallback13 != null) {
                                iTrimLineCallback13.onAddStack(EntityAction.MOVE);
                            }
                        }
                    }
                    this.invalidate();
                    this.selectedEntity.onChange();
                    this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
                    final TrackEntityView$ITrimLineCallback iTrimLineCallback14 = this.iTrimLineCallback;
                    if (iTrimLineCallback14 != null) {
                        iTrimLineCallback14.onAddStack(EntityAction.TRIM);
                    }
                    return;
                }
            }
            entityTrslTimeline.setCurrentRect();
            this.selectedEntity.setRight(abs3);
            this.invalidate();
            this.selectedEntity.onChange();
            this.entityList.push(new Pair((Object)this.selectedEntity, (Object)EntityAction.TRIM));
            final TrackEntityView$ITrimLineCallback iTrimLineCallback15 = this.iTrimLineCallback;
            if (iTrimLineCallback15 != null) {
                iTrimLineCallback15.onAddStack(EntityAction.TRIM);
            }
        }
    }
    
    public void undo() {
        try {
            final Stack entityList = this.entityList;
            try {
                if (entityList.isEmpty()) {
                    return;
                }
                final Stack entityList2 = this.entityList;
                try {
                    final Object pop = entityList2.pop();
                    try {
                        Pair pair = (Pair)pop;
                        try {
                            final Object second = pair.second;
                            try {
                                final EntityAction delete = EntityAction.DELETE;
                                final boolean b = true;
                                Label_0129: {
                                    if (second != delete) {
                                        break Label_0129;
                                    }
                                    final Object first = pair.first;
                                    try {
                                        ((Entity)first).visible(b);
                                        Label_0511: {
                                            if (this.iTrimLineCallback == null) {
                                                break Label_0511;
                                            }
                                            final Object first2 = pair.first;
                                            try {
                                                final Entity entity = (Entity)first2;
                                                try {
                                                    if (entity.getEntityView() == null) {
                                                        break Label_0511;
                                                    }
                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                                                    try {
                                                        final Object first3 = pair.first;
                                                        try {
                                                            final Entity entity2 = (Entity)first3;
                                                            try {
                                                                iTrimLineCallback.onDelete(entity2.getEntityView());
                                                                break Label_0511;
                                                                final Object second2 = pair.second;
                                                                try {
                                                                    Label_0335: {
                                                                        if (second2 != EntityAction.DELETE_MULTIPLE) {
                                                                            break Label_0335;
                                                                        }
                                                                        if (this.iTrimLineCallback == null) {
                                                                            break Label_0511;
                                                                        }
                                                                        final Object first4 = pair.first;
                                                                        try {
                                                                            ((Entity)first4).visible(b);
                                                                            final Object first5 = pair.first;
                                                                            try {
                                                                                final Entity entity3 = (Entity)first5;
                                                                                try {
                                                                                    Label_0222: {
                                                                                        if (entity3.getEntityView() == null) {
                                                                                            break Label_0222;
                                                                                        }
                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback2 = this.iTrimLineCallback;
                                                                                        try {
                                                                                            final Object first6 = pair.first;
                                                                                            try {
                                                                                                final Entity entity4 = (Entity)first6;
                                                                                                try {
                                                                                                    iTrimLineCallback2.onDelete(entity4.getEntityView());
                                                                                                    final Object first7 = pair.first;
                                                                                                    try {
                                                                                                        final Entity entity5 = (Entity)first7;
                                                                                                        try {
                                                                                                            if (entity5.getEntitiesGroup() == null) {
                                                                                                                break Label_0511;
                                                                                                            }
                                                                                                            final Object first8 = pair.first;
                                                                                                            try {
                                                                                                                final Entity entity6 = (Entity)first8;
                                                                                                                try {
                                                                                                                    final List entitiesGroup = entity6.getEntitiesGroup();
                                                                                                                    try {
                                                                                                                        final Iterator iterator = entitiesGroup.iterator();
                                                                                                                        try {
                                                                                                                            while (true) {
                                                                                                                                if (!iterator.hasNext()) {
                                                                                                                                    break Label_0511;
                                                                                                                                }
                                                                                                                                final Object next = iterator.next();
                                                                                                                                try {
                                                                                                                                    final Entity entity7 = (Entity)next;
                                                                                                                                    entity7.visible(b);
                                                                                                                                    if (entity7.getEntityView() == null) {
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback3 = this.iTrimLineCallback;
                                                                                                                                    try {
                                                                                                                                        iTrimLineCallback3.onDelete(entity7.getEntityView());
                                                                                                                                        continue;
                                                                                                                                        final Object second3 = pair.second;
                                                                                                                                        try {
                                                                                                                                            Label_0409: {
                                                                                                                                                if (second3 != EntityAction.SPLIT) {
                                                                                                                                                    break Label_0409;
                                                                                                                                                }
                                                                                                                                                final Object first9 = pair.first;
                                                                                                                                                try {
                                                                                                                                                    ((Entity)first9).visible(false);
                                                                                                                                                    this.undoEntityList.push(pair);
                                                                                                                                                    final Stack entityList3 = this.entityList;
                                                                                                                                                    try {
                                                                                                                                                        final Object pop2 = entityList3.pop();
                                                                                                                                                        try {
                                                                                                                                                            pair = (Pair)pop2;
                                                                                                                                                            try {
                                                                                                                                                                final Object first10 = pair.first;
                                                                                                                                                                try {
                                                                                                                                                                    final Entity entity8 = (Entity)first10;
                                                                                                                                                                    try {
                                                                                                                                                                        entity8.undo();
                                                                                                                                                                        break Label_0511;
                                                                                                                                                                        final Object second4 = pair.second;
                                                                                                                                                                        try {
                                                                                                                                                                            Label_0442: {
                                                                                                                                                                                if (second4 == EntityAction.ADD) {
                                                                                                                                                                                    break Label_0442;
                                                                                                                                                                                }
                                                                                                                                                                                final Object first11 = pair.first;
                                                                                                                                                                                try {
                                                                                                                                                                                    final Entity entity9 = (Entity)first11;
                                                                                                                                                                                    try {
                                                                                                                                                                                        entity9.undo();
                                                                                                                                                                                        break Label_0511;
                                                                                                                                                                                        final Object first12 = pair.first;
                                                                                                                                                                                        try {
                                                                                                                                                                                            ((Entity)first12).visible(false);
                                                                                                                                                                                            final Object first13 = pair.first;
                                                                                                                                                                                            try {
                                                                                                                                                                                                final Entity entity10 = (Entity)first13;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (entity10.getEntityView() == null) {
                                                                                                                                                                                                        break Label_0511;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    final Object first14 = pair.first;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        final Entity entity11 = (Entity)first14;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            entity11.getEntityView().setVisible(false);
                                                                                                                                                                                                            final TrackEntityView$ITrimLineCallback iTrimLineCallback4 = this.iTrimLineCallback;
                                                                                                                                                                                                            if (iTrimLineCallback4 != null) {
                                                                                                                                                                                                                iTrimLineCallback4.onUpdate();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.undoEntityList.push(pair);
                                                                                                                                                                                                            Label_0614: {
                                                                                                                                                                                                                if (this.iTrimLineCallback == null) {
                                                                                                                                                                                                                    break Label_0614;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                final Stack entityList4 = this.entityList;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    if (entityList4.isEmpty()) {
                                                                                                                                                                                                                        this.iTrimLineCallback.enableUndo(false);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    this.iTrimLineCallback.enableRedo(b);
                                                                                                                                                                                                                    final TrackEntityView$ITrimLineCallback iTrimLineCallback5 = this.iTrimLineCallback;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        iTrimLineCallback5.onUpdateTime();
                                                                                                                                                                                                                        final Entity selectedEntity = this.selectedEntity;
                                                                                                                                                                                                                        if (selectedEntity == null || selectedEntity.visible()) {
                                                                                                                                                                                                                            break Label_0614;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        this.unselectEntity();
                                                                                                                                                                                                                        final TrackEntityView$ITrimLineCallback iTrimLineCallback6 = this.iTrimLineCallback;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            iTrimLineCallback6.onEmptySelect();
                                                                                                                                                                                                                            this.invalidate();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (final Exception ex) {
                                                                                                                                                                                                                            Log.e("m_undo_expection", "" + ex.getMessage());
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (final Exception ex2) {}
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (final Exception ex3) {}
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (final Exception ex4) {}
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception ex5) {}
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (final Exception ex6) {}
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (final Exception ex7) {}
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex8) {}
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final Exception ex9) {}
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex10) {}
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex11) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex12) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex13) {}
                                                                                                                                                            }
                                                                                                                                                            catch (final Exception ex14) {}
                                                                                                                                                        }
                                                                                                                                                        catch (final Exception ex15) {}
                                                                                                                                                    }
                                                                                                                                                    catch (final Exception ex16) {}
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex17) {}
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex18) {}
                                                                                                                                    }
                                                                                                                                    catch (final Exception ex19) {}
                                                                                                                                }
                                                                                                                                catch (final Exception ex20) {}
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (final Exception ex21) {}
                                                                                                                    }
                                                                                                                    catch (final Exception ex22) {}
                                                                                                                }
                                                                                                                catch (final Exception ex23) {}
                                                                                                            }
                                                                                                            catch (final Exception ex24) {}
                                                                                                        }
                                                                                                        catch (final Exception ex25) {}
                                                                                                    }
                                                                                                    catch (final Exception ex26) {}
                                                                                                }
                                                                                                catch (final Exception ex27) {}
                                                                                            }
                                                                                            catch (final Exception ex28) {}
                                                                                        }
                                                                                        catch (final Exception ex29) {}
                                                                                    }
                                                                                }
                                                                                catch (final Exception ex30) {}
                                                                            }
                                                                            catch (final Exception ex31) {}
                                                                        }
                                                                        catch (final Exception ex32) {}
                                                                    }
                                                                }
                                                                catch (final Exception ex33) {}
                                                            }
                                                            catch (final Exception ex34) {}
                                                        }
                                                        catch (final Exception ex35) {}
                                                    }
                                                    catch (final Exception ex36) {}
                                                }
                                                catch (final Exception ex37) {}
                                            }
                                            catch (final Exception ex38) {}
                                        }
                                    }
                                    catch (final Exception ex39) {}
                                }
                            }
                            catch (final Exception ex40) {}
                        }
                        catch (final Exception ex41) {}
                    }
                    catch (final Exception ex42) {}
                }
                catch (final Exception ex43) {}
            }
            catch (final Exception ex44) {}
        }
        catch (final Exception ex45) {}
    }
    
    public void unselectEntity() {
        final Entity selectedEntity = this.selectedEntity;
        if (selectedEntity != null) {
            selectedEntity.setSelect(false);
            this.selectedEntity = null;
        }
    }
    
    public void updateCursur(float n) {
        n = -n;
        this.currentPosition = n;
        n *= this.scaleFactor;
        this.scrolled_with_zoom = n;
        this.invalidate();
    }
    
    public void updateCursur(final int current_cursur_position) {
        this.current_cursur_position = current_cursur_position;
        final float currentPosition = -current_cursur_position * this.second_in_screen / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void updateCursurToSelectEntity() {
        final Entity selectedEntity = this.selectedEntity;
        if (selectedEntity == null) {
            return;
        }
        if (selectedEntity.getEntityView().isVisible()) {
            return;
        }
        final int current_cursur_position = Math.round((selectedEntity.getRect().left + this.selectedEntity.getRect().width() * 0.5f) / this.getSecond_in_screen()) * 1000;
        this.current_cursur_position = current_cursur_position;
        final float currentPosition = -current_cursur_position * this.second_in_screen / 1000.0f;
        this.currentPosition = currentPosition;
        this.scrolled_with_zoom = currentPosition * this.scaleFactor;
        this.invalidate();
    }
    
    public void updateSelectionOnTap(final MotionEvent motionEvent) {
        final PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        final boolean select = true;
        this.isPassScroll = select;
        final Entity selectedEntity = this.selectedEntity;
        boolean isPassScroll = false;
        final int n = -1;
        if (selectedEntity != null) {
            final boolean contains = selectedEntity.contains(pointF);
            this.isPassScroll = (!contains && this.selectedEntity.getTrim_type() == n && select);
            if (contains || this.selectedEntity.getTrim_type() != n) {
                this.selectedEntity.setCurrentRect();
                if (this.iTrimLineCallback != null) {
                    if (this.selectedEntity.getTrim_type() == 0) {
                        final Entity selectedEntity2 = this.selectedEntity;
                        selectedEntity2.setOnTapTime((float)(Math.round(selectedEntity2.getRect().left / this.getSecond_in_screen()) * 1000), this.selectedEntity.getRect().left);
                        this.iTrimLineCallback.onPlayVibration();
                    }
                    else if (this.selectedEntity.getTrim_type() == (select ? 1 : 0)) {
                        final Entity selectedEntity3 = this.selectedEntity;
                        selectedEntity3.setOnTapTime((float)(Math.round(selectedEntity3.getRect().right / this.getSecond_in_screen()) * 1000), this.selectedEntity.getRect().right);
                        this.iTrimLineCallback.onPlayVibration();
                    }
                    else {
                        this.iTrimLineCallback.onSelectEntity(this.selectedEntity, 0.0f);
                    }
                }
                if (!this.selectedEntity.isSelect()) {
                    this.selectedEntity.setSelect(select);
                    this.invalidate();
                }
                return;
            }
        }
        while (true) {
            for (int i = 0; i < this.entityListQuran.size(); ++i) {
                Entity selectedEntity4 = this.entityListQuran.get(i);
                if (selectedEntity4 != this.selectedEntity) {
                    if (selectedEntity4.visible()) {
                        final boolean contains2 = ((EntityQuranTimeline)selectedEntity4).contains(pointF);
                        this.isPassScroll = (!contains2 && ((EntityQuranTimeline)selectedEntity4).getTrim_type() == n && select);
                        if (contains2 || ((EntityQuranTimeline)selectedEntity4).getTrim_type() != n) {
                            selectedEntity4.setCurrentRect();
                            selectedEntity4.setSelect(select);
                            selectedEntity4.setDownX(pointF.x);
                            if (this.iTrimLineCallback != null) {
                                if (selectedEntity4.getTrim_type() == 0) {
                                    selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().left / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().left);
                                    this.iTrimLineCallback.onPlayVibration();
                                }
                                else if (selectedEntity4.getTrim_type() == (select ? 1 : 0)) {
                                    selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().right / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().right);
                                    this.iTrimLineCallback.onPlayVibration();
                                }
                                else {
                                    this.iTrimLineCallback.onSelectEntity(selectedEntity4, 0.0f);
                                }
                            }
                            if (selectedEntity4 == null) {
                                for (int j = 0; j < this.entityListTrslQuran.size(); ++j) {
                                    final EntityTrslTimeline entityTrslTimeline = this.entityListTrslQuran.get(j);
                                    if (entityTrslTimeline != this.selectedEntity) {
                                        if (entityTrslTimeline.visible()) {
                                            final boolean contains3 = entityTrslTimeline.contains(pointF);
                                            this.isPassScroll = (!contains3 && entityTrslTimeline.getTrim_type() == n && select);
                                            if (contains3 || entityTrslTimeline.getTrim_type() != n) {
                                                entityTrslTimeline.setCurrentRect();
                                                entityTrslTimeline.setSelect(select);
                                                entityTrslTimeline.setDownX(pointF.x);
                                                if (this.iTrimLineCallback != null) {
                                                    if (entityTrslTimeline.getTrim_type() == 0) {
                                                        entityTrslTimeline.setOnTapTime((float)(Math.round(entityTrslTimeline.getRect().left / this.getSecond_in_screen()) * 1000), entityTrslTimeline.getRect().left);
                                                        this.iTrimLineCallback.onPlayVibration();
                                                    }
                                                    else if (entityTrslTimeline.getTrim_type() == (select ? 1 : 0)) {
                                                        entityTrslTimeline.setOnTapTime((float)(Math.round(entityTrslTimeline.getRect().right / this.getSecond_in_screen()) * 1000), entityTrslTimeline.getRect().right);
                                                        this.iTrimLineCallback.onPlayVibration();
                                                    }
                                                    else {
                                                        this.iTrimLineCallback.onSelectEntity(entityTrslTimeline, 0.0f);
                                                    }
                                                }
                                                selectedEntity4 = entityTrslTimeline;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (selectedEntity4 == null) {
                                for (int k = 0; k < this.entityListAudio.size(); ++k) {
                                    final EntityAudio entityAudio = this.entityListAudio.get(k);
                                    if (entityAudio != this.selectedEntity) {
                                        if (entityAudio.visible()) {
                                            final boolean contains4 = entityAudio.contains(pointF);
                                            this.isPassScroll = (!contains4 && entityAudio.getTrim_type() == n && select);
                                            if (contains4 || entityAudio.getTrim_type() != n) {
                                                entityAudio.setCurrentRect();
                                                entityAudio.setSelect(select);
                                                entityAudio.setDownX(pointF.x);
                                                if (this.iTrimLineCallback != null) {
                                                    if (entityAudio.getTrim_type() == 0) {
                                                        entityAudio.setOnTapTime((float)(Math.round(entityAudio.getRect().left / this.getSecond_in_screen()) * 1000), entityAudio.getRect().left);
                                                        this.iTrimLineCallback.onPlayVibration();
                                                    }
                                                    else if (entityAudio.getTrim_type() == (select ? 1 : 0)) {
                                                        entityAudio.setOnTapTime((float)(Math.round(entityAudio.getRect().right / this.getSecond_in_screen()) * 1000), entityAudio.getRect().right);
                                                        this.iTrimLineCallback.onPlayVibration();
                                                    }
                                                    else {
                                                        this.iTrimLineCallback.onSelectEntity(entityAudio, 0.0f);
                                                    }
                                                }
                                                selectedEntity4 = entityAudio;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (selectedEntity4 == null && this.isExist(this.bismilahTimeline)) {
                                final boolean contains5 = this.bismilahTimeline.contains(pointF);
                                this.isPassScroll = (!contains5 && this.bismilahTimeline.getTrim_type() == n && select);
                                if (contains5 || this.bismilahTimeline.getTrim_type() != n) {
                                    selectedEntity4 = this.bismilahTimeline;
                                    selectedEntity4.setCurrentRect();
                                    selectedEntity4.setSelect(select);
                                    selectedEntity4.setDownX(pointF.x);
                                    if (this.iTrimLineCallback != null) {
                                        if (selectedEntity4.getTrim_type() == 0) {
                                            selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().left / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().left);
                                            this.iTrimLineCallback.onPlayVibration();
                                        }
                                        else if (selectedEntity4.getTrim_type() == (select ? 1 : 0)) {
                                            selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().right / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().right);
                                            this.iTrimLineCallback.onPlayVibration();
                                        }
                                        else {
                                            this.iTrimLineCallback.onSelectEntity(selectedEntity4, 0.0f);
                                        }
                                    }
                                }
                            }
                            if (selectedEntity4 == null && this.isExist(this.mIsi3adaTimeline)) {
                                final boolean contains6 = this.mIsi3adaTimeline.contains(pointF);
                                if (!contains6 && this.mIsi3adaTimeline.getTrim_type() == n) {
                                    isPassScroll = select;
                                }
                                this.isPassScroll = isPassScroll;
                                if (contains6 || this.mIsi3adaTimeline.getTrim_type() != n) {
                                    selectedEntity4 = this.mIsi3adaTimeline;
                                    selectedEntity4.setCurrentRect();
                                    selectedEntity4.setSelect(select);
                                    selectedEntity4.setDownX(pointF.x);
                                    if (this.iTrimLineCallback != null) {
                                        if (selectedEntity4.getTrim_type() == 0) {
                                            selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().left / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().left);
                                            this.iTrimLineCallback.onPlayVibration();
                                        }
                                        else if (selectedEntity4.getTrim_type() == (select ? 1 : 0)) {
                                            selectedEntity4.setOnTapTime((float)(Math.round(selectedEntity4.getRect().right / this.getSecond_in_screen()) * 1000), selectedEntity4.getRect().right);
                                            this.iTrimLineCallback.onPlayVibration();
                                        }
                                        else {
                                            this.iTrimLineCallback.onSelectEntity(selectedEntity4, 0.0f);
                                        }
                                    }
                                }
                            }
                            if (selectedEntity4 == null) {
                                if (this.selectedEntity != null) {
                                    this.unselectEntity();
                                    this.invalidate();
                                }
                            }
                            else if (this.selectedEntity != selectedEntity4) {
                                this.unselectEntity();
                                this.selectedEntity = selectedEntity4;
                                this.invalidate();
                            }
                            if (this.selectedEntity == null) {
                                final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
                                if (iTrimLineCallback != null) {
                                    iTrimLineCallback.onEmptySelect();
                                }
                            }
                            return;
                        }
                    }
                }
            }
            Entity selectedEntity4 = null;
            continue;
        }
    }
    
    public void updateWhenEffect(final EntityAudio entityAudio) {
        final int index = entityAudio.getIndex();
        final int n = 1;
        if (index + n < this.entityListAudio.size()) {
            final EntityAudio previewOrNextEntityAudio = this.getPreviewOrNextEntityAudio(this.entityListAudio, entityAudio.getIndex() + n, (boolean)(n != 0));
            if (previewOrNextEntityAudio != null && entityAudio.getRect().right > previewOrNextEntityAudio.getRect().left) {
                final float right = previewOrNextEntityAudio.getRect().width() + entityAudio.getRect().right;
                final float n2 = entityAudio.getRect().right - previewOrNextEntityAudio.getRect().left;
                previewOrNextEntityAudio.setCurrentRect();
                previewOrNextEntityAudio.setX(entityAudio.getRect().right);
                previewOrNextEntityAudio.setRight(right);
                for (int i = entityAudio.getIndex() + 2; i < this.entityListAudio.size(); ++i) {
                    final Entity entity = this.entityListAudio.get(i);
                    if (entity.visible()) {
                        final float x = entity.getRect().left + n2;
                        final float right2 = entity.getRect().width() + x;
                        entity.setCurrentRect();
                        entity.setX(x);
                        entity.setRight(right2);
                    }
                }
            }
        }
    }
    
    public void update_current_cursur_position(final int current_cursur_position) {
        this.current_cursur_position = current_cursur_position;
    }
}
