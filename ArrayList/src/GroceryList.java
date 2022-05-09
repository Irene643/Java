import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+ " items in the grocery list,");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". "+groceryList.get(i));
        }
        //other functions include .remove(), contains(), IndexOf()
    }
}
