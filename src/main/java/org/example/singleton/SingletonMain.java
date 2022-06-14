package org.example.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yuyou
 * @since 2022/6/13 14:00
 */
public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
//        Singleton3 singleton1 = Singleton3.getInstance();
//        Singleton3 singleton11 = Singleton3.getInstance();
//        System.out.println(singleton1 == singleton11);
        CountDownLatch countDownLatch = new CountDownLatch(10000);
        long current = System.currentTimeMillis();
        int j = 0;
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton1 singleton2 = Singleton1.getInstance();
//                System.out.println(singleton2.getId());
                countDownLatch.countDown();
            }).start();
//            j = Singleton4.INSTANCE.getId();
        }
//        System.out.println(j);
        countDownLatch.await();
        System.out.println("1耗时: " + (System.currentTimeMillis() - current));

        CountDownLatch countDownLatch1 = new CountDownLatch(10000);
        long current1 = System.currentTimeMillis();
//        int j = 0;
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton3 singleton2 = Singleton3.getInstance();
//                System.out.println(singleton2.getId());
                countDownLatch1.countDown();
            }).start();
            //            j = Singleton4.INSTANCE.getId();
        }
        countDownLatch1.await();
        System.out.println("3耗时: " + (System.currentTimeMillis() - current1));

    }
}

class Singleton1{
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private static final Singleton1 singleton1 = new Singleton1();
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

    public int getId() {
        return atomicInteger.incrementAndGet();
    }

}

class Singleton2{
    private static Singleton2 singleton2;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
    public int getId() {
        return atomicInteger.incrementAndGet();
    }
}

class Singleton3{
    private static Singleton3 singleton3;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }

        }
        return singleton3;
    }
    public int getId() {
        return atomicInteger.incrementAndGet();
    }
}
enum Singleton4 {
    INSTANCE,
    ;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public int getId() {
        return atomicInteger.incrementAndGet();
    }

}
