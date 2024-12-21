package headfirst_ooad.chapter7;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    List<Unit> units;

    public Tile() {
        this.units = new ArrayList<>();
    }

    public void addUnit(Unit unit){
        this.units.add(unit);
    }

    public List<Unit> getUnits(){
        return units;
    }
}
