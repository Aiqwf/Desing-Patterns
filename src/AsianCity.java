public class AsianCity implements  City{
private String name;
private double tempurature;
private boolean hasWeatherWarning;

public AsianCity(String name  , double tempurature){
    this.name=name;
    this.tempurature= tempurature;
    hasWeatherWarning=false;
 }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTempurature() {
        return tempurature;
    }

    @Override
    public String getTempuratureScale() {
        return "Celcies";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return hasWeatherWarning;
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
this.hasWeatherWarning=hasWeatherWarning;
    }
}
