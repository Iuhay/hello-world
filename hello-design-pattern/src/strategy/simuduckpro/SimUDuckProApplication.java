package strategy.simuduckpro;

import java.util.ArrayList;
import java.util.List;

/**
 * 采用了策略模式的鸭子模拟器
 *
 * @author iuhay
 */
public class SimUDuckProApplication {

    private static final List<DuckPro> duckList = new ArrayList<>();

    public static void main(String[] args) {

        duckList.add(new HotDuckPro());
        duckList.add(new MuteDuck());
        duckList.add(new DuckCall());
        duckList.add(new ModelDuckPro());

        duckList.forEach(duckPro -> {
            duckPro.display();
            duckPro.fly();
            duckPro.quack();
        });
    }
}
