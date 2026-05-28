package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class WordModel {
    private boolean isSelected;

    /* renamed from: w */
    private String f441w;

    public WordModel(String textValue, boolean isFlag) {
        this.f441w = textValue;
        this.isSelected = isFlag;
    }

    public WordModel(String textValue) {
        this.f441w = textValue;
    }

    public void setSelected(boolean isFlag) {
        this.isSelected = isFlag;
    }

    public void setW(String textValue) {
        this.f441w = textValue;
    }

    public String getW() {
        return this.f441w;
    }

    public boolean isSelected() {
        return this.isSelected;
    }
}
