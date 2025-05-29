package designpattern.adapter;

public class WeatherFinderAdapter {
    private WeatherFinder weatherFinder;

    public WeatherFinderAdapter(){
        weatherFinder = new WeatherFinderImpl();
    }

    public int findTemperature(int zipCode){
        String city = null;
        if(zipCode == 19406){
            city = "King of Prussia";
        }
        int temperature = weatherFinder.find(city);
        return temperature;
    }

}
