public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Observer temperatureDisplay = new TemperatureDisplay();
        Observer weatherwarning = new WeatherWarning();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherwarning);

        weatherStation.setTemperature(19);
        weatherStation.setTemperature(41);
        }
    }
