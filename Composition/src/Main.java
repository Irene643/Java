public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 50, 5);
        Case theCase = new Case("220B", "Acer","240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(240, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);

        thePC.powerUp();
    }
}