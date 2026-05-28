/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.VectorDrawable
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.MediaStore$Images$Media
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.Window
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.arthenica.ffmpegkit.AbstractSession;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity;
import hazem.nurmontage.videoquran.CropBitmapActivity;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda10;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda11;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda7;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda8;
import hazem.nurmontage.videoquran.EngineActivity$$ExternalSyntheticLambda9;
import hazem.nurmontage.videoquran.EngineActivity$1;
import hazem.nurmontage.videoquran.EngineActivity$10;
import hazem.nurmontage.videoquran.EngineActivity$100;
import hazem.nurmontage.videoquran.EngineActivity$101;
import hazem.nurmontage.videoquran.EngineActivity$102;
import hazem.nurmontage.videoquran.EngineActivity$103;
import hazem.nurmontage.videoquran.EngineActivity$104;
import hazem.nurmontage.videoquran.EngineActivity$105;
import hazem.nurmontage.videoquran.EngineActivity$106;
import hazem.nurmontage.videoquran.EngineActivity$107;
import hazem.nurmontage.videoquran.EngineActivity$11;
import hazem.nurmontage.videoquran.EngineActivity$12;
import hazem.nurmontage.videoquran.EngineActivity$13;
import hazem.nurmontage.videoquran.EngineActivity$14;
import hazem.nurmontage.videoquran.EngineActivity$15;
import hazem.nurmontage.videoquran.EngineActivity$16;
import hazem.nurmontage.videoquran.EngineActivity$17;
import hazem.nurmontage.videoquran.EngineActivity$18;
import hazem.nurmontage.videoquran.EngineActivity$19;
import hazem.nurmontage.videoquran.EngineActivity$2;
import hazem.nurmontage.videoquran.EngineActivity$20;
import hazem.nurmontage.videoquran.EngineActivity$21;
import hazem.nurmontage.videoquran.EngineActivity$22;
import hazem.nurmontage.videoquran.EngineActivity$23;
import hazem.nurmontage.videoquran.EngineActivity$24;
import hazem.nurmontage.videoquran.EngineActivity$25;
import hazem.nurmontage.videoquran.EngineActivity$26;
import hazem.nurmontage.videoquran.EngineActivity$27;
import hazem.nurmontage.videoquran.EngineActivity$28;
import hazem.nurmontage.videoquran.EngineActivity$29;
import hazem.nurmontage.videoquran.EngineActivity$3;
import hazem.nurmontage.videoquran.EngineActivity$30;
import hazem.nurmontage.videoquran.EngineActivity$31;
import hazem.nurmontage.videoquran.EngineActivity$32;
import hazem.nurmontage.videoquran.EngineActivity$33;
import hazem.nurmontage.videoquran.EngineActivity$34;
import hazem.nurmontage.videoquran.EngineActivity$35;
import hazem.nurmontage.videoquran.EngineActivity$36;
import hazem.nurmontage.videoquran.EngineActivity$37;
import hazem.nurmontage.videoquran.EngineActivity$38;
import hazem.nurmontage.videoquran.EngineActivity$39;
import hazem.nurmontage.videoquran.EngineActivity$4;
import hazem.nurmontage.videoquran.EngineActivity$40;
import hazem.nurmontage.videoquran.EngineActivity$41;
import hazem.nurmontage.videoquran.EngineActivity$42;
import hazem.nurmontage.videoquran.EngineActivity$43;
import hazem.nurmontage.videoquran.EngineActivity$44;
import hazem.nurmontage.videoquran.EngineActivity$45;
import hazem.nurmontage.videoquran.EngineActivity$46;
import hazem.nurmontage.videoquran.EngineActivity$47;
import hazem.nurmontage.videoquran.EngineActivity$48;
import hazem.nurmontage.videoquran.EngineActivity$49;
import hazem.nurmontage.videoquran.EngineActivity$5;
import hazem.nurmontage.videoquran.EngineActivity$50;
import hazem.nurmontage.videoquran.EngineActivity$51;
import hazem.nurmontage.videoquran.EngineActivity$52;
import hazem.nurmontage.videoquran.EngineActivity$53;
import hazem.nurmontage.videoquran.EngineActivity$54;
import hazem.nurmontage.videoquran.EngineActivity$55;
import hazem.nurmontage.videoquran.EngineActivity$56;
import hazem.nurmontage.videoquran.EngineActivity$57;
import hazem.nurmontage.videoquran.EngineActivity$58;
import hazem.nurmontage.videoquran.EngineActivity$59;
import hazem.nurmontage.videoquran.EngineActivity$6;
import hazem.nurmontage.videoquran.EngineActivity$60;
import hazem.nurmontage.videoquran.EngineActivity$61;
import hazem.nurmontage.videoquran.EngineActivity$62;
import hazem.nurmontage.videoquran.EngineActivity$63;
import hazem.nurmontage.videoquran.EngineActivity$64;
import hazem.nurmontage.videoquran.EngineActivity$65;
import hazem.nurmontage.videoquran.EngineActivity$66;
import hazem.nurmontage.videoquran.EngineActivity$67;
import hazem.nurmontage.videoquran.EngineActivity$68;
import hazem.nurmontage.videoquran.EngineActivity$7;
import hazem.nurmontage.videoquran.EngineActivity$72;
import hazem.nurmontage.videoquran.EngineActivity$73;
import hazem.nurmontage.videoquran.EngineActivity$74;
import hazem.nurmontage.videoquran.EngineActivity$75;
import hazem.nurmontage.videoquran.EngineActivity$76;
import hazem.nurmontage.videoquran.EngineActivity$77;
import hazem.nurmontage.videoquran.EngineActivity$78;
import hazem.nurmontage.videoquran.EngineActivity$79;
import hazem.nurmontage.videoquran.EngineActivity$8;
import hazem.nurmontage.videoquran.EngineActivity$80;
import hazem.nurmontage.videoquran.EngineActivity$81;
import hazem.nurmontage.videoquran.EngineActivity$82;
import hazem.nurmontage.videoquran.EngineActivity$83;
import hazem.nurmontage.videoquran.EngineActivity$84;
import hazem.nurmontage.videoquran.EngineActivity$85;
import hazem.nurmontage.videoquran.EngineActivity$86;
import hazem.nurmontage.videoquran.EngineActivity$87;
import hazem.nurmontage.videoquran.EngineActivity$88;
import hazem.nurmontage.videoquran.EngineActivity$89;
import hazem.nurmontage.videoquran.EngineActivity$9;
import hazem.nurmontage.videoquran.EngineActivity$90;
import hazem.nurmontage.videoquran.EngineActivity$91;
import hazem.nurmontage.videoquran.EngineActivity$92;
import hazem.nurmontage.videoquran.EngineActivity$93;
import hazem.nurmontage.videoquran.EngineActivity$94;
import hazem.nurmontage.videoquran.EngineActivity$95;
import hazem.nurmontage.videoquran.EngineActivity$96;
import hazem.nurmontage.videoquran.EngineActivity$97;
import hazem.nurmontage.videoquran.EngineActivity$98;
import hazem.nurmontage.videoquran.EngineActivity$99;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.BitmapCropper;
import hazem.nurmontage.videoquran.Utils.DrawableHelper;
import hazem.nurmontage.videoquran.Utils.FileUtils;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator;
import hazem.nurmontage.videoquran.Utils.SmoothVideoAnimator;
import hazem.nurmontage.videoquran.Utils.TimeFormatter;
import hazem.nurmontage.videoquran.Utils.UtilsBitmap;
import hazem.nurmontage.videoquran.Utils.UtilsFileLast;
import hazem.nurmontage.videoquran.Utils.WaveformBitmapRenderer;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.fragment.AddAudioFragment$IAudioCallback;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.fragment.EditBismilahEntityFragment;
import hazem.nurmontage.videoquran.fragment.EditBismilahEntityFragment$IBismilahEntityCallback;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment;
import hazem.nurmontage.videoquran.fragment.EditEntityFragment$IEditEntityCallback;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment$IQuranIconCallback;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;
import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment;
import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment$IEditMultipleCallback;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment$IEditS_Name;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$IEdiTextCallback;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment$IEditEntityCallback;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;
import hazem.nurmontage.videoquran.fragment.FontFragment$IFontCallback;
import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;
import hazem.nurmontage.videoquran.fragment.SimpleProgressViewFragment;
import hazem.nurmontage.videoquran.model.BismilahEntity;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.model.EntityBismilahTemplate;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import hazem.nurmontage.videoquran.model.EntitySurahTemplate;
import hazem.nurmontage.videoquran.model.EntityTranslationTemplate;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.MRectF;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.model.RecitersModel;
import hazem.nurmontage.videoquran.model.SurahNameEntity;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.model.Transition;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.BlurredImageView$IViewCallback;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar;
import hazem.nurmontage.videoquran.views.CustomDiscreteSeekBar$OnProgressChangeListener;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class EngineActivity
extends Base {
    private static final int EXTRACT_AUDIO_VIDEO_PERMISSION_REQUEST_CODE = 12;
    private static final int FPS = 25;
    private static final int IMAGE_PERMISSION_REQUEST_CODE = 10;
    private static final int REQUEST_CODE_AUDIO = 2;
    private static final int REQUEST_WRITE_EXTERNAL_STORAGE = 1;
    private static final int VIDEO_PERMISSION_REQUEST_CODE = 11;
    private ActivityResultLauncher activityLauncher;
    private SmoothVideoAnimator animator_frame_video;
    private BlurredImageView blurredImageView;
    private LinearLayout btnChangeResize;
    private LinearLayout btnIpod;
    private ImageButton btnPlayPause;
    private ImageButton btnRedo;
    private ImageButton btnToEnd;
    private ImageButton btnToStart;
    private ImageButton btnUndo;
    private ImageButton btn_cancel;
    private ButtonCustumFont btn_export;
    private LinearLayout btn_setup_fps;
    private int current_position_time;
    private Dialog dialog;
    private Dialog dialogInternet;
    private ActivityResultLauncher editSurahNameResult;
    private ActivityResultLauncher editTrslResult;
    private int endFrame;
    private int endTimeAudioVisible;
    private EntityAudio entityAudio_player;
    private EntityAudio entityAudio_visible;
    private Executor executor;
    private final String[] extentions;
    private final Object frameLock;
    private final Runnable frameProcessorRunnable;
    private AddQuranFragment$IAddQuran iAddQuran;
    private AddAudioFragment$IAudioCallback iAudioCallback;
    private EditBismilahEntityFragment$IBismilahEntityCallback iBismilahEntityCallback;
    private ChangeBgFragment$IChangeBgCallback iChangeBgCallback;
    private DimensionAdabters$IDimensionCallback iDimensionCallback;
    private EditTextFragment$IEdiTextCallback iEdiTextCallback;
    private EditEntityFragment$IEditEntityCallback iEditEntityCallback;
    private EditMediaFragment$IEditMediaCallback iEditMediaCallback;
    private EditMultipleEntityFragment$IEditMultipleCallback iEditMultipleCallback;
    private EditS_NameFragment$IEditS_Name iEditSName;
    private EditTrslEntityFragment$IEditEntityCallback iEditTrstEntityCallback;
    private FontFragment$IFontCallback iFontCallback;
    private EditIpadFragment$IIpadEditCallback iIpadEditCallback;
    private EditIconQuranFragment$IQuranIconCallback iQuranIconCallback;
    private EffectBismilahFragment$ITransition iTransitionBismilahCallback;
    private EffectAyaFragment$ITransition iTransitionCallback;
    private TrackEntityView$ITrimLineCallback iTrimLineCallback;
    private List id_ffmpeg;
    private boolean isOnScroll;
    private boolean isProcessingFrame;
    private boolean isSaveTmpTemplate;
    private boolean isToCrop;
    private ImageView ivIpod;
    private ImageView ivResize;
    private int lastIndexVisible;
    ActivityResultLauncher launchChoiceBgActivity;
    ActivityResultLauncher launchCropActivity;
    private ActivityResultLauncher launchImg;
    private ActivityResultLauncher launchVideo;
    private ActivityResultLauncher launchVideoExtract;
    private LinearLayout layout_resolution;
    private Fragment mCurrentFragment;
    private boolean mIsPlaying;
    private MediaPlayer mPlayer;
    private Resources mResources;
    private Template mTemplate;
    private ActivityResultLauncher nameReaderResult;
    private OnBackPressedCallback onBackPressedCallback;
    private boolean oneExport;
    private String pendingFramePath;
    private ActivityResultLauncher searchAyaResult;
    private CustomDiscreteSeekBar seekBar_fps;
    private CustomDiscreteSeekBar seekBar_res;
    private int startCursur;
    private int start_extenstion;
    private TextCustumFont textChangeResize;
    private TimeFormatter timeFormatter;
    private TrackEntityView trackViewEntity;
    private TextView tv_currentTime;
    private TextView tv_endTime;
    private TextCustumFont tv_resolution;
    private TextCustumFont tv_tittle_fragment;
    private String uri_bg;
    private SmoothTimelineAnimator valueAnimator;
    private MyVibrationHelper vibrationHelper;

    static /* bridge */ /* synthetic */ BlurredImageView -$$Nest$fgetblurredImageView(EngineActivity engineActivity) {
        return engineActivity.blurredImageView;
    }

    static /* bridge */ /* synthetic */ ImageButton -$$Nest$fgetbtnPlayPause(EngineActivity engineActivity) {
        return engineActivity.btnPlayPause;
    }

    static /* bridge */ /* synthetic */ ImageButton -$$Nest$fgetbtnRedo(EngineActivity engineActivity) {
        return engineActivity.btnRedo;
    }

    static /* bridge */ /* synthetic */ ImageButton -$$Nest$fgetbtnUndo(EngineActivity engineActivity) {
        return engineActivity.btnUndo;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetcurrent_position_time(EngineActivity engineActivity) {
        return engineActivity.current_position_time;
    }

    static /* bridge */ /* synthetic */ Dialog -$$Nest$fgetdialog(EngineActivity engineActivity) {
        return engineActivity.dialog;
    }

    static /* bridge */ /* synthetic */ ActivityResultLauncher -$$Nest$fgeteditSurahNameResult(EngineActivity engineActivity) {
        return engineActivity.editSurahNameResult;
    }

    static /* bridge */ /* synthetic */ ActivityResultLauncher -$$Nest$fgeteditTrslResult(EngineActivity engineActivity) {
        return engineActivity.editTrslResult;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetendFrame(EngineActivity engineActivity) {
        return engineActivity.endFrame;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetendTimeAudioVisible(EngineActivity engineActivity) {
        return engineActivity.endTimeAudioVisible;
    }

    static /* bridge */ /* synthetic */ EntityAudio -$$Nest$fgetentityAudio_player(EngineActivity engineActivity) {
        return engineActivity.entityAudio_player;
    }

    static /* bridge */ /* synthetic */ EntityAudio -$$Nest$fgetentityAudio_visible(EngineActivity engineActivity) {
        return engineActivity.entityAudio_visible;
    }

    static /* bridge */ /* synthetic */ Executor -$$Nest$fgetexecutor(EngineActivity engineActivity) {
        return engineActivity.executor;
    }

    static /* bridge */ /* synthetic */ String[] -$$Nest$fgetextentions(EngineActivity engineActivity) {
        return engineActivity.extentions;
    }

    static /* bridge */ /* synthetic */ Object -$$Nest$fgetframeLock(EngineActivity engineActivity) {
        return engineActivity.frameLock;
    }

    static /* bridge */ /* synthetic */ Runnable -$$Nest$fgetframeProcessorRunnable(EngineActivity engineActivity) {
        return engineActivity.frameProcessorRunnable;
    }

    static /* bridge */ /* synthetic */ AddQuranFragment$IAddQuran -$$Nest$fgetiAddQuran(EngineActivity engineActivity) {
        return engineActivity.iAddQuran;
    }

    static /* bridge */ /* synthetic */ AddAudioFragment$IAudioCallback -$$Nest$fgetiAudioCallback(EngineActivity engineActivity) {
        return engineActivity.iAudioCallback;
    }

    static /* bridge */ /* synthetic */ EditBismilahEntityFragment$IBismilahEntityCallback -$$Nest$fgetiBismilahEntityCallback(EngineActivity engineActivity) {
        return engineActivity.iBismilahEntityCallback;
    }

    static /* bridge */ /* synthetic */ ChangeBgFragment$IChangeBgCallback -$$Nest$fgetiChangeBgCallback(EngineActivity engineActivity) {
        return engineActivity.iChangeBgCallback;
    }

    static /* bridge */ /* synthetic */ DimensionAdabters$IDimensionCallback -$$Nest$fgetiDimensionCallback(EngineActivity engineActivity) {
        return engineActivity.iDimensionCallback;
    }

    static /* bridge */ /* synthetic */ EditTextFragment$IEdiTextCallback -$$Nest$fgetiEdiTextCallback(EngineActivity engineActivity) {
        return engineActivity.iEdiTextCallback;
    }

    static /* bridge */ /* synthetic */ EditEntityFragment$IEditEntityCallback -$$Nest$fgetiEditEntityCallback(EngineActivity engineActivity) {
        return engineActivity.iEditEntityCallback;
    }

    static /* bridge */ /* synthetic */ EditMediaFragment$IEditMediaCallback -$$Nest$fgetiEditMediaCallback(EngineActivity engineActivity) {
        return engineActivity.iEditMediaCallback;
    }

    static /* bridge */ /* synthetic */ EditS_NameFragment$IEditS_Name -$$Nest$fgetiEditSName(EngineActivity engineActivity) {
        return engineActivity.iEditSName;
    }

    static /* bridge */ /* synthetic */ EditTrslEntityFragment$IEditEntityCallback -$$Nest$fgetiEditTrstEntityCallback(EngineActivity engineActivity) {
        return engineActivity.iEditTrstEntityCallback;
    }

    static /* bridge */ /* synthetic */ FontFragment$IFontCallback -$$Nest$fgetiFontCallback(EngineActivity engineActivity) {
        return engineActivity.iFontCallback;
    }

    static /* bridge */ /* synthetic */ EditIpadFragment$IIpadEditCallback -$$Nest$fgetiIpadEditCallback(EngineActivity engineActivity) {
        return engineActivity.iIpadEditCallback;
    }

    static /* bridge */ /* synthetic */ EditIconQuranFragment$IQuranIconCallback -$$Nest$fgetiQuranIconCallback(EngineActivity engineActivity) {
        return engineActivity.iQuranIconCallback;
    }

    static /* bridge */ /* synthetic */ EffectBismilahFragment$ITransition -$$Nest$fgetiTransitionBismilahCallback(EngineActivity engineActivity) {
        return engineActivity.iTransitionBismilahCallback;
    }

    static /* bridge */ /* synthetic */ EffectAyaFragment$ITransition -$$Nest$fgetiTransitionCallback(EngineActivity engineActivity) {
        return engineActivity.iTransitionCallback;
    }

    static /* bridge */ /* synthetic */ TrackEntityView$ITrimLineCallback -$$Nest$fgetiTrimLineCallback(EngineActivity engineActivity) {
        return engineActivity.iTrimLineCallback;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetid_ffmpeg(EngineActivity engineActivity) {
        return engineActivity.id_ffmpeg;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetisOnScroll(EngineActivity engineActivity) {
        return engineActivity.isOnScroll;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetisProcessingFrame(EngineActivity engineActivity) {
        return engineActivity.isProcessingFrame;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetlastIndexVisible(EngineActivity engineActivity) {
        return engineActivity.lastIndexVisible;
    }

    static /* bridge */ /* synthetic */ LinearLayout -$$Nest$fgetlayout_resolution(EngineActivity engineActivity) {
        return engineActivity.layout_resolution;
    }

    static /* bridge */ /* synthetic */ Fragment -$$Nest$fgetmCurrentFragment(EngineActivity engineActivity) {
        return engineActivity.mCurrentFragment;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmIsPlaying(EngineActivity engineActivity) {
        return engineActivity.mIsPlaying;
    }

    static /* bridge */ /* synthetic */ MediaPlayer -$$Nest$fgetmPlayer(EngineActivity engineActivity) {
        return engineActivity.mPlayer;
    }

    static /* bridge */ /* synthetic */ Resources -$$Nest$fgetmResources(EngineActivity engineActivity) {
        return engineActivity.mResources;
    }

    static /* bridge */ /* synthetic */ Template -$$Nest$fgetmTemplate(EngineActivity engineActivity) {
        return engineActivity.mTemplate;
    }

    static /* bridge */ /* synthetic */ ActivityResultLauncher -$$Nest$fgetnameReaderResult(EngineActivity engineActivity) {
        return engineActivity.nameReaderResult;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetpendingFramePath(EngineActivity engineActivity) {
        return engineActivity.pendingFramePath;
    }

    static /* bridge */ /* synthetic */ ActivityResultLauncher -$$Nest$fgetsearchAyaResult(EngineActivity engineActivity) {
        return engineActivity.searchAyaResult;
    }

    static /* bridge */ /* synthetic */ CustomDiscreteSeekBar -$$Nest$fgetseekBar_fps(EngineActivity engineActivity) {
        return engineActivity.seekBar_fps;
    }

    static /* bridge */ /* synthetic */ CustomDiscreteSeekBar -$$Nest$fgetseekBar_res(EngineActivity engineActivity) {
        return engineActivity.seekBar_res;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetstart_extenstion(EngineActivity engineActivity) {
        return engineActivity.start_extenstion;
    }

    static /* bridge */ /* synthetic */ TrackEntityView -$$Nest$fgettrackViewEntity(EngineActivity engineActivity) {
        return engineActivity.trackViewEntity;
    }

    static /* bridge */ /* synthetic */ TextCustumFont -$$Nest$fgettv_resolution(EngineActivity engineActivity) {
        return engineActivity.tv_resolution;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgeturi_bg(EngineActivity engineActivity) {
        return engineActivity.uri_bg;
    }

    static /* bridge */ /* synthetic */ MyVibrationHelper -$$Nest$fgetvibrationHelper(EngineActivity engineActivity) {
        return engineActivity.vibrationHelper;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputcurrent_position_time(EngineActivity engineActivity, int n) {
        engineActivity.current_position_time = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputendFrame(EngineActivity engineActivity, int n) {
        engineActivity.endFrame = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputendTimeAudioVisible(EngineActivity engineActivity, int n) {
        engineActivity.endTimeAudioVisible = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputentityAudio_player(EngineActivity engineActivity, EntityAudio entityAudio) {
        engineActivity.entityAudio_player = entityAudio;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputentityAudio_visible(EngineActivity engineActivity, EntityAudio entityAudio) {
        engineActivity.entityAudio_visible = entityAudio;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputisOnScroll(EngineActivity engineActivity, boolean bl) {
        engineActivity.isOnScroll = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputisProcessingFrame(EngineActivity engineActivity, boolean bl) {
        engineActivity.isProcessingFrame = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputisSaveTmpTemplate(EngineActivity engineActivity, boolean bl) {
        engineActivity.isSaveTmpTemplate = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputisToCrop(EngineActivity engineActivity, boolean bl) {
        engineActivity.isToCrop = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputlastIndexVisible(EngineActivity engineActivity, int n) {
        engineActivity.lastIndexVisible = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmCurrentFragment(EngineActivity engineActivity, Fragment fragment) {
        engineActivity.mCurrentFragment = fragment;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmIsPlaying(EngineActivity engineActivity, boolean bl) {
        engineActivity.mIsPlaying = bl;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputmPlayer(EngineActivity engineActivity, MediaPlayer mediaPlayer) {
        engineActivity.mPlayer = mediaPlayer;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputpendingFramePath(EngineActivity engineActivity, String string) {
        engineActivity.pendingFramePath = string;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputstartCursur(EngineActivity engineActivity, int n) {
        engineActivity.startCursur = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputstart_extenstion(EngineActivity engineActivity, int n) {
        engineActivity.start_extenstion = n;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$fputuri_bg(EngineActivity engineActivity, String string) {
        engineActivity.uri_bg = string;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudio(EngineActivity engineActivity, Uri uri) {
        engineActivity.addAudio(uri);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioFromVideo(EngineActivity engineActivity, Uri uri, String string) {
        engineActivity.addAudioFromVideo(uri, string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioFromVideoWithExtention(EngineActivity engineActivity, String string, String string2, int n) {
        engineActivity.addAudioFromVideoWithExtention(string, string2, n);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioReciters(EngineActivity engineActivity, List list) {
        engineActivity.addAudioReciters(list);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioReciters(EngineActivity engineActivity, List list, int n) {
        engineActivity.addAudioReciters(list, n);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioRecitersTemplate(EngineActivity engineActivity, List list, int n, String string) {
        engineActivity.addAudioRecitersTemplate(list, n, string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioTemplate(EngineActivity engineActivity, Uri uri, List list, int n, String string, String string2, String string3) {
        engineActivity.addAudioTemplate(uri, list, n, string, string2, string3);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddAudioTemplateHttp(EngineActivity engineActivity, Uri uri, int n, String string) {
        engineActivity.addAudioTemplateHttp(uri, n, string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddEntitMediaHttp(EngineActivity engineActivity, EntityMedia entityMedia, int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2, String string, String string2) {
        engineActivity.addEntitMediaHttp(entityMedia, n, uri, mediaPlayer, list, n2, string, string2);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddEntitMediaHttp(EngineActivity engineActivity, EntityMedia entityMedia, int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2, String string, String string2, String string3) {
        engineActivity.addEntitMediaHttp(entityMedia, n, uri, mediaPlayer, list, n2, string, string2, string3);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddEntity(EngineActivity engineActivity, String string, String string2, String string3, String string4, int n, int n2, String string5, int n3, int n4) {
        engineActivity.addEntity(string, string2, string3, string4, n, n2, string5, n3, n4);
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$maddEntityBissmilah(EngineActivity engineActivity) {
        return engineActivity.addEntityBissmilah();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddEntityFromTemplate(EngineActivity engineActivity) {
        engineActivity.addEntityFromTemplate();
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$maddEntityIste3adha(EngineActivity engineActivity) {
        return engineActivity.addEntityIste3adha();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddTranslationEntity(EngineActivity engineActivity, String string, int n, boolean bl) {
        engineActivity.addTranslationEntity(string, n, bl);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddUpdateAnim(EngineActivity engineActivity, EntityBismilahTimeline entityBismilahTimeline, EntityBismilahTimeline entityBismilahTimeline2) {
        engineActivity.addUpdateAnim(entityBismilahTimeline, entityBismilahTimeline2);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddUpdateAnim(EngineActivity engineActivity, EntityBismilahTimeline entityBismilahTimeline, EntityQuranTimeline entityQuranTimeline) {
        engineActivity.addUpdateAnim(entityBismilahTimeline, entityQuranTimeline);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$maddUriAudioToQuranFragment(EngineActivity engineActivity, Uri uri, String string) {
        engineActivity.addUriAudioToQuranFragment(uri, string);
    }

    static /* bridge */ /* synthetic */ List -$$Nest$mbuildSpeedFilters(EngineActivity engineActivity, float f) {
        return engineActivity.buildSpeedFilters(f);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcancelDialog(EngineActivity engineActivity) {
        engineActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcancelDialogInternet(EngineActivity engineActivity) {
        engineActivity.cancelDialogInternet();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mchangeBitmap(EngineActivity engineActivity, String string) {
        engineActivity.changeBitmap(string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mchangeEntityAudio(EngineActivity engineActivity, int n, Uri uri) {
        engineActivity.changeEntityAudio(n, uri);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mchangeEntityAudio(EngineActivity engineActivity, int n, Uri uri, List list, int n2, String string) {
        engineActivity.changeEntityAudio(n, uri, list, n2, string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mchangeEntityAudioFromVideo(EngineActivity engineActivity, int n, Uri uri, String string) {
        engineActivity.changeEntityAudioFromVideo(n, uri, string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mchangeEntityAudioReciters(EngineActivity engineActivity, int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2) {
        engineActivity.changeEntityAudioReciters(n, uri, mediaPlayer, list, n2);
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$mcheckPermissionAudio(EngineActivity engineActivity) {
        return engineActivity.checkPermissionAudio();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mdisableRedoBtn(EngineActivity engineActivity) {
        engineActivity.disableRedoBtn();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mdisableUndoBtn(EngineActivity engineActivity) {
        engineActivity.disableUndoBtn();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mduplicateEntity(EngineActivity engineActivity, QuranEntity quranEntity) {
        engineActivity.duplicateEntity(quranEntity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mduplicateEntity(EngineActivity engineActivity, TranslationQuranEntity translationQuranEntity) {
        engineActivity.duplicateEntity(translationQuranEntity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mduplicateEntityAudio(EngineActivity engineActivity, int n, EntityAudio entityAudio) {
        engineActivity.duplicateEntityAudio(n, entityAudio);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$menableRedoBtn(EngineActivity engineActivity) {
        engineActivity.enableRedoBtn();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$menableUndoBtn(EngineActivity engineActivity) {
        engineActivity.enableUndoBtn();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mextractAudioFromVideoRecursive(EngineActivity engineActivity, String string, int n, boolean bl, int n2) {
        engineActivity.extractAudioFromVideoRecursive(string, n, bl, n2);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mhideFragment(EngineActivity engineActivity) {
        engineActivity.hideFragment();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mhideLayoutResolution(EngineActivity engineActivity) {
        engineActivity.hideLayoutResolution();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mhideProgressFragment(EngineActivity engineActivity) {
        engineActivity.hideProgressFragment();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$miniTypeImg(EngineActivity engineActivity) {
        engineActivity.iniTypeImg();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$minitTypeVideo(EngineActivity engineActivity) {
        engineActivity.initTypeVideo();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mpausePlayer(EngineActivity engineActivity) {
        engineActivity.pausePlayer();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mprocessFrame(EngineActivity engineActivity, String string) {
        engineActivity.processFrame(string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msave(EngineActivity engineActivity) {
        engineActivity.save();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msaveTemplate(EngineActivity engineActivity) {
        engineActivity.saveTemplate();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mselectSurahName(EngineActivity engineActivity) {
        engineActivity.selectSurahName();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msetupHideFragment(EngineActivity engineActivity) {
        engineActivity.setupHideFragment();
    }

    static /* bridge */ /* synthetic */ Bitmap -$$Nest$msetupOriginalBitmap(EngineActivity engineActivity, Bitmap bitmap, int n) {
        return engineActivity.setupOriginalBitmap(bitmap, n);
    }

    static /* bridge */ /* synthetic */ Bitmap -$$Nest$msetupOriginalBitmap(EngineActivity engineActivity, Uri uri) {
        return engineActivity.setupOriginalBitmap(uri);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msetupShowFragment(EngineActivity engineActivity, String string) {
        engineActivity.setupShowFragment(string);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowEditAudioEntity(EngineActivity engineActivity, EntityAudio entityAudio) {
        engineActivity.showEditAudioEntity(entityAudio);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowEditBismilahEntity(EngineActivity engineActivity, Entity entity) {
        engineActivity.showEditBismilahEntity(entity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowEditEntity(EngineActivity engineActivity, Entity entity) {
        engineActivity.showEditEntity(entity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowEditMultipleEntity(EngineActivity engineActivity, int n) {
        engineActivity.showEditMultipleEntity(n);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowEditTrslEntity(EngineActivity engineActivity, Entity entity) {
        engineActivity.showEditTrslEntity(entity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowProgress(EngineActivity engineActivity) {
        engineActivity.showProgress();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mshowProgressSimple(EngineActivity engineActivity) {
        engineActivity.showProgressSimple();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msplitEntity(EngineActivity engineActivity, QuranEntity quranEntity) {
        engineActivity.splitEntity(quranEntity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$msplitEntity(EngineActivity engineActivity, TranslationQuranEntity translationQuranEntity) {
        engineActivity.splitEntity(translationQuranEntity);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mtoCrop(EngineActivity engineActivity) {
        engineActivity.toCrop();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mtoProVersion(EngineActivity engineActivity) {
        engineActivity.toProVersion();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateBtnCutState(EngineActivity engineActivity) {
        engineActivity.updateBtnCutState();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateBtnToEnd(EngineActivity engineActivity) {
        engineActivity.updateBtnToEnd();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateBtnToEndAndStart(EngineActivity engineActivity) {
        engineActivity.updateBtnToEndAndStart();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateBtnToStart(EngineActivity engineActivity) {
        engineActivity.updateBtnToStart();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateFrame(EngineActivity engineActivity) {
        engineActivity.updateFrame();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateProgress(EngineActivity engineActivity, int n, int n2) {
        engineActivity.updateProgress(n, n2);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateTime(EngineActivity engineActivity) {
        engineActivity.updateTime();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateTime(EngineActivity engineActivity, long l) {
        engineActivity.updateTime(l);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mupdateTimeToEndAya(EngineActivity engineActivity) {
        engineActivity.updateTimeToEndAya();
    }

    public EngineActivity() {
        int n = 1;
        this.isSaveTmpTemplate = n;
        ArrayList arrayList = Executors.newSingleThreadExecutor();
        this.executor = arrayList;
        this.id_ffmpeg = arrayList = new ArrayList();
        this.current_position_time = 0;
        this.startCursur = 0;
        String[] stringArray = new EngineActivity$1(this, n != 0);
        this.onBackPressedCallback = stringArray;
        stringArray = new EngineActivity$60(this);
        this.iTrimLineCallback = stringArray;
        stringArray = new EngineActivity$65(this);
        this.iAddQuran = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        ActivityResultCallback activityResultCallback = new EngineActivity$68(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.searchAyaResult = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.nameReaderResult = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.editSurahNameResult = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.editTrslResult = stringArray;
        stringArray = new EngineActivity$77(this);
        this.iChangeBgCallback = stringArray;
        stringArray = new EngineActivity$78(this);
        this.iDimensionCallback = stringArray;
        stringArray = new EngineActivity$79(this);
        this.iAudioCallback = stringArray;
        stringArray = new EngineActivity$80(this);
        this.iIpadEditCallback = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.launchChoiceBgActivity = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.launchCropActivity = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.launchImg = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.launchVideo = stringArray;
        stringArray = new ActivityResultContracts$StartActivityForResult();
        super(this);
        stringArray = this.registerForActivityResult((ActivityResultContract)stringArray, activityResultCallback);
        this.launchVideoExtract = stringArray;
        stringArray = new String[6];
        stringArray[0] = ".mp3";
        stringArray[n] = ".ogg";
        stringArray[2] = ".acc";
        stringArray[3] = ".m4a";
        stringArray[4] = ".wav";
        stringArray[5] = ".mpeg";
        this.extentions = stringArray;
        this.start_extenstion = 0;
        Object object = new EngineActivity$92(this);
        this.iQuranIconCallback = object;
        this.iEditSName = object = new EngineActivity$93(this);
        this.iFontCallback = object = new EngineActivity$94(this);
        this.iBismilahEntityCallback = object = new EngineActivity$95(this);
        this.iEditEntityCallback = object = new EngineActivity$96(this);
        this.iEditTrstEntityCallback = object = new EngineActivity$97(this);
        this.iEditMultipleCallback = object = new EngineActivity$100(this);
        this.iEditMediaCallback = object = new EngineActivity$102(this);
        this.iEdiTextCallback = object = new EngineActivity$103(this);
        this.iTransitionCallback = object = new EngineActivity$104(this);
        this.iTransitionBismilahCallback = object = new EngineActivity$105(this);
        this.frameLock = object = new Object();
        this.pendingFramePath = null;
        this.isProcessingFrame = false;
        this.frameProcessorRunnable = object = new EngineActivity$107(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addAudio(Uri uri) {
        try {
            Object object;
            boolean bl;
            Object object2 = new MediaPlayer();
            this.mPlayer = object2;
            int n = 3;
            object2.setAudioStreamType(n);
            object2 = uri.getScheme();
            if (object2 != null && (bl = ((String)(object2 = uri.getScheme())).startsWith((String)(object = "http")))) {
                object2 = this.mPlayer;
                object = uri.toString();
                object2.setDataSource((String)object);
            } else {
                object2 = this.mPlayer;
                object2.setDataSource((Context)this, uri);
            }
            object2 = this.mPlayer;
            object2.prepareAsync();
            object2 = this.mPlayer;
            object = new EngineActivity$49(this, uri);
            object2.setOnPreparedListener((MediaPlayer.OnPreparedListener)object);
            return;
        }
        catch (Exception exception) {
            this.hideProgressFragment();
            this.hideFragment();
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addAudio(Uri uri, List list, int n, String string2) {
        try {
            EngineActivity$50 engineActivity$50;
            Object object;
            boolean bl;
            Object object2 = new MediaPlayer();
            this.mPlayer = object2;
            int n2 = 3;
            object2.setAudioStreamType(n2);
            object2 = uri.getScheme();
            if (object2 != null && (bl = ((String)(object2 = uri.getScheme())).startsWith((String)(object = "http")))) {
                object2 = this.mPlayer;
                object = uri.toString();
                object2.setDataSource((String)object);
            } else {
                object2 = this.mPlayer;
                object2.setDataSource((Context)this, uri);
            }
            object2 = this.mPlayer;
            object2.prepareAsync();
            object2 = this.mPlayer;
            object = engineActivity$50;
            engineActivity$50 = new EngineActivity$50(this, uri, list, n, string2);
            object2.setOnPreparedListener((MediaPlayer.OnPreparedListener)engineActivity$50);
            return;
        }
        catch (Exception exception) {
            this.hideProgressFragment();
            this.hideFragment();
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addAudioFromVideo(Uri uri, String string2) {
        try {
            Object object;
            boolean bl;
            Object object2 = new MediaPlayer();
            this.mPlayer = object2;
            int n = 3;
            object2.setAudioStreamType(n);
            object2 = uri.getScheme();
            if (object2 != null && (bl = ((String)(object2 = uri.getScheme())).startsWith((String)(object = "http")))) {
                object2 = this.mPlayer;
                object = uri.toString();
                object2.setDataSource((String)object);
            } else {
                object2 = this.mPlayer;
                object2.setDataSource((Context)this, uri);
            }
            object2 = this.mPlayer;
            object2.prepareAsync();
            object2 = this.mPlayer;
            object = new EngineActivity$41(this, uri, string2);
            object2.setOnPreparedListener((MediaPlayer.OnPreparedListener)object);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideFragment();
            this.hideProgressFragment();
        }
    }

    private void addAudioFromVideoWithExtention(String charSequence, String string2, int n) {
        Object object = this.mTemplate;
        object = ((Template)object).getFolder_template();
        Object object2 = new File((String)object);
        StringBuilder stringBuilder = new StringBuilder();
        long l = System.currentTimeMillis();
        stringBuilder = stringBuilder.append(l);
        String string3 = "_audio";
        stringBuilder = stringBuilder.append(string3);
        charSequence = stringBuilder.append((String)charSequence);
        charSequence = ((StringBuilder)charSequence).toString();
        object = new File((File)object2, (String)charSequence);
        int n2 = 7;
        charSequence = new String[n2];
        object2 = "-i";
        int n3 = 0;
        stringBuilder = null;
        charSequence[0] = object2;
        int n4 = 1;
        charSequence[n4] = string2;
        object2 = "-vn";
        n3 = 2;
        charSequence[n3] = object2;
        object2 = "-acodec";
        n3 = 3;
        charSequence[n3] = object2;
        object2 = "copy";
        n3 = 4;
        charSequence[n3] = object2;
        object2 = "-y";
        n3 = 5;
        charSequence[n3] = object2;
        object2 = ((File)object).getAbsolutePath();
        n3 = 6;
        charSequence[n3] = object2;
        object2 = new EngineActivity$84(this, (File)object, n, string2);
        try {
            FFmpegKit.executeWithArgumentsAsync((String[])charSequence, (FFmpegSessionCompleteCallback)object2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void addAudioReciters(List list) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        object = new EngineActivity$$ExternalSyntheticLambda5(this, list, handler);
        executorService.execute((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addAudioReciters(List object, int n) {
        CharSequence charSequence = "https://audio-cdn.tarteel.ai/quran/";
        CharSequence charSequence2 = "https://everyayah.com/data/";
        try {
            boolean bl;
            int n2 = this.isDestroyed();
            if (n2 != 0) {
                return;
            }
            n2 = n + 1;
            int n3 = object.size();
            this.updateProgress(n2, n3);
            n2 = object.size();
            if (n >= n2) {
                object = new EngineActivity$43(this);
                this.runOnUiThread((Runnable)object);
                return;
            }
            Object object2 = object.get(n);
            object2 = (RecitersModel)object2;
            n3 = ((RecitersModel)object2).isTarteel() ? 1 : 0;
            String string2 = ".mp3";
            String string3 = "/";
            if (n3 != 0) {
                charSequence2 = new StringBuilder((String)charSequence);
                charSequence = ((RecitersModel)object2).getIdentifer();
                charSequence = ((StringBuilder)charSequence2).append((String)charSequence);
                charSequence = ((StringBuilder)charSequence).append(string3);
                charSequence2 = ((RecitersModel)object2).getSurah_index();
                charSequence = ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence2 = ((RecitersModel)object2).getNumber_aya();
                charSequence = ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence = ((StringBuilder)charSequence).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
                charSequence = Uri.parse((String)charSequence);
            } else {
                charSequence = new StringBuilder((String)charSequence2);
                charSequence2 = ((RecitersModel)object2).getIdentifer();
                charSequence = ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence = ((StringBuilder)charSequence).append(string3);
                charSequence2 = ((RecitersModel)object2).getSurah_index();
                charSequence = ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence2 = ((RecitersModel)object2).getNumber_aya();
                charSequence = ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence = ((StringBuilder)charSequence).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
                charSequence = Uri.parse((String)charSequence);
            }
            charSequence2 = new MediaPlayer();
            this.mPlayer = charSequence2;
            n2 = 3;
            charSequence2.setAudioStreamType(n2);
            charSequence2 = charSequence.getScheme();
            if (charSequence2 != null && (bl = ((String)(charSequence2 = charSequence.getScheme())).startsWith((String)(object2 = "http")))) {
                charSequence2 = this.mPlayer;
                object2 = charSequence.toString();
                charSequence2.setDataSource((String)object2);
            } else {
                charSequence2 = this.mPlayer;
                charSequence2.setDataSource((Context)this, (Uri)charSequence);
            }
            charSequence2 = this.mPlayer;
            charSequence2.prepareAsync();
            charSequence2 = this.mPlayer;
            object2 = new EngineActivity$44(this, (Uri)charSequence, (List)object, n);
            charSequence2.setOnPreparedListener((MediaPlayer.OnPreparedListener)object2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressFragment();
        }
    }

    private void addAudioRecitersTemplate(List list, int n, String string2) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        EngineActivity$66 engineActivity$66 = new EngineActivity$66(this, list, n, string2);
        executorService.execute(engineActivity$66);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addAudioTemplate(Uri uri, List list, int n, String string2, String string3, String string4) {
        EngineActivity engineActivity = this;
        try {
            EngineActivity$51 engineActivity$51;
            Object object;
            boolean bl;
            Object object2 = new MediaPlayer();
            this.mPlayer = object2;
            int n2 = 3;
            object2.setAudioStreamType(n2);
            object2 = uri.getScheme();
            if (object2 != null && (bl = ((String)(object2 = uri.getScheme())).startsWith((String)(object = "http")))) {
                object2 = this.mPlayer;
                object = uri.toString();
                object2.setDataSource((String)object);
            } else {
                object2 = engineActivity.mPlayer;
                object2.setDataSource((Context)this, uri);
            }
            object2 = engineActivity.mPlayer;
            object2.prepareAsync();
            object2 = engineActivity.mPlayer;
            object = engineActivity$51;
            engineActivity$51 = new EngineActivity$51(this, n, uri, list, string2, string3, string4);
            object2.setOnPreparedListener((MediaPlayer.OnPreparedListener)engineActivity$51);
            return;
        }
        catch (Exception exception) {
            this.hideProgressFragment();
            this.hideFragment();
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addAudioTemplateHttp(Uri var1_1, int var2_2, String var3_3) {
        block108: {
            block109: {
                block107: {
                    block106: {
                        var4_4 = this;
                        var5_5 = var1_1;
                        var6_7 = var2_2;
                        var7_8 = "afade=t=out:st=";
                        var8_9 = "afade=t=in:st=0:d=";
                        var9_10 = "atrim=start=";
                        var10_11 = this.isDestroyed();
                        if (var10_11 != 0) {
                            return;
                        }
                        if (var1_1 != null) ** GOTO lbl15
                        this.hideProgressFragment();
                        return;
lbl15:
                        // 1 sources

                        var11_12 = this.mTemplate;
                        var11_12 = var11_12.getEntityMediaList();
                        if (var11_12 == null) break block106;
                        var10_11 = var2_2 + 1;
                        var12_13 = this.mTemplate;
                        var12_13 = var12_13.getEntityMediaList();
                        var13_14 = var12_13.size();
                        this.updateProgress(var10_11, var13_14);
                    }
                    if (var3_3 != null) {
                        var11_12 = var1_1.getPath();
lbl32:
                        // 3 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var11_12 = var1_1.toString();
                    var12_13 = "share_with_me";
                    var10_11 = (int)var11_12.contains((CharSequence)var12_13);
                    if (var10_11 != 0) break block107;
                    var11_12 = var4_4.mTemplate;
                    var11_12 = var11_12.getFolder_template();
                    var11_12 = AudioUtils.copyFromUri((Context)var4_4, (Uri)var5_5, (String)var11_12);
                    ** GOTO lbl32
                }
                var11_12 = var1_1.toString();
                ** continue;
                var14_15 = var11_12;
                var11_12 = var4_4.mTemplate;
                var11_12 = var11_12.getEntityMediaList();
                var11_12 = var11_12.get(var6_7);
                var11_12 = (EntityMedia)var11_12;
                var13_14 = (int)var11_12.isApplyEffectInPreview();
                var15_16 = 3;
                if (var13_14 == 0) break block108;
                var16_17 = var4_4.mTemplate;
                var16_17 = var16_17.getFolder_template();
                var17_19 = new StringBuilder();
                var18_21 = System.currentTimeMillis();
                var17_19 = var17_19.append(var18_21);
                var20_22 = "_audio_echo.mp3";
                var17_19 = var17_19.append((String)var20_22);
                var17_19 = var17_19.toString();
                var12_13 = new File((String)var16_17, (String)var17_19);
                var16_17 = var11_12.getEffectAudio();
                var21_23 = var16_17.getStart();
                var22_24 = 1000.0f;
                var21_23 /= var22_24;
                var23_25 = var16_17.getEnd() / var22_24;
                var20_22 = new ArrayList();
                var24_26 = new StringBuilder((String)var9_10);
                var9_10 = var24_26.append(var21_23);
                var24_26 = ":end=";
                var9_10 = var9_10.append((String)var24_26);
                var9_10 = var9_10.append(var23_25);
                var9_10 = var9_10.toString();
                var20_22.add(var9_10);
                var9_10 = "asetpts=N/SR/TB";
                var20_22.add(var9_10);
                var25_27 = var16_17.isRemoveNoice();
                if (var25_27 == 0) ** GOTO lbl113
                var9_10 = "afftdn=nf=-25";
                var20_22.add(var9_10);
lbl113:
                // 2 sources

                var9_10 = Locale.US;
                var24_26 = "volume=%.2f";
                var26_28 = var16_17.getVolume();
                var27_29 /* !! */  = Float.valueOf(var26_28);
                var27_29 /* !! */  = new Object[]{var27_29 /* !! */ };
                var9_10 = String.format((Locale)var9_10, (String)var24_26, var27_29 /* !! */ );
                var20_22.add(var9_10);
                var25_27 = var16_17.getFade_in();
                if (var25_27 <= 0) ** GOTO lbl140
                var25_27 = var16_17.getFade_in();
                var28_30 = var25_27;
                var24_26 = new StringBuilder((String)var8_9);
                var8_9 = var24_26.append(var28_30);
                var8_9 = var8_9.toString();
                var20_22.add(var8_9);
lbl140:
                // 2 sources

                if ((var29_31 = var16_17.getFade_out()) <= 0) ** GOTO lbl159
                var29_31 = var16_17.getFade_out();
                var30_32 = var29_31;
                var23_25 = var23_25 - var21_23 - var30_32;
                var9_10 = new StringBuilder((String)var7_8);
                var7_8 = var9_10.append(var23_25);
                var9_10 = ":d=";
                var7_8 = var7_8.append((String)var9_10);
                var7_8 = var7_8.append(var30_32);
                var7_8 = var7_8.toString();
                var20_22.add(var7_8);
lbl159:
                // 2 sources

                if ((var31_33 = var16_17.isEnhance()) == 0) ** GOTO lbl164
                var7_8 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
                var20_22.add(var7_8);
lbl164:
                // 2 sources

                if ((var7_8 = var16_17.getReverbPreset()) == null) ** GOTO lbl170
                var7_8 = var16_17.getReverbPreset();
                var20_22.add(var7_8);
lbl170:
                // 2 sources

                var31_33 = var16_17.getDecays();
                var29_31 = 1065353216;
                var30_32 = 1.0f;
                if (var31_33 <= 0) break block109;
                var7_8 = Locale.US;
                var9_10 = "aecho=%.2f:%.2f:%s:%s";
                var17_19 = Float.valueOf(var30_32);
                var23_25 = var16_17.getOutGain();
                var32_35 = Float.valueOf(var23_25);
                var24_26 = var16_17.getDelays_cmd();
                var27_29 /* !! */  = var16_17.getDecays_cmd();
                var17_19 = new Object[]{var17_19, var32_35, var24_26, var27_29 /* !! */ };
                var7_8 = String.format((Locale)var7_8, (String)var9_10, var17_19);
                var20_22.add(var7_8);
            }
            if ((var31_33 = (int)((cfr_temp_0 = (var33_36 = var16_17.getSpeed()) - var30_32) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) != 0) {
                var33_36 = var16_17.getSpeed();
                var7_8 = var4_4.buildSpeedFilters(var33_36);
                var20_22.addAll(var7_8);
            }
            var7_8 = ",";
            var7_8 = TextUtils.join((CharSequence)var7_8, var20_22);
            var17_19 = var4_4.id_ffmpeg;
            var29_31 = 6;
            var30_32 = 8.4E-45f;
            var20_22 = new String[var29_31];
            var8_9 = "-i";
            var25_27 = 0;
            var28_30 = 0.0f;
            var9_10 = null;
            var20_22[0] = var8_9;
            var29_31 = 1;
            var30_32 = 1.4E-45f;
            var20_22[var29_31] = var14_15;
            var8_9 = "-af";
            var25_27 = 2;
            var28_30 = 2.8E-45f;
            var20_22[var25_27] = var8_9;
            var20_22[var15_16] = var7_8;
            var7_8 = "-y";
            var29_31 = 4;
            var30_32 = 5.6E-45f;
            var20_22[var29_31] = var7_8;
            var7_8 = var12_13.getAbsolutePath();
            var29_31 = 5;
            var30_32 = 7.0E-45f;
            var20_22[var29_31] = var7_8;
            var7_8 = var32_35;
            var8_9 = this;
            var9_10 = var12_13;
            var12_13 = var16_17;
            var6_7 = var2_2;
            var16_17 = var3_3;
            var32_35 = new EngineActivity$39(this, (File)var9_10, (EntityMedia)var11_12, (EffectAudio)var12_13, var1_1, var2_2, (String)var14_15, var3_3);
            var5_5 = FFmpegKit.executeWithArgumentsAsync(var20_22, (FFmpegSessionCompleteCallback)var32_35);
            var34_37 = var5_5.getSessionId();
            var5_5 = var34_37;
            var17_19.add(var5_5);
        }
        var7_8 = new MediaPlayer();
        var4_4.mPlayer = var7_8;
        var7_8.setAudioStreamType(var15_16);
        var7_8 = var1_1.getScheme();
        if (var7_8 == null) ** GOTO lbl279
        var7_8 = var1_1.getScheme();
        var8_9 = "http";
        var31_34 = var7_8.startsWith((String)var8_9);
        if (!var31_34) ** GOTO lbl279
        var7_8 = var4_4.mPlayer;
        var8_9 = var1_1.toString();
        var7_8.setDataSource((String)var8_9);
        ** GOTO lbl282
lbl279:
        // 2 sources

        var7_8 = var4_4.mPlayer;
        var7_8.setDataSource((Context)var4_4, (Uri)var5_5);
lbl282:
        // 2 sources

        var7_8 = var4_4.mPlayer;
        var7_8.prepareAsync();
        var16_18 = var4_4.mPlayer;
        var7_8 = var17_20;
        var8_9 = this;
        var9_10 = var11_12;
        var11_12 = var1_1;
        var13_14 = var2_2;
        var17_20 = new EngineActivity$40(this, (EntityMedia)var9_10, var1_1, var2_2, (String)var14_15, var3_3);
        try {
            var16_18.setOnPreparedListener((MediaPlayer.OnPreparedListener)var17_20);
        }
        catch (Exception var5_6) {
            var5_6.printStackTrace();
            this.hideProgressFragment();
        }
    }

    private void addEntitMediaHttp(EntityMedia entityMedia, int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2, String string2, String string3) {
        String[] stringArray;
        Object object;
        Object object2;
        String[] stringArray2;
        List list2;
        Object object3;
        Object object4;
        Object object5;
        float f;
        EngineActivity engineActivity = this;
        float f2 = this.trackViewEntity.getWidth();
        float f3 = 0.077f;
        int n3 = Math.round(f2 * f3);
        Object object6 = this.trackViewEntity;
        f2 = ((TrackEntityView)((Object)object6)).getSecond_in_screenNoScale();
        int n4 = n;
        float f4 = n;
        float f5 = 1000.0f;
        int n5 = Math.round(f2 *= (f4 /= f5));
        f4 = entityMedia.getStart();
        float f6 = f4 - (f = entityMedia.getEnd());
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 != false) {
            float f8;
            float f9;
            object5 = this.mTemplate;
            f7 = (float)object5.isNewCode();
            if (f7 != false) {
                f4 = entityMedia.getPosX();
                f5 = entityMedia.getPosY();
                f9 = f4;
                f8 = f5;
            } else {
                f4 = entityMedia.getPosX() / f5;
                object4 = this.trackViewEntity;
                f = ((TrackEntityView)((Object)object4)).getSecond_in_screen();
                f4 *= f;
                f = entityMedia.getPosY() / f5;
                object3 = this.trackViewEntity;
                f5 = object3.getSecond_in_screen();
                f9 = f4;
                f8 = f *= f5;
            }
            f5 = n3;
            float f10 = entityMedia.getMax();
            object4 = engineActivity.trackViewEntity;
            float f11 = ((TrackEntityView)((Object)object4)).getSecond_in_screenNoScale();
            float f12 = entityMedia.getOffset();
            float f13 = entityMedia.getOffset_right();
            float f14 = entityMedia.getOffset_left();
            list2 = null;
            stringArray2 = object5;
            object2 = uri;
            object5 = new EntityAudio(null, uri, f9, 0.0f, f5, f8, f10, f11, n, f12, f13, f14);
            object = list;
            object5.setPathHttp(list);
            object = mediaPlayer;
            object5.setMediaPlayer(mediaPlayer);
            object = string3;
            object5.setVideo_path(string3);
            f3 = entityMedia.getStart();
            object5.setStart(f3);
            n4 = entityMedia.getStart_original();
            object5.setMin_duration(n4);
            f3 = entityMedia.getEnd();
            f5 = 0.0f;
            object3 = null;
            float f15 = f3 - 0.0f;
            n4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (n4 != 0) {
                f3 = entityMedia.getEnd();
                object5.setEnd(f3);
            }
            object = entityMedia.getEffectAudio();
            object5.setEffectAudio((EffectAudio)object);
            f3 = entityMedia.getDuration_fade_in();
            object5.setFade_in(f3);
            f3 = entityMedia.getDuration_fade_out();
            object5.setFade_out(f3);
            object = engineActivity.trackViewEntity;
            ((TrackEntityView)((Object)object)).addAudio((EntityAudio)object5);
            stringArray = object5;
        } else {
            n4 = 0;
            f3 = 0.0f;
            object = null;
            stringArray = null;
        }
        if (n5 > 0 && n3 > 0) {
            object = engineActivity.mTemplate;
            object = ((Template)object).getFolder_template();
            object5 = new StringBuilder();
            long l = System.currentTimeMillis();
            object5 = object5.append(l);
            object3 = "_output.pcm";
            object5 = object5.append((String)object3);
            object5 = object5.toString();
            object4 = new File((String)object, (String)object5);
            object = new ArrayList();
            object5 = "-i";
            object.add(object5);
            object.add(string2);
            object5 = "-map";
            object.add(object5);
            object5 = "0:a";
            object.add(object5);
            object5 = "-ac";
            object.add(object5);
            object5 = "1";
            object.add(object5);
            object5 = "-ar";
            object.add(object5);
            object5 = "44100";
            object.add(object5);
            object5 = "-f";
            object.add(object5);
            object5 = "s16le";
            object.add(object5);
            object5 = ((File)object4).getAbsolutePath();
            object.add(object5);
            object5 = "-y";
            object.add(object5);
            f7 = 0.0f;
            f4 = 0.0f;
            object5 = null;
            object5 = new String[]{};
            object = object.toArray((T[])object5);
            stringArray2 = object;
            stringArray2 = (String[])object;
            list2 = engineActivity.id_ffmpeg;
            object = object2;
            object5 = this;
            object2 = new EngineActivity$45(this, n3, n5, (File)object4, (EntityAudio)stringArray, string2, n2, entityMedia);
            object6 = FFmpegKit.executeWithArgumentsAsync(stringArray2, (FFmpegSessionCompleteCallback)object2);
            long l2 = ((AbstractSession)object6).getSessionId();
            object6 = l2;
            try {
                list2.add(object6);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.hideProgressFragment();
            }
            engineActivity.trackViewEntity.invalidate();
            return;
        }
        engineActivity.trackViewEntity.invalidate();
        this.hideProgressFragment();
    }

    private void addEntitMediaHttp(EntityMedia entityMedia, int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2, String string2, String string3, String string4) {
        Object object;
        Object object2;
        EngineActivity$48 engineActivity$48;
        Object object3;
        Object object4;
        float f;
        EngineActivity engineActivity = this;
        float f2 = this.trackViewEntity.getWidth();
        float f3 = 0.077f;
        int n3 = Math.round(f2 * f3);
        Object object5 = this.trackViewEntity;
        f2 = ((TrackEntityView)((Object)object5)).getSecond_in_screenNoScale();
        int n4 = n;
        float f4 = n;
        float f5 = 1000.0f;
        int n5 = Math.round(f2 * (f4 /= f5));
        f2 = entityMedia.getStart();
        float f6 = f2 - (f = entityMedia.getEnd());
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 != false) {
            float f8;
            float f9;
            object5 = this.mTemplate;
            f7 = (float)((Template)object5).isNewCode();
            if (f7 != false) {
                f2 = entityMedia.getPosX();
                f5 = entityMedia.getPosY();
                f9 = f2;
                f8 = f5;
            } else {
                f2 = entityMedia.getPosX() / f5;
                object4 = this.trackViewEntity;
                f = ((TrackEntityView)((Object)object4)).getSecond_in_screen();
                f2 *= f;
                f = entityMedia.getPosY() / f5;
                object3 = this.trackViewEntity;
                f5 = ((TrackEntityView)((Object)object3)).getSecond_in_screen();
                f9 = f2;
                f8 = f *= f5;
            }
            float f10 = n3;
            float f11 = entityMedia.getMax();
            float f12 = engineActivity.trackViewEntity.getSecond_in_screenNoScale();
            float f13 = entityMedia.getOffset();
            float f14 = entityMedia.getOffset_right();
            float f15 = entityMedia.getOffset_left();
            engineActivity$48 = null;
            object2 = object5;
            object5 = new EntityAudio(null, uri, f9, 0.0f, f10, f8, f11, f12, n, f13, f14, f15);
            object = list;
            ((EntityAudio)object5).setPathHttp(list);
            object = mediaPlayer;
            ((EntityAudio)object5).setMediaPlayer(mediaPlayer);
            object = string4;
            ((EntityAudio)object5).setVideo_path(string4);
            f3 = entityMedia.getStart();
            ((EntityAudio)object5).setStart(f3);
            n4 = entityMedia.getStart_original();
            ((EntityAudio)object5).setMin_duration(n4);
            f3 = entityMedia.getEnd();
            f5 = 0.0f;
            object3 = null;
            float f16 = f3 - 0.0f;
            n4 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            if (n4 != 0) {
                f3 = entityMedia.getEnd();
                ((EntityAudio)object5).setEnd(f3);
            }
            object = entityMedia.getEffectAudio();
            ((EntityAudio)object5).setEffectAudio((EffectAudio)object);
            f3 = entityMedia.getDuration_fade_in();
            ((Entity)object5).setFade_in(f3);
            f3 = entityMedia.getDuration_fade_out();
            ((Entity)object5).setFade_out(f3);
            object = engineActivity.trackViewEntity;
            ((TrackEntityView)((Object)object)).addAudio((EntityAudio)object5);
        } else {
            f7 = 0.0f;
            f2 = 0.0f;
            object5 = null;
        }
        object4 = object5;
        if (n5 > 0 && n3 > 0) {
            object2 = engineActivity.executor;
            object5 = engineActivity$48;
            object = this;
            object3 = string3;
            engineActivity$48 = new EngineActivity$48(this, n3, n5, string3, (EntityAudio)object4, string2, n2, entityMedia);
            object2.execute(engineActivity$48);
            return;
        }
        engineActivity.trackViewEntity.invalidate();
        this.hideProgressFragment();
    }

    private void addEntity(String string2, String string3, String string4, String string5, float f, float f2, int n, int n2, int n3, String string6, Transition transition, boolean bl, String string7, int n4, int n5, float f3, float f4, float f5, RectF rectF, Typeface typeface, Typeface typeface2, int n6, int n7) {
        QuranEntity quranEntity;
        Object object;
        float f6;
        Object object2;
        float f7;
        int n8;
        Object object3;
        float f8;
        Object object4;
        String string8;
        Object object5;
        EngineActivity engineActivity = this;
        Object object6 = rectF;
        if (string7 == null) {
            object5 = "hafes";
            string8 = object5;
        } else {
            string8 = string7;
        }
        Object object7 = "fonts/arabic/";
        object5 = new StringBuilder((String)object7);
        object5 = ((StringBuilder)object5).append(string6).toString();
        Typeface typeface3 = UtilsFileLast.loadFontFromAsset((Context)engineActivity, (String)object5);
        if (object6 == null) {
            object6 = engineActivity.blurredImageView.getRectFAya();
            object4 = object6;
        } else {
            f8 = ((RectF)object6).left;
            object3 = engineActivity.blurredImageView;
            n8 = ((BlurredImageView)((Object)object3)).getmCanvas_width();
            f7 = n8;
            f8 *= f7;
            f7 = ((RectF)object6).top;
            object2 = engineActivity.blurredImageView;
            int n9 = ((BlurredImageView)((Object)object2)).getmCanvas_height();
            float f9 = n9;
            f7 *= f9;
            f9 = ((RectF)object6).right;
            float f10 = engineActivity.blurredImageView.getmCanvas_width();
            f9 *= f10;
            f6 = ((RectF)object6).bottom;
            object = engineActivity.blurredImageView;
            int n10 = ((BlurredImageView)((Object)object)).getmCanvas_height();
            f10 = n10;
            object5 = new RectF(f8, f7, f9, f6 *= f10);
            object4 = object5;
        }
        object6 = quranEntity;
        int n11 = DrawableHelper.getIDDrawableIconByName(string8);
        object5 = this;
        object7 = string2;
        object3 = string3;
        object2 = string4;
        object = string5;
        String string9 = string8;
        string8 = string6;
        quranEntity = new QuranEntity((Context)this, string2, string3, string4, string5, (RectF)object4, typeface3, typeface2, n, n2, typeface, n3, n6, string6, bl, n11);
        f6 = f4;
        object5 = quranEntity;
        quranEntity.setFcSize(f4);
        f6 = f5;
        quranEntity.setFactorSizeTrl(f5);
        object6 = this;
        int n12 = this.blurredImageView.getmCanvas_width();
        n8 = this.blurredImageView.getmCanvas_height();
        quranEntity.setCanvasWH(n12, n8);
        f8 = f3;
        quranEntity.setFactor_scale(f3);
        n12 = this.mTemplate.getIpad_type();
        quranEntity.setIpad_type(n12);
        n12 = n4;
        quranEntity.setStartWord_index(n4);
        n12 = n5;
        quranEntity.setEndWord_index(n5);
        object7 = string9;
        quranEntity.setIcon(string9);
        object3 = this.trackViewEntity;
        object7 = new WeakReference(object3);
        object2 = this.blurredImageView;
        object3 = new WeakReference(object2);
        quranEntity.setViewWeakReference((WeakReference)object7, (WeakReference)object3);
        f8 = quranEntity.getFactorSize();
        n8 = 1065353216;
        f7 = 1.0f;
        n12 = f8 == f7 ? 0 : (f8 > f7 ? 1 : -1);
        if (n12 == 0) {
            f8 = quranEntity.calculateTextSize();
            quranEntity.setTextSize(f8);
        } else {
            f8 = quranEntity.getFactorSize();
            object3 = this.blurredImageView;
            n8 = ((BlurredImageView)((Object)object3)).getmCanvas_width();
            quranEntity.setupScaleSave(f8, n8);
        }
        n12 = n7;
        ((QuranEntity)object5).initPreset(n7);
        f8 = f;
        f7 = f2;
        object7 = ((EngineActivity)object6).addTimeLineQuran((QuranEntity)object5, f, f2);
        ((EntityView)object5).setEntityQuran((EntityQuranTimeline)object7);
        object3 = transition;
        ((EntityQuranTimeline)object7).setTransition(transition);
        ((Entity)object7).setEntityView((EntityView)object5);
        ((EngineActivity)object6).blurredImageView.addEntity((QuranEntity)object5);
    }

    private void addEntity(String string2, String string3, String string4, String string5, int n, int n2, String string6, int n3, int n4) {
        QuranEntity quranEntity;
        Object object = this;
        Object object2 = this.mTemplate;
        int n5 = ((Template)object2).getIpad_type();
        Object object3 = IpadType.GRADIENT;
        int n6 = ((Enum)object3).ordinal();
        int n7 = 0;
        int n8 = n5 != n6 && (n5 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n6 = ((Enum)(object3 = IpadType.MASK_BRUSH)).ordinal()) && (n5 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n6 = ((Enum)(object3 = IpadType.BLACK_LAYER)).ordinal()) ? 0 : (n5 = 1);
        object2 = ((EngineActivity)object).blurredImageView.getQuranEntities();
        n5 = object2.isEmpty() ? 1 : 0;
        object2 = n5 != 0 ? "\u0639\u062b\u0645\u0627\u0646\u064a.otf" : ((QuranEntity)((EngineActivity)object).blurredImageView.getQuranEntities().get(0)).getNameFont();
        Object object4 = object2;
        object2 = new StringBuilder("fonts/arabic/");
        object2 = ((StringBuilder)object2).append((String)object4).toString();
        Typeface typeface = UtilsFileLast.loadFontFromAsset((Context)object, (String)object2);
        Typeface typeface2 = UtilsFileLast.loadFontFromAsset((Context)object, "fonts/arabic/\u062e\u0637 \u0641\u0627\u0631\u0633 \u0627\u0644\u0643\u0648\u0641\u064a.otf");
        object2 = quranEntity;
        n7 = DrawableHelper.getIDDrawableIconByName(string6);
        RectF rectF = ((EngineActivity)object).blurredImageView.getRectFAya();
        Typeface typeface3 = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        int n9 = ((EngineActivity)object).blurredImageView.getClr_aya();
        int n10 = ((EngineActivity)object).blurredImageView.getClr_trsl();
        object3 = this;
        Object object5 = string2;
        Object object6 = string3;
        object = object4;
        quranEntity = new QuranEntity((Context)this, n7, string2, string3, string4, string5, rectF, typeface, typeface3, n, n2, typeface2, n9, n10, (String)object4, n8 != 0);
        object2 = this;
        n6 = this.mTemplate.getIpad_type();
        quranEntity.setIpad_type(n6);
        n6 = this.blurredImageView.getmCanvas_width();
        int n11 = this.blurredImageView.getmCanvas_height();
        quranEntity.setCanvasWH(n6, n11);
        n6 = n3;
        quranEntity.setStartWord_index(n3);
        n6 = n4;
        quranEntity.setEndWord_index(n4);
        object3 = string6;
        quranEntity.setIcon(string6);
        object5 = this.trackViewEntity;
        object3 = new WeakReference(object5);
        object6 = this.blurredImageView;
        object5 = new WeakReference(object6);
        quranEntity.setViewWeakReference((WeakReference)object3, (WeakReference)object5);
        object3 = this.addTimeLineQuran(quranEntity);
        float f = this.trackViewEntity.getScaleFactor();
        ((Entity)object3).setmScaleFactor(f);
        quranEntity.setEntityQuran((EntityQuranTimeline)object3);
        ((Entity)object3).setEntityView(quranEntity);
        this.blurredImageView.addEntity(quranEntity);
    }

    private void addEntityBissmilah(String string2, float f, float f2, int n, Transition transition, float f3, float f4, RectF rectF, int n2) {
        int n3;
        Object object;
        float f5;
        Object object2;
        EngineActivity engineActivity = this;
        Object object3 = rectF;
        Object object4 = "fonts/\u062e\u0637 \u0627\u0644\u0628\u0633\u0645\u0644\u0629.ttf";
        Typeface typeface = UtilsFileLast.loadFontFromAsset((Context)this, (String)object4);
        if (rectF == null) {
            object3 = this.blurredImageView.getRectFAya();
            object2 = object3;
        } else {
            f5 = rectF.left;
            object = this.blurredImageView;
            int n4 = object.getmCanvas_width();
            float f6 = n4;
            f5 *= f6;
            f6 = rectF.top;
            int n5 = this.blurredImageView.getmCanvas_height();
            float f7 = n5;
            f6 *= f7;
            f7 = rectF.right;
            float f8 = this.blurredImageView.getmCanvas_width();
            f7 *= f8;
            float f9 = rectF.bottom;
            BlurredImageView blurredImageView = this.blurredImageView;
            n3 = blurredImageView.getmCanvas_height();
            f8 = n3;
            object4 = new RectF(f5, f6, f7, f9 *= f8);
            object2 = object4;
        }
        Object object5 = object3;
        object = string2;
        n3 = n;
        object3 = new BismilahEntity(string2, (RectF)object2, typeface, n, n2);
        float f10 = f4;
        ((EntityView)object3).setFcSize(f4);
        f10 = f3;
        ((EntityView)object3).setFactor_scale(f3);
        object4 = engineActivity.blurredImageView;
        int n6 = ((BlurredImageView)((Object)object4)).getmCanvas_width();
        object5 = engineActivity.blurredImageView;
        int n7 = object5.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n6, n7);
        f10 = ((EntityView)object3).getFactorSize();
        n7 = 1065353216;
        f5 = 1.0f;
        n6 = f10 == f5 ? 0 : (f10 > f5 ? 1 : -1);
        if (n6 == 0) {
            ((BismilahEntity)object3).createStaticLayout();
        } else {
            f10 = ((EntityView)object3).getFactorSize();
            object5 = engineActivity.blurredImageView;
            n7 = object5.getmCanvas_width();
            ((BismilahEntity)object3).setupScaleSave(f10, n7);
        }
        n6 = n2;
        ((BismilahEntity)object3).initPreset(n2);
        object5 = engineActivity.trackViewEntity;
        object4 = new WeakReference(object5);
        object = engineActivity.blurredImageView;
        object5 = new WeakReference(object);
        ((BismilahEntity)object3).setViewWeakReference((WeakReference)object4, (WeakReference)object5);
        f10 = f;
        f5 = f2;
        object4 = this.addTimeLineBismilah((BismilahEntity)object3, f, f2);
        ((BismilahEntity)object3).setBismilahTimeline((EntityBismilahTimeline)object4);
        object5 = transition;
        ((EntityBismilahTimeline)object4).setTransition(transition);
        ((Entity)object4).setEntityView((EntityView)object3);
        engineActivity.blurredImageView.addBismilahEntity((BismilahEntity)object3);
    }

    private boolean addEntityBissmilah() {
        Object object = this.blurredImageView.getBismilahEntity();
        boolean bl = true;
        if (object != null) {
            object = this.blurredImageView.getBismilahEntity().getBismilahTimeline();
            boolean bl2 = ((Entity)object).visible();
            if (!bl2) {
                object = this.blurredImageView.getBismilahEntity().getBismilahTimeline();
                ((Entity)object).visible(bl);
            }
            return false;
        }
        object = UtilsFileLast.loadFontFromAsset((Context)this, "fonts/\u062e\u0637 \u0627\u0644\u0628\u0633\u0645\u0644\u0629.ttf");
        Object object2 = this.blurredImageView.getRectFAya();
        int n = this.blurredImageView.getClr_aya();
        String string2 = "1";
        Object object3 = new BismilahEntity(string2, (RectF)object2, (Typeface)object, n);
        int n2 = this.blurredImageView.getmCanvas_width();
        int n3 = this.blurredImageView.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n2, n3);
        float f = ((BismilahEntity)object3).getPaintAya().getTextSize();
        n3 = this.blurredImageView.getmCanvas_width();
        float f2 = n3;
        ((EntityView)object3).setFcSize(f /= f2);
        object2 = this.trackViewEntity;
        object = new WeakReference(object2);
        BlurredImageView blurredImageView = this.blurredImageView;
        object2 = new WeakReference(blurredImageView);
        ((BismilahEntity)object3).setViewWeakReference((WeakReference)object, (WeakReference)object2);
        object = this.addTimeLineBismilah((BismilahEntity)object3);
        f2 = this.trackViewEntity.getScaleFactor();
        ((Entity)object).setmScaleFactor(f2);
        ((BismilahEntity)object3).setBismilahTimeline((EntityBismilahTimeline)object);
        ((Entity)object).setEntityView((EntityView)object3);
        object2 = this.blurredImageView;
        ((BlurredImageView)((Object)object2)).addBismilahEntity((BismilahEntity)object3);
        object3 = this.trackViewEntity.getQuran();
        if (object3 != null) {
            object3 = this.trackViewEntity;
            ((TrackEntityView)((Object)object3)).translateToRightBismilah((EntityBismilahTimeline)object);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addEntityFromTemplate() {
        int n;
        int n2;
        RectF rectF;
        float f;
        MRectF mRectF;
        float f2;
        float f3;
        Transition transition;
        Object object;
        Object object2;
        float f4;
        int n3;
        float f5;
        int n4;
        int n5;
        int n6;
        float f6;
        float f7;
        float f8;
        float f9;
        Object object3;
        Object object4;
        Serializable serializable;
        Object object5;
        int n7;
        float f10;
        Object object6;
        Object object7;
        Object object8;
        float f11;
        Object object9 = this;
        Object object10 = this.mTemplate;
        if (object10 == null) {
            EngineActivity engineActivity = this;
            return;
        }
        int n8 = ((Template)object10).getIpad_type();
        Object object11 = IpadType.GRADIENT;
        int n9 = ((Enum)object11).ordinal();
        int n10 = 0;
        EngineActivity engineActivity = null;
        if (n8 != n9 && (n8 = ((Template)(object10 = this.mTemplate)).getIpad_type()) != (n9 = ((Enum)(object11 = IpadType.MASK_BRUSH)).ordinal()) && (n8 = ((Template)(object10 = this.mTemplate)).getIpad_type()) != (n9 = ((Enum)(object11 = IpadType.BLACK_LAYER)).ordinal())) {
            n8 = 0;
            object10 = null;
            f11 = 0.0f;
        } else {
            n8 = 1;
            f11 = Float.MIN_VALUE;
        }
        Typeface typeface = UtilsFileLast.loadFontFromAsset((Context)object9, "fonts/arabic/\u062e\u0637 \u0641\u0627\u0631\u0633 \u0627\u0644\u0643\u0648\u0641\u064a.otf");
        object11 = this.getResources().getAssets();
        Object object12 = "fonts/ReadexPro_Medium.ttf";
        Typeface typeface2 = Typeface.createFromAsset((AssetManager)object11, (String)object12);
        object11 = ((EngineActivity)object9).mTemplate.getQuranEntityList();
        Iterator iterator = object11.iterator();
        while ((n9 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object11 = (EntityQuranTemplate)iterator.next();
            object12 = ((EntityQuranTemplate)object11).getAya();
            object8 = ((EntityQuranTemplate)object11).getComplete_aya();
            object7 = ((EntityQuranTemplate)object11).getTranslation();
            object6 = ((EntityQuranTemplate)object11).getTranslation_complete();
            float f12 = ((EntityQuranTemplate)object11).getLeft();
            f10 = ((EntityQuranTemplate)object11).getRight();
            int n11 = ((EntityQuranTemplate)object11).getIndexNumber();
            int n12 = ((EntityQuranTemplate)object11).getNumber();
            n7 = ((EntityQuranTemplate)object11).getColor();
            object5 = ((EntityQuranTemplate)object11).getName_font();
            serializable = ((EntityQuranTemplate)object11).getTransition();
            object4 = ((EntityQuranTemplate)object11).getIcon();
            n10 = ((EntityQuranTemplate)object11).getStartWord_index();
            int n13 = ((EntityQuranTemplate)object11).getEndWord_index();
            float f13 = ((EntityQuranTemplate)object11).getScale();
            float f14 = ((EntityQuranTemplate)object11).getFactor_size();
            float f15 = ((EntityQuranTemplate)object11).getFactor_sizeTrl();
            object3 = ((EntityQuranTemplate)object11).getRectF();
            String string2 = object12;
            f9 = ((MRectF)object3).getL();
            f8 = ((EntityQuranTemplate)object11).getRectF().getT();
            f7 = ((EntityQuranTemplate)object11).getRectF().getR();
            f6 = ((EntityQuranTemplate)object11).getRectF().getB();
            object9 = new RectF(f9, f8, f7, f6);
            n6 = ((EntityQuranTemplate)object11).getColorTrsl();
            n5 = ((EntityQuranTemplate)object11).getPreset();
            object11 = this;
            object12 = this;
            n4 = n8;
            f5 = f11;
            object3 = typeface;
            object12 = string2;
            this.addEntity(string2, (String)object8, (String)object7, (String)object6, f12, f10, n11, n12, n7, (String)object5, (Transition)serializable, n8 != 0, (String)object4, n10, n13, f13, f14, f15, (RectF)object9, typeface, typeface2, n6, n5);
            n10 = 0;
            engineActivity = null;
            object9 = this;
        }
        engineActivity = object9;
        object10 = ((EngineActivity)object9).mTemplate.getTranslationTemplateList().iterator();
        while ((n9 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
            object11 = (EntityTranslationTemplate)object10.next();
            object12 = ((EntityTranslationTemplate)object11).getAya();
            f8 = ((EntityTranslationTemplate)object11).getLeft();
            f7 = ((EntityTranslationTemplate)object11).getRight();
            n3 = ((EntityTranslationTemplate)object11).getNumber();
            int n14 = ((EntityTranslationTemplate)object11).getColor();
            String string3 = ((EntityTranslationTemplate)object11).getName_font();
            Transition transition2 = ((EntityTranslationTemplate)object11).getTransition();
            float f16 = ((EntityTranslationTemplate)object11).getScale();
            f4 = ((EntityTranslationTemplate)object11).getFactor_size();
            serializable = ((EntityTranslationTemplate)object11).getRectF();
            float f17 = ((MRectF)serializable).getL();
            object9 = ((EntityTranslationTemplate)object11).getRectF();
            f5 = ((MRectF)object9).getT();
            object4 = ((EntityTranslationTemplate)object11).getRectF();
            float f18 = ((MRectF)object4).getR();
            object2 = ((EntityTranslationTemplate)object11).getRectF();
            object = object10;
            f11 = ((MRectF)object2).getB();
            object5 = new RectF(f17, f5, f18, f11);
            int n15 = ((EntityTranslationTemplate)object11).getPreset();
            n4 = ((EntityTranslationTemplate)object11).getClr_bg();
            boolean bl = ((EntityTranslationTemplate)object11).isHaveBg();
            object11 = this;
            this.addEntityTrsl((String)object12, f8, f7, n3, n14, string3, transition2, f16, f4, (RectF)object5, n15, n4, bl);
        }
        object10 = engineActivity.mTemplate.getEntityIsti3adaTemplate();
        if (object10 != null) {
            object12 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getAya();
            f8 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getLeft();
            f7 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getRight();
            n3 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getColor();
            transition = engineActivity.mTemplate.getEntityIsti3adaTemplate().getTransition();
            f10 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getScale();
            f3 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getFactor_size();
            f11 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getRectF().getL();
            f2 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getRectF().getT();
            mRectF = engineActivity.mTemplate.getEntityIsti3adaTemplate().getRectF();
            f4 = mRectF.getR();
            object5 = engineActivity.mTemplate.getEntityIsti3adaTemplate().getRectF();
            f = ((MRectF)object5).getB();
            rectF = new RectF(f11, f2, f4, f);
            object10 = engineActivity.mTemplate.getEntityIsti3adaTemplate();
            n7 = ((EntityBismilahTemplate)object10).getPreset();
            object11 = this;
            this.addEntityIsti3ada((String)object12, f8, f7, n3, transition, f10, f3, rectF, n7);
        }
        if ((object10 = engineActivity.mTemplate.getEntityBismilahTemplate()) != null) {
            object12 = engineActivity.mTemplate.getEntityBismilahTemplate().getAya();
            f8 = engineActivity.mTemplate.getEntityBismilahTemplate().getLeft();
            f7 = engineActivity.mTemplate.getEntityBismilahTemplate().getRight();
            n3 = engineActivity.mTemplate.getEntityBismilahTemplate().getColor();
            transition = engineActivity.mTemplate.getEntityBismilahTemplate().getTransition();
            f10 = engineActivity.mTemplate.getEntityBismilahTemplate().getScale();
            f3 = engineActivity.mTemplate.getEntityBismilahTemplate().getFactor_size();
            f11 = engineActivity.mTemplate.getEntityBismilahTemplate().getRectF().getL();
            f2 = engineActivity.mTemplate.getEntityBismilahTemplate().getRectF().getT();
            mRectF = engineActivity.mTemplate.getEntityBismilahTemplate().getRectF();
            f4 = mRectF.getR();
            object5 = engineActivity.mTemplate.getEntityBismilahTemplate().getRectF();
            f = ((MRectF)object5).getB();
            rectF = new RectF(f11, f2, f4, f);
            object10 = engineActivity.mTemplate.getEntityBismilahTemplate();
            n7 = ((EntityBismilahTemplate)object10).getPreset();
            object11 = this;
            this.addEntityBissmilah((String)object12, f8, f7, n3, transition, f10, f3, rectF, n7);
        }
        if ((object10 = engineActivity.mTemplate.getEntitySurahTemplate()) != null) {
            object10 = engineActivity.mTemplate.getEntitySurahTemplate().getRectF();
            if (object10 == null) {
                object10 = engineActivity.blurredImageView.getRectFSurahName();
            } else {
                object11 = engineActivity.mTemplate.getEntitySurahTemplate().getRectF();
                f2 = ((MRectF)object11).getL();
                n2 = engineActivity.blurredImageView.getmCanvas_width();
                f9 = n2;
                f2 *= f9;
                object12 = engineActivity.mTemplate.getEntitySurahTemplate().getRectF();
                f9 = ((MRectF)object12).getT();
                n = engineActivity.blurredImageView.getmCanvas_height();
                f8 = n;
                f9 *= f8;
                object8 = engineActivity.mTemplate.getEntitySurahTemplate().getRectF();
                f8 = ((MRectF)object8).getR();
                int n16 = engineActivity.blurredImageView.getmCanvas_width();
                f7 = n16;
                f8 *= f7;
                object7 = engineActivity.mTemplate.getEntitySurahTemplate().getRectF();
                f7 = ((MRectF)object7).getB();
                object6 = engineActivity.blurredImageView;
                n3 = ((BlurredImageView)((Object)object6)).getmCanvas_height();
                f6 = n3;
                object10 = new RectF(f2, f9, f8, f7 *= f6);
            }
            Object object13 = object10;
            object10 = engineActivity.blurredImageView;
            object = engineActivity.mTemplate.getEntitySurahTemplate().getName();
            String string4 = engineActivity.mTemplate.getEntitySurahTemplate().getReader();
            float f19 = engineActivity.mTemplate.getEntitySurahTemplate().getFactor_scale();
            object11 = engineActivity.mTemplate.getEntitySurahTemplate().getName_font();
            object11 = object11 == null ? "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf" : engineActivity.mTemplate.getEntitySurahTemplate().getName_font();
            object3 = object11;
            int n17 = engineActivity.mTemplate.getEntitySurahTemplate().getClr();
            n6 = engineActivity.mTemplate.getEntitySurahTemplate().getPreset();
            n5 = engineActivity.mTemplate.getEntitySurahTemplate().getStyle();
            int n18 = engineActivity.mTemplate.getEntitySurahTemplate().getIndex_surah();
            boolean bl = engineActivity.mTemplate.getEntitySurahTemplate().isHaveBg();
            object11 = engineActivity.mTemplate.getEntitySurahTemplate();
            n9 = ((EntitySurahTemplate)object11).getClrBg();
            if (n9 == 0) {
                n9 = -16777216;
                f2 = -1.7014118E38f;
            } else {
                object11 = engineActivity.mTemplate.getEntitySurahTemplate();
                n9 = ((EntitySurahTemplate)object11).getClrBg();
            }
            object2 = object10;
            ((BlurredImageView)((Object)object10)).setSurahNameEntity((String)object, string4, (RectF)object13, f19, (String)object3, n17, n6, n5, n18, bl, n9);
        }
        if ((n8 = (int)((object10 = engineActivity.mTemplate.getEntityMediaList()).isEmpty() ? 1 : 0)) != 0) {
            object10 = new EngineActivity$13(engineActivity);
            engineActivity.runOnUiThread((Runnable)object10);
            return;
        }
        try {
            object10 = engineActivity.mTemplate;
            object10 = ((Template)object10).getEntityMediaList();
            n9 = 0;
            f2 = 0.0f;
            object11 = null;
            object10 = object10.get(0);
            object10 = (EntityMedia)object10;
            object12 = ((EntityMedia)object10).getVideo_path();
            if (object12 != null) {
                object11 = engineActivity.mTemplate;
                if ((object11 = ((Template)object11).getUri_upload_extract_audio_video()) == null) {
                    object10 = new EngineActivity$8(engineActivity);
                    engineActivity.runOnUiThread((Runnable)object10);
                    return;
                }
                object11 = engineActivity.mTemplate;
                object11 = ((Template)object11).getUri_upload_extract_audio_video();
                object11 = Uri.parse((String)object11);
                object11 = object11.toString();
                object12 = engineActivity.mTemplate;
                object12 = ((Template)object12).getFolder_template();
                object8 = new EngineActivity$9(engineActivity, (EntityMedia)object10);
                AudioUtils.copyToLocalAsync((Context)engineActivity, (String)object11, (String)object12, (AudioUtils$Callback)object8);
                return;
            }
            object12 = ((EntityMedia)object10).getUri();
            if (object12 == null) return;
            object12 = ((EntityMedia)object10).getPaths_https();
            n = 0;
            f8 = 0.0f;
            object8 = null;
            if (object12 != null) {
                n2 = NetworkUtils.isNetworkAvailable((Context)this) ? 1 : 0;
                if (n2 != 0) {
                    object10 = ((EntityMedia)object10).getPaths_https();
                    engineActivity.addAudioRecitersTemplate((List)object10, 0, null);
                    return;
                }
                object11 = new EngineActivity$10(engineActivity, (EntityMedia)object10);
                engineActivity.runOnUiThread((Runnable)object11);
                return;
            }
            object12 = ((EntityMedia)object10).getUri();
            n2 = ((String)object12).contains((CharSequence)(object7 = "http")) ? 1 : 0;
            if (n2 == 0) {
                object10 = ((EntityMedia)object10).getUri();
                object10 = Uri.parse((String)object10);
                engineActivity.addAudioTemplateHttp((Uri)object10, 0, null);
                return;
            }
            object10 = ((EntityMedia)object10).getUri();
            object10 = Uri.parse((String)object10);
            n2 = NetworkUtils.isNetworkAvailable((Context)this) ? 1 : 0;
            if (n2 != 0) {
                engineActivity.addAudioTemplateHttp((Uri)object10, 0, null);
                return;
            }
            object11 = new EngineActivity$11(engineActivity, (Uri)object10);
            engineActivity.runOnUiThread((Runnable)object11);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object10 = new EngineActivity$12(engineActivity);
            engineActivity.runOnUiThread((Runnable)object10);
            return;
        }
    }

    private boolean addEntityIste3adha() {
        Object object = this.blurredImageView.getmIsti3adhaEntity();
        boolean bl = true;
        if (object != null) {
            object = this.blurredImageView.getmIsti3adhaEntity().getBismilahTimeline();
            boolean bl2 = ((Entity)object).visible();
            if (!bl2) {
                object = this.blurredImageView.getmIsti3adhaEntity().getBismilahTimeline();
                ((Entity)object).visible(bl);
            }
            return false;
        }
        object = UtilsFileLast.loadFontFromAsset((Context)this, "fonts/\u062e\u0637 \u0627\u0644\u0627\u0633\u062a\u0639\u0627\u0630\u0647.ttf");
        Object object2 = this.blurredImageView.getRectFAya();
        int n = this.blurredImageView.getClr_aya();
        String string2 = "4";
        Object object3 = new BismilahEntity(string2, (RectF)object2, (Typeface)object, n);
        int n2 = this.blurredImageView.getmCanvas_width();
        int n3 = this.blurredImageView.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n2, n3);
        float f = ((BismilahEntity)object3).getPaintAya().getTextSize();
        n3 = this.blurredImageView.getmCanvas_width();
        float f2 = n3;
        ((EntityView)object3).setFcSize(f /= f2);
        object2 = this.trackViewEntity;
        object = new WeakReference(object2);
        BlurredImageView blurredImageView = this.blurredImageView;
        object2 = new WeakReference(blurredImageView);
        ((BismilahEntity)object3).setViewWeakReference((WeakReference)object, (WeakReference)object2);
        object = this.addTimeLineIsti3ada((BismilahEntity)object3);
        f2 = this.trackViewEntity.getScaleFactor();
        ((Entity)object).setmScaleFactor(f2);
        ((BismilahEntity)object3).setBismilahTimeline((EntityBismilahTimeline)object);
        ((Entity)object).setEntityView((EntityView)object3);
        object2 = this.blurredImageView;
        ((BlurredImageView)((Object)object2)).addIsti3adhaEntity((BismilahEntity)object3);
        object3 = this.trackViewEntity.getQuran();
        if (object3 != null) {
            object3 = this.trackViewEntity;
            ((TrackEntityView)((Object)object3)).translateToRightBismilah((EntityBismilahTimeline)object);
        }
        return bl;
    }

    private void addEntityIsti3ada(String string2, float f, float f2, int n, Transition transition, float f3, float f4, RectF rectF, int n2) {
        int n3;
        Object object;
        float f5;
        Object object2;
        EngineActivity engineActivity = this;
        Object object3 = rectF;
        Object object4 = "fonts/\u062e\u0637 \u0627\u0644\u0627\u0633\u062a\u0639\u0627\u0630\u0647.ttf";
        Typeface typeface = UtilsFileLast.loadFontFromAsset((Context)this, (String)object4);
        if (rectF == null) {
            object3 = this.blurredImageView.getRectFAya();
            object2 = object3;
        } else {
            f5 = rectF.left;
            object = this.blurredImageView;
            int n4 = object.getmCanvas_width();
            float f6 = n4;
            f5 *= f6;
            f6 = rectF.top;
            int n5 = this.blurredImageView.getmCanvas_height();
            float f7 = n5;
            f6 *= f7;
            f7 = rectF.right;
            float f8 = this.blurredImageView.getmCanvas_width();
            f7 *= f8;
            float f9 = rectF.bottom;
            BlurredImageView blurredImageView = this.blurredImageView;
            n3 = blurredImageView.getmCanvas_height();
            f8 = n3;
            object4 = new RectF(f5, f6, f7, f9 *= f8);
            object2 = object4;
        }
        Object object5 = object3;
        object = string2;
        n3 = n;
        object3 = new BismilahEntity(string2, (RectF)object2, typeface, n, n2);
        float f10 = f4;
        ((EntityView)object3).setFcSize(f4);
        f10 = f3;
        ((EntityView)object3).setFactor_scale(f3);
        object4 = engineActivity.blurredImageView;
        int n6 = ((BlurredImageView)((Object)object4)).getmCanvas_width();
        object5 = engineActivity.blurredImageView;
        int n7 = object5.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n6, n7);
        f10 = ((EntityView)object3).getFactorSize();
        n7 = 1065353216;
        f5 = 1.0f;
        n6 = f10 == f5 ? 0 : (f10 > f5 ? 1 : -1);
        if (n6 == 0) {
            ((BismilahEntity)object3).createStaticLayout();
        } else {
            f10 = ((EntityView)object3).getFactorSize();
            object5 = engineActivity.blurredImageView;
            n7 = object5.getmCanvas_width();
            ((BismilahEntity)object3).setupScaleSave(f10, n7);
        }
        n6 = n2;
        ((BismilahEntity)object3).initPreset(n2);
        object5 = engineActivity.trackViewEntity;
        object4 = new WeakReference(object5);
        object = engineActivity.blurredImageView;
        object5 = new WeakReference(object);
        ((BismilahEntity)object3).setViewWeakReference((WeakReference)object4, (WeakReference)object5);
        f10 = f;
        f5 = f2;
        object4 = this.addTimeLineIsti3ada((BismilahEntity)object3, f, f2);
        ((BismilahEntity)object3).setBismilahTimeline((EntityBismilahTimeline)object4);
        object5 = transition;
        ((EntityBismilahTimeline)object4).setTransition(transition);
        ((Entity)object4).setEntityView((EntityView)object3);
        engineActivity.blurredImageView.addIsti3adhaEntity((BismilahEntity)object3);
    }

    private void addEntityTrsl(String string2, float f, float f2, int n, int n2, String string3, Transition transition, float f3, float f4, RectF rectF, int n3, int n4, boolean n5) {
        Object object;
        int n6;
        int n7;
        Object object2;
        EngineActivity engineActivity = this;
        Object object3 = rectF;
        Object object4 = new StringBuilder("fonts/");
        Object object5 = string3;
        object4 = ((StringBuilder)object4).append(string3).toString();
        Typeface typeface = UtilsFileLast.loadFontFromAsset((Context)this, (String)object4);
        if (rectF == null) {
            object3 = this.blurredImageView.getRectFAya();
            object2 = object3;
        } else {
            float f5 = rectF.left;
            BlurredImageView blurredImageView = this.blurredImageView;
            n7 = blurredImageView.getmCanvas_width();
            float f6 = n7;
            f5 *= f6;
            f6 = rectF.top;
            BlurredImageView blurredImageView2 = this.blurredImageView;
            n6 = blurredImageView2.getmCanvas_height();
            float f7 = n6;
            f6 *= f7;
            f7 = rectF.right;
            float f8 = this.blurredImageView.getmCanvas_width();
            f7 *= f8;
            float f9 = rectF.bottom;
            object = this.blurredImageView;
            int n8 = ((BlurredImageView)((Object)object)).getmCanvas_height();
            f8 = n8;
            object4 = new RectF(f5, f6, f7, f9 *= f8);
            object2 = object4;
        }
        n7 = engineActivity.blurredImageView.getmCanvas_width();
        n6 = engineActivity.blurredImageView.getmCanvas_height();
        Object object6 = object3;
        object = string2;
        object3 = new TranslationQuranEntity(n7, n6, string2, (RectF)object2, typeface, n, n2, string3);
        int n9 = n5;
        ((TranslationQuranEntity)object3).setHaveBg(n5 != 0);
        n9 = n4;
        ((TranslationQuranEntity)object3).setClrBg(n4);
        float f10 = f4;
        ((EntityView)object3).setFcSize(f4);
        n9 = engineActivity.blurredImageView.getmCanvas_width();
        int n10 = engineActivity.blurredImageView.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n9, n10);
        f10 = f3;
        ((EntityView)object3).setFactor_scale(f3);
        n9 = engineActivity.mTemplate.getIpad_type();
        ((TranslationQuranEntity)object3).setIpad_type(n9);
        object5 = engineActivity.trackViewEntity;
        object4 = new WeakReference(object5);
        object6 = engineActivity.blurredImageView;
        object5 = new WeakReference(object6);
        ((TranslationQuranEntity)object3).setViewWeakReference((WeakReference)object4, (WeakReference)object5);
        f10 = ((EntityView)object3).getFactorSize();
        n10 = 1065353216;
        float f11 = 1.0f;
        n9 = f10 == f11 ? 0 : (f10 > f11 ? 1 : -1);
        if (n9 == 0) {
            f10 = ((TranslationQuranEntity)object3).calculateTextSize();
            ((TranslationQuranEntity)object3).setTextSize(f10);
        } else {
            f10 = ((EntityView)object3).getFactorSize();
            object5 = engineActivity.blurredImageView;
            n10 = ((BlurredImageView)((Object)object5)).getmCanvas_width();
            ((TranslationQuranEntity)object3).setupScaleSave(f10, n10);
        }
        n9 = n3;
        ((TranslationQuranEntity)object3).initPreset(n3);
        f10 = f;
        f11 = f2;
        object4 = this.addTimeLineQuran((TranslationQuranEntity)object3, f, f2);
        ((EntityView)object3).setEntityTrslTimeline((EntityTrslTimeline)object4);
        object5 = transition;
        ((EntityTrslTimeline)object4).setTransition(transition);
        ((Entity)object4).setEntityView((EntityView)object3);
        engineActivity.blurredImageView.addEntity((TranslationQuranEntity)object3);
    }

    private void addTranslationEntity(String object, int n, boolean bl) {
        Typeface typeface = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        RectF rectF = this.blurredImageView.getRectFAya();
        int n2 = this.blurredImageView.getmCanvas_width();
        int n3 = this.blurredImageView.getmCanvas_height();
        TranslationQuranEntity translationQuranEntity = new TranslationQuranEntity((String)object, rectF, typeface, n, -256, "ReadexPro_Medium.ttf", n2, n3);
        int n4 = this.mTemplate.getIpad_type();
        translationQuranEntity.setIpad_type(n4);
        n4 = this.blurredImageView.getmCanvas_width();
        n = this.blurredImageView.getmCanvas_height();
        translationQuranEntity.setCanvasWH(n4, n);
        Object object2 = this.trackViewEntity;
        object = new WeakReference(object2);
        BlurredImageView blurredImageView = this.blurredImageView;
        object2 = new WeakReference(blurredImageView);
        translationQuranEntity.setViewWeakReference((WeakReference)object, (WeakReference)object2);
        object = this.addTimeLineTrslQuran(translationQuranEntity);
        float f = this.trackViewEntity.getScaleFactor();
        ((Entity)object).setmScaleFactor(f);
        translationQuranEntity.setEntityTrslTimeline((EntityTrslTimeline)object);
        ((Entity)object).setEntityView(translationQuranEntity);
        this.blurredImageView.addEntity(translationQuranEntity);
    }

    private void addUpdateAnim(EntityBismilahTimeline object, EntityBismilahTimeline entityBismilahTimeline) {
        if (object == null) {
            return;
        }
        Transition transition = ((EntityBismilahTimeline)object).getTransition();
        if (transition == null) {
            transition = new Transition();
            ((EntityBismilahTimeline)object).setTransition(transition);
        }
        transition = ((EntityBismilahTimeline)object).getTransition();
        boolean bl = entityBismilahTimeline.getTransition().isOut();
        transition.setOut(bl);
        transition = ((EntityBismilahTimeline)object).getTransition();
        String string2 = entityBismilahTimeline.getTransition().getType_out();
        transition.setType_out(string2);
        transition = ((EntityBismilahTimeline)object).getTransition();
        float f = entityBismilahTimeline.getTransition().getDuration_out();
        transition.setDuration_out(f);
        transition = ((EntityBismilahTimeline)object).getTransition();
        bl = entityBismilahTimeline.getTransition().isIn();
        transition.setIn(bl);
        transition = ((EntityBismilahTimeline)object).getTransition();
        string2 = entityBismilahTimeline.getTransition().getType_in();
        transition.setType_in(string2);
        object = ((EntityBismilahTimeline)object).getTransition();
        float f2 = entityBismilahTimeline.getTransition().getDuration_in();
        ((Transition)object).setDuration_in(f2);
    }

    private void addUpdateAnim(EntityBismilahTimeline object, EntityQuranTimeline entityQuranTimeline) {
        if (object == null) {
            return;
        }
        Transition transition = ((EntityBismilahTimeline)object).getTransition();
        if (transition == null) {
            transition = new Transition();
            ((EntityBismilahTimeline)object).setTransition(transition);
        }
        transition = ((EntityBismilahTimeline)object).getTransition();
        boolean bl = entityQuranTimeline.getTransition().isOut();
        transition.setOut(bl);
        transition = ((EntityBismilahTimeline)object).getTransition();
        String string2 = entityQuranTimeline.getTransition().getType_out();
        transition.setType_out(string2);
        transition = ((EntityBismilahTimeline)object).getTransition();
        float f = entityQuranTimeline.getTransition().getDuration_out();
        transition.setDuration_out(f);
        transition = ((EntityBismilahTimeline)object).getTransition();
        bl = entityQuranTimeline.getTransition().isIn();
        transition.setIn(bl);
        transition = ((EntityBismilahTimeline)object).getTransition();
        string2 = entityQuranTimeline.getTransition().getType_in();
        transition.setType_in(string2);
        object = ((EntityBismilahTimeline)object).getTransition();
        float f2 = entityQuranTimeline.getTransition().getDuration_in();
        ((Transition)object).setDuration_in(f2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void addUriAudioToQuranFragment(Uri object, String object2) {
        Fragment fragment;
        Object object3;
        try {
            object3 = this.getSupportFragmentManager();
        }
        catch (Exception exception) {
            return;
        }
        object3 = ((FragmentManager)object3).beginTransaction();
        AddQuranFragment$IAddQuran addQuranFragment$IAddQuran = this.iAddQuran;
        Resources resources = this.mResources;
        String string2 = "-";
        AddQuranFragment addQuranFragment = AddQuranFragment.getInstance(addQuranFragment$IAddQuran, resources, object, (String)((Object)fragment), string2);
        this.mCurrentFragment = addQuranFragment;
        int n = R$id.m_container;
        fragment = this.mCurrentFragment;
        ((FragmentTransaction)object3).replace(n, fragment);
        ((FragmentTransaction)object3).commit();
        EngineActivity$14 engineActivity$14 = new EngineActivity$14(this);
        this.runOnUiThread(engineActivity$14);
    }

    private List buildSpeedFilters(float f) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        float f2 = 0.5f;
        float f3 = f == f2 ? 0 : (f < f2 ? -1 : 1);
        String string2 = "atempo=%.2f";
        if (f3 < 0) {
            while ((f3 = f == f2 ? 0 : (f < f2 ? -1 : 1)) < 0) {
                String string3 = "atempo=0.5";
                arrayList.add(string3);
                f /= f2;
            }
            Locale locale = Locale.US;
            Object object = Float.valueOf(f);
            object = new Object[]{object};
            object = String.format(locale, string2, object);
            arrayList.add(object);
        } else {
            f2 = 2.0f;
            float f4 = f - f2;
            f3 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
            if (f3 > 0) {
                while ((f3 = f == f2 ? 0 : (f > f2 ? 1 : -1)) > 0) {
                    String string4 = "atempo=2.0";
                    arrayList.add(string4);
                    f /= f2;
                }
                Locale locale = Locale.US;
                Object object = Float.valueOf(f);
                object = new Object[]{object};
                object = String.format(locale, string2, object);
                arrayList.add(object);
            } else {
                Locale locale = Locale.US;
                Object object = Float.valueOf(f);
                object = new Object[]{object};
                object = String.format(locale, string2, object);
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    private void cancelDialog() {
        boolean bl;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl = dialog.isShowing())) {
            dialog = this.dialog;
            dialog.dismiss();
        }
        this.dialog = null;
    }

    private void cancelDialogInternet() {
        boolean bl;
        Dialog dialog = this.dialogInternet;
        if (dialog != null && (bl = dialog.isShowing())) {
            dialog = this.dialogInternet;
            dialog.dismiss();
        }
        this.dialogInternet = null;
    }

    private void changeBitmap(String string2) {
        Executor executor = this.executor;
        EngineActivity$89 engineActivity$89 = new EngineActivity$89(this, string2);
        executor.execute(engineActivity$89);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void changeEntityAudio(int n, Uri object) {
        void var19_37;
        EntityAudio entityAudio;
        Object object2;
        int n2;
        int n3;
        float f;
        Object object3;
        int n4;
        block70: {
            block69: {
                float f2;
                block71: {
                    block68: {
                        TrackEntityView trackEntityView = this.trackViewEntity;
                        List list = trackEntityView.getEntityListAudio();
                        n4 = list.isEmpty();
                        if (n4 != 0) break block68;
                        TrackEntityView trackEntityView2 = this.trackViewEntity;
                        EntityAudio entityAudio2 = trackEntityView2.getAudio();
                        if (entityAudio2 == null) break block68;
                        RectF rectF = entityAudio2.getRect();
                        f2 = rectF.right;
                        object3 = this.trackViewEntity;
                        f = ((TrackEntityView)((Object)object3)).getScaleFactor();
                        f2 /= f;
                        break block71;
                    }
                    n4 = 0;
                    f2 = 0.0f;
                    Object var3_9 = null;
                }
                float f3 = f2;
                TrackEntityView trackEntityView = this.trackViewEntity;
                n4 = trackEntityView.getWidth();
                f2 = n4;
                n3 = 1033744941;
                f = 0.077f;
                f2 *= f;
                n4 = Math.round(f2);
                object3 = this.trackViewEntity;
                f = ((TrackEntityView)((Object)object3)).getSecond_in_screenNoScale();
                float f4 = n;
                float f5 = 1000.0f;
                f *= (f4 /= f5);
                n2 = Math.round(f);
                float f6 = n4;
                float f7 = n2;
                float f8 = f7 + f3;
                object3 = this.trackViewEntity;
                float f9 = ((TrackEntityView)((Object)object3)).getSecond_in_screenNoScale();
                f4 = 0.0f;
                object2 = null;
                object3 = entityAudio;
                entityAudio = new EntityAudio(null, (Uri)object, f3, 0.0f, f6, f8, f7, f9, n);
                MediaPlayer mediaPlayer = this.mPlayer;
                entityAudio.setMediaPlayer(mediaPlayer);
                EffectAudio effectAudio = entityAudio.getEffectAudio();
                f = entityAudio.getEnd();
                effectAudio.setEnd(f);
                EffectAudio effectAudio2 = entityAudio.getEffectAudio();
                f = entityAudio.getStart();
                effectAudio2.setStart(f);
                EffectAudio effectAudio3 = entityAudio.getEffectAudio();
                f = entityAudio.getEnd();
                f4 = entityAudio.getStart();
                n3 = (int)(f -= f4);
                effectAudio3.setDuration(n3);
                TrackEntityView trackEntityView3 = this.trackViewEntity;
                trackEntityView3.addAudio(entityAudio);
                if (n2 <= 0 || n4 <= 0) return;
                String string2 = object.toString();
                object3 = "share_with_me";
                n = string2.contains((CharSequence)object3) ? 1 : 0;
                if (n != 0) break block69;
                Template template = this.mTemplate;
                String string4 = template.getFolder_template();
                string4 = AudioUtils.copyFromUri((Context)this, (Uri)object, string4);
                break block70;
            }
            String string5 = object.toString();
        }
        object = this.mTemplate;
        object = ((Template)object).getFolder_template();
        object3 = new StringBuilder();
        long l = System.currentTimeMillis();
        object3 = ((StringBuilder)object3).append(l);
        object2 = "_output.pcm";
        object3 = ((StringBuilder)object3).append((String)object2);
        object3 = ((StringBuilder)object3).toString();
        File file = new File((String)object, (String)object3);
        object = new ArrayList();
        object3 = "-i";
        object.add(object3);
        object.add(var19_37);
        object3 = "-map";
        object.add(object3);
        object3 = "0:a";
        object.add(object3);
        object3 = "-ac";
        object.add(object3);
        object3 = "1";
        object.add(object3);
        object3 = "-ar";
        object.add(object3);
        object3 = "44100";
        object.add(object3);
        object3 = "-f";
        object.add(object3);
        object3 = "s16le";
        object.add(object3);
        object3 = file.getAbsolutePath();
        object.add(object3);
        object3 = "-y";
        object.add(object3);
        n3 = 0;
        f = 0.0f;
        object3 = null;
        object3 = new String[]{};
        object = object.toArray((T[])object3);
        object = (String[])object;
        object3 = this.id_ffmpeg;
        object2 = new EngineActivity$55(this, n4, n2, file, entityAudio, (String)var19_37);
        FFmpegSession fFmpegSession = FFmpegKit.executeWithArgumentsAsync((String[])object, (FFmpegSessionCompleteCallback)object2);
        long l2 = fFmpegSession.getSessionId();
        Long l3 = l2;
        object3.add(l3);
        TrackEntityView trackEntityView = this.trackViewEntity;
        try {
            trackEntityView.invalidate();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressFragment();
            this.hideFragment();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void changeEntityAudio(int n, Uri uri, List list, int n2, String string2) {
        EntityAudio entityAudio;
        float f;
        float f2;
        int n3;
        EngineActivity engineActivity;
        block36: {
            block35: {
                engineActivity = this;
                TrackEntityView trackEntityView = this.trackViewEntity;
                List list2 = trackEntityView.getEntityListAudio();
                n3 = list2.isEmpty();
                if (n3 != 0) break block35;
                TrackEntityView trackEntityView2 = this.trackViewEntity;
                EntityAudio entityAudio2 = trackEntityView2.getAudio();
                if (entityAudio2 == null) break block35;
                RectF rectF = entityAudio2.getRect();
                f2 = rectF.right;
                TrackEntityView trackEntityView3 = this.trackViewEntity;
                f = trackEntityView3.getScaleFactor();
                f2 /= f;
                break block36;
            }
            n3 = 0;
            f2 = 0.0f;
            Object var7_13 = null;
        }
        float f3 = f2;
        TrackEntityView trackEntityView = engineActivity.trackViewEntity;
        n3 = trackEntityView.getWidth();
        f2 = n3;
        int n4 = 1033744941;
        f = 0.077f;
        f2 *= f;
        int n5 = Math.round(f2);
        TrackEntityView trackEntityView4 = engineActivity.trackViewEntity;
        f2 = trackEntityView4.getSecond_in_screenNoScale();
        n4 = n;
        float f4 = n;
        float f5 = 1000.0f;
        f2 *= (f4 /= f5);
        int n6 = Math.round(f2);
        float f6 = n5;
        f2 = n6;
        float f7 = f2 + f3;
        TrackEntityView trackEntityView5 = engineActivity.trackViewEntity;
        float f8 = trackEntityView5.getSecond_in_screenNoScale();
        Object object = entityAudio;
        entityAudio = new EntityAudio(null, uri, f3, 0.0f, f6, f7, f2, f8, n);
        MediaPlayer mediaPlayer = engineActivity.mPlayer;
        entityAudio.setMediaPlayer(mediaPlayer);
        List list3 = list;
        entityAudio.setPathHttp(list);
        EffectAudio effectAudio = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        effectAudio.setEnd(f);
        EffectAudio effectAudio2 = entityAudio.getEffectAudio();
        f = entityAudio.getStart();
        effectAudio2.setStart(f);
        EffectAudio effectAudio3 = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        f4 = entityAudio.getStart();
        n4 = (int)(f -= f4);
        effectAudio3.setDuration(n4);
        TrackEntityView trackEntityView6 = engineActivity.trackViewEntity;
        trackEntityView6.addAudio(entityAudio);
        if (n6 <= 0 || n5 <= 0) return;
        Executor executor = engineActivity.executor;
        Object object2 = object;
        EngineActivity engineActivity2 = this;
        object = new EngineActivity$$ExternalSyntheticLambda0(this, uri, n5, n6, string2, entityAudio, n2);
        executor.execute((Runnable)object);
        TrackEntityView trackEntityView7 = engineActivity.trackViewEntity;
        try {
            trackEntityView7.invalidate();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressFragment();
            this.hideFragment();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void changeEntityAudioFromVideo(int n, Uri uri, String string2) {
        EntityAudio entityAudio;
        float f;
        Object object;
        float f2;
        int n2;
        EngineActivity engineActivity;
        block66: {
            block65: {
                engineActivity = this;
                TrackEntityView trackEntityView = this.trackViewEntity;
                List list = trackEntityView.getEntityListAudio();
                n2 = list.isEmpty();
                if (n2 != 0) break block65;
                TrackEntityView trackEntityView2 = this.trackViewEntity;
                EntityAudio entityAudio2 = trackEntityView2.getAudio();
                if (entityAudio2 == null) break block65;
                RectF rectF = entityAudio2.getRect();
                f2 = rectF.right;
                object = this.trackViewEntity;
                f = ((TrackEntityView)((Object)object)).getScaleFactor();
                f2 /= f;
                break block66;
            }
            n2 = 0;
            f2 = 0.0f;
            Object var5_11 = null;
        }
        float f3 = f2;
        TrackEntityView trackEntityView = engineActivity.trackViewEntity;
        n2 = trackEntityView.getWidth();
        f2 = n2;
        int n3 = 1033744941;
        f = 0.077f;
        f2 *= f;
        int n4 = Math.round(f2);
        TrackEntityView trackEntityView3 = engineActivity.trackViewEntity;
        f2 = trackEntityView3.getSecond_in_screenNoScale();
        n3 = n;
        float f4 = n;
        int n5 = 1148846080;
        float f5 = 1000.0f;
        f2 *= (f4 /= f5);
        n5 = Math.round(f2);
        float f6 = n4;
        f2 = n5;
        float f7 = f2 + f3;
        Object object2 = engineActivity.trackViewEntity;
        float f8 = ((TrackEntityView)((Object)object2)).getSecond_in_screenNoScale();
        EngineActivity$52 engineActivity$52 = null;
        Object object3 = entityAudio;
        entityAudio = new EntityAudio(null, uri, f3, 0.0f, f6, f7, f2, f8, n);
        MediaPlayer mediaPlayer = engineActivity.mPlayer;
        entityAudio.setMediaPlayer(mediaPlayer);
        EffectAudio effectAudio = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        effectAudio.setEnd(f);
        EffectAudio effectAudio2 = entityAudio.getEffectAudio();
        f = entityAudio.getStart();
        effectAudio2.setStart(f);
        EffectAudio effectAudio3 = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        f4 = entityAudio.getStart();
        n3 = (int)(f -= f4);
        effectAudio3.setDuration(n3);
        TrackEntityView trackEntityView4 = engineActivity.trackViewEntity;
        trackEntityView4.addAudio(entityAudio);
        if (n5 <= 0 || n4 <= 0) return;
        Template template = engineActivity.mTemplate;
        String string4 = template.getFolder_template();
        string4 = AudioUtils.copyFromUri((Context)engineActivity, uri, string4);
        object = engineActivity.mTemplate;
        object = ((Template)object).getFolder_template();
        object2 = new StringBuilder();
        long l = System.currentTimeMillis();
        object2 = ((StringBuilder)object2).append(l);
        String string5 = "_output.pcm";
        object2 = ((StringBuilder)object2).append(string5);
        object2 = ((StringBuilder)object2).toString();
        File file = new File((String)object, (String)object2);
        object = new ArrayList();
        object2 = "-i";
        object.add(object2);
        object.add(string4);
        String string6 = "-map";
        object.add(string6);
        String string7 = "0:a";
        object.add(string7);
        String string8 = "-ac";
        object.add(string8);
        String string9 = "1";
        object.add(string9);
        String string10 = "-ar";
        object.add(string10);
        String string11 = "44100";
        object.add(string11);
        String string12 = "-f";
        object.add(string12);
        String string13 = "s16le";
        object.add(string13);
        String string14 = file.getAbsolutePath();
        object.add(string14);
        String string15 = "-y";
        object.add(string15);
        n2 = 0;
        f2 = 0.0f;
        Object var5_33 = null;
        String[] stringArray3 = new String[]{};
        stringArray3 = object.toArray(stringArray3);
        stringArray3 = stringArray3;
        object3 = engineActivity.id_ffmpeg;
        object = engineActivity$52;
        object2 = this;
        string5 = string2;
        engineActivity$52 = new EngineActivity$52(this, n4, n5, file, entityAudio, uri, string2);
        FFmpegSession fFmpegSession = FFmpegKit.executeWithArgumentsAsync(stringArray3, engineActivity$52);
        long l2 = fFmpegSession.getSessionId();
        Long l3 = l2;
        object3.add(l3);
        TrackEntityView trackEntityView5 = engineActivity.trackViewEntity;
        try {
            trackEntityView5.invalidate();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            EngineActivity$53 engineActivity$53 = new EngineActivity$53(engineActivity);
            engineActivity.runOnUiThread(engineActivity$53);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void changeEntityAudioReciters(int n, Uri uri, MediaPlayer mediaPlayer, List list, int n2) {
        EntityAudio entityAudio;
        float f;
        Object object;
        float f2;
        int n3;
        Object object2;
        EngineActivity engineActivity;
        block36: {
            block35: {
                engineActivity = this;
                object2 = this.trackViewEntity;
                object2 = ((TrackEntityView)((Object)object2)).getEntityListAudio();
                n3 = object2.isEmpty();
                if (n3 != 0) break block35;
                object2 = this.trackViewEntity;
                object2 = ((TrackEntityView)((Object)object2)).getAudio();
                if (object2 == null) break block35;
                object2 = ((EntityAudio)object2).getRect();
                f2 = ((RectF)object2).right;
                object = this.trackViewEntity;
                f = ((TrackEntityView)((Object)object)).getScaleFactor();
                f2 /= f;
                break block36;
            }
            n3 = 0;
            f2 = 0.0f;
            object2 = null;
        }
        float f3 = f2;
        object2 = engineActivity.trackViewEntity;
        n3 = object2.getWidth();
        f2 = n3;
        int n4 = 1033744941;
        f = 0.077f;
        f2 *= f;
        int n5 = Math.round(f2);
        object2 = engineActivity.trackViewEntity;
        f2 = ((TrackEntityView)((Object)object2)).getSecond_in_screenNoScale();
        n4 = n;
        float f4 = n;
        int n6 = 1148846080;
        float f5 = 1000.0f;
        f2 *= (f4 /= f5);
        n6 = Math.round(f2);
        float f6 = n5;
        f2 = n6;
        float f7 = f2 + f3;
        TrackEntityView trackEntityView = engineActivity.trackViewEntity;
        float f8 = trackEntityView.getSecond_in_screenNoScale();
        EngineActivity$54 engineActivity$54 = null;
        Object object3 = entityAudio;
        entityAudio = new EntityAudio(null, uri, f3, 0.0f, f6, f7, f2, f8, n);
        object2 = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        ((EffectAudio)object2).setEnd(f);
        object2 = entityAudio.getEffectAudio();
        f = entityAudio.getStart();
        ((EffectAudio)object2).setStart(f);
        object2 = entityAudio.getEffectAudio();
        f = entityAudio.getEnd();
        f4 = entityAudio.getStart();
        n4 = (int)(f -= f4);
        ((EffectAudio)object2).setDuration(n4);
        object2 = mediaPlayer;
        entityAudio.setMediaPlayer(mediaPlayer);
        object2 = engineActivity.trackViewEntity;
        ((TrackEntityView)((Object)object2)).addAudio(entityAudio);
        if (n6 <= 0 || n5 <= 0) return;
        object2 = uri.toString();
        object = engineActivity.mTemplate;
        object3 = ((Template)object).getFolder_template();
        object = engineActivity$54;
        EngineActivity engineActivity2 = this;
        engineActivity$54 = new EngineActivity$54(this, n6, n5, entityAudio, n2, list);
        try {
            AudioUtils.copyToLocalAsync((Context)engineActivity, (String)object2, (String)object3, engineActivity$54);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressFragment();
        }
    }

    private boolean checkPermissionAudio() {
        String string2;
        int n = Build.VERSION.SDK_INT;
        int n2 = 33;
        int n3 = 1;
        if (n >= n2 && (n2 = ActivityCompat.checkSelfPermission((Context)this, string2 = "android.permission.READ_MEDIA_AUDIO")) != 0) {
            String[] stringArray = new String[n3];
            n3 = 0;
            stringArray[0] = string2;
            n = 2;
            ActivityCompat.requestPermissions(this, stringArray, n);
        }
        return n3 != 0;
    }

    private void checkUriShared() {
        Object object = this.getIntent();
        String string2 = "muri";
        if ((object = object.getStringExtra(string2)) != null) {
            object = Uri.parse((String)object);
            string2 = null;
            this.addUriAudioToQuranFragment((Uri)object, null);
        }
    }

    private void clearCallback() {
        this.iBismilahEntityCallback = null;
        this.iEditSName = null;
        this.iEditMultipleCallback = null;
        this.iEditMediaCallback = null;
        this.iEditTrstEntityCallback = null;
        this.iEditEntityCallback = null;
        this.iChangeBgCallback = null;
        this.iTrimLineCallback = null;
        this.iIpadEditCallback = null;
        this.iDimensionCallback = null;
        this.searchAyaResult = null;
        this.iFontCallback = null;
        this.launchVideoExtract = null;
        this.launchChoiceBgActivity = null;
        this.launchVideo = null;
        this.launchImg = null;
        this.activityLauncher = null;
        this.onBackPressedCallback = null;
        this.iAddQuran = null;
        this.iAudioCallback = null;
        this.iTransitionCallback = null;
        this.iTransitionBismilahCallback = null;
        this.nameReaderResult = null;
        this.iQuranIconCallback = null;
        this.launchCropActivity = null;
        this.editSurahNameResult = null;
        this.iEdiTextCallback = null;
        this.editTrslResult = null;
    }

    private void clearFFmpeg() {
        boolean bl;
        Iterator iterator = this.id_ffmpeg.iterator();
        while (bl = iterator.hasNext()) {
            Long l = (Long)iterator.next();
            long l2 = l;
            FFmpegKit.cancel(l2);
        }
    }

    private String createCmd(EffectAudio object, float f, float f2) {
        float f3;
        int n;
        Object object2;
        int n2;
        float f4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object[] objectArray = Locale.US;
        Object object3 = Float.valueOf(f);
        Object object4 = Float.valueOf(f2);
        object3 = new Object[]{object3, object4};
        object4 = "atrim=start=%.2f:end=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        arrayList.add(objectArray);
        objectArray = "asetpts=N/SR/TB";
        arrayList.add(objectArray);
        boolean n22 = ((EffectAudio)object).isRemoveNoice();
        if (n22) {
            objectArray = "afftdn=nf=-25";
            arrayList.add(objectArray);
        }
        objectArray = Locale.US;
        float f5 = ((EffectAudio)object).getVolume();
        object3 = Float.valueOf(f5);
        object3 = new Object[]{object3};
        object4 = "volume=%.2f";
        objectArray = String.format((Locale)objectArray, (String)object4, (Object[])object3);
        arrayList.add(objectArray);
        int n3 = ((EffectAudio)object).getFade_in();
        if (n3 > 0) {
            int n4 = ((EffectAudio)object).getFade_in();
            f4 = n4;
            object4 = "afade=t=in:st=0:d=";
            object3 = new StringBuilder((String)object4);
            objectArray = ((StringBuilder)object3).append(f4).toString();
            arrayList.add(objectArray);
        }
        if ((n2 = ((EffectAudio)object).getFade_out()) > 0) {
            int n5 = ((EffectAudio)object).getFade_out();
            f4 = n5;
            f2 = f2 - f - f4;
            object3 = "afade=t=out:st=";
            object2 = new StringBuilder((String)object3);
            object2 = ((StringBuilder)object2).append(f2);
            String string2 = ":d=";
            object2 = ((StringBuilder)object2).append(string2).append(f4).toString();
            arrayList.add(object2);
        }
        if ((n = ((EffectAudio)object).isEnhance()) != 0) {
            object2 = "equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3";
            arrayList.add(object2);
        }
        if ((object2 = ((EffectAudio)object).getReverbPreset()) != null) {
            object2 = ((EffectAudio)object).getReverbPreset();
            arrayList.add(object2);
        }
        n = ((EffectAudio)object).getDecays();
        f2 = 1.0f;
        if (n > 0) {
            object2 = Locale.US;
            objectArray = Float.valueOf(f2);
            f5 = ((EffectAudio)object).getOutGain();
            object3 = Float.valueOf(f5);
            object4 = ((EffectAudio)object).getDelays_cmd();
            String string3 = ((EffectAudio)object).getDecays_cmd();
            objectArray = new Object[]{objectArray, object3, object4, string3};
            object3 = "aecho=%.2f:%.2f:%s:%s";
            object2 = String.format((Locale)object2, (String)object3, objectArray);
            arrayList.add(object2);
        }
        if ((n = (int)((f3 = (f = ((EffectAudio)object).getSpeed()) - f2) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1))) != 0) {
            float f6 = ((EffectAudio)object).getSpeed();
            object = this.buildSpeedFilters(f6);
            arrayList.addAll((Collection<Object>)object);
        }
        return TextUtils.join((CharSequence)",", arrayList);
    }

    private void disableRedoBtn() {
        block6: {
            Object object = this.btnRedo;
            if (object == null) break block6;
            boolean bl = object.isEnabled();
            if (!bl) break block6;
            object = new EngineActivity$63(this);
            try {
                this.runOnUiThread((Runnable)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void disableUndoBtn() {
        block6: {
            Object object = this.btnUndo;
            if (object == null) break block6;
            boolean bl = object.isEnabled();
            if (!bl) break block6;
            object = new EngineActivity$64(this);
            try {
                this.runOnUiThread((Runnable)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void duplicateEntity(QuranEntity quranEntity) {
        Object object;
        EngineActivity engineActivity = this;
        Object object2 = quranEntity.getTypefaceNumber();
        if (object2 == null) {
            object2 = UtilsFileLast.loadFontFromAsset((Context)this, "fonts/arabic/\u062e\u0637 \u0641\u0627\u0631\u0633 \u0627\u0644\u0643\u0648\u0641\u064a.otf");
        }
        Typeface typeface = object2;
        object2 = quranEntity.getPaintAya().getTypeface();
        if (object2 == null) {
            object2 = new StringBuilder("fonts/arabic/");
            object = quranEntity.getNameFont();
            object2 = ((StringBuilder)object2).append((String)object).toString();
            object2 = UtilsFileLast.loadFontFromAsset((Context)engineActivity, (String)object2);
        }
        Typeface typeface2 = object2;
        object2 = quranEntity.getPaintTranslationAya();
        object2 = object2 != null ? quranEntity.getPaintTranslationAya().getTypeface() : null;
        if (object2 == null) {
            object2 = this.getResources().getAssets();
            object = "fonts/ReadexPro_Medium.ttf";
            object2 = Typeface.createFromAsset((AssetManager)object2, (String)object);
        }
        Object object3 = object2;
        object = object2;
        Object object4 = quranEntity.getTxt();
        Object object5 = quranEntity.getComplete_aya();
        String string2 = quranEntity.getTranslation();
        String string3 = quranEntity.getTranslation_complete();
        RectF rectF = engineActivity.blurredImageView.getRectFAya();
        int n = quranEntity.getIndexNumber();
        int n2 = quranEntity.getNumber();
        int n3 = quranEntity.getClrAya();
        int n4 = quranEntity.getClrTrsl();
        String string4 = quranEntity.getNameFont();
        TextPaint textPaint = quranEntity.getPaintAya();
        float f = textPaint.getTextSize();
        TextPaint textPaint2 = quranEntity.getPaintTranslationAya();
        float f2 = textPaint2.getTextSize();
        TextPaint textPaint3 = quranEntity.getPaintAya();
        boolean bl = textPaint3.isUnderlineText();
        VectorDrawable vectorDrawable = quranEntity.getVectorDrawable();
        object2 = new QuranEntity((String)object4, (String)object5, string2, string3, rectF, typeface2, (Typeface)object3, n, n2, typeface, n3, n4, string4, f, f2, bl, vectorDrawable);
        float f3 = quranEntity.getFactorSize();
        ((EntityView)object2).setFcSize(f3);
        f3 = quranEntity.getFactorSizeTrl();
        ((EntityView)object2).setFactorSizeTrl(f3);
        f3 = quranEntity.getFactor_scale();
        ((EntityView)object2).setFactor_scale(f3);
        int n5 = engineActivity.blurredImageView.getmCanvas_width();
        int n6 = engineActivity.blurredImageView.getmCanvas_height();
        ((EntityView)object2).setCanvasWH(n5, n6);
        n5 = engineActivity.mTemplate.getIpad_type();
        ((QuranEntity)object2).setIpad_type(n5);
        n5 = quranEntity.getStartWord_index();
        ((QuranEntity)object2).setStartWord_index(n5);
        n5 = quranEntity.getEndWord_index();
        ((QuranEntity)object2).setEndWord_index(n5);
        object = quranEntity.getIcon();
        ((QuranEntity)object2).setIcon((String)object);
        object4 = engineActivity.trackViewEntity;
        object = new WeakReference(object4);
        object5 = engineActivity.blurredImageView;
        object4 = new WeakReference(object5);
        ((QuranEntity)object2).setViewWeakReference((WeakReference)object, (WeakReference)object4);
        n5 = 0;
        f3 = 0.0f;
        object = null;
        ((QuranEntity)object2).setVisible(false);
        float f4 = ((EntityView)object2).getFactorSize();
        object5 = engineActivity.blurredImageView;
        int n7 = ((BlurredImageView)((Object)object5)).getmCanvas_width();
        ((QuranEntity)object2).setupScaleSave(f4, n7);
        n6 = quranEntity.getClrAya();
        ((QuranEntity)object2).setColor(n6);
        object4 = quranEntity.getPaintTranslationAya();
        if (object4 != null) {
            n6 = quranEntity.getClrTrsl();
        } else {
            n6 = -256;
            f4 = 0.0f / 0.0f;
        }
        ((QuranEntity)object2).setColorTranslation(n6);
        n6 = quranEntity.getmPreset();
        ((QuranEntity)object2).initPreset(n6);
        n6 = quranEntity.getEntityQuran().getIndex() + 1;
        float f5 = quranEntity.getEntityQuran().getRect().right;
        string2 = quranEntity.getEntityQuran().getRect();
        float f6 = ((RectF)string2).right;
        string3 = quranEntity.getEntityQuran().getRect();
        float f7 = string3.width();
        object4 = engineActivity.addTimeLineQuran(n6, (QuranEntity)object2, f5, f6 += f7);
        f5 = quranEntity.getEntityQuran().getmScaleFactor();
        ((Entity)object4).setmScaleFactor(f5);
        ((EntityView)object2).setEntityQuran((EntityQuranTimeline)object4);
        ((Entity)object4).setEntityView((EntityView)object2);
        object5 = quranEntity.getEntityQuran().getTransition();
        if (object5 != null) {
            object5 = quranEntity.getEntityQuran().getTransition().duplicate();
            ((EntityQuranTimeline)object4).setTransition((Transition)object5);
        }
        object4 = engineActivity.blurredImageView;
        n7 = quranEntity.getIndex() + 1;
        ((BlurredImageView)((Object)object4)).addEntity((QuranEntity)object2, n7);
        object4 = engineActivity.trackViewEntity;
        object5 = ((EntityView)object2).getEntityQuran();
        ((TrackEntityView)((Object)object4)).selectEntity((Entity)object5, false);
        object = engineActivity.iTrimLineCallback;
        object2 = ((EntityView)object2).getEntityQuran();
        object.onSelectEntity((Entity)object2, -1.0f);
        engineActivity.trackViewEntity.updateCursurToSelectEntity();
    }

    private void duplicateEntity(TranslationQuranEntity object) {
        Object object2;
        Object object3 = ((TranslationQuranEntity)object).getPaintAya().getTypeface();
        if (object3 == null) {
            object3 = new StringBuilder("fonts/");
            object2 = ((TranslationQuranEntity)object).getNameFont();
            object3 = ((StringBuilder)object3).append((String)object2).toString();
            object3 = UtilsFileLast.loadFontFromAsset((Context)this, (String)object3);
        }
        Object object4 = object3;
        Object object5 = ((TranslationQuranEntity)object).getTxt();
        Object object6 = ((EntityView)object).getRect();
        int n = ((TranslationQuranEntity)object).getNumber();
        int n2 = ((TranslationQuranEntity)object).getClrAya();
        String string2 = ((TranslationQuranEntity)object).getNameFont();
        float f = ((TranslationQuranEntity)object).getPaintAya().getTextSize();
        object2 = object3;
        object3 = new TranslationQuranEntity((String)object5, (RectF)object6, (Typeface)object4, n, n2, string2, f);
        float f2 = ((EntityView)object).getFactorSize();
        ((EntityView)object3).setFcSize(f2);
        f2 = ((EntityView)object).getFactorSizeTrl();
        ((EntityView)object3).setFactorSizeTrl(f2);
        f2 = ((EntityView)object).getFactor_scale();
        ((EntityView)object3).setFactor_scale(f2);
        int n3 = this.blurredImageView.getmCanvas_width();
        int n4 = this.blurredImageView.getmCanvas_height();
        ((EntityView)object3).setCanvasWH(n3, n4);
        n3 = this.mTemplate.getIpad_type();
        ((TranslationQuranEntity)object3).setIpad_type(n3);
        n3 = 0;
        f2 = 0.0f;
        object2 = null;
        ((TranslationQuranEntity)object3).setVisible(false);
        object6 = this.trackViewEntity;
        object5 = new WeakReference(object6);
        object4 = this.blurredImageView;
        object6 = new WeakReference(object4);
        ((TranslationQuranEntity)object3).setViewWeakReference((WeakReference)object5, (WeakReference)object6);
        float f3 = ((TranslationQuranEntity)object).getPaintAya().getTextSize();
        int n5 = ((TranslationQuranEntity)object).getStaticLayout().getWidth();
        ((TranslationQuranEntity)object3).updatePaint(f3, n5);
        n4 = ((TranslationQuranEntity)object).getClrAya();
        ((TranslationQuranEntity)object3).setColor(n4);
        n4 = ((TranslationQuranEntity)object).getmPreset();
        ((TranslationQuranEntity)object3).initPreset(n4);
        n4 = ((EntityView)object).getEntityTrslTimeline().getIndex() + 1;
        float f4 = ((EntityView)object).getEntityTrslTimeline().getRect().right;
        object4 = ((EntityView)object).getEntityTrslTimeline().getRect();
        float f5 = ((RectF)object4).right;
        RectF rectF = ((EntityView)object).getEntityTrslTimeline().getRect();
        float f6 = rectF.width();
        object5 = this.addTimeLineQuran(n4, (TranslationQuranEntity)object3, f4, f5 += f6);
        object6 = ((EntityView)object).getEntityTrslTimeline().getTransition();
        if (object6 != null) {
            object4 = ((Transition)object6).duplicate();
            ((EntityTrslTimeline)object5).setTransition((Transition)object4);
            boolean bl = ((Transition)object6).isIn();
            if (bl && (bl = ((Transition)object6).isOut())) {
                object4 = ((EntityTrslTimeline)object5).getTransition();
                ((Transition)object4).setIn(false);
                ((Transition)object6).setOut(false);
            } else {
                bl = ((Transition)object6).isIn();
                if (bl) {
                    object6 = ((EntityTrslTimeline)object5).getTransition();
                    ((Transition)object6).setIn(false);
                } else {
                    bl = ((Transition)object6).isOut();
                    if (bl) {
                        ((Transition)object6).setOut(false);
                    }
                }
            }
        }
        f4 = ((EntityView)object).getEntityTrslTimeline().getmScaleFactor();
        ((Entity)object5).setmScaleFactor(f4);
        ((EntityView)object3).setEntityTrslTimeline((EntityTrslTimeline)object5);
        ((Entity)object5).setEntityView((EntityView)object3);
        object6 = ((EntityView)object).getEntityTrslTimeline().getTransition();
        if (object6 != null) {
            object6 = ((EntityView)object).getEntityTrslTimeline().getTransition().duplicate();
            ((EntityTrslTimeline)object5).setTransition((Transition)object6);
        }
        object5 = this.blurredImageView;
        int n6 = ((TranslationQuranEntity)object).getIndex() + 1;
        ((BlurredImageView)((Object)object5)).addEntity((TranslationQuranEntity)object3, n6);
        object = this.trackViewEntity;
        object5 = ((EntityView)object3).getEntityTrslTimeline();
        ((TrackEntityView)((Object)object)).selectEntity((Entity)object5, false);
        object = this.iTrimLineCallback;
        object3 = ((EntityView)object3).getEntityTrslTimeline();
        object.onSelectEntity((Entity)object3, -1.0f);
        this.trackViewEntity.updateCursurToSelectEntity();
    }

    private void duplicateEntityAudio(int n, EntityAudio entityAudio) {
        EntityAudio entityAudio2;
        Object object = entityAudio.getRect();
        float f = object.right;
        object = entityAudio.getRect();
        float f2 = object.width();
        Uri uri = entityAudio.getUri();
        Object object2 = entityAudio.getRect();
        float f3 = ((RectF)object2).top;
        float f4 = entityAudio.getH();
        float f5 = f + f2;
        float f6 = entityAudio.getMax();
        float f7 = entityAudio.getSecond_in_screen();
        int n2 = n;
        f2 = n;
        float f8 = 1000.0f;
        int n3 = (int)(f2 /= f8);
        float f9 = 0.0f;
        TrackEntityView trackEntityView = null;
        object2 = entityAudio2;
        entityAudio2 = new EntityAudio(null, uri, f, f3, f4, f5, f6, f7, n3, 0.0f, 0.0f, 0.0f);
        object = entityAudio.getAmps();
        entityAudio2.setAmps((float[])object);
        object = entityAudio.getRenderer();
        entityAudio2.setRenderer((WaveformBitmapRenderer)object);
        object = entityAudio.getPaths_http();
        entityAudio2.addPathHttp((List)object);
        object = entityAudio.getMediaPlayer();
        entityAudio2.setMediaPlayer((MediaPlayer)object);
        object = entityAudio2.getRect();
        object2 = entityAudio.getRect();
        float f10 = ((RectF)object2).bottom;
        object.bottom = f10;
        object = entityAudio.getPath_ffmpeg();
        entityAudio2.setPath_ffmpeg((String)object);
        object = entityAudio.getEffectAudio();
        entityAudio2.setEffectAudio((EffectAudio)object);
        object = entityAudio.getVideo_path();
        entityAudio2.setVideo_path((String)object);
        n2 = entityAudio.isApplyEffectInPreview() ? 1 : 0;
        entityAudio2.setApplyEffectInPreview(n2 != 0);
        f2 = entityAudio.getmScaleFactor();
        entityAudio2.setmScaleFactor(f2);
        n2 = entityAudio.getIndex() + 1;
        entityAudio2.setIndex(n2);
        f2 = entityAudio.getOffset_right();
        entityAudio2.setOffset_right(f2);
        f2 = entityAudio.getOffset_left();
        entityAudio2.setOffset_left(f2);
        f2 = entityAudio.getOffset();
        entityAudio2.setOffset(f2);
        object = entityAudio.getRect();
        f2 = object.right;
        object2 = this.trackViewEntity;
        f10 = ((TrackEntityView)((Object)object2)).getSecond_in_screen();
        f2 = f2 / f10 * f8;
        n2 = Math.round(f2);
        n2 = Math.abs(n2);
        object2 = entityAudio.getRect();
        f10 = ((RectF)object2).left;
        trackEntityView = this.trackViewEntity;
        f9 = trackEntityView.getSecond_in_screen();
        f10 = f10 / f9 * f8;
        int n4 = Math.round(f10);
        n4 = Math.abs(n4);
        f2 = n2 -= n4;
        f10 = entityAudio.getStart();
        f2 += f10;
        n2 = Math.round(f2);
        f2 = n2;
        entityAudio2.setEnd(f2);
        f2 = entityAudio.getStart();
        entityAudio2.setStart(f2);
        n2 = entityAudio.getMin_duration();
        entityAudio2.setMin_duration(n2);
        object = this.trackViewEntity;
        n4 = entityAudio.getIndex() + 1;
        object.addAudio(entityAudio2, n4);
        object = this.trackViewEntity;
        try {
            object.invalidate();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.hideProgressFragment();
            this.hideFragment();
        }
    }

    private void enableRedoBtn() {
        block6: {
            Object object = this.btnRedo;
            if (object == null) break block6;
            boolean bl = object.isEnabled();
            if (bl) break block6;
            object = new EngineActivity$62(this);
            try {
                this.runOnUiThread((Runnable)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void enableUndoBtn() {
        block6: {
            Object object = this.btnUndo;
            if (object == null) break block6;
            boolean bl = object.isEnabled();
            if (bl) break block6;
            object = new EngineActivity$61(this);
            try {
                this.runOnUiThread((Runnable)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void extractAudioFromVideo(String object, boolean bl) {
        Object object2 = this.mTemplate;
        object2 = ((Template)object2).getFolder_template();
        String[] stringArray = new File((String)object2);
        Object object3 = new StringBuilder();
        long l = System.currentTimeMillis();
        object3 = ((StringBuilder)object3).append(l);
        String string2 = "_audio.mp3";
        object3 = ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        object2 = new File((File)stringArray, (String)object3);
        int n = 7;
        stringArray = new String[n];
        object3 = "-i";
        int n2 = 0;
        string2 = null;
        stringArray[0] = object3;
        int n3 = 1;
        stringArray[n3] = object;
        object3 = "-vn";
        n2 = 2;
        stringArray[n2] = object3;
        object3 = "-acodec";
        n2 = 3;
        stringArray[n2] = object3;
        object3 = "copy";
        n2 = 4;
        stringArray[n2] = object3;
        object3 = "-y";
        n2 = 5;
        stringArray[n2] = object3;
        object3 = ((File)object2).getAbsolutePath();
        n2 = 6;
        stringArray[n2] = object3;
        object3 = new EngineActivity$86(this, (File)object2, bl, (String)object);
        try {
            FFmpegKit.executeWithArgumentsAsync(stringArray, (FFmpegSessionCompleteCallback)object3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = new EngineActivity$87(this);
            this.runOnUiThread((Runnable)object);
        }
    }

    private void extractAudioFromVideoRecursive(String string2, int n, boolean bl, int n2) {
        int n3 = this.isDestroyed();
        if (n3 != 0) {
            return;
        }
        String[] stringArray = this.extentions;
        n3 = stringArray.length;
        if (n < n3) {
            Object object = this.mTemplate;
            object = ((Template)object).getFolder_template();
            stringArray = new File((String)object);
            object = new StringBuilder();
            long l = System.currentTimeMillis();
            object = ((StringBuilder)object).append(l);
            Object object2 = "_audio";
            object = ((StringBuilder)object).append((String)object2);
            object2 = this.extentions;
            object2 = object2[n];
            object = ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            File file = new File((File)stringArray, (String)object);
            n3 = 7;
            stringArray = new String[n3];
            object = "-i";
            int n4 = 0;
            object2 = null;
            stringArray[0] = object;
            int n5 = 1;
            stringArray[n5] = string2;
            object = "-vn";
            n4 = 2;
            stringArray[n4] = object;
            object = "-acodec";
            n4 = 3;
            stringArray[n4] = object;
            object = "copy";
            n4 = 4;
            stringArray[n4] = object;
            object = "-y";
            n4 = 5;
            stringArray[n4] = object;
            object = file.getAbsolutePath();
            n4 = 6;
            stringArray[n4] = object;
            object2 = object;
            object = new EngineActivity$85(this, n, file, bl, string2, n2);
            try {
                FFmpegKit.executeWithArgumentsAsync(stringArray, (FFmpegSessionCompleteCallback)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.extractAudioFromVideo(string2, bl);
            }
        } else {
            this.extractAudioFromVideo(string2, bl);
        }
    }

    private void handleImg(Uri uri) {
        this.showProgress();
        Executor executor = this.executor;
        EngineActivity$91 engineActivity$91 = new EngineActivity$91(this, uri);
        executor.execute(engineActivity$91);
    }

    private void handleVideo(Uri uri) {
        this.showProgress();
        this.clearFFmpeg();
        Executor executor = this.executor;
        EngineActivity$88 engineActivity$88 = new EngineActivity$88(this, uri);
        executor.execute(engineActivity$88);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void hideFragment() {
        try {
            Object object;
            boolean bl = this.isFinishing();
            if (!bl && !(bl = ((FragmentManager)(object = this.getSupportFragmentManager())).isDestroyed())) {
                object = this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = ((FragmentManager)object).beginTransaction();
                int n = R$id.m_container;
                if ((object = ((FragmentManager)object).findFragmentById(n)) != null) {
                    fragmentTransaction.remove((Fragment)object);
                }
                fragmentTransaction.commit();
                this.setupHideFragment();
            }
        }
        catch (Exception exception) {}
        this.mCurrentFragment = null;
    }

    private void hideLayoutResolution() {
        int n;
        LinearLayout linearLayout = this.layout_resolution;
        if (linearLayout != null && (n = linearLayout.getVisibility()) == 0) {
            linearLayout = this.layout_resolution;
            EngineActivity$72 engineActivity$72 = new EngineActivity$72(this);
            linearLayout.post((Runnable)engineActivity$72);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void hideProgressFragment() {
        int n = -15658735;
        try {
            Object object;
            this.setStatusBarColor(n);
            n = -14803426;
            this.setNavigationBarColor(n);
            n = this.isFinishing() ? 1 : 0;
            if (n == 0 && (n = (int)(((FragmentManager)(object = this.getSupportFragmentManager())).isDestroyed() ? 1 : 0)) == 0) {
                object = this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = ((FragmentManager)object).beginTransaction();
                int n2 = R$id.container_progress;
                if ((object = ((FragmentManager)object).findFragmentById(n2)) != null) {
                    fragmentTransaction.remove((Fragment)object);
                }
                fragmentTransaction.commit();
            }
            n = R$id.container_progress;
            object = this.findViewById(n);
            int n3 = 8;
            object.setVisibility(n3);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void imageChooser() {
        ActivityResultLauncher activityResultLauncher = this.launchImg;
        Intent intent = new Intent((Context)this, GalleryPickerOneImage.class);
        activityResultLauncher.launch(intent);
    }

    private void iniTypeImg() {
        Executor executor = this.executor;
        EngineActivity$16 engineActivity$16 = new EngineActivity$16(this);
        executor.execute(engineActivity$16);
    }

    private void initLauncher() {
        Object object = new ActivityResultContracts$StartActivityForResult();
        EngineActivity$$ExternalSyntheticLambda8 engineActivity$$ExternalSyntheticLambda8 = new EngineActivity$$ExternalSyntheticLambda8(this);
        this.activityLauncher = object = this.registerForActivityResult((ActivityResultContract)object, engineActivity$$ExternalSyntheticLambda8);
    }

    private void initResolution() {
        int n = R$id.tv_resolution;
        Object object = (TextCustumFont)this.findViewById(n);
        this.tv_resolution = object;
        n = R$id.layout_resolution;
        object = (LinearLayout)this.findViewById(n);
        this.layout_resolution = object;
        n = R$id.btn_setup_fps;
        object = (LinearLayout)this.findViewById(n);
        this.btn_setup_fps = object;
        Object object2 = new EngineActivity$17(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.seekbar_fps;
        object = (CustomDiscreteSeekBar)this.findViewById(n);
        this.seekBar_fps = object;
        object = this.mTemplate;
        n = ((Template)object).getFps();
        int n2 = 15;
        int n3 = 3;
        int n4 = 2;
        int n5 = 1;
        if (n == n2) {
            object = this.seekBar_fps;
            ((CustomDiscreteSeekBar)((Object)object)).setProgress(0);
        } else {
            object = this.mTemplate;
            n = ((Template)object).getFps();
            if (n == (n2 = 25)) {
                object = this.seekBar_fps;
                ((CustomDiscreteSeekBar)((Object)object)).setProgress(n5);
            } else {
                object = this.mTemplate;
                n = ((Template)object).getFps();
                if (n == (n2 = 30)) {
                    object = this.seekBar_fps;
                    ((CustomDiscreteSeekBar)((Object)object)).setProgress(n4);
                } else {
                    object = this.mTemplate;
                    n = ((Template)object).getFps();
                    if (n == (n2 = 50)) {
                        object = this.seekBar_fps;
                        ((CustomDiscreteSeekBar)((Object)object)).setProgress(n3);
                    } else {
                        object = this.seekBar_fps;
                        n2 = 4;
                        ((CustomDiscreteSeekBar)((Object)object)).setProgress(n2);
                    }
                }
            }
        }
        object = this.seekBar_fps;
        object2 = new EngineActivity$18(this);
        ((CustomDiscreteSeekBar)((Object)object)).setOnProgressChangeListener((CustomDiscreteSeekBar$OnProgressChangeListener)object2);
        object = this.tv_resolution;
        object2 = this.mTemplate.getResolution();
        object.setText((CharSequence)object2);
        n = R$id.seekbar_resolution;
        object = (CustomDiscreteSeekBar)this.findViewById(n);
        this.seekBar_res = object;
        object = this.mTemplate.getResolution();
        object2 = "480p";
        n = ((String)object).equals(object2) ? 1 : 0;
        if (n != 0) {
            object = this.seekBar_res;
            ((CustomDiscreteSeekBar)((Object)object)).setProgress(0);
        } else {
            object = this.mTemplate.getResolution();
            n = ((String)object).equals(object2 = "720p") ? 1 : 0;
            if (n != 0) {
                object = this.seekBar_res;
                ((CustomDiscreteSeekBar)((Object)object)).setProgress(n5);
            } else {
                object = this.mTemplate.getResolution();
                n = ((String)object).equals(object2 = "1080p") ? 1 : 0;
                if (n != 0) {
                    object = this.seekBar_res;
                    ((CustomDiscreteSeekBar)((Object)object)).setProgress(n4);
                } else {
                    object = this.seekBar_res;
                    ((CustomDiscreteSeekBar)((Object)object)).setProgress(n3);
                }
            }
        }
        object = this.seekBar_res;
        object2 = new EngineActivity$19(this);
        ((CustomDiscreteSeekBar)((Object)object)).setOnProgressChangeListener((CustomDiscreteSeekBar$OnProgressChangeListener)object2);
    }

    private void initTimeLineView() {
        Object object;
        int n = R$id.tv_current_time;
        this.tv_currentTime = object = (TextView)this.findViewById(n);
        n = R$id.tv_end_time;
        this.tv_endTime = object = (TextView)this.findViewById(n);
        n = R$id.time_line_view;
        object = (TrackEntityView)this.findViewById(n);
        this.trackViewEntity = object;
        Object object2 = this.iTrimLineCallback;
        object.setiTrimLineCallback((TrackEntityView$ITrimLineCallback)object2);
        object = this.trackViewEntity;
        float f = this.mTemplate.getScale_timeline();
        object.setScaleFactor(f);
        object = this.trackViewEntity;
        object2 = new EngineActivity$38(this);
        object.post((Runnable)object2);
    }

    private void initTypeVideo() {
        Object object = this.blurredImageView;
        int n = object.getWidth();
        Object object2 = this.blurredImageView;
        int n2 = object2.getHeight();
        Template template = this.mTemplate;
        int n3 = template.geTypeResize();
        ((BlurredImageView)((Object)object)).initCanvasDimension(n, n2, n3);
        object = this.mTemplate;
        object = ((Template)object).getUri_original_upload_video();
        object = Uri.parse((String)object);
        object = object.toString();
        Object object3 = this.mTemplate;
        object3 = ((Template)object3).getFolder_template();
        object2 = new EngineActivity$15(this);
        try {
            AudioUtils.copyToLocalAsync((Context)this, (String)object, (String)object3, (AudioUtils$Callback)object2);
        }
        catch (Exception exception) {
            object3 = new StringBuilder("android.resource://");
            object2 = this.getPackageName();
            object3 = ((StringBuilder)object3).append((String)object2).append("/drawable/");
            n2 = R$drawable.bg_1;
            object3 = ((StringBuilder)object3).append(n2).toString();
            this.uri_bg = object3;
            this.mTemplate.setName_drawable("bg_1");
            this.mTemplate.setColor_ipad(-1);
            object3 = this.mTemplate;
            n2 = 0;
            ((Template)object3).setVideoSquare(false);
            this.iniTypeImg();
            object2 = "init ";
            object3 = new StringBuilder((String)object2);
            String string2 = exception.getMessage();
            string2 = ((StringBuilder)object3).append(string2).toString();
            object3 = "Tag : ";
            Log.e((String)object3, (String)string2);
        }
    }

    private void initViews() {
        Object object;
        this.initResolution();
        int n = R$id.btn_play_pause;
        this.btnPlayPause = object = (ImageButton)this.findViewById(n);
        Object object2 = new EngineActivity$20(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_to_end;
        this.btnToEnd = object = (ImageButton)this.findViewById(n);
        object2 = new EngineActivity$21(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_to_start;
        this.btnToStart = object = (ImageButton)this.findViewById(n);
        object2 = new EngineActivity$22(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = this.mTemplate.getCurrentCursur();
        this.updateBtnToStart(n);
        n = R$id.btn_redo;
        this.btnRedo = object = (ImageButton)this.findViewById(n);
        n = R$id.btn_undo;
        this.btnUndo = object = (ImageButton)this.findViewById(n);
        this.disableUndoBtn();
        this.disableRedoBtn();
        object = this.btnRedo;
        object2 = new EngineActivity$23(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.btnUndo;
        object2 = new EngineActivity$24(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.trackViewEntity;
        object2 = this.btnRedo;
        Object object3 = this.btnUndo;
        object.setRedoUndo((ImageButton)object2, (ImageButton)object3);
        n = R$id.view;
        object = (BlurredImageView)this.findViewById(n);
        this.blurredImageView = object;
        int n2 = BillingPreferences.isSubscribed((Context)this);
        object.setPro(n2 != 0);
        object = this.blurredImageView;
        object2 = new EngineActivity$25(this);
        object.setiViewCallback((BlurredImageView$IViewCallback)object2);
        object = this.blurredImageView;
        n = object.isPro() ? 1 : 0;
        if (n != 0) {
            n = R$id.to_pro;
            object = this.findViewById(n);
            n2 = 8;
            object.setVisibility(n2);
        } else {
            n = R$id.to_pro;
            object = this.findViewById(n);
            object2 = new EngineActivity$26(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.blurredImageView;
        object2 = new EngineActivity$27(this);
        object.post((Runnable)object2);
        n = R$id.btn_export;
        object = (ButtonCustumFont)this.findViewById(n);
        this.btn_export = object;
        object2 = this.mResources;
        int n3 = R$string.export;
        object2 = object2.getString(n3);
        object.setText((CharSequence)object2);
        object = this.btn_export;
        object2 = new EngineActivity$28(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_cancel;
        this.btn_cancel = object = (ImageButton)this.findViewById(n);
        object2 = new EngineActivity$29(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.tv_tittle_fragment;
        object = (TextCustumFont)this.findViewById(n);
        this.tv_tittle_fragment = object;
        n = R$id.tv_quran;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.mResources;
        n3 = R$string.quran;
        object2 = object2.getString(n3);
        object.setText((CharSequence)object2);
        n = R$id.tv_bg;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.mResources;
        n3 = R$string.bg;
        object2 = object2.getString(n3);
        object.setText((CharSequence)object2);
        n = R$id.tv_ipad;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.mResources;
        n3 = R$string.ipad;
        object2 = object2.getString(n3);
        object.setText((CharSequence)object2);
        n2 = R$id.btn_add_quran;
        object2 = this.findViewById(n2);
        object3 = new EngineActivity$30(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_bg;
        object2 = this.findViewById(n2);
        object3 = new EngineActivity$31(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_ipad;
        object2 = (LinearLayout)this.findViewById(n2);
        this.btnIpod = object2;
        n2 = R$id.tv_ratio;
        this.textChangeResize = object2 = (TextCustumFont)this.findViewById(n2);
        n2 = R$id.iv_ratio;
        object2 = (ImageView)this.findViewById(n2);
        this.ivResize = object2;
        n2 = R$id.iv_ipod;
        object2 = (ImageView)this.findViewById(n2);
        this.ivIpod = object2;
        n2 = R$id.btn_change_aspect;
        object2 = (LinearLayout)this.findViewById(n2);
        this.btnChangeResize = object2;
        object2 = this.blurredImageView;
        n2 = ((BlurredImageView)((Object)object2)).isPro() ? 1 : 0;
        if (n2 != 0) {
            object = this.btnChangeResize;
            object2 = new EngineActivity$32(this);
            object.setOnClickListener((View.OnClickListener)object2);
        } else {
            object2 = this.textChangeResize;
            n3 = -8355712;
            object2.setTextColor(n3);
            object2 = this.ivResize;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            object2.setColorFilter(n3, mode);
            object2 = this.btnChangeResize;
            mode = null;
            object2.setBackgroundColor(0);
            object2 = this.btnChangeResize;
            EngineActivity$33 engineActivity$33 = new EngineActivity$33(this);
            object2.setOnClickListener((View.OnClickListener)engineActivity$33);
            object.setTextColor(n3);
            object = this.ivIpod;
            object2 = PorterDuff.Mode.SRC_IN;
            object.setColorFilter(n3, (PorterDuff.Mode)object2);
            object = this.btnIpod;
            object.setBackgroundColor(0);
        }
        object = this.btnIpod;
        object2 = new EngineActivity$34(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = this.mTemplate.geTypeResize();
        object2 = this.mTemplate.getImgResize();
        this.updateHitRatio(n, (String)object2);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat$Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void loadTemplate() {
        int n;
        Object object = (Template)LocalPersistence.readObjectFromFile((Context)this, "template_tmp");
        this.mTemplate = object;
        int n2 = 1280;
        int n3 = 720;
        Object object2 = "/drawable/";
        Object object3 = "android.resource://";
        int n4 = 1;
        if (object == null && (object = this.getIntent()) != null) {
            object = this.getIntent();
            String string2 = "template";
            if ((object = object.getStringExtra(string2)) != null) {
                this.mTemplate = object = (Template)LocalPersistence.readObjectFromFile((Context)this, (String)object);
                if (object != null) {
                    if ((object = ((Template)object).getName_drawable()) != null) {
                        object = new StringBuilder((String)object3);
                        string2 = this.getPackageName();
                        object = ((StringBuilder)object).append(string2).append((String)object2);
                        string2 = this.mTemplate.getName_drawable();
                        int n5 = DrawableHelper.getIDDrawableByName(string2);
                        this.uri_bg = object = ((StringBuilder)object).append(n5).toString();
                    } else {
                        this.uri_bg = object = this.mTemplate.getUri_bg();
                    }
                    object = this.mTemplate;
                    n = ((Template)object).getWidth();
                    if (n < n4 || (n = ((Template)(object = this.mTemplate)).getHeight()) < n4) {
                        object = this.mTemplate;
                        ((Template)object).setWidthAndHeight(n3, n2);
                    }
                }
            }
        }
        if ((object = this.mTemplate) == null) {
            this.mTemplate = object = new Template();
            object = this.getIntent();
            CharSequence charSequence = "img_bg";
            this.uri_bg = object = object.getStringExtra((String)charSequence);
            if (object != null) {
                object2 = this.mTemplate;
                ((Template)object2).setUri_bg((String)object);
            } else {
                object = DrawableHelper.getRandomDrawableEntry();
                charSequence = new StringBuilder((String)object3);
                object3 = this.getPackageName();
                object2 = ((StringBuilder)charSequence).append((String)object3).append((String)object2);
                object3 = object.getValue();
                this.uri_bg = object2 = ((StringBuilder)object2).append(object3).toString();
                object3 = this.mTemplate;
                ((Template)object3).setUri_bg((String)object2);
                object2 = this.mTemplate;
                object = (String)object.getKey();
                ((Template)object2).setName_drawable((String)object);
            }
            object = this.mTemplate;
            ((Template)object).setWidthAndHeight(n3, n2);
        } else {
            if ((object = ((Template)object).getName_drawable()) != null) {
                object = new StringBuilder((String)object3);
                object3 = this.getPackageName();
                object = ((StringBuilder)object).append((String)object3).append((String)object2);
                object2 = this.mTemplate.getName_drawable();
                int n6 = DrawableHelper.getIDDrawableByName((String)object2);
                this.uri_bg = object = ((StringBuilder)object).append(n6).toString();
            } else {
                this.uri_bg = object = this.mTemplate.getUri_bg();
            }
            object = this.mTemplate;
            n = ((Template)object).getWidth();
            if (n < n4 || (n = ((Template)(object = this.mTemplate)).getHeight()) < n4) {
                object = this.mTemplate;
                ((Template)object).setWidthAndHeight(n3, n2);
            }
        }
        object = FileUtils.getFile(this.getApplicationContext());
        if (object != null) {
            Template template = this.mTemplate;
            object = ((File)object).getAbsolutePath();
            template.setFolder_template((String)object);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void pausePlayer() {
        this.hideLayoutResolution();
        var1_1 = this.mIsPlaying;
        if (!var1_1) ** GOTO lbl61
        var1_1 = false;
        var2_2 = null;
        this.mIsPlaying = false;
        this.pauseTimelineAnimation();
        var2_2 = this.trackViewEntity;
        var3_3 = this.mIsPlaying;
        var2_2.setPlaying((boolean)var3_3);
        var2_2 = this.blurredImageView;
        var3_3 = this.mIsPlaying;
        var2_2.setPlaying((boolean)var3_3);
        var2_2 = this.trackViewEntity;
        var2_2.invalidate();
        var2_2 = this.trackViewEntity;
        var2_2 = var2_2.getEntityListAudio();
        var2_2 = var2_2.iterator();
        while (true) {
            var3_3 = var2_2.hasNext();
            if (var3_3 == 0) break;
            var4_4 = var2_2.next();
            var4_4 = (EntityAudio)var4_4;
            var5_6 = var4_4.getMediaPlayer();
            if (var5_6 == null) continue;
            var5_6 = var4_4.getMediaPlayer();
            var6_7 = var5_6.isPlaying();
            if (!var6_7) continue;
            var4_4 = var4_4.getMediaPlayer();
            try {
                var4_4.pause();
            }
            catch (Exception var4_5) {
                var4_5.printStackTrace();
            }
        }
        {
            var2_2 = this.btnPlayPause;
        }
        var3_3 = R$drawable.play_btn;
        {
            catch (Exception v0) {
                ** continue;
            }
        }
        var2_2.setImageResource(var3_3);
        this.stop();
lbl61:
        // 2 sources

        var2_2 = this.trackViewEntity;
        var2_2.pauseScroll();
lbl64:
        // 2 sources

    }

    /*
     * Unable to fully structure code
     */
    private void processFrame(String var1_1) {
        block153: {
            block155: {
                block154: {
                    block150: {
                        block152: {
                            block151: {
                                block149: {
                                    block148: {
                                        block147: {
                                            var2_3 = this.isOnScroll;
                                            if (var2_3 == 0) break block147;
                                            var2_3 = this.mIsPlaying;
                                            if (var2_3 == 0) break block147;
                                            return;
                                        }
                                        var2_3 = this.mIsPlaying;
                                        if (var2_3 != 0) break block148;
                                        return;
                                    }
                                    var3_4 = this.blurredImageView;
                                    var2_3 = var3_4.getHeight();
                                    var4_5 = Glide.with(this);
                                    var4_5 = var4_5.asBitmap();
                                    var1_1 = var4_5.load((String)var1_1);
                                    var4_5 = DiskCacheStrategy.NONE;
                                    var1_1 = var1_1.diskCacheStrategy((DiskCacheStrategy)var4_5);
                                    var1_1 = (RequestBuilder)var1_1;
                                    var5_6 = 1;
                                    var6_7 = 1.4E-45f;
                                    var1_1 = var1_1.skipMemoryCache((boolean)var5_6);
                                    var1_1 = (RequestBuilder)var1_1;
                                    var1_1 = var1_1.override(var2_3, var2_3);
                                    var1_1 = (RequestBuilder)var1_1;
                                    var1_1 = var1_1.submit();
                                    var1_1 = var1_1.get();
                                    var1_1 = (Bitmap)var1_1;
                                    if (var1_1 != null) break block149;
                                    return;
                                }
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.BLACK_LAYER;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) break block150;
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.GRADIENT;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) break block150;
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.MASK_BRUSH;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) break block150;
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.BLUE_TYPE;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) break block150;
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.CASSET_IMG;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) break block150;
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.IPAD;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) ** GOTO lbl276
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.IPAD_UNBLUR;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) ** GOTO lbl276
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.BOTTOM_RECT;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) ** GOTO lbl276
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.IPAD_CLASSIC;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) ** GOTO lbl276
                                var3_4 = this.mTemplate;
                                var2_3 = var3_4.getIpad_type();
                                var4_5 = IpadType.IPAD_NEOMORPHIC;
                                var5_6 = var4_5.ordinal();
                                if (var2_3 == var5_6) ** GOTO lbl276
                                var3_4 = this.blurredImageView;
                                var3_4 = var3_4.getIpad_rect();
                                var7_8 = var3_4.width() * 0.87530595f;
                                var2_3 = (int)var7_8;
                                var6_7 = var2_3;
                                var8_9 = 1066443735;
                                var9_11 = 1.13f;
                                var5_6 = (int)(var6_7 *= var9_11);
                                var9_11 = Math.min(var2_3, var5_6);
                                var10_12 = 1037905692;
                                var11_14 = 0.10800001f;
                                var8_9 = (int)(var9_11 *= var11_14);
                                var12_15 = this.blurredImageView;
                                var12_15 = var12_15.getBitmapOriginal();
                                var10_12 = var12_15.getWidth();
                                var11_14 = var10_12;
                                var13_17 = this.mTemplate;
                                var14_18 = var13_17.getX_square();
                                var11_14 *= var14_18;
                                var10_12 = Math.round(var11_14);
                                var13_17 = this.blurredImageView;
                                var13_17 = var13_17.getBitmapOriginal();
                                var15_19 = var13_17.getHeight();
                                var14_18 = var15_19;
                                var16_20 = this.mTemplate;
                                var17_21 = var16_20.getY_square();
                                var14_18 *= var17_21;
                                var15_19 = Math.round(var14_18);
                                var2_3 += var10_12;
                                var16_20 = this.blurredImageView;
                                var16_20 = var16_20.getBitmapOriginal();
                                var18_22 = var16_20.getWidth();
                                if (var2_3 <= var18_22) break block151;
                                var16_20 = this.blurredImageView;
                                var16_20 = var16_20.getBitmapOriginal();
                                var18_22 = var16_20.getWidth();
                                var10_12 -= (var2_3 -= var18_22);
                                var3_4 = this.blurredImageView;
                                var3_4 = var3_4.getBitmapOriginal();
                                var2_3 = var3_4.getWidth();
                            }
                            var5_6 += var15_19;
                            var16_20 = this.blurredImageView;
                            var16_20 = var16_20.getBitmapOriginal();
                            var18_22 = var16_20.getHeight();
                            if (var5_6 <= var18_22) break block152;
                            var16_20 = this.blurredImageView;
                            var16_20 = var16_20.getBitmapOriginal();
                            var18_22 = var16_20.getHeight();
                            var15_19 -= (var5_6 -= var18_22);
                            var4_5 = this.blurredImageView;
                            var4_5 = var4_5.getBitmapOriginal();
                            var5_6 = var4_5.getHeight();
                        }
                        var18_22 = 0;
                        var17_21 = 0.0f;
                        var16_20 = null;
                        if (var10_12 < 0) {
                            var10_12 = 0;
                            var12_15 = null;
                            var11_14 = 0.0f;
                        }
                        if (var15_19 < 0) {
                            var15_19 = 0;
                            var13_17 = null;
                            var14_18 = 0.0f;
                        }
                        var16_20 = new Rect(var10_12, var15_19, var2_3, var5_6);
                        var3_4 = this.blurredImageView;
                        var3_4 = var3_4.getBitmapOriginal();
                        var2_3 = var3_4.getWidth();
                        var7_8 = var2_3;
                        var4_5 = this.mTemplate;
                        var6_7 = var4_5.getWidth_square();
                        var2_3 = (int)(var7_8 *= var6_7);
                        var4_5 = this.blurredImageView;
                        var4_5 = var4_5.getBitmapOriginal();
                        var5_6 = var4_5.getHeight();
                        var6_7 = var5_6;
                        var12_15 = this.mTemplate;
                        var11_14 = var12_15.getHeight_square();
                        var5_6 = (int)(var6_7 *= var11_14);
                        var1_1 = UtilsBitmap.cropToSquareWithRoundCorners((Bitmap)var1_1, (Rect)var16_20, var8_9, var2_3, var5_6);
                        var8_9 = var16_20.left + var2_3;
                        var16_20.right = var8_9;
                        var2_3 = var16_20.top + var5_6;
                        var16_20.bottom = var2_3;
                        var3_4 = this.blurredImageView;
                        var3_4.setRectSquare((Rect)var16_20);
                        break block153;
lbl276:
                        // 5 sources

                        var3_4 = this.blurredImageView;
                        var3_4 = var3_4.getRectSquare();
                        var4_5 = this.blurredImageView;
                        var5_6 = var4_5.getRadius_square();
                        var19_23 = this.blurredImageView;
                        var19_23 = var19_23.getBitmapSquare();
                        var8_10 = var19_23.getWidth();
                        var12_16 = this.blurredImageView;
                        var12_16 = var12_16.getBitmapSquare();
                        var10_13 = var12_16.getHeight();
                        var1_1 = UtilsBitmap.cropToSquareWithRoundCornersPlusScale((Bitmap)var1_1, (Rect)var3_4, var5_6, var8_10, var10_13);
                        break block153;
                    }
                    var3_4 = this.mTemplate;
                    var2_3 = var3_4.geTypeResize();
                    var4_5 = ResizeType.SOCIAL_STORY;
                    var5_6 = var4_5.ordinal();
                    if (var2_3 != var5_6) break block154;
                    var3_4 = this.blurredImageView;
                    var2_3 = var3_4.getW();
                    var4_5 = this.blurredImageView;
                    var5_6 = var4_5.getH();
                    var1_1 = BitmapCropper.cropTo9x16((Bitmap)var1_1, var2_3, var5_6);
                    break block153;
                }
                var3_4 = this.mTemplate;
                var2_3 = var3_4.geTypeResize();
                var4_5 = ResizeType.SQUARE;
                var5_6 = var4_5.ordinal();
                if (var2_3 != var5_6) break block155;
                var3_4 = this.blurredImageView;
                var2_3 = var3_4.getW();
                var4_5 = this.blurredImageView;
                var5_6 = var4_5.getH();
                var1_1 = BitmapCropper.cropTo1x1((Bitmap)var1_1, var2_3, var5_6);
                break block153;
            }
            var3_4 = this.blurredImageView;
            var2_3 = var3_4.getW();
            var4_5 = this.blurredImageView;
            var5_6 = var4_5.getH();
            var1_1 = BitmapCropper.cropTo16x9((Bitmap)var1_1, var2_3, var5_6);
        }
        var3_4 = new EngineActivity$$ExternalSyntheticLambda7(this, (Bitmap)var1_1);
        try {
            this.runOnUiThread((Runnable)var3_4);
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void releaseWakeLock() {
        int n;
        Window window;
        try {
            window = this.getWindow();
            n = 128;
        }
        catch (Exception exception) {
            return;
        }
        window.clearFlags(n);
    }

    private void save() {
        boolean bl = this.oneExport;
        if (bl) {
            return;
        }
        this.oneExport = bl = true;
        this.trackViewEntity.finishScroll();
        this.trackViewEntity.setOnProgress(bl);
        Object object = this.blurredImageView;
        object.setNotDraw(bl);
        Object object2 = this.blurredImageView;
        bl = ((BlurredImageView)((Object)object2)).isPro();
        if (!bl) {
            object2 = this.blurredImageView;
            object = null;
            ((BlurredImageView)((Object)object2)).setRemoveWattermark(false);
        }
        this.stop();
        this.showProgress();
        object2 = this.executor;
        object = new EngineActivity$35(this);
        object2.execute((Runnable)object);
    }

    /*
     * Exception decompiling
     */
    private void saveTemplate() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [660[CATCHBLOCK]], but top level block is 238[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private void saveTemplateTmp() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [643[CATCHBLOCK]], but top level block is 238[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void selectSurahName() {
        int n = R$id.layout_menu;
        this.findViewById(n).setVisibility(4);
        Object object = this.blurredImageView.getSurahNameEntity();
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Object object2 = this.iEditSName;
        Resources resources = this.mResources;
        this.mCurrentFragment = object = EditS_NameFragment.getInstance((EditS_NameFragment$IEditS_Name)object2, resources, (SurahNameEntity)object);
        n = R$id.m_container;
        object2 = this.mCurrentFragment;
        fragmentTransaction.replace(n, (Fragment)object2);
        fragmentTransaction.commit();
    }

    private void setupHideFragment() {
        int n = R$id.layout_time;
        this.findViewById(n).setVisibility(0);
        n = R$id.layout_menu;
        this.findViewById(n).setVisibility(0);
        TextCustumFont textCustumFont = this.tv_tittle_fragment;
        int n2 = 8;
        textCustumFont.setVisibility(n2);
        textCustumFont = this.btnChangeResize;
        if (textCustumFont != null) {
            textCustumFont.setVisibility(0);
        }
        this.btn_cancel.setVisibility(0);
        this.btn_export.setVisibility(0);
        this.btn_setup_fps.setVisibility(0);
    }

    private Bitmap setupOriginalBitmap(Bitmap bitmap, int n) {
        int n2 = bitmap.getWidth();
        int n3 = bitmap.getHeight();
        float f = n;
        float f2 = Math.min(n2, n3);
        n2 = Math.round((float)n2 * (f /= f2));
        n = Math.round((float)n3 * f);
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n2, (int)n, (boolean)true);
    }

    private Bitmap setupOriginalBitmap(Uri uri) {
        int n = this.blurredImageView.getHeight();
        uri = MediaStore.Images.Media.getBitmap((ContentResolver)this.getContentResolver(), (Uri)uri);
        int n2 = uri.getWidth();
        int n3 = uri.getHeight();
        float f = n;
        float f2 = Math.min(n2, n3);
        n2 = Math.round((float)n2 * (f /= f2));
        n = Math.round((float)n3 * f);
        return Bitmap.createScaledBitmap((Bitmap)uri, (int)n2, (int)n, (boolean)true);
    }

    private void setupShowFragment(String object) {
        int n = R$id.layout_time;
        View view = this.findViewById(n);
        int n2 = 4;
        view.setVisibility(n2);
        n = R$id.layout_menu;
        view = this.findViewById(n);
        view.setVisibility(n2);
        if (object != null) {
            this.tv_tittle_fragment.setText((CharSequence)object);
            object = this.tv_tittle_fragment;
            n = 0;
            view = null;
            object.setVisibility(0);
            object = this.btnChangeResize;
            if (object != null) {
                object.setVisibility(n2);
            }
        }
        this.btn_cancel.setVisibility(n2);
        this.btn_export.setVisibility(n2);
        this.btn_setup_fps.setVisibility(n2);
    }

    private void showEditAudioEntity(EntityAudio object) {
        int n = R$id.layout_menu;
        this.findViewById(n).setVisibility(4);
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Object object2 = this.iEditMediaCallback;
        Resources resources = this.mResources;
        float f = -this.trackViewEntity.getCurrentPosition();
        this.mCurrentFragment = object = EditMediaFragment.getInstance((EditMediaFragment$IEditMediaCallback)object2, resources, (EntityAudio)object, f);
        int n2 = R$id.m_container;
        object2 = this.mCurrentFragment;
        fragmentTransaction.replace(n2, (Fragment)object2);
        fragmentTransaction.commit();
    }

    private void showEditBismilahEntity(Entity object) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Object object2 = this.iBismilahEntityCallback;
        Resources resources = this.mResources;
        float f = -this.trackViewEntity.getCurrentPosition();
        this.mCurrentFragment = object = EditBismilahEntityFragment.getInstance((EditBismilahEntityFragment$IBismilahEntityCallback)object2, resources, (Entity)object, f);
        int n = R$id.m_container;
        object2 = this.mCurrentFragment;
        fragmentTransaction.replace(n, (Fragment)object2);
        fragmentTransaction.commit();
    }

    private void showEditEntity(Entity object) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Object object2 = this.iEditEntityCallback;
        Resources resources = this.mResources;
        float f = -this.trackViewEntity.getCurrentPosition();
        this.mCurrentFragment = object = EditEntityFragment.getInstance((EditEntityFragment$IEditEntityCallback)object2, resources, (Entity)object, f);
        int n = R$id.m_container;
        object2 = this.mCurrentFragment;
        fragmentTransaction.replace(n, (Fragment)object2);
        fragmentTransaction.commit();
    }

    private void showEditMultipleEntity(int n) {
        Object object = EditMultipleEntityFragment.instance;
        if (object != null) {
            object = EditMultipleEntityFragment.instance;
            ((EditMultipleEntityFragment)object).setCount_select(n);
        } else {
            int n2 = R$id.layout_menu;
            object = this.findViewById(n2);
            int n3 = 4;
            object.setVisibility(n3);
            object = this.getSupportFragmentManager().beginTransaction();
            Object object2 = this.iEditMultipleCallback;
            Resources resources = this.mResources;
            EditMultipleEntityFragment editMultipleEntityFragment = EditMultipleEntityFragment.getInstance((EditMultipleEntityFragment$IEditMultipleCallback)object2, resources, n);
            this.mCurrentFragment = editMultipleEntityFragment;
            n = R$id.m_container;
            object2 = this.mCurrentFragment;
            ((FragmentTransaction)object).replace(n, (Fragment)object2);
            ((FragmentTransaction)object).commit();
        }
    }

    private void showEditTrslEntity(Entity object) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Object object2 = this.iEditTrstEntityCallback;
        Resources resources = this.mResources;
        float f = -this.trackViewEntity.getCurrentPosition();
        this.mCurrentFragment = object = EditTrslEntityFragment.getInstance((EditTrslEntityFragment$IEditEntityCallback)object2, resources, (Entity)object, f);
        int n = R$id.m_container;
        object2 = this.mCurrentFragment;
        fragmentTransaction.replace(n, (Fragment)object2);
        fragmentTransaction.commit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showProgress() {
        int n = -16777216;
        try {
            this.setStatusBarColor(n);
            this.setNavigationBarColor(n);
            n = R$id.container_progress;
            Object object = this.findViewById(n);
            int n2 = 0;
            object.setVisibility(0);
            n = this.isFinishing() ? 1 : 0;
            if (n != 0) return;
            object = this.getSupportFragmentManager();
            n = ((FragmentManager)object).isDestroyed() ? 1 : 0;
            if (n != 0) return;
            object = this.getSupportFragmentManager();
            object = ((FragmentManager)object).beginTransaction();
            n2 = R$id.container_progress;
            ProgressViewFragment progressViewFragment = ProgressViewFragment.getInstance();
            ((FragmentTransaction)object).replace(n2, progressViewFragment);
            ((FragmentTransaction)object).commit();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showProgressSimple() {
        try {
            int n = R$id.container_progress;
            Object object = this.findViewById(n);
            int n2 = 0;
            object.setVisibility(0);
            n = this.isFinishing() ? 1 : 0;
            if (n != 0) return;
            object = this.getSupportFragmentManager();
            n = ((FragmentManager)object).isDestroyed() ? 1 : 0;
            if (n != 0) return;
            object = this.getSupportFragmentManager();
            object = ((FragmentManager)object).beginTransaction();
            n2 = R$id.container_progress;
            SimpleProgressViewFragment simpleProgressViewFragment = SimpleProgressViewFragment.getInstance();
            ((FragmentTransaction)object).replace(n2, simpleProgressViewFragment);
            ((FragmentTransaction)object).commit();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void splitEntity(QuranEntity quranEntity) {
        EngineActivity engineActivity = this;
        Object object = this.trackViewEntity;
        float f = Math.abs(object.getXCursur());
        Object object2 = quranEntity.getEntityQuran().getRect();
        float f2 = ((RectF)object2).left;
        float f3 = f - f2;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 > 0) {
            object2 = quranEntity.getEntityQuran().getRect();
            f2 = ((RectF)object2).right;
            float f5 = f - f2;
            f4 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            if (f4 < 0) {
                float f6;
                object2 = this.trackViewEntity;
                f2 = ((TrackEntityView)((Object)object2)).getSecond_in_screen() * 0.2f;
                Object object3 = quranEntity.getEntityQuran().getRect();
                float f7 = ((RectF)object3).left;
                float f8 = f - f7;
                float f9 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (f9 > 0) {
                    object3 = quranEntity.getEntityQuran().getRect();
                    f7 = ((RectF)object3).left + f2;
                    float f10 = f - f7;
                    f9 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                    if (f9 < 0) {
                        return;
                    }
                }
                object3 = quranEntity.getEntityQuran().getRect();
                f7 = ((RectF)object3).right;
                float f11 = f - f7;
                f9 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (f9 < 0) {
                    object3 = quranEntity.getEntityQuran().getRect();
                    f7 = ((RectF)object3).right - f2;
                    float f12 = f - f7;
                    f6 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (f6 > 0) {
                        return;
                    }
                }
                if ((object = quranEntity.getTypefaceNumber()) == null) {
                    object = UtilsFileLast.loadFontFromAsset((Context)engineActivity, "fonts/arabic/\u062e\u0637 \u0641\u0627\u0631\u0633 \u0627\u0644\u0643\u0648\u0641\u064a.otf");
                }
                TrackEntityView trackEntityView = object;
                object = quranEntity.getPaintAya().getTypeface();
                if (object == null) {
                    object = new StringBuilder("fonts/arabic/");
                    object2 = quranEntity.getNameFont();
                    object = ((StringBuilder)object).append((String)object2).toString();
                    object = UtilsFileLast.loadFontFromAsset((Context)engineActivity, (String)object);
                }
                TrackEntityView trackEntityView2 = object;
                object = quranEntity.getPaintTranslationAya();
                if (object != null) {
                    object = quranEntity.getPaintTranslationAya().getTypeface();
                } else {
                    f6 = 0.0f;
                    f = 0.0f;
                    object = null;
                }
                if (object == null) {
                    object = this.getResources().getAssets();
                    object2 = "fonts/ReadexPro_Medium.ttf";
                    object = Typeface.createFromAsset((AssetManager)object, (String)object2);
                }
                TrackEntityView trackEntityView3 = object;
                Object object4 = quranEntity.getTxt();
                String string2 = quranEntity.getComplete_aya();
                String string3 = quranEntity.getTranslation();
                String string4 = quranEntity.getTranslation_complete();
                RectF rectF = engineActivity.blurredImageView.getRectFAya();
                int n = quranEntity.getIndexNumber();
                int n2 = quranEntity.getNumber();
                int n3 = quranEntity.getClrAya();
                int n4 = quranEntity.getClrTrsl();
                String string5 = quranEntity.getNameFont();
                float f13 = quranEntity.getPaintAya().getTextSize();
                float f14 = quranEntity.getPaintTranslationAya().getTextSize();
                boolean bl = quranEntity.getPaintAya().isUnderlineText();
                VectorDrawable vectorDrawable = quranEntity.getVectorDrawable();
                QuranEntity quranEntity2 = new QuranEntity((String)object4, string2, string3, string4, rectF, (Typeface)trackEntityView2, (Typeface)trackEntityView3, n, n2, (Typeface)trackEntityView, n3, n4, string5, f13, f14, bl, vectorDrawable);
                f = quranEntity.getFactorSize();
                quranEntity2.setFcSize(f);
                f = quranEntity.getFactorSizeTrl();
                quranEntity2.setFactorSizeTrl(f);
                f = quranEntity.getFactor_scale();
                quranEntity2.setFactor_scale(f);
                f6 = engineActivity.blurredImageView.getmCanvas_width();
                f4 = engineActivity.blurredImageView.getmCanvas_height();
                quranEntity2.setCanvasWH((int)f6, (int)f4);
                f6 = engineActivity.mTemplate.getIpad_type();
                quranEntity2.setIpad_type((int)f6);
                f6 = quranEntity.getStartWord_index();
                quranEntity2.setStartWord_index((int)f6);
                f6 = quranEntity.getEndWord_index();
                quranEntity2.setEndWord_index((int)f6);
                object = quranEntity.getIcon();
                quranEntity2.setIcon((String)object);
                object2 = engineActivity.trackViewEntity;
                object = new WeakReference(object2);
                object3 = engineActivity.blurredImageView;
                object2 = new WeakReference(object3);
                quranEntity2.setViewWeakReference((WeakReference)object, (WeakReference)object2);
                f = quranEntity2.getFactorSize();
                object2 = engineActivity.blurredImageView;
                f4 = ((BlurredImageView)((Object)object2)).getmCanvas_width();
                quranEntity2.setupScaleSave(f, (int)f4);
                f6 = quranEntity.getClrAya();
                quranEntity2.setColor((int)f6);
                object = quranEntity.getPaintTranslationAya();
                if (object != null) {
                    f6 = quranEntity.getClrTrsl();
                } else {
                    f6 = -256;
                    f = 0.0f / 0.0f;
                }
                quranEntity2.setColorTranslation((int)f6);
                f6 = quranEntity.getmPreset();
                quranEntity2.initPreset((int)f6);
                object = engineActivity.trackViewEntity;
                object2 = quranEntity.getEntityQuran();
                object.stackSplit((Entity)object2);
                f6 = quranEntity.getEntityQuran().getIndex();
                f4 = f6 + true;
                f = engineActivity.trackViewEntity.getCurrentPosition();
                float f15 = Math.abs(f);
                float f16 = quranEntity.getEntityQuran().getRect().right;
                float f17 = quranEntity.getEntityQuran().getmScaleFactor();
                object = this;
                object3 = quranEntity2;
                object4 = quranEntity2;
                object = this.splitTimeLineQuran((int)f4, quranEntity2, f15, f16, f17);
                object2 = quranEntity.getEntityQuran().getTransition();
                if (object2 != null) {
                    object3 = ((Transition)object2).duplicate();
                    ((EntityQuranTimeline)object).setTransition((Transition)object3);
                    f9 = (float)((Transition)object2).isIn();
                    f15 = 0.0f;
                    if (f9 != false && (f9 = (float)((Transition)object2).isOut()) != false) {
                        object3 = ((EntityQuranTimeline)object).getTransition();
                        ((Transition)object3).setIn(false);
                        ((Transition)object2).setOut(false);
                    } else {
                        f9 = (float)((Transition)object2).isIn();
                        if (f9 != false) {
                            object2 = ((EntityQuranTimeline)object).getTransition();
                            ((Transition)object2).setIn(false);
                        } else {
                            f9 = (float)((Transition)object2).isOut();
                            if (f9 != false) {
                                ((Transition)object2).setOut(false);
                            }
                        }
                    }
                }
                quranEntity.getEntityQuran().setCurrentRect();
                object2 = quranEntity.getEntityQuran();
                object3 = engineActivity.trackViewEntity;
                f7 = Math.abs(((TrackEntityView)((Object)object3)).getCurrentPosition());
                ((EntityQuranTimeline)object2).setRight(f7);
                quranEntity.getEntityQuran().onChange();
                ((EntityView)object4).setEntityQuran((EntityQuranTimeline)object);
                ((Entity)object).setEntityView((EntityView)object4);
                object2 = quranEntity.getEntityQuran().getTransition();
                if (object2 != null) {
                    object2 = quranEntity.getEntityQuran().getTransition().duplicate();
                    ((EntityQuranTimeline)object).setTransition((Transition)object2);
                }
                object = engineActivity.blurredImageView;
                f4 = quranEntity.getIndex() + 1;
                ((BlurredImageView)((Object)object)).addEntity((QuranEntity)object4, (int)f4);
                object = engineActivity.trackViewEntity;
                object.invalidate();
            }
        }
    }

    private void splitEntity(TranslationQuranEntity object) {
        Object object2 = this.trackViewEntity;
        float f = Math.abs(((TrackEntityView)((Object)object2)).getXCursur());
        Object object3 = object.getEntityTrslTimeline().getRect();
        float f2 = ((RectF)object3).left;
        float f3 = f - f2;
        float f4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        if (f4 > 0) {
            object3 = object.getEntityTrslTimeline().getRect();
            f2 = ((RectF)object3).right;
            float f5 = f - f2;
            f4 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            if (f4 < 0) {
                object3 = this.trackViewEntity;
                f2 = ((TrackEntityView)((Object)object3)).getSecond_in_screen() * 0.2f;
                Object object4 = object.getEntityTrslTimeline().getRect();
                float f6 = ((RectF)object4).left;
                float f7 = f - f6;
                float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (f8 > 0) {
                    object4 = object.getEntityTrslTimeline().getRect();
                    f6 = ((RectF)object4).left + f2;
                    float f9 = f - f6;
                    f8 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                    if (f8 < 0) {
                        return;
                    }
                }
                object4 = object.getEntityTrslTimeline().getRect();
                f6 = ((RectF)object4).right;
                float f10 = f - f6;
                f8 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (f8 < 0) {
                    object4 = object.getEntityTrslTimeline().getRect();
                    f6 = ((RectF)object4).right - f2;
                    float f11 = f - f6;
                    float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (f12 > 0) {
                        return;
                    }
                }
                if ((object2 = object.getPaintAya().getTypeface()) == null) {
                    object2 = new StringBuilder("fonts/");
                    object3 = object.getNameFont();
                    object2 = ((StringBuilder)object2).append((String)object3).toString();
                    object2 = UtilsFileLast.loadFontFromAsset((Context)this, (String)object2);
                }
                TrackEntityView trackEntityView = object2;
                object4 = object.getTxt();
                Object object5 = object.getRect();
                int n = object.getNumber();
                int n2 = object.getClrAya();
                Object object6 = object.getNameFont();
                float f13 = object.getPaintAya().getTextSize();
                object3 = object2;
                object2 = new TranslationQuranEntity((String)object4, (RectF)object5, (Typeface)trackEntityView, n, n2, (String)object6, f13);
                f2 = object.getFactorSize();
                ((EntityView)object2).setFcSize(f2);
                f2 = object.getFactorSizeTrl();
                ((EntityView)object2).setFactorSizeTrl(f2);
                f2 = object.getFactor_scale();
                ((EntityView)object2).setFactor_scale(f2);
                f4 = this.blurredImageView.getmCanvas_width();
                f8 = this.blurredImageView.getmCanvas_height();
                ((EntityView)object2).setCanvasWH((int)f4, (int)f8);
                f4 = this.mTemplate.getIpad_type();
                ((TranslationQuranEntity)object2).setIpad_type((int)f4);
                object4 = this.trackViewEntity;
                object3 = new WeakReference(object4);
                object5 = this.blurredImageView;
                object4 = new WeakReference(object5);
                ((TranslationQuranEntity)object2).setViewWeakReference((WeakReference)object3, (WeakReference)object4);
                f2 = object.getPaintAya().getTextSize();
                f8 = object.getStaticLayout().getWidth();
                ((TranslationQuranEntity)object2).updatePaint(f2, (int)f8);
                f4 = object.getClrAya();
                ((TranslationQuranEntity)object2).setColor((int)f4);
                f4 = object.getmPreset();
                ((TranslationQuranEntity)object2).initPreset((int)f4);
                object3 = this.trackViewEntity;
                object4 = object.getEntityTrslTimeline();
                ((TrackEntityView)((Object)object3)).stackSplit((Entity)object4);
                f4 = object.getEntityTrslTimeline().getIndex();
                n2 = (int)(f4 + true);
                f2 = this.trackViewEntity.getCurrentPosition();
                f13 = Math.abs(f2);
                float f14 = object.getEntityTrslTimeline().getRect().right;
                float f15 = object.getEntityTrslTimeline().getmScaleFactor();
                object6 = object2;
                object3 = this.splitTimeLineQuran(n2, (TranslationQuranEntity)object2, f13, f14, f15);
                object4 = object.getEntityTrslTimeline().getTransition();
                if (object4 != null) {
                    object5 = ((Transition)object4).duplicate();
                    ((EntityTrslTimeline)object3).setTransition((Transition)object5);
                    boolean bl = ((Transition)object4).isIn();
                    trackEntityView = null;
                    if (bl && (bl = ((Transition)object4).isOut())) {
                        object5 = ((EntityTrslTimeline)object3).getTransition();
                        ((Transition)object5).setIn(false);
                        ((Transition)object4).setOut(false);
                    } else {
                        bl = ((Transition)object4).isIn();
                        if (bl) {
                            object4 = ((EntityTrslTimeline)object3).getTransition();
                            ((Transition)object4).setIn(false);
                        } else {
                            bl = ((Transition)object4).isOut();
                            if (bl) {
                                ((Transition)object4).setOut(false);
                            }
                        }
                    }
                }
                object.getEntityTrslTimeline().setCurrentRect();
                object4 = object.getEntityTrslTimeline();
                object5 = this.trackViewEntity;
                float f16 = Math.abs(((TrackEntityView)((Object)object5)).getCurrentPosition());
                ((EntityTrslTimeline)object4).setRight(f16);
                object.getEntityTrslTimeline().onChange();
                ((EntityView)object2).setEntityTrslTimeline((EntityTrslTimeline)object3);
                ((Entity)object3).setEntityView((EntityView)object2);
                object4 = object.getEntityTrslTimeline().getTransition();
                if (object4 != null) {
                    object4 = object.getEntityTrslTimeline().getTransition().duplicate();
                    ((EntityTrslTimeline)object3).setTransition((Transition)object4);
                }
                object3 = this.blurredImageView;
                int n3 = object.getIndex() + 1;
                ((BlurredImageView)((Object)object3)).addEntity((TranslationQuranEntity)object2, n3);
                object = this.trackViewEntity;
                object.invalidate();
            }
        }
    }

    private void toChoiceBgFromVideo(Uri uri) {
        Intent intent = new Intent((Context)this, ChoiceBgFromVideoActivity.class);
        intent.setData(uri);
        this.launchChoiceBgActivity.launch(intent);
    }

    private void toCrop() {
        int n;
        this.isSaveTmpTemplate = false;
        this.isToCrop = n = 1;
        Common.bitmap = this.blurredImageView.getBitmapOriginal();
        Common.rect = this.blurredImageView.getRectSquare();
        Bitmap bitmap = this.blurredImageView.getBitmapSquare();
        if (bitmap != null) {
            Common.MIN_SQUARE_W = this.blurredImageView.getBitmapSquare().getWidth();
            bitmap = this.blurredImageView.getBitmapSquare();
            Common.MIN_SQUARE_H = n = bitmap.getHeight();
        }
        Common.radius = this.blurredImageView.getRadius_square();
        bitmap = new Intent((Context)this, CropBitmapActivity.class);
        this.launchCropActivity.launch(bitmap);
    }

    private void toProVersion() {
        this.saveTemplate();
        Intent intent = new Intent((Context)this, ProVersionActivity.class);
        String string2 = this.mTemplate.getIdTemplate();
        intent.putExtra("template", string2);
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }

    private void updateBtnCutState() {
        try {
            this.checkSplitEntity();
            this.checkSplitTrslEntity();
            this.checkSplitAudio();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void updateBtnToEnd() {
        TrackEntityView trackEntityView;
        int n;
        TrackEntityView trackEntityView2 = this.trackViewEntity;
        int n2 = trackEntityView2.getCurrent_cursur_position();
        if (n2 == (n = (trackEntityView = this.trackViewEntity).getMaxTime())) {
            trackEntityView2 = this.btnToEnd;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            trackEntityView2.setColorFilter(-8355712, mode);
            trackEntityView2 = this.btnToEnd;
            n = 0;
            trackEntityView = null;
            trackEntityView2.setClickable(false);
        } else {
            trackEntityView2 = this.btnToEnd;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            trackEntityView2.setColorFilter(-1, mode);
            trackEntityView2 = this.btnToEnd;
            n = 1;
            trackEntityView2.setClickable(n != 0);
        }
    }

    private void updateBtnToEndAndStart() {
        ImageButton imageButton = this.btnToStart;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int n = -1;
        imageButton.setColorFilter(n, mode);
        imageButton = this.btnToStart;
        boolean bl = true;
        imageButton.setClickable(bl);
        imageButton = this.btnToEnd;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(n, mode2);
        this.btnToEnd.setClickable(bl);
    }

    private void updateBtnToStart() {
        TrackEntityView trackEntityView = this.trackViewEntity;
        int n = trackEntityView.getCurrent_cursur_position();
        if (n == 0) {
            trackEntityView = this.btnToStart;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            trackEntityView.setColorFilter(-8355712, mode);
            trackEntityView = this.btnToStart;
            boolean bl = false;
            trackEntityView.setClickable(false);
        } else {
            trackEntityView = this.btnToStart;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            trackEntityView.setColorFilter(-1, mode);
            trackEntityView = this.btnToStart;
            boolean bl = true;
            trackEntityView.setClickable(bl);
        }
    }

    private void updateBtnToStart(int n) {
        if (n == 0) {
            ImageButton imageButton = this.btnToStart;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageButton.setColorFilter(-8355712, mode);
            imageButton = this.btnToStart;
            boolean bl = false;
            imageButton.setClickable(false);
        } else {
            ImageButton imageButton = this.btnToStart;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageButton.setColorFilter(-1, mode);
            imageButton = this.btnToStart;
            boolean bl = true;
            imageButton.setClickable(bl);
        }
    }

    private void updateFrame() {
        Object object;
        int n;
        int n2;
        Object object2 = this.mTemplate;
        if (object2 != null && (n2 = ((Template)object2).isVideoSquare()) != 0 && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = ((Enum)(object = IpadType.RECT)).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = ((Enum)(object = IpadType.ROUND_RECT)).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = ((Enum)(object = IpadType.CASSET_IMG_BLUR)).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = ((Enum)(object = IpadType.CASSET)).ordinal()) && (n2 = (int)(this.mIsPlaying ? 1 : 0)) == 0) {
            object2 = this.trackViewEntity;
            float f = (float)((TrackEntityView)((Object)object2)).getCurrent_cursur_position() / 1000.0f * 25.0f;
            n2 = Math.round(f);
            n = 1;
            n2 = Math.max(n, n2);
            Object object3 = this.trackViewEntity;
            int n3 = ((TrackEntityView)((Object)object3)).getDuration() * 25;
            Object object4 = this.mTemplate;
            int n4 = ((Template)object4).getDuration_video_media() * 25;
            n3 = Math.min(n4, n3);
            if (n2 > n3) {
                n2 = (n2 + -1) % n3 + n;
            }
            n3 = 10;
            object4 = ".jpg";
            if (n2 < n3) {
                String string2 = "frame_000";
                object3 = new StringBuilder(string2);
                object2 = ((StringBuilder)object3).append(n2).append((String)object4).toString();
            } else {
                n3 = 100;
                if (n2 < n3) {
                    String string3 = "frame_00";
                    object3 = new StringBuilder(string3);
                    object2 = ((StringBuilder)object3).append(n2).append((String)object4).toString();
                } else {
                    n3 = 1000;
                    if (n2 < n3) {
                        String string4 = "frame_0";
                        object3 = new StringBuilder(string4);
                        object2 = ((StringBuilder)object3).append(n2).append((String)object4).toString();
                    } else {
                        String string5 = "frame_";
                        object3 = new StringBuilder(string5);
                        object2 = ((StringBuilder)object3).append(n2).append((String)object4).toString();
                    }
                }
            }
            this.isOnScroll = n;
            object3 = new StringBuilder();
            object4 = this.mTemplate.getFolder_template();
            object3 = ((StringBuilder)object3).append((String)object4);
            object4 = "/VideoFrame";
            object3 = ((StringBuilder)object3).append((String)object4).toString();
            object = new File((String)object3, (String)object2);
            object2 = ((File)object).getAbsolutePath();
            this.updateSquareBitmap((String)object2);
        }
    }

    private void updateProgress(int n, int n2) {
        EngineActivity$42 engineActivity$42 = new EngineActivity$42(this, n, n2);
        this.runOnUiThread(engineActivity$42);
    }

    private void updateSquareBitmap(String string2) {
        boolean bl = this.isOnScroll;
        if (bl ? (bl = this.mIsPlaying) : !(bl = this.mIsPlaying)) {
            return;
        }
        Executor executor = this.executor;
        EngineActivity$90 engineActivity$90 = new EngineActivity$90(this, string2);
        executor.execute(engineActivity$90);
    }

    private void updateTime() {
        this.trackViewEntity.calculMaxTime();
        int n = this.trackViewEntity.getMaxTime();
        int n2 = this.trackViewEntity.getCurrent_cursur_position();
        this.updateViewTime(n, n2);
        TrackEntityView trackEntityView = this.trackViewEntity;
        n = trackEntityView.getCurrent_cursur_position();
        View.OnTouchListener onTouchListener = this.trackViewEntity;
        n2 = onTouchListener.getMaxTime();
        if (n <= n2) {
            trackEntityView = this.trackViewEntity;
            n = trackEntityView.getCurrent_cursur_position();
            float f = n;
            float f2 = this.trackViewEntity.getMaxTime();
            f /= f2;
            n2 = this.trackViewEntity.getCurrent_cursur_position();
            long l = n2;
            this.updateTime(l);
            onTouchListener = this.trackViewEntity;
            int n3 = onTouchListener.getCurrent_cursur_position();
            onTouchListener.setCurrent_cursur_position(n3);
            onTouchListener = this.blurredImageView;
            onTouchListener.setProgress(f);
        }
    }

    private void updateTime(long l) {
        Object object = this.timeFormatter;
        if (object == null) {
            TrackEntityView trackEntityView = this.trackViewEntity;
            int n = trackEntityView.getMaxTime();
            long l2 = n;
            object = new TimeFormatter(l2);
            this.timeFormatter = object;
        } else {
            TrackEntityView trackEntityView = this.trackViewEntity;
            int n = trackEntityView.getMaxTime();
            long l3 = n;
            ((TimeFormatter)object).setTotalDurationMs(l3);
        }
        Object object2 = this.timeFormatter.formatTime(l);
        BlurredImageView blurredImageView = this.blurredImageView;
        object = (String)object2.first;
        object2 = (String)object2.second;
        blurredImageView.setCurrentTime((String)object, (String)object2);
    }

    private void updateTimeToEndAya() {
        this.trackViewEntity.calculMaxTime();
        this.trackViewEntity.translateToEnd();
        int n = this.trackViewEntity.getMaxTime();
        int n2 = this.trackViewEntity.getCurrent_cursur_position();
        this.updateViewTime(n, n2);
        TrackEntityView trackEntityView = this.trackViewEntity;
        n = trackEntityView.getCurrent_cursur_position();
        View.OnTouchListener onTouchListener = this.trackViewEntity;
        n2 = onTouchListener.getMaxTime();
        if (n <= n2) {
            trackEntityView = this.trackViewEntity;
            n = trackEntityView.getCurrent_cursur_position();
            float f = n;
            float f2 = this.trackViewEntity.getMaxTime();
            f /= f2;
            n2 = this.trackViewEntity.getCurrent_cursur_position();
            long l = n2;
            this.updateTime(l);
            onTouchListener = this.trackViewEntity;
            int n3 = onTouchListener.getCurrent_cursur_position();
            onTouchListener.setCurrent_cursur_position(n3);
            onTouchListener = this.blurredImageView;
            onTouchListener.setProgress(f);
        }
    }

    private void videoChooser() {
        ActivityResultLauncher activityResultLauncher = this.launchVideo;
        Intent intent = new Intent((Context)this, GalleryPickerVideo.class);
        activityResultLauncher.launch(intent);
    }

    private void videoChooserForAudio() {
        this.isToCrop = true;
        ActivityResultLauncher activityResultLauncher = this.launchVideoExtract;
        Intent intent = new Intent((Context)this, GalleryPickerVideo.class);
        activityResultLauncher.launch(intent);
    }

    public EntityBismilahTimeline addTimeLineBismilah(BismilahEntity bismilahEntity) {
        float f;
        EntityBismilahTimeline entityBismilahTimeline = this.trackViewEntity.getmIsi3adaTimeline();
        if (entityBismilahTimeline != null) {
            entityBismilahTimeline = this.trackViewEntity.getmIsi3adaTimeline().getRect();
            f = ((RectF)entityBismilahTimeline).right;
        } else {
            f = 0.0f;
            entityBismilahTimeline = null;
        }
        float f2 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f3 = this.trackViewEntity.getSecond_in_screen() * 4.0f;
        float f4 = f + f3;
        float f5 = this.trackViewEntity.getSecond_in_screen();
        entityBismilahTimeline = new EntityBismilahTimeline(bismilahEntity, f, 0.0f, f2, f4, f5);
        this.trackViewEntity.setBismilahTimeline(entityBismilahTimeline);
        return entityBismilahTimeline;
    }

    public EntityBismilahTimeline addTimeLineBismilah(BismilahEntity bismilahEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityBismilahTimeline entityBismilahTimeline = new EntityBismilahTimeline(bismilahEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.setBismilahTimeline(entityBismilahTimeline);
        return entityBismilahTimeline;
    }

    public EntityBismilahTimeline addTimeLineIsti3ada(BismilahEntity bismilahEntity) {
        float f = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f2 = this.trackViewEntity.getSecond_in_screen() * 4.0f + 0.0f;
        float f3 = this.trackViewEntity.getSecond_in_screen();
        EntityBismilahTimeline entityBismilahTimeline = new EntityBismilahTimeline(bismilahEntity, 0.0f, 0.0f, f, f2, f3);
        this.trackViewEntity.setmIsi3adaTimeline(entityBismilahTimeline);
        return entityBismilahTimeline;
    }

    public EntityBismilahTimeline addTimeLineIsti3ada(BismilahEntity bismilahEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityBismilahTimeline entityBismilahTimeline = new EntityBismilahTimeline(bismilahEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.setmIsi3adaTimeline(entityBismilahTimeline);
        return entityBismilahTimeline;
    }

    public EntityQuranTimeline addTimeLineQuran(int n, QuranEntity quranEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityQuranTimeline entityQuranTimeline = new EntityQuranTimeline(quranEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.addQuran(entityQuranTimeline, n);
        return entityQuranTimeline;
    }

    public EntityQuranTimeline addTimeLineQuran(QuranEntity quranEntity) {
        float f;
        Object object;
        boolean bl;
        Object object2 = this.trackViewEntity;
        float f2 = object2.getXCursur();
        Object object3 = this.trackViewEntity.getQuran();
        if (object3 != null) {
            object2 = object3.getRect();
            f2 = ((RectF)object2).right;
        }
        if (bl = ((TrackEntityView)((Object)(object3 = this.trackViewEntity))).isExist((EntityBismilahTimeline)(object = ((TrackEntityView)((Object)object3)).getBismilahTimeline()))) {
            object3 = this.trackViewEntity.getBismilahTimeline().getRect();
            f = ((RectF)object3).right;
            f2 = Math.max(f2, f);
        }
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        f = this.trackViewEntity.getSecond_in_screen() * 4.0f;
        float f4 = f2 + f;
        float f5 = this.trackViewEntity.getSecond_in_screen();
        object3 = object2;
        object = quranEntity;
        object2 = new EntityQuranTimeline(quranEntity, f2, 0.0f, f3, f4, f5);
        this.trackViewEntity.addQuran((EntityQuranTimeline)object2);
        return object2;
    }

    public EntityQuranTimeline addTimeLineQuran(QuranEntity quranEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityQuranTimeline entityQuranTimeline = new EntityQuranTimeline(quranEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.addQuran(entityQuranTimeline);
        return entityQuranTimeline;
    }

    public EntityTrslTimeline addTimeLineQuran(int n, TranslationQuranEntity translationQuranEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityTrslTimeline entityTrslTimeline = new EntityTrslTimeline(translationQuranEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.addTrslQuran(entityTrslTimeline, n);
        return entityTrslTimeline;
    }

    public EntityTrslTimeline addTimeLineQuran(TranslationQuranEntity translationQuranEntity, float f, float f2) {
        float f3 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        EntityTrslTimeline entityTrslTimeline = new EntityTrslTimeline(translationQuranEntity, f, 0.0f, f3, f2, f4);
        this.trackViewEntity.addTrslQuran(entityTrslTimeline);
        return entityTrslTimeline;
    }

    public EntityTrslTimeline addTimeLineTrslQuran(TranslationQuranEntity translationQuranEntity) {
        EntityTrslTimeline entityTrslTimeline;
        Object object = this.trackViewEntity;
        float f = ((TrackEntityView)((Object)object)).getXCursur();
        EntityTrslTimeline entityTrslTimeline2 = this.trackViewEntity.getTrslQuran();
        if (entityTrslTimeline2 != null) {
            object = entityTrslTimeline2.getRect();
            f = ((RectF)object).right;
        }
        object = this.trackViewEntity.getQuran();
        float f2 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f3 = ((EntityQuranTimeline)object).getRect().right;
        float f4 = this.trackViewEntity.getSecond_in_screen();
        entityTrslTimeline2 = entityTrslTimeline;
        entityTrslTimeline = new EntityTrslTimeline(translationQuranEntity, f, 0.0f, f2, f3, f4);
        this.trackViewEntity.addTrslQuran(entityTrslTimeline);
        return entityTrslTimeline;
    }

    public void applyffect(String object, EntityAudio entityAudio) {
        String string2;
        this.showProgressSimple();
        String string3 = this.mTemplate.getFolder_template();
        Object object2 = new StringBuilder();
        long l = System.currentTimeMillis();
        object2 = ((StringBuilder)object2).append(l).append("_audio_echo.mp3").toString();
        File file = new File(string3, (String)object2);
        string3 = Uri.fromFile((File)file);
        object2 = this.id_ffmpeg;
        String string4 = entityAudio.getPath_ffmpeg();
        String[] stringArray = new String[]{"-i", string4, "-af", object, "-y", string2 = file.getAbsolutePath()};
        object = new EngineActivity$59(this, (Uri)string3, entityAudio, file);
        object = FFmpegKit.executeWithArgumentsAsync(stringArray, (FFmpegSessionCompleteCallback)object).getSessionId();
        object2.add(object);
    }

    public void applyffectAll(EffectAudio object, int n) {
        Object object2 = this.trackViewEntity.getEntityListAudio();
        int n2 = object2.size();
        if (n >= n2) {
            object = new EngineActivity$56(this);
            this.runOnUiThread((Runnable)object);
            return;
        }
        object2 = this.trackViewEntity;
        Object object3 = ((TrackEntityView)((Object)object2)).getEntityAudioNotDeleted(n);
        if (object3 == null) {
            object = new EngineActivity$57(this);
            this.runOnUiThread((Runnable)object);
            return;
        }
        Object object4 = object2 = object3.second;
        object4 = (EntityAudio)object2;
        int n3 = (Integer)object3.first;
        float f = ((EntityAudio)object4).getEffectAudio().getStart();
        float f2 = 1000.0f;
        float f3 = ((EntityAudio)object4).getEffectAudio().getEnd() / f2;
        object3 = this.createCmd((EffectAudio)object, f /= f2, f3);
        object2 = this.mTemplate.getFolder_template();
        CharSequence charSequence = new StringBuilder();
        long l = System.currentTimeMillis();
        charSequence = charSequence.append(l).append("_audio_echo.mp3").toString();
        File file = new File((String)object2, (String)charSequence);
        Uri uri = Uri.fromFile((File)file);
        object2 = this.id_ffmpeg;
        String[] stringArray = new String[6];
        stringArray[0] = "-i";
        Object object5 = ((EntityAudio)object4).getPath_ffmpeg();
        stringArray[1] = object5;
        stringArray[2] = "-af";
        stringArray[3] = object3;
        stringArray[4] = "-y";
        charSequence = file.getAbsolutePath();
        stringArray[5] = charSequence;
        charSequence = object3;
        object5 = this;
        object3 = new EngineActivity$58(this, uri, (EntityAudio)object4, n3, (EffectAudio)object, file);
        object = FFmpegKit.executeWithArgumentsAsync(stringArray, (FFmpegSessionCompleteCallback)object3).getSessionId();
        object2.add(object);
    }

    public void applyffectPlayAuto(String object, EntityAudio entityAudio) {
        String string2;
        this.showProgressSimple();
        String string3 = this.mTemplate.getFolder_template();
        Object object2 = new StringBuilder();
        long l = System.currentTimeMillis();
        object2 = ((StringBuilder)object2).append(l).append("_audio_echo.mp3").toString();
        File file = new File(string3, (String)object2);
        string3 = Uri.fromFile((File)file);
        object2 = this.id_ffmpeg;
        String string4 = entityAudio.getPath_ffmpeg();
        String[] stringArray = new String[]{"-i", string4, "-af", object, "-y", string2 = file.getAbsolutePath()};
        object = new EngineActivity$101(this, (Uri)string3, entityAudio, file);
        object = FFmpegKit.executeWithArgumentsAsync(stringArray, (FFmpegSessionCompleteCallback)object).getSessionId();
        object2.add(object);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void checkSplitAudio() {
        boolean bl;
        Object object = EditMediaFragment.instance;
        if (object != null && (bl = (object = this.trackViewEntity.getSelectedEntity()) instanceof EntityAudio)) {
            object = this.trackViewEntity;
            float f = -((TrackEntityView)((Object)object)).getCurrentPosition();
            EntityAudio entityAudio = (EntityAudio)this.trackViewEntity.getSelectedEntity();
            EditMediaFragment editMediaFragment = EditMediaFragment.instance;
            editMediaFragment.checkSplit(entityAudio, f);
        }
    }

    public void checkSplitEntity() {
        Object object = EditEntityFragment.instance;
        if (object != null && (object = this.trackViewEntity.getSelectedEntity()) != null) {
            object = this.trackViewEntity;
            float f = -((TrackEntityView)((Object)object)).getCurrentPosition();
            EditEntityFragment editEntityFragment = EditEntityFragment.instance;
            Entity entity = this.trackViewEntity.getSelectedEntity();
            editEntityFragment.checkSplitEntity(entity, f);
        }
    }

    public void checkSplitTrslEntity() {
        Object object = EditTrslEntityFragment.instance;
        if (object != null && (object = this.trackViewEntity.getSelectedEntity()) != null) {
            object = this.trackViewEntity;
            float f = -((TrackEntityView)((Object)object)).getCurrentPosition();
            EditTrslEntityFragment editTrslEntityFragment = EditTrslEntityFragment.instance;
            Entity entity = this.trackViewEntity.getSelectedEntity();
            editTrslEntityFragment.checkSplitEntity(entity, f);
        }
    }

    public void dialog() {
        Object object = null;
        this.isSaveTmpTemplate = false;
        this.pausePlayer();
        Object object2 = new Dialog((Context)this);
        this.dialog = object2;
        int n = 1;
        object2.setCancelable(n != 0);
        object2 = this.dialog;
        object2.requestWindowFeature(n);
        object2 = this.dialog;
        object2 = object2.getWindow();
        n = -1;
        int n2 = -2;
        object2.setLayout(n, n2);
        object2 = this.dialog;
        object2 = object2.getWindow();
        Object object3 = new ColorDrawable(0);
        object2.setBackgroundDrawable((Drawable)object3);
        object = LayoutInflater.from((Context)this);
        int n3 = R$layout.layout_dialog;
        n = 0;
        object3 = null;
        object = object.inflate(n3, null);
        object2 = this.dialog;
        object2.setContentView((View)object);
        n3 = R$id.dialog_title;
        object2 = object.findViewById(n3);
        object2 = (TextCustumFont)object2;
        object3 = this.mResources;
        n2 = R$string.exit;
        object3 = object3.getString(n2);
        object2.setText((CharSequence)object3);
        n3 = R$id.dialog_message;
        object2 = object.findViewById(n3);
        object2 = (TextCustumFont)object2;
        object3 = this.mResources;
        n2 = R$string.are_you_sure_want_to_leave_this_work;
        object3 = object3.getString(n2);
        object2.setText((CharSequence)object3);
        n3 = R$id.dialog_no;
        object2 = object.findViewById(n3);
        object2 = (ButtonCustumFont)object2;
        object3 = this.mResources;
        n2 = R$string.leave;
        object3 = object3.getString(n2);
        object2.setText((CharSequence)object3);
        object3 = new EngineActivity$2(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n3 = R$id.dialog_yes;
        object = object.findViewById(n3);
        object = (ButtonCustumFont)object;
        object2 = this.mResources;
        n = R$string.Continue;
        object2 = object2.getString(n);
        object.setText((CharSequence)object2);
        object2 = new EngineActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.dialog;
        try {
            object.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dialogCopyRight() {
        try {
            Object object = new Dialog((Context)this);
            this.dialog = object;
            int n = 0;
            Object var3_4 = null;
            object.setCancelable(false);
            object = this.dialog;
            int n2 = 1;
            object.requestWindowFeature(n2);
            object = this.dialog;
            object = object.getWindow();
            n2 = -1;
            int n3 = -2;
            object.setLayout(n2, n3);
            object = this.dialog;
            object = object.getWindow();
            ColorDrawable colorDrawable = new ColorDrawable(0);
            object.setBackgroundDrawable((Drawable)colorDrawable);
            object = LayoutInflater.from((Context)this);
            n = R$layout.layout_dialog_copyright;
            n2 = 0;
            Object var6_11 = null;
            object = object.inflate(n, null);
            Dialog dialog = this.dialog;
            dialog.setContentView((View)object);
            n = R$id.dialog_title;
            View view = object.findViewById(n);
            TextCustumFontBold textCustumFontBold = (TextCustumFontBold)view;
            n2 = R$id.tv_msj;
            View view2 = object.findViewById(n2);
            TextCustumFont textCustumFont = (TextCustumFont)view2;
            n3 = R$id.dialog_no;
            object = object.findViewById(n3);
            Object object2 = new EngineActivity$67(this);
            object.setOnClickListener((View.OnClickListener)object2);
            object = LocaleHelper.getLanguage((Context)this);
            object2 = "ar";
            boolean bl = ((String)object).equals(object2);
            if (bl) {
                object = "\u062a\u0646\u0628\u064a\u0647 \u062d\u0642\u0648\u0642 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u26a0\ufe0f";
                textCustumFontBold.setText((CharSequence)object);
                object = "\u0628\u0639\u0636 \u062a\u0633\u062c\u064a\u0644\u0627\u062a \u062a\u0644\u0627\u0648\u0627\u062a \u0627\u0644\u0642\u0631\u0651\u0627\u0621 \u0645\u062d\u0645\u064a\u0629 \u0628\u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631\u060c \u0648\u0647\u064a \u0645\u062e\u0635\u0651\u0635\u0629 \u0644\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u0634\u062e\u0635\u064a \u0641\u0642\u0637.\n\n\u0642\u062f \u062a\u0633\u0645\u062d \u0628\u0639\u0636 \u0627\u0644\u0645\u0646\u0635\u0627\u062a \u0628\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0647\u0630\u0647 \u0627\u0644\u0623\u0635\u0648\u0627\u062a \u062f\u0648\u0646 \u0645\u0634\u0627\u0643\u0644\u060c \u0644\u0643\u0646 \u0630\u0644\u0643 \u0644\u0627 \u064a\u064f\u0639\u062f\u0651 \u062a\u0635\u0631\u064a\u062d\u064b\u0627 \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u062a\u062c\u0627\u0631\u064a.\n\n\u0644\u0644\u0646\u0634\u0631 \u0627\u0644\u0622\u0645\u0646\u060c \u064a\u064f\u0631\u062c\u0649 \u0627\u062e\u062a\u064a\u0627\u0631 \u0642\u0627\u0631\u0626 \u0645\u0630\u0643\u0648\u0631 \u0639\u0644\u0649 \u0623\u0646\u0647 \u0645\u0633\u0645\u0648\u062d \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0635\u0648\u062a\u0643 \u0627\u0644\u062e\u0627\u0635.\n\n\u0627\u0644\u0645\u0633\u062a\u062e\u062f\u0645 \u0645\u0633\u0624\u0648\u0644 \u0628\u0627\u0644\u0643\u0627\u0645\u0644 \u0639\u0646 \u0627\u0644\u0627\u0644\u062a\u0632\u0627\u0645 \u0628\u0633\u064a\u0627\u0633\u0627\u062a \u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631 \u0627\u0644\u062e\u0627\u0635\u0629 \u0628\u0643\u0644 \u0645\u0646\u0635\u0629.";
                textCustumFont.setText((CharSequence)object);
            } else {
                object = "\u26a0\ufe0f Copyright Notice";
                textCustumFontBold.setText((CharSequence)object);
                object = "Some reciters\u2019 audio recordings are protected by copyright and are intended for personal use only.\n\nCertain platforms may allow these sounds without issues, but this does not constitute permission to publish or use them commercially.\n\nFor safe publishing, please select a reciter marked as allowed for publishing or use your own audio.\n\nThe user is solely responsible for complying with the copyright policies of each platform.";
                textCustumFont.setText((CharSequence)object);
            }
            object = this.dialog;
            object.show();
            MyPrefereces.putVuCopyRight((Context)this);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void dialogDeleteSelected() {
        Object object = new Dialog((Context)this);
        this.dialog = object;
        int n = 1;
        object.setCancelable(n != 0);
        object = this.dialog;
        object.requestWindowFeature(n);
        object = this.dialog;
        object = object.getWindow();
        n = -1;
        int n2 = -2;
        object.setLayout(n, n2);
        object = this.dialog;
        object = object.getWindow();
        n2 = 0;
        Object object2 = null;
        Object object3 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object3);
        object = LayoutInflater.from((Context)this);
        n = R$layout.layout_dialog;
        n2 = 0;
        object2 = null;
        object = object.inflate(n, null);
        object3 = this.dialog;
        object3.setContentView((View)object);
        n = R$id.dialog_title;
        object3 = object.findViewById(n);
        n2 = 8;
        object3.setVisibility(n2);
        n = R$id.dialog_message;
        object3 = object.findViewById(n);
        object3 = (TextCustumFont)object3;
        object2 = this.mResources;
        int n3 = R$string.are_you_sure_to_delete_this_work;
        object2 = object2.getString(n3);
        object3.setText((CharSequence)object2);
        n = R$id.dialog_no;
        object3 = object.findViewById(n);
        object3 = (ButtonCustumFont)object3;
        object2 = this.mResources;
        n3 = R$string.delete;
        object2 = object2.getString(n3);
        object3.setText((CharSequence)object2);
        n2 = -1499549;
        object3.setTextColor(n2);
        n2 = R$drawable.btn_dialog_delete;
        ((AppCompatButton)object3).setBackgroundResource(n2);
        object2 = new EngineActivity$98(this, (ButtonCustumFont)object3);
        object3.setOnClickListener((View.OnClickListener)object2);
        n = R$id.dialog_yes;
        object = object.findViewById(n);
        object = (ButtonCustumFont)object;
        object3 = this.mResources;
        n2 = R$string.no;
        object3 = object3.getString(n2);
        object.setText((CharSequence)object3);
        object3 = new EngineActivity$99(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.dialog;
        try {
            object.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void dialogNoInternet(Uri uri) {
        Object object = new Dialog((Context)this);
        this.dialogInternet = object;
        int n = 0;
        Object object2 = null;
        object.setCancelable(false);
        object = this.dialogInternet;
        int n2 = 1;
        object.requestWindowFeature(n2);
        object = this.dialogInternet;
        object = object.getWindow();
        n2 = -1;
        int n3 = -2;
        object.setLayout(n2, n3);
        object = this.dialogInternet;
        object = object.getWindow();
        Object object3 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object3);
        object = LayoutInflater.from((Context)this);
        n = R$layout.layout_dialog;
        n2 = 0;
        object3 = null;
        object = object.inflate(n, null);
        object2 = this.dialogInternet;
        object2.setContentView((View)object);
        n = R$id.dialog_title;
        object2 = object.findViewById(n);
        object2 = (TextCustumFont)object2;
        object3 = this.mResources;
        n3 = R$string.no_connection;
        object3 = object3.getString(n3);
        object2.setText((CharSequence)object3);
        n = R$id.dialog_message;
        object2 = object.findViewById(n);
        object2 = (TextCustumFont)object2;
        object3 = this.mResources;
        n3 = R$string.msj_connection_on;
        object3 = object3.getString(n3);
        object2.setText((CharSequence)object3);
        n = R$id.dialog_no;
        object2 = object.findViewById(n);
        object2 = (ButtonCustumFont)object2;
        object3 = this.mResources;
        n3 = R$string.ignore;
        object3 = object3.getString(n3);
        object2.setText((CharSequence)object3);
        object3 = new EngineActivity$4(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        n = R$id.dialog_yes;
        object = object.findViewById(n);
        object = (ButtonCustumFont)object;
        object2 = this.mResources;
        n2 = R$string.retry;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object2 = new EngineActivity$5(this, uri);
        object.setOnClickListener((View.OnClickListener)object2);
        uri = this.dialogInternet;
        try {
            uri.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void dialogNoInternetList(List list) {
        Object object;
        this.dialogInternet = object = new Dialog((Context)this);
        object.setCancelable(false);
        this.dialogInternet.requestWindowFeature(1);
        this.dialogInternet.getWindow().setLayout(-1, -2);
        object = this.dialogInternet.getWindow();
        Object object2 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object2);
        object = LayoutInflater.from((Context)this);
        int n = R$layout.layout_dialog;
        object = object.inflate(n, null);
        this.dialogInternet.setContentView((View)object);
        n = R$id.dialog_title;
        Object object3 = (TextCustumFont)object.findViewById(n);
        object2 = this.mResources;
        int n2 = R$string.no_connection;
        object2 = object2.getString(n2);
        object3.setText((CharSequence)object2);
        n = R$id.dialog_message;
        object3 = (TextCustumFont)object.findViewById(n);
        object2 = this.mResources;
        n2 = R$string.msj_connection_on;
        object2 = object2.getString(n2);
        object3.setText((CharSequence)object2);
        n = R$id.dialog_no;
        object3 = (ButtonCustumFont)object.findViewById(n);
        object2 = this.mResources;
        n2 = R$string.ignore;
        object2 = object2.getString(n2);
        object3.setText((CharSequence)object2);
        object2 = new EngineActivity$6(this);
        object3.setOnClickListener((View.OnClickListener)object2);
        n = R$id.dialog_yes;
        object = (ButtonCustumFont)object.findViewById(n);
        object3 = this.mResources;
        int n3 = R$string.retry;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object3 = new EngineActivity$7(this, list);
        object.setOnClickListener((View.OnClickListener)object3);
        this.dialogInternet.show();
    }

    public void dialogPremium(int n) {
        Object object;
        block46: {
            object = this.dialog;
            if (object == null) break block46;
            this.cancelDialog();
        }
        n = 0;
        object = null;
        this.isSaveTmpTemplate = false;
        Object object2 = new Dialog((Context)this);
        this.dialog = object2;
        int n2 = 1;
        object2.setCancelable(n2 != 0);
        object2 = this.dialog;
        object2.requestWindowFeature(n2);
        object2 = this.dialog;
        object2 = object2.getWindow();
        n2 = -1;
        int n3 = -2;
        object2.setLayout(n2, n3);
        object2 = this.dialog;
        object2 = object2.getWindow();
        Object object3 = new ColorDrawable(0);
        object2.setBackgroundDrawable((Drawable)object3);
        object2 = LayoutInflater.from((Context)this);
        n2 = R$layout.layout_dialog;
        n3 = 0;
        object2 = object2.inflate(n2, null);
        object3 = this.dialog;
        object3.setContentView((View)object2);
        n2 = R$id.dialog_title;
        object3 = object2.findViewById(n2);
        n3 = 8;
        object3.setVisibility(n3);
        n2 = R$id.img_pro;
        object3 = object2.findViewById(n2);
        object3.setVisibility(0);
        n = R$id.dialog_message;
        object = object2.findViewById(n);
        object = (TextCustumFont)object;
        object3 = this.mResources;
        n3 = R$string.unlock_premium;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        n2 = 17;
        object.setGravity(n2);
        n = R$id.dialog_no;
        object = object2.findViewById(n);
        object = (ButtonCustumFont)object;
        object3 = this.mResources;
        n3 = R$string.no;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object3 = new EngineActivity$75(this);
        object.setOnClickListener((View.OnClickListener)object3);
        n = R$id.dialog_yes;
        object = object2.findViewById(n);
        object = (ButtonCustumFont)object;
        object2 = this.mResources;
        n2 = R$string.yes;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object2 = new EngineActivity$76(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.dialog;
        try {
            object.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dialogPremiumIpad() {
        boolean bl = false;
        Object object = null;
        this.isSaveTmpTemplate = false;
        try {
            Dialog dialog;
            this.dialog = dialog = new Dialog((Context)this);
            int n = 1;
            dialog.setCancelable(n != 0);
            Dialog dialog2 = this.dialog;
            dialog2.requestWindowFeature(n);
            Dialog dialog3 = this.dialog;
            Window window = dialog3.getWindow();
            n = -1;
            int n2 = -2;
            window.setLayout(n, n2);
            Dialog dialog4 = this.dialog;
            Window window2 = dialog4.getWindow();
            ColorDrawable colorDrawable = new ColorDrawable(0);
            window2.setBackgroundDrawable((Drawable)colorDrawable);
            object = LayoutInflater.from((Context)this);
            int n3 = R$layout.layout_dialog_premuim;
            n = 0;
            Object var6_17 = null;
            object = object.inflate(n3, null);
            Dialog dialog5 = this.dialog;
            dialog5.setContentView((View)object);
            n3 = R$id.dialog_title;
            View view = object.findViewById(n3);
            n = 8;
            view.setVisibility(n);
            n3 = R$id.dialog_message;
            View view2 = object.findViewById(n3);
            TextCustumFont textCustumFont = (TextCustumFont)view2;
            n = R$id.tv_subscribe;
            View view3 = object.findViewById(n);
            TextCustumFont textCustumFont2 = (TextCustumFont)view3;
            n2 = R$id.dialog_no;
            View view4 = object.findViewById(n2);
            EngineActivity$81 engineActivity$81 = new EngineActivity$81(this);
            view4.setOnClickListener((View.OnClickListener)engineActivity$81);
            n2 = R$id.dialog_yes;
            object = object.findViewById(n2);
            object = (RelativeLayout)object;
            n2 = R$drawable.btn_dialog_premium_state;
            object.setBackgroundResource(n2);
            EngineActivity$82 engineActivity$82 = new EngineActivity$82(this);
            object.setOnClickListener((View.OnClickListener)engineActivity$82);
            object = LocaleHelper.getLanguage((Context)this);
            String string2 = "ar";
            bl = ((String)object).equals(string2);
            if (bl) {
                object = "\ud83c\udf81 \u0647\u0630\u0647 \u0627\u0644\u0645\u064a\u0632\u0629 \u0641\u0642\u0637 \u0644\u0644\u0645\u0634\u062a\u0631\u0643\u064a\u0646 \u0641\u064a \u0627\u0644\u062a\u0637\u0628\u064a\u0642.";
                textCustumFont.setText((CharSequence)object);
                object = "\u0627\u0644\u0646\u0633\u062e\u0629 \u0627\u0644\u0645\u062f\u0641\u0648\u0639\u0629";
                textCustumFont2.setText((CharSequence)object);
            } else {
                object = "\ud83c\udf81 This feature is only for app subscribers.";
                textCustumFont.setText((CharSequence)object);
                object = "Upgrade premium";
                textCustumFont2.setText((CharSequence)object);
            }
            object = this.dialog;
            object.show();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void dialogWatermark() {
        Object object;
        block47: {
            object = this.dialog;
            if (object == null) break block47;
            this.cancelDialog();
        }
        int n = 0;
        object = null;
        this.isSaveTmpTemplate = false;
        int n2 = 1;
        this.isToCrop = n2;
        Object object2 = new Dialog((Context)this);
        this.dialog = object2;
        object2.setCancelable(n2 != 0);
        object2 = this.dialog;
        object2.requestWindowFeature(n2);
        Object object3 = this.dialog;
        object3 = object3.getWindow();
        int n3 = -1;
        int n4 = -2;
        object3.setLayout(n3, n4);
        object3 = this.dialog;
        object3 = object3.getWindow();
        object2 = new ColorDrawable(0);
        object3.setBackgroundDrawable((Drawable)object2);
        object3 = LayoutInflater.from((Context)this);
        n3 = R$layout.layout_dialog;
        n4 = 0;
        object3 = object3.inflate(n3, null);
        object2 = this.dialog;
        object2.setContentView((View)object3);
        n3 = R$id.dialog_title;
        object2 = object3.findViewById(n3);
        n4 = 8;
        object2.setVisibility(n4);
        n3 = R$id.img_pro;
        object2 = object3.findViewById(n3);
        object2.setVisibility(0);
        n = R$id.dialog_message;
        object = object3.findViewById(n);
        object = (TextCustumFont)object;
        object2 = this.mResources;
        n4 = R$string.do_want_delete_watermark;
        object2 = object2.getString(n4);
        object.setText((CharSequence)object2);
        n3 = 17;
        object.setGravity(n3);
        n = R$id.dialog_no;
        object = object3.findViewById(n);
        object = (ButtonCustumFont)object;
        object2 = this.mResources;
        n4 = R$string.no;
        object2 = object2.getString(n4);
        object.setText((CharSequence)object2);
        object2 = new EngineActivity$73(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.dialog_yes;
        object = object3.findViewById(n);
        object = (ButtonCustumFont)object;
        object3 = this.mResources;
        n3 = R$string.yes;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object3 = new EngineActivity$74(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.dialog;
        try {
            object.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /* synthetic */ void lambda$addAudioReciters$3$hazem-nurmontage-videoquran-EngineActivity(int n, List list) {
        int n2 = list.size();
        this.updateProgress(n, n2);
    }

    /* synthetic */ void lambda$addAudioReciters$4$hazem-nurmontage-videoquran-EngineActivity(File object, List object2, File object3, FFmpegSession fFmpegSession) {
        ReturnCode returnCode = fFmpegSession.getReturnCode();
        boolean bl = ReturnCode.isSuccess(returnCode);
        if (bl) {
            object = Uri.fromFile((File)object);
            int n = -1;
            object3 = ((File)object3).getAbsolutePath();
            this.addAudio((Uri)object, (List)object2, n, (String)object3);
        } else {
            object = new StringBuilder("Failed: ");
            object2 = fFmpegSession.getFailStackTrace();
            object = ((StringBuilder)object).append((String)object2).toString();
            object2 = "FFMPEG";
            Log.e((String)object2, (String)object);
        }
    }

    /* synthetic */ void lambda$addAudioReciters$5$hazem-nurmontage-videoquran-EngineActivity(String[] object, File file, List list, File file2) {
        List list2 = this.id_ffmpeg;
        EngineActivity$$ExternalSyntheticLambda6 engineActivity$$ExternalSyntheticLambda6 = new EngineActivity$$ExternalSyntheticLambda6(this, file, list, file2);
        object = FFmpegKit.executeWithArgumentsAsync(object, engineActivity$$ExternalSyntheticLambda6).getSessionId();
        list2.add(object);
    }

    /* synthetic */ void lambda$addAudioReciters$6$hazem-nurmontage-videoquran-EngineActivity() {
        this.hideProgressFragment();
        this.hideFragment();
    }

    /*
     * Loose catch block
     */
    /* synthetic */ void lambda$addAudioReciters$7$hazem-nurmontage-videoquran-EngineActivity(List list, Handler handler) {
        Object object;
        Object object2;
        EngineActivity engineActivity = this;
        Handler handler2 = handler;
        Object object3 = "0:a";
        Object object4 = "-map";
        String[] stringArray = "-f";
        Object object5 = new ArrayList();
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        Object object6 = new StringBuilder();
        ArrayList<String[]> arrayList2 = list.iterator();
        int n = 0;
        CharSequence charSequence = null;
        while (true) {
            block105: {
                block104: {
                    String string;
                    String string2;
                    block103: {
                        String string3;
                        block102: {
                            boolean bl = arrayList2.hasNext();
                            if (!bl) break;
                            object2 = arrayList2.next();
                            object2 = (RecitersModel)object2;
                            boolean bl2 = object2.isTarteel();
                            string2 = ".mp3";
                            string = "/";
                            if (!bl2) break block102;
                            object = new StringBuilder();
                            string3 = "https://audio-cdn.tarteel.ai/quran/";
                            object = ((StringBuilder)object).append(string3);
                            string3 = object2.getIdentifer();
                            object = ((StringBuilder)object).append(string3);
                            object = ((StringBuilder)object).append(string);
                            string = object2.getSurah_index();
                            object = ((StringBuilder)object).append(string);
                            object2 = object2.getNumber_aya();
                            object2 = ((StringBuilder)object).append((String)object2);
                            object2 = object2.append(string2);
                            object2 = object2.toString();
                            break block103;
                        }
                        object = new StringBuilder();
                        string3 = "https://everyayah.com/data/";
                        object = ((StringBuilder)object).append(string3);
                        string3 = object2.getIdentifer();
                        object = ((StringBuilder)object).append(string3);
                        object = ((StringBuilder)object).append(string);
                        string = object2.getSurah_index();
                        object = ((StringBuilder)object).append(string);
                        object2 = object2.getNumber_aya();
                        object2 = ((StringBuilder)object).append((String)object2);
                        object2 = object2.append(string2);
                        object2 = object2.toString();
                    }
                    object = engineActivity.mTemplate;
                    object = ((Template)object).getFolder_template();
                    object = AudioUtils.downloadFile((Context)engineActivity, (String)object2, (String)object);
                    if (object == null) break block104;
                    object5.add(object);
                    arrayList.add((String[])object2);
                    object2 = "file '";
                    object2 = ((StringBuilder)object6).append((String)object2);
                    string2 = "'";
                    string = "\\'";
                    object = ((String)object).replace(string2, string);
                    object2 = object2.append((String)object);
                    object = "'\n";
                    object2.append((String)object);
                    ++n;
                    object = list;
                    try {
                        object2 = new EngineActivity$$ExternalSyntheticLambda9(engineActivity, n, list);
                    }
                    catch (Exception exception) {
                        break block105;
                    }
                    handler2.post((Runnable)object2);
                    continue;
                }
                object = list;
                continue;
                catch (Exception exception) {
                    object = list;
                }
            }
            object2.printStackTrace();
            continue;
            break;
        }
        object5 = engineActivity.mTemplate;
        object5 = ((Template)object5).getFolder_template();
        arrayList2 = new ArrayList<String[]>();
        charSequence = "concat_";
        arrayList2 = ((StringBuilder)((Object)arrayList2)).append((String)charSequence);
        long l = System.currentTimeMillis();
        arrayList2 = ((StringBuilder)((Object)arrayList2)).append(l);
        charSequence = ".txt";
        arrayList2 = ((StringBuilder)((Object)arrayList2)).append((String)charSequence);
        arrayList2 = ((StringBuilder)((Object)arrayList2)).toString();
        object2 = new File((String)object5, (String)((Object)arrayList2));
        object5 = new FileOutputStream((File)object2);
        object6 = ((StringBuilder)object6).toString();
        object6 = ((String)object6).getBytes();
        ((FileOutputStream)object5).write((byte[])object6);
        ((FileOutputStream)object5).close();
        object6 = engineActivity.mTemplate;
        object6 = ((Template)object6).getFolder_template();
        arrayList2 = new ArrayList<String[]>();
        l = System.currentTimeMillis();
        arrayList2 = ((StringBuilder)((Object)arrayList2)).append(l);
        charSequence = "_output.mp3";
        arrayList2 = ((StringBuilder)((Object)arrayList2)).append((String)charSequence);
        arrayList2 = ((StringBuilder)((Object)arrayList2)).toString();
        object5 = new File((String)object6, (String)((Object)arrayList2));
        arrayList2 = engineActivity.mTemplate;
        arrayList2 = ((Template)((Object)arrayList2)).getFolder_template();
        charSequence = new StringBuilder();
        long l2 = System.currentTimeMillis();
        charSequence = ((StringBuilder)charSequence).append(l2);
        object = "_output.pcm";
        charSequence = ((StringBuilder)charSequence).append((String)object);
        charSequence = ((StringBuilder)charSequence).toString();
        object6 = new File((String)((Object)arrayList2), (String)charSequence);
        arrayList2 = new ArrayList<String[]>();
        arrayList2.add(stringArray);
        charSequence = "concat";
        arrayList2.add((String[])charSequence);
        charSequence = "-safe";
        arrayList2.add((String[])charSequence);
        charSequence = "0";
        arrayList2.add((String[])charSequence);
        charSequence = "-i";
        arrayList2.add((String[])charSequence);
        object2 = object2.getAbsolutePath();
        arrayList2.add((String[])object2);
        arrayList2.add((String[])object4);
        arrayList2.add((String[])object3);
        object2 = "-c";
        arrayList2.add((String[])object2);
        object2 = "copy";
        arrayList2.add((String[])object2);
        object2 = ((File)object5).getAbsolutePath();
        arrayList2.add((String[])object2);
        arrayList2.add((String[])object4);
        arrayList2.add((String[])object3);
        object2 = "-ac";
        arrayList2.add((String[])object2);
        object2 = "1";
        arrayList2.add((String[])object2);
        object2 = "-ar";
        arrayList2.add((String[])object2);
        object2 = "44100";
        arrayList2.add((String[])object2);
        arrayList2.add(stringArray);
        object2 = "s16le";
        arrayList2.add((String[])object2);
        object2 = ((File)object6).getAbsolutePath();
        arrayList2.add((String[])object2);
        object2 = "-y";
        arrayList2.add((String[])object2);
        object2 = new String[]{};
        stringArray = object2 = arrayList2.toArray((T[])object2);
        stringArray = object2;
        object3 = object2;
        object4 = this;
        object2 = new EngineActivity$$ExternalSyntheticLambda10(this, stringArray, (File)object5, arrayList, (File)object6);
        try {
            handler2.post((Runnable)object2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object2 = new EngineActivity$$ExternalSyntheticLambda11(engineActivity);
            handler2.post((Runnable)object2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    /* synthetic */ void lambda$changeEntityAudio$2$hazem-nurmontage-videoquran-EngineActivity(Uri var1_1, int var2_5, int var3_6, String var4_7, EntityAudio var5_8, int var6_9) {
        block47: {
            block48: {
                var7_10 = this.mTemplate;
                var7_10 = var7_10.getFolder_template();
                var1_1 /* !! */  = AudioUtils.copyFromUri((Context)this, var1_1 /* !! */ , (String)var7_10);
                var8_11 = var2_5;
                var9_12 = 0.1f * var8_11;
                var10_13 = (int)var9_12;
                var11_14 = 0.07f;
                var12_15 = (int)(var8_11 *= var11_14);
                var10_13 += var12_15;
                var12_15 = var3_6 / var10_13;
                var4_7 = PCMWaveformExtractor.extractWaveform((String)var4_7, var12_15);
                var5_8.setAmps((float[])var4_7, var3_6, var2_5);
                var5_8.setPath_ffmpeg((String)var1_1 /* !! */ );
                var13_16 = -1;
                if (var6_9 == var13_16) break block47;
                var13_16 = var6_9 + 1;
                var14_17 = this.mTemplate;
                var14_17 = var14_17.getEntityMediaList();
                var2_5 = var14_17.size();
                if (var13_16 < var2_5) ** GOTO lbl-1000
                var1_1 /* !! */  = new EngineActivity$46(this);
                try {
                    this.runOnUiThread((Runnable)var1_1 /* !! */ );
                }
                catch (Exception var1_2) {
                    var1_2.printStackTrace();
                    this.hideProgressFragment();
                    this.hideFragment();
                }
                ** GOTO lbl111
lbl-1000:
                // 1 sources

                {
                    var14_17 = this.mTemplate;
                }
                var14_17 = var14_17.getEntityMediaList();
                var14_17 = var14_17.get(var6_9);
                var14_17 = (EntityMedia)var14_17;
                var15_18 = this.mTemplate;
                var15_18 = var15_18.getEntityMediaList();
                var15_18 = var15_18.get(var13_16);
                var15_18 = (EntityMedia)var15_18;
                var4_7 = var15_18.getVideo_path();
                if (var4_7 == null) ** GOTO lbl97
                var15_18 = this.mTemplate;
                var15_18 = var15_18.getUri_upload_extract_audio_video();
                var15_18 = Uri.parse((String)var15_18);
                var4_7 = this.mTemplate;
                var4_7 = var4_7.getFolder_template();
                var15_18 = AudioUtils.copyFromUri((Context)this, (Uri)var15_18, (String)var4_7);
                var14_17.setVideo_path((String)var15_18);
                var15_18 = this.mTemplate;
                var15_18 = var15_18.getExtension();
                if (var15_18 == null) break block48;
                var15_18 = this.mTemplate;
                var15_18 = var15_18.getExtension();
                var14_17 = var14_17.getVideo_path();
                this.addAudioFromVideoWithExtention((String)var15_18, (String)var14_17, var13_16);
                ** GOTO lbl111
            }
            var3_6 = 0;
            var15_18 = null;
            this.start_extenstion = 0;
            var14_17 = var14_17.getVideo_path();
            var16_19 = true;
            this.extractAudioFromVideoRecursive((String)var14_17, 0, var16_19, var13_16);
            ** GOTO lbl111
lbl97:
            // 1 sources

            var14_17 = var15_18.getPaths_https();
            var16_20 = false;
            var4_7 = null;
            if (var14_17 == null) ** GOTO lbl106
            var14_17 = var15_18.getPaths_https();
            this.addAudioRecitersTemplate((List)var14_17, var13_16, null);
            ** GOTO lbl111
lbl106:
            // 1 sources

            var14_17 = var15_18.getUri();
            var14_17 = Uri.parse((String)var14_17);
            this.addAudioTemplateHttp((Uri)var14_17, var13_16, null);
lbl111:
            // 6 sources

            return;
        }
        var1_1 /* !! */  = new EngineActivity$47(this);
        try {
            this.runOnUiThread((Runnable)var1_1 /* !! */ );
        }
        catch (Exception var1_3) {
            var1_3.printStackTrace();
            this.hideProgressFragment();
            this.hideFragment();
            {
                catch (Exception var1_4) {
                    var1_4.printStackTrace();
                    this.hideProgressFragment();
                    this.hideFragment();
                }
            }
        }
    }

    /* synthetic */ void lambda$initLauncher$1$hazem-nurmontage-videoquran-EngineActivity(ActivityResult object) {
        int n;
        int n2 = ((ActivityResult)object).getResultCode();
        if (n2 == (n = -1)) {
            Uri uri;
            if ((object = ((ActivityResult)object).getData()) != null && (uri = object.getData()) != null) {
                object = object.getData();
                uri = this.getContentResolver();
                n = 1;
                try {
                    uri.takePersistableUriPermission((Uri)object, n);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                n2 = 0;
                uri = null;
                this.addUriAudioToQuranFragment((Uri)object, null);
            } else {
                object = this.mResources;
                n2 = R$string.no_audio_select;
                object = object.getString(n2);
                object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                object.show();
            }
        } else {
            object = this.mResources;
            n2 = R$string.audio_cancel;
            object = object.getString(n2);
            object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
            object.show();
        }
    }

    /* synthetic */ void lambda$new$10$hazem-nurmontage-videoquran-EngineActivity(ActivityResult activityResult) {
        Uri uri;
        int n;
        int n2 = activityResult.getResultCode();
        if (n2 == (n = -1) && (activityResult = activityResult.getData()) != null && (uri = activityResult.getData()) != null) {
            activityResult = activityResult.getData();
            this.handleImg((Uri)activityResult);
        }
    }

    /* synthetic */ void lambda$new$11$hazem-nurmontage-videoquran-EngineActivity(ActivityResult activityResult) {
        Uri uri;
        int n;
        int n2 = activityResult.getResultCode();
        if (n2 == (n = -1) && (activityResult = activityResult.getData()) != null && (uri = activityResult.getData()) != null) {
            activityResult = activityResult.getData();
            uri = this.getContentResolver();
            n = 1;
            try {
                uri.takePersistableUriPermission((Uri)activityResult, n);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.handleVideo((Uri)activityResult);
        }
    }

    /*
     * Loose catch block
     */
    /* synthetic */ void lambda$new$12$hazem-nurmontage-videoquran-EngineActivity(ActivityResult object) {
        Object object2;
        int n;
        this.isToCrop = false;
        int n2 = ((ActivityResult)object).getResultCode();
        if (n2 == (n = -1) && (object = ((ActivityResult)object).getData()) != null && (object2 = object.getData()) != null) {
            object = object.getData();
            object2 = this.getContentResolver();
            n = 1;
            try {
                object2.takePersistableUriPermission((Uri)object, n);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            object2 = new EngineActivity$83(this);
            this.runOnUiThread((Runnable)object2);
            object2 = this.mTemplate;
            String string2 = object.toString();
            ((Template)object2).setUri_upload_extract_audio_video(string2);
            object2 = this.mTemplate;
            object2 = ((Template)object2).getFolder_template();
            object = AudioUtils.copyFromUri((Context)this, (Uri)object, (String)object2);
            this.start_extenstion = 0;
            this.extractAudioFromVideoRecursive((String)object, 0, false, 0);
            {
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    /* synthetic */ void lambda$new$8$hazem-nurmontage-videoquran-EngineActivity(ActivityResult object) {
        int n;
        int n2;
        int n3 = object.getResultCode();
        if (n3 == (n2 = -1) && (object = object.getData()) != null && (object = Common.bitmap) != null && (n = (object = Common.bitmap).isRecycled()) == 0) {
            object = Common.bitmap;
            n3 = this.blurredImageView.getHeight();
            BlurredImageView blurredImageView = this.blurredImageView;
            n2 = blurredImageView.getHeight();
            int n4 = 0;
            Common.bitmap = Bitmap.createScaledBitmap((Bitmap)object, (int)n3, (int)n2, (boolean)false);
            object = this.blurredImageView;
            Object object2 = Common.bitmap;
            ((BlurredImageView)((Object)object)).setBitmapOriginal((Bitmap)object2);
            object = this.mTemplate;
            n = ((Template)object).geTypeResize();
            object2 = ResizeType.SOCIAL_STORY;
            n3 = ((Enum)object2).ordinal();
            if (n == n3) {
                object = this.blurredImageView.getBitmapOriginal();
                object2 = this.blurredImageView;
                n3 = ((BlurredImageView)((Object)object2)).getW();
                blurredImageView = this.blurredImageView;
                n2 = blurredImageView.getH();
                object = BitmapCropper.cropTo9x16((Bitmap)object, n3, n2);
            } else {
                object = this.mTemplate;
                n = ((Template)object).geTypeResize();
                if (n == (n3 = ((Enum)(object2 = ResizeType.SQUARE)).ordinal())) {
                    object = this.blurredImageView.getBitmapOriginal();
                    object2 = this.blurredImageView;
                    n3 = ((BlurredImageView)((Object)object2)).getW();
                    blurredImageView = this.blurredImageView;
                    n2 = blurredImageView.getH();
                    object = BitmapCropper.cropTo1x1((Bitmap)object, n3, n2);
                } else {
                    object = this.blurredImageView.getBitmapOriginal();
                    object2 = this.blurredImageView;
                    n3 = ((BlurredImageView)((Object)object2)).getW();
                    blurredImageView = this.blurredImageView;
                    n2 = blurredImageView.getH();
                    object = BitmapCropper.cropTo16x9((Bitmap)object, n3, n2);
                }
            }
            object2 = this.blurredImageView;
            n2 = 20;
            n4 = 1;
            object = UtilsBitmap.blur((Context)this, (Bitmap)object, n2, n4);
            ((BlurredImageView)((Object)object2)).setBitmapBlured((Bitmap)object);
            object = this.blurredImageView;
            object.invalidate();
        }
    }

    /* synthetic */ void lambda$new$9$hazem-nurmontage-videoquran-EngineActivity(ActivityResult object) {
        int n = object.getResultCode();
        int n2 = -1;
        float f = 0.0f / 0.0f;
        if (n == n2) {
            if ((object = object.getData()) == null) {
                return;
            }
            Template template = this.mTemplate;
            f = object.getFloatExtra("x", 0.3f);
            template.setX_square(f);
            template = this.mTemplate;
            f = object.getFloatExtra("y", 0.4f);
            template.setY_square(f);
            template = this.mTemplate;
            f = object.getFloatExtra("w", 1.0f);
            template.setWidth_square(f);
            template = this.mTemplate;
            String string2 = "h";
            float f2 = 0.5f;
            float f3 = object.getFloatExtra(string2, f2);
            template.setHeight_square(f3);
            object = this.blurredImageView;
            template = Common.bitmap;
            ((BlurredImageView)((Object)object)).setBitmapSquare((Bitmap)template);
            object = this.blurredImageView;
            template = Common.rect;
            ((BlurredImageView)((Object)object)).setRectSquare((Rect)template);
            object = this.blurredImageView;
            object.invalidate();
        }
        this.isToCrop = false;
    }

    /* synthetic */ void lambda$processFrame$13$hazem-nurmontage-videoquran-EngineActivity(Bitmap object) {
        BlurredImageView blurredImageView = this.blurredImageView;
        blurredImageView.setBitmapSquare((Bitmap)object);
        boolean bl = this.isOnScroll;
        if (!bl) {
            object = this.blurredImageView;
            boolean bl2 = true;
            ((BlurredImageView)((Object)object)).setDrawingSquareVideo(bl2);
        }
        this.blurredImageView.invalidate();
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_time_line;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new EngineActivity$$ExternalSyntheticLambda4();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        this.setStatusBarColor(-15658735);
        this.setNavigationBarColor(-14935010);
        this.wakeLockAquire();
        this.showProgress();
        this.loadTemplate();
        this.initLauncher();
        this.vibrationHelper = object = new MyVibrationHelper((Context)this);
        this.initTimeLineView();
        this.initViews();
        this.checkUriShared();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDestroy() {
        super.onDestroy();
        try {
            Glide glide = Glide.get((Context)this);
            glide.clearMemory();
        }
        catch (Exception exception) {}
        this.clearFFmpeg();
        this.releaseWakeLock();
        this.clearCallback();
        this.pausePlayer();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onPause() {
        super.onPause();
        try {
            boolean bl = this.isSaveTmpTemplate;
            if (bl) {
                this.saveTemplateTmp();
            }
            if (bl = this.isToCrop) {
                return;
            }
            TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = this.iTrimLineCallback;
            if (trackEntityView$ITrimLineCallback != null) {
                trackEntityView$ITrimLineCallback.onEmptySelect();
            }
            this.cancelDialog();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int n, String[] object, int[] nArray) {
        int n2;
        int n3;
        super.onRequestPermissionsResult(n, (String[])object, nArray);
        int n4 = 1;
        if (n == n4) {
            n4 = nArray.length;
            if (n4 > 0 && (n4 = nArray[0]) == 0) {
                this.save();
            } else {
                object = this.mResources;
                n3 = R$string.permission_img;
                object = object.getString(n3);
                object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                object.show();
            }
        }
        if (n == (n4 = 2)) {
            n4 = nArray.length;
            if (n4 > 0 && (n4 = nArray[0]) == 0) {
                this.pickAudio();
            } else {
                object = this.mResources;
                n3 = R$string.permission_audio;
                object = object.getString(n3);
                object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                object.show();
            }
        }
        n4 = 10;
        String string2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
        int n5 = 34;
        if (n == n4) {
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n5 && (n4 = ContextCompat.checkSelfPermission((Context)this, string2)) == 0 || (n4 = nArray.length) > 0 && (n4 = nArray[0]) == 0) {
                this.imageChooser();
            } else {
                object = this.mResources;
                n2 = R$string.permission_img;
                object = object.getString(n2);
                object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                object.show();
            }
        }
        if (n == (n4 = 11)) {
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n5 && (n4 = ContextCompat.checkSelfPermission((Context)this, string2)) == 0 || (n4 = nArray.length) > 0 && (n4 = nArray[0]) == 0) {
                this.videoChooser();
            } else {
                object = this.mResources;
                n2 = R$string.permission_video;
                object = object.getString(n2);
                object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                object.show();
            }
        }
        if (n == (n4 = 12)) {
            n = Build.VERSION.SDK_INT;
            if (n >= n5 && (n = ContextCompat.checkSelfPermission((Context)this, string2)) == 0 || (n = nArray.length) > 0 && (n = nArray[0]) == 0) {
                this.videoChooserForAudio();
            } else {
                Object object2 = this.mResources;
                n4 = R$string.permission_video;
                object2 = object2.getString(n4);
                object2 = Toast.makeText((Context)this, (CharSequence)object2, (int)0);
                object2.show();
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.isToCrop = false;
        this.isSaveTmpTemplate = true;
    }

    public void pauseTimelineAnimation() {
        int n;
        this.stop();
        SmoothTimelineAnimator smoothTimelineAnimator = this.valueAnimator;
        if (smoothTimelineAnimator != null && (n = smoothTimelineAnimator.isRunning()) != 0) {
            this.startCursur = n = this.valueAnimator.getCurrentTimeMs();
            this.valueAnimator.stop();
            n = 0;
            smoothTimelineAnimator = null;
            this.valueAnimator = null;
        }
    }

    public void pickAudio() {
        Object object = "android.intent.action.OPEN_DOCUMENT";
        Intent intent = new Intent((String)object);
        object = "android.intent.category.OPENABLE";
        intent.addCategory((String)object);
        object = "audio/*";
        intent.setType((String)object);
        object = this.activityLauncher;
        try {
            ((ActivityResultLauncher)object).launch(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void pickImageFromGallery() {
        int n = Build.VERSION.SDK_INT;
        int n2 = 34;
        int n3 = 2;
        int n4 = 10;
        String string2 = "android.permission.READ_MEDIA_VIDEO";
        int n5 = 1;
        String string3 = "android.permission.READ_MEDIA_IMAGES";
        if (n >= n2) {
            String string4 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            n2 = ContextCompat.checkSelfPermission((Context)this, string4);
            if (n2 != 0 || (n2 = ContextCompat.checkSelfPermission((Context)this, string3)) != 0) {
                String[] stringArray = new String[3];
                stringArray[0] = string3;
                stringArray[n5] = string2;
                stringArray[n3] = string4;
                ActivityCompat.requestPermissions(this, stringArray, n4);
                return;
            }
        } else {
            n = Build.VERSION.SDK_INT;
            n2 = 33;
            if (n >= n2) {
                n = ContextCompat.checkSelfPermission((Context)this, string3);
                if (n != 0 || (n = ContextCompat.checkSelfPermission((Context)this, string2)) != 0) {
                    String[] stringArray = new String[n3];
                    stringArray[0] = string3;
                    stringArray[n5] = string2;
                    ActivityCompat.requestPermissions(this, stringArray, n4);
                    return;
                }
            } else {
                String string5 = "android.permission.READ_EXTERNAL_STORAGE";
                n2 = ContextCompat.checkSelfPermission((Context)this, string5);
                if (n2 != 0) {
                    String[] stringArray = new String[n5];
                    stringArray[0] = string5;
                    ActivityCompat.requestPermissions(this, stringArray, n4);
                    return;
                }
            }
        }
        this.imageChooser();
    }

    public void pickVideoForAudio() {
        int n = Build.VERSION.SDK_INT;
        int n2 = 34;
        int n3 = 12;
        int n4 = 1;
        String string2 = "android.permission.READ_MEDIA_VIDEO";
        if (n >= n2) {
            String string3 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            n2 = ContextCompat.checkSelfPermission((Context)this, string3);
            if (n2 != 0 && (n2 = ContextCompat.checkSelfPermission((Context)this, string2)) != 0) {
                String[] stringArray = new String[2];
                stringArray[0] = string2;
                stringArray[n4] = string3;
                ActivityCompat.requestPermissions(this, stringArray, n3);
                return;
            }
        } else {
            n = Build.VERSION.SDK_INT;
            n2 = 33;
            if (n >= n2) {
                n = ContextCompat.checkSelfPermission((Context)this, string2);
                if (n != 0) {
                    String[] stringArray = new String[n4];
                    stringArray[0] = string2;
                    ActivityCompat.requestPermissions(this, stringArray, n3);
                    return;
                }
            } else {
                String string4 = "android.permission.READ_EXTERNAL_STORAGE";
                n2 = ContextCompat.checkSelfPermission((Context)this, string4);
                if (n2 != 0) {
                    String[] stringArray = new String[n4];
                    stringArray[0] = string4;
                    ActivityCompat.requestPermissions(this, stringArray, n3);
                    return;
                }
            }
        }
        this.videoChooserForAudio();
    }

    public void pickVideoFromGallery() {
        int n = Build.VERSION.SDK_INT;
        int n2 = 34;
        int n3 = 2;
        int n4 = 11;
        int n5 = 1;
        String string2 = "android.permission.READ_MEDIA_IMAGES";
        String string3 = "android.permission.READ_MEDIA_VIDEO";
        if (n >= n2) {
            String string4 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            n2 = ContextCompat.checkSelfPermission((Context)this, string4);
            if (n2 != 0 && (n2 = ContextCompat.checkSelfPermission((Context)this, string3)) != 0) {
                String[] stringArray = new String[3];
                stringArray[0] = string2;
                stringArray[n5] = string3;
                stringArray[n3] = string4;
                ActivityCompat.requestPermissions(this, stringArray, n4);
                return;
            }
        } else {
            n = Build.VERSION.SDK_INT;
            n2 = 33;
            if (n == n2) {
                n = ContextCompat.checkSelfPermission((Context)this, string2);
                if (n != 0 || (n = ContextCompat.checkSelfPermission((Context)this, string3)) != 0) {
                    String[] stringArray = new String[n3];
                    stringArray[0] = string2;
                    stringArray[n5] = string3;
                    ActivityCompat.requestPermissions(this, stringArray, n4);
                    return;
                }
            } else {
                String string5 = "android.permission.READ_EXTERNAL_STORAGE";
                n2 = ContextCompat.checkSelfPermission((Context)this, string5);
                if (n2 != 0) {
                    String[] stringArray = new String[n5];
                    stringArray[0] = string5;
                    ActivityCompat.requestPermissions(this, stringArray, n4);
                    return;
                }
            }
        }
        this.videoChooser();
    }

    public EntityQuranTimeline splitTimeLineQuran(int n, QuranEntity quranEntity, float f, float f2, float f3) {
        float f4 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f5 = this.trackViewEntity.getSecond_in_screen();
        EntityQuranTimeline entityQuranTimeline = new EntityQuranTimeline(quranEntity, f, 0.0f, f4, f2, f5);
        entityQuranTimeline.setmScaleFactor(f3);
        this.trackViewEntity.addQuran_split(entityQuranTimeline, n);
        return entityQuranTimeline;
    }

    public EntityTrslTimeline splitTimeLineQuran(int n, TranslationQuranEntity translationQuranEntity, float f, float f2, float f3) {
        float f4 = (float)this.trackViewEntity.getWidth() * 0.077f;
        float f5 = this.trackViewEntity.getSecond_in_screen();
        EntityTrslTimeline entityTrslTimeline = new EntityTrslTimeline(translationQuranEntity, f, 0.0f, f4, f2, f5);
        entityTrslTimeline.setmScaleFactor(f3);
        this.trackViewEntity.addQuran_split(entityTrslTimeline, n);
        return entityTrslTimeline;
    }

    public void start() {
        Object object;
        int n;
        Object object2 = this.mTemplate;
        int n2 = ((Template)object2).getIpad_type();
        if (n2 != (n = (object = IpadType.RECT).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = (object = IpadType.ROUND_RECT).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = (object = IpadType.CASSET_IMG_BLUR).ordinal()) && (n2 = ((Template)(object2 = this.mTemplate)).getIpad_type()) != (n = (object = IpadType.CASSET).ordinal())) {
            n2 = 0;
            this.isOnScroll = false;
            object = this.trackViewEntity;
            Template template = this.mTemplate;
            EngineActivity$106 engineActivity$106 = new EngineActivity$106(this);
            int n3 = 25;
            this.animator_frame_video = object2 = new SmoothVideoAnimator((TrackEntityView)((Object)object), template, n3, engineActivity$106);
            ((SmoothVideoAnimator)object2).start();
        }
    }

    public void startTimelineAnimation() {
        this.entityAudio_visible = null;
        this.entityAudio_player = null;
        this.lastIndexVisible = 0;
        int n = this.trackViewEntity.getMaxTime();
        TrackEntityView trackEntityView = this.trackViewEntity;
        float f = trackEntityView.getTimeLineW();
        long l = n;
        Object object = new TimeFormatter(l);
        this.timeFormatter = object;
        int n2 = this.startCursur;
        EngineActivity$36 engineActivity$36 = new EngineActivity$36(this, n, f);
        this.valueAnimator = object = new SmoothTimelineAnimator(n2, n, engineActivity$36);
        ((SmoothTimelineAnimator)object).start();
        Template template = this.mTemplate;
        n = template.isVideoSquare() ? 1 : 0;
        if (n != 0) {
            this.start();
        }
    }

    public void startTimelineAnimationPreview(EntityAudio object) {
        TrackEntityView trackEntityView = this.trackViewEntity;
        int n = trackEntityView.getMaxTime();
        TrackEntityView trackEntityView2 = this.trackViewEntity;
        float f = trackEntityView2.getTimeLineW();
        long l = n;
        Object object2 = new TimeFormatter(l);
        this.timeFormatter = object2;
        int n2 = this.startCursur;
        EngineActivity$37 engineActivity$37 = new EngineActivity$37(this, n, f, (EntityAudio)object);
        this.valueAnimator = object2 = new SmoothTimelineAnimator(n2, n, engineActivity$37);
        ((SmoothTimelineAnimator)object2).start();
        object = this.mTemplate;
        boolean bl = ((Template)object).isVideoSquare();
        if (bl) {
            this.start();
        }
    }

    public void stop() {
        this.blurredImageView.setDrawingSquareVideo(false);
        SmoothVideoAnimator smoothVideoAnimator = this.animator_frame_video;
        if (smoothVideoAnimator != null) {
            smoothVideoAnimator.stop();
        }
    }

    public void updateEndViewTime(int n) {
        Object object = TimeUnit.MILLISECONDS;
        long l = n;
        long l2 = object.toSeconds(l);
        Object object2 = TimeUnit.MINUTES;
        object = TimeUnit.MILLISECONDS;
        long l3 = object.toMinutes(l);
        l3 = ((TimeUnit)((Object)object2)).toSeconds(l3);
        long l4 = (l2 -= l3) - (l3 = (long)10);
        n = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n < 0) {
            object2 = new StringBuilder();
            long l5 = TimeUnit.MILLISECONDS.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l5);
            object = ":0";
            object2 = ((StringBuilder)object2).append((String)object).append(l2).toString();
        } else {
            object2 = new StringBuilder();
            long l6 = TimeUnit.MILLISECONDS.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l6);
            object = ":";
            object2 = ((StringBuilder)object2).append((String)object).append(l2).toString();
        }
        object = this.tv_endTime;
        StringBuilder stringBuilder = new StringBuilder("/");
        object2 = stringBuilder.append((String)object2).toString();
        object.setText((CharSequence)object2);
    }

    public void updateHitRatio(int n, String string2) {
        TextCustumFont textCustumFont;
        Object object = ResizeType.SOCIAL_STORY;
        int n2 = object.ordinal();
        if (n == n2) {
            textCustumFont = this.textChangeResize;
            object = "9:16";
            textCustumFont.setText((CharSequence)object);
        } else {
            object = ResizeType.SQUARE;
            n2 = object.ordinal();
            if (n == n2) {
                textCustumFont = this.textChangeResize;
                object = "1:1";
                textCustumFont.setText((CharSequence)object);
            } else {
                textCustumFont = this.textChangeResize;
                object = "16:9";
                textCustumFont.setText((CharSequence)object);
            }
        }
        textCustumFont = this.ivResize;
        int n3 = DrawableHelper.getIdResource(string2);
        textCustumFont.setImageResource(n3);
    }

    public void updateStartViewTime(int n) {
        Object object = TimeUnit.MILLISECONDS;
        long l = n;
        long l2 = object.toSeconds(l);
        Object object2 = TimeUnit.MINUTES;
        object = TimeUnit.MILLISECONDS;
        long l3 = object.toMinutes(l);
        l3 = ((TimeUnit)((Object)object2)).toSeconds(l3);
        long l4 = (l2 -= l3) - (l3 = (long)10);
        n = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n < 0) {
            object2 = new StringBuilder();
            long l5 = TimeUnit.MILLISECONDS.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l5);
            object = ":0";
            object2 = ((StringBuilder)object2).append((String)object).append(l2).toString();
        } else {
            object2 = new StringBuilder();
            long l6 = TimeUnit.MILLISECONDS.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l6);
            object = ":";
            object2 = ((StringBuilder)object2).append((String)object).append(l2).toString();
        }
        this.tv_currentTime.setText((CharSequence)object2);
    }

    public void updateViewTime(int n, int n2) {
        Object object = TimeUnit.MILLISECONDS;
        long l = n2;
        long l2 = ((TimeUnit)((Object)object)).toSeconds(l);
        Object object2 = TimeUnit.MINUTES;
        long l3 = TimeUnit.MILLISECONDS.toMinutes(l);
        l3 = ((TimeUnit)((Object)object2)).toSeconds(l3);
        l2 -= l3;
        l3 = 10;
        n2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        object = ":0";
        String string2 = ":";
        if (n2 < 0) {
            object2 = new StringBuilder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            l = timeUnit.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l).append((String)object).append(l2).toString();
        } else {
            object2 = new StringBuilder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            l = timeUnit.toMinutes(l);
            object2 = ((StringBuilder)object2).append(l).append(string2).append(l2).toString();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l4 = n;
        long l5 = timeUnit.toSeconds(l4);
        Object object3 = TimeUnit.MINUTES;
        timeUnit = TimeUnit.MILLISECONDS;
        long l6 = timeUnit.toMinutes(l4);
        l6 = ((TimeUnit)((Object)object3)).toSeconds(l6);
        long l7 = (l5 -= l6) - l3;
        n = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n < 0) {
            object3 = new StringBuilder();
            timeUnit = TimeUnit.MILLISECONDS;
            l = timeUnit.toMinutes(l4);
            object3 = ((StringBuilder)object3).append(l).append((String)object).append(l5).toString();
        } else {
            object3 = new StringBuilder();
            object = TimeUnit.MILLISECONDS;
            long l8 = ((TimeUnit)((Object)object)).toMinutes(l4);
            object3 = ((StringBuilder)object3).append(l8).append(string2).append(l5).toString();
        }
        this.tv_currentTime.setText((CharSequence)object2);
        object2 = this.tv_endTime;
        object = new StringBuilder("/");
        object3 = ((StringBuilder)object).append((String)object3).toString();
        object2.setText((CharSequence)object3);
    }
}
