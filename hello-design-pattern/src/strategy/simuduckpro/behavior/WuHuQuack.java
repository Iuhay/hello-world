package strategy.simuduckpro.behavior;

/**
 * 嘎嘎叫行为实现类，叫法是“芜湖，芜湖~”
 *
 * @author iuhay
 */
public class WuHuQuack implements QuackBehavior {

    /**
     * 芜湖叫行为
     */
    @Override
    public void quack() {
        System.out.println("芜湖，芜湖~");
    }
}
