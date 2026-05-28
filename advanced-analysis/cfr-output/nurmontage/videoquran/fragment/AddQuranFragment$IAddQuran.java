/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.fragment;

import android.net.Uri;
import java.util.List;

public interface AddQuranFragment$IAddQuran {
    public void onAdd(String var1, String var2, String var3, String var4, int var5, int var6, String var7, int var8, int var9);

    public void onAddReaderName(String var1, String var2, Uri var3);

    public void onAddTranslation(String var1, int var2, boolean var3);

    public void onBismilah();

    public void onCancel();

    public void onDone(String var1, int var2, String var3, Uri var4, String var5);

    public void onDone(String var1, int var2, String var3, List var4);

    public void onErrorLimitation();

    public void onSearch();

    public void onVuCopyRight();

    public void progress();

    public void uploadRecitation();
}

