/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class PriceFormatter {
    private static String extractCurrencySymbol(String object) {
        for (Object object2 : (Object)((String)object).toCharArray()) {
            int n = Character.isDigit((char)object2);
            if (n != 0 || object2 == (n = 46) || object2 == (n = 44)) continue;
            return String.valueOf((char)object2);
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String formatPrice(String string2) {
        Object object;
        boolean bl;
        Object object2;
        Object object3 = "";
        if (string2 == null) return object3;
        boolean bl2 = string2.isEmpty();
        if (bl2) return object3;
        CharSequence charSequence = PriceFormatter.extractCurrencySymbol(string2);
        object3 = string2.replace(charSequence, (CharSequence)object3).trim();
        boolean bl3 = ((String)object3).contains((CharSequence)(object2 = ","));
        if (bl3 && !(bl = ((String)object3).contains((CharSequence)(object = ".")))) {
            object3 = ((String)object3).replace((CharSequence)object2, (CharSequence)object);
        }
        object2 = Locale.US;
        object2 = NumberFormat.getNumberInstance((Locale)object2);
        bl3 = object2 instanceof DecimalFormat;
        if (!bl3) return string2;
        object2 = (DecimalFormat)object2;
        ((DecimalFormat)object2).getDecimalFormatSymbols();
        object3 = ((NumberFormat)object2).parse((String)object3);
        object3 = object3.toString();
        object = new BigDecimal((String)object3);
        object3 = "#,##0.##";
        ((DecimalFormat)object2).applyPattern((String)object3);
        object3 = ((Format)object2).format(object);
        object2 = new StringBuilder();
        charSequence = ((StringBuilder)object2).append((String)charSequence);
        object3 = ((StringBuilder)charSequence).append((String)object3);
        try {
            return ((StringBuilder)object3).toString();
        }
        catch (NumberFormatException | ParseException exception) {
            return string2;
        }
    }
}

