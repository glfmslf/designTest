package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 11:03
 */
public class FireMario implements IMario{
    private static final FireMario FIRE_MARIO = new FireMario();

    private FireMario() {

    }

    public static FireMario getInstance() {
        return FIRE_MARIO;
    }

    @Override
    public StateEnum getName() {
        return StateEnum.FIRE;
    }

    @Override
    public void obtainMushRoom(MarioStateMachineState marioStateMachineState) {

    }

    @Override
    public void obtainCaps(MarioStateMachineState marioStateMachineState) {

    }

    @Override
    public void obtainFire(MarioStateMachineState marioStateMachineState) {

    }

    @Override
    public void meetMonster(MarioStateMachineState marioStateMachineState) {
        marioStateMachineState.setState(NormalMario.getInstance());
        marioStateMachineState.setScore(marioStateMachineState.getScore() - 300);

    }
}
