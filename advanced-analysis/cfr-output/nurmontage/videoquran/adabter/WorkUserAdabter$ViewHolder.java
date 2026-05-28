/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter;
import hazem.nurmontage.videoquran.adabter.WorkUserAdabter$ViewHolder$1;

public class WorkUserAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    private ImageButton btn_menu;
    public ImageView imageView;
    public ImageView iv_ratio;
    final /* synthetic */ WorkUserAdabter this$0;
    private TextView tvDate;
    private TextView tvName;

    static /* bridge */ /* synthetic */ TextView cfr_renamed_345(WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder) {
        return workUserAdabter$ViewHolder.tvDate;
    }

    static /* bridge */ /* synthetic */ TextView cfr_renamed_346(WorkUserAdabter$ViewHolder workUserAdabter$ViewHolder) {
        return workUserAdabter$ViewHolder.tvName;
    }

    public WorkUserAdabter$ViewHolder(WorkUserAdabter workUserAdabter, View view) {
        Object object;
        this.this$0 = workUserAdabter;
        super(view);
        int n = R$id.imageView;
        this.imageView = object = (ImageView)view.findViewById(n);
        n = R$id.btn_menu;
        object = (ImageButton)view.findViewById(n);
        this.btn_menu = object;
        n = R$id.iv_ratio;
        this.iv_ratio = object = (ImageView)view.findViewById(n);
        n = R$id.tv_name;
        object = (TextView)view.findViewById(n);
        this.tvName = object;
        n = R$id.tv_date;
        object = (TextView)view.findViewById(n);
        this.tvDate = object;
        object = this.btn_menu;
        WorkUserAdabter$ViewHolder$1 workUserAdabter$ViewHolder$1 = new WorkUserAdabter$ViewHolder$1(this, workUserAdabter);
        object.setOnClickListener((View.OnClickListener)workUserAdabter$ViewHolder$1);
        super(this, workUserAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

