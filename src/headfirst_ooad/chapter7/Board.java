package headfirst_ooad.chapter7;

import java.util.List;

public class Board {
    int width;
    int height;
    Tile[][] tiles;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new Tile[height][width];
        setTilesToBaord();
    }

    public void setTilesToBaord(){
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile();
            }
        }

    }

    public Tile getTile(int x, int y){
        return tiles[y][x];
    }

    public void setUnit(int x, int y, Unit unit){
        tiles[y][x].addUnit(unit);
    }

    public List<Unit> getUnit(int x, int y){
        return tiles[y][x].getUnits();
    }





}
