package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 17:35
 */
public class Espresso extends Coffee {
    public Espresso() {
        setName("意大利农因咖啡");
        setPrice(new BigDecimal("4"));

    }
}
