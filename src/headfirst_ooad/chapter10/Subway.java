package headfirst_ooad.chapter10;

import java.sql.SQLOutput;
import java.util.*;

public class Subway {
    private List stations;
    private List connections;
    private Map network;

    public Subway() {
        stations = new LinkedList();
        connections = new LinkedList();
        this.network = new HashMap();
    }

    public void addStation(String name) {
        //validate
        if (!hasStation(name)) {
            Station station = new Station(name);
            stations.add(station);
        }
    }

    public boolean hasStation(String name) {
        return stations.contains(new Station(name));
    }

    public boolean hasConnection(String station1Name, String station2Name, String lineName) {
        return connections.contains(new Connection(lineName, new Station(station1Name), new Station(station2Name)));
    }


    public void addConnection(String station1Name, String station2Name, String lineName) {
        //validate station1, station2
        if (hasStation(station1Name) && hasStation(station2Name)) {
            Station station1 = new Station(station1Name);//(Station) stations.get(station1Name.toLowerCase());
            Station station2 = new Station(station2Name);//(Station) stations.get(station2Name.toLowerCase());
            Connection connection = new Connection(lineName, station1, station2);
            connections.add(connection);
            //subways run in both directions
            connections.add(new Connection(connection.getLineName(), station2, station1));
            addToNetwork(station1, station2);
            addToNetwork(station2, station1);
        } else {
            throw new RuntimeException("Invalid connection!");
        }

    }

    private void addToNetwork(Station station1, Station station2) {
        if (network.keySet().contains(station1)) {
            List connectingStations = (List) network.get(station1);
            if (!connectingStations.contains(station2)) {
                connectingStations.add(station2);
            }
        } else {
            List connectingStations = new LinkedList();
            connectingStations.add(station2);
            network.put(station1, connectingStations);
        }
    }

    public List getDirections(String startStationName, String endStationName) {
        if (!this.hasStation(startStationName) || !this.hasStation(endStationName)) {
            throw new RuntimeException("Stations entered do not exist on this subway");
        }

        Station start = new Station(startStationName);
        Station end = new Station(endStationName);
        List route = new LinkedList();
        List reachableStations = new LinkedList();
        Map previousStations = new HashMap();
        List neighbors = (List) network.get(start);

        for (Iterator i = neighbors.iterator(); i.hasNext(); ) {
            Station station = (Station) i.next();
            if (station.equals(end)) {
                route.add(getConnection(start, end));
                return route;
            } else {
                reachableStations.add(station);
                previousStations.put(station, start);
            }
        }

        List nextStations = new LinkedList();
        nextStations.addAll(neighbors);
        Station currentStation = start;

        searchLoop:
        for (int i = 1; i < stations.size(); i++) {
            List tmpNextStations = new LinkedList();
            for (Iterator j = nextStations.iterator(); j.hasNext(); ) {
                Station station = (Station) j.next();
                reachableStations.add(station);
                currentStation = station;
                List currentNeighbors = (List) network.get(currentStation);
                for (Iterator k = currentNeighbors.iterator(); k.hasNext(); ) {
                    Station neighbor = (Station) k.next();
                    if (neighbor.equals(end)) {
                        reachableStations.add(neighbor);
                        previousStations.put(neighbor, currentStation);
                        break searchLoop;
                    } else if (!reachableStations.contains(neighbor)) {
                        reachableStations.add(neighbor);
                        tmpNextStations.add(neighbor);
                        previousStations.put(neighbor, currentStation);
                    }
                }
            }
            nextStations = tmpNextStations;
        }

        //We've found the path now!
        boolean keepLooping = true;
        Station keyStation = end;
        Station station;

        while (keepLooping) {
            station = (Station) previousStations.get(keyStation);
            route.add(0, getConnection(station, keyStation));
            if (start.equals(station)) {
                keepLooping = false;
            }
            keyStation = station;
        }

        return route;
    }

    private Connection getConnection(Station station1, Station station2) {
        for (Iterator i = connections.iterator(); i.hasNext(); ) {
            Connection connection = (Connection) i.next();
            Station one = connection.getStation1();
            Station two = connection.getStation2();
            if ((station1.equals(one)) && station2.equals(two)) {
                return connection;
            }
        }
        return null;
    }


}
