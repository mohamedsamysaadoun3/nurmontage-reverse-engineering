package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.ResizeType;

/* loaded from: classes2.dex */
public class ItemDimension {

    /* renamed from: h */
    private final int f429h;

    /* renamed from: id */
    private String f430id;
    private int image;
    private String name;
    private ResizeType resizeType;

    /* renamed from: w */
    private final int f431w;

    public ItemDimension(String str, int i, ResizeType resizeType, int i2, int size3, String textValue2) {
        this.name = str;
        this.image = i;
        this.resizeType = resizeType;
        this.f431w = i2;
        this.f429h = size3;
        this.f430id = textValue2;
    }

    public String getId() {
        return this.f430id;
    }

    public int getW() {
        return this.f431w;
    }

    public int getH() {
        return this.f429h;
    }

    public int getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public ResizeType getResizeType() {
        return this.resizeType;
    }
}
