package headfirst_ooad.chapter7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tile {
    List units;

    public Tile() {
        this.units = new LinkedList();
    }

    public void addUnit(Unit unit){
        this.units.add(unit);
    }

    public void removeUnit(Unit unit){
        this.units.remove(unit);
    }

    public List getUnits(){
        return units;
    }

    public void removeUnits() {
    //TODO: need to implement
    }
}
