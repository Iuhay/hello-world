package factory.simplefactory;

import factory.simplefactory.pizza.*;

/**
 * 简单披萨工厂，可以生产多种披萨
 *
 * @author iuhay
 */
public class SimplePizzaFactory {

    /**
     * 根据披萨类型，创建对应的披萨
     * @param type 披萨类型
     * @return 披萨
     */
    public Pizza createPizza(PizzaType type) {

        Pizza pizza;

        switch (type) {
            case CLAM -> pizza = new ClamPizza();
            case CHEESE -> pizza = new CheesePizza();
            case VEGGIE -> pizza = new VeggiePizza();
            default -> pizza = new Pizza();
        }

        return pizza;
    }
}
