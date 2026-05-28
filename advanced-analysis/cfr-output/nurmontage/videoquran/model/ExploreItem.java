/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.File;

public class ExploreItem {
    private String firstFilePath;
    private File folder;
    private String name;
    private String path;
    private String size;

    public ExploreItem(File file, String string2, String string3, String string4, String string5) {
        this.path = string2;
        this.size = string3;
        this.name = string4;
        this.firstFilePath = string5;
        this.folder = file;
    }

    public String getFirstFilePath() {
        return this.firstFilePath;
    }

    public File getFolder() {
        return this.folder;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getSize() {
        return this.size;
    }
}

