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
import hazem.nurmontage.videoquran.GalleryPickerOneImage$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$1;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$4;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$5;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$6;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$7;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$8;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.File;

public class GalleryPickerOneImage
extends Base {
    private ImageButton btnDone;
    private TextCustumFont btnExplore;
    private GalleryPickerAdabters galleryPickerAdabters;
    private ExploreAdabters$IExplore iExplore;
    private GalleryPickerVideo$IPicker iPicker;
    private boolean isUpdate;
    private LinearLayout layoutSetting;
    private PhotoItem mPhotoItem;
    private Resources mResources;
    private OnBackPressedCallback onBackPressedCallback;
    private RecyclerView rv_explore;

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_142(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.btnExplore;
    }

    static /* bridge */ /* synthetic */ GalleryPickerAdabters cfr_renamed_280(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.galleryPickerAdabters;
    }

    static /* bridge */ /* synthetic */ ExploreAdabters$IExplore cfr_renamed_342(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.iExplore;
    }

    static /* bridge */ /* synthetic */ GalleryPickerVideo$IPicker cfr_renamed_278(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.iPicker;
    }

    static /* bridge */ /* synthetic */ PhotoItem cfr_renamed_271(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.mPhotoItem;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.mResources;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_141(GalleryPickerOneImage galleryPickerOneImage) {
        return galleryPickerOneImage.rv_explore;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_279(GalleryPickerOneImage galleryPickerOneImage, GalleryPickerAdabters galleryPickerAdabters) {
        galleryPickerOneImage.galleryPickerAdabters = galleryPickerAdabters;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_66(GalleryPickerOneImage galleryPickerOneImage, boolean bl) {
        galleryPickerOneImage.isUpdate = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_407(GalleryPickerOneImage galleryPickerOneImage, PhotoItem photoItem) {
        galleryPickerOneImage.mPhotoItem = photoItem;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_408(GalleryPickerOneImage galleryPickerOneImage, boolean bl) {
        galleryPickerOneImage.setSetting(bl);
    }

    public GalleryPickerOneImage() {
        Object object = new GalleryPickerOneImage$1(this, true);
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
        object2 = new GalleryPickerOneImage$6(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object2 = new GalleryPickerOneImage$7(this);
        object = new Thread((Runnable)object2);
        ((Thread)object).start();
    }

    private void initViews() {
        int n = R$id.btn_onBack;
        View view = this.findViewById(n);
        GalleryPickerOneImage$8 galleryPickerOneImage$8 = new GalleryPickerOneImage$8(this);
        view.setOnClickListener((View.OnClickListener)galleryPickerOneImage$8);
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
        GalleryPickerOneImage$5 galleryPickerOneImage$5 = new GalleryPickerOneImage$5(this);
        linearLayout.setOnClickListener((View.OnClickListener)galleryPickerOneImage$5);
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

    public void changeFolder(String object) {
        Object object2 = this.mResources;
        int n = R$string.all;
        boolean bl = ((String)object).equals(object2 = object2.getString(n));
        if (bl) {
            object = this.galleryPickerAdabters;
            ((GalleryPickerAdabters)((Object)object)).updateAll();
        } else {
            object2 = this.galleryPickerAdabters;
            ((GalleryPickerAdabters)((Object)object2)).update((String)object);
        }
    }

    public boolean isImageFile(File object) {
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
        Object object = new GalleryPickerOneImage$$ExternalSyntheticLambda0();
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
        object2 = new GalleryPickerOneImage$4(this);
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

