package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String,Shape> shapes = new HashMap<>();

    static Shape getShape(String type){
        Shape shape = null;
        if (shapes.get(type) != null){
            shape = shapes.get(type);
        }else{
            if (type.equals("circle")){
                shape = new Circle();

            }else if(type.equals("rectangle")){
                shape = new Rectangle();
            }
            shapes.put(type,shape);
        }

        return shape;
    }
}
