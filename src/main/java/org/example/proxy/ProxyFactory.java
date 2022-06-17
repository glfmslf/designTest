package org.example.proxy;

import java.lang.reflect.Proxy;

/**
 * @author yuyou
 * @since 2022/6/17 18:29
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("开始代理");
            System.out.println("代理方法" + method.getName());
            Object result = method.invoke(target, args);
            System.out.println("结束代理");
            return result;
        });
    }
}
