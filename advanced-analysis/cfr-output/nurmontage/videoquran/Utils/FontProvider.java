/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.text.TextUtils
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FontProvider {
    private String DEFAULT_FONT_NAME;
    private Map fontNameToTypefaceFileQuran;
    private List fontNamesQuran;
    private Resources resources;
    private Map typefaces;

    public FontProvider(Resources resources) {
        HashMap hashMap;
        this.typefaces = hashMap = new HashMap();
        this.resources = resources;
        this.loadQuranFont();
    }

    private void loadQuranFont() {
        Cloneable cloneable;
        this.fontNameToTypefaceFileQuran = cloneable = new Cloneable();
        cloneable.put("\u0627\u0644\u0645\u062c\u062f", "\u0627\u0644\u0645\u062c\u062f.ttf");
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
        Set set = this.fontNameToTypefaceFileQuran.keySet();
        TreeSet treeSet = new TreeSet(set);
        cloneable = new Cloneable(treeSet);
        this.fontNamesQuran = cloneable;
    }

    public void clear() {
        Object object = this.fontNameToTypefaceFileQuran;
        if (object != null) {
            object.clear();
            this.fontNameToTypefaceFileQuran = null;
        }
        if ((object = this.fontNamesQuran) != null) {
            object.clear();
            this.fontNamesQuran = null;
        }
        if ((object = this.typefaces) != null) {
            object.clear();
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

    public String getFullName(String string2) {
        return (String)this.fontNameToTypefaceFileQuran.get(string2);
    }

    public Resources getResources() {
        return this.resources;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public Typeface getTypeface(String string2) {
        Object object;
        block20: {
            Map map;
            object = "fonts/arabic/";
            if (string2 == null) {
                return Typeface.DEFAULT;
            }
            try {
                boolean bl = TextUtils.isEmpty((CharSequence)string2);
                if (bl) {
                    return Typeface.DEFAULT;
                }
                map = this.typefaces;
                if ((map = map.get(string2)) != null) break block20;
            }
            catch (Exception exception) {
                return Typeface.DEFAULT;
            }
            map = this.resources;
            map = map.getAssets();
            StringBuilder stringBuilder = new StringBuilder((String)object);
            object = this.fontNameToTypefaceFileQuran;
            object = object.get(string2);
            object = (String)object;
            object = stringBuilder.append((String)object);
            object = ((StringBuilder)object).toString();
            object = Typeface.createFromAsset((AssetManager)map, (String)object);
            map = this.typefaces;
            map.put(string2, object);
            return object;
        }
        object = this.typefaces;
        Object v = object.get(string2);
        return (Typeface)v;
    }

    public void setDefaultFontName(String string2) {
        this.DEFAULT_FONT_NAME = string2;
    }
}

