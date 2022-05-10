import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","A compiled high level language");
        languages.put("Python","An interpreted OOP language");
        languages.put("BASIC","Beginners All Symbolic Instruction Code");
        languages.put("Python","An interpreted OOP language");
        languages.put("LISP","Prefer not to say anything");

        System.out.println(languages.get("Java"));

        //contains()
        //put()
        for(String key: languages.keySet()){
            System.out.println(key +" : " +languages.get(key));
        }
    }
}
