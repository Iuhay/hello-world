package strategy.simuduckpro;

import strategy.simuduckpro.behavior.FlyWithWings;
import strategy.simuduckpro.behavior.MuteQuack;

/**
 * 会飞的静音鸭子
 *
 * @author iuhay
 */
public class MuteDuck extends DuckPro {

    public MuteDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("会飞的静音鸭子");
    }
}
