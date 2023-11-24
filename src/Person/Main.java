package Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eingabe über die Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib deinen Namen ein:");
        String inputName = scanner.nextLine();

        System.out.println("Gib dein Alter ein:");
        int inputAge = scanner.nextInt();

        // Objekt erstellen (Person)
        Person person = new Person(inputName, inputAge);

        // Funktion aufrufen (PersonService)
        PersonService.sayHello(person);

        // Scanner schließen
        scanner.close();
    }
}
