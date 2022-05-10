import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Integer integer = new Integer(45);
//        Double doubleValue = new Double(34.23);
//
//        String stringValue = integer.toString();
//        System.out.println(stringValue);

        //autoboxing
        ArrayList<Integer> intArrayList = new ArrayList<>();

        for(int i=0; i<=10; i++){
            intArrayList.add(i);//intArrayList.add(Integer.valueOf(i));
        }
        System.out.println(intArrayList);
        //unboxing
        for(int i=10; i>10; i++){
            System.out.println(i+" --> "+intArrayList.get(i));
        }

        Integer myIntValue = 56; //Integer.valueOf(56)
        int myInt = myIntValue; //myIntValue.intValue()

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl=20.0; dbl<=50.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i=0; i<=30;i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+ " --> " +value);
        }
    }
}
