package interview.objectorienteddesign.callcenter;

public abstract class Employee {
    private String name;
    private String jobTitle;
    private int age;
    private String address;
    protected Rank rank;
    private Call currentCall;

    public Employee(String name, String jobTitle, int age, String address) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.address = address;
    }

    public Employee(){

    }

    /*start conversation*/
    public void receiveCall(Call call){

    }

    /*the issue is resolved. finish the call*/
    public void callCompleted(){

    }

    /*the issues is not resolved. escalate the call, assign a new call to the employee*/
    public void escalateAndReassign(){

    }

    /*assign a new call to an employee. if the employee is free*/
    public boolean assignNewCall() {
        //usign call handler to gethandlerforcall

        return false;
    }
    /*returns whether the employee is free*/
    public boolean isFree() {
        return currentCall == null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
