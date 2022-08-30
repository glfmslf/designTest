package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuyou
 * @since 2022/8/30 16:36
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator1 = list.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator1.next());

    }
}
