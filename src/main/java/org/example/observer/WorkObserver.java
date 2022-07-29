package org.example.observer;

import com.google.common.eventbus.Subscribe;

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
