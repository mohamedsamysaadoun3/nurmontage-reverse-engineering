package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes3.dex */
public class SymbolicLinkFileFilter extends AbstractFileFilter implements Serializable {
    public static final SymbolicLinkFileFilter INSTANCE = new SymbolicLinkFileFilter();
    private static final long serialVersionUID = 1;

    protected SymbolicLinkFileFilter() {
    }

    public SymbolicLinkFileFilter(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        super(fileVisitResult, fileVisitResult2);
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return isSymbolicLink(file.toPath());
    }

    @Override // org.apache.commons.p008io.filefilter.IOFileFilter, org.apache.commons.p008io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(isSymbolicLink(path));
    }

    boolean isSymbolicLink(Path path) {
        return Files.isSymbolicLink(path);
    }
}
