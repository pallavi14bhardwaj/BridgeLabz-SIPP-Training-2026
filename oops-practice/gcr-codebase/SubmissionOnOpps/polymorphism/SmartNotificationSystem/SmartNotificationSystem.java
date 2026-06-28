package oppsPracticeProblem.polymorphism.SmartNotificationSystem;
public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = new Notification[3];

        notifications[0] =
                new EmailNotification("Apeksha", "Your assignment is uploaded.");

        notifications[1] =
                new SMSNotification("Rahul", "Your OTP is 123456.");

        notifications[2] =
                new PushNotification("Priya", "You have a new friend request.");

        System.out.println("Sent Notifications:\n");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}