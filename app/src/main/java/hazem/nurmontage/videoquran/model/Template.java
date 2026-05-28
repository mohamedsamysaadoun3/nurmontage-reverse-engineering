package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.Utils.MFileUtils;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Template implements Serializable {
    private int currentCursur;
    private int duration;
    private int duration_video_media;
    private EntityBismilahTemplate entityBismilahTemplate;
    private EntityBismilahTemplate entityIsti3adaTemplate;
    private EntityProgressTemplate entityProgressTemplate;
    private EntitySurahTemplate entitySurahTemplate;
    private String extension;
    private MFileUtils.FileInfo fileInfo;
    private String folder_template;
    private String frame_bg;
    private Gradient gradient;
    private int height;
    private String idTemplate;
    private boolean isGlass;
    private boolean isNewCode;
    private boolean isVideoSquare;
    private float mDrawingTranslationX;
    private float mDrawingTranslationY;
    private TimeModel mTimeModel;
    private String name_drawable;
    private SquareBitmapModel squareBitmapModel;
    private String uri_bg;
    private String uri_bg_ffmpeg;
    private String uri_media_video;
    private String uri_original_upload_video;
    private String uri_upload_extract_audio_video;
    private String uri_video;
    private int width;
    private String resolution = "720p";
    private float scale_timeline = 0.5f;
    private int fps = 30;
    private int resizeType = ResizeType.SOCIAL_STORY.ordinal();
    private String imgResize = "i_9:16";
    private float x_square = 0.3f;
    private float y_square = 0.2f;
    private float width_square = 0.37218544f;
    private float height_square = 0.41986755f;
    private int color_ipad = -1;
    private int ipad_type = IpadType.IPAD.ordinal();
    private final List<EntityMedia> entityMediaList = new ArrayList();
    private int index_color = -1;
    private final List<EntityQuranTemplate> quranEntityList = new ArrayList();
    private final List<EntityTranslationTemplate> translationTemplateList = new ArrayList();

    public void setFileInfo(MFileUtils.FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public MFileUtils.FileInfo getFileInfo() {
        return this.fileInfo;
    }

    public int getCurrentCursur() {
        return this.currentCursur;
    }

    public void setCurrentCursur(int resourceId) {
        this.currentCursur = resourceId;
    }

    public float getScale_timeline() {
        return this.scale_timeline;
    }

    public boolean isNewCode() {
        return this.isNewCode;
    }

    public void setNewCode() {
        this.isNewCode = true;
    }

    public void setScale_timeline(float scale) {
        this.scale_timeline = scale;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String textValue) {
        this.resolution = textValue;
    }

    public int getFps() {
        return this.fps;
    }

    public void setFps(int resourceId) {
        this.fps = value;
    }

    public void setFolder_template(String textValue) {
        this.folder_template = textValue;
    }

    public String getFolder_template() {
        return this.folder_template;
    }

    public String getUri_original_upload_video() {
        return this.uri_original_upload_video;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String textValue) {
        this.extension = textValue;
    }

    public String getUri_upload_extract_audio_video() {
        return this.uri_upload_extract_audio_video;
    }

    public void setUri_upload_extract_audio_video(String textValue) {
        this.uri_upload_extract_audio_video = textValue;
    }

    public void setUri_original_upload_video(String textValue) {
        this.uri_original_upload_video = textValue;
    }

    public void setName_drawable(String textValue) {
        this.name_drawable = textValue;
    }

    public String getName_drawable() {
        return this.name_drawable;
    }

    public boolean isVideoSquare() {
        return this.isVideoSquare;
    }

    public int getDuration_video_media() {
        return this.duration_video_media;
    }

    public void setDuration_video_media(int resourceId) {
        this.duration_video_media = value;
    }

    public String getFrame_bg() {
        return this.frame_bg;
    }

    public void setFrame_bg(String textValue) {
        this.frame_bg = textValue;
    }

    public void setVideoSquare(boolean isFlag) {
        this.isVideoSquare = isFlag;
    }

    public float getWidth_square() {
        return this.width_square;
    }

    public float getHeight_square() {
        return this.height_square;
    }

    public void setWidth_square(float scale) {
        this.width_square = scale;
    }

    public void setHeight_square(float scale) {
        this.height_square = scale;
    }

    public SquareBitmapModel getSquareBitmapModel() {
        if (this.squareBitmapModel == null) {
            this.squareBitmapModel = new SquareBitmapModel();
        }
        return this.squareBitmapModel;
    }

    public String getUri_media_video() {
        return this.uri_media_video;
    }

    public void setUri_media_video(String textValue) {
        this.uri_media_video = textValue;
    }

    public void setmTimeModel(TimeModel timeModel) {
        this.mTimeModel = timeModel;
    }

    public TimeModel getmTimeModel() {
        return this.mTimeModel;
    }

    public void setX_square(float scale) {
        this.x_square = scale;
    }

    public void setY_square(float scale) {
        this.y_square = scale;
    }

    public float getX_square() {
        return this.x_square;
    }

    public float getY_square() {
        return this.y_square;
    }

    public void setImgResize(String textValue) {
        this.imgResize = textValue;
    }

    public String getImgResize() {
        return this.imgResize;
    }

    public Gradient getGradient() {
        return this.gradient;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    public int getIpad_type() {
        return this.ipad_type;
    }

    public void setIpad_type(int resourceId) {
        this.ipad_type = value;
    }

    public void setGlass(boolean isFlag) {
        this.isGlass = isFlag;
    }

    public boolean isGlass() {
        return this.isGlass;
    }

    public float getmDrawingTranslationX() {
        return this.mDrawingTranslationX;
    }

    public float getmDrawingTranslationY() {
        return this.mDrawingTranslationY;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setDrawingTranslation(float scale, float floatValue2) {
        this.mDrawingTranslationX = scale;
        this.mDrawingTranslationY = floatValue2;
    }

    public void setWidthAndHeight(int width54, int resId2) {
        this.width = width54;
        this.height = resId2;
    }

    public void addMedia(EntityMedia entityMedia) {
        this.entityMediaList.add(entityMedia);
    }

    public List<EntityMedia> getEntityMediaList() {
        return this.entityMediaList;
    }

    public void setColor_ipad(int colorValue) {
        this.color_ipad = value;
    }

    public int getColor_ipad() {
        return this.color_ipad;
    }

    public void setIndex_color(int colorValue) {
        this.index_color = value;
    }

    public int getIndex_color() {
        return this.index_color;
    }

    public String getUri_bg_ffmpeg() {
        return this.uri_bg_ffmpeg;
    }

    public void setUri_bg_ffmpeg(String textValue) {
        this.uri_bg_ffmpeg = textValue;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int resourceId) {
        this.duration = value;
    }

    public void setEntityProgressTemplate(EntityProgressTemplate entityProgressTemplate) {
        this.entityProgressTemplate = entityProgressTemplate;
    }

    public EntityProgressTemplate getEntityProgressTemplate() {
        return this.entityProgressTemplate;
    }

    public void setEntityIsti3adaTemplate(EntityBismilahTemplate entityBismilahTemplate) {
        this.entityIsti3adaTemplate = entityBismilahTemplate;
    }

    public EntityBismilahTemplate getEntityIsti3adaTemplate() {
        return this.entityIsti3adaTemplate;
    }

    public void setEntityBismilahTemplate(EntityBismilahTemplate entityBismilahTemplate) {
        this.entityBismilahTemplate = entityBismilahTemplate;
    }

    public EntityBismilahTemplate getEntityBismilahTemplate() {
        return this.entityBismilahTemplate;
    }

    public List<EntityTranslationTemplate> getTranslationTemplateList() {
        return this.translationTemplateList;
    }

    public void setEntitySurahTemplate(EntitySurahTemplate entitySurahTemplate) {
        this.entitySurahTemplate = entitySurahTemplate;
    }

    public EntitySurahTemplate getEntitySurahTemplate() {
        return this.entitySurahTemplate;
    }

    public void setIdTemplate(String textValue) {
        this.idTemplate = textValue;
    }

    public String getIdTemplate() {
        return this.idTemplate;
    }

    public void addQuranEntityList(EntityQuranTemplate entityQuranTemplate) {
        this.quranEntityList.add(entityQuranTemplate);
    }

    public void addTrslEntityList(EntityTranslationTemplate entityTranslationTemplate) {
        this.translationTemplateList.add(entityTranslationTemplate);
    }

    public void setUri_video(String textValue) {
        this.uri_video = textValue;
    }

    public String getUri_video() {
        return this.uri_video;
    }

    public void setUri_bg(String textValue) {
        this.uri_bg = textValue;
    }

    public List<EntityQuranTemplate> getQuranEntityList() {
        return this.quranEntityList;
    }

    public String getUri_bg() {
        return this.uri_bg;
    }

    public Template duplicate() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            return (Template) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int geTypeResize() {
        return this.resizeType;
    }

    public void setResizeType(int size) {
        this.resizeType = size;
    }
}
