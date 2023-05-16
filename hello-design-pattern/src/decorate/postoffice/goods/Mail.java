package decorate.postoffice.goods;

/**
 * 邮件
 *
 * @author iuhay
 */
public class Mail implements Goods {

    @Override
    public String getName() {
        return "一封邮件";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
