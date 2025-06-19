package core_java_udemy.inheritance.com.emc.manager;

import core_java_udemy.inheritance.com.emc.entities.Event;

public class EventManagerImpl implements EventManager {
    @Override
    public Event create(int id) {
        return new Event(id,null,null);
    }
}
