package strategy.simuduckpro.behavior;

/**
 * 会飞行行为实现类
 *
 * @author iuhay
 */
public class FlyWithWings implements FlyBehavior {

    /**
     * 会飞行，执行飞行动作
     */
    @Override
    public void fly() {
        System.out.println("芜湖，起飞~");
    }
}
