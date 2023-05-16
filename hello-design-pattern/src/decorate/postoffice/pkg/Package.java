package decorate.postoffice.pkg;

import decorate.postoffice.goods.Goods;

/**
 * 包装抽象类
 *
 * @author iuhay
 */
public abstract class Package implements Goods {

    private Goods goods;

    public Package(Goods goods) {
        this.goods = goods;
    }

    public Goods getGoods() {
        return goods;
    }
}
