// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.WordAyaAdabter$IWordAya;

class EditTextFragment$2 implements WordAyaAdabter$IWordAya
{
    final /* synthetic */ EditTextFragment this$0;
    
    EditTextFragment$2(final EditTextFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick() {
        final String str = " \u0646\u0635";
        if (EditTextFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            String txt = EditTextFragment.-$$Nest$mgetSelectedAya(this.this$0);
            final int number = EditTextFragment.-$$Nest$fgetquranEntity(this.this$0).getNumber();
            final int n = -1;
            int firstDigitIndex;
            if (number != n) {
                firstDigitIndex = EditTextFragment.findFirstDigitIndex(txt);
            }
            else {
                firstDigitIndex = n;
            }
            if (firstDigitIndex != n) {
                final String substring = txt.substring(0, firstDigitIndex);
                final String s = txt;
                try {
                    final String substring2 = s.substring(firstDigitIndex);
                    try {
                        int int1 = Integer.parseInt(substring2);
                        final int n2 = 286;
                        if (int1 > n2) {
                            int1 = n2;
                        }
                        final EditTextFragment this$0 = this.this$0;
                        try {
                            EditTextFragment.-$$Nest$fgetquranEntity(this$0).setNumber(int1);
                            final EditTextFragment this$2 = this.this$0;
                            try {
                                EditTextFragment.-$$Nest$fgetquranEntity(this$2).setIndexNumber(firstDigitIndex);
                                try {
                                    final StringBuilder sb = new StringBuilder();
                                    try {
                                        final StringBuilder append = sb.append(substring).append(str);
                                        try {
                                            txt = append.toString();
                                        }
                                        catch (final Exception ex) {
                                            txt = substring;
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
            EditTextFragment.-$$Nest$fgetquranEntity(this.this$0).setTxt(txt);
            EditTextFragment.-$$Nest$fgetquranEntity(this.this$0).initPreset(EditTextFragment.-$$Nest$fgetquranEntity(this.this$0).getmPreset());
            EditTextFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).onUpdate(EditTextFragment.-$$Nest$fgetquranEntity(this.this$0));
        }
    }
}
