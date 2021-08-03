public class Dhoni extends AbstractBank implements bankWork{
    @Override
    public void showAccountDetail() {
        System.out.println("Name - MS Dhoni Khan");
        System.out.println("age - 39");
        System.out.println("lives in Ring road, ranchi");
    }


    @Override
    public void heading() {
        super.heading();
    }

    @Override
    public void deposit() {
        System.out.println("Deposited Amount - " + 140000);
    }

    @Override
    public void withDraw() {
        System.out.println("Withdraw amount - "+ 14000);
    }

    @Override
    public void showBal() {
        System.out.println("remaining bal - " + 136000);
    }
}
