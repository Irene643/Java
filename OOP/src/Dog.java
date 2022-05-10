public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void move() {
        System.out.println("override method called");
        super.move();
    }

    public void walk(int speed){
        System.out.println("walk called. The dog moves at "+speed+" m/s.");
    }

}
