package org.example.decorator;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 16:50
 */
@Data
public abstract class Drink {
    private String name;
    private BigDecimal price;


    public abstract BigDecimal coast();
}
