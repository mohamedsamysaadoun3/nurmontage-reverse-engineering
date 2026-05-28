package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p006io.CloseableKt;
import kotlin.p006io.TextStreamsKt;

/* compiled from: WebViewYouTubePlayer.kt */
@Metadata(m667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m668d2 = {"readHTMLFromUTF8File", "", "inputStream", "Ljava/io/InputStream;", "core_release"}, m669k = 2, m670mv = {1, 8, 0}, m672xi = 48)
/* loaded from: classes2.dex */
public final class WebViewYouTubePlayerKt {
    public static final String readHTMLFromUTF8File(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        InputStream inputStream2 = inputStream;
        try {
            InputStream inputStream3 = inputStream2;
            try {
                String joinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
                CloseableKt.closeFinally(inputStream2, null);
                return joinToString$default;
            } catch (Exception unused) {
                throw new RuntimeException("Can't parse HTML file.");
            }
        } finally {
        }
    }
}
