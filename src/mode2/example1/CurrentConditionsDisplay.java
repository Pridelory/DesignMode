package mode2.example1;

import mode2.GeneralInterface.DisplayElement;
import mode2.GeneralInterface.Observer;
import mode2.GeneralInterface.Subject;

import java.util.Observable;

/**
 * 告布板 -- 当前天气
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}