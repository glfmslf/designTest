package org.example.state;

/**
 * 分支逻辑法
 * @author yuyou
 * @since 2022/8/10 18:12
 */
public class MarioStateMachine {

    private int score;
    private StateEnum currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = StateEnum.NOMAL;
    }

    public void obtainMushRoom() {
        if (StateEnum.NOMAL.equals(currentState)) {
            this.score += 100;
            this.currentState = StateEnum.SUPPER;
        }
    }

    public void obtainCaps() {
        if (StateEnum.NOMAL.equals(currentState) || StateEnum.SUPPER.equals(currentState)) {
            this.score += 200;
            this.currentState = StateEnum.CAPS;
        }
    }

    public void obtainFireFlower() {
        if (StateEnum.NOMAL.equals(currentState) || StateEnum.SUPPER.equals(currentState)) {
            this.score += 300;
            this.currentState = StateEnum.FIRE;
        }
    }

    public void meetMuster() {
        if (StateEnum.NOMAL.equals(currentState)) {
            throw new IllegalArgumentException("mario is die");
        }
        if (StateEnum.SUPPER.equals(currentState)) {
            this.score -= 100;
            this.currentState = StateEnum.NOMAL;
        }
        if (StateEnum.CAPS.equals(currentState)) {
            this.score -= 200;
            this.currentState = StateEnum.NOMAL;
        }
        if (StateEnum.FIRE.equals(currentState)) {
            this.score -= 300;
            this.currentState = StateEnum.NOMAL;
        }
    }

    public int getScore() {
        return score;
    }

    public StateEnum getCurrentState() {
        return currentState;
    }
}
