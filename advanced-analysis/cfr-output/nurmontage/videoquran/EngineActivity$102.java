/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.media.MediaPlayer
 *  android.view.View$OnTouchListener
 *  androidx.fragment.app.Fragment
 */
package hazem.nurmontage.videoquran;

import android.graphics.RectF;
import android.media.MediaPlayer;
import android.view.View;
import androidx.fragment.app.Fragment;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.WaveformBitmapRenderer;
import hazem.nurmontage.videoquran.constant.EffectAudioType;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.audio_effect.EchoEffectFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.EnhanceVoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.FadeInOutFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.PitchFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.RemoveNoiceFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.ReverbePresetFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.SpeedFragment;
import hazem.nurmontage.videoquran.fragment.audio_effect.VolumeFragment;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import java.util.List;

class EngineActivity$102
implements EditMediaFragment$IEditMediaCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$102(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void echoEffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = EchoEffectFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void enhanceVoice() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = EnhanceVoiceFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void fadeffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = FadeInOutFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void noice() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = RemoveNoiceFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void onCmd(String string2) {
        this.pausePreview();
        Entity entity = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        boolean bl = entity instanceof EntityAudio;
        if (bl) {
            entity = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
            EngineActivity engineActivity = this.this$0;
            engineActivity.applyffect(string2, (EntityAudio)entity);
        }
    }

    public void onCmdAll(EffectAudio effectAudio) {
        this.pausePreview();
        EngineActivity.cfr_renamed_72(this.this$0);
        this.this$0.applyffectAll(effectAudio, 0);
    }

    public void onCmdPlay(String string2) {
        this.pausePreview();
        Entity entity = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        boolean bl = entity instanceof EntityAudio;
        if (bl) {
            entity = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
            EngineActivity engineActivity = this.this$0;
            engineActivity.applyffectPlayAuto(string2, (EntityAudio)entity);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onCut() {
        Object object;
        float f;
        int n;
        float f2;
        float f3;
        Object object2;
        float f4;
        Object object3;
        EntityAudio entityAudio;
        block92: {
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_68(engineActivity);
            EngineActivity engineActivity2 = this.this$0;
            TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity2);
            Entity entity = trackEntityView.getSelectedEntity();
            boolean bl = entity instanceof EntityAudio;
            if (!bl) return;
            EngineActivity engineActivity3 = this.this$0;
            TrackEntityView trackEntityView2 = EngineActivity.cfr_renamed_18(engineActivity3);
            Entity entity2 = trackEntityView2.getSelectedEntity();
            entityAudio = (EntityAudio)entity2;
            object3 = this.this$0;
            object3 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object3));
            f4 = ((TrackEntityView)((Object)object3)).getCurrentPosition();
            f4 = Math.abs(f4);
            object2 = entityAudio.getRect();
            f3 = ((RectF)object2).left;
            f2 = f4 == f3 ? 0 : (f4 < f3 ? -1 : 1);
            if (f2 < 0) return;
            object2 = entityAudio.getRect();
            f3 = ((RectF)object2).right;
            f2 = f4 == f3 ? 0 : (f4 > f3 ? 1 : -1);
            if (f2 > 0) return;
            object2 = this.this$0;
            object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
            f3 = ((TrackEntityView)((Object)object2)).getSecond_in_screenNoScale();
            n = 0x3DCCCCCD;
            f = 0.1f;
            f3 *= f;
            object = entityAudio.getRect();
            f = ((RectF)object).left;
            n = f4 == f ? 0 : (f4 > f ? 1 : -1);
            if (n > 0) {
                object = entityAudio.getRect();
                f = ((RectF)object).left + f3;
                n = f4 == f ? 0 : (f4 < f ? -1 : 1);
                if (n < 0) {
                    return;
                }
            }
            object = entityAudio.getRect();
            f = ((RectF)object).right;
            n = f4 == f ? 0 : (f4 < f ? -1 : 1);
            if (n < 0) {
                object = entityAudio.getRect();
                f = ((RectF)object).right - f3;
                f2 = f4 == f ? 0 : (f4 > f ? 1 : -1);
                if (f2 <= 0) break block92;
                return;
            }
        }
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        f3 = ((TrackEntityView)((Object)object2)).getCurrentPosition();
        object = this.this$0;
        object = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
        f = ((TrackEntityView)((Object)object)).getSecond_in_screen();
        f3 /= f;
        n = 1148846080;
        f = 1000.0f;
        f3 *= f;
        f2 = Math.round(f3);
        f2 = Math.abs((int)f2);
        RectF rectF = entityAudio.getRect();
        float f5 = rectF.left;
        Object object4 = this.this$0;
        object4 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object4));
        float f6 = ((TrackEntityView)((Object)object4)).getSecond_in_screen();
        f5 = f5 / f6 * f;
        n = Math.round(f5);
        n = Math.abs(n);
        f3 = f2 -= n;
        f = entityAudio.getStart();
        f3 += f;
        f2 = Math.round(f3);
        object = entityAudio.split(f4);
        float[] fArray = entityAudio.getAmps();
        ((EntityAudio)object).setAmps(fArray);
        WaveformBitmapRenderer waveformBitmapRenderer = entityAudio.getRenderer();
        ((EntityAudio)object).setRenderer(waveformBitmapRenderer);
        List list = entityAudio.getPaths_http();
        ((EntityAudio)object).addPathHttp(list);
        String string2 = entityAudio.getPath_ffmpeg_effect();
        ((EntityAudio)object).setPath_ffmpeg_effect(string2);
        String string3 = entityAudio.getVideo_path();
        ((EntityAudio)object).setVideo_path(string3);
        int n2 = entityAudio.isApplyEffectInPreview();
        ((EntityAudio)object).setApplyEffectInPreview(n2 != 0);
        EffectAudio effectAudio = entityAudio.getEffectAudio();
        ((EntityAudio)object).setEffectAudio(effectAudio);
        f5 = entityAudio.getmScaleFactor();
        ((Entity)object).setmScaleFactor(f5);
        MediaPlayer mediaPlayer = entityAudio.getMediaPlayer();
        ((EntityAudio)object).setMediaPlayer(mediaPlayer);
        String string4 = entityAudio.getPath_ffmpeg();
        ((EntityAudio)object).setPath_ffmpeg(string4);
        n2 = entityAudio.getIndex() + 1;
        ((Entity)object).setIndex(n2);
        f5 = entityAudio.getEnd();
        ((EntityAudio)object).setEnd(f5);
        f5 = f2;
        ((EntityAudio)object).setStart(f5);
        ((EntityAudio)object).setMin_duration((int)f2);
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        int n3 = ((Entity)object).getIndex();
        ((TrackEntityView)((Object)object2)).splitAudio((EntityAudio)object, n3);
        object2 = this.this$0;
        object2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        ((TrackEntityView)((Object)object2)).stackSplit(entityAudio);
        entityAudio.setCurrentRect();
        entityAudio.setRight(f4);
        object3 = entityAudio.getRect();
        f4 = ((RectF)object3).right;
        f3 = entityAudio.getmScaleFactor();
        f4 /= f3;
        object2 = entityAudio.getRect();
        f3 = ((RectF)object2).left;
        f6 = entityAudio.getmScaleFactor();
        f3 /= f6;
        f6 = entityAudio.getOffset_left();
        f4 -= (f3 -= f6);
        entityAudio.setMax(f4);
        entityAudio.setEnd(f5);
        f4 = entityAudio.getOffset_right();
        ((Entity)object).setOffset_right(f4);
        f4 = 0.0f;
        object3 = null;
        entityAudio.setOffset_right(0.0f);
        f4 = entityAudio.getOffset();
        f3 = entityAudio.getOffset_left();
        f4 += f3;
        object2 = entityAudio.getRect();
        f3 = object2.width();
        f5 = entityAudio.getmScaleFactor();
        f4 += (f3 /= f5);
        ((Entity)object).setOffset(f4);
        entityAudio.onChange();
        object3 = this.this$0;
        object3 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object3));
        f4 = ((TrackEntityView)((Object)object3)).getSecond_in_screenNoScale();
        ((EntityAudio)object).setSecond_in_screen(f4);
        ((EntityAudio)object).updateEffect();
        entityAudio.updateEffect();
        EngineActivity engineActivity = this.this$0;
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(engineActivity);
        trackEntityView.stackSplit((Entity)object);
        EngineActivity engineActivity4 = this.this$0;
        TrackEntityView trackEntityView3 = EngineActivity.cfr_renamed_18(engineActivity4);
        try {
            trackEntityView3.invalidate();
            return;
        }
        catch (Exception exception) {
            TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = EngineActivity.cfr_renamed_73(this.this$0);
            if (trackEntityView$ITrimLineCallback == null) return;
            TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback2 = EngineActivity.cfr_renamed_73(this.this$0);
            trackEntityView$ITrimLineCallback2.onEmptySelect();
        }
    }

    public void onDelete() {
        block8: {
            Object object = this.this$0;
            EngineActivity.cfr_renamed_68((EngineActivity)((Object)object));
            object = this.this$0;
            object = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
            ((TrackEntityView)((Object)object)).deleteMediaEntity();
            object = this.this$0;
            EngineActivity.cfr_renamed_74((EngineActivity)((Object)object));
            object = this.this$0;
            object = EngineActivity.cfr_renamed_73((EngineActivity)((Object)object));
            try {
                object.onEmptySelect();
            }
            catch (Exception exception) {
                object = EngineActivity.cfr_renamed_73(this.this$0);
                if (object == null) break block8;
                object = EngineActivity.cfr_renamed_73(this.this$0);
                object.onEmptySelect();
            }
        }
    }

    public void onDone() {
        this.pausePreview();
        EngineActivity.cfr_renamed_75(this.this$0);
        TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = EngineActivity.cfr_renamed_73(this.this$0);
        Entity entity = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        trackEntityView$ITrimLineCallback.onSelectEntity(entity, -1.0f);
    }

    public void onDuplicate() {
        block14: {
            Object object = this.this$0;
            object = EngineActivity.cfr_renamed_18(object);
            object = ((TrackEntityView)((Object)object)).getSelectedEntity();
            boolean bl = object instanceof EntityAudio;
            if (!bl) break block14;
            object = this.this$0;
            object = EngineActivity.cfr_renamed_18(object);
            object = ((TrackEntityView)((Object)object)).getSelectedEntity();
            object = (EntityAudio)object;
            EngineActivity engineActivity = this.this$0;
            EngineActivity.cfr_renamed_68(engineActivity);
            engineActivity = this.this$0;
            MediaPlayer mediaPlayer = ((EntityAudio)object).getMediaPlayer();
            int n = mediaPlayer.getDuration();
            EngineActivity.cfr_renamed_76(engineActivity, n, (EntityAudio)object);
            object = this.this$0;
            try {
                EngineActivity.cfr_renamed_74(object);
            }
            catch (Exception exception) {
                object = EngineActivity.cfr_renamed_73(this.this$0);
                if (object == null) break block14;
                object = EngineActivity.cfr_renamed_73(this.this$0);
                object.onEmptySelect();
            }
        }
    }

    public void onReplace() {
    }

    public void pausePreview() {
        block8: {
            Object object = this.this$0;
            boolean bl = EngineActivity.cfr_renamed_77(object);
            if (!bl) {
                return;
            }
            object = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
            bl = object instanceof EntityAudio;
            if (bl) {
                object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
                EngineActivity.cfr_renamed_78(this.this$0, false);
                this.this$0.pauseTimelineAnimation();
                View.OnTouchListener onTouchListener = EngineActivity.cfr_renamed_18(this.this$0);
                boolean bl2 = EngineActivity.cfr_renamed_77(this.this$0);
                onTouchListener.setPlaying(bl2);
                onTouchListener = EngineActivity.cfr_renamed_64(this.this$0);
                EngineActivity engineActivity = this.this$0;
                bl2 = EngineActivity.cfr_renamed_77(engineActivity);
                onTouchListener.setPlaying(bl2);
                onTouchListener = ((EntityAudio)object).getMediaPlayer();
                if (onTouchListener == null) break block8;
                onTouchListener = ((EntityAudio)object).getMediaPlayer();
                boolean bl3 = onTouchListener.isPlaying();
                if (!bl3) break block8;
                object = ((EntityAudio)object).getMediaPlayer();
                try {
                    object.pause();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public void pitchffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = PitchFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void reverbEffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = ReverbePresetFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void speedffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = SpeedFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }

    public void startPreview() {
        Object object;
        boolean bl;
        Entity entity = EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        boolean bl2 = entity instanceof EntityAudio;
        if (bl2 && !(bl = (object = ((EntityAudio)(entity = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity())).getMediaPlayer()).isPlaying())) {
            EngineActivity.cfr_renamed_18(this.this$0).previewEntity(entity);
            EngineActivity.cfr_renamed_78(this.this$0, true);
            EngineActivity.cfr_renamed_18(this.this$0).translateToStart(entity);
            object = this.this$0;
            TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object));
            int n = trackEntityView.getCurrent_cursur_position();
            EngineActivity.cfr_renamed_79((EngineActivity)((Object)object), n);
            object = this.this$0;
            ((EngineActivity)((Object)object)).startTimelineAnimationPreview((EntityAudio)entity);
        }
    }

    public void updateEntity(EffectAudioType effectAudioType, EntityAudio entityAudio) {
        Object object;
        int n;
        for (int i = 0; i < (n = (object = EngineActivity.cfr_renamed_18(this.this$0).getEntityListAudio()).size()); ++i) {
            Object object2;
            float f;
            int n2;
            int n3;
            object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getEntityListAudio().get(i);
            if (object == entityAudio || (n3 = ((Entity)object).visible()) == 0) continue;
            Object object3 = EffectAudioType.ECHO;
            if (effectAudioType == object3) {
                object3 = ((EntityAudio)object).getEffectAudio();
                n2 = entityAudio.getEffectAudio().getDecays();
                ((EffectAudio)object3).setDecays(n2);
                object3 = ((EntityAudio)object).getEffectAudio();
                n2 = entityAudio.getEffectAudio().getDelays();
                ((EffectAudio)object3).setDelays(n2);
                object3 = ((EntityAudio)object).getEffectAudio();
                f = entityAudio.getEffectAudio().getOutGain();
                ((EffectAudio)object3).setOutGain(f);
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio().getDecays_cmd();
                ((EffectAudio)object3).setDecays_cmd((String)object2);
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio().getDelays_cmd();
                ((EffectAudio)object3).setDelays_cmd((String)object2);
            }
            if (effectAudioType == (object3 = EffectAudioType.NOICE)) {
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio();
                n2 = ((EffectAudio)object2).isRemoveNoice() ? 1 : 0;
                ((EffectAudio)object3).setRemoveNoice(n2 != 0);
            }
            if (effectAudioType == (object3 = EffectAudioType.ENHANCE)) {
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio();
                n2 = ((EffectAudio)object2).isEnhance();
                ((EffectAudio)object3).setEnhance(n2 != 0);
            }
            if (effectAudioType == (object3 = EffectAudioType.SPEED)) {
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio();
                f = ((EffectAudio)object2).getSpeed();
                ((EffectAudio)object3).setSpeed(f);
            }
            if (effectAudioType == (object3 = EffectAudioType.REVERB)) {
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio().getReverbPreset();
                ((EffectAudio)object3).setReverbPreset((String)object2);
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio();
                n2 = ((EffectAudio)object2).getReverbPreset_index_list();
                ((EffectAudio)object3).setReverbPreset_index_list(n2);
            }
            if (effectAudioType == (object3 = EffectAudioType.VOLUME)) {
                object3 = ((EntityAudio)object).getEffectAudio();
                object2 = entityAudio.getEffectAudio();
                f = ((EffectAudio)object2).getVolume();
                ((EffectAudio)object3).setVolume(f);
            }
            if (effectAudioType != (object3 = EffectAudioType.FADE)) continue;
            object3 = ((EntityAudio)object).getEffectAudio();
            object2 = entityAudio.getEffectAudio();
            n2 = ((EffectAudio)object2).getFade_in();
            ((EffectAudio)object3).setFade_in(n2);
            object = ((EntityAudio)object).getEffectAudio();
            object3 = entityAudio.getEffectAudio();
            n3 = ((EffectAudio)object3).getFade_out();
            ((EffectAudio)object).setFade_out(n3);
        }
    }

    public void volumeEffect() {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity engineActivity = this.this$0;
        int n = R$id.layout_menu;
        engineActivity.findViewById(n).setVisibility(4);
        engineActivity = this.this$0.getSupportFragmentManager().beginTransaction();
        Object object = (EntityAudio)EngineActivity.cfr_renamed_18(this.this$0).getSelectedEntity();
        EngineActivity engineActivity2 = this.this$0;
        object = VolumeFragment.getInstance(EngineActivity.cfr_renamed_69(engineActivity2), object);
        EngineActivity.cfr_renamed_70(engineActivity2, (Fragment)object);
        n = R$id.m_container;
        engineActivity2 = EngineActivity.cfr_renamed_71(this.this$0);
        engineActivity.replace(n, (Fragment)engineActivity2);
        engineActivity.commit();
    }
}

