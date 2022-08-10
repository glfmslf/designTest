package org.example.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yuyou
 * @since 2022/8/10 18:09
 */
@Getter
@AllArgsConstructor
public enum StateEnum {

    NOMAL(0,"普通"),
    SUPPER(1,"超级"),
    FIRE(2,"火焰"),
    CAPS(3, "斗篷"),
    ;
    private final int state;
    private final String message;
}
