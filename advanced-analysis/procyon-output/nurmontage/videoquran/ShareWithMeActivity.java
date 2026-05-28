// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.WindowCompat;
import android.os.Bundle;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.AudioUploadHelper;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.content.Intent;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.File;
import android.net.Uri;

public class ShareWithMeActivity extends Base
{
    private File copyVideoToCache(final Uri uri) {
        final File file = new File(this.getCacheDir(), "temp_video.mp4");
        try {
            final InputStream openInputStream = this.getContentResolver().openInputStream(uri);
            try {
                final FileOutputStream fileOutputStream = new FileOutputStream(file);
                final byte[] array = new byte[4096];
                while (true) {
                    final int read = openInputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                }
                openInputStream.close();
                fileOutputStream.close();
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
        return file;
    }
    
    private Parcelable getParcelable(final Intent intent, final String s, final Class clazz) {
        if (Build$VERSION.SDK_INT >= 33) {
            return (Parcelable)intent.getParcelableExtra(s, clazz);
        }
        return intent.getParcelableExtra(s);
    }
    
    private void handleAudio(final Intent intent) {
        final Uri data = (Uri)this.getParcelable(intent, "android.intent.extra.STREAM", Uri.class);
        if (data != null) {
            final Intent intent2 = new Intent((Context)this, (Class)EngineActivity.class);
            final File processAudioUriForUpload = AudioUploadHelper.processAudioUriForUpload((Context)this, data, "share_with_me.mp3");
            intent2.setData(data);
            intent2.putExtra("muri", processAudioUriForUpload.getAbsolutePath());
            this.startActivity(intent2);
            this.finish();
        }
    }
    
    private void handleImg(final Intent intent) {
        final Uri uri = (Uri)this.getParcelable(intent, "android.intent.extra.STREAM", Uri.class);
        if (uri != null) {
            final Intent intent2 = new Intent((Context)this, (Class)EngineActivity.class);
            intent2.putExtra("img_bg", this.savePermanent(uri));
            this.startActivity(intent2);
            this.finish();
        }
    }
    
    private void handleIntent(final Intent intent) {
        final String type = intent.getType();
        if (type == null) {
            this.startActivity(new Intent((Context)this, (Class)WorkUserActivity.class));
            this.finish();
            return;
        }
        LocalPersistence.deleteTemplate((Context)this, "template_tmp");
        if (type.startsWith("image/")) {
            this.handleImg(intent);
        }
        else if (type.startsWith("audio/")) {
            this.handleAudio(intent);
        }
        else if (type.startsWith("video/")) {
            this.handleVideo(intent);
        }
    }
    
    private void handleVideo(final Intent intent) {
        final Uri uri = (Uri)this.getParcelable(intent, "android.intent.extra.STREAM", Uri.class);
        if (uri != null) {
            this.processVideo(uri);
        }
    }
    
    private void processVideo(final Uri uri) {
        final String absolutePath = this.copyVideoToCache(uri).getAbsolutePath();
        final String string = this.getExternalFilesDir((String)null) + "/share_with_me.m4a";
        FFmpegKit.executeAsync("-y -i \"" + absolutePath + "\" -vn -map 0:a? -c:a copy \"" + string + "\"", (FFmpegSessionCompleteCallback)new ShareWithMeActivity$$ExternalSyntheticLambda0(this, string, absolutePath));
    }
    
    private String savePermanent(final Uri uri) {
        final String str = "img_";
        try {
            final InputStream openInputStream = this.getContentResolver().openInputStream(uri);
            try {
                try {
                    final File filesDir = this.getFilesDir();
                    try {
                        final StringBuilder append = new StringBuilder(str).append(System.currentTimeMillis()).append(".jpg");
                        try {
                            final File file = new File(filesDir, append.toString());
                            final FileOutputStream fileOutputStream = new FileOutputStream(file);
                            final byte[] array = new byte[1024];
                            while (true) {
                                final int read = openInputStream.read(array);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(array, 0, read);
                            }
                            openInputStream.close();
                            fileOutputStream.close();
                            return file.getAbsolutePath();
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                            return null;
                        }
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex3) {}
            }
            catch (final Exception ex4) {}
        }
        catch (final Exception ex5) {}
    }
    
    private void toEngine(final Uri data, final String s) {
        final Intent intent = new Intent((Context)this, (Class)EngineActivity.class);
        intent.setData(data);
        intent.putExtra("muri", s);
        this.startActivity(intent);
        this.finish();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R$layout.activity_share_with_me);
        final int n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        final boolean b = true;
        insetsController.setAppearanceLightStatusBars(b);
        insetsController.setAppearanceLightNavigationBars(b);
        this.handleIntent(this.getIntent());
    }
}
