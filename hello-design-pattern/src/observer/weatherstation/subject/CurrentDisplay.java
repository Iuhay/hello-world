package observer.weatherstation.subject;

import observer.weatherstation.observer.WeatherObserver;

/**
 * 实时数据显示器
 *
 * @author iuhay
 */
public class CurrentDisplay implements WeatherObserver, Display {

    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "当前状况：气温 = " + this.temperature +
                "，湿度 = " + this.humidity +
                "，气压 = " + this.pressure
        );
    }
}
