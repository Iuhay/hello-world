package observer.weatherstation.observer;

/**
 * 观察者（订阅者）
 *
 * @author iuhay
 */
public interface WeatherObserver {

    /**
     * 观察者收到通知后更新
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    void update(int temperature, int humidity, int pressure);
}
