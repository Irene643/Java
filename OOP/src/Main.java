public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Car porsche = new Car();
        porsche.setModel("Carrera");

        System.out.println("Model is "+ porsche.getModel());


        Account bobsAccount = new Account("12334", "07983677", "bob@gmail.com", 200.00);
        bobsAccount.deposit(100.00);
        bobsAccount.withdrawal(50.00);

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 5, 5, 1, 4, 1, 20, "silky white");
        dog.walk(5);
        dog.move();

    }
}