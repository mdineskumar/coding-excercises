package designpattern.flyweight;

public class PaintApp {

    public void render(int numberOfShapes){
        Shape[] shapes = new Shape[numberOfShapes+1];
        for(int i = 1; i < numberOfShapes; i++){
            if(i % 2 == 0){

                shapes[i] = ShapeFactory.getShape("circle");
//                Circle tempCircle = (Circle) shapes[i];
//                (tempCircle).setRadius(i);
//                (tempCircle).setLineColor("red");
//                (tempCircle).setFillColor("black");
                shapes[i].draw(i,"red","black");
            }else{
                shapes[i] = ShapeFactory.getShape("rectangle");
//                Rectangle tempRectangle = (Rectangle) shapes[i];
//                tempRectangle.setBreadth(i*2);
//                tempRectangle.setLength(i);
//                tempRectangle.setFillStyle("dotted");
                shapes[i].draw(i*2,i,"dotted");
            }
        }
    }
}
