package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 18:24
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitor(this);

    }
}
