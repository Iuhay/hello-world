package strategy.simuduck;

/**
 * 鸭子抽象类，可能有许多不同种类的鸭子，但它们都是（IS-A）鸭子<br/>
 * 提供所有鸭子都具备的状态和行为<br/>
 * 在这里，我们先不用关心状态，更重要的是行为！
 *
 * @author iuhay
 */
public abstract class Duck {

    /**
     * 展示鸭子的外观，因为每个不同种类的鸭子长相是不一样的<br/>
     * 因此将其定义为抽象方法，由子类自行实现
     */
    public abstract void display();

    /**
     * 飞行
     */
    public void fly() {
        System.out.println("芜湖，起飞~");
    }

    /**
     * 嘎嘎叫
     */
    public void quack() {
        System.out.println("嘎嘎嘎~");
    }
}
