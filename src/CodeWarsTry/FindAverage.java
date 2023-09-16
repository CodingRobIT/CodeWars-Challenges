package CodeWarsTry;

public class FindAverage {

    public static double findAverage(int[] array) {  // Class Name in CodeWars should be find_average because the test are search for that Class not findAvarage
        if (array == null) {
            return 0; // Return 0 for a null array
        }

        double sum = 0;  // when here is int you can't get 3.5 or Something like that and CodeWars test will Fail
        for (int number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        int[] numbers2 = null; // Testing with a null array

        double average1 = findAverage(numbers1);
        double average2 = findAverage(numbers2);

        System.out.println("Average 1: " + average1); // Output: Average 1: 3
        System.out.println("Average 2: " + average2); // Output: Average 2: 0
    }
}
