// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.FileInputStream;
import java.io.Closeable;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.File;
import android.util.Log;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import android.content.Context;

public class QuranFileUtils
{
    private static final String REPLACEMENT = "*";
    private static final String TARGET = "\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645\u0650";
    
    public static void counTPhraseFromAssetsToFilesDir(Context open, String s) {
        final StringBuilder sb = new StringBuilder();
        open = (Context)open.getAssets().open(s);
        try {
            s = (String)new BufferedReader(new InputStreamReader((InputStream)open, StandardCharsets.UTF_8));
            try {
                while (true) {
                    final String line = ((BufferedReader)s).readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.contains("\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645")) {
                        Log.e("mLine", "" + line);
                    }
                    sb.append(line).append('\n');
                }
                ((BufferedReader)s).close();
                if (open != null) {
                    ((InputStream)open).close();
                }
            }
            finally {
                try {
                    ((BufferedReader)s).close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
        }
        finally {
            if (open != null) {
                try {
                    ((InputStream)open).close();
                }
                finally {
                    final Throwable exception2;
                    ((Throwable)s).addSuppressed(exception2);
                }
            }
        }
    }
    
    public static void replacePhraseFromAssetsToFilesDir(Context context, String s, final String child) {
        final StringBuilder sb = new StringBuilder();
        s = (String)context.getAssets().open(s);
        try {
            Closeable out = new BufferedReader(new InputStreamReader((InputStream)s, StandardCharsets.UTF_8));
            try {
                while (true) {
                    final String line = ((BufferedReader)out).readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line).append('\n');
                }
                ((BufferedReader)out).close();
                if (s != null) {
                    ((InputStream)s).close();
                }
                s = sb.toString().replace("\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645\u0650", "*");
                out = new FileOutputStream(new File(context.getFilesDir(), child));
                final BufferedWriter bufferedWriter;
                context = (Context)(bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)out, StandardCharsets.UTF_8)));
                try {
                    bufferedWriter.write(s);
                    ((BufferedWriter)context).close();
                }
                finally {
                    try {
                        ((BufferedWriter)context).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)s).addSuppressed(exception);
                    }
                }
            }
            finally {
                try {
                    ((BufferedReader)out).close();
                }
                finally {
                    final Throwable exception2;
                    ((Throwable)context).addSuppressed(exception2);
                }
            }
        }
        finally {
            if (s != null) {
                try {
                    ((InputStream)s).close();
                }
                finally {
                    final Throwable exception3;
                    ((Throwable)context).addSuppressed(exception3);
                }
            }
        }
    }
    
    public static void replacePhraseInFile(final File file, final File file2) {
        final StringBuilder sb = new StringBuilder();
        Closeable out = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        try {
            while (true) {
                final String line = ((BufferedReader)out).readLine();
                if (line == null) {
                    break;
                }
                sb.append(line).append('\n');
            }
            ((BufferedReader)out).close();
            final String replace = sb.toString().replace("\u0628\u0651\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064e\u0647\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0652\u0645\u064e\u0640\u0670\u0646\u0650 \u0627\u0644\u0631\u0651\u064e\u062d\u0650\u064a\u0645\u0650", "*");
            out = new OutputStreamWriter(new FileOutputStream(file2), StandardCharsets.UTF_8);
            final BufferedWriter bufferedWriter2;
            final BufferedWriter bufferedWriter = bufferedWriter2 = new BufferedWriter((Writer)out);
            try {
                bufferedWriter2.write(replace);
                bufferedWriter.close();
            }
            finally {
                try {
                    bufferedWriter.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)file).addSuppressed(exception);
                }
            }
        }
        finally {
            try {
                ((BufferedReader)out).close();
            }
            finally {
                final Throwable exception2;
                ((Throwable)file).addSuppressed(exception2);
            }
        }
    }
}
