// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.res.AssetManager;
import android.text.TextUtils;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.HashMap;
import android.content.res.Resources;
import java.util.List;
import java.util.Map;

public class FontProvider
{
    private String DEFAULT_FONT_NAME;
    private Map fontNameToTypefaceFileQuran;
    private List fontNamesQuran;
    private Resources resources;
    private Map typefaces;
    
    public FontProvider(final Resources resources) {
        this.typefaces = new HashMap();
        this.resources = resources;
        this.loadQuranFont();
    }
    
    private void loadQuranFont() {
        (this.fontNameToTypefaceFileQuran = new HashMap()).put("\u0627\u0644\u0645\u062c\u062f", "\u0627\u0644\u0645\u062c\u062f.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062c\u0646\u0629", "\u062c\u0646\u0629.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0645\u062d\u0645\u062f\u064a", "\u0645\u062d\u0645\u062f\u064a.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u0627\u0644\u062b\u0644\u062b \u0645\u0632\u062e\u0631\u0641", "\u0627\u0644\u062b\u0644\u062b \u0645\u0632\u062e\u0631\u0641.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u0623\u062c\u0631\u0627\u0643", "\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u0623\u062c\u0631\u0627\u0643.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u062a\u062d\u0631\u064a\u0631", "\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u062a\u062d\u0631\u064a\u0631.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u0646\u0633\u062e", "\u0628\u0627\u0643 \u062a\u0627\u064a\u0628 \u0646\u0633\u062e.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u0646\u0633\u062e \u0639\u062b\u0645\u0627\u0646\u064a", "\u062e\u0637 \u0646\u0633\u062e \u0639\u062b\u0645\u0627\u0646\u064a.otf");
        this.fontNameToTypefaceFileQuran.put("\u0639\u062b\u0645\u0627\u0646\u064a", "\u0639\u062b\u0645\u0627\u0646\u064a.otf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u0627\u0644\u0642\u064a\u0631\u0648\u0627\u0646", "\u062e\u0637 \u0627\u0644\u0642\u064a\u0631\u0648\u0627\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u062d\u0641\u0635", "\u062e\u0637 \u062d\u0641\u0635.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u0648\u0631\u0634", "\u062e\u0637 \u0648\u0631\u0634.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0642\u0627\u0644\u0648\u0646", "\u0642\u0627\u0644\u0648\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0645\u0631\u064a\u0645", "\u0645\u0631\u064a\u0645.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0627\u0644\u0623\u0642\u0635\u0649", "\u0627\u0644\u0623\u0642\u0635\u0649.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0623\u062c\u0646\u0627\u062f\u064a\u0646", "\u0623\u062c\u0646\u0627\u062f\u064a\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0628\u064a\u0628\u0648", "\u0628\u064a\u0628\u0648.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0628\u064a\u0633\u0627\u0646 \u0644\u0627\u064a\u062a", "\u0628\u064a\u0633\u0627\u0646 \u0644\u0627\u064a\u062a.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062a\u0628\u064a\u0627\u0646", "\u062a\u0628\u064a\u0627\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062a\u062c\u0645\u0639 \u0643\u0648\u0641\u064a", "\u062a\u062c\u0645\u0639 \u0643\u0648\u0641\u064a.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062a\u0631\u064a\u0643\u0627", "\u062a\u0631\u064a\u0643\u0627.ttf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u062a\u062c\u0645\u0639 \u0627\u0644\u0645\u0635\u0645\u0645\u064a\u0646", "\u062e\u0637 \u062a\u062c\u0645\u0639 \u0627\u0644\u0645\u0635\u0645\u0645\u064a\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0634\u0645\u0627\u0626\u0644", "\u0634\u0645\u0627\u0626\u0644.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0639\u0635\u0648\u0645\u064a", "\u0639\u0635\u0648\u0645\u064a.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0641\u0631\u0634\u0629", "\u0641\u0631\u0634\u0629.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0641\u0633\u064a\u062d", "\u0641\u0633\u064a\u062d.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0643\u0648\u0641\u064a", "\u0643\u0648\u0641\u064a.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0645\u0637\u0631\u064a\u0629", "\u0645\u0637\u0631\u064a\u0629.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0646\u0645\u0631", "\u0646\u0645\u0631.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0647\u064a\u0641\u0646", "\u0647\u064a\u0641\u0646.ttf");
        this.fontNameToTypefaceFileQuran.put("\u0644\u0641\u062a\u0627 \u0628\u0644\u0627\u0643", "\u0644\u0641\u062a\u0627 \u0628\u0644\u0627\u0643.otf");
        this.fontNameToTypefaceFileQuran.put("\u062e\u0637 \u0627\u0644\u0625\u0628\u0644", "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf");
        this.fontNamesQuran = new ArrayList(new TreeSet(this.fontNameToTypefaceFileQuran.keySet()));
    }
    
    public void clear() {
        final Map fontNameToTypefaceFileQuran = this.fontNameToTypefaceFileQuran;
        if (fontNameToTypefaceFileQuran != null) {
            fontNameToTypefaceFileQuran.clear();
            this.fontNameToTypefaceFileQuran = null;
        }
        final List fontNamesQuran = this.fontNamesQuran;
        if (fontNamesQuran != null) {
            fontNamesQuran.clear();
            this.fontNamesQuran = null;
        }
        final Map typefaces = this.typefaces;
        if (typefaces != null) {
            typefaces.clear();
            this.typefaces = null;
        }
        this.resources = null;
    }
    
    public String getDefaultFontName() {
        return this.DEFAULT_FONT_NAME;
    }
    
    public List getFontNamesQuran() {
        return this.fontNamesQuran;
    }
    
    public String getFullName(final String s) {
        return this.fontNameToTypefaceFileQuran.get(s);
    }
    
    public Resources getResources() {
        return this.resources;
    }
    
    public Typeface getTypeface(final String s) {
        final String str = "fonts/arabic/";
        if (s == null) {
            return Typeface.DEFAULT;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return Typeface.DEFAULT;
            }
            Label_0124: {
                if (this.typefaces.get(s) != null) {
                    break Label_0124;
                }
                final Resources resources = this.resources;
                try {
                    final AssetManager assets = resources.getAssets();
                    try {
                        final StringBuilder sb = new StringBuilder(str);
                        final String value = this.fontNameToTypefaceFileQuran.get(s);
                        try {
                            final StringBuilder append = sb.append(value);
                            try {
                                final Typeface fromAsset = Typeface.createFromAsset(assets, append.toString());
                                try {
                                    this.typefaces.put(s, fromAsset);
                                    return fromAsset;
                                    final Typeface value2 = this.typefaces.get(s);
                                    try {
                                        return value2;
                                    }
                                    catch (final Exception ex) {
                                        return Typeface.DEFAULT;
                                    }
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
                catch (final Exception ex6) {}
            }
        }
        catch (final Exception ex7) {}
    }
    
    public void setDefaultFontName(final String default_FONT_NAME) {
        this.DEFAULT_FONT_NAME = default_FONT_NAME;
    }
}
