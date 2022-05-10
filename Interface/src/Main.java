public class Main {
    public static void main(String[] args) {
        ITelephone timsTelephone;
        timsTelephone = new DeskPhone(23158);
        timsTelephone.powerOn();
        timsTelephone.callPhone(23158);
        timsTelephone.answer();


        timsTelephone = new MobilePhone(23158);
        timsTelephone.powerOn();
        timsTelephone.callPhone(23158);
        timsTelephone.answer();

    }
}
