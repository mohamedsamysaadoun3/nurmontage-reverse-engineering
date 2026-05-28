/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$77$1;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;
import hazem.nurmontage.videoquran.model.BgItem;
import hazem.nurmontage.videoquran.model.Template;

class EngineActivity$77
implements ChangeBgFragment$IChangeBgCallback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$77(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onAdd(BgItem object) {
        CharSequence charSequence;
        Object object2 = ((BgItem)object).getName_drawable();
        boolean bl = object2.equals(charSequence = EngineActivity.cfr_renamed_2(this.this$0).getName_drawable());
        if (bl) {
            return;
        }
        object2 = ChangeBgFragment.instance;
        if (object2 != null) {
            object2 = ChangeBgFragment.instance;
            ((ChangeBgFragment)((Object)object2)).scrollToSelected();
        }
        object2 = EngineActivity.cfr_renamed_2(this.this$0);
        charSequence = ((BgItem)object).getName_drawable();
        ((Template)object2).setName_drawable((String)charSequence);
        object2 = this.this$0;
        charSequence = new StringBuilder("android.resource://");
        String string2 = this.this$0.getPackageName();
        charSequence = ((StringBuilder)charSequence).append(string2).append("/drawable/");
        int n = ((BgItem)object).getId();
        object = ((StringBuilder)charSequence).append(n).toString();
        EngineActivity.cfr_renamed_412((EngineActivity)((Object)object2), (String)object);
        EngineActivity.cfr_renamed_72(this.this$0);
        object = EngineActivity.cfr_renamed_413(this.this$0);
        object2 = new EngineActivity$77$1(this);
        object.execute((Runnable)object2);
    }

    public void onCancel() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void onCrop() {
        EngineActivity.cfr_renamed_414(this.this$0);
    }

    public void onDone() {
        EngineActivity.cfr_renamed_75(this.this$0);
    }

    public void onSubscribe() {
        this.this$0.dialogPremium(0);
    }

    public void onUploadImg() {
        this.this$0.pickImageFromGallery();
    }

    public void onUploadVideo() {
        this.this$0.pickVideoFromGallery();
    }
}

