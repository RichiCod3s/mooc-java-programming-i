import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // Try out your class here
           // Test the Message class
        Message message1 = new Message("John", "Hello, how are you?");
        Message message2 = new Message("Alice", "I'm fine, thank you!");

        System.out.println("Message 1: " + message1);
        System.out.println("Message 2: " + message2);

        System.out.println("Are messages equal? " + message1.equals(message2));

        // Test the MessagingService class
        MessagingService messagingService = new MessagingService();

        // Add messages to the service
        messagingService.add(message1);
        messagingService.add(message2);

        // Get and display messages from the service
        ArrayList<Message> messages = messagingService.getMessages();
        System.out.println("\nMessages from the service:");
        for (Message message : messages) {
            System.out.println(message);
        }

        // Test adding a message exceeding the character limit
        Message longMessage = new Message("Bob", "This is a very long message exceeding 280 characters."
                + "It should not be added to the service.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
                + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
                + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
                + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        messagingService.add(longMessage);

        // Display updated messages from the service
        messages = messagingService.getMessages();
        System.out.println("\nUpdated messages from the service:");
        for (Message message : messages) {
            System.out.println(message);
        }
    }
}
