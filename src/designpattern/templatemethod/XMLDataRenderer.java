package designpattern.templatemethod;

public class XMLDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "reading xml data";
    }

    @Override
    public String processData(String data) {
        return "processed xml data";
    }
}
