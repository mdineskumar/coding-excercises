package oop.practical3;

public class ManagementStaff extends Employee implements TrainingEligible, OnlineLeaveUser{

    public ManagementStaff(String employeeId) {
        super(employeeId);
    }

    @Override
    void applyOnline(int days) {
        this.applyLeaveOnline(days);
    }

    @Override
    public void applyLeaveOnline(int days) {
        System.out.println("Management Staff "+employeeId + " applying for "+days+" days leave via ONLINE system.");
    }

    @Override
    public void requestTraining(String trainingName) {
        System.out.println("Management Staff "+employeeId+ " requested training: " +trainingName);
    }
}
