import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", 12.50);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(23.65);
        System.out.println("The balance for "+ customer.getName()+" is "+ customer.getBalance());

        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        
        printList(placesToVisit);

        placesToVisit.add(3, "Capes");
        printList(placesToVisit);

        placesToVisit.remove(5);
        printList(placesToVisit);

        addInOrder(placesToVisit, "Algiers");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("---------------------------");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                System.out.println(newCity+ " has already been added as a destination");
                return false;
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                stringListIterator.add(newCity);
                return true;
            }
        }

        return true;
    }
    //other methods .getFirst(), .isEmpty(),
}
