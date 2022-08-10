package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/10 18:24
 */
public class Main {
    public static void main(String[] args) {
        MarioStateMachineSearchTable marioStateMachine = new MarioStateMachineSearchTable();

        marioStateMachine.obtainMushRoom();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        marioStateMachine.obtainMushRoom();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        marioStateMachine.obtainFire();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        marioStateMachine.obtainFire();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        marioStateMachine.obtainFire();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        marioStateMachine.obtainFire();
        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());

    }
}
