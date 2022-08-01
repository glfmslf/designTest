package org.example.observer;


import org.example.observer.eventbus.Subscribe;

/**
 * @author yuyou
 * @since 2022/7/28 17:51
 */
public class WorkObserver {

    @Subscribe
    public void work(String msg) {
        System.out.println("工作获得消息为{" + msg + "}");

    }
}
