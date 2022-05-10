public class SpeedConverter {
//    var kilometersPerHour;
    public static long toMilesPerHour(double kilometersPerHour){
    //1 mile/h = 1.609kilometer/h
        if(kilometersPerHour < 0){
           return -1;
        }else{
             return Math.round(kilometersPerHour/ 1.609);
        }
    }


    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }

    }
}
