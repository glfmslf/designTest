package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 18:04
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setName("巧克力");
        setPrice(new BigDecimal("0.7"));

    }
}
