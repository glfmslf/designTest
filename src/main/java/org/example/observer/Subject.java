package org.example.observer;

import com.google.common.eventbus.EventBus;

import java.util.List;

/**
 * @author yuyou
 * @since 2022/7/28 17:40
 */
public class Subject {

    private EventBus eventBus;

    public Subject() {
//        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(8));
        this.eventBus = new EventBus();
    }

    public void regiester(List<Object> objects) {
        for (Object o : objects) {
            eventBus.register(o);
        }
    }

    public void push() {

        System.out.println("执行本身逻辑");
        eventBus.post("通知消息");
    }
}
