public class ScopeCheck {
    public int publicVar = 0;
    private  int var1 =1;

    public ScopeCheck(){
        System.out.println("Scopecheck created, publicVar = "+publicVar+" and privateVar = "+ var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo(){
        int var2 = 2;
        for(int i=0; i<10; i++){
            System.out.println(i+ " times two is "+i*var2);
        }
    }
    public class InnerClass {
        int var3 = 3;
        public InnerClass() {
            System.out.println("Inner class created private var is "+ var3);
        }
        public void timesTwo(){
//            int privateVar = 2;
            for(int i=0; i<10; i++){
                //var 1 is still available here
                System.out.println(i+ " times two is "+i* var3 +" and var 1 is "+var1);
            }
        }
    }
}
