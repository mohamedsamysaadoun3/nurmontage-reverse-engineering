/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.MFileUtils;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MFileUtils$FileInfo
implements Serializable {
    public String formattedDate;
    public long lastModified;
    public String name;
    public String timedDate;

    public MFileUtils$FileInfo(String object, long l) {
        this.name = object;
        this.lastModified = l;
        object = MFileUtils.formatDateShort(l);
        this.formattedDate = object;
        long l2 = 0L;
        long l3 = l == l2 ? 0 : (l < l2 ? -1 : 1);
        if (l3 > 0) {
            Locale locale = Locale.getDefault();
            object = new SimpleDateFormat("HH:mm:ss", locale);
            Date date = new Date(l);
            this.timedDate = object = ((DateFormat)object).format(date);
        }
    }
}

