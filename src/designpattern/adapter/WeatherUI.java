package designpattern.adapter;

public class WeatherUI {
    public void showTemperature(int zipCode){
        //WeatherFinder finder = new WeatherFinderImpl();
       // finder.find();
        WeatherFinderAdapter adapter = new WeatherFinderAdapter();

        int temp = adapter.findTemperature(zipCode);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(19406);
    }

}
