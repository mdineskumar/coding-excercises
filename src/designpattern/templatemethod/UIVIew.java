package designpattern.templatemethod;

public class UIVIew {
    public static void main(String[] args) {
        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.render();
    }
}
