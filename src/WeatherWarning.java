class WeatherWarning implements Observer{
    private static final int umbral = 37;

    public void update (int temperatura) {
        if (temperatura > umbral) {
            System.out.println("¡Advertendia! La temperatura a superado los " + umbral + "°C");
        }
    }
}
