package org.example.observer;


import org.example.observer.eventbus.Subscribe;

/**
 * @author yuyou
 * @since 2022/7/28 17:49
 */
public class BuyObserver {

    @Subscribe
    public void push(String msg) {
        System.out.println("购买消息为{" + msg + "}");
    }
}
