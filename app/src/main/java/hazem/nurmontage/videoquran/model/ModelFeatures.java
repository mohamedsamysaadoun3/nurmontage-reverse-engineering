package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class ModelFeatures {
    private boolean isForFree;
    private String name;

    public ModelFeatures(String textValue, boolean isFlag) {
        this.name = textValue;
        this.isForFree = isFlag;
    }

    public ModelFeatures(String textValue) {
        this.name = textValue;
    }

    public boolean isForFree() {
        return this.isForFree;
    }

    public String getName() {
        return this.name;
    }
}
