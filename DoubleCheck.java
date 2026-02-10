public class DoubleCheck {
    public static void main(String[] args) {
        double cityRainfall, measuredRain;
        cityRainfall = 15.5;
        measuredRain = 5.5;
        cityRainfall = measuredRain - 5.0;
        System.out.println(cityRainfall); 

    }
}