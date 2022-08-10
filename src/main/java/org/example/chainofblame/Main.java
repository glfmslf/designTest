package org.example.chainofblame;

/**
 * @author yuyou
 * @since 2022/8/10 16:17
 */
public class Main {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();

    }
}
