// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import hazem.nurmontage.videoquran.R$id;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import android.view.View;
import java.io.IOException;
import android.media.MediaMetadataRetriever;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.databinding.FragmentGalleryVideoBinding;
import java.util.List;
import java.io.File;
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import androidx.fragment.app.Fragment;

public class GalleryPhotosFragment extends Fragment
{
    public static GalleryPhotosFragment instance;
    private GalleryVideoAdabters adabters;
    private File folder;
    private List gallerySelecteds;
    private FragmentGalleryVideoBinding galleryVideoBinding;
    private GalleryPickerVideo$IPicker iPicker;
    
    public GalleryPhotosFragment() {
    }
    
    public GalleryPhotosFragment(final List gallerySelecteds, final File folder, final GalleryPickerVideo$IPicker iPicker) {
        this.iPicker = iPicker;
        this.folder = folder;
        this.gallerySelecteds = gallerySelecteds;
    }
    
    public static GalleryPhotosFragment get(final List list, final File file, final GalleryPickerVideo$IPicker galleryPickerVideo$IPicker) {
        final Class<GalleryPhotosFragment> clazz = GalleryPhotosFragment.class;
        monitorenter(clazz);
        final Class<GalleryPhotosFragment> clazz2 = GalleryPhotosFragment.class;
        try {
            synchronized (clazz2) {
                if (GalleryPhotosFragment.instance == null) {
                    GalleryPhotosFragment.instance = new GalleryPhotosFragment(list, file, galleryPickerVideo$IPicker);
                }
                return GalleryPhotosFragment.instance;
            }
        }
        finally {
            monitorexit(clazz);
        }
    }
    
    private int getVideoDuration(String metadata) {
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(metadata);
        metadata = mediaMetadataRetriever.extractMetadata(9);
        final int int1 = Integer.parseInt(metadata);
        try {
            mediaMetadataRetriever.release();
            return int1;
        }
        catch (final IOException ex) {
            return int1;
        }
    }
    
    private boolean isVideoFile(final File file) {
        final String lowerCase = file.getName().toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".avi") || lowerCase.endsWith(".mov") || lowerCase.endsWith(".mkv") || lowerCase.endsWith(".wmv") || lowerCase.endsWith(".flv") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".3gp") || lowerCase.endsWith(".m4v") || lowerCase.endsWith(".mpg") || lowerCase.endsWith(".mpeg");
    }
    
    private void loadVideos(final View view) {
        final int n = (int)(ScreenUtils.getScreenWidth((Activity)this.getActivity()) * 0.24f);
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(R$id.rv_gallery);
        final boolean b = true;
        recyclerView.setHasFixedSize(b);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new GridLayoutManager(this.getContext(), 3));
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(b);
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        recyclerView.setAdapter((RecyclerView$Adapter)(this.adabters = new GalleryVideoAdabters(AppUtils.getAppVersionName(this.getContext()), this.getResources(), this.gallerySelecteds, n, this.iPicker)));
        final File folder = this.folder;
        if (folder != null) {
            this.changeFolder(folder);
        }
        else {
            new Thread(new GalleryPhotosFragment$1(this)).start();
        }
    }
    
    public void changeFolder(final File file) {
        this.adabters.clear();
        if (file != null && file.exists() && file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                final ArrayList<VideoItem> list = new ArrayList<VideoItem>();
                final int length = listFiles.length;
                int n = 0;
                int select;
                while (true) {
                    select = 1;
                    if (n >= length) {
                        break;
                    }
                    final File file2 = listFiles[n];
                    if (file2.isFile() && this.isVideoFile(file2)) {
                        final String absolutePath = file2.getAbsolutePath();
                        this.getVideoDuration(absolutePath);
                        final VideoItem contains = this.isContains(absolutePath);
                        if (contains != null) {
                            contains.setSelect((boolean)(select != 0));
                            list.add(contains);
                        }
                    }
                    ++n;
                }
                if (!list.isEmpty()) {
                    this.adabters.addItems(list);
                    final GalleryVideoAdabters adabters = this.adabters;
                    adabters.notifyItemInserted(adabters.getItemCount() - select);
                    return;
                }
            }
        }
        if (this.adabters.getItemCount() == 0) {
            this.adabters.notifyDataSetChanged();
        }
    }
    
    public void inselect(final int n) {
        this.adabters.inselectItem(n);
    }
    
    public VideoItem isContains(final String anObject) {
        final List gallerySelecteds = this.gallerySelecteds;
        if (gallerySelecteds == null) {
            return null;
        }
        for (final GallerySelected gallerySelected : gallerySelecteds) {
            if (gallerySelected.getVideoItem() != null && gallerySelected.getVideoItem().getPath().equals(anObject)) {
                return gallerySelected.getVideoItem();
            }
        }
        return null;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentGalleryVideoBinding inflate = FragmentGalleryVideoBinding.inflate(layoutInflater, viewGroup, false);
        this.galleryVideoBinding = inflate;
        final FrameLayout root = inflate.getRoot();
        this.loadVideos((View)root);
        return (View)root;
    }
    
    public void onDestroyView() {
        this.iPicker = null;
        final FragmentGalleryVideoBinding galleryVideoBinding = this.galleryVideoBinding;
        if (galleryVideoBinding != null) {
            galleryVideoBinding.getRoot().removeAllViews();
            this.galleryVideoBinding = null;
        }
        GalleryPhotosFragment.instance = null;
        super.onDestroyView();
    }
}
