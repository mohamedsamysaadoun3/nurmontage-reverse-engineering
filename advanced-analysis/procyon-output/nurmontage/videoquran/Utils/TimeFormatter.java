// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.util.Pair;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimeFormatter
{
    private long totalDurationMs;
    
    public TimeFormatter(final long totalDurationMs) {
        this.totalDurationMs = totalDurationMs;
    }
    
    private String formatMsToTime(long seconds) {
        final long n = 0L;
        if (seconds < n) {
            seconds = n;
        }
        final long minutes = TimeUnit.MILLISECONDS.toMinutes(seconds);
        seconds = TimeUnit.MILLISECONDS.toSeconds(seconds);
        seconds -= TimeUnit.MINUTES.toSeconds(minutes);
        return String.format(Locale.ENGLISH, "%d:%02d", minutes, seconds);
    }
    
    public static String timeToString(long n) {
        final StringBuilder append = new StringBuilder().append(TimeUnit.MILLISECONDS.toHours(n));
        final String s = ":";
        final StringBuilder append2 = append.append(s).append(TimeUnit.MILLISECONDS.toMinutes(n) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(n))).append(s).append(TimeUnit.MILLISECONDS.toSeconds(n) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(n))).append(".");
        final long millis = TimeUnit.MILLISECONDS.toMillis(n);
        final TimeUnit seconds = TimeUnit.SECONDS;
        n = TimeUnit.MILLISECONDS.toSeconds(n);
        n = seconds.toMillis(n);
        return append2.append(millis - n).toString();
    }
    
    public Pair formatTime(final long n) {
        return new Pair((Object)this.formatMsToTime(n), (Object)this.formatMsToTime(this.totalDurationMs - n));
    }
    
    public void setTotalDurationMs(final long totalDurationMs) {
        this.totalDurationMs = totalDurationMs;
    }
}
