package decorate.postoffice.pkg;

import decorate.postoffice.goods.Goods;

/**
 * 信封
 *
 * @author iuhay
 */
public class Envelop extends Package {

    public Envelop(Goods goods) {
        super(goods);
    }

    @Override
    public String getName() {
        return "信封包装" + getGoods().getName();
    }

    @Override
    public int getPrice() {
        return 1 + getGoods().getPrice();
    }
}
