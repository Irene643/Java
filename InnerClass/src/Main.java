import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
//        GearBox mclauren = new GearBox(6);
//        GearBox.Gear first = mclauren.new Gear(4, 1.5);
//
//        System.out.println(first.driveSpeed(45));
        //Local class
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I have been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+ " was clicked.");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        //Anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(String title) {
                System.out.println(title+ " was clicked.");
            }
        });
        listen();
    }
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
