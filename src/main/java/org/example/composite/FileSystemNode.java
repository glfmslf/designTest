package org.example.composite;

/**
 * @author yuyou
 * @since 2022/7/26 18:21
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return this.path;
    }
}
