package designpattern.flyweight;

public class Circle extends Shape{
    private String label;
//    private int radius;
//    private String fillColor;
//    private String lineColor;

    public Circle() {
        this.label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a "+label+ " with a radius "+radius + " fill color "+fillColor + " line color "+lineColor);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
