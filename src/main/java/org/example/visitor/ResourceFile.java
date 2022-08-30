package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 18:25
 */
public abstract class ResourceFile {

    private String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract void accept(Visitor visitor);
}
