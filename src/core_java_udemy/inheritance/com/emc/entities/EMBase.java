package core_java_udemy.inheritance.com.emc.entities;

public class EMBase {
    protected long id;
    protected String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public EMBase(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
