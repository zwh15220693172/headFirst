package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private final ArrayList<Observer> list;

    public WeatherData(){
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void conditionChange(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(temp,humidity,pressure);
        }
    }
}
