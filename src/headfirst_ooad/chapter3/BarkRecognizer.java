package headfirst_ooad.chapter3;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
    DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println(" Bark Recognizer heard a '"+bark+"'");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();

//            final Timer timer = new Timer();
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    door.close();
//                    timer.cancel();
//                }
//            }, 5000);
        }
    }
}
