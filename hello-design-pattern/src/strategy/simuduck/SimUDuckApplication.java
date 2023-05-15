package strategy.simuduck;

/**
 * 鸭子模拟器的入口
 *
 * @author iuhay
 */
public class SimUDuckApplication {

    public static void main(String[] args) {

        Duck hotDuck = new HotDuck();
        hotDuck.display();
        hotDuck.fly();
        hotDuck.quack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.fly();
        modelDuck.quack();
    }
}
