/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.constant.AyaTextPreset;

public interface EditTrslEntityFragment$IEditEntityCallback {
    public void fromNow();

    public void fromTheStart();

    public void onAnim();

    public void onColor();

    public void onCut();

    public void onDelete();

    public void onDone();

    public void onDuplicate();

    public void onEdit();

    public void onFont();

    public void onIcon();

    public void untilNow();

    public void untilTheEnd();

    public void updateAya(int var1);

    public void updatePreset(AyaTextPreset var1);

    public void updateTrsl(int var1);
}

