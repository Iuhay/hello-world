package strategy.simuduckpro;

import strategy.simuduckpro.behavior.FlyBehavior;
import strategy.simuduckpro.behavior.QuackBehavior;

/**
 * 鸭子抽象类，可能有不同种类的鸭子，它们都是（IS-A）鸭子<br/>
 * 不同点在于，鸭子有（HAS-A）飞行的行为和嘎嘎叫的行为<br/>
 * 因此，在父类中应当有这两个行为的属性。
 *
 * @author iuhay
 */
public abstract class DuckPro {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlayBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void fly() {
        if (null != this.flyBehavior) {
            this.flyBehavior.fly();
        }
    }

    public void quack() {
        if (null != this.quackBehavior) {
            this.quackBehavior.quack();
        }
    }
}
