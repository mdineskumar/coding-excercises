package designpattern.factory.assignment;

public class PersonTest {
    public static void main(String[] args) {
        PersonStore  personStore = new PersonStore();
        personStore.orderPerson("male");
        personStore.orderPerson("female");
    }
}
