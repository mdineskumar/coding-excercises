package core_java_udemy.immutable;

public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = obj instanceof User;
        if(b) {
            User user = (User) obj;
            return (this.id == user.id && this.name.equals(user.name));
        }

        return false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
