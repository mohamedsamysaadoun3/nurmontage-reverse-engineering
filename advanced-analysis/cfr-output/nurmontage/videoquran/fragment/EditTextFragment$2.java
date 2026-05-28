/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$IWordAya;
import hazem.nurmontage.videoquran.fragment.EditTextFragment;
import hazem.nurmontage.videoquran.model.QuranEntity;

class EditTextFragment$2
implements WordAyaAdabter$IWordAya {
    final /* synthetic */ EditTextFragment this$0;

    EditTextFragment$2(EditTextFragment editTextFragment) {
        this.this$0 = editTextFragment;
    }

    public void onClick() {
        Object object = " \u0646\u0635";
        Object object2 = EditTextFragment.cfr_renamed_164(this.this$0);
        if (object2 != null) {
            int n;
            int n2;
            object2 = EditTextFragment.cfr_renamed_151(this.this$0);
            QuranEntity quranEntity = EditTextFragment.cfr_renamed_165(this.this$0);
            int n3 = quranEntity.getNumber();
            n3 = n3 != (n2 = -1) ? EditTextFragment.findFirstDigitIndex((String)object2) : n2;
            if (n3 != n2) {
                String string2;
                block14: {
                    n2 = 0;
                    string2 = ((String)object2).substring(0, n3);
                    object2 = ((String)object2).substring(n3);
                    n = Integer.parseInt((String)object2);
                    int n4 = 286;
                    if (n <= n4) break block14;
                    n = n4;
                }
                Object object3 = this.this$0;
                object3 = EditTextFragment.cfr_renamed_165((EditTextFragment)((Object)object3));
                ((QuranEntity)object3).setNumber(n);
                object2 = this.this$0;
                object2 = EditTextFragment.cfr_renamed_165((EditTextFragment)((Object)object2));
                ((QuranEntity)object2).setIndexNumber(n3);
                object2 = new StringBuilder();
                object2 = ((StringBuilder)object2).append(string2);
                object = ((StringBuilder)object2).append((String)object);
                try {
                    object2 = ((StringBuilder)object).toString();
                }
                catch (Exception exception) {
                    object2 = string2;
                }
            }
            EditTextFragment.cfr_renamed_165(this.this$0).setTxt((String)object2);
            object = EditTextFragment.cfr_renamed_165(this.this$0);
            n = EditTextFragment.cfr_renamed_165(this.this$0).getmPreset();
            ((QuranEntity)object).initPreset(n);
            object = EditTextFragment.cfr_renamed_164(this.this$0);
            object2 = EditTextFragment.cfr_renamed_165(this.this$0);
            object.onUpdate((QuranEntity)object2);
        }
    }
}

