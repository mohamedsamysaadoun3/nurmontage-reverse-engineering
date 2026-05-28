/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.Utils.MFileUtils$FileInfo;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.model.EntityBismilahTemplate;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EntityProgressTemplate;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import hazem.nurmontage.videoquran.model.EntitySurahTemplate;
import hazem.nurmontage.videoquran.model.EntityTranslationTemplate;
import hazem.nurmontage.videoquran.model.Gradient;
import hazem.nurmontage.videoquran.model.SquareBitmapModel;
import hazem.nurmontage.videoquran.model.TimeModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Template
implements Serializable {
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
    private int fps = 30;
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
    private String resolution = "720p";
    private float scale_timeline = 0.5f;
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
        ArrayList arrayList;
        ArrayList arrayList2;
        int n;
        int n2;
        this.resizeType = n2 = ResizeType.SOCIAL_STORY.ordinal();
        this.imgResize = "i_9:16";
        this.x_square = 0.3f;
        this.y_square = 0.2f;
        this.width_square = 0.37218544f;
        this.height_square = 0.41986755f;
        this.color_ipad = n2 = -1;
        this.ipad_type = n = IpadType.IPAD.ordinal();
        this.entityMediaList = arrayList2 = new ArrayList();
        this.index_color = n2;
        this.quranEntityList = arrayList = new ArrayList();
        this.translationTemplateList = arrayList = new ArrayList();
    }

    public void addMedia(EntityMedia entityMedia) {
        this.entityMediaList.add(entityMedia);
    }

    public void addQuranEntityList(EntityQuranTemplate entityQuranTemplate) {
        this.quranEntityList.add(entityQuranTemplate);
    }

    public void addTrslEntityList(EntityTranslationTemplate entityTranslationTemplate) {
        this.translationTemplateList.add(entityTranslationTemplate);
    }

    /*
     * WARNING - void declaration
     */
    public Template duplicate() {
        void var1_4;
        Object object = new ByteArrayOutputStream();
        Closeable closeable = new ObjectOutputStream((OutputStream)object);
        closeable.writeObject(this);
        closeable.flush();
        object = ((ByteArrayOutputStream)object).toByteArray();
        closeable = new ByteArrayInputStream((byte[])object);
        object = new ObjectInputStream((InputStream)closeable);
        object = ((ObjectInputStream)object).readObject();
        try {
            return (Template)object;
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        var1_4.printStackTrace();
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
        SquareBitmapModel squareBitmapModel = this.squareBitmapModel;
        if (squareBitmapModel == null) {
            this.squareBitmapModel = squareBitmapModel = new SquareBitmapModel();
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

    public void setColor_ipad(int n) {
        this.color_ipad = n;
    }

    public void setCurrentCursur(int n) {
        this.currentCursur = n;
    }

    public void setDrawingTranslation(float f, float f2) {
        this.mDrawingTranslationX = f;
        this.mDrawingTranslationY = f2;
    }

    public void setDuration(int n) {
        this.duration = n;
    }

    public void setDuration_video_media(int n) {
        this.duration_video_media = n;
    }

    public void setEntityBismilahTemplate(EntityBismilahTemplate entityBismilahTemplate) {
        this.entityBismilahTemplate = entityBismilahTemplate;
    }

    public void setEntityIsti3adaTemplate(EntityBismilahTemplate entityBismilahTemplate) {
        this.entityIsti3adaTemplate = entityBismilahTemplate;
    }

    public void setEntityProgressTemplate(EntityProgressTemplate entityProgressTemplate) {
        this.entityProgressTemplate = entityProgressTemplate;
    }

    public void setEntitySurahTemplate(EntitySurahTemplate entitySurahTemplate) {
        this.entitySurahTemplate = entitySurahTemplate;
    }

    public void setExtension(String string2) {
        this.extension = string2;
    }

    public void setFileInfo(MFileUtils$FileInfo mFileUtils$FileInfo) {
        this.fileInfo = mFileUtils$FileInfo;
    }

    public void setFolder_template(String string2) {
        this.folder_template = string2;
    }

    public void setFps(int n) {
        this.fps = n;
    }

    public void setFrame_bg(String string2) {
        this.frame_bg = string2;
    }

    public void setGlass(boolean bl) {
        this.isGlass = bl;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    public void setHeight_square(float f) {
        this.height_square = f;
    }

    public void setIdTemplate(String string2) {
        this.idTemplate = string2;
    }

    public void setImgResize(String string2) {
        this.imgResize = string2;
    }

    public void setIndex_color(int n) {
        this.index_color = n;
    }

    public void setIpad_type(int n) {
        this.ipad_type = n;
    }

    public void setName_drawable(String string2) {
        this.name_drawable = string2;
    }

    public void setNewCode() {
        this.isNewCode = true;
    }

    public void setResizeType(int n) {
        this.resizeType = n;
    }

    public void setResolution(String string2) {
        this.resolution = string2;
    }

    public void setScale_timeline(float f) {
        this.scale_timeline = f;
    }

    public void setUri_bg(String string2) {
        this.uri_bg = string2;
    }

    public void setUri_bg_ffmpeg(String string2) {
        this.uri_bg_ffmpeg = string2;
    }

    public void setUri_media_video(String string2) {
        this.uri_media_video = string2;
    }

    public void setUri_original_upload_video(String string2) {
        this.uri_original_upload_video = string2;
    }

    public void setUri_upload_extract_audio_video(String string2) {
        this.uri_upload_extract_audio_video = string2;
    }

    public void setUri_video(String string2) {
        this.uri_video = string2;
    }

    public void setVideoSquare(boolean bl) {
        this.isVideoSquare = bl;
    }

    public void setWidthAndHeight(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public void setWidth_square(float f) {
        this.width_square = f;
    }

    public void setX_square(float f) {
        this.x_square = f;
    }

    public void setY_square(float f) {
        this.y_square = f;
    }

    public void setmTimeModel(TimeModel timeModel) {
        this.mTimeModel = timeModel;
    }
}

