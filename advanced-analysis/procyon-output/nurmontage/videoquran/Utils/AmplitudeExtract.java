// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.media.MediaFormat;
import java.nio.ShortBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.util.Log;
import java.io.IOException;
import android.media.MediaExtractor;
import java.util.ArrayList;
import java.util.List;
import android.os.Looper;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public class AmplitudeExtract
{
    private static final String TAG = "AudioAmplitudeReader";
    private final ExecutorService executorService;
    private final Handler mainHandler;
    
    public AmplitudeExtract() {
        this.executorService = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }
    
    private List extractAmplitudeData(String string, final int n) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Target samples must be greater than zero.");
        }
        final ArrayList list = new ArrayList();
        Object o = null;
        try {
            final MediaExtractor mediaExtractor2;
            final MediaExtractor mediaExtractor = mediaExtractor2 = new MediaExtractor();
            try {
                mediaExtractor2.setDataSource(string);
                int i = 0;
                int n2 = 0;
                int n3;
                while (true) {
                    final int trackCount = mediaExtractor.getTrackCount();
                    n3 = -1;
                    if (n2 >= trackCount) {
                        n2 = n3;
                        break;
                    }
                    o = mediaExtractor.getTrackFormat(n2);
                    final String string2 = ((MediaFormat)o).getString("mime");
                    if (string2 != null && string2.startsWith("audio/")) {
                        break;
                    }
                    ++n2;
                }
                if (n2 == n3 || o == null) {
                    final StringBuilder sb = new StringBuilder();
                    o = "No audio track found in ";
                    string = sb.append((String)o).append(string).toString();
                    throw new IOException(string);
                }
                mediaExtractor.selectTrack(n2);
                string = "durationUs";
                if (((MediaFormat)o).getLong(string) <= 0L) {
                    string = "AudioAmplitudeReader";
                    o = "Duration not available or invalid, results might be inaccurate for downsampling.";
                    Log.w(string, (String)o);
                }
                final ByteBuffer allocate = ByteBuffer.allocate(16384);
                o = ByteOrder.nativeOrder();
                allocate.order((ByteOrder)o);
                o = new ArrayList();
                while (true) {
                    final int sampleData = mediaExtractor.readSampleData(allocate, 0);
                    if (sampleData < 0) {
                        break;
                    }
                    if (sampleData > 0) {
                        allocate.position();
                        allocate.limit();
                        final ShortBuffer shortBuffer = allocate.asShortBuffer();
                        while (shortBuffer.hasRemaining()) {
                            ((List<Short>)o).add(Short.valueOf(shortBuffer.get()));
                        }
                    }
                    allocate.clear();
                    mediaExtractor.advance();
                }
                if (((List)o).isEmpty()) {
                    while (i < n) {
                        list.add(0.0f);
                        ++i;
                    }
                    mediaExtractor.release();
                    return list;
                }
                final int size = ((List)o).size();
                final int max = Math.max(1, size / n);
                for (int j = 0; j < n; ++j) {
                    int k = j * max;
                    final int min = Math.min(k + max, size);
                    if (k >= size) {
                        list.add(0.0f);
                    }
                    else {
                        int n4 = 0;
                        while (k < min) {
                            final short shortValue = ((List<Short>)o).get(k);
                            if (Math.abs(shortValue) > Math.abs(n4)) {
                                n4 = shortValue;
                            }
                            ++k;
                        }
                        list.add(Math.abs(n4) / 32767.0f);
                    }
                }
                mediaExtractor.release();
                return list;
            }
            finally {
                o = mediaExtractor;
            }
        }
        finally {}
        if (o != null) {
            ((MediaExtractor)o).release();
        }
    }
    
    public void extractAmplitudeDataAsync(final String s, final int n, final AmplitudeExtract$AmplitudeDataCallback amplitudeExtract$AmplitudeDataCallback) {
        this.executorService.execute(new AmplitudeExtract$$ExternalSyntheticLambda0(this, s, n, amplitudeExtract$AmplitudeDataCallback));
    }
}
