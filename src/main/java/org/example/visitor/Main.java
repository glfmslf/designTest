package org.example.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yuyou
 * @since 2022/8/30 20:45
 */
public class Main {
    private static List<ResourceFile> listAllFile(String file) throws NoSuchMethodException {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        if ("ppt".equals(file)) {
            resourceFiles.add(new PPTFile("a.ppt"));
        } else if ("txt".equals(file)) {
            resourceFiles.add(new WordFile("b.txt"));
        } else if ("pdf".equals(file)) {
            resourceFiles.add(new PDFFile("c.pdf"));
        }else {
            throw new NoSuchMethodException();
        }
        return resourceFiles;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("输入文件类型 ex:pdf/txt/ppt");
        Scanner in = new Scanner(System.in);
        String fileEnd = in.nextLine();
        for (ResourceFile resourceFile : listAllFile(fileEnd)) {
            resourceFile.accept(new Extractor());
        }

        for (ResourceFile resourceFile : listAllFile(fileEnd)) {
            resourceFile.accept(new Compressor());

        }
    }
}
