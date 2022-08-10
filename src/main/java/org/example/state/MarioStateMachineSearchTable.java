package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/10 20:19
 */
public class MarioStateMachineSearchTable {

    private Integer score;

    private StateEnum currentState;

    public static final StateEnum[][] stateArray = {
            {StateEnum.SUPPER, StateEnum.CAPS, StateEnum.FIRE, StateEnum.NOMAL},
            {StateEnum.SUPPER, StateEnum.CAPS, StateEnum.FIRE, StateEnum.NOMAL},
            {StateEnum.CAPS, StateEnum.CAPS, StateEnum.CAPS, StateEnum.NOMAL},
            {StateEnum.FIRE, StateEnum.FIRE, StateEnum.FIRE, StateEnum.NOMAL}
    };
    private static final int[][] scoreArray = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachineSearchTable() {
        this.score = 0;
        currentState = StateEnum.NOMAL;
    }
    private void executeEvent(EventEnum event) {
        int stateValue = currentState.getState();
        int eventValue = event.getId();
        this.currentState = stateArray[stateValue][eventValue];
        this.score += scoreArray[stateValue][eventValue];
    }

    public void obtainMushRoom() {
        executeEvent(EventEnum.GOT_MUSHROOM);

    }

    public void obtainFire() {
        executeEvent(EventEnum.GOT_FIRE);

    }

    public void obtainCaps() {
        executeEvent(EventEnum.GOT_CAPS);

    }

    public void obtainMonster() {
        executeEvent(EventEnum.GOT_MONSTER);

    }

    public Integer getScore() {
        return score;
    }

    public StateEnum getCurrentState() {
        return currentState;
    }
}
