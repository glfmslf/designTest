package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 10:15
 */
public class MarioStateMachineState {

    private int score;
    private IMario mario;

    public MarioStateMachineState() {
        this.score = 0;
        this.mario = NormalMario.getInstance();
    }

    public void obtainMushRoom() {
        this.mario.obtainMushRoom(this);
    }

    public void obtainCaps() {
        this.mario.obtainCaps(this);
    }

    public void obtainFire() {
        this.mario.obtainFire(this);
    }

    public void meetMonster() {
        this.mario.meetMonster(this);
    }

    public StateEnum getState() {
        return mario.getName();
    }

    public void setState(IMario mario) {
        this.mario = mario;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }
}
