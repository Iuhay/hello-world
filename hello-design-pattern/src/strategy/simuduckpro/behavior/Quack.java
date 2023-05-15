package strategy.simuduckpro.behavior;

/**
 * 嘎嘎叫行为实现类
 *
 * @author iuhay
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎~");
    }
}
