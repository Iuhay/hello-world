package decorate.postoffice;

import decorate.postoffice.goods.Goods;
import decorate.postoffice.goods.Mail;
import decorate.postoffice.goods.Phone;
import decorate.postoffice.pkg.Box;
import decorate.postoffice.pkg.Envelop;
import decorate.postoffice.pkg.Package;

import java.io.*;

/**
 * 邮局程序入口
 *
 * @author iuhay
 */
public class PostOfficeApplication {

    public static void main(String[] args) throws FileNotFoundException {

        Goods phone = new Phone();
        phone = new Box(phone);
        System.out.println(phone.getName() + ", " + phone.getPrice());

        Goods mail = new Mail();
        mail = new Envelop(mail);
        System.out.println(mail.getName() + ", " + mail.getPrice());

        mail = new Box(mail);
        System.out.println(mail.getName() + ", " + mail.getPrice());

        InputStream in = new FileInputStream("");
        in = new BufferedInputStream(in);
        in = new DataInputStream(in);
    }
}
