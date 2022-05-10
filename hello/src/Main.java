public class Main {
    public static void main(String[] args) {
//        int marks = 100;
//        if (marks > 99) {
//            System.out.println("You scored a high grade");
//            marks = 0;
//        }
//        boolean gameOver = true;
//        int score = 1500;
//        int levelCompleted = 5;
//        int bonus = 100;
//         if( score == 5000 ){
//             System.out.println("Your score was 5000");
//         } else if ( score < 5000 && score >4000) {
//             System.out.println("your score was less than 5000 but greater than 4000");
//         }else{
//             System.out.println("Got here!");
//         }
//         if(gameOver == true){
//             int finalScore = score + (levelCompleted * bonus);
//             System.out.println("Your final score =" + finalScore);
//         }

         int highScore = calculateScore(true, 800, 5, 100);
         System.out.println("Your score is " + highScore);
         calculateScore(true, 10000, 8, 200);

        int calculateHighScorePosition = calculateHighScorePosition(1500);
        displayHighScores ("John", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(900);
        displayHighScores ("Doe", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(400);
        displayHighScores ("Mary", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(50);
        displayHighScores ("Johndoe", calculateHighScorePosition);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
    public static void displayHighScores(String playerName, int position){
        System.out.println(playerName+" managed to get into position "+ position +" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        }else if ((playerScore >= 500) && (playerScore < 1000)){
            position = 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            position = 3;
        }
        return position;
    }

}
