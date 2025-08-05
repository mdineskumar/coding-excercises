package interview.objectorienteddesign.callcenter;

public class Call {
    /*person who is calling*/
    private Caller caller;

    /*person who is handling the call*/
    private Employee hanlder;


    /*Minimal rank of employee who can handle this call*/
    private Rank rank;

    public Call(Caller caller){
        this.caller = caller;
        rank = Rank.RESPONDENT;
    }

    /*set employee who is handling call*/
    public void setHanlder(Employee hanlder) {
        this.hanlder = hanlder;
    }

    public void reply(String message){

    }

    public void setRank(Rank rank) {

    }

    public int getRank(){
        return this.rank.ordinal();
    }

    public void incrementRank() {

    }

    public void disconnect(){

    }
}
