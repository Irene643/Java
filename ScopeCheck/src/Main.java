public class Main {
    public static void main(String[] args) {
        String var4 = "this is private var in the main class";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance var4 is "+scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();
        System.out.println("Inner class output below");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
