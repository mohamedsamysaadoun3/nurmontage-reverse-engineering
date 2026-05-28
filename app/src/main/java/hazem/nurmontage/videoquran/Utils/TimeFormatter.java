package hazem.nurmontage.videoquran.Utils;

import android.util.Pair;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class TimeFormatter {
    private long totalDurationMs;

    public static String timeToString(long durationMs) {
        return TimeUnit.MILLISECONDS.toHours(durationMs) + ":" + (TimeUnit.MILLISECONDS.toMinutes(durationMs) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(durationMs))) + ":" + (TimeUnit.MILLISECONDS.toSeconds(durationMs) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(durationMs))) + "." + (TimeUnit.MILLISECONDS.toMillis(durationMs) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(durationMs)));
    }

    public TimeFormatter(long j) {
        this.totalDurationMs = j;
    }

    public void setTotalDurationMs(long j) {
        this.totalDurationMs = j;
    }

    public Pair<String, String> formatTime(long j) {
        return new Pair<>(formatMsToTime(durationMs), formatMsToTime(this.totalDurationMs - durationMs));
    }

    private String formatMsToTime(long durationMs) {
        if (durationMs < 0) {
            durationMs = 0;
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(durationMs);
        return String.format(Locale.ENGLISH, "%d:%02d", Long.valueOf(minutes), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes)));
    }
}
