// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class TextEditActivity$3 implements View$OnClickListener
{
    final /* synthetic */ TextEditActivity this$0;
    
    TextEditActivity$3(final TextEditActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final String str = " \u0646\u0635";
        final Intent intent = new Intent();
        final String -$$Nest$mgetSelectedAya = TextEditActivity.-$$Nest$mgetSelectedAya(this.this$0);
        final int firstDigitIndex = TextEditActivity.findFirstDigitIndex(-$$Nest$mgetSelectedAya);
        intent.putExtra("start_index", TextEditActivity.-$$Nest$fgetstartIndex(this.this$0));
        intent.putExtra("end_index", TextEditActivity.-$$Nest$fgetendIndex(this.this$0));
        final String s = "aya";
        final int n = -1;
        if (firstDigitIndex == n) {
            intent.putExtra(s, -$$Nest$mgetSelectedAya);
        }
        else {
            final String substring = -$$Nest$mgetSelectedAya.substring(0, firstDigitIndex);
            final String s2 = -$$Nest$mgetSelectedAya;
            try {
                final String substring2 = s2.substring(firstDigitIndex);
                try {
                    int int1 = Integer.parseInt(substring2);
                    final int n2 = 286;
                    if (int1 > n2) {
                        int1 = n2;
                    }
                    intent.putExtra("number", int1);
                    intent.putExtra("index", firstDigitIndex);
                    try {
                        final StringBuilder sb = new StringBuilder();
                        try {
                            final StringBuilder append = sb.append(substring).append(str);
                            try {
                                intent.putExtra(s, append.toString());
                            }
                            catch (final Exception ex) {
                                intent.putExtra(s, substring);
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
        this.this$0.setResult(n, intent);
        this.this$0.finish();
    }
}
