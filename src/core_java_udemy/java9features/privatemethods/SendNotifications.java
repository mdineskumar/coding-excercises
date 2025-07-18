package core_java_udemy.java9features.privatemethods;

public interface SendNotifications {
    static void sendNotifications(){
       // System.out.println("Establishing connection");
        establishConnection();
        System.out.println("sending multiple notifications");
    }
    default void sendNotification(){
        //System.out.println("Establishing connection");
        establishConnection();
        System.out.println("sending notification");
    }

    private static void establishConnection(){
        System.out.println("Establishing connection");
    }

}
