/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.VectorDrawable
 *  android.util.Log
 *  androidx.core.content.ContextCompat
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.graphics.drawable.VectorDrawable;
import android.util.Log;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.DrawableHelper;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$92
implements EditIconQuranFragment$IQuranIconCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$92(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void add(String string2) {
        Object object = this.this$0;
        object = EngineActivity.cfr_renamed_18(object);
        object = ((TrackEntityView)((Object)object)).getSelectedEntity();
        object = ((Entity)object).getEntityView();
        object = (QuranEntity)object;
        Object object2 = this.this$0;
        object2 = object2.getApplicationContext();
        int n = DrawableHelper.getIDDrawableIconByName(string2);
        object2 = ContextCompat.getDrawable((Context)object2, (int)n);
        object2 = (VectorDrawable)object2;
        ((QuranEntity)object).setVectorDrawable((VectorDrawable)object2);
        ((QuranEntity)object).setIcon(string2);
        ((QuranEntity)object).updateIconDraw();
        int n2 = ((QuranEntity)object).getmPreset();
        ((QuranEntity)object).initPreset(n2);
        object = this.this$0;
        object = EngineActivity.cfr_renamed_64(object);
        try {
            object.invalidate();
        }
        catch (Exception exception) {
            object2 = "";
            object = new StringBuilder((String)object2);
            string2 = ((StringBuilder)object).append(string2).toString();
            object = "icon  e ";
            Log.e((String)object, (String)string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onCancel(String object) {
        Object object2;
        try {
            object2 = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        object2 = ((TrackEntityView)((Object)object2)).getSelectedEntity();
        object2 = ((Entity)object2).getEntityView();
        object2 = (QuranEntity)object2;
        EngineActivity engineActivity = this.this$0;
        engineActivity = engineActivity.getApplicationContext();
        int n = DrawableHelper.getIDDrawableIconByName((String)object);
        engineActivity = ContextCompat.getDrawable((Context)engineActivity, (int)n);
        engineActivity = (VectorDrawable)engineActivity;
        ((QuranEntity)object2).setVectorDrawable((VectorDrawable)engineActivity);
        ((QuranEntity)object2).setIcon((String)object);
        ((QuranEntity)object2).updateIconDraw();
        int n2 = ((QuranEntity)object2).getmPreset();
        ((QuranEntity)object2).initPreset(n2);
        object = this.this$0;
        object = EngineActivity.cfr_renamed_64((EngineActivity)((Object)object));
        object.invalidate();
        object = this.this$0;
        EngineActivity.cfr_renamed_75((EngineActivity)((Object)object));
        object = this.this$0;
        object = EngineActivity.cfr_renamed_73((EngineActivity)((Object)object));
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        object2 = ((TrackEntityView)((Object)object2)).getSelectedEntity();
        float f = -1.0f;
        object.onSelectEntity((Entity)object2, f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onDone(String object) {
        Object object2;
        try {
            object2 = this.this$0;
        }
        catch (Exception exception) {
            return;
        }
        object2 = object2.getApplicationContext();
        int n = DrawableHelper.getIDDrawableIconByName((String)object);
        object2 = ContextCompat.getDrawable((Context)object2, (int)n);
        object2 = (VectorDrawable)object2;
        Object object3 = this.this$0;
        object3 = EngineActivity.cfr_renamed_64((EngineActivity)((Object)object3));
        ((BlurredImageView)((Object)object3)).setIcon((String)object, (VectorDrawable)object2);
        object = this.this$0;
        EngineActivity.cfr_renamed_75((EngineActivity)((Object)object));
        object = this.this$0;
        object = EngineActivity.cfr_renamed_73((EngineActivity)((Object)object));
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        object2 = ((TrackEntityView)((Object)object2)).getSelectedEntity();
        n = -1082130432;
        float f = -1.0f;
        object.onSelectEntity((Entity)object2, f);
    }
}

