package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 18:01
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setName("牛奶");
        setPrice(new BigDecimal("0.5"));
    }
}
