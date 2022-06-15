package org.example.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法
 * @author yuyou
 * @since 2022/6/15 14:51
 */
public interface MethodFactory {
    People create();
}


class ManFactory implements MethodFactory{
    @Override
    public People create() {
        return new Man();
    }
}

class WomenFactory implements MethodFactory{
    @Override
    public People create() {
        return new Women();
    }
}

class StudentFactory implements MethodFactory {
    @Override
    public People create() {
        return new Student();
    }
}

class TeacherFactory implements MethodFactory {
    @Override
    public People create() {
        return new Teacher();
    }
}

class MethodFactoryMap {
    private static final Map<Integer, MethodFactory> factoryMap = new HashMap<>();
    static {
        factoryMap.put(1, new ManFactory());
        factoryMap.put(2, new WomenFactory());
        factoryMap.put(3, new StudentFactory());
        factoryMap.put(4, new TeacherFactory());
    }

    public static MethodFactory getFactory(int type) {
        return factoryMap.get(type);
    }
}
