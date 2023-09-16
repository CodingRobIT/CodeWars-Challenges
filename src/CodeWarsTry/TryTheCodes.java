package CodeWarsTry;

// This class exists only for testing various code challenges.
// Because of this, it is mostly half or not complete or without function.
public class TryTheCodes {

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
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        String[] matchResults = {"3:1", "2:2"};
        int totalPoints = points(matchResults);
        System.out.println("Total points: " + totalPoints);

    }

}


