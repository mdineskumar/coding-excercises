package core_java_udemy.inheritance.com.emc.test;

import com.sun.security.jgss.GSSUtil;
import core_java_udemy.inheritance.com.emc.entities.Event;
import core_java_udemy.inheritance.com.emc.entities.Organizer;
import core_java_udemy.inheritance.com.emc.manager.EventManager;
import core_java_udemy.inheritance.com.emc.manager.EventManagerImpl;

import java.util.function.DoubleToIntFunction;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.setId(123);
        organizer.setName("Dines");
        System.out.println(organizer);
        System.out.println("Organaizer name: "+organizer.getName());

        Event event = new Event(45611,"Ihopoe Lunch","Grand Launch");
        System.out.println(event.getDescription());

        EventManager em = new EventManagerImpl();
        Event event1 = em.create(134);
        System.out.println(event1.getId());

        EventManager em2 = new EventManagerImpl();
        Event event2 = em2.create(134);
        System.out.println(event2.getId());
        System.out.println(event2.getName());

    }
}
