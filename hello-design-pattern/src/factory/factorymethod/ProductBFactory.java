package factory.factorymethod;

import factory.factorymethod.product.Product;
import factory.factorymethod.product.ProductB;

/**
 * 产品B工厂
 *
 * @author iuhay
 */
public class ProductBFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
