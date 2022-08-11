package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 11:02
 */
public class CapsMario implements IMario{
    private static final CapsMario CAPS_MARIO = new CapsMario();

    private CapsMario() {

    }

    public static CapsMario getInstance() {
        return CAPS_MARIO;
    }

    @Override
    public StateEnum getName() {
        return StateEnum.CAPS;
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
        marioStateMachineState.setScore(marioStateMachineState.getScore() - 200);

    }
}
