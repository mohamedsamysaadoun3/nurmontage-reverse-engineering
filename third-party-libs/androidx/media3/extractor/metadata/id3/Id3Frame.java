package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id */
    public final String f120id;

    public Id3Frame(String str) {
        this.f120id = str;
    }

    public String toString() {
        return this.f120id;
    }
}
