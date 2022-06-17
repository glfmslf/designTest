package org.example.proxy;

/**
 * @author yuyou
 * @since 2022/6/17 18:35
 */
public class Main {

    public static void main(String[] args) {
        IWorkService workService = new WorkServiceImpl();
        IWorkService workProxy = (IWorkService) new ProxyFactory(workService).getProxy();
        workProxy.doWork();
        System.out.println("===========");
        workProxy.doRest();
    }
}
