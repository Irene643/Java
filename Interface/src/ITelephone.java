public interface ITelephone {

    //access modifiers not required
    void powerOn();
   void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
