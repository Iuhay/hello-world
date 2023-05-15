package strategy.simuduck;

/**
 * 木头做的模型鸭子，根本不会飞，而且没有嘴巴<br/>
 * 问题这就出来了，现在有不会飞、不会叫的鸭子，就必须重写父类的方法<br/>
 * 如果还有更多不同的鸭子：会飞不会叫、会叫不会飞等等...<br/>
 * 使得代码复用率很低
 *
 * @author iuhay
 */
public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("木头做的模型鸭子");
    }

    /**
     * 不会飞，所以得重写父类的方法，什么都不做
     */
    @Override
    public void fly() {}

    /**
     * 不会嘎嘎叫，所以得重写父类的方法，什么都不做
     */
    @Override
    public void quack() {}
}
