package org.example.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yuyou
 * @since 2022/7/28 17:51
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        List<Object> objects = Lists.newArrayList(new BuyObserver(), new WorkObserver());
        subject.regiester(objects);

        subject.push();

    }
}
