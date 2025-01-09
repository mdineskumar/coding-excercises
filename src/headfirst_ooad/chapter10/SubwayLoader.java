package headfirst_ooad.chapter10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class SubwayLoader {
    private Subway subway;

    public SubwayLoader() {
        subway = new Subway();
    }

    public Subway loadFromFile(File subwayFile) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(subwayFile));
        loadStations(subway, reader);
        String lineName = reader.readLine();

        while(lineName!= null && lineName.length() > 0){
            loadLine(subway,reader,lineName);
            lineName = reader.readLine();
        }
        return subway;
    }

    public void loadLine(Subway subway, BufferedReader reader, String lineName) throws IOException{
        String station1Name, station2Name;
        station1Name = reader.readLine();
        station2Name = reader.readLine();
        while(station2Name != null && !station2Name.isEmpty()){
            subway.addConnection(station1Name,station2Name,lineName);
            station1Name = station2Name;
            station2Name = reader.readLine();
        }
    }


    public void loadStations(Subway subway, BufferedReader reader) throws IOException{
        String currentLine;
        currentLine = reader.readLine();
        while(currentLine.length() > 0){
            subway.addStation(currentLine);
            currentLine = reader.readLine();
        }
    }

}
