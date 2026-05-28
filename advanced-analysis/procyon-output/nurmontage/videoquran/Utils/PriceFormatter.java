// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.text.ParseException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PriceFormatter
{
    private static String extractCurrencySymbol(final String s) {
        final char[] charArray = s.toCharArray();
        for (int length = charArray.length, i = 0; i < length; ++i) {
            final char c = charArray[i];
            if (!Character.isDigit(c) && c != '.' && c != ',') {
                return String.valueOf(c);
            }
        }
        return "";
    }
    
    public static String formatPrice(String string) {
        final String replacement = "";
        if (string == null || string.isEmpty()) {
            return replacement;
        }
        final String currencySymbol = extractCurrencySymbol(string);
        String source = string.replace(currencySymbol, replacement).trim();
        final String s = ",";
        if (source.contains(s)) {
            final String s2 = ".";
            if (!source.contains(s2)) {
                source = source.replace(s, s2);
            }
        }
        try {
            final Locale us = Locale.US;
            try {
                final NumberFormat numberInstance = NumberFormat.getNumberInstance(us);
                if (!(numberInstance instanceof DecimalFormat)) {
                    return string;
                }
                final DecimalFormat decimalFormat = (DecimalFormat)numberInstance;
                try {
                    decimalFormat.getDecimalFormatSymbols();
                    final DecimalFormat decimalFormat2 = decimalFormat;
                    try {
                        final Number parse = decimalFormat2.parse(source);
                        try {
                            try {
                                final BigDecimal obj = new BigDecimal(parse.toString());
                                decimalFormat.applyPattern("#,##0.##");
                                final DecimalFormat decimalFormat3 = decimalFormat;
                                try {
                                    final String format = decimalFormat3.format(obj);
                                    try {
                                        try {
                                            final StringBuilder sb = new StringBuilder();
                                            try {
                                                final StringBuilder append = sb.append(currencySymbol).append(format);
                                                try {
                                                    string = append.toString();
                                                    return string;
                                                }
                                                catch (final NumberFormatException | ParseException ex) {}
                                            }
                                            catch (final NumberFormatException | ParseException ex2) {}
                                        }
                                        catch (final NumberFormatException | ParseException ex3) {}
                                    }
                                    catch (final NumberFormatException | ParseException ex4) {}
                                }
                                catch (final NumberFormatException | ParseException ex5) {}
                            }
                            catch (final NumberFormatException | ParseException ex6) {}
                        }
                        catch (final NumberFormatException | ParseException ex7) {}
                    }
                    catch (final NumberFormatException | ParseException ex8) {}
                }
                catch (final NumberFormatException | ParseException ex9) {}
            }
            catch (final NumberFormatException | ParseException ex10) {}
        }
        catch (final NumberFormatException | ParseException ex11) {}
    }
}
