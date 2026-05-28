/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.Utils.MFileUtils$FileInfo;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$IWorkUserCallback;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$ViewHolder;
import hazem.nurmontage.videoquran.model.Template;
import java.util.List;

public class WorkUserAdabter
extends RecyclerView.Adapter {
    private final String APP_VERSION;
    private int h;
    public WorkUserAdabter$IWorkUserCallback iWorkUserCallback;
    private List images;
    private int w;

    static /* bridge */ /* synthetic */ List cfr_renamed_316(WorkUserAdabter workUserAdabter) {
        return workUserAdabter.images;
    }

    public WorkUserAdabter(String string2, List list, WorkUserAdabter$IWorkUserCallback workUserAdabter$IWorkUserCallback, int n, int n2) {
        this.images = list;
        this.iWorkUserCallback = workUserAdabter$IWorkUserCallback;
        this.w = n;
        this.h = n2;
        this.APP_VERSION = string2;
    }

    /*
     * Unable to fully structure code
     */
    public void add(int var1_1, Template var2_2) {
        block7: {
            var3_3 = this.images;
            var4_4 = var3_3.size();
            if (var1_1 >= var4_4) ** GOTO lbl11
            var3_3 = this.images;
            var3_3.add(var1_1, var2_2);
            break block7;
lbl11:
            // 1 sources

            var3_3 = this.images;
            var3_3.add(var2_2);
        }
        try {
            this.notifyItemInserted(var1_1);
        }
        catch (Exception var5_5) {
            var5_5.printStackTrace();
        }
    }

    public int getItemCount() {
        return this.images.size();
    }

    public void onBindViewHolder(WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder, int n) {
        String string2;
        Object object = (Template)this.images.get(n);
        MFileUtils$FileInfo mFileUtils$FileInfo = ((Template)object).getFileInfo();
        if (mFileUtils$FileInfo != null) {
            mFileUtils$FileInfo = WorkUserAdabter$ViewHolder.cfr_renamed_346(workUserAdabter$ViewHolder);
            string2 = ((Template)object).getFileInfo().formattedDate;
            mFileUtils$FileInfo.setText(string2);
            mFileUtils$FileInfo = WorkUserAdabter$ViewHolder.cfr_renamed_345(workUserAdabter$ViewHolder);
            string2 = ((Template)object).getFileInfo().timedDate;
            mFileUtils$FileInfo.setText(string2);
        }
        mFileUtils$FileInfo = Glide.with((View)workUserAdabter$ViewHolder.imageView).asBitmap();
        object = ((Template)object).getUri_video();
        object = (RequestBuilder)((RequestBuilder)mFileUtils$FileInfo.load((String)object).frame(1000000L)).centerInside();
        int n2 = this.w;
        int n3 = this.h;
        object = (RequestBuilder)object.override(n2, n3);
        mFileUtils$FileInfo = DiskCacheStrategy.NONE;
        object = (RequestBuilder)object.diskCacheStrategy((DiskCacheStrategy)mFileUtils$FileInfo);
        string2 = this.APP_VERSION;
        mFileUtils$FileInfo = new ObjectKey((Object)string2);
        object = (RequestBuilder)object.signature((Key)mFileUtils$FileInfo);
        n2 = R$drawable.broken_image_24px;
        object = (RequestBuilder)object.placeholder(n2);
        workUserAdabter$ViewHolder = workUserAdabter$ViewHolder.imageView;
        object.into((ImageView)workUserAdabter$ViewHolder);
    }

    public WorkUserAdabter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_work_user;
        viewGroup = object.inflate(n2, viewGroup, false);
        object = new WorkUserAdabter$ViewHolder(this, (View)viewGroup);
        return object;
    }

    public void remove(int n) {
        block6: {
            List list = this.images;
            int n2 = list.size();
            if (n >= n2) break block6;
            list = this.images;
            list.remove(n);
        }
        try {
            this.notifyItemRemoved(n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

