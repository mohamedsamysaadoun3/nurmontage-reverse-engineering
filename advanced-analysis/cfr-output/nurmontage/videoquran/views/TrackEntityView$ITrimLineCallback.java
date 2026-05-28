/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.constant.EntityAction;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.model.EntityView;

public interface TrackEntityView$ITrimLineCallback {
    public void enableRedo(boolean var1);

    public void enableUndo(boolean var1);

    public void fadeInAudio(float var1);

    public void fadeOutAudio(float var1);

    public void onAddStack(EntityAction var1);

    public void onDelete(EntityView var1);

    public void onEmptySelect();

    public void onMove();

    public void onPlayVibration();

    public void onSeekPlayer(float var1);

    public void onSelectEntity(Entity var1, float var2);

    public void onSelectMultiple(int var1);

    public void onUp();

    public void onUpdate();

    public void onUpdatePlayerAudio(EntityAudio var1);

    public void onUpdateTime();

    public void pause();

    public void progress(boolean var1);
}

