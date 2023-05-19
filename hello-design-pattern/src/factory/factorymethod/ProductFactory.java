package factory.factorymethod;

import factory.factorymethod.product.Product;

/**
 * 产品抽象工厂
 *
 * @author iuhay
 */
public abstract class ProductFactory {

    public abstract Product createProduct();
}
