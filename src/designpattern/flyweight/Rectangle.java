package designpattern.flyweight;

public class Rectangle extends Shape{
    private String label;

    //specific to rectangle
//    private int length;
//    private int breadth;
//    private String fillStyle;

    public Rectangle() {
        this.label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle){
        System.out.println("Drawing a "+label+ " with a length "+length + " Breadth "+breadth + " fill style "+fillStyle);

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
