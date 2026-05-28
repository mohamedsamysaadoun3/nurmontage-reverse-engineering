/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class QuranFileUtils {
    private static final String REPLACEMENT = "*";
    private static final String TARGET = "\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645\u0650";

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void counTPhraseFromAssetsToFilesDir(Context object, String object2) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.getAssets().open((String)object2);
        Object object3 = StandardCharsets.UTF_8;
        Object object4 = new InputStreamReader((InputStream)object, (Charset)object3);
        object2 = new BufferedReader((Reader)object4);
        while (true) {
            char c;
            block26: {
                object4 = ((BufferedReader)object2).readLine();
                if (object4 == null) break;
                object3 = "\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645";
                c = ((String)object4).contains((CharSequence)object3);
                if (c == '\u0000') break block26;
                object3 = "mLine";
                StringBuilder stringBuilder2 = new StringBuilder();
                String string2 = "";
                StringBuilder stringBuilder4 = stringBuilder2.append(string2);
                stringBuilder4 = stringBuilder4.append((String)object4);
                String string3 = stringBuilder4.toString();
                Log.e((String)object3, (String)string3);
            }
            object4 = stringBuilder.append((String)object4);
            c = '\n';
            ((StringBuilder)object4).append(c);
            continue;
            break;
        }
        ((BufferedReader)object2).close();
        return;
        catch (Throwable throwable) {
            try {
                ((BufferedReader)object2).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
                throw throwable;
            }
        }
        finally {
            if (object != null) {
                ((InputStream)object).close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static void replacePhraseFromAssetsToFilesDir(Context object, String object2, String object3) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object4 = object.getAssets();
        object2 = object4.open((String)object2);
        Charset charset = StandardCharsets.UTF_8;
        Object object5 = new InputStreamReader((InputStream)object2, charset);
        object4 = new BufferedReader((Reader)object5);
        try {
            while ((object5 = ((BufferedReader)object4).readLine()) != null) {
                object5 = stringBuilder.append((String)object5);
                char c = '\n';
                ((StringBuilder)object5).append(c);
            }
        }
        catch (Throwable throwable) {
            try {
                ((BufferedReader)object4).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
                throw throwable;
            }
        }
        ((BufferedReader)object4).close();
        object2 = stringBuilder.toString().replace(TARGET, REPLACEMENT);
        object = object.getFilesDir();
        File file = new File((File)object, (String)object3);
        object4 = new FileOutputStream(file);
        Charset charset2 = StandardCharsets.UTF_8;
        object3 = new OutputStreamWriter((OutputStream)object4, charset2);
        object = new BufferedWriter((Writer)object3);
        try {
            ((Writer)object).write((String)object2);
            return;
        }
        finally {
            if (object2 != null) {
                ((InputStream)object2).close();
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static void replacePhraseInFile(File object, File comparable) {
        Appendable appendable = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream((File)object);
        object = StandardCharsets.UTF_8;
        Closeable closeable = new InputStreamReader((InputStream)fileInputStream, (Charset)object);
        Closeable closeable2 = new BufferedReader((Reader)closeable);
        while (true) {
            char c;
            try {
                object = closeable2.readLine();
                if (object == null) break;
            }
            catch (Throwable throwable) {
                try {
                    closeable2.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            {
                object = ((StringBuilder)appendable).append((String)object);
                c = '\n';
            }
            {
                ((StringBuilder)object).append(c);
                continue;
            }
            break;
        }
        closeable2.close();
        object = ((StringBuilder)appendable).toString().replace(TARGET, REPLACEMENT);
        closeable = new FileOutputStream((File)comparable);
        comparable = StandardCharsets.UTF_8;
        closeable2 = new OutputStreamWriter((OutputStream)closeable, (Charset)comparable);
        appendable = new BufferedWriter((Writer)closeable2);
        try {
            ((Writer)appendable).write((String)object);
            return;
        }
        finally {
            ((BufferedWriter)appendable).close();
        }
    }
}

