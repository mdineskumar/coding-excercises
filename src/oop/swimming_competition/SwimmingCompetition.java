package oop.swimming_competition;

public class SwimmingCompetition {

    public static void main(String[] args) {
        SwimmingPool swimmingPool = new SwimmingPool();

        Swimmer swimmer1 = new Swimmer(Gender.Male, "Jack");
        Swimmer swimmer2 = new Swimmer(Gender.Female, "ROse");
        Swimmer swimmer3 = new Swimmer(Gender.Male, "Daniel");
        Swimmer swimmer4 = new Swimmer(Gender.Male, "Mark");
        Swimmer swimmer5 = new Swimmer(Gender.Female, "Mary");

        Judges judge1 = new Judges("Judge1");

        swimmingPool.assignPlayerToLane(0,swimmer1);
        swimmingPool.assignPlayerToLane(1,swimmer2);
        swimmingPool.assignPlayerToLane(2,swimmer3);
        swimmingPool.assignPlayerToLane(3,swimmer4);
        swimmingPool.assignPlayerToLane(4,swimmer5);



    }
}


class SwimmingPool{
    SwimmingLane[] swimmingLanes;

    public SwimmingPool(){
        swimmingLanes = new SwimmingLane[5];
        System.out.println("Creating swimming lanes...");
    }

    public void assignPlayerToLane(int index, Swimmer swimmer){
        if( index < swimmingLanes.length){
            System.out.println("Assigning swimming lane: "+index+ "to swimmer: "+swimmer.name);
            swimmingLanes[index].setSwimmer(swimmer);
        }
    }
}

class SwimmingLane{
    Swimmer swimmer;
    TouchPad touchPad;
    public SwimmingLane(){
        touchPad = new TouchPad();
    }
    public void setSwimmer(Swimmer swimmer) {
        this.swimmer = swimmer;
    }
}

abstract class Participants{
    String name;

    public Participants(String name) {
        this.name = name;
    }
}

class Spectators extends Participants{

    public Spectators(String name) {
        super(name);
    }
}

class Judges extends Participants{

    Whistle whistle;

    public Judges(String name) {
        super(name);
        whistle = new Whistle();
    }

    public void blowWhistle(){
        whistle.blow();
    }
}

class Whistle{
    public void blow(){
        System.out.println("Whistle is blowing");
    }
}
class Swimmer extends Participants{
    Gender gender;
    TouchPad touchPad;

    public Swimmer(Gender gender,String name) {
        super(name);
        this.gender = gender;

    }

    public void setTouchPad(TouchPad touchPad) {
        this.touchPad = touchPad;
    }

    public void startSwimming(){

    }
    public void endSwimming(){

        notifyTouchpad();
    }

    public void notifyTouchpad(){
        touchPad.touch(this);
    }
}

class TouchPad{
    Long timeStamp;
    ScoreBoard scoreBoard;

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public void notifyScoreBoard(Long timeStamp, Swimmer swimmer){
        if (this.scoreBoard != null){
            this.scoreBoard.addPlayerTime(timeStamp,swimmer);
        }
    }

    public void touch(Swimmer swimmer) {
        timeStamp =  System.currentTimeMillis();
        notifyScoreBoard(timeStamp,swimmer);
    }
}



class ScoreBoard{
    public void addPlayerTime(Long timeStamp, Swimmer swimmer) {

    }
    public void calculateWinner() {

    }
}

enum Gender{
    Male,
    Female
}
