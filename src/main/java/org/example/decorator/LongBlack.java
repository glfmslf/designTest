package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 17:29
 */
public class LongBlack extends Coffee{

    public LongBlack() {
        setName("美式咖啡");
        setPrice(new BigDecimal("1"));
    }

}
