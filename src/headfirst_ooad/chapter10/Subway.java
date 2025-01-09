package headfirst_ooad.chapter10;

import java.sql.SQLOutput;
import java.util.*;

public class Subway {
    private List stations;
    private List connections;

    public Subway() {
        stations = new LinkedList();
        connections = new LinkedList();
    }

    public void addStation(String name){
        //validate
        if(!hasStation(name)){
            Station station = new Station(name);
            stations.add(station);
        }
    }

    public boolean hasStation(String name){
        return  stations.contains(new Station(name));
    }
    public boolean hasConnection(String station1Name, String station2Name, String lineName) {
        return connections.contains(new Connection(lineName,new Station(station1Name),new Station(station2Name)));
    }


    public void addConnection(String station1Name, String station2Name, String lineName) {
        //validate station1, station2
        if ( hasStation(station1Name) && hasStation(station2Name)){
            Station station1 = new Station(station1Name);//(Station) stations.get(station1Name.toLowerCase());
            Station station2 = new Station(station2Name);//(Station) stations.get(station2Name.toLowerCase());
            Connection  connection = new Connection(lineName,station1,station2);
            connections.add(connection);
            //subways run in both directions
            connections.add(new Connection(connection.getLineName(), station2,station1));
        }else{
            throw new RuntimeException("Invalid connection!");
        }

    }

}
