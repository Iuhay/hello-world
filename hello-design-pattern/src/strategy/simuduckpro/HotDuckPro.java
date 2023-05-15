package strategy.simuduckpro;

import strategy.simuduckpro.behavior.FlyWithWings;
import strategy.simuduckpro.behavior.Quack;

/**
 * 火热鸭子
 *
 * @author iuhay
 */
public class HotDuckPro extends DuckPro {

    public HotDuckPro() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("红色头发的火热鸭子");
    }
}
