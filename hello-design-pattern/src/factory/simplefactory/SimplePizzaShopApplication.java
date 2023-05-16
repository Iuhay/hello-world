package factory.simplefactory;

import factory.simplefactory.pizza.PizzaType;

import java.text.DateFormat;

/**
 * 简单工厂实现的披萨店程序入口
 *
 * @author iuhay
 */
public class SimplePizzaShopApplication {

    public static void main(String[] args) {

        PizzaShop shop = new PizzaShop(new SimplePizzaFactory());
        System.out.println(shop.orderPizza(PizzaType.CLAM));
        System.out.println(shop.orderPizza(PizzaType.VEGGIE));
        System.out.println(shop.orderPizza(PizzaType.CHEESE));
    }
}
