package observer;

public class TestDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StaticCondition staticCondition = new StaticCondition(weatherData);
        WeatherCondition weatherCondition = new WeatherCondition(weatherData);
        weatherData.conditionChange(11,12,13);
        System.out.println(staticCondition);
        System.out.println(weatherCondition);
        weatherData.conditionChange(13,14,15);
        System.out.println(staticCondition);
        System.out.println(weatherCondition);
    }
}
