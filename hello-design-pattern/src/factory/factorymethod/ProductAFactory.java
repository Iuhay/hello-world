package factory.factorymethod;

import factory.factorymethod.product.Product;
import factory.factorymethod.product.ProductA;

/**
 * 产品A工厂
 *
 * @author iuhay
 */
public class ProductAFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
