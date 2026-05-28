/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources
 *  android.media.MediaMetadataRetriever
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package hazem.nurmontage.videoquran.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.databinding.FragmentGalleryVideoBinding;
import hazem.nurmontage.videoquran.fragment.GalleryPhotosFragment$1;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GalleryPhotosFragment
extends Fragment {
    public static GalleryPhotosFragment instance;
    private GalleryVideoAdabters adabters;
    private File folder;
    private List gallerySelecteds;
    private FragmentGalleryVideoBinding galleryVideoBinding;
    private GalleryPickerVideo$IPicker iPicker;

    static /* bridge */ /* synthetic */ GalleryVideoAdabters cfr_renamed_202(GalleryPhotosFragment galleryPhotosFragment) {
        return galleryPhotosFragment.adabters;
    }

    public GalleryPhotosFragment() {
    }

    public GalleryPhotosFragment(List list, File file, GalleryPickerVideo$IPicker galleryPickerVideo$IPicker) {
        this.iPicker = galleryPickerVideo$IPicker;
        this.folder = file;
        this.gallerySelecteds = list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static GalleryPhotosFragment get(List object, File file, GalleryPickerVideo$IPicker galleryPickerVideo$IPicker) {
        Class<GalleryPhotosFragment> clazz = GalleryPhotosFragment.class;
        synchronized (clazz) {
            Class<GalleryPhotosFragment> clazz2 = GalleryPhotosFragment.class;
            synchronized (clazz2) {
                GalleryPhotosFragment galleryPhotosFragment = instance;
                if (galleryPhotosFragment != null) return instance;
                instance = galleryPhotosFragment = new GalleryPhotosFragment((List)object, file, galleryPickerVideo$IPicker);
                return instance;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getVideoDuration(String string2) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(string2);
        string2 = mediaMetadataRetriever.extractMetadata(9);
        int n = Integer.parseInt(string2);
        try {
            mediaMetadataRetriever.release();
            return n;
        }
        catch (IOException iOException) {
            return n;
        }
    }

    private boolean isVideoFile(File object) {
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

    private void loadVideos(View object) {
        Object object2;
        int n = (int)((float)ScreenUtils.getScreenWidth((Activity)this.getActivity()) * 0.24f);
        int bl = R$id.rv_gallery;
        object = (RecyclerView)object.findViewById(bl);
        boolean bl2 = true;
        object.setHasFixedSize(bl2);
        Object object3 = this.getContext();
        int n2 = 3;
        Object object4 = new GridLayoutManager(object3, n2);
        object.setLayoutManager((RecyclerView.LayoutManager)object4);
        int n3 = 20;
        object.setItemViewCacheSize(n3);
        object.setDrawingCacheEnabled(bl2);
        boolean bl3 = false;
        object.setItemAnimator(null);
        object3 = AppUtils.getAppVersionName(this.getContext());
        Resources resources = this.getResources();
        List list = this.gallerySelecteds;
        GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = this.iPicker;
        object4 = object2;
        this.adabters = object2 = new GalleryVideoAdabters((String)object3, resources, list, n, galleryPickerVideo$IPicker);
        object.setAdapter((RecyclerView.Adapter)object2);
        object = this.folder;
        if (object != null) {
            this.changeFolder((File)object);
        } else {
            object2 = new GalleryPhotosFragment$1(this);
            object = new Thread((Runnable)object2);
            ((Thread)object).start();
        }
    }

    public void changeFolder(File object) {
        int n;
        int n2;
        Object object2 = this.adabters;
        ((GalleryVideoAdabters)((Object)object2)).clear();
        if (object != null && (n2 = ((File)object).exists()) != 0 && (n2 = ((File)object).isDirectory()) != 0 && (object = ((File)object).listFiles()) != null) {
            int n3;
            object2 = new ArrayList();
            int n4 = ((File[])object).length;
            int n5 = 0;
            while (true) {
                n3 = 1;
                if (n5 >= n4) break;
                Object object3 = object[n5];
                boolean bl = ((File)object3).isFile();
                if (bl && (bl = this.isVideoFile((File)object3))) {
                    object3 = ((File)object3).getAbsolutePath();
                    this.getVideoDuration((String)object3);
                    object3 = this.isContains((String)object3);
                    if (object3 != null) {
                        ((VideoItem)object3).setSelect(n3 != 0);
                        ((ArrayList)object2).add(object3);
                    }
                }
                ++n5;
            }
            n = ((ArrayList)object2).isEmpty() ? 1 : 0;
            if (n == 0) {
                this.adabters.addItems((List)object2);
                object = this.adabters;
                n2 = ((GalleryVideoAdabters)((Object)object)).getItemCount() - n3;
                object.notifyItemInserted(n2);
                return;
            }
        }
        if ((n = ((GalleryVideoAdabters)((Object)(object = this.adabters))).getItemCount()) == 0) {
            object = this.adabters;
            object.notifyDataSetChanged();
        }
    }

    public void inselect(int n) {
        this.adabters.inselectItem(n);
    }

    public VideoItem isContains(String string2) {
        boolean bl;
        Object object = this.gallerySelecteds;
        if (object == null) {
            return null;
        }
        object = object.iterator();
        while (bl = object.hasNext()) {
            boolean bl2;
            GallerySelected gallerySelected = (GallerySelected)object.next();
            Object object2 = gallerySelected.getVideoItem();
            if (object2 == null || !(bl2 = ((String)(object2 = gallerySelected.getVideoItem().getPath())).equals(string2))) continue;
            return gallerySelected.getVideoItem();
        }
        return null;
    }

    public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        object = FragmentGalleryVideoBinding.inflate((LayoutInflater)object, viewGroup, false);
        this.galleryVideoBinding = object;
        object = ((FragmentGalleryVideoBinding)object).getRoot();
        this.loadVideos((View)object);
        return object;
    }

    public void onDestroyView() {
        this.iPicker = null;
        FragmentGalleryVideoBinding fragmentGalleryVideoBinding = this.galleryVideoBinding;
        if (fragmentGalleryVideoBinding != null) {
            fragmentGalleryVideoBinding = fragmentGalleryVideoBinding.getRoot();
            fragmentGalleryVideoBinding.removeAllViews();
            this.galleryVideoBinding = null;
        }
        instance = null;
        super.onDestroyView();
    }
}

