/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.ResizeType;

public class ItemDimension {
    private final int h;
    private String id;
    private int image;
    private String name;
    private ResizeType resizeType;
    private final int w;

    public ItemDimension(String string2, int n, ResizeType resizeType, int n2, int n3, String string3) {
        this.name = string2;
        this.image = n;
        this.resizeType = resizeType;
        this.w = n2;
        this.h = n3;
        this.id = string3;
    }

    public int getH() {
        return this.h;
    }

    public String getId() {
        return this.id;
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

    public int getW() {
        return this.w;
    }
}

