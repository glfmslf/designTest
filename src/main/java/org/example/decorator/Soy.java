package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 18:03
 */
public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        setName("豆浆");
        setPrice(new BigDecimal("0.6"));

    }
}
