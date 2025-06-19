package core_java_udemy.inheritance.com.emc.entities;

public class Participant  extends EMBase{
    private String email;
    private boolean checkedIn;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
}
