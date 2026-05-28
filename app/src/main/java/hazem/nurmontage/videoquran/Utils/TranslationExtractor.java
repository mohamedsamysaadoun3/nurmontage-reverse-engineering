package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bumptech.glide.load.Key;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticBackport0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TranslationExtractor {
    public static void convertJsonToTxt(Context context, String textValue, String textValue2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(textValue), StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else {
                    sb.append(readLine);
                }
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            Collections.sort(arrayList, new Comparator() { // from class: hazem.nurmontage.videoquran.Utils.TranslationExtractor$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return TranslationExtractor.lambda$convertJsonToTxt$0((String) obj, (String) obj2);
                }
            });
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap hashMap = new HashMap();
            for (String textValue3 : arrayList) {
                String[] split = textValue3.split(":");
                String videoPath = split[0];
                String videoPath5 = split[1];
                int parseInt = Integer.parseInt(split[2]);
                String videoPath5 = videoPath + "|" + videoPath5;
                String string = jSONObject.getString(textValue3);
                if (!string.matches("\\(\\d+\\)") && !string.matches("\\d+")) {
                    ((Map) linkedHashMap.computeIfAbsent(videoPath5, new Function() { // from class: hazem.nurmontage.videoquran.Utils.TranslationExtractor$$ExternalSyntheticLambda2
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return TranslationExtractor.lambda$convertJsonToTxt$1((String) obj);
                        }
                    })).put(Integer.valueOf(parseInt), string);
                    hashMap.put(videoPath5, Integer.valueOf(Math.max(((Integer) hashMap.getOrDefault(videoPath5, 0)).intValue(), parseInt)));
                }
            }
            File file = new File(context.getExternalFilesDir(null), "QuranTranslations");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, textValue2);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), Key.STRING_CHARSET_NAME));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str7 = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                int intValue = ((Integer) hashMap.get(str7)).intValue();
                ArrayList arrayList2 = new ArrayList();
                for (int index = 1; index <= intValue; index++) {
                    arrayList2.add((String) map.getOrDefault(Integer.valueOf(value), "*"));
                }
                bufferedWriter.write(str7 + ProVersionActivity$$ExternalSyntheticBackport0.m586m(",", arrayList2));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            Log.d("JSON_TO_TXT", "Conversion completed. File saved: " + file2.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("JSON_TO_TXT", "Error: " + e.getMessage());
        }
    }

    static /* synthetic */ int lambda$convertJsonToTxt$0(String textValue, String textValue2) {
        String[] split = textValue.split(":");
        String[] split2 = textValue2.split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split2[0]);
        int parseInt3 = Integer.parseInt(split[1]);
        int parseInt4 = Integer.parseInt(split2[1]);
        return parseInt != parseInt2 ? parseInt - parseInt2 : parseInt3 != parseInt4 ? parseInt3 - parseInt4 : Integer.parseInt(split[2]) - Integer.parseInt(split2[2]);
    }

    static /* synthetic */ Map lambda$convertJsonToTxt$1(String textValue) {
        return new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0167 A[Catch: IOException -> 0x0163, TRY_LEAVE, TryCatch #3 {IOException -> 0x0163, blocks: (B:66:0x015f, B:57:0x0167), top: B:65:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void extractTranslationsBySurahAndAyah(Context context) {
        Throwable th;
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open("salamquran_quran_words.txt"), Key.STRING_CHARSET_NAME));
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "QuranTranslations");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, "translations.txt");
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), Key.STRING_CHARSET_NAME));
                    try {
                        Pattern compile = Pattern.compile("^\\(\\s*\\d+\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,.*'([^']*)'\\s*\\)$");
                        StringBuilder sb = new StringBuilder();
                        int value = -1;
                        int i2 = -1;
                        while (true) {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (trim.endsWith(",")) {
                                trim = trim.substring(0, trim.length() - 1);
                            }
                            Matcher matcher = compile.matcher(trim);
                            if (matcher.find()) {
                                int parseInt = Integer.parseInt(matcher.group(1));
                                int parseInt2 = Integer.parseInt(matcher.group(2));
                                String group = matcher.group(3);
                                if (value != -1 && i2 != -1 && (parseInt2 != value || parseInt != i2)) {
                                    bufferedWriter.write(value + "|" + i2 + sb.toString().replaceAll(",\\s+", ",").replaceAll(", $", ""));
                                    bufferedWriter.newLine();
                                    sb.setLength(0);
                                }
                                sb.append(group).append(", ");
                                i2 = parseInt;
                                value = parseInt2;
                            }
                        }
                        if (sb.length() > 0 && value != -1 && i2 != -1) {
                            bufferedWriter.write(value + "|" + i2 + " " + sb.toString().replaceAll(", $", ""));
                        }
                        bufferedWriter.flush();
                        System.out.println("✅ Translations saved to: " + file2.getAbsolutePath());
                        bufferedReader2.close();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        try {
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    throw th;
                                }
                            }
                            if (bufferedWriter == null) {
                                bufferedWriter.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                        }
                        if (bufferedWriter == null) {
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedWriter = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = null;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (IOException e5) {
            e = e5;
            bufferedWriter = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedWriter = null;
        }
    }
}
