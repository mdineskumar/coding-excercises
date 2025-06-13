package core_java_udemy.inheritance.com.dines.inheirtance;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(1,"John","Travel",10000, new String[] {"Flight Reservation","Check IN"},3000);
        System.out.println(manager.id);
        System.out.println(manager.salary);
        manager.work();
    }
}
