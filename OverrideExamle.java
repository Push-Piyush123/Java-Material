// polymorphism by overriding 
class Bank {
    void interestRate(){
        System.out.println("General bank interest rate is 5%");
    }
}
class SBI extends Bank {
    void interestRate(){
        super.interestRate();
        System.out.println("SBI bank interest rate is 6.5%");
    }
}
class HDFC extends Bank {
    void interestRate(){
        super.interestRate();
        System.out.println("HDFC bank interest rate is 7%");
    }
}
public class OverrideExamle {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interestRate();
        HDFC hdfc = new HDFC();
        hdfc.interestRate();
    }
}
