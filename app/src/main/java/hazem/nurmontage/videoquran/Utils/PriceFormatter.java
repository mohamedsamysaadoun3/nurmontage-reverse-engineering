package hazem.nurmontage.videoquran.Utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PriceFormatter {
    public static String formatPrice(String priceStr) {
        if (priceStr == null || priceStr.isEmpty()) {
            return "";
        }
        String extractCurrencySymbol = extractCurrencySymbol(priceStr);
        String trim = priceStr.replace(extractCurrencySymbol, "").trim();
        if (trim.contains(",") && !trim.contains(".")) {
            trim = trim.replace(",", ".");
        }
        try {
            NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
            if (!(numberInstance instanceof DecimalFormat)) {
                return priceStr;
            }
            DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
            decimalFormat.getDecimalFormatSymbols();
            BigDecimal bigDecimal = new BigDecimal(decimalFormat.parse(trim).toString());
            decimalFormat.applyPattern("#,##0.##");
            return extractCurrencySymbol + decimalFormat.format(bigDecimal);
        } catch (NumberFormatException | ParseException unused) {
            return priceStr;
        }
    }

    private static String extractCurrencySymbol(String priceStr) {
        for (char c : priceStr.toCharArray()) {
            if (!Character.isDigit(c) && c != '.' && c != ',') {
                return String.valueOf(c);
            }
        }
        return "";
    }
}
