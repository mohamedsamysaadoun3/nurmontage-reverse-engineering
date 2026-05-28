package hazem.nurmontage.videoquran.adabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.List;

/* loaded from: classes2.dex */
public class FeaturesAdabter extends RecyclerView.Adapter<ViewHolder> {
    private boolean isSubscibe;
    private List<ModelFeatures> list;

    public void setSubscribe(boolean isSubscribed) {
        this.isSubscibe = isSubscribed;
        notifyDataSetChanged();
    }

    public FeaturesAdabter(List<ModelFeatures> list) {
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextCustumFont text;

        public ViewHolder(View view) {
            super(view);
            this.text = (TextCustumFont) view.findViewById(C2014R.id.tv_feature);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int value) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_feature, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int value) {
        viewHolder.text.setText(this.list.get(value).getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ModelFeatures> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
