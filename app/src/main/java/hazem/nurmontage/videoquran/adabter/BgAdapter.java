package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.adabter.BgAdapter;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment;
import hazem.nurmontage.videoquran.model.BgItem;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/* loaded from: classes2.dex */
public class BgAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final String APP_VERSION;
    private final ChangeBgFragment.IChangeBgCallback iBgCallback;
    private final List<BgItem> images;
    private int selected;
    private final int size;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int resourceId, List list) {
        onBindViewHolder2(viewHolder, resourceId, (List<Object>) list);
    }

    public BgAdapter(String textValue, ChangeBgFragment.IChangeBgCallback iChangeBgCallback, List<BgItem> list, int size1, int size1) {
        this.APP_VERSION = textValue;
        this.iBgCallback = iChangeBgCallback;
        this.images = list;
        this.size = size1;
        this.selected = size1;
        setHasStableIds(true);
    }

    public void add(BgItem bgItem) {
        int size = this.images.size();
        this.images.add(bgItem);
        notifyItemInserted(size);
    }

    public int getSelectedPosition() {
        return this.selected;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(C2014R.id.img);
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.BgAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BgAdapter.ViewHolder.this.m631x1a2a22a0(view2);
                }
            });
        }

        /* renamed from: lambda$new$0$hazem-nurmontage-videoquran-adabter-BgAdapter$ViewHolder */
        /* synthetic */ void m631x1a2a22a0(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            if (adapterPosition == BgAdapter.this.selected) {
                if (BgAdapter.this.iBgCallback != null) {
                    BgAdapter.this.iBgCallback.onAdd((BgItem) BgAdapter.this.images.get(adapterPosition));
                    return;
                }
                return;
            }
            int index = BgAdapter.this.selected;
            BgAdapter.this.selected = adapterPosition;
            if (index != -1) {
                BgAdapter.this.notifyItemChanged(index, "alpha");
            }
            BgAdapter bgAdapter = BgAdapter.this;
            bgAdapter.notifyItemChanged(bgAdapter.selected, "alpha");
            if (BgAdapter.this.iBgCallback != null) {
                BgAdapter.this.iBgCallback.onAdd((BgItem) BgAdapter.this.images.get(adapterPosition));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int index) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_img_bg, viewGroup, false));
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int index, List<Object> list) {
        if (!list.isEmpty()) {
            applyState(viewHolder, index);
            return;
        }
        RequestBuilder<Drawable> load = Glide.with(viewHolder.imageView).load(Integer.valueOf(this.images.get(index).getId()));
        int index13 = this.size;
        load.override(index13, index13).signature(new ObjectKey(this.APP_VERSION)).diskCacheStrategy(DiskCacheStrategy.NONE).transform(new MultiTransformation(new CenterCrop(), new RoundedCornersTransformation(10, 8))).into(viewHolder.imageView);
        applyState(viewHolder, index);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int resourceId) {
        applyState(viewHolder, resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BgItem> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int index) {
        return this.images.get(value).getId();
    }

    private void applyState(ViewHolder viewHolder, int colorValue) {
        boolean isSelected = colorValue == this.selected;
        float f = isSelected ? 1.0f : 0.65f;
        if (isSelected) {
            viewHolder.itemView.setBackgroundResource(C2014R.drawable.ipad_selected);
        } else {
            viewHolder.itemView.setBackgroundColor(0);
        }
        viewHolder.imageView.setAlpha(f);
    }
}
