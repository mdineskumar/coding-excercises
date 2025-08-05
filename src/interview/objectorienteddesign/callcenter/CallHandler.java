package interview.objectorienteddesign.callcenter;

import core_java_udemy.access_modifiers.p2.C;

import java.util.List;

public class CallHandler {
    /*3 levels of employees: respondent, manager, director*/
    private final int LEVELS = 3;

    /*intialize 10 respondents, 4 managers, and 2 directors.*/
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;


    /*list of employees by level
    * employeeLevel[0] = respondents
    * employeeLevel[1] = managers
    * employeeLevel[2] = directors
    * */

    List<List<Employee>> employeeLevels;

    /*queues for each call's rank*/
    List<List<Call>> callQueues;

    public CallHandler(){

    }
    /*Gets the first available employee who can handle this call.*/
    public Employee getHandlerForCall(Call call){
        return new Respondent();
    }

    /*routes the call to an available employee,
    or saves in a queue if no employee is available*/
    public void dispatchCall(Caller caller) {
        Call call = new Call(caller);
        dispatchCall(call);
    }

    /*routes the call to an available employee,
    * or saves in a queue if no employee is available*/
    public void dispatchCall(Call call){
        /*try to route the call to an employee with minimal rank.*/
        Employee emp = getHandlerForCall(call);
        if(emp!= null) {
            emp.receiveCall(call);
            call.setHanlder(emp);

        }else{
            /*place the call into corresponding call queue according to its rank.*/
            call.reply("Please wait for free employee to reply");
            callQueues.get(call.getRank()).add(call);
        }
    }


    /*an employee got free. look for a waiting call that employee can serve.
    * return true if we assigned a call, false otherwise.*/
    public boolean assignCall(Employee employee){
        return false;
    }


}
