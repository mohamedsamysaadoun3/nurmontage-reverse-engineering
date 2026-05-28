// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwner;
import hazem.nurmontage.videoquran.common.Common;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import java.io.File;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.os.Build$VERSION;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.model.PhotoItem;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageButton;

public class GalleryPickerOneImage extends Base
{
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
    
    public GalleryPickerOneImage() {
        this.onBackPressedCallback = new GalleryPickerOneImage$1(this, true);
        this.iPicker = new GalleryPickerOneImage$2(this);
        this.iExplore = new GalleryPickerOneImage$3(this);
    }
    
    private void initFolder() {
        (this.btnExplore = (TextCustumFont)this.findViewById(R$id.tv_folders)).setText((CharSequence)this.mResources.getString(R$string.all));
        this.btnExplore.setOnClickListener((View$OnClickListener)new GalleryPickerOneImage$6(this));
        new Thread(new GalleryPickerOneImage$7(this)).start();
    }
    
    private void initViews() {
        this.findViewById(R$id.btn_onBack).setOnClickListener((View$OnClickListener)new GalleryPickerOneImage$8(this));
    }
    
    private void setSetting(final boolean b) {
        if (b) {
            return;
        }
        (this.layoutSetting = (LinearLayout)this.findViewById(R$id.to_setting)).setVisibility(0);
        this.layoutSetting.setOnClickListener((View$OnClickListener)new GalleryPickerOneImage$5(this));
    }
    
    private void updateSetting() {
        if (Build$VERSION.SDK_INT >= 33 && (ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_IMAGES") == 0 || ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_VIDEO") == 0)) {
            this.recreate();
        }
        else if (Build$VERSION.SDK_INT < 34 || ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) {
            if (ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                this.recreate();
            }
        }
        this.isUpdate = false;
    }
    
    public void changeFolder(final String s) {
        if (s.equals(this.mResources.getString(R$string.all))) {
            this.galleryPickerAdabters.updateAll();
        }
        else {
            this.galleryPickerAdabters.update(s);
        }
    }
    
    public boolean isImageFile(final File file) {
        final String lowerCase = file.getName().toLowerCase();
        return lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png");
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_gallery_picker_video);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new GalleryPickerOneImage$$ExternalSyntheticLambda0());
        Common.LIST_SELECT = null;
        final int n2 = Common.INDEX_LIST_SELECT = 1;
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        this.mResources = this.getResources();
        this.btnDone = (ImageButton)this.findViewById(R$id.tv_done);
        this.rv_explore = (RecyclerView)this.findViewById(R$id.rv_explore);
        this.btnDone.setOnClickListener((View$OnClickListener)new GalleryPickerOneImage$4(this));
        this.initViews();
        this.initFolder();
        if (Build$VERSION.SDK_INT >= 33 && (ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_IMAGES") == 0 || ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_VIDEO") == 0)) {
            this.setSetting((boolean)(n2 != 0));
        }
        else if (Build$VERSION.SDK_INT >= 34 && ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            this.setSetting(false);
        }
        else if (ContextCompat.checkSelfPermission((Context)this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            this.setSetting((boolean)(n2 != 0));
        }
        else {
            this.setSetting(false);
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
        if (this.isUpdate) {
            this.updateSetting();
        }
    }
}
