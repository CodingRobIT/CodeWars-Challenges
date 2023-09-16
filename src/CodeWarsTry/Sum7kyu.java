package CodeWarsTry;

public class Sum7kyu {

    public static int GetSum(int a, int b) {

        if (a == b) {
            return a;
        } else if (a < b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        } else {
            int sum = 0;
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {

        System.out.println(GetSum(-1,2)); // should be 2
        System.out.println(GetSum(-1,3)); // Should be 5

    }
}

// CodeWars Instruction

//    Given two integers a and b, which can be positive or negative,
//    find the sum of all the integers between and including them and return it.
//    If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//        Examples (a, b) --> output (explanation)
//        (1, 0) --> 1 (1 + 0 = 1)
//        (1, 2) --> 3 (1 + 2 = 3)
//        (0, 1) --> 1 (0 + 1 = 1)
//        (1, 1) --> 1 (1 since both are same)
//        (-1, 0) --> -1 (-1 + 0 = -1)
//        (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

// Other Codes on CodeWars

// This one is rly rly nice

//public class Sum
//{
//    public int GetSum(int a, int b)
//    {
//        return (a + b) * (Math.abs(a - b) + 1) / 2;
//    }
//}

// This oen wors with IntStream also nice

//import java.util.stream.IntStream;
//
//public class Sum {
//    public int GetSum(int a, int b) {
//        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
//    }
//}
