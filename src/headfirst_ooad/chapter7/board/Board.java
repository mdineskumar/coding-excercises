package headfirst_ooad.chapter7.board;

import headfirst_ooad.chapter7.Tile;
import headfirst_ooad.chapter7.Unit;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int width;
    int height;
    List tiles;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize(){
        tiles = new ArrayList(width);
        for (int j = 0; j < width; j++) {
            tiles.add(j, new ArrayList(height));
            for(int i = 0; i < height; i++){
                ((ArrayList)tiles.get(j)).add(j,new Tile());
            }

        }

    }
    public Tile getTile(int x, int y){
        return (Tile)((ArrayList)tiles.get(x-1)).get(y-1);
    }

    public void setUnit(int x, int y, Unit unit){
       Tile tile = getTile(x,y);
       tile.addUnit(unit);
    }
    public List<Unit> getUnit(int x, int y){
        return getTile(x,y).getUnits();
    }

    public void removeUnit(int x,int y,Unit unit){
        Tile tile = getTile(x,y);
        tile.removeUnit(unit);
    }
    public void removeUnits(int x, int y){
        Tile tile = getTile(x,y);
        tile.removeUnits();
    }

}
