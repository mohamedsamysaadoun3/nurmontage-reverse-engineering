package hazem.nurmontage.videoquran.model;

import java.io.File;

/* loaded from: classes2.dex */
public class ExploreItem {
    private String firstFilePath;
    private File folder;
    private String name;
    private String path;
    private String size;

    public ExploreItem(File file, String filePath, String filePath0, String filePath0, String textValue4) {
        this.path = filePath;
        this.size = filePath0;
        this.name = filePath0;
        this.firstFilePath = textValue4;
        this.folder = file;
    }

    public File getFolder() {
        return this.folder;
    }

    public String getFirstFilePath() {
        return this.firstFilePath;
    }

    public String getPath() {
        return this.path;
    }

    public String getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }
}
