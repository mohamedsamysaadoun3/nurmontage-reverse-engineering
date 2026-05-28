// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.R$drawable;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import hazem.nurmontage.videoquran.model.IpadItem;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.util.List;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment$IIpadEditCallback;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class IpadAdabter extends RecyclerView$Adapter
{
    public EditIpadFragment$IIpadEditCallback ipadEditCallback;
    private List ipadItems;
    private int ipad_selected;
    private boolean isGlass;
    private boolean isSubscribe;
    private int pos_select;
    
    public IpadAdabter(final boolean isSubscribe, final int pos_select, final int ipad_selected, final EditIpadFragment$IIpadEditCallback ipadEditCallback, final List ipadItems, final boolean isGlass) {
        this.ipadItems = ipadItems;
        this.pos_select = pos_select;
        this.ipadEditCallback = ipadEditCallback;
        this.ipad_selected = ipad_selected;
        this.isGlass = isGlass;
        this.isSubscribe = isSubscribe;
    }
    
    private boolean isManyOption(final int n) {
        int n2 = 1;
        if (n != 0 && n != n2 && n != 7 && n != 8) {
            if (n != 9) {
                n2 = 0;
            }
        }
        return n2 != 0;
    }
    
    private void updateDote(final View view, final View view2) {
        final boolean isGlass = this.isGlass;
        final float n = 0.5f;
        final float n2 = 1.0f;
        if (isGlass) {
            view.setAlpha(n2);
            view2.setAlpha(n);
        }
        else {
            view2.setAlpha(n2);
            view.setAlpha(n);
        }
    }
    
    public int getItemCount() {
        final List ipadItems = this.ipadItems;
        if (ipadItems == null) {
            return 0;
        }
        return ipadItems.size();
    }
    
    public int getPos_select() {
        return this.pos_select;
    }
    
    public void onBindViewHolder(final IpadAdabter$ViewHolder ipadAdabter$ViewHolder, final int pos_select) {
        final IpadItem ipadItem = this.ipadItems.get(pos_select);
        ((RequestBuilder)Glide.with((View)ipadAdabter$ViewHolder.imageView).asBitmap().load(Integer.valueOf(ipadItem.getImg())).diskCacheStrategy(DiskCacheStrategy.NONE)).into(ipadAdabter$ViewHolder.imageView);
        final boolean manyOption = this.isManyOption(pos_select);
        final int n = 8;
        if (manyOption) {
            ipadAdabter$ViewHolder.lyt_option.setVisibility(0);
            this.updateDote(ipadAdabter$ViewHolder.vDot1, ipadAdabter$ViewHolder.vDot2);
        }
        else {
            ipadAdabter$ViewHolder.lyt_option.setVisibility(n);
        }
        if (ipadItem.getIpadType().ordinal() == this.ipad_selected) {
            ipadAdabter$ViewHolder.itemView.setAlpha(1.0f);
            ipadAdabter$ViewHolder.imageView.setBackgroundResource(R$drawable.ipad_selected);
            this.pos_select = pos_select;
        }
        else {
            ipadAdabter$ViewHolder.itemView.setAlpha(0.4f);
            ipadAdabter$ViewHolder.imageView.setBackgroundResource(R$drawable.watch_btn_outline);
        }
        if (!this.isSubscribe) {
            if (pos_select > 1) {
                ipadAdabter$ViewHolder.iv_pro.setVisibility(0);
            }
            else {
                ipadAdabter$ViewHolder.iv_pro.setVisibility(n);
            }
        }
    }
    
    public IpadAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new IpadAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_ipad, viewGroup, false));
    }
}
