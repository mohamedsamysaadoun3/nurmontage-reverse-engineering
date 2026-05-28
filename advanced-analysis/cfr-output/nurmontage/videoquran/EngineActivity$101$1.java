/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 */
package hazem.nurmontage.videoquran;

import android.graphics.RectF;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$101;
import hazem.nurmontage.videoquran.EngineActivity$101$1$1;
import hazem.nurmontage.videoquran.EngineActivity$101$1$2;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;

class EngineActivity$101$1
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity$101 this$1;

    EngineActivity$101$1(EngineActivity$101 engineActivity$101) {
        this.this$1 = engineActivity$101;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        Object object;
        int n;
        int n2;
        Object object2 = this.this$1.val$entityAudio.getMediaPlayer();
        if (object2 != null && (n2 = mediaPlayer.getDuration()) != (n = (object = this.this$1.val$entityAudio.getMediaPlayer()).getDuration())) {
            float f = EngineActivity.cfr_renamed_18(this.this$1.this$0).getSecond_in_screen();
            float f2 = (float)mediaPlayer.getDuration() / 1000.0f;
            n2 = Math.round(f * f2);
            object = this.this$1.val$entityAudio;
            float f3 = this.this$1.val$entityAudio.getRect().left;
            f = n2;
            ((EntityAudio)object).setRight(f3 += f);
            object2 = this.this$1.val$entityAudio;
            f2 = mediaPlayer.getDuration();
            object2.setEnd(f2);
            object2 = this.this$1.val$entityAudio;
            n = 0;
            object2.setStart(0.0f);
            object2 = this.this$1.val$entityAudio;
            f2 = this.this$1.val$entityAudio.getRect().right;
            f3 = this.this$1.val$entityAudio.getmScaleFactor();
            f2 /= f3;
            RectF rectF = this.this$1.val$entityAudio.getRect();
            f3 = rectF.left;
            float f4 = this.this$1.val$entityAudio.getmScaleFactor();
            f3 /= f4;
            EntityAudio entityAudio = this.this$1.val$entityAudio;
            f4 = entityAudio.getOffset_left();
            object2.setMax(f2 -= (f3 -= f4));
            object2 = EngineActivity.cfr_renamed_18(this.this$1.this$0);
            object = this.this$1.val$entityAudio;
            object2.updateWhenEffect((EntityAudio)object);
            object2 = this.this$1.this$0;
            object = new EngineActivity$101$1$1(this, mediaPlayer);
            object2.runOnUiThread((Runnable)object);
        } else {
            object2 = this.this$1.this$0;
            object = new EngineActivity$101$1$2(this, mediaPlayer);
            object2.runOnUiThread((Runnable)object);
        }
    }
}

