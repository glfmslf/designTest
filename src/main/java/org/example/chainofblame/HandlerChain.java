package org.example.chainofblame;

/**
 * @author yuyou
 * @since 2022/8/10 16:11
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.doHandle();
        }
    }
}
