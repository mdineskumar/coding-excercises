package designpattern.factory.assignment;

public class PersonFactory {

    public static Person createPerson(String type){
        Person p = null;
        if(type.equals("male")){
            p = new Male();
        }else if(type.equals("female")){
            p = new Female();
        }
        return p;
    }
}
