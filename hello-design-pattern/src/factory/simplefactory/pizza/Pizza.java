package factory.simplefactory.pizza;

/**
 * 披萨类
 *
 * @author iuhay
 */
public class Pizza {

    String description;
    float price;

    public Pizza() {
        this.description = "披萨";
        this.price = 10;
    }

    public void prepare() {
        System.out.println(description + "正在准备...");
    }

    public void bake() {
        System.out.println(description + "正在烘焙...");
    }

    public void cut() {
        System.out.println(description + "正在切割...");
    }

    public void pack() {
        System.out.println(description + "正在打包...");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
