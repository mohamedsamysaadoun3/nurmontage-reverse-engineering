package nl.dionsegijn.konfetti.core.models;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: CoreImageStore.kt */
@Metadata(m667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, m668d2 = {"Lnl/dionsegijn/konfetti/core/models/CoreImageStore;", ExifInterface.GPS_DIRECTION_TRUE, "", "getImage", "id", "", "(I)Ljava/lang/Object;", "storeImage", "image", "(Ljava/lang/Object;)I", "core"}, m669k = 1, m670mv = {1, 8, 0}, m672xi = 48)
/* loaded from: classes.dex */
public interface CoreImageStore<T> {
    T getImage(int id);

    int storeImage(T image);
}
