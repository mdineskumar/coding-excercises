package headfirst_ooad.chapter10;

import java.util.Objects;

public class Connection {
    private String lineName;
    private Station station1, station2;

    public Connection(String lineName, Station station1, Station station2) {
        this.lineName = lineName;
        this.station1 = station1;
        this.station2 = station2;
    }

    public String getLineName() {
        return lineName;
    }

    public Station getStation1() {
        return station1;
    }

    public Station getStation2() {
        return station2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection that = (Connection) o;
        return Objects.equals(lineName, that.lineName) && Objects.equals(station1, that.station1) && Objects.equals(station2, that.station2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineName, station1, station2);
    }
}
