package headfirst_ooad.chapter5.instrument;

import headfirst_ooad.chapter5.InstrumentType;
import headfirst_ooad.chapter5.specification.InstrumentSpec;

public class Instrument {
    String serialNumber;
    Double price;

   // InstrumentType instrumentType;
    InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, Double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
        //this.
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }
}
