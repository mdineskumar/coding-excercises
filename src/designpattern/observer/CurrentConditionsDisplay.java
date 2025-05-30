package designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;

    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

//        weatherData.registerObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.humidity = humidity;
//        this.temperature =temperature;
//        display();
//    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
