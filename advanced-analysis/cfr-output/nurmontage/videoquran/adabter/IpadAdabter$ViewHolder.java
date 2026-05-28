/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.IpadAdabter;

public class IpadAdabter$ViewHolder
extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public ImageView iv_pro;
    public LinearLayout lyt_option;
    final /* synthetic */ IpadAdabter this$0;
    public View vDot1;
    public View vDot2;

    public IpadAdabter$ViewHolder(IpadAdabter ipadAdabter, View view) {
        Object object;
        this.this$0 = ipadAdabter;
        super(view);
        int n = R$id.iv_pro;
        this.iv_pro = object = (ImageView)view.findViewById(n);
        n = R$id.view_option;
        object = (LinearLayout)view.findViewById(n);
        this.lyt_option = object;
        n = R$id.img;
        this.imageView = object = (ImageView)view.findViewById(n);
        n = R$id.dot1;
        object = view.findViewById(n);
        this.vDot1 = object;
        n = R$id.dot2;
        object = view.findViewById(n);
        this.vDot2 = object;
        super(this, ipadAdabter);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

