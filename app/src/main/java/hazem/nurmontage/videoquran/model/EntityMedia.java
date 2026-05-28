package hazem.nurmontage.videoquran.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class EntityMedia implements Serializable {
    private float duration_fade_in;
    private float duration_fade_out;
    private EffectAudio effectAudio;
    private float end;

    /* renamed from: h */
    private float f419h;
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
    private List<String> paths_https;
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

    /* renamed from: w */
    private float f420w;

    /* renamed from: x */
    private float f421x;

    /* renamed from: y */
    private float f422y;

    public boolean isApplyEffectInPreview() {
        return false;
    }

    public void setEffectAudio(EffectAudio effectAudio) {
        this.effectAudio = effectAudio;
    }

    public EffectAudio getEffectAudio() {
        return this.effectAudio;
    }

    public List<String> getPaths_https() {
        return this.paths_https;
    }

    public void setPaths_https(List<String> list) {
        this.paths_https = list;
    }

    public String getPath_ffmpeg_effect() {
        return this.path_ffmpeg_effect;
    }

    public void setPath_ffmpeg_effect(String filePath) {
        this.path_ffmpeg_effect = filePath;
    }

    public void setVideo_path(String filePath) {
        this.video_path = filePath;
    }

    public String getVideo_path() {
        return this.video_path;
    }

    public String getPath_ffmpeg() {
        return this.path_ffmpeg;
    }

    public void setPath_ffmpeg(String filePath) {
        this.path_ffmpeg = filePath;
    }

    public void setApplyEffectInPreview(boolean isFlag) {
        this.isApplyEffectInPreview = isFlag;
    }

    public float getPosXFFmpeg() {
        return this.posXFFmpeg;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setVolume(float floatValue) {
        this.volume = floatValue;
    }

    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }

    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }

    public float getDuration_fade_in() {
        return this.duration_fade_in;
    }

    public float getDuration_fade_out() {
        return this.duration_fade_out;
    }

    public void setId_raw(int resId) {
        this.id_raw = resId;
    }

    public int getId_raw() {
        return this.id_raw;
    }

    public void setName(String filePath) {
        this.name = filePath;
    }

    public String getName() {
        return this.name;
    }

    public float getOffset_left() {
        return this.offset_left;
    }

    public void setOffset_left(float floatValue) {
        this.offset_left = floatValue;
    }

    public float getMax() {
        return this.max;
    }

    public float getOffset() {
        return this.offset;
    }

    public void setOffset(float floatValue) {
        this.offset = floatValue;
    }

    public void setStart_original(int resId) {
        this.start_original = resId;
    }

    public int getStart_original() {
        return this.start_original;
    }

    public float getPosX() {
        return this.posX;
    }

    public float getPosY() {
        return this.posY;
    }

    public boolean isSoundEnable() {
        return this.isSoundEnable;
    }

    public void setSoundEnable(boolean isFlag) {
        this.isSoundEnable = isFlag;
    }

    public void setScale(float floatValue) {
        this.mScale = floatValue;
    }

    public float getScale() {
        return this.mScale;
    }

    public float getH() {
        return this.f419h;
    }

    public EntityMedia(String filePath, int resId, float floatValue, float f2, float f3, float f4, int value2, float f5, float floatValue6, float f7, float f8, float f9, float f10, float floatValue11) {
        this.volume = 1.0f;
        this.isSoundEnable = true;
        this.f421x = 0.0f;
        this.posXFFmpeg = floatValue11;
        this.f422y = 0.0f;
        this.f420w = 1.0f;
        this.mScale = 1.0f;
        this.uri = filePath;
        this.offset_left = f7;
        this.offset_right = floatValue6;
        this.max = f8;
        this.offset = f5;
        this.start_original = resId;
        this.start = floatValue;
        this.end = f2;
        this.posX = f3;
        this.posY = f4;
        this.duration_fade_in = f9;
        this.duration_fade_out = f10;
        this.time = value2;
    }

    public EntityMedia(String filePath) {
        this.volume = 1.0f;
        this.isSoundEnable = true;
        this.f421x = 0.0f;
        this.f422y = 0.0f;
        this.f420w = 1.0f;
        this.mScale = 1.0f;
        this.uri = filePath;
    }

    public EntityMedia(String filePath, float floatValue, float f2, float f3, float f4, float f5, float floatValue6) {
        this.volume = 1.0f;
        this.isSoundEnable = true;
        this.f421x = 0.0f;
        this.f422y = 0.0f;
        this.f420w = 1.0f;
        this.mScale = 1.0f;
        this.uri = filePath;
        this.start = floatValue;
        this.end = f2;
        this.posX = f3;
        this.posY = f4;
        this.duration_fade_in = f5;
        this.duration_fade_out = floatValue6;
    }

    public void setUri(String filePath) {
        this.uri = filePath;
    }

    public float getOffset_right() {
        return this.offset_right;
    }

    public EntityMedia(String filePath, int resId, float floatValue, float f2, int value2, float f3, float f4, float f5, float floatValue6, float f7, boolean isFlag, float f8, float f9, float f10, float floatValue11) {
        this.volume = 1.0f;
        this.mScale = 1.0f;
        this.uri = filePath;
        this.start = floatValue;
        this.offset = f7;
        this.duration_fade_in = f9;
        this.duration_fade_out = f10;
        this.max = f8;
        this.end = f2;
        this.posXFFmpeg = floatValue11;
        this.time = value2;
        this.start_original = resId;
        this.f421x = f3;
        this.f419h = floatValue6;
        this.f422y = f4;
        this.f420w = f5;
        this.isSoundEnable = isFlag;
    }

    public float getTopX() {
        return this.topX;
    }

    public float getTopY() {
        return this.topY;
    }

    public float getW() {
        return this.f420w;
    }

    public float getX() {
        return this.f421x;
    }

    public float getY() {
        return this.f422y;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int resId) {
        this.time = resId;
    }

    public String getUri() {
        return this.uri;
    }

    public float getStart() {
        return this.start;
    }

    public void setStart(float floatValue) {
        this.start = floatValue;
    }

    public void setDuration_fade_in(float floatValue) {
        this.duration_fade_in = floatValue;
    }

    public void setDuration_fade_out(float floatValue) {
        this.duration_fade_out = floatValue;
    }

    public float getEnd() {
        return this.end;
    }

    public void setEnd(float floatValue) {
        this.end = floatValue;
    }

    public EntityMedia duplicate() {
        return new EntityMedia(this.uri, this.start_original, this.start, this.end, this.time, this.f421x, this.f422y, this.f420w, this.f419h, this.offset, this.isSoundEnable, this.max, this.duration_fade_in, this.duration_fade_out, this.posXFFmpeg);
    }
}
