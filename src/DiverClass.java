public class DiverClass {

    public static void main(String[] args) {
        Srk srk = new Srk();
        srk.heading();
        srk.showAccountDetail();
        srk.deposit();
        srk.withDraw();
        srk.showBal();
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<----------------------------------------------->>>>>>>>>>>>>>>>");
        System.out.println();
        Dhoni dhoni = new Dhoni();
        dhoni.heading();
        dhoni.showAccountDetail();
        dhoni.deposit();
        dhoni.withDraw();
        dhoni.showBal();

    }
}
