package decorate.postoffice.goods;

/**
 * 手机
 *
 * @author iuhay
 */
public class Phone implements Goods {

    @Override
    public String getName() {
        return "一部手机";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
