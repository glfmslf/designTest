package org.example.chainofblame;

/**
 * @author yuyou
 * @since 2022/8/10 16:00
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public void doHandle() {
       this.handle();
        if (successor != null) {
            successor.doHandle();

        }
    }

    public abstract void handle();

}
