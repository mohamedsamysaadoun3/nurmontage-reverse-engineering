/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package hazem.nurmontage.videoquran.views;

import android.view.GestureDetector;
import android.view.MotionEvent;
import hazem.nurmontage.videoquran.model.EntitySelectTool;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;

class BlurredImageView$1
extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ BlurredImageView this$0;

    BlurredImageView$1(BlurredImageView blurredImageView) {
        this.this$0 = blurredImageView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        float f;
        float f2;
        Object object = this.this$0;
        boolean bl = BlurredImageView.cfr_renamed_496(object);
        boolean bl2 = true;
        if (!bl && (object = BlurredImageView.cfr_renamed_499(this.this$0)) != null && (bl = (object = BlurredImageView.cfr_renamed_499(this.this$0)).contains(f2 = motionEvent.getX(), f = motionEvent.getY()))) {
            object = this.this$0;
            BlurredImageView.cfr_renamed_501(object, bl2);
        }
        if ((object = BlurredImageView.cfr_renamed_177(this.this$0)) != null && (bl = ((EntityView)(object = BlurredImageView.cfr_renamed_177(this.this$0))).isVisible()) && !(bl = BlurredImageView.cfr_renamed_498(object = this.this$0))) {
            float f3;
            EntityView entityView;
            object = BlurredImageView.cfr_renamed_493(this.this$0);
            bl = ((EntitySelectTool)object).isApply(entityView = BlurredImageView.cfr_renamed_177(this.this$0), f = motionEvent.getX(), f3 = motionEvent.getY());
            if (bl) {
                object = BlurredImageView.cfr_renamed_493(this.this$0);
                bl = ((EntitySelectTool)object).isApply_Move();
                if (bl) {
                    object = BlurredImageView.cfr_renamed_495(this.this$0);
                    object.onEndMove();
                }
                if (bl = ((EntitySelectTool)(object = BlurredImageView.cfr_renamed_493(this.this$0))).isApply_Scale()) {
                    object = BlurredImageView.cfr_renamed_495(this.this$0);
                    object.onEndScale();
                }
                BlurredImageView.cfr_renamed_493(this.this$0).setClick_apply(bl2);
                object = BlurredImageView.cfr_renamed_493(this.this$0);
                ((EntitySelectTool)object).reset();
            } else {
                object = BlurredImageView.cfr_renamed_493(this.this$0);
                entityView = BlurredImageView.cfr_renamed_177(this.this$0);
                f = motionEvent.getX();
                f3 = motionEvent.getY();
                ((EntitySelectTool)object).isScale(entityView, f, f3);
            }
            object = BlurredImageView.cfr_renamed_493(this.this$0);
            bl = ((EntitySelectTool)object).isApply_Scale();
            if (bl) {
                BlurredImageView.cfr_renamed_493(this.this$0).setOnProgress(bl2);
                object = this.this$0;
                f2 = motionEvent.getX();
                float f4 = motionEvent.getY();
                f4 = BlurredImageView.cfr_renamed_503(object, f2, f4);
                BlurredImageView.cfr_renamed_502(object, f4);
            }
        }
        return bl2;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean bl;
        Object object = BlurredImageView.cfr_renamed_177(this.this$0);
        boolean bl2 = true;
        if (object != null && (bl = ((EntitySelectTool)(object = BlurredImageView.cfr_renamed_493(this.this$0))).isClick_apply())) {
            BlurredImageView.cfr_renamed_493(this.this$0).setClick_apply(false);
            this.this$0.invalidate();
            return bl2;
        }
        object = this.this$0;
        bl = BlurredImageView.cfr_renamed_498((BlurredImageView)((Object)object));
        if (!bl) {
            object = this.this$0;
            BlurredImageView.cfr_renamed_505((BlurredImageView)((Object)object), motionEvent);
        }
        BlurredImageView.cfr_renamed_492(this.this$0, false);
        object = BlurredImageView.cfr_renamed_495(this.this$0);
        if (object != null) {
            object = BlurredImageView.cfr_renamed_177(this.this$0);
            if (object == null) {
                object = this.this$0;
                bl = BlurredImageView.cfr_renamed_498((BlurredImageView)((Object)object));
                if (bl) {
                    object = BlurredImageView.cfr_renamed_495(this.this$0);
                    object.onWattermark();
                } else {
                    object = this.this$0;
                    bl = BlurredImageView.cfr_renamed_497((BlurredImageView)((Object)object));
                    if (bl) {
                        object = BlurredImageView.cfr_renamed_495(this.this$0);
                        object.onSquare();
                    } else {
                        object = BlurredImageView.cfr_renamed_495(this.this$0);
                        object.onEmtyClick();
                    }
                }
            } else {
                object = BlurredImageView.cfr_renamed_493(this.this$0);
                if (object != null && (bl = ((EntitySelectTool)(object = BlurredImageView.cfr_renamed_493(this.this$0))).isApply_Move()) && ((bl = (object = BlurredImageView.cfr_renamed_177(this.this$0)) instanceof QuranEntity) || (bl = (object = BlurredImageView.cfr_renamed_177(this.this$0)) instanceof TranslationQuranEntity)) && !(bl = ((EntitySelectTool)(object = BlurredImageView.cfr_renamed_493(this.this$0))).isApply_all())) {
                    BlurredImageView.cfr_renamed_493(this.this$0).setApply_all(bl2);
                    object = this.this$0;
                    object.invalidate();
                }
            }
            object = this.this$0;
            BlurredImageView.cfr_renamed_501((BlurredImageView)((Object)object), false);
            BlurredImageView.cfr_renamed_500((BlurredImageView)((Object)object), false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}

