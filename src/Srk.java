public class Srk extends AbstractBank implements bankWork{
    @Override
    public void showAccountDetail() {
        System.out.println("Name - ShahRukh Khan");
        System.out.println("age - 45");
        System.out.println("lives in band Stand");
    }



    @Override
    public void heading() {
        super.heading();
    }

    @Override
    public void deposit() {
        System.out.println("Deposited Amount - " + 40000);
    }

    @Override
    public void withDraw() {
        System.out.println("Withdraw amount - "+ 4000);
    }

    @Override
    public void showBal() {
        System.out.println("remaining bal - " + 36000);
    }
}
