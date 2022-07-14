package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 17:28
 */
public class Coffee extends Drink{
    @Override
    public BigDecimal coast() {
        return super.getPrice();
    }
}
