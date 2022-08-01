package org.example.observer.eventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author yuyou
 * @since 2022/8/1 14:14
 */
public class EventBus {
    private Executor executor;

    private ObserverRegistry observerRegistry = new ObserverRegistry();


    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public EventBus() {
        this(MoreExecutors.directExecutor());
    }

    public void register(Object object) {
        observerRegistry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = observerRegistry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(() -> {
                observerAction.execute(event);
            });
        }
    }
}
