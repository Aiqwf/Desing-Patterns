public class WeatherWarnings {
public static double MAX_TEMPURATURE = 100;
public static double MIN_TEMPURATURE=16;

public    void postWarning(City city) {

    if(city.getTempurature() >= MAX_TEMPURATURE || city.getTempurature()<=MIN_TEMPURATURE){
        System.out.println("Warning Current Tempurature at : "+city.getName()+" is: "+ city.getTempurature()+" "+city.getTempuratureScale());
    city.setHasWeatherWarning(true);
    }else {
        System.out.println("Tempurature is "+city.getName()+" is okey" );

    }

}


}
