// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.File;

public class ExploreItem
{
    private String firstFilePath;
    private File folder;
    private String name;
    private String path;
    private String size;
    
    public ExploreItem(final File folder, final String path, final String size, final String name, final String firstFilePath) {
        this.path = path;
        this.size = size;
        this.name = name;
        this.firstFilePath = firstFilePath;
        this.folder = folder;
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
