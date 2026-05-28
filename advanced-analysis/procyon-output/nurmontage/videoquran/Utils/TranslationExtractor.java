// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Set;
import java.util.Iterator;
import java.io.InputStream;
import android.util.Log;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticBackport0;
import java.io.Writer;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Map;
import java.util.function.Function;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.json.JSONObject;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import android.content.Context;

public class TranslationExtractor
{
    public static void convertJsonToTxt(final Context context, String string, String str) {
        final String s = "JSON_TO_TXT";
        try {
            final InputStream open = context.getAssets().open(string);
            try {
                final BufferedReader bufferedReader = new(java.io.BufferedReader.class)();
                try {
                    try {
                        final InputStreamReader in = new InputStreamReader(open, StandardCharsets.UTF_8);
                        final BufferedReader bufferedReader2 = bufferedReader;
                        try {
                            new BufferedReader(in);
                            try {
                                final StringBuilder sb = new StringBuilder();
                                while (true) {
                                    final String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    sb.append(line);
                                }
                                bufferedReader.close();
                                try {
                                    string = sb.toString();
                                    final JSONObject jsonObject = new JSONObject(string);
                                    try {
                                        final ArrayList list = new ArrayList();
                                        final Iterator keys = jsonObject.keys();
                                        try {
                                            while (true) {
                                                Label_0154: {
                                                    if (!keys.hasNext()) {
                                                        break Label_0154;
                                                    }
                                                    final Object next = keys.next();
                                                    try {
                                                        list.add(next);
                                                        continue;
                                                        try {
                                                            final TranslationExtractor$$ExternalSyntheticLambda1 c = new TranslationExtractor$$ExternalSyntheticLambda1();
                                                            final ArrayList list2 = list;
                                                            try {
                                                                Collections.sort((List<Object>)list2, c);
                                                                try {
                                                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                    try {
                                                                        final HashMap hashMap = new HashMap();
                                                                        final Iterator iterator = list.iterator();
                                                                        try {
                                                                            while (true) {
                                                                                final boolean hasNext = iterator.hasNext();
                                                                                final int n = 1;
                                                                                Label_0483: {
                                                                                    if (!hasNext) {
                                                                                        break Label_0483;
                                                                                    }
                                                                                    final Object next2 = iterator.next();
                                                                                    try {
                                                                                        final String s2 = (String)next2;
                                                                                        final String[] split = s2.split(":");
                                                                                        final String str2 = split[0];
                                                                                        final String str3 = split[n];
                                                                                        final String s3 = split[2];
                                                                                        try {
                                                                                            final int int1 = Integer.parseInt(s3);
                                                                                            try {
                                                                                                try {
                                                                                                    final StringBuilder sb2 = new StringBuilder();
                                                                                                    try {
                                                                                                        final StringBuilder append = sb2.append(str2).append("|").append(str3);
                                                                                                        try {
                                                                                                            final String string2 = append.toString();
                                                                                                            final String string3 = jsonObject.getString(s2);
                                                                                                            if (string3.matches("\\(\\d+\\)")) {
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (string3.matches("\\d+")) {
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                final Object computeIfAbsent = linkedHashMap.computeIfAbsent(string2, new TranslationExtractor$$ExternalSyntheticLambda2());
                                                                                                                try {
                                                                                                                    final Map map = (Map)computeIfAbsent;
                                                                                                                    try {
                                                                                                                        map.put(int1, string3);
                                                                                                                        final Object orDefault = hashMap.getOrDefault(string2, 0);
                                                                                                                        try {
                                                                                                                            final Integer n2 = (Integer)orDefault;
                                                                                                                            try {
                                                                                                                                final int max = Math.max(n2, int1);
                                                                                                                                try {
                                                                                                                                    hashMap.put(string2, max);
                                                                                                                                    continue;
                                                                                                                                    final File parent = new File(context.getExternalFilesDir((String)null), "QuranTranslations");
                                                                                                                                    iftrue(Label_0526:)(parent.exists());
                                                                                                                                    parent.mkdirs();
                                                                                                                                    final File file;
                                                                                                                                    Label_0526: {
                                                                                                                                        file = new File(parent, str);
                                                                                                                                    }
                                                                                                                                    final BufferedWriter bufferedWriter = new(java.io.BufferedWriter.class)();
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            final OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
                                                                                                                                            final BufferedWriter bufferedWriter2 = bufferedWriter;
                                                                                                                                            try {
                                                                                                                                                new BufferedWriter(out);
                                                                                                                                                final Set entrySet = linkedHashMap.entrySet();
                                                                                                                                                try {
                                                                                                                                                    final Iterator iterator2 = entrySet.iterator();
                                                                                                                                                    try {
                                                                                                                                                        Label_0587:
                                                                                                                                                        while (true) {
                                                                                                                                                            Label_0804: {
                                                                                                                                                                if (!iterator2.hasNext()) {
                                                                                                                                                                    break Label_0804;
                                                                                                                                                                }
                                                                                                                                                                final Object next3 = iterator2.next();
                                                                                                                                                                try {
                                                                                                                                                                    final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)next3;
                                                                                                                                                                    try {
                                                                                                                                                                        final String key = entry.getKey();
                                                                                                                                                                        try {
                                                                                                                                                                            final String str4 = key;
                                                                                                                                                                            try {
                                                                                                                                                                                final V value = entry.getValue();
                                                                                                                                                                                try {
                                                                                                                                                                                    final Map map2 = (Map)value;
                                                                                                                                                                                    final Object value2 = hashMap.get(str4);
                                                                                                                                                                                    try {
                                                                                                                                                                                        final Integer n3 = (Integer)value2;
                                                                                                                                                                                        try {
                                                                                                                                                                                            final int intValue = n3;
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    final ArrayList list3 = new ArrayList();
                                                                                                                                                                                                    int i = n;
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        Label_0743: {
                                                                                                                                                                                                            if (i > intValue) {
                                                                                                                                                                                                                break Label_0743;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            final String orDefault2 = map2.getOrDefault(i, "*");
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                list3.add(orDefault2);
                                                                                                                                                                                                                ++i;
                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    final StringBuilder sb3 = new StringBuilder();
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        final StringBuilder append2 = sb3.append(str4).append(ProVersionActivity$$ExternalSyntheticBackport0.m(",", list3));
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            bufferedWriter.write(append2.toString());
                                                                                                                                                                                                                            bufferedWriter.newLine();
                                                                                                                                                                                                                            continue Label_0587;
                                                                                                                                                                                                                            bufferedWriter.close();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                final StringBuilder sb4 = new StringBuilder();
                                                                                                                                                                                                                                str = "Conversion completed. File saved: ";
                                                                                                                                                                                                                                final StringBuilder append3 = sb4.append(str);
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    final StringBuilder append4 = append3.append(file.getAbsolutePath());
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        Log.d(s, append4.toString());
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (final Exception ex) {
                                                                                                                                                                                                                                        ex.printStackTrace();
                                                                                                                                                                                                                                        str = "Error: ";
                                                                                                                                                                                                                                        Log.e(s, str + ex.getMessage());
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
                                                                                                                                                                                                            catch (final Exception ex7) {}
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (final Exception ex8) {}
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (final Exception ex9) {}
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (final Exception ex10) {}
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final Exception ex11) {}
                                                                                                                                                                                }
                                                                                                                                                                                catch (final Exception ex12) {}
                                                                                                                                                                            }
                                                                                                                                                                            catch (final Exception ex13) {}
                                                                                                                                                                        }
                                                                                                                                                                        catch (final Exception ex14) {}
                                                                                                                                                                    }
                                                                                                                                                                    catch (final Exception ex15) {}
                                                                                                                                                                }
                                                                                                                                                                catch (final Exception ex16) {}
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    catch (final Exception ex17) {}
                                                                                                                                                }
                                                                                                                                                catch (final Exception ex18) {}
                                                                                                                                            }
                                                                                                                                            catch (final Exception ex19) {}
                                                                                                                                        }
                                                                                                                                        catch (final Exception ex20) {}
                                                                                                                                    }
                                                                                                                                    catch (final Exception ex21) {}
                                                                                                                                }
                                                                                                                                catch (final Exception ex22) {}
                                                                                                                            }
                                                                                                                            catch (final Exception ex23) {}
                                                                                                                        }
                                                                                                                        catch (final Exception ex24) {}
                                                                                                                    }
                                                                                                                    catch (final Exception ex25) {}
                                                                                                                }
                                                                                                                catch (final Exception ex26) {}
                                                                                                            }
                                                                                                            catch (final Exception ex27) {}
                                                                                                        }
                                                                                                        catch (final Exception ex28) {}
                                                                                                    }
                                                                                                    catch (final Exception ex29) {}
                                                                                                }
                                                                                                catch (final Exception ex30) {}
                                                                                            }
                                                                                            catch (final Exception ex31) {}
                                                                                        }
                                                                                        catch (final Exception ex32) {}
                                                                                    }
                                                                                    catch (final Exception ex33) {}
                                                                                }
                                                                            }
                                                                        }
                                                                        catch (final Exception ex34) {}
                                                                    }
                                                                    catch (final Exception ex35) {}
                                                                }
                                                                catch (final Exception ex36) {}
                                                            }
                                                            catch (final Exception ex37) {}
                                                        }
                                                        catch (final Exception ex38) {}
                                                    }
                                                    catch (final Exception ex39) {}
                                                }
                                            }
                                        }
                                        catch (final Exception ex40) {}
                                    }
                                    catch (final Exception ex41) {}
                                }
                                catch (final Exception ex42) {}
                            }
                            catch (final Exception ex43) {}
                        }
                        catch (final Exception ex44) {}
                    }
                    catch (final Exception ex45) {}
                }
                catch (final Exception ex46) {}
            }
            catch (final Exception ex47) {}
        }
        catch (final Exception ex48) {}
    }
    
    public static void extractTranslationsBySurahAndAyah(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_1       
        //     3: ldc             "UTF-8"
        //     5: astore_2       
        //     6: aconst_null    
        //     7: astore_3       
        //     8: aload_0        
        //     9: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    12: astore          4
        //    14: ldc_w           "salamquran_quran_words.txt"
        //    17: astore          5
        //    19: aload           4
        //    21: aload           5
        //    23: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //    26: astore          4
        //    28: new             Ljava/io/BufferedReader;
        //    31: astore          5
        //    33: new             Ljava/io/InputStreamReader;
        //    36: astore          6
        //    38: aload           6
        //    40: aload           4
        //    42: aload_2        
        //    43: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    46: aload           5
        //    48: aload           6
        //    50: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    53: new             Ljava/io/File;
        //    56: astore          4
        //    58: invokestatic    android/os/Environment.getExternalStorageDirectory:()Ljava/io/File;
        //    61: astore          6
        //    63: ldc             "QuranTranslations"
        //    65: astore          7
        //    67: aload           4
        //    69: aload           6
        //    71: aload           7
        //    73: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    76: aload           4
        //    78: invokevirtual   java/io/File.exists:()Z
        //    81: istore          8
        //    83: iload           8
        //    85: ifne            94
        //    88: aload           4
        //    90: invokevirtual   java/io/File.mkdirs:()Z
        //    93: pop            
        //    94: new             Ljava/io/File;
        //    97: astore          6
        //    99: ldc_w           "translations.txt"
        //   102: astore          7
        //   104: aload           6
        //   106: aload           4
        //   108: aload           7
        //   110: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   113: new             Ljava/io/BufferedWriter;
        //   116: astore          4
        //   118: new             Ljava/io/OutputStreamWriter;
        //   121: astore          7
        //   123: new             Ljava/io/FileOutputStream;
        //   126: astore          9
        //   128: aload           9
        //   130: aload           6
        //   132: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   135: aload           7
        //   137: aload           9
        //   139: aload_2        
        //   140: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //   143: aload           4
        //   145: aload           7
        //   147: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //   150: ldc_w           "^\\(\\s*\\d+\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,.*'([^']*)'\\s*\\)$"
        //   153: astore_2       
        //   154: aload_2        
        //   155: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   158: astore_2       
        //   159: new             Ljava/lang/StringBuilder;
        //   162: astore_3       
        //   163: aload_3        
        //   164: invokespecial   java/lang/StringBuilder.<init>:()V
        //   167: iconst_m1      
        //   168: istore          10
        //   170: iload           10
        //   172: istore          11
        //   174: iload           10
        //   176: istore          12
        //   178: aload           5
        //   180: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   183: astore          13
        //   185: ldc_w           ""
        //   188: astore          14
        //   190: ldc_w           ", $"
        //   193: astore          15
        //   195: ldc             "|"
        //   197: astore          16
        //   199: aload           13
        //   201: ifnull          488
        //   204: aload           13
        //   206: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   209: astore          13
        //   211: aload           13
        //   213: aload_1        
        //   214: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   217: istore          17
        //   219: iconst_1       
        //   220: istore          18
        //   222: iconst_0       
        //   223: istore          19
        //   225: aconst_null    
        //   226: astore          20
        //   228: iload           17
        //   230: ifeq            253
        //   233: aload           13
        //   235: invokevirtual   java/lang/String.length:()I
        //   238: iload           18
        //   240: isub           
        //   241: istore          17
        //   243: aload           13
        //   245: iconst_0       
        //   246: iload           17
        //   248: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   251: astore          13
        //   253: aload_2        
        //   254: aload           13
        //   256: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   259: astore          13
        //   261: aload           13
        //   263: invokevirtual   java/util/regex/Matcher.find:()Z
        //   266: istore          17
        //   268: iload           17
        //   270: ifeq            178
        //   273: aload           13
        //   275: iload           18
        //   277: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   280: astore          21
        //   282: aload           21
        //   284: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   287: istore          17
        //   289: iconst_2       
        //   290: istore          18
        //   292: aload           13
        //   294: iload           18
        //   296: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   299: astore          22
        //   301: aload           22
        //   303: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   306: istore          18
        //   308: iconst_3       
        //   309: istore          19
        //   311: aload           13
        //   313: iload           19
        //   315: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   318: astore          13
        //   320: iload           11
        //   322: iload           10
        //   324: if_icmpeq       456
        //   327: iload           12
        //   329: iload           10
        //   331: if_icmpeq       456
        //   334: iload           18
        //   336: iload           11
        //   338: if_icmpne       348
        //   341: iload           17
        //   343: iload           12
        //   345: if_icmpeq       456
        //   348: new             Ljava/lang/StringBuilder;
        //   351: astore          20
        //   353: aload           20
        //   355: invokespecial   java/lang/StringBuilder.<init>:()V
        //   358: aload           20
        //   360: iload           11
        //   362: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   365: astore          9
        //   367: aload           9
        //   369: aload           16
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: astore          9
        //   376: aload           9
        //   378: iload           12
        //   380: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   383: astore          9
        //   385: aload_3        
        //   386: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   389: astore          23
        //   391: ldc_w           ",\\s+"
        //   394: astore          16
        //   396: aload           23
        //   398: aload           16
        //   400: aload_1        
        //   401: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   404: astore          23
        //   406: aload           23
        //   408: aload           15
        //   410: aload           14
        //   412: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   415: astore          23
        //   417: aload           9
        //   419: aload           23
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: astore          9
        //   426: aload           9
        //   428: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   431: astore          9
        //   433: aload           4
        //   435: aload           9
        //   437: invokevirtual   java/io/BufferedWriter.write:(Ljava/lang/String;)V
        //   440: aload           4
        //   442: invokevirtual   java/io/BufferedWriter.newLine:()V
        //   445: iconst_0       
        //   446: istore          11
        //   448: aconst_null    
        //   449: astore          9
        //   451: aload_3        
        //   452: iconst_0       
        //   453: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //   456: aload_3        
        //   457: aload           13
        //   459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   462: astore          9
        //   464: ldc_w           ", "
        //   467: astore          23
        //   469: aload           9
        //   471: aload           23
        //   473: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   476: pop            
        //   477: iload           17
        //   479: istore          12
        //   481: iload           18
        //   483: istore          11
        //   485: goto            178
        //   488: aload_3        
        //   489: invokevirtual   java/lang/StringBuilder.length:()I
        //   492: istore          24
        //   494: iload           24
        //   496: ifle            583
        //   499: iload           11
        //   501: iload           10
        //   503: if_icmpeq       583
        //   506: iload           12
        //   508: iload           10
        //   510: if_icmpeq       583
        //   513: new             Ljava/lang/StringBuilder;
        //   516: astore_1       
        //   517: aload_1        
        //   518: invokespecial   java/lang/StringBuilder.<init>:()V
        //   521: aload_1        
        //   522: iload           11
        //   524: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   527: astore_1       
        //   528: aload_1        
        //   529: aload           16
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: astore_1       
        //   535: aload_1        
        //   536: iload           12
        //   538: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   541: astore_1       
        //   542: ldc_w           " "
        //   545: astore_2       
        //   546: aload_1        
        //   547: aload_2        
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: astore_1       
        //   552: aload_3        
        //   553: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   556: astore_2       
        //   557: aload_2        
        //   558: aload           15
        //   560: aload           14
        //   562: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   565: astore_2       
        //   566: aload_1        
        //   567: aload_2        
        //   568: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   571: astore_1       
        //   572: aload_1        
        //   573: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   576: astore_1       
        //   577: aload           4
        //   579: aload_1        
        //   580: invokevirtual   java/io/BufferedWriter.write:(Ljava/lang/String;)V
        //   583: aload           4
        //   585: invokevirtual   java/io/BufferedWriter.flush:()V
        //   588: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   591: astore_1       
        //   592: new             Ljava/lang/StringBuilder;
        //   595: astore_2       
        //   596: aload_2        
        //   597: invokespecial   java/lang/StringBuilder.<init>:()V
        //   600: ldc_w           "\u2705 Translations saved to: "
        //   603: astore_3       
        //   604: aload_2        
        //   605: aload_3        
        //   606: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   609: astore_2       
        //   610: aload           6
        //   612: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   615: astore_3       
        //   616: aload_2        
        //   617: aload_3        
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: astore_2       
        //   622: aload_2        
        //   623: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   626: astore_2       
        //   627: aload_1        
        //   628: aload_2        
        //   629: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   632: aload           5
        //   634: invokevirtual   java/io/BufferedReader.close:()V
        //   637: aload           4
        //   639: invokevirtual   java/io/BufferedWriter.close:()V
        //   642: goto            726
        //   645: astore_1       
        //   646: aload_1        
        //   647: astore_2       
        //   648: goto            661
        //   651: astore_1       
        //   652: goto            671
        //   655: astore_1       
        //   656: aload_1        
        //   657: astore_2       
        //   658: aconst_null    
        //   659: astore          4
        //   661: aload           5
        //   663: astore_3       
        //   664: goto            730
        //   667: astore_1       
        //   668: aconst_null    
        //   669: astore          4
        //   671: aload           5
        //   673: astore_3       
        //   674: goto            690
        //   677: astore_1       
        //   678: aload_1        
        //   679: astore_2       
        //   680: aconst_null    
        //   681: astore          4
        //   683: goto            730
        //   686: astore_1       
        //   687: aconst_null    
        //   688: astore          4
        //   690: aload_1        
        //   691: invokevirtual   java/io/IOException.printStackTrace:()V
        //   694: aload_3        
        //   695: ifnull          709
        //   698: aload_3        
        //   699: invokevirtual   java/io/BufferedReader.close:()V
        //   702: goto            709
        //   705: astore_1       
        //   706: goto            722
        //   709: aload           4
        //   711: ifnull          726
        //   714: aload           4
        //   716: invokevirtual   java/io/BufferedWriter.close:()V
        //   719: goto            726
        //   722: aload_1        
        //   723: invokevirtual   java/io/IOException.printStackTrace:()V
        //   726: return         
        //   727: astore_1       
        //   728: aload_1        
        //   729: astore_2       
        //   730: aload_3        
        //   731: ifnull          745
        //   734: aload_3        
        //   735: invokevirtual   java/io/BufferedReader.close:()V
        //   738: goto            745
        //   741: astore_1       
        //   742: goto            758
        //   745: aload           4
        //   747: ifnull          762
        //   750: aload           4
        //   752: invokevirtual   java/io/BufferedWriter.close:()V
        //   755: goto            762
        //   758: aload_1        
        //   759: invokevirtual   java/io/IOException.printStackTrace:()V
        //   762: aload_2        
        //   763: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      12     686    690    Ljava/io/IOException;
        //  8      12     677    686    Any
        //  21     26     686    690    Ljava/io/IOException;
        //  21     26     677    686    Any
        //  28     31     686    690    Ljava/io/IOException;
        //  28     31     677    686    Any
        //  33     36     686    690    Ljava/io/IOException;
        //  33     36     677    686    Any
        //  42     46     686    690    Ljava/io/IOException;
        //  42     46     677    686    Any
        //  48     53     686    690    Ljava/io/IOException;
        //  48     53     677    686    Any
        //  53     56     667    671    Ljava/io/IOException;
        //  53     56     655    661    Any
        //  58     61     667    671    Ljava/io/IOException;
        //  58     61     655    661    Any
        //  71     76     667    671    Ljava/io/IOException;
        //  71     76     655    661    Any
        //  76     81     667    671    Ljava/io/IOException;
        //  76     81     655    661    Any
        //  88     94     667    671    Ljava/io/IOException;
        //  88     94     655    661    Any
        //  94     97     667    671    Ljava/io/IOException;
        //  94     97     655    661    Any
        //  108    113    667    671    Ljava/io/IOException;
        //  108    113    655    661    Any
        //  113    116    667    671    Ljava/io/IOException;
        //  113    116    655    661    Any
        //  118    121    667    671    Ljava/io/IOException;
        //  118    121    655    661    Any
        //  123    126    667    671    Ljava/io/IOException;
        //  123    126    655    661    Any
        //  130    135    667    671    Ljava/io/IOException;
        //  130    135    655    661    Any
        //  139    143    667    671    Ljava/io/IOException;
        //  139    143    655    661    Any
        //  145    150    667    671    Ljava/io/IOException;
        //  145    150    655    661    Any
        //  154    158    651    655    Ljava/io/IOException;
        //  154    158    645    651    Any
        //  159    162    651    655    Ljava/io/IOException;
        //  159    162    645    651    Any
        //  163    167    651    655    Ljava/io/IOException;
        //  163    167    645    651    Any
        //  178    183    651    655    Ljava/io/IOException;
        //  178    183    645    651    Any
        //  204    209    651    655    Ljava/io/IOException;
        //  204    209    645    651    Any
        //  213    217    651    655    Ljava/io/IOException;
        //  213    217    645    651    Any
        //  233    238    651    655    Ljava/io/IOException;
        //  233    238    645    651    Any
        //  246    251    651    655    Ljava/io/IOException;
        //  246    251    645    651    Any
        //  254    259    651    655    Ljava/io/IOException;
        //  254    259    645    651    Any
        //  261    266    651    655    Ljava/io/IOException;
        //  261    266    645    651    Any
        //  275    280    651    655    Ljava/io/IOException;
        //  275    280    645    651    Any
        //  282    287    651    655    Ljava/io/IOException;
        //  282    287    645    651    Any
        //  294    299    651    655    Ljava/io/IOException;
        //  294    299    645    651    Any
        //  301    306    651    655    Ljava/io/IOException;
        //  301    306    645    651    Any
        //  313    318    651    655    Ljava/io/IOException;
        //  313    318    645    651    Any
        //  348    351    651    655    Ljava/io/IOException;
        //  348    351    645    651    Any
        //  353    358    651    655    Ljava/io/IOException;
        //  353    358    645    651    Any
        //  360    365    651    655    Ljava/io/IOException;
        //  360    365    645    651    Any
        //  369    374    651    655    Ljava/io/IOException;
        //  369    374    645    651    Any
        //  378    383    651    655    Ljava/io/IOException;
        //  378    383    645    651    Any
        //  385    389    651    655    Ljava/io/IOException;
        //  385    389    645    651    Any
        //  400    404    651    655    Ljava/io/IOException;
        //  400    404    645    651    Any
        //  410    415    651    655    Ljava/io/IOException;
        //  410    415    645    651    Any
        //  419    424    651    655    Ljava/io/IOException;
        //  419    424    645    651    Any
        //  426    431    651    655    Ljava/io/IOException;
        //  426    431    645    651    Any
        //  435    440    651    655    Ljava/io/IOException;
        //  435    440    645    651    Any
        //  440    445    651    655    Ljava/io/IOException;
        //  440    445    645    651    Any
        //  452    456    651    655    Ljava/io/IOException;
        //  452    456    645    651    Any
        //  457    462    651    655    Ljava/io/IOException;
        //  457    462    645    651    Any
        //  471    477    651    655    Ljava/io/IOException;
        //  471    477    645    651    Any
        //  488    492    651    655    Ljava/io/IOException;
        //  488    492    645    651    Any
        //  513    516    651    655    Ljava/io/IOException;
        //  513    516    645    651    Any
        //  517    521    651    655    Ljava/io/IOException;
        //  517    521    645    651    Any
        //  522    527    651    655    Ljava/io/IOException;
        //  522    527    645    651    Any
        //  529    534    651    655    Ljava/io/IOException;
        //  529    534    645    651    Any
        //  536    541    651    655    Ljava/io/IOException;
        //  536    541    645    651    Any
        //  547    551    651    655    Ljava/io/IOException;
        //  547    551    645    651    Any
        //  552    556    651    655    Ljava/io/IOException;
        //  552    556    645    651    Any
        //  560    565    651    655    Ljava/io/IOException;
        //  560    565    645    651    Any
        //  567    571    651    655    Ljava/io/IOException;
        //  567    571    645    651    Any
        //  572    576    651    655    Ljava/io/IOException;
        //  572    576    645    651    Any
        //  579    583    651    655    Ljava/io/IOException;
        //  579    583    645    651    Any
        //  583    588    651    655    Ljava/io/IOException;
        //  583    588    645    651    Any
        //  588    591    651    655    Ljava/io/IOException;
        //  588    591    645    651    Any
        //  592    595    651    655    Ljava/io/IOException;
        //  592    595    645    651    Any
        //  596    600    651    655    Ljava/io/IOException;
        //  596    600    645    651    Any
        //  605    609    651    655    Ljava/io/IOException;
        //  605    609    645    651    Any
        //  610    615    651    655    Ljava/io/IOException;
        //  610    615    645    651    Any
        //  617    621    651    655    Ljava/io/IOException;
        //  617    621    645    651    Any
        //  622    626    651    655    Ljava/io/IOException;
        //  622    626    645    651    Any
        //  628    632    651    655    Ljava/io/IOException;
        //  628    632    645    651    Any
        //  632    637    705    709    Ljava/io/IOException;
        //  637    642    705    709    Ljava/io/IOException;
        //  690    694    727    730    Any
        //  698    702    705    709    Ljava/io/IOException;
        //  714    719    705    709    Ljava/io/IOException;
        //  734    738    741    745    Ljava/io/IOException;
        //  750    755    741    745    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0671:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
