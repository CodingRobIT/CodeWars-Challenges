package CodeWarsTry;

public class OppositeNumber {

    public static int opposite(int number)
    {
        // an - for "number" int or double or float and so on, will negate the number to the opposite, so -1 will be 1 and 30 will be -30. while just "return number" would return the number.
        return -number;
    }

    public static double oppositeDouble(double number)
    {
        return -number;
    }

    public static void main(String[] args) {
        int opposite = opposite(1); // This will give you -1
        int opposite2 = opposite(-34); // This will give you 34
        double oppositeDouble1 = oppositeDouble(5.5546);
        double oppositeDouble2 = oppositeDouble(-412.31254);

        System.out.println("int = " + opposite);
        System.out.println("int = " + opposite2);
        System.out.println("double = " + oppositeDouble1);
        System.out.println("double = " + oppositeDouble2);

    }
}
