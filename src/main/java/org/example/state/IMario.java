package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 10:11
 */
public interface IMario {
    StateEnum getName();

    void obtainMushRoom(MarioStateMachineState marioStateMachineState);

    void obtainCaps(MarioStateMachineState marioStateMachineState);

    void obtainFire(MarioStateMachineState marioStateMachineState);

    void meetMonster(MarioStateMachineState marioStateMachineState);
}
