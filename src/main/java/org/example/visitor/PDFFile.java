package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 20:28
 */
public class PDFFile extends ResourceFile{
    public PDFFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitor(this);

    }
}
