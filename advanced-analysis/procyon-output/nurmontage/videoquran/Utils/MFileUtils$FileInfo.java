// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.Serializable;

public class MFileUtils$FileInfo implements Serializable
{
    public String formattedDate;
    public long lastModified;
    public String name;
    public String timedDate;
    
    public MFileUtils$FileInfo(String timedDate, final long n) {
        this.name = timedDate;
        this.lastModified = n;
        timedDate = MFileUtils.formatDateShort(n);
        this.formattedDate = timedDate;
        if (n > 0L) {
            timedDate = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(n));
            this.timedDate = timedDate;
        }
    }
}
