// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

class AddQuranFragment$3$1 implements Runnable
{
    final /* synthetic */ AddQuranFragment$3 this$1;
    final /* synthetic */ int val$from;
    final /* synthetic */ int val$surah;
    final /* synthetic */ int val$to;
    
    AddQuranFragment$3$1(final AddQuranFragment$3 this$1, final int val$from, final int val$to, final int val$surah) {
        this.this$1 = this$1;
        this.val$from = val$from;
        this.val$to = val$to;
        this.val$surah = val$surah;
    }
    
    public void run() {
        AddQuranFragment.-$$Nest$fgetiAddQuran(this.this$1.this$0).progress();
        if (AddQuranFragment.-$$Nest$fgetincludeBismilah(this.this$1.this$0) != null && AddQuranFragment.-$$Nest$fgetincludeBismilah(this.this$1.this$0).isChecked()) {
            AddQuranFragment.-$$Nest$fgetiAddQuran(this.this$1.this$0).onBismilah();
        }
        this.this$1.this$0.addAyaEntityRecursive(this.val$from, this.val$to, this.val$surah);
    }
}
