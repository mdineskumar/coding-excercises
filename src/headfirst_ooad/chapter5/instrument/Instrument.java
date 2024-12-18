package headfirst_ooad.chapter5.instrument;

import headfirst_ooad.chapter5.specification.InstrumentSpec;

public abstract class Instrument {
    String serialNumber;
    Double price;

    InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, Double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
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
