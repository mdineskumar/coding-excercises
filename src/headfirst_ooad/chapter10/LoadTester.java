package headfirst_ooad.chapter10;

import java.io.File;
import java.io.IOException;

public class LoadTester {


    public static void testStation(String expectedStationName,Subway subway){
        System.out.println("Testing stations");
        if(subway.hasStation(expectedStationName)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed: "+ expectedStationName + "doesnot exist.");
        }
    }

    public static void testConnection(String station1Name, String station2Name, String lineName, Subway subway){
        System.out.println("Testing connections.");
        if(subway.hasConnection(station1Name,station2Name,lineName)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed: Connection doesnot exist!");
        }
    }

    public static void main(String[] args) throws IOException {
        SubwayLoader subwayLoader = new SubwayLoader();
        Subway subway = subwayLoader.loadFromFile(new File("src/ObjectvilleSubway.txt"));

        testStation("DRY Drive",subway);
        testStation("Weather-O-Rama, Inc.",subway);
        testStation("Boards 'R' Us",subway);

       // testConnection("lineName3","station3","station6",subway);
        testConnection("DRY Drive", "Head First Theater", "Meyer Line",subway);
        testConnection("LSP Lane", "JavaBeans Boulevard", "Booch Line",subway);
        testConnection("OOA&D Oval", "Head First Labs", "Gamma Line",subway);


    }
}
