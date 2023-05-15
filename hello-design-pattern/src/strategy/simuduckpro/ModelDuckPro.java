package strategy.simuduckpro;

import strategy.simuduckpro.behavior.FlyNoWay;
import strategy.simuduckpro.behavior.MuteQuack;

/**
 * 木头做的模型鸭子，不会飞、不会叫
 *
 * @author iuhay
 */
public class ModelDuckPro extends DuckPro {

    public ModelDuckPro() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("木头做的模型鸭子");
    }
}
