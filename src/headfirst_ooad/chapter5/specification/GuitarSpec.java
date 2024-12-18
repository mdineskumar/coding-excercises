package headfirst_ooad.chapter5.specification;

import headfirst_ooad.chapter5.Builder;
import headfirst_ooad.chapter5.Type;
import headfirst_ooad.chapter5.Wood;

public class GuitarSpec extends InstrumentSpec {
  private int numStrings;
  public GuitarSpec(Builder builder, String model, Type type,
                    Wood backWood, Wood topWood, int numStrings) {
    super(builder, model, type, backWood, topWood);
    this.numStrings = numStrings;
  }
  public int getNumStrings() { return numStrings;}

  public boolean matches(InstrumentSpec searchSpec){
    if(!super.matches(searchSpec)){
      return false;
    }

    if(!(searchSpec instanceof GuitarSpec)){
      return false;
    }
    GuitarSpec spec = (GuitarSpec) searchSpec;
    if(numStrings != spec.getNumStrings()){
      return false;
    }

    return true;
  }
}
