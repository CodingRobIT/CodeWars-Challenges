import org.jetbrains.annotations.Contract; // Wurde von IntelliJ vorgeschlagen
import org.jetbrains.annotations.NotNull; // Wurde von IntelliJ vorgeschlagen

public class EvenOrOdd {
    @Contract(pure = true) // Wurde von IntelliJ vorgeschlagen
    public static @NotNull String even_or_odd(int number) {
        if (number % 2 == 0) {
            return ("Even");
        } else {
            return "Odd";
        }
    }
}
