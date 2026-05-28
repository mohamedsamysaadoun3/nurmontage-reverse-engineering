package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.Utils.Feadback;
import hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker;
import hazem.nurmontage.videoquran.Utils.FileMediaScanner;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.model.EntityBismilahTemplate;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import hazem.nurmontage.videoquran.model.EntityTranslationTemplate;
import hazem.nurmontage.videoquran.model.RenderManager;
import hazem.nurmontage.videoquran.model.SquareBitmapModel;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.SquareOutlineProgressBar;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import org.apache.commons.p008io.FileUtils;

/* loaded from: classes2.dex */
public class ProgressViewActivity extends Base {
    private Dialog dialog;
    private boolean isCancel;
    private volatile boolean isDestroy;
    private Template mTemplate;
    private String mUri;
    private SquareOutlineProgressBar progressIndicator;
    private Statistics statistics;
    private Thread workerThread;
    private final StringBuilder overlay = new StringBuilder();
    private final RenderManager renderManager = new RenderManager();
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ProgressViewActivity.this.dialog();
        }
    };
    private final Executor executor = Executors.newSingleThreadExecutor();
    private final List<Long> id_ffmpeg = new ArrayList();
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private float displayedProgress = 0.0f;
    private float targetProgress = 0.0f;
    private final int FRAME_MS = 16;
    private boolean isAnimating = false;
    private final Runnable runnableProgress = new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.11
        @Override // java.lang.Runnable
        public void run() {
            ProgressViewActivity progressViewActivity = ProgressViewActivity.this;
            progressViewActivity.updateProgressDialog(progressViewActivity.statistics);
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        getWindow().setFlags(1536, 1536);
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(C2014R.layout.activity_progress_view);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C2014R.id.main), new OnApplyWindowInsetsListener() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda4
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ProgressViewActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        wakeLockAquire();
        this.progressIndicator = (SquareOutlineProgressBar) findViewById(C2014R.id.progress_horizontal);
        findViewById(C2014R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgressViewActivity.this.dialog();
            }
        });
        try {
            startExport();
        } catch (Exception unused) {
            toStudio();
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        cancelDialog();
    }

    public void dialog() {
        Dialog dialog = new Dialog(this);
        this.dialog = dialog;
        dialog.setCancelable(true);
        this.dialog.requestWindowFeature(1);
        this.dialog.getWindow().setLayout(-1, -2);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        View inflate = LayoutInflater.from(this).inflate(C2014R.layout.layout_dialog, (ViewGroup) null);
        this.dialog.setContentView(inflate);
        TextCustumFont textCustumFont = (TextCustumFont) inflate.findViewById(C2014R.id.dialog_title);
        TextCustumFont textCustumFont2 = (TextCustumFont) inflate.findViewById(C2014R.id.dialog_message);
        ButtonCustumFont buttonCustumFont = (ButtonCustumFont) inflate.findViewById(C2014R.id.dialog_no);
        buttonCustumFont.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgressViewActivity.this.isCancel = true;
                ProgressViewActivity.this.toStudio();
            }
        });
        ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont) inflate.findViewById(C2014R.id.dialog_yes);
        buttonCustumFont2.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ProgressViewActivity.this.dialog != null) {
                    ProgressViewActivity.this.dialog.dismiss();
                }
            }
        });
        if (LocaleHelper.getLanguage(this).equals("ar")) {
            textCustumFont2.setText("هل أنت متأكد من مغادرة هذا العمل؟");
            textCustumFont.setText("خروج...");
            buttonCustumFont.setText("مغادرة");
            buttonCustumFont2.setText("متابعة");
        } else {
            textCustumFont2.setText("Are you sure want to leave this work ?");
            textCustumFont.setText("Exit...");
            buttonCustumFont.setText("Leave");
            buttonCustumFont2.setText("Continue");
        }
        this.dialog.show();
    }

    private void startExport() {
        String stringExtra;
        if (getIntent() == null || (stringExtra = getIntent().getStringExtra(Common.TEMPLATE)) == null) {
            return;
        }
        Template template = (Template) LocalPersistence.readObjectFromFile(this, stringExtra);
        this.mTemplate = template;
        if (template != null) {
            this.mUri = template.getUri_video();
        }
        prepareAllMedia(this.mTemplate.getEntityMediaList(), new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProgressViewActivity.this.m611x215c536f();
            }
        });
    }

    /* renamed from: lambda$startExport$1$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m611x215c536f() {
        FfmpegCodecChecker.detectCodecsAsync(new FfmpegCodecChecker.CodecCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda3
            @Override // hazem.nurmontage.videoquran.Utils.FfmpegCodecChecker.CodecCallback
            public final void onResult(FfmpegCodecChecker.CodecInfo codecInfo) {
                ProgressViewActivity.this.setupCommand(codecInfo);
            }
        });
    }

    private void clearFFmpeg() {
        Iterator<Long> it = this.id_ffmpeg.iterator();
        while (it.hasNext()) {
            try {
                FFmpegKit.cancel(it.next().longValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void checkAacEncoder(Context context) {
        try {
            File createTempFile = File.createTempFile("aac_test", ".m4a", context.getCacheDir());
            createTempFile.deleteOnExit();
            FFmpegKit.executeAsync("-y -floatValue lavfi -value anullsrc=channel_layout=stereo:sample_rate=44100 -t 1 -c:a aac -b:a 64k " + createTempFile.getAbsolutePath(), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda9
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public final void apply(FFmpegSession fFmpegSession) {
                    ProgressViewActivity.lambda$checkAacEncoder$2(fFmpegSession);
                }
            });
        } catch (Exception e) {
            Log.e("AAC workd", "Error checking AAC: " + e.getMessage());
        }
    }

    static /* synthetic */ void lambda$checkAacEncoder$2(FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            Log.e("AAC workd", "AAC encoder is available!");
        } else {
            Log.e("AAC workd", "AAC encoder NOT supported in this build!");
            Log.e("AAC workd", fFmpegSession.getAllLogsAsString());
        }
    }

    private String mFadeFilter(float floatValue, float floatValue2, boolean isFlag) {
        if (floatValue2 - 0.05f <= 0.0f) {
            floatValue2 = 0.01f;
        }
        return "fade=t=" + (isFlag ? "in" : "out") + ":st=" + Math.abs(floatValue) + ":d=" + Math.abs(floatValue2) + ":alpha=1:color=white,fps=60,format=rgba";
    }

    private String fadeInOut(float floatValue, float floatValue2, float floatValue3) {
        if (floatValue <= 0.0f) {
            floatValue = 0.01f;
        }
        if (floatValue2 - 0.05f <= 0.0f) {
            floatValue2 = 0.01f;
        }
        if (floatValue3 - 0.05f <= 0.0f) {
            floatValue3 = 0.01f;
        }
        return "fade=t=in:st=0:d=" + Math.abs(floatValue2) + ":alpha=1:color=white,fps=" + this.mTemplate.getFps() + ",format=rgba,fade=t=out:st=" + Math.abs(floatValue) + ":d=" + Math.abs(floatValue3) + ":alpha=1:color=white,fps=" + this.mTemplate.getFps() + ",format=rgba";
    }

    private String fadeFilter(String textValue, int value, float floatValue, float floatValue2, boolean isFlag) {
        String str2 = isFlag ? "in" : "out";
        return textValue + "fade=t=" + str2 + ":st=" + floatValue + ":d=" + Math.abs(floatValue2 - 0.05f) + ":alpha=1:color=white,fps=60,format=rgba[" + str2 + "_" + value + "];";
    }

    private String fadeFilter(String textValue, float floatValue, float floatValue2, boolean isFlag) {
        String str2 = isFlag ? "in" : "out";
        return "[" + textValue + "]fade=t=" + str2 + ":st=" + floatValue + ":d=" + Math.abs(floatValue2 - 0.05f) + ":alpha=1:color=white,fps=60,format=rgba[" + str2 + "_" + textValue + "];";
    }

    private String fadeFilter(int value, float floatValue, float floatValue2, boolean isFlag) {
        String textValue = isFlag ? "in" : "out";
        return "[" + value + "]fade=t=" + textValue + ":st=" + floatValue + ":d=" + Math.abs(floatValue2 - 0.05f) + ":alpha=1:color=white,fps=60,format=rgba[" + textValue + "_" + value + "];";
    }

    private String slideX(float floatValue, float floatValue2, float floatValue3, float f4, float f5, float floatValue6) {
        String textValue = "clip((t-" + floatValue + ")/" + floatValue2 + ",0,1)";
        return "'" + floatValue3 + "+(" + ("(" + f5 + "+(" + (floatValue6 - f5) + ")*" + ("(" + textValue + "*" + textValue + "*(3-2*" + textValue + "))") + ")") + ")*" + f4 + "'";
    }

    private String mSlideX(float floatValue, float floatValue2, float floatValue3, float f4, float f5, float floatValue6) {
        String textValue = "clip((t-" + floatValue + ")/" + floatValue2 + ",0,1)";
        return floatValue3 + "+(" + ("(" + f5 + "+(" + (floatValue6 - f5) + ")*" + ("(" + textValue + "*" + textValue + "*(3-2*" + textValue + "))") + ")") + ")*" + f4;
    }

    private File getOrCreateMask(int value, int value2, int value3) {
        File file = new File(getFilesDir(), "mask_" + value + "x" + value2 + "_r" + value3 + ".png");
        if (file.exists()) {
            return file;
        }
        Bitmap createBitmap = Bitmap.createBitmap(value, value2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        RectF rectF = new RectF(0.0f, 0.0f, value, value2);
        float floatValue = value3;
        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return file;
    }

    private File createTransparentBg(int value, int value2) {
        File file = new File(getFilesDir(), "bg_tr_.png");
        if (file.exists()) {
            return file;
        }
        Bitmap createBitmap = Bitmap.createBitmap(value, value2, Bitmap.Config.ARGB_8888);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return file;
    }

    private String generateVideoTimer(int value, final CountDownLatch countDownLatch, final Semaphore semaphore) {
        String textValue = this.mTemplate.getFolder_template() + "/timer.mov";
        int max = Math.max(value / 1000, 1);
        this.renderManager.addTask("timer prerender", max);
        float posXRight = this.mTemplate.getmTimeModel().getPosXRight();
        String color = this.mTemplate.getmTimeModel().getColor();
        float size = this.mTemplate.getmTimeModel().getSize();
        String str2 = getFilesDir().getAbsolutePath() + "/NotoNaskhArabic.ttf";
        ArrayList arrayList = new ArrayList();
        arrayList.add("-y");
        arrayList.add("-floatValue");
        arrayList.add("lavfi");
        arrayList.add("-value");
        arrayList.add("color=size=" + Math.round(this.mTemplate.getmTimeModel().getWidth_bitmap_progress() * 1.3f) + "x" + this.mTemplate.getmTimeModel().getHeight_bitmap_progress() + ":rate=10:duration=" + max + ":color=" + (ColorUtils.isColorDark(Color.parseColor(color)) ? "black@0" : "white@0") + ",format=rgba");
        int value2 = max + 1;
        arrayList.add("-vf");
        arrayList.add("drawtext=fontfile='" + str2 + "':text='%{eif\\:trunc(t/60)\\:d\\:2}\\:%{eif\\:trunc(mod(t\\,60))\\:d\\:2}':x=0.0:y=0.0:fontsize=" + size + ":fontcolor=" + color + ",drawtext=fontfile='" + str2 + "':text='-%{eif\\:trunc((" + value2 + "-t)/60)\\:d\\:2}\\:%{eif\\:trunc(mod(" + value2 + "-t\\,60))\\:d\\:2}':x=" + posXRight + ":y=0.0:fontsize=" + size + ":fontcolor=" + color);
        arrayList.add("-c:v");
        arrayList.add("qtrle");
        arrayList.add("-pix_fmt");
        arrayList.add("argb");
        arrayList.add("-preset");
        arrayList.add("veryfast");
        arrayList.add("-avoid_negative_ts");
        arrayList.add("make_zero");
        arrayList.add(textValue);
        try {
            semaphore.acquire();
            this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda12
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public final void apply(FFmpegSession fFmpegSession) {
                    ProgressViewActivity.this.m605x4bb4e94a(countDownLatch, semaphore, fFmpegSession);
                }
            }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
            return textValue;
        } catch (InterruptedException unused) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }

    /* renamed from: lambda$generateVideoTimer$3$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m605x4bb4e94a(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    private String runPreRender(String textValue, String str2, String str3, int value, String str4, boolean isFlag, final CountDownLatch countDownLatch, final Semaphore semaphore, String textValue5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        arrayList.add("-stream_loop");
        arrayList.add("-1");
        arrayList.add("-value");
        arrayList.add(textValue);
        if (str2 != null) {
            arrayList.add("-value");
            arrayList.add(str2);
        }
        arrayList.add("-filter_complex");
        arrayList.add(str3);
        if (isFlag) {
            arrayList.add("-c:v");
            arrayList.add("qtrle");
            arrayList.add("-pix_fmt");
            arrayList.add("rgba");
        } else if (textValue5 != null) {
            arrayList.add("-threads");
            arrayList.add("0");
            arrayList.add("-c:v");
            arrayList.add(textValue5);
            arrayList.add("-preset");
            arrayList.add("fast");
            arrayList.add("-crf");
            arrayList.add("18");
        } else {
            arrayList.add("-b:v");
            arrayList.add("4M");
        }
        arrayList.add("-r");
        arrayList.add(String.valueOf(this.mTemplate.getFps()));
        arrayList.add("-t");
        arrayList.add(Math.max(value, 500) + "ms");
        if (!isFlag) {
            arrayList.add("-movflags");
            arrayList.add("+faststart");
        }
        arrayList.add(str4);
        try {
            semaphore.acquire();
            this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda5
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public final void apply(FFmpegSession fFmpegSession) {
                    ProgressViewActivity.this.m609x77a4a45a(countDownLatch, semaphore, fFmpegSession);
                }
            }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
            return str4;
        } catch (InterruptedException unused) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }

    /* renamed from: lambda$runPreRender$4$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m609x77a4a45a(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    private void updateNext(CountDownLatch countDownLatch, Semaphore semaphore) {
        RenderManager renderManager = this.renderManager;
        if (renderManager != null) {
            renderManager.nextTask();
        }
        if (semaphore != null) {
            semaphore.release();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public String preRenderMask_Rounded(SquareBitmapModel squareBitmapModel, int value, CountDownLatch countDownLatch, Semaphore semaphore) {
        String uri_media_video = this.mTemplate.getUri_media_video();
        String textValue = this.mTemplate.getFolder_template() + "/rounded_" + System.currentTimeMillis() + ".mov";
        int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        int round = Math.round(squareBitmapModel.getRight());
        int round2 = Math.round(squareBitmapModel.getBottom());
        int round3 = Math.round(squareBitmapModel.getLef_square());
        int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        if ((round5 & 1) == 1) {
            round5++;
        }
        if ((round6 & 1) == 1) {
            round6++;
        }
        return runPreRender(uri_media_video, getOrCreateMask(round5, round6, (int) squareBitmapModel.getRaduis()).getAbsolutePath(), "[0:v]scale=" + max + ":" + max + ":force_original_aspect_ratio=increase,crop=" + round + ":" + round2 + ":" + round3 + ":" + round4 + ",scale=" + round5 + ":" + round6 + ":flags=lanczos[v];[v][1:v]alphamerge,format=rgba", value, textValue, true, countDownLatch, semaphore, null);
    }

    public String preRenderMask_Circle(SquareBitmapModel squareBitmapModel, int value, CountDownLatch countDownLatch, Semaphore semaphore) {
        String uri_media_video = this.mTemplate.getUri_media_video();
        String textValue = this.mTemplate.getFolder_template() + "/circle_" + System.currentTimeMillis() + ".mov";
        int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        int round = Math.round(squareBitmapModel.getRight());
        int round2 = Math.round(squareBitmapModel.getBottom());
        int round3 = Math.round(squareBitmapModel.getLef_square());
        int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        if ((round5 & 1) == 1) {
            round5++;
        }
        if ((round6 & 1) == 1) {
            round6++;
        }
        return runPreRender(uri_media_video, getOrCreateMaskCircle(round5, round6).getAbsolutePath(), "[0:v]scale=" + max + ":" + max + ":force_original_aspect_ratio=increase,crop=" + round + ":" + round2 + ":" + round3 + ":" + round4 + ",scale=" + round5 + ":" + round6 + ":flags=lanczos[v];[v][1:v]alphamerge,format=rgba", value, textValue, true, countDownLatch, semaphore, null);
    }

    public String preRender_NoMask(SquareBitmapModel squareBitmapModel, int value, CountDownLatch countDownLatch, Semaphore semaphore, String textValue) {
        String uri_media_video = this.mTemplate.getUri_media_video();
        String str2 = this.mTemplate.getFolder_template() + "/nomask_" + System.currentTimeMillis() + ".mp4";
        int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        int round = Math.round(squareBitmapModel.getRight());
        int round2 = Math.round(squareBitmapModel.getBottom());
        int round3 = Math.round(squareBitmapModel.getLef_square());
        int round4 = Math.round(squareBitmapModel.getTop_square());
        int round5 = Math.round(squareBitmapModel.getWidth_sqaure());
        int round6 = Math.round(squareBitmapModel.getHeight_square());
        if ((round5 & 1) == 1) {
            round5++;
        }
        if ((round6 & 1) == 1) {
            round6++;
        }
        return runPreRender(uri_media_video, null, "scale=" + max + ":" + max + ":force_original_aspect_ratio=increase,crop=" + round + ":" + round2 + ":" + round3 + ":" + round4 + ",scale=" + round5 + ":" + round6 + ":flags=lanczos,format=yuv420p", value, str2, false, countDownLatch, semaphore, textValue);
    }

    private File getOrCreateMaskCircle(int value, int value2) {
        Bitmap createBitmap = Bitmap.createBitmap(value, value2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(value / 2.0f, value2 / 2.0f, Math.min(value, value2) / 2.0f, paint);
        File file = new File(this.mTemplate.getFolder_template(), "circle_" + value + "x" + value2 + ".png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }

    public String preRenderVideo(int value, final CountDownLatch countDownLatch, final Semaphore semaphore, String textValue) {
        String uri_media_video = this.mTemplate.getUri_media_video();
        String str2 = this.mTemplate.getFolder_template() + "/layer_video_" + System.currentTimeMillis() + ".mp4";
        int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        String str3 = "[0:v]scale=" + max + ":" + max + ":force_original_aspect_ratio=increase:flags=lanczos,crop=" + this.mTemplate.getWidth() + ":" + this.mTemplate.getHeight() + ":" + ("(iw-" + this.mTemplate.getWidth() + ")/2") + ":" + ("(ih-" + this.mTemplate.getHeight() + ")/2") + "[v];[v][1:v]overlay,format=rgba";
        ArrayList arrayList = new ArrayList();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        arrayList.add("-stream_loop");
        arrayList.add("-1");
        arrayList.add("-value");
        arrayList.add(uri_media_video);
        File file = new File(this.mTemplate.getUri_bg_ffmpeg());
        if (file.exists() && file.isFile()) {
            arrayList.add("-value");
            arrayList.add(this.mTemplate.getUri_bg_ffmpeg());
            arrayList.add("-filter_complex");
            arrayList.add(str3);
            if (textValue != null) {
                arrayList.add("-threads");
                arrayList.add("0");
                arrayList.add("-c:v");
                arrayList.add(textValue);
                arrayList.add("-preset");
                arrayList.add("fast");
                arrayList.add("-crf");
                arrayList.add("18");
            } else {
                arrayList.add("-b:v");
                arrayList.add("4M");
            }
            arrayList.add("-r");
            arrayList.add(String.valueOf(this.mTemplate.getFps()));
            arrayList.add("-t");
            arrayList.add(Math.max(value, 500) + "ms");
            arrayList.add("-movflags");
            arrayList.add("+faststart");
            arrayList.add("-an");
            arrayList.add(str2);
            try {
                semaphore.acquire();
                this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda7
                    @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                    public final void apply(FFmpegSession fFmpegSession) {
                        ProgressViewActivity.this.m606xa8871725(countDownLatch, semaphore, fFmpegSession);
                    }
                }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
                return str2;
            } catch (InterruptedException unused) {
                this.renderManager.nextTask();
                countDownLatch.countDown();
                return null;
            }
        }
        updateNext(countDownLatch, semaphore);
        return null;
    }

    /* renamed from: lambda$preRenderVideo$5$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m606xa8871725(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    public String preRenderVideoHue(int value, final CountDownLatch countDownLatch, final Semaphore semaphore, String textValue) {
        String uri_media_video = this.mTemplate.getUri_media_video();
        String str2 = this.mTemplate.getFolder_template() + "/layer_video_" + System.currentTimeMillis() + ".mp4";
        int max = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
        int width = this.mTemplate.getWidth();
        int height = this.mTemplate.getHeight();
        String str3 = "[0:v]scale=" + max + ":" + max + ":force_original_aspect_ratio=increase:flags=lanczos,hue=s=0,crop=" + width + ":" + height + ":" + ("(iw-" + width + ")/2") + ":" + ("(ih-" + height + ")/2") + "[main];[main][1]overlay[fm];[2:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineProg];[3:v]loop=loop=-1:size=1:start=0,setpts=N/FRAME_RATE/TB[lineBg];[lineProg][lineBg]overlay=x=" + ((-this.mTemplate.getmTimeModel().getWidth_bitmap_progress()) + " + ((cos((t / (" + (value / 1000.0d) + ") + 1) * PI) / 2 + 0.5) * " + (this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset()) + ")") + ":y=0[bgApplied];[fm][bgApplied]overlay=" + this.mTemplate.getEntityProgressTemplate().getLeft() + ":" + this.mTemplate.getEntityProgressTemplate().getTop();
        ArrayList arrayList = new ArrayList();
        arrayList.add("-hide_banner");
        arrayList.add("-y");
        arrayList.add("-value");
        arrayList.add(uri_media_video);
        File file = new File(this.mTemplate.getUri_bg_ffmpeg());
        if (file.exists() && file.isFile()) {
            arrayList.add("-value");
            arrayList.add(this.mTemplate.getUri_bg_ffmpeg());
            arrayList.add("-value");
            arrayList.add(this.mTemplate.getFolder_template() + "/line_progress.png");
            arrayList.add("-value");
            arrayList.add(this.mTemplate.getFolder_template() + "/line_bg.png");
            arrayList.add("-filter_complex");
            arrayList.add(str3);
            if (textValue != null) {
                arrayList.add("-c:v");
                arrayList.add(textValue);
                arrayList.add("-preset");
                arrayList.add("fast");
                arrayList.add("-crf");
                arrayList.add("18");
            } else {
                arrayList.add("-c:v");
                arrayList.add("libx264");
                arrayList.add("-preset");
                arrayList.add("veryfast");
                arrayList.add("-crf");
                arrayList.add("18");
            }
            arrayList.add("-r");
            arrayList.add(String.valueOf(this.mTemplate.getFps()));
            arrayList.add("-t");
            arrayList.add(Math.max(value, 500) + "ms");
            arrayList.add("-movflags");
            arrayList.add("+faststart");
            arrayList.add("-an");
            arrayList.add(str2);
            try {
                semaphore.acquire();
                this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda8
                    @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                    public final void apply(FFmpegSession fFmpegSession) {
                        ProgressViewActivity.this.m607x87180b4a(countDownLatch, semaphore, fFmpegSession);
                    }
                }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
                return str2;
            } catch (InterruptedException unused) {
                this.renderManager.nextTask();
                countDownLatch.countDown();
                return null;
            }
        }
        updateNext(countDownLatch, semaphore);
        return null;
    }

    /* renamed from: lambda$preRenderVideoHue$6$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m607x87180b4a(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x089e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int addBasmala(EntityBismilahTemplate entityBismilahTemplate, int value, Semaphore semaphore, CountDownLatch countDownLatch, List<String> list, float floatValue) {
        String textValue;
        String str2;
        String str3;
        String str4;
        String textValue5;
        String str6;
        String str7;
        float floatValue2;
        String str8;
        String str9;
        int value2;
        boolean isFlag;
        float floatValue3;
        boolean z2;
        boolean z3;
        int value3;
        String str10;
        String str11;
        float f4;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i4;
        boolean z4;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        float f5;
        String str27;
        String str28;
        float floatValue6;
        String str29;
        String str30;
        String str31;
        String str32;
        boolean z5;
        String str33;
        String str34;
        String str35;
        float f7;
        String str36;
        String str37;
        String str38;
        float f8;
        String mSlideX;
        float f9;
        String mSlideX2;
        if (entityBismilahTemplate == null) {
            return value;
        }
        float abs = Math.abs(entityBismilahTemplate.getStart());
        float abs2 = Math.abs(entityBismilahTemplate.getEnd());
        File file = new File(this.mTemplate.getFolder_template() + "/" + entityBismilahTemplate.getFile());
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            return value;
        }
        if (entityBismilahTemplate.getTransition() != null) {
            if (entityBismilahTemplate.getTransition().isOut()) {
                floatValue3 = 0.0f;
                if (entityBismilahTemplate.getTransition().getDuration_out() > 0.0f) {
                    z2 = true;
                    z3 = !entityBismilahTemplate.getTransition().isIn() && entityBismilahTemplate.getTransition().getDuration_in() > floatValue3;
                    str2 = "/";
                    if (!z3 && z2) {
                        float duration_in = entityBismilahTemplate.getTransition().getDuration_in();
                        float btm_x = entityBismilahTemplate.getBtm_x();
                        float btm_y = entityBismilahTemplate.getBtm_y();
                        float fromW = entityBismilahTemplate.getTransition().getFromW();
                        String type_in = entityBismilahTemplate.getTransition().getType_in();
                        if (type_in.equals(TransitionType.FADE_IN.getValue())) {
                            str17 = "[ov";
                            str18 = ",";
                            str19 = ":enable='between(t,";
                            str20 = "]overlay=";
                            str21 = ")'[ov";
                            str22 = ":y=";
                            str23 = "[seg";
                            str24 = "/TB";
                            str25 = "setpts=PTS-STARTPTS+";
                            str26 = "][seg";
                            f5 = btm_y;
                        } else if (entityBismilahTemplate.getTransition().getType_out().equals(TransitionType.FADE_OUT.getValue())) {
                            str18 = ",";
                            str19 = ":enable='between(t,";
                            str20 = "]overlay=";
                            str21 = ")'[ov";
                            str22 = ":y=";
                            str23 = "[seg";
                            str24 = "/TB";
                            str25 = "setpts=PTS-STARTPTS+";
                            str26 = "][seg";
                            f5 = btm_y;
                            str17 = "[ov";
                        } else {
                            float duration_out = entityBismilahTemplate.getTransition().getDuration_out();
                            float abs3 = Math.abs(abs2 - duration_out);
                            String fadeInOut = fadeInOut(abs3 - abs, duration_in, duration_out);
                            int i5 = (int) (abs2 - abs);
                            str32 = "];";
                            String generateVideoSegment = generateVideoSegment(entityBismilahTemplate, value, fadeInOut, i5, countDownLatch, semaphore);
                            if (generateVideoSegment != null) {
                                list.add("-value");
                                list.add(generateVideoSegment);
                                int i6 = value + 1;
                                this.overlay.append("[").append(i6).append("]").append("setpts=PTS-STARTPTS+").append(abs).append("/TB").append("[seg").append(i6).append(str32);
                                if (type_in.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                    f8 = btm_x - fromW;
                                    value2 = i6;
                                    mSlideX = mSlideX(abs, duration_in, btm_x, fromW, -1.0f, 0.0f);
                                } else {
                                    value2 = i6;
                                    f8 = btm_x + fromW;
                                    mSlideX = mSlideX(abs, duration_in, btm_x, fromW, 1.0f, 0.0f);
                                }
                                String str39 = mSlideX;
                                if (entityBismilahTemplate.getTransition().getType_out().equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                    f9 = btm_x + fromW;
                                    mSlideX2 = mSlideX(abs3, duration_out, btm_x, fromW, 0.0f, 1.0f);
                                } else {
                                    f9 = btm_x - fromW;
                                    mSlideX2 = mSlideX(abs3, duration_out, btm_x, fromW, 0.0f, -1.0f);
                                }
                                StringBuilder append = new StringBuilder("'if(lt(t,").append(abs).append("),").append(f8).append(",if(lt(t,").append(abs + duration_in).append("),").append(str39).append(",if(lt(t,").append(abs3).append("),").append(btm_x).append(",if(lt(t,").append(abs3 + duration_out).append("),").append(mSlideX2);
                                str31 = ",";
                                str38 = "[ov";
                                str30 = ":enable='between(t,";
                                floatValue6 = abs2;
                                str29 = ")'[ov";
                                this.overlay.append(str38).append(value).append("][seg").append(value2).append("]overlay=x=").append(append.append(str31).append(f9).append("))))'").toString()).append(":y=").append(btm_y).append(str30).append(abs).append(str31).append(floatValue6).append(str29).append(value2).append(str32);
                                z5 = true;
                            } else {
                                floatValue6 = abs2;
                                str38 = "[ov";
                                str31 = ",";
                                str30 = ":enable='between(t,";
                                str29 = ")'[ov";
                                value2 = value;
                                z5 = false;
                            }
                            str27 = str38;
                            str28 = "]overlay=";
                            textValue = str31;
                            str9 = str28;
                            str4 = str29;
                            str7 = str32;
                            str3 = "-value";
                            isFlag = z5;
                            abs2 = floatValue6;
                            str6 = ":";
                            String str40 = str27;
                            textValue5 = str30;
                            floatValue2 = abs;
                            str8 = str40;
                        }
                        String str41 = str22;
                        if (type_in.equals(TransitionType.FADE_IN.getValue())) {
                            float duration_out2 = entityBismilahTemplate.getTransition().getDuration_out();
                            float abs4 = Math.abs(abs2 - duration_out2);
                            String type_out = entityBismilahTemplate.getTransition().getType_out();
                            String fadeInOut2 = fadeInOut(abs4 - abs, duration_in, duration_out2);
                            int i7 = (int) (abs2 - abs);
                            String str42 = str18;
                            String str43 = str23;
                            String str44 = str24;
                            String str45 = str25;
                            String generateVideoSegment2 = generateVideoSegment(entityBismilahTemplate, value, fadeInOut2, i7, countDownLatch, semaphore);
                            if (generateVideoSegment2 != null) {
                                list.add("-value");
                                list.add(generateVideoSegment2);
                                int i8 = value + 1;
                                StringBuilder append2 = this.overlay.append("[").append(i8).append("]").append(str45).append(abs).append(str44).append(str43).append(i8);
                                str32 = "];";
                                append2.append(str32);
                                if (type_out.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                    value2 = i8;
                                    str37 = slideX(abs4, duration_out2, btm_x, fromW, 0.0f, 1.0f);
                                } else {
                                    value2 = i8;
                                    if (type_out.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                        str37 = slideX(abs4, duration_out2, btm_x, fromW, 0.0f, -1.0f);
                                    } else {
                                        str37 = "" + btm_x;
                                    }
                                }
                                str35 = str17;
                                str33 = str20;
                                str30 = str19;
                                str36 = str42;
                                f7 = abs2;
                                str34 = str21;
                                this.overlay.append(str35).append(value).append(str26).append(value2).append(str33).append(str37).append(str41).append(f5).append(str30).append(abs).append(str36).append(f7).append(str34).append(value2).append(str32);
                                z5 = true;
                            } else {
                                str32 = "];";
                                str33 = str20;
                                str34 = str21;
                                str30 = str19;
                                str35 = str17;
                                f7 = abs2;
                                str36 = str42;
                                value2 = value;
                                z5 = false;
                            }
                            String str46 = str35;
                            str28 = str33;
                            str31 = str36;
                            floatValue6 = f7;
                            str29 = str34;
                            str27 = str46;
                        } else {
                            String str47 = str18;
                            String str48 = str20;
                            float f10 = f5;
                            String str49 = str21;
                            String str50 = str26;
                            String str51 = str19;
                            String str52 = str24;
                            String str53 = str25;
                            String str54 = str23;
                            String str55 = str17;
                            if (type_in.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                float duration_out3 = entityBismilahTemplate.getTransition().getDuration_out();
                                String generateVideoSegment3 = generateVideoSegment(entityBismilahTemplate, value, fadeInOut(Math.abs(abs2 - duration_out3) - abs, duration_in, duration_out3), (int) (abs2 - abs), countDownLatch, semaphore);
                                if (generateVideoSegment3 != null) {
                                    list.add("-value");
                                    list.add(generateVideoSegment3);
                                    int i9 = value + 1;
                                    StringBuilder append3 = this.overlay.append("[").append(i9).append("]").append(str53).append(abs).append(str52).append(str54).append(i9);
                                    str32 = "];";
                                    append3.append(str32);
                                    value2 = i9;
                                    str27 = str55;
                                    str28 = str48;
                                    StringBuilder append4 = this.overlay.append(str27).append(value).append(str50).append(value2).append(str28).append(slideX(abs, duration_in, btm_x, fromW, -1.0f, 0.0f)).append(str41).append(f10);
                                    str30 = str51;
                                    str31 = str47;
                                    floatValue6 = abs2;
                                    str29 = str49;
                                    append4.append(str30).append(abs).append(str31).append(floatValue6).append(str29).append(value2).append(str32);
                                    z5 = true;
                                } else {
                                    str29 = str49;
                                    str28 = str48;
                                    str30 = str51;
                                    str31 = str47;
                                    str32 = "];";
                                    floatValue6 = abs2;
                                    str27 = str55;
                                    value2 = value;
                                    z5 = false;
                                }
                            } else {
                                str27 = str55;
                                str28 = str48;
                                if (type_in.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                    float duration_out4 = entityBismilahTemplate.getTransition().getDuration_out();
                                    String generateVideoSegment4 = generateVideoSegment(entityBismilahTemplate, value, fadeInOut(Math.abs(abs2 - duration_out4) - abs, duration_in, duration_out4), (int) (abs2 - abs), countDownLatch, semaphore);
                                    if (generateVideoSegment4 != null) {
                                        list.add("-value");
                                        list.add(generateVideoSegment4);
                                        int i10 = value + 1;
                                        StringBuilder append5 = this.overlay.append("[").append(i10).append("]").append(str53).append(abs).append(str52).append(str54).append(i10);
                                        str32 = "];";
                                        append5.append(str32);
                                        value2 = i10;
                                        str27 = str27;
                                        str28 = str28;
                                        StringBuilder append6 = this.overlay.append(str27).append(value).append(str50).append(value2).append(str28).append(slideX(abs, duration_in, btm_x, fromW, 1.0f, 0.0f)).append(str41).append(f10);
                                        str30 = str51;
                                        str31 = str47;
                                        floatValue6 = abs2;
                                        str29 = str49;
                                        append6.append(str30).append(abs).append(str31).append(floatValue6).append(str29).append(value2).append(str32);
                                        z5 = true;
                                    } else {
                                        str29 = str49;
                                        str30 = str51;
                                        str31 = str47;
                                        str32 = "];";
                                        floatValue6 = abs2;
                                        str28 = str28;
                                        str27 = str27;
                                    }
                                } else {
                                    floatValue6 = abs2;
                                    str29 = str49;
                                    str30 = str51;
                                    str31 = str47;
                                    str32 = "];";
                                }
                                value2 = value;
                                z5 = false;
                            }
                        }
                        textValue = str31;
                        str9 = str28;
                        str4 = str29;
                        str7 = str32;
                        str3 = "-value";
                        isFlag = z5;
                        abs2 = floatValue6;
                        str6 = ":";
                        String str402 = str27;
                        textValue5 = str30;
                        floatValue2 = abs;
                        str8 = str402;
                    } else if (!z3) {
                        float duration_in2 = entityBismilahTemplate.getTransition().getDuration_in();
                        float btm_x2 = entityBismilahTemplate.getBtm_x();
                        float btm_y2 = entityBismilahTemplate.getBtm_y();
                        float fromW2 = entityBismilahTemplate.getTransition().getFromW();
                        String type_in2 = entityBismilahTemplate.getTransition().getType_in();
                        String generateVideoSegment5 = generateVideoSegment(entityBismilahTemplate, value, mFadeFilter(0.0f, duration_in2, true), (int) (abs2 - abs), countDownLatch, semaphore);
                        if (generateVideoSegment5 != null) {
                            list.add("-value");
                            list.add(generateVideoSegment5);
                            int i11 = value + 1;
                            this.overlay.append("[").append(i11).append("]").append("setpts=PTS-STARTPTS+").append(abs).append("/TB").append("[seg").append(i11).append("];");
                            if (type_in2.equals(TransitionType.FADE_IN.getValue())) {
                                str13 = "]overlay=";
                                f4 = abs2;
                                this.overlay.append("[ov").append(value).append("][seg").append(i11).append(str13).append(btm_x2).append(":").append(btm_y2).append(":enable='between(t,").append(abs).append(",").append(f4).append(")'[ov").append(i11).append("];");
                                str11 = ":";
                                i4 = i11;
                                str10 = "-value";
                                str15 = ",";
                                str12 = ":enable='between(t,";
                                str14 = ")'[ov";
                            } else {
                                str13 = "]overlay=";
                                if (type_in2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                    str11 = ":";
                                    i4 = i11;
                                    this.overlay.append("[ov").append(value).append("][seg").append(i4).append(str13).append(slideX(abs, duration_in2, btm_x2, fromW2, -1.0f, 0.0f)).append(":y=").append(btm_y2).append(":enable='between(t,").append(abs).append(",").append(abs2).append(")'[ov").append(i4).append("];");
                                    str15 = ",";
                                    str14 = ")'[ov";
                                    str10 = "-value";
                                    f4 = abs2;
                                    str12 = ":enable='between(t,";
                                } else {
                                    str11 = ":";
                                    i4 = i11;
                                    if (type_in2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                        str10 = "-value";
                                        str12 = ":enable='between(t,";
                                        str15 = ",";
                                        f4 = abs2;
                                        str14 = ")'[ov";
                                        str16 = "];";
                                        this.overlay.append("[ov").append(value).append("][seg").append(i4).append(str13).append(slideX(abs, duration_in2, btm_x2, fromW2, 1.0f, 0.0f)).append(":y=").append(btm_y2).append(str12).append(abs).append(str15).append(f4).append(str14).append(i4).append(str16);
                                    } else {
                                        str15 = ",";
                                        str16 = "];";
                                        str10 = "-value";
                                        f4 = abs2;
                                        str14 = ")'[ov";
                                        str12 = ":enable='between(t,";
                                    }
                                    z4 = true;
                                }
                            }
                            str16 = "];";
                            z4 = true;
                        } else {
                            str10 = "-value";
                            str11 = ":";
                            f4 = abs2;
                            str12 = ":enable='between(t,";
                            str13 = "]overlay=";
                            str14 = ")'[ov";
                            str15 = ",";
                            str16 = "];";
                            i4 = value;
                            z4 = false;
                        }
                        str7 = str16;
                        str4 = str14;
                        value2 = i4;
                        floatValue2 = abs;
                        str8 = "[ov";
                        str9 = str13;
                        str3 = str10;
                        isFlag = z4;
                        str6 = str11;
                        abs2 = f4;
                        textValue = str15;
                        textValue5 = str12;
                    } else if (z2) {
                        float duration_out5 = entityBismilahTemplate.getTransition().getDuration_out();
                        float abs5 = Math.abs(abs2 - duration_out5);
                        float btm_x3 = entityBismilahTemplate.getBtm_x();
                        float btm_y3 = entityBismilahTemplate.getBtm_y();
                        float fromW3 = entityBismilahTemplate.getTransition().getFromW();
                        String type_out2 = entityBismilahTemplate.getTransition().getType_out();
                        int i12 = (int) (abs2 - abs);
                        String generateVideoSegment6 = generateVideoSegment(entityBismilahTemplate, value, mFadeFilter(i12 - duration_out5, duration_out5, false), i12, countDownLatch, semaphore);
                        if (generateVideoSegment6 != null) {
                            list.add("-value");
                            list.add(generateVideoSegment6);
                            int i13 = value + 1;
                            if (type_out2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                this.overlay.append("[").append(i13).append("]").append("setpts=PTS-STARTPTS+").append(abs).append("/TB").append("[seg").append(i13).append("];");
                                this.overlay.append("[ov").append(value).append("][seg").append(i13).append("]overlay=").append(slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, 1.0f)).append(":y=").append(btm_y3).append(":enable='between(t,").append(abs).append(",").append(abs2).append(")'").append("[ov").append(i13).append("];");
                                abs2 = abs2;
                                str7 = "];";
                                value3 = i13;
                                str3 = "-value";
                                str4 = ")'[ov";
                                textValue = ",";
                                str9 = "]overlay=";
                                str6 = ":";
                                textValue5 = ":enable='between(t,";
                                floatValue2 = abs;
                                str8 = "[ov";
                            } else {
                                str3 = "-value";
                                str7 = "];";
                                if (type_out2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                    this.overlay.append("[").append(i13).append("]").append("setpts=PTS-STARTPTS+").append(abs).append("/TB").append("[seg").append(i13).append(str7);
                                    str8 = "[ov";
                                    str9 = "]overlay=";
                                    floatValue2 = abs;
                                    str7 = str7;
                                    this.overlay.append(str8).append(value).append("][seg").append(i13).append(str9).append(slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, -1.0f)).append(":y=").append(btm_y3).append(":enable='between(t,").append(floatValue2).append(",").append(abs2).append(")'").append(str8).append(i13).append(str7);
                                    abs2 = abs2;
                                    value3 = i13;
                                    textValue5 = ":enable='between(t,";
                                    str6 = ":";
                                    str4 = ")'[ov";
                                    textValue = ",";
                                } else {
                                    value3 = i13;
                                    floatValue2 = abs;
                                    str8 = "[ov";
                                    str9 = "]overlay=";
                                    if (type_out2.equals(TransitionType.FADE_OUT.getValue())) {
                                        this.overlay.append("[").append(value3).append("]").append("setpts=PTS-STARTPTS+").append(floatValue2).append("/TB").append("[seg").append(value3).append(str7);
                                        str6 = ":";
                                        textValue5 = ":enable='between(t,";
                                        textValue = ",";
                                        StringBuilder append7 = this.overlay.append(str8).append(value).append("][seg").append(value3).append(str9).append(btm_x3).append(str6).append(btm_y3).append(textValue5).append(floatValue2).append(textValue);
                                        abs2 = abs2;
                                        str4 = ")'[ov";
                                        append7.append(abs2).append(str4).append(value3).append(str7);
                                    } else {
                                        abs2 = abs2;
                                        textValue = ",";
                                        textValue5 = ":enable='between(t,";
                                        str6 = ":";
                                        str4 = ")'[ov";
                                    }
                                }
                            }
                            value2 = value3;
                            isFlag = true;
                        } else {
                            floatValue2 = abs;
                            str3 = "-value";
                            str7 = "];";
                            str8 = "[ov";
                            textValue5 = ":enable='between(t,";
                            str9 = "]overlay=";
                            str6 = ":";
                            str4 = ")'[ov";
                            abs2 = abs2;
                            textValue = ",";
                        }
                    } else {
                        textValue = ",";
                        floatValue2 = abs;
                        str8 = "[ov";
                        str7 = "];";
                        str3 = "-value";
                        textValue5 = ":enable='between(t,";
                        str6 = ":";
                        str4 = ")'[ov";
                        abs2 = abs2;
                        str9 = "]overlay=";
                    }
                    if (isFlag) {
                        return value2;
                    }
                    list.add(str3);
                    list.add(this.mTemplate.getFolder_template() + str2 + entityBismilahTemplate.getFile());
                    int i14 = value2 + 1;
                    this.overlay.append(str8).append(value2).append("][").append(i14).append(str9).append(entityBismilahTemplate.getBtm_x()).append(str6).append(entityBismilahTemplate.getBtm_y()).append(textValue5).append(floatValue2).append(textValue).append(Math.abs(abs2 - floatValue)).append(str4).append(i14).append(str7);
                    this.renderManager.addTask("basmal prerender", 0);
                    this.renderManager.nextTask();
                    countDownLatch.countDown();
                    return i14;
                }
            } else {
                floatValue3 = 0.0f;
            }
            z2 = false;
            if (entityBismilahTemplate.getTransition().isIn()) {
            }
            str2 = "/";
            if (!z3) {
            }
            if (!z3) {
            }
            if (isFlag) {
            }
        } else {
            textValue = ",";
            str2 = "/";
            str3 = "-value";
            str4 = ")'[ov";
            textValue5 = ":enable='between(t,";
            str6 = ":";
            str7 = "];";
            floatValue2 = abs;
            str8 = "[ov";
            str9 = "]overlay=";
        }
        value2 = value;
        isFlag = false;
        if (isFlag) {
        }
    }

    public void prepareAllMedia(final List<EntityMedia> list, final Runnable runnable) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                ProgressViewActivity.this.m608xa2a9e2f5(list, runnable);
            }
        });
    }

    /* renamed from: lambda$prepareAllMedia$7$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m608xa2a9e2f5(List list, Runnable runnable) {
        try {
            if (list != null) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                    if (runnable == null) {
                        return;
                    }
                }
                if (!list.isEmpty()) {
                    for (int value = 0; value < list.size(); value++) {
                        EntityMedia entityMedia = (EntityMedia) list.get(value);
                        if (entityMedia != null) {
                            try {
                                if (entityMedia.getEnd() >= entityMedia.getStart() && entityMedia.getPath_ffmpeg_effect() == null && entityMedia.getUri() != null) {
                                    String downloadFile = entityMedia.getUri().startsWith("http") ? AudioUtils.downloadFile(this, entityMedia.getUri(), this.mTemplate.getFolder_template()) : AudioUtils.copyFromUri(this, Uri.parse(entityMedia.getUri()), this.mTemplate.getFolder_template());
                                    if (downloadFile != null) {
                                        entityMedia.setPath_ffmpeg(downloadFile);
                                        entityMedia.setPath_ffmpeg_effect(downloadFile);
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            Log.w("AudioUtils", "Media list is null or empty");
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            if (runnable != null) {
                runnable.run();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x1bb9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1ccf A[Catch: Exception -> 0x1e6e, TryCatch #0 {Exception -> 0x1e6e, blocks: (B:194:0x1cc3, B:196:0x1ccf, B:201:0x1cf1, B:203:0x1d00, B:206:0x1d07), top: B:193:0x1cc3 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1e89  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1ef1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x1f1a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1ecc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1e6c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1e52 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0f07  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupCommand(FfmpegCodecChecker.CodecInfo codecInfo) {
        String textValue;
        String str2;
        Semaphore semaphore;
        CountDownLatch countDownLatch;
        int value;
        int value2;
        CountDownLatch countDownLatch2;
        String str3;
        String str4;
        String textValue5;
        String str6;
        int value3;
        String str7;
        Semaphore semaphore2;
        CountDownLatch countDownLatch3;
        String str8;
        int i4;
        int i5;
        String str9;
        int i6;
        int i7;
        int i8;
        int i9;
        String str10;
        ArrayList arrayList;
        boolean isFlag;
        String str11;
        String str12;
        String str13;
        int i10;
        String str14;
        String str15;
        float floatValue;
        int i11;
        int i12;
        String str16;
        String str17;
        ArrayList arrayList2;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        float floatValue2;
        int i13;
        String str24;
        String str25;
        String str26;
        float floatValue3;
        String str27;
        String str28;
        int i14;
        ArrayList arrayList3;
        String str29;
        String str30;
        String str31;
        String str32;
        int i15;
        String str33;
        String str34;
        String str35;
        String str36;
        ArrayList arrayList4;
        String str37;
        String str38;
        String str39;
        float f4;
        float f5;
        float floatValue6;
        float f7;
        ArrayList arrayList5;
        String str40;
        String str41;
        String str42;
        float f8;
        String str43;
        int i16;
        String str44;
        String str45;
        String str46;
        ArrayList arrayList6;
        int i17;
        String str47;
        float f9;
        int i18;
        float f10;
        String mSlideX;
        ArrayList arrayList7;
        float f11;
        String str48;
        float f12;
        String mSlideX2;
        Semaphore semaphore3;
        int i19;
        int i20;
        Semaphore semaphore4;
        String str49;
        String str50;
        int i21;
        int max = Math.max(this.mTemplate.getDuration(), 1000);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add("-hide_banner");
        int i22 = max / 1000;
        this.renderManager.addTask("Vido prerender", i22);
        String str51 = codecInfo.videoCodec;
        Semaphore semaphore5 = new Semaphore(4);
        String str52 = "][";
        String str53 = "]overlay=";
        String str54 = "]";
        String str55 = "-value";
        String str56 = "[ov";
        int i23 = i22;
        if (this.mTemplate.getIpad_type() == IpadType.IPAD.ordinal() || this.mTemplate.getIpad_type() == IpadType.IPAD_UNBLUR.ordinal() || this.mTemplate.getIpad_type() == IpadType.IPAD_CLASSIC.ordinal() || this.mTemplate.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal() || this.mTemplate.getIpad_type() == IpadType.ROUND_RECT.ordinal() || this.mTemplate.getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || this.mTemplate.getIpad_type() == IpadType.RECT.ordinal()) {
            textValue = ":y=";
            str2 = "overlay=";
            File file = new File(this.mTemplate.getUri_bg_ffmpeg());
            if (file.exists() && file.isFile()) {
                CountDownLatch countDownLatch4 = new CountDownLatch(this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0) + 1 + (this.mTemplate.getEntityBismilahTemplate() != null ? 1 : 0) + (this.mTemplate.getEntityIsti3adaTemplate() != null ? 1 : 0));
                arrayList8.add("-value");
                arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                arrayList8.add("-value");
                arrayList8.add(generateVideoTimer(max, countDownLatch4, semaphore5));
                semaphore = semaphore5;
                this.overlay.append("[").append(0).append("][").append(1).append("]overlay=").append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(":").append(this.mTemplate.getmTimeModel().getPosY() + this.mTemplate.getEntityProgressTemplate().getTop()).append("[bg];");
                arrayList8.add("-value");
                arrayList8.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                this.overlay.append("[").append(2).append(":v]").append("loop=loop=-1:size=1:start=0").append(",format=rgba").append("[lp];");
                arrayList8.add("-value");
                arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                if (this.mTemplate.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                    String str57 = "[tmp2]";
                    this.overlay.append("[lp][").append(3).append("]overlay=x='").append("(-" + this.mTemplate.getmTimeModel().getWidth_bitmap_progress() + "*(1-" + ("clip(t/" + ("(" + (max / 1000.0d) + ")") + ",0,1)") + "))").append("':y=0:shortest=0").append(str57).append(";");
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg_tmp.png");
                    this.overlay.append("[bg]").append(str57).append(str2).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(":").append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ps];");
                    value = 4;
                    str56 = "[ov";
                    this.overlay.append("[ps][").append(4).append("]overlay='if(lte(t,0),-100,").append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(")':").append(this.mTemplate.getEntityProgressTemplate().getTop()).append(str56).append(4).append("];");
                    str53 = "]overlay=";
                } else {
                    str56 = "[ov";
                    int width_bitmap_progress = this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset();
                    this.overlay.append("[").append(3).append("]").append("[lp]overlay='if(lte(t,0),-").append(this.mTemplate.getmTimeModel().getWidth_bitmap_progress()).append(",min(").append(width_bitmap_progress).append(",(").append(width_bitmap_progress).append(" * ((cos((t / (").append(max).append("/1000.0) + 1) * PI) / 2) + 0.5))))':0[ov").append(2).append("];");
                    str53 = "]overlay=";
                    this.overlay.append("[bg]").append(str56).append(2).append(str53).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(":").append(this.mTemplate.getEntityProgressTemplate().getTop()).append(str56).append(3).append("];");
                    value = 3;
                }
                countDownLatch = countDownLatch4;
            } else {
                semaphore = semaphore5;
                countDownLatch = new CountDownLatch(this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0) + (this.mTemplate.getEntityBismilahTemplate() != null ? 1 : 0) + (this.mTemplate.getEntityIsti3adaTemplate() != null ? 1 : 0));
                value = 0;
            }
            value2 = value;
            countDownLatch2 = countDownLatch;
        } else {
            CountDownLatch countDownLatch5 = new CountDownLatch(this.mTemplate.getQuranEntityList().size() + this.mTemplate.getTranslationTemplateList().size() + (this.mTemplate.isVideoSquare() ? 1 : 0) + (this.mTemplate.getEntityBismilahTemplate() != null ? 1 : 0) + (this.mTemplate.getEntityIsti3adaTemplate() != null ? 1 : 0));
            if (this.mTemplate.getIpad_type() == IpadType.HEART.ordinal()) {
                File file2 = new File(this.mTemplate.getUri_bg_ffmpeg());
                if (file2.exists() && file2.isFile()) {
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                }
                arrayList8.add("-value");
                arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                arrayList8.add("-floatValue");
                arrayList8.add("lavfi");
                arrayList8.add("-value");
                arrayList8.add("color=size=" + this.mTemplate.getWidth() + "x" + this.mTemplate.getmTimeModel().getHeightShape() + ":color=#00000000");
                String valueOf = String.valueOf(max / 1000.0d);
                float heightShape = this.mTemplate.getmTimeModel().getHeightShape();
                this.overlay.append("[").append(2).append("][").append(1).append("]overlay=x=0:y='").append(heightShape).append("*(1-clip(t/").append(valueOf).append(",0,1))*0.8 + ").append(heightShape).append("*(1-(0.5-0.5*cos(PI*clip(t/").append(valueOf).append(",0,1))))*0.2'").append("[ov").append(1).append("];");
                textValue = ":y=";
                this.overlay.append("[0]").append("[ov").append(1).append("]overlay=").append(0).append(":").append(this.mTemplate.getEntityProgressTemplate().getTop() + this.mTemplate.getmTimeModel().getStartShape()).append("[ov").append(2).append("];");
                arrayList8.add("-value");
                arrayList8.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                this.overlay.append("[ov").append(2).append("]").append("[").append(3).append("]overlay=").append(0).append(":").append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ov").append(3).append("];");
                value2 = 3;
                str2 = "overlay=";
                countDownLatch2 = countDownLatch5;
                str52 = "][";
            } else {
                textValue = ":y=";
                if (this.mTemplate.getIpad_type() == IpadType.BATTERY.ordinal()) {
                    File file3 = new File(this.mTemplate.getUri_bg_ffmpeg());
                    if (file3.exists() && file3.isFile()) {
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                    }
                    arrayList8.add("-loop");
                    arrayList8.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                    double startShape = (-this.mTemplate.getmTimeModel().getWidthShape()) + this.mTemplate.getmTimeModel().getStartShape();
                    String valueOf2 = String.valueOf(max / 1000.0d);
                    float widthShape = this.mTemplate.getmTimeModel().getWidthShape();
                    this.overlay.append("[0]").append("[").append(1).append("]").append("overlay=x='").append(startShape).append("+(").append(widthShape).append("*(clip(t/").append(valueOf2).append(",0,1))*0.8").append("+").append(widthShape).append("*(0.5-0.5*cos(PI*clip(t/").append(valueOf2).append(",0,1)))*0.2").append(")'").append(textValue).append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ov").append(1).append("];");
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                    this.overlay.append("[ov").append(1).append("]").append("[").append(2).append("]overlay=0:").append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ov").append(2).append("];");
                    str2 = "overlay=";
                    countDownLatch2 = countDownLatch5;
                    str52 = "][";
                    value2 = 2;
                } else if (this.mTemplate.getIpad_type() == IpadType.CASSET.ordinal() || this.mTemplate.getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                    textValue = textValue;
                    str2 = "overlay=";
                    str52 = "][";
                    File file4 = new File(this.mTemplate.getUri_bg_ffmpeg());
                    if (file4.exists() && file4.isFile()) {
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                    }
                    arrayList8.add("-loop");
                    arrayList8.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                    this.overlay.append("[").append(1).append("]").append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append("[rot").append(1).append("];");
                    this.overlay.append("[0]").append("[rot").append(1).append("]").append(str2).append(this.mTemplate.getmTimeModel().getStartShape()).append(":").append(this.mTemplate.getmTimeModel().getHeightShape()).append("[ov").append(1).append("];");
                    this.overlay.append("[").append(1).append("]").append("rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append("[rot").append(1).append("];");
                    this.overlay.append("[ov").append(1).append("]").append("[rot").append(1).append("]").append(str2).append(this.mTemplate.getmTimeModel().getWidthShape()).append(":").append(this.mTemplate.getmTimeModel().getHeightShape()).append("[ov").append(1).append("];");
                    semaphore = semaphore5;
                    countDownLatch2 = countDownLatch5;
                    value2 = 1;
                } else if (this.mTemplate.getIpad_type() == IpadType.CASSET_IMG.ordinal()) {
                    if (this.mTemplate.isVideoSquare()) {
                        arrayList8.add("-stream_loop");
                        arrayList8.add("-1");
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getUri_media_video());
                        String str58 = "(iw-" + this.mTemplate.getWidth() + ")/2";
                        String str59 = "(ih-" + this.mTemplate.getHeight() + ")/2";
                        textValue = textValue;
                        int max2 = Math.max(this.mTemplate.getWidth(), this.mTemplate.getHeight());
                        str49 = "]overlay=";
                        this.overlay.append("[").append(0).append(":v]scale=").append(max2).append(":").append(max2).append(":force_original_aspect_ratio=increase[sc];[sc]crop=").append(this.mTemplate.getWidth()).append(":").append(this.mTemplate.getHeight()).append(":").append(str58).append(":").append(str59).append(",format=yuva420p").append("[ov").append(0).append("];");
                        File file5 = new File(this.mTemplate.getUri_bg_ffmpeg());
                        if (file5.exists() && file5.isFile()) {
                            arrayList8.add("-value");
                            arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                            str52 = "][";
                            this.overlay.append("[ov").append(0).append(str52).append(1).append("]overlay[ov").append(1).append("];");
                            i21 = 1;
                        } else {
                            str52 = "][";
                            i21 = 0;
                        }
                        str50 = "[ov" + i21 + "]";
                    } else {
                        str49 = "]overlay=";
                        textValue = textValue;
                        str52 = "][";
                        File file6 = new File(this.mTemplate.getUri_bg_ffmpeg());
                        if (file6.exists() && file6.isFile()) {
                            arrayList8.add("-value");
                            arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                        }
                        str50 = "[0]";
                        i21 = 0;
                    }
                    arrayList8.add("-loop");
                    arrayList8.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    arrayList8.add("-value");
                    arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                    int i24 = i21 + 1;
                    this.overlay.append("[").append(i24).append("]").append("rotate=angle=0.4*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append("[rot").append(i24).append("];");
                    str2 = "overlay=";
                    this.overlay.append(str50).append("[rot").append(i24).append("]").append(str2).append(this.mTemplate.getmTimeModel().getStartShape()).append(":").append(this.mTemplate.getmTimeModel().getHeightShape()).append("[ov").append(i24).append("];");
                    this.overlay.append("[").append(i24).append("]").append("rotate=angle=-0.5*PI*t:ow=iw:oh=ih:fillcolor=#00000000").append("[rot").append(i24).append("];");
                    this.overlay.append("[ov").append(i24).append("]").append("[rot").append(i24).append("]").append(str2).append(this.mTemplate.getmTimeModel().getWidthShape()).append(":").append(this.mTemplate.getmTimeModel().getHeightShape()).append("[ov").append(i24).append("];");
                    value2 = i24;
                    semaphore = semaphore5;
                    countDownLatch2 = countDownLatch5;
                    str53 = str49;
                } else {
                    textValue = textValue;
                    str2 = "overlay=";
                    str52 = "][";
                    File file7 = new File(this.mTemplate.getUri_bg_ffmpeg());
                    if (this.mTemplate.isVideoSquare() || !file7.exists() || !file7.isFile()) {
                        str53 = "]overlay=";
                    } else if (this.mTemplate.getIpad_type() == IpadType.BLUE_TYPE.ordinal()) {
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getFolder_template() + "/line_progress.png");
                        this.overlay.append("[").append(1).append("]").append("loop=loop=-1:size=1:start=0").append("[lp];");
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getFolder_template() + "/line_bg.png");
                        this.overlay.append("[lp]").append("[").append(2).append("]overlay=x=").append(-this.mTemplate.getmTimeModel().getWidth_bitmap_progress()).append(" + ( ((cos((t / (").append(max).append("/1000.0) + 1) * PI) / 2) + 0.5) * ").append(this.mTemplate.getmTimeModel().getWidth_bitmap_progress() - this.mTemplate.getmTimeModel().getProgress_offset()).append(" )").append(":y=0").append("[ov").append(1).append("];");
                        str53 = "]overlay=";
                        this.overlay.append("[0]").append("[ov").append(1).append(str53).append(this.mTemplate.getEntityProgressTemplate().getLeft()).append(":").append(this.mTemplate.getEntityProgressTemplate().getTop()).append("[ov").append(2).append("];");
                        semaphore = semaphore5;
                        countDownLatch2 = countDownLatch5;
                        value2 = 2;
                    } else {
                        str53 = "]overlay=";
                        arrayList8.add("-loop");
                        arrayList8.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        arrayList8.add("-value");
                        arrayList8.add(this.mTemplate.getUri_bg_ffmpeg());
                        this.overlay.append("[0]format=yuv420p[ov").append(0).append("];");
                    }
                    semaphore = semaphore5;
                    countDownLatch2 = countDownLatch5;
                    value2 = 0;
                }
            }
            semaphore = semaphore5;
        }
        if (this.mTemplate.isVideoSquare()) {
            File file8 = new File(this.mTemplate.getUri_media_video());
            if (file8.isFile() && file8.exists()) {
                str4 = str52;
                this.renderManager.addTask("Video prerender", i23);
                if (this.mTemplate.getIpad_type() == IpadType.IPAD.ordinal() || this.mTemplate.getIpad_type() == IpadType.IPAD_UNBLUR.ordinal()) {
                    str3 = str53;
                    i23 = i23;
                    textValue5 = str51;
                    Semaphore semaphore6 = semaphore;
                    str6 = "];";
                    value3 = value2;
                    str7 = "[";
                    countDownLatch3 = countDownLatch2;
                    str8 = ":";
                    SquareBitmapModel squareBitmapModel = this.mTemplate.getSquareBitmapModel();
                    i4 = max;
                    if (squareBitmapModel != null) {
                        semaphore2 = semaphore6;
                        String preRenderMask_Rounded = preRenderMask_Rounded(squareBitmapModel, i4, countDownLatch3, semaphore2);
                        arrayList8.add("-value");
                        arrayList8.add(preRenderMask_Rounded);
                        int i25 = value3 + 1;
                        this.overlay.append(str56).append(value3).append("]").append(str7).append(i25).append(":v]").append(str2).append(squareBitmapModel.getPosX()).append(str8).append(squareBitmapModel.getPosY()).append(str56).append(i25).append(str6);
                        value2 = i25;
                        i5 = i23;
                        float fps = (i5 / this.mTemplate.getFps()) * 2.0E-4f;
                        Semaphore semaphore7 = semaphore2;
                        int i26 = i4;
                        String str60 = str6;
                        str9 = textValue5;
                        String str61 = str8;
                        int addBasmala = addBasmala(this.mTemplate.getEntityBismilahTemplate(), addBasmala(this.mTemplate.getEntityIsti3adaTemplate(), value2, semaphore2, countDownLatch3, arrayList8, fps), semaphore7, countDownLatch3, arrayList8, fps);
                        i6 = 0;
                        while (i6 < this.mTemplate.getQuranEntityList().size()) {
                            EntityQuranTemplate entityQuranTemplate = this.mTemplate.getQuranEntityList().get(i6);
                            float abs = Math.abs(entityQuranTemplate.getStart());
                            float abs2 = Math.abs(entityQuranTemplate.getEnd());
                            if (abs >= abs2) {
                                floatValue = fps;
                                i11 = i6;
                                i12 = addBasmala;
                                str16 = str54;
                                str17 = str7;
                                arrayList2 = arrayList8;
                                str18 = str55;
                                str19 = str61;
                                str20 = str60;
                                str21 = str4;
                                str22 = str3;
                                str23 = str56;
                            } else {
                                File file9 = new File(this.mTemplate.getFolder_template() + "/" + entityQuranTemplate.getFile());
                                if (file9.exists() && file9.isFile() && file9.length() > 0) {
                                    if (entityQuranTemplate.getTransition() != null) {
                                        boolean z2 = entityQuranTemplate.getTransition().isOut() && entityQuranTemplate.getTransition().getDuration_out() > 0.0f;
                                        boolean z3 = entityQuranTemplate.getTransition().isIn() && entityQuranTemplate.getTransition().getDuration_in() > 0.0f;
                                        floatValue = fps;
                                        String str62 = str61;
                                        String str63 = str56;
                                        if (z3 && z2) {
                                            float duration_in = entityQuranTemplate.getTransition().getDuration_in();
                                            float btm_x = entityQuranTemplate.getBtm_x();
                                            float btm_y = entityQuranTemplate.getBtm_y();
                                            float fromW = entityQuranTemplate.getTransition().getFromW();
                                            String type_in = entityQuranTemplate.getTransition().getType_in();
                                            if (type_in.equals(TransitionType.FADE_IN.getValue())) {
                                                str16 = str54;
                                                str17 = str7;
                                                str38 = ",";
                                                str39 = ")'[ov";
                                                f4 = btm_y;
                                                f5 = btm_x;
                                                floatValue6 = abs2;
                                                f7 = duration_in;
                                                i11 = i6;
                                                arrayList5 = arrayList8;
                                                str40 = type_in;
                                                str41 = str60;
                                                str42 = textValue;
                                                f8 = abs;
                                                str43 = "[seg";
                                                i16 = addBasmala;
                                                str44 = ":enable='between(t,";
                                                str45 = str63;
                                                str46 = "][seg";
                                            } else if (entityQuranTemplate.getTransition().getType_out().equals(TransitionType.FADE_OUT.getValue())) {
                                                str17 = str7;
                                                str38 = ",";
                                                str39 = ")'[ov";
                                                str46 = "][seg";
                                                f4 = btm_y;
                                                f5 = btm_x;
                                                f7 = duration_in;
                                                i11 = i6;
                                                arrayList5 = arrayList8;
                                                str41 = str60;
                                                str42 = textValue;
                                                str43 = "[seg";
                                                i16 = addBasmala;
                                                str16 = str54;
                                                str45 = str63;
                                                floatValue6 = abs2;
                                                str40 = type_in;
                                                f8 = abs;
                                                str44 = ":enable='between(t,";
                                            } else {
                                                float duration_out = entityQuranTemplate.getTransition().getDuration_out();
                                                float abs3 = Math.abs(abs2 - duration_out);
                                                String str64 = str60;
                                                i11 = i6;
                                                int i27 = addBasmala;
                                                String generateVideoSegment = generateVideoSegment(entityQuranTemplate, addBasmala, fadeInOut(abs3 - abs, duration_in, duration_out), (int) (abs2 - abs), countDownLatch3, semaphore7);
                                                if (generateVideoSegment == null) {
                                                    str16 = str54;
                                                    str17 = str7;
                                                    arrayList2 = arrayList8;
                                                    str18 = str55;
                                                    i12 = i27;
                                                    str21 = str4;
                                                    str20 = str64;
                                                    str19 = str62;
                                                    str22 = str3;
                                                    str23 = str63;
                                                } else {
                                                    arrayList8.add(str55);
                                                    arrayList8.add(generateVideoSegment);
                                                    int i28 = i27 + 1;
                                                    this.overlay.append(str7).append(i28).append(str54).append("setpts=PTS-STARTPTS+").append(abs).append("/TB").append("[seg").append(i28).append(str64);
                                                    if (type_in.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                        f9 = btm_x;
                                                        f10 = f9 - fromW;
                                                        str16 = str54;
                                                        i18 = i28;
                                                        mSlideX = mSlideX(abs, duration_in, f9, fromW, -1.0f, 0.0f);
                                                    } else {
                                                        str16 = str54;
                                                        f9 = btm_x;
                                                        i18 = i28;
                                                        f10 = f9 + fromW;
                                                        mSlideX = mSlideX(abs, duration_in, f9, fromW, 1.0f, 0.0f);
                                                    }
                                                    String str65 = mSlideX;
                                                    float f13 = f10;
                                                    if (entityQuranTemplate.getTransition().getType_out().equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                        f12 = f9 + fromW;
                                                        str17 = str7;
                                                        f11 = f13;
                                                        arrayList7 = arrayList8;
                                                        str48 = str65;
                                                        mSlideX2 = mSlideX(abs3, duration_out, f9, fromW, 0.0f, 1.0f);
                                                    } else {
                                                        str17 = str7;
                                                        arrayList7 = arrayList8;
                                                        f11 = f13;
                                                        str48 = str65;
                                                        f12 = f9 - fromW;
                                                        mSlideX2 = mSlideX(abs3, duration_out, f9, fromW, 0.0f, -1.0f);
                                                    }
                                                    this.overlay.append(str63).append(i27).append("][seg").append(i18).append("]overlay=x=").append("'if(lt(t," + abs + ")," + f11 + ",if(lt(t," + (abs + duration_in) + ")," + str48 + ",if(lt(t," + abs3 + ")," + f9 + ",if(lt(t," + (abs3 + duration_out) + ")," + mSlideX2 + "," + f12 + "))))'").append(textValue).append(btm_y).append(":enable='between(t,").append(abs).append(",").append(abs2).append(")'[ov").append(i18).append(str64);
                                                    str23 = str63;
                                                    i12 = i18;
                                                    str18 = str55;
                                                    str20 = str64;
                                                    str21 = str4;
                                                    arrayList2 = arrayList7;
                                                    str19 = str62;
                                                    str22 = str3;
                                                }
                                            }
                                            String str66 = str44;
                                            if (str40.equals(TransitionType.FADE_IN.getValue())) {
                                                float duration_out2 = entityQuranTemplate.getTransition().getDuration_out();
                                                float abs4 = Math.abs(floatValue6 - duration_out2);
                                                String type_out = entityQuranTemplate.getTransition().getType_out();
                                                float f14 = floatValue6;
                                                float f15 = f4;
                                                String str67 = str42;
                                                String str68 = str46;
                                                String str69 = str43;
                                                String str70 = str45;
                                                String generateVideoSegment2 = generateVideoSegment(entityQuranTemplate, i16, fadeInOut(abs4 - f8, f7, duration_out2), (int) (floatValue6 - f8), countDownLatch3, semaphore7);
                                                if (generateVideoSegment2 == null) {
                                                    str20 = str41;
                                                    str18 = str55;
                                                    i12 = i16;
                                                    str21 = str4;
                                                    arrayList2 = arrayList5;
                                                    str19 = str62;
                                                    str22 = str3;
                                                    textValue = str67;
                                                    str23 = str70;
                                                } else {
                                                    ArrayList arrayList9 = arrayList5;
                                                    arrayList9.add(str55);
                                                    arrayList9.add(generateVideoSegment2);
                                                    int i29 = i16 + 1;
                                                    String str71 = str17;
                                                    String str72 = str16;
                                                    this.overlay.append(str71).append(i29).append(str72).append("setpts=PTS-STARTPTS+").append(f8).append("/TB").append(str69).append(i29).append(str41);
                                                    if (type_out.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                        str16 = str72;
                                                        i17 = i29;
                                                        str17 = str71;
                                                        arrayList6 = arrayList9;
                                                        str47 = slideX(abs4, duration_out2, f5, fromW, 0.0f, 1.0f);
                                                    } else {
                                                        str16 = str72;
                                                        str17 = str71;
                                                        i17 = i29;
                                                        arrayList6 = arrayList9;
                                                        if (type_out.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                                            str47 = slideX(abs4, duration_out2, f5, fromW, 0.0f, -1.0f);
                                                        } else {
                                                            str47 = "" + f5;
                                                        }
                                                    }
                                                    str22 = str3;
                                                    this.overlay.append(str70).append(i16).append(str68).append(i17).append(str22).append(str47).append(str67).append(f15).append(str66).append(f8).append(str38).append(f14).append(str39).append(i17).append(str41);
                                                    textValue = str67;
                                                    str23 = str70;
                                                    i12 = i17;
                                                    str20 = str41;
                                                    str18 = str55;
                                                    arrayList2 = arrayList6;
                                                    str21 = str4;
                                                    str19 = str62;
                                                }
                                            } else {
                                                String str73 = str46;
                                                arrayList6 = arrayList5;
                                                String str74 = str17;
                                                String str75 = str39;
                                                String str76 = str42;
                                                String str77 = str41;
                                                float f16 = f4;
                                                float f17 = f7;
                                                String str78 = str16;
                                                String str79 = str43;
                                                String str80 = str3;
                                                if (str40.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                    float duration_out3 = entityQuranTemplate.getTransition().getDuration_out();
                                                    float f18 = floatValue6;
                                                    String str81 = str45;
                                                    String generateVideoSegment3 = generateVideoSegment(entityQuranTemplate, i16, fadeInOut(Math.abs(floatValue6 - duration_out3) - f8, f17, duration_out3), (int) (floatValue6 - f8), countDownLatch3, semaphore7);
                                                    if (generateVideoSegment3 == null) {
                                                        str17 = str74;
                                                        str16 = str78;
                                                        str18 = str55;
                                                        arrayList2 = arrayList6;
                                                        i12 = i16;
                                                        str21 = str4;
                                                        str20 = str77;
                                                        str19 = str62;
                                                        str22 = str80;
                                                        textValue = str76;
                                                        str23 = str81;
                                                    } else {
                                                        arrayList6.add(str55);
                                                        arrayList6.add(generateVideoSegment3);
                                                        int i30 = i16 + 1;
                                                        this.overlay.append(str74).append(i30).append(str78).append("setpts=PTS-STARTPTS+").append(f8).append("/TB").append(str79).append(i30).append(str77);
                                                        str41 = str77;
                                                        str16 = str78;
                                                        i17 = i30;
                                                        this.overlay.append(str81).append(i16).append(str73).append(i17).append(str80).append(slideX(f8, f17, f5, fromW, -1.0f, 0.0f)).append(str76).append(f16).append(str66).append(f8).append(str38).append(f18).append(str75).append(i17).append(str41);
                                                        str17 = str74;
                                                        textValue = str76;
                                                        str22 = str80;
                                                        str23 = str81;
                                                        i12 = i17;
                                                        str20 = str41;
                                                        str18 = str55;
                                                        arrayList2 = arrayList6;
                                                        str21 = str4;
                                                        str19 = str62;
                                                    }
                                                } else {
                                                    String str82 = str45;
                                                    String str83 = str38;
                                                    str16 = str78;
                                                    float f19 = floatValue6;
                                                    if (str40.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                                        float duration_out4 = entityQuranTemplate.getTransition().getDuration_out();
                                                        String generateVideoSegment4 = generateVideoSegment(entityQuranTemplate, i16, fadeInOut(Math.abs(f19 - duration_out4) - f8, f17, duration_out4), (int) (f19 - f8), countDownLatch3, semaphore7);
                                                        if (generateVideoSegment4 == null) {
                                                            str17 = str74;
                                                            str18 = str55;
                                                            arrayList2 = arrayList6;
                                                            i12 = i16;
                                                            str21 = str4;
                                                            str20 = str77;
                                                            str19 = str62;
                                                            str22 = str80;
                                                        } else {
                                                            arrayList6.add(str55);
                                                            arrayList6.add(generateVideoSegment4);
                                                            int i31 = i16 + 1;
                                                            this.overlay.append(str74).append(i31).append(str16).append("setpts=PTS-STARTPTS+").append(f8).append("/TB").append(str79).append(i31).append(str77);
                                                            this.overlay.append(str82).append(i16).append(str73).append(i31).append(str80).append(slideX(f8, f17, f5, fromW, 1.0f, 0.0f)).append(str76).append(f16).append(str66).append(f8).append(str83).append(f19).append(str75).append(i31).append(str77);
                                                            str17 = str74;
                                                            textValue = str76;
                                                            str22 = str80;
                                                            str23 = str82;
                                                            str20 = str77;
                                                            i12 = i31;
                                                            str18 = str55;
                                                            arrayList2 = arrayList6;
                                                            str21 = str4;
                                                            str19 = str62;
                                                            str16 = str16;
                                                        }
                                                    } else {
                                                        str17 = str74;
                                                        str22 = str80;
                                                        str20 = str77;
                                                        str18 = str55;
                                                        arrayList2 = arrayList6;
                                                        i12 = i16;
                                                        str21 = str4;
                                                        str19 = str62;
                                                    }
                                                    str23 = str82;
                                                    textValue = str76;
                                                }
                                            }
                                        } else {
                                            String str84 = str54;
                                            String str85 = str60;
                                            i11 = i6;
                                            int i32 = addBasmala;
                                            ArrayList arrayList10 = arrayList8;
                                            floatValue3 = abs;
                                            String str86 = str7;
                                            String str87 = textValue;
                                            String str88 = str3;
                                            if (z3) {
                                                float duration_in2 = entityQuranTemplate.getTransition().getDuration_in();
                                                float btm_x2 = entityQuranTemplate.getBtm_x();
                                                float btm_y2 = entityQuranTemplate.getBtm_y();
                                                float fromW2 = entityQuranTemplate.getTransition().getFromW();
                                                String type_in2 = entityQuranTemplate.getTransition().getType_in();
                                                String generateVideoSegment5 = generateVideoSegment(entityQuranTemplate, i32, mFadeFilter(0.0f, duration_in2, true), (int) (abs2 - floatValue3), countDownLatch3, semaphore7);
                                                if (generateVideoSegment5 == null) {
                                                    str17 = str86;
                                                    arrayList2 = arrayList10;
                                                    i12 = i32;
                                                    str19 = str62;
                                                    str22 = str88;
                                                    str16 = str84;
                                                    str20 = str85;
                                                    textValue = str87;
                                                    str23 = str63;
                                                    str18 = str55;
                                                } else {
                                                    arrayList10.add(str55);
                                                    arrayList10.add(generateVideoSegment5);
                                                    int i33 = i32 + 1;
                                                    this.overlay.append(str86).append(i33).append(str84).append("setpts=PTS-STARTPTS+").append(floatValue3).append("/TB").append("[seg").append(i33).append(str85);
                                                    if (type_in2.equals(TransitionType.FADE_IN.getValue())) {
                                                        this.overlay.append(str63).append(i32).append("][seg").append(i33).append(str88).append(btm_x2).append(str62).append(btm_y2).append(":enable='between(t,").append(floatValue3).append(",").append(abs2).append(")'[ov").append(i33).append(str85);
                                                        str17 = str86;
                                                        str31 = str62;
                                                        str32 = str84;
                                                        i15 = i33;
                                                        str35 = str55;
                                                        arrayList4 = arrayList10;
                                                        str36 = str87;
                                                        str37 = str88;
                                                    } else {
                                                        if (type_in2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                            str31 = str62;
                                                            str32 = str84;
                                                            str17 = str86;
                                                            i15 = i33;
                                                            str34 = str88;
                                                            str33 = str87;
                                                            this.overlay.append(str63).append(i32).append("][seg").append(i15).append(str34).append(slideX(floatValue3, duration_in2, btm_x2, fromW2, -1.0f, 0.0f)).append(str33).append(btm_y2).append(":enable='between(t,").append(floatValue3).append(",").append(abs2).append(")'[ov").append(i15).append(str85);
                                                        } else {
                                                            str17 = str86;
                                                            str31 = str62;
                                                            str32 = str84;
                                                            i15 = i33;
                                                            str33 = str87;
                                                            str34 = str88;
                                                            if (type_in2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                                                str35 = str55;
                                                                str36 = str33;
                                                                arrayList4 = arrayList10;
                                                                str37 = str34;
                                                                this.overlay.append(str63).append(i32).append("][seg").append(i15).append(str37).append(slideX(floatValue3, duration_in2, btm_x2, fromW2, 1.0f, 0.0f)).append(str36).append(btm_y2).append(":enable='between(t,").append(floatValue3).append(",").append(abs2).append(")'[ov").append(i15).append(str85);
                                                            }
                                                        }
                                                        str35 = str55;
                                                        arrayList4 = arrayList10;
                                                        str36 = str33;
                                                        str37 = str34;
                                                    }
                                                    i12 = i15;
                                                    str20 = str85;
                                                    str23 = str63;
                                                    str22 = str37;
                                                    str18 = str35;
                                                    arrayList2 = arrayList4;
                                                    str19 = str31;
                                                    str16 = str32;
                                                    textValue = str36;
                                                }
                                                str21 = str4;
                                            } else {
                                                str17 = str86;
                                                floatValue2 = abs2;
                                                String str89 = str55;
                                                if (z2) {
                                                    float duration_out5 = entityQuranTemplate.getTransition().getDuration_out();
                                                    float abs5 = Math.abs(floatValue2 - duration_out5);
                                                    float btm_x3 = entityQuranTemplate.getBtm_x();
                                                    float btm_y3 = entityQuranTemplate.getBtm_y();
                                                    float fromW3 = entityQuranTemplate.getTransition().getFromW();
                                                    String type_out2 = entityQuranTemplate.getTransition().getType_out();
                                                    int i34 = (int) (floatValue2 - floatValue3);
                                                    str20 = str85;
                                                    String generateVideoSegment6 = generateVideoSegment(entityQuranTemplate, i32, mFadeFilter(i34 - duration_out5, duration_out5, false), i34, countDownLatch3, semaphore7);
                                                    if (generateVideoSegment6 == null) {
                                                        i12 = i32;
                                                        str21 = str4;
                                                        str18 = str89;
                                                        str22 = str88;
                                                        arrayList2 = arrayList10;
                                                        textValue = str87;
                                                        str23 = str63;
                                                        str19 = str62;
                                                        str16 = str84;
                                                    } else {
                                                        arrayList10.add(str89);
                                                        arrayList10.add(generateVideoSegment6);
                                                        int i35 = i32 + 1;
                                                        if (type_out2.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
                                                            this.overlay.append(str17).append(i35).append(str84).append("setpts=PTS-STARTPTS+").append(floatValue3).append("/TB").append("[seg").append(i35).append(str20);
                                                            str28 = str89;
                                                            this.overlay.append(str63).append(i32).append("][seg").append(i35).append(str88).append(slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, 1.0f)).append(str87).append(btm_y3).append(":enable='between(t,").append(floatValue3).append(",").append(floatValue2).append(")'").append(str63).append(i35).append(str20);
                                                            textValue = str87;
                                                            str22 = str88;
                                                            str23 = str63;
                                                            arrayList3 = arrayList10;
                                                            i14 = i35;
                                                            str19 = str62;
                                                            str30 = str84;
                                                        } else {
                                                            str28 = str89;
                                                            i14 = i35;
                                                            arrayList3 = arrayList10;
                                                            if (type_out2.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
                                                                this.overlay.append(str17).append(i14).append(str84).append("setpts=PTS-STARTPTS+").append(floatValue3).append("/TB").append("[seg").append(i14).append(str20);
                                                                str29 = str84;
                                                                str17 = str17;
                                                                str23 = str63;
                                                                this.overlay.append(str23).append(i32).append("][seg").append(i14).append(str88).append(slideX(abs5, duration_out5, btm_x3, fromW3, 0.0f, -1.0f)).append(str87).append(btm_y3).append(":enable='between(t,").append(floatValue3).append(",").append(floatValue2).append(")'").append(str23).append(i14).append(str20);
                                                                textValue = str87;
                                                                i14 = i14;
                                                                str22 = str88;
                                                            } else {
                                                                str17 = str17;
                                                                str29 = str84;
                                                                str23 = str63;
                                                                str22 = str88;
                                                                textValue = str87;
                                                                if (type_out2.equals(TransitionType.FADE_OUT.getValue())) {
                                                                    str30 = str29;
                                                                    this.overlay.append(str17).append(i14).append(str30).append("setpts=PTS-STARTPTS+").append(floatValue3).append("/TB").append("[seg").append(i14).append(str20);
                                                                    str19 = str62;
                                                                    this.overlay.append(str23).append(i32).append("][seg").append(i14).append(str22).append(btm_x3).append(str19).append(btm_y3).append(":enable='between(t,").append(floatValue3).append(",").append(floatValue2).append(")'[ov").append(i14).append(str20);
                                                                }
                                                            }
                                                            str30 = str29;
                                                            str19 = str62;
                                                        }
                                                        i12 = i14;
                                                        str16 = str30;
                                                        str21 = str4;
                                                        arrayList2 = arrayList3;
                                                        str18 = str28;
                                                    }
                                                } else {
                                                    str20 = str85;
                                                    str26 = ")'[ov";
                                                    str27 = ",";
                                                    str24 = ":enable='between(t,";
                                                    str22 = str88;
                                                    i13 = i32;
                                                    str19 = str62;
                                                    str25 = str84;
                                                    str23 = str63;
                                                    textValue = str87;
                                                    arrayList2 = arrayList10;
                                                    str18 = str89;
                                                }
                                            }
                                        }
                                    } else {
                                        floatValue = fps;
                                        floatValue2 = abs2;
                                        i13 = addBasmala;
                                        str17 = str7;
                                        str19 = str61;
                                        str20 = str60;
                                        str24 = ":enable='between(t,";
                                        str25 = str54;
                                        str23 = str56;
                                        str26 = ")'[ov";
                                        floatValue3 = abs;
                                        str27 = ",";
                                        i11 = i6;
                                        str22 = str3;
                                        arrayList2 = arrayList8;
                                        str18 = str55;
                                    }
                                    arrayList2.add(str18);
                                    arrayList2.add(this.mTemplate.getFolder_template() + "/" + entityQuranTemplate.getFile());
                                    int i36 = i13 + 1;
                                    str21 = str4;
                                    str16 = str25;
                                    this.overlay.append(str23).append(i13).append(str21).append(i36).append(str22).append(entityQuranTemplate.getBtm_x()).append(str19).append(entityQuranTemplate.getBtm_y()).append(str24).append(floatValue3).append(str27).append(Math.abs(floatValue2 - floatValue)).append(str26).append(i36).append(str20);
                                    countDownLatch3.countDown();
                                    i12 = i36;
                                } else {
                                    floatValue = fps;
                                    i11 = i6;
                                    i12 = addBasmala;
                                    str16 = str54;
                                    str17 = str7;
                                    arrayList2 = arrayList8;
                                    str18 = str55;
                                    str19 = str61;
                                    str20 = str60;
                                    str21 = str4;
                                    str22 = str3;
                                    str23 = str56;
                                    countDownLatch3.countDown();
                                }
                            }
                            str61 = str19;
                            str3 = str22;
                            arrayList8 = arrayList2;
                            str4 = str21;
                            str56 = str23;
                            str54 = str16;
                            str60 = str20;
                            i6 = i11 + 1;
                            addBasmala = i12;
                            str55 = str18;
                            fps = floatValue;
                            str7 = str17;
                        }
                        float f20 = fps;
                        int i37 = addBasmala;
                        String str90 = str54;
                        String str91 = str7;
                        ArrayList arrayList11 = arrayList8;
                        String str92 = str55;
                        String str93 = str60;
                        String str94 = str4;
                        String str95 = str3;
                        String str96 = ")'[ov";
                        String str97 = str56;
                        String str98 = str61;
                        int i38 = i37;
                        i7 = 0;
                        while (i7 < this.mTemplate.getTranslationTemplateList().size()) {
                            EntityTranslationTemplate entityTranslationTemplate = this.mTemplate.getTranslationTemplateList().get(i7);
                            float abs6 = Math.abs(entityTranslationTemplate.getStart());
                            float abs7 = Math.abs(entityTranslationTemplate.getEnd());
                            if (abs6 >= abs7) {
                                str14 = str93;
                                i10 = i7;
                                str15 = str96;
                            } else {
                                i10 = i7;
                                String str99 = str93;
                                String str100 = str96;
                                File file10 = new File(this.mTemplate.getFolder_template() + "/" + entityTranslationTemplate.getFile());
                                if (file10.exists() && file10.isFile() && file10.length() > 0) {
                                    arrayList11.add(str92);
                                    arrayList11.add(this.mTemplate.getFolder_template() + "/" + entityTranslationTemplate.getFile());
                                    int i39 = i38 + 1;
                                    StringBuilder append = this.overlay.append(str97).append(i38).append(str94).append(i39).append(str95).append(0).append(str98).append(entityTranslationTemplate.getBtm_y()).append(":enable='between(t,").append(abs6).append(",").append(Math.abs(abs7 - f20));
                                    str15 = str100;
                                    str14 = str99;
                                    append.append(str15).append(i39).append(str14);
                                    countDownLatch3.countDown();
                                    i38 = i39;
                                } else {
                                    str14 = str99;
                                    str15 = str100;
                                    countDownLatch3.countDown();
                                }
                            }
                            i7 = i10 + 1;
                            str96 = str15;
                            str93 = str14;
                        }
                        String str101 = str93;
                        String str102 = str97 + i38 + str90;
                        String str103 = "";
                        i8 = 0;
                        i9 = 0;
                        while (i8 < this.mTemplate.getEntityMediaList().size()) {
                            try {
                                EntityMedia entityMedia = this.mTemplate.getEntityMediaList().get(i8);
                                if (entityMedia.getEnd() >= entityMedia.getStart()) {
                                    File file11 = new File(entityMedia.getPath_ffmpeg_effect());
                                    if (file11.isFile() && file11.exists()) {
                                        arrayList11.add(str92);
                                        arrayList11.add(entityMedia.getPath_ffmpeg_effect());
                                        int i40 = i38 + 1;
                                        float m628f2 = Utils.m628f2(entityMedia.getStart() / 1000.0f);
                                        float m628f22 = Utils.m628f2(entityMedia.getEnd() / 1000.0f);
                                        long round = Math.round(entityMedia.getPosXFFmpeg());
                                        str11 = str92;
                                        String str104 = CmcdData.OBJECT_TYPE_AUDIO_ONLY + i8;
                                        str10 = str102;
                                        try {
                                            str12 = "d" + i8;
                                            arrayList = arrayList11;
                                            str13 = str91;
                                        } catch (Exception e) {
                                            e = e;
                                            arrayList = arrayList11;
                                            isFlag = false;
                                            e.printStackTrace();
                                            final ArrayList arrayList12 = arrayList;
                                            arrayList12.add("-filter_complex");
                                            arrayList12.add(this.overlay.toString());
                                            if (isFlag) {
                                            }
                                            arrayList12.add("-y");
                                            arrayList12.add("-level");
                                            arrayList12.add("4.1");
                                            arrayList12.add("-g");
                                            arrayList12.add("120");
                                            if (str9 != null) {
                                            }
                                            arrayList12.add("-pix_fmt");
                                            arrayList12.add("yuv420p");
                                            arrayList12.add("-framerate");
                                            arrayList12.add("" + this.mTemplate.getFps());
                                            arrayList12.add("-movflags");
                                            arrayList12.add("+faststart");
                                            arrayList12.add("-t");
                                            arrayList12.add(i26 + "ms");
                                            arrayList12.add(this.mUri);
                                            this.renderManager.computeWeights();
                                            final CountDownLatch countDownLatch6 = countDownLatch3;
                                            Thread thread = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ProgressViewActivity.this.m610x9b61da96(countDownLatch6, arrayList12);
                                                }
                                            });
                                            this.workerThread = thread;
                                            thread.start();
                                        }
                                        try {
                                            this.overlay.append(str13).append(i40).append(":a]").append("volume=0.5").append("[vlm").append(i8).append(str101);
                                            if (entityMedia.isApplyEffectInPreview()) {
                                                this.overlay.append("[vlm").append(i8).append(str90).append("adelay=").append(round).append("|").append(round).append(str13).append(str12).append(str101);
                                            } else {
                                                this.overlay.append("[vlm").append(i8).append(str90).append("atrim=start=").append(m628f2).append(":end=").append(m628f22).append(",asetpts=PTS-STARTPTS").append(str13).append(str104).append(str101);
                                                this.overlay.append(str13).append(str104).append(str90).append("adelay=").append(round).append("|").append(round).append(str13).append(str12).append(str101);
                                            }
                                            str103 = str103 + str13 + str12 + str90;
                                            i9++;
                                            i38 = i40;
                                            i8++;
                                            str91 = str13;
                                            str102 = str10;
                                            str92 = str11;
                                            arrayList11 = arrayList;
                                        } catch (Exception e2) {
                                            e = e2;
                                            isFlag = false;
                                            e.printStackTrace();
                                            final List arrayList122 = arrayList;
                                            arrayList122.add("-filter_complex");
                                            arrayList122.add(this.overlay.toString());
                                            if (isFlag) {
                                            }
                                            arrayList122.add("-y");
                                            arrayList122.add("-level");
                                            arrayList122.add("4.1");
                                            arrayList122.add("-g");
                                            arrayList122.add("120");
                                            if (str9 != null) {
                                            }
                                            arrayList122.add("-pix_fmt");
                                            arrayList122.add("yuv420p");
                                            arrayList122.add("-framerate");
                                            arrayList122.add("" + this.mTemplate.getFps());
                                            arrayList122.add("-movflags");
                                            arrayList122.add("+faststart");
                                            arrayList122.add("-t");
                                            arrayList122.add(i26 + "ms");
                                            arrayList122.add(this.mUri);
                                            this.renderManager.computeWeights();
                                            final CountDownLatch countDownLatch62 = countDownLatch3;
                                            Thread thread2 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ProgressViewActivity.this.m610x9b61da96(countDownLatch62, arrayList122);
                                                }
                                            });
                                            this.workerThread = thread2;
                                            thread2.start();
                                        }
                                    }
                                }
                                str10 = str102;
                                arrayList = arrayList11;
                                str11 = str92;
                                str13 = str91;
                                i8++;
                                str91 = str13;
                                str102 = str10;
                                str92 = str11;
                                arrayList11 = arrayList;
                            } catch (Exception e3) {
                                e = e3;
                                str10 = str102;
                            }
                        }
                        str10 = str102;
                        arrayList = arrayList11;
                        if (i9 <= 0) {
                            try {
                                this.overlay.append(str103).append("amix=inputs=").append(i9).append(":duration=longest:normalize=0:dropout_transition=0,volume=2[a]");
                                isFlag = true;
                            } catch (Exception e4) {
                                e = e4;
                                isFlag = true;
                                e.printStackTrace();
                                final List arrayList1222 = arrayList;
                                arrayList1222.add("-filter_complex");
                                arrayList1222.add(this.overlay.toString());
                                if (isFlag) {
                                }
                                arrayList1222.add("-y");
                                arrayList1222.add("-level");
                                arrayList1222.add("4.1");
                                arrayList1222.add("-g");
                                arrayList1222.add("120");
                                if (str9 != null) {
                                }
                                arrayList1222.add("-pix_fmt");
                                arrayList1222.add("yuv420p");
                                arrayList1222.add("-framerate");
                                arrayList1222.add("" + this.mTemplate.getFps());
                                arrayList1222.add("-movflags");
                                arrayList1222.add("+faststart");
                                arrayList1222.add("-t");
                                arrayList1222.add(i26 + "ms");
                                arrayList1222.add(this.mUri);
                                this.renderManager.computeWeights();
                                final CountDownLatch countDownLatch622 = countDownLatch3;
                                Thread thread22 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ProgressViewActivity.this.m610x9b61da96(countDownLatch622, arrayList1222);
                                    }
                                });
                                this.workerThread = thread22;
                                thread22.start();
                            }
                        } else {
                            isFlag = false;
                        }
                        final List arrayList12222 = arrayList;
                        arrayList12222.add("-filter_complex");
                        arrayList12222.add(this.overlay.toString());
                        if (isFlag) {
                            arrayList12222.add("-map");
                            arrayList12222.add(str10);
                            arrayList12222.add("-map");
                            arrayList12222.add("[a]");
                            if (codecInfo.audioCodec != null) {
                                arrayList12222.add("-c:a");
                                arrayList12222.add(codecInfo.audioCodec);
                                arrayList12222.add("-b:a");
                                arrayList12222.add("256k");
                                arrayList12222.add("-ar");
                                arrayList12222.add("44100");
                                arrayList12222.add("-ac");
                                arrayList12222.add(ExifInterface.GPS_MEASUREMENT_2D);
                            }
                        } else {
                            arrayList12222.add("-map");
                            arrayList12222.add(str10);
                        }
                        arrayList12222.add("-y");
                        arrayList12222.add("-level");
                        arrayList12222.add("4.1");
                        arrayList12222.add("-g");
                        arrayList12222.add("120");
                        if (str9 != null) {
                            arrayList12222.add("-threads");
                            arrayList12222.add("0");
                            arrayList12222.add("-c:v");
                            arrayList12222.add(str9);
                            arrayList12222.add("-preset");
                            arrayList12222.add("fast");
                            arrayList12222.add("-crf");
                            arrayList12222.add("18");
                        } else {
                            arrayList12222.add("-b:v");
                            arrayList12222.add("4M");
                        }
                        arrayList12222.add("-pix_fmt");
                        arrayList12222.add("yuv420p");
                        arrayList12222.add("-framerate");
                        arrayList12222.add("" + this.mTemplate.getFps());
                        arrayList12222.add("-movflags");
                        arrayList12222.add("+faststart");
                        arrayList12222.add("-t");
                        arrayList12222.add(i26 + "ms");
                        arrayList12222.add(this.mUri);
                        this.renderManager.computeWeights();
                        final CountDownLatch countDownLatch6222 = countDownLatch3;
                        Thread thread222 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProgressViewActivity.this.m610x9b61da96(countDownLatch6222, arrayList12222);
                            }
                        });
                        this.workerThread = thread222;
                        thread222.start();
                    }
                    semaphore2 = semaphore6;
                } else {
                    if (this.mTemplate.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                        SquareBitmapModel squareBitmapModel2 = this.mTemplate.getSquareBitmapModel();
                        String str105 = str53;
                        if (squareBitmapModel2 != null) {
                            semaphore4 = semaphore;
                            String preRenderMask_Circle = preRenderMask_Circle(squareBitmapModel2, max, countDownLatch2, semaphore4);
                            arrayList8.add("-value");
                            arrayList8.add(preRenderMask_Circle);
                            int i41 = value2 + 1;
                            i20 = i23;
                            this.overlay.append(str56).append(value2).append("]").append("[").append(i41).append(":v]").append(str2).append(squareBitmapModel2.getPosX()).append(":").append(squareBitmapModel2.getPosY()).append(str56).append(i41).append("];");
                            value2 = i41;
                        } else {
                            i20 = i23;
                            semaphore4 = semaphore;
                        }
                        str6 = "];";
                        countDownLatch3 = countDownLatch2;
                        textValue5 = str51;
                        i5 = i20;
                        str3 = str105;
                        str8 = ":";
                        i4 = max;
                        str7 = "[";
                        semaphore2 = semaphore4;
                    } else {
                        String str106 = str53;
                        i23 = i23;
                        Semaphore semaphore8 = semaphore;
                        if (this.mTemplate.getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || this.mTemplate.getIpad_type() == IpadType.IPAD_CLASSIC.ordinal()) {
                            textValue5 = str51;
                            SquareBitmapModel squareBitmapModel3 = this.mTemplate.getSquareBitmapModel();
                            if (squareBitmapModel3 != null) {
                                int i42 = value2;
                                i19 = max;
                                str7 = "[";
                                CountDownLatch countDownLatch7 = countDownLatch2;
                                countDownLatch3 = countDownLatch2;
                                str8 = ":";
                                semaphore3 = semaphore8;
                                str3 = str106;
                                String preRender_NoMask = preRender_NoMask(squareBitmapModel3, max, countDownLatch7, semaphore8, textValue5);
                                arrayList8.add("-value");
                                arrayList8.add(preRender_NoMask);
                                value2 = i42 + 1;
                                str6 = "];";
                                this.overlay.append(str56).append(i42).append("]").append(str7).append(value2).append(":v]").append(str2).append(squareBitmapModel3.getPosX()).append(str8).append(squareBitmapModel3.getPosY()).append(str56).append(value2).append(str6);
                            } else {
                                str6 = "];";
                                semaphore3 = semaphore8;
                                countDownLatch3 = countDownLatch2;
                                i19 = max;
                                str3 = str106;
                                str7 = "[";
                                str8 = ":";
                            }
                            i4 = i19;
                            i5 = i23;
                            semaphore2 = semaphore3;
                        } else {
                            if (this.mTemplate.getIpad_type() == IpadType.BLACK_LAYER.ordinal() || this.mTemplate.getIpad_type() == IpadType.GRADIENT.ordinal() || this.mTemplate.getIpad_type() == IpadType.MASK_BRUSH.ordinal()) {
                                textValue5 = str51;
                                String preRenderVideo = preRenderVideo(max, countDownLatch2, semaphore8, textValue5);
                                arrayList8.add("-value");
                                arrayList8.add(preRenderVideo);
                                this.overlay.append("[0]format=yuv420p[ov").append(value2).append("];");
                            } else if (this.mTemplate.getIpad_type() == IpadType.BLUE_TYPE.ordinal()) {
                                textValue5 = str51;
                                String preRenderVideoHue = preRenderVideoHue(max, countDownLatch2, semaphore8, textValue5);
                                arrayList8.add("-value");
                                arrayList8.add(preRenderVideoHue);
                                this.overlay.append("[0]format=yuv420p[ov").append(value2).append("];");
                            } else {
                                textValue5 = str51;
                                countDownLatch2.countDown();
                            }
                            str6 = "];";
                            value3 = value2;
                            countDownLatch3 = countDownLatch2;
                            str3 = str106;
                            str8 = ":";
                            i4 = max;
                            str7 = "[";
                            semaphore2 = semaphore8;
                        }
                    }
                    float fps2 = (i5 / this.mTemplate.getFps()) * 2.0E-4f;
                    Semaphore semaphore72 = semaphore2;
                    int i262 = i4;
                    String str602 = str6;
                    str9 = textValue5;
                    String str612 = str8;
                    int addBasmala2 = addBasmala(this.mTemplate.getEntityBismilahTemplate(), addBasmala(this.mTemplate.getEntityIsti3adaTemplate(), value2, semaphore2, countDownLatch3, arrayList8, fps2), semaphore72, countDownLatch3, arrayList8, fps2);
                    i6 = 0;
                    while (i6 < this.mTemplate.getQuranEntityList().size()) {
                    }
                    float f202 = fps2;
                    int i372 = addBasmala2;
                    String str902 = str54;
                    String str912 = str7;
                    ArrayList arrayList112 = arrayList8;
                    String str922 = str55;
                    String str932 = str602;
                    String str942 = str4;
                    String str952 = str3;
                    String str962 = ")'[ov";
                    String str972 = str56;
                    String str982 = str612;
                    int i382 = i372;
                    i7 = 0;
                    while (i7 < this.mTemplate.getTranslationTemplateList().size()) {
                    }
                    String str1012 = str932;
                    String str1022 = str972 + i382 + str902;
                    String str1032 = "";
                    i8 = 0;
                    i9 = 0;
                    while (i8 < this.mTemplate.getEntityMediaList().size()) {
                    }
                    str10 = str1022;
                    arrayList = arrayList112;
                    if (i9 <= 0) {
                    }
                    final List arrayList122222 = arrayList;
                    arrayList122222.add("-filter_complex");
                    arrayList122222.add(this.overlay.toString());
                    if (isFlag) {
                    }
                    arrayList122222.add("-y");
                    arrayList122222.add("-level");
                    arrayList122222.add("4.1");
                    arrayList122222.add("-g");
                    arrayList122222.add("120");
                    if (str9 != null) {
                    }
                    arrayList122222.add("-pix_fmt");
                    arrayList122222.add("yuv420p");
                    arrayList122222.add("-framerate");
                    arrayList122222.add("" + this.mTemplate.getFps());
                    arrayList122222.add("-movflags");
                    arrayList122222.add("+faststart");
                    arrayList122222.add("-t");
                    arrayList122222.add(i262 + "ms");
                    arrayList122222.add(this.mUri);
                    this.renderManager.computeWeights();
                    final CountDownLatch countDownLatch62222 = countDownLatch3;
                    Thread thread2222 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProgressViewActivity.this.m610x9b61da96(countDownLatch62222, arrayList122222);
                        }
                    });
                    this.workerThread = thread2222;
                    thread2222.start();
                }
                value2 = value3;
                i5 = i23;
                float fps22 = (i5 / this.mTemplate.getFps()) * 2.0E-4f;
                Semaphore semaphore722 = semaphore2;
                int i2622 = i4;
                String str6022 = str6;
                str9 = textValue5;
                String str6122 = str8;
                int addBasmala22 = addBasmala(this.mTemplate.getEntityBismilahTemplate(), addBasmala(this.mTemplate.getEntityIsti3adaTemplate(), value2, semaphore2, countDownLatch3, arrayList8, fps22), semaphore722, countDownLatch3, arrayList8, fps22);
                i6 = 0;
                while (i6 < this.mTemplate.getQuranEntityList().size()) {
                }
                float f2022 = fps22;
                int i3722 = addBasmala22;
                String str9022 = str54;
                String str9122 = str7;
                ArrayList arrayList1122 = arrayList8;
                String str9222 = str55;
                String str9322 = str6022;
                String str9422 = str4;
                String str9522 = str3;
                String str9622 = ")'[ov";
                String str9722 = str56;
                String str9822 = str6122;
                int i3822 = i3722;
                i7 = 0;
                while (i7 < this.mTemplate.getTranslationTemplateList().size()) {
                }
                String str10122 = str9322;
                String str10222 = str9722 + i3822 + str9022;
                String str10322 = "";
                i8 = 0;
                i9 = 0;
                while (i8 < this.mTemplate.getEntityMediaList().size()) {
                }
                str10 = str10222;
                arrayList = arrayList1122;
                if (i9 <= 0) {
                }
                final List arrayList1222222 = arrayList;
                arrayList1222222.add("-filter_complex");
                arrayList1222222.add(this.overlay.toString());
                if (isFlag) {
                }
                arrayList1222222.add("-y");
                arrayList1222222.add("-level");
                arrayList1222222.add("4.1");
                arrayList1222222.add("-g");
                arrayList1222222.add("120");
                if (str9 != null) {
                }
                arrayList1222222.add("-pix_fmt");
                arrayList1222222.add("yuv420p");
                arrayList1222222.add("-framerate");
                arrayList1222222.add("" + this.mTemplate.getFps());
                arrayList1222222.add("-movflags");
                arrayList1222222.add("+faststart");
                arrayList1222222.add("-t");
                arrayList1222222.add(i2622 + "ms");
                arrayList1222222.add(this.mUri);
                this.renderManager.computeWeights();
                final CountDownLatch countDownLatch622222 = countDownLatch3;
                Thread thread22222 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProgressViewActivity.this.m610x9b61da96(countDownLatch622222, arrayList1222222);
                    }
                });
                this.workerThread = thread22222;
                thread22222.start();
            }
        }
        str3 = str53;
        str4 = str52;
        textValue5 = str51;
        str6 = "];";
        value3 = value2;
        str7 = "[";
        semaphore2 = semaphore;
        countDownLatch3 = countDownLatch2;
        str8 = ":";
        i4 = max;
        value2 = value3;
        i5 = i23;
        float fps222 = (i5 / this.mTemplate.getFps()) * 2.0E-4f;
        Semaphore semaphore7222 = semaphore2;
        int i26222 = i4;
        String str60222 = str6;
        str9 = textValue5;
        String str61222 = str8;
        int addBasmala222 = addBasmala(this.mTemplate.getEntityBismilahTemplate(), addBasmala(this.mTemplate.getEntityIsti3adaTemplate(), value2, semaphore2, countDownLatch3, arrayList8, fps222), semaphore7222, countDownLatch3, arrayList8, fps222);
        i6 = 0;
        while (i6 < this.mTemplate.getQuranEntityList().size()) {
        }
        float f20222 = fps222;
        int i37222 = addBasmala222;
        String str90222 = str54;
        String str91222 = str7;
        ArrayList arrayList11222 = arrayList8;
        String str92222 = str55;
        String str93222 = str60222;
        String str94222 = str4;
        String str95222 = str3;
        String str96222 = ")'[ov";
        String str97222 = str56;
        String str98222 = str61222;
        int i38222 = i37222;
        i7 = 0;
        while (i7 < this.mTemplate.getTranslationTemplateList().size()) {
        }
        String str101222 = str93222;
        String str102222 = str97222 + i38222 + str90222;
        String str103222 = "";
        i8 = 0;
        i9 = 0;
        while (i8 < this.mTemplate.getEntityMediaList().size()) {
        }
        str10 = str102222;
        arrayList = arrayList11222;
        if (i9 <= 0) {
        }
        final List arrayList12222222 = arrayList;
        arrayList12222222.add("-filter_complex");
        arrayList12222222.add(this.overlay.toString());
        if (isFlag) {
        }
        arrayList12222222.add("-y");
        arrayList12222222.add("-level");
        arrayList12222222.add("4.1");
        arrayList12222222.add("-g");
        arrayList12222222.add("120");
        if (str9 != null) {
        }
        arrayList12222222.add("-pix_fmt");
        arrayList12222222.add("yuv420p");
        arrayList12222222.add("-framerate");
        arrayList12222222.add("" + this.mTemplate.getFps());
        arrayList12222222.add("-movflags");
        arrayList12222222.add("+faststart");
        arrayList12222222.add("-t");
        arrayList12222222.add(i26222 + "ms");
        arrayList12222222.add(this.mUri);
        this.renderManager.computeWeights();
        final CountDownLatch countDownLatch6222222 = countDownLatch3;
        Thread thread222222 = new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                ProgressViewActivity.this.m610x9b61da96(countDownLatch6222222, arrayList12222222);
            }
        });
        this.workerThread = thread222222;
        thread222222.start();
    }

    /* renamed from: lambda$setupCommand$8$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m610x9b61da96(CountDownLatch countDownLatch, List list) {
        try {
            countDownLatch.await();
            if (Thread.currentThread().isInterrupted() && this.isDestroy) {
                return;
            }
            export((String[]) list.toArray(new String[0]));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String concatVideoSegments(List<String> list) {
        try {
            File file = new File(this.mTemplate.getFolder_template() + "/file_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                bufferedWriter.write("file '" + it.next() + "'\n");
            }
            bufferedWriter.close();
            String textValue = this.mTemplate.getFolder_template() + "/final_video.mp4";
            ArrayList arrayList = new ArrayList();
            arrayList.add("-y");
            arrayList.add("-floatValue");
            arrayList.add("concat");
            arrayList.add("-safe");
            arrayList.add("0");
            arrayList.add("-value");
            arrayList.add(file.getAbsolutePath());
            arrayList.add("-c");
            arrayList.add("copy");
            arrayList.add(textValue);
            FFmpegKit.executeWithArguments((String[]) arrayList.toArray(new String[0]));
            return textValue;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String generateVideoSegment(EntityQuranTemplate entityQuranTemplate, int value, String textValue, int value2, final CountDownLatch countDownLatch, final Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", value2);
        String str2 = this.mTemplate.getFolder_template() + "/ayah_" + value + ".mov";
        ArrayList arrayList = new ArrayList();
        arrayList.add("-y");
        arrayList.add("-loop");
        arrayList.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        arrayList.add("-value");
        arrayList.add(this.mTemplate.getFolder_template() + "/" + entityQuranTemplate.getFile());
        arrayList.add("-vf");
        arrayList.add(textValue);
        arrayList.add("-t");
        arrayList.add(String.valueOf(Math.max(value2, 1)));
        arrayList.add("-c:v");
        arrayList.add("qtrle");
        arrayList.add("-pix_fmt");
        arrayList.add("argb");
        arrayList.add("-preset");
        arrayList.add("veryfast");
        arrayList.add("-avoid_negative_ts");
        arrayList.add("make_zero");
        arrayList.add(str2);
        try {
            semaphore.acquire();
            this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda2
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public final void apply(FFmpegSession fFmpegSession) {
                    ProgressViewActivity.this.m604x2d35bd16(countDownLatch, semaphore, fFmpegSession);
                }
            }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
            return str2;
        } catch (InterruptedException unused) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }

    /* renamed from: lambda$generateVideoSegment$9$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m604x2d35bd16(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    private String generateVideoSegment(EntityBismilahTemplate entityBismilahTemplate, int value, String textValue, int value2, final CountDownLatch countDownLatch, final Semaphore semaphore) {
        this.renderManager.addTask("anim prerender", value2);
        String str2 = this.mTemplate.getFolder_template() + "/bismilah_" + value + ".mov";
        ArrayList arrayList = new ArrayList();
        arrayList.add("-y");
        arrayList.add("-loop");
        arrayList.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        arrayList.add("-value");
        arrayList.add(this.mTemplate.getFolder_template() + "/" + entityBismilahTemplate.getFile());
        arrayList.add("-vf");
        arrayList.add(textValue);
        arrayList.add("-t");
        arrayList.add(String.valueOf(Math.max(value2, 1)));
        arrayList.add("-c:v");
        arrayList.add("qtrle");
        arrayList.add("-pix_fmt");
        arrayList.add("argb");
        arrayList.add("-preset");
        arrayList.add("veryfast");
        arrayList.add("-avoid_negative_ts");
        arrayList.add("make_zero");
        arrayList.add(str2);
        try {
            semaphore.acquire();
            this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync((String[]) arrayList.toArray(new String[0]), new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity$$ExternalSyntheticLambda1
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public final void apply(FFmpegSession fFmpegSession) {
                    ProgressViewActivity.this.m603x3040977c(countDownLatch, semaphore, fFmpegSession);
                }
            }, null, new ProgressViewActivity$$ExternalSyntheticLambda6(this)).getSessionId()));
            return str2;
        } catch (Exception unused) {
            this.renderManager.nextTask();
            countDownLatch.countDown();
            return null;
        }
    }

    /* renamed from: lambda$generateVideoSegment$10$hazem-nurmontage-videoquran-ProgressViewActivity */
    /* synthetic */ void m603x3040977c(CountDownLatch countDownLatch, Semaphore semaphore, FFmpegSession fFmpegSession) {
        updateNext(countDownLatch, semaphore);
    }

    private String getBitrate(int value, int value2, int value3) {
        boolean isFlag = value3 > 30;
        int max = Math.max(value, value2);
        if (max <= 720) {
            return isFlag ? "2000k" : "1500k";
        }
        if (max <= 1280) {
            return isFlag ? "4000k" : "3000k";
        }
        if (max <= 1920) {
            return isFlag ? "6000k" : "4500k";
        }
        return "8000k";
    }

    private String getBestH264Codec() {
        String output;
        try {
            FFmpegSession execute = FFmpegKit.execute("-hide_banner -encoders");
            if (!ReturnCode.isSuccess(execute.getReturnCode()) || (output = execute.getOutput()) == null) {
                return null;
            }
            String lowerCase = output.toLowerCase();
            boolean contains = lowerCase.contains(" h264_mediacodec ");
            boolean contains2 = lowerCase.contains(" libx264 ");
            if (!contains2 && contains) {
                return "h264_mediacodec";
            }
            int value = Build.VERSION.SDK_INT;
            if (value <= 29) {
                if (contains2) {
                    return "libx264";
                }
                if (contains) {
                    return "h264_mediacodec";
                }
                return null;
            }
            if (value == 30) {
                if (contains2) {
                    return "libx264";
                }
                if (contains) {
                    return "h264_mediacodec";
                }
                return null;
            }
            if (contains) {
                return "h264_mediacodec";
            }
            if (contains2) {
                return "libx264";
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void releaseWakeLock() {
        try {
            getWindow().clearFlags(128);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        clearFFmpeg();
        super.onDestroy();
        try {
            this.isDestroy = true;
            releaseWakeLock();
            new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    if (ProgressViewActivity.this.mTemplate != null) {
                        ProgressViewActivity.this.deleteFolderWithCommonsIO(new File(ProgressViewActivity.this.mTemplate.getFolder_template()));
                    }
                }
            }).start();
            Thread thread = this.workerThread;
            if (thread != null) {
                thread.interrupt();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFolderWithCommonsIO(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                FileUtils.deleteDirectory(file);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        deleteDirectoryManually(file);
    }

    private void deleteDirectoryManually(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteDirectoryManually(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeProgress() {
        this.isDestroy = true;
        this.uiHandler.post(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.6
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressViewActivity.this.isCancel) {
                    return;
                }
                ProgressViewActivity.this.displayedProgress += (100.0f - ProgressViewActivity.this.displayedProgress) * 0.45f;
                ProgressViewActivity.this.progressIndicator.setProgress(Math.min(Math.max(Math.round(ProgressViewActivity.this.displayedProgress), 0), ProgressViewActivity.this.progressIndicator.getMax()));
                boolean isFlag = ((float) ProgressViewActivity.this.progressIndicator.getProgress()) >= 100.0f;
                boolean z2 = Math.abs(ProgressViewActivity.this.displayedProgress - 100.0f) < 0.1f;
                if (isFlag || z2) {
                    ProgressViewActivity.this.progressIndicator.setProgress(100);
                    ProgressViewActivity.this.displayedProgress = 100.0f;
                    ProgressViewActivity.this.targetProgress = 100.0f;
                    ProgressViewActivity progressViewActivity = ProgressViewActivity.this;
                    progressViewActivity.insertToGallery(Uri.parse(progressViewActivity.mUri));
                    ProgressViewActivity.this.toShare();
                    return;
                }
                ProgressViewActivity.this.uiHandler.postDelayed(this, 16L);
            }
        });
    }

    protected void updateProgressDialog(Statistics statistics) {
        if (statistics == null || this.isDestroy) {
            return;
        }
        try {
            int time = (int) statistics.getTime();
            if (time <= 0) {
                return;
            }
            float currentStepDuration = (time / 1000.0f) / this.renderManager.getCurrentStepDuration();
            if (currentStepDuration > 1.0f) {
                currentStepDuration = 1.0f;
            }
            this.targetProgress = this.renderManager.updateLocalProgress(currentStepDuration) * 100.0f;
            if (this.isAnimating) {
                return;
            }
            startSmoothAnimation();
        } catch (Exception unused) {
        }
    }

    private void startSmoothAnimation() {
        this.isAnimating = true;
        this.uiHandler.post(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressViewActivity.this.isDestroy) {
                    return;
                }
                ProgressViewActivity.this.displayedProgress += (ProgressViewActivity.this.targetProgress - ProgressViewActivity.this.displayedProgress) * 0.1f;
                ProgressViewActivity.this.progressIndicator.setProgress(Math.max(0, Math.min(Math.round(ProgressViewActivity.this.displayedProgress), ProgressViewActivity.this.progressIndicator.getMax())));
                if (Math.abs(ProgressViewActivity.this.displayedProgress - ProgressViewActivity.this.targetProgress) > 0.1f) {
                    ProgressViewActivity.this.uiHandler.postDelayed(this, 16L);
                } else {
                    ProgressViewActivity.this.isAnimating = false;
                }
            }
        });
    }

    public void export(String[] strArr) {
        this.id_ffmpeg.add(Long.valueOf(FFmpegKit.executeWithArgumentsAsync(strArr, new FFmpegSessionCompleteCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.8
            @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
            public void apply(final FFmpegSession fFmpegSession) {
                ProgressViewActivity.this.runOnUiThread(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ProgressViewActivity.this.cancelDialog();
                        if (ProgressViewActivity.this.renderManager != null) {
                            ProgressViewActivity.this.renderManager.nextTask();
                        }
                        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
                            ProgressViewActivity.this.completeProgress();
                        } else {
                            ProgressViewActivity.this.showError(fFmpegSession);
                        }
                    }
                });
            }
        }, null, new StatisticsCallback() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.9
            @Override // com.arthenica.ffmpegkit.StatisticsCallback
            public void apply(Statistics statistics) {
                ProgressViewActivity.this.statistics = statistics;
                ProgressViewActivity progressViewActivity = ProgressViewActivity.this;
                progressViewActivity.runOnUiThread(progressViewActivity.runnableProgress);
            }
        }).getSessionId()));
    }

    /* renamed from: hazem.nurmontage.videoquran.ProgressViewActivity$10 */
    class RunnableC200010 implements Runnable {
        final /* synthetic */ FFmpegSession val$fFmpegSession;

        RunnableC200010(FFmpegSession fFmpegSession) {
            this.val$fFmpegSession = fFmpegSession;
        }

        @Override // java.lang.Runnable
        public void run() {
            final StringBuilder sb = new StringBuilder();
            if (ProgressViewActivity.this.overlay != null) {
                sb.append((CharSequence) ProgressViewActivity.this.overlay).append("\n");
            }
            String output = this.val$fFmpegSession.getOutput();
            if (output != null) {
                sb.append(output);
            }
            final LinearLayout linearLayout = (LinearLayout) ProgressViewActivity.this.findViewById(C2014R.id.layout_error);
            linearLayout.post(new Runnable() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.10.1
                @Override // java.lang.Runnable
                public void run() {
                    linearLayout.setVisibility(0);
                    TextCustumFont textCustumFont = (TextCustumFont) ProgressViewActivity.this.findViewById(C2014R.id.tv_error);
                    final ButtonCustumFont buttonCustumFont = (ButtonCustumFont) ProgressViewActivity.this.findViewById(C2014R.id.btn_support_team);
                    if (LocaleHelper.getLanguage(ProgressViewActivity.this.getApplicationContext()).equals("ar")) {
                        buttonCustumFont.setText("فريق الدعم");
                        textCustumFont.setText("يوجد مشكلة في هذا التصميم ، لن يتم حفظ هذا الفيديو أخبر فريق الدعم ");
                    } else {
                        buttonCustumFont.setText("Support Team");
                        textCustumFont.setText("There is a problem with this design, this video won't be saved. Tell the support team.");
                    }
                    buttonCustumFont.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.ProgressViewActivity.10.1.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Feadback.reportBug(ProgressViewActivity.this, sb.toString(), buttonCustumFont.getText().toString());
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showError(FFmpegSession fFmpegSession) {
        try {
            runOnUiThread(new RunnableC200010(fFmpegSession));
        } catch (Exception unused) {
            toStudio();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDialog() {
        Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertToGallery(Uri uri) {
        if (uri == null) {
            return;
        }
        File file = new File(uri.getPath());
        if (file.exists()) {
            try {
                new FileMediaScanner(this, file);
                sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toStudio() {
        Intent intent = new Intent(this, (Class<?>) EngineActivity.class);
        Template template = this.mTemplate;
        if (template != null) {
            intent.putExtra(Common.TEMPLATE, template.getIdTemplate());
        }
        intent.addFlags(65536);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toShare() {
        Intent intent = new Intent(this, (Class<?>) VideoViewActivity.class);
        if (this.mTemplate.getEntitySurahTemplate() != null) {
            intent.putExtra(Common.SURAH, this.mTemplate.getEntitySurahTemplate().getName());
            intent.putExtra(Common.READER, this.mTemplate.getEntitySurahTemplate().getReader());
        } else {
            intent.putExtra(Common.SURAH, "");
            intent.putExtra(Common.READER, "");
        }
        intent.putExtra(Common.TEMPLATE, this.mTemplate.getIdTemplate());
        intent.setData(Uri.parse(this.mTemplate.getUri_video()));
        intent.addFlags(65536);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }
}
