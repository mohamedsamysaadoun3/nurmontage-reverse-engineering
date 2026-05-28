package hazem.nurmontage.videoquran;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.Utils.AppSettingsHelper;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.model.ExploreItem;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GalleryPickerVideo extends Base {
    private ImageButton btnDone;
    private TextCustumFont btnExplore;
    private GalleryVideoAdabters galleryPickerAdabters;
    private boolean isUpdate;
    private LinearLayout layoutSetting;
    private Resources mResources;
    private RecyclerView rv_explore;
    private VideoItem videoItem;
    private OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (GalleryPickerVideo.this.rv_explore != null && GalleryPickerVideo.this.rv_explore.getVisibility() == 0) {
                GalleryPickerVideo.this.btnExplore.performClick();
                return;
            }
            Common.LIST_SELECT = null;
            Common.INDEX_LIST_SELECT = 1;
            GalleryPickerVideo.this.finish();
        }
    };
    private IPicker iPicker = new IPicker() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.2
        @Override // hazem.nurmontage.videoquran.GalleryPickerVideo.IPicker
        public void onAdd(PhotoItem photoItem, int resourceId) {
        }

        @Override // hazem.nurmontage.videoquran.GalleryPickerVideo.IPicker
        public void onDelete(GallerySelected gallerySelected) {
        }

        @Override // hazem.nurmontage.videoquran.GalleryPickerVideo.IPicker
        public void onEmptyList() {
        }

        @Override // hazem.nurmontage.videoquran.GalleryPickerVideo.IPicker
        public void onAdd(VideoItem videoItem, int resourceId) {
            GalleryPickerVideo.this.videoItem = videoItem;
        }
    };
    private ExploreAdabters.IExplore iExplore = new ExploreAdabters.IExplore() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.3
        @Override // hazem.nurmontage.videoquran.adabter.ExploreAdabters.IExplore
        public void folder(File file, String textValue, String textValue2) {
            if (GalleryPickerVideo.this.rv_explore.getVisibility() != 4) {
                GalleryPickerVideo.this.rv_explore.setVisibility(4);
            }
            GalleryPickerVideo.this.changeFolder(textValue2);
            GalleryPickerVideo.this.btnExplore.setText(textValue);
        }

        @Override // hazem.nurmontage.videoquran.adabter.ExploreAdabters.IExplore
        public void done() {
            if (GalleryPickerVideo.this.rv_explore.getVisibility() != 4) {
                GalleryPickerVideo.this.rv_explore.setVisibility(4);
            }
        }
    };

    public interface IPicker {
        void onAdd(PhotoItem photoItem, int value);

        void onAdd(VideoItem videoItem, int value);

        void onDelete(GallerySelected gallerySelected);

        void onEmptyList();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.iExplore = null;
        this.iPicker = null;
        this.onBackPressedCallback = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(C2014R.layout.activity_gallery_picker_video);
        setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C2014R.id.main), new OnApplyWindowInsetsListener() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GalleryPickerVideo.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        Common.LIST_SELECT = null;
        Common.INDEX_LIST_SELECT = 1;
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        this.mResources = getResources();
        this.btnDone = (ImageButton) findViewById(C2014R.id.tv_done);
        this.rv_explore = (RecyclerView) findViewById(C2014R.id.rv_explore);
        this.btnDone.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GalleryPickerVideo.this.videoItem != null) {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(GalleryPickerVideo.this.videoItem.getPath()));
                    GalleryPickerVideo.this.setResult(-1, intent);
                }
                GalleryPickerVideo.this.finish();
            }
        });
        initViews();
        initFolder();
        if (Build.VERSION.SDK_INT >= 33 && (ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") == 0 || ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_VIDEO") == 0)) {
            setSetting(true);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            setSetting(false);
        } else if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            setSetting(true);
        } else {
            setSetting(false);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    private void setSetting(boolean isFlag) {
        if (isFlag) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C2014R.id.to_setting);
        this.layoutSetting = linearLayout;
        linearLayout.setVisibility(0);
        this.layoutSetting.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GalleryPickerVideo.this.isUpdate = true;
                AppSettingsHelper.openAppSettings(GalleryPickerVideo.this);
            }
        });
    }

    private void updateSetting() {
        if (Build.VERSION.SDK_INT >= 33 && (ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") == 0 || ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_VIDEO") == 0)) {
            recreate();
        } else if ((Build.VERSION.SDK_INT < 34 || ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) && ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            recreate();
        }
        this.isUpdate = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.isUpdate) {
            updateSetting();
        }
    }

    public String formatDuration(int index) {
        int i2 = index / 1000;
        return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }

    private void initFolder() {
        TextCustumFont textCustumFont = (TextCustumFont) findViewById(C2014R.id.tv_folders);
        this.btnExplore = textCustumFont;
        textCustumFont.setText(this.mResources.getString(C2014R.string.all));
        this.btnExplore.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GalleryPickerVideo.this.rv_explore == null || GalleryPickerVideo.this.btnExplore == null) {
                    return;
                }
                if (GalleryPickerVideo.this.rv_explore.getVisibility() != 0) {
                    GalleryPickerVideo.this.rv_explore.setVisibility(0);
                    GalleryPickerVideo.this.btnExplore.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.arrow_up_float, 0);
                } else {
                    GalleryPickerVideo.this.rv_explore.setVisibility(4);
                    GalleryPickerVideo.this.btnExplore.setCompoundDrawablesWithIntrinsicBounds(0, 0, android.R.drawable.arrow_down_float, 0);
                }
            }
        });
        new Thread(new Runnable() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.7
            @Override // java.lang.Runnable
            public void run() {
                HashSet hashSet;
                String textValue;
                String textValue2;
                String filePath;
                HashSet hashSet2;
                String filePath26;
                String filePath26;
                int index;
                HashSet hashSet3;
                String filePath26;
                String filePath26;
                boolean isFlag;
                int i2;
                boolean isEnabled = false;
                String filePath27 = "_id";
                String str9 = "duration";
                String str10 = "_data";
                String str11 = null;
                Cursor query = GalleryPickerVideo.this.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id", "duration", "_data", "parent"}, "media_type=3", null, "date_added DESC");
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                HashSet hashSet4 = new HashSet();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (!query.moveToNext()) {
                        hashSet = hashSet4;
                        textValue = filePath27;
                        textValue2 = str9;
                        filePath = str10;
                        break;
                    }
                    int i5 = query.getInt(query.getColumnIndexOrThrow(str9));
                    if (i5 != 0) {
                        query.getString(query.getColumnIndexOrThrow(str10));
                        textValue = filePath27;
                        textValue2 = str9;
                        String uri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow(filePath27))).toString();
                        String parent = new File(uri).getParent();
                        if (hashSet4.contains(parent)) {
                            hashSet = hashSet4;
                            filePath = str10;
                        } else {
                            hashSet4.add(parent);
                            File file = new File(parent);
                            File[] listFiles = file.listFiles();
                            if (listFiles != null) {
                                int length = listFiles.length;
                                hashSet = hashSet4;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < length) {
                                    int i8 = length;
                                    String filePath30 = str10;
                                    if (GalleryPickerVideo.this.isVideoFile(listFiles[i6])) {
                                        i7++;
                                        if (str11 == null) {
                                            str11 = uri;
                                        }
                                    }
                                    i6++;
                                    length = i8;
                                    str10 = filePath30;
                                }
                                filePath = str10;
                                i2 = i7;
                            } else {
                                hashSet = hashSet4;
                                filePath = str10;
                                i2 = 0;
                            }
                            if (i2 > 0) {
                                i3 += i2;
                                arrayList.add(new ExploreItem(file, parent, "" + i2, file.getName(), uri));
                            }
                        }
                        arrayList2.add(new VideoItem(parent, uri, GalleryPickerVideo.this.formatDuration(i5), false));
                        i4++;
                        if (i4 > 50) {
                            break;
                        }
                        hashSet3 = hashSet;
                        isFlag = false;
                        filePath26 = textValue;
                        filePath26 = textValue2;
                    } else {
                        hashSet3 = hashSet4;
                        filePath26 = filePath27;
                        filePath26 = str9;
                        filePath = str10;
                        isFlag = isEnabled;
                    }
                    isEnabled = isFlag;
                    hashSet4 = hashSet3;
                    str9 = filePath26;
                    filePath27 = filePath26;
                    str10 = filePath;
                }
                GalleryPickerVideo.this.runOnUiThread(new Runnable() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RecyclerView recyclerView = (RecyclerView) GalleryPickerVideo.this.findViewById(C2014R.id.f358rv);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new GridLayoutManager(GalleryPickerVideo.this, 3));
                        recyclerView.setItemViewCacheSize(20);
                        recyclerView.setDrawingCacheEnabled(true);
                        recyclerView.setItemAnimator(null);
                        GalleryPickerVideo.this.galleryPickerAdabters = new GalleryVideoAdabters(AppUtils.getAppVersionName(GalleryPickerVideo.this), GalleryPickerVideo.this.mResources, null, (int) (ScreenUtils.getScreenWidth(GalleryPickerVideo.this) * 0.3f), GalleryPickerVideo.this.iPicker);
                        GalleryPickerVideo.this.galleryPickerAdabters.addItems(arrayList2);
                        recyclerView.setAdapter(GalleryPickerVideo.this.galleryPickerAdabters);
                    }
                });
                String str13 = str11;
                while (query.moveToNext()) {
                    String str14 = textValue2;
                    int i9 = query.getInt(query.getColumnIndexOrThrow(str14));
                    if (i9 != 0) {
                        String filePath36 = filePath;
                        String parent2 = new File(query.getString(query.getColumnIndexOrThrow(filePath36))).getParent();
                        String filePath36 = textValue;
                        String uri2 = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow(filePath36))).toString();
                        hashSet2 = hashSet;
                        if (hashSet2.contains(parent2)) {
                            filePath26 = str14;
                            filePath = filePath36;
                            filePath26 = filePath36;
                        } else {
                            hashSet2.add(parent2);
                            File file2 = new File(parent2);
                            File[] listFiles2 = file2.listFiles();
                            if (listFiles2 != null) {
                                int length2 = listFiles2.length;
                                filePath26 = str14;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length2) {
                                    String filePath = filePath36;
                                    String filePath38 = filePath36;
                                    if (GalleryPickerVideo.this.isVideoFile(listFiles2[i10])) {
                                        i11++;
                                        if (str13 == null) {
                                            str13 = uri2;
                                        }
                                    }
                                    i10++;
                                    filePath36 = str18;
                                    filePath36 = str17;
                                }
                                filePath = filePath36;
                                filePath26 = filePath36;
                                index = i11;
                            } else {
                                filePath26 = str14;
                                filePath = filePath36;
                                filePath26 = filePath36;
                                index = 0;
                            }
                            if (index > 0) {
                                i3 += index;
                                arrayList.add(new ExploreItem(file2, parent2, "" + index, file2.getName(), uri2));
                            }
                        }
                        arrayList2.add(new VideoItem(parent2, uri2, GalleryPickerVideo.this.formatDuration(i9), false));
                    } else {
                        hashSet2 = hashSet;
                        filePath26 = textValue;
                        filePath26 = str14;
                    }
                    textValue2 = filePath26;
                    textValue = filePath26;
                    hashSet = hashSet2;
                }
                query.close();
                arrayList.add(0, new ExploreItem(null, GalleryPickerVideo.this.mResources.getString(C2014R.string.all), "" + i3, GalleryPickerVideo.this.mResources.getString(C2014R.string.all), str13));
                GalleryPickerVideo.this.runOnUiThread(new Runnable() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.7.2
                    @Override // java.lang.Runnable
                    public void run() {
                        GalleryPickerVideo.this.galleryPickerAdabters.doneItems(arrayList2);
                        GalleryPickerVideo.this.galleryPickerAdabters.notifyDataSetChanged();
                        GalleryPickerVideo.this.rv_explore.setHasFixedSize(true);
                        GalleryPickerVideo.this.rv_explore.setLayoutManager(new LinearLayoutManager(GalleryPickerVideo.this));
                        GalleryPickerVideo.this.rv_explore.setItemViewCacheSize(20);
                        GalleryPickerVideo.this.rv_explore.setDrawingCacheEnabled(true);
                        GalleryPickerVideo.this.rv_explore.setItemAnimator(null);
                        GalleryPickerVideo.this.rv_explore.setAdapter(new ExploreAdabters(arrayList, (int) (ScreenUtils.getScreenWidth(GalleryPickerVideo.this) * 0.2f), GalleryPickerVideo.this.iExplore, GalleryPickerVideo.this.btnExplore.getText().toString()));
                        GalleryPickerVideo.this.findViewById(C2014R.id.view_progress).setVisibility(8);
                        GalleryPickerVideo.this.btnExplore.setVisibility(0);
                    }
                });
            }
        }).start();
    }

    public boolean isVideoFile(File file) {
        String lowerCase = file.getName().toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".avi") || lowerCase.endsWith(".mov") || lowerCase.endsWith(".mkv") || lowerCase.endsWith(".wmv") || lowerCase.endsWith(".flv") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".3gp") || lowerCase.endsWith(".m4v") || lowerCase.endsWith(".mpg") || lowerCase.endsWith(".mpeg");
    }

    private boolean isImageFile(File file) {
        String lowerCase = file.getName().toLowerCase();
        return lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png");
    }

    private void initViews() {
        findViewById(C2014R.id.btn_onBack).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.GalleryPickerVideo.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GalleryPickerVideo.this.finish();
            }
        });
    }

    public void changeFolder(String textValue) {
        if (textValue.equals(this.mResources.getString(C2014R.string.all))) {
            this.galleryPickerAdabters.updateAll();
        } else {
            this.galleryPickerAdabters.update(textValue);
        }
    }
}
