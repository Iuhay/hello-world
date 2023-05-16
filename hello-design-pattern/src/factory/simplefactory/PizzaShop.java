package factory.simplefactory;

import factory.simplefactory.pizza.Pizza;
import factory.simplefactory.pizza.PizzaType;

/**
 * 披萨店
 *
 * @author iuhay
 */
public class PizzaShop {

    private SimplePizzaFactory factory;

    public PizzaShop(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {

        if (null == factory) {
            return null;
        }

        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }
}
