// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import hazem.nurmontage.videoquran.model.Template;
import java.util.Iterator;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;
import java.io.FileOutputStream;
import java.io.File;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

class EngineActivity$66 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ List val$pathes;
    
    EngineActivity$66(final EngineActivity this$0, final List val$pathes, final int val$index, final String val$path_video) {
        this.this$0 = this$0;
        this.val$pathes = val$pathes;
        this.val$index = val$index;
        this.val$path_video = val$path_video;
    }
    
    public void run() {
        final String s = "0:a";
        final String s2 = "-map";
        final String s3 = "-f";
        try {
            try {
                final ArrayList list = new ArrayList();
                try {
                    final ArrayList list2 = new ArrayList();
                    try {
                        final StringBuilder sb = new StringBuilder();
                        final List val$pathes = this.val$pathes;
                        try {
                            final Iterator iterator = val$pathes.iterator();
                            int n = 0;
                            while (true) {
                                Label_0305: {
                                    if (!iterator.hasNext()) {
                                        break Label_0305;
                                    }
                                    final Object next = iterator.next();
                                    try {
                                        final String s4 = (String)next;
                                        try {
                                            final Uri parse = Uri.parse(s4);
                                            try {
                                                final String string = parse.toString();
                                                Label_0177: {
                                                    if (string.startsWith("http://") || string.startsWith("https://")) {
                                                        break Label_0177;
                                                    }
                                                    final EngineActivity this$0 = this.this$0;
                                                    try {
                                                        final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$0);
                                                        try {
                                                            String s5 = AudioUtils.copyFromUri((Context)this$0, parse, -$$Nest$fgetmTemplate.getFolder_template());
                                                            Label_0208: {
                                                                break Label_0208;
                                                                final EngineActivity this$2 = this.this$0;
                                                                try {
                                                                    final Template -$$Nest$fgetmTemplate2 = EngineActivity.-$$Nest$fgetmTemplate(this$2);
                                                                    try {
                                                                        s5 = AudioUtils.downloadFile((Context)this$2, string, -$$Nest$fgetmTemplate2.getFolder_template());
                                                                        if (s5 == null) {
                                                                            continue;
                                                                        }
                                                                        sb.append("file '").append(s5.replace("'", "\\'")).append("'\n");
                                                                        ++n;
                                                                        final EngineActivity this$3 = this.this$0;
                                                                        try {
                                                                            final List val$pathes2 = this.val$pathes;
                                                                            try {
                                                                                EngineActivity.-$$Nest$mupdateProgress(this$3, n, val$pathes2.size());
                                                                                continue;
                                                                                try {
                                                                                    final EngineActivity this$4 = this.this$0;
                                                                                    try {
                                                                                        final Template -$$Nest$fgetmTemplate3 = EngineActivity.-$$Nest$fgetmTemplate(this$4);
                                                                                        try {
                                                                                            final File file = new File(-$$Nest$fgetmTemplate3.getFolder_template(), "concat.txt");
                                                                                            final FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                                                            final String string2 = sb.toString();
                                                                                            try {
                                                                                                fileOutputStream.write(string2.getBytes());
                                                                                                fileOutputStream.close();
                                                                                                try {
                                                                                                    final EngineActivity this$5 = this.this$0;
                                                                                                    try {
                                                                                                        final Template -$$Nest$fgetmTemplate4 = EngineActivity.-$$Nest$fgetmTemplate(this$5);
                                                                                                        try {
                                                                                                            final String folder_template = -$$Nest$fgetmTemplate4.getFolder_template();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    final StringBuilder append = new StringBuilder().append(System.currentTimeMillis()).append("_output.mp3");
                                                                                                                    try {
                                                                                                                        final File file2 = new File(folder_template, append.toString());
                                                                                                                        try {
                                                                                                                            final EngineActivity this$6 = this.this$0;
                                                                                                                            try {
                                                                                                                                final Template -$$Nest$fgetmTemplate5 = EngineActivity.-$$Nest$fgetmTemplate(this$6);
                                                                                                                                try {
                                                                                                                                    final String folder_template2 = -$$Nest$fgetmTemplate5.getFolder_template();
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            final StringBuilder append2 = new StringBuilder().append(System.currentTimeMillis()).append("_output.pcm");
                                                                                                                                            try {
                                                                                                                                                final File file3 = new File(folder_template2, append2.toString());
                                                                                                                                                try {
                                                                                                                                                    final ArrayList list4;
                                                                                                                                                    final ArrayList list3 = list4 = new ArrayList();
                                                                                                                                                    try {
                                                                                                                                                        list4.add(s3);
                                                                                                                                                        list3.add("concat");
                                                                                                                                                        list3.add("-safe");
                                                                                                                                                        list3.add("0");
                                                                                                                                                        list3.add("-i");
                                                                                                                                                        list3.add(file.getAbsolutePath());
                                                                                                                                                        final ArrayList list5 = list3;
                                                                                                                                                        try {
                                                                                                                                                            list5.add(s2);
                                                                                                                                                            final ArrayList list6 = list3;
                                                                                                                                                            try {
                                                                                                                                                                list6.add(s);
                                                                                                                                                                list3.add("-c");
                                                                                                                                                                list3.add("copy");
                                                                                                                                                                list3.add(file2.getAbsolutePath());
                                                                                                                                                                final ArrayList list7 = list3;
                                                                                                                                                                try {
                                                                                                                                                                    list7.add(s2);
                                                                                                                                                                    final ArrayList list8 = list3;
                                                                                                                                                                    try {
                                                                                                                                                                        list8.add(s);
                                                                                                                                                                        list3.add("-ac");
                                                                                                                                                                        list3.add("1");
                                                                                                                                                                        list3.add("-ar");
                                                                                                                                                                        list3.add("44100");
                                                                                                                                                                        final ArrayList list9 = list3;
                                                                                                                                                                        try {
                                                                                                                                                                            list9.add(s3);
                                                                                                                                                                            list3.add("s16le");
                                                                                                                                                                            list3.add(file3.getAbsolutePath());
                                                                                                                                                                            list3.add("-y");
                                                                                                                                                                            final Object[] array = list3.toArray(new String[0]);
                                                                                                                                                                            try {
                                                                                                                                                                                final String[] array2 = (String[])array;
                                                                                                                                                                                try {
                                                                                                                                                                                    final EngineActivity this$7 = this.this$0;
                                                                                                                                                                                    try {
                                                                                                                                                                                        final List -$$Nest$fgetid_ffmpeg = EngineActivity.-$$Nest$fgetid_ffmpeg(this$7);
                                                                                                                                                                                        try {
                                                                                                                                                                                            final EngineActivity$66$1 engineActivity$66$1 = new EngineActivity$66$1(this, file2, file3);
                                                                                                                                                                                            final String[] array3 = array2;
                                                                                                                                                                                            try {
                                                                                                                                                                                                final FFmpegSession executeWithArgumentsAsync = FFmpegKit.executeWithArgumentsAsync(array3, (FFmpegSessionCompleteCallback)engineActivity$66$1);
                                                                                                                                                                                                try {
                                                                                                                                                                                                    final long sessionId = executeWithArgumentsAsync.getSessionId();
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        -$$Nest$fgetid_ffmpeg.add(sessionId);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception ex) {
                                                                                                                                                                                                        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
                                                                                                                                                                                                        EngineActivity.-$$Nest$mhideFragment(this.this$0);
                                                                                                                                                                                                        ex.printStackTrace();
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
                                                                catch (final Exception ex34) {}
                                                            }
                                                        }
                                                        catch (final Exception ex35) {}
                                                    }
                                                    catch (final Exception ex36) {}
                                                }
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
}
