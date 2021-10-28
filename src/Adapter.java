public class Adapter implements  City{


private City city;
Adapter(AsianCity asianCity ){
this.city=asianCity;

}

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public double getTempurature() {
        return city.getTempurature() *1.8+32;

}

    @Override
    public String getTempuratureScale() {
        return city.getTempuratureScale();
    }

    @Override
    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
city.setHasWeatherWarning(hasWeatherWarning);
    }
}
