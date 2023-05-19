package factory.factorymethod;

import factory.factorymethod.product.Product;

/**
 * 产品商店
 *
 * @author iuhay
 */
public class ProductStore {

    private final ProductFactory factory;

    public ProductStore(ProductFactory factory) {
        this.factory = factory;
    }

    public Product orderProduct() {
        if (null != factory) {
            return factory.createProduct();
        }

        return null;
    }
}
