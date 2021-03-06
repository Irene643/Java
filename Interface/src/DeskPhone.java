public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " +phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
