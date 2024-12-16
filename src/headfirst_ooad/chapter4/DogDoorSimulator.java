package headfirst_ooad.chapter4;

public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("woof"));
    door.addAllowedBark(new Bark("rowlf"));
    door.addAllowedBark(new Bark("rooowlf"));
    door.addAllowedBark(new Bark("rawlf"));

    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);
    //simulate the hardware hearing a bark
    System.out.println("Bruce starts barking...");
    recognizer.recognize(new Bark("rowlf"));

    System.out.println("\nBruce has gone outside...");
    try{
      Thread.currentThread().sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("\nBruce's all done...");
    System.out.println(" but he is stuck outside.!");

    //simulate the hardware hearing bark(not bruce)
    System.out.println("the small dog starts barking...");
    Bark smallDogBark = new Bark("yip");
    recognizer.recognize(smallDogBark);
    try{
      Thread.currentThread().sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    //simulate the hardware hearing a bark(bruce) again
    System.out.println("Bruce starts barking...");
    recognizer.recognize(new Bark("rooowlf"));
    System.out.println("\nBruce's back inside...");
  }
}
