/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.recyclerview.widget.RecyclerView
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.GalleryPickerVideo$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.GalleryPickerVideo$1;
import hazem.nurmontage.videoquran.GalleryPickerVideo$4;
import hazem.nurmontage.videoquran.GalleryPickerVideo$5;
import hazem.nurmontage.videoquran.GalleryPickerVideo$6;
import hazem.nurmontage.videoquran.GalleryPickerVideo$7;
import hazem.nurmontage.videoquran.GalleryPickerVideo$8;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.File;
import java.util.Locale;

public class GalleryPickerVideo
extends Base {
    private ImageButton btnDone;
    private TextCustumFont btnExplore;
    private GalleryVideoAdabters galleryPickerAdabters;
    private ExploreAdabters$IExplore iExplore;
    private GalleryPickerVideo$IPicker iPicker;
    private boolean isUpdate;
    private LinearLayout layoutSetting;
    private Resources mResources;
    private OnBackPressedCallback onBackPressedCallback;
    private RecyclerView rv_explore;
    private VideoItem videoItem;

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_142(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.btnExplore;
    }

    static /* bridge */ /* synthetic */ GalleryVideoAdabters cfr_renamed_280(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.galleryPickerAdabters;
    }

    static /* bridge */ /* synthetic */ ExploreAdabters$IExplore cfr_renamed_342(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.iExplore;
    }

    static /* bridge */ /* synthetic */ GalleryPickerVideo$IPicker cfr_renamed_278(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.iPicker;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.mResources;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_141(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.rv_explore;
    }

    static /* bridge */ /* synthetic */ VideoItem cfr_renamed_298(GalleryPickerVideo galleryPickerVideo) {
        return galleryPickerVideo.videoItem;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_279(GalleryPickerVideo galleryPickerVideo, GalleryVideoAdabters galleryVideoAdabters) {
        galleryPickerVideo.galleryPickerAdabters = galleryVideoAdabters;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_66(GalleryPickerVideo galleryPickerVideo, boolean bl) {
        galleryPickerVideo.isUpdate = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_299(GalleryPickerVideo galleryPickerVideo, VideoItem videoItem) {
        galleryPickerVideo.videoItem = videoItem;
    }

    public GalleryPickerVideo() {
        Object object = new GalleryPickerVideo$1(this, true);
        this.onBackPressedCallback = object;
        super(this);
        this.iPicker = object;
        super(this);
        this.iExplore = object;
    }

    private void initFolder() {
        int n = R$id.tv_folders;
        Object object = (TextCustumFont)this.findViewById(n);
        this.btnExplore = object;
        Object object2 = this.mResources;
        int n2 = R$string.all;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object = this.btnExplore;
        object2 = new GalleryPickerVideo$6(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object2 = new GalleryPickerVideo$7(this);
        object = new Thread((Runnable)object2);
        ((Thread)object).start();
    }

    private void initViews() {
        int n = R$id.btn_onBack;
        View view = this.findViewById(n);
        GalleryPickerVideo$8 galleryPickerVideo$8 = new GalleryPickerVideo$8(this);
        view.setOnClickListener((View.OnClickListener)galleryPickerVideo$8);
    }

    private boolean isImageFile(File object) {
        boolean bl;
        String string2;
        boolean bl2 = ((String)(object = ((File)object).getName().toLowerCase())).endsWith(string2 = ".jpg");
        if (!(bl2 || (bl2 = ((String)object).endsWith(string2 = ".jpeg")) || (bl = ((String)object).endsWith(string2 = ".png")))) {
            bl = false;
            object = null;
        } else {
            bl = true;
        }
        return bl;
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat.Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void setSetting(boolean bl) {
        LinearLayout linearLayout;
        if (bl) {
            return;
        }
        int n = R$id.to_setting;
        this.layoutSetting = linearLayout = (LinearLayout)this.findViewById(n);
        linearLayout.setVisibility(0);
        linearLayout = this.layoutSetting;
        GalleryPickerVideo$5 galleryPickerVideo$5 = new GalleryPickerVideo$5(this);
        linearLayout.setOnClickListener((View.OnClickListener)galleryPickerVideo$5);
    }

    private void updateSetting() {
        String string2;
        int n = Build.VERSION.SDK_INT;
        int n2 = 33;
        if (n >= n2 && ((n = ContextCompat.checkSelfPermission((Context)this, (String)(string2 = "android.permission.READ_MEDIA_IMAGES"))) == 0 || (n = ContextCompat.checkSelfPermission((Context)this, (String)(string2 = "android.permission.READ_MEDIA_VIDEO"))) == 0)) {
            this.recreate();
        } else {
            n = Build.VERSION.SDK_INT;
            n2 = 34;
            if ((n < n2 || (n = ContextCompat.checkSelfPermission((Context)this, (String)(string2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"))) != 0) && (n = ContextCompat.checkSelfPermission((Context)this, (String)(string2 = "android.permission.READ_EXTERNAL_STORAGE"))) == 0) {
                this.recreate();
            }
        }
        this.isUpdate = false;
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void changeFolder(String object) {
        Object object2 = this.mResources;
        int n = R$string.all;
        boolean bl = ((String)object).equals(object2 = object2.getString(n));
        if (bl) {
            object = this.galleryPickerAdabters;
            ((GalleryVideoAdabters)((Object)object)).updateAll();
        } else {
            object2 = this.galleryPickerAdabters;
            ((GalleryVideoAdabters)((Object)object2)).update((String)object);
        }
    }

    public String formatDuration(int n) {
        int n2 = (n /= 1000) % 60;
        n = n / 60 % 60;
        Locale locale = Locale.ENGLISH;
        Object[] objectArray = Integer.valueOf(n);
        Integer n3 = n2;
        objectArray = new Object[]{objectArray, n3};
        return String.format(locale, "%02d:%02d", objectArray);
    }

    public boolean isVideoFile(File object) {
        boolean bl;
        String string2;
        boolean bl2 = ((String)(object = ((File)object).getName().toLowerCase())).endsWith(string2 = ".mp4");
        if (!(bl2 || (bl2 = ((String)object).endsWith(string2 = ".avi")) || (bl2 = ((String)object).endsWith(string2 = ".mov")) || (bl2 = ((String)object).endsWith(string2 = ".mkv")) || (bl2 = ((String)object).endsWith(string2 = ".wmv")) || (bl2 = ((String)object).endsWith(string2 = ".flv")) || (bl2 = ((String)object).endsWith(string2 = ".webm")) || (bl2 = ((String)object).endsWith(string2 = ".3gp")) || (bl2 = ((String)object).endsWith(string2 = ".m4v")) || (bl2 = ((String)object).endsWith(string2 = ".mpg")) || (bl = ((String)object).endsWith(string2 = ".mpeg")))) {
            bl = false;
            object = null;
        } else {
            bl = true;
        }
        return bl;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        int bl = R$layout.activity_gallery_picker_video;
        this.setContentView(bl);
        int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        View view = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)view);
        view = null;
        bundle.setAppearanceLightStatusBars(false);
        bundle.setAppearanceLightNavigationBars(false);
        int n2 = R$id.main;
        bundle = this.findViewById(n2);
        Object object = new GalleryPickerVideo$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)bundle, (OnApplyWindowInsetsListener)object);
        bundle = null;
        Common.LIST_SELECT = null;
        boolean bl2 = true;
        Common.INDEX_LIST_SELECT = bl2;
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        object = this.getResources();
        this.mResources = object;
        int n3 = R$id.tv_done;
        object = (ImageButton)this.findViewById(n3);
        this.btnDone = object;
        n3 = R$id.rv_explore;
        object = (RecyclerView)this.findViewById(n3);
        this.rv_explore = object;
        object = this.btnDone;
        object2 = new GalleryPickerVideo$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        this.initViews();
        this.initFolder();
        n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4 && ((n3 = ContextCompat.checkSelfPermission((Context)this, (String)(object = "android.permission.READ_MEDIA_IMAGES"))) == 0 || (n3 = ContextCompat.checkSelfPermission((Context)this, (String)(object = "android.permission.READ_MEDIA_VIDEO"))) == 0)) {
            this.setSetting(bl2);
        } else {
            n3 = Build.VERSION.SDK_INT;
            n4 = 34;
            if (n3 >= n4 && (n3 = ContextCompat.checkSelfPermission((Context)this, (String)(object = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"))) == 0) {
                this.setSetting(false);
            } else {
                object = "android.permission.READ_EXTERNAL_STORAGE";
                n3 = ContextCompat.checkSelfPermission((Context)this, (String)object);
                if (n3 == 0) {
                    this.setSetting(bl2);
                } else {
                    this.setSetting(false);
                }
            }
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.iExplore = null;
        this.iPicker = null;
        this.onBackPressedCallback = null;
    }

    protected void onResume() {
        super.onResume();
        boolean bl = this.isUpdate;
        if (bl) {
            this.updateSetting();
        }
    }
}

