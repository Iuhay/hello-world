package decorate.postoffice.pkg;

import decorate.postoffice.goods.Goods;

/**
 * 箱子
 *
 * @author iuhay
 */
public class Box extends Package {

    public Box(Goods goods) {
        super(goods);
    }

    @Override
    public String getName() {
        return "箱子包装" + getGoods().getName();
    }

    @Override
    public int getPrice() {
        return 2 + getGoods().getPrice();
    }
}
