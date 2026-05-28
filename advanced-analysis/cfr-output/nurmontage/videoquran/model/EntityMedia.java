/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.EffectAudio;
import java.io.Serializable;
import java.util.List;

public class EntityMedia
implements Serializable {
    private float duration_fade_in;
    private float duration_fade_out;
    private EffectAudio effectAudio;
    private float end;
    private float h;
    private int id_raw;
    protected int index_end_thumbnail;
    protected int index_start_thumbnail;
    private boolean isApplyEffectInPreview;
    private boolean isSoundEnable;
    private float mScale;
    private float max;
    private String name;
    private float offset;
    private float offset_left;
    private float offset_right;
    private String path_ffmpeg;
    private String path_ffmpeg_effect;
    private List paths_https;
    private float posX;
    private float posXFFmpeg;
    private float posY;
    private float start;
    private int start_original;
    private int time;
    private float topX;
    private float topY;
    private String uri;
    private String video_path;
    private float volume;
    private float w;
    private float x;
    private float y;

    public EntityMedia(String string2) {
        float f;
        this.volume = f = 1.0f;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.y = 0.0f;
        this.w = f;
        this.mScale = f;
        this.uri = string2;
    }

    public EntityMedia(String string2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        this.volume = f7 = 1.0f;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.y = 0.0f;
        this.w = f7;
        this.mScale = f7;
        this.uri = string2;
        this.start = f;
        this.end = f2;
        this.posX = f3;
        this.posY = f4;
        this.duration_fade_in = f5;
        this.duration_fade_out = f6;
    }

    public EntityMedia(String string2, int n, float f, float f2, float f3, float f4, int n2, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12;
        this.volume = f12 = 1.0f;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.posXFFmpeg = f11;
        this.y = 0.0f;
        this.w = f12;
        this.mScale = f12;
        this.uri = string2;
        f12 = f7;
        this.offset_left = f7;
        f12 = f6;
        this.offset_right = f6;
        f12 = f8;
        this.max = f8;
        f12 = f5;
        this.offset = f5;
        this.start_original = n;
        f12 = f;
        this.start = f;
        f12 = f2;
        this.end = f2;
        f12 = f3;
        this.posX = f3;
        f12 = f4;
        this.posY = f4;
        f12 = f9;
        this.duration_fade_in = f9;
        f12 = f10;
        this.duration_fade_out = f10;
        this.time = n2;
    }

    public EntityMedia(String string2, int n, float f, float f2, int n2, float f3, float f4, float f5, float f6, float f7, boolean bl, float f8, float f9, float f10, float f11) {
        float f12;
        this.volume = f12 = 1.0f;
        this.mScale = f12;
        this.uri = string2;
        f12 = f;
        this.start = f;
        f12 = f7;
        this.offset = f7;
        f12 = f9;
        this.duration_fade_in = f9;
        f12 = f10;
        this.duration_fade_out = f10;
        f12 = f8;
        this.max = f8;
        f12 = f2;
        this.end = f2;
        f12 = f11;
        this.posXFFmpeg = f11;
        this.time = n2;
        this.start_original = n;
        f12 = f3;
        this.x = f3;
        f12 = f6;
        this.h = f6;
        f12 = f4;
        this.y = f4;
        f12 = f5;
        this.w = f5;
        this.isSoundEnable = bl;
    }

    public EntityMedia duplicate() {
        String string2 = this.uri;
        int n = this.start_original;
        float f = this.start;
        float f2 = this.end;
        int n2 = this.time;
        float f3 = this.x;
        float f4 = this.y;
        float f5 = this.w;
        float f6 = this.h;
        float f7 = this.offset;
        boolean bl = this.isSoundEnable;
        float f8 = this.max;
        float f9 = this.duration_fade_in;
        float f10 = this.duration_fade_out;
        float f11 = this.posXFFmpeg;
        EntityMedia entityMedia = new EntityMedia(string2, n, f, f2, n2, f3, f4, f5, f6, f7, bl, f8, f9, f10, f11);
        return entityMedia;
    }

    public float getDuration_fade_in() {
        return this.duration_fade_in;
    }

    public float getDuration_fade_out() {
        return this.duration_fade_out;
    }

    public EffectAudio getEffectAudio() {
        return this.effectAudio;
    }

    public float getEnd() {
        return this.end;
    }

    public float getH() {
        return this.h;
    }

    public int getId_raw() {
        return this.id_raw;
    }

    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }

    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }

    public float getMax() {
        return this.max;
    }

    public String getName() {
        return this.name;
    }

    public float getOffset() {
        return this.offset;
    }

    public float getOffset_left() {
        return this.offset_left;
    }

    public float getOffset_right() {
        return this.offset_right;
    }

    public String getPath_ffmpeg() {
        return this.path_ffmpeg;
    }

    public String getPath_ffmpeg_effect() {
        return this.path_ffmpeg_effect;
    }

    public List getPaths_https() {
        return this.paths_https;
    }

    public float getPosX() {
        return this.posX;
    }

    public float getPosXFFmpeg() {
        return this.posXFFmpeg;
    }

    public float getPosY() {
        return this.posY;
    }

    public float getScale() {
        return this.mScale;
    }

    public float getStart() {
        return this.start;
    }

    public int getStart_original() {
        return this.start_original;
    }

    public int getTime() {
        return this.time;
    }

    public float getTopX() {
        return this.topX;
    }

    public float getTopY() {
        return this.topY;
    }

    public String getUri() {
        return this.uri;
    }

    public String getVideo_path() {
        return this.video_path;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getW() {
        return this.w;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public boolean isApplyEffectInPreview() {
        return false;
    }

    public boolean isSoundEnable() {
        return this.isSoundEnable;
    }

    public void setApplyEffectInPreview(boolean bl) {
        this.isApplyEffectInPreview = bl;
    }

    public void setDuration_fade_in(float f) {
        this.duration_fade_in = f;
    }

    public void setDuration_fade_out(float f) {
        this.duration_fade_out = f;
    }

    public void setEffectAudio(EffectAudio effectAudio) {
        this.effectAudio = effectAudio;
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setId_raw(int n) {
        this.id_raw = n;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setOffset(float f) {
        this.offset = f;
    }

    public void setOffset_left(float f) {
        this.offset_left = f;
    }

    public void setPath_ffmpeg(String string2) {
        this.path_ffmpeg = string2;
    }

    public void setPath_ffmpeg_effect(String string2) {
        this.path_ffmpeg_effect = string2;
    }

    public void setPaths_https(List list) {
        this.paths_https = list;
    }

    public void setScale(float f) {
        this.mScale = f;
    }

    public void setSoundEnable(boolean bl) {
        this.isSoundEnable = bl;
    }

    public void setStart(float f) {
        this.start = f;
    }

    public void setStart_original(int n) {
        this.start_original = n;
    }

    public void setTime(int n) {
        this.time = n;
    }

    public void setUri(String string2) {
        this.uri = string2;
    }

    public void setVideo_path(String string2) {
        this.video_path = string2;
    }

    public void setVolume(float f) {
        this.volume = f;
    }
}

