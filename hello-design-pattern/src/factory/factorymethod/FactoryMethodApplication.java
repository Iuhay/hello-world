package factory.factorymethod;

/**
 * 工厂方法程序入口
 *
 * @author iuhay
 */
public class FactoryMethodApplication {

    public static void main(String[] args) {

        ProductStore store = new ProductStore(new ProductAFactory());
        System.out.println(store.orderProduct());
    }
}
