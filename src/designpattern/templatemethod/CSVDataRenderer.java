package designpattern.templatemethod;

public class CSVDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "reading csv data";
    }

    @Override
    public String processData(String data) {
        return "processed csv data";
    }
}
