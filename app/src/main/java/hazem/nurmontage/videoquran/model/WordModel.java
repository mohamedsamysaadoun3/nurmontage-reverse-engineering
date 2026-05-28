package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class WordModel {
    private boolean isSelected;

    /* renamed from: w */
    private String f441w;

    public WordModel(String str, boolean z) {
        this.f441w = str;
        this.isSelected = z;
    }

    public WordModel(String str) {
        this.f441w = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setW(String str) {
        this.f441w = str;
    }

    public String getW() {
        return this.f441w;
    }

    public boolean isSelected() {
        return this.isSelected;
    }
}
