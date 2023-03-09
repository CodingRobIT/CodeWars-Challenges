import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void even_or_odd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }
}



