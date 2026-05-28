/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

public class BgItem {
    private int id;
    private String name_drawable;
    private float x;
    private float y;

    public BgItem(int n, float f, float f2, String string2) {
        this.id = n;
        this.x = f;
        this.y = f2;
        this.name_drawable = string2;
    }

    public int getId() {
        return this.id;
    }

    public String getName_drawable() {
        return this.name_drawable;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setName_drawable(String string2) {
        this.name_drawable = string2;
    }
}

