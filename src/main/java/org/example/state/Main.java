package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/10 18:24
 */
public class Main {
    public static void main(String[] args) {
//        MarioStateMachineSearchTable marioStateMachine = new MarioStateMachineSearchTable();
//
//        marioStateMachine.obtainMushRoom();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
//        marioStateMachine.obtainMushRoom();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
//        marioStateMachine.obtainFire();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
//        marioStateMachine.obtainFire();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
//        marioStateMachine.obtainFire();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
//        marioStateMachine.obtainFire();
//        System.out.println(marioStateMachine.getScore() + "  " + marioStateMachine.getCurrentState());
        MarioStateMachineState marioStateMachineState = new MarioStateMachineState();
        marioStateMachineState.setState(SuperMario.getInstance());
        marioStateMachineState.obtainMushRoom();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

        marioStateMachineState.meetMonster();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());
//        marioStateMachineState.obtainCaps();
//        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

        marioStateMachineState.obtainFire();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

        marioStateMachineState.meetMonster();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

        marioStateMachineState.obtainCaps();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

        marioStateMachineState.obtainMushRoom();
        System.out.println(marioStateMachineState.getState() + "   " + marioStateMachineState.getScore());

    }
}
