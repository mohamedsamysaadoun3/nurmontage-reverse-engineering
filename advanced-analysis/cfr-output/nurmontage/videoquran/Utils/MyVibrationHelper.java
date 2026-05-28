/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.VibrationEffect
 *  android.os.Vibrator
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class MyVibrationHelper {
    private Vibrator vibrator;

    public MyVibrationHelper(Context context) {
        context = (Vibrator)context.getSystemService("vibrator");
        this.vibrator = context;
    }

    public void cancelVibration() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public void vibrate() {
        this.vibrate(30);
    }

    public void vibrate(long l) {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            int n = Build.VERSION.SDK_INT;
            int n2 = 26;
            if (n >= n2) {
                n = -1;
                VibrationEffect vibrationEffect = VibrationEffect.createOneShot((long)l, (int)n);
                Vibrator vibrator2 = this.vibrator;
                vibrator2.vibrate(vibrationEffect);
            } else {
                vibrator = this.vibrator;
                vibrator.vibrate(l);
            }
        }
    }
}

