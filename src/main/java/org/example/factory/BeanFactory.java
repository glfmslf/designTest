package org.example.factory;

import java.util.HashMap;
import java.util.Map;

/** 简单工厂
 * @author yuyou
 * @since 2022/6/15 14:13
 */
public class BeanFactory {
    private static final Map<Integer, People> beanMap = new HashMap<>();
    static {
        beanMap.put(1, new Man());
        beanMap.put(2, new Women());
        beanMap.put(3, new Student());
        beanMap.put(4, new Teacher());
    }

    public static People create(int type) {
        if (type == 1) {
            return new Man();
        } else if (type == 2) {
            return new Women();
        } else if (type == 3) {
            return new Student();
        } else if (type == 4) {
            return new Teacher();
        }
        throw new IllegalArgumentException();
    }

    public static People createCache(int type) {
        return beanMap.get(type);
    }
}
