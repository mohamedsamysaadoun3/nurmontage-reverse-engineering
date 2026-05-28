package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.model.ExploreItem;
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class ExploreAdabters extends RecyclerView.Adapter<MyViewHolder> {
    private final List<ExploreItem> exploreItems;
    private String folder_select;
    private IExplore iExplore;
    private final int size;

    public interface IExplore {
        void done();

        void folder(File file, String textValue, String textValue2);
    }

    public ExploreAdabters(List<ExploreItem> list, int value, IExplore iExplore, String textValue) {
        this.exploreItems = list;
        this.size = value;
        this.iExplore = iExplore;
        this.folder_select = textValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int value) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_explore, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, int value) {
        RequestBuilder<Drawable> load = Glide.with(myViewHolder.itemView).load(this.exploreItems.get(value).getFirstFilePath());
        int i2 = this.size;
        load.override(i2, i2).centerCrop().placeholder(C2014R.drawable.image_24px).into(myViewHolder.imageView);
        myViewHolder.tv_name.setText(this.exploreItems.get(value).getName());
        myViewHolder.tv_size.setText(this.exploreItems.get(value).getSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ExploreItem> list = this.exploreItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private SquareImageViewSimple imageView;
        private TextCustumFont tv_name;
        private TextCustumFont tv_size;

        public MyViewHolder(View view) {
            super(view);
            this.imageView = (SquareImageViewSimple) view.findViewById(C2014R.id.img);
            this.tv_name = (TextCustumFont) view.findViewById(C2014R.id.tv_name);
            this.tv_size = (TextCustumFont) view.findViewById(C2014R.id.tv_size);
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.ExploreAdabters.MyViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ExploreAdabters.this.iExplore != null) {
                        ExploreItem exploreItem = (ExploreItem) ExploreAdabters.this.exploreItems.get(MyViewHolder.this.getAdapterPosition());
                        ExploreAdabters.this.iExplore.folder(exploreItem.getFolder(), exploreItem.getName(), exploreItem.getPath());
                    }
                }
            });
        }
    }
}
