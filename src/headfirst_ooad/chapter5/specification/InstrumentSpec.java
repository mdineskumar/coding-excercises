package headfirst_ooad.chapter5.specification;

import headfirst_ooad.chapter5.Builder;
import headfirst_ooad.chapter5.Type;
import headfirst_ooad.chapter5.Wood;

import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
//    private Builder builder;
//    private String model;
//    private Type type;
//    private Wood backWood;
//    private Wood topWood;
    Map properties;

    public InstrumentSpec(Map properties) {
        this.properties = properties;
    }

    public Object getProperty(String property){
        return properties.get(property);
    }

    public Map getProperties(){
        return properties;
    }

    public boolean matches(InstrumentSpec searchSpec){
        for (Iterator i = searchSpec.getProperties().keySet().iterator();
             i.hasNext(); ) {
            String propertyName = (String)i.next();
            Object o1 = properties.get(propertyName);
            Object o2 = searchSpec.getProperty(propertyName);

            if (!properties.get(propertyName).equals(
                    searchSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;

    }
}
