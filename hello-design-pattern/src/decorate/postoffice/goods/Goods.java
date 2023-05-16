package decorate.postoffice.goods;

/**
 * 货物接口
 *
 * @author iuhay
 */
public interface Goods {

    /**
     * 获取货物名称
     * @return 货物的名称
     */
    String getName();

    /**
     * 获取运输价格
     * @return 运输价格
     */
    int getPrice();
}
