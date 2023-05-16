package observer.weatherstation.subject;

import observer.weatherstation.observer.WeatherObserver;

/**
 * 主题接口
 *
 * @author iuhay
 */
public interface WeatherSubject {

    /**
     * 注册（订阅）
     * @param weatherObserver 观察者对象
     */
    void registerObserver(WeatherObserver weatherObserver);

    /**
     * 移出（取消订阅）
     * @param weatherObserver 观察者对象
     */
    void removeObserver(WeatherObserver weatherObserver);

    /**
     * 当主题的状态发生变化时，通知所有订阅主题的观察者
     */
    void notifyObservers();
}
