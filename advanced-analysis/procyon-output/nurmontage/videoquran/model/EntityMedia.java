// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.util.List;
import java.io.Serializable;

public class EntityMedia implements Serializable
{
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
    
    public EntityMedia(final String uri) {
        final float mScale = 1.0f;
        this.volume = mScale;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.y = 0.0f;
        this.w = mScale;
        this.mScale = mScale;
        this.uri = uri;
    }
    
    public EntityMedia(final String uri, final float start, final float end, final float posX, final float posY, final float duration_fade_in, final float duration_fade_out) {
        final float mScale = 1.0f;
        this.volume = mScale;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.y = 0.0f;
        this.w = mScale;
        this.mScale = mScale;
        this.uri = uri;
        this.start = start;
        this.end = end;
        this.posX = posX;
        this.posY = posY;
        this.duration_fade_in = duration_fade_in;
        this.duration_fade_out = duration_fade_out;
    }
    
    public EntityMedia(final String uri, final int start_original, final float start, final float end, final float posX, final float posY, final int time, final float offset, final float offset_right, final float offset_left, final float max, final float duration_fade_in, final float duration_fade_out, final float posXFFmpeg) {
        final float mScale = 1.0f;
        this.volume = mScale;
        this.isSoundEnable = true;
        this.x = 0.0f;
        this.posXFFmpeg = posXFFmpeg;
        this.y = 0.0f;
        this.w = mScale;
        this.mScale = mScale;
        this.uri = uri;
        this.offset_left = offset_left;
        this.offset_right = offset_right;
        this.max = max;
        this.offset = offset;
        this.start_original = start_original;
        this.start = start;
        this.end = end;
        this.posX = posX;
        this.posY = posY;
        this.duration_fade_in = duration_fade_in;
        this.duration_fade_out = duration_fade_out;
        this.time = time;
    }
    
    public EntityMedia(final String uri, final int start_original, final float start, final float end, final int time, final float x, final float y, final float w, final float h, final float offset, final boolean isSoundEnable, final float max, final float duration_fade_in, final float duration_fade_out, final float posXFFmpeg) {
        final float n = 1.0f;
        this.volume = n;
        this.mScale = n;
        this.uri = uri;
        this.start = start;
        this.offset = offset;
        this.duration_fade_in = duration_fade_in;
        this.duration_fade_out = duration_fade_out;
        this.max = max;
        this.end = end;
        this.posXFFmpeg = posXFFmpeg;
        this.time = time;
        this.start_original = start_original;
        this.x = x;
        this.h = h;
        this.y = y;
        this.w = w;
        this.isSoundEnable = isSoundEnable;
    }
    
    public EntityMedia duplicate() {
        return new EntityMedia(this.uri, this.start_original, this.start, this.end, this.time, this.x, this.y, this.w, this.h, this.offset, this.isSoundEnable, this.max, this.duration_fade_in, this.duration_fade_out, this.posXFFmpeg);
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
    
    public void setApplyEffectInPreview(final boolean isApplyEffectInPreview) {
        this.isApplyEffectInPreview = isApplyEffectInPreview;
    }
    
    public void setDuration_fade_in(final float duration_fade_in) {
        this.duration_fade_in = duration_fade_in;
    }
    
    public void setDuration_fade_out(final float duration_fade_out) {
        this.duration_fade_out = duration_fade_out;
    }
    
    public void setEffectAudio(final EffectAudio effectAudio) {
        this.effectAudio = effectAudio;
    }
    
    public void setEnd(final float end) {
        this.end = end;
    }
    
    public void setId_raw(final int id_raw) {
        this.id_raw = id_raw;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setOffset(final float offset) {
        this.offset = offset;
    }
    
    public void setOffset_left(final float offset_left) {
        this.offset_left = offset_left;
    }
    
    public void setPath_ffmpeg(final String path_ffmpeg) {
        this.path_ffmpeg = path_ffmpeg;
    }
    
    public void setPath_ffmpeg_effect(final String path_ffmpeg_effect) {
        this.path_ffmpeg_effect = path_ffmpeg_effect;
    }
    
    public void setPaths_https(final List paths_https) {
        this.paths_https = paths_https;
    }
    
    public void setScale(final float mScale) {
        this.mScale = mScale;
    }
    
    public void setSoundEnable(final boolean isSoundEnable) {
        this.isSoundEnable = isSoundEnable;
    }
    
    public void setStart(final float start) {
        this.start = start;
    }
    
    public void setStart_original(final int start_original) {
        this.start_original = start_original;
    }
    
    public void setTime(final int time) {
        this.time = time;
    }
    
    public void setUri(final String uri) {
        this.uri = uri;
    }
    
    public void setVideo_path(final String video_path) {
        this.video_path = video_path;
    }
    
    public void setVolume(final float volume) {
        this.volume = volume;
    }
}
