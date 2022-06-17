package org.example.proxy;

import java.lang.reflect.Proxy;

/**
 * @author yuyou
 * @since 2022/6/17 18:35
 */
public class Main {

    public static void main(String[] args) {
        IWorkService workService = new WorkServiceImpl();
        IWorkService workProxy = (IWorkService) Proxy.newProxyInstance(workService.getClass().getClassLoader(),workService.getClass().getInterfaces(),(proxy, method, args1) -> {
            System.out.println("开始代理");
            System.out.println("代理方法" + method.getName());
            Object result = method.invoke(workService, args);
            System.out.println("结束代理");
            return result;
        });
        workProxy.doWork();
        System.out.println("===========");
        workProxy.doRest();
    }
}
