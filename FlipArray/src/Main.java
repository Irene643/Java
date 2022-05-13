import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] myArray = {"bananas", "tomatoes", "oranges"};

        System.out.println(Arrays.toString(myArray));

       int maxIndex = myArray.length-1;
        for(int i=0; i< myArray.length/2; i++){
            try{
                String temp = myArray[i];
                myArray[i] = myArray[maxIndex-i];
                myArray[maxIndex-i] = temp;
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }
//        System.out.println(maxIndex);

//        Collections.reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
