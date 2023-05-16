package observer.weatherstation.observer;

import observer.weatherstation.subject.WeatherSubject;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 气象数据中心
 *
 * @author iuhay
 */
public class WeatherData implements WeatherSubject {

    private final Set<WeatherObserver> observers = new HashSet<>();

    private int temperature;
    private int humidity;
    private int pressure;

    /**
     * 采集并计算当前环境的气象数据<br/>
     * 在这里用随机数代替，每当计算完新的数据，将通知所有的订阅者
     */
    public void measure() {
        this.temperature = new Random().nextInt(-20, 40);
        this.humidity = new Random().nextInt(0, 100);
        this.pressure = new Random().nextInt(-350, 1500);
        this.notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            if (null != observer) {
                observer.update(this.temperature, this.humidity, this.pressure);
            }
        });
    }
}
