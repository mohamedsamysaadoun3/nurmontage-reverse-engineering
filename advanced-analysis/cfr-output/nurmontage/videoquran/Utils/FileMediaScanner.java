/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaScannerConnection
 *  android.media.MediaScannerConnection$MediaScannerConnectionClient
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.File;

public class FileMediaScanner
implements MediaScannerConnection.MediaScannerConnectionClient {
    private File file;
    public MediaScannerConnection mediaScannerConnection;

    public FileMediaScanner(Context context, File file) {
        this.file = file;
        super(context, (MediaScannerConnection.MediaScannerConnectionClient)this);
        this.mediaScannerConnection = file;
        file.connect();
    }

    public void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.mediaScannerConnection;
        String string2 = this.file.getAbsolutePath();
        mediaScannerConnection.scanFile(string2, null);
    }

    public void onScanCompleted(String string2, Uri uri) {
        this.mediaScannerConnection.disconnect();
    }
}

