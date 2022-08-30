package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 20:30
 */
public class Extractor implements Visitor{
    @Override
    public void visitor(PDFFile pdfFile) {
        System.out.println("执行pdf文件读取数据");
    }

    @Override
    public void visitor(PPTFile pptFile) {
        System.out.println("执行ppt文件读取数据");
    }

    @Override
    public void visitor(WordFile wordFile) {
        System.out.println("执行word文件读取数据");

    }
}
