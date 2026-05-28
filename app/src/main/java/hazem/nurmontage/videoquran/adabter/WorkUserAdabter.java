package hazem.nurmontage.videoquran.adabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.model.Template;
import java.util.List;

/* loaded from: classes2.dex */
public class WorkUserAdabter extends RecyclerView.Adapter<ViewHolder> {
    private final String APP_VERSION;

    /* renamed from: h */
    private int f389h;
    public IWorkUserCallback iWorkUserCallback;
    private List<Template> images;

    /* renamed from: w */
    private int f390w;

    public interface IWorkUserCallback {
        void onClick(Template template);

        void toMenu(Template template, View view, int value);
    }

    public WorkUserAdabter(String textValue, List<Template> list, IWorkUserCallback iWorkUserCallback, int index, int index0) {
        this.images = list;
        this.iWorkUserCallback = iWorkUserCallback;
        this.f390w = index;
        this.f389h = index0;
        this.APP_VERSION = textValue;
    }

    public void remove(int count) {
        try {
            if (count < this.images.size()) {
                this.images.remove(count);
            }
            notifyItemRemoved(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(int count, Template template) {
        try {
            if (count < this.images.size()) {
                this.images.add(count, template);
            } else {
                this.images.add(template);
            }
            notifyItemInserted(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageButton btn_menu;
        public ImageView imageView;
        public ImageView iv_ratio;
        private TextView tvDate;
        private TextView tvName;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(C2014R.id.imageView);
            this.btn_menu = (ImageButton) view.findViewById(C2014R.id.btn_menu);
            this.iv_ratio = (ImageView) view.findViewById(C2014R.id.iv_ratio);
            this.tvName = (TextView) view.findViewById(C2014R.id.tv_name);
            this.tvDate = (TextView) view.findViewById(C2014R.id.tv_date);
            this.btn_menu.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.WorkUserAdabter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (WorkUserAdabter.this.iWorkUserCallback != null) {
                        WorkUserAdabter.this.iWorkUserCallback.toMenu((Template) WorkUserAdabter.this.images.get(ViewHolder.this.getAdapterPosition()), view2, ViewHolder.this.getAdapterPosition());
                    }
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.WorkUserAdabter.ViewHolder.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (WorkUserAdabter.this.iWorkUserCallback != null) {
                        WorkUserAdabter.this.iWorkUserCallback.onClick((Template) WorkUserAdabter.this.images.get(ViewHolder.this.getAdapterPosition()));
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int index) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_work_user, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int index) {
        Template template = this.images.get(index);
        if (template.getFileInfo() != null) {
            viewHolder.tvName.setText(template.getFileInfo().formattedDate);
            viewHolder.tvDate.setText(template.getFileInfo().timedDate);
        }
        Glide.with(viewHolder.imageView).asBitmap().load(template.getUri_video()).frame(1000000L).centerInside().override(this.f390w, this.f389h).diskCacheStrategy(DiskCacheStrategy.NONE).signature(new ObjectKey(this.APP_VERSION)).placeholder(C2014R.drawable.broken_image_24px).into(viewHolder.imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.images.size();
    }
}
