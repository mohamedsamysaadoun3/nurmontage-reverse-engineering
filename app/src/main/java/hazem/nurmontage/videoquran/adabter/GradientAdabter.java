package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.model.Gradient;
import java.util.List;

/* loaded from: classes2.dex */
public class GradientAdabter extends RecyclerView.Adapter<ViewHolder> {
    private List<Gradient> colors;
    public IColor iColorCallback;
    private boolean isSubscribe;
    private final int max_free = 1;
    private int pos_select;

    public interface IColor {
        void onGradient(Gradient gradient, int value);
    }

    public GradientAdabter(IColor iColor, List<Gradient> list, boolean isFlag, int colorValue) {
        this.colors = list;
        this.iColorCallback = iColor;
        this.isSubscribe = isFlag;
        this.pos_select = colorValue;
    }

    public Gradient getSelect() {
        int index = this.pos_select;
        if (index >= 0) {
            return this.colors.get(index);
        }
        return null;
    }

    public void setGradientBackground(View view, View view2, Gradient gradient, boolean isFlag) {
        if (isFlag) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setStroke(3, -1);
            view2.setBackground(gradientDrawable);
        } else {
            view2.setBackground(null);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(100.0f);
        gradientDrawable2.setColors(new int[]{gradient.getColor(), gradient.getSecond(), gradient.getThree()});
        view.setBackground(gradientDrawable2);
    }

    public void setGradientBackground(View view, int colorValue) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(colorValue);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(100.0f);
        view.setBackground(gradientDrawable);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageLayer;
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(C2014R.id.image);
            ImageView imageView = (ImageView) view.findViewById(C2014R.id.layer);
            this.imageLayer = imageView;
            GradientAdabter.this.setGradientBackground(imageView, -1895825408);
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.GradientAdabter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (GradientAdabter.this.iColorCallback != null) {
                        if ((GradientAdabter.this.isSubscribe || ViewHolder.this.getAdapterPosition() <= 1) && GradientAdabter.this.pos_select != ViewHolder.this.getAdapterPosition()) {
                            int index = GradientAdabter.this.pos_select;
                            GradientAdabter.this.pos_select = ViewHolder.this.getAdapterPosition();
                            GradientAdabter.this.notifyItemChanged(index);
                            GradientAdabter.this.notifyItemChanged(GradientAdabter.this.pos_select);
                            GradientAdabter.this.iColorCallback.onGradient((Gradient) GradientAdabter.this.colors.get(ViewHolder.this.getAdapterPosition()), ViewHolder.this.getAdapterPosition());
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int colorValue) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_color, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int index) {
        setGradientBackground(viewHolder.imageView, viewHolder.itemView, this.colors.get(index), index == this.pos_select);
        if (!this.isSubscribe && index > 1) {
            viewHolder.imageLayer.setVisibility(0);
        } else {
            viewHolder.imageLayer.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Gradient> list = this.colors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPos_select() {
        return this.pos_select;
    }
}
