package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 11:06
 */
public class SuperMario implements IMario{
    private static final SuperMario SUPER_MARIO = new SuperMario();
    private SuperMario() {

    }

    public static SuperMario getInstance() {
        return SUPER_MARIO;
    }

    @Override
    public StateEnum getName() {
        return StateEnum.SUPPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachineState marioStateMachineState) {

    }

    @Override
    public void obtainCaps(MarioStateMachineState marioStateMachineState) {
        marioStateMachineState.setState(CapsMario.getInstance());
        marioStateMachineState.setScore(marioStateMachineState.getScore() + 200);

    }

    @Override
    public void obtainFire(MarioStateMachineState marioStateMachineState) {
        marioStateMachineState.setState(FireMario.getInstance());

        marioStateMachineState.setScore(marioStateMachineState.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachineState marioStateMachineState) {
        marioStateMachineState.setState(NormalMario.getInstance());
        marioStateMachineState.setScore(marioStateMachineState.getScore() - 100);

    }
}
