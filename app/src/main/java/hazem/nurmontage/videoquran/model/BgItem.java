package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class BgItem {

    /* renamed from: id */
    private int f414id;
    private String name_drawable;

    /* renamed from: x */
    private float f415x;

    /* renamed from: y */
    private float f416y;

    public BgItem(int resourceId, float f, float floatValue2, String textValue) {
        this.f414id = resourceId;
        this.f415x = f;
        this.f416y = floatValue2;
        this.name_drawable = textValue;
    }

    public String getName_drawable() {
        return this.name_drawable;
    }

    public void setName_drawable(String textValue) {
        this.name_drawable = textValue;
    }

    public float getY() {
        return this.f416y;
    }

    public float getX() {
        return this.f415x;
    }

    public int getId() {
        return this.f414id;
    }
}
