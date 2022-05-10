public class SIBTest {
    public static final String owner;
    static{
        owner ="irene";
        System.out.println("SIB block one called");
    }

    public SIBTest() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Static initialization block two called");
    }
    public void someMethod(){
        System.out.println("Some method called");
    }
}
