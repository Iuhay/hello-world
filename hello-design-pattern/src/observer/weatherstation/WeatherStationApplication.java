package observer.weatherstation;

import observer.weatherstation.observer.WeatherData;
import observer.weatherstation.observer.WeatherObserver;
import observer.weatherstation.subject.CurrentDisplay;
import observer.weatherstation.subject.StatisticsDisplay;

import java.util.HashSet;
import java.util.Set;

/**
 * 气象站应用程序入口
 *
 * @author iuhay
 */
public class WeatherStationApplication {

    private static final Set<WeatherObserver> OBSERVERS = new HashSet<>();
    private static final WeatherData weatherData = new WeatherData();

    public static void main(String[] args) throws InterruptedException {

        OBSERVERS.add(new CurrentDisplay());
        OBSERVERS.add(new StatisticsDisplay());
        OBSERVERS.forEach(weatherData::registerObserver);

        for (int i = 0; i < 3; i++) {
            weatherData.measure();
            Thread.sleep(3000);
        }
    }
}
