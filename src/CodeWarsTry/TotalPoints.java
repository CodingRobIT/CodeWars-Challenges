package CodeWarsTry;
// TODO train that Code
public class TotalPoints {

    public static int points(String[] games) {
        int totalPoints = 0;

        for (String result : games) {
            String[] scores = result.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);

            if (ourScore > opponentScore) {
                totalPoints += 3; // Win
            } else if (ourScore == opponentScore) {
                totalPoints += 1; // Tie
            }
            // Loss condition (ourScore < opponentScore) doesn't need explicit handling, as it adds 0 points.
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        String[] matchResults = {"3:1", "2:2", "0:1", "1:0", "2:1", "1:2", "0:0", "3:3", "2:0", "0:2"};
        int totalPoints = points(matchResults);
        System.out.println("Total points: " + totalPoints); // Output: Total points: 15
                                                            // With "3:1", "2:2", "0:1", "1:0", "2:1", "1:2", "0:0", "3:3", "2:0", "0:2"
    }

}

// Found on CodeWars i Like that one

//public class TotalPoints {
//
//    public static int points(String[] games) {
//        int sum = 0;
//
//        for (String s : games) {
//            char x = s.charAt(0),
//                    y = s.charAt(2);
//
//            sum += x > y ? 3 : x == y ? 1 : 0;
//        }
//
//        return sum;
//    }
//}

