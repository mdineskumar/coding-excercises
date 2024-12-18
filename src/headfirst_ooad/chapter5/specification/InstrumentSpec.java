package headfirst_ooad.chapter5.specification;

import headfirst_ooad.chapter5.Builder;
import headfirst_ooad.chapter5.Type;
import headfirst_ooad.chapter5.Wood;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    public InstrumentSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;

    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec searchSpec){
        if (searchSpec.getBuilder() != getBuilder())
            return false;
        String model = searchSpec.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(getModel().toLowerCase())))
            return false;
        if (searchSpec.getType() != getType())
            return false;
        if (searchSpec.getBackWood() != getBackWood())
            return false;
        if (searchSpec.getTopWood() != getTopWood())
            return false;
        return true;

    }
}
