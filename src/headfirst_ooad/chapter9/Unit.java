package headfirst_ooad.chapter9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {
    int id;
    String type;
    String name;
    List weapons;
    Map properties;

    public Unit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addWeapon(Weapon weapon){
        //we wait until there is need for a weapons list to instantiate a new list.
        //That saves little bit of memory, especially when there may be thousands of units.
        if(weapons == null){
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String property, Object value){
        //just like the weapons list, we dont create a Hashmap for properties until it's needed.
        if(properties == null){
            properties = new HashMap();
        }
        properties.put(property,value);
    }

    public Object getProperty(String property) {
        //since properties might not be initialized,
        // there's an extra check here before looking up a property's value.
        if (properties == null){
//            throw new IllegalAccessException("What are you doing? No properties!");
            return null;
        }
        Object value = properties.get(property);
        if (value == null){
//            throw new IllegalAccessException("You're screwing up! No property value!");
            return null;
        }else{
            return value;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
