/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter;
import hazem.nurmontage.videoquran.adabter.ReverbeAdabter$ViewHolder;
import hazem.nurmontage.videoquran.fragment.audio_effect.Reverbe;

class ReverbeAdabter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ ReverbeAdabter$ViewHolder this$1;
    final /* synthetic */ ReverbeAdabter val$this$0;

    ReverbeAdabter$ViewHolder$1(ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder, ReverbeAdabter reverbeAdabter) {
        this.this$1 = reverbeAdabter$ViewHolder;
        this.val$this$0 = reverbeAdabter;
    }

    public void onClick(View object) {
        object = ReverbeAdabter.cfr_renamed_325(this.this$1.this$0);
        if (object != null) {
            ReverbeAdabter.cfr_renamed_325(this.this$1.this$0).pause();
            object = this.this$1.this$0;
            int n = ReverbeAdabter.cfr_renamed_304((ReverbeAdabter)((Object)object));
            Object object2 = this.this$1;
            int n2 = object2.getAdapterPosition();
            if (n == n2) {
                n = ReverbeAdabter.cfr_renamed_304(this.this$1.this$0);
                ReverbeAdabter.cfr_renamed_305(this.this$1.this$0, -1);
                this.this$1.this$0.notifyItemChanged(n);
                object = this.this$1.this$0;
                n2 = this.this$1.getAdapterPosition();
                object.notifyItemChanged(n2);
                return;
            }
            n = ReverbeAdabter.cfr_renamed_304(this.this$1.this$0);
            object2 = this.this$1.this$0;
            int n3 = this.this$1.getAdapterPosition();
            ReverbeAdabter.cfr_renamed_305((ReverbeAdabter)((Object)object2), n3);
            this.this$1.this$0.notifyItemChanged(n);
            object = this.this$1.this$0;
            n2 = ReverbeAdabter.cfr_renamed_304(this.this$1.this$0);
            object.notifyItemChanged(n2);
            object = ReverbeAdabter.cfr_renamed_307(this.this$1.this$0);
            n2 = this.this$1.getAdapterPosition();
            object = (Reverbe)object.get(n2);
            object2 = ReverbeAdabter.cfr_renamed_325(this.this$1.this$0);
            object = ((Reverbe)object).getCmd_ffmpeg();
            ReverbeAdabter$ViewHolder reverbeAdabter$ViewHolder = this.this$1;
            n3 = reverbeAdabter$ViewHolder.getAdapterPosition();
            object2.cmd((String)object, n3);
        }
    }
}

