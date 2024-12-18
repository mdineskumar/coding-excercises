package headfirst_ooad.chapter5.specification;

import headfirst_ooad.chapter5.Builder;
import headfirst_ooad.chapter5.Style;
import headfirst_ooad.chapter5.Type;
import headfirst_ooad.chapter5.Wood;
import headfirst_ooad.chapter5.specification.InstrumentSpec;

public class MandolinSpec extends InstrumentSpec {
    Style style;
    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public boolean matches(InstrumentSpec searchSpec){
        if(!super.matches(searchSpec)){
            return false;
        }

        if(!(searchSpec instanceof MandolinSpec)){
            return false;
        }
        MandolinSpec spec = (MandolinSpec) searchSpec;
        if(!style.equals(spec.style)){
            return false;
        }

        return true;
    }
}
