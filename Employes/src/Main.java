import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Doe", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red Ridinghood", 35);
        Employee charmming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jane);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charmming);

        Function<Employee, String> getLastname = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };
        String lastName = getLastname.apply(employees.get(3));
        System.out.println(lastName);

        // enhanced for loop
//        for(Employee employee : employees){
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName());
//            }
//        }
//        printEmployeesByAge(employees, "Employees older than 30", employee->employee.getAge() > 30);
//        printEmployeesByAge(employees, "\nEmployees 30 and younger", employee->employee.getAge() <= 30);
//        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge()<25;
//            }
//        });
//    }
//    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
//        System.out.println(ageText);
//        System.out.println("=========================");
//        for(Employee employee : employees){
//            if(ageCondition.test(employee)){
//                System.out.println(employee.getName());
//            }
//        }
    }
}
