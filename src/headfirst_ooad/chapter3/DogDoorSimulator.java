package headfirst_ooad.chapter3;

public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);

    System.out.println("Fido starts barking...");
    recognizer.recognize("woof");
    System.out.println("\nFido has gone outside...");
    System.out.println("\nFido's all done...");

    try{
      Thread.currentThread().sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(" but he is stuck outside.!");
    System.out.println("Fido starts barking...");
    recognizer.recognize("woof");

    System.out.println("\nFido's back inside...");
  }
}
