package RandomStuff;

import java.util.Scanner;

public class Person1 {
    String name;
    int age;

    // Konstruktor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Beispiel-Funktion
    public void sayHello() {
        System.out.println("Hallo, du bist " + name + " und " + age + " Jahre alt.");
        System.out.println("schön dich kennenzulernen");
    }

    public static void main(String[] args) {
        // Eingabe über die Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib deinen Namen ein:");
        String inputName = scanner.nextLine();

        System.out.println("Gib dein Alter ein:");
        int inputAge = scanner.nextInt();

        // Objekt erstellen
        Person1 person = new Person1(inputName, inputAge);

        // Funktion aufrufen
        person.sayHello();

        // Scanner schließen
        scanner.close();
    }
}
