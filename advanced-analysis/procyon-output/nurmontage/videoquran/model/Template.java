// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.Utils.MFileUtils$FileInfo;
import java.util.List;
import java.io.Serializable;

public class Template implements Serializable
{
    private int color_ipad;
    private int currentCursur;
    private int duration;
    private int duration_video_media;
    private EntityBismilahTemplate entityBismilahTemplate;
    private EntityBismilahTemplate entityIsti3adaTemplate;
    private final List entityMediaList;
    private EntityProgressTemplate entityProgressTemplate;
    private EntitySurahTemplate entitySurahTemplate;
    private String extension;
    private MFileUtils$FileInfo fileInfo;
    private String folder_template;
    private int fps;
    private String frame_bg;
    private Gradient gradient;
    private int height;
    private float height_square;
    private String idTemplate;
    private String imgResize;
    private int index_color;
    private int ipad_type;
    private boolean isGlass;
    private boolean isNewCode;
    private boolean isVideoSquare;
    private float mDrawingTranslationX;
    private float mDrawingTranslationY;
    private TimeModel mTimeModel;
    private String name_drawable;
    private final List quranEntityList;
    private int resizeType;
    private String resolution;
    private float scale_timeline;
    private SquareBitmapModel squareBitmapModel;
    private final List translationTemplateList;
    private String uri_bg;
    private String uri_bg_ffmpeg;
    private String uri_media_video;
    private String uri_original_upload_video;
    private String uri_upload_extract_audio_video;
    private String uri_video;
    private int width;
    private float width_square;
    private float x_square;
    private float y_square;
    
    public Template() {
        this.resolution = "720p";
        this.scale_timeline = 0.5f;
        this.fps = 30;
        this.resizeType = ResizeType.SOCIAL_STORY.ordinal();
        this.imgResize = "i_9:16";
        this.x_square = 0.3f;
        this.y_square = 0.2f;
        this.width_square = 0.37218544f;
        this.height_square = 0.41986755f;
        final int n = -1;
        this.color_ipad = n;
        this.ipad_type = IpadType.IPAD.ordinal();
        this.entityMediaList = new ArrayList();
        this.index_color = n;
        this.quranEntityList = new ArrayList();
        this.translationTemplateList = new ArrayList();
    }
    
    public void addMedia(final EntityMedia entityMedia) {
        this.entityMediaList.add(entityMedia);
    }
    
    public void addQuranEntityList(final EntityQuranTemplate entityQuranTemplate) {
        this.quranEntityList.add(entityQuranTemplate);
    }
    
    public void addTrslEntityList(final EntityTranslationTemplate entityTranslationTemplate) {
        this.translationTemplateList.add(entityTranslationTemplate);
    }
    
    public Template duplicate() {
        Object o = null;
        try {
            o = new(java.io.ByteArrayOutputStream.class)();
            try {
                new ByteArrayOutputStream();
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)o);
                try {
                    objectOutputStream.writeObject(this);
                    objectOutputStream.flush();
                    try {
                        o = ((ByteArrayOutputStream)o).toByteArray();
                        o = new ObjectInputStream(new ByteArrayInputStream((byte[])o));
                        o = ((ObjectInputStream)o).readObject();
                        try {
                            return (Template)o;
                        }
                        catch (final ClassNotFoundException o) {}
                        catch (final IOException ex) {}
                    }
                    catch (final ClassNotFoundException ex2) {}
                    catch (final IOException ex3) {}
                }
                catch (final ClassNotFoundException ex4) {}
                catch (final IOException ex5) {}
            }
            catch (final ClassNotFoundException ex6) {}
            catch (final IOException ex7) {}
        }
        catch (final ClassNotFoundException ex8) {}
        catch (final IOException ex9) {}
        ((Exception)o).printStackTrace();
        return null;
    }
    
    public int geTypeResize() {
        return this.resizeType;
    }
    
    public int getColor_ipad() {
        return this.color_ipad;
    }
    
    public int getCurrentCursur() {
        return this.currentCursur;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public int getDuration_video_media() {
        return this.duration_video_media;
    }
    
    public EntityBismilahTemplate getEntityBismilahTemplate() {
        return this.entityBismilahTemplate;
    }
    
    public EntityBismilahTemplate getEntityIsti3adaTemplate() {
        return this.entityIsti3adaTemplate;
    }
    
    public List getEntityMediaList() {
        return this.entityMediaList;
    }
    
    public EntityProgressTemplate getEntityProgressTemplate() {
        return this.entityProgressTemplate;
    }
    
    public EntitySurahTemplate getEntitySurahTemplate() {
        return this.entitySurahTemplate;
    }
    
    public String getExtension() {
        return this.extension;
    }
    
    public MFileUtils$FileInfo getFileInfo() {
        return this.fileInfo;
    }
    
    public String getFolder_template() {
        return this.folder_template;
    }
    
    public int getFps() {
        return this.fps;
    }
    
    public String getFrame_bg() {
        return this.frame_bg;
    }
    
    public Gradient getGradient() {
        return this.gradient;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public float getHeight_square() {
        return this.height_square;
    }
    
    public String getIdTemplate() {
        return this.idTemplate;
    }
    
    public String getImgResize() {
        return this.imgResize;
    }
    
    public int getIndex_color() {
        return this.index_color;
    }
    
    public int getIpad_type() {
        return this.ipad_type;
    }
    
    public String getName_drawable() {
        return this.name_drawable;
    }
    
    public List getQuranEntityList() {
        return this.quranEntityList;
    }
    
    public String getResolution() {
        return this.resolution;
    }
    
    public float getScale_timeline() {
        return this.scale_timeline;
    }
    
    public SquareBitmapModel getSquareBitmapModel() {
        if (this.squareBitmapModel == null) {
            this.squareBitmapModel = new SquareBitmapModel();
        }
        return this.squareBitmapModel;
    }
    
    public List getTranslationTemplateList() {
        return this.translationTemplateList;
    }
    
    public String getUri_bg() {
        return this.uri_bg;
    }
    
    public String getUri_bg_ffmpeg() {
        return this.uri_bg_ffmpeg;
    }
    
    public String getUri_media_video() {
        return this.uri_media_video;
    }
    
    public String getUri_original_upload_video() {
        return this.uri_original_upload_video;
    }
    
    public String getUri_upload_extract_audio_video() {
        return this.uri_upload_extract_audio_video;
    }
    
    public String getUri_video() {
        return this.uri_video;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public float getWidth_square() {
        return this.width_square;
    }
    
    public float getX_square() {
        return this.x_square;
    }
    
    public float getY_square() {
        return this.y_square;
    }
    
    public float getmDrawingTranslationX() {
        return this.mDrawingTranslationX;
    }
    
    public float getmDrawingTranslationY() {
        return this.mDrawingTranslationY;
    }
    
    public TimeModel getmTimeModel() {
        return this.mTimeModel;
    }
    
    public boolean isGlass() {
        return this.isGlass;
    }
    
    public boolean isNewCode() {
        return this.isNewCode;
    }
    
    public boolean isVideoSquare() {
        return this.isVideoSquare;
    }
    
    public void setColor_ipad(final int color_ipad) {
        this.color_ipad = color_ipad;
    }
    
    public void setCurrentCursur(final int currentCursur) {
        this.currentCursur = currentCursur;
    }
    
    public void setDrawingTranslation(final float mDrawingTranslationX, final float mDrawingTranslationY) {
        this.mDrawingTranslationX = mDrawingTranslationX;
        this.mDrawingTranslationY = mDrawingTranslationY;
    }
    
    public void setDuration(final int duration) {
        this.duration = duration;
    }
    
    public void setDuration_video_media(final int duration_video_media) {
        this.duration_video_media = duration_video_media;
    }
    
    public void setEntityBismilahTemplate(final EntityBismilahTemplate entityBismilahTemplate) {
        this.entityBismilahTemplate = entityBismilahTemplate;
    }
    
    public void setEntityIsti3adaTemplate(final EntityBismilahTemplate entityIsti3adaTemplate) {
        this.entityIsti3adaTemplate = entityIsti3adaTemplate;
    }
    
    public void setEntityProgressTemplate(final EntityProgressTemplate entityProgressTemplate) {
        this.entityProgressTemplate = entityProgressTemplate;
    }
    
    public void setEntitySurahTemplate(final EntitySurahTemplate entitySurahTemplate) {
        this.entitySurahTemplate = entitySurahTemplate;
    }
    
    public void setExtension(final String extension) {
        this.extension = extension;
    }
    
    public void setFileInfo(final MFileUtils$FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
    
    public void setFolder_template(final String folder_template) {
        this.folder_template = folder_template;
    }
    
    public void setFps(final int fps) {
        this.fps = fps;
    }
    
    public void setFrame_bg(final String frame_bg) {
        this.frame_bg = frame_bg;
    }
    
    public void setGlass(final boolean isGlass) {
        this.isGlass = isGlass;
    }
    
    public void setGradient(final Gradient gradient) {
        this.gradient = gradient;
    }
    
    public void setHeight_square(final float height_square) {
        this.height_square = height_square;
    }
    
    public void setIdTemplate(final String idTemplate) {
        this.idTemplate = idTemplate;
    }
    
    public void setImgResize(final String imgResize) {
        this.imgResize = imgResize;
    }
    
    public void setIndex_color(final int index_color) {
        this.index_color = index_color;
    }
    
    public void setIpad_type(final int ipad_type) {
        this.ipad_type = ipad_type;
    }
    
    public void setName_drawable(final String name_drawable) {
        this.name_drawable = name_drawable;
    }
    
    public void setNewCode() {
        this.isNewCode = true;
    }
    
    public void setResizeType(final int resizeType) {
        this.resizeType = resizeType;
    }
    
    public void setResolution(final String resolution) {
        this.resolution = resolution;
    }
    
    public void setScale_timeline(final float scale_timeline) {
        this.scale_timeline = scale_timeline;
    }
    
    public void setUri_bg(final String uri_bg) {
        this.uri_bg = uri_bg;
    }
    
    public void setUri_bg_ffmpeg(final String uri_bg_ffmpeg) {
        this.uri_bg_ffmpeg = uri_bg_ffmpeg;
    }
    
    public void setUri_media_video(final String uri_media_video) {
        this.uri_media_video = uri_media_video;
    }
    
    public void setUri_original_upload_video(final String uri_original_upload_video) {
        this.uri_original_upload_video = uri_original_upload_video;
    }
    
    public void setUri_upload_extract_audio_video(final String uri_upload_extract_audio_video) {
        this.uri_upload_extract_audio_video = uri_upload_extract_audio_video;
    }
    
    public void setUri_video(final String uri_video) {
        this.uri_video = uri_video;
    }
    
    public void setVideoSquare(final boolean isVideoSquare) {
        this.isVideoSquare = isVideoSquare;
    }
    
    public void setWidthAndHeight(final int width, final int height) {
        this.width = width;
        this.height = height;
    }
    
    public void setWidth_square(final float width_square) {
        this.width_square = width_square;
    }
    
    public void setX_square(final float x_square) {
        this.x_square = x_square;
    }
    
    public void setY_square(final float y_square) {
        this.y_square = y_square;
    }
    
    public void setmTimeModel(final TimeModel mTimeModel) {
        this.mTimeModel = mTimeModel;
    }
}
