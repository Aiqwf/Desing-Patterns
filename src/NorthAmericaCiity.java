public class NorthAmericaCiity implements  City{

    private String name;
    private boolean hasWeatherWarning;
    private double tempurature;

    NorthAmericaCiity(String name ,double tempurature) {
        this.name=name;
        this.tempurature=tempurature;
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
        return "Faranhayd";
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
