package strategy.simuduckpro;

import strategy.simuduckpro.behavior.FlyNoWay;
import strategy.simuduckpro.behavior.Quack;

/**
 * 机械的鸭鸣器，不会飞，会嘎嘎叫
 *
 * @author iuhay
 */
public class DuckCall extends DuckPro {

    public DuckCall() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("机械的鸭鸣器");
    }
}
