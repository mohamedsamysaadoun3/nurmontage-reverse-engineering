// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.net.Uri;
import android.content.Context;
import android.media.MediaScannerConnection;
import java.io.File;
import android.media.MediaScannerConnection$MediaScannerConnectionClient;

public class FileMediaScanner implements MediaScannerConnection$MediaScannerConnectionClient
{
    private File file;
    public MediaScannerConnection mediaScannerConnection;
    
    public FileMediaScanner(final Context context, final File file) {
        this.file = file;
        (this.mediaScannerConnection = new MediaScannerConnection(context, (MediaScannerConnection$MediaScannerConnectionClient)this)).connect();
    }
    
    public void onMediaScannerConnected() {
        this.mediaScannerConnection.scanFile(this.file.getAbsolutePath(), (String)null);
    }
    
    public void onScanCompleted(final String s, final Uri uri) {
        this.mediaScannerConnection.disconnect();
    }
}
