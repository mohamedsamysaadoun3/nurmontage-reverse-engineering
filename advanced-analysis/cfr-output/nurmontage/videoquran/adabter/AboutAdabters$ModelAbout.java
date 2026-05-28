/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package hazem.nurmontage.videoquran.adabter;

import android.util.Pair;

public class AboutAdabters$ModelAbout {
    private int image_1;
    private int image_2;
    private int sizeText;
    private Pair text;

    public AboutAdabters$ModelAbout(int n, int n2, Pair pair) {
        this.sizeText = 16;
        this.text = pair;
        this.image_1 = n;
        this.image_2 = n2;
    }

    public AboutAdabters$ModelAbout(int n, Pair pair) {
        int n2;
        this.image_1 = n2 = -1;
        this.image_2 = n2;
        this.text = pair;
        this.sizeText = n;
    }

    public AboutAdabters$ModelAbout(int n, Pair pair, int n2) {
        this.image_2 = -1;
        this.text = pair;
        this.image_1 = n2;
        this.sizeText = n;
    }

    public AboutAdabters$ModelAbout(Pair pair) {
        int n;
        this.image_1 = n = -1;
        this.image_2 = n;
        this.sizeText = 16;
        this.text = pair;
    }

    public AboutAdabters$ModelAbout(Pair pair, int n) {
        this.image_2 = -1;
        this.sizeText = 16;
        this.text = pair;
        this.image_1 = n;
    }

    public AboutAdabters$ModelAbout(Pair pair, int n, int n2) {
        this.image_2 = -1;
        this.text = pair;
        this.sizeText = n2;
        this.image_1 = n;
    }

    public int geGravity() {
        return (Integer)this.text.second;
    }

    public int getImage_1() {
        return this.image_1;
    }

    public int getImage_2() {
        return this.image_2;
    }

    public int getSizeText() {
        return this.sizeText;
    }

    public String getText() {
        return (String)this.text.first;
    }
}

