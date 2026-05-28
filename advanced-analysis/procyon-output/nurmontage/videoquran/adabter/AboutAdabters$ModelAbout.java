// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.util.Pair;

public class AboutAdabters$ModelAbout
{
    private int image_1;
    private int image_2;
    private int sizeText;
    private Pair text;
    
    public AboutAdabters$ModelAbout(final int image_1, final int image_2, final Pair text) {
        this.sizeText = 16;
        this.text = text;
        this.image_1 = image_1;
        this.image_2 = image_2;
    }
    
    public AboutAdabters$ModelAbout(final int sizeText, final Pair text) {
        final int n = -1;
        this.image_1 = n;
        this.image_2 = n;
        this.text = text;
        this.sizeText = sizeText;
    }
    
    public AboutAdabters$ModelAbout(final int sizeText, final Pair text, final int image_1) {
        this.image_2 = -1;
        this.text = text;
        this.image_1 = image_1;
        this.sizeText = sizeText;
    }
    
    public AboutAdabters$ModelAbout(final Pair text) {
        final int n = -1;
        this.image_1 = n;
        this.image_2 = n;
        this.sizeText = 16;
        this.text = text;
    }
    
    public AboutAdabters$ModelAbout(final Pair text, final int image_1) {
        this.image_2 = -1;
        this.sizeText = 16;
        this.text = text;
        this.image_1 = image_1;
    }
    
    public AboutAdabters$ModelAbout(final Pair text, final int image_1, final int sizeText) {
        this.image_2 = -1;
        this.text = text;
        this.sizeText = sizeText;
        this.image_1 = image_1;
    }
    
    public int geGravity() {
        return (int)this.text.second;
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
