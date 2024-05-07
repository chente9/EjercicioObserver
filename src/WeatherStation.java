import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Subject{

        private int temperature;
        private List<Observer> observers;

        public WeatherStation () {
            this.observers = new ArrayList<>();
        }
        public void setTemperature (int temperature) {
            this.temperature = temperature;
            notifyObervers();
        }

        public void addObserver (Observer observer) {
            observers.add(observer);
        }
        public void removeObserver (Observer observer) {
            observers.remove(observer);
        }

        public void notifyObervers() {
        for (Observer observer : observers) {
            observer.update(temperature);
            }

        }
    }

