// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.constant;

public enum TransitionType
{
    DISTANCE("DISTANCE", 6, "distance"), 
    FADE("FADE", 1, "fade"), 
    FADE_BLACK("FADE_BLACK", 5, "fade_black"), 
    FADE_IN("FADE_IN", 2, "fade_in"), 
    FADE_OUT("FADE_OUT", 3, "fade_out"), 
    FADE_WHITE("FADE_WHITE", 4, "fade_white"), 
    HBLUR("HBLUR", 24, "hblur"), 
    HLSLICE("HLSLICE", 25, "hlslice"), 
    JUMP("JUMP", 14, "jump"), 
    NONE("NONE", 0, "none"), 
    PIXELIZE("PIXELIZE", 23, "pixelize"), 
    RADIAL("RADIAL", 9, "radial"), 
    ROTATE_L("ROTATE_L", 30, "rotate_l"), 
    ROTATE_R("ROTATE_R", 31, "rotate_r"), 
    SLIDE_BC("SLIDE_BC", 20, "slide_bc"), 
    SLIDE_BL("SLIDE_BL", 18, "slide_bl"), 
    SLIDE_BOTTOM("SLIDE_BOTTOM", 11, "slidebottom"), 
    SLIDE_BR("SLIDE_BR", 16, "slide_br"), 
    SLIDE_CL("SLIDE_CL", 22, "slide_cl"), 
    SLIDE_CR("SLIDE_CR", 21, "slide_cr"), 
    SLIDE_TC("SLIDE_TC", 19, "slide_tc"), 
    SLIDE_TL("SLIDE_TL", 15, "slide_tl"), 
    SLIDE_TOP("SLIDE_TOP", 10, "slidetop"), 
    SLIDE_TO_LEFT("SLIDE_TO_LEFT", 13, "slideleft"), 
    SLIDE_TO_RIGHT("SLIDE_TO_RIGHT", 12, "slideright"), 
    SLIDE_TR("SLIDE_TR", 17, "slide_tr"), 
    SPIN_LEFT("SPIN_LEFT", 26, "spin_left"), 
    SPIN_RIGHT("SPIN_RIGHT", 27, "spin_right"), 
    WIPE_LEFT("WIPE_LEFT", 8, "wipeleft"), 
    WIPE_RIGHT("WIPE_RIGHT", 7, "wiperight"), 
    ZOOM_IN("ZOOM_IN", 28, "zoomin"), 
    ZOOM_OUT("ZOOM_OUT", 29, "zoomout");
    
    private final String value;
    
    private TransitionType(final String name, final int ordinal, final String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
}
