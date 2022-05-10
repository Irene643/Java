public class Main {
    public static void main(String[] args) {
//    calculateScore("Tim", 800);
    int newScore = calculateScore("Tim", 800);
        System.out.println("New score = " +newScore);
        calculateScore(75);
        calculateScore("John", 100);
        calculateScore();

        calcFeetAndInchesToCentimeters(13, 1);
        calcFeetAndInchesToCentimeters(13);

        //Duration methods

//        getDurationString(3846);
//        System.out.println(getDurationString(45, 70));
        System.out.println(getDurationString(4598));
    }

    public static  int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName+ " scored "+ score +" points");
        return score * 1000;
    }

    //method with one parameter
    public static  int calculateScore(int score){
        System.out.println("Unnamed player scored "+ score +" points");
        return score * 1000;
    }

    //method with no parameters
    public static int calculateScore(){
        System.out.println("No player name, no score.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0 && inches <= 12)){

             float inchesToCentimeters = (float) (inches * 2.54);
             float feetToCentimeters = (float) (feet * 12 * 2.54);
            System.out.println("The converted feet is "+feetToCentimeters+ " and the converted inches is "+inchesToCentimeters);

            inchesToCentimeters += feetToCentimeters;
            System.out.println(inchesToCentimeters);

            return inchesToCentimeters;
        }
        System.out.println("Invalid feet or inches");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }
            double feet = (int) (inches / 12);
            System.out.println(feet);
            int remainderInches = (int) (inches % 12);
        System.out.println("The remaining inches is " +remainderInches);
            return calcFeetAndInchesToCentimeters(feet, inches);
    }

    //seconds and minutes challenge
    private static String getDurationString(long minutes, long seconds){

        if(minutes < 0 || (seconds < 0) || (seconds > 59)){
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
//        System.out.println(hours +"h ");
        String stringHours = hours + "h ";
        if(hours < 10){
            stringHours = "0"+ stringHours;
        }
        String stringMinutes = remainingMinutes + "m ";
        if(remainingMinutes < 10){
            stringMinutes = "0"+ stringMinutes;
        }
        String stringSeconds = seconds + "s";
        if(seconds < 10){
            stringSeconds = "0"+ stringSeconds;
        }
        return stringHours + " " + stringMinutes + " " + stringSeconds;
    }
    private static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
