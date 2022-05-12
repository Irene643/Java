import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting iin front of your computer"));
        locations.put(1, new Location(1, "You are standing at the end of a road"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building"));
        locations.put(4, new Location(4, "You are in a valley"));
        locations.put(5, new Location(5, "You are beside a stream"));

        locations.get(1).addExits("W", 2);
        locations.get(1).addExits("E", 3);
        locations.get(1).addExits("S", 4);
        locations.get(1).addExits("N", 5);
        locations.get(1).addExits("Q", 0);

        locations.get(2).addExits("N", 5);
        locations.get(2).addExits("Q", 0);

        locations.get(3).addExits("W", 1);
        locations.get(3).addExits("Q", 0);

        locations.get(4).addExits("N", 1);
        locations.get(4).addExits("W", 2);
        locations.get(4).addExits("Q", 0);

        locations.get(5).addExits("S", 1);
        locations.get(5).addExits("W", 2);
        locations.get(5).addExits("Q", 0);
        /* defining immutable objects
        do not allow classes to be subclassed
        do not expose the constructor, create a new instance of the class instead
        use getters and setters on ly when necessary
        define variables as private static final */

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit +", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
