package core_java_udemy.inheritance.com.emc;

public class Event  extends EMBase{
    String description;
    String startTime;
    String endTime;
    boolean started;

    public Event(long id, String name, String description){
       // super(id,name);
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
