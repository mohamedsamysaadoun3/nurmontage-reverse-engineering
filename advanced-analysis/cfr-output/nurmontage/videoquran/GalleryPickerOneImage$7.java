/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentUris
 *  android.net.Uri
 *  android.provider.MediaStore$Files
 *  android.provider.MediaStore$Images$Media
 *  android.util.Log
 */
package hazem.nurmontage.videoquran;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$7$1;
import hazem.nurmontage.videoquran.GalleryPickerOneImage$7$2;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.model.ExploreItem;
import hazem.nurmontage.videoquran.model.PhotoItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

class GalleryPickerOneImage$7
implements Runnable {
    final /* synthetic */ GalleryPickerOneImage this$0;

    GalleryPickerOneImage$7(GalleryPickerOneImage galleryPickerOneImage) {
        this.this$0 = galleryPickerOneImage;
    }

    public void run() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n;
        int n2;
        String string2;
        String string3;
        GalleryPickerOneImage$7 galleryPickerOneImage$7 = this;
        Object object7 = this.this$0.getContentResolver();
        Object object8 = MediaStore.Files.getContentUri((String)"external");
        Object object9 = new String[3];
        int n3 = 0;
        Object object10 = null;
        object9[0] = string3 = "_id";
        int n4 = 1;
        object9[n4] = string2 = "_data";
        int n5 = 2;
        object9[n5] = "parent";
        int n6 = 0;
        object7 = object7.query((Uri)object8, (String[])object9, "media_type=1", null, "date_added DESC");
        object8 = new ArrayList();
        object9 = new ArrayList();
        Object object11 = new HashSet();
        String string4 = "";
        Object object12 = new StringBuilder(string4);
        object12 = object12.append(object7).toString();
        Log.e((String)"query start", (String)object12);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        Object object13 = null;
        while ((n2 = object7.moveToNext()) != 0) {
            int n10;
            n = object7.getColumnIndexOrThrow(string2);
            object6 = object7.getString(n);
            object5 = new File((String)object6);
            n = ((HashSet)object11).contains(object5 = ((File)object5).getParent()) ? 1 : 0;
            if (n == 0) {
                String string5;
                Object object14;
                ((HashSet)object11).add(object5);
                object6 = new File((String)object5);
                object12 = ((File)object6).listFiles();
                if (object12 != null) {
                    n4 = ((File[])object12).length;
                    n10 = 0;
                    object4 = null;
                    object3 = null;
                    while (n3 < n4) {
                        int n11 = n4;
                        object2 = object12[n3];
                        object14 = object12;
                        object12 = galleryPickerOneImage$7.this$0;
                        n6 = object12.isImageFile((File)object2) ? 1 : 0;
                        if (n6 != 0) {
                            ++n10;
                            if (object3 == null) {
                                object3 = object2.getAbsolutePath();
                                if (object13 == null) {
                                    object13 = object3;
                                }
                            }
                        }
                        ++n3;
                        n4 = n11;
                        object12 = object14;
                    }
                    n3 = n10;
                    string5 = object3;
                } else {
                    n3 = 0;
                    object10 = null;
                    string5 = null;
                }
                if (n3 > 0) {
                    n7 += n3;
                    object2 = new StringBuilder(string4);
                    object10 = object2.append(n3);
                    object14 = ((StringBuilder)object10).toString();
                    String string6 = ((File)object6).getName();
                    object4 = object12;
                    object3 = object6;
                    object = object5;
                    object12 = new ExploreItem((File)object6, (String)object5, (String)object14, string6, string5);
                    ((ArrayList)object8).add(object12);
                }
            }
            object12 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n4 = object7.getColumnIndexOrThrow(string3);
            object6 = object13;
            n10 = n7;
            long l = object7.getLong(n4);
            object12 = ContentUris.withAppendedId((Uri)object12, (long)l).toString();
            n4 = 0;
            object2 = null;
            object10 = new PhotoItem((String)object5, (String)object12, false);
            ((ArrayList)object9).add(object10);
            n3 = 1;
            n6 = 50;
            if ((n8 += n3) > n6) break;
            n4 = n3;
            n3 = 0;
            object10 = null;
        }
        object10 = galleryPickerOneImage$7.this$0;
        object12 = new GalleryPickerOneImage$7$1(galleryPickerOneImage$7, (ArrayList)object9);
        object10.runOnUiThread((Runnable)object12);
        object = object13;
        while ((n3 = object7.moveToNext()) != 0) {
            n6 = object7.getColumnIndexOrThrow(string2);
            object12 = object7.getString(n6);
            object10 = new File((String)object12);
            n6 = ((HashSet)object11).contains(object10 = ((File)object10).getParent()) ? 1 : 0;
            if (n6 != 0) {
                object4 = object11;
            } else {
                Object object15;
                block19: {
                    ((HashSet)object11).add(object10);
                    object12 = new File((String)object10);
                    object2 = object12.listFiles();
                    if (object2 != null) {
                        n9 = ((File[])object2).length;
                        n8 = 0;
                        n2 = 0;
                        object5 = null;
                        n = 0;
                        object6 = null;
                        while (true) {
                            if (n8 >= n9) {
                                object4 = object11;
                                object15 = object6;
                                break block19;
                            }
                            object4 = object11;
                            object11 = object2[n8];
                            object3 = object2;
                            object2 = galleryPickerOneImage$7.this$0;
                            n4 = object2.isImageFile((File)object11) ? 1 : 0;
                            if (n4 != 0) {
                                ++n2;
                                if (object6 == null) {
                                    object6 = ((File)object11).getAbsolutePath();
                                    if (object == null) {
                                        object = object6;
                                    }
                                }
                            }
                            ++n8;
                            object11 = object4;
                            object2 = object3;
                        }
                    }
                    object4 = object11;
                    n2 = 0;
                    object5 = null;
                    object15 = null;
                }
                if (n2 > 0) {
                    n7 += n2;
                    object2 = new StringBuilder(string4);
                    object2 = object2.append(n2);
                    String string7 = object2.toString();
                    String string8 = object12.getName();
                    object11 = new ExploreItem((File)object12, (String)object10, string7, string8, (String)object15);
                    ((ArrayList)object8).add(object11);
                }
            }
            object12 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n4 = object7.getColumnIndexOrThrow(string3);
            long l = object7.getLong(n4);
            object12 = ContentUris.withAppendedId((Uri)object12, (long)l).toString();
            n4 = 0;
            object2 = null;
            object11 = new PhotoItem((String)object10, (String)object12, false);
            ((ArrayList)object9).add(object11);
            object11 = object4;
        }
        object7.close();
        object7 = GalleryPickerOneImage.cfr_renamed_90(galleryPickerOneImage$7.this$0);
        n5 = R$string.all;
        object6 = object7.getString(n5);
        object7 = new StringBuilder(string4);
        object4 = ((StringBuilder)object7).append(n7).toString();
        object7 = GalleryPickerOneImage.cfr_renamed_90(galleryPickerOneImage$7.this$0);
        n5 = R$string.all;
        object3 = object7.getString(n5);
        object10 = new ExploreItem(null, (String)object6, (String)object4, (String)object3, (String)object);
        ((ArrayList)object8).add(0, object10);
        object10 = galleryPickerOneImage$7.this$0;
        object7 = new GalleryPickerOneImage$7$2(galleryPickerOneImage$7, (ArrayList)object9, (ArrayList)object8);
        object10.runOnUiThread((Runnable)object7);
    }
}

