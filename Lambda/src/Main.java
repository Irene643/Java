import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();


        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Doe", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jane);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

//        for(Employee employee : employees) {
//            System.out.println(employee.getName());
//            new Thread(()-> System.out.println(employee.getAge())).start();
//        }

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() +  s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
    public void printValue(){
        int number = 25;

        Runnable r = () -> {
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("The value is "+number);
        };
        new Thread(r).start();
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}






