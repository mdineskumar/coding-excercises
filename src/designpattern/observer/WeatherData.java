package designpattern.observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
//    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
//        this.observers = new ArrayList<>();
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers(this);
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

//    @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0) {
//            observers.remove(o);
//        }
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (int i = 0; i < observers.size(); i++) {
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature,humidity,pressure);
//        }
//    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
