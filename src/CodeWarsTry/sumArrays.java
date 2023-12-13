package CodeWarsTry;

public class sumArrays {

    // double version
    public static double sum(double[] numbersDouble) {
        double sum = 0.0; //sum wird hier initialisiert mit dem wert 0.0

        // hier wird int i als 0 Initialisiert und mit der länge der nummer "numbers" wird
        // durch i++ der wert um 1 erhöt. Dadurch wird durch die zahlen (das Array double[]) durch iteriert
        for (int i = 0; i < numbersDouble.length; i++) {
            sum += numbersDouble[i]; // hier wird dann zu sum je die neue nummer "numbers" addiert
        }

        return sum; //hier wird dann, wenn die for Schleife fertig ist die gesamt summe "sum" ausgegeben
    }

    // float version
        public static float sum(float[] numbersFloat) {
            float sum = 0.0f; // sum wird hier initialisiert mit dem Wert 0.0

            // hier wird int i als 0 initialisiert und mit der Länge der Nummer "numbers" wird
            // durch i++ der Wert um 1 erhöht. Dadurch wird durch die Zahlen (das Array float[]) iteriert
            for (int i = 0; i < numbersFloat.length; i++) {
                sum += numbersFloat[i]; // hier wird dann zu sum jede neue Zahl "numbers" addiert
            }

            return sum; // hier wird dann, wenn die for-Schleife fertig ist, die Gesamtsumme "sum" ausgegeben
        }


    // Für CodeWars nicht relevant ist nur zum Darstellen
    public static void main(String[] args) {

        double[] numbersOfDouble = {1.5, 2.0, 3.2, 0.84674};
        double resultOfDouble = sum(numbersOfDouble);
        System.out.println("Die Summe der Double Zahlen ist: " + resultOfDouble);

        float[] numbersOfFloat = {1.5f, 2.0f, 3.2f, 0.84674f};
        float resultOfFloat = sum(numbersOfFloat);
        System.out.println("Die Summe der Float Zahlen ist: " + resultOfFloat);
    }
}

// Alternativ zu der for schleife oben
//        for (double number : numbers) {
//            sum += number;
//        }

// extrem Clever ist Folgender Code
//public static double sum(double[] numbers) {
//    return Arrays.stream(numbers).sum();
//}