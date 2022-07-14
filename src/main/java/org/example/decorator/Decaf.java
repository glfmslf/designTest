package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 17:34
 */
public class Decaf extends Coffee{
    public Decaf() {
        setName("无因咖啡");
        setPrice(new BigDecimal("2"));
    }
}
