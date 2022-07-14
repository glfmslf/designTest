package org.example.decorator;

/**
 * @author yuyou
 * @since 2022/6/30 23:27
 */
public class Main {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        longBlack = new Milk(longBlack);
        longBlack = new Soy(longBlack);
        System.out.println(longBlack.getName() + ":" + longBlack.coast());
    }
}
