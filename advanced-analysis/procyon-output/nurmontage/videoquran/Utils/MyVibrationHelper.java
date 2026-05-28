// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.os.VibrationEffect;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.Vibrator;

public class MyVibrationHelper
{
    private Vibrator vibrator;
    
    public MyVibrationHelper(final Context context) {
        this.vibrator = (Vibrator)context.getSystemService("vibrator");
    }
    
    public void cancelVibration() {
        final Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
    
    public void vibrate() {
        this.vibrate(30);
    }
    
    public void vibrate(final long n) {
        if (this.vibrator != null) {
            if (Build$VERSION.SDK_INT >= 26) {
                this.vibrator.vibrate(VibrationEffect.createOneShot(n, -1));
            }
            else {
                this.vibrator.vibrate(n);
            }
        }
    }
}
