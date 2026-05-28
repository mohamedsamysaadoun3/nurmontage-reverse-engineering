/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package hazem.nurmontage.videoquran.Utils;

import android.util.Pair;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimeFormatter {
    private long totalDurationMs;

    public TimeFormatter(long l) {
        this.totalDurationMs = l;
    }

    private String formatMsToTime(long l) {
        long l2 = 0L;
        long l3 = l - l2;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 < 0) {
            l = l2;
        }
        l2 = TimeUnit.MILLISECONDS.toMinutes(l);
        l = TimeUnit.MILLISECONDS.toSeconds(l);
        long l5 = TimeUnit.MINUTES.toSeconds(l2);
        Locale locale = Locale.ENGLISH;
        Long l6 = l2;
        Object[] objectArray = Long.valueOf(l -= l5);
        objectArray = new Object[]{l6, objectArray};
        return String.format(locale, "%d:%02d", objectArray);
    }

    public static String timeToString(long l) {
        StringBuilder stringBuilder = new StringBuilder();
        long l2 = TimeUnit.MILLISECONDS.toHours(l);
        stringBuilder = stringBuilder.append(l2);
        String string2 = ":";
        stringBuilder = stringBuilder.append(string2);
        long l3 = TimeUnit.MILLISECONDS.toMinutes(l);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l4 = TimeUnit.MILLISECONDS.toHours(l);
        long l5 = timeUnit.toMinutes(l4);
        stringBuilder = stringBuilder.append(l3 -= l5).append(string2);
        l2 = TimeUnit.MILLISECONDS.toSeconds(l);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        l5 = TimeUnit.MILLISECONDS.toMinutes(l);
        long l6 = timeUnit2.toSeconds(l5);
        stringBuilder = stringBuilder.append(l2 -= l6).append(".");
        l2 = TimeUnit.MILLISECONDS.toMillis(l);
        timeUnit2 = TimeUnit.SECONDS;
        l = TimeUnit.MILLISECONDS.toSeconds(l);
        l = timeUnit2.toMillis(l);
        return stringBuilder.append(l2 -= l).toString();
    }

    public Pair formatTime(long l) {
        long l2 = this.totalDurationMs - l;
        String string2 = this.formatMsToTime(l);
        String string3 = this.formatMsToTime(l2);
        Pair pair = new Pair((Object)string2, (Object)string3);
        return pair;
    }

    public void setTotalDurationMs(long l) {
        this.totalDurationMs = l;
    }
}

