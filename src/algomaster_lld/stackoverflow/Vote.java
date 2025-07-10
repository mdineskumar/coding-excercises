package algomaster_lld.stackoverflow;

public class Vote {

    int value;
    User user;

    public Vote(int value, User user) {
        this.value = value;
        this.user = user;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "value=" + value +
                ", user=" + user +
                '}';
    }
}
