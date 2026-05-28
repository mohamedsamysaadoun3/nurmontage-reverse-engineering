// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.ChangeBgFragment;
import hazem.nurmontage.videoquran.model.BgItem;
import hazem.nurmontage.videoquran.fragment.ChangeBgFragment$IChangeBgCallback;

class EngineActivity$77 implements ChangeBgFragment$IChangeBgCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$77(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdd(final BgItem bgItem) {
        if (bgItem.getName_drawable().equals(EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getName_drawable())) {
            return;
        }
        if (ChangeBgFragment.instance != null) {
            ChangeBgFragment.instance.scrollToSelected();
        }
        EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setName_drawable(bgItem.getName_drawable());
        EngineActivity.-$$Nest$fputuri_bg(this.this$0, "android.resource://" + this.this$0.getPackageName() + "/drawable/" + bgItem.getId());
        EngineActivity.-$$Nest$mshowProgressSimple(this.this$0);
        EngineActivity.-$$Nest$fgetexecutor(this.this$0).execute(new EngineActivity$77$1(this));
    }
    
    public void onCancel() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
    }
    
    public void onCrop() {
        EngineActivity.-$$Nest$mtoCrop(this.this$0);
    }
    
    public void onDone() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
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
