package org.example.decorator;

import java.math.BigDecimal;

/**
 * @author yuyou
 * @since 2022/7/14 17:37
 */
public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }
    @Override
    public BigDecimal coast() {
        return super.getPrice().add(drink.coast());
    }

    public String getName() {
        return drink.getName() + " " + super.getName();
    }
}
