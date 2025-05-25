package designpattern.factory.assignment;

public class PersonStore {
    public void orderPerson(String type){
        Person p = PersonFactory.createPerson(type);

        p.wish("HI from person store");

    }
}
