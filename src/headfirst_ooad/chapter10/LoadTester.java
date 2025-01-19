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

    public static void main(String[] args) {
        try {
            SubwayLoader loader = new SubwayLoader();
            Subway objectville = loader.loadFromFile(new File("src/ObjectvilleSubway.txt"));

            System.out.println("Testing stations");
            if (    objectville.hasStation("DRY Drive") &&
                    objectville.hasStation("Weather-O-Rama, Inc.") &&
                    objectville.hasStation("Boards 'R' Us")) {
                System.out.println("... station test passed successfully.");
            }
            else
            {
                System.out.println("...station test FAILED.");
                System.exit(-1);
            }

            System.out.println("\nTesting connections...");
            if (objectville.hasConnection("DRY Drive", "Head First Theater", "Meyer Line") &&
                    objectville.hasConnection("LSP Lane", "JavaBeans Boulevard", "Booch Line") &&
                    objectville.hasConnection("OOA&D Oval", "Head First Labs", "Gamma Line")) {
                System.out.println("...connections test passed succesfully.");
            }
            else
            {
                System.out.println("...connections test FAILED");
                System.exit(-1);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
}
