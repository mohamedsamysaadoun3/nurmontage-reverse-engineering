package hazem.nurmontage.videoquran.adabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import java.util.List;

/* loaded from: classes2.dex */
public class TransitionEntityAdabters extends RecyclerView.Adapter<ViewHolder> {
    private EntityQuranTimeline entityQuranTimeline;
    private EffectAyaFragment.ITransition iTransition;
    private boolean isSubscribe;
    private List<TransitionItem> list;
    private int max;
    private int select;
    private String type = "in";

    public TransitionEntityAdabters(boolean isFlag, EffectAyaFragment.ITransition iTransition, List<TransitionItem> list, int value, EntityQuranTimeline entityQuranTimeline) {
        this.iTransition = iTransition;
        this.select = value;
        this.list = list;
        this.max = list.size();
        this.isSubscribe = isFlag;
        this.entityQuranTimeline = entityQuranTimeline;
    }

    public int getSelect() {
        return this.select;
    }

    public void update(List<TransitionItem> list, String textValue, int value) {
        this.select = value;
        this.list = list;
        this.type = textValue;
        this.max = list.size();
        notifyDataSetChanged();
    }

    public boolean isHaveSelect() {
        return this.select != -1;
    }

    public void unselect() {
        int value = this.select;
        if (value == -1) {
            return;
        }
        this.select = -1;
        notifyItemChanged(value);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int value) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_anim, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int value) {
        if (!this.isSubscribe) {
            if (value > 10) {
                viewHolder.disableView.setVisibility(0);
            } else {
                viewHolder.disableView.setVisibility(8);
            }
        }
        viewHolder.animationItem.setRotation(this.list.get(value).getAngle());
        viewHolder.animationItem.setImageResource(this.list.get(value).getId_ressource());
        if (value == this.select) {
            viewHolder.animationItem.setBackgroundResource(C2014R.drawable.circle_item_menu_select);
        } else {
            viewHolder.animationItem.setBackgroundResource(C2014R.drawable.circle_effect);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.max;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView animationItem;
        public ImageView disableView;

        public ViewHolder(View view) {
            super(view);
            this.animationItem = (ImageView) view.findViewById(C2014R.id.anim_item);
            this.disableView = (ImageView) view.findViewById(C2014R.id.iv_disable);
            view.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TransitionEntityAdabters.this.iTransition != null) {
                        if (!TransitionEntityAdabters.this.isSubscribe && ViewHolder.this.getAdapterPosition() > 10) {
                            TransitionEntityAdabters.this.iTransition.toSubscribe();
                            return;
                        }
                        if (TransitionEntityAdabters.this.select == ViewHolder.this.getAdapterPosition()) {
                            return;
                        }
                        int value = TransitionEntityAdabters.this.select;
                        TransitionEntityAdabters.this.select = ViewHolder.this.getAdapterPosition();
                        TransitionEntityAdabters.this.notifyItemChanged(value);
                        TransitionEntityAdabters.this.notifyItemChanged(TransitionEntityAdabters.this.select);
                        if (TransitionEntityAdabters.this.type != null) {
                            if (TransitionEntityAdabters.this.type.equals("in")) {
                                TransitionEntityAdabters.this.iTransition.mo581in(((TransitionItem) TransitionEntityAdabters.this.list.get(ViewHolder.this.getAdapterPosition())).getType(), TransitionEntityAdabters.this.entityQuranTimeline);
                            } else if (TransitionEntityAdabters.this.type.equals("out")) {
                                TransitionEntityAdabters.this.iTransition.out(((TransitionItem) TransitionEntityAdabters.this.list.get(ViewHolder.this.getAdapterPosition())).getType(), TransitionEntityAdabters.this.entityQuranTimeline);
                            }
                        }
                    }
                }
            });
        }
    }

    public static class TransitionItem {
        private int angle;
        private int id_ressource;
        private String type;

        public TransitionItem(String textValue, int value, int value2) {
            this.type = textValue;
            this.id_ressource = value;
            this.angle = value2;
        }

        public int getAngle() {
            return this.angle;
        }

        public int getId_ressource() {
            return this.id_ressource;
        }

        public String getType() {
            return this.type;
        }
    }
}
