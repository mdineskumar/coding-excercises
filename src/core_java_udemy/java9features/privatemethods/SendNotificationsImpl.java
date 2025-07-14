package core_java_udemy.java9features.privatemethods;

public class SendNotificationsImpl implements SendNotifications {

    public static void main(String[] args) {
        SendNotifications sendNotifications = new SendNotificationsImpl();
        sendNotifications.sendNotification();
        SendNotifications.sendNotifications();
    }
}
