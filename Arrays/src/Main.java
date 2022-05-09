public class Main {
    public static void main(String[] args) {
        //initializing and int array
        int[] myIntArray = new int[10];
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9};

        //initializing array with elements of type double
        double[] myDoubleArray = new double[7];

        //Adding elements into array
        //myIntArray[5] = 50;

        //Accessing array elements
        System.out.println(myIntArray[8]);
        printArray(myIntArray);
    }
    //Adding elements into an array using for loop
    private static void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            array[i] = i*5;
            System.out.println("Array element "+ i + " has value "+array[i]);
        }
    }
}