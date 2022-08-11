package org.example.state;

/**
 * @author yuyou
 * @since 2022/8/11 10:14
 */
public class NormalMario implements IMario{

    private static final NormalMario NORMAL_MARIO = new NormalMario();
    private NormalMario() {
    }

    public static NormalMario getInstance() {
        return NORMAL_MARIO;
    }


    @Override
    public StateEnum getName() {
        return StateEnum.NOMAL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachineState marioStateMachineState) {
        marioStateMachineState.setState(SuperMario.getInstance());
        marioStateMachineState.setScore(marioStateMachineState.getScore() + 100);
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

    }
}
