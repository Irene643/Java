public class Main {
    public static void main(String[] args) {

        //using if statement
        int value = 12;
        if(value == 1){
            System.out.println("the value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was neither 1 nor 2");
        }
        //switch statement
        int switchValue = 4;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was either 3, 4, or 5");
                System.out.println("Actual value was "+ switchValue);
                break;
            default:
                System.out.println("Value was neither 1 nor 2");
                break;
        }
        //switch statement challenge
        char switchChallengeValue = 'E';
        switch (switchChallengeValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchChallengeValue +" was found");
                break;
            default:
                System.out.println("Not found");
        }
        //string values
        String month = "djzna";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
        printDayOfTheWeek(-1);
        printDaysOfTheWeekIf(6);
        printNumberInWord(9);
        isLeapYear(1924);
        isLeapYear(-2015);
        isLeapYear(6);
        getDaysInMonth(2, 2016);

        //loop
        for(int i = 1; i < 100; i +=10) {
            System.out.println(calculateInterest(1000, i));
        }
        for(int i = 8; i < 1; i +=10 ) {
            System.out.println(calculateInterest(1000, i));
        }

        sumOdd(10, 50);
        //do while loop
        executeLoop();
    }
    //days of the week challenge
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    //using if ... else if
    public static void printDaysOfTheWeekIf(int day){
        if(day == 0){
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day.");
        }
    }
    //Number in word challenge
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            System.out.println("Invalid year");
            return false;
        }
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
//            System.out.println("true");
            return true;
        }else{
//            System.out.println("false");
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1) || (month > 12) || (year < 1 || year > 9999)){
        return -1;
        }

        int daysOfTheMonth = 0;
        switch(month){
          case 1:
              daysOfTheMonth = 31;
              break;
          case 2:
              if(isLeapYear(year) == true){
                  daysOfTheMonth = 29;
              }else{
                  daysOfTheMonth = 28;
              }
              break;
            case 3:
                daysOfTheMonth = 31;
                break;
            case 4:
                daysOfTheMonth = 30;
                break;
            case 5:
                daysOfTheMonth = 31;
                break;
            case 6:
                daysOfTheMonth = 30;
                break;
            case 7:
                daysOfTheMonth = 31;
                break;
            case 8:
                daysOfTheMonth = 31;
                break;
            case 9:
                daysOfTheMonth = 30;
                break;
            case 10:
                daysOfTheMonth = 31;
                break;
            case 11:
                daysOfTheMonth = 30;
                break;
            case 12:
                daysOfTheMonth = 31;
                break;
            default:
                return -1;
        }
        System.out.println("The number of days in month "+ month +" in year " +year+ " is " + daysOfTheMonth);
    return daysOfTheMonth;
    }
    //for loop
    public static double calculateInterest(double amount, double interestRate){
        //for(init; termination; increment)
            return (amount * (interestRate / 100));
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }else{
            if(number % 2 != 0){
                return true;
            }
        }
//        System.out.println("false");
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > 0 && end > 0){
            for(int i=start; i<=end; i++){
                if(isOdd(i)){

                    sum += i;

                }
            }
            System.out.println("The number is "+sum);
            return sum;
        }else{
            return -1;
        }
    }
    public static void executeLoop(){
        int count = 1;
        do{
            System.out.println("The count is "+ count);
            count ++;
        }while(count != 6);
    }
}
