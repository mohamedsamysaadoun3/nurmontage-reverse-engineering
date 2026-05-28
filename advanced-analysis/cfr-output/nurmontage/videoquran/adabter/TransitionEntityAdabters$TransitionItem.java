/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.adabter;

public class TransitionEntityAdabters$TransitionItem {
    private int angle;
    private int id_ressource;
    private String type;

    public TransitionEntityAdabters$TransitionItem(String string2, int n, int n2) {
        this.type = string2;
        this.id_ressource = n;
        this.angle = n2;
    }

    public int getAngle() {
        return this.angle;
    }

    public int getId_ressource() {
        return this.id_ressource;
    }

    public String getType() {
        return this.type;
    }
}

