package RandomStuff

import java.util.Scanner

class Person(val name: String, val age: Int) {

    // Beispiel-Funktion
    fun sayHello() {
        println("Hallo, du bist $name und $age Jahre alt.")
        println("Schön dich kennenzulernen.")
    }
}

fun main() {
    // Eingabe über die Konsole
    val scanner = Scanner(System.`in`)

    println("Gib deinen Namen ein:")
    val inputName = scanner.nextLine()

    println("Gib dein Alter ein:")
    val inputAge = scanner.nextInt()

    // Objekt erstellen
    val person = Person(inputName, inputAge)

    // Funktion aufrufen
    person.sayHello()

    // Scanner schließen
    scanner.close()
}
