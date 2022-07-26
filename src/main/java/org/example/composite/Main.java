package org.example.composite;

/**
 * @author yuyou
 * @since 2022/7/26 20:35
 */
public class Main {

    public static void main(String[] args) {
        Directory file = new Directory("/Users/yuyou/Desktop/上线/换购券");
        file.addNode(new File("/Users/yuyou/Desktop/上线/换购券/上线sql.txt"));
        System.out.println(file.countNumOfFiles());
        System.out.println(file.countSizeOfFiles());
    }
}
