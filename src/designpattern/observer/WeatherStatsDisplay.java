package designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherStatsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Observable observable;

    public WeatherStatsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.humidity = humidity;
//        this.temperature =temperature;
//        display();
//    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
