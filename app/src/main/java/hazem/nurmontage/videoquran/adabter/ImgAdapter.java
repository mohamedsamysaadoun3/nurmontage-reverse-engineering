package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.C2014R;
import java.util.List;

/* loaded from: classes2.dex */
public class ImgAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final String APP_VERSION;
    private final List<Integer> images;
    private final int size;

    public ImgAdapter(String textValue, List<Integer> list, int value) {
        this.APP_VERSION = textValue;
        this.images = list;
        this.size = value;
        setHasStableIds(true);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(C2014R.id.img);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int value) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_img_bg, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int value) {
        RequestBuilder<Drawable> load = Glide.with(viewHolder.imageView).load(this.images.get(value));
        int i2 = this.size;
        load.override(i2, i2).signature(new ObjectKey(this.APP_VERSION)).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop().into(viewHolder.imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Integer> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int value) {
        return this.images.get(value).intValue();
    }
}
