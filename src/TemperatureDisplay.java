public class TemperatureDisplay implements Observer{

    public void update (int temperatura) {
        System.out.println("La termperatura actual " + temperatura + "°C");

    }
}
