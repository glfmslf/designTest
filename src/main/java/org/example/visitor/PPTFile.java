package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 20:27
 */
public class PPTFile extends ResourceFile{
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitor(this);

    }
}
