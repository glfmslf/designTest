package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 20:27
 */
public interface Visitor {
    void visitor(PDFFile pdfFile);

    void visitor(PPTFile pptFile);

    void visitor(WordFile wordFile);
}
