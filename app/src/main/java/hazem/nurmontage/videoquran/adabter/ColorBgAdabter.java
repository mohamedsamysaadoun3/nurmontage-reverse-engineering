package hazem.nurmontage.videoquran.adabter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;

/* loaded from: classes2.dex */
public class ColorBgAdabter extends RecyclerView.Adapter<ViewHolder> {
    private int[] colors;
    private boolean enabled = true;
    public IColor iColorCallback;
    private int pos_select;

    public interface IColor {
        void onColor(int color, int color2);
    }

    public ColorBgAdabter(IColor iColor, int[] iArr, int color) {
        this.colors = iArr;
        this.iColorCallback = iColor;
        this.pos_select = color;
    }

    public void setEnabled(boolean isEnabled) {
        this.enabled = isEnabled;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(C2014R.id.image);
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.ColorBgAdabter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ColorBgAdabter.this.iColorCallback == null || ColorBgAdabter.this.pos_select == ViewHolder.this.getAdapterPosition() || !ColorBgAdabter.this.enabled) {
                        return;
                    }
                    int color = ColorBgAdabter.this.pos_select;
                    ColorBgAdabter.this.pos_select = ViewHolder.this.getAdapterPosition();
                    ColorBgAdabter.this.notifyItemChanged(color);
                    ColorBgAdabter.this.notifyItemChanged(ColorBgAdabter.this.pos_select);
                    ColorBgAdabter.this.iColorCallback.onColor(ColorBgAdabter.this.colors[ViewHolder.this.getAdapterPosition()], ViewHolder.this.getAdapterPosition());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int color) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_color, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int color) {
        setGradientBackground(viewHolder.imageView, viewHolder.itemView, this.colors[color], color == this.pos_select);
    }

    public void setGradientBackground(View view, View view2, int color, boolean isEnabled) {
        if (isEnabled) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(10.0f);
            gradientDrawable.setStroke(3, -1);
            view2.setBackground(gradientDrawable);
        } else {
            view2.setBackground(null);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(10.0f);
        gradientDrawable2.setColor(color);
        view.setBackground(gradientDrawable2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int[] iArr = this.colors;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public int getPos_select() {
        return this.pos_select;
    }
}
