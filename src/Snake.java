import java.util.Scanner;

public class Snake {
    private static boolean encryptionStarted = false;

    public static void main(String[] args) {
        connect();
        startEncryption();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your codename, Snake: ");
        String codename = scanner.nextLine();
        System.out.println("Codec: Connection established, " + codename + ".");

        boolean continueConversation = true;

        while (continueConversation) {
            System.out.println("Choose who to contact:");
            System.out.println("1. Otacon");
            System.out.println("2. Colonel");
            System.out.println("3. Support");
            System.out.println("4. Sniper Wolf");
            System.out.println("5. Revolver Ocelot");
            System.out.println("0. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Codec: Otacon, any sightings of the enemy?");
                    String messageToOtacon = sendMessage("Otacon, any sightings of the enemy?");
                    System.out.println("Otacon: " + receiveMessage(messageToOtacon));
                    break;
                case 2:
                    System.out.println("Codec: Colonel, I need a status update.");
                    String messageToColonel = sendMessage("Colonel, I need a status update.");
                    System.out.println("Colonel: " + receiveMessage(messageToColonel));
                    break;
                case 3:
                    System.out.print("Codec: Snake, any additional requests? ");
                    String additionalRequest = scanner.nextLine();
                    String messageToSupport = sendMessage("Support, " + codename + " needs " + additionalRequest);
                    System.out.println("Support: " + receiveMessage(messageToSupport));
                    break;
                case 4:
                    System.out.println("Codec: Sniper Wolf, report on enemy movement.");
                    String messageToSniperWolf = sendMessage("Sniper Wolf, report on enemy movement.");
                    System.out.println("Sniper Wolf: " + receiveMessage(messageToSniperWolf));
                    break;
                case 5:
                    System.out.println("Codec: Ocelot, any intel on the enemy's plans?");
                    String messageToOcelot = sendMessage("Ocelot, any intel on the enemy's plans?");
                    System.out.println("Ocelot: " + receiveMessage(messageToOcelot));
                    break;
                case 0:
                    continueConversation = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        endEncryption();
        disconnect();
        scanner.close();
    }

    private static void connect() {
        System.out.println("Codec connected. Establishing secure channel...");
    }

    private static void startEncryption() {
        if (!encryptionStarted) {
            System.out.println("Encryption protocol initiated. Securing communication.");
            encryptionStarted = true;
        }
    }

    private static String sendMessage(String message) {
        return "ENCRYPTED: " + message;
    }

    private static String receiveMessage(String encryptedMessage) {
        return encryptedMessage.replace("ENCRYPTED: ", "");
    }

    private static void endEncryption() {
        if (encryptionStarted) {
            System.out.println("Encryption protocol terminated. Communication secured.");
            encryptionStarted = false;
        }
    }

    private static void disconnect() {
        System.out.println("Codec disconnected. Mission accomplished.");
    }
}
