package org.example.visitor;

/**
 * @author yuyou
 * @since 2022/8/30 20:44
 */
public class Compressor implements Visitor{
    @Override
    public void visitor(PDFFile pdfFile) {
        System.out.println("执行pdf文件压缩数据");
    }

    @Override
    public void visitor(PPTFile pptFile) {
        System.out.println("执行ppt文件压缩数据");
    }

    @Override
    public void visitor(WordFile wordFile) {
        System.out.println("执行word文件压缩数据");
    }
}
