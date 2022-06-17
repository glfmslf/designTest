package org.example.proxy;

/**
 * @author yuyou
 * @since 2022/6/17 18:28
 */
public class WorkServiceImpl implements IWorkService{
    @Override
    public void doWork() {
        System.out.println("工作");
    }

    @Override
    public void doRest() {
        System.out.println("休息");
    }
}
