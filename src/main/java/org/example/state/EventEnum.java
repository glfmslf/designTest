package org.example.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yuyou
 * @since 2022/8/10 20:17
 */
@AllArgsConstructor
@Getter
public enum EventEnum {
    GOT_MUSHROOM(0, "蘑菇"),
    GOT_CAPS(1, "斗篷"),
    GOT_FIRE(2, "火"),
    GOT_MONSTER(3, "怪物"),
    ;

    private final int id;
    private final String message;
}
