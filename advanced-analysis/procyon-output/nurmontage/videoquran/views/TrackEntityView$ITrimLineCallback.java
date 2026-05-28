// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.constant.EntityAction;

public interface TrackEntityView$ITrimLineCallback
{
    void enableRedo(final boolean p0);
    
    void enableUndo(final boolean p0);
    
    void fadeInAudio(final float p0);
    
    void fadeOutAudio(final float p0);
    
    void onAddStack(final EntityAction p0);
    
    void onDelete(final EntityView p0);
    
    void onEmptySelect();
    
    void onMove();
    
    void onPlayVibration();
    
    void onSeekPlayer(final float p0);
    
    void onSelectEntity(final Entity p0, final float p1);
    
    void onSelectMultiple(final int p0);
    
    void onUp();
    
    void onUpdate();
    
    void onUpdatePlayerAudio(final EntityAudio p0);
    
    void onUpdateTime();
    
    void pause();
    
    void progress(final boolean p0);
}
