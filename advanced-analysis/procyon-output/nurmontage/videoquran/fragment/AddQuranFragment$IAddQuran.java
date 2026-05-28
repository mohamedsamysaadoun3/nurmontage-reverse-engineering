// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import android.net.Uri;

public interface AddQuranFragment$IAddQuran
{
    void onAdd(final String p0, final String p1, final String p2, final String p3, final int p4, final int p5, final String p6, final int p7, final int p8);
    
    void onAddReaderName(final String p0, final String p1, final Uri p2);
    
    void onAddTranslation(final String p0, final int p1, final boolean p2);
    
    void onBismilah();
    
    void onCancel();
    
    void onDone(final String p0, final int p1, final String p2, final Uri p3, final String p4);
    
    void onDone(final String p0, final int p1, final String p2, final List p3);
    
    void onErrorLimitation();
    
    void onSearch();
    
    void onVuCopyRight();
    
    void progress();
    
    void uploadRecitation();
}
