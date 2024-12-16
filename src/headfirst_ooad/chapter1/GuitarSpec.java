package headfirst_ooad.chapter1;

public class GuitarSpec {
 
  private Builder builder; 
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;

  private int numStrings;
  public GuitarSpec(Builder builder, String model, Type type,
                    Wood backWood, Wood topWood, int numStrings) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
    this.numStrings = numStrings;
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

  public int getNumStrings() { return numStrings;}

  public static boolean compareSpec(GuitarSpec guitarSpec, GuitarSpec searchSpec){
    if (searchSpec.getBuilder() != guitarSpec.getBuilder())
      return false;
    String model = searchSpec.getModel().toLowerCase();
    if ((model != null) && (!model.equals("")) &&
            (!model.equals(guitarSpec.getModel().toLowerCase())))
      return false;
    if (searchSpec.getType() != guitarSpec.getType())
      return false;
    if (searchSpec.getBackWood() != guitarSpec.getBackWood())
      return false;
    if (searchSpec.getTopWood() != guitarSpec.getTopWood())
      return false;
    return true;

  }

  public boolean matches(GuitarSpec searchSpec){
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
