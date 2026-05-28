/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TranslationExtractor {
    /*
     * Exception decompiling
     */
    public static void convertJsonToTxt(Context var0, String var1_3, String var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [89[WHILELOOP]], but top level block is 8[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static void extractTranslationsBySurahAndAyah(Context var0) {
        block85: {
            block89: {
                block86: {
                    block84: {
                        block83: {
                            block82: {
                                block81: {
                                    var1_1 = ",";
                                    var2_12 = "UTF-8";
                                    var3_13 = null;
                                    var4_14 = var0.getAssets();
                                    var5_15 = "salamquran_quran_words.txt";
                                    var4_14 = var4_14.open((String)var5_15);
                                    var6_16 = new InputStreamReader((InputStream)var4_14, (String)var2_12);
                                    var5_15 = new BufferedReader((Reader)var6_16);
                                    var6_16 = Environment.getExternalStorageDirectory();
                                    var7_17 = "QuranTranslations";
                                    var4_14 = new File((File)var6_16, (String)var7_17);
                                    var8_18 = var4_14.exists();
                                    if (var8_18) break block81;
                                    var4_14.mkdirs();
                                }
                                var7_17 = "translations.txt";
                                var6_16 = new File((File)var4_14, (String)var7_17);
                                var9_19 = new FileOutputStream((File)var6_16);
                                var7_17 = new OutputStreamWriter((OutputStream)var9_19, (String)var2_12);
                                var4_14 = new BufferedWriter((Writer)var7_17);
                                var2_12 = "^\\(\\s*\\d+\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,.*'([^']*)'\\s*\\)$";
                                var2_12 = Pattern.compile((String)var2_12);
                                var3_13 = new StringBuilder();
                                var11_21 = var10_20 = -1;
                                var12_22 = var10_20;
                                break block82;
                                catch (Throwable var1_4) {
                                    var2_12 = var1_4;
                                    var4_14 = null;
                                    break block83;
                                }
                                catch (IOException var1_6) {
                                    var4_14 = null;
                                    break block84;
                                }
                                catch (Throwable var1_7) {
                                    var2_12 = var1_7;
                                    var4_14 = null;
                                    break block85;
                                }
                                catch (IOException var1_8) {
                                    var4_14 = null;
                                    break block86;
                                }
                            }
                            while (true) {
                                block88: {
                                    block87: {
                                        var13_23 = var5_15.readLine();
                                        var14_24 = "";
                                        var15_25 = ", $";
                                        var16_26 = "|";
                                        if (var13_23 == null) break;
                                        var13_23 = var13_23.trim();
                                        var17_27 = var13_23.endsWith((String)var1_1);
                                        var18_28 = 1;
                                        var19_29 = 0;
                                        var20_30 = null;
                                        if (var17_27 == 0) break block87;
                                        var17_27 = var13_23.length() - var18_28;
                                        var13_23 = var13_23.substring(0, var17_27);
                                    }
                                    var13_23 = var2_12.matcher((CharSequence)var13_23);
                                    var17_27 = (int)var13_23.find();
                                    if (var17_27 == 0) continue;
                                    var21_31 = var13_23.group(var18_28);
                                    var17_27 = Integer.parseInt(var21_31);
                                    var18_28 = 2;
                                    var22_32 = var13_23.group(var18_28);
                                    var18_28 = Integer.parseInt(var22_32);
                                    var19_29 = 3;
                                    var13_23 = var13_23.group(var19_29);
                                    if (var11_21 == var10_20 || var12_22 == var10_20 || var18_28 == var11_21 && var17_27 == var12_22) break block88;
                                    var20_30 = new StringBuilder();
                                    var9_19 = var20_30.append(var11_21);
                                    var9_19 = var9_19.append(var16_26);
                                    var9_19 = var9_19.append(var12_22);
                                    var23_33 = var3_13.toString();
                                    var16_26 = ",\\s+";
                                    var23_33 = var23_33.replaceAll(var16_26, (String)var1_1);
                                    var23_33 = var23_33.replaceAll(var15_25, var14_24);
                                    var9_19 = var9_19.append(var23_33);
                                    var9_19 = var9_19.toString();
                                    var4_14.write((String)var9_19);
                                    var4_14.newLine();
                                    var11_21 = 0;
                                    var9_19 = null;
                                    var3_13.setLength(0);
                                }
                                var9_19 = var3_13.append((String)var13_23);
                                var23_33 = ", ";
                                var9_19.append(var23_33);
                                var12_22 = var17_27;
                                var11_21 = var18_28;
                                continue;
                                break;
                            }
                            var24_34 = var3_13.length();
                            if (var24_34 <= 0 || var11_21 == var10_20 || var12_22 == var10_20) ** GOTO lbl151
                            var1_1 = new StringBuilder();
                            var1_1 = var1_1.append(var11_21);
                            var1_1 = var1_1.append(var16_26);
                            var1_1 = var1_1.append(var12_22);
                            var2_12 = " ";
                            var1_1 = var1_1.append((String)var2_12);
                            var2_12 = var3_13.toString();
                            var2_12 = var2_12.replaceAll(var15_25, var14_24);
                            var1_1 = var1_1.append((String)var2_12);
                            var1_1 = var1_1.toString();
                            var4_14.write((String)var1_1);
lbl151:
                            // 2 sources

                            var4_14.flush();
                            var1_1 = System.out;
                            var2_12 = new StringBuilder();
                            var3_13 = "\u2705 Translations saved to: ";
                            var2_12 = var2_12.append((String)var3_13);
                            var3_13 = var6_16.getAbsolutePath();
                            var2_12 = var2_12.append((String)var3_13);
                            var2_12 = var2_12.toString();
                            var1_1.println((String)var2_12);
                            try {
                                var5_15.close();
                                var4_14.close();
                                return;
                            }
                            catch (IOException var1_9) {}
                            catch (Throwable var1_2) {
                                var2_12 = var1_2;
                                break block83;
                            }
                            catch (IOException var1_3) {
                                break block84;
                            }
                        }
                        var3_13 = var5_15;
                        break block85;
                    }
                    var3_13 = var5_15;
                }
                var1_1.printStackTrace();
                if (var3_13 == null) break block89;
                var3_13.close();
            }
            if (var4_14 == null) return;
            var4_14.close();
            return;
            var1_9.printStackTrace();
            return;
            catch (Throwable var1_10) {
                var2_12 = var1_10;
            }
        }
        if (var3_13 != null) {
            var3_13.close();
        }
        if (var4_14 == null) throw var2_12;
        try {
            var4_14.close();
            throw var2_12;
        }
        catch (IOException var1_11) {}
        var1_11.printStackTrace();
        throw var2_12;
    }

    static /* synthetic */ int lambda$convertJsonToTxt$0(String object, String object2) {
        String string2 = ":";
        object = object.split(string2);
        object2 = object2.split(string2);
        String string3 = object[0];
        int n = Integer.parseInt(string3);
        string2 = object2[0];
        int n2 = Integer.parseInt(string2);
        int n3 = 1;
        String string4 = object[n3];
        int n4 = Integer.parseInt(string4);
        String string5 = object2[n3];
        n3 = Integer.parseInt(string5);
        int n5 = 2;
        object = object[n5];
        int n6 = Integer.parseInt((String)object);
        object2 = object2[n5];
        int n7 = Integer.parseInt((String)object2);
        if (n != n2) {
            return n - n2;
        }
        if (n4 != n3) {
            return n4 - n3;
        }
        return n6 - n7;
    }

    static /* synthetic */ Map lambda$convertJsonToTxt$1(String linkedHashMap) {
        linkedHashMap = new LinkedHashMap();
        return linkedHashMap;
    }
}

