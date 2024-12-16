package headfirst_ooad.chapter4;

import java.util.List;

public class BarkRecognizer {
    DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark){
        System.out.println(" Bark Recognizer heard a '"+bark.getSound()+"'");
        List<Bark> allowedBarks = door.getAllowedBarks();
        for(Bark allowedBark:allowedBarks){
            if(allowedBark.equals(bark)){
                door.open();
                return;
            }
        }
        System.out.println("This dog is not allowed!");
    }
}
