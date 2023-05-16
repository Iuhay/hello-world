package observer.weatherstation.subject;

import observer.weatherstation.observer.WeatherObserver;

/**
 * 统计显示
 *
 * @author iuhay
 */
public class StatisticsDisplay implements WeatherObserver, Display {

    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = (this.temperature + temperature) / 2;
        this.humidity = (this.humidity + humidity) / 2;
        this.pressure = (this.pressure + pressure) / 2;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "平均气温 = " + this.temperature +
                "，平均湿度 = " + this.humidity +
                "，平均气压 = " + this.pressure
        );
    }
}
