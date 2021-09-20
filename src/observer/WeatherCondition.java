package observer;

public class WeatherCondition implements Observer {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherCondition(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherCondition{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
