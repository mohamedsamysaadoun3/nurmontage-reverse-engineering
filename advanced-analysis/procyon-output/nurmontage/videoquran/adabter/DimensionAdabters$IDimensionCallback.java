// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.constant.ResizeType;

public interface DimensionAdabters$IDimensionCallback
{
    void done();
    
    void isCustomSize(final boolean p0, final ResizeType p1);
    
    void onCustumSize(final int p0, final int p1, final int p2, final String p3, final int p4);
}
