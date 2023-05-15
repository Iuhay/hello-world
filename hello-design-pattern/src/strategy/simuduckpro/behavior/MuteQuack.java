package strategy.simuduckpro.behavior;

/**
 * 嘎嘎叫行为实现类，静音（不会叫）
 *
 * @author iuhay
 */
public class MuteQuack implements QuackBehavior {

    /**
     * 不会嘎嘎叫，什么都不做
     */
    @Override
    public void quack() {}
}
