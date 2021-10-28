public class Main {
    public static void main(String[] args) {
        WeatherWarnings weatherWarnings =new WeatherWarnings();
        AsianCity asianCity =new AsianCity("Chine" ,42);
        NorthAmericaCiity americaCiity = new NorthAmericaCiity("Alabama" , 120);
        Adapter adapter = new Adapter(asianCity);
weatherWarnings.postWarning(adapter);
weatherWarnings.postWarning(americaCiity);

    }
}
