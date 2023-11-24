package Person;

public class PersonService {
    public static void sayHello(Person person) {
        System.out.println("Hallo, du bist " + person.name + " und " + person.age + " Jahre alt.");
        System.out.println("Schön dich kennenzulernen.");
    }
}
